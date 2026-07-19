/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sf extends wl {
    private int field_T;
    static int[] field_P;
    private int field_R;
    private int field_V;
    static String field_Q;
    private int field_U;
    private int field_O;
    private int field_S;

    void b(int param0, int param1, int param2) {
        int discarded$1 = 0;
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
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        vh var17 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        qn.a(6 + param0, 35 + param2, this.field_l - 12, this.field_w + -40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          L1: {
            L2: {
              if (var4 <= var7) {
                break L2;
              } else {
                stackOut_2_0 = var8 ^ -1;
                stackOut_2_1 = qn.field_a ^ -1;
                stackIn_33_0 = stackOut_2_0;
                stackIn_33_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var16 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 > stackIn_3_1) {
                      break L3;
                    } else {
                      L4: {
                        if ((var8 ^ -1) > (qn.field_f ^ -1)) {
                          break L4;
                        } else {
                          if (var16 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        L6: {
                          var9 = var5 + var7 * (var6 - var5) / var4;
                          var10 = 0;
                          var11 = this.field_l;
                          if (-21 > (var7 ^ -1)) {
                            break L6;
                          } else {
                            L7: while (true) {
                              if (20 < var10) {
                                break L6;
                              } else {
                                var12 = (-var10 + 20) * (-var10 + 20) + (-var7 + 20) * (-var7 + 20);
                                stackOut_9_0 = var12;
                                stackOut_9_1 = 462;
                                stackIn_17_0 = stackOut_9_0;
                                stackIn_17_1 = stackOut_9_1;
                                stackIn_10_0 = stackOut_9_0;
                                stackIn_10_1 = stackOut_9_1;
                                if (var16 != 0) {
                                  break L5;
                                } else {
                                  L8: {
                                    L9: {
                                      if (stackIn_10_0 <= stackIn_10_1) {
                                        break L9;
                                      } else {
                                        if (var16 == 0) {
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    if ((var12 ^ -1) > -421) {
                                      break L6;
                                    } else {
                                      var13 = var9 * (462 - var12) / 42;
                                      var13 = var13 | (var13 << 835442024 | var13 << 1342106736);
                                      qn.field_d[var8 * qn.field_l - (-param0 + -var10)] = var13;
                                      break L8;
                                    }
                                  }
                                  var10++;
                                  if (var16 == 0) {
                                    continue L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_16_0 = var7 ^ -1;
                        stackOut_16_1 = -21;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        break L5;
                      }
                      L10: {
                        L11: {
                          if (stackIn_17_0 >= stackIn_17_1) {
                            var12 = var11;
                            var11 -= 21;
                            var13 = 0;
                            L12: while (true) {
                              L13: {
                                if (var13 > 20) {
                                  break L13;
                                } else {
                                  var14 = var13 * var13 + (-var7 + 20) * (20 + -var7);
                                  stackOut_21_0 = 462;
                                  stackOut_21_1 = var14;
                                  stackIn_30_0 = stackOut_21_0;
                                  stackIn_30_1 = stackOut_21_1;
                                  stackIn_22_0 = stackOut_21_0;
                                  stackIn_22_1 = stackOut_21_1;
                                  if (var16 != 0) {
                                    break L10;
                                  } else {
                                    if (stackIn_22_0 < stackIn_22_1) {
                                      break L13;
                                    } else {
                                      L14: {
                                        L15: {
                                          if (-421 < (var14 ^ -1)) {
                                            var12 = 1 + var11;
                                            if (var16 == 0) {
                                              break L14;
                                            } else {
                                              break L15;
                                            }
                                          } else {
                                            break L15;
                                          }
                                        }
                                        var15 = var9 * (462 - var14) / 42;
                                        var15 = var15 | (var15 << 980103152 | var15 << 423611272);
                                        qn.field_d[var11 + param0 + qn.field_l * var8] = var15;
                                        break L14;
                                      }
                                      var11++;
                                      var13++;
                                      if (var16 == 0) {
                                        continue L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              var11 = var12;
                              break L11;
                            }
                          } else {
                            break L11;
                          }
                        }
                        var9 = var9 | (var9 << 57202544 | var9 << 1639885448);
                        stackOut_29_0 = param0 + var10;
                        stackOut_29_1 = var8;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        break L10;
                      }
                      qn.e(stackIn_30_0, stackIn_30_1, -var10 + var11, var9);
                      break L3;
                    }
                  }
                  var8++;
                  var7++;
                  if (var16 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var6 = 169;
            var4 = 22;
            var5 = 194;
            var7 = 0;
            stackOut_32_0 = param2;
            stackOut_32_1 = -35;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            break L1;
          }
          var8 = stackIn_33_0 - stackIn_33_1;
          L16: while (true) {
            L17: {
              L18: {
                if (var7 >= var4) {
                  break L18;
                } else {
                  var9 = var5 + var7 * (-var5 + var6) / var4;
                  var9 = var9 | (var9 << 809398608 | var9 << 1874934216);
                  qn.e(param0, var8, 6, var9);
                  qn.e(param0 - (-this.field_l + 6), var8, 6, var9);
                  var7++;
                  var8++;
                  if (var16 != 0) {
                    break L17;
                  } else {
                    if (var16 == 0) {
                      continue L16;
                    } else {
                      break L18;
                    }
                  }
                }
              }
              gt.field_e.g(this.field_l + (param0 + -90), 10 + param2);
              gb.a(t.field_d, param0 - -5, param2 - -35, this.field_l - 10, 8941);
              gb.a(ip.field_c, param0, -22 + param2 - -this.field_w, this.field_l, param1 ^ 1851672364);
              var4 = this.field_w - 79;
              var6 = 127;
              var5 = 169;
              break L17;
            }
            L19: {
              if (param1 == 1851680193) {
                break L19;
              } else {
                var17 = (vh) null;
                discarded$1 = sf.a(-110, (String) null, (vh) null);
                break L19;
              }
            }
            var7 = 0;
            var8 = param2 + 57;
            L20: while (true) {
              L21: {
                if (var4 <= var7) {
                  break L21;
                } else {
                  var9 = (-var5 + var6) * var7 / var4 + var5;
                  var9 = var9 | (var9 << 777267248 | var9 << -827783032);
                  qn.e(param0, var8, 6, var9);
                  qn.e(param0 + this.field_l + -6, var8, 6, var9);
                  var7++;
                  var8++;
                  if (var16 != 0) {
                    break L21;
                  } else {
                    if (var16 == 0) {
                      continue L20;
                    } else {
                      break L21;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    boolean a(byte param0) {
        int fieldTemp$2 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (0 < this.field_O) {
            L1: {
              L2: {
                var2 = this.field_V;
                var3 = this.field_U;
                fieldTemp$2 = this.field_R + 1;
                this.field_R = this.field_R + 1;
                if (fieldTemp$2 < this.field_O) {
                  break L2;
                } else {
                  this.field_O = 0;
                  this.m(param0 + -22);
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = this.field_R * (-this.field_R + 2 * this.field_O);
              var5 = this.field_O * this.field_O;
              var3 = var4 * (-this.field_S + this.field_U) / var5 + this.field_S;
              var2 = this.field_T + var4 * (this.field_V - this.field_T) / var5;
              break L1;
            }
            this.a(var2, (byte) 127, var3);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == -1) {
          return super.a((byte) -1);
        } else {
          return true;
        }
    }

    final static int a(int param0, String param1, vh param2) {
        int discarded$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        vh var5 = null;
        CharSequence var6 = null;
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
        try {
          L0: {
            L1: {
              if (param0 == 15901) {
                break L1;
              } else {
                var5 = (vh) null;
                discarded$2 = sf.a(-112, (String) null, (vh) null);
                break L1;
              }
            }
            var3_int = param2.field_q;
            var6 = (CharSequence) ((Object) param1);
            var4 = nr.a(var6, false);
            param2.a(true, var4.length);
            param2.field_q = param2.field_q + ds.field_c.a(0, var4, var4.length, param2.field_o, param2.field_q, (byte) 28);
            stackOut_2_0 = param2.field_q + -var3_int;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("sf.GB(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!(-1 > (param0 ^ -1))) {
            this.a(param3, (byte) 115, param2);
            return;
        }
        this.field_R = 0;
        this.field_U = param2;
        this.field_O = param0;
        this.field_S = this.field_w;
        this.field_V = param3;
        this.field_T = this.field_l;
        if (param1) {
            this.a(-36, true, -43, -81);
        }
    }

    boolean k(int param0) {
        int var2 = 125 / ((param0 - -1) / 44);
        this.l(-87);
        return super.k(66);
    }

    public static void h(byte param0) {
        field_P = null;
        field_Q = null;
        if (param0 <= 21) {
            sf.h((byte) -93);
        }
    }

    final static void a(byte param0, of param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        of var3 = null;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param1.d(-123);
            var2_int = -20 % ((param0 - -16) / 62);
            var3 = (of) ((Object) be.field_u.e((byte) 125));
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      if (var3 == null) {
                        break L5;
                      } else {
                        stackOut_3_0 = var3.a(9687, param1);
                        stackIn_8_0 = stackOut_3_0 ? 1 : 0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var4 != 0) {
                          break L4;
                        } else {
                          if (!stackIn_4_0) {
                            break L5;
                          } else {
                            var3 = (of) ((Object) be.field_u.a((byte) 123));
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    if (var3 == null) {
                      break L3;
                    } else {
                      stackOut_7_0 = -123;
                      stackIn_8_0 = stackOut_7_0;
                      break L4;
                    }
                  }
                  fj.a((byte) stackIn_8_0, param1, var3);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                be.field_u.a((byte) -119, (tc) (param1));
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("sf.KB(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L6;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    void m(int param0) {
        int var2 = -52 % ((69 - param0) / 50);
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7_int = 0;
        vb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_40_0 = 0;
        wk stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int[][] stackIn_49_3 = null;
        wk stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int[][] stackIn_50_3 = null;
        wk stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int[][] stackIn_51_3 = null;
        int stackIn_51_4 = 0;
        int stackIn_55_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        wk stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int[][] stackOut_48_3 = null;
        wk stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int[][] stackOut_50_3 = null;
        int stackOut_50_4 = 0;
        wk stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int[][] stackOut_49_3 = null;
        int stackOut_49_4 = 0;
        boolean stackOut_54_0 = false;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                field_Q = (String) null;
                break L1;
              }
            }
            L2: {
              var6_int = og.field_p[param4] - -param4;
              if (cu.field_a) {
                L3: {
                  var7_int = bv.field_w.b(31, param0, param1, -1);
                  var8 = vs.field_e[param4].field_h;
                  if (4 == var8) {
                    break L3;
                  } else {
                    if (6 == var8) {
                      break L3;
                    } else {
                      if (-3 == (var8 ^ -1)) {
                        break L3;
                      } else {
                        if ((1 & var7_int ^ -1) != -1) {
                          qq.a(var6_int, param2 ^ -12933, param5, param3);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                L4: {
                  if (vs.field_e[param4].c(-121)) {
                    fe.a(wf.field_B[var6_int % 4], param3 - 10, -25 + param5);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var9 = fn.field_Q[vs.field_e[param4].field_h];
                  if (var9 > -1) {
                    L6: {
                      if (2 == var9) {
                        break L6;
                      } else {
                        L7: {
                          if ((vs.field_e[param4].field_h ^ -1) == -4) {
                            break L7;
                          } else {
                            L8: {
                              if ((var9 ^ -1) == -2) {
                                break L8;
                              } else {
                                L9: {
                                  if (var9 == 9) {
                                    break L9;
                                  } else {
                                    L10: {
                                      if (8 != var9) {
                                        break L10;
                                      } else {
                                        fe.a(oq.field_l[var6_int % 2 + 11], -10 + param3, param5 - 55);
                                        if (var11 == 0) {
                                          break L5;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (-1 == (var9 ^ -1)) {
                                        break L11;
                                      } else {
                                        if (4 == var9) {
                                          ab.a(35 + param5, og.field_p[param4] + param4, param3 + 30, false);
                                          if (var11 == 0) {
                                            break L5;
                                          } else {
                                            break L11;
                                          }
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    fe.a(oq.field_l[var6_int % 8 + 0], param3 + -10, param5 - 35);
                                    if (var11 == 0) {
                                      break L5;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                fe.a(oq.field_l[14 - -(var6_int % 2)], -10 + param3, param5 - 30);
                                if (var11 == 0) {
                                  break L5;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            fe.a(oq.field_l[8 - -(var6_int % 3)], -10 + param3, param5 + -55);
                            if (var11 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        ih.a((byte) -124, param3 + 30, param4 - -og.field_p[param4], 32 + param5);
                        if (var11 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    fe.a(oq.field_l[17], -10 + param3, param5 + -25);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                rs.a(26449, param3, param4, param5);
                break L2;
              } else {
                break L2;
              }
            }
            var7 = (vb) ((Object) jf.field_C.field_pc.e((byte) 106));
            L12: while (true) {
              L13: {
                L14: {
                  L15: {
                    L16: {
                      if (var7 == null) {
                        break L16;
                      } else {
                        stackOut_39_0 = var7.field_x;
                        stackIn_55_0 = stackOut_39_0;
                        stackIn_40_0 = stackOut_39_0;
                        if (var11 != 0) {
                          break L15;
                        } else {
                          L17: {
                            if (stackIn_40_0 != param4) {
                              break L17;
                            } else {
                              if (!var7.field_n) {
                                if (null == var7.field_r.field_w) {
                                  break L17;
                                } else {
                                  if (var7.field_r.field_w.field_x == null) {
                                    break L17;
                                  } else {
                                    L18: {
                                      if (!var7.field_z) {
                                        break L18;
                                      } else {
                                        if (var11 == 0) {
                                          break L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    L19: {
                                      var8 = var7.field_r.field_w.field_x.field_e[0];
                                      var9 = var7.field_r.field_w.field_x.field_e[1];
                                      var10 = var7.field_r.field_w.field_O;
                                      stackOut_48_0 = go.field_g;
                                      stackOut_48_1 = -30 + var8;
                                      stackOut_48_2 = var9 - 15;
                                      stackOut_48_3 = op.field_c;
                                      stackIn_50_0 = stackOut_48_0;
                                      stackIn_50_1 = stackOut_48_1;
                                      stackIn_50_2 = stackOut_48_2;
                                      stackIn_50_3 = stackOut_48_3;
                                      stackIn_49_0 = stackOut_48_0;
                                      stackIn_49_1 = stackOut_48_1;
                                      stackIn_49_2 = stackOut_48_2;
                                      stackIn_49_3 = stackOut_48_3;
                                      if (!bv.field_w.field_wb) {
                                        stackOut_50_0 = (wk) ((Object) stackIn_50_0);
                                        stackOut_50_1 = stackIn_50_1;
                                        stackOut_50_2 = stackIn_50_2;
                                        stackOut_50_3 = (int[][]) ((Object) stackIn_50_3);
                                        stackOut_50_4 = 0;
                                        stackIn_51_0 = stackOut_50_0;
                                        stackIn_51_1 = stackOut_50_1;
                                        stackIn_51_2 = stackOut_50_2;
                                        stackIn_51_3 = stackOut_50_3;
                                        stackIn_51_4 = stackOut_50_4;
                                        break L19;
                                      } else {
                                        stackOut_49_0 = (wk) ((Object) stackIn_49_0);
                                        stackOut_49_1 = stackIn_49_1;
                                        stackOut_49_2 = stackIn_49_2;
                                        stackOut_49_3 = (int[][]) ((Object) stackIn_49_3);
                                        stackOut_49_4 = 1;
                                        stackIn_51_0 = stackOut_49_0;
                                        stackIn_51_1 = stackOut_49_1;
                                        stackIn_51_2 = stackOut_49_2;
                                        stackIn_51_3 = stackOut_49_3;
                                        stackIn_51_4 = stackOut_49_4;
                                        break L19;
                                      }
                                    }
                                    ((wk) (Object) stackIn_51_0).b(stackIn_51_1, stackIn_51_2, stackIn_51_3[stackIn_51_4][var10]);
                                    wl.field_N.b(var8 + -40, -20 + var9);
                                    break L17;
                                  }
                                }
                              } else {
                                break L17;
                              }
                            }
                          }
                          var7 = (vb) ((Object) jf.field_C.field_pc.a((byte) 123));
                          if (var11 == 0) {
                            continue L12;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    if (vs.field_e[param4].field_c == null) {
                      break L14;
                    } else {
                      stackOut_54_0 = vs.field_e[param4].field_c.field_u;
                      stackIn_55_0 = stackOut_54_0 ? 1 : 0;
                      break L15;
                    }
                  }
                  if (stackIn_55_0 == 0) {
                    wl.field_N.b(param3, param5);
                    break L14;
                  } else {
                    break L13;
                  }
                }
                break L13;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var6), "sf.JB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void l(int param0) {
        if (!(0 < this.field_O)) {
            return;
        }
        this.a(this.field_V, (byte) 113, this.field_U);
        this.field_O = 0;
        int var2 = 40 % ((-25 - param0) / 57);
        this.m(-120);
    }

    sf(gk param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_R = 0;
        this.field_O = 0;
    }

    static {
        field_Q = "Disruptive behaviour";
        field_P = new int[]{22, 1, 0, 39, 28, 46, 9, 22, 22, 2, 22, 22, 22, 47, 5, 29, 22, 22, 6, 48, 44, 22, 22, 22, 4, 22, 10, 42, 15, 40, 17, 10, 22, 11, 11, 32, 22, 12, 16, 23, 14, 2, 3, 22, 22, 20, 10, 22, 22, 22, 22, 43, 18, 19, 34, 24, 31, 21, 35, 8, 37, 36, 38, 25, 10, 33, 30, 22, 22, 22, 7, 41, 45, 22, 28, 13, 49, 22, 22, 22, 22, 28, 50, 51, 52, 53, 54, 55, 56, 53};
    }
}
