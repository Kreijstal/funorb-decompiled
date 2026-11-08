/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ResizableModalPanel extends ModalPanel {
    private int field_Q;
    static Sprite field_P;
    private int field_T;
    private int field_U;
    static int field_X;
    static int field_V;
    private int field_Z;
    static SceneWidget field_W;
    private int field_S;
    private int field_Y;
    static String field_R;

    boolean isDismissed(byte param0) {
        this.finishAnimations(false);
        if (param0 < 120) {
          this.field_Y = 17;
        }
        return super.isDismissed((byte) 124);
    }

    final static SceneWidget createThemedWidget(int param0, int param1, int param2, BitmapFont param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        SceneWidget var13 = null;
        RuntimeException var13_ref = null;
        SceneWidget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var13 = new SceneWidget(0L, (SceneWidget) null);
          if (param8 != 21) {
            ResizableModalPanel.getLegacyMenuHeight(40);
          }
          var13.field_zb = wk.createSolidFrame(param9, param0, 1);
          var13.field_ab = wk.createSolidFrame(param6, param4, 1);
          var13.field_bb = wk.createSolidFrame(param10, param12, 1);
          var13.field_eb = wk.createSolidFrame(param11, param1, 1);
          var13.field_M = wk.createSolidFrame(param2, param7, 1);
          var13.font = param3;
          var13.field_N = param5;
          stackIn_3_0 = var13;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13_ref = decompiledCaughtException;
          stackIn_6_0 = var13_ref;
          stackIn_6_1 = new StringBuilder().append("ka.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    boolean tickLayerAndCheckHidden(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (this.field_Q <= 0) {
        } else {
          var2 = this.field_U;
          var3 = this.field_Z;
          fieldTemp$0 = this.field_S + 1;
          this.field_S = this.field_S + 1;
          if (this.field_Q <= fieldTemp$0) {
            this.field_Q = 0;
            this.onResizeFinished(true);
          } else {
            var4 = this.field_S * (-this.field_S + this.field_Q * 2);
            var5 = this.field_Q * this.field_Q;
            var2 = (-this.field_T + this.field_U) * var4 / var5 + this.field_T;
            var3 = var4 * (this.field_Z - this.field_Y) / var5 + this.field_Y;
          }
          this.centerWithSize(var3, (byte) -110, var2);
        }
        if (param0) {
          this.finishAnimations(false);
        }
        return super.tickLayerAndCheckHidden(param0);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 127) {
          ResizableModalPanel.getLegacyMenuHeight(55);
        }
        field_R = null;
        field_P = null;
        field_W = null;
    }

    ResizableModalPanel(ModalStack param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Q = 0;
        this.field_S = 0;
    }

    void finishAnimations(boolean param0) {
        if (this.field_Q <= 0) {
          return;
        }
        this.centerWithSize(this.field_Z, (byte) -110, this.field_U);
        this.field_Q = 0;
        this.onResizeFinished(!param0 ? true : false);
        if (param0) {
          this.finishAnimations(false);
        }
    }

    final static int getLegacyMenuHeight(int param0) {
        if (param0 != 22) {
          ResizableModalPanel.createThemedWidget(-69, 82, -115, (BitmapFont) null, -110, 125, 40, -83, 9, 8, -58, 81, 44);
        }
        return -qn.field_o + LinkButtonPainter.field_e;
    }

    final void startResizeAnimation(int param0, int param1, int param2, int param3) {
        if (param2 <= 0) {
          this.centerWithSize(param0, (byte) -110, param1);
          return;
        }
        this.field_U = param1;
        this.field_S = 0;
        this.field_Q = param2;
        if (param3 != 57) {
          field_W = (SceneWidget) null;
        }
        this.field_Z = param0;
        this.field_T = this.field_E;
        this.field_Y = this.field_C;
    }

    void drawDialogBackground(int param0, int param1, boolean param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = Pixelate.field_H ? 1 : 0;
        SoftwareRasterizer.fillVerticalGradient(param0 + 6, 35 + param1, -12 + this.field_E, -40 + this.field_C, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        while (var7 < var4) {
          if (SoftwareRasterizer.field_f <= var8 &&
            SoftwareRasterizer.field_a > var8) {
            var9 = var5 + var7 * (var6 - var5) / var4;
            var10 = 0;
            var11 = this.field_E;
            if (20 >= var7) {
              while (var10 <= 20) {
                var12 = (20 - var7) * (20 - var7) + (-var10 + 20) * (-var10 + 20);
                if (462 >= var12) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  SoftwareRasterizer.field_k[var10 + (param0 + SoftwareRasterizer.field_j * var8)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = (20 - var7) * (20 - var7) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    SoftwareRasterizer.field_k[var8 * SoftwareRasterizer.field_j + param0 + var11] = var15;
                  } else {
                    var12Lifetime1 = 1 + var11;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            SoftwareRasterizer.drawHorizontalLine(var10 + param0, var8, -var10 + var11, var9);
          }
          var8++;
          var7++;
        }
        var5Lifetime1 = 194;
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param1;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          SoftwareRasterizer.drawHorizontalLine(param0, var8Lifetime1, 6, var9Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-6 + (param0 + this.field_E), var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        if (!param2) {
          this.field_U = -54;
        }
        ge.field_g.drawTransparent(param0 + (this.field_E - 90), 10 + param1);
        MatchController.drawThreeSliceBar(-10 + this.field_E, param1 + 35, 19571, 5 + param0, HowToPlayScreen.field_s);
        MatchController.drawThreeSliceBar(this.field_E, param1 + this.field_C - 22, 19571, param0, PlayerBoard.field_v);
        var5Lifetime2 = 169;
        var6Lifetime2 = 127;
        var4Lifetime2 = -79 + this.field_C;
        var7Lifetime2 = 0;
        var8Lifetime2 = param1 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = (var6Lifetime2 - var5Lifetime2) * var7Lifetime2 / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          SoftwareRasterizer.drawHorizontalLine(param0, var8Lifetime2, 6, var9Lifetime2);
          SoftwareRasterizer.drawHorizontalLine(this.field_E + param0 - 6, var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    void onResizeFinished(boolean param0) {
        if (!param0) {
          ResizableModalPanel.getLegacyMenuHeight(-1);
        }
    }

    static {
        field_R = "Passwords can only contain letters and numbers";
    }
}
