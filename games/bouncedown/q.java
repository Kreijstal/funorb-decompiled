/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends lc implements rf, rc {
    static tg field_F;
    static db field_A;
    private wd field_D;
    nd field_C;
    private wd field_z;
    static double field_L;
    static float field_I;
    static String field_J;
    static pf field_N;
    static int field_M;
    static jk[] field_G;
    private ti field_E;
    static volatile int field_H;

    final static void l(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (qj.field_c == null) {
          if (param0 != 8927) {
            field_F = null;
            return;
          } else {
            return;
          }
        } else {
          var1 = (Object) (Object) qj.field_c;
          synchronized (var1) {
            qj.field_c = null;
          }
          L0: {
            if (param0 == 8927) {
              break L0;
            } else {
              field_F = null;
              break L0;
            }
          }
          return;
        }
    }

    public final void a(int param0) {
        if (param0 != -3814) {
          field_F = null;
          ((mg) (Object) ((q) this).field_E.a(true)).i((byte) -115);
          return;
        } else {
          ((mg) (Object) ((q) this).field_E.a(true)).i((byte) -115);
          return;
        }
    }

    private final int a(int param0, String param1, int param2, String param3, int param4, lk param5) {
        int var7 = -116 % ((14 - param0) / 43);
        return this.a(param5, param3, 3019, param2, param4, 35, param1);
    }

    public static void f(byte param0) {
        field_J = null;
        field_N = null;
        if (param0 >= -102) {
            return;
        }
        field_G = null;
        field_A = null;
        field_F = null;
    }

    final static ie a(int param0, gk param1, String param2, gk param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param3.a(param4, false);
        var6 = param3.a(var5, param2, 1);
        if (param0 != -1) {
          return null;
        } else {
          return qe.a(39, param3, var5, var6, param1);
        }
    }

    public final void a(String param0, byte param1) {
        if (param1 != 43) {
            return;
        }
        ti var3 = ((q) this).field_E;
        String var4 = param0;
        ((ba) (Object) var3).a(false, var4, true);
    }

    private final void e(byte param0) {
        int var2 = 0;
        if (!this.k(7714)) {
          return;
        } else {
          var2 = 75 / ((param0 - -14) / 47);
          el.a((byte) -95, ((q) this).field_E.field_h);
          return;
        }
    }

    public q() {
        super(0, 0, 496, 0, (fc) null);
        ((q) this).field_E = new ti("", (sk) null, 12);
        jd var1 = new jd(qj.field_d, 0, 0, 0, 0, 16777215, -1, 3, 0, sg.field_a.field_s, -1, 2147483647, true);
        lk var2 = new lk(vh.field_d, (fc) (Object) var1, (sk) null);
        ((q) this).field_z = new wd(ga.field_b, (sk) null);
        ((q) this).field_D = new wd(qa.field_g, (sk) null);
        ((q) this).field_E.field_q = ej.field_e;
        ((q) this).field_E.a((uh) (Object) new mg((ba) (Object) ((q) this).field_E), true);
        ((q) this).field_z.field_y = false;
        ((q) this).field_z.field_j = (fc) (Object) new jh();
        ((q) this).field_D.field_j = (fc) (Object) new r();
        ((q) this).field_E.field_j = (fc) (Object) new tc(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.b(50, 80, 270, 20, var3);
        var3 += 50;
        ((q) this).b(var2, true);
        var3 = var3 + (5 + this.a(74, dg.field_i, 170, pe.field_b, var3, (lk) (Object) ((q) this).field_E));
        ((q) this).field_z.b(40, 80, var5, 496 + -var5 >> -1929626207, var3);
        ((q) this).field_D.b(40, 80, 60, 3 + var4, 15 + var3);
        ((q) this).field_D.field_n = (sk) this;
        ((q) this).field_z.field_n = (sk) this;
        ((q) this).b((lk) (Object) ((q) this).field_z, true);
        ((q) this).b((lk) (Object) ((q) this).field_D, true);
        ((q) this).field_C = new nd((rf) this);
        ((q) this).field_C.b(150, 80, -60 + -((q) this).field_E.field_k + (((q) this).field_k + -((q) this).field_E.field_r), ((q) this).field_E.field_k + ((q) this).field_E.field_r + 60, 20);
        ((q) this).b((lk) (Object) ((q) this).field_C, true);
        ((q) this).b(var4 + var3 - -55, 80, 496, 0, 0);
    }

    private final boolean a(wc param0, boolean param1) {
        uh var3 = null;
        vf var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (!param1) {
          var3 = param0.a(true);
          if (var3 == null) {
            return true;
          } else {
            L0: {
              var4 = var3.a((byte) 127);
              if (var4 != mc.field_a) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              }
            }
            return stackIn_12_0 != 0;
          }
        } else {
          field_A = null;
          var3 = param0.a(true);
          if (var3 == null) {
            return true;
          } else {
            L1: {
              var4 = var3.a((byte) 127);
              if (var4 != mc.field_a) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    private final int a(lk param0, String param1, int param2, int param3, int param4, int param5, String param6) {
        s var9 = null;
        hb var10 = null;
        var10 = new hb(20, param4, 120 - -param3, 25, param0, false, 120, 3, sg.field_a, 16777215, param1);
        ((q) this).b((lk) (Object) var10, true);
        var9 = new s(((wc) (Object) param0).a(true), param6, 126, param4 + var10.field_m, param3 + 25, param5);
        var9.field_n = (sk) this;
        if (param2 != 3019) {
          return -93;
        } else {
          ((q) this).b((lk) (Object) var9, true);
          return var9.field_m + var10.field_m;
        }
    }

    final static boolean g(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        var1 = (Object) (Object) qj.field_c;
        synchronized (var1) {
          if (ec.field_bb == oh.field_a) {
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          } else {
            L0: {
              lh.field_f = pf.field_A[oh.field_a];
              gk.field_d = fk.field_b[oh.field_a];
              if (param0 == -15) {
                break L0;
              } else {
                field_N = null;
                break L0;
              }
            }
            oh.field_a = 1 + oh.field_a & 127;
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
          }
        }
        return stackIn_8_0 != 0;
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        if (((q) this).field_D != param4) {
          if (param4 == ((q) this).field_z) {
            this.e((byte) -118);
            if (param0 <= 6) {
              field_J = null;
              return;
            } else {
              return;
            }
          } else {
            if (param0 > 6) {
              return;
            } else {
              field_J = null;
              return;
            }
          }
        } else {
          hc.a(0);
          if (param0 > 6) {
            return;
          } else {
            field_J = null;
            return;
          }
        }
    }

    private final boolean k(int param0) {
        if (!(this.a((wc) (Object) ((q) this).field_E, false))) {
            return false;
        }
        if (param0 != 7714) {
            field_M = -111;
            return true;
        }
        return true;
    }

    final void a(int param0, int param1, int param2, lk param3) {
        super.a(param0 ^ 0, param1, param2, param3);
        ((q) this).field_z.field_y = this.k(7714);
        if (param0 != -1) {
            field_J = null;
        }
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        if (super.a(param0, param1, param2, param3 ^ 0)) {
            return true;
        }
        if (param3 != -14565) {
            q.l(8);
            if (98 == param2) {
                return ((q) this).a((byte) -81, param0);
            }
            if (param2 == 99) {
                return ((q) this).a(param0, 19755);
            }
            return false;
        }
        if (98 == param2) {
            return ((q) this).a((byte) -81, param0);
        }
        if (!(param2 != 99)) {
            return ((q) this).a(param0, 19755);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Invalid password.";
        field_L = Math.atan2(1.0, 0.0);
        field_H = -1;
    }
}
