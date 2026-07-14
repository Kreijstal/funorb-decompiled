/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fo {
    private int field_l;
    private int[] field_c;
    static int[] field_a;
    private int field_o;
    static int field_t;
    static String field_m;
    private int[] field_b;
    private int field_n;
    private int field_e;
    static int field_g;
    private ki[] field_j;
    private int field_d;
    private int field_f;
    private int[] field_h;
    private int field_v;
    private int field_k;
    private int field_r;
    private int field_q;
    private int field_p;
    static String[] field_u;
    private int[] field_s;
    private int field_i;

    final void a(int param0) {
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        int var8 = 0;
        L0: {
          ((fo) this).field_e = ((fo) this).field_e + 1;
          if (((fo) this).field_e + 1 <= -401) {
            ((fo) this).field_e = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ((fo) this).field_n = ((fo) this).field_n + 1;
          if (param0 <= ((fo) this).field_n + 1) {
            ((fo) this).field_n = 0;
            break L1;
          } else {
            break L1;
          }
        }
        ((fo) this).field_p = ((fo) this).field_b[((fo) this).field_n] + (((fo) this).field_v + ((fo) this).field_h[((fo) this).field_e]);
        ((fo) this).field_i = ((fo) this).field_s[((fo) this).field_n] + (((fo) this).field_f + ((fo) this).field_c[((fo) this).field_e]);
        var2 = (double)(-((fo) this).field_p + ((fo) this).field_d);
        var4 = (double)(-((fo) this).field_i + ((fo) this).field_q);
        var6 = Math.atan(var2 / var4);
        ((fo) this).field_k = (int)(var6 * 32768.0 / 3.141592653589793);
        var8 = ((fo) this).field_l * 158 >> 1285262988;
        ((fo) this).field_r = ((fo) this).field_p - -(int)(Math.sin(var6) * (double)var8);
        ((fo) this).field_o = ((fo) this).field_i + (int)(Math.cos(var6) * (double)var8);
        ((fo) this).field_j[0].a(((fo) this).field_o, (byte) 48, ((fo) this).field_r);
        ((fo) this).field_j[1].a(((fo) this).field_j[0].field_h, (byte) 48, ((fo) this).field_j[0].field_g);
        ((fo) this).field_j[2].a(((fo) this).field_j[1].field_h, (byte) 48, ((fo) this).field_j[1].field_g);
    }

    final void b(int param0) {
        int var3 = 0;
        ki var9 = null;
        ki var10 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        nm.field_f.b(1600, 2272, ((fo) this).field_p << 992240004, ((fo) this).field_i << -511045788, ((fo) this).field_k, ((fo) this).field_l);
        ki[] var6 = ((fo) this).field_j;
        ki[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var9 = var6[var3];
            var9.a(false);
        }
        ki[] var7 = ((fo) this).field_j;
        var2 = var7;
        int var8 = 0;
        var3 = var8;
        while (var8 < var7.length) {
            var10 = var7[var8];
            var10.b(3887);
            var8++;
        }
        t.b(((fo) this).field_p + -3, ((fo) this).field_i - 5, 299 + ((fo) this).field_d, ((fo) this).field_q, 3355392);
        t.b(-2 + ((fo) this).field_p, ((fo) this).field_i + -5, ((fo) this).field_d + 0 - -300, ((fo) this).field_q, 6710784);
        t.b(-1 + ((fo) this).field_p, -5 + ((fo) this).field_i, 300 + ((fo) this).field_d + param0, ((fo) this).field_q, 3355392);
    }

    final static boolean a(byte param0) {
        if (param0 < 12) {
            field_m = null;
        }
        return ek.field_c;
    }

    public static void b(byte param0) {
        field_u = null;
        int var1 = 89 / ((35 - param0) / 41);
        field_a = null;
        field_m = null;
    }

    fo(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        double var9_double = 0.0;
        int var10 = 0;
        double var10_double = 0.0;
        int[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        ((fo) this).field_l = param0;
        ((fo) this).field_v = param1;
        ((fo) this).field_f = param2;
        ((fo) this).field_q = param4;
        ((fo) this).field_d = param3;
        ((fo) this).field_e = ok.a(ea.field_b, -128, 400);
        ((fo) this).field_n = ok.a(ea.field_b, -120, 172);
        ((fo) this).field_c = new int[400];
        ((fo) this).field_h = new int[400];
        var6 = 200 * ((fo) this).field_l >> 62553644;
        var7 = ((fo) this).field_l * 50 >> 1790494828;
        var8 = 0;
        L0: while (true) {
          if (-401 >= (var8 ^ -1)) {
            ((fo) this).field_b = new int[172];
            ((fo) this).field_s = new int[172];
            var8 = 50 * ((fo) this).field_l >> 943383948;
            var9 = 0;
            L1: while (true) {
              if (var9 >= 172) {
                ((fo) this).field_j = new ki[3];
                var9 = ((fo) this).field_l * 40 >> -2090671124;
                var10 = 3000 * ((fo) this).field_l >> -1831705172;
                ((fo) this).field_j[0] = new ki(((fo) this).field_r, ((fo) this).field_o, var9, var10);
                ((fo) this).field_j[1] = new ki(((fo) this).field_r, ((fo) this).field_o, var9, (int)((double)var10 * 0.9));
                ((fo) this).field_j[2] = new ki(((fo) this).field_r, ((fo) this).field_o, var9, (int)((double)var10 * 0.8));
              } else {
                var10_double = (double)var9 * 3.141592653589793 / 172.0;
                ((fo) this).field_b[var9] = (int)((double)var8 * Math.sin(2.0 * var10_double));
                ((fo) this).field_s[var9] = (int)(Math.cos(var10_double * 2.0) * (double)var8);
                var9++;
                continue L1;
              }
            }
          } else {
            L2: {
              stackOut_2_0 = ((fo) this).field_h;
              stackOut_2_1 = var8;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (200 < var8) {
                stackOut_4_0 = (int[]) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 400 + -var8;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L2;
              } else {
                stackOut_3_0 = (int[]) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = var8;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                break L2;
              }
            }
            stackIn_5_0[stackIn_5_1] = stackIn_5_2;
            var9_double = (double)var8 * 3.141592653589793 / 400.0;
            ((fo) this).field_h[var8] = (int)(Math.cos(var9_double * 2.0) * (double)var6);
            ((fo) this).field_c[var8] = (int)((double)var7 * Math.sin(4.0 * var9_double));
            var8++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Game full";
        field_t = 0;
        field_u = new String[]{"icons_difficulty", "icons_pictures"};
    }
}
