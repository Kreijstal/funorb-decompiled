/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class kf extends ah {
    static hh field_p;
    private boolean field_n;
    static ee field_q;
    private String field_s;
    static int[] field_o;
    static n field_r;

    kf(ul param0) {
        super(param0);
        ((kf) this).field_n = false;
    }

    final void g(int param0) {
        try {
            ((kf) this).field_s = null;
            if (param0 != 22186) {
                String discarded$0 = ((kf) this).a((byte) -126, (String) null);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "kf.I(" + param0 + ')');
        }
    }

    final rf a(int param0, String param1) {
        RuntimeException var3 = null;
        lm var3_ref = null;
        rf stackIn_4_0 = null;
        rf stackIn_16_0 = null;
        rf stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        rf stackOut_3_0 = null;
        rf stackOut_15_0 = null;
        rf stackOut_21_0 = null;
        rf stackOut_19_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (!tg.a(87, (CharSequence) (Object) param1)) {
              stackOut_3_0 = ob.field_a;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  field_p = null;
                  break L1;
                }
              }
              L2: {
                if (!param1.equals((Object) (Object) ((kf) this).field_s)) {
                  L3: {
                    var3_ref = of.a(122, param1);
                    if (null == var3_ref) {
                      break L3;
                    } else {
                      if (null == var3_ref.field_f) {
                        ((kf) this).field_n = var3_ref.field_a;
                        ((kf) this).field_s = param1;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_15_0 = ug.field_c;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (!((kf) this).field_n) {
                  stackOut_21_0 = ob.field_a;
                  stackIn_22_0 = stackOut_21_0;
                  break L4;
                } else {
                  stackOut_19_0 = df.field_h;
                  stackIn_22_0 = stackOut_19_0;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("kf.G(").append(param0).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_22_0;
    }

    final static int a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        try {
          L0: {
            if (param1 == 0) {
              stackOut_3_0 = param2;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1 == 1) {
                stackOut_8_0 = param2;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (param1 == 2) {
                  stackOut_13_0 = 100 * param2;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                } else {
                  if (param0 > 5) {
                    if (param1 != 3) {
                      stackOut_21_0 = param2;
                      stackIn_22_0 = stackOut_21_0;
                      break L0;
                    } else {
                      stackOut_19_0 = param2 * 100;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0;
                    }
                  } else {
                    stackOut_16_0 = 107;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "kf.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_22_0;
    }

    final static om a(byte param0, int param1) {
        om[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        om stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        om stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            var2 = vh.e(-91);
            var3 = 2 % ((3 - param0) / 49);
            var4 = 0;
            L1: while (true) {
              L2: {
                if (~var2.length >= ~var4) {
                  break L2;
                } else {
                  if (param1 != var2[var4].field_f) {
                    var4++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  } else {
                    stackOut_4_0 = var2[var4];
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0;
                  }
                }
              }
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2_ref, "kf.H(" + param0 + ',' + param1 + ')');
        }
        return (om) (Object) stackIn_8_0;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        lm var5 = null;
        String stackIn_2_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        String stackOut_16_0 = null;
        String stackOut_14_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var3 = ok.a(0, (CharSequence) (Object) param1);
            var4 = 4 / ((param0 - 10) / 51);
            if (null == var3) {
              L1: {
                if (!param1.equals((Object) (Object) ((kf) this).field_s)) {
                  L2: {
                    var5 = of.a(122, param1);
                    if (null == var5) {
                      break L2;
                    } else {
                      if (var5.field_f == null) {
                        ((kf) this).field_n = var5.field_a;
                        ((kf) this).field_s = param1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  return (String) (Object) stackIn_11_0;
                } else {
                  break L1;
                }
              }
              if (((kf) this).field_n) {
                stackOut_16_0 = fd.field_b;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_14_0 = vn.field_b;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              }
            } else {
              stackOut_1_0 = (String) var3;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("kf.L(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_17_0;
    }

    public static void c(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_q = null;
              field_r = null;
              if (param0 == 0) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            field_p = null;
            field_o = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "kf.F(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[4];
        field_q = new ee("email");
    }
}
