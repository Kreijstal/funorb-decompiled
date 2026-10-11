/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    private long[] field_j;
    static String field_d;
    private int field_n;
    private int field_h;
    static String[] field_m;
    static String field_a;
    private byte[] field_g;
    static String field_p;
    static int field_k;
    private long[] field_e;
    private long[] field_i;
    private long[] field_f;
    private long[] field_c;
    static qb[] field_o;
    private byte[] field_b;
    static String[][] field_l;

    private final void d(int param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime2Lifetime1;
        int var3Lifetime2Lifetime2;
        int var3Lifetime2Lifetime3;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_e[var2] = kh.a(on.a((long)this.field_b[var3 + 7], 255L), kh.a(on.a(255L, (long)this.field_b[6 + var3]) << 8, kh.a(kh.a(on.a(4278190080L, (long)this.field_b[4 + var3] << 24), kh.a(on.a(1095216660480L, (long)this.field_b[var3 + 3] << 32), kh.a(kh.a((long)this.field_b[var3] << 56, on.a((long)this.field_b[var3 + 1], 255L) << 48), on.a((long)this.field_b[var3 + 2], 255L) << 40))), on.a(255L, (long)this.field_b[5 + var3]) << 16)));
          var2++;
          var3 += 8;
        }
        var2Lifetime1 = -121 / ((81 - param0) / 42);
        for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
          dupTemp$0 = this.field_i[var3Lifetime1];
          arrayValue$1 = this.field_e[var3Lifetime1];
          this.field_c[var3Lifetime1] = dupTemp$0;
          this.field_f[var3Lifetime1] = kh.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime2 = 0; var3Lifetime2 < 8; var3Lifetime2++) {
            this.field_j[var3Lifetime2] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_j[var3Lifetime2] = kh.a(this.field_j[var3Lifetime2], mb.field_L[var4][dg.a(255, (int)(this.field_c[dg.a(7, -var4 + var3Lifetime2)] >>> var5))]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime2Lifetime1 = 0; 8 > var3Lifetime2Lifetime1; var3Lifetime2Lifetime1++) {
            this.field_c[var3Lifetime2Lifetime1] = this.field_j[var3Lifetime2Lifetime1];
          }
          this.field_c[0] = kh.a(this.field_c[0], mb.field_V[var2Lifetime2]);
          for (var3Lifetime2Lifetime2 = 0; var3Lifetime2Lifetime2 < 8; var3Lifetime2Lifetime2++) {
            this.field_j[var3Lifetime2Lifetime2] = this.field_c[var3Lifetime2Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (8 > var7) {
              this.field_j[var3Lifetime2Lifetime2] = kh.a(this.field_j[var3Lifetime2Lifetime2], mb.field_L[var7][dg.a((int)(this.field_f[dg.a(7, var3Lifetime2Lifetime2 - var7)] >>> var5Lifetime1), 255)]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime2Lifetime3 = 0; var3Lifetime2Lifetime3 < 8; var3Lifetime2Lifetime3++) {
            this.field_f[var3Lifetime2Lifetime3] = this.field_j[var3Lifetime2Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_i[var2Lifetime3] = kh.a(this.field_i[var2Lifetime3], kh.a(this.field_e[var2Lifetime3], this.field_f[var2Lifetime3]));
        }
    }

    final void a(long param0, int param1, byte[] param2) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var8Lifetime1;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 7 & param1 - (7 & (int)param0);
          var7 = 7 & this.field_h;
          var9 = param0;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((255 & (int)var9) + (255 & this.field_g[var11]));
            this.field_g[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
          }
          while (param0 > 8L) {
            var8 = 255 & param2[var5_int] << var6 | (255 & param2[var5_int + 1]) >>> -var6 + 8;
            if (var8 >= 0 &&
              256 > var8) {
              this.field_b[this.field_n] = (byte)fj.b((int) this.field_b[this.field_n], var8 >>> var7);
              this.field_n = this.field_n + 1;
              this.field_h = this.field_h + (-var7 + 8);
              if (512 == this.field_h) {
                this.d(param1 + 116);
                this.field_n = 0;
                this.field_h = 0;
              }
              this.field_b[this.field_n] = (byte)dg.a(255, var8 << -var7 + 8);
              var5_int++;
              param0 = param0 - 8L;
              this.field_h = this.field_h + var7;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param0 > 0L) {
            var8Lifetime1 = param2[var5_int] << var6 & 255;
            this.field_b[this.field_n] = (byte)fj.b((int) this.field_b[this.field_n], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if ((long)var7 + param0 < 8L) {
            this.field_h = (int)((long)this.field_h + param0);
          } else {
            param0 = param0 - (long)(-var7 + 8);
            this.field_h = this.field_h + (-var7 + 8);
            this.field_n = this.field_n + 1;
            if (this.field_h == 512) {
              this.d(124);
              this.field_h = 0;
              this.field_n = 0;
            }
            this.field_b[this.field_n] = (byte)dg.a(255, var8Lifetime1 << 8 - var7);
            this.field_h = this.field_h + (int)param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("rm.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          this.field_b[this.field_n] = (byte)fj.b((int) this.field_b[this.field_n], 128 >>> dg.a(this.field_h, 7));
          this.field_n = this.field_n + 1;
          if (32 < this.field_n) {
            while (this.field_n < 64) {
              fieldTemp$0 = this.field_n;
              this.field_n = this.field_n + 1;
              this.field_b[fieldTemp$0] = (byte) 0;
            }
            this.d(127);
            this.field_n = 0;
          }
          while (32 > this.field_n) {
            fieldTemp$1 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_b[fieldTemp$1] = (byte) 0;
          }
          sf.a(this.field_g, 0, this.field_b, 32, 32);
          if (param0 < 73) {
            this.field_n = -98;
          }
          this.d(1);
          var4_int = 0;
          var5 = param1;
          while (var4_int < 8) {
            var6 = this.field_i[var4_int];
            param2[var5] = (byte)(int)(var6 >>> 56);
            param2[var5 + 1] = (byte)(int)(var6 >>> 48);
            param2[2 + var5] = (byte)(int)(var6 >>> 40);
            param2[var5 + 3] = (byte)(int)(var6 >>> 32);
            param2[var5 + 4] = (byte)(int)(var6 >>> 24);
            param2[var5 + 5] = (byte)(int)(var6 >>> 16);
            param2[var5 + 6] = (byte)(int)(var6 >>> 8);
            param2[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("rm.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int a(jg param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = -101 % ((param1 - 46) / 54);
          var3 = jk.field_u;
          if (2 == param0.field_m) {
            if (param0.field_i) {
              var3Lifetime1 = jk.field_u;
            } else {
              if (param0.field_d == 0 &&
                param0.field_k == 0) {
                var3Lifetime1 = wd.field_c[param0.field_m];
              } else {
                var3Lifetime1 = an.field_h[param0.field_m];
              }
            }
          } else {
            if (4 == param0.field_m) {
              var3Lifetime1 = an.field_h[param0.field_m];
            } else {
              if (param0.field_h == qf.field_a) {
                var3Lifetime1 = wd.field_c[param0.field_m];
              } else {
                var3Lifetime1 = an.field_h[param0.field_m];
              }
            }
          }
          stackIn_14_0 = var3Lifetime1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("rm.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_l = (String[][]) null;
        field_a = null;
        field_d = null;
        field_m = null;
        field_o = null;
        field_p = null;
        if (param0 != -6566) {
          wk var2 = (wk) null;
          rm.a((wk) null, 18, 22);
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_g[var2] = (byte) 0;
        }
        this.field_h = 0;
        this.field_b[0] = (byte) 0;
        this.field_n = 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_i[var2Lifetime1] = 0L;
        }
        if (param0 != -23645) {
          ml var4 = (ml) null;
          rm.a((ml) null, false);
        }
    }

    final static String a(wk param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param0.f(128);
            if (var3_int > param1) {
              var3_int = param1;
            }
            var4 = new byte[var3_int];
            param0.field_g = param0.field_g + kh.field_g.a(0, (byte) -126, var4, var3_int, param0.field_j, param0.field_g);
            var5 = ba.a(0, var3_int, (byte) -124, var4);
            if (param2 < -55) {
              stackIn_7_0 = var5;
              return stackIn_7_0;
            }
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = "Cabbage";
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("rm.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(ml param0, boolean param1) {
        jg var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          qn.field_ob.a(0, 4, 0, rk.field_O.field_y / 2, 0, rk.field_O.field_y / 2, 0, -60);
          if (mj.field_p != 6) {
            param0.b((byte) -92, 250);
          } else {
            field_k = 6;
          }
          if (!param1) {
            var3 = (jg) null;
            rm.a((jg) null, (byte) -20);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("rm.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static nc a(String param0, eg param1, String param2, int param3, eg param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 > -117) {
            field_l = (String[][]) null;
          }
          var5_int = param4.c(param2, -48);
          var6 = param4.a(param0, (byte) 33, var5_int);
          stackIn_3_0 = im.a(param4, var6, param1, 101, var5_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("rm.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    rm() {
        this.field_n = 0;
        this.field_f = new long[8];
        this.field_e = new long[8];
        this.field_c = new long[8];
        this.field_j = new long[8];
        this.field_g = new byte[32];
        this.field_i = new long[8];
        this.field_h = 0;
        this.field_b = new byte[64];
    }

    final static ql[] b(int param0) {
        if (param0 != 1283220456) {
          rm.b(95);
        }
        return new ql[]{ea.field_y, of.field_n, vh.field_f};
    }

    static {
        field_d = "No players";
        field_a = "Hide chat";
        field_p = "Passwords must be between 5 and 20 letters and numbers";
        field_l = new String[][]{new String[]{"120", "90", "60", "45", "30", "20", "10"}, null, new String[]{"Free-For-All", "Team Game"}};
        field_m = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
