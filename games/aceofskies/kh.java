/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static boolean field_a;
    private static String field_z;

    final synchronized static long a(int param0) {
        long var1 = 0L;
        L0: {
          var1 = System.currentTimeMillis();
          if (sn.field_c > var1) {
            te.field_i = te.field_i + (sn.field_c + -var1);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > -55) {
          field_a = false;
          sn.field_c = var1;
          return var1 - -te.field_i;
        } else {
          sn.field_c = var1;
          return var1 - -te.field_i;
        }
    }

    static {
        field_z = "kh.A(";
        field_a = false;
    }
}
