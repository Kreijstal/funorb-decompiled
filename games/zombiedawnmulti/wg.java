/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static String field_a;
    static String field_c;
    static String field_d;
    static String field_b;

    final static String a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
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
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var8 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var2 = param1.getParameter("cookieprefix");
                    var3 = var2 + "settings";
                    var4 = (String) (fo.b(param1, 13093, "getcookies"));
                    var5 = mk.a(';', false, var4);
                    var6 = param0;
                    L2: while (true) {
                      if (var5.length <= var6) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var7 = var5[var6].indexOf('=');
                          if (var7 < 0) {
                            break L3;
                          } else {
                            if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                              break L3;
                            } else {
                              stackIn_6_0 = var5[var6].substring(1 + var7).trim();
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
                    var2_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (null == oe.field_c) {
                    stackIn_14_0 = param1.getParameter("settings");
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    stackIn_12_0 = oe.field_c;
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
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_17_0 = (RuntimeException) (var2_ref2);

                stackIn_17_1 = new StringBuilder().append("wg.B(").append(param0).append(',');

                if (param1 == null) {
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
              throw fa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
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

    final static int c(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!ba.c(-1)) {
                mo.field_Jb.a(aj.a(bo.field_d, false, bd.field_g), 56, aj.a(ka.field_t, false, vb.field_f));
                if (param0 < -26) {
                  L2: {
                    if (!mo.field_Jb.c(-85)) {
                      break L2;
                    } else {
                      var1_int = 1;
                      break L2;
                    }
                  }
                  L3: {
                    var2 = 0;
                    if (var1_int == 0) {
                      break L3;
                    } else {
                      if ((mo.field_Jb.field_d ^ -1) <= -1) {
                        var2 = oq.field_x[mo.field_Jb.field_d];
                        if ((var2 ^ -1) != -3) {
                          break L3;
                        } else {
                          mo.i(-38);
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_16_0 = var2;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_7_0 = 112;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                mo.field_Jb.d(99);
                if (!mo.field_Jb.c(-85)) {
                  continue L1;
                } else {
                  var1_int = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "wg.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_16_0;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 > -60) {
            field_a = (String) null;
        }
    }

    final static void b(byte param0) {
        if (param0 <= 36) {
          field_a = (String) null;
          io.a(8355711, nc.field_e, kc.field_c, wa.field_a, vo.field_m);
          return;
        } else {
          io.a(8355711, nc.field_e, kc.field_c, wa.field_a, vo.field_m);
          return;
        }
    }

    static {
        field_a = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_b = "Day";
        field_d = "That name is not available";
        field_c = "Please try again in a few minutes.";
    }
}
