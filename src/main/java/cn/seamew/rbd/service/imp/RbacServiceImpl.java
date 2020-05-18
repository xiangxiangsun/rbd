package cn.seamew.rbd.service.imp;

import cn.seamew.rbd.mapper.MenuMapper;
import cn.seamew.rbd.mapper.RoleMapper;
import cn.seamew.rbd.service.RbacService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;

/**
 * @author: sunxiangxiang
 * @data: 2020-05-17
 */

@Component("rbacService")
public class RbacServiceImpl implements RbacService {

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private MenuMapper menuMapper;

    //原示例代码
/*    @Override
    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
        Object principal = authentication.getPrincipal();
        boolean hasPermission = false;
        //首先判断当前用户是不是UserDetails对象
        if(principal instanceof UserDetails){
            String username = ((UserDetails)principal).getUsername();
            HashSet<String> urls = new HashSet<>();
            urls.add("/whoim");
            //注意这里不能用equals判断，因为有些URL是有参数的，所以要用AntPathMatcher来比较
            for (String url : urls){
                if (antPathMatcher.match(url,request.getRequestURI())){
                    hasPermission = true;
                    break;
                }
            }
        }
        return hasPermission;
    }*/

    @Override
    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
        Object principal = authentication.getPrincipal();
        boolean hasPermission = false;
        //首先判断当前用户是不是UserDetails对象
        if (principal instanceof UserDetails) {
            String username = ((UserDetails) principal).getUsername();
            HashSet<String> urls = new HashSet<>();
            //查询用户拥有的所有url
            Integer roleId = roleMapper.selectIdByName(username);
            HashSet<String> menuIds = roleMapper.selectAllMenuByRoleId(roleId);
            for (String menuId : menuIds) {
                urls.add("/" + menuMapper.selectUrlById(menuId));
            }
            urls.add("/whoim");
//        System.out.println(urls);
            //注意这里不能用equals判断，因为有些URL是有参数的，所以要用AntPathMatcher来比较
            for (String url : urls) {
                if (antPathMatcher.match(url, request.getRequestURI())) {
                    hasPermission = true;
                    break;
                }
            }
        }
        return hasPermission;
    }


}
