/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static bd field_d;
    static ll field_f;
    static int field_j;
    static String[] field_c;
    static na field_e;
    static bd field_g;
    static fd field_b;
    static int field_i;
    static long field_h;
    static bd field_a;

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        Object stackIn_25_0 = null;
        String stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        byte stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        String stackOut_26_0 = null;
        Object stackOut_24_0 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = "(" + bj.field_f + " " + ae.field_u + " " + ne.field_o + ") " + wa.field_k;
                if (jd.field_q > 0) {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L3: while (true) {
                    if (~var2 <= ~jd.field_q) {
                      break L2;
                    } else {
                      var1_ref = var1_ref + ' ';
                      var3 = 255 & sc.field_g.field_n[var2];
                      var4 = var3 >> 1569148036;
                      stackOut_6_0 = var4;
                      stackOut_6_1 = 10;
                      stackIn_23_0 = stackOut_6_0;
                      stackIn_23_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_7_0 >= stackIn_7_1) {
                              break L5;
                            } else {
                              var4 += 48;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var4 += 55;
                          break L4;
                        }
                        L6: {
                          L7: {
                            var3 = var3 & 15;
                            if (var3 < 10) {
                              break L7;
                            } else {
                              var3 += 55;
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var3 += 48;
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
                } else {
                  break L2;
                }
              }
              stackOut_22_0 = param0;
              stackOut_22_1 = -121;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              break L1;
            }
            if (stackIn_23_0 < stackIn_23_1) {
              stackOut_26_0 = (String) var1_ref;
              stackIn_27_0 = stackOut_26_0;
              break L0;
            } else {
              stackOut_24_0 = null;
              stackIn_25_0 = stackOut_24_0;
              return (String) (Object) stackIn_25_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "gf.A(" + param0 + ')');
        }
        return stackIn_27_0;
    }

    public static void b(byte param0) {
        field_b = null;
        field_g = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_f = null;
        if (param0 != -105) {
            return;
        }
        try {
            field_e = null;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "gf.B(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_c = new String[16];
        field_i = -1;
        field_f = new ll();
    }
}
