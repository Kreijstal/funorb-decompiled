/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    private long[] field_k;
    private long[] field_b;
    private byte[] field_h;
    static int[] field_j;
    private long[] field_f;
    private int field_d;
    private byte[] field_i;
    static int[] field_e;
    private int field_g;
    static int field_a;
    private long[] field_m;
    private long[] field_n;
    static int field_c;
    static pj field_l;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_i[var2] = (byte) 0;
        }
        this.field_g = 0;
        this.field_h[0] = (byte)param0;
        this.field_d = 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_k[var2Lifetime1] = 0L;
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void b(int param0) {
        field_j = null;
        if (param0 != 8) {
          hb var2 = (hb) null;
          gi.a(-67, (hb) null);
        }
        field_e = null;
        field_l = null;
    }

    final static sj a(int param0, hb param1) {
        int var7 = 0;
        sj stackIn_5_0 = null;
        sj stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        sj var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var2_int = param1.f(8, 8);
          if (0 < var2_int) {
            throw new IllegalStateException("" + var2_int);
          }
          if (param0 > -43) {
            stackIn_5_0 = (sj) null;
            return stackIn_5_0;
          }
          var3 = vg.a(89, param1) ? 1 : 0;
          var4 = vg.a(91, param1) ? 1 : 0;
          var5 = new sj();
          var5.field_e = (short)param1.f(8, 16);
          var5.field_O = nf.a(false, param1, 16, var5.field_O);
          var5.field_M = nf.a(false, param1, 16, var5.field_M);
          var5.field_z = nf.a(false, param1, 16, var5.field_z);
          var5.field_k = (short)param1.f(8, 16);
          var5.field_u = nf.a(false, param1, 16, var5.field_u);
          var5.field_L = nf.a(false, param1, 16, var5.field_L);
          var5.field_C = nf.a(false, param1, 16, var5.field_C);
          if (var3 != 0) {
            var5.field_r = (short)param1.f(8, 16);
            var5.field_y = nf.a(false, param1, 16, var5.field_y);
            var5.field_p = nf.a(false, param1, 16, var5.field_p);
            var5.field_K = nf.a(false, param1, 16, var5.field_K);
            var5.field_d = nf.a(false, param1, 16, var5.field_d);
            var5.field_n = nf.a(false, param1, 16, var5.field_n);
            var5.field_A = nf.a(false, param1, 16, var5.field_A);
          }
          if (var4 != 0) {
            param1.f(8, 16);
            var5.field_m = nf.a(false, param1, 16, var5.field_m);
            var5.field_h = nf.a(false, param1, 16, var5.field_h);
            var5.field_a = nf.a(false, param1, 16, var5.field_a);
            var5.field_I = nf.a(false, param1, 16, var5.field_I);
            var5.field_l = nf.a(false, param1, 16, var5.field_l);
          }
          if (vg.a(74, param1)) {
            var5.field_c = nf.a(false, param1, 16, var5.field_c);
          }
          if (vg.a(75, param1)) {
            var5.field_N = kk.a(16, param1, var5.field_N, (byte) 99);
            var6 = 0;
            for (var7 = 0; var5.field_N.length > var7; var7++) {
              if (var6 < (var5.field_N[var7] & 255)) {
                var6 = 255 & var5.field_N[var7];
              }
            }
            if (var6 == 0) {
              var5.field_N = null;
            } else {
              var5.field_D = (byte)(var6 + 1);
            }
          }
          stackIn_27_0 = var5;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("gi.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          this.field_h[this.field_d] = (byte)bd.a((int) this.field_h[this.field_d], 128 >>> ch.a(this.field_g, 7));
          this.field_d = this.field_d + 1;
          if (this.field_d > 32) {
            while (this.field_d < 64) {
              fieldTemp$0 = this.field_d;
              this.field_d = this.field_d + 1;
              this.field_h[fieldTemp$0] = (byte) 0;
            }
            this.a(16);
            this.field_d = 0;
          }
          while (32 > this.field_d) {
            fieldTemp$1 = this.field_d;
            this.field_d = this.field_d + 1;
            this.field_h[fieldTemp$1] = (byte) 0;
          }
          gl.a(this.field_i, 0, this.field_h, 32, 32);
          this.a(16);
          var4_int = 0;
          if (param1 != -70) {
            return;
          }
          var5 = param0;
          while (var4_int < 8) {
            var6 = this.field_k[var4_int];
            param2[var5] = (byte)(int)(var6 >>> 56);
            param2[1 + var5] = (byte)(int)(var6 >>> 48);
            param2[2 + var5] = (byte)(int)(var6 >>> 40);
            param2[var5 + 3] = (byte)(int)(var6 >>> 32);
            param2[4 + var5] = (byte)(int)(var6 >>> 24);
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
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("gi.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(byte param0, String param1, String param2) {
        try {
          ff.a(false, -109, param2, param1);
          if (param0 < 35) {
            hb var4 = (hb) null;
            gi.a(-117, (hb) null);
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "gi.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(long param0, int param1, byte[] param2) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
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
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 8 - ((int)param0 & 7) & 7;
          var7 = 7 & this.field_g;
          if (param1 >= -51) {
            return;
          }
          var9 = param0;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((this.field_i[var11] & 255) + (255 & (int)var9));
            this.field_i[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (8L < param0) {
            var8 = param2[var5_int] << var6 & 255 | (param2[var5_int + 1] & 255) >>> -var6 + 8;
            if (0 <= var8 &&
              var8 < 256) {
              this.field_h[this.field_d] = (byte)bd.a((int) this.field_h[this.field_d], var8 >>> var7);
              this.field_d = this.field_d + 1;
              this.field_g = this.field_g + (8 - var7);
              if (512 == this.field_g) {
                this.a(16);
                this.field_d = 0;
                this.field_g = 0;
              }
              this.field_h[this.field_d] = (byte)ch.a(var8 << -var7 + 8, 255);
              param0 = param0 - 8L;
              var5_int++;
              this.field_g = this.field_g + var7;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param0 <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = param2[var5_int] << var6 & 255;
            this.field_h[this.field_d] = (byte)bd.a((int) this.field_h[this.field_d], var8Lifetime1 >>> var7);
          }
          if (param0 + (long)var7 >= 8L) {
            this.field_g = this.field_g + (-var7 + 8);
            param0 = param0 - (long)(8 - var7);
            this.field_d = this.field_d + 1;
            if (this.field_g == 512) {
              this.a(16);
              this.field_g = 0;
              this.field_d = 0;
            }
            this.field_h[this.field_d] = (byte)ch.a(var8Lifetime1 << 8 - var7, 255);
            this.field_g = this.field_g + (int)param0;
          } else {
            this.field_g = (int)((long)this.field_g + param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("gi.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
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
        hb var7;
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
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_n[var2] = hd.a(hd.a(hd.a(sk.a((long)this.field_h[var3 + 5], 255L) << 16, hd.a(hd.a(sk.a((long)this.field_h[3 + var3] << 32, 1095216660480L), hd.a(hd.a(sk.a((long)this.field_h[1 + var3] << 48, 71776119061217280L), (long)this.field_h[var3] << 56), sk.a((long)this.field_h[var3 + 2] << 40, 280375465082880L))), sk.a((long)this.field_h[var3 + 4], 255L) << 24)), sk.a((long)this.field_h[var3 + 6], 255L) << 8), sk.a((long)this.field_h[var3 + 7], 255L));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_k[var2Lifetime1];
          arrayValue$1 = this.field_n[var2Lifetime1];
          this.field_f[var2Lifetime1] = dupTemp$0;
          this.field_m[var2Lifetime1] = hd.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_b[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_b[var3Lifetime1] = hd.a(this.field_b[var3Lifetime1], nc.field_d[var4][ch.a((int)(this.field_f[ch.a(var3Lifetime1 - var4, 7)] >>> var5), 255)]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_f[var3Lifetime1Lifetime1] = this.field_b[var3Lifetime1Lifetime1];
          }
          this.field_f[0] = hd.a(this.field_f[0], nc.field_g[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_b[var3Lifetime1Lifetime2] = this.field_f[var3Lifetime1Lifetime2];
            var8 = 0;
            var4Lifetime1 = var8;
            var5Lifetime1 = 56;
            while (var8 < 8) {
              this.field_b[var3Lifetime1Lifetime2] = hd.a(this.field_b[var3Lifetime1Lifetime2], nc.field_d[var8][ch.a(255, (int)(this.field_m[ch.a(7, var3Lifetime1Lifetime2 - var8)] >>> var5Lifetime1))]);
              var8++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_m[var3Lifetime1Lifetime3] = this.field_b[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_k[var2Lifetime3] = hd.a(this.field_k[var2Lifetime3], hd.a(this.field_n[var2Lifetime3], this.field_m[var2Lifetime3]));
        }
        if (param0 != 16) {
          var7 = (hb) null;
          gi.a(-34, (hb) null);
        }
    }

    gi() {
        this.field_k = new long[8];
        this.field_f = new long[8];
        this.field_i = new byte[32];
        this.field_b = new long[8];
        this.field_d = 0;
        this.field_n = new long[8];
        this.field_h = new byte[64];
        this.field_m = new long[8];
        this.field_g = 0;
    }

    static {
        field_j = new int[8192];
        field_l = new pj();
    }
}
