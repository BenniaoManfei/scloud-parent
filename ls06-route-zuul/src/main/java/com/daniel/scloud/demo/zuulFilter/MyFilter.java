
package com.daniel.scloud.demo.zuulFilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 自定义路由过滤策略
 *
 * @description 
 *
 * @author DaiZM
 * @create 2017/12/15
 * @since marketing-2.0
 *
 * @history:
 * <author>          <time>          <version>          <desc>
 * DaiZM             2017/12/15         marketing-2.0      created
 */
public class MyFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info("run(logged by DaiZM):<路由转发>【{} >>> {}】" ,request.getMethod(),request.getRequestURL().toString());

        Object token = request.getParameter("token");
        if(token==null) {
            logger.error("run(logged by DaiZM):<路由转发,token为空>【token is empty】");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("TOKEN IS EMPTY");
            } catch (IOException e) {
                logger.error("run(logged by DaiZM):<路由转发,token为空>【】",e );
            }
            return null;
        }
        
        logger.info("run(logged by DaiZM):<路由转发>【OK】" );
        
        return null;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }
}
