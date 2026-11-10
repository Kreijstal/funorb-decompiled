/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordTextPainter extends GradientOutlineTextPainter {
    static UiComponent field_B;
    static UiComponent field_x;
    static String field_A;
    static BitmapFont field_C;
    static int field_z;
    static int field_y;
    static Sprite field_w;

    final static void handleNameEntryResult(boolean param0, int param1, int param2) {
        int var3;
        Object var4;
        Object var5;
        PlatformTaskDispatcher var6;
        String var7;
        CharSequence var8;
        CharSequence var9;
        int var3Lifetime1;
        Object var4Lifetime1;
        Object var5Lifetime1;
        String var7Lifetime1;
        Object var5Lifetime2;
        Object var5Lifetime1Lifetime1;
        if (param1 == 0) {
          if (LevelFileEntry.field_i == null) {
            return;
          }
          var3 = LevelFileEntry.field_i.updateAndPollNameInput((byte) 113, param0);
          if (var3 == 0) {
            return;
          }
          if (var3 != 2) {
            LevelFileEntry.field_i = null;
            LoginCredentials.field_e = -1;
            return;
          }
          if (null == LevelFileEntry.field_i.field_wb) {
            LevelFileEntry.field_i = null;
            LoginCredentials.field_e = -1;
            return;
          }
          if (LevelFileEntry.field_i.field_wb.equals("")) {
            LevelFileEntry.field_i = null;
            LoginCredentials.field_e = -1;
            return;
          }
          if (LevelFileEntry.field_i.field_wb.charAt(0) != 91) {
            var9 = (CharSequence) ((Object) LevelFileEntry.field_i.field_wb);
            var4 = AudioPumpThread.normalizePlayerName(var9, false);
            var5 = var4;
            var5 = var4;
          } else {
            var4 = LevelFileEntry.field_i.field_wb;
          }
          var5Lifetime2 = null;
          if (0 == LoginCredentials.field_e) {
            var5Lifetime2 = TickClock.requestAddFriend((String) (var4), (byte) 116, param2);
          }
          if (1 == LoginCredentials.field_e) {
            var5Lifetime2 = ButtonWidget.requestRemoveFriend((String) (var4), 103, param2);
          }
          if (LoginCredentials.field_e == 2) {
            var5Lifetime2 = SocialRequestHelpers.requestAddIgnoredPlayer(param1 - 86, param2, (String) (var4));
          }
          if (LoginCredentials.field_e == 3) {
            var5Lifetime2 = ArchiveProvider.removeIgnoredName((String) (var4), (String) (var4), param1 - 25, param2);
          }
          if (var5Lifetime2 == null) {
            LevelFileEntry.field_i = null;
            LoginCredentials.field_e = -1;
            return;
          }
          var7 = (String) null;
          FullscreenErrorDialog.addChatMessage((String) (var4), 0, (String) null, (String) (var5Lifetime2), 2, 0);
          LevelFileEntry.field_i = null;
          LoginCredentials.field_e = -1;
          return;
        }
        var6 = (PlatformTaskDispatcher) null;
        PasswordTextPainter.openFullscreenFrame(-30, (PlatformTaskDispatcher) null, 112, 17, -89, 48);
        if (LevelFileEntry.field_i == null) {
          return;
        }
        var3Lifetime1 = LevelFileEntry.field_i.updateAndPollNameInput((byte) 113, param0);
        if (var3Lifetime1 == 0) {
          return;
        }
        if (var3Lifetime1 == 2 &&
          null != LevelFileEntry.field_i.field_wb &&
          !LevelFileEntry.field_i.field_wb.equals("")) {
          if (LevelFileEntry.field_i.field_wb.charAt(0) != 91) {
            var8 = (CharSequence) ((Object) LevelFileEntry.field_i.field_wb);
            var4Lifetime1 = AudioPumpThread.normalizePlayerName(var8, false);
            var5Lifetime1 = var4Lifetime1;
            var4Lifetime1 = var5Lifetime1;
            var5Lifetime1 = var4Lifetime1;
          } else {
            var4Lifetime1 = LevelFileEntry.field_i.field_wb;
          }
          var5Lifetime1Lifetime1 = null;
          if (0 == LoginCredentials.field_e) {
            var5Lifetime1Lifetime1 = TickClock.requestAddFriend((String) (var4Lifetime1), (byte) 116, param2);
          }
          if (1 == LoginCredentials.field_e) {
            var5Lifetime1Lifetime1 = ButtonWidget.requestRemoveFriend((String) (var4Lifetime1), 103, param2);
          }
          if (LoginCredentials.field_e == 2) {
            var5Lifetime1Lifetime1 = SocialRequestHelpers.requestAddIgnoredPlayer(param1 - 86, param2, (String) (var4Lifetime1));
          }
          if (LoginCredentials.field_e == 3) {
            var5Lifetime1Lifetime1 = ArchiveProvider.removeIgnoredName((String) (var4Lifetime1), (String) (var4Lifetime1), param1 - 25, param2);
            var4Lifetime1 = var5Lifetime1Lifetime1;
            var5Lifetime1Lifetime1 = var4Lifetime1;
            var4Lifetime1 = var5Lifetime1Lifetime1;
          }
          if (var5Lifetime1Lifetime1 != null) {
            var7Lifetime1 = (String) null;
            FullscreenErrorDialog.addChatMessage((String) (var4Lifetime1), 0, (String) null, (String) (var5Lifetime1Lifetime1), 2, 0);
          }
        }
        LevelFileEntry.field_i = null;
        LoginCredentials.field_e = -1;
        return;
    }

    private PasswordTextPainter(BitmapFont param0, int param1) {
        super(param0, param1);
    }

    final String getDisplayText(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        PlatformTaskDispatcher var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -9327) {
            var4 = (PlatformTaskDispatcher) null;
            PasswordTextPainter.openFullscreenFrame(-33, (PlatformTaskDispatcher) null, 73, 31, -76, 61);
          }
          stackIn_3_0 = ArmedHumanView.repeatChar(40, '*', param0.field_j.length());
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("m.BA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_A = null;
        field_C = null;
        field_x = null;
        if (!param0) {
          field_w = null;
          field_B = null;
          return;
        }
        field_A = (String) null;
        field_w = null;
        field_B = null;
    }

    final static void pushRasterState(int param0) {
        RasterSnapshot var1 = (RasterSnapshot) (AudioStartupHelpers.field_a.removeFirst(true));
        if (var1 == null) {
          var1 = new RasterSnapshot();
        }
        var1.capture(SoftwareRasterizer.clipTop, SoftwareRasterizer.clipBottom, SoftwareRasterizer.clipRight, (byte) -120, SoftwareRasterizer.pixels, SoftwareRasterizer.clipLeft, SoftwareRasterizer.width, SoftwareRasterizer.height);
        if (param0 == 540) {
          AlignedIconLabel.field_Fb.addFirst(var1, false);
          return;
        }
    }

    final static java.awt.Frame openFullscreenFrame(int param0, PlatformTaskDispatcher param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_36_0 = null;
        java.awt.Frame stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        DisplayMode[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        DisplayMode[] var10 = null;
        PlatformTask var11 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!param1.supportsFullscreen(-96)) {
            return null;
          }
          if (param3 == 0) {
            var10 = LevelUpgradeHelpers.getFullscreenDisplayModes(-123, param1);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var10.length > var8; var8++) {
              if (param0 == var10[var8].field_e &&
                param4 == var10[var8].field_a && ((param2 == 0 ||
                param2 == var10[var8].field_d) &&
                (var7_int == 0 ||
                !(param3 >= var10[var8].field_c)))) {
                var7_int = 1;
                param3 = var10[var8].field_c;
              }
            }
            if (var7_int == 0) {
              stackIn_25_0 = null;
              return (java.awt.Frame) (stackIn_25_0);
            }
          }
          var11 = param1.requestEnterFullscreen(param0, (byte) 126, param2, param3, param4);
          while (var11.field_f == 0) {
            SleepAndNameHelpers.sleepMillis(false, 10L);
          }
          if (param5 <= 85) {
            field_x = (UiComponent) null;
          }
          var7 = (java.awt.Frame) (var11.field_d);
          if (var7 == null) {
            stackIn_33_0 = null;
            return (java.awt.Frame) (stackIn_33_0);
          }
          if (2 != var11.field_f) {
            stackIn_38_0 = var7;
            return stackIn_38_0;
          }
          CachedTextLayout.exitFullscreenAndDisposeFrame(param1, 1, var7);
          stackIn_36_0 = null;
          return (java.awt.Frame) (stackIn_36_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_41_0 = var6_ref;
          stackIn_41_1 = new StringBuilder().append("m.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    PasswordTextPainter(int param0) {
        this(FontPaletteHelpers.field_h, param0);
    }

    static {
        field_A = "Waiting for music";
        field_w = new Sprite(540, 140);
    }
}
