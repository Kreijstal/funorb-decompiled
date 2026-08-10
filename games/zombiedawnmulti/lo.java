/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo {
    static String field_f;
    static int field_b;
    static String field_c;
    static String field_h;
    static cj field_g;
    static int[] field_j;
    static String field_e;
    static String field_i;
    static ri[] field_a;
    static int field_d;

    final static short[] a(int param0, short[] param1, ga param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_10_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var4_int = param2.h(param0, 14862);
            if (0 != var4_int) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (var4_int == param1.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param1 = new short[var4_int];
                break L1;
              }
              var5 = param2.h(4, 14862);
              if (param3 < -96) {
                L3: {
                  var6 = (short)param2.h(16, 14862);
                  if (0 < var5) {
                    var7 = 0;
                    L4: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param1[var7] = (short)(var6 + param2.h(var5, 14862));
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param1[var7] = (short)var6;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackIn_19_0 = (short[]) (param1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_10_0 = (short[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("lo.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_19_0;
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_a = null;
        field_h = null;
        field_j = null;
        field_c = null;
        if (param0 != 0) {
            return;
        }
        field_g = null;
        field_f = null;
        field_e = null;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (gn.a(param1, 16413)) {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var11 = af.field_d;
                var9 = var11;
                var6 = var9;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var11.length <= var3) {
                    L2: {
                      if (param0 == 8192) {
                        break L2;
                      } else {
                        lo.a(50);
                        break L2;
                      }
                    }
                    var12 = ln.field_d;
                    var10 = var12;
                    var7 = var10;
                    var2 = var7;
                    var8 = 0;
                    var3 = var8;
                    L3: while (true) {
                      if (var8 >= var12.length) {
                        stackIn_26_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var4 = var12[var8];
                        if (param1 == var4) {
                          stackIn_23_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var8++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4 = var11[var3];
                    if (param1 != var4) {
                      var3++;
                      continue L1;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "lo.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0 != 0;
            } else {
              return stackIn_26_0 != 0;
            }
          }
        }
    }

    static {
        field_h = "Please remove <%0> from your friend list first.";
        field_c = "Private";
        field_e = "Your zombie will become tougher, able to take more damage before dying...again.";
        field_i = "<%0> is already on your ignore list.";
        field_j = new int[8192];
        field_d = 0;
    }
}
