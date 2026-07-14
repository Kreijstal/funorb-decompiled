/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ej extends ec {
    private e field_E;
    static int field_L;
    static int field_P;
    private int field_I;
    private int field_G;
    private int field_B;
    private String field_K;
    static String field_H;
    static String field_O;
    static String field_M;
    private boolean field_J;
    static String field_F;

    ej(int param0, int param1, int param2, int param3, fi param4, boolean param5, int param6, int param7, e param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ol) null, (cd) null);
        ((ej) this).field_K = param10;
        ((ej) this).field_I = param6;
        ((ej) this).field_E = param8;
        ((ej) this).field_J = param5 ? true : false;
        ((ej) this).field_x = param4;
        ((ej) this).field_G = param9;
        ((ej) this).field_B = param7;
        int var12 = ((ej) this).field_I + -((ej) this).field_B;
        int var13 = ((ej) this).field_E.a(param10, var12, ((ej) this).field_E.field_H) - -(((ej) this).field_B * 2);
        if (param3 < var13) {
            ((ej) this).a(var13, true, param1, param0, param2);
        } else {
            var13 = param3;
        }
        int var14 = !((ej) this).field_J ? ((ej) this).field_B * 2 + ((ej) this).field_I : 0;
        ((ej) this).field_x.a(param3 - 2 * ((ej) this).field_B, true, ((ej) this).field_B + (var13 + -param3 >> 1961596001), var14, param2 + (-((ej) this).field_I - 3 * ((ej) this).field_B));
    }

    final String d(int param0) {
        int var2 = 0;
        String var3 = null;
        fi stackIn_1_0 = null;
        fi stackIn_2_0 = null;
        fi stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        fi stackOut_0_0 = null;
        fi stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        fi stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var2 = ((ej) this).field_x.field_p ? 1 : 0;
          ((ej) this).field_x.field_p = ((ej) this).field_p;
          var3 = ((ej) this).field_x.d(41);
          stackOut_0_0 = ((ej) this).field_x;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (var2 == 0) {
            stackOut_2_0 = (fi) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (fi) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_p = stackIn_3_1 != 0;
        if (param0 < 35) {
          return null;
        } else {
          return var3;
        }
    }

    public static void f(int param0) {
        field_F = null;
        field_O = null;
        if (param0 != 2) {
          ej.a(true, 112);
          field_H = null;
          field_M = null;
          return;
        } else {
          field_H = null;
          field_M = null;
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        df.c();
        if (param1 != 25680) {
            ej.a(true, 87);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        e stackIn_5_0 = null;
        String stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        int stackIn_5_7 = 0;
        e stackIn_6_0 = null;
        String stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        e stackIn_7_0 = null;
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
        e stackOut_4_0 = null;
        String stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        int stackOut_4_7 = 0;
        e stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_6_8 = 0;
        e stackOut_5_0 = null;
        String stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_5_7 = 0;
        int stackOut_5_8 = 0;
        var5 = param1 + ((ej) this).field_l;
        var6 = ((ej) this).field_u - -param2;
        super.a(param0, param1, param2, param3);
        if (-1 != (param3 ^ -1)) {
          return;
        } else {
          L0: {
            if (!((ej) this).field_J) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = -(((ej) this).field_B * 2) + -((ej) this).field_I + ((ej) this).field_g;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_4_0;
            stackOut_4_0 = ((ej) this).field_E;
            stackOut_4_1 = ((ej) this).field_K;
            stackOut_4_2 = ((ej) this).field_B + var7 + var5;
            stackOut_4_3 = var6 - -((ej) this).field_B;
            stackOut_4_4 = -((ej) this).field_B + ((ej) this).field_I;
            stackOut_4_5 = -(((ej) this).field_B * 2) + ((ej) this).field_m;
            stackOut_4_6 = ((ej) this).field_G;
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
            if (!((ej) this).field_J) {
              stackOut_6_0 = (e) (Object) stackIn_6_0;
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
              stackOut_5_0 = (e) (Object) stackIn_5_0;
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
          int discarded$1 = ((e) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7, stackIn_7_8, 1, ((ej) this).field_E.field_H);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Asking for or providing contact information";
        field_O = "Time: <%0>";
        field_F = "Yes";
    }
}
