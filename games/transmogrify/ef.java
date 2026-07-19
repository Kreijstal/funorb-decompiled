/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef implements Runnable {
    volatile boolean field_a;
    volatile qh[] field_f;
    static tf field_e;
    fe field_b;
    volatile boolean field_d;
    static String field_c;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 >= -99) {
            ef.a(-74);
        }
    }

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        qh var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        this.field_d = true;
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
                              if ((var1_int ^ -1) <= -3) {
                                break L6;
                              } else {
                                var2 = this.field_f[var1_int];
                                if (var4 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (var2 != null) {
                                      var2.a();
                                      break L7;
                                    } else {
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
                            pg.a(10L, -108);
                            var5 = (Object) null;
                            db.a(this.field_b, (Object) null, -125);
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
              d.a((Throwable) ((Object) exception), -14, (String) null);
              this.field_d = false;
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
          this.field_d = false;
          throw ef.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        L8: {
          if (decompiledRegionSelector1 == 0) {
            this.field_d = false;
            break L8;
          } else {
            break L8;
          }
        }
    }

    ef() {
        this.field_f = new qh[2];
        this.field_a = false;
        this.field_d = false;
    }

    static {
        field_e = new tf(6, 0, 4, 2);
        field_c = "If you do nothing the game will revert to normal view in <%0> second.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
