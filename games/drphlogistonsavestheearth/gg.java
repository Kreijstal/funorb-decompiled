/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gg {
    private Random field_r;
    static int field_b;
    static int[] field_f;
    static he field_d;
    static int[] field_n;
    private int field_j;
    private int field_e;
    private double field_g;
    int field_o;
    private double field_h;
    static int field_l;
    private int field_c;
    private int[] field_q;
    static int[] field_i;
    private double field_k;
    private double field_m;
    private double field_p;
    private int field_a;

    private final double a(int param0) {
        if (param0 != 1769212228) {
          nh[] var3 = (nh[]) null;
          gg.a(38, (nh[]) null);
        }
        return (double)hi.a(1000, param0 ^ 1769212224, this.field_r) / 1000.0;
    }

    public static void b(int param0) {
        if (param0 != -339514552) {
          nh[] var2 = (nh[]) null;
          gg.a(-70, (nh[]) null);
        }
        field_i = null;
        field_f = null;
        field_d = null;
        field_n = null;
    }

    final static void a(int param0, nh[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1000) {
            return;
          }
          gl.field_e = param1;
          if (null != gl.field_e &&
            param1.length < 3) {
            throw new IllegalArgumentException("");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("gg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3, byte param4, int param5, int param6, int param7, double param8) {
        int var15 = 0;
        int var11;
        int var12;
        int var13;
        int var14;
        int var16;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param5 <= 5 &&
          param7 >= 1) {
          if (param4 < 22) {
            this.a(50, 43, false, -8, (byte) 104, -89, -59, -100, -0.605813202968837);
          }
          var11 = (int)((double)param7 * ji.a(65535, param8)) + param1;
          var12 = param6 + (int)(pj.a(param8, 32768) * (double)param7);
          var13 = hi.a((int)(2.0 * this.field_k), 4, this.field_r);
          var14 = 126 * param7 / this.field_c + 60;
          if (param2) {
            wj.a(var11 << 4, var12 << 4, param7 << 4, var14, this.field_q);
            wj.a(var11 << 4, var12 << 4, param7 << 3, var14 / 2, this.field_q);
          }
          wj.g(param1, param6, var11, var12, param3);
          wj.g(param1 + 1, param6, var11, var12, param3);
          wj.g(param1, param6 + 1, var11, var12, param3);
          for (var15 = 0; var15 < var13; var15++) {
            this.a(param0, var11, param2, param3, (byte) 47, 1 + param5, var12, (int)(this.field_g * (double)param7), param8 + (-0.5 + this.a(1769212228)) * this.field_m);
          }
          return;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var8Lifetime1;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != -1093327740) {
          return;
        }
        this.field_r.setSeed((long)this.field_o);
        var6 = 255 & param3 >> 8;
        var5 = param3 >> 16;
        var7 = 255 & param3;
        for (var8 = 0; var8 < 255; var8++) {
          var9 = (int)(Math.pow((double)var8, 1.5) / 16.0);
          this.field_q[var8] = li.a(li.a(var9 * var6 >> 8 << 8, var5 * var9 >> 8 << 16), var9 * var7 >> 8);
        }
        if (param2) {
          wj.a(this.field_a << 4, this.field_j << 4, 2 * this.field_c << 4, 254, this.field_q);
        }
        for (var8Lifetime1 = 0; this.field_e > var8Lifetime1; var8Lifetime1++) {
          if (param2) {
            wj.a(this.field_a << 4, this.field_j << 4, var8Lifetime1 * this.field_c << 4, 254 / (1 + var8Lifetime1), this.field_q);
          }
          if (param2) {
            wj.a(this.field_a << 4, this.field_j << 4, var8Lifetime1 * this.field_c << 4, 196 / (1 + var8Lifetime1), this.field_q);
          }
          this.a(param3, this.field_a, param2, param1, (byte) 31, 0, this.field_j, this.field_c, this.field_h + (this.a(1769212228) - 0.5) * this.field_p);
        }
        return;
    }

    gg(int param0, int param1, int param2, double param3, double param4, double param5, int param6, double param7, double param8, int param9) {
        this.field_r = new Random();
        this.field_q = new int[255];
        this.field_j = param1;
        this.field_k = param7;
        this.field_g = param8;
        this.field_a = param0;
        this.field_c = param2;
        this.field_e = param6;
        this.field_h = param3;
        this.field_m = param5;
        this.field_o = param9;
        this.field_p = param4;
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_f = new int[256];
        field_n = new int[]{1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0};
        field_l = -1;
        field_i = new int[]{1, 10, 4, 1};
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; 8 > var2; var2++) {
            if ((var0 & 1) != 1) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -306674912;
            }
          }
          field_f[var1] = var0;
        }
    }
}
