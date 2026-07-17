/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends vd implements lja {
    private mf field_I;
    private int[] field_G;
    private int field_E;
    static int field_J;
    private String field_C;
    private hf[] field_F;
    static int field_D;
    private po field_H;

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
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
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_int = 0;
              if (param3 >= 50) {
                break L1;
              } else {
                ((hc) this).a((byte) -102, -21, 19, -11);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var6_int >= ((hc) this).field_E) {
                  break L3;
                } else {
                  if (param1 == ((hc) this).field_F[var6_int]) {
                    var7 = ((hc) this).field_G[var6_int];
                    if (var7 != -1) {
                      ep.a(((hc) this).field_G[var6_int], 8192);
                      break L3;
                    } else {
                      ((hc) this).field_I.p(-83);
                      break L3;
                    }
                  } else {
                    var6_int++;
                    continue L2;
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
            stackOut_11_1 = new StringBuilder().append("hc.AA(").append(param0).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) -85, param1, param2, param3);
        int discarded$0 = ((hc) this).field_H.a(((hc) this).field_C, 14 + (((hc) this).field_s + param3), 10 + ((hc) this).field_v + param1, -28 + ((hc) this).field_p, ((hc) this).field_q, 16777215, -1, 0, 0, ((hc) this).field_H.field_u);
        int var5 = -1 % ((param0 - -20) / 54);
    }

    final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = ((hc) this).field_E;
            this.a(var4_int - -1, param0 ^ param0);
            ((hc) this).field_F[var4_int] = ((hc) this).a((pl) this, param1, param0 + 19521);
            ((hc) this).field_G[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "hc.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        if (((hc) this).field_E >= param0) {
            return;
        }
        hf[] var7 = new hf[param0];
        hf[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = param1; ((hc) this).field_E > var5; var5++) {
            var7[var5] = ((hc) this).field_F[var5];
            var4[var5] = ((hc) this).field_G[var5];
        }
        ((hc) this).field_F = var3;
        ((hc) this).field_E = param0;
        ((hc) this).field_G = var4;
    }

    hc(mf param0, po param1, String param2) {
        super(0, 0, 288, 0, (qda) null);
        int var4_int = 0;
        ((hc) this).field_E = 0;
        try {
            ((hc) this).field_I = param0;
            ((hc) this).field_H = param1;
            ((hc) this).field_C = param2;
            var4_int = ((hc) this).field_C != null ? ((hc) this).field_H.a(((hc) this).field_C, 260, ((hc) this).field_H.field_u) : 0;
            ((hc) this).a(0, 22 + var4_int, (byte) 59, 288, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "hc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final hf a(pl param0, String param1, int param2) {
        hf var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        hf stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        hf stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 19528) {
                break L1;
              } else {
                var6 = null;
                hf discarded$2 = ((hc) this).a((pl) null, (String) null, -17);
                break L1;
              }
            }
            var4 = new hf(param1, param0);
            var4.field_f = (qda) (Object) new ff();
            var5 = -2 + ((hc) this).field_q;
            ((hc) this).a(0, 34 + ((hc) this).field_q, (byte) 59, ((hc) this).field_p, 0);
            var4.a(7, 30, (byte) 59, -14 + ((hc) this).field_p, var5);
            ((hc) this).c((wj) (Object) var4, -126);
            stackOut_2_0 = (hf) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("hc.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    static {
    }
}
