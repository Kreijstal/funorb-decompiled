/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static int field_e;
    static String field_c;
    static java.math.BigInteger field_d;
    static String field_f;
    static int[] field_a;
    static wk field_g;
    static String field_b;

    final static void a(java.awt.Component param0) {
        try {
            param0.removeKeyListener((java.awt.event.KeyListener) (Object) wc.field_i);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) wc.field_i);
            qj.field_h = -1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "qe.A(" + (param0 != null ? "{...}" : "null") + 44 + -30418 + 41);
        }
    }

    final static void a(ak param0) {
        try {
            tk.field_p = param0;
            on.field_n = 8;
            ug.field_I = 8;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "qe.E(" + (param0 != null ? "{...}" : "null") + 44 + 8 + 44 + 8 + 44 + 3 + 41);
        }
    }

    public static void a() {
        field_f = null;
        field_d = null;
        field_g = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static gk a(wk param0, byte param1, String param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        gk var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        gk stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        gk stackOut_38_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param0.field_E.length <= var3_int) {
                param0.d();
                ff.field_lb.a(param2, param0.field_z / 2, param0.field_B + -10, 10790052, -1);
                sb.field_bb.b((byte) 125);
                var3_int = param0.field_z;
                var4 = param0.field_B;
                var5 = 0;
                var6 = 0;
                var7 = 0;
                var8_int = 0;
                L2: while (true) {
                  if (param0.field_B <= var8_int) {
                    var6++;
                    var5++;
                    var8 = new gk(8 + (var6 + -var3_int), 8 + var5 - var4, 3);
                    var8.field_o[0] = 0;
                    var8.field_o[2] = 5789784;
                    var8.field_o[1] = 10790052;
                    var7 = var3_int + param0.field_z * var4;
                    var9 = 4 + var8.field_g * 4;
                    var10 = 0;
                    L3: while (true) {
                      if (-var4 + var5 <= var10) {
                        var9 = var8.field_g * (var8.field_d + -1);
                        var10 = 0;
                        L4: while (true) {
                          if (var8.field_g <= var10) {
                            var9 = 0;
                            var10 = 0;
                            L5: while (true) {
                              if (var10 >= var8.field_d) {
                                stackOut_38_0 = (gk) var8;
                                stackIn_39_0 = stackOut_38_0;
                                break L0;
                              } else {
                                var8.field_p[var9] = (byte) 2;
                                var8.field_p[-1 + var9 + (0 - -var8.field_g)] = (byte) 2;
                                var9 = var9 + var8.field_g;
                                var10++;
                                continue L5;
                              }
                            }
                          } else {
                            var8.field_p[var10] = (byte) 2;
                            var8.field_p[var10 + var9] = (byte) 2;
                            var10++;
                            continue L4;
                          }
                        }
                      } else {
                        var11 = 0;
                        L6: while (true) {
                          if (var11 >= -var3_int + var6) {
                            var9 = var9 + var8.field_g;
                            var7 = var7 + param0.field_z;
                            var10++;
                            continue L3;
                          } else {
                            L7: {
                              if (0 != param0.field_E[var7 + var11]) {
                                var8.field_p[var9 + var11] = (byte) 1;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            var11++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var9 = 0;
                    L8: while (true) {
                      if (param0.field_z <= var9) {
                        var7 = var7 + param0.field_z;
                        var8_int++;
                        continue L2;
                      } else {
                        if (param0.field_E[var9 - -var7] != 0) {
                          L9: {
                            if (var3_int > var9) {
                              var3_int = var9;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            if (var9 <= var6) {
                              break L10;
                            } else {
                              var6 = var9;
                              break L10;
                            }
                          }
                          L11: {
                            if (var8_int < var4) {
                              var4 = var8_int;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L12: {
                            if (var8_int <= var5) {
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          var9++;
                          continue L8;
                        } else {
                          var9++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                param0.field_E[var3_int] = 0;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var3;
            stackOut_40_1 = new StringBuilder().append("qe.C(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L13;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L13;
            }
          }
          L14: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(44).append(-93).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L14;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L14;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 41);
        }
        return stackIn_39_0;
    }

    final static int a(int param0, int param1) {
        if (param1 < 2) {
            if (param0 >= 5) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 3;
        field_c = "Login: ";
        field_a = new int[128];
        field_f = "w";
        field_d = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_b = "Quit to website";
    }
}
