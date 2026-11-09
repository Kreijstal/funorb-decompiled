/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelegatingCanvas extends java.awt.Canvas {
    static boolean field_c;
    static ToolkitSprite[] field_b;
    private java.awt.Component delegate;

    public static void releaseStatics(int guard) {
        try {
          field_b = null;
          if (guard <= 89) {
            field_b = (ToolkitSprite[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wo.A(" + guard + ')');
        }
    }

    final static int wrapPromptText(String[] lines, LegacyBitmapFont font, int width, boolean guard, String text) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = font.stringWidth(text);
          if (var5_int <= width &&
            -1 == text.indexOf("<br>")) {
            lines[0] = text;
            stackIn_8_0 = 1;
            return stackIn_8_0;
          }
          var6 = (-1 + width + var5_int) / width;
          width = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          if (guard) {
            stackIn_11_0 = -80;
            return stackIn_11_0;
          }
          var8 = text.length();
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 <= var9))) {
            var10 = text.charAt(var9);
            stackIn_34_0 = var10;
            stackIn_34_1 = 32;
            if (var13 == 0) {
              if (stackIn_34_0 == stackIn_34_1 ||
                var10 == 45) {
                var11 = text.substring(var7, 1 + var9).trim();
                var12 = font.stringWidth(var11);
                if (var12 >= width) {
                  var7 = var9 + 1;
                  incrementValue$0 = var6Lifetime1;
                  var6Lifetime1++;
                  lines[incrementValue$0] = var11;
                }
              }
              if (var10 == 62 &&
                text.regionMatches(var9 - 3, "<br>", 0, 4)) {
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                lines[incrementValue$1] = text.substring(var7, var9 - 3).trim();
                var7 = 1 + var9;
              }
              var9++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_34_0 = ~var8;
            stackIn_34_1 = ~var7;
          }
          if (stackIn_34_0 < stackIn_34_1) {
            incrementValue$2 = var6Lifetime1;
            var6Lifetime1++;
            lines[incrementValue$2] = text.substring(var7, var8).trim();
          }
          stackIn_38_0 = var6Lifetime1;
          return stackIn_38_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_42_0 = var5;
          stackIn_42_1 = new StringBuilder().append("wo.B(");
          if (lines == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (font == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(width).append(',').append(guard).append(',');
          if (text == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(')').toString());
        }
    }

    public final void paint(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.delegate.paint(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("wo.paint(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void update(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.delegate.update(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("wo.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void drawToolkitNineSlice(ToolkitSprite[] sprites, int height, int x, int color, int colorMode, GraphicsToolkit toolkit, int width, int y, int blendMode, boolean guard) {
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_128_2 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_132_2 = null;
        RuntimeException decompiledCaughtException = null;
        ToolkitRasterStateStack var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var25Lifetime1;
        int var25Lifetime2;
        int var25Lifetime3;
        int var25Lifetime4;
        var27 = Sumoblitz.field_L ? 1 : 0;
        try {
          var10 = IntroMeshResources.rasterStateForToolkit(toolkit, (byte) 15);
          if (sprites == null) {
            return;
          }
          if (0 < width &&
            0 < height) {
            if (null != sprites[3]) {
              stackIn_14_0 = sprites[3].paddedWidth();
            } else {
              stackIn_14_0 = 0;
            }
            var11 = stackIn_14_0;
            if (sprites[5] != null) {
              stackIn_18_0 = sprites[5].paddedWidth();
            } else {
              stackIn_18_0 = 0;
            }
            var12 = stackIn_18_0;
            if (null == sprites[1]) {
              stackIn_22_0 = 0;
            } else {
              stackIn_22_0 = sprites[1].paddedHeight();
            }
            var13 = stackIn_22_0;
            if (null == sprites[7]) {
              stackIn_26_0 = 0;
            } else {
              stackIn_26_0 = sprites[7].paddedHeight();
            }
            var14 = stackIn_26_0;
            var15 = width + x;
            var16 = y + height;
            var17 = var11 + x;
            var18 = var15 - var12;
            var19 = var13 + y;
            var20 = -var14 + var16;
            var21 = var17;
            if (!guard) {
              DelegatingCanvas.drawToolkitNineSlice((ToolkitSprite[]) null, 78, -40, 98, -104, (GraphicsToolkit) null, -45, 54, 115, true);
            }
            var22 = var18;
            if (var21 > var22) {
              var22 = width * var11 / (var11 + var12) + x;
              var21 = width * var11 / (var11 + var12) + x;
            }
            var23 = var19;
            var24 = var20;
            if (var24 < var23) {
              var24 = height * var13 / (var13 + var14) + y;
              var23 = height * var13 / (var13 + var14) + y;
            }
            if (null != sprites[0]) {
              var10.pushClip((byte) 81, y, var23, x, var21);
              sprites[0].draw(x, y, colorMode, color, blendMode);
              var10.pop(29709);
            }
            if (sprites[2] != null) {
              var10.pushClip((byte) -98, y, var23, var22, var15);
              sprites[2].draw(var18, y, colorMode, color, blendMode);
              var10.pop(29709);
            }
            if (null != sprites[6]) {
              var10.pushClip((byte) 43, var24, var16, x, var21);
              sprites[6].draw(x, var20, colorMode, color, blendMode);
              var10.pop(29709);
            }
            if (sprites[8] != null) {
              var10.pushClip((byte) 37, var24, var16, var22, var15);
              sprites[8].draw(var18, var20, colorMode, color, blendMode);
              var10.pop(29709);
            }
            boolean decompiledFrameCompleted3 = true;
            if (sprites[1] != null &&
              sprites[1].paddedWidth() != 0) {
              var10.pushClip((byte) 51, y, var23, var21, var22);
              var25 = var17;
              while (var25 < var18) {
                sprites[1].draw(var25, y, colorMode, color, blendMode);
                var25 = var25 + sprites[1].paddedWidth();
                if (var27 != 0) {
                  decompiledFrameCompleted3 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted3) {
                var10.pop(29709);
              }
            }
            boolean decompiledFrameCompleted2 = true;
            if (null != sprites[7] &&
              sprites[7].paddedWidth() != 0) {
              var10.pushClip((byte) 109, var24, var16, var21, var22);
              var25Lifetime1 = var17;
              while (var18 > var25Lifetime1) {
                sprites[7].draw(var25Lifetime1, var20, colorMode, color, blendMode);
                var25Lifetime1 = var25Lifetime1 + sprites[7].paddedWidth();
                if (var27 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted2) {
                var10.pop(29709);
              }
            }
            boolean decompiledFrameCompleted1 = true;
            if (null != sprites[3] &&
              sprites[3].paddedHeight() != 0) {
              var10.pushClip((byte) -93, var23, var24, x, var21);
              var25Lifetime2 = var19;
              while (var20 > var25Lifetime2) {
                sprites[3].draw(x, var25Lifetime2, colorMode, color, blendMode);
                var25Lifetime2 = var25Lifetime2 + sprites[3].paddedHeight();
                if (var27 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                var10.pop(29709);
              }
            }
            boolean decompiledFrameCompleted0 = true;
            if (sprites[5] != null &&
              sprites[5].paddedHeight() != 0) {
              var10.pushClip((byte) -128, var23, var24, var22, var15);
              var25Lifetime3 = var19;
              while (var25Lifetime3 < var20) {
                sprites[5].draw(var18, var25Lifetime3, colorMode, color, blendMode);
                var25Lifetime3 = var25Lifetime3 + sprites[5].paddedHeight();
                if (var27 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                var10.pop(29709);
              }
            }
            if (sprites[4] != null &&
              sprites[4].paddedWidth() != 0 &&
              0 != sprites[4].paddedHeight()) {
              var10.pushClip((byte) 97, var23, var24, var21, var22);
              var25Lifetime4 = var19;
              while (var20 > var25Lifetime4) {
                if (var27 != 0) {
                  return;
                }
                var26 = var17;
                while (var18 > var26) {
                  sprites[4].draw(var26, var25Lifetime4, colorMode, color, blendMode);
                  var26 = var26 + sprites[4].paddedWidth();
                }
                var25Lifetime4 = var25Lifetime4 + sprites[4].paddedHeight();
              }
              var10.pop(29709);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_127_0 = var10_ref;
          stackIn_127_1 = new StringBuilder().append("wo.C(");
          if (sprites == null) {
            stackIn_128_2 = "null";
          } else {
            stackIn_128_2 = "{...}";
          }
          stackIn_131_1 = ((StringBuilder) (Object) stackIn_127_1).append(stackIn_128_2).append(',').append(height).append(',').append(x).append(',').append(color).append(',').append(colorMode).append(',');
          if (toolkit == null) {
            stackIn_132_2 = "null";
          } else {
            stackIn_132_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_127_0), ((StringBuilder) (Object) stackIn_131_1).append(stackIn_132_2).append(',').append(width).append(',').append(y).append(',').append(blendMode).append(',').append(guard).append(')').toString());
        }
    }

    DelegatingCanvas(java.awt.Component param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.delegate = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("wo.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
    }
}
