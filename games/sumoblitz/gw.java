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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 != this.field_t) {
            if (this.field_t == 1) {
              tc.field_j[this.field_z].a((float)(this.field_k >> 8), (float)(this.field_o >> 8), this.field_y << 1, 0, 3, this.field_D << 24, 1);
            }
          } else {
            wo.field_b[this.field_z].a((float)(this.field_k >> 8), (float)(this.field_o >> 8), this.field_y, (int)(65535.0 * this.field_x), 3, 570425344, 1);
          }
          if (param1 < -121) {
            return;
          }
          this.field_y = -125;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gw.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
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
        if (param0 == -2567) {
          this.field_x = this.field_x + this.field_u;
          this.field_k = this.field_k + this.field_w;
          return super.a(param0 + 0);
        }
        return false;
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
