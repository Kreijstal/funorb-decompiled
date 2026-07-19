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

    final static void a(java.awt.Component param0, int param1) {
        try {
            if (param1 != -30418) {
                field_f = (String) null;
            }
            param0.removeKeyListener(wc.field_i);
            param0.removeFocusListener(wc.field_i);
            qj.field_h = -1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "qe.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(ak param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        try {
            if (param3 != 3) {
                discarded$0 = qe.a(16, 30, -14);
            }
            tk.field_p = param0;
            on.field_n = param2;
            ug.field_I = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "qe.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        gk discarded$0 = null;
        field_f = null;
        field_d = null;
        field_g = null;
        field_a = null;
        field_c = null;
        if (param0 != -31914) {
            String var2 = (String) null;
            discarded$0 = qe.a((wk) null, (byte) 27, (String) null);
        }
        field_b = null;
    }

    final static gk a(wk param0, byte param1, String param2) {
        int discarded$1 = 0;
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
        gk stackIn_41_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        gk stackOut_40_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param0.field_E.length <= var3_int) {
                L2: {
                  param0.d();
                  ff.field_lb.a(param2, param0.field_z / 2, param0.field_B + -10, 10790052, -1);
                  sb.field_bb.b((byte) 125);
                  var3_int = param0.field_z;
                  var4 = param0.field_B;
                  var5 = 0;
                  var6 = 0;
                  var7 = 0;
                  if (param1 == -93) {
                    break L2;
                  } else {
                    discarded$1 = qe.a(-36, 56, 41);
                    break L2;
                  }
                }
                var8_int = 0;
                L3: while (true) {
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
                    L4: while (true) {
                      if (-var4 + var5 <= var10) {
                        var9 = var8.field_g * (var8.field_d + -1);
                        var10 = 0;
                        L5: while (true) {
                          if (var8.field_g <= var10) {
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var10 >= var8.field_d) {
                                stackOut_40_0 = (gk) (var8);
                                stackIn_41_0 = stackOut_40_0;
                                break L0;
                              } else {
                                var8.field_p[0 + var9] = (byte)2;
                                var8.field_p[-1 + var9 + (0 - -var8.field_g)] = (byte)2;
                                var9 = var9 + var8.field_g;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            var8.field_p[var10] = (byte)2;
                            var8.field_p[var10 + var9] = (byte)2;
                            var10++;
                            continue L5;
                          }
                        }
                      } else {
                        var11 = 0;
                        L7: while (true) {
                          if (var11 >= -var3_int + var6) {
                            var9 = var9 + var8.field_g;
                            var7 = var7 + param0.field_z;
                            var10++;
                            continue L4;
                          } else {
                            L8: {
                              if (0 != param0.field_E[var7 + var11]) {
                                var8.field_p[var9 + var11] = (byte) 1;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var11++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    var9 = 0;
                    L9: while (true) {
                      if (param0.field_z <= var9) {
                        var7 = var7 + param0.field_z;
                        var8_int++;
                        continue L3;
                      } else {
                        L10: {
                          if (param0.field_E[var9 - -var7] != 0) {
                            L11: {
                              if (var3_int > var9) {
                                var3_int = var9;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L12: {
                              if (var9 <= var6) {
                                break L12;
                              } else {
                                var6 = var9;
                                break L12;
                              }
                            }
                            L13: {
                              if (var8_int < var4) {
                                var4 = var8_int;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            if (var8_int > var5) {
                              var5 = var8_int;
                              break L10;
                            } else {
                              var9++;
                              continue L9;
                            }
                          } else {
                            break L10;
                          }
                        }
                        var9++;
                        continue L9;
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
          L14: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var3);
            stackOut_42_1 = new StringBuilder().append("qe.C(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L14;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L14;
            }
          }
          L15: {
            stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param1).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L15;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L15;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ')');
        }
        return stackIn_41_0;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 >= -66) {
            return 55;
        }
        if (param1 < 2) {
            if (-6 >= (param0 ^ -1)) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    static {
        field_e = 3;
        field_c = "Login: ";
        field_a = new int[128];
        field_f = "w";
        field_d = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_b = "Quit to website";
    }
}
