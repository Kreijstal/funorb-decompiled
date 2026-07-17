/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da {
    private sw field_b;
    private ha field_a;

    private final void a(int param0, int param1, int param2) {
        vq.field_v = -1;
        if (!(param0 != -1)) {
            param0 = 0;
        }
        nn.field_b = param2;
        gqb.field_a = param2;
        drb.field_j = param1;
        oib.field_c = 0;
        wob.field_p = -1;
        qlb.field_a = param0;
        gba.field_q = param0;
    }

    abstract void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7);

    final int a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, boolean param7, int param8, int param9, String param10, int param11, int param12, aja[] param13, int param14, aa param15) {
        RuntimeException var17 = null;
        Object var18 = null;
        int stackIn_3_0 = 0;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (!param7) {
                break L1;
              } else {
                var18 = null;
                this.a(-23, -25, 54, (aja[]) null, (String) null, 8, -16, (aa) null, (int[]) null);
                break L1;
              }
            }
            stackOut_2_0 = this.a(param12, param3, param8, param10, param6, param13, param11, param0, 516, param4, param9, param1, param15, param2, 0, param5, param14);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var17;
            stackOut_4_1 = new StringBuilder().append("da.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param6 == null) {
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param7).append(44).append(param8).append(44).append(param9).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param10 == null) {
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
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param11).append(44).append(param12).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param13 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param14).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param15 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_3_0;
    }

    private final void a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var5 = 114 / ((-63 - param0) / 42);
            var4_int = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= param2.length()) {
                L2: {
                  if (0 < var4_int) {
                    drb.field_j = (-((da) this).field_b.a(param2, 1) + param1 << 8) / var4_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var8 = param2.charAt(var7);
                  if (60 == var8) {
                    var6 = 1;
                    break L3;
                  } else {
                    if (62 != var8) {
                      L4: {
                        if (var6 != 0) {
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var7++;
                      continue L1;
                    } else {
                      var6 = 0;
                      break L3;
                    }
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("da.C(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    private final int a(int param0, int param1, int param2, String param3, int[] param4, aja[] param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14, int param15, int param16) {
        Object var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_3_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_46_0 = 0;
        Object stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        Object stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        Object stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        Object stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        Object stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        Object stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        Object stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        Object stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        Object stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        Object stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        Object stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        Object stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        Object stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        Object stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        Object stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        Object stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        Object stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        Object stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        Object stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        Object stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        Object stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        Object stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var22 = VoidHunters.field_G;
        try {
          L0: {
            if (param3 != null) {
              L1: {
                this.a(param0, 0, param16);
                if (0 != param11) {
                  break L1;
                } else {
                  param11 = ((da) this).field_b.field_a;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (param7 >= ((da) this).field_b.field_c + ((da) this).field_b.field_e - -param11) {
                    break L3;
                  } else {
                    if (param7 >= param11 + param11) {
                      break L3;
                    } else {
                      var18 = null;
                      break L2;
                    }
                  }
                }
                var18 = (Object) (Object) new int[]{param10};
                break L2;
              }
              L4: {
                if (param14 != -1) {
                  break L4;
                } else {
                  param14 = param7 / param11;
                  if (param14 > 0) {
                    break L4;
                  } else {
                    param14 = 1;
                    break L4;
                  }
                }
              }
              L5: {
                var19 = ((da) this).field_b.a(param3, param5, (int[]) var18, vha.field_o, 4);
                if (param14 <= 0) {
                  break L5;
                } else {
                  if (var19 >= param14) {
                    var19 = param14;
                    vha.field_o[param14 - 1] = ((da) this).field_b.a(vha.field_o[param14 + -1], param10, -62, param5);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (param13 != 3) {
                  break L6;
                } else {
                  if (var19 != 1) {
                    break L6;
                  } else {
                    param13 = 1;
                    break L6;
                  }
                }
              }
              if (param8 == 516) {
                L7: {
                  if (param13 != 0) {
                    if (param13 != 1) {
                      if (param13 != 2) {
                        L8: {
                          var21 = (-((-1 + var19) * param11) + (-((da) this).field_b.field_e + -((da) this).field_b.field_c + param7)) / (var19 + 1);
                          if (var21 < 0) {
                            var21 = 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var20 = var21 + param9 - -((da) this).field_b.field_c;
                        param11 = param11 + var21;
                        break L7;
                      } else {
                        var20 = -((var19 + -1) * param11) + (param7 + (param9 - ((da) this).field_b.field_e));
                        break L7;
                      }
                    } else {
                      var20 = ((da) this).field_b.field_c + (param9 + (param7 - (((da) this).field_b.field_c + ((da) this).field_b.field_e - -(param11 * (-1 + var19)))) / 2);
                      break L7;
                    }
                  } else {
                    var20 = param9 + ((da) this).field_b.field_c;
                    break L7;
                  }
                }
                var21 = 0;
                L9: while (true) {
                  if (var19 <= var21) {
                    stackOut_45_0 = var19;
                    stackIn_46_0 = stackOut_45_0;
                    break L0;
                  } else {
                    L10: {
                      if (param6 != 0) {
                        if (1 == param6) {
                          this.a(var20, 27, param1, param5, vha.field_o[var21], param15 + (param10 + -((da) this).field_b.a(vha.field_o[var21], 1)) / 2, param2, param12, param4);
                          break L10;
                        } else {
                          if (param6 == 2) {
                            this.a(var20, param8 + -460, param1, param5, vha.field_o[var21], -((da) this).field_b.a(vha.field_o[var21], 1) + param15 - -param10, param2, param12, param4);
                            break L10;
                          } else {
                            if (var21 != -1 + var19) {
                              this.a(-116, param10, vha.field_o[var21]);
                              this.a(var20, param8 + -432, param1, param5, vha.field_o[var21], param15, param2, param12, param4);
                              drb.field_j = 0;
                              break L10;
                            } else {
                              this.a(var20, param8 + -613, param1, param5, vha.field_o[var21], param15, param2, param12, param4);
                              break L10;
                            }
                          }
                        }
                      } else {
                        this.a(var20, 97, param1, param5, vha.field_o[var21], param15, param2, param12, param4);
                        break L10;
                      }
                    }
                    var20 = var20 + param11;
                    var21++;
                    continue L9;
                  }
                }
              } else {
                stackOut_21_0 = 10;
                stackIn_22_0 = stackOut_21_0;
                return stackIn_22_0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var18 = (Object) (Object) decompiledCaughtException;
            stackOut_47_0 = var18;
            stackOut_47_1 = new StringBuilder().append("da.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param3 == null) {
              stackOut_49_0 = stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L11;
            } else {
              stackOut_48_0 = stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L11;
            }
          }
          L12: {
            stackOut_50_0 = stackIn_50_0;
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param4 == null) {
              stackOut_52_0 = stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L12;
            } else {
              stackOut_51_0 = stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L12;
            }
          }
          L13: {
            stackOut_53_0 = stackIn_53_0;
            stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(44);
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param5 == null) {
              stackOut_55_0 = stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L13;
            } else {
              stackOut_54_0 = stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L13;
            }
          }
          L14: {
            stackOut_56_0 = stackIn_56_0;
            stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44).append(param9).append(44).append(param10).append(44).append(param11).append(44);
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param12 == null) {
              stackOut_58_0 = stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L14;
            } else {
              stackOut_57_0 = stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L14;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + 44 + param13 + 44 + param14 + 44 + param15 + 44 + param16 + 41);
        }
        return stackIn_46_0;
    }

    private final void a(int param0, int param1, int param2, aja[] param3, String param4, int param5, int param6, aa param7, int[] param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16_ref_String = null;
        int var16 = 0;
        Exception var17 = null;
        int var17_int = 0;
        aja var18 = null;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        CharSequence var22 = null;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var21 = null;
        var20 = VoidHunters.field_G;
        try {
          L0: {
            var10_int = -5 % ((param1 - -34) / 35);
            param0 = param0 - ((da) this).field_b.field_a;
            var11 = -1;
            var12 = -1;
            var13 = param4.length();
            var14 = 0;
            L1: while (true) {
              if (var14 >= var13) {
                break L0;
              } else {
                L2: {
                  var15 = (char)(255 & aea.a(-123, param4.charAt(var14)));
                  if (var15 != 60) {
                    L3: {
                      if (var15 != 62) {
                        break L3;
                      } else {
                        if (var11 != -1) {
                          var16_ref_String = param4.substring(1 + var11, var14);
                          var11 = -1;
                          if (var16_ref_String.equals((Object) (Object) "lt")) {
                            var15 = 60;
                            break L3;
                          } else {
                            if (!var16_ref_String.equals((Object) (Object) "gt")) {
                              if (!var16_ref_String.equals((Object) (Object) "nbsp")) {
                                if (!var16_ref_String.equals((Object) (Object) "shy")) {
                                  if (!var16_ref_String.equals((Object) (Object) "times")) {
                                    if (!var16_ref_String.equals((Object) (Object) "euro")) {
                                      if (var16_ref_String.equals((Object) (Object) "copy")) {
                                        var15 = 169;
                                        break L3;
                                      } else {
                                        if (var16_ref_String.equals((Object) (Object) "reg")) {
                                          var15 = 174;
                                          break L3;
                                        } else {
                                          if (!var16_ref_String.startsWith("img=")) {
                                            this.a(97, var16_ref_String);
                                            break L2;
                                          } else {
                                            try {
                                              L4: {
                                                L5: {
                                                  var22 = (CharSequence) (Object) var16_ref_String.substring(4);
                                                  var17_int = lob.a(-118, var22);
                                                  var18 = param3[var17_int];
                                                  if (param8 == null) {
                                                    stackOut_25_0 = var18.b();
                                                    stackIn_26_0 = stackOut_25_0;
                                                    break L5;
                                                  } else {
                                                    stackOut_24_0 = param8[var17_int];
                                                    stackIn_26_0 = stackOut_24_0;
                                                    break L5;
                                                  }
                                                }
                                                L6: {
                                                  var19 = stackIn_26_0;
                                                  if ((gqb.field_a & -16777216) == -16777216) {
                                                    var18.a(param5, -var19 + (((da) this).field_b.field_a + param0), 1, 0, 1);
                                                    break L6;
                                                  } else {
                                                    var18.a(param5, ((da) this).field_b.field_a + param0 + -var19, 0, -16777216 & gqb.field_a | 16777215, 1);
                                                    break L6;
                                                  }
                                                }
                                                param5 = param5 + param3[var17_int].c();
                                                var12 = -1;
                                                break L4;
                                              }
                                            } catch (java.lang.Exception decompiledCaughtParameter0) {
                                              decompiledCaughtException = decompiledCaughtParameter0;
                                              L7: {
                                                var17 = (Exception) (Object) decompiledCaughtException;
                                                break L7;
                                              }
                                            }
                                            break L2;
                                          }
                                        }
                                      }
                                    } else {
                                      var15 = 8364;
                                      break L3;
                                    }
                                  } else {
                                    var15 = 215;
                                    break L3;
                                  }
                                } else {
                                  var15 = 173;
                                  break L3;
                                }
                              } else {
                                var15 = 160;
                                break L3;
                              }
                            } else {
                              var15 = 62;
                              break L3;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var11 == -1) {
                      L8: {
                        if (-1 != var12) {
                          param5 = param5 + ((da) this).field_b.a(var12, (char) var15, -101);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (var15 == 32) {
                          if (drb.field_j > 0) {
                            oib.field_c = oib.field_c + drb.field_j;
                            param5 = param5 + (oib.field_c >> 8);
                            oib.field_c = oib.field_c & 255;
                            break L9;
                          } else {
                            break L9;
                          }
                        } else {
                          if (param7 == null) {
                            L10: {
                              if ((-16777216 & gba.field_q) == 0) {
                                break L10;
                              } else {
                                ((da) this).fa((char) var15, param5 + 1, param0 + 1, gba.field_q, true);
                                break L10;
                              }
                            }
                            ((da) this).fa((char) var15, param5, param0, gqb.field_a, false);
                            break L9;
                          } else {
                            L11: {
                              if (0 == (gba.field_q & -16777216)) {
                                break L11;
                              } else {
                                ((da) this).a((char) var15, 1 + param5, param0 + 1, gba.field_q, true, param7, param6, param2);
                                break L11;
                              }
                            }
                            ((da) this).a((char) var15, param5, param0, gqb.field_a, false, param7, param6, param2);
                            break L9;
                          }
                        }
                      }
                      L12: {
                        var16 = ((da) this).field_b.a(var15, (byte) 46);
                        if (wob.field_p != -1) {
                          ((da) this).field_a.a(param5, -25559, wob.field_p, param0 + (int)(0.7 * (double)((da) this).field_b.field_a), var16);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if (vq.field_v == -1) {
                          break L13;
                        } else {
                          ((da) this).field_a.a(param5, -25559, vq.field_v, 1 + ((da) this).field_b.field_a + param0, var16);
                          break L13;
                        }
                      }
                      param5 = param5 + var16;
                      var12 = var15;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var11 = var14;
                    break L2;
                  }
                }
                var14++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var10 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var10;
            stackOut_60_1 = new StringBuilder().append("da.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param3 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L14;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L14;
            }
          }
          L15: {
            stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
            stackOut_63_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(44);
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param4 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L15;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L15;
            }
          }
          L16: {
            stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param7 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L16;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L16;
            }
          }
          L17: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(44);
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param8 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L17;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L17;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + 41);
        }
    }

    final void a(boolean param0, int param1, int param2, String param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        Object var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param3 != null) {
              L1: {
                this.a(param2, 0, param1);
                this.a(param4, 65, 0, (aja[]) null, param3, param5, 0, (aa) null, (int[]) null);
                if (param0) {
                  break L1;
                } else {
                  var8 = null;
                  this.a(81, (String) null);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("da.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    abstract void fa(char param0, int param1, int param2, int param3, boolean param4);

    private final void a(int param0, String param1) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (param1.startsWith("col=")) {
                    var5 = (CharSequence) (Object) param1.substring(4);
                    gqb.field_a = -16777216 & gqb.field_a | tib.a(-596, var5, 16) & 16777215;
                    break L2;
                  } else {
                    if (param1.equals((Object) (Object) "/col")) {
                      gqb.field_a = 16777215 & nn.field_b | gqb.field_a & -16777216;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param1.startsWith("argb=")) {
                    var9 = (CharSequence) (Object) param1.substring(5);
                    gqb.field_a = tib.a(-596, var9, 16);
                    break L3;
                  } else {
                    if (!param1.equals((Object) (Object) "/argb")) {
                      if (!param1.startsWith("str=")) {
                        if (!param1.equals((Object) (Object) "str")) {
                          if (param1.equals((Object) (Object) "/str")) {
                            wob.field_p = -1;
                            break L3;
                          } else {
                            if (!param1.startsWith("u=")) {
                              if (!param1.equals((Object) (Object) "u")) {
                                if (param1.equals((Object) (Object) "/u")) {
                                  vq.field_v = -1;
                                  break L3;
                                } else {
                                  if (!param1.equalsIgnoreCase("shad=-1")) {
                                    if (param1.startsWith("shad=")) {
                                      var8 = (CharSequence) (Object) param1.substring(5);
                                      gba.field_q = -16777216 & gqb.field_a | tib.a(-596, var8, 16);
                                      break L3;
                                    } else {
                                      if (!param1.equals((Object) (Object) "shad")) {
                                        if (!param1.equals((Object) (Object) "/shad")) {
                                          if (param1.equals((Object) (Object) "br")) {
                                            this.a(qlb.field_a, 0, nn.field_b);
                                            break L3;
                                          } else {
                                            break L3;
                                          }
                                        } else {
                                          gba.field_q = qlb.field_a;
                                          break L3;
                                        }
                                      } else {
                                        gba.field_q = gqb.field_a & -16777216;
                                        break L3;
                                      }
                                    }
                                  } else {
                                    gba.field_q = 0;
                                    break L3;
                                  }
                                }
                              } else {
                                vq.field_v = gqb.field_a & -16777216;
                                break L3;
                              }
                            } else {
                              var7 = (CharSequence) (Object) param1.substring(2);
                              vq.field_v = -16777216 & gqb.field_a | tib.a(-596, var7, 16);
                              break L3;
                            }
                          }
                        } else {
                          wob.field_p = gqb.field_a & -16777216 | 8388608;
                          break L3;
                        }
                      } else {
                        var6 = (CharSequence) (Object) param1.substring(4);
                        wob.field_p = gqb.field_a & -16777216 | tib.a(-596, var6, 16);
                        break L3;
                      }
                    } else {
                      gqb.field_a = nn.field_b;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (param0 >= 65) {
                    break L4;
                  } else {
                    ((da) this).field_b = null;
                    break L4;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3_ref;
            stackOut_38_1 = new StringBuilder().append("da.G(").append(param0).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L6;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, String param5) {
        if (!param3) {
            return;
        }
        if (param5 == null) {
            return;
        }
        try {
            this.a(param0, 0, param2);
            this.a(param1, 87, 0, (aja[]) null, param5, param4 + -((da) this).field_b.a(param5, 1), 0, (aa) null, (int[]) null);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "da.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    da(ha param0, sw param1) {
        try {
            ((da) this).field_b = param1;
            ((da) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "da.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
