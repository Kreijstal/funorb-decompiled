/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class hnb extends iw implements oo {
    static phb[] field_U;
    private boolean field_M;
    static llb field_X;
    private htb field_L;
    private boolean field_K;
    private htb field_R;
    private htb field_Q;
    private htb field_W;
    private htb[] field_T;
    private fm[] field_N;
    private htb field_V;
    private nva field_P;
    private htb field_O;
    private usb field_S;
    private boolean field_J;

    final void a(int param0, int param1, int param2, shb param3) {
        htb[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        htb var7 = null;
        int var8 = 0;
        htb[] var9 = null;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (!upb.field_c) {
                break L1;
              } else {
                param3.f((byte) -34);
                var9 = ((hnb) this).field_T;
                var5 = var9;
                var6 = 0;
                L2: while (true) {
                  if (var9.length <= var6) {
                    break L1;
                  } else {
                    L3: {
                      var7 = var9[var6];
                      if (!var7.field_e) {
                        break L3;
                      } else {
                        boolean discarded$3 = var7.a(0, (shb) this);
                        break L3;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              }
            }
            L4: {
              if (((hnb) this).field_J) {
                break L4;
              } else {
                if (fda.e((byte) 124)) {
                  break L4;
                } else {
                  this.l((byte) -118);
                  ((hnb) this).field_v.a(false, (shb) (Object) new hnb(((hnb) this).field_v));
                  break L4;
                }
              }
            }
            L5: {
              if (param2 == -981) {
                break L5;
              } else {
                field_U = null;
                break L5;
              }
            }
            L6: {
              if (null == ((hnb) this).field_P) {
                break L6;
              } else {
                L7: {
                  if (((hnb) this).field_P.h(0)) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L7;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L7;
                  }
                }
                if (stackIn_16_0 == (((hnb) this).field_M ? 1 : 0)) {
                  this.a(true, ((hnb) this).field_L);
                  ((hnb) this).field_M = ((hnb) this).field_P.h(0);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5_ref;
            stackOut_20_1 = new StringBuilder().append("hnb.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    private final void a(boolean param0, htb param1) {
        htb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        fm var5 = null;
        htb stackIn_3_0 = null;
        htb stackIn_4_0 = null;
        htb stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        htb stackOut_2_0 = null;
        htb stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        htb stackOut_3_0 = null;
        int stackOut_3_1 = 0;
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
            ((hnb) this).field_V = param1;
            L1: {
              boolean discarded$164 = param1.a(0, (shb) this);
              var3 = this.m((byte) 62);
              stackOut_2_0 = ((hnb) this).field_W;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (var3 == param1) {
                stackOut_4_0 = (htb) (Object) stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = (htb) (Object) stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            L2: {
              L3: {
                stackIn_5_0.field_x = stackIn_5_1 != 0;
                if (param1 != ((hnb) this).field_L) {
                  break L3;
                } else {
                  if (var3 != param1) {
                    break L3;
                  } else {
                    if (((hnb) this).field_P != null) {
                      L4: {
                        var4 = ((hnb) this).field_P.a(0);
                        var5 = ((hnb) this).field_N[var4];
                        if (efb.field_b.field_q != var5.field_c) {
                          break L4;
                        } else {
                          if (efb.field_b.field_e == var5.field_a) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      ((hnb) this).field_W.field_x = true;
                      break L3;
                    } else {
                      int discarded$165 = -99;
                      this.g();
                      break L2;
                    }
                  }
                }
              }
              int discarded$166 = -99;
              this.g();
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("hnb.T(").append(1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    private final void l(byte param0) {
        if (!(((hnb) this).field_z)) {
            return;
        }
        if (param0 >= -20) {
            return;
        }
        ((hnb) this).field_z = false;
    }

    hnb(ida param0) {
        super(param0, 430, 254);
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        fm[] var3_ref_fm__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        htb var6 = null;
        String var6_ref = null;
        int var7_int = 0;
        shb var7 = null;
        fm var8 = null;
        String var10 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_48_0 = 0;
        Object stackIn_49_0 = null;
        usb stackIn_49_1 = null;
        usb stackIn_49_2 = null;
        int stackIn_49_3 = 0;
        Object stackIn_50_0 = null;
        usb stackIn_50_1 = null;
        usb stackIn_50_2 = null;
        int stackIn_50_3 = 0;
        Object stackIn_51_0 = null;
        usb stackIn_51_1 = null;
        usb stackIn_51_2 = null;
        int stackIn_51_3 = 0;
        Object stackIn_52_0 = null;
        usb stackIn_52_1 = null;
        usb stackIn_52_2 = null;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        String stackIn_74_0 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        Object stackOut_37_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        Object stackOut_48_0 = null;
        usb stackOut_48_1 = null;
        usb stackOut_48_2 = null;
        int stackOut_48_3 = 0;
        Object stackOut_49_0 = null;
        usb stackOut_49_1 = null;
        usb stackOut_49_2 = null;
        int stackOut_49_3 = 0;
        Object stackOut_51_0 = null;
        usb stackOut_51_1 = null;
        usb stackOut_51_2 = null;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        Object stackOut_50_0 = null;
        usb stackOut_50_1 = null;
        usb stackOut_50_2 = null;
        int stackOut_50_3 = 0;
        int stackOut_50_4 = 0;
        Object stackOut_54_0 = null;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        String stackOut_73_0 = null;
        String stackOut_72_0 = null;
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
              int discarded$2 = -30334;
              ((hnb) this).field_N = dtb.a(bm.field_o);
              if (0 >= ((hnb) this).field_N.length) {
                break L1;
              } else {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= ((hnb) this).field_N.length) {
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (((hnb) this).field_N.length <= var3) {
                        var3_ref_fm__ = ((hnb) this).field_N;
                        ((hnb) this).field_N = new fm[var2_int];
                        var4 = 0;
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= var3_ref_fm__.length) {
                            tw.a(((hnb) this).field_N, (byte) 62);
                            break L1;
                          } else {
                            L5: {
                              if (null == var3_ref_fm__[var5]) {
                                break L5;
                              } else {
                                int incrementValue$3 = var4;
                                var4++;
                                ((hnb) this).field_N[incrementValue$3] = var3_ref_fm__[var5];
                                break L5;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L6: {
                          if (((hnb) this).field_N[var3] == null) {
                            break L6;
                          } else {
                            var2_int++;
                            break L6;
                          }
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      if (null == ((hnb) this).field_N[var2_int]) {
                        break L7;
                      } else {
                        var3 = 1 + var2_int;
                        L8: while (true) {
                          if (((hnb) this).field_N.length <= var3) {
                            if (efb.field_b == null) {
                              break L7;
                            } else {
                              if (((hnb) this).field_N[var2_int] == null) {
                                break L7;
                              } else {
                                if (efb.field_b.b(((hnb) this).field_N[var2_int].field_a, ((hnb) this).field_N[var2_int].field_c, 0)) {
                                  break L7;
                                } else {
                                  ((hnb) this).field_N[var2_int] = null;
                                  break L7;
                                }
                              }
                            }
                          } else {
                            L9: {
                              if (null == ((hnb) this).field_N[var3]) {
                                break L9;
                              } else {
                                if (((hnb) this).field_N[var3].field_c != ((hnb) this).field_N[var2_int].field_c) {
                                  break L9;
                                } else {
                                  if (((hnb) this).field_N[var2_int].field_a != ((hnb) this).field_N[var3].field_a) {
                                    break L9;
                                  } else {
                                    ((hnb) this).field_N[var3] = null;
                                    break L9;
                                  }
                                }
                              }
                            }
                            var3++;
                            continue L8;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              }
            }
            L10: {
              stackOut_28_0 = this;
              stackIn_30_0 = stackOut_28_0;
              stackIn_29_0 = stackOut_28_0;
              if (((hnb) this).field_N.length <= 0) {
                stackOut_30_0 = this;
                stackOut_30_1 = 0;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                break L10;
              } else {
                stackOut_29_0 = this;
                stackOut_29_1 = 1;
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                break L10;
              }
            }
            L11: {
              ((hnb) this).field_K = stackIn_31_1 != 0;
              if (!oq.c((byte) 114)) {
                stackOut_33_0 = 0;
                stackIn_34_0 = stackOut_33_0;
                break L11;
              } else {
                stackOut_32_0 = 1;
                stackIn_34_0 = stackOut_32_0;
                break L11;
              }
            }
            L12: {
              var2_int = stackIn_34_0;
              if (var2_int == 0) {
                stackOut_36_0 = 2;
                stackIn_37_0 = stackOut_36_0;
                break L12;
              } else {
                stackOut_35_0 = 3;
                stackIn_37_0 = stackOut_35_0;
                break L12;
              }
            }
            L13: {
              var3 = stackIn_37_0;
              stackOut_37_0 = this;
              stackIn_39_0 = stackOut_37_0;
              stackIn_38_0 = stackOut_37_0;
              if (fda.e((byte) 110)) {
                stackOut_39_0 = this;
                stackOut_39_1 = 0;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                break L13;
              } else {
                stackOut_38_0 = this;
                stackOut_38_1 = 1;
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                break L13;
              }
            }
            L14: {
              ((hnb) this).field_J = stackIn_40_1 != 0;
              if (var2_int == 0) {
                if (efb.field_b != null) {
                  if (efb.field_b.b((byte) -17)) {
                    stackOut_46_0 = 1;
                    stackIn_48_0 = stackOut_46_0;
                    break L14;
                  } else {
                    stackOut_45_0 = 0;
                    stackIn_48_0 = stackOut_45_0;
                    break L14;
                  }
                } else {
                  stackOut_43_0 = 0;
                  stackIn_48_0 = stackOut_43_0;
                  break L14;
                }
              } else {
                stackOut_41_0 = 0;
                stackIn_48_0 = stackOut_41_0;
                break L14;
              }
            }
            L15: {
              L16: {
                var4 = stackIn_48_0;
                stackOut_48_0 = this;
                stackOut_48_1 = null;
                stackOut_48_2 = null;
                stackOut_48_3 = 10;
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_50_2 = stackOut_48_2;
                stackIn_50_3 = stackOut_48_3;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                stackIn_49_2 = stackOut_48_2;
                stackIn_49_3 = stackOut_48_3;
                if (var2_int != 0) {
                  break L16;
                } else {
                  stackOut_49_0 = this;
                  stackOut_49_1 = null;
                  stackOut_49_2 = null;
                  stackOut_49_3 = stackIn_49_3;
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  stackIn_51_3 = stackOut_49_3;
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  stackIn_50_3 = stackOut_49_3;
                  if (var4 == 0) {
                    stackOut_51_0 = this;
                    stackOut_51_1 = null;
                    stackOut_51_2 = null;
                    stackOut_51_3 = stackIn_51_3;
                    stackOut_51_4 = 75;
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    stackIn_52_2 = stackOut_51_2;
                    stackIn_52_3 = stackOut_51_3;
                    stackIn_52_4 = stackOut_51_4;
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
              stackOut_50_0 = this;
              stackOut_50_1 = null;
              stackOut_50_2 = null;
              stackOut_50_3 = stackIn_50_3;
              stackOut_50_4 = 58;
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              stackIn_52_3 = stackOut_50_3;
              stackIn_52_4 = stackOut_50_4;
              break L15;
            }
            L17: {
              ((hnb) this).field_S = new usb(stackIn_52_3, stackIn_52_4, 410, 105, (wwa) null, var3, 1);
              ((hnb) this).field_S.field_w = 83;
              ((hnb) this).field_S.c(-6, 5, 5);
              ((hnb) this).b(-18756, (shb) (Object) ((hnb) this).field_S);
              ((hnb) this).field_O = this.a(lib.field_q, (byte) 111, (sba) this, fja.field_q);
              if (var2_int == 0) {
                break L17;
              } else {
                ((hnb) this).field_R = this.a(bmb.field_b, (byte) 106, (sba) this, cw.field_p);
                break L17;
              }
            }
            L18: {
              ((hnb) this).field_L = this.a(gk.field_o, (byte) 110, (sba) this, tw.field_f);
              stackOut_54_0 = this;
              stackIn_56_0 = stackOut_54_0;
              stackIn_55_0 = stackOut_54_0;
              if (var2_int == 0) {
                stackOut_56_0 = this;
                stackOut_56_1 = 2;
                stackIn_57_0 = stackOut_56_0;
                stackIn_57_1 = stackOut_56_1;
                break L18;
              } else {
                stackOut_55_0 = this;
                stackOut_55_1 = 3;
                stackIn_57_0 = stackOut_55_0;
                stackIn_57_1 = stackOut_55_1;
                break L18;
              }
            }
            L19: {
              ((hnb) this).field_T = new htb[stackIn_57_1];
              ((hnb) this).field_T[1] = ((hnb) this).field_L;
              if (var2_int == 0) {
                break L19;
              } else {
                ((hnb) this).field_T[2] = ((hnb) this).field_R;
                break L19;
              }
            }
            L20: {
              ((hnb) this).field_T[0] = ((hnb) this).field_O;
              if (!((hnb) this).field_K) {
                break L20;
              } else {
                if (var2_int == 0) {
                  break L20;
                } else {
                  var5_ref_String__ = new String[((hnb) this).field_N.length];
                  var6_int = var5_ref_String__.length - 1;
                  var7_int = 0;
                  L21: while (true) {
                    if (((hnb) this).field_N.length <= var7_int) {
                      ((hnb) this).field_P = new nva((Object[]) (Object) var5_ref_String__, var6_int, 150);
                      ((hnb) this).field_P.a(((hnb) this).field_L.field_g + ((hnb) this).field_S.field_g, 126, 18, 1, -19 + (((hnb) this).field_L.field_f + ((hnb) this).field_S.field_r - -((hnb) this).field_L.field_r));
                      ((hnb) this).field_t.a((ksa) (Object) ((hnb) this).field_P, (byte) -55);
                      break L20;
                    } else {
                      L22: {
                        var8 = ((hnb) this).field_N[var7_int];
                        if (psb.field_b == null) {
                          break L22;
                        } else {
                          if (var8.field_c != efb.field_b.field_q) {
                            break L22;
                          } else {
                            if (var8.field_a != efb.field_b.field_e) {
                              break L22;
                            } else {
                              var6_int = var7_int;
                              break L22;
                            }
                          }
                        }
                      }
                      var5_ref_String__[var7_int] = var8.field_c + "<times>" + var8.field_a;
                      var7_int++;
                      continue L21;
                    }
                  }
                }
              }
            }
            L23: {
              L24: {
                ((hnb) this).field_Q = this.a(wv.field_l, (sba) this, -14);
                var5 = ((hnb) this).field_Q.field_h / 2 + ((hnb) this).field_Q.field_g;
                ((hnb) this).field_Q.field_h = 150;
                ((hnb) this).field_Q.field_g = -((hnb) this).field_Q.field_h + (var5 + -20);
                ((hnb) this).field_W = this.a(jdb.field_a, (sba) this, -14);
                ((hnb) this).field_W.field_h = ((hnb) this).field_Q.field_h;
                ((hnb) this).field_W.field_x = false;
                ((hnb) this).field_W.field_g = var5 + 20;
                if (var2_int != 0) {
                  break L24;
                } else {
                  if (var4 == 0) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              L25: {
                if (var2_int != 0) {
                  stackOut_73_0 = bkb.field_a;
                  stackIn_74_0 = stackOut_73_0;
                  break L25;
                } else {
                  stackOut_72_0 = fv.field_q;
                  stackIn_74_0 = stackOut_72_0;
                  break L25;
                }
              }
              var10 = stackIn_74_0;
              var6_ref = var10;
              var7 = new shb(var10, (sba) null);
              var7.field_g = 0;
              var7.field_h = ((hnb) this).field_h;
              var7.field_r = 163;
              var7.field_f = 80;
              var7.field_q = (wwa) (Object) new bob(loa.field_o, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true);
              ((hnb) this).b(-18756, var7);
              break L23;
            }
            L26: {
              ((hnb) this).field_M = false;
              var6 = this.m((byte) 80);
              if (var6 == null) {
                break L26;
              } else {
                var6.field_u = true;
                break L26;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var2 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var2;
            stackOut_78_1 = new StringBuilder().append("hnb.<init>(");
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
              break L27;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L27;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 41);
        }
    }

    private final htb a(String param0, byte param1, sba param2, caa[] param3) {
        htb var5 = null;
        RuntimeException var5_ref = null;
        usb var6 = null;
        htb var7 = null;
        htb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        htb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            L1: {
              var5 = new htb(param0, param2);
              var5.field_q = (wwa) (Object) new kab(param3);
              if (param1 >= 105) {
                break L1;
              } else {
                ((hnb) this).field_T = null;
                break L1;
              }
            }
            var6 = ((hnb) this).field_S;
            var7 = var5;
            var6.a((shb) (Object) var7, (byte) -58, var6.field_w);
            ((hnb) this).field_S.a(false);
            stackOut_2_0 = (htb) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("hnb.R(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    public static void i() {
        field_U = null;
        field_X = null;
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        Object var8 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 11) {
                break L1;
              } else {
                var8 = null;
                htb discarded$1 = this.a((String) null, (sba) null, 51);
                break L1;
              }
            }
            L2: {
              if (param3 == ((hnb) this).field_Q) {
                this.l((byte) -31);
                break L2;
              } else {
                if (param3 == ((hnb) this).field_W) {
                  this.h(param0 ^ -44);
                  break L2;
                } else {
                  if (param3 == ((hnb) this).field_O) {
                    this.a(true, param3);
                    break L2;
                  } else {
                    if (param3 == ((hnb) this).field_R) {
                      this.a(true, param3);
                      break L2;
                    } else {
                      L3: {
                        if (null != ((hnb) this).field_P) {
                          if (((hnb) this).field_P.field_e) {
                            stackOut_11_0 = 1;
                            stackIn_13_0 = stackOut_11_0;
                            break L3;
                          } else {
                            stackOut_10_0 = 0;
                            stackIn_13_0 = stackOut_10_0;
                            break L3;
                          }
                        } else {
                          stackOut_8_0 = 0;
                          stackIn_13_0 = stackOut_8_0;
                          break L3;
                        }
                      }
                      var6_int = stackIn_13_0;
                      if (var6_int != 0) {
                        break L2;
                      } else {
                        if (((hnb) this).field_L != param3) {
                          break L2;
                        } else {
                          if (!((hnb) this).field_K) {
                            ((hnb) this).field_v.a(false, (shb) (Object) new mr(((hnb) this).field_v, qua.field_a));
                            break L2;
                          } else {
                            if (hcb.field_o <= 0) {
                              ((hnb) this).field_v.a(false, (shb) (Object) new qh(((hnb) this).field_v));
                              break L2;
                            } else {
                              this.a(true, param3);
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("hnb.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param4 + 41);
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_74_0 = 0;
        boolean stackIn_76_0 = false;
        Object stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        Object stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        Object stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_31_0 = 0;
        boolean stackOut_75_0 = false;
        Object stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        Object stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        Object stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5 = null;
              if (param0 == -15834) {
                break L1;
              } else {
                ((hnb) this).field_T = null;
                break L1;
              }
            }
            L2: {
              if (!((hnb) this).field_O.e((byte) -120)) {
                L3: {
                  if (null == ((hnb) this).field_R) {
                    break L3;
                  } else {
                    if (!((hnb) this).field_R.e((byte) -120)) {
                      break L3;
                    } else {
                      var5 = (Object) (Object) ((hnb) this).field_R;
                      break L2;
                    }
                  }
                }
                if (!((hnb) this).field_L.e((byte) -120)) {
                  if (((hnb) this).field_Q.e((byte) -120)) {
                    var5 = (Object) (Object) ((hnb) this).field_Q;
                    break L2;
                  } else {
                    if (((hnb) this).field_W.e((byte) -120)) {
                      var5 = (Object) (Object) ((hnb) this).field_W;
                      break L2;
                    } else {
                      if (!((hnb) this).field_O.field_u) {
                        L4: {
                          if (null == ((hnb) this).field_R) {
                            break L4;
                          } else {
                            if (!((hnb) this).field_R.field_u) {
                              break L4;
                            } else {
                              var5 = (Object) (Object) ((hnb) this).field_R;
                              break L2;
                            }
                          }
                        }
                        if (!((hnb) this).field_L.field_u) {
                          break L2;
                        } else {
                          var5 = (Object) (Object) ((hnb) this).field_L;
                          break L2;
                        }
                      } else {
                        var5 = (Object) (Object) ((hnb) this).field_O;
                        break L2;
                      }
                    }
                  }
                } else {
                  var5 = (Object) (Object) ((hnb) this).field_L;
                  break L2;
                }
              } else {
                var5 = (Object) (Object) ((hnb) this).field_O;
                break L2;
              }
            }
            L5: {
              var6 = param1;
              if (var6 != 96) {
                if (var6 == 97) {
                  if ((Object) (Object) ((hnb) this).field_O == var5) {
                    L6: {
                      if (null != ((hnb) this).field_R) {
                        boolean discarded$13 = ((hnb) this).field_R.a(param0 ^ -15834, (shb) this);
                        break L6;
                      } else {
                        boolean discarded$14 = ((hnb) this).field_L.a(0, (shb) this);
                        break L6;
                      }
                    }
                    stackOut_45_0 = 1;
                    stackIn_46_0 = stackOut_45_0;
                    return stackIn_46_0 != 0;
                  } else {
                    if (var5 != (Object) (Object) ((hnb) this).field_R) {
                      if (var5 != (Object) (Object) ((hnb) this).field_Q) {
                        break L5;
                      } else {
                        if (((hnb) this).field_W.field_x) {
                          boolean discarded$15 = ((hnb) this).field_W.a(0, (shb) this);
                          stackOut_53_0 = 1;
                          stackIn_54_0 = stackOut_53_0;
                          return stackIn_54_0 != 0;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      boolean discarded$16 = ((hnb) this).field_L.a(0, (shb) this);
                      stackOut_48_0 = 1;
                      stackIn_49_0 = stackOut_48_0;
                      return stackIn_49_0 != 0;
                    }
                  }
                } else {
                  if (var6 != 98) {
                    if (var6 != 99) {
                      break L5;
                    } else {
                      L7: {
                        if (var5 == (Object) (Object) ((hnb) this).field_O) {
                          break L7;
                        } else {
                          if ((Object) (Object) ((hnb) this).field_R == var5) {
                            break L7;
                          } else {
                            if ((Object) (Object) ((hnb) this).field_L == var5) {
                              L8: {
                                if (((hnb) this).field_W.field_x) {
                                  boolean discarded$17 = ((hnb) this).field_W.a(param0 + 15834, (shb) this);
                                  break L8;
                                } else {
                                  boolean discarded$18 = ((hnb) this).field_Q.a(param0 ^ -15834, (shb) this);
                                  break L8;
                                }
                              }
                              stackOut_73_0 = 1;
                              stackIn_74_0 = stackOut_73_0;
                              return stackIn_74_0 != 0;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      boolean discarded$19 = ((hnb) this).field_Q.a(0, (shb) this);
                      stackOut_66_0 = 1;
                      stackIn_67_0 = stackOut_66_0;
                      return stackIn_67_0 != 0;
                    }
                  } else {
                    if ((Object) (Object) ((hnb) this).field_Q == var5) {
                      boolean discarded$20 = ((hnb) this).field_O.a(0, (shb) this);
                      stackOut_57_0 = 1;
                      stackIn_58_0 = stackOut_57_0;
                      return stackIn_58_0 != 0;
                    } else {
                      if ((Object) (Object) ((hnb) this).field_W == var5) {
                        boolean discarded$21 = ((hnb) this).field_L.a(0, (shb) this);
                        stackOut_61_0 = 1;
                        stackIn_62_0 = stackOut_61_0;
                        return stackIn_62_0 != 0;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              } else {
                if (var5 != (Object) (Object) ((hnb) this).field_L) {
                  if ((Object) (Object) ((hnb) this).field_R == var5) {
                    boolean discarded$22 = ((hnb) this).field_O.a(0, (shb) this);
                    stackOut_35_0 = 1;
                    stackIn_36_0 = stackOut_35_0;
                    return stackIn_36_0 != 0;
                  } else {
                    if (var5 != (Object) (Object) ((hnb) this).field_W) {
                      break L5;
                    } else {
                      boolean discarded$23 = ((hnb) this).field_Q.a(0, (shb) this);
                      stackOut_38_0 = 1;
                      stackIn_39_0 = stackOut_38_0;
                      return stackIn_39_0 != 0;
                    }
                  }
                } else {
                  if (((hnb) this).field_R == null) {
                    boolean discarded$24 = ((hnb) this).field_O.a(0, (shb) this);
                    stackOut_31_0 = 1;
                    stackIn_32_0 = stackOut_31_0;
                    return stackIn_32_0 != 0;
                  } else {
                    boolean discarded$25 = ((hnb) this).field_R.a(0, (shb) this);
                    return true;
                  }
                }
              }
            }
            stackOut_75_0 = super.a(-15834, param1, param2, param3);
            stackIn_76_0 = stackOut_75_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_77_0 = var5;
            stackOut_77_1 = new StringBuilder().append("hnb.N(").append(param0).append(44).append(param1).append(44);
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param2 == null) {
              stackOut_79_0 = stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L9;
            } else {
              stackOut_78_0 = stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + 44 + param3 + 41);
        }
        return stackIn_76_0;
    }

    private final htb a(String param0, sba param1, int param2) {
        htb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        htb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        htb stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var4 = new htb(param0, param1);
            var4.field_q = (wwa) (Object) new vva();
            var5 = ((hnb) this).field_f + -46;
            var4.a(15, -16 + (param2 + ((hnb) this).field_h), 30, 1, var5);
            ((hnb) this).b(param2 ^ 18766, (shb) (Object) var4);
            stackOut_0_0 = (htb) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("hnb.W(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 41);
        }
        return stackIn_1_0;
    }

    private final htb m(byte param0) {
        if (!(psb.field_b == null)) {
            return ((hnb) this).field_L;
        }
        if (param0 <= 45) {
            Object var3 = null;
            boolean discarded$0 = hnb.a((byte) -60, (String) null);
        }
        if (efb.field_b != null) {
            if (efb.field_b.field_b) {
                if (!(null == ((hnb) this).field_R)) {
                    return ((hnb) this).field_R;
                }
            }
        }
        return ((hnb) this).field_O;
    }

    private final void g() {
        int var3 = 0;
        htb var4 = null;
        int var5 = VoidHunters.field_G;
        htb[] var6 = ((hnb) this).field_T;
        htb[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_u = ((hnb) this).field_V == var4 ? true : false;
        }
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (((hnb) this).field_V != ((hnb) this).field_O) {
            if (((hnb) this).field_R == ((hnb) this).field_V) {
              int discarded$20 = -95;
              spb.a();
              uga.d(-10128);
              break L0;
            } else {
              if (((hnb) this).field_L == ((hnb) this).field_V) {
                if (null != ((hnb) this).field_P) {
                  var2 = ((hnb) this).field_P.a(0);
                  if (var2 < 0) {
                    ah.a(2, true);
                    ((hnb) this).field_v.a(false, (shb) (Object) new tda(((hnb) this).field_v));
                    break L0;
                  } else {
                    efb.field_b.a(((hnb) this).field_N[var2].field_a, 480, ((hnb) this).field_N[var2].field_c);
                    ah.a(2, true);
                    ((hnb) this).field_v.a(false, (shb) (Object) new tda(((hnb) this).field_v));
                    break L0;
                  }
                } else {
                  ah.a(2, true);
                  ((hnb) this).field_v.a(false, (shb) (Object) new tda(((hnb) this).field_v));
                  break L0;
                }
              } else {
                break L0;
              }
            }
          } else {
            int discarded$21 = -95;
            spb.a();
            int discarded$22 = 0;
            cf.d();
            break L0;
          }
        }
        if (param0 < -18) {
          ((hnb) this).field_W.field_x = false;
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 <= -72) {
              if (jd.field_p != null) {
                L1: {
                  if (param1.toLowerCase().indexOf(jd.field_p.toLowerCase()) < 0) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("hnb.C(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    static {
    }
}
