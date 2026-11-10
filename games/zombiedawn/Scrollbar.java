/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Scrollbar extends ArrayWidgetContainer implements ButtonActionListener {
    int field_W;
    private int field_R;
    static LoginMethod field_J;
    private boolean field_Q;
    private int field_M;
    private TextButton field_S;
    private DraggableWidget field_F;
    private TextButton field_C;
    private TextButton field_N;
    private boolean field_X;
    int field_D;
    private TextButton field_L;
    static boolean field_H;
    private int field_V;
    private int field_G;
    private int field_O;
    int field_E;
    static int field_U;
    static String[] field_K;
    private boolean field_T;
    private TextButton field_I;

    private final void readThumbY(byte param0) {
        int var2 = this.field_S != null ? this.field_S.field_n + this.field_S.field_j : this.field_I.field_j;
        int var3 = this.field_C == null ? -this.field_F.field_n + (this.field_I.field_n + this.field_I.field_j) : this.field_C.field_j - this.field_F.field_n;
        int var4 = 10 % ((param0 + 16) / 63);
        this.setVerticalPosition(var2 < var3 ? (-var2 + this.field_F.field_j << 16) / (var3 - var2) : 0, (byte) -98);
    }

    final void updatePointer(UiWidget param0, byte param1, int param2, int param3) {
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        var8 = ZombieDawn.field_J;
        try {
          var5_int = -106 % ((46 - param1) / 42);
          super.updatePointer(param0, (byte) 114, param2, param3);
          if ((!(this.field_F.field_z instanceof TextButton) ||
            ((TextButton) (this.field_F.field_z)).field_C) && 1 == this.field_F.field_m) {
            if (!this.field_X) {
              this.positionThumbX((byte) -69);
            } else {
              var6 = this.field_D;
              this.readThumbX((byte) 33);
              if (var6 != this.field_D &&
                this.field_v instanceof ScrollbarListener) {
                ((ScrollbarListener) (this.field_v)).onScrollDragged(this.field_D, this, -77, this.field_D);
              }
            }
            if (!this.field_Q) {
              this.positionThumbY(-734046384);
            } else {
              var6Lifetime2 = this.field_E;
              this.readThumbY((byte) 117);
              if (this.field_E != var6Lifetime2 &&
                this.field_v instanceof ScrollbarListener) {
                ((ScrollbarListener) (this.field_v)).onScrollDragged(this.field_D, this, -63, this.field_E);
              }
            }
          }
          if (this.field_I.field_C &&
            1 == this.field_I.field_z) {
            if (!this.field_Q) {
              if (!this.field_X) {
                return;
              }
              if ((this.field_F.field_i >> 1) + param3 + this.field_F.field_k >= KeyStateHelpers.field_b) {
                this.setHorizontalPositionAndNotify(-this.field_V + this.field_D, -4218);
                return;
              }
              this.setHorizontalPositionAndNotify(this.field_V + this.field_D, -4218);
              return;
            }
            if (!this.field_X) {
              if (FadingModalPanel.field_K > (this.field_F.field_n >> 1) + (param2 + this.field_F.field_j)) {
                this.setVerticalPositionAndNotify(this.field_M + this.field_E, (byte) -121);
                return;
              }
              this.setVerticalPositionAndNotify(-this.field_M + this.field_E, (byte) -121);
              return;
            }
            var6Lifetime1 = -(this.field_F.field_i >> 1) - this.field_F.field_k - this.field_k + (-param3 + KeyStateHelpers.field_b);
            var7 = -this.field_j + FadingModalPanel.field_K + (-param2 - (this.field_F.field_n >> 1) - this.field_F.field_j);
            if (Math.abs(var7) <= Math.abs(var6Lifetime1)) {
              if (0 >= var6Lifetime1) {
                this.setHorizontalPositionAndNotify(this.field_D - this.field_V, -4218);
                return;
              }
              this.setHorizontalPositionAndNotify(this.field_D + this.field_V, -4218);
              return;
            }
            if (var7 <= 0) {
              this.setVerticalPositionAndNotify(this.field_E - this.field_M, (byte) -121);
              return;
            }
            this.setVerticalPositionAndNotify(this.field_M + this.field_E, (byte) -121);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_39_0 = var5;
          stackIn_39_1 = new StringBuilder().append("em.D(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean requestKeyboardFocus(int param0, int param1, UiWidget param2, char param3) {
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          var5_int = 66 % ((param0 + 83) / 32);
          if (super.requestKeyboardFocus(-120, param1, param2, param3)) {
            return true;
          }
          if (this.field_T &&
            this.field_F.isFocused(-17741)) {
            if (param1 == 98) {
              this.setVerticalPositionAndNotify(this.field_E - this.field_W, (byte) -121);
              return true;
            }
            if (99 == param1) {
              this.setVerticalPositionAndNotify(this.field_E + this.field_W, (byte) -121);
              return true;
            }
            if (param1 == 96) {
              this.setHorizontalPositionAndNotify(this.field_D - this.field_G, -4218);
              return true;
            }
            if (97 == param1) {
              this.setHorizontalPositionAndNotify(this.field_G + this.field_D, -4218);
              return true;
            }
            if (param1 == 104) {
              this.setVerticalPositionAndNotify(this.field_E - this.getVerticalThumbFraction((byte) -49), (byte) -121);
              return true;
            }
            if (105 == param1) {
              this.setVerticalPositionAndNotify(this.field_E + this.getVerticalThumbFraction((byte) -49), (byte) -121);
              return true;
            }
            if (param1 == 102) {
              if (this.field_Q &&
                AchievementSubmission.field_p[82]) {
                this.setVerticalPositionAndNotify(0, (byte) -121);
                return true;
              }
              if (this.field_X) {
                this.setHorizontalPositionAndNotify(0, -4218);
                return true;
              }
            } else {
              if (param1 == 103) {
                if (this.field_Q &&
                  AchievementSubmission.field_p[82]) {
                  this.setVerticalPositionAndNotify(65536, (byte) -121);
                  return true;
                }
                if (this.field_X) {
                  this.setHorizontalPositionAndNotify(65536, -4218);
                  return true;
                }
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_45_0 = var5;
          stackIn_45_1 = new StringBuilder().append("em.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(')').toString());
        }
    }

    final void setHorizontalVisibleRange(int param0, int param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (param0 <= param2) {
          this.field_F.setBounds(115, this.field_F.field_j, this.field_F.field_k, this.field_I.field_i, this.field_F.field_n);
          this.setHorizontalScrollEnabled(1, false);
        } else {
          var4 = param2 * this.field_I.field_i / param0;
          if (this.field_O > var4) {
            var4 = this.field_O;
          }
          this.field_F.setBounds(-100, this.field_F.field_j, this.field_F.field_k, var4, this.field_F.field_n);
          this.setHorizontalScrollEnabled(1, true);
        }
        this.positionThumbX((byte) -118);
        var4Lifetime1 = 7 % ((-29 - param1) / 44);
    }

    private final void positionThumbY(int param0) {
        int var3 = 0;
        int var2 = null == this.field_S ? this.field_I.field_j : this.field_S.field_n + this.field_S.field_j;
        if (param0 == -734046384) {
          var3 = null != this.field_C ? this.field_C.field_j - this.field_F.field_n : -this.field_F.field_n + (this.field_I.field_j + this.field_I.field_n);
          this.field_F.field_j = var2 + ((var3 - var2) * this.field_E >> 16);
          return;
        }
    }

    private final void positionThumbX(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 <= -52) {
          var2 = null == this.field_L ? this.field_I.field_k : this.field_L.field_i + this.field_L.field_k;
          var3 = null == this.field_N ? this.field_I.field_k + this.field_I.field_i - this.field_F.field_i : -this.field_F.field_i + this.field_N.field_k;
          this.field_F.field_k = ((-var2 + var3) * this.field_D >> 16) + var2;
          return;
        }
        this.field_X = false;
        var2Lifetime1 = null == this.field_L ? this.field_I.field_k : this.field_L.field_i + this.field_L.field_k;
        var3Lifetime1 = null == this.field_N ? this.field_I.field_k + this.field_I.field_i - this.field_F.field_i : -this.field_F.field_i + this.field_N.field_k;
        this.field_F.field_k = ((-var2Lifetime1 + var3Lifetime1) * this.field_D >> 16) + var2Lifetime1;
    }

    private final void setHorizontalPositionAndNotify(int param0, int param1) {
        this.setHorizontalPosition(param0, -61);
        if (param1 == -4218) {
          if (this.field_v instanceof ScrollbarListener) {
            ((ScrollbarListener) (this.field_v)).onScrollAdjusted(this.field_D, this.field_E, this, 13483);
          }
          return;
        }
    }

    final static Sprite buildFirstDecodedSprite(byte param0) {
        int var5_int = 0;
        int var6 = ZombieDawn.field_J;
        int var1 = RasterState.field_n[0] * LongAndTextLoginPayload.field_c[0];
        int var2 = 26 % ((-31 - param0) / 37);
        byte[] var3 = HighscoresScreen.field_m[0];
        int[] var4 = new int[var1];
        for (var5_int = 0; var1 > var5_int; var5_int++) {
          var4[var5_int] = ArchiveLoadStep.field_a[TextHotspotRegion.bitAnd(255, (int) var3[var5_int])];
        }
        Sprite var5 = new Sprite(FocusDelegatingButton.field_F, Zombie.field_pb, LogoPoseHelpers.field_d[0], AchievementSubmission.field_o[0], LongAndTextLoginPayload.field_c[0], RasterState.field_n[0], var4);
        RopeLadder.clearSpriteDecodeBuffers((byte) -110);
        return var5;
    }

    final void setVerticalPosition(int param0, byte param1) {
        int var4 = ZombieDawn.field_J;
        if (param1 > -57) {
          return;
        }
        if (param0 < 0) {
          this.field_E = 0;
          this.positionThumbY(-734046384);
          return;
        }
        if (param0 > 65536) {
          this.field_E = 65536;
          this.positionThumbY(-734046384);
          return;
        }
        this.field_E = param0;
        this.positionThumbY(-734046384);
    }

    private final void setVerticalPositionAndNotify(int param0, byte param1) {
        this.setVerticalPosition(param0, (byte) -77);
        if (this.field_v instanceof ScrollbarListener) {
          ((ScrollbarListener) (this.field_v)).onScrollAdjusted(this.field_E, this.field_E, this, 13483);
        }
        if (param1 == -121) {
          return;
        }
        this.setHorizontalVisibleRange(47, -73, 104);
    }

    private final void setVerticalScrollEnabled(boolean param0, int param1) {
        TextButton stackIn_8_0 = null;
        TextButton stackIn_12_0 = null;
        boolean stackIn_13_1 = false;
        TextButton stackIn_17_0 = null;
        boolean stackIn_20_1 = false;
        TextButton stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        TextButton stackIn_28_0 = null;
        boolean stackIn_29_1 = false;
        TextButton stackIn_36_0 = null;
        boolean stackIn_37_1 = false;
        TextButton stackIn_42_0 = null;
        boolean stackIn_44_1 = false;
        TextButton stackIn_51_0 = null;
        boolean stackIn_52_1 = false;
        TextButton stackIn_56_0 = null;
        boolean stackIn_57_1 = false;
        TextButton stackIn_64_0 = null;
        boolean stackIn_66_1 = false;
        TextButton stackIn_70_0 = null;
        boolean stackIn_71_1 = false;
        TextButton stackIn_74_0 = null;
        boolean stackIn_75_1 = false;
        TextButton stackIn_85_0 = null;
        boolean stackIn_86_1 = false;
        stackIn_42_0 = this.field_I;
        if (param0) {
          stackIn_44_1 = true;
        } else {
          if (this.field_X) {
            stackIn_42_0.field_C = true;
            boolean decompiledFrameRemainder1 = true;
            if (this.field_F.field_z instanceof TextButton) {
              stackIn_17_0 = (TextButton) (this.field_F.field_z);
              if (param0) {
                stackIn_17_0.field_C = true;
                if (null != this.field_S) {
                  stackIn_8_0 = this.field_S;
                  stackIn_8_0.field_C = true;
                }
                if (this.field_C != null) {
                  stackIn_12_0 = this.field_C;
                  stackIn_13_1 = (!param0) ? false : true;
                  stackIn_12_0.field_C = stackIn_13_1;
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                stackIn_20_1 = (!this.field_X) ? false : true;
                stackIn_17_0.field_C = stackIn_20_1;
              }
            }
            if (decompiledFrameRemainder1) {
              if (null == this.field_S) {
                if (this.field_C != null) {
                  stackIn_36_0 = this.field_C;
                  stackIn_37_1 = (!param0) ? false : true;
                  stackIn_36_0.field_C = stackIn_37_1;
                }
              } else {
                stackIn_24_0 = this.field_S;
                stackIn_25_1 = (!param0) ? false : true;
                stackIn_24_0.field_C = stackIn_25_1;
                if (this.field_C != null) {
                  stackIn_28_0 = this.field_C;
                  stackIn_29_1 = (!param0) ? false : true;
                  stackIn_28_0.field_C = stackIn_29_1;
                }
              }
            }
            if (param1 != 30789) {
              this.field_C = (TextButton) null;
            }
            return;
          }
          stackIn_44_1 = false;
        }
        stackIn_42_0.field_C = stackIn_44_1;
        boolean decompiledFrameRemainder0 = true;
        if (this.field_F.field_z instanceof TextButton) {
          stackIn_64_0 = (TextButton) (this.field_F.field_z);
          if (param0) {
            stackIn_66_1 = true;
          } else {
            if (this.field_X) {
              stackIn_64_0.field_C = true;
              if (null != this.field_S) {
                stackIn_51_0 = this.field_S;
                stackIn_52_1 = (!param0) ? false : true;
                stackIn_51_0.field_C = stackIn_52_1;
              }
              if (this.field_C == null) {
                if (param1 == 30789) {
                  return;
                }
                this.field_C = (TextButton) null;
                return;
              }
              stackIn_56_0 = this.field_C;
              stackIn_57_1 = (!param0) ? false : true;
              stackIn_56_0.field_C = stackIn_57_1;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_66_1 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_64_0.field_C = stackIn_66_1;
          }
        }
        if (decompiledFrameRemainder0) {
          if (null == this.field_S) {
            if (this.field_C != null) {
              stackIn_85_0 = this.field_C;
              stackIn_86_1 = (!param0) ? false : true;
              stackIn_85_0.field_C = stackIn_86_1;
            }
            if (param1 == 30789) {
              return;
            }
            this.field_C = (TextButton) null;
            return;
          }
          stackIn_70_0 = this.field_S;
          stackIn_71_1 = (!param0) ? false : true;
          stackIn_70_0.field_C = stackIn_71_1;
          if (this.field_C == null) {
            if (param1 == 30789) {
              return;
            }
            this.field_C = (TextButton) null;
            return;
          }
          stackIn_74_0 = this.field_C;
          stackIn_75_1 = (!param0) ? false : true;
          stackIn_74_0.field_C = stackIn_75_1;
        }
        if (param1 != 30789) {
          this.field_C = (TextButton) null;
        }
    }

    public final void onButtonActivated(int param0, int param1, TextButton param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ZombieDawn.field_J;
        try {
          if (param3 == 1 &&
            this.field_T) {
            if (this.field_Q &&
              this.field_S == param2) {
              this.setVerticalPositionAndNotify(this.field_E - this.field_W, (byte) -121);
            } else {
              if (this.field_Q &&
                this.field_C == param2) {
                this.setVerticalPositionAndNotify(this.field_W + this.field_E, (byte) -121);
              } else {
                if (this.field_X &&
                  param2 == this.field_L) {
                  this.setHorizontalPositionAndNotify(-this.field_G + this.field_D, param1 ^ 4220);
                } else {
                  if (this.field_X &&
                    param2 == this.field_N) {
                    this.setHorizontalPositionAndNotify(this.field_G + this.field_D, -4218);
                  }
                }
              }
            }
          }
          if (param1 != -6) {
            this.field_Q = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("em.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void setVerticalVisibleRange(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 > param2) {
          var4 = this.field_I.field_n * param2 / param1;
          if (this.field_R > var4) {
            var4 = this.field_R;
          }
          this.field_F.setBounds(param0 ^ 30641, this.field_F.field_j, this.field_F.field_k, this.field_F.field_i, var4);
          this.setVerticalScrollEnabled(true, 30789);
          this.positionThumbY(-734046384);
          if (param0 != -30674) {
            this.layoutChildren((byte) 16);
            return;
          }
          return;
        }
        this.field_F.setBounds(26, this.field_F.field_j, this.field_F.field_k, this.field_F.field_i, this.field_I.field_n);
        this.setVerticalScrollEnabled(false, param0 ^ -3989);
        this.positionThumbY(-734046384);
        if (param0 != -30674) {
          this.layoutChildren((byte) 16);
          return;
        }
    }

    public static void releaseStatics(byte param0) {
        field_K = null;
        if (param0 >= -19) {
          return;
        }
        field_J = null;
    }

    private final int getVerticalThumbFraction(byte param0) {
        if (param0 == -49) {
          return (this.field_F.field_n << 16) / this.field_I.field_n;
        }
        this.positionThumbY(-46);
        return (this.field_F.field_n << 16) / this.field_I.field_n;
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
        this.field_R = 0;
        this.field_M = 8192;
        this.field_D = 32768;
        this.field_G = 1024;
        this.field_V = 8192;
        this.field_W = 1024;
        this.field_O = 0;
        this.field_T = true;
        this.field_E = 32768;
        try {
          this.field_B = new UiWidget[6];
          dupTemp$0 = new DraggableWidget(param0, param1, param7, param8, (WidgetPainter) null, (WidgetListener) null, new TextButton(0, 0, param7, param8, param6, (WidgetListener) null), false, false);
          this.field_F = dupTemp$0;
          this.field_B[0] = (UiWidget) ((Object) dupTemp$0);
          dupTemp$1 = new TextButton(param0, param1, param7, param8, param5, (WidgetListener) null);
          this.field_I = dupTemp$1;
          this.field_B[1] = (UiWidget) ((Object) dupTemp$1);
          this.field_O = param9;
          stackIn_4_1 = (param11);
          this.field_X = stackIn_4_1;
          stackIn_7_1 = (param12);
          this.field_Q = stackIn_7_1;
          this.field_R = param10;
          this.setHorizontalPosition(param13, -89);
          this.setVerticalPosition(param14, (byte) -95);
          this.setBounds(-119, param1, param0, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_11_0 = var16;
          stackIn_11_1 = new StringBuilder().append("em.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    private final void readThumbX(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 >= 15) {
          var2 = null == this.field_L ? this.field_I.field_k : this.field_L.field_i + this.field_L.field_k;
          var3 = null == this.field_N ? -this.field_F.field_i + (this.field_I.field_i + this.field_I.field_k) : -this.field_F.field_i + this.field_N.field_k;
          this.setHorizontalPosition(var2 < var3 ? (this.field_F.field_k - var2 << 16) / (var3 - var2) : 0, 89);
          return;
        }
        this.field_V = 106;
        var2Lifetime1 = null == this.field_L ? this.field_I.field_k : this.field_L.field_i + this.field_L.field_k;
        var3Lifetime1 = null == this.field_N ? -this.field_F.field_i + (this.field_I.field_i + this.field_I.field_k) : -this.field_F.field_i + this.field_N.field_k;
        this.setHorizontalPosition(var2Lifetime1 < var3Lifetime1 ? (this.field_F.field_k - var2Lifetime1 << 16) / (var3Lifetime1 - var2Lifetime1) : 0, 89);
    }

    final boolean focusNext(byte param0, UiWidget param1) {
        DraggableWidget var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 67) {
            return false;
          }
          var3 = this.field_F;
          if (var3 == null) {
            return false;
          }
          if (!((UiWidget) ((Object) var3)).focusNext((byte) 104, param1)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("em.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void layoutChildren(byte param0) {
        int var3 = ZombieDawn.field_J;
        if (this.field_L != null) {
          this.field_L.field_k = 0;
          this.field_L.field_j = -this.field_L.field_n + this.field_n >> 1;
          this.field_I.field_k = this.field_L.field_k + this.field_L.field_i;
        } else {
          this.field_I.field_k = 0;
        }
        if (this.field_N != null) {
          this.field_N.field_k = -this.field_N.field_i + this.field_i;
          this.field_N.field_j = -this.field_N.field_n + this.field_n >> 1;
          this.field_I.field_i = -this.field_N.field_i + (this.field_i - this.field_I.field_k);
        } else {
          this.field_I.field_i = -this.field_I.field_k + this.field_i;
        }
        if (param0 < 38) {
          Scrollbar.releaseStatics((byte) 122);
          this.positionThumbX((byte) -119);
          if (this.field_S == null) {
            this.field_I.field_j = 0;
          } else {
            this.field_S.field_j = 0;
            this.field_S.field_k = this.field_i - this.field_S.field_i >> 1;
            this.field_I.field_j = this.field_S.field_j + this.field_S.field_n;
          }
          if (null != this.field_C) {
            this.field_C.field_k = this.field_i - this.field_C.field_i >> 1;
            this.field_C.field_j = -this.field_C.field_n + this.field_n;
            this.field_I.field_n = -this.field_C.field_n + this.field_n - this.field_I.field_j;
          } else {
            this.field_I.field_n = this.field_n - this.field_I.field_j;
          }
          this.positionThumbY(-734046384);
          if (!this.field_Q) {
            this.field_F.field_n = this.field_I.field_n;
            this.field_F.field_j = 0;
            if (!this.field_X) {
              this.field_F.field_i = this.field_I.field_i;
              this.field_F.field_k = 0;
            }
            this.field_F.reapplyBounds(true);
            return;
          }
          if (!this.field_X) {
            this.field_F.field_i = this.field_I.field_i;
            this.field_F.field_k = 0;
          }
          this.field_F.reapplyBounds(true);
          return;
        }
        this.positionThumbX((byte) -119);
        if (this.field_S == null) {
          this.field_I.field_j = 0;
          if (null != this.field_C) {
            this.field_C.field_k = this.field_i - this.field_C.field_i >> 1;
            this.field_C.field_j = -this.field_C.field_n + this.field_n;
            this.field_I.field_n = -this.field_C.field_n + this.field_n - this.field_I.field_j;
          } else {
            this.field_I.field_n = this.field_n - this.field_I.field_j;
          }
          this.positionThumbY(-734046384);
          if (!this.field_Q) {
            this.field_F.field_n = this.field_I.field_n;
            this.field_F.field_j = 0;
            if (!this.field_X) {
              this.field_F.field_i = this.field_I.field_i;
              this.field_F.field_k = 0;
            }
            this.field_F.reapplyBounds(true);
            return;
          }
          if (!this.field_X) {
            this.field_F.field_i = this.field_I.field_i;
            this.field_F.field_k = 0;
          }
          this.field_F.reapplyBounds(true);
          return;
        }
        this.field_S.field_j = 0;
        this.field_S.field_k = this.field_i - this.field_S.field_i >> 1;
        this.field_I.field_j = this.field_S.field_j + this.field_S.field_n;
        if (null != this.field_C) {
          this.field_C.field_k = this.field_i - this.field_C.field_i >> 1;
          this.field_C.field_j = -this.field_C.field_n + this.field_n;
          this.field_I.field_n = -this.field_C.field_n + this.field_n - this.field_I.field_j;
          this.positionThumbY(-734046384);
          if (!this.field_Q) {
            this.field_F.field_n = this.field_I.field_n;
            this.field_F.field_j = 0;
          }
          if (!this.field_X) {
            this.field_F.field_i = this.field_I.field_i;
            this.field_F.field_k = 0;
          }
          this.field_F.reapplyBounds(true);
          return;
        }
        this.field_I.field_n = this.field_n - this.field_I.field_j;
        this.positionThumbY(-734046384);
        if (!this.field_Q) {
          this.field_F.field_n = this.field_I.field_n;
          this.field_F.field_j = 0;
          if (!this.field_X) {
            this.field_F.field_i = this.field_I.field_i;
            this.field_F.field_k = 0;
          }
          this.field_F.reapplyBounds(true);
          return;
        }
        if (!this.field_X) {
          this.field_F.field_i = this.field_I.field_i;
          this.field_F.field_k = 0;
        }
        this.field_F.reapplyBounds(true);
    }

    private final void setHorizontalScrollEnabled(int param0, boolean param1) {
        TextButton stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        TextButton stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        TextButton stackIn_21_0 = null;
        boolean stackIn_24_1 = false;
        TextButton stackIn_30_0 = null;
        boolean stackIn_31_1 = false;
        TextButton stackIn_36_0 = null;
        boolean stackIn_37_1 = false;
        TextButton stackIn_41_0 = null;
        boolean stackIn_43_1 = false;
        TextButton stackIn_52_0 = null;
        boolean stackIn_53_1 = false;
        TextButton stackIn_58_0 = null;
        boolean stackIn_59_1 = false;
        TextButton stackIn_63_0 = null;
        boolean stackIn_65_1 = false;
        TextButton stackIn_71_0 = null;
        boolean stackIn_72_1 = false;
        TextButton stackIn_77_0 = null;
        boolean stackIn_78_1 = false;
        stackIn_41_0 = this.field_I;
        if (param1) {
          stackIn_43_1 = true;
        } else {
          if (this.field_Q) {
            stackIn_41_0.field_C = true;
            if (this.field_F.field_z instanceof TextButton) {
              stackIn_21_0 = (TextButton) (this.field_F.field_z);
              if (param1) {
                stackIn_21_0.field_C = true;
                if (param0 != 1) {
                  return;
                }
                if (null != this.field_L) {
                  stackIn_10_0 = this.field_L;
                  stackIn_11_1 = (!param1) ? false : true;
                  stackIn_10_0.field_C = stackIn_11_1;
                }
                if (null != this.field_N) {
                  stackIn_16_0 = this.field_N;
                  stackIn_17_1 = (!param1) ? false : true;
                  stackIn_16_0.field_C = stackIn_17_1;
                }
                return;
              }
              stackIn_24_1 = (!this.field_Q) ? false : true;
              stackIn_21_0.field_C = stackIn_24_1;
            }
            if (param0 != 1) {
              return;
            }
            if (null != this.field_L) {
              stackIn_30_0 = this.field_L;
              stackIn_31_1 = (!param1) ? false : true;
              stackIn_30_0.field_C = stackIn_31_1;
            }
            if (null != this.field_N) {
              stackIn_36_0 = this.field_N;
              stackIn_37_1 = (!param1) ? false : true;
              stackIn_36_0.field_C = stackIn_37_1;
            }
            return;
          }
          stackIn_43_1 = false;
        }
        stackIn_41_0.field_C = stackIn_43_1;
        if (this.field_F.field_z instanceof TextButton) {
          stackIn_63_0 = (TextButton) (this.field_F.field_z);
          if (param1) {
            stackIn_65_1 = true;
          } else {
            if (this.field_Q) {
              stackIn_63_0.field_C = true;
              if (param0 != 1) {
                return;
              }
              if (null != this.field_L) {
                stackIn_52_0 = this.field_L;
                stackIn_53_1 = (!param1) ? false : true;
                stackIn_52_0.field_C = stackIn_53_1;
              }
              if (null != this.field_N) {
                stackIn_58_0 = this.field_N;
                stackIn_59_1 = (!param1) ? false : true;
                stackIn_58_0.field_C = stackIn_59_1;
              }
              return;
            }
            stackIn_65_1 = false;
          }
          stackIn_63_0.field_C = stackIn_65_1;
        }
        if (param0 != 1) {
          return;
        }
        if (null != this.field_L) {
          stackIn_71_0 = this.field_L;
          stackIn_72_1 = (!param1) ? false : true;
          stackIn_71_0.field_C = stackIn_72_1;
        }
        if (null != this.field_N) {
          stackIn_77_0 = this.field_N;
          stackIn_78_1 = (!param1) ? false : true;
          stackIn_77_0.field_C = stackIn_78_1;
        }
    }

    private final void setHorizontalPosition(int param0, int param1) {
        int var4 = ZombieDawn.field_J;
        int var3 = 73 % ((param1 - 20) / 61);
        if (param0 < 0) {
          this.field_D = 0;
          this.positionThumbX((byte) -76);
          return;
        }
        if (param0 <= 65536) {
          this.field_D = param0;
          this.positionThumbX((byte) -76);
          return;
        }
        this.field_D = 65536;
        this.positionThumbX((byte) -76);
    }

    static {
        field_H = true;
        field_J = new LoginMethod("email");
        field_U = -1;
        field_K = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
