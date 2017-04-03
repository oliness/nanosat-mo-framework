/* ----------------------------------------------------------------------------
 * Copyright (C) 2015      European Space Agency
 *                         European Space Operations Centre
 *                         Darmstadt
 *                         Germany
 * ----------------------------------------------------------------------------
 * System                : ESA NanoSat MO Framework
 * ----------------------------------------------------------------------------
 * Licensed under the European Space Agency Public License, Version 2.0
 * You may not use this file except in compliance with the License.
 *
 * Except as expressly set forth in this License, the Software is provided to
 * You on an "as is" basis and without warranties of any kind, including without
 * limitation merchantability, fitness for a particular purpose, absence of
 * defects or errors, accuracy or non-infringement of intellectual property rights.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * ----------------------------------------------------------------------------
 */
package esa.mo.nmf.apps;

import esa.mo.nmf.SimpleMonitorAndControlAdapter;
import esa.mo.nmf.NanoSatMOFrameworkInterface;
import esa.mo.nmf.provider.NanoSatMOMonolithicSim;
import java.io.Serializable;
import org.ccsds.moims.mo.mal.structures.UInteger;
import org.ccsds.moims.mo.mc.structures.AttributeValue;

/**
 * This class provides a demo cli provider for generating Serial objects
 *
 */
public class DemoSerialObject {

    private final NanoSatMOFrameworkInterface nanoSatMOFramework = new NanoSatMOMonolithicSim(new MCAdapter());

    public DemoSerialObject() {
    }

    /**
     * Main command line entry point.
     *
     * @param args the command line arguments
     * @throws java.lang.Exception If there is an error
     */
    public static void main(final String args[]) throws Exception {
        DemoSerialObject demo = new DemoSerialObject();
    }

    public class MCAdapter extends SimpleMonitorAndControlAdapter {

        @Override
        public boolean actionArrivedSimple(String name, Serializable[] srlzbls, Long l) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Serializable onGetValueSimple(String name) {
            AttributeValue aval = new AttributeValue();
            aval.setValue(new UInteger(1234));
            return aval;
        }

        @Override
        public boolean onSetValueSimple(String name, Serializable srlzbl) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }


}