/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioPumpThread implements Runnable {
    PlatformTaskDispatcher field_b;
    volatile boolean field_a;
    volatile boolean field_d;
    volatile AudioOutput[] field_c;
    private static String field_z;

    public final void run() {
        int var1_int = 0;
        AudioOutput var2 = null;
        int var4 = 0;
        Object var5 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        RuntimeException var1_ref = null;
        Throwable var3 = null;
        String var6 = null;
        var4 = ZombieDawn.field_J;
        try {
          this.field_a = true;
          try {
            try {
              while (!this.field_d) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                  var2 = this.field_c[var1_int];
                  if (var2 != null) {
                    var2.serviceOutput();
                  }
                }
                AlternateLongAndNameCredentials.sleepMillis(10L, (byte) 101);
                var5 = (Object) null;
                TextButton.pumpEventQueue(0, this.field_b, (Object) null);
              }
              decompiledRegionSelector0 = 0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              ErrorReportHelpers.reportClientError((Throwable) ((Object) var1), 10331, (String) null);
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
            this.field_a = false;
            throw AudioPumpThread.<RuntimeException>rethrowUnchecked(var3);
          }
          if (decompiledRegionSelector1 == 0) {
            this.field_a = false;
          } else {
            this.field_a = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1_ref), field_z);
        }
    }

    AudioPumpThread() {
        this.field_c = new AudioOutput[2];
        this.field_d = false;
        this.field_a = false;
    }

    static {
        field_z = "cp.run()";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
