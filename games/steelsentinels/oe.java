/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    private cm field_c;
    private nc field_g;
    static long field_b;
    static wk[] field_f;
    static int field_e;
    static int[] field_h;
    static int field_i;
    private cm field_k;
    static String field_l;
    static String field_j;
    static String[] field_a;
    static cm field_d;

    final static void a(int param0, String param1, int param2, int param3, int param4, String param5) {
        kj var6 = null;
        int var7 = 0;
        kj var8 = null;
        L0: {
          var8 = mm.field_g;
          var6 = var8;
          var8.a(param0, (byte) -117);
          var8.field_p = var8.field_p + 1;
          var7 = var8.field_p;
          var8.a((byte) 112, param3);
          if (2 == param3) {
            var8.a(param1, -115);
            break L0;
          } else {
            break L0;
          }
        }
        if (param5 == null) {
          var8.d(param4, 117);
          var8.b((byte) 100, -var7 + var8.field_p);
          if (param2 == -6988) {
            return;
          } else {
            oe.a(66);
            return;
          }
        } else {
          int discarded$8 = r.a((gi) (Object) var8, param5, 0);
          var8.b((byte) 100, -var7 + var8.field_p);
          if (param2 == -6988) {
            return;
          } else {
            oe.a(66);
            return;
          }
        }
    }

    final ao a(int param0, int param1) {
        ao var3 = null;
        byte[] var4 = null;
        ao var5 = null;
        var3 = (ao) ((oe) this).field_g.a((long)param0, -55);
        if (param1 < -73) {
          if (var3 != null) {
            return var3;
          } else {
            L0: {
              if (32768 <= param0) {
                var4 = ((oe) this).field_c.a(1, (byte) 54, param0 & 32767);
                break L0;
              } else {
                var4 = ((oe) this).field_k.a(1, (byte) 63, param0);
                break L0;
              }
            }
            var5 = new ao();
            if (var4 == null) {
              if (-32769 >= (param0 ^ -1)) {
                var5.c((byte) -109);
                ((oe) this).field_g.a((long)param0, (Object) (Object) var5, 1);
                return var5;
              } else {
                ((oe) this).field_g.a((long)param0, (Object) (Object) var5, 1);
                return var5;
              }
            } else {
              var5.a(new gi(var4), (byte) -116);
              if (-32769 < (param0 ^ -1)) {
                ((oe) this).field_g.a((long)param0, (Object) (Object) var5, 1);
                return var5;
              } else {
                var5.c((byte) -109);
                ((oe) this).field_g.a((long)param0, (Object) (Object) var5, 1);
                return var5;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 272) {
          oe.a(-128);
          field_l = null;
          field_a = null;
          field_j = null;
          field_h = null;
          field_d = null;
          return;
        } else {
          field_l = null;
          field_a = null;
          field_j = null;
          field_h = null;
          field_d = null;
          return;
        }
    }

    final static wk a(int param0, int param1, int param2, cm param3) {
        if (param2 == 1) {
          if (!wa.a((byte) 30, param1, param0, param3)) {
            return null;
          } else {
            return d.a(true);
          }
        } else {
          field_j = null;
          if (!wa.a((byte) 30, param1, param0, param3)) {
            return null;
          } else {
            return d.a(true);
          }
        }
    }

    oe(int param0, cm param1, cm param2, om param3) {
        ((oe) this).field_g = new nc(64);
        ((oe) this).field_c = param2;
        ((oe) this).field_k = param1;
        if (null != ((oe) this).field_k) {
            int discarded$0 = ((oe) this).field_k.a(true, 1);
        }
        if (((oe) this).field_c != null) {
            int discarded$1 = ((oe) this).field_c.a(true, 1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Sentinels Expansion installed";
        field_h = new int[]{48, 272, 340, 400, 456, 0, 591};
        field_a = new String[]{"Use rockets to hit a target 10 times in a row. (Rated only)", "Hit enemies in the air with 10 missiles during a game. (Rated only)", "Hit enemies in the air with 10 shells and/or rockets during a game. (Rated only)", "Collect 100 'Most Interceptions' tags in Rated games.", "Destroy an enemy sentinel by intercepting a missile or rocket. (Rated only)", "Destroy an enemy sentinel while it is in the air. (Rated only)", "Unlock the Mirage device by completing the members' campaign.", "Collect 100 'Perfect' tags in Rated games.", "Personally destroy two opponents within 5 seconds. (Rated only)", "Win a 12-player game with the highest score. (Rated only)", "Collect 100 of each of the following tags in Rated games: 'Most Kills', 'Most Damage', 'Killing Streaks' and 'First Kills'.", "Collect 100 of each of the following tags in Rated games: 'Most Gun Kills', 'Most Cannon Kills' and 'Most Rocket Kills'.", "Collect 100 of each of the following tags in Rated games: 'Most Beam Kills', 'Most Plasma Kills' and 'Most Rail Kills'.", "Collect 100 tags for 'Most Melee Kills' in Rated games.", "Collect 100 of each of the following tags in Rated games: 'Most Ship Energises', 'First to Energise' and 'Killing Energised Enemies'.", "Collect 100 'Best Team Score' tags in Rated games.", "Personally destroy four opponents within 5 seconds. (Rated only)", "Win a Rated game.", "Collect 5 of one tag.", "Win 25 Rated games and collect 10 tags from 5 different categories.", "Win 50 Rated games and collect 20 tags from 10 different categories.", "Win 100 Rated games and collect 30 tags from 15 different categories.", "Win 150 Rated games and collect 40 tags from 20 different categories.", "Win 200 Rated games and collect 50 tags from 25 different categories.", "Win a game from a losing position at the start of sudden death. (Rated only, 2-player)", "Unlock the Golem-class DEATH nuclear warhead by completing the co-op game.", "Destroy the sentinel who last defeated you the next time you meet. (Rated only, 2-player)", "Earn 100,000 points in the co-op game.", "Earn 250,000 points in the co-op game.", "Destroy the sentinel who just destroyed you, while they are gloating. (Rated only)", "Destroy a sentinel that has a tech value four times that of your own. (Rated only)", "Destroy everyone in a game with a single nuke, including yourself... (Rated only; at least four sentinels)", "Complete the Ilolian Incident campaign.", "Get 5 stars for campaign missions.", "Get 10 gold stars for campaign missions.", "Get 15 stars for campaign missions.", "Get 20 gold stars for campaign missions.", "Destroy Ba'al.", "Collect 13 tags for 'Most bat kills' in Rated games at Hallowe'en."};
        field_j = "<col=<%2>>Mission <%0> : </col><col=<%3>><%1></col>";
    }
}
