/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends ct {
    static int[] field_C;
    int field_F;
    static String field_A;
    static String field_D;
    static hd field_E;

    final static kg a(boolean param0, int param1, tf param2, int param3) {
        ut var4 = null;
        RuntimeException var4_ref = null;
        ut var5 = null;
        nr var6 = null;
        int var7 = 0;
        ut[] stackIn_2_0 = null;
        ut[] stackIn_3_0 = null;
        ut[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ut stackIn_5_0 = null;
        ut stackIn_6_0 = null;
        ut stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        kg stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ut[] stackOut_1_0 = null;
        ut[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ut[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ut stackOut_4_0 = null;
        ut stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ut stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        kg stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              stackOut_1_0 = oe.field_p;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0) {
                stackOut_3_0 = (ut[]) (Object) stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = (ut[]) (Object) stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              var4 = stackIn_4_0[stackIn_4_1];
              var5 = new ut(var4.field_o, var4.field_v);
              iw.a(-55, var5);
              stackOut_4_0 = j.a(-5275);
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param0) {
                stackOut_6_0 = (ut) (Object) stackIn_6_0;
                stackOut_6_1 = -10;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = (ut) (Object) stackIn_5_0;
                stackOut_5_1 = -120;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            ((ut) (Object) stackIn_7_0).d(stackIn_7_1, 0);
            var4.c(0, 0);
            var6 = (nr) (Object) param2.g(24009);
            L3: while (true) {
              if (var6 == null) {
                L4: {
                  if (param1 <= -41) {
                    break L4;
                  } else {
                    field_D = null;
                    break L4;
                  }
                }
                ta.e(120);
                stackOut_12_0 = eo.a(var5);
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                var6.a(param3, -2);
                var6 = (nr) (Object) param2.c(33);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4_ref;
            stackOut_14_1 = new StringBuilder().append("pj.D(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param3 + 41);
        }
        return stackIn_13_0;
    }

    pj(fd param0) {
        super(param0.field_t, param0.field_g, param0.field_n, param0.field_i, (gj) null, (jv) null);
        try {
            param0.a(((pj) this).field_i, 1, 0, ((pj) this).field_n, 0);
            ((pj) this).field_F = 256;
            ((pj) this).field_z = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "pj.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void h() {
        field_C = null;
        field_E = null;
        field_A = null;
        field_D = null;
    }

    public pj() {
        super(0, 0, 0, 0, (gj) null, (jv) null);
        ((pj) this).field_F = 256;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(0 == param0)) {
            return;
        }
        if (null == ((pj) this).field_z) {
            return;
        }
        if (((pj) this).field_F == 0) {
            return;
        }
        if (!(256 != ((pj) this).field_F)) {
            ((pj) this).field_z.a(param0, 65, ((pj) this).field_t + param2, ((pj) this).field_g + param3);
            return;
        }
        ut var6 = new ut(((pj) this).field_z.field_n, ((pj) this).field_z.field_i);
        iw.a(-46, var6);
        ((pj) this).field_z.a(param0, (int) (char)param1, 0, 0);
        ta.e(127);
        var6.b(param2 - -((pj) this).field_t, ((pj) this).field_g + param3, ((pj) this).field_F);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Money: ";
        field_A = "draw?";
    }
}
