/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextInputWidget extends FocusableWidget {
    private long field_H;
    static String field_A;
    private int caret;
    private int field_F;
    private boolean field_E;
    private long field_G;
    private int selectionAnchor;
    private boolean field_D;
    static String[] field_z;
    private int maxLength;

    final void renderLayer(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        WidgetTextLayout var5 = null;
        RuntimeException var5_ref = null;
        long var6 = 0L;
        try {
          if (param2 != 0) {
            this.caret = 26;
          }
          if (this.field_r != null &&
            param3 == 0) {
            this.field_r.paintWidget((UiWidget) (this), param0, param2 ^ 16777215, param1, this.field_y);
            if (this.field_r instanceof WidgetTextLayout) {
              var5 = (WidgetTextLayout) ((Object) this.field_r);
              if (this.selectionAnchor != this.caret) {
                var5.drawSelection(-1, (UiWidget) (this), param1, param0, this.selectionAnchor, this.caret);
              }
              var6 = bva.currentTimeMillis((byte) -107);
              if ((-this.field_H + var6) % 1000L < 500L) {
                var5.drawCaret(this.caret, param1, param2 - 22502, param0, (UiWidget) (this));
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var5_ref), "tra.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean handleKeyInput(char param0, UiWidget param1, int param2, boolean param3) {
        int dupTemp$0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_104_1 = 0;
        int stackIn_105_2 = 0;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_121_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_H = bva.currentTimeMillis((byte) -107);
          if (param0 != 60 &&
            param0 != 62) {
            if (!param3) {
              this.field_F = 110;
            }
            if (param0 >= 32 &&
              param0 <= 126) {
              if (this.caret != this.selectionAnchor) {
                this.deleteSelection(0);
              }
              if (-1 == this.maxLength ||
                !(this.field_o.length() >= this.maxLength)) {
                boolean decompiledSharedTail0 = !(this.caret < this.field_o.length());
                if (!decompiledSharedTail0) {
                  this.field_o = this.field_o.substring(0, this.caret) + param0 + this.field_o.substring(this.caret, this.field_o.length());
                  this.caret = this.caret + 1;
                  this.selectionAnchor = this.caret;
                  decompiledSharedTail0 = (TombRacer.field_G);
                }
                if (decompiledSharedTail0) {
                  this.field_o = this.field_o + param0;
                  dupTemp$0 = this.field_o.length();
                  this.caret = dupTemp$0;
                  this.selectionAnchor = dupTemp$0;
                }
                this.notifySubmitted(200);
              }
              return true;
            }
            if (param2 != 85) {
              if (param2 == 101) {
                if (this.selectionAnchor != this.caret) {
                  this.deleteSelection(0);
                  return true;
                }
                if (this.caret < this.field_o.length()) {
                  this.selectionAnchor = 1 + this.caret;
                  this.deleteSelection(0);
                  return true;
                }
              } else {
                if (param2 == 13) {
                  this.clearText(23);
                  return true;
                }
                if (param2 == 96) {
                  if (0 < this.caret) {
                    stackIn_104_1 = 95;
                    if (!VerticalScrollbar.field_tb[82]) {
                      stackIn_105_2 = -1 + this.caret;
                    } else {
                      stackIn_105_2 = this.previousWordStart(param3);
                    }
                    this.setCaret(stackIn_104_1, stackIn_105_2);
                    return true;
                  }
                } else {
                  if (97 == param2) {
                    if (this.caret < this.field_o.length()) {
                      stackIn_95_1 = -126;
                      if (VerticalScrollbar.field_tb[82]) {
                        stackIn_96_2 = this.nextWordEnd(-59);
                      } else {
                        stackIn_96_2 = this.caret + 1;
                      }
                      this.setCaret(stackIn_95_1, stackIn_96_2);
                      return true;
                    }
                  } else {
                    if (param2 == 102) {
                      this.setCaret(-127, 0);
                      return true;
                    }
                    if (param2 == 103) {
                      this.setCaret(-123, this.field_o.length());
                      return true;
                    }
                    if (param2 == 84) {
                      this.notifyEnterPressed(93);
                      return true;
                    }
                    if (VerticalScrollbar.field_tb[82] &&
                      param2 == 65) {
                      this.cutSelection(10571);
                      return true;
                    }
                    if (VerticalScrollbar.field_tb[82] &&
                      param2 == 66) {
                      this.copySelectedTextToClipboard(0);
                      return true;
                    }
                    if (VerticalScrollbar.field_tb[82] &&
                      param2 == 67) {
                      this.pasteClipboardText(31);
                      return true;
                    }
                  }
                }
              }
            } else {
              if (this.selectionAnchor != this.caret) {
                this.deleteSelection(0);
                return true;
              }
              if (this.caret > 0) {
                this.selectionAnchor = -1 + this.caret;
                this.deleteSelection(0);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_120_0 = var5;
          stackIn_120_1 = new StringBuilder().append("tra.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_121_2 = "null";
          } else {
            stackIn_121_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_120_0), ((StringBuilder) (Object) stackIn_120_1).append(stackIn_121_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void paintNineSliceFrame(int param0, ToolkitSprite[] param1, byte param2, int param3, GraphicsToolkit param4, int param5, int param6, int param7, int param8, int param9) {
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_111_0 = 0;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        String stackIn_119_2 = null;
        StringBuilder stackIn_122_1 = null;
        String stackIn_123_2 = null;
        RuntimeException decompiledCaughtException = null;
        ClipStack var10 = null;
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
        var27 = TombRacer.field_G ? 1 : 0;
        try {
          var10 = IntrusiveDequeCursor.getClipStack((byte) 65, param4);
          if (param1 == null) {
            return;
          }
          if (param5 > 0 &&
            param7 > 0) {
            if (param1[3] == null) {
              stackIn_14_0 = 0;
            } else {
              stackIn_14_0 = param1[3].paddedWidth();
            }
            var11 = stackIn_14_0;
            if (null == param1[5]) {
              stackIn_18_0 = 0;
            } else {
              stackIn_18_0 = param1[5].paddedWidth();
            }
            var12 = stackIn_18_0;
            if (param1[1] == null) {
              stackIn_22_0 = 0;
            } else {
              stackIn_22_0 = param1[1].paddedHeight();
            }
            var13 = stackIn_22_0;
            if (null != param1[7]) {
              stackIn_26_0 = param1[7].paddedHeight();
            } else {
              stackIn_26_0 = 0;
            }
            var14 = stackIn_26_0;
            var15 = param3 + param5;
            var16 = param7 + param8;
            var17 = var11 + param3;
            var18 = -var12 + var15;
            var19 = var13 + param8;
            var20 = -var14 + var16;
            var21 = var17;
            var22 = var18;
            if (var21 > var22) {
              var22 = param3 + var11 * param5 / (var11 + var12);
              var21 = param3 + var11 * param5 / (var11 + var12);
            }
            var23 = var19;
            var24 = var20;
            if (var23 > var24) {
              var24 = var13 * param7 / (var13 + var14) + param8;
              var23 = var13 * param7 / (var13 + var14) + param8;
            }
            if (null != param1[0]) {
              var10.pushIntersectClip(var21, param8, (byte) -12, var23, param3);
              param1[0].draw(param3, param8, param0, param9, param6);
              var10.popClip(97);
            }
            if (null != param1[2]) {
              var10.pushIntersectClip(var15, param8, (byte) -12, var23, var22);
              param1[2].draw(var18, param8, param0, param9, param6);
              var10.popClip(-88);
            }
            if (param1[6] != null) {
              var10.pushIntersectClip(var21, var24, (byte) -12, var16, param3);
              param1[6].draw(param3, var20, param0, param9, param6);
              var10.popClip(-33);
            }
            if (null != param1[8]) {
              var10.pushIntersectClip(var15, var24, (byte) -12, var16, var22);
              param1[8].draw(var18, var20, param0, param9, param6);
              var10.popClip(-66);
            }
            boolean decompiledFrameCompleted4 = true;
            if (null != param1[1] &&
              param1[1].paddedWidth() != 0) {
              var10.pushIntersectClip(var22, param8, (byte) -12, var23, var21);
              var25 = var17;
              while (var25 < var18) {
                param1[1].draw(var25, param8, param0, param9, param6);
                var25 = var25 + param1[1].paddedWidth();
                if (var27 != 0) {
                  decompiledFrameCompleted4 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted4) {
                var10.popClip(100);
              }
            }
            boolean decompiledFrameCompleted3 = true;
            if (null != param1[7] &&
              0 != param1[7].paddedWidth()) {
              var10.pushIntersectClip(var22, var24, (byte) -12, var16, var21);
              var25Lifetime1 = var17;
              while (var25Lifetime1 < var18) {
                param1[7].draw(var25Lifetime1, var20, param0, param9, param6);
                var25Lifetime1 = var25Lifetime1 + param1[7].paddedWidth();
                if (var27 != 0) {
                  decompiledFrameCompleted3 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted3) {
                var10.popClip(121);
              }
            }
            boolean decompiledFrameCompleted2 = true;
            if (param1[3] != null &&
              param1[3].paddedHeight() != 0) {
              var10.pushIntersectClip(var21, var23, (byte) -12, var24, param3);
              var25Lifetime2 = var19;
              while (var25Lifetime2 < var20) {
                param1[3].draw(param3, var25Lifetime2, param0, param9, param6);
                var25Lifetime2 = var25Lifetime2 + param1[3].paddedHeight();
                if (var27 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted2) {
                var10.popClip(-83);
              }
            }
            boolean decompiledFrameCompleted1 = true;
            if (param1[5] != null &&
              param1[5].paddedHeight() != 0) {
              var10.pushIntersectClip(var15, var23, (byte) -12, var24, var22);
              var25Lifetime3 = var19;
              while (var20 > var25Lifetime3) {
                param1[5].draw(var18, var25Lifetime3, param0, param9, param6);
                var25Lifetime3 = var25Lifetime3 + param1[5].paddedHeight();
                if (var27 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                var10.popClip(99);
              }
            }
            boolean decompiledFrameCompleted0 = true;
            if (param1[4] != null &&
              0 != param1[4].paddedWidth() &&
              param1[4].paddedHeight() != 0) {
              var10.pushIntersectClip(var22, var23, (byte) -12, var24, var21);
              var25Lifetime4 = var19;
              while (var25Lifetime4 < var20) {
                stackIn_111_0 = var17;
                if (var27 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var26 = stackIn_111_0;
                while (var26 < var18) {
                  param1[4].draw(var26, var25Lifetime4, param0, param9, param6);
                  var26 = var26 + param1[4].paddedWidth();
                }
                var25Lifetime4 = var25Lifetime4 + param1[4].paddedHeight();
              }
              if (decompiledFrameCompleted0) {
                var10.popClip(123);
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_111_0 = param2;
            }
            if (stackIn_111_0 >= -39) {
              field_A = (String) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_118_0 = var10_ref;
          stackIn_118_1 = new StringBuilder().append("tra.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_119_2 = "null";
          } else {
            stackIn_119_2 = "{...}";
          }
          stackIn_122_1 = ((StringBuilder) (Object) stackIn_118_1).append(stackIn_119_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_123_2 = "null";
          } else {
            stackIn_123_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_118_0), ((StringBuilder) (Object) stackIn_122_1).append(stackIn_123_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    private final void copySelectedTextToClipboard(int param0) {
        try {
          RuntimeException runtimeException = null;
          String var2 = null;
          RuntimeException decompiledCaughtException = null;
          try {
            if (param0 != 0) {
              return;
            }
            var2 = this.getSelectedText(-106);
            if (var2.length() > 0) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText(86))), (java.awt.datatransfer.ClipboardOwner) null);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            runtimeException = decompiledCaughtException;
            throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "tra.O(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void ensureHardwareWaterNoise(int param0) {
        RuntimeException runtimeException = null;
        HardwareTurbulentWaterNoise var1 = null;
        byte[] var2 = null;
        RuntimeException decompiledCaughtException = null;
        HardwareRidgedWaterNoise var1_ref = null;
        byte[] var2Lifetime1;
        try {
          if (null == LoadLevelCommand.field_o) {
            var1_ref = new HardwareRidgedWaterNoise();
            var2 = var1_ref.generate(128, true, 16, 128);
            LoadLevelCommand.field_o = bw.wrapByteStorage(270, var2, false);
          }
          if (param0 != 12890) {
            return;
          }
          if (LoadingStep.field_f == null) {
            var1 = new HardwareTurbulentWaterNoise();
            var2Lifetime1 = var1.generate(128, 0, 16, 128);
            LoadingStep.field_f = bw.wrapByteStorage(270, var2Lifetime1, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "tra.V(" + param0 + ')');
        }
    }

    private final void scrollToCaret(byte param0) {
        RuntimeException decompiledCaughtException = null;
        WidgetTextLayout var2 = null;
        RuntimeException var2_ref = null;
        TextBlockLayout var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.field_D) {
            this.field_t = 0;
            this.field_j = 0;
            return;
          }
          if (!(this.field_r instanceof WidgetTextLayout)) {
            return;
          }
          var2 = (WidgetTextLayout) ((Object) this.field_r);
          var3 = var2.ensureTextLayout((UiWidget) (this), 14157);
          var4 = var3.getMaxLineWidth(0);
          var5 = var2.getAvailableTextWidth((byte) 117, (UiWidget) (this));
          var6 = var2.getLineInkHeight((byte) -90) >> 1;
          var7 = 28 / ((param0 - 47) / 36);
          if (var4 < -var6 + var5) {
            this.field_j = 0;
            this.field_t = 0;
            return;
          }
          var8 = this.field_t + var3.getCaretX((byte) -59, this.caret);
          if (var8 <= var5 - var6) {
            if (!(var6 <= var8)) {
              this.field_t = this.field_t + (var6 - var8);
              if (var9 != 0) {
                this.field_t = this.field_t - var8 + (var5 - var6);
              }
            }
          } else {
            this.field_t = this.field_t - var8 + (var5 - var6);
          }
          if (0 >= this.field_t) {
            if (this.field_t >= var6 - var5) {
              return;
            }
            this.field_t = -var5 + var6;
            if (var9 == 0) {
              return;
            }
          }
          this.field_t = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2_ref), "tra.LA(" + param0 + ')');
        }
    }

    private final void deleteSelection(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          if (param0 != 0) {
            TextInputWidget.g((byte) 76);
          }
          if (this.selectionAnchor != this.caret) {
            if (this.caret <= this.selectionAnchor) {
              stackIn_10_0 = this.caret;
            } else {
              stackIn_10_0 = this.selectionAnchor;
            }
            var2_int = stackIn_10_0;
            if (this.selectionAnchor >= this.caret) {
              stackIn_14_0 = this.selectionAnchor;
            } else {
              stackIn_14_0 = this.caret;
            }
            var3 = stackIn_14_0;
            this.caret = var2_int;
            this.selectionAnchor = var2_int;
            this.field_o = this.field_o.substring(0, var2_int) + this.field_o.substring(var3, this.field_o.length());
            this.notifySubmitted(200);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2), "tra.NA(" + param0 + ')');
        }
    }

    private final void setCaret(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 36 / ((-89 - param0) / 32);
          this.caret = param1;
          if (!VerticalScrollbar.field_tb[81]) {
            this.selectionAnchor = this.caret;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "tra.OA(" + param0 + ',' + param1 + ')');
        }
    }

    void updatePointerState(int param0, int param1, UiWidget param2, int param3) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        WidgetTextLayout var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.scrollToCaret((byte) -105);
          if (this.field_s == 1) {
            if (this.field_r instanceof WidgetTextLayout) {
              var5 = (WidgetTextLayout) ((Object) this.field_r);
              var6 = var5.hitTestCaretIndex((UiWidget) (this), (byte) 4, GridWidgetContainer.field_B, param0, param3, AgeValidator.field_j);
              if (var6 != -1) {
                if (this.field_E &&
                  var6 < this.field_F &&
                  var6 > this.selectionAnchor) {
                  var6 = this.field_F;
                }
                this.caret = var6;
              }
            }
            this.field_H = bva.currentTimeMillis((byte) -107);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("tra.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean handlePointerPress(int param0, int param1, int param2, int param3, int param4, UiWidget param5, int param6) {
        int stackIn_10_1 = 0;
        int stackIn_11_2 = 0;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (param0 <= 70) {
            this.clearText(18);
          }
          if (super.handlePointerPress(92, param1, param2, param3, param4, param5, param6) &&
            this.field_r instanceof WidgetTextLayout) {
            var8_int = ((WidgetTextLayout) ((Object) this.field_r)).hitTestCaretIndex((UiWidget) (this), (byte) 4, GridWidgetContainer.field_B, param1, param2, AgeValidator.field_j);
            stackIn_10_1 = 60;
            if (-1 == var8_int) {
              stackIn_11_2 = 0;
            } else {
              stackIn_11_2 = var8_int;
            }
            this.setCaret(stackIn_10_1, stackIn_11_2);
            var8_long = bva.currentTimeMillis((byte) -107);
            stackIn_15_1 = !(250L <= -this.field_G + var8_long);
            this.field_E = stackIn_15_1;
            if (this.field_E) {
              this.selectionAnchor = this.previousWordStart(true);
              this.caret = this.nextWordEnd(-76);
              if (this.caret > 0 &&
                this.field_o.charAt(-1 + this.caret) == 32) {
                this.caret = this.caret - 1;
              }
              this.field_F = this.caret;
            }
            this.field_G = var8_long;
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_32_0 = var8;
          stackIn_32_1 = new StringBuilder().append("tra.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param6).append(')').toString());
        }
    }

    private final void notifyEnterPressed(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 54 / ((param0 - 31) / 62);
          if (this.field_h instanceof TextInputListener) {
            ((TextInputListener) (this.field_h)).onEnterPressed(-6038, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "tra.SA(" + param0 + ')');
        }
    }

    private final void pasteClipboardText(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          try {
            try {
              var3 = -61 % ((-29 - param0) / 55);
              var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
              this.deleteSelection(0);
              this.insertText(var2, false);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2_ref2), "tra.H(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int previousWordStart(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        char stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_6_0;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          if (0 == this.caret) {
            stackIn_3_0 = this.caret;
            return stackIn_3_0;
          }
          var2_int = -1 + this.caret;
          scanLoop1: while (true) {
            if (0 < var2_int) {
              stackOut_6_0 = this.field_o.charAt(var2_int - 1);
              stackIn_14_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_14_1 = 32;
              if (var3 != 0) {
                break scanLoop1;
              }
              if (stackIn_7_0 != stackIn_14_1) {
                var2_int--;
                continue;
              }
            }
            stackIn_14_0 = param0 ? 1 : 0;
            stackIn_14_1 = 1;
            break;
          }
          if (stackIn_14_0 != stackIn_14_1) {
            this.field_F = -50;
          }
          stackIn_18_0 = var2_int;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2), "tra.F(" + param0 + ')');
        }
    }

    void notifySubmitted(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 200) {
            this.deleteSelection(-51);
          }
          if (this.field_h instanceof TextInputListener) {
            ((TextInputListener) (this.field_h)).onTextChanged(this, -10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2), "tra.M(" + param0 + ')');
        }
    }

    private final void insertText(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.maxLength != -1) {
            var3_int = this.maxLength - this.field_o.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          boolean decompiledSharedTail0 = (~this.caret != ~this.field_o.length());
          if (!decompiledSharedTail0) {
            this.field_o = this.field_o + param0;
            decompiledSharedTail0 = (TombRacer.field_G);
          }
          if (decompiledSharedTail0) {
            this.field_o = this.field_o.substring(0, this.caret) + param0 + this.field_o.substring(this.caret, this.field_o.length());
          }
          this.caret = this.caret + param0.length();
          if (param1) {
            this.pasteClipboardText(104);
          }
          this.selectionAnchor = this.caret;
          this.notifySubmitted(200);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("tra.J(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void cutSelection(int param0) {
        try {
          this.copySelectedTextToClipboard(0);
          this.deleteSelection(param0 ^ param0);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "tra.QA(" + param0 + ')');
        }
    }

    final void setText(boolean param0, int param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (null == param2) {
            param2 = "";
          }
          if (param1 != -16719) {
            this.field_D = false;
          }
          this.field_o = param2;
          var4_int = param2.length();
          if (-1 != this.maxLength &&
            var4_int > this.maxLength) {
            this.field_o = this.field_o.substring(0, this.maxLength);
          }
          dupTemp$1 = this.field_o.length();
          this.selectionAnchor = dupTemp$1;
          this.caret = dupTemp$1;
          if (!param0) {
            this.notifySubmitted(param1 ^ -16775);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("tra.MA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void g(byte param0) {
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          boolean decompiledSharedTail0 = !(MatchState.field_w <= 32);
          if (!decompiledSharedTail0) {
            S2CRoundResultPacket.setSoundVolume(0, param0 + 8);
            decompiledSharedTail0 = (TombRacer.field_G);
          }
          if (decompiledSharedTail0) {
            var1_int = MatchState.field_w % 32;
            if (0 == var1_int) {
              var1_int = 32;
            }
            S2CRoundResultPacket.setSoundVolume(-var1_int + MatchState.field_w, param0 - 1);
          }
          if (param0 != -113) {
            TextInputWidget.ensureHardwareWaterNoise(-73);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var1), "tra.RA(" + param0 + ')');
        }
    }

    final void clearText(int param0) {
        try {
          this.field_o = "";
          this.caret = 0;
          int var2_int = -100 % ((param0 + 80) / 39);
          this.selectionAnchor = 0;
          this.notifySubmitted(200);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "tra.KA(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        try {
          field_z = null;
          field_A = null;
          int var1_int = 88 / ((-30 - param0) / 62);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "tra.N(" + param0 + ')');
        }
    }

    TextInputWidget(String param0, WidgetListener param1, int param2) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_F = -1;
        this.field_E = false;
        this.field_G = 0L;
        try {
          this.field_r = afa.field_c.field_e;
          this.maxLength = param2;
          this.setText(true, -16719, param0);
          this.field_D = true;
          this.field_H = bva.currentTimeMillis((byte) -107);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("tra.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int nextWordEnd(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = this.field_o.length();
          if (var2_int == this.caret) {
            stackIn_3_0 = this.caret;
            return stackIn_3_0;
          }
          var3 = 99 / ((param0 - 37) / 56);
          var4 = 1 + this.caret;
          scanLoop1: while (true) {
            if (var2_int > var4) {
              stackIn_14_0 = ~this.field_o.charAt(-1 + var4);
              if (var5 != 0) {
                break scanLoop1;
              }
              if (stackIn_14_0 != -33) {
                var4++;
                continue;
              }
            }
            stackIn_14_0 = var4;
            break;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2), "tra.PA(" + param0 + ')');
        }
    }

    private final String getSelectedText(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        String stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = -77 / ((param0 + 20) / 55);
          if (this.caret > this.selectionAnchor) {
            stackIn_4_0 = this.selectionAnchor;
          } else {
            stackIn_4_0 = this.caret;
          }
          var2_int = stackIn_4_0;
          if (this.caret > this.selectionAnchor) {
            stackIn_8_0 = this.caret;
          } else {
            stackIn_8_0 = this.selectionAnchor;
          }
          var4 = stackIn_8_0;
          stackIn_9_0 = this.field_o.substring(var2_int, var4);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2), "tra.U(" + param0 + ')');
        }
    }

    static {
        field_A = "Players: <%0>/<%1>";
        field_z = new String[]{null, "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "Esc", null, null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "`", null, null, null, "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", null, null, null, null, "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'", "#", null, null, null, null, "Z", "X", "C", "V", "B", "N", "M", "<", ">", "/", "\\", null, null, null, null, null, "Tab", "Shift", "Ctrl", "Space", "Enter", "Backspace", "Alt", "Keypad +", "Keypad -", "Keypad *", "Keypad /", "Keypad 5", null, null, null, null, "Left Arrow", "Right Arrow", "Up Arrow", "Down Arrow", "Insert", "Delete", "Home", "End", "Page Up", "Page Down", null, null, null, null, null, null};
    }
}
