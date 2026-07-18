/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lc {
    static gq field_b;
    static String field_d;
    static volatile int field_c;
    static String field_a;

    final static int a(int param0, int param1) {
        param1 = (1431655765 & param1) - -(param1 >>> 1 & -715827883);
        param1 = ((-858993460 & param1) >>> 2) + (param1 & 858993459);
        param1 = 252645135 & param1 + (param1 >>> 4);
        param1 = param1 + (param1 >>> 8);
        if (param0 != 12330) {
          field_d = null;
          param1 = param1 + (param1 >>> 16);
          return param1 & 255;
        } else {
          param1 = param1 + (param1 >>> 16);
          return param1 & 255;
        }
    }

    final static String a(int param0, byte param1, String param2) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_33_0 = null;
        String stackIn_37_0 = null;
        String stackIn_41_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_20_0 = null;
        String stackOut_24_0 = null;
        String stackOut_28_0 = null;
        String stackOut_32_0 = null;
        String stackOut_36_0 = null;
        String stackOut_40_0 = null;
        String stackOut_16_0 = null;
        String stackOut_13_0 = null;
        String stackOut_6_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        try {
          L0: {
            if (param0 != 1) {
              if (param0 != 2) {
                if (3 == param0) {
                  stackOut_10_0 = re.a(fa.field_Y, 4371, new String[1]);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  if (4 != param0) {
                    if (param0 != 5) {
                      if (6 == param0) {
                        stackOut_20_0 = re.a(lh.field_E, 4371, new String[1]);
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      } else {
                        if (7 == param0) {
                          stackOut_24_0 = re.a(kq.field_i, 4371, new String[1]);
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        } else {
                          if (param0 == 8) {
                            stackOut_28_0 = re.a(cq.field_F, 4371, new String[1]);
                            stackIn_29_0 = stackOut_28_0;
                            return stackIn_29_0;
                          } else {
                            if (11 == param0) {
                              stackOut_32_0 = re.a(s.field_b, 4371, new String[1]);
                              stackIn_33_0 = stackOut_32_0;
                              return stackIn_33_0;
                            } else {
                              if (param0 == 12) {
                                stackOut_36_0 = re.a(ja.field_l, 4371, new String[1]);
                                stackIn_37_0 = stackOut_36_0;
                                return stackIn_37_0;
                              } else {
                                if (param0 == 13) {
                                  stackOut_40_0 = re.a(sa.field_c, 4371, new String[1]);
                                  stackIn_41_0 = stackOut_40_0;
                                  break L0;
                                } else {
                                  return null;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      stackOut_16_0 = re.a(eh.field_N, 4371, new String[1]);
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  } else {
                    stackOut_13_0 = re.a(vn.field_p, 4371, new String[1]);
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              } else {
                stackOut_6_0 = re.a(p.field_y, 4371, new String[1]);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              stackOut_3_0 = re.a(ea.field_e, 4371, new String[1]);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var3;
            stackOut_42_1 = new StringBuilder().append("lc.L(").append(param0).append(',').append(-87).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L1;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ')');
        }
        return stackIn_41_0;
    }

    final static void b() {
        if (js.field_j != -aj.field_c) {
          if (250 + -aj.field_c == js.field_j) {
            js.field_j = js.field_j + 1;
            return;
          } else {
            js.field_j = js.field_j + 1;
            return;
          }
        } else {
          js.field_j = js.field_j + 1;
          return;
        }
    }

    public static void a() {
        field_b = null;
        field_d = null;
        field_a = null;
    }

    abstract ci a(int param0);

    abstract byte[] a(byte param0, int param1);

    abstract int a(int param0, byte param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Click to hide the Fleet Info window.";
        field_b = new gq(11, 0, 1, 2);
        field_c = 0;
        field_a = "Kick";
    }
}
