/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static wl field_n;
    td[] field_h;
    int[] field_k;
    int[] field_J;
    byte[][] field_L;
    static te field_E;
    int[] field_q;
    int[] field_a;
    int field_K;
    int field_e;
    int[] field_A;
    int field_f;
    int[] field_b;
    int[] field_C;
    int[] field_x;
    private int field_G;
    int[] field_c;
    private ud field_i;
    int[][] field_t;
    static lg field_M;
    int[][] field_y;
    private int[] field_p;
    int[] field_N;
    int[] field_B;
    int[][] field_z;
    int field_j;
    int[] field_H;
    int[] field_O;
    int[] field_g;
    int[] field_d;
    int[] field_v;
    int[] field_o;
    static int field_w;
    int[] field_m;
    int[] field_F;
    private int[] field_l;
    int[][] field_u;
    int[][] field_r;
    int field_s;
    private int field_D;
    static String field_I;

    public static void b(int param0) {
        field_I = null;
        if (param0 != -24358) {
            lg.a((byte) 12);
        }
        field_M = null;
        field_E = null;
        field_n = null;
    }

    final static void a(byte param0) {
        if (param0 < 62) {
            lg.a((byte) 84);
        }
        cl.field_e = MonkeyPuzzle2.field_D.f(-1);
        CharSequence var2 = (CharSequence) ((Object) cl.field_e);
        uj.field_f = pl.a((byte) 112, var2);
    }

    private final void a(int param0) {
        int var2;
        int var3;
        int var5;
        td var4;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_i != null) {
          L0: {
            var2 = 1;
            if (param0 == -1) {
              break L0;
            } else {
              lg.a((byte) -30);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= this.field_h.length) {
              L2: {
                if (var2 == 0) {
                  break L2;
                } else {
                  this.field_i = null;
                  this.field_l = null;
                  this.field_p = null;
                  break L2;
                }
              }
              return;
            } else {
              if (this.field_h[var3] == null) {
                L3: {
                  if (this.field_c[var3] >> 185712036 != 0) {
                    var4 = this.field_i.a(this.field_p[var3], this.field_l[var3], true);
                    break L3;
                  } else {
                    var4 = this.field_i.a(param0 + -18479, this.field_l[var3], this.field_p[var3]);
                    break L3;
                  }
                }
                if (var4 == null) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  this.field_c[var3] = ch.a(this.field_c[var3], 15);
                  this.field_h[var3] = var4;
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    lg(gk param0, ud param1) {
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
            this.field_i = param1;
            this.field_s = 1 + param0.a((byte) 114);
            param0.a((byte) 114);
            this.field_j = 1 + param0.a((byte) 114);
            this.field_D = 1 + param0.a((byte) 114);
            this.field_G = param0.a((byte) 114) + 1;
            var3_int = param0.a((byte) 114);
            this.field_e = 1 & var3_int;
            this.field_f = param0.a((byte) 114);
            this.field_K = param0.a((byte) 114);
            this.field_q = new int[this.field_s];
            var4 = 0;
            for (var5 = 0; this.field_s > var5; var5++) {
                dupTemp$0 = var4 + param0.a((byte) 114);
                var4 = dupTemp$0;
                this.field_q[var5] = ch.a(255, dupTemp$0);
            }
            this.field_L = new byte[256][];
            this.field_x = new int[256];
            gl.a(this.field_x, 0, 256, 64);
            for (var5 = 0; (var5 ^ -1) > -257; var5++) {
                this.field_L[var5] = ah.field_c;
            }
            for (var5 = 0; this.field_D > var5; var5++) {
                this.field_x[var5] = 1 + param0.a((byte) 114);
                var6 = param0.j(17277);
                var16 = new byte[var6];
                if (-1 > (var6 ^ -1)) {
                    param0.a(var16, var6, -121, 0);
                    this.field_L[var5] = var16;
                }
            }
            this.field_r = new int[this.field_G][];
            this.field_H = new int[this.field_G];
            this.field_J = new int[this.field_G];
            this.field_y = new int[this.field_G][];
            this.field_t = new int[this.field_G][96];
            this.field_z = new int[this.field_G][];
            this.field_k = new int[this.field_G];
            this.field_C = new int[this.field_G];
            this.field_F = new int[this.field_G];
            this.field_d = new int[this.field_G];
            this.field_v = new int[this.field_G];
            this.field_b = new int[this.field_G];
            this.field_m = new int[this.field_G];
            this.field_u = new int[this.field_G][];
            var5 = param0.j(17277);
            this.field_l = new int[var5];
            this.field_B = new int[var5];
            this.field_h = new td[var5];
            this.field_c = new int[var5];
            this.field_g = new int[var5];
            this.field_a = new int[var5];
            this.field_N = new int[var5];
            this.field_A = new int[var5];
            this.field_p = new int[var5];
            this.field_o = new int[var5];
            this.field_O = new int[var5];
            var5 = 0;
            for (var6 = 0; this.field_G > var6; var6++) {
                var7 = param0.a((byte) 114);
                if (-1 > (var7 ^ -1)) {
                    var4 = 0;
                    for (var8 = 0; -97 < (var8 ^ -1); var8++) {
                        dupTemp$1 = var4 + param0.a((byte) 114);
                        var4 = dupTemp$1;
                        this.field_t[var6][var8] = ch.a(255, dupTemp$1) + var5;
                    }
                    this.field_d[var6] = param0.a((byte) 114);
                    var8 = param0.a((byte) 114);
                    this.field_k[var6] = param0.a((byte) 114);
                    this.field_b[var6] = param0.a((byte) 114);
                    this.field_H[var6] = this.field_b[var6] + param0.a((byte) 114);
                    this.field_J[var6] = param0.a((byte) 114);
                    var9 = param0.a((byte) 114);
                    this.field_F[var6] = param0.a((byte) 114);
                    this.field_C[var6] = param0.a((byte) 114);
                    this.field_v[var6] = this.field_C[var6] + param0.a((byte) 114);
                    var4 = 0;
                    array$2 = new int[var8];
                    this.field_y[var6] = array$2;
                    var10 = 0;
                    for (var11 = 0; var8 > var11; var11++) {
                        dupTemp$3 = var10 + param0.h(-129);
                        var10 = dupTemp$3;
                        var4 = var4 + dupTemp$3;
                        this.field_y[var6][var11] = var4 + dupTemp$3;
                    }
                    array$4 = new int[var8];
                    this.field_u[var6] = array$4;
                    var4 = 0;
                    for (var11 = 0; var11 < var8; var11++) {
                        dupTemp$5 = var4 + param0.a((byte) 114);
                        var4 = dupTemp$5;
                        this.field_u[var6][var11] = ch.a(255, dupTemp$5);
                    }
                    array$6 = new int[var9];
                    this.field_r[var6] = array$6;
                    var4 = 0;
                    var10 = 0;
                    for (var11 = 0; var11 < var9; var11++) {
                        dupTemp$7 = var10 + param0.h(-129);
                        var10 = dupTemp$7;
                        var4 = var4 + dupTemp$7;
                        this.field_r[var6][var11] = var4 + dupTemp$7;
                    }
                    var4 = 0;
                    array$8 = new int[var9];
                    this.field_z[var6] = array$8;
                    for (var11 = 0; var9 > var11; var11++) {
                        dupTemp$9 = var4 + param0.a((byte) 114);
                        var4 = dupTemp$9;
                        this.field_z[var6][var11] = ch.a(dupTemp$9, 255);
                    }
                    this.field_m[var6] = param0.j(17277);
                    for (var11 = 0; var11 < var7; var11++) {
                        this.field_o[var5] = param0.c((byte) -127);
                        this.field_B[var5] = param0.c((byte) 109);
                        this.field_A[var5] = this.field_B[var5] + param0.c((byte) 86);
                        this.field_a[var5] = param0.a((byte) 114);
                        this.field_g[var5] = param0.k(102);
                        this.field_c[var5] = param0.a((byte) 114);
                        this.field_N[var5] = param0.a((byte) 114);
                        this.field_O[var5] = param0.k(28) + -1;
                        this.field_l[var5] = param0.j(17277);
                        this.field_p[var5] = param0.j(17277);
                        var5++;
                    }
                }
            }
            this.a(-1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "lg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_E = new te(9, 0, 4, 1);
        field_I = "The tips are currently off.";
    }
}
