/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tra extends rj {
    private long field_H;
    static String field_A;
    private int field_I;
    private int field_F;
    private boolean field_E;
    private long field_G;
    private int field_B;
    private boolean field_D;
    static String[] field_z;
    private int field_C;

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        oaa var5_ref = null;
        long var6 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                ((tra) this).field_I = 26;
                break L1;
              }
            }
            L2: {
              if (((tra) this).field_r == null) {
                break L2;
              } else {
                if (param3 == 0) {
                  ((tra) this).field_r.a((ae) this, param0, param2 ^ 16777215, param1, ((tra) this).field_y);
                  if (!(((tra) this).field_r instanceof oaa)) {
                    break L2;
                  } else {
                    L3: {
                      var5_ref = (oaa) (Object) ((tra) this).field_r;
                      if (((tra) this).field_B == ((tra) this).field_I) {
                        break L3;
                      } else {
                        var5_ref.a(-1, (ae) this, param1, param0, ((tra) this).field_B, ((tra) this).field_I);
                        break L3;
                      }
                    }
                    var6 = bva.b((byte) -107);
                    if ((-((tra) this).field_H + var6) % 1000L >= 500L) {
                      break L2;
                    } else {
                      var5_ref.a(((tra) this).field_I, param1, param2 + -22502, param0, (ae) this);
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var5, "tra.T(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_88_0 = 0;
        Object stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        Object stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        Object stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_97_0 = 0;
        Object stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        Object stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int stackIn_106_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_116_0 = 0;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        String stackIn_121_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_107_0 = 0;
        Object stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        Object stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        Object stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        int stackOut_105_0 = 0;
        Object stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        Object stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        Object stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        int stackOut_96_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        try {
          L0: {
            L1: {
              ((tra) this).field_H = bva.b((byte) -107);
              if (param0 == 60) {
                break L1;
              } else {
                if (param0 != 62) {
                  L2: {
                    if (param3) {
                      break L2;
                    } else {
                      ((tra) this).field_F = 110;
                      break L2;
                    }
                  }
                  L3: {
                    if (param0 < 32) {
                      break L3;
                    } else {
                      if (param0 > 126) {
                        break L3;
                      } else {
                        L4: {
                          if (((tra) this).field_I == ((tra) this).field_B) {
                            break L4;
                          } else {
                            this.k(0);
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (-1 == ((tra) this).field_C) {
                              break L6;
                            } else {
                              if (~((tra) this).field_o.length() > ~((tra) this).field_C) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L7: {
                            L8: {
                              if (~((tra) this).field_I <= ~((tra) this).field_o.length()) {
                                break L8;
                              } else {
                                ((tra) this).field_o = ((tra) this).field_o.substring(0, ((tra) this).field_I) + param0 + ((tra) this).field_o.substring(((tra) this).field_I, ((tra) this).field_o.length());
                                ((tra) this).field_I = ((tra) this).field_I + 1;
                                ((tra) this).field_B = ((tra) this).field_I;
                                if (!TombRacer.field_G) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            ((tra) this).field_o = ((tra) this).field_o + param0;
                            int dupTemp$1 = ((tra) this).field_o.length();
                            ((tra) this).field_I = dupTemp$1;
                            ((tra) this).field_B = dupTemp$1;
                            break L7;
                          }
                          ((tra) this).i(200);
                          break L5;
                        }
                        stackOut_31_0 = 1;
                        stackIn_32_0 = stackOut_31_0;
                        return stackIn_32_0 != 0;
                      }
                    }
                  }
                  L9: {
                    if (param2 != 85) {
                      if (param2 == 101) {
                        if (((tra) this).field_B == ((tra) this).field_I) {
                          if (~((tra) this).field_I <= ~((tra) this).field_o.length()) {
                            break L9;
                          } else {
                            ((tra) this).field_B = 1 + ((tra) this).field_I;
                            this.k(0);
                            stackOut_113_0 = 1;
                            stackIn_114_0 = stackOut_113_0;
                            return stackIn_114_0 != 0;
                          }
                        } else {
                          this.k(0);
                          stackOut_110_0 = 1;
                          stackIn_111_0 = stackOut_110_0;
                          return stackIn_111_0 != 0;
                        }
                      } else {
                        if (param2 == 13) {
                          ((tra) this).f(23);
                          stackOut_107_0 = 1;
                          stackIn_108_0 = stackOut_107_0;
                          return stackIn_108_0 != 0;
                        } else {
                          if (param2 == 96) {
                            if (0 < ((tra) this).field_I) {
                              L10: {
                                stackOut_101_0 = this;
                                stackOut_101_1 = 95;
                                stackIn_104_0 = stackOut_101_0;
                                stackIn_104_1 = stackOut_101_1;
                                stackIn_102_0 = stackOut_101_0;
                                stackIn_102_1 = stackOut_101_1;
                                if (!oj.field_tb[82]) {
                                  stackOut_104_0 = this;
                                  stackOut_104_1 = stackIn_104_1;
                                  stackOut_104_2 = -1 + ((tra) this).field_I;
                                  stackIn_105_0 = stackOut_104_0;
                                  stackIn_105_1 = stackOut_104_1;
                                  stackIn_105_2 = stackOut_104_2;
                                  break L10;
                                } else {
                                  stackOut_102_0 = this;
                                  stackOut_102_1 = stackIn_102_1;
                                  stackOut_102_2 = this.b(param3);
                                  stackIn_105_0 = stackOut_102_0;
                                  stackIn_105_1 = stackOut_102_1;
                                  stackIn_105_2 = stackOut_102_2;
                                  break L10;
                                }
                              }
                              this.a(stackIn_105_1, stackIn_105_2);
                              stackOut_105_0 = 1;
                              stackIn_106_0 = stackOut_105_0;
                              return stackIn_106_0 != 0;
                            } else {
                              break L9;
                            }
                          } else {
                            if (97 == param2) {
                              if (~((tra) this).field_I > ~((tra) this).field_o.length()) {
                                L11: {
                                  stackOut_92_0 = this;
                                  stackOut_92_1 = -126;
                                  stackIn_95_0 = stackOut_92_0;
                                  stackIn_95_1 = stackOut_92_1;
                                  stackIn_93_0 = stackOut_92_0;
                                  stackIn_93_1 = stackOut_92_1;
                                  if (oj.field_tb[82]) {
                                    stackOut_95_0 = this;
                                    stackOut_95_1 = stackIn_95_1;
                                    stackOut_95_2 = this.b(-59);
                                    stackIn_96_0 = stackOut_95_0;
                                    stackIn_96_1 = stackOut_95_1;
                                    stackIn_96_2 = stackOut_95_2;
                                    break L11;
                                  } else {
                                    stackOut_93_0 = this;
                                    stackOut_93_1 = stackIn_93_1;
                                    stackOut_93_2 = ((tra) this).field_I + 1;
                                    stackIn_96_0 = stackOut_93_0;
                                    stackIn_96_1 = stackOut_93_1;
                                    stackIn_96_2 = stackOut_93_2;
                                    break L11;
                                  }
                                }
                                this.a(stackIn_96_1, stackIn_96_2);
                                stackOut_96_0 = 1;
                                stackIn_97_0 = stackOut_96_0;
                                return stackIn_97_0 != 0;
                              } else {
                                break L9;
                              }
                            } else {
                              if (param2 != 102) {
                                if (param2 != 103) {
                                  if (param2 == 84) {
                                    this.c(93);
                                    stackOut_87_0 = 1;
                                    stackIn_88_0 = stackOut_87_0;
                                    return stackIn_88_0 != 0;
                                  } else {
                                    L12: {
                                      if (!oj.field_tb[82]) {
                                        break L12;
                                      } else {
                                        if (param2 == 65) {
                                          this.l(10571);
                                          stackOut_85_0 = 1;
                                          stackIn_86_0 = stackOut_85_0;
                                          return stackIn_86_0 != 0;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    L13: {
                                      if (!oj.field_tb[82]) {
                                        break L13;
                                      } else {
                                        if (param2 != 66) {
                                          break L13;
                                        } else {
                                          this.e(0);
                                          stackOut_75_0 = 1;
                                          stackIn_76_0 = stackOut_75_0;
                                          return stackIn_76_0 != 0;
                                        }
                                      }
                                    }
                                    if (!oj.field_tb[82]) {
                                      break L9;
                                    } else {
                                      if (param2 == 67) {
                                        this.d(31);
                                        stackOut_83_0 = 1;
                                        stackIn_84_0 = stackOut_83_0;
                                        return stackIn_84_0 != 0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                } else {
                                  this.a(-123, ((tra) this).field_o.length());
                                  stackOut_60_0 = 1;
                                  stackIn_61_0 = stackOut_60_0;
                                  return stackIn_61_0 != 0;
                                }
                              } else {
                                this.a(-127, 0);
                                stackOut_57_0 = 1;
                                stackIn_58_0 = stackOut_57_0;
                                return stackIn_58_0 != 0;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (((tra) this).field_B == ((tra) this).field_I) {
                        if (((tra) this).field_I > 0) {
                          ((tra) this).field_B = -1 + ((tra) this).field_I;
                          this.k(0);
                          stackOut_42_0 = 1;
                          stackIn_43_0 = stackOut_42_0;
                          return stackIn_43_0 != 0;
                        } else {
                          break L9;
                        }
                      } else {
                        this.k(0);
                        stackOut_37_0 = 1;
                        stackIn_38_0 = stackOut_37_0;
                        return stackIn_38_0 != 0;
                      }
                    }
                  }
                  stackOut_115_0 = 0;
                  stackIn_116_0 = stackOut_115_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_117_0 = (RuntimeException) var5;
            stackOut_117_1 = new StringBuilder().append("tra.P(").append(param0).append(44);
            stackIn_120_0 = stackOut_117_0;
            stackIn_120_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param1 == null) {
              stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
              stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
              stackOut_120_2 = "null";
              stackIn_121_0 = stackOut_120_0;
              stackIn_121_1 = stackOut_120_1;
              stackIn_121_2 = stackOut_120_2;
              break L14;
            } else {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "{...}";
              stackIn_121_0 = stackOut_118_0;
              stackIn_121_1 = stackOut_118_1;
              stackIn_121_2 = stackOut_118_2;
              break L14;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_121_0, stackIn_121_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_116_0 != 0;
    }

    final static void a(int param0, nh[] param1, byte param2, int param3, ha param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        ssa var10_ref = null;
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
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_111_0 = 0;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_119_2 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_100_0 = 0;
        byte stackOut_110_0 = 0;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        var27 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var10_ref = uja.a((byte) 65, param4);
            if (param1 != null) {
              L1: {
                if (param5 <= 0) {
                  break L1;
                } else {
                  if (param7 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (param1[3] == null) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L2;
                      } else {
                        stackOut_11_0 = param1[3].d();
                        stackIn_14_0 = stackOut_11_0;
                        break L2;
                      }
                    }
                    L3: {
                      var11 = stackIn_14_0;
                      if (null == param1[5]) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        break L3;
                      } else {
                        stackOut_15_0 = param1[5].d();
                        stackIn_18_0 = stackOut_15_0;
                        break L3;
                      }
                    }
                    L4: {
                      var12 = stackIn_18_0;
                      if (param1[1] == null) {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        break L4;
                      } else {
                        stackOut_19_0 = param1[1].b();
                        stackIn_22_0 = stackOut_19_0;
                        break L4;
                      }
                    }
                    L5: {
                      var13 = stackIn_22_0;
                      if (null != param1[7]) {
                        stackOut_25_0 = param1[7].b();
                        stackIn_26_0 = stackOut_25_0;
                        break L5;
                      } else {
                        stackOut_23_0 = 0;
                        stackIn_26_0 = stackOut_23_0;
                        break L5;
                      }
                    }
                    L6: {
                      var14 = stackIn_26_0;
                      var15 = param3 + param5;
                      var16 = param7 + param8;
                      var17 = var11 + param3;
                      var18 = -var12 + var15;
                      var19 = var13 + param8;
                      var20 = -var14 + var16;
                      var21 = var17;
                      var22 = var18;
                      if (var21 > var22) {
                        var22 = param3 + var11 * param5 / (var11 - -var12);
                        var21 = param3 + var11 * param5 / (var11 - -var12);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var23 = var19;
                      var24 = var20;
                      if (~var23 >= ~var24) {
                        break L7;
                      } else {
                        var24 = var13 * param7 / (var13 + var14) + param8;
                        var23 = var13 * param7 / (var13 + var14) + param8;
                        break L7;
                      }
                    }
                    L8: {
                      if (null == param1[0]) {
                        break L8;
                      } else {
                        var10_ref.a(var21, param8, (byte) -12, var23, param3);
                        param1[0].a(param3, param8, param0, param9, param6);
                        var10_ref.a(97);
                        break L8;
                      }
                    }
                    L9: {
                      if (null == param1[2]) {
                        break L9;
                      } else {
                        var10_ref.a(var15, param8, (byte) -12, var23, var22);
                        param1[2].a(var18, param8, param0, param9, param6);
                        var10_ref.a(-88);
                        break L9;
                      }
                    }
                    L10: {
                      if (param1[6] != null) {
                        var10_ref.a(var21, var24, (byte) -12, var16, param3);
                        param1[6].a(param3, var20, param0, param9, param6);
                        var10_ref.a(-33);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (null == param1[8]) {
                        break L11;
                      } else {
                        var10_ref.a(var15, var24, (byte) -12, var16, var22);
                        param1[8].a(var18, var20, param0, param9, param6);
                        var10_ref.a(-66);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param1[1]) {
                        break L12;
                      } else {
                        if (param1[1].d() == 0) {
                          break L12;
                        } else {
                          var10_ref.a(var22, param8, (byte) -12, var23, var21);
                          var25 = var17;
                          L13: while (true) {
                            L14: {
                              if (~var25 <= ~var18) {
                                break L14;
                              } else {
                                param1[1].a(var25, param8, param0, param9, param6);
                                var25 = var25 + param1[1].d();
                                if (var27 != 0) {
                                  break L12;
                                } else {
                                  if (var27 == 0) {
                                    continue L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            var10_ref.a(100);
                            break L12;
                          }
                        }
                      }
                    }
                    L15: {
                      if (null == param1[7]) {
                        break L15;
                      } else {
                        if (0 == param1[7].d()) {
                          break L15;
                        } else {
                          var10_ref.a(var22, var24, (byte) -12, var16, var21);
                          var25 = var17;
                          L16: while (true) {
                            L17: {
                              if (var25 >= var18) {
                                break L17;
                              } else {
                                param1[7].a(var25, var20, param0, param9, param6);
                                var25 = var25 + param1[7].d();
                                if (var27 != 0) {
                                  break L15;
                                } else {
                                  if (var27 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            var10_ref.a(121);
                            break L15;
                          }
                        }
                      }
                    }
                    L18: {
                      if (param1[3] == null) {
                        break L18;
                      } else {
                        if (param1[3].b() == 0) {
                          break L18;
                        } else {
                          var10_ref.a(var21, var23, (byte) -12, var24, param3);
                          var25 = var19;
                          L19: while (true) {
                            L20: {
                              if (~var25 <= ~var20) {
                                break L20;
                              } else {
                                param1[3].a(param3, var25, param0, param9, param6);
                                var25 = var25 + param1[3].b();
                                if (var27 != 0) {
                                  break L18;
                                } else {
                                  if (var27 == 0) {
                                    continue L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            var10_ref.a(-83);
                            break L18;
                          }
                        }
                      }
                    }
                    L21: {
                      if (param1[5] == null) {
                        break L21;
                      } else {
                        if (param1[5].b() == 0) {
                          break L21;
                        } else {
                          var10_ref.a(var15, var23, (byte) -12, var24, var22);
                          var25 = var19;
                          L22: while (true) {
                            L23: {
                              if (var20 <= var25) {
                                break L23;
                              } else {
                                param1[5].a(var18, var25, param0, param9, param6);
                                var25 = var25 + param1[5].b();
                                if (var27 != 0) {
                                  break L21;
                                } else {
                                  if (var27 == 0) {
                                    continue L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                            var10_ref.a(99);
                            break L21;
                          }
                        }
                      }
                    }
                    L24: {
                      L25: {
                        if (param1[4] == null) {
                          break L25;
                        } else {
                          if (0 == param1[4].d()) {
                            break L25;
                          } else {
                            if (param1[4].b() != 0) {
                              var10_ref.a(var22, var23, (byte) -12, var24, var21);
                              var25 = var19;
                              L26: while (true) {
                                L27: {
                                  if (~var25 <= ~var20) {
                                    break L27;
                                  } else {
                                    stackOut_100_0 = var17;
                                    stackIn_111_0 = stackOut_100_0;
                                    stackIn_101_0 = stackOut_100_0;
                                    if (var27 != 0) {
                                      break L24;
                                    } else {
                                      var26 = stackIn_101_0;
                                      L28: while (true) {
                                        L29: {
                                          L30: {
                                            if (var26 >= var18) {
                                              break L30;
                                            } else {
                                              param1[4].a(var26, var25, param0, param9, param6);
                                              var26 = var26 + param1[4].d();
                                              if (var27 != 0) {
                                                break L29;
                                              } else {
                                                if (var27 == 0) {
                                                  continue L28;
                                                } else {
                                                  break L30;
                                                }
                                              }
                                            }
                                          }
                                          var25 = var25 + param1[4].b();
                                          break L29;
                                        }
                                        if (var27 == 0) {
                                          continue L26;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                  }
                                }
                                var10_ref.a(123);
                                break L25;
                              }
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                      stackOut_110_0 = param2;
                      stackIn_111_0 = stackOut_110_0;
                      break L24;
                    }
                    L31: {
                      if (stackIn_111_0 < -39) {
                        break L31;
                      } else {
                        field_A = null;
                        break L31;
                      }
                    }
                    break L0;
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
          L32: {
            var10 = decompiledCaughtException;
            stackOut_115_0 = (RuntimeException) var10;
            stackOut_115_1 = new StringBuilder().append("tra.AA(").append(param0).append(44);
            stackIn_118_0 = stackOut_115_0;
            stackIn_118_1 = stackOut_115_1;
            stackIn_116_0 = stackOut_115_0;
            stackIn_116_1 = stackOut_115_1;
            if (param1 == null) {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "null";
              stackIn_119_0 = stackOut_118_0;
              stackIn_119_1 = stackOut_118_1;
              stackIn_119_2 = stackOut_118_2;
              break L32;
            } else {
              stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
              stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
              stackOut_116_2 = "{...}";
              stackIn_119_0 = stackOut_116_0;
              stackIn_119_1 = stackOut_116_1;
              stackIn_119_2 = stackOut_116_2;
              break L32;
            }
          }
          L33: {
            stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
            stackOut_119_1 = ((StringBuilder) (Object) stackIn_119_1).append(stackIn_119_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_122_0 = stackOut_119_0;
            stackIn_122_1 = stackOut_119_1;
            stackIn_120_0 = stackOut_119_0;
            stackIn_120_1 = stackOut_119_1;
            if (param4 == null) {
              stackOut_122_0 = (RuntimeException) (Object) stackIn_122_0;
              stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
              stackOut_122_2 = "null";
              stackIn_123_0 = stackOut_122_0;
              stackIn_123_1 = stackOut_122_1;
              stackIn_123_2 = stackOut_122_2;
              break L33;
            } else {
              stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
              stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
              stackOut_120_2 = "{...}";
              stackIn_123_0 = stackOut_120_0;
              stackIn_123_1 = stackOut_120_1;
              stackIn_123_2 = stackOut_120_2;
              break L33;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_123_0, stackIn_123_2 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    private final void e(int param0) {
        try {
            RuntimeException runtimeException = null;
            String var2 = null;
            RuntimeException decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 0) {
                  L1: {
                    var2 = this.h(-106);
                    if (var2.length() > 0) {
                      java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.h(86)), (java.awt.datatransfer.ClipboardOwner) null);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              runtimeException = decompiledCaughtException;
              throw tba.a((Throwable) (Object) runtimeException, "tra.O(" + param0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void g(int param0) {
        RuntimeException runtimeException = null;
        pn var1 = null;
        ot var1_ref = null;
        byte[] var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ak.field_o) {
                var1_ref = new ot();
                var2 = var1_ref.a(128, true, 16, 128);
                ak.field_o = bw.a(270, var2, false);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 12890) {
              L2: {
                if (lt.field_f != null) {
                  break L2;
                } else {
                  var1 = new pn();
                  var2 = var1.a(128, 0, 16, 128);
                  lt.field_f = bw.a(270, var2, false);
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "tra.V(" + param0 + 41);
        }
    }

    private final void h(byte param0) {
        RuntimeException var2 = null;
        oaa var2_ref = null;
        bja var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!((tra) this).field_D) {
              ((tra) this).field_t = 0;
              ((tra) this).field_j = 0;
              return;
            } else {
              if (!(((tra) this).field_r instanceof oaa)) {
                return;
              } else {
                var2_ref = (oaa) (Object) ((tra) this).field_r;
                var3 = var2_ref.a((ae) this, 14157);
                var4 = var3.a(0);
                var5 = var2_ref.a((byte) 117, (ae) this);
                var6 = var2_ref.a((byte) -90) >> 1;
                var7 = 28 / ((param0 - 47) / 36);
                if (var4 < -var6 + var5) {
                  ((tra) this).field_j = 0;
                  ((tra) this).field_t = 0;
                  return;
                } else {
                  L1: {
                    L2: {
                      var8 = ((tra) this).field_t - -var3.a((byte) -59, ((tra) this).field_I);
                      if (var8 > var5 - var6) {
                        break L2;
                      } else {
                        if (~var6 < ~var8) {
                          ((tra) this).field_t = ((tra) this).field_t + (var6 - var8);
                          if (var9 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    ((tra) this).field_t = ((tra) this).field_t + -var8 + (var5 + -var6);
                    break L1;
                  }
                  L3: {
                    L4: {
                      if (0 < ((tra) this).field_t) {
                        break L4;
                      } else {
                        if (((tra) this).field_t < var6 + -var5) {
                          ((tra) this).field_t = -var5 + var6;
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    ((tra) this).field_t = 0;
                    break L3;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "tra.LA(" + param0 + 41);
        }
    }

    private final void k(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                tra.g((byte) 76);
                break L1;
              }
            }
            L2: {
              if (((tra) this).field_B != ((tra) this).field_I) {
                L3: {
                  if (((tra) this).field_I <= ((tra) this).field_B) {
                    stackOut_9_0 = ((tra) this).field_I;
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_7_0 = ((tra) this).field_B;
                    stackIn_10_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var2_int = stackIn_10_0;
                  if (((tra) this).field_B >= ((tra) this).field_I) {
                    stackOut_13_0 = ((tra) this).field_B;
                    stackIn_14_0 = stackOut_13_0;
                    break L4;
                  } else {
                    stackOut_11_0 = ((tra) this).field_I;
                    stackIn_14_0 = stackOut_11_0;
                    break L4;
                  }
                }
                var3 = stackIn_14_0;
                ((tra) this).field_I = var2_int;
                ((tra) this).field_B = var2_int;
                ((tra) this).field_o = ((tra) this).field_o.substring(0, var2_int) + ((tra) this).field_o.substring(var3, ((tra) this).field_o.length());
                ((tra) this).i(200);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "tra.NA(" + param0 + 41);
        }
    }

    private final void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = 36 / ((-89 - param0) / 32);
              ((tra) this).field_I = param1;
              if (!oj.field_tb[81]) {
                ((tra) this).field_B = ((tra) this).field_I;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "tra.OA(" + param0 + 44 + param1 + 41);
        }
    }

    void a(int param0, int param1, ae param2, int param3) {
        RuntimeException var5 = null;
        oaa var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.h((byte) -105);
              if (((tra) this).field_s != 1) {
                break L1;
              } else {
                L2: {
                  if (((tra) this).field_r instanceof oaa) {
                    var5_ref = (oaa) (Object) ((tra) this).field_r;
                    var6 = var5_ref.a((ae) this, (byte) 4, sta.field_B, param0, param3, jba.field_j);
                    if (var6 != -1) {
                      L3: {
                        if (!((tra) this).field_E) {
                          break L3;
                        } else {
                          if (~var6 <= ~((tra) this).field_F) {
                            break L3;
                          } else {
                            if (~var6 < ~((tra) this).field_B) {
                              var6 = ((tra) this).field_F;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((tra) this).field_I = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((tra) this).field_H = bva.b((byte) -107);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("tra.A(").append(param0).append(44).append(param1).append(44);
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param3 + 41);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 70) {
                break L1;
              } else {
                ((tra) this).f(18);
                break L1;
              }
            }
            L2: {
              if (!super.a(92, param1, param2, param3, param4, param5, param6)) {
                break L2;
              } else {
                if (!(((tra) this).field_r instanceof oaa)) {
                  break L2;
                } else {
                  L3: {
                    var8_int = ((oaa) (Object) ((tra) this).field_r).a((ae) this, (byte) 4, sta.field_B, param1, param2, jba.field_j);
                    stackOut_7_0 = this;
                    stackOut_7_1 = 60;
                    stackIn_10_0 = stackOut_7_0;
                    stackIn_10_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (-1 == var8_int) {
                      stackOut_10_0 = this;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      break L3;
                    } else {
                      stackOut_8_0 = this;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = var8_int;
                      stackIn_11_0 = stackOut_8_0;
                      stackIn_11_1 = stackOut_8_1;
                      stackIn_11_2 = stackOut_8_2;
                      break L3;
                    }
                  }
                  L4: {
                    this.a(stackIn_11_1, stackIn_11_2);
                    var8_long = bva.b((byte) -107);
                    stackOut_11_0 = this;
                    stackIn_14_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (250L <= -((tra) this).field_G + var8_long) {
                      stackOut_14_0 = this;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L4;
                    } else {
                      stackOut_12_0 = this;
                      stackOut_12_1 = 1;
                      stackIn_15_0 = stackOut_12_0;
                      stackIn_15_1 = stackOut_12_1;
                      break L4;
                    }
                  }
                  L5: {
                    ((tra) this).field_E = stackIn_15_1 != 0;
                    if (((tra) this).field_E) {
                      L6: {
                        ((tra) this).field_B = this.b(true);
                        ((tra) this).field_I = this.b(-76);
                        if (((tra) this).field_I <= 0) {
                          break L6;
                        } else {
                          if (((tra) this).field_o.charAt(-1 + ((tra) this).field_I) != 32) {
                            break L6;
                          } else {
                            ((tra) this).field_I = ((tra) this).field_I - 1;
                            break L6;
                          }
                        }
                      }
                      ((tra) this).field_F = ((tra) this).field_I;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((tra) this).field_G = var8_long;
                  stackOut_25_0 = 1;
                  stackIn_26_0 = stackOut_25_0;
                  return stackIn_26_0 != 0;
                }
              }
            }
            stackOut_27_0 = 0;
            stackIn_28_0 = stackOut_27_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var8;
            stackOut_29_1 = new StringBuilder().append("tra.L(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param5 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param6 + 41);
        }
        return stackIn_28_0 != 0;
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 54 / ((param0 - 31) / 62);
              if (!(((tra) this).field_h instanceof cd)) {
                break L1;
              } else {
                ((cd) (Object) ((tra) this).field_h).a(-6038, (tra) this);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "tra.SA(" + param0 + 41);
        }
    }

    private final void d(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    var3 = -61 % ((-29 - param0) / 55);
                    var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                    this.k(0);
                    this.a(var2, false);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              throw tba.a((Throwable) (Object) var2_ref2, "tra.H(" + param0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int b(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        char stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_13_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_2_0 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (0 != ((tra) this).field_I) {
              var2_int = -1 + ((tra) this).field_I;
              L1: while (true) {
                L2: {
                  L3: {
                    if (0 >= var2_int) {
                      break L3;
                    } else {
                      stackOut_6_0 = ((tra) this).field_o.charAt(var2_int - 1);
                      stackOut_6_1 = 32;
                      stackIn_14_0 = stackOut_6_0;
                      stackIn_14_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (stackIn_7_0 == stackIn_7_1) {
                          break L3;
                        } else {
                          var2_int--;
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_13_0 = param0;
                  stackOut_13_1 = 1;
                  stackIn_14_0 = stackOut_13_0 ? 1 : 0;
                  stackIn_14_1 = stackOut_13_1;
                  break L2;
                }
                L4: {
                  if (stackIn_14_0 == stackIn_14_1) {
                    break L4;
                  } else {
                    ((tra) this).field_F = -50;
                    break L4;
                  }
                }
                stackOut_17_0 = var2_int;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
            } else {
              stackOut_2_0 = ((tra) this).field_I;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "tra.F(" + param0 + 41);
        }
        return stackIn_18_0;
    }

    void i(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 200) {
                break L1;
              } else {
                this.k(-51);
                break L1;
              }
            }
            L2: {
              if (!(((tra) this).field_h instanceof cd)) {
                break L2;
              } else {
                ((cd) (Object) ((tra) this).field_h).a((tra) this, -10);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "tra.M(" + param0 + 41);
        }
    }

    private final void a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (((tra) this).field_C == -1) {
                break L1;
              } else {
                var3_int = ((tra) this).field_C - ((tra) this).field_o.length();
                if (var3_int < 0) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              L3: {
                if (~((tra) this).field_I != ~((tra) this).field_o.length()) {
                  break L3;
                } else {
                  ((tra) this).field_o = ((tra) this).field_o + param0;
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((tra) this).field_o = ((tra) this).field_o.substring(0, ((tra) this).field_I) + param0 + ((tra) this).field_o.substring(((tra) this).field_I, ((tra) this).field_o.length());
              break L2;
            }
            L4: {
              ((tra) this).field_I = ((tra) this).field_I + param0.length();
              if (!param1) {
                break L4;
              } else {
                this.d(104);
                break L4;
              }
            }
            ((tra) this).field_B = ((tra) this).field_I;
            ((tra) this).i(200);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("tra.J(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
    }

    private final void l(int param0) {
        try {
            this.e(0);
            this.k(param0 ^ param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tra.QA(" + param0 + 41);
        }
    }

    final void a(boolean param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (null == param2) {
                param2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -16719) {
                break L2;
              } else {
                ((tra) this).field_D = false;
                break L2;
              }
            }
            L3: {
              ((tra) this).field_o = param2;
              var4_int = param2.length();
              if (-1 == ((tra) this).field_C) {
                break L3;
              } else {
                if (var4_int > ((tra) this).field_C) {
                  ((tra) this).field_o = ((tra) this).field_o.substring(0, ((tra) this).field_C);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              int dupTemp$2 = ((tra) this).field_o.length();
              ((tra) this).field_B = dupTemp$2;
              ((tra) this).field_I = dupTemp$2;
              if (param0) {
                break L4;
              } else {
                ((tra) this).i(param1 ^ -16775);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("tra.MA(").append(param0).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final static void g(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (ff.field_w > 32) {
                  break L2;
                } else {
                  cf.a(0, param0 + 8);
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var1_int = ff.field_w % 32;
                if (0 == var1_int) {
                  var1_int = 32;
                  break L3;
                } else {
                  break L3;
                }
              }
              cf.a(-var1_int + ff.field_w, param0 + -1);
              break L1;
            }
            L4: {
              if (param0 == -113) {
                break L4;
              } else {
                tra.g(-73);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "tra.RA(" + param0 + 41);
        }
    }

    final void f(int param0) {
        try {
            ((tra) this).field_o = "";
            ((tra) this).field_I = 0;
            int var2_int = -100 % ((param0 - -80) / 39);
            ((tra) this).field_B = 0;
            ((tra) this).i(200);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tra.KA(" + param0 + 41);
        }
    }

    public static void j(int param0) {
        try {
            field_z = null;
            field_A = null;
            int var1_int = 88 / ((-30 - param0) / 62);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tra.N(" + param0 + 41);
        }
    }

    tra(String param0, qc param1, int param2) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((tra) this).field_F = -1;
        ((tra) this).field_E = false;
        ((tra) this).field_G = 0L;
        try {
          L0: {
            ((tra) this).field_r = afa.field_c.field_e;
            ((tra) this).field_C = param2;
            ((tra) this).a(true, -16719, param0);
            ((tra) this).field_D = true;
            ((tra) this).field_H = bva.b((byte) -107);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("tra.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    private final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = ((tra) this).field_o.length();
            if (var2_int != ((tra) this).field_I) {
              var3 = 99 / ((param0 - 37) / 56);
              var4 = 1 + ((tra) this).field_I;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var2_int >= ~var4) {
                      break L3;
                    } else {
                      stackOut_6_0 = ~((tra) this).field_o.charAt(-1 + var4);
                      stackIn_14_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (stackIn_7_0 == -33) {
                          break L3;
                        } else {
                          var4++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_13_0 = var4;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = ((tra) this).field_I;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "tra.PA(" + param0 + 41);
        }
        return stackIn_14_0;
    }

    private final String h(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        String stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        String stackOut_8_0 = null;
        try {
          L0: {
            L1: {
              var3 = -77 / ((param0 - -20) / 55);
              if (((tra) this).field_I > ((tra) this).field_B) {
                stackOut_3_0 = ((tra) this).field_B;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = ((tra) this).field_I;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var2_int = stackIn_4_0;
              if (((tra) this).field_I > ((tra) this).field_B) {
                stackOut_7_0 = ((tra) this).field_I;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = ((tra) this).field_B;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            var4 = stackIn_8_0;
            stackOut_8_0 = ((tra) this).field_o.substring(var2_int, var4);
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "tra.U(" + param0 + 41);
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Players: <%0>/<%1>";
        field_z = new String[]{null, "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "Esc", null, null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "`", null, null, null, "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", null, null, null, null, "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'", "#", null, null, null, null, "Z", "X", "C", "V", "B", "N", "M", "<", ">", "/", "\\", null, null, null, null, null, "Tab", "Shift", "Ctrl", "Space", "Enter", "Backspace", "Alt", "Keypad +", "Keypad -", "Keypad *", "Keypad /", "Keypad 5", null, null, null, null, "Left Arrow", "Right Arrow", "Up Arrow", "Down Arrow", "Insert", "Delete", "Home", "End", "Page Up", "Page Down", null, null, null, null, null, null};
    }
}
