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
        kta var2 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        Object var5 = null;
        String var6 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        this.field_b = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  if (this.field_a) {
                    break L1;
                  } else {
                    var1_int = 0;
                    L3: while (true) {
                      if (2 <= var1_int) {
                        vja.a(0, 10L);
                        var5 = (Object) null;
                        kla.a(this.field_d, (byte) 50, (Object) null);
                        continue L2;
                      } else {
                        L4: {
                          var2 = this.field_c[var1_int];
                          if (var2 == null) {
                            break L4;
                          } else {
                            var2.c();
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
              var6 = (String) null;
              ssa.a((String) null, (byte) 121, (Throwable) ((Object) var1));
              this.field_b = false;
              return;
            }
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_b = false;
          throw ch.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_b = false;
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = 56 / ((31 - param0) / 61);
    }

    ch() {
        this.field_c = new kta[2];
        this.field_a = false;
        this.field_b = false;
    }

    static {
        field_e = "Suggested names: ";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
