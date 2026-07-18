/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm {
    static double[] field_d;
    static int field_c;
    static un field_b;
    static String field_a;
    static boolean field_e;

    final static void a(byte param0, boolean param1) {
        if (0 < kh.field_d) {
          if (ao.field_Gb) {
            df.g(0, 0, df.field_e, we.field_c.field_J);
            jj.field_a.a(param1, 24960);
            if (0 < hn.field_h) {
              if (!ad.field_h) {
                return;
              } else {
                df.g(0, 0, df.field_e, we.field_c.field_J);
                pm.field_n.a(param1, 24960);
                return;
              }
            } else {
              if (th.field_z > 0) {
                L0: {
                  if (ad.field_h) {
                    df.g(0, 0, df.field_e, we.field_c.field_J);
                    pm.field_n.a(param1, 24960);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            if (0 < hn.field_h) {
              if (!ad.field_h) {
                return;
              } else {
                df.g(0, 0, df.field_e, we.field_c.field_J);
                pm.field_n.a(param1, 24960);
                return;
              }
            } else {
              if (th.field_z > 0) {
                L1: {
                  if (ad.field_h) {
                    df.g(0, 0, df.field_e, we.field_c.field_J);
                    pm.field_n.a(param1, 24960);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (0 < hn.field_h) {
            if (!ad.field_h) {
              return;
            } else {
              df.g(0, 0, df.field_e, we.field_c.field_J);
              pm.field_n.a(param1, 24960);
              return;
            }
          } else {
            if (th.field_z > 0) {
              L2: {
                if (ad.field_h) {
                  df.g(0, 0, df.field_e, we.field_c.field_J);
                  pm.field_n.a(param1, 24960);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              return;
            }
          }
        }
    }

    final static rc a(eh param0, byte param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        rc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        rc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = param0.b(param2, 27034);
            var3 = var4;
            if (var4 != null) {
              stackOut_3_0 = new rc(var4);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (rc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("vm.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 42 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final static pe a(byte param0, ml param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        pe stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        pe stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 30) {
              stackOut_3_0 = tm.a(jh.a(param1, 100, 96), param0 ^ 65);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (pe) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("vm.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void a() {
        field_a = null;
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> resigned";
    }
}
