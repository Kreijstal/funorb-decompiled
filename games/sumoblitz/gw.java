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
        if (0 != ((gw) this).field_t) {
          if ((((gw) this).field_t ^ -1) != -2) {
            if (param1 >= -121) {
              ((gw) this).field_y = -125;
              return;
            } else {
              return;
            }
          } else {
            tc.field_j[((gw) this).field_z].a((float)(((gw) this).field_k >> -570162872), (float)(((gw) this).field_o >> 1173840904), ((gw) this).field_y << 1536750849, 0, 3, ((gw) this).field_D << -1883450728, 1);
            if (param1 < -121) {
              return;
            } else {
              ((gw) this).field_y = -125;
              return;
            }
          }
        } else {
          wo.field_b[((gw) this).field_z].a((float)(((gw) this).field_k >> -372206456), (float)(((gw) this).field_o >> -1654651128), ((gw) this).field_y, (int)(65535.0 * ((gw) this).field_x), 3, 570425344, 1);
          if (param1 < -121) {
            return;
          } else {
            ((gw) this).field_y = -125;
            return;
          }
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
          return super.a(param0 + 0);
        }
    }

    public static void c(boolean param0) {
        if (param0) {
            field_A = null;
            field_C = null;
            field_A = null;
            return;
        }
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
