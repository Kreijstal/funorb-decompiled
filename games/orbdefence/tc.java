/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static wd[] field_a;
    static int field_b;

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        java.applet.Applet var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (nh.a(false, param1)) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var9 = kk.field_V;
                  var8 = var9;
                  var7 = var8;
                  var2 = var7;
                  if (param0 == -20) {
                    break L1;
                  } else {
                    var6 = (java.applet.Applet) null;
                    tc.a((byte) -96, (java.applet.Applet) null);
                    break L1;
                  }
                }
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var9.length) {
                    var2 = dm.field_d;
                    var3 = 0;
                    L3: while (true) {
                      if (var2.length <= var3) {
                        stackIn_25_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 == param1) {
                          stackIn_22_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var3++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4 = var9[var3];
                    if ((var4 ^ -1) != (param1 ^ -1)) {
                      var3++;
                      continue L2;
                    } else {
                      return true;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "tc.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              return stackIn_25_0 != 0;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            tc.a((byte) -85, (java.applet.Applet) null);
        }
    }

    final static void a(int param0) {
        mj var1 = (mj) ((Object) nd.field_b.b((byte) -58));
        if (!(var1 != null)) {
            th.a(109);
            return;
        }
        se var2 = cd.field_t;
        var2.l(0);
        var2.l(0);
        var2.l(0);
        var2.l(0);
        var1.b(57);
        if (param0 > -35) {
            field_b = 85;
        }
    }

    final static String a(byte param0, java.applet.Applet param1) {
        try {
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_3_0 = null;
            String stackIn_9_0 = null;
            String stackIn_15_0 = null;
            String stackIn_17_0 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            var8 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var9 = param1.getParameter("cookieprefix");
                    var3 = var9 + "settings";
                    var4 = (String) (gm.a(param0 + -31142, "getcookies", param1));
                    var5 = g.a(37, ';', var4);
                    if (param0 == -41) {
                      var6 = 0;
                      L2: while (true) {
                        if (var5.length <= var6) {
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
                                stackIn_9_0 = var5[var6].substring(var7 - -1).trim();
                                decompiledRegionSelector0 = 2;
                                break L1;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      stackIn_3_0 = (String) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    if (ld.field_e == null) {
                      stackIn_17_0 = param1.getParameter("settings");
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      stackIn_15_0 = ld.field_e;
                      decompiledRegionSelector1 = 0;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_20_0 = (RuntimeException) (var2_ref);

                stackIn_20_1 = new StringBuilder().append("tc.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L5;
                } else {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L5;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_3_0;
                } else {
                  return stackIn_9_0;
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
    }
}
