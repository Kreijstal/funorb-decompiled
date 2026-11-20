/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatHelpEntrySetup {
    final static void configureHelpEntry(QuickChatCategoryDefinition param0, byte param1) {
        if (param1 != -111) {
          return;
        }
        try {
          param0.phraseShortcuts = new char[]{(char)63};
          param0.phraseIds = new int[]{-1};
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "jka.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
