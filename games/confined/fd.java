/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    private long[] field_b;
    private int field_i;
    private long[] field_d;
    private long[] field_g;
    private int field_h;
    private long[] field_l;
    private long[] field_a;
    static ok field_k;
    static nf field_e;
    private byte[] field_f;
    private byte[] field_c;
    static boolean field_j;

    final void a(long param0, int param1, byte[] param2) {
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
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
        var13 = Confined.field_J ? 1 : 0;
        try {
          var5_int = 0;
          var6 = param1 - ((int)param0 & 7) & 7;
          var7 = this.field_h & 7;
          var9 = param0;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + (((int)var9 & 255) + (255 & this.field_c[var11]));
            this.field_c[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
          }
          while (param0 > 8L) {
            var8 = 255 & param2[var5_int] << var6 | (param2[var5_int + 1] & 255) >>> 8 - var6;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_f[this.field_i] = (byte)nl.a((int) this.field_f[this.field_i], var8 >>> var7);
              this.field_i = this.field_i + 1;
              this.field_h = this.field_h + (-var7 + 8);
              if (this.field_h == 512) {
                this.a(6704);
                this.field_h = 0;
                this.field_i = 0;
              }
              this.field_f[this.field_i] = (byte)va.a(var8 << 8 - var7, 255);
              var5_int++;
              this.field_h = this.field_h + var7;
              param0 = param0 - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (0L < param0) {
            stackIn_15_0 = 255;
            stackIn_15_1 = param2[var5_int] << var6;
            var8Lifetime1 = stackIn_15_0 & stackIn_15_1;
            this.field_f[this.field_i] = (byte)nl.a((int) this.field_f[this.field_i], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if ((long)var7 + param0 < 8L) {
            this.field_h = (int)((long)this.field_h + param0);
          } else {
            this.field_h = this.field_h + (-var7 + 8);
            param0 = param0 - (long)(-var7 + 8);
            this.field_i = this.field_i + 1;
            if (512 == this.field_h) {
              this.a(6704);
              this.field_i = 0;
              this.field_h = 0;
            }
            this.field_f[this.field_i] = (byte)va.a(var8Lifetime1 << -var7 + 8, 255);
            this.field_h = this.field_h + (int)param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("fd.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void c(byte param0) {
        if (param0 < 33) {
          fd.c((byte) 94);
        }
        ah.field_U = 0;
    }

    public static void a(byte param0) {
        field_k = null;
        field_e = null;
        if (param0 >= -107) {
          fd.a((byte) -117);
        }
    }

    final void a(byte[] param0, int param1, byte param2) {
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
        var8 = Confined.field_J ? 1 : 0;
        try {
          this.field_f[this.field_i] = (byte)nl.a((int) this.field_f[this.field_i], 128 >>> va.a(this.field_h, 7));
          this.field_i = this.field_i + 1;
          if (32 < this.field_i) {
            while (this.field_i < 64) {
              fieldTemp$0 = this.field_i;
              this.field_i = this.field_i + 1;
              this.field_f[fieldTemp$0] = (byte) 0;
            }
            this.a(6704);
            this.field_i = 0;
          }
          while (32 > this.field_i) {
            fieldTemp$1 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_f[fieldTemp$1] = (byte) 0;
          }
          lj.a(this.field_c, 0, this.field_f, 32, 32);
          this.a(param2 + 6701);
          var4_int = 0;
          var5 = param1;
          while (var4_int < 8) {
            var6 = this.field_g[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[var5 + 1] = (byte)(int)(var6 >>> 48);
            param0[2 + var5] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[4 + var5] = (byte)(int)(var6 >>> 24);
            param0[5 + var5] = (byte)(int)(var6 >>> 16);
            param0[6 + var5] = (byte)(int)(var6 >>> 8);
            param0[var5 + 7] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
          }
          if (param2 != 3) {
            this.field_f = (byte[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("fd.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
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
        byte[] var7;
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
        var6 = Confined.field_J ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_d[var2] = pa.a(kd.a((long)this.field_f[var3 + 7], 255L), pa.a(kd.a(65280L, (long)this.field_f[var3 + 6] << 8), pa.a(pa.a(kd.a((long)this.field_f[4 + var3], 255L) << 24, pa.a(pa.a(kd.a(255L, (long)this.field_f[2 + var3]) << 40, pa.a(kd.a((long)this.field_f[1 + var3], 255L) << 48, (long)this.field_f[var3] << 56)), kd.a(255L, (long)this.field_f[3 + var3]) << 32)), kd.a(16711680L, (long)this.field_f[var3 + 5] << 16))));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_g[var2Lifetime1];
          arrayValue$1 = this.field_d[var2Lifetime1];
          this.field_l[var2Lifetime1] = dupTemp$0;
          this.field_b[var2Lifetime1] = pa.a(arrayValue$1, dupTemp$0);
        }
        if (param0 != 6704) {
          var7 = (byte[]) null;
          this.a(82L, -97, (byte[]) null);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_a[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_a[var3Lifetime1] = pa.a(this.field_a[var3Lifetime1], ib.field_T[var4][va.a(255, (int)(this.field_l[va.a(-var4 + var3Lifetime1, 7)] >>> var5))]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_l[var3Lifetime1Lifetime1] = this.field_a[var3Lifetime1Lifetime1];
          }
          this.field_l[0] = pa.a(this.field_l[0], ib.field_V[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_a[var3Lifetime1Lifetime2] = this.field_l[var3Lifetime1Lifetime2];
            var8 = 0;
            var4Lifetime1 = var8;
            var5Lifetime1 = 56;
            while (8 > var8) {
              this.field_a[var3Lifetime1Lifetime2] = pa.a(this.field_a[var3Lifetime1Lifetime2], ib.field_T[var8][va.a((int)(this.field_b[va.a(-var8 + var3Lifetime1Lifetime2, 7)] >>> var5Lifetime1), 255)]);
              var8++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_b[var3Lifetime1Lifetime3] = this.field_a[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_g[var2Lifetime3] = pa.a(this.field_g[var2Lifetime3], pa.a(this.field_b[var2Lifetime3], this.field_d[var2Lifetime3]));
        }
    }

    final static void a(int param0, int param1) {
        fb.field_c = pm.field_B[param1];
        hc.field_s = ak.field_L[param1];
        b.field_k = th.field_eb[param1];
        if (param0 != 30177) {
          field_k = (ok) null;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = Confined.field_J ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_c[var2] = (byte) 0;
        }
        this.field_i = 0;
        this.field_h = 0;
        this.field_f[0] = (byte) 0;
        var2Lifetime1 = 0;
        if (param0 >= -21) {
          return;
        }
        while (8 > var2Lifetime1) {
          this.field_g[var2Lifetime1] = 0L;
          var2Lifetime1++;
        }
    }

    fd() {
        this.field_i = 0;
        this.field_h = 0;
        this.field_l = new long[8];
        this.field_b = new long[8];
        this.field_g = new long[8];
        this.field_a = new long[8];
        this.field_d = new long[8];
        this.field_c = new byte[32];
        this.field_f = new byte[64];
    }

    static {
        field_e = new nf(640, 376);
        field_j = true;
    }
}
