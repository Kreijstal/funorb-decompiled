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

    final static int b(int param0, int param1) {
        int var3 = param1 >>> 31;
        return (var3 + param1) / param0 - var3;
    }

    private final void l() {
        int var2 = 0;
        int var3 = 0;
        if (((rl) this).field_F != ((rl) this).field_I) {
            var2 = ((rl) this).field_I < ((rl) this).field_F ? ((rl) this).field_I : ((rl) this).field_F;
            var3 = ((rl) this).field_F > ((rl) this).field_I ? ((rl) this).field_F : ((rl) this).field_I;
            ((rl) this).field_I = var2;
            ((rl) this).field_F = var2;
            ((rl) this).field_u = ((rl) this).field_u.substring(0, var2) + ((rl) this).field_u.substring(var3, ((rl) this).field_u.length());
            ((rl) this).f(false);
        }
    }

    private final void a(String param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (((rl) this).field_G == -1) {
                break L1;
              } else {
                var3_int = ((rl) this).field_G + -((rl) this).field_u.length();
                if (var3_int < 0) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (((rl) this).field_F == ((rl) this).field_u.length()) {
                ((rl) this).field_u = ((rl) this).field_u + param0;
                break L2;
              } else {
                ((rl) this).field_u = ((rl) this).field_u.substring(0, ((rl) this).field_F) + param0 + ((rl) this).field_u.substring(((rl) this).field_F, ((rl) this).field_u.length());
                break L2;
              }
            }
            ((rl) this).field_F = ((rl) this).field_F + param0.length();
            ((rl) this).field_I = ((rl) this).field_F;
            ((rl) this).f(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("rl.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 100 + ')');
        }
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
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
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_70_0 = 0;
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
        int stackOut_72_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        try {
          L0: {
            ((rl) this).field_J = rf.c(0);
            var5_int = 32 / ((param3 - -13) / 55);
            if (param0 == 60) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param0 != 62) {
                L1: {
                  if (param0 < 32) {
                    break L1;
                  } else {
                    if (param0 <= 126) {
                      L2: {
                        if (((rl) this).field_F == ((rl) this).field_I) {
                          break L2;
                        } else {
                          int discarded$9 = -1;
                          this.l();
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (((rl) this).field_G == -1) {
                            break L4;
                          } else {
                            if (((rl) this).field_u.length() >= ((rl) this).field_G) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (((rl) this).field_F < ((rl) this).field_u.length()) {
                            ((rl) this).field_u = ((rl) this).field_u.substring(0, ((rl) this).field_F) + param0 + ((rl) this).field_u.substring(((rl) this).field_F, ((rl) this).field_u.length());
                            ((rl) this).field_F = ((rl) this).field_F + 1;
                            ((rl) this).field_I = ((rl) this).field_F;
                            break L5;
                          } else {
                            ((rl) this).field_u = ((rl) this).field_u + param0;
                            int dupTemp$10 = ((rl) this).field_u.length();
                            ((rl) this).field_F = dupTemp$10;
                            ((rl) this).field_I = dupTemp$10;
                            break L5;
                          }
                        }
                        ((rl) this).f(false);
                        break L3;
                      }
                      stackOut_70_0 = 1;
                      stackIn_71_0 = stackOut_70_0;
                      return stackIn_71_0 != 0;
                    } else {
                      break L1;
                    }
                  }
                }
                L6: {
                  if (param1 == 85) {
                    if (((rl) this).field_I == ((rl) this).field_F) {
                      if (((rl) this).field_F <= 0) {
                        break L6;
                      } else {
                        ((rl) this).field_I = ((rl) this).field_F + -1;
                        int discarded$11 = -1;
                        this.l();
                        stackOut_59_0 = 1;
                        stackIn_60_0 = stackOut_59_0;
                        return stackIn_60_0 != 0;
                      }
                    } else {
                      int discarded$12 = -1;
                      this.l();
                      stackOut_56_0 = 1;
                      stackIn_57_0 = stackOut_56_0;
                      return stackIn_57_0 != 0;
                    }
                  } else {
                    if (101 == param1) {
                      if (~((rl) this).field_F == ~((rl) this).field_I) {
                        if (~((rl) this).field_F <= ~((rl) this).field_u.length()) {
                          break L6;
                        } else {
                          ((rl) this).field_I = ((rl) this).field_F - -1;
                          int discarded$13 = -1;
                          this.l();
                          stackOut_53_0 = 1;
                          stackIn_54_0 = stackOut_53_0;
                          return stackIn_54_0 != 0;
                        }
                      } else {
                        int discarded$14 = -1;
                        this.l();
                        stackOut_50_0 = 1;
                        stackIn_51_0 = stackOut_50_0;
                        return stackIn_51_0 != 0;
                      }
                    } else {
                      if (param1 != 13) {
                        if (param1 == 96) {
                          if (((rl) this).field_F <= 0) {
                            break L6;
                          } else {
                            L7: {
                              stackOut_44_0 = this;
                              stackIn_46_0 = stackOut_44_0;
                              stackIn_45_0 = stackOut_44_0;
                              if (!wa.field_j[82]) {
                                stackOut_46_0 = this;
                                stackOut_46_1 = -1 + ((rl) this).field_F;
                                stackIn_47_0 = stackOut_46_0;
                                stackIn_47_1 = stackOut_46_1;
                                break L7;
                              } else {
                                stackOut_45_0 = this;
                                stackOut_45_1 = this.n(-1);
                                stackIn_47_0 = stackOut_45_0;
                                stackIn_47_1 = stackOut_45_1;
                                break L7;
                              }
                            }
                            this.a(stackIn_47_1, 10);
                            stackOut_47_0 = 1;
                            stackIn_48_0 = stackOut_47_0;
                            return stackIn_48_0 != 0;
                          }
                        } else {
                          if (97 != param1) {
                            if (param1 == 102) {
                              this.a(0, -124);
                              stackOut_41_0 = 1;
                              stackIn_42_0 = stackOut_41_0;
                              return stackIn_42_0 != 0;
                            } else {
                              if (param1 != 103) {
                                if (param1 != 84) {
                                  L8: {
                                    if (!wa.field_j[82]) {
                                      break L8;
                                    } else {
                                      if (param1 != 65) {
                                        break L8;
                                      } else {
                                        int discarded$15 = 67;
                                        this.m();
                                        stackOut_31_0 = 1;
                                        stackIn_32_0 = stackOut_31_0;
                                        return stackIn_32_0 != 0;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!wa.field_j[82]) {
                                      break L9;
                                    } else {
                                      if (param1 != 66) {
                                        break L9;
                                      } else {
                                        int discarded$16 = -1;
                                        this.k();
                                        stackOut_35_0 = 1;
                                        stackIn_36_0 = stackOut_35_0;
                                        return stackIn_36_0 != 0;
                                      }
                                    }
                                  }
                                  if (!wa.field_j[82]) {
                                    break L6;
                                  } else {
                                    if (param1 != 67) {
                                      break L6;
                                    } else {
                                      this.f((byte) 113);
                                      stackOut_39_0 = 1;
                                      stackIn_40_0 = stackOut_39_0;
                                      return stackIn_40_0 != 0;
                                    }
                                  }
                                } else {
                                  this.e(false);
                                  stackOut_27_0 = 1;
                                  stackIn_28_0 = stackOut_27_0;
                                  return stackIn_28_0 != 0;
                                }
                              } else {
                                this.a(((rl) this).field_u.length(), -115);
                                stackOut_24_0 = 1;
                                stackIn_25_0 = stackOut_24_0;
                                return stackIn_25_0 != 0;
                              }
                            }
                          } else {
                            if (((rl) this).field_F < ((rl) this).field_u.length()) {
                              L10: {
                                stackOut_17_0 = this;
                                stackIn_19_0 = stackOut_17_0;
                                stackIn_18_0 = stackOut_17_0;
                                if (!wa.field_j[82]) {
                                  stackOut_19_0 = this;
                                  stackOut_19_1 = 1 + ((rl) this).field_F;
                                  stackIn_20_0 = stackOut_19_0;
                                  stackIn_20_1 = stackOut_19_1;
                                  break L10;
                                } else {
                                  int discarded$17 = 32;
                                  stackOut_18_0 = this;
                                  stackOut_18_1 = this.i();
                                  stackIn_20_0 = stackOut_18_0;
                                  stackIn_20_1 = stackOut_18_1;
                                  break L10;
                                }
                              }
                              this.a(stackIn_20_1, 5);
                              stackOut_20_0 = 1;
                              stackIn_21_0 = stackOut_20_0;
                              return stackIn_21_0 != 0;
                            } else {
                              break L6;
                            }
                          }
                        }
                      } else {
                        ((rl) this).j(0);
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      }
                    }
                  }
                }
                stackOut_72_0 = 0;
                stackIn_73_0 = stackOut_72_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var5;
            stackOut_74_1 = new StringBuilder().append("rl.P(").append(param0).append(',').append(param1).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param2 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L11;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L11;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param3 + ')');
        }
        return stackIn_73_0 != 0;
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
              if (!(((rl) this).field_i instanceof ub)) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L1: {
                  var8_int = ((ub) (Object) ((rl) this).field_i).a((w) this, param4, 9, param5, bk.field_b, sh.field_e);
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
                  if (250L <= -((rl) this).field_M + var8_long) {
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
                  ((rl) this).field_K = stackIn_9_1 != 0;
                  if (((rl) this).field_K) {
                    L4: {
                      ((rl) this).field_I = this.n(param0 ^ 4807);
                      int discarded$1 = 32;
                      ((rl) this).field_F = this.i();
                      if (0 >= ((rl) this).field_F) {
                        break L4;
                      } else {
                        if (((rl) this).field_u.charAt(-1 + ((rl) this).field_F) == 32) {
                          ((rl) this).field_F = ((rl) this).field_F - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((rl) this).field_L = ((rl) this).field_F;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((rl) this).field_M = var8_long;
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("rl.VA(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_19_0 != 0;
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
        if (((rl) this).field_N) {
          if (((rl) this).field_i instanceof ub) {
            var10 = (ub) (Object) ((rl) this).field_i;
            var3 = var10.a((w) this, (byte) 122);
            var4 = var3.a((byte) 94);
            var5 = var10.a((w) this, 227);
            var6 = var10.a(2) >> 1;
            if (var4 < var5 + -var6) {
              ((rl) this).field_l = 0;
              ((rl) this).field_p = 0;
              return;
            } else {
              L0: {
                var7 = ((rl) this).field_p - -var3.a((byte) -116, ((rl) this).field_F);
                if (-var6 + var5 < var7) {
                  ((rl) this).field_p = -var7 - var6 - (-var5 - ((rl) this).field_p);
                  break L0;
                } else {
                  if (var7 >= var6) {
                    break L0;
                  } else {
                    ((rl) this).field_p = ((rl) this).field_p - -var6 - var7;
                    break L0;
                  }
                }
              }
              L1: {
                if (((rl) this).field_p > 0) {
                  ((rl) this).field_p = 0;
                  break L1;
                } else {
                  if (-var5 - -var6 > ((rl) this).field_p) {
                    ((rl) this).field_p = -var5 - -var6;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var8 = 62;
              return;
            }
          } else {
            return;
          }
        } else {
          ((rl) this).field_l = 0;
          ((rl) this).field_p = 0;
          return;
        }
    }

    private final int n(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (~((rl) this).field_F != param0) {
          var2 = ((rl) this).field_F + -1;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (32 == ((rl) this).field_u.charAt(var2 - 1)) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        } else {
          return ((rl) this).field_F;
        }
    }

    final void a(String param0, int param1, boolean param2) {
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
              ((rl) this).field_u = param0;
              var4_int = param0.length();
              if (((rl) this).field_G == -1) {
                break L3;
              } else {
                if (((rl) this).field_G >= var4_int) {
                  break L3;
                } else {
                  ((rl) this).field_u = ((rl) this).field_u.substring(0, ((rl) this).field_G);
                  break L3;
                }
              }
            }
            L4: {
              int dupTemp$3 = ((rl) this).field_u.length();
              ((rl) this).field_I = dupTemp$3;
              ((rl) this).field_F = dupTemp$3;
              if (!param2) {
                ((rl) this).f(false);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("rl.R(");
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ub var8 = null;
        long var6 = 0L;
        if (((rl) this).field_i != null) {
            if (!(param3 != 0)) {
                ((rl) this).field_i.a(param1, param2, ((rl) this).field_D, (w) this, -3284);
                if (!(!(((rl) this).field_i instanceof ub))) {
                    var8 = (ub) (Object) ((rl) this).field_i;
                    if (!(((rl) this).field_F == ((rl) this).field_I)) {
                        var8.a(param1, param2, (w) this, (byte) 31, ((rl) this).field_I, ((rl) this).field_F);
                    }
                    var6 = rf.c(0);
                    if (!((var6 + -((rl) this).field_J) % 1000L >= 500L)) {
                        var8.a(((rl) this).field_F, param2, param1, (w) this, true);
                    }
                }
            }
        }
        if (param0 != -115) {
            field_O = false;
        }
    }

    final void j(int param0) {
        ((rl) this).field_u = "";
        ((rl) this).field_F = param0;
        ((rl) this).field_I = 0;
        ((rl) this).f(false);
    }

    public static void g(byte param0) {
        field_H = null;
        int var1 = -50;
    }

    private final void a(int param0, int param1) {
        ((rl) this).field_F = param0;
        if (!(wa.field_j[81])) {
            ((rl) this).field_I = ((rl) this).field_F;
        }
        int var3 = 79 % ((-75 - param1) / 40);
    }

    void f(boolean param0) {
        if (((rl) this).field_r instanceof nf) {
            ((nf) (Object) ((rl) this).field_r).a((byte) 10, (rl) this);
        }
        if (param0) {
            ((rl) this).field_N = true;
        }
    }

    private final void m() {
        int discarded$0 = -1;
        this.k();
        int discarded$1 = -1;
        this.l();
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
              if (((rl) this).field_h != 1) {
                break L1;
              } else {
                L2: {
                  if (!(((rl) this).field_i instanceof ub)) {
                    break L2;
                  } else {
                    var5 = (ub) (Object) ((rl) this).field_i;
                    var6 = var5.a((w) this, param2, 9, param3, bk.field_b, sh.field_e);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!((rl) this).field_K) {
                          break L3;
                        } else {
                          if (var6 >= ((rl) this).field_L) {
                            break L3;
                          } else {
                            if (((rl) this).field_I >= var6) {
                              break L3;
                            } else {
                              var6 = ((rl) this).field_L;
                              break L3;
                            }
                          }
                        }
                      }
                      ((rl) this).field_F = var6;
                      break L2;
                    }
                  }
                }
                ((rl) this).field_J = rf.c(param0 ^ -119);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("rl.FA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void e(boolean param0) {
        if (!(!(((rl) this).field_r instanceof nf))) {
            ((nf) (Object) ((rl) this).field_r).a((rl) this, true);
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
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                int discarded$2 = -1;
                this.l();
                var3 = -67 % ((19 - param0) / 35);
                int discarded$3 = 100;
                this.a(var2);
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

    private final void k() {
        String var2 = this.d((byte) -83);
        if (!(var2.length() <= 0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.d((byte) -41)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final String d(byte param0) {
        int var2 = ((rl) this).field_F > ((rl) this).field_I ? ((rl) this).field_I : ((rl) this).field_F;
        int var3 = ((rl) this).field_F <= ((rl) this).field_I ? ((rl) this).field_I : ((rl) this).field_F;
        if (param0 > -27) {
            return null;
        }
        return ((rl) this).field_u.substring(var2, var3);
    }

    private final int i() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        var2 = ((rl) this).field_u.length();
        if (var2 != ((rl) this).field_F) {
          var3 = 1 + ((rl) this).field_F;
          L0: while (true) {
            L1: {
              if (var3 >= var2) {
                break L1;
              } else {
                if (((rl) this).field_u.charAt(var3 - 1) == 32) {
                  break L1;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
            return var3;
          }
        } else {
          return ((rl) this).field_F;
        }
    }

    rl(String param0, vd param1, int param2) {
        super(param0, param1);
        ((rl) this).field_M = 0L;
        ((rl) this).field_L = -1;
        ((rl) this).field_K = false;
        try {
            ((rl) this).field_i = nb.field_z.field_a;
            ((rl) this).field_G = param2;
            ((rl) this).a(param0, -1, true);
            ((rl) this).field_N = true;
            ((rl) this).field_J = rf.c(0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "rl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new rb();
        field_O = false;
    }
}
