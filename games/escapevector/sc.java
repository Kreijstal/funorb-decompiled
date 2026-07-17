/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc implements db {
    private int field_f;
    private int field_i;
    private wl field_e;
    private int field_a;
    private int field_j;
    private int field_c;
    private int field_b;
    private int field_d;
    static int[] field_h;
    static Boolean field_g;

    final static void a(qd param0, int param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          mi.field_l.a(-12328, (hg) (Object) param0);
          sm.a(param0, param1, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("sc.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + 1 + 41);
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        eb var15 = null;
        hm stackIn_5_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        hm stackOut_3_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -14) {
                break L1;
              } else {
                var14 = null;
                sc.a((byte) 67, (java.awt.Component) null);
                break L1;
              }
            }
            L2: {
              if (!(param3 instanceof eb)) {
                stackOut_4_0 = null;
                stackIn_5_0 = (hm) (Object) stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (hm) param3;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var15 = (eb) (Object) stackIn_5_0;
              em.a(param3.field_k + param0, param3.field_j + param1, param3.field_g, param3.field_x, ((sc) this).field_a);
              if (var15 != null) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var7 = var15.field_D + (param0 + param3.field_k);
              var8 = param3.field_j + (param1 - -var15.field_I);
              em.d(var7, var8, var15.field_N, ((sc) this).field_c);
              if (var15.field_G == -1) {
                break L4;
              } else {
                var9 = 2.0 * (3.141592653589793 * (double)var15.field_G) / (double)var15.field_M;
                var11 = (int)(-Math.sin(var9) * (double)var15.field_N);
                var12 = (int)(Math.cos(var9) * (double)var15.field_N);
                em.d(var7 - -var11, var12 + var8, 1, ((sc) this).field_b);
                break L4;
              }
            }
            em.d(var7, var8, 2, 1);
            var9 = 3.141592653589793 * (double)var15.field_F * 2.0 / (double)var15.field_M;
            var11 = (int)(-Math.sin(var9) * (double)var15.field_N);
            var12 = (int)(Math.cos(var9) * (double)var15.field_N);
            em.d(var7, var8, var11 + var7, var8 - -var12, 1);
            if (null != ((sc) this).field_e) {
              var13 = ((sc) this).field_i + (var15.field_D - -var15.field_N);
              int discarded$1 = ((sc) this).field_e.a(param3.field_l, var13 + param3.field_k + param0, param1 + (param3.field_j + ((sc) this).field_f), param3.field_g - (var13 - -((sc) this).field_i), param3.field_x - (((sc) this).field_i << 1), ((sc) this).field_j, ((sc) this).field_d, 1, 1, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("sc.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param4 + 41);
        }
    }

    final static void b(byte param0) {
        Object var2 = null;
        if (ff.field_e == 10) {
          fe.a(-84);
          ff.field_e = 11;
          pb.field_d = true;
          if (param0 < -81) {
            return;
          } else {
            var2 = null;
            sc.a((byte) -55, (java.awt.Component) null);
            return;
          }
        } else {
          if (!g.i(56)) {
            fe.a(-84);
            ff.field_e = 11;
            pb.field_d = true;
            if (param0 >= -81) {
              var2 = null;
              sc.a((byte) -55, (java.awt.Component) null);
              return;
            } else {
              return;
            }
          } else {
            pb.field_d = true;
            if (param0 < -81) {
              return;
            } else {
              var2 = null;
              sc.a((byte) -55, (java.awt.Component) null);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_h = null;
    }

    sc(wl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((sc) this).field_j = param3;
            ((sc) this).field_b = param6;
            ((sc) this).field_e = param0;
            ((sc) this).field_d = param4;
            ((sc) this).field_f = param2;
            ((sc) this).field_c = param5;
            ((sc) this).field_a = param7;
            ((sc) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "sc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeKeyListener((java.awt.event.KeyListener) (Object) ck.field_v);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) ck.field_v);
        if (param0 != -58) {
            return;
        }
        try {
            sb.field_b = -1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "sc.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{0, 16384, 32768, 49152};
    }
}
