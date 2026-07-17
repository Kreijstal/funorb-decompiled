/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends wh {
    static qj field_n;
    private nb field_p;
    static String field_m;
    ja field_q;
    k field_o;

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ha var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            ((ol) this).field_o.a(param0, param1, param2);
            var6 = (ha) (Object) ((ol) this).field_q.b(2);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (((ol) this).field_p.a(-39, var6)) {
                    break L2;
                  } else {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var6.field_w >= var5) {
                        this.a(param0, var4_int, (byte) 126, var5, var6, var5 + var4_int);
                        var6.field_w = var6.field_w - var5;
                        break L2;
                      } else {
                        this.a(param0, var4_int, (byte) 126, var6.field_w, var6, var4_int - -var5);
                        var4_int = var4_int + var6.field_w;
                        var5 = var5 - var6.field_w;
                        if (!((ol) this).field_p.a(var5, param0, var4_int, 1, var6)) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var6 = (ha) (Object) ((ol) this).field_q.a(10);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ol.HA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(ha param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        nb stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        nb stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        nb stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        nb stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        nb stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        nb stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if ((4 & ((ol) this).field_p.field_I[param0.field_D]) == 0) {
                break L1;
              } else {
                if (param0.field_v >= 0) {
                  break L1;
                } else {
                  var4_int = ((ol) this).field_p.field_M[param0.field_D] / oa.field_h;
                  var5 = (var4_int + (1048575 - param0.field_C)) / var4_int;
                  param0.field_C = 1048575 & param0.field_C + param1 * var4_int;
                  if (var5 > param1) {
                    break L1;
                  } else {
                    L2: {
                      if (0 != ((ol) this).field_p.field_R[param0.field_D]) {
                        L3: {
                          param0.field_l = bh.a(param0.field_n, param0.field_l.f(), 0, param0.field_l.g());
                          stackOut_5_0 = ((ol) this).field_p;
                          stackOut_5_1 = 0;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          if (param0.field_B.field_q[param0.field_i] >= 0) {
                            stackOut_7_0 = (nb) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = 0;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            stackIn_8_2 = stackOut_7_2;
                            break L3;
                          } else {
                            stackOut_6_0 = (nb) (Object) stackIn_6_0;
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = 1;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            break L3;
                          }
                        }
                        ((nb) (Object) stackIn_8_0).a(stackIn_8_1 != 0, stackIn_8_2 != 0, param0);
                        break L2;
                      } else {
                        param0.field_l = bh.a(param0.field_n, param0.field_l.f(), param0.field_l.e(), param0.field_l.g());
                        break L2;
                      }
                    }
                    L4: {
                      if (0 > param0.field_B.field_q[param0.field_i]) {
                        param0.field_l.f(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param1 = param0.field_C / var4_int;
                    break L1;
                  }
                }
              }
            }
            L5: {
              if (param2 <= -100) {
                break L5;
              } else {
                ((ol) this).field_q = null;
                break L5;
              }
            }
            param0.field_l.d(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("ol.F(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final int c() {
        return 0;
    }

    final void d(int param0) {
        int var2 = 0;
        ha var3 = null;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        ((ol) this).field_o.d(param0);
        var3 = (ha) (Object) ((ol) this).field_q.b(2);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!((ol) this).field_p.a(-93, var3)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_w >= var2) {
                    this.a(var3, var2, -118);
                    var3.field_w = var3.field_w - var2;
                    break L1;
                  } else {
                    this.a(var3, var3.field_w, -107);
                    var2 = var2 - var3.field_w;
                    if (!((ol) this).field_p.a(var2, (int[]) null, 0, 1, var3)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (ha) (Object) ((ol) this).field_q.a(10);
            continue L0;
          }
        }
    }

    final wh b() {
        ha var1 = null;
        var1 = (ha) (Object) ((ol) this).field_q.b(2);
        if (var1 != null) {
          if (null != var1.field_l) {
            return (wh) (Object) var1.field_l;
          } else {
            return ((ol) this).a();
          }
        } else {
          return null;
        }
    }

    private final void a(int[] param0, int param1, byte param2, int param3, ha param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bh var11 = null;
        int var12 = 0;
        nb stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        nb stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        nb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
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
        RuntimeException decompiledCaughtException = null;
        nb stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        nb stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        nb stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
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
        var12 = TrackController.field_F ? 1 : 0;
        try {
          if ((((ol) this).field_p.field_I[param4.field_D] & 4) == 0) {
            param4.field_l.a(param0, param1, param3);
            return;
          } else {
            if (0 > param4.field_v) {
              var7_int = ((ol) this).field_p.field_M[param4.field_D] / oa.field_h;
              L0: while (true) {
                var8 = (-param4.field_C + 1048575 - -var7_int) / var7_int;
                if (param3 >= var8) {
                  L1: {
                    param4.field_l.a(param0, param1, var8);
                    param3 = param3 - var8;
                    param1 = param1 + var8;
                    param4.field_C = param4.field_C + (-1048576 + var7_int * var8);
                    var9 = oa.field_h / 100;
                    var10 = 262144 / var7_int;
                    if (var10 >= var9) {
                      break L1;
                    } else {
                      var9 = var10;
                      break L1;
                    }
                  }
                  L2: {
                    var11 = param4.field_l;
                    if (((ol) this).field_p.field_R[param4.field_D] != 0) {
                      L3: {
                        param4.field_l = bh.a(param4.field_n, var11.f(), 0, var11.g());
                        stackOut_11_0 = ((ol) this).field_p;
                        stackOut_11_1 = 0;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (0 <= param4.field_B.field_q[param4.field_i]) {
                          stackOut_13_0 = (nb) (Object) stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          stackIn_14_2 = stackOut_13_2;
                          break L3;
                        } else {
                          stackOut_12_0 = (nb) (Object) stackIn_12_0;
                          stackOut_12_1 = stackIn_12_1;
                          stackOut_12_2 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          break L3;
                        }
                      }
                      ((nb) (Object) stackIn_14_0).a(stackIn_14_1 != 0, stackIn_14_2 != 0, param4);
                      param4.field_l.c(var9, var11.e());
                      break L2;
                    } else {
                      param4.field_l = bh.a(param4.field_n, var11.f(), var11.e(), var11.g());
                      break L2;
                    }
                  }
                  L4: {
                    if (param4.field_B.field_q[param4.field_i] >= 0) {
                      break L4;
                    } else {
                      param4.field_l.f(-1);
                      break L4;
                    }
                  }
                  var11.h(var9);
                  var11.a(param0, param1, param5 - param1);
                  if (!var11.i()) {
                    continue L0;
                  } else {
                    ((ol) this).field_o.a((wh) (Object) var11);
                    continue L0;
                  }
                } else {
                  param4.field_C = param4.field_C + var7_int * param3;
                  param4.field_l.a(param0, param1, param3);
                  return;
                }
              }
            } else {
              param4.field_l.a(param0, param1, param3);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("ol.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          L6: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44).append(param1).append(44).append(126).append(44).append(param3).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param5 + 41);
        }
    }

    final wh a() {
        ha var1_ref = null;
        do {
            var1_ref = (ha) (Object) ((ol) this).field_q.a(10);
            if (var1_ref == null) {
                return null;
            }
        } while (var1_ref.field_l == null);
        return (wh) (Object) var1_ref.field_l;
    }

    public static void f(int param0) {
        field_m = null;
        if (param0 > -2) {
            return;
        }
        field_n = null;
    }

    final static void e() {
        int var1 = 0;
        if (qd.field_d >= 224) {
            da.a(256, (byte) -74);
        } else {
            var1 = qd.field_d % 32;
            da.a(-var1 + (32 + qd.field_d), (byte) -74);
        }
    }

    ol(nb param0) {
        ((ol) this).field_q = new ja();
        ((ol) this).field_o = new k();
        try {
            ((ol) this).field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ol.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Please enter your age in years";
    }
}
