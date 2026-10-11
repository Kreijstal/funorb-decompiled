/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static String field_f;
    private byte[] field_a;
    private long[] field_o;
    static int field_c;
    static String field_h;
    static int field_g;
    private long[] field_e;
    private int field_k;
    private int field_j;
    static String field_i;
    private long[] field_l;
    private long[] field_m;
    private long[] field_n;
    private byte[] field_d;
    static int field_b;

    final void a(byte[] param0, byte param1, int param2) {
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
        var8 = Pool.field_O;
        try {
          this.field_a[this.field_k] = (byte)md.a((int) this.field_a[this.field_k], 128 >>> rb.b(this.field_j, 7));
          this.field_k = this.field_k + 1;
          if (this.field_k > 32) {
            while (this.field_k < 64) {
              fieldTemp$0 = this.field_k;
              this.field_k = this.field_k + 1;
              this.field_a[fieldTemp$0] = (byte) 0;
            }
            this.b(125);
            this.field_k = 0;
          }
          while (this.field_k < 32) {
            fieldTemp$1 = this.field_k;
            this.field_k = this.field_k + 1;
            this.field_a[fieldTemp$1] = (byte) 0;
          }
          qn.a(this.field_d, 0, this.field_a, 32, 32);
          this.b(124);
          if (param1 <= 97) {
            this.a((byte[]) null, -112, 52L);
          }
          var4_int = 0;
          var5 = param2;
          while (8 > var4_int) {
            var6 = this.field_o[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[1 + var5] = (byte)(int)(var6 >>> 48);
            param0[var5 + 2] = (byte)(int)(var6 >>> 40);
            param0[3 + var5] = (byte)(int)(var6 >>> 32);
            param0[var5 + 4] = (byte)(int)(var6 >>> 24);
            param0[5 + var5] = (byte)(int)(var6 >>> 16);
            param0[var5 + 6] = (byte)(int)(var6 >>> 8);
            param0[7 + var5] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ld.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (em.field_P > 0) {
          em.field_P = em.field_P - 1;
        }
        if (sh.field_P.field_k != cb.field_g) {
          fd.field_J = fd.field_J + (sh.field_P.field_k - cb.field_g);
          cb.field_g = sh.field_P.field_k;
        }
        int var1 = 37 / ((param0 + 53) / 53);
        if (0 < em.field_P) {
          wa.l(23323);
        }
    }

    final static qp a(byte param0, vh param1, int[] param2, vh param3, vh param4) {
        int var10_int = 0;
        int var5_int = 0;
        String[] var6 = null;
        char[] var7 = null;
        qp[] var8 = null;
        int var9 = 0;
        ap var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_9_0 = null;
        qp stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var5 = null;
        Exception var10 = null;
        var12 = Pool.field_O;
        try {
          var5_int = param2.length;
          var6 = new String[var5_int];
          var14 = new char[var5_int];
          var13 = var14;
          var7 = var13;
          var8 = new qp[var5_int];
          var9 = 49;
          try {
            if (param0 != 92) {
              field_f = (String) null;
            }
            for (var10_int = 0; var5_int > var10_int; var10_int++) {
              var11 = o.field_x.a(127, param2[var10_int]);
              var6[var10_int] = var11.e(0);
              var9 = (char)(var9 + 1);
              var7[var10_int] = (char)var9;
              var8[var10_int] = null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = null;
            return (qp) (stackIn_9_0);
          }
          stackIn_11_0 = new qp(0L, param1, param3, param4, var8, param2, var6, var14);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ld.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(byte[] param0, int param1, long param2) {
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
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
        var13 = Pool.field_O;
        try {
          var5_int = param1;
          var6 = 7 & 8 - ((int)param2 & 7);
          var7 = this.field_j & 7;
          var9 = param2;
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + (((int)var9 & 255) + (255 & this.field_d[var11]));
            this.field_d[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
          }
          while (param2 > 8L) {
            var8 = 255 & param0[var5_int] << var6 | (param0[1 + var5_int] & 255) >>> -var6 + 8;
            if (var8 >= 0 &&
              256 > var8) {
              this.field_a[this.field_k] = (byte)md.a((int) this.field_a[this.field_k], var8 >>> var7);
              this.field_k = this.field_k + 1;
              this.field_j = this.field_j + (8 - var7);
              if (512 == this.field_j) {
                this.b(119);
                this.field_k = 0;
                this.field_j = 0;
              }
              this.field_a[this.field_k] = (byte)rb.b(var8 << 8 - var7, 255);
              this.field_j = this.field_j + var7;
              param2 = param2 - 8L;
              var5_int++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param2 > 0L) {
            stackIn_16_0 = param0[var5_int] << var6;
            stackIn_16_1 = 255;
            var8Lifetime1 = stackIn_16_0 & stackIn_16_1;
            this.field_a[this.field_k] = (byte)md.a((int) this.field_a[this.field_k], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (param2 + (long)var7 >= 8L) {
            param2 = param2 - (long)(8 - var7);
            this.field_k = this.field_k + 1;
            this.field_j = this.field_j + (8 - var7);
            if (this.field_j == 512) {
              this.b(param1 ^ 120);
              this.field_j = 0;
              this.field_k = 0;
            }
            this.field_a[this.field_k] = (byte)rb.b(var8Lifetime1 << -var7 + 8, 255);
            this.field_j = this.field_j + (int)param2;
          } else {
            this.field_j = (int)((long)this.field_j + param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("ld.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_d[var2] = (byte) 0;
        }
        this.field_a[0] = (byte) 0;
        this.field_j = 0;
        this.field_k = 0;
        var2Lifetime1 = 0;
        if (param0) {
          this.field_m = (long[]) null;
        }
        while (var2Lifetime1 < 8) {
          this.field_o[var2Lifetime1] = 0L;
          var2Lifetime1++;
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
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = Pool.field_O;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_n[var2] = im.a(mj.a((long)this.field_a[7 + var3], 255L), im.a(im.a(mj.a((long)this.field_a[var3 + 5], 255L) << 16, im.a(mj.a((long)this.field_a[var3 + 4], 255L) << 24, im.a(im.a(im.a(mj.a((long)this.field_a[1 + var3] << 48, 71776119061217280L), (long)this.field_a[var3] << 56), mj.a((long)this.field_a[2 + var3], 255L) << 40), mj.a(1095216660480L, (long)this.field_a[3 + var3] << 32)))), mj.a(65280L, (long)this.field_a[var3 + 6] << 8)));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_o[var2Lifetime1];
          arrayValue$1 = this.field_n[var2Lifetime1];
          this.field_m[var2Lifetime1] = dupTemp$0;
          this.field_l[var2Lifetime1] = im.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; 8 > var3Lifetime1; var3Lifetime1++) {
            this.field_e[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (8 > var4) {
              this.field_e[var3Lifetime1] = im.a(this.field_e[var3Lifetime1], n.field_N[var4][rb.b((int)(this.field_m[rb.b(7, var3Lifetime1 - var4)] >>> var5), 255)]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; 8 > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
            this.field_m[var3Lifetime1Lifetime1] = this.field_e[var3Lifetime1Lifetime1];
          }
          this.field_m[0] = im.a(this.field_m[0], n.field_Z[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; 8 > var3Lifetime1Lifetime2; var3Lifetime1Lifetime2++) {
            this.field_e[var3Lifetime1Lifetime2] = this.field_m[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_e[var3Lifetime1Lifetime2] = im.a(this.field_e[var3Lifetime1Lifetime2], n.field_N[var7][rb.b(255, (int)(this.field_l[rb.b(var3Lifetime1Lifetime2 - var7, 7)] >>> var5Lifetime1))]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; 8 > var3Lifetime1Lifetime3; var3Lifetime1Lifetime3++) {
            this.field_l[var3Lifetime1Lifetime3] = this.field_e[var3Lifetime1Lifetime3];
          }
        }
        if (param0 <= 103) {
          this.field_e = (long[]) null;
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_o[var2Lifetime3] = im.a(this.field_o[var2Lifetime3], im.a(this.field_l[var2Lifetime3], this.field_n[var2Lifetime3]));
        }
    }

    final static int a(int param0) {
        if (param0 != 0) {
          field_g = 75;
          return 1;
        }
        return 1;
    }

    public static void c(int param0) {
        if (param0 != 8) {
          field_b = 119;
        }
        field_i = null;
        field_f = null;
        field_h = null;
    }

    ld() {
        this.field_a = new byte[64];
        this.field_o = new long[8];
        this.field_k = 0;
        this.field_l = new long[8];
        this.field_n = new long[8];
        this.field_j = 0;
        this.field_e = new long[8];
        this.field_m = new long[8];
        this.field_d = new byte[32];
    }

    static {
        field_h = "Stripes";
        field_i = "You need a rating of <%1> to play with the current options.";
        field_c = 0;
        field_f = "Pause Menu";
    }
}
