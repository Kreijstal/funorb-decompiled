/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static kg field_f;
    static int[][] field_e;
    static int field_d;
    static String field_a;
    static String field_g;
    static String field_c;
    static String[] field_b;

    final static void a(int param0) {
        jm var1;
        kj var2;
        CharSequence var3;
        var1 = (jm) ((Object) ri.field_c.e(13058));
        if (var1 != null) {
          if (param0 != 2158) {
            var3 = (CharSequence) null;
            bi.a(false, -110, true, (CharSequence) null);
            var2 = rf.field_d;
            var2.i(0);
            var2.i(0);
            var2.i(0);
            var2.i(0);
            var1.b(param0 + -2154);
            return;
          } else {
            var2 = rf.field_d;
            var2.i(0);
            var2.i(0);
            var2.i(0);
            var2.i(0);
            var1.b(param0 + -2154);
            return;
          }
        } else {
          pm.m(103);
          return;
        }
    }

    final static void b(int param0) {
        ne.field_N.field_f = 0;
        ne.field_N.field_t = 0;
        if (param0 >= -49) {
            bi.b(12, -123);
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static boolean b(int param0, int param1) {
        int var2;
        int stackIn_15_0 = 0;
        var2 = 76 % ((param0 - 58) / 44);
        if ((param1 ^ -1) != -44) {
          if (-45 != (param1 ^ -1)) {
            if (-49 != (param1 ^ -1)) {
              if (31 != param1) {
                if (46 != param1) {
                  if ((param1 ^ -1) != -53) {
                    if (45 != param1) {
                      if (47 == param1) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      stackIn_15_0 = 1;
                      return stackIn_15_0 != 0;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        int var1 = -15 % ((7 - param0) / 47);
        field_b = null;
        field_e = (int[][]) null;
        field_g = null;
        field_a = null;
        field_c = null;
    }

    final static boolean a(String param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != gj.field_b) {
              if (param1) {
                L1: {
                  if ((param0.toLowerCase().indexOf(gj.field_b.toLowerCase()) ^ -1) > -1) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    stackIn_9_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("bi.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    final static boolean a(boolean param0, int param1, boolean param2, CharSequence param3) {
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) > -3) {
                break L1;
              } else {
                if ((param1 ^ -1) < -37) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = param2 ? 1 : 0;
                  var6 = 0;
                  var7 = param3.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var7 <= var8) {
                      stackIn_40_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        L4: {
                          var9 = param3.charAt(var8);
                          if (0 != var8) {
                            break L4;
                          } else {
                            if (45 != var9) {
                              if (var9 != 43) {
                                break L4;
                              } else {
                                if (param0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L3;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (var9 < 48) {
                              break L6;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (65 > var9) {
                              break L7;
                            } else {
                              if (90 >= var9) {
                                var9 -= 55;
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 97) {
                              break L8;
                            } else {
                              if (var9 > 122) {
                                break L8;
                              } else {
                                var9 -= 87;
                                break L5;
                              }
                            }
                          }
                          stackIn_23_0 = 0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                        if (var9 >= param1) {
                          stackIn_29_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L9: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10 = var6 * param1 + var9;
                          if (var6 == var10 / param1) {
                            var6 = var10;
                            var5 = 1;
                            break L3;
                          } else {
                            stackIn_35_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var4);

            stackIn_43_1 = new StringBuilder().append("bi.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L10;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L10;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_23_0 != 0;
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

    static {
        field_f = null;
        field_a = "Show lobby chat from my friends";
        field_e = new int[][]{new int[]{}, new int[]{}, new int[]{17}, new int[]{0}, new int[]{5}, new int[]{16}, new int[]{10}, new int[]{21}, new int[]{}, new int[]{26}, new int[]{1}, new int[]{6}, new int[]{22}, new int[]{33}, new int[]{}, new int[]{11}, new int[]{18}, new int[]{}, new int[]{28}, new int[]{27, 32, 29}, new int[]{7}, new int[]{2}, new int[]{}, new int[]{}, new int[]{12}, new int[]{}, new int[]{}, new int[]{19}, new int[]{}, new int[]{30}};
        field_c = "Return to lobby";
        field_g = "<%0> wants to join";
        field_b = new String[]{"Range", "Rate of fire", "Reload speed", "Area of effect", "Energy efficiency", "Kinetic damage", "Explosive damage", "Energy damage", "EMP"};
    }
}
