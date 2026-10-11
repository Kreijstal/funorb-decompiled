/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends pj {
    int[] field_e;
    int[] field_q;
    int field_b;
    int field_f;
    short[] field_l;
    private int[][] field_A;
    private int[] field_s;
    byte[] field_c;
    short[] field_z;
    byte[] field_x;
    int[] field_h;
    int field_r;
    short[] field_d;
    byte[] field_o;
    short[] field_B;
    byte[] field_k;
    int field_y;
    dj[] field_t;
    int[] field_v;
    int[] field_u;
    int[] field_w;
    private int[] field_g;
    private int[][] field_m;
    dj[] field_j;
    byte[] field_p;
    e[] field_n;
    short[] field_i;

    final void b() {
        e dupTemp$0 = null;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        e var16;
        dj var17;
        dj var18;
        dj var19;
        int var1Lifetime1;
        if (this.field_j != null) {
          return;
        }
        this.field_j = new dj[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
          this.field_j[var1] = new dj();
        }
        var1Lifetime1 = 0;
        while (true) {
          if (var1Lifetime1 >= this.field_y) {
            return;
          }
          var2 = this.field_h[var1Lifetime1];
          var3 = this.field_v[var1Lifetime1];
          var4 = this.field_q[var1Lifetime1];
          var5 = this.field_w[var3] - this.field_w[var2];
          var6 = this.field_e[var3] - this.field_e[var2];
          var7 = this.field_u[var3] - this.field_u[var2];
          var8 = this.field_w[var4] - this.field_w[var2];
          var9 = this.field_e[var4] - this.field_e[var2];
          var10 = this.field_u[var4] - this.field_u[var2];
          var11 = var6 * var10 - var9 * var7;
          var12 = var7 * var8 - var10 * var5;
          var13 = var5 * var9 - var8 * var6;
          while (true) {
            if (var11 <= 8192 &&
              var12 <= 8192 &&
              var13 <= 8192 &&
              var11 >= -8192 &&
              var12 >= -8192 &&
              var13 >= -8192) {
              var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
              if (var14 <= 0) {
                var14 = 1;
              }
              var11 = var11 * 256 / var14;
              var12 = var12 * 256 / var14;
              var13 = var13 * 256 / var14;
              if (this.field_o != null) {
                var15 = this.field_o[var1Lifetime1];
              } else {
                var15 = 0;
              }
              if (var15 != 0) {
                if (var15 == 1) {
                  if (this.field_n == null) {
                    this.field_n = new e[this.field_y];
                  }
                  dupTemp$0 = new e();
                  this.field_n[var1Lifetime1] = dupTemp$0;
                  var16 = dupTemp$0;
                  var16.field_g = var11;
                  var16.field_h = var12;
                  var16.field_d = var13;
                }
              } else {
                var17 = this.field_j[var2];
                var17.field_g = var17.field_g + var11;
                var17.field_b = var17.field_b + var12;
                var17.field_c = var17.field_c + var13;
                var17.field_d = var17.field_d + 1;
                var18 = this.field_j[var3];
                var18.field_g = var18.field_g + var11;
                var18.field_b = var18.field_b + var12;
                var18.field_c = var18.field_c + var13;
                var18.field_d = var18.field_d + 1;
                var19 = this.field_j[var4];
                var19.field_g = var19.field_g + var11;
                var19.field_b = var19.field_b + var12;
                var19.field_c = var19.field_c + var13;
                var19.field_d = var19.field_d + 1;
              }
              var1Lifetime1++;
              break;
            }
            var11 = var11 >> 1;
            var12 = var12 >> 1;
            var13 = var13 >> 1;
          }
        }
    }

    final m a(int param0, int param1, int param2, int param3, int param4) {
        return (m) ((Object) new ik(this, param0, param1, param2, param3, param4));
    }

    final byte a(short param0, short param1, short param2) {
        if (this.field_f >= 255) {
          throw new IllegalStateException();
        }
        this.field_x[this.field_f] = (byte) 0;
        this.field_d[this.field_f] = (short)param0;
        this.field_B[this.field_f] = (short)param1;
        this.field_z[this.field_f] = (short)param2;
        int fieldTemp$0 = this.field_f;
        this.field_f = this.field_f + 1;
        return (byte)fieldTemp$0;
    }

    final void a() {
        int[] array$2 = null;
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int[] array$5 = null;
        int dupTemp$3 = 0;
        int[] arrayValue$4 = null;
        int var2;
        int var3;
        int var4;
        int[] var5;
        int[] var6;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime1Lifetime1;
        int var2Lifetime1;
        int var3Lifetime1;
        if (this.field_g != null) {
          var5 = new int[256];
          var2 = 0;
          for (var3 = 0; var3 < this.field_r; var3++) {
            var4 = this.field_g[var3];
            var5[var4] = var5[var4] + 1;
            if (var4 > var2) {
              var2 = var4;
            }
          }
          this.field_m = new int[var2 + 1][];
          for (var3 = 0; var3 <= var2; var3++) {
            array$2 = new int[var5[var3]];
            this.field_m[var3] = array$2;
            var5[var3] = 0;
          }
          for (var3 = 0; var3 < this.field_r; var3++) {
            var4Lifetime2 = this.field_g[var3];
            dupTemp$0 = var5[var4Lifetime2];
            arrayValue$1 = this.field_m[var4Lifetime2];
            var5[var4Lifetime2] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var3;
          }
          this.field_g = null;
        }
        if (this.field_s != null) {
          var6 = new int[256];
          var2Lifetime1 = 0;
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_y; var3Lifetime1++) {
            var4Lifetime1 = this.field_s[var3Lifetime1];
            var6[var4Lifetime1] = var6[var4Lifetime1] + 1;
            if (var4Lifetime1 > var2Lifetime1) {
              var2Lifetime1 = var4Lifetime1;
            }
          }
          this.field_A = new int[var2Lifetime1 + 1][];
          for (var3Lifetime1 = 0; var3Lifetime1 <= var2Lifetime1; var3Lifetime1++) {
            array$5 = new int[var6[var3Lifetime1]];
            this.field_A[var3Lifetime1] = array$5;
            var6[var3Lifetime1] = 0;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_y; var3Lifetime1++) {
            var4Lifetime1Lifetime1 = this.field_s[var3Lifetime1];
            dupTemp$3 = var6[var4Lifetime1Lifetime1];
            arrayValue$4 = this.field_A[var4Lifetime1Lifetime1];
            var6[var4Lifetime1Lifetime1] = dupTemp$3 + 1;
            arrayValue$4[dupTemp$3] = var3Lifetime1;
          }
          this.field_s = null;
        }
    }

    final int a(int param0, int param1, int param2, byte param3, byte param4, short param5, short param6) {
        this.field_h[this.field_y] = param0;
        this.field_v[this.field_y] = param1;
        this.field_q[this.field_y] = param2;
        this.field_o[this.field_y] = (byte)param3;
        this.field_c[this.field_y] = (byte)param4;
        this.field_l[this.field_y] = (short)param5;
        this.field_i[this.field_y] = (short)param6;
        int fieldTemp$0 = this.field_y;
        this.field_y = this.field_y + 1;
        return fieldTemp$0;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        for (var4 = 0; var4 < this.field_r; var4++) {
          if (this.field_w[var4] == param0 &&
            this.field_e[var4] == param1 &&
            this.field_u[var4] == param2) {
            return var4;
          }
        }
        this.field_w[this.field_r] = param0;
        this.field_e[this.field_r] = param1;
        this.field_u[this.field_r] = param2;
        int fieldTemp$0 = this.field_r + 1;
        this.field_r = this.field_r + 1;
        this.field_b = fieldTemp$0;
        return this.field_r - 1;
    }

    bb(int param0, int param1, int param2) {
        this.field_y = 0;
        this.field_b = 0;
        this.field_r = 0;
        this.field_w = new int[param0];
        this.field_e = new int[param0];
        this.field_u = new int[param0];
        this.field_g = new int[param0];
        this.field_h = new int[param1];
        this.field_v = new int[param1];
        this.field_q = new int[param1];
        this.field_o = new byte[param1];
        this.field_p = new byte[param1];
        this.field_k = new byte[param1];
        this.field_l = new short[param1];
        this.field_i = new short[param1];
        this.field_c = new byte[param1];
        this.field_s = new int[param1];
        if (param2 > 0) {
          this.field_x = new byte[param2];
          this.field_d = new short[param2];
          this.field_B = new short[param2];
          this.field_z = new short[param2];
        }
    }
}
