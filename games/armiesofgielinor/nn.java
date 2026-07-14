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
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        L0: {
          if (!((nn) this).field_t) {
            break L0;
          } else {
            if (!((nn) this).field_u) {
              break L0;
            } else {
              param0.h(32161, 65);
              var4 = 9;
              param0.b(1, var4);
              param0.b(1, 96);
              param0.b(1, param2.field_J);
              param0.b(1, param2.field_w);
              param0.b(1, 0);
              param0.b(1, 0);
              param0.b(1, ((nn) this).field_i.field_J);
              param0.b(1, ((nn) this).field_i.field_w);
              pd.a(((nn) this).field_l, ((nn) this).field_j, (vh) (Object) param0, -100);
              return var4;
            }
          }
        }
        L1: {
          if (((nn) this).field_h == null) {
            ((nn) this).field_m = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-1 != (((nn) this).field_m ^ -1)) {
            break L2;
          } else {
            if (0 != ((nn) this).field_l) {
              break L2;
            } else {
              if (((nn) this).field_j == -1) {
                return -1;
              } else {
                break L2;
              }
            }
          }
        }
        L3: {
          stackOut_11_0 = 4;
          stackOut_11_1 = -(((nn) this).field_m / 4);
          stackIn_13_0 = stackOut_11_0;
          stackIn_13_1 = stackOut_11_1;
          stackIn_12_0 = stackOut_11_0;
          stackIn_12_1 = stackOut_11_1;
          if (-1 < ((nn) this).field_m % 4) {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = stackIn_13_1;
            stackOut_13_2 = 1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            stackIn_14_2 = stackOut_13_2;
            break L3;
          } else {
            stackOut_12_0 = stackIn_12_0;
            stackOut_12_1 = stackIn_12_1;
            stackOut_12_2 = 0;
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_14_2 = stackOut_12_2;
            break L3;
          }
        }
        L4: {
          var4 = stackIn_14_0 - (stackIn_14_1 - (stackIn_14_2 - -5));
          if (param1 <= -24) {
            break L4;
          } else {
            this.a(-36, 76, -91);
            break L4;
          }
        }
        param0.h(32161, 65);
        param0.b(1, var4);
        param0.b(1, 96);
        param0.b(1, param2.field_J);
        param0.b(1, param2.field_w);
        param0.b(1, (135 | ((nn) this).field_m) >> 949768328);
        param0.b(1, 255 & ((nn) this).field_m);
        param0.b(1, ((nn) this).field_i.field_J);
        param0.b(1, ((nn) this).field_i.field_w);
        jj.a((byte) -112, ((nn) this).field_m, (vh) (Object) param0, ((nn) this).field_h);
        pd.a(((nn) this).field_l, ((nn) this).field_j, (vh) (Object) param0, -73);
        return var4;
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
          if (-1 < param1) {
            var4 = 0;
            L2: while (true) {
              if (var4 >= ((nn) this).field_x) {
                break L1;
              } else {
                var10 = 0;
                var5 = var10;
                L3: while (true) {
                  if (((nn) this).field_A <= var10) {
                    var4++;
                    continue L2;
                  } else {
                    var6 = ((nn) this).field_r.field_Eb[var4 - -(var10 * ((nn) this).field_x)];
                    if (var6.field_h != 2) {
                      if (7 != var6.field_h) {
                        if (var6.field_h != 11) {
                          if (-5 != (var6.field_h ^ -1)) {
                            if (6 != var6.field_h) {
                              L4: {
                                if (var6.field_c == null) {
                                  break L4;
                                } else {
                                  if (param0) {
                                    break L4;
                                  } else {
                                    var10++;
                                    continue L3;
                                  }
                                }
                              }
                              ((nn) this).field_q[var4 + ((nn) this).field_x * var10] = 0;
                              var10++;
                              continue L3;
                            } else {
                              var10++;
                              continue L3;
                            }
                          } else {
                            var10++;
                            continue L3;
                          }
                        } else {
                          var10++;
                          continue L3;
                        }
                      } else {
                        var10++;
                        continue L3;
                      }
                    } else {
                      var10++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            L5: {
              if (param0) {
                if (-8 == ((nn) this).field_i.field_P) {
                  param1 = param1 >> 1;
                  break L5;
                } else {
                  if (((nn) this).field_i.field_P != 8) {
                    break L5;
                  } else {
                    param1 = 0;
                    break L5;
                  }
                }
              } else {
                break L5;
              }
            }
            var4 = -param1;
            L6: while (true) {
              if (var4 > param1) {
                break L1;
              } else {
                var5 = -param1;
                L7: while (true) {
                  if (var5 > param1) {
                    var4++;
                    continue L6;
                  } else {
                    var6_int = Math.abs(var4) + Math.abs(var5);
                    if ((var4 + ((nn) this).field_i.field_J ^ -1) < 0) {
                      if (var4 + ((nn) this).field_i.field_J < ((nn) this).field_x) {
                        if ((((nn) this).field_i.field_w + var5 ^ -1) < 0) {
                          if (var5 - -((nn) this).field_i.field_w < ((nn) this).field_A) {
                            var7 = ((nn) this).field_r.field_Eb[((nn) this).field_x * (((nn) this).field_i.field_w + var5) + (((nn) this).field_i.field_J + var4)];
                            if (2 != var7.field_h) {
                              L8: {
                                L9: {
                                  if (var7.field_h == 7) {
                                    break L9;
                                  } else {
                                    if (-12 != (var7.field_h ^ -1)) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                if (param0) {
                                  break L8;
                                } else {
                                  var5++;
                                  continue L7;
                                }
                              }
                              if (4 != var7.field_h) {
                                if (6 != var7.field_h) {
                                  if (var6_int <= param1) {
                                    L10: {
                                      if (null == var7.field_c) {
                                        break L10;
                                      } else {
                                        if (param0) {
                                          break L10;
                                        } else {
                                          var5++;
                                          continue L7;
                                        }
                                      }
                                    }
                                    ((nn) this).field_q[((nn) this).field_x * (var5 - -((nn) this).field_i.field_w) + (var4 - -((nn) this).field_i.field_J)] = 0;
                                    var5++;
                                    continue L7;
                                  } else {
                                    var5++;
                                    continue L7;
                                  }
                                } else {
                                  var5++;
                                  continue L7;
                                }
                              } else {
                                var5++;
                                continue L7;
                              }
                            } else {
                              var5++;
                              continue L7;
                            }
                          } else {
                            var5++;
                            continue L7;
                          }
                        } else {
                          var5++;
                          continue L7;
                        }
                      } else {
                        var5++;
                        continue L7;
                      }
                    } else {
                      var5++;
                      continue L7;
                    }
                  }
                }
              }
            }
          }
        }
        L11: {
          if (param2 > 65) {
            break L11;
          } else {
            var9 = null;
            ((nn) this).a(true, 39, -101, (jd) null, -116, -60);
            break L11;
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
                if (-37 != (((nn) this).field_p ^ -1)) {
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
          var8 = 0;
          ((nn) this).field_g = true;
          if (-1 >= ((nn) this).field_p) {
            break L1;
          } else {
            if (uc.field_d[((nn) this).field_p][5] == 18) {
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: while (true) {
          L3: {
            if (-1 <= ((nn) this).field_q[var5]) {
              var7 = param0;
              var6 = param2;
              var5 = var4;
              ((nn) this).field_h = new int[var8];
              var8--;
              L4: while (true) {
                if (0 >= ((nn) this).field_q[var5]) {
                  L5: {
                    ((nn) this).field_m = ((nn) this).field_h.length;
                    stackOut_35_0 = this;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_36_0 = stackOut_35_0;
                    if (((nn) this).field_i.field_s) {
                      stackOut_37_0 = this;
                      stackOut_37_1 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      break L5;
                    } else {
                      stackOut_36_0 = this;
                      stackOut_36_1 = 1;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      break L5;
                    }
                  }
                  ((nn) this).field_u = stackIn_38_1 != 0;
                  break L3;
                } else {
                  var9 = this.a(var5, (byte) 39, var6, var7);
                  ((nn) this).field_h[var8] = kf.b(3, var9);
                  var10 = var9;
                  if (1 == var10) {
                    var5 = var5 - ((nn) this).field_x;
                    var7--;
                    var8--;
                    continue L4;
                  } else {
                    if (-1 != var10) {
                      if (-3 != var10) {
                        if (-4 == (var10 ^ -1)) {
                          var6--;
                          var5--;
                          var8--;
                          continue L4;
                        } else {
                          var8--;
                          continue L4;
                        }
                      } else {
                        var5 = var5 + ((nn) this).field_x;
                        var7++;
                        var8--;
                        continue L4;
                      }
                    } else {
                      var5++;
                      var6++;
                      var8--;
                      continue L4;
                    }
                  }
                }
              }
            } else {
              L6: {
                var9 = this.a(var5, (byte) 84, var6, var7);
                var10 = var9;
                if (-2 == var10) {
                  var7--;
                  var5 = var5 - ((nn) this).field_x;
                  break L6;
                } else {
                  if (-1 != (var10 ^ -1)) {
                    if (2 != var10) {
                      if (3 != var10) {
                        break L6;
                      } else {
                        var6--;
                        var5--;
                        break L6;
                      }
                    } else {
                      var7++;
                      var5 = var5 + ((nn) this).field_x;
                      break L6;
                    }
                  } else {
                    var6++;
                    var5++;
                    break L6;
                  }
                }
              }
              var8++;
              if (99 >= var8) {
                continue L2;
              } else {
                ((nn) this).field_h = null;
                break L3;
              }
            }
          }
          L7: {
            ((nn) this).field_f = true;
            if (param1 == -116) {
              break L7;
            } else {
              ((nn) this).field_w = false;
              break L7;
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
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        ul stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        ul stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        ul stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        int stackIn_67_4 = 0;
        ul stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        ul stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        int stackOut_66_4 = 0;
        ul stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        Object stackOut_29_0 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
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
        if (-1 != (4 & ((nn) this).field_e[param1 + param0 * ((nn) this).field_x] ^ -1)) {
          L1: {
            var4 = bw.field_m[((nn) this).field_i.field_N][7];
            var5 = bw.field_m[((nn) this).field_i.field_N][6];
            if (param2 == -120) {
              break L1;
            } else {
              ((nn) this).field_A = 82;
              break L1;
            }
          }
          L2: {
            if (!((nn) this).field_i.field_W) {
              break L2;
            } else {
              if ((((nn) this).field_i.field_N ^ -1) == -35) {
                var4 = 7;
                var5 = 2;
                if (3 == ((nn) this).field_i.j(20640)) {
                  var4 = var4 + ((nn) this).field_i.d(1, 115);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
          L3: {
            L4: {
              L5: {
                if ((((nn) this).field_i.field_N ^ -1) == -82) {
                  break L5;
                } else {
                  if (4 == ((nn) this).field_i.field_N) {
                    break L5;
                  } else {
                    if (74 != ((nn) this).field_i.field_N) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              if (((nn) this).field_i.j(20640) == 3) {
                var4 = var4 + ((nn) this).field_i.d(1, param2 ^ 21);
                break L3;
              } else {
                break L4;
              }
            }
            L6: {
              if (3 != ((nn) this).field_i.g(0)) {
                break L6;
              } else {
                if (((nn) this).field_i.j(param2 ^ -20696) != -3) {
                  break L6;
                } else {
                  var4 = var4 + ((nn) this).field_i.d(1, -87);
                  break L3;
                }
              }
            }
            if (-3 != ((nn) this).field_i.g(0)) {
              break L3;
            } else {
              if (-2 == (((nn) this).field_i.j(20640) ^ -1)) {
                var4 = var4 + ((nn) this).field_i.d(1, param2 ^ 41);
                break L3;
              } else {
                break L3;
              }
            }
          }
          L7: {
            if (-2 != (1 & ((nn) this).field_e[param0 * ((nn) this).field_x + param1])) {
              L8: {
                var6 = 3 * bw.field_m[((nn) this).field_i.field_N][3];
                if (!((nn) this).field_i.field_W) {
                  break L8;
                } else {
                  if (-1 == (((nn) this).field_i.field_N ^ -1)) {
                    break L8;
                  } else {
                    var6 = 0;
                    break L8;
                  }
                }
              }
              L9: {
                if (((nn) this).field_p <= -1) {
                  break L9;
                } else {
                  if ((uc.field_d[((nn) this).field_p][5] ^ -1) != -19) {
                    break L9;
                  } else {
                    var6 = var6 << 1;
                    break L9;
                  }
                }
              }
              var7 = ((nn) this).field_i.field_J;
              ((nn) this).field_g = true;
              var8 = ((nn) this).field_i.field_w;
              var9 = -var4;
              L10: while (true) {
                if (var4 < var9) {
                  if (!((nn) this).field_u) {
                    break L7;
                  } else {
                    ((nn) this).a(var8, (byte) -116, var7);
                    ((nn) this).field_l = -var7 + param1;
                    ((nn) this).field_j = param0 + -var8;
                    break L7;
                  }
                } else {
                  var10 = -var4;
                  L11: while (true) {
                    if (var4 < var10) {
                      var9++;
                      continue L10;
                    } else {
                      var11 = Math.abs(var9) + Math.abs(var10);
                      if (-1 < var9 + param1) {
                        if (((nn) this).field_x > var9 - -param1) {
                          if ((param0 + var10 ^ -1) < 0) {
                            if (((nn) this).field_A > param0 + var10) {
                              if (var11 <= var4) {
                                if (var5 <= var11) {
                                  L12: {
                                    if (1 != var11) {
                                      if (-1 == (2 & ((nn) this).field_r.b(31, var10 - -param0, param1 + var9, ((nn) this).field_i.field_O) ^ -1)) {
                                        if (0 == (((nn) this).field_r.b(31, param0, param1, ((nn) this).field_i.field_O) & 2)) {
                                          break L12;
                                        } else {
                                          var10++;
                                          continue L11;
                                        }
                                      } else {
                                        var10++;
                                        continue L11;
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (((nn) this).field_q[param1 + (var9 + ((nn) this).field_x * (param0 + var10))] <= var6) {
                                    L13: {
                                      stackOut_64_0 = ((nn) this).field_r.field_j;
                                      stackOut_64_1 = var10 - -param0;
                                      stackOut_64_2 = param1;
                                      stackOut_64_3 = param1 + var9;
                                      stackIn_66_0 = stackOut_64_0;
                                      stackIn_66_1 = stackOut_64_1;
                                      stackIn_66_2 = stackOut_64_2;
                                      stackIn_66_3 = stackOut_64_3;
                                      stackIn_65_0 = stackOut_64_0;
                                      stackIn_65_1 = stackOut_64_1;
                                      stackIn_65_2 = stackOut_64_2;
                                      stackIn_65_3 = stackOut_64_3;
                                      if (-5 != (((nn) this).field_i.g(0) ^ -1)) {
                                        stackOut_66_0 = (ul) (Object) stackIn_66_0;
                                        stackOut_66_1 = stackIn_66_1;
                                        stackOut_66_2 = stackIn_66_2;
                                        stackOut_66_3 = stackIn_66_3;
                                        stackOut_66_4 = 0;
                                        stackIn_67_0 = stackOut_66_0;
                                        stackIn_67_1 = stackOut_66_1;
                                        stackIn_67_2 = stackOut_66_2;
                                        stackIn_67_3 = stackOut_66_3;
                                        stackIn_67_4 = stackOut_66_4;
                                        break L13;
                                      } else {
                                        stackOut_65_0 = (ul) (Object) stackIn_65_0;
                                        stackOut_65_1 = stackIn_65_1;
                                        stackOut_65_2 = stackIn_65_2;
                                        stackOut_65_3 = stackIn_65_3;
                                        stackOut_65_4 = 1;
                                        stackIn_67_0 = stackOut_65_0;
                                        stackIn_67_1 = stackOut_65_1;
                                        stackIn_67_2 = stackOut_65_2;
                                        stackIn_67_3 = stackOut_65_3;
                                        stackIn_67_4 = stackOut_65_4;
                                        break L13;
                                      }
                                    }
                                    if (((ul) (Object) stackIn_67_0).a(stackIn_67_1, stackIn_67_2, stackIn_67_3, stackIn_67_4 != 0, var4, param0, (byte) 86)) {
                                      var6 = ((nn) this).field_q[param1 + var9 - -(((nn) this).field_x * (param0 + var10))];
                                      var8 = var10 + param0;
                                      var7 = var9 - -param1;
                                      ((nn) this).field_u = true;
                                      var10++;
                                      continue L11;
                                    } else {
                                      var10++;
                                      continue L11;
                                    }
                                  } else {
                                    var10++;
                                    continue L11;
                                  }
                                } else {
                                  var10++;
                                  continue L11;
                                }
                              } else {
                                var10++;
                                continue L11;
                              }
                            } else {
                              var10++;
                              continue L11;
                            }
                          } else {
                            var10++;
                            continue L11;
                          }
                        } else {
                          var10++;
                          continue L11;
                        }
                      } else {
                        var10++;
                        continue L11;
                      }
                    }
                  }
                }
              }
            } else {
              L14: {
                stackOut_29_0 = this;
                stackIn_31_0 = stackOut_29_0;
                stackIn_30_0 = stackOut_29_0;
                if (-1 >= ((nn) this).field_i.field_B) {
                  stackOut_31_0 = this;
                  stackOut_31_1 = 0;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  break L14;
                } else {
                  stackOut_30_0 = this;
                  stackOut_30_1 = 1;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_32_1 = stackOut_30_1;
                  break L14;
                }
              }
              ((nn) this).field_u = stackIn_32_1 != 0;
              ((nn) this).field_j = param0 - ((nn) this).field_i.field_w;
              ((nn) this).field_l = param1 - ((nn) this).field_i.field_J;
              break L7;
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
        wk[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        wk[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        wk[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        wk[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        wk[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        wk[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          param0.field_c[0] = ((nn) this).field_i.field_J;
          param0.field_c[1] = ((nn) this).field_i.field_w;
          param0.c(9470337);
          if (param1 == -4) {
            break L0;
          } else {
            field_v = null;
            break L0;
          }
        }
        L1: {
          var3 = param0.field_e[0];
          var4 = param0.field_e[1];
          sc.field_f[10].g(var3, var4);
          param0.field_c[1] = ((nn) this).field_b;
          param0.field_c[0] = ((nn) this).field_n;
          param0.c(param1 + 9470341);
          var5 = param0.field_e[0];
          var6 = param0.field_e[1];
          var7 = ((nn) this).c(27732);
          var8 = 0;
          if (!((nn) this).field_t) {
            if (!((nn) this).field_g) {
              break L1;
            } else {
              L2: {
                var9 = 0;
                if (!((nn) this).field_u) {
                  break L2;
                } else {
                  if (((nn) this).field_o == ((nn) this).field_r.field_gb) {
                    var9 += 6;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (null != ((nn) this).field_h) {
                  var10 = 0;
                  L4: while (true) {
                    if (((nn) this).field_h.length <= var10) {
                      break L3;
                    } else {
                      L5: {
                        var11 = 0;
                        var12 = 0;
                        var13 = ((nn) this).field_h[var10];
                        if (1 == var13) {
                          var11 = -10;
                          var12 = -5;
                          break L5;
                        } else {
                          if (var13 != 0) {
                            if (2 == var13) {
                              var11 = 10;
                              var12 = 5;
                              break L5;
                            } else {
                              if (-4 != (var13 ^ -1)) {
                                break L5;
                              } else {
                                var11 = -10;
                                var12 = 5;
                                break L5;
                              }
                            }
                          } else {
                            var11 = 10;
                            var12 = -5;
                            break L5;
                          }
                        }
                      }
                      L6: {
                        sc.field_f[((nn) this).field_h[var10] + var9].e(var3, var4, 128);
                        sc.field_f[((nn) this).field_h[var10] - -var9].e(var11 + var3, var4 - -var12, 128);
                        sc.field_f[((nn) this).field_h[var10] - -var9].e(var3 - -(var11 << 220673601), (var12 << -1402085503) + var4, 128);
                        if (var10 >= ((nn) this).field_h.length - 1) {
                          break L6;
                        } else {
                          if (((nn) this).field_h[1 + var10] != ((nn) this).field_h[var10]) {
                            break L6;
                          } else {
                            sc.field_f[((nn) this).field_h[var10] + var9].e(var3 + 3 * var11, 3 * var12 + var4, 128);
                            break L6;
                          }
                        }
                      }
                      var4 = var4 + (var12 << 1666990850);
                      var3 = var3 + (var11 << 2129854690);
                      if (var8 == 0) {
                        param0.field_e[1] = var12 + 16 + var4;
                        param0.field_e[0] = 32 + var3 - -var11;
                        param0.c(false);
                        if (((nn) this).field_u) {
                          if (((nn) this).field_q[param0.field_c[0] - -(param0.field_c[1] * ((nn) this).field_x)] > var7) {
                            var9 = 0;
                            var8 = 1;
                            var10++;
                            continue L4;
                          } else {
                            var10++;
                            continue L4;
                          }
                        } else {
                          var10++;
                          continue L4;
                        }
                      } else {
                        var10++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              sc.field_f[var9 + 5].e(var5, var6, 128);
              break L1;
            }
          } else {
            L7: {
              stackOut_3_0 = sc.field_f;
              stackOut_3_1 = 5;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              if (!((nn) this).field_u) {
                stackOut_5_0 = (wk[]) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                break L7;
              } else {
                stackOut_4_0 = (wk[]) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 6;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                break L7;
              }
            }
            ((wk) (Object) stackIn_6_0[stackIn_6_1 + stackIn_6_2]).g(var5, var6);
            break L1;
          }
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
          if (-1 <= (param2 ^ -1)) {
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
            if (-1 != (4 & ((nn) this).field_r.b(31, ((nn) this).field_i.field_w, ((nn) this).field_i.field_J, ((nn) this).field_i.field_O) ^ -1)) {
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
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_32_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int[] stackOut_28_0 = null;
        int[] stackOut_27_0 = null;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        L0: {
          var24 = ArmiesOfGielinor.field_M ? 1 : 0;
          ((nn) this).field_o = param2;
          ((nn) this).field_p = param5;
          ((nn) this).field_f = false;
          ((nn) this).field_y = param4;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((nn) this).field_o == param3.field_O) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          L2: {
            ((nn) this).field_a = stackIn_3_1 != 0;
            ((nn) this).field_i = param3;
            stackOut_3_0 = this;
            stackIn_6_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (!param0) {
              break L2;
            } else {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!((nn) this).field_a) {
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L1;
              }
            }
          }
          stackOut_6_0 = this;
          stackOut_6_1 = 0;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          break L1;
        }
        L3: {
          ((nn) this).field_w = stackIn_7_1 != 0;
          if (param1 > 10) {
            break L3;
          } else {
            var25 = null;
            int discarded$1 = ((nn) this).a(true, (bv) null);
            break L3;
          }
        }
        L4: {
          ((nn) this).field_d = ((nn) this).field_i.field_N;
          var7 = ((nn) this).field_i.B(3257);
          var8 = ((nn) this).field_i.l((byte) -79);
          this.a(0);
          if ((((nn) this).field_p ^ -1) >= 0) {
            break L4;
          } else {
            if (24 == uc.field_d[((nn) this).field_p][5]) {
              this.a(false, uc.field_d[((nn) this).field_p][6], 93);
              return;
            } else {
              break L4;
            }
          }
        }
        if ((((nn) this).field_d ^ -1) != -52) {
          L5: {
            L6: {
              var9 = ((nn) this).c(27732);
              var10 = ((nn) this).field_i.field_J;
              var11 = ((nn) this).field_i.field_J;
              var12 = ((nn) this).field_i.field_w;
              var13 = ((nn) this).field_i.field_w;
              ((nn) this).field_q[((nn) this).field_i.field_J - -(((nn) this).field_x * ((nn) this).field_i.field_w)] = 0;
              ((nn) this).field_k[((nn) this).field_i.field_J - -(((nn) this).field_x * ((nn) this).field_i.field_w)] = 0;
              if (!((nn) this).field_i.field_W) {
                break L6;
              } else {
                if (-1 == (((nn) this).field_i.field_N ^ -1)) {
                  break L6;
                } else {
                  break L5;
                }
              }
            }
            var14 = 0;
            L7: while (true) {
              if (var14 >= 500) {
                break L5;
              } else {
                var15 = 0;
                var16 = 0;
                var17 = 0;
                L8: while (true) {
                  if (var17 >= ((nn) this).field_x) {
                    if (0 != var15) {
                      var14++;
                      continue L7;
                    } else {
                      break L5;
                    }
                  } else {
                    var18 = 0;
                    L9: while (true) {
                      if (var18 >= ((nn) this).field_A) {
                        var17++;
                        continue L8;
                      } else {
                        var19 = 0;
                        L10: while (true) {
                          if (var19 >= 2) {
                            var16++;
                            var18++;
                            continue L9;
                          } else {
                            L11: {
                              if (var19 == 0) {
                                stackOut_28_0 = ((nn) this).field_q;
                                stackIn_29_0 = stackOut_28_0;
                                break L11;
                              } else {
                                stackOut_27_0 = ((nn) this).field_k;
                                stackIn_29_0 = stackOut_27_0;
                                break L11;
                              }
                            }
                            L12: {
                              var29 = (int[]) (Object) stackIn_29_0;
                              var28 = var29;
                              var27 = var28;
                              var26 = var27;
                              var20 = var26;
                              if ((var19 ^ -1) != -2) {
                                stackOut_31_0 = 0;
                                stackIn_32_0 = stackOut_31_0;
                                break L12;
                              } else {
                                stackOut_30_0 = 1;
                                stackIn_32_0 = stackOut_30_0;
                                break L12;
                              }
                            }
                            L13: {
                              var21 = stackIn_32_0;
                              var22 = 1000000;
                              if ((var18 ^ -1) < -1) {
                                var23 = ((nn) this).field_r.a(((nn) this).field_i, var21 != 0, 14336, true, var16, -1 + var16, ((nn) this).field_i.field_O);
                                if (var22 <= var23 + var20[-1 + var16]) {
                                  break L13;
                                } else {
                                  var22 = var23 + var20[-1 + var16];
                                  if (var11 >= var18) {
                                    break L13;
                                  } else {
                                    if (var9 >= var22) {
                                      var11 = var18;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              } else {
                                break L13;
                              }
                            }
                            L14: {
                              if ((var17 ^ -1) >= -1) {
                                break L14;
                              } else {
                                var23 = ((nn) this).field_r.a(((nn) this).field_i, var21 != 0, 14336, true, var16, -((nn) this).field_x + var16, ((nn) this).field_i.field_O);
                                if (-1 <= (var17 ^ -1)) {
                                  break L14;
                                } else {
                                  if (var20[var16 - ((nn) this).field_x] - -var23 >= var22) {
                                    break L14;
                                  } else {
                                    var22 = var20[var16 - ((nn) this).field_x] + var23;
                                    break L14;
                                  }
                                }
                              }
                            }
                            L15: {
                              if (var18 >= -1 + ((nn) this).field_x) {
                                break L15;
                              } else {
                                var23 = ((nn) this).field_r.a(((nn) this).field_i, var21 != 0, 14336, true, var16, var16 - -1, ((nn) this).field_i.field_O);
                                if (var22 <= var20[var16 - -1] - -var23) {
                                  break L15;
                                } else {
                                  var22 = var20[var16 - -1] - -var23;
                                  break L15;
                                }
                              }
                            }
                            L16: {
                              if (var17 >= ((nn) this).field_A - 1) {
                                break L16;
                              } else {
                                var23 = ((nn) this).field_r.a(((nn) this).field_i, var21 != 0, 14336, true, var16, var16 - -((nn) this).field_x, ((nn) this).field_i.field_O);
                                if (var20[((nn) this).field_x + var16] - -var23 >= var22) {
                                  break L16;
                                } else {
                                  var22 = var20[var16 + ((nn) this).field_x] - -var23;
                                  break L16;
                                }
                              }
                            }
                            if (var22 < var29[var16]) {
                              L17: {
                                if (var10 <= var18) {
                                  break L17;
                                } else {
                                  var10 = var18;
                                  break L17;
                                }
                              }
                              L18: {
                                if (var18 > var11) {
                                  var11 = var18;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                if (var15 >= var22) {
                                  break L19;
                                } else {
                                  var15 = var22;
                                  break L19;
                                }
                              }
                              L20: {
                                if (var17 <= var13) {
                                  break L20;
                                } else {
                                  var13 = var17;
                                  break L20;
                                }
                              }
                              var29[var16] = var22;
                              if (var12 > var17) {
                                var12 = var17;
                                var19++;
                                continue L10;
                              } else {
                                var19++;
                                continue L10;
                              }
                            } else {
                              var19++;
                              continue L10;
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
          L21: {
            if (4 != bw.field_m[param3.field_N][0]) {
              stackOut_70_0 = 0;
              stackIn_71_0 = stackOut_70_0;
              break L21;
            } else {
              stackOut_69_0 = 1;
              stackIn_71_0 = stackOut_69_0;
              break L21;
            }
          }
          L22: {
            var14 = stackIn_71_0;
            if (!((nn) this).field_i.j((byte) 102)) {
              stackOut_73_0 = 0;
              stackIn_74_0 = stackOut_73_0;
              break L22;
            } else {
              stackOut_72_0 = 1;
              stackIn_74_0 = stackOut_72_0;
              break L22;
            }
          }
          L23: {
            var15 = stackIn_74_0;
            ((nn) this).field_r.field_j.a(var8, var15 != 0, -1, var10, var13, ((nn) this).field_i.field_O, ((nn) this).field_a, ((nn) this).field_q, var7, var11, var14 != 0, ((nn) this).field_e, var9, var12);
            if (!((nn) this).field_i.field_W) {
              break L23;
            } else {
              if (((nn) this).field_i.field_N == 0) {
                break L23;
              } else {
                ((nn) this).field_q[((nn) this).field_i.field_J - -(((nn) this).field_i.field_w * ((nn) this).field_x)] = 1000000;
                break L23;
              }
            }
          }
          return;
        } else {
          this.a(true, bw.field_m[((nn) this).field_d][3], 112);
          return;
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
        if ((((nn) this).field_p ^ -1) < 0) {
          ((nn) this).field_r.field_J = true;
          return (mn) (Object) new to((ik) (Object) new ra(((nn) this).field_p, (mn) (Object) var4), ((nn) this).field_y, param0);
        } else {
          return (mn) (Object) var4;
        }
    }

    final static void a(byte param0, ha param1) {
        ha var2_ref = null;
        int var2 = 0;
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
        if (-5 == (param1.field_cb ^ -1)) {
          var2_ref = param1;
          param1.field_db = 10;
          param1.field_Eb = new ne[100];
          var2_ref.field_v = 10;
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
                  var4 = var3 % 10;
                  var5 = var3 / 10;
                  if (var4 == 1) {
                    break L2;
                  } else {
                    if (-9 != (var4 ^ -1)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (1 == var5) {
                    break L3;
                  } else {
                    if (var5 != -9) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                param1.field_Eb[var3] = new ne(7, param1);
                var3++;
                continue L0;
              }
              L4: {
                L5: {
                  L6: {
                    if (-2 == var4) {
                      break L6;
                    } else {
                      if (-9 != var4) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (-10 <= var5) {
                    break L5;
                  } else {
                    if (-1 > var5) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L7: {
                  L8: {
                    if (var5 == -2) {
                      break L8;
                    } else {
                      if (-9 != var5) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4 >= 9) {
                    break L7;
                  } else {
                    if (-1 < var4) {
                      break L4;
                    } else {
                      break L7;
                    }
                  }
                }
                L9: {
                  L10: {
                    if (2 == var4) {
                      break L10;
                    } else {
                      if (var4 != 7) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (var5 == 2) {
                      break L11;
                    } else {
                      if (7 != var5) {
                        break L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param1.field_Eb[var3] = new ne(9, param1);
                  var3++;
                  continue L0;
                }
                L12: {
                  L13: {
                    if (var4 == -4) {
                      break L13;
                    } else {
                      if (-7 != var4) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (-3 == var5) {
                      break L14;
                    } else {
                      if (-8 != var5) {
                        break L12;
                      } else {
                        break L14;
                      }
                    }
                  }
                  param1.field_Eb[var3] = new ne(8, param1);
                  var3++;
                  continue L0;
                }
                L15: {
                  L16: {
                    if (var4 == 2) {
                      break L16;
                    } else {
                      if (7 != var4) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  L17: {
                    if ((var5 ^ -1) == -4) {
                      break L17;
                    } else {
                      if (6 != var5) {
                        break L15;
                      } else {
                        break L17;
                      }
                    }
                  }
                  param1.field_Eb[var3] = new ne(8, param1);
                  var3++;
                  continue L0;
                }
                L18: {
                  L19: {
                    if (4 != var4) {
                      break L19;
                    } else {
                      if (var5 < 4) {
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                  L20: {
                    if (-6 != var4) {
                      break L20;
                    } else {
                      if (-6 < var5) {
                        break L18;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L21: {
                    L22: {
                      if (4 == var4) {
                        break L22;
                      } else {
                        if (5 != var4) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                    L23: {
                      if (var5 == 4) {
                        break L23;
                      } else {
                        if (-6 == (var5 ^ -1)) {
                          break L23;
                        } else {
                          break L21;
                        }
                      }
                    }
                    param1.field_Eb[var3] = new ne(6, param1);
                    var3++;
                    continue L0;
                  }
                  param1.field_Eb[var3] = new ne(0, param1);
                  var3++;
                  continue L0;
                }
                param1.field_Eb[var3] = new ne(4, param1);
                var3++;
                continue L0;
              }
              L24: {
                L25: {
                  if (-5 != (var4 ^ -1)) {
                    break L25;
                  } else {
                    if (var5 == 1) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                L26: {
                  if (5 != var4) {
                    break L26;
                  } else {
                    if (var5 == 8) {
                      break L24;
                    } else {
                      break L26;
                    }
                  }
                }
                param1.field_Eb[var3] = new ne(1, param1);
                var3++;
                continue L0;
              }
              param1.field_Eb[var3] = new ne(10, param1);
              var3++;
              continue L0;
            }
          }
        } else {
          param1.field_Eb = new ne[param1.field_v * param1.field_db];
          var2 = 0;
          L27: while (true) {
            if (var2 >= param1.field_db * param1.field_v) {
              L28: {
                if (param0 > 40) {
                  break L28;
                } else {
                  nn.b(69);
                  break L28;
                }
              }
              L29: {
                var13 = new Random((long)param1.field_jb);
                var3 = 3;
                var4 = 4 - -ns.a(false, 4, var13);
                var5 = ns.a(false, 100, var13);
                if (param1.field_hb == -1) {
                  if (10 > var5) {
                    var3 = 5;
                    break L29;
                  } else {
                    if (30 <= var5) {
                      if (-61 < var5) {
                        var3 = 1;
                        break L29;
                      } else {
                        if (-71 <= var5) {
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
                  if (-3 != param1.field_hb) {
                    if (var5 <= -31) {
                      if (var5 >= 60) {
                        if (-81 > var5) {
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
                    if (-31 >= (var5 ^ -1)) {
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
                        if (-6 != (var3 ^ -1)) {
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
                            if ((var3 ^ -1) == -3) {
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
                                    if (-1 != (var8 ^ -1)) {
                                      L38: {
                                        if (var7 == var8) {
                                          break L38;
                                        } else {
                                          var9 += 2;
                                          break L38;
                                        }
                                      }
                                      if (var8 != -2) {
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
                                if (-1 != var7) {
                                  break L41;
                                } else {
                                  if (-1 != (var8 ^ -1)) {
                                    break L41;
                                  } else {
                                    var8++;
                                    continue L35;
                                  }
                                }
                              }
                              if (var9 < param1.field_W) {
                                L42: {
                                  L43: {
                                    var10 = 20 * (1 + var7) - -10;
                                    var11 = 10 + 20 * (1 + var8);
                                    if (var7 == 0) {
                                      break L43;
                                    } else {
                                      if (var8 != 0) {
                                        var10 = var10 + (-1 + ns.a(false, 2, var13));
                                        var11 = var11 + (-1 + ns.a(false, 2, var13));
                                        break L42;
                                      } else {
                                        break L43;
                                      }
                                    }
                                  }
                                  var10 = 10 + (ns.a(false, 4, var13) + 5) * var7 + (20 + 20 * var7);
                                  var11 = 10 + var8 * (ns.a(false, 4, var13) + 5) + (20 + 20 * var8);
                                  break L42;
                                }
                                L44: while (true) {
                                  L45: {
                                    if (param1.field_Eb[param1.field_v * var11 + var10].field_h == 0) {
                                      break L45;
                                    } else {
                                      if (1 == param1.field_Eb[var10 + param1.field_v * var11].field_h) {
                                        break L45;
                                      } else {
                                        L46: {
                                          var11 = 20 + (var8 * 20 - -10);
                                          var10 = (1 + var7) * 20 + 10;
                                          if (var7 == 0) {
                                            break L46;
                                          } else {
                                            if (0 != var8) {
                                              var10 = var10 + (ns.a(false, 4, var13) + -2);
                                              var11 = var11 + (ns.a(false, 4, var13) - 2);
                                              continue L44;
                                            } else {
                                              break L46;
                                            }
                                          }
                                        }
                                        var10 = var7 * (ns.a(false, 4, var13) + 5) - -10 - (-20 + -(var7 * 20));
                                        var11 = (ns.a(false, 4, var13) + 5) * var8 - -10 - (-20 + -(20 * var8));
                                        continue L44;
                                      }
                                    }
                                  }
                                  param1.field_t[var9].a((byte) -119, (tc) (Object) new jd(var10, var11, 0, var9, 10, 10, 9, 0, 0, param1, 0, 0, -1, false, 0));
                                  var8++;
                                  continue L35;
                                }
                              } else {
                                var8++;
                                continue L35;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      L47: {
                        if (param1.field_Eb[var6] == null) {
                          param1.field_Eb[var6] = new ne(0, param1);
                          break L47;
                        } else {
                          break L47;
                        }
                      }
                      var6++;
                      continue L31;
                    }
                  }
                } else {
                  var7 = -1;
                  L48: while (true) {
                    if (var7 <= -3) {
                      var6++;
                      continue L30;
                    } else {
                      L49: {
                        if (var6 != 0) {
                          break L49;
                        } else {
                          if (-1 != var7) {
                            break L49;
                          } else {
                            ul.a(var13, param1, (byte) 85, var3);
                            var7++;
                            continue L48;
                          }
                        }
                      }
                      L50: {
                        L51: {
                          var8 = var6 * 20 - -20 + 10;
                          var9 = 20 * (var7 + 1) + 10;
                          param1.field_Eb[param1.field_v * var9 + var8] = new ne(1, param1);
                          if (-1 == var6) {
                            break L51;
                          } else {
                            if (-1 == var7) {
                              break L51;
                            } else {
                              var8 = var8 + (-1 + ns.a(false, 2, var13));
                              var9 = var9 + (-1 + ns.a(false, 2, var13));
                              break L50;
                            }
                          }
                        }
                        var8 = var6 * (ns.a(false, 4, var13) + 5) - (-10 - (1 + var6) * 20);
                        var9 = (5 + ns.a(false, 4, var13)) * var7 + 10 + 20 * (var7 - -1);
                        break L50;
                      }
                      L52: {
                        param1.field_Eb[param1.field_v * var9 + var8] = new ne(7, param1);
                        if (0 != var3) {
                          fi.a(var8, (byte) 101, 1, var9, 20 * (var6 + 1) + 10, false, (var7 + 1) * 20 + 10, param1, var13);
                          break L52;
                        } else {
                          break L52;
                        }
                      }
                      var10 = 0;
                      L53: while (true) {
                        if (var10 < var4) {
                          L54: while (true) {
                            L55: {
                              if (null == param1.field_Eb[var9 * param1.field_v + var8]) {
                                break L55;
                              } else {
                                if (param1.field_Eb[var8 - -(param1.field_v * var9)].field_h == -1) {
                                  break L55;
                                } else {
                                  if (-2 == param1.field_Eb[var9 * param1.field_v + var8].field_h) {
                                    break L55;
                                  } else {
                                    var8 = ns.a(false, 7, var13) * 2 + (20 * (var6 + 1) + 3);
                                    var9 = (1 + var7) * 20 - (-(2 * ns.a(false, 7, var13)) - 3);
                                    continue L54;
                                  }
                                }
                              }
                            }
                            param1.field_Eb[var8 + var9 * param1.field_v] = new ne(8, param1);
                            if (var3 != 0) {
                              qp.a(var9, 20 * (1 + var6) + 10, -1, var7 * 20 - -30, var8, 0, param1, 1, var13);
                              var10++;
                              continue L53;
                            } else {
                              var10++;
                              continue L53;
                            }
                          }
                        } else {
                          var7++;
                          continue L48;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              param1.field_Eb[var2] = null;
              var2++;
              continue L27;
            }
          }
        }
    }

    final int a(boolean param0, bv param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (!((nn) this).field_t) {
            break L0;
          } else {
            if (!((nn) this).field_u) {
              break L0;
            } else {
              L1: {
                var3 = 6;
                if (0 <= (((nn) this).field_p ^ -1)) {
                  param1.h(32161, 65);
                  param1.b(1, var3);
                  break L1;
                } else {
                  param1.h(32161, 65);
                  param1.b(1, var3 + 4);
                  param1.b(1, 160);
                  param1.b(1, ((nn) this).field_y);
                  param1.b(true, ((nn) this).field_p);
                  break L1;
                }
              }
              param1.b(1, 0);
              param1.b(1, 0);
              param1.b(1, ((nn) this).field_i.field_J);
              param1.b(1, ((nn) this).field_i.field_w);
              pd.a(((nn) this).field_l, ((nn) this).field_j, (vh) (Object) param1, 127);
              return var3;
            }
          }
        }
        L2: {
          if (null == ((nn) this).field_h) {
            ((nn) this).field_m = 0;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (0 < ((nn) this).field_m % 4) {
            stackOut_11_0 = 1;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 0;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var3 = stackIn_12_0 + (6 + ((nn) this).field_m / 4);
          if (0 <= (((nn) this).field_p ^ -1)) {
            param1.h(32161, 65);
            param1.b(1, var3);
            break L4;
          } else {
            param1.h(32161, 65);
            param1.b(1, 4 + var3);
            param1.b(1, 160);
            param1.b(1, ((nn) this).field_y);
            param1.b(true, ((nn) this).field_p);
            ((nn) this).field_r.field_J = true;
            break L4;
          }
        }
        L5: {
          param1.b(1, ((nn) this).field_m >> -963064696 | 0);
          param1.b(1, ((nn) this).field_m & 255);
          param1.b(1, ((nn) this).field_i.field_J);
          param1.b(1, ((nn) this).field_i.field_w);
          jj.a((byte) -27, ((nn) this).field_m, (vh) (Object) param1, ((nn) this).field_h);
          if (param0) {
            break L5;
          } else {
            this.a(-21);
            break L5;
          }
        }
        pd.a(((nn) this).field_l, ((nn) this).field_j, (vh) (Object) param1, -78);
        return var3;
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
        ((nn) this).field_r = param0;
        ((nn) this).field_A = ((nn) this).field_r.field_db;
        ((nn) this).field_x = ((nn) this).field_r.field_v;
        ((nn) this).field_q = new int[((nn) this).field_A * ((nn) this).field_x];
        ((nn) this).field_k = new int[((nn) this).field_x * ((nn) this).field_A];
        ((nn) this).field_e = new int[((nn) this).field_x * ((nn) this).field_A];
        this.a(0);
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
