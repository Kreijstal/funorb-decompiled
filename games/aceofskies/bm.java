/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bm extends mi {
    static Object field_C;
    private int field_H;
    private int field_A;
    private long field_E;
    private boolean field_G;
    static ia field_x;
    private int field_B;
    private boolean field_y;
    private int field_D;
    private long field_F;
    static rk field_I;
    static int field_z;
    static int[] field_w;

    final boolean a(int param0, int param1, char param2, ea param3) {
        int dupTemp$1 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_54_0 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_72_0 = 0;
        int stackOut_61_0 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        int stackOut_59_0 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_53_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        try {
          L0: {
            L1: {
              var5_int = 127 / ((param0 - -53) / 33);
              this.field_F = kh.a(-97);
              if (60 == param2) {
                break L1;
              } else {
                if (param2 == 62) {
                  break L1;
                } else {
                  L2: {
                    if (param2 < 32) {
                      break L2;
                    } else {
                      if (param2 <= 126) {
                        L3: {
                          if (this.field_B == this.field_D) {
                            break L3;
                          } else {
                            this.a((byte) -127);
                            break L3;
                          }
                        }
                        L4: {
                          L5: {
                            if ((this.field_H ^ -1) == 0) {
                              break L5;
                            } else {
                              if (this.field_f.length() >= this.field_H) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (this.field_B >= this.field_f.length()) {
                              this.field_f = this.field_f + param2;
                              dupTemp$1 = this.field_f.length();
                              this.field_B = dupTemp$1;
                              this.field_D = dupTemp$1;
                              break L6;
                            } else {
                              this.field_f = this.field_f.substring(0, this.field_B) + param2 + this.field_f.substring(this.field_B, this.field_f.length());
                              this.field_B = this.field_B + 1;
                              this.field_D = this.field_B;
                              break L6;
                            }
                          }
                          this.g((byte) -75);
                          break L4;
                        }
                        stackOut_72_0 = 1;
                        stackIn_73_0 = stackOut_72_0;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L7: {
                    if (param1 != 85) {
                      if ((param1 ^ -1) != -102) {
                        if (-14 == (param1 ^ -1)) {
                          this.f((byte) -2);
                          stackOut_61_0 = 1;
                          stackIn_62_0 = stackOut_61_0;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        } else {
                          if (-97 == (param1 ^ -1)) {
                            if (-1 <= (this.field_B ^ -1)) {
                              break L7;
                            } else {
                              L8: {
                                stackOut_56_0 = this;
                                stackOut_56_1 = 120;
                                stackIn_58_0 = stackOut_56_0;
                                stackIn_58_1 = stackOut_56_1;
                                stackIn_57_0 = stackOut_56_0;
                                stackIn_57_1 = stackOut_56_1;
                                if (lp.field_a[82]) {
                                  stackOut_58_0 = this;
                                  stackOut_58_1 = stackIn_58_1;
                                  stackOut_58_2 = this.e((byte) 76);
                                  stackIn_59_0 = stackOut_58_0;
                                  stackIn_59_1 = stackOut_58_1;
                                  stackIn_59_2 = stackOut_58_2;
                                  break L8;
                                } else {
                                  stackOut_57_0 = this;
                                  stackOut_57_1 = stackIn_57_1;
                                  stackOut_57_2 = -1 + this.field_B;
                                  stackIn_59_0 = stackOut_57_0;
                                  stackIn_59_1 = stackOut_57_1;
                                  stackIn_59_2 = stackOut_57_2;
                                  break L8;
                                }
                              }
                              this.a((byte) stackIn_59_1, stackIn_59_2);
                              stackOut_59_0 = 1;
                              stackIn_60_0 = stackOut_59_0;
                              decompiledRegionSelector0 = 12;
                              break L0;
                            }
                          } else {
                            if (-98 == (param1 ^ -1)) {
                              if (this.field_B < this.field_f.length()) {
                                L9: {
                                  stackOut_50_0 = this;
                                  stackOut_50_1 = 53;
                                  stackIn_52_0 = stackOut_50_0;
                                  stackIn_52_1 = stackOut_50_1;
                                  stackIn_51_0 = stackOut_50_0;
                                  stackIn_51_1 = stackOut_50_1;
                                  if (!lp.field_a[82]) {
                                    stackOut_52_0 = this;
                                    stackOut_52_1 = stackIn_52_1;
                                    stackOut_52_2 = 1 + this.field_B;
                                    stackIn_53_0 = stackOut_52_0;
                                    stackIn_53_1 = stackOut_52_1;
                                    stackIn_53_2 = stackOut_52_2;
                                    break L9;
                                  } else {
                                    stackOut_51_0 = this;
                                    stackOut_51_1 = stackIn_51_1;
                                    stackOut_51_2 = this.k(0);
                                    stackIn_53_0 = stackOut_51_0;
                                    stackIn_53_1 = stackOut_51_1;
                                    stackIn_53_2 = stackOut_51_2;
                                    break L9;
                                  }
                                }
                                this.a((byte) stackIn_53_1, stackIn_53_2);
                                stackOut_53_0 = 1;
                                stackIn_54_0 = stackOut_53_0;
                                decompiledRegionSelector0 = 11;
                                break L0;
                              } else {
                                break L7;
                              }
                            } else {
                              if (102 != param1) {
                                if (-104 != (param1 ^ -1)) {
                                  if (-85 != (param1 ^ -1)) {
                                    L10: {
                                      if (!lp.field_a[82]) {
                                        break L10;
                                      } else {
                                        if ((param1 ^ -1) == -66) {
                                          this.b(true);
                                          stackOut_46_0 = 1;
                                          stackIn_47_0 = stackOut_46_0;
                                          decompiledRegionSelector0 = 10;
                                          break L0;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (!lp.field_a[82]) {
                                        break L11;
                                      } else {
                                        if (param1 != 66) {
                                          break L11;
                                        } else {
                                          this.i(-116);
                                          stackOut_40_0 = 1;
                                          stackIn_41_0 = stackOut_40_0;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (!lp.field_a[82]) {
                                      break L7;
                                    } else {
                                      if (67 != param1) {
                                        break L7;
                                      } else {
                                        this.l(-1);
                                        stackOut_44_0 = 1;
                                        stackIn_45_0 = stackOut_44_0;
                                        decompiledRegionSelector0 = 9;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    this.j(-1);
                                    stackOut_33_0 = 1;
                                    stackIn_34_0 = stackOut_33_0;
                                    decompiledRegionSelector0 = 7;
                                    break L0;
                                  }
                                } else {
                                  this.a((byte) 59, this.field_f.length());
                                  stackOut_30_0 = 1;
                                  stackIn_31_0 = stackOut_30_0;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                }
                              } else {
                                this.a((byte) 69, 0);
                                stackOut_27_0 = 1;
                                stackIn_28_0 = stackOut_27_0;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        if (this.field_D != this.field_B) {
                          this.a((byte) -87);
                          stackOut_21_0 = 1;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (this.field_B < this.field_f.length()) {
                            this.field_D = 1 + this.field_B;
                            this.a((byte) 43);
                            stackOut_19_0 = 1;
                            stackIn_20_0 = stackOut_19_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            return false;
                          }
                        }
                      }
                    } else {
                      if (this.field_D != this.field_B) {
                        this.a((byte) -118);
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if ((this.field_B ^ -1) >= -1) {
                          break L7;
                        } else {
                          this.field_D = this.field_B - 1;
                          this.a((byte) 14);
                          stackOut_11_0 = 1;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  stackOut_74_0 = 0;
                  stackIn_75_0 = stackOut_74_0;
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
            stackOut_76_0 = (RuntimeException) (var5);
            stackOut_76_1 = new StringBuilder().append("bm.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param3 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L12;
            } else {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L12;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_28_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_31_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_34_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_41_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_45_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_47_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_54_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_60_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_62_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_73_0 != 0;
                                    } else {
                                      return stackIn_75_0 != 0;
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

    private final void l(int param0) {
        try {
            Exception exception = null;
            String var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.a((byte) -81);
                this.a(var2, (byte) 126);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
            if (param0 != -1) {
              field_I = (rk) null;
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

    final static java.applet.Applet m(int param0) {
        rh discarded$4 = null;
        if (param0 < 106) {
            al var2 = (al) null;
            discarded$4 = bm.a((byte) -67, (al) null);
            if (!(hu.field_a == null)) {
                return hu.field_a;
            }
            return (java.applet.Applet) ((Object) gh.field_f);
        }
        if (!(hu.field_a == null)) {
            return hu.field_a;
        }
        return (java.applet.Applet) ((Object) gh.field_f);
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (this.field_B != 0) {
          var3 = 85 % ((param0 - 13) / 39);
          var2 = -1 + this.field_B;
          L0: while (true) {
            if (var2 > 0) {
              if (-33 != (this.field_f.charAt(-1 + var2) ^ -1)) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        } else {
          return this.field_B;
        }
    }

    final void a(int param0, String param1, boolean param2) {
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
              if (param1 == null) {
                param1 = "";
                break L1;
              } else {
                break L1;
              }
            }
            this.field_f = param1;
            if (param0 == -20975) {
              L2: {
                var4_int = param1.length();
                if (this.field_H == -1) {
                  break L2;
                } else {
                  if (this.field_H < var4_int) {
                    this.field_f = this.field_f.substring(0, this.field_H);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              dupTemp$2 = this.field_f.length();
              this.field_D = dupTemp$2;
              this.field_B = dupTemp$2;
              if (param2) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.g((byte) -75);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("bm.RA(").append(param0).append(',');
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
          throw pn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static rh a(byte param0, al param1) {
        RuntimeException var2 = null;
        rh stackIn_2_0 = null;
        rh stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_3_0 = null;
        rh stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -70) {
              stackOut_3_0 = am.a(param1, false);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (rh) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("bm.UA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int discarded$12 = 0;
        int discarded$13 = 0;
        long var6 = 0L;
        et var8 = null;
        if (null != this.field_e) {
          if (param1 == 0) {
            this.field_e.a(this.field_u, -7592, param3, (ea) (this), param2);
            if (this.field_e instanceof et) {
              var8 = (et) ((Object) this.field_e);
              if (this.field_D == this.field_B) {
                var6 = kh.a(-62);
                if ((-this.field_F + var6) % 1000L < 500L) {
                  var8.a((byte) 71, param3, param2, this.field_B, (ea) (this));
                  if (param0 <= 64) {
                    discarded$7 = this.k(125);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param0 <= 64) {
                    discarded$8 = this.k(125);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var8.a(this.field_D, this.field_B, param2, param3, (ea) (this), (byte) -123);
                var6 = kh.a(-62);
                if ((-this.field_F + var6) % 1000L >= 500L) {
                  if (param0 <= 64) {
                    discarded$9 = this.k(125);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var8.a((byte) 71, param3, param2, this.field_B, (ea) (this));
                  if (param0 <= 64) {
                    discarded$10 = this.k(125);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param0 <= 64) {
                discarded$11 = this.k(125);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 > 64) {
              return;
            } else {
              discarded$12 = this.k(125);
              return;
            }
          }
        } else {
          if (param0 <= 64) {
            discarded$13 = this.k(125);
            return;
          } else {
            return;
          }
        }
    }

    void g(byte param0) {
        L0: {
          if (this.field_o instanceof dr) {
            ((dr) ((Object) this.field_o)).a((bm) (this), -6525);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -75) {
          field_I = (rk) null;
          return;
        } else {
          return;
        }
    }

    bm(String param0, no param1, int param2) {
        super(param0, param1);
        this.field_E = 0L;
        this.field_A = -1;
        this.field_G = false;
        try {
            this.field_H = param2;
            this.field_e = ag.field_n.field_n;
            this.a(-20975, param0, true);
            this.field_y = true;
            this.field_F = kh.a(-88);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0) {
        boolean discarded$2 = false;
        ea var3 = null;
        this.i(-120);
        if (!param0) {
          var3 = (ea) null;
          discarded$2 = this.a(9, 25, 35, 10, 41, (ea) null, -23);
          this.a((byte) -85);
          return;
        } else {
          this.a((byte) -85);
          return;
        }
    }

    private final void a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = -51 / ((-40 - param0) / 32);
        if (this.field_B != this.field_D) {
            var3 = this.field_B <= this.field_D ? this.field_B : this.field_D;
            var4 = this.field_B > this.field_D ? this.field_B : this.field_D;
            this.field_D = var3;
            this.field_B = var3;
            this.field_f = this.field_f.substring(0, var3) + this.field_f.substring(var4, this.field_f.length());
            this.g((byte) -75);
        }
    }

    private final void h(int param0) {
        pp var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        et var9 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        if (!this.field_y) {
          this.field_j = 0;
          this.field_l = 0;
          return;
        } else {
          if (!(this.field_e instanceof et)) {
            return;
          } else {
            var9 = (et) ((Object) this.field_e);
            var3 = var9.a((byte) 96, (ea) (this));
            var4 = var3.a((byte) 24);
            var5 = var9.b((ea) (this), -64);
            var6 = var9.a(-4) >> -1911304799;
            if (var4 < -var6 + var5) {
              this.field_l = 0;
              this.field_j = 0;
              return;
            } else {
              var7 = this.field_j + var3.b(this.field_B, -127);
              if (var5 - var6 < var7) {
                this.field_j = -var7 + -var6 + (var5 + this.field_j);
                if (param0 >= this.field_j) {
                  if (-var5 - -var6 <= this.field_j) {
                    return;
                  } else {
                    this.field_j = -var5 + var6;
                    return;
                  }
                } else {
                  this.field_j = 0;
                  return;
                }
              } else {
                if (var6 <= var7) {
                  if (param0 >= this.field_j) {
                    if (-var5 - -var6 <= this.field_j) {
                      return;
                    } else {
                      this.field_j = -var5 + var6;
                      return;
                    }
                  } else {
                    this.field_j = 0;
                    return;
                  }
                } else {
                  this.field_j = this.field_j - -var6 - var7;
                  if (param0 >= this.field_j) {
                    if (-var5 - -var6 <= this.field_j) {
                      return;
                    } else {
                      this.field_j = -var5 + var6;
                      return;
                    }
                  } else {
                    this.field_j = 0;
                    return;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        this.field_B = param1;
        if (param0 <= 30) {
          L0: {
            this.field_F = 35L;
            if (!lp.field_a[81]) {
              this.field_D = this.field_B;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (!lp.field_a[81]) {
              this.field_D = this.field_B;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    void a(byte param0, ea param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var6 = 0;
        et var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              super.a((byte) 126, param1, param2, param3);
              if (param0 > 13) {
                break L1;
              } else {
                this.field_B = -1;
                break L1;
              }
            }
            L2: {
              this.h(0);
              if (this.field_i != 1) {
                break L2;
              } else {
                L3: {
                  if (this.field_e instanceof et) {
                    var7 = (et) ((Object) this.field_e);
                    var6 = var7.a((ea) (this), param3, param2, cf.field_g, 3, ic.field_b);
                    if (-1 != var6) {
                      L4: {
                        if (!this.field_G) {
                          break L4;
                        } else {
                          if (var6 >= this.field_A) {
                            break L4;
                          } else {
                            if (var6 > this.field_D) {
                              var6 = this.field_A;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      this.field_B = var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                this.field_F = kh.a(-60);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("bm.S(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void d(byte param0) {
        rh discarded$2 = null;
        al var2 = null;
        if (param0 >= -33) {
          var2 = (al) null;
          discarded$2 = bm.a((byte) -72, (al) null);
          field_x = null;
          field_I = null;
          field_C = null;
          field_w = null;
          return;
        } else {
          field_x = null;
          field_I = null;
          field_C = null;
          field_w = null;
          return;
        }
    }

    private final void j(int param0) {
        if (param0 != -1) {
          L0: {
            this.field_A = 14;
            if (this.field_o instanceof dr) {
              ((dr) ((Object) this.field_o)).b((bm) (this), -40);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_o instanceof dr) {
              ((dr) ((Object) this.field_o)).b((bm) (this), -40);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var2 = this.field_f.length();
        if (param0 == 0) {
          if (var2 != this.field_B) {
            var3 = 1 + this.field_B;
            L0: while (true) {
              if (var2 > var3) {
                if (this.field_f.charAt(-1 + var3) != 32) {
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
            return this.field_B;
          }
        } else {
          return -109;
        }
    }

    final void f(byte param0) {
        this.field_f = "";
        this.field_B = 0;
        this.field_D = 0;
        this.g((byte) -75);
        if (param0 != -2) {
            this.field_y = false;
        }
    }

    private final void i(int param0) {
        try {
            String var2 = null;
            if (param0 <= -98) {
              var2 = this.h((byte) 97);
              if (-1 > (var2.length() ^ -1)) {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h((byte) 109))), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              } else {
                return;
              }
            } else {
              this.field_D = -50;
              var2 = this.h((byte) 97);
              if (-1 <= (var2.length() ^ -1)) {
                return;
              } else {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h((byte) 109))), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        if ((this.field_H ^ -1) != 0) {
            var3_int = this.field_H + -this.field_f.length();
            if (!(-1 < (var3_int ^ -1))) {
                return;
            }
            param0 = param0.substring(0, var3_int);
        }
        if (this.field_B == this.field_f.length()) {
            this.field_f = this.field_f + param0;
        } else {
            this.field_f = this.field_f.substring(0, this.field_B) + param0 + this.field_f.substring(this.field_B, this.field_f.length());
        }
        if (param1 <= 120) {
            return;
        }
        try {
            this.field_B = this.field_B + param0.length();
            this.field_D = this.field_B;
            this.g((byte) -75);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "bm.VA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final String h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (this.field_D >= this.field_B) {
            stackOut_2_0 = this.field_B;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_D;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0 <= 80) {
          L1: {
            this.a((byte) 107, -41, -122, -11);
            if (this.field_D >= this.field_B) {
              stackOut_10_0 = this.field_D;
              stackIn_11_0 = stackOut_10_0;
              break L1;
            } else {
              stackOut_9_0 = this.field_B;
              stackIn_11_0 = stackOut_9_0;
              break L1;
            }
          }
          var3 = stackIn_11_0;
          return this.field_f.substring(var2, var3);
        } else {
          L2: {
            if (this.field_D >= this.field_B) {
              stackOut_6_0 = this.field_D;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            } else {
              stackOut_5_0 = this.field_B;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
          }
          var3 = stackIn_7_0;
          return this.field_f.substring(var2, var3);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
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
            if (super.a((int) (char)param0, param1, param2, param3, param4, param5, param6)) {
              if (this.field_e instanceof et) {
                L1: {
                  var8_int = ((et) ((Object) this.field_e)).a((ea) (this), param1, param4, cf.field_g, param0 + -31, ic.field_b);
                  stackOut_4_0 = this;
                  stackOut_4_1 = 82;
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
                  this.a((byte) stackIn_7_1, stackIn_7_2);
                  var8_long = kh.a(param0 + -125);
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if ((var8_long + -this.field_E ^ -1L) <= -251L) {
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
                  ((bm) (this)).field_G = stackIn_10_1 != 0;
                  if (!this.field_G) {
                    break L3;
                  } else {
                    L4: {
                      this.field_D = this.e((byte) 97);
                      this.field_B = this.k(0);
                      if ((this.field_B ^ -1) >= -1) {
                        break L4;
                      } else {
                        if (this.field_f.charAt(this.field_B + -1) != 32) {
                          break L4;
                        } else {
                          this.field_B = this.field_B - 1;
                          break L4;
                        }
                      }
                    }
                    this.field_A = this.field_B;
                    break L3;
                  }
                }
                this.field_E = var8_long;
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
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
            stackOut_19_0 = (RuntimeException) (var8);
            stackOut_19_1 = new StringBuilder().append("bm.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    static {
        field_x = new ia();
        field_w = new int[4];
    }
}
