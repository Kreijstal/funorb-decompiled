/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bb {
    static nh field_b;
    static String[] field_t;
    static String field_f;
    static String field_r;
    static String[] field_l;
    static String field_q;
    static java.awt.Image field_e;
    static String[] field_k;
    up field_g;
    up field_p;
    up field_d;
    up field_s;
    int field_a;
    ec field_o;
    long field_n;
    volatile int field_h;
    volatile int field_c;
    ec field_m;
    byte field_j;
    em field_i;

    public static void a() {
        field_q = null;
        field_b = null;
        field_k = null;
        field_t = null;
        field_e = null;
        field_f = null;
        field_r = null;
        field_l = null;
    }

    final static cn[] a(int param0, boolean param1, int param2, int param3) {
        int discarded$0 = 1;
        return pe.a(param3, param0, 25, param2);
    }

    abstract void a(int param0);

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 20) {
          L0: {
            ((bb) this).field_d = null;
            if (20 > ((bb) this).e(param0)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (20 > ((bb) this).e(param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    abstract void a(Object param0, boolean param1, byte param2);

    abstract void f(int param0);

    abstract boolean b(byte param0);

    final int c(int param0) {
        if (param0 != 20) {
          ((bb) this).field_a = 69;
          return ((bb) this).field_g.b((byte) 53) - -((bb) this).field_p.b((byte) 53);
        } else {
          return ((bb) this).field_g.b((byte) 53) - -((bb) this).field_p.b((byte) 53);
        }
    }

    final boolean b(int param0) {
        if (param0 != -21431) {
            return true;
        }
        return 20 <= ((bb) this).c(param0 ^ -21411) ? true : false;
    }

    final int e(int param0) {
        if (param0 != 20) {
          boolean discarded$2 = ((bb) this).d(38);
          return ((bb) this).field_d.b((byte) 53) + ((bb) this).field_s.b((byte) 53);
        } else {
          return ((bb) this).field_d.b((byte) 53) + ((bb) this).field_s.b((byte) 53);
        }
    }

    final em a(boolean param0, int param1, byte param2, int param3, byte param4) {
        long var6 = 0L;
        em var8 = null;
        em stackIn_1_0 = null;
        em stackIn_2_0 = null;
        em stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        em stackOut_0_0 = null;
        em stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        em stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var6 = (long)param3 + ((long)param1 << 32);
          var8 = new em();
          var8.field_E = param2;
          var8.field_o = var6;
          stackOut_0_0 = (em) var8;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = (em) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (em) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          stackIn_3_0.field_B = stackIn_3_1 != 0;
          if (param0) {
            if (((bb) this).c(20) < 20) {
              ((bb) this).field_g.a((ll) (Object) var8, -32711);
              break L1;
            } else {
              throw new RuntimeException();
            }
          } else {
            if (((bb) this).e(20) >= 20) {
              throw new RuntimeException();
            } else {
              ((bb) this).field_d.a((ll) (Object) var8, -32711);
              break L1;
            }
          }
        }
        if (param4 <= 65) {
          field_t = null;
          return var8;
        } else {
          return var8;
        }
    }

    bb() {
        ((bb) this).field_g = new up();
        ((bb) this).field_p = new up();
        ((bb) this).field_d = new up();
        ((bb) this).field_s = new up();
        ((bb) this).field_o = new ec(6);
        ((bb) this).field_j = (byte) 0;
        ((bb) this).field_h = 0;
        ((bb) this).field_c = 0;
        ((bb) this).field_m = new ec(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = null;
        field_r = "Select a raider to enchant with additional Sneak";
        field_q = "RESULT";
        field_l = new String[]{"Offering", "Sacrifice an orc or goblin to negate death or incapacity. (Multiple use)"};
        field_k = new String[]{"Raid a dungeon using only goblins", "Raid a dungeon using only orcs", "Complete 1 raid", "Complete 5 raids", "Complete 10 raids", "Complete 20 raids", "Complete 5 raids in succession", "Complete a raid without any raider being incapacitated or killed", "Defend your dungeon from 1 raid", "Defend your dungeon from 5 raids", "Defend your dungeon from 10 raids", "Defend your dungeon from 20 raids", "Kill 50% of the raiders raiding your dungeon", "Kill 100% of the raiders raiding your dungeon", "Successfully raid and clear all rooms including entrances in a dungeon where the dragon has more than 4,500 Renown", "Reach 7,000 Renown", "Successfully raid a dragon after failing it previously", "Lose 4 raiders when a dragon wakes", "Collect a bounty from 5 dungeons consecutively", "Successfully complete 500 raids", "Successfully defend your dungeon from 250 attacks", "Successfully steal over 2000 gold from a player in one raid", "Achieve all of the 'Dragon's...' Achievements", "Successfully complete 1000 raids", "Successfully defend your dungeon from 500 attacks", "Reach 10,000 Renown", "Defend your dungeon with traps worth over 3000 Treasure", "Defend your dungeon with monsters worth over 3000 Treasure", "Successfully steal a dragon's gold with a 90% or higher chance of waking it", "Successfully steal over 5000 gold from a player in one raid", "Charge at least 20 Orbs of Mastery at the same time", "Successfully complete 2000 raids", "Successfully defend your dungeon from 1000 attacks", "Reach 20,000 Renown", "Successfully raid the same dragon 3 times consecutively", "Steal an Orb of Power", "Successfully steal a dragon's gold twice consecutively, with an 80% or higher chance of waking it", "Collect a bounty from a dragon with at least 15,000 Renown, successfully stealing its gold with a 90% or higher chance of waking it, using only raiders available while charging an orb without any of them being killed or incapacitated", "Collect all the titles", "Steal 1000 gold from the player who last raided you", "Hold 20,000 Treasure at once", "Have earned a total of 1,000,000 Treasure", "Never go more than 7 days without raiding a dungeon throughout a whole year", "Achieve a top 200 place among the Dragons of Renown", "Achieve a top 30 place among the Dragons of Renown", "Achieve a top 10 place among the Dragons of Renown"};
        field_t = new String[]{"Trap", "<%highlight>This room contains a trap!</col> A <%trap>, such as <%lastroom>, will usually have high <%snare> and <%detect>, with low or no <%attack> or <%defence>."};
    }
}
