/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha implements db {
    private wl field_f;
    static hf field_c;
    private int field_b;
    private int field_d;
    static int[] field_e;
    static boolean field_a;

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              L2: {
                if (param3.field_u) {
                  break L2;
                } else {
                  if (param3.h(0)) {
                    break L2;
                  } else {
                    stackOut_3_0 = 2188450;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            var6_int = stackIn_5_0;
            if (param2 <= -14) {
              L3: {
                int discarded$1 = ((ha) this).field_f.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_l + "</u>", param3.field_k + param0, param3.field_j + param1, param3.field_g, param3.field_x, var6_int, -1, ((ha) this).field_b, ((ha) this).field_d, ((ha) this).field_f.field_r + ((ha) this).field_f.field_x);
                if (!param3.h(0)) {
                  break L3;
                } else {
                  L4: {
                    var7 = ((ha) this).field_f.b(param3.field_l);
                    var8 = ((ha) this).field_f.field_x + ((ha) this).field_f.field_r;
                    var9 = param0 - -param3.field_k;
                    var10 = param3.field_j + param1;
                    if (((ha) this).field_b == 2) {
                      var9 = var9 + (-var7 + param3.field_g);
                      break L4;
                    } else {
                      if (1 != ((ha) this).field_b) {
                        break L4;
                      } else {
                        var9 = var9 + (param3.field_g + -var7 >> 1);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (((ha) this).field_d != 2) {
                      if (((ha) this).field_d != 1) {
                        break L5;
                      } else {
                        var10 = var10 + (-var8 + param3.field_x >> 1);
                        break L5;
                      }
                    } else {
                      var10 = var10 + (param3.field_x + -var8);
                      break L5;
                    }
                  }
                  ic.a(false, 4 + var7, var9 + -2, var8, var10 + 2);
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("ha.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        var19 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (0 > param7) {
                break L1;
              } else {
                if (bi.field_f <= param2) {
                  break L1;
                } else {
                  L2: {
                    if (param3 >= 0) {
                      break L2;
                    } else {
                      if (param0 >= 0) {
                        break L2;
                      } else {
                        if (param4 >= 0) {
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param3 < bi.field_c) {
                      break L3;
                    } else {
                      if (bi.field_c > param0) {
                        break L3;
                      } else {
                        if (bi.field_c <= param4) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = -param2 + param7;
                    if (param2 == param1) {
                      L5: {
                        if (param7 != param2) {
                          var15 = -param1 + param7;
                          if (param3 >= param0) {
                            var11 = (param4 + -param0 << 16) / var15;
                            var10 = param3 << 16;
                            var12 = (-param3 + param4 << 16) / var14;
                            var9_int = param0 << 16;
                            break L5;
                          } else {
                            var12 = (param4 - param0 << 16) / var15;
                            var11 = (-param3 + param4 << 16) / var14;
                            var10 = param0 << 16;
                            var9_int = param3 << 16;
                            break L5;
                          }
                        } else {
                          var12 = 0;
                          var10 = param0 << 16;
                          var11 = 0;
                          var9_int = param3 << 16;
                          break L5;
                        }
                      }
                      var13 = 0;
                      if (param2 < 0) {
                        param2 = Math.min(-param2, -param2 + param1);
                        var9_int = var9_int + param2 * var11;
                        var10 = var10 + var12 * param2;
                        param2 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      L6: {
                        var10 = param3 << 16;
                        var9_int = param3 << 16;
                        var15 = param1 - param2;
                        var12 = (param4 + -param3 << 16) / var14;
                        var11 = (param0 + -param3 << 16) / var15;
                        if (var12 > var11) {
                          var13 = 0;
                          break L6;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L6;
                        }
                      }
                      L7: {
                        if (param2 < 0) {
                          if (param1 < 0) {
                            param2 = -param2 + param1;
                            var9_int = var9_int + param2 * var11;
                            var10 = var10 + param2 * var12;
                            param2 = param1;
                            break L7;
                          } else {
                            param2 = -param2;
                            var10 = var10 + param2 * var12;
                            var9_int = var9_int + param2 * var11;
                            param2 = 0;
                            var16 = bi.field_a[param2];
                            L8: while (true) {
                              if (param2 >= param1) {
                                break L7;
                              } else {
                                L9: {
                                  var17 = var9_int >> 16;
                                  if (bi.field_c > var17) {
                                    var18 = (var10 >> 16) - (var9_int >> 16);
                                    if (var18 == 0) {
                                      if (0 > var17) {
                                        break L9;
                                      } else {
                                        if (bi.field_c <= var17) {
                                          break L9;
                                        } else {
                                          bb.a(-23466, var17 - -var16, param6, var18, param8);
                                          break L9;
                                        }
                                      }
                                    } else {
                                      L10: {
                                        if (bi.field_c > var17 - -var18) {
                                          break L10;
                                        } else {
                                          var18 = -1 + -var17 + bi.field_c;
                                          break L10;
                                        }
                                      }
                                      if (var17 < 0) {
                                        bb.a(-23466, var16, param6, var17 + var18, param8);
                                        break L9;
                                      } else {
                                        bb.a(-23466, var17 + var16, param6, var18, param8);
                                        break L9;
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                param2++;
                                if (param2 >= bi.field_f) {
                                  return;
                                } else {
                                  var16 = var16 + em.field_l;
                                  var9_int = var9_int + var11;
                                  var10 = var10 + var12;
                                  continue L8;
                                }
                              }
                            }
                          }
                        } else {
                          var16 = bi.field_a[param2];
                          L11: while (true) {
                            if (param2 >= param1) {
                              break L7;
                            } else {
                              L12: {
                                var17 = var9_int >> 16;
                                if (bi.field_c > var17) {
                                  var18 = (var10 >> 16) - (var9_int >> 16);
                                  if (var18 == 0) {
                                    if (0 > var17) {
                                      break L12;
                                    } else {
                                      if (bi.field_c <= var17) {
                                        break L12;
                                      } else {
                                        bb.a(-23466, var17 - -var16, param6, var18, param8);
                                        break L12;
                                      }
                                    }
                                  } else {
                                    L13: {
                                      if (bi.field_c > var17 - -var18) {
                                        break L13;
                                      } else {
                                        var18 = -1 + -var17 + bi.field_c;
                                        break L13;
                                      }
                                    }
                                    if (var17 < 0) {
                                      bb.a(-23466, var16, param6, var17 + var18, param8);
                                      break L12;
                                    } else {
                                      bb.a(-23466, var17 + var16, param6, var18, param8);
                                      break L12;
                                    }
                                  }
                                } else {
                                  break L12;
                                }
                              }
                              param2++;
                              if (param2 >= bi.field_f) {
                                return;
                              } else {
                                var16 = var16 + em.field_l;
                                var9_int = var9_int + var11;
                                var10 = var10 + var12;
                                continue L11;
                              }
                            }
                          }
                        }
                      }
                      var16 = -param1 + param7;
                      if (var16 == 0) {
                        var11 = 0;
                        var12 = 0;
                        break L4;
                      } else {
                        L14: {
                          if (var13 != 0) {
                            var10 = param0 << 16;
                            break L14;
                          } else {
                            var9_int = param0 << 16;
                            break L14;
                          }
                        }
                        var17 = param4 << 16;
                        var12 = (-var10 + var17) / var16;
                        var11 = (-var9_int + var17) / var16;
                        break L4;
                      }
                    }
                  }
                  L15: {
                    if (param2 < 0) {
                      param2 = -param2;
                      var10 = var10 + var12 * param2;
                      var9_int = var9_int + param2 * var11;
                      param2 = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var15 = bi.field_a[param2];
                  L16: while (true) {
                    if (param7 <= param2) {
                      L17: {
                        if (param5 > 33) {
                          break L17;
                        } else {
                          var20 = null;
                          ha.a(96, -39, -128, (byte) 0, -4, 16, -43, 90, (int[]) null, -115);
                          break L17;
                        }
                      }
                      break L0;
                    } else {
                      L18: {
                        var16 = var9_int >> 16;
                        if (bi.field_c > var16) {
                          var17 = -(var9_int >> 16) + (var10 >> 16);
                          if (var17 != 0) {
                            L19: {
                              if (bi.field_c > var17 + var16) {
                                break L19;
                              } else {
                                var17 = -1 + (-var16 + bi.field_c);
                                break L19;
                              }
                            }
                            if (var16 < 0) {
                              bb.a(-23466, var15, param6, var16 + var17, param8);
                              break L18;
                            } else {
                              bb.a(-23466, var15 + var16, param6, var17, param8);
                              break L18;
                            }
                          } else {
                            if (0 > var16) {
                              break L18;
                            } else {
                              if (bi.field_c <= var16) {
                                break L18;
                              } else {
                                bb.a(-23466, var16 + var15, param6, var17, param8);
                                break L18;
                              }
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                      param2++;
                      if (param2 >= bi.field_f) {
                        return;
                      } else {
                        var9_int = var9_int + var11;
                        var10 = var10 + var12;
                        var15 = var15 + em.field_l;
                        continue L16;
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var9 = decompiledCaughtException;
            stackOut_94_0 = (RuntimeException) var9;
            stackOut_94_1 = new StringBuilder().append("ha.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param8 == null) {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L20;
            } else {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L20;
            }
          }
          throw t.a((Throwable) (Object) stackIn_97_0, stackIn_97_2 + 41);
        }
    }

    final static ab a(int param0, int param1, mf param2, int param3, mf param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        ab stackIn_6_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        ab stackOut_5_0 = null;
        Object stackOut_1_0 = null;
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
        try {
          L0: {
            if (uc.a(param4, param1 ^ 198630719, param0, param3)) {
              L1: {
                if (param1 == -198630768) {
                  break L1;
                } else {
                  field_c = null;
                  break L1;
                }
              }
              stackOut_5_0 = ea.a(param2.a(param0, (byte) -97, param3), -1);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ab) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ha.O(").append(param0).append(44).append(param1).append(44);
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param3).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    public ha() {
        ((ha) this).field_b = 1;
        ((ha) this).field_d = 1;
        ((ha) this).field_f = sb.field_a;
    }

    ha(wl param0, int param1, int param2) {
        try {
            ((ha) this).field_b = param1;
            ((ha) this).field_d = param2;
            ((ha) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ha.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int[] param8, int param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        int[] var18 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var16 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param3 <= -75) {
                break L1;
              } else {
                var17 = null;
                ab discarded$1 = ha.a(-4, -41, (mf) null, 73, (mf) null);
                break L1;
              }
            }
            L2: while (true) {
              param7--;
              if (param7 < 0) {
                break L0;
              } else {
                var18 = param8;
                var10_array = var18;
                var11 = param1;
                var12 = param9;
                var13 = param0;
                var14 = param4;
                var15 = 8355711 & var18[var11] >> 1;
                var10_array[var11] = ae.a(var13 >> 9, 65280) + (ae.a(33423360, var12) >> 1) - (-(ae.a(var14, 33532346) >> 17) - var15);
                param4 = param4 + param2;
                param9 = param9 + param5;
                param0 = param0 + param6;
                param1++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var10;
            stackOut_6_1 = new StringBuilder().append("ha.N(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param8 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new hf();
        field_e = new int[]{19, 27};
        field_a = false;
    }
}
