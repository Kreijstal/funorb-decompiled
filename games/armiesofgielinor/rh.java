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
        int var1 = -117 % ((param0 - 45) / 36);
    }

    public final void run() {
        int var1_int = 0;
        rc var2 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        Object var5 = null;
        String var6 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_a = true;
        try {
          try {
            while (!this.field_f) {
              for (var1_int = 0; var1_int < 2; var1_int++) {
                var2 = this.field_d[var1_int];
                if (var2 != null) {
                  var2.d();
                }
              }
              nu.a(10L, 0);
              var5 = (Object) null;
              ne.a(this.field_b, (Object) null, true);
            }
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var6 = (String) null;
            af.a((Throwable) ((Object) var1), 98, (String) null);
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
          } else {
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_a = false;
          throw rh.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_a = false;
    }

    rh() {
        this.field_d = new rc[2];
        this.field_f = false;
        this.field_a = false;
    }

    static {
        field_c = false;
        field_g = "Rating";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
