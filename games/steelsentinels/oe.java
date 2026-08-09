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
        RuntimeException var6_ref = null;
        int var7 = 0;
        kj var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8 = mm.field_g;
              var6 = var8;
              var8.a(param0, (byte) -117);
              var8.field_p = var8.field_p + 1;
              var7 = var8.field_p;
              var8.a((byte) 112, param3);
              if (2 == param3) {
                var8.a(param1, -115);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param5 == null) {
                var8.d(param4, 117);
                break L2;
              } else {
                r.a(var8, param5, 0);
                break L2;
              }
            }
            var8.b((byte) 100, -var7 + var8.field_p);
            if (param2 == -6988) {
              break L0;
            } else {
              oe.a(66);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6_ref);

            stackIn_11_1 = new StringBuilder().append("oe.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    final ao a(int param0, int param1) {
        ao var3;
        byte[] var4;
        ao var5;
        var3 = (ao) (this.field_g.a((long)param0, -55));
        if (param1 < -73) {
          if (var3 != null) {
            return var3;
          } else {
            L0: {
              if (32768 <= param0) {
                var4 = this.field_c.a(1, (byte) 54, param0 & 32767);
                break L0;
              } else {
                var4 = this.field_k.a(1, (byte) 63, param0);
                break L0;
              }
            }
            var5 = new ao();
            if (var4 == null) {
              if (-32769 >= (param0 ^ -1)) {
                var5.c((byte) -109);
                this.field_g.a((long)param0, var5, 1);
                return var5;
              } else {
                this.field_g.a((long)param0, var5, 1);
                return var5;
              }
            } else {
              var5.a(new gi(var4), (byte) -116);
              if (-32769 < (param0 ^ -1)) {
                this.field_g.a((long)param0, var5, 1);
                return var5;
              } else {
                var5.c((byte) -109);
                this.field_g.a((long)param0, var5, 1);
                return var5;
              }
            }
          }
        } else {
          return (ao) null;
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
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 1) {
              break L0;
            } else {
              field_j = (String) null;
              break L0;
            }
          }
          if (wa.a((byte) 30, param1, param0, param3)) {
            return d.a(true);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("oe.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    oe(int param0, cm param1, cm param2, om param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_g = new nc(64);
        try {
          L0: {
            L1: {
              this.field_c = param2;
              this.field_k = param1;
              if (null == this.field_k) {
                break L1;
              } else {
                this.field_k.a(true, 1);
                break L1;
              }
            }
            if (this.field_c != null) {
              this.field_c.a(true, 1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("oe.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_l = "Sentinels Expansion installed";
        field_h = new int[]{48, 272, 340, 400, 456, 0, 591};
        field_a = new String[]{"Use rockets to hit a target 10 times in a row. (Rated only)", "Hit enemies in the air with 10 missiles during a game. (Rated only)", "Hit enemies in the air with 10 shells and/or rockets during a game. (Rated only)", "Collect 100 'Most Interceptions' tags in Rated games.", "Destroy an enemy sentinel by intercepting a missile or rocket. (Rated only)", "Destroy an enemy sentinel while it is in the air. (Rated only)", "Unlock the Mirage device by completing the members' campaign.", "Collect 100 'Perfect' tags in Rated games.", "Personally destroy two opponents within 5 seconds. (Rated only)", "Win a 12-player game with the highest score. (Rated only)", "Collect 100 of each of the following tags in Rated games: 'Most Kills', 'Most Damage', 'Killing Streaks' and 'First Kills'.", "Collect 100 of each of the following tags in Rated games: 'Most Gun Kills', 'Most Cannon Kills' and 'Most Rocket Kills'.", "Collect 100 of each of the following tags in Rated games: 'Most Beam Kills', 'Most Plasma Kills' and 'Most Rail Kills'.", "Collect 100 tags for 'Most Melee Kills' in Rated games.", "Collect 100 of each of the following tags in Rated games: 'Most Ship Energises', 'First to Energise' and 'Killing Energised Enemies'.", "Collect 100 'Best Team Score' tags in Rated games.", "Personally destroy four opponents within 5 seconds. (Rated only)", "Win a Rated game.", "Collect 5 of one tag.", "Win 25 Rated games and collect 10 tags from 5 different categories.", "Win 50 Rated games and collect 20 tags from 10 different categories.", "Win 100 Rated games and collect 30 tags from 15 different categories.", "Win 150 Rated games and collect 40 tags from 20 different categories.", "Win 200 Rated games and collect 50 tags from 25 different categories.", "Win a game from a losing position at the start of sudden death. (Rated only, 2-player)", "Unlock the Golem-class DEATH nuclear warhead by completing the co-op game.", "Destroy the sentinel who last defeated you the next time you meet. (Rated only, 2-player)", "Earn 100,000 points in the co-op game.", "Earn 250,000 points in the co-op game.", "Destroy the sentinel who just destroyed you, while they are gloating. (Rated only)", "Destroy a sentinel that has a tech value four times that of your own. (Rated only)", "Destroy everyone in a game with a single nuke, including yourself... (Rated only; at least four sentinels)", "Complete the Ilolian Incident campaign.", "Get 5 stars for campaign missions.", "Get 10 gold stars for campaign missions.", "Get 15 stars for campaign missions.", "Get 20 gold stars for campaign missions.", "Destroy Ba'al.", "Collect 13 tags for 'Most bat kills' in Rated games at Hallowe'en."};
        field_j = "<col=<%2>>Mission <%0> : </col><col=<%3>><%1></col>";
    }
}
