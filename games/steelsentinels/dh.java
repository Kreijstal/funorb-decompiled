/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dh extends kd {
    static wk[] field_y;
    static int field_D;
    static gh field_E;
    static int field_B;
    static int field_F;
    static byte[][] field_A;
    static int[][][] field_C;
    static cm field_z;

    final static String a(String param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 3) {
              stackIn_3_0 = nh.field_n;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = -26 % ((param1 - 3) / 46);
              if (6 == param2) {
                stackIn_7_0 = qh.field_Vb;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (7 == param2) {
                  stackIn_11_0 = li.field_C;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (8 == param2) {
                    stackIn_15_0 = lb.field_kc;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param2 == 9) {
                      stackIn_19_0 = ik.field_i;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (-11 == (param2 ^ -1)) {
                        stackIn_23_0 = te.field_d;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if ((param2 ^ -1) == -12) {
                          stackIn_27_0 = ef.field_a;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (param2 == 14) {
                            stackIn_31_0 = db.a(k.field_Kb, -107, new String[]{param0});
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("dh.PA(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L1;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_27_0;
                    } else {
                      return stackIn_31_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        cm var3 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = qe.a(di.field_h, ul.field_d, -126);
              if (1 != var2_int) {
                break L1;
              } else {
                param1 = "<img=0>" + param1;
                break L1;
              }
            }
            L2: {
              if (param0 == -27905) {
                break L2;
              } else {
                var3 = (cm) null;
                dh.a(78, -81, (cm) null, (byte) 87, (cm) null);
                break L2;
              }
            }
            L3: {
              if (var2_int != 2) {
                break L3;
              } else {
                param1 = "<img=1>" + param1;
                break L3;
              }
            }
            stackIn_7_0 = (String) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("dh.TA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        String var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 116) {
                break L1;
              } else {
                var3 = (String) null;
                dh.a((String) null, (byte) -27);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("dh.SA(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static cm a(int param0, int param1) {
        int var2 = 88 % ((4 - param0) / 44);
        return rf.a(true, 1, (byte) -127, false, false, param1);
    }

    public static void c(byte param0) {
        field_E = null;
        field_z = null;
        field_A = (byte[][]) null;
        field_C = (int[][][]) null;
        field_y = null;
        int var1 = 2 % ((param0 - 12) / 54);
    }

    dh() {
    }

    final static fh a(int param0, int param1, cm param2, byte param3, cm param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        fh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (wa.a((byte) 30, param1, param0, param2)) {
              var5_int = -18 % ((param3 - 56) / 45);
              stackIn_4_0 = sn.a(param4.a(param0, (byte) 79, param1), 103);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("dh.RA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    static {
        field_F = 0;
        field_C = new int[][][]{new int[][]{new int[]{0, 1, 2, 4, 5, 8, 16, 9}, new int[]{24, 25, 26, 27, 28, 29, 30, 31}, new int[]{32, 6, 33, 34, 35, 36, 37}}, new int[][]{new int[]{17, 18, 19, 20, 21, 22, 23}, new int[]{3, 7, 10, 11, 12, 13, 15, 14}, new int[]{38}}};
        field_A = new byte[1000][];
    }
}
