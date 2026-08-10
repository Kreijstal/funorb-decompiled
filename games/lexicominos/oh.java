/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static String field_c;
    static String field_a;
    static int field_b;

    final static java.awt.Frame a(int param0, int param1, int param2, byte param3, int param4, ab param5) {
        Object stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        we[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8_int = 0;
        java.awt.Frame var8 = null;
        int var9 = 0;
        we[] var10 = null;
        ei var11 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param5.b(0)) {
              L1: {
                if (-1 != (param4 ^ -1)) {
                  break L1;
                } else {
                  var10 = gb.a((byte) -127, param5);
                  var6 = var10;
                  if (var6 != null) {
                    var7 = 0;
                    var8_int = 0;
                    L2: while (true) {
                      if (var8_int >= var10.length) {
                        if (var7 != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        if (var10[var8_int].field_a == param1) {
                          L3: {
                            if (param0 == var10[var8_int].field_e) {
                              L4: {
                                if (-1 == (param2 ^ -1)) {
                                  break L4;
                                } else {
                                  if (param2 == var10[var8_int].field_k) {
                                    break L4;
                                  } else {
                                    var8_int++;
                                    continue L2;
                                  }
                                }
                              }
                              L5: {
                                if (var7 == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8_int].field_f > param4) {
                                    break L5;
                                  } else {
                                    var8_int++;
                                    continue L2;
                                  }
                                }
                              }
                              param4 = var10[var8_int].field_f;
                              var7 = 1;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var8_int++;
                          continue L2;
                        } else {
                          var8_int++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                }
              }
              var11 = param5.a(28460, param1, param0, param4, param2);
              var7 = -55 / ((param3 - -61) / 63);
              L6: while (true) {
                if (-1 != (var11.field_b ^ -1)) {
                  var8 = (java.awt.Frame) (var11.field_g);
                  if (var8 != null) {
                    if (-3 != (var11.field_b ^ -1)) {
                      stackIn_37_0 = (java.awt.Frame) (var8);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      ca.a(param5, 15232, var8);
                      stackIn_35_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    stackIn_32_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  ge.a(0, 10L);
                  continue L6;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var6_ref);

            stackIn_40_1 = new StringBuilder().append("oh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L7;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_32_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_35_0);
          } else {
            return stackIn_37_0;
          }
        }
    }

    final static boolean a(sh param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -16) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = param0.a((byte) -128);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("oh.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, byte[] param1, boolean param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ab var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (!param2) {
                break L1;
              } else {
                var7 = (ab) null;
                oh.a(-37, 109, 83, (byte) 108, 101, (ab) null);
                break L1;
              }
            }
            var5 = param0;
            L2: while (true) {
              if (var5 >= param3) {
                var4_int = var4_int ^ -1;
                stackIn_7_0 = var4_int;
                break L0;
              } else {
                var4_int = var4_int >>> -2041527256 ^ d.field_c[255 & (param1[var5] ^ var4_int)];
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("oh.B(").append(param0).append(',');

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
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, db param1, boolean param2, String param3, int param4, int param5) {
        try {
            if (param2) {
                ab var7 = (ab) null;
                oh.a(-85, -81, 63, (byte) 46, 52, (ab) null);
            }
            eh.a(param4, param1, param5 + -(24 * (param3.length() - 1)), 0, param3, param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "oh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        int var1 = -85 % ((param0 - -65) / 48);
    }

    static {
        field_c = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
