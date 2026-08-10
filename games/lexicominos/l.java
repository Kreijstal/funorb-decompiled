/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends mg {
    static String field_E;
    static int[] field_F;
    static int field_G;
    static int[] field_D;
    static String field_C;

    public static void h(int param0) {
        field_D = null;
        if (param0 != 4) {
          l.h(36);
          field_E = null;
          field_C = null;
          field_F = null;
          return;
        } else {
          field_E = null;
          field_C = null;
          field_F = null;
          return;
        }
    }

    final void a(w param0, int param1, int param2, int param3, int param4, int param5) {
        hh var8 = null;
        try {
            super.a(param0, param1, param2, param3 ^ param3, param4, param5);
            var8 = si.field_t;
            hh var7 = var8;
            if (var8 != null) {
                if (!this.a(param5, param1, param4, param2, (byte) -117)) {
                    return;
                }
                if (this.field_r instanceof wk || var8.field_r instanceof wk) {
                    ((wk) ((Object) this.field_r)).a(16797, (l) (this), var8);
                    si.field_t = null;
                    return;
                }
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "l.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void i(int param0) {
        int var1 = 74 / ((-45 - param0) / 38);
    }

    private l(int param0, int param1, int param2, int param3, rd param4, vd param5, w param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_A = param6;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "l.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_F = new int[4];
        field_C = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_E = "Members";
    }
}
