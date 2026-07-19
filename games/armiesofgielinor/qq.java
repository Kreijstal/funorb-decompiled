/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq extends oj {
    int field_J;
    private boolean field_C;
    private int field_F;
    int field_I;
    static String field_D;
    static String field_z;
    static String field_y;
    static String field_A;
    static String field_H;
    int field_G;

    final static void e(byte param0) {
        if (param0 >= -73) {
            field_y = (String) null;
        }
        if (ib.field_j != -fw.field_C + 0) {
            if (250 - fw.field_C == ib.field_j) {
            }
        }
        ib.field_j = ib.field_j + 1;
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var6 = 0;
        int var8 = 0;
        jd var9 = null;
        jd var10 = null;
        jd var11 = null;
        jd var12 = null;
        jd var13 = null;
        jd var14 = null;
        jd var15 = null;
        jd var16 = null;
        int stackIn_113_0 = 0;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_112_0 = 0;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    var4_int = 0;
                    var6 = this.field_F;
                    if (2 != var6) {
                      break L4;
                    } else {
                      if (var8 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if ((var6 ^ -1) != -4) {
                      break L5;
                    } else {
                      if (var8 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if ((var6 ^ -1) != -2) {
                      break L6;
                    } else {
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    L8: {
                      L9: {
                        if (-5 != (var6 ^ -1)) {
                          break L9;
                        } else {
                          if (var8 == 0) {
                            L10: {
                              if (param2.field_xb.field_Eb[param2.field_xb.field_v * this.field_J + this.field_I].c(111)) {
                                break L10;
                              } else {
                                this.c((byte) -74);
                                if (var8 == 0) {
                                  break L1;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (this.a((byte) -39, param2, param0, true)) {
                                var4_int = 1;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            if (var8 == 0) {
                              break L1;
                            } else {
                              break L8;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (var6 == 0) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                    if (this.a((byte) -39, param2, param0, true)) {
                      var4_int = 1;
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L7;
                      }
                    } else {
                      break L1;
                    }
                  }
                  this.c((byte) -95);
                  break L1;
                }
                L12: {
                  if (this.field_I > 0) {
                    var9 = param2.field_xb.c(this.field_J, true, this.field_I - 1);
                    if (var9 == null) {
                      break L12;
                    } else {
                      if (param2.field_xb.c(var9.field_O, -16985, this.field_G)) {
                        this.field_s = this.field_s + 1;
                        if (this.a(this.field_J, 15, param2, param0, this.field_I + -1)) {
                          var4_int = 1;
                          break L12;
                        } else {
                          break L12;
                        }
                      } else {
                        break L12;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (param2.field_xb.field_v + -1 <= this.field_I) {
                    break L13;
                  } else {
                    var10 = param2.field_xb.c(this.field_J, true, this.field_I - -1);
                    if (var10 == null) {
                      break L13;
                    } else {
                      if (!param2.field_xb.c(var10.field_O, -16985, this.field_G)) {
                        break L13;
                      } else {
                        this.field_s = this.field_s + 1;
                        if (this.a(this.field_J, 15, param2, param0, this.field_I - -1)) {
                          var4_int = 1;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                }
                L14: {
                  if (this.field_J > 0) {
                    var11 = param2.field_xb.c(this.field_J + -1, true, this.field_I);
                    if (var11 == null) {
                      break L14;
                    } else {
                      if (param2.field_xb.c(var11.field_O, -16985, this.field_G)) {
                        this.field_s = this.field_s + 1;
                        if (!this.a(-1 + this.field_J, 15, param2, param0, this.field_I)) {
                          break L14;
                        } else {
                          var4_int = 1;
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (this.field_J >= param2.field_xb.field_db - 1) {
                    break L15;
                  } else {
                    var12 = param2.field_xb.c(1 + this.field_J, true, this.field_I);
                    if (var12 == null) {
                      break L15;
                    } else {
                      if (!param2.field_xb.c(var12.field_O, -16985, this.field_G)) {
                        break L15;
                      } else {
                        this.field_s = this.field_s + 1;
                        if (this.a(1 + this.field_J, 15, param2, param0, this.field_I)) {
                          var4_int = 1;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                }
                L16: {
                  if (1 < this.field_s) {
                    break L16;
                  } else {
                    this.c((byte) -114);
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L16;
                    }
                  }
                }
                L17: {
                  if (this.a((byte) -39, param2, param0, true)) {
                    var4_int = 1;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                if (var8 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              L18: {
                if (-1 > (this.field_I ^ -1)) {
                  L19: {
                    L20: {
                      var13 = param2.field_xb.c(this.field_J, true, this.field_I - 1);
                      if (!param2.field_xb.field_Eb[this.field_I - (1 - param2.field_xb.field_v * this.field_J)].c(-65)) {
                        break L20;
                      } else {
                        if (null == this.field_w) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    if (var13 == null) {
                      break L18;
                    } else {
                      if (!param2.field_xb.c(var13.field_O, -16985, this.field_G)) {
                        break L18;
                      } else {
                        if (!var13.a(23072)) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                  this.field_s = this.field_s + 1;
                  if (this.a(this.field_J, 15, param2, param0, this.field_I + -1)) {
                    var4_int = 1;
                    break L18;
                  } else {
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
              L21: {
                if (this.field_I < param2.field_xb.field_v + -1) {
                  L22: {
                    L23: {
                      var14 = param2.field_xb.c(this.field_J, true, this.field_I - -1);
                      if (!param2.field_xb.field_Eb[this.field_I - -1 + param2.field_xb.field_v * this.field_J].c(-26)) {
                        break L23;
                      } else {
                        if (this.field_w == null) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    if (var14 == null) {
                      break L21;
                    } else {
                      if (!param2.field_xb.c(var14.field_O, -16985, this.field_G)) {
                        break L21;
                      } else {
                        if (!var14.a(23072)) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  this.field_s = this.field_s + 1;
                  if (!this.a(this.field_J, 15, param2, param0, 1 + this.field_I)) {
                    break L21;
                  } else {
                    var4_int = 1;
                    break L21;
                  }
                } else {
                  break L21;
                }
              }
              L24: {
                if (0 < this.field_J) {
                  L25: {
                    L26: {
                      var15 = param2.field_xb.c(-1 + this.field_J, true, this.field_I);
                      if (!param2.field_xb.field_Eb[(this.field_J - 1) * param2.field_xb.field_v + this.field_I].c(-45)) {
                        break L26;
                      } else {
                        if (this.field_w == null) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                    if (var15 == null) {
                      break L24;
                    } else {
                      if (!param2.field_xb.c(var15.field_O, -16985, this.field_G)) {
                        break L24;
                      } else {
                        if (!var15.a(23072)) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                  }
                  this.field_s = this.field_s + 1;
                  if (!this.a(-1 + this.field_J, 15, param2, param0, this.field_I)) {
                    break L24;
                  } else {
                    var4_int = 1;
                    break L24;
                  }
                } else {
                  break L24;
                }
              }
              L27: {
                if (-1 + param2.field_xb.field_db <= this.field_J) {
                  break L27;
                } else {
                  L28: {
                    L29: {
                      var16 = param2.field_xb.c(this.field_J + 1, true, this.field_I);
                      if (!param2.field_xb.field_Eb[this.field_I + (1 + this.field_J) * param2.field_xb.field_v].c(-44)) {
                        break L29;
                      } else {
                        if (null == this.field_w) {
                          break L28;
                        } else {
                          break L29;
                        }
                      }
                    }
                    if (var16 == null) {
                      break L27;
                    } else {
                      if (!param2.field_xb.c(var16.field_O, -16985, this.field_G)) {
                        break L27;
                      } else {
                        if (!var16.a(23072)) {
                          break L27;
                        } else {
                          break L28;
                        }
                      }
                    }
                  }
                  this.field_s = this.field_s + 1;
                  if (!this.a(this.field_J + 1, 15, param2, param0, this.field_I)) {
                    break L27;
                  } else {
                    var4_int = 1;
                    break L27;
                  }
                }
              }
              L30: {
                if (this.field_s <= 1) {
                  break L30;
                } else {
                  L31: {
                    if (this.a((byte) -39, param2, param0, true)) {
                      var4_int = 1;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L30;
                  }
                }
              }
              this.c((byte) -127);
              break L1;
            }
            L32: {
              if (param1 < -84) {
                break L32;
              } else {
                qq.a((byte) -37, 26, -64, -50);
                break L32;
              }
            }
            this.a(param2.field_xb, -26661);
            stackOut_112_0 = var4_int;
            stackIn_113_0 = stackOut_112_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var4 = decompiledCaughtException;
            stackOut_114_0 = (RuntimeException) (var4);
            stackOut_114_1 = new StringBuilder().append("qq.A(");
            stackIn_116_0 = stackOut_114_0;
            stackIn_116_1 = stackOut_114_1;
            stackIn_115_0 = stackOut_114_0;
            stackIn_115_1 = stackOut_114_1;
            if (param0 == null) {
              stackOut_116_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackOut_116_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackOut_116_2 = "null";
              stackIn_117_0 = stackOut_116_0;
              stackIn_117_1 = stackOut_116_1;
              stackIn_117_2 = stackOut_116_2;
              break L33;
            } else {
              stackOut_115_0 = (RuntimeException) ((Object) stackIn_115_0);
              stackOut_115_1 = (StringBuilder) ((Object) stackIn_115_1);
              stackOut_115_2 = "{...}";
              stackIn_117_0 = stackOut_115_0;
              stackIn_117_1 = stackOut_115_1;
              stackIn_117_2 = stackOut_115_2;
              break L33;
            }
          }
          L34: {
            stackOut_117_0 = (RuntimeException) ((Object) stackIn_117_0);
            stackOut_117_1 = ((StringBuilder) (Object) stackIn_117_1).append(stackIn_117_2).append(',').append(param1).append(',');
            stackIn_119_0 = stackOut_117_0;
            stackIn_119_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param2 == null) {
              stackOut_119_0 = (RuntimeException) ((Object) stackIn_119_0);
              stackOut_119_1 = (StringBuilder) ((Object) stackIn_119_1);
              stackOut_119_2 = "null";
              stackIn_120_0 = stackOut_119_0;
              stackIn_120_1 = stackOut_119_1;
              stackIn_120_2 = stackOut_119_2;
              break L34;
            } else {
              stackOut_118_0 = (RuntimeException) ((Object) stackIn_118_0);
              stackOut_118_1 = (StringBuilder) ((Object) stackIn_118_1);
              stackOut_118_2 = "{...}";
              stackIn_120_0 = stackOut_118_0;
              stackIn_120_1 = stackOut_118_1;
              stackIn_120_2 = stackOut_118_2;
              break L34;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_120_0), stackIn_120_2 + ')');
        }
        return stackIn_113_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param0 = param0 << -492462104 | param0;
            var4_int = param0 ^ param0 >> 354722433;
            if (param1 == -12933) {
              var7 = 0;
              L1: while (true) {
                L2: {
                  if (4 <= var7) {
                    break L2;
                  } else {
                    var5 = -54 + (bm.field_y[var7][0] + param3) + (var4_int & 15);
                    var6 = param2 + (bm.field_y[var7][1] - -(param0 & 7) + -64);
                    fe.a(jq.field_G[3], 60 + var5, var6 - -50, jq.field_G[3].field_A >> -580081759, jq.field_G[3].field_x >> -1346806815);
                    var4_int = var4_int >> 1;
                    param0 = param0 >> 1;
                    var7++;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "qq.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void g(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              wd.field_b = rs.field_n.a(il.field_t[17]) - -20;
              var1_int = rs.field_n.a(il.field_t[18]);
              if (wd.field_b >= var1_int) {
                break L1;
              } else {
                wd.field_b = var1_int;
                break L1;
              }
            }
            L2: {
              if (kr.field_G == null) {
                kr.field_G = new rk();
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              kr.field_G.f((byte) 79);
              if (kr.field_E == null) {
                kr.field_E = new dm();
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              kr.field_E.i(param0 + 0);
              kr.field_E.e((byte) 97);
              ts.field_j = bm.field_D;
              if (param0 == 1) {
                break L4;
              } else {
                field_A = (String) null;
                break L4;
              }
            }
            var2 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  if (var2 >= oh.field_G.length) {
                    break L7;
                  } else {
                    oh.field_G[var2] = true;
                    var2++;
                    if (var3 != 0) {
                      break L6;
                    } else {
                      if (var3 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                oh.field_G[37] = false;
                oh.field_G[32] = re.a(0, (byte) -98);
                break L6;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "qq.D(" + param0 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 != 35) {
            return;
        }
        field_A = null;
        field_y = null;
        field_D = null;
        field_H = null;
        field_z = null;
    }

    final void a(ha param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        ic var5 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.field_C) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          this.field_C = true;
                          var3_int = this.field_F;
                          if (var3_int != 0) {
                            break L6;
                          } else {
                            if (var4 == 0) {
                              param0.c(this.field_J, this.field_I, this.field_G, (byte) -115);
                              if (var4 == 0) {
                                break L1;
                              } else {
                                break L5;
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (var3_int == 1) {
                          break L5;
                        } else {
                          L7: {
                            if (var3_int != 2) {
                              break L7;
                            } else {
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (3 == var3_int) {
                            break L3;
                          } else {
                            if (4 == var3_int) {
                              break L2;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                      param0.a((byte) 34, this.field_G, this.field_J, this.field_I - -1);
                      param0.a((byte) 30, this.field_G, this.field_J, -1 + this.field_I);
                      param0.a((byte) 61, this.field_G, this.field_J + 1, this.field_I);
                      param0.a((byte) 35, this.field_G, this.field_J - 1, this.field_I);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                    param0.a(-122, false, this.field_I - -1, this.field_J, this.field_G, 3);
                    param0.a(-125, false, -1 + this.field_I, this.field_J, this.field_G, 3);
                    param0.a(-119, false, this.field_I, 1 + this.field_J, this.field_G, 3);
                    param0.a(-128, false, this.field_I, -1 + this.field_J, this.field_G, 3);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                  param0.f(this.field_I - -1, this.field_G, 126, this.field_J);
                  param0.f(-1 + this.field_I, this.field_G, param1 + 26785, this.field_J);
                  param0.f(this.field_I, this.field_G, 121, this.field_J - -1);
                  param0.f(this.field_I, this.field_G, 119, -1 + this.field_J);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                param0.a(-100, param0.field_Eb[param0.field_v * this.field_J + this.field_I]);
                break L1;
              }
              L8: {
                if (param1 == -26661) {
                  break L8;
                } else {
                  var5 = (ic) null;
                  discarded$1 = this.a((at) null, (byte) -124, (ic) null);
                  break L8;
                }
              }
              L9: {
                L10: {
                  if (2 == this.field_F) {
                    break L10;
                  } else {
                    if (3 == this.field_F) {
                      break L10;
                    } else {
                      break L9;
                    }
                  }
                }
                param0.e(14, this.field_I - -1, this.field_G, this.field_J);
                param0.e(14, -1 + this.field_I, this.field_G, this.field_J);
                param0.e(14, this.field_I, this.field_G, 1 + this.field_J);
                param0.e(param1 + 26675, this.field_I, this.field_G, -1 + this.field_J);
                break L9;
              }
              fl.a(param0, -111);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var3);
            stackOut_30_1 = new StringBuilder().append("qq.G(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        bv var4 = null;
        int var5 = 0;
        if (nw.g(98)) {
          return;
        } else {
          L0: {
            var4 = vl.field_n;
            var4.h(32161, 16);
            var4.field_q = var4.field_q + 1;
            var5 = var4.field_q;
            var4.b(param0 ^ 7, 0);
            var4.b(true, param1);
            var4.b(1, param2);
            var4.b(true, param3);
            if (param0 == 6) {
              break L0;
            } else {
              qq.a(-60, -103, 22, 28, -21);
              break L0;
            }
          }
          var4.e(-var5 + var4.field_q, 5930);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              qn.e(param1, param4, 1 + param0, 10000536);
              qn.e(param1, param4 - -param2, param0 - -1, 12105912);
              var5_int = 1;
              if (qn.field_a > var5_int + param4) {
                var5_int = -param4 + qn.field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var6 = param2;
              if (qn.field_f < var6 + param4) {
                var6 = qn.field_f - param4;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = var5_int;
            var8 = 125 / ((param3 - 27) / 51);
            L3: while (true) {
              L4: {
                if (var7 >= var6) {
                  break L4;
                } else {
                  var9 = 152 - -(var7 * 48 / param2);
                  var10 = var9 << -847424080 | var9 << -110659992 | var9;
                  qn.field_d[(var7 + param4) * qn.field_l + param1] = var10;
                  qn.field_d[qn.field_l * (param4 - -var7) + (param1 - -param0)] = var10;
                  var7++;
                  if (var11 != 0) {
                    break L4;
                  } else {
                    continue L3;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "qq.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String a(byte param0, boolean param1) {
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = -2 / ((53 - param0) / 51);
        if (param1) {
          L0: {
            System.out.println("State change event debug");
            System.out.println("At " + this.field_I + "," + this.field_J);
            System.out.println("Player" + this.field_G);
            var4_int = this.field_F;
            if (var4_int != 0) {
              break L0;
            } else {
              if (var5 != 0) {
                break L0;
              } else {
                L1: {
                  System.out.println("Capture");
                  if (var5 == 0) {
                    break L1;
                  } else {
                    System.out.println("Raise");
                    System.out.println("Heal");
                    if (var5 == 0) {
                      break L1;
                    } else {
                      System.out.println("Pump");
                      if (var5 == 0) {
                        break L1;
                      } else {
                        System.out.println("Bury");
                        break L1;
                      }
                    }
                  }
                }
                var4 = "EventStateChange: pos: (" + this.field_I + "," + this.field_J + "), type: " + this.field_F + ", player: " + this.field_G;
                return var4;
              }
            }
          }
          if (var4_int != 1) {
            if (var4_int != 2) {
              L2: {
                if (var4_int != 3) {
                  break L2;
                } else {
                  if (var5 != 0) {
                    break L2;
                  } else {
                    L3: {
                      System.out.println("Pump");
                      if (var5 == 0) {
                        break L3;
                      } else {
                        System.out.println("Bury");
                        break L3;
                      }
                    }
                    var4 = "EventStateChange: pos: (" + this.field_I + "," + this.field_J + "), type: " + this.field_F + ", player: " + this.field_G;
                    return var4;
                  }
                }
              }
              if (-5 != (var4_int ^ -1)) {
                var4 = "EventStateChange: pos: (" + this.field_I + "," + this.field_J + "), type: " + this.field_F + ", player: " + this.field_G;
                return var4;
              } else {
                System.out.println("Bury");
                var4 = "EventStateChange: pos: (" + this.field_I + "," + this.field_J + "), type: " + this.field_F + ", player: " + this.field_G;
                return var4;
              }
            } else {
              L4: {
                System.out.println("Heal");
                if (var5 == 0) {
                  break L4;
                } else {
                  System.out.println("Pump");
                  if (var5 == 0) {
                    break L4;
                  } else {
                    System.out.println("Bury");
                    break L4;
                  }
                }
              }
              var4 = "EventStateChange: pos: (" + this.field_I + "," + this.field_J + "), type: " + this.field_F + ", player: " + this.field_G;
              return var4;
            }
          } else {
            L5: {
              System.out.println("Raise");
              if (var5 == 0) {
                break L5;
              } else {
                System.out.println("Heal");
                if (var5 == 0) {
                  break L5;
                } else {
                  System.out.println("Pump");
                  if (var5 == 0) {
                    break L5;
                  } else {
                    System.out.println("Bury");
                    break L5;
                  }
                }
              }
            }
            var4 = "EventStateChange: pos: (" + this.field_I + "," + this.field_J + "), type: " + this.field_F + ", player: " + this.field_G;
            return var4;
          }
        } else {
          var4 = "EventStateChange: pos: (" + this.field_I + "," + this.field_J + "), type: " + this.field_F + ", player: " + this.field_G;
          return var4;
        }
    }

    qq(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      var6 = ArmiesOfGielinor.field_M ? 1 : 0;
                      this.field_G = param3;
                      this.field_F = param0;
                      this.field_I = param1;
                      this.field_J = param2;
                      this.field_m = -1;
                      var5 = this.field_F;
                      if (-1 != (var5 ^ -1)) {
                        break L6;
                      } else {
                        if (var6 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (1 != var5) {
                        break L7;
                      } else {
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if ((var5 ^ -1) != -3) {
                        break L8;
                      } else {
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (var5 == 3) {
                      break L2;
                    } else {
                      if (-5 != (var5 ^ -1)) {
                        break L0;
                      } else {
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  this.field_m = 3;
                  if (var6 == 0) {
                    break L0;
                  } else {
                    break L4;
                  }
                }
                this.field_m = 16;
                if (var6 == 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
              this.field_m = 12;
              if (var6 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
            this.field_m = 14;
            if (var6 == 0) {
              break L0;
            } else {
              break L1;
            }
          }
          this.field_m = 17;
          break L0;
        }
    }

    final static void a(kl param0, kl param1, kl param2, int param3, boolean param4) {
        se.field_g = cr.a("", 4210752);
        se.field_g.a(false, true);
        if (param3 != 0) {
            return;
        }
        try {
            kr.a(param2, false, param1, param0);
            da.b(-2);
            oh.field_L = nb.field_i;
            mh.field_b = nb.field_i;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "qq.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_z = "Invalid date";
        field_y = "Skip";
        field_A = "Empty";
        field_H = "Most honourable";
        field_D = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
