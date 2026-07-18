/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends td implements m {
    private jj field_D;
    private int[] field_C;
    private String field_H;
    static String field_E;
    private int field_I;
    private oh field_F;
    private rh[] field_G;

    private final void a(int param0, int param1) {
        int var6 = 0;
        int var7 = TrackController.field_F ? 1 : 0;
        if (((lc) this).field_I >= param0) {
            return;
        }
        rh[] var8 = new rh[param0];
        rh[] var3 = var8;
        int[] var4 = new int[param0];
        int var5 = -100;
        for (var6 = 0; ((lc) this).field_I > var6; var6++) {
            var8[var6] = ((lc) this).field_G[var6];
            var4[var6] = ((lc) this).field_C[var6];
        }
        ((lc) this).field_G = var3;
        ((lc) this).field_C = var4;
        ((lc) this).field_I = param0;
    }

    public static void j() {
        field_E = null;
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == -27322) {
                break L1;
              } else {
                ((lc) this).field_C = null;
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              L3: {
                if (var6_int >= ((lc) this).field_I) {
                  break L3;
                } else {
                  if (((lc) this).field_G[var6_int] != param0) {
                    var6_int++;
                    continue L2;
                  } else {
                    var7 = ((lc) this).field_C[var6_int];
                    if (-1 != var7) {
                      qc.b(((lc) this).field_C[var6_int], (byte) -42);
                      break L3;
                    } else {
                      ((lc) this).field_D.t(20252);
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("lc.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((lc) this).field_F.a(((lc) this).field_H, 14 + param1 + ((lc) this).field_p, param2 + ((lc) this).field_m + 10, ((lc) this).field_x - 28, ((lc) this).field_u, 16777215, -1, 0, 0, ((lc) this).field_F.field_G);
    }

    final rh a(int param0, tg param1, String param2) {
        rh var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rh stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = new rh(param2, param1);
            var4.field_y = (t) (Object) new dc();
            var5 = ((lc) this).field_u + -2;
            ((lc) this).a(34 + ((lc) this).field_u, -3050, 0, ((lc) this).field_x, 0);
            var4.a(30, -3050, var5, param0 + ((lc) this).field_x, 7);
            ((lc) this).a(false, (al) (Object) var4);
            stackOut_0_0 = (rh) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("lc.B(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final static int[] b(boolean param0) {
        if (param0) {
            int[] discarded$0 = lc.b(true);
        }
        return new int[8];
    }

    final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = ((lc) this).field_I;
            if (param0 != -17040) {
                field_E = null;
            }
            this.a(var4_int + 1, 120);
            ((lc) this).field_G[var4_int] = ((lc) this).a(-14, (tg) this, param1);
            ((lc) this).field_C[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "lc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    lc(jj param0, oh param1, String param2) {
        super(0, 0, 288, 0, (t) null);
        int var4_int = 0;
        ((lc) this).field_I = 0;
        try {
            ((lc) this).field_F = param1;
            ((lc) this).field_D = param0;
            ((lc) this).field_H = param2;
            var4_int = null == ((lc) this).field_H ? 0 : ((lc) this).field_F.a(((lc) this).field_H, 260, ((lc) this).field_F.field_G);
            ((lc) this).a(22 + var4_int, -3050, 0, 288, 0);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
