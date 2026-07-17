/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ii extends vo {
    private String field_f;
    static pa[][] field_k;
    static String[] field_e;
    private uu field_h;
    static dk field_m;
    private boolean field_i;
    static rk field_j;
    static String field_l;
    static String field_g;

    ii(bm param0, bm param1) {
        super(param0);
        ((ii) this).field_f = "";
        ((ii) this).field_i = false;
        try {
            ((ii) this).field_h = new uu(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ii.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void c(byte param0) {
        field_m = null;
        field_l = null;
        field_k = null;
        field_j = null;
        field_e = null;
        field_g = null;
    }

    final static int a(byte param0, jb param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          if (param1 == dl.field_p) {
            stackOut_11_0 = 5890;
            stackIn_12_0 = stackOut_11_0;
            return stackIn_12_0;
          } else {
            if (ac.field_b != param1) {
              if (un.field_i != param1) {
                if (param1 == bs.field_a) {
                  stackOut_9_0 = 34166;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  L0: {
                    if (param0 >= 63) {
                      break L0;
                    } else {
                      field_e = null;
                      break L0;
                    }
                  }
                  throw new IllegalArgumentException();
                }
              } else {
                stackOut_5_0 = 34168;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = 34167;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("ii.D(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_6_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (((ii) this).field_h.a(param0, 8192) != bt.field_a) {
              L1: {
                if (param1 == 72) {
                  break L1;
                } else {
                  ((ii) this).field_i = true;
                  break L1;
                }
              }
              if (((ii) this).a(param0, 8192) != bt.field_a) {
                stackOut_8_0 = gh.field_o;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = dk.field_i;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              stackOut_1_0 = ((ii) this).field_h.a(param0, (byte) 72);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ii.EA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0;
    }

    final pt a(String param0, int param1) {
        id var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        pt stackIn_2_0 = null;
        pt stackIn_6_0 = null;
        pt stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        pt stackOut_5_0 = null;
        pt stackOut_12_0 = null;
        pt stackOut_11_0 = null;
        pt stackOut_1_0 = null;
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
            if (((ii) this).field_h.a(param0, param1) != bt.field_a) {
              L1: {
                if (param0.equals((Object) (Object) ((ii) this).field_f)) {
                  break L1;
                } else {
                  var3 = rq.a(-111, param0);
                  if (var3.a(false)) {
                    ((ii) this).field_f = param0;
                    ((ii) this).field_i = var3.a(param1 + -10107);
                    break L1;
                  } else {
                    stackOut_5_0 = ce.field_t;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0;
                  }
                }
              }
              L2: {
                if (param1 == 8192) {
                  break L2;
                } else {
                  var4 = null;
                  String discarded$2 = ((ii) this).a((String) null, (byte) 79);
                  break L2;
                }
              }
              L3: {
                if (((ii) this).field_i) {
                  stackOut_12_0 = fd.field_a;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = bt.field_a;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = bt.field_a;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("ii.DA(");
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
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_13_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Press 1 for speed increase", "Press 2 for improved fire rate", "Press 3 for improved manoeuvrability", "Press 4 for extra armour", "Press 5 for extra life", "Press 6 for extra wingmen", "Press 7 for score multiplier"};
        field_l = "settings";
        int discarded$0 = ek.a((byte) 116, 1600);
        field_g = "Passwords can only contain letters and numbers";
    }
}
