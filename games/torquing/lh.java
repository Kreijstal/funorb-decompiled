/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    int[] field_F;
    int[][] field_e;
    static boolean field_J;
    int[] field_h;
    private fi field_a;
    int field_c;
    int[] field_C;
    int field_k;
    int[] field_v;
    int[][] field_l;
    int[] field_i;
    private int[] field_s;
    int[] field_K;
    gg[] field_o;
    int[] field_p;
    int[] field_N;
    int[] field_w;
    byte[][] field_m;
    int[] field_b;
    int[][] field_f;
    int[][] field_D;
    int[] field_L;
    int field_B;
    private int[] field_n;
    int[] field_q;
    int[] field_t;
    int field_E;
    int field_M;
    int[] field_z;
    private int field_d;
    int[] field_y;
    static uc field_O;
    private int field_r;
    int[] field_j;
    static ne field_u;
    int[] field_x;
    int[] field_I;
    int[][] field_g;
    int[] field_G;

    final static ha a(int param0) {
        if (param0 != -24858) {
            lh.a(5);
        }
        return (ha) ((Object) new np());
    }

    public static void b(int param0) {
        field_O = null;
        field_u = null;
        int var1 = -85 / ((-35 - param0) / 46);
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var5;
        gg var4;
        var5 = Torquing.field_u;
        if (this.field_a == null) {
          return;
        } else {
          L0: {
            var2 = 1;
            if (param0 == -71) {
              break L0;
            } else {
              this.field_d = -53;
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= this.field_o.length) {
              L2: {
                if (var2 != 0) {
                  this.field_a = null;
                  this.field_n = null;
                  this.field_s = null;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              if (this.field_o[var3] == null) {
                L3: {
                  if (-1 == (this.field_y[var3] >> 809422884 ^ -1)) {
                    var4 = this.field_a.a(this.field_s[var3], this.field_n[var3], (byte) -84);
                    break L3;
                  } else {
                    var4 = this.field_a.b(this.field_s[var3], this.field_n[var3], (byte) 122);
                    break L3;
                  }
                }
                if (var4 == null) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  this.field_y[var3] = ie.a(this.field_y[var3], 15);
                  this.field_o[var3] = var4;
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    lh(fj param0, fi param1) {
        int var3_int = 0;
        int var4 = 0;
        int dupTemp$0 = 0;
        byte[] var16 = null;
        int var7 = 0;
        int dupTemp$1 = 0;
        int var9 = 0;
        int[] array$2 = null;
        int var10 = 0;
        int dupTemp$3 = 0;
        int[] array$4 = null;
        int dupTemp$5 = 0;
        int[] array$6 = null;
        int dupTemp$7 = 0;
        int[] array$8 = null;
        int dupTemp$9 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var11 = 0;
        try {
            this.field_a = param1;
            this.field_k = param0.i((byte) -101) - -1;
            param0.i((byte) -101);
            this.field_M = param0.i((byte) -101) - -1;
            this.field_d = 1 + param0.i((byte) -101);
            this.field_r = 1 + param0.i((byte) -101);
            var3_int = param0.i((byte) -101);
            this.field_E = var3_int & 1;
            this.field_B = param0.i((byte) -101);
            this.field_c = param0.i((byte) -101);
            this.field_K = new int[this.field_k];
            var4 = 0;
            for (var5 = 0; var5 < this.field_k; var5++) {
                dupTemp$0 = var4 + param0.i((byte) -101);
                var4 = dupTemp$0;
                this.field_K[var5] = ie.a(dupTemp$0, 255);
            }
            this.field_j = new int[256];
            this.field_m = new byte[256][];
            dk.a(this.field_j, 0, 256, 64);
            for (var5 = 0; 256 > var5; var5++) {
                this.field_m[var5] = ob.field_a;
            }
            for (var5 = 0; this.field_d > var5; var5++) {
                this.field_j[var5] = 1 + param0.i((byte) -101);
                var6 = param0.i(7088);
                var16 = new byte[var6];
                if (var6 > 0) {
                    param0.a(48, var6, var16, 0);
                    this.field_m[var5] = var16;
                }
            }
            this.field_L = new int[this.field_r];
            this.field_f = new int[this.field_r][];
            this.field_q = new int[this.field_r];
            this.field_N = new int[this.field_r];
            this.field_b = new int[this.field_r];
            this.field_G = new int[this.field_r];
            this.field_l = new int[this.field_r][96];
            this.field_D = new int[this.field_r][];
            this.field_h = new int[this.field_r];
            this.field_I = new int[this.field_r];
            this.field_p = new int[this.field_r];
            this.field_g = new int[this.field_r][];
            this.field_e = new int[this.field_r][];
            this.field_i = new int[this.field_r];
            var5 = param0.i(7088);
            this.field_x = new int[var5];
            this.field_o = new gg[var5];
            this.field_F = new int[var5];
            this.field_z = new int[var5];
            this.field_w = new int[var5];
            this.field_v = new int[var5];
            this.field_s = new int[var5];
            this.field_C = new int[var5];
            this.field_t = new int[var5];
            this.field_n = new int[var5];
            this.field_y = new int[var5];
            var5 = 0;
            for (var6 = 0; this.field_r > var6; var6++) {
                var7 = param0.i((byte) -101);
                if (0 < var7) {
                    var4 = 0;
                    for (var8 = 0; 96 > var8; var8++) {
                        dupTemp$1 = var4 + param0.i((byte) -101);
                        var4 = dupTemp$1;
                        this.field_l[var6][var8] = ie.a(dupTemp$1, 255) + var5;
                    }
                    this.field_I[var6] = param0.i((byte) -101);
                    var8 = param0.i((byte) -101);
                    this.field_L[var6] = param0.i((byte) -101);
                    this.field_N[var6] = param0.i((byte) -101);
                    this.field_G[var6] = this.field_N[var6] + param0.i((byte) -101);
                    this.field_h[var6] = param0.i((byte) -101);
                    var9 = param0.i((byte) -101);
                    this.field_b[var6] = param0.i((byte) -101);
                    this.field_q[var6] = param0.i((byte) -101);
                    this.field_p[var6] = this.field_q[var6] + param0.i((byte) -101);
                    var4 = 0;
                    array$2 = new int[var8];
                    this.field_e[var6] = array$2;
                    var10 = 0;
                    for (var11 = 0; var11 < var8; var11++) {
                        dupTemp$3 = var10 + param0.g((byte) -119);
                        var10 = dupTemp$3;
                        var4 = var4 + dupTemp$3;
                        this.field_e[var6][var11] = var4 + dupTemp$3;
                    }
                    array$4 = new int[var8];
                    this.field_D[var6] = array$4;
                    var4 = 0;
                    for (var11 = 0; var11 < var8; var11++) {
                        dupTemp$5 = var4 + param0.i((byte) -101);
                        var4 = dupTemp$5;
                        this.field_D[var6][var11] = ie.a(dupTemp$5, 255);
                    }
                    var4 = 0;
                    var10 = 0;
                    array$6 = new int[var9];
                    this.field_g[var6] = array$6;
                    for (var11 = 0; var9 > var11; var11++) {
                        dupTemp$7 = var10 + param0.g((byte) -116);
                        var10 = dupTemp$7;
                        var4 = var4 + dupTemp$7;
                        this.field_g[var6][var11] = var4 + dupTemp$7;
                    }
                    var4 = 0;
                    array$8 = new int[var9];
                    this.field_f[var6] = array$8;
                    for (var11 = 0; var9 > var11; var11++) {
                        dupTemp$9 = var4 + param0.i((byte) -101);
                        var4 = dupTemp$9;
                        this.field_f[var6][var11] = ie.a(dupTemp$9, 255);
                    }
                    this.field_i[var6] = param0.i(7088);
                    for (var11 = 0; var11 < var7; var11++) {
                        this.field_v[var5] = param0.e((byte) 62);
                        this.field_w[var5] = param0.e((byte) 62);
                        this.field_t[var5] = this.field_w[var5] - -param0.e((byte) 62);
                        this.field_F[var5] = param0.i((byte) -101);
                        this.field_z[var5] = param0.f((byte) 90);
                        this.field_y[var5] = param0.i((byte) -101);
                        this.field_x[var5] = param0.i((byte) -101);
                        this.field_C[var5] = param0.f((byte) 25) + -1;
                        this.field_n[var5] = param0.i(7088);
                        this.field_s[var5] = param0.i(7088);
                        var5++;
                    }
                }
            }
            this.a((byte) -71);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
