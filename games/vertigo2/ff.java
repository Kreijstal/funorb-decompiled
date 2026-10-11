/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static String[] field_n;
    static int field_b;
    int[] field_l;
    byte[][] field_s;
    private int field_q;
    pq field_k;
    int[][] field_g;
    static long field_d;
    int field_c;
    int[] field_h;
    int[] field_e;
    static boolean field_m;
    static String field_u;
    int[] field_j;
    private int[] field_f;
    private byte[] field_a;
    int[] field_r;
    pq[] field_t;
    static String field_v;
    int field_p;
    private int[][] field_i;
    int field_o;

    final static void b(byte param0) {
        vd.field_b = new mk();
        n.field_b.a(false, vd.field_b);
        if (param0 != -104) {
          field_b = 45;
        }
    }

    private final void a(byte[] param0, boolean param1) {
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
        int stackIn_14_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
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
        ed var17 = null;
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
        var16 = Vertigo2.field_L ? 1 : 0;
        try {
          var17 = new ed(hm.a(-20595, param0));
          var4 = var17.h(-11);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.field_c = 0;
            } else {
              this.field_c = var17.b(true);
            }
            var5 = var17.h(-11);
            stackIn_11_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((2 & var5) == 0) ? 0 : 1;
            var7 = stackIn_14_0;
            if (var4 >= 7) {
              this.field_q = var17.a(82);
            } else {
              this.field_q = var17.a((byte) -11);
            }
            var8 = 0;
            var9 = -1;
            this.field_e = new int[this.field_q];
            if (var4 < 7) {
              for (var10 = 0; var10 < this.field_q; var10++) {
                dupTemp$0 = var8 + var17.a((byte) -11);
                var8 = dupTemp$0;
                this.field_e[var10] = dupTemp$0;
                if (this.field_e[var10] > var9) {
                  var9 = this.field_e[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_q > var10; var10++) {
                dupTemp$1 = var8 + var17.a(118);
                var8 = dupTemp$1;
                this.field_e[var10] = dupTemp$1;
                if (var9 < this.field_e[var10]) {
                  var9 = this.field_e[var10];
                }
              }
            }
            this.field_p = 1 + var9;
            if (var7 != 0) {
              this.field_s = new byte[this.field_p][];
            }
            this.field_h = new int[this.field_p];
            this.field_g = new int[this.field_p][];
            this.field_j = new int[this.field_p];
            this.field_l = new int[this.field_p];
            this.field_r = new int[this.field_p];
            if (var6 != 0) {
              this.field_f = new int[this.field_p];
              for (var10Lifetime1 = 0; this.field_p > var10Lifetime1; var10Lifetime1++) {
                this.field_f[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_q; var10Lifetime1Lifetime1++) {
                this.field_f[this.field_e[var10Lifetime1Lifetime1]] = var17.b(true);
              }
              this.field_k = new pq(this.field_f);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_q; var10Lifetime2++) {
              this.field_j[this.field_e[var10Lifetime2]] = var17.b(true);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_q; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(0, var21, 64, 78);
                this.field_s[this.field_e[var10Lifetime3]] = var21;
              }
            }
            var10Lifetime4 = 0;
            if (!param1) {
              return;
            }
            while (this.field_q > var10Lifetime4) {
              this.field_l[this.field_e[var10Lifetime4]] = var17.b(param1);
              var10Lifetime4++;
            }
            if (var4 >= 7) {
              for (var10Lifetime5 = 0; this.field_q > var10Lifetime5; var10Lifetime5++) {
                this.field_h[this.field_e[var10Lifetime5]] = var17.a(113);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_q; var10Lifetime5++) {
                var11 = this.field_e[var10Lifetime5];
                var12 = this.field_h[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$2 = new int[var12];
                this.field_g[var11] = array$2;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.a(83);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_g[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_r[var11] = 1 + var13;
                if (1 + var13 == var12) {
                  this.field_g[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_q; var10Lifetime5++) {
                this.field_h[this.field_e[var10Lifetime5]] = var17.a((byte) -11);
              }
              for (var10Lifetime5 = 0; this.field_q > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_e[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_h[var11];
                array$5 = new int[var12];
                this.field_g[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.a((byte) -11);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_g[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_r[var11] = 1 + var13;
                if (var13 + 1 == var12) {
                  this.field_g[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_i = new int[var9 + 1][];
              this.field_t = new pq[var9 + 1];
              for (var10Lifetime6 = 0; this.field_q > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_e[var10Lifetime6];
                var12Lifetime1 = this.field_h[var11Lifetime1];
                array$8 = new int[this.field_r[var11Lifetime1]];
                this.field_i[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_r[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_i[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null == this.field_g[var11Lifetime1]) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_g[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_i[var11Lifetime1][var14Lifetime1] = var17.b(true);
                }
                this.field_t[var11Lifetime1] = new pq(this.field_i[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("ff.D(");
          if (param0 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        kq.b(-69, param0);
        rg.a((byte) 53, param0);
        if (param1 != 11182) {
          ff.b((byte) 54);
        }
    }

    public static void a(byte param0) {
        field_u = null;
        field_v = null;
        field_n = null;
        if (param0 <= 69) {
          field_d = 125L;
        }
    }

    ff(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_o = w.a(param0.length, param0, -7);
          if (param1 != this.field_o) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_a = de.a(0, (byte) -114, param0.length, param0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_a[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, true);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ff.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_b = 0;
        field_m = false;
        field_v = "Month";
    }
}
