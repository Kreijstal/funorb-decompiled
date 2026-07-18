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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 103)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param2 != 98) {
                var5_int = -36 / ((37 - param3) / 50);
                if (99 != param2) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((lb) this).b(param0, false);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = ((lb) this).a((byte) 114, param0);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("lb.V(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static String d() {
        if (ch.field_d == cf.field_b) {
          return mh.field_F;
        } else {
          if (ed.field_c == cf.field_b) {
            return pi.field_p;
          } else {
            if (!bb.field_a.a(0)) {
              return pi.field_p;
            } else {
              return bh.field_b;
            }
          }
        }
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((lb) this).field_F == param4) {
                je.a(-117);
                break L1;
              } else {
                if (((lb) this).field_G != param4) {
                  if (param4 == ((lb) this).field_B) {
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
                var8 = null;
                boolean discarded$1 = ((lb) this).a((we) null, '￙', -4, -125);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("lb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = param3 + ((lb) this).field_r;
        if (param0 != 30) {
          return;
        } else {
          var6 = ((lb) this).field_e - -param2;
          int discarded$2 = t.field_z.a(p.field_b, var5 - -20, 20 + var6, -40 + ((lb) this).field_l, ((lb) this).field_p - 50, 16777215, -1, 1, 0, t.field_z.field_C);
          super.a(param0, param1, param2, param3);
          return;
        }
    }

    public lb() {
        super(0, 0, 476, 225, (ml) null);
        ((lb) this).field_G = new t(oi.field_g, (of) null);
        ((lb) this).field_F = new t(aj.field_d, (of) null);
        ((lb) this).field_B = new t(oi.field_d, (of) null);
        hd var1 = new hd();
        ((lb) this).field_G.field_h = (ml) (Object) var1;
        ((lb) this).field_F.field_h = (ml) (Object) var1;
        ((lb) this).field_B.field_h = (ml) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        ((lb) this).field_F.a(30, 13361, -var3 + ((lb) this).field_l >> 1, var4, -var2 + (((lb) this).field_p - 48));
        ((lb) this).field_B.a(30, 13361, (-var3 + ((lb) this).field_l >> 1) + var4 - -var2, var4, -var2 + ((lb) this).field_p + -48);
        ((lb) this).field_G.a(30, 13361, ((lb) this).field_l - var3 >> 1, var3, ((lb) this).field_p - (78 - -(2 * var2)));
        ((lb) this).field_F.field_o = (of) this;
        ((lb) this).field_G.field_o = (of) this;
        ((lb) this).field_G.field_m = wd.field_s;
        ((lb) this).field_B.field_o = (of) this;
        ((lb) this).field_B.field_m = ca.field_n;
        ((lb) this).b((byte) -20, (we) (Object) ((lb) this).field_F);
        ((lb) this).b((byte) -119, (we) (Object) ((lb) this).field_G);
        ((lb) this).b((byte) -42, (we) (Object) ((lb) this).field_B);
    }

    public static void e() {
        field_H = null;
        field_A = null;
        field_C = null;
        field_E = null;
        int var1 = 1;
        field_D = null;
        field_I = null;
    }

    final static void b() {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
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
                return;
              } else {
                var3 = pf.a((byte) -103, 4);
                int discarded$4 = 96;
                int discarded$5 = 100;
                n.field_b[var2] = li.a(ke.field_h[var3 + 8]);
                na.a((byte) 42, n.field_b[var2]);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) (Object) runtimeException, "lb.G(" + false + ')');
        }
    }

    final static le[] a(boolean param0, String param1, ad param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        le[] stackIn_1_0 = null;
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
        le[] stackOut_0_0 = null;
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
            var4_int = param2.c(param1, (byte) -105);
            var5 = param2.a(param3, var4_int, -28459);
            stackOut_0_0 = wj.a((byte) 83, var5, param2, var4_int);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("lb.C(").append(false).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, byte param2, le[] param3, int param4, int param5) {
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
        int var23 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var23 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 == null) {
              return;
            } else {
              L1: {
                if (param1 <= 0) {
                  break L1;
                } else {
                  if (param5 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (null == param3[3]) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        break L2;
                      } else {
                        stackOut_9_0 = param3[3].field_m;
                        stackIn_11_0 = stackOut_9_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_11_0;
                      if (param3[5] == null) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = param3[5].field_m;
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_14_0;
                      if (null == param3[1]) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = param3[1].field_n;
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_17_0;
                      if (null != param3[7]) {
                        stackOut_19_0 = param3[7].field_n;
                        stackIn_20_0 = stackOut_19_0;
                        break L5;
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_20_0 = stackOut_18_0;
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
                        if (param3[1].field_m != 0) {
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
                        if (param3[3].field_n != 0) {
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
                        if (param3[5].field_n != 0) {
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
                      if (null == param3[4]) {
                        break L20;
                      } else {
                        if (param3[4].field_m == 0) {
                          break L20;
                        } else {
                          if (param3[4].field_n != 0) {
                            ge.c(var16, var18, var17, var20);
                            var21 = var14;
                            L21: while (true) {
                              if (var21 >= var15) {
                                ge.a(cg.field_d);
                                break L20;
                              } else {
                                var22 = var12;
                                L22: while (true) {
                                  if (var13 <= var22) {
                                    var21 = var21 + param3[4].field_n;
                                    continue L21;
                                  } else {
                                    param3[4].c(var22, var21);
                                    var22 = var22 + param3[4].field_m;
                                    continue L22;
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
                    break L0;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var6;
            stackOut_74_1 = new StringBuilder().append("lb.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param3 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L23;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L23;
            }
          }
          throw la.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new le(640, 480);
        field_A = "Press 'ENTER'";
        field_I = new te(6, 0, 4, 2);
        field_D = new int[10];
    }
}
