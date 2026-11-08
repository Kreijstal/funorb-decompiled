/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayModeSupport {
    static String field_c;
    static boolean field_e;
    static UiLayoutNode field_b;
    static CheckboxLabelWidget field_a;
    static String field_d;

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 > -62) {
          field_d = (String) null;
        }
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static void openChatFilterMenu(UiLayoutNode param0, boolean param1, int param2) {
        PlayerContextMenu var9 = null;
        Sprite var11 = null;
        String var10 = null;
        PlayerContextMenu var12 = null;
        Sprite var14 = null;
        String var13 = null;
        PlayerContextMenu var15 = null;
        Sprite var17 = null;
        String var16 = null;
        PlayerContextMenu var18 = null;
        Sprite var20 = null;
        String var19 = null;
        PlayerContextMenu var21 = null;
        Sprite var23 = null;
        String var22 = null;
        PlayerContextMenu var24 = null;
        Sprite var26 = null;
        String var25 = null;
        PlayerContextMenu var27 = null;
        String var28 = null;
        PlayerContextMenu var30 = null;
        Sprite var32 = null;
        String var31 = null;
        PlayerContextMenu var33 = null;
        Sprite var35 = null;
        String var34 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Sprite var29 = null;
        Sprite var29Lifetime1;
        Sprite var29Lifetime2;
        Sprite var29Lifetime3;
        Sprite var29Lifetime4;
        Sprite var29Lifetime5;
        Sprite var29Lifetime6;
        Sprite var29Lifetime7;
        Sprite var29Lifetime1Lifetime1;
        Sprite var29Lifetime1Lifetime2;
        Sprite var29Lifetime1Lifetime3;
        Sprite var29Lifetime1Lifetime4;
        Sprite var29Lifetime1Lifetime5;
        BytePlusOneCommand.createPlayerContextMenu(param0, false, (ScrollPane) null, param2, (String) null, (int[]) null, 0L, (String) null, -1);
        if (param2 == 0) {
          var9 = TextButton.field_v;
          var11 = ClassDescriptorSupport.field_d[0];
          var29 = var11;
          var29Lifetime3 = var11;
          var10 = MatchHudSupport.field_b;
          var9.field_j.addItemWithIcon(var10, param1, 11, var11);
          var12 = TextButton.field_v;
          var14 = ClassDescriptorSupport.field_d[1];
          var29Lifetime4 = var14;
          var29Lifetime5 = var14;
          var13 = IntValueNode.field_h;
          var12.field_j.addItemWithIcon(var13, param1, 12, var14);
          var15 = TextButton.field_v;
          var17 = ClassDescriptorSupport.field_d[2];
          var29Lifetime6 = var17;
          var29Lifetime7 = var17;
          var16 = ConsoleParseException.field_a;
          var15.field_j.addItemWithIcon(var16, true, 13, var17);
        }
        if (param2 == 1) {
          var18 = TextButton.field_v;
          var20 = ClassDescriptorSupport.field_d[0];
          var29Lifetime1 = var20;
          var29Lifetime1Lifetime1 = var20;
          var19 = AnimationFrameset.field_p;
          var18.field_j.addItemWithIcon(var19, true, 11, var20);
          var21 = TextButton.field_v;
          var23 = ClassDescriptorSupport.field_d[1];
          var29Lifetime1Lifetime2 = var23;
          var29Lifetime1Lifetime3 = var23;
          var22 = QuickChatKeysHelpPanel.field_Bb;
          var21.field_j.addItemWithIcon(var22, true, 12, var23);
          var24 = TextButton.field_v;
          var26 = ClassDescriptorSupport.field_d[2];
          var29Lifetime1Lifetime4 = var26;
          var29Lifetime1Lifetime5 = var26;
          var25 = KitStyleDefinition.field_a;
          var24.field_j.addItemWithIcon(var25, param1, 13, var26);
        }
        if (param2 == 2) {
          var27 = TextButton.field_v;
          var29Lifetime2 = ClassDescriptorSupport.field_d[0];
          var28 = ValidationIndicator.field_I;
          var27.field_j.addItemWithIcon(var28, param1, 11, var29Lifetime2);
          var30 = TextButton.field_v;
          var32 = ClassDescriptorSupport.field_d[1];
          var31 = SharedSpriteTables.field_c;
          var30.field_j.addItemWithIcon(var31, param1, 12, var32);
          var33 = TextButton.field_v;
          var35 = ClassDescriptorSupport.field_d[2];
          var34 = TextWidgetPainter.field_g;
          var33.field_j.addItemWithIcon(var34, true, 13, var35);
        }
        PlayerContextMenu var36 = TextButton.field_v;
        int var4 = param0.field_F;
        if (!param1) {
          return;
        }
        try {
          var5 = param0.field_T;
          var6 = param0.field_q;
          var7 = param0.field_mb;
          var36.field_j.layoutItems(0, var6, var4, var5, var7);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "kr.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String formatLobbyPlayerStatus(String param0, int param1, byte param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_32_0 = null;
        String stackIn_35_0 = null;
        String stackIn_38_0 = null;
        String stackIn_42_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 == 1) {
            stackIn_3_0 = LoginDialog.substitutePlaceholders(-18, ShopPlayerSlot.field_Kb, new String[]{param0});
            return stackIn_3_0;
          }
          if (param1 == 2) {
            stackIn_6_0 = LoginDialog.substitutePlaceholders(-18, ConsoleCommand.field_r, new String[]{param0});
            return stackIn_6_0;
          }
          if (param1 == 3) {
            stackIn_10_0 = LoginDialog.substitutePlaceholders(-18, StrongCacheEntry.field_E, new String[]{param0});
            return stackIn_10_0;
          }
          if (param1 == 4) {
            stackIn_14_0 = LoginDialog.substitutePlaceholders(-18, MusicTrackMixer.field_m, new String[]{param0});
            return stackIn_14_0;
          }
          if (param1 == 5) {
            stackIn_18_0 = LoginDialog.substitutePlaceholders(-18, GameSetupPanel.field_lc, new String[]{param0});
            return stackIn_18_0;
          }
          if (param1 == 6) {
            stackIn_22_0 = LoginDialog.substitutePlaceholders(-18, GzipDecoder.field_c, new String[]{param0});
            return stackIn_22_0;
          }
          if (param1 == 7) {
            stackIn_25_0 = LoginDialog.substitutePlaceholders(-18, WhirlpoolHasher.field_b, new String[]{param0});
            return stackIn_25_0;
          }
          if (param1 == 8) {
            stackIn_28_0 = LoginDialog.substitutePlaceholders(-18, CachedListingRow.field_e, new String[]{param0});
            return stackIn_28_0;
          }
          if (param1 == 11) {
            stackIn_32_0 = LoginDialog.substitutePlaceholders(-18, RankingRowNode.field_Cb, new String[]{param0});
            return stackIn_32_0;
          }
          if (param1 == 12) {
            stackIn_35_0 = LoginDialog.substitutePlaceholders(-18, SortCriterion.field_e, new String[]{param0});
            return stackIn_35_0;
          }
          if (param2 != 73) {
            stackIn_38_0 = (String) null;
            return stackIn_38_0;
          }
          if (13 != param1) {
            return null;
          }
          stackIn_42_0 = LoginDialog.substitutePlaceholders(-18, TutorialMessages.field_g, new String[]{param0});
          return stackIn_42_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_46_0 = var3;
          stackIn_46_1 = new StringBuilder().append("kr.E(");
          if (param0 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static String concatenate(CharSequence[] param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_4_0 = SquadGridWidget.joinCharSequences(param0.length, param0, 99, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("kr.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static FullscreenDisplayMode[] enumerateFullscreenModes(byte param0, PlatformTaskDispatcher param1) {
        int var5 = 0;
        FullscreenDisplayMode[] stackIn_4_0 = null;
        FullscreenDisplayMode[] stackIn_10_0 = null;
        FullscreenDisplayMode[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        FullscreenDisplayMode[] var4 = null;
        FullscreenDisplayMode var6 = null;
        int var7 = 0;
        PlatformTask var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = Kickabout.field_G;
        try {
          if (!param1.hasFullscreenSupport(82)) {
            stackIn_4_0 = new FullscreenDisplayMode[]{};
            return stackIn_4_0;
          }
          var8 = param1.requestDisplayModes(true);
          while (var8.field_a == 0) {
            ThreadSleepSupport.sleepMillis(10L, 1);
          }
          if (2 == var8.field_a) {
            stackIn_10_0 = new FullscreenDisplayMode[]{};
            return stackIn_10_0;
          }
          if (param0 < 122) {
            field_b = (UiLayoutNode) null;
          }
          var10 = (int[]) (var8.field_b);
          var9 = var10;
          var3 = var9;
          var4 = new FullscreenDisplayMode[var10.length >> 2];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new FullscreenDisplayMode();
            var4[var5] = var6;
            var6.width = var3[var5 << 2];
            var6.height = var3[1 + (var5 << 2)];
            var6.bitDepth = var3[(var5 << 2) + 2];
            var6.refreshRate = var3[3 + (var5 << 2)];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("kr.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_c = "Diamond";
        field_d = "Inverse centre";
    }
}
