/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq {
    String field_c;
    int field_q;
    static boolean field_o;
    static String field_p;
    static String field_s;
    int field_j;
    String field_d;
    String[] field_m;
    sq field_l;
    int field_n;
    static String field_i;
    int field_t;
    lm[] field_f;
    boolean field_h;
    private String[] field_e;
    boolean field_r;
    static int field_a;
    int field_b;
    boolean field_k;
    String field_g;

    final static byte[] a(int param0, Object param1, boolean param2) {
        byte[] var3 = null;
        le var5 = null;
        if (param1 == null) {
            return null;
        }
        if (!(!(param1 instanceof byte[]))) {
            var3 = (byte[]) param1;
            if (!param2) {
                return var3;
            }
            return ck.a(var3, false);
        }
        if (param0 != -1) {
            Object var4 = null;
            byte[] discarded$0 = sq.a(101, (Object) null, true);
        }
        if (!(!(param1 instanceof le))) {
            var5 = (le) param1;
            return var5.a(false);
        }
        throw new IllegalArgumentException();
    }

    final void a(int param0, String param1) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 30712) {
            return;
        }
        if (((sq) this).field_m == null) {
            ((sq) this).field_m = new String[]{param1};
            return;
        }
        int var3 = ((sq) this).field_m.length;
        String[] var4 = new String[var3 - -1];
        for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = ((sq) this).field_m[var5];
        }
        ((sq) this).field_m = var4;
        ((sq) this).field_m[var3] = param1;
    }

    final void a(String param0, byte param1) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null == ((sq) this).field_e) {
            ((sq) this).field_e = new String[]{param0};
            return;
        }
        int var3 = ((sq) this).field_e.length;
        String[] var4 = new String[1 + var3];
        for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = ((sq) this).field_e[var5];
        }
        ((sq) this).field_e = var4;
        ((sq) this).field_e[var3] = param0;
        if (param1 != -47) {
            Object var7 = null;
            ((sq) this).a(-110, (String) null);
        }
    }

    final void a(byte param0, lm param1) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 < 5) {
            return;
        }
        if (null == ((sq) this).field_f) {
            ((sq) this).field_f = new lm[]{param1};
            return;
        }
        int var3 = ((sq) this).field_f.length;
        lm[] var4 = new lm[1 + var3];
        for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = ((sq) this).field_f[var5];
        }
        ((sq) this).field_f = var4;
        ((sq) this).field_f[var3] = param1;
    }

    final static void a(int param0, int param1, int param2) {
        sl var3 = js.field_f;
        var3.h(param1, 255);
        var3.c(3, (byte) -70);
        var3.c(8, (byte) -58);
        var3.d(param2, 255);
        if (param0 >= -18) {
            field_p = null;
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return bh.field_j;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!((param0 ^ -1) <= -1)) {
            return;
        }
        if (!(gf.field_k > param0)) {
            return;
        }
        if (param5 != -27259) {
            field_i = null;
        }
        if (!(param2 != -1)) {
            return;
        }
        if (-1 == param3) {
            if (!(0 != param1)) {
                if (!(param6 != 0)) {
                    return;
                }
                param2 = 1;
            }
        }
        wa var9 = bj.field_J[param0];
        wa var10 = var9;
        wa var7 = var10;
        if (var10 != null) {
            // if_icmpgt L243
            if (param4 == var10.field_g) {
                // if_icmplt L243
            }
            while (null != var7.field_c) {
                if (param4 <= var7.field_c.field_g) {
                    // if_icmpne L214
                    // if_icmpge L214
                }
                var7 = var7.field_c;
            }
            var7.field_c = wi.a(param1, param6, var7.field_c, param3, param2, param4, -3903);
        } else {
            bj.field_J[param0] = wi.a(param1, param6, var9, param3, param2, param4, -3903);
        }
    }

    public static void a(byte param0) {
        field_s = null;
        field_p = null;
        if (param0 < 126) {
            sq.a(-28, 66, 76);
        }
        field_i = null;
    }

    sq() {
        ((sq) this).field_c = "";
        ((sq) this).field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Allow spectators?";
        field_p = "<%0> fewer ships per turn";
        field_i = "Decline invitation to <%0>'s game";
    }
}
