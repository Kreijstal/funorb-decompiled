/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh implements pf {
    private int field_k;
    private int field_f;
    private int field_m;
    private int field_l;
    private int field_b;
    private dj field_j;
    static vn field_c;
    private int field_i;
    static String field_h;
    static String field_d;
    static boolean field_n;
    static eg field_g;
    static String field_a;
    static String[] field_e;

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wg var12 = null;
        qm stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        qm stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!(param0 instanceof wg)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (qm) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = (qm) param0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (wg) (Object) stackIn_4_0;
              de.d(param0.field_n + param2, param3 - -param0.field_j, param0.field_v, param0.field_k, ((lh) this).field_k);
              if (var12 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            if (param1 == 5592405) {
              var7 = -(2 * var12.field_H) + param0.field_v;
              var8 = param0.field_n + param2 - -var12.field_H;
              var9 = var12.field_L + (param0.field_j + param3);
              de.b(var8, var9, var7 + var8, var9, ((lh) this).field_b);
              var10 = -1 + var12.c(false);
              L3: while (true) {
                if (0 > var10) {
                  if (null == ((lh) this).field_j) {
                    break L0;
                  } else {
                    ((lh) this).field_j.b(var12.field_g, var8 - -(var7 / 2), var12.field_L + (((lh) this).field_j.field_H + var9), ((lh) this).field_l, ((lh) this).field_f);
                    return;
                  }
                } else {
                  de.i(var8 + var7 * var12.a(0, var10) / var12.g((byte) -102), var9, ((lh) this).field_i, ((lh) this).field_m);
                  var10--;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("lh.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_e = null;
        field_d = null;
        field_a = null;
        field_g = null;
    }

    lh(dj param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((lh) this).field_i = param5;
            ((lh) this).field_f = param2;
            ((lh) this).field_b = param3;
            ((lh) this).field_j = param0;
            ((lh) this).field_k = param4;
            ((lh) this).field_l = param1;
            ((lh) this).field_m = param6;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "lh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new vn();
        field_d = "Just one target left; you're almost there! If a target is hard to hit, try aiming away from it and watching how Arcane Arrow curves around to the focus point.";
        field_h = "Remaining time this turn";
        field_a = "Discard";
        field_e = new String[]{"All scores", "My scores", "Best each"};
    }
}
