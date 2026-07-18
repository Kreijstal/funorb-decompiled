/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    int field_e;
    static int field_c;
    int field_g;
    static jc field_a;
    int field_f;
    int field_i;
    static int field_d;
    static String field_b;
    static String field_h;

    final static void a(boolean param0, pg param1, int param2) {
        RuntimeException runtimeException = null;
        nk var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var3 = qn.field_U;
              var3.f(param2, -114);
              if (!param0) {
                break L1;
              } else {
                field_d = -61;
                break L1;
              }
            }
            var3.c(param1.field_q, (byte) -91);
            var3.c(param1.field_u, (byte) -60);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("tm.C(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            field_b = null;
            field_h = null;
            field_a = null;
            if (param0 <= 5) {
                field_d = -35;
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "tm.B(" + param0 + ')');
        }
    }

    final static String b(byte param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        String stackIn_25_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        byte stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        String stackOut_24_0 = null;
        var5 = Chess.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = "(" + lf.field_T + " " + wc.field_u + " " + hh.field_o + ") " + wg.field_B;
                if (sb.field_sb <= 0) {
                  break L2;
                } else {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L3: while (true) {
                    if (~sb.field_sb >= ~var2) {
                      break L2;
                    } else {
                      var1_ref = var1_ref + ' ';
                      var3 = 255 & tk.field_h.field_o[var2];
                      var4 = var3 >> -1927438172;
                      var3 = var3 & 15;
                      stackOut_4_0 = ~var4;
                      stackOut_4_1 = -11;
                      stackIn_21_0 = stackOut_4_0;
                      stackIn_21_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_5_0 > stackIn_5_1) {
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
                }
              }
              stackOut_20_0 = param0;
              stackOut_20_1 = -119;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              break L1;
            }
            L8: {
              if (stackIn_21_0 <= stackIn_21_1) {
                break L8;
              } else {
                String discarded$1 = tm.b((byte) 71);
                break L8;
              }
            }
            stackOut_24_0 = (String) var1_ref;
            stackIn_25_0 = stackOut_24_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "tm.A(" + param0 + ')');
        }
        return stackIn_25_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new jc();
        field_b = "Show players in <%0>'s game";
        field_h = "Players";
    }
}
