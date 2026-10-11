/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    short[] field_A;
    short[] field_v;
    short[] field_t;
    static String field_n;
    short[] field_i;
    int field_f;
    short[] field_o;
    static String field_w;
    short[] field_b;
    int[] field_H;
    short[] field_R;
    int[] field_F;
    int[] field_B;
    short[] field_p;
    int field_P;
    int[] field_C;
    int[] field_E;
    byte[] field_u;
    int[] field_c;
    short[] field_K;
    private boolean field_r;
    int field_a;
    int field_m;
    short field_q;
    short[] field_k;
    short[] field_I;
    short[] field_y;
    byte field_Q;
    short[] field_e;
    short field_O;
    short[] field_d;
    short[] field_N;
    int[] field_z;
    int field_j;
    short[] field_l;
    short[] field_D;
    static rb field_M;
    short[] field_g;
    int[] field_G;
    int[] field_h;
    static int field_x;
    short field_s;
    int field_L;

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        int var7 = TetraLink.field_J;
        for (var6 = 0; var6 < this.field_q; var6++) {
          this.field_D[var6] = (short)(param3 * this.field_D[var6] / param0);
          this.field_i[var6] = (short)(param4 * this.field_i[var6] / param0);
          this.field_R[var6] = (short)(param1 * this.field_R[var6] / param0);
        }
        this.a(param2);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        for (var5 = 0; var5 < this.field_q; var5++) {
          this.field_D[var5] = (short)(this.field_D[var5] + param2);
          this.field_i[var5] = (short)(this.field_i[var5] + param3);
          this.field_R[var5] = (short)(this.field_R[var5] + param0);
        }
        this.a(true);
        if (param1 != 5336) {
          this.field_C = (int[]) null;
        }
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
        var13 = TetraLink.field_J;
        try {
          var5_int = param0 + param4;
          var6 = param3 + param1;
          if (param2 != 0) {
            return;
          }
          if (param4 <= ra.field_j) {
            stackIn_6_0 = ra.field_j;
          } else {
            stackIn_6_0 = param4;
          }
          var7 = stackIn_6_0;
          if (ra.field_i >= param1) {
            stackIn_9_0 = ra.field_i;
          } else {
            stackIn_9_0 = param1;
          }
          var8 = stackIn_9_0;
          if (ra.field_l <= var5_int) {
            stackIn_12_0 = ra.field_l;
          } else {
            stackIn_12_0 = var5_int;
          }
          var9 = stackIn_12_0;
          if (var6 < ra.field_g) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = ra.field_g;
          }
          var10 = stackIn_15_0;
          if (ra.field_j <= param4 &&
            ra.field_l > param4) {
            var11 = param4 + var8 * ra.field_f;
            var12 = -var8 + 1 + var10 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              ra.field_b[var11] = 16777215;
              var11 = var11 + 2 * ra.field_f;
            }
          }
          if (param1 >= ra.field_i &&
            var6 < ra.field_g) {
            var11Lifetime1 = var7 + ra.field_f * param1;
            var12Lifetime1 = -var7 + var9 + 1 >> 1;
            while (true) {
              var12Lifetime1--;
              if (0 > var12Lifetime1) {
                break;
              }
              ra.field_b[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (ra.field_j <= var5_int &&
            ra.field_l > var5_int) {
            var11Lifetime2 = var5_int + ((1 & var5_int - param4) + var8) * ra.field_f;
            var12Lifetime2 = var10 + 1 - var8 >> 1;
            while (true) {
              var12Lifetime2--;
              if (0 > var12Lifetime2) {
                break;
              }
              ra.field_b[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + ra.field_f * 2;
            }
          }
          if (param1 >= ra.field_i) {
            if (var6 >= ra.field_g) {
              return;
            }
            var11Lifetime3 = var6 * ra.field_f + var7 + (var6 - param1 & 1);
            var12Lifetime3 = 1 + var9 - var7 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                break;
              }
              ra.field_b[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var5), "id.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(boolean param0, char param1) {
        if (param0) {
          id.a(false, 'V');
        }
        if (param1 >= 32 &&
          126 >= param1) {
          return true;
        }
        if (param1 >= 160 &&
          param1 <= 255) {
          return true;
        }
        if (param1 != 8364 &&
          param1 != 338 &&
          8212 != param1 &&
          param1 != 339 &&
          param1 != 376) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_w = null;
        field_M = null;
        if (param0 != 338) {
          field_n = (String) null;
        }
        field_n = null;
    }

    private final void a(boolean param0) {
        this.field_r = false;
        if (!param0) {
          this.field_l = (short[]) null;
        }
    }

    final void b(boolean param0) {
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
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        var12 = TetraLink.field_J;
        if (this.field_r) {
          return;
        }
        this.field_r = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; var8 < this.field_q; var8++) {
          var9 = this.field_D[var8];
          var10 = this.field_i[var8];
          if (var2 > var9) {
            var2 = var9;
          }
          if (var10 > var6) {
            var6 = var10;
          }
          if (var9 > var5) {
            var5 = var9;
          }
          if (var10 < var3) {
            var3 = var10;
          }
          var11 = this.field_R[var8];
          if (var11 < var4) {
            var4 = var11;
          }
          if (var11 > var7) {
            var7 = var11;
          }
        }
        this.field_m = var7;
        this.field_P = var4;
        this.field_L = var3;
        this.field_f = var6;
        this.field_j = var5;
        this.field_a = var2;
        if (param0) {
          stackIn_25_0 = 18;
          stackIn_25_1 = 49;
          id.a(stackIn_25_0, stackIn_25_1, -2, 27, 30);
        }
    }

    id() {
        this.field_r = false;
        this.field_Q = (byte) 0;
    }

    static {
        field_n = "Connection lost - attempting to reconnect";
        field_w = "Your opponent is <%0>.";
    }
}
