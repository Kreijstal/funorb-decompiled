/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    mi field_e;
    String field_b;
    String field_a;
    static int[] field_d;
    String field_c;
    int field_f;

    public static void a(byte param0) {
        field_d = null;
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            sb.a(0, cg.field_f, hj.field_j, mc.field_c, (byte) 92, param0, true);
            var2_int = 0;
            L1: while (true) {
              if (mc.field_c <= var2_int) {
                sb.a(param0, mi.field_f, ka.field_P, mc.field_c + param0, (byte) 92, param0 + param0, false);
                if (mc.field_c <= param0) {
                  break L0;
                } else {
                  mc.field_c = param0;
                  return;
                }
              } else {
                sj.field_rb[param0 + var2_int] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "wa.C(" + param0 + ',' + 117 + ')');
        }
    }

    final static void a(int param0) {
        vf.a((byte) -126, 17);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
    }
}
