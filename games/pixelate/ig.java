/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static tc field_d;
    static io field_e;
    static String field_c;
    static tf[][] field_a;
    static fm field_b;

    final static String a(int param0, char param1) {
        return String.valueOf(param1);
    }

    final static id a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        id stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        id stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_1_0 = null;
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
            if (qo.field_n != rj.field_F) {
              L1: {
                if (qo.field_n != h.field_N) {
                  break L1;
                } else {
                  if (!param1.equals((Object) (Object) uh.field_m)) {
                    break L1;
                  } else {
                    qo.field_n = wm.field_a;
                    stackOut_5_0 = jc.field_f;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0;
                  }
                }
              }
              qo.field_n = rj.field_F;
              uh.field_m = param1;
              jc.field_f = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (id) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("ig.A(").append(200).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return (id) (Object) stackIn_8_0;
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        int var1 = 0;
        field_e = null;
        field_d = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        cm var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              to.field_t.b();
              ib.field_h.b();
              var1_int = -1;
              e.field_a = e.field_a - 1;
              if (e.field_a != 0) {
                break L1;
              } else {
                e.field_a = 200;
                var2 = (cm) (Object) bo.field_d.c(1504642273);
                L2: while (true) {
                  if (var2 == null) {
                    if (rg.field_b != null) {
                      var2 = (cm) (Object) rg.field_b.c(1504642273);
                      L3: while (true) {
                        if (var2 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (var2.field_k.b(0)) {
                              break L4;
                            } else {
                              var2.c(2779);
                              break L4;
                            }
                          }
                          var2 = (cm) (Object) rg.field_b.f(1504642273);
                          continue L3;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L5: {
                      if (!var2.field_k.b(0)) {
                        var2.c(2779);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var2 = (cm) (Object) bo.field_d.f(1504642273);
                    continue L2;
                  }
                }
              }
            }
            L6: {
              if (null == to.field_q) {
                break L6;
              } else {
                if (to.field_q.a((byte) -123)) {
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "ig.B(" + -56 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "OK";
        field_e = new io("email");
    }
}
