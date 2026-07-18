/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ha extends di {
    static String field_m;
    static int field_q;
    static int[] field_s;
    static boolean field_o;
    private boolean field_u;
    static o field_n;
    private mg field_r;
    static int field_p;
    private String field_t;

    final im b(String param0, int param1) {
        ec var3 = null;
        RuntimeException var3_ref = null;
        im stackIn_3_0 = null;
        im stackIn_9_0 = null;
        im stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        im stackOut_2_0 = null;
        im stackOut_8_0 = null;
        im stackOut_13_0 = null;
        im stackOut_12_0 = null;
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
            if (((ha) this).field_r.b(param0, param1) == qf.field_d) {
              stackOut_2_0 = qf.field_d;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (!param0.equals((Object) (Object) ((ha) this).field_t)) {
                  var3 = ei.a(-110, param0);
                  if (!var3.a(-72)) {
                    stackOut_8_0 = oh.field_b;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  } else {
                    ((ha) this).field_t = param0;
                    ((ha) this).field_u = var3.a(true);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!((ha) this).field_u) {
                  stackOut_13_0 = qf.field_d;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                } else {
                  stackOut_12_0 = dg.field_c;
                  stackIn_14_0 = stackOut_12_0;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("ha.C(");
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
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    final String a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_7_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (((ha) this).field_r.b(param0, 0) == qf.field_d) {
              stackOut_2_0 = ((ha) this).field_r.a(param0, -85);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (((ha) this).b(param0, 0) != qf.field_d) {
                var3_int = -41 % ((param1 - 26) / 56);
                stackOut_7_0 = vd.field_p;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = fl.field_a;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ha.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final static void a(eg param0, int param1, byte param2) {
        try {
            ic.field_s.a((uf) (Object) param0, -16611);
            qc.a(4, param0, (byte) 118);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ha.D(" + (param0 != null ? "{...}" : "null") + ',' + 4 + ',' + 80 + ')');
        }
    }

    final static void a(int param0, uf param1, uf param2) {
        try {
            if (null != param2.field_a) {
                param2.b((byte) 12);
            }
            if (param0 <= 63) {
                field_p = 107;
            }
            param2.field_a = param1.field_a;
            param2.field_d = param1;
            param2.field_a.field_d = param2;
            param2.field_d.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ha.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ha(ej param0, ej param1) {
        super(param0);
        ((ha) this).field_u = false;
        ((ha) this).field_t = "";
        try {
            ((ha) this).field_r = new mg(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_n = null;
        field_m = null;
        field_s = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 0;
        field_m = "Aimed Accuracy: ";
        field_o = false;
        field_n = new o();
    }
}
