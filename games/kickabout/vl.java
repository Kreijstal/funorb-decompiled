/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static bu field_c;
    static String field_f;
    static String field_e;
    static ut field_g;
    static String field_b;
    static boolean field_d;
    private String field_a;

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -49) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$2 = vl.a(56, true, true, (CharSequence) null);
                break L1;
              }
            }
            stackOut_2_0 = ((vl) this).field_a.equals((Object) (Object) param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("vl.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, boolean param1, boolean param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_36_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_32_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 < 2) {
                break L1;
              } else {
                if (param0 > 36) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param3.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= var7) {
                      stackOut_36_0 = var5;
                      stackIn_37_0 = stackOut_36_0;
                      break L0;
                    } else {
                      L3: {
                        L4: {
                          var9 = param3.charAt(var8);
                          if (0 != var8) {
                            break L4;
                          } else {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L3;
                            } else {
                              if (var9 != 43) {
                                break L4;
                              } else {
                                break L4;
                              }
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
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0 != 0;
                        }
                        if (var9 >= param0) {
                          stackOut_27_0 = 0;
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0 != 0;
                        } else {
                          L9: {
                            if (var4_int == 0) {
                              break L9;
                            } else {
                              var9 = -var9;
                              break L9;
                            }
                          }
                          var10 = var9 + var6 * param0;
                          if (var10 / param0 == var6) {
                            var6 = var10;
                            var5 = 1;
                            break L3;
                          } else {
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            return stackIn_33_0 != 0;
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
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var4;
            stackOut_38_1 = new StringBuilder().append("vl.D(").append(param0).append(',').append(true).append(',').append(true).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param3 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L10;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L10;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
        }
        return stackIn_37_0 != 0;
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 < 111) {
            vl.a(-36, -71, -68, 100, 65);
        }
        field_g = null;
        field_c = null;
        field_b = null;
        field_e = null;
    }

    final void a(int param0, java.applet.Applet param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              tj.a(((vl) this).field_a, param1, (byte) -5, 31536000L, "jagex-last-login-method");
              if (param0 <= -110) {
                break L1;
              } else {
                vl.a(78, 31, 85, 37, 61);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vl.I(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static void a(nu param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
            var2_int = param0.field_V.a(true);
            var3 = param0.field_V.c(879306160);
            if (param1 >= -39) {
                vl.a(127);
            }
            var4 = var2_int - 448;
            var5 = -672 + var3;
            var6 = var4 * var4 + var5 * var5;
            if (var6 > 202500) {
                var7 = de.a(var6, (byte) -118);
                var3 = 450 * var5 / var7 + 672;
                var2_int = 448 - -(var4 * 450 / var7);
            }
            ql.field_a[1] = var3;
            ql.field_a[0] = var2_int;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "vl.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static ut a(int param0, int param1, boolean param2, int param3) {
        int var4 = (param1 << 1) + 1;
        ut var5 = new ut(var4, var4);
        iw.a(56, var5);
        on.d(param1, param1, param1, 16777215);
        on.d(param1, param1, param1 - 2, 0);
        ta.e(120);
        return var5;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        dk.a(param2, -109, param1, param3 / param0, param3 % 3);
        on.a(param2, param1, 156, 225, 10, 16777215, param4);
        ta.e(126);
    }

    final static boolean a(boolean param0) {
        return fp.field_e == -1 && nq.g(0) < 10;
    }

    vl(String param0) {
        try {
            ((vl) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "vl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            vl.a(-68, -48, 74, 38, -61);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!il.b((byte) 100)) {
              break L2;
            } else {
              if (!c.field_g) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Offensive account name";
        field_d = true;
        field_b = "-";
    }
}
