/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static nc field_f;
    private re field_l;
    private int[] field_i;
    private int[] field_c;
    static String field_a;
    static String field_h;
    private int field_e;
    private int[] field_m;
    private int[] field_n;
    static char field_k;
    private int field_o;
    static int[] field_j;
    private int[] field_d;
    private int field_g;
    private int[] field_b;

    private final void a(byte param0) {
        int[] var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var5Lifetime1;
        var6 = OrbDefence.field_D ? 1 : 0;
        var2 = ul.field_b;
        var3 = ul.field_f;
        this.field_o = 0;
        this.field_m = new int[200];
        this.field_e = 0;
        if (param0 > -58) {
          od.b((byte) -52);
        }
        var4 = ul.field_l;
        this.field_d = new int[200];
        this.field_b = new int[200];
        this.field_g = 320;
        this.field_c = new int[200];
        this.field_l = new re(new int[]{1, 2, 3, 4, 5});
        this.field_i = new int[64];
        for (var5 = 0; var5 < 64; var5++) {
          this.field_i[var5] = 65537 * var5;
          if (var5 > 32) {
            this.field_i[var5] = ge.a(this.field_i[var5], -8192 + 256 * var5);
          }
        }
        this.field_n = new int[32];
        for (var5Lifetime1 = 0; var5Lifetime1 < 16; var5Lifetime1++) {
          this.field_n[var5Lifetime1] = var5Lifetime1 * 262660;
          this.field_n[31 - var5Lifetime1] = var5Lifetime1 * 262660;
        }
        ul.field_f = var3;
        ul.field_b = var2;
        ul.field_l = var4;
        ul.c();
    }

    final void a(boolean param0) {
        if (this.field_e >= 25) {
          this.a((byte) -124, 25);
        } else {
          this.a((byte) -119, 25 * cc.field_f.field_e / 25);
        }
        if (!param0) {
          this.a((byte) -53, -57);
        }
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        se var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != 192) {
            od.b((byte) 41);
          }
          var1 = uk.field_b;
          while (wl.a(-1)) {
            var1.i(8, -44);
            fieldTemp$0 = var1.field_i + 1;
            var1.field_i = var1.field_i + 1;
            var2 = fieldTemp$0;
            dk.a((byte) 15, var1);
            uk.field_b.c((byte) 115, var1.field_i - var2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1_ref), "od.D(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != -87) {
          od.a(31);
        }
        field_j = null;
        field_f = null;
        field_a = null;
        field_h = null;
    }

    private final void a(byte param0, int param1) {
        int var10 = 0;
        int var3;
        int var4;
        int var6;
        int var8;
        int var11;
        int var5;
        int var7;
        int var9;
        var11 = OrbDefence.field_D ? 1 : 0;
        var3 = -120 + 2 * lc.field_o;
        this.field_g = 75;
        if (wj.field_m == 3) {
          this.field_g = this.field_g + 370;
        }
        var4 = 108;
        ul.f(this.field_g, var3, var4 >> 1, 0);
        ul.g(this.field_g, var3, var4 >> 1, 7798903);
        var6 = -102 / ((param0 + 55) / 63);
        for (var10 = 0; var10 < 200; var10++) {
          var8 = ((this.field_d[var10] >> 4) * (this.field_d[var10] >> 4) + (this.field_c[var10] >> 4) * (this.field_c[var10] >> 4)) / 3;
          if (var8 > 0) {
            var9 = var8 >> 4;
            var5 = (int)((double)(var4 * this.field_d[var10]) / Math.sqrt((double)(var8 * 3)));
            var7 = (int)((double)(var4 * this.field_c[var10]) / Math.sqrt((double)(var8 * 3)));
            if (param1 > 25) {
              var8 = var8 + (10 * param1 - 250);
              var9 = var9 + (-25 + param1);
            }
            if (var9 > 63) {
              var9 = 63;
            }
            ul.a((var5 >> 1) + (this.field_g << 4), (var3 << 4) + (var7 >> 1), var8 >> 2 >> 1, var9, this.field_i);
          }
        }
        ul.i(this.field_g, var3, var4 >> 1, 0, 50);
        ul.b(this.field_g << 4, var3 << 4, 2 + var4 << 4 >> 1, 192, this.field_n);
        if (param1 < 25) {
          ul.i(this.field_g, var3, 48, 0, 250 - 10 * param1);
        }
        ul.b(this.field_g << 4, var3 << 4, 2 + var4 << 4 >> 1, 192, this.field_n);
        ul.b(this.field_g << 4, var3 << 4, 2 + var4 << 4 >> 1, 192, this.field_n);
        ul.b(this.field_g << 4, var3 << 4, 2 + var4 << 4 >> 1, 192, this.field_n);
    }

    final void b(int param0) {
        int var2;
        double var3;
        int var5;
        int var2Lifetime1;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (vj.a(52)) {
          return;
        }
        this.field_e = this.field_e + 1;
        if (param0 < 4) {
          this.field_m = (int[]) null;
        }
        for (var2 = 0; var2 < 200; var2++) {
          if (this.field_m[var2] > this.field_d[var2]) {
            this.field_d[var2] = this.field_d[var2] + 6;
          }
          if (this.field_d[var2] > this.field_m[var2]) {
            this.field_d[var2] = this.field_d[var2] - 3;
          }
          if (this.field_c[var2] < this.field_b[var2]) {
            this.field_c[var2] = this.field_c[var2] + 3;
          }
          if (this.field_b[var2] < this.field_c[var2]) {
            this.field_c[var2] = this.field_c[var2] - 6;
          }
        }
        var2Lifetime1 = 864 + this.field_l.a(128) % 160;
        var3 = (double)(this.field_l.a(128) % 214) + (double)(this.field_l.a(128) % 100) * 0.01;
        this.field_m[this.field_o] = (int)((double)var2Lifetime1 * Math.sin(var3));
        this.field_b[this.field_o] = (int)((double)var2Lifetime1 * Math.cos(var3));
        this.field_o = this.field_o + 1;
        if (200 <= this.field_o) {
          this.field_o = 0;
        }
        return;
    }

    od() {
        this.a((byte) -116);
    }

    static {
        field_h = "This is a hidden Achievement";
        field_a = "PANICO";
    }
}
