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
        if (param0 < 123) {
            return (String) null;
        }
        return String.valueOf(param1);
    }

    final static id a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        id stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        id stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_3_0 = null;
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
              if (param0 == 200) {
                break L1;
              } else {
                field_b = (fm) null;
                break L1;
              }
            }
            if (qo.field_n != rj.field_F) {
              L2: {
                if (qo.field_n != h.field_N) {
                  break L2;
                } else {
                  if (!param1.equals(uh.field_m)) {
                    break L2;
                  } else {
                    qo.field_n = wm.field_a;
                    stackOut_7_0 = jc.field_f;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              qo.field_n = rj.field_F;
              uh.field_m = param1;
              jc.field_f = null;
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("ig.A(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (id) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return (id) ((Object) stackIn_10_0);
          }
        }
    }

    public static void a(byte param0) {
        field_a = (tf[][]) null;
        field_c = null;
        field_b = null;
        int var1 = 113 % ((-66 - param0) / 54);
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
              var1_int = -121 % ((param0 - 54) / 39);
              e.field_a = e.field_a - 1;
              if (e.field_a != 0) {
                break L1;
              } else {
                e.field_a = 200;
                var2 = (cm) ((Object) bo.field_d.c(1504642273));
                L2: while (true) {
                  if (var2 == null) {
                    if (rg.field_b != null) {
                      var2 = (cm) ((Object) rg.field_b.c(1504642273));
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
                          var2 = (cm) ((Object) rg.field_b.f(1504642273));
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
                    var2 = (cm) ((Object) bo.field_d.f(1504642273));
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
          throw aa.a((Throwable) ((Object) var1), "ig.B(" + param0 + ')');
        }
    }

    static {
        field_c = "OK";
        field_e = new io("email");
    }
}
