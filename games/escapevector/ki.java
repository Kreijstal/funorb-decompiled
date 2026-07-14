/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ki extends r {
    private int field_F;
    private String field_G;
    private int field_K;
    static om field_H;
    private int field_D;
    private boolean field_E;
    private wl field_L;
    static int[] field_M;
    static String field_I;

    final static byte[] a(String param0, int param1) {
        if (param1 != 10592) {
          ki.l(-55);
          return wk.field_e.a(param1 ^ -10596, param0, "");
        } else {
          return wk.field_e.a(param1 ^ -10596, param0, "");
        }
    }

    public static void l(int param0) {
        field_M = null;
        field_H = null;
        if (param0 < 67) {
            field_M = null;
            field_I = null;
            return;
        }
        field_I = null;
    }

    final String d(int param0) {
        int var2 = ((ki) this).field_C.field_u ? 1 : 0;
        ((ki) this).field_C.field_u = ((ki) this).field_u;
        String var3 = ((ki) this).field_C.d(param0);
        ((ki) this).field_C.field_u = var2 != 0 ? true : false;
        return var3;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        wl stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        wl stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        wl stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_9_8 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        wl stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        wl stackOut_8_0 = null;
        String stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_8_7 = 0;
        int stackOut_8_8 = 0;
        wl stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        int stackOut_7_8 = 0;
        var5 = ((ki) this).field_k - -param3;
        var6 = ((ki) this).field_j - -param0;
        super.a(param0, (byte) 114, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          L0: {
            if (!((ki) this).field_E) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_4_0 = ((ki) this).field_g - (((ki) this).field_D + ((ki) this).field_K * 2);
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_6_0;
            stackOut_6_0 = ((ki) this).field_L;
            stackOut_6_1 = ((ki) this).field_G;
            stackOut_6_2 = ((ki) this).field_K + var5 + var7;
            stackOut_6_3 = var6 + ((ki) this).field_K;
            stackOut_6_4 = -((ki) this).field_K + ((ki) this).field_D;
            stackOut_6_5 = -(((ki) this).field_K * 2) + ((ki) this).field_x;
            stackOut_6_6 = ((ki) this).field_F;
            stackOut_6_7 = -1;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_8_2 = stackOut_6_2;
            stackIn_8_3 = stackOut_6_3;
            stackIn_8_4 = stackOut_6_4;
            stackIn_8_5 = stackOut_6_5;
            stackIn_8_6 = stackOut_6_6;
            stackIn_8_7 = stackOut_6_7;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            stackIn_7_2 = stackOut_6_2;
            stackIn_7_3 = stackOut_6_3;
            stackIn_7_4 = stackOut_6_4;
            stackIn_7_5 = stackOut_6_5;
            stackIn_7_6 = stackOut_6_6;
            stackIn_7_7 = stackOut_6_7;
            if (!((ki) this).field_E) {
              stackOut_8_0 = (wl) (Object) stackIn_8_0;
              stackOut_8_1 = (String) (Object) stackIn_8_1;
              stackOut_8_2 = stackIn_8_2;
              stackOut_8_3 = stackIn_8_3;
              stackOut_8_4 = stackIn_8_4;
              stackOut_8_5 = stackIn_8_5;
              stackOut_8_6 = stackIn_8_6;
              stackOut_8_7 = stackIn_8_7;
              stackOut_8_8 = 2;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              stackIn_9_3 = stackOut_8_3;
              stackIn_9_4 = stackOut_8_4;
              stackIn_9_5 = stackOut_8_5;
              stackIn_9_6 = stackOut_8_6;
              stackIn_9_7 = stackOut_8_7;
              stackIn_9_8 = stackOut_8_8;
              break L1;
            } else {
              stackOut_7_0 = (wl) (Object) stackIn_7_0;
              stackOut_7_1 = (String) (Object) stackIn_7_1;
              stackOut_7_2 = stackIn_7_2;
              stackOut_7_3 = stackIn_7_3;
              stackOut_7_4 = stackIn_7_4;
              stackOut_7_5 = stackIn_7_5;
              stackOut_7_6 = stackIn_7_6;
              stackOut_7_7 = stackIn_7_7;
              stackOut_7_8 = 0;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_9_3 = stackOut_7_3;
              stackIn_9_4 = stackOut_7_4;
              stackIn_9_5 = stackOut_7_5;
              stackIn_9_6 = stackOut_7_6;
              stackIn_9_7 = stackOut_7_7;
              stackIn_9_8 = stackOut_7_8;
              break L1;
            }
          }
          int discarded$8 = ((wl) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, stackIn_9_7, stackIn_9_8, 1, ((ki) this).field_L.field_r);
          if (param1 < 85) {
            ((ki) this).field_E = false;
            return;
          } else {
            return;
          }
        }
    }

    ki(int param0, int param1, int param2, int param3, hm param4, boolean param5, int param6, int param7, wl param8, int param9, String param10) {
        super(param0, param1, param2, param3, (db) null, (wn) null);
        ((ki) this).field_C = param4;
        ((ki) this).field_D = param6;
        ((ki) this).field_F = param9;
        ((ki) this).field_E = param5 ? true : false;
        ((ki) this).field_K = param7;
        ((ki) this).field_L = param8;
        ((ki) this).field_G = param10;
        int var12 = -((ki) this).field_K + ((ki) this).field_D;
        int var13 = ((ki) this).field_L.b(param10, var12, ((ki) this).field_L.field_r) - -(2 * ((ki) this).field_K);
        if (param3 < var13) {
            ((ki) this).a(param2, param1, param0, true, var13);
        } else {
            var13 = param3;
        }
        int var14 = !((ki) this).field_E ? 2 * ((ki) this).field_K + ((ki) this).field_D : 0;
        ((ki) this).field_C.a(-(3 * ((ki) this).field_K) + (-((ki) this).field_D + param2), ((ki) this).field_K + (var13 - param3 >> -155884159), var14, true, param3 + -(2 * ((ki) this).field_K));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new om(10, 2, 2, 0);
        field_M = new int[]{-1, -1, -1, 0};
        field_I = "Container not retrieved - restarting";
    }
}
