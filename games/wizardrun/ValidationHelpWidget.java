/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationHelpWidget extends HotspotTextWidget {
    static java.security.SecureRandom field_N;
    static String field_Q;
    private Sprite field_R;
    static ValidationState field_S;
    private int field_U;
    private String field_L;
    static Sprite field_M;
    static String field_K;
    static String[] field_O;
    private Validator field_T;
    static int field_P;

    final static String getDiscardPrompt(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param3) {
          var4 += 4;
        }
        if (param1 != -3567) {
          field_O = (String[]) null;
        }
        if (param0) {
          var4 += 2;
        }
        if (param2) {
          var4++;
        }
        return DiskCacheRequest.field_y[var4];
    }

    final static ResourceArchive createUiArchive(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param1 != -1784753947) {
          field_M = (Sprite) null;
        }
        return ProgressQuery.createResourceArchive(param0, 12000, param3, false, param2, param4);
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= 59) {
          ValidationHelpWidget.createUiArchive(-35, -95, true, 66, true);
        }
        field_M = null;
        field_S = null;
        field_K = null;
        field_Q = null;
        field_O = null;
        field_N = null;
    }

    ValidationHelpWidget(Validator param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, ArchiveRequest.defaultWidgetPainter((byte) -87));
        try {
          this.field_L = param1;
          this.field_T = param0;
          this.setBounds(125, param3, param5, param4, param2);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void recolorGreenPixels(int param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = wizardrun.field_H;
        try {
          if (SoftwareRasterizer.clipLeft > param3) {
            param4 = param4 - (-param3 + SoftwareRasterizer.clipLeft);
            param3 = SoftwareRasterizer.clipLeft;
          }
          if (param3 + param4 > SoftwareRasterizer.clipRight) {
            param4 = -param3 + SoftwareRasterizer.clipRight;
          }
          if (SoftwareRasterizer.clipTop > param2) {
            param0 = param0 - (SoftwareRasterizer.clipTop - param2);
            param2 = SoftwareRasterizer.clipTop;
          }
          if (param1 != -105) {
            ValidationHelpWidget.releaseStatics((byte) -126);
          }
          if (SoftwareRasterizer.clipBottom < param2 + param0) {
            param0 = -param2 + SoftwareRasterizer.clipBottom;
          }
          if (0 < param4 &&
            param0 > 0) {
            var6_int = param3 + SoftwareRasterizer.width * param2;
            var7 = -param4 + SoftwareRasterizer.width;
            for (param2 = -param0; 0 > param2; param2++) {
              for (param3 = -param4; param3 < 0; param3++) {
                var8 = SoftwareRasterizer.pixels[var6_int];
                if (((var8 & 65280) >> 8) > param5 &&
                  (255 & var8 >> 8) >= (16711680 & var8) >> 16) {
                  var9 = -60 + (510 & var8 >> 15);
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = var8 & 65280;
                  var10 = (var10 >> 1) - (var10 >> 5) & 65280;
                  var11 = 31 & var8 >> 3;
                  SoftwareRasterizer.pixels[var6_int] = LoginCredentialKind.bitOr(var11, LoginCredentialKind.bitOr(var10, var9 << 16));
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var6), "l.NA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String getTooltip(boolean param0) {
        if (!param0) {
          return null;
        }
        ValidationHelpWidget.recolorGreenPixels(23, (byte) -128, -52, 32, 59, 33);
        return null;
    }

    final void updateInput(int param0, int param1, int param2, UiWidget param3) {
        try {
          this.field_U = this.field_U + 1;
          if (param0 != 10000536) {
            field_S = (ValidationState) null;
          }
          super.updateInput(param0 + 0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "l.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        String var5;
        ValidationState var6;
        TextWidgetRenderer var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        Sprite var14;
        Sprite var15;
        Sprite var16;
        ValidationState var6Lifetime1;
        var13 = wizardrun.field_H;
        var6 = this.field_T.getState(true);
        if (var6 != AccountFormTextHelpers.field_c &&
          var6 != field_S) {
          var5 = this.field_T.getMessage(-2864);
          if (var5 == null) {
            var5 = this.field_L;
          }
        } else {
          var5 = PasswordFieldPainter.field_v;
        }
        if (!var5.equals(this.text)) {
          this.text = var5;
          this.rebuildHotspotBounds(param1 + 0);
        }
        super.drawLayer(param0, param1, param2, param3);
        var6Lifetime1 = this.field_T.getState(true);
        var8 = (TextWidgetRenderer) ((Object) this.renderer);
        var9 = param0 + this.x;
        var10 = var8.getTextOriginY(true, param3, (UiWidget) (this)) + (var8.getTextLayout((UiWidget) (this), (byte) 96).height(126) >> 1);
        if (var6Lifetime1 != AccountFormTextHelpers.field_c &&
          field_S != var6Lifetime1) {
          if (var6Lifetime1 == DisplayNameSyntaxHelpers.field_c) {
            var14 = AchievementStateRequest.field_k[2];
            var14.drawAdditive(var9, var10 - (var14.height >> 1), 256);
          } else if (ContentTransitionDialog.field_V == var6Lifetime1) {
            var15 = AchievementStateRequest.field_k[1];
            var15.drawAdditive(var9, -(var15.height >> 1) + var10, 256);
          }
        } else {
          var16 = AchievementStateRequest.field_k[0];
          var11 = var16.fullWidth << 1;
          var12 = var16.fullHeight << 1;
          if (this.field_R != null &&
            this.field_R.width >= var11 &&
            var12 <= this.field_R.height) {
            UrlPacketDownloader.pushSpriteRaster(this.field_R, false);
            SoftwareRasterizer.clear();
          } else {
            this.field_R = new Sprite(var11, var12);
            UrlPacketDownloader.pushSpriteRaster(this.field_R, false);
          }
          var16.drawRotatedAboutPivot(112, 144, var16.fullWidth << 4, var16.fullHeight << 4, -this.field_U << 10, 4096);
          UsernameLoginCredentials.popRasterState(4);
          this.field_R.drawAdditive(-(var16.fullWidth >> 1) + var9, -var16.fullHeight + var10, 256);
        }
    }

    final boolean requestFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 8) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("l.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_Q = "Tutorial";
        field_S = new ValidationState();
        field_O = new String[]{"Four new worlds to battle though", "Meet fearsome enemies", "Travel to the icy mountains", "Save your master"};
        field_P = -1;
    }
}
