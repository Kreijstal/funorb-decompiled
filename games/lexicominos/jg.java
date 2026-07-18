/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class jg extends tj {
    private g field_o;
    private boolean field_l;
    private String field_n;
    static db field_m;

    jg(rl param0, rl param1) {
        super(param0);
        ((jg) this).field_n = "";
        ((jg) this).field_l = false;
        try {
            ((jg) this).field_o = new g(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "jg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_9_0 = null;
        String stackOut_5_0 = null;
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
            if (((jg) this).field_o.a(0, param1) == ni.field_b) {
              stackOut_2_0 = ((jg) this).field_o.a((byte) -126, param1);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (((jg) this).a(param0 ^ -126, param1) != ni.field_b) {
                L1: {
                  if (param0 == -126) {
                    break L1;
                  } else {
                    ((jg) this).field_n = null;
                    break L1;
                  }
                }
                stackOut_9_0 = fj.field_x;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_5_0 = me.field_t;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("jg.F(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final static mb c(boolean param0) {
        if (bk.field_c == c.field_m) {
            throw new IllegalStateException();
        }
        if (!(c.field_o != bk.field_c)) {
            bk.field_c = c.field_m;
            return li.field_T;
        }
        return null;
    }

    final static db[] a(int param0, int param1) {
        db[] var3 = new db[9];
        db[] var2 = var3;
        var3[4] = gf.a((byte) -76, 64, param0);
        return var2;
    }

    public static void e(int param0) {
        if (param0 != -25048) {
            jg.e(-58);
            field_m = null;
            return;
        }
        field_m = null;
    }

    final sc a(int param0, String param1) {
        la var3 = null;
        RuntimeException var3_ref = null;
        sc stackIn_3_0 = null;
        sc stackIn_7_0 = null;
        sc stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        sc stackOut_2_0 = null;
        sc stackOut_6_0 = null;
        sc stackOut_11_0 = null;
        sc stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((jg) this).field_o.a(param0, param1) == ni.field_b) {
              stackOut_2_0 = ni.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1.equals((Object) (Object) ((jg) this).field_n)) {
                  break L1;
                } else {
                  var3 = ua.a(param1, 99);
                  if (var3.b(12)) {
                    ((jg) this).field_n = param1;
                    ((jg) this).field_l = var3.a(12);
                    break L1;
                  } else {
                    stackOut_6_0 = be.field_q;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                }
              }
              L2: {
                if (((jg) this).field_l) {
                  stackOut_11_0 = rh.field_p;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = ni.field_b;
                  stackIn_12_0 = stackOut_10_0;
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
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("jg.H(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    static {
    }
}
