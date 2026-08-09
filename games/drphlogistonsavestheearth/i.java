/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static bb field_b;
    static int field_a;
    static int[] field_c;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 < -54) {
            return;
        }
        field_b = (bb) null;
    }

    final static void a(od param0, od param1, java.math.BigInteger param2, java.math.BigInteger param3, int param4) {
        try {
            hb.a(param1.field_h, param3, param2, (byte) -41, param1.field_j, param4, param0);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "i.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1) {
        gi var2 = null;
        int var3 = 0;
        je var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (je) ((Object) aa.field_e.h(-11151));
              if (param1 == 0) {
                break L1;
              } else {
                field_c = (int[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                var2 = ql.field_i.h(-11151);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    bj.a(param1 ^ 2591, param0);
                    var2 = ql.field_i.e(0);
                    continue L3;
                  }
                }
              } else {
                hl.a(var4, 122, param0);
                var4 = (je) ((Object) aa.field_e.e(param1 ^ 0));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "i.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        java.math.BigInteger var3 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1.equals("B")) {
              stackIn_3_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!param1.equals("I")) {
                if (!param1.equals("S")) {
                  if (param1.equals("J")) {
                    stackIn_13_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param1.equals("Z")) {
                      L1: {
                        if (param0 == -32512) {
                          break L1;
                        } else {
                          var3 = (java.math.BigInteger) null;
                          i.a((od) null, (od) null, (java.math.BigInteger) null, (java.math.BigInteger) null, -76);
                          break L1;
                        }
                      }
                      if (param1.equals("F")) {
                        stackIn_22_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param1.equals("D")) {
                          if (!param1.equals("C")) {
                            stackIn_30_0 = Class.forName(param1);
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            stackIn_28_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackIn_25_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_16_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_9_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var2);

            stackIn_33_1 = new StringBuilder().append("i.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L2;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_28_0;
                      } else {
                        return stackIn_30_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_a = 0;
        field_b = new bb();
        field_c = new int[64];
    }
}
