/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qqa extends hha {
    static String field_p;
    uia field_r;
    static boolean[] field_n;
    int field_s;
    static String field_o;
    static apa field_t;
    byte field_q;

    final byte[] b(byte param0) {
        if (param0 == -126) {
          L0: {
            if (this.field_m) {
              break L0;
            } else {
              if (this.field_r.field_h < -this.field_q + this.field_r.field_g.length) {
                break L0;
              } else {
                return this.field_r.field_g;
              }
            }
          }
          throw new RuntimeException();
        } else {
          return (byte[]) null;
        }
    }

    final int a(byte param0) {
        if (null == this.field_r) {
          return 0;
        } else {
          if (param0 > -7) {
            return -52;
          } else {
            return 100 * this.field_r.field_h / (-this.field_q + this.field_r.field_g.length);
          }
        }
    }

    final static boolean a(uia param0, char[] param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 != param1[0]) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var4_int = param0.field_h;
                var5 = 1;
                if (param3) {
                  break L1;
                } else {
                  field_n = (boolean[]) null;
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  L4: {
                    if (param1.length <= var5) {
                      break L4;
                    } else {
                      stackOut_8_0 = param0.field_g.length;
                      stackIn_16_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_9_0 == param0.field_h) {
                            break L5;
                          } else {
                            if (param0.c((byte) 106) == param1[var5]) {
                              var5++;
                              if (var6 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                        param0.field_h = var4_int;
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  param0.field_h = var4_int;
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("qqa.H(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final static ima a(int[] param0, oc param1, int param2, byte param3) {
        Object var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        int var8 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        float var17 = 0.0f;
        int var18_int = 0;
        float var18 = 0.0f;
        float var19 = 0.0f;
        int var19_int = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        ima stackIn_3_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_43_0 = 0;
        ima stackIn_58_0 = null;
        Object stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        Object stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        Object stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        Object stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        Object stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        Object stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        ima stackOut_57_0 = null;
        ima stackOut_2_0 = null;
        Object stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        Object stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        Object stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        Object stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        Object stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        Object stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = null;
            var5 = null;
            var6 = null;
            var7 = null;
            if (param3 == -6) {
              L1: {
                if (param1.field_g == null) {
                  break L1;
                } else {
                  var8 = param1.field_F;
                  var45 = new int[var8];
                  var46 = new int[var8];
                  var47 = new int[var8];
                  var48 = new int[var8];
                  var49 = new int[var8];
                  var50 = new int[var8];
                  var15 = 0;
                  L2: while (true) {
                    L3: {
                      if (var15 >= var8) {
                        var15 = 0;
                        break L3;
                      } else {
                        var45[var15] = 2147483647;
                        var46[var15] = -2147483647;
                        var47[var15] = 2147483647;
                        var48[var15] = -2147483647;
                        var49[var15] = 2147483647;
                        var50[var15] = -2147483647;
                        var15++;
                        if (var23 != 0) {
                          break L3;
                        } else {
                          continue L2;
                        }
                      }
                    }
                    L4: while (true) {
                      stackOut_11_0 = param2;
                      stackOut_11_1 = var15;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      L5: while (true) {
                        L6: {
                          if (stackIn_12_0 <= stackIn_12_1) {
                            stackOut_42_0 = var8;
                            stackIn_43_0 = stackOut_42_0;
                            break L6;
                          } else {
                            var16 = param0[var15];
                            stackOut_13_0 = -1;
                            stackIn_43_0 = stackOut_13_0;
                            stackIn_14_0 = stackOut_13_0;
                            if (var23 != 0) {
                              break L6;
                            } else {
                              L7: {
                                if (stackIn_14_0 == param1.field_g[var16]) {
                                  break L7;
                                } else {
                                  var17_int = param1.field_g[var16] & 255;
                                  var18_int = 0;
                                  L8: while (true) {
                                    if (3 <= var18_int) {
                                      break L7;
                                    } else {
                                      stackOut_17_0 = -1;
                                      stackOut_17_1 = var18_int ^ -1;
                                      stackIn_12_0 = stackOut_17_0;
                                      stackIn_12_1 = stackOut_17_1;
                                      stackIn_18_0 = stackOut_17_0;
                                      stackIn_18_1 = stackOut_17_1;
                                      if (var23 != 0) {
                                        continue L5;
                                      } else {
                                        L9: {
                                          L10: {
                                            if (stackIn_18_0 != stackIn_18_1) {
                                              break L10;
                                            } else {
                                              var19_int = param1.field_a[var16];
                                              if (var23 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (-2 == (var18_int ^ -1)) {
                                              break L11;
                                            } else {
                                              var19_int = param1.field_J[var16];
                                              if (var23 == 0) {
                                                break L9;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          var19_int = param1.field_t[var16];
                                          break L9;
                                        }
                                        L12: {
                                          var20 = param1.field_b[var19_int];
                                          var21 = param1.field_I[var19_int];
                                          var22 = param1.field_p[var19_int];
                                          if (var20 < var45[var17_int]) {
                                            var45[var17_int] = var20;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          if (var20 > var46[var17_int]) {
                                            var46[var17_int] = var20;
                                            break L13;
                                          } else {
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          if (var21 >= var47[var17_int]) {
                                            break L14;
                                          } else {
                                            var47[var17_int] = var21;
                                            break L14;
                                          }
                                        }
                                        L15: {
                                          if (var21 > var48[var17_int]) {
                                            var48[var17_int] = var21;
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (var22 < var49[var17_int]) {
                                            var49[var17_int] = var22;
                                            break L16;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          if (var50[var17_int] < var22) {
                                            var50[var17_int] = var22;
                                            break L17;
                                          } else {
                                            break L17;
                                          }
                                        }
                                        var18_int++;
                                        if (var23 == 0) {
                                          continue L8;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var15++;
                              continue L4;
                            }
                          }
                        }
                        var24 = new int[stackIn_43_0];
                        var4 = var24;
                        var25 = new int[var8];
                        var5 = var25;
                        var7 = new float[var8][];
                        var26 = new int[var8];
                        var6 = var26;
                        var15 = 0;
                        L18: while (true) {
                          if (var15 >= var8) {
                            break L1;
                          } else {
                            L19: {
                              var16 = param1.field_u[var15];
                              if (var16 <= 0) {
                                break L19;
                              } else {
                                L20: {
                                  L21: {
                                    var24[var15] = (var46[var15] + var45[var15]) / 2;
                                    var25[var15] = (var48[var15] + var47[var15]) / 2;
                                    var26[var15] = (var49[var15] + var50[var15]) / 2;
                                    if (1 == var16) {
                                      break L21;
                                    } else {
                                      L22: {
                                        if (-3 != (var16 ^ -1)) {
                                          break L22;
                                        } else {
                                          var19 = 64.0f / (float)param1.field_x[var15];
                                          var18 = 64.0f / (float)param1.field_f[var15];
                                          var17 = 64.0f / (float)param1.field_j[var15];
                                          if (var23 == 0) {
                                            break L20;
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                      var19 = (float)param1.field_x[var15] / 1024.0f;
                                      var18 = (float)param1.field_f[var15] / 1024.0f;
                                      var17 = (float)param1.field_j[var15] / 1024.0f;
                                      if (var23 == 0) {
                                        break L20;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  L23: {
                                    var20 = param1.field_j[var15];
                                    var18 = 64.0f / (float)param1.field_f[var15];
                                    if (-1 != (var20 ^ -1)) {
                                      break L23;
                                    } else {
                                      var19 = 1.0f;
                                      var17 = 1.0f;
                                      if (var23 == 0) {
                                        break L20;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  L24: {
                                    if (0 >= var20) {
                                      break L24;
                                    } else {
                                      var19 = (float)var20 / 1024.0f;
                                      var17 = 1.0f;
                                      if (var23 == 0) {
                                        break L20;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  var17 = (float)(-var20) / 1024.0f;
                                  var19 = 1.0f;
                                  break L20;
                                }
                                ((Object[]) (var7))[var15] = sea.a(var18, var19, 16486, (int) param1.field_K[var15], var17, sea.c((int) param1.field_i[var15], 255), (int) param1.field_s[var15], (int) param1.field_q[var15]);
                                break L19;
                              }
                            }
                            var15++;
                            if (var23 == 0) {
                              continue L18;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_57_0 = new ima((int[]) (var4), (int[]) (var5), (int[]) (var6), (float[][]) (var7));
              stackIn_58_0 = stackOut_57_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = (ima) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var4 = decompiledCaughtException;
            stackOut_59_0 = var4;
            stackOut_59_1 = new StringBuilder().append("qqa.G(");
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param0 == null) {
              stackOut_61_0 = stackIn_61_0;
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L25;
            } else {
              stackOut_60_0 = stackIn_60_0;
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L25;
            }
          }
          L26: {
            stackOut_62_0 = stackIn_62_0;
            stackOut_62_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_64_0 = stackIn_64_0;
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L26;
            } else {
              stackOut_63_0 = stackIn_63_0;
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L26;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_58_0;
        }
    }

    public static void a(int param0) {
        field_t = null;
        field_n = null;
        if (param0 != 0) {
            return;
        }
        field_p = null;
        field_o = null;
    }

    qqa() {
    }

    static {
        field_p = "Move";
        field_o = "Passwords can only contain letters and numbers";
    }
}
