/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt {
    static String[][] field_d;
    static String field_b;
    static vd[] field_c;
    static boolean field_a;

    public static void a() {
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        wf var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ds var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var4 = (ds) (Object) cl.field_eb.d(268435455);
            L1: while (true) {
              if (var4 == null) {
                var2 = ep.field_z.d(268435455);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    hn.a(0, 6);
                    var2 = ep.field_z.b((byte) 103);
                    continue L2;
                  }
                }
              } else {
                int discarded$4 = 62;
                int discarded$5 = 6;
                nn.a(var4);
                var4 = (ds) (Object) cl.field_eb.b((byte) 103);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2_ref, "tt.C(" + 6 + 44 + 2048 + 41);
        }
    }

    final static void b() {
        if (null != jf.field_a) {
          pg.a((java.awt.Canvas) (Object) jf.field_a, 87);
          jf.field_a.a((byte) 87, pt.field_b);
          jf.field_a = null;
          if (null != aj.field_s) {
            aj.field_s.c(1);
            ci.field_f.requestFocus();
            return;
          } else {
            ci.field_f.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, boolean param1, int param2) {
        return 0 != (param0 & 2048);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[][]{new String[5], new String[5], new String[2], new String[4], new String[4]};
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_a = false;
    }
}
