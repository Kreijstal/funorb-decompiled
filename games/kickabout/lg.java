/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lg implements l {
    static ut field_a;
    static String field_c;
    private long field_b;

    abstract rv a(boolean param0);

    final static byte[] a(Object param0, boolean param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        pf var4 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_13_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_12_0 = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          if (param0 != null) {
            if (param0 instanceof byte[]) {
              var3 = (byte[]) param0;
              if (param1) {
                stackOut_8_0 = vq.a(70, var3);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                stackOut_6_0 = (byte[]) var3;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              if (param0 instanceof pf) {
                var4 = (pf) param0;
                stackOut_12_0 = var4.a(2);
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              } else {
                if (param2 == 18828) {
                  throw new IllegalArgumentException();
                } else {
                  stackOut_15_0 = null;
                  stackIn_16_0 = stackOut_15_0;
                  return (byte[]) (Object) stackIn_16_0;
                }
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("lg.W(");
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
              break L0;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L0;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final String b(int param0) {
        if (!((lg) this).a((byte) -28)) {
          if (param0 <= -23) {
            if (~nj.a(37) > ~(350L + ((lg) this).field_b)) {
              return null;
            } else {
              return ((lg) this).e(-1);
            }
          } else {
            field_c = null;
            if (~nj.a(37) > ~(350L + ((lg) this).field_b)) {
              return null;
            } else {
              return ((lg) this).e(-1);
            }
          }
        } else {
          return null;
        }
    }

    public final rv c(int param0) {
        if (((lg) this).a((byte) -28)) {
          return os.field_l;
        } else {
          if (nj.a(-104) >= 350L + ((lg) this).field_b) {
            if (param0 != -24407) {
              field_a = null;
              return ((lg) this).a(false);
            } else {
              return ((lg) this).a(false);
            }
          } else {
            return mn.field_c;
          }
        }
    }

    public static void d(int param0) {
        field_c = null;
        if (param0 != 350) {
            return;
        }
        field_a = null;
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() < aq.field_c) {
                  break L1;
                } else {
                  if (param0.length() > ko.field_c) {
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("lg.T(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 79 + 41);
        }
        return stackIn_5_0 != 0;
    }

    public final void a(int param0) {
        ((lg) this).field_b = nj.a(-122);
        int var2 = 76 % ((42 - param0) / 58);
    }

    final static js a(int param0, int param1) {
        if (!(param0 != -1)) {
            return (js) (Object) um.field_e;
        }
        if (!(param0 != -2)) {
            return (js) (Object) sr.field_l;
        }
        if (!(param0 != -3)) {
            return (js) (Object) new kt();
        }
        if (param0 == -5) {
            return (js) (Object) new e();
        }
        if (!(0 <= param0)) {
            throw new IllegalStateException();
        }
        return (js) (Object) rn.a(-118, param0);
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
