/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq implements Runnable {
    volatile boolean field_b;
    volatile boolean field_a;
    tg field_c;
    volatile tj[] field_d;
    static int field_e;
    private static String field_z;

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        RuntimeException var1_ref = null;
        tj var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            this.field_b = true;
            try {
              L1: {
                try {
                  L2: {
                    L3: while (true) {
                      if (this.field_a) {
                        decompiledRegionSelector0 = 0;
                        break L2;
                      } else {
                        var1_int = 0;
                        L4: while (true) {
                          if (var1_int >= 2) {
                            wj.a(-128, 10L);
                            var5 = (Object) null;
                            kq.a(-4317, this.field_c, (Object) null);
                            continue L3;
                          } else {
                            L5: {
                              var2 = this.field_d[var1_int];
                              if (var2 != null) {
                                var2.c();
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
                    var6 = (String) null;
                    rk.a((String) null, (Throwable) ((Object) var1), 96);
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
              throw aq.<RuntimeException>$cfr$sneakyThrow(var3);
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
          throw qb.a((Throwable) ((Object) var1_ref), field_z);
        }
    }

    aq() {
        this.field_d = new tj[2];
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
