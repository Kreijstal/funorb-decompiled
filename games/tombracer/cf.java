/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf implements bo {
    private int field_d;
    static String field_f;
    private int field_j;
    private int[] field_b;
    static String field_c;
    private int field_g;
    private int[][] field_i;
    private int[] field_a;
    static String field_e;
    private int[] field_h;

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_e = null;
        if (param0 == 10) {
            return;
        }
        field_c = (String) null;
    }

    public final void a(int param0, kh param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param1.i(param0 + -192);
            param1.a((byte) 115, this.field_g, 3);
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_g <= var3_int) {
                    break L3;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      var4 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (-4 >= (var4 ^ -1)) {
                              break L6;
                            } else {
                              param1.a((byte) -128, this.field_i[var3_int][var4], 8);
                              var4++;
                              if (var5 != 0) {
                                break L5;
                              } else {
                                if (var5 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var3_int++;
                          break L5;
                        }
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              }
              var3_int = stackIn_12_0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (var3_int >= this.field_g) {
                      break L9;
                    } else {
                      param1.a((byte) -127, this.field_b[var3_int], 10);
                      var3_int++;
                      if (var5 != 0) {
                        break L8;
                      } else {
                        if (var5 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  if (param0 == 200) {
                    break L8;
                  } else {
                    field_f = (String) null;
                    break L8;
                  }
                }
                var3_int = 0;
                L10: while (true) {
                  L11: {
                    L12: {
                      if (this.field_g <= var3_int) {
                        break L12;
                      } else {
                        param1.a((byte) 69, this.field_a[var3_int] + 1, 4);
                        param1.a((byte) -128, this.field_h[var3_int], 10);
                        var3_int++;
                        if (var5 != 0) {
                          break L11;
                        } else {
                          if (var5 == 0) {
                            continue L10;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    param1.a((byte) 55, this.field_d - -1, 3);
                    param1.a((byte) -125, 1 + this.field_j, 16);
                    param1.k(param0 ^ -1826190742);
                    break L11;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var3);
            stackOut_26_1 = new StringBuilder().append("cf.B(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L13;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L13;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    public final String toString() {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        String stackIn_4_0 = null;
        String stackIn_5_0 = null;
        String stackOut_3_0 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        var1 = "S2CRoundResultPacket:";
        var1 = var1 + " winner:" + this.field_d;
        var1 = var1 + " totals:";
        var2 = 0;
        L0: while (true) {
          if (this.field_g > var2) {
            stackOut_3_0 = var1 + this.field_b[var2] + " ";
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var3 == 0) {
              var1 = stackIn_5_0;
              var2++;
              continue L0;
            } else {
              return stackIn_4_0;
            }
          } else {
            return var1;
          }
        }
    }

    public final void a(kh param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        kh var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        byte stackOut_11_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param0.h((byte) -71);
            this.field_g = param0.b((byte) 44, 3);
            this.field_i = new int[this.field_g][3];
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_g <= var3_int) {
                    break L3;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      var4 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (-4 >= (var4 ^ -1)) {
                              break L6;
                            } else {
                              this.field_i[var3_int][var4] = param0.b((byte) 44, 8);
                              var4++;
                              if (var5 != 0) {
                                break L5;
                              } else {
                                if (var5 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var3_int++;
                          break L5;
                        }
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_11_0 = param1;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              }
              L7: {
                if (stackIn_12_0 == -19) {
                  break L7;
                } else {
                  var6 = (kh) null;
                  this.a(41, (kh) null);
                  break L7;
                }
              }
              this.field_b = new int[this.field_g];
              var3_int = 0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (this.field_g <= var3_int) {
                      break L10;
                    } else {
                      this.field_b[var3_int] = param0.b((byte) 44, 10);
                      var3_int++;
                      if (var5 != 0) {
                        break L9;
                      } else {
                        if (var5 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  this.field_a = new int[this.field_g];
                  this.field_h = new int[this.field_g];
                  break L9;
                }
                var3_int = 0;
                L11: while (true) {
                  L12: {
                    L13: {
                      if (var3_int >= this.field_g) {
                        break L13;
                      } else {
                        this.field_a[var3_int] = -1 + param0.b((byte) 44, 4);
                        this.field_h[var3_int] = param0.b((byte) 44, 10);
                        var3_int++;
                        if (var5 != 0) {
                          break L12;
                        } else {
                          if (var5 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    this.field_d = param0.b((byte) 44, 3) - 1;
                    this.field_j = -1 + param0.b((byte) 44, 16);
                    param0.i((byte) 98);
                    break L12;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var3);
            stackOut_27_1 = new StringBuilder().append("cf.A(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L14;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param1 > -100) {
          L0: {
            field_c = (String) null;
            ff.field_w = param0;
            if (null != fq.field_e) {
              fq.field_e.a(param0, -83);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != tva.field_d) {
              tva.field_d.a((byte) 91, param0);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            ff.field_w = param0;
            if (null != fq.field_e) {
              fq.field_e.a(param0, -83);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null != tva.field_d) {
              tva.field_d.a((byte) 91, param0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -16390) {
                break L1;
              } else {
                cf.a(-31);
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = -param2 + param3;
                if (var4_int > 0) {
                  L4: while (true) {
                    L5: {
                      if (var4_int >= -param0 / 2) {
                        break L5;
                      } else {
                        var4_int = var4_int + param0;
                        if (var5 != 0) {
                          break L3;
                        } else {
                          if (var5 == 0) {
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: while (true) {
                      if (var4_int <= param0 / 2) {
                        break L3;
                      } else {
                        stackOut_10_0 = var4_int - param0;
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          var4_int = stackIn_11_0;
                          if (var5 == 0) {
                            continue L6;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackOut_12_0 = var4_int;
              stackIn_13_0 = stackOut_12_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "cf.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0;
    }

    final void a(qh param0, int param1) {
        RuntimeException runtimeException = null;
        int var4 = 0;
        hca var5 = null;
        int var6 = 0;
        int var7 = 0;
        ff var8 = null;
        ff var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var8 = param0.field_k;
            var9 = var8;
            var4 = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var9.field_H.length <= var4) {
                    break L3;
                  } else {
                    var5 = var8.field_H[var4];
                    if (var7 != 0) {
                      break L2;
                    } else {
                      var6 = 0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (3 <= var6) {
                              break L6;
                            } else {
                              var5.a(true, var6, this.field_i[var4][var6]);
                              var6++;
                              if (var7 != 0) {
                                break L5;
                              } else {
                                if (var7 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var5.a((byte) 126, this.field_b[var4]);
                          var5.b(18202625, this.field_a[var4]);
                          var5.f(this.field_h[var4], -25915);
                          var4++;
                          break L5;
                        }
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                param0.field_k.field_E = this.field_j;
                param0.a((byte) 101, this.field_i, this.field_d);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("cf.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L7;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
    }

    cf(int param0) {
        this.field_g = param0;
        this.field_a = new int[this.field_g];
        this.field_h = new int[this.field_g];
        this.field_i = new int[this.field_g][3];
        this.field_b = new int[this.field_g];
    }

    static {
        field_f = "<%0> has joined your game.";
        field_c = "You can ask to join this game";
    }
}
