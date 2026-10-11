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
        lb var2 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        String var5 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_a = true;
        try {
          try {
            while (!this.field_g) {
              for (var1_int = 0; 2 > var1_int; var1_int++) {
                var2 = this.field_b[var1_int];
                if (var2 != null) {
                  var2.g();
                }
              }
              ao.a(10L, 1);
              mb.a(-75, (Object) null, this.field_f);
            }
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var5 = (String) null;
            jh.a((Throwable) ((Object) var1), (String) null, (byte) 20);
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
          } else {
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
