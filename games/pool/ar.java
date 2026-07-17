/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ar implements eb {
    int field_c;
    int field_e;
    int field_a;
    int field_b;
    static String field_g;
    int field_f;
    int field_d;
    int field_h;

    public final void a(int[] param0, int param1) {
        if (param1 != -32215) {
            return;
        }
        try {
            qh.a(((ar) this).field_h, ((ar) this).field_f, ((ar) this).field_b, 127, dq.field_a.b(((ar) this).field_d, 0));
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ar.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final int b(int[] param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -27) {
                break L1;
              } else {
                var4 = null;
                int discarded$2 = ((ar) this).b((int[]) null, 59);
                break L1;
              }
            }
            stackOut_2_0 = param0[9] * ((ar) this).field_c + (((ar) this).field_e * param0[10] + ((ar) this).field_a * param0[11]);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ar.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_g = null;
    }

    final static void a(int param0, vh param1) {
        try {
            param1.field_X = ln.field_s;
            param1.field_N = 16777215;
            if (param0 != 29022) {
                ar.a((byte) 26);
            }
            param1.field_Gb = ln.field_s;
            param1.field_Fb = 1;
            param1.field_cb = 1;
            param1.field_I = (lr) (Object) sa.field_h;
            param1.field_F = rm.field_g;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ar.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(byte param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = lq.field_T;
              var1 = var4;
              var2 = 0;
              var3 = var4.length;
              if (param0 == 48) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var1[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var1[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var1[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var1[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var1[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var1[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var1[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var1[incrementValue$47] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1_ref, "ar.E(" + param0 + 41);
        }
    }

    static {
    }
}
