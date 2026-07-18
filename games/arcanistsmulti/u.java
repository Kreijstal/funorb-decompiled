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
        int stackIn_99_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_98_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
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
                stackOut_98_0 = -param5 + (1 + var8);
                stackIn_99_0 = stackOut_98_0;
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
            stackOut_100_0 = (RuntimeException) var7;
            stackOut_100_1 = new StringBuilder().append("u.A(").append(param0).append(',').append(param1).append(',');
            stackIn_103_0 = stackOut_100_0;
            stackIn_103_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param2 == null) {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L32;
            } else {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "{...}";
              stackIn_104_0 = stackOut_101_0;
              stackIn_104_1 = stackOut_101_1;
              stackIn_104_2 = stackOut_101_2;
              break L32;
            }
          }
          L33: {
            stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
            stackOut_104_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_104_2).append(',').append(param3).append(',');
            stackIn_107_0 = stackOut_104_0;
            stackIn_107_1 = stackOut_104_1;
            stackIn_105_0 = stackOut_104_0;
            stackIn_105_1 = stackOut_104_1;
            if (param4 == null) {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "null";
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              stackIn_108_2 = stackOut_107_2;
              break L33;
            } else {
              stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
              stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
              stackOut_105_2 = "{...}";
              stackIn_108_0 = stackOut_105_0;
              stackIn_108_1 = stackOut_105_1;
              stackIn_108_2 = stackOut_105_2;
              break L33;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_108_0, stackIn_108_2 + ',' + param5 + ')');
        }
        return stackIn_99_0;
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
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var7_int = 0;
            var8 = param3 << 450450179;
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
                    stackIn_22_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 == 0) {
                        throw new RuntimeException("" + var9);
                      } else {
                        L4: {
                          var12 = var8 >> -1776433085;
                          var13 = var8 & 7;
                          var7_int = var7_int & -var13 >> 1274093471;
                          var14 = var12 - -(-1 + (var11 + var13) >> 1445648387);
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
                stackOut_21_0 = param4;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              }
              L7: {
                if (stackIn_22_0 == 1) {
                  break L7;
                } else {
                  field_b = 117;
                  break L7;
                }
              }
              stackOut_25_0 = -param3 + (var8 + 7 >> 1978117955);
              stackIn_26_0 = stackOut_25_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var7;
            stackOut_27_1 = new StringBuilder().append("u.E(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L9;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_26_0;
    }

    final static int a(jd param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (0 < param2) {
              if (uj.a(-2147483648, param2)) {
                stackOut_6_0 = (int)(((long)param0.c((byte) -46) & 4294967295L) * (long)param2 >> -805192864);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var3_int = -(int)(4294967296L % (long)param2) + param1;
                L1: while (true) {
                  var4 = param0.c((byte) -46);
                  if (var3_int > var4) {
                    stackOut_12_0 = dh.a(var4, true, param2);
                    stackIn_13_0 = stackOut_12_0;
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
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("u.G(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_13_0;
    }

    final static void a(byte param0) {
        ab var1 = null;
        int var2 = 0;
        cg var3 = null;
        int var3_int = 0;
        long var3_long = 0L;
        na var3_ref = null;
        na var4 = null;
        int var4_int = 0;
        String var5 = null;
        int var5_int = 0;
        na var5_ref = null;
        cg var5_ref2 = null;
        String var6 = null;
        cg var6_ref = null;
        na var6_ref2 = null;
        String var7 = null;
        cg var7_ref = null;
        cg var8_ref_cg = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        boolean stackIn_19_0 = false;
        boolean stackIn_20_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_67_0 = 0;
        cg stackIn_73_0 = null;
        cg stackIn_74_0 = null;
        cg stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        cg stackIn_134_0 = null;
        cg stackIn_135_0 = null;
        cg stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        boolean stackOut_18_0 = false;
        boolean stackOut_19_0 = false;
        int stackOut_29_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        cg stackOut_72_0 = null;
        cg stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        cg stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        cg stackOut_133_0 = null;
        cg stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        cg stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= -45) {
          L0: {
            L1: {
              L2: {
                var1 = df.field_z;
                var2 = ((wk) (Object) var1).e((byte) -110);
                if (var2 == 0) {
                  break L2;
                } else {
                  if (var2 == 1) {
                    break L2;
                  } else {
                    if (var2 == 2) {
                      break L2;
                    } else {
                      if (var2 == 3) {
                        break L2;
                      } else {
                        if (var2 != 4) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              var3 = (cg) (Object) ph.field_a.b(12623);
              L3: while (true) {
                L4: {
                  L5: {
                    if (var3 == null) {
                      break L5;
                    } else {
                      var3.a(true);
                      var3.a((byte) 88);
                      var3 = (cg) (Object) ph.field_a.a(0);
                      if (var11 != 0) {
                        break L4;
                      } else {
                        if (var11 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var3 = (cg) (Object) bc.field_c.f(-79);
                  break L4;
                }
                L6: while (true) {
                  L7: {
                    L8: {
                      if (var3 == null) {
                        break L8;
                      } else {
                        stackOut_18_0 = var3.field_Db;
                        stackIn_30_0 = stackOut_18_0 ? 1 : 0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var11 != 0) {
                          break L7;
                        } else {
                          stackOut_19_0 = stackIn_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          L9: {
                            L10: {
                              if (stackIn_20_0) {
                                break L10;
                              } else {
                                if (var3.field_Kb) {
                                  break L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L11: {
                              if (!var3.field_Kb) {
                                break L11;
                              } else {
                                oe.field_b = oe.field_b - 1;
                                var3.field_Kb = false;
                                break L11;
                              }
                            }
                            var3.field_Db = false;
                            jf.a(var3, (byte) -109);
                            break L9;
                          }
                          var3 = (cg) (Object) bc.field_c.a(-1);
                          if (var11 == 0) {
                            continue L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    stackOut_29_0 = var2;
                    stackIn_30_0 = stackOut_29_0;
                    break L7;
                  }
                  L12: {
                    if (stackIn_30_0 != 1) {
                      break L12;
                    } else {
                      if (wi.field_f != null) {
                        va.field_e = wi.field_f.field_ic;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if (var2 == 4) {
                        break L14;
                      } else {
                        wi.field_f = null;
                        if (var11 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var3_int = ((wk) (Object) var1).n(-98);
                    wi.field_f = new na(vf.field_l);
                    wi.field_f.a(46, (long)var3_int);
                    dn.a((wk) (Object) var1, wi.field_f, false, 2);
                    ba.field_a = 0L;
                    break L13;
                  }
                  L15: {
                    L16: {
                      if (var2 == 2) {
                        break L16;
                      } else {
                        if (var2 == 3) {
                          break L16;
                        } else {
                          om.field_x = null;
                          if (var11 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    if (null != om.field_x) {
                      break L15;
                    } else {
                      om.field_x = new na(vf.field_l);
                      break L15;
                    }
                  }
                  L17: {
                    if (var2 == 3) {
                      break L17;
                    } else {
                      dn.field_Db = false;
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L17;
                      }
                    }
                  }
                  dn.field_Db = true;
                  var3_int = 0;
                  L18: while (true) {
                    L19: {
                      L20: {
                        if (gh.field_E.length <= var3_int) {
                          break L20;
                        } else {
                          gh.field_E[var3_int] = ((wk) (Object) var1).o(6);
                          var3_int++;
                          if (var11 != 0) {
                            break L19;
                          } else {
                            if (var11 == 0) {
                              continue L18;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      q.field_L = ((wk) (Object) var1).e((byte) 32);
                      q.field_N = ((wk) (Object) var1).e((byte) 72);
                      break L19;
                    }
                    var3_int = 0;
                    L21: while (true) {
                      L22: {
                        if (var3_int >= ng.field_D.length) {
                          break L22;
                        } else {
                          ng.field_D[var3_int] = ((wk) (Object) var1).o(6);
                          var3_int++;
                          if (var11 != 0) {
                            break L0;
                          } else {
                            if (var11 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L23: {
              if (var2 != 5) {
                break L23;
              } else {
                L24: {
                  var3_long = ((wk) (Object) var1).c(-943038560);
                  var5 = ((wk) (Object) var1).l(-1);
                  var6 = ((wk) (Object) var1).l(-1);
                  var7 = ((wk) (Object) var1).l(-1);
                  var8_ref_cg = fn.a(var3_long, 119);
                  if (var6.equals((Object) (Object) "")) {
                    stackOut_66_0 = 0;
                    stackIn_67_0 = stackOut_66_0;
                    break L24;
                  } else {
                    stackOut_65_0 = 1;
                    stackIn_67_0 = stackOut_65_0;
                    break L24;
                  }
                }
                L25: {
                  L26: {
                    var9 = stackIn_67_0;
                    if (null != var8_ref_cg) {
                      break L26;
                    } else {
                      var8_ref_cg = new cg(var5, var7, var3_long);
                      bc.field_c.a((tf) (Object) var8_ref_cg, var3_long, (byte) 126);
                      if (var11 == 0) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  if (var9 == 0) {
                    break L25;
                  } else {
                    var8_ref_cg.a(var5, var7, 93);
                    break L25;
                  }
                }
                L27: {
                  var8_ref_cg.field_Ob = qj.b(-26572) + -(long)((wk) (Object) var1).d(-10674);
                  var8_ref_cg.field_Pb = ((wk) (Object) var1).n(-98);
                  var10 = ((wk) (Object) var1).a(31);
                  stackOut_72_0 = (cg) var8_ref_cg;
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_73_0 = stackOut_72_0;
                  if (0 == (1 & var10)) {
                    stackOut_74_0 = (cg) (Object) stackIn_74_0;
                    stackOut_74_1 = 0;
                    stackIn_75_0 = stackOut_74_0;
                    stackIn_75_1 = stackOut_74_1;
                    break L27;
                  } else {
                    stackOut_73_0 = (cg) (Object) stackIn_73_0;
                    stackOut_73_1 = 1;
                    stackIn_75_0 = stackOut_73_0;
                    stackIn_75_1 = stackOut_73_1;
                    break L27;
                  }
                }
                stackIn_75_0.field_Jb = stackIn_75_1 != 0;
                var8_ref_cg.field_Vb = var10 >> 902129281;
                var8_ref_cg.field_Mb = ((wk) (Object) var1).e((byte) -123);
                var8_ref_cg.field_Bb = ((wk) (Object) var1).e((byte) 100);
                jf.a(var8_ref_cg, (byte) 1);
                if (var11 == 0) {
                  break L0;
                } else {
                  break L23;
                }
              }
            }
            L28: {
              if (6 != var2) {
                break L28;
              } else {
                L29: {
                  var3_long = ((wk) (Object) var1).c(-943038560);
                  var5_int = ((wk) (Object) var1).e((byte) -96);
                  var6_ref = fn.a(var3_long, 111);
                  if (var6_ref == null) {
                    break L29;
                  } else {
                    L30: {
                      if (!var6_ref.field_Kb) {
                        break L30;
                      } else {
                        oe.field_b = oe.field_b - 1;
                        var6_ref.field_Kb = false;
                        break L30;
                      }
                    }
                    L31: {
                      L32: {
                        if (var5_int != 0) {
                          break L32;
                        } else {
                          var6_ref.a(true);
                          if (var11 == 0) {
                            break L31;
                          } else {
                            break L32;
                          }
                        }
                      }
                      var6_ref.field_Eb = vd.field_i;
                      var6_ref.field_Sb = var5_int;
                      break L31;
                    }
                    var6_ref.a((byte) 88);
                    break L29;
                  }
                }
                if (var11 == 0) {
                  break L0;
                } else {
                  break L28;
                }
              }
            }
            L33: {
              if (var2 == 7) {
                break L33;
              } else {
                L34: {
                  if (var2 == 8) {
                    break L34;
                  } else {
                    L35: {
                      if (var2 == 9) {
                        break L35;
                      } else {
                        L36: {
                          if (var2 != 10) {
                            break L36;
                          } else {
                            var3_ref = (na) (Object) vh.field_a.b(12623);
                            L37: while (true) {
                              L38: {
                                if (null == var3_ref) {
                                  break L38;
                                } else {
                                  var3_ref.a(true);
                                  var3_ref.a((byte) 88);
                                  var3_ref = (na) (Object) vh.field_a.a(0);
                                  if (var11 != 0) {
                                    break L0;
                                  } else {
                                    if (var11 == 0) {
                                      continue L37;
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                              }
                              if (var11 == 0) {
                                break L0;
                              } else {
                                break L36;
                              }
                            }
                          }
                        }
                        L39: {
                          L40: {
                            if (var2 == 11) {
                              break L40;
                            } else {
                              if (12 != var2) {
                                break L39;
                              } else {
                                break L40;
                              }
                            }
                          }
                          L41: {
                            var3_int = ((wk) (Object) var1).n(-98);
                            var4 = (na) (Object) nk.field_q.a((long)var3_int, (byte) -98);
                            if (null == var4) {
                              break L41;
                            } else {
                              L42: {
                                L43: {
                                  if (var2 != 11) {
                                    break L43;
                                  } else {
                                    var4.field_Hb = true;
                                    if (var11 == 0) {
                                      break L42;
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                                var4.field_Nb = true;
                                break L42;
                              }
                              cb.a(var4, -26);
                              break L41;
                            }
                          }
                          if (var11 == 0) {
                            break L0;
                          } else {
                            break L39;
                          }
                        }
                        L44: {
                          if (var2 != 13) {
                            break L44;
                          } else {
                            L45: {
                              var3_int = ((wk) (Object) var1).n(-98);
                              var4_int = ((wk) (Object) var1).e((byte) -107);
                              var5_ref = (na) (Object) nk.field_q.a((long)var3_int, (byte) -105);
                              if (null == var5_ref) {
                                break L45;
                              } else {
                                L46: {
                                  var5_ref.field_Nb = false;
                                  var6_ref2 = var5_ref;
                                  if (0 == var4_int) {
                                    break L46;
                                  } else {
                                    var5_ref.field_ac = var4_int;
                                    var5_ref.field_bc = vd.field_i;
                                    break L46;
                                  }
                                }
                                var6_ref2.field_Hb = false;
                                cb.a(var5_ref, 25);
                                break L45;
                              }
                            }
                            if (var11 == 0) {
                              break L0;
                            } else {
                              break L44;
                            }
                          }
                        }
                        L47: {
                          if (var2 == 14) {
                            break L47;
                          } else {
                            if (var2 == 16) {
                              break L47;
                            } else {
                              L48: {
                                if (var2 == 15) {
                                  break L48;
                                } else {
                                  if (var2 == 17) {
                                    break L48;
                                  } else {
                                    L49: {
                                      if (var2 != 18) {
                                        break L49;
                                      } else {
                                        L50: {
                                          var3_long = ((wk) (Object) var1).c(-943038560);
                                          var5 = ((wk) (Object) var1).l(-1);
                                          var6 = ((wk) (Object) var1).l(-1);
                                          var7_ref = vf.a(var3_long, 8192);
                                          if (var7_ref != null) {
                                            break L50;
                                          } else {
                                            var7_ref = new cg(var5, var6, var3_long);
                                            kn.field_qb.a((tf) (Object) var7_ref, var3_long, (byte) 121);
                                            wi.field_f.field_Rb = wi.field_f.field_Rb + 1;
                                            break L50;
                                          }
                                        }
                                        L51: {
                                          var7_ref.field_Pb = ((wk) (Object) var1).n(-98);
                                          var8 = ((wk) (Object) var1).a(16);
                                          var7_ref.field_Vb = var8 >> 1682702497;
                                          stackOut_133_0 = (cg) var7_ref;
                                          stackIn_135_0 = stackOut_133_0;
                                          stackIn_134_0 = stackOut_133_0;
                                          if ((var8 & 1) == 0) {
                                            stackOut_135_0 = (cg) (Object) stackIn_135_0;
                                            stackOut_135_1 = 0;
                                            stackIn_136_0 = stackOut_135_0;
                                            stackIn_136_1 = stackOut_135_1;
                                            break L51;
                                          } else {
                                            stackOut_134_0 = (cg) (Object) stackIn_134_0;
                                            stackOut_134_1 = 1;
                                            stackIn_136_0 = stackOut_134_0;
                                            stackIn_136_1 = stackOut_134_1;
                                            break L51;
                                          }
                                        }
                                        stackIn_136_0.field_Jb = stackIn_136_1 != 0;
                                        var7_ref.field_Mb = ((wk) (Object) var1).e((byte) -109);
                                        var7_ref.field_Bb = ((wk) (Object) var1).e((byte) -120);
                                        ph.field_a.b((pg) (Object) var7_ref, -1);
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L49;
                                        }
                                      }
                                    }
                                    L52: {
                                      if (19 != var2) {
                                        break L52;
                                      } else {
                                        L53: {
                                          var3_long = ((wk) (Object) var1).c(-943038560);
                                          var5_int = ((wk) (Object) var1).e((byte) -111);
                                          var6_ref = vf.a(var3_long, 8192);
                                          if (null != var6_ref) {
                                            L54: {
                                              L55: {
                                                if (var5_int == 0) {
                                                  break L55;
                                                } else {
                                                  var6_ref.field_Sb = var5_int;
                                                  var6_ref.field_Eb = vd.field_i;
                                                  if (var11 == 0) {
                                                    break L54;
                                                  } else {
                                                    break L55;
                                                  }
                                                }
                                              }
                                              var6_ref.a(true);
                                              break L54;
                                            }
                                            var6_ref.a((byte) 88);
                                            wi.field_f.field_Rb = wi.field_f.field_Rb - 1;
                                            break L53;
                                          } else {
                                            break L53;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L52;
                                        }
                                      }
                                    }
                                    L56: {
                                      if (var2 == 20) {
                                        break L56;
                                      } else {
                                        L57: {
                                          if (var2 == 21) {
                                            break L57;
                                          } else {
                                            L58: {
                                              if (var2 != 22) {
                                                break L58;
                                              } else {
                                                sk.field_e = ((wk) (Object) var1).n(-98);
                                                jh.field_e = ((wk) (Object) var1).a(121);
                                                if (var11 == 0) {
                                                  break L0;
                                                } else {
                                                  break L58;
                                                }
                                              }
                                            }
                                            L59: {
                                              if (var2 == 23) {
                                                break L59;
                                              } else {
                                                jh.a((Throwable) null, "L1: " + nn.g((byte) -25), (byte) 20);
                                                ka.b(false);
                                                if (var11 == 0) {
                                                  break L0;
                                                } else {
                                                  break L59;
                                                }
                                              }
                                            }
                                            qf.field_a = ((wk) (Object) var1).c(-943038560);
                                            if (var11 == 0) {
                                              break L0;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                        L60: {
                                          L61: {
                                            var3_int = ((wk) (Object) var1).n(-98);
                                            if (var3_int == 0) {
                                              break L61;
                                            } else {
                                              ba.field_a = qj.b(-26572) + (long)var3_int;
                                              if (var11 == 0) {
                                                break L60;
                                              } else {
                                                break L61;
                                              }
                                            }
                                          }
                                          ba.field_a = 0L;
                                          break L60;
                                        }
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L56;
                                        }
                                      }
                                    }
                                    dn.a((wk) (Object) var1, wi.field_f, false, 2);
                                    if (var11 == 0) {
                                      break L0;
                                    } else {
                                      break L48;
                                    }
                                  }
                                }
                              }
                              L62: {
                                var3_long = ((wk) (Object) var1).c(-943038560);
                                var5_int = ((wk) (Object) var1).e((byte) 107);
                                var6_ref = fn.a(var3_long, 123);
                                if (null == var6_ref) {
                                  break L62;
                                } else {
                                  L63: {
                                    if (var5_int != 0) {
                                      var6_ref.field_Eb = vd.field_i;
                                      var6_ref.field_Sb = var5_int;
                                      break L63;
                                    } else {
                                      break L63;
                                    }
                                  }
                                  L64: {
                                    L65: {
                                      if (var2 == 15) {
                                        break L65;
                                      } else {
                                        if (!var6_ref.field_Kb) {
                                          break L64;
                                        } else {
                                          var6_ref.field_Kb = false;
                                          oe.field_b = oe.field_b - 1;
                                          if (var11 == 0) {
                                            break L64;
                                          } else {
                                            break L65;
                                          }
                                        }
                                      }
                                    }
                                    var6_ref.field_Db = false;
                                    break L64;
                                  }
                                  jf.a(var6_ref, (byte) 15);
                                  break L62;
                                }
                              }
                              if (var11 == 0) {
                                break L0;
                              } else {
                                break L47;
                              }
                            }
                          }
                        }
                        L66: {
                          var3_long = ((wk) (Object) var1).c(-943038560);
                          var5_ref2 = fn.a(var3_long, 121);
                          if (null == var5_ref2) {
                            break L66;
                          } else {
                            L67: {
                              L68: {
                                if (var2 != 14) {
                                  break L68;
                                } else {
                                  var5_ref2.field_Db = true;
                                  if (var11 == 0) {
                                    break L67;
                                  } else {
                                    break L68;
                                  }
                                }
                              }
                              if (!var5_ref2.field_Kb) {
                                oe.field_b = oe.field_b + 1;
                                var5_ref2.field_Kb = true;
                                break L67;
                              } else {
                                break L67;
                              }
                            }
                            jf.a(var5_ref2, (byte) 127);
                            break L66;
                          }
                        }
                        if (var11 == 0) {
                          break L0;
                        } else {
                          break L35;
                        }
                      }
                    }
                    L69: {
                      var3_int = ((wk) (Object) var1).n(-98);
                      var4_int = ((wk) (Object) var1).e((byte) 105);
                      var5_ref = (na) (Object) nk.field_q.a((long)var3_int, (byte) -70);
                      if (null != var5_ref) {
                        L70: {
                          L71: {
                            if (var4_int == 0) {
                              break L71;
                            } else {
                              var5_ref.field_bc = vd.field_i;
                              var5_ref.field_ac = var4_int;
                              if (var11 == 0) {
                                break L70;
                              } else {
                                break L71;
                              }
                            }
                          }
                          var5_ref.a(true);
                          break L70;
                        }
                        var5_ref.a((byte) 88);
                        break L69;
                      } else {
                        break L69;
                      }
                    }
                    if (var11 == 0) {
                      break L0;
                    } else {
                      break L34;
                    }
                  }
                }
                L72: {
                  var3_int = ((wk) (Object) var1).n(-98);
                  var4 = (na) (Object) nk.field_q.a((long)var3_int, (byte) -93);
                  if (null != var4) {
                    break L72;
                  } else {
                    var4 = new na(vf.field_l);
                    nk.field_q.a((tf) (Object) var4, (long)var3_int, (byte) 116);
                    break L72;
                  }
                }
                dn.a((wk) (Object) var1, var4, true, 2);
                cb.a(var4, 67);
                if (var11 == 0) {
                  break L0;
                } else {
                  break L33;
                }
              }
            }
            var3 = (cg) (Object) gm.field_j.b(12623);
            L73: while (true) {
              L74: {
                if (null == var3) {
                  break L74;
                } else {
                  var3.a(true);
                  var3.a((byte) 88);
                  var3 = (cg) (Object) gm.field_j.a(0);
                  if (var11 != 0) {
                    break L0;
                  } else {
                    if (var11 == 0) {
                      continue L73;
                    } else {
                      break L74;
                    }
                  }
                }
              }
              oe.field_b = 0;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 6) {
              if (ka.field_m != null) {
                L1: {
                  qm.a((java.awt.Canvas) (Object) ka.field_m, (byte) 122);
                  ka.field_m.a(fi.field_d, (byte) 67);
                  ka.field_m = null;
                  if (ob.field_Y == null) {
                    break L1;
                  } else {
                    ob.field_Y.a(true);
                    break L1;
                  }
                }
                on.field_c.requestFocus();
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "u.F(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                field_k = true;
                break L1;
              }
            }
            field_f = null;
            field_m = null;
            field_h = null;
            field_d = null;
            field_j = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "u.C(" + param0 + ')');
        }
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
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length;
            ((u) this).field_a = param0;
            ((u) this).field_e = new int[var2_int];
            var3 = new int[33];
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
                  L4: {
                    if (stackIn_3_0 >= stackIn_3_1) {
                      break L4;
                    } else {
                      var6 = param0[var5];
                      if (var15 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (var6 == 0) {
                            break L5;
                          } else {
                            L6: {
                              L7: {
                                var7 = 1 << -var6 + 32;
                                var8 = var3[var6];
                                ((u) this).field_e[var5] = var8;
                                if ((var8 & var7) != 0) {
                                  break L7;
                                } else {
                                  var10 = var6 - 1;
                                  L8: while (true) {
                                    L9: {
                                      L10: {
                                        if (var10 < 1) {
                                          break L10;
                                        } else {
                                          var11 = var3[var10];
                                          stackOut_11_0 = var11;
                                          stackOut_11_1 = var8;
                                          stackIn_26_0 = stackOut_11_0;
                                          stackIn_26_1 = stackOut_11_1;
                                          stackIn_12_0 = stackOut_11_0;
                                          stackIn_12_1 = stackOut_11_1;
                                          if (var15 != 0) {
                                            break L9;
                                          } else {
                                            if (stackIn_12_0 != stackIn_12_1) {
                                              break L10;
                                            } else {
                                              L11: {
                                                L12: {
                                                  var12 = 1 << -var10 + 32;
                                                  if ((var12 & var11) != 0) {
                                                    break L12;
                                                  } else {
                                                    var3[var10] = fj.b(var12, var11);
                                                    if (var15 == 0) {
                                                      break L11;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                                var3[var10] = var3[-1 + var10];
                                                if (var15 == 0) {
                                                  break L10;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                              var10--;
                                              if (var15 == 0) {
                                                continue L8;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_25_0 = var7;
                                      stackOut_25_1 = var8;
                                      stackIn_26_0 = stackOut_25_0;
                                      stackIn_26_1 = stackOut_25_1;
                                      break L9;
                                    }
                                    var9 = stackIn_26_0 | stackIn_26_1;
                                    if (var15 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var9 = var3[-1 + var6];
                              break L6;
                            }
                            var3[var6] = var9;
                            var10 = 1 + var6;
                            L13: while (true) {
                              L14: {
                                if (var10 > 32) {
                                  break L14;
                                } else {
                                  stackOut_30_0 = ~var3[var10];
                                  stackOut_30_1 = ~var8;
                                  stackIn_3_0 = stackOut_30_0;
                                  stackIn_3_1 = stackOut_30_1;
                                  stackIn_31_0 = stackOut_30_0;
                                  stackIn_31_1 = stackOut_30_1;
                                  if (var15 != 0) {
                                    continue L2;
                                  } else {
                                    L15: {
                                      if (stackIn_31_0 == stackIn_31_1) {
                                        var3[var10] = var9;
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    var10++;
                                    if (var15 == 0) {
                                      continue L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              var10 = 0;
                              var11 = 0;
                              L16: while (true) {
                                L17: {
                                  L18: {
                                    if (~var11 <= ~var6) {
                                      break L18;
                                    } else {
                                      var12 = -2147483648 >>> var11;
                                      stackOut_37_0 = 0;
                                      stackOut_37_1 = var12 & var8;
                                      stackIn_61_0 = stackOut_37_0;
                                      stackIn_61_1 = stackOut_37_1;
                                      stackIn_38_0 = stackOut_37_0;
                                      stackIn_38_1 = stackOut_37_1;
                                      if (var15 != 0) {
                                        break L17;
                                      } else {
                                        L19: {
                                          L20: {
                                            if (stackIn_38_0 == stackIn_38_1) {
                                              break L20;
                                            } else {
                                              L21: {
                                                if (((u) this).field_c[var10] == 0) {
                                                  ((u) this).field_c[var10] = var4;
                                                  break L21;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                              var10 = ((u) this).field_c[var10];
                                              if (var15 == 0) {
                                                break L19;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                          var10++;
                                          break L19;
                                        }
                                        L22: {
                                          L23: {
                                            var12 = var12 >>> 1;
                                            if (~((u) this).field_c.length < ~var10) {
                                              break L23;
                                            } else {
                                              var13 = new int[2 * ((u) this).field_c.length];
                                              var14 = 0;
                                              L24: while (true) {
                                                L25: {
                                                  if (~((u) this).field_c.length >= ~var14) {
                                                    break L25;
                                                  } else {
                                                    var13[var14] = ((u) this).field_c[var14];
                                                    var14++;
                                                    if (var15 != 0) {
                                                      break L22;
                                                    } else {
                                                      if (var15 == 0) {
                                                        continue L24;
                                                      } else {
                                                        break L25;
                                                      }
                                                    }
                                                  }
                                                }
                                                ((u) this).field_c = var13;
                                                break L23;
                                              }
                                            }
                                          }
                                          var11++;
                                          break L22;
                                        }
                                        if (var15 == 0) {
                                          continue L16;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                  }
                                  ((u) this).field_c[var10] = ~var5;
                                  stackOut_60_0 = ~var10;
                                  stackOut_60_1 = ~var4;
                                  stackIn_61_0 = stackOut_60_0;
                                  stackIn_61_1 = stackOut_60_1;
                                  break L17;
                                }
                                if (stackIn_61_0 <= stackIn_61_1) {
                                  var4 = 1 + var10;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var5++;
                        if (var15 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var2 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var2;
            stackOut_66_1 = new StringBuilder().append("u.<init>(");
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L26;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L26;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ')');
        }
    }

    final static String a(byte param0, int param1, String param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        String stackIn_39_0 = null;
        String stackIn_47_0 = null;
        Object stackIn_49_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_14_0 = null;
        String stackOut_22_0 = null;
        String stackOut_33_0 = null;
        String stackOut_38_0 = null;
        String stackOut_46_0 = null;
        Object stackOut_48_0 = null;
        String stackOut_28_0 = null;
        String stackOut_25_0 = null;
        String stackOut_17_0 = null;
        String stackOut_9_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        try {
          L0: {
            if (1 != param1) {
              if (param1 == 2) {
                stackOut_6_0 = tj.a(-73, new String[1], rj.field_h);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param1 != 3) {
                  if (param1 == 4) {
                    stackOut_14_0 = tj.a(125, new String[1], q.field_M);
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    if (5 != param1) {
                      if (param1 == 6) {
                        stackOut_22_0 = tj.a(120, new String[1], b.field_b);
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0;
                      } else {
                        if (param1 != 7) {
                          if (param1 != 8) {
                            if (param1 == 11) {
                              stackOut_33_0 = tj.a(-92, new String[1], ui.field_w);
                              stackIn_34_0 = stackOut_33_0;
                              return stackIn_34_0;
                            } else {
                              if (param1 == 12) {
                                stackOut_38_0 = tj.a(-85, new String[1], so.field_n);
                                stackIn_39_0 = stackOut_38_0;
                                return stackIn_39_0;
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
                                  stackOut_46_0 = tj.a(-123, new String[1], qo.field_d);
                                  stackIn_47_0 = stackOut_46_0;
                                  return stackIn_47_0;
                                } else {
                                  stackOut_48_0 = null;
                                  stackIn_49_0 = stackOut_48_0;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            stackOut_28_0 = tj.a(122, new String[1], c.field_c);
                            stackIn_29_0 = stackOut_28_0;
                            return stackIn_29_0;
                          }
                        } else {
                          stackOut_25_0 = tj.a(122, new String[1], ho.field_d);
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        }
                      }
                    } else {
                      stackOut_17_0 = tj.a(-95, new String[1], gm.field_n);
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    }
                  }
                } else {
                  stackOut_9_0 = tj.a(-54, new String[1], ij.field_Gb);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
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
            stackOut_50_0 = (RuntimeException) var3;
            stackOut_50_1 = new StringBuilder().append("u.B(").append(param0).append(',').append(param1).append(',');
            stackIn_53_0 = stackOut_50_0;
            stackIn_53_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param2 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L2;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_54_0 = stackOut_51_0;
              stackIn_54_1 = stackOut_51_1;
              stackIn_54_2 = stackOut_51_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ')');
        }
        return (String) (Object) stackIn_49_0;
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
