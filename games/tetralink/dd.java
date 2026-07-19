/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static String field_b;
    static int field_a;
    static int field_c;

    public static void a(int param0) {
        if (param0 != 0) {
            dd.a(-99);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4, int param5, int param6, int param7, int param8, boolean param9, int param10, boolean param11) {
        int var12 = -16 % ((param1 - -80) / 43);
        bj.a(16777215, param4, param2, param0, param5, 16777215, param10, param9, param8, param7, param6, -869, param3, param11);
    }

    final static void b(int param0) {
        s.field_f = false;
        if (param0 > -10) {
          field_c = 70;
          qa.field_v = false;
          t.a(-1, 0);
          pi.field_a = fk.field_Q;
          ma.field_d = fk.field_Q;
          return;
        } else {
          qa.field_v = false;
          t.a(-1, 0);
          pi.field_a = fk.field_Q;
          ma.field_d = fk.field_Q;
          return;
        }
    }

    final static String a(java.applet.Applet param0, byte param1) {
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
            String stackIn_6_0 = null;
            String stackIn_13_0 = null;
            String stackIn_15_0 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_5_0 = null;
            String stackOut_14_0 = null;
            String stackOut_12_0 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            var8 = TetraLink.field_J;
            try {
              L0: {
                try {
                  L1: {
                    var9 = param0.getParameter("cookieprefix");
                    var3 = var9 + "settings";
                    var4 = (String) (ii.a((byte) 90, "getcookies", param0));
                    var5 = hi.a(var4, ';', 783);
                    var6 = 0;
                    L2: while (true) {
                      if (var5.length <= var6) {
                        var6 = 92 / ((-37 - param1) / 32);
                        decompiledRegionSelector0 = 1;
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
                              stackOut_5_0 = var5[var6].substring(1 + var7).trim();
                              stackIn_6_0 = stackOut_5_0;
                              decompiledRegionSelector0 = 0;
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
                    var2_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  if (null == bm.field_s) {
                    stackOut_14_0 = param0.getParameter("settings");
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    stackOut_12_0 = bm.field_s;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) (var2);
                stackOut_16_1 = new StringBuilder().append("dd.A(");
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param0 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L5;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L5;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_15_0;
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

    static {
        field_b = "Public chat is unavailable while setting up a rated game.";
    }
}
