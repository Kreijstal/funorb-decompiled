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
        Exception var1 = null;
        RuntimeException var1_ref = null;
        e var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        String var5 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          L0: {
            this.field_b = true;
            try {
              L1: {
                try {
                  L2: {
                    L3: while (true) {
                      if (this.field_c) {
                        decompiledRegionSelector0 = 0;
                        break L2;
                      } else {
                        var1_int = 0;
                        L4: while (true) {
                          if ((var1_int ^ -1) <= -3) {
                            wh.a(10L, 19406);
                            pg.a((byte) -86, (Object) null, this.field_d);
                            continue L3;
                          } else {
                            L5: {
                              var2 = this.field_a[var1_int];
                              if (var2 != null) {
                                var2.e();
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var1_int++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    var5 = (String) null;
                    ti.a((Throwable) ((Object) var1), (byte) 100, (String) null);
                    this.field_b = false;
                    decompiledRegionSelector0 = 1;
                    break L6;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L1;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L1;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = decompiledCaughtException;
              this.field_b = false;
              throw dd.<RuntimeException>$cfr$sneakyThrow(var3);
            }
            L7: {
              if (decompiledRegionSelector1 == 0) {
                this.field_b = false;
                break L7;
              } else {
                break L7;
              }
            }
            break L0;
          }
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
