/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String field_e;
    private long[] field_b;
    static oi field_g;
    private long[] field_c;
    static kl field_j;
    private int field_p;
    private long[] field_l;
    static String field_d;
    static String field_i;
    private long[] field_k;
    private long[] field_n;
    private byte[] field_m;
    private int field_a;
    static int[] field_f;
    private byte[] field_o;
    static String field_h;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ec.field_c = param4;
        lc.field_a = param2;
        if (param3 != 1882) {
          qk.a((byte) 84);
        }
        ki.field_I = param1;
        si.field_f = param0;
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
        int var6 = 0;
        long var6_long = 0L;
        int var8 = 0;
        var8 = wizardrun.field_H;
        try {
          this.field_o[this.field_a] = (byte)sd.a((int) this.field_o[this.field_a], 128 >>> kl.b(7, this.field_p));
          this.field_a = this.field_a + 1;
          if (this.field_a > 32) {
            while (this.field_a < 64) {
              fieldTemp$0 = this.field_a;
              this.field_a = this.field_a + 1;
              this.field_o[fieldTemp$0] = (byte) 0;
            }
            this.b(-42);
            this.field_a = 0;
          }
          while (this.field_a < 32) {
            fieldTemp$1 = this.field_a;
            this.field_a = this.field_a + 1;
            this.field_o[fieldTemp$1] = (byte) 0;
          }
          g.a(this.field_m, 0, this.field_o, 32, 32);
          this.b(-34);
          var4_int = 0;
          var5 = param1;
          while (8 > var4_int) {
            var6_long = this.field_l[var4_int];
            param0[var5] = (byte)(int)(var6_long >>> 56);
            param0[1 + var5] = (byte)(int)(var6_long >>> 48);
            param0[2 + var5] = (byte)(int)(var6_long >>> 40);
            param0[3 + var5] = (byte)(int)(var6_long >>> 32);
            param0[4 + var5] = (byte)(int)(var6_long >>> 24);
            param0[5 + var5] = (byte)(int)(var6_long >>> 16);
            param0[6 + var5] = (byte)(int)(var6_long >>> 8);
            param0[7 + var5] = (byte)(int)var6_long;
            var4_int++;
            var5 += 8;
          }
          var6 = 88 / ((69 - param2) / 54);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("qk.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(String param0, int param1, String param2, String param3, int param4, int param5, boolean param6) {
        ne var7 = null;
        RuntimeException var7_ref = null;
        ne var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new ne(param2);
          var8 = new ne(param3);
          if (param5 != 0) {
            qk.a((byte) 13);
          }
          stackIn_3_0 = qi.a(var7, var8, param0, param4, param1, param6, param5 ^ 27851);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("qk.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void b(int param0) {
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
        var6 = wizardrun.field_H;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_b[var2] = da.a(gf.a(255L, (long)this.field_o[var3 + 7]), da.a(gf.a((long)this.field_o[var3 + 6] << 8, 65280L), da.a(da.a(gf.a((long)this.field_o[4 + var3] << 24, 4278190080L), da.a(da.a(da.a(gf.a((long)this.field_o[var3 + 1] << 48, 71776119061217280L), (long)this.field_o[var3] << 56), gf.a(280375465082880L, (long)this.field_o[2 + var3] << 40)), gf.a(255L, (long)this.field_o[var3 + 3]) << 32)), gf.a(16711680L, (long)this.field_o[var3 + 5] << 16))));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          dupTemp$0 = this.field_l[var2Lifetime1];
          arrayValue$1 = this.field_b[var2Lifetime1];
          this.field_n[var2Lifetime1] = dupTemp$0;
          this.field_k[var2Lifetime1] = da.a(arrayValue$1, dupTemp$0);
        }
        var3Lifetime1 = 107 % ((param0 - 19) / 44);
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime2 = 0; var3Lifetime2 < 8; var3Lifetime2++) {
            this.field_c[var3Lifetime2] = 0L;
            var4 = 0;
            var5 = 56;
            while (8 > var4) {
              this.field_c[var3Lifetime2] = da.a(this.field_c[var3Lifetime2], le.field_A[var4][kl.b((int)(this.field_n[kl.b(7, var3Lifetime2 - var4)] >>> var5), 255)]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime2Lifetime1 = 0; 8 > var3Lifetime2Lifetime1; var3Lifetime2Lifetime1++) {
            this.field_n[var3Lifetime2Lifetime1] = this.field_c[var3Lifetime2Lifetime1];
          }
          this.field_n[0] = da.a(this.field_n[0], le.field_f[var2Lifetime2]);
          for (var3Lifetime2Lifetime2 = 0; var3Lifetime2Lifetime2 < 8; var3Lifetime2Lifetime2++) {
            this.field_c[var3Lifetime2Lifetime2] = this.field_n[var3Lifetime2Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_c[var3Lifetime2Lifetime2] = da.a(this.field_c[var3Lifetime2Lifetime2], le.field_A[var7][kl.b(255, (int)(this.field_k[kl.b(7, -var7 + var3Lifetime2Lifetime2)] >>> var5Lifetime1))]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (var3Lifetime2Lifetime3 = 0; var3Lifetime2Lifetime3 < 8; var3Lifetime2Lifetime3++) {
            this.field_k[var3Lifetime2Lifetime3] = this.field_c[var3Lifetime2Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; 8 > var2Lifetime3; var2Lifetime3++) {
          this.field_l[var2Lifetime3] = da.a(this.field_l[var2Lifetime3], da.a(this.field_b[var2Lifetime3], this.field_k[var2Lifetime3]));
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_d = null;
        field_g = null;
        field_f = null;
        field_i = null;
        field_h = null;
        field_e = null;
        int var1 = -28 / ((-26 - param0) / 44);
    }

    final void a(long param0, byte[] param1, byte param2) {
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
        var13 = wizardrun.field_H;
        try {
          var5_int = 0;
          if (param2 != -19) {
            field_f = (int[]) null;
          }
          var6 = 8 - ((int)param0 & 7) & 7;
          var7 = this.field_p & 7;
          var9 = param0;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((255 & this.field_m[var11]) + ((int)var9 & 255));
            this.field_m[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param0 > 8L) {
            var8 = 255 & param1[var5_int] << var6 | (param1[var5_int + 1] & 255) >>> 8 - var6;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_o[this.field_a] = (byte)sd.a((int) this.field_o[this.field_a], var8 >>> var7);
              this.field_p = this.field_p + (8 - var7);
              this.field_a = this.field_a + 1;
              if (this.field_p == 512) {
                this.b(-111);
                this.field_p = 0;
                this.field_a = 0;
              }
              this.field_o[this.field_a] = (byte)kl.b(var8 << -var7 + 8, 255);
              var5_int++;
              this.field_p = this.field_p + var7;
              param0 = param0 - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (0L >= param0) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = 255 & param1[var5_int] << var6;
            this.field_o[this.field_a] = (byte)sd.a((int) this.field_o[this.field_a], var8Lifetime1 >>> var7);
          }
          if (8L <= param0 + (long)var7) {
            this.field_a = this.field_a + 1;
            param0 = param0 - (long)(-var7 + 8);
            this.field_p = this.field_p + (-var7 + 8);
            if (this.field_p == 512) {
              this.b(86);
              this.field_a = 0;
              this.field_p = 0;
            }
            this.field_o[this.field_a] = (byte)kl.b(var8Lifetime1 << 8 - var7, 255);
            this.field_p = this.field_p + (int)param0;
          } else {
            this.field_p = (int)((long)this.field_p + param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("qk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = wizardrun.field_H;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_m[var2] = (byte) 0;
        }
        this.field_a = 0;
        this.field_p = 0;
        this.field_o[0] = (byte) 0;
        if (param0 < 56) {
          return;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_l[var2Lifetime1] = 0L;
        }
    }

    qk() {
        this.field_c = new long[8];
        this.field_b = new long[8];
        this.field_p = 0;
        this.field_a = 0;
        this.field_m = new byte[32];
        this.field_k = new long[8];
        this.field_o = new byte[64];
        this.field_n = new long[8];
        this.field_l = new long[8];
    }

    static {
        field_e = "Loading levels";
        field_d = "Password: ";
        field_i = "Music         ";
        field_h = "Create a free Account";
    }
}
