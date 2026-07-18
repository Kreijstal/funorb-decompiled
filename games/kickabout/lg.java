/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lg implements l {
    static ut field_a;
    static String field_c;
    private long field_b;

    abstract rv a(boolean param0);

    final static byte[] a(Object param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        byte[] var3_array = null;
        pf var3_ref = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_11_0 = null;
        byte[] stackOut_9_0 = null;
        byte[] stackOut_16_0 = null;
        Object stackOut_19_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          if (null == param0) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          } else {
            if (param0 instanceof byte[]) {
              var3_array = (byte[]) param0;
              if (param1) {
                stackOut_11_0 = vq.a(70, var3_array);
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                stackOut_9_0 = (byte[]) var3_array;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              }
            } else {
              if (param0 instanceof pf) {
                var3_ref = (pf) param0;
                stackOut_16_0 = var3_ref.a(2);
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0;
              } else {
                if (param2 == 18828) {
                  throw new IllegalArgumentException();
                } else {
                  stackOut_19_0 = null;
                  stackIn_20_0 = stackOut_19_0;
                  return (byte[]) (Object) stackIn_20_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("lg.W(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L0;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L0;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String b(int param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        String stackOut_11_0 = null;
        Object stackOut_9_0 = null;
        try {
          L0: {
            if (((lg) this).a((byte) -28)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            } else {
              L1: {
                if (param0 <= -23) {
                  break L1;
                } else {
                  field_c = null;
                  break L1;
                }
              }
              if (~nj.a(37) <= ~(350L + ((lg) this).field_b)) {
                stackOut_11_0 = ((lg) this).e(-1);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (String) (Object) stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "lg.AA(" + param0 + ')');
        }
        return stackIn_12_0;
    }

    public final rv c(int param0) {
        RuntimeException var2 = null;
        rv stackIn_4_0 = null;
        rv stackIn_7_0 = null;
        rv stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        rv stackOut_3_0 = null;
        rv stackOut_11_0 = null;
        rv stackOut_6_0 = null;
        try {
          L0: {
            if (((lg) this).a((byte) -28)) {
              stackOut_3_0 = os.field_l;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (nj.a(-104) >= 350L + ((lg) this).field_b) {
                L1: {
                  if (param0 == -24407) {
                    break L1;
                  } else {
                    field_a = null;
                    break L1;
                  }
                }
                stackOut_11_0 = ((lg) this).a(false);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_6_0 = mn.field_c;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "lg.BA(" + param0 + ')');
        }
        return stackIn_12_0;
    }

    public static void d(int param0) {
        field_c = null;
        if (param0 != 350) {
            return;
        }
        try {
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "lg.U(" + param0 + ')');
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 79) {
                break L1;
              } else {
                byte[] discarded$2 = lg.a((Object) null, true, -58);
                break L1;
              }
            }
            L2: {
              if (null == param0) {
                break L2;
              } else {
                if (param0.length() < aq.field_c) {
                  break L2;
                } else {
                  if (~param0.length() < ~ko.field_c) {
                    break L2;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_12_0 = 1;
            stackIn_13_0 = stackOut_12_0;
            return stackIn_13_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("lg.T(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_15_0 != 0;
    }

    public final void a(int param0) {
        try {
            ((lg) this).field_b = nj.a(-122);
            int var2_int = 76 % ((42 - param0) / 58);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "lg.V(" + param0 + ')');
        }
    }

    final static js a(int param0, int param1) {
        RuntimeException var2 = null;
        ap stackIn_4_0 = null;
        lm stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        kt stackIn_17_0 = null;
        e stackIn_20_0 = null;
        qt stackIn_26_0 = null;
        RuntimeException decompiledCaughtException = null;
        ap stackOut_3_0 = null;
        lm stackOut_8_0 = null;
        kt stackOut_16_0 = null;
        qt stackOut_25_0 = null;
        e stackOut_19_0 = null;
        Object stackOut_11_0 = null;
        try {
          L0: {
            if (param0 == -1) {
              stackOut_3_0 = um.field_e;
              stackIn_4_0 = stackOut_3_0;
              return (js) (Object) stackIn_4_0;
            } else {
              if (param0 == -2) {
                stackOut_8_0 = sr.field_l;
                stackIn_9_0 = stackOut_8_0;
                return (js) (Object) stackIn_9_0;
              } else {
                if (param1 == 24939) {
                  if (param0 == -3) {
                    stackOut_16_0 = new kt();
                    stackIn_17_0 = stackOut_16_0;
                    return (js) (Object) stackIn_17_0;
                  } else {
                    if (param0 != -5) {
                      if (0 > param0) {
                        throw new IllegalStateException();
                      } else {
                        stackOut_25_0 = rn.a(-118, param0);
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      }
                    } else {
                      stackOut_19_0 = new e();
                      stackIn_20_0 = stackOut_19_0;
                      return (js) (Object) stackIn_20_0;
                    }
                  }
                } else {
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  return (js) (Object) stackIn_12_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "lg.CA(" + param0 + ',' + param1 + ')');
        }
        return (js) (Object) stackIn_26_0;
    }

    abstract String e(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Records";
        field_a = new ut(926, 1374);
    }
}
