/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    short[] field_Q;
    static int field_U;
    int field_p;
    short[] field_o;
    byte[] field_x;
    int[] field_h;
    short[] field_R;
    short[] field_r;
    static int[] field_c;
    short field_q;
    static boolean field_T;
    short field_l;
    short[] field_S;
    short[] field_g;
    int[] field_v;
    int[] field_D;
    short[] field_j;
    int[] field_t;
    short[] field_A;
    int[] field_z;
    short field_E;
    int field_u;
    short[] field_J;
    private boolean field_F;
    short[] field_y;
    short[] field_m;
    int field_k;
    short[] field_b;
    short[] field_e;
    int field_i;
    int field_w;
    static String field_N;
    static String[] field_C;
    static wb[] field_P;
    int[] field_s;
    short[] field_H;
    short[] field_I;
    int field_n;
    int[] field_B;
    short[] field_d;
    byte field_a;
    int[] field_L;
    short[] field_O;
    int[] field_f;
    short[] field_G;

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var8 = TrackController.field_F ? 1 : 0;
        for (var6 = 0; this.field_q > var6; var6++) {
          this.field_y[var6] = (short)(param3 * this.field_y[var6] / param1);
          this.field_o[var6] = (short)(param4 * this.field_o[var6] / param1);
          this.field_S[var6] = (short)(param0 * this.field_S[var6] / param1);
        }
        int var7 = -31 / ((param2 - 43) / 48);
        this.a((byte) -84);
    }

    public static void a(int param0) {
        field_c = null;
        field_N = null;
        field_P = null;
        field_C = null;
        if (param0 < 54) {
          pf.a(100);
        }
    }

    private final void a(byte param0) {
        this.field_F = false;
        int var2 = -65 / ((18 - param0) / 46);
    }

    final static void a(int param0, long param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            Thread.sleep(param1);
            if (param0 != 3) {
              field_P = (wb[]) null;
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = TrackController.field_F ? 1 : 0;
        for (var5 = 0; this.field_q > var5; var5++) {
          this.field_y[var5] = (short)(this.field_y[var5] + param2);
          this.field_o[var5] = (short)(this.field_o[var5] + param3);
          this.field_S[var5] = (short)(this.field_S[var5] + param0);
        }
        this.a((byte) -40);
        if (param1 >= 100) {
          return;
        }
        this.a((byte) -59);
    }

    pf() {
        this.field_F = false;
        this.field_a = (byte) 0;
    }

    final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = TrackController.field_F ? 1 : 0;
        if (this.field_F) {
          return;
        }
        if (param0 == 14702) {
          this.field_F = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          for (var8 = 0; this.field_q > var8; var8++) {
            var9 = this.field_y[var8];
            var10 = this.field_o[var8];
            if (var3 > var10) {
              var3 = var10;
            }
            var11 = this.field_S[var8];
            if (var5 < var9) {
              var5 = var9;
            }
            if (var6 < var10) {
              var6 = var10;
            }
            if (var2 > var9) {
              var2 = var9;
            }
            if (var11 < var4) {
              var4 = var11;
            }
            if (var7 < var11) {
              var7 = var11;
            }
          }
          this.field_u = var5;
          this.field_n = var3;
          this.field_p = var6;
          this.field_k = var4;
          this.field_w = var7;
          this.field_i = var2;
          return;
        }
        pf.a(-106, 23L);
        this.field_F = true;
        var2Lifetime1 = 32767;
        var3Lifetime1 = 32767;
        var4Lifetime1 = 32767;
        var5Lifetime1 = -32768;
        var6Lifetime1 = -32768;
        var7Lifetime1 = -32768;
        for (var8Lifetime1 = 0; this.field_q > var8Lifetime1; var8Lifetime1++) {
          var9Lifetime1 = this.field_y[var8Lifetime1];
          var10Lifetime1 = this.field_o[var8Lifetime1];
          if (var3Lifetime1 > var10Lifetime1) {
            var3Lifetime1 = var10Lifetime1;
          }
          var11Lifetime1 = this.field_S[var8Lifetime1];
          if (var5Lifetime1 < var9Lifetime1) {
            var5Lifetime1 = var9Lifetime1;
          }
          if (var6Lifetime1 < var10Lifetime1) {
            var6Lifetime1 = var10Lifetime1;
          }
          if (var2Lifetime1 > var9Lifetime1) {
            var2Lifetime1 = var9Lifetime1;
          }
          if (var11Lifetime1 < var4Lifetime1) {
            var4Lifetime1 = var11Lifetime1;
          }
          if (var7Lifetime1 < var11Lifetime1) {
            var7Lifetime1 = var11Lifetime1;
          }
        }
        this.field_u = var5Lifetime1;
        this.field_n = var3Lifetime1;
        this.field_p = var6Lifetime1;
        this.field_k = var4Lifetime1;
        this.field_w = var7Lifetime1;
        this.field_i = var2Lifetime1;
    }

    static {
        field_T = false;
        field_c = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_P = new wb[4];
        field_U = 0;
        field_C = new String[255];
        field_N = "Password is valid";
    }
}
