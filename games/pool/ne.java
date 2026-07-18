/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ne extends ig {
    static int field_w;
    static int field_q;
    static int field_v;
    static ko field_r;
    private sl field_p;
    static int field_s;
    static volatile int field_o;
    static int field_m;
    static od field_u;
    static dd[] field_t;
    static int field_n;

    final na a(String param0, boolean param1) {
        ip var3 = null;
        RuntimeException var3_ref = null;
        na stackIn_6_0 = null;
        na stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        na stackOut_5_0 = null;
        na stackOut_9_0 = null;
        na stackOut_8_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((ne) this).field_p = null;
                break L1;
              }
            }
            L2: {
              if (!(((ne) this).field_p instanceof sc)) {
                break L2;
              } else {
                var3 = ((sc) (Object) ((ne) this).field_p).a(83);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.c(-31873) == kr.field_e) {
                    break L2;
                  } else {
                    stackOut_5_0 = gp.field_d;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0;
                  }
                }
              }
            }
            L3: {
              if (param0.equals((Object) (Object) ((ne) this).field_p.field_m)) {
                stackOut_9_0 = kr.field_e;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = gp.field_d;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ne.K(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    public static void b(byte param0) {
        field_u = null;
        field_r = null;
        field_t = null;
    }

    final String a(String param0, int param1) {
        ip var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_11_0 = null;
        String stackOut_15_0 = null;
        Object stackOut_1_0 = null;
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
            if (param1 == 0) {
              L1: {
                if (((ne) this).field_p instanceof sc) {
                  var3 = ((sc) (Object) ((ne) this).field_p).a(-11);
                  if (var3 == null) {
                    break L1;
                  } else {
                    L2: {
                      if (var3.c(-31873) != kr.field_e) {
                        break L2;
                      } else {
                        if (!param0.equals((Object) (Object) ((ne) this).field_p.field_m)) {
                          stackOut_9_0 = rk.field_i;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_11_0 = var3.a(73);
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                } else {
                  break L1;
                }
              }
              if (!param0.equals((Object) (Object) ((ne) this).field_p.field_m)) {
                stackOut_15_0 = rk.field_i;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("ne.L(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    ne(sl param0, sl param1) {
        super(param0);
        try {
            ((ne) this).field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ne.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 12;
        field_s = 0;
        field_o = 0;
        field_r = new ko();
        field_m = -1;
        field_n = -1;
    }
}
