/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pm extends gn {
    private long field_T;
    static String field_P;
    static k field_R;
    private int field_O;
    static int field_Q;
    private boolean field_U;
    private int field_V;
    private long field_X;
    private boolean field_M;
    private int field_W;
    private int field_S;
    static ri field_N;

    final boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_28_0 = 0;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
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
        int stackOut_15_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_37_0 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_34_0 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_27_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
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
              ((pm) this).field_T = bl.a((byte) 45);
              if (param1 == 60) {
                break L1;
              } else {
                if (param1 == 62) {
                  break L1;
                } else {
                  L2: {
                    if (param1 < 32) {
                      break L2;
                    } else {
                      if (param1 > 126) {
                        break L2;
                      } else {
                        L3: {
                          if (~((pm) this).field_S == ~((pm) this).field_O) {
                            break L3;
                          } else {
                            this.c(false);
                            break L3;
                          }
                        }
                        L4: {
                          if (((pm) this).field_W == -1) {
                            break L4;
                          } else {
                            if (((pm) this).field_j.length() < ((pm) this).field_W) {
                              break L4;
                            } else {
                              return true;
                            }
                          }
                        }
                        L5: {
                          if (~((pm) this).field_O <= ~((pm) this).field_j.length()) {
                            ((pm) this).field_j = ((pm) this).field_j + param1;
                            int dupTemp$1 = ((pm) this).field_j.length();
                            ((pm) this).field_O = dupTemp$1;
                            ((pm) this).field_S = dupTemp$1;
                            break L5;
                          } else {
                            ((pm) this).field_j = ((pm) this).field_j.substring(0, ((pm) this).field_O) + param1 + ((pm) this).field_j.substring(((pm) this).field_O, ((pm) this).field_j.length());
                            ((pm) this).field_O = ((pm) this).field_O + 1;
                            ((pm) this).field_S = ((pm) this).field_O;
                            break L5;
                          }
                        }
                        ((pm) this).j(param3 ^ -14400);
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      }
                    }
                  }
                  L6: {
                    if (param0 == 85) {
                      if (~((pm) this).field_O == ~((pm) this).field_S) {
                        if (((pm) this).field_O <= 0) {
                          break L6;
                        } else {
                          ((pm) this).field_S = -1 + ((pm) this).field_O;
                          this.c(false);
                          stackOut_70_0 = 1;
                          stackIn_71_0 = stackOut_70_0;
                          return stackIn_71_0 != 0;
                        }
                      } else {
                        this.c(false);
                        stackOut_67_0 = 1;
                        stackIn_68_0 = stackOut_67_0;
                        return stackIn_68_0 != 0;
                      }
                    } else {
                      if (param0 == 101) {
                        if (((pm) this).field_O == ((pm) this).field_S) {
                          if (((pm) this).field_O < ((pm) this).field_j.length()) {
                            ((pm) this).field_S = ((pm) this).field_O + 1;
                            this.c(false);
                            stackOut_64_0 = 1;
                            stackIn_65_0 = stackOut_64_0;
                            return stackIn_65_0 != 0;
                          } else {
                            break L6;
                          }
                        } else {
                          this.c(false);
                          stackOut_60_0 = 1;
                          stackIn_61_0 = stackOut_60_0;
                          return stackIn_61_0 != 0;
                        }
                      } else {
                        if (param0 != 13) {
                          if (param0 != 96) {
                            if (97 != param0) {
                              if (param0 != 102) {
                                if (param0 == 103) {
                                  this.b(false, ((pm) this).field_j.length());
                                  stackOut_57_0 = 1;
                                  stackIn_58_0 = stackOut_57_0;
                                  return stackIn_58_0 != 0;
                                } else {
                                  if (84 == param0) {
                                    this.h(97);
                                    stackOut_55_0 = 1;
                                    stackIn_56_0 = stackOut_55_0;
                                    return stackIn_56_0 != 0;
                                  } else {
                                    L7: {
                                      if (!lc.field_m[82]) {
                                        break L7;
                                      } else {
                                        if (param0 == 65) {
                                          this.f(102);
                                          stackOut_53_0 = 1;
                                          stackIn_54_0 = stackOut_53_0;
                                          return stackIn_54_0 != 0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    L8: {
                                      if (!lc.field_m[82]) {
                                        break L8;
                                      } else {
                                        if (param0 == 66) {
                                          this.i((byte) -60);
                                          stackOut_51_0 = 1;
                                          stackIn_52_0 = stackOut_51_0;
                                          return stackIn_52_0 != 0;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    if (!lc.field_m[82]) {
                                      break L6;
                                    } else {
                                      if (param0 != 67) {
                                        break L6;
                                      } else {
                                        this.i(param3 + 6458);
                                        stackOut_49_0 = 1;
                                        stackIn_50_0 = stackOut_49_0;
                                        return stackIn_50_0 != 0;
                                      }
                                    }
                                  }
                                }
                              } else {
                                this.b(false, 0);
                                stackOut_37_0 = 1;
                                stackIn_38_0 = stackOut_37_0;
                                return stackIn_38_0 != 0;
                              }
                            } else {
                              if (~((pm) this).field_O <= ~((pm) this).field_j.length()) {
                                break L6;
                              } else {
                                L9: {
                                  stackOut_31_0 = this;
                                  stackOut_31_1 = 0;
                                  stackIn_33_0 = stackOut_31_0;
                                  stackIn_33_1 = stackOut_31_1;
                                  stackIn_32_0 = stackOut_31_0;
                                  stackIn_32_1 = stackOut_31_1;
                                  if (!lc.field_m[82]) {
                                    stackOut_33_0 = this;
                                    stackOut_33_1 = stackIn_33_1;
                                    stackOut_33_2 = ((pm) this).field_O + 1;
                                    stackIn_34_0 = stackOut_33_0;
                                    stackIn_34_1 = stackOut_33_1;
                                    stackIn_34_2 = stackOut_33_2;
                                    break L9;
                                  } else {
                                    stackOut_32_0 = this;
                                    stackOut_32_1 = stackIn_32_1;
                                    stackOut_32_2 = this.g(param3 + 6329);
                                    stackIn_34_0 = stackOut_32_0;
                                    stackIn_34_1 = stackOut_32_1;
                                    stackIn_34_2 = stackOut_32_2;
                                    break L9;
                                  }
                                }
                                this.b(stackIn_34_1 != 0, stackIn_34_2);
                                stackOut_34_0 = 1;
                                stackIn_35_0 = stackOut_34_0;
                                return stackIn_35_0 != 0;
                              }
                            }
                          } else {
                            if (((pm) this).field_O <= 0) {
                              break L6;
                            } else {
                              L10: {
                                stackOut_24_0 = this;
                                stackOut_24_1 = 0;
                                stackIn_26_0 = stackOut_24_0;
                                stackIn_26_1 = stackOut_24_1;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                if (lc.field_m[82]) {
                                  stackOut_26_0 = this;
                                  stackOut_26_1 = stackIn_26_1;
                                  stackOut_26_2 = this.h((byte) -110);
                                  stackIn_27_0 = stackOut_26_0;
                                  stackIn_27_1 = stackOut_26_1;
                                  stackIn_27_2 = stackOut_26_2;
                                  break L10;
                                } else {
                                  stackOut_25_0 = this;
                                  stackOut_25_1 = stackIn_25_1;
                                  stackOut_25_2 = -1 + ((pm) this).field_O;
                                  stackIn_27_0 = stackOut_25_0;
                                  stackIn_27_1 = stackOut_25_1;
                                  stackIn_27_2 = stackOut_25_2;
                                  break L10;
                                }
                              }
                              this.b(stackIn_27_1 != 0, stackIn_27_2);
                              stackOut_27_0 = 1;
                              stackIn_28_0 = stackOut_27_0;
                              return stackIn_28_0 != 0;
                            }
                          }
                        } else {
                          ((pm) this).b(true);
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0 != 0;
                        }
                      }
                    }
                  }
                  if (param3 == -6208) {
                    stackOut_75_0 = 0;
                    stackIn_76_0 = stackOut_75_0;
                    break L0;
                  } else {
                    stackOut_73_0 = 0;
                    stackIn_74_0 = stackOut_73_0;
                    return stackIn_74_0 != 0;
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
            stackOut_77_1 = new StringBuilder().append("pm.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param2 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + ',' + param3 + ')');
        }
        return stackIn_76_0 != 0;
    }

    public static void d(boolean param0) {
        if (param0) {
            field_P = null;
        }
        field_R = null;
        field_P = null;
        field_N = null;
    }

    private final void i(byte param0) {
        String var2 = this.k(-112);
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.k(-121)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
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
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
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
            L1: {
              if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
                break L1;
              } else {
                if (!(((pm) this).field_h instanceof rk)) {
                  break L1;
                } else {
                  L2: {
                    var8_int = ((rk) (Object) ((pm) this).field_h).b(param5, param6, bd.field_g, bo.field_d, 98, (cf) this);
                    stackOut_2_0 = this;
                    stackOut_2_1 = 0;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    if (-1 == var8_int) {
                      stackOut_4_0 = this;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 0;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      stackIn_5_2 = stackOut_4_2;
                      break L2;
                    } else {
                      stackOut_3_0 = this;
                      stackOut_3_1 = stackIn_3_1;
                      stackOut_3_2 = var8_int;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      stackIn_5_2 = stackOut_3_2;
                      break L2;
                    }
                  }
                  L3: {
                    this.b(stackIn_5_1 != 0, stackIn_5_2);
                    var8_long = bl.a((byte) 115);
                    stackOut_5_0 = this;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (-((pm) this).field_X + var8_long >= 250L) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L3;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L3;
                    }
                  }
                  L4: {
                    ((pm) this).field_M = stackIn_8_1 != 0;
                    if (((pm) this).field_M) {
                      L5: {
                        ((pm) this).field_S = this.h((byte) -110);
                        ((pm) this).field_O = this.g(114);
                        if (((pm) this).field_O <= 0) {
                          break L5;
                        } else {
                          if (32 == ((pm) this).field_j.charAt(-1 + ((pm) this).field_O)) {
                            ((pm) this).field_O = ((pm) this).field_O - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((pm) this).field_V = ((pm) this).field_O;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((pm) this).field_X = var8_long;
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                }
              }
            }
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var8;
            stackOut_19_1 = new StringBuilder().append("pm.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final void b(boolean param0) {
        ((pm) this).field_S = 0;
        if (!param0) {
            ((pm) this).field_V = 88;
        }
        ((pm) this).field_j = "";
        ((pm) this).field_O = 0;
        ((pm) this).j(8192);
    }

    private final int g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 > 110) {
            break L0;
          } else {
            pm.d(true);
            break L0;
          }
        }
        var2 = ((pm) this).field_j.length();
        if (((pm) this).field_O == var2) {
          return ((pm) this).field_O;
        } else {
          var3 = 1 + ((pm) this).field_O;
          L1: while (true) {
            L2: {
              if (var3 >= var2) {
                break L2;
              } else {
                if (((pm) this).field_j.charAt(-1 + var3) == 32) {
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
            return var3;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        rk var8 = null;
        long var6 = 0L;
        if (param0 != -2) {
            ((pm) this).field_O = -67;
        }
        if (null != ((pm) this).field_h) {
            if (!(0 != param2)) {
                ((pm) this).field_h.a(((pm) this).field_F, param1, -15112, param3, (cf) this);
                if (!(!(((pm) this).field_h instanceof rk))) {
                    var8 = (rk) (Object) ((pm) this).field_h;
                    if (!(((pm) this).field_S == ((pm) this).field_O)) {
                        var8.a(((pm) this).field_S, param1, ((pm) this).field_O, param3, param0 ^ -93, (cf) this);
                    }
                    var6 = bl.a((byte) 56);
                    if (!(500L <= (-((pm) this).field_T + var6) % 1000L)) {
                        var8.a((cf) this, (byte) 2, param3, ((pm) this).field_O, param1);
                    }
                }
            }
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((pm) this).field_S == ((pm) this).field_O)) {
            var2 = ((pm) this).field_O <= ((pm) this).field_S ? ((pm) this).field_O : ((pm) this).field_S;
            var3 = ((pm) this).field_O > ((pm) this).field_S ? ((pm) this).field_O : ((pm) this).field_S;
            ((pm) this).field_S = var2;
            ((pm) this).field_O = var2;
            ((pm) this).field_j = ((pm) this).field_j.substring(0, var2) + ((pm) this).field_j.substring(var3, ((pm) this).field_j.length());
            ((pm) this).j(8192);
        }
    }

    private final void g(byte param0) {
        mp var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        rk var9 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((pm) this).field_U) {
          if (((pm) this).field_h instanceof rk) {
            var9 = (rk) (Object) ((pm) this).field_h;
            var3 = var9.a((cf) this, -112);
            var4 = var3.b(101);
            var5 = var9.a((cf) this, true);
            var6 = var9.a(0) >> 1;
            if (var4 < var5 - var6) {
              ((pm) this).field_z = 0;
              ((pm) this).field_q = 0;
              return;
            } else {
              L0: {
                var7 = ((pm) this).field_z - -var3.a(52224, ((pm) this).field_O);
                if (var5 + -var6 >= var7) {
                  if (var7 < var6) {
                    ((pm) this).field_z = ((pm) this).field_z - -var6 + -var7;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  ((pm) this).field_z = ((pm) this).field_z + (-var7 - (-var5 + var6));
                  break L0;
                }
              }
              L1: {
                if (((pm) this).field_z > 0) {
                  ((pm) this).field_z = 0;
                  break L1;
                } else {
                  if (-var5 + var6 > ((pm) this).field_z) {
                    ((pm) this).field_z = -var5 - -var6;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          ((pm) this).field_z = 0;
          ((pm) this).field_q = 0;
          return;
        }
    }

    pm(String param0, bj param1, int param2) {
        super(param0, param1);
        ((pm) this).field_M = false;
        ((pm) this).field_V = -1;
        ((pm) this).field_X = 0L;
        try {
            ((pm) this).field_W = param2;
            ((pm) this).field_h = ra.field_o.field_o;
            ((pm) this).a(true, param0, (byte) 108);
            ((pm) this).field_U = true;
            ((pm) this).field_T = bl.a((byte) 106);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "pm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final String k(int param0) {
        int var2 = ((pm) this).field_O > ((pm) this).field_S ? ((pm) this).field_S : ((pm) this).field_O;
        int var3 = ((pm) this).field_O <= ((pm) this).field_S ? ((pm) this).field_S : ((pm) this).field_O;
        if (param0 >= -98) {
            Object var4 = null;
            sl discarded$0 = pm.a((ul) null, -5, 40, (ul) null, -102);
        }
        return ((pm) this).field_j.substring(var2, var3);
    }

    private final void i(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.c(false);
                if (param0 == 250) {
                  this.a(var2, (byte) 112);
                  break L0;
                } else {
                  return;
                }
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

    void a(int param0, cf param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        rk var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              super.a(param0, param1, param2, param3);
              this.g((byte) -84);
              if (1 != ((pm) this).field_u) {
                break L1;
              } else {
                L2: {
                  if (!(((pm) this).field_h instanceof rk)) {
                    break L2;
                  } else {
                    var5 = (rk) (Object) ((pm) this).field_h;
                    var6 = var5.b(param2, param3, bd.field_g, bo.field_d, 98, (cf) this);
                    if (var6 != -1) {
                      L3: {
                        if (!((pm) this).field_M) {
                          break L3;
                        } else {
                          if (var6 >= ((pm) this).field_V) {
                            break L3;
                          } else {
                            if (((pm) this).field_S >= var6) {
                              break L3;
                            } else {
                              var6 = ((pm) this).field_V;
                              break L3;
                            }
                          }
                        }
                      }
                      ((pm) this).field_O = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                ((pm) this).field_T = bl.a((byte) 121);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("pm.T(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void j(int param0) {
        if (((pm) this).field_A instanceof fi) {
            ((fi) (Object) ((pm) this).field_A).a((pm) this, 0);
        }
        if (param0 != 8192) {
            ((pm) this).field_T = 67L;
        }
    }

    private final void b(boolean param0, int param1) {
        ((pm) this).field_O = param1;
        if (!lc.field_m[81]) {
            ((pm) this).field_S = ((pm) this).field_O;
        }
        Object var4 = null;
        this.a((String) null, (byte) -92);
    }

    private final int h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (0 == ((pm) this).field_O) {
          return ((pm) this).field_O;
        } else {
          var2 = ((pm) this).field_O + -1;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (32 == ((pm) this).field_j.charAt(var2 + -1)) {
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

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        if (!(((pm) this).field_W == -1)) {
            var3_int = ((pm) this).field_W + -((pm) this).field_j.length();
            if (0 <= var3_int) {
                return;
            }
            param0 = param0.substring(0, var3_int);
        }
        if (((pm) this).field_O != ((pm) this).field_j.length()) {
            ((pm) this).field_j = ((pm) this).field_j.substring(0, ((pm) this).field_O) + param0 + ((pm) this).field_j.substring(((pm) this).field_O, ((pm) this).field_j.length());
        } else {
            ((pm) this).field_j = ((pm) this).field_j + param0;
        }
        ((pm) this).field_O = ((pm) this).field_O + param0.length();
        try {
            ((pm) this).field_S = ((pm) this).field_O;
            ((pm) this).j(8192);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "pm.OA(" + (param0 != null ? "{...}" : "null") + ',' + 112 + ')');
        }
    }

    private final void f(int param0) {
        this.i((byte) -60);
        this.c(false);
    }

    final static void a(boolean param0, boolean param1) {
        if (!(null == ui.field_j)) {
            qk.a(ui.field_j, -123);
        }
        if (!(null == pk.field_b)) {
            pk.field_b.b(param1, (byte) 47);
        }
        hd.a(param1, -19);
        if (null != bk.field_i) {
            bk.field_i.c(param1, -1);
        }
        ie.a(param1, false);
    }

    final static sl a(ul param0, int param1, int param2, ul param3, int param4) {
        RuntimeException var5 = null;
        sl stackIn_6_0 = null;
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
        sl stackOut_5_0 = null;
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
            if (ud.a(param2, param3, param1, (byte) -42)) {
              L1: {
                if (param4 == -29435) {
                  break L1;
                } else {
                  field_R = null;
                  break L1;
                }
              }
              stackOut_5_0 = me.a(param0.a(param2, true, param1), true);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("pm.EA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
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
          throw fa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param4 + ')');
        }
        return stackIn_6_0;
    }

    private final void h(int param0) {
        if (!(!(((pm) this).field_A instanceof fi))) {
            ((fi) (Object) ((pm) this).field_A).a((pm) this, true);
        }
    }

    final void a(boolean param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param1 != null) {
                break L1;
              } else {
                param1 = "";
                break L1;
              }
            }
            L2: {
              ((pm) this).field_j = param1;
              var4_int = param1.length();
              if (-1 == ((pm) this).field_W) {
                break L2;
              } else {
                if (((pm) this).field_W >= var4_int) {
                  break L2;
                } else {
                  ((pm) this).field_j = ((pm) this).field_j.substring(0, ((pm) this).field_W);
                  break L2;
                }
              }
            }
            L3: {
              int dupTemp$2 = ((pm) this).field_j.length();
              ((pm) this).field_S = dupTemp$2;
              ((pm) this).field_O = dupTemp$2;
              if (!param0) {
                ((pm) this).j(8192);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2 > 102) {
                break L4;
              } else {
                ((pm) this).a(91, 117, 22, -113);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("pm.FA(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = null;
        field_R = new k(256);
    }
}
