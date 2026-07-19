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
        Exception var1 = null;
        lo var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        String var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        this.field_e = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  if (this.field_f) {
                    break L1;
                  } else {
                    var1_int = 0;
                    L3: while (true) {
                      if (-3 >= (var1_int ^ -1)) {
                        qe.a(10L, (byte) 45);
                        vn.a(0, (Object) null, this.field_c);
                        continue L2;
                      } else {
                        L4: {
                          var2 = this.field_d[var1_int];
                          if (var2 == null) {
                            break L4;
                          } else {
                            var2.d();
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
              var5 = (String) null;
              bl.a((Throwable) ((Object) var1), (byte) 57, (String) null);
              this.field_e = false;
              return;
            }
            break L0;
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
