/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class mp extends vo {
    static pa field_h;
    static String field_e;
    private boolean field_f;
    static volatile int field_g;
    private String field_i;

    final pt a(String param0, int param1) {
        fr var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        CharSequence var5 = null;
        pt stackIn_3_0 = null;
        pt stackIn_12_0 = null;
        pt stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        pt stackOut_2_0 = null;
        pt stackOut_11_0 = null;
        pt stackOut_16_0 = null;
        pt stackOut_15_0 = null;
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
            var5 = (CharSequence) (Object) param0;
            if (!qf.a(var5, 0)) {
              stackOut_2_0 = bt.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1 == 8192) {
                  break L1;
                } else {
                  var4 = null;
                  String discarded$2 = ((mp) this).a((String) null, (byte) -114);
                  break L1;
                }
              }
              L2: {
                if (!param0.equals((Object) (Object) ((mp) this).field_i)) {
                  L3: {
                    var3 = hg.a(param1 ^ 2147475455, param0);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var3.field_f != null) {
                        break L3;
                      } else {
                        ((mp) this).field_f = var3.field_b;
                        ((mp) this).field_i = param0;
                        break L2;
                      }
                    }
                  }
                  stackOut_11_0 = ce.field_t;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (!((mp) this).field_f) {
                  stackOut_16_0 = bt.field_a;
                  stackIn_17_0 = stackOut_16_0;
                  break L4;
                } else {
                  stackOut_15_0 = fd.field_a;
                  stackIn_17_0 = stackOut_15_0;
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
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("mp.DA(");
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
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
        }
        return stackIn_17_0;
    }

    mp(bm param0) {
        super(param0);
        ((mp) this).field_f = false;
    }

    public static void c(byte param0) {
        if (param0 != -11) {
            mp.c((byte) -28);
            field_e = null;
            field_h = null;
            return;
        }
        field_e = null;
        field_h = null;
    }

    final void e(int param0) {
        ((mp) this).field_i = null;
        if (param0 >= -86) {
            mp.c((byte) 34);
        }
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        fr var4 = null;
        CharSequence var5 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        String stackOut_17_0 = null;
        String stackOut_15_0 = null;
        String stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (param1 == 72) {
              var5 = (CharSequence) (Object) param0;
              var3 = ee.a(var5, 0);
              if (var3 == null) {
                L1: {
                  if (!param0.equals((Object) (Object) ((mp) this).field_i)) {
                    var4 = hg.a(2147483647, param0);
                    if (var4 != null) {
                      if (var4.field_f == null) {
                        ((mp) this).field_f = var4.field_b;
                        ((mp) this).field_i = param0;
                        break L1;
                      } else {
                        stackOut_11_0 = null;
                        stackIn_12_0 = stackOut_11_0;
                        return (String) (Object) stackIn_12_0;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    break L1;
                  }
                }
                if (((mp) this).field_f) {
                  stackOut_17_0 = dk.field_k;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  stackOut_15_0 = tb.field_e;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                }
              } else {
                stackOut_4_0 = (String) var3;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("mp.EA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
        return stackIn_18_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Loading...";
        field_g = 0;
    }
}
