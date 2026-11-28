/*
 * Decompiled by CFR-JS 0.4.0.
 */
class EditableTextField extends InteractiveWidget {
    private long field_E;
    private int field_C;
    private int field_I;
    private boolean field_F;
    private int field_D;
    private long field_H;
    private boolean field_J;
    private int field_G;

    private final void deleteSelection(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 2 / ((param0 - 58) / 50);
        if (this.field_G != this.field_C) {
          var3 = this.field_G <= this.field_C ? this.field_G : this.field_C;
          var4 = this.field_C < this.field_G ? this.field_G : this.field_C;
          this.field_G = var3;
          this.field_C = var3;
          this.text = this.text.substring(0, var3) + this.text.substring(var4, this.text.length());
          this.notifyTextChanged(121);
        }
    }

    private final void submitText(int param0) {
        if (param0 < 59) {
          this.clearText((byte) 122);
        }
        if (this.listener instanceof TextFieldListener) {
          ((TextFieldListener) (this.listener)).onTextSubmitted(this, (byte) -124);
        }
    }

    private final void scrollCaretIntoView(boolean param0) {
        TextLayout var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        TextWidgetRenderer var9;
        var8 = Torquing.field_u;
        if (!this.field_J) {
          this.field_j = 0;
          this.field_v = 0;
          return;
        }
        if (!(this.renderer instanceof TextWidgetRenderer)) {
          return;
        }
        var9 = (TextWidgetRenderer) ((Object) this.renderer);
        var3 = var9.getTextLayout((byte) 105, (UiWidget) (this));
        var4 = var3.getMaxLineRightX(param0);
        var5 = var9.getTextAreaWidth((UiWidget) (this), -1);
        var6 = var9.getFontLineHeight(false) >> 1;
        if (var4 < -var6 + var5) {
          this.field_v = 0;
          this.field_j = 0;
        } else {
          var7 = this.field_j + var3.getXForTextOffset(this.field_G, (byte) -126);
          if (var7 > var5 - var6) {
            this.field_j = this.field_j - (-var5 + var6) - var7;
          } else {
            if (var7 < var6) {
              this.field_j = this.field_j + var6 - var7;
            }
          }
          if (this.field_j <= 0) {
            if (this.field_j < var6 - var5) {
              this.field_j = var6 - var5;
            }
          } else {
            this.field_j = 0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, byte param8) {
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = Torquing.field_u;
        try {
          if (param1 >= 0 &&
            param3 < TriangleRasterizer.field_f) {
            if (param8 < 113) {
              return;
            }
            if (0 > param0 &&
              param4 < 0 &&
              0 > param7) {
              return;
            }
            if (TriangleRasterizer.field_p <= param0 &&
              TriangleRasterizer.field_p <= param4 &&
              TriangleRasterizer.field_p <= param7) {
              return;
            }
            var14 = -param3 + param1;
            if (param3 != param5) {
              var10 = param0 << 16;
              var9_int = param0 << 16;
              var15 = -param3 + param5;
              var11 = (-param0 + param4 << 16) / var15;
              var12 = (-param0 + param7 << 16) / var14;
              if (var12 > var11) {
                var13 = 0;
              } else {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param3 < 0) {
                if (0 > param5) {
                  param3 = param5 - param3;
                  var9_int = var9_int + var11 * param3;
                  var10 = var10 + var12 * param3;
                  param3 = param5;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param3 = -param3;
                  var9_int = var9_int + var11 * param3;
                  var10 = var10 + var12 * param3;
                  param3 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = TriangleRasterizer.field_n[param3];
                while (param3 < param5) {
                  var17 = var9_int >> 16;
                  if (TriangleRasterizer.field_p > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (0 != var18) {
                      if (TriangleRasterizer.field_p <= var17 + var18) {
                        var18 = -1 + (TriangleRasterizer.field_p - var17);
                      }
                      if (var17 >= 0) {
                        GzipDecompressor.a(var18, var16Lifetime2 + var17, -98, param6, param2);
                      } else {
                        GzipDecompressor.a(var18 + var17, var16Lifetime2, -114, param6, param2);
                      }
                    } else {
                      if (var17 >= 0 &&
                        var17 < TriangleRasterizer.field_p) {
                        GzipDecompressor.a(var18, var17 + var16Lifetime2, -104, param6, param2);
                      }
                    }
                  }
                  param3++;
                  if (TriangleRasterizer.field_f <= param3) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var16Lifetime2 = var16Lifetime2 + SoftwareRasterizer.field_j;
                  var10 = var10 + var12;
                }
              }
              var16Lifetime3 = -param5 + param1;
              if (0 != var16Lifetime3) {
                var17Lifetime2 = param7 << 16;
                if (var13 == 0) {
                  var9_int = param4 << 16;
                } else {
                  var10 = param4 << 16;
                }
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            } else {
              if (param1 != param3) {
                var15 = -param5 + param1;
                if (param0 < param4) {
                  var10 = param4 << 16;
                  var12 = (param7 - param4 << 16) / var15;
                  var9_int = param0 << 16;
                  var11 = (param7 - param0 << 16) / var14;
                } else {
                  var11 = (param7 - param4 << 16) / var15;
                  var12 = (param7 - param0 << 16) / var14;
                  var10 = param0 << 16;
                  var9_int = param4 << 16;
                }
              } else {
                var10 = param4 << 16;
                var11 = 0;
                var12 = 0;
                var9_int = param0 << 16;
              }
              if (param3 < 0) {
                param3 = Math.min(-param3, param5 - param3);
                var9_int = var9_int + param3 * var11;
                var10 = var10 + var12 * param3;
                param3 = 0;
              }
              var13 = 0;
            }
            if (param3 < 0) {
              param3 = -param3;
              var9_int = var9_int + param3 * var11;
              var10 = var10 + param3 * var12;
              param3 = 0;
            }
            var15Lifetime1 = TriangleRasterizer.field_n[param3];
            while (param1 > param3) {
              var16Lifetime1 = var9_int >> 16;
              if (TriangleRasterizer.field_p > var16Lifetime1) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (0 == var17Lifetime1) {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < TriangleRasterizer.field_p) {
                    GzipDecompressor.a(var17Lifetime1, var16Lifetime1 + var15Lifetime1, -98, param6, param2);
                  }
                } else {
                  if (var17Lifetime1 + var16Lifetime1 >= TriangleRasterizer.field_p) {
                    var17Lifetime1 = TriangleRasterizer.field_p - var16Lifetime1 - 1;
                  }
                  if (0 <= var16Lifetime1) {
                    GzipDecompressor.a(var17Lifetime1, var16Lifetime1 + var15Lifetime1, -114, param6, param2);
                  } else {
                    GzipDecompressor.a(var17Lifetime1 + var16Lifetime1, var15Lifetime1, -123, param6, param2);
                  }
                }
              }
              param3++;
              if (param3 >= TriangleRasterizer.field_f) {
                return;
              }
              var9_int = var9_int + var11;
              var10 = var10 + var12;
              var15Lifetime1 = var15Lifetime1 + SoftwareRasterizer.field_j;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_75_0 = var9;
          stackIn_75_1 = new StringBuilder().append("tk.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final void setText(boolean param0, String param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 == null) {
            param1 = "";
          }
          if (!param2) {
            this.field_F = false;
          }
          this.text = param1;
          var4_int = param1.length();
          if (this.field_I != -1 &&
            var4_int > this.field_I) {
            this.text = this.text.substring(0, this.field_I);
          }
          dupTemp$1 = this.text.length();
          this.field_C = dupTemp$1;
          this.field_G = dupTemp$1;
          if (!param0) {
            this.notifyTextChanged(-120);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("tk.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Torquing.field_u;
        try {
          SoftwareRasterizer.drawHorizontalLine(param1, param0, 1 + param3, 10000536);
          SoftwareRasterizer.drawHorizontalLine(param1, param0 + param2, 1 + param3, 12105912);
          var5_int = 1;
          var6 = param2;
          if (var5_int + param0 < SoftwareRasterizer.field_c) {
            var5_int = -param0 + SoftwareRasterizer.field_c;
          }
          if (param0 + var6 > SoftwareRasterizer.field_h) {
            var6 = -param0 + SoftwareRasterizer.field_h;
          }
          if (param4) {
            return;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = 152 + var7 * 48 / param2;
            var9 = var8 << 8 | var8 << 16 | var8;
            SoftwareRasterizer.field_e[param1 + SoftwareRasterizer.field_j * (param0 + var7)] = var9;
            SoftwareRasterizer.field_e[param3 + param1 + (param0 + var7) * SoftwareRasterizer.field_j] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) var5), "tk.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    EditableTextField(String param0, WidgetEventListener param1, int param2) {
        super(param0, param1);
        this.field_E = 0L;
        this.field_F = false;
        this.field_D = -1;
        try {
          this.renderer = ah.field_c.field_g;
          this.field_I = param2;
          this.setText(true, param0, true);
          this.field_J = true;
          this.field_H = km.correctedCurrentTimeMillis(-1);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final String getSelectedText(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 == 1) {
          var2 = this.field_G > this.field_C ? this.field_C : this.field_G;
          var3 = this.field_C >= this.field_G ? this.field_C : this.field_G;
          return this.text.substring(var2, var3);
        }
        return (String) null;
    }

    private final int findNextWordBoundary(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = Torquing.field_u;
        var2 = this.text.length();
        if (var2 == this.field_G) {
          return this.field_G;
        }
        for (var3 = this.field_G + 1; var2 > var3; var3++) {
          if (this.text.charAt(var3 - 1) != 32) {
            continue;
          }
          break;
        }
        if (param0 <= 45) {
          return 26;
        }
        return var3;
    }

    void updatePointer(int param0, UiWidget param1, int param2, int param3) {
        TextWidgetRenderer var7 = null;
        int var6 = 0;
        try {
          super.updatePointer(124, param1, param2, param3);
          this.scrollCaretIntoView(true);
          if (this.field_l == 1) {
            if (this.renderer instanceof TextWidgetRenderer) {
              var7 = (TextWidgetRenderer) ((Object) this.renderer);
              var6 = var7.findTextOffsetAtScreenPosition(k.field_e, -1, (UiWidget) (this), n.field_t, param2, param3);
              if (var6 != -1) {
                if (this.field_F &&
                  this.field_D > var6 &&
                  this.field_C < var6) {
                  var6 = this.field_D;
                }
                this.field_G = var6;
              }
            }
            this.field_H = km.correctedCurrentTimeMillis(-1);
          }
          int var5_int = -127 / ((-28 - param0) / 43);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "tk.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean handleKey(int param0, UiWidget param1, char param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_49_1 = 0;
        int stackIn_50_2 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          this.field_H = km.correctedCurrentTimeMillis(-1);
          if (param2 == 60) {
            return false;
          }
          if (62 == param2) {
            return false;
          }
          if (param2 >= 32 &&
            param2 <= 126) {
            if (this.field_G != this.field_C) {
              this.deleteSelection((byte) 127);
            }
            if (this.field_I == -1 ||
              !(this.text.length() >= this.field_I)) {
              if (this.field_G < this.text.length()) {
                this.text = this.text.substring(0, this.field_G) + param2 + this.text.substring(this.field_G, this.text.length());
                this.field_G = this.field_G + 1;
                this.field_C = this.field_G;
              } else {
                this.text = this.text + param2;
                dupTemp$0 = this.text.length();
                this.field_G = dupTemp$0;
                this.field_C = dupTemp$0;
              }
              this.notifyTextChanged(106);
            }
            return true;
          }
          if (param0 != 85) {
            if (param0 == 101) {
              if (this.field_G != this.field_C) {
                this.deleteSelection((byte) 119);
                return true;
              }
              if (this.field_G < this.text.length()) {
                this.field_C = this.field_G + 1;
                this.deleteSelection((byte) -1);
                return true;
              }
            } else {
              if (param0 == 13) {
                this.clearText((byte) 88);
                return true;
              }
              if (param0 == 96) {
                if (this.field_G > 0) {
                  stackIn_49_1 = -84;
                  if (!FullscreenStatusDialog.field_P[82]) {
                    stackIn_50_2 = this.field_G - 1;
                  } else {
                    stackIn_50_2 = this.findPreviousWordBoundary((byte) -127);
                  }
                  this.moveCaret((byte) stackIn_49_1, stackIn_50_2);
                  return true;
                }
              } else {
                if (param0 != 97) {
                  if (param0 == 102) {
                    this.moveCaret((byte) -62, 0);
                    return true;
                  }
                  if (param0 == 103) {
                    this.moveCaret((byte) -78, this.text.length());
                    return true;
                  }
                  if (84 == param0) {
                    this.submitText(123);
                    return true;
                  }
                  if (FullscreenStatusDialog.field_P[82] &&
                    param0 == 65) {
                    this.cutSelection(-1);
                    return true;
                  }
                  if (FullscreenStatusDialog.field_P[82] &&
                    param0 == 66) {
                    this.copySelection((byte) 102);
                    return true;
                  }
                  if (FullscreenStatusDialog.field_P[82] &&
                    param0 == 67) {
                    this.pasteClipboardText(-121);
                    return true;
                  }
                } else {
                  if (this.field_G < this.text.length()) {
                    stackIn_22_1 = -49;
                    if (!FullscreenStatusDialog.field_P[82]) {
                      stackIn_23_2 = this.field_G + 1;
                    } else {
                      stackIn_23_2 = this.findNextWordBoundary((byte) 74);
                    }
                    this.moveCaret((byte) stackIn_22_1, stackIn_23_2);
                    return true;
                  }
                }
              }
            }
          } else {
            if (this.field_G != this.field_C) {
              this.deleteSelection((byte) 125);
              return true;
            }
            if (this.field_G > 0) {
              this.field_C = this.field_G - 1;
              this.deleteSelection((byte) -106);
              return true;
            }
          }
          var5_int = -27 / ((param3 + 33) / 57);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_76_0 = var5;
          stackIn_76_1 = new StringBuilder().append("tk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void copySelection(byte param0) {
        try {
          String var2 = null;
          if (param0 >= 91) {
            var2 = this.getSelectedText(1);
            if (!(0 >= var2.length())) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText(1))), (java.awt.datatransfer.ClipboardOwner) null);
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void drawWidget(int param0, byte param1, int param2, int param3) {
        TextWidgetRenderer var9 = null;
        long var6 = 0L;
        if (param1 >= -7) {
          int[] var8 = (int[]) null;
          EditableTextField.a(-25, -56, 58, 91, 83, 87, (int[]) null, 74, (byte) 44);
        }
        if (null != this.renderer &&
          param0 == 0) {
          this.renderer.paintWidget(114, param2, param3, this.field_x, (UiWidget) (this));
          if (this.renderer instanceof TextWidgetRenderer) {
            var9 = (TextWidgetRenderer) ((Object) this.renderer);
            if (this.field_G != this.field_C) {
              var9.paintSelection(param3, this.field_G, this.field_C, -1419356520, param2, (UiWidget) (this));
            }
            var6 = km.correctedCurrentTimeMillis(-1);
            if ((-this.field_H + var6) % 1000L < 500L) {
              var9.paintCaret(param3, (UiWidget) (this), this.field_G, false, param2);
            }
          }
        }
    }

    private final void moveCaret(byte param0, int param1) {
        if (param0 > -25) {
          return;
        }
        this.field_G = param1;
        if (!FullscreenStatusDialog.field_P[81]) {
          this.field_C = this.field_G;
        }
    }

    final boolean pointerPressed(int param0, int param1, int param2, int param3, int param4, UiWidget param5, byte param6) {
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.pointerPressed(param0, param1, param2, param3, param4, param5, (byte) 70) &&
            this.renderer instanceof TextWidgetRenderer) {
            var8_int = ((TextWidgetRenderer) ((Object) this.renderer)).findTextOffsetAtScreenPosition(k.field_e, -1, (UiWidget) (this), n.field_t, param2, param1);
            stackIn_5_1 = -94;
            if (var8_int != -1) {
              stackIn_6_2 = var8_int;
            } else {
              stackIn_6_2 = 0;
            }
            this.moveCaret((byte) stackIn_5_1, stackIn_6_2);
            var8_long = km.correctedCurrentTimeMillis(-1);
            stackIn_9_1 = !(-this.field_E + var8_long >= 250L);
            this.field_F = stackIn_9_1;
            if (this.field_F) {
              this.field_C = this.findPreviousWordBoundary((byte) -122);
              this.field_G = this.findNextWordBoundary((byte) 88);
              if (this.field_G > 0 &&
                this.text.charAt(-1 + this.field_G) == 32) {
                this.field_G = this.field_G - 1;
              }
              this.field_D = this.field_G;
            }
            this.field_E = var8_long;
            return true;
          }
          if (param6 >= 5) {
            return false;
          }
          this.field_D = -86;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("tk.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param6).append(')').toString());
        }
    }

    final void clearText(byte param0) {
        if (param0 <= 45) {
          this.field_I = -75;
        }
        this.text = "";
        this.field_C = 0;
        this.field_G = 0;
        this.notifyTextChanged(-102);
    }

    private final void cutSelection(int param0) {
        this.copySelection((byte) 111);
        if (param0 != -1) {
          return;
        }
        this.deleteSelection((byte) 120);
    }

    void notifyTextChanged(int param0) {
        int var2 = -107 % ((param0 + 17) / 63);
        if (this.listener instanceof TextFieldListener) {
          ((TextFieldListener) (this.listener)).onTextChanged(88, this);
        }
    }

    private final void insertTextAtCaret(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (-1 != this.field_I) {
            var3_int = this.field_I - this.text.length();
            if (var3_int >= 0) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.field_G == this.text.length()) {
            this.text = this.text + param1;
          } else {
            this.text = this.text.substring(0, this.field_G) + param1 + this.text.substring(this.field_G, this.text.length());
          }
          this.field_G = this.field_G + param1.length();
          this.field_C = this.field_G;
          this.notifyTextChanged(param0 ^ -97);
          if (param0 != 0) {
            this.field_C = -100;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("tk.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void pasteClipboardText(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          int var3 = 0;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            var3 = -109 / ((46 - param0) / 51);
            this.deleteSelection((byte) -30);
            this.insertTextAtCaret(0, var2);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int findPreviousWordBoundary(byte param0) {
        int var2;
        int var3;
        var3 = Torquing.field_u;
        if (this.field_G == 0) {
          return this.field_G;
        }
        for (var2 = this.field_G - 1; var2 > 0; var2--) {
          if (this.text.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        if (param0 > -121) {
          this.cutSelection(52);
        }
        return var2;
    }

    static {
    }
}
