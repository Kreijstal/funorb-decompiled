/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static String field_h;
    static String field_e;
    static IndexedSprite[] activeStructureSprites;
    static CampaignMission activeCampaignMission;
    static String field_g;
    static PcmPlayer musicPlayer;
    static String field_d;
    static String field_f;

    final static QuickChatMenu buildQuickChatCategoryMenu(QuickChatCategory category, ClientUiComponent param1, int obfuscationGuard, ClientUiComponent param3, ClientUiComponent param4) {
        int var14 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        QuickChatMenu stackIn_28_0 = null;
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
        QuickChatMenu[] var11 = null;
        int var12 = 0;
        QuickChatCategory var13_ref_va = null;
        int var13 = 0;
        int var15 = 0;
        QuickChatPhrase var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int var12Lifetime1;
        var17 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (category == null) {
            return null;
          }
          if (category.subcategoryIds == null) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = category.subcategoryIds.length;
          }
          var5_int = stackIn_7_0;
          if (null == category.phraseIds) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = category.phraseIds.length;
          }
          var6 = stackIn_10_0;
          var7 = var6 + var5_int;
          var8 = new String[var7];
          var21 = new char[var7];
          var19 = var21;
          var9 = var19;
          if (obfuscationGuard != 0) {
            field_g = (String) null;
          }
          var20 = new int[var7];
          var18 = var20;
          var10 = var18;
          var11 = new QuickChatMenu[var7];
          if (null != category.subcategoryIds) {
            for (var12 = 0; var12 < category.subcategoryIds.length; var12++) {
              var13_ref_va = SocialListPanel.quickChatCategories.getCategory(category.subcategoryIds[var12], true);
              var8[var12] = var13_ref_va.title;
              var9[var12] = category.subcategoryShortcuts[var12];
              var11[var12] = l.buildQuickChatCategoryMenu(var13_ref_va, param1, 0, param3, param4);
            }
          }
          if (category.phraseIds != null) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; category.phraseIds.length > var14; var14++) {
              var15 = category.phraseIds[var14];
              if (var15 != -1) {
                var16 = ce.quickChatPhrases.getPhrase(var15, 98);
                var8[var12Lifetime1 + var14] = var16.getPreviewText((byte) 97);
                var9[var14 + var12Lifetime1] = category.phraseShortcuts[var14];
                if (var9[var12Lifetime1 + var14] <= 0) {
                  var13 = (char)(var13 + 1);
                  var9[var12Lifetime1 + var14] = (char)var13;
                }
                var10[var14 + var12Lifetime1] = category.phraseIds[var14];
              } else {
                var8[var14 + var12Lifetime1] = GameEvent.quickChatHelpTitle;
                var9[var12Lifetime1 + var14] = category.phraseShortcuts[var14];
                var10[var14 + var12Lifetime1] = category.phraseIds[var14];
              }
            }
          }
          stackIn_28_0 = new QuickChatMenu(0L, param4, param1, param3, var11, var20, var8, var21);
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("l.A(");
          if (category == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(obfuscationGuard).append(',');
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_g = null;
        musicPlayer = null;
        field_e = null;
        field_h = null;
        field_f = null;
        field_d = null;
        activeStructureSprites = null;
        activeCampaignMission = null;
    }

    static {
        field_g = "Results";
        field_e = "Equipment Store";
        field_h = "You do not have a suitable number of players for the current options.";
        field_f = "Play rated game";
        field_d = "Message team";
    }
}
