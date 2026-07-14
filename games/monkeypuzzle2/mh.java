/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class mh extends jk {
    private int field_L;
    private ta field_M;
    static String field_H;
    static String field_F;
    static int field_D;
    private int field_G;
    private String field_J;
    private boolean field_E;
    private int field_I;

    final String a(byte param0) {
        int var2 = ((mh) this).field_v.field_g ? 1 : 0;
        ((mh) this).field_v.field_g = ((mh) this).field_g;
        String var3 = ((mh) this).field_v.a(param0);
        ((mh) this).field_v.field_g = var2 != 0 ? true : false;
        return var3;
    }

    mh(int param0, int param1, int param2, int param3, we param4, boolean param5, int param6, int param7, ta param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ml) null, (of) null);
        ((mh) this).field_M = param8;
        ((mh) this).field_J = param10;
        ((mh) this).field_E = param5 ? true : false;
        ((mh) this).field_v = param4;
        ((mh) this).field_I = param7;
        ((mh) this).field_L = param6;
        ((mh) this).field_G = param9;
        int var12 = ((mh) this).field_L - ((mh) this).field_I;
        int var13 = ((mh) this).field_M.a(param10, var12, ((mh) this).field_M.field_C) + 2 * ((mh) this).field_I;
        if (var13 <= param3) {
            var13 = param3;
        } else {
            ((mh) this).a(var13, 13361, param0, param2, param1);
        }
        int var14 = !((mh) this).field_E ? ((mh) this).field_I * 2 + ((mh) this).field_L : 0;
        ((mh) this).field_v.a(-(2 * ((mh) this).field_I) + param3, 13361, var14, -((mh) this).field_L + param2 - ((mh) this).field_I * 3, ((mh) this).field_I - -(-param3 + var13 >> -554802399));
    }

    final static void a(vl param0, int param1, int param2) {
        ob.field_s.a(-8212, (ug) (Object) param0);
        pf.a((byte) -111, param0, param2);
        if (param1 != 0) {
            field_H = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        ta stackIn_5_0 = null;
        String stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        int stackIn_5_7 = 0;
        ta stackIn_6_0 = null;
        String stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        ta stackIn_7_0 = null;
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
        ta stackOut_4_0 = null;
        String stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        int stackOut_4_7 = 0;
        ta stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_6_8 = 0;
        ta stackOut_5_0 = null;
        String stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_5_7 = 0;
        int stackOut_5_8 = 0;
        var5 = ((mh) this).field_r + param3;
        var6 = ((mh) this).field_e + param2;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          L0: {
            if (((mh) this).field_E) {
              stackOut_3_0 = -(((mh) this).field_I * 2) + ((mh) this).field_l - ((mh) this).field_L;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_4_0;
            stackOut_4_0 = ((mh) this).field_M;
            stackOut_4_1 = ((mh) this).field_J;
            stackOut_4_2 = ((mh) this).field_I + var5 - -var7;
            stackOut_4_3 = var6 + ((mh) this).field_I;
            stackOut_4_4 = -((mh) this).field_I + ((mh) this).field_L;
            stackOut_4_5 = ((mh) this).field_p + -(((mh) this).field_I * 2);
            stackOut_4_6 = ((mh) this).field_G;
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
            if (!((mh) this).field_E) {
              stackOut_6_0 = (ta) (Object) stackIn_6_0;
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
              stackOut_5_0 = (ta) (Object) stackIn_5_0;
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
          int discarded$1 = ((ta) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7, stackIn_7_8, 1, ((mh) this).field_M.field_C);
          return;
        }
    }

    final static void a(float[] param0, byte param1, float[] param2) {
        if (param1 >= -124) {
          return;
        } else {
          param0[1] = param0[1] - param2[1];
          param0[0] = param0[0] - param2[0];
          return;
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        Object var3 = null;
        param1.setFocusTraversalKeysEnabled(false);
        if (param0 > -54) {
          var3 = null;
          mh.a(48, (java.awt.Component) null);
          param1.addKeyListener((java.awt.event.KeyListener) (Object) wj.field_k);
          param1.addFocusListener((java.awt.event.FocusListener) (Object) wj.field_k);
          return;
        } else {
          param1.addKeyListener((java.awt.event.KeyListener) (Object) wj.field_k);
          param1.addFocusListener((java.awt.event.FocusListener) (Object) wj.field_k);
          return;
        }
    }

    public static void d(byte param0) {
        field_F = null;
        int var1 = 46 % ((55 - param0) / 40);
        field_H = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Please enter your age in years";
    }
}
