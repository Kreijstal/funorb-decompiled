/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hn {
    static String field_a;
    static int field_b;
    static String field_d;
    static boolean field_c;

    final static String c() {
        String var1 = "";
        if (di.field_D != null) {
            var1 = di.field_D.a((byte) 117);
        }
        if (!(var1.length() != 0)) {
            int discarded$0 = -98;
            var1 = cb.a();
        }
        if (var1.length() == 0) {
            var1 = bm.field_r;
        }
        return var1;
    }

    abstract ec b(int param0);

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != 0) {
            field_c = false;
        }
    }

    abstract void a(sb param0, byte param1);

    final static ed a(boolean param0) {
        ed var2 = new ed(true);
        var2.field_i = param0 ? true : false;
        return var2;
    }

    final static void a() {
        ti.field_J = kj.field_a.a(false);
        CharSequence var2 = (CharSequence) (Object) ti.field_J;
        in.field_b = cl.a(-95, var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Rock blaster: Gun that fires explosives. Does not work underwater.";
        field_d = "Please check if address is correct";
        field_c = false;
    }
}
