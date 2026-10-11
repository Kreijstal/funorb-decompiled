/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    int field_a;
    int field_c;
    int field_e;
    static ka field_b;
    static String field_g;
    static qe[] field_h;
    int field_f;
    static String field_d;

    public static void a(int param0) {
        field_h = null;
        field_d = null;
        field_g = null;
        field_b = null;
        if (param0 != -3323) {
          a.a(118, 52, -105, -52, 50);
        }
    }

    final static pb[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 > -106) {
          return (pb[]) null;
        }
        pb[] var6 = new pb[9];
        pb[] var5 = var6;
        pb dupTemp$0 = cl.a(param0, -41, param2);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        pb dupTemp$1 = cl.a(param1, -117, param2);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param4 == 0) {
          return var5;
        }
        var6[4] = cl.a(param4, 119, 64);
        return var5;
    }

    static {
        field_g = "Please enter your age in years";
        field_h = new qe[1000];
        field_d = "To Customer Support";
    }
}
