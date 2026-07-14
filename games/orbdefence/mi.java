/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    private boolean field_a;
    private String field_c;
    private boolean field_b;
    static String field_d;
    static String field_e;

    final void a(boolean param0, byte param1) {
        ((mi) this).field_a = param0 ? true : false;
        int var3 = 15 % ((param1 - -23) / 61);
        ((mi) this).field_b = true;
    }

    final boolean b(byte param0) {
        if (param0 != 67) {
            ((mi) this).field_a = true;
            return ((mi) this).field_a;
        }
        return ((mi) this).field_a;
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        if (param0 != -67) {
            field_d = null;
        }
    }

    final String a(int param0) {
        if (param0 >= -51) {
            boolean discarded$0 = ((mi) this).b((byte) -51);
            return ((mi) this).field_c;
        }
        return ((mi) this).field_c;
    }

    final boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        return ((mi) this).field_b;
    }

    mi(String param0) {
        ((mi) this).field_a = false;
        ((mi) this).field_b = false;
        ((mi) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Previous";
    }
}
