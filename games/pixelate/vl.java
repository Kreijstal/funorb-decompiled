/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends ch implements vo {
    private jl field_O;
    static ak field_J;
    private qm[] field_S;
    private vk field_M;
    private String field_N;
    private int[] field_I;
    static jl field_Q;
    static String field_R;
    private int field_P;
    static ak field_L;

    public static void a(int param0) {
        field_R = null;
        if (param0 != 0) {
            field_J = null;
        }
        field_Q = null;
        field_L = null;
        field_J = null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) -24);
        int discarded$0 = ((vl) this).field_O.a(((vl) this).field_N, 14 + (((vl) this).field_z + param2), ((vl) this).field_p + param0 - -10, ((vl) this).field_E + -28, ((vl) this).field_C, 16777215, -1, 0, 0, ((vl) this).field_O.field_w);
        int var5 = -57 / ((param3 - 70) / 49);
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        if (!(param1 > ((vl) this).field_P)) {
            return;
        }
        qm[] var7 = new qm[param1];
        qm[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < ((vl) this).field_P; var5++) {
            var7[var5] = ((vl) this).field_S[var5];
            var4[var5] = ((vl) this).field_I[var5];
        }
        ((vl) this).field_I = var4;
        ((vl) this).field_S = var3;
        ((vl) this).field_P = param1;
        if (param0 > -57) {
            boolean discarded$0 = vl.b(94, 86, 20);
        }
    }

    vl(vk param0, jl param1, String param2) {
        super(0, 0, 288, 0, (eb) null);
        int var4_int = 0;
        ((vl) this).field_P = 0;
        try {
            ((vl) this).field_M = param0;
            ((vl) this).field_O = param1;
            ((vl) this).field_N = param2;
            var4_int = ((vl) this).field_N == null ? 0 : ((vl) this).field_O.a(((vl) this).field_N, 260, ((vl) this).field_O.field_w);
            ((vl) this).a(288, (byte) 55, 0, 0, 22 - -var4_int);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "vl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 11) {
                break L1;
              } else {
                field_R = null;
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              L3: {
                if (var6_int >= ((vl) this).field_P) {
                  break L3;
                } else {
                  if (((vl) this).field_S[var6_int] == param0) {
                    var7 = ((vl) this).field_I[var6_int];
                    if (var7 != -1) {
                      te.a(((vl) this).field_I[var6_int], -2671);
                      break L3;
                    } else {
                      ((vl) this).field_M.p(-121);
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
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("vl.Q(");
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
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(int param0, int param1, String param2) {
        int var4_int = 0;
        try {
            var4_int = ((vl) this).field_P;
            this.a(param1 ^ 114, var4_int - param1);
            ((vl) this).field_S[var4_int] = ((vl) this).a(1707, (fn) this, param2);
            ((vl) this).field_I[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "vl.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final qm a(int param0, fn param1, String param2) {
        qm var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        qm stackIn_3_0 = null;
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
        qm stackOut_2_0 = null;
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
              var4 = new qm(param2, param1);
              var4.field_y = (eb) (Object) new ad();
              if (param0 == 1707) {
                break L1;
              } else {
                ((vl) this).field_P = 66;
                break L1;
              }
            }
            var5 = -2 + ((vl) this).field_C;
            ((vl) this).a(((vl) this).field_E, (byte) 63, 0, 0, ((vl) this).field_C + 34);
            var4.a(-14 + ((vl) this).field_E, (byte) 81, var5, 7, 30);
            ((vl) this).b((ng) (Object) var4, 80);
            stackOut_2_0 = (qm) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("vl.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
            if (param2 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final static boolean b(int param0, int param1, int param2) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        if (ke.field_a != 13) {
          if (param0 == ke.field_a) {
            bo.field_h.l(17872);
            return true;
          } else {
            L0: {
              L1: {
                if (null == bo.field_h) {
                  break L1;
                } else {
                  if (!bo.field_h.a(param2, 0, param1)) {
                    break L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L0;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
            return stackIn_9_0 != 0;
          }
        } else {
          po.a(true);
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "<%0> is not on your friend list.";
    }
}
