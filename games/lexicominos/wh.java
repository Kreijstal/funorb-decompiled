/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static int field_f;
    private db[] field_b;
    static int[] field_e;
    static String field_a;
    static Boolean field_d;
    static String field_c;

    public static void a(int param0) {
        int var1 = -3 / ((25 - param0) / 51);
        field_e = null;
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, byte param1) {
        kd.field_a = (param0 & 52) >> 4;
        jf.field_K = param0 >> 2 & 3;
        if (kd.field_a > 2) {
            kd.field_a = 2;
            fi.field_b = 3 & param0;
            if (!(jf.field_K <= 2)) {
                jf.field_K = 2;
            }
            if (fi.field_b <= 2) {
                return;
            }
            fi.field_b = 2;
            return;
        }
        fi.field_b = 3 & param0;
        if (!(jf.field_K <= 2)) {
            jf.field_K = 2;
        }
        if (fi.field_b > 2) {
            fi.field_b = 2;
            return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != -1160208572) {
          field_d = null;
          gf.a(param3, param1, ((wh) this).field_b, param2, param0, (byte) 107);
          return;
        } else {
          gf.a(param3, param1, ((wh) this).field_b, param2, param0, (byte) 107);
          return;
        }
    }

    wh(db[] param0) {
        try {
            ((wh) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "wh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[8192];
        field_c = "Names can only contain letters, numbers, spaces and underscores";
        field_a = "Names should contain a maximum of 12 characters";
    }
}
