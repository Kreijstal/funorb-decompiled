/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    private long[] field_n;
    private int field_b;
    static int field_j;
    private long[] field_i;
    static nh field_f;
    private int field_g;
    static String field_e;
    static lh field_p;
    static he[] field_d;
    private long[] field_h;
    private byte[] field_k;
    private long[] field_l;
    private long[] field_q;
    static int field_a;
    static String field_c;
    static he field_o;
    private byte[] field_m;

    final void a(byte param0, byte[] param1, long param2) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
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
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -((int)param2 & 7) + 8 & 7;
          var7 = 7 & this.field_b;
          var9 = param2;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((255 & (int)var9) + (this.field_m[var11] & 255));
            this.field_m[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
          }
          while (8L < param2) {
            var8 = param1[var5_int] << var6 & 255 | (param1[var5_int + 1] & 255) >>> 8 - var6;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_k[this.field_g] = (byte)li.a((int) this.field_k[this.field_g], var8 >>> var7);
              this.field_g = this.field_g + 1;
              this.field_b = this.field_b + (8 - var7);
              if (512 == this.field_b) {
                this.a(8);
                this.field_g = 0;
                this.field_b = 0;
              }
              this.field_k[this.field_g] = (byte)rk.a(255, var8 << 8 - var7);
              this.field_b = this.field_b + var7;
              param2 = param2 - 8L;
              var5_int++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param0 > -72) {
            this.field_n = (long[]) null;
          }
          if (param2 > 0L) {
            var8Lifetime1 = 255 & param1[var5_int] << var6;
            this.field_k[this.field_g] = (byte)li.a((int) this.field_k[this.field_g], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (param2 + (long)var7 < 8L) {
            this.field_b = (int)((long)this.field_b + param2);
          } else {
            this.field_g = this.field_g + 1;
            param2 = param2 - (long)(8 - var7);
            this.field_b = this.field_b + (-var7 + 8);
            if (this.field_b == 512) {
              this.a(8);
              this.field_g = 0;
              this.field_b = 0;
            }
            this.field_k[this.field_g] = (byte)rk.a(var8Lifetime1 << 8 - var7, 255);
            this.field_b = this.field_b + (int)param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("nj.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_20_0 = false;
          RuntimeException stackIn_23_0 = null;
          StringBuilder stackIn_23_1 = null;
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          try {
            if (aj.field_c) {
              return true;
            }
            try {
              if (param1 != 8) {
                return false;
              }
              var2 = "tuhstatbut";
              var3 = (String) (pb.a("getcookies", param0, true));
              var4 = ki.a((byte) -95, ';', var3);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_20_0 = (null != param0.getParameter("tuhstatbut"));
            return stackIn_20_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = var2_ref2;
            stackIn_23_1 = new StringBuilder().append("nj.E(");
            if (param0 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, byte[] param2) {
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
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          this.field_k[this.field_g] = (byte)li.a((int) this.field_k[this.field_g], 128 >>> rk.a(7, this.field_b));
          this.field_g = this.field_g + 1;
          if (param1 > -94) {
            return;
          }
          if (this.field_g > 32) {
            while (this.field_g < 64) {
              fieldTemp$0 = this.field_g;
              this.field_g = this.field_g + 1;
              this.field_k[fieldTemp$0] = (byte) 0;
            }
            this.a(8);
            this.field_g = 0;
          }
          while (32 > this.field_g) {
            fieldTemp$1 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_k[fieldTemp$1] = (byte) 0;
          }
          kg.a(this.field_m, 0, this.field_k, 32, 32);
          this.a(8);
          var4_int = 0;
          var5 = param0;
          while (var4_int < 8) {
            var6 = this.field_n[var4_int];
            param2[var5] = (byte)(int)(var6 >>> 56);
            param2[1 + var5] = (byte)(int)(var6 >>> 48);
            param2[var5 + 2] = (byte)(int)(var6 >>> 40);
            param2[var5 + 3] = (byte)(int)(var6 >>> 32);
            param2[4 + var5] = (byte)(int)(var6 >>> 24);
            param2[5 + var5] = (byte)(int)(var6 >>> 16);
            param2[var5 + 6] = (byte)(int)(var6 >>> 8);
            param2[7 + var5] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("nj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_m[var2] = (byte) 0;
        }
        this.field_k[0] = (byte) 0;
        this.field_g = 0;
        this.field_b = 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_n[var2Lifetime1] = 0L;
        }
        if (!param0) {
          field_p = (lh) null;
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != 0) {
          nj.a(false, true, -15, true);
        }
        field_c = null;
        field_f = null;
        field_d = null;
        field_o = null;
        field_p = null;
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (param0) {
          var4 += 4;
        }
        if (param1) {
          var4 += 2;
        }
        if (param2 >= -52) {
          return (String) null;
        }
        if (param3) {
          var4++;
        }
        return tf.field_nb[var4];
    }

    final static java.awt.Frame a(int param0, int param1, bl param2, boolean param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_37_0 = null;
        java.awt.Frame stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        fl[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        fl[] var10 = null;
        il var11 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (!param2.a(-20)) {
            return null;
          }
          if (param1 == 0) {
            var10 = eb.a(param2, true);
            var6 = var10;
            if (var6 == null) {
              stackIn_8_0 = null;
              return (java.awt.Frame) (stackIn_8_0);
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (var10[var8].field_g == param4 &&
                var10[var8].field_h == param5 && ((param0 == 0 ||
                var10[var8].field_c == param0) &&
                (var7_int == 0 ||
                !(var10[var8].field_b <= param1)))) {
                param1 = var10[var8].field_b;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var11 = param2.a(param4, param5, param0, 0, param1);
          if (param3) {
            field_o = (he) null;
          }
          while (var11.field_b == 0) {
            kk.a(10L, true);
          }
          var7 = (java.awt.Frame) (var11.field_g);
          if (var7 == null) {
            stackIn_34_0 = null;
            return (java.awt.Frame) (stackIn_34_0);
          }
          if (var11.field_b != 2) {
            stackIn_39_0 = var7;
            return stackIn_39_0;
          }
          ce.a(param2, var7, (byte) -47);
          stackIn_37_0 = null;
          return (java.awt.Frame) (stackIn_37_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_42_0 = var6_ref;
          stackIn_42_1 = new StringBuilder().append("nj.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        bl var7;
        int var8;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_l[var2] = ff.a(hg.a(255L, (long)this.field_k[7 + var3]), ff.a(hg.a(65280L, (long)this.field_k[6 + var3] << 8), ff.a(hg.a(16711680L, (long)this.field_k[var3 + 5] << 16), ff.a(ff.a(ff.a(ff.a((long)this.field_k[var3] << 56, hg.a((long)this.field_k[var3 + 1], 255L) << 48), hg.a(255L, (long)this.field_k[2 + var3]) << 40), hg.a((long)this.field_k[3 + var3] << 32, 1095216660480L)), hg.a((long)this.field_k[var3 + 4] << 24, 4278190080L)))));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_n[var2Lifetime1];
          arrayValue$1 = this.field_l[var2Lifetime1];
          this.field_q[var2Lifetime1] = dupTemp$0;
          this.field_h[var2Lifetime1] = ff.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_i[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_i[var3Lifetime1] = ff.a(this.field_i[var3Lifetime1], qb.field_c[var4][rk.a((int)(this.field_q[rk.a(var3Lifetime1 - var4, 7)] >>> var5), 255)]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_q[var3Lifetime1Lifetime1] = this.field_i[var3Lifetime1Lifetime1];
          }
          this.field_q[0] = ff.a(this.field_q[0], qb.field_e[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; 8 > var3Lifetime1Lifetime2; var3Lifetime1Lifetime2++) {
            this.field_i[var3Lifetime1Lifetime2] = this.field_q[var3Lifetime1Lifetime2];
            var8 = 0;
            var4Lifetime1 = var8;
            var5Lifetime1 = 56;
            while (var8 < 8) {
              this.field_i[var3Lifetime1Lifetime2] = ff.a(this.field_i[var3Lifetime1Lifetime2], qb.field_c[var8][rk.a(255, (int)(this.field_h[rk.a(7, var3Lifetime1Lifetime2 - var8)] >>> var5Lifetime1))]);
              var5Lifetime1 -= 8;
              var8++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_h[var3Lifetime1Lifetime3] = this.field_i[var3Lifetime1Lifetime3];
          }
        }
        if (param0 != 8) {
          var7 = (bl) null;
          nj.a(118, 34, (bl) null, false, -72, 58);
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_n[var2Lifetime3] = ff.a(this.field_n[var2Lifetime3], ff.a(this.field_l[var2Lifetime3], this.field_h[var2Lifetime3]));
        }
    }

    nj() {
        this.field_b = 0;
        this.field_n = new long[8];
        this.field_g = 0;
        this.field_q = new long[8];
        this.field_h = new long[8];
        this.field_i = new long[8];
        this.field_l = new long[8];
        this.field_k = new byte[64];
        this.field_m = new byte[32];
    }

    static {
        field_a = 49;
        field_e = "Passwords must be between 5 and 20 characters long";
        field_c = "This password contains your Player Name, and would be easy to guess";
    }
}
