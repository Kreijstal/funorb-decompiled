/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class be extends ip {
    static String field_m;
    static String field_r;
    static hl field_n;
    private rm field_p;
    static String field_q;
    static ph field_o;
    static wk field_s;

    final String a(byte param0, String param1) {
        dp var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_10_0 = null;
        String stackOut_14_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 44) {
                break L1;
              } else {
                var4 = null;
                od discarded$2 = ((be) this).a((String) null, -75);
                break L1;
              }
            }
            L2: {
              if (!(((be) this).field_p instanceof qn)) {
                break L2;
              } else {
                var3 = ((qn) (Object) ((be) this).field_p).a(-79);
                if (var3 != null) {
                  L3: {
                    if (var3.a((byte) -117) != c.field_d) {
                      break L3;
                    } else {
                      if (!param1.equals((Object) (Object) ((be) this).field_p.field_w)) {
                        stackOut_8_0 = ep.field_j;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_10_0 = var3.a(true);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  break L2;
                }
              }
            }
            if (!param1.equals((Object) (Object) ((be) this).field_p.field_w)) {
              stackOut_14_0 = ep.field_j;
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
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("be.D(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_15_0;
    }

    final od a(String param0, int param1) {
        dp var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        od stackIn_5_0 = null;
        od stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        od stackOut_4_0 = null;
        od stackOut_8_0 = null;
        od stackOut_7_0 = null;
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
            L1: {
              if (((be) this).field_p instanceof qn) {
                var3 = ((qn) (Object) ((be) this).field_p).a(-122);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.a((byte) -99) == c.field_d) {
                    break L1;
                  } else {
                    stackOut_4_0 = pd.field_J;
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = -81 / ((5 - param1) / 44);
              if (param0.equals((Object) (Object) ((be) this).field_p.field_w)) {
                stackOut_8_0 = c.field_d;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = pd.field_J;
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("be.C(");
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    public static void e() {
        field_q = null;
        field_s = null;
        field_m = null;
        field_n = null;
        field_o = null;
        field_r = null;
    }

    be(rm param0, rm param1) {
        super(param0);
        try {
            ((be) this).field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "be.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = null;
        field_m = "You must have had your dungeon reset by an Orb of Mastery once to earn the title of <%1>.";
        field_q = "CHARGE ORB";
        field_r = "Cancel";
    }
}
