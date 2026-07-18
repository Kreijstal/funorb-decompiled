/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lg {
    private java.util.zip.Inflater field_a;
    static int[][] field_b;
    static me field_e;
    static String field_c;
    static int field_d;

    final static void a(int param0, kl param1) {
        wk var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new wk(param1.a("", 49, "final_frame.jpg"), (java.awt.Component) (Object) si.field_b);
            var3 = var2.field_y;
            var4 = var2.field_v;
            int discarded$0 = -56;
            rq.a();
            wd.field_k = new wk(var3, 3 * var4 / 4);
            wd.field_k.b();
            var2.f(0, 0);
            vt.field_k = new wk(var3, var4 + -wd.field_k.field_v);
            vt.field_k.b();
            var2.f(0, -wd.field_k.field_v);
            vt.field_k.field_z = wd.field_k.field_v;
            rf.b(-18862);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "lg.A(" + 32381 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public lg() {
        this(-1, 1000000, 1000000);
    }

    final static hl a(String param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        hl var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        hl stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        hl stackOut_18_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (nh.field_K != null) {
            if (param0 != null) {
              if (0 != param0.length()) {
                L0: {
                  var6 = (CharSequence) (Object) param0;
                  int discarded$4 = 0;
                  var2 = k.a(var6);
                  if (param1 == -34) {
                    break L0;
                  } else {
                    lg.a((byte) 5);
                    break L0;
                  }
                }
                if (var2 != null) {
                  var3 = (hl) (Object) nh.field_K.a((byte) -27, (long)var2.hashCode());
                  L1: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_Mb;
                      int discarded$5 = 0;
                      var4 = k.a(var7);
                      if (var4.equals((Object) (Object) var2)) {
                        stackOut_18_0 = (hl) var3;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        var3 = (hl) (Object) nh.field_K.d(-348);
                        continue L1;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (hl) (Object) stackIn_7_0;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref;
            stackOut_22_1 = new StringBuilder().append("lg.D(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ')');
        }
    }

    private lg(int param0, int param1, int param2) {
    }

    final void a(byte param0, vh param1, byte[] param2) {
        try {
            Exception exception = null;
            RuntimeException var4 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
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
                  if (param1.field_o[param1.field_q] != 31) {
                    break L1;
                  } else {
                    if (-117 == param1.field_o[param1.field_q + 1]) {
                      L2: {
                        if (null != ((lg) this).field_a) {
                          break L2;
                        } else {
                          ((lg) this).field_a = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          ((lg) this).field_a.setInput(param1.field_o, param1.field_q + 10, param1.field_o.length + (-10 + -param1.field_q + -8));
                          int discarded$2 = ((lg) this).field_a.inflate(param2);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        ((lg) this).field_a.reset();
                        throw new RuntimeException("");
                      }
                      ((lg) this).field_a.reset();
                      if (param0 == -71) {
                        break L0;
                      } else {
                        ((lg) this).field_a = null;
                        return;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_12_0 = (RuntimeException) var4;
                stackOut_12_1 = new StringBuilder().append("lg.C(").append(param0).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param1 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L4;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L4;
                }
              }
              L5: {
                stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param2 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L5;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L5;
                }
              }
              throw ig.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(String param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param2 < -40) {
              if (param1) {
                stackOut_6_0 = ir.field_h.a(param0);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = sc.field_b.a(param0);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -71;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("lg.E(");
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
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_e = null;
        field_b = null;
        if (param0 < 78) {
          var2 = null;
          hl discarded$2 = lg.a((String) null, (byte) 37);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new me(9, 0, 4, 1);
        field_c = "Skip battles: ";
    }
}
