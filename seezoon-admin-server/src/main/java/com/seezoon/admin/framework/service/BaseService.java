package com.seezoon.admin.framework.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;

/**
 * @author hdf
 */
@Validated
public abstract class BaseService {

    /**
     * 提供日志对象
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

}
