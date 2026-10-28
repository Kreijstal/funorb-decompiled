/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LinkButtonPainter implements WidgetPainter {
    private BitmapFont font;
    static LoginStage field_c;
    private int horizontalAlignment;
    private int verticalAlignment;
    static int[] field_e;
    static boolean field_a;

    public static void releaseStatics(byte guard) {
        field_c = null;
        if (guard <= 94) {
          return;
        }
        field_e = null;
    }

    public final void drawWidget(int originX, int originY, int guard, UiComponent component, boolean enabled) {
        int stackIn_5_0 = 0;
        String stackIn_21_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          stackIn_5_0 = (!component.hovered &&
            !component.isFocused(0)) ? (2188450) : (3249872);
          int var6_int = stackIn_5_0;
          if (guard > -14) {
            return;
          }
          this.font.drawParagraph("<u=" + Integer.toString(var6_int, 16) + ">" + component.text + "</u>", component.x + originX, component.y + originY, component.width, component.height, var6_int, -1, this.horizontalAlignment, this.verticalAlignment, this.font.maxAscent + this.font.maxDescent);
          if (component.isFocused(0)) {
            int var7 = this.font.stringWidth(component.text);
            int var8 = this.font.maxDescent + this.font.maxAscent;
            int var9 = originX + component.x;
            int var10 = component.y + originY;
            if (this.horizontalAlignment == 2) {
              var9 = var9 + (-var7 + component.width);
            } else if (1 == this.horizontalAlignment) {
              var9 = var9 + (component.width - var7 >> 1);
            }
            if (this.verticalAlignment == 2) {
              var10 = var10 + (component.height - var8);
            } else if (this.verticalAlignment == 1) {
              var10 = var10 + (-var8 + component.height >> 1);
            }
            SeekerMine.drawDottedRectangle(false, 4 + var7, var9 - 2, var8, var10 + 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var6;
          StringBuilder stackIn_20_1 = new StringBuilder().append("ha.M(").append(originX).append(',').append(originY).append(',').append(guard).append(',');
          if (component == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(enabled).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8) {
        String stackIn_97_2 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        boolean var13 = false;
        int var15 = 0;
        int var17 = 0;
        int var18 = 0;
        int var16Lifetime2;
        int var19 = EscapeVector.obfuscationControl;
        try {
          if (0 <= param7 &&
            MeshRasterState.clipHeight > param2) {
            if (param3 < 0 &&
              param0 < 0 &&
              param4 < 0) {
              return;
            }
            if (param3 >= MeshRasterState.clipWidth &&
              MeshRasterState.clipWidth <= param0 &&
              MeshRasterState.clipWidth <= param4) {
              return;
            }
            int var14 = -param2 + param7;
            if (param2 == param1) {
              if (param7 != param2) {
                var15 = -param1 + param7;
                if (param3 >= param0) {
                  var11 = (param4 - param0 << 16) / var15;
                  var10 = param3 << 16;
                  var12 = (-param3 + param4 << 16) / var14;
                  var9_int = param0 << 16;
                } else {
                  var12 = (param4 - param0 << 16) / var15;
                  var11 = (-param3 + param4 << 16) / var14;
                  var10 = param0 << 16;
                  var9_int = param3 << 16;
                }
              } else {
                var12 = 0;
                var10 = param0 << 16;
                var11 = 0;
                var9_int = param3 << 16;
              }
              var13 = false;
              if (param2 < 0) {
                param2 = Math.min(-param2, -param2 + param1);
                var9_int = var9_int + param2 * var11;
                var10 = var10 + var12 * param2;
                param2 = 0;
              }
            } else {
              var10 = param3 << 16;
              var9_int = param3 << 16;
              var15 = param1 - param2;
              var12 = (param4 - param3 << 16) / var14;
              var11 = (param0 - param3 << 16) / var15;
              if (var12 > var11) {
                var13 = false;
              } else {
                int var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = true;
              }
              if (param2 >= 0) {
                var16Lifetime2 = MeshRasterState.rowOffsets[param2];
                while (param2 < param1) {
                  var17 = var9_int >> 16;
                  if (MeshRasterState.clipWidth > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 != 0) {
                      if (MeshRasterState.clipWidth <= var17 + var18) {
                        var18 = -1 - var17 + MeshRasterState.clipWidth;
                      }
                      if (var17 < 0) {
                        ModalPanel.halveAndAddPixels(-23466, var16Lifetime2, param6, var17 + var18, param8);
                      } else {
                        ModalPanel.halveAndAddPixels(-23466, var17 + var16Lifetime2, param6, var18, param8);
                      }
                    } else if (0 <= var17 &&
                      MeshRasterState.clipWidth > var17) {
                      ModalPanel.halveAndAddPixels(-23466, var17 + var16Lifetime2, param6, var18, param8);
                    }
                  }
                  param2++;
                  if (param2 >= MeshRasterState.clipHeight) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + SoftwareRasterizer.width;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              } else if (param1 >= 0) {
                param2 = -param2;
                var10 = var10 + param2 * var12;
                var9_int = var9_int + param2 * var11;
                param2 = 0;
                var16Lifetime2 = MeshRasterState.rowOffsets[param2];
                while (param2 < param1) {
                  var17 = var9_int >> 16;
                  if (MeshRasterState.clipWidth > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 != 0) {
                      if (MeshRasterState.clipWidth <= var17 + var18) {
                        var18 = -1 - var17 + MeshRasterState.clipWidth;
                      }
                      if (var17 < 0) {
                        ModalPanel.halveAndAddPixels(-23466, var16Lifetime2, param6, var17 + var18, param8);
                      } else {
                        ModalPanel.halveAndAddPixels(-23466, var17 + var16Lifetime2, param6, var18, param8);
                      }
                    } else if (0 <= var17 &&
                      MeshRasterState.clipWidth > var17) {
                      ModalPanel.halveAndAddPixels(-23466, var17 + var16Lifetime2, param6, var18, param8);
                    }
                  }
                  param2++;
                  if (param2 >= MeshRasterState.clipHeight) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + SoftwareRasterizer.width;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              } else {
                param2 = -param2 + param1;
                var9_int = var9_int + param2 * var11;
                var10 = var10 + param2 * var12;
                param2 = param1;
              }
              int var16Lifetime3 = -param1 + param7;
              if (var16Lifetime3 == 0) {
                var11 = 0;
                var12 = 0;
              } else {
                if (var13) {
                  var10 = param0 << 16;
                } else {
                  var9_int = param0 << 16;
                }
                int var17Lifetime2 = param4 << 16;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
              }
            }
            if (param2 < 0) {
              param2 = -param2;
              var10 = var10 + var12 * param2;
              var9_int = var9_int + param2 * var11;
              param2 = 0;
            }
            int var15Lifetime1 = MeshRasterState.rowOffsets[param2];
            while (param7 > param2) {
              int var16Lifetime1 = var9_int >> 16;
              if (MeshRasterState.clipWidth > var16Lifetime1) {
                int var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (var17Lifetime1 != 0) {
                  if (MeshRasterState.clipWidth <= var17Lifetime1 + var16Lifetime1) {
                    var17Lifetime1 = -1 + (-var16Lifetime1 + MeshRasterState.clipWidth);
                  }
                  if (var16Lifetime1 < 0) {
                    ModalPanel.halveAndAddPixels(-23466, var15Lifetime1, param6, var16Lifetime1 + var17Lifetime1, param8);
                  } else {
                    ModalPanel.halveAndAddPixels(-23466, var15Lifetime1 + var16Lifetime1, param6, var17Lifetime1, param8);
                  }
                } else if (0 <= var16Lifetime1 &&
                  MeshRasterState.clipWidth > var16Lifetime1) {
                  ModalPanel.halveAndAddPixels(-23466, var16Lifetime1 + var15Lifetime1, param6, var17Lifetime1, param8);
                }
              }
              param2++;
              if (param2 >= MeshRasterState.clipHeight) {
                return;
              }
              var9_int = var9_int + var11;
              var10 = var10 + var12;
              var15Lifetime1 = var15Lifetime1 + SoftwareRasterizer.width;
            }
            if (param5 <= 33) {
              int[] var20 = (int[]) null;
              LinkButtonPainter.a(96, -39, -128, (byte) 0, -4, 16, -43, 90, (int[]) null, -115);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var9 = decompiledCaughtException;
          RuntimeException stackIn_96_0 = var9;
          StringBuilder stackIn_96_1 = new StringBuilder().append("ha.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_97_2 = "null";
          } else {
            stackIn_97_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_96_0), ((StringBuilder) (Object) stackIn_96_1).append(stackIn_97_2).append(')').toString());
        }
    }

    final static CoverageBitmapFont a(int param0, int param1, ResourceArchive param2, int param3, ResourceArchive param4) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (!ArchivePreloader.loadSpriteSheet(param4, param1 ^ 198630719, param0, param3)) {
            Object stackIn_2_0 = null;
            return (CoverageBitmapFont) (stackIn_2_0);
          }
          if (param1 != -198630768) {
            field_c = (LoginStage) null;
          }
          CoverageBitmapFont stackIn_6_0 = SlidingSpriteTransition.buildCoverageFontFromSheet(param2.getFile(param0, (byte) -97, param3), -1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("ha.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public LinkButtonPainter() {
        this.horizontalAlignment = 1;
        this.verticalAlignment = 1;
        this.font = Js5Transport.field_a;
    }

    LinkButtonPainter(BitmapFont param0, int param1, int param2) {
        try {
          this.horizontalAlignment = param1;
          this.verticalAlignment = param2;
          this.font = param0;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int[] param8, int param9) {
        String stackIn_9_2 = null;
        int var16 = EscapeVector.obfuscationControl;
        try {
          if (param3 > -75) {
            ResourceArchive var17 = (ResourceArchive) null;
            LinkButtonPainter.a(-4, -41, (ResourceArchive) null, 73, (ResourceArchive) null);
          }
          while (true) {
            param7--;
            if (param7 < 0) {
              return;
            }
            int[] var18 = param8;
            int[] var10 = var18;
            int var11 = param1;
            int var12 = param9;
            int var13 = param0;
            int var14 = param4;
            int var15 = 8355711 & var18[var11] >> 1;
            var10[var11] = SpriteCheckboxPainter.bitwiseAnd(var13 >> 9, 65280) + (SpriteCheckboxPainter.bitwiseAnd(33423360, var12) >> 1) - (-(SpriteCheckboxPainter.bitwiseAnd(var14, 33532346) >> 17) - var15);
            param4 = param4 + param2;
            param9 = param9 + param5;
            param0 = param0 + param6;
            param1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10_ref = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var10_ref;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ha.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param9).append(')').toString());
        }
    }

    static {
        field_c = new LoginStage();
        field_e = new int[]{19, 27};
        field_a = false;
    }
}
