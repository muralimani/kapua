/*******************************************************************************
 * Copyright (c) 2018 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.job.engine.jbatch.exception;

import org.eclipse.kapua.KapuaException;

public class StopJobEngineException extends KapuaException {

    protected StopJobEngineException(KapuaJobEngineErrorCodes code) {
        super(code);
    }

    protected StopJobEngineException(KapuaJobEngineErrorCodes code, Object... arguments) {
        super(code, arguments);
    }

    protected StopJobEngineException(KapuaJobEngineErrorCodes code, Throwable cause, Object... arguments) {
        super(code, cause, arguments);
    }

}
