/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh implements Runnable {
    static boolean field_c;
    volatile boolean field_f;
    volatile boolean field_a;
    hd field_b;
    static int field_e;
    volatile rc[] field_d;
    static String field_g;

    public static void a(int param0) {
        field_g = null;
        int var1 = -117 % ((param0 - 45) / 36);
    }

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        rc var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_a = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  L3: {
                    if (this.field_f) {
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
                              if (-3 >= (var1_int ^ -1)) {
                                break L6;
                              } else {
                                var2 = this.field_d[var1_int];
                                if (var4 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (var2 == null) {
                                      break L7;
                                    } else {
                                      var2.d();
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
                            nu.a(10L, 0);
                            var5 = (Object) null;
                            ne.a(this.field_b, (Object) null, true);
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
              af.a((Throwable) ((Object) exception), 98, (String) null);
              this.field_a = false;
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
          this.field_a = false;
          throw rh.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        L8: {
          if (decompiledRegionSelector1 == 0) {
            this.field_a = false;
            break L8;
          } else {
            break L8;
          }
        }
    }

    rh() {
        this.field_d = new rc[2];
        this.field_f = false;
        this.field_a = false;
    }

    static {
        field_c = false;
        field_g = "Rating";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
