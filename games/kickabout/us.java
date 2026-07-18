/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class us extends gn {
    static String field_f;
    static String field_g;
    static int field_j;
    static int field_k;
    static int[] field_i;
    static int field_e;
    static String[] field_h;

    final static int a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -69) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            stackOut_3_0 = ck.field_d;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "us.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void g(byte param0) {
        Object var1 = null;
        int var2 = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        try {
          L0: {
            if (null == et.field_d) {
              return;
            } else {
              kb.h(-92);
              if (mc.field_a != 0) {
                L1: {
                  var1 = null;
                  var2 = je.a(false);
                  if (var2 != -1) {
                    var1 = (Object) (Object) rr.field_g[var2];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param0 <= -75) {
                  L2: {
                    ul.a((byte) -126, (String) var1);
                    if (-1 == var2) {
                      break L2;
                    } else {
                      if (dd.field_f < 60) {
                        L3: {
                          var3 = ep.field_c[var2];
                          var4 = pb.field_C.b(var3, mc.field_a + -44);
                          if (dd.field_f > 0) {
                            L4: {
                              var6 = 60;
                              var7 = dd.field_f;
                              if (var3.length() < 70) {
                                var6 = 10;
                                var7 = Math.max(0, var6 - (60 - var7));
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var8 = (-var7 + var6) * var3.length() / var6;
                            var3 = var3.substring(0, var8);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L5: {
                          if (var4 == 1) {
                            stackOut_32_0 = 16;
                            stackIn_33_0 = stackOut_32_0;
                            break L5;
                          } else {
                            if (var4 == 2) {
                              stackOut_31_0 = 6;
                              stackIn_33_0 = stackOut_31_0;
                              break L5;
                            } else {
                              stackOut_29_0 = 0;
                              stackIn_33_0 = stackOut_29_0;
                              break L5;
                            }
                          }
                        }
                        var5 = stackIn_33_0;
                        var3 = wj.a("</>", "</shad></col>", true, wj.a("<>", "<col=ffff00><shad=010101>", true, var3));
                        int discarded$1 = pb.field_C.a(var3, (-mc.field_a + 640 >> -1128845375) - -72, -10 + (var5 - -458) + -48, -44 + mc.field_a - 50, 48, 16777215, -1, 0, 0, 16);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Object) (Object) decompiledCaughtException;
          throw nb.a((Throwable) var1, "us.C(" + param0 + ')');
        }
    }

    public static void f(byte param0) {
        try {
            field_h = null;
            field_f = null;
            field_g = null;
            field_i = null;
            int var1_int = 36 % ((-42 - param0) / 32);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "us.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Player Shop";
        field_f = "Loading sound effects";
        field_e = 50;
        field_h = new String[]{"Empty", "Increases POW by 2.", "Increases POW by 4.", "Increases POW by 7.", "Increases TCK by 2.", "Increases TCK by 4.", "Increases TCK by 7.", "Increases SPD by 2.", "Increases SPD by 4.", "Increases SPD by 7.", "Increases POW by 2.<br>Decreases TCK by 2.", "Increases POW by 4.<br>Decreases TCK by 2.", "Increases POW by 4.<br>Increases TCK by 2.", "Increases POW by 7.<br>Decreases TCK by 2.", "Increases POW by 7.<br>Increases TCK by 2.", "Increases POW by 7.<br>Increases TCK by 4.", "Increases POW by 2.<br>Decreases SPD by 2.", "Increases POW by 4.<br>Decreases SPD by 2.", "Increases POW by 4.<br>Increases SPD by 2.", "Increases POW by 7.<br>Decreases SPD by 2.", "Increases POW by 7.<br>Increases SPD by 2.", "Increases POW by 7.<br>Increases SPD by 4.", "Increases SPD by 2.<br>Decreases TCK by 2.", "Increases SPD by 4.<br>Decreases TCK by 2.", "Increases SPD by 4.<br>Increases TCK by 2.", "Increases SPD by 7.<br>Decreases TCK by 2.", "Increases SPD by 7.<br>Increases TCK by 2.", "Increases SPD by 7.<br>Increases TCK by 4.", "Increases SPD by 2.<br>Decreases POW by 2.", "Increases SPD by 4.<br>Decreases POW by 2.", "Increases SPD by 4.<br>Increases POW by 2.", "Increases SPD by 7.<br>Decreases POW by 2.", "Increases SPD by 7.<br>Increases POW by 2.", "Increases SPD by 7.<br>Increases POW by 4.", "Increases TCK by 2.<br>Decreases SPD by 2.", "Increases TCK by 4.<br>Decreases SPD by 2.", "Increases TCK by 4.<br>Increases SPD by 2.", "Increases TCK by 7.<br>Decreases SPD by 2.", "Increases TCK by 7.<br>Increases SPD by 2.", "Increases TCK by 7.<br>Increases SPD by 4.", "Increases TCK by 2.<br>Decreases POW by 2.", "Increases TCK by 4.<br>Decreases POW by 2.", "Increases TCK by 4.<br>Increases POW by 2.", "Increases TCK by 7.<br>Decreases POW by 2.", "Increases TCK by 7.<br>Increases POW by 2.", "Increases TCK by 7.<br>Increases POW by 4.", "Increases EXP gained by this player by 2%.", "Increases EXP gained by this player by 4%.", "Increases EXP gained by this player by 6%.", "Increases EXP gained by this player by 8%.", "Increases money won by your team at the end of a game by 1%.", "Increases money won by your team at the end of a game by 2%.", "Increases money won by your team at the end of a game by 3%.", "Increases money won by your team at the end of a game by 4%.", "Tackles will not affect players on the same team.", "This player is not affected by tackles from team-mates.", "All players on your team are unaffected by tackles from team-mates.", "Tackled players remain on the ground for two times longer than normal. Does not stack.", "Tackled players remain on the ground for three times longer than normal. Does not stack.", "This player can tackle like a Tank.", "This player can shoot like a Hotshot.", "This player can sprint-dash like a Ranger.", "This player can turn while sprint-dashing.", "Type 'WHEREAMI' in unrated games to activate cheat.", "Type 'MUSHROOM' in unrated games to activate cheat.", "Type 'MOONWALK' in unrated games to activate cheat.", "Type 'AIRPLANE' in unrated games to activate cheat.", "Type 'ATOMBALL' in unrated games to activate cheat.", "Type 'TRAMLINE' in unrated games to activate cheat.", "Type 'TORQUING' in unrated games to activate cheat.", "Type 'MOONBALL' in unrated games to activate cheat.", "Type 'ASTEROID' in unrated games to activate cheat.", "Type 'PUMPKINS' in unrated games to activate cheat.", "Only active between the 28th of October and the 11th of November."};
    }
}
