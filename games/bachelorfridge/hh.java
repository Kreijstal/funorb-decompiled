/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static kv[] field_b;
    private String field_a;
    static int field_d;
    private boolean field_c;

    final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return ((hh) this).field_c;
    }

    final String a(int param0) {
        if (param0 != -1) {
            boolean discarded$0 = ((hh) this).a(false);
            return ((hh) this).field_a;
        }
        return ((hh) this).field_a;
    }

    hh(String param0) {
        this(param0, false);
    }

    hh(String param0, boolean param1) {
        ((hh) this).field_a = param0;
        if (null == ((hh) this).field_a) {
            ((hh) this).field_a = "";
        }
        ((hh) this).field_c = param1 ? true : false;
        if (((hh) this).field_a.length() == 0) {
            ((hh) this).field_c = false;
        }
    }

    public static void b(int param0) {
        if (param0 != -1) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
    }
}
