/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qo extends mg {
    static fm field_u;
    private c field_p;
    static ak field_q;
    static int field_o;
    static int field_s;
    static String field_m;
    static boolean field_z;
    static ii field_r;
    static String[] field_t;
    static tf field_v;
    static int field_A;
    static ge field_n;
    static int[] field_w;
    static String field_x;
    static java.security.SecureRandom field_y;

    final static String e(int param0) {
        return vi.field_o.h(5);
    }

    final String a(int param0, String param1) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_8_0 = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -76) {
                break L1;
              } else {
                var4 = null;
                String discarded$2 = ((qo) this).a(-37, (String) null);
                break L1;
              }
            }
            L2: {
              if (!(((qo) this).field_p instanceof bp)) {
                break L2;
              } else {
                var3 = ((bp) (Object) ((qo) this).field_p).a(1);
                if (var3 == null) {
                  break L2;
                } else {
                  L3: {
                    if (var3.a((byte) 68) != qk.field_g) {
                      break L3;
                    } else {
                      if (param1.equals((Object) (Object) ((qo) this).field_p.field_q)) {
                        break L3;
                      } else {
                        stackOut_6_0 = sk.field_d;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0;
                      }
                    }
                  }
                  stackOut_8_0 = var3.b((byte) -7);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            }
            if (!param1.equals((Object) (Object) ((qo) this).field_p.field_q)) {
              stackOut_12_0 = sk.field_d;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("qo.E(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_13_0;
    }

    public static void b(boolean param0) {
        field_t = null;
        field_y = null;
        field_v = null;
        field_q = null;
        field_x = null;
        field_u = null;
        field_n = null;
        field_w = null;
        field_m = null;
        field_r = null;
    }

    qo(c param0, c param1) {
        super(param0);
        try {
            ((qo) this).field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "qo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final dj a(String param0, boolean param1) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        dj stackIn_9_0 = null;
        dj stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        dj stackOut_8_0 = null;
        dj stackOut_12_0 = null;
        dj stackOut_11_0 = null;
        Object stackOut_1_0 = null;
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
            if (param1) {
              L1: {
                if (((qo) this).field_p instanceof bp) {
                  var3 = ((bp) (Object) ((qo) this).field_p).a(1);
                  if (var3 == null) {
                    break L1;
                  } else {
                    if (var3.a((byte) 69) != qk.field_g) {
                      stackOut_8_0 = sk.field_a;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0.equals((Object) (Object) ((qo) this).field_p.field_q)) {
                  stackOut_12_0 = qk.field_g;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  stackOut_11_0 = sk.field_a;
                  stackIn_13_0 = stackOut_11_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (dj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("qo.D(");
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
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_13_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Report abuse";
        field_A = 3;
        field_t = new String[]{"The darker squares around the edge of the grid are called the <col=ffff00>buffer zone</col>. They do not count as part of the picture.", "Use them to place awkward pieces half-on, half-off the grid."};
        field_w = new int[8192];
        field_o = 480;
        field_z = true;
        field_x = "Find opponents";
    }
}
