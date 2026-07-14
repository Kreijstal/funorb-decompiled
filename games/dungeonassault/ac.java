/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    cf field_a;
    String field_o;
    int field_r;
    int field_c;
    int field_v;
    static int field_s;
    cf field_p;
    int field_j;
    eh field_d;
    boolean field_b;
    boolean field_C;
    private int[] field_e;
    int field_i;
    static ph field_w;
    int field_k;
    static String field_h;
    eh field_u;
    private int[] field_q;
    static String field_f;
    int field_g;
    String field_z;
    static ai field_n;
    eh field_m;
    static wj field_B;
    String field_t;
    static String field_D;
    static boolean field_l;
    int field_y;
    int field_A;
    cf field_x;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = DungeonAssault.field_K;
        for (var3 = param0; ((ac) this).field_q.length > var3; var3++) {
            if (!(((ac) this).field_q[var3] != param1)) {
                return ((ac) this).field_e[var3];
            }
        }
        return 0;
    }

    final boolean a(byte param0, int param1) {
        int var4 = DungeonAssault.field_K;
        int var3 = 0;
        if (param0 >= -43) {
            ((ac) this).field_y = -25;
        }
        while (var3 < ((ac) this).field_q.length) {
            if (!(((ac) this).field_q[var3] != param1)) {
                return true;
            }
            var3++;
        }
        return false;
    }

    final static void a(String param0, int param1) {
        if (!(!ed.c(true))) {
            Object var3 = null;
            throw new RuntimeException((String) null);
        }
        if (eh.a(true, param0)) {
            Object var4 = null;
            throw new RuntimeException((String) null);
        }
        if (!(gm.field_d != null)) {
            Object var5 = null;
            throw new RuntimeException((String) null);
        }
        if (param1 != 0) {
            field_n = null;
        }
        if (!(gm.field_d.field_H)) {
            field_B.d((byte) -99, 58);
        }
        field_B.d((byte) -114, 60);
        field_B.field_o = field_B.field_o + 1;
        int var2 = field_B.field_o;
        field_B.a(param1 ^ 2, param0);
        field_B.c(-var2 + field_B.field_o, -1);
    }

    public static void a(int param0) {
        if (param0 != 19757) {
            field_f = null;
        }
        field_D = null;
        field_n = null;
        field_f = null;
        field_h = null;
        field_w = null;
        field_B = null;
    }

    final static void a(byte param0, nh param1) {
        if (param0 != -125) {
            return;
        }
        jp.a(param1.a("headers.packvorbis", "", (byte) -119));
        jp var2 = jp.a(param1, "jagex logo2.packvorbis", "");
        va discarded$0 = var2.c();
    }

    ac(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, boolean param9, boolean param10, int[][] param11) {
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          ((ac) this).field_k = param6;
          ((ac) this).field_c = param2;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param10) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((ac) this).field_b = stackIn_3_1 != 0;
          ((ac) this).field_A = param5;
          ((ac) this).field_v = param0;
          ((ac) this).field_g = param1;
          ((ac) this).field_r = param8;
          ((ac) this).field_i = param3;
          ((ac) this).field_j = param4;
          ((ac) this).field_y = param7;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param9) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        ((ac) this).field_C = stackIn_6_1 != 0;
        var13 = param11.length;
        ((ac) this).field_q = new int[var13];
        ((ac) this).field_e = new int[var13];
        var14 = 0;
        L2: while (true) {
          if (var14 >= var13) {
          } else {
            var15 = param11[var14];
            if (var15.length != 1) {
              if ((var15.length ^ -1) != -3) {
                throw new RuntimeException();
              } else {
                ((ac) this).field_q[var14] = var15[0];
                ((ac) this).field_e[var14] = var15[1];
                var14++;
                continue L2;
              }
            } else {
              ((ac) this).field_q[var14] = var15[0];
              ((ac) this).field_e[var14] = 1;
              var14++;
              continue L2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "SUCCESS";
        field_f = "You must once have charged <%0> Orbs of Mastery at one time to earn the title of <%1>.";
        field_D = "An error has occurred retrieving the Renown Table.";
        field_n = null;
    }
}
