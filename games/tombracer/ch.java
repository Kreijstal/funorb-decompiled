/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch implements Runnable {
    volatile boolean field_b;
    volatile kta[] field_c;
    fia field_d;
    static String field_e;
    volatile boolean field_a;

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        kta var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        Throwable decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        ((ch) this).field_b = true;
        try {
          L0: while (true) {
            if (((ch) this).field_a) {
              ((ch) this).field_b = false;
              return;
            } else {
              var1_int = 0;
              L1: while (true) {
                if (2 <= var1_int) {
                  vja.a(0, 10L);
                  var5 = null;
                  kla.a(((ch) this).field_d, (byte) 50, (Object) null);
                  continue L0;
                } else {
                  L2: {
                    var2 = ((ch) this).field_c[var1_int];
                    if (var2 == null) {
                      var1_int++;
                      var1_int++;
                      break L2;
                    } else {
                      var2.c();
                      var1_int++;
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
          var6 = null;
          ssa.a((String) null, (byte) 121, (Throwable) (Object) var1);
          ((ch) this).field_b = false;
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          ((ch) this).field_b = false;
          throw ch.<RuntimeException>$cfr$sneakyThrow(var3);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = 56;
    }

    ch() {
        ((ch) this).field_c = new kta[2];
        ((ch) this).field_a = false;
        ((ch) this).field_b = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Suggested names: ";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
