/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends ua implements ql {
    private t field_B;
    static le[] field_E;
    private t field_F;
    static int field_z;
    private t field_G;
    static le field_H;
    static te field_I;
    static String field_A;
    static pd field_C;
    static int[] field_D;

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 103)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param2 ^ -1) != -99) {
                var5_int = -36 / ((37 - param3) / 50);
                if (99 != param2) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.b(param0, false);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a((byte) 114, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("lb.V(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    final static String d(byte param0) {
        if (ch.field_d == cf.field_b) {
          return mh.field_F;
        } else {
          if (param0 == -56) {
            if (ed.field_c == cf.field_b) {
              return pi.field_p;
            } else {
              if (!bb.field_a.a(param0 + 56)) {
                return pi.field_p;
              } else {
                return bh.field_b;
              }
            }
          } else {
            return (String) null;
          }
        }
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        we var8 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_F == param4) {
                je.a(-117);
                break L1;
              } else {
                if (this.field_G != param4) {
                  if (param4 == this.field_B) {
                    il.a(true);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  dc.a(0);
                  break L1;
                }
              }
            }
            L2: {
              if (param3 == 7) {
                break L2;
              } else {
                var8 = (we) null;
                this.a((we) null, '￙', -4, -125);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("lb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        var5 = param3 + this.field_r;
        if (param0 != 30) {
          return;
        } else {
          var6 = this.field_e - -param2;
          t.field_z.a(p.field_b, var5 - -20, 20 + var6, -40 + this.field_l, this.field_p - 50, 16777215, -1, 1, 0, t.field_z.field_C);
          super.a(param0 + 0, param1, param2, param3);
          return;
        }
    }

    public lb() {
        super(0, 0, 476, 225, (ml) null);
        this.field_G = new t(oi.field_g, (of) null);
        this.field_F = new t(aj.field_d, (of) null);
        this.field_B = new t(oi.field_d, (of) null);
        hd var1 = new hd();
        this.field_G.field_h = (ml) ((Object) var1);
        this.field_F.field_h = (ml) ((Object) var1);
        this.field_B.field_h = (ml) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 912876193;
        this.field_F.a(30, 13361, -var3 + this.field_l >> -1607869439, var4, -var2 + (this.field_p - 48));
        this.field_B.a(30, 13361, (-var3 + this.field_l >> 1318501857) + var4 - -var2, var4, -var2 + this.field_p + -48);
        this.field_G.a(30, 13361, this.field_l - var3 >> -920203807, var3, this.field_p - (78 - -(2 * var2)));
        this.field_F.field_o = (of) (this);
        this.field_G.field_o = (of) (this);
        this.field_G.field_m = wd.field_s;
        this.field_B.field_o = (of) (this);
        this.field_B.field_m = ca.field_n;
        this.b((byte) -20, this.field_F);
        this.b((byte) -119, this.field_G);
        this.b((byte) -42, this.field_B);
    }

    public static void e(byte param0) {
        field_H = null;
        field_A = null;
        field_C = null;
        field_E = null;
        int var1 = 1 % ((param0 - -47) / 59);
        field_D = null;
        field_I = null;
    }

    final static void b(boolean param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = param0 ? 1 : 0;
            var2 = 0;
            L1: while (true) {
              L2: {
                if (n.field_a <= var2) {
                  break L2;
                } else {
                  L3: {
                    if (n.field_b[var2] == null) {
                      break L3;
                    } else {
                      if (n.field_b[var2].h()) {
                        break L3;
                      } else {
                        var2++;
                        continue L1;
                      }
                    }
                  }
                  var1_int = 1;
                  break L2;
                }
              }
              if (var1_int == 0) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var3 = pf.a((byte) -103, 4);
                n.field_b[var2] = li.a(ke.field_h[var3 + 8], 100, 96);
                na.a((byte) 42, n.field_b[var2]);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "lb.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static le[] a(boolean param0, String param1, ad param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        le[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2.c(param1, (byte) -105);
              var5 = param2.a(param3, var4_int, -28459);
              if (!param0) {
                break L1;
              } else {
                lb.e((byte) -92);
                break L1;
              }
            }
            stackIn_3_0 = wj.a((byte) 83, var5, param2, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("lb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, byte param2, le[] param3, int param4, int param5) {
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
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
        int var23 = 0;
        var23 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (-1 <= (param1 ^ -1)) {
                  break L1;
                } else {
                  if (param5 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (null == param3[3]) {
                        stackIn_11_0 = 0;
                        break L2;
                      } else {
                        stackIn_11_0 = param3[3].field_m;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_11_0;
                      if (param3[5] == null) {
                        stackIn_14_0 = 0;
                        break L3;
                      } else {
                        stackIn_14_0 = param3[5].field_m;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_14_0;
                      if (null == param3[1]) {
                        stackIn_17_0 = 0;
                        break L4;
                      } else {
                        stackIn_17_0 = param3[1].field_n;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_17_0;
                      if (null != param3[7]) {
                        stackIn_20_0 = param3[7].field_n;
                        break L5;
                      } else {
                        stackIn_20_0 = 0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_20_0;
                      var10 = param1 + param0;
                      var11 = param5 + param4;
                      var12 = param0 + var6_int;
                      var13 = -var7 + var10;
                      var14 = var8 + param4;
                      var15 = var11 + -var9;
                      var16 = var12;
                      var17 = var13;
                      if (var17 < var16) {
                        var17 = param0 + param1 * var6_int / (var6_int + var7);
                        var16 = param0 + param1 * var6_int / (var6_int + var7);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = 76 % ((param2 - -86) / 33);
                      var20 = var15;
                      if (var20 < var18) {
                        var20 = var8 * param5 / (var8 + var9) + param4;
                        var18 = var8 * param5 / (var8 + var9) + param4;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      ge.b(cg.field_d);
                      if (null == param3[0]) {
                        break L8;
                      } else {
                        ge.c(param0, param4, var16, var18);
                        param3[0].c(param0, param4);
                        ge.a(cg.field_d);
                        break L8;
                      }
                    }
                    L9: {
                      if (null == param3[2]) {
                        break L9;
                      } else {
                        ge.c(var17, param4, var10, var18);
                        param3[2].c(var13, param4);
                        ge.a(cg.field_d);
                        break L9;
                      }
                    }
                    L10: {
                      if (param3[6] != null) {
                        ge.c(param0, var20, var16, var11);
                        param3[6].c(param0, var15);
                        ge.a(cg.field_d);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param3[8] == null) {
                        break L11;
                      } else {
                        ge.c(var17, var20, var10, var11);
                        param3[8].c(var13, var15);
                        ge.a(cg.field_d);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param3[1]) {
                        break L12;
                      } else {
                        if (-1 != (param3[1].field_m ^ -1)) {
                          ge.c(var16, param4, var17, var18);
                          var21 = var12;
                          L13: while (true) {
                            if (var21 >= var13) {
                              ge.a(cg.field_d);
                              break L12;
                            } else {
                              param3[1].c(var21, param4);
                              var21 = var21 + param3[1].field_m;
                              continue L13;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (param3[7] == null) {
                        break L14;
                      } else {
                        if (0 == param3[7].field_m) {
                          break L14;
                        } else {
                          ge.c(var16, var20, var17, var11);
                          var21 = var12;
                          L15: while (true) {
                            if (var13 <= var21) {
                              ge.a(cg.field_d);
                              break L14;
                            } else {
                              param3[7].c(var21, var15);
                              var21 = var21 + param3[7].field_m;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      if (null == param3[3]) {
                        break L16;
                      } else {
                        if (-1 != (param3[3].field_n ^ -1)) {
                          ge.c(param0, var18, var16, var20);
                          var21 = var14;
                          L17: while (true) {
                            if (var15 <= var21) {
                              ge.a(cg.field_d);
                              break L16;
                            } else {
                              param3[3].c(param0, var21);
                              var21 = var21 + param3[3].field_n;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (null == param3[5]) {
                        break L18;
                      } else {
                        if (-1 != (param3[5].field_n ^ -1)) {
                          ge.c(var17, var18, var10, var20);
                          var21 = var14;
                          L19: while (true) {
                            if (var15 <= var21) {
                              ge.a(cg.field_d);
                              break L18;
                            } else {
                              param3[5].c(var13, var21);
                              var21 = var21 + param3[5].field_n;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      L21: {
                        if (null == param3[4]) {
                          break L21;
                        } else {
                          if (param3[4].field_m == 0) {
                            break L21;
                          } else {
                            if (-1 != (param3[4].field_n ^ -1)) {
                              ge.c(var16, var18, var17, var20);
                              var21 = var14;
                              L22: while (true) {
                                if (var21 >= var15) {
                                  ge.a(cg.field_d);
                                  break L21;
                                } else {
                                  var22 = var12;
                                  L23: while (true) {
                                    if (var13 <= var22) {
                                      var21 = var21 + param3[4].field_n;
                                      continue L22;
                                    } else {
                                      param3[4].c(var22, var21);
                                      var22 = var22 + param3[4].field_m;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      break L20;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackIn_76_0 = (RuntimeException) (var6);

            stackIn_76_1 = new StringBuilder().append("lb.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L24;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L24;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param4 + ',' + param5 + ')');
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

    static {
        field_H = new le(640, 480);
        field_A = "Press 'ENTER'";
        field_I = new te(6, 0, 4, 2);
        field_D = new int[10];
    }
}
