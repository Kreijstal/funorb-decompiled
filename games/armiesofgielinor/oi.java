/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi implements kh {
    static String field_b;
    static tp field_d;
    static String[] field_a;
    static dd field_c;

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static af a(String param0, String param1, boolean param2, int param3, long param4) {
        if (-1L != (param4 ^ -1L)) {
          if (param2) {
            return (af) (Object) new oq(param4, param1);
          } else {
            if (param3 != 1) {
              oi.b(true);
              return (af) (Object) new wv(param4, param1);
            } else {
              return (af) (Object) new wv(param4, param1);
            }
          }
        } else {
          if (param0 == null) {
            if (param2) {
              return (af) (Object) new oq(param4, param1);
            } else {
              if (param3 == 1) {
                return (af) (Object) new wv(param4, param1);
              } else {
                oi.b(true);
                return (af) (Object) new wv(param4, param1);
              }
            }
          } else {
            return (af) (Object) new eq(param0, param1);
          }
        }
    }

    final static void a(boolean param0) {
        if (!sa.a(76)) {
            return;
        }
        vq.a(4, param0, (byte) 61);
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        Object var9 = null;
        wk var10 = null;
        wk var11 = null;
        var6 = param1 - -param0.field_B;
        if (param2 <= -79) {
          var7 = param0.field_p + param4;
          qq.a(param0.field_l, var6, param0.field_w, -52, var7);
          var11 = db.field_a[1];
          if (param0 instanceof fw) {
            if (!((fw) (Object) param0).field_K) {
              L0: {
                if (param0.a(false)) {
                  na.c(param0.field_l - 4, var6 + 2, 124, -4 + param0.field_w, 2 + var7);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var11.f((param0.field_l + -var11.field_A >> -1065009247) + (1 + var6), (-var11.field_x + param0.field_w >> -496539551) + (1 + var7), 256);
                if (param0.a(false)) {
                  na.c(param0.field_l - 4, var6 + 2, 124, -4 + param0.field_w, 2 + var7);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (param0.a(false)) {
                na.c(param0.field_l - 4, var6 + 2, 124, -4 + param0.field_w, 2 + var7);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          var9 = null;
          ((oi) this).a((kb) null, 118, -124, false, 7);
          var7 = param0.field_p + param4;
          qq.a(param0.field_l, var6, param0.field_w, -52, var7);
          var10 = db.field_a[1];
          if (param0 instanceof fw) {
            if (!((fw) (Object) param0).field_K) {
              L3: {
                if (param0.a(false)) {
                  na.c(param0.field_l - 4, var6 + 2, 124, -4 + param0.field_w, 2 + var7);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              L4: {
                var10.f((param0.field_l + -var10.field_A >> -1065009247) + (1 + var6), (-var10.field_x + param0.field_w >> -496539551) + (1 + var7), 256);
                if (param0.a(false)) {
                  na.c(param0.field_l - 4, var6 + 2, 124, -4 + param0.field_w, 2 + var7);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            }
          } else {
            L5: {
              if (param0.a(false)) {
                na.c(param0.field_l - 4, var6 + 2, 124, -4 + param0.field_w, 2 + var7);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "The jade vine clones itself automatically.";
        field_a = new String[]{"Complete the tutorial.", "Play a Rated game.", "Win a Rated game.", "Win a Rated game using only Saradomin and neutral units. <br>(devotee Achievement)", "Win a Rated game using only Zamorak and neutral units. <br>(devotee Achievement)", "Win a Rated game using only Guthix and neutral units. <br>(devotee Achievement)", "Win a Rated game using only Seren and neutral units. <br>(devotee Achievement)", "Win a Rated game using only Bandos and neutral units. <br>(devotee Achievement)", "Win a Rated game using only Menaphite pantheon and neutral units. <br>(devotee Achievement)", "Win a Rated game with all gods on the same favour level (favour level must be greater than one).", "Level a monk up to <%0> strength in a Rated game.", "Use all level 5 units for your chosen gods in a Rated game.", "Win a two-player Rated game with no gods in common with your opponent.", "Have 25 animated skeletons on the map at once in a Rated game.", "Obtain all units for all gods.", "Defeat the King Black Dragon in open combat in a Rated game.", "Win a Rated game without losing a unit.", "Win five Rated games without using flying units.", "Win a Rated free for all game with six or more players.", "Win five Rated free for all games with six or more players.", "Win ten Rated free for all games with six or more players.", "Win a game with all your gods' favour levels at one (neutral can be higher than one).", "Win a Rated game without losing your barbarian chieftain.", "Kill an enemy unit using the crystalline shapeshifter's special ability.", "Win a Rated Team Game in which the teams have no gods in common.", "Win a four-player Rated game in which you have no gods in common with your teammate.", "Win five Rated Team Games.", "Kill an enemy unit with a teammate's unit, using the sphinx's special ability.", "Win a Rated Team Game as the only remaining member of your team.", "Win a Rated game in which one of your teammates gets less than 10% of your team's kills. (The dead weight player does not get the Achievement.)", "Win a Rated Team Game in which you and your teammates all use the units of only one god (and not the same god).", "Have every player in your team use the same temporary portal at least once after it is opened by one of your team's portal mages.", "Use barbarians, werewolves, skeletons, necromancers and no other units to win a Rated game during Hallowe'en.", "Win 4 Rated games on Misthalin maps.", "Win 4 Rated games on Kharidian Desert maps.", "Win 4 Rated games on Frozen Wastes maps.", "Win 4 Rated games on Hallowvale Swamps maps.", "Win 4 Rated games on Forinthry Barrens maps.", "Complete a mission from the Zamorak Returns campaign without losing a single unit.", "Achieve a silver medal score on all missions in the Zamorak Returns campaign.", "Achieve a gold medal score on all missions in the Zamorak Returns campaign.", "Dethrone Efaritay and take over Hallowvale.", "Reach the eastern shores and conquer the port there.", "Bring down the last Zarosian resistance at Senntisten.", "Protect the dwarves in Ice Mountain from the wrath of the Blue Dragons.", "Achieve a silver medal score on all missions in the Saradomin Strikes campaign.", "Achieve a gold medal score on all missions in the Saradomin Strikes campaign.", "Siege and conquer the fortress of Peddewa.", "March the Brothers across the bridge over the Lum.", "Beat the other gods to it and take over the Zaros Temple!", "Defeat Riled Coyote with Path Sprinter.", "Achieve a silver medal score on all missions in the Guthix Awakens campaign.", "Achieve a gold medal score on all missions in the Guthix Awakens campaign.", "Take the Seat of Bandos.", "Drive Flametongue away.", "Banish all other Gods from Gielinor, bringing the 3rd age to a close."};
    }
}
