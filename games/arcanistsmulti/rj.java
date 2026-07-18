/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj implements Runnable {
    volatile lb[] field_b;
    static String field_h;
    volatile boolean field_a;
    static String field_d;
    static String field_e;
    dl field_f;
    static String field_c;
    static String field_i;
    volatile boolean field_g;

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        lb var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        ((rj) this).field_a = true;
        try {
          L0: while (true) {
            if (((rj) this).field_g) {
              ((rj) this).field_a = false;
              return;
            } else {
              var1_int = 0;
              L1: while (true) {
                if (2 <= var1_int) {
                  ao.a(10L, 1);
                  mb.a(-75, (Object) null, ((rj) this).field_f);
                  continue L0;
                } else {
                  L2: {
                    var2 = ((rj) this).field_b[var1_int];
                    if (var2 != null) {
                      var2.g();
                      var1_int++;
                      break L2;
                    } else {
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
          jh.a((Throwable) (Object) var1, (String) null, (byte) 20);
          ((rj) this).field_a = false;
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          ((rj) this).field_a = false;
          throw rj.<RuntimeException>$cfr$sneakyThrow(var3);
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_h = null;
        field_e = null;
        field_c = null;
        field_d = null;
        if (param0 >= -80) {
            rj.a((byte) 26);
        }
    }

    rj() {
        ((rj) this).field_b = new lb[2];
        ((rj) this).field_g = false;
        ((rj) this).field_a = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "<%0> has joined your game.";
        field_d = "Rebounding for Beginners";
        field_e = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_c = "Please send me news and updates (I can unsubscribe at any time)";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
