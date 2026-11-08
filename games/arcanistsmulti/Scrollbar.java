/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Scrollbar extends ArrayWidgetContainer implements ButtonListener {
    int field_Z;
    int field_L;
    static String field_S;
    private boolean field_Y;
    private TextButton field_H;
    static String field_I;
    private boolean field_Q;
    private DraggableWidget field_db;
    private int field_V;
    private int field_bb;
    private TextButton field_cb;
    static String[][] field_P;
    static int field_M;
    private int field_W;
    private TextButton field_R;
    private TextButton field_O;
    int field_T;
    private int field_J;
    private boolean field_X;
    private int field_eb;
    static int field_N;
    static int field_U;
    private TextButton field_ab;

    private final void scrollBy(int param0, int param1) {
        this.setValue((byte) -6, param1);
        if (this.field_o instanceof ScrollbarListener) {
          ((ScrollbarListener) (this.field_o)).onScrollValueChanged(this.field_L, this.field_L, this, false);
        }
        if (param0 == -780737471) {
          return;
        }
        this.field_W = 73;
    }

    private final void updateHorizontalButtons(int param0, boolean param1) {
        TextButton stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        TextButton stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        TextButton stackIn_18_0 = null;
        boolean stackIn_21_1 = false;
        TextButton stackIn_26_0 = null;
        boolean stackIn_27_1 = false;
        TextButton stackIn_31_0 = null;
        boolean stackIn_32_1 = false;
        TextButton stackIn_39_0 = null;
        boolean stackIn_41_1 = false;
        TextButton stackIn_48_0 = null;
        boolean stackIn_49_1 = false;
        TextButton stackIn_53_0 = null;
        boolean stackIn_54_1 = false;
        TextButton stackIn_62_0 = null;
        boolean stackIn_64_1 = false;
        TextButton stackIn_69_0 = null;
        boolean stackIn_70_1 = false;
        TextButton stackIn_74_0 = null;
        boolean stackIn_75_1 = false;
        stackIn_39_0 = this.field_cb;
        if (param1) {
          stackIn_41_1 = true;
        } else {
          if (this.field_Y) {
            stackIn_39_0.field_B = true;
            boolean decompiledFrameRemainder1 = true;
            if (this.field_db.field_B instanceof TextButton) {
              stackIn_18_0 = (TextButton) (this.field_db.field_B);
              if (param1) {
                stackIn_18_0.field_B = true;
                if (null != this.field_O) {
                  stackIn_8_0 = this.field_O;
                  stackIn_9_1 = (!param1) ? false : true;
                  stackIn_8_0.field_B = stackIn_9_1;
                }
                if (null != this.field_H) {
                  stackIn_13_0 = this.field_H;
                  stackIn_14_1 = (!param1) ? false : true;
                  stackIn_13_0.field_B = stackIn_14_1;
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                stackIn_21_1 = (!this.field_Y) ? false : true;
                stackIn_18_0.field_B = stackIn_21_1;
              }
            }
            if (decompiledFrameRemainder1) {
              if (null != this.field_O) {
                stackIn_26_0 = this.field_O;
                stackIn_27_1 = (!param1) ? false : true;
                stackIn_26_0.field_B = stackIn_27_1;
              }
              if (null == this.field_H) {
                if (param0 == 0) {
                  return;
                }
                field_N = -32;
                return;
              }
              stackIn_31_0 = this.field_H;
              stackIn_32_1 = (!param1) ? false : true;
              stackIn_31_0.field_B = stackIn_32_1;
            }
            if (param0 != 0) {
              field_N = -32;
            }
            return;
          }
          stackIn_41_1 = false;
        }
        stackIn_39_0.field_B = stackIn_41_1;
        boolean decompiledFrameRemainder0 = true;
        if (this.field_db.field_B instanceof TextButton) {
          stackIn_62_0 = (TextButton) (this.field_db.field_B);
          if (param1) {
            stackIn_64_1 = true;
          } else {
            if (this.field_Y) {
              stackIn_62_0.field_B = true;
              if (null != this.field_O) {
                stackIn_48_0 = this.field_O;
                stackIn_49_1 = (!param1) ? false : true;
                stackIn_48_0.field_B = stackIn_49_1;
              }
              if (null != this.field_H) {
                stackIn_53_0 = this.field_H;
                stackIn_54_1 = (!param1) ? false : true;
                stackIn_53_0.field_B = stackIn_54_1;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_64_1 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_62_0.field_B = stackIn_64_1;
          }
        }
        if (decompiledFrameRemainder0) {
          if (null != this.field_O) {
            stackIn_69_0 = this.field_O;
            stackIn_70_1 = (!param1) ? false : true;
            stackIn_69_0.field_B = stackIn_70_1;
          }
          if (null != this.field_H) {
            stackIn_74_0 = this.field_H;
            stackIn_75_1 = (!param1) ? false : true;
            stackIn_74_0.field_B = stackIn_75_1;
          }
        }
        if (param0 == 0) {
          return;
        }
        field_N = -32;
    }

    final void setVisibleRange(int param0, int param1, byte param2) {
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        if (param1 <= param0) {
          this.field_db.setBounds(this.field_db.field_k, this.field_db.field_j, this.field_cb.field_v, this.field_db.field_n, -68);
          this.updateHorizontalButtons(0, false);
          var4 = 44 / ((param2 - 86) / 32);
          this.layoutHorizontalThumb(-1844589680);
          return;
        }
        var4Lifetime1 = this.field_cb.field_v * param0 / param1;
        if (var4Lifetime1 < this.field_W) {
          var4Lifetime1 = this.field_W;
        }
        this.field_db.setBounds(this.field_db.field_k, this.field_db.field_j, var4Lifetime1, this.field_db.field_n, -121);
        this.updateHorizontalButtons(0, true);
        var4Lifetime2 = 44 / ((param2 - 86) / 32);
        this.layoutHorizontalThumb(-1844589680);
    }

    final boolean focusNext(int param0, UiComponent param1) {
        DraggableWidget var3 = null;
        RuntimeException var3_ref = null;
        UiComponent var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_db;
          if (param0 != 0) {
            var4 = (UiComponent) null;
            this.updatePointer((UiComponent) null, 32, -61, -41);
          }
          if (var3 != null &&
            ((UiComponent) ((Object) var3)).focusNext(0, param1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ma.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void setVisibleFraction(int param0, byte param1, int param2) {
        int var4 = 0;
        if (param2 < param0) {
          var4 = param2 * this.field_cb.field_k / param0;
          if (var4 < this.field_J) {
            var4 = this.field_J;
          }
          this.field_db.setBounds(var4, this.field_db.field_j, this.field_db.field_v, this.field_db.field_n, -125);
          this.updateVerticalButtons(8, true);
          this.layoutVerticalThumb((byte) -128);
          if (param1 != -42) {
            Scrollbar.openDisplayNameForm(-40);
            return;
          }
          return;
        }
        this.field_db.setBounds(this.field_cb.field_k, this.field_db.field_j, this.field_db.field_v, this.field_db.field_n, -54);
        this.updateVerticalButtons(8, false);
        this.layoutVerticalThumb((byte) -128);
        if (param1 != -42) {
          Scrollbar.openDisplayNameForm(-40);
          return;
        }
    }

    final boolean handleKeyInput(UiComponent param0, byte param1, char param2, int param3) {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (super.handleKeyInput(param0, (byte) -127, param2, param3)) {
            return true;
          }
          if (param1 > -120) {
            this.field_db = (DraggableWidget) null;
          }
          if (this.field_X) {
            if (!this.field_db.isFocused(-2116)) {
              return false;
            }
            if (98 == param3) {
              this.scrollBy(-780737471, this.field_L - this.field_T);
              return true;
            }
            if (param3 == 99) {
              this.scrollBy(-780737471, this.field_L + this.field_T);
              return true;
            }
            if (param3 == 96) {
              this.setValueAndNotify((byte) -125, this.field_Z - this.field_eb);
              return true;
            }
            if (97 == param3) {
              this.setValueAndNotify((byte) -128, this.field_Z + this.field_eb);
              return true;
            }
            if (param3 == 104) {
              this.scrollBy(-780737471, this.field_L - this.thumbFraction((byte) 107));
              return true;
            }
            if (param3 == 105) {
              this.scrollBy(-780737471, this.field_L + this.thumbFraction((byte) 110));
              return true;
            }
            if (param3 != 102) {
              if (param3 == 103) {
                if (this.field_Y &&
                  RasterSetupHelpers.field_b[82]) {
                  this.scrollBy(-780737471, 65536);
                  return true;
                }
                if (this.field_Q) {
                  this.setValueAndNotify((byte) -124, 65536);
                  return true;
                }
              }
            } else {
              if (this.field_Y &&
                RasterSetupHelpers.field_b[82]) {
                this.scrollBy(-780737471, 0);
                return true;
              }
              if (this.field_Q) {
                this.setValueAndNotify((byte) -125, 0);
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_50_0 = var5;
          stackIn_50_1 = new StringBuilder().append("ma.N(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void updatePointer(UiComponent param0, int param1, int param2, int param3) {
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var5_intLifetime1;
        int var5_intLifetime2;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          super.updatePointer(param0, param1, param2, param3);
          if ((!(this.field_db.field_B instanceof TextButton) ||
            ((TextButton) (this.field_db.field_B)).field_B) && this.field_db.field_t == 1) {
            if (!this.field_Q) {
              this.layoutHorizontalThumb(-1844589680);
            } else {
              var5_int = this.field_Z;
              this.layoutHorizontalParts(0);
              if (var5_int != this.field_Z &&
                this.field_o instanceof ScrollbarListener) {
                ((ScrollbarListener) (this.field_o)).onScrollbarAction(14372, this.field_Z, this.field_Z, this);
              }
            }
            if (this.field_Y) {
              var5_intLifetime2 = this.field_L;
              this.layoutVerticalParts((byte) -91);
              if (var5_intLifetime2 != this.field_L &&
                this.field_o instanceof ScrollbarListener) {
                ((ScrollbarListener) (this.field_o)).onScrollbarAction(param2 + 14202, this.field_Z, this.field_L, this);
              }
            } else {
              this.layoutVerticalThumb((byte) -128);
            }
          }
          if (this.field_cb.field_B &&
            this.field_cb.field_F == 1) {
            if (!this.field_Y) {
              if (this.field_Q) {
                if (EmailLoginCredentials.field_g > param1 - (-this.field_db.field_n - (this.field_db.field_v >> 1))) {
                  this.setValueAndNotify((byte) -125, this.field_Z + this.field_V);
                } else {
                  this.setValueAndNotify((byte) -127, -this.field_V + this.field_Z);
                }
              }
            } else {
              if (!this.field_Q) {
                if (MenuButtonPanel.field_I > (this.field_db.field_k >> 1) + param3 + this.field_db.field_j) {
                  this.scrollBy(param2 - 780737641, this.field_bb + this.field_L);
                } else {
                  this.scrollBy(param2 - 780737641, -this.field_bb + this.field_L);
                }
              } else {
                var5_intLifetime1 = -this.field_n + (EmailLoginCredentials.field_g - param1) + (-(this.field_db.field_v >> 1) - this.field_db.field_n);
                var6 = MenuButtonPanel.field_I - param3 - (this.field_j - (-this.field_db.field_j - (this.field_db.field_k >> 1)));
                if (Math.abs(var6) <= Math.abs(var5_intLifetime1)) {
                  if (var5_intLifetime1 <= 0) {
                    this.setValueAndNotify((byte) -126, -this.field_V + this.field_Z);
                  } else {
                    this.setValueAndNotify((byte) -124, this.field_Z + this.field_V);
                  }
                } else {
                  if (0 >= var6) {
                    this.scrollBy(-780737471, -this.field_bb + this.field_L);
                  } else {
                    this.scrollBy(param2 - 780737641, this.field_bb + this.field_L);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_40_0 = var5;
          stackIn_40_1 = new StringBuilder().append("ma.E(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void updateVerticalButtons(int param0, boolean param1) {
        TextButton stackIn_8_0 = null;
        TextButton stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        TextButton stackIn_18_0 = null;
        boolean stackIn_21_1 = false;
        TextButton stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        TextButton stackIn_34_0 = null;
        boolean stackIn_35_1 = false;
        TextButton stackIn_39_0 = null;
        boolean stackIn_40_1 = false;
        TextButton stackIn_44_0 = null;
        boolean stackIn_46_1 = false;
        TextButton stackIn_53_0 = null;
        boolean stackIn_54_1 = false;
        TextButton stackIn_58_0 = null;
        boolean stackIn_59_1 = false;
        TextButton stackIn_67_0 = null;
        boolean stackIn_68_1 = false;
        TextButton stackIn_72_0 = null;
        boolean stackIn_74_1 = false;
        TextButton stackIn_78_0 = null;
        boolean stackIn_79_1 = false;
        TextButton stackIn_83_0 = null;
        boolean stackIn_84_1 = false;
        TextButton stackIn_92_0 = null;
        boolean stackIn_93_1 = false;
        stackIn_44_0 = this.field_cb;
        if (param1) {
          stackIn_46_1 = true;
        } else {
          if (this.field_Q) {
            stackIn_44_0.field_B = true;
            if (this.field_db.field_B instanceof TextButton) {
              stackIn_18_0 = (TextButton) (this.field_db.field_B);
              if (param1) {
                stackIn_18_0.field_B = true;
                if (this.field_ab != null) {
                  stackIn_8_0 = this.field_ab;
                  stackIn_8_0.field_B = true;
                }
                if (param0 != 8) {
                  return;
                }
                if (null != this.field_R) {
                  stackIn_13_0 = this.field_R;
                  stackIn_14_1 = (!param1) ? false : true;
                  stackIn_13_0.field_B = stackIn_14_1;
                }
                return;
              }
              stackIn_21_1 = (!this.field_Q) ? false : true;
              stackIn_18_0.field_B = stackIn_21_1;
            }
            if (this.field_ab == null) {
              if (param0 != 8) {
                return;
              }
              if (null != this.field_R) {
                stackIn_27_0 = this.field_R;
                stackIn_28_1 = (!param1) ? false : true;
                stackIn_27_0.field_B = stackIn_28_1;
              }
              return;
            }
            stackIn_34_0 = this.field_ab;
            stackIn_35_1 = (!param1) ? false : true;
            stackIn_34_0.field_B = stackIn_35_1;
            if (param0 != 8) {
              return;
            }
            if (null != this.field_R) {
              stackIn_39_0 = this.field_R;
              stackIn_40_1 = (!param1) ? false : true;
              stackIn_39_0.field_B = stackIn_40_1;
            }
            return;
          }
          stackIn_46_1 = false;
        }
        stackIn_44_0.field_B = stackIn_46_1;
        if (this.field_db.field_B instanceof TextButton) {
          stackIn_72_0 = (TextButton) (this.field_db.field_B);
          if (param1) {
            stackIn_74_1 = true;
          } else {
            if (this.field_Q) {
              stackIn_72_0.field_B = true;
              if (this.field_ab == null) {
                if (param0 != 8) {
                  return;
                }
                if (null != this.field_R) {
                  stackIn_67_0 = this.field_R;
                  stackIn_68_1 = (!param1) ? false : true;
                  stackIn_67_0.field_B = stackIn_68_1;
                }
                return;
              }
              stackIn_53_0 = this.field_ab;
              stackIn_54_1 = (!param1) ? false : true;
              stackIn_53_0.field_B = stackIn_54_1;
              if (param0 != 8) {
                return;
              }
              if (null != this.field_R) {
                stackIn_58_0 = this.field_R;
                stackIn_59_1 = (!param1) ? false : true;
                stackIn_58_0.field_B = stackIn_59_1;
              }
              return;
            }
            stackIn_74_1 = false;
          }
          stackIn_72_0.field_B = stackIn_74_1;
        }
        if (this.field_ab == null) {
          if (param0 != 8) {
            return;
          }
          if (null != this.field_R) {
            stackIn_92_0 = this.field_R;
            stackIn_93_1 = (!param1) ? false : true;
            stackIn_92_0.field_B = stackIn_93_1;
          }
          return;
        }
        stackIn_78_0 = this.field_ab;
        stackIn_79_1 = (!param1) ? false : true;
        stackIn_78_0.field_B = stackIn_79_1;
        if (param0 != 8) {
          return;
        }
        if (null != this.field_R) {
          stackIn_83_0 = this.field_R;
          stackIn_84_1 = (!param1) ? false : true;
          stackIn_83_0.field_B = stackIn_84_1;
        }
    }

    private final void layoutHorizontalParts(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 == 0) {
          var2 = null != this.field_O ? this.field_O.field_n + this.field_O.field_v : this.field_cb.field_n;
          var3 = this.field_H == null ? this.field_cb.field_v + (this.field_cb.field_n - this.field_db.field_v) : -this.field_db.field_v + this.field_H.field_n;
          this.setSecondaryValue(1, var2 >= var3 ? 0 : (this.field_db.field_n - var2 << 16) / (var3 - var2));
          return;
        }
        Scrollbar.openDisplayNameForm(62);
        var2Lifetime1 = null != this.field_O ? this.field_O.field_n + this.field_O.field_v : this.field_cb.field_n;
        var3Lifetime1 = this.field_H == null ? this.field_cb.field_v + (this.field_cb.field_n - this.field_db.field_v) : -this.field_db.field_v + this.field_H.field_n;
        this.setSecondaryValue(1, var2Lifetime1 >= var3Lifetime1 ? 0 : (this.field_db.field_n - var2Lifetime1 << 16) / (var3Lifetime1 - var2Lifetime1));
    }

    Scrollbar(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetPainter param5, WidgetPainter param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        DraggableWidget dupTemp$0 = null;
        TextButton dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.field_Z = 32768;
        this.field_L = 32768;
        this.field_bb = 8192;
        this.field_V = 8192;
        this.field_W = 0;
        this.field_eb = 1024;
        this.field_T = 1024;
        this.field_J = 0;
        this.field_X = true;
        try {
          this.field_z = new UiComponent[6];
          dupTemp$0 = new DraggableWidget(param0, param1, param7, param8, (WidgetPainter) null, (UiListener) null, new TextButton(0, 0, param7, param8, param6, (UiListener) null), false, false);
          this.field_db = dupTemp$0;
          this.field_z[0] = (UiComponent) ((Object) dupTemp$0);
          dupTemp$1 = new TextButton(param0, param1, param7, param8, param5, (UiListener) null);
          this.field_cb = dupTemp$1;
          this.field_z[1] = (UiComponent) ((Object) dupTemp$1);
          stackIn_4_1 = (param11);
          this.field_Q = stackIn_4_1;
          this.field_J = param10;
          stackIn_7_1 = (param12);
          this.field_Y = stackIn_7_1;
          this.field_W = param9;
          this.setSecondaryValue(1, param13);
          this.setValue((byte) -6, param14);
          this.setBounds(param3, param1, param2, param0, -59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_11_0 = var16;
          stackIn_11_1 = new StringBuilder().append("ma.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    final void layoutChildren(int param0) {
        int var3;
        UiComponent var4;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < 17) {
          var4 = (UiComponent) null;
          this.focusNext(11, (UiComponent) null);
        }
        if (this.field_O == null) {
          this.field_cb.field_n = 0;
        } else {
          this.field_O.field_n = 0;
          this.field_O.field_j = this.field_k - this.field_O.field_k >> 1;
          this.field_cb.field_n = this.field_O.field_n + this.field_O.field_v;
        }
        if (null == this.field_H) {
          this.field_cb.field_v = -this.field_cb.field_n + this.field_v;
          this.layoutHorizontalThumb(-1844589680);
          if (this.field_ab != null) {
            this.field_ab.field_j = 0;
            this.field_ab.field_n = -this.field_ab.field_v + this.field_v >> 1;
            this.field_cb.field_j = this.field_ab.field_k + this.field_ab.field_j;
          } else {
            this.field_cb.field_j = 0;
          }
        } else {
          this.field_H.field_j = this.field_k - this.field_H.field_k >> 1;
          this.field_H.field_n = -this.field_H.field_v + this.field_v;
          this.field_cb.field_v = -this.field_H.field_v - this.field_cb.field_n + this.field_v;
          this.layoutHorizontalThumb(-1844589680);
          if (this.field_ab == null) {
            this.field_cb.field_j = 0;
          } else {
            this.field_ab.field_j = 0;
            this.field_ab.field_n = -this.field_ab.field_v + this.field_v >> 1;
            this.field_cb.field_j = this.field_ab.field_k + this.field_ab.field_j;
          }
        }
        if (null != this.field_R) {
          this.field_R.field_j = this.field_k - this.field_R.field_k;
          this.field_R.field_n = this.field_v - this.field_R.field_v >> 1;
          this.field_cb.field_k = this.field_k - (this.field_cb.field_j + this.field_R.field_k);
        } else {
          this.field_cb.field_k = -this.field_cb.field_j + this.field_k;
        }
        this.layoutVerticalThumb((byte) 43);
        if (!this.field_Q) {
          this.field_db.field_v = this.field_cb.field_v;
          this.field_db.field_n = 0;
        }
        if (!this.field_Y) {
          this.field_db.field_k = this.field_cb.field_k;
          this.field_db.field_j = 0;
        }
        this.field_db.refreshLayout((byte) 127);
    }

    private final void setSecondaryValue(int param0, int param1) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 1) {
          this.field_V = -24;
          if (param1 < 0) {
            this.field_Z = 0;
            this.layoutHorizontalThumb(param0 - 1844589681);
            return;
          }
          if (param1 <= 65536) {
            this.field_Z = param1;
            this.layoutHorizontalThumb(param0 - 1844589681);
            return;
          }
          this.field_Z = 65536;
          this.layoutHorizontalThumb(param0 - 1844589681);
          return;
        }
        if (param1 < 0) {
          this.field_Z = 0;
          this.layoutHorizontalThumb(param0 - 1844589681);
          return;
        }
        if (param1 <= 65536) {
          this.field_Z = param1;
          this.layoutHorizontalThumb(param0 - 1844589681);
          return;
        }
        this.field_Z = 65536;
        this.layoutHorizontalThumb(param0 - 1844589681);
    }

    public static void releaseStatics(byte param0) {
        field_S = null;
        field_P = (String[][]) null;
        field_I = null;
        if (param0 != 54) {
          String var2 = (String) null;
          Scrollbar.queueTimedMessage((String) null, 123, (byte) 33);
        }
    }

    final static NineSliceHelpers[] readPackedEntries(byte param0, CipherPacketBuffer param1) {
        NineSliceHelpers[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        NineSliceHelpers[] var4 = null;
        int var5 = 0;
        NineSliceHelpers var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var5Lifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = param1.readBits(28089, 8);
          if (var2_int > 0) {
            return null;
          }
          var3 = param1.readBits(28089, 12);
          var4 = new NineSliceHelpers[var3];
          for (var5 = 0; var3 > var5; var5++) {
            if (NameTextHelpers.readBitFlag(param1, (byte) 112)) {
              var6 = new NineSliceHelpers();
              param1.readBits(28089, 24);
              param1.readBits(28089, 24);
              var6.field_e = param1.readBits(28089, 24);
              param1.readBits(28089, 9);
              param1.readBits(28089, 12);
              param1.readBits(28089, 12);
              param1.readBits(28089, 12);
              var4[var5] = var6;
            } else {
              var6_int = param1.readBits(28089, BitAndSpriteHelpers.bitLength(-1 + var5, 29797));
              var4[var5] = var4[var6_int];
            }
          }
          var5Lifetime1 = 64 % ((param0 + 32) / 54);
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ma.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void setValueAndNotify(byte param0, int param1) {
        if (param0 <= -123) {
          this.setSecondaryValue(1, param1);
          if (this.field_o instanceof ScrollbarListener) {
            ((ScrollbarListener) (this.field_o)).onScrollValueChanged(this.field_L, this.field_Z, this, false);
          }
          return;
        }
    }

    private final void layoutHorizontalThumb(int param0) {
        int var3 = 0;
        int var2 = null != this.field_O ? this.field_O.field_v + this.field_O.field_n : this.field_cb.field_n;
        int var3Lifetime1;
        if (param0 == -1844589680) {
          var3 = this.field_H != null ? this.field_H.field_n - this.field_db.field_v : this.field_cb.field_n - (-this.field_cb.field_v + this.field_db.field_v);
          this.field_db.field_n = var2 + (this.field_Z * (var3 - var2) >> 16);
          return;
        }
        this.field_db = (DraggableWidget) null;
        var3Lifetime1 = this.field_H != null ? this.field_H.field_n - this.field_db.field_v : this.field_cb.field_n - (-this.field_cb.field_v + this.field_db.field_v);
        this.field_db.field_n = var2 + (this.field_Z * (var3Lifetime1 - var2) >> 16);
    }

    final static void queueTimedMessage(String param0, int param1, byte param2) {
        TimedMessage var3 = null;
        if (param2 > -27) {
          return;
        }
        try {
          var3 = new TimedMessage(param0, param1);
          QueuedResponse.field_m.addLast(var3, -1);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ma.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void layoutVerticalThumb(byte param0) {
        int var2 = 14 / ((-59 - param0) / 62);
        int var3 = null == this.field_ab ? this.field_cb.field_j : this.field_ab.field_k + this.field_ab.field_j;
        int var4 = null == this.field_R ? -this.field_db.field_k + (this.field_cb.field_k + this.field_cb.field_j) : this.field_R.field_j - this.field_db.field_k;
        this.field_db.field_j = (this.field_L * (-var3 + var4) >> 16) + var3;
    }

    final static void drawLoadingOverlay(int param0) {
        if (param0 < 74) {
          return;
        }
        CanvasRasterBuffer.drawLoadingOverlay(true, 14067);
    }

    final static void openDisplayNameForm(int param0) {
        int var1 = 39 / ((62 - param0) / 49);
        if (RawDataNode.field_k != null) {
          RawDataNode.field_k.dismiss(77);
        }
        LoginResultHelpers.field_c = new DisplayNameForm();
        SupportPageHelpers.field_e.setContent((byte) -92, (UiComponent) (LoginResultHelpers.field_c));
    }

    final void setValue(byte param0, int param1) {
        UiComponent var5 = null;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        UiComponent var5Lifetime1;
        UiComponent var5Lifetime2;
        if (param1 >= 0) {
          if (param1 > 65536) {
            this.field_L = 65536;
            this.layoutVerticalThumb((byte) -126);
            if (param0 != -6) {
              var5 = (UiComponent) null;
              this.handleKeyInput((UiComponent) null, (byte) -4, 'i', 61);
              return;
            }
            return;
          }
          this.field_L = param1;
          this.layoutVerticalThumb((byte) -126);
          if (param0 != -6) {
            var5Lifetime2 = (UiComponent) null;
            this.handleKeyInput((UiComponent) null, (byte) -4, 'i', 61);
            return;
          }
          return;
        }
        this.field_L = 0;
        this.layoutVerticalThumb((byte) -126);
        if (param0 == -6) {
          return;
        }
        var5Lifetime1 = (UiComponent) null;
        this.handleKeyInput((UiComponent) null, (byte) -4, 'i', 61);
    }

    private final int thumbFraction(byte param0) {
        if (param0 > 104) {
          return (this.field_db.field_k << 16) / this.field_cb.field_k;
        }
        this.layoutVerticalParts((byte) 97);
        return (this.field_db.field_k << 16) / this.field_cb.field_k;
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, int param3, TextButton param4) {
        int var7 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        UiComponent var8 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param3 == 1 &&
            this.field_X) {
            if (this.field_Y &&
              param4 == this.field_ab) {
              this.scrollBy(-780737471, this.field_L - this.field_T);
            } else {
              if (this.field_Y &&
                param4 == this.field_R) {
                this.scrollBy(-780737471, this.field_L + this.field_T);
              } else {
                if (this.field_Q &&
                  this.field_O == param4) {
                  this.setValueAndNotify((byte) -128, -this.field_eb + this.field_Z);
                } else {
                  if (this.field_Q &&
                    param4 == this.field_H) {
                    this.setValueAndNotify((byte) -125, this.field_eb + this.field_Z);
                  }
                }
              }
            }
          }
          if (!param0) {
            var8 = (UiComponent) null;
            this.updatePointer((UiComponent) null, -20, 39, 69);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ma.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void layoutVerticalParts(byte param0) {
        int var2 = null != this.field_ab ? this.field_ab.field_j + this.field_ab.field_k : this.field_cb.field_j;
        int var3 = this.field_R == null ? this.field_cb.field_k + this.field_cb.field_j - this.field_db.field_k : this.field_R.field_j - this.field_db.field_k;
        int var4 = 19 % ((param0 - 4) / 50);
        this.setValue((byte) -6, var2 < var3 ? (-var2 + this.field_db.field_j << 16) / (var3 - var2) : 0);
    }

    static {
        field_I = "Reading Book of Cogs";
        field_S = "Arrows:";
        field_U = 0;
        field_N = 360;
    }
}
