/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Under13RegistrationNoticePanel extends WidgetGroup implements TextHotspotListener, WidgetActionListener {
    private FocusableWidget continueButton;
    private RegistrationResponseDialog registrationDialog;
    static long[] renderTimes;
    static int field_N;
    private HotspotTextWidget noticeLinks;
    static String field_K;
    static RgbSprite field_P;
    static String field_J;

    private final String h(int param0) {
        if (param0 != 0) {
          FocusableWidget var3 = (FocusableWidget) null;
          this.onAction(50, 62, (byte) 59, -10, (FocusableWidget) null);
        }
        return "</col></u>";
    }

    public final void onHotspotAction(int button, int obfuscationGuard, int hotspotId, HotspotTextWidget widget) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (hotspotId == 0) {
            ArchiveFetchClient.a("terms.ws", obfuscationGuard + 538);
          } else {
            if (hotspotId == 1) {
              ArchiveFetchClient.a("privacy.ws", obfuscationGuard + 538);
            } else {
              if (2 == hotspotId) {
                ArchiveFetchClient.a("conduct.ws", obfuscationGuard + 538);
              }
            }
          }
          if (obfuscationGuard != -526) {
            field_K = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ig.G(").append(button).append(',').append(obfuscationGuard).append(',').append(hotspotId).append(',');
          if (widget == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          Rasterizer2D.drawHorizontalLine(param1, param3, param2 + 1, 10000536);
          Rasterizer2D.drawHorizontalLine(param1, param3 + param0, param2 + 1, 12105912);
          var5_int = 1;
          var6 = param0;
          if (var5_int + param3 < Rasterizer2D.clipTop) {
            var5_int = -param3 + Rasterizer2D.clipTop;
          }
          if (Rasterizer2D.clipBottom < param3 + var6) {
            var6 = -param3 + Rasterizer2D.clipBottom;
          }
          for (var7 = var5_int; var7 < var6; var7++) {
            var8 = 48 * var7 / param0 + 152;
            var9 = var8 | (var8 << 8 | var8 << 16);
            Rasterizer2D.pixels[param1 + (param3 + var7) * Rasterizer2D.width] = var9;
            Rasterizer2D.pixels[param2 + (param1 + (param3 + var7) * Rasterizer2D.width)] = var9;
          }
          if (param4 != -17634) {
            Under13RegistrationNoticePanel.b(-122, -110, 30, -70, -97);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var5), "ig.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void onAction(int pointerY, int button, byte obfuscationGuard, int pointerX, FocusableWidget widget) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (widget == this.continueButton) {
            FullscreenFailureDialog.l(111);
            this.registrationDialog.closeDialog(17);
          }
          if (obfuscationGuard > -22) {
            this.continueButton = (FocusableWidget) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("ig.Q(").append(pointerY).append(',').append(button).append(',').append(obfuscationGuard).append(',').append(pointerX).append(',');
          if (widget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    Under13RegistrationNoticePanel(RegistrationResponseDialog registrationDialog) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        String var7 = null;
        int var3 = 0;
        TextWidgetRenderer var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.registrationDialog = registrationDialog;
          this.continueButton = new FocusableWidget(UsernameSuggestionPanel.field_L, (WidgetListener) null);
          this.continueButton.renderer = (WidgetRenderer) ((Object) new ButtonWidgetRenderer());
          var7 = GamePresentationHelpers.formatIndexedText(MainMenuScreen.field_z, new String[]{this.a((byte) 34), this.h(0)}, (byte) 103);
          var3 = 20;
          var4 = new TextWidgetRenderer(ArchiveNetworkClient.field_u, 0, 0, 0, 0, 16777215, -1, 3, 0, ArchiveNetworkClient.field_u.ascent, -1, 2147483647, true);
          this.noticeLinks = new HotspotTextWidget(var7, var4);
          this.noticeLinks.tooltip = "";
          this.noticeLinks.setHotspotTooltip(GameConnectionShell.field_z, 0, (byte) -98);
          this.noticeLinks.setHotspotTooltip(GameConnectionShell.field_z, 1, (byte) -98);
          this.noticeLinks.listener = (WidgetListener) (this);
          this.noticeLinks.width = -40 + this.width;
          this.noticeLinks.a(26, (byte) 46, -40 + this.width, var3);
          var3 = var3 + (15 + this.noticeLinks.height);
          this.addChild(this.noticeLinks, true);
          var5 = 4;
          var6 = 200;
          this.continueButton.setBounds(40, 300 - var6 >> 1, var3, (byte) -119, var6);
          this.continueButton.listener = (WidgetListener) (this);
          this.addChild(this.continueButton, true);
          this.setBounds(var3 + 55 + var5, 0, 0, (byte) -119, 300);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ig.<init>(" + (registrationDialog != null ? "{...}" : "null") + ')');
        }
    }

    private final String a(byte param0) {
        if (param0 != 34) {
          field_P = (RgbSprite) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void a(int param0) {
        field_P = null;
        if (param0 != 12127) {
          field_J = (String) null;
        }
        renderTimes = null;
        field_J = null;
        field_K = null;
    }

    final static RgbSprite[] a(RgbSprite[] param0, boolean param1) {
        int var3 = 0;
        RgbSprite[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        RgbSprite[] var5 = null;
        RgbSprite[] stackIn_3_0 = null;
        RgbSprite[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var5 = new RgbSprite[param0.length];
          var2 = var5;
          if (param1) {
            stackIn_3_0 = (RgbSprite[]) null;
            return stackIn_3_0;
          }
          for (var3 = 0; param0.length > var3; var3++) {
            var5[var3] = SpriteInputHelpers.createHalfSizeSprite(-16371, param0[var3]);
          }
          stackIn_8_0 = var2;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("ig.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleWidgetKey(keyCode, obfuscationGuard, focusRoot, character)) {
            return true;
          }
          if (keyCode == 98) {
            stackIn_7_0 = this.b(focusRoot, (byte) 86);
            return stackIn_7_0;
          }
          if (99 != keyCode) {
            return false;
          }
          stackIn_10_0 = this.a(focusRoot, (byte) -119);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ig.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(character).append(')').toString());
        }
    }

    static {
        field_N = 0;
        renderTimes = new long[32];
        field_J = "Please enter a year between <%0> and <%1>";
    }
}
