/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ur {
    private long[] field_h;
    static String field_b;
    private byte[] field_k;
    static oha[] field_e;
    private long[] field_g;
    private long[] field_n;
    private long[] field_o;
    static String field_p;
    private byte[] field_i;
    static String field_f;
    static int field_d;
    private long[] field_a;
    private int field_l;
    private int field_c;
    static String field_m;
    static String field_j;

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        int var2Lifetime1;
        if (!param0) {
          return;
        }
        for (var2 = 0; 32 > var2; var2++) {
          this.field_k[var2] = (byte) 0;
        }
        this.field_l = 0;
        this.field_i[0] = (byte) 0;
        this.field_c = 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_h[var2Lifetime1] = 0L;
        }
    }

    final void a(byte[] param0, long param1, int param2) {
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
        int var8Lifetime1;
        var13 = BachelorFridge.field_y;
        try {
          var5_int = param2;
          var6 = -(7 & (int)param1) + 8 & 7;
          var7 = 7 & this.field_l;
          var9 = param1;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((255 & this.field_k[var11]) + ((int)var9 & 255));
            this.field_k[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
          }
          while (param1 > 8L) {
            var8 = 255 & param0[var5_int] << var6 | (255 & param0[var5_int + 1]) >>> -var6 + 8;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_i[this.field_c] = (byte)mp.a((int) this.field_i[this.field_c], var8 >>> var7);
              this.field_l = this.field_l + (-var7 + 8);
              this.field_c = this.field_c + 1;
              if (this.field_l == 512) {
                this.a(false);
                this.field_c = 0;
                this.field_l = 0;
              }
              this.field_i[this.field_c] = (byte)dda.a(255, var8 << 8 - var7);
              var5_int++;
              this.field_l = this.field_l + var7;
              param1 = param1 - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (0L >= param1) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = param0[var5_int] << var6 & 255;
            this.field_i[this.field_c] = (byte)mp.a((int) this.field_i[this.field_c], var8Lifetime1 >>> var7);
          }
          if ((long)var7 + param1 >= 8L) {
            this.field_l = this.field_l + (8 - var7);
            param1 = param1 - (long)(8 - var7);
            this.field_c = this.field_c + 1;
            if (this.field_l == 512) {
              this.a(false);
              this.field_c = 0;
              this.field_l = 0;
            }
            this.field_i[this.field_c] = (byte)dda.a(255, var8Lifetime1 << -var7 + 8);
            this.field_l = this.field_l + (int)param1;
          } else {
            this.field_l = (int)((long)this.field_l + param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("ur.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          this.field_i[this.field_c] = (byte)mp.a((int) this.field_i[this.field_c], 128 >>> dda.a(this.field_l, 7));
          this.field_c = this.field_c + 1;
          if (this.field_c > 32) {
            while (this.field_c < 64) {
              fieldTemp$0 = this.field_c;
              this.field_c = this.field_c + 1;
              this.field_i[fieldTemp$0] = (byte) 0;
            }
            this.a(false);
            this.field_c = 0;
          }
          while (this.field_c < 32) {
            fieldTemp$1 = this.field_c;
            this.field_c = this.field_c + 1;
            this.field_i[fieldTemp$1] = (byte) 0;
          }
          bl.a(this.field_k, 0, this.field_i, 32, 32);
          this.a(false);
          var6 = -122 % ((param0 - 10) / 46);
          var4_int = 0;
          var5 = param1;
          while (var4_int < 8) {
            var7 = this.field_h[var4_int];
            param2[var5] = (byte)(int)(var7 >>> 56);
            param2[var5 + 1] = (byte)(int)(var7 >>> 48);
            param2[var5 + 2] = (byte)(int)(var7 >>> 40);
            param2[var5 + 3] = (byte)(int)(var7 >>> 32);
            param2[var5 + 4] = (byte)(int)(var7 >>> 24);
            param2[5 + var5] = (byte)(int)(var7 >>> 16);
            param2[6 + var5] = (byte)(int)(var7 >>> 8);
            param2[7 + var5] = (byte)(int)var7;
            var5 += 8;
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ur.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static pp a(lu param0, byte param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ela stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = qi.a(param0, (byte) 112);
          if (param1 != 120) {
            ur.a(-96);
          }
          var3 = param0.b(param1 ^ 16711815);
          stackIn_3_0 = new ela(var2, var3);
          return (pp) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("ur.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

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
        var6 = BachelorFridge.field_y;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_o[var2] = gv.a(gv.a(gv.a(gv.a(gv.a(gv.a(gv.a((long)this.field_i[var3] << 56, gda.a(255L, (long)this.field_i[var3 + 1]) << 48), gda.a(280375465082880L, (long)this.field_i[var3 + 2] << 40)), gda.a((long)this.field_i[var3 + 3] << 32, 1095216660480L)), gda.a(4278190080L, (long)this.field_i[var3 + 4] << 24)), gda.a(255L, (long)this.field_i[5 + var3]) << 16), gda.a((long)this.field_i[6 + var3] << 8, 65280L)), gda.a(255L, (long)this.field_i[7 + var3]));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          dupTemp$0 = this.field_h[var2Lifetime1];
          arrayValue$1 = this.field_o[var2Lifetime1];
          this.field_g[var2Lifetime1] = dupTemp$0;
          this.field_n[var2Lifetime1] = gv.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_a[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (8 > var4) {
              this.field_a[var3Lifetime1] = gv.a(this.field_a[var3Lifetime1], hha.field_v[var4][dda.a(255, (int)(this.field_g[dda.a(var3Lifetime1 - var4, 7)] >>> var5))]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_g[var3Lifetime1Lifetime1] = this.field_a[var3Lifetime1Lifetime1];
          }
          this.field_g[0] = gv.a(this.field_g[0], hha.field_z[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; 8 > var3Lifetime1Lifetime2; var3Lifetime1Lifetime2++) {
            this.field_a[var3Lifetime1Lifetime2] = this.field_g[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (8 > var7) {
              this.field_a[var3Lifetime1Lifetime2] = gv.a(this.field_a[var3Lifetime1Lifetime2], hha.field_v[var7][dda.a(255, (int)(this.field_n[dda.a(7, var3Lifetime1Lifetime2 - var7)] >>> var5Lifetime1))]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_n[var3Lifetime1Lifetime3] = this.field_a[var3Lifetime1Lifetime3];
          }
        }
        var2Lifetime3 = 0;
        if (param0) {
          this.a(true);
        }
        while (var2Lifetime3 < 8) {
          this.field_h[var2Lifetime3] = gv.a(this.field_h[var2Lifetime3], gv.a(this.field_n[var2Lifetime3], this.field_o[var2Lifetime3]));
          var2Lifetime3++;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 != 512) {
          field_d = -72;
        }
        if (eo.field_l <= param1 - param0 &&
          pw.field_x >= param0 + param1 &&
          an.field_q <= -param0 + param2 &&
          param2 + param0 <= ha.field_n) {
          eja.a((byte) -60, param0, param3, param2, param4, param5, param1);
        } else {
          pj.a(param2, param3, 170, param1, param0, param4, param5);
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_m = null;
        field_b = null;
        if (param0 < 103) {
          return;
        }
        field_p = null;
        field_f = null;
        field_j = null;
    }

    ur() {
        this.field_h = new long[8];
        this.field_n = new long[8];
        this.field_o = new long[8];
        this.field_i = new byte[64];
        this.field_g = new long[8];
        this.field_a = new long[8];
        this.field_k = new byte[32];
        this.field_c = 0;
        this.field_l = 0;
    }

    static {
        field_p = "Security";
        field_f = "Every player's actions are plotted at the same time, and then everyone moves at the same time. The number next to your creature indicates when it will move in the grand order of things. <br> Clicking the End Phase Button confirms your actions and ends you turn. Do this now.";
        field_j = "Don't mind";
        field_m = "Congratulations, you have evolved your first creature! You can drag creatures around to place them where you want. <br><col=BBFF00> Next</col>";
    }
}
