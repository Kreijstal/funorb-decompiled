/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static int field_b;
    static int field_a;
    static byte[][] field_c;

    final static String a(byte param0) {
        if (param0 != -12) {
            return (String) null;
        }
        return gk.field_F;
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            String stackIn_6_0 = null;
            String stackIn_12_0 = null;
            String stackIn_14_0 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_5_0 = null;
            String stackOut_13_0 = null;
            String stackOut_11_0 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            var9 = ZombieDawn.field_J;
            try {
              L0: {
                try {
                  L1: {
                    var10 = param0.getParameter("cookieprefix");
                    var3 = var10 + "settings";
                    var4 = (String) (qe.a(param0, "getcookies", -102));
                    var5 = de.a(';', var4, -125);
                    var6 = 30 / ((param1 - -23) / 59);
                    var7 = 0;
                    L2: while (true) {
                      if (var5.length <= var7) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var8 = var5[var7].indexOf('=');
                          if (0 > var8) {
                            break L3;
                          } else {
                            if (!var5[var7].substring(0, var8).trim().equals(var3)) {
                              break L3;
                            } else {
                              stackOut_5_0 = var5[var7].substring(var8 - -1).trim();
                              stackIn_6_0 = stackOut_5_0;
                              decompiledRegionSelector0 = 1;
                              break L1;
                            }
                          }
                        }
                        var7++;
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
                  if (nj.field_X == null) {
                    stackOut_13_0 = param0.getParameter("settings");
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    stackOut_11_0 = nj.field_X;
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector1 = 2;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_15_0 = (RuntimeException) (var2_ref);
                stackOut_15_1 = new StringBuilder().append("ff.C(");
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param0 == null) {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L5;
                } else {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L5;
                }
              }
              throw sh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_14_0;
              } else {
                return stackIn_6_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = (byte[][]) null;
        if (param0 != -1) {
            field_b = -98;
        }
    }

    static {
        field_c = new byte[1000][];
    }
}
