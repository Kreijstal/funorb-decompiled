/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends mp {
    private int field_j;
    private int field_m;
    static boolean field_h;
    private boolean field_o;
    private fm field_f;
    static int field_g;
    private int field_n;
    private int field_k;
    private int field_l;
    private String field_i;

    private final td a(fm param0, String param1, int param2, int param3) {
        td var5 = null;
        RuntimeException var5_ref = null;
        td var6 = null;
        td stackIn_1_0 = null;
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
        td stackOut_0_0 = null;
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
            var6 = new td(param2 - param0.field_C, param2 + param0.field_r, param1.length());
            var5 = var6;
            ((sp) this).field_e = new td[]{var6};
            stackOut_0_0 = (td) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("sp.L(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
            if (param1 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + 1 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, int param1, boolean param2, String param3, fm param4) {
        td var8 = null;
        td var9 = null;
        if (param3 == null) {
            ((sp) this).field_e = null;
            return;
        }
        if (((sp) this).field_f == param4) {
            if (((sp) this).field_o) {
                if (((sp) this).field_m == 2) {
                    if (((sp) this).field_i != null) {
                        if (!(!((sp) this).field_i.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((sp) this).field_m = 2;
            ((sp) this).field_o = param2 ? true : false;
            ((sp) this).field_i = param3;
            ((sp) this).field_f = param4;
            var8 = this.a(param4, param3, param1, 1);
            var9 = var8;
            var9.field_e[0] = -param4.a(param3) + param0;
            var9.field_e[param3.length()] = param0;
            qd.a(param4, 0, param3, 109, var9);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "sp.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, fm param2, String param3, int param4) {
        td var8 = null;
        td var9 = null;
        if (!(param3 != null)) {
            ((sp) this).field_e = null;
            return;
        }
        if (param2 == ((sp) this).field_f) {
            if (((sp) this).field_o) {
                if (((sp) this).field_m == 0) {
                    if (((sp) this).field_i != null) {
                        if (!(!((sp) this).field_i.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((sp) this).field_o = true;
            ((sp) this).field_m = 0;
            ((sp) this).field_i = param3;
            int var7 = -125 / ((-24 - param1) / 46);
            ((sp) this).field_f = param2;
            var8 = this.a(param2, param3, param4, 1);
            var9 = var8;
            var8.field_e[0] = param0;
            var9.field_e[param3.length()] = param0 - -param2.a(param3);
            qd.a(param2, 0, param3, 116, var9);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "sp.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void c(int param0) {
        nb.field_a.h(param0 ^ -123);
        if (!(pj.field_I != null)) {
            pj.field_I = new ta(nb.field_a, pm.field_P);
        }
        if (param0 != 0) {
            Object var2 = null;
            sp.a((go) null, -50, (java.awt.Frame) null);
        }
        nb.field_a.b(param0 + 3016, (cf) (Object) pj.field_I);
    }

    final void a(String param0, int param1, int param2, int param3, byte param4, int param5, int param6, fm param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        td var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        td stackIn_36_0 = null;
        td stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        td stackIn_37_0 = null;
        td stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        td stackIn_38_0 = null;
        td stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        fm stackIn_41_0 = null;
        fm stackIn_42_0 = null;
        fm stackIn_43_0 = null;
        int stackIn_43_1 = 0;
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
        td stackOut_35_0 = null;
        td stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        td stackOut_37_0 = null;
        td stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        td stackOut_36_0 = null;
        td stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        fm stackOut_40_0 = null;
        fm stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        fm stackOut_41_0 = null;
        int stackOut_41_1 = 0;
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
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param4 <= -16) {
              L1: {
                if (param3 != 0) {
                  break L1;
                } else {
                  param3 = param7.field_w;
                  break L1;
                }
              }
              if (param0 == null) {
                ((sp) this).field_e = null;
                return;
              } else {
                L2: {
                  if (param7 != ((sp) this).field_f) {
                    break L2;
                  } else {
                    if (((sp) this).field_o) {
                      break L2;
                    } else {
                      if (~((sp) this).field_m != ~param1) {
                        break L2;
                      } else {
                        if (~((sp) this).field_j != ~param5) {
                          break L2;
                        } else {
                          if (((sp) this).field_n != param3) {
                            break L2;
                          } else {
                            if (~param2 != ~((sp) this).field_l) {
                              break L2;
                            } else {
                              if (param6 != ((sp) this).field_k) {
                                break L2;
                              } else {
                                if (null == ((sp) this).field_i) {
                                  break L2;
                                } else {
                                  if (((sp) this).field_i.equals((Object) (Object) param0)) {
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
                  ((sp) this).field_l = param2;
                  ((sp) this).field_j = param5;
                  ((sp) this).field_k = param6;
                  ((sp) this).field_f = param7;
                  ((sp) this).field_i = param0;
                  ((sp) this).field_n = param3;
                  ((sp) this).field_o = false;
                  ((sp) this).field_m = param1;
                  var16 = new String[param7.b(param0, param6) + 1];
                  var17 = var16;
                  var10 = Math.max(1, param7.a(param0, new int[1], var17));
                  if (((sp) this).field_j != 3) {
                    break L3;
                  } else {
                    if (var10 == 1) {
                      ((sp) this).field_j = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  ((sp) this).field_e = new td[var10];
                  if (((sp) this).field_j == 0) {
                    var11 = param7.field_C;
                    break L4;
                  } else {
                    if (((sp) this).field_j != 1) {
                      if (2 != ((sp) this).field_j) {
                        L5: {
                          var12 = (-(((sp) this).field_n * var10) + ((sp) this).field_l) / (1 + var10);
                          if (var12 >= 0) {
                            break L5;
                          } else {
                            var12 = 0;
                            break L5;
                          }
                        }
                        ((sp) this).field_n = ((sp) this).field_n + var12;
                        var11 = param7.field_C + var12;
                        break L4;
                      } else {
                        var11 = -(((sp) this).field_n * var10) + -param7.field_r + ((sp) this).field_l;
                        break L4;
                      }
                    } else {
                      var11 = param7.field_C + (((sp) this).field_l + -(var10 * ((sp) this).field_n) >> 1);
                      break L4;
                    }
                  }
                }
                var12 = 0;
                L6: while (true) {
                  if (~var12 <= ~var10) {
                    break L0;
                  } else {
                    L7: {
                      var13 = var16[var12];
                      stackOut_35_0 = null;
                      stackOut_35_1 = null;
                      stackOut_35_2 = -param7.field_C + var11;
                      stackOut_35_3 = var11 + param7.field_r;
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
                      var14 = new td(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                      var14.field_e[0] = 0;
                      if (var13 != null) {
                        L9: {
                          var14.field_e[var13.length()] = param7.a(var13);
                          stackOut_40_0 = (fm) param7;
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_41_0 = stackOut_40_0;
                          if (param1 != 3) {
                            stackOut_42_0 = (fm) (Object) stackIn_42_0;
                            stackOut_42_1 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            stackIn_43_1 = stackOut_42_1;
                            break L9;
                          } else {
                            stackOut_41_0 = (fm) (Object) stackIn_41_0;
                            stackOut_41_1 = ((sp) this).a(var13, 0, param7.a(var13), param6);
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_43_1 = stackOut_41_1;
                            break L9;
                          }
                        }
                        qd.a(stackIn_43_0, stackIn_43_1, var13, 120, var14);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    ((sp) this).field_e[var12] = var14;
                    var11 = var11 + param3;
                    var12++;
                    continue L6;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var9;
            stackOut_46_1 = new StringBuilder().append("sp.O(");
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
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
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param7 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ')');
        }
    }

    final void a(fm param0, String param1, int param2, byte param3, int param4) {
        td var8 = null;
        int var7 = 0;
        if (param1 == null) {
            ((sp) this).field_e = null;
            return;
        }
        if (((sp) this).field_f == param0) {
            if (((sp) this).field_o) {
                if (((sp) this).field_m == 1) {
                    if (((sp) this).field_i != null) {
                        if (!(!((sp) this).field_i.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((sp) this).field_m = 1;
            ((sp) this).field_f = param0;
            ((sp) this).field_o = true;
            if (param3 != 65) {
                ((sp) this).field_o = false;
            }
            var8 = this.a(param0, param1, param2, 1);
            var7 = param0.a(param1);
            var8.field_e[0] = param4 + -(var7 >> 1);
            var8.field_e[param1.length()] = param4 - -(var7 >> 1);
            qd.a(param0, 0, param1, param3 ^ 61, var8);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "sp.M(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(go param0, int param1, java.awt.Frame param2) {
        di var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a(param2, true);
              L2: while (true) {
                if (0 != var3.field_f) {
                  if (1 != var3.field_f) {
                    vd.a(false, 100L);
                    continue L1;
                  } else {
                    if (param1 == 1) {
                      param2.setVisible(false);
                      param2.dispose();
                      break L0;
                    } else {
                      return;
                    }
                  }
                } else {
                  vd.a(false, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("sp.N(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    public sp() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = true;
    }
}
