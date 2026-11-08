/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ThemeSelectScreen extends MenuScreen {
    static BirthDatePromptPanel field_J;
    static Sprite[] field_M;
    static String statusPrivate;
    static int field_P;
    static String ignorenotfound;
    static int field_O;
    static int field_K;
    static String createDisplaynameTooltip;
    static String createAlertInvalidage;
    static String muXWithdrewRequest;
    static int field_S;
    private static int field_R;

    final int getButtonLeft(int param0, int param1) {
        if (param0 != 0) {
          this.getButtonRight(true, -54);
        }
        if (this.g(1) > param1) {
          if (param1 < 2) {
            return 152 * (param1 % 3) + 173;
          }
          return 98 + (-2 + param1) * 152;
        }
        return super.getButtonLeft(param0 ^ 0, param1);
    }

    final static byte[] a(int param0, int param1, byte[] param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          var8 = new byte[param1 + param2.length];
          var4 = var8;
          for (var5 = 0; var5 < param2.length; var5++) {
            var8[var5] = param2[var5];
          }
          var6 = 45 / ((44 - param0) / 56);
          while (var5 < var8.length) {
            var8[var5] = (byte)param3;
            var5++;
          }
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_11_0 = var4_ref;
          stackIn_11_1 = new StringBuilder().append("sg.IB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int g(int param0) {
        if (param0 != 1) {
          this.drawButtonOverlay(31, 61, 50, -68, 43, 50);
        }
        return this.itemIds.length - 1;
    }

    final boolean isButtonEnabled(int param0, boolean param1) {
        if (!param1) {
          this.getLabelOffsetY(-39, -95);
        }
        if (this.g(1) == param0) {
          return true;
        }
        return param0 < 5 ? true : false;
    }

    public static void clearSharedReferences(int param0) {
        createDisplaynameTooltip = null;
        createAlertInvalidage = null;
        muXWithdrewRequest = null;
        ignorenotfound = null;
        field_J = null;
        statusPrivate = null;
        field_M = null;
        if (param0 != 506724193) {
          ThemeSelectScreen.h(89);
        }
    }

    final int getButtonRight(boolean param0, int param1) {
        if (param0) {
          this.getLabelOffsetY(112, -81);
        }
        if (this.g(1) > param1) {
          return this.getButtonLeft(0, param1) + 140;
        }
        return super.getButtonRight(false, param1);
    }

    final int getButtonTop(byte param0, int param1) {
        if (param1 < 2) {
          return 130;
        }
        if (param1 < this.g(1)) {
          return 260;
        }
        if (param0 != 6) {
          PlatformTaskDispatcher var4 = (PlatformTaskDispatcher) null;
          ThemeSelectScreen.a((java.awt.Component) null, (MidiPcmStream) null, -11, (PlatformTaskDispatcher) null, -109, true);
        }
        return 390;
    }

    final static Sprite[] h(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var5 = null;
        int var6 = 0;
        Sprite[] var1 = new Sprite[PacketAvailabilitySupport.field_d];
        if (param0 != 152) {
          PlatformTaskDispatcher var7 = (PlatformTaskDispatcher) null;
          ThemeSelectScreen.a((java.awt.Component) null, (MidiPcmStream) null, -111, (PlatformTaskDispatcher) null, -54, true);
        }
        for (var2 = 0; var2 < PacketAvailabilitySupport.field_d; var2++) {
          var3 = LinkButtonPainter.field_a[var2] * AccountTextSupport.field_f[var2];
          var10 = LimitedRandomAccessFile.field_b[var2];
          var11 = new int[var3];
          var9 = var11;
          var5 = var9;
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = IntrusiveNode.field_h[ArchiveLoadSequence.bitwiseAnd((int) var10[var6], 255)];
          }
          var1[var2] = new Sprite(DialRenderer.field_c, AccountStateQuery.field_r, AchievementsScreen.field_I[var2], LoginRequestSupport.field_d[var2], LinkButtonPainter.field_a[var2], AccountTextSupport.field_f[var2], var11);
        }
        OpacityWidget.releaseSpriteDecoderArrays(-1);
        return var1;
    }

    final void drawButtonOverlay(int param0, int param1, int param2, int param3, int param4, int param5) {
        Sprite var7 = null;
        int var8 = 0;
        if (!(this.g(1) <= param0)) {
          var7 = !this.isButtonEnabled(param0, true) ? MatchingTextValidator.field_t[param0] : TutorialSelectScreen.field_K[param0];
          var8 = -var7.field_z + (-param2 + param1) >> 1;
          var7.drawAt(param2 + var8, var8 + param5);
        }
        if (this.isButtonEnabled(param0, true)) {
        }
        if (param4 != -24267) {
          field_K = 78;
        }
    }

    final int getLabelOffsetY(int param0, int param1) {
        if (param1 != 6402) {
          return 118;
        }
        if (param0 != this.itemIds.length - 1) {
          return 80;
        }
        return 0;
    }

    final int getButtonHeight(byte param0, int param1) {
        if (param0 != 69) {
          return -22;
        }
        if (this.g(1) > param1) {
          return 120;
        }
        return 36;
    }

    final static void a(java.awt.Component param0, MidiPcmStream param1, int param2, PlatformTaskDispatcher param3, int param4, boolean param5) {
        try {
          UiTheme.initializeAudioOutputs(param1, param3, param0, param2, false, 1024, param5, param2);
          if (param4 != 10282) {
            PlatformTaskDispatcher var7 = (PlatformTaskDispatcher) null;
            ThemeSelectScreen.a((java.awt.Component) null, (MidiPcmStream) null, 11, (PlatformTaskDispatcher) null, -77, false);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "sg.HB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    ThemeSelectScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(LobbyPlayer.field_Lb, param0, param1, param2, param3, param4, param5);
    }

    static {
        statusPrivate = "Private";
        ignorenotfound = "<%0> is not on your ignore list.";
        createDisplaynameTooltip = "Enter the name you'd prefer. This is the name displayed to other players.";
        muXWithdrewRequest = "<%0> has withdrawn the request to join.";
        createAlertInvalidage = "Please enter your age in years";
        field_R = 2;
        field_O = 1 << field_R;
    }
}
