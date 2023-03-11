package com.knownsense.springnativevault;

import org.springframework.aot.hint.*;


public class VaultRuntimeHints implements RuntimeHintsRegistrar {
    @Override
    public void registerHints(org.springframework.aot.hint.RuntimeHints hints, ClassLoader classLoader) {
        hints.reflection().registerType(TypeReference.of("org.springframework.cloud.vault.config.VaultHealthIndicator"), builder -> builder.withMembers(MemberCategory.INVOKE_DECLARED_CONSTRUCTORS));
    }
}



