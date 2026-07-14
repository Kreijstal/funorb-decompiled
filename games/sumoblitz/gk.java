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
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0) {
                  break L0;
                } else {
                  gk.b(true);
                  break L0;
                }
              }
              L1: {
                var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                if (var1_ref != null) {
                  try {
                    var2_ref = Runtime.getRuntime();
                    var4 = null;
                    var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                    wh.field_x = (int)(var3.longValue() / 1048576L) - -1;
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  break L1;
                } else {
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
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
        field_w = null;
        field_u = null;
        field_O = null;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        for (var6 = 0; var6 < ((gk) this).field_D; var6++) {
            ((gk) this).field_Q[var6] = (short)(param4 * ((gk) this).field_Q[var6] / param1);
            ((gk) this).field_B[var6] = (short)(((gk) this).field_B[var6] * param2 / param1);
            ((gk) this).field_r[var6] = (short)(param0 * ((gk) this).field_r[var6] / param1);
        }
        if (!param3) {
            return;
        }
        this.a((byte) 101);
    }

    private final void a(byte param0) {
        if (param0 != 101) {
            ((gk) this).field_l = null;
        }
        ((gk) this).field_d = false;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Sumoblitz.field_L ? 1 : 0;
        if (!((gk) this).field_d) {
          L0: {
            ((gk) this).field_d = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            var5 = -32768;
            var6 = -32768;
            var7 = -32768;
            if (!param0) {
              break L0;
            } else {
              this.a((byte) -95);
              break L0;
            }
          }
          var8 = 0;
          L1: while (true) {
            if (var8 >= ((gk) this).field_D) {
              ((gk) this).field_P = var7;
              ((gk) this).field_T = var2;
              ((gk) this).field_t = var5;
              ((gk) this).field_S = var4;
              ((gk) this).field_f = var6;
              ((gk) this).field_j = var3;
              return;
            } else {
              L2: {
                var9 = ((gk) this).field_Q[var8];
                var10 = ((gk) this).field_B[var8];
                if (var10 < var3) {
                  var3 = var10;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var9 <= var5) {
                  break L3;
                } else {
                  var5 = var9;
                  break L3;
                }
              }
              L4: {
                var11 = ((gk) this).field_r[var8];
                if (var10 <= var6) {
                  break L4;
                } else {
                  var6 = var10;
                  break L4;
                }
              }
              L5: {
                if (var2 > var9) {
                  var2 = var9;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var7 >= var11) {
                  break L6;
                } else {
                  var7 = var11;
                  break L6;
                }
              }
              if (var4 > var11) {
                var4 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        for (var5 = 0; var5 < ((gk) this).field_D; var5++) {
            ((gk) this).field_Q[var5] = (short)(((gk) this).field_Q[var5] + param3);
            ((gk) this).field_B[var5] = (short)(((gk) this).field_B[var5] + param1);
            ((gk) this).field_r[var5] = (short)(((gk) this).field_r[var5] + param0);
        }
        this.a((byte) 101);
        if (param2 != -81) {
            ((gk) this).field_n = (short) -48;
        }
    }

    gk() {
        ((gk) this).field_E = (byte) 0;
        ((gk) this).field_d = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Previous";
    }
}
