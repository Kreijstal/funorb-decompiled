/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo extends nv {
    private int field_n;
    private int field_q;
    private boolean field_s;
    private int field_u;
    private hj field_t;
    private int field_o;
    private boolean field_r;
    private boolean field_p;

    final static jea b(int param0) {
        if (param0 > -31) {
            jea discarded$0 = mo.b(47);
        }
        return dn.field_b.field_tb;
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            return -114;
        }
        return param0;
    }

    final void a(int param0, boolean param1) {
        if (param0 != 16) {
            int discarded$0 = ((mo) this).a(-128, 105);
        }
        ((mo) this).field_p = param1 ? true : false;
    }

    final void k(int param0) {
        if (param0 != 5418) {
            int discarded$0 = ((mo) this).a(true);
        }
    }

    final void a(ffa param0, byte param1, gma param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        la var7_ref_la = null;
        int var7 = 0;
        tqa var8_ref_tqa = null;
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
        Object var18 = null;
        hca var19 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var18 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            super.a(param0, (byte) 54, param2, param3);
            if (param3 != 1) {
              return;
            } else {
              if (!(param2 instanceof hca)) {
                if (((mo) this).field_n != 0) {
                  var5_int = param2.d(3);
                  var6 = param2.e(9648);
                  var7 = param2.c(-93);
                  var8 = param2.a((byte) 55);
                  var9 = var5_int + -(var7 / 2) + -((mo) this).field_g.r((byte) -95) + -((mo) this).field_o;
                  var10 = var6 - var8 / 2 + (-((mo) this).field_g.Q(2) + -((mo) this).field_q);
                  var11 = var9 + (var7 - 1);
                  var12 = var10 + var8 + -1;
                  var9 = var9 / ((mo) this).field_u;
                  var11 = var11 / ((mo) this).field_u;
                  var12 = var12 / ((mo) this).field_u;
                  var10 = var10 / ((mo) this).field_u;
                  if (param1 > 18) {
                    var13 = param2.b(-124);
                    var15 = var9;
                    L1: while (true) {
                      if (var11 < var15) {
                        break L0;
                      } else {
                        var16 = var10;
                        L2: while (true) {
                          if (var16 > var12) {
                            var15++;
                            continue L1;
                          } else {
                            L3: {
                              if (((mo) this).field_t.a(var15, var16, (byte) -128)) {
                                var14 = ((mo) this).field_t.b((byte) -5, var16, var15);
                                if (-1 != var14) {
                                  if (((mo) this).field_r) {
                                    L4: {
                                      var14 = var14 + var13;
                                      if (var14 >= ((mo) this).field_n) {
                                        var14 = -1;
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    ((mo) this).field_t.a(var16, var14, 0, var15);
                                    break L3;
                                  } else {
                                    L5: {
                                      if (((mo) this).field_n > var13) {
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    var16++;
                                    continue L2;
                                  }
                                } else {
                                  break L3;
                                }
                              } else {
                                break L3;
                              }
                            }
                            var16++;
                            continue L2;
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
              } else {
                L6: {
                  var5_int = param2.d(3);
                  var6 = param2.e(9648);
                  var7_ref_la = ((mo) this).b(true);
                  var8_ref_tqa = var7_ref_la.f((byte) 93);
                  var9 = var8_ref_tqa.a(var5_int, false);
                  var10 = var8_ref_tqa.a(var6, false);
                  var11 = var6 % ((mo) this).field_u;
                  var12 = var5_int % ((mo) this).field_u;
                  var13 = ((mo) this).field_u / 2;
                  if (var11 <= var13) {
                    break L6;
                  } else {
                    if (var8_ref_tqa.a(79, var9, 1 + var10).a(-111, new int[2])) {
                      break L6;
                    } else {
                      return;
                    }
                  }
                }
                L7: {
                  if (var11 >= var13) {
                    break L7;
                  } else {
                    if (!var8_ref_tqa.a(74, var9, var10 - 1).a(-126, new int[2])) {
                      return;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var12 >= var13) {
                    break L8;
                  } else {
                    if (var8_ref_tqa.a(-108, var9 + -1, var10).a(-117, new int[2])) {
                      break L8;
                    } else {
                      return;
                    }
                  }
                }
                L9: {
                  if (var12 <= var13) {
                    break L9;
                  } else {
                    if (!var8_ref_tqa.a(-112, var9 + 1, var10).a(-111, new int[2])) {
                      return;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  var19 = (hca) (Object) param2;
                  if (((mo) this).field_s) {
                    var19.a(10, (byte) -19);
                    break L10;
                  } else {
                    if (((mo) this).field_p) {
                      var19.a(4, (byte) -18, 6);
                      break L10;
                    } else {
                      var19.a(4, (byte) 102, 5);
                      break L10;
                    }
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var5;
            stackOut_49_1 = new StringBuilder().append("mo.SB(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L11;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L11;
            }
          }
          L12: {
            stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(44).append(param1).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param2 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L12;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L12;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param3 + 41);
        }
    }

    mo(la param0, boolean param1) {
        super(param0, param1);
        ((mo) this).field_u = jm.field_l;
        ((mo) this).field_n = 0;
        ((mo) this).field_p = false;
        ((mo) this).field_s = false;
        ((mo) this).field_r = false;
        try {
            ((mo) this).field_u = jm.field_l;
            this.c(0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mo.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(boolean param0, fsa param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            super.a(param0, param1);
            ((mo) this).field_g.b((byte) -102, 4);
            ((mo) this).field_g.a(true, (byte) -25, 0);
            ((mo) this).field_g.a((byte) -114, true, 1);
            ((mo) this).field_g.b((byte) 17, param0);
            var3_int = ((mo) this).field_g.c(-56) / ((mo) this).field_u;
            var4 = ((mo) this).field_g.a((byte) 55) / ((mo) this).field_u;
            ((mo) this).field_t = new hj(var3_int, var4, 0);
            ((mo) this).field_o = (((mo) this).field_g.c(-92) + -(((mo) this).field_t.field_f * ((mo) this).field_u)) / 2;
            ((mo) this).field_q = (((mo) this).field_g.a((byte) 55) + -(((mo) this).field_t.field_a * ((mo) this).field_u)) / 2;
            ((mo) this).field_g.f((byte) -93).a(1, -1, ((mo) this).field_g.d(3), ((mo) this).field_g.e(9648), ((mo) this).field_g.c(-27), ((mo) this).field_g.a((byte) 55), 123);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("mo.Q(").append(param0).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    final int a(int param0, int param1, int param2, int param3, byte param4, int param5) {
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
        var16 = TombRacer.field_G ? 1 : 0;
        if (0 != param3) {
          return 0;
        } else {
          if (!io.a(((mo) this).field_u * ((mo) this).field_t.field_f, param2, (byte) -115, ((mo) this).field_u * ((mo) this).field_t.field_a, param5, ((mo) this).field_g.e(9648), param1, param0, ((mo) this).field_g.d(3))) {
            return 0;
          } else {
            L0: {
              var7 = 0;
              var8 = ((mo) this).field_g.r((byte) -95) - -((mo) this).field_o;
              if (param4 >= 79) {
                break L0;
              } else {
                int discarded$1 = ((mo) this).a(false);
                break L0;
              }
            }
            var9 = ((mo) this).field_g.Q(2) - -((mo) this).field_q;
            var10 = -(param0 / 2) - (var8 - param5);
            var11 = param2 - param1 / 2 - var9;
            var12 = -1 + (param0 + var10);
            var13 = var11 - (-param1 - -1);
            var10 = var10 / ((mo) this).field_u;
            var11 = var11 / ((mo) this).field_u;
            var13 = var13 / ((mo) this).field_u;
            var12 = var12 / ((mo) this).field_u;
            var14 = var10;
            L1: while (true) {
              if (var12 < var14) {
                return var7;
              } else {
                var15 = var11;
                L2: while (true) {
                  if (var15 > var13) {
                    var14++;
                    continue L1;
                  } else {
                    if (((mo) this).field_t.a(var14, var15, (byte) -128)) {
                      if (((mo) this).field_t.b((byte) -5, var15, var14) != -1) {
                        var7 = var7 + foa.a(param1, param5, var15 * ((mo) this).field_u + (((mo) this).field_u / 2 + var9), param2, ((mo) this).field_u, (byte) 75, param0, ((mo) this).field_u, 16, var8 - (-(((mo) this).field_u / 2) - ((mo) this).field_u * var14));
                        var15++;
                        continue L2;
                      } else {
                        var15++;
                        continue L2;
                      }
                    } else {
                      var15++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        }
    }

    mo(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        ((mo) this).field_u = jm.field_l;
        ((mo) this).field_n = 0;
        ((mo) this).field_p = false;
        ((mo) this).field_s = false;
        ((mo) this).field_r = false;
        try {
          L0: {
            L1: {
              ((mo) this).field_n = param1.b((byte) 44, 8);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (1 != param1.b((byte) 44, 1)) {
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
              ((mo) this).field_r = stackIn_4_1 != 0;
              if (param0.field_E < 4) {
                ((mo) this).field_u = jm.field_l;
                break L2;
              } else {
                ((mo) this).field_u = param1.b((byte) 44, 10) << 16;
                break L2;
              }
            }
            L3: {
              if (-12 >= param0.field_E) {
                L4: {
                  stackOut_9_0 = this;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (-2 != param1.b((byte) 44, 1)) {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L4;
                  } else {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L4;
                  }
                }
                ((mo) this).field_s = stackIn_12_1 != 0;
                this.c(0);
                break L3;
              } else {
                this.c(0);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("mo.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 41);
        }
    }

    final int a(boolean param0) {
        if (param0) {
            ((mo) this).field_t = null;
        }
        return 8;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) 71, ((mo) this).field_n, 8);
            param1.a((byte) 34, ((mo) this).field_r ? 1 : 0, 1);
            param1.a((byte) 69, ((mo) this).field_u >> 16, 10);
            param1.a((byte) -128, !((mo) this).field_s ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mo.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void c(int param0) {
        if (!(!((mo) this).field_s)) {
            ((mo) this).field_n = 0;
        }
        if (!(dsa.field_b <= ((mo) this).field_u)) {
            ((mo) this).field_u = dsa.field_b;
        }
    }

    static {
    }
}
