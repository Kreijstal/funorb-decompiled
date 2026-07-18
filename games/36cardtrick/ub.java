/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends mj {
    private int field_l;
    private int field_g;
    static String field_k;
    private String field_j;
    private boolean field_m;
    private ee field_h;
    private int field_f;
    private int field_i;
    private int field_n;

    final void a(String param0, int param1, ee param2, int param3, int param4) {
        di var7 = null;
        di var8 = null;
        if (!(param0 != null)) {
            ((ub) this).field_d = null;
            return;
        }
        if (param2 == ((ub) this).field_h) {
            if (((ub) this).field_m) {
                if (((ub) this).field_i == 0) {
                    if (((ub) this).field_j != null) {
                        if (((ub) this).field_j.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        if (param1 != 1) {
            return;
        }
        try {
            ((ub) this).field_h = param2;
            ((ub) this).field_m = true;
            ((ub) this).field_j = param0;
            ((ub) this).field_i = 0;
            var7 = this.a(param3, (byte) -88, param2, param0);
            var8 = var7;
            var7.field_a[0] = param4;
            var8.field_a[param0.length()] = param4 - -param2.a(param0);
            s.a(param2, (byte) 61, 0, var8, param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ub.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, byte param1, int param2, ee param3, int param4) {
        di var8 = null;
        di var9 = null;
        if (!(param0 != null)) {
            ((ub) this).field_d = null;
            return;
        }
        if (param1 >= -86) {
            return;
        }
        if (param3 == ((ub) this).field_h) {
            if (((ub) this).field_m) {
                if (2 == ((ub) this).field_i) {
                    if (((ub) this).field_j != null) {
                        if (((ub) this).field_j.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((ub) this).field_h = param3;
            ((ub) this).field_j = param0;
            ((ub) this).field_m = true;
            ((ub) this).field_i = 2;
            var8 = this.a(param2, (byte) -103, param3, param0);
            var9 = var8;
            var9.field_a[0] = -param3.a(param0) + param4;
            var9.field_a[param0.length()] = param4;
            s.a(param3, (byte) 61, 0, var9, param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ub.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final di a(int param0, byte param1, ee param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        di var6 = null;
        di stackIn_1_0 = null;
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
        di stackOut_0_0 = null;
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
          L0: {
            var5_int = -67 % ((-6 - param1) / 42);
            var6 = new di(-param2.field_s + param0, param0 - -param2.field_x, param3.length());
            ((ub) this).field_d = new di[]{var6};
            stackOut_0_0 = (di) var6;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("ub.K(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void c(int param0) {
        if (param0 != 0) {
            ub.c(-117);
        }
        uk.a("", param0 + -23804, (String) null);
    }

    public static void d(int param0) {
        field_k = null;
    }

    final void a(ee param0, int param1, String param2, int param3, int param4) {
        di var7 = null;
        int var8 = 0;
        if (!(param2 != null)) {
            ((ub) this).field_d = null;
            return;
        }
        if (param0 == ((ub) this).field_h) {
            if (((ub) this).field_m) {
                if (1 == ((ub) this).field_i) {
                    if (null != ((ub) this).field_j) {
                        if (((ub) this).field_j.equals((Object) (Object) param2)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((ub) this).field_h = param0;
            ((ub) this).field_m = true;
            ((ub) this).field_i = 1;
            int var6_int = 99 % ((35 - param3) / 59);
            var7 = this.a(param1, (byte) 41, param0, param2);
            var8 = param0.a(param2);
            var7.field_a[0] = param4 - (var8 >> 1);
            var7.field_a[param2.length()] = param4 - -(var8 >> 1);
            s.a(param0, (byte) 61, 0, var7, param2);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ub.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, ee param4, int param5, String param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        di var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        di stackIn_36_0 = null;
        di stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        di stackIn_37_0 = null;
        di stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        di stackIn_38_0 = null;
        di stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        ee stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        ee stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        ee stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        di stackOut_35_0 = null;
        di stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        di stackOut_37_0 = null;
        di stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        di stackOut_36_0 = null;
        di stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        ee stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        ee stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        ee stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var15 = Main.field_T;
        try {
          L0: {
            L1: {
              if (0 == param7) {
                param7 = param4.field_E;
                break L1;
              } else {
                break L1;
              }
            }
            if (param6 == null) {
              ((ub) this).field_d = null;
              return;
            } else {
              L2: {
                if (param4 != ((ub) this).field_h) {
                  break L2;
                } else {
                  if (((ub) this).field_m) {
                    break L2;
                  } else {
                    if (param5 != ((ub) this).field_i) {
                      break L2;
                    } else {
                      if (((ub) this).field_n != param2) {
                        break L2;
                      } else {
                        if (param7 != ((ub) this).field_g) {
                          break L2;
                        } else {
                          if (param0 != ((ub) this).field_f) {
                            break L2;
                          } else {
                            if (param3 != ((ub) this).field_l) {
                              break L2;
                            } else {
                              if (((ub) this).field_j == null) {
                                break L2;
                              } else {
                                if (((ub) this).field_j.equals((Object) (Object) param6)) {
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
              ((ub) this).field_f = param0;
              ((ub) this).field_l = param3;
              if (param1 == 841570337) {
                L3: {
                  ((ub) this).field_h = param4;
                  ((ub) this).field_n = param2;
                  ((ub) this).field_i = param5;
                  ((ub) this).field_g = param7;
                  ((ub) this).field_j = param6;
                  ((ub) this).field_m = false;
                  var16 = new String[1 + param4.b(param6, param3)];
                  var17 = var16;
                  var10 = Math.max(1, param4.a(param6, new int[1], var17));
                  if (((ub) this).field_n != 3) {
                    break L3;
                  } else {
                    if (var10 != 1) {
                      break L3;
                    } else {
                      ((ub) this).field_n = 1;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (((ub) this).field_n != 0) {
                    if (((ub) this).field_n != 1) {
                      if (-3 == ((ub) this).field_n) {
                        var11 = ((ub) this).field_f - (param4.field_x - -(var10 * ((ub) this).field_g));
                        break L4;
                      } else {
                        L5: {
                          var12 = (((ub) this).field_f - var10 * ((ub) this).field_g) / (var10 + 1);
                          if (-1 <= var12) {
                            break L5;
                          } else {
                            var12 = 0;
                            break L5;
                          }
                        }
                        var11 = param4.field_s + var12;
                        ((ub) this).field_g = ((ub) this).field_g + var12;
                        break L4;
                      }
                    } else {
                      var11 = (-(((ub) this).field_g * var10) + ((ub) this).field_f >> 1) + param4.field_s;
                      break L4;
                    }
                  } else {
                    var11 = param4.field_s;
                    break L4;
                  }
                }
                ((ub) this).field_d = new di[var10];
                var12 = 0;
                L6: while (true) {
                  if (var12 >= var10) {
                    break L0;
                  } else {
                    L7: {
                      var13 = var16[var12];
                      stackOut_35_0 = null;
                      stackOut_35_1 = null;
                      stackOut_35_2 = -param4.field_s + var11;
                      stackOut_35_3 = param4.field_x + var11;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      stackIn_37_3 = stackOut_35_3;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      stackIn_36_2 = stackOut_35_2;
                      stackIn_36_3 = stackOut_35_3;
                      if (var13 == null) {
                        stackOut_37_0 = null;
                        stackOut_37_1 = null;
                        stackOut_37_2 = stackIn_37_2;
                        stackOut_37_3 = stackIn_37_3;
                        stackOut_37_4 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        stackIn_38_3 = stackOut_37_3;
                        stackIn_38_4 = stackOut_37_4;
                        break L7;
                      } else {
                        stackOut_36_0 = null;
                        stackOut_36_1 = null;
                        stackOut_36_2 = stackIn_36_2;
                        stackOut_36_3 = stackIn_36_3;
                        stackOut_36_4 = var13.length();
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_38_2 = stackOut_36_2;
                        stackIn_38_3 = stackOut_36_3;
                        stackIn_38_4 = stackOut_36_4;
                        break L7;
                      }
                    }
                    L8: {
                      var14 = new di(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                      var14.field_a[0] = 0;
                      if (var13 == null) {
                        break L8;
                      } else {
                        L9: {
                          var14.field_a[var13.length()] = param4.a(var13);
                          stackOut_39_0 = (ee) param4;
                          stackOut_39_1 = 61;
                          stackIn_41_0 = stackOut_39_0;
                          stackIn_41_1 = stackOut_39_1;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          if (param5 != 3) {
                            stackOut_41_0 = (ee) (Object) stackIn_41_0;
                            stackOut_41_1 = stackIn_41_1;
                            stackOut_41_2 = 0;
                            stackIn_42_0 = stackOut_41_0;
                            stackIn_42_1 = stackOut_41_1;
                            stackIn_42_2 = stackOut_41_2;
                            break L9;
                          } else {
                            stackOut_40_0 = (ee) (Object) stackIn_40_0;
                            stackOut_40_1 = stackIn_40_1;
                            stackOut_40_2 = ((ub) this).a(param3, param4.a(var13), var13, -53);
                            stackIn_42_0 = stackOut_40_0;
                            stackIn_42_1 = stackOut_40_1;
                            stackIn_42_2 = stackOut_40_2;
                            break L9;
                          }
                        }
                        s.a(stackIn_42_0, (byte) stackIn_42_1, stackIn_42_2, var14, var13);
                        break L8;
                      }
                    }
                    ((ub) this).field_d[var12] = var14;
                    var11 = var11 + param7;
                    var12++;
                    continue L6;
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var9;
            stackOut_45_1 = new StringBuilder().append("ub.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param4 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L10;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L10;
            }
          }
          L11: {
            stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param5).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param6 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L11;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L11;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ',' + param7 + ')');
        }
    }

    public ub() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = null;
    }
}
