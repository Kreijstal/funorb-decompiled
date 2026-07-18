/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class um {
    static int field_c;
    static int field_d;
    static String field_a;
    private static int field_b;
    static boolean field_e;

    final static void a(int param0, int param1) {
        ma var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        kg var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          L0: {
            var4 = (kg) (Object) we.field_c.c((byte) 65);
            L1: while (true) {
              if (var4 == null) {
                var2 = ke.field_f.c((byte) -34);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    hi.a(1, 6);
                    var2 = ke.field_f.f((byte) -5);
                    continue L2;
                  }
                }
              } else {
                fr.a(98, var4, 6);
                var4 = (kg) (Object) we.field_c.f((byte) -5);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2_ref, "um.T(" + 10 + ',' + 6 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 107) {
            um.a(-2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 10;
        field_c = 1 << field_b;
        field_a = "Drawn";
    }
}
