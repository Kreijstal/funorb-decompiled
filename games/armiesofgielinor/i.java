/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class i extends je {
    private fp field_Qb;
    private je field_Ib;
    long field_Sb;
    static kl field_Lb;
    private je field_Vb;
    private StringBuilder field_Jb;
    static int[] field_Nb;
    private je field_Tb;
    private je[] field_Ub;
    private je field_Mb;
    private int field_Kb;
    static String field_Ob;
    private je field_Rb;
    private je field_Pb;

    final static void a(wk[] param0, int param1, int param2, byte param3, int param4, int param5) {
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var22 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (0 >= param5) {
                  break L1;
                } else {
                  if (0 < param1) {
                    L2: {
                      if (param0[3] != null) {
                        stackOut_8_0 = param0[3].field_A;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_9_0;
                      if (null != param0[5]) {
                        stackOut_11_0 = param0[5].field_A;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_12_0 = stackOut_10_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_12_0;
                      if (param0[1] != null) {
                        stackOut_14_0 = param0[1].field_x;
                        stackIn_15_0 = stackOut_14_0;
                        break L4;
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_15_0 = stackOut_13_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_15_0;
                      if (null != param0[7]) {
                        stackOut_17_0 = param0[7].field_x;
                        stackIn_18_0 = stackOut_17_0;
                        break L5;
                      } else {
                        stackOut_16_0 = 0;
                        stackIn_18_0 = stackOut_16_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_18_0;
                      if (param3 == -47) {
                        break L6;
                      } else {
                        i.a(true, -79, -40);
                        break L6;
                      }
                    }
                    L7: {
                      var10 = param5 + param2;
                      var11 = param1 + param4;
                      var12 = var6_int + param2;
                      var13 = var10 + -var7;
                      var14 = param4 + var8;
                      var15 = var11 + -var9;
                      var16 = var12;
                      var17 = var13;
                      if (var17 >= var16) {
                        break L7;
                      } else {
                        var17 = param2 + var6_int * param5 / (var6_int + var7);
                        var16 = param2 + var6_int * param5 / (var6_int + var7);
                        break L7;
                      }
                    }
                    L8: {
                      var18 = var14;
                      var19 = var15;
                      if (var19 < var18) {
                        var19 = param4 + var8 * param1 / (var9 + var8);
                        var18 = param4 + var8 * param1 / (var9 + var8);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      qn.b(pd.field_g);
                      if (null == param0[0]) {
                        break L9;
                      } else {
                        qn.b(param2, param4, var16, var18);
                        param0[0].g(param2, param4);
                        qn.a(pd.field_g);
                        break L9;
                      }
                    }
                    L10: {
                      if (param0[2] != null) {
                        qn.b(var17, param4, var10, var18);
                        param0[2].g(var13, param4);
                        qn.a(pd.field_g);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param0[6] == null) {
                        break L11;
                      } else {
                        qn.b(param2, var19, var16, var11);
                        param0[6].g(param2, var15);
                        qn.a(pd.field_g);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param0[8]) {
                        break L12;
                      } else {
                        qn.b(var17, var19, var10, var11);
                        param0[8].g(var13, var15);
                        qn.a(pd.field_g);
                        break L12;
                      }
                    }
                    L13: {
                      if (param0[1] == null) {
                        break L13;
                      } else {
                        if (param0[1].field_A == 0) {
                          break L13;
                        } else {
                          qn.b(var16, param4, var17, var18);
                          var20 = var12;
                          L14: while (true) {
                            if (var20 >= var13) {
                              qn.a(pd.field_g);
                              break L13;
                            } else {
                              param0[1].g(var20, param4);
                              var20 = var20 + param0[1].field_A;
                              continue L14;
                            }
                          }
                        }
                      }
                    }
                    L15: {
                      if (null == param0[7]) {
                        break L15;
                      } else {
                        if (0 != param0[7].field_A) {
                          qn.b(var16, var19, var17, var11);
                          var20 = var12;
                          L16: while (true) {
                            if (var13 <= var20) {
                              qn.a(pd.field_g);
                              break L15;
                            } else {
                              param0[7].g(var20, var15);
                              var20 = var20 + param0[7].field_A;
                              continue L16;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      if (null == param0[3]) {
                        break L17;
                      } else {
                        if (0 == param0[3].field_x) {
                          break L17;
                        } else {
                          qn.b(param2, var18, var16, var19);
                          var20 = var14;
                          L18: while (true) {
                            if (var15 <= var20) {
                              qn.a(pd.field_g);
                              break L17;
                            } else {
                              param0[3].g(param2, var20);
                              var20 = var20 + param0[3].field_x;
                              continue L18;
                            }
                          }
                        }
                      }
                    }
                    L19: {
                      if (null == param0[5]) {
                        break L19;
                      } else {
                        if (param0[5].field_x == 0) {
                          break L19;
                        } else {
                          qn.b(var17, var18, var10, var19);
                          var20 = var14;
                          L20: while (true) {
                            if (var15 <= var20) {
                              qn.a(pd.field_g);
                              break L19;
                            } else {
                              param0[5].g(var13, var20);
                              var20 = var20 + param0[5].field_x;
                              continue L20;
                            }
                          }
                        }
                      }
                    }
                    L21: {
                      if (null == param0[4]) {
                        break L21;
                      } else {
                        if (-1 == param0[4].field_A) {
                          break L21;
                        } else {
                          if (-1 != param0[4].field_x) {
                            qn.b(var16, var18, var17, var19);
                            var20 = var14;
                            L22: while (true) {
                              if (var15 <= var20) {
                                qn.a(pd.field_g);
                                break L21;
                              } else {
                                var21 = var12;
                                L23: while (true) {
                                  if (var21 >= var13) {
                                    var20 = var20 + param0[4].field_x;
                                    continue L22;
                                  } else {
                                    param0[4].g(var21, var20);
                                    var21 = var21 + param0[4].field_A;
                                    continue L23;
                                  }
                                }
                              }
                            }
                          } else {
                            break L21;
                          }
                        }
                      }
                    }
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var6;
            stackOut_71_1 = new StringBuilder().append("i.B(");
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L24;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L24;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void m(int param0) {
        field_Nb = null;
        field_Ob = null;
        field_Lb = null;
    }

    private final int a(je param0, int param1, je param2, int param3, String param4, int param5) {
        je var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var7 = new je(0L, param0, 0, param1, param3, param5, param4);
            param2.a(var7, 87);
            param1 += 32;
            stackOut_0_0 = param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7_ref;
            stackOut_2_1 = new StringBuilder().append("i.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param5 + 41);
        }
        return stackIn_1_0;
    }

    final boolean l(int param0) {
        if (!(((i) this).field_Kb == -2)) {
            return false;
        }
        if (rs.field_q == 13) {
            ((i) this).field_Kb = -1;
        }
        if (param0 != 18585) {
            Object var3 = null;
            int discarded$0 = this.a((je) null, 77, (je) null, -9, (String) null, 124);
            return true;
        }
        return true;
    }

    final int a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        fp stackIn_5_0 = null;
        fp stackIn_6_0 = null;
        fp stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        je stackIn_13_0 = null;
        je stackIn_14_0 = null;
        je stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        fp stackOut_4_0 = null;
        fp stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        fp stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        je stackOut_12_0 = null;
        je stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        je stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          ((i) this).a(true, param0);
          var3 = 80 / ((param1 - -36) / 58);
          if (((i) this).field_Rb == null) {
            break L0;
          } else {
            L1: {
              ((i) this).field_Rb.field_X = ((i) this).field_Jb.toString();
              ((i) this).field_Rb.field_S = (((i) this).field_gb - ((i) this).field_Rb.field_Z.a(((i) this).field_Rb.field_X)) / 2;
              ((i) this).field_Rb.field_gb = -((i) this).field_Rb.field_S + ((i) this).field_gb;
              if (null != ((i) this).field_Qb) {
                if (0 == ((i) this).field_Qb.field_yb) {
                  break L1;
                } else {
                  L2: {
                    stackOut_4_0 = ((i) this).field_Qb;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (((i) this).field_Qb.field_rb) {
                      stackOut_6_0 = (fp) (Object) stackIn_6_0;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = (fp) (Object) stackIn_5_0;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  stackIn_7_0.field_rb = stackIn_7_1 != 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var4 = 0;
            L3: while (true) {
              if (cq.field_F <= var4) {
                break L0;
              } else {
                if (null != ((i) this).field_Ub[var4]) {
                  L4: {
                    stackOut_12_0 = ((i) this).field_Ub[var4];
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (0 >= ((i) this).field_Jb.length()) {
                      stackOut_14_0 = (je) (Object) stackIn_14_0;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L4;
                    } else {
                      stackOut_13_0 = (je) (Object) stackIn_13_0;
                      stackOut_13_1 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L4;
                    }
                  }
                  stackIn_15_0.field_xb = stackIn_15_1 != 0;
                  if (((i) this).field_Ub[var4].field_xb) {
                    if (((i) this).field_Ub[var4].field_yb != 0) {
                      return var4;
                    } else {
                      var4++;
                      continue L3;
                    }
                  } else {
                    var4++;
                    continue L3;
                  }
                } else {
                  var4++;
                  continue L3;
                }
              }
            }
          }
        }
        if (((i) this).field_Ib.field_yb != 0) {
          return -1;
        } else {
          L5: {
            if (!param0) {
              break L5;
            } else {
              if (0 == tr.field_A) {
                break L5;
              } else {
                if (((i) this).field_yb != 0) {
                  break L5;
                } else {
                  return -1;
                }
              }
            }
          }
          return ((i) this).field_Kb;
        }
    }

    private final int a(int param0, int param1, je param2, je param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            param4 += 8;
            var6_int = param3.field_Z.a(param3.field_X, -(param3.field_O * param1) + param0, param3.field_pb);
            param3.a(var6_int, -20500, param0, param4, 0);
            param4 = param4 + var6_int;
            param2.a(param3, 57);
            stackOut_0_0 = param4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("i.J(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param4 + 41);
        }
        return stackIn_1_0;
    }

    final static void n(int param0) {
        int[] var2 = new int[3];
        int[] var1 = var2;
        var2[2] = 16777215;
        var2[0] = 1;
        var2[1] = 14737632;
        st.field_z = new hc(oh.field_J, ga.field_k, rs.field_n, var2, 0, 0);
    }

    final boolean o(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            ((i) this).field_Ub = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((i) this).field_Qb) {
              break L2;
            } else {
              if (!((i) this).field_Qb.field_rb) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final String k(int param0) {
        if (param0 != 1) {
            return null;
        }
        return ((i) this).field_Jb.toString();
    }

    i(int param0, int param1, int param2, int param3, int param4, je param5, je param6, je param7, je param8, fp param9, je param10, String param11, long param12) {
        super(0L, param5);
        int var15_int = 0;
        je[] var15 = null;
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
        je[] var28 = null;
        Object stackIn_4_0 = null;
        fp stackIn_4_1 = null;
        fp stackIn_4_2 = null;
        long stackIn_4_3 = 0L;
        fp stackIn_4_4 = null;
        Object stackIn_5_0 = null;
        fp stackIn_5_1 = null;
        fp stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        fp stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        fp stackIn_6_1 = null;
        fp stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        fp stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        fp stackIn_7_1 = null;
        fp stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        fp stackIn_7_4 = null;
        String stackIn_7_5 = null;
        je stackIn_12_0 = null;
        je stackIn_13_0 = null;
        je stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackOut_3_0 = null;
        fp stackOut_3_1 = null;
        fp stackOut_3_2 = null;
        long stackOut_3_3 = 0L;
        fp stackOut_3_4 = null;
        Object stackOut_4_0 = null;
        fp stackOut_4_1 = null;
        fp stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        fp stackOut_4_4 = null;
        Object stackOut_6_0 = null;
        fp stackOut_6_1 = null;
        fp stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        fp stackOut_6_4 = null;
        String stackOut_6_5 = null;
        Object stackOut_5_0 = null;
        fp stackOut_5_1 = null;
        fp stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        fp stackOut_5_4 = null;
        String stackOut_5_5 = null;
        je stackOut_11_0 = null;
        je stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        je stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          ((i) this).field_Kb = -2;
          ((i) this).field_Sb = param12;
          ((i) this).field_Mb = new je(0L, param6, ij.field_u.toUpperCase());
          ((i) this).field_Mb.field_Eb = 1;
          ((i) this).a(((i) this).field_Mb, 69);
          ((i) this).field_Ib = new je(0L, param7);
          ((i) this).field_Mb.a(((i) this).field_Ib, 126);
          ((i) this).field_Tb = new je(0L, (je) null);
          ((i) this).a(((i) this).field_Tb, 106);
          if (param11 == null) {
            ((i) this).field_Vb = new je(0L, param8, ot.field_F);
            ((i) this).field_Vb.field_Eb = 1;
            ((i) this).field_Vb.field_N = 11184810;
            ((i) this).field_Tb.a(((i) this).field_Vb, 43);
            var15_int = 226;
            var16 = 10;
            var17 = ((i) this).field_Vb.field_Z.c(((i) this).field_Vb.field_X, var15_int);
            ((i) this).field_Vb.a(jn.field_d * var17, -20500, var15_int, var16, 13);
            var16 = var16 + jn.field_d * var17;
            ((i) this).field_Tb.a(var16 + 10, -20500, 13 + (var15_int + 13), 24, 0);
            ((i) this).field_Tb.field_G = tq.a(11579568, false, ((i) this).field_Tb.field_ob, 2105376, 3, 8421504);
            var18 = 13 + var15_int + 13;
            var19 = var16 + 34;
            var20 = jp.a(param0, param2, var18, -1);
            var21 = pd.a(var19, 0, param1, param3);
            ((i) this).a(var19, -20500, var18, var21, var20);
            break L0;
          } else {
            L1: {
              L2: {
                ((i) this).field_Vb = new je(0L, param8, ii.field_c);
                ((i) this).field_Vb.field_Eb = 1;
                ((i) this).field_Vb.field_N = 11184810;
                ((i) this).field_Tb.a(((i) this).field_Vb, 116);
                ((i) this).field_Pb = new je(0L, param8, mk.field_d);
                ((i) this).field_Pb.field_Eb = 1;
                ((i) this).field_Pb.field_N = 11184810;
                ((i) this).field_Tb.a(((i) this).field_Pb, 119);
                ((i) this).field_Rb = new je(0L, param8);
                ((i) this).field_Rb.field_N = 16764006;
                ((i) this).field_Tb.a(((i) this).field_Rb, 63);
                ((i) this).field_Rb.field_I = "|";
                if (tf.field_l >= 5) {
                  break L2;
                } else {
                  if (hi.field_j < 2) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  stackOut_3_0 = this;
                  stackOut_3_1 = null;
                  stackOut_3_2 = null;
                  stackOut_3_3 = 0L;
                  stackOut_3_4 = (fp) param9;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  stackIn_5_3 = stackOut_3_3;
                  stackIn_5_4 = stackOut_3_4;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  stackIn_4_4 = stackOut_3_4;
                  if (tf.field_l >= 7) {
                    break L4;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = null;
                    stackOut_4_2 = null;
                    stackOut_4_3 = stackIn_4_3;
                    stackOut_4_4 = (fp) (Object) stackIn_4_4;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    stackIn_6_3 = stackOut_4_3;
                    stackIn_6_4 = stackOut_4_4;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    stackIn_5_3 = stackOut_4_3;
                    stackIn_5_4 = stackOut_4_4;
                    if (hi.field_j < 2) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = null;
                      stackOut_6_2 = null;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = (fp) (Object) stackIn_6_4;
                      stackOut_6_5 = jq.field_E;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      stackIn_7_3 = stackOut_6_3;
                      stackIn_7_4 = stackOut_6_4;
                      stackIn_7_5 = stackOut_6_5;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_5_0 = this;
                stackOut_5_1 = null;
                stackOut_5_2 = null;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = (fp) (Object) stackIn_5_4;
                stackOut_5_5 = ua.field_v;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                stackIn_7_5 = stackOut_5_5;
                break L3;
              }
              ((i) this).field_Qb = new fp(stackIn_7_3, stackIn_7_4, stackIn_7_5);
              ((i) this).field_Tb.a((je) (Object) ((i) this).field_Qb, 65);
              break L1;
            }
            var28 = new je[3];
            var15 = var28;
            var28[0] = new je(0L, (je) null);
            ((i) this).field_Tb.a(var28[0], 100);
            var28[1] = new je(0L, (je) null);
            ((i) this).field_Tb.a(var28[1], 65);
            var28[2] = new je(0L, (je) null);
            ((i) this).field_Tb.a(var28[2], 111);
            ((i) this).field_Ub = new je[cq.field_F];
            var16 = 0;
            L5: while (true) {
              if (~var16 <= ~cq.field_F) {
                L6: {
                  ((i) this).field_Jb = new StringBuilder(12);
                  if (param11 == null) {
                    break L6;
                  } else {
                    StringBuilder discarded$1 = ((i) this).field_Jb.append(param11);
                    break L6;
                  }
                }
                L7: {
                  var16 = 0;
                  var17 = param6.field_Z.a(is.field_g);
                  if (var17 <= var16) {
                    break L7;
                  } else {
                    var16 = var17;
                    break L7;
                  }
                }
                L8: {
                  var17 = param6.field_Z.a(ua.field_y);
                  if (var17 <= var16) {
                    break L8;
                  } else {
                    var16 = var17;
                    break L8;
                  }
                }
                L9: {
                  var17 = param6.field_Z.a(op.field_d);
                  if (var17 <= var16) {
                    break L9;
                  } else {
                    var16 = var17;
                    break L9;
                  }
                }
                var17 = 0;
                L10: while (true) {
                  if (~cq.field_F >= ~var17) {
                    L11: {
                      if (var16 <= 140) {
                        break L11;
                      } else {
                        var16 = 140;
                        break L11;
                      }
                    }
                    L12: {
                      var17 = 0;
                      var18 = 0;
                      var18 = 0;
                      var18 = this.a(param6, var18, var28[0], var16, is.field_g, 24);
                      var18 = this.a(var16, 2, var28[0], ((i) this).field_Ub[6], var18);
                      var18 = this.a(var16, 2, var28[0], ((i) this).field_Ub[9], var18);
                      var18 = this.a(var16, 2, var28[0], ((i) this).field_Ub[5], var18);
                      var18 = this.a(var16, 2, var28[0], ((i) this).field_Ub[7], var18);
                      var18 = this.a(var16, 2, var28[0], ((i) this).field_Ub[15], var18);
                      var18 = this.a(var16, 2, var28[0], ((i) this).field_Ub[4], var18);
                      if (~var18 >= ~var17) {
                        break L12;
                      } else {
                        var17 = var18;
                        break L12;
                      }
                    }
                    L13: {
                      var18 = 0;
                      var18 = this.a(param6, var18, var28[1], var16, ua.field_y, 24);
                      var18 = this.a(var16, 2, var28[1], ((i) this).field_Ub[16], var18);
                      var18 = this.a(var16, 2, var28[1], ((i) this).field_Ub[17], var18);
                      var18 = this.a(var16, 2, var28[1], ((i) this).field_Ub[18], var18);
                      var18 = this.a(var16, 2, var28[1], ((i) this).field_Ub[19], var18);
                      var18 = this.a(var16, 2, var28[1], ((i) this).field_Ub[20], var18);
                      if (var18 <= var17) {
                        break L13;
                      } else {
                        var17 = var18;
                        break L13;
                      }
                    }
                    L14: {
                      var18 = 0;
                      var18 = this.a(param6, var18, var28[2], var16, op.field_d, 24);
                      var18 = this.a(var16, 2, var28[2], ((i) this).field_Ub[13], var18);
                      var18 = this.a(var16, 2, var28[2], ((i) this).field_Ub[21], var18);
                      var18 = this.a(var16, 2, var28[2], ((i) this).field_Ub[11], var18);
                      if (var17 >= var18) {
                        break L14;
                      } else {
                        var17 = var18;
                        break L14;
                      }
                    }
                    L15: {
                      var19 = 26 + var16 * 3;
                      var20 = ((i) this).field_Mb.j(116);
                      if (var19 >= var20) {
                        break L15;
                      } else {
                        var19 = var20;
                        break L15;
                      }
                    }
                    L16: {
                      if (null == ((i) this).field_Qb) {
                        break L16;
                      } else {
                        var20 = ((i) this).field_Qb.d(79, 4);
                        if (var19 >= var20) {
                          break L16;
                        } else {
                          var19 = var20;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      ((i) this).field_Mb.a(24, -20500, 13 + (var19 + 13), 0, 0);
                      ((i) this).field_Ib.a(15, -20500, 15, 5, -20 + ((i) this).field_Mb.field_gb);
                      var21 = 10;
                      ((i) this).field_Vb.a(jn.field_d * 2, -20500, var19, var21, 13);
                      var21 = var21 + jn.field_d * 2;
                      ((i) this).field_Pb.a(2 * jn.field_d, -20500, var19, var21, 13);
                      var21 = var21 + (10 + 2 * jn.field_d);
                      ((i) this).field_Rb.a(jn.field_d, -20500, 0, var21, 0);
                      var21 = var21 + (10 + jn.field_d);
                      if (null == ((i) this).field_Qb) {
                        break L17;
                      } else {
                        var20 = ((i) this).field_Qb.d(93, 4);
                        ((i) this).field_Qb.a((byte) 120, var21, 4, jn.field_d, 13 - -((-var20 + var19) / 2), var20);
                        var21 = var21 + (10 + jn.field_d);
                        break L17;
                      }
                    }
                    var28[0].a(var17, -20500, var16, var21, 13);
                    var28[1].a(var17, -20500, var16, var21, 26 - -var16);
                    var28[2].a(var17, -20500, var16, var21, 26 + (2 * var16 + 13));
                    var22 = var21;
                    ((i) this).field_Tb.a(10 + var17 + var22, -20500, var19 + 26, 24, 0);
                    ((i) this).field_Tb.field_G = tq.a(11579568, false, ((i) this).field_Tb.field_ob, 2105376, 3, 8421504);
                    var23 = var19 + 26;
                    var24 = 10 + (var17 + (var22 + 24));
                    var25 = jp.a(param0, param2, var23, -1);
                    var26 = pd.a(var24, 0, param1, param3);
                    ((i) this).a(var24, -20500, var23, var26, var25);
                    break L0;
                  } else {
                    L18: {
                      if (((i) this).field_Ub[var17] == null) {
                        break L18;
                      } else {
                        var18 = ((i) this).field_Ub[var17].j(92);
                        if (var16 >= var18) {
                          break L18;
                        } else {
                          var16 = var18;
                          break L18;
                        }
                      }
                    }
                    var17++;
                    continue L10;
                  }
                }
              } else {
                L19: {
                  if (ef.field_d[var16] == null) {
                    break L19;
                  } else {
                    L20: {
                      ((i) this).field_Ub[var16] = new je(0L, param10, ef.field_d[var16]);
                      ((i) this).field_Ub[var16].field_Eb = 0;
                      stackOut_11_0 = ((i) this).field_Ub[var16];
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (param11 == null) {
                        stackOut_13_0 = (je) (Object) stackIn_13_0;
                        stackOut_13_1 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L20;
                      } else {
                        stackOut_12_0 = (je) (Object) stackIn_12_0;
                        stackOut_12_1 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L20;
                      }
                    }
                    stackIn_14_0.field_xb = stackIn_14_1 != 0;
                    ((i) this).field_Tb.a(((i) this).field_Ub[var16], 75);
                    break L19;
                  }
                }
                var16++;
                continue L5;
              }
            }
          }
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        cd.a(108, param2, param1, 2);
        if (param0) {
            Object var4 = null;
            i.a((wk[]) null, -22, 63, (byte) 45, 53, 9);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ob = "<%0> is already on your friend list.";
        field_Nb = ce.a(-30);
    }
}
