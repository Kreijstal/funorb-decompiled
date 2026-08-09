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
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
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
                              stackIn_6_0 = var5[var7].substring(var8 - -1).trim();
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
                    stackIn_14_0 = param0.getParameter("settings");
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    stackIn_12_0 = nj.field_X;
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
                stackIn_17_0 = (RuntimeException) (var2_ref);

                stackIn_17_1 = new StringBuilder().append("ff.C(");

                if (param0 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L5;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
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
