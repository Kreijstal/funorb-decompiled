/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd implements Runnable {
    volatile boolean field_b;
    volatile boolean field_c;
    si field_d;
    volatile e[] field_a;
    private static String field_z;

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        RuntimeException var1_ref = null;
        e var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          ((dd) this).field_b = true;
          try {
            L0: while (true) {
              if (((dd) this).field_c) {
                ((dd) this).field_b = false;
              } else {
                var1_int = 0;
                L1: while (true) {
                  if ((var1_int ^ -1) <= -3) {
                    wh.a(10L, 19406);
                    pg.a((byte) -86, (Object) null, ((dd) this).field_d);
                    continue L0;
                  } else {
                    L2: {
                      var2 = ((dd) this).field_a[var1_int];
                      if (var2 != null) {
                        var2.e();
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var1_int++;
                    continue L1;
                  }
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var5 = null;
            ti.a((Throwable) (Object) var1, (byte) 100, (String) null);
            ((dd) this).field_b = false;
          } catch (java.lang.Throwable decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            ((dd) this).field_b = false;
            throw (RuntimeException) (Object) var3;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1_ref, field_z);
        }
    }

    dd() {
        ((dd) this).field_a = new e[2];
        ((dd) this).field_c = false;
        ((dd) this).field_b = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "dd.run()";
    }
}
