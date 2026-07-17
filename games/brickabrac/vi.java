/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vi extends nm {
    int field_j;
    int field_k;
    int field_o;
    int field_l;
    int field_m;
    int field_i;
    static String field_n;

    final static void a(int param0, int[] param1, int param2, fo param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 29;
            L1: while (true) {
              if (var4_int >= 5) {
                break L0;
              } else {
                var6 = 0;
                L2: while (true) {
                  if (param1.length <= var6) {
                    var4_int++;
                    continue L1;
                  } else {
                    var7 = param3.a(-37880252, param1.length);
                    var8 = param1[var7];
                    param1[var7] = param1[var6];
                    param1[var6] = var8;
                    var6++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("vi.G(").append(-122).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(5).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    vi(int param0, int param1, int param2, int param3, int param4) {
        ((vi) this).field_j = param0;
        ((vi) this).field_o = param3;
        ((vi) this).field_m = param1;
        ((vi) this).field_k = param2;
        ((vi) this).field_i = param4;
    }

    void a(int param0, wq param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param1.l(255);
              if (0 != (128 & var3_int)) {
                var4 = param1.l(255);
                var5 = (var3_int & 7) << 3;
                var5 = var5 | (224 & var4) >> 5;
                var6 = 31 & var4;
                ((vi) this).field_j = var6 * 34 << 8;
                ((vi) this).field_m = var5 * 16 << 8;
                break L1;
              } else {
                var4 = var3_int & 12;
                var5 = var3_int & 3;
                ((vi) this).field_j = var4 << 14 | param1.i(65280);
                ((vi) this).field_m = var5 << 16 | param1.i(65280);
                break L1;
              }
            }
            L2: {
              if ((64 & var3_int) == 0) {
                ((vi) this).field_k = 0;
                ((vi) this).field_o = 0;
                break L2;
              } else {
                ((vi) this).field_k = param1.a(127);
                ((vi) this).field_o = param1.a(127);
                break L2;
              }
            }
            L3: {
              if ((var3_int & 32) == 0) {
                ((vi) this).field_l = 0;
                break L3;
              } else {
                ((vi) this).field_l = param1.l(255);
                break L3;
              }
            }
            if (param0 >= 89) {
              L4: {
                if ((var3_int & 16) != 0) {
                  ((vi) this).field_i = param1.l(255);
                  break L4;
                } else {
                  ((vi) this).field_i = 0;
                  break L4;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("vi.L(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final static int c(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            boolean discarded$30 = mf.field_f.a(v.field_e, tk.field_r, -114, true);
            mf.field_f.i(79);
            L1: while (true) {
              int discarded$31 = 5;
              if (!jl.a()) {
                var1_int = -30 % ((55 - param0) / 43);
                if (ch.field_b != -1) {
                  var2 = ch.field_b;
                  int discarded$32 = 1;
                  bd.a(-1);
                  stackOut_6_0 = var2;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (t.field_g) {
                    stackOut_10_0 = 3;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    if (ka.field_l == jm.field_f) {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    } else {
                      if (ma.field_I.b(96)) {
                        if (ik.field_g != jm.field_f) {
                          stackOut_22_0 = -1;
                          stackIn_23_0 = stackOut_22_0;
                          break L0;
                        } else {
                          stackOut_20_0 = 2;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    }
                  }
                }
              } else {
                boolean discarded$33 = mf.field_f.a(go.field_b, dc.field_b, true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "vi.J(" + param0 + 41);
        }
        return stackIn_23_0;
    }

    final static void a(byte param0) {
        if (param0 >= -81) {
            field_n = null;
        }
        nl.field_b.c((640 + -nl.field_b.field_x) / 2, 19);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int[] param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = BrickABrac.field_J ? 1 : 0;
          if (param15 < 0) {
            break L0;
          } else {
            if (~param2 > ~mg.field_b) {
              L1: {
                if (0 <= param7) {
                  break L1;
                } else {
                  if (0 <= param4) {
                    break L1;
                  } else {
                    if (param1 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (mg.field_e > param7) {
                  break L2;
                } else {
                  if (~param4 > ~mg.field_e) {
                    break L2;
                  } else {
                    if (mg.field_e <= param1) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                var34 = -param2 + param15;
                if (~param2 == ~param14) {
                  L4: {
                    if (param2 == param15) {
                      var23 = 0;
                      var28 = 0;
                      var21 = param16;
                      var31 = 0;
                      var26 = param6;
                      var30 = param13;
                      var24 = 0;
                      var29 = param0;
                      var18 = param4 << 16;
                      var19 = 0;
                      var22 = param10;
                      var32 = 0;
                      var27 = 0;
                      var17_int = param7 << 16;
                      var25 = param5;
                      var20 = 0;
                      break L4;
                    } else {
                      var35 = param15 + -param14;
                      if (~param7 <= ~param4) {
                        var31 = (param11 - param13 << 16) / var35;
                        var28 = (param12 + -param5 << 16) / var34;
                        var18 = param7 << 16;
                        var20 = (-param7 + param1 << 16) / var34;
                        var23 = (-param10 + param8 << 16) / var35;
                        var24 = (-param16 + param8 << 16) / var34;
                        var22 = param16 << 16;
                        var19 = (-param4 + param1 << 16) / var35;
                        var21 = param10 << 16;
                        var32 = (-param0 + param11 << 16) / var34;
                        var27 = (-param6 + param12 << 16) / var35;
                        var17_int = param4 << 16;
                        var25 = param6 << 16;
                        var30 = param0 << 16;
                        var29 = param13 << 16;
                        var26 = param5 << 16;
                        break L4;
                      } else {
                        var24 = (param8 - param10 << 16) / var35;
                        var31 = (-param0 + param11 << 16) / var34;
                        var30 = param13 << 16;
                        var20 = (param1 - param4 << 16) / var35;
                        var32 = (-param13 + param11 << 16) / var35;
                        var22 = param10 << 16;
                        var25 = param5 << 16;
                        var23 = (-param16 + param8 << 16) / var34;
                        var28 = (-param6 + param12 << 16) / var35;
                        var26 = param6 << 16;
                        var18 = param4 << 16;
                        var19 = (param1 - param7 << 16) / var34;
                        var29 = param0 << 16;
                        var21 = param16 << 16;
                        var27 = (param12 - param5 << 16) / var34;
                        var17_int = param7 << 16;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param2 >= 0) {
                      break L5;
                    } else {
                      param2 = Math.min(-param2, -param2 + param14);
                      var25 = var25 + var27 * param2;
                      var22 = var22 + param2 * var24;
                      var26 = var26 + param2 * var28;
                      var18 = var18 + var20 * param2;
                      var30 = var30 + param2 * var32;
                      var29 = var29 + var31 * param2;
                      var17_int = var17_int + param2 * var19;
                      var21 = var21 + var23 * param2;
                      param2 = 0;
                      break L5;
                    }
                  }
                  var33 = 0;
                  break L3;
                } else {
                  L6: {
                    var22 = param16 << 16;
                    var21 = param16 << 16;
                    var18 = param7 << 16;
                    var17_int = param7 << 16;
                    var26 = param5 << 16;
                    var25 = param5 << 16;
                    var30 = param0 << 16;
                    var29 = param0 << 16;
                    var35 = param14 - param2;
                    var19 = (-param7 + param4 << 16) / var35;
                    var20 = (param1 + -param7 << 16) / var34;
                    if (~var19 > ~var20) {
                      var28 = (param12 + -param5 << 16) / var34;
                      var27 = (-param5 + param6 << 16) / var35;
                      var33 = 0;
                      var31 = (param13 + -param0 << 16) / var35;
                      var24 = (param8 + -param16 << 16) / var34;
                      var32 = (-param0 + param11 << 16) / var34;
                      var23 = (param10 + -param16 << 16) / var35;
                      break L6;
                    } else {
                      var23 = (param8 - param16 << 16) / var34;
                      var32 = (-param0 + param13 << 16) / var35;
                      var28 = (-param5 + param6 << 16) / var35;
                      var33 = 1;
                      var31 = (-param0 + param11 << 16) / var34;
                      var24 = (param10 - param16 << 16) / var35;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var27 = (param12 + -param5 << 16) / var34;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      if (param2 < 0) {
                        if (param14 >= 0) {
                          param2 = -param2;
                          var18 = var18 + param2 * var20;
                          var29 = var29 + param2 * var31;
                          var17_int = var17_int + param2 * var19;
                          var26 = var26 + var28 * param2;
                          var22 = var22 + var24 * param2;
                          var21 = var21 + var23 * param2;
                          var30 = var30 + param2 * var32;
                          var25 = var25 + var27 * param2;
                          param2 = 0;
                          break L8;
                        } else {
                          param2 = -param2 + param14;
                          var18 = var18 + var20 * param2;
                          var22 = var22 + param2 * var24;
                          var29 = var29 + param2 * var31;
                          var30 = var30 + param2 * var32;
                          var21 = var21 + var23 * param2;
                          var26 = var26 + param2 * var28;
                          var17_int = var17_int + var19 * param2;
                          var25 = var25 + param2 * var27;
                          param2 = param14;
                          break L7;
                        }
                      } else {
                        break L8;
                      }
                    }
                    var36 = mg.field_g[param2];
                    L9: while (true) {
                      if (param2 >= param14) {
                        break L7;
                      } else {
                        L10: {
                          var37 = var17_int >> 16;
                          if (mg.field_e > var37) {
                            var38 = -(var17_int >> 16) + (var18 >> 16);
                            if (0 == var38) {
                              if (var37 < 0) {
                                break L10;
                              } else {
                                if (var37 < mg.field_e) {
                                  rp.a((byte) 127, var29, 0, 0, 0, var36 + var37, var38, var21, param9, var25);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            } else {
                              L11: {
                                var39 = (var22 - var21) / var38;
                                var40 = (var26 + -var25) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (~mg.field_e < ~(var38 + var37)) {
                                  break L11;
                                } else {
                                  var38 = -1 + (-var37 + mg.field_e);
                                  break L11;
                                }
                              }
                              if (var37 < 0) {
                                rp.a((byte) 121, var29 - var41 * var37, var41, var39, var40, var36, var38 + var37, var21 - var37 * var39, param9, -(var40 * var37) + var25);
                                break L10;
                              } else {
                                rp.a((byte) 117, var29, var41, var39, var40, var36 + var37, var38, var21, param9, var25);
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                        param2++;
                        if (mg.field_b > param2) {
                          var22 = var22 + var24;
                          var36 = var36 + lb.field_c;
                          var26 = var26 + var28;
                          var18 = var18 + var20;
                          var25 = var25 + var27;
                          var21 = var21 + var23;
                          var29 = var29 + var31;
                          var17_int = var17_int + var19;
                          var30 = var30 + var32;
                          continue L9;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  var36 = -param14 + param15;
                  if (var36 != 0) {
                    L12: {
                      var37 = param1 << 16;
                      var38 = param8 << 16;
                      var39 = param12 << 16;
                      if (var33 == 0) {
                        var21 = param10 << 16;
                        var29 = param13 << 16;
                        var17_int = param4 << 16;
                        var25 = param6 << 16;
                        break L12;
                      } else {
                        var26 = param6 << 16;
                        var22 = param10 << 16;
                        var30 = param13 << 16;
                        var18 = param4 << 16;
                        break L12;
                      }
                    }
                    var40 = param11 << 16;
                    var19 = (var37 + -var17_int) / var36;
                    var23 = (-var21 + var38) / var36;
                    var32 = (-var30 + var40) / var36;
                    var28 = (-var26 + var39) / var36;
                    var20 = (-var18 + var37) / var36;
                    var31 = (-var29 + var40) / var36;
                    var24 = (var38 - var22) / var36;
                    var27 = (-var25 + var39) / var36;
                    break L3;
                  } else {
                    var24 = 0;
                    var19 = 0;
                    var27 = 0;
                    var32 = 0;
                    var23 = 0;
                    var20 = 0;
                    var28 = 0;
                    var31 = 0;
                    break L3;
                  }
                }
              }
              L13: {
                if (param2 < 0) {
                  param2 = -param2;
                  var22 = var22 + param2 * var24;
                  var30 = var30 + param2 * var32;
                  var21 = var21 + param2 * var23;
                  var26 = var26 + var28 * param2;
                  var29 = var29 + var31 * param2;
                  var25 = var25 + param2 * var27;
                  var17_int = var17_int + var19 * param2;
                  var18 = var18 + param2 * var20;
                  param2 = 0;
                  break L13;
                } else {
                  break L13;
                }
              }
              var35 = mg.field_g[param2];
              L14: while (true) {
                if (param15 <= param2) {
                  return;
                } else {
                  L15: {
                    var36 = var17_int >> 16;
                    if (mg.field_e > var36) {
                      var37 = (var18 >> 16) - (var17_int >> 16);
                      if (var37 == 0) {
                        if (var36 < 0) {
                          break L15;
                        } else {
                          if (mg.field_e <= var36) {
                            break L15;
                          } else {
                            rp.a((byte) 127, var29, 0, 0, 0, var36 + var35, var37, var21, param9, var25);
                            break L15;
                          }
                        }
                      } else {
                        L16: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (var26 - var25) / var37;
                          var40 = (-var29 + var30) / var37;
                          if (var36 + var37 < mg.field_e) {
                            break L16;
                          } else {
                            var37 = mg.field_e - (var36 + 1);
                            break L16;
                          }
                        }
                        if (0 <= var36) {
                          rp.a((byte) 125, var29, var40, var38, var39, var35 + var36, var37, var21, param9, var25);
                          break L15;
                        } else {
                          rp.a((byte) 117, var29 + -(var40 * var36), var40, var38, var39, var35, var37 - -var36, var21 - var38 * var36, param9, var25 + -(var36 * var39));
                          break L15;
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                  param2++;
                  if (mg.field_b > param2) {
                    var17_int = var17_int + var19;
                    var26 = var26 + var28;
                    var22 = var22 + var24;
                    var25 = var25 + var27;
                    var35 = var35 + lb.field_c;
                    var18 = var18 + var20;
                    var21 = var21 + var23;
                    var30 = var30 + var32;
                    var29 = var29 + var31;
                    continue L14;
                  } else {
                    return;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    int a(int param0, StringBuilder param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        try {
          L0: {
            L1: {
              if (param0 > 79) {
                break L1;
              } else {
                vi.a((byte) 80);
                break L1;
              }
            }
            stackOut_2_0 = (11 * ((vi) this).field_l - -666 << 23 | 3 * (((vi) this).field_i - -5) << 7) ^ (((vi) this).field_m * 17 - -10855845 << 3 ^ ((vi) this).field_j * 31 - -15790320) + (58339 + 11 * ((vi) this).field_k | 29 * ((vi) this).field_o << 13);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("vi.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public static void a() {
        field_n = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        int discarded$2 = -99;
        jf.d();
        lb.d(param2, param3, param1, param4);
        if (param0 < 68) {
            field_n = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Waiting for sound effects";
    }
}
