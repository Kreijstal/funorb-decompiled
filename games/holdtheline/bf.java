/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf implements Runnable {
    ib field_c;
    static String field_a;
    volatile lo[] field_d;
    volatile boolean field_e;
    static long[] field_b;
    volatile boolean field_f;

    public static void a() {
        field_b = null;
        field_a = null;
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        lo var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        ((bf) this).field_e = true;
        try {
          L0: while (true) {
            if (((bf) this).field_f) {
              ((bf) this).field_e = false;
              return;
            } else {
              var1_int = 0;
              L1: while (true) {
                if (var1_int >= 2) {
                  int discarded$1 = 45;
                  qe.a(10L);
                  vn.a(0, (Object) null, ((bf) this).field_c);
                  continue L0;
                } else {
                  L2: {
                    var2 = ((bf) this).field_d[var1_int];
                    if (var2 == null) {
                      var1_int++;
                      var1_int++;
                      break L2;
                    } else {
                      var2.d();
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
          var5 = null;
          bl.a((Throwable) (Object) var1, (byte) 57, (String) null);
          ((bf) this).field_e = false;
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          ((bf) this).field_e = false;
          throw bf.<RuntimeException>$cfr$sneakyThrow(var3);
        }
    }

    bf() {
        ((bf) this).field_d = new lo[2];
        ((bf) this).field_f = false;
        ((bf) this).field_e = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Shields";
        field_b = new long[32];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
