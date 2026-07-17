/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static String field_b;
    static String field_a;

    public static void b() {
        field_a = null;
        field_b = null;
    }

    final static qg[] a(byte param0, int param1, int param2, ki param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        qg[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        qg[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (pk.a(101, param2, param3, param1)) {
              stackOut_4_0 = ba.a(17867);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (qg[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ei.C(").append(97).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    final static void a() {
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hj var6 = null;
        hj var7 = null;
        hj var8 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            ul.d(243, 197, 369, 143, 16777215);
            ul.h(244, 198, 367, 141, 0);
            if (dm.field_b == null) {
              L1: {
                if (rc.field_a != null) {
                  int discarded$3 = rc.field_a.a(cj.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                var6 = dm.field_b[kb.field_m];
                if (var6 != null) {
                  var6.c(245, 199);
                  break L2;
                } else {
                  if (rc.field_a != null) {
                    int discarded$4 = rc.field_a.a(cj.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (og.field_b > h.field_A) {
                  var7 = dm.field_b[lj.field_u];
                  if (var7 != null) {
                    var2_int = h.field_A * (var7.field_s + 60) / og.field_b;
                    var3 = -30 + var2_int;
                    if (bh.field_b) {
                      jf.a((byte) -20, var3 * -256 / 30, var7, 256 * (var7.field_s + -var3) / 30, 199, 245);
                      break L3;
                    } else {
                      jf.a((byte) -20, 256 * (-var3 + var7.field_s) / 30, var7, -256 * var3 / 30, 199, 245);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                if (rc.field_a == null) {
                  break L4;
                } else {
                  var2 = null;
                  var5 = 0;
                  var3 = var5;
                  L5: while (true) {
                    if (dm.field_b.length <= var5) {
                      if (var2 == null) {
                        break L4;
                      } else {
                        int discarded$5 = rc.field_a.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        return;
                      }
                    } else {
                      L6: {
                        var8 = dm.field_b[var5];
                        if (var8 != null) {
                          L7: {
                            if (var8.field_s != 365) {
                              break L7;
                            } else {
                              if (var8.field_t != 139) {
                                break L7;
                              } else {
                                var5++;
                                break L6;
                              }
                            }
                          }
                          if (var2 == null) {
                            var2 = (Object) (Object) Integer.toString(var5);
                            break L6;
                          } else {
                            var2 = (Object) (Object) (var2 + ", " + var5);
                            break L6;
                          }
                        } else {
                          var5++;
                          break L6;
                        }
                      }
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "ei.B(" + -463 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Names should contain a maximum of 12 characters";
        field_b = "Area";
    }
}
