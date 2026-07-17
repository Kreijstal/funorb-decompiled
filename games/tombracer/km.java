/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends od {
    private ci[] field_l;
    private ci field_r;
    private ci field_k;
    private ci field_m;
    static fta field_p;
    static String field_n;
    private int[] field_o;
    private int[] field_q;

    final boolean a(cn param0, d param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= gla.field_m) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= ((km) this).field_q.length) {
                    break L1;
                  } else {
                    if (!param0.a(gla.field_m, (byte) -106, ((km) this).field_q[var4_int])) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    } else {
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= ((km) this).field_q.length) {
                    break L1;
                  } else {
                    if (param0.a(-15121, ((km) this).field_q[var4_int])) {
                      var4_int++;
                      continue L3;
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0 != 0;
                    }
                  }
                }
              }
            }
            var4_int = 0;
            L4: while (true) {
              if (var4_int >= ((km) this).field_o.length) {
                stackOut_22_0 = 1;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                if (!param1.a(((km) this).field_o[var4_int], (byte) 105)) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0 != 0;
                } else {
                  var4_int++;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("km.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          L6: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param2 + 41);
        }
        return stackIn_23_0 != 0;
    }

    public static void a(int param0) {
        field_p = null;
        field_n = null;
    }

    final float[] a(d param0, byte param1, int param2, int param3, boolean param4, cn param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        float[] var7_array = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15_ref_int__ = null;
        int[][] var15_ref_int____ = null;
        int var15 = 0;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        int[][] var19 = null;
        float[] var20 = null;
        int var21 = 0;
        int[][] var22 = null;
        int[][] var23 = null;
        int[][] var24 = null;
        int[][] var25 = null;
        float[] stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_31_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var18 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            qw.field_j = param0;
            np.field_m = param5;
            var7_int = 0;
            L1: while (true) {
              if (((km) this).field_l.length <= var7_int) {
                uta.a(0, param2, param3);
                var20 = new float[4 * param2 * param3];
                var7_array = var20;
                var8 = 0;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= param2) {
                    var10 = -41 / ((-67 - param1) / 38);
                    var21 = 0;
                    var9 = var21;
                    L3: while (true) {
                      if (var21 >= ((km) this).field_l.length) {
                        stackOut_31_0 = (float[]) var7_array;
                        stackIn_32_0 = stackOut_31_0;
                        break L0;
                      } else {
                        ((km) this).field_l[var21].b(-54);
                        var21++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: {
                      if (((km) this).field_k.field_g) {
                        var15_ref_int__ = ((km) this).field_k.c(1, var9);
                        var10_ref_int__ = var15_ref_int__;
                        var11 = var15_ref_int__;
                        var12 = var15_ref_int__;
                        break L4;
                      } else {
                        var25 = ((km) this).field_k.b(var9, -1);
                        var24 = var25;
                        var23 = var24;
                        var22 = var23;
                        var19 = var22;
                        var15_ref_int____ = var19;
                        var11 = var25[1];
                        var12 = var25[2];
                        var10_ref_int__ = var25[0];
                        break L4;
                      }
                    }
                    L5: {
                      if (((km) this).field_r.field_g) {
                        var13 = ((km) this).field_r.c(1, var9);
                        break L5;
                      } else {
                        var13 = ((km) this).field_r.b(var9, -1)[0];
                        break L5;
                      }
                    }
                    L6: {
                      if (!param4) {
                        break L6;
                      } else {
                        var8 = var9 << 2;
                        break L6;
                      }
                    }
                    L7: {
                      if (((km) this).field_m.field_g) {
                        var14 = ((km) this).field_m.c(1, var9);
                        break L7;
                      } else {
                        var14 = ((km) this).field_m.b(var9, -1)[0];
                        break L7;
                      }
                    }
                    var15 = param3 + -1;
                    L8: while (true) {
                      if (var15 < 0) {
                        var9++;
                        continue L2;
                      } else {
                        L9: {
                          var16 = (float)var13[var15] / 4096.0f;
                          if (0.0f <= var16) {
                            if (1.0f < var16) {
                              var16 = 1.0f;
                              break L9;
                            } else {
                              break L9;
                            }
                          } else {
                            var16 = 0.0f;
                            break L9;
                          }
                        }
                        L10: {
                          var17 = (1.0f + (float)var14[var15] * 31.0f / 4096.0f) / 4096.0f;
                          int incrementValue$4 = var8;
                          var8++;
                          var20[incrementValue$4] = var17 * (float)var10_ref_int__[var15];
                          int incrementValue$5 = var8;
                          var8++;
                          var20[incrementValue$5] = var17 * (float)var11[var15];
                          int incrementValue$6 = var8;
                          var8++;
                          var20[incrementValue$6] = (float)var12[var15] * var17;
                          int incrementValue$7 = var8;
                          var8++;
                          var20[incrementValue$7] = var16;
                          if (!param4) {
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var15--;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                ((km) this).field_l[var7_int].b(param3, param2, -256);
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var7;
            stackOut_33_1 = new StringBuilder().append("km.D(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          L12: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param5 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L12;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L12;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 41);
        }
        return stackIn_32_0;
    }

    final int[] a(int param0, cn param1, boolean param2, double param3, d param4, byte param5, int param6, boolean param7) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19_ref_int__ = null;
        int[][] var19_ref_int____ = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int[][] var28 = null;
        int[][] var29 = null;
        int[][] var30 = null;
        int[][] var31 = null;
        Object stackIn_6_0 = null;
        int[] stackIn_46_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_45_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var24 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            qw.field_j = param4;
            np.field_m = param1;
            var10_int = 0;
            L1: while (true) {
              if (((km) this).field_l.length <= var10_int) {
                if (param5 >= 17) {
                  L2: {
                    js.a(param3, -256);
                    uta.a(0, param0, param6);
                    var26 = new int[param6 * param0];
                    var10_array = var26;
                    if (param2) {
                      var13 = -1;
                      var11 = param6 + -1;
                      var12 = -1;
                      break L2;
                    } else {
                      var12 = param6;
                      var11 = 0;
                      var13 = 1;
                      break L2;
                    }
                  }
                  var14 = 0;
                  var15 = 0;
                  L3: while (true) {
                    if (var15 >= param0) {
                      var27 = 0;
                      var15 = var27;
                      L4: while (true) {
                        if (~var27 <= ~((km) this).field_l.length) {
                          stackOut_45_0 = (int[]) var10_array;
                          stackIn_46_0 = stackOut_45_0;
                          break L0;
                        } else {
                          ((km) this).field_l[var27].b(-50);
                          var27++;
                          continue L4;
                        }
                      }
                    } else {
                      L5: {
                        if (((km) this).field_k.field_g) {
                          var19_ref_int__ = ((km) this).field_k.c(1, var15);
                          var16 = var19_ref_int__;
                          var18 = var19_ref_int__;
                          var17 = var19_ref_int__;
                          break L5;
                        } else {
                          var31 = ((km) this).field_k.b(var15, -1);
                          var30 = var31;
                          var29 = var30;
                          var28 = var29;
                          var25 = var28;
                          var19_ref_int____ = var25;
                          var16 = var31[0];
                          var17 = var31[1];
                          var18 = var31[2];
                          break L5;
                        }
                      }
                      L6: {
                        if (!param7) {
                          break L6;
                        } else {
                          var14 = var15;
                          break L6;
                        }
                      }
                      var19 = var11;
                      L7: while (true) {
                        if (var19 == var12) {
                          var15++;
                          continue L3;
                        } else {
                          L8: {
                            var20 = var16[var19] >> 4;
                            if (var20 > 255) {
                              var20 = 255;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if (var20 >= 0) {
                              break L9;
                            } else {
                              var20 = 0;
                              break L9;
                            }
                          }
                          L10: {
                            var21 = var17[var19] >> 4;
                            if (var21 > 255) {
                              var21 = 255;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            if (var21 >= 0) {
                              break L11;
                            } else {
                              var21 = 0;
                              break L11;
                            }
                          }
                          L12: {
                            var22 = var18[var19] >> 4;
                            if (255 >= var22) {
                              break L12;
                            } else {
                              var22 = 255;
                              break L12;
                            }
                          }
                          L13: {
                            if (var22 < 0) {
                              var22 = 0;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            var20 = sk.field_c[var20];
                            var21 = sk.field_c[var21];
                            var22 = sk.field_c[var22];
                            var23 = var22 + ((var21 << 8) + (var20 << 16));
                            if (0 != var23) {
                              var23 = var23 | -16777216;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            int incrementValue$1 = var14;
                            var14++;
                            var26[incrementValue$1] = var23;
                            if (param7) {
                              var14 = var14 + (-1 + param6);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          var19 = var19 + var13;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  stackOut_5_0 = null;
                  stackIn_6_0 = stackOut_5_0;
                  return (int[]) (Object) stackIn_6_0;
                }
              } else {
                ((km) this).field_l[var10_int].b(param6, param0, -256);
                var10_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var10 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var10;
            stackOut_47_1 = new StringBuilder().append("km.A(").append(param0).append(44);
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L16;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L16;
            }
          }
          L17: {
            stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param4 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L17;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L17;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
        return stackIn_46_0;
    }

    km(uia param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var12 = null;
        ci var13 = null;
        ci var14 = null;
        ci var15 = null;
        int[][] var16 = null;
        int[][] var17 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var2_int = param0.h(255);
            var3 = 0;
            var4 = 0;
            ((km) this).field_l = new ci[var2_int];
            var17 = new int[var2_int][];
            var16 = var17;
            var12 = var16;
            var6 = 0;
            L1: while (true) {
              if (var6 >= var2_int) {
                ((km) this).field_q = new int[var3];
                ((km) this).field_o = new int[var4];
                var3 = 0;
                var4 = 0;
                var6 = 0;
                L2: while (true) {
                  if (var2_int <= var6) {
                    ((km) this).field_k = ((km) this).field_l[param0.h(255)];
                    ((km) this).field_r = ((km) this).field_l[param0.h(255)];
                    var5 = null;
                    ((km) this).field_m = ((km) this).field_l[param0.h(255)];
                    break L0;
                  } else {
                    var15 = ((km) this).field_l[var6];
                    var8 = var15.field_j.length;
                    var9 = 0;
                    L3: while (true) {
                      if (var8 <= var9) {
                        L4: {
                          var9 = var15.a(100);
                          var10 = var15.c((byte) -117);
                          if (var9 <= 0) {
                            break L4;
                          } else {
                            int incrementValue$2 = var3;
                            var3++;
                            ((km) this).field_q[incrementValue$2] = var9;
                            break L4;
                          }
                        }
                        L5: {
                          if (0 >= var10) {
                            break L5;
                          } else {
                            int incrementValue$3 = var4;
                            var4++;
                            ((km) this).field_o[incrementValue$3] = var10;
                            break L5;
                          }
                        }
                        var12[var6] = null;
                        var6++;
                        continue L2;
                      } else {
                        var15.field_j[var9] = ((km) this).field_l[var17[var6][var9]];
                        var9++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                L6: {
                  var13 = aw.a(param0, 0);
                  var14 = var13;
                  if (var14.a(125) < 0) {
                    break L6;
                  } else {
                    var3++;
                    break L6;
                  }
                }
                L7: {
                  if (var14.c((byte) -117) < 0) {
                    break L7;
                  } else {
                    var4++;
                    break L7;
                  }
                }
                var8 = var14.field_j.length;
                var12[var6] = new int[var8];
                var9 = 0;
                L8: while (true) {
                  if (var8 <= var9) {
                    ((km) this).field_l[var6] = var13;
                    var6++;
                    continue L1;
                  } else {
                    var17[var6][var9] = param0.h(255);
                    var9++;
                    continue L8;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("km.<init>(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    final int[] a(int param0, boolean param1, int param2, double param3, cn param4, d param5, boolean param6) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int[] var9_array = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[][] var15 = null;
        int[] var15_array = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[][] var22 = null;
        int[] var23 = null;
        int var24 = 0;
        int[][] var25 = null;
        int[][] var26 = null;
        int[][] var27 = null;
        int[][] var28 = null;
        int[] stackIn_52_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_51_0 = null;
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
        var21 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            qw.field_j = param5;
            np.field_m = param4;
            var9_int = 0;
            L1: while (true) {
              if (~((km) this).field_l.length >= ~var9_int) {
                L2: {
                  js.a(param3, -256);
                  uta.a(0, param2, param0);
                  if (!param6) {
                    break L2;
                  } else {
                    ((km) this).field_m = null;
                    break L2;
                  }
                }
                var9_array = new int[param0 * param2];
                var10 = 0;
                var11 = 0;
                L3: while (true) {
                  if (param2 <= var11) {
                    var24 = 0;
                    var11 = var24;
                    L4: while (true) {
                      if (~var24 <= ~((km) this).field_l.length) {
                        stackOut_51_0 = (int[]) var9_array;
                        stackIn_52_0 = stackOut_51_0;
                        break L0;
                      } else {
                        ((km) this).field_l[var24].b(-126);
                        var24++;
                        continue L4;
                      }
                    }
                  } else {
                    L5: {
                      if (!((km) this).field_k.field_g) {
                        var28 = ((km) this).field_k.b(var11, -1);
                        var27 = var28;
                        var26 = var27;
                        var25 = var26;
                        var22 = var25;
                        var15 = var22;
                        var13 = var28[1];
                        var12 = var28[0];
                        var14 = var28[2];
                        break L5;
                      } else {
                        var23 = ((km) this).field_k.c(1, var11);
                        var15_array = var23;
                        var14 = var23;
                        var12 = var23;
                        var13 = var23;
                        break L5;
                      }
                    }
                    L6: {
                      if (((km) this).field_r.field_g) {
                        var15_array = ((km) this).field_r.c(1, var11);
                        break L6;
                      } else {
                        var15_array = ((km) this).field_r.b(var11, -1)[0];
                        break L6;
                      }
                    }
                    L7: {
                      if (!param1) {
                        break L7;
                      } else {
                        var10 = var11;
                        break L7;
                      }
                    }
                    var16 = -1 + param0;
                    L8: while (true) {
                      if (var16 < 0) {
                        var11++;
                        continue L3;
                      } else {
                        L9: {
                          var17 = var12[var16] >> 4;
                          if (var17 > 255) {
                            var17 = 255;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (0 > var17) {
                            var17 = 0;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          var18 = var13[var16] >> 4;
                          if (var18 <= 255) {
                            break L11;
                          } else {
                            var18 = 255;
                            break L11;
                          }
                        }
                        L12: {
                          if (0 <= var18) {
                            break L12;
                          } else {
                            var18 = 0;
                            break L12;
                          }
                        }
                        L13: {
                          var19 = var14[var16] >> 4;
                          if (var19 <= 255) {
                            break L13;
                          } else {
                            var19 = 255;
                            break L13;
                          }
                        }
                        L14: {
                          var17 = sk.field_c[var17];
                          var18 = sk.field_c[var18];
                          if (var19 >= 0) {
                            break L14;
                          } else {
                            var19 = 0;
                            break L14;
                          }
                        }
                        L15: {
                          L16: {
                            var19 = sk.field_c[var19];
                            if (var17 != 0) {
                              break L16;
                            } else {
                              if (var18 != 0) {
                                break L16;
                              } else {
                                if (var19 == 0) {
                                  var20 = 0;
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          L17: {
                            var20 = var15_array[var16] >> 4;
                            if (var20 > 255) {
                              var20 = 255;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          if (var20 < 0) {
                            var20 = 0;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L18: {
                          int incrementValue$1 = var10;
                          var10++;
                          var9_array[incrementValue$1] = var19 + ((var18 << 8) + ((var17 << 16) + (var20 << 24)));
                          if (param1) {
                            var10 = var10 + (param0 + -1);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        var16--;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                ((km) this).field_l[var9_int].b(param0, param2, -256);
                var9_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var9 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var9;
            stackOut_53_1 = new StringBuilder().append("km.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param4 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L19;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L19;
            }
          }
          L20: {
            stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
            stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(44);
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param5 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L20;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L20;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + 44 + param6 + 41);
        }
        return stackIn_52_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "LASER stands for Light Amplification by Stimulated Emission of Radiation. Misuse of a LASER can turn a PLAYER into TOAST.";
    }
}
