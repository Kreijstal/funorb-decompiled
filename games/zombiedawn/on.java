/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static java.awt.Image field_i;
    int[] field_b;
    int field_k;
    boolean field_e;
    private int[] field_l;
    int[][] field_p;
    int field_o;
    private boolean field_d;
    int field_j;
    int field_a;
    int field_s;
    static String field_n;
    int[] field_m;
    int field_c;
    int[][] field_h;
    int field_r;
    static vo field_g;
    int[][] field_t;
    int[][] field_f;
    static int field_q;

    final void a(int param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        va var6 = null;
        int var7 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!this.field_e) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        this.field_e = false;
                        qk.n((byte) 96);
                        var3_int = param0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.field_h.length <= var3_int) {
                            statePc = 25;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var7 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((this.field_h[0].length ^ -1) >= (var4 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 = (127 & this.field_f[var3_int][var4]) >> 2083899776;
                        var6 = ub.a(127, var5);
                        if (var7 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var6 != null) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.field_h[var3_int][var4] = hi.a(eg.a(this.field_h[var3_int][var4], -128), var6.field_g);
                        this.field_e = true;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var4++;
                        if (var7 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3_int++;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var7 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw sh.a((Throwable) ((Object) runtimeException), "on.N(" + param0 + ',' + param1 + ')');
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        try {
            this.a(this.field_f, (byte) -39);
            this.a(108, this.field_f);
            this.field_k = this.field_f[param0].length;
            this.field_r = this.field_f.length;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "on.J(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_g = null;
              field_n = null;
              if (param0 == 122) {
                break L1;
              } else {
                on.b(-118);
                break L1;
              }
            }
            field_i = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "on.L(" + param0 + ')');
        }
    }

    private final int c(int param0, int param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_239_0 = 0;
        int stackIn_247_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_260_0 = 0;
        int stackIn_273_0 = 0;
        int stackIn_283_0 = 0;
        int stackIn_335_0 = 0;
        int stackIn_601_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ZombieDawn.field_J;
        try {
          L0: {
            if (this.field_d) {
              L1: {
                var4_int = this.a(param0, param1, 1);
                var4_int = var4_int & -67108865;
                var5 = (var4_int & 65408) >> 1832864999;
                if ((var4_int & 33554432) == 0) {
                  break L1;
                } else {
                  if (0 == var5) {
                    L2: {
                      L3: {
                        var4_int = var4_int & -65409;
                        if (this.b(1 + param0, param1, -1777127001)) {
                          break L3;
                        } else {
                          if (this.d(1 + param0, 1, param1)) {
                            break L3;
                          } else {
                            stackIn_247_0 = 1;
                            break L2;
                          }
                        }
                      }
                      stackIn_247_0 = 0;
                      break L2;
                    }
                    var6 = stackIn_247_0;
                    var7 = (this.a(param0, param1 - 1, 1) & 33488896) >> -712883376;
                    var8 = this.b(param0, 3 + param1, -1777127001) ? 1 : 0;
                    if (param2 <= -34) {
                      L4: {
                        L5: {
                          if (!this.b(param0, param1 + -1, -1777127001)) {
                            break L5;
                          } else {
                            L6: {
                              if (-1 == (var7 ^ -1)) {
                                break L6;
                              } else {
                                if (64 >= var7) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            stackIn_260_0 = 1;
                            break L4;
                          }
                        }
                        stackIn_260_0 = 0;
                        break L4;
                      }
                      L7: {
                        L8: {
                          L9: {
                            var9 = stackIn_260_0;
                            if (this.b(param0 + -1, param1, -1777127001)) {
                              break L9;
                            } else {
                              if (this.d(-1 + param0, 1, param1)) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (this.b(-1 + param0, param1 + 1, -1777127001)) {
                              break L10;
                            } else {
                              if (!this.b(param0 - 1, param1 - -2, -1777127001)) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          stackIn_273_0 = 1;
                          break L7;
                        }
                        stackIn_273_0 = 0;
                        break L7;
                      }
                      L11: {
                        L12: {
                          var10 = stackIn_273_0;
                          if (!this.b(1 + param0, param1, -1777127001)) {
                            break L12;
                          } else {
                            L13: {
                              if (this.b(1 + param0, 1 + param1, -1777127001)) {
                                break L13;
                              } else {
                                if (!this.b(param0 - -1, 2 + param1, -1777127001)) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            stackIn_283_0 = 1;
                            break L11;
                          }
                        }
                        stackIn_283_0 = 0;
                        break L11;
                      }
                      L14: {
                        L15: {
                          L16: {
                            var11 = stackIn_283_0;
                            if (!this.d(param0, 1, param1)) {
                              break L16;
                            } else {
                              if (var6 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L17: {
                            L18: {
                              if (!this.d(param0, 1, param1)) {
                                break L18;
                              } else {
                                if (var6 != 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            L19: {
                              if (!this.b(param0, 1 + param1, -1777127001)) {
                                break L19;
                              } else {
                                L20: {
                                  if (!this.b(1 + param0, param1, -1777127001)) {
                                    break L20;
                                  } else {
                                    if (!this.b(-1 + param0, param1, -1777127001)) {
                                      break L20;
                                    } else {
                                      var4_int = var4_int | this.a(5, -113);
                                      if (var13 == 0) {
                                        break L14;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                                L21: {
                                  if (this.b(1 + param0, param1, -1777127001)) {
                                    break L21;
                                  } else {
                                    L22: {
                                      if (!this.b(-1 + param0, param1, -1777127001)) {
                                        break L22;
                                      } else {
                                        var4_int = var4_int | this.a(3, 71);
                                        if (var13 == 0) {
                                          break L14;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                    var4_int = var4_int | this.a(1, -124);
                                    if (var13 == 0) {
                                      break L14;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                var4_int = var4_int | this.a(7, 125);
                                if (var13 == 0) {
                                  break L14;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            if (this.b(param0, 2 + param1, -1777127001)) {
                              L23: {
                                if (!this.b(1 + param0, param1, -1777127001)) {
                                  break L23;
                                } else {
                                  if (!this.b(param0 - 1, param1, -1777127001)) {
                                    break L23;
                                  } else {
                                    var4_int = var4_int | this.a(6, -99);
                                    if (var13 == 0) {
                                      break L14;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                              }
                              L24: {
                                if (this.b(param0 + 1, param1, -1777127001)) {
                                  break L24;
                                } else {
                                  L25: {
                                    if (this.b(-1 + param0, param1, -1777127001)) {
                                      break L25;
                                    } else {
                                      var4_int = var4_int | this.a(2, -54);
                                      if (var13 == 0) {
                                        break L14;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  var4_int = var4_int | this.a(4, -76);
                                  if (var13 == 0) {
                                    break L14;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              var4_int = var4_int | this.a(8, -17);
                              if (var13 == 0) {
                                break L14;
                              } else {
                                break L17;
                              }
                            } else {
                              break L14;
                            }
                          }
                          L26: {
                            var11 = var11 != 0 | this.b(param0 - -1, 1 + param1, -1777127001) ? 1 : 0;
                            var10 = var10 != 0 | this.b(param0 + -1, 1 + param1, -1777127001) ? 1 : 0;
                            if (this.b(param0 - -1, param1 + 1, -1777127001)) {
                              stackIn_335_0 = 128;
                              break L26;
                            } else {
                              stackIn_335_0 = 0;
                              break L26;
                            }
                          }
                          L27: {
                            L28: {
                              L29: {
                                var12 = stackIn_335_0;
                                if (var8 != 0) {
                                  break L29;
                                } else {
                                  if (var9 != 0) {
                                    break L29;
                                  } else {
                                    if (var10 == 0) {
                                      break L29;
                                    } else {
                                      if (var11 != 0) {
                                        break L28;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                }
                              }
                              L30: {
                                if (var8 != 0) {
                                  break L30;
                                } else {
                                  if (var9 != 0) {
                                    break L30;
                                  } else {
                                    if (var10 != 0) {
                                      break L30;
                                    } else {
                                      if (var11 == 0) {
                                        break L30;
                                      } else {
                                        var4_int = var4_int | this.a(28, 86) + -var12;
                                        if (var13 == 0) {
                                          break L27;
                                        } else {
                                          break L30;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L31: {
                                L32: {
                                  if (var8 != 0) {
                                    break L32;
                                  } else {
                                    if (var11 != 0) {
                                      break L32;
                                    } else {
                                      if (var9 == 0) {
                                        break L32;
                                      } else {
                                        if (var10 != 0) {
                                          break L31;
                                        } else {
                                          break L32;
                                        }
                                      }
                                    }
                                  }
                                }
                                L33: {
                                  L34: {
                                    if (var8 != 0) {
                                      break L34;
                                    } else {
                                      if (var11 != 0) {
                                        break L34;
                                      } else {
                                        if (var9 == 0) {
                                          break L34;
                                        } else {
                                          if (var10 == 0) {
                                            break L33;
                                          } else {
                                            break L34;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L35: {
                                    L36: {
                                      if (var8 != 0) {
                                        break L36;
                                      } else {
                                        if (var11 != 0) {
                                          break L36;
                                        } else {
                                          if (var9 != 0) {
                                            break L36;
                                          } else {
                                            if (var10 != 0) {
                                              break L35;
                                            } else {
                                              break L36;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var8 == 0) {
                                      break L27;
                                    } else {
                                      if (!this.b(1 + param0, param1, -1777127001)) {
                                        var4_int = var4_int | (786432 | this.a(1, -41));
                                        if (var13 == 0) {
                                          break L27;
                                        } else {
                                          break L35;
                                        }
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  var4_int = var4_int | -var12 + this.a(26, 86);
                                  if (var13 == 0) {
                                    break L27;
                                  } else {
                                    break L33;
                                  }
                                }
                                var4_int = var4_int | this.a(28, 110) - var12;
                                if (var13 == 0) {
                                  break L27;
                                } else {
                                  break L31;
                                }
                              }
                              var4_int = var4_int | -var12 + this.a(26, -62);
                              if (var13 == 0) {
                                break L27;
                              } else {
                                break L28;
                              }
                            }
                            var4_int = var4_int | this.a(26, -100) + -var12;
                            break L27;
                          }
                          if (var13 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                        L37: {
                          if (var8 == 0) {
                            break L37;
                          } else {
                            if (var9 == 0) {
                              break L37;
                            } else {
                              if (var10 == 0) {
                                break L37;
                              } else {
                                if (var11 == 0) {
                                  break L37;
                                } else {
                                  var4_int = var4_int | this.a(9, -42);
                                  break L37;
                                }
                              }
                            }
                          }
                        }
                        L38: {
                          if (var8 == 0) {
                            break L38;
                          } else {
                            if (var9 == 0) {
                              break L38;
                            } else {
                              if (var10 == 0) {
                                break L38;
                              } else {
                                if (var11 != 0) {
                                  break L38;
                                } else {
                                  var4_int = var4_int | this.a(10, 82);
                                  break L38;
                                }
                              }
                            }
                          }
                        }
                        L39: {
                          if (var8 == 0) {
                            break L39;
                          } else {
                            if (var9 == 0) {
                              break L39;
                            } else {
                              if (var10 != 0) {
                                break L39;
                              } else {
                                if (var11 == 0) {
                                  break L39;
                                } else {
                                  var4_int = var4_int | this.a(11, -76);
                                  break L39;
                                }
                              }
                            }
                          }
                        }
                        L40: {
                          if (var8 == 0) {
                            break L40;
                          } else {
                            if (var9 == 0) {
                              break L40;
                            } else {
                              if (var10 != 0) {
                                break L40;
                              } else {
                                if (var11 == 0) {
                                  var4_int = var4_int | this.a(18, 123);
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                            }
                          }
                        }
                        L41: {
                          if (var8 == 0) {
                            break L41;
                          } else {
                            if (var9 != 0) {
                              break L41;
                            } else {
                              if (var10 == 0) {
                                break L41;
                              } else {
                                if (var11 != 0) {
                                  var4_int = var4_int | this.a(12, 117);
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                            }
                          }
                        }
                        L42: {
                          if (var8 == 0) {
                            break L42;
                          } else {
                            if (var9 != 0) {
                              break L42;
                            } else {
                              if (var10 == 0) {
                                break L42;
                              } else {
                                if (var11 == 0) {
                                  var4_int = var4_int | this.a(14, 71);
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                            }
                          }
                        }
                        L43: {
                          if (var8 == 0) {
                            break L43;
                          } else {
                            if (var9 != 0) {
                              break L43;
                            } else {
                              if (var10 != 0) {
                                break L43;
                              } else {
                                if (var11 == 0) {
                                  break L43;
                                } else {
                                  var4_int = var4_int | this.a(15, -16);
                                  break L43;
                                }
                              }
                            }
                          }
                        }
                        L44: {
                          if (var8 == 0) {
                            break L44;
                          } else {
                            if (var9 != 0) {
                              break L44;
                            } else {
                              if (var10 != 0) {
                                break L44;
                              } else {
                                if (var11 != 0) {
                                  break L44;
                                } else {
                                  var4_int = var4_int | this.a(21, -9);
                                  break L44;
                                }
                              }
                            }
                          }
                        }
                        L45: {
                          if (var8 != 0) {
                            break L45;
                          } else {
                            if (var9 == 0) {
                              break L45;
                            } else {
                              if (var10 == 0) {
                                break L45;
                              } else {
                                if (var11 != 0) {
                                  var4_int = var4_int | this.a(19, -54);
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                            }
                          }
                        }
                        L46: {
                          if (var8 != 0) {
                            break L46;
                          } else {
                            if (var9 == 0) {
                              break L46;
                            } else {
                              if (var10 == 0) {
                                break L46;
                              } else {
                                if (var11 != 0) {
                                  break L46;
                                } else {
                                  var4_int = var4_int | this.a(16, 107);
                                  break L46;
                                }
                              }
                            }
                          }
                        }
                        L47: {
                          if (var8 != 0) {
                            break L47;
                          } else {
                            if (var9 == 0) {
                              break L47;
                            } else {
                              if (var10 != 0) {
                                break L47;
                              } else {
                                if (var11 == 0) {
                                  break L47;
                                } else {
                                  var4_int = var4_int | this.a(17, -21);
                                  break L47;
                                }
                              }
                            }
                          }
                        }
                        L48: {
                          if (var8 != 0) {
                            break L48;
                          } else {
                            if (var9 == 0) {
                              break L48;
                            } else {
                              if (var10 != 0) {
                                break L48;
                              } else {
                                if (var11 == 0) {
                                  var4_int = var4_int | this.a(20, 115);
                                  break L48;
                                } else {
                                  break L48;
                                }
                              }
                            }
                          }
                        }
                        L49: {
                          if (var8 != 0) {
                            break L49;
                          } else {
                            if (var9 != 0) {
                              break L49;
                            } else {
                              if (var10 == 0) {
                                break L49;
                              } else {
                                if (var11 == 0) {
                                  break L49;
                                } else {
                                  var4_int = var4_int | this.a(19, -78);
                                  break L49;
                                }
                              }
                            }
                          }
                        }
                        L50: {
                          if (var8 != 0) {
                            break L50;
                          } else {
                            if (var9 != 0) {
                              break L50;
                            } else {
                              if (var10 == 0) {
                                break L50;
                              } else {
                                if (var11 != 0) {
                                  break L50;
                                } else {
                                  var4_int = var4_int | this.a(22, 117);
                                  break L50;
                                }
                              }
                            }
                          }
                        }
                        L51: {
                          if (var8 != 0) {
                            break L51;
                          } else {
                            if (var9 != 0) {
                              break L51;
                            } else {
                              if (var10 != 0) {
                                break L51;
                              } else {
                                if (var11 != 0) {
                                  var4_int = var4_int | this.a(23, 88);
                                  break L51;
                                } else {
                                  break L51;
                                }
                              }
                            }
                          }
                        }
                        if (var8 != 0) {
                          break L14;
                        } else {
                          if (var9 != 0) {
                            break L14;
                          } else {
                            if (var10 != 0) {
                              break L14;
                            } else {
                              if (var11 != 0) {
                                break L14;
                              } else {
                                var4_int = var4_int | this.a(24, -68);
                                break L14;
                              }
                            }
                          }
                        }
                      }
                      L52: {
                        if ((var4_int & 65408) != 0) {
                          break L52;
                        } else {
                          var4_int = var4_int | this.a(24, -69);
                          break L52;
                        }
                      }
                      stackIn_601_0 = var4_int;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_249_0 = -64;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L53: {
                L54: {
                  L55: {
                    L56: {
                      var6 = this.b(param0, param1 + 3, -1777127001) ? 1 : 0;
                      var7 = this.b(param0, param1 - 1, -1777127001) ? 1 : 0;
                      if (!this.b(-1 + param0, param1, -1777127001)) {
                        break L56;
                      } else {
                        if (this.b(-1 + param0, param1 + 1, -1777127001)) {
                          break L55;
                        } else {
                          if (this.b(param0 - 1, param1 + 2, -1777127001)) {
                            break L55;
                          } else {
                            break L56;
                          }
                        }
                      }
                    }
                    if (this.d(-1 + param0, 1, param1)) {
                      break L54;
                    } else {
                      break L55;
                    }
                  }
                  if (!this.a(param0 + -1, (byte) -121, param1)) {
                    break L54;
                  } else {
                    stackIn_24_0 = 1;
                    break L53;
                  }
                }
                stackIn_24_0 = 0;
                break L53;
              }
              L57: {
                L58: {
                  var8 = stackIn_24_0;
                  if (!this.b(1 + param0, param1, -1777127001)) {
                    break L58;
                  } else {
                    if (!this.a(1 + param0, (byte) -89, param1)) {
                      break L58;
                    } else {
                      L59: {
                        if (this.b(param0 + 1, param1 - -1, -1777127001)) {
                          break L59;
                        } else {
                          if (!this.b(1 + param0, 2 + param1, -1777127001)) {
                            break L58;
                          } else {
                            break L59;
                          }
                        }
                      }
                      stackIn_37_0 = 1;
                      break L57;
                    }
                  }
                }
                stackIn_37_0 = 0;
                break L57;
              }
              L60: {
                L61: {
                  var9 = stackIn_37_0;
                  if (this.b(param0 - -1, param1, -1777127001)) {
                    break L61;
                  } else {
                    if (this.d(param0 - -1, 1, param1)) {
                      break L61;
                    } else {
                      stackIn_44_0 = 1;
                      break L60;
                    }
                  }
                }
                stackIn_44_0 = 0;
                break L60;
              }
              L62: {
                var10 = stackIn_44_0;
                if (!this.d(param0, 1, param1)) {
                  break L62;
                } else {
                  if (var10 == 0) {
                    L63: {
                      if (var6 == 0) {
                        break L63;
                      } else {
                        if (var7 == 0) {
                          break L63;
                        } else {
                          if (var8 == 0) {
                            break L63;
                          } else {
                            if (var9 == 0) {
                              break L63;
                            } else {
                              var4_int = var4_int | 589824;
                              break L63;
                            }
                          }
                        }
                      }
                    }
                    L64: {
                      if (var6 == 0) {
                        break L64;
                      } else {
                        if (var7 == 0) {
                          break L64;
                        } else {
                          if (var8 == 0) {
                            break L64;
                          } else {
                            if (var9 != 0) {
                              break L64;
                            } else {
                              var4_int = var4_int | 655360;
                              break L64;
                            }
                          }
                        }
                      }
                    }
                    L65: {
                      if (var6 == 0) {
                        break L65;
                      } else {
                        if (var7 == 0) {
                          break L65;
                        } else {
                          if (var8 != 0) {
                            break L65;
                          } else {
                            if (var9 == 0) {
                              break L65;
                            } else {
                              var4_int = var4_int | 720896;
                              break L65;
                            }
                          }
                        }
                      }
                    }
                    L66: {
                      if (var6 == 0) {
                        break L66;
                      } else {
                        if (var7 == 0) {
                          break L66;
                        } else {
                          if (var8 != 0) {
                            break L66;
                          } else {
                            if (var9 == 0) {
                              var4_int = var4_int | 1179648;
                              break L66;
                            } else {
                              break L66;
                            }
                          }
                        }
                      }
                    }
                    L67: {
                      if (var6 == 0) {
                        break L67;
                      } else {
                        if (var7 != 0) {
                          break L67;
                        } else {
                          if (var8 == 0) {
                            break L67;
                          } else {
                            if (var9 == 0) {
                              break L67;
                            } else {
                              var4_int = var4_int | 786432;
                              break L67;
                            }
                          }
                        }
                      }
                    }
                    L68: {
                      if (var6 == 0) {
                        break L68;
                      } else {
                        if (var7 != 0) {
                          break L68;
                        } else {
                          if (var8 == 0) {
                            break L68;
                          } else {
                            if (var9 == 0) {
                              var4_int = var4_int | 917504;
                              break L68;
                            } else {
                              break L68;
                            }
                          }
                        }
                      }
                    }
                    L69: {
                      if (var6 == 0) {
                        break L69;
                      } else {
                        if (var7 != 0) {
                          break L69;
                        } else {
                          if (var8 != 0) {
                            break L69;
                          } else {
                            if (var9 != 0) {
                              var4_int = var4_int | 983040;
                              break L69;
                            } else {
                              break L69;
                            }
                          }
                        }
                      }
                    }
                    L70: {
                      if (var6 == 0) {
                        break L70;
                      } else {
                        if (var7 != 0) {
                          break L70;
                        } else {
                          if (var8 != 0) {
                            break L70;
                          } else {
                            if (var9 != 0) {
                              break L70;
                            } else {
                              var4_int = var4_int | 1376256;
                              break L70;
                            }
                          }
                        }
                      }
                    }
                    L71: {
                      if (var6 != 0) {
                        break L71;
                      } else {
                        if (var7 == 0) {
                          break L71;
                        } else {
                          if (var8 == 0) {
                            break L71;
                          } else {
                            if (var9 == 0) {
                              break L71;
                            } else {
                              var4_int = var4_int | 851968;
                              break L71;
                            }
                          }
                        }
                      }
                    }
                    L72: {
                      if (var6 != 0) {
                        break L72;
                      } else {
                        if (var7 == 0) {
                          break L72;
                        } else {
                          if (var8 == 0) {
                            break L72;
                          } else {
                            if (var9 != 0) {
                              break L72;
                            } else {
                              var4_int = var4_int | 1048576;
                              break L72;
                            }
                          }
                        }
                      }
                    }
                    L73: {
                      if (var6 != 0) {
                        break L73;
                      } else {
                        if (var7 == 0) {
                          break L73;
                        } else {
                          if (var8 != 0) {
                            break L73;
                          } else {
                            if (var9 == 0) {
                              break L73;
                            } else {
                              var4_int = var4_int | 1114112;
                              break L73;
                            }
                          }
                        }
                      }
                    }
                    L74: {
                      if (var6 != 0) {
                        break L74;
                      } else {
                        if (var7 == 0) {
                          break L74;
                        } else {
                          if (var8 != 0) {
                            break L74;
                          } else {
                            if (var9 == 0) {
                              var4_int = var4_int | 1310720;
                              break L74;
                            } else {
                              break L74;
                            }
                          }
                        }
                      }
                    }
                    L75: {
                      if (var6 != 0) {
                        break L75;
                      } else {
                        if (var7 != 0) {
                          break L75;
                        } else {
                          if (var8 == 0) {
                            break L75;
                          } else {
                            if (var9 != 0) {
                              var4_int = var4_int | 1245184;
                              break L75;
                            } else {
                              break L75;
                            }
                          }
                        }
                      }
                    }
                    L76: {
                      if (var6 != 0) {
                        break L76;
                      } else {
                        if (var7 != 0) {
                          break L76;
                        } else {
                          if (var8 == 0) {
                            break L76;
                          } else {
                            if (var9 == 0) {
                              var4_int = var4_int | 1441792;
                              break L76;
                            } else {
                              break L76;
                            }
                          }
                        }
                      }
                    }
                    L77: {
                      if (var6 != 0) {
                        break L77;
                      } else {
                        if (var7 != 0) {
                          break L77;
                        } else {
                          if (var8 != 0) {
                            break L77;
                          } else {
                            if (var9 == 0) {
                              break L77;
                            } else {
                              var4_int = var4_int | 1507328;
                              break L77;
                            }
                          }
                        }
                      }
                    }
                    if (var6 != 0) {
                      break L62;
                    } else {
                      if (var7 != 0) {
                        break L62;
                      } else {
                        if (var8 != 0) {
                          break L62;
                        } else {
                          if (var9 != 0) {
                            break L62;
                          } else {
                            var4_int = var4_int | 1572864;
                            break L62;
                          }
                        }
                      }
                    }
                  } else {
                    break L62;
                  }
                }
              }
              stackIn_239_0 = var4_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = this.b((byte) -61, param0, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_239_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_249_0;
            } else {
              return stackIn_601_0;
            }
          }
        }
    }

    private final void a(int[][] param0, byte param1) {
        int[] dupTemp$0 = null;
        int dupTemp$1 = 0;
        int[] arrayValue$2 = null;
        int[] dupTemp$3 = null;
        int dupTemp$4 = 0;
        int[] arrayValue$5 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_14_0 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int[] stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_17_2 = null;
        int stackIn_17_3 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[] stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -39) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var3_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = param0.length ^ -1;
                        stackIn_5_1 = var3_int ^ -1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 >= stackIn_5_1) {
                            statePc = 20;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_21_0 = 0;
                        stackIn_7_0 = stackIn_21_0;
                        if (var6 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = stackIn_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var4 ^ -1) <= (param0[0].length ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_5_0 = -1;
                        stackIn_10_0 = stackIn_5_0;
                        stackIn_5_1 = param0[var3_int][var4] & 33554432 ^ -1;
                        stackIn_10_1 = stackIn_5_1;
                        if (var6 != 0) {
                            statePc = 5;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 != stackIn_10_1) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_14_0 = 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = stackIn_14_0;
                        stackIn_17_0 = this.field_t[var3_int];
                        stackIn_15_0 = stackIn_17_0;
                        stackIn_17_1 = var4;
                        stackIn_15_1 = stackIn_17_1;
                        stackIn_17_2 = this.field_p[var3_int];
                        stackIn_15_2 = stackIn_17_2;
                        stackIn_17_3 = var4;
                        stackIn_15_3 = stackIn_17_3;
                        if (var5 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_18_0 = (int[]) ((Object) stackIn_15_0);
                        stackIn_18_1 = stackIn_15_1;
                        stackIn_18_2 = (int[]) ((Object) stackIn_15_2);
                        stackIn_18_3 = stackIn_15_3;
                        stackIn_18_4 = 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = (int[]) ((Object) stackIn_17_0);
                        stackIn_18_1 = stackIn_17_1;
                        stackIn_18_2 = (int[]) ((Object) stackIn_17_2);
                        stackIn_18_3 = stackIn_17_3;
                        stackIn_18_4 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_18_2[stackIn_18_3] = stackIn_18_4;
                        stackIn_18_0[stackIn_18_1] = stackIn_18_4;
                        var4++;
                        if (var6 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3_int++;
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3_int = stackIn_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = var3_int;
                        stackIn_23_1 = param0.length;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 >= stackIn_23_1) {
                            statePc = 39;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var6 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var4 = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var4 >= param0[0].length + -1) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_23_0 = -2;
                        stackIn_28_0 = stackIn_23_0;
                        stackIn_23_1 = this.field_p[var3_int][var4] & 1 ^ -1;
                        stackIn_28_1 = stackIn_23_1;
                        if (var6 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 == stackIn_28_1) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        dupTemp$0 = this.field_p[var3_int];
                        dupTemp$1 = hi.a(this.field_p[var3_int][var4 - -1], 2);
                        arrayValue$2 = this.field_t[var3_int];
                        dupTemp$0[1 + var4] = dupTemp$1;
                        arrayValue$2[1 + var4] = dupTemp$1;
                        dupTemp$3 = this.field_p[var3_int];
                        dupTemp$4 = hi.a(this.field_p[var3_int][-1 + var4], 4);
                        arrayValue$5 = this.field_t[var3_int];
                        dupTemp$3[var4 + -1] = dupTemp$4;
                        arrayValue$5[var4 - 1] = dupTemp$4;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var3_int++;
                        if (var6 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_37_0 = (RuntimeException) (var3);
                    stackIn_35_0 = stackIn_37_0;
                    stackIn_37_1 = new StringBuilder().append("on.V(");
                    stackIn_35_1 = stackIn_37_1;
                    if (param0 == null) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_38_2 = "{...}";
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_38_2 = "null";
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    throw sh.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ')');
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final fb a(int param0, int param1, int param2, int param3, int param4) {
        kd stackIn_2_0 = null;
        oo stackIn_22_0 = null;
        gb stackIn_28_0 = null;
        int stackIn_33_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        Object stackIn_40_0 = null;
        Object stackIn_45_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        gb var8 = null;
        ah var8_ref = null;
        try {
          L0: {
            var6_int = param2 & -25165825;
            var7 = null;
            if (-1 != (param3 ^ -1)) {
              L1: {
                if ((param3 ^ -1) != -2) {
                  if (2 == param3) {
                    L2: {
                      if (-1 <= (param2 & 1073741824 ^ -1)) {
                        stackIn_33_0 = 0;
                        break L2;
                      } else {
                        stackIn_33_0 = 1;
                        break L2;
                      }
                    }
                    L3: {


                      stackIn_36_1 = param1;

                      stackIn_36_2 = param0;

                      if ((536870912 & param2) <= 0) {

                        stackIn_37_1 = stackIn_36_1;
                        stackIn_37_2 = stackIn_36_2;
                        stackIn_37_3 = 0;
                        break L3;
                      } else {

                        stackIn_37_1 = stackIn_36_1;
                        stackIn_37_2 = stackIn_36_2;
                        stackIn_37_3 = 1;
                        break L3;
                      }
                    }
                    var7 = co.a(stackIn_33_0 != 0, stackIn_37_1, stackIn_37_2, stackIn_37_3 != 0, var6_int & -1610612737, -19653);
                    ((id) (var7)).field_E = param2 >> 606456887 & 3;
                    break L1;
                  } else {
                    if ((param3 ^ -1) == -4) {
                      L4: {
                        var6_int = var6_int & -134217729;
                        var8 = new gb(param0, param1, var6_int);
                        if (0 != (134217728 & param2)) {
                          var8.field_C = true;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      stackIn_28_0 = (gb) (var8);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (param3 == 4) {
                        stackIn_22_0 = new oo(param0, param1, param2);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  L5: {
                    var6_int = -67108865 & var6_int & -134217729;
                    var8_ref = eo.a(60, param0, var6_int, param1);
                    if ((param2 & 67108864 ^ -1) == -1) {
                      break L5;
                    } else {
                      var8_ref.field_ib = true;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = var8_ref;
                    if (-1 != (134217728 & param2 ^ -1)) {
                      var8_ref.field_C = true;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  break L1;
                }
              }
              if (var7 == null) {
                L7: {
                  if (param4 == 1) {
                    break L7;
                  } else {
                    this.a(116, (int[][]) null);
                    break L7;
                  }
                }
                stackIn_45_0 = null;
                decompiledRegionSelector0 = 4;
                break L0;
              } else {
                ((fb) (var7)).field_z = (param2 & 25165824) >> 738869015;
                stackIn_40_0 = var7;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackIn_2_0 = new kd(param0, param1, 3 & param2, param2 >> -1588842078 & 3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var6), "on.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fb) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (fb) ((Object) stackIn_22_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (fb) ((Object) stackIn_28_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (fb) ((Object) stackIn_40_0);
              } else {
                return (fb) ((Object) stackIn_45_0);
              }
            }
          }
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -43) {
              L1: {
                L2: {
                  var4_int = (33488896 & this.a(param0, param2, 1)) >> 178162352;
                  if ((var4_int ^ -1) < -65) {
                    break L2;
                  } else {
                    if ((var4_int ^ -1) != -1) {
                      stackIn_10_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_10_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                this.field_s = -75;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.a((byte) -113, param0, 1 + param2)) {
                  break L3;
                } else {
                  if (this.a((byte) -115, param0, 2 + param2)) {
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void a(int param0, int[][] param1) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = param1.length ^ -1;
                        stackIn_3_1 = var3_int ^ -1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 >= stackIn_3_1) {
                            statePc = 33;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_34_0 = 0;
                        stackIn_5_0 = stackIn_34_0;
                        if (var9 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((param1[0].length ^ -1) >= (var4 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = this.c(var4, var3_int, -35);
                        var6 = var5 >> -133895673 & 511;
                        var7 = 511 & var5 >> 1703707888;
                        stackIn_3_0 = -2147483648 & var5 ^ -1;
                        stackIn_8_0 = stackIn_3_0;
                        stackIn_3_1 = -1;
                        stackIn_8_1 = stackIn_3_1;
                        if (var9 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 == stackIn_8_1) {
                            statePc = 27;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var6 ^ -1) > -10) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var6 <= 32) {
                            statePc = 26;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var7 < 9) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-33 <= (var7 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((this.c(var4, 1 + var3_int, -65) & 65408) >> 1868421511 == 16) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5 = var5 | 67108864;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var8 = this.a(false, var3_int, var4);
                        var5 = var5 & -128;
                        if ((65408 & var8 ^ -1) != -1) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5 = var5 & -65409;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var5 = var5 | var8;
                        this.field_h[var3_int][var4] = var5;
                        var4++;
                        if (var9 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var3_int++;
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = param0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 >= 92) {
                            statePc = 43;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        on.a((byte) 51, (ib) null);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_41_0 = (RuntimeException) (var3);
                    stackIn_39_0 = stackIn_41_0;
                    stackIn_41_1 = new StringBuilder().append("on.T(").append(param0).append(',');
                    stackIn_39_1 = stackIn_41_1;
                    if (param1 == null) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_42_0 = (RuntimeException) ((Object) stackIn_39_0);
                    stackIn_42_1 = (StringBuilder) ((Object) stackIn_39_1);
                    stackIn_42_2 = "{...}";
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
                    stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                    stackIn_42_2 = "null";
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    throw sh.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
                }
                case 43: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int c(byte param0, int param1, int param2) {
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 41) {
                break L1;
              } else {
                this.a(-47, false);
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = 511 & this.a(param2, param1, 1) >> -480426201;
                if (8 == this.field_a) {
                  break L3;
                } else {
                  if ((this.field_a ^ -1) == -8) {
                    break L3;
                  } else {
                    if ((this.field_a ^ -1) == -6) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (param2 < 0) {
                stackIn_16_0 = -1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (-1 < (param1 ^ -1)) {
                  stackIn_21_0 = -1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if ((this.field_f.length ^ -1) < (param1 ^ -1)) {
                    if (this.field_f[0].length <= param2) {
                      stackIn_29_0 = -1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L4: {
                        var5 = 511 & this.field_h[param1][param2] >> 1604294119;
                        if (0 < var5) {
                          var4_int = var5;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (73 > var4_int) {
                          break L5;
                        } else {
                          if (-101 <= (var4_int ^ -1)) {
                            stackIn_41_0 = 1;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (this.field_a == 8) {
                          break L6;
                        } else {
                          if ((this.field_a ^ -1) != -8) {
                            break L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (var4_int < 145) {
                          break L7;
                        } else {
                          if (var4_int <= 173) {
                            stackIn_55_0 = 2;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (217 > var4_int) {
                        break L2;
                      } else {
                        if (-247 <= (var4_int ^ -1)) {
                          stackIn_63_0 = 3;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    stackIn_24_0 = -1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
            if (var4_int > 64) {
              stackIn_68_0 = -1;
              decompiledRegionSelector0 = 8;
              break L0;
            } else {
              stackIn_66_0 = 0;
              decompiledRegionSelector0 = 7;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_24_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_41_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_55_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_63_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_66_0;
                      } else {
                        return stackIn_68_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -1777127001) {
                break L1;
              } else {
                discarded$1 = this.c((byte) 82, 60, -52);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((33554432 & this.a(param0, param1, 1) ^ -1) == -1) {
                  break L3;
                } else {
                  if ((this.a(param0, param1, 1) >> -1777127001 & 511) <= 64) {
                    stackIn_10_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_10_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static boolean a(byte param0, String param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (cj.a((byte) 15, param1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!tb.a(-10723, param1)) {
                if (!tk.a((byte) 84, param1)) {
                  if (-1 != (param2.length() ^ -1)) {
                    if (param0 <= -7) {
                      if (lf.a(param2, param1, -7235)) {
                        stackIn_21_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!ic.a(param1, param2, 0)) {
                          if (t.a(param1, (byte) 125, param2)) {
                            stackIn_29_0 = 0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            stackIn_31_0 = 1;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          }
                        } else {
                          stackIn_24_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("on.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L1;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');

            if (param2 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L2;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_36_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0 != 0;
                      } else {
                        return stackIn_31_0 != 0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((33554432 & this.a(param1, param2, 1) ^ -1) != -1) {
              L1: {
                if (param0 < -78) {
                  break L1;
                } else {
                  discarded$1 = this.c((byte) 79, -18, -85);
                  break L1;
                }
              }
              L2: {
                if ((this.c((byte) 41, param2, param1) ^ -1) != 0) {
                  stackIn_10_0 = 0;
                  break L2;
                } else {
                  stackIn_10_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static boolean b(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        Throwable var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var1_ref = ea.field_c;
            synchronized (var1_ref) {
              L1: {
                var2 = -66 / ((param0 - 42) / 59);
                if ((wb.field_y ^ -1) != (he.field_e ^ -1)) {
                  kg.field_i = vd.field_b[he.field_e];
                  lc.field_c = gg.field_a[he.field_e];
                  he.field_e = he.field_e - -1 & 127;
                  stackIn_5_0 = 1;
                  break L1;
                } else {
                  stackIn_3_0 = 0;
                  return stackIn_3_0 != 0;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref2), "on.A(" + param0 + ')');
        }
        return stackIn_5_0 != 0;
    }

    private final boolean d(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                on.a((byte) 71, (String) null, (String) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.b(param0, param2 + 1, -1777127001)) {
                  break L3;
                } else {
                  if (this.b(param0, param2 - -2, -1777127001)) {
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final int a(boolean param0, int param1, int param2) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        int discarded$2 = 0;
        int discarded$3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_423_0 = 0;
        int stackIn_427_0 = 0;
        int stackIn_431_0 = 0;
        int stackIn_435_0 = 0;
        int stackIn_540_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ZombieDawn.field_J;
        try {
          L0: {
            if (!param0) {
              L1: {
                L2: {
                  var4_int = this.a(param2, param1, 1) & 127;
                  var5 = this.a(param2, param1, 1) & 65408;
                  if ((this.field_a ^ -1) != -7) {
                    break L2;
                  } else {
                    L3: {
                      if ((127 & this.a(param2 - 1, param1 + -1, 1)) != 1) {
                        stackIn_11_0 = 0;
                        break L3;
                      } else {
                        stackIn_11_0 = 1;
                        break L3;
                      }
                    }
                    L4: {
                      var6 = stackIn_11_0;
                      if ((this.a(param2 + 1, param1 + -1, 1) & 127) != 1) {
                        stackIn_15_0 = 0;
                        break L4;
                      } else {
                        stackIn_15_0 = 1;
                        break L4;
                      }
                    }
                    L5: {
                      var7_int = stackIn_15_0;
                      if (-2 != (127 & this.a(1 + param2, 1 + param1, 1) ^ -1)) {
                        stackIn_19_0 = 0;
                        break L5;
                      } else {
                        stackIn_19_0 = 1;
                        break L5;
                      }
                    }
                    L6: {
                      var8_int = stackIn_19_0;
                      if ((127 & this.a(-1 + param2, 1 + param1, 1) ^ -1) != -2) {
                        stackIn_23_0 = 0;
                        break L6;
                      } else {
                        stackIn_23_0 = 1;
                        break L6;
                      }
                    }
                    L7: {
                      var9 = stackIn_23_0;
                      if ((127 & this.a(param2, -1 + param1, 1)) != 1) {
                        stackIn_27_0 = 0;
                        break L7;
                      } else {
                        stackIn_27_0 = 1;
                        break L7;
                      }
                    }
                    L8: {
                      var10 = stackIn_27_0;
                      if ((this.a(param2 - -1, param1, 1) & 127) != 1) {
                        stackIn_31_0 = 0;
                        break L8;
                      } else {
                        stackIn_31_0 = 1;
                        break L8;
                      }
                    }
                    L9: {
                      var11 = stackIn_31_0;
                      if (1 != (127 & this.a(param2, param1 - -1, 1))) {
                        stackIn_35_0 = 0;
                        break L9;
                      } else {
                        stackIn_35_0 = 1;
                        break L9;
                      }
                    }
                    L10: {
                      var12 = stackIn_35_0;
                      if (-2 != (127 & this.a(-1 + param2, param1, 1) ^ -1)) {
                        stackIn_39_0 = 0;
                        break L10;
                      } else {
                        stackIn_39_0 = 1;
                        break L10;
                      }
                    }
                    L11: {
                      L12: {
                        var13 = stackIn_39_0;
                        if ((var4_int ^ -1) != -1) {
                          break L12;
                        } else {
                          L13: {
                            L14: {
                              if (var10 == 0) {
                                break L14;
                              } else {
                                if (var12 != 0) {
                                  break L14;
                                } else {
                                  if (var13 != 0) {
                                    break L14;
                                  } else {
                                    if (var11 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                            L15: {
                              if (var10 != 0) {
                                break L15;
                              } else {
                                if (var12 == 0) {
                                  break L15;
                                } else {
                                  if (var13 != 0) {
                                    break L15;
                                  } else {
                                    if (var11 != 0) {
                                      break L15;
                                    } else {
                                      var4_int = 41;
                                      if (var14 == 0) {
                                        break L11;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L16: {
                              if (var10 != 0) {
                                break L16;
                              } else {
                                if (var12 != 0) {
                                  break L16;
                                } else {
                                  if (var13 == 0) {
                                    break L16;
                                  } else {
                                    if (var11 != 0) {
                                      break L16;
                                    } else {
                                      var4_int = 32;
                                      if (var14 == 0) {
                                        break L11;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L17: {
                              if (var10 != 0) {
                                break L17;
                              } else {
                                if (var12 != 0) {
                                  break L17;
                                } else {
                                  if (var13 != 0) {
                                    break L17;
                                  } else {
                                    if (var11 == 0) {
                                      break L17;
                                    } else {
                                      var4_int = 34;
                                      if (var14 == 0) {
                                        break L11;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L18: {
                              L19: {
                                if (var10 != 0) {
                                  break L19;
                                } else {
                                  if (var12 == 0) {
                                    break L19;
                                  } else {
                                    if (var13 != 0) {
                                      break L19;
                                    } else {
                                      if (var11 != 0) {
                                        break L18;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                }
                              }
                              L20: {
                                if (var10 == 0) {
                                  break L20;
                                } else {
                                  if (var12 != 0) {
                                    break L20;
                                  } else {
                                    if (var13 != 0) {
                                      break L20;
                                    } else {
                                      if (var11 == 0) {
                                        break L20;
                                      } else {
                                        var4_int = 26;
                                        if (var14 == 0) {
                                          break L11;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L21: {
                                L22: {
                                  if (var10 != 0) {
                                    break L22;
                                  } else {
                                    if (var12 == 0) {
                                      break L22;
                                    } else {
                                      if (var13 == 0) {
                                        break L22;
                                      } else {
                                        if (var11 == 0) {
                                          break L21;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                  }
                                }
                                L23: {
                                  L24: {
                                    if (var10 == 0) {
                                      break L24;
                                    } else {
                                      if (var12 != 0) {
                                        break L24;
                                      } else {
                                        if (var13 == 0) {
                                          break L24;
                                        } else {
                                          if (var11 == 0) {
                                            break L23;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L25: {
                                    if (var10 == 0) {
                                      break L25;
                                    } else {
                                      if (var12 == 0) {
                                        break L25;
                                      } else {
                                        if (var13 != 0) {
                                          break L25;
                                        } else {
                                          if (var11 == 0) {
                                            break L25;
                                          } else {
                                            var4_int = 31;
                                            if (var14 == 0) {
                                              break L11;
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L26: {
                                    L27: {
                                      if (var10 == 0) {
                                        break L27;
                                      } else {
                                        if (var12 != 0) {
                                          break L27;
                                        } else {
                                          if (var13 == 0) {
                                            break L27;
                                          } else {
                                            if (var11 != 0) {
                                              break L26;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L28: {
                                      if (var10 == 0) {
                                        break L28;
                                      } else {
                                        if (var12 == 0) {
                                          break L28;
                                        } else {
                                          if (var13 == 0) {
                                            break L28;
                                          } else {
                                            if (var11 != 0) {
                                              break L28;
                                            } else {
                                              var4_int = 39;
                                              if (var14 == 0) {
                                                break L11;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L29: {
                                      if (var10 != 0) {
                                        break L29;
                                      } else {
                                        if (var12 == 0) {
                                          break L29;
                                        } else {
                                          if (var13 == 0) {
                                            break L29;
                                          } else {
                                            if (var11 == 0) {
                                              break L29;
                                            } else {
                                              var4_int = 38;
                                              if (var14 == 0) {
                                                break L11;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L30: {
                                      L31: {
                                        if (var10 == 0) {
                                          break L31;
                                        } else {
                                          if (var12 == 0) {
                                            break L31;
                                          } else {
                                            if (var13 != 0) {
                                              break L31;
                                            } else {
                                              if (var11 == 0) {
                                                break L30;
                                              } else {
                                                break L31;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L32: {
                                        L33: {
                                          if (var10 != 0) {
                                            break L33;
                                          } else {
                                            if (var12 != 0) {
                                              break L33;
                                            } else {
                                              if (var13 == 0) {
                                                break L33;
                                              } else {
                                                if (var11 != 0) {
                                                  break L32;
                                                } else {
                                                  break L33;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (var10 != 0) {
                                          break L11;
                                        } else {
                                          if (var12 != 0) {
                                            break L11;
                                          } else {
                                            if (var13 != 0) {
                                              break L11;
                                            } else {
                                              if (var11 != 0) {
                                                break L11;
                                              } else {
                                                L34: {
                                                  if (var6 != 0) {
                                                    break L34;
                                                  } else {
                                                    L35: {
                                                      if (var7_int == 0) {
                                                        break L35;
                                                      } else {
                                                        var4_int = 43;
                                                        if (var14 == 0) {
                                                          break L11;
                                                        } else {
                                                          break L35;
                                                        }
                                                      }
                                                    }
                                                    L36: {
                                                      if (var8_int != 0) {
                                                        break L36;
                                                      } else {
                                                        if (var9 != 0) {
                                                          var4_int = 29;
                                                          if (var14 == 0) {
                                                            break L11;
                                                          } else {
                                                            break L36;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    var4_int = 27;
                                                    if (var14 == 0) {
                                                      break L11;
                                                    } else {
                                                      break L34;
                                                    }
                                                  }
                                                }
                                                var4_int = 45;
                                                if (var14 == 0) {
                                                  break L11;
                                                } else {
                                                  break L32;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var4_int = 46;
                                      if (var14 == 0) {
                                        break L11;
                                      } else {
                                        break L30;
                                      }
                                    }
                                    var4_int = 47;
                                    if (var14 == 0) {
                                      break L11;
                                    } else {
                                      break L26;
                                    }
                                  }
                                  var4_int = 30;
                                  if (var14 == 0) {
                                    break L11;
                                  } else {
                                    break L23;
                                  }
                                }
                                var4_int = 24;
                                if (var14 == 0) {
                                  break L11;
                                } else {
                                  break L21;
                                }
                              }
                              var4_int = 40;
                              if (var14 == 0) {
                                break L11;
                              } else {
                                break L18;
                              }
                            }
                            var4_int = 42;
                            if (var14 == 0) {
                              break L11;
                            } else {
                              break L13;
                            }
                          }
                          var4_int = 25;
                          if (var14 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L37: {
                        if (-49 >= (var4_int ^ -1)) {
                          break L37;
                        } else {
                          if (8 != var4_int) {
                            break L11;
                          } else {
                            break L37;
                          }
                        }
                      }
                      if ((var5 ^ -1) != -1) {
                        break L11;
                      } else {
                        L38: {
                          L39: {
                            L40: {
                              var5 = 334;
                              if (var10 == 0) {
                                break L40;
                              } else {
                                if (var12 != 0) {
                                  break L40;
                                } else {
                                  if (var13 != 0) {
                                    break L40;
                                  } else {
                                    if (var11 == 0) {
                                      break L39;
                                    } else {
                                      break L40;
                                    }
                                  }
                                }
                              }
                            }
                            L41: {
                              L42: {
                                if (var10 != 0) {
                                  break L42;
                                } else {
                                  if (var12 == 0) {
                                    break L42;
                                  } else {
                                    if (var13 != 0) {
                                      break L42;
                                    } else {
                                      if (var11 == 0) {
                                        break L41;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                }
                              }
                              L43: {
                                L44: {
                                  if (var10 != 0) {
                                    break L44;
                                  } else {
                                    if (var12 != 0) {
                                      break L44;
                                    } else {
                                      if (var13 == 0) {
                                        break L44;
                                      } else {
                                        if (var11 == 0) {
                                          break L43;
                                        } else {
                                          break L44;
                                        }
                                      }
                                    }
                                  }
                                }
                                L45: {
                                  L46: {
                                    if (var10 != 0) {
                                      break L46;
                                    } else {
                                      if (var12 != 0) {
                                        break L46;
                                      } else {
                                        if (var13 != 0) {
                                          break L46;
                                        } else {
                                          if (var11 != 0) {
                                            break L45;
                                          } else {
                                            break L46;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L47: {
                                    if (var10 != 0) {
                                      break L47;
                                    } else {
                                      if (var12 == 0) {
                                        break L47;
                                      } else {
                                        if (var13 != 0) {
                                          break L47;
                                        } else {
                                          if (var11 == 0) {
                                            break L47;
                                          } else {
                                            var5 += 42;
                                            if (var14 == 0) {
                                              break L38;
                                            } else {
                                              break L47;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L48: {
                                    if (var10 == 0) {
                                      break L48;
                                    } else {
                                      if (var12 != 0) {
                                        break L48;
                                      } else {
                                        if (var13 != 0) {
                                          break L48;
                                        } else {
                                          if (var11 == 0) {
                                            break L48;
                                          } else {
                                            var5 += 26;
                                            if (var14 == 0) {
                                              break L38;
                                            } else {
                                              break L48;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L49: {
                                    if (var10 != 0) {
                                      break L49;
                                    } else {
                                      if (var12 == 0) {
                                        break L49;
                                      } else {
                                        if (var13 == 0) {
                                          break L49;
                                        } else {
                                          if (var11 != 0) {
                                            break L49;
                                          } else {
                                            var5 += 40;
                                            if (var14 == 0) {
                                              break L38;
                                            } else {
                                              break L49;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L50: {
                                    if (var10 == 0) {
                                      break L50;
                                    } else {
                                      if (var12 != 0) {
                                        break L50;
                                      } else {
                                        if (var13 == 0) {
                                          break L50;
                                        } else {
                                          if (var11 != 0) {
                                            break L50;
                                          } else {
                                            var5 += 24;
                                            if (var14 == 0) {
                                              break L38;
                                            } else {
                                              break L50;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var10 != 0) {
                                    break L38;
                                  } else {
                                    if (var12 != 0) {
                                      break L38;
                                    } else {
                                      if (var13 != 0) {
                                        break L38;
                                      } else {
                                        if (var11 == 0) {
                                          L51: {
                                            if (var6 == 0) {
                                              break L51;
                                            } else {
                                              var5 = 437;
                                              if (var14 == 0) {
                                                break L38;
                                              } else {
                                                break L51;
                                              }
                                            }
                                          }
                                          L52: {
                                            if (var7_int == 0) {
                                              break L52;
                                            } else {
                                              var5 = 436;
                                              if (var14 == 0) {
                                                break L38;
                                              } else {
                                                break L52;
                                              }
                                            }
                                          }
                                          L53: {
                                            if (var8_int == 0) {
                                              break L53;
                                            } else {
                                              var4_int = 428;
                                              if (var14 == 0) {
                                                break L38;
                                              } else {
                                                break L53;
                                              }
                                            }
                                          }
                                          if (var9 != 0) {
                                            var4_int = 429;
                                            if (var14 == 0) {
                                              break L38;
                                            } else {
                                              break L45;
                                            }
                                          } else {
                                            break L38;
                                          }
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                  }
                                }
                                var5 += 34;
                                if (var14 == 0) {
                                  break L38;
                                } else {
                                  break L43;
                                }
                              }
                              var5 += 32;
                              if (var14 == 0) {
                                break L38;
                              } else {
                                break L41;
                              }
                            }
                            var5 += 41;
                            if (var14 == 0) {
                              break L38;
                            } else {
                              break L39;
                            }
                          }
                          var5 += 25;
                          break L38;
                        }
                        if (-335 == (var5 ^ -1)) {
                          break L11;
                        } else {
                          var4_int = var5 << 1026802503 | -65409 & var4_int;
                          break L11;
                        }
                      }
                    }
                    if (var14 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (8 == this.field_a) {
                  if (-56 == (var4_int ^ -1)) {
                    L54: {
                      var6 = 55;
                      var7 = new int[]{52, 43, 57, 59};
                      var8 = new int[]{51, 35, 58, 56};
                      if (var6 == (127 & this.a(param2, param1 + -1, 1))) {
                        stackIn_423_0 = 0;
                        break L54;
                      } else {
                        stackIn_423_0 = 1;
                        break L54;
                      }
                    }
                    L55: {
                      var9 = stackIn_423_0;
                      if ((this.a(1 + param2, param1, 1) & 127 ^ -1) == (var6 ^ -1)) {
                        stackIn_427_0 = 0;
                        break L55;
                      } else {
                        stackIn_427_0 = 1;
                        break L55;
                      }
                    }
                    L56: {
                      var10 = stackIn_427_0;
                      if ((var6 ^ -1) == (this.a(param2, param1 + 1, 1) & 127 ^ -1)) {
                        stackIn_431_0 = 0;
                        break L56;
                      } else {
                        stackIn_431_0 = 1;
                        break L56;
                      }
                    }
                    L57: {
                      var11 = stackIn_431_0;
                      if (var6 == (127 & this.a(param2 - 1, param1, 1))) {
                        stackIn_435_0 = 0;
                        break L57;
                      } else {
                        stackIn_435_0 = 1;
                        break L57;
                      }
                    }
                    L58: {
                      var12 = stackIn_435_0;
                      discarded$0 = this.a(param2 + -1, -1 + param1, 1);
                      discarded$1 = this.a(param2 - -1, param1 + -1, 1);
                      discarded$2 = this.a(1 + param2, param1 + 1, 1);
                      discarded$3 = this.a(-1 + param2, 1 + param1, 1);
                      if (var9 == 0) {
                        break L58;
                      } else {
                        if (var11 != 0) {
                          break L58;
                        } else {
                          if (var12 != 0) {
                            break L58;
                          } else {
                            if (var10 != 0) {
                              break L58;
                            } else {
                              var4_int = var7[0];
                              if (var14 == 0) {
                                break L1;
                              } else {
                                break L58;
                              }
                            }
                          }
                        }
                      }
                    }
                    L59: {
                      L60: {
                        if (var9 != 0) {
                          break L60;
                        } else {
                          if (var11 == 0) {
                            break L60;
                          } else {
                            if (var12 != 0) {
                              break L60;
                            } else {
                              if (var10 == 0) {
                                break L59;
                              } else {
                                break L60;
                              }
                            }
                          }
                        }
                      }
                      L61: {
                        L62: {
                          if (var9 != 0) {
                            break L62;
                          } else {
                            if (var11 != 0) {
                              break L62;
                            } else {
                              if (var12 == 0) {
                                break L62;
                              } else {
                                if (var10 == 0) {
                                  break L61;
                                } else {
                                  break L62;
                                }
                              }
                            }
                          }
                        }
                        L63: {
                          L64: {
                            if (var9 != 0) {
                              break L64;
                            } else {
                              if (var11 != 0) {
                                break L64;
                              } else {
                                if (var12 != 0) {
                                  break L64;
                                } else {
                                  if (var10 != 0) {
                                    break L63;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                            }
                          }
                          L65: {
                            if (var9 == 0) {
                              break L65;
                            } else {
                              if (var11 != 0) {
                                break L65;
                              } else {
                                if (var12 == 0) {
                                  break L65;
                                } else {
                                  if (var10 != 0) {
                                    break L65;
                                  } else {
                                    var4_int = var8[0];
                                    if (var14 == 0) {
                                      break L1;
                                    } else {
                                      break L65;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L66: {
                            L67: {
                              if (var9 != 0) {
                                break L67;
                              } else {
                                if (var11 == 0) {
                                  break L67;
                                } else {
                                  if (var12 == 0) {
                                    break L67;
                                  } else {
                                    if (var10 == 0) {
                                      break L66;
                                    } else {
                                      break L67;
                                    }
                                  }
                                }
                              }
                            }
                            L68: {
                              if (var9 != 0) {
                                break L68;
                              } else {
                                if (var11 == 0) {
                                  break L68;
                                } else {
                                  if (var12 != 0) {
                                    break L68;
                                  } else {
                                    if (var10 == 0) {
                                      break L68;
                                    } else {
                                      var4_int = var8[2];
                                      if (var14 == 0) {
                                        break L1;
                                      } else {
                                        break L68;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (var9 == 0) {
                              break L1;
                            } else {
                              if (var11 != 0) {
                                break L1;
                              } else {
                                if (var12 != 0) {
                                  break L1;
                                } else {
                                  if (var10 != 0) {
                                    var4_int = var8[1];
                                    if (var14 == 0) {
                                      break L1;
                                    } else {
                                      break L66;
                                    }
                                  } else {
                                    break L1;
                                  }
                                }
                              }
                            }
                          }
                          var4_int = var8[3];
                          if (var14 == 0) {
                            break L1;
                          } else {
                            break L63;
                          }
                        }
                        var4_int = var7[1];
                        if (var14 == 0) {
                          break L1;
                        } else {
                          break L61;
                        }
                      }
                      var4_int = var7[3];
                      if (var14 == 0) {
                        break L1;
                      } else {
                        break L59;
                      }
                    }
                    var4_int = var7[2];
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              stackIn_540_0 = var4_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 34;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_540_0;
        }
    }

    final static void a(byte param0, ib param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            cf.field_eb.insertElementAt(param1, 0);
            var2_int = -29 / ((param0 - -47) / 44);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("on.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final vo b(byte param0) {
        vo var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        vo stackIn_7_0 = null;
        vo stackIn_11_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 106) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_i = (java.awt.Image) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = new vo();
                        var3 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3 >= this.field_l.length) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = this.field_l[var3];
                        var5 = this.field_l[var3 + 1];
                        var6 = this.field_l[2 + var3];
                        var7 = this.field_l[3 + var3];
                        stackIn_11_0 = (vo) (var2);
                        stackIn_7_0 = stackIn_11_0;
                        if (var8 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((vo) (Object) stackIn_7_0).a(0, this.a(var6, var7, var5, var4, 1));
                        var3 += 4;
                        if (var8 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = (vo) (var2);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw sh.a((Throwable) ((Object) var2_ref), "on.G(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          L0: {
            var3_int = -34 % ((30 - param1) / 39);
            stackIn_1_0 = param0 << -1976960889;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "on.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param0 + param2;
                        var6 = param4 + param1;
                        if (bi.field_g >= param2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = param2;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = bi.field_g;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7 = stackIn_5_0;
                        if (bi.field_l >= param4) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_9_0 = param4;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = bi.field_l;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = stackIn_9_0;
                        if (var5_int < bi.field_b) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_13_0 = bi.field_b;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = var5_int;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = stackIn_13_0;
                        if ((var6 ^ -1) > (bi.field_d ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_17_0 = bi.field_d;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = var6;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var10 = stackIn_17_0;
                        if ((param2 ^ -1) > (bi.field_g ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param2 < bi.field_b) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var11 = var8 * bi.field_f + param2;
                        var12 = var10 + 1 + -var8 >> 1896876385;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var12--;
                        if (var12 < 0) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        bi.field_c[var11] = 16777215;
                        var11 = var11 + bi.field_f * 2;
                        if (var13 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var13 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (bi.field_l > param4) {
                            statePc = 39;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((bi.field_d ^ -1) >= (var6 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var11 = var7 + param4 * bi.field_f;
                        var12 = -var7 + (1 - -var9) >> 511509825;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var12--;
                        if (0 > var12) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        bi.field_c[var11] = 16777215;
                        var11 += 2;
                        if (var13 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var13 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (param3 > 21) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        on.a((byte) 52, (ib) null);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var5_int < bi.field_g) {
                            statePc = 54;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((bi.field_b ^ -1) < (var5_int ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var11 = bi.field_f * ((1 & -param2 + var5_int) + var8) - -var5_int;
                        var12 = var10 + (1 - var8) >> 798750145;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        bi.field_c[var11] = 16777215;
                        var11 = var11 + 2 * bi.field_f;
                        if (var13 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var13 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (bi.field_l > param4) {
                            statePc = 68;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((bi.field_d ^ -1) < (var6 ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var11 = (1 & -param4 + var6) + var7 + bi.field_f * var6;
                        var12 = 1 - (-var9 + var7) >> 1787966977;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        bi.field_c[var11] = 16777215;
                        var11 += 2;
                        if (var13 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var13 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw sh.a((Throwable) ((Object) var5), "on.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 68: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                break L1;
              } else {
                if ((param0 ^ -1) <= (this.field_f[0].length ^ -1)) {
                  break L1;
                } else {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (param1 >= this.field_f.length) {
                      break L1;
                    } else {
                      if (param2 == 1) {
                        stackIn_18_0 = this.field_f[param1][param0];
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        stackIn_16_0 = 32;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackIn_13_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    final void a(boolean param0, int param1, int param2, boolean param3, int param4) {
        boolean discarded$0 = false;
        int[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int[] stackIn_29_0;
        int stackIn_29_1;
        int stackIn_29_2;
        int stackIn_29_3;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this.field_p[param2];

              stackIn_3_1 = param4;

              if (param0) {
                stackIn_4_0 = (int[]) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 1;
                break L1;
              } else {
                stackIn_4_0 = (int[]) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 0;
                break L1;
              }
            }
            L2: {
              stackIn_4_0[stackIn_4_1] = hi.a(stackIn_4_2, eg.a(14, this.field_p[param2][param4]));
              if (param1 == 14365) {
                break L2;
              } else {
                discarded$0 = this.a((byte) 91, 88, -54);
                break L2;
              }
            }
            L3: {
              if (!param3) {
                L4: {
                  stackIn_13_0 = this.field_t[param2];

                  stackIn_13_1 = param4;

                  if (!param0) {
                    stackIn_14_0 = (int[]) ((Object) stackIn_13_0);
                    stackIn_14_1 = stackIn_13_1;
                    stackIn_14_2 = 0;
                    break L4;
                  } else {
                    stackIn_14_0 = (int[]) ((Object) stackIn_13_0);
                    stackIn_14_1 = stackIn_13_1;
                    stackIn_14_2 = 1;
                    break L4;
                  }
                }
                stackIn_14_0[stackIn_14_1] = hi.a(stackIn_14_2, eg.a(14, this.field_t[param2][param4]));
                break L3;
              } else {
                break L3;
              }
            }
            L5: {
              if ((this.field_p[param2].length ^ -1) < (1 + param4 ^ -1)) {
                L6: {
                  stackIn_21_0 = this.field_p[param2];

                  stackIn_21_1 = 1 + param4;

                  stackIn_21_2 = eg.a(-3, this.field_p[param2][param4 - -1]);

                  if (!param0) {
                    stackIn_22_0 = (int[]) ((Object) stackIn_21_0);
                    stackIn_22_1 = stackIn_21_1;
                    stackIn_22_2 = stackIn_21_2;
                    stackIn_22_3 = 0;
                    break L6;
                  } else {
                    stackIn_22_0 = (int[]) ((Object) stackIn_21_0);
                    stackIn_22_1 = stackIn_21_1;
                    stackIn_22_2 = stackIn_21_2;
                    stackIn_22_3 = 2;
                    break L6;
                  }
                }
                stackIn_22_0[stackIn_22_1] = hi.a(stackIn_22_2, stackIn_22_3);
                if (param3) {
                  break L5;
                } else {
                  L7: {
                    stackIn_28_0 = this.field_t[param2];

                    stackIn_28_1 = param4 - -1;

                    stackIn_28_2 = eg.a(this.field_t[param2][1 + param4], -3);

                    if (!param0) {
                      stackIn_29_0 = (int[]) ((Object) stackIn_28_0);
                      stackIn_29_1 = stackIn_28_1;
                      stackIn_29_2 = stackIn_28_2;
                      stackIn_29_3 = 0;
                      break L7;
                    } else {



                      stackIn_29_0 = (int[]) ((Object) stackIn_28_0);
                      stackIn_29_1 = stackIn_28_1;
                      stackIn_29_2 = stackIn_28_2;
                      stackIn_29_3 = 2;
                      break L7;
                    }
                  }
                  stackIn_29_0[stackIn_29_1] = hi.a(stackIn_29_2, stackIn_29_3);
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L8: {
              if (param4 - 1 <= 0) {
                break L8;
              } else {
                L9: {
                  stackIn_36_0 = this.field_p[param2];

                  stackIn_36_1 = -1 + param4;

                  if (param0) {
                    stackIn_37_0 = (int[]) ((Object) stackIn_36_0);
                    stackIn_37_1 = stackIn_36_1;
                    stackIn_37_2 = 4;
                    break L9;
                  } else {


                    stackIn_37_0 = (int[]) ((Object) stackIn_36_0);
                    stackIn_37_1 = stackIn_36_1;
                    stackIn_37_2 = 0;
                    break L9;
                  }
                }
                stackIn_37_0[stackIn_37_1] = hi.a(stackIn_37_2, eg.a(-5, this.field_p[param2][-1 + param4]));
                if (param3) {
                  break L8;
                } else {
                  L10: {
                    stackIn_43_0 = this.field_t[param2];

                    stackIn_43_1 = param4 - 1;

                    if (param0) {
                      stackIn_44_0 = (int[]) ((Object) stackIn_43_0);
                      stackIn_44_1 = stackIn_43_1;
                      stackIn_44_2 = 4;
                      break L10;
                    } else {


                      stackIn_44_0 = (int[]) ((Object) stackIn_43_0);
                      stackIn_44_1 = stackIn_43_1;
                      stackIn_44_2 = 0;
                      break L10;
                    }
                  }
                  stackIn_44_0[stackIn_44_1] = hi.a(stackIn_44_2, eg.a(-5, this.field_t[param2][-1 + param4]));
                  break L8;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var6), "on.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    on(int[][] param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8, boolean param9) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        this.field_d = false;
        try {
          L0: {
            this.field_l = param1;
            this.field_a = param2;
            this.field_b = param5;
            this.field_c = param7;
            this.field_s = param3;
            this.field_o = param8;
            this.field_f = param0;
            this.field_m = param6;
            this.field_j = param4;
            this.field_h = new int[param0.length][param0[0].length];
            this.field_p = new int[param0.length][param0[0].length];
            this.field_t = new int[param0.length][param0[0].length];
            this.field_d = param9;
            this.a(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var11);

            stackIn_6_1 = new StringBuilder().append("on.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    private final int b(byte param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_325_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var4_int = this.a(param1, param2, 1);
              var4_int = var4_int & -67108865;
              var5 = var4_int >> -739042233 & 511;
              if (0 == (33554432 & var4_int)) {
                break L1;
              } else {
                if (-1 == (var5 ^ -1)) {
                  var4_int = var4_int & -65409;
                  if (this.field_a == 6) {
                    var4_int = var4_int | this.a(511, -66);
                    stackIn_11_0 = var4_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      L3: {
                        if (this.a((byte) -92, 1 + param1, param2)) {
                          break L3;
                        } else {
                          if (this.a(1 + param1, true, param2)) {
                            break L3;
                          } else {
                            stackIn_19_0 = 1;
                            break L2;
                          }
                        }
                      }
                      stackIn_19_0 = 0;
                      break L2;
                    }
                    L4: {
                      L5: {
                        var6 = stackIn_19_0;
                        var7 = this.a((byte) -116, param1, param2 + 3) ? 1 : 0;
                        var8 = this.a((byte) -109, param1, param2 + -1) ? 1 : 0;
                        if (this.a((byte) -113, param1 + -1, param2)) {
                          break L5;
                        } else {
                          if (this.a(param1 - 1, true, param2)) {
                            stackIn_26_0 = 0;
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      stackIn_26_0 = 1;
                      break L4;
                    }
                    var9 = stackIn_26_0;
                    if (param0 == -61) {
                      L6: {
                        L7: {
                          var10 = this.a((byte) -128, param1 - -1, param2) ? 1 : 0;
                          var11 = 0;
                          if (var9 != 0) {
                            break L7;
                          } else {
                            var11 = this.c((byte) 41, param2, -1 + param1) * 72;
                            if (var13 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (var8 != 0) {
                          break L6;
                        } else {
                          var11 = 72 * this.c((byte) 41, param2 + -1, param1);
                          break L6;
                        }
                      }
                      L8: {
                        L9: {
                          L10: {
                            if (!this.a(param1, true, param2)) {
                              break L10;
                            } else {
                              if (var6 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            if (!this.a(param1, true, param2)) {
                              break L11;
                            } else {
                              if (var6 == 0) {
                                break L11;
                              } else {
                                L12: {
                                  L13: {
                                    stackIn_51_0 = var10;

                                    if (this.a((byte) -94, 1 + param1, 2 + param2)) {
                                      break L13;
                                    } else {



                                      if (!this.a((byte) -98, param1 + 1, param2 + 1)) {
                                        stackIn_54_0 = stackIn_51_0;
                                        stackIn_54_1 = 0;
                                        break L12;
                                      } else {

                                        break L13;
                                      }
                                    }
                                  }
                                  stackIn_54_0 = stackIn_51_0;
                                  stackIn_54_1 = 1;
                                  break L12;
                                }
                                L14: {
                                  L15: {
                                    var10 = stackIn_54_0 | stackIn_54_1;
                                    stackIn_58_0 = var9;

                                    if (this.a((byte) -85, param1 - 1, 2 + param2)) {
                                      break L15;
                                    } else {


                                      if (!this.a((byte) -110, -1 + param1, param2 - -1)) {
                                        stackIn_61_0 = stackIn_58_0;
                                        stackIn_61_1 = 0;
                                        break L14;
                                      } else {

                                        break L15;
                                      }
                                    }
                                  }
                                  stackIn_61_0 = stackIn_58_0;
                                  stackIn_61_1 = 1;
                                  break L14;
                                }
                                L16: {
                                  var9 = stackIn_61_0 | stackIn_61_1;
                                  if (this.a((byte) -111, 1 + param1, param2 - -1)) {
                                    stackIn_65_0 = 128;
                                    break L16;
                                  } else {
                                    stackIn_65_0 = 0;
                                    break L16;
                                  }
                                }
                                L17: {
                                  var12 = stackIn_65_0;
                                  if (var7 != 0) {
                                    break L17;
                                  } else {
                                    if (var8 != 0) {
                                      break L17;
                                    } else {
                                      if (var9 == 0) {
                                        break L17;
                                      } else {
                                        if (var10 == 0) {
                                          break L17;
                                        } else {
                                          var4_int = var4_int | this.a(var11 + 26, 102) - var12;
                                          break L17;
                                        }
                                      }
                                    }
                                  }
                                }
                                L18: {
                                  if (var7 != 0) {
                                    break L18;
                                  } else {
                                    if (var8 != 0) {
                                      break L18;
                                    } else {
                                      if (var9 != 0) {
                                        break L18;
                                      } else {
                                        if (var10 != 0) {
                                          var4_int = var4_int | -var12 + this.a(28 + var11, 89);
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var13 == 0) {
                                  break L8;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          L19: {
                            if (this.a((byte) -95, param1, 1 + param2)) {
                              break L19;
                            } else {
                              if (!this.a((byte) -93, param1, param2 - -2)) {
                                break L8;
                              } else {
                                L20: {
                                  if (!this.a((byte) -122, param1 + 1, param2)) {
                                    break L20;
                                  } else {
                                    if (!this.a((byte) -119, param1 - 1, param2)) {
                                      break L20;
                                    } else {
                                      var4_int = var4_int | this.a(6 - -var11, -99);
                                      if (var13 == 0) {
                                        break L8;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                                L21: {
                                  if (!this.a((byte) -102, param1 + 1, param2)) {
                                    break L21;
                                  } else {
                                    var4_int = var4_int | this.a(var11 + 8, 91);
                                    if (var13 == 0) {
                                      break L8;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                L22: {
                                  if (!this.a((byte) -127, -1 + param1, param2)) {
                                    break L22;
                                  } else {
                                    var4_int = var4_int | this.a(4 + var11, -93);
                                    if (var13 == 0) {
                                      break L8;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                                var4_int = var4_int | this.a(var11 + 2, param0 + -8);
                                if (var13 == 0) {
                                  break L8;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                          L23: {
                            if (!this.a((byte) -128, param1 + 1, param2)) {
                              break L23;
                            } else {
                              if (!this.a((byte) -94, param1 + -1, param2)) {
                                break L23;
                              } else {
                                var4_int = var4_int | this.a(var11 + 5, 74);
                                if (var13 == 0) {
                                  break L8;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                          L24: {
                            if (this.a((byte) -79, 1 + param1, param2)) {
                              break L24;
                            } else {
                              L25: {
                                if (!this.a((byte) -96, param1 - 1, param2)) {
                                  break L25;
                                } else {
                                  var4_int = var4_int | this.a(var11 + 3, param0 + 165);
                                  if (var13 == 0) {
                                    break L8;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                              var4_int = var4_int | this.a(1 + var11, param0 ^ -113);
                              if (var13 == 0) {
                                break L8;
                              } else {
                                break L24;
                              }
                            }
                          }
                          var4_int = var4_int | this.a(var11 + 7, -75);
                          if (var13 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                        L26: {
                          if (var7 == 0) {
                            break L26;
                          } else {
                            if (var8 == 0) {
                              break L26;
                            } else {
                              if (var9 == 0) {
                                break L26;
                              } else {
                                if (var10 != 0) {
                                  var4_int = var4_int | this.a(var11 + 9, 84);
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                        }
                        L27: {
                          if (var7 == 0) {
                            break L27;
                          } else {
                            if (var8 == 0) {
                              break L27;
                            } else {
                              if (var9 == 0) {
                                break L27;
                              } else {
                                if (var10 != 0) {
                                  break L27;
                                } else {
                                  var4_int = var4_int | this.a(10 + var11, -11);
                                  break L27;
                                }
                              }
                            }
                          }
                        }
                        L28: {
                          if (var7 == 0) {
                            break L28;
                          } else {
                            if (var8 == 0) {
                              break L28;
                            } else {
                              if (var9 != 0) {
                                break L28;
                              } else {
                                if (var10 == 0) {
                                  break L28;
                                } else {
                                  var4_int = var4_int | this.a(11 + var11, 98);
                                  break L28;
                                }
                              }
                            }
                          }
                        }
                        L29: {
                          if (var7 == 0) {
                            break L29;
                          } else {
                            if (var8 == 0) {
                              break L29;
                            } else {
                              if (var9 != 0) {
                                break L29;
                              } else {
                                if (var10 == 0) {
                                  var4_int = var4_int | this.a(var11 + 18, param0 + 176);
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                            }
                          }
                        }
                        L30: {
                          if (var7 == 0) {
                            break L30;
                          } else {
                            if (var8 != 0) {
                              break L30;
                            } else {
                              if (var9 == 0) {
                                break L30;
                              } else {
                                if (var10 != 0) {
                                  var4_int = var4_int | this.a(12 - -var11, -30);
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                            }
                          }
                        }
                        L31: {
                          if (var7 == 0) {
                            break L31;
                          } else {
                            if (var8 != 0) {
                              break L31;
                            } else {
                              if (var9 == 0) {
                                break L31;
                              } else {
                                if (var10 != 0) {
                                  break L31;
                                } else {
                                  var4_int = var4_int | this.a(14 - -var11, -32);
                                  break L31;
                                }
                              }
                            }
                          }
                        }
                        L32: {
                          if (var7 == 0) {
                            break L32;
                          } else {
                            if (var8 != 0) {
                              break L32;
                            } else {
                              if (var9 != 0) {
                                break L32;
                              } else {
                                if (var10 != 0) {
                                  var4_int = var4_int | this.a(15 + var11, -12);
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                            }
                          }
                        }
                        L33: {
                          if (var7 == 0) {
                            break L33;
                          } else {
                            if (var8 != 0) {
                              break L33;
                            } else {
                              if (var9 != 0) {
                                break L33;
                              } else {
                                if (var10 != 0) {
                                  break L33;
                                } else {
                                  var4_int = var4_int | this.a(21 - -var11, -15);
                                  break L33;
                                }
                              }
                            }
                          }
                        }
                        L34: {
                          if (var7 != 0) {
                            break L34;
                          } else {
                            if (var8 == 0) {
                              break L34;
                            } else {
                              if (var9 == 0) {
                                break L34;
                              } else {
                                if (var10 != 0) {
                                  var4_int = var4_int | this.a(var11 + 13, 123);
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                            }
                          }
                        }
                        L35: {
                          if (var7 != 0) {
                            break L35;
                          } else {
                            if (var8 == 0) {
                              break L35;
                            } else {
                              if (var9 == 0) {
                                break L35;
                              } else {
                                if (var10 == 0) {
                                  var4_int = var4_int | this.a(16 + var11, 71);
                                  break L35;
                                } else {
                                  break L35;
                                }
                              }
                            }
                          }
                        }
                        L36: {
                          if (var7 != 0) {
                            break L36;
                          } else {
                            if (var8 == 0) {
                              break L36;
                            } else {
                              if (var9 != 0) {
                                break L36;
                              } else {
                                if (var10 == 0) {
                                  break L36;
                                } else {
                                  var4_int = var4_int | this.a(var11 + 17, param0 + 5);
                                  break L36;
                                }
                              }
                            }
                          }
                        }
                        L37: {
                          if (var7 != 0) {
                            break L37;
                          } else {
                            if (var8 == 0) {
                              break L37;
                            } else {
                              if (var9 != 0) {
                                break L37;
                              } else {
                                if (var10 != 0) {
                                  break L37;
                                } else {
                                  var4_int = var4_int | this.a(var11 + 20, 120);
                                  break L37;
                                }
                              }
                            }
                          }
                        }
                        L38: {
                          if (var7 != 0) {
                            break L38;
                          } else {
                            if (var8 != 0) {
                              break L38;
                            } else {
                              if (var9 == 0) {
                                break L38;
                              } else {
                                if (var10 == 0) {
                                  break L38;
                                } else {
                                  var4_int = var4_int | this.a(19 - -var11, 113);
                                  break L38;
                                }
                              }
                            }
                          }
                        }
                        L39: {
                          if (var7 != 0) {
                            break L39;
                          } else {
                            if (var8 != 0) {
                              break L39;
                            } else {
                              if (var9 == 0) {
                                break L39;
                              } else {
                                if (var10 == 0) {
                                  var4_int = var4_int | this.a(var11 + 22, -17);
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                            }
                          }
                        }
                        L40: {
                          if (var7 != 0) {
                            break L40;
                          } else {
                            if (var8 != 0) {
                              break L40;
                            } else {
                              if (var9 != 0) {
                                break L40;
                              } else {
                                if (var10 == 0) {
                                  break L40;
                                } else {
                                  var4_int = var4_int | this.a(23 + var11, -85);
                                  break L40;
                                }
                              }
                            }
                          }
                        }
                        if (var7 != 0) {
                          break L8;
                        } else {
                          if (var8 != 0) {
                            break L8;
                          } else {
                            if (var9 != 0) {
                              break L8;
                            } else {
                              if (var10 != 0) {
                                break L8;
                              } else {
                                var4_int = var4_int | this.a(24 - -var11, param0 + 148);
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      L41: {
                        if (-1 == (var4_int & 65408 ^ -1)) {
                          var4_int = var4_int | this.a(24 - -var11, 80);
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      stackIn_325_0 = var4_int;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_28_0 = 82;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_6_0 = var4_int;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_28_0;
            } else {
              return stackIn_325_0;
            }
          }
        }
    }

    static {
        field_n = "OK";
        field_g = new vo();
    }
}
