/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends qo {
    private int field_l;
    private int field_m;
    static String field_h;
    private boolean field_f;
    static String field_o;
    private int field_p;
    static bc field_k;
    static String field_n;
    private String field_g;
    private nq field_j;
    static String[] field_r;
    private int field_q;
    private int field_i;

    final void a(int param0, String param1, int param2, nq param3, int param4) {
        ha var8 = null;
        int var7 = 0;
        if (!(param1 != null)) {
            ((la) this).field_d = null;
            return;
        }
        if (((la) this).field_j == param3) {
            if (((la) this).field_f) {
                if (((la) this).field_p == 1) {
                    if (((la) this).field_g != null) {
                        if (!(!((la) this).field_g.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((la) this).field_p = 1;
            ((la) this).field_f = true;
            ((la) this).field_j = param3;
            var8 = this.a(param0, param3, param1, (byte) 15);
            var7 = param3.c(param1);
            var8.field_b[param2] = -(var7 >> 1) + param4;
            var8.field_b[param1.length()] = param4 + (var7 >> 1);
            ta.a(param1, var8, 27329, 0, param3);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "la.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5, nq param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        ha var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        ha stackIn_32_0 = null;
        ha stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        ha stackIn_33_0 = null;
        ha stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        ha stackIn_34_0 = null;
        ha stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        String stackIn_37_0 = null;
        ha stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        String stackIn_38_0 = null;
        ha stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        String stackIn_39_0 = null;
        ha stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
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
        ha stackOut_31_0 = null;
        ha stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        ha stackOut_33_0 = null;
        ha stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        ha stackOut_32_0 = null;
        ha stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        String stackOut_36_0 = null;
        ha stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        String stackOut_38_0 = null;
        ha stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        String stackOut_37_0 = null;
        ha stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
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
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 != param1) {
                break L1;
              } else {
                param7 = param6.field_L;
                break L1;
              }
            }
            if (param0 != null) {
              L2: {
                if (((la) this).field_j != param6) {
                  break L2;
                } else {
                  if (((la) this).field_f) {
                    break L2;
                  } else {
                    if (param2 != ((la) this).field_p) {
                      break L2;
                    } else {
                      if (~param3 != ~((la) this).field_l) {
                        break L2;
                      } else {
                        if (~((la) this).field_m != ~param7) {
                          break L2;
                        } else {
                          if (~param5 != ~((la) this).field_i) {
                            break L2;
                          } else {
                            if (((la) this).field_q != param4) {
                              break L2;
                            } else {
                              if (((la) this).field_g == null) {
                                break L2;
                              } else {
                                if (((la) this).field_g.equals((Object) (Object) param0)) {
                                  return;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                ((la) this).field_f = false;
                ((la) this).field_j = param6;
                ((la) this).field_l = param3;
                ((la) this).field_q = param4;
                ((la) this).field_p = param2;
                ((la) this).field_g = param0;
                ((la) this).field_i = param5;
                ((la) this).field_m = param7;
                var16 = new String[1 + param6.a(param0, param4)];
                var17 = var16;
                var10 = Math.max(1, param6.a(param0, new int[1], var17));
                if (((la) this).field_l != 3) {
                  break L3;
                } else {
                  if (var10 != 1) {
                    break L3;
                  } else {
                    ((la) this).field_l = 1;
                    break L3;
                  }
                }
              }
              L4: {
                if (((la) this).field_l == 0) {
                  var11 = param6.field_J;
                  break L4;
                } else {
                  if (1 == ((la) this).field_l) {
                    var11 = param6.field_J + (((la) this).field_i - var10 * ((la) this).field_m >> 1);
                    break L4;
                  } else {
                    if (2 != ((la) this).field_l) {
                      L5: {
                        var12 = (((la) this).field_i + -(((la) this).field_m * var10)) / (var10 - -1);
                        if (0 <= var12) {
                          break L5;
                        } else {
                          var12 = 0;
                          break L5;
                        }
                      }
                      var11 = var12 + param6.field_J;
                      ((la) this).field_m = ((la) this).field_m + var12;
                      break L4;
                    } else {
                      var11 = ((la) this).field_i + -param6.field_q - ((la) this).field_m * var10;
                      break L4;
                    }
                  }
                }
              }
              ((la) this).field_d = new ha[var10];
              var12 = 0;
              L6: while (true) {
                if (~var12 <= ~var10) {
                  break L0;
                } else {
                  L7: {
                    var13 = var16[var12];
                    stackOut_31_0 = null;
                    stackOut_31_1 = null;
                    stackOut_31_2 = -param6.field_J + var11;
                    stackOut_31_3 = var11 + param6.field_q;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    stackIn_33_2 = stackOut_31_2;
                    stackIn_33_3 = stackOut_31_3;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    stackIn_32_2 = stackOut_31_2;
                    stackIn_32_3 = stackOut_31_3;
                    if (var13 != null) {
                      stackOut_33_0 = null;
                      stackOut_33_1 = null;
                      stackOut_33_2 = stackIn_33_2;
                      stackOut_33_3 = stackIn_33_3;
                      stackOut_33_4 = var13.length();
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      stackIn_34_2 = stackOut_33_2;
                      stackIn_34_3 = stackOut_33_3;
                      stackIn_34_4 = stackOut_33_4;
                      break L7;
                    } else {
                      stackOut_32_0 = null;
                      stackOut_32_1 = null;
                      stackOut_32_2 = stackIn_32_2;
                      stackOut_32_3 = stackIn_32_3;
                      stackOut_32_4 = 0;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_34_1 = stackOut_32_1;
                      stackIn_34_2 = stackOut_32_2;
                      stackIn_34_3 = stackOut_32_3;
                      stackIn_34_4 = stackOut_32_4;
                      break L7;
                    }
                  }
                  L8: {
                    var14 = new ha(stackIn_34_2, stackIn_34_3, stackIn_34_4);
                    var14.field_b[0] = 0;
                    if (var13 != null) {
                      L9: {
                        var14.field_b[var13.length()] = param6.c(var13);
                        stackOut_36_0 = (String) var13;
                        stackOut_36_1 = (ha) var14;
                        stackOut_36_2 = param1 + 27329;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_38_2 = stackOut_36_2;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        if (param2 == 3) {
                          stackOut_38_0 = (String) (Object) stackIn_38_0;
                          stackOut_38_1 = (ha) (Object) stackIn_38_1;
                          stackOut_38_2 = stackIn_38_2;
                          stackOut_38_3 = ((la) this).a(param1 ^ -28135, param4, param6.c(var13), var13);
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          stackIn_39_3 = stackOut_38_3;
                          break L9;
                        } else {
                          stackOut_37_0 = (String) (Object) stackIn_37_0;
                          stackOut_37_1 = (ha) (Object) stackIn_37_1;
                          stackOut_37_2 = stackIn_37_2;
                          stackOut_37_3 = 0;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          stackIn_39_2 = stackOut_37_2;
                          stackIn_39_3 = stackOut_37_3;
                          break L9;
                        }
                      }
                      ta.a(stackIn_39_0, stackIn_39_1, stackIn_39_2, stackIn_39_3, param6);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  ((la) this).field_d[var12] = var14;
                  var11 = var11 + param7;
                  var12++;
                  continue L6;
                }
              }
            } else {
              ((la) this).field_d = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var9;
            stackOut_42_1 = new StringBuilder().append("la.D(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L10;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L10;
            }
          }
          L11: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param6 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L11;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L11;
            }
          }
          throw r.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + 44 + param7 + 41);
        }
    }

    private final ha a(int param0, nq param1, String param2, byte param3) {
        ha var5 = null;
        RuntimeException var5_ref = null;
        ha var6 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          var6 = new ha(-param1.field_J + param0, param0 - -param1.field_q, param2.length());
          var5 = var6;
          ((la) this).field_d = new ha[]{var6};
          return var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("la.G(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          L1: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 15 + 41);
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != 36) {
            la.a((byte) 14);
        }
        field_k = null;
        field_r = null;
        field_n = null;
        field_o = null;
    }

    final void a(nq param0, int param1, int param2, String param3, int param4) {
        ha var7 = null;
        ha var8 = null;
        if (param3 == null) {
            ((la) this).field_d = null;
            return;
        }
        if (((la) this).field_j == param0) {
            if (((la) this).field_f) {
                if (0 == ((la) this).field_p) {
                    if (null != ((la) this).field_g) {
                        if (!(!((la) this).field_g.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((la) this).field_j = param0;
            ((la) this).field_g = param3;
            ((la) this).field_f = true;
            ((la) this).field_p = 0;
            if (param2 != -4) {
                ((la) this).field_p = -108;
            }
            var7 = this.a(param1, param0, param3, (byte) 15);
            var8 = var7;
            var7.field_b[0] = param4;
            var8.field_b[param3.length()] = param0.c(param3) + param4;
            ta.a(param3, var8, param2 + 27333, 0, param0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "la.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final void a(int param0, int param1, nq param2, String param3, int param4) {
        ha var9 = null;
        ha var10 = null;
        if (!(param3 != null)) {
            ((la) this).field_d = null;
            return;
        }
        if (param2 == ((la) this).field_j) {
            if (((la) this).field_f) {
                if (((la) this).field_p == 2) {
                    if (((la) this).field_g != null) {
                        if (((la) this).field_g.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((la) this).field_f = true;
            ((la) this).field_j = param2;
            ((la) this).field_p = 2;
            ((la) this).field_g = param3;
            int var7 = 79 / ((59 - param0) / 47);
            var9 = this.a(param1, param2, param3, (byte) 15);
            var10 = var9;
            var10.field_b[0] = -param2.c(param3) + param4;
            var10.field_b[param3.length()] = param4;
            ta.a(param3, var10, 27329, 0, param2);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "la.F(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    public la() {
    }

    final static void a(boolean param0) {
        Object var2 = null;
        ce.a("", (String) null, (byte) 3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Exploiting a bug";
        field_n = "Game Type: Capture and Hold";
        field_r = new String[]{null, "turntime_icons", "game_icons", "galaxysize_icons", "type_icons"};
    }
}
