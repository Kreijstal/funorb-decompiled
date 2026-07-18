/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bh {
    static int field_j;
    int field_a;
    static int field_e;
    int field_d;
    static int field_f;
    static String field_b;
    int field_l;
    int field_k;
    int field_c;
    static int field_g;
    int field_i;
    static String field_h;

    abstract void a(int param0, int param1, int param2);

    public static void a(int param0) {
        try {
            field_h = null;
            field_b = null;
            if (param0 != -8765) {
                bh.a(68);
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "bh.L(" + param0 + ')');
        }
    }

    abstract void a(int param0, int param1);

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        String stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_21_0 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                break L1;
              } else {
                field_j = -79;
                break L1;
              }
            }
            L2: {
              L3: {
                var1_ref = "(" + bk.field_f + " " + il.field_e + " " + hk.field_l + ") " + wk.field_a;
                if (rc.field_f <= 0) {
                  break L3;
                } else {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L4: while (true) {
                    if (~rc.field_f >= ~var2) {
                      break L3;
                    } else {
                      stackOut_7_0 = var1_ref + ' ';
                      stackIn_22_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L5: {
                          L6: {
                            var1_ref = stackIn_8_0;
                            var3 = 255 & MonkeyPuzzle2.field_D.field_g[var2];
                            var4 = var3 >> -1395198204;
                            var3 = var3 & 15;
                            if (var4 >= 10) {
                              break L6;
                            } else {
                              var4 += 48;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4 += 55;
                          break L5;
                        }
                        L7: {
                          L8: {
                            var1_ref = var1_ref + (char)var4;
                            if (var3 < 10) {
                              break L8;
                            } else {
                              var3 += 55;
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 += 48;
                          break L7;
                        }
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_21_0 = (String) var1_ref;
              stackIn_22_0 = stackOut_21_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "bh.K(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_h = "Account created successfully!";
    }
}
