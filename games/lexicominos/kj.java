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
        int var4 = 0;
        int var5 = 0;
        hl stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        cb stackIn_8_2 = null;
        hl stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        cb stackIn_9_2 = null;
        hl stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        cb stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        hl stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        cb stackIn_29_2 = null;
        hl stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        cb stackIn_30_2 = null;
        hl stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        cb stackIn_31_2 = null;
        int stackIn_31_3 = 0;
        hl stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        cb stackOut_28_2 = null;
        hl stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        cb stackOut_30_2 = null;
        int stackOut_30_3 = 0;
        hl stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        cb stackOut_29_2 = null;
        int stackOut_29_3 = 0;
        hl stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        cb stackOut_7_2 = null;
        hl stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        cb stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        hl stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        cb stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        if (param2 == 0) {
          if (-1 != (((kj) this).field_l.field_q[param1.field_z] & 4 ^ -1)) {
            if (0 > param1.field_h) {
              var4 = ((kj) this).field_l.field_O[param1.field_z] / b.field_r;
              var5 = (-param1.field_E + (1048575 + var4)) / var4;
              param1.field_E = param0 * var4 + param1.field_E & 1048575;
              if (var5 <= param0) {
                if (0 == ((kj) this).field_l.field_u[param1.field_z]) {
                  param1.field_C = cc.a(param1.field_w, param1.field_C.l(), param1.field_C.j(), param1.field_C.k());
                  if (0 <= param1.field_p.field_k[param1.field_q]) {
                    param0 = param1.field_E / var4;
                    param1.field_C.a(param0);
                    return;
                  } else {
                    param1.field_C.e(-1);
                    param0 = param1.field_E / var4;
                    param1.field_C.a(param0);
                    return;
                  }
                } else {
                  L0: {
                    param1.field_C = cc.a(param1.field_w, param1.field_C.l(), 0, param1.field_C.k());
                    stackOut_28_0 = ((kj) this).field_l;
                    stackOut_28_1 = 92;
                    stackOut_28_2 = (cb) param1;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    stackIn_30_2 = stackOut_28_2;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    if (param1.field_p.field_k[param1.field_q] >= 0) {
                      stackOut_30_0 = (hl) (Object) stackIn_30_0;
                      stackOut_30_1 = stackIn_30_1;
                      stackOut_30_2 = (cb) (Object) stackIn_30_2;
                      stackOut_30_3 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      stackIn_31_2 = stackOut_30_2;
                      stackIn_31_3 = stackOut_30_3;
                      break L0;
                    } else {
                      stackOut_29_0 = (hl) (Object) stackIn_29_0;
                      stackOut_29_1 = stackIn_29_1;
                      stackOut_29_2 = (cb) (Object) stackIn_29_2;
                      stackOut_29_3 = 1;
                      stackIn_31_0 = stackOut_29_0;
                      stackIn_31_1 = stackOut_29_1;
                      stackIn_31_2 = stackOut_29_2;
                      stackIn_31_3 = stackOut_29_3;
                      break L0;
                    }
                  }
                  ((hl) (Object) stackIn_31_0).a((byte) stackIn_31_1, stackIn_31_2, stackIn_31_3 != 0);
                  if (0 > param1.field_p.field_k[param1.field_q]) {
                    param1.field_C.e(-1);
                    param0 = param1.field_E / var4;
                    param1.field_C.a(param0);
                    return;
                  } else {
                    param0 = param1.field_E / var4;
                    param1.field_C.a(param0);
                    return;
                  }
                }
              } else {
                param1.field_C.a(param0);
                return;
              }
            } else {
              param1.field_C.a(param0);
              return;
            }
          } else {
            param1.field_C.a(param0);
            return;
          }
        } else {
          ((kj) this).field_m = null;
          if (-1 == (((kj) this).field_l.field_q[param1.field_z] & 4 ^ -1)) {
            param1.field_C.a(param0);
            return;
          } else {
            if (0 > param1.field_h) {
              var4 = ((kj) this).field_l.field_O[param1.field_z] / b.field_r;
              var5 = (-param1.field_E + (1048575 + var4)) / var4;
              param1.field_E = param0 * var4 + param1.field_E & 1048575;
              if (var5 <= param0) {
                if (0 == ((kj) this).field_l.field_u[param1.field_z]) {
                  param1.field_C = cc.a(param1.field_w, param1.field_C.l(), param1.field_C.j(), param1.field_C.k());
                  if (0 > param1.field_p.field_k[param1.field_q]) {
                    param1.field_C.e(-1);
                    param0 = param1.field_E / var4;
                    param1.field_C.a(param0);
                    return;
                  } else {
                    param0 = param1.field_E / var4;
                    param1.field_C.a(param0);
                    return;
                  }
                } else {
                  L1: {
                    param1.field_C = cc.a(param1.field_w, param1.field_C.l(), 0, param1.field_C.k());
                    stackOut_7_0 = ((kj) this).field_l;
                    stackOut_7_1 = 92;
                    stackOut_7_2 = (cb) param1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    if (param1.field_p.field_k[param1.field_q] >= 0) {
                      stackOut_9_0 = (hl) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = (cb) (Object) stackIn_9_2;
                      stackOut_9_3 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      stackIn_10_3 = stackOut_9_3;
                      break L1;
                    } else {
                      stackOut_8_0 = (hl) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = (cb) (Object) stackIn_8_2;
                      stackOut_8_3 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      stackIn_10_3 = stackOut_8_3;
                      break L1;
                    }
                  }
                  ((hl) (Object) stackIn_10_0).a((byte) stackIn_10_1, stackIn_10_2, stackIn_10_3 != 0);
                  if (0 > param1.field_p.field_k[param1.field_q]) {
                    param1.field_C.e(-1);
                    param0 = param1.field_E / var4;
                    param1.field_C.a(param0);
                    return;
                  } else {
                    param0 = param1.field_E / var4;
                    param1.field_C.a(param0);
                    return;
                  }
                }
              } else {
                param1.field_C.a(param0);
                return;
              }
            } else {
              param1.field_C.a(param0);
              return;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, cb param3, int[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        cc var11 = null;
        int var12 = 0;
        hl stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        cb stackIn_17_2 = null;
        hl stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        cb stackIn_18_2 = null;
        hl stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        cb stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        hl stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        cb stackOut_16_2 = null;
        hl stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        cb stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        hl stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        cb stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        var12 = Lexicominos.field_L ? 1 : 0;
        if ((4 & ((kj) this).field_l.field_q[param3.field_z]) != 0) {
          if (param3.field_h < 0) {
            var7 = ((kj) this).field_l.field_O[param3.field_z] / b.field_r;
            L0: while (true) {
              var8 = (var7 + 1048575 - param3.field_E) / var7;
              if (var8 <= param5) {
                L1: {
                  param3.field_C.b(param4, param0, var8);
                  param3.field_E = param3.field_E + (var8 * var7 + -1048576);
                  param0 = param0 + var8;
                  param5 = param5 - var8;
                  var9 = b.field_r / 100;
                  var10 = 262144 / var7;
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
                      stackOut_16_0 = ((kj) this).field_l;
                      stackOut_16_1 = 92;
                      stackOut_16_2 = (cb) param3;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      if (-1 >= (param3.field_p.field_k[param3.field_q] ^ -1)) {
                        stackOut_18_0 = (hl) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = (cb) (Object) stackIn_18_2;
                        stackOut_18_3 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        stackIn_19_3 = stackOut_18_3;
                        break L3;
                      } else {
                        stackOut_17_0 = (hl) (Object) stackIn_17_0;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = (cb) (Object) stackIn_17_2;
                        stackOut_17_3 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        stackIn_19_3 = stackOut_17_3;
                        break L3;
                      }
                    }
                    ((hl) (Object) stackIn_19_0).a((byte) stackIn_19_1, stackIn_19_2, stackIn_19_3 != 0);
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
                param3.field_E = param3.field_E + var7 * param5;
                param3.field_C.b(param4, param0, param5);
                if (param2 != 100) {
                  field_o = false;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            param3.field_C.b(param4, param0, param5);
            if (param2 != 100) {
              field_o = false;
              return;
            } else {
              return;
            }
          }
        } else {
          param3.field_C.b(param4, param0, param5);
          if (param2 != 100) {
            field_o = false;
            return;
          } else {
            return;
          }
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
        int var4 = 0;
        int var5 = 0;
        cb var6 = null;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        ((kj) this).field_m.b(param0, param1, param2);
        var6 = (cb) (Object) ((kj) this).field_n.a(true);
        L0: while (true) {
          if (var6 == null) {
            return;
          } else {
            L1: {
              if (!((kj) this).field_l.b(var6, 0)) {
                var5 = param2;
                var4 = param1;
                L2: while (true) {
                  if (var5 <= var6.field_m) {
                    this.a(var4, var4 - -var5, 100, var6, param0, var5);
                    var6.field_m = var6.field_m - var5;
                    break L1;
                  } else {
                    this.a(var4, var4 - -var5, 100, var6, param0, var6.field_m);
                    var5 = var5 - var6.field_m;
                    var4 = var4 + var6.field_m;
                    if (!((kj) this).field_l.a(param0, var4, var6, var5, 82)) {
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
            var6 = (cb) (Object) ((kj) this).field_n.f(2);
            continue L0;
          }
        }
    }

    public static void c(byte param0) {
        if (param0 != 37) {
            return;
        }
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
        int var2 = 0;
        var2 = Lexicominos.field_L ? 1 : 0;
        if (!cg.a(75)) {
          if (null != ff.field_b) {
            if (!ff.field_b.field_d) {
              return;
            } else {
              af.a(-98);
              ti.field_L.a(-14579, (w) (Object) new ii(ti.field_L, qg.field_a));
              return;
            }
          } else {
            return;
          }
        } else {
          if (param0 != 22) {
            return;
          } else {
            boolean discarded$2 = ti.field_L.a(ha.field_d, true, wc.field_a, (byte) 124);
            ti.field_L.f(true);
            L0: while (true) {
              if (!ji.a((byte) -72)) {
                return;
              } else {
                boolean discarded$3 = ti.field_L.a((byte) 86, pe.field_b, da.field_b);
                continue L0;
              }
            }
          }
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
        ((kj) this).field_l = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Loading sound effects";
        field_q = new long[32];
    }
}
