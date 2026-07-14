/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends ib implements ha, en {
    private d field_L;
    private qf field_I;
    static long[] field_M;
    static int field_N;
    private lg field_O;
    static String field_K;
    static jp field_P;
    static String field_J;

    private final String h(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            ((ig) this).a(50, 62, (byte) 59, -10, (d) null);
        }
        return "</col></u>";
    }

    public final void a(int param0, int param1, int param2, lg param3) {
        int var6 = 0;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          if (param2 == -1) {
            ih.a("terms.ws", param1 + 538);
            break L0;
          } else {
            if (-2 == param2) {
              ih.a("privacy.ws", param1 + 538);
              break L0;
            } else {
              if (2 == param2) {
                ih.a("conduct.ws", param1 + 538);
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L1: {
          if (param1 == -526) {
            break L1;
          } else {
            field_K = null;
            break L1;
          }
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = BrickABrac.field_J ? 1 : 0;
        lb.c(param1, param3, param2 + 1, 10000536);
        lb.c(param1, param3 - -param0, param2 + 1, 12105912);
        int var5 = 1;
        int var6 = param0;
        if (var5 + param3 < lb.field_b) {
            var5 = -param3 + lb.field_b;
        }
        if (lb.field_j < param3 - -var6) {
            var6 = -param3 + lb.field_j;
        }
        for (var7 = var5; var7 < var6; var7++) {
            var8 = 48 * var7 / param0 + 152;
            var9 = var8 | (var8 << 1773047848 | var8 << 1772889264);
            lb.field_l[param1 + (param3 - -var7) * lb.field_c] = var9;
            lb.field_l[param2 + (param1 + (param3 + var7) * lb.field_c)] = var9;
        }
        if (param4 != -17634) {
            ig.b(-122, -110, 30, -70, -97);
        }
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        if (param4 == ((ig) this).field_L) {
            ek.l(111);
            ((ig) this).field_I.m(17);
        }
        if (param2 > -22) {
            ((ig) this).field_L = null;
        }
    }

    ig(qf param0) {
        super(0, 0, 288, 0, (ub) null);
        ((ig) this).field_I = param0;
        ((ig) this).field_L = new d(ri.field_L, (uh) null);
        ((ig) this).field_L.field_l = (ub) (Object) new hi();
        String var7 = rd.a(rp.field_z, new String[2], (byte) 103);
        int var3 = 20;
        um var4 = new um(a.field_u, 0, 0, 0, 0, 16777215, -1, 3, 0, a.field_u.field_F, -1, 2147483647, true);
        ((ig) this).field_O = new lg(var7, (ub) (Object) var4);
        ((ig) this).field_O.field_z = "";
        ((ig) this).field_O.a(qg.field_z, 0, (byte) -98);
        ((ig) this).field_O.a(qg.field_z, 1, (byte) -98);
        ((ig) this).field_O.field_i = (uh) this;
        ((ig) this).field_O.field_t = -40 + ((ig) this).field_t;
        ((ig) this).field_O.a(26, (byte) 46, -40 + ((ig) this).field_t, var3);
        var3 = var3 + (15 + ((ig) this).field_O.field_s);
        ((ig) this).a((oc) (Object) ((ig) this).field_O, true);
        int var5 = 4;
        int var6 = 200;
        ((ig) this).field_L.a(40, 300 + -var6 >> 1523323361, var3, (byte) -119, var6);
        ((ig) this).field_L.field_i = (uh) this;
        ((ig) this).a((oc) (Object) ((ig) this).field_L, true);
        ((ig) this).a(var3 + 55 - -var5, 0, 0, (byte) -119, 300);
    }

    private final String a(byte param0) {
        if (param0 != 34) {
            field_P = null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void a(int param0) {
        field_P = null;
        if (param0 != 12127) {
            field_J = null;
        }
        field_M = null;
        field_J = null;
        field_K = null;
    }

    final static jp[] a(jp[] param0, boolean param1) {
        int var3 = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        jp[] var5 = new jp[param0.length];
        jp[] var2 = var5;
        if (param1) {
            return null;
        }
        for (var3 = 0; param0.length > var3; var3++) {
            var5[var3] = pl.a(-16371, param0[var3]);
        }
        return var2;
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (!(param0 != 98)) {
            return ((ig) this).b(param2, (byte) 86);
        }
        if (99 == param0) {
            return ((ig) this).a(param2, (byte) -119);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = 0;
        field_M = new long[32];
        field_J = "Please enter a year between <%0> and <%1>";
    }
}
