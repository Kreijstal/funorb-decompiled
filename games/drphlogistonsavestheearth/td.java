/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static int[] field_g;
    private ag field_b;
    static boolean field_f;
    boolean field_j;
    private int field_k;
    private int field_h;
    private int field_l;
    private int field_c;
    static String field_o;
    private int field_e;
    private int field_a;
    private boolean field_i;
    private he[] field_d;
    private int field_n;
    private int[] field_p;
    static String[] field_m;

    public static void a(int param0) {
        field_g = null;
        if (param0 != 869637800) {
          field_g = (int[]) null;
        }
        field_o = null;
        field_m = null;
    }

    final void a(boolean param0) {
        boolean stackIn_14_1 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_i) {
          return;
        }
        if (this.field_n == 11) {
          if (this.field_d.length > this.field_k / this.field_e) {
            this.field_d[this.field_k / this.field_e].a(-this.field_c + this.field_l, this.field_a - this.field_h);
          } else {
            this.field_i = true;
          }
        } else {
          if (this.field_n != 0) {
            var2 = 255 * (hf.field_H[this.field_n] - vh.field_e[this.field_n] * this.field_k / 2) / hf.field_H[this.field_n];
            if (255 < var2) {
              var2 = 255;
            } else {
              if (var2 < 0) {
                var2 = 0;
              }
            }
            stackIn_14_1 = (var2 == 0);
            this.field_i = stackIn_14_1;
            var3 = this.field_k * vh.field_e[this.field_n];
            wj.c(this.field_l, this.field_a, var3, 16777215, var2);
            var4 = 250 - var2;
            if (1 > var4) {
              var4 = 1;
            }
            if (var4 > 250) {
              var4 = 250;
            }
            if (var3 >= 2 &&
              !((double)var3 > 181.25)) {
              wj.a(this.field_l << 4, this.field_a << 4, var3 << 3, var4, this.field_p);
            } else {
              return;
            }
          }
        }
        if (!param0) {
          this.field_c = 76;
        }
    }

    final boolean a(byte param0) {
        boolean stackIn_7_1 = false;
        boolean stackIn_14_0 = false;
        this.field_k = this.field_k + 1;
        if (param0 > -98) {
          td.a(-106);
        }
        stackIn_7_1 = (this.field_b == null) || (this.field_b.m());
        boolean decompiledFrameRemainder0 = true;
        this.field_j = stackIn_7_1;
        if ((!this.field_i ||
          !this.field_j) && this.field_n != 0) {
          stackIn_14_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_14_0 = true;
        }
        return stackIn_14_0;
    }

    td(int param0, int param1, int param2, int param3) {
        int var9 = 0;
        int var8 = 0;
        int var8Lifetime1;
        this.field_k = 0;
        this.field_j = false;
        this.field_h = 0;
        this.field_e = 1;
        this.field_c = 0;
        this.field_d = null;
        this.field_p = new int[255];
        this.field_i = false;
        this.field_a = param2;
        this.field_l = param1;
        this.field_n = param0;
        int var5 = fa.field_l[this.field_n] >> 16;
        int var6 = 255 & fa.field_l[this.field_n] >> 8;
        int var7 = fa.field_l[this.field_n] & 255;
        for (var8 = 0; var8 < 250; var8++) {
          var9 = 1 + (var8 >> 5);
          this.field_p[var8] = var7 / var9 + (var5 / var9 << 16) + (var6 / var9 << 8);
        }
        if (this.field_n == 11) {
          this.field_c = 5;
          this.field_e = 1;
          this.field_h = 5;
          this.field_d = oj.field_c;
        }
        if (param3 == -1) {
          this.field_b = null;
        } else {
          var8Lifetime1 = e.a(104, param1);
          this.field_b = ag.a(nl.field_r[param3], 100, dk.field_a[this.field_n], var8Lifetime1);
          od.a(-1630758008, this.field_b);
        }
    }

    static {
        field_g = new int[]{2400, 1050, 1350, 1900, 1500, 900, 1400, 950, 650};
        field_o = "Waiting for graphics";
    }
}
