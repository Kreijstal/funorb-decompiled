/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static rc field_b;
    static aa field_a;

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (!param0) {
            field_b = (rc) null;
        }
    }

    final static int b(boolean param0) {
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        var2 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              discarded$12 = gl.field_E.a(hf.field_d, true, param0, ra.field_z);
              gl.field_E.b(true);
              L1: while (true) {
                if (!mh.e(127)) {
                  if (0 == (ra.field_v ^ -1)) {
                    if (!gh.field_k) {
                      if (rk.field_X != oe.field_b) {
                        if (sa.field_Q.b((byte) 121)) {
                          if (oe.field_b != fd.field_h) {
                            stackOut_22_0 = -1;
                            stackIn_23_0 = stackOut_22_0;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            stackOut_20_0 = 2;
                            stackIn_21_0 = stackOut_20_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackOut_11_0 = 3;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    var1_int = ra.field_v;
                    qc.b(-1, (byte) -42);
                    stackOut_8_0 = var1_int;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  discarded$13 = gl.field_E.a(md.field_d, 3931, kg.field_d);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 79;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "ia.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    return stackIn_23_0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, wb param4) {
        try {
            da.field_n.a(!param0 ? true : false, param2, true, param3, param4, param1);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ia.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new aa(2, 4, 4, 0);
    }
}
