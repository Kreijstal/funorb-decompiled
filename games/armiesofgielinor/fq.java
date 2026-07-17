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
        return ig.field_n;
    }

    public static void a() {
        field_k = null;
        field_h = null;
        field_f = null;
        field_a = null;
    }

    final static void a(at param0, String param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        sq var9 = null;
        int var10 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = rs.field_n.a(param1) + 8;
              if (var4_int <= 200) {
                var5 = new String[]{param1};
                break L1;
              } else {
                var5 = new String[rs.field_n.c(param1, 196)];
                int discarded$2 = rs.field_n.a(param1, new int[1], var5);
                break L1;
              }
            }
            var6 = var5;
            var7 = 0;
            L2: while (true) {
              if (var6.length <= var7) {
                break L0;
              } else {
                var8 = var6[var7];
                var9 = new sq(var8, param3, param0);
                param0.a((byte) -119, (tc) (Object) var9);
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("fq.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 0 + 44 + param3 + 41);
        }
    }

    final static String a(byte param0, long param1) {
        ql.field_c.setTime(new Date(param1));
        int var3 = ql.field_c.get(7);
        int var4 = ql.field_c.get(5);
        int var5 = ql.field_c.get(2);
        int var6 = ql.field_c.get(1);
        int var7 = ql.field_c.get(11);
        int var8 = ql.field_c.get(12);
        int var9 = ql.field_c.get(13);
        return so.field_c[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + gi.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final static vg a(int param0, int param1) {
        vg var2 = new vg();
        oe.field_Bb.a((byte) -119, (tc) (Object) var2);
        int discarded$0 = 0;
        tq.a(6);
        return var2;
    }

    final static String a(int param0, String param1, boolean param2, String param3) {
        hl var4 = null;
        RuntimeException var4_ref = null;
        bv var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_9_0 = null;
        Object stackOut_13_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var7 = (CharSequence) (Object) param3;
            if (!hg.a((byte) -113, var7)) {
              stackOut_2_0 = bc.field_d;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (th.field_a == 2) {
                var4 = db.a(param1, -122);
                if (var4 == null) {
                  stackOut_9_0 = fo.a(4800, uq.field_x, new String[1]);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  var4.d(-124);
                  var4.c((byte) -76);
                  vg.field_p = vg.field_p - 1;
                  var5 = vl.field_n;
                  var5.h(32161, param0);
                  var5.field_q = var5.field_q + 1;
                  var6 = var5.field_q;
                  var5.b(1, 3);
                  var5.b(param3, 13851);
                  var5.e(var5.field_q - var6, 5930);
                  stackOut_13_0 = null;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              } else {
                stackOut_5_0 = tb.field_a;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4_ref;
            stackOut_15_1 = new StringBuilder().append("fq.B(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          L2: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return (String) (Object) stackIn_14_0;
    }

    final static void b() {
        bb.field_a = false;
        vi.field_d = mg.field_e.k(0) == 0 ? true : false;
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
