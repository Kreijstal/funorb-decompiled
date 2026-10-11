/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends td {
    private long field_d;
    private long field_f;
    private long field_l;
    private long[] field_n;
    private int field_j;
    private int field_m;
    static qj field_o;
    static String[] field_k;
    static ii[] field_h;
    static int[] field_g;
    static String field_e;
    static pg field_i;
    static int field_p;

    private final long f(int param0) {
        int var8 = 0;
        int var9 = Transmogrify.field_A ? 1 : 0;
        long var2 = System.nanoTime();
        if (param0 <= 97) {
          this.field_n = (long[]) null;
        }
        long var4 = var2 - this.field_l;
        this.field_l = var2;
        if (var4 > -5000000000L &&
          var4 < 5000000000L) {
          this.field_n[this.field_m] = var4;
          this.field_m = (this.field_m + 1) % 10;
          if (this.field_j < 1) {
            this.field_j = this.field_j + 1;
          }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_j; var8++) {
          var6 = var6 + this.field_n[(10 + (this.field_m - var8)) % 10];
        }
        return var6 / (long)this.field_j;
    }

    final static void d(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Transmogrify.field_A ? 1 : 0;
        try {
          if (ae.a(-12863)) {
            oi.field_k.a(fc.field_f, ij.field_a, true, 4);
            oi.field_k.l(param0 ^ param0);
            while (pc.b(param0 ^ -121)) {
              oi.field_k.a(-81, sg.field_n, ch.field_d);
            }
            return;
          }
          if (null != ub.field_c &&
            ub.field_c.field_c) {
            qd.b(param0 + 3);
            oi.field_k.b((qg) (new ll(oi.field_k, fi.field_w)), (byte) -71);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "kf.C(" + param0 + ')');
        }
    }

    final static void a(byte[] param0, int param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_1 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        oa var16 = null;
        oa var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var5Lifetime1;
        var15 = Transmogrify.field_A ? 1 : 0;
        try {
          var16 = new oa(param0);
          var17 = var16;
          var17.field_h = param0.length - 2;
          ih.field_b = var17.a((byte) -126);
          wk.field_b = new int[ih.field_b];
          ld.field_e = new byte[ih.field_b][];
          ql.field_b = new int[ih.field_b];
          gj.field_j = new int[ih.field_b];
          re.field_a = new int[ih.field_b];
          cc.field_e = new boolean[ih.field_b];
          re.field_K = new byte[ih.field_b][];
          var17.field_h = param0.length - (7 + ih.field_b * 8);
          pj.field_y = var17.a((byte) -122);
          ll.field_U = var17.a((byte) -100);
          var3 = (var17.d((byte) 102) & 255) + 1;
          for (var4 = 0; ih.field_b > var4; var4++) {
            gj.field_j[var4] = var16.a((byte) -93);
          }
          var4Lifetime1 = 0;
          var5 = 22 % ((param1 - 19) / 47);
          while (var4Lifetime1 < ih.field_b) {
            re.field_a[var4Lifetime1] = var17.a((byte) -118);
            var4Lifetime1++;
          }
          for (var4Lifetime2 = 0; ih.field_b > var4Lifetime2; var4Lifetime2++) {
            ql.field_b[var4Lifetime2] = var17.a((byte) -115);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < ih.field_b; var4Lifetime3++) {
            wk.field_b[var4Lifetime3] = var17.a((byte) -112);
          }
          var17.field_h = -(3 * (-1 + var3)) + param0.length - 7 - ih.field_b * 8;
          rg.field_D = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            rg.field_D[var4Lifetime4] = var17.g((byte) 124);
            if (0 == rg.field_D[var4Lifetime4]) {
              rg.field_D[var4Lifetime4] = 1;
            }
          }
          var17.field_h = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < ih.field_b; var4Lifetime5++) {
            var5Lifetime1 = ql.field_b[var4Lifetime5];
            var6 = wk.field_b[var4Lifetime5];
            var7 = var6 * var5Lifetime1;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            re.field_K[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            ld.field_e[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.d((byte) 40);
            if ((var11 & 1) == 0) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.b(true);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$1 = var17.b(true);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_29_0 = var10;
                  if (var13 == -1) {
                    stackIn_30_1 = 0;
                  } else {
                    stackIn_30_1 = 1;
                  }
                  var10 = stackIn_29_0 | stackIn_30_1;
                }
              }
            } else {
              for (var12 = 0; var12 < var5Lifetime1; var12++) {
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var12 + var5Lifetime1 * var13] = var17.b(true);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var5Lifetime1 > var12; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    dupTemp$0 = var17.b(true);
                    var9[var12 + var5Lifetime1 * var13] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_44_0 = var10;
                    if (var14 == -1) {
                      stackIn_45_1 = 0;
                    } else {
                      stackIn_45_1 = 1;
                    }
                    var10 = stackIn_44_0 | stackIn_45_1;
                  }
                }
              }
            }
            cc.field_e[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_51_0 = var2;
          stackIn_51_1 = new StringBuilder().append("kf.D(");
          if (param0 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_e = null;
        field_h = null;
        int var1 = -87 / ((55 - param0) / 36);
        field_g = null;
        field_o = null;
        field_i = null;
        field_k = null;
    }

    final static void a(ci param0, byte param1) {
        ml var2 = null;
        try {
          ml.b(param0.a("", (byte) 95, "headers.packvorbis"));
          var2 = ml.a(param0, "jagex logo2.packvorbis", "");
          if (param1 != -80) {
            ci var3 = (ci) null;
            kf.a((ci) null, (byte) 29);
          }
          var2.b();
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "kf.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(long param0, int param1) {
        int var4;
        int var5;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (param1 > -79) {
          field_i = (pg) null;
        }
        if (this.field_d > this.field_f) {
          this.field_l = this.field_l + (this.field_d - this.field_f);
          this.field_f = this.field_f + (-this.field_f + this.field_d);
          this.field_d = this.field_d + param0;
          return 1;
        }
        var4 = 0;
        do {
          var4++;
          this.field_d = this.field_d + param0;
        } while (var4 < 10 &&
          this.field_d < this.field_f);
        if (this.field_d < this.field_f) {
          this.field_d = this.field_f;
        }
        return var4;
    }

    final long c(int param0) {
        this.field_f = this.field_f + this.f(param0 + 125);
        if (param0 != 0) {
          field_i = (pg) null;
        }
        if (this.field_d > this.field_f) {
          return (this.field_d - this.field_f) / 1000000L;
        }
        return 0L;
    }

    final void a(int param0) {
        if (this.field_f < this.field_d) {
          this.field_f = this.field_f + (-this.field_f + this.field_d);
        }
        this.field_l = (long)param0;
    }

    final static ti a(ti param0, boolean param1, byte param2) {
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int var17 = 0;
        int incrementValue$3 = 0;
        int var3_int = 0;
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
        ti var16 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var25 = null;
        ti stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var21 = Transmogrify.field_A ? 1 : 0;
        try {
          param0.d();
          var3_int = ga.a(param0.field_w[0], (byte) -107);
          var4 = (var3_int & 252) >> 2;
          if (var4 > 0) {
            throw new IllegalArgumentException();
          }
          var5 = var3_int & 3;
          var6 = 1;
          var8 = -8 % ((param2 - 0) / 56);
          var7 = 0;
          var9 = 0;
          var10 = 1;
          while (var9 <= var5) {
            incrementValue$5 = var6;
            var6++;
            var7 = var10 * ga.a(param0.field_w[incrementValue$5], (byte) -85) + var7;
            var9++;
            var10 = var10 * 255;
          }
          var25 = new int[var7];
          for (var10Lifetime1 = 0; var7 > var10Lifetime1; var10Lifetime1++) {
            var11 = 0;
            var12 = 0;
            var13 = 1;
            while (var12 < 4) {
              incrementValue$4 = var6;
              var6++;
              var11 = var13 * ga.a(param0.field_w[incrementValue$4], (byte) -42) + var11;
              var12++;
              var13 = var13 * 255;
            }
            if (param1 &&
              0 == var11) {
              var11 = 16711935;
            }
            var25[var10Lifetime1] = var11;
          }
          var10Lifetime2 = 255 * ga.a(param0.field_w[var6], (byte) -86) + ga.a(param0.field_w[var6 + 1], (byte) -81);
          var6 += 2;
          var11Lifetime1 = 255 * ga.a(param0.field_w[var6], (byte) -90) + ga.a(param0.field_w[1 + var6], (byte) -41);
          var6 += 2;
          var12Lifetime1 = 255 * ga.a(param0.field_w[var6], (byte) -92) + ga.a(param0.field_w[1 + var6], (byte) -119);
          var6 += 2;
          var13Lifetime1 = ga.a(param0.field_w[var6], (byte) -121) * 255 + ga.a(param0.field_w[var6 + 1], (byte) -113);
          var6 += 2;
          var14 = 255 * ga.a(param0.field_w[var6], (byte) -87) + ga.a(param0.field_w[1 + var6], (byte) -60);
          var6 += 2;
          var15 = ga.a(param0.field_w[var6], (byte) -128) * 255 + ga.a(param0.field_w[var6 + 1], (byte) -113);
          var6 += 2;
          var16 = new ti(var14, var15);
          var16.field_l = var11Lifetime1;
          var16.field_u = var10Lifetime2;
          var16.field_r = var12Lifetime1;
          var16.field_s = var13Lifetime1;
          for (var17 = 0; var16.field_w.length > var17; var17++) {
            var18 = 0;
            var19 = 0;
            var20 = 1;
            while (var5 >= var19) {
              incrementValue$3 = var6;
              var6++;
              var18 = var20 * ga.a(param0.field_w[incrementValue$3], (byte) -108) + var18;
              var20 = var20 * 255;
              var19++;
            }
            var16.field_w[var17] = var25[var18];
          }
          stackIn_23_0 = var16;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("kf.H(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    kf() {
        this.field_f = 0L;
        this.field_d = 0L;
        this.field_j = 1;
        this.field_l = 0L;
        this.field_n = new long[10];
        this.field_m = 0;
        this.field_f = System.nanoTime();
        this.field_d = System.nanoTime();
    }

    static {
        field_k = new String[255];
        field_o = new qj();
        field_g = new int[8192];
    }
}
