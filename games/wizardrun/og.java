/*
 * Decompiled by CFR-JS 0.4.0.
 */
class og extends pl {
    private boolean field_F;
    private int field_L;
    private int field_H;
    private boolean field_Q;
    private long field_I;
    static qj field_N;
    static String field_P;
    static qj field_S;
    static String[] field_R;
    static int field_O;
    private int field_M;
    static String field_G;
    private int field_J;
    private long field_K;

    final void a(int param0, int param1, int param2, int param3) {
        qe var8 = null;
        long var6 = 0L;
        if (null != ((og) this).field_w) {
            if (param2 == 0) {
                ((og) this).field_w.a(param0, param3, (ub) this, true, ((og) this).field_B);
                if (((og) this).field_w instanceof qe) {
                    var8 = (qe) (Object) ((og) this).field_w;
                    if (!(((og) this).field_J == ((og) this).field_L)) {
                        var8.a(((og) this).field_L, true, ((og) this).field_J, param3, param0, (ub) this);
                    }
                    var6 = d.a((byte) 54);
                    if ((-((og) this).field_I + var6) % 1000L < 500L) {
                        var8.a(param3, param0, (ub) this, 0, ((og) this).field_L);
                    }
                }
            }
        }
        if (param1 != 0) {
            ((og) this).field_Q = true;
        }
    }

    final static void a(int param0, int param1, int param2) {
        field_O = param0;
        ee.field_r = param1;
    }

    private final int g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = wizardrun.field_H;
        var2 = ((og) this).field_k.length();
        if (((og) this).field_L != var2) {
          if (param0 >= 19) {
            var3 = 1 + ((og) this).field_L;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (((og) this).field_k.charAt(-1 + var3) == 32) {
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
            return 50;
          }
        } else {
          return ((og) this).field_L;
        }
    }

    og(String param0, ce param1, int param2) {
        super(param0, param1);
        ((og) this).field_Q = false;
        ((og) this).field_M = -1;
        ((og) this).field_K = 0L;
        try {
            ((og) this).field_w = kc.field_H.field_b;
            ((og) this).field_H = param2;
            ((og) this).a(-1, true, param0);
            ((og) this).field_F = true;
            ((og) this).field_I = d.a((byte) 94);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "og.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_73_0 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        int stackOut_71_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_46_0 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_42_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        try {
          L0: {
            L1: {
              ((og) this).field_I = d.a((byte) 99);
              if (param0 == 60) {
                break L1;
              } else {
                if (param0 == 62) {
                  break L1;
                } else {
                  if (param2 < -96) {
                    L2: {
                      if (param0 < 32) {
                        break L2;
                      } else {
                        if (param0 > 126) {
                          break L2;
                        } else {
                          L3: {
                            if (~((og) this).field_J == ~((og) this).field_L) {
                              break L3;
                            } else {
                              this.g(-110);
                              break L3;
                            }
                          }
                          L4: {
                            if (((og) this).field_H == -1) {
                              break L4;
                            } else {
                              if (~((og) this).field_k.length() > ~((og) this).field_H) {
                                break L4;
                              } else {
                                return true;
                              }
                            }
                          }
                          L5: {
                            if (((og) this).field_L >= ((og) this).field_k.length()) {
                              ((og) this).field_k = ((og) this).field_k + param0;
                              int dupTemp$4 = ((og) this).field_k.length();
                              ((og) this).field_L = dupTemp$4;
                              ((og) this).field_J = dupTemp$4;
                              break L5;
                            } else {
                              ((og) this).field_k = ((og) this).field_k.substring(0, ((og) this).field_L) + param0 + ((og) this).field_k.substring(((og) this).field_L, ((og) this).field_k.length());
                              ((og) this).field_L = ((og) this).field_L + 1;
                              ((og) this).field_J = ((og) this).field_L;
                              break L5;
                            }
                          }
                          ((og) this).i((byte) -84);
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0 != 0;
                        }
                      }
                    }
                    L6: {
                      if (param1 != 85) {
                        if (param1 != 101) {
                          if (param1 == 13) {
                            ((og) this).e(true);
                            stackOut_73_0 = 1;
                            stackIn_74_0 = stackOut_73_0;
                            return stackIn_74_0 != 0;
                          } else {
                            if (96 == param1) {
                              if (0 >= ((og) this).field_L) {
                                break L6;
                              } else {
                                L7: {
                                  stackOut_68_0 = this;
                                  stackOut_68_1 = 27;
                                  stackIn_70_0 = stackOut_68_0;
                                  stackIn_70_1 = stackOut_68_1;
                                  stackIn_69_0 = stackOut_68_0;
                                  stackIn_69_1 = stackOut_68_1;
                                  if (hi.field_p[82]) {
                                    int discarded$5 = 31823;
                                    stackOut_70_0 = this;
                                    stackOut_70_1 = stackIn_70_1;
                                    stackOut_70_2 = this.d();
                                    stackIn_71_0 = stackOut_70_0;
                                    stackIn_71_1 = stackOut_70_1;
                                    stackIn_71_2 = stackOut_70_2;
                                    break L7;
                                  } else {
                                    stackOut_69_0 = this;
                                    stackOut_69_1 = stackIn_69_1;
                                    stackOut_69_2 = -1 + ((og) this).field_L;
                                    stackIn_71_0 = stackOut_69_0;
                                    stackIn_71_1 = stackOut_69_1;
                                    stackIn_71_2 = stackOut_69_2;
                                    break L7;
                                  }
                                }
                                this.a((byte) stackIn_71_1, stackIn_71_2);
                                stackOut_71_0 = 1;
                                stackIn_72_0 = stackOut_71_0;
                                return stackIn_72_0 != 0;
                              }
                            } else {
                              if (param1 != 97) {
                                if (param1 == 102) {
                                  this.a((byte) 10, 0);
                                  stackOut_65_0 = 1;
                                  stackIn_66_0 = stackOut_65_0;
                                  return stackIn_66_0 != 0;
                                } else {
                                  if (param1 != 103) {
                                    if (param1 != 84) {
                                      L8: {
                                        if (!hi.field_p[82]) {
                                          break L8;
                                        } else {
                                          if (param1 == 65) {
                                            int discarded$6 = 75;
                                            this.j();
                                            stackOut_63_0 = 1;
                                            stackIn_64_0 = stackOut_63_0;
                                            return stackIn_64_0 != 0;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      L9: {
                                        if (!hi.field_p[82]) {
                                          break L9;
                                        } else {
                                          if (param1 != 66) {
                                            break L9;
                                          } else {
                                            this.f(false);
                                            stackOut_56_0 = 1;
                                            stackIn_57_0 = stackOut_56_0;
                                            return stackIn_57_0 != 0;
                                          }
                                        }
                                      }
                                      if (!hi.field_p[82]) {
                                        break L6;
                                      } else {
                                        if (param1 == 67) {
                                          int discarded$7 = 126;
                                          this.h();
                                          stackOut_61_0 = 1;
                                          stackIn_62_0 = stackOut_61_0;
                                          return stackIn_62_0 != 0;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    } else {
                                      this.h(0);
                                      stackOut_49_0 = 1;
                                      stackIn_50_0 = stackOut_49_0;
                                      return stackIn_50_0 != 0;
                                    }
                                  } else {
                                    this.a((byte) 92, ((og) this).field_k.length());
                                    stackOut_46_0 = 1;
                                    stackIn_47_0 = stackOut_46_0;
                                    return stackIn_47_0 != 0;
                                  }
                                }
                              } else {
                                if (~((og) this).field_L <= ~((og) this).field_k.length()) {
                                  break L6;
                                } else {
                                  L10: {
                                    stackOut_39_0 = this;
                                    stackOut_39_1 = -127;
                                    stackIn_41_0 = stackOut_39_0;
                                    stackIn_41_1 = stackOut_39_1;
                                    stackIn_40_0 = stackOut_39_0;
                                    stackIn_40_1 = stackOut_39_1;
                                    if (!hi.field_p[82]) {
                                      stackOut_41_0 = this;
                                      stackOut_41_1 = stackIn_41_1;
                                      stackOut_41_2 = 1 + ((og) this).field_L;
                                      stackIn_42_0 = stackOut_41_0;
                                      stackIn_42_1 = stackOut_41_1;
                                      stackIn_42_2 = stackOut_41_2;
                                      break L10;
                                    } else {
                                      stackOut_40_0 = this;
                                      stackOut_40_1 = stackIn_40_1;
                                      stackOut_40_2 = this.g((byte) 24);
                                      stackIn_42_0 = stackOut_40_0;
                                      stackIn_42_1 = stackOut_40_1;
                                      stackIn_42_2 = stackOut_40_2;
                                      break L10;
                                    }
                                  }
                                  this.a((byte) stackIn_42_1, stackIn_42_2);
                                  stackOut_42_0 = 1;
                                  stackIn_43_0 = stackOut_42_0;
                                  return stackIn_43_0 != 0;
                                }
                              }
                            }
                          }
                        } else {
                          if (~((og) this).field_L != ~((og) this).field_J) {
                            this.g(76);
                            stackOut_33_0 = 1;
                            stackIn_34_0 = stackOut_33_0;
                            return stackIn_34_0 != 0;
                          } else {
                            if (((og) this).field_L < ((og) this).field_k.length()) {
                              ((og) this).field_J = 1 + ((og) this).field_L;
                              this.g(-73);
                              stackOut_31_0 = 1;
                              stackIn_32_0 = stackOut_31_0;
                              return stackIn_32_0 != 0;
                            } else {
                              break L6;
                            }
                          }
                        }
                      } else {
                        if (((og) this).field_J != ((og) this).field_L) {
                          this.g(-92);
                          stackOut_25_0 = 1;
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0 != 0;
                        } else {
                          if (((og) this).field_L <= 0) {
                            break L6;
                          } else {
                            ((og) this).field_J = -1 + ((og) this).field_L;
                            this.g(31);
                            stackOut_23_0 = 1;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0 != 0;
                          }
                        }
                      }
                    }
                    stackOut_75_0 = 0;
                    stackIn_76_0 = stackOut_75_0;
                    break L0;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  }
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) var5;
            stackOut_77_1 = new StringBuilder().append("og.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param3 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L11;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L11;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + ')');
        }
        return stackIn_76_0 != 0;
    }

    private final void b(String param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
              if (((og) this).field_H != -1) {
                var3_int = ((og) this).field_H + -((og) this).field_k.length();
                if (var3_int < 0) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (((og) this).field_L != ((og) this).field_k.length()) {
                ((og) this).field_k = ((og) this).field_k.substring(0, ((og) this).field_L) + param0 + ((og) this).field_k.substring(((og) this).field_L, ((og) this).field_k.length());
                break L2;
              } else {
                ((og) this).field_k = ((og) this).field_k + param0;
                break L2;
              }
            }
            ((og) this).field_L = ((og) this).field_L + param0.length();
            ((og) this).field_J = ((og) this).field_L;
            ((og) this).i((byte) -122);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("og.KA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + 84 + ')');
        }
    }

    void i(byte param0) {
        if (((og) this).field_s instanceof fj) {
            ((fj) (Object) ((og) this).field_s).a((og) this, 5);
        }
        if (param0 >= -59) {
            ((og) this).field_Q = true;
        }
    }

    final static void a(ai param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        mg var8 = null;
        mg var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            var8 = n.field_b;
            var9 = var8;
            var9.c((byte) -105, 3);
            var9.field_m = var9.field_m + 1;
            var4 = var9.field_m;
            var9.b((byte) 11, 1);
            var9.b(-1947079288, param0.field_i);
            var9.b(-1947079288, param0.field_t);
            var9.b(-1947079288, param0.field_o);
            var9.f(param0.field_k, 613003928);
            var9.f(param0.field_l, 613003928);
            var9.f(param0.field_m, 613003928);
            var9.f(param0.field_p, 613003928);
            var9.b((byte) 11, param0.field_q.length);
            var5 = 0;
            var6 = -49 / ((param2 - 44) / 56);
            L1: while (true) {
              if (param0.field_q.length <= var5) {
                int discarded$1 = var9.e(var4, -1182887024);
                var9.a(-var4 + var9.field_m, -87);
                break L0;
              } else {
                var8.f(param0.field_q[var5], 613003928);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("og.UA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 3 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (super.a(param0, (byte) -83, param2, param3, param4, param5, param6)) {
                if (!(((og) this).field_w instanceof qe)) {
                  break L1;
                } else {
                  L2: {
                    var8_int = ((qe) (Object) ((og) this).field_w).a(9397, pg.field_n, param0, (ub) this, param3, fi.field_B);
                    stackOut_3_0 = this;
                    stackOut_3_1 = -118;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (-1 == var8_int) {
                      stackOut_5_0 = this;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = var8_int;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L2;
                    }
                  }
                  L3: {
                    this.a((byte) stackIn_6_1, stackIn_6_2);
                    var8_long = d.a((byte) 42);
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var8_long + -((og) this).field_K >= 250L) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L3;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L3;
                    }
                  }
                  L4: {
                    ((og) this).field_Q = stackIn_9_1 != 0;
                    if (!((og) this).field_Q) {
                      break L4;
                    } else {
                      L5: {
                        int discarded$1 = 31823;
                        ((og) this).field_J = this.d();
                        ((og) this).field_L = this.g((byte) 113);
                        if (((og) this).field_L <= 0) {
                          break L5;
                        } else {
                          if (((og) this).field_k.charAt(-1 + ((og) this).field_L) != 32) {
                            break L5;
                          } else {
                            ((og) this).field_L = ((og) this).field_L - 1;
                            break L5;
                          }
                        }
                      }
                      ((og) this).field_M = ((og) this).field_L;
                      break L4;
                    }
                  }
                  ((og) this).field_K = var8_long;
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                }
              } else {
                break L1;
              }
            }
            var8_int = -66 % ((param1 - 12) / 36);
            stackOut_16_0 = 0;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8;
            stackOut_18_1 = new StringBuilder().append("og.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param6 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final void e(boolean param0) {
        ((og) this).field_J = 0;
        ((og) this).field_L = 0;
        ((og) this).field_k = "";
        if (!param0) {
            return;
        }
        ((og) this).i((byte) -81);
    }

    void a(int param0, int param1, int param2, ub param3) {
        RuntimeException runtimeException = null;
        int var6 = 0;
        qe var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.e(param0 ^ param0);
              if (((og) this).field_q != 1) {
                break L1;
              } else {
                L2: {
                  if (((og) this).field_w instanceof qe) {
                    var7 = (qe) (Object) ((og) this).field_w;
                    var6 = var7.a(9397, pg.field_n, param2, (ub) this, param1, fi.field_B);
                    if (var6 != -1) {
                      L3: {
                        if (!((og) this).field_Q) {
                          break L3;
                        } else {
                          if (var6 >= ((og) this).field_M) {
                            break L3;
                          } else {
                            if (var6 > ((og) this).field_J) {
                              var6 = ((og) this).field_M;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((og) this).field_L = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((og) this).field_I = d.a((byte) 44);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("og.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    public static void k() {
        field_S = null;
        field_G = null;
        field_N = null;
        field_R = null;
        field_P = null;
    }

    private final int d() {
        int var2 = 0;
        int var3 = 0;
        var3 = wizardrun.field_H;
        if (((og) this).field_L == 0) {
          return ((og) this).field_L;
        } else {
          var2 = ((og) this).field_L - 1;
          L0: while (true) {
            L1: {
              if (0 >= var2) {
                break L1;
              } else {
                if (((og) this).field_k.charAt(-1 + var2) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        }
    }

    private final void h(int param0) {
        if (((og) this).field_s instanceof fj) {
            ((fj) (Object) ((og) this).field_s).a(-117, (og) this);
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 10 % ((-48 - param0) / 44);
        ((og) this).field_L = param1;
        if (!(hi.field_p[81])) {
            ((og) this).field_J = ((og) this).field_L;
        }
    }

    private final String f() {
        int var2 = ((og) this).field_L > ((og) this).field_J ? ((og) this).field_J : ((og) this).field_L;
        int var3 = ((og) this).field_L > ((og) this).field_J ? ((og) this).field_L : ((og) this).field_J;
        return ((og) this).field_k.substring(var2, var3);
    }

    private final void e(int param0) {
        af var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qe var9 = null;
        var8 = wizardrun.field_H;
        if (((og) this).field_F) {
          L0: {
            if (param0 == 0) {
              break L0;
            } else {
              ((og) this).field_K = 13L;
              break L0;
            }
          }
          if (!(((og) this).field_w instanceof qe)) {
            return;
          } else {
            var9 = (qe) (Object) ((og) this).field_w;
            var3 = var9.a((ub) this, (byte) 78);
            var4 = var3.a(-127);
            var5 = var9.a((ub) this, param0 + -106);
            var6 = var9.a((byte) 62) >> 1;
            if (var4 >= var5 + -var6) {
              L1: {
                var7 = ((og) this).field_i - -var3.a(62, ((og) this).field_L);
                if (var5 + -var6 >= var7) {
                  if (var6 <= var7) {
                    break L1;
                  } else {
                    ((og) this).field_i = ((og) this).field_i + var6 - var7;
                    break L1;
                  }
                } else {
                  ((og) this).field_i = var5 + (-var6 - var7) + ((og) this).field_i;
                  break L1;
                }
              }
              L2: {
                if (((og) this).field_i > 0) {
                  ((og) this).field_i = 0;
                  break L2;
                } else {
                  if (((og) this).field_i < var6 + -var5) {
                    ((og) this).field_i = var6 + -var5;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            } else {
              ((og) this).field_i = 0;
              ((og) this).field_j = 0;
              return;
            }
          }
        } else {
          ((og) this).field_j = 0;
          ((og) this).field_i = 0;
          return;
        }
    }

    private final void f(boolean param0) {
        int discarded$0 = -12938;
        String var2 = this.f();
        if (!(var2.length() <= 0)) {
            int discarded$1 = -12938;
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.f()), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void a(int param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
              if (param2 == null) {
                param2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((og) this).field_k = param2;
              var4_int = param2.length();
              if (((og) this).field_H == param0) {
                break L2;
              } else {
                if (((og) this).field_H < var4_int) {
                  ((og) this).field_k = ((og) this).field_k.substring(0, ((og) this).field_H);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              int dupTemp$2 = ((og) this).field_k.length();
              ((og) this).field_J = dupTemp$2;
              ((og) this).field_L = dupTemp$2;
              if (param1) {
                break L3;
              } else {
                ((og) this).i((byte) -94);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("og.LA(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          throw bd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((og) this).field_J != ((og) this).field_L) {
            var2 = ((og) this).field_L > ((og) this).field_J ? ((og) this).field_J : ((og) this).field_L;
            var3 = ((og) this).field_L <= ((og) this).field_J ? ((og) this).field_J : ((og) this).field_L;
            ((og) this).field_L = var2;
            ((og) this).field_J = var2;
            ((og) this).field_k = ((og) this).field_k.substring(0, var2) + ((og) this).field_k.substring(var3, ((og) this).field_k.length());
            ((og) this).i((byte) -115);
        }
        var2 = 47 / ((param0 - -20) / 43);
    }

    private final void h() {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.g(-125);
                int discarded$1 = 84;
                this.b(var2);
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

    private final void j() {
        this.f(false);
        this.g(-70);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = -1;
        field_G = "Main Menu";
        field_P = "Move left and right";
    }
}
