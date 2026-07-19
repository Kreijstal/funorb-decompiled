/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends ie {
    static String field_N;
    private int field_R;
    private boolean field_O;
    static int[] field_Q;
    static int[] field_P;
    private int field_K;
    private int field_M;
    private String field_I;
    static String field_L;
    private jl field_J;

    final String b(byte param0) {
        int var2 = 0;
        String var3 = null;
        ng stackIn_2_0 = null;
        ng stackIn_3_0 = null;
        ng stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ng stackIn_6_0 = null;
        ng stackIn_7_0 = null;
        ng stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ng stackOut_5_0 = null;
        ng stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ng stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ng stackOut_1_0 = null;
        ng stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ng stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 < 16) {
          L0: {
            this.field_O = false;
            var2 = this.field_H.field_D ? 1 : 0;
            this.field_H.field_D = this.field_D;
            var3 = this.field_H.b((byte) 70);
            stackOut_5_0 = this.field_H;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var2 == 0) {
              stackOut_7_0 = (ng) ((Object) stackIn_7_0);
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (ng) ((Object) stackIn_6_0);
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_D = stackIn_8_1 != 0;
          return var3;
        } else {
          L1: {
            var2 = this.field_H.field_D ? 1 : 0;
            this.field_H.field_D = this.field_D;
            var3 = this.field_H.b((byte) 70);
            stackOut_1_0 = this.field_H;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (var2 == 0) {
              stackOut_3_0 = (ng) ((Object) stackIn_3_0);
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (ng) ((Object) stackIn_2_0);
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_D = stackIn_4_1 != 0;
          return var3;
        }
    }

    public static void a(byte param0) {
        boolean discarded$2 = false;
        String var2 = null;
        field_N = null;
        if (param0 != -84) {
          var2 = (String) null;
          discarded$2 = qp.a(true, 1L, (String) null);
          field_Q = null;
          field_P = null;
          field_L = null;
          return;
        } else {
          field_Q = null;
          field_P = null;
          field_L = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = param2 + this.field_z;
        int var6 = param0 + this.field_p;
        super.a(param0, param1, param2, (byte) 125);
        if (!(-1 == (param1 ^ -1))) {
            return;
        }
        int var7 = !this.field_O ? 0 : -this.field_M + (this.field_E - this.field_R * 2);
        int discarded$0 = this.field_J.a(this.field_I, var7 + (var5 + this.field_R), var6 - -this.field_R, this.field_M + -this.field_R, this.field_C - 2 * this.field_R, this.field_K, -1, !this.field_O ? 2 : 0, 1, this.field_J.field_w);
        int var8 = -35 % ((70 - param3) / 49);
    }

    final static boolean a(boolean param0, long param1, String param2) {
        im var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var4 = re.a(param2, -1);
              if (param0) {
                break L1;
              } else {
                qp.a((byte) 102);
                break L1;
              }
            }
            L2: {
              if (var4 == null) {
                break L2;
              } else {
                if (null == var4.field_Nb) {
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              L4: {
                if (null == io.field_c) {
                  break L4;
                } else {
                  if (null == ll.a(param1, 14428)) {
                    break L4;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L3;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4_ref);
            stackOut_11_1 = new StringBuilder().append("qp.A(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    qp(int param0, int param1, int param2, int param3, ng param4, boolean param5, int param6, int param7, jl param8, int param9, String param10) {
        super(param0, param1, param2, param3, (eb) null, (fn) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
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
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
        try {
          L0: {
            L1: {
              this.field_H = param4;
              this.field_I = param10;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
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
              ((qp) (this)).field_O = stackIn_4_1 != 0;
              this.field_M = param6;
              this.field_R = param7;
              this.field_J = param8;
              this.field_K = param9;
              var12_int = -this.field_R + this.field_M;
              var13 = this.field_J.a(param10, var12_int, this.field_J.field_w) - -(2 * this.field_R);
              if (var13 <= param3) {
                var13 = param3;
                break L2;
              } else {
                this.a(param2, (byte) 20, param1, param0, var13);
                break L2;
              }
            }
            L3: {
              if (!this.field_O) {
                stackOut_9_0 = this.field_M - -(2 * this.field_R);
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_H.a(-this.field_M + (param2 - 3 * this.field_R), (byte) 110, (var13 - param3 >> 1538837985) + this.field_R, var14, -(this.field_R * 2) + param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var12);
            stackOut_12_1 = new StringBuilder().append("qp.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (null != eg.field_n) {
          if (!eg.field_n.a(-105)) {
            if (null != hc.field_M) {
              if (!hc.field_M.j(-1)) {
                if (param0) {
                  if (!jg.k(1)) {
                    if (fl.a(param3, param1, param2, 0)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  qp.a((byte) 0);
                  if (!jg.k(1)) {
                    if (fl.a(param3, param1, param2, 0)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                hc.field_M = null;
                jp.a(62);
                return true;
              }
            } else {
              if (param0) {
                if (!jg.k(1)) {
                  if (fl.a(param3, param1, param2, 0)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                qp.a((byte) 0);
                if (!jg.k(1)) {
                  if (fl.a(param3, param1, param2, 0)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            }
          } else {
            jp.a(-99);
            return true;
          }
        } else {
          if (null != hc.field_M) {
            if (!hc.field_M.j(-1)) {
              if (param0) {
                if (!jg.k(1)) {
                  if (fl.a(param3, param1, param2, 0)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                qp.a((byte) 0);
                if (!jg.k(1)) {
                  if (fl.a(param3, param1, param2, 0)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            } else {
              hc.field_M = null;
              jp.a(62);
              return true;
            }
          } else {
            if (param0) {
              if (jg.k(1)) {
                return true;
              } else {
                L0: {
                  if (fl.a(param3, param1, param2, 0)) {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_13_0 = stackOut_11_0;
                    break L0;
                  }
                }
                return stackIn_13_0 != 0;
              }
            } else {
              qp.a((byte) 0);
              if (!jg.k(1)) {
                if (!fl.a(param3, param1, param2, 0)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    static {
        field_N = "Your email address is used to identify this account";
        field_P = new int[5];
        field_Q = new int[128];
    }
}
