/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends lk {
    ng field_n;
    static long[] field_q;
    private hl field_l;
    static String field_p;
    static boolean field_o;
    hk field_m;

    final lk b() {
        cb var1 = null;
        int var2 = 0;
        var2 = Lexicominos.field_L ? 1 : 0;
        L0: while (true) {
          var1 = (cb) (Object) ((kj) this).field_n.f(2);
          if (var1 != null) {
            if (null != var1.field_C) {
              return (lk) (Object) var1.field_C;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(int param0, cb param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        hl stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        cb stackIn_5_2 = null;
        hl stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        cb stackIn_6_2 = null;
        hl stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        cb stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        hl stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        cb stackOut_4_2 = null;
        hl stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        cb stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        hl stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        cb stackOut_5_2 = null;
        int stackOut_5_3 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if ((((kj) this).field_l.field_q[param1.field_z] & 4) == 0) {
                break L1;
              } else {
                if (0 <= param1.field_h) {
                  break L1;
                } else {
                  var4_int = ((kj) this).field_l.field_O[param1.field_z] / b.field_r;
                  var5 = (-param1.field_E + (1048575 + var4_int)) / var4_int;
                  param1.field_E = param0 * var4_int + param1.field_E & 1048575;
                  if (var5 > param0) {
                    break L1;
                  } else {
                    L2: {
                      if (0 == ((kj) this).field_l.field_u[param1.field_z]) {
                        param1.field_C = cc.a(param1.field_w, param1.field_C.l(), param1.field_C.j(), param1.field_C.k());
                        break L2;
                      } else {
                        L3: {
                          param1.field_C = cc.a(param1.field_w, param1.field_C.l(), 0, param1.field_C.k());
                          stackOut_4_0 = ((kj) this).field_l;
                          stackOut_4_1 = 92;
                          stackOut_4_2 = (cb) param1;
                          stackIn_6_0 = stackOut_4_0;
                          stackIn_6_1 = stackOut_4_1;
                          stackIn_6_2 = stackOut_4_2;
                          stackIn_5_0 = stackOut_4_0;
                          stackIn_5_1 = stackOut_4_1;
                          stackIn_5_2 = stackOut_4_2;
                          if (param1.field_p.field_k[param1.field_q] >= 0) {
                            stackOut_6_0 = (hl) (Object) stackIn_6_0;
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = (cb) (Object) stackIn_6_2;
                            stackOut_6_3 = 0;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            stackIn_7_2 = stackOut_6_2;
                            stackIn_7_3 = stackOut_6_3;
                            break L3;
                          } else {
                            stackOut_5_0 = (hl) (Object) stackIn_5_0;
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = (cb) (Object) stackIn_5_2;
                            stackOut_5_3 = 1;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_7_1 = stackOut_5_1;
                            stackIn_7_2 = stackOut_5_2;
                            stackIn_7_3 = stackOut_5_3;
                            break L3;
                          }
                        }
                        ((hl) (Object) stackIn_7_0).a((byte) stackIn_7_1, stackIn_7_2, stackIn_7_3 != 0);
                        break L2;
                      }
                    }
                    L4: {
                      if (0 <= param1.field_p.field_k[param1.field_q]) {
                        break L4;
                      } else {
                        param1.field_C.e(-1);
                        break L4;
                      }
                    }
                    param0 = param1.field_E / var4_int;
                    break L1;
                  }
                }
              }
            }
            param1.field_C.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("kj.B(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, cb param3, int[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        cc var11 = null;
        int var12 = 0;
        hl stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        cb stackIn_10_2 = null;
        hl stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        cb stackIn_11_2 = null;
        hl stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        cb stackIn_12_2 = null;
        int stackIn_12_3 = 0;
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
        hl stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        cb stackOut_9_2 = null;
        hl stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        cb stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        hl stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        cb stackOut_10_2 = null;
        int stackOut_10_3 = 0;
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
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          if ((4 & ((kj) this).field_l.field_q[param3.field_z]) == 0) {
            param3.field_C.b(param4, param0, param5);
            return;
          } else {
            if (param3.field_h >= 0) {
              param3.field_C.b(param4, param0, param5);
              return;
            } else {
              var7_int = ((kj) this).field_l.field_O[param3.field_z] / b.field_r;
              L0: while (true) {
                var8 = (var7_int + 1048575 - param3.field_E) / var7_int;
                if (var8 <= param5) {
                  L1: {
                    param3.field_C.b(param4, param0, var8);
                    param3.field_E = param3.field_E + (var8 * var7_int + -1048576);
                    param0 = param0 + var8;
                    param5 = param5 - var8;
                    var9 = b.field_r / 100;
                    var10 = 262144 / var7_int;
                    if (var10 >= var9) {
                      break L1;
                    } else {
                      var9 = var10;
                      break L1;
                    }
                  }
                  L2: {
                    var11 = param3.field_C;
                    if (((kj) this).field_l.field_u[param3.field_z] == 0) {
                      param3.field_C = cc.a(param3.field_w, var11.l(), var11.j(), var11.k());
                      break L2;
                    } else {
                      L3: {
                        param3.field_C = cc.a(param3.field_w, var11.l(), 0, var11.k());
                        stackOut_9_0 = ((kj) this).field_l;
                        stackOut_9_1 = 92;
                        stackOut_9_2 = (cb) param3;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        if (param3.field_p.field_k[param3.field_q] >= 0) {
                          stackOut_11_0 = (hl) (Object) stackIn_11_0;
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = (cb) (Object) stackIn_11_2;
                          stackOut_11_3 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          stackIn_12_2 = stackOut_11_2;
                          stackIn_12_3 = stackOut_11_3;
                          break L3;
                        } else {
                          stackOut_10_0 = (hl) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = (cb) (Object) stackIn_10_2;
                          stackOut_10_3 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          stackIn_12_2 = stackOut_10_2;
                          stackIn_12_3 = stackOut_10_3;
                          break L3;
                        }
                      }
                      ((hl) (Object) stackIn_12_0).a((byte) stackIn_12_1, stackIn_12_2, stackIn_12_3 != 0);
                      param3.field_C.b(var9, var11.j());
                      break L2;
                    }
                  }
                  L4: {
                    if (param3.field_p.field_k[param3.field_q] < 0) {
                      param3.field_C.e(-1);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var11.h(var9);
                  var11.b(param4, param0, param1 - param0);
                  if (!var11.h()) {
                    continue L0;
                  } else {
                    ((kj) this).field_m.a((lk) (Object) var11);
                    continue L0;
                  }
                } else {
                  param3.field_E = param3.field_E + var7_int * param5;
                  param3.field_C.b(param4, param0, param5);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("kj.C(").append(param0).append(',').append(param1).append(',').append(100).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
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
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param5 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        cb var3 = null;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        ((kj) this).field_m.a(param0);
        var3 = (cb) (Object) ((kj) this).field_n.a(true);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!((kj) this).field_l.b(var3, 0)) {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_m) {
                    this.a(var2, var3, 0);
                    var3.field_m = var3.field_m - var2;
                    break L1;
                  } else {
                    this.a(var3.field_m, var3, 0);
                    var2 = var2 - var3.field_m;
                    if (!((kj) this).field_l.a((int[]) null, 0, var3, var2, 120)) {
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
            var3 = (cb) (Object) ((kj) this).field_n.f(2);
            continue L0;
          }
        }
    }

    final int a() {
        return 0;
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        cb var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            ((kj) this).field_m.b(param0, param1, param2);
            var6 = (cb) (Object) ((kj) this).field_n.a(true);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!((kj) this).field_l.b(var6, 0)) {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var5 <= var6.field_m) {
                        this.a(var4_int, var4_int - -var5, 100, var6, param0, var5);
                        var6.field_m = var6.field_m - var5;
                        break L2;
                      } else {
                        this.a(var4_int, var4_int - -var5, 100, var6, param0, var6.field_m);
                        var5 = var5 - var6.field_m;
                        var4_int = var4_int + var6.field_m;
                        if (!((kj) this).field_l.a(param0, var4_int, var6, var5, 82)) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var6 = (cb) (Object) ((kj) this).field_n.f(2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("kj.I(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        field_p = null;
        field_q = null;
    }

    final static void c(boolean param0) {
        if (!param0) {
            return;
        }
        qf.f(-28390);
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!cg.a(75)) {
              L1: {
                if (null == ff.field_b) {
                  break L1;
                } else {
                  if (ff.field_b.field_d) {
                    af.a(-98);
                    ti.field_L.a(-14579, (w) (Object) new ii(ti.field_L, qg.field_a));
                    break L1;
                  } else {
                    break L1;
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
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "kj.H(" + 22 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final lk d() {
        cb var1 = null;
        var1 = (cb) (Object) ((kj) this).field_n.a(true);
        if (var1 != null) {
          if (var1.field_C != null) {
            return (lk) (Object) var1.field_C;
          } else {
            return ((kj) this).b();
          }
        } else {
          return null;
        }
    }

    kj(hl param0) {
        ((kj) this).field_n = new ng();
        ((kj) this).field_m = new hk();
        try {
            ((kj) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "kj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Loading sound effects";
        field_q = new long[32];
    }
}
