/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ll extends gb {
    static oh[] field_u;
    boolean field_D;
    static hl field_A;
    static uf field_C;
    volatile boolean field_v;
    boolean field_B;
    static String[] field_y;
    static String field_t;
    static String field_E;
    static String field_w;
    static String field_z;
    static ah field_x;

    final static int a(int param0, byte param1, int param2) {
        if (param1 == -122) {
          if (param0 > -3) {
            if (-6 <= param2) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        } else {
          field_u = null;
          if (param0 > -3) {
            if (-6 <= param2) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        }
    }

    final static void a(el param0, int param1) {
        el var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TetraLink.field_J;
        param0.b(false);
        var2 = (el) (Object) jl.field_a.c(false);
        L0: while (true) {
          if (var2 != null) {
            if (var2.a(-24, param0)) {
              var2 = (el) (Object) jl.field_a.a((byte) -70);
              continue L0;
            } else {
              var3 = 107 % ((38 - param1) / 61);
              if (var2 != null) {
                cl.a((mc) (Object) var2, 99, (mc) (Object) param0);
                return;
              } else {
                jl.field_a.a((mc) (Object) param0, false);
                return;
              }
            }
          } else {
            var3 = 107 % ((38 - param1) / 61);
            if (var2 != null) {
              cl.a((mc) (Object) var2, 99, (mc) (Object) param0);
              return;
            } else {
              jl.field_a.a((mc) (Object) param0, false);
              return;
            }
          }
        }
    }

    final static String f(int param0) {
        if (param0 != 0) {
            return null;
        }
        return kb.field_q.g((byte) 81);
    }

    final static void a(int param0, String param1) {
        if (param0 != -3) {
            return;
        }
        ng.a(param1, true);
        uf.a(ec.field_d, false, false);
    }

    abstract byte[] c(boolean param0);

    abstract int a(boolean param0);

    public static void b(byte param0) {
        field_y = null;
        field_u = null;
        field_E = null;
        field_w = null;
        int var1 = 100 / ((param0 - 44) / 57);
        field_C = null;
        field_t = null;
        field_z = null;
        field_x = null;
        field_A = null;
    }

    final static void a(boolean param0, java.awt.Component param1, int param2, ie param3, g param4, int param5, byte param6, int param7) {
        Object var9 = null;
        nk.a(param7, param0, 10);
        ch.field_q = nk.a(param3, param1, 0, param2);
        hc.field_v = nk.a(param3, param1, 1, param5);
        u.field_g = new fg();
        id.field_x = param5 * 1000 / param7;
        hc.field_v.a((eb) (Object) u.field_g);
        if (param6 < 126) {
            var9 = null;
            ll.a(true, (java.awt.Component) null, -128, (ie) null, (g) null, 27, (byte) -4, -4);
        } else {
            ic.field_b = param4;
            ic.field_b.a((byte) 96, jj.field_a);
            ch.field_q.a((eb) (Object) ic.field_b);
            return;
        }
        ic.field_b = param4;
        ic.field_b.a((byte) 96, jj.field_a);
        ch.field_q.a((eb) (Object) ic.field_b);
    }

    final static void a(int param0, oh[] param1, jb param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, oh[] param13, int param14, int param15, jb param16, int param17, int param18, oh[] param19, int param20) {
        fn.a(param12, param18, new ve(param19), param16, param2, true, param20, param9, new ve(param13), new ve(param1), param10, param6, param4, param0, param15, param17, param8, param11, param7, param3, param14);
        if (param5 != -11319) {
            Object var22 = null;
            ll.a(false, (java.awt.Component) null, -31, (ie) null, (g) null, -116, (byte) 29, 80);
        }
    }

    ll() {
        ((ll) this).field_v = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new uf();
        field_z = "You have <%0> unread messages!";
        field_E = "Average rating";
    }
}
