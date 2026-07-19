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
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                if (!this.field_e) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            this.field_e = false;
            qk.n((byte) 96);
            var3_int = param0;
            L2: while (true) {
              L3: {
                L4: {
                  if (this.field_h.length <= var3_int) {
                    break L4;
                  } else {
                    if (var7 != 0) {
                      break L3;
                    } else {
                      var4 = 0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if ((this.field_h[0].length ^ -1) >= (var4 ^ -1)) {
                              break L7;
                            } else {
                              var5 = (127 & this.field_f[var3_int][var4]) >> 2083899776;
                              var6 = ub.a(127, var5);
                              if (var7 != 0) {
                                break L6;
                              } else {
                                L8: {
                                  if (var6 != null) {
                                    this.field_h[var3_int][var4] = hi.a(eg.a(this.field_h[var3_int][var4], -128), var6.field_g);
                                    this.field_e = true;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                var4++;
                                if (var7 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var3_int++;
                          break L6;
                        }
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) runtimeException), "on.N(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        boolean discarded$2 = false;
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_g = null;
              field_n = null;
              if (param0 == 122) {
                break L1;
              } else {
                discarded$2 = on.b(-118);
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
        int stackOut_244_0 = 0;
        int stackOut_246_0 = 0;
        int stackOut_257_0 = 0;
        int stackOut_259_0 = 0;
        int stackOut_270_0 = 0;
        int stackOut_272_0 = 0;
        int stackOut_280_0 = 0;
        int stackOut_282_0 = 0;
        int stackOut_334_0 = 0;
        int stackOut_332_0 = 0;
        int stackOut_600_0 = 0;
        int stackOut_248_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_238_0 = 0;
        int stackOut_2_0 = 0;
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
                            stackOut_244_0 = 1;
                            stackIn_247_0 = stackOut_244_0;
                            break L2;
                          }
                        }
                      }
                      stackOut_246_0 = 0;
                      stackIn_247_0 = stackOut_246_0;
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
                            stackOut_257_0 = 1;
                            stackIn_260_0 = stackOut_257_0;
                            break L4;
                          }
                        }
                        stackOut_259_0 = 0;
                        stackIn_260_0 = stackOut_259_0;
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
                          stackOut_270_0 = 1;
                          stackIn_273_0 = stackOut_270_0;
                          break L7;
                        }
                        stackOut_272_0 = 0;
                        stackIn_273_0 = stackOut_272_0;
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
                            stackOut_280_0 = 1;
                            stackIn_283_0 = stackOut_280_0;
                            break L11;
                          }
                        }
                        stackOut_282_0 = 0;
                        stackIn_283_0 = stackOut_282_0;
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
                              stackOut_334_0 = 128;
                              stackIn_335_0 = stackOut_334_0;
                              break L26;
                            } else {
                              stackOut_332_0 = 0;
                              stackIn_335_0 = stackOut_332_0;
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
                      stackOut_600_0 = var4_int;
                      stackIn_601_0 = stackOut_600_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackOut_248_0 = -64;
                      stackIn_249_0 = stackOut_248_0;
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
                    stackOut_21_0 = 1;
                    stackIn_24_0 = stackOut_21_0;
                    break L53;
                  }
                }
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
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
                      stackOut_34_0 = 1;
                      stackIn_37_0 = stackOut_34_0;
                      break L57;
                    }
                  }
                }
                stackOut_36_0 = 0;
                stackIn_37_0 = stackOut_36_0;
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
                      stackOut_41_0 = 1;
                      stackIn_44_0 = stackOut_41_0;
                      break L60;
                    }
                  }
                }
                stackOut_43_0 = 0;
                stackIn_44_0 = stackOut_43_0;
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
              stackOut_238_0 = var4_int;
              stackIn_239_0 = stackOut_238_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = this.b((byte) -61, param0, param1);
              stackIn_3_0 = stackOut_2_0;
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
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int[] stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int[] stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            if (param1 == -39) {
              var3_int = 0;
              L1: while (true) {
                stackOut_4_0 = param0.length ^ -1;
                stackOut_4_1 = var3_int ^ -1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (stackIn_5_0 >= stackIn_5_1) {
                        break L4;
                      } else {
                        stackOut_6_0 = 0;
                        stackIn_21_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var6 != 0) {
                          break L3;
                        } else {
                          var4 = stackIn_7_0;
                          L5: while (true) {
                            L6: {
                              if ((var4 ^ -1) <= (param0[0].length ^ -1)) {
                                break L6;
                              } else {
                                stackOut_9_0 = -1;
                                stackOut_9_1 = param0[var3_int][var4] & 33554432 ^ -1;
                                stackIn_5_0 = stackOut_9_0;
                                stackIn_5_1 = stackOut_9_1;
                                stackIn_10_0 = stackOut_9_0;
                                stackIn_10_1 = stackOut_9_1;
                                if (var6 != 0) {
                                  continue L2;
                                } else {
                                  L7: {
                                    if (stackIn_10_0 != stackIn_10_1) {
                                      stackOut_13_0 = 0;
                                      stackIn_14_0 = stackOut_13_0;
                                      break L7;
                                    } else {
                                      stackOut_11_0 = 1;
                                      stackIn_14_0 = stackOut_11_0;
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    var5 = stackIn_14_0;
                                    stackOut_14_0 = this.field_t[var3_int];
                                    stackOut_14_1 = var4;
                                    stackOut_14_2 = this.field_p[var3_int];
                                    stackOut_14_3 = var4;
                                    stackIn_17_0 = stackOut_14_0;
                                    stackIn_17_1 = stackOut_14_1;
                                    stackIn_17_2 = stackOut_14_2;
                                    stackIn_17_3 = stackOut_14_3;
                                    stackIn_15_0 = stackOut_14_0;
                                    stackIn_15_1 = stackOut_14_1;
                                    stackIn_15_2 = stackOut_14_2;
                                    stackIn_15_3 = stackOut_14_3;
                                    if (var5 == 0) {
                                      stackOut_17_0 = (int[]) ((Object) stackIn_17_0);
                                      stackOut_17_1 = stackIn_17_1;
                                      stackOut_17_2 = (int[]) ((Object) stackIn_17_2);
                                      stackOut_17_3 = stackIn_17_3;
                                      stackOut_17_4 = 0;
                                      stackIn_18_0 = stackOut_17_0;
                                      stackIn_18_1 = stackOut_17_1;
                                      stackIn_18_2 = stackOut_17_2;
                                      stackIn_18_3 = stackOut_17_3;
                                      stackIn_18_4 = stackOut_17_4;
                                      break L8;
                                    } else {
                                      stackOut_15_0 = (int[]) ((Object) stackIn_15_0);
                                      stackOut_15_1 = stackIn_15_1;
                                      stackOut_15_2 = (int[]) ((Object) stackIn_15_2);
                                      stackOut_15_3 = stackIn_15_3;
                                      stackOut_15_4 = 1;
                                      stackIn_18_0 = stackOut_15_0;
                                      stackIn_18_1 = stackOut_15_1;
                                      stackIn_18_2 = stackOut_15_2;
                                      stackIn_18_3 = stackOut_15_3;
                                      stackIn_18_4 = stackOut_15_4;
                                      break L8;
                                    }
                                  }
                                  stackIn_18_2[stackIn_18_3] = stackIn_18_4;
                                  stackIn_18_0[stackIn_18_1] = stackIn_18_4;
                                  var4++;
                                  if (var6 == 0) {
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var3_int++;
                            if (var6 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L3;
                  }
                  var3_int = stackIn_21_0;
                  L9: while (true) {
                    stackOut_22_0 = var3_int;
                    stackOut_22_1 = param0.length;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    L10: while (true) {
                      L11: {
                        L12: {
                          if (stackIn_23_0 >= stackIn_23_1) {
                            break L12;
                          } else {
                            if (var6 != 0) {
                              break L11;
                            } else {
                              var4 = 1;
                              L13: while (true) {
                                L14: {
                                  if (var4 >= param0[0].length + -1) {
                                    break L14;
                                  } else {
                                    stackOut_27_0 = -2;
                                    stackOut_27_1 = this.field_p[var3_int][var4] & 1 ^ -1;
                                    stackIn_23_0 = stackOut_27_0;
                                    stackIn_23_1 = stackOut_27_1;
                                    stackIn_28_0 = stackOut_27_0;
                                    stackIn_28_1 = stackOut_27_1;
                                    if (var6 != 0) {
                                      continue L10;
                                    } else {
                                      L15: {
                                        if (stackIn_28_0 == stackIn_28_1) {
                                          dupTemp$2 = hi.a(this.field_p[var3_int][var4 - -1], 2);
                                          this.field_p[var3_int][1 + var4] = dupTemp$2;
                                          this.field_t[var3_int][1 + var4] = dupTemp$2;
                                          dupTemp$3 = hi.a(this.field_p[var3_int][-1 + var4], 4);
                                          this.field_p[var3_int][var4 + -1] = dupTemp$3;
                                          this.field_t[var3_int][var4 - 1] = dupTemp$3;
                                          break L15;
                                        } else {
                                          break L15;
                                        }
                                      }
                                      var4++;
                                      if (var6 == 0) {
                                        continue L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                                var3_int++;
                                if (var6 == 0) {
                                  continue L9;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                        break L11;
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var3);
            stackOut_34_1 = new StringBuilder().append("on.V(");
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L16;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L16;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final fb a(int param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        ah var8 = null;
        gb var8_ref = null;
        kd stackIn_2_0 = null;
        oo stackIn_22_0 = null;
        gb stackIn_28_0 = null;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        Object stackIn_40_0 = null;
        Object stackIn_45_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        gb stackOut_27_0 = null;
        oo stackOut_21_0 = null;
        Object stackOut_44_0 = null;
        Object stackOut_39_0 = null;
        kd stackOut_1_0 = null;
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
                        stackOut_32_0 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        break L2;
                      } else {
                        stackOut_30_0 = 1;
                        stackIn_33_0 = stackOut_30_0;
                        break L2;
                      }
                    }
                    L3: {
                      stackOut_33_0 = stackIn_33_0;
                      stackOut_33_1 = param1;
                      stackOut_33_2 = param0;
                      stackIn_36_0 = stackOut_33_0;
                      stackIn_36_1 = stackOut_33_1;
                      stackIn_36_2 = stackOut_33_2;
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      stackIn_34_2 = stackOut_33_2;
                      if ((536870912 & param2) <= 0) {
                        stackOut_36_0 = stackIn_36_0;
                        stackOut_36_1 = stackIn_36_1;
                        stackOut_36_2 = stackIn_36_2;
                        stackOut_36_3 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        stackIn_37_3 = stackOut_36_3;
                        break L3;
                      } else {
                        stackOut_34_0 = stackIn_34_0;
                        stackOut_34_1 = stackIn_34_1;
                        stackOut_34_2 = stackIn_34_2;
                        stackOut_34_3 = 1;
                        stackIn_37_0 = stackOut_34_0;
                        stackIn_37_1 = stackOut_34_1;
                        stackIn_37_2 = stackOut_34_2;
                        stackIn_37_3 = stackOut_34_3;
                        break L3;
                      }
                    }
                    var7 = co.a(stackIn_37_0 != 0, stackIn_37_1, stackIn_37_2, stackIn_37_3 != 0, var6_int & -1610612737, -19653);
                    ((id) (var7)).field_E = param2 >> 606456887 & 3;
                    break L1;
                  } else {
                    if ((param3 ^ -1) == -4) {
                      L4: {
                        var6_int = var6_int & -134217729;
                        var8_ref = new gb(param0, param1, var6_int);
                        if (0 != (134217728 & param2)) {
                          var8_ref.field_C = true;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      stackOut_27_0 = (gb) (var8_ref);
                      stackIn_28_0 = stackOut_27_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (param3 == 4) {
                        stackOut_21_0 = new oo(param0, param1, param2);
                        stackIn_22_0 = stackOut_21_0;
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
                    var8 = eo.a(60, param0, var6_int, param1);
                    if ((param2 & 67108864 ^ -1) == -1) {
                      break L5;
                    } else {
                      var8.field_ib = true;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = var8;
                    if (-1 != (134217728 & param2 ^ -1)) {
                      var8.field_C = true;
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
                stackOut_44_0 = null;
                stackIn_45_0 = stackOut_44_0;
                decompiledRegionSelector0 = 4;
                break L0;
              } else {
                ((fb) (var7)).field_z = (param2 & 25165824) >> 738869015;
                stackOut_39_0 = var7;
                stackIn_40_0 = stackOut_39_0;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackOut_1_0 = new kd(param0, param1, 3 & param2, param2 >> -1588842078 & 3);
              stackIn_2_0 = stackOut_1_0;
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
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = 1;
                stackIn_10_0 = stackOut_7_0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
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
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
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
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
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
        int stackIn_34_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_33_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              stackOut_2_0 = param1.length ^ -1;
              stackOut_2_1 = var3_int ^ -1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 >= stackIn_3_1) {
                      break L4;
                    } else {
                      stackOut_4_0 = 0;
                      stackIn_34_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var9 != 0) {
                        break L3;
                      } else {
                        var4 = stackIn_5_0;
                        L5: while (true) {
                          L6: {
                            if ((param1[0].length ^ -1) >= (var4 ^ -1)) {
                              break L6;
                            } else {
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
                                continue L2;
                              } else {
                                L7: {
                                  if (stackIn_8_0 == stackIn_8_1) {
                                    break L7;
                                  } else {
                                    L8: {
                                      L9: {
                                        if ((var6 ^ -1) > -10) {
                                          break L9;
                                        } else {
                                          if (var6 <= 32) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (var7 < 9) {
                                          break L10;
                                        } else {
                                          if (-33 <= (var7 ^ -1)) {
                                            break L8;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      if ((this.c(var4, 1 + var3_int, -65) & 65408) >> 1868421511 == 16) {
                                        break L8;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    var5 = var5 | 67108864;
                                    break L7;
                                  }
                                }
                                L11: {
                                  var8 = this.a(false, var3_int, var4);
                                  var5 = var5 & -128;
                                  if ((65408 & var8 ^ -1) != -1) {
                                    var5 = var5 & -65409;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                var5 = var5 | var8;
                                this.field_h[var3_int][var4] = var5;
                                var4++;
                                if (var9 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var3_int++;
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_33_0 = param0;
                  stackIn_34_0 = stackOut_33_0;
                  break L3;
                }
                L12: {
                  if (stackIn_34_0 >= 92) {
                    break L12;
                  } else {
                    on.a((byte) 51, (ib) null);
                    break L12;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var3);
            stackOut_38_1 = new StringBuilder().append("on.T(").append(param0).append(',');
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L13;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L13;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
        }
    }

    private final int c(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
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
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
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
                stackOut_15_0 = -1;
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (-1 < (param1 ^ -1)) {
                  stackOut_20_0 = -1;
                  stackIn_21_0 = stackOut_20_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if ((this.field_f.length ^ -1) < (param1 ^ -1)) {
                    if (this.field_f[0].length <= param2) {
                      stackOut_28_0 = -1;
                      stackIn_29_0 = stackOut_28_0;
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
                            stackOut_40_0 = 1;
                            stackIn_41_0 = stackOut_40_0;
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
                            stackOut_54_0 = 2;
                            stackIn_55_0 = stackOut_54_0;
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
                          stackOut_62_0 = 3;
                          stackIn_63_0 = stackOut_62_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    stackOut_23_0 = -1;
                    stackIn_24_0 = stackOut_23_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
            if (var4_int > 64) {
              stackOut_67_0 = -1;
              stackIn_68_0 = stackOut_67_0;
              decompiledRegionSelector0 = 8;
              break L0;
            } else {
              stackOut_65_0 = 0;
              stackIn_66_0 = stackOut_65_0;
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
        int discarded$2 = 0;
        RuntimeException var4 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param2 == -1777127001) {
                break L1;
              } else {
                discarded$2 = this.c((byte) 82, 60, -52);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((33554432 & this.a(param0, param1, 1) ^ -1) == -1) {
                  break L3;
                } else {
                  if ((this.a(param0, param1, 1) >> -1777127001 & 511) <= 64) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
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
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        try {
          L0: {
            if (cj.a((byte) 15, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!tb.a(-10723, param1)) {
                if (!tk.a((byte) 84, param1)) {
                  if (-1 != (param2.length() ^ -1)) {
                    if (param0 <= -7) {
                      if (lf.a(param2, param1, -7235)) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!ic.a(param1, param2, 0)) {
                          if (t.a(param1, (byte) 125, param2)) {
                            stackOut_28_0 = 0;
                            stackIn_29_0 = stackOut_28_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            stackOut_30_0 = 1;
                            stackIn_31_0 = stackOut_30_0;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          }
                        } else {
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var3);
            stackOut_32_1 = new StringBuilder().append("on.I(").append(param0).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L1;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L1;
            }
          }
          L2: {
            stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L2;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
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
        int discarded$2 = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if ((33554432 & this.a(param1, param2, 1) ^ -1) != -1) {
              L1: {
                if (param0 < -78) {
                  break L1;
                } else {
                  discarded$2 = this.c((byte) 79, -18, -85);
                  break L1;
                }
              }
              L2: {
                if ((this.c((byte) 41, param2, param1) ^ -1) != 0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_10_0 = stackOut_7_0;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
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
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
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
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_2_0 = 0;
                  stackIn_3_0 = stackOut_2_0;
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
        boolean discarded$2 = false;
        RuntimeException var4 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                discarded$2 = on.a((byte) 71, (String) null, (String) null);
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
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
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
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        RuntimeException var4 = null;
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
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_422_0 = 0;
        int stackOut_420_0 = 0;
        int stackOut_426_0 = 0;
        int stackOut_424_0 = 0;
        int stackOut_430_0 = 0;
        int stackOut_428_0 = 0;
        int stackOut_434_0 = 0;
        int stackOut_432_0 = 0;
        int stackOut_539_0 = 0;
        int stackOut_2_0 = 0;
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
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        break L3;
                      } else {
                        stackOut_8_0 = 1;
                        stackIn_11_0 = stackOut_8_0;
                        break L3;
                      }
                    }
                    L4: {
                      var6 = stackIn_11_0;
                      if ((this.a(param2 + 1, param1 + -1, 1) & 127) != 1) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L4;
                      } else {
                        stackOut_12_0 = 1;
                        stackIn_15_0 = stackOut_12_0;
                        break L4;
                      }
                    }
                    L5: {
                      var7_int = stackIn_15_0;
                      if (-2 != (127 & this.a(1 + param2, 1 + param1, 1) ^ -1)) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_19_0 = stackOut_16_0;
                        break L5;
                      }
                    }
                    L6: {
                      var8_int = stackIn_19_0;
                      if ((127 & this.a(-1 + param2, 1 + param1, 1) ^ -1) != -2) {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        break L6;
                      } else {
                        stackOut_20_0 = 1;
                        stackIn_23_0 = stackOut_20_0;
                        break L6;
                      }
                    }
                    L7: {
                      var9 = stackIn_23_0;
                      if ((127 & this.a(param2, -1 + param1, 1)) != 1) {
                        stackOut_26_0 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        break L7;
                      } else {
                        stackOut_24_0 = 1;
                        stackIn_27_0 = stackOut_24_0;
                        break L7;
                      }
                    }
                    L8: {
                      var10 = stackIn_27_0;
                      if ((this.a(param2 - -1, param1, 1) & 127) != 1) {
                        stackOut_30_0 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        break L8;
                      } else {
                        stackOut_28_0 = 1;
                        stackIn_31_0 = stackOut_28_0;
                        break L8;
                      }
                    }
                    L9: {
                      var11 = stackIn_31_0;
                      if (1 != (127 & this.a(param2, param1 - -1, 1))) {
                        stackOut_34_0 = 0;
                        stackIn_35_0 = stackOut_34_0;
                        break L9;
                      } else {
                        stackOut_32_0 = 1;
                        stackIn_35_0 = stackOut_32_0;
                        break L9;
                      }
                    }
                    L10: {
                      var12 = stackIn_35_0;
                      if (-2 != (127 & this.a(-1 + param2, param1, 1) ^ -1)) {
                        stackOut_38_0 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        break L10;
                      } else {
                        stackOut_36_0 = 1;
                        stackIn_39_0 = stackOut_36_0;
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
                        stackOut_422_0 = 0;
                        stackIn_423_0 = stackOut_422_0;
                        break L54;
                      } else {
                        stackOut_420_0 = 1;
                        stackIn_423_0 = stackOut_420_0;
                        break L54;
                      }
                    }
                    L55: {
                      var9 = stackIn_423_0;
                      if ((this.a(1 + param2, param1, 1) & 127 ^ -1) == (var6 ^ -1)) {
                        stackOut_426_0 = 0;
                        stackIn_427_0 = stackOut_426_0;
                        break L55;
                      } else {
                        stackOut_424_0 = 1;
                        stackIn_427_0 = stackOut_424_0;
                        break L55;
                      }
                    }
                    L56: {
                      var10 = stackIn_427_0;
                      if ((var6 ^ -1) == (this.a(param2, param1 + 1, 1) & 127 ^ -1)) {
                        stackOut_430_0 = 0;
                        stackIn_431_0 = stackOut_430_0;
                        break L56;
                      } else {
                        stackOut_428_0 = 1;
                        stackIn_431_0 = stackOut_428_0;
                        break L56;
                      }
                    }
                    L57: {
                      var11 = stackIn_431_0;
                      if (var6 == (127 & this.a(param2 - 1, param1, 1))) {
                        stackOut_434_0 = 0;
                        stackIn_435_0 = stackOut_434_0;
                        break L57;
                      } else {
                        stackOut_432_0 = 1;
                        stackIn_435_0 = stackOut_432_0;
                        break L57;
                      }
                    }
                    L58: {
                      var12 = stackIn_435_0;
                      discarded$4 = this.a(param2 + -1, -1 + param1, 1);
                      discarded$5 = this.a(param2 - -1, param1 + -1, 1);
                      discarded$6 = this.a(1 + param2, param1 + 1, 1);
                      discarded$7 = this.a(-1 + param2, 1 + param1, 1);
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
              stackOut_539_0 = var4_int;
              stackIn_540_0 = stackOut_539_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = 34;
              stackIn_3_0 = stackOut_2_0;
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
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            stackOut_2_0 = (RuntimeException) (runtimeException);
            stackOut_2_1 = new StringBuilder().append("on.Q(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
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
        RuntimeException decompiledCaughtException = null;
        vo stackOut_6_0 = null;
        vo stackOut_10_0 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param0 == 106) {
                break L1;
              } else {
                field_i = (java.awt.Image) null;
                break L1;
              }
            }
            var2 = new vo();
            var3 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 >= this.field_l.length) {
                    break L4;
                  } else {
                    var4 = this.field_l[var3];
                    var5 = this.field_l[var3 + 1];
                    var6 = this.field_l[2 + var3];
                    var7 = this.field_l[3 + var3];
                    stackOut_6_0 = (vo) (var2);
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var8 != 0) {
                      break L3;
                    } else {
                      ((vo) (Object) stackIn_7_0).a(0, this.a(var6, var7, var5, var4, 1));
                      var3 += 4;
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_10_0 = (vo) (var2);
                stackIn_11_0 = stackOut_10_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "on.G(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    private final int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var3_int = -34 % ((30 - param1) / 39);
            stackOut_0_0 = param0 << -1976960889;
            stackIn_1_0 = stackOut_0_0;
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
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        var13 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var5_int = param0 + param2;
              var6 = param4 + param1;
              if (bi.field_g >= param2) {
                stackOut_4_0 = bi.field_g;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = param2;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_5_0;
              if (bi.field_l >= param4) {
                stackOut_8_0 = bi.field_l;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_6_0 = param4;
                stackIn_9_0 = stackOut_6_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_9_0;
              if (var5_int < bi.field_b) {
                stackOut_12_0 = var5_int;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                stackOut_10_0 = bi.field_b;
                stackIn_13_0 = stackOut_10_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_13_0;
              if ((var6 ^ -1) > (bi.field_d ^ -1)) {
                stackOut_16_0 = var6;
                stackIn_17_0 = stackOut_16_0;
                break L4;
              } else {
                stackOut_14_0 = bi.field_d;
                stackIn_17_0 = stackOut_14_0;
                break L4;
              }
            }
            L5: {
              L6: {
                L7: {
                  var10 = stackIn_17_0;
                  if ((param2 ^ -1) > (bi.field_g ^ -1)) {
                    break L7;
                  } else {
                    if (param2 < bi.field_b) {
                      var11 = var8 * bi.field_f + param2;
                      var12 = var10 + 1 + -var8 >> 1896876385;
                      L8: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L7;
                        } else {
                          bi.field_c[var11] = 16777215;
                          var11 = var11 + bi.field_f * 2;
                          if (var13 != 0) {
                            break L6;
                          } else {
                            if (var13 == 0) {
                              continue L8;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                if (bi.field_l > param4) {
                  break L6;
                } else {
                  if ((bi.field_d ^ -1) >= (var6 ^ -1)) {
                    break L6;
                  } else {
                    var11 = var7 + param4 * bi.field_f;
                    var12 = -var7 + (1 - -var9) >> 511509825;
                    L9: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L6;
                      } else {
                        bi.field_c[var11] = 16777215;
                        var11 += 2;
                        if (var13 != 0) {
                          break L5;
                        } else {
                          if (var13 == 0) {
                            continue L9;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (param3 > 21) {
                break L5;
              } else {
                on.a((byte) 52, (ib) null);
                break L5;
              }
            }
            L10: {
              L11: {
                L12: {
                  if (var5_int < bi.field_g) {
                    break L12;
                  } else {
                    if ((bi.field_b ^ -1) < (var5_int ^ -1)) {
                      var11 = bi.field_f * ((1 & -param2 + var5_int) + var8) - -var5_int;
                      var12 = var10 + (1 - var8) >> 798750145;
                      L13: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L12;
                        } else {
                          bi.field_c[var11] = 16777215;
                          var11 = var11 + 2 * bi.field_f;
                          if (var13 != 0) {
                            break L11;
                          } else {
                            if (var13 == 0) {
                              continue L13;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                if (bi.field_l > param4) {
                  break L11;
                } else {
                  if ((bi.field_d ^ -1) < (var6 ^ -1)) {
                    var11 = (1 & -param4 + var6) + var7 + bi.field_f * var6;
                    var12 = 1 - (-var9 + var7) >> 1787966977;
                    L14: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L11;
                      } else {
                        bi.field_c[var11] = 16777215;
                        var11 += 2;
                        if (var13 != 0) {
                          break L10;
                        } else {
                          if (var13 == 0) {
                            continue L14;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                  } else {
                    break L11;
                  }
                }
              }
              break L10;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5), "on.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
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
                        stackOut_17_0 = this.field_f[param1][param0];
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        stackOut_15_0 = 32;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
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
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        int[] stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int[] stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int[] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        try {
          L0: {
            L1: {
              stackOut_0_0 = this.field_p[param2];
              stackOut_0_1 = param4;
              stackIn_3_0 = stackOut_0_0;
              stackIn_3_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (param0) {
                stackOut_3_0 = (int[]) ((Object) stackIn_3_0);
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_1_0 = (int[]) ((Object) stackIn_1_0);
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 0;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                stackIn_4_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              stackIn_4_0[stackIn_4_1] = hi.a(stackIn_4_2, eg.a(14, this.field_p[param2][param4]));
              if (param1 == 14365) {
                break L2;
              } else {
                discarded$1 = this.a((byte) 91, 88, -54);
                break L2;
              }
            }
            L3: {
              if (!param3) {
                L4: {
                  stackOut_10_0 = this.field_t[param2];
                  stackOut_10_1 = param4;
                  stackIn_13_0 = stackOut_10_0;
                  stackIn_13_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (!param0) {
                    stackOut_13_0 = (int[]) ((Object) stackIn_13_0);
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    break L4;
                  } else {
                    stackOut_11_0 = (int[]) ((Object) stackIn_11_0);
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 1;
                    stackIn_14_0 = stackOut_11_0;
                    stackIn_14_1 = stackOut_11_1;
                    stackIn_14_2 = stackOut_11_2;
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
                  stackOut_18_0 = this.field_p[param2];
                  stackOut_18_1 = 1 + param4;
                  stackOut_18_2 = eg.a(-3, this.field_p[param2][param4 - -1]);
                  stackIn_21_0 = stackOut_18_0;
                  stackIn_21_1 = stackOut_18_1;
                  stackIn_21_2 = stackOut_18_2;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  if (!param0) {
                    stackOut_21_0 = (int[]) ((Object) stackIn_21_0);
                    stackOut_21_1 = stackIn_21_1;
                    stackOut_21_2 = stackIn_21_2;
                    stackOut_21_3 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    stackIn_22_3 = stackOut_21_3;
                    break L6;
                  } else {
                    stackOut_19_0 = (int[]) ((Object) stackIn_19_0);
                    stackOut_19_1 = stackIn_19_1;
                    stackOut_19_2 = stackIn_19_2;
                    stackOut_19_3 = 2;
                    stackIn_22_0 = stackOut_19_0;
                    stackIn_22_1 = stackOut_19_1;
                    stackIn_22_2 = stackOut_19_2;
                    stackIn_22_3 = stackOut_19_3;
                    break L6;
                  }
                }
                stackIn_22_0[stackIn_22_1] = hi.a(stackIn_22_2, stackIn_22_3);
                if (param3) {
                  break L5;
                } else {
                  L7: {
                    stackOut_23_0 = this.field_t[param2];
                    stackOut_23_1 = param4 - -1;
                    stackOut_23_2 = eg.a(this.field_t[param2][1 + param4], -3);
                    stackIn_28_0 = stackOut_23_0;
                    stackIn_28_1 = stackOut_23_1;
                    stackIn_28_2 = stackOut_23_2;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    if (!param0) {
                      stackOut_28_0 = (int[]) ((Object) stackIn_28_0);
                      stackOut_28_1 = stackIn_28_1;
                      stackOut_28_2 = stackIn_28_2;
                      stackOut_28_3 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      stackIn_29_2 = stackOut_28_2;
                      stackIn_29_3 = stackOut_28_3;
                      break L7;
                    } else {
                      stackOut_24_0 = (int[]) ((Object) stackIn_24_0);
                      stackOut_24_1 = stackIn_24_1;
                      stackOut_24_2 = stackIn_24_2;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_26_2 = stackOut_24_2;
                      stackOut_26_0 = (int[]) ((Object) stackIn_26_0);
                      stackOut_26_1 = stackIn_26_1;
                      stackOut_26_2 = stackIn_26_2;
                      stackOut_26_3 = 2;
                      stackIn_29_0 = stackOut_26_0;
                      stackIn_29_1 = stackOut_26_1;
                      stackIn_29_2 = stackOut_26_2;
                      stackIn_29_3 = stackOut_26_3;
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
                  stackOut_31_0 = this.field_p[param2];
                  stackOut_31_1 = -1 + param4;
                  stackIn_36_0 = stackOut_31_0;
                  stackIn_36_1 = stackOut_31_1;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  if (param0) {
                    stackOut_36_0 = (int[]) ((Object) stackIn_36_0);
                    stackOut_36_1 = stackIn_36_1;
                    stackOut_36_2 = 4;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    stackIn_37_2 = stackOut_36_2;
                    break L9;
                  } else {
                    stackOut_32_0 = (int[]) ((Object) stackIn_32_0);
                    stackOut_32_1 = stackIn_32_1;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackOut_34_0 = (int[]) ((Object) stackIn_34_0);
                    stackOut_34_1 = stackIn_34_1;
                    stackOut_34_2 = 0;
                    stackIn_37_0 = stackOut_34_0;
                    stackIn_37_1 = stackOut_34_1;
                    stackIn_37_2 = stackOut_34_2;
                    break L9;
                  }
                }
                stackIn_37_0[stackIn_37_1] = hi.a(stackIn_37_2, eg.a(-5, this.field_p[param2][-1 + param4]));
                if (param3) {
                  break L8;
                } else {
                  L10: {
                    stackOut_38_0 = this.field_t[param2];
                    stackOut_38_1 = param4 - 1;
                    stackIn_43_0 = stackOut_38_0;
                    stackIn_43_1 = stackOut_38_1;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    if (param0) {
                      stackOut_43_0 = (int[]) ((Object) stackIn_43_0);
                      stackOut_43_1 = stackIn_43_1;
                      stackOut_43_2 = 4;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      stackIn_44_2 = stackOut_43_2;
                      break L10;
                    } else {
                      stackOut_39_0 = (int[]) ((Object) stackIn_39_0);
                      stackOut_39_1 = stackIn_39_1;
                      stackIn_41_0 = stackOut_39_0;
                      stackIn_41_1 = stackOut_39_1;
                      stackOut_41_0 = (int[]) ((Object) stackIn_41_0);
                      stackOut_41_1 = stackIn_41_1;
                      stackOut_41_2 = 0;
                      stackIn_44_0 = stackOut_41_0;
                      stackIn_44_1 = stackOut_41_1;
                      stackIn_44_2 = stackOut_41_2;
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
        RuntimeException var11 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
            stackOut_3_0 = (RuntimeException) (var11);
            stackOut_3_1 = new StringBuilder().append("on.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
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
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_325_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_324_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_5_0 = 0;
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
                    stackOut_10_0 = var4_int;
                    stackIn_11_0 = stackOut_10_0;
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
                            stackOut_16_0 = 1;
                            stackIn_19_0 = stackOut_16_0;
                            break L2;
                          }
                        }
                      }
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
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
                            stackOut_25_0 = 0;
                            stackIn_26_0 = stackOut_25_0;
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      stackOut_23_0 = 1;
                      stackIn_26_0 = stackOut_23_0;
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
                                    stackOut_45_0 = var10;
                                    stackIn_51_0 = stackOut_45_0;
                                    stackIn_46_0 = stackOut_45_0;
                                    if (this.a((byte) -94, 1 + param1, 2 + param2)) {
                                      break L13;
                                    } else {
                                      stackOut_46_0 = stackIn_46_0;
                                      stackIn_48_0 = stackOut_46_0;
                                      stackOut_48_0 = stackIn_48_0;
                                      stackIn_53_0 = stackOut_48_0;
                                      stackIn_49_0 = stackOut_48_0;
                                      if (!this.a((byte) -98, param1 + 1, param2 + 1)) {
                                        stackOut_53_0 = stackIn_53_0;
                                        stackOut_53_1 = 0;
                                        stackIn_54_0 = stackOut_53_0;
                                        stackIn_54_1 = stackOut_53_1;
                                        break L12;
                                      } else {
                                        stackOut_49_0 = stackIn_49_0;
                                        stackIn_51_0 = stackOut_49_0;
                                        break L13;
                                      }
                                    }
                                  }
                                  stackOut_51_0 = stackIn_51_0;
                                  stackOut_51_1 = 1;
                                  stackIn_54_0 = stackOut_51_0;
                                  stackIn_54_1 = stackOut_51_1;
                                  break L12;
                                }
                                L14: {
                                  L15: {
                                    var10 = stackIn_54_0 | stackIn_54_1;
                                    stackOut_54_0 = var9;
                                    stackIn_58_0 = stackOut_54_0;
                                    stackIn_55_0 = stackOut_54_0;
                                    if (this.a((byte) -85, param1 - 1, 2 + param2)) {
                                      break L15;
                                    } else {
                                      stackOut_55_0 = stackIn_55_0;
                                      stackIn_60_0 = stackOut_55_0;
                                      stackIn_56_0 = stackOut_55_0;
                                      if (!this.a((byte) -110, -1 + param1, param2 - -1)) {
                                        stackOut_60_0 = stackIn_60_0;
                                        stackOut_60_1 = 0;
                                        stackIn_61_0 = stackOut_60_0;
                                        stackIn_61_1 = stackOut_60_1;
                                        break L14;
                                      } else {
                                        stackOut_56_0 = stackIn_56_0;
                                        stackIn_58_0 = stackOut_56_0;
                                        break L15;
                                      }
                                    }
                                  }
                                  stackOut_58_0 = stackIn_58_0;
                                  stackOut_58_1 = 1;
                                  stackIn_61_0 = stackOut_58_0;
                                  stackIn_61_1 = stackOut_58_1;
                                  break L14;
                                }
                                L16: {
                                  var9 = stackIn_61_0 | stackIn_61_1;
                                  if (this.a((byte) -111, 1 + param1, param2 - -1)) {
                                    stackOut_64_0 = 128;
                                    stackIn_65_0 = stackOut_64_0;
                                    break L16;
                                  } else {
                                    stackOut_62_0 = 0;
                                    stackIn_65_0 = stackOut_62_0;
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
                      stackOut_324_0 = var4_int;
                      stackIn_325_0 = stackOut_324_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackOut_27_0 = 82;
                      stackIn_28_0 = stackOut_27_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = var4_int;
            stackIn_6_0 = stackOut_5_0;
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
