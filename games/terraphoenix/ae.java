/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends gb implements rg, n {
    static int field_H;
    am field_N;
    private eb field_K;
    static String field_L;
    static int field_I;
    static java.awt.Canvas field_G;
    private eb field_O;
    private ib field_J;
    static long field_M;
    static String field_F;

    public static void h(int param0) {
        field_L = null;
        field_G = null;
        field_F = null;
        if (param0 != -13271) {
            ae.h(-27);
        }
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        if (((ae) this).field_O != param0) {
          if (param0 == ((ae) this).field_K) {
            this.i(50);
            var6 = -85 / ((-5 - param4) / 57);
            return;
          } else {
            var6 = -85 / ((-5 - param4) / 57);
            return;
          }
        } else {
          ld.a(1);
          var6 = -85 / ((-5 - param4) / 57);
          return;
        }
    }

    final static void a(String param0, byte param1, String param2) {
        na.a(false, param2, 92, param0);
        if (param1 < 52) {
            ae.h(-17);
        }
    }

    final void a(gl param0, int param1, int param2, int param3) {
        if (param3 <= 25) {
            return;
        }
        super.a(param0, param1, param2, 123);
        ((ae) this).field_K.field_A = this.f((byte) 19);
    }

    private final boolean f(byte param0) {
        if (!this.a((byte) 122, (v) (Object) ((ae) this).field_J)) {
            return false;
        }
        int var2 = -89 / ((param0 - -47) / 49);
        return true;
    }

    private final int a(String param0, String param1, int param2, int param3, gl param4, int param5) {
        if (param5 >= -115) {
            return -71;
        }
        return this.a(param2, -18366, param3, param0, 35, param1, param4);
    }

    private final boolean a(byte param0, v param1) {
        int var4 = 118 / ((param0 - 70) / 51);
        rc var3 = param1.a(29730);
        if (!(var3 != null)) {
            return true;
        }
        im var5 = var3.a(-16323);
        return var5 == dg.field_c ? true : false;
    }

    public ae() {
        super(0, 0, 496, 0, (cj) null);
        ((ae) this).field_J = new ib("", (sc) null, 12);
        fd var1 = new fd(ra.field_l, 0, 0, 0, 0, 16777215, -1, 3, 0, qk.field_e.field_s, -1, 2147483647, true);
        gl var2 = new gl(wj.field_f, (cj) (Object) var1, (sc) null);
        ((ae) this).field_K = new eb(r.field_lb, (sc) null);
        ((ae) this).field_O = new eb(lf.field_d, (sc) null);
        ((ae) this).field_J.field_x = p.field_g;
        ((ae) this).field_J.a((rc) (Object) new ia((ej) (Object) ((ae) this).field_J), 5859);
        ((ae) this).field_K.field_A = false;
        ((ae) this).field_K.field_l = (cj) (Object) new ic();
        ((ae) this).field_O.field_l = (cj) (Object) new qh();
        ((ae) this).field_J.field_l = (cj) (Object) new ng(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(var3, (byte) 83, 270, 20, 50);
        ((ae) this).b((byte) 95, var2);
        var3 += 50;
        var3 = var3 + (this.a(ag.field_b, im.field_b, 170, var3, (gl) (Object) ((ae) this).field_J, -117) + 5);
        ((ae) this).field_K.a(var3, (byte) 46, var5, -var5 + 496 >> -250651615, 40);
        ((ae) this).field_O.a(var3 - -15, (byte) 73, 60, 3 + var4, 40);
        ((ae) this).field_O.field_r = (sc) this;
        ((ae) this).field_K.field_r = (sc) this;
        ((ae) this).b((byte) 95, (gl) (Object) ((ae) this).field_K);
        ((ae) this).b((byte) 95, (gl) (Object) ((ae) this).field_O);
        ((ae) this).field_N = new am((rg) this);
        ((ae) this).field_N.a(20, (byte) 68, -60 + -((ae) this).field_J.field_p + (-((ae) this).field_J.field_w + ((ae) this).field_p), 60 + (((ae) this).field_J.field_p + ((ae) this).field_J.field_w), 150);
        ((ae) this).b((byte) 95, (gl) (Object) ((ae) this).field_N);
        ((ae) this).a(0, (byte) 94, 496, 0, var3 - (-55 + -var4));
    }

    private final int a(int param0, int param1, int param2, String param3, int param4, String param5, gl param6) {
        ki var9 = null;
        j var10 = null;
        if (param1 != -18366) {
          return 17;
        } else {
          var10 = new j(20, param2, param0 + 120, 25, param6, false, 120, 3, qk.field_e, 16777215, param3);
          ((ae) this).b((byte) 95, (gl) (Object) var10);
          var9 = new ki(((v) (Object) param6).a(29730), param5, 126, var10.field_n + param2, param0 - -25, param4);
          var9.field_r = (sc) this;
          ((ae) this).b((byte) 95, (gl) (Object) var9);
          return var10.field_n - -var9.field_n;
        }
    }

    private final void i(int param0) {
        if (!this.f((byte) 70)) {
            return;
        }
        if (param0 != 50) {
            return;
        }
        vf.a(((ae) this).field_J.field_o, param0 + -17);
    }

    public final void a(String param0, int param1) {
        ib var3 = ((ae) this).field_J;
        String var4 = param0;
        int var5 = 127 % ((2 - param1) / 51);
        ((ej) (Object) var3).a(false, (byte) -120, var4);
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        if (!super.a(param0, param1, param2 ^ 0, param3)) {
          if (param2 == 30) {
            if (-99 != (param3 ^ -1)) {
              if (param3 == 99) {
                return ((ae) this).a(param1, (byte) 114);
              } else {
                return false;
              }
            } else {
              return ((ae) this).a(48, param1);
            }
          } else {
            field_F = null;
            if (-99 != (param3 ^ -1)) {
              if (param3 == 99) {
                return ((ae) this).a(param1, (byte) 114);
              } else {
                return false;
              }
            } else {
              return ((ae) this).a(48, param1);
            }
          }
        } else {
          return true;
        }
    }

    public final void a(int param0) {
        ((ia) (Object) ((ae) this).field_J.a(29730)).g(-4328);
        if (param0 != 50) {
            field_G = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "If you do not wish to save at this time, click below.";
        field_H = 0;
        field_M = 0L;
        field_F = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_I = 0;
    }
}
