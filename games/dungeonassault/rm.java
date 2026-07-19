/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rm extends ck {
    private int field_R;
    private int field_M;
    static String field_J;
    private boolean field_Q;
    private long field_I;
    static boolean field_P;
    private int field_L;
    private int field_K;
    private boolean field_N;
    static int field_T;
    private long field_O;
    static String[] field_S;

    private final void l(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                  this.g((byte) -90);
                  if (param0 > 49) {
                    break L1;
                  } else {
                    field_J = (String) null;
                    break L1;
                  }
                }
                this.a(var2, (byte) -127);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void s(int param0) {
        if (param0 != 32) {
            field_J = (String) null;
        }
        if (this.field_n instanceof jo) {
            ((jo) ((Object) this.field_n)).a((rm) (this), (byte) -127);
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
              if (this.field_K != -1) {
                var3_int = this.field_K + -this.field_w.length();
                if ((var3_int ^ -1) <= -1) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 < -67) {
                break L2;
              } else {
                this.field_I = -77L;
                break L2;
              }
            }
            L3: {
              if (this.field_L == this.field_w.length()) {
                this.field_w = this.field_w + param0;
                break L3;
              } else {
                this.field_w = this.field_w.substring(0, this.field_L) + param0 + this.field_w.substring(this.field_L, this.field_w.length());
                break L3;
              }
            }
            this.field_L = this.field_L + param0.length();
            this.field_M = this.field_L;
            this.n(4746);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("rm.V(");
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
          throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        int dupTemp$1 = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_42_0 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_49_0 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_47_0 = 0;
        Object stackOut_38_0 = null;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_75_0 = 0;
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
              this.field_I = kd.c(-2456);
              if (param3 >= 55) {
                break L1;
              } else {
                this.field_R = 21;
                break L1;
              }
            }
            if (60 == param1) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (62 != param1) {
                L2: {
                  if (param1 < 32) {
                    break L2;
                  } else {
                    if (param1 <= 126) {
                      L3: {
                        if (this.field_L == this.field_M) {
                          break L3;
                        } else {
                          this.g((byte) -105);
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          if (0 == (this.field_K ^ -1)) {
                            break L5;
                          } else {
                            if (this.field_w.length() < this.field_K) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L6: {
                          if (this.field_L < this.field_w.length()) {
                            this.field_w = this.field_w.substring(0, this.field_L) + param1 + this.field_w.substring(this.field_L, this.field_w.length());
                            this.field_L = this.field_L + 1;
                            this.field_M = this.field_L;
                            break L6;
                          } else {
                            this.field_w = this.field_w + param1;
                            dupTemp$1 = this.field_w.length();
                            this.field_L = dupTemp$1;
                            this.field_M = dupTemp$1;
                            break L6;
                          }
                        }
                        this.n(4746);
                        break L4;
                      }
                      stackOut_73_0 = 1;
                      stackIn_74_0 = stackOut_73_0;
                      decompiledRegionSelector0 = 14;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                L7: {
                  if (85 == param2) {
                    if (this.field_M == this.field_L) {
                      if (-1 > (this.field_L ^ -1)) {
                        this.field_M = this.field_L - 1;
                        this.g((byte) -93);
                        stackOut_62_0 = 1;
                        stackIn_63_0 = stackOut_62_0;
                        decompiledRegionSelector0 = 13;
                        break L0;
                      } else {
                        break L7;
                      }
                    } else {
                      this.g((byte) -118);
                      stackOut_58_0 = 1;
                      stackIn_59_0 = stackOut_58_0;
                      decompiledRegionSelector0 = 12;
                      break L0;
                    }
                  } else {
                    if (param2 == 101) {
                      if (this.field_L == this.field_M) {
                        if (this.field_L >= this.field_w.length()) {
                          break L7;
                        } else {
                          this.field_M = this.field_L - -1;
                          this.g((byte) 113);
                          stackOut_55_0 = 1;
                          stackIn_56_0 = stackOut_55_0;
                          decompiledRegionSelector0 = 11;
                          break L0;
                        }
                      } else {
                        this.g((byte) -117);
                        stackOut_52_0 = 1;
                        stackIn_53_0 = stackOut_52_0;
                        decompiledRegionSelector0 = 10;
                        break L0;
                      }
                    } else {
                      if (param2 == 13) {
                        this.p(61);
                        stackOut_49_0 = 1;
                        stackIn_50_0 = stackOut_49_0;
                        decompiledRegionSelector0 = 9;
                        break L0;
                      } else {
                        if ((param2 ^ -1) == -97) {
                          if (0 >= this.field_L) {
                            break L7;
                          } else {
                            L8: {
                              stackOut_44_0 = this;
                              stackIn_46_0 = stackOut_44_0;
                              stackIn_45_0 = stackOut_44_0;
                              if (qk.field_e[82]) {
                                stackOut_46_0 = this;
                                stackOut_46_1 = this.o(88);
                                stackIn_47_0 = stackOut_46_0;
                                stackIn_47_1 = stackOut_46_1;
                                break L8;
                              } else {
                                stackOut_45_0 = this;
                                stackOut_45_1 = this.field_L - 1;
                                stackIn_47_0 = stackOut_45_0;
                                stackIn_47_1 = stackOut_45_1;
                                break L8;
                              }
                            }
                            this.a(stackIn_47_1, 6931);
                            stackOut_47_0 = 1;
                            stackIn_48_0 = stackOut_47_0;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          }
                        } else {
                          if (97 == param2) {
                            if (this.field_L >= this.field_w.length()) {
                              break L7;
                            } else {
                              L9: {
                                stackOut_38_0 = this;
                                stackIn_40_0 = stackOut_38_0;
                                stackIn_39_0 = stackOut_38_0;
                                if (!qk.field_e[82]) {
                                  stackOut_40_0 = this;
                                  stackOut_40_1 = 1 + this.field_L;
                                  stackIn_41_0 = stackOut_40_0;
                                  stackIn_41_1 = stackOut_40_1;
                                  break L9;
                                } else {
                                  stackOut_39_0 = this;
                                  stackOut_39_1 = this.f((byte) 116);
                                  stackIn_41_0 = stackOut_39_0;
                                  stackIn_41_1 = stackOut_39_1;
                                  break L9;
                                }
                              }
                              this.a(stackIn_41_1, 6931);
                              stackOut_41_0 = 1;
                              stackIn_42_0 = stackOut_41_0;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          } else {
                            if ((param2 ^ -1) == -103) {
                              this.a(0, 6931);
                              stackOut_35_0 = 1;
                              stackIn_36_0 = stackOut_35_0;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              if ((param2 ^ -1) == -104) {
                                this.a(this.field_w.length(), 6931);
                                stackOut_33_0 = 1;
                                stackIn_34_0 = stackOut_33_0;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              } else {
                                if (-85 == (param2 ^ -1)) {
                                  this.s(32);
                                  stackOut_31_0 = 1;
                                  stackIn_32_0 = stackOut_31_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                } else {
                                  L10: {
                                    if (!qk.field_e[82]) {
                                      break L10;
                                    } else {
                                      if (param2 == 65) {
                                        this.i(0);
                                        stackOut_29_0 = 1;
                                        stackIn_30_0 = stackOut_29_0;
                                        decompiledRegionSelector0 = 3;
                                        break L0;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (!qk.field_e[82]) {
                                      break L11;
                                    } else {
                                      if (param2 != 66) {
                                        break L11;
                                      } else {
                                        this.h((byte) -86);
                                        stackOut_23_0 = 1;
                                        stackIn_24_0 = stackOut_23_0;
                                        decompiledRegionSelector0 = 1;
                                        break L0;
                                      }
                                    }
                                  }
                                  if (!qk.field_e[82]) {
                                    break L7;
                                  } else {
                                    if (67 != param2) {
                                      break L7;
                                    } else {
                                      this.l(69);
                                      stackOut_27_0 = 1;
                                      stackIn_28_0 = stackOut_27_0;
                                      decompiledRegionSelector0 = 2;
                                      break L0;
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
                stackOut_75_0 = 0;
                stackIn_76_0 = stackOut_75_0;
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
            stackOut_77_0 = (RuntimeException) (var5);
            stackOut_77_1 = new StringBuilder().append("rm.W(");
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param0 == null) {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L12;
            } else {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L12;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_24_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_28_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_30_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_34_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_36_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_42_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_48_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_50_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_53_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_56_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_59_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_63_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_74_0 != 0;
                                    } else {
                                      return stackIn_76_0 != 0;
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

    final void a(String param0, boolean param1, byte param2) {
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
              if (param0 != null) {
                break L1;
              } else {
                param0 = "";
                break L1;
              }
            }
            L2: {
              this.field_w = param0;
              if (param2 >= 2) {
                break L2;
              } else {
                this.g((byte) -16);
                break L2;
              }
            }
            L3: {
              var4_int = param0.length();
              if (-1 == this.field_K) {
                break L3;
              } else {
                if (var4_int > this.field_K) {
                  this.field_w = this.field_w.substring(0, this.field_K);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              dupTemp$2 = this.field_w.length();
              this.field_M = dupTemp$2;
              this.field_L = dupTemp$2;
              if (param1) {
                break L4;
              } else {
                this.n(4746);
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
            stackOut_11_1 = new StringBuilder().append("rm.GA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void h(byte param0) {
        if (param0 >= -73) {
            return;
        }
        String var2 = this.k(82);
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.k(82))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void i(int param0) {
        if (param0 != 0) {
            field_S = (String[]) null;
        }
        this.h((byte) -89);
        this.g((byte) -111);
    }

    void n(int param0) {
        int discarded$0 = 0;
        if (this.field_n instanceof jo) {
            ((jo) ((Object) this.field_n)).a((rm) (this), 10000536);
        }
        if (param0 != 4746) {
            discarded$0 = this.o(99);
        }
    }

    final static int a(ec param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param0.c(true);
              if (var2_int != 255) {
                break L1;
              } else {
                var2_int = ek.field_c;
                break L1;
              }
            }
            L2: {
              if (param1 == 6065) {
                break L2;
              } else {
                field_J = (String) null;
                break L2;
              }
            }
            stackOut_4_0 = var2_int;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("rm.EA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    private final int o(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        if (this.field_L != 0) {
          L0: {
            if (param0 >= 37) {
              break L0;
            } else {
              this.field_O = 78L;
              break L0;
            }
          }
          var2 = -1 + this.field_L;
          L1: while (true) {
            L2: {
              if (-1 <= (var2 ^ -1)) {
                break L2;
              } else {
                if (this.field_w.charAt(-1 + var2) == 32) {
                  break L2;
                } else {
                  var2--;
                  continue L1;
                }
              }
            }
            return var2;
          }
        } else {
          return this.field_L;
        }
    }

    final boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9_int = 0;
        long var9 = 0L;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
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
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
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
            var8_int = -112 / ((-80 - param5) / 35);
            if (super.a(param0, param1, param2, param3, param4, (byte) -124, param6)) {
              if (this.field_o instanceof th) {
                L1: {
                  var9_int = ((th) ((Object) this.field_o)).a(16, param6, hj.field_S, param3, (lm) (this), eh.field_h);
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if ((var9_int ^ -1) != 0) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = var9_int;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L1;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 0;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_7_1, 6931);
                  var9 = kd.c(-2456);
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if ((-this.field_O + var9 ^ -1L) <= -251L) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L2;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L2;
                  }
                }
                L3: {
                  ((rm) (this)).field_N = stackIn_10_1 != 0;
                  if (!this.field_N) {
                    break L3;
                  } else {
                    L4: {
                      this.field_M = this.o(88);
                      this.field_L = this.f((byte) 99);
                      if (this.field_L <= 0) {
                        break L4;
                      } else {
                        if (this.field_w.charAt(-1 + this.field_L) == 32) {
                          this.field_L = this.field_L - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_R = this.field_L;
                    break L3;
                  }
                }
                this.field_O = var9;
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 1;
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
            stackOut_20_1 = new StringBuilder().append("rm.U(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        th var8 = null;
        long var6 = 0L;
        if (this.field_o != null) {
            if (-1 == (param0 ^ -1)) {
                this.field_o.a((byte) 34, (lm) (this), param1, param3, this.field_B);
                if (this.field_o instanceof th) {
                    var8 = (th) ((Object) this.field_o);
                    if (this.field_L != this.field_M) {
                        var8.a(this.field_M, param1, param3, (lm) (this), 33, this.field_L);
                    }
                    var6 = kd.c(param2 + -2456);
                    if (!((-this.field_I + var6) % 1000L >= 500L)) {
                        var8.a((lm) (this), this.field_L, param3, -1, param1);
                    }
                }
            }
        }
        if (param2 != 0) {
            this.j(31);
        }
    }

    final static int a(byte param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            var3_int = 0;
            var4 = param1.length();
            var5 = -123 / ((12 - param0) / 32);
            var6 = 0;
            L1: while (true) {
              if (var6 >= var4) {
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                L2: {
                  if (param2 != param1.charAt(var6)) {
                    break L2;
                  } else {
                    var3_int++;
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("rm.BA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    private final void g(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 82 % ((param0 - -32) / 54);
        if (!(this.field_M == this.field_L)) {
            var3 = this.field_M < this.field_L ? this.field_M : this.field_L;
            var4 = this.field_M < this.field_L ? this.field_L : this.field_M;
            this.field_M = var3;
            this.field_L = var3;
            this.field_w = this.field_w.substring(0, var3) + this.field_w.substring(var4, this.field_w.length());
            this.n(4746);
        }
    }

    final static double a(byte param0, int param1, int param2, double param3, int param4) {
        double var6 = (double)param4 / (double)param2;
        double var8 = -((double)param1 * 0.02) + 0.1;
        int var12 = -29 / ((54 - param0) / 40);
        double var10 = 0.9 - 0.08 * (double)param1;
        double var13 = var6 * var10 + (param3 + var8);
        if (!(1.0 >= var13)) {
            var13 = 1.0;
        }
        return var13;
    }

    private final void a(int param0, int param1) {
        this.field_L = param0;
        if (param1 != 6931) {
            field_P = false;
        }
        if (!qk.field_e[81]) {
            this.field_M = this.field_L;
        }
    }

    public static void m(int param0) {
        field_S = null;
        field_J = null;
        if (param0 != 4) {
            field_P = false;
        }
    }

    private final int f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = DungeonAssault.field_K;
          if (param0 > 76) {
            break L0;
          } else {
            this.l(39);
            break L0;
          }
        }
        var2 = this.field_w.length();
        if (this.field_L != var2) {
          var3 = 1 + this.field_L;
          L1: while (true) {
            L2: {
              if (var2 <= var3) {
                break L2;
              } else {
                if (this.field_w.charAt(-1 + var3) == 32) {
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
            return var3;
          }
        } else {
          return this.field_L;
        }
    }

    void a(int param0, int param1, lm param2, boolean param3) {
        RuntimeException runtimeException = null;
        th var5 = null;
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
              this.j(-24768);
              if (1 != this.field_y) {
                break L1;
              } else {
                L2: {
                  if (!(this.field_o instanceof th)) {
                    break L2;
                  } else {
                    var5 = (th) ((Object) this.field_o);
                    var6 = var5.a(16, param1, hj.field_S, param0, (lm) (this), eh.field_h);
                    if (-1 != var6) {
                      L3: {
                        if (!this.field_N) {
                          break L3;
                        } else {
                          if (var6 >= this.field_R) {
                            break L3;
                          } else {
                            if (this.field_M >= var6) {
                              break L3;
                            } else {
                              var6 = this.field_R;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_L = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_I = kd.c(-2456);
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
            stackOut_11_1 = new StringBuilder().append("rm.B(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
    }

    rm(String param0, pg param1, int param2) {
        super(param0, param1);
        this.field_R = -1;
        this.field_O = 0L;
        this.field_N = false;
        try {
            this.field_K = param2;
            this.field_o = hl.field_a.field_c;
            this.a(param0, true, (byte) 57);
            this.field_Q = true;
            this.field_I = kd.c(-2456);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "rm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void q(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ue var4_ref_ue = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        ub var8 = null;
        wj var9 = null;
        byte[] var13 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var9 = ra.field_c;
              if (param0 == -5705) {
                break L1;
              } else {
                field_T = -87;
                break L1;
              }
            }
            L2: {
              var2 = var9.c(true);
              if (var2 == 0) {
                var8 = (ub) ((Object) bg.field_s.e(-24172));
                if (var8 == null) {
                  tl.a(-86);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var4 = var9.c(true);
                    if (0 == var4) {
                      var5 = null;
                      break L3;
                    } else {
                      var13 = new byte[var4];
                      var9.a((byte) -111, 0, var4, var13);
                      break L3;
                    }
                  }
                  var9.field_o = var9.field_o + 4;
                  if (var9.d(true)) {
                    var8.a(false);
                    break L2;
                  } else {
                    tl.a(param0 ^ -5667);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                if (var2 != 1) {
                  sm.a((Throwable) null, 1, "A1: " + sj.l(192));
                  tl.a(-85);
                  break L2;
                } else {
                  var3 = var9.h(-107);
                  var4_ref_ue = (ue) ((Object) qm.field_q.e(-24172));
                  L4: while (true) {
                    L5: {
                      if (var4_ref_ue == null) {
                        break L5;
                      } else {
                        if (var4_ref_ue.field_k == var3) {
                          break L5;
                        } else {
                          var4_ref_ue = (ue) ((Object) qm.field_q.a(4));
                          continue L4;
                        }
                      }
                    }
                    if (var4_ref_ue != null) {
                      var4_ref_ue.a(false);
                      break L2;
                    } else {
                      tl.a(126);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "rm.CA(" + param0 + ')');
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

    private final void j(int param0) {
        int discarded$1 = 0;
        l var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ec var9 = null;
        th var10 = null;
        var8 = DungeonAssault.field_K;
        if (!this.field_Q) {
          this.field_A = 0;
          this.field_j = 0;
          return;
        } else {
          if (this.field_o instanceof th) {
            L0: {
              var10 = (th) ((Object) this.field_o);
              if (param0 == -24768) {
                break L0;
              } else {
                var9 = (ec) null;
                discarded$1 = rm.a((ec) null, -49);
                break L0;
              }
            }
            var3 = var10.b(-2, (lm) (this));
            var4 = var3.c(-117);
            var5 = var10.c(param0 + 24772, (lm) (this));
            var6 = var10.a(param0 ^ -24774) >> 1084425857;
            if (-var6 + var5 > var4) {
              this.field_j = 0;
              this.field_A = 0;
              return;
            } else {
              L1: {
                var7 = this.field_j - -var3.a((byte) 86, this.field_L);
                if (var5 + -var6 >= var7) {
                  if (var7 >= var6) {
                    break L1;
                  } else {
                    this.field_j = var6 + (-var7 + this.field_j);
                    break L1;
                  }
                } else {
                  this.field_j = this.field_j - (-var5 - -var6 + var7);
                  break L1;
                }
              }
              L2: {
                if (-1 > (this.field_j ^ -1)) {
                  this.field_j = 0;
                  break L2;
                } else {
                  if (var6 + -var5 > this.field_j) {
                    this.field_j = var6 + -var5;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final void p(int param0) {
        int discarded$0 = 0;
        if (param0 <= 30) {
            discarded$0 = rm.a((byte) 6, (CharSequence) null, 'ﾫ');
        }
        this.field_M = 0;
        this.field_w = "";
        this.field_L = 0;
        this.n(4746);
    }

    private final String k(int param0) {
        int var2 = this.field_L <= this.field_M ? this.field_L : this.field_M;
        if (param0 != 82) {
            return (String) null;
        }
        int var3 = this.field_M < this.field_L ? this.field_L : this.field_M;
        return this.field_w.substring(var2, var3);
    }

    final static void r(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              ga.field_o = new cn[9];
              if (1 != hc.field_d) {
                if (-3 != (hc.field_d ^ -1)) {
                  sj.field_db = dd.field_C;
                  break L1;
                } else {
                  sj.field_db = na.field_G;
                  break L1;
                }
              } else {
                sj.field_db = hl.field_e;
                break L1;
              }
            }
            L2: {
              if (param0 == 22362) {
                break L2;
              } else {
                rm.q(124);
                break L2;
              }
            }
            ga.field_o[0] = rc.a("", sb.field_a, "intro_01.jpg", (byte) 71);
            ga.field_o[1] = rc.a("", sb.field_a, "intro_03.jpg", (byte) 71);
            ga.field_o[2] = rc.a("", sb.field_a, "intro_02.jpg", (byte) 71);
            ga.field_o[3] = rc.a("", sb.field_a, "intro_04.jpg", (byte) 71);
            ga.field_o[4] = rc.a("", sb.field_a, "intro_05.jpg", (byte) 71);
            ga.field_o[5] = ga.field_o[4];
            ga.field_o[6] = rc.a("", sb.field_a, "intro_06.jpg", (byte) 71);
            ga.field_o[7] = rc.a("", sb.field_a, "intro_07.jpg", (byte) 71);
            ga.field_o[8] = rc.a("", sb.field_a, "intro_08.jpg", (byte) 71);
            jh.c();
            var1_int = 0;
            L3: while (true) {
              if (var1_int >= ga.field_o.length) {
                jh.b();
                sg.field_b = rc.a("", sb.field_a, "logo.jpg", (byte) 71);
                ro.field_B = true;
                break L0;
              } else {
                ga.field_o[var1_int].e();
                gf.e(0, 0, gf.field_i, gf.field_c, 0);
                gf.e(1, 1, -2 + gf.field_i, -2 + gf.field_c, 0, 128);
                var1_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "rm.G(" + param0 + ')');
        }
    }

    static {
        field_J = "Passive ability - <%0>";
        field_S = new String[]{"Defeat", "<%highlight>Your raider has failed!</col><br><br><%command>Seek another route or try again with another raider. Continue moving your party toward the hoard room.</col>"};
    }
}
