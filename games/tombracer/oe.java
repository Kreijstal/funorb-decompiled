/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class oe extends kca {
    static String field_l;
    private tra field_k;
    static int[] field_j;

    oe(tra param0, tra param1) {
        super(param0);
        try {
            ((oe) this).field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oe.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final String a(int param0, String param1) {
        nua var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_8_0 = null;
        String stackOut_14_0 = null;
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
              if (!(((oe) this).field_k instanceof mk)) {
                break L1;
              } else {
                var3 = ((mk) (Object) ((oe) this).field_k).a((byte) 92);
                if (var3 != null) {
                  L2: {
                    if (var3.b(-4666) != uh.field_k) {
                      break L2;
                    } else {
                      if (!param1.equals((Object) (Object) ((oe) this).field_k.field_o)) {
                        stackOut_6_0 = bha.field_q;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_8_0 = var3.a(103);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == -1) {
                break L3;
              } else {
                field_j = null;
                break L3;
              }
            }
            if (!param1.equals((Object) (Object) ((oe) this).field_k.field_o)) {
              stackOut_14_0 = bha.field_q;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("oe.B(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_15_0;
    }

    public static void b() {
        field_l = null;
        field_j = null;
    }

    final it a(byte param0, String param1) {
        nua var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        it stackIn_5_0 = null;
        it stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        it stackOut_4_0 = null;
        it stackOut_10_0 = null;
        it stackOut_9_0 = null;
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
              if (((oe) this).field_k instanceof mk) {
                var3 = ((mk) (Object) ((oe) this).field_k).a((byte) 89);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.b(param0 ^ -4664) == uh.field_k) {
                    break L1;
                  } else {
                    stackOut_4_0 = fp.field_c;
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 14) {
                break L2;
              } else {
                var4 = null;
                String discarded$2 = ((oe) this).a(63, (String) null);
                break L2;
              }
            }
            L3: {
              if (!param1.equals((Object) (Object) ((oe) this).field_k.field_o)) {
                stackOut_10_0 = fp.field_c;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = uh.field_k;
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
            stackOut_12_1 = new StringBuilder().append("oe.A(").append(param0).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_j = new int[]{0, 10, 11};
    }
}
