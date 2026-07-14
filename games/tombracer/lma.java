/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lma extends dg {
    private int field_A;
    private int field_v;
    private int field_y;
    private boolean field_z;
    private int field_q;
    private int field_m;
    private int field_w;
    private boolean field_s;
    private fla field_o;
    private boolean field_n;
    static jea field_r;
    private boolean field_p;
    private int field_u;
    private boolean field_t;
    private fh[][] field_x;

    final void a(gr param0, gma param1, byte param2) {
        super.a(param0, param1, param2);
    }

    final int m(byte param0) {
        if (param0 > -63) {
            ((lma) this).field_q = 91;
        }
        if (this.k(10)) {
            return -1;
        }
        return 0;
    }

    private final int b(fh param0, byte param1) {
        if (-1 != ((lma) this).field_y) {
            return 0;
        }
        if (-1 != param0.field_a) {
            if (-4 != (param0.field_a ^ -1)) {
                if ((param0.field_a ^ -1) != -5) {
                    return 0;
                }
            }
        }
        if (param1 != -94) {
            Object var4 = null;
            ((lma) this).a((byte) -105, 15, (uw) null);
        }
        return ((lma) this).a(40).e(true).a(100, 0);
    }

    lma(int param0) {
        super(param0);
        ((lma) this).field_p = true;
    }

    final void d(int param0) {
        fsa var3 = null;
        int var4 = 0;
        Object var5 = null;
        w var6 = null;
        L0: {
          super.d(param0 ^ 0);
          if (param0 == -1) {
            break L0;
          } else {
            var5 = null;
            int discarded$35 = this.b((fh) null, (byte) 19);
            break L0;
          }
        }
        var6 = (w) (Object) ((lma) this).a(param0 + 58).field_G;
        if (var6 != null) {
          L1: {
            if (((lma) this).field_h instanceof fsa) {
              L2: {
                L3: {
                  var3 = (fsa) (Object) ((lma) this).field_h;
                  var4 = var3.d(param0 + 51, false) ? 1 : 0;
                  if (((lma) this).field_o != null) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      ((lma) this).field_o = var6.a(new fm(17, ((lma) this).b((byte) -105), ((lma) this).c((byte) 94), ((lma) this).e((byte) -114)), -58);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((lma) this).field_o == null) {
                  break L2;
                } else {
                  if (var4 == 0) {
                    fla discarded$36 = var6.a(new fm(18, ((lma) this).b((byte) 101), ((lma) this).c((byte) 109), ((lma) this).e((byte) -89)), -58);
                    ((lma) this).field_o.a(14, var6);
                    ((lma) this).field_o = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (((lma) this).field_o != null) {
                ((lma) this).field_o.a(((lma) this).b((byte) -93), var6.field_c, -128, var6.field_h, ((lma) this).c((byte) 110));
                break L1;
              } else {
                break L1;
              }
            } else {
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    final int f(byte param0) {
        if (this.k(10)) {
            return -1;
        }
        int var2 = 116 % ((param0 - 15) / 45);
        return 0;
    }

    final ka a(fh param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param1 == 76) {
            break L0;
          } else {
            var6 = null;
            int discarded$1 = this.b((fh) null, (byte) -30);
            break L0;
          }
        }
        L1: {
          if (((lma) this).field_y == 0) {
            L2: {
              var4 = param0.field_a;
              if (var4 != 0) {
                if ((var4 ^ -1) == -2) {
                  var3 = 4;
                  break L1;
                } else {
                  if (2 != var4) {
                    if (var4 != -4) {
                      if (-5 != var4) {
                        if (5 != var4) {
                          if (var4 != -7) {
                            if (var4 != 7) {
                              if (var4 == 8) {
                                var3 = 19;
                                break L1;
                              } else {
                                if (var4 != 9) {
                                  if (-11 != var4) {
                                    if (11 == var4) {
                                      var3 = 12;
                                      break L1;
                                    } else {
                                      if (-13 == (var4 ^ -1)) {
                                        var3 = 13;
                                        break L1;
                                      } else {
                                        break L2;
                                      }
                                    }
                                  } else {
                                    var3 = 16;
                                    break L1;
                                  }
                                } else {
                                  var3 = 18;
                                  break L1;
                                }
                              }
                            } else {
                              var3 = 17;
                              break L1;
                            }
                          } else {
                            var3 = 15;
                            break L1;
                          }
                        } else {
                          var3 = 14;
                          break L1;
                        }
                      } else {
                        var3 = 10;
                        break L1;
                      }
                    } else {
                      var3 = 8;
                      break L1;
                    }
                  } else {
                    var3 = 6;
                    break L1;
                  }
                }
              } else {
                break L2;
              }
            }
            if (75 > param0.field_d) {
              var3 = 0;
              break L1;
            } else {
              var3 = 2;
              break L1;
            }
          } else {
            var3 = 8;
            break L1;
          }
        }
        return ta.field_ub[param0.field_p + var3];
    }

    final void a(uw param0, int param1) {
        super.a(param0, 115);
        if (param1 <= 82) {
            boolean discarded$0 = ((lma) this).o((byte) 33);
        }
        ((lma) this).field_x = null;
    }

    private final int a(int param0, int param1, int param2, fh param3) {
        if ((param3.field_a ^ -1) != param2) {
            if (1 != param3.field_a) {
                if (param3.field_a != 2) {
                    return 0;
                }
            }
        }
        return (param0 / 2097152 + param1 / 2097152) % 2;
    }

    final void a(byte param0, int param1, uw param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (!(((lma) this).field_x == null)) {
            for (var4 = 0; ((lma) this).field_q > var4; var4++) {
                for (var5 = 0; var5 < ((lma) this).field_w; var5++) {
                    param2.a((byte) 88, param1, (fo) (Object) ((lma) this).field_x[var4][var5]);
                }
            }
        }
        if (param0 < 50) {
            Object var7 = null;
            ((lma) this).a(101, (la) null, (kh) null);
        }
    }

    final void a(int param0, la param1, kh param2) {
        if (param0 <= 119) {
            ((lma) this).field_m = -87;
        }
        super.a(127, param1, param2);
        if (17 > param1.field_E) {
            ((lma) this).field_p = true;
        } else {
            ((lma) this).field_y = param2.b((byte) 44, 4);
            ((lma) this).field_p = (param2.b((byte) 44, 1) ^ -1) == -2 ? true : false;
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        fh var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        super.h(109);
        if (!(((lma) this).field_x != null)) {
            return;
        }
        for (var2 = 0; ((lma) this).field_q > var2; var2++) {
            for (var3 = 0; ((lma) this).field_w > var3; var3++) {
                var4 = ((lma) this).field_x[var2][var3];
                var5 = bl.field_c[var4.field_a];
                var4.field_o = dfa.a(-var4.field_o + var5, 2048, -73);
                var4.field_l = -var4.field_l;
                var4.field_i = sw.a(var4.field_i, 6);
                if (var4.field_a != -12) {
                    // if_icmpne L169
                    var4.field_a = 11;
                } else {
                    var4.field_a = 12;
                }
                var4.a(0);
            }
        }
        if (param0 <= 0) {
            int discarded$0 = ((lma) this).m((byte) 122);
        }
    }

    private final boolean k(int param0) {
        if (((lma) this).field_h.b(true)) {
            return true;
        }
        if (!(!(((lma) this).field_h instanceof fsa))) {
            return true;
        }
        if (param0 != 10) {
            return true;
        }
        return false;
    }

    private final void j(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        fh var14 = null;
        int var15 = 0;
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
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        la var38 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_172_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_186_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_209_0 = 0;
        int stackIn_225_0 = 0;
        int stackIn_228_0 = 0;
        int stackIn_231_0 = 0;
        int stackIn_234_0 = 0;
        int stackIn_237_0 = 0;
        int stackIn_241_0 = 0;
        int stackIn_247_0 = 0;
        int stackIn_273_0 = 0;
        int stackIn_282_0 = 0;
        int stackIn_291_0 = 0;
        int stackIn_300_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_226_0 = 0;
        int stackOut_230_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_233_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_246_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_268_0 = 0;
        int stackOut_272_0 = 0;
        int stackOut_271_0 = 0;
        int stackOut_265_0 = 0;
        int stackOut_277_0 = 0;
        int stackOut_281_0 = 0;
        int stackOut_280_0 = 0;
        int stackOut_274_0 = 0;
        int stackOut_286_0 = 0;
        int stackOut_290_0 = 0;
        int stackOut_289_0 = 0;
        int stackOut_283_0 = 0;
        int stackOut_295_0 = 0;
        int stackOut_299_0 = 0;
        int stackOut_298_0 = 0;
        int stackOut_292_0 = 0;
        var37 = TombRacer.field_G ? 1 : 0;
        var38 = ((lma) this).field_h.f((byte) 68);
        var3 = var38.m((byte) -86);
        var4 = var38.s(param0 ^ 2097238);
        var5 = ((lma) this).field_h.c(param0 + -2097273);
        var6 = ((lma) this).field_h.a((byte) 55);
        ((lma) this).field_v = ((lma) this).field_h.d(3) - var5 / 2;
        ((lma) this).field_A = ((lma) this).field_v - -var5;
        ((lma) this).field_u = ((lma) this).field_h.e(9648) + -(var6 / 2);
        ((lma) this).field_m = var6 + ((lma) this).field_u;
        var7 = this.k(10) ? 1 : 0;
        var8 = ((lma) this).field_h.d(3);
        var9 = ((lma) this).field_h.e(9648);
        ((lma) this).field_w = (-((lma) this).field_u + ((lma) this).field_m) / 2097152;
        ((lma) this).field_q = (-((lma) this).field_v + ((lma) this).field_A) / param0;
        ((lma) this).field_x = new fh[((lma) this).field_q][((lma) this).field_w];
        var10 = 1048576 + ((lma) this).field_u;
        var11 = 0;
        L0: while (true) {
          if (var11 >= ((lma) this).field_w) {
            return;
          } else {
            var12 = 1048576 + ((lma) this).field_v;
            var13 = 0;
            L1: while (true) {
              if (var13 >= ((lma) this).field_q) {
                var10 = var10 + 2097152;
                var11++;
                continue L0;
              } else {
                L2: {
                  var14 = new fh();
                  ((lma) this).field_x[var13][var11] = var14;
                  if ((var13 ^ -1) >= -1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var15 = stackIn_7_0;
                  if (var13 >= -1 + ((lma) this).field_q) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var16 = stackIn_10_0;
                  if (var11 <= 0) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L4;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L4;
                  }
                }
                L5: {
                  var17 = stackIn_13_0;
                  if (var11 >= -1 + ((lma) this).field_w) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L5;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    var18 = stackIn_16_0;
                    if ((var12 ^ -1) > -1) {
                      break L7;
                    } else {
                      if (var12 <= var3) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var16 = 1;
                  var15 = 1;
                  break L6;
                }
                L8: {
                  L9: {
                    if (var10 < 0) {
                      break L9;
                    } else {
                      if (var4 < var10) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var17 = 1;
                  var18 = 1;
                  break L8;
                }
                L10: {
                  var19 = var15;
                  var20 = var16;
                  var21 = var17;
                  var22 = var18;
                  var23 = za.a(1048576, (byte) 62, -1048576 + var3, var12);
                  var24 = za.a(1048576, (byte) 96, var4 - 1048576, var10);
                  if (var7 == 0) {
                    L11: {
                      if (!((lma) this).field_p) {
                        break L11;
                      } else {
                        L12: {
                          if (var22 == 0) {
                            if (var10 > -2097152 + var4) {
                              stackOut_31_0 = 1;
                              stackIn_33_0 = stackOut_31_0;
                              break L12;
                            } else {
                              stackOut_30_0 = 0;
                              stackIn_33_0 = stackOut_30_0;
                              break L12;
                            }
                          } else {
                            stackOut_28_0 = 1;
                            stackIn_33_0 = stackOut_28_0;
                            break L12;
                          }
                        }
                        L13: {
                          var22 = stackIn_33_0;
                          if (var19 == 0) {
                            if (var12 > -2097153) {
                              stackOut_37_0 = 1;
                              stackIn_39_0 = stackOut_37_0;
                              break L13;
                            } else {
                              stackOut_36_0 = 0;
                              stackIn_39_0 = stackOut_36_0;
                              break L13;
                            }
                          } else {
                            stackOut_34_0 = 1;
                            stackIn_39_0 = stackOut_34_0;
                            break L13;
                          }
                        }
                        L14: {
                          var19 = stackIn_39_0;
                          if (var21 != 0) {
                            stackOut_43_0 = 1;
                            stackIn_45_0 = stackOut_43_0;
                            break L14;
                          } else {
                            if (-2097153 > var10) {
                              stackOut_42_0 = 1;
                              stackIn_45_0 = stackOut_42_0;
                              break L14;
                            } else {
                              stackOut_41_0 = 0;
                              stackIn_45_0 = stackOut_41_0;
                              break L14;
                            }
                          }
                        }
                        L15: {
                          var21 = stackIn_45_0;
                          if (var20 == 0) {
                            if (var3 + -2097152 < var12) {
                              stackOut_49_0 = 1;
                              stackIn_51_0 = stackOut_49_0;
                              break L15;
                            } else {
                              stackOut_48_0 = 0;
                              stackIn_51_0 = stackOut_48_0;
                              break L15;
                            }
                          } else {
                            stackOut_46_0 = 1;
                            stackIn_51_0 = stackOut_46_0;
                            break L15;
                          }
                        }
                        var20 = stackIn_51_0;
                        break L11;
                      }
                    }
                    L16: {
                      if (var19 == 0) {
                        if (var38.a(var23 - 2097152, 2097152, var24, 2097152, true, 0, (byte) 102)) {
                          stackOut_56_0 = 1;
                          stackIn_58_0 = stackOut_56_0;
                          break L16;
                        } else {
                          stackOut_55_0 = 0;
                          stackIn_58_0 = stackOut_55_0;
                          break L16;
                        }
                      } else {
                        stackOut_53_0 = 1;
                        stackIn_58_0 = stackOut_53_0;
                        break L16;
                      }
                    }
                    L17: {
                      var19 = stackIn_58_0;
                      if (var20 == 0) {
                        L18: {
                          if (var38.a(2097152 + var23, 2097152, var24, 2097152, true, 0, (byte) -99)) {
                            stackOut_64_0 = 1;
                            stackIn_66_0 = stackOut_64_0;
                            break L18;
                          } else {
                            stackOut_63_0 = 0;
                            stackIn_66_0 = stackOut_63_0;
                            break L18;
                          }
                        }
                        var20 = stackIn_66_0;
                        break L17;
                      } else {
                        stackOut_59_0 = 1;
                        stackIn_61_0 = stackOut_59_0;
                        var20 = stackIn_61_0;
                        break L17;
                      }
                    }
                    L19: {
                      if (var21 == 0) {
                        L20: {
                          if (var38.a(var23, 2097152, var24 + -2097152, 2097152, true, 0, (byte) -103)) {
                            stackOut_73_0 = 1;
                            stackIn_75_0 = stackOut_73_0;
                            break L20;
                          } else {
                            stackOut_72_0 = 0;
                            stackIn_75_0 = stackOut_72_0;
                            break L20;
                          }
                        }
                        var21 = stackIn_75_0;
                        break L19;
                      } else {
                        stackOut_68_0 = 1;
                        stackIn_70_0 = stackOut_68_0;
                        var21 = stackIn_70_0;
                        break L19;
                      }
                    }
                    if (var22 == 0) {
                      L21: {
                        if (var38.a(var23, 2097152, var24 - -2097152, 2097152, true, 0, (byte) 72)) {
                          stackOut_82_0 = 1;
                          stackIn_84_0 = stackOut_82_0;
                          break L21;
                        } else {
                          stackOut_81_0 = 0;
                          stackIn_84_0 = stackOut_81_0;
                          break L21;
                        }
                      }
                      var22 = stackIn_84_0;
                      break L10;
                    } else {
                      stackOut_77_0 = 1;
                      stackIn_79_0 = stackOut_77_0;
                      var22 = stackIn_79_0;
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                L22: {
                  if (((lma) this).field_z) {
                    var19 = 1;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (((lma) this).field_n) {
                    var22 = 1;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (((lma) this).field_t) {
                    var20 = 1;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (!((lma) this).field_s) {
                    break L25;
                  } else {
                    var21 = 1;
                    break L25;
                  }
                }
                L26: {
                  var25 = 0;
                  if (var19 != 0) {
                    var25++;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (var20 == 0) {
                    break L27;
                  } else {
                    var25++;
                    break L27;
                  }
                }
                L28: {
                  if (var21 == 0) {
                    break L28;
                  } else {
                    var25++;
                    break L28;
                  }
                }
                L29: {
                  if (var22 != 0) {
                    var25++;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  var26 = 0;
                  var27 = 0;
                  if (-5 == (var25 ^ -1)) {
                    L31: {
                      L32: {
                        if (var15 == 0) {
                          break L32;
                        } else {
                          if (var17 == 0) {
                            break L32;
                          } else {
                            stackOut_150_0 = 1;
                            stackIn_152_0 = stackOut_150_0;
                            var28 = stackIn_152_0;
                            break L31;
                          }
                        }
                      }
                      L33: {
                        if (-2097153 >= (var12 ^ -1)) {
                          if (var10 >= 2097152) {
                            if (var38.a(var12 + -2097152, 2097152, -2097152 + var10, 2097152, true, 0, (byte) 72)) {
                              stackOut_160_0 = 1;
                              stackIn_162_0 = stackOut_160_0;
                              break L33;
                            } else {
                              stackOut_159_0 = 0;
                              stackIn_162_0 = stackOut_159_0;
                              break L33;
                            }
                          } else {
                            stackOut_157_0 = 1;
                            stackIn_162_0 = stackOut_157_0;
                            break L33;
                          }
                        } else {
                          stackOut_155_0 = 1;
                          stackIn_162_0 = stackOut_155_0;
                          break L33;
                        }
                      }
                      var28 = stackIn_162_0;
                      break L31;
                    }
                    L34: {
                      L35: {
                        if (var16 == 0) {
                          break L35;
                        } else {
                          if (var17 == 0) {
                            break L35;
                          } else {
                            stackOut_165_0 = 1;
                            stackIn_167_0 = stackOut_165_0;
                            var29 = stackIn_167_0;
                            break L34;
                          }
                        }
                      }
                      if (var12 <= var3 - 2097152) {
                        if (var10 >= 2097152) {
                          L36: {
                            if (var38.a(var12 + 2097152, 2097152, -2097152 + var10, 2097152, true, 0, (byte) 103)) {
                              stackOut_179_0 = 1;
                              stackIn_181_0 = stackOut_179_0;
                              break L36;
                            } else {
                              stackOut_178_0 = 0;
                              stackIn_181_0 = stackOut_178_0;
                              break L36;
                            }
                          }
                          var29 = stackIn_181_0;
                          break L34;
                        } else {
                          stackOut_174_0 = 1;
                          stackIn_176_0 = stackOut_174_0;
                          var29 = stackIn_176_0;
                          break L34;
                        }
                      } else {
                        stackOut_170_0 = 1;
                        stackIn_172_0 = stackOut_170_0;
                        var29 = stackIn_172_0;
                        break L34;
                      }
                    }
                    L37: {
                      L38: {
                        if (var15 == 0) {
                          break L38;
                        } else {
                          if (var18 == 0) {
                            break L38;
                          } else {
                            stackOut_184_0 = 1;
                            stackIn_186_0 = stackOut_184_0;
                            var30 = stackIn_186_0;
                            break L37;
                          }
                        }
                      }
                      L39: {
                        if ((var12 ^ -1) <= -2097153) {
                          if (-2097152 + var4 >= var10) {
                            if (var38.a(-2097152 + var12, 2097152, var10 - -2097152, 2097152, true, 0, (byte) -55)) {
                              stackOut_194_0 = 1;
                              stackIn_196_0 = stackOut_194_0;
                              break L39;
                            } else {
                              stackOut_193_0 = 0;
                              stackIn_196_0 = stackOut_193_0;
                              break L39;
                            }
                          } else {
                            stackOut_191_0 = 1;
                            stackIn_196_0 = stackOut_191_0;
                            break L39;
                          }
                        } else {
                          stackOut_189_0 = 1;
                          stackIn_196_0 = stackOut_189_0;
                          break L39;
                        }
                      }
                      var30 = stackIn_196_0;
                      break L37;
                    }
                    L40: {
                      L41: {
                        if (var16 == 0) {
                          break L41;
                        } else {
                          if (var18 == 0) {
                            break L41;
                          } else {
                            stackOut_199_0 = 1;
                            stackIn_209_0 = stackOut_199_0;
                            break L40;
                          }
                        }
                      }
                      if (-2097152 + var3 >= var12) {
                        if (var10 <= -2097152 + var4) {
                          if (var38.a(2097152 + var12, 2097152, var10 - -2097152, 2097152, true, 0, (byte) 55)) {
                            stackOut_207_0 = 1;
                            stackIn_209_0 = stackOut_207_0;
                            break L40;
                          } else {
                            stackOut_206_0 = 0;
                            stackIn_209_0 = stackOut_206_0;
                            break L40;
                          }
                        } else {
                          stackOut_204_0 = 1;
                          stackIn_209_0 = stackOut_204_0;
                          break L40;
                        }
                      } else {
                        stackOut_202_0 = 1;
                        stackIn_209_0 = stackOut_202_0;
                        break L40;
                      }
                    }
                    L42: {
                      var31 = stackIn_209_0;
                      if (var28 == 0) {
                        break L42;
                      } else {
                        if (var29 == 0) {
                          break L42;
                        } else {
                          if (var30 == 0) {
                            break L42;
                          } else {
                            if (var31 == 0) {
                              break L42;
                            } else {
                              var14.field_a = 5;
                              break L30;
                            }
                          }
                        }
                      }
                    }
                    L43: {
                      if (var28 != 0) {
                        if (var30 != 0) {
                          if (var29 != 0) {
                            var26 = 1024;
                            break L43;
                          } else {
                            var26 = 512;
                            break L43;
                          }
                        } else {
                          var26 = -512;
                          break L43;
                        }
                      } else {
                        var26 = 0;
                        break L43;
                      }
                    }
                    var14.field_a = 6;
                    break L30;
                  } else {
                    if (3 == var25) {
                      if (var21 != 0) {
                        if (var22 != 0) {
                          L44: {
                            if (var20 == 0) {
                              var26 = 512;
                              var27 = 2;
                              break L44;
                            } else {
                              var27 = 6;
                              var26 = -512;
                              break L44;
                            }
                          }
                          var14.field_a = 0;
                          break L30;
                        } else {
                          var26 = 1024;
                          var27 = 4;
                          var14.field_a = 0;
                          break L30;
                        }
                      } else {
                        var26 = 0;
                        var27 = 0;
                        var14.field_a = 0;
                        break L30;
                      }
                    } else {
                      if ((var25 ^ -1) != -3) {
                        if ((var25 ^ -1) == -2) {
                          if (var21 == 0) {
                            if (var22 == 0) {
                              L45: {
                                if (var20 == 0) {
                                  var27 = 2;
                                  var26 = 0;
                                  break L45;
                                } else {
                                  var26 = 1024;
                                  var27 = 6;
                                  break L45;
                                }
                              }
                              var14.field_a = 2;
                              break L30;
                            } else {
                              var27 = 0;
                              var26 = -512;
                              var14.field_a = 2;
                              break L30;
                            }
                          } else {
                            var27 = 4;
                            var26 = 512;
                            var14.field_a = 2;
                            break L30;
                          }
                        } else {
                          var14.field_a = 3;
                          break L30;
                        }
                      } else {
                        L46: {
                          if (var21 != 0) {
                            break L46;
                          } else {
                            if (var22 == 0) {
                              var27 = 0;
                              var14.field_a = 1;
                              var26 = 0;
                              break L30;
                            } else {
                              break L46;
                            }
                          }
                        }
                        L47: {
                          if (var19 != 0) {
                            break L47;
                          } else {
                            if (var20 != 0) {
                              break L47;
                            } else {
                              var14.field_a = 1;
                              var26 = -512;
                              var27 = 2;
                              break L30;
                            }
                          }
                        }
                        L48: {
                          L49: {
                            if (var19 != 0) {
                              break L49;
                            } else {
                              if (var21 == 0) {
                                var27 = 7;
                                var26 = -512;
                                break L48;
                              } else {
                                break L49;
                              }
                            }
                          }
                          L50: {
                            if (var19 != 0) {
                              break L50;
                            } else {
                              if (var22 != 0) {
                                break L50;
                              } else {
                                var26 = 1024;
                                var27 = 5;
                                var14.field_a = 4;
                                break L30;
                              }
                            }
                          }
                          L51: {
                            if (var20 != 0) {
                              break L51;
                            } else {
                              if (var21 != 0) {
                                break L51;
                              } else {
                                var27 = 1;
                                var26 = 0;
                                var14.field_a = 4;
                                break L30;
                              }
                            }
                          }
                          if (var20 != 0) {
                            break L48;
                          } else {
                            if (var22 != 0) {
                              break L48;
                            } else {
                              var27 = 3;
                              var26 = 512;
                              var14.field_a = 4;
                              break L30;
                            }
                          }
                        }
                        var14.field_a = 4;
                        break L30;
                      }
                    }
                  }
                }
                L52: {
                  if (!var38.a(-2097152 + var23, 2097152, var24, 2097152, false, 2, (byte) 98)) {
                    stackOut_224_0 = 0;
                    stackIn_225_0 = stackOut_224_0;
                    break L52;
                  } else {
                    stackOut_223_0 = 1;
                    stackIn_225_0 = stackOut_223_0;
                    break L52;
                  }
                }
                L53: {
                  var28 = stackIn_225_0;
                  if (!var38.a(var23 + 2097152, 2097152, var24, 2097152, false, 2, (byte) -108)) {
                    stackOut_227_0 = 0;
                    stackIn_228_0 = stackOut_227_0;
                    break L53;
                  } else {
                    stackOut_226_0 = 1;
                    stackIn_228_0 = stackOut_226_0;
                    break L53;
                  }
                }
                L54: {
                  var29 = stackIn_228_0;
                  if (!var38.a(var23, 2097152, var24 + -2097152, 2097152, false, 2, (byte) 118)) {
                    stackOut_230_0 = 0;
                    stackIn_231_0 = stackOut_230_0;
                    break L54;
                  } else {
                    stackOut_229_0 = 1;
                    stackIn_231_0 = stackOut_229_0;
                    break L54;
                  }
                }
                L55: {
                  var30 = stackIn_231_0;
                  if (!var38.a(var23, 2097152, 2097152 + var24, 2097152, false, 2, (byte) 116)) {
                    stackOut_233_0 = 0;
                    stackIn_234_0 = stackOut_233_0;
                    break L55;
                  } else {
                    stackOut_232_0 = 1;
                    stackIn_234_0 = stackOut_232_0;
                    break L55;
                  }
                }
                L56: {
                  var31 = stackIn_234_0;
                  if (var28 == 0) {
                    if (var29 == 0) {
                      L57: {
                        if (var30 != 0) {
                          stackOut_245_0 = 1;
                          stackIn_247_0 = stackOut_245_0;
                          break L57;
                        } else {
                          if (var31 == 0) {
                            stackOut_246_0 = 0;
                            stackIn_247_0 = stackOut_246_0;
                            break L57;
                          } else {
                            stackOut_244_0 = 1;
                            stackIn_247_0 = stackOut_244_0;
                            break L57;
                          }
                        }
                      }
                      var32 = stackIn_247_0;
                      break L56;
                    } else {
                      stackOut_239_0 = 1;
                      stackIn_241_0 = stackOut_239_0;
                      var32 = stackIn_241_0;
                      break L56;
                    }
                  } else {
                    stackOut_235_0 = 1;
                    stackIn_237_0 = stackOut_235_0;
                    var32 = stackIn_237_0;
                    break L56;
                  }
                }
                L58: {
                  if (var32 == 0) {
                    break L58;
                  } else {
                    if (4 == var14.field_a) {
                      L59: {
                        if (var28 != 0) {
                          if (var27 != 7) {
                            if (5 != var27) {
                              break L59;
                            } else {
                              var14.field_a = 12;
                              var26 = 1024;
                              break L59;
                            }
                          } else {
                            var26 = 0;
                            var14.field_a = 11;
                            break L59;
                          }
                        } else {
                          break L59;
                        }
                      }
                      if (var29 == 0) {
                        break L58;
                      } else {
                        if (-2 != (var27 ^ -1)) {
                          if (3 != var27) {
                            break L58;
                          } else {
                            var26 = 1024;
                            var14.field_a = 11;
                            break L58;
                          }
                        } else {
                          var26 = 0;
                          var14.field_a = 12;
                          break L58;
                        }
                      }
                    } else {
                      break L58;
                    }
                  }
                }
                L60: {
                  var14.field_o = dfa.a(var26 + bl.field_c[var14.field_a], 2048, 120);
                  var14.field_i = var27;
                  var14.field_f = var10 + -var9;
                  var14.field_l = var12 + -var8;
                  var14.field_g = (lma) this;
                  if (((lma) this).field_y != 0) {
                    break L60;
                  } else {
                    var14.field_p = this.a(var10, var12, param0 + -2097153, var14);
                    var14.field_d = this.b(var14, (byte) -94);
                    break L60;
                  }
                }
                L61: {
                  if (var7 == 0) {
                    L62: {
                      if (var21 == 0) {
                        break L62;
                      } else {
                        if (var19 == 0) {
                          break L62;
                        } else {
                          stackOut_268_0 = 0;
                          stackIn_273_0 = stackOut_268_0;
                          break L61;
                        }
                      }
                    }
                    if (!var38.a(var23 - 2097152, 2097152, var24 + -2097152, 2097152, true, 0, (byte) 98)) {
                      stackOut_272_0 = 0;
                      stackIn_273_0 = stackOut_272_0;
                      break L61;
                    } else {
                      stackOut_271_0 = 1;
                      stackIn_273_0 = stackOut_271_0;
                      break L61;
                    }
                  } else {
                    stackOut_265_0 = 0;
                    stackIn_273_0 = stackOut_265_0;
                    break L61;
                  }
                }
                L63: {
                  var33 = stackIn_273_0;
                  if (var7 == 0) {
                    L64: {
                      if (var21 == 0) {
                        break L64;
                      } else {
                        if (var20 == 0) {
                          break L64;
                        } else {
                          stackOut_277_0 = 0;
                          stackIn_282_0 = stackOut_277_0;
                          break L63;
                        }
                      }
                    }
                    if (!var38.a(2097152 + var23, 2097152, -2097152 + var24, 2097152, true, 0, (byte) 79)) {
                      stackOut_281_0 = 0;
                      stackIn_282_0 = stackOut_281_0;
                      break L63;
                    } else {
                      stackOut_280_0 = 1;
                      stackIn_282_0 = stackOut_280_0;
                      break L63;
                    }
                  } else {
                    stackOut_274_0 = 0;
                    stackIn_282_0 = stackOut_274_0;
                    break L63;
                  }
                }
                L65: {
                  var34 = stackIn_282_0;
                  if (var7 == 0) {
                    L66: {
                      if (var22 == 0) {
                        break L66;
                      } else {
                        if (var19 == 0) {
                          break L66;
                        } else {
                          stackOut_286_0 = 0;
                          stackIn_291_0 = stackOut_286_0;
                          break L65;
                        }
                      }
                    }
                    if (!var38.a(var23 - 2097152, 2097152, 2097152 + var24, 2097152, true, 0, (byte) -88)) {
                      stackOut_290_0 = 0;
                      stackIn_291_0 = stackOut_290_0;
                      break L65;
                    } else {
                      stackOut_289_0 = 1;
                      stackIn_291_0 = stackOut_289_0;
                      break L65;
                    }
                  } else {
                    stackOut_283_0 = 0;
                    stackIn_291_0 = stackOut_283_0;
                    break L65;
                  }
                }
                L67: {
                  var35 = stackIn_291_0;
                  if (var7 == 0) {
                    L68: {
                      if (var22 == 0) {
                        break L68;
                      } else {
                        if (var20 == 0) {
                          break L68;
                        } else {
                          stackOut_295_0 = 0;
                          stackIn_300_0 = stackOut_295_0;
                          break L67;
                        }
                      }
                    }
                    if (!var38.a(var23 + 2097152, 2097152, 2097152 + var24, 2097152, true, 0, (byte) 117)) {
                      stackOut_299_0 = 0;
                      stackIn_300_0 = stackOut_299_0;
                      break L67;
                    } else {
                      stackOut_298_0 = 1;
                      stackIn_300_0 = stackOut_298_0;
                      break L67;
                    }
                  } else {
                    stackOut_292_0 = 0;
                    stackIn_300_0 = stackOut_292_0;
                    break L67;
                  }
                }
                var36 = stackIn_300_0;
                var12 = var12 + 2097152;
                var14.a(var33 != 0, (byte) 24, var34 != 0, var36 != 0, var35 != 0);
                var13++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(int param0, uw param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param2 <= 40) {
            this.l(-14);
        }
        if (null != ((lma) this).field_x) {
            for (var4 = 0; var4 < ((lma) this).field_q; var4++) {
                for (var5 = 0; var5 < ((lma) this).field_w; var5++) {
                    param1.a(param0, (fo) (Object) ((lma) this).field_x[var4][var5], (byte) -33);
                }
            }
        }
    }

    final void a(byte param0, kh param1) {
        super.a((byte) 86, param1);
        int var3 = -57 / ((param0 - -8) / 40);
        param1.a((byte) -19, ((lma) this).field_y, 4);
        param1.a((byte) 111, !((lma) this).field_p ? 0 : 1, 1);
    }

    final void b(int param0, uw param1) {
        if (null == ((lma) this).field_x) {
            this.j(2097152);
            if (hb.d(67)) {
                this.l(32166);
            }
        }
        super.b(param0, param1);
    }

    private final void l(int param0) {
        int var2 = 0;
        la var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        fh var12 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        boolean[][] var23 = null;
        boolean[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        boolean[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        boolean[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        boolean[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        boolean[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        boolean[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        boolean[] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        boolean[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        boolean[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        boolean[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        boolean[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        boolean[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        L0: {
          var19 = TombRacer.field_G ? 1 : 0;
          if (param0 == 32166) {
            break L0;
          } else {
            this.l(-80);
            break L0;
          }
        }
        var2 = this.k(param0 ^ 32172) ? 1 : 0;
        var3 = ((lma) this).a(param0 + -32121);
        var4 = 4194304;
        var5 = ((lma) this).field_h.d(3);
        var6 = ((lma) this).field_h.e(9648);
        var10 = 0;
        L1: while (true) {
          if (var10 >= ((lma) this).field_q) {
            return;
          } else {
            var11 = 0;
            L2: while (true) {
              if (((lma) this).field_w <= var11) {
                var10++;
                continue L1;
              } else {
                var12 = ((lma) this).field_x[var10][var11];
                if (-6 == (var12.field_a ^ -1)) {
                  L3: {
                    var8 = var12.field_f + var6;
                    var7 = var5 - -var12.field_l;
                    var9 = 0;
                    var23 = new boolean[5][5];
                    var14 = 0;
                    if (var2 != 0) {
                      var15 = 0;
                      L4: while (true) {
                        if (var15 <= -6) {
                          break L3;
                        } else {
                          var16 = 0;
                          L5: while (true) {
                            if (5 <= var16) {
                              var15++;
                              continue L4;
                            } else {
                              L6: {
                                if (var15 == 0) {
                                  break L6;
                                } else {
                                  if (-1 == var16) {
                                    break L6;
                                  } else {
                                    if (var15 == 4) {
                                      break L6;
                                    } else {
                                      if (-5 == (var16 ^ -1)) {
                                        break L6;
                                      } else {
                                        var16++;
                                        continue L5;
                                      }
                                    }
                                  }
                                }
                              }
                              L7: {
                                L8: {
                                  var17 = var10 + (var15 - 2);
                                  var18 = var11 + (var16 + -2);
                                  stackOut_35_0 = var23[var15];
                                  stackOut_35_1 = var16;
                                  stackIn_40_0 = stackOut_35_0;
                                  stackIn_40_1 = stackOut_35_1;
                                  stackIn_36_0 = stackOut_35_0;
                                  stackIn_36_1 = stackOut_35_1;
                                  if (var17 < 0) {
                                    break L8;
                                  } else {
                                    stackOut_36_0 = (boolean[]) (Object) stackIn_36_0;
                                    stackOut_36_1 = stackIn_36_1;
                                    stackIn_40_0 = stackOut_36_0;
                                    stackIn_40_1 = stackOut_36_1;
                                    stackIn_37_0 = stackOut_36_0;
                                    stackIn_37_1 = stackOut_36_1;
                                    if (0 > var18) {
                                      break L8;
                                    } else {
                                      stackOut_37_0 = (boolean[]) (Object) stackIn_37_0;
                                      stackOut_37_1 = stackIn_37_1;
                                      stackIn_40_0 = stackOut_37_0;
                                      stackIn_40_1 = stackOut_37_1;
                                      stackIn_38_0 = stackOut_37_0;
                                      stackIn_38_1 = stackOut_37_1;
                                      if (((lma) this).field_q <= var17) {
                                        break L8;
                                      } else {
                                        stackOut_38_0 = (boolean[]) (Object) stackIn_38_0;
                                        stackOut_38_1 = stackIn_38_1;
                                        stackIn_40_0 = stackOut_38_0;
                                        stackIn_40_1 = stackOut_38_1;
                                        stackIn_39_0 = stackOut_38_0;
                                        stackIn_39_1 = stackOut_38_1;
                                        if (((lma) this).field_w <= var18) {
                                          break L8;
                                        } else {
                                          stackOut_39_0 = (boolean[]) (Object) stackIn_39_0;
                                          stackOut_39_1 = stackIn_39_1;
                                          stackOut_39_2 = 1;
                                          stackIn_41_0 = stackOut_39_0;
                                          stackIn_41_1 = stackOut_39_1;
                                          stackIn_41_2 = stackOut_39_2;
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_40_0 = (boolean[]) (Object) stackIn_40_0;
                                stackOut_40_1 = stackIn_40_1;
                                stackOut_40_2 = 0;
                                stackIn_41_0 = stackOut_40_0;
                                stackIn_41_1 = stackOut_40_1;
                                stackIn_41_2 = stackOut_40_2;
                                break L7;
                              }
                              stackIn_41_0[stackIn_41_1] = stackIn_41_2 != 0;
                              if (var23[var15][var16]) {
                                var14++;
                                var16++;
                                continue L5;
                              } else {
                                var16++;
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var15 = 0;
                      L9: while (true) {
                        if (-6 >= (var15 ^ -1)) {
                          var15 = 0;
                          L10: while (true) {
                            if (-4 >= (var15 ^ -1)) {
                              break L3;
                            } else {
                              L11: {
                                var16 = var15 - 1;
                                var23[0][1 + var15] = var3.a(-var4 + var7, 2097152, 2097152 * var16 + var8, 2097152, true, 0, (byte) -20);
                                if (var23[0][var15 - -1]) {
                                  var14++;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              var23[4][1 + var15] = var3.a(var7 + var4, 2097152, var8 - -(2097152 * var16), 2097152, true, 0, (byte) 88);
                              if (var23[4][var15 - -1]) {
                                var14++;
                                var15++;
                                continue L10;
                              } else {
                                var15++;
                                continue L10;
                              }
                            }
                          }
                        } else {
                          L12: {
                            var16 = -2 + var15;
                            var23[var15][0] = var3.a(var7 + 2097152 * var16, 2097152, -var4 + var8, 2097152, true, 0, (byte) -39);
                            if (!var23[var15][0]) {
                              break L12;
                            } else {
                              var14++;
                              break L12;
                            }
                          }
                          var23[var15][4] = var3.a(2097152 * var16 + var7, 2097152, var8 + var4, 2097152, true, 0, (byte) 91);
                          if (var23[var15][4]) {
                            var14++;
                            var15++;
                            continue L9;
                          } else {
                            var15++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    if (16 == var14) {
                      var12.field_a = 10;
                      break L13;
                    } else {
                      if (var14 != 15) {
                        if (11 <= var14) {
                          L14: {
                            if (!var23[1][0]) {
                              break L14;
                            } else {
                              if (!var23[2][0]) {
                                break L14;
                              } else {
                                if (var23[3][0]) {
                                  L15: {
                                    if (!var23[4][1]) {
                                      break L15;
                                    } else {
                                      if (!var23[4][2]) {
                                        break L15;
                                      } else {
                                        if (!var23[4][3]) {
                                          break L15;
                                        } else {
                                          L16: {
                                            if (!var23[1][4]) {
                                              break L16;
                                            } else {
                                              if (!var23[2][4]) {
                                                break L16;
                                              } else {
                                                if (!var23[3][4]) {
                                                  break L16;
                                                } else {
                                                  L17: {
                                                    if (!var23[0][1]) {
                                                      break L17;
                                                    } else {
                                                      if (!var23[0][2]) {
                                                        break L17;
                                                      } else {
                                                        if (var23[0][3]) {
                                                          break L13;
                                                        } else {
                                                          break L17;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var12.field_a = 7;
                                                  var9 = -512;
                                                  break L13;
                                                }
                                              }
                                            }
                                          }
                                          var9 = 1024;
                                          var12.field_a = 7;
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                  var12.field_a = 7;
                                  var9 = 512;
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          var12.field_a = 7;
                          var9 = 0;
                          break L13;
                        } else {
                          if (-6 >= (var14 ^ -1)) {
                            L18: {
                              if (var23[0][0]) {
                                break L18;
                              } else {
                                if (var23[1][0]) {
                                  break L18;
                                } else {
                                  if (var23[0][1]) {
                                    break L18;
                                  } else {
                                    var9 = 0;
                                    var12.field_a = 8;
                                    break L13;
                                  }
                                }
                              }
                            }
                            L19: {
                              if (var23[4][0]) {
                                break L19;
                              } else {
                                if (var23[3][0]) {
                                  break L19;
                                } else {
                                  if (var23[4][1]) {
                                    break L19;
                                  } else {
                                    var9 = 512;
                                    var12.field_a = 8;
                                    break L13;
                                  }
                                }
                              }
                            }
                            L20: {
                              if (var23[4][4]) {
                                break L20;
                              } else {
                                if (var23[4][3]) {
                                  break L20;
                                } else {
                                  if (var23[3][4]) {
                                    break L20;
                                  } else {
                                    var9 = 1024;
                                    var12.field_a = 8;
                                    break L13;
                                  }
                                }
                              }
                            }
                            if (var23[0][4]) {
                              break L13;
                            } else {
                              if (var23[1][4]) {
                                break L13;
                              } else {
                                if (var23[0][1]) {
                                  break L13;
                                } else {
                                  var12.field_a = 8;
                                  var9 = -512;
                                  break L13;
                                }
                              }
                            }
                          } else {
                            var12.field_o = var9 + bl.field_c[var12.field_a];
                            var12.field_d = 0;
                            var12.field_p = 0;
                            var11++;
                            continue L2;
                          }
                        }
                      } else {
                        if (var23[0][0]) {
                          if (!var23[4][0]) {
                            var12.field_a = 9;
                            var9 = -512;
                            break L13;
                          } else {
                            if (!var23[4][4]) {
                              var9 = 0;
                              var12.field_a = 9;
                              break L13;
                            } else {
                              if (var23[0][4]) {
                                break L13;
                              } else {
                                var9 = 512;
                                var12.field_a = 9;
                                break L13;
                              }
                            }
                          }
                        } else {
                          var12.field_a = 9;
                          var9 = 1024;
                          break L13;
                        }
                      }
                    }
                  }
                  var12.field_o = var9 + bl.field_c[var12.field_a];
                  var12.field_d = 0;
                  var12.field_p = 0;
                  var11++;
                  continue L2;
                } else {
                  var11++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final boolean o(byte param0) {
        int var2 = 66 % ((25 - param0) / 57);
        if (!(((lma) this).field_h instanceof fsa)) {
            return false;
        }
        return true;
    }

    lma(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    public static void n(byte param0) {
        field_r = null;
        int var1 = -22 % ((param0 - 6) / 42);
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var6 = 89 % ((-38 - param4) / 47);
    }

    final int i(int param0) {
        if (param0 > -28) {
            ((lma) this).field_u = -21;
        }
        return ((lma) this).field_y;
    }

    static {
    }
}
