/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh implements Runnable {
    static boolean field_c;
    volatile boolean field_f;
    volatile boolean field_a;
    hd field_b;
    static int field_e;
    volatile rc[] field_d;
    static String field_g;

    public static void a(int param0) {
        field_g = null;
        int var1 = 0;
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        rc var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        Throwable decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((rh) this).field_a = true;
        try {
          L0: while (true) {
            if (((rh) this).field_f) {
              ((rh) this).field_a = false;
              return;
            } else {
              var1_int = 0;
              L1: while (true) {
                if (var1_int >= 2) {
                  nu.a(10L, 0);
                  var5 = null;
                  ne.a(((rh) this).field_b, (Object) null, true);
                  continue L0;
                } else {
                  L2: {
                    var2 = ((rh) this).field_d[var1_int];
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
          var6 = null;
          af.a((Throwable) (Object) var1, 98, (String) null);
          ((rh) this).field_a = false;
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          ((rh) this).field_a = false;
          throw rh.<RuntimeException>$cfr$sneakyThrow(var3);
        }
    }

    rh() {
        ((rh) this).field_d = new rc[2];
        ((rh) this).field_f = false;
        ((rh) this).field_a = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_g = "Rating";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
