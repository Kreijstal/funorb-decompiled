/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class v {
    private int[] field_l;
    private int[] field_n;
    private vb field_d;
    int[] field_h;
    private boolean field_q;
    private int field_i;
    int field_b;
    private int[] field_a;
    private int field_m;
    int[] field_k;
    int[] field_p;
    int[] field_e;
    int[] field_o;
    private int[] field_r;
    static String field_f;
    private int field_g;
    int[] field_c;
    private int field_j;

    private final boolean b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        try {
          L0: {
            L1: {
              this.a(-100, ((v) this).field_k);
              var3_int = ((v) this).field_k[0];
              var4 = ((v) this).field_k[1];
              var5 = -((v) this).field_p[0] + var3_int;
              var6 = -((v) this).field_p[1] + var4;
              var7 = 16;
              if (param1 <= -1) {
                break L1;
              } else {
                var7 = param1;
                break L1;
              }
            }
            L2: {
              var8 = 2;
              ((v) this).field_l[0] = this.a(((v) this).field_l[0], 6198, var5, var8, var7);
              ((v) this).field_l[1] = this.a(((v) this).field_l[1], 6198, var6, var8, var7);
              if (param0 < -118) {
                break L2;
              } else {
                ((v) this).f(-83);
                break L2;
              }
            }
            L3: {
              L4: {
                ((v) this).field_p[1] = ((v) this).field_p[1] + ((v) this).field_l[1];
                ((v) this).field_p[0] = ((v) this).field_p[0] + ((v) this).field_l[0];
                this.a(-78, ((v) this).field_p);
                this.a(false);
                this.h(-1);
                if (0 != ((v) this).field_l[0]) {
                  break L4;
                } else {
                  if (0 != ((v) this).field_l[1]) {
                    break L4;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_12_0 = stackOut_9_0;
                    break L3;
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "v.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_71_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_7_0 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6_int = param0;
            if (param2 == 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (param1 == 6198) {
                if (param0 == param2) {
                  stackOut_12_0 = param0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  L1: {
                    if (param2 < 0) {
                      stackOut_17_0 = -1;
                      stackIn_18_0 = stackOut_17_0;
                      break L1;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_18_0 = stackOut_15_0;
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      var8 = stackIn_18_0;
                      param2 = param2 * var8;
                      if (param0 == 0) {
                        break L3;
                      } else {
                        L4: {
                          if (0 > param0) {
                            stackOut_24_0 = -1;
                            stackIn_25_0 = stackOut_24_0;
                            break L4;
                          } else {
                            stackOut_22_0 = 1;
                            stackIn_25_0 = stackOut_22_0;
                            break L4;
                          }
                        }
                        var7 = stackIn_25_0;
                        param0 = var7 * param0;
                        if (var14 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var7 = var8;
                    break L2;
                  }
                  if (param2 < param0) {
                    stackOut_30_0 = var8 * param2;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  } else {
                    L5: {
                      if (var7 == var8) {
                        stackOut_35_0 = 0;
                        stackIn_36_0 = stackOut_35_0;
                        break L5;
                      } else {
                        stackOut_33_0 = 1;
                        stackIn_36_0 = stackOut_33_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_36_0;
                      if (~param4 < ~param0) {
                        stackOut_39_0 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        break L6;
                      } else {
                        stackOut_37_0 = 1;
                        stackIn_40_0 = stackOut_37_0;
                        break L6;
                      }
                    }
                    L7: {
                      L8: {
                        var10 = stackIn_40_0;
                        var11 = this.a((byte) -70, param0, param2) ? 1 : 0;
                        if (~param3 < ~(param4 - param0)) {
                          break L8;
                        } else {
                          if (~Math.abs(param2) >= ~(param3 + param0)) {
                            break L8;
                          } else {
                            stackOut_44_0 = 1;
                            stackIn_47_0 = stackOut_44_0;
                            break L7;
                          }
                        }
                      }
                      stackOut_46_0 = 0;
                      stackIn_47_0 = stackOut_46_0;
                      break L7;
                    }
                    L9: {
                      var12 = stackIn_47_0;
                      if (~param4 >= ~param0) {
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        break L9;
                      } else {
                        stackOut_48_0 = 1;
                        stackIn_51_0 = stackOut_48_0;
                        break L9;
                      }
                    }
                    L10: {
                      L11: {
                        var13 = stackIn_51_0;
                        if (var9 != 0) {
                          break L11;
                        } else {
                          L12: {
                            L13: {
                              if (var10 != 0) {
                                break L13;
                              } else {
                                if (var11 == 0) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            var6_int = param0 * 7 >> -1696609885;
                            if (var14 == 0) {
                              break L10;
                            } else {
                              break L12;
                            }
                          }
                          L14: {
                            if (var12 == 0) {
                              break L14;
                            } else {
                              var6_int = param0 - -param3;
                              if (var14 == 0) {
                                break L10;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if (var13 != 0) {
                            var6_int = param0 - -1;
                            if (var14 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                      var6_int = param0 >> -2127732253;
                      break L10;
                    }
                    var6_int = var6_int * var7;
                    stackOut_70_0 = var6_int;
                    stackIn_71_0 = stackOut_70_0;
                    break L0;
                  }
                }
              } else {
                stackOut_7_0 = -40;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "v.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_71_0;
    }

    private final boolean a(boolean param0, boolean param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_8_0 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (0 <= param3) {
                    L2: {
                      ((v) this).field_p[0] = ((v) this).field_p[0] - (param2 + -((v) this).field_a[0]);
                      ((v) this).field_p[1] = ((v) this).field_p[1] - (-((v) this).field_a[1] + param3);
                      ((v) this).field_a[0] = param2;
                      ((v) this).field_a[1] = param3;
                      this.a(-85, ((v) this).field_p);
                      stackOut_9_0 = this;
                      stackIn_12_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (param0) {
                        stackOut_12_0 = this;
                        stackOut_12_1 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L2;
                      } else {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 1;
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        break L2;
                      }
                    }
                    L3: {
                      this.a(stackIn_13_1 != 0);
                      this.h(-1);
                      if (param0) {
                        break L3;
                      } else {
                        ((v) this).a((byte) 70, 24);
                        break L3;
                      }
                    }
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            ((v) this).field_a[0] = param2;
            ((v) this).field_a[1] = param3;
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "v.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_17_0 != 0;
    }

    private final boolean a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = param1;
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4_int <= 0) {
                    break L3;
                  } else {
                    var5 = var5 + var4_int;
                    var4_int = 7 * var4_int >> 419772515;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == -70) {
                  break L2;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              }
              if (param2 - var5 > 0) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0 != 0;
              } else {
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "v.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void a(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((v) this).field_p[1] = param1;
              ((v) this).field_p[0] = param0;
              this.a(-93, ((v) this).field_p);
              this.a(false);
              if (param2 > 54) {
                break L1;
              } else {
                ((v) this).field_m = -31;
                break L1;
              }
            }
            this.h(-1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "v.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_59_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_58_0 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = 0;
                if (-1 >= param2) {
                  break L2;
                } else {
                  if (param2 >= ((v) this).field_j) {
                    break L2;
                  } else {
                    if (param0 <= -1) {
                      break L2;
                    } else {
                      if (~((v) this).field_j >= ~param0) {
                        break L2;
                      } else {
                        var4_int = var4_int + ((v) this).field_o[param2 + param0 * ((v) this).field_j];
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              var4_int += 255;
              break L1;
            }
            L3: {
              L4: {
                L5: {
                  if (-1 >= param2 + 1) {
                    break L5;
                  } else {
                    if (~((v) this).field_j >= ~(param2 - -1)) {
                      break L5;
                    } else {
                      if (param0 <= -1) {
                        break L5;
                      } else {
                        if (param0 < ((v) this).field_j) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                var4_int += 255;
                if (var5 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
              var4_int = var4_int + ((v) this).field_o[((v) this).field_j * param0 + 1 + param2];
              break L3;
            }
            L6: {
              L7: {
                if (param2 - -1 <= -1) {
                  break L7;
                } else {
                  if (((v) this).field_j <= 1 + param2) {
                    break L7;
                  } else {
                    if (param0 - -1 <= -1) {
                      break L7;
                    } else {
                      if (~(param0 - -1) <= ~((v) this).field_j) {
                        break L7;
                      } else {
                        var4_int = var4_int + ((v) this).field_o[(1 + param0) * ((v) this).field_j + (param2 - -1)];
                        if (var5 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
              }
              var4_int += 255;
              break L6;
            }
            L8: {
              if (param1 == -4510) {
                break L8;
              } else {
                v.d((byte) -11);
                break L8;
              }
            }
            L9: {
              L10: {
                L11: {
                  if (param2 <= -1) {
                    break L11;
                  } else {
                    if (param2 >= ((v) this).field_j) {
                      break L11;
                    } else {
                      if (-1 >= param0 - -1) {
                        break L11;
                      } else {
                        if (((v) this).field_j > 1 + param0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                }
                var4_int += 255;
                if (var5 == 0) {
                  break L9;
                } else {
                  break L10;
                }
              }
              var4_int = var4_int + ((v) this).field_o[((v) this).field_j * (1 + param0) + param2];
              break L9;
            }
            stackOut_58_0 = var4_int >> 1388444194;
            stackIn_59_0 = stackOut_58_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "v.FA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_59_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((v) this).f(-41);
              ((v) this).field_e[0] = -((v) this).field_p[0] + (((v) this).field_k[0] + (so.field_b.field_a >> 1789939649));
              if (param0 == 9470337) {
                break L1;
              } else {
                ((v) this).field_q = false;
                break L1;
              }
            }
            ((v) this).field_e[1] = -((v) this).field_p[1] + (((v) this).field_k[1] + (so.field_b.field_g >> 9470337) - 20);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "v.D(" + param0 + ')');
        }
    }

    final void j(int param0) {
        if (param0 > -117) {
            return;
        }
        try {
            this.a(false);
            this.h(-1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "v.BA(" + param0 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((v) this).f(-115);
              if (param0 == -28) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            ((v) this).field_g = ((v) this).field_k[0];
            ((v) this).field_i = ((v) this).field_k[1];
            this.a(false);
            this.h(param0 + 27);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "v.K(" + param0 + ')');
        }
    }

    private final void a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 40 * ((v) this).field_j >> -809523839;
              if (param0 < -76) {
                break L1;
              } else {
                ((v) this).field_d = null;
                break L1;
              }
            }
            L2: {
              var4 = param1[0] - (var3_int << 542256097) >> 1113661985;
              var5 = param1[1] - var3_int;
              if (~(Math.abs(var4) - -Math.abs(var5)) >= ~var3_int) {
                break L2;
              } else {
                L3: {
                  L4: {
                    var6 = -var3_int + (Math.abs(var4) + Math.abs(var5)) >> -467958783;
                    if (0 >= var4) {
                      break L4;
                    } else {
                      param1[0] = param1[0] - (var6 << 754877537);
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  param1[0] = param1[0] + (var6 << -1640928479);
                  break L3;
                }
                L5: {
                  if (var5 > 0) {
                    break L5;
                  } else {
                    param1[1] = param1[1] + var6;
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                param1[1] = param1[1] - var6;
                break L2;
              }
            }
            L6: {
              L7: {
                var5 = param1[1] + -var3_int;
                var4 = -(var3_int << -1510912799) + param1[0] >> -1055977439;
                var3_int -= 100;
                if (~var3_int > ~var4) {
                  break L7;
                } else {
                  if (~var4 <= ~-var3_int) {
                    break L6;
                  } else {
                    param1[0] = param1[0] - (var3_int + var4 << 162883169);
                    if (var7 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              param1[0] = param1[0] - (-var3_int + var4 << 1873418465);
              break L6;
            }
            L8: {
              L9: {
                if (var5 > var3_int) {
                  break L9;
                } else {
                  if (~-var3_int >= ~var5) {
                    break L8;
                  } else {
                    param1[1] = param1[1] - (var3_int + var5);
                    if (var7 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              param1[1] = param1[1] - (var5 - var3_int);
              break L8;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("v.NA(").append(param0).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L10;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
        }
    }

    final void b(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_31_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_30_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_40_0 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1 == 1745035905) {
              var3_int = ((v) this).field_n[0];
              var4 = ((v) this).field_n[1];
              var4 -= 3;
              ((v) this).field_c[0] = var3_int;
              ((v) this).field_c[1] = var4;
              ((v) this).f(param1 ^ -1745035990);
              ((v) this).i(0);
              var5 = ((v) this).field_e[0] - -40;
              var6 = ((v) this).field_e[1] - 20;
              var7 = var5;
              var8 = var6;
              var9 = var3_int;
              var10 = var4;
              var11 = so.field_b.field_a;
              var12 = so.field_b.field_g;
              qn.f(0, 0, var11, var12);
              var13 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var8 >= 256 + var12 + 40) {
                      break L3;
                    } else {
                      L4: while (true) {
                        stackOut_5_0 = 80 + var11;
                        stackIn_41_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var14 != 0) {
                          break L2;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_6_0 <= var7) {
                                break L6;
                              } else {
                                stackOut_7_0 = ~var9;
                                stackIn_31_0 = stackOut_7_0;
                                stackIn_8_0 = stackOut_7_0;
                                if (var14 != 0) {
                                  break L5;
                                } else {
                                  stackOut_8_0 = stackIn_8_0;
                                  stackIn_10_0 = stackOut_8_0;
                                  L7: {
                                    if (stackIn_10_0 > 0) {
                                      break L7;
                                    } else {
                                      if (~var9 < ~((v) this).field_j) {
                                        break L7;
                                      } else {
                                        if (var10 < -1) {
                                          break L7;
                                        } else {
                                          if (((v) this).field_m < var10) {
                                            break L7;
                                          } else {
                                            L8: {
                                              stackOut_22_0 = var10;
                                              stackOut_22_1 = var9;
                                              stackOut_22_2 = param0;
                                              stackOut_22_3 = var8;
                                              stackOut_22_4 = 99;
                                              stackOut_22_5 = var7;
                                              stackIn_27_0 = stackOut_22_0;
                                              stackIn_27_1 = stackOut_22_1;
                                              stackIn_27_2 = stackOut_22_2;
                                              stackIn_27_3 = stackOut_22_3;
                                              stackIn_27_4 = stackOut_22_4;
                                              stackIn_27_5 = stackOut_22_5;
                                              stackIn_23_0 = stackOut_22_0;
                                              stackIn_23_1 = stackOut_22_1;
                                              stackIn_23_2 = stackOut_22_2;
                                              stackIn_23_3 = stackOut_22_3;
                                              stackIn_23_4 = stackOut_22_4;
                                              stackIn_23_5 = stackOut_22_5;
                                              if (var8 <= var12 + 40) {
                                                stackOut_27_0 = stackIn_27_0;
                                                stackOut_27_1 = stackIn_27_1;
                                                stackOut_27_2 = stackIn_27_2;
                                                stackOut_27_3 = stackIn_27_3;
                                                stackOut_27_4 = stackIn_27_4;
                                                stackOut_27_5 = stackIn_27_5;
                                                stackOut_27_6 = 0;
                                                stackIn_28_0 = stackOut_27_0;
                                                stackIn_28_1 = stackOut_27_1;
                                                stackIn_28_2 = stackOut_27_2;
                                                stackIn_28_3 = stackOut_27_3;
                                                stackIn_28_4 = stackOut_27_4;
                                                stackIn_28_5 = stackOut_27_5;
                                                stackIn_28_6 = stackOut_27_6;
                                                break L8;
                                              } else {
                                                stackOut_23_0 = stackIn_23_0;
                                                stackOut_23_1 = stackIn_23_1;
                                                stackOut_23_2 = stackIn_23_2;
                                                stackOut_23_3 = stackIn_23_3;
                                                stackOut_23_4 = stackIn_23_4;
                                                stackOut_23_5 = stackIn_23_5;
                                                stackIn_25_0 = stackOut_23_0;
                                                stackIn_25_1 = stackOut_23_1;
                                                stackIn_25_2 = stackOut_23_2;
                                                stackIn_25_3 = stackOut_23_3;
                                                stackIn_25_4 = stackOut_23_4;
                                                stackIn_25_5 = stackOut_23_5;
                                                stackOut_25_0 = stackIn_25_0;
                                                stackOut_25_1 = stackIn_25_1;
                                                stackOut_25_2 = stackIn_25_2;
                                                stackOut_25_3 = stackIn_25_3;
                                                stackOut_25_4 = stackIn_25_4;
                                                stackOut_25_5 = stackIn_25_5;
                                                stackOut_25_6 = 1;
                                                stackIn_28_0 = stackOut_25_0;
                                                stackIn_28_1 = stackOut_25_1;
                                                stackIn_28_2 = stackOut_25_2;
                                                stackIn_28_3 = stackOut_25_3;
                                                stackIn_28_4 = stackOut_25_4;
                                                stackIn_28_5 = stackOut_25_5;
                                                stackIn_28_6 = stackOut_25_6;
                                                break L8;
                                              }
                                            }
                                            fg.a(stackIn_28_0, stackIn_28_1, stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6 != 0);
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var7 += 80;
                                  var10++;
                                  var9++;
                                  if (var14 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var8 += 20;
                            stackOut_30_0 = var13;
                            stackIn_31_0 = stackOut_30_0;
                            break L5;
                          }
                          L9: {
                            if (stackIn_31_0 == 0) {
                              break L9;
                            } else {
                              var3_int--;
                              var7 = -40 + var5;
                              break L9;
                            }
                          }
                          L10: {
                            if (var13 != 0) {
                              break L10;
                            } else {
                              var7 = var5;
                              var4++;
                              break L10;
                            }
                          }
                          L11: {
                            if (var13 != 0) {
                              stackOut_38_0 = 0;
                              stackIn_39_0 = stackOut_38_0;
                              break L11;
                            } else {
                              stackOut_36_0 = 1;
                              stackIn_39_0 = stackOut_36_0;
                              break L11;
                            }
                          }
                          var13 = stackIn_39_0;
                          var9 = var3_int;
                          var10 = var4;
                          if (var14 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_40_0 = param0;
                  stackIn_41_0 = stackOut_40_0;
                  break L2;
                }
                L12: {
                  if (stackIn_41_0 != 0) {
                    break L12;
                  } else {
                    if (!gb.field_B) {
                      break L12;
                    } else {
                      if (cu.field_a) {
                        this.a(-12608);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "v.C(" + param0 + ',' + param1 + ')');
        }
    }

    private final void e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 88) {
                break L1;
              } else {
                boolean discarded$2 = this.a(false, true, 4, 95);
                break L1;
              }
            }
            var3 = ((v) this).field_e[1];
            var2_int = ((v) this).field_e[0];
            var3 = var3 - (so.field_b.field_g >> -279644223);
            var2_int = var2_int - (so.field_b.field_a >> 1693653825);
            var4 = var2_int - -((v) this).field_p[0];
            var5 = var3 + ((v) this).field_p[1];
            ((v) this).field_k[1] = var5;
            ((v) this).field_k[0] = var4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "v.I(" + param0 + ')');
        }
    }

    final void b(int param0, int param1, byte param2) {
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
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_9_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ((v) this).field_e[0] = 0;
            ((v) this).field_e[1] = 0;
            ((v) this).c(false);
            ((v) this).field_c[1] = ((v) this).field_c[1] - 2;
            var4_int = ((v) this).field_c[0];
            var5 = ((v) this).field_c[1];
            ((v) this).f(-63);
            ((v) this).i(0);
            ((v) this).f(-113);
            ((v) this).i(0);
            var6 = ((v) this).field_e[0];
            var7 = ((v) this).field_e[1];
            var10 = 1 + var4_int;
            if (param2 == 93) {
              var11 = var5;
              var12 = 0;
              var13 = so.field_b.field_a;
              var14 = so.field_b.field_g;
              var15 = var6;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var15 < ~var13) {
                      break L3;
                    } else {
                      var8 = var10;
                      var9 = var11;
                      var16 = var12;
                      if (var20 != 0) {
                        break L2;
                      } else {
                        var17 = var7;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (var14 < var17) {
                                break L6;
                              } else {
                                stackOut_8_0 = var16;
                                stackIn_38_0 = stackOut_8_0;
                                stackIn_9_0 = stackOut_8_0;
                                if (var20 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    L8: {
                                      if (stackIn_9_0 != 0) {
                                        break L8;
                                      } else {
                                        var8--;
                                        if (-1 >= var8) {
                                          break L7;
                                        } else {
                                          if (~var8 <= ~(((v) this).field_j + 1)) {
                                            break L7;
                                          } else {
                                            if (var9 <= -1) {
                                              break L7;
                                            } else {
                                              if (var9 >= 1 + ((v) this).field_m) {
                                                break L7;
                                              } else {
                                                L9: {
                                                  var18 = (-param1 + var15) * (-param1 + var15) + (var17 - param0) * (-param0 + var17);
                                                  var19 = 3 * fe.a(var18 * 4) + -30;
                                                  if (var19 >= 0) {
                                                    break L9;
                                                  } else {
                                                    var19 = 0;
                                                    break L9;
                                                  }
                                                }
                                                L10: {
                                                  if (var19 >= 256) {
                                                    break L10;
                                                  } else {
                                                    pi.field_T.e(-6 + var15, -3 + var17, -var19 + 256);
                                                    break L10;
                                                  }
                                                }
                                                if (var20 == 0) {
                                                  break L7;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var9++;
                                    break L7;
                                  }
                                  L11: {
                                    if (var16 != 0) {
                                      stackOut_35_0 = 0;
                                      stackIn_36_0 = stackOut_35_0;
                                      break L11;
                                    } else {
                                      stackOut_33_0 = 1;
                                      stackIn_36_0 = stackOut_33_0;
                                      break L11;
                                    }
                                  }
                                  var16 = stackIn_36_0;
                                  var17 += 20;
                                  if (var20 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            stackOut_37_0 = var12;
                            stackIn_38_0 = stackOut_37_0;
                            break L5;
                          }
                          L12: {
                            if (stackIn_38_0 != 0) {
                              var10++;
                              var11++;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L13: {
                            if (var12 != 0) {
                              stackOut_44_0 = 0;
                              stackIn_45_0 = stackOut_44_0;
                              break L13;
                            } else {
                              stackOut_42_0 = 1;
                              stackIn_45_0 = stackOut_42_0;
                              break L13;
                            }
                          }
                          var12 = stackIn_45_0;
                          var15 += 40;
                          if (var20 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "v.JA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((v) this).field_c[1] = ((v) this).field_b / ((v) this).field_j;
            ((v) this).field_c[0] = -(((v) this).field_c[1] * ((v) this).field_j) + ((v) this).field_b;
            if (param0 == 36) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "v.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void h(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((v) this).field_e[1] = 0;
              ((v) this).field_e[0] = 0;
              ((v) this).c(false);
              if (param0 == -1) {
                break L1;
              } else {
                ((v) this).a((byte) 54, -118);
                break L1;
              }
            }
            ((v) this).field_n[0] = ((v) this).field_c[0];
            ((v) this).field_n[1] = ((v) this).field_c[1];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "v.J(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, boolean param4, int param5, boolean param6, int param7, int param8, int param9) {
        RuntimeException var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var11_int = 255;
              var12 = 255;
              var13 = 255;
              var14 = 255;
              if (param1 <= -1) {
                break L1;
              } else {
                if (param5 <= -1) {
                  break L1;
                } else {
                  if (param1 >= ((v) this).field_j) {
                    break L1;
                  } else {
                    if (param5 < ((v) this).field_m) {
                      L2: {
                        if (param3) {
                          break L2;
                        } else {
                          var11_int = ((v) this).field_o[param5 * ((v) this).field_j + param1];
                          if (var15 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var12 = ((v) this).field_o[((v) this).field_j * param5 + param1];
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L3: {
              if (param0 <= -1) {
                break L3;
              } else {
                if (param2 <= -1) {
                  break L3;
                } else {
                  if (~param0 <= ~((v) this).field_j) {
                    break L3;
                  } else {
                    if (param2 >= ((v) this).field_m) {
                      break L3;
                    } else {
                      L4: {
                        if (param3) {
                          break L4;
                        } else {
                          var14 = ((v) this).field_o[param0 + param2 * ((v) this).field_j];
                          if (var15 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var13 = ((v) this).field_o[((v) this).field_j * param2 + param0];
                      break L3;
                    }
                  }
                }
              }
            }
            L5: {
              if (param8 == 1760) {
                break L5;
              } else {
                ((v) this).field_o = null;
                break L5;
              }
            }
            L6: {
              L7: {
                if (!param3) {
                  break L7;
                } else {
                  var14 = this.b(param2 - 1, -4510, -1 + param0);
                  var11_int = this.b(param5, -4510, param1);
                  if (var15 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var13 = this.b(param2, -4510, param0);
              var12 = this.b(-1 + param5, -4510, param1 - 1);
              break L6;
            }
            this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11_int, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var11, "v.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    private final void a(boolean param0) {
        try {
            ((v) this).field_e[1] = so.field_b.field_g >> -1572318207;
            ((v) this).field_e[0] = so.field_b.field_a >> 792578625;
            ((v) this).c(param0);
            ((v) this).field_r[1] = ((v) this).field_c[1];
            ((v) this).field_r[0] = ((v) this).field_c[0];
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "v.IA(" + param0 + ')');
        }
    }

    private final boolean a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_16_0 = 0;
        int stackIn_87_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_86_0 = 0;
        int stackOut_15_0 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var7_int = 0;
                if (param5) {
                  break L2;
                } else {
                  if (param1) {
                    break L2;
                  } else {
                    if (param4) {
                      break L2;
                    } else {
                      if (param3) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              var7_int = 1;
              break L1;
            }
            if (param0) {
              L3: {
                L4: {
                  var8 = 16;
                  if (!param5) {
                    break L4;
                  } else {
                    if (~((v) this).field_l[1] < ~-var8) {
                      ((v) this).field_l[1] = ((v) this).field_l[1] - 1;
                      if (var9 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                if (!param2) {
                  if (((v) this).field_l[1] < 0) {
                    ((v) this).field_l[1] = ((v) this).field_l[1] + 1;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                L6: {
                  if (param1) {
                    break L6;
                  } else {
                    if (!param2) {
                      if (((v) this).field_l[1] <= 0) {
                        break L5;
                      } else {
                        ((v) this).field_l[1] = ((v) this).field_l[1] - 1;
                        if (var9 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                if (((v) this).field_l[1] >= var8) {
                  break L5;
                } else {
                  ((v) this).field_l[1] = ((v) this).field_l[1] + 1;
                  break L5;
                }
              }
              L7: {
                L8: {
                  if (param4) {
                    break L8;
                  } else {
                    if (param2) {
                      break L7;
                    } else {
                      if (((v) this).field_l[0] < 0) {
                        ((v) this).field_l[0] = ((v) this).field_l[0] + 1;
                        if (var9 == 0) {
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
                if (-var8 < ((v) this).field_l[0]) {
                  ((v) this).field_l[0] = ((v) this).field_l[0] - 1;
                  break L7;
                } else {
                  break L7;
                }
              }
              L9: {
                L10: {
                  if (param3) {
                    break L10;
                  } else {
                    if (!param2) {
                      if (0 < ((v) this).field_l[0]) {
                        ((v) this).field_l[0] = ((v) this).field_l[0] - 1;
                        if (var9 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      } else {
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                if (~((v) this).field_l[0] > ~var8) {
                  ((v) this).field_l[0] = ((v) this).field_l[0] + 1;
                  break L9;
                } else {
                  break L9;
                }
              }
              L11: {
                L12: {
                  if (!param2) {
                    break L12;
                  } else {
                    if (var7_int == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                ((v) this).field_p[1] = ((v) this).field_p[1] + ((v) this).field_l[1];
                ((v) this).field_p[0] = ((v) this).field_p[0] + (((v) this).field_l[0] << -171355071);
                this.a(-81, ((v) this).field_p);
                this.a(false);
                this.h(-1);
                break L11;
              }
              stackOut_86_0 = var7_int;
              stackIn_87_0 = stackOut_86_0;
              break L0;
            } else {
              stackOut_15_0 = 1;
              stackIn_16_0 = stackOut_15_0;
              return stackIn_16_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var7, "v.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_87_0 != 0;
    }

    private final void d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = -40 + ((v) this).field_k[0] >> 1477510273;
              var3 = ((v) this).field_k[1] - (((v) this).field_m * 40 >> -608768031);
              var5 = var3 + var2_int;
              var4 = var2_int + -var3;
              if (var4 >= 0) {
                break L1;
              } else {
                var4 -= 40;
                break L1;
              }
            }
            L2: {
              if (var5 < 0) {
                var5 -= 40;
                break L2;
              } else {
                break L2;
              }
            }
            ((v) this).field_c[0] = var4 / 40;
            ((v) this).field_c[param0] = var5 / 40;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "v.S(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        try {
          L0: {
            L1: {
              ((v) this).field_c[1] = param0 / ((v) this).field_j;
              ((v) this).field_c[0] = param0 + -(((v) this).field_j * ((v) this).field_c[1]);
              if (param1) {
                break L1;
              } else {
                ((v) this).field_l = null;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = this;
              stackIn_6_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (param1) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                break L2;
              }
            }
            this.b(stackIn_7_1 != 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "v.V(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((v) this).a(-4, 46);
                break L1;
              }
            }
            this.e(105);
            this.d(1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "v.HA(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        int var20 = 0;
        int var21 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        var21 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              ((v) this).field_e[0] = 0;
              ((v) this).field_e[1] = 0;
              ((v) this).c(false);
              ((v) this).field_c[1] = ((v) this).field_c[1] - 2;
              var2_int = ((v) this).field_c[0];
              var3 = ((v) this).field_c[1];
              ((v) this).f(-47);
              ((v) this).i(0);
              ((v) this).f(-85);
              ((v) this).i(param0 ^ param0);
              var4 = ((v) this).field_e[0];
              var5 = ((v) this).field_e[1];
              var11 = var2_int + -1;
              var12 = var3;
              var13 = var3;
              var10 = var2_int;
              var14 = 0;
              if (0 != (var3 + var2_int) % 2) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            var15 = stackIn_5_0;
            var16 = so.field_b.field_a;
            var17 = so.field_b.field_g;
            var18 = var4;
            L2: while (true) {
              L3: {
                L4: {
                  if (var18 > var16) {
                    break L4;
                  } else {
                    var8 = var12;
                    var6 = var10;
                    var7 = var11;
                    var9 = var13;
                    var19 = var14;
                    if (var21 != 0) {
                      break L3;
                    } else {
                      var20 = var5;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (~var20 < ~var17) {
                              break L7;
                            } else {
                              this.a(var7, var6, var9, var19 != 0, var15 != 0, var8, var14 != 0, var18, 1760, var20);
                              stackOut_10_0 = var19;
                              stackIn_25_0 = stackOut_10_0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var21 != 0) {
                                break L6;
                              } else {
                                L8: {
                                  L9: {
                                    if (stackIn_11_0 == 0) {
                                      break L9;
                                    } else {
                                      var7--;
                                      var8++;
                                      if (var21 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  var9++;
                                  var6--;
                                  break L8;
                                }
                                L10: {
                                  if (var19 != 0) {
                                    stackOut_22_0 = 0;
                                    stackIn_23_0 = stackOut_22_0;
                                    break L10;
                                  } else {
                                    stackOut_20_0 = 1;
                                    stackIn_23_0 = stackOut_20_0;
                                    break L10;
                                  }
                                }
                                var19 = stackIn_23_0;
                                var20 += 20;
                                if (var21 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          stackOut_24_0 = var14;
                          stackIn_25_0 = stackOut_24_0;
                          break L6;
                        }
                        L11: {
                          L12: {
                            if (stackIn_25_0 != 0) {
                              break L12;
                            } else {
                              var13++;
                              var11++;
                              if (var21 == 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          var10++;
                          var12++;
                          break L11;
                        }
                        L13: {
                          if (var14 != 0) {
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            break L13;
                          } else {
                            stackOut_32_0 = 1;
                            stackIn_35_0 = stackOut_32_0;
                            break L13;
                          }
                        }
                        var14 = stackIn_35_0;
                        var18 += 40;
                        if (var21 == 0) {
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
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "v.KA(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = ((v) this).field_k[0];
            var3 = ((v) this).field_k[1];
            var4 = 0;
            var5 = 0;
            var6 = so.a(327680, -129);
            var4 = var4 + ev.b(-48, var2_int << -551277810, var6);
            var5 = var5 + ev.b(-70, var2_int << 812143534, var6);
            var4 = var4 - ev.b(-94, var2_int << -510994289, var6);
            var5 = var5 + ev.b(-51, var3 << -6374289, var6);
            ((v) this).field_h[0] = var4;
            ((v) this).field_h[1] = var5;
            var7 = -48 % ((19 - param0) / 36);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "v.W(" + param0 + ')');
        }
    }

    final void i(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = ((v) this).field_k[1];
            var2_int = ((v) this).field_k[0];
            var5 = var3 + -((v) this).field_p[1];
            var4 = var2_int - ((v) this).field_p[param0];
            var4 = var4 + (so.field_b.field_a >> 194744801);
            var5 = (so.field_b.field_g >> 1745035905) + var5;
            ((v) this).field_e[1] = var5;
            ((v) this).field_e[0] = var4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "v.E(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, boolean param5, int param6, int param7, int param8, boolean param9, int param10, int param11, int param12, int param13) {
        RuntimeException var15 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        var39 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 > param11) {
                break L1;
              } else {
                if (0 > param1) {
                  break L1;
                } else {
                  if (((v) this).field_m - 1 < param13) {
                    break L1;
                  } else {
                    if (param8 > -1 + ((v) this).field_j) {
                      break L1;
                    } else {
                      if (0 > param13) {
                        this.a(false, param4, param10, -126, param5, param6, param2, param7, param3, param9, param12);
                        return;
                      } else {
                        if (0 > param8) {
                          this.a(true, param4, param10, param0 ^ 8236, param5, param6, param2, param7, param3, param9, param12);
                          return;
                        } else {
                          L2: {
                            if (param0 == -8302) {
                              break L2;
                            } else {
                              this.a(-43, (int[]) null);
                              break L2;
                            }
                          }
                          if (param1 > -1 + ((v) this).field_m) {
                            this.a(true, param4, param10, -78, param5, param6, param2, param7, param3, param9, param12);
                            return;
                          } else {
                            if (-1 + ((v) this).field_j < param11) {
                              this.a(false, param4, param10, -120, param5, param6, param2, param7, param3, param9, param12);
                              return;
                            } else {
                              L3: {
                                var15_int = param2 << 1267885520;
                                var16 = (-var15_int + (param12 << -787487536)) / 40;
                                var17 = param7 << 470127472;
                                var18 = ((param4 << -2002597104) + -var17) / 40;
                                var19 = var15_int;
                                var20 = var17;
                                stackOut_37_0 = 0;
                                stackIn_40_0 = stackOut_37_0;
                                stackIn_38_0 = stackOut_37_0;
                                if (param9 ^ param5) {
                                  stackOut_40_0 = stackIn_40_0;
                                  stackOut_40_1 = 0;
                                  stackIn_41_0 = stackOut_40_0;
                                  stackIn_41_1 = stackOut_40_1;
                                  break L3;
                                } else {
                                  stackOut_38_0 = stackIn_38_0;
                                  stackOut_38_1 = 40;
                                  stackIn_41_0 = stackOut_38_0;
                                  stackIn_41_1 = stackOut_38_1;
                                  break L3;
                                }
                              }
                              var21 = stackIn_41_0 - -stackIn_41_1;
                              var22 = so.field_b.field_a;
                              var23 = so.field_b.field_g;
                              var24 = param6;
                              L4: while (true) {
                                L5: {
                                  L6: {
                                    if (var24 >= param6 + 40) {
                                      break L6;
                                    } else {
                                      if (var39 != 0) {
                                        break L5;
                                      } else {
                                        L7: {
                                          stackOut_44_0 = 0;
                                          stackIn_49_0 = stackOut_44_0;
                                          stackIn_45_0 = stackOut_44_0;
                                          if (param3 == param5) {
                                            stackOut_49_0 = stackIn_49_0;
                                            stackOut_49_1 = 0;
                                            stackIn_50_0 = stackOut_49_0;
                                            stackIn_50_1 = stackOut_49_1;
                                            break L7;
                                          } else {
                                            stackOut_45_0 = stackIn_45_0;
                                            stackIn_47_0 = stackOut_45_0;
                                            stackOut_47_0 = stackIn_47_0;
                                            stackOut_47_1 = 1;
                                            stackIn_50_0 = stackOut_47_0;
                                            stackIn_50_1 = stackOut_47_1;
                                            break L7;
                                          }
                                        }
                                        L8: {
                                          stackOut_50_0 = stackIn_50_0;
                                          stackIn_53_0 = stackOut_50_0;
                                          stackIn_51_0 = stackOut_50_0;
                                          if (stackIn_50_1 != 0 ^ param9) {
                                            stackOut_53_0 = stackIn_53_0;
                                            stackOut_53_1 = 20;
                                            stackIn_54_0 = stackOut_53_0;
                                            stackIn_54_1 = stackOut_53_1;
                                            break L8;
                                          } else {
                                            stackOut_51_0 = stackIn_51_0;
                                            stackOut_51_1 = 0;
                                            stackIn_54_0 = stackOut_51_0;
                                            stackIn_54_1 = stackOut_51_1;
                                            break L8;
                                          }
                                        }
                                        var25 = stackIn_54_0 - -stackIn_54_1;
                                        var26 = var19;
                                        var27 = (-var19 + var20) / 20;
                                        var28 = param10;
                                        L9: while (true) {
                                          L10: {
                                            L11: {
                                              if (param10 - -20 <= var28) {
                                                break L11;
                                              } else {
                                                stackOut_56_0 = 0;
                                                stackOut_56_1 = var24;
                                                stackIn_79_0 = stackOut_56_0;
                                                stackIn_79_1 = stackOut_56_1;
                                                stackIn_57_0 = stackOut_56_0;
                                                stackIn_57_1 = stackOut_56_1;
                                                if (var39 != 0) {
                                                  break L10;
                                                } else {
                                                  L12: {
                                                    if (stackIn_57_0 > stackIn_57_1) {
                                                      break L12;
                                                    } else {
                                                      if (var24 >= var22) {
                                                        break L12;
                                                      } else {
                                                        if (var28 < 0) {
                                                          break L12;
                                                        } else {
                                                          if (~var23 >= ~var28) {
                                                            break L12;
                                                          } else {
                                                            var29 = var24 + var22 * var28;
                                                            var30 = qn.field_d[var29];
                                                            var31 = dd.field_k.field_B[var21 - -(var25 * 80)];
                                                            if (var30 != 0) {
                                                              L13: {
                                                                var32 = (16745529 & var26) >> 738102959;
                                                                if (var32 > 255) {
                                                                  var32 = 255;
                                                                  break L13;
                                                                } else {
                                                                  break L13;
                                                                }
                                                              }
                                                              var36 = (16711680 & var31) * (-var32 + 255) >>> 669334472;
                                                              var33 = 255 & var30 >> -1961506128;
                                                              var35 = (var30 & 65280) >> 917162824;
                                                              var34 = var30 & 255;
                                                              var37 = (var31 & 255) * (-var32 + 255);
                                                              var36 = var36 + var32 * 65280;
                                                              var38 = (65280 & var31) * (-var32 + 255);
                                                              var38 = var38 + 65280 * var32;
                                                              var37 = var37 + 255 * var32;
                                                              var37 = var37 >> 8;
                                                              var38 = var38 >> 8;
                                                              var30 = (var33 * var36 & -16777216 | 65280 & var37 * var34 | 16711680 & var38 * var35) >> -1439304056;
                                                              qn.field_d[var29] = var30;
                                                              break L12;
                                                            } else {
                                                              break L12;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var26 = var26 + var27;
                                                  var25++;
                                                  var28++;
                                                  if (var39 == 0) {
                                                    continue L9;
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                              }
                                            }
                                            var20 = var20 + var18;
                                            var21++;
                                            stackOut_78_0 = var19;
                                            stackOut_78_1 = var16;
                                            stackIn_79_0 = stackOut_78_0;
                                            stackIn_79_1 = stackOut_78_1;
                                            break L10;
                                          }
                                          var19 = stackIn_79_0 + stackIn_79_1;
                                          var24++;
                                          if (var39 == 0) {
                                            continue L4;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L5;
                                }
                                break L0;
                              }
                            }
                          }
                        }
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
          var15 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var15, "v.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, boolean param8, boolean param9, int param10) {
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_12_1 = false;
        int stackIn_14_0 = 0;
        boolean stackIn_14_1 = false;
        int stackIn_16_0 = 0;
        boolean stackIn_16_1 = false;
        int stackIn_17_0 = 0;
        boolean stackIn_17_1 = false;
        int stackIn_17_2 = 0;
        int stackIn_18_0 = 0;
        boolean stackIn_18_1 = false;
        int stackIn_18_2 = 0;
        int stackIn_20_0 = 0;
        boolean stackIn_20_1 = false;
        int stackIn_20_2 = 0;
        int stackIn_21_0 = 0;
        boolean stackIn_21_1 = false;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_22_1 = false;
        int stackIn_24_0 = 0;
        boolean stackIn_24_1 = false;
        int stackIn_25_0 = 0;
        boolean stackIn_25_1 = false;
        int stackIn_25_2 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_11_0 = 0;
        boolean stackOut_11_1 = false;
        int stackOut_16_0 = 0;
        boolean stackOut_16_1 = false;
        int stackOut_16_2 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_12_1 = false;
        int stackOut_14_0 = 0;
        boolean stackOut_14_1 = false;
        int stackOut_14_2 = 0;
        int stackOut_17_0 = 0;
        boolean stackOut_17_1 = false;
        int stackOut_17_2 = 0;
        int stackOut_20_0 = 0;
        boolean stackOut_20_1 = false;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_18_0 = 0;
        boolean stackOut_18_1 = false;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_21_0 = 0;
        boolean stackOut_21_1 = false;
        int stackOut_24_0 = 0;
        boolean stackOut_24_1 = false;
        int stackOut_24_2 = 0;
        int stackOut_22_0 = 0;
        boolean stackOut_22_1 = false;
        int stackOut_22_2 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        var38 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var12_int = param6 << 1744478096;
              var13 = (-var12_int + (param10 << -758926576)) / 40;
              var14 = param7 << -1020479472;
              var15 = (-var14 + (param1 << -347112496)) / 40;
              var16 = var12_int;
              var17 = var14;
              stackOut_1_0 = 0;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param4 ^ param9) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 40;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              var18 = stackIn_5_0 - -stackIn_5_1;
              var19 = so.field_b.field_a;
              var20 = so.field_b.field_g;
              if (param3 < -51) {
                break L2;
              } else {
                ((v) this).field_g = -88;
                break L2;
              }
            }
            var21 = param5;
            L3: while (true) {
              L4: {
                L5: {
                  if (40 + param5 <= var21) {
                    break L5;
                  } else {
                    if (var38 != 0) {
                      break L4;
                    } else {
                      L6: {
                        stackOut_11_0 = 0;
                        stackOut_11_1 = param9;
                        stackIn_16_0 = stackOut_11_0;
                        stackIn_16_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (param4) {
                          stackOut_16_0 = stackIn_16_0;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          break L6;
                        } else {
                          stackOut_12_0 = stackIn_12_0;
                          stackOut_12_1 = stackIn_12_1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackOut_14_0 = stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = 1;
                          stackIn_17_0 = stackOut_14_0;
                          stackIn_17_1 = stackOut_14_1;
                          stackIn_17_2 = stackOut_14_2;
                          break L6;
                        }
                      }
                      L7: {
                        stackOut_17_0 = stackIn_17_0;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = stackIn_17_2;
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_20_2 = stackOut_17_2;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        if (param8) {
                          stackOut_20_0 = stackIn_20_0;
                          stackOut_20_1 = stackIn_20_1;
                          stackOut_20_2 = stackIn_20_2;
                          stackOut_20_3 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          stackIn_21_1 = stackOut_20_1;
                          stackIn_21_2 = stackOut_20_2;
                          stackIn_21_3 = stackOut_20_3;
                          break L7;
                        } else {
                          stackOut_18_0 = stackIn_18_0;
                          stackOut_18_1 = stackIn_18_1;
                          stackOut_18_2 = stackIn_18_2;
                          stackOut_18_3 = 1;
                          stackIn_21_0 = stackOut_18_0;
                          stackIn_21_1 = stackOut_18_1;
                          stackIn_21_2 = stackOut_18_2;
                          stackIn_21_3 = stackOut_18_3;
                          break L7;
                        }
                      }
                      L8: {
                        stackOut_21_0 = stackIn_21_0;
                        stackOut_21_1 = stackIn_21_1;
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        if (stackIn_21_2 == stackIn_21_3) {
                          stackOut_24_0 = stackIn_24_0;
                          stackOut_24_1 = stackIn_24_1;
                          stackOut_24_2 = 0;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          stackIn_25_2 = stackOut_24_2;
                          break L8;
                        } else {
                          stackOut_22_0 = stackIn_22_0;
                          stackOut_22_1 = stackIn_22_1;
                          stackOut_22_2 = 1;
                          stackIn_25_0 = stackOut_22_0;
                          stackIn_25_1 = stackOut_22_1;
                          stackIn_25_2 = stackOut_22_2;
                          break L8;
                        }
                      }
                      L9: {
                        stackOut_25_0 = stackIn_25_0;
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_26_0 = stackOut_25_0;
                        if (stackIn_25_1 ^ stackIn_25_2 == 0) {
                          stackOut_28_0 = stackIn_28_0;
                          stackOut_28_1 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          stackIn_29_1 = stackOut_28_1;
                          break L9;
                        } else {
                          stackOut_26_0 = stackIn_26_0;
                          stackOut_26_1 = 20;
                          stackIn_29_0 = stackOut_26_0;
                          stackIn_29_1 = stackOut_26_1;
                          break L9;
                        }
                      }
                      L10: {
                        var22 = stackIn_29_0 + stackIn_29_1;
                        var23 = var16;
                        if (!param8) {
                          stackOut_32_0 = -param5 + var21 >> 1603853377;
                          stackIn_33_0 = stackOut_32_0;
                          break L10;
                        } else {
                          stackOut_30_0 = -var21 + (param5 - -40) >> -2076091967;
                          stackIn_33_0 = stackOut_30_0;
                          break L10;
                        }
                      }
                      var24 = stackIn_33_0;
                      var25 = 0;
                      var26 = (var17 - var16) / 20;
                      var27 = param2;
                      L11: while (true) {
                        L12: {
                          L13: {
                            if (~(param2 + 20) >= ~var27) {
                              break L13;
                            } else {
                              stackOut_35_0 = ~var25;
                              stackOut_35_1 = ~var24;
                              stackIn_68_0 = stackOut_35_0;
                              stackIn_68_1 = stackOut_35_1;
                              stackIn_36_0 = stackOut_35_0;
                              stackIn_36_1 = stackOut_35_1;
                              if (var38 != 0) {
                                break L12;
                              } else {
                                L14: {
                                  L15: {
                                    L16: {
                                      if (stackIn_36_0 > stackIn_36_1) {
                                        break L16;
                                      } else {
                                        if (!param0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    if (~var25 <= ~var24) {
                                      break L14;
                                    } else {
                                      if (param0) {
                                        break L15;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  if (0 > var21) {
                                    break L14;
                                  } else {
                                    if (~var19 >= ~var21) {
                                      break L14;
                                    } else {
                                      if (0 > var27) {
                                        break L14;
                                      } else {
                                        if (var20 <= var27) {
                                          break L14;
                                        } else {
                                          var28 = var21 + var19 * var27;
                                          var29 = qn.field_d[var28];
                                          var30 = dd.field_k.field_B[var22 * 80 + var18];
                                          if (var29 == 0) {
                                            break L14;
                                          } else {
                                            L17: {
                                              var31 = (16772243 & var23) >> -1304464561;
                                              if (255 < var31) {
                                                var31 = 255;
                                                break L17;
                                              } else {
                                                break L17;
                                              }
                                            }
                                            var32 = (var29 & 16711680) >> -1382720272;
                                            var34 = 255 & var29 >> 1430622952;
                                            var35 = (-var31 + 255) * (16711680 & var30) >>> -1548807032;
                                            var33 = var29 & 255;
                                            var36 = (var30 & 255) * (-var31 + 255);
                                            var35 = var35 + var31 * 65280;
                                            var37 = (-var31 + 255) * (65280 & var30);
                                            var37 = var37 + var31 * 65280;
                                            var36 = var36 + 255 * var31;
                                            var37 = var37 >> 8;
                                            var36 = var36 >> 8;
                                            var29 = (var37 * var34 & 16711680 | (var36 * var33 & 65280 | var32 * var35 & -16777216)) >> 624440520;
                                            qn.field_d[var28] = var29;
                                            break L14;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var25++;
                                var23 = var23 + var26;
                                var22++;
                                var27++;
                                if (var38 == 0) {
                                  continue L11;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          var16 = var16 + var13;
                          var18++;
                          stackOut_67_0 = var17;
                          stackOut_67_1 = var15;
                          stackIn_68_0 = stackOut_67_0;
                          stackIn_68_1 = stackOut_67_1;
                          break L12;
                        }
                        var17 = stackIn_68_0 + stackIn_68_1;
                        var21++;
                        if (var38 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var12, "v.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 != 55) {
            return;
        }
        try {
            field_f = null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "v.GA(" + param0 + ')');
        }
    }

    final boolean a(int param0, boolean param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, int param8) {
        int var10_int = 0;
        RuntimeException var10 = null;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              var10_int = 0;
              var10_int = this.a(true, param7, param8, param2) ? 1 : 0;
              if (var10_int == 0) {
                var10_int = this.a(true, param1, param6, param4, param5, param3) ? 1 : 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 >= 88) {
                break L2;
              } else {
                this.e(93);
                break L2;
              }
            }
            stackOut_7_0 = var10_int;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var10, "v.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final void g(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
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
        int stackIn_6_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = ((v) this).field_n[0];
              var3 = ((v) this).field_n[1];
              ((v) this).field_c[0] = var2_int;
              var3 -= 3;
              ((v) this).field_c[1] = var3;
              ((v) this).f(param0 + -242);
              ((v) this).i(0);
              if (param0 == 200) {
                break L1;
              } else {
                ((v) this).field_i = 67;
                break L1;
              }
            }
            var4 = 40 + ((v) this).field_e[0];
            var5 = -20 + ((v) this).field_e[1];
            var6 = var4;
            var7 = var5;
            var8 = var2_int;
            var9 = var3;
            var10 = so.field_b.field_a;
            var11 = so.field_b.field_g;
            qn.f(0, 0, var10, var11);
            var12 = 0;
            L2: while (true) {
              stackOut_5_0 = var11 - -200 - -256;
              stackOut_5_1 = var7;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_6_0 <= stackIn_6_1) {
                      break L5;
                    } else {
                      L6: while (true) {
                        if (var13 != 0) {
                          break L4;
                        } else {
                          L7: {
                            if (var6 >= var10 - -80) {
                              break L7;
                            } else {
                              stackOut_9_0 = -5;
                              stackOut_9_1 = var8;
                              stackIn_6_0 = stackOut_9_0;
                              stackIn_6_1 = stackOut_9_1;
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              if (var13 != 0) {
                                continue L3;
                              } else {
                                stackOut_10_0 = stackIn_10_0;
                                stackOut_10_1 = stackIn_10_1;
                                stackIn_12_0 = stackOut_10_0;
                                stackIn_12_1 = stackOut_10_1;
                                L8: {
                                  if (stackIn_12_0 > stackIn_12_1) {
                                    break L8;
                                  } else {
                                    if (((v) this).field_j < var8) {
                                      break L8;
                                    } else {
                                      if (var9 < -1) {
                                        break L8;
                                      } else {
                                        if (~(4 + ((v) this).field_m) > ~var9) {
                                          break L8;
                                        } else {
                                          L9: {
                                            if (~(40 + var11) <= ~var7) {
                                              stackOut_27_0 = 0;
                                              stackIn_28_0 = stackOut_27_0;
                                              break L9;
                                            } else {
                                              stackOut_25_0 = 1;
                                              stackIn_28_0 = stackOut_25_0;
                                              break L9;
                                            }
                                          }
                                          L10: {
                                            bi.a(stackIn_28_0 != 0, var7, var6, param0 ^ 132, var8, var9);
                                            if (var7 <= var11 - -120) {
                                              stackOut_31_0 = 0;
                                              stackIn_32_0 = stackOut_31_0;
                                              break L10;
                                            } else {
                                              stackOut_29_0 = 1;
                                              stackIn_32_0 = stackOut_29_0;
                                              break L10;
                                            }
                                          }
                                          L11: {
                                            wd.a(stackIn_32_0 != 0, var6, (byte) -128, var9 - 2, -80 + var7, var8 + 2);
                                            if (var7 <= 200 + var11) {
                                              stackOut_35_0 = 0;
                                              stackIn_36_0 = stackOut_35_0;
                                              break L11;
                                            } else {
                                              stackOut_33_0 = 1;
                                              stackIn_36_0 = stackOut_33_0;
                                              break L11;
                                            }
                                          }
                                          mn.a(stackIn_36_0 != 0, 4 + var8, var6, (byte) 120, var9 + -4, var7 - 160);
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                }
                                var9++;
                                var8++;
                                var6 += 80;
                                if (var13 == 0) {
                                  continue L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          L12: {
                            var7 += 20;
                            if (var12 == 0) {
                              break L12;
                            } else {
                              var6 = var4 - 40;
                              var2_int--;
                              break L12;
                            }
                          }
                          L13: {
                            if (var12 == 0) {
                              var6 = var4;
                              var3++;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            var9 = var3;
                            var8 = var2_int;
                            if (var12 != 0) {
                              stackOut_47_0 = 0;
                              stackIn_48_0 = stackOut_47_0;
                              break L14;
                            } else {
                              stackOut_45_0 = 1;
                              stackIn_48_0 = stackOut_45_0;
                              break L14;
                            }
                          }
                          var12 = stackIn_48_0;
                          if (var13 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  break L4;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "v.M(" + param0 + ')');
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              ((v) this).field_c[1] = param2 / ((v) this).field_j;
              if (param1 == 113) {
                break L1;
              } else {
                ((v) this).field_e = null;
                break L1;
              }
            }
            ((v) this).field_c[0] = -(((v) this).field_c[1] * ((v) this).field_j) + param2;
            ((v) this).f(-62);
            stackOut_3_0 = this.b((byte) -125, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "v.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final void a(byte param0, at param1) {
        RuntimeException var3 = null;
        vb var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        byte stackOut_29_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_ref = (vb) (Object) param1.d((byte) -77);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3_ref == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = ~var3_ref.field_x;
                    stackIn_30_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 >= 0) {
                        var3_ref = (vb) (Object) param1.b((byte) 73);
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        L4: {
                          if (var3_ref != ((v) this).field_d) {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            break L4;
                          } else {
                            stackOut_10_0 = 1;
                            stackIn_13_0 = stackOut_10_0;
                            break L4;
                          }
                        }
                        L5: {
                          var4 = stackIn_13_0;
                          ((v) this).field_d = var3_ref;
                          if (var4 == 0) {
                            ((v) this).field_q = true;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            ((v) this).field_i = -(so.field_b.field_g >> 1296231521) + var3_ref.field_v + ((v) this).field_p[1];
                            ((v) this).field_g = ((v) this).field_p[0] + var3_ref.field_m - (so.field_b.field_a >> 1432716833);
                            var5 = ((v) this).field_p[0] + -((v) this).field_g;
                            var6 = -((v) this).field_i + ((v) this).field_p[1];
                            if (var6 * var6 + var5 * var5 < 40000) {
                              break L7;
                            } else {
                              ((v) this).field_q = true;
                              if (var7 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (var4 != 0) {
                            break L6;
                          } else {
                            ((v) this).field_q = false;
                            break L6;
                          }
                        }
                        if (((v) this).field_q) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                ((v) this).field_k[0] = ((v) this).field_g;
                ((v) this).field_k[1] = ((v) this).field_i;
                stackOut_29_0 = param0;
                stackIn_30_0 = stackOut_29_0;
                break L2;
              }
              L8: {
                if (stackIn_30_0 > 99) {
                  break L8;
                } else {
                  ((v) this).b(63, 30, (byte) -17);
                  break L8;
                }
              }
              boolean discarded$1 = this.b((byte) -127, -1);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("v.F(").append(param0).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L9;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
    }

    final void a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((v) this).field_c[1] = param1 / ((v) this).field_j;
            ((v) this).field_c[0] = param1 - ((v) this).field_j * ((v) this).field_c[1];
            this.c((byte) -28);
            var3_int = 121 / ((-71 - param0) / 49);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "v.R(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((v) this).field_c[param0] = param1 / ((v) this).field_j;
            ((v) this).field_c[0] = param1 - ((v) this).field_j * ((v) this).field_c[1];
            ((v) this).f(param0 ^ -72);
            ((v) this).i(param0 + -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "v.P(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = -71 % ((4 - param0) / 32);
            var3 = new cn(ns.a(false, 2147483647, li.field_n), 4, ((v) this).field_j / 5, ((v) this).field_m / 5, 7, 0.5f, true).a(((v) this).field_m, (byte) 93, ((v) this).field_j);
            ((v) this).field_o = new int[var3.length];
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3.length >= ~var4) {
                    break L3;
                  } else {
                    ((v) this).field_o[var4] = 256 + -rn.a((int) var3[var4], 255);
                    var4++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "v.LA(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((v) this).f(-112);
              ((v) this).field_p[0] = ((v) this).field_k[0];
              ((v) this).field_p[1] = ((v) this).field_k[1];
              ((v) this).field_g = ((v) this).field_k[0];
              ((v) this).field_i = ((v) this).field_k[1];
              this.a(param0);
              if (!param0) {
                break L1;
              } else {
                this.a(true);
                break L1;
              }
            }
            this.h(-1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "v.CA(" + param0 + ')');
        }
    }

    v(int param0, int param1) {
        ((v) this).field_i = 0;
        ((v) this).field_g = 0;
        try {
            this.a(param1, param0, -87);
            ir.field_d = (v) this;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "v.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        ((v) this).field_l = new int[2];
        ((v) this).field_n = new int[2];
        ((v) this).field_r = new int[2];
        ((v) this).field_a = new int[2];
        ((v) this).field_p = new int[2];
        ((v) this).field_p[0] = 40 + 80 * (((v) this).field_j >> -1320498367) + -80;
        ((v) this).field_e = new int[2];
        ((v) this).field_p[1] = 20 + 40 * (-1 + (((v) this).field_m >> 1562891137));
        ((v) this).field_k = new int[2];
        if (param2 > -53) {
            return;
        }
        try {
            ((v) this).field_h = new int[2];
            ((v) this).field_c = new int[2];
            ((v) this).field_m = param0;
            ((v) this).field_j = param1;
            this.b(63);
            boolean discarded$0 = ((v) this).a(101, false, so.field_b.field_g >> 390950721, false, false, false, false, false, so.field_b.field_a >> 769477153);
            this.h(-1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "v.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void f(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = -20;
              var9 = 20;
              var6 = 40;
              var2_int = 40;
              var4 = ((v) this).field_c[0];
              var5 = ((v) this).field_c[1];
              if (param0 < -30) {
                break L1;
              } else {
                ((v) this).field_d = null;
                break L1;
              }
            }
            var8 = 40;
            var3 = ((v) this).field_j * 40 >> -2123161439;
            var11 = var5 * var9 + var4 * var7;
            var10 = var6 * var4 - -(var8 * var5);
            var3 = var3 - -var11;
            var2_int = var10 + var2_int;
            ((v) this).field_k[0] = var2_int;
            ((v) this).field_k[1] = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "v.N(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Environmental";
    }
}
