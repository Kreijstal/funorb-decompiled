/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ui extends hc {
    private int field_M;
    static String[] field_N;
    private int field_O;
    private int field_J;
    private int field_I;
    private boolean field_Q;
    private long field_K;
    private long field_P;
    static int field_L;
    private boolean field_R;

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 <= 56) {
            return;
        }
        if (!(((ui) this).field_J == ((ui) this).field_O)) {
            var2 = ((ui) this).field_J <= ((ui) this).field_O ? ((ui) this).field_J : ((ui) this).field_O;
            var3 = ((ui) this).field_O >= ((ui) this).field_J ? ((ui) this).field_O : ((ui) this).field_J;
            ((ui) this).field_O = var2;
            ((ui) this).field_J = var2;
            ((ui) this).field_s = ((ui) this).field_s.substring(0, var2) + ((ui) this).field_s.substring(var3, ((ui) this).field_s.length());
            ((ui) this).r(125);
        }
    }

    private final void a() {
        int var8 = MinerDisturbance.field_ab;
        if (!(((ui) this).field_Q)) {
            ((ui) this).field_o = 0;
            ((ui) this).field_p = 0;
            return;
        }
        if (!(((ui) this).field_A instanceof cf)) {
            return;
        }
        cf var9 = (cf) (Object) ((ui) this).field_A;
        nf var3 = var9.c(0, (fe) this);
        int var4 = var3.a(-1);
        int var5 = var9.a((fe) this, false);
        int var6 = var9.a(123) >> 1;
        if (var4 < -var6 + var5) {
            ((ui) this).field_p = 0;
            ((ui) this).field_o = 0;
            return;
        }
        int var7 = ((ui) this).field_p + var3.a(((ui) this).field_J, (byte) -124);
        if (-var6 + var5 < var7) {
            ((ui) this).field_p = ((ui) this).field_p + -var7 + (-var6 + var5);
        } else {
            if (!(var7 >= var6)) {
                ((ui) this).field_p = ((ui) this).field_p - -var6 + -var7;
            }
        }
        if (((ui) this).field_p > 0) {
            ((ui) this).field_p = 0;
        } else {
            if (!(-var5 - -var6 <= ((ui) this).field_p)) {
                ((ui) this).field_p = var6 + -var5;
            }
        }
    }

    ui(String param0, rm param1, int param2) {
        super(param0, param1);
        ((ui) this).field_I = -1;
        ((ui) this).field_P = 0L;
        ((ui) this).field_R = false;
        try {
            ((ui) this).field_M = param2;
            ((ui) this).field_A = bd.field_c.field_a;
            ((ui) this).a(true, false, param0);
            ((ui) this).field_Q = true;
            ((ui) this).field_K = sf.a((byte) 109);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ui.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(String param0) {
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
              if (0 == ((ui) this).field_M) {
                break L1;
              } else {
                var3_int = ((ui) this).field_M + -((ui) this).field_s.length();
                if (-1 <= var3_int) {
                  return;
                } else {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                }
              }
            }
            L2: {
              if (((ui) this).field_J != ((ui) this).field_s.length()) {
                ((ui) this).field_s = ((ui) this).field_s.substring(0, ((ui) this).field_J) + param0 + ((ui) this).field_s.substring(((ui) this).field_J, ((ui) this).field_s.length());
                break L2;
              } else {
                ((ui) this).field_s = ((ui) this).field_s + param0;
                break L2;
              }
            }
            ((ui) this).field_J = ((ui) this).field_J + param0.length();
            ((ui) this).field_O = ((ui) this).field_J;
            ((ui) this).r(124);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ui.C(");
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
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + false + ')');
        }
    }

    private final String p() {
        int var2 = ((ui) this).field_J > ((ui) this).field_O ? ((ui) this).field_O : ((ui) this).field_J;
        int var3 = ((ui) this).field_O >= ((ui) this).field_J ? ((ui) this).field_O : ((ui) this).field_J;
        return ((ui) this).field_s.substring(var2, var3);
    }

    private final void c(byte param0) {
        int discarded$0 = -19659;
        String var2 = this.p();
        if (var2.length() > 0) {
            int discarded$1 = -19659;
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.p()), (java.awt.datatransfer.ClipboardOwner) null);
        }
        int var3 = -106 % ((67 - param0) / 44);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
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
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (!(((ui) this).field_A instanceof cf)) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L1: {
                  var8_int = ((cf) (Object) ((ui) this).field_A).a((fe) this, param6, false, gb.field_e, nk.field_w, param1);
                  stackOut_3_0 = this;
                  stackOut_3_1 = 82;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (-1 != var8_int) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = var8_int;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 0;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_6_1, stackIn_6_2);
                  var8_long = sf.a((byte) 106);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (250L <= -((ui) this).field_P + var8_long) {
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
                  ((ui) this).field_R = stackIn_9_1 != 0;
                  if (((ui) this).field_R) {
                    L4: {
                      ((ui) this).field_O = this.m(119);
                      ((ui) this).field_J = this.n(param2 + -127);
                      if (0 >= ((ui) this).field_J) {
                        break L4;
                      } else {
                        if (((ui) this).field_s.charAt(-1 + ((ui) this).field_J) != 32) {
                          break L4;
                        } else {
                          ((ui) this).field_J = ((ui) this).field_J - 1;
                          break L4;
                        }
                      }
                    }
                    ((ui) this).field_I = ((ui) this).field_J;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((ui) this).field_P = var8_long;
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0 != 0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var8;
            stackOut_19_1 = new StringBuilder().append("ui.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
          throw lj.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param6 + ')');
        }
        return stackIn_18_0 != 0;
    }

    private final void o(int param0) {
        if (param0 != -6277) {
            this.a((byte) -38);
        }
        this.c((byte) 6);
        this.d((byte) 105);
    }

    private final void a(int param0, int param1) {
        ((ui) this).field_J = param1;
        if (!(qd.field_O[81])) {
            ((ui) this).field_O = ((ui) this).field_J;
        }
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_64_0 = 0;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_72_0 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        int stackOut_70_0 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_63_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_76_0 = 0;
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
            ((ui) this).field_K = sf.a((byte) 111);
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
                    if (param0 > 126) {
                      break L1;
                    } else {
                      L2: {
                        if (((ui) this).field_O != ((ui) this).field_J) {
                          this.d((byte) 77);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (((ui) this).field_M == -1) {
                            break L4;
                          } else {
                            if (((ui) this).field_s.length() < ((ui) this).field_M) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L5: {
                          if (~((ui) this).field_J > ~((ui) this).field_s.length()) {
                            ((ui) this).field_s = ((ui) this).field_s.substring(0, ((ui) this).field_J) + param0 + ((ui) this).field_s.substring(((ui) this).field_J, ((ui) this).field_s.length());
                            ((ui) this).field_J = ((ui) this).field_J + 1;
                            ((ui) this).field_O = ((ui) this).field_J;
                            break L5;
                          } else {
                            ((ui) this).field_s = ((ui) this).field_s + param0;
                            int dupTemp$2 = ((ui) this).field_s.length();
                            ((ui) this).field_J = dupTemp$2;
                            ((ui) this).field_O = dupTemp$2;
                            break L5;
                          }
                        }
                        ((ui) this).r(124);
                        break L3;
                      }
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0 != 0;
                    }
                  }
                }
                L6: {
                  if (param3 != 85) {
                    if (param3 != 101) {
                      if (param3 == 13) {
                        ((ui) this).f((byte) 112);
                        stackOut_72_0 = 1;
                        stackIn_73_0 = stackOut_72_0;
                        return stackIn_73_0 != 0;
                      } else {
                        if (96 == param3) {
                          if (((ui) this).field_J > 0) {
                            L7: {
                              stackOut_67_0 = this;
                              stackOut_67_1 = 82;
                              stackIn_69_0 = stackOut_67_0;
                              stackIn_69_1 = stackOut_67_1;
                              stackIn_68_0 = stackOut_67_0;
                              stackIn_68_1 = stackOut_67_1;
                              if (!qd.field_O[82]) {
                                stackOut_69_0 = this;
                                stackOut_69_1 = stackIn_69_1;
                                stackOut_69_2 = ((ui) this).field_J + -1;
                                stackIn_70_0 = stackOut_69_0;
                                stackIn_70_1 = stackOut_69_1;
                                stackIn_70_2 = stackOut_69_2;
                                break L7;
                              } else {
                                stackOut_68_0 = this;
                                stackOut_68_1 = stackIn_68_1;
                                stackOut_68_2 = this.m(param2 + 191);
                                stackIn_70_0 = stackOut_68_0;
                                stackIn_70_1 = stackOut_68_1;
                                stackIn_70_2 = stackOut_68_2;
                                break L7;
                              }
                            }
                            this.a(stackIn_70_1, stackIn_70_2);
                            stackOut_70_0 = 1;
                            stackIn_71_0 = stackOut_70_0;
                            return stackIn_71_0 != 0;
                          } else {
                            break L6;
                          }
                        } else {
                          if (param3 == 97) {
                            if (~((ui) this).field_J <= ~((ui) this).field_s.length()) {
                              break L6;
                            } else {
                              L8: {
                                stackOut_60_0 = this;
                                stackOut_60_1 = 82;
                                stackIn_62_0 = stackOut_60_0;
                                stackIn_62_1 = stackOut_60_1;
                                stackIn_61_0 = stackOut_60_0;
                                stackIn_61_1 = stackOut_60_1;
                                if (qd.field_O[82]) {
                                  stackOut_62_0 = this;
                                  stackOut_62_1 = stackIn_62_1;
                                  stackOut_62_2 = this.n(param2 + -48);
                                  stackIn_63_0 = stackOut_62_0;
                                  stackIn_63_1 = stackOut_62_1;
                                  stackIn_63_2 = stackOut_62_2;
                                  break L8;
                                } else {
                                  stackOut_61_0 = this;
                                  stackOut_61_1 = stackIn_61_1;
                                  stackOut_61_2 = 1 + ((ui) this).field_J;
                                  stackIn_63_0 = stackOut_61_0;
                                  stackIn_63_1 = stackOut_61_1;
                                  stackIn_63_2 = stackOut_61_2;
                                  break L8;
                                }
                              }
                              this.a(stackIn_63_1, stackIn_63_2);
                              stackOut_63_0 = 1;
                              stackIn_64_0 = stackOut_63_0;
                              return stackIn_64_0 != 0;
                            }
                          } else {
                            if (param3 == 102) {
                              this.a(82, 0);
                              stackOut_57_0 = 1;
                              stackIn_58_0 = stackOut_57_0;
                              return stackIn_58_0 != 0;
                            } else {
                              if (param3 != 103) {
                                if (param3 != 84) {
                                  L9: {
                                    if (!qd.field_O[82]) {
                                      break L9;
                                    } else {
                                      if (param3 == 65) {
                                        this.o(-6277);
                                        stackOut_55_0 = 1;
                                        stackIn_56_0 = stackOut_55_0;
                                        return stackIn_56_0 != 0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (!qd.field_O[82]) {
                                      break L10;
                                    } else {
                                      if (param3 != 66) {
                                        break L10;
                                      } else {
                                        this.c((byte) 122);
                                        stackOut_49_0 = 1;
                                        stackIn_50_0 = stackOut_49_0;
                                        return stackIn_50_0 != 0;
                                      }
                                    }
                                  }
                                  if (!qd.field_O[82]) {
                                    break L6;
                                  } else {
                                    if (param3 != 67) {
                                      break L6;
                                    } else {
                                      this.a((byte) 115);
                                      stackOut_53_0 = 1;
                                      stackIn_54_0 = stackOut_53_0;
                                      return stackIn_54_0 != 0;
                                    }
                                  }
                                } else {
                                  int discarded$3 = 66;
                                  this.e();
                                  stackOut_42_0 = 1;
                                  stackIn_43_0 = stackOut_42_0;
                                  return stackIn_43_0 != 0;
                                }
                              } else {
                                this.a(82, ((ui) this).field_s.length());
                                stackOut_39_0 = 1;
                                stackIn_40_0 = stackOut_39_0;
                                return stackIn_40_0 != 0;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (((ui) this).field_O != ((ui) this).field_J) {
                        this.d((byte) 88);
                        stackOut_32_0 = 1;
                        stackIn_33_0 = stackOut_32_0;
                        return stackIn_33_0 != 0;
                      } else {
                        if (((ui) this).field_J >= ((ui) this).field_s.length()) {
                          break L6;
                        } else {
                          ((ui) this).field_O = 1 + ((ui) this).field_J;
                          this.d((byte) 102);
                          stackOut_30_0 = 1;
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0 != 0;
                        }
                      }
                    }
                  } else {
                    if (((ui) this).field_J != ((ui) this).field_O) {
                      this.d((byte) 65);
                      stackOut_25_0 = 1;
                      stackIn_26_0 = stackOut_25_0;
                      return stackIn_26_0 != 0;
                    } else {
                      if (((ui) this).field_J > 0) {
                        ((ui) this).field_O = ((ui) this).field_J - 1;
                        this.d((byte) 92);
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0 != 0;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L11: {
                  if (param2 == -79) {
                    break L11;
                  } else {
                    ((ui) this).field_P = 57L;
                    break L11;
                  }
                }
                stackOut_76_0 = 0;
                stackIn_77_0 = stackOut_76_0;
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
            stackOut_78_0 = (RuntimeException) var5;
            stackOut_78_1 = new StringBuilder().append("ui.K(").append(param0).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param1 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L12;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L12;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_77_0 != 0;
    }

    final void f(byte param0) {
        if (param0 != 112) {
            return;
        }
        ((ui) this).field_s = "";
        ((ui) this).field_O = 0;
        ((ui) this).field_J = 0;
        ((ui) this).r(param0 ^ 12);
    }

    private final int m(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = MinerDisturbance.field_ab;
        if (((ui) this).field_J != 0) {
          var2 = -1 + ((ui) this).field_J;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (32 == ((ui) this).field_s.charAt(-1 + var2)) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            if (param0 >= 36) {
              return var2;
            } else {
              return 38;
            }
          }
        } else {
          return ((ui) this).field_J;
        }
    }

    public static void q(int param0) {
        if (param0 != -1) {
            ui.q(68);
        }
        field_N = null;
    }

    final void a(boolean param0, boolean param1, String param2) {
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
              if (param2 != null) {
                break L1;
              } else {
                param2 = "";
                break L1;
              }
            }
            L2: {
              if (!param1) {
                break L2;
              } else {
                ((ui) this).field_I = -97;
                break L2;
              }
            }
            L3: {
              ((ui) this).field_s = param2;
              var4_int = param2.length();
              if (-1 == ((ui) this).field_M) {
                break L3;
              } else {
                if (var4_int > ((ui) this).field_M) {
                  ((ui) this).field_s = ((ui) this).field_s.substring(0, ((ui) this).field_M);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              int dupTemp$3 = ((ui) this).field_s.length();
              ((ui) this).field_O = dupTemp$3;
              ((ui) this).field_J = dupTemp$3;
              if (!param0) {
                ((ui) this).r(124);
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
            stackOut_12_1 = new StringBuilder().append("ui.L(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    private final void e() {
        if (((ui) this).field_y instanceof wg) {
            ((wg) (Object) ((ui) this).field_y).a((ui) this, -7802);
        }
    }

    void r(int param0) {
        if (param0 <= 123) {
            this.o(115);
        }
        if (!(!(((ui) this).field_y instanceof wg))) {
            ((wg) (Object) ((ui) this).field_y).b((ui) this, 60);
        }
    }

    void a(int param0, int param1, byte param2, fe param3) {
        RuntimeException runtimeException = null;
        cf var5 = null;
        int var6 = 0;
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
              super.a(param0, param1, (byte) 75, param3);
              int discarded$2 = 0;
              this.a();
              if (((ui) this).field_w != 1) {
                break L1;
              } else {
                L2: {
                  if (((ui) this).field_A instanceof cf) {
                    var5 = (cf) (Object) ((ui) this).field_A;
                    var6 = var5.a((fe) this, param1, false, gb.field_e, nk.field_w, param0);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!((ui) this).field_R) {
                          break L3;
                        } else {
                          if (var6 >= ((ui) this).field_I) {
                            break L3;
                          } else {
                            if (((ui) this).field_O < var6) {
                              var6 = ((ui) this).field_I;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((ui) this).field_J = var6;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((ui) this).field_K = sf.a((byte) -123);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("ui.V(").append(param0).append(',').append(param1).append(',').append(62).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        cf var8 = null;
        long var6 = 0L;
        if (((ui) this).field_A != null) {
            if (!(param3 != 0)) {
                ((ui) this).field_A.a(param0 ^ 12092, param1, (fe) this, param2, ((ui) this).field_E);
                if (((ui) this).field_A instanceof cf) {
                    var8 = (cf) (Object) ((ui) this).field_A;
                    if (!(((ui) this).field_J == ((ui) this).field_O)) {
                        var8.a(((ui) this).field_J, (fe) this, param2, param1, ((ui) this).field_O, false);
                    }
                    var6 = sf.a((byte) 107);
                    if ((var6 - ((ui) this).field_K) % 1000L < 500L) {
                        var8.a(param0 + 13030, param1, ((ui) this).field_J, param2, (fe) this);
                    }
                }
            }
        }
        if (param0 != 4) {
            ((ui) this).field_Q = false;
        }
    }

    private final void a(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                  this.d((byte) 101);
                  if (param0 >= 62) {
                    break L1;
                  } else {
                    ((ui) this).field_I = 10;
                    break L1;
                  }
                }
                int discarded$1 = 0;
                this.a(var2);
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

    private final int n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        var2 = ((ui) this).field_s.length();
        if (((ui) this).field_J != var2) {
          L0: {
            if (param0 == -127) {
              break L0;
            } else {
              ((ui) this).field_R = false;
              break L0;
            }
          }
          var3 = ((ui) this).field_J - -1;
          L1: while (true) {
            L2: {
              if (var3 >= var2) {
                break L2;
              } else {
                if (32 == ((ui) this).field_s.charAt(-1 + var3)) {
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
          return ((ui) this).field_J;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
