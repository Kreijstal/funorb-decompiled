/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class n extends hi {
    static vl field_v;
    static boolean field_o;
    private boolean field_r;
    static cb field_t;
    private String field_u;
    static int field_s;
    static bd field_q;
    static String[] field_p;

    final bm a(String param0, byte param1) {
        jj var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        bm stackIn_3_0 = null;
        bm stackIn_9_0 = null;
        bm stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        bm stackOut_2_0 = null;
        bm stackOut_8_0 = null;
        bm stackOut_13_0 = null;
        bm stackOut_12_0 = null;
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
            var4 = (CharSequence) (Object) param0;
            if (!oc.a(var4, 1)) {
              stackOut_2_0 = bi.field_d;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0.equals((Object) (Object) ((n) this).field_u)) {
                  break L1;
                } else {
                  L2: {
                    var3 = ph.a(param0, -79);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (null == var3.field_l) {
                        ((n) this).field_u = param0;
                        ((n) this).field_r = var3.field_b;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_8_0 = m.field_n;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
              L3: {
                var3_int = -71 % ((param1 - 3) / 42);
                if (((n) this).field_r) {
                  stackOut_13_0 = nd.field_d;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = bi.field_d;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("n.L(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
        }
        return stackIn_14_0;
    }

    public static void d(byte param0) {
        field_t = null;
        field_p = null;
        field_q = null;
        if (param0 != -69) {
            n.d((byte) 14);
            field_v = null;
            return;
        }
        field_v = null;
    }

    n(ig param0) {
        super(param0);
        ((n) this).field_r = false;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        jj var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        Object stackOut_9_0 = null;
        String stackOut_15_0 = null;
        String stackOut_13_0 = null;
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
            var6 = (CharSequence) (Object) param1;
            var3 = ml.a((byte) -110, var6);
            var4 = -71 / ((param0 - -24) / 35);
            if (var3 != null) {
              stackOut_2_0 = (String) var3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (!param1.equals((Object) (Object) ((n) this).field_u)) {
                  var5 = ph.a(param1, -86);
                  if (var5 != null) {
                    if (null == var5.field_l) {
                      ((n) this).field_u = param1;
                      ((n) this).field_r = var5.field_b;
                      break L1;
                    } else {
                      stackOut_9_0 = null;
                      stackIn_10_0 = stackOut_9_0;
                      return (String) (Object) stackIn_10_0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (((n) this).field_r) {
                stackOut_15_0 = kj.field_a;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_13_0 = om.field_f;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("n.K(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    final static void b(boolean param0, byte param1) {
        if (param1 < -86) {
          mb.field_s.a(500, 8000);
          if (jh.field_ab == 1) {
            jn.l(0);
            if (!param0) {
              db.a(false, 256, dg.field_tb);
              return;
            } else {
              db.a(true, 256, vg.field_h);
              db.a(false, 256, dg.field_tb);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void f(int param0) {
        ((n) this).field_u = null;
        if (param0 != -2) {
            n.d((byte) 54);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = false;
        field_v = new vl();
        field_p = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
