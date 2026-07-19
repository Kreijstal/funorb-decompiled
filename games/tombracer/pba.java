/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pba {
    static int[] field_b;
    static String field_a;
    static String field_d;
    static String field_c;
    private static String field_z;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 4096) {
          pba.a(-39);
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    static {
        int var0 = 0;
        field_z = "pba.A(";
        field_b = new int[4096];
        for (var0 = 0; 4096 > var0; var0++) {
            field_b[var0] = kw.a(var0, 5888);
        }
        field_d = "Accept invitation to <%0>'s game";
        field_c = "Shoot a pistol, if you've collected one. Bullets are unlimited.";
        field_a = "You cannot chat to <%0> because <%0> is not in your friend list.";
    }
}
