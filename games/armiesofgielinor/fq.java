/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class fq {
    int field_m;
    int field_e;
    int field_b;
    int field_j;
    byte[] field_l;
    int field_d;
    static String field_a;
    static fa field_h;
    int field_i;
    static String[] field_f;
    byte[] field_g;
    static String field_k;
    int field_c;

    final static uv a(int param0) {
        RuntimeException var1 = null;
        uv stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        uv stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 18757) {
                break L1;
              } else {
                String discarded$2 = fq.a((byte) 23, -125L);
                break L1;
              }
            }
            stackOut_3_0 = ig.field_n;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "fq.G(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 84) {
                break L1;
              } else {
                String discarded$2 = fq.a(-122, (String) null, true, (String) null);
                break L1;
              }
            }
            field_k = null;
            field_h = null;
            field_f = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "fq.C(" + param0 + ')');
        }
    }

    final static void a(at param0, String param1, int param2, boolean param3) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        sq var9 = null;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = rs.field_n.a(param1) + 8;
                if (var4_int <= 200) {
                  break L2;
                } else {
                  var5 = new String[rs.field_n.c(param1, 196)];
                  int discarded$3 = rs.field_n.a(param1, new int[1], var5);
                  if (var10 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = new String[]{param1};
              break L1;
            }
            var6 = var5;
            var7 = param2;
            L3: while (true) {
              L4: {
                L5: {
                  if (~var6.length >= ~var7) {
                    break L5;
                  } else {
                    var8 = var6[var7];
                    var9 = new sq(var8, param3, param0);
                    param0.a((byte) -119, (tc) (Object) var9);
                    var7++;
                    if (var10 != 0) {
                      break L4;
                    } else {
                      if (var10 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("fq.A(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L6;
            }
          }
          L7: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(byte param0, long param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            ql.field_c.setTime(new Date(param1));
            var3_int = ql.field_c.get(7);
            var4 = ql.field_c.get(5);
            var5 = ql.field_c.get(2);
            var6 = ql.field_c.get(1);
            var7 = ql.field_c.get(11);
            if (param0 == -82) {
              var8 = ql.field_c.get(12);
              var9 = ql.field_c.get(13);
              stackOut_3_0 = so.field_c[-1 + var3_int] + ", " + var4 / 10 + var4 % 10 + "-" + gi.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "fq.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static vg a(int param0, int param1) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        vg stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        vg stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 14663) {
                break L1;
              } else {
                String discarded$2 = fq.a((byte) -111, -125L);
                break L1;
              }
            }
            var2 = new vg();
            oe.field_Bb.a((byte) -119, (tc) (Object) var2);
            tq.a(param1, 0);
            stackOut_3_0 = (vg) var2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2_ref, "fq.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static String a(int param0, String param1, boolean param2, String param3) {
        hl var4 = null;
        RuntimeException var4_ref = null;
        bv var5 = null;
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_17_0 = null;
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
        String stackOut_3_0 = null;
        String stackOut_11_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_14_0 = null;
        String stackOut_6_0 = null;
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
            if (!hg.a((byte) -113, (CharSequence) (Object) param3)) {
              stackOut_3_0 = bc.field_d;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (th.field_a == 2) {
                var4 = db.a(param1, -122);
                if (null == var4) {
                  stackOut_11_0 = fo.a(4800, uq.field_x, new String[1]);
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  var4.d(-124);
                  var4.c((byte) -76);
                  vg.field_p = vg.field_p - 1;
                  var5 = vl.field_n;
                  var5.h(32161, param0);
                  var5.field_q = var5.field_q + 1;
                  var6 = var5.field_q;
                  var5.b(1, 3);
                  if (!param2) {
                    var5.b(param3, 13851);
                    var5.e(var5.field_q - var6, 5930);
                    stackOut_16_0 = null;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    stackOut_14_0 = null;
                    stackIn_15_0 = stackOut_14_0;
                    return (String) (Object) stackIn_15_0;
                  }
                }
              } else {
                stackOut_6_0 = tb.field_a;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4_ref;
            stackOut_18_1 = new StringBuilder().append("fq.B(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L1;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L1;
            }
          }
          L2: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return (String) (Object) stackIn_17_0;
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              bb.field_a = false;
              if (mg.field_e.k(0) != 0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              vi.field_d = stackIn_4_0 != 0;
              if (param0 >= 70) {
                break L2;
              } else {
                field_h = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "fq.D(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Magical Bolt", "Magical Blast", "Magical Rush", "Magical Wave", "Magical Burst", "Magical Blitz", "Magical Barrage", "Mana Rush", "Mana Wave", "Mana Burst", "Mana Blitz", "Mana Barrage", "Waders", "Strength XS", "Strength S", "Strength M", "Strength L", "Strength XL", "Weakness XS", "Weakness S", "Weakness M", "Weakness L", "Weakness XL", "Raise Soldier", "Raise Army", "Spiritual Shield", "Spiritual Barrier", "Revolt", "Grappling hook", "Clone 1", "Clone 2", "Clone 3", "Clone 4", "Clone 5", "Tele-shift", "Teleport", "Mind Warp", "Shrine of Saradomin", "Shrine of Zamorak", "Shrine of Guthix", "Shrine of Seren", "Shrine of Bandos", "Shrine of Menaphos", "Fortify", "Bridger", "Draconic Chant", "Rejuvenate", "Fireball", "Large fireball", "Fire Shower", "Greater Fire Shower", "Fire Rain", "Greater Fire Rain", "Firestorm", "Healing Spark", "Healing Ray", "Healing Beam", "Healing Wave", "Healing Light", "Healing Glare", "Healing Blaze", "Healing Glow", "Greater Healing Glow", "Healing Aura", "Greater Healing Aura", "Healing Radiance", "Greater Healing Radiance ", "Healing Brilliance", "Poison", "Ring of life", "Iron plate armour", "Steel plate armour", "Mithril plate armour", "Adamant plate armour", "Leather armour", "Hard leather armour", "Studded leather armour", "Snakeskin armour", "Wizard robes", "Mystic robes", "Enchanted robes", "Infinity robes", "Light dragonhide armour", "Medium dragonhide armour", "Heavy dragonhide armour", "Winged dragonhide armour", "Chain rune armour", "Plate rune armour", "Trimmed rune armour", "Blessed rune armour", "Murky armour", "Shrouded armour", "Gloomy armour", "Shadow armour", "Defender", "Longsword", "Two-handed sword", "Hunting arrows", "Steel arrows", "Brutal arrows", "Wizard hat", "Mystic hat", "Enchanted hat", "Stone armour", "Granite armour", "Poisoned blade", "Poisoned arrows", "Scabarite hat", "Flag", "Speed Boost", "Boots of Elidinis", "Forestation", "Quagmire", "Flood", "Earthquake", "Egg sac", "Charcoal", "Pharmakos berries", "Eye drops", "Crystal lozenge", "Vampyric blood", "Bind", "Snare", "Entangle", "Longbow", "Infinity hat", "Swamp tar", "Bitumen", "Potassium", "Magnesium", "Sulphur", "Pointed talons", "Sharpened talons", "Razored talons", "Poisoned talons"};
        field_a = "Mastery";
        field_k = "Player Name: ";
    }
}
