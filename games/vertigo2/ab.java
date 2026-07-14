/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ab {
    static wp field_a;
    static boolean field_b;
    static cr field_d;
    static String field_c;

    abstract int b(int param0, int param1);

    final static boolean a(boolean param0, char param1) {
        if (param0) {
            return true;
        }
        if (param1 < 48) {
            return false;
        }
        if (57 < param1) {
            return false;
        }
        return true;
    }

    abstract byte[] a(boolean param0, int param1);

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(param1 != param0)) {
            var2 = rm.field_B;
        }
        if (!(param1 != 1)) {
            var2 = oa.field_p;
        }
        if (!((param1 ^ -1) != -3)) {
            var2 = mf.field_b;
        }
        return var2;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_b = true;
            field_c = null;
            field_d = null;
            return;
        }
        field_c = null;
        field_d = null;
    }

    abstract ff a(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new wp();
        field_c = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
