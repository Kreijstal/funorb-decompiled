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
            throw ci.a((Throwable) (Object) runtimeException, "bj.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param3 >= 81) {
                break L1;
              } else {
                var9 = null;
                boolean discarded$1 = bj.a((int[]) null, 21, true, (byte) -121);
                break L1;
              }
            }
            var4_int = ul.a((byte) 71, param1);
            if (var4_int < 0) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              if (var4_int >= 3) {
                L2: {
                  if (var4_int < 6) {
                    break L2;
                  } else {
                    if (!param2) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = 0;
                var6 = 0;
                L3: while (true) {
                  if (var6 >= 6) {
                    if (6 > var4_int) {
                      L4: {
                        if (var4_int >= var5 + 2) {
                          stackOut_28_0 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          break L4;
                        } else {
                          stackOut_27_0 = 1;
                          stackIn_29_0 = stackOut_27_0;
                          break L4;
                        }
                      }
                      return stackIn_29_0 != 0;
                    } else {
                      L5: {
                        var6 = 0;
                        var7 = 6;
                        if (~n.field_z.length >= ~var7) {
                          break L5;
                        } else {
                          L6: {
                            if (t.a(param0, n.field_z[var7], -20370)) {
                              var6++;
                              break L6;
                            } else {
                              var7++;
                              break L6;
                            }
                          }
                          var7++;
                          var7++;
                          break L5;
                        }
                      }
                      L7: {
                        var7 = var6 + 7;
                        if (var5 != 6) {
                          break L7;
                        } else {
                          var7++;
                          break L7;
                        }
                      }
                      L8: {
                        if (~var4_int <= ~var7) {
                          stackOut_40_0 = 0;
                          stackIn_41_0 = stackOut_40_0;
                          break L8;
                        } else {
                          stackOut_39_0 = 1;
                          stackIn_41_0 = stackOut_39_0;
                          break L8;
                        }
                      }
                      break L0;
                    }
                  } else {
                    if (t.a(param0, n.field_z[var6], -20370)) {
                      var5++;
                      var6++;
                      var6++;
                      continue L3;
                    } else {
                      var6++;
                      var6++;
                      continue L3;
                    }
                  }
                }
              } else {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var4;
            stackOut_42_1 = new StringBuilder().append("bj.C(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L9;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L9;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_41_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_a = "You haven't enough solarite cubes to engineer the <%0> at this time.<br>Earn more solarite cubes by playing Rated games.";
        field_f = "Staff impersonation";
        field_l = new String[]{"Most kills<%0>", " (You got <%0>)", "Most damage dealt<%0>", " (You dealt <%0>)", "Longest killing streak<%0>", " (Yours: <%0>)", "First kill", null, "Fewest deaths<%0>", " (You died <%0>)", "Perfect", " (You died <%0>)", "Sole survivor", null, "Longest flight<%0>", " (Yours: <%0>)", "Highest score", null, "Most interceptions<%0>", " (You got <%0>)", "Best kill combo<%0>", " (Yours: <%0>)", "Most melee kills<%0>", " (You got <%0>)", "Most gun/flak kills<%0>", " (You got <%0>)", "Most cannon/mortar kills<%0>", " (You got <%0>)", "Most rail gun kills<%0>", " (You got <%0>)", "Most beam kills<%0>", " (You got <%0>)", "Most plasma kills<%0>", " (You got <%0>)", "Most rocket/missile kills<%0>", " (You got <%0>)", "Most kills with atomics<%0>", " (You got <%0>)", "Most ship energises<%0>", " (You got <%0>)", "First to energise ship", null, "Killed most energised enemies<%0>", " (You got <%0>)", "Finished with MGFN", null, "Most kills while holding MGFN<%0>", " (You got <%0>)", "Most time with MGFN<%0>", " (Yours: <%0>)", "Highest scoring team<%0>", " (Your team: <%0>)", "Boss killer", null, "Best sniper accuracy<%0>", " (Yours: <%0>)", "Most power-ups<%0>", " (You got <%0>)", "Most kills of MGFN sentinels<%0>", " (You got <%0>)", "Most time in the energy shield<%0>", " (Yours: <%0>)", "Most bat kills<%0>", " (You got <%0>)"};
        field_b = new int[]{17, 18, 3, 22, -1, 8};
    }
}
