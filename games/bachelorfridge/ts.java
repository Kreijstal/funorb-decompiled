/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ts extends td {
    static sna field_r;
    static String field_q;
    static String field_p;

    ts(int param0, aga param1, nq param2) {
        super(param0, param1);
        try {
            ((ts) this).field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ts.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Frame a(int param0, ht param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        lba[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        lba[] var10 = null;
        eh var11 = null;
        Object stackIn_7_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_20_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            if (param1.b(34)) {
              L1: {
                if (0 != param5) {
                  break L1;
                } else {
                  var10 = we.a((byte) -57, param1);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_14_0 = null;
                          stackIn_15_0 = stackOut_14_0;
                          return (java.awt.Frame) (Object) stackIn_15_0;
                        }
                      } else {
                        L3: {
                          if (var10[var8].field_d != param2) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (java.awt.Frame) (Object) stackIn_7_0;
                  }
                }
              }
              var11 = param1.a(param5, param2, 126, param0, 0);
              L4: while (true) {
                if (var11.field_f != 0) {
                  var7 = (java.awt.Frame) var11.field_e;
                  if (var7 != null) {
                    if (2 == var11.field_f) {
                      gv.a(-111, param1, var7);
                      stackOut_24_0 = null;
                      stackIn_25_0 = stackOut_24_0;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackOut_20_0 = null;
                    stackIn_21_0 = stackOut_20_0;
                    return (java.awt.Frame) (Object) stackIn_21_0;
                  }
                } else {
                  gda.a(false, 10L);
                  continue L4;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("ts.C(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param2 + ',' + 0 + ',' + 2 + ',' + param5 + ')');
        }
        return (java.awt.Frame) (Object) stackIn_25_0;
    }

    public static void c(boolean param0) {
        field_p = null;
        field_q = null;
        field_r = null;
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        aga var4 = null;
        lca var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_2_0 = null;
        ew stackIn_5_0 = null;
        lca stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        lca stackOut_6_0 = null;
        ew stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 == 3) {
              var3 = ((ts) this).field_h.a(61, param0);
              var4 = ((ts) this).field_j.a(param1 ^ 96, param0);
              if (var4 != null) {
                var5 = new lca(((ts) this).field_g, new nq(var3), ((ts) this).field_j);
                var6 = var4.c(param1 ^ 119);
                var7 = kla.a(var6, param0.field_w, param1 + 2147483645);
                var5.field_o.a((bw) (Object) new ela(new nq(var4), var7), true);
                stackOut_6_0 = (lca) var5;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = new ew(new nq(var3));
                stackIn_5_0 = stackOut_4_0;
                return (ii) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ii) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("ts.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Real-life threats";
        field_p = "OFFERED DRAW";
    }
}
