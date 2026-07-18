/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static il field_a;
    static int[] field_d;
    static String field_b;
    static eh field_c;
    static String field_e;

    final static void a() {
        Object var2 = null;
        nd.a((byte) 119, "", (String) null);
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
        field_e = null;
    }

    final static void a(int param0, int param1) {
        l var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        sa var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (sa) (Object) fj.field_b.a((byte) -46);
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1 == -11513) {
                    break L2;
                  } else {
                    pj.a(false);
                    break L2;
                  }
                }
                var2 = tf.field_a.a((byte) -31);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    fn.a(4, true);
                    var2 = tf.field_a.a(16213);
                    continue L3;
                  }
                }
              } else {
                int discarded$2 = 4;
                te.a(param1 ^ -11514, var4);
                var4 = (sa) (Object) fj.field_b.a(param1 ^ -5038);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2_ref, "pj.C(" + 4 + ',' + param1 + ')');
        }
    }

    final static void a(mg param0, int param1) {
        try {
            qc.a(param1 + -142);
            if (param1 != 256) {
                field_d = null;
            }
            param0.b();
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "pj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[256];
        field_b = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_e = "Options";
    }
}
