/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    private byte[] field_a;
    static boolean field_k;
    static int[] field_h;
    static oc field_f;
    private int[] field_c;
    static int field_b;
    private int[] field_e;
    static String field_m;
    static int field_i;
    static ll[] field_j;
    static int field_g;
    static String field_d;
    static int field_l;

    final int a(int param0, byte param1, byte[] param2, int param3, byte[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_73_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param3 != 0) {
              L1: {
                param3 = param3 + param0;
                var7_int = 0;
                var8 = param5;
                if (param1 <= -113) {
                  break L1;
                } else {
                  u.a(-33);
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  L4: {
                    var9 = param4[var8];
                    if (var9 < 0) {
                      break L4;
                    } else {
                      var7_int++;
                      if (var11 != 0) {
                        break L3;
                      } else {
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var7_int = ((u) this).field_c[var7_int];
                  break L3;
                }
                L5: {
                  L6: {
                    var10 = ((u) this).field_c[var7_int];
                    if (((u) this).field_c[var7_int] < 0) {
                      L7: {
                        int incrementValue$8 = param0;
                        param0++;
                        param2[incrementValue$8] = (byte)(~var10);
                        if (~param0 > ~param3) {
                          break L7;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7_int = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L8: {
                    L9: {
                      if ((64 & var9) == 0) {
                        break L9;
                      } else {
                        var7_int = ((u) this).field_c[var7_int];
                        if (var11 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var7_int++;
                    break L8;
                  }
                  L10: {
                    var10 = ((u) this).field_c[var7_int];
                    if (((u) this).field_c[var7_int] >= 0) {
                      break L10;
                    } else {
                      int incrementValue$9 = param0;
                      param0++;
                      param2[incrementValue$9] = (byte)(~var10);
                      if (param0 >= param3) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if ((var9 & 32) != 0) {
                        break L12;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var7_int = ((u) this).field_c[var7_int];
                    break L11;
                  }
                  L13: {
                    var10 = ((u) this).field_c[var7_int];
                    if (0 <= ((u) this).field_c[var7_int]) {
                      break L13;
                    } else {
                      int incrementValue$10 = param0;
                      param0++;
                      param2[incrementValue$10] = (byte)(~var10);
                      if (~param0 <= ~param3) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L13;
                      }
                    }
                  }
                  L14: {
                    L15: {
                      if ((16 & var9) != 0) {
                        break L15;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    var7_int = ((u) this).field_c[var7_int];
                    break L14;
                  }
                  L16: {
                    var10 = ((u) this).field_c[var7_int];
                    if (((u) this).field_c[var7_int] < 0) {
                      L17: {
                        int incrementValue$11 = param0;
                        param0++;
                        param2[incrementValue$11] = (byte)(~var10);
                        if (param3 > param0) {
                          break L17;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L17;
                          }
                        }
                      }
                      var7_int = 0;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L18: {
                    L19: {
                      if ((var9 & 8) == 0) {
                        break L19;
                      } else {
                        var7_int = ((u) this).field_c[var7_int];
                        if (var11 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    var7_int++;
                    break L18;
                  }
                  L20: {
                    var10 = ((u) this).field_c[var7_int];
                    if (((u) this).field_c[var7_int] >= 0) {
                      break L20;
                    } else {
                      int incrementValue$12 = param0;
                      param0++;
                      param2[incrementValue$12] = (byte)(~var10);
                      if (param0 >= param3) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L20;
                      }
                    }
                  }
                  L21: {
                    L22: {
                      if ((4 & var9) != 0) {
                        break L22;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                    var7_int = ((u) this).field_c[var7_int];
                    break L21;
                  }
                  L23: {
                    var10 = ((u) this).field_c[var7_int];
                    if (((u) this).field_c[var7_int] < 0) {
                      L24: {
                        int incrementValue$13 = param0;
                        param0++;
                        param2[incrementValue$13] = (byte)(~var10);
                        if (~param0 > ~param3) {
                          break L24;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L24;
                          }
                        }
                      }
                      var7_int = 0;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L25: {
                    L26: {
                      if ((2 & var9) != 0) {
                        break L26;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                    var7_int = ((u) this).field_c[var7_int];
                    break L25;
                  }
                  L27: {
                    var10 = ((u) this).field_c[var7_int];
                    if (0 <= ((u) this).field_c[var7_int]) {
                      break L27;
                    } else {
                      L28: {
                        int incrementValue$14 = param0;
                        param0++;
                        param2[incrementValue$14] = (byte)(~var10);
                        if (param0 < param3) {
                          break L28;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L28;
                          }
                        }
                      }
                      var7_int = 0;
                      break L27;
                    }
                  }
                  L29: {
                    L30: {
                      if ((var9 & 1) != 0) {
                        break L30;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L29;
                        } else {
                          break L30;
                        }
                      }
                    }
                    var7_int = ((u) this).field_c[var7_int];
                    break L29;
                  }
                  L31: {
                    var10 = ((u) this).field_c[var7_int];
                    if (((u) this).field_c[var7_int] >= 0) {
                      break L31;
                    } else {
                      int incrementValue$15 = param0;
                      param0++;
                      param2[incrementValue$15] = (byte)(~var10);
                      if (~param0 <= ~param3) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L31;
                      }
                    }
                  }
                  var8++;
                  if (var11 == 0) {
                    continue L2;
                  } else {
                    break L5;
                  }
                }
                stackOut_73_0 = -param5 + (1 + var8);
                stackIn_74_0 = stackOut_73_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L32: {
            var7 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) var7;
            stackOut_75_1 = new StringBuilder().append("u.A(").append(param0).append(44).append(param1).append(44);
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param2 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L32;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L32;
            }
          }
          L33: {
            stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(44).append(param3).append(44);
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param4 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L33;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L33;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 44 + param5 + 41);
        }
        return stackIn_74_0;
    }

    final int a(byte[] param0, int param1, byte[] param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
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
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var7_int = 0;
            var8 = param3 << 3;
            param1 = param1 + param5;
            L1: while (true) {
              L2: {
                L3: {
                  if (~param5 <= ~param1) {
                    break L3;
                  } else {
                    var9 = 255 & param2[param5];
                    var10 = ((u) this).field_e[var9];
                    var11 = ((u) this).field_a[var9];
                    stackOut_3_0 = var11;
                    stackIn_18_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 == 0) {
                        throw new RuntimeException("" + var9);
                      } else {
                        L4: {
                          var12 = var8 >> 3;
                          var13 = var8 & 7;
                          var7_int = var7_int & -var13 >> 31;
                          var14 = var12 - -(-1 + (var11 + var13) >> 3);
                          var8 = var8 + var11;
                          var13 += 24;
                          int dupTemp$1 = fj.b(var7_int, var10 >>> var13);
                          var7_int = dupTemp$1;
                          param0[var12] = (byte)dupTemp$1;
                          if (var12 >= var14) {
                            break L4;
                          } else {
                            L5: {
                              var12++;
                              var13 -= 8;
                              var7_int = var10 >>> var13;
                              param0[var12] = (byte)(var10 >>> var13);
                              if (~var12 > ~var14) {
                                break L5;
                              } else {
                                if (var15 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var12++;
                            var13 -= 8;
                            var7_int = var10 >>> var13;
                            param0[var12] = (byte)(var10 >>> var13);
                            if (~var12 <= ~var14) {
                              break L4;
                            } else {
                              L6: {
                                var13 -= 8;
                                var12++;
                                var7_int = var10 >>> var13;
                                param0[var12] = (byte)(var10 >>> var13);
                                if (var12 < var14) {
                                  break L6;
                                } else {
                                  if (var15 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var13 -= 8;
                              var12++;
                              var7_int = var10 << -var13;
                              param0[var12] = (byte)(var10 << -var13);
                              break L4;
                            }
                          }
                        }
                        param5++;
                        if (var15 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_17_0 = param4;
                stackIn_18_0 = stackOut_17_0;
                break L2;
              }
              L7: {
                if (stackIn_18_0 == 1) {
                  break L7;
                } else {
                  field_b = 117;
                  break L7;
                }
              }
              stackOut_20_0 = -param3 + (var8 + 7 >> 3);
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("u.E(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param1).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_21_0;
    }

    final static int a(jd param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (0 < param2) {
              if (uj.a(-2147483648, param2)) {
                stackOut_4_0 = (int)(((long)param0.c((byte) -46) & 4294967295L) * (long)param2 >> 32);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              } else {
                var3_int = -(int)(4294967296L % (long)param2) + param1;
                L1: while (true) {
                  var4 = param0.c((byte) -46);
                  if (var3_int > var4) {
                    stackOut_9_0 = dh.a(var4, true, param2);
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  } else {
                    continue L1;
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("u.G(");
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        ab var1_ref = null;
        int var2 = 0;
        cg var3_ref_cg = null;
        long var3_long = 0L;
        int var3 = 0;
        na var4 = null;
        int var4_int = 0;
        int var5 = 0;
        na var6 = null;
        cg var7 = null;
        cg var8_ref_cg = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ab var12 = null;
        na var13 = null;
        na var14 = null;
        na var15 = null;
        Object var16 = null;
        Object var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        cg var21 = null;
        Object var22 = null;
        String var23 = null;
        String var24 = null;
        cg var25 = null;
        cg var26 = null;
        cg var27 = null;
        na var28 = null;
        na var29 = null;
        cg var30 = null;
        boolean stackIn_18_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_59_0 = 0;
        cg stackIn_64_0 = null;
        cg stackIn_65_0 = null;
        cg stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        cg stackIn_111_0 = null;
        cg stackIn_112_0 = null;
        cg stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_17_0 = false;
        int stackOut_25_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        cg stackOut_63_0 = null;
        cg stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        cg stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        cg stackOut_110_0 = null;
        cg stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        cg stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        var22 = null;
        var16 = null;
        var17 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 <= -45) {
              L1: {
                L2: {
                  L3: {
                    var12 = df.field_z;
                    var1_ref = var12;
                    var2 = ((wk) (Object) var1_ref).e((byte) -110);
                    if (var2 == 0) {
                      break L3;
                    } else {
                      if (var2 == 1) {
                        break L3;
                      } else {
                        if (var2 == 2) {
                          break L3;
                        } else {
                          if (var2 == 3) {
                            break L3;
                          } else {
                            if (var2 != 4) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  var3_ref_cg = (cg) (Object) ph.field_a.b(12623);
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var3_ref_cg == null) {
                          break L6;
                        } else {
                          var3_ref_cg.a(true);
                          var3_ref_cg.a((byte) 88);
                          var3_ref_cg = (cg) (Object) ph.field_a.a(0);
                          if (var11 != 0) {
                            break L5;
                          } else {
                            if (var11 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var3_ref_cg = (cg) (Object) bc.field_c.f(-79);
                      break L5;
                    }
                    L7: while (true) {
                      L8: {
                        L9: {
                          if (var3_ref_cg == null) {
                            break L9;
                          } else {
                            stackOut_17_0 = var3_ref_cg.field_Db;
                            stackIn_26_0 = stackOut_17_0 ? 1 : 0;
                            stackIn_18_0 = stackOut_17_0;
                            if (var11 != 0) {
                              break L8;
                            } else {
                              L10: {
                                L11: {
                                  if (stackIn_18_0) {
                                    break L11;
                                  } else {
                                    if (var3_ref_cg.field_Kb) {
                                      break L11;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L12: {
                                  if (!var3_ref_cg.field_Kb) {
                                    break L12;
                                  } else {
                                    oe.field_b = oe.field_b - 1;
                                    var3_ref_cg.field_Kb = false;
                                    break L12;
                                  }
                                }
                                var3_ref_cg.field_Db = false;
                                jf.a(var3_ref_cg, (byte) -109);
                                break L10;
                              }
                              var3_ref_cg = (cg) (Object) bc.field_c.a(-1);
                              if (var11 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        stackOut_25_0 = var2;
                        stackIn_26_0 = stackOut_25_0;
                        break L8;
                      }
                      L13: {
                        if (stackIn_26_0 != 1) {
                          break L13;
                        } else {
                          if (wi.field_f != null) {
                            va.field_e = wi.field_f.field_ic;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          if (var2 == 4) {
                            break L15;
                          } else {
                            wi.field_f = null;
                            if (var11 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var3 = ((wk) (Object) var1_ref).n(-98);
                        wi.field_f = new na(vf.field_l);
                        wi.field_f.a(46, (long)var3);
                        dn.a((wk) (Object) var1_ref, wi.field_f, false, 2);
                        ba.field_a = 0L;
                        break L14;
                      }
                      L16: {
                        L17: {
                          if (var2 == 2) {
                            break L17;
                          } else {
                            if (var2 == 3) {
                              break L17;
                            } else {
                              om.field_x = null;
                              if (var11 == 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                        if (null != om.field_x) {
                          break L16;
                        } else {
                          om.field_x = new na(vf.field_l);
                          break L16;
                        }
                      }
                      L18: {
                        if (var2 == 3) {
                          break L18;
                        } else {
                          dn.field_Db = false;
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L18;
                          }
                        }
                      }
                      dn.field_Db = true;
                      var3 = 0;
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (gh.field_E.length <= var3) {
                              break L21;
                            } else {
                              gh.field_E[var3] = ((wk) (Object) var12).o(6);
                              var3++;
                              if (var11 != 0) {
                                break L20;
                              } else {
                                if (var11 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          q.field_L = ((wk) (Object) var1_ref).e((byte) 32);
                          q.field_N = ((wk) (Object) var1_ref).e((byte) 72);
                          break L20;
                        }
                        var3 = 0;
                        L22: while (true) {
                          L23: {
                            if (var3 >= ng.field_D.length) {
                              break L23;
                            } else {
                              ng.field_D[var3] = ((wk) (Object) var12).o(6);
                              var3++;
                              if (var11 != 0) {
                                break L1;
                              } else {
                                if (var11 == 0) {
                                  continue L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                L24: {
                  if (var2 != 5) {
                    break L24;
                  } else {
                    L25: {
                      var3_long = ((wk) (Object) var1_ref).c(-943038560);
                      var19 = ((wk) (Object) var1_ref).l(-1);
                      var18 = ((wk) (Object) var1_ref).l(-1);
                      var20 = ((wk) (Object) var1_ref).l(-1);
                      var8_ref_cg = fn.a(var3_long, 119);
                      if (var18.equals((Object) (Object) "")) {
                        stackOut_58_0 = 0;
                        stackIn_59_0 = stackOut_58_0;
                        break L25;
                      } else {
                        stackOut_57_0 = 1;
                        stackIn_59_0 = stackOut_57_0;
                        break L25;
                      }
                    }
                    L26: {
                      L27: {
                        var9 = stackIn_59_0;
                        if (var8_ref_cg != null) {
                          break L27;
                        } else {
                          var8_ref_cg = new cg(var19, var20, var3_long);
                          bc.field_c.a((tf) (Object) var8_ref_cg, var3_long, (byte) 126);
                          if (var11 == 0) {
                            break L26;
                          } else {
                            break L27;
                          }
                        }
                      }
                      if (var9 == 0) {
                        break L26;
                      } else {
                        var8_ref_cg.a(var19, var20, 93);
                        break L26;
                      }
                    }
                    L28: {
                      var8_ref_cg.field_Ob = qj.b(-26572) + -(long)((wk) (Object) var1_ref).d(-10674);
                      var8_ref_cg.field_Pb = ((wk) (Object) var1_ref).n(-98);
                      var10 = ((wk) (Object) var1_ref).a(31);
                      stackOut_63_0 = (cg) var8_ref_cg;
                      stackIn_65_0 = stackOut_63_0;
                      stackIn_64_0 = stackOut_63_0;
                      if (0 == (1 & var10)) {
                        stackOut_65_0 = (cg) (Object) stackIn_65_0;
                        stackOut_65_1 = 0;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        break L28;
                      } else {
                        stackOut_64_0 = (cg) (Object) stackIn_64_0;
                        stackOut_64_1 = 1;
                        stackIn_66_0 = stackOut_64_0;
                        stackIn_66_1 = stackOut_64_1;
                        break L28;
                      }
                    }
                    stackIn_66_0.field_Jb = stackIn_66_1 != 0;
                    var8_ref_cg.field_Vb = var10 >> 1;
                    var8_ref_cg.field_Mb = ((wk) (Object) var1_ref).e((byte) -123);
                    var8_ref_cg.field_Bb = ((wk) (Object) var1_ref).e((byte) 100);
                    jf.a(var8_ref_cg, (byte) 1);
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L24;
                    }
                  }
                }
                L29: {
                  if (6 != var2) {
                    break L29;
                  } else {
                    L30: {
                      var3_long = ((wk) (Object) var1_ref).c(-943038560);
                      var5 = ((wk) (Object) var1_ref).e((byte) -96);
                      var21 = fn.a(var3_long, 111);
                      if (var21 == null) {
                        break L30;
                      } else {
                        L31: {
                          if (!var21.field_Kb) {
                            break L31;
                          } else {
                            oe.field_b = oe.field_b - 1;
                            var21.field_Kb = false;
                            break L31;
                          }
                        }
                        L32: {
                          L33: {
                            if (var5 != 0) {
                              break L33;
                            } else {
                              var21.a(true);
                              if (var11 == 0) {
                                break L32;
                              } else {
                                break L33;
                              }
                            }
                          }
                          var21.field_Eb = vd.field_i;
                          var21.field_Sb = var5;
                          break L32;
                        }
                        var21.a((byte) 88);
                        break L30;
                      }
                    }
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L29;
                    }
                  }
                }
                L34: {
                  if (var2 == 7) {
                    break L34;
                  } else {
                    L35: {
                      if (var2 == 8) {
                        break L35;
                      } else {
                        L36: {
                          if (var2 == 9) {
                            break L36;
                          } else {
                            L37: {
                              if (var2 != 10) {
                                break L37;
                              } else {
                                var14 = (na) (Object) vh.field_a.b(12623);
                                L38: while (true) {
                                  L39: {
                                    if (var14 == null) {
                                      break L39;
                                    } else {
                                      var14.a(true);
                                      var14.a((byte) 88);
                                      var14 = (na) (Object) vh.field_a.a(0);
                                      if (var11 != 0) {
                                        break L1;
                                      } else {
                                        if (var11 == 0) {
                                          continue L38;
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L1;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                            }
                            L40: {
                              L41: {
                                if (var2 == 11) {
                                  break L41;
                                } else {
                                  if (12 != var2) {
                                    break L40;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                              L42: {
                                var3 = ((wk) (Object) var1_ref).n(-98);
                                var28 = (na) (Object) nk.field_q.a((long)var3, (byte) -98);
                                if (var28 == null) {
                                  break L42;
                                } else {
                                  L43: {
                                    L44: {
                                      if (var2 != 11) {
                                        break L44;
                                      } else {
                                        var28.field_Hb = true;
                                        if (var11 == 0) {
                                          break L43;
                                        } else {
                                          break L44;
                                        }
                                      }
                                    }
                                    var28.field_Nb = true;
                                    break L43;
                                  }
                                  cb.a(var28, -26);
                                  break L42;
                                }
                              }
                              if (var11 == 0) {
                                break L1;
                              } else {
                                break L40;
                              }
                            }
                            L45: {
                              if (var2 != 13) {
                                break L45;
                              } else {
                                L46: {
                                  var3 = ((wk) (Object) var1_ref).n(-98);
                                  var4_int = ((wk) (Object) var1_ref).e((byte) -107);
                                  var15 = (na) (Object) nk.field_q.a((long)var3, (byte) -105);
                                  if (var15 == null) {
                                    break L46;
                                  } else {
                                    L47: {
                                      var15.field_Nb = false;
                                      var13 = var15;
                                      var6 = var13;
                                      if (0 == var4_int) {
                                        break L47;
                                      } else {
                                        var15.field_ac = var4_int;
                                        var15.field_bc = vd.field_i;
                                        break L47;
                                      }
                                    }
                                    var13.field_Hb = false;
                                    cb.a(var15, 25);
                                    break L46;
                                  }
                                }
                                if (var11 == 0) {
                                  break L1;
                                } else {
                                  break L45;
                                }
                              }
                            }
                            L48: {
                              if (var2 == 14) {
                                break L48;
                              } else {
                                if (var2 == 16) {
                                  break L48;
                                } else {
                                  L49: {
                                    if (var2 == 15) {
                                      break L49;
                                    } else {
                                      if (var2 == 17) {
                                        break L49;
                                      } else {
                                        L50: {
                                          if (var2 != 18) {
                                            break L50;
                                          } else {
                                            L51: {
                                              var3_long = ((wk) (Object) var1_ref).c(-943038560);
                                              var23 = ((wk) (Object) var1_ref).l(-1);
                                              var24 = ((wk) (Object) var1_ref).l(-1);
                                              var7 = vf.a(var3_long, 8192);
                                              if (var7 != null) {
                                                break L51;
                                              } else {
                                                var7 = new cg(var23, var24, var3_long);
                                                kn.field_qb.a((tf) (Object) var7, var3_long, (byte) 121);
                                                wi.field_f.field_Rb = wi.field_f.field_Rb + 1;
                                                break L51;
                                              }
                                            }
                                            L52: {
                                              var7.field_Pb = ((wk) (Object) var1_ref).n(-98);
                                              var8 = ((wk) (Object) var1_ref).a(16);
                                              var7.field_Vb = var8 >> 1;
                                              stackOut_110_0 = (cg) var7;
                                              stackIn_112_0 = stackOut_110_0;
                                              stackIn_111_0 = stackOut_110_0;
                                              if ((var8 & 1) == 0) {
                                                stackOut_112_0 = (cg) (Object) stackIn_112_0;
                                                stackOut_112_1 = 0;
                                                stackIn_113_0 = stackOut_112_0;
                                                stackIn_113_1 = stackOut_112_1;
                                                break L52;
                                              } else {
                                                stackOut_111_0 = (cg) (Object) stackIn_111_0;
                                                stackOut_111_1 = 1;
                                                stackIn_113_0 = stackOut_111_0;
                                                stackIn_113_1 = stackOut_111_1;
                                                break L52;
                                              }
                                            }
                                            stackIn_113_0.field_Jb = stackIn_113_1 != 0;
                                            var7.field_Mb = ((wk) (Object) var1_ref).e((byte) -109);
                                            var7.field_Bb = ((wk) (Object) var1_ref).e((byte) -120);
                                            ph.field_a.b((pg) (Object) var7, -1);
                                            if (var11 == 0) {
                                              break L1;
                                            } else {
                                              break L50;
                                            }
                                          }
                                        }
                                        L53: {
                                          if (19 != var2) {
                                            break L53;
                                          } else {
                                            L54: {
                                              var3_long = ((wk) (Object) var1_ref).c(-943038560);
                                              var5 = ((wk) (Object) var1_ref).e((byte) -111);
                                              var25 = vf.a(var3_long, 8192);
                                              if (var25 != null) {
                                                L55: {
                                                  L56: {
                                                    if (var5 == 0) {
                                                      break L56;
                                                    } else {
                                                      var25.field_Sb = var5;
                                                      var25.field_Eb = vd.field_i;
                                                      if (var11 == 0) {
                                                        break L55;
                                                      } else {
                                                        break L56;
                                                      }
                                                    }
                                                  }
                                                  var25.a(true);
                                                  break L55;
                                                }
                                                var25.a((byte) 88);
                                                wi.field_f.field_Rb = wi.field_f.field_Rb - 1;
                                                break L54;
                                              } else {
                                                break L54;
                                              }
                                            }
                                            if (var11 == 0) {
                                              break L1;
                                            } else {
                                              break L53;
                                            }
                                          }
                                        }
                                        L57: {
                                          if (var2 == 20) {
                                            break L57;
                                          } else {
                                            L58: {
                                              if (var2 == 21) {
                                                break L58;
                                              } else {
                                                L59: {
                                                  if (var2 != 22) {
                                                    break L59;
                                                  } else {
                                                    sk.field_e = ((wk) (Object) var1_ref).n(-98);
                                                    jh.field_e = ((wk) (Object) var1_ref).a(121);
                                                    if (var11 == 0) {
                                                      break L1;
                                                    } else {
                                                      break L59;
                                                    }
                                                  }
                                                }
                                                L60: {
                                                  if (var2 == 23) {
                                                    break L60;
                                                  } else {
                                                    jh.a((Throwable) null, "L1: " + nn.g((byte) -25), (byte) 20);
                                                    ka.b(false);
                                                    if (var11 == 0) {
                                                      break L1;
                                                    } else {
                                                      break L60;
                                                    }
                                                  }
                                                }
                                                qf.field_a = ((wk) (Object) var1_ref).c(-943038560);
                                                if (var11 == 0) {
                                                  break L1;
                                                } else {
                                                  break L58;
                                                }
                                              }
                                            }
                                            L61: {
                                              L62: {
                                                var3 = ((wk) (Object) var1_ref).n(-98);
                                                if (var3 == 0) {
                                                  break L62;
                                                } else {
                                                  ba.field_a = qj.b(-26572) + (long)var3;
                                                  if (var11 == 0) {
                                                    break L61;
                                                  } else {
                                                    break L62;
                                                  }
                                                }
                                              }
                                              ba.field_a = 0L;
                                              break L61;
                                            }
                                            if (var11 == 0) {
                                              break L1;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                        dn.a((wk) (Object) var1_ref, wi.field_f, false, 2);
                                        if (var11 == 0) {
                                          break L1;
                                        } else {
                                          break L49;
                                        }
                                      }
                                    }
                                  }
                                  L63: {
                                    var3_long = ((wk) (Object) var1_ref).c(-943038560);
                                    var5 = ((wk) (Object) var1_ref).e((byte) 107);
                                    var26 = fn.a(var3_long, 123);
                                    if (var26 == null) {
                                      break L63;
                                    } else {
                                      L64: {
                                        if (var5 != 0) {
                                          var26.field_Eb = vd.field_i;
                                          var26.field_Sb = var5;
                                          break L64;
                                        } else {
                                          break L64;
                                        }
                                      }
                                      L65: {
                                        L66: {
                                          if (var2 == 15) {
                                            break L66;
                                          } else {
                                            if (!var26.field_Kb) {
                                              break L65;
                                            } else {
                                              var26.field_Kb = false;
                                              oe.field_b = oe.field_b - 1;
                                              if (var11 == 0) {
                                                break L65;
                                              } else {
                                                break L66;
                                              }
                                            }
                                          }
                                        }
                                        var26.field_Db = false;
                                        break L65;
                                      }
                                      jf.a(var26, (byte) 15);
                                      break L63;
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L1;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                            }
                            L67: {
                              var3_long = ((wk) (Object) var1_ref).c(-943038560);
                              var27 = fn.a(var3_long, 121);
                              if (var27 == null) {
                                break L67;
                              } else {
                                L68: {
                                  L69: {
                                    if (var2 != 14) {
                                      break L69;
                                    } else {
                                      var27.field_Db = true;
                                      if (var11 == 0) {
                                        break L68;
                                      } else {
                                        break L69;
                                      }
                                    }
                                  }
                                  if (!var27.field_Kb) {
                                    oe.field_b = oe.field_b + 1;
                                    var27.field_Kb = true;
                                    break L68;
                                  } else {
                                    break L68;
                                  }
                                }
                                jf.a(var27, (byte) 127);
                                break L67;
                              }
                            }
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L36;
                            }
                          }
                        }
                        L70: {
                          var3 = ((wk) (Object) var1_ref).n(-98);
                          var4_int = ((wk) (Object) var1_ref).e((byte) 105);
                          var29 = (na) (Object) nk.field_q.a((long)var3, (byte) -70);
                          if (var29 != null) {
                            L71: {
                              L72: {
                                if (var4_int == 0) {
                                  break L72;
                                } else {
                                  var29.field_bc = vd.field_i;
                                  var29.field_ac = var4_int;
                                  if (var11 == 0) {
                                    break L71;
                                  } else {
                                    break L72;
                                  }
                                }
                              }
                              var29.a(true);
                              break L71;
                            }
                            var29.a((byte) 88);
                            break L70;
                          } else {
                            break L70;
                          }
                        }
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L35;
                        }
                      }
                    }
                    L73: {
                      var3 = ((wk) (Object) var1_ref).n(-98);
                      var4 = (na) (Object) nk.field_q.a((long)var3, (byte) -93);
                      if (var4 != null) {
                        break L73;
                      } else {
                        var4 = new na(vf.field_l);
                        nk.field_q.a((tf) (Object) var4, (long)var3, (byte) 116);
                        break L73;
                      }
                    }
                    dn.a((wk) (Object) var1_ref, var4, true, 2);
                    cb.a(var4, 67);
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L34;
                    }
                  }
                }
                var30 = (cg) (Object) gm.field_j.b(12623);
                L74: while (true) {
                  L75: {
                    if (var30 == null) {
                      break L75;
                    } else {
                      var30.a(true);
                      var30.a((byte) 88);
                      var30 = (cg) (Object) gm.field_j.a(0);
                      if (var11 != 0) {
                        break L1;
                      } else {
                        if (var11 == 0) {
                          continue L74;
                        } else {
                          break L75;
                        }
                      }
                    }
                  }
                  oe.field_b = 0;
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
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "u.D(" + param0 + 41);
        }
    }

    final static void b(int param0) {
        if (param0 != 6) {
            return;
        }
        if (ka.field_m == null) {
            return;
        }
        qm.a((java.awt.Canvas) (Object) ka.field_m, (byte) 122);
        ka.field_m.a(fi.field_d, (byte) 67);
        ka.field_m = null;
        if (ob.field_Y != null) {
            ob.field_Y.a(true);
        }
        on.field_c.requestFocus();
    }

    public static void a(int param0) {
        field_k = true;
        field_f = null;
        field_m = null;
        field_h = null;
        field_d = null;
        field_j = null;
    }

    u(byte[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length;
            ((u) this).field_a = param0;
            ((u) this).field_e = new int[var2_int];
            var19 = new int[33];
            var18 = var19;
            var17 = var18;
            var16 = var17;
            var3 = var16;
            ((u) this).field_c = new int[8];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              stackOut_2_0 = ~var2_int;
              stackOut_2_1 = ~var5;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  if (stackIn_3_0 >= stackIn_3_1) {
                    break L3;
                  } else {
                    var6 = param0[var5];
                    if (var15 != 0) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L4: {
                        if (var6 == 0) {
                          break L4;
                        } else {
                          L5: {
                            L6: {
                              var7 = 1 << -var6 + 32;
                              var8 = var19[var6];
                              ((u) this).field_e[var5] = var8;
                              if ((var8 & var7) != 0) {
                                break L6;
                              } else {
                                var10 = var6 - 1;
                                L7: while (true) {
                                  L8: {
                                    L9: {
                                      if (var10 < 1) {
                                        break L9;
                                      } else {
                                        var11 = var19[var10];
                                        stackOut_9_0 = var11;
                                        stackOut_9_1 = var8;
                                        stackIn_16_0 = stackOut_9_0;
                                        stackIn_16_1 = stackOut_9_1;
                                        stackIn_10_0 = stackOut_9_0;
                                        stackIn_10_1 = stackOut_9_1;
                                        if (var15 != 0) {
                                          break L8;
                                        } else {
                                          if (stackIn_10_0 != stackIn_10_1) {
                                            break L9;
                                          } else {
                                            L10: {
                                              L11: {
                                                var12 = 1 << -var10 + 32;
                                                if ((var12 & var11) != 0) {
                                                  break L11;
                                                } else {
                                                  var3[var10] = fj.b(var12, var11);
                                                  if (var15 == 0) {
                                                    break L10;
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                              }
                                              var3[var10] = var3[-1 + var10];
                                              if (var15 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            }
                                            var10--;
                                            if (var15 == 0) {
                                              continue L7;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_15_0 = var7;
                                    stackOut_15_1 = var8;
                                    stackIn_16_0 = stackOut_15_0;
                                    stackIn_16_1 = stackOut_15_1;
                                    break L8;
                                  }
                                  var9 = stackIn_16_0 | stackIn_16_1;
                                  if (var15 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var9 = var3[-1 + var6];
                            break L5;
                          }
                          var19[var6] = var9;
                          var10 = 1 + var6;
                          L12: while (true) {
                            L13: {
                              if (var10 > 32) {
                                break L13;
                              } else {
                                stackOut_20_0 = ~var19[var10];
                                stackOut_20_1 = ~var8;
                                stackIn_3_0 = stackOut_20_0;
                                stackIn_3_1 = stackOut_20_1;
                                stackIn_21_0 = stackOut_20_0;
                                stackIn_21_1 = stackOut_20_1;
                                if (var15 != 0) {
                                  continue L2;
                                } else {
                                  L14: {
                                    if (stackIn_21_0 != stackIn_21_1) {
                                      break L14;
                                    } else {
                                      var19[var10] = var9;
                                      break L14;
                                    }
                                  }
                                  var10++;
                                  if (var15 == 0) {
                                    continue L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var10 = 0;
                            var11 = 0;
                            L15: while (true) {
                              L16: {
                                L17: {
                                  if (~var11 <= ~var6) {
                                    break L17;
                                  } else {
                                    var12 = -2147483648 >>> var11;
                                    stackOut_26_0 = 0;
                                    stackOut_26_1 = var12 & var8;
                                    stackIn_41_0 = stackOut_26_0;
                                    stackIn_41_1 = stackOut_26_1;
                                    stackIn_27_0 = stackOut_26_0;
                                    stackIn_27_1 = stackOut_26_1;
                                    if (var15 != 0) {
                                      break L16;
                                    } else {
                                      L18: {
                                        L19: {
                                          if (stackIn_27_0 == stackIn_27_1) {
                                            break L19;
                                          } else {
                                            L20: {
                                              if (((u) this).field_c[var10] != 0) {
                                                break L20;
                                              } else {
                                                ((u) this).field_c[var10] = var4;
                                                break L20;
                                              }
                                            }
                                            var10 = ((u) this).field_c[var10];
                                            if (var15 == 0) {
                                              break L18;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        var10++;
                                        break L18;
                                      }
                                      L21: {
                                        L22: {
                                          var12 = var12 >>> 1;
                                          if (~((u) this).field_c.length < ~var10) {
                                            break L22;
                                          } else {
                                            var13 = new int[2 * ((u) this).field_c.length];
                                            var14 = 0;
                                            L23: while (true) {
                                              L24: {
                                                if (~((u) this).field_c.length >= ~var14) {
                                                  break L24;
                                                } else {
                                                  var13[var14] = ((u) this).field_c[var14];
                                                  var14++;
                                                  if (var15 != 0) {
                                                    break L21;
                                                  } else {
                                                    if (var15 == 0) {
                                                      continue L23;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                }
                                              }
                                              ((u) this).field_c = var13;
                                              break L22;
                                            }
                                          }
                                        }
                                        var11++;
                                        break L21;
                                      }
                                      if (var15 == 0) {
                                        continue L15;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                ((u) this).field_c[var10] = ~var5;
                                stackOut_40_0 = ~var10;
                                stackOut_40_1 = ~var4;
                                stackIn_41_0 = stackOut_40_0;
                                stackIn_41_1 = stackOut_40_1;
                                break L16;
                              }
                              if (stackIn_41_0 > stackIn_41_1) {
                                break L4;
                              } else {
                                var4 = 1 + var10;
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      var5++;
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var2 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var2;
            stackOut_45_1 = new StringBuilder().append("u.<init>(");
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
              break L25;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L25;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(byte param0, int param1, String param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        String stackIn_34_0 = null;
        String stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_12_0 = null;
        String stackOut_19_0 = null;
        String stackOut_29_0 = null;
        String stackOut_33_0 = null;
        String stackOut_39_0 = null;
        String stackOut_25_0 = null;
        String stackOut_22_0 = null;
        String stackOut_15_0 = null;
        String stackOut_8_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        try {
          L0: {
            if (1 != param1) {
              if (param1 == 2) {
                stackOut_5_0 = tj.a(-73, new String[1], rj.field_h);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (param1 != 3) {
                  if (param1 == 4) {
                    stackOut_12_0 = tj.a(125, new String[1], q.field_M);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    if (5 != param1) {
                      if (param1 == 6) {
                        stackOut_19_0 = tj.a(120, new String[1], b.field_b);
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        if (param1 != 7) {
                          if (param1 != 8) {
                            if (param1 == 11) {
                              stackOut_29_0 = tj.a(-92, new String[1], ui.field_w);
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            } else {
                              if (param1 == 12) {
                                stackOut_33_0 = tj.a(-85, new String[1], so.field_n);
                                stackIn_34_0 = stackOut_33_0;
                                return stackIn_34_0;
                              } else {
                                L1: {
                                  if (param0 < -125) {
                                    break L1;
                                  } else {
                                    field_l = -80;
                                    break L1;
                                  }
                                }
                                if (param1 == 13) {
                                  stackOut_39_0 = tj.a(-123, new String[1], qo.field_d);
                                  stackIn_40_0 = stackOut_39_0;
                                  break L0;
                                } else {
                                  return null;
                                }
                              }
                            }
                          } else {
                            stackOut_25_0 = tj.a(122, new String[1], c.field_c);
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0;
                          }
                        } else {
                          stackOut_22_0 = tj.a(122, new String[1], ho.field_d);
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      }
                    } else {
                      stackOut_15_0 = tj.a(-95, new String[1], gm.field_n);
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  }
                } else {
                  stackOut_8_0 = tj.a(-54, new String[1], ij.field_Gb);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              stackOut_1_0 = tj.a(126, new String[1], kb.field_e);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var3;
            stackOut_41_1 = new StringBuilder().append("u.B(").append(param0).append(44).append(param1).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L2;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 41);
        }
        return stackIn_40_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_h = new int[]{76, 77, 78};
        field_m = "Armageddon counter";
        field_f = new oc();
        field_i = 0;
        field_d = "Friends";
    }
}
