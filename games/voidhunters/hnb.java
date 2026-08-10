/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int stackIn_16_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        htb[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        htb var7 = null;
        int var8 = 0;
        htb[] var9 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2 ^ 0, param3);
              if (!upb.field_c) {
                break L1;
              } else {
                param3.f((byte) -34);
                var9 = this.field_T;
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
                        var7.a(0, (shb) (this));
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
              if (this.field_J) {
                break L4;
              } else {
                if (fda.e((byte) 124)) {
                  break L4;
                } else {
                  this.l((byte) -118);
                  this.field_v.a(false, new hnb(this.field_v));
                  break L4;
                }
              }
            }
            L5: {
              if (param2 == -981) {
                break L5;
              } else {
                field_U = (phb[]) null;
                break L5;
              }
            }
            L6: {
              L7: {
                if (null == this.field_P) {
                  break L7;
                } else {
                  L8: {
                    if (this.field_P.h(0)) {
                      stackIn_16_0 = 0;
                      break L8;
                    } else {
                      stackIn_16_0 = 1;
                      break L8;
                    }
                  }
                  if (stackIn_16_0 == (this.field_M ? 1 : 0)) {
                    this.a(true, this.field_L);
                    this.field_M = this.field_P.h(0);
                    break L7;
                  } else {
                    break L6;
                  }
                }
              }
              break L6;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5_ref);

            stackIn_22_1 = new StringBuilder().append("hnb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    private final void a(boolean param0, htb param1) {
        htb var3 = null;
        int var4 = 0;
        fm var5 = null;
        htb stackIn_4_0 = null;
        htb stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            this.field_V = param1;
            if (param0) {
              L1: {
                param1.a(0, (shb) (this));
                var3 = this.m((byte) 62);
                stackIn_4_0 = this.field_W;

                if (var3 == param1) {
                  stackIn_5_0 = (htb) ((Object) stackIn_4_0);
                  stackIn_5_1 = 0;
                  break L1;
                } else {
                  stackIn_5_0 = (htb) ((Object) stackIn_4_0);
                  stackIn_5_1 = 1;
                  break L1;
                }
              }
              L2: {
                stackIn_5_0.field_x = stackIn_5_1 != 0;
                if (param1 == this.field_L) {
                  if (var3 == param1) {
                    L3: {
                      if (this.field_P != null) {
                        L4: {
                          var4 = this.field_P.a(0);
                          var5 = this.field_N[var4];
                          if (efb.field_b.field_q != var5.field_c) {
                            break L4;
                          } else {
                            if (efb.field_b.field_e != var5.field_a) {
                              break L4;
                            } else {
                              this.g(-99);
                              break L2;
                            }
                          }
                        }
                        this.field_W.field_x = true;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    this.g(-99);
                    break L2;
                  } else {
                    this.g(-99);
                    break L2;
                  }
                } else {
                  this.g(-99);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("hnb.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void l(byte param0) {
        if (!(this.field_z)) {
            return;
        }
        if (param0 >= -20) {
            return;
        }
        this.field_z = false;
    }

    hnb(ida param0) {
        super(param0, 430, 254);
        int incrementValue$0 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_48_0 = 0;
        Object stackIn_50_0;
        usb stackIn_50_1;
        usb stackIn_50_2;
        int stackIn_50_3;
        Object stackIn_51_0;
        Object stackIn_52_0 = null;
        usb stackIn_52_1 = null;
        usb stackIn_52_2 = null;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        String stackIn_74_0 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fm[] var3_ref_fm__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        String var6 = null;
        htb var6_ref = null;
        int var7_int = 0;
        shb var7 = null;
        fm var8 = null;
        String var10 = null;
        try {
          L0: {
            L1: {
              this.field_N = dtb.a(bm.field_o, -30334);
              if (0 >= this.field_N.length) {
                break L1;
              } else {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= this.field_N.length) {
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (this.field_N.length <= var3) {
                        var3_ref_fm__ = this.field_N;
                        this.field_N = new fm[var2_int];
                        var4 = 0;
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= var3_ref_fm__.length) {
                            tw.a(this.field_N, (byte) 62);
                            break L1;
                          } else {
                            L5: {
                              if (null == var3_ref_fm__[var5]) {
                                break L5;
                              } else {
                                incrementValue$0 = var4;
                                var4++;
                                this.field_N[incrementValue$0] = var3_ref_fm__[var5];
                                break L5;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L6: {
                          if (this.field_N[var3] == null) {
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
                      if (null == this.field_N[var2_int]) {
                        break L7;
                      } else {
                        var3 = 1 + var2_int;
                        L8: while (true) {
                          if (this.field_N.length <= var3) {
                            if (efb.field_b == null) {
                              break L7;
                            } else {
                              if (this.field_N[var2_int] == null) {
                                break L7;
                              } else {
                                if (efb.field_b.b(this.field_N[var2_int].field_a, this.field_N[var2_int].field_c, 0)) {
                                  break L7;
                                } else {
                                  this.field_N[var2_int] = null;
                                  break L7;
                                }
                              }
                            }
                          } else {
                            L9: {
                              if (null == this.field_N[var3]) {
                                break L9;
                              } else {
                                if (this.field_N[var3].field_c != this.field_N[var2_int].field_c) {
                                  break L9;
                                } else {
                                  if (this.field_N[var2_int].field_a != this.field_N[var3].field_a) {
                                    break L9;
                                  } else {
                                    this.field_N[var3] = null;
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
              stackIn_30_0 = this;

              if (-1 <= (this.field_N.length ^ -1)) {
                stackIn_31_0 = this;
                stackIn_31_1 = 0;
                break L10;
              } else {
                stackIn_31_0 = this;
                stackIn_31_1 = 1;
                break L10;
              }
            }
            L11: {
              ((hnb) (this)).field_K = stackIn_31_1 != 0;
              if (!oq.c((byte) 114)) {
                stackIn_34_0 = 0;
                break L11;
              } else {
                stackIn_34_0 = 1;
                break L11;
              }
            }
            L12: {
              var2_int = stackIn_34_0;
              if (var2_int == 0) {
                stackIn_37_0 = 2;
                break L12;
              } else {
                stackIn_37_0 = 3;
                break L12;
              }
            }
            L13: {
              var3 = stackIn_37_0;
              stackIn_39_0 = this;

              if (fda.e((byte) 110)) {
                stackIn_40_0 = this;
                stackIn_40_1 = 0;
                break L13;
              } else {
                stackIn_40_0 = this;
                stackIn_40_1 = 1;
                break L13;
              }
            }
            L14: {
              ((hnb) (this)).field_J = stackIn_40_1 != 0;
              if (var2_int == 0) {
                if (efb.field_b != null) {
                  if (efb.field_b.b((byte) -17)) {
                    stackIn_48_0 = 1;
                    break L14;
                  } else {
                    stackIn_48_0 = 0;
                    break L14;
                  }
                } else {
                  stackIn_48_0 = 0;
                  break L14;
                }
              } else {
                stackIn_48_0 = 0;
                break L14;
              }
            }
            L15: {
              L16: {
                var4 = stackIn_48_0;
                stackIn_50_0 = this;

                stackIn_50_1 = null;

                stackIn_50_2 = null;

                stackIn_50_3 = 10;

                if (var2_int != 0) {
                  break L16;
                } else {
                  stackIn_51_0 = this;
                  stackIn_50_0 = stackIn_51_0;

                  if (var4 == 0) {
                    stackIn_52_0 = this;
                    stackIn_52_1 = null;
                    stackIn_52_2 = null;
                    stackIn_52_3 = stackIn_50_3;
                    stackIn_52_4 = 75;
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
              stackIn_52_0 = this;
              stackIn_52_1 = null;
              stackIn_52_2 = null;
              stackIn_52_3 = stackIn_50_3;
              stackIn_52_4 = 58;
              break L15;
            }
            L17: {
              ((hnb) (this)).field_S = new usb(stackIn_52_3, stackIn_52_4, 410, 105, (wwa) null, var3, 1);
              this.field_S.field_w = 83;
              this.field_S.c(-6, 5, 5);
              this.b(-18756, this.field_S);
              this.field_O = this.a(lib.field_q, (byte) 111, (sba) (this), fja.field_q);
              if (var2_int == 0) {
                break L17;
              } else {
                this.field_R = this.a(bmb.field_b, (byte) 106, (sba) (this), cw.field_p);
                break L17;
              }
            }
            L18: {
              this.field_L = this.a(gk.field_o, (byte) 110, (sba) (this), tw.field_f);
              stackIn_56_0 = this;

              if (var2_int == 0) {
                stackIn_57_0 = this;
                stackIn_57_1 = 2;
                break L18;
              } else {
                stackIn_57_0 = this;
                stackIn_57_1 = 3;
                break L18;
              }
            }
            L19: {
              ((hnb) (this)).field_T = new htb[stackIn_57_1];
              this.field_T[1] = this.field_L;
              if (var2_int == 0) {
                break L19;
              } else {
                this.field_T[2] = this.field_R;
                break L19;
              }
            }
            L20: {
              this.field_T[0] = this.field_O;
              if (!this.field_K) {
                break L20;
              } else {
                if (var2_int == 0) {
                  break L20;
                } else {
                  var5_ref_String__ = new String[this.field_N.length];
                  var6_int = var5_ref_String__.length - 1;
                  var7_int = 0;
                  L21: while (true) {
                    if (this.field_N.length <= var7_int) {
                      this.field_P = new nva(var5_ref_String__, var6_int, 150);
                      this.field_P.a(this.field_L.field_g + this.field_S.field_g, 126, 18, 1, -19 + (this.field_L.field_f + this.field_S.field_r - -this.field_L.field_r));
                      this.field_t.a(this.field_P, (byte) -55);
                      break L20;
                    } else {
                      L22: {
                        var8 = this.field_N[var7_int];
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
                this.field_Q = this.a(wv.field_l, (sba) (this), -14);
                var5 = this.field_Q.field_h / 2 + this.field_Q.field_g;
                this.field_Q.field_h = 150;
                this.field_Q.field_g = -this.field_Q.field_h + (var5 + -20);
                this.field_W = this.a(jdb.field_a, (sba) (this), -14);
                this.field_W.field_h = this.field_Q.field_h;
                this.field_W.field_x = false;
                this.field_W.field_g = var5 + 20;
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
                  stackIn_74_0 = bkb.field_a;
                  break L25;
                } else {
                  stackIn_74_0 = fv.field_q;
                  break L25;
                }
              }
              var10 = stackIn_74_0;
              var6 = var10;
              var7 = new shb(var10, (sba) null);
              var7.field_g = 0;
              var7.field_h = this.field_h;
              var7.field_r = 163;
              var7.field_f = 80;
              var7.field_q = (wwa) ((Object) new bob(loa.field_o, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true));
              this.b(-18756, var7);
              break L23;
            }
            L26: {
              this.field_M = false;
              var6_ref = this.m((byte) 80);
              if (var6_ref == null) {
                break L26;
              } else {
                var6_ref.field_u = true;
                break L26;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var2 = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var2);

            stackIn_80_1 = new StringBuilder().append("hnb.<init>(");

            if (param0 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L27;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L27;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
        }
    }

    private final htb a(String param0, byte param1, sba param2, caa[] param3) {
        htb var5 = null;
        RuntimeException var5_ref = null;
        usb var6 = null;
        htb var7 = null;
        htb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = new htb(param0, param2);
              var5.field_q = (wwa) ((Object) new kab(param3));
              if (param1 >= 105) {
                break L1;
              } else {
                this.field_T = (htb[]) null;
                break L1;
              }
            }
            var6 = this.field_S;
            var7 = var5;
            var6.a((shb) (var7), (byte) -58, var6.field_w);
            this.field_S.a(false);
            stackIn_3_0 = (htb) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("hnb.R(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void i(int param0) {
        if (param0 != 1) {
            field_U = (phb[]) null;
        }
        field_U = null;
        field_X = null;
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        htb discarded$0 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        sba var8 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 11) {
                break L1;
              } else {
                var8 = (sba) null;
                discarded$0 = this.a((String) null, (sba) null, 51);
                break L1;
              }
            }
            L2: {
              if (param3 == this.field_Q) {
                this.l((byte) -31);
                break L2;
              } else {
                if (param3 == this.field_W) {
                  this.h(param0 ^ -44);
                  break L2;
                } else {
                  if (param3 == this.field_O) {
                    this.a(true, param3);
                    break L2;
                  } else {
                    if (param3 == this.field_R) {
                      this.a(true, param3);
                      break L2;
                    } else {
                      L3: {
                        if (null != this.field_P) {
                          if (this.field_P.field_e) {
                            stackIn_13_0 = 1;
                            break L3;
                          } else {
                            stackIn_13_0 = 0;
                            break L3;
                          }
                        } else {
                          stackIn_13_0 = 0;
                          break L3;
                        }
                      }
                      L4: {
                        var6_int = stackIn_13_0;
                        if (var6_int != 0) {
                          break L4;
                        } else {
                          if (this.field_L != param3) {
                            break L4;
                          } else {
                            if (!this.field_K) {
                              this.field_v.a(false, new mr(this.field_v, qua.field_a));
                              break L2;
                            } else {
                              if (-1 <= (hcb.field_o ^ -1)) {
                                this.field_v.a(false, new qh(this.field_v));
                                break L2;
                              } else {
                                this.a(true, param3);
                                break L2;
                              }
                            }
                          }
                        }
                      }
                      break L2;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var6);

            stackIn_28_1 = new StringBuilder().append("hnb.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L5;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
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
        Object stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        Object stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5 = null;
              if (param0 == -15834) {
                break L1;
              } else {
                this.field_T = (htb[]) null;
                break L1;
              }
            }
            L2: {
              if (!this.field_O.e((byte) -120)) {
                L3: {
                  if (null == this.field_R) {
                    break L3;
                  } else {
                    if (!this.field_R.e((byte) -120)) {
                      break L3;
                    } else {
                      var5 = this.field_R;
                      break L2;
                    }
                  }
                }
                if (!this.field_L.e((byte) -120)) {
                  if (this.field_Q.e((byte) -120)) {
                    var5 = this.field_Q;
                    break L2;
                  } else {
                    if (this.field_W.e((byte) -120)) {
                      var5 = this.field_W;
                      break L2;
                    } else {
                      if (!this.field_O.field_u) {
                        L4: {
                          if (null == this.field_R) {
                            break L4;
                          } else {
                            if (!this.field_R.field_u) {
                              break L4;
                            } else {
                              var5 = this.field_R;
                              break L2;
                            }
                          }
                        }
                        if (!this.field_L.field_u) {
                          break L2;
                        } else {
                          var5 = this.field_L;
                          break L2;
                        }
                      } else {
                        var5 = this.field_O;
                        break L2;
                      }
                    }
                  }
                } else {
                  var5 = this.field_L;
                  break L2;
                }
              } else {
                var5 = this.field_O;
                break L2;
              }
            }
            L5: {
              var6 = param1;
              if (var6 != 96) {
                if (-98 == (var6 ^ -1)) {
                  if (this.field_O == var5) {
                    L6: {
                      if (null != this.field_R) {
                        this.field_R.a(param0 ^ -15834, (shb) (this));
                        break L6;
                      } else {
                        this.field_L.a(0, (shb) (this));
                        break L6;
                      }
                    }
                    stackIn_46_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (var5 != this.field_R) {
                      if (var5 != this.field_Q) {
                        break L5;
                      } else {
                        if (this.field_W.field_x) {
                          this.field_W.a(0, (shb) (this));
                          stackIn_54_0 = 1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      this.field_L.a(0, (shb) (this));
                      stackIn_49_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  if (-99 != (var6 ^ -1)) {
                    if (var6 != 99) {
                      break L5;
                    } else {
                      L7: {
                        if (var5 == this.field_O) {
                          break L7;
                        } else {
                          if (this.field_R == var5) {
                            break L7;
                          } else {
                            if (this.field_L == var5) {
                              L8: {
                                if (this.field_W.field_x) {
                                  this.field_W.a(param0 + 15834, (shb) (this));
                                  break L8;
                                } else {
                                  this.field_Q.a(param0 ^ -15834, (shb) (this));
                                  break L8;
                                }
                              }
                              stackIn_74_0 = 1;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      this.field_Q.a(0, (shb) (this));
                      stackIn_67_0 = 1;
                      decompiledRegionSelector0 = 8;
                      break L0;
                    }
                  } else {
                    if (this.field_Q == var5) {
                      this.field_O.a(0, (shb) (this));
                      stackIn_58_0 = 1;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      if (this.field_W == var5) {
                        this.field_L.a(0, (shb) (this));
                        stackIn_62_0 = 1;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              } else {
                if (var5 != this.field_L) {
                  if (this.field_R == var5) {
                    this.field_O.a(0, (shb) (this));
                    stackIn_36_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (var5 != this.field_W) {
                      break L5;
                    } else {
                      this.field_Q.a(0, (shb) (this));
                      stackIn_39_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  if (this.field_R == null) {
                    this.field_O.a(0, (shb) (this));
                    stackIn_32_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    this.field_R.a(0, (shb) (this));
                    return true;
                  }
                }
              }
            }
            stackIn_76_0 = super.a(-15834, param1, param2, param3);
            decompiledRegionSelector0 = 10;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_79_0 = var5;

            stackIn_79_1 = new StringBuilder().append("hnb.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_80_0 = stackIn_79_0;
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L9;
            } else {
              stackIn_80_0 = stackIn_79_0;
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_32_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_36_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_39_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_46_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_49_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_54_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_58_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_62_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_67_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_74_0 != 0;
                          } else {
                            return stackIn_76_0;
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

    private final htb a(String param0, sba param1, int param2) {
        htb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        htb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new htb(param0, param1);
            var4.field_q = (wwa) ((Object) new vva());
            var5 = this.field_f + -46;
            var4.a(15, -16 + (param2 + this.field_h), 30, 1, var5);
            this.b(param2 ^ 18766, var4);
            stackIn_1_0 = (htb) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("hnb.W(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    private final htb m(byte param0) {
        if (!(psb.field_b == null)) {
            return this.field_L;
        }
        if (param0 <= 45) {
            String var3 = (String) null;
            hnb.a((byte) -60, (String) null);
        }
        if (efb.field_b != null && efb.field_b.field_b) {
            if (!(null == this.field_R)) {
                return this.field_R;
            }
        }
        return this.field_O;
    }

    private final void g(int param0) {
        htb discarded$0 = null;
        htb var4 = null;
        int var5 = VoidHunters.field_G;
        htb[] var2 = this.field_T;
        int var3 = 0;
        if (param0 != -99) {
            discarded$0 = this.m((byte) -52);
        }
        while (var3 < var2.length) {
            var4 = var2[var3];
            var4.field_u = this.field_V == var4 ? true : false;
            var3++;
        }
    }

    private final void h(int param0) {
        int var3;
        int var2;
        L0: {
          var3 = VoidHunters.field_G;
          if (this.field_V != this.field_O) {
            if (this.field_R == this.field_V) {
              spb.a((byte) -95);
              uga.d(-10128);
              break L0;
            } else {
              if (this.field_L == this.field_V) {
                if (null != this.field_P) {
                  var2 = this.field_P.a(0);
                  if (-1 < (var2 ^ -1)) {
                    ah.a(2, true);
                    this.field_v.a(false, new tda(this.field_v));
                    break L0;
                  } else {
                    efb.field_b.a(this.field_N[var2].field_a, 480, this.field_N[var2].field_c);
                    ah.a(2, true);
                    this.field_v.a(false, new tda(this.field_v));
                    break L0;
                  }
                } else {
                  ah.a(2, true);
                  this.field_v.a(false, new tda(this.field_v));
                  break L0;
                }
              } else {
                break L0;
              }
            }
          } else {
            spb.a((byte) -95);
            cf.d(0);
            break L0;
          }
        }
        if (param0 < -18) {
          this.field_W.field_x = false;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -72) {
              if (jd.field_p != null) {
                L1: {
                  if ((param1.toLowerCase().indexOf(jd.field_p.toLowerCase()) ^ -1) > -1) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    stackIn_9_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("hnb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    static {
    }
}
