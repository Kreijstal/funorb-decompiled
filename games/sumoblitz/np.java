/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np {
    private int field_b;
    private long[] field_k;
    private long[] field_a;
    private long[] field_i;
    private long[] field_j;
    private byte[] field_e;
    private int field_f;
    static ck field_h;
    private long[] field_d;
    private byte[] field_g;
    static char field_c;

    final void b(int param0) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_g[var2] = (byte) 0;
        }
        this.field_e[0] = (byte) 0;
        this.field_b = 0;
        if (param0 != -9) {
          return;
        }
        this.field_f = 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_j[var2Lifetime1] = 0L;
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != -58) {
          field_c = '￲';
        }
    }

    final void a(int param0, byte[] param1, int param2) {
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
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          this.field_e[this.field_f] = (byte)ic.a((int) this.field_e[this.field_f], 128 >>> eb.a(7, this.field_b));
          this.field_f = this.field_f + 1;
          if (this.field_f > 32) {
            while (this.field_f < 64) {
              fieldTemp$0 = this.field_f;
              this.field_f = this.field_f + 1;
              this.field_e[fieldTemp$0] = (byte) 0;
            }
            this.b((byte) 99);
            this.field_f = 0;
          }
          while (this.field_f < 32) {
            fieldTemp$1 = this.field_f;
            this.field_f = this.field_f + 1;
            this.field_e[fieldTemp$1] = (byte) 0;
          }
          if (param2 >= -2) {
            return;
          }
          la.a(this.field_g, 0, this.field_e, 32, 32);
          this.b((byte) 99);
          var4_int = 0;
          var5 = param0;
          while (var4_int < 8) {
            var6 = this.field_j[var4_int];
            param1[var5] = (byte)(int)(var6 >>> 56);
            param1[1 + var5] = (byte)(int)(var6 >>> 48);
            param1[var5 + 2] = (byte)(int)(var6 >>> 40);
            param1[3 + var5] = (byte)(int)(var6 >>> 32);
            param1[var5 + 4] = (byte)(int)(var6 >>> 24);
            param1[5 + var5] = (byte)(int)(var6 >>> 16);
            param1[var5 + 6] = (byte)(int)(var6 >>> 8);
            param1[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("np.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
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
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_d[var2] = bi.a(bi.a(sd.a(65280L, (long)this.field_e[6 + var3] << 8), bi.a(bi.a(bi.a(bi.a(bi.a((long)this.field_e[var3] << 56, sd.a((long)this.field_e[var3 + 1], 255L) << 48), sd.a(255L, (long)this.field_e[2 + var3]) << 40), sd.a(255L, (long)this.field_e[var3 + 3]) << 32), sd.a(255L, (long)this.field_e[4 + var3]) << 24), sd.a(16711680L, (long)this.field_e[5 + var3] << 16))), sd.a((long)this.field_e[7 + var3], 255L));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_j[var2Lifetime1];
          arrayValue$1 = this.field_d[var2Lifetime1];
          this.field_i[var2Lifetime1] = dupTemp$0;
          this.field_k[var2Lifetime1] = bi.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; 8 > var3Lifetime1; var3Lifetime1++) {
            this.field_a[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_a[var3Lifetime1] = bi.a(this.field_a[var3Lifetime1], ll.field_a[var4][eb.a(255, (int)(this.field_i[eb.a(var3Lifetime1 - var4, 7)] >>> var5))]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; 8 > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
            this.field_i[var3Lifetime1Lifetime1] = this.field_a[var3Lifetime1Lifetime1];
          }
          this.field_i[0] = bi.a(this.field_i[0], ll.field_b[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_a[var3Lifetime1Lifetime2] = this.field_i[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_a[var3Lifetime1Lifetime2] = bi.a(this.field_a[var3Lifetime1Lifetime2], ll.field_a[var7][eb.a((int)(this.field_k[eb.a(7, var3Lifetime1Lifetime2 - var7)] >>> var5Lifetime1), 255)]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; 8 > var3Lifetime1Lifetime3; var3Lifetime1Lifetime3++) {
            this.field_k[var3Lifetime1Lifetime3] = this.field_a[var3Lifetime1Lifetime3];
          }
        }
        if (param0 != 99) {
          np.a(-88);
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_j[var2Lifetime3] = bi.a(this.field_j[var2Lifetime3], bi.a(this.field_d[var2Lifetime3], this.field_k[var2Lifetime3]));
        }
    }

    final static boolean a(int param0) {
        if (param0 != 7) {
          field_c = 'ￃ';
        }
        return null == gk.field_o ? ii.field_a : true;
    }

    final void a(byte[] param0, int param1, long param2) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
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
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 8 - (7 & (int)param2) & param1;
          var7 = this.field_b & 7;
          var9 = param2;
          var11 = 31;
          var12 = 0;
          while (0 <= var11) {
            var12 = var12 + ((255 & this.field_g[var11]) + ((int)var9 & 255));
            this.field_g[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param2 > 8L) {
            var8 = param0[var5_int] << var6 & 255 | (param0[var5_int + 1] & 255) >>> -var6 + 8;
            if (var8 >= 0 &&
              256 > var8) {
              this.field_e[this.field_f] = (byte)ic.a((int) this.field_e[this.field_f], var8 >>> var7);
              this.field_f = this.field_f + 1;
              this.field_b = this.field_b + (-var7 + 8);
              if (512 == this.field_b) {
                this.b((byte) 99);
                this.field_b = 0;
                this.field_f = 0;
              }
              this.field_e[this.field_f] = (byte)eb.a(var8 << -var7 + 8, 255);
              param2 = param2 - 8L;
              this.field_b = this.field_b + var7;
              var5_int++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param2 <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = 255 & param0[var5_int] << var6;
            this.field_e[this.field_f] = (byte)ic.a((int) this.field_e[this.field_f], var8Lifetime1 >>> var7);
          }
          if (param2 + (long)var7 < 8L) {
            this.field_b = (int)((long)this.field_b + param2);
          } else {
            this.field_f = this.field_f + 1;
            this.field_b = this.field_b + (-var7 + 8);
            param2 = param2 - (long)(-var7 + 8);
            if (this.field_b == 512) {
              this.b((byte) 99);
              this.field_b = 0;
              this.field_f = 0;
            }
            this.field_e[this.field_f] = (byte)eb.a(255, var8Lifetime1 << 8 - var7);
            this.field_b = this.field_b + (int)param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("np.F(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    np() {
        this.field_b = 0;
        this.field_a = new long[8];
        this.field_i = new long[8];
        this.field_k = new long[8];
        this.field_j = new long[8];
        this.field_f = 0;
        this.field_e = new byte[64];
        this.field_d = new long[8];
        this.field_g = new byte[32];
    }

    static {
        field_h = new ck();
    }
}
