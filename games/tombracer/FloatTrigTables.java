/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FloatTrigTables {
    static float[] sine;
    static float[] cosine;
    static String field_a;
    static String field_d;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        cosine = null;
        field_a = null;
        field_d = null;
        if (param0 != 119) {
          return;
        }
        sine = null;
    }

    static {
        int var2 = 0;
        field_z = "hu.A(";
        sine = new float[16384];
        cosine = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
          sine[var2] = (float)Math.sin((double)var2 * var0);
          cosine[var2] = (float)Math.cos((double)var2 * var0);
        }
        field_a = "<%0> ran out of time";
        field_d = "Waiting For Sync";
    }
}
