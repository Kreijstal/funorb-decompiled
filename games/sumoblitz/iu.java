/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iu implements mh {
    private int field_d;
    private vn field_c;
    static int field_e;
    private int field_h;
    private int field_b;
    private int field_g;
    private int field_f;
    private int field_a;

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        fu var13 = null;
        pk stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        pk stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 instanceof fu) {
                stackOut_3_0 = (pk) param0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (pk) (Object) stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var13 = (fu) (Object) stackIn_4_0;
              lk.d(param0.field_r + param4, param0.field_v + param1, param0.field_q, param0.field_p, ((iu) this).field_h);
              if (var13 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param2 == 5592405) {
                break L3;
              } else {
                var12 = null;
                ((iu) this).a((pk) null, -54, -79, true, -72);
                break L3;
              }
            }
            var7 = param0.field_q + -(var13.field_I * 2);
            var8 = param4 - (-param0.field_r + -var13.field_I);
            var9 = param1 + param0.field_v - -var13.field_J;
            lk.e(var8, var9, var7 + var8, var9, ((iu) this).field_g);
            var10 = -1 + var13.g(0);
            L4: while (true) {
              if (var10 < 0) {
                if (((iu) this).field_c != null) {
                  ((iu) this).field_c.a(var13.field_m, var8 + var7 / 2, var13.field_J + (((iu) this).field_c.field_F + var9), ((iu) this).field_b, ((iu) this).field_f);
                  break L0;
                } else {
                  return;
                }
              } else {
                lk.b(var8 + var13.a(var10, param2 + -5616599) * var7 / var13.h(-1), var9, ((iu) this).field_d, ((iu) this).field_a);
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
            stackOut_14_1 = new StringBuilder().append("iu.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(byte param0) {
        if (param0 > -117) {
          iu.a((byte) -85);
          pg.field_a = false;
          lc.field_A = false;
          rd.a(-1, -69);
          vm.field_c = hm.field_a;
          nw.field_e = hm.field_a;
          return;
        } else {
          pg.field_a = false;
          lc.field_A = false;
          rd.a(-1, -69);
          vm.field_c = hm.field_a;
          nw.field_e = hm.field_a;
          return;
        }
    }

    final static void a(int param0, km param1, int param2) {
        pl var3 = null;
        try {
            if (param0 != -1) {
                field_e = 23;
            }
            var3 = as.field_v;
            var3.g(param2, param0 ^ -9);
            var3.b((byte) 85, param1.field_n);
            var3.b((byte) 23, param1.field_l);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "iu.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    iu(vn param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((iu) this).field_g = param3;
            ((iu) this).field_b = param1;
            ((iu) this).field_a = param6;
            ((iu) this).field_h = param4;
            ((iu) this).field_d = param5;
            ((iu) this).field_f = param2;
            ((iu) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "iu.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
    }
}
