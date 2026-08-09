/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi extends pi {
    int field_n;
    static int field_p;
    int field_o;
    static int field_q;

    final static boolean a(boolean param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (ok.a(111, param2, param1)) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  field_p = -19;
                  break L1;
                }
              }
              var3_int = 0;
              L2: while (true) {
                if (param2.length() <= var3_int) {
                  stackIn_14_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!rb.a((byte) 124, param2.charAt(var3_int))) {
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3_int++;
                    continue L2;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("bi.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            var2_int = param0;
            L1: while (true) {
              if (var2_int >= param1.length()) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var3 = param1.charAt(var2_int);
                  if (ra.a((byte) 121, (char) var3)) {
                    break L2;
                  } else {
                    if (!g.a((char) var3, (byte) -68)) {
                      stackIn_7_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("bi.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static boolean a(int param0) {
        CharSequence var2;
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -11) {
            break L0;
          } else {
            var2 = (CharSequence) null;
            bi.a(false, true, (CharSequence) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (fh.field_b ^ -1)) {
              break L2;
            } else {
              if (13 > af.field_u) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private bi() throws Throwable {
        throw new Error();
    }

    final static String a(int[] param0, boolean param1) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            var5 = new StringBuilder("[");
            var2 = var5;
            var3 = 0;
            L1: while (true) {
              if (var3 >= param0.length) {
                if (param1) {
                  stackIn_12_0 = String.valueOf(']');
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_10_0 = (String) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  if (0 == var3) {
                    break L2;
                  } else {
                    discarded$2 = var2.append(',');
                    break L2;
                  }
                }
                discarded$3 = var5.append("0x").append(Integer.toHexString(param0[var3]));
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2_ref);

            stackIn_15_1 = new StringBuilder().append("bi.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_12_0;
        }
    }

    static {
        field_q = 4;
    }
}
