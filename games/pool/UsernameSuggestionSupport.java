/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameSuggestionSupport {
    static int field_d;
    static String removefriendfirst;
    static int field_a;
    static String muGameoptAcceptXIntoGame;
    static SceneNode field_e;
    static ResourceArchive field_g;
    static boolean[] field_b;

    final static void setNameSuggestions(int param0, String[] param1) {
        try {
          if (ArchiveProvider.field_c != null) {
            ArchiveProvider.field_c.suggestionsPanel.setSuggestions(false, param1);
          }
          if (null != ScoreboardNameRecord.field_a) {
            ScoreboardNameRecord.field_a.suggestionsPanel.setSuggestions(false, param1);
          }
          int var2_int = 25 % ((param0 + 8) / 53);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "gf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void attachQuickChatMenu(QuickChatMenu param0, int param1) {
        try {
          if (param1 != 0) {
            QuickChatMenu var3 = (QuickChatMenu) null;
            UsernameSuggestionSupport.attachQuickChatMenu((QuickChatMenu) null, 80);
          }
          ChoiceButtonSupport.field_a.addChild(param1 ^ -99, param0);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "gf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_g = null;
        field_e = null;
        if (param0) {
          field_b = null;
          removefriendfirst = null;
          muGameoptAcceptXIntoGame = null;
          return;
        }
        QuickChatMenu var2 = (QuickChatMenu) null;
        UsernameSuggestionSupport.attachQuickChatMenu((QuickChatMenu) null, 34);
        field_b = null;
        removefriendfirst = null;
        muGameoptAcceptXIntoGame = null;
    }

    final static SocialListEntry a(int param0, String param1) {
        String var2 = null;
        int var3 = 0;
        SocialListEntry var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        SocialListEntry stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (AimTarget.field_b == null) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (0 == param1.length()) {
            stackIn_6_0 = null;
            return (SocialListEntry) (stackIn_6_0);
          }
          var3 = 53 / ((-16 - param0) / 62);
          var6 = (CharSequence) ((Object) param1);
          var2 = TutorialController.normalizeDisplayName(83, var6);
          if (var2 == null) {
            stackIn_9_0 = null;
            return (SocialListEntry) (stackIn_9_0);
          }
          var4 = (SocialListEntry) (AimTarget.field_b.findFirst((long)var2.hashCode(), false));
          while (var4 != null) {
            var7 = (CharSequence) ((Object) var4.name);
            var5 = TutorialController.normalizeDisplayName(84, var7);
            if (var5.equals(var2)) {
              stackIn_16_0 = var4;
              return stackIn_16_0;
            }
            var4 = (SocialListEntry) (AimTarget.field_b.findNext(-127));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("gf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        removefriendfirst = "Please remove <%0> from your friend list first.";
        muGameoptAcceptXIntoGame = "Accept <%0> into this game";
    }
}
