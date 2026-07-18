/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class op {
    static int field_h;
    static int[][] field_a;
    static String field_g;
    static java.awt.Frame field_e;
    static int[] field_d;
    vj[] field_b;
    static String field_c;
    static int field_f;

    final int a(int param0) {
        int var2 = 0;
        vj[] var3 = null;
        int var4 = 0;
        vj var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pool.field_O;
          var2 = param0;
          if (null != ((op) this).field_b) {
            var3 = ((op) this).field_b;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(param0 + -56);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        return var2;
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        vj var5 = null;
        vj[] var6 = ((op) this).field_b;
        vj[] var3 = var6;
        if (param1 > -35) {
            return -23;
        }
        for (var4 = 0; var4 < var6.length; var4++) {
            var5 = var6[var4];
            if (var5.field_h.length > param0) {
                return var5.field_h[param0];
            }
            param0 = param0 - (-1 + var5.field_h.length);
        }
        return 0;
    }

    final int a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 66) {
            break L0;
          } else {
            int discarded$2 = ((op) this).a((byte) 123);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((op) this).field_b) {
              break L2;
            } else {
              if (((op) this).field_b.length <= 0) {
                break L2;
              } else {
                stackOut_4_0 = -((op) this).field_b[0].field_e + ((op) this).field_b[((op) this).field_b.length + -1].field_i;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        vj var4 = null;
        for (var3 = param1; ((op) this).field_b.length > var3; var3++) {
            var4 = ((op) this).field_b[var3];
            if (var4.field_h.length > param0) {
                return var3;
            }
            param0 = param0 - (var4.field_h.length - 1);
        }
        return ((op) this).field_b.length;
    }

    final int a(int param0, byte param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var10 = Pool.field_O;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param2.length();
            if (param1 == 105) {
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  if (0 < var5_int) {
                    stackOut_16_0 = (param3 + -param0 << 8) / var5_int;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    return 0;
                  }
                } else {
                  L2: {
                    var9 = param2.charAt(var8);
                    if (var9 != 60) {
                      if (var9 == 62) {
                        var6 = 0;
                        break L2;
                      } else {
                        L3: {
                          if (var6 != 0) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L1;
                      }
                    } else {
                      var6 = 1;
                      break L2;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -67;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("op.F(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param3 + ')');
        }
        return stackIn_17_0;
    }

    final static float[] a(int param0, int[] param1, int param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        float[] var5 = null;
        float[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_3_0 = null;
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
            var5 = new float[param1.length];
            var3 = var5;
            var4 = 0;
            L1: while (true) {
              if (param1.length <= var4) {
                stackOut_3_0 = (float[]) var5;
                stackIn_4_0 = stackOut_3_0;
                break L0;
              } else {
                var5[var4] = de.a(-1, 16, param1[var4]);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("op.D(").append(16).append(',');
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
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 97 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int[] param0, int param1, int[] param2, int param3, int[] param4, byte param5, int param6, int[] param7, int[] param8, byte param9, int[] param10) {
        RuntimeException var11 = null;
        int var11_int = 0;
        int var12 = 0;
        Object var13 = null;
        ro var14 = null;
        ro var15 = null;
        int var16 = 0;
        int var17 = 0;
        ro var18 = null;
        ro var19 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
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
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
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
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (hr.field_c == null) {
                  break L2;
                } else {
                  if (2 > hr.field_c.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              kg.a(2, (byte) 49);
              break L1;
            }
            var11_int = 0;
            L3: while (true) {
              if (2 <= var11_int) {
                L4: {
                  var11_int = 0;
                  var12 = 0;
                  var13 = null;
                  var18 = hr.field_c[0];
                  var15 = var18;
                  var15 = var18;
                  var14 = var18;
                  var19 = hr.field_c[1];
                  var15 = var19;
                  var15 = var19;
                  var18.a((byte) 60, var19);
                  if (param9 != 0) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param9 != 0) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var16 = 2;
                var17 = 1;
                L6: while (true) {
                  if (var17 >= var16) {
                    break L0;
                  } else {
                    L7: {
                      if (2 > var17) {
                        var15 = hr.field_c[var17];
                        break L7;
                      } else {
                        var15 = hr.field_c[var17 % 2];
                        break L7;
                      }
                    }
                    L8: {
                      if (2 > 1 + var17) {
                        var15.a((byte) 60, hr.field_c[1 + var17]);
                        var15.a(var14, -16875);
                        break L8;
                      } else {
                        if (0 != param9) {
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var14.b(var15, 24)) {
                        break L9;
                      } else {
                        L10: {
                          if ((var14.field_r & 240) == 0) {
                            L11: {
                              L12: {
                                if (var15.field_i != 0) {
                                  break L12;
                                } else {
                                  if (0 == var15.field_k) {
                                    ne.field_q = var14.field_f;
                                    di.field_h = var14.field_m;
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              ne.field_q = var15.field_i;
                              di.field_h = var15.field_k;
                              break L11;
                            }
                            var12 = 0;
                            break L10;
                          } else {
                            var12 = 2;
                            break L10;
                          }
                        }
                        L13: {
                          if (0 == (15 & var14.field_r)) {
                            var11_int = 0;
                            if (var13 == null) {
                              ng.field_w = var14.field_f;
                              fr.field_u = var14.field_m;
                              break L13;
                            } else {
                              fr.field_u = var14.field_k;
                              ng.field_w = var14.field_i;
                              break L13;
                            }
                          } else {
                            var11_int = 2;
                            break L13;
                          }
                        }
                        bo.a(var14.field_j[0], param6, (byte) 19, var14.field_h[1], var14.field_q[1], var14.field_q[0], var14.field_h[0], (byte) var11_int, var14.field_j[1], param7, (byte) var12);
                        break L9;
                      }
                    }
                    var13 = (Object) (Object) var14;
                    var14 = var15;
                    var17++;
                    continue L6;
                  }
                }
              } else {
                hr.field_c[var11_int].a(param8[var11_int], param10[var11_int], param2[var11_int], param0[var11_int], (byte) 120, param4);
                var11_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var11 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var11;
            stackOut_39_1 = new StringBuilder().append("op.H(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L14;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L14;
            }
          }
          L15: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',').append(2).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L15;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L15;
            }
          }
          L16: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(1).append(',');
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
              break L16;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L16;
            }
          }
          L17: {
            stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(1).append(',').append(param6).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param7 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L17;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L17;
            }
          }
          L18: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param8 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L18;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L18;
            }
          }
          L19: {
            stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
            stackOut_54_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',').append(param9).append(',');
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param10 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L19;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L19;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ')');
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        vj var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Pool.field_O;
          if (((op) this).field_b == null) {
            break L0;
          } else {
            if (((op) this).field_b.length == 0) {
              break L0;
            } else {
              if (((op) this).field_b[0].field_e > param0) {
                break L0;
              } else {
                if (((op) this).field_b[param2 + ((op) this).field_b.length].field_i >= param0) {
                  if (((op) this).field_b.length == 1) {
                    return ((op) this).field_b[0].a(-109, param1);
                  } else {
                    var4 = 0;
                    var5 = 0;
                    L1: while (true) {
                      if (((op) this).field_b.length <= var5) {
                        return -1;
                      } else {
                        L2: {
                          var6 = ((op) this).field_b[var5];
                          if (param0 < var6.field_e) {
                            break L2;
                          } else {
                            if (var6.field_i < param0) {
                              break L2;
                            } else {
                              var7 = var6.a(-111, param1);
                              if (var7 != -1) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_h.length);
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  return -1;
                }
              }
            }
          }
        }
        return -1;
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        field_g = null;
        field_a = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Hide game chat";
        field_g = "Asking to join <%0>'s game...";
        field_h = 0;
        field_d = new int[]{3456, 3456};
    }
}
