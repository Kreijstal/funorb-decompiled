/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wj {
    static String[][] field_c;
    static int field_d;
    static String field_a;
    static sf[] field_b;

    final int b(int param0, long param1) {
        long var4 = 0L;
        if (param0 == 0) {
          var4 = ((wj) this).b(-31887);
          if ((var4 ^ -1L) < -1L) {
            vh.a(var4, param0 + 87);
            return ((wj) this).a(-23124, param1);
          } else {
            return ((wj) this).a(-23124, param1);
          }
        } else {
          field_b = null;
          var4 = ((wj) this).b(-31887);
          if ((var4 ^ -1L) >= -1L) {
            return ((wj) this).a(-23124, param1);
          } else {
            vh.a(var4, param0 + 87);
            return ((wj) this).a(-23124, param1);
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 >= -13) {
            wj.a(52);
        }
    }

    abstract void c(int param0);

    abstract long b(int param0);

    abstract int a(int param0, long param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[][]{new String[41], new String[30]};
        field_a = "<%0>Spider:<%1> These eat fleas! Keep away from them!";
        field_b = new sf[2];
    }
}
