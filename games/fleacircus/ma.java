/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    static String field_a;

    public static void a(byte param0) {
        if (param0 >= -36) {
            ma.a(1.5420202648877515, 77);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            int stackIn_3_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_14_1 = 0;
            int stackIn_20_0 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            var7 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                if (!qj.field_G) {
                  try {
                    L1: {
                      var8 = "tuhstatbut";
                      var3 = (String) (eb.a("getcookies", param1, -250));
                      var4 = m.a(';', 119, var3);
                      var5 = 0;
                      L2: while (true) {
                        L3: {
                          L4: {
                            if (var5 >= var4.length) {
                              break L4;
                            } else {
                              var6 = var4[var5].indexOf('=');
                              stackIn_14_0 = -1;

                              stackIn_14_1 = var6 ^ -1;

                              if (var7 != 0) {
                                break L3;
                              } else {
                                L5: {
                                  if (stackIn_14_0 < stackIn_14_1) {
                                    break L5;
                                  } else {
                                    if (var4[var5].substring(0, var6).trim().equals(var8)) {
                                      stackIn_11_0 = 1;
                                      decompiledRegionSelector0 = 0;
                                      break L1;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                var5++;
                                if (var7 == 0) {
                                  continue L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          stackIn_14_0 = 127;
                          stackIn_14_1 = (-23 - param0) / 36;
                          break L3;
                        }
                        var5 = stackIn_14_0 / stackIn_14_1;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L6: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  } else {
                    L7: {
                      if (null == param1.getParameter("tuhstatbut")) {
                        stackIn_20_0 = 0;
                        break L7;
                      } else {
                        stackIn_20_0 = 1;
                        break L7;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  }
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_23_0 = (RuntimeException) (var2);

                stackIn_23_1 = new StringBuilder().append("ma.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "null";
                  break L8;
                } else {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "{...}";
                  break L8;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_11_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static double a(double param0, int param1) {
        if (param1 <= 54) {
          ma.a(-0.36173003999453074, 40);
          return tg.field_b[65535 & (int)(param0 * 32768.0 / 3.141592653589793)];
        } else {
          return tg.field_b[65535 & (int)(param0 * 32768.0 / 3.141592653589793)];
        }
    }

    static {
    }
}
