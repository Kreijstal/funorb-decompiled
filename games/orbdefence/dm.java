/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dm {
    ed[] field_c;
    static hj[] field_b;
    static int[] field_g;
    static int field_a;
    static int field_e;
    static int field_f;
    static char[] field_d;

    final int a(int param0, byte param1) {
        int var3 = 0;
        ed var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var5 = OrbDefence.field_D ? 1 : 0;
          if (param1 == 107) {
            break L0;
          } else {
            dm.a(43, -63, -39);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (this.field_c.length > var3) {
            var4 = this.field_c[var3];
            stackOut_5_0 = var4.field_g.length;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var5 == 0) {
              if (stackIn_7_0 > param0) {
                return var3;
              } else {
                param0 = param0 - (var4.field_g.length + -1);
                var3++;
                continue L1;
              }
            } else {
              return stackIn_6_0;
            }
          } else {
            return this.field_c.length;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 1) {
          dm.a(-96, -106, true, 45, 11, -128, -46);
          lm.field_a = param2;
          kf.field_e = param1;
          return;
        } else {
          lm.field_a = param2;
          kf.field_e = param1;
          return;
        }
    }

    final int b(int param0) {
        if (param0 > 105) {
          if (null != this.field_c) {
            if (0 >= this.field_c.length) {
              return 0;
            } else {
              return -this.field_c[0].field_f + this.field_c[-1 + this.field_c.length].field_c;
            }
          } else {
            return 0;
          }
        } else {
          dm.a(-11, -7, false, 50, 72, -55, -61);
          if (null != this.field_c) {
            if (0 >= this.field_c.length) {
              return 0;
            } else {
              return -this.field_c[0].field_f + this.field_c[-1 + this.field_c.length].field_c;
            }
          } else {
            return 0;
          }
        }
    }

    final int a(int param0, int param1) {
        ed[] var3 = null;
        int var4 = 0;
        ed var5 = null;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var6 = OrbDefence.field_D ? 1 : 0;
          var3 = this.field_c;
          var4 = 0;
          if (param0 <= -68) {
            break L0;
          } else {
            dm.a(-22);
            break L0;
          }
        }
        L1: while (true) {
          if (var4 < var3.length) {
            var5 = var3[var4];
            stackOut_4_0 = var5.field_g.length ^ -1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var6 == 0) {
              if (stackIn_6_0 >= (param1 ^ -1)) {
                param1 = param1 - (-1 + var5.field_g.length);
                var4++;
                continue L1;
              } else {
                return var5.field_g[param1];
              }
            } else {
              return stackIn_5_0;
            }
          } else {
            return 0;
          }
        }
    }

    final int a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        ed var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (this.field_c != null) {
          if (-1 != (this.field_c.length ^ -1)) {
            if (this.field_c[0].field_f > param0) {
              return -1;
            } else {
              if (this.field_c[-1 + this.field_c.length].field_c < param0) {
                return -1;
              } else {
                if (this.field_c.length == 1) {
                  return this.field_c[0].a(param1, -1052047551);
                } else {
                  var4 = 0;
                  var5 = 0;
                  L0: while (true) {
                    if (var5 < this.field_c.length) {
                      var6 = this.field_c[var5];
                      stackOut_18_0 = param0 ^ -1;
                      stackOut_18_1 = var6.field_f ^ -1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      if (var8 == 0) {
                        L1: {
                          if (stackIn_20_0 > stackIn_20_1) {
                            break L1;
                          } else {
                            if (var6.field_c >= param0) {
                              var7 = var6.a(param1, -1052047551);
                              if (0 != (var7 ^ -1)) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            } else {
                              break L1;
                            }
                          }
                        }
                        var4 = var4 + (var6.field_g.length - 1);
                        var5++;
                        continue L0;
                      } else {
                        var6_int = stackIn_19_0 % stackIn_19_1;
                        return -1;
                      }
                    } else {
                      var6_int = -37 % ((73 - param2) / 44);
                      return -1;
                    }
                  }
                }
              }
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int a(boolean param0) {
        int var2 = 0;
        ed[] var3 = null;
        int var4 = 0;
        ed var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        if (!param0) {
          var2 = -1;
          if (null == this.field_c) {
            return var2;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L0: while (true) {
              L1: {
                if (var4 >= var3.length) {
                  break L1;
                } else {
                  L2: {
                    var5 = var3[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var6 = var5.a(param0);
                      if (var6 <= var2) {
                        break L2;
                      } else {
                        var2 = var6;
                        break L2;
                      }
                    }
                  }
                  var4++;
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              return var2;
            }
          }
        } else {
          field_a = 108;
          var2 = -1;
          if (null == this.field_c) {
            return var2;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L3: while (true) {
              L4: {
                if (var4 >= var3.length) {
                  break L4;
                } else {
                  L5: {
                    var5 = var3[var4];
                    if (var5 == null) {
                      break L5;
                    } else {
                      var6 = var5.a(param0);
                      if (var6 <= var2) {
                        break L5;
                      } else {
                        var2 = var6;
                        break L5;
                      }
                    }
                  }
                  var4++;
                  if (var7 == 0) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              return var2;
            }
          }
        }
    }

    final int a(String param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              var7 = param0.length();
              if (param3 == 74) {
                break L1;
              } else {
                field_b = (hj[]) null;
                break L1;
              }
            }
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var8 >= var7) {
                      break L5;
                    } else {
                      var9 = param0.charAt(var8);
                      var12 = var9;
                      var11 = 60;
                      if (var10 != 0) {
                        if (var11 >= var12) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        L6: {
                          L7: {
                            if (var11 != var12) {
                              break L7;
                            } else {
                              var6 = 1;
                              if (var10 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 != 62) {
                              break L8;
                            } else {
                              var6 = 0;
                              if (var10 == 0) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          if (var6 != 0) {
                            break L6;
                          } else {
                            if (var9 != 32) {
                              break L6;
                            } else {
                              var5_int++;
                              break L6;
                            }
                          }
                        }
                        var8++;
                        if (var10 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (0 >= var5_int) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                stackOut_18_0 = (param1 - param2 << 403695336) / var5_int;
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("dm.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0;
        } else {
          return stackIn_21_0;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int incrementValue$1 = 0;
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
        int stackIn_10_0 = 0;
        boolean stackIn_14_0 = false;
        boolean stackIn_23_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_36_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_9_0 = 0;
        boolean stackOut_13_0 = false;
        var15 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 > param5) {
              if (param5 + 1 < param4) {
                L1: {
                  if (5 + param5 >= param4) {
                    break L1;
                  } else {
                    if (param1 == param3) {
                      break L1;
                    } else {
                      var7_int = (param1 >> -1303985887) - (-(param3 >> 273542273) + -(1 & (param1 & param3)));
                      var8 = param5;
                      var9 = param3;
                      var10 = param1;
                      var11 = -75 % ((-46 - param6) / 49);
                      var12 = param5;
                      L2: while (true) {
                        L3: {
                          if (param4 <= var12) {
                            dm.a(param0, var9, param2, param3, var8, param5, 28);
                            stackOut_35_0 = param0;
                            stackIn_36_0 = stackOut_35_0;
                            break L3;
                          } else {
                            var13 = bc.field_o[var12];
                            stackOut_22_0 = param2;
                            stackIn_36_0 = stackOut_22_0 ? 1 : 0;
                            stackIn_23_0 = stackOut_22_0;
                            if (var15 != 0) {
                              break L3;
                            } else {
                              L4: {
                                if (!stackIn_23_0) {
                                  stackOut_25_0 = rh.field_c[var13];
                                  stackIn_26_0 = stackOut_25_0;
                                  break L4;
                                } else {
                                  stackOut_24_0 = tl.field_d[var13];
                                  stackIn_26_0 = stackOut_24_0;
                                  break L4;
                                }
                              }
                              L5: {
                                L6: {
                                  var14 = stackIn_26_0;
                                  if (var14 > var7_int) {
                                    break L6;
                                  } else {
                                    if (var10 < var14) {
                                      var10 = var14;
                                      if (var15 == 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                L7: {
                                  bc.field_o[var12] = bc.field_o[var8];
                                  if (var14 < var9) {
                                    var9 = var14;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                incrementValue$1 = var8;
                                var8++;
                                bc.field_o[incrementValue$1] = var13;
                                break L5;
                              }
                              var12++;
                              continue L2;
                            }
                          }
                        }
                        dm.a(stackIn_36_0, param1, param2, var10, param4, var8, 126);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
                var7_int = -1 + param4;
                L8: while (true) {
                  stackOut_9_0 = param5 ^ -1;
                  stackIn_10_0 = stackOut_9_0;
                  L9: while (true) {
                    L10: {
                      if (stackIn_10_0 <= (var7_int ^ -1)) {
                        break L10;
                      } else {
                        var8 = param5;
                        L11: while (true) {
                          L12: {
                            if (var8 >= var7_int) {
                              break L12;
                            } else {
                              var9 = bc.field_o[var8];
                              var10 = bc.field_o[1 + var8];
                              stackOut_13_0 = hl.a(param2, -122, var10, var9);
                              stackIn_10_0 = stackOut_13_0 ? 1 : 0;
                              stackIn_14_0 = stackOut_13_0;
                              if (var15 != 0) {
                                continue L9;
                              } else {
                                L13: {
                                  if (stackIn_14_0) {
                                    bc.field_o[var8] = var10;
                                    bc.field_o[1 + var8] = var9;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                var8++;
                                if (var15 == 0) {
                                  continue L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          var7_int--;
                          if (var15 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var7), "dm.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_g = (int[]) null;
          field_b = null;
          field_d = null;
          field_g = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_g = null;
          return;
        }
    }

    static {
        field_d = new char[]{(char)91, (char)93, (char)35};
        field_g = new int[16384];
    }
}
