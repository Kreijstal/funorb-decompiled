/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static String field_a;
    static int field_e;
    private int[] field_d;
    static String field_g;
    static int field_c;
    private int[] field_f;
    private byte[] field_b;

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = client.field_A ? 1 : 0;
            if (eh.field_a > 0) {
              break L1;
            } else {
              L2: {
                if (ph.n(-30146)) {
                  break L2;
                } else {
                  var2 = 1;
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = 0;
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L3: {
            L4: {
              if (li.field_b == null) {
                break L4;
              } else {
                cl.field_v = li.field_b.c(27134);
                p.a(2, (byte) -30);
                if (var3 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            cl.field_v = sg.a(640, lf.field_e, 0, 0, 82, 480);
            break L3;
          }
          L5: {
            if (null == cl.field_v) {
              break L5;
            } else {
              hl.a(cl.field_v, (byte) -42);
              var2 = 2;
              if (var3 == 0) {
                break L0;
              } else {
                break L5;
              }
            }
          }
          var2 = 3;
          break L0;
        }
        L6: {
          if (param0 == 2) {
            break L6;
          } else {
            field_e = -30;
            break L6;
          }
        }
        L7: {
          if (li.field_b != null) {
            break L7;
          } else {
            if (!ij.field_e) {
              break L7;
            } else {
              bl.a(param0 + -73, var2, param1);
              break L7;
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = -5 % ((-29 - param0) / 55);
        field_g = null;
        field_a = null;
    }

    final int a(int param0, byte param1, int param2, byte[] param3, byte[] param4, int param5) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_75_0 = 0;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            if ((param5 ^ -1) == -1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 > 86) {
                  break L1;
                } else {
                  jk.a(-83, true);
                  break L1;
                }
              }
              param5 = param5 + param2;
              var7_int = 0;
              var8 = param0;
              L2: while (true) {
                L3: {
                  L4: {
                    var9 = param4[var8];
                    if (0 <= var9) {
                      break L4;
                    } else {
                      var7_int = this.field_f[var7_int];
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
                  var7_int++;
                  break L3;
                }
                L5: {
                  L6: {
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] >= 0) {
                      break L6;
                    } else {
                      L7: {
                        incrementValue$8 = param2;
                        param2++;
                        param3[incrementValue$8] = (byte)(var10 ^ -1);
                        if (param5 > param2) {
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
                    }
                  }
                  L8: {
                    L9: {
                      if ((var9 & 64) != 0) {
                        break L9;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var7_int = this.field_f[var7_int];
                    break L8;
                  }
                  L10: {
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] < 0) {
                      L11: {
                        incrementValue$9 = param2;
                        param2++;
                        param3[incrementValue$9] = (byte)(var10 ^ -1);
                        if (param2 < param5) {
                          break L11;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var7_int = 0;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L12: {
                    L13: {
                      if (-1 != (32 & var9 ^ -1)) {
                        break L13;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    var7_int = this.field_f[var7_int];
                    break L12;
                  }
                  L14: {
                    var10 = this.field_f[var7_int];
                    if (-1 >= (this.field_f[var7_int] ^ -1)) {
                      break L14;
                    } else {
                      incrementValue$10 = param2;
                      param2++;
                      param3[incrementValue$10] = (byte)(var10 ^ -1);
                      if (param5 <= param2) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L14;
                      }
                    }
                  }
                  L15: {
                    L16: {
                      if ((16 & var9 ^ -1) == -1) {
                        break L16;
                      } else {
                        var7_int = this.field_f[var7_int];
                        if (var11 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    var7_int++;
                    break L15;
                  }
                  L17: {
                    var10 = this.field_f[var7_int];
                    if (-1 < (this.field_f[var7_int] ^ -1)) {
                      L18: {
                        incrementValue$11 = param2;
                        param2++;
                        param3[incrementValue$11] = (byte)(var10 ^ -1);
                        if (param5 > param2) {
                          break L18;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L18;
                          }
                        }
                      }
                      var7_int = 0;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L19: {
                    L20: {
                      if (0 != (8 & var9)) {
                        break L20;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    var7_int = this.field_f[var7_int];
                    break L19;
                  }
                  L21: {
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] < 0) {
                      L22: {
                        incrementValue$12 = param2;
                        param2++;
                        param3[incrementValue$12] = (byte)(var10 ^ -1);
                        if ((param5 ^ -1) < (param2 ^ -1)) {
                          break L22;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var7_int = 0;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L23: {
                    L24: {
                      if ((4 & var9 ^ -1) == -1) {
                        break L24;
                      } else {
                        var7_int = this.field_f[var7_int];
                        if (var11 == 0) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    var7_int++;
                    break L23;
                  }
                  L25: {
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] < 0) {
                      incrementValue$13 = param2;
                      param2++;
                      param3[incrementValue$13] = (byte)(var10 ^ -1);
                      if ((param5 ^ -1) >= (param2 ^ -1)) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    L27: {
                      if (-1 == (2 & var9 ^ -1)) {
                        break L27;
                      } else {
                        var7_int = this.field_f[var7_int];
                        if (var11 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    var7_int++;
                    break L26;
                  }
                  L28: {
                    var10 = this.field_f[var7_int];
                    if (0 <= this.field_f[var7_int]) {
                      break L28;
                    } else {
                      incrementValue$14 = param2;
                      param2++;
                      param3[incrementValue$14] = (byte)(var10 ^ -1);
                      if ((param2 ^ -1) <= (param5 ^ -1)) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L28;
                      }
                    }
                  }
                  L29: {
                    L30: {
                      if (-1 != (1 & var9 ^ -1)) {
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
                    var7_int = this.field_f[var7_int];
                    break L29;
                  }
                  L31: {
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] >= 0) {
                      break L31;
                    } else {
                      incrementValue$15 = param2;
                      param2++;
                      param3[incrementValue$15] = (byte)(var10 ^ -1);
                      if ((param5 ^ -1) >= (param2 ^ -1)) {
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
                stackOut_75_0 = var8 - (-1 - -param0);
                stackIn_76_0 = stackOut_75_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L32: {
            var7 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) (var7);
            stackOut_77_1 = new StringBuilder().append("jk.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param3 == null) {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L32;
            } else {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L32;
            }
          }
          L33: {
            stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
            stackOut_80_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',');
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param4 == null) {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L33;
            } else {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L33;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_76_0;
        }
    }

    final int a(byte[] param0, byte[] param1, int param2, int param3, int param4, int param5) {
        int dupTemp$1 = 0;
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
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
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
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
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
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == 8) {
                break L1;
              } else {
                field_c = -58;
                break L1;
              }
            }
            var7_int = 0;
            var8 = param3 << -1718073853;
            param2 = param2 + param4;
            L2: while (true) {
              L3: {
                L4: {
                  if ((param2 ^ -1) >= (param4 ^ -1)) {
                    break L4;
                  } else {
                    var9 = 255 & param1[param4];
                    var10 = this.field_d[var9];
                    var11 = this.field_b[var9];
                    stackOut_5_0 = var11 ^ -1;
                    stackOut_5_1 = -1;
                    stackIn_20_0 = stackOut_5_0;
                    stackIn_20_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (var15 != 0) {
                      break L3;
                    } else {
                      if (stackIn_6_0 == stackIn_6_1) {
                        throw new RuntimeException("" + var9);
                      } else {
                        L5: {
                          L6: {
                            var12 = var8 >> 1407045219;
                            var13 = var8 & 7;
                            var7_int = var7_int & -var13 >> -1061197921;
                            var14 = var12 - -(var13 + (var11 + -1) >> 425602563);
                            var13 += 24;
                            dupTemp$1 = de.b(var7_int, var10 >>> var13);
                            var7_int = dupTemp$1;
                            param0[var12] = (byte)dupTemp$1;
                            if (var14 > var12) {
                              break L6;
                            } else {
                              if (var15 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var12++;
                          var13 -= 8;
                          var7_int = var10 >>> var13;
                          param0[var12] = (byte)(var10 >>> var13);
                          if ((var12 ^ -1) <= (var14 ^ -1)) {
                            break L5;
                          } else {
                            L7: {
                              var13 -= 8;
                              var12++;
                              var7_int = var10 >>> var13;
                              param0[var12] = (byte)(var10 >>> var13);
                              if ((var12 ^ -1) > (var14 ^ -1)) {
                                break L7;
                              } else {
                                if (var15 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var12++;
                            var13 -= 8;
                            var7_int = var10 >>> var13;
                            param0[var12] = (byte)(var10 >>> var13);
                            if (var14 <= var12) {
                              break L5;
                            } else {
                              var12++;
                              var13 -= 8;
                              var7_int = var10 << -var13;
                              param0[var12] = (byte)(var10 << -var13);
                              break L5;
                            }
                          }
                        }
                        var8 = var8 + var11;
                        param4++;
                        if (var15 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_19_0 = -param3;
                stackOut_19_1 = var8 + 7 >> -1057081885;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L3;
              }
              stackOut_20_0 = stackIn_20_0 + stackIn_20_1;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var7);
            stackOut_22_1 = new StringBuilder().append("jk.B(");
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
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
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
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_21_0;
    }

    jk(byte[] param0) {
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
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length;
            this.field_b = param0;
            this.field_d = new int[var2_int];
            this.field_f = new int[8];
            var17 = new int[33];
            var16 = var17;
            var3 = var16;
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              stackOut_2_0 = var5;
              stackOut_2_1 = var2_int;
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
                          L6: {
                            if (0 != var6) {
                              break L6;
                            } else {
                              if (var15 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            L8: {
                              L9: {
                                var7 = 1 << -var6 + 32;
                                var8 = var17[var6];
                                this.field_d[var5] = var8;
                                if ((var8 & var7) == 0) {
                                  break L9;
                                } else {
                                  var9 = var3[var6 - 1];
                                  if (var15 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var9 = var8 | var7;
                              var10 = -1 + var6;
                              L10: while (true) {
                                if ((var10 ^ -1) > -2) {
                                  break L8;
                                } else {
                                  var11 = var17[var10];
                                  stackOut_11_0 = var8 ^ -1;
                                  stackOut_11_1 = var11 ^ -1;
                                  stackIn_18_0 = stackOut_11_0;
                                  stackIn_18_1 = stackOut_11_1;
                                  stackIn_12_0 = stackOut_11_0;
                                  stackIn_12_1 = stackOut_11_1;
                                  if (var15 != 0) {
                                    break L7;
                                  } else {
                                    if (stackIn_12_0 != stackIn_12_1) {
                                      break L8;
                                    } else {
                                      L11: {
                                        L12: {
                                          var12 = 1 << 32 + -var10;
                                          if ((var12 & var11) != 0) {
                                            break L12;
                                          } else {
                                            var3[var10] = de.b(var11, var12);
                                            if (var15 == 0) {
                                              break L11;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        var3[var10] = var3[var10 - 1];
                                        if (var15 == 0) {
                                          break L8;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      var10--;
                                      if (var15 == 0) {
                                        continue L10;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var17[var6] = var9;
                            stackOut_17_0 = var6;
                            stackOut_17_1 = 1;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            break L7;
                          }
                          var10 = stackIn_18_0 + stackIn_18_1;
                          L13: while (true) {
                            L14: {
                              if ((var10 ^ -1) < -33) {
                                break L14;
                              } else {
                                stackOut_20_0 = var8;
                                stackOut_20_1 = var17[var10];
                                stackIn_3_0 = stackOut_20_0;
                                stackIn_3_1 = stackOut_20_1;
                                stackIn_21_0 = stackOut_20_0;
                                stackIn_21_1 = stackOut_20_1;
                                if (var15 != 0) {
                                  continue L2;
                                } else {
                                  L15: {
                                    if (stackIn_21_0 != stackIn_21_1) {
                                      break L15;
                                    } else {
                                      var17[var10] = var9;
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
                                  if ((var6 ^ -1) >= (var11 ^ -1)) {
                                    break L18;
                                  } else {
                                    var12 = -2147483648 >>> var11;
                                    stackOut_26_0 = -1;
                                    stackOut_26_1 = var12 & var8 ^ -1;
                                    stackIn_41_0 = stackOut_26_0;
                                    stackIn_41_1 = stackOut_26_1;
                                    stackIn_27_0 = stackOut_26_0;
                                    stackIn_27_1 = stackOut_26_1;
                                    if (var15 != 0) {
                                      break L17;
                                    } else {
                                      L19: {
                                        L20: {
                                          if (stackIn_27_0 == stackIn_27_1) {
                                            break L20;
                                          } else {
                                            L21: {
                                              if ((this.field_f[var10] ^ -1) != -1) {
                                                break L21;
                                              } else {
                                                this.field_f[var10] = var4;
                                                break L21;
                                              }
                                            }
                                            var10 = this.field_f[var10];
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
                                          if ((this.field_f.length ^ -1) < (var10 ^ -1)) {
                                            break L23;
                                          } else {
                                            var13 = new int[2 * this.field_f.length];
                                            var14 = 0;
                                            L24: while (true) {
                                              L25: {
                                                if ((var14 ^ -1) <= (this.field_f.length ^ -1)) {
                                                  break L25;
                                                } else {
                                                  var13[var14] = this.field_f[var14];
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
                                              this.field_f = var13;
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
                                stackOut_40_0 = var10 ^ -1;
                                stackOut_40_1 = var4 ^ -1;
                                stackIn_41_0 = stackOut_40_0;
                                stackIn_41_1 = stackOut_40_1;
                                break L17;
                              }
                              L26: {
                                if (stackIn_41_0 > stackIn_41_1) {
                                  break L26;
                                } else {
                                  var4 = 1 + var10;
                                  break L26;
                                }
                              }
                              this.field_f[var10] = var5 ^ -1;
                              break L5;
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
          L27: {
            var2 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) (var2);
            stackOut_46_1 = new StringBuilder().append("jk.<init>(");
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L27;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L27;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
        }
    }

    static {
        field_g = "Names can only contain letters, numbers, spaces and underscores";
    }
}
