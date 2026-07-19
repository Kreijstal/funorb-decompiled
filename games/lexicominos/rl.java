/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rl extends kf {
    private int field_L;
    private long field_M;
    private boolean field_N;
    private long field_J;
    static int field_E;
    private int field_F;
    private int field_G;
    private boolean field_K;
    private int field_I;
    static rb field_H;
    static volatile boolean field_O;

    final static int b(int param0, int param1, int param2) {
        int var3 = 0;
        var3 = param1 >>> -1397638113;
        if (param2 != 25668) {
          field_H = (rb) null;
          return (var3 + param1) / param0 - var3;
        } else {
          return (var3 + param1) / param0 - var3;
        }
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (this.field_F == this.field_I) {
            break L0;
          } else {
            L1: {
              if (this.field_I >= this.field_F) {
                stackOut_3_0 = this.field_F;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = this.field_I;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (this.field_F <= this.field_I) {
                stackOut_6_0 = this.field_I;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = this.field_F;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            this.field_I = var2;
            this.field_F = var2;
            this.field_u = this.field_u.substring(0, var2) + this.field_u.substring(var3, this.field_u.length());
            this.f(false);
            break L0;
          }
        }
        if (param0 != -1) {
          this.m(-24);
          return;
        } else {
          return;
        }
    }

    private final void a(String param0, byte param1) {
        boolean discarded$2 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        w var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (this.field_G == -1) {
                break L1;
              } else {
                var3_int = this.field_G + -this.field_u.length();
                if ((var3_int ^ -1) > -1) {
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
                if (this.field_F == this.field_u.length()) {
                  break L3;
                } else {
                  this.field_u = this.field_u.substring(0, this.field_F) + param0 + this.field_u.substring(this.field_F, this.field_u.length());
                  if (!Lexicominos.field_L) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_u = this.field_u + param0;
              break L2;
            }
            L4: {
              this.field_F = this.field_F + param0.length();
              if (param1 >= 85) {
                break L4;
              } else {
                var4 = (w) null;
                discarded$2 = this.a(10, -121, (w) null, 67, -118, 113, -122);
                break L4;
              }
            }
            this.field_I = this.field_F;
            this.f(false);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("rl.D(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int dupTemp$1 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_50_0 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_73_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        try {
          L0: {
            this.field_J = rf.c(0);
            var5_int = 32 / ((param3 - -13) / 55);
            if (param0 == 60) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != 62) {
                L1: {
                  if (param0 < 32) {
                    break L1;
                  } else {
                    if (param0 <= 126) {
                      L2: {
                        if (this.field_F == this.field_I) {
                          break L2;
                        } else {
                          this.l(-1);
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (0 == (this.field_G ^ -1)) {
                            break L4;
                          } else {
                            if (this.field_u.length() >= this.field_G) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (this.field_F < this.field_u.length()) {
                              break L6;
                            } else {
                              this.field_u = this.field_u + param0;
                              dupTemp$1 = this.field_u.length();
                              this.field_F = dupTemp$1;
                              this.field_I = dupTemp$1;
                              if (!Lexicominos.field_L) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          this.field_u = this.field_u.substring(0, this.field_F) + param0 + this.field_u.substring(this.field_F, this.field_u.length());
                          this.field_F = this.field_F + 1;
                          this.field_I = this.field_F;
                          break L5;
                        }
                        this.f(false);
                        break L3;
                      }
                      stackOut_71_0 = 1;
                      stackIn_72_0 = stackOut_71_0;
                      decompiledRegionSelector0 = 14;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L7: {
                  if (-86 == (param1 ^ -1)) {
                    if (this.field_I == this.field_F) {
                      if (this.field_F <= 0) {
                        break L7;
                      } else {
                        this.field_I = this.field_F + -1;
                        this.l(-1);
                        stackOut_59_0 = 1;
                        stackIn_60_0 = stackOut_59_0;
                        decompiledRegionSelector0 = 13;
                        break L0;
                      }
                    } else {
                      this.l(-1);
                      stackOut_56_0 = 1;
                      stackIn_57_0 = stackOut_56_0;
                      decompiledRegionSelector0 = 12;
                      break L0;
                    }
                  } else {
                    if (101 == param1) {
                      if (this.field_F == this.field_I) {
                        if (this.field_F >= this.field_u.length()) {
                          break L7;
                        } else {
                          this.field_I = this.field_F - -1;
                          this.l(-1);
                          stackOut_53_0 = 1;
                          stackIn_54_0 = stackOut_53_0;
                          decompiledRegionSelector0 = 11;
                          break L0;
                        }
                      } else {
                        this.l(-1);
                        stackOut_50_0 = 1;
                        stackIn_51_0 = stackOut_50_0;
                        decompiledRegionSelector0 = 10;
                        break L0;
                      }
                    } else {
                      if ((param1 ^ -1) != -14) {
                        if ((param1 ^ -1) == -97) {
                          if (this.field_F <= 0) {
                            break L7;
                          } else {
                            L8: {
                              stackOut_44_0 = this;
                              stackIn_46_0 = stackOut_44_0;
                              stackIn_45_0 = stackOut_44_0;
                              if (!wa.field_j[82]) {
                                stackOut_46_0 = this;
                                stackOut_46_1 = -1 + this.field_F;
                                stackIn_47_0 = stackOut_46_0;
                                stackIn_47_1 = stackOut_46_1;
                                break L8;
                              } else {
                                stackOut_45_0 = this;
                                stackOut_45_1 = this.n(-1);
                                stackIn_47_0 = stackOut_45_0;
                                stackIn_47_1 = stackOut_45_1;
                                break L8;
                              }
                            }
                            this.a(stackIn_47_1, 10);
                            stackOut_47_0 = 1;
                            stackIn_48_0 = stackOut_47_0;
                            decompiledRegionSelector0 = 9;
                            break L0;
                          }
                        } else {
                          if (97 != param1) {
                            if (-103 == (param1 ^ -1)) {
                              this.a(0, -124);
                              stackOut_41_0 = 1;
                              stackIn_42_0 = stackOut_41_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if ((param1 ^ -1) != -104) {
                                if (-85 != (param1 ^ -1)) {
                                  L9: {
                                    if (!wa.field_j[82]) {
                                      break L9;
                                    } else {
                                      if (param1 != 65) {
                                        break L9;
                                      } else {
                                        this.m(67);
                                        stackOut_31_0 = 1;
                                        stackIn_32_0 = stackOut_31_0;
                                        decompiledRegionSelector0 = 5;
                                        break L0;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (!wa.field_j[82]) {
                                      break L10;
                                    } else {
                                      if (-67 != (param1 ^ -1)) {
                                        break L10;
                                      } else {
                                        this.k(-1);
                                        stackOut_35_0 = 1;
                                        stackIn_36_0 = stackOut_35_0;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      }
                                    }
                                  }
                                  if (!wa.field_j[82]) {
                                    break L7;
                                  } else {
                                    if (param1 != 67) {
                                      break L7;
                                    } else {
                                      this.f((byte) 113);
                                      stackOut_39_0 = 1;
                                      stackIn_40_0 = stackOut_39_0;
                                      decompiledRegionSelector0 = 7;
                                      break L0;
                                    }
                                  }
                                } else {
                                  this.e(false);
                                  stackOut_27_0 = 1;
                                  stackIn_28_0 = stackOut_27_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              } else {
                                this.a(this.field_u.length(), -115);
                                stackOut_24_0 = 1;
                                stackIn_25_0 = stackOut_24_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          } else {
                            if (this.field_F < this.field_u.length()) {
                              L11: {
                                stackOut_17_0 = this;
                                stackIn_19_0 = stackOut_17_0;
                                stackIn_18_0 = stackOut_17_0;
                                if (!wa.field_j[82]) {
                                  stackOut_19_0 = this;
                                  stackOut_19_1 = 1 + this.field_F;
                                  stackIn_20_0 = stackOut_19_0;
                                  stackIn_20_1 = stackOut_19_1;
                                  break L11;
                                } else {
                                  stackOut_18_0 = this;
                                  stackOut_18_1 = this.i(32);
                                  stackIn_20_0 = stackOut_18_0;
                                  stackIn_20_1 = stackOut_18_1;
                                  break L11;
                                }
                              }
                              this.a(stackIn_20_1, 5);
                              stackOut_20_0 = 1;
                              stackIn_21_0 = stackOut_20_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L7;
                            }
                          }
                        }
                      } else {
                        this.j(0);
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_73_0 = 0;
                stackIn_74_0 = stackOut_73_0;
                decompiledRegionSelector0 = 15;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var5);
            stackOut_75_1 = new StringBuilder().append("rl.P(").append(param0).append(',').append(param1).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param2 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L12;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L12;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_36_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_40_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_42_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_48_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_51_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_54_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_57_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_60_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_72_0 != 0;
                                    } else {
                                      return stackIn_74_0 != 0;
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

    final boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (!(this.field_i instanceof ub)) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var8_int = ((ub) ((Object) this.field_i)).a((w) (this), param4, 9, param5, bk.field_b, sh.field_e);
                  stackOut_3_0 = this;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (-1 != var8_int) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = var8_int;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_6_1, -124);
                  var8_long = rf.c(0);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (250L <= -this.field_M + var8_long) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L2;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L2;
                  }
                }
                L3: {
                  ((rl) (this)).field_K = stackIn_9_1 != 0;
                  if (this.field_K) {
                    L4: {
                      this.field_I = this.n(param0 ^ 4807);
                      this.field_F = this.i(32);
                      if (0 >= this.field_F) {
                        break L4;
                      } else {
                        if (-33 == (this.field_u.charAt(-1 + this.field_F) ^ -1)) {
                          this.field_F = this.field_F - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_L = this.field_F;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_M = var8_long;
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var8);
            stackOut_20_1 = new StringBuilder().append("rl.VA(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    private final void e(byte param0) {
        ve var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ub var10 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (this.field_N) {
          if (this.field_i instanceof ub) {
            var10 = (ub) ((Object) this.field_i);
            var3 = var10.a((w) (this), (byte) 122);
            var4 = var3.a((byte) 94);
            var5 = var10.a((w) (this), 227);
            var6 = var10.a(2) >> -2073301887;
            if (var4 < var5 + -var6) {
              this.field_l = 0;
              this.field_p = 0;
              return;
            } else {
              var7 = this.field_p - -var3.a((byte) -116, this.field_F);
              if (-var6 + var5 < var7) {
                this.field_p = -var7 - var6 - (-var5 - this.field_p);
                if ((this.field_p ^ -1) >= -1) {
                  if (-var5 - -var6 > this.field_p) {
                    this.field_p = -var5 - -var6;
                    if (var9 != 0) {
                      this.field_p = 0;
                      var8 = 62 / ((param0 - 30) / 38);
                      return;
                    } else {
                      var8 = 62 / ((param0 - 30) / 38);
                      return;
                    }
                  } else {
                    var8 = 62 / ((param0 - 30) / 38);
                    return;
                  }
                } else {
                  this.field_p = 0;
                  var8 = 62 / ((param0 - 30) / 38);
                  return;
                }
              } else {
                if (var7 < var6) {
                  this.field_p = this.field_p - -var6 - var7;
                  if (var9 != 0) {
                    this.field_p = -var7 - var6 - (-var5 - this.field_p);
                    if ((this.field_p ^ -1) >= -1) {
                      if (-var5 - -var6 > this.field_p) {
                        this.field_p = -var5 - -var6;
                        if (var9 != 0) {
                          this.field_p = 0;
                          var8 = 62 / ((param0 - 30) / 38);
                          return;
                        } else {
                          var8 = 62 / ((param0 - 30) / 38);
                          return;
                        }
                      } else {
                        var8 = 62 / ((param0 - 30) / 38);
                        return;
                      }
                    } else {
                      this.field_p = 0;
                      var8 = 62 / ((param0 - 30) / 38);
                      return;
                    }
                  } else {
                    if ((this.field_p ^ -1) >= -1) {
                      if (-var5 - -var6 > this.field_p) {
                        this.field_p = -var5 - -var6;
                        if (var9 != 0) {
                          this.field_p = 0;
                          var8 = 62 / ((param0 - 30) / 38);
                          return;
                        } else {
                          var8 = 62 / ((param0 - 30) / 38);
                          return;
                        }
                      } else {
                        var8 = 62 / ((param0 - 30) / 38);
                        return;
                      }
                    } else {
                      this.field_p = 0;
                      var8 = 62 / ((param0 - 30) / 38);
                      return;
                    }
                  }
                } else {
                  if ((this.field_p ^ -1) >= -1) {
                    if (-var5 - -var6 > this.field_p) {
                      this.field_p = -var5 - -var6;
                      if (var9 != 0) {
                        this.field_p = 0;
                        var8 = 62 / ((param0 - 30) / 38);
                        return;
                      } else {
                        var8 = 62 / ((param0 - 30) / 38);
                        return;
                      }
                    } else {
                      var8 = 62 / ((param0 - 30) / 38);
                      return;
                    }
                  } else {
                    this.field_p = 0;
                    var8 = 62 / ((param0 - 30) / 38);
                    return;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          this.field_l = 0;
          this.field_p = 0;
          return;
        }
    }

    private final int n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        if ((this.field_F ^ -1) != param0) {
          var2 = this.field_F + -1;
          L0: while (true) {
            if ((var2 ^ -1) < -1) {
              stackOut_5_0 = 32;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var3 == 0) {
                if (stackIn_7_0 != this.field_u.charAt(var2 - 1)) {
                  var2--;
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return stackIn_6_0;
              }
            } else {
              return var2;
            }
          }
        } else {
          return this.field_F;
        }
    }

    final void a(String param0, int param1, boolean param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param0 == null) {
                param0 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -1) {
                break L2;
              } else {
                this.f((byte) 39);
                break L2;
              }
            }
            L3: {
              this.field_u = param0;
              var4_int = param0.length();
              if (0 == (this.field_G ^ -1)) {
                break L3;
              } else {
                if (this.field_G >= var4_int) {
                  break L3;
                } else {
                  this.field_u = this.field_u.substring(0, this.field_G);
                  break L3;
                }
              }
            }
            dupTemp$2 = this.field_u.length();
            this.field_I = dupTemp$2;
            this.field_F = dupTemp$2;
            if (!param2) {
              this.f(false);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("rl.R(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        long var6 = 0L;
        ub var8 = null;
        L0: {
          if (this.field_i == null) {
            break L0;
          } else {
            if (param3 == 0) {
              this.field_i.a(param1, param2, this.field_D, (w) (this), -3284);
              if (this.field_i instanceof ub) {
                L1: {
                  var8 = (ub) ((Object) this.field_i);
                  if (this.field_F != this.field_I) {
                    var8.a(param1, param2, (w) (this), (byte) 31, this.field_I, this.field_F);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var6 = rf.c(0);
                if ((var6 + -this.field_J) % 1000L < 500L) {
                  var8.a(this.field_F, param2, param1, (w) (this), true);
                  break L0;
                } else {
                  if (param0 != -115) {
                    field_O = false;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param0 == -115) {
                  return;
                } else {
                  field_O = false;
                  return;
                }
              }
            } else {
              if (param0 == -115) {
                return;
              } else {
                field_O = false;
                return;
              }
            }
          }
        }
        if (param0 != -115) {
          field_O = false;
          return;
        } else {
          return;
        }
    }

    final void j(int param0) {
        this.field_u = "";
        this.field_F = param0;
        this.field_I = 0;
        this.f(false);
    }

    public static void g(byte param0) {
        field_H = null;
        int var1 = -50 / ((param0 - 16) / 52);
    }

    private final void a(int param0, int param1) {
        this.field_F = param0;
        if (!(wa.field_j[81])) {
            this.field_I = this.field_F;
        }
        int var3 = 79 % ((-75 - param1) / 40);
    }

    void f(boolean param0) {
        if (!(this.field_r instanceof nf)) {
          if (param0) {
            this.field_N = true;
            return;
          } else {
            return;
          }
        } else {
          ((nf) ((Object) this.field_r)).a((byte) 10, (rl) (this));
          if (!param0) {
            return;
          } else {
            this.field_N = true;
            return;
          }
        }
    }

    private final void m(int param0) {
        if (param0 < 40) {
            return;
        }
        this.k(-1);
        this.l(-1);
    }

    void a(byte param0, w param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        ub var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              super.a(param0, param1, param2, param3);
              this.e((byte) 94);
              if (this.field_h != 1) {
                break L1;
              } else {
                L2: {
                  if (!(this.field_i instanceof ub)) {
                    break L2;
                  } else {
                    var5 = (ub) ((Object) this.field_i);
                    var6 = var5.a((w) (this), param2, 9, param3, bk.field_b, sh.field_e);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!this.field_K) {
                          break L3;
                        } else {
                          if (var6 >= this.field_L) {
                            break L3;
                          } else {
                            if (this.field_I >= var6) {
                              break L3;
                            } else {
                              var6 = this.field_L;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_F = var6;
                      break L2;
                    }
                  }
                }
                this.field_J = rf.c(param0 ^ -119);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("rl.FA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void e(boolean param0) {
        if (!(!(this.field_r instanceof nf))) {
            ((nf) ((Object) this.field_r)).a((rl) (this), true);
        }
        if (param0) {
            this.m(-20);
            return;
        }
    }

    private final void f(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.l(-1);
                var3 = -67 % ((19 - param0) / 35);
                this.a(var2, (byte) 100);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void k(int param0) {
        String var2 = this.d((byte) -83);
        if (!((var2.length() ^ -1) >= param0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.d((byte) -41))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final String d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (this.field_F <= this.field_I) {
            stackOut_2_0 = this.field_F;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_I;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (this.field_F > this.field_I) {
            stackOut_5_0 = this.field_F;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = this.field_I;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var3 = stackIn_6_0;
        if (param0 > -27) {
          return (String) null;
        } else {
          return this.field_u.substring(var2, var3);
        }
    }

    private final int i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_7_0 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        var2 = this.field_u.length();
        if (var2 != this.field_F) {
          if (param0 == 32) {
            var3 = 1 + this.field_F;
            L0: while (true) {
              if (var3 < var2) {
                stackOut_17_0 = this.field_u.charAt(var3 - 1) ^ -1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (var4 == 0) {
                  if (stackIn_19_0 != -33) {
                    var3++;
                    continue L0;
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_18_0;
                }
              } else {
                return var3;
              }
            }
          } else {
            this.field_F = 55;
            var3 = 1 + this.field_F;
            L1: while (true) {
              if (var3 < var2) {
                stackOut_7_0 = this.field_u.charAt(var3 - 1) ^ -1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var4 == 0) {
                  if (stackIn_9_0 != -33) {
                    var3++;
                    continue L1;
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_8_0;
                }
              } else {
                return var3;
              }
            }
          }
        } else {
          return this.field_F;
        }
    }

    rl(String param0, vd param1, int param2) {
        super(param0, param1);
        this.field_M = 0L;
        this.field_L = -1;
        this.field_K = false;
        try {
            this.field_i = nb.field_z.field_a;
            this.field_G = param2;
            this.a(param0, -1, true);
            this.field_N = true;
            this.field_J = rf.c(0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_H = new rb();
        field_O = false;
    }
}
