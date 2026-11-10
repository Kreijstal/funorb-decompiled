/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClockAndScreenHelpers {
    static String field_f;
    static boolean field_h;
    static String field_d;
    static String field_b;
    static String field_e;
    static int field_c;
    static int field_a;
    static IndexedSprite field_g;

    public static void releaseStatics(int param0) {
        field_e = null;
        field_d = null;
        if (param0 != 0) {
          ClockAndScreenHelpers.switchToRequestedScreen(-38);
        }
        field_b = null;
        field_g = null;
        field_f = null;
    }

    final static int getMenuWidth(int param0) {
        if (param0 >= -38) {
          return -76;
        }
        return RandomAccessCacheFile.field_e - IntrusiveDequeCursor.field_i;
    }

    final static Sprite loadSprite(byte param0, int param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Sprite stackIn_5_0 = null;
        Sprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!DialSelectorWidget.loadSpriteSheet(param1, param2, param3, (byte) -42)) {
            stackIn_2_0 = null;
            return (Sprite) (stackIn_2_0);
          }
          if (param0 == 50) {
            stackIn_7_0 = UsernameSuggestionsPanel.buildFirstDecodedSprite(15);
            return stackIn_7_0;
          }
          stackIn_5_0 = (Sprite) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("bl.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized static long monotonicMillis(byte param0) {
        long var1 = System.currentTimeMillis();
        if (param0 < 38) {
          return 127L;
        }
        if (var1 < LinkButtonPainter.field_e) {
          MenuFrameHelpers.field_b = MenuFrameHelpers.field_b + (-var1 + LinkButtonPainter.field_e);
        }
        LinkButtonPainter.field_e = var1;
        return MenuFrameHelpers.field_b + var1;
    }

    final static void switchToRequestedScreen(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int[] var1Lifetime1;
        int var2Lifetime1;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (ArrayWidgetGroup.field_I == CachedTextLayout.field_g) {
            return;
          }
          if (PasswordCheckHelpers.isNonNegative((byte) 53, ArrayWidgetGroup.field_I)) {
            NoticeMenuHelpers.lookupMenuScreen(2, ArrayWidgetGroup.field_I).onExit((byte) 69);
          }
          NoticeMenuHelpers.field_b = 0;
          if (param0 != -9) {
            return;
          }
          ArrayWidgetGroup.field_I = CachedTextLayout.field_g;
          if (AccountTextGlobals.field_e) {
            AudioServiceHelpers.field_h = null;
            MenuInputState.field_b = false;
            DisplayNamePanel.field_K = false;
            FadingDialog.field_I = false;
            AccountTextGlobals.field_e = false;
            MeshMaterial.field_e = null;
            UnitMoveEvent.field_m = null;
            UsernameCredentials.field_n = false;
          }
          if (MeltdownPuddleView.field_l) {
            var9 = PacketBuffer.field_n;
            var7 = var9;
            var4 = var7;
            var1 = var4;
            for (var2 = 0; var2 < 8; var2++) {
              var9[var2] = 0;
            }
            var10 = LevelData.field_m;
            var8 = var10;
            var5 = var8;
            var1Lifetime1 = var5;
            var6 = 0;
            var2Lifetime1 = var6;
            while (var6 < 8) {
              var10[var6] = 0;
              var6++;
            }
            MeltdownPuddleView.field_l = false;
          }
          if (IntrusiveDequeCursor.field_k) {
            QuickChatMenu.closeTransientPopups(param0 + 1481707577);
            ScorePopup.disconnectLobby(-28264);
            UiWidget.resetLobbyLists(-8328);
            IntrusiveDequeCursor.field_k = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "bl.A(" + param0 + ')');
        }
    }

    static {
        field_h = false;
        field_f = "Withdraw invitation to <%0> to join this game";
        field_b = "Unpacking levels";
        field_c = -1;
        field_d = "Your zombie will screech like the devil, making humans tremble with fear and unable to move!";
        field_e = "Rated games are available to members only. To become a member and gain access to all the research, please visit the 'Account' section of the website.";
        field_a = 0;
    }
}
