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
        RuntimeException runtimeException = null;
        String var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                var3 = (String) null;
                ana.a(75, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ana.O(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void d(byte param0) {
        field_t = null;
        field_u = null;
        field_r = null;
        field_o = null;
        field_k = null;
        if (param0 < 113) {
          field_k = (String[]) null;
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
        RuntimeException var5 = null;
        pp var5_ref = null;
        ad var7 = null;
        int var8 = 0;
        int var9 = 0;
        iv var10 = null;
        sl var11 = null;
        bm var12 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param3 == 0) {
                break L1;
              } else {
                field_o = (String[]) null;
                break L1;
              }
            }
            var5_ref = (pp) ((Object) this.field_p.field_o.b((byte) 90));
            L2: while (true) {
              if (var5_ref == null) {
                break L0;
              } else {
                L3: {
                  if (!(var5_ref instanceof iv)) {
                    if (!(var5_ref instanceof sl)) {
                      if (var5_ref instanceof bm) {
                        var12 = (bm) ((Object) var5_ref);
                        if (var12.field_k != param0) {
                          break L3;
                        } else {
                          if (param1 == var12.field_l) {
                            var12.a(param2.field_s, this.field_q.field_h, 12);
                            var5_ref.a(false);
                            return;
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        var5_ref = (pp) ((Object) this.field_p.field_o.c(0));
                        continue L2;
                      }
                    } else {
                      var11 = (sl) ((Object) var5_ref);
                      if (param0 != var11.field_i) {
                        break L3;
                      } else {
                        if (var11.field_l != param1) {
                          break L3;
                        } else {
                          var11.a(param2.field_s, this.field_q.field_h, param3 + 12);
                          var5_ref.a(false);
                          return;
                        }
                      }
                    }
                  } else {
                    var10 = (iv) ((Object) var5_ref);
                    var7 = var10.field_h.a(-27449, this.field_q);
                    if (var7.field_s.field_x != param0) {
                      break L3;
                    } else {
                      if (var7.field_s.field_J != param1) {
                        break L3;
                      } else {
                        L4: {
                          if (var7.field_s.field_I <= 0) {
                            stackOut_10_0 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            break L4;
                          } else {
                            stackOut_9_0 = 1;
                            stackIn_11_0 = stackOut_9_0;
                            break L4;
                          }
                        }
                        var8 = stackIn_11_0;
                        var5_ref.a(param2.field_s, this.field_q.field_h, 12);
                        if (var8 == 0) {
                          var5_ref.a(false);
                          return;
                        } else {
                          var7.b(param3 + -1, 6);
                          this.a(param3 ^ 27799, new ek(this.field_q, var7, var10.field_f));
                          var5_ref.a(false);
                          return;
                        }
                      }
                    }
                  }
                }
                var5_ref = (pp) ((Object) this.field_p.field_o.c(0));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var5);
            stackOut_30_1 = new StringBuilder().append("ana.M(").append(param0).append(',').append(param1).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param3 + ')');
        }
    }

    ana(gj param0, bca param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            this.field_q = param0;
            this.field_p = param1;
            this.field_n = param1.field_l.a(-27449, this.field_q);
            this.field_m = new taa(this.field_q, this.field_n);
            this.a(27799, this.field_m);
            this.field_n.a(16776960, 119, pk.a(param1, true));
            this.field_l = 100;
            if (!param1.field_p) {
              break L0;
            } else {
              this.field_n.a(16761024, 111, dc.field_o);
              break L0;
            }
          }
          if (this.field_n.field_s.a(param1.field_k, 9)) {
            this.field_n.field_s.d(param1.field_k, (byte) -118);
            return;
          } else {
            if (!this.field_n.field_s.a(119, 9)) {
              this.field_n.field_s.d(param1.field_k, (byte) -118);
              return;
            } else {
              this.field_n.field_s.d(119, (byte) -86);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("ana.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          L2: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            var5_int = 0;
            if (param0) {
              var6 = param3;
              var7 = -param3;
              var8 = -1;
              hba.a(param1, param2 - param3, tj.field_b[param4], 7, param2 - -param3);
              L1: while (true) {
                if (var6 <= var5_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var8 += 2;
                    var5_int++;
                    var7 = var7 + var8;
                    if ((var7 ^ -1) > -1) {
                      break L2;
                    } else {
                      var6--;
                      var7 = var7 - (var6 << 467226657);
                      var9_ref_int__ = tj.field_b[param4 - -var6];
                      var10_ref_int__ = tj.field_b[param4 - var6];
                      var11_int = var5_int + param2;
                      var12_int = param2 + -var5_int;
                      hba.a(param1, var12_int, var9_ref_int__, 7, var11_int);
                      hba.a(param1, var12_int, var10_ref_int__, 7, var11_int);
                      break L2;
                    }
                  }
                  var9 = var6 + param2;
                  var10 = param2 + -var6;
                  var11 = tj.field_b[param4 + var5_int];
                  var12 = tj.field_b[-var5_int + param4];
                  hba.a(param1, var10, var11, 7, var9);
                  hba.a(param1, var10, var12, 7, var9);
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var5), "ana.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_s = new String[]{"It's Alive!", "To evolve a creature place a food item into the fridge and watch it begin to go mouldy. Eventually a creature will evolve from the rotten food. You can then feed your creature other foodstuffs (depending on what it likes, watch for the thought bubbles). This will unlock other abilities that the creature has.", "Statistically Superior", "All creatures have 4 vital statistics that range from 0 (lowest) to 5 (highest).", "<col=BBFF00>Fisticuffs</col> - A higher stat boosts the damage of any close combat (red) attacks.", "<col=BBFF00>Flingstuff</col> - A higher stat boosts the damage of any ranged (blue) attacks.", "<col=BBFF00>Stamina</col> - A higher stat means the creature has more hit points.", "<col=BBFF00>Speed</col> - A higher stat increases movement distance (green abilities) and also means the creature can act before creatures with a lower speed."};
        field_j = new String[]{"Welcome to Bachelor Fridge!", "Like any self-respecting bachelor, you've never taken anything out of your fridge. Thus it should come as no surprise that the contents are beginning to lead a life of their own. In “Bachelor Fridge” you evolve creatures from rotting food, and then throw them into combat against creatures evolved by other players.", "This is your in-game view of your fridge.", "<col=BBFF00>The Freezer</col> - Drag and drop a creature here to store it. The fridge can only hold 8 active creatures.", "<col=BBFF00>The Shopping List</col> - Click to shop for more food.", "<col=BBFF00>The Magnifying Glass</col> - Click to change the cursor to a magnifying glass. You can then click on a creature to see its details.", "<col=BBFF00>The Shopping Bag</col> - Holds food you've purchased. Click to open the bag display, allowing you to drag and drop food into the fridge.", "<col=BBFF00>The Bin</col> - Grab, drag and drop a creature over the bin to permanently delete it. You can only do this if you have more than 4 creatures in your fridge and freezer combined.", "<col=BBFF00>The Arena Door</col> - Takes you to the multiplayer lobby to find or create a game."};
        field_k = new String[]{"Equipping Skills", "Use the magnifying glass to view a creature's profile. All creatures start with 2 skills equipped, a movement skill and a combat skill. You can equip and unequip skills by clicking on the skill icon in question. Mouse over the icon to see the ability's description. Creatures can have 5 different skills equipped at once.", "Super Skills", "Most skills are affected by the stats the creature has. The most powerful type of skill is the Special, and this is usually one of the last skills your creatures acquire. Each Special skill can only be used once per game and you can only use one special each turn. Experiment to find out what specials are available."};
        field_u = new String[]{"Rewards", "You earn <col=BBFF00>£5.00</col> for winning a rated game, and <col=BBFF00>£1.00</col> for an unrated game. Losing teams in a rated game receive <col=BBFF00>£1.00</col>. Losing an unrated game will only grant bonuses. Match awards grant a bonus <col=BBFF00>£0.20 each</col>.", "<col=BBFF00>Resigning</col> from a game will mean you get no money at all.", "<col=BBFF00>Drawing</col> a game simply gets you any bonus money awarded."};
        field_o = new String[]{"Arena Battles", "At the beginning of each match, select creatures that you want to use from the 8 available in your fridge. Frozen creatures cannot be used in the arena. Arena battles use a system of simultaneous plotted turns. You decide on the actions your creatures are going to perform at the same time as your opponent(s) choose their creatures' actions. These are then played out together in the order of the creatures' movement numbers. Movement actions are done in this manner, then combat actions. The trick of the game is to anticipate what your opponent is going to do, and plan your actions accordingly.", "Match Types", "The three match types are:", "<col=BBFF00>Annihilation</col> - Wipe out the other players' creatures.", "<col=BBFF00>Capture the Fly</col> - Capture the enemy's fly and drag it back to your fly. Best of 5, wins.", "<col=BBFF00>Take the Grub</col> - Hold the most grub tiles for 3 consecutive turns. Landing on a grub tile makes it yours, until an opponent lands on it."};
        field_t = new String[]{"Terrain", "There are three different types of match arena:", "The <col=BBFF00>pizza arena sauce</col> slows down all units moving across its surface, halving their movement range (rounded up).", "The <col=BBFF00>curry arena sauce</col> randomly explodes causing damage to creatures on the sauce tiles in question.", "The <col=BBFF00>ice-cream arena sauce</col> causes creatures to sometimes slip and slide when they move, randomly moving them 1 tile more or fewer than planned.", "Other terrain types", "<col=BBFF00>Open Terrain</col> - Completely open and has no modifiers.", "<col=BBFF00>Buff tiles</col> - Act like open tiles but each also confers a temporary beneficial effect to the first creature to stop on it.", "<col=BBFF00>Blocking tiles</col> - Block all movement and shooting through the space they occupy. Actions that travel over these tiles are unaffected.", "<col=BBFF00>Pits</col> - Instantly kill any creature that falls or gets pushed in."};
    }
}
