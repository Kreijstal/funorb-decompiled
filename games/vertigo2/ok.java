/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static String field_a;
    static cr field_b;
    static int[] field_d;
    static int field_c;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        int var1 = -67 % ((param0 - 81) / 38);
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5, int param6, int param7, boolean param8, int param9, int param10, boolean param11, int param12, int param13) {
        ko.field_S = null;
        hm.g(74);
        if (param7 != 12423) {
          field_a = (String) null;
          param11 = ve.a(param1, param0, param9, param7 + 9488, param11, param12, param2);
          in.a(param8, param3, param6, param11, param5, param9, param10, param13, (byte) -66, param4);
          ho.a(24285, param3, param10);
          ko.a(param11, param10, param12, true);
          return;
        } else {
          param11 = ve.a(param1, param0, param9, param7 + 9488, param11, param12, param2);
          in.a(param8, param3, param6, param11, param5, param9, param10, param13, (byte) -66, param4);
          ho.a(24285, param3, param10);
          ko.a(param11, param10, param12, true);
          return;
        }
    }

    static {
        field_a = "Exploiting a bug";
        field_d = new int[256];
        field_c = 0;
    }
}
