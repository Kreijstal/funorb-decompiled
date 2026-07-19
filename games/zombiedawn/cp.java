/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp implements Runnable {
    ec field_b;
    volatile boolean field_a;
    volatile boolean field_d;
    volatile qf[] field_c;
    private static String field_z;

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        RuntimeException var1_ref = null;
        qf var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            this.field_a = true;
            try {
              L1: {
                try {
                  L2: {
                    L3: while (true) {
                      if (this.field_d) {
                        decompiledRegionSelector0 = 0;
                        break L2;
                      } else {
                        var1_int = 0;
                        L4: while (true) {
                          if (var1_int >= 2) {
                            ld.a(10L, (byte) 101);
                            var5 = (Object) null;
                            an.a(0, this.field_b, (Object) null);
                            continue L3;
                          } else {
                            L5: {
                              var2 = this.field_c[var1_int];
                              if (var2 == null) {
                                break L5;
                              } else {
                                var2.g();
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
                    var6 = (String) null;
                    ae.a((Throwable) ((Object) var1), 10331, (String) null);
                    this.field_a = false;
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
              this.field_a = false;
              throw cp.<RuntimeException>$cfr$sneakyThrow(var3);
            }
            L7: {
              if (decompiledRegionSelector1 == 0) {
                this.field_a = false;
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
          throw sh.a((Throwable) ((Object) var1_ref), field_z);
        }
    }

    cp() {
        this.field_c = new qf[2];
        this.field_d = false;
        this.field_a = false;
    }

    static {
        field_z = "cp.run()";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
