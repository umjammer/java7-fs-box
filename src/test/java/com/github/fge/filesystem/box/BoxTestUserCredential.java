/*
 * Copyright (c) 2020 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package com.github.fge.filesystem.box;

import vavi.net.auth.BaseLocalUserCredential;
import vavi.util.properties.annotation.Env;
import vavi.util.properties.annotation.PropsEntity;


/**
 * DropBoxTestUserCredential.
 * <p>
 * environment variable
 * <ul>
 * <li> TEST_PASSWORD
 * </ul>
 *
 * @author <a href="mailto:umjammer@gmail.com">Naohide Sano</a> (umjammer)
 * @version 0.00 2020/05/02 umjammer initial version <br>
 */
@PropsEntity
public class BoxTestUserCredential extends BaseLocalUserCredential {

    /** */
    @Env(name = "TEST_PASSWORD")
    private transient String password;

    /**
     * @param email
     */
    public BoxTestUserCredential(String email) {
        super(email);
    }

    /* */
    public String getPassword() {
        return password;
    }
}

/* */
