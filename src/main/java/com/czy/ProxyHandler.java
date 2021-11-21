package com.czy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * The <code>com.czy.ProxyHandler</code> class have to be described
 *
 * <p>
 * The <code>ProxyHandler</code> class have to be detailed For example:
 * <p>
 *
 * @author czy
 * @date 2021/7/7 10:43
 * @see
 * @since 1.0
 */
public class ProxyHandler implements InvocationHandler {
    private Object object;

    public ProxyHandler(Object o){
        this.object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke--"+method.getName());
        method.invoke(object,args);
        System.out.println("after invoke--"+method.getName());
        return null;
    }
}
