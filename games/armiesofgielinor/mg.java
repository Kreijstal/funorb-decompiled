/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mg {
    static String field_c;
    static String field_b;
    static int field_f;
    static bv field_e;
    static wk field_d;
    static String field_a;
    static int field_g;

    abstract void a(byte param0, byte[] param1);

    final static wk[] a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 > -23) {
          mg.a(0, -20, (byte) -123, -41, 33);
          return lf.a(param3, 1, param4, 1, 3, param1, -1, 1, param0);
        } else {
          return lf.a(param3, 1, param4, 1, 3, param1, -1, 1, param0);
        }
    }

    public static void b(int param0) {
        if (param0 != 9892) {
            return;
        }
        field_d = null;
        field_c = null;
        field_b = null;
        field_e = null;
        field_a = null;
    }

    abstract byte[] a(int param0);

    final static String a(int param0, java.applet.Applet param1) {
        try {
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_7_0 = null;
            String stackIn_13_0 = null;
            String stackIn_15_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            var8 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var9 = param1.getParameter("cookieprefix");
                    var3 = var9 + "settings";
                    var4 = (String) (lj.a("getcookies", (byte) 114, param1));
                    var5 = dj.a(-111, ';', var4);
                    var6 = param0;
                    L2: while (true) {
                      if (var5.length <= var6) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var7 = var5[var6].indexOf('=');
                          if (-1 < (var7 ^ -1)) {
                            break L3;
                          } else {
                            if (var5[var6].substring(0, var7).trim().equals(var3)) {
                              stackIn_7_0 = var5[var6].substring(var7 + 1).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              break L3;
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
                  if (sj.field_b == null) {
                    stackIn_15_0 = param1.getParameter("settings");
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    stackIn_13_0 = sj.field_b;
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
                stackIn_18_0 = (RuntimeException) (var2_ref);

                stackIn_18_1 = new StringBuilder().append("mg.G(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L5;
                } else {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L5;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_15_0;
              } else {
                return stackIn_7_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Accept invitation to <%0>'s game";
        field_c = "Most health lost";
        field_f = -1;
        field_g = 0;
        field_a = "You need to play <%0> more rated games to unlock this option.";
    }
}
