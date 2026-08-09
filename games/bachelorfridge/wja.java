/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wja extends pu {
    static wma field_m;
    static kv field_l;
    static String field_n;

    public static void d(byte param0) {
        field_n = null;
        if (param0 >= -100) {
            wja.d((byte) 105);
            field_m = null;
            field_l = null;
            return;
        }
        field_m = null;
        field_l = null;
    }

    final static int a(int param0, int param1, boolean param2) {
        if (null == ug.field_o) {
            return -1;
        }
        if (qs.field_o > param1) {
            if (param2) {
                field_n = (String) null;
                if (ak.field_u > param1) {
                    return -1;
                }
                if (param1 >= ug.field_o.field_q + ak.field_u) {
                    return -1;
                }
                if (param0 < hka.field_h) {
                    return -1;
                }
                if (hka.field_h - -ug.field_o.field_p <= param0) {
                    return -1;
                }
                return 1;
            }
            if (ak.field_u <= param1 && param1 < ug.field_o.field_q + ak.field_u && param0 >= hka.field_h && hka.field_h - -ug.field_o.field_p > param0) {
                return 1;
            }
            return -1;
        }
        if (ug.field_o.field_q + qs.field_o <= param1) {
            if (param2) {
                field_n = (String) null;
                if (ak.field_u <= param1 && param1 < ug.field_o.field_q + ak.field_u && param0 >= hka.field_h && hka.field_h - -ug.field_o.field_p > param0) {
                    return 1;
                }
                return -1;
            }
            if (ak.field_u <= param1 && param1 < ug.field_o.field_q + ak.field_u && param0 >= hka.field_h && hka.field_h - -ug.field_o.field_p > param0) {
                return 1;
            }
            return -1;
        }
        if (et.field_l <= param0 && et.field_l - -ug.field_o.field_p > param0) {
            return 0;
        }
        if (param2) {
            field_n = (String) null;
            if (ak.field_u <= param1 && param1 < ug.field_o.field_q + ak.field_u && param0 >= hka.field_h && hka.field_h - -ug.field_o.field_p > param0) {
                return 1;
            }
            return -1;
        }
        if (ak.field_u <= param1 && param1 < ug.field_o.field_q + ak.field_u && param0 >= hka.field_h && hka.field_h - -ug.field_o.field_p > param0) {
            return 1;
        }
        return -1;
    }

    static {
        field_n = "You must have at least one move and one attack action equipped to continue.";
    }
}
