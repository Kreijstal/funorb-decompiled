/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    private byte[] field_g;
    static String field_e;
    private long[] field_d;
    private long[] field_c;
    private int field_k;
    private byte[] field_h;
    private int field_b;
    private long[] field_f;
    static long field_a;
    private long[] field_i;
    private long[] field_j;

    final static void a(byte param0) {
        if (param0 != 15) {
          field_a = -116L;
        }
        oc.field_c = new oj();
    }

    public static void b(byte param0) {
        if (param0 <= 82) {
          field_e = (String) null;
        }
        field_e = null;
    }

    private final void a(int param0) {
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
        var6 = stellarshard.field_B;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_i[var2] = ue.a(stellarshard.a((long)this.field_h[var3 + 7], 255L), ue.a(ue.a(stellarshard.a(16711680L, (long)this.field_h[var3 + 5] << 16), ue.a(ue.a(ue.a(ue.a(stellarshard.a((long)this.field_h[1 + var3], 255L) << 48, (long)this.field_h[var3] << 56), stellarshard.a(255L, (long)this.field_h[2 + var3]) << 40), stellarshard.a(1095216660480L, (long)this.field_h[3 + var3] << 32)), stellarshard.a(255L, (long)this.field_h[var3 + 4]) << 24)), stellarshard.a(65280L, (long)this.field_h[var3 + 6] << 8)));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_c[var2Lifetime1];
          arrayValue$1 = this.field_i[var2Lifetime1];
          this.field_f[var2Lifetime1] = dupTemp$0;
          this.field_d[var2Lifetime1] = ue.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = param0; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; 8 > var3Lifetime1; var3Lifetime1++) {
            this.field_j[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (8 > var4) {
              this.field_j[var3Lifetime1] = ue.a(this.field_j[var3Lifetime1], pd.field_l[var4][sa.a(255, (int)(this.field_f[sa.a(-var4 + var3Lifetime1, 7)] >>> var5))]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; 8 > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
            this.field_f[var3Lifetime1Lifetime1] = this.field_j[var3Lifetime1Lifetime1];
          }
          this.field_f[0] = ue.a(this.field_f[0], pd.field_j[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; 8 > var3Lifetime1Lifetime2; var3Lifetime1Lifetime2++) {
            this.field_j[var3Lifetime1Lifetime2] = this.field_f[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_j[var3Lifetime1Lifetime2] = ue.a(this.field_j[var3Lifetime1Lifetime2], pd.field_l[var7][sa.a((int)(this.field_d[sa.a(7, var3Lifetime1Lifetime2 - var7)] >>> var5Lifetime1), 255)]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_d[var3Lifetime1Lifetime3] = this.field_j[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_c[var2Lifetime3] = ue.a(this.field_c[var2Lifetime3], ue.a(this.field_i[var2Lifetime3], this.field_d[var2Lifetime3]));
        }
    }

    final void a(long param0, byte param1, byte[] param2) {
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
        var13 = stellarshard.field_B;
        try {
          var5_int = 0;
          var6 = 8 - ((int)param0 & 7) & 7;
          if (param1 != -78) {
            this.field_b = 118;
          }
          var7 = 7 & this.field_k;
          var9 = param0;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((255 & this.field_g[var11]) + ((int)var9 & 255));
            this.field_g[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param0 > 8L) {
            var8 = param2[var5_int] << var6 & 255 | (255 & param2[var5_int + 1]) >>> 8 - var6;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_h[this.field_b] = (byte)vf.b((int) this.field_h[this.field_b], var8 >>> var7);
              this.field_k = this.field_k + (-var7 + 8);
              this.field_b = this.field_b + 1;
              if (this.field_k == 512) {
                this.a(param1 ^ -77);
                this.field_b = 0;
                this.field_k = 0;
              }
              this.field_h[this.field_b] = (byte)sa.a(var8 << -var7 + 8, 255);
              this.field_k = this.field_k + var7;
              var5_int++;
              param0 = param0 - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param0 <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = 255 & param2[var5_int] << var6;
            this.field_h[this.field_b] = (byte)vf.b((int) this.field_h[this.field_b], var8Lifetime1 >>> var7);
          }
          if (param0 + (long)var7 < 8L) {
            this.field_k = (int)((long)this.field_k + param0);
          } else {
            this.field_b = this.field_b + 1;
            this.field_k = this.field_k + (8 - var7);
            param0 = param0 - (long)(-var7 + 8);
            if (this.field_k == 512) {
              this.a(param1 + 79);
              this.field_b = 0;
              this.field_k = 0;
            }
            this.field_h[this.field_b] = (byte)sa.a(var8Lifetime1 << -var7 + 8, 255);
            this.field_k = this.field_k + (int)param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("we.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, String param2) {
        try {
          ck.field_db = true;
          ak.field_a = param0 ? true : false;
          ei.field_G = new ck(na.field_d, s.field_c, param2, gk.field_a, ak.field_a);
          if (param1 != 12757) {
            field_e = (String) null;
          }
          na.field_d.a((byte) -108, (rj) (ei.field_G));
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "we.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = stellarshard.field_B;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_g[var2] = (byte) 0;
        }
        if (param0) {
          this.field_h = (byte[]) null;
        }
        this.field_b = 0;
        this.field_k = 0;
        this.field_h[0] = (byte) 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_c[var2Lifetime1] = 0L;
        }
    }

    final void a(byte[] param0, int param1, int param2) {
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
        var8 = stellarshard.field_B;
        try {
          this.field_h[this.field_b] = (byte)vf.b((int) this.field_h[this.field_b], 128 >>> sa.a(7, this.field_k));
          this.field_b = this.field_b + 1;
          if (this.field_b > 32) {
            while (64 > this.field_b) {
              fieldTemp$0 = this.field_b;
              this.field_b = this.field_b + 1;
              this.field_h[fieldTemp$0] = (byte) 0;
            }
            this.a(1);
            this.field_b = 0;
          }
          while (this.field_b < 32) {
            fieldTemp$1 = this.field_b;
            this.field_b = this.field_b + 1;
            this.field_h[fieldTemp$1] = (byte) 0;
          }
          ri.a(this.field_g, 0, this.field_h, 32, 32);
          this.a(1);
          var4_int = 0;
          var5 = param1;
          while (8 > var4_int) {
            var6 = this.field_c[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[1 + var5] = (byte)(int)(var6 >>> 48);
            param0[2 + var5] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[var5 + 4] = (byte)(int)(var6 >>> 24);
            param0[var5 + 5] = (byte)(int)(var6 >>> 16);
            param0[var5 + 6] = (byte)(int)(var6 >>> 8);
            param0[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          if (param2 != 22297) {
            this.a(62);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("we.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static ub a(byte[] param0, int param1) {
        ub var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ub stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (ub) (stackIn_2_0);
          }
          var2 = new ub(param0, ak.field_c, vi.field_c, vc.field_b, ih.field_d, ih.field_b);
          tb.f((byte) -128);
          if (param1 != 1) {
            we.a((byte) 22);
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("we.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    we() {
        this.field_g = new byte[32];
        this.field_d = new long[8];
        this.field_h = new byte[64];
        this.field_f = new long[8];
        this.field_c = new long[8];
        this.field_b = 0;
        this.field_k = 0;
        this.field_j = new long[8];
        this.field_i = new long[8];
    }

    static {
        field_e = "Super cannon";
    }
}
