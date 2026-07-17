/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends bja {
    static String field_i;
    private int field_f;
    private boolean field_h;
    static nh field_l;
    private il field_j;
    private String field_k;
    private int field_e;
    private int field_n;
    private int field_g;
    private int field_m;

    final static int a(int param0, int param1, int param2, byte param3, g[] param4) {
        g var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5 = param4[param1];
            csa.a(param0, 2097152, param1, param4);
            var6 = param2;
            if (param3 == -65) {
              var7 = param2;
              L1: while (true) {
                if (param0 <= var7) {
                  csa.a(param0, param3 ^ -2097217, var6, param4);
                  stackOut_9_0 = var6;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  L2: {
                    if (param4[var7].field_e.b((byte) -98) > var5.field_e.b((byte) -105)) {
                      break L2;
                    } else {
                      csa.a(var6, 2097152, var7, param4);
                      var6++;
                      break L2;
                    }
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 30;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5_ref;
            stackOut_11_1 = new StringBuilder().append("po.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final void a(il param0, byte param1, String param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        kha var14 = null;
        int var15 = 0;
        Object var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        kha stackIn_34_0 = null;
        kha stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        kha stackIn_35_0 = null;
        kha stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        kha stackIn_36_0 = null;
        kha stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        il stackIn_38_2 = null;
        kha stackIn_38_3 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        il stackIn_39_2 = null;
        kha stackIn_39_3 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        il stackIn_40_2 = null;
        kha stackIn_40_3 = null;
        int stackIn_40_4 = 0;
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
        kha stackOut_33_0 = null;
        kha stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        kha stackOut_35_0 = null;
        kha stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        kha stackOut_34_0 = null;
        kha stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        il stackOut_37_2 = null;
        kha stackOut_37_3 = null;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        il stackOut_39_2 = null;
        kha stackOut_39_3 = null;
        int stackOut_39_4 = 0;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        il stackOut_38_2 = null;
        kha stackOut_38_3 = null;
        int stackOut_38_4 = 0;
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
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != param7) {
                break L1;
              } else {
                param7 = param0.field_m;
                break L1;
              }
            }
            if (param2 != null) {
              L2: {
                if (((po) this).field_j != param0) {
                  break L2;
                } else {
                  if (((po) this).field_h) {
                    break L2;
                  } else {
                    if (((po) this).field_m != param6) {
                      break L2;
                    } else {
                      if (((po) this).field_e != param4) {
                        break L2;
                      } else {
                        if (((po) this).field_g != param7) {
                          break L2;
                        } else {
                          if (((po) this).field_f != param5) {
                            break L2;
                          } else {
                            if (param3 != ((po) this).field_n) {
                              break L2;
                            } else {
                              if (((po) this).field_k == null) {
                                break L2;
                              } else {
                                if (!((po) this).field_k.equals((Object) (Object) param2)) {
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
              L3: {
                ((po) this).field_n = param3;
                ((po) this).field_e = param4;
                ((po) this).field_j = param0;
                ((po) this).field_k = param2;
                ((po) this).field_m = param6;
                ((po) this).field_g = param7;
                ((po) this).field_f = param5;
                ((po) this).field_h = false;
                var17 = new String[param0.a(param2, param3) + 1];
                var18 = var17;
                var10 = Math.max(1, param0.a(param2, new int[1], var18));
                if (3 != ((po) this).field_e) {
                  break L3;
                } else {
                  if (var10 == 1) {
                    ((po) this).field_e = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (0 != ((po) this).field_e) {
                  if (((po) this).field_e == 1) {
                    var11 = (((po) this).field_f + -(var10 * ((po) this).field_g) >> 1) + param0.field_w;
                    break L4;
                  } else {
                    if (((po) this).field_e == 2) {
                      var11 = ((po) this).field_f + (-param0.field_k + -(((po) this).field_g * var10));
                      break L4;
                    } else {
                      L5: {
                        var12 = (((po) this).field_f - var10 * ((po) this).field_g) / (1 + var10);
                        if (var12 < 0) {
                          var12 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var11 = var12 + param0.field_w;
                      ((po) this).field_g = ((po) this).field_g + var12;
                      break L4;
                    }
                  }
                } else {
                  var11 = param0.field_w;
                  break L4;
                }
              }
              ((po) this).field_c = new kha[var10];
              var12 = 0;
              L6: while (true) {
                if (var12 >= var10) {
                  L7: {
                    if (param1 == -49) {
                      break L7;
                    } else {
                      var16 = null;
                      ((po) this).a(58, (il) null, 24, (String) null, -110);
                      break L7;
                    }
                  }
                  break L0;
                } else {
                  L8: {
                    var13 = var17[var12];
                    stackOut_33_0 = null;
                    stackOut_33_1 = null;
                    stackOut_33_2 = var11 + -param0.field_w;
                    stackOut_33_3 = var11 - -param0.field_k;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    stackIn_35_2 = stackOut_33_2;
                    stackIn_35_3 = stackOut_33_3;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    stackIn_34_2 = stackOut_33_2;
                    stackIn_34_3 = stackOut_33_3;
                    if (var13 == null) {
                      stackOut_35_0 = null;
                      stackOut_35_1 = null;
                      stackOut_35_2 = stackIn_35_2;
                      stackOut_35_3 = stackIn_35_3;
                      stackOut_35_4 = 0;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      stackIn_36_2 = stackOut_35_2;
                      stackIn_36_3 = stackOut_35_3;
                      stackIn_36_4 = stackOut_35_4;
                      break L8;
                    } else {
                      stackOut_34_0 = null;
                      stackOut_34_1 = null;
                      stackOut_34_2 = stackIn_34_2;
                      stackOut_34_3 = stackIn_34_3;
                      stackOut_34_4 = var13.length();
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      stackIn_36_2 = stackOut_34_2;
                      stackIn_36_3 = stackOut_34_3;
                      stackIn_36_4 = stackOut_34_4;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new kha(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                    var14.field_c[0] = 0;
                    if (var13 == null) {
                      break L9;
                    } else {
                      L10: {
                        var14.field_c[var13.length()] = param0.b(var13);
                        stackOut_37_0 = param1 ^ -2097201;
                        stackOut_37_1 = (String) var13;
                        stackOut_37_2 = (il) param0;
                        stackOut_37_3 = (kha) var14;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        stackIn_39_3 = stackOut_37_3;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        stackIn_38_3 = stackOut_37_3;
                        if (param6 != 3) {
                          stackOut_39_0 = stackIn_39_0;
                          stackOut_39_1 = (String) (Object) stackIn_39_1;
                          stackOut_39_2 = (il) (Object) stackIn_39_2;
                          stackOut_39_3 = (kha) (Object) stackIn_39_3;
                          stackOut_39_4 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          stackIn_40_3 = stackOut_39_3;
                          stackIn_40_4 = stackOut_39_4;
                          break L10;
                        } else {
                          stackOut_38_0 = stackIn_38_0;
                          stackOut_38_1 = (String) (Object) stackIn_38_1;
                          stackOut_38_2 = (il) (Object) stackIn_38_2;
                          stackOut_38_3 = (kha) (Object) stackIn_38_3;
                          stackOut_38_4 = ((po) this).a(0, var13, param3, param0.b(var13));
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          stackIn_40_3 = stackOut_38_3;
                          stackIn_40_4 = stackOut_38_4;
                          break L10;
                        }
                      }
                      jh.a(stackIn_40_0, stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_40_4);
                      break L9;
                    }
                  }
                  var11 = var11 + param7;
                  ((po) this).field_c[var12] = var14;
                  var12++;
                  continue L6;
                }
              }
            } else {
              ((po) this).field_c = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var9;
            stackOut_45_1 = new StringBuilder().append("po.G(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
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
          L12: {
            stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(44).append(param1).append(44);
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param2 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L12;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L12;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final void a(int param0, il param1, int param2, String param3, int param4) {
        kha var8 = null;
        kha var9 = null;
        if (param3 == null) {
            ((po) this).field_c = null;
            return;
        }
        if (((po) this).field_j == param1) {
            if (((po) this).field_h) {
                if (((po) this).field_m == 2) {
                    if (((po) this).field_k != null) {
                        if (((po) this).field_k.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((po) this).field_m = 2;
            ((po) this).field_k = param3;
            ((po) this).field_h = true;
            ((po) this).field_j = param1;
            var8 = this.a(param1, 0, param3, param2);
            var9 = var8;
            var9.field_c[param0] = param4 + -param1.b(param3);
            var9.field_c[param3.length()] = param4;
            jh.a(2097152, param3, param1, var9, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "po.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    private final kha a(il param0, int param1, String param2, int param3) {
        kha var5 = null;
        RuntimeException var5_ref = null;
        Object var6 = null;
        kha var7 = null;
        kha stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        kha stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var6 = null;
                ((po) this).a(114, -55, (il) null, (String) null, -39);
                break L1;
              }
            }
            var7 = new kha(param3 - param0.field_w, param0.field_k + param3, param2.length());
            var5 = var7;
            ((po) this).field_c = new kha[]{var7};
            stackOut_2_0 = (kha) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("po.E(");
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, il param2, String param3, byte param4) {
        kha var7 = null;
        int var8 = 0;
        int var6_int = 38 / ((param4 - 5) / 54);
        if (!(param3 != null)) {
            ((po) this).field_c = null;
            return;
        }
        if (((po) this).field_j == param2) {
            if (((po) this).field_h) {
                if (1 == ((po) this).field_m) {
                    if (((po) this).field_k != null) {
                        if (((po) this).field_k.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((po) this).field_j = param2;
            ((po) this).field_h = true;
            ((po) this).field_m = 1;
            var7 = this.a(param2, 0, param3, param0);
            var8 = param2.b(param3);
            var7.field_c[0] = param1 - (var8 >> 1);
            var7.field_c[param3.length()] = (var8 >> 1) + param1;
            jh.a(2097152, param3, param2, var7, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "po.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final void a(int param0, int param1, il param2, String param3, int param4) {
        if (!(param3 != null)) {
            ((po) this).field_c = null;
            return;
        }
        if (param2 == ((po) this).field_j) {
            if (((po) this).field_h) {
                if (0 == ((po) this).field_m) {
                    if (((po) this).field_k != null) {
                        if (!(!((po) this).field_k.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        ((po) this).field_j = param2;
        ((po) this).field_h = true;
        ((po) this).field_k = param3;
        ((po) this).field_m = 0;
        kha var7 = this.a(param2, 0, param3, param1);
        kha var8 = var7;
        var7.field_c[0] = param4;
        var8.field_c[param3.length()] = param2.b(param3) + param4;
        if (param0 != 16512) {
            return;
        }
        try {
            jh.a(param0 ^ 2113664, param3, param2, var8, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "po.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_l = null;
    }

    public po() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Back";
    }
}
