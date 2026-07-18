/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    private ng field_a;
    static String field_b;
    static int field_g;
    static String field_d;
    private kd field_c;
    static long field_f;
    static long field_e;

    final kd b(int param0) {
        kd var2 = null;
        var2 = ((ta) this).field_a.field_b.field_c;
        if (((ta) this).field_a.field_b == var2) {
          ((ta) this).field_c = null;
          return null;
        } else {
          if (param0 != 0) {
            kd discarded$2 = ((ta) this).b(91);
            ((ta) this).field_c = var2.field_c;
            return var2;
          } else {
            ((ta) this).field_c = var2.field_c;
            return var2;
          }
        }
    }

    final kd a(kd param0, byte param1) {
        kd var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        kd stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        kd stackOut_9_0 = null;
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
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = ((ta) this).field_a.field_b.field_f;
                break L1;
              }
            }
            if (var3 == ((ta) this).field_a.field_b) {
              ((ta) this).field_c = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (kd) (Object) stackIn_6_0;
            } else {
              L2: {
                if (param1 <= -126) {
                  break L2;
                } else {
                  kd discarded$2 = ((ta) this).e(-9);
                  break L2;
                }
              }
              ((ta) this).field_c = var3.field_f;
              stackOut_9_0 = (kd) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ta.B(");
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final kd e(int param0) {
        kd var2 = null;
        var2 = ((ta) this).field_c;
        if (param0 == 31842) {
          if (var2 == ((ta) this).field_a.field_b) {
            ((ta) this).field_c = null;
            return null;
          } else {
            ((ta) this).field_c = var2.field_c;
            return var2;
          }
        } else {
          return null;
        }
    }

    final kd c(int param0) {
        kd var2 = ((ta) this).field_c;
        if (param0 >= -49) {
            return null;
        }
        if (!(((ta) this).field_a.field_b != var2)) {
            ((ta) this).field_c = null;
            return null;
        }
        ((ta) this).field_c = var2.field_f;
        return var2;
    }

    final static mb a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        mb stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        mb stackOut_5_0 = null;
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
            if (ca.field_i != ee.field_c) {
              L1: {
                if (c.field_o != ee.field_c) {
                  break L1;
                } else {
                  if (!param1.equals((Object) (Object) ef.field_b)) {
                    break L1;
                  } else {
                    ee.field_c = c.field_m;
                    stackOut_5_0 = n.field_k;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0;
                  }
                }
              }
              ef.field_b = param1;
              n.field_k = null;
              ee.field_c = ca.field_i;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (mb) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("ta.D(").append(250).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return (mb) (Object) stackIn_8_0;
    }

    final kd a(int param0) {
        kd var2 = null;
        if (param0 == 250) {
          var2 = ((ta) this).field_a.field_b.field_f;
          if (((ta) this).field_a.field_b == var2) {
            ((ta) this).field_c = null;
            return null;
          } else {
            ((ta) this).field_c = var2.field_f;
            return var2;
          }
        } else {
          ((ta) this).field_a = null;
          var2 = ((ta) this).field_a.field_b.field_f;
          if (((ta) this).field_a.field_b == var2) {
            ((ta) this).field_c = null;
            return null;
          } else {
            ((ta) this).field_c = var2.field_f;
            return var2;
          }
        }
    }

    final static void d() {
        if (mc.field_k != -tf.field_c) {
          if (250 - tf.field_c != mc.field_k) {
            mc.field_k = mc.field_k + 1;
            return;
          } else {
            mc.field_k = mc.field_k + 1;
            return;
          }
        } else {
          mc.field_k = mc.field_k + 1;
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        fk.field_e = param0;
        int var3 = 0;
        ch.field_e = param2;
    }

    ta(ng param0) {
        try {
            ((ta) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ta.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f() {
        field_b = null;
        field_d = null;
    }

    final kd a(kd param0, int param1) {
        kd var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        kd stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        kd stackOut_8_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                var3 = ((ta) this).field_a.field_b.field_c;
                break L1;
              } else {
                var3 = param0;
                break L1;
              }
            }
            if (var3 != ((ta) this).field_a.field_b) {
              L2: {
                ((ta) this).field_c = var3.field_c;
                if (param1 >= 126) {
                  break L2;
                } else {
                  ((ta) this).field_c = null;
                  break L2;
                }
              }
              stackOut_8_0 = (kd) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((ta) this).field_c = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (kd) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("ta.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please wait...";
    }
}
