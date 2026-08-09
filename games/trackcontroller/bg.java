/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    static int[] field_a;

    public static void a(int param0) {
        if (param0 != 61) {
            return;
        }
        field_a = null;
    }

    final static boolean a(be param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0.h(16383);
              if (param1 == (var2_int ^ -1)) {
                stackIn_3_0 = 1;
                break L1;
              } else {
                stackIn_3_0 = 0;
                break L1;
              }
            }
            var3 = stackIn_3_0;
            stackIn_4_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("bg.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static String a(java.applet.Applet param0, int param1) {
        try {
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_8_0 = null;
            String stackIn_14_0 = null;
            String stackIn_17_0 = null;
            String stackIn_19_0 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            var8 = TrackController.field_F ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var9 = param0.getParameter("cookieprefix");
                    var3 = var9 + "settings";
                    var4 = (String) (sj.a((byte) -77, "getcookies", param0));
                    var5 = te.a(var4, ';', (byte) -64);
                    var6 = 0;
                    L2: while (true) {
                      if (var5.length <= var6) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var7 = var5[var6].indexOf('=');
                          if (0 > var7) {
                            break L3;
                          } else {
                            if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                              break L3;
                            } else {
                              stackIn_8_0 = var5[var6].substring(var7 + 1).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            }
                          }
                        }
                        var6++;
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (param1 == -22004) {
                    if (of.field_g == null) {
                      stackIn_19_0 = param0.getParameter("settings");
                      decompiledRegionSelector1 = 2;
                      break L0;
                    } else {
                      stackIn_17_0 = of.field_g;
                      decompiledRegionSelector1 = 1;
                      break L0;
                    }
                  } else {
                    stackIn_14_0 = (String) null;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_22_0 = (RuntimeException) (var2_ref);

                stackIn_22_1 = new StringBuilder().append("bg.C(");

                if (param0 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L5;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L5;
                }
              }
              throw sl.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_19_0;
                } else {
                  return stackIn_8_0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new int[8192];
    }
}
