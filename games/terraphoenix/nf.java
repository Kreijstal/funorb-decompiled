/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf implements Runnable {
    static String field_a;
    static int field_h;
    static boolean field_c;
    he field_e;
    volatile boolean field_b;
    static int[] field_f;
    volatile nk[] field_d;
    static ci[] field_g;
    volatile boolean field_i;

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        nk var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        Throwable decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        ((nf) this).field_i = true;
        try {
          L0: while (true) {
            if (((nf) this).field_b) {
              ((nf) this).field_i = false;
              return;
            } else {
              var1_int = 0;
              L1: while (true) {
                if (2 <= var1_int) {
                  gi.a((byte) -68, 10L);
                  var5 = null;
                  cf.a(((nf) this).field_e, false, (Object) null);
                  continue L0;
                } else {
                  L2: {
                    var2 = ((nf) this).field_d[var1_int];
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
          bd.a((Throwable) (Object) var1, (String) null, 98);
          ((nf) this).field_i = false;
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          ((nf) this).field_i = false;
          throw nf.<RuntimeException>$cfr$sneakyThrow(var3);
        }
    }

    public static void a() {
        field_g = null;
        field_f = null;
        field_a = null;
    }

    final static void a(boolean param0, int param1) {
        if (param1 != -1260) {
            nf.a(true, 64);
            ad.a(param0, 0, true);
            return;
        }
        ad.a(param0, 0, true);
    }

    nf() {
        ((nf) this).field_d = new nk[2];
        ((nf) this).field_b = false;
        ((nf) this).field_i = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_h = 56;
        field_f = new int[8192];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
