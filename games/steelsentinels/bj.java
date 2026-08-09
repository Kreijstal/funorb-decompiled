/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    int field_n;
    int field_g;
    static gh field_d;
    int field_e;
    int field_q;
    int field_i;
    byte[] field_p;
    static String field_a;
    static int field_h;
    byte[] field_m;
    static String field_c;
    int field_o;
    static String field_f;
    static String[] field_l;
    static int[] field_b;
    int field_k;
    static int field_j;

    final static void a(int param0, java.applet.Applet param1) {
        String var3 = null;
        long var4 = 0L;
        sn.field_d = true;
        String var2 = "tuhstatbut";
        if (param0 >= -48) {
            return;
        }
        try {
            var3 = "rvnadlm";
            var4 = -1L;
            mm.a(var2, (byte) 97, var3, param1, var4);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "bj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_l = null;
        field_a = null;
        if (param0 != 7) {
          bj.a(74);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final static boolean a(int[] param0, int param1, boolean param2, byte param3) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param3 >= 81) {
                break L1;
              } else {
                var9 = (int[]) null;
                bj.a((int[]) null, 21, true, (byte) -121);
                break L1;
              }
            }
            var4_int = ul.a((byte) 71, param1);
            if ((var4_int ^ -1) > -1) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var4_int ^ -1) <= -4) {
                L2: {
                  if (-7 < (var4_int ^ -1)) {
                    break L2;
                  } else {
                    if (!param2) {
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = 0;
                var6 = 0;
                L3: while (true) {
                  if (-7 >= (var6 ^ -1)) {
                    if (6 > var4_int) {
                      L4: {
                        if (var4_int >= var5 + 2) {
                          stackIn_27_0 = 0;
                          break L4;
                        } else {
                          stackIn_27_0 = 1;
                          break L4;
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var6 = 0;
                      var7 = 6;
                      L5: while (true) {
                        if (n.field_z.length <= var7) {
                          L6: {
                            var7 = var6 + 7;
                            if (-7 != (var5 ^ -1)) {
                              break L6;
                            } else {
                              var7++;
                              break L6;
                            }
                          }
                          L7: {
                            if (var4_int >= var7) {
                              stackIn_40_0 = 0;
                              break L7;
                            } else {
                              stackIn_40_0 = 1;
                              break L7;
                            }
                          }
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          L8: {
                            if (t.a(param0, n.field_z[var7], -20370)) {
                              var6++;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var7++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    L9: {
                      if (t.a(param0, n.field_z[var6], -20370)) {
                        var5++;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var6++;
                    continue L3;
                  }
                }
              } else {
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var4);

            stackIn_43_1 = new StringBuilder().append("bj.C(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L10;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L10;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0 != 0;
              } else {
                return stackIn_40_0 != 0;
              }
            }
          }
        }
    }

    static {
        field_c = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_a = "You haven't enough solarite cubes to engineer the <%0> at this time.<br>Earn more solarite cubes by playing Rated games.";
        field_f = "Staff impersonation";
        field_l = new String[]{"Most kills<%0>", " (You got <%0>)", "Most damage dealt<%0>", " (You dealt <%0>)", "Longest killing streak<%0>", " (Yours: <%0>)", "First kill", null, "Fewest deaths<%0>", " (You died <%0>)", "Perfect", " (You died <%0>)", "Sole survivor", null, "Longest flight<%0>", " (Yours: <%0>)", "Highest score", null, "Most interceptions<%0>", " (You got <%0>)", "Best kill combo<%0>", " (Yours: <%0>)", "Most melee kills<%0>", " (You got <%0>)", "Most gun/flak kills<%0>", " (You got <%0>)", "Most cannon/mortar kills<%0>", " (You got <%0>)", "Most rail gun kills<%0>", " (You got <%0>)", "Most beam kills<%0>", " (You got <%0>)", "Most plasma kills<%0>", " (You got <%0>)", "Most rocket/missile kills<%0>", " (You got <%0>)", "Most kills with atomics<%0>", " (You got <%0>)", "Most ship energises<%0>", " (You got <%0>)", "First to energise ship", null, "Killed most energised enemies<%0>", " (You got <%0>)", "Finished with MGFN", null, "Most kills while holding MGFN<%0>", " (You got <%0>)", "Most time with MGFN<%0>", " (Yours: <%0>)", "Highest scoring team<%0>", " (Your team: <%0>)", "Boss killer", null, "Best sniper accuracy<%0>", " (Yours: <%0>)", "Most power-ups<%0>", " (You got <%0>)", "Most kills of MGFN sentinels<%0>", " (You got <%0>)", "Most time in the energy shield<%0>", " (Yours: <%0>)", "Most bat kills<%0>", " (You got <%0>)"};
        field_b = new int[]{17, 18, 3, 22, -1, 8};
    }
}
