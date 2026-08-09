/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    static int field_b;
    static String field_c;
    static String[] field_a;

    public static void a(int param0) {
        if (param0 > -80) {
            fs.a((byte) 122);
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static ut[] a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int[] var6;
        int var7;
        int var8;
        ut var9;
        ut var10;
        ut var11;
        Object var14;
        int[] var15;
        int[] var17;
        int[] var18;
        ut var19;
        ut var20;
        ut var21;
        ut var22;
        ut var23;
        ut var24;
        var18 = on.field_a;
        var17 = var18;
        var15 = var17;
        var6 = var15;
        var7 = on.field_g;
        var8 = on.field_f;
        var9 = new ut(param1, param0 + -(param1 * 2));
        var9.e();
        on.g(0, 0, param1, -(2 * param1) + param0, param3, param4);
        var10 = new ut(param1, param1);
        var10.e();
        on.a(0, 0, param1, param1, param3);
        var11 = new ut(16, param1);
        var11.e();
        on.a(0, 0, 16, param1, param3);
        if (param5 <= 77) {
          L0: {
            field_a = (String[]) null;
            var19 = new ut(param1, param1);
            var19.e();
            on.a(0, 0, param1, param1, param4);
            var20 = new ut(16, param1);
            var20.e();
            on.a(0, 0, 16, param1, param4);
            var14 = null;
            if (-1 <= (param2 ^ -1)) {
              break L0;
            } else {
              var21 = new ut(16, 16);
              var14 = var21;
              var21.e();
              on.a(0, 0, 16, 16, param2);
              break L0;
            }
          }
          on.a(var18, var7, var8);
          return new ut[]{var10, var11, var10, var9, (ut) (var14), var9, var19, var20, var19};
        } else {
          L1: {
            var22 = new ut(param1, param1);
            var22.e();
            on.a(0, 0, param1, param1, param4);
            var23 = new ut(16, param1);
            var23.e();
            on.a(0, 0, 16, param1, param4);
            var14 = null;
            if (-1 <= (param2 ^ -1)) {
              break L1;
            } else {
              var24 = new ut(16, 16);
              var14 = var24;
              var24.e();
              on.a(0, 0, 16, 16, param2);
              break L1;
            }
          }
          on.a(var18, var7, var8);
          return new ut[]{var10, var11, var10, var9, (ut) (var14), var9, var22, var23, var22};
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ml param7, int param8, int param9) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        try {
          L0: {
            var10_int = 59 % ((-62 - param0) / 61);
            var10_int = param7.l(2, 59);
            if (-1 == (var10_int ^ -1)) {
              L1: {
                if (0 == param9) {
                  stackIn_29_0 = 0;
                  break L1;
                } else {
                  stackIn_29_0 = aq.a(param9, -30273, param7);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              if ((var10_int ^ -1) == -2) {
                L2: {
                  if (param4 == 0) {
                    stackIn_22_0 = 0;
                    break L2;
                  } else {
                    stackIn_22_0 = aq.a(param4, -30273, param7);
                    break L2;
                  }
                }
                L3: {
                  var11 = stackIn_22_0;
                  var12 = param1;
                  if (-1 < (var11 ^ -1)) {
                    stackIn_25_0 = -var12 + var11;
                    break L3;
                  } else {
                    stackIn_25_0 = var12 + var11;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (-3 != (var10_int ^ -1)) {
                  if ((var10_int ^ -1) == -4) {
                    L4: {
                      if (0 != param8) {
                        stackIn_15_0 = aq.a(param8, -30273, param7);
                        break L4;
                      } else {
                        stackIn_15_0 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      var11 = stackIn_15_0;
                      var12 = param1 + param6 + param2;
                      if (0 <= var11) {
                        stackIn_18_0 = var12 + var11;
                        break L5;
                      } else {
                        stackIn_18_0 = var11 + -var12;
                        break L5;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    throw new IllegalStateException();
                  }
                } else {
                  L6: {
                    if (0 == param3) {
                      stackIn_6_0 = 0;
                      break L6;
                    } else {
                      stackIn_6_0 = aq.a(param3, -30273, param7);
                      break L6;
                    }
                  }
                  L7: {
                    var11 = stackIn_6_0;
                    var12 = param2 + param1;
                    if (0 <= var11) {
                      stackIn_9_0 = var11 - -var12;
                      break L7;
                    } else {
                      stackIn_9_0 = var11 - var12;
                      break L7;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var10);

            stackIn_32_1 = new StringBuilder().append("fs.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param8 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0;
            } else {
              return stackIn_29_0;
            }
          }
        }
    }

    final static void a(int param0, gm param1, int param2) {
        try {
            ui.g(0).a(param1, param0, true);
            if (param2 < 103) {
                field_c = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "fs.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        if (param0 == -126) {
          if (up.field_p != 0 + -qt.field_l) {
            if (up.field_p == -qt.field_l + 250) {
              up.field_p = up.field_p + 1;
              return;
            } else {
              up.field_p = up.field_p + 1;
              return;
            }
          } else {
            up.field_p = up.field_p + 1;
            return;
          }
        } else {
          field_a = (String[]) null;
          if (up.field_p != 0 + -qt.field_l) {
            if (up.field_p == -qt.field_l + 250) {
              up.field_p = up.field_p + 1;
              return;
            } else {
              up.field_p = up.field_p + 1;
              return;
            }
          } else {
            up.field_p = up.field_p + 1;
            return;
          }
        }
    }

    static {
        field_c = "Staff impersonation";
        field_b = -1;
    }
}
