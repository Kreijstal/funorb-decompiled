/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static byte[][] field_e;
    static ci field_a;
    static boolean field_d;
    static im field_c;
    static boolean field_b;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final static java.applet.Applet a(boolean param0) {
        if (le.field_r != null) {
            return le.field_r;
        }
        int discarded$0 = 0;
        dg.b();
        return (java.applet.Applet) (Object) gm.field_f;
    }

    public static void b() {
        field_e = null;
        field_a = null;
        field_c = null;
    }

    final static String a(boolean param0, boolean param1) {
        int var4 = 0;
        var4 = 0;
        if (param0) {
          L0: {
            var4 += 4;
            if (param1) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          return ug.field_a[var4];
        } else {
          L1: {
            if (param1) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          return ug.field_a[var4];
        }
    }

    final static void a() {
        uc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            var1 = di.field_l;
            L1: while (true) {
              if (!b.a((byte) -102)) {
                break L0;
              } else {
                var1.k(-17410, 8);
                int fieldTemp$5 = var1.field_k + 1;
                var1.field_k = var1.field_k + 1;
                var2 = fieldTemp$5;
                ql.a(-124, var1);
                di.field_l.j(var1.field_k + -var2, -119);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1_ref, "dg.A(" + 81 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_e = new byte[50][];
        field_c = new im();
    }
}
