/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    static int field_f;
    private int field_b;
    private long[] field_e;
    private byte[] field_j;
    private long[] field_i;
    private int field_c;
    private long[] field_k;
    private long[] field_d;
    private byte[] field_h;
    private long[] field_a;
    static String field_g;

    final void a(long param0, byte[] param1, int param2) {
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
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
        byte[] var14 = null;
        int var8Lifetime1;
        var13 = EscapeVector.field_A;
        try {
          var5_int = 0;
          if (param2 != 2) {
            var14 = (byte[]) null;
            this.a(5, (byte[]) null, true);
          }
          var6 = 7 & -(7 & (int)param0) + 8;
          var7 = 7 & this.field_c;
          var9 = param0;
          var11 = 31;
          var12 = 0;
          while (0 <= var11) {
            var12 = var12 + ((255 & (int)var9) + (this.field_j[var11] & 255));
            this.field_j[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
          }
          while (param0 > 8L) {
            var8 = 255 & param1[var5_int] << var6 | (255 & param1[1 + var5_int]) >>> -var6 + 8;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_h[this.field_b] = (byte)lb.a((int) this.field_h[this.field_b], var8 >>> var7);
              this.field_b = this.field_b + 1;
              this.field_c = this.field_c + (8 - var7);
              if (this.field_c == 512) {
                this.a((byte) -41);
                this.field_c = 0;
                this.field_b = 0;
              }
              this.field_h[this.field_b] = (byte)ae.a(255, var8 << -var7 + 8);
              param0 = param0 - 8L;
              this.field_c = this.field_c + var7;
              var5_int++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (0L < param0) {
            stackIn_17_0 = 255;
            stackIn_17_1 = param1[var5_int] << var6;
            var8Lifetime1 = stackIn_17_0 & stackIn_17_1;
            this.field_h[this.field_b] = (byte)lb.a((int) this.field_h[this.field_b], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (8L > param0 + (long)var7) {
            this.field_c = (int)((long)this.field_c + param0);
          } else {
            this.field_c = this.field_c + (-var7 + 8);
            this.field_b = this.field_b + 1;
            param0 = param0 - (long)(8 - var7);
            if (this.field_c == 512) {
              this.a((byte) -34);
              this.field_c = 0;
              this.field_b = 0;
            }
            this.field_h[this.field_b] = (byte)ae.a(var8Lifetime1 << 8 - var7, 255);
            this.field_c = this.field_c + (int)param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("lj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_f = 69;
        }
        field_g = null;
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_j[var2] = (byte) 0;
        }
        this.field_b = 0;
        this.field_h[0] = (byte) 0;
        this.field_c = 0;
        var2Lifetime1 = 0;
        if (param0) {
          this.field_d = (long[]) null;
        }
        while (var2Lifetime1 < 8) {
          this.field_k[var2Lifetime1] = 0L;
          var2Lifetime1++;
        }
    }

    final static void a(int param0, int param1) {
        rf.field_a = param0;
        if (param1 <= 11) {
          lj.a(false);
        }
    }

    final void a(int param0, byte[] param1, boolean param2) {
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
        byte[] var9 = null;
        var8 = EscapeVector.field_A;
        try {
          this.field_h[this.field_b] = (byte)lb.a((int) this.field_h[this.field_b], 128 >>> ae.a(this.field_c, 7));
          this.field_b = this.field_b + 1;
          if (32 < this.field_b) {
            while (this.field_b < 64) {
              fieldTemp$0 = this.field_b;
              this.field_b = this.field_b + 1;
              this.field_h[fieldTemp$0] = (byte) 0;
            }
            this.a((byte) -75);
            this.field_b = 0;
          }
          while (32 > this.field_b) {
            fieldTemp$1 = this.field_b;
            this.field_b = this.field_b + 1;
            this.field_h[fieldTemp$1] = (byte) 0;
          }
          qg.a(this.field_j, 0, this.field_h, 32, 32);
          if (param2) {
            var9 = (byte[]) null;
            this.a(105L, (byte[]) null, -56);
          }
          this.a((byte) -95);
          var4_int = 0;
          var5 = param0;
          while (var4_int < 8) {
            var6 = this.field_k[var4_int];
            param1[var5] = (byte)(int)(var6 >>> 56);
            param1[var5 + 1] = (byte)(int)(var6 >>> 48);
            param1[var5 + 2] = (byte)(int)(var6 >>> 40);
            param1[var5 + 3] = (byte)(int)(var6 >>> 32);
            param1[4 + var5] = (byte)(int)(var6 >>> 24);
            param1[5 + var5] = (byte)(int)(var6 >>> 16);
            param1[6 + var5] = (byte)(int)(var6 >>> 8);
            param1[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("lj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
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
        var6 = EscapeVector.field_A;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_i[var2] = ja.a(ja.a(fn.a((long)this.field_h[6 + var3] << 8, 65280L), ja.a(fn.a(16711680L, (long)this.field_h[5 + var3] << 16), ja.a(fn.a(255L, (long)this.field_h[var3 + 4]) << 24, ja.a(fn.a(255L, (long)this.field_h[3 + var3]) << 32, ja.a(fn.a(255L, (long)this.field_h[2 + var3]) << 40, ja.a(fn.a(71776119061217280L, (long)this.field_h[var3 + 1] << 48), (long)this.field_h[var3] << 56)))))), fn.a((long)this.field_h[7 + var3], 255L));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_k[var2Lifetime1];
          arrayValue$1 = this.field_i[var2Lifetime1];
          this.field_e[var2Lifetime1] = dupTemp$0;
          this.field_d[var2Lifetime1] = ja.a(arrayValue$1, dupTemp$0);
        }
        if (param0 > -22) {
          this.field_i = (long[]) null;
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; 8 > var3Lifetime1; var3Lifetime1++) {
            this.field_a[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_a[var3Lifetime1] = ja.a(this.field_a[var3Lifetime1], tm.field_db[var4][ae.a((int)(this.field_e[ae.a(7, var3Lifetime1 - var4)] >>> var5), 255)]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_e[var3Lifetime1Lifetime1] = this.field_a[var3Lifetime1Lifetime1];
          }
          this.field_e[0] = ja.a(this.field_e[0], tm.field_ab[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_a[var3Lifetime1Lifetime2] = this.field_e[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (8 > var7) {
              this.field_a[var3Lifetime1Lifetime2] = ja.a(this.field_a[var3Lifetime1Lifetime2], tm.field_db[var7][ae.a((int)(this.field_d[ae.a(var3Lifetime1Lifetime2 - var7, 7)] >>> var5Lifetime1), 255)]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_d[var3Lifetime1Lifetime3] = this.field_a[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_k[var2Lifetime3] = ja.a(this.field_k[var2Lifetime3], ja.a(this.field_i[var2Lifetime3], this.field_d[var2Lifetime3]));
        }
    }

    lj() {
        this.field_e = new long[8];
        this.field_k = new long[8];
        this.field_j = new byte[32];
        this.field_c = 0;
        this.field_i = new long[8];
        this.field_b = 0;
        this.field_h = new byte[64];
        this.field_d = new long[8];
        this.field_a = new long[8];
    }

    static {
        field_f = -1;
        field_g = "Change display name";
    }
}
