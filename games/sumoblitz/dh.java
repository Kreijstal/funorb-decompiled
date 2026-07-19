/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dh extends wp {
    private long field_L;
    private int field_I;
    static float[] field_N;
    private boolean field_G;
    private int field_E;
    private long field_J;
    private int field_F;
    static float[] field_M;
    private int field_K;
    private boolean field_O;
    static int[] field_H;

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -42) {
                break L1;
              } else {
                this.field_G = true;
                break L1;
              }
            }
            if (super.a(param0, -128, param2, param3, param4, param5, param6)) {
              if (!(this.field_w instanceof de)) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var8_int = ((de) ((Object) this.field_w)).a(param4, (pk) (this), ko.field_p, pi.field_e, -4059, param6);
                  stackOut_5_0 = this;
                  stackOut_5_1 = 124;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (-1 != var8_int) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = var8_int;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    break L2;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 0;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    break L2;
                  }
                }
                L3: {
                  this.a(stackIn_8_1, stackIn_8_2);
                  var8_long = wq.a(-17);
                  stackOut_8_0 = this;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (250L <= var8_long - this.field_L) {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L3;
                  } else {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L3;
                  }
                }
                L4: {
                  ((dh) (this)).field_G = stackIn_11_1 != 0;
                  if (!this.field_G) {
                    break L4;
                  } else {
                    L5: {
                      this.field_E = this.g(14236);
                      this.field_F = this.d(true);
                      if ((this.field_F ^ -1) >= -1) {
                        break L5;
                      } else {
                        if (this.field_m.charAt(this.field_F + -1) == 32) {
                          this.field_F = this.field_F - 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    this.field_K = this.field_F;
                    break L4;
                  }
                }
                this.field_L = var8_long;
                stackOut_17_0 = 1;
                stackIn_18_0 = stackOut_17_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var8);
            stackOut_21_1 = new StringBuilder().append("dh.R(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0 != 0;
        } else {
          return stackIn_20_0 != 0;
        }
    }

    private final void a(int param0, int param1) {
        if (param0 < 84) {
            this.field_I = 55;
        }
        this.field_F = param1;
        if (!(hw.field_b[81])) {
            this.field_E = this.field_F;
        }
    }

    final static int b(int param0, int param1, boolean param2) {
        if (param2) {
            field_N = (float[]) null;
        }
        int var3 = param0 >>> -322954945;
        return (var3 + param0) / param1 + -var3;
    }

    public static void j(int param0) {
        field_H = null;
        field_M = null;
        field_N = null;
        if (param0 != 82) {
            field_N = (float[]) null;
        }
    }

    private final String k(int param0) {
        if (param0 > -99) {
            this.field_G = true;
        }
        int var2 = this.field_E < this.field_F ? this.field_E : this.field_F;
        int var3 = this.field_F > this.field_E ? this.field_F : this.field_E;
        return this.field_m.substring(var2, var3);
    }

    private final void h(int param0) {
        try {
            String var2 = null;
            try {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.h((byte) -80);
                this.a(true, var2);
            } catch (Exception exception) {
            }
            if (param0 != -1) {
                this.field_O = true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
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
              if (param0) {
                break L1;
              } else {
                this.field_L = -107L;
                break L1;
              }
            }
            L2: {
              if (0 != (this.field_I ^ -1)) {
                var3_int = this.field_I + -this.field_m.length();
                if (var3_int >= 0) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param1 = param1.substring(0, var3_int);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                if (this.field_F == this.field_m.length()) {
                  break L4;
                } else {
                  this.field_m = this.field_m.substring(0, this.field_F) + param1 + this.field_m.substring(this.field_F, this.field_m.length());
                  if (!Sumoblitz.field_L) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_m = this.field_m + param1;
              break L3;
            }
            this.field_F = this.field_F + param1.length();
            this.field_E = this.field_F;
            this.g((byte) 88);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("dh.V(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_F != 0) {
          if (param0 == 14236) {
            var2 = -1 + this.field_F;
            L0: while (true) {
              L1: {
                L2: {
                  if (var2 <= 0) {
                    break L2;
                  } else {
                    stackOut_6_0 = this.field_m.charAt(var2 - 1) ^ -1;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var3 != 0) {
                      break L1;
                    } else {
                      if (stackIn_7_0 == -33) {
                        break L2;
                      } else {
                        var2--;
                        if (var3 == 0) {
                          continue L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_10_0 = var2;
                stackIn_11_0 = stackOut_10_0;
                break L1;
              }
              return stackIn_11_0;
            }
          } else {
            return 31;
          }
        } else {
          return this.field_F;
        }
    }

    dh(String param0, qm param1, int param2) {
        super(param0, param1);
        this.field_L = 0L;
        this.field_G = false;
        this.field_K = -1;
        try {
            this.field_I = param2;
            this.field_w = ks.field_x.field_j;
            this.a(true, param0, (byte) 118);
            this.field_O = true;
            this.field_J = wq.a(-9);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, String param1, byte param2) {
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
              if (param1 != null) {
                break L1;
              } else {
                param1 = "";
                break L1;
              }
            }
            L2: {
              this.field_m = param1;
              var4_int = param1.length();
              if ((this.field_I ^ -1) == 0) {
                break L2;
              } else {
                if (var4_int > this.field_I) {
                  this.field_m = this.field_m.substring(0, this.field_I);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$2 = this.field_m.length();
              this.field_E = dupTemp$2;
              this.field_F = dupTemp$2;
              if (!param0) {
                this.g((byte) 103);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2 >= 3) {
                break L4;
              } else {
                field_N = (float[]) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("dh.O(").append(param0).append(',');
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
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int dupTemp$1 = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_59_0 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_57_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_27_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        try {
          L0: {
            this.field_J = wq.a(-6);
            if (param1 == 60) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (62 != param1) {
                if (param2 > 9) {
                  L1: {
                    if (32 > param1) {
                      break L1;
                    } else {
                      if (126 >= param1) {
                        L2: {
                          if (this.field_F == this.field_E) {
                            break L2;
                          } else {
                            this.h((byte) -71);
                            break L2;
                          }
                        }
                        L3: {
                          L4: {
                            if (-1 == this.field_I) {
                              break L4;
                            } else {
                              if (this.field_m.length() < this.field_I) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                          L5: {
                            L6: {
                              if (this.field_F >= this.field_m.length()) {
                                break L6;
                              } else {
                                this.field_m = this.field_m.substring(0, this.field_F) + param1 + this.field_m.substring(this.field_F, this.field_m.length());
                                this.field_F = this.field_F + 1;
                                this.field_E = this.field_F;
                                if (!Sumoblitz.field_L) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            this.field_m = this.field_m + param1;
                            dupTemp$1 = this.field_m.length();
                            this.field_F = dupTemp$1;
                            this.field_E = dupTemp$1;
                            break L5;
                          }
                          this.g((byte) 124);
                          break L3;
                        }
                        stackOut_77_0 = 1;
                        stackIn_78_0 = stackOut_77_0;
                        decompiledRegionSelector0 = 15;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L7: {
                    if ((param3 ^ -1) == -86) {
                      if (this.field_F == this.field_E) {
                        if (0 >= this.field_F) {
                          break L7;
                        } else {
                          this.field_E = -1 + this.field_F;
                          this.h((byte) 127);
                          stackOut_65_0 = 1;
                          stackIn_66_0 = stackOut_65_0;
                          decompiledRegionSelector0 = 14;
                          break L0;
                        }
                      } else {
                        this.h((byte) 122);
                        stackOut_62_0 = 1;
                        stackIn_63_0 = stackOut_62_0;
                        decompiledRegionSelector0 = 13;
                        break L0;
                      }
                    } else {
                      if (101 != param3) {
                        if (param3 == 13) {
                          this.i(-1);
                          stackOut_59_0 = 1;
                          stackIn_60_0 = stackOut_59_0;
                          decompiledRegionSelector0 = 12;
                          break L0;
                        } else {
                          if (96 == param3) {
                            if (this.field_F > 0) {
                              L8: {
                                stackOut_54_0 = this;
                                stackOut_54_1 = 127;
                                stackIn_56_0 = stackOut_54_0;
                                stackIn_56_1 = stackOut_54_1;
                                stackIn_55_0 = stackOut_54_0;
                                stackIn_55_1 = stackOut_54_1;
                                if (hw.field_b[82]) {
                                  stackOut_56_0 = this;
                                  stackOut_56_1 = stackIn_56_1;
                                  stackOut_56_2 = this.g(14236);
                                  stackIn_57_0 = stackOut_56_0;
                                  stackIn_57_1 = stackOut_56_1;
                                  stackIn_57_2 = stackOut_56_2;
                                  break L8;
                                } else {
                                  stackOut_55_0 = this;
                                  stackOut_55_1 = stackIn_55_1;
                                  stackOut_55_2 = -1 + this.field_F;
                                  stackIn_57_0 = stackOut_55_0;
                                  stackIn_57_1 = stackOut_55_1;
                                  stackIn_57_2 = stackOut_55_2;
                                  break L8;
                                }
                              }
                              this.a(stackIn_57_1, stackIn_57_2);
                              stackOut_57_0 = 1;
                              stackIn_58_0 = stackOut_57_0;
                              decompiledRegionSelector0 = 11;
                              break L0;
                            } else {
                              break L7;
                            }
                          } else {
                            if (param3 != 97) {
                              if (-103 == (param3 ^ -1)) {
                                this.a(93, 0);
                                stackOut_50_0 = 1;
                                stackIn_51_0 = stackOut_50_0;
                                decompiledRegionSelector0 = 10;
                                break L0;
                              } else {
                                if (param3 == 103) {
                                  this.a(121, this.field_m.length());
                                  stackOut_48_0 = 1;
                                  stackIn_49_0 = stackOut_48_0;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                } else {
                                  if (-85 == (param3 ^ -1)) {
                                    this.e((byte) -106);
                                    stackOut_46_0 = 1;
                                    stackIn_47_0 = stackOut_46_0;
                                    decompiledRegionSelector0 = 8;
                                    break L0;
                                  } else {
                                    L9: {
                                      if (!hw.field_b[82]) {
                                        break L9;
                                      } else {
                                        if (param3 != 65) {
                                          break L9;
                                        } else {
                                          this.f(96);
                                          stackOut_34_0 = 1;
                                          stackIn_35_0 = stackOut_34_0;
                                          decompiledRegionSelector0 = 5;
                                          break L0;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (!hw.field_b[82]) {
                                        break L10;
                                      } else {
                                        if (-67 == (param3 ^ -1)) {
                                          this.e(false);
                                          stackOut_44_0 = 1;
                                          stackIn_45_0 = stackOut_44_0;
                                          decompiledRegionSelector0 = 7;
                                          break L0;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    if (!hw.field_b[82]) {
                                      break L7;
                                    } else {
                                      if ((param3 ^ -1) == -68) {
                                        this.h(-1);
                                        stackOut_42_0 = 1;
                                        stackIn_43_0 = stackOut_42_0;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (this.field_F >= this.field_m.length()) {
                                break L7;
                              } else {
                                L11: {
                                  stackOut_24_0 = this;
                                  stackOut_24_1 = 111;
                                  stackIn_26_0 = stackOut_24_0;
                                  stackIn_26_1 = stackOut_24_1;
                                  stackIn_25_0 = stackOut_24_0;
                                  stackIn_25_1 = stackOut_24_1;
                                  if (!hw.field_b[82]) {
                                    stackOut_26_0 = this;
                                    stackOut_26_1 = stackIn_26_1;
                                    stackOut_26_2 = this.field_F - -1;
                                    stackIn_27_0 = stackOut_26_0;
                                    stackIn_27_1 = stackOut_26_1;
                                    stackIn_27_2 = stackOut_26_2;
                                    break L11;
                                  } else {
                                    stackOut_25_0 = this;
                                    stackOut_25_1 = stackIn_25_1;
                                    stackOut_25_2 = this.d(true);
                                    stackIn_27_0 = stackOut_25_0;
                                    stackIn_27_1 = stackOut_25_1;
                                    stackIn_27_2 = stackOut_25_2;
                                    break L11;
                                  }
                                }
                                this.a(stackIn_27_1, stackIn_27_2);
                                stackOut_27_0 = 1;
                                stackIn_28_0 = stackOut_27_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        if (this.field_F != this.field_E) {
                          this.h((byte) 123);
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          if (this.field_F < this.field_m.length()) {
                            this.field_E = this.field_F - -1;
                            this.h((byte) -69);
                            stackOut_16_0 = 1;
                            stackIn_17_0 = stackOut_16_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  stackOut_79_0 = 0;
                  stackIn_80_0 = stackOut_79_0;
                  decompiledRegionSelector0 = 16;
                  break L0;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_81_0 = (RuntimeException) (var5);
            stackOut_81_1 = new StringBuilder().append("dh.KA(");
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param0 == null) {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L12;
            } else {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L12;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_84_0), stackIn_84_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_35_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_43_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_45_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_47_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_49_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_51_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_58_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_60_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_63_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_66_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_78_0 != 0;
                                      } else {
                                        return stackIn_80_0 != 0;
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

    private final void h(byte param0) {
        int var3 = 0;
        int var2 = 0;
        if (this.field_F != this.field_E) {
            var2 = this.field_E >= this.field_F ? this.field_F : this.field_E;
            var3 = this.field_E < this.field_F ? this.field_F : this.field_E;
            this.field_F = var2;
            this.field_E = var2;
            this.field_m = this.field_m.substring(0, var2) + this.field_m.substring(var3, this.field_m.length());
            this.g((byte) 81);
        }
        var2 = -67 / ((85 - param0) / 37);
    }

    private final void e(byte param0) {
        if (!(!(this.field_o instanceof pw))) {
            ((pw) ((Object) this.field_o)).a((dh) (this), -66);
        }
        if (param0 != -106) {
            this.g((byte) -55);
        }
    }

    private final void f(int param0) {
        if (param0 != 96) {
            return;
        }
        this.e(false);
        this.h((byte) 123);
    }

    private final void f(byte param0) {
        ag var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        de var9 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (!this.field_O) {
          this.field_s = 0;
          this.field_n = 0;
          return;
        } else {
          if (this.field_w instanceof de) {
            L0: {
              var9 = (de) ((Object) this.field_w);
              var3 = var9.b(-3, (pk) (this));
              var4 = var3.a((byte) -15);
              if (param0 == -44) {
                break L0;
              } else {
                field_H = (int[]) null;
                break L0;
              }
            }
            var5 = var9.a(param0 ^ -120, (pk) (this));
            var6 = var9.a(14763) >> 1411058977;
            if (-var6 + var5 <= var4) {
              L1: {
                L2: {
                  var7 = this.field_s + var3.a((byte) 113, this.field_F);
                  if (-var6 + var5 >= var7) {
                    break L2;
                  } else {
                    this.field_s = -var7 - (-var5 + (var6 - this.field_s));
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var6 <= var7) {
                  break L1;
                } else {
                  this.field_s = -var7 - -var6 + this.field_s;
                  break L1;
                }
              }
              L3: {
                L4: {
                  if (this.field_s <= 0) {
                    break L4;
                  } else {
                    this.field_s = 0;
                    if (var8 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var6 + -var5 <= this.field_s) {
                  break L3;
                } else {
                  this.field_s = -var5 - -var6;
                  break L3;
                }
              }
              return;
            } else {
              this.field_n = 0;
              this.field_s = 0;
              return;
            }
          } else {
            return;
          }
        }
    }

    final void i(int param0) {
        this.field_F = 0;
        this.field_E = 0;
        this.field_m = "";
        this.g((byte) 104);
        if (param0 != -1) {
            this.field_O = true;
        }
    }

    private final void e(boolean param0) {
        String var2 = this.k(-115);
        if (!((var2.length() ^ -1) >= -1)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.k(-116))), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (param0) {
            this.f((byte) -38);
        }
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        de var6 = null;
        int var7 = 0;
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
              super.a(param0, 62, param2, param3);
              var5_int = 109 % ((-25 - param1) / 45);
              this.f((byte) -44);
              if (this.field_l == 1) {
                L2: {
                  if (this.field_w instanceof de) {
                    var6 = (de) ((Object) this.field_w);
                    var7 = var6.a(param0, (pk) (this), ko.field_p, pi.field_e, -4059, param3);
                    if (var7 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!this.field_G) {
                          break L3;
                        } else {
                          if (this.field_K <= var7) {
                            break L3;
                          } else {
                            if (this.field_E >= var7) {
                              break L3;
                            } else {
                              var7 = this.field_K;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_F = var7;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                this.field_J = wq.a(-93);
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
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("dh.U(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        de var8 = null;
        long var6 = 0L;
        int discarded$0 = 0;
        if (null != this.field_w) {
            if (!(-1 != (param3 ^ -1))) {
                this.field_w.a((pk) (this), param1, 5592405, this.field_x, param0);
                if (this.field_w instanceof de) {
                    var8 = (de) ((Object) this.field_w);
                    if (this.field_F != this.field_E) {
                        var8.a(param0, this.field_E, 0, this.field_F, (pk) (this), param1);
                    }
                    var6 = wq.a(-6);
                    if (500L > (-this.field_J + var6) % 1000L) {
                        var8.a(1, param0, param1, this.field_F, (pk) (this));
                    }
                }
            }
        }
        if (param2 >= -35) {
            discarded$0 = this.d(false);
        }
    }

    private final int d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            this.f((byte) -32);
            break L0;
          }
        }
        var2 = this.field_m.length();
        if (this.field_F != var2) {
          var3 = this.field_F + 1;
          L1: while (true) {
            L2: {
              L3: {
                if (var2 <= var3) {
                  break L3;
                } else {
                  stackOut_6_0 = 32;
                  stackIn_11_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    if (stackIn_7_0 == this.field_m.charAt(var3 + -1)) {
                      break L3;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
              stackOut_10_0 = var3;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            }
            return stackIn_11_0;
          }
        } else {
          return this.field_F;
        }
    }

    void g(byte param0) {
        if (this.field_o instanceof pw) {
            ((pw) ((Object) this.field_o)).a((dh) (this), (byte) -128);
        }
        if (param0 <= 78) {
            dh.j(5);
        }
    }

    static {
        int var2 = 0;
        field_N = new float[16384];
        field_M = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; (var2 ^ -1) > -16385; var2++) {
            field_N[var2] = (float)Math.sin(var0 * (double)var2);
            field_M[var2] = (float)Math.cos((double)var2 * var0);
        }
        field_H = new int[2];
    }
}
