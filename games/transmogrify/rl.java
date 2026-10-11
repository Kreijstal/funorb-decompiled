/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private byte[] field_c;
    private long[] field_b;
    private byte[] field_j;
    private int field_h;
    static String field_i;
    static int[] field_d;
    private long[] field_f;
    private long[] field_g;
    private long[] field_e;
    private long[] field_k;
    private int field_a;

    private final void a(byte param0) {
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
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = Transmogrify.field_A ? 1 : 0;
        if (param0 > -86) {
          return;
        }
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_b[var2] = aj.a(ej.a(255L, (long)this.field_j[7 + var3]), aj.a(aj.a(ej.a((long)this.field_j[5 + var3], 255L) << 16, aj.a(ej.a(4278190080L, (long)this.field_j[var3 + 4] << 24), aj.a(aj.a(ej.a(280375465082880L, (long)this.field_j[var3 + 2] << 40), aj.a((long)this.field_j[var3] << 56, ej.a((long)this.field_j[1 + var3] << 48, 71776119061217280L))), ej.a(255L, (long)this.field_j[var3 + 3]) << 32))), ej.a((long)this.field_j[6 + var3] << 8, 65280L)));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_e[var2Lifetime1];
          arrayValue$1 = this.field_b[var2Lifetime1];
          this.field_f[var2Lifetime1] = dupTemp$0;
          this.field_g[var2Lifetime1] = aj.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; 10 >= var2Lifetime2; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_k[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_k[var3Lifetime1] = aj.a(this.field_k[var3Lifetime1], dl.field_n[var4][vg.c((int)(this.field_f[vg.c(var3Lifetime1 - var4, 7)] >>> var5), 255)]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; 8 > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
            this.field_f[var3Lifetime1Lifetime1] = this.field_k[var3Lifetime1Lifetime1];
          }
          this.field_f[0] = aj.a(this.field_f[0], dl.field_q[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; 8 > var3Lifetime1Lifetime2; var3Lifetime1Lifetime2++) {
            this.field_k[var3Lifetime1Lifetime2] = this.field_f[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_k[var3Lifetime1Lifetime2] = aj.a(this.field_k[var3Lifetime1Lifetime2], dl.field_n[var7][vg.c(255, (int)(this.field_g[vg.c(-var7 + var3Lifetime1Lifetime2, 7)] >>> var5Lifetime1))]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_g[var3Lifetime1Lifetime3] = this.field_k[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_e[var2Lifetime3] = aj.a(this.field_e[var2Lifetime3], aj.a(this.field_g[var2Lifetime3], this.field_b[var2Lifetime3]));
        }
        return;
    }

    final static int b(byte param0) {
        if (param0 != -6) {
          return 92;
        }
        we.field_j.a(false);
        if (!oh.field_h.c((byte) 124)) {
          return ai.a(2);
        }
        return 0;
    }

    final static boolean a(int param0, int param1, int param2, ci param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param3.a((byte) -93, param0, param2);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          if (param1 != 0) {
            return false;
          }
          kf.a(var5, param1 ^ 108);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_11_0 = var4_ref;
          stackIn_11_1 = new StringBuilder().append("rl.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_i = null;
        if (param0 != 7) {
          field_d = (int[]) null;
        }
        field_d = null;
    }

    final void a(int param0, long param1, byte[] param2) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
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
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 != 14027) {
            return;
          }
          var5_int = 0;
          var6 = 7 & 8 - (7 & (int)param1);
          var7 = 7 & this.field_h;
          var9 = param1;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((this.field_c[var11] & 255) + (255 & (int)var9));
            this.field_c[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
          }
          while (param1 > 8L) {
            var8 = 255 & param2[var5_int] << var6 | (255 & param2[1 + var5_int]) >>> -var6 + 8;
            if (var8 >= 0 &&
              256 > var8) {
              this.field_j[this.field_a] = (byte)cl.b((int) this.field_j[this.field_a], var8 >>> var7);
              this.field_h = this.field_h + (-var7 + 8);
              this.field_a = this.field_a + 1;
              if (this.field_h == 512) {
                this.a((byte) -97);
                this.field_h = 0;
                this.field_a = 0;
              }
              this.field_j[this.field_a] = (byte)vg.c(var8 << 8 - var7, 255);
              var5_int++;
              param1 = param1 - 8L;
              this.field_h = this.field_h + var7;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param1 > 0L) {
            var8Lifetime1 = param2[var5_int] << var6 & 255;
            this.field_j[this.field_a] = (byte)cl.b((int) this.field_j[this.field_a], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (8L <= param1 + (long)var7) {
            param1 = param1 - (long)(-var7 + 8);
            this.field_h = this.field_h + (-var7 + 8);
            this.field_a = this.field_a + 1;
            if (this.field_h == 512) {
              this.a((byte) -94);
              this.field_a = 0;
              this.field_h = 0;
            }
            this.field_j[this.field_a] = (byte)vg.c(255, var8Lifetime1 << -var7 + 8);
            this.field_h = this.field_h + (int)param1;
          } else {
            this.field_h = (int)((long)this.field_h + param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("rl.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          this.field_j[this.field_a] = (byte)cl.b((int) this.field_j[this.field_a], 128 >>> vg.c(this.field_h, 7));
          this.field_a = this.field_a + 1;
          if (this.field_a > 32) {
            while (this.field_a < 64) {
              fieldTemp$0 = this.field_a;
              this.field_a = this.field_a + 1;
              this.field_j[fieldTemp$0] = (byte) 0;
            }
            this.a((byte) -87);
            this.field_a = 0;
          }
          while (this.field_a < 32) {
            fieldTemp$1 = this.field_a;
            this.field_a = this.field_a + 1;
            this.field_j[fieldTemp$1] = (byte) 0;
          }
          ji.a(this.field_c, 0, this.field_j, 32, 32);
          this.a((byte) -119);
          var4_int = 0;
          var5 = param2;
          if (param1 <= 51) {
            return;
          }
          while (var4_int < 8) {
            var6 = this.field_e[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[1 + var5] = (byte)(int)(var6 >>> 48);
            param0[2 + var5] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[4 + var5] = (byte)(int)(var6 >>> 24);
            param0[5 + var5] = (byte)(int)(var6 >>> 16);
            param0[6 + var5] = (byte)(int)(var6 >>> 8);
            param0[7 + var5] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("rl.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    rl() {
        this.field_h = 0;
        this.field_b = new long[8];
        this.field_f = new long[8];
        this.field_j = new byte[64];
        this.field_e = new long[8];
        this.field_g = new long[8];
        this.field_k = new long[8];
        this.field_c = new byte[32];
        this.field_a = 0;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Transmogrify.field_A ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_c[var2] = (byte) 0;
        }
        this.field_a = 0;
        this.field_h = 0;
        this.field_j[0] = (byte) 0;
        if (param0 != 15298) {
          this.field_g = (long[]) null;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_e[var2Lifetime1] = 0L;
        }
    }

    static {
        field_i = "Achieved";
        field_d = new int[8192];
    }
}
