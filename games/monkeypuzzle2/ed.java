/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static lk field_c;
    static String field_a;
    int field_e;
    static ib field_b;
    static long field_d;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param2 != 0) {
          L0: {
            field_a = null;
            if (param1 <= param0) {
              break L0;
            } else {
              var3 = param0;
              param0 = param1;
              param1 = var3;
              break L0;
            }
          }
          L1: while (true) {
            if (0 == param1) {
              return param0;
            } else {
              var3 = param0 % param1;
              param0 = param1;
              param1 = var3;
              continue L1;
            }
          }
        } else {
          L2: {
            if (param1 <= param0) {
              break L2;
            } else {
              var3 = param0;
              param0 = param1;
              param1 = var3;
              break L2;
            }
          }
          L3: while (true) {
            if (0 == param1) {
              return param0;
            } else {
              var3 = param0 % param1;
              param0 = param1;
              param1 = var3;
              continue L3;
            }
          }
        }
    }

    final static void a(ad param0, int param1) {
        sf var2 = null;
        sf.a(param0.a("", "headers.packvorbis", 30));
        if (param1 < 44) {
          int discarded$6 = ed.a(-96, -76, 44);
          var2 = sf.a(param0, "jagex logo2.packvorbis", "");
          td discarded$7 = var2.a();
          return;
        } else {
          var2 = sf.a(param0, "jagex logo2.packvorbis", "");
          td discarded$8 = var2.a();
          return;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            field_a = null;
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading graphics";
        field_b = new ib();
        field_d = 20000000L;
    }
}
