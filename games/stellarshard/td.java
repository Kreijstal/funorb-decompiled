/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static int field_d;
    static int field_b;
    static String field_e;
    static String[] field_c;
    static String field_a;

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = stellarshard.field_B;
        try {
          na.field_d.a(true, (byte) -123, ll.field_d, gi.field_c);
          na.field_d.f((byte) -127);
          while (qh.c(123)) {
            na.field_d.a(gi.field_f, uc.field_b, true);
          }
          if (-1 != ee.field_a) {
            var1_int = ee.field_a;
            rh.a(-1, (byte) -72);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (param0 >= -82) {
            field_d = -92;
          }
          if (ck.field_db) {
            stackIn_12_0 = 3;
            return stackIn_12_0;
          }
          if (dj.field_a == el.field_E) {
            stackIn_15_0 = 1;
            return stackIn_15_0;
          }
          if (!al.field_f.a(true)) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (dj.field_a != o.field_l) {
            stackIn_23_0 = -1;
            return stackIn_23_0;
          }
          stackIn_21_0 = 2;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "td.B(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_c = null;
        field_e = null;
        if (param0 != -17) {
          field_c = (String[]) null;
        }
    }

    static {
        field_b = 10;
        field_a = "Close";
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_e = "Laser";
    }
}
