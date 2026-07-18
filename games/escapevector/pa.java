/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static hh field_b;
    static hh field_a;

    final static void a(boolean param0) {
        if (!(nf.field_u)) {
            throw new IllegalStateException();
        }
        c.field_u = true;
        ic.a((byte) -126, true);
        ff.field_e = 0;
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            bi.b();
            ij.field_i = 11;
            pb.field_c = new int[260];
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (var5 >= pb.field_c.length) {
                    break L0;
                  } else {
                    pb.field_c[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                pb.field_c[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "pa.A(" + -83 + ')');
        }
    }

    static {
    }
}
