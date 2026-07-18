/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    private int field_c;
    private int field_h;
    private int field_s;
    static cd field_l;
    private int field_f;
    private float field_m;
    private int field_b;
    private int field_j;
    private int field_a;
    private int field_q;
    private boolean field_n;
    private int field_p;
    private rg field_r;
    static hi field_o;
    private int field_k;
    private int field_e;
    private int field_g;
    static boolean field_d;
    private int field_i;

    final void e(int param0) {
        ((oe) this).field_r.a(((oe) this).field_i, ((oe) this).field_b, param0 ^ -122);
        if (param0 != 0) {
            ((oe) this).a(89, -36, 56);
        }
    }

    final static void a(m param0) {
        hb var3 = null;
        try {
            var3 = gf.field_c;
            var3.b(true, 7);
            var3.b(param0.field_g, -49152);
            var3.b(param0.field_j, -49152);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "oe.D(" + (param0 != null ? "{...}" : "null") + ',' + 7 + ',' + -95 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        ((oe) this).field_f = param2;
        ((oe) this).field_j = param1;
        if (param0 >= -97) {
            ((oe) this).field_i = -44;
        }
    }

    final void b(int param0) {
        if (null == ba.field_f) {
          L0: {
            if (af.field_c > 0) {
              break L0;
            } else {
              ((oe) this).field_n = false;
              break L0;
            }
          }
          if (!((oe) this).field_n) {
            L1: {
              if (((oe) this).field_j <= ub.field_b) {
                if (((oe) this).field_j > 0) {
                  ue.field_D = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ue.field_D = (-ub.field_b + ((oe) this).field_j) / 2;
                break L1;
              }
            }
            L2: {
              if (ub.field_b != ((oe) this).field_p) {
                ((oe) this).field_r.a(((oe) this).field_q, ((oe) this).field_p, -116);
                break L2;
              } else {
                if (((oe) this).field_q == lb.field_z) {
                  break L2;
                } else {
                  ((oe) this).field_r.a(((oe) this).field_q, ((oe) this).field_p, -116);
                  break L2;
                }
              }
            }
            return;
          } else {
            if (param0 < -40) {
              int fieldTemp$2 = ((oe) this).field_k - 1;
              ((oe) this).field_k = ((oe) this).field_k - 1;
              if (fieldTemp$2 <= 0) {
                ((oe) this).field_k = ((oe) this).field_c;
                if (((oe) this).field_h > gb.field_i) {
                  ((oe) this).field_n = false;
                  return;
                } else {
                  int discarded$3 = 363;
                  this.a();
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -1) {
          L0: {
            L1: {
              if (((oe) this).field_h > gb.field_i) {
                break L1;
              } else {
                if (af.field_c <= 0) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
            ne.field_c.a(true);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                dl.field_a[var1_int] = 0L;
            }
            if (param0 <= 100) {
                oe.d(-61);
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                ve.field_w[var1_int] = 0L;
            }
            bg.field_E = 0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "oe.F(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != -12248) {
            field_d = true;
        }
        field_o = null;
        field_l = null;
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = ((oe) this).field_j;
        var3 = ((oe) this).field_f;
        if (((oe) this).c(-1)) {
          L0: {
            if (var3 > ((oe) this).field_e) {
              var3 = ((oe) this).field_e;
              break L0;
            } else {
              if (var3 < ((oe) this).field_s) {
                var3 = ((oe) this).field_s;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (((oe) this).field_g < var2) {
              var2 = ((oe) this).field_g;
              break L1;
            } else {
              if (var2 >= ((oe) this).field_a) {
                break L1;
              } else {
                var2 = ((oe) this).field_a;
                break L1;
              }
            }
          }
          L2: {
            if (((oe) this).field_m > 0.0f) {
              var4 = (int)(0.5f + (float)var3 * ((oe) this).field_m);
              if (var4 > var2) {
                var3 = (int)((float)var2 / ((oe) this).field_m);
                break L2;
              } else {
                if (var2 > var4) {
                  var2 = var4;
                  break L2;
                } else {
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L3: {
            L4: {
              if (ub.field_b != var2) {
                break L4;
              } else {
                if (var3 != lb.field_z) {
                  break L4;
                } else {
                  break L3;
                }
              }
            }
            ((oe) this).field_r.a(var3, var2, -121);
            break L3;
          }
          L5: {
            if (((oe) this).field_j <= 0) {
              break L5;
            } else {
              ue.field_D = (-ub.field_b + ((oe) this).field_j) / 2;
              break L5;
            }
          }
          return;
        } else {
          ((oe) this).field_n = false;
          return;
        }
    }

    private oe() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new cd("email");
        field_o = new hi();
        field_d = false;
    }
}
