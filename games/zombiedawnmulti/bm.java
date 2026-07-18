/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bm extends fc {
    private final boolean c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 33554432) {
                break L1;
              } else {
                th discarded$2 = ((bm) this).a(-55);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((33554432 & this.b(param2, (byte) -124, param1)) == 0) {
                  break L3;
                } else {
                  if ((this.b(param2, (byte) -75, param1) >> 7 & 511) <= 64) {
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
          throw fa.a((Throwable) (Object) var4, "bm.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final int b(int param0, int param1, int param2) {
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
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_265_0 = 0;
        int stackIn_267_0 = 0;
        int stackIn_268_0 = 0;
        int stackIn_270_0 = 0;
        int stackIn_272_0 = 0;
        int stackIn_273_0 = 0;
        int stackIn_273_1 = 0;
        int stackIn_274_0 = 0;
        int stackIn_275_0 = 0;
        int stackIn_277_0 = 0;
        int stackIn_279_0 = 0;
        int stackIn_280_0 = 0;
        int stackIn_280_1 = 0;
        int stackIn_284_0 = 0;
        int stackIn_311_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_264_0 = 0;
        int stackOut_265_0 = 0;
        int stackOut_267_0 = 0;
        int stackOut_272_0 = 0;
        int stackOut_272_1 = 0;
        int stackOut_268_0 = 0;
        int stackOut_270_0 = 0;
        int stackOut_270_1 = 0;
        int stackOut_273_0 = 0;
        int stackOut_274_0 = 0;
        int stackOut_279_0 = 0;
        int stackOut_279_1 = 0;
        int stackOut_275_0 = 0;
        int stackOut_277_0 = 0;
        int stackOut_277_1 = 0;
        int stackOut_283_0 = 0;
        int stackOut_281_0 = 0;
        int stackOut_310_0 = 0;
        int stackOut_8_0 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = this.b(param1, (byte) -83, param0);
              var4_int = var4_int & -67108865;
              if (param2 == -8130) {
                break L1;
              } else {
                int discarded$1 = this.b(-33, (byte) 40, -88);
                break L1;
              }
            }
            L2: {
              var5 = (var4_int & 65408) >> 7;
              if ((var4_int & 33554432) == 0) {
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
                          stackOut_14_0 = 1;
                          stackIn_17_0 = stackOut_14_0;
                          break L3;
                        }
                      }
                    }
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
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
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackOut_21_0 = 1;
                    stackIn_24_0 = stackOut_21_0;
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
                        stackOut_264_0 = var10;
                        stackIn_270_0 = stackOut_264_0;
                        stackIn_265_0 = stackOut_264_0;
                        if (this.c(33554432, param0 - -1, 2 + param1)) {
                          break L34;
                        } else {
                          stackOut_265_0 = stackIn_265_0;
                          stackIn_267_0 = stackOut_265_0;
                          stackOut_267_0 = stackIn_267_0;
                          stackIn_272_0 = stackOut_267_0;
                          stackIn_268_0 = stackOut_267_0;
                          if (!this.c(33554432, param0 - -1, param1 + 1)) {
                            stackOut_272_0 = stackIn_272_0;
                            stackOut_272_1 = 0;
                            stackIn_273_0 = stackOut_272_0;
                            stackIn_273_1 = stackOut_272_1;
                            break L33;
                          } else {
                            stackOut_268_0 = stackIn_268_0;
                            stackIn_270_0 = stackOut_268_0;
                            break L34;
                          }
                        }
                      }
                      stackOut_270_0 = stackIn_270_0;
                      stackOut_270_1 = 1;
                      stackIn_273_0 = stackOut_270_0;
                      stackIn_273_1 = stackOut_270_1;
                      break L33;
                    }
                    L35: {
                      L36: {
                        var10 = stackIn_273_0 | stackIn_273_1;
                        stackOut_273_0 = var9;
                        stackIn_277_0 = stackOut_273_0;
                        stackIn_274_0 = stackOut_273_0;
                        if (this.c(param2 ^ -33562562, param0 + -1, 2 + param1)) {
                          break L36;
                        } else {
                          stackOut_274_0 = stackIn_274_0;
                          stackIn_279_0 = stackOut_274_0;
                          stackIn_275_0 = stackOut_274_0;
                          if (!this.c(param2 + 33562562, -1 + param0, param1 + 1)) {
                            stackOut_279_0 = stackIn_279_0;
                            stackOut_279_1 = 0;
                            stackIn_280_0 = stackOut_279_0;
                            stackIn_280_1 = stackOut_279_1;
                            break L35;
                          } else {
                            stackOut_275_0 = stackIn_275_0;
                            stackIn_277_0 = stackOut_275_0;
                            break L36;
                          }
                        }
                      }
                      stackOut_277_0 = stackIn_277_0;
                      stackOut_277_1 = 1;
                      stackIn_280_0 = stackOut_277_0;
                      stackIn_280_1 = stackOut_277_1;
                      break L35;
                    }
                    L37: {
                      var9 = stackIn_280_0 | stackIn_280_1;
                      if (!this.c(33554432, param0 + 1, 1 + param1)) {
                        stackOut_283_0 = 0;
                        stackIn_284_0 = stackOut_283_0;
                        break L37;
                      } else {
                        stackOut_281_0 = 128;
                        stackIn_284_0 = stackOut_281_0;
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
                  stackOut_310_0 = var4_int;
                  stackIn_311_0 = stackOut_310_0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            stackOut_8_0 = var4_int;
            stackIn_9_0 = stackOut_8_0;
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "bm.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_311_0;
    }

    final void a(byte param0) {
        ((bm) this).a(((bm) this).field_g, 9);
        if (param0 <= 120) {
            return;
        }
        try {
            this.a((byte) -117, ((bm) this).field_g);
            ((bm) this).field_d = ((bm) this).field_g[0].length;
            ((bm) this).field_e = ((bm) this).field_g.length;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "bm.G(" + param0 + ')');
        }
    }

    final void a(kb param0, byte param1) {
        RuntimeException var3 = null;
        th var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        ek var6 = null;
        ge var7 = null;
        int var8 = 0;
        int var9 = 0;
        ge var10 = null;
        int var11 = 0;
        int stackIn_21_0 = 0;
        int stackIn_53_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_19_0 = false;
        int stackOut_52_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_ref = ((bm) this).a(-103);
            param0.field_f = 1;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4 <= ~param0.field_y.length) {
                    break L3;
                  } else {
                    param0.field_y[var4] = var4;
                    var4++;
                    if (var11 != 0) {
                      break L2;
                    } else {
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4 = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (~(param0.field_t - 1) >= ~var4) {
                      break L6;
                    } else {
                      var5 = hp.a((byte) 10, g.field_a, param0.field_t + -var4) + var4;
                      var6_int = param0.field_y[var5];
                      param0.field_y[var5] = param0.field_y[var4];
                      param0.field_y[var4] = var6_int;
                      var4++;
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
                  var4 = 0;
                  var5 = 0;
                  break L5;
                }
                if (param1 > 7) {
                  var6 = (ek) (Object) var3_ref.c(48);
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (null == var6) {
                          break L9;
                        } else {
                          if (var11 != 0) {
                            break L8;
                          } else {
                            stackOut_19_0 = var6 instanceof lm;
                            stackIn_21_0 = stackOut_19_0 ? 1 : 0;
                            L10: while (true) {
                              L11: {
                                L12: {
                                  if (stackIn_21_0 != 0) {
                                    break L12;
                                  } else {
                                    if (!(var6 instanceof ge)) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                L13: {
                                  if (!(var6 instanceof ge)) {
                                    break L13;
                                  } else {
                                    L14: {
                                      var7 = (ge) (Object) var6;
                                      if (var7.field_gb <= 1) {
                                        break L14;
                                      } else {
                                        if (~param0.field_t < ~var7.field_gb) {
                                          break L14;
                                        } else {
                                          if (var11 == 0) {
                                            break L11;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                    }
                                    L15: {
                                      var7.field_gb = param0.field_y[var7.field_gb];
                                      var8 = 1;
                                      if (param0.b((byte) -121, 52, var7.field_gb)) {
                                        var8++;
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    L16: {
                                      if (!param0.b((byte) -62, 50, var7.field_gb)) {
                                        break L16;
                                      } else {
                                        var8 += 2;
                                        break L16;
                                      }
                                    }
                                    L17: {
                                      if (var4 == 0) {
                                        break L17;
                                      } else {
                                        if (var5 > 0) {
                                          break L11;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    L18: {
                                      if (var4 != 0) {
                                        var8 = 1;
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    }
                                    var5 = var5 + var8;
                                    var9 = 0;
                                    L19: while (true) {
                                      L20: {
                                        if (~var8 >= ~var9) {
                                          break L20;
                                        } else {
                                          var10 = new ge(var7.e((byte) -112) + (-3 + var9 % 5) * 2, var7.g(1829947600) + (var9 * 11 % 7 + -3) * 2, var7.d(true));
                                          var10.field_gb = var7.field_gb;
                                          var10.field_x = param0.a(-16777216);
                                          stackOut_52_0 = var4;
                                          stackIn_21_0 = stackOut_52_0;
                                          stackIn_53_0 = stackOut_52_0;
                                          if (var11 != 0) {
                                            continue L10;
                                          } else {
                                            L21: {
                                              if (stackIn_53_0 == 0) {
                                                break L21;
                                              } else {
                                                System.out.println("Zombie! oid " + var10.field_x);
                                                break L21;
                                              }
                                            }
                                            param0.field_K.a((br) (Object) var10, false);
                                            var9++;
                                            if (var11 == 0) {
                                              continue L19;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L11;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                                var6.field_x = param0.a(-16777216);
                                param0.field_K.a((br) (Object) var6, false);
                                break L11;
                              }
                              var6 = (ek) (Object) var3_ref.b(6);
                              if (var11 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      break L8;
                    }
                    break L0;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var3 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var3;
            stackOut_62_1 = new StringBuilder().append("bm.U(");
            stackIn_65_0 = stackOut_62_0;
            stackIn_65_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param0 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L22;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_66_0 = stackOut_63_0;
              stackIn_66_1 = stackOut_63_1;
              stackIn_66_2 = stackOut_63_2;
              break L22;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_66_0, stackIn_66_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, ul param1) {
        RuntimeException runtimeException = null;
        ja var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var2 = new ja(param1.a("final_frame.jpg", "", false), (java.awt.Component) (Object) dk.field_Ib);
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
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("bm.W(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
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
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "bm.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final ek a(int param0, int param1, int param2, int param3, int param4) {
        sh var6 = null;
        int var6_int = 0;
        RuntimeException var6_ref = null;
        ge var7 = null;
        Object stackIn_2_0 = null;
        lm stackIn_8_0 = null;
        sh stackIn_11_0 = null;
        ge stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        ge stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        sh stackOut_10_0 = null;
        lm stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param2 == -8944) {
              if (0 == param4) {
                var6_int = 1073741823 & param3;
                var7 = new ge(param0, param1, var6_int);
                var7.field_gb = (byte)((-1073741824 & param3) >>> 30);
                stackOut_12_0 = (ge) var7;
                stackIn_13_0 = stackOut_12_0;
                return (ek) (Object) stackIn_13_0;
              } else {
                if (param4 != 1) {
                  if (param4 != 4) {
                    stackOut_14_0 = null;
                    stackIn_15_0 = stackOut_14_0;
                    break L0;
                  } else {
                    var6 = new sh(param0, param1);
                    var6.field_O = (byte)(3 & param3 >>> 30);
                    stackOut_10_0 = (sh) var6;
                    stackIn_11_0 = stackOut_10_0;
                    return (ek) (Object) stackIn_11_0;
                  }
                } else {
                  stackOut_7_0 = ee.a(param3, param1, param0, true);
                  stackIn_8_0 = stackOut_7_0;
                  return (ek) (Object) stackIn_8_0;
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ek) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var6_ref, "bm.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return (ek) (Object) stackIn_15_0;
    }

    private final void a(byte param0, int[][] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            if (param0 < -105) {
              L1: while (true) {
                stackOut_3_0 = var3_int;
                stackOut_3_1 = param1.length;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (stackIn_4_0 >= stackIn_4_1) {
                        break L4;
                      } else {
                        if (var8 != 0) {
                          break L3;
                        } else {
                          var4 = 0;
                          L5: while (true) {
                            L6: {
                              if (~param1[0].length >= ~var4) {
                                break L6;
                              } else {
                                var5 = this.b(var4, var3_int, -8130);
                                var6 = (65408 & var5) >> 7;
                                var7 = (33488896 & var5) >> 16;
                                stackOut_8_0 = 0;
                                stackOut_8_1 = -2147483648 & var5;
                                stackIn_4_0 = stackOut_8_0;
                                stackIn_4_1 = stackOut_8_1;
                                stackIn_9_0 = stackOut_8_0;
                                stackIn_9_1 = stackOut_8_1;
                                if (var8 != 0) {
                                  continue L2;
                                } else {
                                  L7: {
                                    if (stackIn_9_0 == stackIn_9_1) {
                                      break L7;
                                    } else {
                                      L8: {
                                        L9: {
                                          if (var6 < 9) {
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
                                          if (9 > var7) {
                                            break L10;
                                          } else {
                                            if (var7 <= 32) {
                                              break L8;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        if ((this.b(var4, 1 + var3_int, -8130) >> 7 & 511) != 16) {
                                          break L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                      var5 = var5 | 67108864;
                                      break L7;
                                    }
                                  }
                                  ((bm) this).field_f[var3_int][var4] = var5;
                                  var4++;
                                  if (var8 == 0) {
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var3_int++;
                            if (var8 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("bm.AA(").append(param0).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L11;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              en.a(-1, 1);
              if (param1 != 10) {
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
                      if (sp.field_g == -2) {
                        break L4;
                      } else {
                        if (sp.field_g == -5) {
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
                if (sp.field_g == 15) {
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
                if (sp.field_g != -7) {
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
                    if (sp.field_g == 8) {
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
                    return;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "bm.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        th stackOut_8_0 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = -86 / ((37 - param0) / 41);
            var3 = new th();
            var4 = 0;
            L1: while (true) {
              L2: {
                if (~((bm) this).field_l.length >= ~var4) {
                  break L2;
                } else {
                  L3: {
                    var5 = ((bm) this).field_l[var4];
                    var6 = ((bm) this).field_l[1 + var4];
                    var7 = ((bm) this).field_l[2 + var4];
                    var8 = ((bm) this).field_l[3 + var4];
                    var9 = this.a(var7, var8, -8944, var6, var5);
                    if (var9 != null) {
                      var3.a((br) (Object) var9, false);
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
              stackOut_8_0 = (th) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "bm.J(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    private final int b(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param2 >= 0) {
              L1: {
                if (param1 < -59) {
                  break L1;
                } else {
                  int discarded$2 = this.a(-21, -32);
                  break L1;
                }
              }
              if (param0 >= 0) {
                if (~((bm) this).field_g.length >= ~param0) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  if (~param2 > ~((bm) this).field_g[0].length) {
                    stackOut_17_0 = ((bm) this).field_g[param0][param2];
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "bm.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    private final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                int discarded$2 = this.b(-118, (byte) -56, 0);
                break L1;
              }
            }
            stackOut_3_0 = param0 << 7;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "bm.T(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    bm(int[][] param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    static {
    }
}
