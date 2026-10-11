/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    private byte[] field_b;
    static ci field_e;
    private int field_i;
    static boolean[] field_c;
    private long[] field_g;
    private int field_f;
    private long[] field_j;
    private long[] field_a;
    private long[] field_k;
    static String field_h;
    private long[] field_d;
    private byte[] field_m;
    static int field_l;

    private final void a(int param0) {
        int var2 = 0;
        int var3 = Terraphoenix.field_V;
        int var2Lifetime1;
        if (param0 != -31201) {
          byte[] var4 = (byte[]) null;
          this.a((byte) 63, 54L, (byte[]) null);
        }
        for (var2 = 0; var2 < 32; var2++) {
          this.field_m[var2] = (byte) 0;
        }
        this.field_i = 0;
        this.field_f = 0;
        this.field_b[0] = (byte) 0;
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          this.field_k[var2Lifetime1] = 0L;
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
        int var3Lifetime2;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = Terraphoenix.field_V;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_a[var2] = fb.a(fb.a(fb.a(fb.a(wj.a(255L, (long)this.field_b[4 + var3]) << 24, fb.a(wj.a((long)this.field_b[var3 + 3] << 32, 1095216660480L), fb.a(wj.a((long)this.field_b[2 + var3] << 40, 280375465082880L), fb.a(wj.a((long)this.field_b[1 + var3], 255L) << 48, (long)this.field_b[var3] << 56)))), wj.a((long)this.field_b[var3 + 5], 255L) << 16), wj.a(65280L, (long)this.field_b[6 + var3] << 8)), wj.a(255L, (long)this.field_b[var3 + 7]));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          dupTemp$0 = this.field_k[var2Lifetime1];
          arrayValue$1 = this.field_a[var2Lifetime1];
          this.field_j[var2Lifetime1] = dupTemp$0;
          this.field_g[var2Lifetime1] = fb.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_d[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_d[var3Lifetime1] = fb.a(this.field_d[var3Lifetime1], fb.field_n[var4][dg.a(255, (int)(this.field_j[dg.a(var3Lifetime1 - var4, 7)] >>> var5))]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_j[var3Lifetime1Lifetime1] = this.field_d[var3Lifetime1Lifetime1];
          }
          this.field_j[0] = fb.a(this.field_j[0], fb.field_m[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_d[var3Lifetime1Lifetime2] = this.field_j[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_d[var3Lifetime1Lifetime2] = fb.a(this.field_d[var3Lifetime1Lifetime2], fb.field_n[var7][dg.a(255, (int)(this.field_g[dg.a(7, -var7 + var3Lifetime1Lifetime2)] >>> var5Lifetime1))]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; 8 > var3Lifetime1Lifetime3; var3Lifetime1Lifetime3++) {
            this.field_g[var3Lifetime1Lifetime3] = this.field_d[var3Lifetime1Lifetime3];
          }
        }
        var3Lifetime2 = 102 / ((param0 - 85) / 38);
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_k[var2Lifetime3] = fb.a(this.field_k[var2Lifetime3], fb.a(this.field_g[var2Lifetime3], this.field_a[var2Lifetime3]));
        }
    }

    private final void a(int param0, int param1, byte[] param2) {
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
        var8 = Terraphoenix.field_V;
        try {
          this.field_b[this.field_i] = (byte)ei.b((int) this.field_b[this.field_i], 128 >>> dg.a(this.field_f, 7));
          this.field_i = this.field_i + 1;
          if (this.field_i > 32) {
            while (64 > this.field_i) {
              fieldTemp$0 = this.field_i;
              this.field_i = this.field_i + 1;
              this.field_b[fieldTemp$0] = (byte) 0;
            }
            this.a((byte) -17);
            this.field_i = 0;
          }
          while (this.field_i < 32) {
            fieldTemp$1 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_b[fieldTemp$1] = (byte) 0;
          }
          ka.a(this.field_m, 0, this.field_b, 32, 32);
          this.a((byte) -67);
          if (param1 != 4) {
            this.a((byte) -79);
          }
          var4_int = 0;
          var5 = param0;
          while (var4_int < 8) {
            var6 = this.field_k[var4_int];
            param2[var5] = (byte)(int)(var6 >>> 56);
            param2[var5 + 1] = (byte)(int)(var6 >>> 48);
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
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("tg.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_h = null;
        field_e = null;
        if (param0 < 10) {
          field_h = (String) null;
        }
    }

    private final void a(byte param0, long param1, byte[] param2) {
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
        int var14 = 0;
        int var8Lifetime1;
        var14 = Terraphoenix.field_V;
        try {
          var5_int = 0;
          var6 = 7 & -((int)param1 & 7) + 8;
          var7 = 7 & this.field_f;
          var9 = param1;
          var11 = 37 % ((param0 + 35) / 47);
          var12 = 31;
          var13 = 0;
          while (var12 >= 0) {
            var13 = var13 + (((int)var9 & 255) + (this.field_m[var12] & 255));
            this.field_m[var12] = (byte)var13;
            var13 = var13 >>> 8;
            var9 = var9 >>> 8;
            var12--;
          }
          while (param1 > 8L) {
            var8 = param2[var5_int] << var6 & 255 | (255 & param2[var5_int + 1]) >>> -var6 + 8;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_b[this.field_i] = (byte)ei.b((int) this.field_b[this.field_i], var8 >>> var7);
              this.field_i = this.field_i + 1;
              this.field_f = this.field_f + (-var7 + 8);
              if (this.field_f == 512) {
                this.a((byte) 7);
                this.field_f = 0;
                this.field_i = 0;
              }
              this.field_b[this.field_i] = (byte)dg.a(var8 << -var7 + 8, 255);
              param1 = param1 - 8L;
              this.field_f = this.field_f + var7;
              var5_int++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param1 <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = 255 & param2[var5_int] << var6;
            this.field_b[this.field_i] = (byte)ei.b((int) this.field_b[this.field_i], var8Lifetime1 >>> var7);
          }
          if ((long)var7 + param1 >= 8L) {
            this.field_i = this.field_i + 1;
            this.field_f = this.field_f + (-var7 + 8);
            param1 = param1 - (long)(8 - var7);
            if (512 == this.field_f) {
              this.a((byte) -101);
              this.field_i = 0;
              this.field_f = 0;
            }
            this.field_b[this.field_i] = (byte)dg.a(255, var8Lifetime1 << -var7 + 8);
            this.field_f = this.field_f + (int)param1;
          } else {
            this.field_f = (int)((long)this.field_f + param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("tg.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        tg var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Terraphoenix.field_V;
        try {
          if (0 < param2) {
            var8 = new byte[param1];
            var4 = var8;
            for (var5_int = 0; param1 > var5_int; var5_int++) {
              var8[var5_int] = param0[var5_int + param2];
            }
          } else {
            var4 = param0;
          }
          var5 = new tg();
          var5.a(param3 - 31209);
          var5.a((byte) 104, (long)(param3 * param1), var4);
          var6 = new byte[64];
          var5.a(0, 4, var6);
          stackIn_7_0 = var6;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("tg.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private tg() {
        this.field_b = new byte[64];
        this.field_i = 0;
        this.field_f = 0;
        this.field_j = new long[8];
        this.field_a = new long[8];
        this.field_g = new long[8];
        this.field_d = new long[8];
        this.field_k = new long[8];
        this.field_m = new byte[32];
    }

    static {
        field_c = new boolean[64];
        field_h = "Your email address is used to identify this account";
    }
}
