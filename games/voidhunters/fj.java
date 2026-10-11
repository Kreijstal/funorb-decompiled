/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static String field_a;
    private long[] field_d;
    private byte[] field_f;
    private long[] field_h;
    private byte[] field_k;
    private long[] field_j;
    private long[] field_l;
    private long[] field_i;
    static int field_b;
    private int field_e;
    static String field_c;
    private int field_g;

    final static void b(int param0) {
        if (param0 != 18444) {
          return;
        }
        if (uga.field_d) {
          fea.a(-1);
        }
    }

    final void a(byte[] param0, int param1, byte param2) {
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
        var8 = VoidHunters.field_G;
        try {
          this.field_f[this.field_g] = (byte)knb.a((int) this.field_f[this.field_g], 128 >>> dla.a(this.field_e, 7));
          this.field_g = this.field_g + 1;
          if (param2 <= 37) {
            fj.b(-1);
          }
          if (32 < this.field_g) {
            while (this.field_g < 64) {
              fieldTemp$0 = this.field_g;
              this.field_g = this.field_g + 1;
              this.field_f[fieldTemp$0] = (byte) 0;
            }
            this.a((byte) 66);
            this.field_g = 0;
          }
          while (this.field_g < 32) {
            fieldTemp$1 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_f[fieldTemp$1] = (byte) 0;
          }
          cua.a(this.field_k, 0, this.field_f, 32, 32);
          this.a((byte) 66);
          var4_int = 0;
          var5 = param1;
          while (var4_int < 8) {
            var6 = this.field_l[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[1 + var5] = (byte)(int)(var6 >>> 48);
            param0[2 + var5] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[var5 + 4] = (byte)(int)(var6 >>> 24);
            param0[var5 + 5] = (byte)(int)(var6 >>> 16);
            param0[6 + var5] = (byte)(int)(var6 >>> 8);
            param0[7 + var5] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("fj.F(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        int var2Lifetime1;
        if (param0 != -88) {
          this.field_k = (byte[]) null;
        }
        for (var2 = 0; var2 < 32; var2++) {
          this.field_k[var2] = (byte) 0;
        }
        this.field_g = 0;
        this.field_e = 0;
        this.field_f[0] = (byte) 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_l[var2Lifetime1] = 0L;
        }
    }

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
        var6 = VoidHunters.field_G;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_j[var2] = ihb.a(ihb.a(hoa.a(255L, (long)this.field_f[6 + var3]) << 8, ihb.a(hoa.a(255L, (long)this.field_f[5 + var3]) << 16, ihb.a(hoa.a(255L, (long)this.field_f[4 + var3]) << 24, ihb.a(hoa.a(255L, (long)this.field_f[3 + var3]) << 32, ihb.a(hoa.a(280375465082880L, (long)this.field_f[var3 + 2] << 40), ihb.a(hoa.a((long)this.field_f[1 + var3], 255L) << 48, (long)this.field_f[var3] << 56)))))), hoa.a((long)this.field_f[var3 + 7], 255L));
          var2++;
          var3 += 8;
        }
        if (param0 != 66) {
          this.a((byte) -86);
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_l[var2Lifetime1];
          arrayValue$1 = this.field_j[var2Lifetime1];
          this.field_i[var2Lifetime1] = dupTemp$0;
          this.field_d[var2Lifetime1] = ihb.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; 8 > var3Lifetime1; var3Lifetime1++) {
            this.field_h[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_h[var3Lifetime1] = ihb.a(this.field_h[var3Lifetime1], gp.field_r[var4][dla.a(255, (int)(this.field_i[dla.a(-var4 + var3Lifetime1, 7)] >>> var5))]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; 8 > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
            this.field_i[var3Lifetime1Lifetime1] = this.field_h[var3Lifetime1Lifetime1];
          }
          this.field_i[0] = ihb.a(this.field_i[0], gp.field_o[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; 8 > var3Lifetime1Lifetime2; var3Lifetime1Lifetime2++) {
            this.field_h[var3Lifetime1Lifetime2] = this.field_i[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_h[var3Lifetime1Lifetime2] = ihb.a(this.field_h[var3Lifetime1Lifetime2], gp.field_r[var7][dla.a(255, (int)(this.field_d[dla.a(var3Lifetime1Lifetime2 - var7, 7)] >>> var5Lifetime1))]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_d[var3Lifetime1Lifetime3] = this.field_h[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_l[var2Lifetime3] = ihb.a(this.field_l[var2Lifetime3], ihb.a(this.field_j[var2Lifetime3], this.field_d[var2Lifetime3]));
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          fj.a(-54);
        }
        field_c = null;
    }

    final void a(byte[] param0, int param1, long param2) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
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
        var13 = VoidHunters.field_G;
        try {
          var5_int = 0;
          var6 = 7 & 8 - (7 & (int)param2);
          var7 = this.field_e & 7;
          var9 = param2;
          var11 = 31;
          if (param1 != -7) {
            field_b = 81;
          }
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((255 & this.field_k[var11]) + (255 & (int)var9));
            this.field_k[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param2 > 8L) {
            var8 = 255 & param0[var5_int] << var6 | (255 & param0[1 + var5_int]) >>> 8 - var6;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_f[this.field_g] = (byte)knb.a((int) this.field_f[this.field_g], var8 >>> var7);
              this.field_g = this.field_g + 1;
              this.field_e = this.field_e + (8 - var7);
              if (this.field_e == 512) {
                this.a((byte) 66);
                this.field_e = 0;
                this.field_g = 0;
              }
              this.field_f[this.field_g] = (byte)dla.a(var8 << -var7 + 8, 255);
              this.field_e = this.field_e + var7;
              var5_int++;
              param2 = param2 - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param2 > 0L) {
            stackIn_18_0 = param0[var5_int] << var6;
            stackIn_18_1 = 255;
            var8Lifetime1 = stackIn_18_0 & stackIn_18_1;
            this.field_f[this.field_g] = (byte)knb.a((int) this.field_f[this.field_g], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (param2 + (long)var7 >= 8L) {
            param2 = param2 - (long)(-var7 + 8);
            this.field_e = this.field_e + (8 - var7);
            this.field_g = this.field_g + 1;
            if (this.field_e == 512) {
              this.a((byte) 66);
              this.field_g = 0;
              this.field_e = 0;
            }
            this.field_f[this.field_g] = (byte)dla.a(255, var8Lifetime1 << 8 - var7);
            this.field_e = this.field_e + (int)param2;
          } else {
            this.field_e = (int)((long)this.field_e + param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("fj.C(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    fj() {
        this.field_d = new long[8];
        this.field_l = new long[8];
        this.field_i = new long[8];
        this.field_h = new long[8];
        this.field_g = 0;
        this.field_k = new byte[32];
        this.field_f = new byte[64];
        this.field_e = 0;
        this.field_j = new long[8];
    }

    static {
        field_a = "Email: ";
        field_b = 1;
        field_c = "Add map zone";
    }
}
