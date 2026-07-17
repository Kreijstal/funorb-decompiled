/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kk {
    static qj field_f;
    static ti[] field_d;
    static ci field_a;
    static we field_b;
    static String field_g;
    static String field_e;
    static String field_c;

    final static int a(int param0, int param1, int param2) {
        if (param1 < 224) {
            if (param1 < 336) {
                return -1;
            }
            if (416 <= param1) {
                return -1;
            }
            if (param2 >= 183) {
                if (param2 >= 214) {
                    return -1;
                }
                return 1;
            }
            return -1;
        }
        if (param1 >= 304) {
            if (param1 >= 336) {
                if (416 > param1) {
                    if (param2 >= 183) {
                        if (param2 >= 214) {
                            return -1;
                        }
                        return 1;
                    }
                }
            }
            return -1;
        }
        if (param2 >= 183) {
            if (param2 < 214) {
                return 0;
            }
        }
        if (param1 >= 336) {
            if (416 > param1) {
                if (param2 >= 183) {
                    if (param2 >= 214) {
                        return -1;
                    }
                    return 1;
                }
            }
        }
        return -1;
    }

    abstract nk a(int param0);

    public static void a() {
        field_c = null;
        field_d = null;
        field_e = null;
        field_a = null;
        field_b = null;
        field_f = null;
        field_g = null;
    }

    abstract void a(byte param0, oa param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Music: ";
        field_f = new qj();
    }
}
