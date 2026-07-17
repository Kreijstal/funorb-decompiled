/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends ok {
    static int field_I;
    int field_H;
    static vl field_E;

    public static void j() {
        field_E = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        qj var6 = null;
        if (param0 == 0) {
          if (null != ((gl) this).field_B) {
            if (((gl) this).field_H == 0) {
              return;
            } else {
              if (((gl) this).field_H != 256) {
                var6 = new qj(((gl) this).field_B.field_x, ((gl) this).field_B.field_u);
                if (param3 != 29221) {
                  return;
                } else {
                  mb.a((byte) -12, var6);
                  ((gl) this).field_B.a(param0, 0, 0, param3);
                  ch.m(param3 + -29294);
                  var6.d(((gl) this).field_p + param1, ((gl) this).field_m + param2, ((gl) this).field_H);
                  return;
                }
              } else {
                ((gl) this).field_B.a(param0, param1 + ((gl) this).field_p, ((gl) this).field_m + param2, param3);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public gl() {
        super(0, 0, 0, 0, (t) null, (tg) null);
        ((gl) this).field_H = 256;
    }

    final static void a(String param0, String[] param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          fd.field_h = cj.field_e;
          if (param2 != 255) {
            if (param2 < 100) {
              h.field_c = wg.a((byte) 54, param2, param0);
              return;
            } else {
              if (param2 > 105) {
                h.field_c = wg.a((byte) 54, param2, param0);
                return;
              } else {
                h.field_c = qg.a(param1, 91);
                return;
              }
            }
          } else {
            L0: {
              if (da.field_o >= 13) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            h.field_c = oc.a(stackIn_5_0 != 0, -21017);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("gl.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 44 + 113 + 41);
        }
    }

    final static qj[] b(int param0, int param1, int param2, int param3, int param4) {
        qj[] var7 = new qj[9];
        qj[] var5 = var7;
        qj dupTemp$0 = ee.a(param0, 1, (byte) 104);
        var7[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        qj dupTemp$1 = ee.a(param2, 1, (byte) -74);
        var7[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        int var6 = 0;
        if (!(param4 == 0)) {
            var7[4] = ee.a(param4, 64, (byte) 104);
        }
        return var5;
    }

    gl(al param0) {
        super(param0.field_p, param0.field_m, param0.field_x, param0.field_u, (t) null, (tg) null);
        try {
            param0.a(((gl) this).field_u, -3050, 0, ((gl) this).field_x, 0);
            ((gl) this).field_H = 256;
            ((gl) this).field_B = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "gl.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
