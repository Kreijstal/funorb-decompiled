/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static String field_c;
    static tv field_e;
    static String field_f;
    static kl field_b;
    static String field_a;
    static String[][] field_d;

    final static wd a(int param0) {
        if (nb.field_i != oh.field_L) {
          if (lm.field_d != oh.field_L) {
            if (param0 == -61440) {
              return null;
            } else {
              field_e = (tv) null;
              return null;
            }
          } else {
            oh.field_L = nb.field_i;
            return p.field_a;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static int a(int param0, int param1) {
        int discarded$2 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = (param0 * param0 >> 62406156) * param0 >> -1072900884;
        var3 = param0 * 6 + -61440;
        var4 = (var3 * param0 >> -1249041204) + 40960;
        if (param1 >= -26) {
          discarded$2 = ki.a(85, -2);
          return var4 * var2 >> 1795605868;
        } else {
          return var4 * var2 >> 1795605868;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_f = null;
        field_a = null;
        field_d = (String[][]) null;
        if (param0 <= 87) {
          ki.a((byte) 12);
          field_b = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          return;
        }
    }

    static {
        field_c = "<%0> of <%1> strength with +<%2> bonus";
        field_f = "Leather armour helps to protect against ranged damage.";
        field_a = "Don't mind";
        field_e = new tv();
        field_d = new String[][]{new String[]{"240", "180", "150", "120", "90", "60", "30"}, new String[]{"Small 2-player maps for quick duels. 15-turn limit. Average play time: 30 minutes.", "Standard maps for 2-4 players. 20-turn limit. Average play time: 30-60 minutes.", "Large scale battles for 2-6 players. 30-turn limit. Average play time: 1-2 hours.", "Huge, randomly-generated maps for 4-8 players. Average play time: 2+ hours."}, new String[]{"The standard number of turns for this map size.", "Twice number of turns for this map size.", "Three times the number of turns for this map size.", "Four times the number of turns for this map size."}, new String[]{"Misthalin: standard terrain.", "Kharidian Desert: open maps with lots of mountainous terrain.", "Frozen Wastes: enclosed maps with lots of mountains and forests.", "Hallowvale Swamps: a mixture of maps with lots of water.", "Forinthry Barrens: the damage caused by the God Wars was heavy here."}, new String[]{"Every player against every other player.", "Players must work together as a red and blue team."}, new String[]{"No trinkets may be used in this game", "Each player may use trinkets in this game up to the value of 25 runes", "Each player may use trinkets in this game up to the value of 75 runes", "Each player may use trinkets in this game up to the value of 150 runes", "Each player may use trinkets in this game, with no value limit"}};
    }
}
