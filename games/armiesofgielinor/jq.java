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
        if (param0 != -24872) {
          return null;
        } else {
          return new nd((Object) (Object) im.a(param0 + 24994, (String) param1[0].field_c));
        }
    }

    final static wk[] a(boolean param0, int param1, int param2, int param3, boolean param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        wk var9 = null;
        wk var10 = null;
        wk var11 = null;
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
            var10 = var13;
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
            var11 = var14;
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
        if (param2 != -20600) {
          field_I = null;
          qn.a(var18, var7, var8);
          return new wk[]{null, null, null, var10, var9, var11, null, null, null};
        } else {
          qn.a(var18, var7, var8);
          return new wk[]{null, null, null, var10, var9, var11, null, null, null};
        }
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        if ((param0 & param1) != 0) {
            var2 = 8 + -(7 & param1);
        }
        int var3 = param1 - -var2;
        return var3;
    }

    jq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void g(int param0) {
        if (param0 >= -2) {
          field_I = null;
          field_E = null;
          field_G = null;
          field_H = null;
          field_I = null;
          return;
        } else {
          field_E = null;
          field_G = null;
          field_H = null;
          field_I = null;
          return;
        }
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
