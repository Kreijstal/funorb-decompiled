/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static int[][] field_g;
    private int field_b;
    static ea[] field_a;
    private int field_h;
    static int field_f;
    private boolean field_l;
    private int field_k;
    private int field_c;
    ea field_e;
    static ml[] field_i;
    private int field_j;
    ea[] field_d;

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        wb var5 = null;
        lc var6 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            var5 = (wb) (Object) hj.field_k.b(102);
            L1: while (true) {
              if (var5 == null) {
                var3 = -120 % ((14 - param0) / 44);
                var6 = (lc) (Object) sj.field_g.b(77);
                L2: while (true) {
                  if (var6 == null) {
                    break L0;
                  } else {
                    lc.a((byte) 126, param1, var6);
                    var6 = (lc) (Object) sj.field_g.b((byte) 56);
                    continue L2;
                  }
                }
              } else {
                ab.a(-20680, param1, var5);
                var5 = (wb) (Object) hj.field_k.b((byte) 56);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "nb.B(" + param0 + ',' + param1 + ')');
        }
    }

    final nb b(int param0, boolean param1) {
        ((nb) this).field_j = param0;
        if (!param1) {
            return null;
        }
        return (nb) this;
    }

    final void a(int param0, fe param1, on param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7_int = 0;
        String var7 = null;
        we stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        we stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        we stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        we stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        we stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        we stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        we stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        we stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        we stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        int stackIn_26_8 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        we stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        we stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        we stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        we stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        we stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        we stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        we stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        we stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        we stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        int stackOut_24_8 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              g.a(param1.field_t + param3, param1.field_q, param0 - -param1.field_u, param1.field_v, (byte) 55, ((nb) this).field_d);
              if (null != ((nb) this).field_e) {
                L2: {
                  var6_int = param1.field_u + (param0 + ((nb) this).field_c);
                  var7_int = ((nb) this).field_k + (param1.field_t + param3);
                  if (param2.field_j != 1) {
                    break L2;
                  } else {
                    var6_int = var6_int + (param1.field_v + -((nb) this).field_e.field_x) / 2;
                    break L2;
                  }
                }
                L3: {
                  if (param2.field_d == 1) {
                    var7_int = var7_int + (-((nb) this).field_e.field_A + param1.field_q) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (2 == param2.field_j) {
                    var6_int = var6_int + (-((nb) this).field_e.field_x + param1.field_v);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (2 == param2.field_d) {
                    var7_int = var7_int + (-((nb) this).field_e.field_A + param1.field_q);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((nb) this).field_e.f(var6_int, var7_int);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              var6_int = -22 / ((param4 - -35) / 61);
              var7 = param2.a(param1, (byte) -115);
              if (var7 == null) {
                break L6;
              } else {
                if (param2.field_k == null) {
                  break L6;
                } else {
                  if (((nb) this).field_h < 0) {
                    break L6;
                  } else {
                    L7: {
                      stackOut_17_0 = param2.field_k;
                      stackOut_17_1 = (String) var7;
                      stackOut_17_2 = param1.field_u + param0 - -param2.field_n;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_19_2 = stackOut_17_2;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      stackIn_18_2 = stackOut_17_2;
                      if (-2147483648 != ((nb) this).field_c) {
                        stackOut_19_0 = (we) (Object) stackIn_19_0;
                        stackOut_19_1 = (String) (Object) stackIn_19_1;
                        stackOut_19_2 = stackIn_19_2;
                        stackOut_19_3 = ((nb) this).field_c;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        stackIn_20_3 = stackOut_19_3;
                        break L7;
                      } else {
                        stackOut_18_0 = (we) (Object) stackIn_18_0;
                        stackOut_18_1 = (String) (Object) stackIn_18_1;
                        stackOut_18_2 = stackIn_18_2;
                        stackOut_18_3 = 0;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        stackIn_20_3 = stackOut_18_3;
                        break L7;
                      }
                    }
                    L8: {
                      stackOut_20_0 = (we) (Object) stackIn_20_0;
                      stackOut_20_1 = (String) (Object) stackIn_20_1;
                      stackOut_20_2 = stackIn_20_2 + stackIn_20_3;
                      stackOut_20_3 = param1.field_t + param3;
                      stackOut_20_4 = param2.field_c;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_22_2 = stackOut_20_2;
                      stackIn_22_3 = stackOut_20_3;
                      stackIn_22_4 = stackOut_20_4;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      stackIn_21_3 = stackOut_20_3;
                      stackIn_21_4 = stackOut_20_4;
                      if (-2147483648 == ((nb) this).field_k) {
                        stackOut_22_0 = (we) (Object) stackIn_22_0;
                        stackOut_22_1 = (String) (Object) stackIn_22_1;
                        stackOut_22_2 = stackIn_22_2;
                        stackOut_22_3 = stackIn_22_3;
                        stackOut_22_4 = stackIn_22_4;
                        stackOut_22_5 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        stackIn_23_3 = stackOut_22_3;
                        stackIn_23_4 = stackOut_22_4;
                        stackIn_23_5 = stackOut_22_5;
                        break L8;
                      } else {
                        stackOut_21_0 = (we) (Object) stackIn_21_0;
                        stackOut_21_1 = (String) (Object) stackIn_21_1;
                        stackOut_21_2 = stackIn_21_2;
                        stackOut_21_3 = stackIn_21_3;
                        stackOut_21_4 = stackIn_21_4;
                        stackOut_21_5 = ((nb) this).field_k;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        stackIn_23_3 = stackOut_21_3;
                        stackIn_23_4 = stackOut_21_4;
                        stackIn_23_5 = stackOut_21_5;
                        break L8;
                      }
                    }
                    L9: {
                      stackOut_23_0 = (we) (Object) stackIn_23_0;
                      stackOut_23_1 = (String) (Object) stackIn_23_1;
                      stackOut_23_2 = stackIn_23_2;
                      stackOut_23_3 = stackIn_23_3 + (stackIn_23_4 + stackIn_23_5);
                      stackOut_23_4 = -param2.field_i + (param1.field_v + -param2.field_n);
                      stackOut_23_5 = param1.field_q + -param2.field_c - param2.field_l;
                      stackOut_23_6 = ((nb) this).field_h;
                      stackOut_23_7 = ((nb) this).field_j;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_25_2 = stackOut_23_2;
                      stackIn_25_3 = stackOut_23_3;
                      stackIn_25_4 = stackOut_23_4;
                      stackIn_25_5 = stackOut_23_5;
                      stackIn_25_6 = stackOut_23_6;
                      stackIn_25_7 = stackOut_23_7;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      stackIn_24_2 = stackOut_23_2;
                      stackIn_24_3 = stackOut_23_3;
                      stackIn_24_4 = stackOut_23_4;
                      stackIn_24_5 = stackOut_23_5;
                      stackIn_24_6 = stackOut_23_6;
                      stackIn_24_7 = stackOut_23_7;
                      if (((nb) this).field_b == -2147483648) {
                        stackOut_25_0 = (we) (Object) stackIn_25_0;
                        stackOut_25_1 = (String) (Object) stackIn_25_1;
                        stackOut_25_2 = stackIn_25_2;
                        stackOut_25_3 = stackIn_25_3;
                        stackOut_25_4 = stackIn_25_4;
                        stackOut_25_5 = stackIn_25_5;
                        stackOut_25_6 = stackIn_25_6;
                        stackOut_25_7 = stackIn_25_7;
                        stackOut_25_8 = 256;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        stackIn_26_2 = stackOut_25_2;
                        stackIn_26_3 = stackOut_25_3;
                        stackIn_26_4 = stackOut_25_4;
                        stackIn_26_5 = stackOut_25_5;
                        stackIn_26_6 = stackOut_25_6;
                        stackIn_26_7 = stackOut_25_7;
                        stackIn_26_8 = stackOut_25_8;
                        break L9;
                      } else {
                        stackOut_24_0 = (we) (Object) stackIn_24_0;
                        stackOut_24_1 = (String) (Object) stackIn_24_1;
                        stackOut_24_2 = stackIn_24_2;
                        stackOut_24_3 = stackIn_24_3;
                        stackOut_24_4 = stackIn_24_4;
                        stackOut_24_5 = stackIn_24_5;
                        stackOut_24_6 = stackIn_24_6;
                        stackOut_24_7 = stackIn_24_7;
                        stackOut_24_8 = ((nb) this).field_b;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        stackIn_26_2 = stackOut_24_2;
                        stackIn_26_3 = stackOut_24_3;
                        stackIn_26_4 = stackOut_24_4;
                        stackIn_26_5 = stackOut_24_5;
                        stackIn_26_6 = stackOut_24_6;
                        stackIn_26_7 = stackOut_24_7;
                        stackIn_26_8 = stackOut_24_8;
                        break L9;
                      }
                    }
                    int discarded$1 = ((we) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_26_8, param2.field_j, param2.field_d, param2.field_e);
                    break L6;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("nb.H(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final nb a(int param0, boolean param1) {
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
        if (param0 != -13903) {
          L0: {
            nb discarded$13 = ((nb) this).a(-40, (byte) 105);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
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
          ((nb) this).field_l = stackIn_8_1 != 0;
          return (nb) this;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
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
          ((nb) this).field_l = stackIn_4_1 != 0;
          return (nb) this;
        }
    }

    final nb a(ea[] param0, int param1) {
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
              ((nb) this).field_d = param0;
              if (param1 == 7392) {
                break L1;
              } else {
                nb discarded$2 = ((nb) this).b(64, false);
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
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("nb.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return (nb) this;
    }

    final void a(nb param0, byte param1) {
        try {
            param0.field_c = ((nb) this).field_c;
            param0.field_h = ((nb) this).field_h;
            param0.field_k = ((nb) this).field_k;
            param0.field_l = ((nb) this).field_l;
            int var3_int = -79 % ((-91 - param1) / 32);
            param0.field_b = ((nb) this).field_b;
            param0.field_d = ((nb) this).field_d;
            param0.field_e = ((nb) this).field_e;
            param0.field_j = ((nb) this).field_j;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "nb.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final nb a(int param0, byte param1) {
        if (param1 >= -32) {
            return null;
        }
        ((nb) this).field_k = param0;
        return (nb) this;
    }

    final nb b(int param0, byte param1) {
        if (param1 != -93) {
            return null;
        }
        ((nb) this).field_c = param0;
        return (nb) this;
    }

    final void b(int param0) {
        ((nb) this).field_j = param0;
        ((nb) this).field_b = 256;
        ((nb) this).field_k = 0;
        ((nb) this).field_c = 0;
        ((nb) this).field_e = null;
        ((nb) this).field_h = 0;
        ((nb) this).field_d = null;
    }

    final void a(int param0, fe param1, on param2, nb param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (!((nb) this).field_l) {
                break L1;
              } else {
                param3.a(param5, param1, param2, param4, param0 + -14206);
                param3.b(param0 ^ -14098);
                break L1;
              }
            }
            L2: {
              if (param0 == 14097) {
                break L2;
              } else {
                ((nb) this).field_d = null;
                break L2;
              }
            }
            L3: {
              if (((nb) this).field_k == -2147483648) {
                break L3;
              } else {
                param3.field_k = ((nb) this).field_k;
                break L3;
              }
            }
            L4: {
              if (-1 <= ((nb) this).field_h) {
                param3.field_h = ((nb) this).field_h;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null != ((nb) this).field_d) {
                param3.field_d = ((nb) this).field_d;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (null == ((nb) this).field_e) {
                break L6;
              } else {
                param3.field_e = ((nb) this).field_e;
                break L6;
              }
            }
            L7: {
              if (((nb) this).field_b != -2147483648) {
                param3.field_b = ((nb) this).field_b;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((nb) this).field_j <= 0) {
                param3.field_j = ((nb) this).field_j;
                break L8;
              } else {
                break L8;
              }
            }
            if (2147483647 != ((nb) this).field_c) {
              param3.field_c = ((nb) this).field_c;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("nb.A(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          L11: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        field_a = null;
    }

    final nb a(int param0, int param1) {
        ((nb) this).field_h = param1;
        if (param0 <= 63) {
            nb.a((byte) 61, -107);
            return (nb) this;
        }
        return (nb) this;
    }

    nb() {
        ((nb) this).field_l = false;
        ((nb) this).field_b = -2147483648;
        ((nb) this).field_e = null;
        ((nb) this).field_h = -2;
        ((nb) this).field_k = -2147483648;
        ((nb) this).field_c = -2147483648;
        ((nb) this).field_j = -2;
        ((nb) this).field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[][]{new int[15], new int[20]};
        field_f = 0;
    }
}
