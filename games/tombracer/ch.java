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
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        Object var5 = null;
        String var6 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        this.field_b = true;
        try {
          try {
            while (!this.field_a) {
              for (var1_int = 0; 2 > var1_int; var1_int++) {
                var2 = this.field_c[var1_int];
                if (var2 != null) {
                  var2.c();
                }
              }
              vja.a(0, 10L);
              var5 = (Object) null;
              kla.a(this.field_d, (byte) 50, (Object) null);
            }
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var6 = (String) null;
            ssa.a((String) null, (byte) 121, (Throwable) ((Object) var1));
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
          } else {
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
