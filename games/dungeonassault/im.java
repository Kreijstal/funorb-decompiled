/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im implements ca {
    private int field_g;
    private int field_c;
    private int field_f;
    static String field_l;
    private int field_i;
    static boolean field_a;
    static volatile boolean field_d;
    private int field_k;
    private se field_j;
    static cn field_m;
    static me field_b;
    private int field_h;
    static cn field_e;

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        eb var12 = null;
        lm stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        lm stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param1 instanceof eb) {
                stackOut_3_0 = (lm) param1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (lm) (Object) stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (eb) (Object) stackIn_4_0;
              gf.b(param1.field_q + param2, param3 + param1.field_v, param1.field_x, param1.field_s, ((im) this).field_k);
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = param1.field_x + -(var12.field_J * 2);
              if (param0 == 34) {
                break L3;
              } else {
                ((im) this).field_c = 108;
                break L3;
              }
            }
            var8 = var12.field_J + (param2 - -param1.field_q);
            var9 = var12.field_N + param1.field_v + param3;
            gf.c(var8, var9, var7 + var8, var9, ((im) this).field_h);
            var10 = -1 + var12.i(97);
            L4: while (true) {
              if (var10 < 0) {
                if (((im) this).field_j != null) {
                  ((im) this).field_j.c(var12.field_w, var7 / 2 + var8, ((im) this).field_j.field_R + var9 - -var12.field_N, ((im) this).field_c, ((im) this).field_g);
                  break L0;
                } else {
                  return;
                }
              } else {
                gf.f(var8 - -(var7 * var12.a(-1, var10) / var12.a(-116)), var9, ((im) this).field_f, ((im) this).field_i);
                var10--;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("im.B(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a() {
        field_m = null;
        field_b = null;
        field_l = null;
        field_e = null;
    }

    final static void a(java.awt.Component param0) {
        try {
            param0.addMouseListener((java.awt.event.MouseListener) (Object) ib.field_f);
            param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ib.field_f);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) ib.field_f);
            int var2_int = 0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "im.A(" + (param0 != null ? "{...}" : "null") + 44 + 94 + 41);
        }
    }

    im(se param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((im) this).field_g = param2;
            ((im) this).field_c = param1;
            ((im) this).field_h = param3;
            ((im) this).field_k = param4;
            ((im) this).field_j = param0;
            ((im) this).field_f = param5;
            ((im) this).field_i = param6;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "im.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Unfortunately you are not eligible to create an account.";
        field_d = true;
    }
}
