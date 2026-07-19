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
        int dupTemp$1 = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_29_0 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_38_0 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_35_0 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_28_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_3_0 = 0;
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
              this.field_T = bl.a((byte) 45);
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
                          if (this.field_S == this.field_O) {
                            break L3;
                          } else {
                            this.c(false);
                            break L3;
                          }
                        }
                        L4: {
                          if (0 == (this.field_W ^ -1)) {
                            break L4;
                          } else {
                            if (this.field_j.length() < this.field_W) {
                              break L4;
                            } else {
                              return true;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (this.field_O >= this.field_j.length()) {
                              break L6;
                            } else {
                              this.field_j = this.field_j.substring(0, this.field_O) + param1 + this.field_j.substring(this.field_O, this.field_j.length());
                              this.field_O = this.field_O + 1;
                              this.field_S = this.field_O;
                              if (!ZombieDawnMulti.field_E) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          this.field_j = this.field_j + param1;
                          dupTemp$1 = this.field_j.length();
                          this.field_O = dupTemp$1;
                          this.field_S = dupTemp$1;
                          break L5;
                        }
                        this.j(param3 ^ -14400);
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L7: {
                    if (param0 == 85) {
                      if (this.field_O == this.field_S) {
                        if (this.field_O <= 0) {
                          break L7;
                        } else {
                          this.field_S = -1 + this.field_O;
                          this.c(false);
                          stackOut_71_0 = 1;
                          stackIn_72_0 = stackOut_71_0;
                          decompiledRegionSelector0 = 14;
                          break L0;
                        }
                      } else {
                        this.c(false);
                        stackOut_68_0 = 1;
                        stackIn_69_0 = stackOut_68_0;
                        decompiledRegionSelector0 = 13;
                        break L0;
                      }
                    } else {
                      if ((param0 ^ -1) == -102) {
                        if (this.field_O == this.field_S) {
                          if (this.field_O < this.field_j.length()) {
                            this.field_S = this.field_O + 1;
                            this.c(false);
                            stackOut_65_0 = 1;
                            stackIn_66_0 = stackOut_65_0;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          } else {
                            break L7;
                          }
                        } else {
                          this.c(false);
                          stackOut_61_0 = 1;
                          stackIn_62_0 = stackOut_61_0;
                          decompiledRegionSelector0 = 11;
                          break L0;
                        }
                      } else {
                        if (param0 != 13) {
                          if ((param0 ^ -1) != -97) {
                            if (97 != param0) {
                              if (param0 != 102) {
                                if (-104 == (param0 ^ -1)) {
                                  this.b(false, this.field_j.length());
                                  stackOut_58_0 = 1;
                                  stackIn_59_0 = stackOut_58_0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  if (84 == param0) {
                                    this.h(97);
                                    stackOut_56_0 = 1;
                                    stackIn_57_0 = stackOut_56_0;
                                    decompiledRegionSelector0 = 9;
                                    break L0;
                                  } else {
                                    L8: {
                                      if (!lc.field_m[82]) {
                                        break L8;
                                      } else {
                                        if (-66 == (param0 ^ -1)) {
                                          this.f(102);
                                          stackOut_54_0 = 1;
                                          stackIn_55_0 = stackOut_54_0;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!lc.field_m[82]) {
                                        break L9;
                                      } else {
                                        if ((param0 ^ -1) == -67) {
                                          this.i((byte) -60);
                                          stackOut_52_0 = 1;
                                          stackIn_53_0 = stackOut_52_0;
                                          decompiledRegionSelector0 = 7;
                                          break L0;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    if (!lc.field_m[82]) {
                                      break L7;
                                    } else {
                                      if (param0 != 67) {
                                        break L7;
                                      } else {
                                        this.i(param3 + 6458);
                                        stackOut_50_0 = 1;
                                        stackIn_51_0 = stackOut_50_0;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              } else {
                                this.b(false, 0);
                                stackOut_38_0 = 1;
                                stackIn_39_0 = stackOut_38_0;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            } else {
                              if (this.field_O >= this.field_j.length()) {
                                break L7;
                              } else {
                                L10: {
                                  stackOut_32_0 = this;
                                  stackOut_32_1 = 0;
                                  stackIn_34_0 = stackOut_32_0;
                                  stackIn_34_1 = stackOut_32_1;
                                  stackIn_33_0 = stackOut_32_0;
                                  stackIn_33_1 = stackOut_32_1;
                                  if (!lc.field_m[82]) {
                                    stackOut_34_0 = this;
                                    stackOut_34_1 = stackIn_34_1;
                                    stackOut_34_2 = this.field_O + 1;
                                    stackIn_35_0 = stackOut_34_0;
                                    stackIn_35_1 = stackOut_34_1;
                                    stackIn_35_2 = stackOut_34_2;
                                    break L10;
                                  } else {
                                    stackOut_33_0 = this;
                                    stackOut_33_1 = stackIn_33_1;
                                    stackOut_33_2 = this.g(param3 + 6329);
                                    stackIn_35_0 = stackOut_33_0;
                                    stackIn_35_1 = stackOut_33_1;
                                    stackIn_35_2 = stackOut_33_2;
                                    break L10;
                                  }
                                }
                                this.b(stackIn_35_1 != 0, stackIn_35_2);
                                stackOut_35_0 = 1;
                                stackIn_36_0 = stackOut_35_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          } else {
                            if ((this.field_O ^ -1) >= -1) {
                              break L7;
                            } else {
                              L11: {
                                stackOut_25_0 = this;
                                stackOut_25_1 = 0;
                                stackIn_27_0 = stackOut_25_0;
                                stackIn_27_1 = stackOut_25_1;
                                stackIn_26_0 = stackOut_25_0;
                                stackIn_26_1 = stackOut_25_1;
                                if (lc.field_m[82]) {
                                  stackOut_27_0 = this;
                                  stackOut_27_1 = stackIn_27_1;
                                  stackOut_27_2 = this.h((byte) -110);
                                  stackIn_28_0 = stackOut_27_0;
                                  stackIn_28_1 = stackOut_27_1;
                                  stackIn_28_2 = stackOut_27_2;
                                  break L11;
                                } else {
                                  stackOut_26_0 = this;
                                  stackOut_26_1 = stackIn_26_1;
                                  stackOut_26_2 = -1 + this.field_O;
                                  stackIn_28_0 = stackOut_26_0;
                                  stackIn_28_1 = stackOut_26_1;
                                  stackIn_28_2 = stackOut_26_2;
                                  break L11;
                                }
                              }
                              this.b(stackIn_28_1 != 0, stackIn_28_2);
                              stackOut_28_0 = 1;
                              stackIn_29_0 = stackOut_28_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        } else {
                          this.b(true);
                          stackOut_21_0 = 1;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  if (param3 == -6208) {
                    stackOut_76_0 = 0;
                    stackIn_77_0 = stackOut_76_0;
                    decompiledRegionSelector0 = 16;
                    break L0;
                  } else {
                    stackOut_74_0 = 0;
                    stackIn_75_0 = stackOut_74_0;
                    decompiledRegionSelector0 = 15;
                    break L0;
                  }
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) (var5);
            stackOut_78_1 = new StringBuilder().append("pm.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L12;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L12;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_36_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_39_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_51_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_53_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_55_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_57_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_59_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_62_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_66_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_69_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_72_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_75_0 != 0;
                                      } else {
                                        return stackIn_77_0 != 0;
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
    }

    public static void d(boolean param0) {
        if (param0) {
          field_P = (String) null;
          field_R = null;
          field_P = null;
          field_N = null;
          return;
        } else {
          field_R = null;
          field_P = null;
          field_N = null;
          return;
        }
    }

    private final void i(byte param0) {
        try {
            String var2 = null;
            if (param0 == -60) {
              var2 = this.k(-112);
              if ((var2.length() ^ -1) < -1) {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.k(param0 ^ 67))), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              } else {
                return;
              }
            } else {
              field_R = (k) null;
              var2 = this.k(-112);
              if ((var2.length() ^ -1) >= -1) {
                return;
              } else {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.k(param0 ^ 67))), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
        int decompiledRegionSelector0 = 0;
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
                if (!(this.field_h instanceof rk)) {
                  break L1;
                } else {
                  L2: {
                    var8_int = ((rk) ((Object) this.field_h)).b(param5, param6, bd.field_g, bo.field_d, 98, (cf) (this));
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
                    if ((-this.field_X + var8_long ^ -1L) <= -251L) {
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
                    ((pm) (this)).field_M = stackIn_8_1 != 0;
                    if (this.field_M) {
                      L5: {
                        this.field_S = this.h((byte) -110);
                        this.field_O = this.g(114);
                        if (-1 <= (this.field_O ^ -1)) {
                          break L5;
                        } else {
                          if (32 == this.field_j.charAt(-1 + this.field_O)) {
                            this.field_O = this.field_O - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_V = this.field_O;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_X = var8_long;
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var8);
            stackOut_19_1 = new StringBuilder().append("pm.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    final void b(boolean param0) {
        this.field_S = 0;
        if (!param0) {
          this.field_V = 88;
          this.field_j = "";
          this.field_O = 0;
          this.j(8192);
          return;
        } else {
          this.field_j = "";
          this.field_O = 0;
          this.j(8192);
          return;
        }
    }

    private final int g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_8_0 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 > 110) {
          var2 = this.field_j.length();
          if (this.field_O == var2) {
            return this.field_O;
          } else {
            var3 = 1 + this.field_O;
            L0: while (true) {
              if (var3 < var2) {
                stackOut_21_0 = this.field_j.charAt(-1 + var3) ^ -1;
                stackIn_23_0 = stackOut_21_0;
                stackIn_22_0 = stackOut_21_0;
                if (var4 == 0) {
                  if (stackIn_23_0 != -33) {
                    var3++;
                    continue L0;
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_22_0;
                }
              } else {
                return var3;
              }
            }
          }
        } else {
          pm.d(true);
          var2 = this.field_j.length();
          if (this.field_O == var2) {
            return this.field_O;
          } else {
            var3 = 1 + this.field_O;
            L1: while (true) {
              if (var3 < var2) {
                stackOut_8_0 = this.field_j.charAt(-1 + var3) ^ -1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (var4 == 0) {
                  if (stackIn_10_0 != -33) {
                    var3++;
                    continue L1;
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_9_0;
                }
              } else {
                return var3;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6 = 0L;
        rk var8 = null;
        rk var9 = null;
        rk var10 = null;
        if (param0 == -2) {
          if (null != this.field_h) {
            if (0 == param2) {
              this.field_h.a(this.field_F, param1, -15112, param3, (cf) (this));
              if (this.field_h instanceof rk) {
                L0: {
                  var10 = (rk) ((Object) this.field_h);
                  if (this.field_S != this.field_O) {
                    var10.a(this.field_S, param1, this.field_O, param3, param0 ^ -93, (cf) (this));
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var6 = bl.a((byte) 56);
                if (500L <= (-this.field_T + var6) % 1000L) {
                  return;
                } else {
                  var10.a((cf) (this), (byte) 2, param3, this.field_O, param1);
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
          this.field_O = -67;
          if (null != this.field_h) {
            if (0 == param2) {
              this.field_h.a(this.field_F, param1, -15112, param3, (cf) (this));
              if (this.field_h instanceof rk) {
                L1: {
                  var9 = (rk) ((Object) this.field_h);
                  var8 = var9;
                  if (this.field_S != this.field_O) {
                    var9.a(this.field_S, param1, this.field_O, param3, param0 ^ -93, (cf) (this));
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var6 = bl.a((byte) 56);
                if (500L <= (-this.field_T + var6) % 1000L) {
                  return;
                } else {
                  var9.a((cf) (this), (byte) 2, param3, this.field_O, param1);
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

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (this.field_S != this.field_O) {
            L1: {
              if (this.field_O > this.field_S) {
                stackOut_4_0 = this.field_S;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = this.field_O;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_5_0;
              if (this.field_O <= this.field_S) {
                stackOut_7_0 = this.field_S;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = this.field_O;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var3 = stackIn_8_0;
            this.field_S = var2;
            this.field_O = var2;
            this.field_j = this.field_j.substring(0, var2) + this.field_j.substring(var3, this.field_j.length());
            this.j(8192);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0) {
          this.field_V = 105;
          return;
        } else {
          return;
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
        if (this.field_U) {
          if (this.field_h instanceof rk) {
            var9 = (rk) ((Object) this.field_h);
            var3 = var9.a((cf) (this), -112);
            if (param0 < -60) {
              var4 = var3.b(101);
              var5 = var9.a((cf) (this), true);
              var6 = var9.a(0) >> -1925733471;
              if (var4 < var5 - var6) {
                this.field_z = 0;
                this.field_q = 0;
                return;
              } else {
                L0: {
                  var7 = this.field_z - -var3.a(52224, this.field_O);
                  if (var5 + -var6 >= var7) {
                    if (var7 < var6) {
                      this.field_z = this.field_z - -var6 + -var7;
                      break L0;
                    } else {
                      if (-1 <= (this.field_z ^ -1)) {
                        if (-var5 + var6 > this.field_z) {
                          this.field_z = -var5 - -var6;
                          if (var8 != 0) {
                            this.field_z = 0;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        this.field_z = 0;
                        return;
                      }
                    }
                  } else {
                    this.field_z = this.field_z + (-var7 - (-var5 + var6));
                    if (var8 == 0) {
                      break L0;
                    } else {
                      L1: {
                        if (var7 < var6) {
                          this.field_z = this.field_z - -var6 + -var7;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      if (-1 <= (this.field_z ^ -1)) {
                        if (-var5 + var6 > this.field_z) {
                          this.field_z = -var5 - -var6;
                          if (var8 != 0) {
                            this.field_z = 0;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        this.field_z = 0;
                        return;
                      }
                    }
                  }
                }
                if (-1 <= (this.field_z ^ -1)) {
                  if (-var5 + var6 > this.field_z) {
                    this.field_z = -var5 - -var6;
                    if (var8 != 0) {
                      this.field_z = 0;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  this.field_z = 0;
                  return;
                }
              }
            } else {
              this.field_W = -107;
              var4 = var3.b(101);
              var5 = var9.a((cf) (this), true);
              var6 = var9.a(0) >> -1925733471;
              if (var4 < var5 - var6) {
                this.field_z = 0;
                this.field_q = 0;
                return;
              } else {
                var7 = this.field_z - -var3.a(52224, this.field_O);
                if (var5 + -var6 < var7) {
                  this.field_z = this.field_z + (-var7 - (-var5 + var6));
                  if (var8 != 0) {
                    L2: {
                      if (var7 < var6) {
                        this.field_z = this.field_z - -var6 + -var7;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    if (-1 <= (this.field_z ^ -1)) {
                      if (-var5 + var6 > this.field_z) {
                        this.field_z = -var5 - -var6;
                        if (var8 != 0) {
                          this.field_z = 0;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      this.field_z = 0;
                      return;
                    }
                  } else {
                    L3: {
                      L4: {
                        if (-1 > (this.field_z ^ -1)) {
                          break L4;
                        } else {
                          if (-var5 + var6 > this.field_z) {
                            this.field_z = -var5 - -var6;
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_z = 0;
                      break L3;
                    }
                    return;
                  }
                } else {
                  L5: {
                    if (var7 < var6) {
                      this.field_z = this.field_z - -var6 + -var7;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (-1 > (this.field_z ^ -1)) {
                        break L7;
                      } else {
                        if (-var5 + var6 > this.field_z) {
                          this.field_z = -var5 - -var6;
                          if (var8 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    this.field_z = 0;
                    break L6;
                  }
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          this.field_z = 0;
          this.field_q = 0;
          return;
        }
    }

    pm(String param0, bj param1, int param2) {
        super(param0, param1);
        this.field_M = false;
        this.field_V = -1;
        this.field_X = 0L;
        try {
            this.field_W = param2;
            this.field_h = ra.field_o.field_o;
            this.a(true, param0, (byte) 108);
            this.field_U = true;
            this.field_T = bl.a((byte) 106);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "pm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final String k(int param0) {
        sl discarded$2 = null;
        int var2 = 0;
        int var3 = 0;
        ul var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (this.field_O <= this.field_S) {
            stackOut_2_0 = this.field_O;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_S;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (this.field_O > this.field_S) {
            stackOut_5_0 = this.field_O;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = this.field_S;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var3 = stackIn_6_0;
        if (param0 >= -98) {
          var4 = (ul) null;
          discarded$2 = pm.a((ul) null, -5, 40, (ul) null, -102);
          return this.field_j.substring(var2, var3);
        } else {
          return this.field_j.substring(var2, var3);
        }
    }

    private final void i(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.c(false);
                if (param0 == 250) {
                  this.a(var2, (byte) 112);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L1;
              }
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
              if (1 != this.field_u) {
                break L1;
              } else {
                L2: {
                  if (!(this.field_h instanceof rk)) {
                    break L2;
                  } else {
                    var5 = (rk) ((Object) this.field_h);
                    var6 = var5.b(param2, param3, bd.field_g, bo.field_d, 98, (cf) (this));
                    if ((var6 ^ -1) != 0) {
                      L3: {
                        if (!this.field_M) {
                          break L3;
                        } else {
                          if (var6 >= this.field_V) {
                            break L3;
                          } else {
                            if (this.field_S >= var6) {
                              break L3;
                            } else {
                              var6 = this.field_V;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_O = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_T = bl.a((byte) 121);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("pm.T(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void j(int param0) {
        if (!(this.field_A instanceof fi)) {
          if (param0 != 8192) {
            this.field_T = 67L;
            return;
          } else {
            return;
          }
        } else {
          ((fi) ((Object) this.field_A)).a((pm) (this), 0);
          if (param0 == 8192) {
            return;
          } else {
            this.field_T = 67L;
            return;
          }
        }
    }

    private final void b(boolean param0, int param1) {
        String var4 = null;
        this.field_O = param1;
        if (lc.field_m[81]) {
          if (param0) {
            var4 = (String) null;
            this.a((String) null, (byte) -92);
            return;
          } else {
            return;
          }
        } else {
          this.field_S = this.field_O;
          if (!param0) {
            return;
          } else {
            var4 = (String) null;
            this.a((String) null, (byte) -92);
            return;
          }
        }
    }

    private final int h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (0 == this.field_O) {
          return this.field_O;
        } else {
          var2 = this.field_O + -1;
          L0: while (true) {
            if (var2 > 0) {
              var5 = this.field_j.charAt(var2 + -1);
              var4 = 32;
              if (var3 != 0) {
                if (var4 == var5) {
                  return var2;
                } else {
                  this.h(15);
                  return var2;
                }
              } else {
                if (var4 != var5) {
                  var2--;
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    if (param0 != -110) {
                      this.h(15);
                      return var2;
                    } else {
                      return var2;
                    }
                  }
                } else {
                  if (param0 != -110) {
                    this.h(15);
                    return var2;
                  } else {
                    return var2;
                  }
                }
              }
            } else {
              if (param0 != -110) {
                this.h(15);
                return var2;
              } else {
                return var2;
              }
            }
          }
        }
    }

    private final void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
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
              if ((this.field_W ^ -1) != 0) {
                var3_int = this.field_W + -this.field_j.length();
                if (0 > var3_int) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_O == this.field_j.length()) {
                  break L3;
                } else {
                  this.field_j = this.field_j.substring(0, this.field_O) + param0 + this.field_j.substring(this.field_O, this.field_j.length());
                  if (!ZombieDawnMulti.field_E) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_j = this.field_j + param0;
              break L2;
            }
            this.field_O = this.field_O + param0.length();
            if (param1 > 109) {
              this.field_S = this.field_O;
              this.j(8192);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("pm.OA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void f(int param0) {
        this.i((byte) -60);
        this.c(false);
        if (param0 != 102) {
            this.b(true, -83);
        }
    }

    final static void a(boolean param0, boolean param1) {
        sl discarded$8 = null;
        ul var3 = null;
        L0: {
          if (null != ui.field_j) {
            qk.a(ui.field_j, -123);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          L1: {
            if (null != pk.field_b) {
              pk.field_b.b(param1, (byte) 47);
              break L1;
            } else {
              break L1;
            }
          }
          hd.a(param1, -19);
          if (null != bk.field_i) {
            bk.field_i.c(param1, -1);
            ie.a(param1, param0);
            return;
          } else {
            ie.a(param1, param0);
            return;
          }
        } else {
          L2: {
            var3 = (ul) null;
            discarded$8 = pm.a((ul) null, -81, 46, (ul) null, -115);
            if (null != pk.field_b) {
              pk.field_b.b(param1, (byte) 47);
              break L2;
            } else {
              break L2;
            }
          }
          hd.a(param1, -19);
          if (null == bk.field_i) {
            ie.a(param1, param0);
            return;
          } else {
            bk.field_i.c(param1, -1);
            ie.a(param1, param0);
            return;
          }
        }
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
                  field_R = (k) null;
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
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("pm.EA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ')');
        }
        return stackIn_6_0;
    }

    private final void h(int param0) {
        L0: {
          if (this.field_A instanceof fi) {
            ((fi) ((Object) this.field_A)).a((pm) (this), true);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 97) {
          this.field_S = -78;
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, String param1, byte param2) {
        int dupTemp$2 = 0;
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
              this.field_j = param1;
              var4_int = param1.length();
              if (-1 == this.field_W) {
                break L2;
              } else {
                if (this.field_W >= var4_int) {
                  break L2;
                } else {
                  this.field_j = this.field_j.substring(0, this.field_W);
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$2 = this.field_j.length();
              this.field_S = dupTemp$2;
              this.field_O = dupTemp$2;
              if (!param0) {
                this.j(8192);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2 > 102) {
                break L4;
              } else {
                this.a(91, 117, 22, -113);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("pm.FA(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    static {
        field_P = null;
        field_R = new k(256);
    }
}
