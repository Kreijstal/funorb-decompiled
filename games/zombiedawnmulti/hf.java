/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static tq field_e;
    private boolean field_c;
    static String field_a;
    static String field_b;
    private String field_d;

    public static void b(byte param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        if (param0 != 45) {
            hf.b((byte) -95);
        }
    }

    hf(String param0) {
        this(param0, false);
    }

    final boolean a(byte param0) {
        if (param0 < 55) {
            ((hf) this).field_d = null;
            return ((hf) this).field_c;
        }
        return ((hf) this).field_c;
    }

    hf(String param0, boolean param1) {
        ((hf) this).field_d = param0;
        ((hf) this).field_c = param1 ? true : false;
        if (((hf) this).field_d == null) {
            ((hf) this).field_d = "";
        }
        if (0 == ((hf) this).field_d.length()) {
            ((hf) this).field_c = false;
        }
    }

    final String c(byte param0) {
        if (param0 != 99) {
            return null;
        }
        return ((hf) this).field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Fireball";
        field_b = "You cannot add yourself!";
    }
}
