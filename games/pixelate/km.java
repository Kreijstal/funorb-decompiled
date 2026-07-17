/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends sj {
    static tf field_p;
    static String field_q;
    static String field_t;
    bb field_r;
    private ti field_s;
    vj field_o;

    final static sc e() {
        int discarded$0 = 8192;
        String var1 = eg.f();
        if (var1 != null) {
            if (var1.indexOf('@') >= 0) {
                var1 = "";
            }
        }
        int discarded$1 = 8192;
        return new sc(eg.f(), op.g(120));
    }

    final sj d() {
        in var1_ref = null;
        int var2 = Pixelate.field_H ? 1 : 0;
        do {
            var1_ref = (in) (Object) ((km) this).field_r.f(1504642273);
            if (var1_ref == null) {
                return null;
            }
        } while (null == var1_ref.field_G);
        return (sj) (Object) var1_ref.field_G;
    }

    final sj b() {
        in var1 = null;
        var1 = (in) (Object) ((km) this).field_r.c(1504642273);
        if (var1 != null) {
          if (null != var1.field_G) {
            return (sj) (Object) var1.field_G;
          } else {
            return ((km) this).d();
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        wa.field_i = param0;
        if (!(oh.field_b == qh.field_c)) {
            var2 = qh.field_c * qh.field_c;
            var3 = -(oh.field_b * oh.field_b) + var2;
            param0 = param0 + var3 * (qo.field_o - param0) / var2;
        }
        ui.field_i.a(param0, 120, ho.field_c, 256, 640);
        jp.a(qo.field_o + -24, (byte) 123, 640, hd.field_q, 5, 0, v.field_c);
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        in var6 = null;
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
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            ((km) this).field_o.b(param0, param1, param2);
            var6 = (in) (Object) ((km) this).field_r.c(1504642273);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (((km) this).field_s.c(var6, (byte) 75)) {
                    break L2;
                  } else {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var6.field_E >= var5) {
                        this.a(var6, var4_int + var5, var4_int, param0, -1, var5);
                        var6.field_E = var6.field_E - var5;
                        break L2;
                      } else {
                        this.a(var6, var5 + var4_int, var4_int, param0, -1, var6.field_E);
                        var5 = var5 - var6.field_E;
                        var4_int = var4_int + var6.field_E;
                        if (((km) this).field_s.a(var5, var6, var4_int, false, param0)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var6 = (in) (Object) ((km) this).field_r.f(1504642273);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("km.A(");
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
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0) {
        int var2 = 0;
        in var3 = null;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        ((km) this).field_o.a(param0);
        var3 = (in) (Object) ((km) this).field_r.c(1504642273);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (!((km) this).field_s.c(var3, (byte) 75)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_E >= var2) {
                    this.a(var2, 9380, var3);
                    var3.field_E = var3.field_E - var2;
                    break L1;
                  } else {
                    this.a(var3.field_E, 9380, var3);
                    var2 = var2 - var3.field_E;
                    if (!((km) this).field_s.a(var2, var3, 0, false, (int[]) null)) {
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
            var3 = (in) (Object) ((km) this).field_r.f(1504642273);
            continue L0;
          } else {
            return;
          }
        }
    }

    private final void a(in param0, int param1, int param2, int[] param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pp var11 = null;
        int var12 = 0;
        ti stackIn_10_0 = null;
        ti stackIn_11_0 = null;
        ti stackIn_12_0 = null;
        int stackIn_12_1 = 0;
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
        RuntimeException decompiledCaughtException = null;
        ti stackOut_9_0 = null;
        ti stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ti stackOut_10_0 = null;
        int stackOut_10_1 = 0;
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
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & ((km) this).field_s.field_x[param0.field_I]) == 0) {
                break L1;
              } else {
                if (0 > param0.field_v) {
                  var7_int = ((km) this).field_s.field_I[param0.field_I] / mm.field_h;
                  L2: while (true) {
                    var8 = (1048575 - (-var7_int - -param0.field_n)) / var7_int;
                    if (var8 > param5) {
                      param0.field_n = param0.field_n + param5 * var7_int;
                      break L1;
                    } else {
                      L3: {
                        param0.field_G.b(param3, param2, var8);
                        param2 = param2 + var8;
                        param0.field_n = param0.field_n + (var8 * var7_int + -1048576);
                        param5 = param5 - var8;
                        var9 = mm.field_h / 100;
                        var10 = 262144 / var7_int;
                        if (var10 >= var9) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param0.field_G;
                        if (((km) this).field_s.field_o[param0.field_I] == 0) {
                          param0.field_G = pp.a(param0.field_F, var11.i(), var11.e(), var11.f());
                          break L4;
                        } else {
                          L5: {
                            param0.field_G = pp.a(param0.field_F, var11.i(), 0, var11.f());
                            stackOut_9_0 = ((km) this).field_s;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            if (param0.field_x.field_u[param0.field_A] >= 0) {
                              stackOut_11_0 = (ti) (Object) stackIn_11_0;
                              stackOut_11_1 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              stackIn_12_1 = stackOut_11_1;
                              break L5;
                            } else {
                              stackOut_10_0 = (ti) (Object) stackIn_10_0;
                              stackOut_10_1 = 1;
                              stackIn_12_0 = stackOut_10_0;
                              stackIn_12_1 = stackOut_10_1;
                              break L5;
                            }
                          }
                          ((ti) (Object) stackIn_12_0).a(stackIn_12_1 != 0, (byte) 118, param0);
                          param0.field_G.b(var9, var11.e());
                          break L4;
                        }
                      }
                      L6: {
                        if (0 <= param0.field_x.field_u[param0.field_A]) {
                          break L6;
                        } else {
                          param0.field_G.g(-1);
                          break L6;
                        }
                      }
                      var11.e(var9);
                      var11.b(param3, param2, -param2 + param1);
                      if (var11.k()) {
                        ((km) this).field_o.a((sj) (Object) var11);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            param0.field_G.b(param3, param2, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("km.G(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + -1 + 44 + param5 + 41);
        }
    }

    final int a() {
        return 0;
    }

    public static void a(byte param0) {
        field_p = null;
        field_t = null;
        field_q = null;
    }

    private final void a(int param0, int param1, in param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ti stackIn_7_0 = null;
        ti stackIn_8_0 = null;
        ti stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ti stackOut_6_0 = null;
        ti stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ti stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          if ((((km) this).field_s.field_x[param2.field_I] & 4) == 0) {
            param2.field_G.a(param0);
            return;
          } else {
            if (param2.field_v >= 0) {
              param2.field_G.a(param0);
              return;
            } else {
              var4_int = ((km) this).field_s.field_I[param2.field_I] / mm.field_h;
              var5 = (1048575 + var4_int - param2.field_n) / var4_int;
              param2.field_n = param2.field_n - -(param0 * var4_int) & 1048575;
              if (var5 <= param0) {
                L0: {
                  if (((km) this).field_s.field_o[param2.field_I] != 0) {
                    L1: {
                      param2.field_G = pp.a(param2.field_F, param2.field_G.i(), 0, param2.field_G.f());
                      stackOut_6_0 = ((km) this).field_s;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (param2.field_x.field_u[param2.field_A] >= 0) {
                        stackOut_8_0 = (ti) (Object) stackIn_8_0;
                        stackOut_8_1 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        break L1;
                      } else {
                        stackOut_7_0 = (ti) (Object) stackIn_7_0;
                        stackOut_7_1 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        break L1;
                      }
                    }
                    ((ti) (Object) stackIn_9_0).a(stackIn_9_1 != 0, (byte) 118, param2);
                    break L0;
                  } else {
                    param2.field_G = pp.a(param2.field_F, param2.field_G.i(), param2.field_G.e(), param2.field_G.f());
                    break L0;
                  }
                }
                L2: {
                  if (param2.field_x.field_u[param2.field_A] < 0) {
                    param2.field_G.g(-1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param0 = param2.field_n / var4_int;
                param2.field_G.a(param0);
                return;
              } else {
                param2.field_G.a(param0);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("km.D(").append(param0).append(44).append(9380).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    km(ti param0) {
        ((km) this).field_r = new bb();
        ((km) this).field_o = new vj();
        try {
            ((km) this).field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "km.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Average rating";
        field_t = "Respect";
    }
}
