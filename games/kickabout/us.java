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

    final static int a() {
        return ck.field_d;
    }

    final static void g() {
        Object var1 = null;
        int var2 = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        if (null == et.field_d) {
          return;
        } else {
          int discarded$3 = -92;
          kb.h();
          if (mc.field_a != 0) {
            L0: {
              var1 = null;
              int discarded$4 = 0;
              var2 = je.a();
              if (var2 != -1) {
                var1 = (Object) (Object) rr.field_g[var2];
                break L0;
              } else {
                break L0;
              }
            }
            ul.a((byte) -126, (String) var1);
            if (-1 != var2) {
              if (dd.field_f >= 60) {
                return;
              } else {
                L1: {
                  var3 = ep.field_c[var2];
                  var4 = pb.field_C.b(var3, mc.field_a + -44);
                  if (dd.field_f > 0) {
                    L2: {
                      var6 = 60;
                      var7 = dd.field_f;
                      if (var3.length() < 70) {
                        var6 = 10;
                        var7 = Math.max(0, var6 - (60 - var7));
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var8 = (-var7 + var6) * var3.length() / var6;
                    var3 = var3.substring(0, var8);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (var4 == 1) {
                    stackOut_21_0 = 16;
                    stackIn_22_0 = stackOut_21_0;
                    break L3;
                  } else {
                    if (var4 == 2) {
                      stackOut_20_0 = 6;
                      stackIn_22_0 = stackOut_20_0;
                      break L3;
                    } else {
                      stackOut_19_0 = 0;
                      stackIn_22_0 = stackOut_19_0;
                      break L3;
                    }
                  }
                }
                var5 = stackIn_22_0;
                var3 = wj.a("</>", "</shad></col>", true, wj.a("<>", "<col=ffff00><shad=010101>", true, var3));
                int discarded$5 = pb.field_C.a(var3, (-mc.field_a + 640 >> 1) - -72, -10 + (var5 - -458) + -48, -44 + mc.field_a - 50, 48, 16777215, -1, 0, 0, 16);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void f() {
        field_h = null;
        field_f = null;
        field_g = null;
        field_i = null;
        int var1 = 0;
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
