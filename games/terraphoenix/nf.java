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
        nk var2 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        Object var5 = null;
        String var6 = null;
        var4 = Terraphoenix.field_V;
        this.field_i = true;
        try {
          try {
            while (!this.field_b) {
              for (var1_int = 0; 2 > var1_int; var1_int++) {
                var2 = this.field_d[var1_int];
                if (var2 != null) {
                  var2.c();
                }
              }
              gi.a((byte) -68, 10L);
              var5 = (Object) null;
              cf.a(this.field_e, false, (Object) null);
            }
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var6 = (String) null;
            bd.a((Throwable) ((Object) var1), (String) null, 98);
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
          } else {
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
