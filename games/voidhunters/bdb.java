/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bdb extends rqa {
    final static boolean a(int param0, boolean param1, int param2) {
        Object var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1) {
          L0: {
            var4 = null;
            bdb.a(-42, -9, 37, 119, 111, 16, 52, (int[]) null, 30, true);
            if ((param2 & 2048) == 0) {
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
            if ((param2 & 2048) == 0) {
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, boolean param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        var16 = VoidHunters.field_G;
        if (param9) {
          L0: while (true) {
            param4--;
            if (0 <= param4) {
              var18 = param7;
              var17 = var18;
              var10 = var17;
              var11 = param3;
              var12 = param2;
              var13 = param0;
              var14 = param6;
              var15 = var18[var11] >> 609516097 & 8355711;
              var10[var11] = dla.a(65280, var13 >> -706173495) + (dla.a(var12 >> 836419105, 16711680) - -dla.a(255, var14 >> 119209457) + var15);
              param6 = param6 + param5;
              param2 = param2 + param8;
              param0 = param0 + param1;
              param3++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        tu.field_d = param0[0].a(70);
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((bdb) this).a((nc[]) null, -116);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    bdb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
