/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd implements Runnable {
    volatile boolean field_b;
    volatile boolean field_c;
    si field_d;
    volatile e[] field_a;
    private static String field_z;

    public final void run() {
        int var1_int = 0;
        e var2 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        RuntimeException var1_ref = null;
        Throwable var3 = null;
        String var5 = null;
        var4 = Bounce.field_N;
        try {
          this.field_b = true;
          try {
            try {
              while (!this.field_c) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                  var2 = this.field_a[var1_int];
                  if (var2 != null) {
                    var2.e();
                  }
                }
                wh.a(10L, 19406);
                pg.a((byte) -86, (Object) null, this.field_d);
              }
              decompiledRegionSelector0 = 0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var5 = (String) null;
              ti.a((Throwable) ((Object) var1), (byte) 100, (String) null);
              decompiledRegionSelector0 = 1;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
            } else {
              decompiledRegionSelector1 = 1;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_b = false;
            throw dd.<RuntimeException>$cfr$sneakyThrow(var3);
          }
          if (decompiledRegionSelector1 == 0) {
            this.field_b = false;
          } else {
            this.field_b = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1_ref), field_z);
        }
    }

    dd() {
        this.field_a = new e[2];
        this.field_c = false;
        this.field_b = false;
    }

    static {
        field_z = "dd.run()";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
