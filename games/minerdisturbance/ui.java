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

    private final void a(boolean param0) {
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
        int var5 = var9.a((fe) this, param0);
        int var6 = var9.a(123) >> -1773861439;
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
        if (-1 > (((ui) this).field_p ^ -1)) {
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
        ((ui) this).field_M = param2;
        ((ui) this).field_A = bd.field_c.field_a;
        ((ui) this).a(true, false, param0);
        ((ui) this).field_Q = true;
        ((ui) this).field_K = sf.a((byte) 109);
    }

    private final void a(String param0, boolean param1) {
        int var3 = 0;
        if (0 != ((ui) this).field_M) {
            var3 = ((ui) this).field_M + -((ui) this).field_s.length();
            if (!(-1 > var3)) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((ui) this).field_J == ((ui) this).field_s.length()) {
            ((ui) this).field_s = ((ui) this).field_s + param0;
        } else {
            ((ui) this).field_s = ((ui) this).field_s.substring(0, ((ui) this).field_J) + param0 + ((ui) this).field_s.substring(((ui) this).field_J, ((ui) this).field_s.length());
        }
        ((ui) this).field_J = ((ui) this).field_J + param0.length();
        ((ui) this).field_O = ((ui) this).field_J;
        ((ui) this).r(124);
        if (param1) {
            ((ui) this).a((byte) 121, -109, -44, 81);
        }
    }

    private final String p(int param0) {
        if (param0 != -19659) {
            return null;
        }
        int var2 = ((ui) this).field_J > ((ui) this).field_O ? ((ui) this).field_O : ((ui) this).field_J;
        int var3 = ((ui) this).field_O >= ((ui) this).field_J ? ((ui) this).field_O : ((ui) this).field_J;
        return ((ui) this).field_s.substring(var2, var3);
    }

    private final void c(byte param0) {
        String var2 = this.p(-19659);
        if ((var2.length() ^ -1) < -1) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.p(-19659)), (java.awt.datatransfer.ClipboardOwner) null);
        }
        int var3 = -106 % ((67 - param0) / 44);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
        }
        if (((ui) this).field_A instanceof cf) {
            var8_int = ((cf) (Object) ((ui) this).field_A).a((fe) this, param6, false, gb.field_e, nk.field_w, param1);
            this.a(82, -1 == var8_int ? 0 : var8_int);
            var8 = sf.a((byte) 106);
            ((ui) this).field_R = 250L > -((ui) this).field_P + var8 ? true : false;
            if (!(!((ui) this).field_R)) {
                ((ui) this).field_O = this.m(119);
                ((ui) this).field_J = this.n(param2 + -127);
                if (0 < ((ui) this).field_J) {
                    if (-33 == (((ui) this).field_s.charAt(-1 + ((ui) this).field_J) ^ -1)) {
                        ((ui) this).field_J = ((ui) this).field_J - 1;
                    }
                }
                ((ui) this).field_I = ((ui) this).field_J;
            }
            ((ui) this).field_P = var8;
            return true;
        }
        return false;
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
        if (param0 != 82) {
            return;
        }
        if (!(qd.field_O[81])) {
            ((ui) this).field_O = ((ui) this).field_J;
        }
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        ((ui) this).field_K = sf.a((byte) 111);
        if (param0 == 60) {
          return false;
        } else {
          if (param0 != 62) {
            L0: {
              if (param0 < 32) {
                break L0;
              } else {
                if (param0 > 126) {
                  break L0;
                } else {
                  L1: {
                    if (((ui) this).field_O != ((ui) this).field_J) {
                      this.d((byte) 77);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      if (((ui) this).field_M == -1) {
                        break L3;
                      } else {
                        if (((ui) this).field_s.length() < ((ui) this).field_M) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (((ui) this).field_J < ((ui) this).field_s.length()) {
                        ((ui) this).field_s = ((ui) this).field_s.substring(0, ((ui) this).field_J) + param0 + ((ui) this).field_s.substring(((ui) this).field_J, ((ui) this).field_s.length());
                        ((ui) this).field_J = ((ui) this).field_J + 1;
                        ((ui) this).field_O = ((ui) this).field_J;
                        break L4;
                      } else {
                        ((ui) this).field_s = ((ui) this).field_s + param0;
                        ((ui) this).field_J = ((ui) this).field_s.length();
                        ((ui) this).field_O = ((ui) this).field_s.length();
                        break L4;
                      }
                    }
                    ((ui) this).r(124);
                    break L2;
                  }
                  return true;
                }
              }
            }
            L5: {
              if (param3 != 85) {
                if (param3 != 101) {
                  if (-14 == (param3 ^ -1)) {
                    ((ui) this).f((byte) 112);
                    return true;
                  } else {
                    if (96 == param3) {
                      if (((ui) this).field_J > 0) {
                        L6: {
                          stackOut_54_0 = this;
                          stackOut_54_1 = 82;
                          stackIn_56_0 = stackOut_54_0;
                          stackIn_56_1 = stackOut_54_1;
                          stackIn_55_0 = stackOut_54_0;
                          stackIn_55_1 = stackOut_54_1;
                          if (!qd.field_O[82]) {
                            stackOut_56_0 = this;
                            stackOut_56_1 = stackIn_56_1;
                            stackOut_56_2 = ((ui) this).field_J + -1;
                            stackIn_57_0 = stackOut_56_0;
                            stackIn_57_1 = stackOut_56_1;
                            stackIn_57_2 = stackOut_56_2;
                            break L6;
                          } else {
                            stackOut_55_0 = this;
                            stackOut_55_1 = stackIn_55_1;
                            stackOut_55_2 = this.m(param2 + 191);
                            stackIn_57_0 = stackOut_55_0;
                            stackIn_57_1 = stackOut_55_1;
                            stackIn_57_2 = stackOut_55_2;
                            break L6;
                          }
                        }
                        this.a(stackIn_57_1, stackIn_57_2);
                        return true;
                      } else {
                        break L5;
                      }
                    } else {
                      if (param3 == -98) {
                        if (((ui) this).field_J >= ((ui) this).field_s.length()) {
                          break L5;
                        } else {
                          L7: {
                            stackOut_48_0 = this;
                            stackOut_48_1 = 82;
                            stackIn_50_0 = stackOut_48_0;
                            stackIn_50_1 = stackOut_48_1;
                            stackIn_49_0 = stackOut_48_0;
                            stackIn_49_1 = stackOut_48_1;
                            if (qd.field_O[82]) {
                              stackOut_50_0 = this;
                              stackOut_50_1 = stackIn_50_1;
                              stackOut_50_2 = this.n(param2 + -48);
                              stackIn_51_0 = stackOut_50_0;
                              stackIn_51_1 = stackOut_50_1;
                              stackIn_51_2 = stackOut_50_2;
                              break L7;
                            } else {
                              stackOut_49_0 = this;
                              stackOut_49_1 = stackIn_49_1;
                              stackOut_49_2 = 1 + ((ui) this).field_J;
                              stackIn_51_0 = stackOut_49_0;
                              stackIn_51_1 = stackOut_49_1;
                              stackIn_51_2 = stackOut_49_2;
                              break L7;
                            }
                          }
                          this.a(stackIn_51_1, stackIn_51_2);
                          return true;
                        }
                      } else {
                        if (-103 == param3) {
                          this.a(82, 0);
                          return true;
                        } else {
                          if (param3 != 103) {
                            if ((param3 ^ -1) != -85) {
                              L8: {
                                if (!qd.field_O[82]) {
                                  break L8;
                                } else {
                                  if (param3 == 65) {
                                    this.o(-6277);
                                    return true;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (!qd.field_O[82]) {
                                  break L9;
                                } else {
                                  if (-67 != param3) {
                                    break L9;
                                  } else {
                                    this.c((byte) 122);
                                    return true;
                                  }
                                }
                              }
                              if (!qd.field_O[82]) {
                                break L5;
                              } else {
                                if (-68 != param3) {
                                  break L5;
                                } else {
                                  this.a((byte) 115);
                                  return true;
                                }
                              }
                            } else {
                              this.e((byte) 66);
                              return true;
                            }
                          } else {
                            this.a(82, ((ui) this).field_s.length());
                            return true;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (((ui) this).field_O != ((ui) this).field_J) {
                    this.d((byte) 88);
                    return true;
                  } else {
                    if (((ui) this).field_J >= ((ui) this).field_s.length()) {
                      break L5;
                    } else {
                      ((ui) this).field_O = 1 + ((ui) this).field_J;
                      this.d((byte) 102);
                      return true;
                    }
                  }
                }
              } else {
                if (((ui) this).field_J != ((ui) this).field_O) {
                  this.d((byte) 65);
                  return true;
                } else {
                  if (-1 > (((ui) this).field_J ^ -1)) {
                    ((ui) this).field_O = ((ui) this).field_J - 1;
                    this.d((byte) 92);
                    return true;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L10: {
              if (param2 == -79) {
                break L10;
              } else {
                ((ui) this).field_P = 57L;
                break L10;
              }
            }
            return false;
          } else {
            return false;
          }
        }
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
        int var3 = MinerDisturbance.field_ab;
        if (((ui) this).field_J == 0) {
            return ((ui) this).field_J;
        }
        for (var2 = -1 + ((ui) this).field_J; (var2 ^ -1) < -1; var2--) {
            // if_icmpeq L51
        }
        if (param0 < 36) {
            return 38;
        }
        return var2;
    }

    public static void q(int param0) {
        if (param0 != -1) {
            ui.q(68);
        }
        field_N = null;
    }

    final void a(boolean param0, boolean param1, String param2) {
        if (param2 == null) {
            param2 = "";
        }
        if (param1) {
            ((ui) this).field_I = -97;
        }
        ((ui) this).field_s = param2;
        int var4 = param2.length();
        if (-1 != ((ui) this).field_M) {
            if (!(var4 <= ((ui) this).field_M)) {
                ((ui) this).field_s = ((ui) this).field_s.substring(0, ((ui) this).field_M);
            }
        }
        ((ui) this).field_O = ((ui) this).field_s.length();
        ((ui) this).field_J = ((ui) this).field_s.length();
        if (!(param0)) {
            ((ui) this).r(124);
        }
    }

    private final void e(byte param0) {
        if (((ui) this).field_y instanceof wg) {
            ((wg) (Object) ((ui) this).field_y).a((ui) this, -7802);
        }
        if (param0 < 21) {
            ((ui) this).field_O = 46;
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
        cf var7 = null;
        int var6 = 0;
        super.a(param0, param1, (byte) 75, param3);
        if (param2 < 49) {
            field_N = null;
        }
        this.a(false);
        if ((((ui) this).field_w ^ -1) == -2) {
            if (!(!(((ui) this).field_A instanceof cf))) {
                var7 = (cf) (Object) ((ui) this).field_A;
                var6 = var7.a((fe) this, param1, false, gb.field_e, nk.field_w, param0);
                if (0 != (var6 ^ -1)) {
                    if (((ui) this).field_R) {
                        if (var6 < ((ui) this).field_I) {
                            if (!(((ui) this).field_O >= var6)) {
                                var6 = ((ui) this).field_I;
                            }
                        }
                    }
                    ((ui) this).field_J = var6;
                }
            }
            ((ui) this).field_K = sf.a((byte) -123);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        cf var8 = null;
        long var6 = 0L;
        if (((ui) this).field_A != null) {
            if (!(-1 != (param3 ^ -1))) {
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
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.d((byte) 101);
                if (param0 >= 62) {
                  break L0;
                } else {
                  ((ui) this).field_I = 10;
                  break L0;
                }
              }
              this.a(var2, false);
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2_ref = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int n(int param0) {
        int var3 = 0;
        int var4 = MinerDisturbance.field_ab;
        int var2 = ((ui) this).field_s.length();
        if (((ui) this).field_J == var2) {
            return ((ui) this).field_J;
        }
        if (param0 != -127) {
            ((ui) this).field_R = false;
        }
        for (var3 = ((ui) this).field_J - -1; var3 < var2; var3++) {
            // if_icmpeq L73
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
