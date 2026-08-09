/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static String field_b;
    static long field_c;
    static ln field_a;

    final static li a(String param0, la param1, la param2, boolean param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        li stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = param1.a(-1, param0);
              var6 = param1.a(param4, -107, var5_int);
              if (!param3) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = ao.a(-97, var5_int, var6, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("dc.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              aq.field_c = false;
              cf.field_f = false;
              if (gn.field_m == null) {
                break L1;
              } else {
                if (!gn.field_m.field_D) {
                  break L1;
                } else {
                  L2: {
                    if (-9 != (param0 ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        if (!ff.field_a) {
                          param1 = cl.field_c;
                          break L3;
                        } else {
                          param1 = un.field_a;
                          break L3;
                        }
                      }
                      param0 = 2;
                      un.field_k.a(-78, eo.field_a);
                      break L2;
                    }
                  }
                  L4: {
                    var3_int = 1;
                    if ((param0 ^ -1) != -11) {
                      break L4;
                    } else {
                      var3_int = 0;
                      d.d((byte) -77);
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int != 0) {
                      L6: {
                        if (!cf.field_f) {
                          break L6;
                        } else {
                          param1 = ff.a(new String[]{param1}, param2 ^ 2, jg.field_w);
                          break L6;
                        }
                      }
                      L7: {
                        if (!nk.field_t) {
                          break L7;
                        } else {
                          param1 = pn.field_a;
                          break L7;
                        }
                      }
                      gn.field_m.a(param0, param1, param2 ^ -259);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if ((param0 ^ -1) == -257) {
                    break L1;
                  } else {
                    if ((param0 ^ -1) == -11) {
                      break L1;
                    } else {
                      if (!ff.field_a) {
                        un.field_k.h(16180);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            if (param2 == 2) {
              break L0;
            } else {
              field_a = (ln) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("dc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
        }
    }

    final static boolean b(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (!param0) {
          L0: {
            field_b = (String) null;
            if (kh.field_o != mg.field_b) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (kh.field_o != mg.field_b) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            return;
        }
        field_b = null;
    }

    static {
        field_b = "To server list";
    }
}
