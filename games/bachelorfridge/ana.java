/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ana extends at {
    taa field_m;
    static String[] field_j;
    ad field_n;
    private bca field_p;
    static String[] field_s;
    gj field_q;
    int field_l;
    static String[] field_t;
    static String[] field_u;
    static String[] field_k;
    static String[] field_o;
    static kv field_r;

    final static void a(int param0, String param1) {
        if (param0 != -1) {
            Object var3 = null;
            ana.a(75, (String) null);
        }
    }

    public static void d(byte param0) {
        field_t = null;
        field_u = null;
        field_r = null;
        field_o = null;
        field_k = null;
        if (param0 < 113) {
          field_k = null;
          field_s = null;
          field_j = null;
          return;
        } else {
          field_s = null;
          field_j = null;
          return;
        }
    }

    final void a(int param0, int param1, ad param2, int param3) {
        pp var5 = null;
        int var8 = 0;
        int var9 = 0;
        Object var16 = null;
        Object var17 = null;
        iv var17_ref = null;
        ad var18 = null;
        Object var19 = null;
        Object var21 = null;
        Object var22 = null;
        Object var23 = null;
        Object var25 = null;
        Object var26 = null;
        Object var27 = null;
        sl var27_ref = null;
        Object var28 = null;
        Object var30 = null;
        Object var31 = null;
        Object var32 = null;
        bm var32_ref = null;
        Object var33 = null;
        Object var35 = null;
        Object var36 = null;
        Object var37 = null;
        iv var37_ref = null;
        ad var38 = null;
        Object var39 = null;
        sl var39_ref = null;
        Object var40 = null;
        bm var40_ref = null;
        int stackIn_11_0 = 0;
        int stackIn_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var16 = null;
        var17 = null;
        var19 = null;
        var21 = null;
        var22 = null;
        var23 = null;
        var25 = null;
        var26 = null;
        var27 = null;
        var28 = null;
        var30 = null;
        var31 = null;
        var32 = null;
        var33 = null;
        var35 = null;
        var36 = null;
        var37 = null;
        var39 = null;
        var40 = null;
        var9 = BachelorFridge.field_y;
        if (param3 == 0) {
          var5 = (pp) (Object) ((ana) this).field_p.field_o.b((byte) 90);
          L0: while (true) {
            if (var5 != null) {
              L1: {
                if (!(var5 instanceof iv)) {
                  if (!(var5 instanceof sl)) {
                    if (var5 instanceof bm) {
                      var40_ref = (bm) (Object) var5;
                      if (var40_ref.field_k != param0) {
                        break L1;
                      } else {
                        if (param1 == var40_ref.field_l) {
                          var40_ref.a(param2.field_s, ((ana) this).field_q.field_h, 12);
                          var5.a(false);
                          return;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      var5 = (pp) (Object) ((ana) this).field_p.field_o.c(0);
                      continue L0;
                    }
                  } else {
                    var39_ref = (sl) (Object) var5;
                    if (param0 != var39_ref.field_i) {
                      break L1;
                    } else {
                      if (var39_ref.field_l != param1) {
                        break L1;
                      } else {
                        var39_ref.a(param2.field_s, ((ana) this).field_q.field_h, param3 + 12);
                        var5.a(false);
                        return;
                      }
                    }
                  }
                } else {
                  var37_ref = (iv) (Object) var5;
                  var38 = var37_ref.field_h.a(-27449, ((ana) this).field_q);
                  if (var38.field_s.field_x != param0) {
                    break L1;
                  } else {
                    if (var38.field_s.field_J != param1) {
                      break L1;
                    } else {
                      L2: {
                        if (var38.field_s.field_I <= 0) {
                          stackOut_39_0 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          break L2;
                        } else {
                          stackOut_38_0 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          break L2;
                        }
                      }
                      var8 = stackIn_40_0;
                      var5.a(param2.field_s, ((ana) this).field_q.field_h, 12);
                      if (var8 == 0) {
                        var5.a(false);
                        return;
                      } else {
                        var38.b(param3 + -1, 6);
                        ((ana) this).a(param3 ^ 27799, (at) (Object) new ek(((ana) this).field_q, var38, var37_ref.field_f));
                        var5.a(false);
                        return;
                      }
                    }
                  }
                }
              }
              var5 = (pp) (Object) ((ana) this).field_p.field_o.c(0);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          field_o = null;
          var5 = (pp) (Object) ((ana) this).field_p.field_o.b((byte) 90);
          L3: while (true) {
            if (var5 != null) {
              L4: {
                if (!(var5 instanceof iv)) {
                  if (!(var5 instanceof sl)) {
                    if (var5 instanceof bm) {
                      var32_ref = (bm) (Object) var5;
                      if (var32_ref.field_k != param0) {
                        break L4;
                      } else {
                        if (param1 == var32_ref.field_l) {
                          var32_ref.a(param2.field_s, ((ana) this).field_q.field_h, 12);
                          var5.a(false);
                          return;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      var5 = (pp) (Object) ((ana) this).field_p.field_o.c(0);
                      continue L3;
                    }
                  } else {
                    var27_ref = (sl) (Object) var5;
                    if (param0 != var27_ref.field_i) {
                      break L4;
                    } else {
                      if (var27_ref.field_l != param1) {
                        break L4;
                      } else {
                        var27_ref.a(param2.field_s, ((ana) this).field_q.field_h, param3 + 12);
                        var5.a(false);
                        return;
                      }
                    }
                  }
                } else {
                  var17_ref = (iv) (Object) var5;
                  var18 = var17_ref.field_h.a(-27449, ((ana) this).field_q);
                  if (var18.field_s.field_x != param0) {
                    break L4;
                  } else {
                    if (var18.field_s.field_J != param1) {
                      break L4;
                    } else {
                      L5: {
                        if (var18.field_s.field_I <= 0) {
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          break L5;
                        } else {
                          stackOut_9_0 = 1;
                          stackIn_11_0 = stackOut_9_0;
                          break L5;
                        }
                      }
                      var8 = stackIn_11_0;
                      var5.a(param2.field_s, ((ana) this).field_q.field_h, 12);
                      if (var8 == 0) {
                        var5.a(false);
                        return;
                      } else {
                        var18.b(param3 + -1, 6);
                        ((ana) this).a(param3 ^ 27799, (at) (Object) new ek(((ana) this).field_q, var18, var17_ref.field_f));
                        var5.a(false);
                        return;
                      }
                    }
                  }
                }
              }
              var5 = (pp) (Object) ((ana) this).field_p.field_o.c(0);
              continue L3;
            } else {
              return;
            }
          }
        }
    }

    ana(gj param0, bca param1) {
        ((ana) this).field_q = param0;
        ((ana) this).field_p = param1;
        ((ana) this).field_n = param1.field_l.a(-27449, ((ana) this).field_q);
        ((ana) this).field_m = new taa(((ana) this).field_q, ((ana) this).field_n);
        ((ana) this).a(27799, (at) (Object) ((ana) this).field_m);
        ((ana) this).field_n.a(16776960, 119, pk.a(param1, true));
        ((ana) this).field_l = 100;
        if (param1.field_p) {
            ((ana) this).field_n.a(16761024, 111, dc.field_o);
        }
        if (!((ana) this).field_n.field_s.a(param1.field_k, 9)) {
            // ifeq L185
            ((ana) this).field_n.field_s.d(119, (byte) -86);
        }
        ((ana) this).field_n.field_s.d(param1.field_k, (byte) -118);
        ((ana) this).field_n.field_s.d(param1.field_k, (byte) -118);
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int[] var11 = null;
        int var11_int = 0;
        int[] var12 = null;
        int var12_int = 0;
        int var13 = 0;
        var13 = BachelorFridge.field_y;
        var5 = 0;
        if (!param0) {
          return;
        } else {
          var6 = param3;
          var7 = -param3;
          var8 = -1;
          hba.a(param1, param2 - param3, tj.field_b[param4], 7, param2 - -param3);
          L0: while (true) {
            if (var6 <= var5) {
              return;
            } else {
              L1: {
                var8 += 2;
                var5++;
                var7 = var7 + var8;
                if ((var7 ^ -1) > -1) {
                  break L1;
                } else {
                  var6--;
                  var7 = var7 - (var6 << 467226657);
                  var9_ref_int__ = tj.field_b[param4 - -var6];
                  var10_ref_int__ = tj.field_b[param4 - var6];
                  var11_int = var5 + param2;
                  var12_int = param2 + -var5;
                  hba.a(param1, var12_int, var9_ref_int__, 7, var11_int);
                  hba.a(param1, var12_int, var10_ref_int__, 7, var11_int);
                  break L1;
                }
              }
              var9 = var6 + param2;
              var10 = param2 + -var6;
              var11 = tj.field_b[param4 + var5];
              var12 = tj.field_b[-var5 + param4];
              hba.a(param1, var10, var11, 7, var9);
              hba.a(param1, var10, var12, 7, var9);
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new String[]{"It's Alive!", "To evolve a creature place a food item into the fridge and watch it begin to go mouldy. Eventually a creature will evolve from the rotten food. You can then feed your creature other foodstuffs (depending on what it likes, watch for the thought bubbles). This will unlock other abilities that the creature has.", "Statistically Superior", "All creatures have 4 vital statistics that range from 0 (lowest) to 5 (highest).", "<col=BBFF00>Fisticuffs</col> - A higher stat boosts the damage of any close combat (red) attacks.", "<col=BBFF00>Flingstuff</col> - A higher stat boosts the damage of any ranged (blue) attacks.", "<col=BBFF00>Stamina</col> - A higher stat means the creature has more hit points.", "<col=BBFF00>Speed</col> - A higher stat increases movement distance (green abilities) and also means the creature can act before creatures with a lower speed."};
        field_j = new String[]{"Welcome to Bachelor Fridge!", "Like any self-respecting bachelor, you've never taken anything out of your fridge. Thus it should come as no surprise that the contents are beginning to lead a life of their own. In “Bachelor Fridge” you evolve creatures from rotting food, and then throw them into combat against creatures evolved by other players.", "This is your in-game view of your fridge.", "<col=BBFF00>The Freezer</col> - Drag and drop a creature here to store it. The fridge can only hold 8 active creatures.", "<col=BBFF00>The Shopping List</col> - Click to shop for more food.", "<col=BBFF00>The Magnifying Glass</col> - Click to change the cursor to a magnifying glass. You can then click on a creature to see its details.", "<col=BBFF00>The Shopping Bag</col> - Holds food you've purchased. Click to open the bag display, allowing you to drag and drop food into the fridge.", "<col=BBFF00>The Bin</col> - Grab, drag and drop a creature over the bin to permanently delete it. You can only do this if you have more than 4 creatures in your fridge and freezer combined.", "<col=BBFF00>The Arena Door</col> - Takes you to the multiplayer lobby to find or create a game."};
        field_k = new String[]{"Equipping Skills", "Use the magnifying glass to view a creature's profile. All creatures start with 2 skills equipped, a movement skill and a combat skill. You can equip and unequip skills by clicking on the skill icon in question. Mouse over the icon to see the ability's description. Creatures can have 5 different skills equipped at once.", "Super Skills", "Most skills are affected by the stats the creature has. The most powerful type of skill is the Special, and this is usually one of the last skills your creatures acquire. Each Special skill can only be used once per game and you can only use one special each turn. Experiment to find out what specials are available."};
        field_u = new String[]{"Rewards", "You earn <col=BBFF00>£5.00</col> for winning a rated game, and <col=BBFF00>£1.00</col> for an unrated game. Losing teams in a rated game receive <col=BBFF00>£1.00</col>. Losing an unrated game will only grant bonuses. Match awards grant a bonus <col=BBFF00>£0.20 each</col>.", "<col=BBFF00>Resigning</col> from a game will mean you get no money at all.", "<col=BBFF00>Drawing</col> a game simply gets you any bonus money awarded."};
        field_o = new String[]{"Arena Battles", "At the beginning of each match, select creatures that you want to use from the 8 available in your fridge. Frozen creatures cannot be used in the arena. Arena battles use a system of simultaneous plotted turns. You decide on the actions your creatures are going to perform at the same time as your opponent(s) choose their creatures' actions. These are then played out together in the order of the creatures' movement numbers. Movement actions are done in this manner, then combat actions. The trick of the game is to anticipate what your opponent is going to do, and plan your actions accordingly.", "Match Types", "The three match types are:", "<col=BBFF00>Annihilation</col> - Wipe out the other players' creatures.", "<col=BBFF00>Capture the Fly</col> - Capture the enemy's fly and drag it back to your fly. Best of 5, wins.", "<col=BBFF00>Take the Grub</col> - Hold the most grub tiles for 3 consecutive turns. Landing on a grub tile makes it yours, until an opponent lands on it."};
        field_t = new String[]{"Terrain", "There are three different types of match arena:", "The <col=BBFF00>pizza arena sauce</col> slows down all units moving across its surface, halving their movement range (rounded up).", "The <col=BBFF00>curry arena sauce</col> randomly explodes causing damage to creatures on the sauce tiles in question.", "The <col=BBFF00>ice-cream arena sauce</col> causes creatures to sometimes slip and slide when they move, randomly moving them 1 tile more or fewer than planned.", "Other terrain types", "<col=BBFF00>Open Terrain</col> - Completely open and has no modifiers.", "<col=BBFF00>Buff tiles</col> - Act like open tiles but each also confers a temporary beneficial effect to the first creature to stop on it.", "<col=BBFF00>Blocking tiles</col> - Block all movement and shooting through the space they occupy. Actions that travel over these tiles are unaffected.", "<col=BBFF00>Pits</col> - Instantly kill any creature that falls or gets pushed in."};
    }
}
