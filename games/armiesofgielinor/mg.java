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
        wk[] discarded$2 = null;
        if (param2 > -23) {
          discarded$2 = mg.a(0, -20, (byte) -123, -41, 33);
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
            RuntimeException var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_8_0 = null;
            String stackIn_14_0 = null;
            String stackIn_16_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_7_0 = null;
            String stackOut_15_0 = null;
            String stackOut_13_0 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
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
                      L3: {
                        if (var5.length <= var6) {
                          break L3;
                        } else {
                          var7 = var5[var6].indexOf('=');
                          if (var8 != 0) {
                            break L3;
                          } else {
                            L4: {
                              if (-1 < (var7 ^ -1)) {
                                break L4;
                              } else {
                                if (var5[var6].substring(0, var7).trim().equals(var3)) {
                                  stackOut_7_0 = var5[var6].substring(var7 + 1).trim();
                                  stackIn_8_0 = stackOut_7_0;
                                  decompiledRegionSelector0 = 1;
                                  break L1;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var6++;
                            if (var8 == 0) {
                              continue L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var2_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (sj.field_b == null) {
                    stackOut_15_0 = param1.getParameter("settings");
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    stackOut_13_0 = sj.field_b;
                    stackIn_14_0 = stackOut_13_0;
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
              L6: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) (var2);
                stackOut_17_1 = new StringBuilder().append("mg.G(").append(param0).append(',');
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param1 == null) {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L6;
                } else {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L6;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_16_0;
              } else {
                return stackIn_8_0;
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
