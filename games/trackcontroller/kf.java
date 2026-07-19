/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    static int field_c;
    static int field_b;
    static qj[] field_d;
    static int field_a;

    public static void b(int param0) {
        field_d = null;
        if (param0 != -1688814815) {
            field_c = -121;
        }
    }

    final static mh a(int param0, kk param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        mh stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mh stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var4 = param1.b(param2, 20095);
            var3 = var4;
            if (var4 != null) {
              L1: {
                if (param0 <= -45) {
                  break L1;
                } else {
                  kf.a(false);
                  break L1;
                }
              }
              stackOut_5_0 = new mh(var4);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("kf.A(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (mh) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static oi a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        oi stackIn_4_0 = null;
        oi stackIn_8_0 = null;
        oi stackIn_11_0 = null;
        oi stackIn_20_0 = null;
        oi stackIn_24_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        oi stackOut_3_0 = null;
        oi stackOut_7_0 = null;
        oi stackOut_23_0 = null;
        oi stackOut_19_0 = null;
        oi stackOut_10_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (-1 == (var2_int ^ -1)) {
              stackOut_3_0 = oc.field_j;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2_int > 63) {
                stackOut_7_0 = bl.field_c;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1) {
                  var3 = 0;
                  L1: while (true) {
                    if (var2_int > var3) {
                      L2: {
                        var4 = param0.charAt(var3);
                        if (var4 != 45) {
                          if (-1 == ac.field_a.indexOf(var4)) {
                            stackOut_23_0 = fh.field_e;
                            stackIn_24_0 = stackOut_23_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L2;
                          }
                        } else {
                          L3: {
                            if (var3 == 0) {
                              break L3;
                            } else {
                              if (-1 + var2_int != var3) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_19_0 = fh.field_e;
                          stackIn_20_0 = stackOut_19_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                      var3++;
                      continue L1;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_10_0 = (oi) null;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var2);
            stackOut_27_1 = new StringBuilder().append("kf.E(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L4;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                return stackIn_24_0;
              }
            }
          }
        }
    }

    final static void a(int param0) {
        r.f(-635);
        qc.b(param0, (byte) -42);
    }

    final static void a(boolean param0) {
        pb.field_c[520] = 59;
        pb.field_c[222] = 58;
        pb.field_c[192] = 28;
        pb.field_c[47] = 73;
        if (param0) {
          kf.a(93);
          pb.field_c[61] = 27;
          pb.field_c[93] = 43;
          pb.field_c[44] = 71;
          pb.field_c[59] = 57;
          pb.field_c[45] = 26;
          pb.field_c[91] = 42;
          pb.field_c[92] = 74;
          pb.field_c[46] = 72;
          return;
        } else {
          pb.field_c[61] = 27;
          pb.field_c[93] = 43;
          pb.field_c[44] = 71;
          pb.field_c[59] = 57;
          pb.field_c[45] = 26;
          pb.field_c[91] = 42;
          pb.field_c[92] = 74;
          pb.field_c[46] = 72;
          return;
        }
    }

    static {
        field_b = 0;
    }
}
