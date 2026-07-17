/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends ua implements sh, ql {
    private t field_z;
    static String field_E;
    cm field_H;
    static pj field_C;
    private qc field_G;
    static cc field_A;
    private t field_D;

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param3 == 7) {
              L1: {
                L2: {
                  if (((eb) this).field_z == param4) {
                    break L2;
                  } else {
                    if (param4 == ((eb) this).field_D) {
                      this.b(true);
                      if (!MonkeyPuzzle2.field_F) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                je.a(53);
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("eb.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
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
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    private final boolean l(int param0) {
        if (!this.a(0, (ag) (Object) ((eb) this).field_G)) {
            return false;
        }
        if (param0 > -34) {
            return false;
        }
        return true;
    }

    private final boolean a(int param0, ag param1) {
        kf var3 = null;
        RuntimeException var3_ref = null;
        na var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var3 = param1.a(param0 + 7);
            if (var3 == null) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param0 == 0) {
                L1: {
                  var4 = var3.b(false);
                  if (wj.field_i != var4) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("eb.J(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final void a(we param0, int param1, int param2, byte param3) {
        try {
            super.a(param0, param1, param2, (byte) -15);
            if (param3 > -13) {
                Object var6 = null;
                ((eb) this).a((we) null, -102, 77, (byte) -19);
            }
            ((eb) this).field_D.field_w = this.l(-110);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "eb.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final void a(String param0, int param1) {
        qc var3 = null;
        String var4 = null;
        try {
            var3 = ((eb) this).field_G;
            if (param1 > -50) {
                eb.m(-107);
            }
            var4 = param0;
            ((rj) (Object) var3).a(false, -5905, var4);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "eb.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ge.a(param0, param4, param3 + 1, 10000536);
              ge.a(param0, param4 - -param2, param3 + 1, 12105912);
              if (param1 == 0) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            L2: {
              var5_int = 1;
              if (param4 - -var5_int < ge.field_f) {
                var5_int = -param4 + ge.field_f;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var6 = param2;
              if (var6 + param4 > ge.field_k) {
                var6 = ge.field_k + -param4;
                break L3;
              } else {
                break L3;
              }
            }
            var7 = var5_int;
            L4: while (true) {
              if (var7 >= var6) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var8 = 152 - -(48 * var7 / param2);
                var9 = var8 | (var8 << 16 | var8 << 8);
                ge.field_i[ge.field_h * (param4 - -var7) - -param0] = var9;
                ge.field_i[(param4 - -var7) * ge.field_h - (-param0 + -param3)] = var9;
                var7++;
                if (var10 != 0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var5, "eb.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void d(byte param0) {
        RuntimeException var1 = null;
        ki var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_ref = (ki) (Object) ok.field_a.a((byte) -117);
              if (param0 == -93) {
                break L1;
              } else {
                field_A = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var1_ref == null) {
                  break L3;
                } else {
                  if (var9 != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackOut_5_0 = var1_ref.field_F;
                    stackOut_5_1 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    L4: while (true) {
                      L5: {
                        if (stackIn_6_0 <= stackIn_6_1) {
                          break L5;
                        } else {
                          var1_ref.field_t = hd.field_u;
                          var2 = 0;
                          L6: while (true) {
                            stackOut_8_0 = var2;
                            stackOut_8_1 = var1_ref.field_m;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            L7: while (true) {
                              if (stackIn_9_0 >= stackIn_9_1) {
                                break L5;
                              } else {
                                var3 = var1_ref.field_o[var2].field_l;
                                stackOut_10_0 = var1_ref.field_l;
                                stackOut_10_1 = var3;
                                stackIn_6_0 = stackOut_10_0;
                                stackIn_6_1 = stackOut_10_1;
                                stackIn_11_0 = stackOut_10_0;
                                stackIn_11_1 = stackOut_10_1;
                                if (var9 != 0) {
                                  continue L4;
                                } else {
                                  L8: {
                                    if (stackIn_11_0 != stackIn_11_1) {
                                      if (var1_ref.field_p == var3) {
                                        stackOut_15_0 = 1;
                                        stackIn_17_0 = stackOut_15_0;
                                        break L8;
                                      } else {
                                        stackOut_14_0 = 0;
                                        stackIn_17_0 = stackOut_14_0;
                                        break L8;
                                      }
                                    } else {
                                      stackOut_12_0 = 1;
                                      stackIn_17_0 = stackOut_12_0;
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    var4 = stackIn_17_0;
                                    if (var4 != 0) {
                                      var5 = var2 - -1;
                                      L10: while (true) {
                                        if (var1_ref.field_m <= var5) {
                                          break L9;
                                        } else {
                                          var6 = var1_ref.field_o[var5].field_l;
                                          stackOut_21_0 = ~var6;
                                          stackOut_21_1 = ~var1_ref.field_l;
                                          stackIn_9_0 = stackOut_21_0;
                                          stackIn_9_1 = stackOut_21_1;
                                          stackIn_22_0 = stackOut_21_0;
                                          stackIn_22_1 = stackOut_21_1;
                                          if (var9 != 0) {
                                            continue L7;
                                          } else {
                                            L11: {
                                              if (stackIn_22_0 != stackIn_22_1) {
                                                if (var6 == var1_ref.field_p) {
                                                  stackOut_26_0 = 1;
                                                  stackIn_28_0 = stackOut_26_0;
                                                  break L11;
                                                } else {
                                                  stackOut_25_0 = 0;
                                                  stackIn_28_0 = stackOut_25_0;
                                                  break L11;
                                                }
                                              } else {
                                                stackOut_23_0 = 1;
                                                stackIn_28_0 = stackOut_23_0;
                                                break L11;
                                              }
                                            }
                                            L12: {
                                              var7 = stackIn_28_0;
                                              if (var4 != 0) {
                                                if (var7 != 0) {
                                                  stackOut_32_0 = 1;
                                                  stackIn_34_0 = stackOut_32_0;
                                                  break L12;
                                                } else {
                                                  stackOut_31_0 = 0;
                                                  stackIn_34_0 = stackOut_31_0;
                                                  break L12;
                                                }
                                              } else {
                                                stackOut_29_0 = 0;
                                                stackIn_34_0 = stackOut_29_0;
                                                break L12;
                                              }
                                            }
                                            L13: {
                                              var8 = stackIn_34_0;
                                              if (var8 == 0) {
                                                break L13;
                                              } else {
                                                var1_ref.field_o[var2].field_t = hd.field_u;
                                                var1_ref.field_o[var5].field_t = hd.field_u;
                                                break L13;
                                              }
                                            }
                                            var5++;
                                            if (var9 == 0) {
                                              continue L10;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L9;
                                    }
                                  }
                                  var2++;
                                  if (var9 == 0) {
                                    continue L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var1_ref = (ki) (Object) ok.field_a.d((byte) 63);
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "eb.S(" + param0 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public eb() {
        super(0, 0, 496, 0, (ml) null);
        ((eb) this).field_G = new qc("", (of) null, 12);
        a var1 = new a(pf.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, t.field_z.field_C, -1, 2147483647, true);
        we var2 = new we(vh.field_K, (ml) (Object) var1, (of) null);
        ((eb) this).field_D = new t(wi.field_a, (of) null);
        ((eb) this).field_z = new t(af.field_b, (of) null);
        ((eb) this).field_G.field_m = oa.field_E;
        ((eb) this).field_G.a((kf) (Object) new hh((rj) (Object) ((eb) this).field_G), true);
        ((eb) this).field_D.field_w = false;
        ((eb) this).field_D.field_h = (ml) (Object) new hd();
        ((eb) this).field_z.field_h = (ml) (Object) new lc();
        ((eb) this).field_G.field_h = (ml) (Object) new mg(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, 13361, 20, 270, var3);
        var3 += 50;
        ((eb) this).b((byte) -26, var2);
        var3 = var3 + (this.a(wj.field_l, (we) (Object) ((eb) this).field_G, var3, ke.field_e, 35, 170) + 5);
        ((eb) this).field_D.a(40, 13361, 496 - var5 >> 1, var5, var3);
        ((eb) this).field_z.a(40, 13361, var4 + 3, 60, 15 + var3);
        ((eb) this).field_z.field_o = (of) this;
        ((eb) this).field_D.field_o = (of) this;
        ((eb) this).b((byte) -102, (we) (Object) ((eb) this).field_D);
        ((eb) this).b((byte) -27, (we) (Object) ((eb) this).field_z);
        ((eb) this).field_H = new cm((sh) this);
        ((eb) this).field_H.a(150, 13361, 60 + (((eb) this).field_G.field_l + ((eb) this).field_G.field_r), -60 + (-((eb) this).field_G.field_l + ((eb) this).field_l) - ((eb) this).field_G.field_r, 20);
        ((eb) this).b((byte) -56, (we) (Object) ((eb) this).field_H);
        ((eb) this).a(var4 + (55 + var3), 13361, 0, 496, 0);
    }

    final static void m(int param0) {
        RuntimeException var1 = null;
        ki var1_ref = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        ki var4 = null;
        int var5_int = 0;
        il var5 = null;
        dl var6 = null;
        dl var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        ki var10_ref = null;
        int var11_int = 0;
        ki var11 = null;
        int var12 = 0;
        int var13_int = 0;
        ki var13 = null;
        ki var14 = null;
        ki var15 = null;
        int var16 = 0;
        Object var17 = null;
        ki var17_ref = null;
        ki var18 = null;
        ki var19 = null;
        Object stackIn_13_0 = null;
        ki stackIn_13_1 = null;
        pj stackIn_18_0 = null;
        pj stackIn_18_1 = null;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_78_0 = 0;
        pj stackIn_85_0 = null;
        pj stackIn_85_1 = null;
        ki stackIn_91_0 = null;
        ki stackIn_91_1 = null;
        ki stackIn_92_0 = null;
        ki stackIn_92_1 = null;
        ki stackIn_99_0 = null;
        ki stackIn_99_1 = null;
        boolean stackIn_109_0 = false;
        int stackIn_113_0 = 0;
        Object stackIn_126_0 = null;
        ki stackIn_126_1 = null;
        ki stackIn_129_0 = null;
        ki stackIn_129_1 = null;
        ki stackIn_136_0 = null;
        ki stackIn_136_1 = null;
        ki stackIn_143_0 = null;
        ki stackIn_143_1 = null;
        int stackIn_151_0 = 0;
        ki stackIn_159_0 = null;
        ki stackIn_165_0 = null;
        Object stackOut_12_0 = null;
        ki stackOut_12_1 = null;
        pj stackOut_17_0 = null;
        pj stackOut_17_1 = null;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_77_0 = 0;
        pj stackOut_84_0 = null;
        pj stackOut_84_1 = null;
        ki stackOut_90_0 = null;
        ki stackOut_90_1 = null;
        ki stackOut_91_0 = null;
        ki stackOut_91_1 = null;
        ki stackOut_98_0 = null;
        ki stackOut_98_1 = null;
        boolean stackOut_108_0 = false;
        int stackOut_112_0 = 0;
        Object stackOut_125_0 = null;
        ki stackOut_125_1 = null;
        ki stackOut_128_0 = null;
        ki stackOut_128_1 = null;
        ki stackOut_135_0 = null;
        ki stackOut_135_1 = null;
        ki stackOut_142_0 = null;
        ki stackOut_142_1 = null;
        int stackOut_150_0 = 0;
        ki stackOut_158_0 = null;
        ki stackOut_164_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = null;
                    var10 = null;
                    var16 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_ref = (ki) (Object) hd.field_u.a((byte) -117);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var1_ref == null) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var1_ref.field_t == ok.field_a) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (ri.field_b == var1_ref.field_t) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var1_ref.c(-19822);
                        var1_ref.a(7847);
                        ri.field_b.a(-8212, (ug) (Object) var1_ref);
                        if (var16 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var1_ref.c((byte) -94);
                        var1_ref.field_D = 0.0f;
                        var1_ref.field_v = 0.0f;
                        var1_ref.c(-19822);
                        var1_ref.a(7847);
                        ok.field_a.a(-8212, (ug) (Object) var1_ref);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_ref.field_t = null;
                        var1_ref = (ki) (Object) hd.field_u.d((byte) 63);
                        if (var16 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1_int = 0;
                        var2 = 0;
                        if (param0 > 55) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        var3 = 0;
                        var4 = (ki) (Object) ok.field_a.a((byte) -117);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = null;
                        stackOut_12_1 = (ki) var4;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == (Object) (Object) stackIn_13_1) {
                            statePc = 173;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var16 != 0) {
                            statePc = 195;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var4.field_t != null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4.c(-19822);
                        var4.a(7847);
                        var4.g(120);
                        stackOut_17_0 = var4.field_t;
                        stackOut_17_1 = hd.field_u;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 == stackIn_18_1) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (ri.field_b != var4.field_t) {
                            statePc = 171;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ri.field_b.a(-8212, (ug) (Object) var4);
                        if (var16 == 0) {
                            statePc = 171;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var1_int = 1;
                        if (var4.field_A) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var3++;
                        var4.field_A = true;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var4.field_w != 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var2 = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (5 == var4.field_w) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var5_int = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var4.field_m <= var5_int) {
                            statePc = 36;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = var4.field_o[var5_int].field_w;
                        stackOut_30_1 = 4;
                        stackIn_37_0 = stackOut_30_0;
                        stackIn_37_1 = stackOut_30_1;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        if (var16 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 != stackIn_31_1) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4.field_o[var5_int].field_t = hd.field_u;
                        lc.field_f = true;
                        if (!var4.field_o[var5_int].field_A) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4.field_o[var5_int].field_A = true;
                        var3++;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5_int++;
                        if (var16 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = var4.field_w;
                        stackOut_36_1 = 4;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 == stackIn_37_1) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var5_int = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (~var5_int <= ~var4.field_m) {
                            statePc = 49;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = 1;
                        stackOut_41_1 = var4.field_o[var5_int].field_w;
                        stackIn_51_0 = stackOut_41_0;
                        stackIn_51_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (var16 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 == stackIn_42_1) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (6 == var4.field_o[var5_int].field_w) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var4.field_o[var5_int].field_t = hd.field_u;
                        lc.field_f = true;
                        if (!var4.field_o[var5_int].field_A) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var4.field_o[var5_int].field_A = true;
                        var3++;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var5_int++;
                        if (var16 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var5_int = 0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = ~var5_int;
                        stackOut_50_1 = ~var4.field_m;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 <= stackIn_51_1) {
                            statePc = 150;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var6 = new dl();
                        var7 = new dl();
                        var6.a(-106, (bf) (Object) var4.field_o[var5_int]);
                        var8 = 1;
                        stackOut_52_0 = 1;
                        stackIn_151_0 = stackOut_52_0;
                        stackIn_53_0 = stackOut_52_0;
                        if (var16 != 0) {
                            statePc = 151;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var9 = stackIn_53_0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var17_ref = (ki) (Object) var6.a((byte) -120);
                        var18 = var17_ref;
                        if (var18 != null) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var16 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var16 == 0) {
                            statePc = 104;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var18.field_q > var4.field_q) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var18.field_w == 4) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackOut_60_0 = 1;
                        stackIn_62_0 = stackOut_60_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = 0;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var11_int = stackIn_62_0;
                        if (var18.field_w != 0) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (hd.field_u != var18.field_t) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var18.field_w == 5) {
                            statePc = 69;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (4 != var18.field_w) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var4.field_w == 5) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackOut_69_0 = 1;
                        stackIn_71_0 = stackOut_69_0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackOut_70_0 = 0;
                        stackIn_71_0 = stackOut_70_0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var12 = stackIn_71_0;
                        if (var11_int != 0) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var12 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var8 = 0;
                        if (var9 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var12 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackOut_76_0 = 1;
                        stackIn_78_0 = stackOut_76_0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackOut_77_0 = 0;
                        stackIn_78_0 = stackOut_77_0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var9 = stackIn_78_0;
                        if (var16 == 0) {
                            statePc = 104;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (1 == var18.field_w) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var18.field_w == 6) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var7.a(-122, (bf) (Object) var18);
                        var13_int = 0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var13_int >= var18.field_m) {
                            statePc = 103;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var19 = var17_ref.field_o[var13_int];
                        stackOut_84_0 = hd.field_u;
                        stackOut_84_1 = var19.field_t;
                        stackIn_18_0 = stackOut_84_0;
                        stackIn_18_1 = stackOut_84_1;
                        stackIn_85_0 = stackOut_84_0;
                        stackIn_85_1 = stackOut_84_1;
                        if (var16 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (stackIn_85_0 != stackIn_85_1) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (var16 == 0) {
                            statePc = 102;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var15 = (ki) (Object) var7.a(true);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (var15 == null) {
                            statePc = 96;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackOut_90_0 = (ki) var19;
                        stackOut_90_1 = (ki) var15;
                        stackIn_91_0 = stackOut_90_0;
                        stackIn_91_1 = stackOut_90_1;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = (ki) (Object) stackIn_91_0;
                        stackOut_91_1 = (ki) (Object) stackIn_91_1;
                        stackIn_99_0 = stackOut_91_0;
                        stackIn_99_1 = stackOut_91_1;
                        stackIn_92_0 = stackOut_91_0;
                        stackIn_92_1 = stackOut_91_1;
                        if (var16 != 0) {
                            statePc = 99;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (stackIn_92_0 != stackIn_92_1) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (var16 == 0) {
                            statePc = 102;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var15 = (ki) (Object) var7.c((byte) -75);
                        if (var16 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var15 = (ki) (Object) var6.a(true);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var15 == null) {
                            statePc = 101;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        stackOut_98_0 = (ki) var19;
                        stackOut_98_1 = (ki) var15;
                        stackIn_91_0 = stackOut_98_0;
                        stackIn_91_1 = stackOut_98_1;
                        stackIn_99_0 = stackOut_98_0;
                        stackIn_99_1 = stackOut_98_1;
                        if (var16 != 0) {
                            statePc = 91;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (stackIn_99_0 == stackIn_99_1) {
                            statePc = 102;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var15 = (ki) (Object) var6.c((byte) -75);
                        if (var16 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var6.a(-122, (bf) (Object) var19);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var13_int++;
                        if (var16 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (var16 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (var8 != 0) {
                            statePc = 106;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var10_ref = (ki) (Object) var7.a((byte) -120);
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (var10_ref == null) {
                            statePc = 112;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackOut_108_0 = var10_ref.field_A;
                        stackIn_113_0 = stackOut_108_0 ? 1 : 0;
                        stackIn_109_0 = stackOut_108_0;
                        if (var16 != 0) {
                            statePc = 113;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (stackIn_109_0) {
                            statePc = 111;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var3++;
                        var10_ref.field_A = true;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var10_ref.field_t = hd.field_u;
                        var10_ref = (ki) (Object) var7.a((byte) -120);
                        if (var16 == 0) {
                            statePc = 107;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackOut_112_0 = var9;
                        stackIn_113_0 = stackOut_112_0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (stackIn_113_0 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var7.c(32);
                        var6.a(-124, (bf) (Object) var4.field_o[var5_int]);
                        var10_ref = var4.field_o[var5_int];
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var11 = (ki) (Object) var6.a((byte) -120);
                        if (var11 != null) {
                            statePc = 119;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (var16 != 0) {
                            statePc = 120;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (var16 == 0) {
                            statePc = 148;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var7.a(-119, (bf) (Object) var11);
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (var10_ref.field_q > var11.field_q) {
                            statePc = 122;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var10_ref = var11;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var12 = 0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (var12 >= var11.field_m) {
                            statePc = 147;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var13 = var11.field_o[var12];
                        stackOut_125_0 = null;
                        stackOut_125_1 = (ki) var13;
                        stackIn_13_0 = stackOut_125_0;
                        stackIn_13_1 = stackOut_125_1;
                        stackIn_126_0 = stackOut_125_0;
                        stackIn_126_1 = stackOut_125_1;
                        if (var16 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (stackIn_126_0 == (Object) (Object) stackIn_126_1) {
                            statePc = 128;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        gl.a((Object[]) (Object) var11.field_o, var12 - -1, (Object[]) (Object) var11.field_o, var12, -var12 + var11.field_m);
                        var12--;
                        stackOut_128_0 = (ki) var11;
                        stackOut_128_1 = (ki) var11;
                        stackIn_129_0 = stackOut_128_0;
                        stackIn_129_1 = stackOut_128_1;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackIn_129_0.field_m = stackIn_129_1.field_m - 1;
                        if (var16 == 0) {
                            statePc = 146;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (hd.field_u != var13.field_t) {
                            statePc = 133;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (var16 == 0) {
                            statePc = 146;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var14 = (ki) (Object) var7.a(true);
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (var14 == null) {
                            statePc = 140;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        stackOut_135_0 = (ki) var14;
                        stackOut_135_1 = (ki) var13;
                        stackIn_129_0 = stackOut_135_0;
                        stackIn_129_1 = stackOut_135_1;
                        stackIn_136_0 = stackOut_135_0;
                        stackIn_136_1 = stackOut_135_1;
                        if (var16 != 0) {
                            statePc = 129;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (stackIn_136_0 != stackIn_136_1) {
                            statePc = 139;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (var16 == 0) {
                            statePc = 146;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var14 = (ki) (Object) var7.c((byte) -75);
                        if (var16 == 0) {
                            statePc = 134;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var14 = (ki) (Object) var6.a(true);
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (var14 == null) {
                            statePc = 145;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        stackOut_142_0 = (ki) var13;
                        stackOut_142_1 = (ki) var14;
                        stackIn_129_0 = stackOut_142_0;
                        stackIn_129_1 = stackOut_142_1;
                        stackIn_143_0 = stackOut_142_0;
                        stackIn_143_1 = stackOut_142_1;
                        if (var16 != 0) {
                            statePc = 129;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (stackIn_143_0 == stackIn_143_1) {
                            statePc = 146;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        var14 = (ki) (Object) var6.c((byte) -75);
                        if (var16 == 0) {
                            statePc = 141;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        var6.a(-107, (bf) (Object) var13);
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        var12++;
                        if (var16 == 0) {
                            statePc = 124;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (var16 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var10_ref.field_x = true;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        var5_int++;
                        if (var16 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        stackOut_150_0 = 0;
                        stackIn_151_0 = stackOut_150_0;
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        var5_int = stackIn_151_0;
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        if (~var4.field_m >= ~var5_int) {
                            statePc = 156;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        var4.field_o[var5_int].a(true, var4);
                        var5_int++;
                        if (var16 != 0) {
                            statePc = 171;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (var16 == 0) {
                            statePc = 152;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        var5 = (il) (Object) rf.field_a.a((byte) -117);
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (var5 == null) {
                            statePc = 164;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        stackOut_158_0 = var5.field_j;
                        stackIn_165_0 = stackOut_158_0;
                        stackIn_159_0 = stackOut_158_0;
                        if (var16 != 0) {
                            statePc = 165;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        if (stackIn_159_0 == var4) {
                            statePc = 162;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if (var4 != var5.field_i) {
                            statePc = 163;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        var5.c(-19822);
                        aj.field_b.a(-8212, (ug) (Object) var5);
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        var5 = (il) (Object) rf.field_a.d((byte) 63);
                        if (var16 == 0) {
                            statePc = 157;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        var4.field_E = true;
                        var4.field_m = 0;
                        hd.field_u.a(-8212, (ug) (Object) var4);
                        stackOut_164_0 = (ki) var4;
                        stackIn_165_0 = stackOut_164_0;
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        stackIn_165_0.field_v = -1.0f + (float)(2.0 * Math.random());
                        if (0.009999999776482582f <= Math.abs(var4.field_v)) {
                            statePc = 167;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        var4.field_v = -1.0f;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        var4.field_D = 10.0f;
                        if (var4.field_w == 0) {
                            statePc = 170;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        ua.i(83);
                        if (var16 == 0) {
                            statePc = 171;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        var4.field_n = 1;
                        gb.field_o = gb.field_o - 1;
                        ob.b((byte) -19);
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        var4.field_t = null;
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        var4 = (ki) (Object) ok.field_a.d((byte) 63);
                        if (var16 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        if (var1_int == 0) {
                            statePc = 195;
                        } else {
                            statePc = 174;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        ke.field_c = var3;
                        if (var2 == 0) {
                            statePc = 182;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        dc.field_e = dc.field_e + 1;
                        ek.field_b = 0;
                        if (var3 <= 10) {
                            statePc = 177;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        e.a(248, (byte) 40, 7);
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        if (15 >= var3) {
                            statePc = 179;
                        } else {
                            statePc = 178;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        e.a(247, (byte) 40, 8);
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (var3 <= 20) {
                            statePc = 185;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        e.a(246, (byte) 40, 9);
                        if (var16 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        dc.field_e = 0;
                        ek.field_b = ek.field_b + 1;
                        if (var3 >= 30) {
                            statePc = 184;
                        } else {
                            statePc = 183;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        e.a(253, (byte) 40, 2);
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if (4 > dc.field_e) {
                            statePc = 187;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        e.a(252, (byte) 40, 3);
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        if (dc.field_e < 5) {
                            statePc = 189;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        e.a(251, (byte) 40, 4);
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        if (dc.field_e >= 6) {
                            statePc = 191;
                        } else {
                            statePc = 190;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        e.a(250, (byte) 40, 5);
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        if (ek.field_b >= 50) {
                            statePc = 194;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        e.a(249, (byte) 40, 6);
                        if (var16 == 0) {
                            statePc = 199;
                        } else {
                            statePc = 195;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        if (!ub.field_a) {
                            statePc = 199;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        dc.field_e = 0;
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 198: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw la.a((Throwable) (Object) var1, "eb.G(" + param0 + 41);
                }
                case 199: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(boolean param0) {
        if (!this.l(-60)) {
            return;
        }
        sg.a(((eb) this).field_G.field_s, (byte) -120);
    }

    public static void k(int param0) {
        field_A = null;
        field_C = null;
        field_E = null;
        if (param0 > -42) {
            field_C = null;
        }
    }

    private final int a(String param0, we param1, int param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == 35) {
                break L1;
              } else {
                ((eb) this).field_D = null;
                break L1;
              }
            }
            stackOut_2_0 = this.a(param1, param0, 35, 170, 120, param3, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("eb.K(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param4 + 44 + 170 + 41);
        }
        return stackIn_3_0;
    }

    private final int a(we param0, String param1, int param2, int param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        vg var9 = null;
        mh var10 = null;
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
            var10 = new mh(20, param6, param4 + param3, 25, param0, false, 120, 3, t.field_z, 16777215, param5);
            ((eb) this).b((byte) -111, (we) (Object) var10);
            var9 = new vg(((ag) (Object) param0).a(param4 ^ 88), param1, 126, var10.field_p + param6, 25 + param3, param2);
            var9.field_o = (of) this;
            ((eb) this).b((byte) -95, (we) (Object) var9);
            stackOut_0_0 = var9.field_p + var10.field_p;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("eb.U(");
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
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
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param6 + 41);
        }
        return stackIn_1_0;
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 110)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param2 == 98) {
                stackOut_6_0 = ((eb) this).a((byte) 85, param0);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param2 == 99) {
                  stackOut_10_0 = ((eb) this).b(param0, false);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  var5_int = -120 % ((37 - param3) / 50);
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("eb.V(");
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
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_13_0 != 0;
    }

    public final void a(int param0) {
        ((hh) (Object) ((eb) this).field_G.a(-125)).f((byte) -88);
        if (param0 != 200) {
            eb.m(63);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "This password contains repeated characters, and would be easy to guess";
        field_C = new pj();
    }
}
