/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Under13NoticePanel extends WidgetContainer implements HotspotActivationListener, ButtonActivationListener {
    private AccountCreationDialog field_H;
    static long[] field_K;
    private HotspotTextWidget field_L;
    static ProgressDialog field_I;
    private ButtonWidget field_G;
    static String field_J;

    private final String getLinkCloseMarkup(int param0) {
        if (param0 < 92) {
          return (String) null;
        }
        return "</col></u>";
    }

    public final void onHotspotActivated(int param0, HotspotTextWidget param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param3 == 0) {
            SimZombie.openPolicyPage("terms.ws", (byte) 125);
          } else {
            if (param3 == 1) {
              SimZombie.openPolicyPage("privacy.ws", (byte) 125);
            } else {
              if (2 == param3) {
                SimZombie.openPolicyPage("conduct.ws", (byte) 125);
              }
            }
          }
          if (param2 <= -16) {
            return;
          }
          field_K = (long[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    Under13NoticePanel(AccountCreationDialog param0) {
        super(0, 0, 288, 0, (WidgetPainter) null);
        String var7 = null;
        int var3 = 0;
        TextWidgetPainter var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_H = param0;
          this.field_G = new ButtonWidget(LoginDialog.field_xb, (WidgetListener) null);
          this.field_G.painter = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
          var7 = QueuedListRequest.substituteTemplateArguments(ArchiveProvider.field_a, new String[]{this.getLinkOpenMarkup(-1), this.getLinkCloseMarkup(111)}, 2);
          var3 = 20;
          var4 = new TextWidgetPainter(FontPaletteHelpers.field_h, 0, 0, 0, 0, 16777215, -1, 3, 0, FontPaletteHelpers.field_h.maxAscent, -1, 2147483647, true);
          this.field_L = new HotspotTextWidget(var7, var4);
          this.field_L.field_x = "";
          this.field_L.setHotspotHoverText(0, (byte) -107, TextLayout.field_d);
          this.field_L.setHotspotHoverText(1, (byte) -115, TextLayout.field_d);
          this.field_L.field_A = (WidgetListener) (this);
          this.field_L.field_n = -40 + this.field_n;
          this.field_L.setBoundsToTextHeight(this.field_n - 40, var3, (byte) -4, 26);
          var3 = var3 + (this.field_L.field_w + 15);
          this.addChild((byte) 108, this.field_L);
          var5 = 4;
          var6 = 200;
          this.field_G.setWidgetBounds(300 - var6 >> 1, var3, 28972, var6, 40);
          this.field_G.field_A = (WidgetListener) (this);
          this.addChild((byte) 59, this.field_G);
          this.setWidgetBounds(0, 0, 28972, 300, var5 + (var3 + 55));
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_K = null;
        field_I = null;
        if (!param0) {
          field_K = (long[]) null;
          field_J = null;
          return;
        }
        field_J = null;
    }

    private final String getLinkOpenMarkup(int param0) {
        if (param0 != -1) {
          UiWidget var3 = (UiWidget) null;
          this.handleKeyInput(-29, '.', (UiWidget) null, 60);
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final static BinaryBitmapFont loadBinaryFontByName(ResourceArchive param0, int param1, ResourceArchive param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        BinaryBitmapFont stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param0.getGroupIdByName(param4, (byte) 105);
          if (param1 != 4) {
            field_I = (ProgressDialog) null;
          }
          var6 = param0.getFileId(param3, var5_int, param1 - 5);
          stackIn_3_0 = TipPanelHelpers.loadBinaryFont(param2, var5_int, 0, var6, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("pj.R(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean handleKeyInput(int param0, char param1, UiWidget param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.focusPreviousChild((byte) -1, param2);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild(24, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("pj.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onButtonActivated(int param0, int param1, ButtonWidget param2, int param3, int param4) {
        RuntimeException var6 = null;
        ButtonWidget var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == this.field_G) {
            UrlLaunchHelpers.beginStoredLogin((byte) 62);
            this.field_H.dismissDialog(-7435);
          }
          if (param3 < -83) {
            return;
          }
          var7 = (ButtonWidget) null;
          this.onButtonActivated(82, -128, (ButtonWidget) null, -108, 33);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("pj.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void addTileAnimation(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        FrameCycleAnimation[] var11 = null;
        FrameCycleAnimation[] var7 = null;
        int var8 = 0;
        int var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var11 = new FrameCycleAnimation[PasswordValidator.field_x.length + 1];
          var7 = var11;
          int var9 = 83 / ((50 - param5) / 57);
          for (var8 = 0; PasswordValidator.field_x.length > var8; var8++) {
            var11[var8] = PasswordValidator.field_x[var8];
          }
          var7[-1 + var7.length] = new FrameCycleAnimation(param3, param4, param1, param6, param0, param2);
          PasswordValidator.field_x = var7;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pj.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_K = new long[32];
        field_J = "Ready... ";
    }
}
