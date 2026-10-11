/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static byte[][][] field_w;
    int field_j;
    short field_n;
    short[] field_l;
    short[] field_Q;
    int[] field_F;
    short[] field_g;
    short[] field_y;
    static String field_H;
    int[] field_i;
    short[] field_B;
    short[] field_b;
    int field_S;
    short[] field_C;
    int field_P;
    int[] field_s;
    short[] field_z;
    static qn field_v;
    short[] field_L;
    int[] field_M;
    short[] field_e;
    int[] field_J;
    static wi field_O;
    static ri field_N;
    private boolean field_d;
    short[] field_h;
    int[] field_q;
    static cq field_o;
    int[] field_I;
    int field_f;
    int[] field_p;
    int field_t;
    byte[] field_a;
    short[] field_A;
    byte field_E;
    short[] field_G;
    int[] field_m;
    short[] field_k;
    short[] field_x;
    short field_c;
    int field_T;
    short[] field_r;
    static wi field_u;
    short[] field_K;
    short[] field_R;
    short field_D;

    final static void b(boolean param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            if (!param0) {
              gk.b(true);
            }
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                wh.field_x = (int)(var3.longValue() / 1048576L) + 1;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_N = null;
        field_H = null;
        field_v = null;
        field_o = null;
        if (param0 != 0) {
          return;
        }
        field_w = (byte[][][]) null;
        field_u = null;
        field_O = null;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        for (var6 = 0; var6 < this.field_D; var6++) {
          this.field_Q[var6] = (short)(param4 * this.field_Q[var6] / param1);
          this.field_B[var6] = (short)(this.field_B[var6] * param2 / param1);
          this.field_r[var6] = (short)(param0 * this.field_r[var6] / param1);
        }
        if (!param3) {
          return;
        }
        this.a((byte) 101);
    }

    private final void a(byte param0) {
        if (param0 != 101) {
          this.field_l = (short[]) null;
        }
        this.field_d = false;
    }

    final void a(boolean param0) {
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
        var12 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_d) {
          return;
        }
        this.field_d = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        if (param0) {
          this.a((byte) -95);
        }
        for (var8 = 0; var8 < this.field_D; var8++) {
          var9 = this.field_Q[var8];
          var10 = this.field_B[var8];
          if (var10 < var3) {
            var3 = var10;
          }
          if (var9 > var5) {
            var5 = var9;
          }
          var11 = this.field_r[var8];
          if (var10 > var6) {
            var6 = var10;
          }
          if (var2 > var9) {
            var2 = var9;
          }
          if (var7 < var11) {
            var7 = var11;
          }
          if (var4 > var11) {
            var4 = var11;
          }
        }
        this.field_P = var7;
        this.field_T = var2;
        this.field_t = var5;
        this.field_S = var4;
        this.field_f = var6;
        this.field_j = var3;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        for (var5 = 0; var5 < this.field_D; var5++) {
          this.field_Q[var5] = (short)(this.field_Q[var5] + param3);
          this.field_B[var5] = (short)(this.field_B[var5] + param1);
          this.field_r[var5] = (short)(this.field_r[var5] + param0);
        }
        this.a((byte) 101);
        if (param2 != -81) {
          this.field_n = (short) -48;
        }
    }

    gk() {
        this.field_E = (byte) 0;
        this.field_d = false;
    }

    static {
        field_H = "Previous";
    }
}
