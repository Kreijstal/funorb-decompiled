/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends wi {
    int field_B;
    int field_D;
    private boolean field_q;
    int field_C;
    private fa field_G;
    int field_w;
    static af field_r;
    static sg[] field_H;
    static String[] field_u;
    private boolean field_s;
    int field_F;
    int field_E;
    private int field_y;
    static int field_z;
    int field_A;
    static int[] field_I;
    private String field_t;
    static String field_v;
    int field_x;

    final static int c(int param0) {
        if (param0 >= -120) {
          vg.b((byte) -29);
        }
        return m.field_a;
    }

    private final boolean f(int param0) {
        int var2;
        int var3;
        int stackIn_6_0 = 0;
        if (this.a((byte) 104)) {
          stackIn_6_0 = (1 == kc.field_f) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var2 = stackIn_6_0;
        var2 = var2 != 0 & this.field_k ? 1 : 0;
        var3 = -124 % ((param0 - 42) / 43);
        return var2 != 0;
    }

    final static void b(byte param0) {
        ah.field_g[93] = 43;
        ah.field_g[59] = 57;
        ah.field_g[47] = 73;
        ah.field_g[44] = 71;
        ah.field_g[92] = 74;
        ah.field_g[192] = 28;
        ah.field_g[520] = 59;
        ah.field_g[222] = 58;
        ah.field_g[46] = 72;
        ah.field_g[45] = 26;
        ah.field_g[61] = 27;
        ah.field_g[91] = 42;
        if (param0 != 32) {
          vg.c((byte) -26);
        }
    }

    public static void c(byte param0) {
        field_I = null;
        field_v = null;
        field_r = null;
        field_H = null;
        if (param0 != -53) {
          return;
        }
        field_u = null;
    }

    final void b(boolean param0) {
        int var3 = fleas.field_A ? 1 : 0;
        if (!this.field_k) {
          this.field_c = false;
          this.field_g = false;
        } else {
          this.d(-25579);
          if (this.field_g) {
            if (kc.field_f != 0) {
              if (0 != (!this.field_s ? 1 : 0)) {
              }
              this.field_s = true;
            } else {
              this.field_s = false;
            }
          }
          this.field_c = kc.field_f == 1 ? true : false;
        }
        if (!param0) {
          vg.c(114);
        }
    }

    private final void d(int param0) {
        int var3;
        boolean stackIn_16_1 = false;
        var3 = fleas.field_A ? 1 : 0;
        if (!this.field_g) {
          if (this.a((byte) 89)) {
            if (kc.field_f != 1) {
              this.field_o = li.field_j;
            } else {
              this.field_o = ji.field_i;
            }
          } else {
            this.field_o = id.field_g;
          }
        } else {
          this.field_o = ji.field_i;
        }
        if (this.field_q) {
          if (this.f(-93)) {
            stackIn_16_1 = !(this.field_g);
            this.field_g = stackIn_16_1;
          }
        } else {
          if (this.f(109)) {
            this.field_g = true;
          } else {
            this.field_g = false;
          }
        }
        if (param0 != -25579) {
          this.b(true);
        }
    }

    final void e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        if (ji.field_i == this.field_o) {
          stackIn_3_0 = this.field_w;
        } else {
          stackIn_3_0 = this.field_B;
        }
        var2 = stackIn_3_0;
        if (ji.field_i != this.field_o) {
          stackIn_6_0 = this.field_w;
        } else {
          stackIn_6_0 = this.field_B;
        }
        var3 = stackIn_6_0;
        if (param0 != -1) {
          this.field_F = -98;
        }
        if (this.field_A >= 255) {
          gb.e(this.field_l, this.field_a, this.field_n, this.field_d, this.field_E);
          for (var4 = 0; var4 < this.field_D; var4++) {
            gb.d(this.field_l + var4, var4 + this.field_a, -var4 + (this.field_l + this.field_n), var4 + this.field_a, var3);
            gb.d(var4 + this.field_l, this.field_a + var4, this.field_l + var4, -var4 + (this.field_a + this.field_d), var3);
            gb.d(var4 + this.field_l, -var4 + this.field_a + this.field_d, this.field_n + this.field_l - var4, -var4 + this.field_d + this.field_a, var2);
            gb.d(this.field_n + (this.field_l - var4), var4 + this.field_a, this.field_l - (-this.field_n + var4), this.field_a + (this.field_d - var4), var2);
          }
        } else {
          if (0 < this.field_A) {
            gb.g(this.field_l, this.field_a, this.field_n, this.field_d, this.field_E, this.field_A);
            for (var4 = 0; this.field_D > var4; var4++) {
              gb.f(var4 + this.field_l, var4 + this.field_a, -var4 + this.field_n + this.field_l, this.field_a + var4, var3, this.field_A);
              gb.f(this.field_l + var4, var4 + this.field_a, var4 + this.field_l, -var4 + (this.field_d + this.field_a), var3, this.field_A);
              gb.f(this.field_l + var4, this.field_a + this.field_d - var4, -var4 + this.field_n + this.field_l, this.field_d + (this.field_a - var4), var2, this.field_A);
              gb.f(this.field_n + (this.field_l - var4), var4 + this.field_a, this.field_l - (-this.field_n + var4), this.field_a + (this.field_d - var4), var2, this.field_A);
            }
          }
        }
        gb.a(ia.field_q);
        this.field_G.a(this.field_t, (this.field_n >> 1) + this.field_l + this.field_y, this.field_a + (this.field_C + (this.field_d >> 1)) + (this.field_G.field_y >> 1), this.field_F, this.field_x);
        gb.b(ia.field_q);
    }

    vg(String param0, int param1, int param2, fa param3) {
        this.field_C = 0;
        this.field_w = 12369084;
        this.field_D = 1;
        this.field_y = 0;
        this.field_s = false;
        this.field_q = false;
        this.field_E = 8421504;
        this.field_B = 4737096;
        this.field_F = 16777215;
        this.field_A = 255;
        this.field_x = 0;
        try {
          this.field_t = param0;
          this.field_a = param1;
          this.field_n = 69;
          this.field_G = param3;
          this.field_l = param2;
          this.field_d = this.field_G.field_H + this.field_G.field_K;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "vg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_v = "There are a few limitations on what you can do with these tiles though:";
    }
}
