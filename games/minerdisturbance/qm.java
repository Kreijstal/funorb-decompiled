/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm {
    private long[] field_b;
    static boolean field_f;
    private long[] field_c;
    private long[] field_e;
    private int field_i;
    static java.awt.Color field_j;
    private byte[] field_d;
    private byte[] field_k;
    private long[] field_l;
    private long[] field_m;
    static int field_a;
    private int field_o;
    static String[][] field_g;
    static bg field_h;
    static String field_n;

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        ti.field_I[fb.field_c] = param2;
        an.field_a[fb.field_c] = fb.field_c;
        pi.field_h[fb.field_c] = param0;
        if (!(he.field_e <= param0)) {
          bc.field_d = param0;
        }
        if (param0 > bd.field_g) {
          v.field_c = param0;
        }
        jk.field_db[fb.field_c] = param4;
        qa.field_c[fb.field_c] = param5;
        li.field_a[fb.field_c] = param1;
        int var6 = param1 + (param5 + param4);
        int var7 = var6 == 0 ? 0 : param4 * 1000 / var6;
        cc.field_L[fb.field_c] = var7;
        if (v.field_c < var7) {
          v.field_c = var7;
        }
        if (!(bc.field_d <= var7)) {
          bc.field_d = var7;
        }
        fb.field_c = fb.field_c + 1;
        if (!param3) {
          field_f = false;
        }
    }

    final void a(int param0, byte[] param1, int param2) {
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
        var8 = MinerDisturbance.field_ab;
        try {
          this.field_k[this.field_o] = (byte)hi.a((int) this.field_k[this.field_o], 128 >>> c.a(7, this.field_i));
          this.field_o = this.field_o + 1;
          if (param2 != 8) {
            return;
          }
          if (this.field_o > 32) {
            while (64 > this.field_o) {
              fieldTemp$0 = this.field_o;
              this.field_o = this.field_o + 1;
              this.field_k[fieldTemp$0] = (byte) 0;
            }
            this.a(-92);
            this.field_o = 0;
          }
          while (this.field_o < 32) {
            fieldTemp$1 = this.field_o;
            this.field_o = this.field_o + 1;
            this.field_k[fieldTemp$1] = (byte) 0;
          }
          ai.a(this.field_d, 0, this.field_k, 32, 32);
          this.a(-63);
          var4_int = 0;
          var5 = param0;
          while (var4_int < 8) {
            var6 = this.field_b[var4_int];
            param1[var5] = (byte)(int)(var6 >>> 56);
            param1[1 + var5] = (byte)(int)(var6 >>> 48);
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
          stackIn_15_1 = new StringBuilder().append("qm.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = MinerDisturbance.field_ab;
        int var2Lifetime1;
        for (var2 = 0; 32 > var2; var2++) {
          this.field_d[var2] = (byte) 0;
        }
        this.field_i = 0;
        this.field_k[0] = (byte) 0;
        this.field_o = 0;
        var2Lifetime1 = 0;
        if (param0 != -29) {
          this.field_d = (byte[]) null;
        }
        while (var2Lifetime1 < 8) {
          this.field_b[var2Lifetime1] = 0L;
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
        var6 = MinerDisturbance.field_ab;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_e[var2] = te.a(te.a(bf.a((long)this.field_k[6 + var3] << 8, 65280L), te.a(te.a(te.a(bf.a((long)this.field_k[3 + var3], 255L) << 32, te.a(te.a(bf.a((long)this.field_k[1 + var3], 255L) << 48, (long)this.field_k[var3] << 56), bf.a((long)this.field_k[2 + var3], 255L) << 40)), bf.a(255L, (long)this.field_k[4 + var3]) << 24), bf.a(16711680L, (long)this.field_k[var3 + 5] << 16))), bf.a(255L, (long)this.field_k[var3 + 7]));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_b[var2Lifetime1];
          arrayValue$1 = this.field_e[var2Lifetime1];
          this.field_m[var2Lifetime1] = dupTemp$0;
          this.field_c[var2Lifetime1] = te.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_l[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (8 > var4) {
              this.field_l[var3Lifetime1] = te.a(this.field_l[var3Lifetime1], cb.field_h[var4][c.a((int)(this.field_m[c.a(-var4 + var3Lifetime1, 7)] >>> var5), 255)]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; 8 > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
            this.field_m[var3Lifetime1Lifetime1] = this.field_l[var3Lifetime1Lifetime1];
          }
          this.field_m[0] = te.a(this.field_m[0], cb.field_f[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_l[var3Lifetime1Lifetime2] = this.field_m[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_l[var3Lifetime1Lifetime2] = te.a(this.field_l[var3Lifetime1Lifetime2], cb.field_h[var7][c.a((int)(this.field_c[c.a(-var7 + var3Lifetime1Lifetime2, 7)] >>> var5Lifetime1), 255)]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_c[var3Lifetime1Lifetime3] = this.field_l[var3Lifetime1Lifetime3];
          }
        }
        if (param0 >= -61) {
          field_n = (String) null;
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_b[var2Lifetime3] = te.a(this.field_b[var2Lifetime3], te.a(this.field_e[var2Lifetime3], this.field_c[var2Lifetime3]));
        }
    }

    public static void b(int param0) {
        field_g = (String[][]) null;
        if (param0 != -31434) {
          return;
        }
        field_j = null;
        field_h = null;
        field_n = null;
    }

    final void a(byte[] param0, int param1, long param2) {
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
        var13 = MinerDisturbance.field_ab;
        try {
          var5_int = 0;
          var6 = 7 & 8 - (7 & (int)param2);
          var7 = 7 & this.field_i;
          var9 = param2;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + (((int)var9 & 255) + (this.field_d[var11] & 255));
            this.field_d[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
          }
          if (param1 != -21816) {
            this.field_l = (long[]) null;
          }
          while (param2 > 8L) {
            var8 = param0[var5_int] << var6 & 255 | (param0[1 + var5_int] & 255) >>> -var6 + 8;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_k[this.field_o] = (byte)hi.a((int) this.field_k[this.field_o], var8 >>> var7);
              this.field_o = this.field_o + 1;
              this.field_i = this.field_i + (8 - var7);
              if (512 == this.field_i) {
                this.a(param1 ^ 21770);
                this.field_i = 0;
                this.field_o = 0;
              }
              this.field_k[this.field_o] = (byte)c.a(var8 << 8 - var7, 255);
              this.field_i = this.field_i + var7;
              var5_int++;
              param2 = param2 - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param2 <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = param0[var5_int] << var6 & 255;
            this.field_k[this.field_o] = (byte)hi.a((int) this.field_k[this.field_o], var8Lifetime1 >>> var7);
          }
          if (param2 + (long)var7 < 8L) {
            this.field_i = (int)((long)this.field_i + param2);
          } else {
            this.field_o = this.field_o + 1;
            this.field_i = this.field_i + (8 - var7);
            param2 = param2 - (long)(8 - var7);
            if (this.field_i == 512) {
              this.a(-124);
              this.field_i = 0;
              this.field_o = 0;
            }
            this.field_k[this.field_o] = (byte)c.a(255, var8Lifetime1 << -var7 + 8);
            this.field_i = this.field_i + (int)param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("qm.B(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    qm() {
        this.field_c = new long[8];
        this.field_e = new long[8];
        this.field_d = new byte[32];
        this.field_l = new long[8];
        this.field_m = new long[8];
        this.field_i = 0;
        this.field_k = new byte[64];
        this.field_b = new long[8];
        this.field_o = 0;
    }

    static {
        field_j = new java.awt.Color(10040319);
        field_a = 66;
        field_g = new String[][]{new String[]{"You've got a nice haul there, miner! You might want to start thinking about heading for the exit. Braver folk stay in the mines longer, but they don't often make it out.", "", "To get out, you need to reach the rope at the top of the volcano, where you started. To get up there, you'll need to be good at jumping, causing cave-ins to create platforms, and have a little bit of luck!"}};
        field_n = "Ranking: Magma Miner";
        field_h = new bg(11, 0, 1, 2);
    }
}
