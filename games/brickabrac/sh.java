/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static String field_b;
    static String field_c;
    static int field_a;
    static mh field_d;

    final static eh a(byte param0) {
        int var1 = 0;
        if (null == dm.field_g) {
          dm.field_g = new eh();
          dm.field_g.a(a.field_u, 13421772);
          dm.field_g.field_p = 2763306;
          dm.field_g.field_h = 6;
          dm.field_g.field_a = 4;
          dm.field_g.field_g = 0;
          dm.field_g.field_f = 5;
          dm.field_g.field_j = 7697781;
          dm.field_g.field_m = 14;
          dm.field_g.field_l = og.field_Yb;
          var1 = 89 / ((param0 - 32) / 44);
          return dm.field_g;
        } else {
          var1 = 89 / ((param0 - 32) / 44);
          return dm.field_g;
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = -59 / ((param1 - 40) / 63);
              if (param3 < 2) {
                break L1;
              } else {
                if ((param3 ^ -1) >= -37) {
                  var5 = 0;
                  var6 = 0;
                  var7 = 0;
                  var8 = param2.length();
                  var9 = 0;
                  L2: while (true) {
                    if (var8 <= var9) {
                      stackOut_39_0 = var6;
                      stackIn_40_0 = stackOut_39_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        L4: {
                          var10 = param2.charAt(var9);
                          if (var9 == 0) {
                            if (var10 != 45) {
                              if (var10 != 43) {
                                break L4;
                              } else {
                                if (param0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              var5 = 1;
                              break L3;
                            }
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (var10 < 48) {
                              break L6;
                            } else {
                              if (var10 > 57) {
                                break L6;
                              } else {
                                var10 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (var10 < 65) {
                              break L7;
                            } else {
                              if (var10 <= 90) {
                                var10 -= 55;
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var10 < 97) {
                              break L8;
                            } else {
                              if (var10 > 122) {
                                break L8;
                              } else {
                                var10 -= 87;
                                break L5;
                              }
                            }
                          }
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                        if (param3 <= var10) {
                          stackOut_28_0 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L9: {
                            if (var5 != 0) {
                              var10 = -var10;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var11 = var10 + var7 * param3;
                          if (var7 == var11 / param3) {
                            var7 = var11;
                            var6 = 1;
                            break L3;
                          } else {
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var4);
            stackOut_41_1 = new StringBuilder().append("sh.C(").append(param0).append(',').append(param1).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L10;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L10;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_24_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_29_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_35_0 != 0;
            } else {
              return stackIn_40_0 != 0;
            }
          }
        }
    }

    final static void b(int param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 == 1) {
                    break L1;
                  } else {
                    field_b = (String) null;
                    break L1;
                  }
                }
                L2: {
                  var1_ref = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1_ref == null) {
                    break L2;
                  } else {
                    try {
                      L3: {
                        var2_ref = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1_ref.invoke((Object) (var2_ref), (Object[]) null));
                        qh.field_a = 1 + (int)(var3.longValue() / 1048576L);
                        decompiledRegionSelector0 = 0;
                        break L3;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var2 = decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L4;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var1 = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 <= 110) {
            field_d = (mh) null;
        }
    }

    static {
        field_c = "More suggestions";
        field_b = "Encouraging rule breaking";
    }
}
