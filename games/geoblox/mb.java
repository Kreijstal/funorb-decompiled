/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static String[] field_a;
    private String field_d;
    private boolean field_c;
    static od field_b;

    mb(String param0) {
        this(param0, false);
    }

    final String b(int param0) {
        if (param0 != 16925) {
            boolean discarded$0 = ((mb) this).a((byte) -83);
            return ((mb) this).field_d;
        }
        return ((mb) this).field_d;
    }

    mb(String param0, boolean param1) {
        ((mb) this).field_d = param0;
        if (null == ((mb) this).field_d) {
            ((mb) this).field_d = "";
        }
        ((mb) this).field_c = param1 ? true : false;
        if (((mb) this).field_d.length() == 0) {
            ((mb) this).field_c = false;
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final boolean a(byte param0) {
        if (param0 <= 74) {
            return false;
        }
        return ((mb) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_b = new od("email");
    }
}
