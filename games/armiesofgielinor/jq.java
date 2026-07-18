/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq extends dr {
    static String field_E;
    static wk[] field_G;
    static int field_F;
    static String[][] field_I;
    static int[] field_H;

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nd stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -24872) {
              stackOut_3_0 = new nd((Object) (Object) im.a(param0 + 24994, (String) param1[0].field_c));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jq.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static wk[] a(boolean param0, int param1, int param2, int param3, boolean param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        wk var9 = null;
        Object var10 = null;
        Object var11 = null;
        int[] var12 = null;
        wk var13 = null;
        wk var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var18 = qn.field_d;
          var17 = var18;
          var16 = var17;
          var15 = var16;
          var12 = var15;
          var6 = var12;
          var7 = qn.field_l;
          var8 = qn.field_g;
          var9 = new wk(16, param3);
          var9.b();
          qn.a(0, 0, 16, param3, param5, param1);
          var10 = null;
          var11 = null;
          if (param0) {
            var13 = var9.g();
            var10 = (Object) (Object) var13;
            var13.b();
            qn.e(0, 0, 5, 0);
            qn.e(0, 1, 3, 0);
            qn.e(0, 2, 2, 0);
            qn.e(0, 3, 1, 0);
            qn.e(0, 4, 1, 0);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param4) {
            var14 = var9.g();
            var11 = (Object) (Object) var14;
            var14.b();
            qn.e(11, 0, 5, 0);
            qn.e(13, 1, 3, 0);
            qn.e(14, 2, 2, 0);
            qn.e(15, 3, 1, 0);
            qn.e(15, 4, 1, 0);
            break L1;
          } else {
            break L1;
          }
        }
        qn.a(var18, var7, var8);
        return new wk[]{null, null, null, (wk) var10, var9, (wk) var11, null, null, null};
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        if ((7 & param1) != 0) {
            var2 = 8 + -(7 & param1);
        }
        int var3 = param1 - -var2;
        return var3;
    }

    jq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void g(int param0) {
        field_E = null;
        field_G = null;
        field_H = null;
        field_I = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = -1;
        field_E = "Suggest muting this player";
        field_H = new int[]{61, 62, 70};
        field_I = new String[][]{new String[6], new String[7], new String[7], new String[7], new String[7], new String[7], new String[7], new String[7], new String[7], new String[8], new String[19], new String[9], new String[7], new String[10], new String[7], new String[9], new String[6], new String[7], new String[7], new String[7], new String[7], new String[7], new String[43], new String[7], new String[8], new String[6], new String[6], new String[6], new String[8], new String[7], new String[7], new String[7], new String[6], new String[7], new String[9], new String[7], new String[8], new String[7], new String[6], new String[8], new String[7], new String[7], new String[7], new String[6], new String[7], new String[6], new String[7], new String[7], new String[7], new String[3], new String[8], new String[8], new String[8], new String[8], new String[7], new String[7], new String[6]};
    }
}
