/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ul extends hc {
    private boolean field_J;
    static ed[] field_E;
    private int field_N;
    private long field_G;
    private boolean field_M;
    static int[] field_I;
    static ce field_O;
    private long field_D;
    private int field_H;
    private int field_P;
    private int field_L;

    final boolean a(hm param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_50_0 = 0;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_74_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_57_0 = 0;
        Object stackOut_52_0 = null;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_55_0 = 0;
        Object stackOut_46_0 = null;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        try {
          L0: {
            L1: {
              ((ul) this).field_G = td.b(128);
              if (param3 >= 0) {
                break L1;
              } else {
                this.g((byte) 21);
                break L1;
              }
            }
            L2: {
              if (param1 == 60) {
                break L2;
              } else {
                if (62 == param1) {
                  break L2;
                } else {
                  L3: {
                    if (param1 < 32) {
                      break L3;
                    } else {
                      if (126 >= param1) {
                        L4: {
                          if (((ul) this).field_L == ((ul) this).field_P) {
                            break L4;
                          } else {
                            this.k(0);
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (((ul) this).field_H == -1) {
                              break L6;
                            } else {
                              if (((ul) this).field_l.length() >= ((ul) this).field_H) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (~((ul) this).field_L <= ~((ul) this).field_l.length()) {
                              ((ul) this).field_l = ((ul) this).field_l + param1;
                              int dupTemp$1 = ((ul) this).field_l.length();
                              ((ul) this).field_L = dupTemp$1;
                              ((ul) this).field_P = dupTemp$1;
                              break L7;
                            } else {
                              ((ul) this).field_l = ((ul) this).field_l.substring(0, ((ul) this).field_L) + param1 + ((ul) this).field_l.substring(((ul) this).field_L, ((ul) this).field_l.length());
                              ((ul) this).field_L = ((ul) this).field_L + 1;
                              ((ul) this).field_P = ((ul) this).field_L;
                              break L7;
                            }
                          }
                          ((ul) this).a(false);
                          break L5;
                        }
                        stackOut_74_0 = 1;
                        stackIn_75_0 = stackOut_74_0;
                        return stackIn_75_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L8: {
                    if (param2 == 85) {
                      if (((ul) this).field_P != ((ul) this).field_L) {
                        this.k(0);
                        stackOut_63_0 = 1;
                        stackIn_64_0 = stackOut_63_0;
                        return stackIn_64_0 != 0;
                      } else {
                        if (((ul) this).field_L <= 0) {
                          break L8;
                        } else {
                          ((ul) this).field_P = ((ul) this).field_L + -1;
                          this.k(0);
                          stackOut_61_0 = 1;
                          stackIn_62_0 = stackOut_61_0;
                          return stackIn_62_0 != 0;
                        }
                      }
                    } else {
                      if (param2 != 101) {
                        if (param2 == 13) {
                          ((ul) this).h((byte) -29);
                          stackOut_57_0 = 1;
                          stackIn_58_0 = stackOut_57_0;
                          return stackIn_58_0 != 0;
                        } else {
                          if (param2 == 96) {
                            if (((ul) this).field_L <= 0) {
                              break L8;
                            } else {
                              L9: {
                                stackOut_52_0 = this;
                                stackIn_54_0 = stackOut_52_0;
                                stackIn_53_0 = stackOut_52_0;
                                if (!ik.field_h[82]) {
                                  stackOut_54_0 = this;
                                  stackOut_54_1 = -1 + ((ul) this).field_L;
                                  stackIn_55_0 = stackOut_54_0;
                                  stackIn_55_1 = stackOut_54_1;
                                  break L9;
                                } else {
                                  stackOut_53_0 = this;
                                  stackOut_53_1 = this.p(-94);
                                  stackIn_55_0 = stackOut_53_0;
                                  stackIn_55_1 = stackOut_53_1;
                                  break L9;
                                }
                              }
                              this.b(stackIn_55_1, 22);
                              stackOut_55_0 = 1;
                              stackIn_56_0 = stackOut_55_0;
                              return stackIn_56_0 != 0;
                            }
                          } else {
                            if (97 == param2) {
                              if (((ul) this).field_L < ((ul) this).field_l.length()) {
                                L10: {
                                  stackOut_46_0 = this;
                                  stackIn_48_0 = stackOut_46_0;
                                  stackIn_47_0 = stackOut_46_0;
                                  if (ik.field_h[82]) {
                                    stackOut_48_0 = this;
                                    stackOut_48_1 = this.o(1);
                                    stackIn_49_0 = stackOut_48_0;
                                    stackIn_49_1 = stackOut_48_1;
                                    break L10;
                                  } else {
                                    stackOut_47_0 = this;
                                    stackOut_47_1 = ((ul) this).field_L + 1;
                                    stackIn_49_0 = stackOut_47_0;
                                    stackIn_49_1 = stackOut_47_1;
                                    break L10;
                                  }
                                }
                                this.b(stackIn_49_1, 121);
                                stackOut_49_0 = 1;
                                stackIn_50_0 = stackOut_49_0;
                                return stackIn_50_0 != 0;
                              } else {
                                return false;
                              }
                            } else {
                              if (102 != param2) {
                                if (param2 == 103) {
                                  this.b(((ul) this).field_l.length(), 115);
                                  stackOut_42_0 = 1;
                                  stackIn_43_0 = stackOut_42_0;
                                  return stackIn_43_0 != 0;
                                } else {
                                  if (param2 != 84) {
                                    L11: {
                                      if (!ik.field_h[82]) {
                                        break L11;
                                      } else {
                                        if (param2 == 65) {
                                          this.g((byte) 8);
                                          stackOut_40_0 = 1;
                                          stackIn_41_0 = stackOut_40_0;
                                          return stackIn_41_0 != 0;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (!ik.field_h[82]) {
                                        break L12;
                                      } else {
                                        if (66 == param2) {
                                          this.e((byte) 104);
                                          stackOut_38_0 = 1;
                                          stackIn_39_0 = stackOut_38_0;
                                          return stackIn_39_0 != 0;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    if (!ik.field_h[82]) {
                                      break L8;
                                    } else {
                                      if (param2 != 67) {
                                        break L8;
                                      } else {
                                        this.q(87);
                                        stackOut_36_0 = 1;
                                        stackIn_37_0 = stackOut_36_0;
                                        return stackIn_37_0 != 0;
                                      }
                                    }
                                  } else {
                                    this.n(0);
                                    stackOut_26_0 = 1;
                                    stackIn_27_0 = stackOut_26_0;
                                    return stackIn_27_0 != 0;
                                  }
                                }
                              } else {
                                this.b(0, 33);
                                stackOut_22_0 = 1;
                                stackIn_23_0 = stackOut_22_0;
                                return stackIn_23_0 != 0;
                              }
                            }
                          }
                        }
                      } else {
                        if (((ul) this).field_P != ((ul) this).field_L) {
                          this.k(0);
                          stackOut_16_0 = 1;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0 != 0;
                        } else {
                          if (~((ul) this).field_L <= ~((ul) this).field_l.length()) {
                            break L8;
                          } else {
                            ((ul) this).field_P = ((ul) this).field_L + 1;
                            this.k(0);
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            return stackIn_15_0 != 0;
                          }
                        }
                      }
                    }
                  }
                  stackOut_76_0 = 0;
                  stackIn_77_0 = stackOut_76_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var5;
            stackOut_78_1 = new StringBuilder().append("ul.G(");
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param0 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L13;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L13;
            }
          }
          throw t.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_77_0 != 0;
    }

    private final String l(int param0) {
        int var2 = ((ul) this).field_P < ((ul) this).field_L ? ((ul) this).field_P : ((ul) this).field_L;
        int var3 = ((ul) this).field_L > ((ul) this).field_P ? ((ul) this).field_L : ((ul) this).field_P;
        return ((ul) this).field_l.substring(var2, var3);
    }

    void a(boolean param0) {
        if (!(((ul) this).field_q instanceof rj)) {
          if (param0) {
            field_O = null;
            return;
          } else {
            return;
          }
        } else {
          ((rj) (Object) ((ul) this).field_q).a((ul) this, 0);
          if (!param0) {
            return;
          } else {
            field_O = null;
            return;
          }
        }
    }

    private final int o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        var2 = ((ul) this).field_l.length();
        if (var2 != ((ul) this).field_L) {
          var3 = 1 + ((ul) this).field_L;
          L0: while (true) {
            if (var2 > var3) {
              if (((ul) this).field_l.charAt(var3 + -1) != 32) {
                var3++;
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        } else {
          return ((ul) this).field_L;
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = param1 & 8191;
        if (param0 <= -124) {
          if (param1 > -4097) {
            L0: {
              if (-2049 <= param1) {
                stackOut_18_0 = -un.field_t[-2048 + param1];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = un.field_t[-param1 + 2048];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (param1 < 6144) {
                stackOut_14_0 = -un.field_t[6144 - param1];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = un.field_t[-6144 + param1];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          int discarded$1 = ul.a(-64, 14);
          if (param1 > -4097) {
            L2: {
              if (-2049 <= param1) {
                stackOut_8_0 = -un.field_t[-2048 + param1];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = un.field_t[-param1 + 2048];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (param1 < 6144) {
                stackOut_4_0 = -un.field_t[6144 - param1];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = un.field_t[-6144 + param1];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    private final void n(int param0) {
        if (((ul) this).field_q instanceof rj) {
          ((rj) (Object) ((ul) this).field_q).a(true, (ul) this);
          int discarded$4 = ul.a(-65, 47, 47);
          return;
        } else {
          int discarded$5 = ul.a(-65, 47, 47);
          return;
        }
    }

    final void a(String param0, boolean param1, int param2) {
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
              if (param2 == -33) {
                break L1;
              } else {
                ((ul) this).h((byte) 111);
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                param0 = "";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((ul) this).field_l = param0;
              var4_int = param0.length();
              if (((ul) this).field_H == -1) {
                break L3;
              } else {
                if (var4_int <= ((ul) this).field_H) {
                  break L3;
                } else {
                  ((ul) this).field_l = ((ul) this).field_l.substring(0, ((ul) this).field_H);
                  break L3;
                }
              }
            }
            int dupTemp$2 = ((ul) this).field_l.length();
            ((ul) this).field_P = dupTemp$2;
            ((ul) this).field_L = dupTemp$2;
            if (!param1) {
              ((ul) this).a(false);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ul.DA(");
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
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
              if (((ul) this).field_H != -1) {
                var3_int = ((ul) this).field_H - ((ul) this).field_l.length();
                if (0 > var3_int) {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -120) {
                break L2;
              } else {
                ((ul) this).field_J = false;
                break L2;
              }
            }
            L3: {
              if (((ul) this).field_L != ((ul) this).field_l.length()) {
                ((ul) this).field_l = ((ul) this).field_l.substring(0, ((ul) this).field_L) + param1 + ((ul) this).field_l.substring(((ul) this).field_L, ((ul) this).field_l.length());
                break L3;
              } else {
                ((ul) this).field_l = ((ul) this).field_l + param1;
                break L3;
              }
            }
            ((ul) this).field_L = ((ul) this).field_L + param1.length();
            ((ul) this).field_P = ((ul) this).field_L;
            ((ul) this).a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ul.W(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
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
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
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
        int stackOut_15_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              if (((ul) this).field_s instanceof ao) {
                L1: {
                  var8_int = ((ao) (Object) ((ul) this).field_s).a(param4, param0, bj.field_y, dh.field_d, 118, (hm) this);
                  stackOut_3_0 = this;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var8_int == -1) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = var8_int;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L1;
                  }
                }
                L2: {
                  this.b(stackIn_6_1, 61);
                  var8_long = td.b(param2 + 125);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (-((ul) this).field_D + var8_long >= 250L) {
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
                  ((ul) this).field_M = stackIn_9_1 != 0;
                  if (!((ul) this).field_M) {
                    break L3;
                  } else {
                    L4: {
                      ((ul) this).field_P = this.p(-121);
                      ((ul) this).field_L = this.o(1);
                      if (-1 <= ((ul) this).field_L) {
                        break L4;
                      } else {
                        if (-33 == ((ul) this).field_l.charAt(-1 + ((ul) this).field_L)) {
                          ((ul) this).field_L = ((ul) this).field_L - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((ul) this).field_N = ((ul) this).field_L;
                    break L3;
                  }
                }
                ((ul) this).field_D = var8_long;
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0 != 0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var8;
            stackOut_19_1 = new StringBuilder().append("ul.V(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param6 + 41);
        }
        return stackIn_18_0 != 0;
    }

    final static ed a(int param0, int param1, mf param2, byte param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (uc.a(param2, 105, param0, param1)) {
            return al.a((byte) 108);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ul.T(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 9 + 41);
        }
    }

    private final int p(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        if (((ul) this).field_L == 0) {
          return ((ul) this).field_L;
        } else {
          var3 = -8 % ((param0 - 6) / 38);
          var2 = ((ul) this).field_L - 1;
          L0: while (true) {
            if (var2 > 0) {
              if (((ul) this).field_l.charAt(var2 + -1) != 32) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        }
    }

    public static void f(byte param0) {
        field_O = null;
        if (param0 > -52) {
            field_O = null;
            field_E = null;
            field_I = null;
            return;
        }
        field_E = null;
        field_I = null;
    }

    private final void b(int param0, int param1) {
        if (param1 >= 17) {
          ((ul) this).field_L = param0;
          if (!ik.field_h[81]) {
            ((ul) this).field_P = ((ul) this).field_L;
            return;
          } else {
            return;
          }
        } else {
          ul.f((byte) -102);
          ((ul) this).field_L = param0;
          if (ik.field_h[81]) {
            return;
          } else {
            ((ul) this).field_P = ((ul) this).field_L;
            return;
          }
        }
    }

    private final void m(int param0) {
        int var8 = EscapeVector.field_A;
        if (!((ul) this).field_J) {
            ((ul) this).field_n = 0;
            ((ul) this).field_v = 0;
            return;
        }
        if (!(((ul) this).field_s instanceof ao)) {
            return;
        }
        ao var9 = (ao) (Object) ((ul) this).field_s;
        pg var3 = var9.b((hm) this, 90);
        int var4 = var3.a((byte) -112);
        int var5 = var9.a((hm) this, -25033);
        int var6 = var9.a(115) >> 1;
        if (!(var5 + -var6 <= var4)) {
            ((ul) this).field_n = 0;
            ((ul) this).field_v = 0;
            return;
        }
    }

    private final void q(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.k(0);
                this.a((byte) -120, var2);
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

    private final void g(byte param0) {
        if (param0 != 8) {
          ((ul) this).a(-32, (byte) 101, 85, 10);
          this.e((byte) 90);
          this.k(0);
          return;
        } else {
          this.e((byte) 90);
          this.k(0);
          return;
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((ul) this).field_L == ((ul) this).field_P)) {
            var2 = ((ul) this).field_L > ((ul) this).field_P ? ((ul) this).field_P : ((ul) this).field_L;
            var3 = ((ul) this).field_P < ((ul) this).field_L ? ((ul) this).field_L : ((ul) this).field_P;
            ((ul) this).field_L = var2;
            ((ul) this).field_P = var2;
            ((ul) this).field_l = ((ul) this).field_l.substring(0, var2) + ((ul) this).field_l.substring(var3, ((ul) this).field_l.length());
            ((ul) this).a(false);
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (0 != param1) {
          if (param1 != 1) {
            if (param1 == 2) {
              param0 = dc.a(-110, 100, param0) * 100;
              return param0;
            } else {
              if (param2 >= 24) {
                if (3 != param1) {
                  return 0;
                } else {
                  param0 = dc.a(-74, 100, param0) * 100;
                  return param0;
                }
              } else {
                return 31;
              }
            }
          } else {
            return param0 / 2;
          }
        } else {
          return param0;
        }
    }

    ul(String param0, wn param1, int param2) {
        super(param0, param1);
        ((ul) this).field_N = -1;
        ((ul) this).field_M = false;
        ((ul) this).field_D = 0L;
        try {
            ((ul) this).field_s = mb.field_g.field_p;
            ((ul) this).field_H = param2;
            ((ul) this).a(param0, true, -33);
            ((ul) this).field_J = true;
            ((ul) this).field_G = td.b(128);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ul.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    void a(int param0, int param1, int param2, hm param3) {
        RuntimeException runtimeException = null;
        int var6 = 0;
        ao var7 = null;
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
              if (param0 == -14472) {
                break L1;
              } else {
                field_I = null;
                break L1;
              }
            }
            L2: {
              this.m(-22686);
              if (((ul) this).field_t != 1) {
                break L2;
              } else {
                L3: {
                  if (!(((ul) this).field_s instanceof ao)) {
                    break L3;
                  } else {
                    var7 = (ao) (Object) ((ul) this).field_s;
                    var6 = var7.a(param2, param1, bj.field_y, dh.field_d, param0 + 14560, (hm) this);
                    if (var6 == -1) {
                      break L3;
                    } else {
                      L4: {
                        if (!((ul) this).field_M) {
                          break L4;
                        } else {
                          if (((ul) this).field_N <= var6) {
                            break L4;
                          } else {
                            if (var6 > ((ul) this).field_P) {
                              var6 = ((ul) this).field_N;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      ((ul) this).field_L = var6;
                      break L3;
                    }
                  }
                }
                ((ul) this).field_G = td.b(128);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("ul.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final void h(byte param0) {
        Object var3 = null;
        ((ul) this).field_l = "";
        ((ul) this).field_P = 0;
        ((ul) this).field_L = 0;
        if (param0 != -29) {
          var3 = null;
          boolean discarded$2 = ((ul) this).a(-33, 14, (byte) 69, 46, -80, (hm) null, 28);
          ((ul) this).a(false);
          return;
        } else {
          ((ul) this).a(false);
          return;
        }
    }

    private final void e(byte param0) {
        try {
            String var2 = null;
            if (param0 <= 86) {
              L0: {
                ((ul) this).field_L = -80;
                var2 = this.l(100);
                if (var2.length() > 0) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.l(100)), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var2 = this.l(100);
                if (var2.length() > 0) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.l(100)), (java.awt.datatransfer.ClipboardOwner) null);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        long var6 = 0L;
        ao var8 = null;
        ao var9 = null;
        ao var10 = null;
        if (param1 > 85) {
          if (((ul) this).field_s != null) {
            if (param2 == 0) {
              ((ul) this).field_s.a(param3, param0, -21, (hm) this, ((ul) this).field_y);
              if (((ul) this).field_s instanceof ao) {
                L0: {
                  var10 = (ao) (Object) ((ul) this).field_s;
                  if (((ul) this).field_P != ((ul) this).field_L) {
                    var10.a(param3, ((ul) this).field_L, (hm) this, ((ul) this).field_P, -613528456, param0);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var6 = td.b(128);
                if (500L <= (-((ul) this).field_G + var6) % 1000L) {
                  return;
                } else {
                  var10.a((hm) this, ((ul) this).field_L, param3, param0, true);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((ul) this).field_H = -76;
          if (((ul) this).field_s != null) {
            if (param2 == 0) {
              ((ul) this).field_s.a(param3, param0, -21, (hm) this, ((ul) this).field_y);
              if (((ul) this).field_s instanceof ao) {
                L1: {
                  var9 = (ao) (Object) ((ul) this).field_s;
                  var8 = var9;
                  if (((ul) this).field_P != ((ul) this).field_L) {
                    var9.a(param3, ((ul) this).field_L, (hm) this, ((ul) this).field_P, -613528456, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var6 = td.b(128);
                if (500L <= (-((ul) this).field_G + var6) % 1000L) {
                  return;
                } else {
                  var9.a((hm) this, ((ul) this).field_L, param3, param0, true);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new int[128];
    }
}
