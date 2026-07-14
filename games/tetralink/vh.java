/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vh {
    static double field_b;
    static String field_c;
    static String field_a;
    static th field_e;
    static boolean field_d;

    public static void a(int param0) {
        field_c = null;
        int var1 = 75 % ((62 - param0) / 63);
        field_a = null;
        field_e = null;
    }

    final static void b(int param0) {
        if (0 - cn.field_f != en.field_K) {
          if (250 + -cn.field_f == en.field_K) {
            if (param0 >= -29) {
              vh.a(-111);
              en.field_K = en.field_K + 1;
              return;
            } else {
              en.field_K = en.field_K + 1;
              return;
            }
          } else {
            if (param0 >= -29) {
              vh.a(-111);
              en.field_K = en.field_K + 1;
              return;
            } else {
              en.field_K = en.field_K + 1;
              return;
            }
          }
        } else {
          if (param0 >= -29) {
            vh.a(-111);
            en.field_K = en.field_K + 1;
            return;
          } else {
            en.field_K = en.field_K + 1;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = Math.sqrt(2.0) / 2.0;
        field_c = "You are offering a rematch.";
        field_a = "White";
        field_d = false;
    }
}
