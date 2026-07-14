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
        String var1 = null;
        if (param0 != 100) {
          L0: {
            field_p = null;
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
          sc discarded$2 = km.e(92);
          return;
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        in var6 = null;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        ((km) this).field_o.b(param0, param1, param2);
        var6 = (in) (Object) ((km) this).field_r.c(1504642273);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (((km) this).field_s.c(var6, (byte) 75)) {
                break L1;
              } else {
                var5 = param2;
                var4 = param1;
                L2: while (true) {
                  if (var6.field_E >= var5) {
                    this.a(var6, var4 + var5, var4, param0, -1, var5);
                    var6.field_E = var6.field_E - var5;
                    break L1;
                  } else {
                    this.a(var6, var5 + var4, var4, param0, -1, var6.field_E);
                    var5 = var5 - var6.field_E;
                    var4 = var4 + var6.field_E;
                    if (((km) this).field_s.a(var5, var6, var4, false, param0)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var6 = (in) (Object) ((km) this).field_r.f(1504642273);
            continue L0;
          } else {
            return;
          }
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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pp var11 = null;
        int var12 = 0;
        ti stackIn_9_0 = null;
        ti stackIn_10_0 = null;
        ti stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ti stackOut_8_0 = null;
        ti stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ti stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        var12 = Pixelate.field_H ? 1 : 0;
        if (param4 == (4 & ((km) this).field_s.field_x[param0.field_I] ^ -1)) {
          param0.field_G.b(param3, param2, param5);
          return;
        } else {
          if (0 > param0.field_v) {
            var7 = ((km) this).field_s.field_I[param0.field_I] / mm.field_h;
            L0: while (true) {
              var8 = (1048575 - (-var7 - -param0.field_n)) / var7;
              if (var8 > param5) {
                param0.field_n = param0.field_n + param5 * var7;
                param0.field_G.b(param3, param2, param5);
                return;
              } else {
                L1: {
                  param0.field_G.b(param3, param2, var8);
                  param2 = param2 + var8;
                  param0.field_n = param0.field_n + (var8 * var7 + -1048576);
                  param5 = param5 - var8;
                  var9 = mm.field_h / 100;
                  var10 = 262144 / var7;
                  if (var10 >= var9) {
                    break L1;
                  } else {
                    var9 = var10;
                    break L1;
                  }
                }
                L2: {
                  var11 = param0.field_G;
                  if (((km) this).field_s.field_o[param0.field_I] == 0) {
                    param0.field_G = pp.a(param0.field_F, var11.i(), var11.e(), var11.f());
                    break L2;
                  } else {
                    L3: {
                      param0.field_G = pp.a(param0.field_F, var11.i(), 0, var11.f());
                      stackOut_8_0 = ((km) this).field_s;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (-1 >= (param0.field_x.field_u[param0.field_A] ^ -1)) {
                        stackOut_10_0 = (ti) (Object) stackIn_10_0;
                        stackOut_10_1 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L3;
                      } else {
                        stackOut_9_0 = (ti) (Object) stackIn_9_0;
                        stackOut_9_1 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        break L3;
                      }
                    }
                    ((ti) (Object) stackIn_11_0).a(stackIn_11_1 != 0, (byte) 118, param0);
                    param0.field_G.b(var9, var11.e());
                    break L2;
                  }
                }
                L4: {
                  if (0 <= param0.field_x.field_u[param0.field_A]) {
                    break L4;
                  } else {
                    param0.field_G.g(-1);
                    break L4;
                  }
                }
                var11.e(var9);
                var11.b(param3, param2, -param2 + param1);
                if (var11.k()) {
                  ((km) this).field_o.a((sj) (Object) var11);
                  continue L0;
                } else {
                  continue L0;
                }
              }
            }
          } else {
            param0.field_G.b(param3, param2, param5);
            return;
          }
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
        sc discarded$0 = km.e(-33);
    }

    private final void a(int param0, int param1, in param2) {
        int var4 = 0;
        int var5 = 0;
        ti stackIn_18_0 = null;
        ti stackIn_19_0 = null;
        ti stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ti stackOut_17_0 = null;
        ti stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ti stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        if (-1 != (((km) this).field_s.field_x[param2.field_I] & 4 ^ -1)) {
          if (param2.field_v < 0) {
            var4 = ((km) this).field_s.field_I[param2.field_I] / mm.field_h;
            var5 = (1048575 + var4 - param2.field_n) / var4;
            param2.field_n = param2.field_n - -(param0 * var4) & 1048575;
            if (var5 <= param0) {
              L0: {
                if (-1 != (((km) this).field_s.field_o[param2.field_I] ^ -1)) {
                  L1: {
                    param2.field_G = pp.a(param2.field_F, param2.field_G.i(), 0, param2.field_G.f());
                    stackOut_17_0 = ((km) this).field_s;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (-1 >= (param2.field_x.field_u[param2.field_A] ^ -1)) {
                      stackOut_19_0 = (ti) (Object) stackIn_19_0;
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L1;
                    } else {
                      stackOut_18_0 = (ti) (Object) stackIn_18_0;
                      stackOut_18_1 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L1;
                    }
                  }
                  ((ti) (Object) stackIn_20_0).a(stackIn_20_1 != 0, (byte) 118, param2);
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
              param0 = param2.field_n / var4;
              param2.field_G.a(param0);
              if (param1 == 9380) {
                return;
              } else {
                ((km) this).field_s = null;
                return;
              }
            } else {
              param2.field_G.a(param0);
              if (param1 == 9380) {
                return;
              } else {
                ((km) this).field_s = null;
                return;
              }
            }
          } else {
            param2.field_G.a(param0);
            if (param1 == 9380) {
              return;
            } else {
              ((km) this).field_s = null;
              return;
            }
          }
        } else {
          param2.field_G.a(param0);
          if (param1 == 9380) {
            return;
          } else {
            ((km) this).field_s = null;
            return;
          }
        }
    }

    km(ti param0) {
        ((km) this).field_r = new bb();
        ((km) this).field_o = new vj();
        ((km) this).field_s = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Average rating";
        field_t = "Respect";
    }
}
