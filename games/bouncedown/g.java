/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    da[] field_k;
    private byte[] field_l;
    int[] field_j;
    int field_b;
    private int[] field_d;
    private int field_f;
    int[][] field_o;
    static String field_i;
    int[] field_n;
    int field_m;
    private int[][] field_p;
    da field_a;
    int[] field_g;
    int field_h;
    byte[][] field_e;
    int[] field_c;
    int[] field_q;

    final static we b(int param0) {
        we var1 = new we(se.field_C, fk.field_e, cl.field_n[0], ae.field_c[0], ih.field_V[0], qh.field_i[0], ph.field_c[0], he.field_k);
        if (param0 != -8964) {
          field_i = (String) null;
        }
        vb.a((byte) 122);
        return var1;
    }

    private final void a(int param0, byte[] param1) {
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
        int stackIn_19_0 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
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
        wi var17 = null;
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
        var16 = Bounce.field_N;
        try {
          var17 = new wi(ta.a(21125, param1));
          var4 = var17.d((byte) -86);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.field_h = 0;
            } else {
              this.field_h = var17.j(param0 ^ 10990);
            }
            var5 = var17.d((byte) -69);
            stackIn_11_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (param0 != -10989) {
              return;
            }
            if (var4 >= 7) {
              this.field_f = var17.e(param0 + 11061);
            } else {
              this.field_f = var17.a(-1640531527);
            }
            stackIn_19_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_19_0;
            var8 = 0;
            var9 = -1;
            this.field_n = new int[this.field_f];
            if (var4 < 7) {
              for (var10 = 0; this.field_f > var10; var10++) {
                dupTemp$0 = var8 + var17.a(-1640531527);
                var8 = dupTemp$0;
                this.field_n[var10] = dupTemp$0;
                if (var9 < this.field_n[var10]) {
                  var9 = this.field_n[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_f > var10; var10++) {
                dupTemp$1 = var8 + var17.e(48);
                var8 = dupTemp$1;
                this.field_n[var10] = dupTemp$1;
                if (this.field_n[var10] > var9) {
                  var9 = this.field_n[var10];
                }
              }
            }
            this.field_m = 1 + var9;
            this.field_o = new int[this.field_m][];
            this.field_g = new int[this.field_m];
            this.field_j = new int[this.field_m];
            this.field_q = new int[this.field_m];
            this.field_c = new int[this.field_m];
            if (var7 != 0) {
              this.field_e = new byte[this.field_m][];
            }
            if (var6 != 0) {
              this.field_d = new int[this.field_m];
              for (var10Lifetime1 = 0; this.field_m > var10Lifetime1; var10Lifetime1++) {
                this.field_d[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_f; var10Lifetime1Lifetime1++) {
                this.field_d[this.field_n[var10Lifetime1Lifetime1]] = var17.j(-3);
              }
              this.field_a = new da(this.field_d);
            }
            for (var10Lifetime2 = 0; this.field_f > var10Lifetime2; var10Lifetime2++) {
              this.field_j[this.field_n[var10Lifetime2]] = var17.j(-3);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; this.field_f > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a((byte) 127, 64, var21, 0);
                this.field_e[this.field_n[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; this.field_f > var10Lifetime4; var10Lifetime4++) {
              this.field_g[this.field_n[var10Lifetime4]] = var17.j(-3);
            }
            if (var4 < 7) {
              for (var10Lifetime5 = 0; this.field_f > var10Lifetime5; var10Lifetime5++) {
                this.field_q[this.field_n[var10Lifetime5]] = var17.a(-1640531527);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_f; var10Lifetime5++) {
                var11 = this.field_n[var10Lifetime5];
                var12 = this.field_q[var11];
                var8Lifetime1 = 0;
                array$2 = new int[var12];
                this.field_o[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.a(-1640531527);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_o[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_c[var11] = 1 + var13;
                if (var12 == 1 + var13) {
                  this.field_o[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_f; var10Lifetime5++) {
                this.field_q[this.field_n[var10Lifetime5]] = var17.e(param0 + 11067);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_f; var10Lifetime5++) {
                var11 = this.field_n[var10Lifetime5];
                var12 = this.field_q[var11];
                var8Lifetime1 = 0;
                array$5 = new int[var12];
                this.field_o[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.e(87);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_o[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_c[var11] = 1 + var13;
                if (var13 + 1 == var12) {
                  this.field_o[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_k = new da[1 + var9];
              this.field_p = new int[var9 + 1][];
              for (var10Lifetime6 = 0; this.field_f > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_n[var10Lifetime6];
                var12Lifetime1 = this.field_q[var11Lifetime1];
                array$8 = new int[this.field_c[var11Lifetime1]];
                this.field_p[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_c[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_p[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null != this.field_o[var11Lifetime1]) {
                    var14Lifetime1 = this.field_o[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_p[var11Lifetime1][var14Lifetime1] = var17.j(ud.a(param0, 10990));
                }
                this.field_k[var11Lifetime1] = new da(this.field_p[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_98_0 = var3;
          stackIn_98_1 = new StringBuilder().append("g.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 6623) {
          g.b(-67);
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
          return false;
        }
        return dl.a((byte) -75);
    }

    g(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_b = nb.a(param0, param0.length, (byte) 44);
          if (this.field_b != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (64 != param2.length) {
              throw new RuntimeException();
            }
            this.field_l = jd.a(param0, 0, param0.length, 0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_l[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(-10989, param0);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "g.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
