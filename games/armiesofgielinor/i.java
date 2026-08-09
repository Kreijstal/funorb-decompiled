/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
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
                        stackIn_9_0 = param0[3].field_A;
                        break L2;
                      } else {
                        stackIn_9_0 = 0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_9_0;
                      if (null != param0[5]) {
                        stackIn_12_0 = param0[5].field_A;
                        break L3;
                      } else {
                        stackIn_12_0 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_12_0;
                      if (param0[1] != null) {
                        stackIn_15_0 = param0[1].field_x;
                        break L4;
                      } else {
                        stackIn_15_0 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_15_0;
                      if (null != param0[7]) {
                        stackIn_18_0 = param0[7].field_x;
                        break L5;
                      } else {
                        stackIn_18_0 = 0;
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
                        if (-1 == (param0[1].field_A ^ -1)) {
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
                        if (-1 == (param0[5].field_x ^ -1)) {
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
                      L22: {
                        if (null == param0[4]) {
                          break L22;
                        } else {
                          if (-1 == (param0[4].field_A ^ -1)) {
                            break L22;
                          } else {
                            if (-1 != (param0[4].field_x ^ -1)) {
                              qn.b(var16, var18, var17, var19);
                              var20 = var14;
                              L23: while (true) {
                                if (var15 <= var20) {
                                  qn.a(pd.field_g);
                                  break L22;
                                } else {
                                  var21 = var12;
                                  L24: while (true) {
                                    if (var21 >= var13) {
                                      var20 = var20 + param0[4].field_x;
                                      continue L23;
                                    } else {
                                      param0[4].g(var21, var20);
                                      var21 = var21 + param0[4].field_A;
                                      continue L24;
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
                      break L21;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
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
          L25: {
            var6 = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var6);

            stackIn_73_1 = new StringBuilder().append("i.B(");

            if (param0 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L25;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L25;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    public static void m(int param0) {
        field_Nb = null;
        field_Ob = null;
        if (param0 < 60) {
            field_Lb = (kl) null;
        }
        field_Lb = null;
    }

    private final int a(je param0, int param1, je param2, int param3, String param4, int param5) {
        je var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = new je(0L, param0, 0, param1, param3, param5, param4);
            param2.a(var7, 87);
            param1 += 32;
            stackIn_1_0 = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7_ref);

            stackIn_4_1 = new StringBuilder().append("i.G(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param5 + ')');
        }
        return stackIn_1_0;
    }

    final boolean l(int param0) {
        int discarded$0 = 0;
        if (!(1 == (this.field_Kb ^ -1))) {
            return false;
        }
        if (-14 == (rs.field_q ^ -1)) {
            this.field_Kb = -1;
        }
        if (param0 != 18585) {
            String var3 = (String) null;
            discarded$0 = this.a((je) null, 77, (je) null, -9, (String) null, 124);
            return true;
        }
        return true;
    }

    final int a(boolean param0, byte param1) {
        fp stackIn_6_0 = null;
        fp stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        je stackIn_14_0 = null;
        je stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.a(true, param0);
          var3 = 80 / ((param1 - -36) / 58);
          if (this.field_Rb == null) {
            break L0;
          } else {
            L1: {
              this.field_Rb.field_X = this.field_Jb.toString();
              this.field_Rb.field_S = (this.field_gb - this.field_Rb.field_Z.a(this.field_Rb.field_X)) / 2;
              this.field_Rb.field_gb = -this.field_Rb.field_S + this.field_gb;
              if (null != this.field_Qb) {
                if (0 == this.field_Qb.field_yb) {
                  break L1;
                } else {
                  L2: {
                    stackIn_6_0 = this.field_Qb;

                    if (this.field_Qb.field_rb) {
                      stackIn_7_0 = (fp) ((Object) stackIn_6_0);
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = (fp) ((Object) stackIn_6_0);
                      stackIn_7_1 = 1;
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
                if (null != this.field_Ub[var4]) {
                  L4: {
                    stackIn_14_0 = this.field_Ub[var4];

                    if (0 >= this.field_Jb.length()) {
                      stackIn_15_0 = (je) ((Object) stackIn_14_0);
                      stackIn_15_1 = 0;
                      break L4;
                    } else {
                      stackIn_15_0 = (je) ((Object) stackIn_14_0);
                      stackIn_15_1 = 1;
                      break L4;
                    }
                  }
                  stackIn_15_0.field_xb = stackIn_15_1 != 0;
                  if (this.field_Ub[var4].field_xb) {
                    if (this.field_Ub[var4].field_yb != 0) {
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
        if (this.field_Ib.field_yb != 0) {
          return -1;
        } else {
          L5: {
            if (!param0) {
              break L5;
            } else {
              if (0 == tr.field_A) {
                break L5;
              } else {
                if (this.field_yb != 0) {
                  break L5;
                } else {
                  return -1;
                }
              }
            }
          }
          return this.field_Kb;
        }
    }

    private final int a(int param0, int param1, je param2, je param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param4 += 8;
            var6_int = param3.field_Z.a(param3.field_X, -(param3.field_O * param1) + param0, param3.field_pb);
            param3.a(var6_int, -20500, param0, param4, 0);
            param4 = param4 + (var6_int - 0);
            param2.a(param3, 57);
            stackIn_1_0 = param4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6);

            stackIn_4_1 = new StringBuilder().append("i.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    final static void n(int param0) {
        int[] var2 = new int[3];
        int[] var1 = var2;
        var2[2] = 16777215;
        var2[0] = 1;
        var2[1] = param0;
        st.field_z = new hc(oh.field_J, ga.field_k, rs.field_n, var2, 0, 0);
    }

    final boolean o(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            this.field_Ub = (je[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_Qb) {
              break L2;
            } else {
              if (!this.field_Qb.field_rb) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final String k(int param0) {
        if (param0 != 1) {
            return (String) null;
        }
        return this.field_Jb.toString();
    }

    i(int param0, int param1, int param2, int param3, int param4, je param5, je param6, je param7, je param8, fp param9, je param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        Object stackIn_6_0;
        fp stackIn_6_1;
        fp stackIn_6_2;
        long stackIn_6_3;
        fp stackIn_6_4;
        Object stackIn_7_0;
        Object stackIn_8_0;
        fp stackIn_8_1;
        fp stackIn_8_2;
        long stackIn_8_3;
        fp stackIn_8_4;
        String stackIn_8_5;
        je stackIn_14_0 = null;
        je stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        je[] var15 = null;
        RuntimeException var15_ref = null;
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
        this.field_Kb = -2;
        try {
          L0: {
            L1: {
              this.field_Sb = param12;
              this.field_Mb = new je(0L, param6, ij.field_u.toUpperCase());
              this.field_Mb.field_Eb = 1;
              this.a(this.field_Mb, 69);
              this.field_Ib = new je(0L, param7);
              this.field_Mb.a(this.field_Ib, 126);
              this.field_Tb = new je(0L, (je) null);
              this.a(this.field_Tb, 106);
              if (param11 == null) {
                this.field_Vb = new je(0L, param8, ot.field_F);
                this.field_Vb.field_Eb = 1;
                this.field_Vb.field_N = 11184810;
                this.field_Tb.a(this.field_Vb, 43);
                var15_int = 226;
                var16 = 10;
                var17 = this.field_Vb.field_Z.c(this.field_Vb.field_X, var15_int);
                this.field_Vb.a(jn.field_d * var17, -20500, var15_int, var16, 13);
                var16 = var16 + jn.field_d * var17;
                this.field_Tb.a(var16 + 10, -20500, 13 + (var15_int + 13), 24, 0);
                this.field_Tb.field_G = tq.a(11579568, false, this.field_Tb.field_ob, 2105376, 3, 8421504);
                var18 = 13 + var15_int + 13;
                var19 = var16 + 34;
                var20 = jp.a(param0, param2, var18, -1);
                var21 = pd.a(var19, 0, param1, param3);
                this.a(var19, -20500, var18, var21, var20);
                break L1;
              } else {
                L2: {
                  L3: {
                    this.field_Vb = new je(0L, param8, ii.field_c);
                    this.field_Vb.field_Eb = 1;
                    this.field_Vb.field_N = 11184810;
                    this.field_Tb.a(this.field_Vb, 116);
                    this.field_Pb = new je(0L, param8, mk.field_d);
                    this.field_Pb.field_Eb = 1;
                    this.field_Pb.field_N = 11184810;
                    this.field_Tb.a(this.field_Pb, 119);
                    this.field_Rb = new je(0L, param8);
                    this.field_Rb.field_N = 16764006;
                    this.field_Tb.a(this.field_Rb, 63);
                    this.field_Rb.field_I = "|";
                    if ((tf.field_l ^ -1) <= -6) {
                      break L3;
                    } else {
                      if (hi.field_j < 2) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      stackIn_6_0 = this;

                      stackIn_6_1 = null;

                      stackIn_6_2 = null;

                      stackIn_6_3 = 0L;

                      stackIn_6_4 = (fp) (param9);

                      if ((tf.field_l ^ -1) <= -8) {
                        break L5;
                      } else {
                        stackIn_7_0 = this;
                        stackIn_6_0 = stackIn_7_0;

                        if (-3 < (hi.field_j ^ -1)) {
                          stackIn_8_0 = this;
                          stackIn_8_1 = null;
                          stackIn_8_2 = null;
                          stackIn_8_3 = stackIn_6_3;
                          stackIn_8_4 = (fp) ((Object) stackIn_6_4);
                          stackIn_8_5 = jq.field_E;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_3 = stackIn_6_3;
                    stackIn_8_4 = (fp) ((Object) stackIn_6_4);
                    stackIn_8_5 = ua.field_v;
                    break L4;
                  }
                  ((i) (this)).field_Qb = new fp(stackIn_8_3, stackIn_8_4, stackIn_8_5);
                  this.field_Tb.a(this.field_Qb, 65);
                  break L2;
                }
                var28 = new je[3];
                var15 = var28;
                var28[0] = new je(0L, (je) null);
                this.field_Tb.a(var28[0], 100);
                var28[1] = new je(0L, (je) null);
                this.field_Tb.a(var28[1], 65);
                var28[2] = new je(0L, (je) null);
                this.field_Tb.a(var28[2], 111);
                this.field_Ub = new je[cq.field_F];
                var16 = 0;
                L6: while (true) {
                  if (var16 >= cq.field_F) {
                    L7: {
                      this.field_Jb = new StringBuilder(12);
                      if (param11 == null) {
                        break L7;
                      } else {
                        discarded$0 = this.field_Jb.append(param11);
                        break L7;
                      }
                    }
                    L8: {
                      var16 = 0;
                      var17 = param6.field_Z.a(is.field_g);
                      if (var17 <= var16) {
                        break L8;
                      } else {
                        var16 = var17;
                        break L8;
                      }
                    }
                    L9: {
                      var17 = param6.field_Z.a(ua.field_y);
                      if (var17 <= var16) {
                        break L9;
                      } else {
                        var16 = var17;
                        break L9;
                      }
                    }
                    L10: {
                      var17 = param6.field_Z.a(op.field_d);
                      if (var17 <= var16) {
                        break L10;
                      } else {
                        var16 = var17;
                        break L10;
                      }
                    }
                    var17 = 0;
                    L11: while (true) {
                      if (cq.field_F <= var17) {
                        L12: {
                          if (-141 <= (var16 ^ -1)) {
                            break L12;
                          } else {
                            var16 = 140;
                            break L12;
                          }
                        }
                        L13: {
                          var17 = 0;
                          var18 = 0;
                          var18 = 0;
                          var18 = this.a(param6, var18, var28[0], var16, is.field_g, 24);
                          var18 = this.a(var16, 2, var28[0], this.field_Ub[6], var18);
                          var18 = this.a(var16, 2, var28[0], this.field_Ub[9], var18);
                          var18 = this.a(var16, 2, var28[0], this.field_Ub[5], var18);
                          var18 = this.a(var16, 2, var28[0], this.field_Ub[7], var18);
                          var18 = this.a(var16, 2, var28[0], this.field_Ub[15], var18);
                          var18 = this.a(var16, 2, var28[0], this.field_Ub[4], var18);
                          if (var18 <= var17) {
                            break L13;
                          } else {
                            var17 = var18;
                            break L13;
                          }
                        }
                        L14: {
                          var18 = 0;
                          var18 = this.a(param6, var18, var28[1], var16, ua.field_y, 24);
                          var18 = this.a(var16, 2, var28[1], this.field_Ub[16], var18);
                          var18 = this.a(var16, 2, var28[1], this.field_Ub[17], var18);
                          var18 = this.a(var16, 2, var28[1], this.field_Ub[18], var18);
                          var18 = this.a(var16, 2, var28[1], this.field_Ub[19], var18);
                          var18 = this.a(var16, 2, var28[1], this.field_Ub[20], var18);
                          if (var18 <= var17) {
                            break L14;
                          } else {
                            var17 = var18;
                            break L14;
                          }
                        }
                        L15: {
                          var18 = 0;
                          var18 = this.a(param6, var18, var28[2], var16, op.field_d, 24);
                          var18 = this.a(var16, 2, var28[2], this.field_Ub[13], var18);
                          var18 = this.a(var16, 2, var28[2], this.field_Ub[21], var18);
                          var18 = this.a(var16, 2, var28[2], this.field_Ub[11], var18);
                          if (var17 >= var18) {
                            break L15;
                          } else {
                            var17 = var18;
                            break L15;
                          }
                        }
                        L16: {
                          var19 = 26 + var16 * 3;
                          var20 = this.field_Mb.j(116);
                          if (var19 >= var20) {
                            break L16;
                          } else {
                            var19 = var20;
                            break L16;
                          }
                        }
                        L17: {
                          if (null == this.field_Qb) {
                            break L17;
                          } else {
                            var20 = this.field_Qb.d(79, 4);
                            if (var19 >= var20) {
                              break L17;
                            } else {
                              var19 = var20;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          this.field_Mb.a(24, -20500, 13 + (var19 + 13), 0, 0);
                          this.field_Ib.a(15, -20500, 15, 5, -20 + this.field_Mb.field_gb);
                          var21 = 10;
                          this.field_Vb.a(jn.field_d * 2, -20500, var19, var21, 13);
                          var21 = var21 + jn.field_d * 2;
                          this.field_Pb.a(2 * jn.field_d, -20500, var19, var21, 13);
                          var21 = var21 + (10 + 2 * jn.field_d);
                          this.field_Rb.a(jn.field_d, -20500, 0, var21, 0);
                          var21 = var21 + (10 + jn.field_d);
                          if (null == this.field_Qb) {
                            break L18;
                          } else {
                            var20 = this.field_Qb.d(93, 4);
                            this.field_Qb.a((byte) 120, var21, 4, jn.field_d, 13 - -((-var20 + var19) / 2), var20);
                            var21 = var21 + (10 + jn.field_d);
                            break L18;
                          }
                        }
                        var28[0].a(var17, -20500, var16, var21, 13);
                        var28[1].a(var17, -20500, var16, var21, 26 - -var16);
                        var28[2].a(var17, -20500, var16, var21, 26 + (2 * var16 + 13));
                        var22 = var21;
                        this.field_Tb.a(10 + var17 + var22, -20500, var19 + 13 + 13, 24, 0);
                        this.field_Tb.field_G = tq.a(11579568, false, this.field_Tb.field_ob, 2105376, 3, 8421504);
                        var23 = var19 + 26;
                        var24 = 10 + (var17 + (var22 + 24));
                        var25 = jp.a(param0, param2, var23, -1);
                        var26 = pd.a(var24, 0, param1, param3);
                        this.a(var24, -20500, var23, var26, var25);
                        break L1;
                      } else {
                        L19: {
                          if (this.field_Ub[var17] == null) {
                            break L19;
                          } else {
                            var18 = this.field_Ub[var17].j(92);
                            if (var16 >= var18) {
                              break L19;
                            } else {
                              var16 = var18;
                              break L19;
                            }
                          }
                        }
                        var17++;
                        continue L11;
                      }
                    }
                  } else {
                    L20: {
                      if (ef.field_d[var16] == null) {
                        break L20;
                      } else {
                        L21: {
                          this.field_Ub[var16] = new je(0L, param10, ef.field_d[var16]);
                          this.field_Ub[var16].field_Eb = 0;
                          stackIn_14_0 = this.field_Ub[var16];

                          if (param11 == null) {
                            stackIn_15_0 = (je) ((Object) stackIn_14_0);
                            stackIn_15_1 = 0;
                            break L21;
                          } else {
                            stackIn_15_0 = (je) ((Object) stackIn_14_0);
                            stackIn_15_1 = 1;
                            break L21;
                          }
                        }
                        stackIn_15_0.field_xb = stackIn_15_1 != 0;
                        this.field_Tb.a(this.field_Ub[var16], 75);
                        break L20;
                      }
                    }
                    var16++;
                    continue L6;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var15_ref = decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var15_ref);

            stackIn_51_1 = new StringBuilder().append("i.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L22;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_54_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');

            if (param6 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L23;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L23;
            }
          }
          L24: {


            stackIn_57_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');

            if (param7 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L24;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L24;
            }
          }
          L25: {


            stackIn_60_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');

            if (param8 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L25;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L25;
            }
          }
          L26: {


            stackIn_63_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');

            if (param9 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L26;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L26;
            }
          }
          L27: {


            stackIn_66_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');

            if (param10 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L27;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_69_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');

            if (param11 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L28;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L28;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_52_0), stackIn_70_2 + ',' + param12 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        cd.a(108, param2, param1, 2);
        if (param0) {
            wk[] var4 = (wk[]) null;
            i.a((wk[]) null, -22, 63, (byte) 45, 53, 9);
        }
    }

    static {
        field_Ob = "<%0> is already on your friend list.";
        field_Nb = ce.a(-30);
    }
}
