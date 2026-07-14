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
        int var6 = 0;
        htb var7 = null;
        int var8 = 0;
        htb[] var9 = null;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          var8 = VoidHunters.field_G;
          super.a(param0, param1, param2 ^ 0, param3);
          if (upb.field_c) {
            param3.f((byte) -34);
            var9 = ((hnb) this).field_T;
            var5 = var9;
            var6 = 0;
            L1: while (true) {
              if (var9.length > var6) {
                var7 = var9[var6];
                if (var7.field_e) {
                  boolean discarded$1 = var7.a(0, (shb) this);
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              } else {
                if (((hnb) this).field_J) {
                  break L0;
                } else {
                  if (fda.e((byte) 124)) {
                    break L0;
                  } else {
                    this.l((byte) -118);
                    ((hnb) this).field_v.a(false, (shb) (Object) new hnb(((hnb) this).field_v));
                    break L0;
                  }
                }
              }
            }
          } else {
            if (((hnb) this).field_J) {
              break L0;
            } else {
              if (fda.e((byte) 124)) {
                break L0;
              } else {
                this.l((byte) -118);
                ((hnb) this).field_v.a(false, (shb) (Object) new hnb(((hnb) this).field_v));
                break L0;
              }
            }
          }
        }
        L2: {
          if (param2 == -981) {
            break L2;
          } else {
            field_U = null;
            break L2;
          }
        }
        L3: {
          if (null == ((hnb) this).field_P) {
            break L3;
          } else {
            L4: {
              if (((hnb) this).field_P.h(0)) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L4;
              } else {
                stackOut_17_0 = 1;
                stackIn_19_0 = stackOut_17_0;
                break L4;
              }
            }
            if (stackIn_19_0 == (((hnb) this).field_M ? 1 : 0)) {
              this.a(true, ((hnb) this).field_L);
              ((hnb) this).field_M = ((hnb) this).field_P.h(0);
              break L3;
            } else {
              break L3;
            }
          }
        }
    }

    private final void a(boolean param0, htb param1) {
        int var4 = 0;
        fm var5 = null;
        ((hnb) this).field_V = param1;
        if (!param0) {
            return;
        }
        boolean discarded$0 = param1.a(0, (shb) this);
        htb var3 = this.m((byte) 62);
        ((hnb) this).field_W.field_x = var3 != param1 ? true : false;
        if (param1 == ((hnb) this).field_L) {
            if (var3 == param1) {
                if (!(((hnb) this).field_P == null)) {
                    var4 = ((hnb) this).field_P.a(0);
                    var5 = ((hnb) this).field_N[var4];
                    if (efb.field_b.field_q == var5.field_c) {
                        // if_icmpeq L132
                    }
                    ((hnb) this).field_W.field_x = true;
                }
            }
        }
        this.g(-99);
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
        int var2 = 0;
        int var3 = 0;
        fm[] var3_ref_fm__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        htb var6 = null;
        int var7_int = 0;
        shb var7 = null;
        fm var8 = null;
        String var10 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_52_0 = 0;
        Object stackIn_53_0 = null;
        usb stackIn_53_1 = null;
        usb stackIn_53_2 = null;
        int stackIn_53_3 = 0;
        Object stackIn_54_0 = null;
        usb stackIn_54_1 = null;
        usb stackIn_54_2 = null;
        int stackIn_54_3 = 0;
        Object stackIn_55_0 = null;
        usb stackIn_55_1 = null;
        usb stackIn_55_2 = null;
        int stackIn_55_3 = 0;
        Object stackIn_56_0 = null;
        usb stackIn_56_1 = null;
        usb stackIn_56_2 = null;
        int stackIn_56_3 = 0;
        int stackIn_56_4 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        String stackIn_78_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        Object stackOut_52_0 = null;
        usb stackOut_52_1 = null;
        usb stackOut_52_2 = null;
        int stackOut_52_3 = 0;
        Object stackOut_53_0 = null;
        usb stackOut_53_1 = null;
        usb stackOut_53_2 = null;
        int stackOut_53_3 = 0;
        Object stackOut_55_0 = null;
        usb stackOut_55_1 = null;
        usb stackOut_55_2 = null;
        int stackOut_55_3 = 0;
        int stackOut_55_4 = 0;
        Object stackOut_54_0 = null;
        usb stackOut_54_1 = null;
        usb stackOut_54_2 = null;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        String stackOut_77_0 = null;
        String stackOut_76_0 = null;
        L0: {
          ((hnb) this).field_N = dtb.a(bm.field_o, -30334);
          if (0 >= ((hnb) this).field_N.length) {
            break L0;
          } else {
            var2 = 0;
            L1: while (true) {
              if (var2 >= ((hnb) this).field_N.length) {
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (((hnb) this).field_N.length <= var3) {
                    var3_ref_fm__ = ((hnb) this).field_N;
                    ((hnb) this).field_N = new fm[var2];
                    var4 = 0;
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var3_ref_fm__.length) {
                        tw.a(((hnb) this).field_N, (byte) 62);
                        break L0;
                      } else {
                        if (null != var3_ref_fm__[var5]) {
                          var4++;
                          ((hnb) this).field_N[var4] = var3_ref_fm__[var5];
                          var5++;
                          continue L3;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (((hnb) this).field_N[var3] != null) {
                      var2++;
                      var3++;
                      continue L2;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (null != ((hnb) this).field_N[var2]) {
                  var3 = 1 + var2;
                  L4: while (true) {
                    if (((hnb) this).field_N.length <= var3) {
                      if (efb.field_b != null) {
                        if (((hnb) this).field_N[var2] != null) {
                          if (!efb.field_b.b(((hnb) this).field_N[var2].field_a, ((hnb) this).field_N[var2].field_c, 0)) {
                            ((hnb) this).field_N[var2] = null;
                            var2++;
                            continue L1;
                          } else {
                            var2++;
                            continue L1;
                          }
                        } else {
                          var2++;
                          continue L1;
                        }
                      } else {
                        var2++;
                        continue L1;
                      }
                    } else {
                      if (null != ((hnb) this).field_N[var3]) {
                        if (((hnb) this).field_N[var3].field_c == ((hnb) this).field_N[var2].field_c) {
                          if (((hnb) this).field_N[var2].field_a == ((hnb) this).field_N[var3].field_a) {
                            ((hnb) this).field_N[var3] = null;
                            var3++;
                            continue L4;
                          } else {
                            var3++;
                            continue L4;
                          }
                        } else {
                          var3++;
                          continue L4;
                        }
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
        L5: {
          stackOut_32_0 = this;
          stackIn_34_0 = stackOut_32_0;
          stackIn_33_0 = stackOut_32_0;
          if (-1 <= (((hnb) this).field_N.length ^ -1)) {
            stackOut_34_0 = this;
            stackOut_34_1 = 0;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            break L5;
          } else {
            stackOut_33_0 = this;
            stackOut_33_1 = 1;
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            break L5;
          }
        }
        L6: {
          ((hnb) this).field_K = stackIn_35_1 != 0;
          if (!oq.c((byte) 114)) {
            stackOut_37_0 = 0;
            stackIn_38_0 = stackOut_37_0;
            break L6;
          } else {
            stackOut_36_0 = 1;
            stackIn_38_0 = stackOut_36_0;
            break L6;
          }
        }
        L7: {
          var2 = stackIn_38_0;
          if (var2 == 0) {
            stackOut_40_0 = 2;
            stackIn_41_0 = stackOut_40_0;
            break L7;
          } else {
            stackOut_39_0 = 3;
            stackIn_41_0 = stackOut_39_0;
            break L7;
          }
        }
        L8: {
          var3 = stackIn_41_0;
          stackOut_41_0 = this;
          stackIn_43_0 = stackOut_41_0;
          stackIn_42_0 = stackOut_41_0;
          if (fda.e((byte) 110)) {
            stackOut_43_0 = this;
            stackOut_43_1 = 0;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            break L8;
          } else {
            stackOut_42_0 = this;
            stackOut_42_1 = 1;
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            break L8;
          }
        }
        L9: {
          ((hnb) this).field_J = stackIn_44_1 != 0;
          if (var2 == 0) {
            if (efb.field_b != null) {
              if (efb.field_b.b((byte) -17)) {
                stackOut_50_0 = 1;
                stackIn_52_0 = stackOut_50_0;
                break L9;
              } else {
                stackOut_49_0 = 0;
                stackIn_52_0 = stackOut_49_0;
                break L9;
              }
            } else {
              stackOut_47_0 = 0;
              stackIn_52_0 = stackOut_47_0;
              break L9;
            }
          } else {
            stackOut_45_0 = 0;
            stackIn_52_0 = stackOut_45_0;
            break L9;
          }
        }
        L10: {
          L11: {
            var4 = stackIn_52_0;
            stackOut_52_0 = this;
            stackOut_52_1 = null;
            stackOut_52_2 = null;
            stackOut_52_3 = 10;
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_54_2 = stackOut_52_2;
            stackIn_54_3 = stackOut_52_3;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            stackIn_53_2 = stackOut_52_2;
            stackIn_53_3 = stackOut_52_3;
            if (var2 != 0) {
              break L11;
            } else {
              stackOut_53_0 = this;
              stackOut_53_1 = null;
              stackOut_53_2 = null;
              stackOut_53_3 = stackIn_53_3;
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              stackIn_55_3 = stackOut_53_3;
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              stackIn_54_3 = stackOut_53_3;
              if (var4 == 0) {
                stackOut_55_0 = this;
                stackOut_55_1 = null;
                stackOut_55_2 = null;
                stackOut_55_3 = stackIn_55_3;
                stackOut_55_4 = 75;
                stackIn_56_0 = stackOut_55_0;
                stackIn_56_1 = stackOut_55_1;
                stackIn_56_2 = stackOut_55_2;
                stackIn_56_3 = stackOut_55_3;
                stackIn_56_4 = stackOut_55_4;
                break L10;
              } else {
                break L11;
              }
            }
          }
          stackOut_54_0 = this;
          stackOut_54_1 = null;
          stackOut_54_2 = null;
          stackOut_54_3 = stackIn_54_3;
          stackOut_54_4 = 58;
          stackIn_56_0 = stackOut_54_0;
          stackIn_56_1 = stackOut_54_1;
          stackIn_56_2 = stackOut_54_2;
          stackIn_56_3 = stackOut_54_3;
          stackIn_56_4 = stackOut_54_4;
          break L10;
        }
        L12: {
          new usb(stackIn_56_3, stackIn_56_4, 410, 105, (wwa) null, var3, 1);
          ((hnb) this).field_S = stackIn_56_1;
          ((hnb) this).field_S.field_w = 83;
          ((hnb) this).field_S.c(-6, 5, 5);
          ((hnb) this).b(-18756, (shb) (Object) ((hnb) this).field_S);
          ((hnb) this).field_O = this.a(lib.field_q, (byte) 111, (sba) this, fja.field_q);
          if (var2 == 0) {
            break L12;
          } else {
            ((hnb) this).field_R = this.a(bmb.field_b, (byte) 106, (sba) this, cw.field_p);
            break L12;
          }
        }
        L13: {
          ((hnb) this).field_L = this.a(gk.field_o, (byte) 110, (sba) this, tw.field_f);
          stackOut_58_0 = this;
          stackIn_60_0 = stackOut_58_0;
          stackIn_59_0 = stackOut_58_0;
          if (var2 == 0) {
            stackOut_60_0 = this;
            stackOut_60_1 = 2;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            break L13;
          } else {
            stackOut_59_0 = this;
            stackOut_59_1 = 3;
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            break L13;
          }
        }
        L14: {
          ((hnb) this).field_T = new htb[stackIn_61_1];
          ((hnb) this).field_T[1] = ((hnb) this).field_L;
          if (var2 == 0) {
            break L14;
          } else {
            ((hnb) this).field_T[2] = ((hnb) this).field_R;
            break L14;
          }
        }
        L15: {
          ((hnb) this).field_T[0] = ((hnb) this).field_O;
          if (!((hnb) this).field_K) {
            break L15;
          } else {
            if (var2 == 0) {
              break L15;
            } else {
              var5_ref_String__ = new String[((hnb) this).field_N.length];
              var6_int = var5_ref_String__.length - 1;
              var7_int = 0;
              L16: while (true) {
                if (((hnb) this).field_N.length <= var7_int) {
                  ((hnb) this).field_P = new nva((Object[]) (Object) var5_ref_String__, var6_int, 150);
                  ((hnb) this).field_P.a(((hnb) this).field_L.field_g + ((hnb) this).field_S.field_g, 126, 18, 1, -19 + (((hnb) this).field_L.field_f + ((hnb) this).field_S.field_r - -((hnb) this).field_L.field_r));
                  ((hnb) this).field_t.a((ksa) (Object) ((hnb) this).field_P, (byte) -55);
                  break L15;
                } else {
                  L17: {
                    var8 = ((hnb) this).field_N[var7_int];
                    if (psb.field_b == null) {
                      break L17;
                    } else {
                      if (var8.field_c != efb.field_b.field_q) {
                        break L17;
                      } else {
                        if (var8.field_a != efb.field_b.field_e) {
                          break L17;
                        } else {
                          var6_int = var7_int;
                          break L17;
                        }
                      }
                    }
                  }
                  var5_ref_String__[var7_int] = var8.field_c + "<times>" + var8.field_a;
                  var7_int++;
                  continue L16;
                }
              }
            }
          }
        }
        L18: {
          L19: {
            ((hnb) this).field_Q = this.a(wv.field_l, (sba) this, -14);
            var5 = ((hnb) this).field_Q.field_h / 2 + ((hnb) this).field_Q.field_g;
            ((hnb) this).field_Q.field_h = 150;
            ((hnb) this).field_Q.field_g = -((hnb) this).field_Q.field_h + (var5 + -20);
            ((hnb) this).field_W = this.a(jdb.field_a, (sba) this, -14);
            ((hnb) this).field_W.field_h = ((hnb) this).field_Q.field_h;
            ((hnb) this).field_W.field_x = false;
            ((hnb) this).field_W.field_g = var5 + 20;
            if (var2 != 0) {
              break L19;
            } else {
              if (var4 == 0) {
                break L18;
              } else {
                break L19;
              }
            }
          }
          L20: {
            if (var2 != 0) {
              stackOut_77_0 = bkb.field_a;
              stackIn_78_0 = stackOut_77_0;
              break L20;
            } else {
              stackOut_76_0 = fv.field_q;
              stackIn_78_0 = stackOut_76_0;
              break L20;
            }
          }
          var10 = stackIn_78_0;
          var6 = (htb) (Object) var10;
          var7 = new shb(var10, (sba) null);
          var7.field_g = 0;
          var7.field_h = ((hnb) this).field_h;
          var7.field_r = 163;
          var7.field_f = 80;
          var7.field_q = (wwa) (Object) new bob(loa.field_o, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true);
          ((hnb) this).b(-18756, var7);
          break L18;
        }
        L21: {
          ((hnb) this).field_M = false;
          var6 = this.m((byte) 80);
          if (var6 == null) {
            break L21;
          } else {
            var6.field_u = true;
            break L21;
          }
        }
    }

    private final htb a(String param0, byte param1, sba param2, caa[] param3) {
        htb var5 = new htb(param0, param2);
        var5.field_q = (wwa) (Object) new kab(param3);
        if (param1 < 105) {
            ((hnb) this).field_T = null;
        }
        usb var6 = ((hnb) this).field_S;
        htb var7 = var5;
        var6.a((shb) (Object) var7, (byte) -58, var6.field_w);
        ((hnb) this).field_S.a(false);
        return var5;
    }

    public static void i(int param0) {
        if (param0 != 1) {
            field_U = null;
        }
        field_U = null;
        field_X = null;
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (param0 == 11) {
            break L0;
          } else {
            var8 = null;
            htb discarded$2 = this.a((String) null, (sba) null, 51);
            break L0;
          }
        }
        L1: {
          if (param3 == ((hnb) this).field_Q) {
            this.l((byte) -31);
            break L1;
          } else {
            if (param3 == ((hnb) this).field_W) {
              this.h(param0 ^ -44);
              break L1;
            } else {
              if (param3 == ((hnb) this).field_O) {
                this.a(true, param3);
                break L1;
              } else {
                if (param3 == ((hnb) this).field_R) {
                  this.a(true, param3);
                  break L1;
                } else {
                  L2: {
                    if (null != ((hnb) this).field_P) {
                      if (((hnb) this).field_P.field_e) {
                        stackOut_10_0 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        break L2;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_12_0 = stackOut_9_0;
                        break L2;
                      }
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_12_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  var6 = stackIn_12_0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (((hnb) this).field_L != param3) {
                      break L1;
                    } else {
                      if (!((hnb) this).field_K) {
                        ((hnb) this).field_v.a(false, (shb) (Object) new mr(((hnb) this).field_v, qua.field_a));
                        break L1;
                      } else {
                        if (-1 <= (hcb.field_o ^ -1)) {
                          ((hnb) this).field_v.a(false, (shb) (Object) new qh(((hnb) this).field_v));
                          break L1;
                        } else {
                          this.a(true, param3);
                          break L1;
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

    final boolean a(int param0, int param1, shb param2, char param3) {
        htb var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          var5 = null;
          if (param0 == -15834) {
            break L0;
          } else {
            ((hnb) this).field_T = null;
            break L0;
          }
        }
        L1: {
          if (!((hnb) this).field_O.e((byte) -120)) {
            L2: {
              if (null == ((hnb) this).field_R) {
                break L2;
              } else {
                if (!((hnb) this).field_R.e((byte) -120)) {
                  break L2;
                } else {
                  var5 = ((hnb) this).field_R;
                  break L1;
                }
              }
            }
            if (!((hnb) this).field_L.e((byte) -120)) {
              if (((hnb) this).field_Q.e((byte) -120)) {
                var5 = ((hnb) this).field_Q;
                break L1;
              } else {
                if (((hnb) this).field_W.e((byte) -120)) {
                  var5 = ((hnb) this).field_W;
                  break L1;
                } else {
                  if (!((hnb) this).field_O.field_u) {
                    L3: {
                      if (null == ((hnb) this).field_R) {
                        break L3;
                      } else {
                        if (!((hnb) this).field_R.field_u) {
                          break L3;
                        } else {
                          var5 = ((hnb) this).field_R;
                          break L1;
                        }
                      }
                    }
                    if (!((hnb) this).field_L.field_u) {
                      break L1;
                    } else {
                      var5 = ((hnb) this).field_L;
                      break L1;
                    }
                  } else {
                    var5 = ((hnb) this).field_O;
                    break L1;
                  }
                }
              }
            } else {
              var5 = ((hnb) this).field_L;
              break L1;
            }
          } else {
            var5 = ((hnb) this).field_O;
            break L1;
          }
        }
        L4: {
          var6 = param1;
          if (var6 != 96) {
            if (-98 == var6) {
              if (((hnb) this).field_O == var5) {
                L5: {
                  if (null == ((hnb) this).field_R) {
                    boolean discarded$13 = ((hnb) this).field_L.a(0, (shb) this);
                    break L5;
                  } else {
                    boolean discarded$14 = ((hnb) this).field_R.a(param0 ^ -15834, (shb) this);
                    break L5;
                  }
                }
                return true;
              } else {
                if (var5 != ((hnb) this).field_R) {
                  if (var5 != ((hnb) this).field_Q) {
                    break L4;
                  } else {
                    if (((hnb) this).field_W.field_x) {
                      boolean discarded$15 = ((hnb) this).field_W.a(0, (shb) this);
                      return true;
                    } else {
                      break L4;
                    }
                  }
                } else {
                  boolean discarded$16 = ((hnb) this).field_L.a(0, (shb) this);
                  return true;
                }
              }
            } else {
              if (-99 != var6) {
                if (var6 != 99) {
                  break L4;
                } else {
                  L6: {
                    if (var5 == ((hnb) this).field_O) {
                      break L6;
                    } else {
                      if (((hnb) this).field_R == var5) {
                        break L6;
                      } else {
                        if (((hnb) this).field_L == var5) {
                          L7: {
                            if (((hnb) this).field_W.field_x) {
                              boolean discarded$17 = ((hnb) this).field_W.a(param0 + 15834, (shb) this);
                              break L7;
                            } else {
                              boolean discarded$18 = ((hnb) this).field_Q.a(param0 ^ -15834, (shb) this);
                              break L7;
                            }
                          }
                          return true;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  boolean discarded$19 = ((hnb) this).field_Q.a(0, (shb) this);
                  return true;
                }
              } else {
                if (((hnb) this).field_Q == var5) {
                  boolean discarded$20 = ((hnb) this).field_O.a(0, (shb) this);
                  return true;
                } else {
                  if (((hnb) this).field_W == var5) {
                    boolean discarded$21 = ((hnb) this).field_L.a(0, (shb) this);
                    return true;
                  } else {
                    return super.a(-15834, param1, param2, param3);
                  }
                }
              }
            }
          } else {
            if (var5 != ((hnb) this).field_L) {
              if (((hnb) this).field_R == var5) {
                boolean discarded$22 = ((hnb) this).field_O.a(0, (shb) this);
                return true;
              } else {
                if (var5 != ((hnb) this).field_W) {
                  break L4;
                } else {
                  boolean discarded$23 = ((hnb) this).field_Q.a(0, (shb) this);
                  return true;
                }
              }
            } else {
              if (((hnb) this).field_R == null) {
                boolean discarded$24 = ((hnb) this).field_O.a(0, (shb) this);
                return true;
              } else {
                boolean discarded$25 = ((hnb) this).field_R.a(0, (shb) this);
                return true;
              }
            }
          }
        }
        return super.a(-15834, param1, param2, param3);
    }

    private final htb a(String param0, sba param1, int param2) {
        htb var4 = new htb(param0, param1);
        var4.field_q = (wwa) (Object) new vva();
        int var5 = ((hnb) this).field_f + -46;
        var4.a(15, -16 + (param2 + ((hnb) this).field_h), 30, 1, var5);
        ((hnb) this).b(param2 ^ 18766, (shb) (Object) var4);
        return var4;
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

    private final void g(int param0) {
        htb var4 = null;
        int var5 = VoidHunters.field_G;
        htb[] var2 = ((hnb) this).field_T;
        int var3 = 0;
        if (param0 != -99) {
            htb discarded$0 = this.m((byte) -52);
        }
        while (var3 < var2.length) {
            var4 = var2[var3];
            var4.field_u = ((hnb) this).field_V == var4 ? true : false;
            var3++;
        }
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (((hnb) this).field_V != ((hnb) this).field_O) {
            if (((hnb) this).field_R == ((hnb) this).field_V) {
              spb.a((byte) -95);
              uga.d(-10128);
              break L0;
            } else {
              if (((hnb) this).field_L == ((hnb) this).field_V) {
                if (null != ((hnb) this).field_P) {
                  var2 = ((hnb) this).field_P.a(0);
                  if (-1 < (var2 ^ -1)) {
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
            spb.a((byte) -95);
            cf.d(0);
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
        if (param0 > -72) {
            return true;
        }
        if (jd.field_p == null) {
            return false;
        }
        return (param1.toLowerCase().indexOf(jd.field_p.toLowerCase()) ^ -1) <= -1 ? true : false;
    }

    static {
    }
}
