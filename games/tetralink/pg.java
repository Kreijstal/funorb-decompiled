/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg implements Runnable {
    volatile boolean field_g;
    static boolean field_m;
    static int field_a;
    static int[] field_f;
    volatile boolean field_k;
    static al field_d;
    static String field_b;
    static String field_e;
    ie field_j;
    static String field_c;
    static int[] field_i;
    volatile nk[] field_l;
    static int field_h;

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        nk var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        Throwable decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        this.field_k = true;
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
                      if (-3 >= (var1_int ^ -1)) {
                        tb.a(false, 10L);
                        var5 = (Object) null;
                        li.a(this.field_j, (Object) null, (byte) -98);
                        continue L2;
                      } else {
                        L4: {
                          var2 = this.field_l[var1_int];
                          if (var2 != null) {
                            var2.f();
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
              var6 = (String) null;
              fk.a(-127, (Throwable) ((Object) var1), (String) null);
              this.field_k = false;
              return;
            }
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_k = false;
          throw pg.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_k = false;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_e = null;
        field_d = null;
        field_f = null;
        if (param0) {
          pg.a(true);
          field_i = null;
          field_b = null;
          return;
        } else {
          field_i = null;
          field_b = null;
          return;
        }
    }

    pg() {
        this.field_l = new nk[2];
        this.field_g = false;
        this.field_k = false;
    }

    static {
        field_f = new int[5];
        field_b = "Main Menu";
        field_i = new int[4];
        field_c = "Suggested names: ";
        field_e = "Solicitation";
        field_h = 4;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
