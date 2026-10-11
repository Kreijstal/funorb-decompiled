/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    private int field_b;
    private int field_g;
    private long[] field_o;
    private byte[] field_c;
    static cg field_q;
    private long[] field_p;
    private byte[] field_k;
    static vn[][] field_i;
    private long[] field_s;
    static boolean field_r;
    static String field_h;
    private long[] field_l;
    private long[] field_n;
    static int field_d;
    static jc field_m;
    static int field_e;
    static int field_j;
    static int field_f;
    static int field_a;

    final static void a(int param0, boolean param1) {
        if (param0 != -1 &&
          w.field_a[param0] != null) {
          ph.a((byte) 68, w.field_a[param0]);
        }
        if (!param1) {
          field_f = -57;
        }
    }

    public static void a(boolean param0) {
        field_i = (vn[][]) null;
        field_h = null;
        field_m = null;
        if (!param0) {
          field_f = -27;
        }
        field_q = null;
    }

    final static void a(vn param0, boolean param1) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        var9 = ZombieDawn.field_J;
        try {
          if (0 == (3 & (param0.field_t | param0.field_w | param0.field_v | param0.field_x))) {
            return;
          }
          var2_int = (3 & param0.field_v) + param0.field_w;
          if (param1) {
            return;
          }
          var2_int = var2_int + 4 - (3 & var2_int);
          var3 = param0.field_t + (param0.field_x & 3);
          var3 = var3 + (4 - (var3 & 3));
          var4 = new int[var3 * var2_int];
          var5 = 0;
          var6 = var2_int * (3 & param0.field_x) + (param0.field_v & 3);
          for (var7 = 0; var7 < param0.field_t; var7++) {
            for (var8 = 0; var8 < param0.field_w; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param0.field_z[incrementValue$1];
            }
            var6 = var6 + (-param0.field_w + var2_int);
          }
          param0.field_z = var4;
          param0.field_w = var2_int;
          param0.field_v = param0.field_v & -4;
          param0.field_x = param0.field_x & -4;
          param0.field_t = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("bd.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        ei.field_G[46] = 72;
        ei.field_G[222] = 58;
        ei.field_G[520] = 59;
        ei.field_G[192] = 28;
        ei.field_G[47] = 73;
        ei.field_G[61] = 27;
        int var1 = 117 % ((-3 - param0) / 59);
        ei.field_G[44] = 71;
        ei.field_G[93] = 43;
        ei.field_G[92] = 74;
        ei.field_G[59] = 57;
        ei.field_G[45] = 26;
        ei.field_G[91] = 42;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        int var2Lifetime1;
        for (var2 = 0; 32 > var2; var2++) {
          this.field_c[var2] = (byte) 0;
        }
        if (param0 != 71) {
          field_h = (String) null;
        }
        this.field_b = 0;
        this.field_k[0] = (byte) 0;
        this.field_g = 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_o[var2Lifetime1] = 0L;
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
        var8 = ZombieDawn.field_J;
        try {
          this.field_k[this.field_g] = (byte)hi.a((int) this.field_k[this.field_g], 128 >>> eg.a(this.field_b, 7));
          this.field_g = this.field_g + 1;
          if (param2 > -118) {
            this.b(-71);
          }
          if (this.field_g > 32) {
            while (this.field_g < 64) {
              fieldTemp$0 = this.field_g;
              this.field_g = this.field_g + 1;
              this.field_k[fieldTemp$0] = (byte) 0;
            }
            this.b(-9);
            this.field_g = 0;
          }
          while (this.field_g < 32) {
            fieldTemp$1 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_k[fieldTemp$1] = (byte) 0;
          }
          gp.a(this.field_c, 0, this.field_k, 32, 32);
          this.b(-9);
          var4_int = 0;
          var5 = param1;
          while (var4_int < 8) {
            var6 = this.field_o[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[1 + var5] = (byte)(int)(var6 >>> 48);
            param0[2 + var5] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[4 + var5] = (byte)(int)(var6 >>> 24);
            param0[5 + var5] = (byte)(int)(var6 >>> 16);
            param0[6 + var5] = (byte)(int)(var6 >>> 8);
            param0[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("bd.I(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        if (param1 != 9082) {
          field_d = 87;
        }
        int var2 = param0 & 255;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128 &&
          160 > var2) {
          var3 = fj.field_h[-128 + var2];
          if (0 == var3) {
            var3 = 63;
          }
          var2 = var3;
        }
        return (char)var2;
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
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = ZombieDawn.field_J;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_s[var2] = al.a(gj.a((long)this.field_k[7 + var3], 255L), al.a(al.a(al.a(al.a(gj.a((long)this.field_k[3 + var3], 255L) << 32, al.a(al.a(gj.a((long)this.field_k[1 + var3], 255L) << 48, (long)this.field_k[var3] << 56), gj.a((long)this.field_k[2 + var3], 255L) << 40)), gj.a((long)this.field_k[4 + var3], 255L) << 24), gj.a(16711680L, (long)this.field_k[5 + var3] << 16)), gj.a(65280L, (long)this.field_k[6 + var3] << 8)));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_o[var2Lifetime1];
          arrayValue$1 = this.field_s[var2Lifetime1];
          this.field_l[var2Lifetime1] = dupTemp$0;
          this.field_p[var2Lifetime1] = al.a(arrayValue$1, dupTemp$0);
        }
        if (param0 != -9) {
          this.a(-68);
        }
        for (var2Lifetime2 = 1; 10 >= var2Lifetime2; var2Lifetime2++) {
          for (var3Lifetime1 = 0; 8 > var3Lifetime1; var3Lifetime1++) {
            this.field_n[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_n[var3Lifetime1] = al.a(this.field_n[var3Lifetime1], bn.field_h[var4][eg.a(255, (int)(this.field_l[eg.a(-var4 + var3Lifetime1, 7)] >>> var5))]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_l[var3Lifetime1Lifetime1] = this.field_n[var3Lifetime1Lifetime1];
          }
          this.field_l[0] = al.a(this.field_l[0], bn.field_g[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; 8 > var3Lifetime1Lifetime2; var3Lifetime1Lifetime2++) {
            this.field_n[var3Lifetime1Lifetime2] = this.field_l[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (8 > var7) {
              this.field_n[var3Lifetime1Lifetime2] = al.a(this.field_n[var3Lifetime1Lifetime2], bn.field_h[var7][eg.a((int)(this.field_p[eg.a(7, var3Lifetime1Lifetime2 - var7)] >>> var5Lifetime1), 255)]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_p[var3Lifetime1Lifetime3] = this.field_n[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; 8 > var2Lifetime3; var2Lifetime3++) {
          this.field_o[var2Lifetime3] = al.a(this.field_o[var2Lifetime3], al.a(this.field_p[var2Lifetime3], this.field_s[var2Lifetime3]));
        }
    }

    final void a(boolean param0, byte[] param1, long param2) {
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
        var13 = ZombieDawn.field_J;
        try {
          var5_int = 0;
          var6 = 7 & -(7 & (int)param2) + 8;
          var7 = this.field_b & 7;
          var9 = param2;
          var11 = 31;
          var12 = 0;
          while (0 <= var11) {
            var12 = var12 + ((255 & this.field_c[var11]) + (255 & (int)var9));
            this.field_c[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
          }
          while (param2 > 8L) {
            var8 = param1[var5_int] << var6 & 255 | (255 & param1[var5_int + 1]) >>> -var6 + 8;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_k[this.field_g] = (byte)hi.a((int) this.field_k[this.field_g], var8 >>> var7);
              this.field_g = this.field_g + 1;
              this.field_b = this.field_b + (-var7 + 8);
              if (this.field_b == 512) {
                this.b(-9);
                this.field_b = 0;
                this.field_g = 0;
              }
              this.field_k[this.field_g] = (byte)eg.a(var8 << -var7 + 8, 255);
              this.field_b = this.field_b + var7;
              var5_int++;
              param2 = param2 - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param2 > 0L) {
            var8Lifetime1 = 255 & param1[var5_int] << var6;
            this.field_k[this.field_g] = (byte)hi.a((int) this.field_k[this.field_g], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (!param0) {
            this.field_l = (long[]) null;
          }
          if (8L <= (long)var7 + param2) {
            this.field_b = this.field_b + (8 - var7);
            this.field_g = this.field_g + 1;
            param2 = param2 - (long)(8 - var7);
            if (this.field_b == 512) {
              this.b(-9);
              this.field_g = 0;
              this.field_b = 0;
            }
            this.field_k[this.field_g] = (byte)eg.a(255, var8Lifetime1 << 8 - var7);
            this.field_b = this.field_b + (int)param2;
          } else {
            this.field_b = (int)((long)this.field_b + param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("bd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    bd() {
        this.field_o = new long[8];
        this.field_p = new long[8];
        this.field_b = 0;
        this.field_g = 0;
        this.field_c = new byte[32];
        this.field_k = new byte[64];
        this.field_s = new long[8];
        this.field_l = new long[8];
        this.field_n = new long[8];
    }

    static {
        field_i = new vn[2][];
        field_h = "Apply";
        field_r = true;
        field_q = new cg(10, 2, 2, 0);
        field_m = null;
        field_e = 640;
        field_d = field_e / 2;
        field_f = 2;
        field_a = 2 + field_e / 24;
    }
}
