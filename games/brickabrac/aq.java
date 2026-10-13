/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq implements Runnable {
    volatile boolean field_b;
    volatile boolean field_a;
    PlatformServices field_c;
    volatile PcmPlayer[] field_d;
    static int field_e;
    private static String field_z;

    public final void run() {
        int var1_int = 0;
        PcmPlayer var2 = null;
        int var4 = 0;
        Object var5 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        RuntimeException var1_ref = null;
        Throwable var3 = null;
        String var6 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          this.field_b = true;
          try {
            try {
              while (!this.field_a) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                  var2 = this.field_d[var1_int];
                  if (var2 != null) {
                    var2.c();
                  }
                }
                wj.sleepMillis(-128, 10L);
                var5 = (Object) null;
                IntNode.a(-4317, this.field_c, (Object) null);
              }
              decompiledRegionSelector0 = 0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              AlignedIconLabel.a((String) null, (Throwable) ((Object) var1), 96);
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
            throw aq.<RuntimeException>$cfr$sneakyThrow(var3);
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1_ref), field_z);
        }
    }

    aq() {
        this.field_d = new PcmPlayer[2];
        this.field_a = false;
        this.field_b = false;
    }

    static {
        field_z = "aq.run()";
        field_e = 98;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
