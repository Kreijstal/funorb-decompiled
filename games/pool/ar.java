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
            qh.a(this.field_h, this.field_f, this.field_b, 127, dq.field_a.b(this.field_d, 0));
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ar.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int b(int[] param0, int param1) {
        RuntimeException var3 = null;
        int[] var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -27) {
                break L1;
              } else {
                var4 = (int[]) null;
                this.b((int[]) null, 59);
                break L1;
              }
            }
            stackIn_3_0 = param0[9] * this.field_c + (this.field_e * param0[10] + this.field_a * param0[11]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ar.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        if (param0 != 10) {
            field_g = (String) null;
            field_g = null;
            return;
        }
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
            param1.field_I = (lr) ((Object) sa.field_h);
            param1.field_F = rm.field_g;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ar.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
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
                field_g = (String) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var1[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var1[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var1[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var1[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var1[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var1[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var1[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var1[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1_ref), "ar.E(" + param0 + ')');
        }
    }

    static {
    }
}
