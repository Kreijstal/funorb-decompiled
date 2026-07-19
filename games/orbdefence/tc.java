/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static wd[] field_a;
    static int field_b;

    final static boolean a(byte param0, char param1) {
        String discarded$2 = null;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        java.applet.Applet var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_2_0 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (nh.a(false, param1)) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
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
                    discarded$2 = tc.a((byte) -96, (java.applet.Applet) null);
                    break L1;
                  }
                }
                var3 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          if (var3 >= var9.length) {
                            break L6;
                          } else {
                            var4 = var9[var3];
                            var11 = param1 ^ -1;
                            var10 = var4 ^ -1;
                            if (var5 != 0) {
                              if (var10 >= var11) {
                                break L4;
                              } else {
                                L7: while (true) {
                                  var4 = var2[var3];
                                  stackOut_21_0 = var4 ^ -1;
                                  stackIn_28_0 = stackOut_21_0;
                                  stackIn_22_0 = stackOut_21_0;
                                  if (var5 != 0) {
                                    break L3;
                                  } else {
                                    if (stackIn_22_0 == (param1 ^ -1)) {
                                      break L5;
                                    } else {
                                      var3++;
                                      if (var5 == 0) {
                                        if (var2.length <= var3) {
                                          break L4;
                                        } else {
                                          continue L7;
                                        }
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (var10 != var11) {
                                var3++;
                                if (var5 == 0) {
                                  continue L2;
                                } else {
                                  break L6;
                                }
                              } else {
                                return true;
                              }
                            }
                          }
                        }
                        var2 = dm.field_d;
                        var3 = 0;
                        L8: while (true) {
                          if (var2.length <= var3) {
                            break L4;
                          } else {
                            var4 = var2[var3];
                            stackOut_21_0 = var4 ^ -1;
                            stackIn_28_0 = stackOut_21_0;
                            stackIn_22_0 = stackOut_21_0;
                            if (var5 != 0) {
                              break L3;
                            } else {
                              if (stackIn_22_0 == (param1 ^ -1)) {
                                break L5;
                              } else {
                                var3++;
                                if (var5 == 0) {
                                  continue L8;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_24_0 = 1;
                      stackIn_25_0 = stackOut_24_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L3;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
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
              return stackIn_28_0 != 0;
            } else {
              return stackIn_25_0 != 0;
            }
          }
        }
    }

    public static void a(boolean param0) {
        String discarded$0 = null;
        field_a = null;
        if (!param0) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            discarded$0 = tc.a((byte) -85, (java.applet.Applet) null);
        }
    }

    final static void a(int param0) {
        int discarded$48 = 0;
        int discarded$49 = 0;
        int discarded$50 = 0;
        int discarded$51 = 0;
        mj var1 = null;
        se var2 = null;
        var1 = (mj) ((Object) nd.field_b.b((byte) -58));
        if (var1 == null) {
          th.a(109);
          return;
        } else {
          var2 = cd.field_t;
          discarded$48 = var2.l(0);
          discarded$49 = var2.l(0);
          discarded$50 = var2.l(0);
          discarded$51 = var2.l(0);
          var1.b(57);
          if (param0 > -35) {
            field_b = 85;
            return;
          } else {
            return;
          }
        }
    }

    final static String a(byte param0, java.applet.Applet param1) {
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
            String stackIn_3_0 = null;
            String stackIn_10_0 = null;
            String stackIn_16_0 = null;
            String stackIn_18_0 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_9_0 = null;
            String stackOut_2_0 = null;
            String stackOut_17_0 = null;
            String stackOut_15_0 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
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
                        L3: {
                          if (var5.length <= var6) {
                            break L3;
                          } else {
                            var7 = var5[var6].indexOf('=');
                            if (var8 != 0) {
                              break L3;
                            } else {
                              L4: {
                                if (0 > var7) {
                                  break L4;
                                } else {
                                  if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                                    break L4;
                                  } else {
                                    stackOut_9_0 = var5[var6].substring(var7 - -1).trim();
                                    stackIn_10_0 = stackOut_9_0;
                                    decompiledRegionSelector0 = 2;
                                    break L1;
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
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    } else {
                      stackOut_2_0 = (String) null;
                      stackIn_3_0 = stackOut_2_0;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var2_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    if (ld.field_e == null) {
                      stackOut_17_0 = param1.getParameter("settings");
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      stackOut_15_0 = ld.field_e;
                      stackIn_16_0 = stackOut_15_0;
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
              L6: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_19_0 = (RuntimeException) (var2);
                stackOut_19_1 = new StringBuilder().append("tc.C(").append(param0).append(',');
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                if (param1 == null) {
                  stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackOut_21_2 = "null";
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L6;
                } else {
                  stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackOut_20_2 = "{...}";
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  break L6;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_3_0;
                } else {
                  return stackIn_10_0;
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
