/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoadingScreenHelpers {
    static Sprite[] field_b;
    static String field_d;
    static UiComponent field_g;
    static Archive field_i;
    static AccountCreationForm field_a;
    static boolean field_f;
    static String field_e;
    int field_j;
    static String field_h;
    static String field_c;

    final static void clearTextPromptDialog(int param0) {
        BevelFrameSpriteFactory.field_b = null;
        if (param0 != 1731) {
          field_a = (AccountCreationForm) null;
        }
    }

    final static boolean shouldShowLoadingScreen(boolean param0) {
        if (param0) {
          UiComponent var2 = (UiComponent) null;
          LoadingScreenHelpers.openChatFilterMenu(48, (UiComponent) null, 6);
          if (GrowableIntList.field_a < 20) {
            return true;
          }
          if (!ScreenSwitchHelpers.haveRequiredClientStages(-19403)) {
            return true;
          }
          if (AudioPumpThread.field_a <= 0) {
            return false;
          }
          if (!ImageProducerRasterBuffer.alwaysTrue(0)) {
            return true;
          }
          return false;
        }
        if (GrowableIntList.field_a < 20) {
          return true;
        }
        if (!ScreenSwitchHelpers.haveRequiredClientStages(-19403)) {
          return true;
        }
        if (AudioPumpThread.field_a <= 0) {
          return false;
        }
        if (!ImageProducerRasterBuffer.alwaysTrue(0)) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        field_i = null;
        field_b = null;
        field_g = null;
        field_a = null;
        field_h = null;
        int var1 = -58 / ((-82 - param0) / 37);
    }

    final static void openChatFilterMenu(int param0, UiComponent param1, int param2) {
        PlayerContextMenu var8 = null;
        Sprite var9 = null;
        String var10 = null;
        PlayerContextMenu var11 = null;
        Sprite var12 = null;
        String var13 = null;
        PlayerContextMenu var14 = null;
        Sprite var15 = null;
        String var16 = null;
        PlayerContextMenu var17 = null;
        Sprite var18 = null;
        String var19 = null;
        PlayerContextMenu var20 = null;
        Sprite var21 = null;
        String var22 = null;
        PlayerContextMenu var23 = null;
        Sprite var24 = null;
        String var25 = null;
        PlayerContextMenu var26 = null;
        String var28 = null;
        PlayerContextMenu var29 = null;
        Sprite var30 = null;
        String var31 = null;
        PlayerContextMenu var32 = null;
        Sprite var33 = null;
        String var34 = null;
        PlayerContextMenu var35 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Sprite var27 = null;
        Sprite var27Lifetime1;
        Sprite var27Lifetime2;
        Sprite var27Lifetime3;
        Sprite var27Lifetime4;
        Sprite var27Lifetime5;
        Sprite var27Lifetime6;
        Sprite var27Lifetime7;
        Sprite var27Lifetime1Lifetime1;
        Sprite var27Lifetime1Lifetime2;
        Sprite var27Lifetime1Lifetime3;
        Sprite var27Lifetime1Lifetime4;
        Sprite var27Lifetime1Lifetime5;
        try {
          LobbyPlayerEntry.openPlayerContextMenu((String) null, 255, (String) null, param0, (ScrollPane) null, (int[]) null, (long)param2, param1, -1);
          if (param0 == 0) {
            var8 = EmailAvailabilityValidator.field_s;
            var9 = WeightedLruCache.field_n[0];
            var27 = var9;
            var27Lifetime3 = var9;
            var10 = QuickChatHelpDialog.field_Qb;
            var8.field_j.addIconAction(11, var9, 0, var10);
            var11 = EmailAvailabilityValidator.field_s;
            var12 = WeightedLruCache.field_n[1];
            var27Lifetime4 = var12;
            var27Lifetime5 = var12;
            var13 = GameClock.field_d;
            var11.field_j.addIconAction(12, var12, param2 ^ 0, var13);
            var14 = EmailAvailabilityValidator.field_s;
            var15 = WeightedLruCache.field_n[2];
            var27Lifetime6 = var15;
            var27Lifetime7 = var15;
            var16 = LoginCredentialType.field_b;
            var14.field_j.addIconAction(13, var15, 0, var16);
          }
          if (param0 == 1) {
            var17 = EmailAvailabilityValidator.field_s;
            var18 = WeightedLruCache.field_n[0];
            var27Lifetime1 = var18;
            var27Lifetime1Lifetime1 = var18;
            var19 = TwoColumnListPanel.field_Ob;
            var17.field_j.addIconAction(11, var18, param2 + 0, var19);
            var20 = EmailAvailabilityValidator.field_s;
            var21 = WeightedLruCache.field_n[1];
            var27Lifetime1Lifetime2 = var21;
            var27Lifetime1Lifetime3 = var21;
            var22 = ChatMessage.field_t;
            var20.field_j.addIconAction(12, var21, param2 ^ 0, var22);
            var23 = EmailAvailabilityValidator.field_s;
            var24 = WeightedLruCache.field_n[2];
            var27Lifetime1Lifetime4 = var24;
            var27Lifetime1Lifetime5 = var24;
            var25 = SpriteState.field_H;
            var23.field_j.addIconAction(13, var24, 0, var25);
          }
          if (param0 == 2) {
            var26 = EmailAvailabilityValidator.field_s;
            var27Lifetime2 = WeightedLruCache.field_n[0];
            var28 = CacheEntry.field_A;
            var26.field_j.addIconAction(11, var27Lifetime2, 0, var28);
            var29 = EmailAvailabilityValidator.field_s;
            var30 = WeightedLruCache.field_n[1];
            var31 = LoginMethod.field_a;
            var29.field_j.addIconAction(12, var30, param2 ^ 0, var31);
            var32 = EmailAvailabilityValidator.field_s;
            var33 = WeightedLruCache.field_n[2];
            var34 = IntrusiveNode.field_a;
            var32.field_j.addIconAction(13, var33, param2 + 0, var34);
          }
          var35 = EmailAvailabilityValidator.field_s;
          var4 = param1.field_eb;
          var5 = param1.field_z;
          var6 = param1.field_Hb;
          var7 = param1.field_R;
          var35.field_j.openAt(var6, var5, -127, var7, var4);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "rm.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Kick";
        field_f = true;
        field_d = "Please log in as a subscribing member to access this feature.";
        field_h = "start using this feature.";
        field_c = "Email (Login):";
    }
}
