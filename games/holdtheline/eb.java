/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends qm {
    boolean field_m;
    static String field_p;
    int field_l;
    static boolean[] field_j;
    static String[] field_n;
    static fb field_o;
    static String field_k;

    eb(eb param0) {
        super(param0.field_h, param0.field_f);
        ((eb) this).field_m = false;
        ((eb) this).field_l = param0.field_l;
    }

    final static sd a(String param0, long param1, boolean param2, String param3, boolean param4) {
        if (!param4) {
            return null;
        }
        if (0L != param1) {
            if (!(!param2)) {
                return (sd) (Object) new bn(param1, param3);
            }
            return (sd) (Object) new pd(param1, param3);
        }
        if (param0 == null) {
            if (!(!param2)) {
                return (sd) (Object) new bn(param1, param3);
            }
            return (sd) (Object) new pd(param1, param3);
        }
        return (sd) (Object) new fh(param0, param3);
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        da var1 = da.field_p;
        while (ad.a(100)) {
            var1.c((byte) 33, 8);
            var1.field_l = var1.field_l + 1;
            var2 = var1.field_l + 1;
            dl.a(0, var1);
            da.field_p.a(-268435456, var1.field_l + -var2);
        }
        if (param0 >= -67) {
            Object var4 = null;
            sd discarded$0 = eb.a((String) null, 111L, true, (String) null, true);
            return;
        }
    }

    eb(qm param0, int param1) {
        super(param0.field_h, param0.field_f);
        ((eb) this).field_l = param1;
        ((eb) this).field_m = false;
    }

    public static void c(int param0) {
        field_o = null;
        field_k = null;
        field_n = null;
        field_j = null;
        if (param0 != 8) {
            return;
        }
        field_p = null;
    }

    final static void a(boolean param0, ah[] param1) {
        int var3 = 0;
        ah var4 = null;
        int var5 = HoldTheLine.field_D;
        ah[] var6 = param1;
        ah[] var2 = var6;
        if (param0) {
            return;
        }
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            ol.a(256, var4);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Play Tutorial";
        field_n = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_j = new boolean[64];
        field_k = "Accept";
    }
}
