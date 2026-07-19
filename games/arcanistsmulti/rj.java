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
        String var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_a = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  if (this.field_g) {
                    break L1;
                  } else {
                    var1_int = 0;
                    L3: while (true) {
                      if (2 <= var1_int) {
                        ao.a(10L, 1);
                        mb.a(-75, (Object) null, this.field_f);
                        continue L2;
                      } else {
                        L4: {
                          var2 = this.field_b[var1_int];
                          if (var2 != null) {
                            var2.g();
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var1_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var5 = (String) null;
              jh.a((Throwable) ((Object) var1), (String) null, (byte) 20);
              this.field_a = false;
              return;
            }
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_a = false;
          throw rj.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_a = false;
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
        this.field_b = new lb[2];
        this.field_g = false;
        this.field_a = false;
    }

    static {
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
