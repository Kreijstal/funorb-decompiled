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

    final static sc e(int param0) {
        String var1;
        if (param0 != 100) {
          L0: {
            field_p = (tf) null;
            var1 = eg.f(8192);
            if (var1 == null) {
              break L0;
            } else {
              if ((var1.indexOf('@') ^ -1) > -1) {
                break L0;
              } else {
                var1 = "";
                break L0;
              }
            }
          }
          return new sc(eg.f(8192), op.g(120));
        } else {
          L1: {
            var1 = eg.f(8192);
            if (var1 == null) {
              break L1;
            } else {
              if ((var1.indexOf('@') ^ -1) > -1) {
                break L1;
              } else {
                var1 = "";
                break L1;
              }
            }
          }
          return new sc(eg.f(8192), op.g(120));
        }
    }

    final sj d() {
        in var1_ref = null;
        int var2 = Pixelate.field_H ? 1 : 0;
        do {
            var1_ref = (in) ((Object) this.field_r.f(1504642273));
            if (var1_ref == null) {
                return null;
            }
        } while (null == var1_ref.field_G);
        return (sj) ((Object) var1_ref.field_G);
    }

    final sj b() {
        in var1;
        var1 = (in) ((Object) this.field_r.c(1504642273));
        if (var1 != null) {
          if (null != var1.field_G) {
            return (sj) ((Object) var1.field_G);
          } else {
            return this.d();
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, byte param1) {
        int var2;
        int var3;
        L0: {
          wa.field_i = param0;
          if (oh.field_b != qh.field_c) {
            var2 = qh.field_c * qh.field_c;
            var3 = -(oh.field_b * oh.field_b) + var2;
            param0 = param0 + var3 * (qo.field_o - param0) / var2;
            break L0;
          } else {
            break L0;
          }
        }
        ui.field_i.a(param0, 120, ho.field_c, 256, 640);
        jp.a(qo.field_o + -24, (byte) 123, 640, hd.field_q, 5, 0, v.field_c);
        if (param1 == 112) {
          return;
        } else {
          km.e(92);
          return;
        }
    }

    final void b(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        in var6 = null;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            this.field_o.b(param0, param1, param2);
            var6 = (in) ((Object) this.field_r.c(1504642273));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                stackIn_4_0 = this.field_s.c(var6, (byte) 75);
                L2: {
                  if (stackIn_4_0) {
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
                        if (this.field_s.a(var5, var6, var4_int, false, param0)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var6 = (in) ((Object) this.field_r.f(1504642273));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("km.A(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        int var2;
        in var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        this.field_o.a(param0);
        var3 = (in) ((Object) this.field_r.c(1504642273));
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (!this.field_s.c(var3, (byte) 75)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_E >= var2) {
                    this.a(var2, 9380, var3);
                    var3.field_E = var3.field_E - var2;
                    break L1;
                  } else {
                    this.a(var3.field_E, 9380, var3);
                    var2 = var2 - var3.field_E;
                    if (!this.field_s.a(var2, var3, 0, false, (int[]) null)) {
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
            var3 = (in) ((Object) this.field_r.f(1504642273));
            continue L0;
          } else {
            return;
          }
        }
    }

    private final void a(in param0, int param1, int param2, int[] param3, int param4, int param5) {
        ti stackIn_11_0 = null;
        ti stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pp var11 = null;
        int var12 = 0;
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == (4 & this.field_s.field_x[param0.field_I] ^ -1)) {
                break L1;
              } else {
                if (0 > param0.field_v) {
                  var7_int = this.field_s.field_I[param0.field_I] / mm.field_h;
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
                        if (this.field_s.field_o[param0.field_I] == 0) {
                          param0.field_G = pp.a(param0.field_F, var11.i(), var11.e(), var11.f());
                          break L4;
                        } else {
                          L5: {
                            param0.field_G = pp.a(param0.field_F, var11.i(), 0, var11.f());
                            stackIn_11_0 = this.field_s;

                            if (-1 >= (param0.field_x.field_u[param0.field_A] ^ -1)) {
                              stackIn_12_0 = (ti) ((Object) stackIn_11_0);
                              stackIn_12_1 = 0;
                              break L5;
                            } else {
                              stackIn_12_0 = (ti) ((Object) stackIn_11_0);
                              stackIn_12_1 = 1;
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
                        this.field_o.a(var11);
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
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("km.G(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int a() {
        return 0;
    }

    public static void a(byte param0) {
        field_p = null;
        field_t = null;
        field_q = null;
        if (param0 >= 101) {
            return;
        }
        km.e(-33);
    }

    private final void a(int param0, int param1, in param2) {
        ti stackIn_8_0 = null;
        ti stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (-1 == (this.field_s.field_x[param2.field_I] & 4 ^ -1)) {
                break L1;
              } else {
                if (param2.field_v >= 0) {
                  break L1;
                } else {
                  var4_int = this.field_s.field_I[param2.field_I] / mm.field_h;
                  var5 = (1048575 + var4_int - param2.field_n) / var4_int;
                  param2.field_n = param2.field_n - -(param0 * var4_int) & 1048575;
                  if (var5 <= param0) {
                    L2: {
                      if (-1 != (this.field_s.field_o[param2.field_I] ^ -1)) {
                        L3: {
                          param2.field_G = pp.a(param2.field_F, param2.field_G.i(), 0, param2.field_G.f());
                          stackIn_8_0 = this.field_s;

                          if (-1 >= (param2.field_x.field_u[param2.field_A] ^ -1)) {
                            stackIn_9_0 = (ti) ((Object) stackIn_8_0);
                            stackIn_9_1 = 0;
                            break L3;
                          } else {
                            stackIn_9_0 = (ti) ((Object) stackIn_8_0);
                            stackIn_9_1 = 1;
                            break L3;
                          }
                        }
                        ((ti) (Object) stackIn_9_0).a(stackIn_9_1 != 0, (byte) 118, param2);
                        break L2;
                      } else {
                        param2.field_G = pp.a(param2.field_F, param2.field_G.i(), param2.field_G.e(), param2.field_G.f());
                        break L2;
                      }
                    }
                    L4: {
                      if (param2.field_x.field_u[param2.field_A] < 0) {
                        param2.field_G.g(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param0 = param2.field_n / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            param2.field_G.a(param0);
            if (param1 == 9380) {
              break L0;
            } else {
              this.field_s = (ti) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("km.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    km(ti param0) {
        this.field_r = new bb();
        this.field_o = new vj();
        try {
            this.field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "km.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = "Average rating";
        field_t = "Respect";
    }
}
