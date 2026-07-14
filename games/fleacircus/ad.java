/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private String field_a;
    private boolean field_c;
    static dd[] field_b;

    final static byte[] a(String param0, int param1) {
        if (param1 != 0) {
            ad.a((byte) -106);
            return wh.field_e.a(0, param0, "");
        }
        return wh.field_e.a(0, param0, "");
    }

    ad(String param0) {
        this(param0, false);
    }

    public static void a(byte param0) {
        if (param0 != 42) {
            return;
        }
        field_b = null;
    }

    final boolean a(int param0) {
        if (param0 < 8) {
            field_b = null;
            return ((ad) this).field_c;
        }
        return ((ad) this).field_c;
    }

    ad(String param0, boolean param1) {
        ((ad) this).field_a = param0;
        ((ad) this).field_c = param1 ? true : false;
        if (null == ((ad) this).field_a) {
            ((ad) this).field_a = "";
        }
        if (((ad) this).field_a.length() == 0) {
            ((ad) this).field_c = false;
        }
    }

    final String b(int param0) {
        if (param0 >= -97) {
            Object var3 = null;
            byte[] discarded$0 = ad.a((String) null, 2);
            return ((ad) this).field_a;
        }
        return ((ad) this).field_a;
    }

    static {
    }
}
