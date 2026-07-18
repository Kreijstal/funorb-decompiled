/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    static int field_c;
    static int field_b;
    static qj[] field_d;
    static int field_a;

    public static void b(int param0) {
        try {
            field_d = null;
            if (param0 != -1688814815) {
                field_c = -121;
            }
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "kf.D(" + param0 + ')');
        }
    }

    final static mh a(int param0, kk param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        mh stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        mh stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3 = param1.b(param2, 20095);
            if (null != var3) {
              L1: {
                if (param0 <= -45) {
                  break L1;
                } else {
                  kf.a(false);
                  break L1;
                }
              }
              stackOut_6_0 = new mh(var3);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (mh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("kf.A(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final static oi a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        oi stackIn_5_0 = null;
        oi stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        oi stackIn_24_0 = null;
        oi stackIn_29_0 = null;
        Object stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        oi stackOut_4_0 = null;
        oi stackOut_9_0 = null;
        oi stackOut_28_0 = null;
        oi stackOut_23_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_12_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_4_0 = oc.field_j;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (var2_int > 63) {
                stackOut_9_0 = bl.field_c;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                if (param1) {
                  var3 = 0;
                  L1: while (true) {
                    L2: {
                      if (var2_int <= var3) {
                        break L2;
                      } else {
                        L3: {
                          var4 = param0.charAt(var3);
                          if (var4 != 45) {
                            if (-1 == ac.field_a.indexOf(var4)) {
                              stackOut_28_0 = fh.field_e;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
                            } else {
                              break L3;
                            }
                          } else {
                            L4: {
                              if (var3 == 0) {
                                break L4;
                              } else {
                                if (~(-1 + var2_int) != ~var3) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            stackOut_23_0 = fh.field_e;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0;
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_31_0 = null;
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  }
                } else {
                  stackOut_12_0 = null;
                  stackIn_13_0 = stackOut_12_0;
                  return (oi) (Object) stackIn_13_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("kf.E(");
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L5;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param1 + ')');
        }
        return (oi) (Object) stackIn_32_0;
    }

    final static void a(int param0) {
        try {
            r.f(-635);
            qc.b(param0, (byte) -42);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "kf.B(" + param0 + ')');
        }
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              pb.field_c[520] = 59;
              pb.field_c[222] = 58;
              pb.field_c[192] = 28;
              pb.field_c[47] = 73;
              if (!param0) {
                break L1;
              } else {
                kf.a(93);
                break L1;
              }
            }
            pb.field_c[61] = 27;
            pb.field_c[93] = 43;
            pb.field_c[44] = 71;
            pb.field_c[59] = 57;
            pb.field_c[45] = 26;
            pb.field_c[91] = 42;
            pb.field_c[92] = 74;
            pb.field_c[46] = 72;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "kf.C(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
