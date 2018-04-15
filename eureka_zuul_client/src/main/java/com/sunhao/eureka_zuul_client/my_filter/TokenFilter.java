package com.sunhao.eureka_zuul_client.my_filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

@Component
public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
//        RequestContext context = RequestContext.getCurrentContext();
//        HttpServletRequest request = context.getRequest();
//        String name = request.getParameter("name");
//        if (name == null || name.isEmpty()) {
//            return true;
//        } else if ("sunhao".equals(name)){
//            return true;
//        } else {
//            //在这里返回false之后不执行run方法，如果zuul有熔断器的话直接执行快速失败
//            return false;
//        }

        return true;
    }

    @Override
    public Object run() {
//        RequestContext context = RequestContext.getCurrentContext();
//        HttpServletRequest request = context.getRequest();
//        try {
//            request.setCharacterEncoding("utf-8");
//        } catch (UnsupportedEncodingException e) {
//            return null;
//        }
//        String token = request.getParameter("token");
//        if (token == null || token.isEmpty()) {
//            context.setSendZuulResponse(false);
//            context.setResponseStatusCode(401);
//
//            try {
//                context.getResponse().getWriter().write("token 不能为空！");
//            } catch (IOException e) {
//                return null;
//            }
//        }
        return null;
    }
}
