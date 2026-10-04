/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextTemplateLookupSupport {
    static String currentLoginIdentifier;
    static ArchiveLoadSequence bootstrapArchiveLoadSequence;

    final static void openLoginPanel(boolean allowJustPlay, boolean showCreateAccount, boolean methodGuard) {
        String unusedLoginMessage = (String) null;
        TextTemplateDefinition.showAccountLoginPanel(2274, (String) null, showCreateAccount, allowJustPlay);
        if (methodGuard) {
            TextTemplateLookupSupport.openLoginPanel(true, false, true);
        }
    }

    public static void releaseTemplateLookupState(int methodGuard) {
        if (methodGuard != 17062) {
            return;
        }
        currentLoginIdentifier = null;
        bootstrapArchiveLoadSequence = null;
    }

    final static TextTemplateArgumentType findTextTemplateArgumentType(boolean methodGuard, int typeId) {
        TextTemplateArgumentType[] argumentTypes;
        int argumentTypeIndex;
        int unusedClientControlFlowSnapshot;
        unusedClientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        argumentTypes = GzipInflater.textTemplateArgumentTypes(-1);
        argumentTypeIndex = 0;
        if (methodGuard) {
          TextTemplateLookupSupport.releaseTemplateLookupState(-38);
        }
        while (argumentTypeIndex < argumentTypes.length) {
          if (typeId == argumentTypes[argumentTypeIndex].typeId) {
            return argumentTypes[argumentTypeIndex];
          }
          argumentTypeIndex++;
        }
        return null;
    }

    static {
    }
}
