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
        RuntimeException decompiledCaughtException = null;
        oaa var5 = null;
        RuntimeException var5_ref = null;
        long var6 = 0L;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                this.field_I = 26;
                break L1;
              }
            }
            L2: {
              if (this.field_r == null) {
                break L2;
              } else {
                if (param3 == 0) {
                  this.field_r.a((ae) (this), param0, param2 ^ 16777215, param1, this.field_y);
                  if (!(this.field_r instanceof oaa)) {
                    break L2;
                  } else {
                    L3: {
                      var5 = (oaa) ((Object) this.field_r);
                      if (this.field_B == this.field_I) {
                        break L3;
                      } else {
                        var5.a(-1, (ae) (this), param1, param0, this.field_B, this.field_I);
                        break L3;
                      }
                    }
                    var6 = bva.b((byte) -107);
                    if (-501L >= ((-this.field_H + var6) % 1000L ^ -1L)) {
                      break L2;
                    } else {
                      var5.a(this.field_I, param1, param2 + -22502, param0, (ae) (this));
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
          var5_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var5_ref), "tra.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        int dupTemp$0 = 0;
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
        Object stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        Object stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_97_0 = 0;
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
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        String stackIn_121_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              this.field_H = bva.b((byte) -107);
              if (param0 == 60) {
                break L1;
              } else {
                if (-63 != (param0 ^ -1)) {
                  L2: {
                    if (param3) {
                      break L2;
                    } else {
                      this.field_F = 110;
                      break L2;
                    }
                  }
                  L3: {
                    if ((param0 ^ -1) > -33) {
                      break L3;
                    } else {
                      if (-127 > (param0 ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_I == this.field_B) {
                            break L4;
                          } else {
                            this.k(0);
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (-1 == this.field_C) {
                              break L6;
                            } else {
                              if ((this.field_o.length() ^ -1) > (this.field_C ^ -1)) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L7: {
                            L8: {
                              if ((this.field_I ^ -1) <= (this.field_o.length() ^ -1)) {
                                break L8;
                              } else {
                                this.field_o = this.field_o.substring(0, this.field_I) + param0 + this.field_o.substring(this.field_I, this.field_o.length());
                                this.field_I = this.field_I + 1;
                                this.field_B = this.field_I;
                                if (!TombRacer.field_G) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            this.field_o = this.field_o + param0;
                            dupTemp$0 = this.field_o.length();
                            this.field_I = dupTemp$0;
                            this.field_B = dupTemp$0;
                            break L7;
                          }
                          this.i(200);
                          break L5;
                        }
                        stackIn_32_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L9: {
                    if ((param2 ^ -1) != -86) {
                      if ((param2 ^ -1) == -102) {
                        if (this.field_B == this.field_I) {
                          if ((this.field_I ^ -1) <= (this.field_o.length() ^ -1)) {
                            break L9;
                          } else {
                            this.field_B = 1 + this.field_I;
                            this.k(0);
                            stackIn_114_0 = 1;
                            decompiledRegionSelector0 = 14;
                            break L0;
                          }
                        } else {
                          this.k(0);
                          stackIn_111_0 = 1;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        }
                      } else {
                        if (param2 == 13) {
                          this.f(23);
                          stackIn_108_0 = 1;
                          decompiledRegionSelector0 = 12;
                          break L0;
                        } else {
                          if ((param2 ^ -1) == -97) {
                            if (0 < this.field_I) {
                              L10: {
                                stackIn_104_0 = this;

                                stackIn_104_1 = 95;

                                if (!oj.field_tb[82]) {
                                  stackIn_105_0 = this;
                                  stackIn_105_1 = stackIn_104_1;
                                  stackIn_105_2 = -1 + this.field_I;
                                  break L10;
                                } else {
                                  stackIn_105_0 = this;
                                  stackIn_105_1 = stackIn_104_1;
                                  stackIn_105_2 = this.b(param3);
                                  break L10;
                                }
                              }
                              this.a(stackIn_105_1, stackIn_105_2);
                              stackIn_106_0 = 1;
                              decompiledRegionSelector0 = 11;
                              break L0;
                            } else {
                              break L9;
                            }
                          } else {
                            if (97 == param2) {
                              if ((this.field_I ^ -1) > (this.field_o.length() ^ -1)) {
                                L11: {
                                  stackIn_95_0 = this;

                                  stackIn_95_1 = -126;

                                  if (oj.field_tb[82]) {
                                    stackIn_96_0 = this;
                                    stackIn_96_1 = stackIn_95_1;
                                    stackIn_96_2 = this.b(-59);
                                    break L11;
                                  } else {
                                    stackIn_96_0 = this;
                                    stackIn_96_1 = stackIn_95_1;
                                    stackIn_96_2 = this.field_I + 1;
                                    break L11;
                                  }
                                }
                                this.a(stackIn_96_1, stackIn_96_2);
                                stackIn_97_0 = 1;
                                decompiledRegionSelector0 = 10;
                                break L0;
                              } else {
                                break L9;
                              }
                            } else {
                              if ((param2 ^ -1) != -103) {
                                if (param2 != 103) {
                                  if ((param2 ^ -1) == -85) {
                                    this.c(93);
                                    stackIn_88_0 = 1;
                                    decompiledRegionSelector0 = 9;
                                    break L0;
                                  } else {
                                    L12: {
                                      if (!oj.field_tb[82]) {
                                        break L12;
                                      } else {
                                        if (param2 == 65) {
                                          this.l(10571);
                                          stackIn_86_0 = 1;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    L13: {
                                      if (!oj.field_tb[82]) {
                                        break L13;
                                      } else {
                                        if (-67 != (param2 ^ -1)) {
                                          break L13;
                                        } else {
                                          this.e(0);
                                          stackIn_76_0 = 1;
                                          decompiledRegionSelector0 = 6;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (!oj.field_tb[82]) {
                                      break L9;
                                    } else {
                                      if ((param2 ^ -1) == -68) {
                                        this.d(31);
                                        stackIn_84_0 = 1;
                                        decompiledRegionSelector0 = 7;
                                        break L0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                } else {
                                  this.a(-123, this.field_o.length());
                                  stackIn_61_0 = 1;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                }
                              } else {
                                this.a(-127, 0);
                                stackIn_58_0 = 1;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (this.field_B == this.field_I) {
                        if (-1 > (this.field_I ^ -1)) {
                          this.field_B = -1 + this.field_I;
                          this.k(0);
                          stackIn_43_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L9;
                        }
                      } else {
                        this.k(0);
                        stackIn_38_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  stackIn_116_0 = 0;
                  decompiledRegionSelector0 = 15;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_5_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackIn_120_0 = (RuntimeException) (var5);

            stackIn_120_1 = new StringBuilder().append("tra.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_121_0 = (RuntimeException) ((Object) stackIn_120_0);
              stackIn_121_1 = (StringBuilder) ((Object) stackIn_120_1);
              stackIn_121_2 = "null";
              break L14;
            } else {
              stackIn_121_0 = (RuntimeException) ((Object) stackIn_120_0);
              stackIn_121_1 = (StringBuilder) ((Object) stackIn_120_1);
              stackIn_121_2 = "{...}";
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_121_0), stackIn_121_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_32_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_38_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_43_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_58_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_61_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_76_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_84_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_86_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_88_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_97_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_106_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_108_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_111_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_114_0 != 0;
                                    } else {
                                      return stackIn_116_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, nh[] param1, byte param2, int param3, ha param4, int param5, int param6, int param7, int param8, int param9) {
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
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        ssa var10 = null;
        RuntimeException var10_ref = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10 = uja.a((byte) 65, param4);
                        if (param1 != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if ((param5 ^ -1) >= -1) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1 <= (param7 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        if (param1[3] == null) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_14_0 = param1[3].d();
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var11 = stackIn_14_0;
                        if (null == param1[5]) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_18_0 = param1[5].d();
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var12 = stackIn_18_0;
                        if (param1[1] == null) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_22_0 = param1[1].b();
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var13 = stackIn_22_0;
                        if (null != param1[7]) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_26_0 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = param1[7].b();
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
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
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var22 = param3 + var11 * param5 / (var11 - -var12);
                        var21 = param3 + var11 * param5 / (var11 - -var12);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var23 = var19;
                        var24 = var20;
                        if ((var23 ^ -1) >= (var24 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var24 = var13 * param7 / (var13 + var14) + param8;
                        var23 = var13 * param7 / (var13 + var14) + param8;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (null == param1[0]) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var10.a(var21, param8, (byte) -12, var23, param3);
                        param1[0].a(param3, param8, param0, param9, param6);
                        var10.a(97);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (null == param1[2]) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var10.a(var15, param8, (byte) -12, var23, var22);
                        param1[2].a(var18, param8, param0, param9, param6);
                        var10.a(-88);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (param1[6] != null) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var10.a(var21, var24, (byte) -12, var16, param3);
                        param1[6].a(param3, var20, param0, param9, param6);
                        var10.a(-33);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (null == param1[8]) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var10.a(var15, var24, (byte) -12, var16, var22);
                        param1[8].a(var18, var20, param0, param9, param6);
                        var10.a(-66);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (null == param1[1]) {
                            statePc = 56;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (-1 == (param1[1].d() ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var10.a(var22, param8, (byte) -12, var23, var21);
                        var25 = var17;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((var25 ^ -1) <= (var18 ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        param1[1].a(var25, param8, param0, param9, param6);
                        var25 = var25 + param1[1].d();
                        if (var27 != 0) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var27 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var10.a(100);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (null == param1[7]) {
                            statePc = 67;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (0 == param1[7].d()) {
                            statePc = 67;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var10.a(var22, var24, (byte) -12, var16, var21);
                        var25 = var17;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var25 >= var18) {
                            statePc = 66;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        param1[7].a(var25, var20, param0, param9, param6);
                        var25 = var25 + param1[7].d();
                        if (var27 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var27 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var10.a(121);
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (param1[3] == null) {
                            statePc = 78;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (param1[3].b() == 0) {
                            statePc = 78;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var10.a(var21, var23, (byte) -12, var24, param3);
                        var25 = var19;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if ((var25 ^ -1) <= (var20 ^ -1)) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        param1[3].a(param3, var25, param0, param9, param6);
                        var25 = var25 + param1[3].b();
                        if (var27 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var27 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var10.a(-83);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (param1[5] == null) {
                            statePc = 89;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (-1 == (param1[5].b() ^ -1)) {
                            statePc = 89;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var10.a(var15, var23, (byte) -12, var24, var22);
                        var25 = var19;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var20 <= var25) {
                            statePc = 88;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        param1[5].a(var18, var25, param0, param9, param6);
                        var25 = var25 + param1[5].b();
                        if (var27 != 0) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var27 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var10.a(99);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (param1[4] == null) {
                            statePc = 110;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (0 == param1[4].d()) {
                            statePc = 110;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (param1[4].b() != 0) {
                            statePc = 98;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var10.a(var22, var23, (byte) -12, var24, var21);
                        var25 = var19;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if ((var25 ^ -1) <= (var20 ^ -1)) {
                            statePc = 109;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackIn_111_0 = var17;
                        stackIn_101_0 = stackIn_111_0;
                        if (var27 != 0) {
                            statePc = 111;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var26 = stackIn_101_0;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (var26 >= var18) {
                            statePc = 107;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        param1[4].a(var26, var25, param0, param9, param6);
                        var26 = var26 + param1[4].d();
                        if (var27 != 0) {
                            statePc = 108;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (var27 == 0) {
                            statePc = 102;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var25 = var25 + param1[4].b();
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (var27 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var10.a(123);
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackIn_111_0 = param2;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (stackIn_111_0 < -39) {
                            statePc = 124;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        field_A = (String) null;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 115: {
                    var10_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_118_0 = (RuntimeException) (var10_ref);
                    stackIn_116_0 = stackIn_118_0;
                    stackIn_118_1 = new StringBuilder().append("tra.AA(").append(param0).append(',');
                    stackIn_116_1 = stackIn_118_1;
                    if (param1 == null) {
                        statePc = 118;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    stackIn_119_0 = (RuntimeException) ((Object) stackIn_116_0);
                    stackIn_119_1 = (StringBuilder) ((Object) stackIn_116_1);
                    stackIn_119_2 = "{...}";
                    statePc = 119;
                    continue stateLoop;
                }
                case 118: {
                    stackIn_119_0 = (RuntimeException) ((Object) stackIn_118_0);
                    stackIn_119_1 = (StringBuilder) ((Object) stackIn_118_1);
                    stackIn_119_2 = "null";
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    stackIn_122_0 = (RuntimeException) ((Object) stackIn_119_0);
                    stackIn_120_0 = stackIn_122_0;
                    stackIn_122_1 = ((StringBuilder) (Object) stackIn_119_1).append(stackIn_119_2).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_120_1 = stackIn_122_1;
                    if (param4 == null) {
                        statePc = 122;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackIn_123_0 = (RuntimeException) ((Object) stackIn_120_0);
                    stackIn_123_1 = (StringBuilder) ((Object) stackIn_120_1);
                    stackIn_123_2 = "{...}";
                    statePc = 123;
                    continue stateLoop;
                }
                case 122: {
                    stackIn_123_0 = (RuntimeException) ((Object) stackIn_122_0);
                    stackIn_123_1 = (StringBuilder) ((Object) stackIn_122_1);
                    stackIn_123_2 = "null";
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    throw tba.a((Throwable) ((Object) stackIn_123_0), stackIn_123_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
                }
                case 124: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(int param0) {
        try {
            RuntimeException runtimeException = null;
            String var2 = null;
            int decompiledRegionSelector0 = 0;
            RuntimeException decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 0) {
                  L1: {
                    var2 = this.h(-106);
                    if (-1 > (var2.length() ^ -1)) {
                      java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h(86))), (java.awt.datatransfer.ClipboardOwner) null);
                      break L1;
                    } else {
                      break L1;
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
              runtimeException = decompiledCaughtException;
              throw tba.a((Throwable) ((Object) runtimeException), "tra.O(" + param0 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
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
        byte[] var2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ot var1_ref = null;
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "tra.V(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void h(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        oaa var2 = null;
        RuntimeException var2_ref = null;
        bja var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.field_D) {
              this.field_t = 0;
              this.field_j = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!(this.field_r instanceof oaa)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var2 = (oaa) ((Object) this.field_r);
                var3 = var2.a((ae) (this), 14157);
                var4 = var3.a(0);
                var5 = var2.a((byte) 117, (ae) (this));
                var6 = var2.a((byte) -90) >> -1710596767;
                var7 = 28 / ((param0 - 47) / 36);
                if (var4 < -var6 + var5) {
                  this.field_j = 0;
                  this.field_t = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    L2: {
                      var8 = this.field_t - -var3.a((byte) -59, this.field_I);
                      if (var8 > var5 - var6) {
                        break L2;
                      } else {
                        if ((var6 ^ -1) < (var8 ^ -1)) {
                          this.field_t = this.field_t + (var6 - var8);
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
                    this.field_t = this.field_t + -var8 + (var5 + -var6);
                    break L1;
                  }
                  L3: {
                    L4: {
                      if (0 < this.field_t) {
                        break L4;
                      } else {
                        if (this.field_t < var6 + -var5) {
                          this.field_t = -var5 + var6;
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
                    this.field_t = 0;
                    break L3;
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "tra.LA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void k(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
              if (this.field_B != this.field_I) {
                L3: {
                  if (this.field_I <= this.field_B) {
                    stackIn_10_0 = this.field_I;
                    break L3;
                  } else {
                    stackIn_10_0 = this.field_B;
                    break L3;
                  }
                }
                L4: {
                  var2_int = stackIn_10_0;
                  if (this.field_B >= this.field_I) {
                    stackIn_14_0 = this.field_B;
                    break L4;
                  } else {
                    stackIn_14_0 = this.field_I;
                    break L4;
                  }
                }
                var3 = stackIn_14_0;
                this.field_I = var2_int;
                this.field_B = var2_int;
                this.field_o = this.field_o.substring(0, var2_int) + this.field_o.substring(var3, this.field_o.length());
                this.i(200);
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
          throw tba.a((Throwable) ((Object) var2), "tra.NA(" + param0 + ')');
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
              this.field_I = param1;
              if (!oj.field_tb[81]) {
                this.field_B = this.field_I;
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
          throw tba.a((Throwable) ((Object) runtimeException), "tra.OA(" + param0 + ',' + param1 + ')');
        }
    }

    void a(int param0, int param1, ae param2, int param3) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        oaa var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.h((byte) -105);
              if (this.field_s != 1) {
                break L1;
              } else {
                L2: {
                  if (this.field_r instanceof oaa) {
                    var5 = (oaa) ((Object) this.field_r);
                    var6 = var5.a((ae) (this), (byte) 4, sta.field_B, param0, param3, jba.field_j);
                    if ((var6 ^ -1) != 0) {
                      L3: {
                        if (!this.field_E) {
                          break L3;
                        } else {
                          if ((var6 ^ -1) <= (this.field_F ^ -1)) {
                            break L3;
                          } else {
                            if ((var6 ^ -1) < (this.field_B ^ -1)) {
                              var6 = this.field_F;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_I = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                this.field_H = bva.b((byte) -107);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5_ref);

            stackIn_25_1 = new StringBuilder().append("tra.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param0 > 70) {
                break L1;
              } else {
                this.f(18);
                break L1;
              }
            }
            L2: {
              if (!super.a(92, param1, param2, param3, param4, param5, param6)) {
                break L2;
              } else {
                if (!(this.field_r instanceof oaa)) {
                  break L2;
                } else {
                  L3: {
                    var8_int = ((oaa) ((Object) this.field_r)).a((ae) (this), (byte) 4, sta.field_B, param1, param2, jba.field_j);
                    stackIn_10_0 = this;

                    stackIn_10_1 = 60;

                    if (-1 == var8_int) {
                      stackIn_11_0 = this;
                      stackIn_11_1 = stackIn_10_1;
                      stackIn_11_2 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = this;
                      stackIn_11_1 = stackIn_10_1;
                      stackIn_11_2 = var8_int;
                      break L3;
                    }
                  }
                  L4: {
                    this.a(stackIn_11_1, stackIn_11_2);
                    var8_long = bva.b((byte) -107);
                    stackIn_14_0 = this;

                    if (250L <= -this.field_G + var8_long) {
                      stackIn_15_0 = this;
                      stackIn_15_1 = 0;
                      break L4;
                    } else {
                      stackIn_15_0 = this;
                      stackIn_15_1 = 1;
                      break L4;
                    }
                  }
                  L5: {
                    ((tra) (this)).field_E = stackIn_15_1 != 0;
                    if (this.field_E) {
                      L6: {
                        this.field_B = this.b(true);
                        this.field_I = this.b(-76);
                        if ((this.field_I ^ -1) >= -1) {
                          break L6;
                        } else {
                          if (this.field_o.charAt(-1 + this.field_I) != 32) {
                            break L6;
                          } else {
                            this.field_I = this.field_I - 1;
                            break L6;
                          }
                        }
                      }
                      this.field_F = this.field_I;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  this.field_G = var8_long;
                  stackIn_26_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_28_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var8);

            stackIn_32_1 = new StringBuilder().append("tra.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_26_0 != 0;
        } else {
          return stackIn_28_0 != 0;
        }
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 54 / ((param0 - 31) / 62);
              if (!(this.field_h instanceof cd)) {
                break L1;
              } else {
                ((cd) ((Object) this.field_h)).a(-6038, (tra) (this));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "tra.SA(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            try {
              L0: {
                try {
                  L1: {
                    var3 = -61 % ((-29 - param0) / 55);
                    var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
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
              throw tba.a((Throwable) ((Object) var2_ref2), "tra.H(" + param0 + ')');
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
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_6_0;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (0 != this.field_I) {
              var2_int = -1 + this.field_I;
              L1: while (true) {
                L2: {
                  L3: {
                    if (0 >= var2_int) {
                      break L3;
                    } else {
                      stackOut_6_0 = this.field_o.charAt(var2_int - 1);
                      stackIn_14_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_14_1 = 32;

                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (stackIn_7_0 == stackIn_14_1) {
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
                  stackIn_14_0 = param0 ? 1 : 0;
                  stackIn_14_1 = 1;
                  break L2;
                }
                L4: {
                  if (stackIn_14_0 == stackIn_14_1) {
                    break L4;
                  } else {
                    this.field_F = -50;
                    break L4;
                  }
                }
                stackIn_18_0 = var2_int;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = this.field_I;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "tra.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_18_0;
        }
    }

    void i(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
              if (!(this.field_h instanceof cd)) {
                break L2;
              } else {
                ((cd) ((Object) this.field_h)).a((tra) (this), -10);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "tra.M(" + param0 + ')');
        }
    }

    private final void a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (this.field_C == -1) {
                break L1;
              } else {
                var3_int = this.field_C - this.field_o.length();
                if (-1 < (var3_int ^ -1)) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              L3: {
                if ((this.field_I ^ -1) != (this.field_o.length() ^ -1)) {
                  break L3;
                } else {
                  this.field_o = this.field_o + param0;
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_o = this.field_o.substring(0, this.field_I) + param0 + this.field_o.substring(this.field_I, this.field_o.length());
              break L2;
            }
            L4: {
              this.field_I = this.field_I + param0.length();
              if (!param1) {
                break L4;
              } else {
                this.d(104);
                break L4;
              }
            }
            this.field_B = this.field_I;
            this.i(200);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("tra.J(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void l(int param0) {
        try {
            this.e(0);
            this.k(param0 ^ param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tra.QA(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
                this.field_D = false;
                break L2;
              }
            }
            L3: {
              this.field_o = param2;
              var4_int = param2.length();
              if (-1 == this.field_C) {
                break L3;
              } else {
                if (var4_int > this.field_C) {
                  this.field_o = this.field_o.substring(0, this.field_C);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              dupTemp$1 = this.field_o.length();
              this.field_B = dupTemp$1;
              this.field_I = dupTemp$1;
              if (param0) {
                break L4;
              } else {
                this.i(param1 ^ -16775);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("tra.MA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    final static void g(byte param0) {
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              L2: {
                if ((ff.field_w ^ -1) < -33) {
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
          throw tba.a((Throwable) ((Object) var1), "tra.RA(" + param0 + ')');
        }
    }

    final void f(int param0) {
        try {
            this.field_o = "";
            this.field_I = 0;
            int var2_int = -100 % ((param0 - -80) / 39);
            this.field_B = 0;
            this.i(200);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tra.KA(" + param0 + ')');
        }
    }

    public static void j(int param0) {
        try {
            field_z = null;
            field_A = null;
            int var1_int = 88 / ((-30 - param0) / 62);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tra.N(" + param0 + ')');
        }
    }

    tra(String param0, qc param1, int param2) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_F = -1;
        this.field_E = false;
        this.field_G = 0L;
        try {
          L0: {
            this.field_r = afa.field_c.field_e;
            this.field_C = param2;
            this.a(true, -16719, param0);
            this.field_D = true;
            this.field_H = bva.b((byte) -107);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("tra.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    private final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = this.field_o.length();
            if (var2_int != this.field_I) {
              var3 = 99 / ((param0 - 37) / 56);
              var4 = 1 + this.field_I;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var2_int ^ -1) >= (var4 ^ -1)) {
                      break L3;
                    } else {
                      stackIn_14_0 = this.field_o.charAt(-1 + var4) ^ -1;

                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (stackIn_14_0 == -33) {
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
                  stackIn_14_0 = var4;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = this.field_I;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "tra.PA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_14_0;
        }
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
        try {
          L0: {
            L1: {
              var3 = -77 / ((param0 - -20) / 55);
              if (this.field_I > this.field_B) {
                stackIn_4_0 = this.field_B;
                break L1;
              } else {
                stackIn_4_0 = this.field_I;
                break L1;
              }
            }
            L2: {
              var2_int = stackIn_4_0;
              if (this.field_I > this.field_B) {
                stackIn_8_0 = this.field_I;
                break L2;
              } else {
                stackIn_8_0 = this.field_B;
                break L2;
              }
            }
            var4 = stackIn_8_0;
            stackIn_9_0 = this.field_o.substring(var2_int, var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "tra.U(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    static {
        field_A = "Players: <%0>/<%1>";
        field_z = new String[]{null, "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "Esc", null, null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "`", null, null, null, "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", null, null, null, null, "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'", "#", null, null, null, null, "Z", "X", "C", "V", "B", "N", "M", "<", ">", "/", "\\", null, null, null, null, null, "Tab", "Shift", "Ctrl", "Space", "Enter", "Backspace", "Alt", "Keypad +", "Keypad -", "Keypad *", "Keypad /", "Keypad 5", null, null, null, null, "Left Arrow", "Right Arrow", "Up Arrow", "Down Arrow", "Insert", "Delete", "Home", "End", "Page Up", "Page Down", null, null, null, null, null, null};
    }
}
