/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private long[] field_m;
    private long[] field_j;
    private long[] field_f;
    private byte[] field_d;
    private int field_a;
    static String field_c;
    private long[] field_i;
    static int field_g;
    private long[] field_l;
    static String field_b;
    private int field_k;
    private byte[] field_e;
    static float[] field_h;

    private final void a(boolean param0) {
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
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        if (param0) {
          this.a(false);
        }
        var3 = 0;
        while (var2 < 8) {
          this.field_m[var2] = oo.a(oo.a(oo.a(oo.a(vi.a((long)this.field_e[4 + var3] << 24, 4278190080L), oo.a(vi.a(255L, (long)this.field_e[3 + var3]) << 32, oo.a(oo.a((long)this.field_e[var3] << 56, vi.a((long)this.field_e[1 + var3] << 48, 71776119061217280L)), vi.a(280375465082880L, (long)this.field_e[var3 + 2] << 40)))), vi.a((long)this.field_e[5 + var3], 255L) << 16), vi.a(255L, (long)this.field_e[6 + var3]) << 8), vi.a((long)this.field_e[7 + var3], 255L));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          dupTemp$0 = this.field_l[var2Lifetime1];
          arrayValue$1 = this.field_m[var2Lifetime1];
          this.field_i[var2Lifetime1] = dupTemp$0;
          this.field_f[var2Lifetime1] = oo.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; 8 > var3Lifetime1; var3Lifetime1++) {
            this.field_j[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_j[var3Lifetime1] = oo.a(this.field_j[var3Lifetime1], vka.field_I[var4][sea.c(255, (int)(this.field_i[sea.c(-var4 + var3Lifetime1, 7)] >>> var5))]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_i[var3Lifetime1Lifetime1] = this.field_j[var3Lifetime1Lifetime1];
          }
          this.field_i[0] = oo.a(this.field_i[0], vka.field_H[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; 8 > var3Lifetime1Lifetime2; var3Lifetime1Lifetime2++) {
            this.field_j[var3Lifetime1Lifetime2] = this.field_i[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (8 > var7) {
              this.field_j[var3Lifetime1Lifetime2] = oo.a(this.field_j[var3Lifetime1Lifetime2], vka.field_I[var7][sea.c(255, (int)(this.field_f[sea.c(var3Lifetime1Lifetime2 - var7, 7)] >>> var5Lifetime1))]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_f[var3Lifetime1Lifetime3] = this.field_j[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; 8 > var2Lifetime3; var2Lifetime3++) {
          this.field_l[var2Lifetime3] = oo.a(this.field_l[var2Lifetime3], oo.a(this.field_m[var2Lifetime3], this.field_f[var2Lifetime3]));
        }
    }

    final void a(byte[] param0, long param1, byte param2) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
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
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 != -59) {
            this.field_m = (long[]) null;
          }
          var5_int = 0;
          var6 = -((int)param1 & 7) + 8 & 7;
          var7 = 7 & this.field_a;
          var9 = param1;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((255 & this.field_d[var11]) + ((int)var9 & 255));
            this.field_d[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
          }
          while (param1 > 8L) {
            var8 = param0[var5_int] << var6 & 255 | (param0[var5_int + 1] & 255) >>> -var6 + 8;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_e[this.field_k] = (byte)fh.a((int) this.field_e[this.field_k], var8 >>> var7);
              this.field_a = this.field_a + (8 - var7);
              this.field_k = this.field_k + 1;
              if (this.field_a == 512) {
                this.a(false);
                this.field_k = 0;
                this.field_a = 0;
              }
              this.field_e[this.field_k] = (byte)sea.c(255, var8 << 8 - var7);
              var5_int++;
              this.field_a = this.field_a + var7;
              param1 = param1 - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param1 > 0L) {
            stackIn_18_0 = param0[var5_int] << var6;
            stackIn_18_1 = 255;
            var8Lifetime1 = stackIn_18_0 & stackIn_18_1;
            this.field_e[this.field_k] = (byte)fh.a((int) this.field_e[this.field_k], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (param1 + (long)var7 >= 8L) {
            this.field_a = this.field_a + (8 - var7);
            param1 = param1 - (long)(-var7 + 8);
            this.field_k = this.field_k + 1;
            if (this.field_a == 512) {
              this.a(false);
              this.field_a = 0;
              this.field_k = 0;
            }
            this.field_e[this.field_k] = (byte)sea.c(255, var8Lifetime1 << 8 - var7);
            this.field_a = this.field_a + (int)param1;
          } else {
            this.field_a = (int)((long)this.field_a + param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("vh.F(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        upa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        kh var14 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          var14 = vc.field_q;
          var2 = var14.h(255);
          var3 = (upa) (ina.field_d.f(param0 ^ 100));
          while (var3 != null) {
            if (var3.field_n != var2) {
              var3 = (upa) (ina.field_d.e(117));
              continue;
            }
            break;
          }
          if (var3 == null) {
            dea.a(60);
            return;
          }
          var4 = var14.h(255);
          if (param0 != -44) {
            vh.a((byte) 81);
          }
          if (var4 != 0) {
            bra.field_M[0] = fna.field_k;
            var5 = var3.field_k;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              bra.field_M[var6_int] = var14.e((byte) -76);
            }
            dc.a(var4, var5, (byte) 47);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              dga.a(var14, 0);
              if (var6_intLifetime1 != 0) {
                qt.a(kc.field_b, vd.field_p, ir.field_a, var6_intLifetime1, tna.field_f, (byte) -90);
              } else {
                var3.field_g = ir.field_a;
                var3.field_f = kc.field_b;
                var3.field_l = tna.field_f;
                var3.field_j = vd.field_p;
                qt.a(kc.field_b, vd.field_p, ir.field_a, var6_intLifetime1, tna.field_f, (byte) -97);
              }
            }
            ri.a(var5, (byte) 29);
            dupTemp$0 = new String[2][var5];
            var3.field_h = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][4 * var5];
            var3.field_m = dupTemp$1;
            var7 = dupTemp$1;
            var8 = ola.field_Eb;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = boa.field_n[var9];
              var6[0][var10] = bra.field_M[var11];
              var7[0][4 * var10] = jk.field_h[var11];
              var7[0][1 + 4 * var10] = cu.field_o[var11];
              var7[0][2 + 4 * var10] = bq.field_h[var11];
              var7[0][var10 * 4 + 3] = im.field_o[var11];
              if (ue.a(bra.field_M[var11], 0) &&
                im.field_o[var11] + cu.field_o[var11] + bq.field_h[var11] == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = boa.field_n[var5 + var9Lifetime1];
              var6[1][var13] = bra.field_M[var11Lifetime1];
              var7[1][4 * var13] = jk.field_h[var11Lifetime1];
              var7[1][1 + var13 * 4] = cu.field_o[var11Lifetime1];
              var7[1][4 * var13 + 2] = bq.field_h[var11Lifetime1];
              var7[1][3 + 4 * var13] = im.field_o[var11Lifetime1];
              if (ue.a(bra.field_M[var11Lifetime1], param0 + 44) &&
                0 == im.field_o[var11Lifetime1] + (bq.field_h[var11Lifetime1] + cu.field_o[var11Lifetime1])) {
                var6[1][var13] = null;
                var13--;
              }
              var13++;
              var9Lifetime1++;
            }
          }
          var3.field_i = true;
          var3.p(7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "vh.D(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_d[var2] = (byte) 0;
        }
        this.field_a = 0;
        this.field_k = 0;
        this.field_e[0] = (byte) 0;
        var2Lifetime1 = 0;
        int var3 = 115 / ((param0 - 58) / 35);
        while (8 > var2Lifetime1) {
          this.field_l[var2Lifetime1] = 0L;
          var2Lifetime1++;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 >= -15) {
          return;
        }
        field_c = null;
    }

    final void a(int param0, int param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          this.field_e[this.field_k] = (byte)fh.a((int) this.field_e[this.field_k], 128 >>> sea.c(this.field_a, 7));
          this.field_k = this.field_k + 1;
          if (this.field_k > param1) {
            while (this.field_k < 64) {
              fieldTemp$0 = this.field_k;
              this.field_k = this.field_k + 1;
              this.field_e[fieldTemp$0] = (byte) 0;
            }
            this.a(false);
            this.field_k = 0;
          }
          while (this.field_k < 32) {
            fieldTemp$1 = this.field_k;
            this.field_k = this.field_k + 1;
            this.field_e[fieldTemp$1] = (byte) 0;
          }
          lua.a(this.field_d, 0, this.field_e, 32, 32);
          this.a(false);
          var4_int = 0;
          var5 = param0;
          while (var4_int < 8) {
            var6 = this.field_l[var4_int];
            param2[var5] = (byte)(int)(var6 >>> 56);
            param2[var5 + 1] = (byte)(int)(var6 >>> 48);
            param2[var5 + 2] = (byte)(int)(var6 >>> 40);
            param2[var5 + 3] = (byte)(int)(var6 >>> 32);
            param2[var5 + 4] = (byte)(int)(var6 >>> 24);
            param2[var5 + 5] = (byte)(int)(var6 >>> 16);
            param2[6 + var5] = (byte)(int)(var6 >>> 8);
            param2[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("vh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean a(int param0, boolean param1, int param2, lj param3) {
        RuntimeException var4 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -27201) {
            field_b = (String) null;
          }
          if (!param1) {
            stackIn_10_0 = (param0 == param3.n(31974).field_d);
            return stackIn_10_0;
          }
          stackIn_6_0 = (param3.i((byte) 84).field_d == param0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("vh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    vh() {
        this.field_m = new long[8];
        this.field_a = 0;
        this.field_j = new long[8];
        this.field_f = new long[8];
        this.field_i = new long[8];
        this.field_d = new byte[32];
        this.field_l = new long[8];
        this.field_e = new byte[64];
        this.field_k = 0;
    }

    static {
        field_c = "Some objects in the game can be pushed or pulled. Walk into them holding <img=8><img=9>";
        field_h = new float[4];
        field_b = "3rd";
    }
}
