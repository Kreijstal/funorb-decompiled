/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends db {
    final static q a(boolean param0, int param1) {
        RuntimeException var2 = null;
        la var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        ob var6_ref = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int[] stackIn_36_0 = null;
        q stackIn_43_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        Object stackOut_35_0 = null;
        int[] stackOut_33_0 = null;
        q stackOut_42_0 = null;
        Object stackOut_2_0 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == 21552) {
              L1: {
                var2_ref = ne.field_a;
                var3 = var2_ref.h(16383);
                fd.field_e = 127 & var3;
                if (0 == (128 & var3)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_8_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                L3: {
                  nl.field_b = stackIn_8_0 != 0;
                  id.field_h = var2_ref.h(16383);
                  lg.field_a = var2_ref.f((byte) 84);
                  if (fd.field_e == 2) {
                    break L3;
                  } else {
                    ka.field_c = 0;
                    jb.field_d = 0;
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                jb.field_d = var2_ref.d((byte) -124);
                ka.field_c = var2_ref.e(8);
                break L2;
              }
              L4: {
                if (var2_ref.h(16383) != 1) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L4;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_18_0 = stackOut_15_0;
                  break L4;
                }
              }
              L5: {
                L6: {
                  var4 = stackIn_18_0;
                  ai.field_c = var2_ref.g(0);
                  if (var4 != 0) {
                    break L6;
                  } else {
                    o.field_b = ai.field_c;
                    if (var7 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                o.field_b = var2_ref.g(0);
                break L5;
              }
              L7: {
                L8: {
                  if (fd.field_e == 1) {
                    break L8;
                  } else {
                    if (fd.field_e != 4) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                int discarded$2 = var2_ref.d((byte) -117);
                String discarded$3 = var2_ref.g(0);
                break L7;
              }
              L9: {
                L10: {
                  if (!param0) {
                    break L10;
                  } else {
                    var5 = var2_ref.d((byte) -67);
                    try {
                      L11: {
                        L12: {
                          var6_ref = od.field_a.a(98, var5);
                          li.field_l = var6_ref.a((byte) 2);
                          if (o.field_b.equals((Object) (Object) ue.field_a)) {
                            stackOut_35_0 = null;
                            stackIn_36_0 = (int[]) (Object) stackOut_35_0;
                            break L12;
                          } else {
                            stackOut_33_0 = var6_ref.field_r;
                            stackIn_36_0 = stackOut_33_0;
                            break L12;
                          }
                        }
                        hi.field_A = stackIn_36_0;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L13: {
                        var6 = (Exception) (Object) decompiledCaughtException;
                        hb.a((Throwable) (Object) var6, param1 ^ 21552, "CC1");
                        li.field_l = null;
                        hi.field_A = null;
                        break L13;
                      }
                    }
                    if (var7 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                li.field_l = nd.a(-101, (be) (Object) var2_ref, 80);
                hi.field_A = null;
                break L9;
              }
              stackOut_42_0 = new q(param0);
              stackIn_43_0 = stackOut_42_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (q) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "pj.P(" + param0 + ',' + param1 + ')');
        }
        return stackIn_43_0;
    }

    pj(vl param0, al param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void b(al param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            super.b(param0, -77);
            if (param1 < -61) {
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("pj.O(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static ng a(kk param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        ng stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        ng stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!sk.a(param1, param0, 1, param3)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (ng) (Object) stackIn_4_0;
            } else {
              if (param2 < -123) {
                stackOut_8_0 = kj.a((byte) 106);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (ng) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("pj.A(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    static {
    }
}
