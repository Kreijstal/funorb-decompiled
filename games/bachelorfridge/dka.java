/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dka extends vd implements lja {
    private hf field_F;
    private hf field_E;
    static String field_D;
    private hf field_C;
    static af field_G;

    final static void a(nv param0, byte param1) {
        try {
            if (param1 != 59) {
                field_G = null;
            }
            fo.field_a.a(param1 ^ -60, (sna) (Object) param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "dka.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public dka() {
        super(0, 0, 476, 225, (qda) null);
        ((dka) this).field_E = new hf(sca.field_b, (pl) null);
        ((dka) this).field_C = new hf(nt.field_x, (pl) null);
        ((dka) this).field_F = new hf(tja.field_b, (pl) null);
        ff var1 = new ff();
        ((dka) this).field_E.field_f = (qda) (Object) var1;
        ((dka) this).field_C.field_f = (qda) (Object) var1;
        ((dka) this).field_F.field_f = (qda) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        ((dka) this).field_C.a(((dka) this).field_p - var3 >> 1, 30, (byte) 59, var4, -var2 + (-48 + ((dka) this).field_q));
        ((dka) this).field_F.a((((dka) this).field_p - var3 >> 1) + var4 - -var2, 30, (byte) 59, var4, -var2 + ((dka) this).field_q + -48);
        ((dka) this).field_E.a(((dka) this).field_p - var3 >> 1, 30, (byte) 59, var3, -(2 * var2) + ((dka) this).field_q + -78);
        ((dka) this).field_C.field_k = (pl) this;
        ((dka) this).field_E.field_k = (pl) this;
        ((dka) this).field_F.field_k = (pl) this;
        ((dka) this).field_E.field_h = qha.field_h;
        ((dka) this).field_F.field_h = lna.field_h;
        ((dka) this).c((wj) (Object) ((dka) this).field_C, -121);
        ((dka) this).c((wj) (Object) ((dka) this).field_E, 122);
        ((dka) this).c((wj) (Object) ((dka) this).field_F, 33);
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
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
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (((dka) this).field_C != param1) {
                if (((dka) this).field_E == param1) {
                  qfa.f(114);
                  break L1;
                } else {
                  if (((dka) this).field_F == param1) {
                    nt.e((byte) 123);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                dd.d((byte) -88);
                break L1;
              }
            }
            if (param3 >= 50) {
              break L0;
            } else {
              var8 = null;
              dka.a((nv) null, (byte) -59);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("dka.AA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = param3 + ((dka) this).field_s;
        int var6 = param1 + ((dka) this).field_v;
        int discarded$0 = jca.field_a.a(wfa.field_q, var5 - -20, 20 + var6, ((dka) this).field_p - 40, ((dka) this).field_q + -50, 16777215, -1, 1, 0, jca.field_a.field_u);
        super.a((byte) 74, param1, param2, param3);
        int var7 = -39 / ((param0 - -20) / 54);
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0 = false;
        int stackOut_12_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                dka.a(28);
                break L1;
              }
            }
            if (!super.a(param0, param1, param2, param3)) {
              if (param1 == 98) {
                stackOut_7_0 = ((dka) this).a(-123, param3);
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (param1 != 99) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = ((dka) this).b(param3, 1);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("dka.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    public static void a(int param0) {
        field_D = null;
        if (param0 != 26727) {
            Object var2 = null;
            dka.a((nv) null, (byte) -57);
            field_G = null;
            return;
        }
        field_G = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Report abuse";
    }
}
