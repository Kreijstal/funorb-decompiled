/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lb extends rh {
    static boolean field_M;
    private int field_L;
    private long field_R;
    static rd field_O;
    private boolean field_K;
    private long field_I;
    private boolean field_P;
    private int field_N;
    private int field_Q;
    private int field_J;

    final boolean a(byte param0, char param1, al param2, int param3) {
        int dupTemp$1 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_23_0 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_61_0 = 0;
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
        int stackOut_71_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_34_0 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_29_0 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_22_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_3_0 = 0;
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
            L1: {
              this.field_I = qg.a(false);
              var5_int = -37 % ((param0 - 17) / 51);
              if (param1 == 60) {
                break L1;
              } else {
                if (62 == param1) {
                  break L1;
                } else {
                  L2: {
                    if (param1 < 32) {
                      break L2;
                    } else {
                      if (param1 <= 126) {
                        L3: {
                          if (this.field_N == this.field_Q) {
                            break L3;
                          } else {
                            this.j(29388);
                            break L3;
                          }
                        }
                        L4: {
                          L5: {
                            if (this.field_J == -1) {
                              break L5;
                            } else {
                              if (this.field_s.length() < this.field_J) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L6: {
                            if (this.field_Q < this.field_s.length()) {
                              this.field_s = this.field_s.substring(0, this.field_Q) + param1 + this.field_s.substring(this.field_Q, this.field_s.length());
                              this.field_Q = this.field_Q + 1;
                              this.field_N = this.field_Q;
                              break L6;
                            } else {
                              this.field_s = this.field_s + param1;
                              dupTemp$1 = this.field_s.length();
                              this.field_Q = dupTemp$1;
                              this.field_N = dupTemp$1;
                              break L6;
                            }
                          }
                          this.b(true);
                          break L4;
                        }
                        stackOut_71_0 = 1;
                        stackIn_72_0 = stackOut_71_0;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L7: {
                    if (param3 != 85) {
                      if ((param3 ^ -1) == -102) {
                        if (this.field_Q != this.field_N) {
                          this.j(29388);
                          stackOut_60_0 = 1;
                          stackIn_61_0 = stackOut_60_0;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        } else {
                          if (this.field_Q >= this.field_s.length()) {
                            break L7;
                          } else {
                            this.field_N = 1 + this.field_Q;
                            this.j(29388);
                            stackOut_58_0 = 1;
                            stackIn_59_0 = stackOut_58_0;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          }
                        }
                      } else {
                        if (param3 == 13) {
                          this.l(-90);
                          stackOut_54_0 = 1;
                          stackIn_55_0 = stackOut_54_0;
                          decompiledRegionSelector0 = 11;
                          break L0;
                        } else {
                          if ((param3 ^ -1) != -97) {
                            if (97 != param3) {
                              if (param3 == 102) {
                                this.a(-19166, 0);
                                stackOut_52_0 = 1;
                                stackIn_53_0 = stackOut_52_0;
                                decompiledRegionSelector0 = 10;
                                break L0;
                              } else {
                                if (-104 == (param3 ^ -1)) {
                                  this.a(-19166, this.field_s.length());
                                  stackOut_50_0 = 1;
                                  stackIn_51_0 = stackOut_50_0;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                } else {
                                  if ((param3 ^ -1) != -85) {
                                    L8: {
                                      if (!ni.field_m[82]) {
                                        break L8;
                                      } else {
                                        if (-66 == (param3 ^ -1)) {
                                          this.d((byte) 13);
                                          stackOut_48_0 = 1;
                                          stackIn_49_0 = stackOut_48_0;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!ni.field_m[82]) {
                                        break L9;
                                      } else {
                                        if (66 != param3) {
                                          break L9;
                                        } else {
                                          this.m(118);
                                          stackOut_41_0 = 1;
                                          stackIn_42_0 = stackOut_41_0;
                                          decompiledRegionSelector0 = 6;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (!ni.field_m[82]) {
                                      break L7;
                                    } else {
                                      if (param3 == 67) {
                                        this.e((byte) 82);
                                        stackOut_46_0 = 1;
                                        stackIn_47_0 = stackOut_46_0;
                                        decompiledRegionSelector0 = 7;
                                        break L0;
                                      } else {
                                        return false;
                                      }
                                    }
                                  } else {
                                    this.c(false);
                                    stackOut_34_0 = 1;
                                    stackIn_35_0 = stackOut_34_0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                }
                              }
                            } else {
                              if (this.field_Q >= this.field_s.length()) {
                                break L7;
                              } else {
                                L10: {
                                  stackOut_26_0 = this;
                                  stackOut_26_1 = -19166;
                                  stackIn_28_0 = stackOut_26_0;
                                  stackIn_28_1 = stackOut_26_1;
                                  stackIn_27_0 = stackOut_26_0;
                                  stackIn_27_1 = stackOut_26_1;
                                  if (!ni.field_m[82]) {
                                    stackOut_28_0 = this;
                                    stackOut_28_1 = stackIn_28_1;
                                    stackOut_28_2 = 1 + this.field_Q;
                                    stackIn_29_0 = stackOut_28_0;
                                    stackIn_29_1 = stackOut_28_1;
                                    stackIn_29_2 = stackOut_28_2;
                                    break L10;
                                  } else {
                                    stackOut_27_0 = this;
                                    stackOut_27_1 = stackIn_27_1;
                                    stackOut_27_2 = this.r(0);
                                    stackIn_29_0 = stackOut_27_0;
                                    stackIn_29_1 = stackOut_27_1;
                                    stackIn_29_2 = stackOut_27_2;
                                    break L10;
                                  }
                                }
                                this.a(stackIn_29_1, stackIn_29_2);
                                stackOut_29_0 = 1;
                                stackIn_30_0 = stackOut_29_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          } else {
                            if ((this.field_Q ^ -1) >= -1) {
                              break L7;
                            } else {
                              L11: {
                                stackOut_19_0 = this;
                                stackOut_19_1 = -19166;
                                stackIn_21_0 = stackOut_19_0;
                                stackIn_21_1 = stackOut_19_1;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                if (ni.field_m[82]) {
                                  stackOut_21_0 = this;
                                  stackOut_21_1 = stackIn_21_1;
                                  stackOut_21_2 = this.k(-1);
                                  stackIn_22_0 = stackOut_21_0;
                                  stackIn_22_1 = stackOut_21_1;
                                  stackIn_22_2 = stackOut_21_2;
                                  break L11;
                                } else {
                                  stackOut_20_0 = this;
                                  stackOut_20_1 = stackIn_20_1;
                                  stackOut_20_2 = -1 + this.field_Q;
                                  stackIn_22_0 = stackOut_20_0;
                                  stackIn_22_1 = stackOut_20_1;
                                  stackIn_22_2 = stackOut_20_2;
                                  break L11;
                                }
                              }
                              this.a(stackIn_22_1, stackIn_22_2);
                              stackOut_22_0 = 1;
                              stackIn_23_0 = stackOut_22_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                    } else {
                      if (this.field_N == this.field_Q) {
                        if (this.field_Q <= 0) {
                          break L7;
                        } else {
                          this.field_N = -1 + this.field_Q;
                          this.j(29388);
                          stackOut_13_0 = 1;
                          stackIn_14_0 = stackOut_13_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        this.j(29388);
                        stackOut_10_0 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  stackOut_73_0 = 0;
                  stackIn_74_0 = stackOut_73_0;
                  decompiledRegionSelector0 = 15;
                  break L0;
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
            stackOut_75_0 = (RuntimeException) (var5);
            stackOut_75_1 = new StringBuilder().append("lb.GA(").append(param0).append(',').append(param1).append(',');
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
          throw sl.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_35_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_42_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_47_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_49_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_51_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_53_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_55_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_59_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_61_0 != 0;
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

    public static void n(int param0) {
        if (param0 != -85) {
            lb.n(-22);
        }
        field_O = null;
    }

    private final void e(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var3 = -49 % ((-7 - param0) / 53);
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.j(29388);
                this.a(0, var2);
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

    private final void c(boolean param0) {
        if (!(!(this.field_l instanceof se))) {
            ((se) ((Object) this.field_l)).b(-28, (lb) (this));
        }
        if (param0) {
            this.field_N = -68;
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
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
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
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
            if (super.a(param0, param1, param2, param3, param4 + param4, param5, param6)) {
              if (this.field_y instanceof dl) {
                L1: {
                  var8_int = ((dl) ((Object) this.field_y)).a(param6, kf.field_b, 81, fg.field_a, param5, (al) (this));
                  stackOut_4_0 = this;
                  stackOut_4_1 = -19166;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (var8_int == -1) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    break L1;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = var8_int;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_7_1, stackIn_7_2);
                  var8_long = qg.a(false);
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if ((-this.field_R + var8_long ^ -1L) <= -251L) {
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
                  ((lb) (this)).field_K = stackIn_10_1 != 0;
                  if (!this.field_K) {
                    break L3;
                  } else {
                    L4: {
                      this.field_N = this.k(param4 + -1);
                      this.field_Q = this.r(0);
                      if (0 >= this.field_Q) {
                        break L4;
                      } else {
                        if (32 == this.field_s.charAt(-1 + this.field_Q)) {
                          this.field_Q = this.field_Q - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_L = this.field_Q;
                    break L3;
                  }
                }
                this.field_R = var8_long;
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
            stackOut_20_1 = new StringBuilder().append("lb.R(");
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
          throw sl.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        dl var8 = null;
        long var6 = 0L;
        if (param3 != 29221) {
            this.d((byte) 60);
        }
        if (this.field_y != null) {
            if (param0 == 0) {
                this.field_y.a(-24969, (al) (this), param2, this.field_B, param1);
                if (this.field_y instanceof dl) {
                    var8 = (dl) ((Object) this.field_y);
                    if (this.field_Q != this.field_N) {
                        var8.b(param1, param2, this.field_Q, -84, this.field_N, (al) (this));
                    }
                    var6 = qg.a(false);
                    if (500L > (var6 + -this.field_I) % 1000L) {
                        var8.a(this.field_Q, (al) (this), param3 ^ -29312, param2, param1);
                    }
                }
            }
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int dupTemp$3 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
              if (param1 != null) {
                break L1;
              } else {
                param1 = "";
                break L1;
              }
            }
            L2: {
              this.field_s = param1;
              var4_int = -28 % ((param2 - 12) / 39);
              var5 = param1.length();
              if ((this.field_J ^ -1) == 0) {
                break L2;
              } else {
                if (this.field_J >= var5) {
                  break L2;
                } else {
                  this.field_s = this.field_s.substring(0, this.field_J);
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$3 = this.field_s.length();
              this.field_N = dupTemp$3;
              this.field_Q = dupTemp$3;
              if (!param0) {
                this.b(true);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("lb.F(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        if (param0 != -19166) {
            return;
        }
        this.field_Q = param1;
        if (!(ni.field_m[81])) {
            this.field_N = this.field_Q;
        }
    }

    private final String p(int param0) {
        if (param0 > -82) {
            this.a(-5, 11);
        }
        int var2 = this.field_Q <= this.field_N ? this.field_Q : this.field_N;
        int var3 = this.field_N < this.field_Q ? this.field_Q : this.field_N;
        return this.field_s.substring(var2, var3);
    }

    private final void d(byte param0) {
        this.m(param0 + 110);
        if (param0 != 13) {
            return;
        }
        this.j(29388);
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        if (0 != this.field_Q) {
          var2 = param0 + this.field_Q;
          L0: while (true) {
            L1: {
              if (-1 <= (var2 ^ -1)) {
                break L1;
              } else {
                if (-33 == (this.field_s.charAt(-1 + var2) ^ -1)) {
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
          return this.field_Q;
        }
    }

    private final int r(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        var2 = this.field_s.length();
        if (this.field_Q != var2) {
          L0: {
            if (param0 == 0) {
              break L0;
            } else {
              lb.o(54);
              break L0;
            }
          }
          var3 = 1 + this.field_Q;
          L1: while (true) {
            L2: {
              if (var3 >= var2) {
                break L2;
              } else {
                if (32 == this.field_s.charAt(-1 + var3)) {
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
          return this.field_Q;
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
            if (param0 == 0) {
              L1: {
                if (this.field_J == -1) {
                  break L1;
                } else {
                  var3_int = this.field_J + -this.field_s.length();
                  if (0 <= var3_int) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    param1 = param1.substring(0, var3_int);
                    break L1;
                  }
                }
              }
              L2: {
                if (this.field_Q == this.field_s.length()) {
                  this.field_s = this.field_s + param1;
                  break L2;
                } else {
                  this.field_s = this.field_s.substring(0, this.field_Q) + param1 + this.field_s.substring(this.field_Q, this.field_s.length());
                  break L2;
                }
              }
              this.field_Q = this.field_Q + param1.length();
              this.field_N = this.field_Q;
              this.b(true);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("lb.K(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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

    private final void q(int param0) {
        int var2 = 0;
        dl var3 = null;
        rb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        if (this.field_P) {
          var2 = 124 / ((param0 - 28) / 54);
          if (this.field_y instanceof dl) {
            var3 = (dl) ((Object) this.field_y);
            var4 = var3.a((byte) 110, (al) (this));
            var5 = var4.c(-1);
            var6 = var3.a((al) (this), 121);
            var7 = var3.a((byte) 46) >> -95509567;
            if (-var7 + var6 > var5) {
              this.field_o = 0;
              this.field_A = 0;
              return;
            } else {
              L0: {
                var8 = this.field_o + var4.a((byte) 111, this.field_Q);
                if (var6 - var7 < var8) {
                  this.field_o = -var7 - -var6 - (var8 - this.field_o);
                  break L0;
                } else {
                  if (var7 > var8) {
                    this.field_o = var7 - var8 + this.field_o;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L1: {
                if ((this.field_o ^ -1) < -1) {
                  this.field_o = 0;
                  break L1;
                } else {
                  if (this.field_o >= -var6 - -var7) {
                    break L1;
                  } else {
                    this.field_o = var7 + -var6;
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
          this.field_o = 0;
          this.field_A = 0;
          return;
        }
    }

    private final void m(int param0) {
        String var2 = this.p(-95);
        if ((var2.length() ^ -1) < -1) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.p(-87))), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (param0 <= 115) {
            al var3 = (al) null;
            this.a(-33, -113, (byte) 101, (al) null);
        }
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_35_0 = null;
        String stackOut_30_0 = null;
        String stackOut_20_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var3_int = param0.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      var4 = r.a(param0, -11133);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if ((var4.length() ^ -1) <= -2) {
                          L3: {
                            if (sf.a(var4.charAt(0), -33)) {
                              break L3;
                            } else {
                              if (sf.a(var4.charAt(var4.length() - 1), -33)) {
                                break L3;
                              } else {
                                var5 = 0;
                                if (param2 == 1236) {
                                  var6 = 0;
                                  L4: while (true) {
                                    if (var6 >= param0.length()) {
                                      if (var5 > 0) {
                                        stackOut_35_0 = wd.field_J;
                                        stackIn_36_0 = stackOut_35_0;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param0.charAt(var6);
                                        if (!sf.a((char) var7, param2 ^ -1269)) {
                                          var5 = 0;
                                          break L5;
                                        } else {
                                          var5++;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (var5 < 2) {
                                          break L6;
                                        } else {
                                          if (!param1) {
                                            stackOut_30_0 = rb.field_d;
                                            stackIn_31_0 = stackOut_30_0;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  stackOut_20_0 = (String) null;
                                  stackIn_21_0 = stackOut_20_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                          }
                          stackOut_17_0 = wd.field_J;
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_12_0 = ei.field_j;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackOut_7_0 = ei.field_j;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = ei.field_j;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var3);
            stackOut_37_1 = new StringBuilder().append("lb.B(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L7;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L7;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_31_0;
                  } else {
                    return stackIn_36_0;
                  }
                }
              }
            }
          }
        }
    }

    void a(int param0, int param1, byte param2, al param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        dl var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.q(param2 ^ 92);
              if (-2 == (this.field_r ^ -1)) {
                L2: {
                  if (this.field_y instanceof dl) {
                    var7 = (dl) ((Object) this.field_y);
                    var6 = var7.a(param0, kf.field_b, 119, fg.field_a, param1, (al) (this));
                    if ((var6 ^ -1) != 0) {
                      L3: {
                        if (!this.field_K) {
                          break L3;
                        } else {
                          if (this.field_L <= var6) {
                            break L3;
                          } else {
                            if (this.field_N < var6) {
                              var6 = this.field_L;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_Q = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                this.field_I = qg.a(false);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("lb.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    void b(boolean param0) {
        if (!(!(this.field_l instanceof se))) {
            ((se) ((Object) this.field_l)).a(-12230, (lb) (this));
        }
        if (!param0) {
            this.a(69, -108, 109, -105);
        }
    }

    lb(String param0, tg param1, int param2) {
        super(param0, param1);
        this.field_L = -1;
        this.field_K = false;
        this.field_R = 0L;
        try {
            this.field_y = field_O.field_e;
            this.field_J = param2;
            this.a(true, param0, -74);
            this.field_P = true;
            this.field_I = qg.a(false);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void o(int param0) {
        String discarded$0 = null;
        mc.field_H = new vd();
        re.field_g.b(mc.field_H, -103);
        if (param0 > -78) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = lb.a((CharSequence) null, false, -68);
        }
    }

    final void l(int param0) {
        this.field_s = "";
        this.field_N = 0;
        this.field_Q = 0;
        this.b(true);
        if (param0 > -67) {
            this.field_J = -105;
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_N != this.field_Q) {
            var2 = this.field_Q <= this.field_N ? this.field_Q : this.field_N;
            var3 = this.field_Q <= this.field_N ? this.field_N : this.field_Q;
            this.field_Q = var2;
            this.field_N = var2;
            this.field_s = this.field_s.substring(0, var2) + this.field_s.substring(var3, this.field_s.length());
            this.b(true);
        }
        if (param0 != 29388) {
            this.q(93);
        }
    }

    static {
    }
}
