/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn extends wd {
    int field_D;
    int field_L;
    int field_P;
    float field_E;
    float field_A;
    private int field_O;
    qm field_H;
    int field_z;
    qm field_U;
    float field_K;
    static int field_y;
    static ge field_G;
    static String field_J;
    int field_B;
    int field_N;
    int field_R;
    qm field_F;
    static boolean field_T;
    private int field_S;
    qm field_Q;
    float field_I;
    static int field_M;

    final static boolean a(boolean param0, String param1) {
        Process discarded$2 = null;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_M = 1;
                break L1;
              }
            }
            try {
              L2: {
                if (!ib.field_s.startsWith("win")) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L2;
                } else {
                  L3: {
                    if (param1.startsWith("http://")) {
                      break L3;
                    } else {
                      if (param1.startsWith("https://")) {
                        break L3;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        decompiledRegionSelector0 = 1;
                        break L2;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L4: while (true) {
                    if (var3 >= param1.length()) {
                      discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 3;
                      break L2;
                    } else {
                      if (var2.indexOf((int) param1.charAt(var3)) != -1) {
                        var3++;
                        continue L4;
                      } else {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 2;
                        break L2;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2_ref2);
            stackOut_21_1 = new StringBuilder().append("hn.G(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    final in g(int param0) {
        float var2 = this.field_E;
        var2 = var2 + (this.field_I < this.field_E ? 1.5707963705062866f : -1.5707963705062866f);
        if (param0 != -1) {
            return (in) null;
        }
        return new in(var2);
    }

    final qm l(int param0) {
        if (param0 != 8421504) {
            this.field_E = 0.36725643277168274f;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_D * Math.cos((double)this.field_I)), (int)((double)this.field_U.field_f - (double)this.field_D * Math.sin((double)this.field_I)));
    }

    final in a(boolean param0) {
        float var2 = this.field_I;
        var2 = var2 + (this.field_E <= this.field_I ? -1.5707963705062866f : 1.5707963705062866f);
        if (param0) {
            this.field_S = -21;
        }
        return new in(var2);
    }

    final qm a(float param0, int param1) {
        qm discarded$0 = null;
        float var3 = this.field_E + (-this.field_E + this.field_I) * param0;
        if (param1 != 255) {
            discarded$0 = this.h(78);
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_O * Math.cos((double)var3)), (int)((double)this.field_U.field_f - (double)this.field_O * Math.sin((double)var3)));
    }

    final qm a(float param0, boolean param1) {
        float var3 = this.field_E + (this.field_I - this.field_E) * param0;
        if (param1) {
            return (qm) null;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_S * Math.cos((double)var3)), (int)((double)this.field_U.field_f - (double)this.field_S * Math.sin((double)var3)));
    }

    final qm h(int param0) {
        float discarded$0 = 0.0f;
        if (param0 != 7560980) {
            discarded$0 = this.a(0.218789204955101f, (byte) 23);
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_O * Math.cos((double)this.field_I)), (int)((double)this.field_U.field_f - (double)this.field_O * Math.sin((double)this.field_I)));
    }

    final qm a(int param0) {
        if (param0 != 0) {
            return (qm) null;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_z * Math.cos((double)this.field_I)), (int)((double)this.field_U.field_f - (double)this.field_z * Math.sin((double)this.field_I)));
    }

    final qm n(int param0) {
        qm discarded$0 = null;
        if (param0 != 3337) {
            discarded$0 = this.a(1.24961256980896f, -83);
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_R * Math.cos((double)this.field_E)), (int)((double)this.field_U.field_f - (double)this.field_R * Math.sin((double)this.field_E)));
    }

    final qm c(float param0, int param1) {
        if (param1 < 90) {
            this.field_F = (qm) null;
        }
        float var3 = this.field_E + (-this.field_E + this.field_I) * param0;
        return new qm((int)((double)this.field_U.field_h + (double)this.field_D * Math.cos((double)var3)), (int)((double)this.field_U.field_f - (double)this.field_D * Math.sin((double)var3)));
    }

    final qm a(byte param0) {
        if (param0 != 29) {
            this.field_Q = (qm) null;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_S * Math.cos((double)this.field_I)), (int)((double)this.field_U.field_f - (double)this.field_S * Math.sin((double)this.field_I)));
    }

    final in a(byte param0, float param1) {
        float var3 = (this.field_I - this.field_E) * param1 + this.field_E;
        var3 = var3 + (this.field_I < this.field_E ? -1.5707963705062866f : 1.5707963705062866f);
        if (param0 < 117) {
            this.field_Q = (qm) null;
        }
        return new in(var3);
    }

    final qm a(int param0, float param1) {
        if (param0 != -851) {
            this.field_O = 100;
        }
        float var3 = this.field_E + (this.field_I - this.field_E) * param1;
        return new qm((int)((double)this.field_U.field_h + (double)this.field_R * Math.cos((double)var3)), (int)((double)this.field_U.field_f - (double)this.field_R * Math.sin((double)var3)));
    }

    final qm a(boolean param0, float param1) {
        float var3 = this.field_E + param1 * (-this.field_E + this.field_I);
        if (param0) {
            return (qm) null;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_z * Math.cos((double)var3)), (int)((double)this.field_U.field_f - (double)this.field_z * Math.sin((double)var3)));
    }

    final float a(float param0, byte param1) {
        int var4 = HoldTheLine.field_D;
        if (param1 < 33) {
            field_y = 109;
        }
        if (this.field_I < this.field_E) {
            while (param0 < this.field_I) {
                param0 = (float)((double)param0 + 6.283185307179586);
            }
            while (this.field_E < param0) {
                param0 = (float)((double)param0 - 6.283185307179586);
            }
            return (-this.field_E + param0) / (this.field_I - this.field_E);
        }
        while (this.field_I < param0) {
            param0 = (float)((double)param0 - 6.283185307179586);
        }
        while (this.field_E > param0) {
            param0 = (float)((double)param0 + 6.283185307179586);
        }
        return (param0 - this.field_E) / (this.field_I - this.field_E);
    }

    final float f(int param0) {
        qm discarded$0 = null;
        if (param0 != 50) {
            discarded$0 = this.l(-4);
        }
        return Math.abs(this.field_I - this.field_E) * (float)this.field_z;
    }

    public static void p(int param0) {
        if (param0 >= -120) {
            field_y = 99;
        }
        field_J = null;
        field_G = null;
    }

    final qm m(int param0) {
        if (param0 != -14) {
            this.field_S = 113;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_R * Math.cos((double)this.field_I)), (int)((double)this.field_U.field_f - (double)this.field_R * Math.sin((double)this.field_I)));
    }

    final qm o(int param0) {
        if (param0 != -14) {
            return (qm) null;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_S * Math.cos((double)this.field_E)), (int)((double)this.field_U.field_f - (double)this.field_S * Math.sin((double)this.field_E)));
    }

    final qm k(int param0) {
        qm discarded$0 = null;
        if (param0 != 255) {
            discarded$0 = this.a(true, -0.0722532868385315f);
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_D * Math.cos((double)this.field_E)), (int)((double)this.field_U.field_f - (double)this.field_D * Math.sin((double)this.field_E)));
    }

    final qm c(boolean param0) {
        if (!param0) {
            return (qm) null;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_O * Math.cos((double)this.field_E)), (int)((double)this.field_U.field_f - (double)this.field_O * Math.sin((double)this.field_E)));
    }

    hn(qm param0, int param1, float param2, float param3, int param4, int param5, int param6, int param7, int param8, qm param9, qm param10, qm param11, boolean param12, boolean param13, boolean param14, boolean param15, boolean param16, boolean param17) {
        RuntimeException var19 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param13) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((hn) (this)).field_s = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param12) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((hn) (this)).field_w = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param17) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((hn) (this)).field_q = stackIn_10_1 != 0;
              this.field_E = param2;
              this.field_U = param0;
              this.field_Q = param10;
              this.field_L = param8;
              this.field_N = param5;
              this.field_H = param11;
              this.field_B = param6;
              this.field_P = param7;
              this.field_I = param3;
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (!param15) {
                stackOut_12_0 = this;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L4;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L4;
              }
            }
            L5: {
              ((hn) (this)).field_x = stackIn_13_1 != 0;
              this.field_k = param4;
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (!param16) {
                stackOut_15_0 = this;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L5;
              } else {
                stackOut_14_0 = this;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L5;
              }
            }
            L6: {
              ((hn) (this)).field_t = stackIn_16_1 != 0;
              this.field_F = param9;
              this.field_z = param1;
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (!param14) {
                stackOut_18_0 = this;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L6;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L6;
              }
            }
            L7: {
              ((hn) (this)).field_m = stackIn_19_1 != 0;
              stackOut_19_0 = this;
              stackOut_19_1 = this.field_z;
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              if (this.field_E >= this.field_I) {
                stackOut_21_0 = this;
                stackOut_21_1 = stackIn_21_1;
                stackOut_21_2 = -this.field_L;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                stackIn_22_2 = stackOut_21_2;
                break L7;
              } else {
                stackOut_20_0 = this;
                stackOut_20_1 = stackIn_20_1;
                stackOut_20_2 = this.field_L;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_22_2 = stackOut_20_2;
                break L7;
              }
            }
            L8: {
              ((hn) (this)).field_R = stackIn_22_1 + stackIn_22_2;
              stackOut_22_0 = this;
              stackOut_22_1 = this.field_z;
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              if (this.field_E >= this.field_I) {
                stackOut_24_0 = this;
                stackOut_24_1 = stackIn_24_1;
                stackOut_24_2 = -this.field_B;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                break L8;
              } else {
                stackOut_23_0 = this;
                stackOut_23_1 = stackIn_23_1;
                stackOut_23_2 = this.field_B;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_25_2 = stackOut_23_2;
                break L8;
              }
            }
            L9: {
              ((hn) (this)).field_S = stackIn_25_1 - -stackIn_25_2;
              this.field_K = 1.0f;
              stackOut_25_0 = this;
              stackOut_25_1 = this.field_z;
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              if (this.field_I > this.field_E) {
                stackOut_27_0 = this;
                stackOut_27_1 = stackIn_27_1;
                stackOut_27_2 = this.field_P;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                stackIn_28_2 = stackOut_27_2;
                break L9;
              } else {
                stackOut_26_0 = this;
                stackOut_26_1 = stackIn_26_1;
                stackOut_26_2 = -this.field_P;
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                stackIn_28_2 = stackOut_26_2;
                break L9;
              }
            }
            L10: {
              ((hn) (this)).field_D = stackIn_28_1 - -stackIn_28_2;
              this.field_o = 0.0f;
              stackOut_28_0 = this;
              stackIn_30_0 = stackOut_28_0;
              stackIn_29_0 = stackOut_28_0;
              if (this.field_I <= this.field_E) {
                stackOut_30_0 = this;
                stackOut_30_1 = -this.field_N;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                break L10;
              } else {
                stackOut_29_0 = this;
                stackOut_29_1 = this.field_N;
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                break L10;
              }
            }
            ((hn) (this)).field_O = stackIn_31_1 + this.field_z;
            this.field_A = 0.0f;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var19 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var19);
            stackOut_33_1 = new StringBuilder().append("hn.<init>(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          L12: {
            stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param9 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L12;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L12;
            }
          }
          L13: {
            stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param10 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L13;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L13;
            }
          }
          L14: {
            stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param11 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L14;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L14;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ',' + param17 + ')');
        }
    }

    final boolean b(byte param0, float param1) {
        int var4 = HoldTheLine.field_D;
        if (param0 != -113) {
            this.field_P = 69;
        }
        if (this.field_E > this.field_I) {
            while (this.field_I < param1) {
                param1 = (float)((double)param1 - 6.283185307179586);
            }
            while (param1 < this.field_I) {
                param1 = (float)((double)param1 + 6.283185307179586);
            }
            return this.field_E > param1 ? true : false;
        }
        while (this.field_E < param1) {
            param1 = (float)((double)param1 - 6.283185307179586);
        }
        while (this.field_E > param1) {
            param1 = (float)((double)param1 + 6.283185307179586);
        }
        return this.field_I > param1 ? true : false;
    }

    final qm b(float param0, int param1) {
        float var3 = this.field_A + (-this.field_A + this.field_K) * param0;
        int var4 = (int)((float)this.field_F.field_h * (-var3 + 1.0f) * (-var3 + 1.0f) + (-var3 + 1.0f) * (float)(2 * this.field_H.field_h) * var3 + var3 * (float)this.field_Q.field_h * var3);
        int var5 = (int)(var3 * (float)this.field_Q.field_f * var3 + (var3 * ((float)(2 * this.field_H.field_f) * (1.0f - var3)) + (float)this.field_F.field_f * (-var3 + 1.0f) * (1.0f - var3)));
        if (param1 != 7560980) {
            return (qm) null;
        }
        return new qm(var4, var5);
    }

    static {
        field_J = "Sound: ";
        field_G = new ge();
    }
}
