/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf implements Runnable {
    ib field_c;
    static String field_a;
    volatile lo[] field_d;
    volatile boolean field_e;
    static long[] field_b;
    volatile boolean field_f;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -48) {
          return;
        }
        field_a = null;
    }

    public final void run() {
        int var1_int = 0;
        lo var2 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        String var5 = null;
        var4 = HoldTheLine.field_D;
        this.field_e = true;
        try {
          try {
            while (!this.field_f) {
              for (var1_int = 0; var1_int < 2; var1_int++) {
                var2 = this.field_d[var1_int];
                if (var2 != null) {
                  var2.d();
                }
              }
              qe.a(10L, (byte) 45);
              vn.a(0, (Object) null, this.field_c);
            }
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var5 = (String) null;
            bl.a((Throwable) ((Object) var1), (byte) 57, (String) null);
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
          } else {
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_e = false;
          throw bf.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_e = false;
    }

    bf() {
        this.field_d = new lo[2];
        this.field_f = false;
        this.field_e = false;
    }

    static {
        field_a = "Shields";
        field_b = new long[32];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
