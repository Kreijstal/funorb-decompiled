/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    static String field_c;
    static int[] field_a;
    static int field_g;
    static int field_b;
    static kc field_d;
    static String field_f;
    static String field_e;

    public static void b() {
        field_d = null;
        field_a = null;
        field_e = null;
        field_f = null;
        field_c = null;
    }

    final static void a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            id.a();
            tj.field_C = 11;
            vf.field_n = new int[260];
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (vf.field_n.length <= var5) {
                    break L0;
                  } else {
                    vf.field_n[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                vf.field_n[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "tm.C(" + 5968 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        param0 = (1431655765 & param0 >>> 1) + (param0 & 1431655765);
        param0 = (858993459 & param0) - -((param0 & -858993460) >>> 2);
        param0 = 252645135 & param0 - -(param0 >>> 4);
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        if (param1 > -13) {
            boolean discarded$0 = tm.a(true);
        }
        return 255 & param0;
    }

    final static boolean a(boolean param0) {
        return null != ch.field_c && ob.field_eb.a((byte) 74);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[79];
        field_f = "Quit";
        field_c = "More memory is required to run in different resolutions. Try updating your version of Java or changing your Java settings.";
        field_e = "MOST POWERFUL - ";
    }
}
