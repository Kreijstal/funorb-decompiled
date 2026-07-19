/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    private int field_l;
    private int field_a;
    static int field_d;
    private boolean field_f;
    private int field_h;
    private int field_k;
    hj[] field_j;
    static float field_e;
    hj field_b;
    static uf[] field_c;
    static hj field_i;
    private int field_g;

    final void a(nj param0, int param1) {
        nj discarded$0 = null;
        try {
            param0.field_j = this.field_j;
            param0.field_k = this.field_k;
            param0.field_g = this.field_g;
            param0.field_a = this.field_a;
            param0.field_f = this.field_f;
            param0.field_l = this.field_l;
            if (param1 != -1) {
                discarded$0 = this.b(88, -100);
            }
            param0.field_h = this.field_h;
            param0.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "nj.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final nj b(int param0, int param1) {
        nj discarded$0 = null;
        this.field_l = param0;
        if (param1 != -26228) {
            discarded$0 = this.a(39, 17);
            return (nj) (this);
        }
        return (nj) (this);
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        RuntimeException var4 = null;
        String[] var4_array = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              ak.field_b = fd.field_c;
              if (255 != param1) {
                if (100 > param1) {
                  ja.field_U = ij.a(param3, 256, param1);
                  break L1;
                } else {
                  if (param1 <= 105) {
                    var4_array = param2;
                    ri.a((byte) 102, var4_array);
                    ja.field_U = ca.a(param2, (byte) 123);
                    break L1;
                  } else {
                    ja.field_U = ij.a(param3, 256, param1);
                    break L1;
                  }
                }
              } else {
                L2: {
                  if ((u.field_V ^ -1) <= -14) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                ja.field_U = kl.a(stackIn_5_0 != 0, 0);
                var6 = (String[]) null;
                ri.a((byte) 71, (String[]) null);
                break L1;
              }
            }
            if (param0 == 256) {
              break L0;
            } else {
              nj.a(58);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("nj.A(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    final void a(ig param0, nj param1, int param2, int param3, int param4, n param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_f) {
                break L1;
              } else {
                param1.a(param5, param2, param3, -1, param0);
                param1.a((byte) -121);
                break L1;
              }
            }
            L2: {
              if (this.field_a == -2147483648) {
                break L2;
              } else {
                param1.field_a = this.field_a;
                break L2;
              }
            }
            L3: {
              if (param4 == -28063) {
                break L3;
              } else {
                field_e = -1.5048772096633911f;
                break L3;
              }
            }
            L4: {
              if (this.field_g == -2147483648) {
                break L4;
              } else {
                param1.field_g = this.field_g;
                break L4;
              }
            }
            L5: {
              if (this.field_j != null) {
                param1.field_j = this.field_j;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 <= this.field_l) {
                param1.field_l = this.field_l;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-2147483648 == this.field_k) {
                break L7;
              } else {
                param1.field_k = this.field_k;
                break L7;
              }
            }
            L8: {
              if (null == this.field_b) {
                break L8;
              } else {
                param1.field_b = this.field_b;
                break L8;
              }
            }
            if (0 >= (this.field_h ^ -1)) {
              param1.field_h = this.field_h;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var7);
            stackOut_22_1 = new StringBuilder().append("nj.K(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param5 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
    }

    final nj a(int param0, boolean param1) {
        this.field_g = param0;
        if (!param1) {
            return (nj) null;
        }
        return (nj) (this);
    }

    final nj a(int param0, hj[] param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              this.field_j = param1;
              if (param0 == 29536) {
                break L1;
              } else {
                this.a((byte) 115);
                break L1;
              }
            }
            stackOut_2_0 = this;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("nj.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (nj) (this);
    }

    final nj a(int param0, int param1) {
        this.field_a = param0;
        if (param1 > -115) {
            return (nj) null;
        }
        return (nj) (this);
    }

    final nj a(boolean param0, int param1) {
        String var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 != -2147483648) {
          L0: {
            var4 = (String) null;
            nj.a(33, -24, (String[]) null, (String) null);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((nj) (this)).field_f = stackIn_8_1 != 0;
          return (nj) (this);
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
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
          ((nj) (this)).field_f = stackIn_4_1 != 0;
          return (nj) (this);
        }
    }

    final void a(byte param0) {
        this.field_g = 0;
        this.field_j = null;
        this.field_h = -1;
        this.field_l = 0;
        if (param0 != -121) {
          return;
        } else {
          this.field_b = null;
          this.field_k = 256;
          this.field_a = 0;
          return;
        }
    }

    final void a(n param0, int param1, int param2, int param3, ig param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        String var6_ref = null;
        int var7 = 0;
        qi stackIn_19_0 = null;
        String stackIn_19_1 = null;
        qi stackIn_20_0 = null;
        String stackIn_20_1 = null;
        qi stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        qi stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        qi stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        qi stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        qi stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        qi stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        qi stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        int stackIn_27_8 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qi stackOut_18_0 = null;
        String stackOut_18_1 = null;
        qi stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        qi stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        qi stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        qi stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        qi stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        qi stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        qi stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        qi stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              hi.a(this.field_j, param0.field_u, true, param0.field_x, param2 + param0.field_k, param1 - -param0.field_o);
              if (null == this.field_b) {
                break L1;
              } else {
                L2: {
                  var6_int = param2 + param0.field_k + this.field_a;
                  var7 = this.field_g + param0.field_o + param1;
                  if ((param4.field_i ^ -1) == -2) {
                    var6_int = var6_int + (-this.field_b.field_o + param0.field_x) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param4.field_d == 1) {
                    var7 = var7 + (-this.field_b.field_v + param0.field_u) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-3 != (param4.field_i ^ -1)) {
                    break L4;
                  } else {
                    var6_int = var6_int + (param0.field_x - this.field_b.field_o);
                    break L4;
                  }
                }
                L5: {
                  if (2 == param4.field_d) {
                    var7 = var7 + (-this.field_b.field_v + param0.field_u);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_b.a(var6_int, var7);
                break L1;
              }
            }
            if (param3 == -1) {
              L6: {
                var6_ref = param4.a(param0, (byte) -15);
                if (var6_ref == null) {
                  break L6;
                } else {
                  if (null == param4.field_f) {
                    break L6;
                  } else {
                    if ((this.field_l ^ -1) > -1) {
                      break L6;
                    } else {
                      L7: {
                        stackOut_18_0 = param4.field_f;
                        stackOut_18_1 = (String) (var6_ref);
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (this.field_a == -2147483648) {
                          stackOut_20_0 = (qi) ((Object) stackIn_20_0);
                          stackOut_20_1 = (String) ((Object) stackIn_20_1);
                          stackOut_20_2 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          stackIn_21_1 = stackOut_20_1;
                          stackIn_21_2 = stackOut_20_2;
                          break L7;
                        } else {
                          stackOut_19_0 = (qi) ((Object) stackIn_19_0);
                          stackOut_19_1 = (String) ((Object) stackIn_19_1);
                          stackOut_19_2 = this.field_a;
                          stackIn_21_0 = stackOut_19_0;
                          stackIn_21_1 = stackOut_19_1;
                          stackIn_21_2 = stackOut_19_2;
                          break L7;
                        }
                      }
                      L8: {
                        stackOut_21_0 = (qi) ((Object) stackIn_21_0);
                        stackOut_21_1 = (String) ((Object) stackIn_21_1);
                        stackOut_21_2 = stackIn_21_2 + param4.field_j + param0.field_k + param2;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        if ((this.field_g ^ -1) != 2147483647) {
                          stackOut_23_0 = (qi) ((Object) stackIn_23_0);
                          stackOut_23_1 = (String) ((Object) stackIn_23_1);
                          stackOut_23_2 = stackIn_23_2;
                          stackOut_23_3 = this.field_g;
                          stackIn_24_0 = stackOut_23_0;
                          stackIn_24_1 = stackOut_23_1;
                          stackIn_24_2 = stackOut_23_2;
                          stackIn_24_3 = stackOut_23_3;
                          break L8;
                        } else {
                          stackOut_22_0 = (qi) ((Object) stackIn_22_0);
                          stackOut_22_1 = (String) ((Object) stackIn_22_1);
                          stackOut_22_2 = stackIn_22_2;
                          stackOut_22_3 = 0;
                          stackIn_24_0 = stackOut_22_0;
                          stackIn_24_1 = stackOut_22_1;
                          stackIn_24_2 = stackOut_22_2;
                          stackIn_24_3 = stackOut_22_3;
                          break L8;
                        }
                      }
                      L9: {
                        stackOut_24_0 = (qi) ((Object) stackIn_24_0);
                        stackOut_24_1 = (String) ((Object) stackIn_24_1);
                        stackOut_24_2 = stackIn_24_2;
                        stackOut_24_3 = stackIn_24_3 + param4.field_p + (param0.field_o + param1);
                        stackOut_24_4 = -param4.field_n + (-param4.field_j + param0.field_x);
                        stackOut_24_5 = -param4.field_e + param0.field_u + -param4.field_p;
                        stackOut_24_6 = this.field_l;
                        stackOut_24_7 = this.field_h;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        stackIn_26_2 = stackOut_24_2;
                        stackIn_26_3 = stackOut_24_3;
                        stackIn_26_4 = stackOut_24_4;
                        stackIn_26_5 = stackOut_24_5;
                        stackIn_26_6 = stackOut_24_6;
                        stackIn_26_7 = stackOut_24_7;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        stackIn_25_3 = stackOut_24_3;
                        stackIn_25_4 = stackOut_24_4;
                        stackIn_25_5 = stackOut_24_5;
                        stackIn_25_6 = stackOut_24_6;
                        stackIn_25_7 = stackOut_24_7;
                        if ((this.field_k ^ -1) == 2147483647) {
                          stackOut_26_0 = (qi) ((Object) stackIn_26_0);
                          stackOut_26_1 = (String) ((Object) stackIn_26_1);
                          stackOut_26_2 = stackIn_26_2;
                          stackOut_26_3 = stackIn_26_3;
                          stackOut_26_4 = stackIn_26_4;
                          stackOut_26_5 = stackIn_26_5;
                          stackOut_26_6 = stackIn_26_6;
                          stackOut_26_7 = stackIn_26_7;
                          stackOut_26_8 = 256;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          stackIn_27_2 = stackOut_26_2;
                          stackIn_27_3 = stackOut_26_3;
                          stackIn_27_4 = stackOut_26_4;
                          stackIn_27_5 = stackOut_26_5;
                          stackIn_27_6 = stackOut_26_6;
                          stackIn_27_7 = stackOut_26_7;
                          stackIn_27_8 = stackOut_26_8;
                          break L9;
                        } else {
                          stackOut_25_0 = (qi) ((Object) stackIn_25_0);
                          stackOut_25_1 = (String) ((Object) stackIn_25_1);
                          stackOut_25_2 = stackIn_25_2;
                          stackOut_25_3 = stackIn_25_3;
                          stackOut_25_4 = stackIn_25_4;
                          stackOut_25_5 = stackIn_25_5;
                          stackOut_25_6 = stackIn_25_6;
                          stackOut_25_7 = stackIn_25_7;
                          stackOut_25_8 = this.field_k;
                          stackIn_27_0 = stackOut_25_0;
                          stackIn_27_1 = stackOut_25_1;
                          stackIn_27_2 = stackOut_25_2;
                          stackIn_27_3 = stackOut_25_3;
                          stackIn_27_4 = stackOut_25_4;
                          stackIn_27_5 = stackOut_25_5;
                          stackIn_27_6 = stackOut_25_6;
                          stackIn_27_7 = stackOut_25_7;
                          stackIn_27_8 = stackOut_25_8;
                          break L9;
                        }
                      }
                      discarded$1 = ((qi) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param4.field_i, param4.field_d, param4.field_h);
                      break L6;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var6);
            stackOut_29_1 = new StringBuilder().append("nj.B(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param4 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_c = null;
        if (param0 < 55) {
            field_c = (uf[]) null;
        }
    }

    nj() {
        this.field_h = -2;
        this.field_a = -2147483648;
        this.field_f = false;
        this.field_j = null;
        this.field_k = -2147483648;
        this.field_l = -2;
        this.field_b = null;
        this.field_g = -2147483648;
    }

    final nj b(int param0, boolean param1) {
        this.field_h = param0;
        if (param1) {
            return (nj) null;
        }
        return (nj) (this);
    }

    static {
    }
}
