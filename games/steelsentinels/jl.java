/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    int[] field_g;
    static int field_r;
    int[] field_m;
    jk field_n;
    byte[][] field_t;
    private int field_b;
    static float field_c;
    jk[] field_d;
    static int field_p;
    int[] field_h;
    int field_k;
    private int[][] field_q;
    int field_e;
    int[] field_j;
    static SceneWidget field_s;
    private byte[] field_l;
    int field_u;
    static oe field_w;
    static String field_f;
    private int[] field_v;
    int[] field_a;
    static String field_i;
    int[][] field_o;

    final static void a(boolean param0) {
        aj var1 = (aj) (sl.field_b.c(-6533));
        if (var1 == null) {
          var1 = new aj();
        }
        var1.a(SoftwareRaster.field_b, SoftwareRaster.field_i, SoftwareRaster.field_c, SoftwareRaster.field_l, SoftwareRaster.field_g, SoftwareRaster.field_d, SoftwareRaster.field_j, (byte) -62);
        ff.field_qb.addLast(3, var1);
        if (param0) {
          jl.a(true);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_w = null;
        if (param0 != 0) {
          jl.a(81);
        }
        field_i = null;
        field_s = null;
    }

    private final void a(byte[] param0, int param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        PacketBuffer var17 = null;
        byte[] var21 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = SteelSentinels.obfuscationControl;
        try {
          var17 = new PacketBuffer(ln.a(param0, (byte) 127));
          var4 = var17.f((byte) -66);
          if (5 <= var4 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.field_k = var17.i(0);
            } else {
              this.field_k = 0;
            }
            var5 = var17.f((byte) -111);
            stackIn_11_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (var4 < 7) {
              this.field_b = var17.c((byte) -60);
            } else {
              this.field_b = var17.c(true);
            }
            stackIn_17_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            var9 = -1;
            this.field_h = new int[this.field_b];
            if (7 > var4) {
              for (var10 = 0; this.field_b > var10; var10++) {
                dupTemp$0 = var8 + var17.c((byte) -60);
                var8 = dupTemp$0;
                this.field_h[var10] = dupTemp$0;
                if (this.field_h[var10] > var9) {
                  var9 = this.field_h[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_b > var10; var10++) {
                dupTemp$1 = var8 + var17.c(true);
                var8 = dupTemp$1;
                this.field_h[var10] = dupTemp$1;
                if (this.field_h[var10] > var9) {
                  var9 = this.field_h[var10];
                }
              }
            }
            this.field_u = 1 + var9;
            this.field_o = new int[this.field_u][];
            this.field_g = new int[this.field_u];
            if (var7 != 0) {
              this.field_t = new byte[this.field_u][];
            }
            this.field_j = new int[this.field_u];
            this.field_a = new int[this.field_u];
            this.field_m = new int[this.field_u];
            if (var6 != 0) {
              this.field_v = new int[this.field_u];
              for (var10Lifetime1 = 0; this.field_u > var10Lifetime1; var10Lifetime1++) {
                this.field_v[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_b; var10Lifetime1Lifetime1++) {
                this.field_v[this.field_h[var10Lifetime1Lifetime1]] = var17.i(0);
              }
              this.field_n = new jk(this.field_v);
            }
            for (var10Lifetime2 = 0; this.field_b > var10Lifetime2; var10Lifetime2++) {
              this.field_a[this.field_h[var10Lifetime2]] = var17.i(0);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_b; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(0, var21, 28, 64);
                this.field_t[this.field_h[var10Lifetime3]] = var21;
              }
            }
            if (param1 < 64) {
              return;
            }
            for (var10Lifetime4 = 0; this.field_b > var10Lifetime4; var10Lifetime4++) {
              this.field_m[this.field_h[var10Lifetime4]] = var17.i(0);
            }
            if (var4 < 7) {
              for (var10Lifetime5 = 0; this.field_b > var10Lifetime5; var10Lifetime5++) {
                this.field_j[this.field_h[var10Lifetime5]] = var17.c((byte) -60);
              }
              for (var10Lifetime5 = 0; this.field_b > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_h[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_j[var11];
                array$2 = new int[var12];
                this.field_o[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.c((byte) -60);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_o[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_g[var11] = 1 + var13;
                if (var12 == 1 + var13) {
                  this.field_o[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; this.field_b > var10Lifetime5; var10Lifetime5++) {
                this.field_j[this.field_h[var10Lifetime5]] = var17.c(true);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_b; var10Lifetime5++) {
                var11 = this.field_h[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_j[var11];
                var13 = -1;
                array$5 = new int[var12];
                this.field_o[var11] = array$5;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.c(true);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_o[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_g[var11] = var13 + 1;
                if (var13 + 1 == var12) {
                  this.field_o[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_d = new jk[var9 + 1];
              this.field_q = new int[1 + var9][];
              for (var10Lifetime6 = 0; this.field_b > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_h[var10Lifetime6];
                var12Lifetime1 = this.field_j[var11Lifetime1];
                array$8 = new int[this.field_g[var11Lifetime1]];
                this.field_q[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_g[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_q[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null == this.field_o[var11Lifetime1]) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_o[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_q[var11Lifetime1][var14Lifetime1] = var17.i(0);
                }
                this.field_d[var11Lifetime1] = new jk(this.field_q[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_103_0 = var3;
          stackIn_103_1 = new StringBuilder().append("jl.C(");
          if (param0 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param1).append(')').toString());
        }
    }

    jl(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_e = ba.a((byte) -107, param0, param0.length);
          if (this.field_e != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (64 != param2.length) {
              throw new RuntimeException();
            }
            this.field_l = co.a((byte) -37, param0.length, 0, param0);
            for (var4_int = 0; 64 > var4_int; var4_int++) {
              if (param2[var4_int] != this.field_l[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, 70);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Unpacking graphics";
        field_f = "Click or press F10 to open Quick Chat";
    }
}
