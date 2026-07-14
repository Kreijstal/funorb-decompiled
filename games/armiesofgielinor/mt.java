/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mt {
    static String field_g;
    static boolean field_f;
    private int field_a;
    static rc field_e;
    static int field_d;
    private String field_b;
    int field_c;

    public final String toString() {
        return ((mt) this).field_b.substring(0, ((mt) this).field_c) + "|" + ((mt) this).field_b.substring(((mt) this).field_c);
    }

    final char b(int param0) {
        if (param0 != -1) {
            ((mt) this).field_b = null;
        }
        ((mt) this).field_c = ((mt) this).field_c + 1;
        return ((mt) this).field_b.charAt(((mt) this).field_c);
    }

    final boolean a(byte param0) {
        if (param0 != 16) {
            return true;
        }
        return (((mt) this).field_c ^ -1) <= (((mt) this).field_a ^ -1) ? true : false;
    }

    public static void a(int param0) {
        field_e = null;
        field_g = null;
        if (param0 > -116) {
            Object var2 = null;
            String discarded$0 = mt.a((bv) null, false);
        }
    }

    final static String a(bv param0, boolean param1) {
        int var4_int = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = param0.g(61, 2) - -1;
        byte[] var3 = new byte[var2];
        for (var4_int = 0; var4_int < var2; var4_int++) {
            var3[var4_int] = (byte)(int)sa.a(param0, -1, -15329);
        }
        if (!param1) {
            field_g = null;
        }
        String var4 = new String(var3);
        return var4;
    }

    mt(String param0) {
        ((mt) this).field_c = 0;
        ((mt) this).field_b = param0;
        ((mt) this).field_a = ((mt) this).field_b.length();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_g = "You can only use Fortify on a village.";
    }
}
