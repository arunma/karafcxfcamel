package me.rerun.karafcxfcamel.rest;

import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestRunCamel extends CamelBlueprintTestSupport {

        private static final Logger logger= LoggerFactory.getLogger(TestRunCamel.class);

        //@Test
        public void testTimer(){
            try {
                logger.info("hello world");
                Thread.sleep(10000);


            } catch (InterruptedException e) {
                logger.error(e.getMessage(), e);
            }

        }

        @Override
        protected String getBlueprintDescriptor() {
            return "OSGI-INF/blueprint/rest-blueprint.xml";


        }

}
