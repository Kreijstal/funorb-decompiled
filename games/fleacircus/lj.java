/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    static int field_b;
    static int[] field_j;
    static String field_g;
    static String field_i;
    static fa field_a;
    static boolean field_e;
    static int field_h;
    static int[] field_d;
    static bi field_f;
    static int[] field_c;

    final synchronized static long a(byte param0) {
        long var1 = 0L;
        if (param0 < -17) {
          var1 = System.currentTimeMillis();
          if (var1 < tg.field_k) {
            ml.field_P = ml.field_P + (tg.field_k + -var1);
            tg.field_k = var1;
            return var1 + ml.field_P;
          } else {
            tg.field_k = var1;
            return var1 + ml.field_P;
          }
        } else {
          var1 = System.currentTimeMillis();
          if (var1 >= tg.field_k) {
            tg.field_k = var1;
            return var1 + ml.field_P;
          } else {
            ml.field_P = ml.field_P + (tg.field_k + -var1);
            tg.field_k = var1;
            return var1 + ml.field_P;
          }
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 0) {
            return;
        }
        field_j = null;
        field_f = null;
        field_d = null;
        field_c = null;
        field_a = null;
        field_g = null;
    }

    static {
        field_j = new int[8192];
        field_h = 0;
        field_i = "achievements to collect";
        field_d = new int[8192];
        field_b = 0;
    }
}
