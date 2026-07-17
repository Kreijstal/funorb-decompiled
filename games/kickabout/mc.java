/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mc {
    static int field_a;
    static String field_c;
    static String field_h;
    static String field_b;
    static String field_l;
    static ut[] field_k;
    static hd field_d;
    static String field_e;
    static boolean field_j;
    static String field_f;
    static String field_i;
    static String field_g;

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        int var1 = -9 % ((-32 - param0) / 58);
        field_e = null;
        field_f = null;
        field_l = null;
        field_i = null;
        field_c = null;
        field_k = null;
        field_d = null;
        field_h = null;
    }

    final static void a(int param0) {
        vg.field_Wb = true;
        gl.field_c = null;
        b.field_N = null;
        mu.field_Y = null;
        h.field_e = null;
        if (param0 < -82) {
          if (null != jl.field_f) {
            ei.field_b = jl.field_f;
            ij.field_s = qt.field_n;
            qt.field_n = null;
            ei.field_b.field_ab = -1;
            ei.field_b.field_ub = -1;
            jl.field_f = null;
            Kickabout.field_H = null;
            return;
          } else {
            Kickabout.field_H = null;
            return;
          }
        } else {
          mc.a((byte) 24);
          if (null == jl.field_f) {
            Kickabout.field_H = null;
            return;
          } else {
            ei.field_b = jl.field_f;
            ij.field_s = qt.field_n;
            qt.field_n = null;
            ei.field_b.field_ab = -1;
            ei.field_b.field_ub = -1;
            jl.field_f = null;
            Kickabout.field_H = null;
            return;
          }
        }
    }

    final static boolean a(long param0, boolean param1) {
        return param0 == 1272878999115L || param0 == 1272878132285L;
    }

    final int a(byte param0, long param1) {
        long var4 = 0L;
        L0: {
          var4 = ((mc) this).b((byte) -36);
          if (var4 > 0L) {
            aj.a(var4, 1);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > -51) {
          mc.a(19);
          return ((mc) this).a(114, param1);
        } else {
          return ((mc) this).a(114, param1);
        }
    }

    abstract int a(int param0, long param1);

    abstract long b(byte param0);

    abstract void b(int param0);

    final static double a(double param0, double param1, boolean param2) {
        return Math.sqrt(param0 * (1.7 * param1));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Mute this player for 48 hours";
        field_b = "Unrated game. Rewards are reduced.";
        field_e = "LOADING <%0>";
        field_c = "<%0> goes through <%1> for having a higher posession percentage than <%2>";
        field_l = "Buy this kit for 10 coins on the Orb Downloads page.";
        field_i = "awaiting start";
        field_g = "Log In";
        field_f = "buy";
    }
}
