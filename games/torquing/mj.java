/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    private long[] field_i;
    private long[] field_g;
    private int field_b;
    static int field_d;
    private byte[] field_c;
    private byte[] field_h;
    private long[] field_f;
    static int field_k;
    private long[] field_j;
    private int field_e;
    private long[] field_a;

    final void a(byte[] param0, long param1, byte param2) {
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
        var13 = Torquing.field_u;
        try {
          var5_int = 0;
          var6 = 7 & 8 - ((int)param1 & 7);
          var7 = 7 & this.field_b;
          if (param2 <= 84) {
            this.a((byte[]) null, -89L, (byte) -88);
          }
          var9 = param1;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((255 & (int)var9) + (255 & this.field_c[var11]));
            this.field_c[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param1 > 8L) {
            var8 = param0[var5_int] << var6 & 255 | (param0[1 + var5_int] & 255) >>> 8 - var6;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_h[this.field_e] = (byte)gm.a((int) this.field_h[this.field_e], var8 >>> var7);
              this.field_b = this.field_b + (-var7 + 8);
              this.field_e = this.field_e + 1;
              if (this.field_b == 512) {
                this.b((byte) 87);
                this.field_b = 0;
                this.field_e = 0;
              }
              this.field_h[this.field_e] = (byte)ie.a(255, var8 << 8 - var7);
              var5_int++;
              this.field_b = this.field_b + var7;
              param1 = param1 - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param1 <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = param0[var5_int] << var6 & 255;
            this.field_h[this.field_e] = (byte)gm.a((int) this.field_h[this.field_e], var8Lifetime1 >>> var7);
          }
          if (param1 + (long)var7 < 8L) {
            this.field_b = (int)((long)this.field_b + param1);
          } else {
            this.field_b = this.field_b + (-var7 + 8);
            param1 = param1 - (long)(-var7 + 8);
            this.field_e = this.field_e + 1;
            if (512 == this.field_b) {
              this.b((byte) 90);
              this.field_b = 0;
              this.field_e = 0;
            }
            this.field_h[this.field_e] = (byte)ie.a(255, var8Lifetime1 << -var7 + 8);
            this.field_b = this.field_b + (int)param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("mj.C(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, byte[] param1, int param2) {
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
        var8 = Torquing.field_u;
        try {
          this.field_h[this.field_e] = (byte)gm.a((int) this.field_h[this.field_e], param2 >>> ie.a(7, this.field_b));
          this.field_e = this.field_e + 1;
          if (this.field_e > 32) {
            while (64 > this.field_e) {
              fieldTemp$0 = this.field_e;
              this.field_e = this.field_e + 1;
              this.field_h[fieldTemp$0] = (byte) 0;
            }
            this.b((byte) 110);
            this.field_e = 0;
          }
          while (this.field_e < 32) {
            fieldTemp$1 = this.field_e;
            this.field_e = this.field_e + 1;
            this.field_h[fieldTemp$1] = (byte) 0;
          }
          dk.a(this.field_c, 0, this.field_h, 32, 32);
          this.b((byte) 126);
          var4_int = 0;
          var5 = param0;
          while (8 > var4_int) {
            var6 = this.field_f[var4_int];
            param1[var5] = (byte)(int)(var6 >>> 56);
            param1[1 + var5] = (byte)(int)(var6 >>> 48);
            param1[2 + var5] = (byte)(int)(var6 >>> 40);
            param1[3 + var5] = (byte)(int)(var6 >>> 32);
            param1[4 + var5] = (byte)(int)(var6 >>> 24);
            param1[var5 + 5] = (byte)(int)(var6 >>> 16);
            param1[6 + var5] = (byte)(int)(var6 >>> 8);
            param1[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("mj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(byte param0) {
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
        var6 = Torquing.field_u;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_j[var2] = vb.a(vb.a(on.a((long)this.field_h[6 + var3], 255L) << 8, vb.a(vb.a(on.a((long)this.field_h[4 + var3], 255L) << 24, vb.a(on.a(255L, (long)this.field_h[var3 + 3]) << 32, vb.a(vb.a(on.a(255L, (long)this.field_h[var3 + 1]) << 48, (long)this.field_h[var3] << 56), on.a((long)this.field_h[var3 + 2] << 40, 280375465082880L)))), on.a((long)this.field_h[var3 + 5] << 16, 16711680L))), on.a((long)this.field_h[var3 + 7], 255L));
          var2++;
          var3 += 8;
        }
        if (param0 < 52) {
          var7 = (byte[]) null;
          this.a(-31, (byte[]) null, -11);
        }
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          dupTemp$0 = this.field_f[var2Lifetime1];
          arrayValue$1 = this.field_j[var2Lifetime1];
          this.field_g[var2Lifetime1] = dupTemp$0;
          this.field_i[var2Lifetime1] = vb.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; 10 >= var2Lifetime2; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_a[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_a[var3Lifetime1] = vb.a(this.field_a[var3Lifetime1], tp.field_e[var4][ie.a((int)(this.field_g[ie.a(7, var3Lifetime1 - var4)] >>> var5), 255)]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_g[var3Lifetime1Lifetime1] = this.field_a[var3Lifetime1Lifetime1];
          }
          this.field_g[0] = vb.a(this.field_g[0], tp.field_m[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_a[var3Lifetime1Lifetime2] = this.field_g[var3Lifetime1Lifetime2];
            var8 = 0;
            var4Lifetime1 = var8;
            var5Lifetime1 = 56;
            while (8 > var8) {
              this.field_a[var3Lifetime1Lifetime2] = vb.a(this.field_a[var3Lifetime1Lifetime2], tp.field_e[var8][ie.a((int)(this.field_i[ie.a(7, -var8 + var3Lifetime1Lifetime2)] >>> var5Lifetime1), 255)]);
              var5Lifetime1 -= 8;
              var8++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_i[var3Lifetime1Lifetime3] = this.field_a[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; 8 > var2Lifetime3; var2Lifetime3++) {
          this.field_f[var2Lifetime3] = vb.a(this.field_f[var2Lifetime3], vb.a(this.field_j[var2Lifetime3], this.field_i[var2Lifetime3]));
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_c[var2] = (byte) 0;
        }
        this.field_e = 0;
        this.field_h[0] = (byte)param0;
        this.field_b = 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_f[var2Lifetime1] = 0L;
        }
    }

    mj() {
        this.field_g = new long[8];
        this.field_h = new byte[64];
        this.field_c = new byte[32];
        this.field_b = 0;
        this.field_f = new long[8];
        this.field_i = new long[8];
        this.field_e = 0;
        this.field_j = new long[8];
        this.field_a = new long[8];
    }

    static {
        field_d = 0;
    }
}
