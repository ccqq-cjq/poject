package utils;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;

public class WebUtils {
    public static void copyParamToBean(HttpServletRequest req, Object bean){
        try {
            System.out.println(bean);
            BeanUtils.populate(bean,req.getParameterMap());
            System.out.println(bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
