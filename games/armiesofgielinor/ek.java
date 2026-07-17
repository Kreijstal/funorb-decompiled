/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static je field_c;
    static String[][] field_b;
    static int field_e;
    static int field_d;
    static String field_f;
    static je field_a;

    final static void a(byte param0) {
        if (qc.field_a != null) {
          qc.field_a.b(true);
          tj.field_C = new na();
          lt.field_g.a((kb) (Object) tj.field_C, (byte) -88);
          return;
        } else {
          tj.field_C = new na();
          lt.field_g.a((kb) (Object) tj.field_C, (byte) -88);
          return;
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = ae.b(param1, 100);
        var4 = g.a(-1, param1);
        var5 = ae.b(param2, 100);
        var6 = g.a(-1, param2);
        var7 = (int)((long)var3 * (long)var5 >> 16);
        if (param0 > -114) {
          field_b = null;
          var8 = (int)((long)var6 * (long)var3 >> 16);
          var9 = (int)((long)var4 * (long)var5 >> 16);
          var10 = (int)((long)var6 * (long)var4 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var8 = (int)((long)var6 * (long)var3 >> 16);
          var9 = (int)((long)var4 * (long)var5 >> 16);
          var10 = (int)((long)var6 * (long)var4 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != 236611664) {
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param2 >= -95) {
            ek.a(-61, 63, 80, -105);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 1;
        field_b = new String[][]{new String[18], new String[18], new String[18]};
        field_f = "Similar rating";
    }
}
