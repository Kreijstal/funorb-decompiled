/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bm extends fc {
    private final boolean c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 33554432) {
                break L1;
              } else {
                this.a(-55);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((33554432 & this.b(param2, (byte) -124, param1) ^ -1) == -1) {
                  break L3;
                } else {
                  if ((this.b(param2, (byte) -75, param1) >> 525947751 & 511) <= 64) {
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
          throw fa.a((Throwable) ((Object) var4), "bm.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final int b(int param0, int param1, int param2) {
        int discarded$0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_270_0 = 0;
        int stackIn_273_0 = 0;
        int stackIn_273_1 = 0;
        int stackIn_277_0 = 0;
        int stackIn_280_0 = 0;
        int stackIn_280_1 = 0;
        int stackIn_284_0 = 0;
        int stackIn_311_0 = 0;
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
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = this.b(param1, (byte) -83, param0);
              var4_int = var4_int & -67108865;
              if (param2 == -8130) {
                break L1;
              } else {
                discarded$0 = this.b(-33, (byte) 40, -88);
                break L1;
              }
            }
            L2: {
              var5 = (var4_int & 65408) >> -1040999193;
              if (-1 == (var4_int & 33554432 ^ -1)) {
                break L2;
              } else {
                if (var5 == 0) {
                  L3: {
                    L4: {
                      var4_int = var4_int & -65409;
                      if (this.c(33554432, param0 - -1, param1)) {
                        break L4;
                      } else {
                        if (this.a(param1, (byte) 2, 1 + param0)) {
                          break L4;
                        } else {
                          stackIn_17_0 = 1;
                          break L3;
                        }
                      }
                    }
                    stackIn_17_0 = 0;
                    break L3;
                  }
                  L5: {
                    L6: {
                      var6 = stackIn_17_0;
                      var7 = this.c(33554432, param0, param1 + 3) ? 1 : 0;
                      var8 = this.c(33554432, param0, param1 + -1) ? 1 : 0;
                      if (this.c(33554432, param0 - 1, param1)) {
                        break L6;
                      } else {
                        if (this.a(param1, (byte) 2, param0 + -1)) {
                          stackIn_24_0 = 0;
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackIn_24_0 = 1;
                    break L5;
                  }
                  L7: {
                    L8: {
                      var9 = stackIn_24_0;
                      var10 = this.c(param2 ^ -33562562, 1 + param0, param1) ? 1 : 0;
                      if (!this.a(param1, (byte) 2, param0)) {
                        break L8;
                      } else {
                        if (var6 != 0) {
                          break L8;
                        } else {
                          L9: {
                            if (var7 == 0) {
                              break L9;
                            } else {
                              if (var8 == 0) {
                                break L9;
                              } else {
                                if (var9 == 0) {
                                  break L9;
                                } else {
                                  if (var10 == 0) {
                                    break L9;
                                  } else {
                                    var4_int = var4_int | this.a(9, 0);
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                          L10: {
                            if (var7 == 0) {
                              break L10;
                            } else {
                              if (var8 == 0) {
                                break L10;
                              } else {
                                if (var9 == 0) {
                                  break L10;
                                } else {
                                  if (var10 == 0) {
                                    var4_int = var4_int | this.a(10, 0);
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                          }
                          L11: {
                            if (var7 == 0) {
                              break L11;
                            } else {
                              if (var8 == 0) {
                                break L11;
                              } else {
                                if (var9 != 0) {
                                  break L11;
                                } else {
                                  if (var10 == 0) {
                                    break L11;
                                  } else {
                                    var4_int = var4_int | this.a(11, 0);
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                          L12: {
                            if (var7 == 0) {
                              break L12;
                            } else {
                              if (var8 == 0) {
                                break L12;
                              } else {
                                if (var9 != 0) {
                                  break L12;
                                } else {
                                  if (var10 == 0) {
                                    var4_int = var4_int | this.a(18, param2 ^ -8130);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                          L13: {
                            if (var7 == 0) {
                              break L13;
                            } else {
                              if (var8 != 0) {
                                break L13;
                              } else {
                                if (var9 == 0) {
                                  break L13;
                                } else {
                                  if (var10 == 0) {
                                    break L13;
                                  } else {
                                    var4_int = var4_int | this.a(12, 0);
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                          L14: {
                            if (var7 == 0) {
                              break L14;
                            } else {
                              if (var8 != 0) {
                                break L14;
                              } else {
                                if (var9 == 0) {
                                  break L14;
                                } else {
                                  if (var10 == 0) {
                                    var4_int = var4_int | this.a(14, 0);
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                          }
                          L15: {
                            if (var7 == 0) {
                              break L15;
                            } else {
                              if (var8 != 0) {
                                break L15;
                              } else {
                                if (var9 != 0) {
                                  break L15;
                                } else {
                                  if (var10 == 0) {
                                    break L15;
                                  } else {
                                    var4_int = var4_int | this.a(15, 0);
                                    break L15;
                                  }
                                }
                              }
                            }
                          }
                          L16: {
                            if (var7 == 0) {
                              break L16;
                            } else {
                              if (var8 != 0) {
                                break L16;
                              } else {
                                if (var9 != 0) {
                                  break L16;
                                } else {
                                  if (var10 == 0) {
                                    var4_int = var4_int | this.a(21, param2 ^ -8130);
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                          }
                          L17: {
                            if (var7 != 0) {
                              break L17;
                            } else {
                              if (var8 == 0) {
                                break L17;
                              } else {
                                if (var9 == 0) {
                                  break L17;
                                } else {
                                  if (var10 == 0) {
                                    break L17;
                                  } else {
                                    var4_int = var4_int | this.a(13, 0);
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
                              if (var8 == 0) {
                                break L18;
                              } else {
                                if (var9 == 0) {
                                  break L18;
                                } else {
                                  if (var10 == 0) {
                                    var4_int = var4_int | this.a(16, 0);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                          }
                          L19: {
                            if (var7 != 0) {
                              break L19;
                            } else {
                              if (var8 == 0) {
                                break L19;
                              } else {
                                if (var9 != 0) {
                                  break L19;
                                } else {
                                  if (var10 != 0) {
                                    var4_int = var4_int | this.a(17, 0);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                          }
                          L20: {
                            if (var7 != 0) {
                              break L20;
                            } else {
                              if (var8 == 0) {
                                break L20;
                              } else {
                                if (var9 != 0) {
                                  break L20;
                                } else {
                                  if (var10 != 0) {
                                    break L20;
                                  } else {
                                    var4_int = var4_int | this.a(20, param2 + 8130);
                                    break L20;
                                  }
                                }
                              }
                            }
                          }
                          L21: {
                            if (var7 != 0) {
                              break L21;
                            } else {
                              if (var8 != 0) {
                                break L21;
                              } else {
                                if (var9 == 0) {
                                  break L21;
                                } else {
                                  if (var10 == 0) {
                                    break L21;
                                  } else {
                                    var4_int = var4_int | this.a(19, 0);
                                    break L21;
                                  }
                                }
                              }
                            }
                          }
                          L22: {
                            if (var7 != 0) {
                              break L22;
                            } else {
                              if (var8 != 0) {
                                break L22;
                              } else {
                                if (var9 == 0) {
                                  break L22;
                                } else {
                                  if (var10 != 0) {
                                    break L22;
                                  } else {
                                    var4_int = var4_int | this.a(22, param2 + 8130);
                                    break L22;
                                  }
                                }
                              }
                            }
                          }
                          L23: {
                            if (var7 != 0) {
                              break L23;
                            } else {
                              if (var8 != 0) {
                                break L23;
                              } else {
                                if (var9 != 0) {
                                  break L23;
                                } else {
                                  if (var10 == 0) {
                                    break L23;
                                  } else {
                                    var4_int = var4_int | this.a(23, 0);
                                    break L23;
                                  }
                                }
                              }
                            }
                          }
                          if (var7 != 0) {
                            break L7;
                          } else {
                            if (var8 != 0) {
                              break L7;
                            } else {
                              if (var9 != 0) {
                                break L7;
                              } else {
                                if (var10 == 0) {
                                  var4_int = var4_int | this.a(24, 0);
                                  if (var12 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L24: {
                      L25: {
                        if (!this.a(param1, (byte) 2, param0)) {
                          break L25;
                        } else {
                          if (var6 != 0) {
                            break L24;
                          } else {
                            break L25;
                          }
                        }
                      }
                      L26: {
                        if (this.c(param2 ^ -33562562, param0, 1 + param1)) {
                          break L26;
                        } else {
                          if (this.c(param2 + 33562562, param0, param1 + 2)) {
                            L27: {
                              if (!this.c(param2 ^ -33562562, 1 + param0, param1)) {
                                break L27;
                              } else {
                                if (!this.c(33554432, -1 + param0, param1)) {
                                  break L27;
                                } else {
                                  var4_int = var4_int | this.a(6, param2 + 8130);
                                  if (var12 == 0) {
                                    break L7;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                            }
                            L28: {
                              if (!this.c(param2 + 33562562, param0 - -1, param1)) {
                                break L28;
                              } else {
                                var4_int = var4_int | this.a(8, 0);
                                if (var12 == 0) {
                                  break L7;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            L29: {
                              if (!this.c(param2 ^ -33562562, param0 - 1, param1)) {
                                break L29;
                              } else {
                                var4_int = var4_int | this.a(4, 0);
                                if (var12 == 0) {
                                  break L7;
                                } else {
                                  break L29;
                                }
                              }
                            }
                            var4_int = var4_int | this.a(2, param2 + 8130);
                            if (var12 == 0) {
                              break L7;
                            } else {
                              break L26;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      L30: {
                        if (!this.c(33554432, param0 - -1, param1)) {
                          break L30;
                        } else {
                          if (!this.c(33554432, -1 + param0, param1)) {
                            break L30;
                          } else {
                            var4_int = var4_int | this.a(5, 0);
                            if (var12 == 0) {
                              break L7;
                            } else {
                              break L30;
                            }
                          }
                        }
                      }
                      L31: {
                        if (!this.c(33554432, param0 - -1, param1)) {
                          break L31;
                        } else {
                          var4_int = var4_int | this.a(7, 0);
                          if (var12 == 0) {
                            break L7;
                          } else {
                            break L31;
                          }
                        }
                      }
                      L32: {
                        if (this.c(param2 + 33562562, param0 - 1, param1)) {
                          break L32;
                        } else {
                          var4_int = var4_int | this.a(1, param2 + 8130);
                          if (var12 == 0) {
                            break L7;
                          } else {
                            break L32;
                          }
                        }
                      }
                      var4_int = var4_int | this.a(3, 0);
                      if (var12 == 0) {
                        break L7;
                      } else {
                        break L24;
                      }
                    }
                    L33: {
                      L34: {
                        stackIn_270_0 = var10;

                        if (this.c(33554432, param0 - -1, 2 + param1)) {
                          break L34;
                        } else {



                          if (!this.c(33554432, param0 - -1, param1 + 1)) {
                            stackIn_273_0 = stackIn_270_0;
                            stackIn_273_1 = 0;
                            break L33;
                          } else {

                            break L34;
                          }
                        }
                      }
                      stackIn_273_0 = stackIn_270_0;
                      stackIn_273_1 = 1;
                      break L33;
                    }
                    L35: {
                      L36: {
                        var10 = stackIn_273_0 | stackIn_273_1;
                        stackIn_277_0 = var9;

                        if (this.c(param2 ^ -33562562, param0 + -1, 2 + param1)) {
                          break L36;
                        } else {


                          if (!this.c(param2 + 33562562, -1 + param0, param1 + 1)) {
                            stackIn_280_0 = stackIn_277_0;
                            stackIn_280_1 = 0;
                            break L35;
                          } else {

                            break L36;
                          }
                        }
                      }
                      stackIn_280_0 = stackIn_277_0;
                      stackIn_280_1 = 1;
                      break L35;
                    }
                    L37: {
                      var9 = stackIn_280_0 | stackIn_280_1;
                      if (!this.c(33554432, param0 + 1, 1 + param1)) {
                        stackIn_284_0 = 0;
                        break L37;
                      } else {
                        stackIn_284_0 = 128;
                        break L37;
                      }
                    }
                    L38: {
                      var11 = stackIn_284_0;
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
                              var4_int = var4_int | this.a(26, 0) - var11;
                              break L38;
                            }
                          }
                        }
                      }
                    }
                    if (var7 != 0) {
                      break L7;
                    } else {
                      if (var8 != 0) {
                        break L7;
                      } else {
                        if (var9 != 0) {
                          break L7;
                        } else {
                          if (var10 != 0) {
                            var4_int = var4_int | -var11 + this.a(28, 0);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  L39: {
                    if ((65408 & var4_int) != 0) {
                      break L39;
                    } else {
                      var4_int = var4_int | this.a(24, 0);
                      break L39;
                    }
                  }
                  stackIn_311_0 = var4_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            stackIn_9_0 = var4_int;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "bm.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_311_0;
        }
    }

    final void a(byte param0) {
        this.a(this.field_g, 9);
        if (param0 <= 120) {
            return;
        }
        try {
            this.a((byte) -117, this.field_g);
            this.field_d = this.field_g[0].length;
            this.field_e = this.field_g.length;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "bm.G(" + param0 + ')');
        }
    }

    final void a(kb param0, byte param1) {
        int stackIn_21_0 = 0;
        int stackIn_53_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        th var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        ek var6 = null;
        ge var7 = null;
        int var8 = 0;
        int var9 = 0;
        ge var10 = null;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = this.a(-103);
                        param0.field_f = 1;
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var4 ^ -1) <= (param0.field_y.length ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param0.field_y[var4] = var4;
                        var4++;
                        if (var11 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var11 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param0.field_t - 1 ^ -1) >= (var4 ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = hp.a((byte) 10, g.field_a, param0.field_t + -var4) + var4;
                        var6_int = param0.field_y[var5];
                        param0.field_y[var5] = param0.field_y[var4];
                        param0.field_y[var4] = var6_int;
                        var4++;
                        if (var11 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4 = 0;
                        var5 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param1 > 7) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        var6 = (ek) ((Object) var3.c(48));
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (null == var6) {
                            statePc = 67;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var11 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_21_0 = var6 instanceof lm ? 1 : 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (!(var6 instanceof ge)) {
                            statePc = 60;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!(var6 instanceof ge)) {
                            statePc = 58;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7 = (ge) ((Object) var6);
                        if ((var7.field_gb ^ -1) >= -2) {
                            statePc = 33;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((param0.field_t ^ -1) < (var7.field_gb ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var11 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var7.field_gb = param0.field_y[var7.field_gb];
                        var8 = 1;
                        if (param0.b((byte) -121, 52, var7.field_gb)) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var8++;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (!param0.b((byte) -62, 50, var7.field_gb)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var8 += 2;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var4 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var5 > 0) {
                            statePc = 60;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var4 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var8 = 1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var5 = var5 + var8;
                        var9 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((var8 ^ -1) >= (var9 ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var10 = new ge(var7.e((byte) -112) + (-3 + var9 % 5) * 2, var7.g(1829947600) + (var9 * 11 % 7 + -3) * 2, var7.d(true));
                        var10.field_gb = var7.field_gb;
                        var10.field_x = param0.a(-16777216);
                        stackIn_21_0 = var4;
                        stackIn_53_0 = stackIn_21_0;
                        if (var11 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        System.out.println("Zombie! oid " + var10.field_x);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        param0.field_K.a(var10, false);
                        var9++;
                        if (var11 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var11 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var6.field_x = param0.a(-16777216);
                        param0.field_K.a(var6, false);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var6 = (ek) ((Object) var3.b(6));
                        if (var11 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_65_0 = (RuntimeException) (var3_ref);
                    stackIn_63_0 = stackIn_65_0;
                    stackIn_65_1 = new StringBuilder().append("bm.U(");
                    stackIn_63_1 = stackIn_65_1;
                    if (param0 == null) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_63_0);
                    stackIn_66_1 = (StringBuilder) ((Object) stackIn_63_1);
                    stackIn_66_2 = "{...}";
                    statePc = 66;
                    continue stateLoop;
                }
                case 65: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
                    stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
                    stackIn_66_2 = "null";
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    throw fa.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ',' + param1 + ')');
                }
                case 67: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, ul param1) {
        RuntimeException runtimeException = null;
        ja var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = new ja(param1.a("final_frame.jpg", "", false), (java.awt.Component) ((Object) dk.field_Ib));
            var3 = var2.field_x;
            var4 = var2.field_w;
            m.c(540);
            if (param0 == 30651) {
              qp.field_v = new ja(var3, var4 * 3 / 4);
              qp.field_v.a();
              var2.c(0, 0);
              qd.field_s = new ja(var3, -qp.field_v.field_w + var4);
              qd.field_s.a();
              var2.c(0, -qp.field_v.field_w);
              qd.field_s.field_y = qp.field_v.field_w;
              ql.a(true);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("bm.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 2) {
              L1: {
                L2: {
                  if (this.c(33554432, param2, param0 - -1)) {
                    break L2;
                  } else {
                    if (this.c(33554432, param2, param0 - -2)) {
                      break L2;
                    } else {
                      stackIn_10_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_10_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "bm.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    private final ek a(int param0, int param1, int param2, int param3, int param4) {
        sh var6 = null;
        int var6_int = 0;
        RuntimeException var6_ref = null;
        ge var7 = null;
        ek stackIn_2_0 = null;
        lm stackIn_8_0 = null;
        sh stackIn_11_0 = null;
        ge stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == -8944) {
              if (0 == param4) {
                var6_int = 1073741823 & param3;
                var7 = new ge(param0, param1, var6_int);
                var7.field_gb = (byte)((-1073741824 & param3) >>> 384489694);
                stackIn_13_0 = (ge) (var7);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if ((param4 ^ -1) != -2) {
                  if ((param4 ^ -1) != -5) {
                    stackIn_15_0 = null;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    var6 = new sh(param0, param1);
                    var6.field_O = (byte)(3 & param3 >>> -31496418);
                    stackIn_11_0 = (sh) (var6);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = ee.a(param3, param1, param0, true);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = (ek) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6_ref), "bm.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ek) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (ek) ((Object) stackIn_11_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (ek) ((Object) stackIn_13_0);
              } else {
                return (ek) ((Object) stackIn_15_0);
              }
            }
          }
        }
    }

    private final void a(byte param0, int[][] param1) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        if (param0 < -105) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        stackIn_4_0 = var3_int;
                        stackIn_4_1 = param1.length;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 >= stackIn_4_1) {
                            statePc = 34;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((param1[0].length ^ -1) >= (var4 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = this.b(var4, var3_int, -8130);
                        var6 = (65408 & var5) >> -1370880729;
                        var7 = (33488896 & var5) >> 5902480;
                        stackIn_4_0 = 0;
                        stackIn_9_0 = stackIn_4_0;
                        stackIn_4_1 = -2147483648 & var5;
                        stackIn_9_1 = stackIn_4_1;
                        if (var8 != 0) {
                            statePc = 4;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 == stackIn_9_1) {
                            statePc = 26;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var6 < 9) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-33 <= (var6 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (9 > var7) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7 <= 32) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-17 != (this.b(var4, 1 + var3_int, -8130) >> 168146279 & 511 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5 = var5 | 67108864;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.field_f[var3_int][var4] = var5;
                        var4++;
                        if (var8 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var3_int++;
                        if (var8 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_32_0 = (RuntimeException) (var3);
                    stackIn_30_0 = stackIn_32_0;
                    stackIn_32_1 = new StringBuilder().append("bm.AA(").append(param0).append(',');
                    stackIn_30_1 = stackIn_32_1;
                    if (param1 == null) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_33_2 = "{...}";
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_33_2 = "null";
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    throw fa.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              en.a(-1, 1);
              if ((param1 ^ -1) != -11) {
                break L1;
              } else {
                if (1 != op.field_m.field_t) {
                  break L1;
                } else {
                  bi.field_e = true;
                  param3 = 1;
                  param1 = 15;
                  break L1;
                }
              }
            }
            gk.field_b = 0;
            vd.field_d = param3;
            sp.field_g = param1;
            if (param2 > 124) {
              L2: {
                L3: {
                  L4: {
                    if (sp.field_g == -4) {
                      break L4;
                    } else {
                      if ((sp.field_g ^ -1) == 1) {
                        break L4;
                      } else {
                        if ((sp.field_g ^ -1) == 4) {
                          break L4;
                        } else {
                          if (1 == sp.field_g) {
                            break L4;
                          } else {
                            if (8 != sp.field_g) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  cj.d(false, 0);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                if (-16 == (sp.field_g ^ -1)) {
                  cj.d(false, 10);
                  break L2;
                } else {
                  break L2;
                }
              }
              L5: {
                L6: {
                  if (-4 != sp.field_g) {
                    break L6;
                  } else {
                    iq.field_f = true;
                    if (var5 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((sp.field_g ^ -1) != 6) {
                  break L5;
                } else {
                  iq.field_f = false;
                  break L5;
                }
              }
              L7: {
                if (!lb.a((byte) 53, sp.field_g)) {
                  break L7;
                } else {
                  L8: {
                    var4_int = 0;
                    if ((sp.field_g ^ -1) == -9) {
                      var4_int = -1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  if (null != gk.a(2, sp.field_g)) {
                    gk.a(2, sp.field_g).a(0, param0, var4_int);
                    if (8 != sp.field_g) {
                      break L7;
                    } else {
                      fc.a((byte) 127, param0);
                      break L7;
                    }
                  } else {
                    bd.a("no target_menu ", (Throwable) null, false);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "bm.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final th a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        th var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ek var9 = null;
        int var10 = 0;
        th stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = -86 / ((37 - param0) / 41);
            var3 = new th();
            var4 = 0;
            L1: while (true) {
              L2: {
                if ((this.field_l.length ^ -1) >= (var4 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    var5 = this.field_l[var4];
                    var6 = this.field_l[1 + var4];
                    var7 = this.field_l[2 + var4];
                    var8 = this.field_l[3 + var4];
                    var9 = this.a(var7, var8, -8944, var6, var5);
                    if (var9 != null) {
                      var3.a(var9, false);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 += 4;
                  if (var10 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_9_0 = (th) (var3);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "bm.J(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    private final int b(int param0, byte param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-1 >= (param2 ^ -1)) {
              L1: {
                if (param1 < -59) {
                  break L1;
                } else {
                  discarded$1 = this.a(-21, -32);
                  break L1;
                }
              }
              if (-1 >= (param0 ^ -1)) {
                if ((this.field_g.length ^ -1) >= (param0 ^ -1)) {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((param2 ^ -1) > (this.field_g[0].length ^ -1)) {
                    stackIn_18_0 = this.field_g[param0][param2];
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_16_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "bm.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                return stackIn_18_0;
              }
            }
          }
        }
    }

    private final int a(int param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                discarded$1 = this.b(-118, (byte) -56, 0);
                break L1;
              }
            }
            stackIn_4_0 = param0 << 634971815;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "bm.T(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    bm(int[][] param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    static {
    }
}
