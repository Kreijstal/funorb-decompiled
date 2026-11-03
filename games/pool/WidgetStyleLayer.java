/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetStyleLayer {
    private int shadowColor;
    private boolean flushBeforeApply;
    private int offsetX;
    private int alpha;
    static ScrollPane field_c;
    Sprite[] frameSprites;
    private int offsetY;
    Sprite sprite;
    private int textColor;
    static hj field_e;
    static int field_k;
    static String tutorialOptionNineBall;

    final void copyTo(int param0, WidgetStyleLayer param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1.alpha = this.alpha;
          if (param0 != 288) {
            WidgetStyleLayer.b(85, -110);
          }
          param1.flushBeforeApply = this.flushBeforeApply;
          param1.textColor = this.textColor;
          param1.offsetY = this.offsetY;
          param1.frameSprites = this.frameSprites;
          param1.shadowColor = this.shadowColor;
          param1.offsetX = this.offsetX;
          param1.sprite = this.sprite;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("pf.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static float b(int param0, int param1) {
        RuntimeException var2 = null;
        float stackIn_3_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 125) {
            WidgetStyleLayer.b(3, -70);
          }
          stackIn_3_0 = de.scaleByPowerOfTwo(-1, 16, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "pf.P(" + param0 + ',' + param1 + ')');
        }
    }

    final WidgetStyleLayer setShadowColor(boolean param0, int param1) {
        RuntimeException var3 = null;
        WidgetStyleLayer stackIn_2_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.shadowColor = param1;
          if (param0) {
            return this;
          }
          stackIn_2_0 = (WidgetStyleLayer) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "pf.D(" + param0 + ',' + param1 + ')');
        }
    }

    final WidgetStyleLayer setOffsetX(int param0, int param1) {
        RuntimeException var3 = null;
        WidgetStyleLayer stackIn_2_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.offsetX = param0;
          if (param1 == -1) {
            return this;
          }
          stackIn_2_0 = (WidgetStyleLayer) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "pf.H(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, BitmapFont param3, String param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = param3.b(param4);
          var6 = param3.maxDescent + param3.field_L;
          var7 = TimeTrialSelectScreen.field_H;
          if (6 + var7 + var5_int > SoftwareRasterizer.width) {
            var7 = -var5_int + SoftwareRasterizer.width - 6;
          }
          var8 = 32 + (-param3.field_L + pm.field_p);
          if (SoftwareRasterizer.height < var8 + var6 + 6) {
            var8 = -6 - var6 + SoftwareRasterizer.height;
          }
          SoftwareRasterizer.drawRectangle(var7, var8, var5_int + 6, var6 + 6, param1);
          SoftwareRasterizer.fillRectangle(1 + var7, var8 + 1, var5_int + param2, 4 + var6, param0);
          param3.d(param4, var7 + 3, param3.field_L + (var8 + 3), param1, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("pf.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_0 = stackIn_11_0;
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_16_0 = stackIn_15_0;
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = stackIn_11_0;
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Pool.field_O;
        try {
          if (param0 ||
            HighscoresScreen.field_L == null) {
            AccountWelcomePanel.field_bb = false;
          }
          var2_int = 110 % ((74 - param1) / 32);
          if (param0) {
            if (NodeHashTableIterator.field_a > 0) {
              NodeHashTableIterator.field_a = NodeHashTableIterator.field_a - 1;
              return;
            }
            if (PoolMatchController.field_z > 0) {
              PoolMatchController.field_z = PoolMatchController.field_z - 1;
              return;
            }
            if (0 >= nj.field_b) {
              return;
            }
            nj.field_b = nj.field_b - 1;
            return;
          }
          if (HighscoresScreen.field_L != null) {
            if (NodeHashTableIterator.field_a > 0) {
              NodeHashTableIterator.field_a = NodeHashTableIterator.field_a - 1;
              return;
            }
            if (PoolMatchController.field_z > 0) {
              PoolMatchController.field_z = PoolMatchController.field_z - 1;
              return;
            }
            if (BufferedFile.field_h > nj.field_b) {
              if (nj.field_b == 0) {
                VerticalScrollbar.a(27194, false);
              }
              nj.field_b = nj.field_b + 1;
              return;
            }
          } else {
            if (tp.field_e == null) {
              AccountWelcomePanel.field_bb = false;
              if (0 < PoolMatchController.field_z) {
                PoolMatchController.field_z = PoolMatchController.field_z - 1;
                return;
              }
              if (nj.field_b > 0) {
                nj.field_b = nj.field_b - 1;
                return;
              }
              if (NodeHashTableIterator.field_a >= BufferedFile.field_h) {
                return;
              }
              if (NodeHashTableIterator.field_a == 0) {
                DelegatingCanvas.a(-128);
              }
              NodeHashTableIterator.field_a = NodeHashTableIterator.field_a + 1;
              return;
            }
            if (NodeHashTableIterator.field_a > 0) {
              NodeHashTableIterator.field_a = NodeHashTableIterator.field_a - 1;
              return;
            }
            if (nj.field_b > 0) {
              nj.field_b = nj.field_b - 1;
              return;
            }
            if (PoolMatchController.field_z < BufferedFile.field_h) {
              if (PoolMatchController.field_z == 0) {
                VerticalScrollbar.a(27194, true);
              }
              PoolMatchController.field_z = PoolMatchController.field_z + 1;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "pf.N(" + param0 + ',' + param1 + ')');
        }
    }

    final void reset(int param0) {
        try {
          this.offsetY = 0;
          this.alpha = 256;
          this.offsetX = 0;
          int var2_int = -73 / ((param0 + 15) / 36);
          this.shadowColor = -1;
          this.sprite = null;
          this.frameSprites = null;
          this.textColor = 0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pf.A(" + param0 + ')');
        }
    }

    final void applyTo(StatefulTextPainter param0, int param1, WidgetStyleLayer param2, int param3, UiWidget param4, int param5) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.flushBeforeApply) {
            param2.draw(param1, param5, param4, param0, 117);
            param2.reset(23);
          }
          if (this.textColor >= -1) {
            param2.textColor = this.textColor;
          }
          if (param3 >= -95) {
            WidgetStyleLayer.b(-95, 89);
          }
          if (this.shadowColor >= -1) {
            param2.shadowColor = this.shadowColor;
          }
          if (null != this.frameSprites) {
            param2.frameSprites = this.frameSprites;
          }
          if (this.offsetY != -2147483648) {
            param2.offsetY = this.offsetY;
          }
          if (null != this.sprite) {
            param2.sprite = this.sprite;
          }
          if (-2147483648 != this.offsetX) {
            param2.offsetX = this.offsetX;
          }
          if (-2147483648 == this.alpha) {
            return;
          }
          param2.alpha = this.alpha;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_28_0 = var7;
          stackIn_28_1 = new StringBuilder().append("pf.B(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_0 = stackIn_28_0;
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_0 = stackIn_32_0;
            stackIn_33_2 = "null";
          } else {
            stackIn_33_0 = stackIn_28_0;
            stackIn_33_2 = "{...}";
          }
          stackIn_36_0 = stackIn_33_0;
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_37_0 = stackIn_36_0;
            stackIn_37_2 = "null";
          } else {
            stackIn_37_0 = stackIn_33_0;
            stackIn_37_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param5).append(')').toString());
        }
    }

    final WidgetStyleLayer setFrameSprites(Sprite[] param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 54) {
            this.textColor = -118;
          }
          this.frameSprites = param0;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pf.O(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final WidgetStyleLayer setTextColor(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.textColor = param0;
          if (param1 <= 3) {
            field_e = (hj) null;
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "pf.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static Sprite loadSprite(String param0, byte param1, String param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.getGroupId(param0, -1);
          if (param1 <= 29) {
            field_e = (hj) null;
          }
          var5 = param3.getFileId(var4_int, 0, param2);
          stackIn_3_0 = UiComponent.a(var4_int, param3, -55, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("pf.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_0 = stackIn_7_0;
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = stackIn_7_0;
            stackIn_12_2 = "{...}";
          }
          stackIn_15_0 = stackIn_12_0;
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_16_0 = stackIn_15_0;
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = stackIn_12_0;
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final WidgetStyleLayer setOffsetY(int param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 90) {
            this.frameSprites = (Sprite[]) null;
          }
          this.offsetY = param0;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "pf.L(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        try {
          DualLinkNode.field_p = param0;
          hn.field_b = 0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pf.I(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 < 7) {
          return;
        }
        try {
          tutorialOptionNineBall = null;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pf.G(" + param0 + ')');
        }
    }

    final WidgetStyleLayer setFlushBeforeApply(int param0, boolean param1) {
        RuntimeException var3 = null;
        WidgetStyleLayer stackIn_2_0 = null;
        boolean stackIn_6_1 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -15359) {
            stackIn_2_0 = (WidgetStyleLayer) null;
            return stackIn_2_0;
          }
          stackIn_6_1 = (param1);
          this.flushBeforeApply = stackIn_6_1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "pf.M(" + param0 + ',' + param1 + ')');
        }
    }

    WidgetStyleLayer() {
        this.shadowColor = -2;
        this.frameSprites = null;
        this.offsetX = -2147483648;
        this.alpha = -2147483648;
        this.sprite = null;
        this.offsetY = -2147483648;
        this.flushBeforeApply = false;
        this.textColor = -2;
    }

    final void draw(int param0, int param1, UiWidget param2, StatefulTextPainter param3, int param4) {
        BitmapFont stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_26_2 = 0;
        BitmapFont stackIn_29_0;
        String stackIn_29_1;
        int stackIn_29_2;
        int stackIn_29_3;
        BitmapFont stackIn_30_0 = null;
        String stackIn_30_1 = null;
        int stackIn_30_4 = 0;
        BitmapFont stackIn_33_0;
        String stackIn_33_1;
        int stackIn_33_2;
        int stackIn_33_3;
        int stackIn_33_4;
        int stackIn_33_5;
        int stackIn_33_6;
        int stackIn_33_7;
        BitmapFont stackIn_34_0;
        String stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_8;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          nj.drawNineSlice(this.frameSprites, (byte) -112, param2.widgetWidth, param1 + param2.widgetX, param0 + param2.widgetY, param2.widgetHeight);
          if (null != this.sprite) {
            var6_int = param2.widgetX + param1 + this.offsetX;
            if (param3.horizontalAlignment == 1) {
              var6_int = var6_int + (param2.widgetWidth - this.sprite.field_w) / 2;
            }
            var7 = param0 + (param2.widgetY + this.offsetY);
            if (param3.verticalAlignment == 1) {
              var7 = var7 + (param2.widgetHeight - this.sprite.field_y) / 2;
            }
            if (2 == param3.horizontalAlignment) {
              var6_int = var6_int + (param2.widgetWidth - this.sprite.field_w);
            }
            if (2 == param3.verticalAlignment) {
              var7 = var7 + (-this.sprite.field_y + param2.widgetHeight);
            }
            this.sprite.draw(var6_int, var7);
          }
          var6 = param3.getWidgetText(-1, param2);
          if (param4 <= 96) {
            this.shadowColor = 108;
          }
          if (var6 != null &&
            param3.font != null) {
            if (this.textColor < 0) {
              return;
            }
            stackIn_25_0 = param3.font;
            stackIn_25_1 = var6;
            if (this.offsetX != -2147483648) {
              stackIn_26_2 = this.offsetX;
            } else {
              stackIn_26_2 = 0;
            }
            stackIn_29_0 = stackIn_25_0;
            stackIn_29_1 = stackIn_25_1;
            stackIn_29_2 = stackIn_26_2 + param3.field_i + (param2.widgetX + param1);
            stackIn_29_3 = param3.field_f + param2.widgetY + param0;
            if (-2147483648 != this.offsetY) {
              stackIn_30_0 = stackIn_29_0;
              stackIn_30_1 = stackIn_29_1;
              stackIn_30_4 = this.offsetY;
            } else {
              stackIn_30_0 = stackIn_25_0;
              stackIn_30_1 = stackIn_25_1;
              stackIn_30_4 = 0;
            }
            stackIn_33_0 = stackIn_30_0;
            stackIn_33_1 = stackIn_30_1;
            stackIn_33_2 = stackIn_29_2;
            stackIn_33_3 = stackIn_29_3 + stackIn_30_4;
            stackIn_33_4 = -param3.field_i + (param2.widgetWidth - param3.field_g);
            stackIn_33_5 = -param3.field_j + param2.widgetHeight - param3.field_f;
            stackIn_33_6 = this.textColor;
            stackIn_33_7 = this.shadowColor;
            if (this.alpha != -2147483648) {
              stackIn_34_0 = stackIn_33_0;
              stackIn_34_1 = stackIn_33_1;
              stackIn_34_2 = stackIn_33_2;
              stackIn_34_8 = this.alpha;
            } else {
              stackIn_34_0 = stackIn_30_0;
              stackIn_34_1 = stackIn_30_1;
              stackIn_34_2 = stackIn_29_2;
              stackIn_34_8 = 256;
            }
            ((BitmapFont) (Object) stackIn_34_0).drawParagraphAlpha(stackIn_34_1, stackIn_34_2, stackIn_33_3, stackIn_33_4, stackIn_33_5, stackIn_33_6, stackIn_33_7, stackIn_34_8, param3.horizontalAlignment, param3.verticalAlignment, param3.field_b);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_39_0 = var6_ref;
          stackIn_39_1 = new StringBuilder().append("pf.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_43_0 = stackIn_39_0;
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param3 == null) {
            stackIn_44_0 = stackIn_43_0;
            stackIn_44_2 = "null";
          } else {
            stackIn_44_0 = stackIn_39_0;
            stackIn_44_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_e = new hj(11, 0, 1, 2);
        tutorialOptionNineBall = "Nine-ball";
    }
}
