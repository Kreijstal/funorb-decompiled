/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class fg extends cg {
    private hf field_o;
    static String field_j;
    static int field_l;
    static String[] field_m;
    static boolean field_k;
    static java.awt.Frame field_n;

    final String a(String param0, boolean param1) {
        ba var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
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
              if (((fg) this).field_o instanceof of) {
                var3 = ((of) (Object) ((fg) this).field_o).a(-53);
                if (var3 != null) {
                  L2: {
                    if (var3.a(true) != ii.field_e) {
                      break L2;
                    } else {
                      if (param0.equals((Object) (Object) ((fg) this).field_o.field_r)) {
                        break L2;
                      } else {
                        stackOut_6_0 = r.field_r;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0;
                      }
                    }
                  }
                  stackOut_8_0 = var3.b(26766);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (!param1) {
                break L3;
              } else {
                var4 = null;
                sg discarded$2 = ((fg) this).a((String) null, -89);
                break L3;
              }
            }
            if (!param0.equals((Object) (Object) ((fg) this).field_o.field_r)) {
              stackOut_14_0 = r.field_r;
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
            stackOut_16_1 = new StringBuilder().append("fg.I(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
        return stackIn_15_0;
    }

    public static void c() {
        field_m = null;
        field_n = null;
        field_j = null;
    }

    fg(hf param0, hf param1) {
        super(param0);
        try {
            ((fg) this).field_o = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "fg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final sg a(String param0, int param1) {
        ba var3 = null;
        RuntimeException var3_ref = null;
        sg stackIn_7_0 = null;
        sg stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        sg stackOut_6_0 = null;
        sg stackOut_10_0 = null;
        sg stackOut_9_0 = null;
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
              if (param1 < -58) {
                break L1;
              } else {
                field_k = false;
                break L1;
              }
            }
            L2: {
              if (((fg) this).field_o instanceof of) {
                var3 = ((of) (Object) ((fg) this).field_o).a(116);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.a(true) == ii.field_e) {
                    break L2;
                  } else {
                    stackOut_6_0 = pe.field_b;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (!param0.equals((Object) (Object) ((fg) this).field_o.field_r)) {
                stackOut_10_0 = pe.field_b;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = ii.field_e;
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
            stackOut_12_1 = new StringBuilder().append("fg.M(");
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
          throw ma.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"By rating", "By win percentage"};
        field_k = false;
    }
}
