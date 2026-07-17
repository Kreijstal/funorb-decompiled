/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nq extends na {
    static ik field_h;
    private dh field_e;
    static int field_i;
    static eg field_g;
    static int[] field_j;
    static String field_f;

    final gf a(byte param0, String param1) {
        v var3 = null;
        RuntimeException var3_ref = null;
        gf stackIn_5_0 = null;
        gf stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        gf stackOut_4_0 = null;
        gf stackOut_10_0 = null;
        gf stackOut_9_0 = null;
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
              if (!(((nq) this).field_e instanceof op)) {
                break L1;
              } else {
                var3 = ((op) (Object) ((nq) this).field_e).a(72);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.c(88) != qe.field_a) {
                    stackOut_4_0 = qr.field_e;
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == 26) {
                break L2;
              } else {
                int discarded$2 = nq.a(-47, 52, 56);
                break L2;
              }
            }
            L3: {
              if (!param1.equals((Object) (Object) ((nq) this).field_e.field_m)) {
                stackOut_10_0 = qr.field_e;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = qe.field_a;
                stackIn_11_0 = stackOut_9_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("nq.E(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    public static void c(byte param0) {
        field_j = null;
        field_f = null;
        field_h = null;
        field_g = null;
        if (param0 != -31) {
            int discarded$0 = nq.a(-90, -68, 30);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 > 72) {
              var3_int = 1;
              L1: while (true) {
                if (param2 <= 1) {
                  if (param2 != 1) {
                    stackOut_12_0 = var3_int;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_10_0 = param0 * var3_int;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                } else {
                  L2: {
                    if (0 == (1 & param2)) {
                      break L2;
                    } else {
                      var3_int = var3_int * param0;
                      break L2;
                    }
                  }
                  param0 = param0 * param0;
                  param2 = param2 >> 1;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 18;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3, "nq.C(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_13_0;
    }

    final String a(int param0, String param1) {
        v var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_9_0 = null;
        Object stackOut_16_0 = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (((nq) this).field_e instanceof op) {
                var3 = ((op) (Object) ((nq) this).field_e).a(-114);
                if (var3 != null) {
                  L2: {
                    if (var3.c(param0 + -98) != qe.field_a) {
                      break L2;
                    } else {
                      if (!param1.equals((Object) (Object) ((nq) this).field_e.field_m)) {
                        stackOut_7_0 = gq.field_p;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_9_0 = var3.a(param0 + 3690);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param1.equals((Object) (Object) ((nq) this).field_e.field_m)) {
              if (param0 != 0) {
                nq.c((byte) 75);
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_12_0 = gq.field_p;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("nq.B(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return (String) (Object) stackIn_17_0;
    }

    nq(dh param0, dh param1) {
        super(param0);
        try {
            ((nq) this).field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "nq.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_f = "options";
        field_j = new int[1];
    }
}
