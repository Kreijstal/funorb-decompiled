/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static int field_a;

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_21_0 = 0;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var7 = AceOfSkies.field_G ? 1 : 0;
            try {
              L0: {
                if (jr.field_u) {
                  stackIn_4_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      if (param1 == 61) {
                        var3 = (String) (fe.a("getcookies", (byte) -108, param0));
                        var4 = ee.a((byte) 10, ';', var3);
                        var5 = 0;
                        L2: while (true) {
                          if (var5 >= var4.length) {
                            decompiledRegionSelector0 = 1;
                            break L1;
                          } else {
                            L3: {
                              var6 = var4[var5].indexOf('=');
                              if (-1 < (var6 ^ -1)) {
                                break L3;
                              } else {
                                if (var4[var5].substring(0, var6).trim().equals(var2)) {
                                  stackIn_14_0 = 1;
                                  decompiledRegionSelector0 = 2;
                                  break L1;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        stackIn_7_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 1;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      L5: {
                        if (param0.getParameter("tuhstatbut") == null) {
                          stackIn_21_0 = 0;
                          break L5;
                        } else {
                          stackIn_21_0 = 1;
                          break L5;
                        }
                      }
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector1 = 3;
                      break L0;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_24_0 = (RuntimeException) (var2_ref2);

                stackIn_24_1 = new StringBuilder().append("lq.B(");

                if (param0 == null) {
                  stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackIn_25_2 = "null";
                  break L6;
                } else {
                  stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackIn_25_2 = "{...}";
                  break L6;
                }
              }
              throw pn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_21_0 != 0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_7_0 != 0;
                } else {
                  return stackIn_14_0 != 0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static rh a(al[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        rh stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -14 / ((35 - param1) / 33);
            stackIn_1_0 = bm.a((byte) -70, param0[qq.a(20, param0.length)]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("lq.A(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_a = 0;
    }
}
