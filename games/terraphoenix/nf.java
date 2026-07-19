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
        String var6 = null;
        Throwable decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        this.field_i = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  if (this.field_b) {
                    break L1;
                  } else {
                    var1_int = 0;
                    L3: while (true) {
                      if (2 <= var1_int) {
                        gi.a((byte) -68, 10L);
                        var5 = (Object) null;
                        cf.a(this.field_e, false, (Object) null);
                        continue L2;
                      } else {
                        L4: {
                          var2 = this.field_d[var1_int];
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
              bd.a((Throwable) ((Object) var1), (String) null, 98);
              this.field_i = false;
              return;
            }
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_i = false;
          throw nf.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_i = false;
    }

    public static void a(byte param0) {
        if (param0 >= -118) {
            return;
        }
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
        this.field_d = new nk[2];
        this.field_b = false;
        this.field_i = false;
    }

    static {
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_h = 56;
        field_f = new int[8192];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
