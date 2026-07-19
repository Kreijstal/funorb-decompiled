/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends qb {
    static jd field_j;
    static String field_h;
    static gd field_g;
    static int field_i;

    public static void a(int param0) {
        field_h = null;
        field_j = null;
        if (param0 != -1962269296) {
            field_h = (String) null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static int a(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> -1086071871;
        param1 = param1 | param1 >>> -2110399614;
        param1 = param1 | param1 >>> -1009940316;
        if (param0 != -85) {
          return 125;
        } else {
          param1 = param1 | param1 >>> 1213636648;
          param1 = param1 | param1 >>> -1962269296;
          return param1 + 1;
        }
    }

    private cb() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "Suggested names: ";
    }
}
