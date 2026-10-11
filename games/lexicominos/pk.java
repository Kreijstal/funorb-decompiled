/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    short[] field_I;
    short[] field_j;
    int field_v;
    short[] field_h;
    short[] field_P;
    short[] field_e;
    byte field_N;
    short[] field_d;
    int[] field_C;
    private boolean field_f;
    int[] field_y;
    short field_H;
    int[] field_o;
    short[] field_c;
    int[] field_u;
    int field_m;
    int[] field_r;
    short[] field_a;
    short field_w;
    short[] field_B;
    short field_A;
    short[] field_b;
    byte[] field_J;
    short[] field_q;
    short[] field_s;
    static ab field_n;
    short[] field_g;
    short[] field_k;
    int field_G;
    int[] field_p;
    int field_F;
    int[] field_t;
    short[] field_z;
    short[] field_E;
    int[] field_l;
    int field_M;
    static String field_D;
    int[] field_i;
    short[] field_x;
    short[] field_K;
    int field_O;

    public static void a(int param0) {
        if (param0 != 15569) {
          pk.a(-101, 70, -94, -69, -87);
        }
        field_D = null;
        field_n = null;
    }

    final void a(byte param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        ab var13;
        var12 = Lexicominos.field_L ? 1 : 0;
        if (this.field_f) {
          return;
        }
        this.field_f = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; var8 < this.field_w; var8++) {
          var9 = this.field_h[var8];
          var10 = this.field_I[var8];
          if (var10 > var6) {
            var6 = var10;
          }
          if (var9 < var2) {
            var2 = var9;
          }
          if (var5 < var9) {
            var5 = var9;
          }
          if (var10 < var3) {
            var3 = var10;
          }
          var11 = this.field_g[var8];
          if (var11 > var7) {
            var7 = var11;
          }
          if (var4 > var11) {
            var4 = var11;
          }
        }
        this.field_F = var7;
        this.field_m = var2;
        this.field_v = var5;
        this.field_G = var6;
        if (param0 != -50) {
          var13 = (ab) null;
          pk.a((ab) null, 77);
        }
        this.field_M = var3;
        this.field_O = var4;
    }

    private final void b(int param0) {
        this.field_f = false;
        if (param0 != 2933) {
          this.field_q = (short[]) null;
        }
    }

    final static boolean a(ab param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -74) {
            pk.a(-91);
          }
          stackIn_3_0 = param0.b(0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pk.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        for (var5 = 0; var5 < this.field_w; var5++) {
          this.field_h[var5] = (short)(this.field_h[var5] + param3);
          this.field_I[var5] = (short)(this.field_I[var5] + param1);
          this.field_g[var5] = (short)(this.field_g[var5] + param0);
        }
        if (param2) {
          this.a(-72, 18, true, -78);
        }
        this.b(2933);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = Lexicominos.field_L ? 1 : 0;
        try {
          var5_int = param2 + param4;
          if (param3 != 1) {
            field_n = (ab) null;
          }
          var6 = param1 + param0;
          if (lf.field_g < param2) {
            stackIn_6_0 = param2;
          } else {
            stackIn_6_0 = lf.field_g;
          }
          var7 = stackIn_6_0;
          if (lf.field_c >= param1) {
            stackIn_9_0 = lf.field_c;
          } else {
            stackIn_9_0 = param1;
          }
          var8 = stackIn_9_0;
          if (var5_int >= lf.field_e) {
            stackIn_12_0 = lf.field_e;
          } else {
            stackIn_12_0 = var5_int;
          }
          var9 = stackIn_12_0;
          if (lf.field_h > var6) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = lf.field_h;
          }
          var10 = stackIn_15_0;
          if (param2 >= lf.field_g &&
            lf.field_e > param2) {
            var11 = var8 * lf.field_f + param2;
            var12 = 1 + var10 - var8 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              lf.field_b[var11] = 16777215;
              var11 = var11 + 2 * lf.field_f;
            }
          }
          if (param1 >= lf.field_c &&
            lf.field_h > var6) {
            var11Lifetime1 = var7 + lf.field_f * param1;
            var12Lifetime1 = 1 - (-var9 + var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              lf.field_b[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (lf.field_g <= var5_int &&
            lf.field_e > var5_int) {
            var11Lifetime2 = var5_int + lf.field_f * (var8 + (var5_int - param2 & 1));
            var12Lifetime2 = -var8 + (var10 + 1) >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              lf.field_b[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + lf.field_f * 2;
            }
          }
          if (param1 >= lf.field_c) {
            if (lf.field_h <= var6) {
              return;
            }
            var11Lifetime3 = var7 + lf.field_f * var6 + (1 & -param1 + var6);
            var12Lifetime3 = 1 + var9 - var7 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                break;
              }
              lf.field_b[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var5), "pk.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = Lexicominos.field_L ? 1 : 0;
        for (var6 = 0; this.field_w > var6; var6++) {
          this.field_h[var6] = (short)(param4 * this.field_h[var6] / param3);
          this.field_I[var6] = (short)(this.field_I[var6] * param1 / param3);
          this.field_g[var6] = (short)(this.field_g[var6] * param0 / param3);
        }
        this.b(2933);
        if (param2 <= 44) {
          pk.a(-33);
        }
    }

    pk() {
        this.field_N = (byte) 0;
        this.field_f = false;
    }

    static {
        field_D = "Longer words score many more points than shorter words.";
    }
}
