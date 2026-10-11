/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hi {
    private double[] field_c;
    static ok field_l;
    static String field_i;
    static int field_g;
    private double[] field_b;
    private int[] field_f;
    static int field_a;
    private int[] field_k;
    static int field_j;
    private double[] field_e;
    private int field_d;
    static String field_h;

    public static void b(int param0) {
        field_i = null;
        if (param0 < 9) {
          field_a = 88;
          field_h = null;
          field_l = null;
          return;
        }
        field_h = null;
        field_l = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var4;
        int var3;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        for (var2 = 0; 30 > var2; var2++) {
          if (this.field_c[var2] >= 0.0 &&
            this.field_k[var2] >= 0 &&
            5.0 < this.field_b[var2] &&
            this.field_e[var2] > 5.0) {
            wj.c((int)this.field_b[var2], (int)this.field_e[var2], (int)this.field_c[var2], this.field_f[var2], this.field_k[var2]);
          }
        }
        var3 = 39 / ((param0 - 56) / 63);
    }

    final void a(int param0, int param1, double param2, double param3, int param4, double param5, double param6, double param7, int param8) {
        int var15;
        int var16;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 == 30) {
          for (var15 = 0; var15 < 29; var15++) {
            this.field_c[var15] = this.field_c[var15 + 1] + (double)this.field_d * Math.random();
            this.field_k[var15] = this.field_k[1 + var15] - this.field_d * 4;
            if (0.0 < this.field_c[var15] &&
              this.field_k[var15] > 0) {
              this.field_b[var15] = this.field_b[var15 + 1] + param6 * Math.random() + (-1.0 + 2.99 * Math.random());
              this.field_e[var15] = this.field_e[var15 + 1] + Math.random() * param5 - (2.0 * (Math.random() + Math.random() + Math.random()) - 3.0);
              this.field_f[var15] = this.field_f[1 + var15];
            }
          }
        } else {
          field_l = (ok) null;
          for (var15 = 0; var15 < 29; var15++) {
            this.field_c[var15] = this.field_c[var15 + 1] + (double)this.field_d * Math.random();
            this.field_k[var15] = this.field_k[1 + var15] - this.field_d * 4;
            if (0.0 < this.field_c[var15] &&
              this.field_k[var15] > 0) {
              this.field_b[var15] = this.field_b[var15 + 1] + param6 * Math.random() + (-1.0 + 2.99 * Math.random());
              this.field_e[var15] = this.field_e[var15 + 1] + Math.random() * param5 - (2.0 * (Math.random() + Math.random() + Math.random()) - 3.0);
              this.field_f[var15] = this.field_f[1 + var15];
            }
          }
        }
        this.field_b[29] = param7;
        this.field_e[29] = param3;
        this.field_c[29] = param2;
        this.field_f[29] = param0;
        this.field_k[29] = param8;
    }

    final static int a(int param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 0) {
            throw new IllegalArgumentException();
          }
          if (b.a(98, param0)) {
            stackIn_4_0 = (int)((4294967295L & (long)param2.nextInt()) * (long)param0 >> 32);
            return stackIn_4_0;
          }
          var3_int = -(int)(4294967296L % (long)param0) + -2147483648;
          do {
            var4 = param2.nextInt();
          } while (var4 >= var3_int);
          if (param1 == 4) {
            stackIn_12_0 = DrPhlogistonSavesTheEarth.a(var4, param0, param1 + 172);
            return stackIn_12_0;
          }
          stackIn_10_0 = 120;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("hi.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    hi(int param0) {
        int var2 = 0;
        this.field_c = new double[30];
        this.field_k = new int[30];
        this.field_b = new double[30];
        this.field_f = new int[30];
        this.field_e = new double[30];
        for (var2 = 0; 30 > var2; var2++) {
          this.field_b[var2] = -1.0;
          this.field_e[var2] = -1.0;
          this.field_c[var2] = -1.0;
          this.field_f[var2] = -1;
          this.field_k[var2] = 128;
        }
        this.field_d = param0;
    }

    static {
        field_i = "You have <%0> unread messages!";
        field_h = "Try again";
    }
}
