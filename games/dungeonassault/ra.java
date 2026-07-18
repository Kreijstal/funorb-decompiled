/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    private int[] field_d;
    static String field_a;
    static wj field_c;
    static int[] field_b;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        var3 = -1 + (((ra) this).field_d.length >> 1);
        var4 = var3 & param0;
        if (param1 <= -115) {
          L0: while (true) {
            var5 = ((ra) this).field_d[1 + var4 + var4];
            if (var5 != -1) {
              if (((ra) this).field_d[var4 - -var4] != param0) {
                var4 = var3 & var4 + 1;
                continue L0;
              } else {
                return var5;
              }
            } else {
              return -1;
            }
          }
        } else {
          return -109;
        }
    }

    public static void a() {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = DungeonAssault.field_K;
          int discarded$9 = -103;
          jj.b();
          var1 = lc.a(hj.field_S, (byte) -98, eh.field_h);
          if (var1 == ak.field_n) {
            break L0;
          } else {
            ak.field_n = var1;
            if (var1 == -1) {
              fj.field_f = null;
              break L0;
            } else {
              fj.field_f = new rh(0, 0, 40, 80, 255, 197376, 224);
              break L0;
            }
          }
        }
        L1: {
          int discarded$10 = -102;
          ra.b();
          if (1 == no.field_d) {
            var2 = lc.a(lc.field_c, (byte) -94, hm.field_k);
            if (var2 == kg.field_f) {
              um.field_g = null;
              kg.field_f = -1;
              break L1;
            } else {
              if (var2 != -1) {
                kg.field_f = var2;
                um.field_g = new rh(0, 0, 40, 80, 16711680, 768, 224);
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            break L1;
          }
        }
    }

    final static void c() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              jh.c();
              if (im.field_e == null) {
                im.field_e = new cn(394, 296);
                im.field_e.field_A = -8;
                im.field_e.field_w = -8;
                break L1;
              } else {
                break L1;
              }
            }
            im.field_e.e();
            gf.a();
            var1_int = 0;
            L2: while (true) {
              if (var1_int >= 7) {
                var1_int = 7;
                L3: while (true) {
                  if (var1_int >= 13) {
                    gf.d(2, 2, 0, 0, im.field_e.field_y, im.field_e.field_v);
                    jh.b();
                    break L0;
                  } else {
                    var2 = 27 * (-6 + var1_int) + 8;
                    var3 = var1_int * 20 + 8;
                    var4 = var1_int * 7 - 42;
                    var5 = 0;
                    L4: while (true) {
                      if (13 + -var1_int <= var5) {
                        var1_int++;
                        continue L3;
                      } else {
                        jm.a(var3, var4, 3, var2);
                        var5++;
                        var2 += 54;
                        var4 += 8;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var2 = -19 + (-(var1_int * 27) + 189);
                var3 = 20 * var1_int + 8;
                var4 = -var1_int + 6;
                var5 = 0;
                L5: while (true) {
                  if (var5 >= 1 + var1_int) {
                    var1_int++;
                    continue L2;
                  } else {
                    jm.a(var3, var4, 3, var2);
                    var5++;
                    var4 += 8;
                    var2 += 54;
                    continue L5;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "ra.A(" + 8 + ')');
        }
    }

    ra(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (var2_int > param0.length - -(param0.length >> 1)) {
                ((ra) this).field_d = new int[var2_int - -var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int + var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = var2_int + -1 & param0[var3];
                        L4: while (true) {
                          if (((ra) this).field_d[var4 + (var4 - -1)] == -1) {
                            ((ra) this).field_d[var4 + var4] = param0[var3];
                            ((ra) this).field_d[var4 + (var4 + 1)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = -1 + var2_int & 1 + var4;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((ra) this).field_d[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("ra.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final static void b() {
        ha.field_k = new lc(ia.field_W, ll.field_r);
        cf discarded$0 = hd.a(false, 30, "menu_select");
        sa.field_v = sh.a(-77, "da_ambience_drip", new int[5]);
        hp.field_c = sh.a(-95, "da_ambience_insect", new int[3]);
        dc.field_q = sh.a(-83, "da_door_open", new int[2]);
        om.field_b = hd.a(false, 140, "da_ambience_burning_torches_loop_4000ms");
        k.field_f = hd.a(false, 256, "da_ambience_running_water_loop_1000ms");
        mh.field_f = hd.a(false, 51, "da_menu_fire");
        qm.field_n = hd.a(false, 256, "da_gold_stealing");
        eb.field_O = sh.a(-62, "da_gold_bar", new int[4]);
        bc.field_b = hd.a(false, 256, "da_dice_roll_dry");
        ef.field_d = hd.a(false, 171, "da_hoardroom_angry_dragon");
        u.field_T = new cf[9];
        u.field_T[0] = hd.a(false, 256, "01-the land of dungaria");
        u.field_T[1] = hd.a(false, 256, "02-once it was a battlefield");
        u.field_T[2] = hd.a(false, 256, "03-the world itself was in danger");
        u.field_T[3] = hd.a(false, 256, "04-now the dragons sleep");
        u.field_T[4] = hd.a(false, 256, "05-but still they battle");
        u.field_T[5] = hd.a(false, 256, "06-thru the life and death of others");
        u.field_T[6] = hd.a(false, 256, "07-take upon yourself");
        u.field_T[7] = hd.a(false, 256, "08-defend your hoard");
        u.field_T[8] = hd.a(false, 256, "09-become the dragon king");
        ed.a("goblin_defeat", 139, 1, 31353, "goblin_runt_reveal", 136);
        bf.a(256, 2, 256, -18228, "saurus");
        ed.a("goblin_defeat", 139, 3, 31353, "goblin_cleaver_reveal", 125);
        bf.a(197, 4, 170, -18228, "ork");
        to.a(119, -116, 136, 140, "witch", 5);
        bf.a(125, 6, 115, -18228, "beastman");
        kn.a(256, "saurus_defeat", 7, 256, 124, 256, "saurus_reveal", "saurus_reveal");
        bf.a(146, 8, 197, -18228, "mercenary_knight");
        to.a(150, -78, 150, 146, "priest", 9);
        bf.a(170, 10, 197, -18228, "ork");
        kn.a(140, "goblin_defeat", 11, 139, 126, 138, "goblin_scout_special", "goblin_scout_reveal");
        to.a(120, -126, 120, 159, "necromancer", 12);
        bf.a(200, 13, 200, -18228, "ogre");
        to.a(138, -110, 214, 134, "enchantress", 14);
        bf.a(256, 15, 256, -18228, "saurus");
        ed.a("ork_defeat", 197, 16, 31353, "ork_reveal", 170);
        kn.a(165, "troll_defeat", 17, 149, 127, 165, "troll_reveal", "troll_reveal");
        to.a(160, -128, 134, 130, "northman_ranger", 18);
        to.a(100, -120, 146, 134, "dwarf_renegade", 19);
        bf.a(139, 20, 200, -18228, "thief");
        bf.a(171, 21, 156, -18228, "zealot");
        bf.a(156, 22, 125, -18228, "darkelf_assassin");
        bf.a(138, 23, 148, -18228, "baerserker");
        bf.a(200, 24, 200, -18228, "ogre");
        bf.a(200, 25, 155, -18228, "spy");
        to.a(138, -93, 137, 135, "shapeshifter", 26);
        bf.a(150, 27, 164, -18228, "black_knight");
        bf.a(186, 28, 196, -18228, "minotaur");
        to.a(119, -126, 136, 140, "warlock", 29);
        bf.a(172, 30, 173, -18228, "death_knight");
        bf.a(147, 31, 200, -18228, "chaos_champion");
        bf.a(74, 33, 73, -18228, "daemonette");
        to.a(190, -99, 198, 197, "dryad", 34);
        int discarded$1 = -1;
        ki.a(90, 15, 100, "giant_rats");
        int discarded$2 = -1;
        ki.a(125, 16, 76, "rot_worms");
        int discarded$3 = -1;
        ki.a(175, 17, 134, "troglodyte");
        int discarded$4 = -1;
        ki.a(110, 18, 110, "giant_snake");
        int discarded$5 = -1;
        ki.a(89, 19, 89, "giant_spider");
        int discarded$6 = -1;
        ki.a(201, 20, 102, "skeleton_sentinals");
        int discarded$7 = -1;
        ki.a(150, 21, 141, "corrosive_slime");
        int discarded$8 = -1;
        ki.a(100, 22, 83, "razor_construct");
        int discarded$9 = -1;
        ki.a(135, 23, 120, "rabid_wolf");
        int discarded$10 = -1;
        ki.a(112, 24, 109, "vampire_bat");
        int discarded$11 = -1;
        ki.a(180, 25, 91, "imp");
        int discarded$12 = -1;
        ki.a(200, 26, 120, "stone_golem");
        int discarded$13 = -1;
        ki.a(135, 27, 119, "spectre");
        int discarded$14 = -1;
        ki.a(42, 28, 57, "banshee");
        int discarded$15 = -1;
        ki.a(197, 29, 133, "raging_beast");
        int discarded$16 = -1;
        ki.a(147, 30, 143, "basilisk");
        int discarded$17 = -1;
        ki.a(99, 31, 125, "pit_demon");
        int discarded$18 = -1;
        ki.a(114, 32, 114, "vampire_lord");
        int discarded$19 = -1;
        ki.a(103, 33, 116, "hell_beast");
        int discarded$20 = -1;
        ki.a(97, 34, 100, "demon_lord");
        fi.a(160, -51, "tripwire_bell", 35);
        fi.a(60, 124, "hallofglass", 36);
        fi.a(58, 110, "magical_guardian", 37);
        lg.a(63, 200, "hidden_pit", 4);
        lg.a(63, 125, "snakes", 5);
        lg.a(63, 178, "hidden_nails", 6);
        lg.a(63, 200, "hidden_pit", 7);
        lg.a(63, 145, "teleport", 8);
        lg.a(63, 178, "hidden_nails", 9);
        lg.a(63, 150, "bottomless_pit", 10);
        lg.a(63, 194, "crusher", 11);
        lg.a(63, 180, "crossbow", 12);
        lg.a(63, 74, "whirling_blades", 13);
        lg.a(63, 117, "poison_gas", 14);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "There is a bounty on this dungeon of <%0> Treasure.<br>(Dragon wakes: +<%1>%)<br>(Renown gambled: <%2>)";
        field_b = new int[8192];
    }
}
