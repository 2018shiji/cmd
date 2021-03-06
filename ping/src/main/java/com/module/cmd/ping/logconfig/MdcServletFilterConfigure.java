package com.module.cmd.ping.logconfig;

import com.module.cmd.core.log.MdcServletFilter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(name = "org.springframework.web.servlet.DispatcherServlet")
public class MdcServletFilterConfigure {

    @Bean
    @ConditionalOnMissingBean(MdcServletFilter.class)
    public MdcServletFilter mdcFilter(){
        return new MdcServletFilter();
    }
}
