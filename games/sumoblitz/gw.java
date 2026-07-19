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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (0 != this.field_t) {
                  break L2;
                } else {
                  wo.field_b[this.field_z].a((float)(this.field_k >> -372206456), (float)(this.field_o >> -1654651128), this.field_y, (int)(65535.0 * this.field_x), 3, 570425344, 1);
                  if (!Sumoblitz.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if ((this.field_t ^ -1) != -2) {
                break L1;
              } else {
                tc.field_j[this.field_z].a((float)(this.field_k >> -570162872), (float)(this.field_o >> 1173840904), this.field_y << 1536750849, 0, 3, this.field_D << -1883450728, 1);
                break L1;
              }
            }
            if (param1 < -121) {
              break L0;
            } else {
              this.field_y = -125;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("gw.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    gw(int param0, int param1, int param2, int param3, int param4, int param5, double param6, double param7, int param8, int param9) {
        super(param0, param1, param2, param3);
        this.field_w = param8;
        this.field_x = param6;
        this.field_t = param4;
        this.field_z = param5;
        this.field_s = param9;
        this.field_u = param7;
        this.field_y = fi.a(2048, ki.field_b, (byte) -96) + 512;
        this.field_D = fi.a(128, ki.field_b, (byte) -96);
    }

    final boolean a(int param0) {
        this.field_o = this.field_o + this.field_s;
        if (param0 != -2567) {
          return false;
        } else {
          this.field_x = this.field_x + this.field_u;
          this.field_k = this.field_k + this.field_w;
          return super.a(param0 + 0);
        }
    }

    public static void c(boolean param0) {
        if (param0) {
            field_A = (int[]) null;
            field_C = null;
            field_A = null;
            return;
        }
        field_C = null;
        field_A = null;
    }

    static {
        field_A = new int[1000];
        field_v = true;
    }
}
