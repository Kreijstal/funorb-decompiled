/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg extends RuntimeException {
    Throwable field_a;
    static ra field_b;
    static ob field_d;
    String field_c;

    public static void a(int param0) {
        try {
            field_d = null;
            field_b = null;
            int var1_int = -64 / ((param0 - 11) / 45);
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    final static String a(boolean param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_21_0 = null;
        Object stackOut_2_0 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param0) {
              L1: {
                L2: {
                  var1_ref = "(" + ah.field_e + " " + pl.field_c + " " + md.field_b + ") " + ci.field_q;
                  if (ba.field_a <= 0) {
                    break L2;
                  } else {
                    var1_ref = var1_ref + ":";
                    var2 = 0;
                    L3: while (true) {
                      if (ba.field_a <= var2) {
                        break L2;
                      } else {
                        stackOut_7_0 = var1_ref + ' ';
                        stackIn_22_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          L4: {
                            L5: {
                              var1_ref = stackIn_8_0;
                              var3 = sh.field_qb.field_g[var2] & 255;
                              var4 = var3 >> 216247428;
                              var3 = var3 & 15;
                              if (var4 < 10) {
                                break L5;
                              } else {
                                var4 += 55;
                                if (var5 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var4 += 48;
                            break L4;
                          }
                          L6: {
                            L7: {
                              if (10 <= var3) {
                                break L7;
                              } else {
                                var3 += 48;
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var3 += 55;
                            break L6;
                          }
                          var1_ref = var1_ref + (char)var4;
                          var1_ref = var1_ref + (char)var3;
                          var2++;
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_21_0 = (String) var1_ref;
                stackIn_22_0 = stackOut_21_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "rg.B(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    rg(Throwable param0, String param1) {
        try {
            ((rg) this).field_a = param0;
            ((rg) this).field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ra();
        field_d = new ob();
    }
}
