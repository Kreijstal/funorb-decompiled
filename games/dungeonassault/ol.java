/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    private long[] field_f;
    private long[] field_g;
    private long[] field_j;
    static int[] field_k;
    private byte[] field_m;
    static af field_i;
    private int field_h;
    private long[] field_c;
    private byte[] field_l;
    private int field_d;
    static cn[] field_a;
    private long[] field_e;
    static cn field_b;

    final void a(byte param0, byte[] param1, int param2) {
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
        var8 = DungeonAssault.field_K;
        try {
          this.field_m[this.field_h] = (byte)mp.a((int) this.field_m[this.field_h], 128 >>> nb.a(this.field_d, 7));
          if (param0 != -88) {
            this.b(-45);
          }
          this.field_h = this.field_h + 1;
          if (this.field_h > 32) {
            while (this.field_h < 64) {
              fieldTemp$0 = this.field_h;
              this.field_h = this.field_h + 1;
              this.field_m[fieldTemp$0] = (byte) 0;
            }
            this.a(param0 + 96);
            this.field_h = 0;
          }
          while (this.field_h < 32) {
            fieldTemp$1 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_m[fieldTemp$1] = (byte) 0;
          }
          cj.a(this.field_l, 0, this.field_m, 32, 32);
          this.a(8);
          var4_int = 0;
          var5 = param2;
          while (var4_int < 8) {
            var6 = this.field_g[var4_int];
            param1[var5] = (byte)(int)(var6 >>> 56);
            param1[1 + var5] = (byte)(int)(var6 >>> 48);
            param1[2 + var5] = (byte)(int)(var6 >>> 40);
            param1[var5 + 3] = (byte)(int)(var6 >>> 32);
            param1[var5 + 4] = (byte)(int)(var6 >>> 24);
            param1[var5 + 5] = (byte)(int)(var6 >>> 16);
            param1[var5 + 6] = (byte)(int)(var6 >>> 8);
            param1[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ol.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var4 = DungeonAssault.field_K;
        int var2Lifetime1;
        for (var2 = 0; 32 > var2; var2++) {
          this.field_l[var2] = (byte) 0;
        }
        this.field_d = 0;
        this.field_m[0] = (byte) 0;
        this.field_h = 0;
        var2Lifetime1 = 0;
        int var3 = 31 / ((param0 - 84) / 40);
        while (8 > var2Lifetime1) {
          this.field_g[var2Lifetime1] = 0L;
          var2Lifetime1++;
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
        var6 = DungeonAssault.field_K;
        var2 = 0;
        var3 = 0;
        while (8 > var2) {
          this.field_j[var2] = mn.a(eg.a(255L, (long)this.field_m[7 + var3]), mn.a(eg.a((long)this.field_m[6 + var3], 255L) << 8, mn.a(mn.a(eg.a(255L, (long)this.field_m[4 + var3]) << 24, mn.a(eg.a(255L, (long)this.field_m[var3 + 3]) << 32, mn.a(eg.a((long)this.field_m[2 + var3] << 40, 280375465082880L), mn.a(eg.a(255L, (long)this.field_m[1 + var3]) << 48, (long)this.field_m[var3] << 56)))), eg.a((long)this.field_m[5 + var3] << 16, 16711680L))));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_g[var2Lifetime1];
          arrayValue$1 = this.field_j[var2Lifetime1];
          this.field_c[var2Lifetime1] = dupTemp$0;
          this.field_f[var2Lifetime1] = mn.a(arrayValue$1, dupTemp$0);
        }
        if (param0 != 8) {
          this.field_j = (long[]) null;
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_e[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_e[var3Lifetime1] = mn.a(this.field_e[var3Lifetime1], gh.field_h[var4][nb.a(255, (int)(this.field_c[nb.a(7, var3Lifetime1 - var4)] >>> var5))]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_c[var3Lifetime1Lifetime1] = this.field_e[var3Lifetime1Lifetime1];
          }
          this.field_c[0] = mn.a(this.field_c[0], gh.field_a[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_e[var3Lifetime1Lifetime2] = this.field_c[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_e[var3Lifetime1Lifetime2] = mn.a(this.field_e[var3Lifetime1Lifetime2], gh.field_h[var7][nb.a(255, (int)(this.field_f[nb.a(7, var3Lifetime1Lifetime2 - var7)] >>> var5Lifetime1))]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; 8 > var3Lifetime1Lifetime3; var3Lifetime1Lifetime3++) {
            this.field_f[var3Lifetime1Lifetime3] = this.field_e[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_g[var2Lifetime3] = mn.a(this.field_g[var2Lifetime3], mn.a(this.field_f[var2Lifetime3], this.field_j[var2Lifetime3]));
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_i = null;
        if (param0 >= -38) {
          return;
        }
        field_k = null;
        field_b = null;
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
        var13 = DungeonAssault.field_K;
        try {
          var5_int = 0;
          var6 = 7 & -(7 & (int)param0) + 8;
          var7 = 7 & this.field_d;
          if (param1 != 17567) {
            return;
          }
          var9 = param0;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + (((int)var9 & 255) + (255 & this.field_l[var11]));
            this.field_l[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param0 > 8L) {
            var8 = 255 & param2[var5_int] << var6 | (param2[var5_int + 1] & 255) >>> -var6 + 8;
            if (0 <= var8 &&
              var8 < 256) {
              this.field_m[this.field_h] = (byte)mp.a((int) this.field_m[this.field_h], var8 >>> var7);
              this.field_h = this.field_h + 1;
              this.field_d = this.field_d + (8 - var7);
              if (this.field_d == 512) {
                this.a(param1 - 17559);
                this.field_d = 0;
                this.field_h = 0;
              }
              this.field_m[this.field_h] = (byte)nb.a(var8 << -var7 + 8, 255);
              param0 = param0 - 8L;
              var5_int++;
              this.field_d = this.field_d + var7;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param0 <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = param2[var5_int] << var6 & 255;
            this.field_m[this.field_h] = (byte)mp.a((int) this.field_m[this.field_h], var8Lifetime1 >>> var7);
          }
          if (param0 + (long)var7 < 8L) {
            this.field_d = (int)((long)this.field_d + param0);
          } else {
            this.field_d = this.field_d + (-var7 + 8);
            param0 = param0 - (long)(8 - var7);
            this.field_h = this.field_h + 1;
            if (512 == this.field_d) {
              this.a(8);
              this.field_h = 0;
              this.field_d = 0;
            }
            this.field_m[this.field_h] = (byte)nb.a(255, var8Lifetime1 << -var7 + 8);
            this.field_d = this.field_d + (int)param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("ol.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        ne var2 = null;
        int var3 = 0;
        ue var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = DungeonAssault.field_K;
        try {
          var4 = (ue) (qm.field_q.e(-24172));
          while (var4 != null) {
            wd.a((byte) -69, param1, var4);
            var4 = (ue) (qm.field_q.a(param0 ^ 12));
          }
          if (param0 != 8) {
            ol.a((byte) -74);
          }
          var2 = bg.field_s.e(param0 - 24180);
          while (var2 != null) {
            hp.a(param1, (byte) 110);
            var2 = bg.field_s.a(param0 ^ 12);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2_ref), "ol.E(" + param0 + ',' + param1 + ')');
        }
    }

    ol() {
        this.field_g = new long[8];
        this.field_f = new long[8];
        this.field_j = new long[8];
        this.field_d = 0;
        this.field_m = new byte[64];
        this.field_c = new long[8];
        this.field_l = new byte[32];
        this.field_e = new long[8];
        this.field_h = 0;
    }

    static {
    }
}
