/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static int[] field_d;
    static String[] field_a;
    static long field_c;
    static String field_b;

    final static void a(tg param0, int param1, byte param2) {
        int var4 = 0;
        th var5 = null;
        var5 = ed.field_q;
        var5.h(param1, 0);
        if (param2 == 24) {
          var5.field_h = var5.field_h + 1;
          var4 = var5.field_h;
          var5.c(1, -1);
          if (null == param0.field_h) {
            var5.c(0, -1);
            int discarded$8 = var5.a(var4, (byte) 85);
            var5.field_h = var5.field_h - 4;
            param0.field_k = var5.d((byte) 19);
            var5.d(-var4 + var5.field_h, (byte) -125);
            return;
          } else {
            var5.c(param0.field_h.length, -1);
            var5.a(0, param0.field_h, 255, param0.field_h.length);
            int discarded$9 = var5.a(var4, (byte) 85);
            var5.field_h = var5.field_h - 4;
            param0.field_k = var5.d((byte) 19);
            var5.d(-var4 + var5.field_h, (byte) -125);
            return;
          }
        } else {
          field_a = null;
          var5.field_h = var5.field_h + 1;
          var4 = var5.field_h;
          var5.c(1, -1);
          if (null == param0.field_h) {
            var5.c(0, -1);
            int discarded$10 = var5.a(var4, (byte) 85);
            var5.field_h = var5.field_h - 4;
            param0.field_k = var5.d((byte) 19);
            var5.d(-var4 + var5.field_h, (byte) -125);
            return;
          } else {
            var5.c(param0.field_h.length, -1);
            var5.a(0, param0.field_h, 255, param0.field_h.length);
            int discarded$11 = var5.a(var4, (byte) 85);
            var5.field_h = var5.field_h - 4;
            param0.field_k = var5.d((byte) 19);
            var5.d(-var4 + var5.field_h, (byte) -125);
            return;
          }
        }
    }

    public static void a(int param0) {
        if (param0 >= -124) {
          field_b = null;
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
        field_b = "Password: ";
    }
}
