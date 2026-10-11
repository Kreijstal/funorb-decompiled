/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wma {
    private boolean field_F;
    int field_u;
    short[] field_K;
    int[] field_l;
    short[] field_i;
    short field_y;
    int[] field_g;
    short[] field_w;
    short field_L;
    short[] field_I;
    short[] field_n;
    int[] field_C;
    int field_s;
    int field_q;
    int[] field_e;
    short[] field_m;
    int[] field_H;
    short[] field_p;
    int[] field_t;
    short[] field_b;
    short[] field_D;
    short[] field_v;
    int[] field_x;
    int[] field_h;
    short[] field_o;
    static String field_M;
    short[] field_N;
    int field_B;
    byte[] field_E;
    byte field_z;
    short[] field_c;
    short field_J;
    short[] field_r;
    int[] field_A;
    short[] field_f;
    int field_a;
    short[] field_k;
    int field_d;
    short[] field_j;
    short[] field_G;

    public static void b(int param0) {
        if (param0 < 94) {
          field_M = (String) null;
        }
        field_M = null;
    }

    final void a(int param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = VoidHunters.field_G;
        if (this.field_F) {
          return;
        }
        this.field_F = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        if (param0 <= 75) {
          this.field_p = (short[]) null;
        }
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; this.field_J > var8; var8++) {
          var9 = this.field_r[var8];
          var10 = this.field_o[var8];
          if (var10 > var6) {
            var6 = var10;
          }
          if (var5 < var9) {
            var5 = var9;
          }
          if (var3 > var10) {
            var3 = var10;
          }
          var11 = this.field_p[var8];
          if (var2 > var9) {
            var2 = var9;
          }
          if (var11 > var7) {
            var7 = var11;
          }
          if (var11 < var4) {
            var4 = var11;
          }
        }
        this.field_B = var5;
        this.field_q = var7;
        this.field_u = var3;
        this.field_s = var4;
        this.field_a = var6;
        this.field_d = var2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = VoidHunters.field_G;
        int var6 = 0;
        if (param0 != -21227) {
          return;
        }
        while (var6 < this.field_J) {
          this.field_r[var6] = (short)(param3 * this.field_r[var6] / param4);
          this.field_o[var6] = (short)(this.field_o[var6] * param2 / param4);
          this.field_p[var6] = (short)(this.field_p[var6] * param1 / param4);
          var6++;
        }
        this.a((byte) -61);
    }

    private final void a(byte param0) {
        this.field_F = false;
        if (param0 > -21) {
          this.field_B = -74;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        int var5 = -12 / ((param0 - 49) / 52);
        for (var6 = 0; this.field_J > var6; var6++) {
          this.field_r[var6] = (short)(this.field_r[var6] + param2);
          this.field_o[var6] = (short)(this.field_o[var6] + param3);
          this.field_p[var6] = (short)(this.field_p[var6] + param1);
        }
        this.a((byte) -103);
    }

    wma() {
        this.field_F = false;
        this.field_z = (byte) 0;
    }

    static {
        field_M = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
