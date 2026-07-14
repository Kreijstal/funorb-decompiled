/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qg {
    static int field_c;
    static String field_b;
    static int[] field_e;
    static float[] field_a;
    static mg field_d;

    final static ll[] a(byte param0, gk param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 != 3) {
          int discarded$2 = qg.a((byte) -15, -89, 51);
          var4 = param1.b(param2, param0 ^ 3);
          var5 = param1.a(-101, var4, param3);
          return hf.a(1, param1, var4, var5);
        } else {
          var4 = param1.b(param2, param0 ^ 3);
          var5 = param1.a(-101, var4, param3);
          return hf.a(1, param1, var4, var5);
        }
    }

    abstract void a(java.awt.Component param0, boolean param1);

    abstract int b(int param0);

    public static void a(int param0) {
        int var1 = 124 % ((param0 - -53) / 40);
        field_b = null;
        field_d = null;
        field_e = null;
        field_a = null;
    }

    abstract void a(java.awt.Component param0, int param1);

    final static int a(byte param0, int param1, int param2) {
        int var3 = param2 >> 7769823 & -1 + param1;
        int var4 = -80 % ((param0 - 34) / 57);
        return ((param2 >>> -675992833) + param2) % param1 - -var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = "Click";
        field_a = new float[16];
        field_e = new int[12];
    }
}
