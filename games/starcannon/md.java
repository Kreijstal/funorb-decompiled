/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    static int field_c;
    static String field_b;
    static int field_a;

    final static String a(boolean param0, CharSequence param1, byte param2) {
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        var8 = StarCannon.field_A;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (12 >= var3_int) {
                    L2: {
                      if (param2 == -81) {
                        break L2;
                      } else {
                        var9 = (String) null;
                        md.a(-31, (String) null);
                        break L2;
                      }
                    }
                    L3: {
                      var4 = ni.a(116, param1);
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (var4.length() < 1) {
                          break L3;
                        } else {
                          L4: {
                            if (dk.a((byte) -123, var4.charAt(0))) {
                              break L4;
                            } else {
                              if (!dk.a((byte) -124, var4.charAt(var4.length() - 1))) {
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  if (param1.length() <= var6) {
                                    if ((var5 ^ -1) < -1) {
                                      stackIn_34_0 = v.field_c;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param1.charAt(var6);
                                      if (dk.a((byte) -128, (char) var7)) {
                                        var5++;
                                        break L6;
                                      } else {
                                        var5 = 0;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if ((var5 ^ -1) > -3) {
                                        break L7;
                                      } else {
                                        if (param0) {
                                          break L7;
                                        } else {
                                          stackIn_29_0 = te.field_c;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L5;
                                  }
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          stackIn_20_0 = v.field_c;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackIn_15_0 = vj.field_W;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_8_0 = vj.field_W;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = vj.field_W;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("md.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L8;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_29_0;
                } else {
                  return stackIn_34_0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -27240) {
            return;
        }
        field_b = null;
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length() < rj.field_j) {
                  break L2;
                } else {
                  if (param1.length() > wc.field_a) {
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("md.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    static {
        field_c = 4;
        field_a = -1;
    }
}
