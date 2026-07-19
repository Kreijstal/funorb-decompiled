/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da {
    private ta field_b;
    private ha field_a;

    final void a(int param0, int param1, int param2, String param3, byte param4, int param5) {
        if (param4 > -7) {
            return;
        }
        if (!(param3 != null)) {
            return;
        }
        try {
            this.a(param2, param5, 60);
            this.a(-274, param0, (hr[]) null, param1, 0, 0, param3, (int[]) null, (aa) null);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "da.I(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3, int param4, int[] param5, hr[] param6, int param7, int param8, int param9, int param10, int param11, String param12, aa param13, int param14, int param15) {
        RuntimeException var17 = null;
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
              if (param11 == -8787) {
                break L1;
              } else {
                this.field_a = (ha) null;
                break L1;
              }
            }
            stackOut_2_0 = this.a(param13, param6, param2, param5, param12, param0, param1, param10, 0, param8, param4, param3, param14, param9, 92, param15, param7);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var17);
            stackOut_4_1 = new StringBuilder().append("da.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param12 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param13 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param14 + ',' + param15 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5) {
        if (param2 == null) {
            return;
        }
        try {
            if (param5 < 40) {
                this.field_a = (ha) null;
            }
            this.a(param4, param0, 60);
            this.a(-274, param3, (hr[]) null, -this.field_b.a(param2, 0) + param1, 0, 0, param2, (int[]) null, (aa) null);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "da.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(String param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        Exception var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        CharSequence var10 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = -2 / ((param1 - 31) / 40);
            try {
              L1: {
                L2: {
                  L3: {
                    if (param0.startsWith("col=")) {
                      break L3;
                    } else {
                      if (!param0.equals("/col")) {
                        break L2;
                      } else {
                        mn.field_i = 16777215 & fs.field_l | -16777216 & mn.field_i;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var6 = (CharSequence) ((Object) param0.substring(4));
                  mn.field_i = mn.field_i & -16777216 | 16777215 & ea.a((byte) -73, var6, 16);
                  break L2;
                }
                L4: {
                  L5: {
                    L6: {
                      if (!param0.startsWith("argb=")) {
                        break L6;
                      } else {
                        var7 = (CharSequence) ((Object) param0.substring(5));
                        mn.field_i = ea.a((byte) -73, var7, 16);
                        if (var5 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (!param0.equals("/argb")) {
                        break L7;
                      } else {
                        mn.field_i = fs.field_l;
                        if (var5 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (!param0.startsWith("str=")) {
                        break L8;
                      } else {
                        var8 = (CharSequence) ((Object) param0.substring(4));
                        vo.field_I = -16777216 & mn.field_i | ea.a((byte) -73, var8, 16);
                        if (var5 == 0) {
                          break L5;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (!param0.equals("str")) {
                        break L9;
                      } else {
                        vo.field_I = 8388608 | -16777216 & mn.field_i;
                        if (var5 == 0) {
                          break L5;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (!param0.equals("/str")) {
                        break L10;
                      } else {
                        vo.field_I = -1;
                        if (var5 == 0) {
                          break L5;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (!param0.startsWith("u=")) {
                        break L11;
                      } else {
                        var9 = (CharSequence) ((Object) param0.substring(2));
                        fl.field_p = -16777216 & mn.field_i | ea.a((byte) -73, var9, 16);
                        if (var5 == 0) {
                          break L5;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (!param0.equals("u")) {
                        break L12;
                      } else {
                        fl.field_p = -16777216 & mn.field_i;
                        if (var5 == 0) {
                          break L5;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (!param0.equals("/u")) {
                        break L13;
                      } else {
                        fl.field_p = -1;
                        if (var5 == 0) {
                          break L5;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (param0.equalsIgnoreCase("shad=-1")) {
                        break L14;
                      } else {
                        L15: {
                          if (param0.startsWith("shad=")) {
                            break L15;
                          } else {
                            L16: {
                              if (!param0.equals("shad")) {
                                break L16;
                              } else {
                                jj.field_b = mn.field_i & -16777216;
                                if (var5 == 0) {
                                  break L5;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            L17: {
                              if (!param0.equals("/shad")) {
                                break L17;
                              } else {
                                jj.field_b = jv.field_b;
                                if (var5 == 0) {
                                  break L5;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            if (!param0.equals("br")) {
                              break L5;
                            } else {
                              this.a(fs.field_l, jv.field_b, 60);
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        var10 = (CharSequence) ((Object) param0.substring(5));
                        jj.field_b = mn.field_i & -16777216 | ea.a((byte) -73, var10, 16);
                        if (var5 == 0) {
                          break L5;
                        } else {
                          break L14;
                        }
                      }
                    }
                    jj.field_b = 0;
                    break L4;
                  }
                  break L4;
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L18: {
                var4 = (Exception) (Object) decompiledCaughtException;
                break L18;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L19: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) (var3);
            stackOut_48_1 = new StringBuilder().append("da.L(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L19;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L19;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ')');
        }
    }

    private final int a(aa param0, hr[] param1, int param2, int[] param3, String param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        RuntimeException var18 = null;
        int[] var18_array = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_4_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_51_0 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param4 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.a(param6, param9, 60);
                if (param7 == 0) {
                  param7 = this.field_b.field_d;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  L4: {
                    if (param7 + this.field_b.field_c + this.field_b.field_i <= param5) {
                      break L4;
                    } else {
                      if (param5 < param7 - -param7) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var18_array = new int[]{param11};
                  if (var22 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var18_array = null;
                break L2;
              }
              L5: {
                if (0 != (param8 ^ -1)) {
                  break L5;
                } else {
                  param8 = param5 / param7;
                  if ((param8 ^ -1) >= -1) {
                    param8 = 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                var19 = this.field_b.a(param4, false, hu.field_a, var18_array, param1);
                if (-1 <= (param8 ^ -1)) {
                  break L6;
                } else {
                  if ((var19 ^ -1) > (param8 ^ -1)) {
                    break L6;
                  } else {
                    var19 = param8;
                    hu.field_a[-1 + param8] = this.field_b.a(param11, hu.field_a[param8 - 1], param1, -63);
                    break L6;
                  }
                }
              }
              L7: {
                if (param15 != 3) {
                  break L7;
                } else {
                  if ((var19 ^ -1) != -2) {
                    break L7;
                  } else {
                    param15 = 1;
                    break L7;
                  }
                }
              }
              L8: {
                if (param14 >= 38) {
                  break L8;
                } else {
                  this.a(98, 62, (hr[]) null, 36, 116, -67, (String) null, (int[]) null, (aa) null);
                  break L8;
                }
              }
              L9: {
                L10: {
                  if (0 == param15) {
                    break L10;
                  } else {
                    L11: {
                      if (1 == param15) {
                        break L11;
                      } else {
                        L12: {
                          if (-3 != (param15 ^ -1)) {
                            break L12;
                          } else {
                            var20 = -((var19 + -1) * param7) + -this.field_b.field_c + param5 + param16;
                            if (var22 == 0) {
                              break L9;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L13: {
                          var21 = (-this.field_b.field_c + (param5 - (this.field_b.field_i - -(param7 * (-1 + var19))))) / (1 + var19);
                          if (-1 >= (var21 ^ -1)) {
                            break L13;
                          } else {
                            var21 = 0;
                            break L13;
                          }
                        }
                        param7 = param7 + var21;
                        var20 = param16 + (this.field_b.field_i + var21);
                        if (var22 == 0) {
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var20 = this.field_b.field_i + (param16 + (-((var19 - 1) * param7) + -this.field_b.field_c + param5 + -this.field_b.field_i) / 2);
                    if (var22 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                var20 = param16 + this.field_b.field_i;
                break L9;
              }
              var21 = 0;
              L14: while (true) {
                L15: {
                  L16: {
                    if ((var21 ^ -1) <= (var19 ^ -1)) {
                      break L16;
                    } else {
                      stackOut_36_0 = -1;
                      stackIn_52_0 = stackOut_36_0;
                      stackIn_37_0 = stackOut_36_0;
                      if (var22 != 0) {
                        break L15;
                      } else {
                        L17: {
                          L18: {
                            if (stackIn_37_0 != (param12 ^ -1)) {
                              break L18;
                            } else {
                              this.a(-274, var20, param1, param10, param2, param13, hu.field_a[var21], param3, param0);
                              if (var22 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          L19: {
                            if (param12 == 1) {
                              break L19;
                            } else {
                              L20: {
                                if ((param12 ^ -1) != -3) {
                                  break L20;
                                } else {
                                  this.a(-274, var20, param1, param11 + (param10 - this.field_b.a(hu.field_a[var21], 0)), param2, param13, hu.field_a[var21], param3, param0);
                                  if (var22 == 0) {
                                    break L17;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              L21: {
                                if ((var19 + -1 ^ -1) == (var21 ^ -1)) {
                                  break L21;
                                } else {
                                  this.a(hu.field_a[var21], param11, (byte) 5);
                                  this.a(-274, var20, param1, param10, param2, param13, hu.field_a[var21], param3, param0);
                                  lb.field_b = 0;
                                  if (var22 == 0) {
                                    break L17;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              this.a(-274, var20, param1, param10, param2, param13, hu.field_a[var21], param3, param0);
                              if (var22 == 0) {
                                break L17;
                              } else {
                                break L19;
                              }
                            }
                          }
                          this.a(-274, var20, param1, param10 - -((-this.field_b.a(hu.field_a[var21], 0) + param11) / 2), param2, param13, hu.field_a[var21], param3, param0);
                          break L17;
                        }
                        var20 = var20 + param7;
                        var21++;
                        if (var22 == 0) {
                          continue L14;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  stackOut_51_0 = var19;
                  stackIn_52_0 = stackOut_51_0;
                  break L15;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var18 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) (var18);
            stackOut_53_1 = new StringBuilder().append("da.H(");
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param0 == null) {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L22;
            } else {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L22;
            }
          }
          L23: {
            stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
            stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',');
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param1 == null) {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L23;
            } else {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L23;
            }
          }
          L24: {
            stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
            stackOut_59_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',').append(param2).append(',');
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param3 == null) {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L24;
            } else {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L24;
            }
          }
          L25: {
            stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
            stackOut_62_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param4 == null) {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L25;
            } else {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L25;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_52_0;
        }
    }

    private final void a(int param0, int param1, hr[] param2, int param3, int param4, int param5, String param6, int[] param7, aa param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15_ref = null;
        String var15_ref_String = null;
        int var15 = 0;
        Exception var16 = null;
        int var16_int = 0;
        hr var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        CharSequence var21 = null;
        int stackIn_26_0 = 0;
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
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
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
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var20 = null;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            param1 = param1 - this.field_b.field_d;
            var10_int = -1;
            var11 = -1;
            var12 = param6.length();
            if (param0 == -274) {
              var13 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var13 >= var12) {
                      break L3;
                    } else {
                      var14 = (char)(255 & uo.a(true, param6.charAt(var13)));
                      if (var19 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (60 != var14) {
                              break L5;
                            } else {
                              var10_int = var13;
                              if (var19 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (62 != var14) {
                              break L6;
                            } else {
                              if ((var10_int ^ -1) == 0) {
                                break L6;
                              } else {
                                L7: {
                                  var15_ref_String = param6.substring(var10_int + 1, var13);
                                  var10_int = -1;
                                  if (var15_ref_String.equals("lt")) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (var15_ref_String.equals("gt")) {
                                        break L8;
                                      } else {
                                        L9: {
                                          if (!var15_ref_String.equals("nbsp")) {
                                            break L9;
                                          } else {
                                            var14 = 160;
                                            if (var19 == 0) {
                                              break L6;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        L10: {
                                          if (var15_ref_String.equals("shy")) {
                                            break L10;
                                          } else {
                                            L11: {
                                              if (!var15_ref_String.equals("times")) {
                                                break L11;
                                              } else {
                                                var14 = 215;
                                                if (var19 == 0) {
                                                  break L6;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                            L12: {
                                              if (var15_ref_String.equals("euro")) {
                                                break L12;
                                              } else {
                                                L13: {
                                                  if (var15_ref_String.equals("copy")) {
                                                    break L13;
                                                  } else {
                                                    L14: {
                                                      if (!var15_ref_String.equals("reg")) {
                                                        break L14;
                                                      } else {
                                                        var14 = 174;
                                                        if (var19 == 0) {
                                                          break L6;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    L15: {
                                                      if (!var15_ref_String.startsWith("img=")) {
                                                        break L15;
                                                      } else {
                                                        try {
                                                          L16: {
                                                            L17: {
                                                              var21 = (CharSequence) ((Object) var15_ref_String.substring(4));
                                                              var16_int = no.a((byte) -127, var21);
                                                              var17 = param2[var16_int];
                                                              if (param7 != null) {
                                                                stackOut_25_0 = param7[var16_int];
                                                                stackIn_26_0 = stackOut_25_0;
                                                                break L17;
                                                              } else {
                                                                stackOut_24_0 = var17.d();
                                                                stackIn_26_0 = stackOut_24_0;
                                                                break L17;
                                                              }
                                                            }
                                                            L18: {
                                                              L19: {
                                                                var18 = stackIn_26_0;
                                                                if (16777215 != (-16777216 & mn.field_i ^ -1)) {
                                                                  break L19;
                                                                } else {
                                                                  var17.a(param3, -var18 + (param1 + this.field_b.field_d), 1, 0, 1);
                                                                  if (var19 == 0) {
                                                                    break L18;
                                                                  } else {
                                                                    break L19;
                                                                  }
                                                                }
                                                              }
                                                              var17.a(param3, -var18 + this.field_b.field_d + param1, 0, mn.field_i & -16777216 | 16777215, 1);
                                                              break L18;
                                                            }
                                                            var11 = -1;
                                                            param3 = param3 + param2[var16_int].b();
                                                            decompiledRegionSelector0 = 0;
                                                            break L16;
                                                          }
                                                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                                                          decompiledCaughtException = decompiledCaughtParameter0;
                                                          L20: {
                                                            var16 = (Exception) (Object) decompiledCaughtException;
                                                            if (var19 == 0) {
                                                              decompiledRegionSelector0 = 0;
                                                              break L20;
                                                            } else {
                                                              decompiledRegionSelector0 = 1;
                                                              break L20;
                                                            }
                                                          }
                                                        }
                                                        if (decompiledRegionSelector0 == 0) {
                                                          break L4;
                                                        } else {
                                                          break L15;
                                                        }
                                                      }
                                                    }
                                                    this.a(var15_ref_String, 120);
                                                    if (var19 == 0) {
                                                      break L4;
                                                    } else {
                                                      break L13;
                                                    }
                                                  }
                                                }
                                                var14 = 169;
                                                if (var19 == 0) {
                                                  break L6;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            var14 = 8364;
                                            if (var19 == 0) {
                                              break L6;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        var14 = 173;
                                        if (var19 == 0) {
                                          break L6;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    var14 = 62;
                                    if (var19 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var14 = 60;
                                break L6;
                              }
                            }
                          }
                          if (var10_int == -1) {
                            L21: {
                              if ((var11 ^ -1) == 0) {
                                break L21;
                              } else {
                                param3 = param3 + this.field_b.a(-63, (char) var14, var11);
                                break L21;
                              }
                            }
                            L22: {
                              L23: {
                                if (var14 != 32) {
                                  break L23;
                                } else {
                                  if ((lb.field_b ^ -1) >= -1) {
                                    break L22;
                                  } else {
                                    sb.field_a = sb.field_a + lb.field_b;
                                    param3 = param3 + (sb.field_a >> 1186509064);
                                    sb.field_a = sb.field_a & 255;
                                    if (var19 == 0) {
                                      break L22;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                              }
                              L24: {
                                if (param8 == null) {
                                  break L24;
                                } else {
                                  L25: {
                                    if ((-16777216 & jj.field_b ^ -1) == -1) {
                                      break L25;
                                    } else {
                                      this.a((char) var14, param3 + 1, param1 - -1, jj.field_b, true, param8, param4, param5);
                                      break L25;
                                    }
                                  }
                                  this.a((char) var14, param3, param1, mn.field_i, false, param8, param4, param5);
                                  if (var19 == 0) {
                                    break L22;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              L26: {
                                if ((-16777216 & jj.field_b ^ -1) == -1) {
                                  break L26;
                                } else {
                                  this.fa((char) var14, param3 + 1, param1 + 1, jj.field_b, true);
                                  break L26;
                                }
                              }
                              this.fa((char) var14, param3, param1, mn.field_i, false);
                              break L22;
                            }
                            L27: {
                              var15 = this.field_b.a(var14, (byte) -53);
                              if (-1 != vo.field_I) {
                                this.field_a.a(vo.field_I, 103, param1 - -(int)(0.7 * (double)this.field_b.field_d), var15, param3);
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            L28: {
                              if ((fl.field_p ^ -1) != 0) {
                                this.field_a.a(fl.field_p, 122, this.field_b.field_d + param1 - -1, var15, param3);
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            var11 = var14;
                            param3 = param3 + var15;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var13++;
                        if (var19 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                decompiledRegionSelector1 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var10 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) (var10);
            stackOut_63_1 = new StringBuilder().append("da.M(").append(param0).append(',').append(param1).append(',');
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param2 == null) {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L29;
            } else {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L29;
            }
          }
          L30: {
            stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param6 == null) {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L30;
            } else {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L30;
            }
          }
          L31: {
            stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param7 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L31;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L31;
            }
          }
          L32: {
            stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param8 == null) {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L32;
            } else {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L32;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(ki param0, ki param1, int param2, ki param3) {
        ne discarded$1 = null;
        RuntimeException var4 = null;
        ne[] var5 = null;
        ne[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        ne[] var10 = null;
        int var11_int = 0;
        wb var11 = null;
        wb var12 = null;
        int var13 = 0;
        ne[] var14 = null;
        wb var15 = null;
        int[][] var16 = null;
        wb var17 = null;
        wb var18 = null;
        int[][] var19 = null;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            li.field_v = kb.a("frame_top", param0, true, "commonui");
            hd.field_O = kb.a("frame_bottom", param0, true, "commonui");
            ar.field_E = jb.a("commonui", "jagex_logo_grey", -104, param0);
            jp.field_j = kb.a("button", param0, true, "commonui");
            fw.field_m = ub.a(param0, "commonui", (byte) -56, "validation");
            jm.field_a = (vn) ((Object) vf.a(param1, true, "commonui", "arezzo12", param0));
            kw.field_b = (vn) ((Object) vf.a(param1, true, "commonui", "arezzo14", param0));
            tq.field_a = (vn) ((Object) vf.a(param1, true, "commonui", "arezzo14bold", param0));
            var17 = new wb(param3.a("", "button.gif", -1), (java.awt.Component) ((Object) qn.field_f));
            discarded$1 = mc.a((byte) 83, param0, "dropdown", "commonui");
            var5 = rq.a("screen_options", param0, 73, "commonui");
            sb.field_d = new ne[4];
            sm.field_c = new ne[4];
            kn.field_f = new ne[4];
            var6 = new ne[][]{sb.field_d, kn.field_f, sm.field_c};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_i;
            var8 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var8 ^ -1) <= (var19.length ^ -1)) {
                    break L3;
                  } else {
                    var7[var8] = (int[]) ((Object) var19[0].clone());
                    var8++;
                    if (var13 != 0) {
                      break L2;
                    } else {
                      if (var13 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var8 = var5[0].field_h[0];
                var19[2][var8] = 16777215;
                var19[1][var8] = 2394342;
                var19[3][var8] = 4767999;
                break L2;
              }
              var9 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (3 <= var9) {
                      break L6;
                    } else {
                      var14 = var6[var9];
                      var10 = var14;
                      stackOut_9_0 = 0;
                      stackIn_18_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var13 != 0) {
                        break L5;
                      } else {
                        var11_int = stackIn_10_0;
                        L7: while (true) {
                          L8: {
                            L9: {
                              if ((var11_int ^ -1) <= (var14.length ^ -1)) {
                                break L9;
                              } else {
                                var14[var11_int] = jk.a(var19[var11_int], var5[var9], -105);
                                var11_int++;
                                if (var13 != 0) {
                                  break L8;
                                } else {
                                  if (var13 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            var9++;
                            break L8;
                          }
                          if (var13 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  var9 = var17.field_u;
                  stackOut_17_0 = param2;
                  stackIn_18_0 = stackOut_17_0;
                  break L5;
                }
                if (stackIn_18_0 == 17474) {
                  kc.j(70);
                  var17.d();
                  lk.g(0, 0, lk.field_b, lk.field_c);
                  var15 = new wb(var9, var9);
                  var18 = var15;
                  var18.d();
                  var17.c(0, 0);
                  var11 = new wb(var9, var9);
                  var11.d();
                  var17.c(var9 + -var17.field_x, 0);
                  var12 = new wb(-(2 * var9) + var17.field_x, var9);
                  var12.d();
                  var17.c(-var9, 0);
                  su.a((byte) -73);
                  jp.field_j = new wb[]{var15, var12, var11};
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("da.K(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          L11: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          L12: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L12;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L12;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void fa(char param0, int param1, int param2, int param3, boolean param4);

    final void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
            return;
        }
        try {
            this.a(param1, param2, 60);
            this.a(-274, param3, (hr[]) null, -(this.field_b.a(param0, param5) / 2) + param4, 0, 0, param0, (int[]) null, (aa) null);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "da.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        lb.field_b = 0;
        fs.field_l = param0;
        mn.field_i = param0;
        if ((param1 ^ -1) == 0) {
            param1 = 0;
        }
        vo.field_I = -1;
        sb.field_a = 0;
        if (param2 != 60) {
            this.field_b = (ta) null;
        }
        fl.field_p = -1;
        jv.field_b = param1;
        jj.field_b = param1;
    }

    da(ha param0, ta param1) {
        try {
            this.field_b = param1;
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(cd param0, int param1, cd param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if ((param0.field_a ^ -1) < (param2.field_a ^ -1)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 <= -11) {
                  break L1;
                } else {
                  da.a((ki) null, (ki) null, 47, (ki) null);
                  break L1;
                }
              }
              if ((param0.field_a ^ -1) != (param2.field_a ^ -1)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (param2.field_g < param0.field_g) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("da.J(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    abstract void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7);

    private final void a(String param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((param0.length() ^ -1) >= (var6 ^ -1)) {
                    break L3;
                  } else {
                    var7 = param0.charAt(var6);
                    stackOut_3_0 = 60;
                    stackOut_3_1 = var7;
                    stackIn_14_0 = stackOut_3_0;
                    stackIn_14_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 == stackIn_4_1) {
                            break L5;
                          } else {
                            L6: {
                              if (62 == var7) {
                                break L6;
                              } else {
                                if (var5 != 0) {
                                  break L4;
                                } else {
                                  if (32 == var7) {
                                    var4_int++;
                                    if (var8 == 0) {
                                      break L4;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                            var5 = 0;
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5 = 1;
                        break L4;
                      }
                      var6++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_13_0 = -1;
                stackOut_13_1 = var4_int ^ -1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L2;
              }
              L7: {
                if (stackIn_14_0 <= stackIn_14_1) {
                  break L7;
                } else {
                  lb.field_b = (param1 - this.field_b.a(param0, 0) << 194521768) / var4_int;
                  break L7;
                }
              }
              L8: {
                if (param2 == 5) {
                  break L8;
                } else {
                  this.a(-80, -66, 46, (String) null, (byte) 127, -75);
                  break L8;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("da.F(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L9;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
