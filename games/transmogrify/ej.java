/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends ag {
    static boolean field_n;
    static boolean field_k;
    static vg[] field_l;
    static String field_p;
    qj field_q;
    private lc field_o;
    jc field_m;

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        kc var6 = null;
        int var7 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        boolean stackOut_9_0 = false;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            this.field_m.b(param0, param1, param2);
            var6 = (kc) ((Object) this.field_q.a((byte) -95));
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var6) {
                    break L3;
                  } else {
                    if (var7 != 0) {
                      break L2;
                    } else {
                      stackOut_4_0 = this.field_o.a(7, var6);
                      stackIn_6_0 = stackOut_4_0;
                      L4: while (true) {
                        L5: {
                          if (stackIn_6_0) {
                            break L5;
                          } else {
                            var5 = param2;
                            var4_int = param1;
                            L6: while (true) {
                              if ((var6.field_r ^ -1) <= (var5 ^ -1)) {
                                this.a(var4_int + var5, param0, 0, var6, var4_int, var5);
                                var6.field_r = var6.field_r - var5;
                                break L5;
                              } else {
                                this.a(var4_int + var5, param0, 0, var6, var4_int, var6.field_r);
                                var4_int = var4_int + var6.field_r;
                                var5 = var5 - var6.field_r;
                                stackOut_9_0 = this.field_o.a((byte) 126, var4_int, var5, param0, var6);
                                stackIn_6_0 = stackOut_9_0;
                                stackIn_10_0 = stackOut_9_0;
                                if (var7 != 0) {
                                  continue L4;
                                } else {
                                  if (stackIn_10_0) {
                                    break L5;
                                  } else {
                                    continue L6;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var6 = (kc) ((Object) this.field_q.a(true));
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("ej.K(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "ej.H()");
        }
        return stackIn_1_0;
    }

    final static ii[] a(byte param0, ci param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ii[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ii[] stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -43) {
                break L1;
              } else {
                field_k = false;
                break L1;
              }
            }
            var4_int = param1.b(param0 + 108, param3);
            var5 = param1.a(-1, param2, var4_int);
            stackOut_3_0 = hj.a(param1, (byte) -62, var5, var4_int);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("ej.N(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    final ag a() {
        kc var1 = null;
        RuntimeException var1_ref = null;
        Object stackIn_4_0 = null;
        bb stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        bb stackOut_8_0 = null;
        try {
          L0: {
            L1: while (true) {
              var1 = (kc) ((Object) this.field_q.a(true));
              if (var1 == null) {
                stackOut_3_0 = null;
                stackIn_4_0 = stackOut_3_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (null != var1.field_y) {
                  stackOut_8_0 = var1.field_y;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "ej.A()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (ag) ((Object) stackIn_4_0);
        } else {
          return (ag) ((Object) stackIn_9_0);
        }
    }

    final static int a(int param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_n = true;
                break L1;
              }
            }
            stackOut_3_0 = bg.a(param1, true, param2, (byte) 126);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ej.M(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(int param0, kc param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        lc stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        lc stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        lc stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        lc stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        lc stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        lc stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        lc stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        lc stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == (this.field_o.field_v[param1.field_u] & 4)) {
                break L1;
              } else {
                if (param1.field_p < 0) {
                  var4_int = this.field_o.field_D[param1.field_u] / qh.field_p;
                  var5 = (-param1.field_n + (1048575 + var4_int)) / var4_int;
                  param1.field_n = 1048575 & param1.field_n - -(var4_int * param2);
                  if (var5 > param2) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        if (0 != this.field_o.field_P[param1.field_u]) {
                          break L3;
                        } else {
                          param1.field_y = bb.a(param1.field_t, param1.field_y.i(), param1.field_y.h(), param1.field_y.f());
                          if (!Transmogrify.field_A) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        param1.field_y = bb.a(param1.field_t, param1.field_y.i(), 0, param1.field_y.f());
                        stackOut_13_0 = this.field_o;
                        stackOut_13_1 = 0;
                        stackIn_18_0 = stackOut_13_0;
                        stackIn_18_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (0 <= param1.field_h.field_k[param1.field_i]) {
                          stackOut_18_0 = (lc) ((Object) stackIn_18_0);
                          stackOut_18_1 = stackIn_18_1;
                          stackOut_18_2 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          stackIn_19_2 = stackOut_18_2;
                          break L4;
                        } else {
                          stackOut_14_0 = (lc) ((Object) stackIn_14_0);
                          stackOut_14_1 = stackIn_14_1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackOut_16_0 = (lc) ((Object) stackIn_16_0);
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = 1;
                          stackIn_19_0 = stackOut_16_0;
                          stackIn_19_1 = stackOut_16_1;
                          stackIn_19_2 = stackOut_16_2;
                          break L4;
                        }
                      }
                      ((lc) (Object) stackIn_19_0).a(stackIn_19_1 != 0, stackIn_19_2 != 0, param1);
                      break L2;
                    }
                    L5: {
                      if ((param1.field_h.field_k[param1.field_i] ^ -1) > -1) {
                        param1.field_y.h(-1);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param2 = param1.field_n / var4_int;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            param1.field_y.d(param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var4);
            stackOut_27_1 = new StringBuilder().append("ej.I(").append(param0).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int[] param1, int param2, kc param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bb var11 = null;
        int var12 = 0;
        lc stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        lc stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        lc stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        lc stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        lc stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        lc stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        lc stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        lc stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & this.field_o.field_v[param3.field_u]) == param2) {
                break L1;
              } else {
                if ((param3.field_p ^ -1) <= -1) {
                  break L1;
                } else {
                  var7_int = this.field_o.field_D[param3.field_u] / qh.field_p;
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          var8 = (1048575 - -var7_int + -param3.field_n) / var7_int;
                          if ((param5 ^ -1) <= (var8 ^ -1)) {
                            break L5;
                          } else {
                            if (var12 != 0) {
                              break L4;
                            } else {
                              if (var12 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        param3.field_y.b(param1, param4, var8);
                        param3.field_n = param3.field_n + (var7_int * var8 - 1048576);
                        param4 = param4 + var8;
                        param5 = param5 - var8;
                        break L4;
                      }
                      L6: {
                        var9 = qh.field_p / 100;
                        var10 = 262144 / var7_int;
                        if ((var9 ^ -1) >= (var10 ^ -1)) {
                          break L6;
                        } else {
                          var9 = var10;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          var11 = param3.field_y;
                          if (-1 != (this.field_o.field_P[param3.field_u] ^ -1)) {
                            break L8;
                          } else {
                            param3.field_y = bb.a(param3.field_t, var11.i(), var11.h(), var11.f());
                            if (var12 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          param3.field_y = bb.a(param3.field_t, var11.i(), 0, var11.f());
                          stackOut_18_0 = this.field_o;
                          stackOut_18_1 = 0;
                          stackIn_23_0 = stackOut_18_0;
                          stackIn_23_1 = stackOut_18_1;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          if (-1 >= (param3.field_h.field_k[param3.field_i] ^ -1)) {
                            stackOut_23_0 = (lc) ((Object) stackIn_23_0);
                            stackOut_23_1 = stackIn_23_1;
                            stackOut_23_2 = 0;
                            stackIn_24_0 = stackOut_23_0;
                            stackIn_24_1 = stackOut_23_1;
                            stackIn_24_2 = stackOut_23_2;
                            break L9;
                          } else {
                            stackOut_19_0 = (lc) ((Object) stackIn_19_0);
                            stackOut_19_1 = stackIn_19_1;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_21_1 = stackOut_19_1;
                            stackOut_21_0 = (lc) ((Object) stackIn_21_0);
                            stackOut_21_1 = stackIn_21_1;
                            stackOut_21_2 = 1;
                            stackIn_24_0 = stackOut_21_0;
                            stackIn_24_1 = stackOut_21_1;
                            stackIn_24_2 = stackOut_21_2;
                            break L9;
                          }
                        }
                        ((lc) (Object) stackIn_24_0).a(stackIn_24_1 != 0, stackIn_24_2 != 0, param3);
                        param3.field_y.a(var9, var11.h());
                        break L7;
                      }
                      L10: {
                        if (0 <= param3.field_h.field_k[param3.field_i]) {
                          break L10;
                        } else {
                          param3.field_y.h(-1);
                          break L10;
                        }
                      }
                      L11: {
                        var11.f(var9);
                        var11.b(param1, param4, -param4 + param0);
                        if (!var11.e()) {
                          break L11;
                        } else {
                          this.field_m.a(var11);
                          break L11;
                        }
                      }
                      if (var12 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                    param3.field_n = param3.field_n + var7_int * param5;
                    break L1;
                  }
                }
              }
            }
            param3.field_y.b(param1, param4, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var7);
            stackOut_35_1 = new StringBuilder().append("ej.C(").append(param0).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L12;
            }
          }
          L13: {
            stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param2).append(',');
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param3 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L13;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L13;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static long a(long param0, long param1) {
        RuntimeException var4 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          L0: {
            stackOut_0_0 = param0 & param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var4), "ej.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final void d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        kc var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        boolean stackOut_10_0 = false;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            this.field_m.d(param0);
            var3 = (kc) ((Object) this.field_q.a((byte) -95));
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      break L2;
                    } else {
                      stackOut_4_0 = this.field_o.a(7, var3);
                      stackIn_6_0 = stackOut_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (!stackIn_6_0) {
                              break L6;
                            } else {
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var2_int = param0;
                          L7: while (true) {
                            if (var2_int <= var3.field_r) {
                              this.a(0, var3, var2_int);
                              var3.field_r = var3.field_r - var2_int;
                              break L5;
                            } else {
                              this.a(0, var3, var3.field_r);
                              var2_int = var2_int - var3.field_r;
                              stackOut_10_0 = this.field_o.a((byte) 123, 0, var2_int, (int[]) null, var3);
                              stackIn_6_0 = stackOut_10_0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var4 != 0) {
                                continue L4;
                              } else {
                                if (stackIn_11_0) {
                                  break L5;
                                } else {
                                  continue L7;
                                }
                              }
                            }
                          }
                        }
                        var3 = (kc) ((Object) this.field_q.a(true));
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "ej.G(" + param0 + ')');
        }
    }

    public static void b(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_p = null;
              if (!param0) {
                break L1;
              } else {
                field_k = false;
                break L1;
              }
            }
            field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "ej.L(" + param0 + ')');
        }
    }

    final static boolean a(wl param0, String param1, String param2, boolean param3, boolean param4, String param5, int param6) {
        boolean discarded$2 = false;
        sf var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (!param4) {
                break L1;
              } else {
                discarded$2 = ej.a((wl) null, (String) null, (String) null, false, true, (String) null, 27);
                break L1;
              }
            }
            if (jh.field_n != rh.field_v) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                L3: {
                  var7 = new sf(ci.field_f, param0);
                  ci.field_f.b((qg) (var7), (byte) -71);
                  if (oa.f((byte) 105)) {
                    break L3;
                  } else {
                    rh.field_v = of.field_d;
                    q.field_h = null;
                    c.field_d = param3;
                    ab.field_j = param6;
                    hf.field_g = param1;
                    kk.field_g = param5;
                    ta.field_h = param2;
                    if (!Transmogrify.field_A) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var7.u(-10);
                break L2;
              }
              stackOut_14_0 = 1;
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var7_ref);
            stackOut_16_1 = new StringBuilder().append("ej.D(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L5;
            }
          }
          L6: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L6;
            }
          }
          L7: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param5 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    final static void a(int param0, byte param1, e param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        boolean stackIn_13_0 = false;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_57_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0 = false;
        int stackOut_33_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_56_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var19 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = qg.a((byte) 108, (param0 + -param4) * 3);
              var6 = param4 * 3;
              vf.b(true);
              var7 = -10 + var5_int;
              if (-1 <= (param2.field_w ^ -1)) {
                break L1;
              } else {
                if (null == param2.field_y) {
                  break L1;
                } else {
                  di.c(-11517);
                  break L1;
                }
              }
            }
            L2: {
              ug.field_h = 0;
              if (param1 <= -122) {
                break L2;
              } else {
                field_p = (String) null;
                break L2;
              }
            }
            var8 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if ((var8 ^ -1) <= (param2.field_C ^ -1)) {
                    break L5;
                  } else {
                    var9 = param2.field_o[var8];
                    var10 = param2.field_s[var8];
                    var11 = param2.field_G[var8];
                    stackOut_12_0 = param3;
                    stackIn_57_0 = stackOut_12_0 ? 1 : 0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var19 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (stackIn_13_0) {
                            var12 = sg.field_a[var9];
                            var13 = d.field_a[var9];
                            var14 = -var12 + sg.field_a[var10];
                            var15 = sg.field_a[var11] + -var12;
                            var16 = d.field_a[var10] - var13;
                            var17 = d.field_a[var11] + -var13;
                            if ((-(var15 * var16) + var17 * var14 ^ -1) > -1) {
                              break L7;
                            } else {
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          var12 = nd.field_l[var9];
                          if (2147483647 != (var12 ^ -1)) {
                            break L8;
                          } else {
                            if (var19 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          var13 = nd.field_l[var10];
                          if (-2147483648 != var13) {
                            break L9;
                          } else {
                            if (var19 == 0) {
                              break L6;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          var14 = nd.field_l[var11];
                          if (-2147483648 != var14) {
                            break L10;
                          } else {
                            if (var19 == 0) {
                              break L6;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          var15 = -var6 + (var13 + var12 - -var14);
                          stackOut_33_0 = -1 + mh.field_b.length;
                          stackIn_36_0 = stackOut_33_0;
                          stackIn_34_0 = stackOut_33_0;
                          if (var7 >= 0) {
                            stackOut_36_0 = stackIn_36_0;
                            stackOut_36_1 = var15 >> var7;
                            stackIn_37_0 = stackOut_36_0;
                            stackIn_37_1 = stackOut_36_1;
                            break L11;
                          } else {
                            stackOut_34_0 = stackIn_34_0;
                            stackOut_34_1 = var15 << -var7;
                            stackIn_37_0 = stackOut_34_0;
                            stackIn_37_1 = stackOut_34_1;
                            break L11;
                          }
                        }
                        var16 = stackIn_37_0 - stackIn_37_1;
                        var17 = mh.field_b[var16];
                        L12: while (true) {
                          L13: {
                            L14: {
                              if (0 == var17 >> -2001050844) {
                                break L14;
                              } else {
                                var16--;
                                stackOut_39_0 = 0;
                                stackOut_39_1 = var16;
                                stackIn_48_0 = stackOut_39_0;
                                stackIn_48_1 = stackOut_39_1;
                                stackIn_40_0 = stackOut_39_0;
                                stackIn_40_1 = stackOut_39_1;
                                if (var19 != 0) {
                                  break L13;
                                } else {
                                  L15: {
                                    if (stackIn_40_0 <= stackIn_40_1) {
                                      break L15;
                                    } else {
                                      System.err.println("Out of range!");
                                      if (var19 == 0) {
                                        break L6;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  var17 = mh.field_b[var16];
                                  if (var19 == 0) {
                                    continue L12;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            stackOut_47_0 = var17;
                            stackOut_47_1 = var16 << -2120784220;
                            stackIn_48_0 = stackOut_47_0;
                            stackIn_48_1 = stackOut_47_1;
                            break L13;
                          }
                          L16: {
                            var18 = stackIn_48_0 + stackIn_48_1;
                            i.field_b[var18] = var8;
                            mh.field_b[var16] = var17 + 1;
                            if ((param2.field_w ^ -1) >= -1) {
                              break L16;
                            } else {
                              if (param2.field_y == null) {
                                break L16;
                              } else {
                                ca.field_c[param2.field_y[var8]] = ca.field_c[param2.field_y[var8]] + 1;
                                break L16;
                              }
                            }
                          }
                          ug.field_h = ug.field_h + 1;
                          break L6;
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_56_0 = -1;
                stackIn_57_0 = stackOut_56_0;
                break L4;
              }
              L17: {
                L18: {
                  if (stackIn_57_0 <= (param2.field_w ^ -1)) {
                    break L18;
                  } else {
                    if (null == param2.field_y) {
                      break L18;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L19: while (true) {
                        if (var9 >= ca.field_c.length) {
                          break L18;
                        } else {
                          var10 = ca.field_c[var9];
                          ca.field_c[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L17;
                          } else {
                            if (var19 == 0) {
                              continue L19;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L17;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var5 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) (var5);
            stackOut_68_1 = new StringBuilder().append("ej.B(").append(param0).append(',').append(param1).append(',');
            stackIn_71_0 = stackOut_68_0;
            stackIn_71_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param2 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L20;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_72_0 = stackOut_69_0;
              stackIn_72_1 = stackOut_69_1;
              stackIn_72_2 = stackOut_69_2;
              break L20;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final ag d() {
        kc var1 = null;
        RuntimeException var1_ref = null;
        Object stackIn_2_0 = null;
        bb stackIn_7_0 = null;
        ag stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bb stackOut_6_0 = null;
        ag stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var1 = (kc) ((Object) this.field_q.a((byte) -95));
            if (var1 != null) {
              if (var1.field_y != null) {
                stackOut_6_0 = var1.field_y;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_8_0 = this.a();
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "ej.E()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (ag) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ag) ((Object) stackIn_7_0);
          } else {
            return stackIn_9_0;
          }
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, pg param4, pg param5) {
        ii[] discarded$2 = null;
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              cd.field_f = param5;
              ee.field_D = param3;
              if (param1 >= 105) {
                break L1;
              } else {
                discarded$2 = ej.a((byte) 62, (ci) null, (String) null, (String) null);
                break L1;
              }
            }
            vh.field_m = param0;
            jl.field_o = param2;
            gl.field_B = param4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var6);
            stackOut_5_1 = new StringBuilder().append("ej.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    ej(lc param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        this.field_q = new qj();
        this.field_m = new jc();
        try {
          L0: {
            this.field_o = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ej.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_l = new vg[8];
        field_p = "Make your word here ... Make your word here ...";
        field_n = false;
    }
}
