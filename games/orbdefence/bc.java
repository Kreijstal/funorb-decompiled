/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class bc extends hi {
    private String field_p;
    static int[] field_o;
    static String[] field_t;
    static hj[] field_q;
    private boolean field_n;
    static String field_s;
    static int field_r;

    final qd a(String param0, byte param1) {
        qj var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        qd stackIn_3_0 = null;
        qd stackIn_9_0 = null;
        qd stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        qd stackOut_2_0 = null;
        qd stackOut_8_0 = null;
        qd stackOut_15_0 = null;
        qd stackOut_14_0 = null;
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
            var4 = (CharSequence) (Object) param0;
            int discarded$11 = 5408;
            if (!dk.a(var4)) {
              stackOut_2_0 = vh.field_h;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0.equals((Object) (Object) ((bc) this).field_p)) {
                  break L1;
                } else {
                  L2: {
                    int discarded$12 = 1;
                    var3 = lf.a(param0);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (var3.field_e != null) {
                        break L2;
                      } else {
                        ((bc) this).field_n = var3.field_f;
                        ((bc) this).field_p = param0;
                        break L1;
                      }
                    }
                  }
                  stackOut_8_0 = uj.field_b;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
              L3: {
                if (param1 == -99) {
                  break L3;
                } else {
                  ((bc) this).b((byte) -37);
                  break L3;
                }
              }
              L4: {
                if (((bc) this).field_n) {
                  stackOut_15_0 = nc.field_bb;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = vh.field_h;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("bc.C(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 41);
        }
        return stackIn_16_0;
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        qj var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_14_0 = null;
        String stackOut_3_0 = null;
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
              if (param0 == -11300) {
                break L1;
              } else {
                field_s = null;
                break L1;
              }
            }
            var5 = (CharSequence) (Object) param1;
            var3 = ki.a(-1, var5);
            if (var3 == null) {
              L2: {
                if (param1.equals((Object) (Object) ((bc) this).field_p)) {
                  break L2;
                } else {
                  int discarded$2 = 1;
                  var4 = lf.a(param1);
                  if (var4 != null) {
                    if (var4.field_e == null) {
                      ((bc) this).field_n = var4.field_f;
                      ((bc) this).field_p = param1;
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (!((bc) this).field_n) {
                stackOut_14_0 = j.field_c;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                return kf.field_b;
              }
            } else {
              stackOut_3_0 = (String) var3;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("bc.B(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_15_0;
    }

    public static void c() {
        field_t = null;
        field_s = null;
        field_o = null;
        field_q = null;
    }

    bc(vi param0) {
        super(param0);
        ((bc) this).field_n = false;
    }

    final void b(byte param0) {
        ((bc) this).field_p = null;
        if (param0 <= 59) {
            field_t = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Type your email address again to make sure it's correct";
    }
}
