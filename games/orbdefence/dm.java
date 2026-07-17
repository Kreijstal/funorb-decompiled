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
        int var5 = OrbDefence.field_D ? 1 : 0;
        if (param1 != 107) {
            dm.a(43, -63, -39);
        }
        for (var3 = 0; ((dm) this).field_c.length > var3; var3++) {
            var4 = ((dm) this).field_c[var3];
            if (!(var4.field_g.length <= param0)) {
                return var3;
            }
            param0 = param0 - (var4.field_g.length + -1);
        }
        return ((dm) this).field_c.length;
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 1) {
            dm.a(-96, -106, true, 45, 11, -128, -46);
        }
        lm.field_a = param2;
        kf.field_e = param1;
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 105) {
            break L0;
          } else {
            dm.a(-11, -7, false, 50, 72, -55, -61);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((dm) this).field_c) {
              break L2;
            } else {
              if (0 >= ((dm) this).field_c.length) {
                break L2;
              } else {
                stackOut_4_0 = -((dm) this).field_c[0].field_f + ((dm) this).field_c[-1 + ((dm) this).field_c.length].field_c;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1) {
        ed var5 = null;
        int var6 = OrbDefence.field_D ? 1 : 0;
        ed[] var3 = ((dm) this).field_c;
        int var4 = 0;
        if (param0 > -68) {
            dm.a(-22);
        }
        while (var4 < var3.length) {
            var5 = var3[var4];
            if (var5.field_g.length > param1) {
                return var5.field_g[param1];
            }
            param1 = param1 - (-1 + var5.field_g.length);
            var4++;
        }
        return 0;
    }

    final int a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        ed var6_ref_ed = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = OrbDefence.field_D ? 1 : 0;
          if (((dm) this).field_c == null) {
            break L0;
          } else {
            if (((dm) this).field_c.length == 0) {
              break L0;
            } else {
              if (((dm) this).field_c[0].field_f > param0) {
                break L0;
              } else {
                if (((dm) this).field_c[-1 + ((dm) this).field_c.length].field_c < param0) {
                  return -1;
                } else {
                  if (((dm) this).field_c.length == 1) {
                    return ((dm) this).field_c[0].a(param1, -1052047551);
                  } else {
                    var4 = 0;
                    var5 = 0;
                    L1: while (true) {
                      if (var5 >= ((dm) this).field_c.length) {
                        var6 = -37 % ((73 - param2) / 44);
                        return -1;
                      } else {
                        L2: {
                          var6_ref_ed = ((dm) this).field_c[var5];
                          if (param0 < var6_ref_ed.field_f) {
                            break L2;
                          } else {
                            if (var6_ref_ed.field_c >= param0) {
                              var7 = var6_ref_ed.a(param1, -1052047551);
                              if (var7 != -1) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        var4 = var4 + (var6_ref_ed.field_g.length - 1);
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    final int a(boolean param0) {
        int var2 = 0;
        ed[] var3 = null;
        int var4 = 0;
        ed var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = OrbDefence.field_D ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            field_a = 108;
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (null != ((dm) this).field_c) {
            var3 = ((dm) this).field_c;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(param0);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var2;
    }

    final int a(String param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
                field_b = null;
                break L1;
              }
            }
            var8 = 0;
            L2: while (true) {
              if (var8 >= var7) {
                if (0 >= var5_int) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  stackOut_14_0 = (param1 - param2 << 8) / var5_int;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                }
              } else {
                L3: {
                  var9 = param0.charAt(var8);
                  if (60 != var9) {
                    if (var9 != 62) {
                      if (var6 != 0) {
                        break L3;
                      } else {
                        if (var9 != 32) {
                          break L3;
                        } else {
                          var5_int++;
                          break L3;
                        }
                      }
                    } else {
                      var6 = 0;
                      break L3;
                    }
                  } else {
                    var6 = 1;
                    break L3;
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("dm.A(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_17_0;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
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
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
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
                      var7_int = (param1 >> 1) - (-(param3 >> 1) + -(1 & (param1 & param3)));
                      var8 = param5;
                      var9 = param3;
                      var10 = param1;
                      var11 = -75 % ((-46 - param6) / 49);
                      var12 = param5;
                      L2: while (true) {
                        if (param4 <= var12) {
                          dm.a(param0, var9, param2, param3, var8, param5, 28);
                          dm.a(param0, param1, param2, var10, param4, var8, 126);
                          break L0;
                        } else {
                          L3: {
                            var13 = bc.field_o[var12];
                            if (!param2) {
                              stackOut_22_0 = rh.field_c[var13];
                              stackIn_23_0 = stackOut_22_0;
                              break L3;
                            } else {
                              stackOut_21_0 = tl.field_d[var13];
                              stackIn_23_0 = stackOut_21_0;
                              break L3;
                            }
                          }
                          L4: {
                            var14 = stackIn_23_0;
                            if (var14 > var7_int) {
                              L5: {
                                bc.field_o[var12] = bc.field_o[var8];
                                if (var14 < var9) {
                                  var9 = var14;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              int incrementValue$1 = var8;
                              var8++;
                              bc.field_o[incrementValue$1] = var13;
                              break L4;
                            } else {
                              if (var10 < var14) {
                                var10 = var14;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var12++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                var7_int = -1 + param4;
                L6: while (true) {
                  if (param5 >= var7_int) {
                    return;
                  } else {
                    var8 = param5;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = bc.field_o[var8];
                          var10 = bc.field_o[1 + var8];
                          if (hl.a(param2, -122, var10, var9)) {
                            bc.field_o[var8] = var10;
                            bc.field_o[1 + var8] = var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var7, "dm.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_g = null;
        }
        field_b = null;
        field_d = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[]{'[', ']', '#'};
        field_g = new int[16384];
    }
}
