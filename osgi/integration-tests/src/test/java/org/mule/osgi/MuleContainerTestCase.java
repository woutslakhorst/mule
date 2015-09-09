/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.osgi;

import javax.inject.Inject;

import org.junit.Test;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class MuleContainerTestCase extends AbstractOsgiTestCase
{

    @Inject
    private BundleContext bundleContext;

    @Test
    public void startsContainer() throws Exception
    {
        for (Bundle bundle : bundleContext.getBundles())
        {
            System.out.println("BUNDLE: " + bundle.getBundleId() + " " + bundle.getSymbolicName() + " version: " + bundle.getVersion());
        }
    }
}
