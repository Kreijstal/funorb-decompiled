/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatMenuBuilder {
    static String[][] field_b;
    static String field_c;
    static String field_d;
    static String field_a;
    static UiLayoutNode field_e;
    static String field_f;

    final static CascadingMenu buildCategoryMenu(int param0, QuickChatCategory param1, UiLayoutNode param2, UiLayoutNode param3, UiLayoutNode param4) {
        int var14 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        CascadingMenu stackIn_12_0 = null;
        CascadingMenu stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        CascadingMenu[] var11 = null;
        int var12 = 0;
        QuickChatCategory var13_ref_tc = null;
        int var13 = 0;
        int var15 = 0;
        QuickChatPhraseDefinition var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int var12Lifetime1;
        var17 = Kickabout.field_G;
        try {
          if (param1 == null) {
            return null;
          }
          if (param1.subcategoryIds != null) {
            stackIn_7_0 = param1.subcategoryIds.length;
          } else {
            stackIn_7_0 = 0;
          }
          var5_int = stackIn_7_0;
          if (param1.phraseIds != null) {
            stackIn_10_0 = param1.phraseIds.length;
          } else {
            stackIn_10_0 = 0;
          }
          var6 = stackIn_10_0;
          var7 = var5_int + var6;
          var8 = new String[var7];
          var21 = new char[var7];
          var19 = var21;
          var9 = var19;
          var20 = new int[var7];
          var18 = var20;
          var10 = var18;
          var11 = new CascadingMenu[var7];
          if (param0 != 0) {
            stackIn_12_0 = (CascadingMenu) null;
            return stackIn_12_0;
          }
          if (param1.subcategoryIds != null) {
            for (var12 = 0; var12 < param1.subcategoryIds.length; var12++) {
              var13_ref_tc = ReceivedAuctionItem.field_x.getCategory(200, param1.subcategoryIds[var12]);
              var8[var12] = var13_ref_tc.description;
              var9[var12] = param1.subcategoryShortcuts[var12];
              var11[var12] = QuickChatMenuBuilder.buildCategoryMenu(0, var13_ref_tc, param2, param3, param4);
            }
          }
          if (null != param1.phraseIds) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; param1.phraseIds.length > var14; var14++) {
              var15 = param1.phraseIds[var14];
              if (var15 == -1) {
                var8[var14 + var12Lifetime1] = MatchTextInputOverlay.field_b;
                var9[var12Lifetime1 + var14] = param1.phraseShortcuts[var14];
                var10[var12Lifetime1 + var14] = param1.phraseIds[var14];
              } else {
                var16 = TournamentLobbyScreen.field_j.getPhrase(param0 ^ 6, var15);
                var8[var14 + var12Lifetime1] = var16.getDisplayText((byte) -105);
                var9[var14 + var12Lifetime1] = param1.phraseShortcuts[var14];
                if (var9[var12Lifetime1 + var14] <= 0) {
                  var13 = (char)(var13 + 1);
                  var9[var14 + var12Lifetime1] = (char)var13;
                }
                var10[var12Lifetime1 + var14] = param1.phraseIds[var14];
              }
            }
          }
          stackIn_28_0 = new CascadingMenu(0L, param3, param2, param4, var11, var20, var8, var21);
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("h.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param4 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final static ChatMessage getNewestChatMessage(int param0) {
        if (PitchDecorationSupport.field_j == 0) {
          return null;
        }
        if (param0 != 17475) {
          return (ChatMessage) null;
        }
        return GrowableIntList.field_b[-1 + PitchDecorationSupport.field_j];
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        field_b = (String[][]) null;
        field_e = null;
        field_f = null;
        field_d = null;
        if (param0) {
          field_d = (String) null;
        }
        field_c = null;
    }

    static {
        field_d = "Loading street";
        field_b = new String[][]{new String[]{"Field", "Park", "Gardens", "Stadium"}, new String[]{"Sandpit", "Beach", "Resort", "Arena"}, new String[]{"Roadside", "Car Park", "Court", "Amphitheatre"}};
        field_c = "Multiplayer Lobby";
        field_a = "<%0>: Hide Chat";
    }
}
