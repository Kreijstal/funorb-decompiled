/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static double field_b;
    static ql field_d;
    static String field_e;
    static String field_c;
    static ji field_a;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 >= -95) {
            field_d = (ql) null;
        }
        field_e = null;
        field_a = null;
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_9_0 = null;
            String stackIn_16_0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            var8 = wizardrun.field_H;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param1 == 102) {
                        break L2;
                      } else {
                        fb.a(78);
                        break L2;
                      }
                    }
                    var9 = param0.getParameter("cookieprefix");
                    var3 = var9 + "settings";
                    var4 = (String) (cl.a(param0, -3264, "getcookies"));
                    var5 = tj.a(var4, -22710, ';');
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= var5.length) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          var7 = var5[var6].indexOf('=');
                          if (0 > var7) {
                            break L4;
                          } else {
                            if (var5[var6].substring(0, var7).trim().equals(var3)) {
                              stackIn_9_0 = var5[var6].substring(1 + var7).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var6++;
                        continue L3;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (pa.field_f != null) {
                    stackIn_16_0 = pa.field_f;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  } else {
                    return param0.getParameter("settings");
                  }
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var2_ref);

                stackIn_19_1 = new StringBuilder().append("fb.A(");

                if (param0 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L6;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L6;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_16_0;
            } else {
              return stackIn_9_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = Math.atan2(1.0, 0.0);
        field_c = "Your email address is used to identify this account";
        field_e = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
