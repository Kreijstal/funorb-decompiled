/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gw extends nt {
    private int field_z;
    private int field_t;
    static ri field_C;
    private int field_w;
    static int[] field_A;
    private int field_y;
    static boolean field_v;
    private int field_D;
    private double field_u;
    private double field_x;
    private int field_s;

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (0 != ((gw) this).field_t) {
                if (((gw) this).field_t != 1) {
                  break L1;
                } else {
                  tc.field_j[((gw) this).field_z].a((float)(((gw) this).field_k >> 8), (float)(((gw) this).field_o >> 8), ((gw) this).field_y << 1, 0, 3, ((gw) this).field_D << 24, 1);
                  break L1;
                }
              } else {
                wo.field_b[((gw) this).field_z].a((float)(((gw) this).field_k >> 8), (float)(((gw) this).field_o >> 8), ((gw) this).field_y, (int)(65535.0 * ((gw) this).field_x), 3, 570425344, 1);
                break L1;
              }
            }
            if (param1 < -121) {
              break L0;
            } else {
              ((gw) this).field_y = -125;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("gw.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    gw(int param0, int param1, int param2, int param3, int param4, int param5, double param6, double param7, int param8, int param9) {
        super(param0, param1, param2, param3);
        ((gw) this).field_w = param8;
        ((gw) this).field_x = param6;
        ((gw) this).field_t = param4;
        ((gw) this).field_z = param5;
        ((gw) this).field_s = param9;
        ((gw) this).field_u = param7;
        ((gw) this).field_y = fi.a(2048, ki.field_b, (byte) -96) + 512;
        ((gw) this).field_D = fi.a(128, ki.field_b, (byte) -96);
    }

    final boolean a(int param0) {
        ((gw) this).field_o = ((gw) this).field_o + ((gw) this).field_s;
        if (param0 != -2567) {
          return false;
        } else {
          ((gw) this).field_x = ((gw) this).field_x + ((gw) this).field_u;
          ((gw) this).field_k = ((gw) this).field_k + ((gw) this).field_w;
          return super.a(param0);
        }
    }

    public static void c(boolean param0) {
        field_C = null;
        field_A = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[1000];
        field_v = true;
    }
}
