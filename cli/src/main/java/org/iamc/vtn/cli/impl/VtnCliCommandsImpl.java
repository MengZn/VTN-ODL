/*
 * Copyright © 2018 copyright IMAC,Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.iamc.vtn.cli.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.iamc.vtn.cli.api.VtnCliCommands;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VtnCliCommandsImpl implements VtnCliCommands {

    private static final Logger LOG = LoggerFactory.getLogger(VtnCliCommandsImpl.class);
    private final DataBroker dataBroker;

    public VtnCliCommandsImpl(final DataBroker db) {
        this.dataBroker = db;
        LOG.info("VtnCliCommandImpl initialized");
    }

    @Override
    public Object testCommand(Object testArgument) {
        return "This is a test implementation of test-command";
    }
}
