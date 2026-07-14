/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class h extends kj {
    private boolean field_F;
    static java.awt.Frame field_J;
    private String field_I;
    static int field_E;
    static int field_H;
    private int field_K;
    private kc field_C;
    private int field_D;
    private int field_B;
    static int field_A;
    static String field_L;

    final static void k(int param0) {
        vh var1 = null;
        vh var1_ref = null;
        L0: {
          var1 = (vh) (Object) ml.field_f.a((byte) 42);
          if (var1 == null) {
            var1_ref = new vh();
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 120) {
          h.l(-54);
          var1_ref.a(ul.field_b, 95, ul.field_i, ul.field_a, ul.field_f, ul.field_l, ul.field_d, ul.field_e);
          le.field_a.a(-115, (ca) (Object) var1_ref);
          return;
        } else {
          var1_ref.a(ul.field_b, 95, ul.field_i, ul.field_a, ul.field_f, ul.field_l, ul.field_d, ul.field_e);
          le.field_a.a(-115, (ca) (Object) var1_ref);
          return;
        }
    }

    h(int param0, int param1, int param2, int param3, pj param4, boolean param5, int param6, int param7, kc param8, int param9, String param10) {
        super(param0, param1, param2, param3, (td) null, (ag) null);
        ((h) this).field_C = param8;
        ((h) this).field_K = param9;
        ((h) this).field_y = param4;
        ((h) this).field_I = param10;
        ((h) this).field_F = param5 ? true : false;
        ((h) this).field_D = param7;
        ((h) this).field_B = param6;
        int var12 = -((h) this).field_D + ((h) this).field_B;
        int var13 = ((h) this).field_C.a(param10, var12, ((h) this).field_C.field_H) - -(2 * ((h) this).field_D);
        if (param3 >= var13) {
            var13 = param3;
        } else {
            ((h) this).a(param0, param1, var13, (byte) -90, param2);
        }
        int var14 = ((h) this).field_F ? 0 : 2 * ((h) this).field_D + ((h) this).field_B;
        ((h) this).field_y.a(var14, ((h) this).field_D + (-param3 + var13 >> 704580449), param3 + -(2 * ((h) this).field_D), (byte) -90, -((h) this).field_B + param2 + -(3 * ((h) this).field_D));
    }

    final String g(int param0) {
        int var2 = ((h) this).field_y.field_t ? 1 : 0;
        ((h) this).field_y.field_t = ((h) this).field_t;
        String var3 = ((h) this).field_y.g(param0);
        ((h) this).field_y.field_t = var2 != 0 ? true : false;
        return var3;
    }

    public static void l(int param0) {
        int var1 = -23 % ((param0 - -30) / 42);
        field_L = null;
        field_J = null;
    }

    final static qg a(qg param0, byte param1, int[] param2) {
        qg var3 = null;
        var3 = new qg(0, 0, 0);
        var3.field_i = param0.field_i;
        if (param1 != 37) {
          return null;
        } else {
          var3.field_h = param0.field_h;
          var3.field_l = param0.field_l;
          var3.field_g = param0.field_g;
          var3.field_d = param0.field_d;
          var3.field_b = param0.field_b;
          var3.field_c = param0.field_c;
          var3.field_k = param2;
          return var3;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        kc stackIn_5_0 = null;
        String stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        int stackIn_5_7 = 0;
        kc stackIn_6_0 = null;
        String stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        kc stackIn_7_0 = null;
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
        kc stackOut_4_0 = null;
        String stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        int stackOut_4_7 = 0;
        kc stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_6_8 = 0;
        kc stackOut_5_0 = null;
        String stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_5_7 = 0;
        int stackOut_5_8 = 0;
        var5 = ((h) this).field_s + param3;
        var6 = param0 + ((h) this).field_n;
        super.a(param0, param1, param2, param3);
        if (0 != param1) {
          return;
        } else {
          L0: {
            if (((h) this).field_F) {
              stackOut_3_0 = -(((h) this).field_D * 2) + (-((h) this).field_B + ((h) this).field_m);
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
            stackOut_4_0 = ((h) this).field_C;
            stackOut_4_1 = ((h) this).field_I;
            stackOut_4_2 = var7 + var5 - -((h) this).field_D;
            stackOut_4_3 = var6 + ((h) this).field_D;
            stackOut_4_4 = ((h) this).field_B + -((h) this).field_D;
            stackOut_4_5 = -(((h) this).field_D * 2) + ((h) this).field_r;
            stackOut_4_6 = ((h) this).field_K;
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
            if (((h) this).field_F) {
              stackOut_6_0 = (kc) (Object) stackIn_6_0;
              stackOut_6_1 = (String) (Object) stackIn_6_1;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = stackIn_6_3;
              stackOut_6_4 = stackIn_6_4;
              stackOut_6_5 = stackIn_6_5;
              stackOut_6_6 = stackIn_6_6;
              stackOut_6_7 = stackIn_6_7;
              stackOut_6_8 = 0;
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
              stackOut_5_0 = (kc) (Object) stackIn_5_0;
              stackOut_5_1 = (String) (Object) stackIn_5_1;
              stackOut_5_2 = stackIn_5_2;
              stackOut_5_3 = stackIn_5_3;
              stackOut_5_4 = stackIn_5_4;
              stackOut_5_5 = stackIn_5_5;
              stackOut_5_6 = stackIn_5_6;
              stackOut_5_7 = stackIn_5_7;
              stackOut_5_8 = 2;
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
          int discarded$1 = ((kc) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7, stackIn_7_8, 1, ((h) this).field_C.field_H);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Friends can be added in multiplayer<nbsp>games";
    }
}
