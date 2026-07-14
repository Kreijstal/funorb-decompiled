/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends id {
    private int field_U;
    private fn field_W;
    boolean field_S;
    static int field_R;
    private int field_Z;
    private int field_X;
    int field_V;
    private int field_ab;
    private int field_T;
    static int[] field_Y;
    private boolean field_H;
    static boolean field_Q;
    private boolean field_bb;

    final void a(ej param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int[][] var26 = null;
        int[][] var27 = null;
        int[][] var28 = null;
        Object stackIn_1_0 = null;
        Object stackIn_1_1 = null;
        Object stackIn_2_0 = null;
        Object stackIn_2_1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_88_0 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_0_1 = null;
        Object stackOut_2_0 = null;
        Object stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        int stackOut_61_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_34_0 = 0;
        L0: {
          var11 = ZombieDawn.field_J;
          var3 = 12;
          stackOut_0_0 = this;
          stackOut_0_1 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = this;
            stackOut_2_2 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = this;
            stackOut_1_2 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        ((kc) this).field_Z = ((kc) this).a(stackIn_3_2 != 0);
        ((kc) this).field_X = ((kc) this).f(237239984);
        var4 = ((kc) this).field_Z;
        if (!param1) {
          var5 = ((kc) this).field_X;
          ((kc) this).field_T = var3;
          var6 = ((kc) this).field_V;
          if ((var6 ^ -1) == -3) {
            var5 = var5 - var3;
            ((kc) this).field_X = ((kc) this).field_X + 12;
            var4 = var4 + var3;
            L1: while (true) {
              if (var3 > -2) {
                if (((kc) this).field_V != 2) {
                  return;
                } else {
                  L2: {
                    var6 = ((kc) this).field_Z / 24;
                    var7 = ((kc) this).field_X / 24;
                    var27 = param0.field_A.field_h;
                    if (var6 > -1) {
                      break L2;
                    } else {
                      if (-1 > var7) {
                        break L2;
                      } else {
                        if (var6 >= var27[0].length) {
                          break L2;
                        } else {
                          if (var7 < var27.length) {
                            L3: {
                              var9 = var27[var7][var6] >> 485617447 & 511;
                              if ((var9 ^ -1) >= -218) {
                                stackOut_61_0 = 0;
                                stackIn_63_0 = stackOut_61_0;
                                break L3;
                              } else {
                                if (246 > var9) {
                                  stackOut_62_0 = 4;
                                  stackIn_63_0 = stackOut_62_0;
                                  break L3;
                                } else {
                                  var10 = 0;
                                  ((kc) this).field_T = ((kc) this).field_T + var10;
                                  ((kc) this).field_y = ((kc) this).field_y - (var10 << -1928060368);
                                  return;
                                }
                              }
                            }
                            var10 = stackIn_63_0;
                            ((kc) this).field_T = ((kc) this).field_T + var10;
                            ((kc) this).field_y = ((kc) this).field_y - (var10 << -1928060368);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L4: {
                  if (-3 != ((kc) this).field_V) {
                    var5 = var5 + var3;
                    break L4;
                  } else {
                    var4 = var4 + var3;
                    break L4;
                  }
                }
                if (param0.a(param1, var5, var4, false)) {
                  ((kc) this).field_T = ((kc) this).field_T + var3;
                  continue L1;
                } else {
                  L5: {
                    if ((((kc) this).field_V ^ -1) == -3) {
                      var4 = var4 - var3;
                      break L5;
                    } else {
                      var5 = var5 - var3;
                      break L5;
                    }
                  }
                  var3 = var3 / 2;
                  continue L1;
                }
              }
            }
          } else {
            L6: {
              if (1 != var6) {
                break L6;
              } else {
                var5 = var5 + var3;
                break L6;
              }
            }
            L7: while (true) {
              if (var3 > -2) {
                if (((kc) this).field_V != 2) {
                  return;
                } else {
                  L8: {
                    var6 = ((kc) this).field_Z / 24;
                    var7 = ((kc) this).field_X / 24;
                    var28 = param0.field_A.field_h;
                    if (var6 > -1) {
                      break L8;
                    } else {
                      if (-1 > var7) {
                        break L8;
                      } else {
                        if (var6 >= var28[0].length) {
                          break L8;
                        } else {
                          if (var7 < var28.length) {
                            L9: {
                              var9 = var28[var7][var6] >> 485617447 & 511;
                              if ((var9 ^ -1) >= -218) {
                                stackOut_86_0 = 0;
                                stackIn_88_0 = stackOut_86_0;
                                break L9;
                              } else {
                                if (246 > var9) {
                                  stackOut_87_0 = 4;
                                  stackIn_88_0 = stackOut_87_0;
                                  break L9;
                                } else {
                                  var10 = 0;
                                  ((kc) this).field_T = ((kc) this).field_T + var10;
                                  ((kc) this).field_y = ((kc) this).field_y - (var10 << -1928060368);
                                  return;
                                }
                              }
                            }
                            var10 = stackIn_88_0;
                            ((kc) this).field_T = ((kc) this).field_T + var10;
                            ((kc) this).field_y = ((kc) this).field_y - (var10 << -1928060368);
                            break L8;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  if (-3 != ((kc) this).field_V) {
                    var5 = var5 + var3;
                    break L10;
                  } else {
                    var4 = var4 + var3;
                    break L10;
                  }
                }
                if (param0.a(param1, var5, var4, false)) {
                  ((kc) this).field_T = ((kc) this).field_T + var3;
                  continue L7;
                } else {
                  L11: {
                    if ((((kc) this).field_V ^ -1) == -3) {
                      var4 = var4 - var3;
                      break L11;
                    } else {
                      var5 = var5 - var3;
                      break L11;
                    }
                  }
                  var3 = var3 / 2;
                  continue L7;
                }
              }
            }
          }
        } else {
          L12: {
            var12 = null;
            ((kc) this).a((byte) -112, (wk) null);
            var5 = ((kc) this).field_X;
            ((kc) this).field_T = var3;
            var6 = ((kc) this).field_V;
            if ((var6 ^ -1) == -3) {
              var5 = var5 - var3;
              ((kc) this).field_X = ((kc) this).field_X + 12;
              var4 = var4 + var3;
              break L12;
            } else {
              if (1 != var6) {
                break L12;
              } else {
                var5 = var5 + var3;
                break L12;
              }
            }
          }
          L13: while (true) {
            if (var3 > -2) {
              if (((kc) this).field_V == 2) {
                var6 = ((kc) this).field_Z / 24;
                var7 = ((kc) this).field_X / 24;
                var26 = param0.field_A.field_h;
                if ((var6 ^ -1) <= -1) {
                  if (-1 >= (var7 ^ -1)) {
                    L14: {
                      if (var6 >= var26[0].length) {
                        break L14;
                      } else {
                        if (var7 < var26.length) {
                          L15: {
                            var9 = var26[var7][var6] >> 485617447 & 511;
                            if ((var9 ^ -1) >= -218) {
                              stackOut_33_0 = 0;
                              stackIn_35_0 = stackOut_33_0;
                              break L15;
                            } else {
                              if (246 > var9) {
                                stackOut_34_0 = 4;
                                stackIn_35_0 = stackOut_34_0;
                                break L15;
                              } else {
                                var10 = 0;
                                ((kc) this).field_T = ((kc) this).field_T + var10;
                                ((kc) this).field_y = ((kc) this).field_y - (var10 << -1928060368);
                                return;
                              }
                            }
                          }
                          var10 = stackIn_35_0;
                          ((kc) this).field_T = ((kc) this).field_T + var10;
                          ((kc) this).field_y = ((kc) this).field_y - (var10 << -1928060368);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L16: {
                if (-3 != ((kc) this).field_V) {
                  var5 = var5 + var3;
                  break L16;
                } else {
                  var4 = var4 + var3;
                  break L16;
                }
              }
              if (param0.a(param1, var5, var4, false)) {
                ((kc) this).field_T = ((kc) this).field_T + var3;
                continue L13;
              } else {
                L17: {
                  if ((((kc) this).field_V ^ -1) == -3) {
                    var4 = var4 - var3;
                    break L17;
                  } else {
                    var5 = var5 - var3;
                    break L17;
                  }
                }
                var3 = var3 / 2;
                continue L13;
              }
            }
          }
        }
    }

    final boolean a(int param0, kd param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_69_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_10_0 = 0;
        var3 = 28 % ((param0 - -8) / 53);
        if (((kc) this).field_S) {
          if (((kc) this).field_bb) {
            if (((kc) this).field_H) {
              var4 = 0;
              var5 = param1.a(true);
              var6 = param1.f(237239984);
              if (2 != ((kc) this).field_V) {
                if (1 == ((kc) this).field_V) {
                  L0: {
                    var7 = var6 + -((kc) this).field_X;
                    if (5 > Math.abs(-12 + var5 - ((kc) this).field_Z)) {
                      if ((var7 ^ -1) < -1) {
                        if (var7 >= ((kc) this).field_T) {
                          stackOut_67_0 = 0;
                          stackIn_69_0 = stackOut_67_0;
                          break L0;
                        } else {
                          stackOut_66_0 = 1;
                          stackIn_69_0 = stackOut_66_0;
                          break L0;
                        }
                      } else {
                        stackOut_64_0 = 0;
                        stackIn_69_0 = stackOut_64_0;
                        break L0;
                      }
                    } else {
                      stackOut_62_0 = 0;
                      stackIn_69_0 = stackOut_62_0;
                      break L0;
                    }
                  }
                  var4 = stackIn_69_0;
                  if (var4 != 0) {
                    if (!((kc) this).field_bb) {
                      ((kc) this).field_H = true;
                      ((kc) this).field_U = 0;
                      return var4 != 0;
                    } else {
                      return var4 != 0;
                    }
                  } else {
                    return var4 != 0;
                  }
                } else {
                  if (var4 != 0) {
                    if (((kc) this).field_bb) {
                      return var4 != 0;
                    } else {
                      ((kc) this).field_H = true;
                      ((kc) this).field_U = 0;
                      return var4 != 0;
                    }
                  } else {
                    return var4 != 0;
                  }
                }
              } else {
                var7 = var5 - ((kc) this).field_Z;
                if (-6 < (Math.abs(-((kc) this).f(237239984) + var6) ^ -1)) {
                  if (var7 <= 0) {
                    L1: {
                      var4 = 0;
                      if (var4 == 0) {
                        break L1;
                      } else {
                        if (!((kc) this).field_bb) {
                          ((kc) this).field_H = true;
                          ((kc) this).field_U = 0;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    return var4 != 0;
                  } else {
                    L2: {
                      if (var7 >= ((kc) this).field_T) {
                        stackOut_42_0 = 0;
                        stackIn_43_0 = stackOut_42_0;
                        break L2;
                      } else {
                        stackOut_41_0 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        break L2;
                      }
                    }
                    L3: {
                      var4 = stackIn_43_0;
                      if (var4 == 0) {
                        break L3;
                      } else {
                        if (!((kc) this).field_bb) {
                          ((kc) this).field_H = true;
                          ((kc) this).field_U = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    return var4 != 0;
                  }
                } else {
                  L4: {
                    var4 = 0;
                    if (var4 == 0) {
                      break L4;
                    } else {
                      if (!((kc) this).field_bb) {
                        ((kc) this).field_H = true;
                        ((kc) this).field_U = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  return var4 != 0;
                }
              }
            } else {
              return false;
            }
          } else {
            L5: {
              var4 = 0;
              var5 = param1.a(true);
              var6 = param1.f(237239984);
              if (2 != ((kc) this).field_V) {
                if (1 == ((kc) this).field_V) {
                  L6: {
                    var7 = var6 + -((kc) this).field_X;
                    if (5 > Math.abs(-12 + var5 - ((kc) this).field_Z)) {
                      if ((var7 ^ -1) < -1) {
                        if (var7 < ((kc) this).field_T) {
                          stackOut_21_0 = 1;
                          stackIn_23_0 = stackOut_21_0;
                          break L6;
                        } else {
                          stackOut_20_0 = 0;
                          stackIn_23_0 = stackOut_20_0;
                          break L6;
                        }
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_23_0 = stackOut_18_0;
                        break L6;
                      }
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_23_0 = stackOut_16_0;
                      break L6;
                    }
                  }
                  var4 = stackIn_23_0;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                var7 = var5 - ((kc) this).field_Z;
                if (-6 < (Math.abs(-((kc) this).f(237239984) + var6) ^ -1)) {
                  if (var7 > 0) {
                    if (var7 < ((kc) this).field_T) {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      var4 = stackIn_12_0;
                      break L5;
                    } else {
                      var4 = 0;
                      break L5;
                    }
                  } else {
                    var4 = 0;
                    break L5;
                  }
                } else {
                  var4 = 0;
                  break L5;
                }
              }
            }
            if (var4 != 0) {
              if (((kc) this).field_bb) {
                return var4 != 0;
              } else {
                ((kc) this).field_H = true;
                ((kc) this).field_U = 0;
                return var4 != 0;
              }
            } else {
              return var4 != 0;
            }
          }
        } else {
          return false;
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        qg.field_f = param2;
        ej.field_s = param3;
        qi.field_E = param1;
        if (param0 == 50) {
            return;
        }
        field_Q = true;
    }

    public static void c(boolean param0) {
        field_Y = null;
        if (param0) {
            return;
        }
        field_R = 39;
    }

    final void g(int param0) {
        int var2 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackOut_29_0 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        super.g(126);
        if (((kc) this).field_S) {
          if (!((kc) this).field_bb) {
            if (((kc) this).field_H) {
              ((kc) this).field_U = ((kc) this).field_U + 1;
              if (((kc) this).field_U + 1 >= ((kc) this).field_ab) {
                L0: {
                  ((kc) this).field_U = 0;
                  stackOut_29_0 = this;
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_30_0 = stackOut_29_0;
                  if (((kc) this).field_H) {
                    stackOut_31_0 = this;
                    stackOut_31_1 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    break L0;
                  } else {
                    stackOut_30_0 = this;
                    stackOut_30_1 = 1;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_32_1 = stackOut_30_1;
                    break L0;
                  }
                }
                L1: {
                  ((kc) this).field_H = stackIn_32_1 != 0;
                  if (((kc) this).field_H) {
                    ((kc) this).field_W = jp.a((byte) 127, 96);
                    var2 = 30;
                    ((kc) this).field_W.f(-(var2 / 2) + so.c(var2) + 256);
                    ((kc) this).field_W.h(ge.field_c / 2);
                    break L1;
                  } else {
                    if (((kc) this).field_W == null) {
                      break L1;
                    } else {
                      ((kc) this).field_W.e(0);
                      ((kc) this).field_W.i(-1);
                      ((kc) this).field_W.h(0);
                      ((kc) this).field_W = null;
                      if (param0 <= 95) {
                        ((kc) this).field_H = true;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (param0 <= 95) {
                  ((kc) this).field_H = true;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 <= 95) {
                  ((kc) this).field_H = true;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 <= 95) {
                ((kc) this).field_H = true;
                return;
              } else {
                return;
              }
            }
          } else {
            L2: {
              ((kc) this).field_U = ((kc) this).field_U + 1;
              if (((kc) this).field_U + 1 >= ((kc) this).field_ab) {
                L3: {
                  ((kc) this).field_U = 0;
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (((kc) this).field_H) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((kc) this).field_H = stackIn_8_1 != 0;
                if (((kc) this).field_H) {
                  ((kc) this).field_W = jp.a((byte) 127, 96);
                  var2 = 30;
                  ((kc) this).field_W.f(-(var2 / 2) + so.c(var2) + 256);
                  ((kc) this).field_W.h(ge.field_c / 2);
                  break L2;
                } else {
                  if (((kc) this).field_W != null) {
                    ((kc) this).field_W.e(0);
                    ((kc) this).field_W.i(-1);
                    ((kc) this).field_W.h(0);
                    ((kc) this).field_W = null;
                    break L2;
                  } else {
                    L4: {
                      if (param0 > 95) {
                        break L4;
                      } else {
                        ((kc) this).field_H = true;
                        break L4;
                      }
                    }
                    return;
                  }
                }
              } else {
                break L2;
              }
            }
            if (param0 > 95) {
              return;
            } else {
              ((kc) this).field_H = true;
              return;
            }
          }
        } else {
          return;
        }
    }

    kc(int param0, int param1, int param2, boolean param3, boolean param4, int param5, int param6) {
        super(param0, param1, param2);
        ((kc) this).field_S = true;
        ((kc) this).field_H = false;
        ((kc) this).field_S = true;
        ((kc) this).field_V = param5;
        if ((param6 ^ -1) == 0) {
            ((kc) this).field_bb = false;
            ((kc) this).field_ab = 400;
            if (!param3) {
            }
            if (((kc) this).field_V == -1) {
                ((kc) this).field_V = 2;
            }
            if (-3 == ((kc) this).field_V) {
                ((kc) this).field_V = 0;
            }
        }
        ((kc) this).field_bb = true;
        ((kc) this).field_ab = 250;
        ((kc) this).field_U = param6 * ((kc) this).field_ab / 2;
        if (((kc) this).field_U > ((kc) this).field_ab) {
            ((kc) this).field_H = !((kc) this).field_H ? true : false;
            ((kc) this).field_U = ((kc) this).field_U % ((kc) this).field_ab;
        }
        if (!param3) {
        }
        if (((kc) this).field_V == -1) {
            ((kc) this).field_V = 2;
        }
        if (-3 == ((kc) this).field_V) {
            ((kc) this).field_V = 0;
        }
    }

    final void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          super.a((byte) -92, param1);
          if (3 <= (397 * ((kc) this).field_U + 197 * (((kc) this).field_y >> 1934150928) + (((kc) this).field_x >> 684441840) * 493) % 63) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (param0 <= -76) {
          L1: {
            if (var3 != 0) {
              stackOut_7_0 = 6336736;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 3182768;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var4 = stackIn_8_0;
            if (var3 == 0) {
              stackOut_10_0 = 10543359;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = 7393279;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          var5 = stackIn_11_0;
          var6 = param1.a(((kc) this).a(true), (byte) -71);
          var7 = param1.a(((kc) this).f(237239984), 0);
          if (null == ((kc) this).field_W) {
            L3: {
              var9 = ((kc) this).field_V;
              if (var9 == 0) {
                var6 = var6 - ((kc) this).field_T;
                break L3;
              } else {
                if ((var9 ^ -1) == -3) {
                  break L3;
                } else {
                  if ((var9 ^ -1) == -2) {
                    var6 += 11;
                    var7 -= 6;
                    if (((kc) this).field_H) {
                      bi.e(-1 + var6, var7, 6 + ((kc) this).field_T, var4);
                      bi.e(var6, var7, ((kc) this).field_T - -6, var5);
                      bi.e(1 + var6, var7, ((kc) this).field_T + 6, var4);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            var8 = 18;
            var7 -= 12;
            var6 = var6 + var8;
            if (!((kc) this).field_H) {
              var7 -= 12;
              tm.field_h[((kc) this).field_F - -1].b(((kc) this).field_T + var6 + (-var8 - 24), var7);
              return;
            } else {
              bi.b(var6, var7 + -1, ((kc) this).field_T + -var8, var4);
              bi.b(var6, var7, -var8 + ((kc) this).field_T, var5);
              bi.b(var6, 1 + var7, ((kc) this).field_T + -var8, var4);
              var7 -= 12;
              tm.field_h[((kc) this).field_F - -1].b(((kc) this).field_T + var6 + (-var8 - 24), var7);
              return;
            }
          } else {
            L4: {
              L5: {
                ((kc) this).field_W.h(pj.a(var7, 106, var6) >> -1345565663);
                var9 = ((kc) this).field_V;
                if (var9 == 0) {
                  var6 = var6 - ((kc) this).field_T;
                  break L5;
                } else {
                  if ((var9 ^ -1) == -3) {
                    break L5;
                  } else {
                    if ((var9 ^ -1) == -2) {
                      var6 += 11;
                      var7 -= 6;
                      if (!((kc) this).field_H) {
                        return;
                      } else {
                        bi.e(-1 + var6, var7, 6 + ((kc) this).field_T, var4);
                        bi.e(var6, var7, ((kc) this).field_T - -6, var5);
                        bi.e(1 + var6, var7, ((kc) this).field_T + 6, var4);
                        return;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var8 = 18;
              var7 -= 12;
              var6 = var6 + var8;
              if (((kc) this).field_H) {
                bi.b(var6, var7 + -1, ((kc) this).field_T + -var8, var4);
                bi.b(var6, var7, -var8 + ((kc) this).field_T, var5);
                bi.b(var6, 1 + var7, ((kc) this).field_T + -var8, var4);
                var7 -= 12;
                tm.field_h[((kc) this).field_F - -1].b(((kc) this).field_T + var6 + (-var8 - 24), var7);
                break L4;
              } else {
                var7 -= 12;
                tm.field_h[((kc) this).field_F - -1].b(((kc) this).field_T + var6 + (-var8 - 24), var7);
                return;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = 0;
        field_Y = new int[]{20, 7};
        field_Q = false;
    }
}
