/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static gf field_a;
    static String field_b;

    final static int[][] a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, float param8) {
        int[][] var9 = null;
        mo var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int[][] var14 = null;
        int[][] var15 = null;
        mo stackIn_1_0 = null;
        mo stackIn_2_0 = null;
        mo stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        mo stackOut_0_0 = null;
        mo stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        mo stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var12 = Sumoblitz.field_L ? 1 : 0;
          var15 = new int[param7][param6];
          var14 = var15;
          var13 = var14;
          var9 = var13;
          var10 = new mo();
          var10.field_s = param1;
          var10.field_p = (int)(param8 * (float)param4);
          var10.field_q = param3;
          var10.field_r = param5;
          stackOut_0_0 = (mo) (var10);
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = (mo) ((Object) stackIn_2_0);
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (mo) ((Object) stackIn_1_0);
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_m = stackIn_3_1 != 0;
        var10.c(-8);
        vv.a(-1203350004, param6, param7);
        var11 = 0;
        L1: while (true) {
          L2: {
            if (var11 >= param7) {
              break L2;
            } else {
              var10.a(param4 + -32792, var11, var15[var11]);
              var11++;
              if (var12 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          return var9;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_a = (gf) null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_a = new gf();
        field_b = "Connection lost - attempting to reconnect";
    }
}
