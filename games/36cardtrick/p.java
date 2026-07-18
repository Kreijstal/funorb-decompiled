/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class p extends cg {
    private fg field_o;
    static int field_k;
    static int field_l;
    private String field_j;
    static int[] field_n;
    private boolean field_m;

    final static de a(int param0, int param1) {
        de[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        de[] var5 = null;
        var4 = Main.field_T;
        int discarded$2 = 113;
        var5 = bg.v();
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var5.length) {
            return null;
          } else {
            if (param1 == var5[var3].field_a) {
              return var5[var3];
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    p(hf param0, hf param1) {
        super(param0);
        ((p) this).field_j = "";
        ((p) this).field_m = false;
        try {
            ((p) this).field_o = new fg(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "p.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        if (param0 != 0) {
            return;
        }
        field_n = null;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
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
              if (!param1) {
                break L1;
              } else {
                ((p) this).field_j = null;
                break L1;
              }
            }
            if (((p) this).field_o.a(param0, -79) == pe.field_b) {
              stackOut_4_0 = ((p) this).field_o.a(param0, param1);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (((p) this).a(param0, -99) != pe.field_b) {
                stackOut_9_0 = gi.field_g;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = bk.field_b;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("p.I(");
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
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final sg a(String param0, int param1) {
        lb var3 = null;
        RuntimeException var3_ref = null;
        sg stackIn_5_0 = null;
        sg stackIn_11_0 = null;
        sg stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        sg stackOut_4_0 = null;
        sg stackOut_10_0 = null;
        sg stackOut_15_0 = null;
        sg stackOut_14_0 = null;
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
              if (param1 < -58) {
                break L1;
              } else {
                p.g(126);
                break L1;
              }
            }
            if (((p) this).field_o.a(param0, -61) == pe.field_b) {
              stackOut_4_0 = pe.field_b;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L2: {
                if (!param0.equals((Object) (Object) ((p) this).field_j)) {
                  int discarded$2 = -125;
                  var3 = hg.a(param0);
                  if (!var3.a(640)) {
                    stackOut_10_0 = a.field_n;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    ((p) this).field_j = param0;
                    ((p) this).field_m = var3.b(640);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (((p) this).field_m) {
                  stackOut_15_0 = ii.field_e;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = pe.field_b;
                  stackIn_16_0 = stackOut_14_0;
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
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("p.M(");
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
          throw ma.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = -1;
    }
}
