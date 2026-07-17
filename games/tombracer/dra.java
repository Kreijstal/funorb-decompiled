/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dra {
    static String[] field_b;
    static String[] field_a;

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final static void a(boolean param0) {
        kh var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            var1 = ql.field_k;
            L2: while (true) {
              if (!sea.l(10371)) {
                break L0;
              } else {
                var1.k(8, -2988);
                int fieldTemp$5 = var1.field_h + 1;
                var1.field_h = var1.field_h + 1;
                var2 = fieldTemp$5;
                hk.a(true, var1);
                ql.field_k.d(var1.field_h - var2, (byte) -17);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1_ref, "dra.B(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Rhythm", "Basic1", "Basic2", "Flavour1", "Flavour2", "Flavour3", "Flavour4", "Flavour5", "Flavour6", "Music1", "Music2", "Music3", "Music4", "Boulder", "Danger", "Snakes"};
        field_a = new String[100];
    }
}
