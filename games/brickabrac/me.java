/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    private String field_c;
    static jp field_b;
    static tp[] field_a;
    static int[][] field_e;
    static boolean[] field_f;
    static kl field_d;

    final void a(int param0, java.applet.Applet param1) {
        if (param0 < 92) {
          boolean discarded$2 = me.b(-113);
          sj.a(param1, (byte) 122, ((me) this).field_c, "jagex-last-login-method", 31536000L);
          return;
        } else {
          sj.a(param1, (byte) 122, ((me) this).field_c, "jagex-last-login-method", 31536000L);
          return;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != 100) {
            field_a = null;
        }
    }

    final static boolean b(int param0) {
        int var1 = 0 % ((param0 - 66) / 35);
        return sm.field_b != sm.field_a ? true : false;
    }

    final static String a(String param0, int param1, int param2) {
        CharSequence var6 = (CharSequence) (Object) param0;
        if (!tk.a(var6, false)) {
            return om.field_Xb;
        }
        if (ci.a(param0, -26)) {
            return rj.field_a;
        }
        if (!(param2 == wk.field_m)) {
            return df.field_c;
        }
        if (af.a(124, param0)) {
            return rd.a(dn.field_J, new String[1], (byte) 103);
        }
        if (fo.field_h >= 100) {
            return ap.field_d;
        }
        if (!(!nc.a(param2 + -2, param0))) {
            return rd.a(tq.field_a, new String[1], (byte) 103);
        }
        pi var5 = k.field_h;
        var5.e(-13413, param1);
        var5.field_l = var5.field_l + 1;
        int var4 = var5.field_l;
        var5.a(84, 2);
        var5.a(param0, param2 ^ -3);
        var5.d((byte) 119, -var4 + var5.field_l);
        return null;
    }

    final static void a(String param0, int param1) {
        System.out.println("Error: " + oh.a((byte) 13, "\n", param0, "%0a"));
        if (param1 > -73) {
            field_f = null;
        }
    }

    final boolean b(String param0, int param1) {
        if (param1 < 56) {
            field_b = null;
            return ((me) this).field_c.equals((Object) (Object) param0);
        }
        return ((me) this).field_c.equals((Object) (Object) param0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    me(String param0) {
        ((me) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new jp(540, 140);
    }
}
