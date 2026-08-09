/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static int field_b;
    int field_a;
    static int field_c;
    static int field_d;

    final static void a(dd[] param0, byte param1, int param2, int param3, int param4, int param5) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        int var22 = 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (-1 <= (param2 ^ -1)) {
                  break L1;
                } else {
                  if (-1 <= (param5 ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      if (null != param0[3]) {
                        stackIn_9_0 = param0[3].field_w;
                        break L2;
                      } else {
                        stackIn_9_0 = 0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_9_0;
                      if (param0[5] != null) {
                        stackIn_12_0 = param0[5].field_w;
                        break L3;
                      } else {
                        stackIn_12_0 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_12_0;
                      if (null == param0[1]) {
                        stackIn_15_0 = 0;
                        break L4;
                      } else {
                        stackIn_15_0 = param0[1].field_y;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_15_0;
                      if (param0[7] == null) {
                        stackIn_18_0 = 0;
                        break L5;
                      } else {
                        stackIn_18_0 = param0[7].field_y;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_18_0;
                      var10 = param2 + param3;
                      var11 = param4 + param5;
                      var12 = param3 + var6_int;
                      var13 = var10 + -var7;
                      var14 = param4 - -var8;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      var19 = 52 % ((param1 - -35) / 37);
                      if (var16 <= var17) {
                        break L6;
                      } else {
                        var17 = var6_int * param2 / (var7 + var6_int) + param3;
                        var16 = var6_int * param2 / (var7 + var6_int) + param3;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var20 = var15;
                      if (var20 < var18) {
                        var20 = param5 * var8 / (var8 - -var9) + param4;
                        var18 = param5 * var8 / (var8 - -var9) + param4;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      qh.a(mb.field_b);
                      if (null != param0[0]) {
                        qh.d(param3, param4, var16, var18);
                        param0[0].c(param3, param4);
                        qh.b(mb.field_b);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param0[2] != null) {
                        qh.d(var17, param4, var10, var18);
                        param0[2].c(var13, param4);
                        qh.b(mb.field_b);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param0[6] == null) {
                        break L10;
                      } else {
                        qh.d(param3, var20, var16, var11);
                        param0[6].c(param3, var15);
                        qh.b(mb.field_b);
                        break L10;
                      }
                    }
                    L11: {
                      if (null == param0[8]) {
                        break L11;
                      } else {
                        qh.d(var17, var20, var10, var11);
                        param0[8].c(var13, var15);
                        qh.b(mb.field_b);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param0[1]) {
                        break L12;
                      } else {
                        if (param0[1].field_w != 0) {
                          qh.d(var16, param4, var17, var18);
                          var21 = var12;
                          L13: while (true) {
                            if (var21 >= var13) {
                              qh.b(mb.field_b);
                              break L12;
                            } else {
                              param0[1].c(var21, param4);
                              var21 = var21 + param0[1].field_w;
                              continue L13;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (null == param0[7]) {
                        break L14;
                      } else {
                        if (-1 != (param0[7].field_w ^ -1)) {
                          qh.d(var16, var20, var17, var11);
                          var21 = var12;
                          L15: while (true) {
                            if (var13 <= var21) {
                              qh.b(mb.field_b);
                              break L14;
                            } else {
                              param0[7].c(var21, var15);
                              var21 = var21 + param0[7].field_w;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (null == param0[3]) {
                        break L16;
                      } else {
                        if (0 != param0[3].field_y) {
                          qh.d(param3, var18, var16, var20);
                          var21 = var14;
                          L17: while (true) {
                            if (var21 >= var15) {
                              qh.b(mb.field_b);
                              break L16;
                            } else {
                              param0[3].c(param3, var21);
                              var21 = var21 + param0[3].field_y;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (null == param0[5]) {
                        break L18;
                      } else {
                        if (param0[5].field_y != 0) {
                          qh.d(var17, var18, var10, var20);
                          var21 = var14;
                          L19: while (true) {
                            if (var21 >= var15) {
                              qh.b(mb.field_b);
                              break L18;
                            } else {
                              param0[5].c(var13, var21);
                              var21 = var21 + param0[5].field_y;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (null == param0[4]) {
                        break L20;
                      } else {
                        if (param0[4].field_w == 0) {
                          break L20;
                        } else {
                          if (-1 == (param0[4].field_y ^ -1)) {
                            break L20;
                          } else {
                            qh.d(var16, var18, var17, var20);
                            var21 = var14;
                            L21: while (true) {
                              if (var21 >= var15) {
                                qh.b(mb.field_b);
                                break L20;
                              } else {
                                var22 = var12;
                                L22: while (true) {
                                  if (var22 >= var13) {
                                    var21 = var21 + param0[4].field_y;
                                    continue L21;
                                  } else {
                                    param0[4].c(var22, var21);
                                    var22 = var22 + param0[4].field_w;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackIn_74_0 = (RuntimeException) (var6);

            stackIn_74_1 = new StringBuilder().append("nj.F(");

            if (param0 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L23;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L23;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final static void a(int param0, int param1, int param2) {
        int var3 = 93 / ((-77 - param2) / 47);
        nn.field_c = param1;
        cd.field_e = param0;
    }

    final static boolean a(int param0, int param1, byte[] param2, int[][] param3) {
        int var4_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (param1 > 122) {
              if (param3 != null) {
                var4_int = 0;
                L1: while (true) {
                  if (param3.length <= var4_int) {
                    stackIn_19_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var5 = param3[var4_int];
                    var6 = 0;
                    L2: while (true) {
                      if (var5.length <= var6) {
                        stackIn_16_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        L3: {
                          L4: {
                            var7 = var5[var6];
                            var8 = var5[var6 - -1];
                            if (var7 != -1) {
                              if (var8 == (255 & param2[var7])) {
                                break L3;
                              } else {
                                break L4;
                              }
                            } else {
                              if (var8 != param0) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var4_int++;
                          continue L1;
                        }
                        var6 += 2;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("nj.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final static int b(int param0, int param1, int param2) {
        if (param2 == -21223) {
          if ((param0 ^ -1) > -3) {
            if (-6 >= (param1 ^ -1)) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        } else {
          return -99;
        }
    }

    final static java.awt.Frame a(int param0, sj param1, int param2, boolean param3, int param4, int param5) {
        Object stackIn_10_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dj[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        sj var10 = null;
        dj[] var11 = null;
        le var12 = null;
        var9 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                var10 = (sj) null;
                nj.a(-1, (sj) null, -62, true, 71, -112);
                break L1;
              }
            }
            if (param1.a((byte) 126)) {
              L2: {
                if (param5 == 0) {
                  var11 = s.a((byte) -112, param1);
                  var6 = var11;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L3: while (true) {
                      if (var11.length <= var8) {
                        if (var7_int != 0) {
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        if (var11[var8].field_f == param2) {
                          if (var11[var8].field_i == param0) {
                            L4: {
                              L5: {
                                if (0 == param4) {
                                  break L5;
                                } else {
                                  if (var11[var8].field_k == param4) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L6: {
                                if (var7_int == 0) {
                                  break L6;
                                } else {
                                  if (param5 < var11[var8].field_d) {
                                    break L6;
                                  } else {
                                    var8++;
                                    continue L3;
                                  }
                                }
                              }
                              param5 = var11[var8].field_d;
                              var7_int = 1;
                              break L4;
                            }
                            var8++;
                            continue L3;
                          } else {
                            var8++;
                            continue L3;
                          }
                        } else {
                          var8++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    stackIn_10_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
              var12 = param1.a(param0, param2, param4, param5, (byte) 85);
              L7: while (true) {
                if (var12.field_f != 0) {
                  var7 = (java.awt.Frame) (var12.field_e);
                  if (var7 != null) {
                    if ((var12.field_f ^ -1) == -3) {
                      og.a(var7, param1, 24442);
                      stackIn_38_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackIn_34_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  cf.a(-89, 10L);
                  continue L7;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6_ref = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var6_ref);

            stackIn_41_1 = new StringBuilder().append("nj.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L8;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_10_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_34_0);
          } else {
            return (java.awt.Frame) ((Object) stackIn_38_0);
          }
        }
    }

    final static int a(int param0) {
        if (param0 != -21055) {
            return -11;
        }
        return ti.field_e;
    }

    static {
        field_c = 255;
    }
}
