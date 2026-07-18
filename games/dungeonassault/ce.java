/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends kl {
    private pp field_n;
    static eh field_v;
    static long field_s;
    private pp field_r;
    static int field_p;
    static String[] field_q;
    static String field_m;
    static String field_t;
    static int field_x;
    static String[] field_o;
    static int field_w;
    StringBuilder field_u;

    public static void d(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_m = null;
              field_v = null;
              field_o = null;
              if (param0 == 58) {
                break L1;
              } else {
                field_p = 90;
                break L1;
              }
            }
            field_t = null;
            field_q = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "ce.C(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              super.b(-51);
              var2_int = (((ce) this).field_a >> -1449249503) + ((ce) this).field_k;
              var3 = ((ce) this).field_j - -10;
              ne.field_c.c(hb.field_l.toUpperCase(), var2_int, var3 - -ne.field_c.field_H, 16777215, -1);
              var3 = var3 + ne.field_c.field_H;
              int discarded$1 = la.field_b.a(hl.field_k, 20 + ((ce) this).field_k, var3, -40 + ((ce) this).field_a, ((ce) this).field_i + ((ce) this).field_j + -var3 - (24 - -(jm.field_i.field_v * 2)), 16777215, -1, 1, 1, la.field_b.field_H);
              var4 = ((ce) this).field_k + (((ce) this).field_a + -200 >> 1034248321);
              var5 = 60 + var3;
              var6 = -121 / ((41 - param0) / 63);
              gf.b(-4 + var4, -4 + var5, 208, 28, 0);
              rp.a(4, 200, (byte) 108, var4, 20, kc.field_S, var5);
              if (((ce) this).field_u == null) {
                break L1;
              } else {
                L2: {
                  var7 = ((ce) this).field_u.toString();
                  if ((1 & mo.field_a / 25) != 0) {
                    break L2;
                  } else {
                    var7 = var7 + "|";
                    break L2;
                  }
                }
                L3: {
                  if (((ce) this).field_u.length() > 12) {
                    stackOut_6_0 = 16711680;
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_4_0 = 16777215;
                    stackIn_7_0 = stackOut_4_0;
                    break L3;
                  }
                }
                var8 = stackIn_7_0;
                la.field_b.b(var7, var4, (la.field_b.field_H + 20 >> -1174881279) + var5, var8, -1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "ce.F(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              L2: {
                if (mm.field_t != 84) {
                  break L2;
                } else {
                  ((ce) this).field_d = true;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (mm.field_t != 13) {
                  break L3;
                } else {
                  ((ce) this).field_u = null;
                  ((ce) this).field_d = true;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (85 == mm.field_t) {
                  break L4;
                } else {
                  if (((ce) this).field_u.length() >= 12) {
                    break L1;
                  } else {
                    if (pe.a((CharSequence) (Object) ((ce) this).field_u, ob.field_Yb, (byte) -105)) {
                      StringBuilder discarded$2 = ((ce) this).field_u.append(ob.field_Yb);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
              if (((ce) this).field_u.length() <= 0) {
                break L1;
              } else {
                StringBuilder discarded$3 = am.a(((ce) this).field_u, ' ', -1 + ((ce) this).field_u.length(), false);
                break L1;
              }
            }
            L5: {
              if (!param0) {
                break L5;
              } else {
                field_v = null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "ce.N(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0);
              if (null != hh.field_s) {
                L2: {
                  if ((Object) (Object) ((ce) this).field_n == (Object) (Object) hh.field_s) {
                    ((ce) this).field_u = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((ce) this).field_d = true;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "ce.A(" + param0 + ')');
        }
    }

    ce(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((ce) this).field_u = new StringBuilder(param0);
            var2_int = 88 + 2 * jm.field_i.field_v + oj.a(hl.field_k, -1, new int[1], (se) (Object) la.field_b) * la.field_b.field_H;
            ((ce) this).a(350, 0, var2_int);
            ((ce) this).field_d = false;
            ((ce) this).field_r = tn.a(((ce) this).field_k - -10 + (-10 + (((ce) this).field_a >> -1528287295) + -jm.field_i.field_y >> -1813890591), ((ce) this).field_i + (((ce) this).field_j + -16) + -jm.field_i.field_v, (se) (Object) ne.field_c, jm.field_i, -85, hb.field_l);
            ((ce) this).field_n = tn.a((-jm.field_i.field_y + (((ce) this).field_a >> -1154861215) + -10 >> -536053375) + (((ce) this).field_a >> -319598591) + ((ce) this).field_k, ((ce) this).field_i + ((ce) this).field_j + (-16 - jm.field_i.field_v), (se) (Object) ne.field_c, jm.field_i, -125, be.field_r);
            ((ce) this).field_f.a((ne) (Object) ((ce) this).field_r, false);
            ((ce) this).field_f.a((ne) (Object) ((ce) this).field_n, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("ce.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Snakes";
        field_t = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_o = new String[]{"Goblin Chieftain", "Orc Warlord", "Raider Newt", "Raider Lizard", "Raider Drake", "Raider Dragon", "Feared Raider", "Heroic Raider", "Defender Newt", "Defender Lizard", "Defender Drake", "Defender Dragon", "Vengeful Dragon", "Tyrannical Dragon", "Cartographer", "Renowned Dragon", "Persistence", "Price of Greed", "Bounty Hunter", "Great Raider", "Great Defender", "Plunder", "Consummate Dragon", "Glorious Raider", "Glorious Defender", "Gold Standing", "Dragon's Engineering", "Dragon's Empathy", "Draconic Heist", "Ransack", "Arcane Mastery", "Majestic Raider", "Majestic Defender", "Platinum Standing", "Dragon's Determination", "Dragon's Scheming", "Dragon's Daring", "Dragon's Triumph", "Aristocrat", "Dragon's Wrath", "Dragon's Hoard", "Dragon's Riches", "Creature of Habit", "Dungeon Assault Bronze", "Dungeon Assault Silver", "Dungeon Assault Gold"};
        field_q = new String[]{"<%0> the Black", "<%0> the White", "<%0> the Good", "<%0> the Evil", "<%0> Flameclaw", "<%0> Ironscale", "<%0> Orcbane", "<%0> the Ascendant", "<%0> the Wanderer", "<%0>, Winged Terror", "<%0> the Deceitful", "<%0>, Disciple of Night", "<%0>, Servant of Dawn", "<%0> Demonfire", "<%0>, Kindler of Hatred", "<%0>, Agent of Malice"};
    }
}
