/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch implements Runnable {
    volatile boolean field_b;
    volatile kta[] field_c;
    fia field_d;
    static String field_e;
    volatile boolean field_a;

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        kta var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        this.field_b = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  L3: {
                    if (this.field_a) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        var1_int = 0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (2 <= var1_int) {
                                break L6;
                              } else {
                                var2 = this.field_c[var1_int];
                                if (var4 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (var2 == null) {
                                      break L7;
                                    } else {
                                      var2.c();
                                      break L7;
                                    }
                                  }
                                  var1_int++;
                                  if (var4 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            vja.a(0, 10L);
                            var5 = (Object) null;
                            kla.a(this.field_d, (byte) 50, (Object) null);
                            break L5;
                          }
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              exception = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              ssa.a((String) null, (byte) 121, (Throwable) ((Object) exception));
              this.field_b = false;
              return;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_b = false;
          throw ch.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        L8: {
          if (decompiledRegionSelector1 == 0) {
            this.field_b = false;
            break L8;
          } else {
            break L8;
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = 56 / ((31 - param0) / 61);
    }

    ch() {
        this.field_c = new kta[2];
        this.field_a = false;
        this.field_b = false;
    }

    static {
        field_e = "Suggested names: ";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
