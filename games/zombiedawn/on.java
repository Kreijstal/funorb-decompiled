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
        Object stackIn_3_0 = null;
        va stackIn_17_0 = null;
        Object stackOut_2_0 = null;
        va stackOut_16_0 = null;
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
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = this;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!((on) this).field_e) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        ((on) this).field_e = false;
                        qk.n((byte) 96);
                        var3_int = param0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((on) this).field_h.length <= var3_int) {
                            statePc = 28;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var7 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((((on) this).field_h[0].length ^ -1) >= (var4 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = (127 & ((on) this).field_f[var3_int][var4]) >> 2083899776;
                        var6 = ub.a(127, var5);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var7 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = (va) var6;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 != null) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((on) this).field_h[var3_int][var4] = hi.a(eg.a(((on) this).field_h[var3_int][var4], -128), var6.field_g);
                        ((on) this).field_e = true;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var4++;
                        if (var7 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var3_int++;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw sh.a((Throwable) (Object) runtimeException, "on.N(" + param0 + 44 + param1 + 41);
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        try {
            this.a(((on) this).field_f, (byte) -39);
            this.a(108, ((on) this).field_f);
            ((on) this).field_k = ((on) this).field_f[param0].length;
            ((on) this).field_r = ((on) this).field_f.length;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "on.J(" + param0 + 41);
        }
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_g = null;
              field_n = null;
              if (param0 == 122) {
                break L0;
              } else {
                boolean discarded$2 = on.b(-118);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_i = null;
        }
    }

    private final int c(int param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_199_0 = 0;
        int stackIn_237_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_181_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        var13 = ZombieDawn.field_J;
        if (((on) this).field_d) {
          L0: {
            var4_int = this.a(param0, param1, 1);
            var4_int = var4_int & -67108865;
            var5 = (var4_int & 65408) >> 1832864999;
            if ((var4_int & 33554432) == 0) {
              break L0;
            } else {
              if (0 == var5) {
                L1: {
                  L2: {
                    var4_int = var4_int & -65409;
                    if (this.b(1 + param0, param1, -1777127001)) {
                      break L2;
                    } else {
                      if (this.d(1 + param0, 1, param1)) {
                        break L2;
                      } else {
                        stackOut_172_0 = 1;
                        stackIn_174_0 = stackOut_172_0;
                        break L1;
                      }
                    }
                  }
                  stackOut_173_0 = 0;
                  stackIn_174_0 = stackOut_173_0;
                  break L1;
                }
                var6 = stackIn_174_0;
                var7 = (this.a(param0, param1 - 1, 1) & 33488896) >> -712883376;
                var8 = this.b(param0, 3 + param1, -1777127001) ? 1 : 0;
                if (param2 <= -34) {
                  L3: {
                    L4: {
                      if (!this.b(param0, param1 + -1, -1777127001)) {
                        break L4;
                      } else {
                        L5: {
                          if (-1 == (var7 ^ -1)) {
                            break L5;
                          } else {
                            if (64 >= var7) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        stackOut_181_0 = 1;
                        stackIn_183_0 = stackOut_181_0;
                        break L3;
                      }
                    }
                    stackOut_182_0 = 0;
                    stackIn_183_0 = stackOut_182_0;
                    break L3;
                  }
                  L6: {
                    L7: {
                      L8: {
                        var9 = stackIn_183_0;
                        if (this.b(param0 + -1, param1, -1777127001)) {
                          break L8;
                        } else {
                          if (this.d(-1 + param0, 1, param1)) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (this.b(-1 + param0, param1 + 1, -1777127001)) {
                          break L9;
                        } else {
                          if (!this.b(param0 - 1, param1 - -2, -1777127001)) {
                            break L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                      stackOut_190_0 = 1;
                      stackIn_192_0 = stackOut_190_0;
                      break L6;
                    }
                    stackOut_191_0 = 0;
                    stackIn_192_0 = stackOut_191_0;
                    break L6;
                  }
                  L10: {
                    L11: {
                      var10 = stackIn_192_0;
                      if (!this.b(1 + param0, param1, -1777127001)) {
                        break L11;
                      } else {
                        L12: {
                          if (this.b(1 + param0, 1 + param1, -1777127001)) {
                            break L12;
                          } else {
                            if (!this.b(param0 - -1, 2 + param1, -1777127001)) {
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                        stackOut_197_0 = 1;
                        stackIn_199_0 = stackOut_197_0;
                        break L10;
                      }
                    }
                    stackOut_198_0 = 0;
                    stackIn_199_0 = stackOut_198_0;
                    break L10;
                  }
                  L13: {
                    L14: {
                      L15: {
                        var11 = stackIn_199_0;
                        if (!this.d(param0, 1, param1)) {
                          break L15;
                        } else {
                          if (var6 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L16: {
                        L17: {
                          if (!this.d(param0, 1, param1)) {
                            break L17;
                          } else {
                            if (var6 != 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if (!this.b(param0, 1 + param1, -1777127001)) {
                            break L18;
                          } else {
                            L19: {
                              if (!this.b(1 + param0, param1, -1777127001)) {
                                break L19;
                              } else {
                                if (!this.b(-1 + param0, param1, -1777127001)) {
                                  break L19;
                                } else {
                                  var4_int = var4_int | this.a(5, -113);
                                  if (var13 == 0) {
                                    break L13;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            L20: {
                              if (this.b(1 + param0, param1, -1777127001)) {
                                break L20;
                              } else {
                                L21: {
                                  if (!this.b(-1 + param0, param1, -1777127001)) {
                                    break L21;
                                  } else {
                                    var4_int = var4_int | this.a(3, 71);
                                    if (var13 == 0) {
                                      break L13;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                var4_int = var4_int | this.a(1, -124);
                                if (var13 == 0) {
                                  break L13;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            var4_int = var4_int | this.a(7, 125);
                            if (var13 == 0) {
                              break L13;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (this.b(param0, 2 + param1, -1777127001)) {
                          L22: {
                            if (!this.b(1 + param0, param1, -1777127001)) {
                              break L22;
                            } else {
                              if (!this.b(param0 - 1, param1, -1777127001)) {
                                break L22;
                              } else {
                                var4_int = var4_int | this.a(6, -99);
                                if (var13 == 0) {
                                  break L13;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                          L23: {
                            if (this.b(param0 + 1, param1, -1777127001)) {
                              break L23;
                            } else {
                              L24: {
                                if (this.b(-1 + param0, param1, -1777127001)) {
                                  break L24;
                                } else {
                                  var4_int = var4_int | this.a(2, -54);
                                  if (var13 == 0) {
                                    break L13;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              var4_int = var4_int | this.a(4, -76);
                              if (var13 == 0) {
                                break L13;
                              } else {
                                break L23;
                              }
                            }
                          }
                          var4_int = var4_int | this.a(8, -17);
                          if (var13 == 0) {
                            break L13;
                          } else {
                            break L16;
                          }
                        } else {
                          break L13;
                        }
                      }
                      L25: {
                        var11 = var11 != 0 | this.b(param0 - -1, 1 + param1, -1777127001) ? 1 : 0;
                        var10 = var10 != 0 | this.b(param0 + -1, 1 + param1, -1777127001) ? 1 : 0;
                        if (this.b(param0 - -1, param1 + 1, -1777127001)) {
                          stackOut_236_0 = 128;
                          stackIn_237_0 = stackOut_236_0;
                          break L25;
                        } else {
                          stackOut_235_0 = 0;
                          stackIn_237_0 = stackOut_235_0;
                          break L25;
                        }
                      }
                      L26: {
                        L27: {
                          L28: {
                            var12 = stackIn_237_0;
                            if (var8 != 0) {
                              break L28;
                            } else {
                              if (var9 != 0) {
                                break L28;
                              } else {
                                if (var10 == 0) {
                                  break L28;
                                } else {
                                  if (var11 != 0) {
                                    break L27;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                            }
                          }
                          L29: {
                            if (var8 != 0) {
                              break L29;
                            } else {
                              if (var9 != 0) {
                                break L29;
                              } else {
                                if (var10 != 0) {
                                  break L29;
                                } else {
                                  if (var11 == 0) {
                                    break L29;
                                  } else {
                                    var4_int = var4_int | this.a(28, 86) + -var12;
                                    if (var13 == 0) {
                                      break L26;
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
                              if (var8 != 0) {
                                break L31;
                              } else {
                                if (var11 != 0) {
                                  break L31;
                                } else {
                                  if (var9 == 0) {
                                    break L31;
                                  } else {
                                    if (var10 != 0) {
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
                                if (var8 != 0) {
                                  break L33;
                                } else {
                                  if (var11 != 0) {
                                    break L33;
                                  } else {
                                    if (var9 == 0) {
                                      break L33;
                                    } else {
                                      if (var10 == 0) {
                                        break L32;
                                      } else {
                                        break L33;
                                      }
                                    }
                                  }
                                }
                              }
                              L34: {
                                L35: {
                                  if (var8 != 0) {
                                    break L35;
                                  } else {
                                    if (var11 != 0) {
                                      break L35;
                                    } else {
                                      if (var9 != 0) {
                                        break L35;
                                      } else {
                                        if (var10 != 0) {
                                          break L34;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var8 == 0) {
                                  break L26;
                                } else {
                                  if (!this.b(1 + param0, param1, -1777127001)) {
                                    var4_int = var4_int | (786432 | this.a(1, -41));
                                    if (var13 == 0) {
                                      break L26;
                                    } else {
                                      break L34;
                                    }
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                              var4_int = var4_int | -var12 + this.a(26, 86);
                              if (var13 == 0) {
                                break L26;
                              } else {
                                break L32;
                              }
                            }
                            var4_int = var4_int | this.a(28, 110) - var12;
                            if (var13 == 0) {
                              break L26;
                            } else {
                              break L30;
                            }
                          }
                          var4_int = var4_int | -var12 + this.a(26, -62);
                          if (var13 == 0) {
                            break L26;
                          } else {
                            break L27;
                          }
                        }
                        var4_int = var4_int | this.a(26, -100) + -var12;
                        break L26;
                      }
                      if (var13 == 0) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                    L36: {
                      if (var8 == 0) {
                        break L36;
                      } else {
                        if (var9 == 0) {
                          break L36;
                        } else {
                          if (var10 == 0) {
                            break L36;
                          } else {
                            if (var11 == 0) {
                              break L36;
                            } else {
                              var4_int = var4_int | this.a(9, -42);
                              break L36;
                            }
                          }
                        }
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
                            if (var11 != 0) {
                              break L37;
                            } else {
                              var4_int = var4_int | this.a(10, 82);
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
                          if (var10 != 0) {
                            break L38;
                          } else {
                            if (var11 == 0) {
                              break L38;
                            } else {
                              var4_int = var4_int | this.a(11, -76);
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
                              var4_int = var4_int | this.a(18, 123);
                              break L39;
                            } else {
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
                        if (var9 != 0) {
                          break L40;
                        } else {
                          if (var10 == 0) {
                            break L40;
                          } else {
                            if (var11 != 0) {
                              var4_int = var4_int | this.a(12, 117);
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
                            if (var11 == 0) {
                              var4_int = var4_int | this.a(14, 71);
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
                          if (var10 != 0) {
                            break L42;
                          } else {
                            if (var11 == 0) {
                              break L42;
                            } else {
                              var4_int = var4_int | this.a(15, -16);
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
                            if (var11 != 0) {
                              break L43;
                            } else {
                              var4_int = var4_int | this.a(21, -9);
                              break L43;
                            }
                          }
                        }
                      }
                    }
                    L44: {
                      if (var8 != 0) {
                        break L44;
                      } else {
                        if (var9 == 0) {
                          break L44;
                        } else {
                          if (var10 == 0) {
                            break L44;
                          } else {
                            if (var11 != 0) {
                              var4_int = var4_int | this.a(19, -54);
                              break L44;
                            } else {
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
                              break L45;
                            } else {
                              var4_int = var4_int | this.a(16, 107);
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
                          if (var10 != 0) {
                            break L46;
                          } else {
                            if (var11 == 0) {
                              break L46;
                            } else {
                              var4_int = var4_int | this.a(17, -21);
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
                              var4_int = var4_int | this.a(20, 115);
                              break L47;
                            } else {
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
                        if (var9 != 0) {
                          break L48;
                        } else {
                          if (var10 == 0) {
                            break L48;
                          } else {
                            if (var11 == 0) {
                              break L48;
                            } else {
                              var4_int = var4_int | this.a(19, -78);
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
                            if (var11 != 0) {
                              break L49;
                            } else {
                              var4_int = var4_int | this.a(22, 117);
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
                          if (var10 != 0) {
                            break L50;
                          } else {
                            if (var11 != 0) {
                              var4_int = var4_int | this.a(23, 88);
                              break L50;
                            } else {
                              break L50;
                            }
                          }
                        }
                      }
                    }
                    if (var8 != 0) {
                      break L13;
                    } else {
                      if (var9 != 0) {
                        break L13;
                      } else {
                        if (var10 != 0) {
                          break L13;
                        } else {
                          if (var11 != 0) {
                            break L13;
                          } else {
                            var4_int = var4_int | this.a(24, -68);
                            break L13;
                          }
                        }
                      }
                    }
                  }
                  L51: {
                    if ((var4_int & 65408) != 0) {
                      break L51;
                    } else {
                      var4_int = var4_int | this.a(24, -69);
                      break L51;
                    }
                  }
                  return var4_int;
                } else {
                  return -64;
                }
              } else {
                break L0;
              }
            }
          }
          L52: {
            L53: {
              L54: {
                L55: {
                  var6 = this.b(param0, param1 + 3, -1777127001) ? 1 : 0;
                  var7 = this.b(param0, param1 - 1, -1777127001) ? 1 : 0;
                  if (!this.b(-1 + param0, param1, -1777127001)) {
                    break L55;
                  } else {
                    if (this.b(-1 + param0, param1 + 1, -1777127001)) {
                      break L54;
                    } else {
                      if (this.b(param0 - 1, param1 + 2, -1777127001)) {
                        break L54;
                      } else {
                        break L55;
                      }
                    }
                  }
                }
                if (this.d(-1 + param0, 1, param1)) {
                  break L53;
                } else {
                  break L54;
                }
              }
              if (!this.a(param0 + -1, (byte) -121, param1)) {
                break L53;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L52;
              }
            }
            stackOut_15_0 = 0;
            stackIn_16_0 = stackOut_15_0;
            break L52;
          }
          L56: {
            L57: {
              var8 = stackIn_16_0;
              if (!this.b(1 + param0, param1, -1777127001)) {
                break L57;
              } else {
                if (!this.a(1 + param0, (byte) -89, param1)) {
                  break L57;
                } else {
                  L58: {
                    if (this.b(param0 + 1, param1 - -1, -1777127001)) {
                      break L58;
                    } else {
                      if (!this.b(1 + param0, 2 + param1, -1777127001)) {
                        break L57;
                      } else {
                        break L58;
                      }
                    }
                  }
                  stackOut_23_0 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  break L56;
                }
              }
            }
            stackOut_24_0 = 0;
            stackIn_25_0 = stackOut_24_0;
            break L56;
          }
          L59: {
            L60: {
              var9 = stackIn_25_0;
              if (this.b(param0 - -1, param1, -1777127001)) {
                break L60;
              } else {
                if (this.d(param0 - -1, 1, param1)) {
                  break L60;
                } else {
                  stackOut_28_0 = 1;
                  stackIn_30_0 = stackOut_28_0;
                  break L59;
                }
              }
            }
            stackOut_29_0 = 0;
            stackIn_30_0 = stackOut_29_0;
            break L59;
          }
          L61: {
            var10 = stackIn_30_0;
            if (!this.d(param0, 1, param1)) {
              break L61;
            } else {
              if (var10 == 0) {
                L62: {
                  if (var6 == 0) {
                    break L62;
                  } else {
                    if (var7 == 0) {
                      break L62;
                    } else {
                      if (var8 == 0) {
                        break L62;
                      } else {
                        if (var9 == 0) {
                          break L62;
                        } else {
                          var4_int = var4_int | 589824;
                          break L62;
                        }
                      }
                    }
                  }
                }
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
                        if (var9 != 0) {
                          break L63;
                        } else {
                          var4_int = var4_int | 655360;
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
                      if (var8 != 0) {
                        break L64;
                      } else {
                        if (var9 == 0) {
                          break L64;
                        } else {
                          var4_int = var4_int | 720896;
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
                          var4_int = var4_int | 1179648;
                          break L65;
                        } else {
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
                    if (var7 != 0) {
                      break L66;
                    } else {
                      if (var8 == 0) {
                        break L66;
                      } else {
                        if (var9 == 0) {
                          break L66;
                        } else {
                          var4_int = var4_int | 786432;
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
                          var4_int = var4_int | 917504;
                          break L67;
                        } else {
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
                      if (var8 != 0) {
                        break L68;
                      } else {
                        if (var9 != 0) {
                          var4_int = var4_int | 983040;
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
                          break L69;
                        } else {
                          var4_int = var4_int | 1376256;
                          break L69;
                        }
                      }
                    }
                  }
                }
                L70: {
                  if (var6 != 0) {
                    break L70;
                  } else {
                    if (var7 == 0) {
                      break L70;
                    } else {
                      if (var8 == 0) {
                        break L70;
                      } else {
                        if (var9 == 0) {
                          break L70;
                        } else {
                          var4_int = var4_int | 851968;
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
                        if (var9 != 0) {
                          break L71;
                        } else {
                          var4_int = var4_int | 1048576;
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
                      if (var8 != 0) {
                        break L72;
                      } else {
                        if (var9 == 0) {
                          break L72;
                        } else {
                          var4_int = var4_int | 1114112;
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
                          var4_int = var4_int | 1310720;
                          break L73;
                        } else {
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
                    if (var7 != 0) {
                      break L74;
                    } else {
                      if (var8 == 0) {
                        break L74;
                      } else {
                        if (var9 != 0) {
                          var4_int = var4_int | 1245184;
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
                        if (var9 == 0) {
                          var4_int = var4_int | 1441792;
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
                      if (var8 != 0) {
                        break L76;
                      } else {
                        if (var9 == 0) {
                          break L76;
                        } else {
                          var4_int = var4_int | 1507328;
                          break L76;
                        }
                      }
                    }
                  }
                }
                if (var6 != 0) {
                  break L61;
                } else {
                  if (var7 != 0) {
                    break L61;
                  } else {
                    if (var8 != 0) {
                      break L61;
                    } else {
                      if (var9 != 0) {
                        break L61;
                      } else {
                        var4_int = var4_int | 1572864;
                        break L61;
                      }
                    }
                  }
                }
              } else {
                break L61;
              }
            }
          }
          return var4_int;
        } else {
          return this.b((byte) -61, param0, param1);
        }
    }

    private final void a(int[][] param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_14_0 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int[] stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[] stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int[] stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
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
                        statePc = 35;
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
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = param0.length ^ -1;
                        stackOut_4_1 = var3_int ^ -1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 >= stackIn_5_1) {
                            statePc = 21;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = 0;
                        stackIn_22_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var6 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 35;
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
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var4 ^ -1) <= (param0[0].length ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = -1;
                        stackOut_9_1 = param0[var3_int][var4] & 33554432 ^ -1;
                        stackIn_5_0 = stackOut_9_0;
                        stackIn_5_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var6 != 0) {
                            statePc = 5;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 35;
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
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 1;
                        stackIn_14_0 = stackOut_11_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = stackIn_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = ((on) this).field_t[var3_int];
                        stackOut_15_1 = var4;
                        stackOut_15_2 = ((on) this).field_p[var3_int];
                        stackOut_15_3 = var4;
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_18_1 = stackOut_15_1;
                        stackIn_18_2 = stackOut_15_2;
                        stackIn_18_3 = stackOut_15_3;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        stackIn_16_3 = stackOut_15_3;
                        if (var5 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = (int[]) (Object) stackIn_16_2;
                        stackOut_16_3 = stackIn_16_3;
                        stackOut_16_4 = 1;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_19_2 = stackOut_16_2;
                        stackIn_19_3 = stackOut_16_3;
                        stackIn_19_4 = stackOut_16_4;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = (int[]) (Object) stackIn_18_2;
                        stackOut_18_3 = stackIn_18_3;
                        stackOut_18_4 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        stackIn_19_3 = stackOut_18_3;
                        stackIn_19_4 = stackOut_18_4;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_19_2[stackIn_19_3] = stackIn_19_4;
                        stackIn_19_0[stackIn_19_1] = stackIn_19_4;
                        var4++;
                        if (var6 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3_int++;
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var3_int = stackIn_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = var3_int;
                        stackOut_23_1 = param0.length;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 >= stackIn_24_1) {
                            statePc = 41;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var6 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4 = 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var4 >= param0[0].length + -1) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = -2;
                        stackOut_28_1 = ((on) this).field_p[var3_int][var4] & 1 ^ -1;
                        stackIn_24_0 = stackOut_28_0;
                        stackIn_24_1 = stackOut_28_1;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        if (var6 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 == stackIn_29_1) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((on) this).field_p[var3_int][1 + var4] = hi.a(((on) this).field_p[var3_int][var4 - -1], 2);
                        ((on) this).field_t[var3_int][1 + var4] = hi.a(((on) this).field_p[var3_int][var4 - -1], 2);
                        ((on) this).field_p[var3_int][var4 + -1] = hi.a(((on) this).field_p[var3_int][-1 + var4], 4);
                        ((on) this).field_t[var3_int][var4 - 1] = hi.a(((on) this).field_p[var3_int][-1 + var4], 4);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var3_int++;
                        if (var6 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    try {
                        stackOut_36_0 = (RuntimeException) var3;
                        stackOut_36_1 = new StringBuilder().append("on.V(");
                        stackIn_39_0 = stackOut_36_0;
                        stackIn_39_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (param0 == null) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                        stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                        stackOut_37_2 = "{...}";
                        stackIn_40_0 = stackOut_37_0;
                        stackIn_40_1 = stackOut_37_1;
                        stackIn_40_2 = stackOut_37_2;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 39: {
                    stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                    stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                    stackOut_39_2 = "null";
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    stackIn_40_2 = stackOut_39_2;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    throw sh.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param1 + 41);
                }
                case 41: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final fb a(int param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        ah var7 = null;
        ah var8 = null;
        kd stackIn_2_0 = null;
        oo stackIn_25_0 = null;
        ah stackIn_32_0 = null;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        ah stackIn_44_0 = null;
        Object stackIn_50_0 = null;
        kd stackOut_1_0 = null;
        oo stackOut_24_0 = null;
        ah stackOut_31_0 = null;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        ah stackOut_43_0 = null;
        Object stackOut_49_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var6_int = param2 & -25165825;
                        var7 = null;
                        if (-1 != (param3 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = new kd(param0, param1, 3 & param2, param2 >> -1588842078 & 3);
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (fb) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        if ((param3 ^ -1) != -2) {
                            statePc = 15;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6_int = -67108865 & var6_int & -134217729;
                        var8 = eo.a(60, param0, var6_int, param1);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((param2 & 67108864 ^ -1) == -1) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8.field_ib = true;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7 = var8;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-1 != (134217728 & param2 ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var8.field_C = true;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (2 == param3) {
                            statePc = 33;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((param3 ^ -1) == -4) {
                            statePc = 26;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param3 == 4) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = new oo(param0, param1, param2);
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return (fb) (Object) stackIn_25_0;
                }
                case 26: {
                    try {
                        var6_int = var6_int & -134217729;
                        var8 = (ah) (Object) new gb(param0, param1, var6_int);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (0 != (134217728 & param2)) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ((gb) (Object) var8).field_C = true;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = (ah) var8;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 32: {
                    return (fb) (Object) stackIn_32_0;
                }
                case 33: {
                    try {
                        if (-1 <= (param2 & 1073741824 ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = 1;
                        stackIn_37_0 = stackOut_34_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = stackIn_37_0;
                        stackOut_37_1 = param1;
                        stackOut_37_2 = param0;
                        stackIn_40_0 = stackOut_37_0;
                        stackIn_40_1 = stackOut_37_1;
                        stackIn_40_2 = stackOut_37_2;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        if ((536870912 & param2) <= 0) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = stackIn_38_0;
                        stackOut_38_1 = stackIn_38_1;
                        stackOut_38_2 = stackIn_38_2;
                        stackOut_38_3 = 1;
                        stackIn_41_0 = stackOut_38_0;
                        stackIn_41_1 = stackOut_38_1;
                        stackIn_41_2 = stackOut_38_2;
                        stackIn_41_3 = stackOut_38_3;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = stackIn_40_0;
                        stackOut_40_1 = stackIn_40_1;
                        stackOut_40_2 = stackIn_40_2;
                        stackOut_40_3 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        stackIn_41_2 = stackOut_40_2;
                        stackIn_41_3 = stackOut_40_3;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var7 = (ah) (Object) co.a(stackIn_41_0 != 0, stackIn_41_1, stackIn_41_2, stackIn_41_3 != 0, var6_int & -1610612737, -19653);
                        ((id) (Object) var7).field_E = param2 >> 606456887 & 3;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var7 == null) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((fb) (Object) var7).field_z = (param2 & 25165824) >> 738869015;
                        stackOut_43_0 = (ah) var7;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 44: {
                    return (fb) (Object) stackIn_44_0;
                }
                case 45: {
                    try {
                        if (param4 == 1) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        this.a(116, (int[][]) null);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = null;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    return (fb) (Object) stackIn_50_0;
                }
                case 51: {
                    var6 = (RuntimeException) (Object) caughtException;
                    throw sh.a((Throwable) (Object) var6, "on.W(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 < -43) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 1;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        var4_int = (33488896 & this.a(param0, param2, 1)) >> 178162352;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var4_int ^ -1) < -65) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = var4_int;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((stackIn_6_0 ^ -1) != -1) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 1;
                        stackIn_12_0 = stackOut_9_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0 != 0;
                }
                case 13: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw sh.a((Throwable) (Object) var4, "on.E(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_6_0 = null;
        int stackIn_12_0 = 0;
        Object stackOut_5_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((on) this).field_s = -75;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (this.a((byte) -113, param0, 1 + param2)) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (this.a((byte) -115, param0, 2 + param2)) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 1;
                        stackIn_12_0 = stackOut_9_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0 != 0;
                }
                case 13: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw sh.a((Throwable) (Object) var4, "on.O(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int[][] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_37_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
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
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = param1.length ^ -1;
                        stackOut_2_1 = var3_int ^ -1;
                        stackIn_3_0 = stackOut_2_0;
                        stackIn_3_1 = stackOut_2_1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 >= stackIn_3_1) {
                            statePc = 37;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 0;
                        stackIn_38_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var9 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 43;
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
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((param1[0].length ^ -1) >= (var4 ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = this.c(var4, var3_int, -35);
                        var6 = var5 >> -133895673 & 511;
                        var7 = 511 & var5 >> 1703707888;
                        stackOut_7_0 = -2147483648 & var5 ^ -1;
                        stackOut_7_1 = -1;
                        stackIn_3_0 = stackOut_7_0;
                        stackIn_3_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (var9 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 == stackIn_8_1) {
                            statePc = 30;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = var6;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((stackIn_10_0 ^ -1) > -10) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = var6;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 <= 32) {
                            statePc = 29;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var7 < 9) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = -33;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 <= (var7 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((this.c(var4, 1 + var3_int, -65) & 65408) >> 1868421511 == 16) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var5 = var5 | 67108864;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var8 = this.a(false, var3_int, var4);
                        var5 = var5 & -128;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((65408 & var8 ^ -1) != -1) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var5 = var5 & -65409;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5 = var5 | var8;
                        ((on) this).field_h[var3_int][var4] = var5;
                        var4++;
                        if (var9 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var3_int++;
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = param0;
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 >= 92) {
                            statePc = 49;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        on.a((byte) 51, (ib) null);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    try {
                        stackOut_44_0 = (RuntimeException) var3;
                        stackOut_44_1 = new StringBuilder().append("on.T(").append(param0).append(44);
                        stackIn_47_0 = stackOut_44_0;
                        stackIn_47_1 = stackOut_44_1;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        if (param1 == null) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                        stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                        stackOut_45_2 = "{...}";
                        stackIn_48_0 = stackOut_45_0;
                        stackIn_48_1 = stackOut_45_1;
                        stackIn_48_2 = stackOut_45_2;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 47: {
                    stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                    stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                    stackOut_47_2 = "null";
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    stackIn_48_2 = stackOut_47_2;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    throw sh.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + 41);
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int c(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_47_0 = 0;
        Object stackIn_50_0 = null;
        int stackIn_57_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_46_0 = 0;
        Object stackOut_49_0 = null;
        int stackOut_56_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_76_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 41) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((on) this).a(-47, false);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4_int = 511 & this.a(param2, param1, 1) >> -480426201;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (8 == ((on) this).field_a) {
                            statePc = 16;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((((on) this).field_a ^ -1) == -8) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = this;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((((on) this).field_a ^ -1) == -6) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param2 < 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = -1;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0;
                }
                case 21: {
                    try {
                        if (-1 < (param1 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = -1;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0;
                }
                case 26: {
                    try {
                        if ((((on) this).field_f.length ^ -1) < (param1 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = -1;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0;
                }
                case 29: {
                    try {
                        if (((on) this).field_f[0].length <= param2) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = -1;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return stackIn_33_0;
                }
                case 34: {
                    try {
                        var5 = 511 & ((on) this).field_h[param1][param2] >> 1604294119;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (0 < var5) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var4_int = var5;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (73 > var4_int) {
                            statePc = 48;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = -101;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 <= (var4_int ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = 1;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 47: {
                    return stackIn_47_0;
                }
                case 48: {
                    try {
                        if (((on) this).field_a == 8) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = this;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((((on) this).field_a ^ -1) != -8) {
                            statePc = 73;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var4_int < 145) {
                            statePc = 64;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = var4_int;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0 <= 173) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = 2;
                        stackIn_63_0 = stackOut_62_0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 63: {
                    return stackIn_63_0;
                }
                case 64: {
                    try {
                        if (217 > var4_int) {
                            statePc = 73;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = -247;
                        stackIn_66_0 = stackOut_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 <= (var4_int ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = 3;
                        stackIn_72_0 = stackOut_71_0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 72: {
                    return stackIn_72_0;
                }
                case 73: {
                    try {
                        if (var4_int > 64) {
                            statePc = 76;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = 0;
                        stackIn_75_0 = stackOut_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    return stackIn_75_0;
                }
                case 76: {
                    try {
                        stackOut_76_0 = -1;
                        stackIn_77_0 = stackOut_76_0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    return stackIn_77_0;
                }
                case 78: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw sh.a((Throwable) (Object) var4, "on.P(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_6_0 = null;
        int stackIn_12_0 = 0;
        Object stackOut_5_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2 == -1777127001) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        int discarded$2 = this.c((byte) 82, 60, -52);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((33554432 & this.a(param0, param1, 1) ^ -1) == -1) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((this.a(param0, param1, 1) >> -1777127001 & 511) <= 64) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 1;
                        stackIn_12_0 = stackOut_9_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0 != 0;
                }
                case 13: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw sh.a((Throwable) (Object) var4, "on.F(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
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
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (cj.a((byte) 15, param1)) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (!tb.a(-10723, param1)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        if (!tk.a((byte) 84, param1)) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0 != 0;
                }
                case 11: {
                    try {
                        if (-1 != (param2.length() ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    try {
                        if (param0 <= -7) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    try {
                        if (lf.a(param2, param1, -7235)) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    try {
                        if (!ic.a(param1, param2, 0)) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 25: {
                    try {
                        if (t.a(param1, (byte) 125, param2)) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = 0;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0 != 0;
                }
                case 30: {
                    try {
                        stackOut_30_0 = 1;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0 != 0;
                }
                case 32: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    try {
                        stackOut_33_0 = (RuntimeException) var3;
                        stackOut_33_1 = new StringBuilder().append("on.I(").append(param0).append(44);
                        stackIn_36_0 = stackOut_33_0;
                        stackIn_36_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (param1 == null) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                        stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                        stackOut_34_2 = "{...}";
                        stackIn_37_0 = stackOut_34_0;
                        stackIn_37_1 = stackOut_34_1;
                        stackIn_37_2 = stackOut_34_2;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 36: {
                    stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                    stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                    stackOut_36_2 = "null";
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    stackIn_37_2 = stackOut_36_2;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    try {
                        stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                        stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(44);
                        stackIn_40_0 = stackOut_37_0;
                        stackIn_40_1 = stackOut_37_1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        if (param2 == null) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                        stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                        stackOut_38_2 = "{...}";
                        stackIn_41_0 = stackOut_38_0;
                        stackIn_41_1 = stackOut_38_1;
                        stackIn_41_2 = stackOut_38_2;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 40: {
                    stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                    stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                    stackOut_40_2 = "null";
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    stackIn_41_2 = stackOut_40_2;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    throw sh.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if ((33554432 & this.a(param1, param2, 1) ^ -1) != -1) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 1;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        if (param0 < -78) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        int discarded$2 = this.c((byte) 79, -18, -85);
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((this.c((byte) 41, param2, param1) ^ -1) != 0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 1;
                        stackIn_11_0 = stackOut_8_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw sh.a((Throwable) (Object) var4, "on.S(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var1_ref = (Object) (Object) ea.field_c;
                        // monitorenter ea.field_c
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        var2 = -66 / ((param0 - 42) / 59);
                        if ((wb.field_y ^ -1) != (he.field_e ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        kg.field_i = vd.field_b[he.field_e];
                        lc.field_c = gg.field_a[he.field_e];
                        he.field_e = he.field_e - -1 & 127;
                        // monitorexit var1_ref
                        stackOut_4_0 = 1;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1_ref
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) var3;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var1_ref2 = (RuntimeException) (Object) caughtException;
                    throw sh.a((Throwable) (Object) var1_ref2, "on.A(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean d(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_6_0 = null;
        int stackIn_12_0 = 0;
        Object stackOut_5_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 == 1) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        boolean discarded$2 = on.a((byte) 71, (String) null, (String) null);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (this.b(param0, param2 + 1, -1777127001)) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (this.b(param0, param2 - -2, -1777127001)) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 1;
                        stackIn_12_0 = stackOut_9_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0 != 0;
                }
                case 13: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw sh.a((Throwable) (Object) var4, "on.D(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(boolean param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_292_0 = 0;
        int stackIn_295_0 = 0;
        int stackIn_298_0 = 0;
        int stackIn_301_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_291_0 = 0;
        int stackOut_290_0 = 0;
        int stackOut_294_0 = 0;
        int stackOut_293_0 = 0;
        int stackOut_297_0 = 0;
        int stackOut_296_0 = 0;
        int stackOut_300_0 = 0;
        int stackOut_299_0 = 0;
        var14 = ZombieDawn.field_J;
        if (!param0) {
          L0: {
            L1: {
              var4_int = this.a(param2, param1, 1) & 127;
              var5 = this.a(param2, param1, 1) & 65408;
              if ((((on) this).field_a ^ -1) != -7) {
                break L1;
              } else {
                L2: {
                  if ((127 & this.a(param2 - 1, param1 + -1, 1)) != 1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var6 = stackIn_7_0;
                  if ((this.a(param2 + 1, param1 + -1, 1) & 127) != 1) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var7_int = stackIn_10_0;
                  if (-2 != (127 & this.a(1 + param2, 1 + param1, 1) ^ -1)) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L4;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L4;
                  }
                }
                L5: {
                  var8_int = stackIn_13_0;
                  if ((127 & this.a(-1 + param2, 1 + param1, 1) ^ -1) != -2) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L5;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L5;
                  }
                }
                L6: {
                  var9 = stackIn_16_0;
                  if ((127 & this.a(param2, -1 + param1, 1)) != 1) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L6;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L6;
                  }
                }
                L7: {
                  var10 = stackIn_19_0;
                  if ((this.a(param2 - -1, param1, 1) & 127) != 1) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L7;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    break L7;
                  }
                }
                L8: {
                  var11 = stackIn_22_0;
                  if (1 != (127 & this.a(param2, param1 - -1, 1))) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L8;
                  } else {
                    stackOut_23_0 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    break L8;
                  }
                }
                L9: {
                  var12 = stackIn_25_0;
                  if (-2 != (127 & this.a(-1 + param2, param1, 1) ^ -1)) {
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L9;
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    break L9;
                  }
                }
                L10: {
                  L11: {
                    var13 = stackIn_28_0;
                    if ((var4_int ^ -1) != -1) {
                      break L11;
                    } else {
                      L12: {
                        L13: {
                          if (var10 == 0) {
                            break L13;
                          } else {
                            if (var12 != 0) {
                              break L13;
                            } else {
                              if (var13 != 0) {
                                break L13;
                              } else {
                                if (var11 == 0) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                        }
                        L14: {
                          if (var10 != 0) {
                            break L14;
                          } else {
                            if (var12 == 0) {
                              break L14;
                            } else {
                              if (var13 != 0) {
                                break L14;
                              } else {
                                if (var11 != 0) {
                                  break L14;
                                } else {
                                  var4_int = 41;
                                  if (var14 == 0) {
                                    break L10;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L15: {
                          if (var10 != 0) {
                            break L15;
                          } else {
                            if (var12 != 0) {
                              break L15;
                            } else {
                              if (var13 == 0) {
                                break L15;
                              } else {
                                if (var11 != 0) {
                                  break L15;
                                } else {
                                  var4_int = 32;
                                  if (var14 == 0) {
                                    break L10;
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
                              if (var13 != 0) {
                                break L16;
                              } else {
                                if (var11 == 0) {
                                  break L16;
                                } else {
                                  var4_int = 34;
                                  if (var14 == 0) {
                                    break L10;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L17: {
                          L18: {
                            if (var10 != 0) {
                              break L18;
                            } else {
                              if (var12 == 0) {
                                break L18;
                              } else {
                                if (var13 != 0) {
                                  break L18;
                                } else {
                                  if (var11 != 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                          }
                          L19: {
                            if (var10 == 0) {
                              break L19;
                            } else {
                              if (var12 != 0) {
                                break L19;
                              } else {
                                if (var13 != 0) {
                                  break L19;
                                } else {
                                  if (var11 == 0) {
                                    break L19;
                                  } else {
                                    var4_int = 26;
                                    if (var14 == 0) {
                                      break L10;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L20: {
                            L21: {
                              if (var10 != 0) {
                                break L21;
                              } else {
                                if (var12 == 0) {
                                  break L21;
                                } else {
                                  if (var13 == 0) {
                                    break L21;
                                  } else {
                                    if (var11 == 0) {
                                      break L20;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                            }
                            L22: {
                              L23: {
                                if (var10 == 0) {
                                  break L23;
                                } else {
                                  if (var12 != 0) {
                                    break L23;
                                  } else {
                                    if (var13 == 0) {
                                      break L23;
                                    } else {
                                      if (var11 == 0) {
                                        break L22;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                }
                              }
                              L24: {
                                if (var10 == 0) {
                                  break L24;
                                } else {
                                  if (var12 == 0) {
                                    break L24;
                                  } else {
                                    if (var13 != 0) {
                                      break L24;
                                    } else {
                                      if (var11 == 0) {
                                        break L24;
                                      } else {
                                        var4_int = 31;
                                        if (var14 == 0) {
                                          break L10;
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L25: {
                                L26: {
                                  if (var10 == 0) {
                                    break L26;
                                  } else {
                                    if (var12 != 0) {
                                      break L26;
                                    } else {
                                      if (var13 == 0) {
                                        break L26;
                                      } else {
                                        if (var11 != 0) {
                                          break L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                }
                                L27: {
                                  if (var10 == 0) {
                                    break L27;
                                  } else {
                                    if (var12 == 0) {
                                      break L27;
                                    } else {
                                      if (var13 == 0) {
                                        break L27;
                                      } else {
                                        if (var11 != 0) {
                                          break L27;
                                        } else {
                                          var4_int = 39;
                                          if (var14 == 0) {
                                            break L10;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L28: {
                                  if (var10 != 0) {
                                    break L28;
                                  } else {
                                    if (var12 == 0) {
                                      break L28;
                                    } else {
                                      if (var13 == 0) {
                                        break L28;
                                      } else {
                                        if (var11 == 0) {
                                          break L28;
                                        } else {
                                          var4_int = 38;
                                          if (var14 == 0) {
                                            break L10;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L29: {
                                  L30: {
                                    if (var10 == 0) {
                                      break L30;
                                    } else {
                                      if (var12 == 0) {
                                        break L30;
                                      } else {
                                        if (var13 != 0) {
                                          break L30;
                                        } else {
                                          if (var11 == 0) {
                                            break L29;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L31: {
                                    L32: {
                                      if (var10 != 0) {
                                        break L32;
                                      } else {
                                        if (var12 != 0) {
                                          break L32;
                                        } else {
                                          if (var13 == 0) {
                                            break L32;
                                          } else {
                                            if (var11 != 0) {
                                              break L31;
                                            } else {
                                              break L32;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var10 != 0) {
                                      break L10;
                                    } else {
                                      if (var12 != 0) {
                                        break L10;
                                      } else {
                                        if (var13 != 0) {
                                          break L10;
                                        } else {
                                          if (var11 != 0) {
                                            break L10;
                                          } else {
                                            L33: {
                                              if (var6 != 0) {
                                                break L33;
                                              } else {
                                                L34: {
                                                  if (var7_int == 0) {
                                                    break L34;
                                                  } else {
                                                    var4_int = 43;
                                                    if (var14 == 0) {
                                                      break L10;
                                                    } else {
                                                      break L34;
                                                    }
                                                  }
                                                }
                                                L35: {
                                                  if (var8_int != 0) {
                                                    break L35;
                                                  } else {
                                                    if (var9 != 0) {
                                                      var4_int = 29;
                                                      if (var14 == 0) {
                                                        break L10;
                                                      } else {
                                                        break L35;
                                                      }
                                                    } else {
                                                      break L10;
                                                    }
                                                  }
                                                }
                                                var4_int = 27;
                                                if (var14 == 0) {
                                                  break L10;
                                                } else {
                                                  break L33;
                                                }
                                              }
                                            }
                                            var4_int = 45;
                                            if (var14 == 0) {
                                              break L10;
                                            } else {
                                              break L31;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var4_int = 46;
                                  if (var14 == 0) {
                                    break L10;
                                  } else {
                                    break L29;
                                  }
                                }
                                var4_int = 47;
                                if (var14 == 0) {
                                  break L10;
                                } else {
                                  break L25;
                                }
                              }
                              var4_int = 30;
                              if (var14 == 0) {
                                break L10;
                              } else {
                                break L22;
                              }
                            }
                            var4_int = 24;
                            if (var14 == 0) {
                              break L10;
                            } else {
                              break L20;
                            }
                          }
                          var4_int = 40;
                          if (var14 == 0) {
                            break L10;
                          } else {
                            break L17;
                          }
                        }
                        var4_int = 42;
                        if (var14 == 0) {
                          break L10;
                        } else {
                          break L12;
                        }
                      }
                      var4_int = 25;
                      if (var14 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L36: {
                    if (-49 >= (var4_int ^ -1)) {
                      break L36;
                    } else {
                      if (8 != var4_int) {
                        break L10;
                      } else {
                        break L36;
                      }
                    }
                  }
                  if ((var5 ^ -1) != -1) {
                    break L10;
                  } else {
                    L37: {
                      L38: {
                        L39: {
                          var5 = 334;
                          if (var10 == 0) {
                            break L39;
                          } else {
                            if (var12 != 0) {
                              break L39;
                            } else {
                              if (var13 != 0) {
                                break L39;
                              } else {
                                if (var11 == 0) {
                                  break L38;
                                } else {
                                  break L39;
                                }
                              }
                            }
                          }
                        }
                        L40: {
                          L41: {
                            if (var10 != 0) {
                              break L41;
                            } else {
                              if (var12 == 0) {
                                break L41;
                              } else {
                                if (var13 != 0) {
                                  break L41;
                                } else {
                                  if (var11 == 0) {
                                    break L40;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                            }
                          }
                          L42: {
                            L43: {
                              if (var10 != 0) {
                                break L43;
                              } else {
                                if (var12 != 0) {
                                  break L43;
                                } else {
                                  if (var13 == 0) {
                                    break L43;
                                  } else {
                                    if (var11 == 0) {
                                      break L42;
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                              }
                            }
                            L44: {
                              L45: {
                                if (var10 != 0) {
                                  break L45;
                                } else {
                                  if (var12 != 0) {
                                    break L45;
                                  } else {
                                    if (var13 != 0) {
                                      break L45;
                                    } else {
                                      if (var11 != 0) {
                                        break L44;
                                      } else {
                                        break L45;
                                      }
                                    }
                                  }
                                }
                              }
                              L46: {
                                if (var10 != 0) {
                                  break L46;
                                } else {
                                  if (var12 == 0) {
                                    break L46;
                                  } else {
                                    if (var13 != 0) {
                                      break L46;
                                    } else {
                                      if (var11 == 0) {
                                        break L46;
                                      } else {
                                        var5 += 42;
                                        if (var14 == 0) {
                                          break L37;
                                        } else {
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L47: {
                                if (var10 == 0) {
                                  break L47;
                                } else {
                                  if (var12 != 0) {
                                    break L47;
                                  } else {
                                    if (var13 != 0) {
                                      break L47;
                                    } else {
                                      if (var11 == 0) {
                                        break L47;
                                      } else {
                                        var5 += 26;
                                        if (var14 == 0) {
                                          break L37;
                                        } else {
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L48: {
                                if (var10 != 0) {
                                  break L48;
                                } else {
                                  if (var12 == 0) {
                                    break L48;
                                  } else {
                                    if (var13 == 0) {
                                      break L48;
                                    } else {
                                      if (var11 != 0) {
                                        break L48;
                                      } else {
                                        var5 += 40;
                                        if (var14 == 0) {
                                          break L37;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L49: {
                                if (var10 == 0) {
                                  break L49;
                                } else {
                                  if (var12 != 0) {
                                    break L49;
                                  } else {
                                    if (var13 == 0) {
                                      break L49;
                                    } else {
                                      if (var11 != 0) {
                                        break L49;
                                      } else {
                                        var5 += 24;
                                        if (var14 == 0) {
                                          break L37;
                                        } else {
                                          break L49;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (var10 != 0) {
                                break L37;
                              } else {
                                if (var12 != 0) {
                                  break L37;
                                } else {
                                  if (var13 != 0) {
                                    break L37;
                                  } else {
                                    if (var11 == 0) {
                                      L50: {
                                        if (var6 == 0) {
                                          break L50;
                                        } else {
                                          var5 = 437;
                                          if (var14 == 0) {
                                            break L37;
                                          } else {
                                            break L50;
                                          }
                                        }
                                      }
                                      L51: {
                                        if (var7_int == 0) {
                                          break L51;
                                        } else {
                                          var5 = 436;
                                          if (var14 == 0) {
                                            break L37;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                      L52: {
                                        if (var8_int == 0) {
                                          break L52;
                                        } else {
                                          var4_int = 428;
                                          if (var14 == 0) {
                                            break L37;
                                          } else {
                                            break L52;
                                          }
                                        }
                                      }
                                      if (var9 != 0) {
                                        var4_int = 429;
                                        if (var14 == 0) {
                                          break L37;
                                        } else {
                                          break L44;
                                        }
                                      } else {
                                        break L37;
                                      }
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                              }
                            }
                            var5 += 34;
                            if (var14 == 0) {
                              break L37;
                            } else {
                              break L42;
                            }
                          }
                          var5 += 32;
                          if (var14 == 0) {
                            break L37;
                          } else {
                            break L40;
                          }
                        }
                        var5 += 41;
                        if (var14 == 0) {
                          break L37;
                        } else {
                          break L38;
                        }
                      }
                      var5 += 25;
                      break L37;
                    }
                    if (-335 == (var5 ^ -1)) {
                      break L10;
                    } else {
                      var4_int = var5 << 1026802503 | -65409 & var4_int;
                      break L10;
                    }
                  }
                }
                if (var14 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (8 == ((on) this).field_a) {
              if (-56 == (var4_int ^ -1)) {
                L53: {
                  var6 = 55;
                  var7 = new int[]{52, 43, 57, 59};
                  var8 = new int[]{51, 35, 58, 56};
                  if (var6 == (127 & this.a(param2, param1 + -1, 1))) {
                    stackOut_291_0 = 0;
                    stackIn_292_0 = stackOut_291_0;
                    break L53;
                  } else {
                    stackOut_290_0 = 1;
                    stackIn_292_0 = stackOut_290_0;
                    break L53;
                  }
                }
                L54: {
                  var9 = stackIn_292_0;
                  if ((this.a(1 + param2, param1, 1) & 127 ^ -1) == (var6 ^ -1)) {
                    stackOut_294_0 = 0;
                    stackIn_295_0 = stackOut_294_0;
                    break L54;
                  } else {
                    stackOut_293_0 = 1;
                    stackIn_295_0 = stackOut_293_0;
                    break L54;
                  }
                }
                L55: {
                  var10 = stackIn_295_0;
                  if ((var6 ^ -1) == (this.a(param2, param1 + 1, 1) & 127 ^ -1)) {
                    stackOut_297_0 = 0;
                    stackIn_298_0 = stackOut_297_0;
                    break L55;
                  } else {
                    stackOut_296_0 = 1;
                    stackIn_298_0 = stackOut_296_0;
                    break L55;
                  }
                }
                L56: {
                  var11 = stackIn_298_0;
                  if (var6 == (127 & this.a(param2 - 1, param1, 1))) {
                    stackOut_300_0 = 0;
                    stackIn_301_0 = stackOut_300_0;
                    break L56;
                  } else {
                    stackOut_299_0 = 1;
                    stackIn_301_0 = stackOut_299_0;
                    break L56;
                  }
                }
                L57: {
                  var12 = stackIn_301_0;
                  int discarded$4 = this.a(param2 + -1, -1 + param1, 1);
                  int discarded$5 = this.a(param2 - -1, param1 + -1, 1);
                  int discarded$6 = this.a(1 + param2, param1 + 1, 1);
                  int discarded$7 = this.a(-1 + param2, 1 + param1, 1);
                  if (var9 == 0) {
                    break L57;
                  } else {
                    if (var11 != 0) {
                      break L57;
                    } else {
                      if (var12 != 0) {
                        break L57;
                      } else {
                        if (var10 != 0) {
                          break L57;
                        } else {
                          var4_int = var7[0];
                          if (var14 == 0) {
                            break L0;
                          } else {
                            break L57;
                          }
                        }
                      }
                    }
                  }
                }
                L58: {
                  L59: {
                    if (var9 != 0) {
                      break L59;
                    } else {
                      if (var11 == 0) {
                        break L59;
                      } else {
                        if (var12 != 0) {
                          break L59;
                        } else {
                          if (var10 == 0) {
                            break L58;
                          } else {
                            break L59;
                          }
                        }
                      }
                    }
                  }
                  L60: {
                    L61: {
                      if (var9 != 0) {
                        break L61;
                      } else {
                        if (var11 != 0) {
                          break L61;
                        } else {
                          if (var12 == 0) {
                            break L61;
                          } else {
                            if (var10 == 0) {
                              break L60;
                            } else {
                              break L61;
                            }
                          }
                        }
                      }
                    }
                    L62: {
                      L63: {
                        if (var9 != 0) {
                          break L63;
                        } else {
                          if (var11 != 0) {
                            break L63;
                          } else {
                            if (var12 != 0) {
                              break L63;
                            } else {
                              if (var10 != 0) {
                                break L62;
                              } else {
                                break L63;
                              }
                            }
                          }
                        }
                      }
                      L64: {
                        if (var9 == 0) {
                          break L64;
                        } else {
                          if (var11 != 0) {
                            break L64;
                          } else {
                            if (var12 == 0) {
                              break L64;
                            } else {
                              if (var10 != 0) {
                                break L64;
                              } else {
                                var4_int = var8[0];
                                if (var14 == 0) {
                                  break L0;
                                } else {
                                  break L64;
                                }
                              }
                            }
                          }
                        }
                      }
                      L65: {
                        L66: {
                          if (var9 != 0) {
                            break L66;
                          } else {
                            if (var11 == 0) {
                              break L66;
                            } else {
                              if (var12 == 0) {
                                break L66;
                              } else {
                                if (var10 == 0) {
                                  break L65;
                                } else {
                                  break L66;
                                }
                              }
                            }
                          }
                        }
                        L67: {
                          if (var9 != 0) {
                            break L67;
                          } else {
                            if (var11 == 0) {
                              break L67;
                            } else {
                              if (var12 != 0) {
                                break L67;
                              } else {
                                if (var10 == 0) {
                                  break L67;
                                } else {
                                  var4_int = var8[2];
                                  if (var14 == 0) {
                                    break L0;
                                  } else {
                                    break L67;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (var9 == 0) {
                          break L0;
                        } else {
                          if (var11 != 0) {
                            break L0;
                          } else {
                            if (var12 != 0) {
                              break L0;
                            } else {
                              if (var10 != 0) {
                                var4_int = var8[1];
                                if (var14 == 0) {
                                  break L0;
                                } else {
                                  break L65;
                                }
                              } else {
                                break L0;
                              }
                            }
                          }
                        }
                      }
                      var4_int = var8[3];
                      if (var14 == 0) {
                        break L0;
                      } else {
                        break L62;
                      }
                    }
                    var4_int = var7[1];
                    if (var14 == 0) {
                      break L0;
                    } else {
                      break L60;
                    }
                  }
                  var4_int = var7[3];
                  if (var14 == 0) {
                    break L0;
                  } else {
                    break L58;
                  }
                }
                var4_int = var7[2];
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          return var4_int;
        } else {
          return 34;
        }
    }

    final static void a(byte param0, ib param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        cf.field_eb.insertElementAt((Object) (Object) param1, 0);
                        var2_int = -29 / ((param0 - -47) / 44);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        stackOut_3_0 = (RuntimeException) runtimeException;
                        stackOut_3_1 = new StringBuilder().append("on.Q(").append(param0).append(44);
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_6_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (param1 == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
                        stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
                        stackOut_4_2 = "{...}";
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 6: {
                    stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                    stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                    stackOut_6_2 = "null";
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    throw sh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        vo stackIn_9_0 = null;
        vo stackIn_13_0 = null;
        vo stackOut_8_0 = null;
        vo stackOut_12_0 = null;
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
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_i = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = new vo();
                        var3 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var3 >= ((on) this).field_l.length) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = ((on) this).field_l[var3];
                        var5 = ((on) this).field_l[var3 + 1];
                        var6 = ((on) this).field_l[2 + var3];
                        var7 = ((on) this).field_l[3 + var3];
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (vo) var2;
                        stackIn_13_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var8 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((vo) (Object) stackIn_9_0).a(0, (le) (Object) this.a(var6, var7, var5, var4, 1));
                        var3 += 4;
                        if (var8 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (vo) var2;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw sh.a((Throwable) (Object) var2_ref, "on.G(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          var3_int = -34 % ((30 - param1) / 39);
          stackOut_0_0 = param0 << -1976960889;
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_1_0;
        }
        return 0;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_66_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_65_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
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
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (bi.field_g >= param2) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = param2;
                        stackIn_6_0 = stackOut_3_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = bi.field_g;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = stackIn_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (bi.field_l >= param4) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = param4;
                        stackIn_11_0 = stackOut_8_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = bi.field_l;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8 = stackIn_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var5_int < bi.field_b) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = bi.field_b;
                        stackIn_16_0 = stackOut_13_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = var5_int;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var9 = stackIn_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var6 ^ -1) > (bi.field_d ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = bi.field_d;
                        stackIn_21_0 = stackOut_18_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = var6;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var10 = stackIn_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((param2 ^ -1) > (bi.field_g ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = param2;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 < bi.field_b) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var11 = var8 * bi.field_f + param2;
                        var12 = var10 + 1 + -var8 >> 1896876385;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var12--;
                        if (var12 < 0) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        bi.field_c[var11] = 16777215;
                        var11 = var11 + bi.field_f * 2;
                        stackOut_31_0 = var13;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var13 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (bi.field_l > param4) {
                            statePc = 46;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((bi.field_d ^ -1) >= (var6 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var11 = var7 + param4 * bi.field_f;
                        var12 = -var7 + (1 - -var9) >> 511509825;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var12--;
                        if (0 > var12) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        bi.field_c[var11] = 16777215;
                        var11 += 2;
                        if (var13 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var13 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (param3 > 21) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        on.a((byte) 52, (ib) null);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var5_int < bi.field_g) {
                            statePc = 64;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = bi.field_b;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((stackIn_52_0 ^ -1) < (var5_int ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var11 = bi.field_f * ((1 & -param2 + var5_int) + var8) - -var5_int;
                        var12 = var10 + (1 - var8) >> 798750145;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        bi.field_c[var11] = 16777215;
                        var11 = var11 + 2 * bi.field_f;
                        stackOut_59_0 = var13;
                        stackIn_60_0 = stackOut_59_0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var13 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (bi.field_l > param4) {
                            statePc = 79;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = bi.field_d;
                        stackIn_66_0 = stackOut_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((stackIn_66_0 ^ -1) < (var6 ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var11 = (1 & -param4 + var6) + var7 + bi.field_f * var6;
                        var12 = 1 - (-var9 + var7) >> 1787966977;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        bi.field_c[var11] = 16777215;
                        var11 += 2;
                        if (var13 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var13 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 78: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw sh.a((Throwable) (Object) var5, "on.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                case 79: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 < 0) {
                            statePc = 15;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = param0;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((stackIn_2_0 ^ -1) <= (((on) this).field_f[0].length ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = param1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 < 0) {
                            statePc = 15;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = param1;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 >= ((on) this).field_f.length) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    try {
                        if (param2 == 1) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = 32;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0;
                }
                case 20: {
                    try {
                        stackOut_20_0 = ((on) this).field_f[param1][param0];
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw sh.a((Throwable) (Object) var4, "on.U(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int[] stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int[] stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int[] stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int[] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        stackOut_0_0 = ((on) this).field_p[param2];
                        stackOut_0_1 = param4;
                        stackIn_3_0 = stackOut_0_0;
                        stackIn_3_1 = stackOut_0_1;
                        stackIn_1_0 = stackOut_0_0;
                        stackIn_1_1 = stackOut_0_1;
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = (int[]) (Object) stackIn_1_0;
                        stackOut_1_1 = stackIn_1_1;
                        stackOut_1_2 = 0;
                        stackIn_4_0 = stackOut_1_0;
                        stackIn_4_1 = stackOut_1_1;
                        stackIn_4_2 = stackOut_1_2;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = (int[]) (Object) stackIn_3_0;
                        stackOut_3_1 = stackIn_3_1;
                        stackOut_3_2 = 1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        stackIn_4_2 = stackOut_3_2;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_4_0[stackIn_4_1] = hi.a(stackIn_4_2, eg.a(14, ((on) this).field_p[param2][param4]));
                        if (param1 == 14365) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        boolean discarded$1 = this.a((byte) 91, 88, -54);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!param3) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = ((on) this).field_t[param2];
                        stackOut_11_1 = param4;
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (!param0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (int[]) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = 1;
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_15_2 = stackOut_12_2;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (int[]) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_15_0[stackIn_15_1] = hi.a(stackIn_15_2, eg.a(14, ((on) this).field_t[param2][param4]));
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((((on) this).field_p[param2].length ^ -1) < (1 + param4 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = ((on) this).field_p[param2];
                        stackOut_19_1 = 1 + param4;
                        stackOut_19_2 = eg.a(-3, ((on) this).field_p[param2][param4 - -1]);
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_22_2 = stackOut_19_2;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        if (!param0) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = (int[]) (Object) stackIn_20_0;
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = stackIn_20_2;
                        stackOut_20_3 = 2;
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_23_2 = stackOut_20_2;
                        stackIn_23_3 = stackOut_20_3;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = (int[]) (Object) stackIn_22_0;
                        stackOut_22_1 = stackIn_22_1;
                        stackOut_22_2 = stackIn_22_2;
                        stackOut_22_3 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        stackIn_23_3 = stackOut_22_3;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_23_0[stackIn_23_1] = hi.a(stackIn_23_2, stackIn_23_3);
                        if (param3) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = ((on) this).field_t[param2];
                        stackOut_24_1 = param4 - -1;
                        stackOut_24_2 = eg.a(((on) this).field_t[param2][1 + param4], -3);
                        stackIn_29_0 = stackOut_24_0;
                        stackIn_29_1 = stackOut_24_1;
                        stackIn_29_2 = stackOut_24_2;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        if (!param0) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = (int[]) (Object) stackIn_25_0;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = stackIn_25_2;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackIn_27_2 = stackOut_25_2;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = (int[]) (Object) stackIn_27_0;
                        stackOut_27_1 = stackIn_27_1;
                        stackOut_27_2 = stackIn_27_2;
                        stackOut_27_3 = 2;
                        stackIn_30_0 = stackOut_27_0;
                        stackIn_30_1 = stackOut_27_1;
                        stackIn_30_2 = stackOut_27_2;
                        stackIn_30_3 = stackOut_27_3;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = (int[]) (Object) stackIn_29_0;
                        stackOut_29_1 = stackIn_29_1;
                        stackOut_29_2 = stackIn_29_2;
                        stackOut_29_3 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        stackIn_30_2 = stackOut_29_2;
                        stackIn_30_3 = stackOut_29_3;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_30_0[stackIn_30_1] = hi.a(stackIn_30_2, stackIn_30_3);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param4 - 1 <= 0) {
                            statePc = 48;
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
                        stackOut_32_0 = ((on) this).field_p[param2];
                        stackOut_32_1 = -1 + param4;
                        stackIn_37_0 = stackOut_32_0;
                        stackIn_37_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (param0) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = (int[]) (Object) stackIn_33_0;
                        stackOut_33_1 = stackIn_33_1;
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = (int[]) (Object) stackIn_35_0;
                        stackOut_35_1 = stackIn_35_1;
                        stackOut_35_2 = 0;
                        stackIn_38_0 = stackOut_35_0;
                        stackIn_38_1 = stackOut_35_1;
                        stackIn_38_2 = stackOut_35_2;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = (int[]) (Object) stackIn_37_0;
                        stackOut_37_1 = stackIn_37_1;
                        stackOut_37_2 = 4;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_38_0[stackIn_38_1] = hi.a(stackIn_38_2, eg.a(-5, ((on) this).field_p[param2][-1 + param4]));
                        if (param3) {
                            statePc = 48;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = ((on) this).field_t[param2];
                        stackOut_39_1 = param4 - 1;
                        stackIn_44_0 = stackOut_39_0;
                        stackIn_44_1 = stackOut_39_1;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        if (param0) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = (int[]) (Object) stackIn_40_0;
                        stackOut_40_1 = stackIn_40_1;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_42_1 = stackOut_40_1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = (int[]) (Object) stackIn_42_0;
                        stackOut_42_1 = stackIn_42_1;
                        stackOut_42_2 = 0;
                        stackIn_45_0 = stackOut_42_0;
                        stackIn_45_1 = stackOut_42_1;
                        stackIn_45_2 = stackOut_42_2;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = (int[]) (Object) stackIn_44_0;
                        stackOut_44_1 = stackIn_44_1;
                        stackOut_44_2 = 4;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        stackIn_45_2 = stackOut_44_2;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_45_0[stackIn_45_1] = hi.a(stackIn_45_2, eg.a(-5, ((on) this).field_t[param2][-1 + param4]));
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    var6 = (RuntimeException) (Object) caughtException;
                    throw sh.a((Throwable) (Object) var6, "on.R(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    on(int[][] param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8, boolean param9) {
        RuntimeException var11 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((on) this).field_d = false;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((on) this).field_l = param1;
                        ((on) this).field_a = param2;
                        ((on) this).field_b = param5;
                        ((on) this).field_c = param7;
                        ((on) this).field_s = param3;
                        ((on) this).field_o = param8;
                        ((on) this).field_f = param0;
                        ((on) this).field_m = param6;
                        ((on) this).field_j = param4;
                        ((on) this).field_h = new int[param0.length][param0[0].length];
                        ((on) this).field_p = new int[param0.length][param0[0].length];
                        ((on) this).field_t = new int[param0.length][param0[0].length];
                        ((on) this).field_d = param9;
                        ((on) this).a(0);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var11 = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) var11;
                        stackOut_4_1 = new StringBuilder().append("on.<init>(");
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param0 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param1 == null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param5 == null) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "{...}";
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_16_2 = stackOut_13_2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                    stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                    stackOut_15_2 = "null";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param6 == null) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "{...}";
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_20_2 = stackOut_17_2;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 19: {
                    stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                    stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                    stackOut_19_2 = "null";
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw sh.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
                }
                case 21: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int b(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        Object stackIn_16_0 = null;
        int stackIn_22_0 = 0;
        Object stackIn_25_0 = null;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        Object stackIn_57_1 = null;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        Object stackIn_66_1 = null;
        int stackIn_67_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_171_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_197_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_221_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_233_0 = 0;
        int stackIn_242_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_250_0 = 0;
        int stackIn_258_0 = 0;
        int stackIn_262_0 = 0;
        int stackIn_271_0 = 0;
        int stackIn_275_0 = 0;
        int stackIn_279_0 = 0;
        int stackIn_287_0 = 0;
        int stackIn_291_0 = 0;
        int stackIn_295_0 = 0;
        int stackIn_303_0 = 0;
        int stackIn_307_0 = 0;
        int stackIn_316_0 = 0;
        int stackIn_320_0 = 0;
        int stackIn_329_0 = 0;
        int stackIn_333_0 = 0;
        int stackIn_342_0 = 0;
        int stackIn_346_0 = 0;
        int stackIn_350_0 = 0;
        int stackIn_358_0 = 0;
        int stackIn_362_0 = 0;
        int stackIn_371_0 = 0;
        int stackIn_375_0 = 0;
        int stackIn_387_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        Object stackOut_15_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        Object stackOut_24_0 = null;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_56_0 = 0;
        Object stackOut_56_1 = null;
        int stackOut_57_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_65_0 = 0;
        Object stackOut_65_1 = null;
        int stackOut_66_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_74_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_241_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_257_0 = 0;
        int stackOut_261_0 = 0;
        int stackOut_270_0 = 0;
        int stackOut_274_0 = 0;
        int stackOut_278_0 = 0;
        int stackOut_286_0 = 0;
        int stackOut_290_0 = 0;
        int stackOut_294_0 = 0;
        int stackOut_302_0 = 0;
        int stackOut_306_0 = 0;
        int stackOut_315_0 = 0;
        int stackOut_319_0 = 0;
        int stackOut_328_0 = 0;
        int stackOut_332_0 = 0;
        int stackOut_341_0 = 0;
        int stackOut_345_0 = 0;
        int stackOut_349_0 = 0;
        int stackOut_357_0 = 0;
        int stackOut_361_0 = 0;
        int stackOut_370_0 = 0;
        int stackOut_374_0 = 0;
        int stackOut_386_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = this.a(param1, param2, 1);
                        var4_int = var4_int & -67108865;
                        var5 = var4_int >> -739042233 & 511;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0 == (33554432 & var4_int)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1 == (var5 ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = var4_int;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        var4_int = var4_int & -65409;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((on) this).field_a == 6) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4_int = var4_int | this.a(511, -66);
                        stackOut_12_0 = var4_int;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    try {
                        if (this.a((byte) -92, 1 + param1, param2)) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = this;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (this.a(1 + param1, true, param2)) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = 1;
                        stackIn_22_0 = stackOut_19_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var6 = stackIn_22_0;
                        var7 = this.a((byte) -116, param1, param2 + 3) ? 1 : 0;
                        var8 = this.a((byte) -109, param1, param2 + -1) ? 1 : 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (this.a((byte) -113, param1 + -1, param2)) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = this;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (this.a(param1 - 1, true, param2)) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = 1;
                        stackIn_31_0 = stackOut_28_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9 = stackIn_31_0;
                        if (param0 == -61) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = 82;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return stackIn_33_0;
                }
                case 34: {
                    try {
                        var10 = this.a((byte) -128, param1 - -1, param2) ? 1 : 0;
                        var11 = 0;
                        if (var9 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var11 = this.c((byte) 41, param2, -1 + param1) * 72;
                        stackOut_35_0 = var13;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var8 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var11 = 72 * this.c((byte) 41, param2 + -1, param1);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (!this.a(param1, true, param2)) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = var6;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (stackIn_43_0 == 0) {
                            statePc = 151;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (!this.a(param1, true, param2)) {
                            statePc = 108;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = var6;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (stackIn_50_0 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = var10;
                        stackIn_60_0 = stackOut_53_0;
                        stackIn_54_0 = stackOut_53_0;
                        if (this.a((byte) -94, 1 + param1, 2 + param2)) {
                            statePc = 60;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = stackIn_54_0;
                        stackIn_56_0 = stackOut_54_0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = stackIn_56_0;
                        stackOut_56_1 = this;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = stackIn_57_0;
                        stackIn_62_0 = stackOut_57_0;
                        stackIn_58_0 = stackOut_57_0;
                        if (!this.a((byte) -98, param1 + 1, param2 + 1)) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = stackIn_58_0;
                        stackIn_60_0 = stackOut_58_0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackOut_60_0 = stackIn_60_0;
                        stackOut_60_1 = 1;
                        stackIn_63_0 = stackOut_60_0;
                        stackIn_63_1 = stackOut_60_1;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = stackIn_62_0;
                        stackOut_62_1 = 0;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var10 = stackIn_63_0 | stackIn_63_1;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = var9;
                        stackIn_69_0 = stackOut_64_0;
                        stackIn_65_0 = stackOut_64_0;
                        if (this.a((byte) -85, param1 - 1, 2 + param2)) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = stackIn_65_0;
                        stackOut_65_1 = this;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackOut_66_0 = stackIn_66_0;
                        stackIn_71_0 = stackOut_66_0;
                        stackIn_67_0 = stackOut_66_0;
                        if (!this.a((byte) -110, -1 + param1, param2 - -1)) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackOut_67_0 = stackIn_67_0;
                        stackIn_69_0 = stackOut_67_0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackOut_69_0 = stackIn_69_0;
                        stackOut_69_1 = 1;
                        stackIn_72_0 = stackOut_69_0;
                        stackIn_72_1 = stackOut_69_1;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = stackIn_71_0;
                        stackOut_71_1 = 0;
                        stackIn_72_0 = stackOut_71_0;
                        stackIn_72_1 = stackOut_71_1;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var9 = stackIn_72_0 | stackIn_72_1;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (this.a((byte) -111, 1 + param1, param2 - -1)) {
                            statePc = 76;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = 0;
                        stackIn_77_0 = stackOut_74_0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackOut_76_0 = 128;
                        stackIn_77_0 = stackOut_76_0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var12 = stackIn_77_0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var7 != 0) {
                            statePc = 91;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackOut_79_0 = var8;
                        stackIn_80_0 = stackOut_79_0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (stackIn_80_0 != 0) {
                            statePc = 91;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackOut_83_0 = var9;
                        stackIn_84_0 = stackOut_83_0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (stackIn_84_0 == 0) {
                            statePc = 91;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (var10 == 0) {
                            statePc = 91;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var4_int = var4_int | this.a(var11 + 26, 102) - var12;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var7 != 0) {
                            statePc = 107;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackOut_92_0 = var8;
                        stackIn_93_0 = stackOut_92_0;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (stackIn_93_0 != 0) {
                            statePc = 107;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackOut_96_0 = var9;
                        stackIn_97_0 = stackOut_96_0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (stackIn_97_0 != 0) {
                            statePc = 107;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackOut_100_0 = var10;
                        stackIn_101_0 = stackOut_100_0;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (stackIn_101_0 != 0) {
                            statePc = 106;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var4_int = var4_int | -var12 + this.a(28 + var11, 89);
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (var13 == 0) {
                            statePc = 382;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (this.a((byte) -95, param1, 1 + param2)) {
                            statePc = 133;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (!this.a((byte) -93, param1, param2 - -2)) {
                            statePc = 382;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (!this.a((byte) -122, param1 + 1, param2)) {
                            statePc = 122;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (!this.a((byte) -119, param1 - 1, param2)) {
                            statePc = 122;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var4_int = var4_int | this.a(6 - -var11, -99);
                        stackOut_120_0 = var13;
                        stackIn_121_0 = stackOut_120_0;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (stackIn_121_0 == 0) {
                            statePc = 382;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (!this.a((byte) -102, param1 + 1, param2)) {
                            statePc = 127;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var4_int = var4_int | this.a(var11 + 8, 91);
                        stackOut_125_0 = var13;
                        stackIn_126_0 = stackOut_125_0;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (stackIn_126_0 == 0) {
                            statePc = 382;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (!this.a((byte) -127, -1 + param1, param2)) {
                            statePc = 131;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var4_int = var4_int | this.a(4 + var11, -93);
                        if (var13 == 0) {
                            statePc = 382;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var4_int = var4_int | this.a(var11 + 2, param0 + -8);
                        stackOut_131_0 = var13;
                        stackIn_132_0 = stackOut_131_0;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (stackIn_132_0 == 0) {
                            statePc = 382;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (!this.a((byte) -128, param1 + 1, param2)) {
                            statePc = 141;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (!this.a((byte) -94, param1 + -1, param2)) {
                            statePc = 141;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var4_int = var4_int | this.a(var11 + 5, 74);
                        stackOut_139_0 = var13;
                        stackIn_140_0 = stackOut_139_0;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (stackIn_140_0 == 0) {
                            statePc = 382;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (this.a((byte) -79, 1 + param1, param2)) {
                            statePc = 149;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (!this.a((byte) -96, param1 - 1, param2)) {
                            statePc = 148;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var4_int = var4_int | this.a(var11 + 3, param0 + 165);
                        if (var13 == 0) {
                            statePc = 382;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var4_int = var4_int | this.a(1 + var11, param0 ^ -113);
                        if (var13 == 0) {
                            statePc = 382;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        var4_int = var4_int | this.a(var11 + 7, -75);
                        stackOut_149_0 = var13;
                        stackIn_150_0 = stackOut_149_0;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (stackIn_150_0 == 0) {
                            statePc = 382;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if (var7 == 0) {
                            statePc = 169;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        stackOut_154_0 = var8;
                        stackIn_155_0 = stackOut_154_0;
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (stackIn_155_0 == 0) {
                            statePc = 169;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        stackOut_158_0 = var9;
                        stackIn_159_0 = stackOut_158_0;
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        if (stackIn_159_0 == 0) {
                            statePc = 169;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        stackOut_162_0 = var10;
                        stackIn_163_0 = stackOut_162_0;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (stackIn_163_0 != 0) {
                            statePc = 168;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        var4_int = var4_int | this.a(var11 + 9, 84);
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        if (var7 == 0) {
                            statePc = 182;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        stackOut_170_0 = var8;
                        stackIn_171_0 = stackOut_170_0;
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (stackIn_171_0 == 0) {
                            statePc = 182;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        stackOut_174_0 = var9;
                        stackIn_175_0 = stackOut_174_0;
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        if (stackIn_175_0 == 0) {
                            statePc = 182;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        if (var10 != 0) {
                            statePc = 182;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        var4_int = var4_int | this.a(10 + var11, -11);
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        if (var7 == 0) {
                            statePc = 195;
                        } else {
                            statePc = 183;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        stackOut_183_0 = var8;
                        stackIn_184_0 = stackOut_183_0;
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        if (stackIn_184_0 == 0) {
                            statePc = 195;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        stackOut_187_0 = var9;
                        stackIn_188_0 = stackOut_187_0;
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        if (stackIn_188_0 != 0) {
                            statePc = 195;
                        } else {
                            statePc = 189;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if (var10 == 0) {
                            statePc = 195;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        var4_int = var4_int | this.a(11 + var11, 98);
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        if (var7 == 0) {
                            statePc = 211;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        stackOut_196_0 = var8;
                        stackIn_197_0 = stackOut_196_0;
                        statePc = 197;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        if (stackIn_197_0 == 0) {
                            statePc = 211;
                        } else {
                            statePc = 198;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        stackOut_200_0 = var9;
                        stackIn_201_0 = stackOut_200_0;
                        statePc = 201;
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        if (stackIn_201_0 != 0) {
                            statePc = 211;
                        } else {
                            statePc = 202;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        statePc = 204;
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        stackOut_204_0 = var10;
                        stackIn_205_0 = stackOut_204_0;
                        statePc = 205;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        if (stackIn_205_0 == 0) {
                            statePc = 210;
                        } else {
                            statePc = 206;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        statePc = 208;
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        statePc = 211;
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        var4_int = var4_int | this.a(var11 + 18, param0 + 176);
                        statePc = 211;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        if (var7 == 0) {
                            statePc = 227;
                        } else {
                            statePc = 212;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        stackOut_212_0 = var8;
                        stackIn_213_0 = stackOut_212_0;
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        if (stackIn_213_0 != 0) {
                            statePc = 227;
                        } else {
                            statePc = 214;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        stackOut_216_0 = var9;
                        stackIn_217_0 = stackOut_216_0;
                        statePc = 217;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        if (stackIn_217_0 == 0) {
                            statePc = 227;
                        } else {
                            statePc = 218;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        stackOut_220_0 = var10;
                        stackIn_221_0 = stackOut_220_0;
                        statePc = 221;
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        if (stackIn_221_0 != 0) {
                            statePc = 226;
                        } else {
                            statePc = 222;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 225;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 225;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 225;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        statePc = 227;
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 225;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        var4_int = var4_int | this.a(12 - -var11, -30);
                        statePc = 227;
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        if (var7 == 0) {
                            statePc = 240;
                        } else {
                            statePc = 228;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        stackOut_228_0 = var8;
                        stackIn_229_0 = stackOut_228_0;
                        statePc = 229;
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        if (stackIn_229_0 != 0) {
                            statePc = 240;
                        } else {
                            statePc = 230;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        statePc = 232;
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        stackOut_232_0 = var9;
                        stackIn_233_0 = stackOut_232_0;
                        statePc = 233;
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        if (stackIn_233_0 == 0) {
                            statePc = 240;
                        } else {
                            statePc = 234;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        statePc = 236;
                        continue stateLoop;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        if (var10 != 0) {
                            statePc = 240;
                        } else {
                            statePc = 237;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        statePc = 239;
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        var4_int = var4_int | this.a(14 - -var11, -32);
                        statePc = 240;
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        if (var7 == 0) {
                            statePc = 256;
                        } else {
                            statePc = 241;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_240) {
                        caughtException = stateCaught_240;
                        statePc = 244;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        stackOut_241_0 = var8;
                        stackIn_242_0 = stackOut_241_0;
                        statePc = 242;
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 244;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        if (stackIn_242_0 != 0) {
                            statePc = 256;
                        } else {
                            statePc = 243;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 248;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        statePc = 245;
                        continue stateLoop;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 248;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 248;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        stackOut_245_0 = var9;
                        stackIn_246_0 = stackOut_245_0;
                        statePc = 246;
                        continue stateLoop;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 248;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        if (stackIn_246_0 != 0) {
                            statePc = 256;
                        } else {
                            statePc = 247;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 252;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        statePc = 249;
                        continue stateLoop;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 252;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 252;
                        continue stateLoop;
                    }
                }
                case 249: {
                    try {
                        stackOut_249_0 = var10;
                        stackIn_250_0 = stackOut_249_0;
                        statePc = 250;
                        continue stateLoop;
                    } catch (Throwable stateCaught_249) {
                        caughtException = stateCaught_249;
                        statePc = 252;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        if (stackIn_250_0 != 0) {
                            statePc = 255;
                        } else {
                            statePc = 251;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        statePc = 253;
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_252) {
                        caughtException = stateCaught_252;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        statePc = 256;
                        continue stateLoop;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 255: {
                    try {
                        var4_int = var4_int | this.a(15 + var11, -12);
                        statePc = 256;
                        continue stateLoop;
                    } catch (Throwable stateCaught_255) {
                        caughtException = stateCaught_255;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        if (var7 == 0) {
                            statePc = 269;
                        } else {
                            statePc = 257;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 260;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        stackOut_257_0 = var8;
                        stackIn_258_0 = stackOut_257_0;
                        statePc = 258;
                        continue stateLoop;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 260;
                        continue stateLoop;
                    }
                }
                case 258: {
                    try {
                        if (stackIn_258_0 != 0) {
                            statePc = 269;
                        } else {
                            statePc = 259;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_258) {
                        caughtException = stateCaught_258;
                        statePc = 264;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        statePc = 261;
                        continue stateLoop;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 264;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 264;
                        continue stateLoop;
                    }
                }
                case 261: {
                    try {
                        stackOut_261_0 = var9;
                        stackIn_262_0 = stackOut_261_0;
                        statePc = 262;
                        continue stateLoop;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 264;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        if (stackIn_262_0 != 0) {
                            statePc = 269;
                        } else {
                            statePc = 263;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 267;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        statePc = 265;
                        continue stateLoop;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 267;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 267;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        if (var10 != 0) {
                            statePc = 269;
                        } else {
                            statePc = 266;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 267;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        statePc = 268;
                        continue stateLoop;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        var4_int = var4_int | this.a(21 - -var11, -15);
                        statePc = 269;
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        if (var7 != 0) {
                            statePc = 285;
                        } else {
                            statePc = 270;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 273;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        stackOut_270_0 = var8;
                        stackIn_271_0 = stackOut_270_0;
                        statePc = 271;
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 273;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        if (stackIn_271_0 == 0) {
                            statePc = 285;
                        } else {
                            statePc = 272;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        statePc = 274;
                        continue stateLoop;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        stackOut_274_0 = var9;
                        stackIn_275_0 = stackOut_274_0;
                        statePc = 275;
                        continue stateLoop;
                    } catch (Throwable stateCaught_274) {
                        caughtException = stateCaught_274;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 275: {
                    try {
                        if (stackIn_275_0 == 0) {
                            statePc = 285;
                        } else {
                            statePc = 276;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_275) {
                        caughtException = stateCaught_275;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        statePc = 278;
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 277: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_277) {
                        caughtException = stateCaught_277;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        stackOut_278_0 = var10;
                        stackIn_279_0 = stackOut_278_0;
                        statePc = 279;
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 279: {
                    try {
                        if (stackIn_279_0 != 0) {
                            statePc = 284;
                        } else {
                            statePc = 280;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_279) {
                        caughtException = stateCaught_279;
                        statePc = 283;
                        continue stateLoop;
                    }
                }
                case 280: {
                    try {
                        statePc = 282;
                        continue stateLoop;
                    } catch (Throwable stateCaught_280) {
                        caughtException = stateCaught_280;
                        statePc = 283;
                        continue stateLoop;
                    }
                }
                case 281: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_281) {
                        caughtException = stateCaught_281;
                        statePc = 283;
                        continue stateLoop;
                    }
                }
                case 282: {
                    try {
                        statePc = 285;
                        continue stateLoop;
                    } catch (Throwable stateCaught_282) {
                        caughtException = stateCaught_282;
                        statePc = 283;
                        continue stateLoop;
                    }
                }
                case 283: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_283) {
                        caughtException = stateCaught_283;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 284: {
                    try {
                        var4_int = var4_int | this.a(var11 + 13, 123);
                        statePc = 285;
                        continue stateLoop;
                    } catch (Throwable stateCaught_284) {
                        caughtException = stateCaught_284;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 285: {
                    try {
                        if (var7 != 0) {
                            statePc = 301;
                        } else {
                            statePc = 286;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_285) {
                        caughtException = stateCaught_285;
                        statePc = 289;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        stackOut_286_0 = var8;
                        stackIn_287_0 = stackOut_286_0;
                        statePc = 287;
                        continue stateLoop;
                    } catch (Throwable stateCaught_286) {
                        caughtException = stateCaught_286;
                        statePc = 289;
                        continue stateLoop;
                    }
                }
                case 287: {
                    try {
                        if (stackIn_287_0 == 0) {
                            statePc = 301;
                        } else {
                            statePc = 288;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_287) {
                        caughtException = stateCaught_287;
                        statePc = 293;
                        continue stateLoop;
                    }
                }
                case 288: {
                    try {
                        statePc = 290;
                        continue stateLoop;
                    } catch (Throwable stateCaught_288) {
                        caughtException = stateCaught_288;
                        statePc = 293;
                        continue stateLoop;
                    }
                }
                case 289: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_289) {
                        caughtException = stateCaught_289;
                        statePc = 293;
                        continue stateLoop;
                    }
                }
                case 290: {
                    try {
                        stackOut_290_0 = var9;
                        stackIn_291_0 = stackOut_290_0;
                        statePc = 291;
                        continue stateLoop;
                    } catch (Throwable stateCaught_290) {
                        caughtException = stateCaught_290;
                        statePc = 293;
                        continue stateLoop;
                    }
                }
                case 291: {
                    try {
                        if (stackIn_291_0 == 0) {
                            statePc = 301;
                        } else {
                            statePc = 292;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_291) {
                        caughtException = stateCaught_291;
                        statePc = 297;
                        continue stateLoop;
                    }
                }
                case 292: {
                    try {
                        statePc = 294;
                        continue stateLoop;
                    } catch (Throwable stateCaught_292) {
                        caughtException = stateCaught_292;
                        statePc = 297;
                        continue stateLoop;
                    }
                }
                case 293: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_293) {
                        caughtException = stateCaught_293;
                        statePc = 297;
                        continue stateLoop;
                    }
                }
                case 294: {
                    try {
                        stackOut_294_0 = var10;
                        stackIn_295_0 = stackOut_294_0;
                        statePc = 295;
                        continue stateLoop;
                    } catch (Throwable stateCaught_294) {
                        caughtException = stateCaught_294;
                        statePc = 297;
                        continue stateLoop;
                    }
                }
                case 295: {
                    try {
                        if (stackIn_295_0 == 0) {
                            statePc = 300;
                        } else {
                            statePc = 296;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_295) {
                        caughtException = stateCaught_295;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 296: {
                    try {
                        statePc = 298;
                        continue stateLoop;
                    } catch (Throwable stateCaught_296) {
                        caughtException = stateCaught_296;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 297: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_297) {
                        caughtException = stateCaught_297;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 298: {
                    try {
                        statePc = 301;
                        continue stateLoop;
                    } catch (Throwable stateCaught_298) {
                        caughtException = stateCaught_298;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 299: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_299) {
                        caughtException = stateCaught_299;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 300: {
                    try {
                        var4_int = var4_int | this.a(16 + var11, 71);
                        statePc = 301;
                        continue stateLoop;
                    } catch (Throwable stateCaught_300) {
                        caughtException = stateCaught_300;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 301: {
                    try {
                        if (var7 != 0) {
                            statePc = 314;
                        } else {
                            statePc = 302;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_301) {
                        caughtException = stateCaught_301;
                        statePc = 305;
                        continue stateLoop;
                    }
                }
                case 302: {
                    try {
                        stackOut_302_0 = var8;
                        stackIn_303_0 = stackOut_302_0;
                        statePc = 303;
                        continue stateLoop;
                    } catch (Throwable stateCaught_302) {
                        caughtException = stateCaught_302;
                        statePc = 305;
                        continue stateLoop;
                    }
                }
                case 303: {
                    try {
                        if (stackIn_303_0 == 0) {
                            statePc = 314;
                        } else {
                            statePc = 304;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_303) {
                        caughtException = stateCaught_303;
                        statePc = 309;
                        continue stateLoop;
                    }
                }
                case 304: {
                    try {
                        statePc = 306;
                        continue stateLoop;
                    } catch (Throwable stateCaught_304) {
                        caughtException = stateCaught_304;
                        statePc = 309;
                        continue stateLoop;
                    }
                }
                case 305: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_305) {
                        caughtException = stateCaught_305;
                        statePc = 309;
                        continue stateLoop;
                    }
                }
                case 306: {
                    try {
                        stackOut_306_0 = var9;
                        stackIn_307_0 = stackOut_306_0;
                        statePc = 307;
                        continue stateLoop;
                    } catch (Throwable stateCaught_306) {
                        caughtException = stateCaught_306;
                        statePc = 309;
                        continue stateLoop;
                    }
                }
                case 307: {
                    try {
                        if (stackIn_307_0 != 0) {
                            statePc = 314;
                        } else {
                            statePc = 308;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_307) {
                        caughtException = stateCaught_307;
                        statePc = 312;
                        continue stateLoop;
                    }
                }
                case 308: {
                    try {
                        statePc = 310;
                        continue stateLoop;
                    } catch (Throwable stateCaught_308) {
                        caughtException = stateCaught_308;
                        statePc = 312;
                        continue stateLoop;
                    }
                }
                case 309: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_309) {
                        caughtException = stateCaught_309;
                        statePc = 312;
                        continue stateLoop;
                    }
                }
                case 310: {
                    try {
                        if (var10 == 0) {
                            statePc = 314;
                        } else {
                            statePc = 311;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_310) {
                        caughtException = stateCaught_310;
                        statePc = 312;
                        continue stateLoop;
                    }
                }
                case 311: {
                    try {
                        statePc = 313;
                        continue stateLoop;
                    } catch (Throwable stateCaught_311) {
                        caughtException = stateCaught_311;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 312: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_312) {
                        caughtException = stateCaught_312;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 313: {
                    try {
                        var4_int = var4_int | this.a(var11 + 17, param0 + 5);
                        statePc = 314;
                        continue stateLoop;
                    } catch (Throwable stateCaught_313) {
                        caughtException = stateCaught_313;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 314: {
                    try {
                        if (var7 != 0) {
                            statePc = 327;
                        } else {
                            statePc = 315;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_314) {
                        caughtException = stateCaught_314;
                        statePc = 318;
                        continue stateLoop;
                    }
                }
                case 315: {
                    try {
                        stackOut_315_0 = var8;
                        stackIn_316_0 = stackOut_315_0;
                        statePc = 316;
                        continue stateLoop;
                    } catch (Throwable stateCaught_315) {
                        caughtException = stateCaught_315;
                        statePc = 318;
                        continue stateLoop;
                    }
                }
                case 316: {
                    try {
                        if (stackIn_316_0 == 0) {
                            statePc = 327;
                        } else {
                            statePc = 317;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_316) {
                        caughtException = stateCaught_316;
                        statePc = 322;
                        continue stateLoop;
                    }
                }
                case 317: {
                    try {
                        statePc = 319;
                        continue stateLoop;
                    } catch (Throwable stateCaught_317) {
                        caughtException = stateCaught_317;
                        statePc = 322;
                        continue stateLoop;
                    }
                }
                case 318: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_318) {
                        caughtException = stateCaught_318;
                        statePc = 322;
                        continue stateLoop;
                    }
                }
                case 319: {
                    try {
                        stackOut_319_0 = var9;
                        stackIn_320_0 = stackOut_319_0;
                        statePc = 320;
                        continue stateLoop;
                    } catch (Throwable stateCaught_319) {
                        caughtException = stateCaught_319;
                        statePc = 322;
                        continue stateLoop;
                    }
                }
                case 320: {
                    try {
                        if (stackIn_320_0 != 0) {
                            statePc = 327;
                        } else {
                            statePc = 321;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_320) {
                        caughtException = stateCaught_320;
                        statePc = 325;
                        continue stateLoop;
                    }
                }
                case 321: {
                    try {
                        statePc = 323;
                        continue stateLoop;
                    } catch (Throwable stateCaught_321) {
                        caughtException = stateCaught_321;
                        statePc = 325;
                        continue stateLoop;
                    }
                }
                case 322: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_322) {
                        caughtException = stateCaught_322;
                        statePc = 325;
                        continue stateLoop;
                    }
                }
                case 323: {
                    try {
                        if (var10 != 0) {
                            statePc = 327;
                        } else {
                            statePc = 324;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_323) {
                        caughtException = stateCaught_323;
                        statePc = 325;
                        continue stateLoop;
                    }
                }
                case 324: {
                    try {
                        statePc = 326;
                        continue stateLoop;
                    } catch (Throwable stateCaught_324) {
                        caughtException = stateCaught_324;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 325: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_325) {
                        caughtException = stateCaught_325;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 326: {
                    try {
                        var4_int = var4_int | this.a(var11 + 20, 120);
                        statePc = 327;
                        continue stateLoop;
                    } catch (Throwable stateCaught_326) {
                        caughtException = stateCaught_326;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 327: {
                    try {
                        if (var7 != 0) {
                            statePc = 340;
                        } else {
                            statePc = 328;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_327) {
                        caughtException = stateCaught_327;
                        statePc = 331;
                        continue stateLoop;
                    }
                }
                case 328: {
                    try {
                        stackOut_328_0 = var8;
                        stackIn_329_0 = stackOut_328_0;
                        statePc = 329;
                        continue stateLoop;
                    } catch (Throwable stateCaught_328) {
                        caughtException = stateCaught_328;
                        statePc = 331;
                        continue stateLoop;
                    }
                }
                case 329: {
                    try {
                        if (stackIn_329_0 != 0) {
                            statePc = 340;
                        } else {
                            statePc = 330;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_329) {
                        caughtException = stateCaught_329;
                        statePc = 335;
                        continue stateLoop;
                    }
                }
                case 330: {
                    try {
                        statePc = 332;
                        continue stateLoop;
                    } catch (Throwable stateCaught_330) {
                        caughtException = stateCaught_330;
                        statePc = 335;
                        continue stateLoop;
                    }
                }
                case 331: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_331) {
                        caughtException = stateCaught_331;
                        statePc = 335;
                        continue stateLoop;
                    }
                }
                case 332: {
                    try {
                        stackOut_332_0 = var9;
                        stackIn_333_0 = stackOut_332_0;
                        statePc = 333;
                        continue stateLoop;
                    } catch (Throwable stateCaught_332) {
                        caughtException = stateCaught_332;
                        statePc = 335;
                        continue stateLoop;
                    }
                }
                case 333: {
                    try {
                        if (stackIn_333_0 == 0) {
                            statePc = 340;
                        } else {
                            statePc = 334;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_333) {
                        caughtException = stateCaught_333;
                        statePc = 338;
                        continue stateLoop;
                    }
                }
                case 334: {
                    try {
                        statePc = 336;
                        continue stateLoop;
                    } catch (Throwable stateCaught_334) {
                        caughtException = stateCaught_334;
                        statePc = 338;
                        continue stateLoop;
                    }
                }
                case 335: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_335) {
                        caughtException = stateCaught_335;
                        statePc = 338;
                        continue stateLoop;
                    }
                }
                case 336: {
                    try {
                        if (var10 == 0) {
                            statePc = 340;
                        } else {
                            statePc = 337;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_336) {
                        caughtException = stateCaught_336;
                        statePc = 338;
                        continue stateLoop;
                    }
                }
                case 337: {
                    try {
                        statePc = 339;
                        continue stateLoop;
                    } catch (Throwable stateCaught_337) {
                        caughtException = stateCaught_337;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 338: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_338) {
                        caughtException = stateCaught_338;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 339: {
                    try {
                        var4_int = var4_int | this.a(19 - -var11, 113);
                        statePc = 340;
                        continue stateLoop;
                    } catch (Throwable stateCaught_339) {
                        caughtException = stateCaught_339;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 340: {
                    try {
                        if (var7 != 0) {
                            statePc = 356;
                        } else {
                            statePc = 341;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_340) {
                        caughtException = stateCaught_340;
                        statePc = 344;
                        continue stateLoop;
                    }
                }
                case 341: {
                    try {
                        stackOut_341_0 = var8;
                        stackIn_342_0 = stackOut_341_0;
                        statePc = 342;
                        continue stateLoop;
                    } catch (Throwable stateCaught_341) {
                        caughtException = stateCaught_341;
                        statePc = 344;
                        continue stateLoop;
                    }
                }
                case 342: {
                    try {
                        if (stackIn_342_0 != 0) {
                            statePc = 356;
                        } else {
                            statePc = 343;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_342) {
                        caughtException = stateCaught_342;
                        statePc = 348;
                        continue stateLoop;
                    }
                }
                case 343: {
                    try {
                        statePc = 345;
                        continue stateLoop;
                    } catch (Throwable stateCaught_343) {
                        caughtException = stateCaught_343;
                        statePc = 348;
                        continue stateLoop;
                    }
                }
                case 344: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_344) {
                        caughtException = stateCaught_344;
                        statePc = 348;
                        continue stateLoop;
                    }
                }
                case 345: {
                    try {
                        stackOut_345_0 = var9;
                        stackIn_346_0 = stackOut_345_0;
                        statePc = 346;
                        continue stateLoop;
                    } catch (Throwable stateCaught_345) {
                        caughtException = stateCaught_345;
                        statePc = 348;
                        continue stateLoop;
                    }
                }
                case 346: {
                    try {
                        if (stackIn_346_0 == 0) {
                            statePc = 356;
                        } else {
                            statePc = 347;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_346) {
                        caughtException = stateCaught_346;
                        statePc = 352;
                        continue stateLoop;
                    }
                }
                case 347: {
                    try {
                        statePc = 349;
                        continue stateLoop;
                    } catch (Throwable stateCaught_347) {
                        caughtException = stateCaught_347;
                        statePc = 352;
                        continue stateLoop;
                    }
                }
                case 348: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_348) {
                        caughtException = stateCaught_348;
                        statePc = 352;
                        continue stateLoop;
                    }
                }
                case 349: {
                    try {
                        stackOut_349_0 = var10;
                        stackIn_350_0 = stackOut_349_0;
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_349) {
                        caughtException = stateCaught_349;
                        statePc = 352;
                        continue stateLoop;
                    }
                }
                case 350: {
                    try {
                        if (stackIn_350_0 == 0) {
                            statePc = 355;
                        } else {
                            statePc = 351;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_350) {
                        caughtException = stateCaught_350;
                        statePc = 354;
                        continue stateLoop;
                    }
                }
                case 351: {
                    try {
                        statePc = 353;
                        continue stateLoop;
                    } catch (Throwable stateCaught_351) {
                        caughtException = stateCaught_351;
                        statePc = 354;
                        continue stateLoop;
                    }
                }
                case 352: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_352) {
                        caughtException = stateCaught_352;
                        statePc = 354;
                        continue stateLoop;
                    }
                }
                case 353: {
                    try {
                        statePc = 356;
                        continue stateLoop;
                    } catch (Throwable stateCaught_353) {
                        caughtException = stateCaught_353;
                        statePc = 354;
                        continue stateLoop;
                    }
                }
                case 354: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_354) {
                        caughtException = stateCaught_354;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 355: {
                    try {
                        var4_int = var4_int | this.a(var11 + 22, -17);
                        statePc = 356;
                        continue stateLoop;
                    } catch (Throwable stateCaught_355) {
                        caughtException = stateCaught_355;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 356: {
                    try {
                        if (var7 != 0) {
                            statePc = 369;
                        } else {
                            statePc = 357;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_356) {
                        caughtException = stateCaught_356;
                        statePc = 360;
                        continue stateLoop;
                    }
                }
                case 357: {
                    try {
                        stackOut_357_0 = var8;
                        stackIn_358_0 = stackOut_357_0;
                        statePc = 358;
                        continue stateLoop;
                    } catch (Throwable stateCaught_357) {
                        caughtException = stateCaught_357;
                        statePc = 360;
                        continue stateLoop;
                    }
                }
                case 358: {
                    try {
                        if (stackIn_358_0 != 0) {
                            statePc = 369;
                        } else {
                            statePc = 359;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_358) {
                        caughtException = stateCaught_358;
                        statePc = 364;
                        continue stateLoop;
                    }
                }
                case 359: {
                    try {
                        statePc = 361;
                        continue stateLoop;
                    } catch (Throwable stateCaught_359) {
                        caughtException = stateCaught_359;
                        statePc = 364;
                        continue stateLoop;
                    }
                }
                case 360: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_360) {
                        caughtException = stateCaught_360;
                        statePc = 364;
                        continue stateLoop;
                    }
                }
                case 361: {
                    try {
                        stackOut_361_0 = var9;
                        stackIn_362_0 = stackOut_361_0;
                        statePc = 362;
                        continue stateLoop;
                    } catch (Throwable stateCaught_361) {
                        caughtException = stateCaught_361;
                        statePc = 364;
                        continue stateLoop;
                    }
                }
                case 362: {
                    try {
                        if (stackIn_362_0 != 0) {
                            statePc = 369;
                        } else {
                            statePc = 363;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_362) {
                        caughtException = stateCaught_362;
                        statePc = 367;
                        continue stateLoop;
                    }
                }
                case 363: {
                    try {
                        statePc = 365;
                        continue stateLoop;
                    } catch (Throwable stateCaught_363) {
                        caughtException = stateCaught_363;
                        statePc = 367;
                        continue stateLoop;
                    }
                }
                case 364: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_364) {
                        caughtException = stateCaught_364;
                        statePc = 367;
                        continue stateLoop;
                    }
                }
                case 365: {
                    try {
                        if (var10 == 0) {
                            statePc = 369;
                        } else {
                            statePc = 366;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_365) {
                        caughtException = stateCaught_365;
                        statePc = 367;
                        continue stateLoop;
                    }
                }
                case 366: {
                    try {
                        statePc = 368;
                        continue stateLoop;
                    } catch (Throwable stateCaught_366) {
                        caughtException = stateCaught_366;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 367: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_367) {
                        caughtException = stateCaught_367;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 368: {
                    try {
                        var4_int = var4_int | this.a(23 + var11, -85);
                        statePc = 369;
                        continue stateLoop;
                    } catch (Throwable stateCaught_368) {
                        caughtException = stateCaught_368;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 369: {
                    try {
                        if (var7 != 0) {
                            statePc = 382;
                        } else {
                            statePc = 370;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_369) {
                        caughtException = stateCaught_369;
                        statePc = 373;
                        continue stateLoop;
                    }
                }
                case 370: {
                    try {
                        stackOut_370_0 = var8;
                        stackIn_371_0 = stackOut_370_0;
                        statePc = 371;
                        continue stateLoop;
                    } catch (Throwable stateCaught_370) {
                        caughtException = stateCaught_370;
                        statePc = 373;
                        continue stateLoop;
                    }
                }
                case 371: {
                    try {
                        if (stackIn_371_0 != 0) {
                            statePc = 382;
                        } else {
                            statePc = 372;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_371) {
                        caughtException = stateCaught_371;
                        statePc = 377;
                        continue stateLoop;
                    }
                }
                case 372: {
                    try {
                        statePc = 374;
                        continue stateLoop;
                    } catch (Throwable stateCaught_372) {
                        caughtException = stateCaught_372;
                        statePc = 377;
                        continue stateLoop;
                    }
                }
                case 373: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_373) {
                        caughtException = stateCaught_373;
                        statePc = 377;
                        continue stateLoop;
                    }
                }
                case 374: {
                    try {
                        stackOut_374_0 = var9;
                        stackIn_375_0 = stackOut_374_0;
                        statePc = 375;
                        continue stateLoop;
                    } catch (Throwable stateCaught_374) {
                        caughtException = stateCaught_374;
                        statePc = 377;
                        continue stateLoop;
                    }
                }
                case 375: {
                    try {
                        if (stackIn_375_0 != 0) {
                            statePc = 382;
                        } else {
                            statePc = 376;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_375) {
                        caughtException = stateCaught_375;
                        statePc = 380;
                        continue stateLoop;
                    }
                }
                case 376: {
                    try {
                        statePc = 378;
                        continue stateLoop;
                    } catch (Throwable stateCaught_376) {
                        caughtException = stateCaught_376;
                        statePc = 380;
                        continue stateLoop;
                    }
                }
                case 377: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_377) {
                        caughtException = stateCaught_377;
                        statePc = 380;
                        continue stateLoop;
                    }
                }
                case 378: {
                    try {
                        if (var10 != 0) {
                            statePc = 382;
                        } else {
                            statePc = 379;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_378) {
                        caughtException = stateCaught_378;
                        statePc = 380;
                        continue stateLoop;
                    }
                }
                case 379: {
                    try {
                        statePc = 381;
                        continue stateLoop;
                    } catch (Throwable stateCaught_379) {
                        caughtException = stateCaught_379;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 380: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_380) {
                        caughtException = stateCaught_380;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 381: {
                    try {
                        var4_int = var4_int | this.a(24 - -var11, param0 + 148);
                        statePc = 382;
                        continue stateLoop;
                    } catch (Throwable stateCaught_381) {
                        caughtException = stateCaught_381;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 382: {
                    try {
                        if (-1 == (var4_int & 65408 ^ -1)) {
                            statePc = 385;
                        } else {
                            statePc = 383;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_382) {
                        caughtException = stateCaught_382;
                        statePc = 384;
                        continue stateLoop;
                    }
                }
                case 383: {
                    try {
                        statePc = 386;
                        continue stateLoop;
                    } catch (Throwable stateCaught_383) {
                        caughtException = stateCaught_383;
                        statePc = 384;
                        continue stateLoop;
                    }
                }
                case 384: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_384) {
                        caughtException = stateCaught_384;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 385: {
                    try {
                        var4_int = var4_int | this.a(24 - -var11, 80);
                        statePc = 386;
                        continue stateLoop;
                    } catch (Throwable stateCaught_385) {
                        caughtException = stateCaught_385;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 386: {
                    try {
                        stackOut_386_0 = var4_int;
                        stackIn_387_0 = stackOut_386_0;
                        statePc = 387;
                        continue stateLoop;
                    } catch (Throwable stateCaught_386) {
                        caughtException = stateCaught_386;
                        statePc = 388;
                        continue stateLoop;
                    }
                }
                case 387: {
                    return stackIn_387_0;
                }
                case 388: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw sh.a((Throwable) (Object) var4, "on.C(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "OK";
        field_g = new vo();
    }
}
