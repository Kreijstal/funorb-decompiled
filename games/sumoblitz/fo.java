/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo extends sp implements ai {
    private wp field_C;
    private wp field_A;
    private wp field_B;

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param2 > -35) {
          ((fo) this).field_B = null;
          var5 = ((fo) this).field_r - -param0;
          var6 = param1 + ((fo) this).field_v;
          int discarded$2 = kw.field_b.a(qn.field_h, 20 + var5, var6 - -20, ((fo) this).field_q - 40, -50 + ((fo) this).field_p, 16777215, -1, 1, 0, kw.field_b.field_s);
          super.a(param0, param1, (byte) -96, param3);
          return;
        } else {
          var5 = ((fo) this).field_r - -param0;
          var6 = param1 + ((fo) this).field_v;
          int discarded$3 = kw.field_b.a(qn.field_h, 20 + var5, var6 - -20, ((fo) this).field_q - 40, -50 + ((fo) this).field_p, 16777215, -1, 1, 0, kw.field_b.field_s);
          super.a(param0, param1, (byte) -96, param3);
          return;
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == ((fo) this).field_A) {
                mu.e(0);
                break L1;
              } else {
                if (param2 != ((fo) this).field_B) {
                  if (((fo) this).field_C != param2) {
                    break L1;
                  } else {
                    vi.e(4);
                    break L1;
                  }
                } else {
                  rv.a((byte) 114);
                  break L1;
                }
              }
            }
            if (param1 == 710) {
              break L0;
            } else {
              ((fo) this).field_A = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("fo.C(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public fo() {
        super(0, 0, 476, 225, (mh) null);
        ((fo) this).field_B = new wp(ms.field_i, (qm) null);
        ((fo) this).field_A = new wp(jc.field_e, (qm) null);
        ((fo) this).field_C = new wp(tm.field_b, (qm) null);
        ue var1 = new ue();
        ((fo) this).field_B.field_w = (mh) (Object) var1;
        ((fo) this).field_A.field_w = (mh) (Object) var1;
        ((fo) this).field_C.field_w = (mh) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        ((fo) this).field_A.a(97, ((fo) this).field_q - var3 >> 1, -var2 + (-48 + ((fo) this).field_p), 30, var4);
        ((fo) this).field_C.a(-86, (((fo) this).field_q + -var3 >> 1) - -var4 + var2, -48 + ((fo) this).field_p + -var2, 30, var4);
        ((fo) this).field_B.a(-112, -var3 + ((fo) this).field_q >> 1, -(var2 * 2) + ((fo) this).field_p + -78, 30, var3);
        ((fo) this).field_A.field_o = (qm) this;
        ((fo) this).field_B.field_o = (qm) this;
        ((fo) this).field_B.field_t = aj.field_x;
        ((fo) this).field_C.field_o = (qm) this;
        ((fo) this).field_C.field_t = hg.field_t;
        ((fo) this).a((pk) (Object) ((fo) this).field_A, 120);
        ((fo) this).a((pk) (Object) ((fo) this).field_B, 70);
        ((fo) this).a((pk) (Object) ((fo) this).field_C, 83);
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
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
              if (param2 >= 9) {
                break L1;
              } else {
                ((fo) this).a(-128, -68, (byte) -69, -31);
                break L1;
              }
            }
            if (!super.a(param0, param1, (byte) 20, param3)) {
              if (param3 == 98) {
                stackOut_7_0 = ((fo) this).a((byte) 123, param0);
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (param3 != 99) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = ((fo) this).a(param0, false);
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
            stackOut_14_1 = new StringBuilder().append("fo.KA(");
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
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0 != 0;
    }

    static {
    }
}
