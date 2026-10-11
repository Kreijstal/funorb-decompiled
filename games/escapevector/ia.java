/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    short[] field_o;
    short[] field_v;
    static al field_y;
    short[] field_L;
    byte[] field_n;
    short[] field_Q;
    int field_O;
    int[] field_k;
    static String field_p;
    int[] field_H;
    short[] field_e;
    int[] field_C;
    int[] field_s;
    byte field_I;
    short[] field_J;
    int[] field_t;
    short[] field_N;
    short[] field_m;
    int field_i;
    int[] field_l;
    short[] field_c;
    short[] field_F;
    short field_K;
    int[] field_P;
    short[] field_w;
    short field_D;
    short[] field_r;
    short[] field_G;
    int field_R;
    short field_M;
    short[] field_f;
    int field_a;
    short[] field_h;
    private boolean field_B;
    int[] field_E;
    short[] field_q;
    int field_b;
    static te field_z;
    int field_g;
    short[] field_j;
    static int field_x;
    short[] field_u;
    int[] field_d;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        int var6Lifetime1;
        for (var6 = 0; this.field_K > var6; var6++) {
          this.field_L[var6] = (short)(this.field_L[var6] * param3 / param1);
          this.field_r[var6] = (short)(this.field_r[var6] * param2 / param1);
          this.field_J[var6] = (short)(this.field_J[var6] * param0 / param1);
        }
        this.b((byte) 77);
        var6Lifetime1 = -28 % ((64 - param4) / 54);
    }

    final void a(byte param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var12;
        int var11;
        var12 = EscapeVector.field_A;
        if (this.field_B) {
          return;
        }
        this.field_B = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; var8 < this.field_K; var8++) {
          var9 = this.field_L[var8];
          var10 = this.field_r[var8];
          if (var5 < var9) {
            var5 = var9;
          }
          if (var3 > var10) {
            var3 = var10;
          }
          if (var6 < var10) {
            var6 = var10;
          }
          if (var9 < var2) {
            var2 = var9;
          }
          var11 = this.field_J[var8];
          if (var11 < var4) {
            var4 = var11;
          }
          if (var11 > var7) {
            var7 = var11;
          }
        }
        this.field_R = var6;
        this.field_a = var5;
        if (param0 != 49) {
          return;
        }
        this.field_i = var3;
        this.field_b = var2;
        this.field_g = var4;
        this.field_O = var7;
    }

    private final void b(byte param0) {
        this.field_B = false;
        if (param0 != 77) {
          this.a((byte) -127);
        }
    }

    public static void a(boolean param0) {
        field_z = null;
        field_y = null;
        if (!param0) {
          field_p = (String) null;
        }
        field_p = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        for (var5 = param1; this.field_K > var5; var5++) {
          this.field_L[var5] = (short)(this.field_L[var5] + param2);
          this.field_r[var5] = (short)(this.field_r[var5] + param3);
          this.field_J[var5] = (short)(this.field_J[var5] + param0);
        }
        this.b((byte) 77);
    }

    ia() {
        this.field_I = (byte) 0;
        this.field_B = false;
    }

    static {
        field_p = "The simulator is a training environment. Your objectives will be given to you at the beginning of each mission. Be prepared for anything.";
        field_y = new al();
    }
}
