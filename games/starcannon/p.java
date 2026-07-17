/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static int field_c;
    static mj field_a;
    static String field_b;
    static int field_g;
    static String field_e;
    static int[] field_f;
    static fi field_d;

    final static void a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            gl.b();
            sd.field_e = new int[260];
            fb.field_r = 11;
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (sd.field_e.length <= var5) {
                    break L0;
                  } else {
                    sd.field_e[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                sd.field_e[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "p.B(" + -68 + 41);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "SPACE or CTRL   Fire Guns";
        field_a = new mj("email");
        field_e = "Collect <img=0> to power up your lasers";
        field_f = new int[8192];
    }
}
