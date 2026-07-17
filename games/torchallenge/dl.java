/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends da {
    int field_B;
    int field_t;
    int field_J;
    int field_i;
    static int[] field_s;
    int field_u;
    nc field_K;
    int field_F;
    fb field_q;
    int field_w;
    static java.awt.Color field_l;
    int field_p;
    static eg field_H;
    fe field_k;
    int field_y;
    int field_m;
    int field_G;
    int field_o;
    int field_D;
    int field_z;
    int field_v;
    static int[] field_n;
    int field_A;
    ab field_I;
    int field_x;
    static boolean[][] field_r;
    static ka field_j;
    static int[][] field_C;
    static String field_E;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int[] param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        L0: {
          var42 = TorChallenge.field_F ? 1 : 0;
          if (param15 < 0) {
            break L0;
          } else {
            if (oc.field_e <= param7) {
              break L0;
            } else {
              L1: {
                if (param1 >= 0) {
                  break L1;
                } else {
                  if (param5 >= 0) {
                    break L1;
                  } else {
                    if (0 <= param4) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (oc.field_d > param1) {
                  break L2;
                } else {
                  if (oc.field_d > param5) {
                    break L2;
                  } else {
                    if (oc.field_d <= param4) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (param13 == 1047574608) {
                L3: {
                  var34 = param15 - param7;
                  if (param14 != param7) {
                    L4: {
                      var18 = param1 << 16;
                      var17_int = param1 << 16;
                      var30 = param2 << 16;
                      var29 = param2 << 16;
                      var22 = param8 << 16;
                      var21 = param8 << 16;
                      var26 = param0 << 16;
                      var25 = param0 << 16;
                      var35 = param14 + -param7;
                      var20 = (param4 + -param1 << 16) / var34;
                      var19 = (-param1 + param5 << 16) / var35;
                      if (var19 < var20) {
                        var32 = (-param2 + param3 << 16) / var34;
                        var28 = (param10 - param0 << 16) / var34;
                        var24 = (param6 + -param8 << 16) / var34;
                        var31 = (-param2 + param16 << 16) / var35;
                        var27 = (param11 - param0 << 16) / var35;
                        var33 = 0;
                        var23 = (-param8 + param9 << 16) / var35;
                        break L4;
                      } else {
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var31 = (-param2 + param3 << 16) / var34;
                        var23 = (param6 - param8 << 16) / var34;
                        var28 = (param11 - param0 << 16) / var35;
                        var24 = (-param8 + param9 << 16) / var35;
                        var27 = (param10 + -param0 << 16) / var34;
                        var32 = (-param2 + param16 << 16) / var35;
                        var33 = 1;
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        if (param7 < 0) {
                          if (param14 < 0) {
                            param7 = param14 + -param7;
                            var29 = var29 + param7 * var31;
                            var18 = var18 + param7 * var20;
                            var17_int = var17_int + param7 * var19;
                            var25 = var25 + param7 * var27;
                            var22 = var22 + var24 * param7;
                            var21 = var21 + var23 * param7;
                            var26 = var26 + var28 * param7;
                            var30 = var30 + var32 * param7;
                            param7 = param14;
                            break L5;
                          } else {
                            param7 = -param7;
                            var21 = var21 + var23 * param7;
                            var29 = var29 + param7 * var31;
                            var22 = var22 + var24 * param7;
                            var26 = var26 + var28 * param7;
                            var18 = var18 + var20 * param7;
                            var25 = var25 + param7 * var27;
                            var17_int = var17_int + param7 * var19;
                            var30 = var30 + param7 * var32;
                            param7 = 0;
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      var36 = oc.field_b[param7];
                      L7: while (true) {
                        if (param7 >= param14) {
                          break L5;
                        } else {
                          L8: {
                            var37 = var17_int >> 16;
                            if (oc.field_d > var37) {
                              var38 = -(var17_int >> 16) + (var18 >> 16);
                              if (var38 == 0) {
                                if (var37 < 0) {
                                  break L8;
                                } else {
                                  if (var37 < oc.field_d) {
                                    ug.a(var25, (byte) -27, param12, 0, 0, var38, var36 + var37, 0, var21, var29);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                              } else {
                                L9: {
                                  var39 = (-var21 + var22) / var38;
                                  var40 = (var26 + -var25) / var38;
                                  var41 = (var30 - var29) / var38;
                                  if (oc.field_d > var37 + var38) {
                                    break L9;
                                  } else {
                                    var38 = -var37 + (oc.field_d - 1);
                                    break L9;
                                  }
                                }
                                if (var37 < 0) {
                                  ug.a(var25 + -(var37 * var40), (byte) -61, param12, var39, var40, var38 - -var37, var36, var41, -(var37 * var39) + var21, -(var37 * var41) + var29);
                                  break L8;
                                } else {
                                  ug.a(var25, (byte) -44, param12, var39, var40, var38, var37 - -var36, var41, var21, var29);
                                  break L8;
                                }
                              }
                            } else {
                              break L8;
                            }
                          }
                          param7++;
                          if (param7 >= oc.field_e) {
                            return;
                          } else {
                            var21 = var21 + var23;
                            var25 = var25 + var27;
                            var36 = var36 + qg.field_g;
                            var22 = var22 + var24;
                            var29 = var29 + var31;
                            var26 = var26 + var28;
                            var17_int = var17_int + var19;
                            var30 = var30 + var32;
                            var18 = var18 + var20;
                            continue L7;
                          }
                        }
                      }
                    }
                    var36 = param15 + -param14;
                    if (0 != var36) {
                      L10: {
                        var37 = param4 << 16;
                        var38 = param6 << 16;
                        var39 = param10 << 16;
                        var40 = param3 << 16;
                        if (var33 != 0) {
                          var18 = param5 << 16;
                          var30 = param16 << 16;
                          var26 = param11 << 16;
                          var22 = param9 << 16;
                          break L10;
                        } else {
                          var29 = param16 << 16;
                          var25 = param11 << 16;
                          var21 = param9 << 16;
                          var17_int = param5 << 16;
                          break L10;
                        }
                      }
                      var23 = (var38 - var21) / var36;
                      var32 = (-var30 + var40) / var36;
                      var31 = (-var29 + var40) / var36;
                      var28 = (var39 + -var26) / var36;
                      var20 = (-var18 + var37) / var36;
                      var19 = (-var17_int + var37) / var36;
                      var24 = (-var22 + var38) / var36;
                      var27 = (-var25 + var39) / var36;
                      break L3;
                    } else {
                      var24 = 0;
                      var31 = 0;
                      var28 = 0;
                      var23 = 0;
                      var20 = 0;
                      var19 = 0;
                      var32 = 0;
                      var27 = 0;
                      break L3;
                    }
                  } else {
                    L11: {
                      if (param7 != param15) {
                        var35 = param15 + -param14;
                        if (param5 > param1) {
                          var20 = (-param5 + param4 << 16) / var35;
                          var28 = (param10 + -param11 << 16) / var35;
                          var24 = (-param9 + param6 << 16) / var35;
                          var30 = param16 << 16;
                          var18 = param5 << 16;
                          var27 = (param10 - param0 << 16) / var34;
                          var31 = (param3 - param2 << 16) / var34;
                          var32 = (-param16 + param3 << 16) / var35;
                          var23 = (-param8 + param6 << 16) / var34;
                          var29 = param2 << 16;
                          var19 = (param4 + -param1 << 16) / var34;
                          var25 = param0 << 16;
                          var26 = param11 << 16;
                          var22 = param9 << 16;
                          var17_int = param1 << 16;
                          var21 = param8 << 16;
                          break L11;
                        } else {
                          var30 = param2 << 16;
                          var23 = (-param9 + param6 << 16) / var35;
                          var18 = param1 << 16;
                          var22 = param8 << 16;
                          var31 = (param3 - param16 << 16) / var35;
                          var29 = param16 << 16;
                          var21 = param9 << 16;
                          var32 = (param3 + -param2 << 16) / var34;
                          var27 = (param10 - param11 << 16) / var35;
                          var25 = param11 << 16;
                          var24 = (-param8 + param6 << 16) / var34;
                          var19 = (param4 - param5 << 16) / var35;
                          var28 = (param10 - param0 << 16) / var34;
                          var26 = param0 << 16;
                          var20 = (param4 + -param1 << 16) / var34;
                          var17_int = param5 << 16;
                          break L11;
                        }
                      } else {
                        var28 = 0;
                        var17_int = param1 << 16;
                        var19 = 0;
                        var30 = param16;
                        var26 = param11;
                        var20 = 0;
                        var27 = 0;
                        var25 = param0;
                        var18 = param5 << 16;
                        var23 = 0;
                        var21 = param8;
                        var24 = 0;
                        var31 = 0;
                        var29 = param2;
                        var22 = param9;
                        var32 = 0;
                        break L11;
                      }
                    }
                    L12: {
                      if (param7 >= 0) {
                        break L12;
                      } else {
                        param7 = Math.min(-param7, -param7 + param14);
                        var25 = var25 + var27 * param7;
                        var30 = var30 + var32 * param7;
                        var26 = var26 + var28 * param7;
                        var17_int = var17_int + param7 * var19;
                        var22 = var22 + var24 * param7;
                        var21 = var21 + param7 * var23;
                        var29 = var29 + var31 * param7;
                        var18 = var18 + var20 * param7;
                        param7 = 0;
                        break L12;
                      }
                    }
                    var33 = 0;
                    break L3;
                  }
                }
                L13: {
                  if (0 <= param7) {
                    break L13;
                  } else {
                    param7 = -param7;
                    var21 = var21 + var23 * param7;
                    var29 = var29 + var31 * param7;
                    var18 = var18 + param7 * var20;
                    var30 = var30 + var32 * param7;
                    var26 = var26 + var28 * param7;
                    var25 = var25 + var27 * param7;
                    var17_int = var17_int + var19 * param7;
                    var22 = var22 + var24 * param7;
                    param7 = 0;
                    break L13;
                  }
                }
                var35 = oc.field_b[param7];
                L14: while (true) {
                  if (param15 <= param7) {
                    return;
                  } else {
                    L15: {
                      var36 = var17_int >> 16;
                      if (oc.field_d > var36) {
                        var37 = -(var17_int >> 16) + (var18 >> 16);
                        if (var37 == 0) {
                          if (var36 < 0) {
                            break L15;
                          } else {
                            if (var36 >= oc.field_d) {
                              break L15;
                            } else {
                              ug.a(var25, (byte) -55, param12, 0, 0, var37, var35 + var36, 0, var21, var29);
                              break L15;
                            }
                          }
                        } else {
                          L16: {
                            var38 = (var22 - var21) / var37;
                            var39 = (var26 + -var25) / var37;
                            var40 = (var30 - var29) / var37;
                            if (oc.field_d <= var36 + var37) {
                              var37 = oc.field_d + (-var36 + -1);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          if (0 <= var36) {
                            ug.a(var25, (byte) -118, param12, var38, var39, var37, var35 + var36, var40, var21, var29);
                            break L15;
                          } else {
                            ug.a(var25 - var36 * var39, (byte) -118, param12, var38, var39, var37 - -var36, var35, var40, var21 - var38 * var36, -(var40 * var36) + var29);
                            break L15;
                          }
                        }
                      } else {
                        break L15;
                      }
                    }
                    param7++;
                    if (param7 < oc.field_e) {
                      var30 = var30 + var32;
                      var35 = var35 + qg.field_g;
                      var17_int = var17_int + var19;
                      var18 = var18 + var20;
                      var29 = var29 + var31;
                      var21 = var21 + var23;
                      var26 = var26 + var28;
                      var22 = var22 + var24;
                      var25 = var25 + var27;
                      continue L14;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(int param0) {
        ((dl) this).field_I = null;
        ((dl) this).field_K = null;
        ((dl) this).field_q = null;
        if (param0 != 1047574608) {
            ((dl) this).field_F = -19;
        }
        ((dl) this).field_k = null;
    }

    final static byte[] a(String param0, boolean param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = ji.field_r.a(-2, param0, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("dl.A(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 0 + 41);
        }
        return stackIn_3_0;
    }

    final static String[] a(String param0, char param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        Object stackIn_3_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param2 < -17) {
              var10 = (CharSequence) (Object) param0;
              var3_int = w.a(-15, var10, param1);
              var4 = new String[var3_int + 1];
              var5 = 0;
              var6 = 0;
              var7 = 0;
              L1: while (true) {
                if (var3_int <= var7) {
                  var4[var3_int] = param0.substring(var6);
                  stackOut_10_0 = (String[]) var4;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  var8 = var6;
                  L2: while (true) {
                    if (param0.charAt(var8) == param1) {
                      int incrementValue$2 = var5;
                      var5++;
                      var4[incrementValue$2] = param0.substring(var6, var8);
                      var6 = var8 + 1;
                      var7++;
                      continue L1;
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("dl.E(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_11_0;
    }

    public static void b(boolean param0) {
        field_C = null;
        field_j = null;
        field_l = null;
        field_n = null;
        field_H = null;
        field_s = null;
        field_E = null;
        field_r = null;
    }

    dl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[3];
        field_l = new java.awt.Color(10040319);
        field_C = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[1], new int[1]};
        field_r = new boolean[][]{new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[1], new boolean[1]};
        field_E = "Tor Challenge";
    }
}
