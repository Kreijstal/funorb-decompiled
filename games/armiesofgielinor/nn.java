/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nn {
    private int field_x;
    static me field_c;
    private boolean field_g;
    private int[] field_h;
    int field_n;
    private boolean field_t;
    static String field_s;
    int[] field_q;
    int field_y;
    private ha field_r;
    int[] field_e;
    int field_b;
    boolean field_f;
    jd field_i;
    int field_l;
    int field_j;
    boolean field_a;
    private int field_o;
    int field_p;
    int field_m;
    boolean field_u;
    int[] field_k;
    private int field_A;
    private int field_d;
    static dl field_z;
    static String field_v;
    boolean field_w;

    final int a(bv param0, byte param1, jd param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (!((nn) this).field_t) {
                break L1;
              } else {
                if (!((nn) this).field_u) {
                  break L1;
                } else {
                  param0.h(32161, 65);
                  var4_int = 9;
                  param0.b(1, var4_int);
                  param0.b(1, 96);
                  param0.b(1, param2.field_J);
                  param0.b(1, param2.field_w);
                  param0.b(1, 0);
                  param0.b(1, 0);
                  param0.b(1, ((nn) this).field_i.field_J);
                  param0.b(1, ((nn) this).field_i.field_w);
                  pd.a(((nn) this).field_l, ((nn) this).field_j, (vh) (Object) param0, -100);
                  stackOut_2_0 = var4_int;
                  stackIn_3_0 = stackOut_2_0;
                  return stackIn_3_0;
                }
              }
            }
            L2: {
              if (((nn) this).field_h == null) {
                ((nn) this).field_m = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((nn) this).field_m != 0) {
                break L3;
              } else {
                if (0 != ((nn) this).field_l) {
                  break L3;
                } else {
                  if (((nn) this).field_j == 0) {
                    stackOut_11_0 = -1;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L4: {
              stackOut_13_0 = 4;
              stackOut_13_1 = -(((nn) this).field_m / 4);
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              if (((nn) this).field_m % 4 > 0) {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = stackIn_15_1;
                stackOut_15_2 = 1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                stackIn_16_2 = stackOut_15_2;
                break L4;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = stackIn_14_1;
                stackOut_14_2 = 0;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                break L4;
              }
            }
            L5: {
              var4_int = stackIn_16_0 - (stackIn_16_1 - (stackIn_16_2 - -5));
              if (param1 <= -24) {
                break L5;
              } else {
                this.a(-36, 76, -91);
                break L5;
              }
            }
            param0.h(32161, 65);
            param0.b(1, var4_int);
            param0.b(1, 96);
            param0.b(1, param2.field_J);
            param0.b(1, param2.field_w);
            param0.b(1, (135 | ((nn) this).field_m) >> 8);
            param0.b(1, 255 & ((nn) this).field_m);
            param0.b(1, ((nn) this).field_i.field_J);
            param0.b(1, ((nn) this).field_i.field_w);
            jj.a((byte) -112, ((nn) this).field_m, (vh) (Object) param0, ((nn) this).field_h);
            pd.a(((nn) this).field_l, ((nn) this).field_j, (vh) (Object) param0, -73);
            stackOut_18_0 = var4_int;
            stackIn_19_0 = stackOut_18_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("nn.N(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44).append(param1).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_19_0;
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ne var6 = null;
        int var6_int = 0;
        ne var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var10 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (0 == (4 & ((nn) this).field_r.b(31, ((nn) this).field_i.field_w, ((nn) this).field_i.field_J, ((nn) this).field_i.field_O))) {
            break L0;
          } else {
            param1 = 0;
            break L0;
          }
        }
        L1: {
          if (param1 < 0) {
            var4 = 0;
            L2: while (true) {
              if (var4 >= ((nn) this).field_x) {
                break L1;
              } else {
                var10 = 0;
                var5 = var10;
                L3: while (true) {
                  if (~((nn) this).field_A >= ~var10) {
                    var4++;
                    continue L2;
                  } else {
                    L4: {
                      var6 = ((nn) this).field_r.field_Eb[var4 - -(var10 * ((nn) this).field_x)];
                      if (var6.field_h == 2) {
                        break L4;
                      } else {
                        if (7 == var6.field_h) {
                          break L4;
                        } else {
                          if (var6.field_h == 11) {
                            break L4;
                          } else {
                            if (var6.field_h == 4) {
                              break L4;
                            } else {
                              if (6 == var6.field_h) {
                                break L4;
                              } else {
                                L5: {
                                  if (var6.field_c == null) {
                                    break L5;
                                  } else {
                                    if (param0) {
                                      break L5;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                ((nn) this).field_q[var4 + ((nn) this).field_x * var10] = 0;
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    var10++;
                    continue L3;
                  }
                }
              }
            }
          } else {
            L6: {
              if (param0) {
                if (((nn) this).field_i.field_P == 7) {
                  param1 = param1 >> 1;
                  break L6;
                } else {
                  if (((nn) this).field_i.field_P != 8) {
                    break L6;
                  } else {
                    param1 = 0;
                    break L6;
                  }
                }
              } else {
                break L6;
              }
            }
            var4 = -param1;
            L7: while (true) {
              if (var4 > param1) {
                break L1;
              } else {
                var5 = -param1;
                L8: while (true) {
                  if (~var5 < ~param1) {
                    var4++;
                    continue L7;
                  } else {
                    L9: {
                      var6_int = Math.abs(var4) + Math.abs(var5);
                      if (var4 + ((nn) this).field_i.field_J <= -1) {
                        break L9;
                      } else {
                        if (var4 + ((nn) this).field_i.field_J >= ((nn) this).field_x) {
                          break L9;
                        } else {
                          if (((nn) this).field_i.field_w + var5 <= -1) {
                            break L9;
                          } else {
                            if (var5 - -((nn) this).field_i.field_w >= ((nn) this).field_A) {
                              break L9;
                            } else {
                              var7 = ((nn) this).field_r.field_Eb[((nn) this).field_x * (((nn) this).field_i.field_w + var5) + (((nn) this).field_i.field_J + var4)];
                              if (2 == var7.field_h) {
                                break L9;
                              } else {
                                L10: {
                                  L11: {
                                    if (var7.field_h == 7) {
                                      break L11;
                                    } else {
                                      if (var7.field_h != 11) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  if (!param0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                                if (4 == var7.field_h) {
                                  break L9;
                                } else {
                                  if (6 == var7.field_h) {
                                    break L9;
                                  } else {
                                    if (var6_int > param1) {
                                      break L9;
                                    } else {
                                      L12: {
                                        if (null == var7.field_c) {
                                          break L12;
                                        } else {
                                          if (param0) {
                                            break L12;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      ((nn) this).field_q[((nn) this).field_x * (var5 - -((nn) this).field_i.field_w) + (var4 - -((nn) this).field_i.field_J)] = 0;
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var5++;
                    continue L8;
                  }
                }
              }
            }
          }
        }
        L13: {
          if (param2 > 65) {
            break L13;
          } else {
            var9 = null;
            ((nn) this).a(true, 39, -101, (jd) null, -116, -60);
            break L13;
          }
        }
    }

    final void a(int param0, boolean param1, int param2, byte param3) {
        int var5 = 0;
        jd var6 = null;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((nn) this).field_i == null) {
          return;
        } else {
          L0: {
            if (((nn) this).field_o == ((nn) this).field_i.field_O) {
              break L0;
            } else {
              if (param1) {
                break L0;
              } else {
                if (((nn) this).field_p != 36) {
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          L1: {
            if (0 > param0) {
              break L1;
            } else {
              if (0 > param2) {
                break L1;
              } else {
                if (((nn) this).field_x <= param2) {
                  break L1;
                } else {
                  if (param0 < ((nn) this).field_A) {
                    L2: {
                      L3: {
                        ((nn) this).field_g = false;
                        ((nn) this).field_u = false;
                        ((nn) this).field_b = param0;
                        ((nn) this).field_j = 0;
                        ((nn) this).field_t = false;
                        var5 = -124 / ((-19 - param3) / 60);
                        ((nn) this).field_h = null;
                        ((nn) this).field_l = 0;
                        ((nn) this).field_n = param2;
                        if (-52 == ((nn) this).field_i.field_N) {
                          break L3;
                        } else {
                          L4: {
                            if (((nn) this).field_p <= -1) {
                              break L4;
                            } else {
                              if (-25 == uc.field_d[((nn) this).field_p][5]) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var6 = ((nn) this).field_r.c(param0, true, param2);
                          if (var6 != null) {
                            L5: {
                              if (var6.field_O != ((nn) this).field_o) {
                                break L5;
                              } else {
                                if (!((nn) this).field_a) {
                                  break L2;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            this.a(param0, param2, (byte) -120);
                            break L2;
                          } else {
                            ((nn) this).a(param0, (byte) -116, param2);
                            break L2;
                          }
                        }
                      }
                      this.a(param0, param2, 0);
                      break L2;
                    }
                    return;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          ((nn) this).e(-116);
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = param0 * ((nn) this).field_x + param2;
          var5 = var4;
          var6 = param2;
          var7 = param0;
          if (!((nn) this).field_i.field_W) {
            break L0;
          } else {
            if (((nn) this).field_i.field_N != 0) {
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          L2: {
            var8 = 0;
            ((nn) this).field_g = true;
            if (-1 >= ((nn) this).field_p) {
              break L2;
            } else {
              if (uc.field_d[((nn) this).field_p][5] == 18) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          break L1;
        }
        L3: while (true) {
          L4: {
            if (((nn) this).field_q[var5] <= 0) {
              var7 = param0;
              var6 = param2;
              var5 = var4;
              ((nn) this).field_h = new int[var8];
              var8--;
              L5: while (true) {
                if (0 >= ((nn) this).field_q[var5]) {
                  L6: {
                    ((nn) this).field_m = ((nn) this).field_h.length;
                    stackOut_35_0 = this;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_36_0 = stackOut_35_0;
                    if (((nn) this).field_i.field_s) {
                      stackOut_37_0 = this;
                      stackOut_37_1 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      break L6;
                    } else {
                      stackOut_36_0 = this;
                      stackOut_36_1 = 1;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      break L6;
                    }
                  }
                  ((nn) this).field_u = stackIn_38_1 != 0;
                  break L4;
                } else {
                  L7: {
                    var9 = this.a(var5, (byte) 39, var6, var7);
                    ((nn) this).field_h[var8] = kf.b(3, var9);
                    var10 = var9;
                    if (1 == var10) {
                      var5 = var5 - ((nn) this).field_x;
                      var7--;
                      break L7;
                    } else {
                      if (var10 != 0) {
                        if (var10 != 2) {
                          if (var10 == 3) {
                            var6--;
                            var5--;
                            break L7;
                          } else {
                            break L7;
                          }
                        } else {
                          var5 = var5 + ((nn) this).field_x;
                          var7++;
                          break L7;
                        }
                      } else {
                        var5++;
                        var6++;
                        break L7;
                      }
                    }
                  }
                  var8--;
                  continue L5;
                }
              }
            } else {
              L8: {
                var9 = this.a(var5, (byte) 84, var6, var7);
                var10 = var9;
                if (var10 == 1) {
                  var7--;
                  var5 = var5 - ((nn) this).field_x;
                  break L8;
                } else {
                  if (var10 != 0) {
                    if (2 != var10) {
                      if (3 != var10) {
                        break L8;
                      } else {
                        var6--;
                        var5--;
                        break L8;
                      }
                    } else {
                      var7++;
                      var5 = var5 + ((nn) this).field_x;
                      break L8;
                    }
                  } else {
                    var6++;
                    var5++;
                    break L8;
                  }
                }
              }
              var8++;
              if (99 >= var8) {
                continue L3;
              } else {
                ((nn) this).field_h = null;
                break L4;
              }
            }
          }
          L9: {
            ((nn) this).field_f = true;
            if (param1 == -116) {
              break L9;
            } else {
              ((nn) this).field_w = false;
              break L9;
            }
          }
          return;
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        ul stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        ul stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        ul stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        ul stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        ul stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        ul stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        int stackOut_63_4 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((nn) this).field_i.field_J != param1) {
            break L0;
          } else {
            if (param0 == ((nn) this).field_i.field_w) {
              return;
            } else {
              break L0;
            }
          }
        }
        if ((4 & ((nn) this).field_e[param1 + param0 * ((nn) this).field_x]) != 0) {
          L1: {
            var4 = bw.field_m[((nn) this).field_i.field_N][7];
            var5 = bw.field_m[((nn) this).field_i.field_N][6];
            if (!((nn) this).field_i.field_W) {
              break L1;
            } else {
              if (((nn) this).field_i.field_N == 34) {
                var4 = 7;
                var5 = 2;
                if (3 == ((nn) this).field_i.j(20640)) {
                  var4 = var4 + ((nn) this).field_i.d(1, 115);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
          }
          L2: {
            L3: {
              L4: {
                if (((nn) this).field_i.field_N == 81) {
                  break L4;
                } else {
                  if (4 == ((nn) this).field_i.field_N) {
                    break L4;
                  } else {
                    if (74 != ((nn) this).field_i.field_N) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if (((nn) this).field_i.j(20640) == 3) {
                var4 = var4 + ((nn) this).field_i.d(1, -99);
                break L2;
              } else {
                break L3;
              }
            }
            L5: {
              if (3 != ((nn) this).field_i.g(0)) {
                break L5;
              } else {
                if (((nn) this).field_i.j(20640) != -3) {
                  break L5;
                } else {
                  var4 = var4 + ((nn) this).field_i.d(1, -87);
                  break L2;
                }
              }
            }
            if (-3 != ((nn) this).field_i.g(0)) {
              break L2;
            } else {
              if (((nn) this).field_i.j(20640) == 1) {
                var4 = var4 + ((nn) this).field_i.d(1, -95);
                break L2;
              } else {
                break L2;
              }
            }
          }
          L6: {
            if (-2 != (1 & ((nn) this).field_e[param0 * ((nn) this).field_x + param1])) {
              L7: {
                var6 = 3 * bw.field_m[((nn) this).field_i.field_N][3];
                if (!((nn) this).field_i.field_W) {
                  break L7;
                } else {
                  if (((nn) this).field_i.field_N == 0) {
                    break L7;
                  } else {
                    var6 = 0;
                    break L7;
                  }
                }
              }
              L8: {
                if (((nn) this).field_p <= -1) {
                  break L8;
                } else {
                  if (uc.field_d[((nn) this).field_p][5] != 18) {
                    break L8;
                  } else {
                    var6 = var6 << 1;
                    break L8;
                  }
                }
              }
              var7 = ((nn) this).field_i.field_J;
              ((nn) this).field_g = true;
              var8 = ((nn) this).field_i.field_w;
              var9 = -var4;
              L9: while (true) {
                if (var4 < var9) {
                  if (!((nn) this).field_u) {
                    break L6;
                  } else {
                    ((nn) this).a(var8, (byte) -116, var7);
                    ((nn) this).field_l = -var7 + param1;
                    ((nn) this).field_j = param0 + -var8;
                    break L6;
                  }
                } else {
                  var10 = -var4;
                  L10: while (true) {
                    if (var4 < var10) {
                      var9++;
                      continue L9;
                    } else {
                      var11 = Math.abs(var9) + Math.abs(var10);
                      if (-1 < var9 + param1) {
                        if (((nn) this).field_x > var9 - -param1) {
                          if (param0 + var10 > -1) {
                            if (((nn) this).field_A > param0 + var10) {
                              if (var11 <= var4) {
                                if (var5 <= var11) {
                                  L11: {
                                    if (1 != var11) {
                                      if ((2 & ((nn) this).field_r.b(31, var10 - -param0, param1 + var9, ((nn) this).field_i.field_O)) == 0) {
                                        if (0 == (((nn) this).field_r.b(31, param0, param1, ((nn) this).field_i.field_O) & 2)) {
                                          break L11;
                                        } else {
                                          var10++;
                                          continue L10;
                                        }
                                      } else {
                                        var10++;
                                        continue L10;
                                      }
                                    } else {
                                      break L11;
                                    }
                                  }
                                  if (((nn) this).field_q[param1 + (var9 + ((nn) this).field_x * (param0 + var10))] <= var6) {
                                    L12: {
                                      stackOut_62_0 = ((nn) this).field_r.field_j;
                                      stackOut_62_1 = var10 - -param0;
                                      stackOut_62_2 = param1;
                                      stackOut_62_3 = param1 + var9;
                                      stackIn_64_0 = stackOut_62_0;
                                      stackIn_64_1 = stackOut_62_1;
                                      stackIn_64_2 = stackOut_62_2;
                                      stackIn_64_3 = stackOut_62_3;
                                      stackIn_63_0 = stackOut_62_0;
                                      stackIn_63_1 = stackOut_62_1;
                                      stackIn_63_2 = stackOut_62_2;
                                      stackIn_63_3 = stackOut_62_3;
                                      if (((nn) this).field_i.g(0) != 4) {
                                        stackOut_64_0 = (ul) (Object) stackIn_64_0;
                                        stackOut_64_1 = stackIn_64_1;
                                        stackOut_64_2 = stackIn_64_2;
                                        stackOut_64_3 = stackIn_64_3;
                                        stackOut_64_4 = 0;
                                        stackIn_65_0 = stackOut_64_0;
                                        stackIn_65_1 = stackOut_64_1;
                                        stackIn_65_2 = stackOut_64_2;
                                        stackIn_65_3 = stackOut_64_3;
                                        stackIn_65_4 = stackOut_64_4;
                                        break L12;
                                      } else {
                                        stackOut_63_0 = (ul) (Object) stackIn_63_0;
                                        stackOut_63_1 = stackIn_63_1;
                                        stackOut_63_2 = stackIn_63_2;
                                        stackOut_63_3 = stackIn_63_3;
                                        stackOut_63_4 = 1;
                                        stackIn_65_0 = stackOut_63_0;
                                        stackIn_65_1 = stackOut_63_1;
                                        stackIn_65_2 = stackOut_63_2;
                                        stackIn_65_3 = stackOut_63_3;
                                        stackIn_65_4 = stackOut_63_4;
                                        break L12;
                                      }
                                    }
                                    if (((ul) (Object) stackIn_65_0).a(stackIn_65_1, stackIn_65_2, stackIn_65_3, stackIn_65_4 != 0, var4, param0, (byte) 86)) {
                                      var6 = ((nn) this).field_q[param1 + var9 - -(((nn) this).field_x * (param0 + var10))];
                                      var8 = var10 + param0;
                                      var7 = var9 - -param1;
                                      ((nn) this).field_u = true;
                                      var10++;
                                      continue L10;
                                    } else {
                                      var10++;
                                      continue L10;
                                    }
                                  } else {
                                    var10++;
                                    continue L10;
                                  }
                                } else {
                                  var10++;
                                  continue L10;
                                }
                              } else {
                                var10++;
                                continue L10;
                              }
                            } else {
                              var10++;
                              continue L10;
                            }
                          } else {
                            var10++;
                            continue L10;
                          }
                        } else {
                          var10++;
                          continue L10;
                        }
                      } else {
                        var10++;
                        continue L10;
                      }
                    }
                  }
                }
              }
            } else {
              L13: {
                stackOut_27_0 = this;
                stackIn_29_0 = stackOut_27_0;
                stackIn_28_0 = stackOut_27_0;
                if (-1 >= ((nn) this).field_i.field_B) {
                  stackOut_29_0 = this;
                  stackOut_29_1 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  break L13;
                } else {
                  stackOut_28_0 = this;
                  stackOut_28_1 = 1;
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  break L13;
                }
              }
              ((nn) this).field_u = stackIn_30_1 != 0;
              ((nn) this).field_j = param0 - ((nn) this).field_i.field_w;
              ((nn) this).field_l = param1 - ((nn) this).field_i.field_J;
              break L6;
            }
          }
          ((nn) this).field_f = true;
          return;
        } else {
          ((nn) this).field_u = false;
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
        ((nn) this).field_t = true;
        if (param2 == ((nn) this).field_q[((nn) this).field_x * param0 + param1]) {
            ((nn) this).field_u = true;
            ((nn) this).field_j = -((nn) this).field_i.field_w + param0;
            ((nn) this).field_l = param1 + -((nn) this).field_i.field_J;
        } else {
            ((nn) this).field_u = false;
        }
        ((nn) this).field_f = true;
        ((nn) this).field_u = ((nn) this).field_u & (!((nn) this).field_i.field_s ? true : false);
    }

    final void a(v param0, int param1) {
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
        wk[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        wk[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        wk[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        wk[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        wk[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.field_c[0] = ((nn) this).field_i.field_J;
              param0.field_c[1] = ((nn) this).field_i.field_w;
              param0.c(9470337);
              if (param1 == -4) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            L2: {
              var3_int = param0.field_e[0];
              var4 = param0.field_e[1];
              sc.field_f[10].g(var3_int, var4);
              param0.field_c[1] = ((nn) this).field_b;
              param0.field_c[0] = ((nn) this).field_n;
              param0.c(param1 + 9470341);
              var5 = param0.field_e[0];
              var6 = param0.field_e[1];
              var7 = ((nn) this).c(27732);
              var8 = 0;
              if (!((nn) this).field_t) {
                if (!((nn) this).field_g) {
                  break L2;
                } else {
                  L3: {
                    var9 = 0;
                    if (!((nn) this).field_u) {
                      break L3;
                    } else {
                      if (((nn) this).field_o == ((nn) this).field_r.field_gb) {
                        var9 += 6;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (null != ((nn) this).field_h) {
                      var10 = 0;
                      L5: while (true) {
                        if (((nn) this).field_h.length <= var10) {
                          break L4;
                        } else {
                          L6: {
                            var11 = 0;
                            var12 = 0;
                            var13 = ((nn) this).field_h[var10];
                            if (1 == var13) {
                              var11 = -10;
                              var12 = -5;
                              break L6;
                            } else {
                              if (var13 != 0) {
                                if (2 == var13) {
                                  var11 = 10;
                                  var12 = 5;
                                  break L6;
                                } else {
                                  if (var13 != 3) {
                                    break L6;
                                  } else {
                                    var11 = -10;
                                    var12 = 5;
                                    break L6;
                                  }
                                }
                              } else {
                                var11 = 10;
                                var12 = -5;
                                break L6;
                              }
                            }
                          }
                          L7: {
                            sc.field_f[((nn) this).field_h[var10] + var9].e(var3_int, var4, 128);
                            sc.field_f[((nn) this).field_h[var10] - -var9].e(var11 + var3_int, var4 - -var12, 128);
                            sc.field_f[((nn) this).field_h[var10] - -var9].e(var3_int - -(var11 << 1), (var12 << 1) + var4, 128);
                            if (var10 >= ((nn) this).field_h.length - 1) {
                              break L7;
                            } else {
                              if (((nn) this).field_h[1 + var10] != ((nn) this).field_h[var10]) {
                                break L7;
                              } else {
                                sc.field_f[((nn) this).field_h[var10] + var9].e(var3_int + 3 * var11, 3 * var12 + var4, 128);
                                break L7;
                              }
                            }
                          }
                          L8: {
                            var4 = var4 + (var12 << 2);
                            var3_int = var3_int + (var11 << 2);
                            if (var8 != 0) {
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var10++;
                          continue L5;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  sc.field_f[var9 + 5].e(var5, var6, 128);
                  break L2;
                }
              } else {
                L9: {
                  stackOut_4_0 = sc.field_f;
                  stackOut_4_1 = 5;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (!((nn) this).field_u) {
                    stackOut_6_0 = (wk[]) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    break L9;
                  } else {
                    stackOut_5_0 = (wk[]) (Object) stackIn_5_0;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = 6;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    break L9;
                  }
                }
                ((wk) (Object) stackIn_7_0[stackIn_7_1 + stackIn_7_2]).g(var5, var6);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("nn.O(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + param1 + 41);
        }
    }

    final void d(int param0) {
        ((nn) this).e(-42);
        ((nn) this).field_i = null;
        ((nn) this).field_p = -1;
        if (param0 >= -14) {
            return;
        }
        this.a(0);
    }

    final void e(int param0) {
        int var2 = -37 / ((param0 - 49) / 52);
        ((nn) this).field_f = false;
        ((nn) this).field_h = null;
    }

    private final int a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var5 = ((nn) this).field_q[param0];
          var7 = 30 % ((-18 - param1) / 38);
          var6 = -1;
          if (param2 <= 0) {
            break L0;
          } else {
            if (((nn) this).field_q[-1 + param0] >= var5) {
              break L0;
            } else {
              if (((nn) this).field_r.a(param0 - 1, -16, param0, ((nn) this).field_i.field_O, ((nn) this).field_i, true) == ((nn) this).field_q[param0] + -((nn) this).field_q[param0 + -1]) {
                var6 = 3;
                var5 = ((nn) this).field_q[param0 + -1];
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L1: {
          if (param2 >= -1 + ((nn) this).field_x) {
            break L1;
          } else {
            if (((nn) this).field_q[1 + param0] >= var5) {
              break L1;
            } else {
              if (((nn) this).field_r.a(1 + param0, -16, param0, ((nn) this).field_i.field_O, ((nn) this).field_i, true) == -((nn) this).field_q[1 + param0] + ((nn) this).field_q[param0]) {
                var6 = 0;
                var5 = ((nn) this).field_q[1 + param0];
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (param3 <= 0) {
            break L2;
          } else {
            if (var5 > ((nn) this).field_q[param0 - ((nn) this).field_x]) {
              if (((nn) this).field_r.a(-((nn) this).field_x + param0, -16, param0, ((nn) this).field_i.field_O, ((nn) this).field_i, true) != -((nn) this).field_q[param0 + -((nn) this).field_x] + ((nn) this).field_q[param0]) {
                break L2;
              } else {
                var6 = 1;
                var5 = ((nn) this).field_q[param0 - ((nn) this).field_x];
                break L2;
              }
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (((nn) this).field_x - 1 <= param3) {
            break L3;
          } else {
            if (var5 <= ((nn) this).field_q[param0 - -((nn) this).field_x]) {
              break L3;
            } else {
              if (((nn) this).field_r.a(param0 + ((nn) this).field_x, -16, param0, ((nn) this).field_i.field_O, ((nn) this).field_i, true) != -((nn) this).field_q[param0 - -((nn) this).field_x] + ((nn) this).field_q[param0]) {
                break L3;
              } else {
                var6 = 2;
                var5 = ((nn) this).field_q[((nn) this).field_x + param0];
                break L3;
              }
            }
          }
        }
        return var6;
    }

    final int c(int param0) {
        if (param0 != 27732) {
            int discarded$0 = this.a(-31, (byte) 81, -84, 42);
        }
        int var2 = 3 * bw.field_m[((nn) this).field_d][3];
        if (((nn) this).field_p > -1) {
            if (!(18 != uc.field_d[((nn) this).field_p][5])) {
                var2 = var2 << 1;
            }
        }
        if (((nn) this).field_i != null) {
            if (7 == ((nn) this).field_i.field_P) {
                var2 = var2 >> 1;
            } else {
                if (!(((nn) this).field_i.field_P != 8)) {
                    var2 = 0;
                }
            }
            if ((4 & ((nn) this).field_r.b(31, ((nn) this).field_i.field_w, ((nn) this).field_i.field_J, ((nn) this).field_i.field_O)) != 0) {
                var2 = 0;
            }
        }
        return var2;
    }

    public static void b(int param0) {
        if (param0 >= -30) {
            nn.b(51);
        }
        field_s = null;
        field_c = null;
        field_z = null;
        field_v = null;
    }

    final void a(boolean param0, int param1, int param2, jd param3, int param4, int param5) {
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_35_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int[] stackOut_31_0 = null;
        int[] stackOut_30_0 = null;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var24 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              ((nn) this).field_o = param2;
              ((nn) this).field_p = param5;
              ((nn) this).field_f = false;
              ((nn) this).field_y = param4;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((nn) this).field_o == param3.field_O) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              L3: {
                ((nn) this).field_a = stackIn_4_1 != 0;
                ((nn) this).field_i = param3;
                stackOut_4_0 = this;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!param0) {
                  break L3;
                } else {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!((nn) this).field_a) {
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L2;
                  }
                }
              }
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L2;
            }
            L4: {
              ((nn) this).field_w = stackIn_8_1 != 0;
              if (param1 > 10) {
                break L4;
              } else {
                var25 = null;
                int discarded$1 = ((nn) this).a(true, (bv) null);
                break L4;
              }
            }
            L5: {
              ((nn) this).field_d = ((nn) this).field_i.field_N;
              var7_int = ((nn) this).field_i.B(3257);
              var8 = ((nn) this).field_i.l((byte) -79);
              this.a(0);
              if (((nn) this).field_p <= -1) {
                break L5;
              } else {
                if (24 == uc.field_d[((nn) this).field_p][5]) {
                  this.a(false, uc.field_d[((nn) this).field_p][6], 93);
                  return;
                } else {
                  break L5;
                }
              }
            }
            if (((nn) this).field_d != 51) {
              L6: {
                L7: {
                  var9 = ((nn) this).c(27732);
                  var10 = ((nn) this).field_i.field_J;
                  var11 = ((nn) this).field_i.field_J;
                  var12 = ((nn) this).field_i.field_w;
                  var13 = ((nn) this).field_i.field_w;
                  ((nn) this).field_q[((nn) this).field_i.field_J - -(((nn) this).field_x * ((nn) this).field_i.field_w)] = 0;
                  ((nn) this).field_k[((nn) this).field_i.field_J - -(((nn) this).field_x * ((nn) this).field_i.field_w)] = 0;
                  if (!((nn) this).field_i.field_W) {
                    break L7;
                  } else {
                    if (((nn) this).field_i.field_N == 0) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
                var14 = 0;
                L8: while (true) {
                  if (var14 >= 500) {
                    break L6;
                  } else {
                    var15 = 0;
                    var16 = 0;
                    var17 = 0;
                    L9: while (true) {
                      if (var17 >= ((nn) this).field_x) {
                        if (0 != var15) {
                          var14++;
                          continue L8;
                        } else {
                          break L6;
                        }
                      } else {
                        var18 = 0;
                        L10: while (true) {
                          if (var18 >= ((nn) this).field_A) {
                            var17++;
                            continue L9;
                          } else {
                            var19 = 0;
                            L11: while (true) {
                              if (var19 >= 2) {
                                var16++;
                                var18++;
                                continue L10;
                              } else {
                                L12: {
                                  if (var19 == 0) {
                                    stackOut_31_0 = ((nn) this).field_q;
                                    stackIn_32_0 = stackOut_31_0;
                                    break L12;
                                  } else {
                                    stackOut_30_0 = ((nn) this).field_k;
                                    stackIn_32_0 = stackOut_30_0;
                                    break L12;
                                  }
                                }
                                L13: {
                                  var29 = stackIn_32_0;
                                  var28 = var29;
                                  var27 = var28;
                                  var26 = var27;
                                  var20 = var26;
                                  if (var19 != 1) {
                                    stackOut_34_0 = 0;
                                    stackIn_35_0 = stackOut_34_0;
                                    break L13;
                                  } else {
                                    stackOut_33_0 = 1;
                                    stackIn_35_0 = stackOut_33_0;
                                    break L13;
                                  }
                                }
                                L14: {
                                  var21 = stackIn_35_0;
                                  var22 = 1000000;
                                  if (var18 > 0) {
                                    var23 = ((nn) this).field_r.a(((nn) this).field_i, var21 != 0, 14336, true, var16, -1 + var16, ((nn) this).field_i.field_O);
                                    if (var22 <= var23 + var20[-1 + var16]) {
                                      break L14;
                                    } else {
                                      var22 = var23 + var20[-1 + var16];
                                      if (var11 >= var18) {
                                        break L14;
                                      } else {
                                        if (var9 >= var22) {
                                          var11 = var18;
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  } else {
                                    break L14;
                                  }
                                }
                                L15: {
                                  if (var17 <= 0) {
                                    break L15;
                                  } else {
                                    var23 = ((nn) this).field_r.a(((nn) this).field_i, var21 != 0, 14336, true, var16, -((nn) this).field_x + var16, ((nn) this).field_i.field_O);
                                    if (var17 <= 0) {
                                      break L15;
                                    } else {
                                      if (var20[var16 - ((nn) this).field_x] - -var23 >= var22) {
                                        break L15;
                                      } else {
                                        var22 = var20[var16 - ((nn) this).field_x] + var23;
                                        break L15;
                                      }
                                    }
                                  }
                                }
                                L16: {
                                  if (var18 >= -1 + ((nn) this).field_x) {
                                    break L16;
                                  } else {
                                    var23 = ((nn) this).field_r.a(((nn) this).field_i, var21 != 0, 14336, true, var16, var16 - -1, ((nn) this).field_i.field_O);
                                    if (var22 <= var20[var16 - -1] - -var23) {
                                      break L16;
                                    } else {
                                      var22 = var20[var16 - -1] - -var23;
                                      break L16;
                                    }
                                  }
                                }
                                L17: {
                                  if (var17 >= ((nn) this).field_A - 1) {
                                    break L17;
                                  } else {
                                    var23 = ((nn) this).field_r.a(((nn) this).field_i, var21 != 0, 14336, true, var16, var16 - -((nn) this).field_x, ((nn) this).field_i.field_O);
                                    if (var20[((nn) this).field_x + var16] - -var23 >= var22) {
                                      break L17;
                                    } else {
                                      var22 = var20[var16 + ((nn) this).field_x] - -var23;
                                      break L17;
                                    }
                                  }
                                }
                                L18: {
                                  if (var22 < var29[var16]) {
                                    L19: {
                                      if (var10 <= var18) {
                                        break L19;
                                      } else {
                                        var10 = var18;
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (var18 > var11) {
                                        var11 = var18;
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (var15 >= var22) {
                                        break L21;
                                      } else {
                                        var15 = var22;
                                        break L21;
                                      }
                                    }
                                    L22: {
                                      if (var17 <= var13) {
                                        break L22;
                                      } else {
                                        var13 = var17;
                                        break L22;
                                      }
                                    }
                                    var29[var16] = var22;
                                    if (var12 > var17) {
                                      var12 = var17;
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  } else {
                                    break L18;
                                  }
                                }
                                var19++;
                                continue L11;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L23: {
                if (4 != bw.field_m[param3.field_N][0]) {
                  stackOut_74_0 = 0;
                  stackIn_75_0 = stackOut_74_0;
                  break L23;
                } else {
                  stackOut_73_0 = 1;
                  stackIn_75_0 = stackOut_73_0;
                  break L23;
                }
              }
              L24: {
                var14 = stackIn_75_0;
                if (!((nn) this).field_i.j((byte) 102)) {
                  stackOut_77_0 = 0;
                  stackIn_78_0 = stackOut_77_0;
                  break L24;
                } else {
                  stackOut_76_0 = 1;
                  stackIn_78_0 = stackOut_76_0;
                  break L24;
                }
              }
              L25: {
                var15 = stackIn_78_0;
                ((nn) this).field_r.field_j.a(var8, var15 != 0, -1, var10, var13, ((nn) this).field_i.field_O, ((nn) this).field_a, ((nn) this).field_q, var7_int, var11, var14 != 0, ((nn) this).field_e, var9, var12);
                if (!((nn) this).field_i.field_W) {
                  break L25;
                } else {
                  if (((nn) this).field_i.field_N == 0) {
                    break L25;
                  } else {
                    ((nn) this).field_q[((nn) this).field_i.field_J - -(((nn) this).field_i.field_w * ((nn) this).field_x)] = 1000000;
                    break L25;
                  }
                }
              }
              break L0;
            } else {
              this.a(true, bw.field_m[((nn) this).field_d][3], 112);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var7 = decompiledCaughtException;
            stackOut_82_0 = (RuntimeException) var7;
            stackOut_82_1 = new StringBuilder().append("nn.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param3 == null) {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L26;
            } else {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L26;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_85_0, stackIn_85_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final mn a(int param0, int param1) {
        int[] var3 = null;
        int var4_int = 0;
        am var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var7 = new int[((nn) this).field_m];
          var3 = var7;
          if (((nn) this).field_h == null) {
            var3 = new int[]{};
            break L0;
          } else {
            var4_int = 0;
            L1: while (true) {
              if (((nn) this).field_m <= var4_int) {
                break L0;
              } else {
                var7[var4_int] = ((nn) this).field_h[var4_int];
                var4_int++;
                continue L1;
              }
            }
          }
        }
        var5 = 51 / ((-19 - param1) / 39);
        var4 = new am(param0, ((nn) this).field_m, var3, ((nn) this).field_i.field_J, ((nn) this).field_i.field_w, ((nn) this).field_l, ((nn) this).field_j);
        if (((nn) this).field_p > -1) {
          ((nn) this).field_r.field_J = true;
          return (mn) (Object) new to((ik) (Object) new ra(((nn) this).field_p, (mn) (Object) var4), ((nn) this).field_y, param0);
        } else {
          return (mn) (Object) var4;
        }
    }

    final static void a(byte param0, ha param1) {
        ha var2 = null;
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
        Random var13 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1.field_cb == 4) {
          var2 = param1;
          param1.field_db = 10;
          param1.field_Eb = new ne[100];
          var2.field_v = 10;
          var3 = 0;
          L0: while (true) {
            if (var3 >= 100) {
              param1.field_t[0].a((byte) -119, (tc) (Object) new jd(3, 3, 0, 0, 10, 10, 9, 0, 0, param1, 0, 0, -1, false, 0));
              param1.field_t[1].a((byte) -119, (tc) (Object) new jd(6, 6, 0, 1, 10, 10, 9, 0, 0, param1, 0, 0, -1, false, 0));
              param1.a((byte) -110, param1.field_v, param1.field_db, param1.field_Eb);
              return;
            } else {
              L1: {
                L2: {
                  L3: {
                    var4 = var3 % 10;
                    var5 = var3 / 10;
                    if (var4 == 1) {
                      break L3;
                    } else {
                      if (var4 != 8) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (1 == var5) {
                      break L4;
                    } else {
                      if (var5 != 8) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  param1.field_Eb[var3] = new ne(7, param1);
                  break L1;
                }
                L5: {
                  L6: {
                    L7: {
                      if (var4 == 1) {
                        break L7;
                      } else {
                        if (var4 != 8) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (var5 >= 9) {
                      break L6;
                    } else {
                      if (var5 > 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L8: {
                    L9: {
                      if (var5 == 1) {
                        break L9;
                      } else {
                        if (var5 != 8) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (var4 >= 9) {
                      break L8;
                    } else {
                      if (var4 > 0) {
                        break L5;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if (2 == var4) {
                        break L11;
                      } else {
                        if (var4 != 7) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var5 == 2) {
                        break L12;
                      } else {
                        if (7 != var5) {
                          break L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                    param1.field_Eb[var3] = new ne(9, param1);
                    break L1;
                  }
                  L13: {
                    L14: {
                      if (var4 == 3) {
                        break L14;
                      } else {
                        if (var4 != 6) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (var5 == 2) {
                        break L15;
                      } else {
                        if (var5 != 7) {
                          break L13;
                        } else {
                          break L15;
                        }
                      }
                    }
                    param1.field_Eb[var3] = new ne(8, param1);
                    break L1;
                  }
                  L16: {
                    L17: {
                      if (var4 == 2) {
                        break L17;
                      } else {
                        if (7 != var4) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    L18: {
                      if (var5 == 3) {
                        break L18;
                      } else {
                        if (6 != var5) {
                          break L16;
                        } else {
                          break L18;
                        }
                      }
                    }
                    param1.field_Eb[var3] = new ne(8, param1);
                    break L1;
                  }
                  L19: {
                    L20: {
                      if (4 != var4) {
                        break L20;
                      } else {
                        if (var5 < 4) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      if (var4 != 5) {
                        break L21;
                      } else {
                        if (var5 > 5) {
                          break L19;
                        } else {
                          break L21;
                        }
                      }
                    }
                    L22: {
                      L23: {
                        if (4 == var4) {
                          break L23;
                        } else {
                          if (5 != var4) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      L24: {
                        if (var5 == 4) {
                          break L24;
                        } else {
                          if (var5 == 5) {
                            break L24;
                          } else {
                            break L22;
                          }
                        }
                      }
                      param1.field_Eb[var3] = new ne(6, param1);
                      break L1;
                    }
                    param1.field_Eb[var3] = new ne(0, param1);
                    break L1;
                  }
                  param1.field_Eb[var3] = new ne(4, param1);
                  break L1;
                }
                L25: {
                  L26: {
                    if (var4 != 4) {
                      break L26;
                    } else {
                      if (var5 == 1) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (5 != var4) {
                      break L27;
                    } else {
                      if (var5 == 8) {
                        break L25;
                      } else {
                        break L27;
                      }
                    }
                  }
                  param1.field_Eb[var3] = new ne(1, param1);
                  break L1;
                }
                param1.field_Eb[var3] = new ne(10, param1);
                break L1;
              }
              var3++;
              continue L0;
            }
          }
        } else {
          param1.field_Eb = new ne[param1.field_v * param1.field_db];
          var2_int = 0;
          L28: while (true) {
            if (var2_int >= param1.field_db * param1.field_v) {
              L29: {
                var13 = new Random((long)param1.field_jb);
                var3 = 3;
                var4 = 4 - -ns.a(false, 4, var13);
                var5 = ns.a(false, 100, var13);
                if (param1.field_hb == 0) {
                  if (10 > var5) {
                    var3 = 5;
                    break L29;
                  } else {
                    if (30 <= var5) {
                      if (var5 < 60) {
                        var3 = 1;
                        break L29;
                      } else {
                        if (var5 >= 70) {
                          break L29;
                        } else {
                          var3 = 6;
                          break L29;
                        }
                      }
                    } else {
                      var3 = 4;
                      break L29;
                    }
                  }
                } else {
                  if (param1.field_hb != 2) {
                    if (var5 >= 30) {
                      if (var5 >= 60) {
                        if (var5 < 80) {
                          var3 = 6;
                          break L29;
                        } else {
                          break L29;
                        }
                      } else {
                        var3 = 4;
                        break L29;
                      }
                    } else {
                      var3 = 0;
                      break L29;
                    }
                  } else {
                    if (var5 >= 30) {
                      if (60 > var5) {
                        var3 = 4;
                        break L29;
                      } else {
                        if (var5 < 80) {
                          var3 = 2;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                    } else {
                      var3 = 5;
                      break L29;
                    }
                  }
                }
              }
              var6 = -1;
              L30: while (true) {
                if (var6 >= 2) {
                  var6 = 0;
                  L31: while (true) {
                    if (var6 >= param1.field_db * param1.field_v) {
                      L32: {
                        var6 = -1;
                        if (var3 != 5) {
                          break L32;
                        } else {
                          var6 = 3;
                          break L32;
                        }
                      }
                      var7 = -1;
                      L33: while (true) {
                        if (var7 >= 2) {
                          L34: {
                            if (var3 == 2) {
                              var6 = 5;
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          on.a(param1, var6, false, var13);
                          param1.a((byte) -119, param1.field_v, param1.field_db, param1.field_Eb);
                          return;
                        } else {
                          var8 = -1;
                          L35: while (true) {
                            if (2 <= var8) {
                              var7++;
                              continue L33;
                            } else {
                              L36: {
                                L37: {
                                  var9 = 0;
                                  if (0 == var7) {
                                    break L37;
                                  } else {
                                    if (var8 != 0) {
                                      L38: {
                                        if (var7 == var8) {
                                          break L38;
                                        } else {
                                          var9 += 2;
                                          break L38;
                                        }
                                      }
                                      if (var8 != 1) {
                                        break L36;
                                      } else {
                                        var9++;
                                        break L36;
                                      }
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                                L39: {
                                  L40: {
                                    var9 += 4;
                                    if (1 == var8) {
                                      break L40;
                                    } else {
                                      if (var7 == 1) {
                                        break L40;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                  var9++;
                                  break L39;
                                }
                                if (var8 == 0) {
                                  var9 += 2;
                                  break L36;
                                } else {
                                  break L36;
                                }
                              }
                              L41: {
                                L42: {
                                  if (var7 != 0) {
                                    break L42;
                                  } else {
                                    if (var8 != 0) {
                                      break L42;
                                    } else {
                                      break L41;
                                    }
                                  }
                                }
                                if (var9 >= param1.field_W) {
                                  break L41;
                                } else {
                                  L43: {
                                    L44: {
                                      var10 = 20 * (1 + var7) - -10;
                                      var11 = 10 + 20 * (1 + var8);
                                      if (var7 == 0) {
                                        break L44;
                                      } else {
                                        if (var8 != 0) {
                                          var10 = var10 + (-1 + ns.a(false, 2, var13));
                                          var11 = var11 + (-1 + ns.a(false, 2, var13));
                                          break L43;
                                        } else {
                                          break L44;
                                        }
                                      }
                                    }
                                    var10 = 10 + (ns.a(false, 4, var13) + 5) * var7 + (20 + 20 * var7);
                                    var11 = 10 + var8 * (ns.a(false, 4, var13) + 5) + (20 + 20 * var8);
                                    break L43;
                                  }
                                  L45: while (true) {
                                    L46: {
                                      if (param1.field_Eb[param1.field_v * var11 + var10].field_h == 0) {
                                        break L46;
                                      } else {
                                        if (1 == param1.field_Eb[var10 + param1.field_v * var11].field_h) {
                                          break L46;
                                        } else {
                                          L47: {
                                            var11 = 20 + (var8 * 20 - -10);
                                            var10 = (1 + var7) * 20 + 10;
                                            if (var7 == 0) {
                                              break L47;
                                            } else {
                                              if (0 != var8) {
                                                var10 = var10 + (ns.a(false, 4, var13) + -2);
                                                var11 = var11 + (ns.a(false, 4, var13) - 2);
                                                continue L45;
                                              } else {
                                                break L47;
                                              }
                                            }
                                          }
                                          var10 = var7 * (ns.a(false, 4, var13) + 5) - -10 - (-20 + -(var7 * 20));
                                          var11 = (ns.a(false, 4, var13) + 5) * var8 - -10 - (-20 + -(20 * var8));
                                          continue L45;
                                        }
                                      }
                                    }
                                    param1.field_t[var9].a((byte) -119, (tc) (Object) new jd(var10, var11, 0, var9, 10, 10, 9, 0, 0, param1, 0, 0, -1, false, 0));
                                    break L41;
                                  }
                                }
                              }
                              var8++;
                              continue L35;
                            }
                          }
                        }
                      }
                    } else {
                      L48: {
                        if (param1.field_Eb[var6] == null) {
                          param1.field_Eb[var6] = new ne(0, param1);
                          break L48;
                        } else {
                          break L48;
                        }
                      }
                      var6++;
                      continue L31;
                    }
                  }
                } else {
                  var7 = -1;
                  L49: while (true) {
                    if (var7 >= 2) {
                      var6++;
                      continue L30;
                    } else {
                      L50: {
                        L51: {
                          if (var6 != 0) {
                            break L51;
                          } else {
                            if (var7 != 0) {
                              break L51;
                            } else {
                              ul.a(var13, param1, (byte) 85, var3);
                              break L50;
                            }
                          }
                        }
                        L52: {
                          L53: {
                            var8 = var6 * 20 + 30;
                            var9 = 20 * (var7 + 1) + 10;
                            param1.field_Eb[param1.field_v * var9 + var8] = new ne(1, param1);
                            if (var6 == 0) {
                              break L53;
                            } else {
                              if (var7 == 0) {
                                break L53;
                              } else {
                                var8 = var8 + (-1 + ns.a(false, 2, var13));
                                var9 = var9 + (-1 + ns.a(false, 2, var13));
                                break L52;
                              }
                            }
                          }
                          var8 = var6 * (ns.a(false, 4, var13) + 5) - (-10 - (1 + var6) * 20);
                          var9 = (5 + ns.a(false, 4, var13)) * var7 + 10 + 20 * (var7 - -1);
                          break L52;
                        }
                        L54: {
                          param1.field_Eb[param1.field_v * var9 + var8] = new ne(7, param1);
                          if (0 != var3) {
                            fi.a(var8, (byte) 101, 1, var9, 20 * (var6 + 1) + 10, false, (var7 + 1) * 20 + 10, param1, var13);
                            break L54;
                          } else {
                            break L54;
                          }
                        }
                        var10 = 0;
                        L55: while (true) {
                          if (~var10 <= ~var4) {
                            break L50;
                          } else {
                            L56: while (true) {
                              L57: {
                                if (null == param1.field_Eb[var9 * param1.field_v + var8]) {
                                  break L57;
                                } else {
                                  if (param1.field_Eb[var8 - -(param1.field_v * var9)].field_h == 0) {
                                    break L57;
                                  } else {
                                    if (param1.field_Eb[var9 * param1.field_v + var8].field_h == 1) {
                                      break L57;
                                    } else {
                                      var8 = ns.a(false, 7, var13) * 2 + (20 * (var6 + 1) + 3);
                                      var9 = (1 + var7) * 20 - (-(2 * ns.a(false, 7, var13)) - 3);
                                      continue L56;
                                    }
                                  }
                                }
                              }
                              L58: {
                                param1.field_Eb[var8 + var9 * param1.field_v] = new ne(8, param1);
                                if (var3 == 0) {
                                  break L58;
                                } else {
                                  qp.a(var9, 20 * (1 + var6) + 10, -1, var7 * 20 - -30, var8, 0, param1, 1, var13);
                                  break L58;
                                }
                              }
                              var10++;
                              continue L55;
                            }
                          }
                        }
                      }
                      var7++;
                      continue L49;
                    }
                  }
                }
              }
            } else {
              param1.field_Eb[var2_int] = null;
              var2_int++;
              continue L28;
            }
          }
        }
    }

    final int a(boolean param0, bv param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((nn) this).field_t) {
                break L1;
              } else {
                if (!((nn) this).field_u) {
                  break L1;
                } else {
                  L2: {
                    var3_int = 6;
                    if (((nn) this).field_p <= -1) {
                      param1.h(32161, 65);
                      param1.b(1, var3_int);
                      break L2;
                    } else {
                      param1.h(32161, 65);
                      param1.b(1, var3_int + 4);
                      param1.b(1, 160);
                      param1.b(1, ((nn) this).field_y);
                      param1.b(true, ((nn) this).field_p);
                      break L2;
                    }
                  }
                  param1.b(1, 0);
                  param1.b(1, 0);
                  param1.b(1, ((nn) this).field_i.field_J);
                  param1.b(1, ((nn) this).field_i.field_w);
                  pd.a(((nn) this).field_l, ((nn) this).field_j, (vh) (Object) param1, 127);
                  stackOut_6_0 = var3_int;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
            L3: {
              if (null == ((nn) this).field_h) {
                ((nn) this).field_m = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (0 < ((nn) this).field_m % 4) {
                stackOut_13_0 = 1;
                stackIn_14_0 = stackOut_13_0;
                break L4;
              } else {
                stackOut_12_0 = 0;
                stackIn_14_0 = stackOut_12_0;
                break L4;
              }
            }
            L5: {
              var3_int = stackIn_14_0 + (6 + ((nn) this).field_m / 4);
              if (((nn) this).field_p <= -1) {
                param1.h(32161, 65);
                param1.b(1, var3_int);
                break L5;
              } else {
                param1.h(32161, 65);
                param1.b(1, 4 + var3_int);
                param1.b(1, 160);
                param1.b(1, ((nn) this).field_y);
                param1.b(true, ((nn) this).field_p);
                ((nn) this).field_r.field_J = true;
                break L5;
              }
            }
            L6: {
              param1.b(1, ((nn) this).field_m >> 8);
              param1.b(1, ((nn) this).field_m & 255);
              param1.b(1, ((nn) this).field_i.field_J);
              param1.b(1, ((nn) this).field_i.field_w);
              jj.a((byte) -27, ((nn) this).field_m, (vh) (Object) param1, ((nn) this).field_h);
              if (param0) {
                break L6;
              } else {
                this.a(-21);
                break L6;
              }
            }
            pd.a(((nn) this).field_l, ((nn) this).field_j, (vh) (Object) param1, -78);
            stackOut_19_0 = var3_int;
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("nn.C(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_20_0;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var2 = param0; ((nn) this).field_q.length > var2; var2++) {
            ((nn) this).field_q[var2] = 1000000;
            ((nn) this).field_k[var2] = 1000000;
            ((nn) this).field_e[var2] = 0;
        }
    }

    nn(ha param0) {
        ((nn) this).field_y = -1;
        ((nn) this).field_p = -1;
        try {
            ((nn) this).field_r = param0;
            ((nn) this).field_A = ((nn) this).field_r.field_db;
            ((nn) this).field_x = ((nn) this).field_r.field_v;
            ((nn) this).field_q = new int[((nn) this).field_A * ((nn) this).field_x];
            ((nn) this).field_k = new int[((nn) this).field_x * ((nn) this).field_A];
            ((nn) this).field_e = new int[((nn) this).field_x * ((nn) this).field_A];
            this.a(0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "nn.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Show chat (<%0> unread messages)";
        field_c = new me(7, 0, 1, 1);
        field_v = "You can only use a further <%0> runes of trinkets in this game. This trinket is worth <%1>.";
        field_z = new dl(1);
    }
}
