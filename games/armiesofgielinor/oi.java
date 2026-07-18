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
        try {
            field_d = null;
            field_c = null;
            field_b = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "oi.A(" + param0 + ')');
        }
    }

    final static af a(String param0, String param1, boolean param2, int param3, long param4) {
        RuntimeException var6 = null;
        oq stackIn_10_0 = null;
        eq stackIn_12_0 = null;
        wv stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        eq stackOut_11_0 = null;
        oq stackOut_9_0 = null;
        wv stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (param4 != 0L) {
                break L1;
              } else {
                if (param0 != null) {
                  stackOut_11_0 = new eq(param0, param1);
                  stackIn_12_0 = stackOut_11_0;
                  return (af) (Object) stackIn_12_0;
                } else {
                  break L1;
                }
              }
            }
            if (param2) {
              stackOut_9_0 = new oq(param4, param1);
              stackIn_10_0 = stackOut_9_0;
              return (af) (Object) stackIn_10_0;
            } else {
              L2: {
                if (param3 == 1) {
                  break L2;
                } else {
                  oi.b(true);
                  break L2;
                }
              }
              stackOut_16_0 = new wv(param4, param1);
              stackIn_17_0 = stackOut_16_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("oi.D(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L3;
            }
          }
          L4: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return (af) (Object) stackIn_17_0;
    }

    final static void a(boolean param0) {
        if (!sa.a(76)) {
            return;
        }
        try {
            vq.a(4, param0, (byte) 61);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "oi.B(" + param0 + ')');
        }
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        wk var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var6_int = param1 - -param0.field_B;
              if (param2 <= -79) {
                break L1;
              } else {
                ((oi) this).a((kb) null, 118, -124, false, 7);
                break L1;
              }
            }
            L2: {
              var7 = param0.field_p + param4;
              qq.a(param0.field_l, var6_int, param0.field_w, -52, var7);
              var8 = db.field_a[1];
              if (!(param0 instanceof fw)) {
                break L2;
              } else {
                if (!((fw) (Object) param0).field_K) {
                  break L2;
                } else {
                  var8.f((param0.field_l + -var8.field_A >> -1065009247) + (1 + var6_int), (-var8.field_x + param0.field_w >> -496539551) + (1 + var7), 256);
                  break L2;
                }
              }
            }
            L3: {
              if (param0.a(false)) {
                na.c(param0.field_l - 4, var6_int + 2, 124, -4 + param0.field_w, 2 + var7);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("oi.C(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
