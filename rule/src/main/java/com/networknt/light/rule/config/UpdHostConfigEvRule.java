package com.networknt.light.rule.config;

import com.networknt.light.rule.Rule;

/**
 * Created by steve on 28/02/16.
 */
public class UpdHostConfigEvRule extends AbstractConfigRule implements Rule {
    public boolean execute (Object ...objects) throws Exception {
        return updHostConfigEv(objects);
    }
}
