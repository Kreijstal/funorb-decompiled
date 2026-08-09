/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd implements ub {
    static String field_a;
    static al field_b;

    final static void a(int param0, boolean param1) {
        if (!param1) {
            bd.a(-34, 70);
            ch.field_b = param0;
            return;
        }
        ch.field_b = param0;
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_b = (al) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, byte param1, sp param2) {
        try {
            tm.field_f.a(param2, (byte) 3);
            if (param1 != 25) {
                bd.a(20, false);
            }
            ke.a(param0, param2, param1 + 14964);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "bd.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var3_int = param0.length();
              if ((var3_int ^ -1) > -2) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-13 <= (var3_int ^ -1)) {
                  L1: {
                    var4 = gb.a(param0, 67);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (-2 < (var4.length() ^ -1)) {
                        break L1;
                      } else {
                        L2: {
                          if (ik.a((byte) -9, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (ik.a((byte) -9, var4.charAt(var4.length() - 1))) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = param1;
                              L3: while (true) {
                                if (param0.length() <= var6) {
                                  if ((var5 ^ -1) < -1) {
                                    stackIn_32_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  L4: {
                                    var7 = param0.charAt(var6);
                                    if (!ik.a((byte) -9, (char) var7)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (var5 < 2) {
                                      break L5;
                                    } else {
                                      if (param2) {
                                        break L5;
                                      } else {
                                        stackIn_27_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                        stackIn_18_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
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
          L6: {
            var3 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("bd.E(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L6;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_27_0 != 0;
                } else {
                  return stackIn_32_0 != 0;
                }
              }
            }
          }
        }
    }

    final static jp[] a(String param0, String param1, mf param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        jp[] stackIn_2_0 = null;
        jp[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param2.a(param0, false);
            if (param3 == -8) {
              var5 = param2.a(var4_int, -46, param1);
              stackIn_4_0 = qa.a(var5, var4_int, param2, true);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (jp[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("bd.C(");

            if (param0 == null) {
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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
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
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        jp var8 = null;
        try {
          L0: {
            L1: {
              var6_int = param3.field_o + param2;
              var7 = param3.field_w + param4;
              if (param1 == -20618) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              ig.b(param3.field_s, var6_int, param3.field_t, var7, -17634);
              var8 = df.field_a[1];
              if (!(param3 instanceof d)) {
                break L2;
              } else {
                if (!((d) ((Object) param3)).field_F) {
                  break L2;
                } else {
                  var8.f((-var8.field_x + param3.field_t >> 796310721) + 1 + var6_int, (-var8.field_z + param3.field_s >> -857502239) + 1 + var7, 256);
                  break L2;
                }
              }
            }
            if (param3.f(param1 ^ 20732)) {
              hj.a(var7 - -2, var6_int - -2, 124, -4 + param3.field_s, -4 + param3.field_t);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("bd.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1) {
        pi var2;
        var2 = k.field_h;
        var2.e(-13413, param0);
        var2.a(-119, 1);
        var2.a(-127, 0);
        if (param1 < 63) {
          field_a = (String) null;
          return;
        } else {
          return;
        }
    }

    static {
        field_a = "Create a free Account";
    }
}
