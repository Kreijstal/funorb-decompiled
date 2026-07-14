/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static String field_c;
    static hf field_h;
    static String field_b;
    static String field_d;
    static String field_g;
    static int[] field_a;
    static int field_e;
    static int field_f;

    public static void a(boolean param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        if (!param0) {
            String discarded$0 = mh.b((byte) 81);
        }
        field_d = null;
        field_h = null;
        field_c = null;
    }

    final static String b(byte param0) {
        String var1 = "";
        if (!(null == dd.field_d)) {
            var1 = dd.field_d.j(35);
        }
        if (var1.length() == 0) {
            var1 = tg.i(0);
        }
        if (param0 <= 50) {
            field_d = null;
        }
        if (-1 == (var1.length() ^ -1)) {
            var1 = fi.field_e;
        }
        return var1;
    }

    final static void a(byte param0, boolean param1) {
        wc.a(param1, 1983, true);
        if (param0 >= -68) {
            String discarded$0 = mh.b((byte) 6);
        }
    }

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var5 = EscapeVector.field_A;
        int var2 = param1.length();
        int var3 = 0;
        for (var4 = param0; var4 < var2; var4++) {
            var3 = hf.a(78, param1.charAt(var4)) + (-var3 + (var3 << 1321276677));
        }
        return var3;
    }

    final static void a(byte param0) {
        if (null != bk.field_r) {
            bk.field_r.a((byte) -109);
        }
        if (param0 != 119) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_h = new hf();
        field_b = "PER MONTH";
        field_d = "Confirm Password: ";
        field_a = new int[48];
        field_g = "Seek out and destroy all the alien military infrastructure.<br>Some levels are booby trapped with auto-destruct systems.<br>Escape before the timer counts down to zero.";
    }
}
