/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends da {
    static int[][] field_L;
    private int field_J;
    private int field_I;
    static String field_G;
    static int field_H;
    static String[] field_O;
    private int field_F;
    private String field_K;
    private boolean field_N;
    static String field_P;
    private se field_M;

    dg(int param0, int param1, int param2, int param3, lm param4, boolean param5, int param6, int param7, se param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ca) null, (pg) null);
        ((dg) this).field_N = param5 ? true : false;
        ((dg) this).field_D = param4;
        ((dg) this).field_I = param9;
        ((dg) this).field_J = param6;
        ((dg) this).field_M = param8;
        ((dg) this).field_K = param10;
        ((dg) this).field_F = param7;
        int var12 = ((dg) this).field_J + -((dg) this).field_F;
        int var13 = ((dg) this).field_M.a(param10, var12, ((dg) this).field_M.field_H) - -(((dg) this).field_F * 2);
        if (var13 <= param3) {
            var13 = param3;
        } else {
            ((dg) this).b(0, param2, param1, param0, var13);
        }
        int var14 = ((dg) this).field_N ? 0 : ((dg) this).field_J + ((dg) this).field_F * 2;
        ((dg) this).field_D.b(0, -((dg) this).field_J + (param2 - ((dg) this).field_F * 3), ((dg) this).field_F - -(var13 + -param3 >> -635387615), var14, param3 - 2 * ((dg) this).field_F);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        se stackIn_5_0 = null;
        String stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        int stackIn_5_7 = 0;
        se stackIn_6_0 = null;
        String stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        se stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        int stackIn_7_8 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        se stackOut_4_0 = null;
        String stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        int stackOut_4_7 = 0;
        se stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_6_8 = 0;
        se stackOut_5_0 = null;
        String stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_5_7 = 0;
        int stackOut_5_8 = 0;
        var5 = param1 + ((dg) this).field_q;
        var6 = ((dg) this).field_v - -param3;
        super.a(param0, param1, 0, param3);
        if (param0 != param2) {
          return;
        } else {
          L0: {
            if (!((dg) this).field_N) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = -(2 * ((dg) this).field_F) + (-((dg) this).field_J + ((dg) this).field_x);
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_4_0;
            stackOut_4_0 = ((dg) this).field_M;
            stackOut_4_1 = ((dg) this).field_K;
            stackOut_4_2 = ((dg) this).field_F + (var7 + var5);
            stackOut_4_3 = var6 + ((dg) this).field_F;
            stackOut_4_4 = -((dg) this).field_F + ((dg) this).field_J;
            stackOut_4_5 = ((dg) this).field_s - ((dg) this).field_F * 2;
            stackOut_4_6 = ((dg) this).field_I;
            stackOut_4_7 = -1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            stackIn_6_5 = stackOut_4_5;
            stackIn_6_6 = stackOut_4_6;
            stackIn_6_7 = stackOut_4_7;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            stackIn_5_3 = stackOut_4_3;
            stackIn_5_4 = stackOut_4_4;
            stackIn_5_5 = stackOut_4_5;
            stackIn_5_6 = stackOut_4_6;
            stackIn_5_7 = stackOut_4_7;
            if (!((dg) this).field_N) {
              stackOut_6_0 = (se) (Object) stackIn_6_0;
              stackOut_6_1 = (String) (Object) stackIn_6_1;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = stackIn_6_3;
              stackOut_6_4 = stackIn_6_4;
              stackOut_6_5 = stackIn_6_5;
              stackOut_6_6 = stackIn_6_6;
              stackOut_6_7 = stackIn_6_7;
              stackOut_6_8 = 2;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              stackIn_7_4 = stackOut_6_4;
              stackIn_7_5 = stackOut_6_5;
              stackIn_7_6 = stackOut_6_6;
              stackIn_7_7 = stackOut_6_7;
              stackIn_7_8 = stackOut_6_8;
              break L1;
            } else {
              stackOut_5_0 = (se) (Object) stackIn_5_0;
              stackOut_5_1 = (String) (Object) stackIn_5_1;
              stackOut_5_2 = stackIn_5_2;
              stackOut_5_3 = stackIn_5_3;
              stackOut_5_4 = stackIn_5_4;
              stackOut_5_5 = stackIn_5_5;
              stackOut_5_6 = stackIn_5_6;
              stackOut_5_7 = stackIn_5_7;
              stackOut_5_8 = 0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              stackIn_7_3 = stackOut_5_3;
              stackIn_7_4 = stackOut_5_4;
              stackIn_7_5 = stackOut_5_5;
              stackIn_7_6 = stackOut_5_6;
              stackIn_7_7 = stackOut_5_7;
              stackIn_7_8 = stackOut_5_8;
              break L1;
            }
          }
          int discarded$1 = ((se) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7, stackIn_7_8, 1, ((dg) this).field_M.field_H);
          return;
        }
    }

    final String c(byte param0) {
        int var2 = 0;
        String var3 = null;
        lm stackIn_1_0 = null;
        lm stackIn_2_0 = null;
        lm stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        lm stackOut_0_0 = null;
        lm stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        lm stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var2 = ((dg) this).field_D.field_u ? 1 : 0;
          ((dg) this).field_D.field_u = ((dg) this).field_u;
          var3 = ((dg) this).field_D.c((byte) 25);
          stackOut_0_0 = ((dg) this).field_D;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (var2 == 0) {
            stackOut_2_0 = (lm) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (lm) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_u = stackIn_3_1 != 0;
        if (param0 < 3) {
          ((dg) this).a(127, 20, 104, -29);
          return var3;
        } else {
          return var3;
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_O = null;
        field_G = null;
        field_P = null;
        field_L = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new String[]{null, "The rooms you can place are shown in the panel on the left. <%highlight>More types of room will become available as you gain Renown</col>. Click a room to select it and review its statistics and description. You can then place the room by <col=FF0000>left-clicking somewhere in your dungeon</col>. Placing a room on top of an existing one will cause it to be replaced - you will receive some of the room's original cost in return.<br><br><%command>Select a room from the left and place it in your dungeon.</col>"};
        field_H = 1;
        field_P = "Loading music";
        field_G = "You are charging <%0> Orbs of Mastery!";
    }
}
