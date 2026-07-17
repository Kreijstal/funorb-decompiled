/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends uj {
    private String field_d;
    static int field_m;
    private int field_i;
    private int field_e;
    static String field_j;
    private uc field_g;
    static int field_n;
    private int field_f;
    private int field_o;
    static String field_k;
    private int field_h;
    private boolean field_l;

    final void a(int param0, int param1, uc param2, int param3, String param4) {
        kp var8 = null;
        int var7 = 0;
        if (param4 == null) {
            ((cm) this).field_c = null;
            return;
        }
        if (((cm) this).field_g == param2) {
            if (((cm) this).field_l) {
                if (((cm) this).field_e == 1) {
                    if (null != ((cm) this).field_d) {
                        if (!(!((cm) this).field_d.equals((Object) (Object) param4))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((cm) this).field_e = 1;
            ((cm) this).field_l = true;
            ((cm) this).field_g = param2;
            var8 = this.a(param2, param3, param4, param1 ^ 1);
            var7 = param2.a(param4);
            var8.field_b[param1] = -(var7 >> 1) + param0;
            var8.field_b[param4.length()] = (var7 >> 1) + param0;
            rd.a(param2, param1 + 10580, 0, param4, var8);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "cm.O(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, uc param1, byte param2, int param3, int param4, String param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        kp var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        kp stackIn_36_0 = null;
        kp stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        kp stackIn_37_0 = null;
        kp stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        kp stackIn_38_0 = null;
        kp stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        uc stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        uc stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        uc stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        kp stackOut_35_0 = null;
        kp stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        kp stackOut_37_0 = null;
        kp stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        kp stackOut_36_0 = null;
        kp stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        uc stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        uc stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        uc stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var15 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param0 != 0) {
                break L1;
              } else {
                param0 = param1.field_q;
                break L1;
              }
            }
            if (param5 != null) {
              L2: {
                if (param1 != ((cm) this).field_g) {
                  break L2;
                } else {
                  if (((cm) this).field_l) {
                    break L2;
                  } else {
                    if (param6 != ((cm) this).field_e) {
                      break L2;
                    } else {
                      if (param7 != ((cm) this).field_o) {
                        break L2;
                      } else {
                        if (param0 != ((cm) this).field_f) {
                          break L2;
                        } else {
                          if (param3 != ((cm) this).field_h) {
                            break L2;
                          } else {
                            if (((cm) this).field_i != param4) {
                              break L2;
                            } else {
                              if (((cm) this).field_d == null) {
                                break L2;
                              } else {
                                if (!((cm) this).field_d.equals((Object) (Object) param5)) {
                                  break L2;
                                } else {
                                  return;
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
              ((cm) this).field_h = param3;
              if (param2 == 26) {
                L3: {
                  ((cm) this).field_l = false;
                  ((cm) this).field_f = param0;
                  ((cm) this).field_e = param6;
                  ((cm) this).field_o = param7;
                  ((cm) this).field_g = param1;
                  ((cm) this).field_d = param5;
                  ((cm) this).field_i = param4;
                  var16 = new String[1 + param1.c(param5, param4)];
                  var17 = var16;
                  var10 = Math.max(1, param1.a(param5, new int[1], var17));
                  if (((cm) this).field_o != 3) {
                    break L3;
                  } else {
                    if (var10 == 1) {
                      ((cm) this).field_o = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  ((cm) this).field_c = new kp[var10];
                  if (((cm) this).field_o != 0) {
                    if (((cm) this).field_o != 1) {
                      if (((cm) this).field_o != 2) {
                        L5: {
                          var12 = (((cm) this).field_h + -(var10 * ((cm) this).field_f)) / (var10 - -1);
                          if (var12 < 0) {
                            var12 = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ((cm) this).field_f = ((cm) this).field_f + var12;
                        var11 = var12 + param1.field_x;
                        break L4;
                      } else {
                        var11 = -param1.field_t + ((cm) this).field_h + -(var10 * ((cm) this).field_f);
                        break L4;
                      }
                    } else {
                      var11 = (((cm) this).field_h + -(var10 * ((cm) this).field_f) >> 1) + param1.field_x;
                      break L4;
                    }
                  } else {
                    var11 = param1.field_x;
                    break L4;
                  }
                }
                var12 = 0;
                L6: while (true) {
                  if (var12 >= var10) {
                    break L0;
                  } else {
                    L7: {
                      var13 = var16[var12];
                      stackOut_35_0 = null;
                      stackOut_35_1 = null;
                      stackOut_35_2 = var11 + -param1.field_x;
                      stackOut_35_3 = param1.field_t + var11;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      stackIn_37_3 = stackOut_35_3;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      stackIn_36_2 = stackOut_35_2;
                      stackIn_36_3 = stackOut_35_3;
                      if (var13 != null) {
                        stackOut_37_0 = null;
                        stackOut_37_1 = null;
                        stackOut_37_2 = stackIn_37_2;
                        stackOut_37_3 = stackIn_37_3;
                        stackOut_37_4 = var13.length();
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
                        stackOut_36_4 = 0;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_38_2 = stackOut_36_2;
                        stackIn_38_3 = stackOut_36_3;
                        stackIn_38_4 = stackOut_36_4;
                        break L7;
                      }
                    }
                    L8: {
                      var14 = new kp(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                      var14.field_b[0] = 0;
                      if (var13 != null) {
                        L9: {
                          var14.field_b[var13.length()] = param1.a(var13);
                          stackOut_40_0 = (uc) param1;
                          stackOut_40_1 = 10580;
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_42_1 = stackOut_40_1;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          if (param6 != 3) {
                            stackOut_42_0 = (uc) (Object) stackIn_42_0;
                            stackOut_42_1 = stackIn_42_1;
                            stackOut_42_2 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            stackIn_43_1 = stackOut_42_1;
                            stackIn_43_2 = stackOut_42_2;
                            break L9;
                          } else {
                            stackOut_41_0 = (uc) (Object) stackIn_41_0;
                            stackOut_41_1 = stackIn_41_1;
                            stackOut_41_2 = ((cm) this).a(-127, param1.a(var13), var13, param4);
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_43_1 = stackOut_41_1;
                            stackIn_43_2 = stackOut_41_2;
                            break L9;
                          }
                        }
                        rd.a(stackIn_43_0, stackIn_43_1, stackIn_43_2, var13, var14);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    ((cm) this).field_c[var12] = var14;
                    var11 = var11 + param0;
                    var12++;
                    continue L6;
                  }
                }
              } else {
                return;
              }
            } else {
              ((cm) this).field_c = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var9;
            stackOut_46_1 = new StringBuilder().append("cm.K(").append(param0).append(44);
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L10;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L10;
            }
          }
          L11: {
            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param5 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L11;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L11;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static int a(int param0, int param1) {
        int var2 = (param1 * param1 >> 12) * param1 >> 12;
        int var3 = param1 * 6 + -61440;
        int var4 = (var3 * param1 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    public static void a() {
        field_j = null;
        field_k = null;
    }

    private final kp a(uc param0, int param1, String param2, int param3) {
        kp var5 = null;
        RuntimeException var5_ref = null;
        kp var6 = null;
        Object stackIn_2_0 = null;
        kp stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        kp stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param3 == 1) {
              var6 = new kp(-param0.field_x + param1, param0.field_t + param1, param2.length());
              var5 = var6;
              ((cm) this).field_c = new kp[]{var6};
              stackOut_3_0 = (kp) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (kp) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("cm.M(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            wb.a(param1, 390);
            jk.a(ii.field_m, (byte) -79, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("cm.P(").append(-21).append(44);
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
          throw rb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    final void a(int param0, int param1, uc param2, String param3, int param4) {
        kp var8 = null;
        kp var9 = null;
        if (!(param3 != null)) {
            ((cm) this).field_c = null;
            return;
        }
        if (param1 != -22746) {
            ((cm) this).field_l = true;
        }
        if (param2 == ((cm) this).field_g) {
            if (((cm) this).field_l) {
                if (((cm) this).field_e == 2) {
                    if (((cm) this).field_d != null) {
                        if (((cm) this).field_d.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((cm) this).field_l = true;
            ((cm) this).field_d = param3;
            ((cm) this).field_e = 2;
            ((cm) this).field_g = param2;
            var8 = this.a(param2, param0, param3, 1);
            var9 = var8;
            var9.field_b[0] = param4 + -param2.a(param3);
            var9.field_b[param3.length()] = param4;
            rd.a(param2, param1 ^ -29070, 0, param3, var9);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "cm.Q(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final void a(String param0, byte param1, uc param2, int param3, int param4) {
        kp var8 = null;
        kp var9 = null;
        if (param0 == null) {
            ((cm) this).field_c = null;
            return;
        }
        if (param2 == ((cm) this).field_g) {
            if (((cm) this).field_l) {
                if (((cm) this).field_e == 0) {
                    if (((cm) this).field_d != null) {
                        if (((cm) this).field_d.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((cm) this).field_e = 0;
            ((cm) this).field_d = param0;
            ((cm) this).field_l = true;
            ((cm) this).field_g = param2;
            var8 = this.a(param2, param3, param0, 1);
            var9 = var8;
            int var7 = -83 / ((param1 - -22) / 59);
            var8.field_b[0] = param4;
            var9.field_b[param0.length()] = param2.a(param0) + param4;
            rd.a(param2, 10580, 0, param0, var9);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "cm.N(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    public cm() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 20;
        field_j = "Resume Game";
        field_k = "Go Back";
    }
}
