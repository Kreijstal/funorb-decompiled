/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq extends ob {
    static jea field_o;

    final static void c(byte param0) {
        int var1 = 0;
        vaa.field_b = bva.b((byte) -107);
        gp.field_h = 0;
    }

    final void a(byte param0, float param1) {
        ((jq) this).field_j = param1;
        if (param0 <= 77) {
            field_o = null;
        }
    }

    final void a(byte param0, int param1) {
        ((jq) this).field_h = param1;
        if (param0 != 62) {
            field_o = null;
        }
    }

    final static void a(int param0, byte param1) {
        kh var2 = ql.field_k;
        var2.k(param0, -2988);
        var2.field_h = var2.field_h + 1;
        int var3 = var2.field_h;
        var2.i(2, 0);
        var2.a(0, vk.field_b, vk.field_b.length, 71);
        int var4 = 0;
        var2.i(aja.field_H, 0);
        var2.i(mua.field_b, 0);
        var2.a(0, tqa.field_e, tqa.field_e.length, 119);
        var2.d(var2.field_h - var3, (byte) -102);
    }

    final static qk a(byte[] param0, int param1, byte param2, int param3, cka param4, int param5, boolean param6, int param7) {
        RuntimeException var8 = null;
        Object var9 = null;
        qk stackIn_8_0 = null;
        qk stackIn_10_0 = null;
        qk stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        qk stackOut_9_0 = null;
        qk stackOut_7_0 = null;
        qk stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param2 > 52) {
                break L1;
              } else {
                var9 = null;
                qk discarded$2 = jq.a((byte[]) null, 99, (byte) 8, -3, (cka) null, -12, false, 23);
                break L1;
              }
            }
            L2: {
              if (param4.field_Gb) {
                break L2;
              } else {
                L3: {
                  if (!cla.a(9181, param5)) {
                    break L3;
                  } else {
                    if (cla.a(9181, param7)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (param4.field_Cc) {
                  stackOut_9_0 = new qk(param4, 34037, param3, param5, param7, param6, param0, param1);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  stackOut_7_0 = new qk(param4, param3, param5, param7, lla.a(false, param5), lla.a(false, param7), param0, param1);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              }
            }
            stackOut_11_0 = new qk(param4, 3553, param3, param5, param7, param6, param0, param1);
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("jq.F(");
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
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
        return stackIn_12_0;
    }

    final void a(int param0, int param1) {
        ((jq) this).field_g = param1;
        if (param0 != 255) {
            field_o = null;
        }
    }

    jq(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void d(byte param0) {
        field_o = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        ((jq) this).field_k = param1;
        int var5 = 97 % ((param2 - -55) / 58);
        ((jq) this).field_m = param0;
        ((jq) this).field_l = param3;
    }

    static {
    }
}
