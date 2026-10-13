/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends IntrusiveNode {
    private int field_I;
    static int[] field_G;
    private int[][] field_D;
    static RgbSprite[] field_l;
    private int field_k;
    private int field_w;
    private int field_H;
    static RgbSprite field_z;
    private int[][] field_m;
    private int field_o;
    private int field_K;
    private int field_j;
    private int field_u;
    private int[] field_y;
    private int[] field_r;
    private int[] field_n;
    private int field_x;
    private int field_N;
    private int[] field_C;
    private int field_t;
    private int[] field_A;
    private int[] field_P;
    private int field_q;
    private int field_E;
    private int field_i;
    static String field_F;
    private int field_J;
    private int field_B;
    private int field_p;
    private int field_s;
    private int field_O;
    static int[] viewFacePointOneX;
    private int field_L;

    final void c(int param0) {
        int fieldTemp$0 = 0;
        int var2 = 0;
        int var3;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (this.field_K > 0) {
          fieldTemp$0 = this.field_K - 1;
          this.field_K = this.field_K - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
        }
        for (var2 = param0; var2 < this.field_w; var2++) {
          if (this.field_k > this.field_I) {
            this.field_D[var2][this.field_J] = this.field_A[var2];
            this.field_m[var2][this.field_J] = this.field_C[var2];
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_B > this.field_k) {
            this.field_r[var2] = this.field_r[var2] * 91 / 100;
            this.field_y[var2] = this.field_y[var2] * 91 / 100;
          } else {
            if (this.field_k > this.field_q) {
              this.field_y[var2] = this.field_y[var2] + this.field_O;
              this.field_r[var2] = this.field_r[var2] + this.field_p;
              if (this.field_o >= this.field_k) {
                this.field_A[var2] = this.field_A[var2] + this.field_r[var2];
                this.field_C[var2] = this.field_C[var2] + this.field_y[var2];
                decompiledFrameRemainder0 = false;
              }
              else {
                if (this.field_p == 0) {
                  this.field_p = JungleBackground.field_r.nextBoundedInt(-37880252, 3) - 1;
                } else {
                  this.field_p = -this.field_p;
                }
                this.field_o = this.field_u + 1;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            this.field_A[var2] = this.field_A[var2] + this.field_r[var2];
            this.field_C[var2] = this.field_C[var2] + this.field_y[var2];
          }
        }
        if (this.field_k > this.field_t) {
          this.field_j = this.field_j + 1;
        }
        if (this.field_I < this.field_k) {
          if (this.field_O != 0 &&
            2 * this.field_q <= this.field_k) {
            this.field_J = this.field_J + 1;
          } else {
            if (this.field_k % 3 == 0) {
              this.field_J = this.field_J + 1;
            }
          }
        }
        int fieldTemp$1 = this.field_k + 1;
        this.field_k = this.field_k + 1;
        if (this.field_u == fieldTemp$1) {
          this.unlink((byte) 111);
          dl.field_f = dl.field_f - 1;
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 != -1196049244) {
          nj.a(76);
        }
        if (0 < this.field_K) {
          return;
        }
        for (var3 = 0; this.field_w > var3; var3++) {
          for (var4 = 0; var4 < this.field_J; var4++) {
            Rasterizer2D.a((this.field_D[var3][var4] >> 4) + param1, this.field_m[var3][var4] >> 4, 48, -(this.field_i * this.field_j) + 64, eb.field_r[this.field_P[var3]]);
          }
          Rasterizer2D.a(param1 + (this.field_A[var3] >> 4), this.field_C[var3] >> 4, 224, -(this.field_j * this.field_E) + 165, eb.field_r[this.field_n[var3]]);
          Rasterizer2D.a((this.field_A[var3] >> 4) + param1, this.field_C[var3] >> 4, 64, -(this.field_x * this.field_j) + 250, eb.field_r[this.field_n[var3]]);
        }
        return;
    }

    public static void a(int param0) {
        field_F = null;
        if (param0 != 0) {
          field_F = (String) null;
        }
        field_z = null;
        field_G = null;
        field_l = null;
        viewFacePointOneX = null;
    }

    nj(int param0, int param1, int param2, int param3) {
        int var11 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        this.field_H = param1;
        this.field_L = param0;
        this.field_w = this.field_H * this.field_L;
        this.field_s = param2 << 8;
        this.field_N = param3 << 8;
        this.field_K = 30 + JungleBackground.field_r.nextBoundedInt(-37880252, 30);
        this.field_u = 100 + JungleBackground.field_r.nextBoundedInt(-37880252, 30);
        this.field_I = JungleBackground.field_r.nextBoundedInt(-37880252, 5) + 12;
        this.field_B = 19 + JungleBackground.field_r.nextBoundedInt(-37880252, 3);
        this.field_q = JungleBackground.field_r.nextBoundedInt(-37880252, 10) + 25;
        this.field_t = JungleBackground.field_r.nextBoundedInt(-37880252, 15) + 80;
        this.field_o = 2 * JungleBackground.field_r.nextBoundedInt(-37880252, this.field_u);
        this.field_O = JungleBackground.field_r.nextBoundedInt(-37880252, 2) << 1;
        this.field_p = JungleBackground.field_r.nextBoundedInt(-37880252, 3) - 1;
        this.field_D = new int[this.field_w][this.field_u];
        this.field_y = new int[this.field_w];
        this.field_n = new int[this.field_w];
        this.field_C = new int[this.field_w];
        this.field_A = new int[this.field_w];
        this.field_P = new int[this.field_w];
        this.field_r = new int[this.field_w];
        this.field_m = new int[this.field_w][this.field_u];
        int var5 = 0;
        int var6 = JungleBackground.field_r.nextBoundedInt(-37880252, 64) + 192;
        int var7 = 8192 / this.field_H;
        int var8 = 0;
        for (var11 = 0; this.field_L > var11; var11++) {
          var9 = JungleBackground.field_r.nextBoundedInt(-37880252, eb.field_q.length);
          var10 = JungleBackground.field_r.nextBoundedInt(-37880252, eb.field_q.length);
          for (var12 = 0; this.field_H > var12; var12++) {
            var8 = JungleBackground.field_r.nextBoundedInt(-37880252, 800);
            this.field_A[var5] = this.field_s + (JungleBackground.field_r.nextBoundedInt(-37880252, 4) - 2 << 8);
            this.field_C[var5] = this.field_N + (-2 + JungleBackground.field_r.nextBoundedInt(-37880252, 4) << 8);
            this.field_r[var5] = (InteractiveGameClient.sine8192(var12 * var7 + var8, -4097) >> 8) * var6 >> 8;
            this.field_y[var5] = var6 * (BrickABrac.cosine8192(2048, var8 + var12 * var7) >> 8) >> 8;
            this.field_n[var5] = var9;
            this.field_P[var5] = var10;
            var5++;
          }
          var6 = var6 + (128 + JungleBackground.field_r.nextBoundedInt(-37880252, 64));
        }
        this.field_E = 165 / (this.field_u - this.field_t);
        this.field_i = 64 / (this.field_u - this.field_t);
        this.field_x = 250 / (-this.field_t + this.field_u);
    }

    static {
        field_G = new int[]{31114, 12658477, 16494651, 26679, 16711935};
        field_F = "Searching for opponents";
        viewFacePointOneX = new int[8192];
    }
}
