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
        int var6 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        htb[] var5 = null;
        RuntimeException var5_ref = null;
        htb var7 = null;
        int var8 = 0;
        htb[] var9 = null;
        var8 = VoidHunters.field_G;
        try {
          super.a(param0, param1, param2 ^ 0, param3);
          if (upb.field_c) {
            param3.f((byte) -34);
            var9 = this.field_T;
            var5 = var9;
            for (var6 = 0; var9.length > var6; var6++) {
              var7 = var9[var6];
              if (var7.field_e) {
                var7.a(0, (shb) (this));
              }
            }
          }
          if (!this.field_J &&
            !fda.e((byte) 124)) {
            this.l((byte) -118);
            this.field_v.a(false, new hnb(this.field_v));
          }
          if (param2 != -981) {
            field_U = (phb[]) null;
          }
          if (null != this.field_P) {
            stackIn_16_0 = (this.field_P.h(0)) ? 0 : 1;
            if (stackIn_16_0 != (this.field_M ? 1 : 0)) {
              return;
            }
            this.a(true, this.field_L);
            this.field_M = this.field_P.h(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("hnb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void a(boolean param0, htb param1) {
        htb var3 = null;
        int var4 = 0;
        fm var5 = null;
        htb stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.field_V = param1;
          if (!param0) {
            return;
          }
          param1.a(0, (shb) (this));
          var3 = this.m((byte) 62);
          stackIn_4_0 = this.field_W;
          stackIn_5_1 = (var3 != param1);
          stackIn_4_0.field_x = stackIn_5_1;
          if (param1 == this.field_L) {
            if (var3 == param1) {
              if (this.field_P != null) {
                var4 = this.field_P.a(0);
                var5 = this.field_N[var4];
                if (efb.field_b.field_q == var5.field_c &&
                  efb.field_b.field_e == var5.field_a) {
                  this.g(-99);
                  return;
                }
                this.field_W.field_x = true;
              }
              this.g(-99);
            } else {
              this.g(-99);
            }
          } else {
            this.g(-99);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("hnb.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void l(byte param0) {
        if (!this.field_z) {
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
        int var7_int = 0;
        boolean stackIn_31_1 = false;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        boolean stackIn_40_1 = false;
        int stackIn_48_0 = 0;
        Object stackIn_50_0;
        usb stackIn_50_1;
        usb stackIn_50_2;
        int stackIn_50_3;
        Object stackIn_51_0;
        usb stackIn_52_1 = null;
        usb stackIn_52_2 = null;
        int stackIn_52_4 = 0;
        int stackIn_57_1 = 0;
        String stackIn_74_0 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
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
        shb var7 = null;
        fm var8 = null;
        String var10 = null;
        Object stackIn_50_0Lifetime1;
        usb stackIn_52_1Lifetime1;
        usb stackIn_52_2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime2;
        try {
          this.field_N = dtb.a(bm.field_o, -30334);
          if (0 < this.field_N.length) {
            for (var2_int = 0; var2_int < this.field_N.length; var2_int++) {
              if (null != this.field_N[var2_int]) {
                for (var3 = 1 + var2_int; this.field_N.length > var3; var3++) {
                  if (null != this.field_N[var3] &&
                    this.field_N[var3].field_c == this.field_N[var2_int].field_c &&
                    this.field_N[var2_int].field_a == this.field_N[var3].field_a) {
                    this.field_N[var3] = null;
                  }
                }
                if (efb.field_b != null &&
                  this.field_N[var2_int] != null &&
                  !efb.field_b.b(this.field_N[var2_int].field_a, this.field_N[var2_int].field_c, 0)) {
                  this.field_N[var2_int] = null;
                }
              }
            }
            var2_int = 0;
            for (var3Lifetime2 = 0; this.field_N.length > var3Lifetime2; var3Lifetime2++) {
              if (this.field_N[var3Lifetime2] != null) {
                var2_int++;
              }
            }
            var3_ref_fm__ = this.field_N;
            this.field_N = new fm[var2_int];
            var4 = 0;
            for (var5 = 0; var5 < var3_ref_fm__.length; var5++) {
              if (null != var3_ref_fm__[var5]) {
                incrementValue$0 = var4;
                var4++;
                this.field_N[incrementValue$0] = var3_ref_fm__[var5];
              }
            }
            tw.a(this.field_N, (byte) 62);
          }
          stackIn_31_1 = !(this.field_N.length <= 0);
          this.field_K = stackIn_31_1;
          stackIn_34_0 = (!oq.c((byte) 114)) ? 0 : 1;
          var2_intLifetime1 = stackIn_34_0;
          stackIn_37_0 = (var2_intLifetime1 == 0) ? 2 : 3;
          var3Lifetime1 = stackIn_37_0;
          stackIn_40_1 = !(fda.e((byte) 110));
          this.field_J = stackIn_40_1;
          if (var2_intLifetime1 == 0) {
            if (efb.field_b != null) {
              stackIn_48_0 = (efb.field_b.b((byte) -17)) ? 1 : 0;
            } else {
              stackIn_48_0 = 0;
            }
          } else {
            stackIn_48_0 = 0;
          }
          boolean decompiledFrameRemainder0 = true;
          var4Lifetime1 = stackIn_48_0;
          stackIn_50_0 = this;
          stackIn_50_1 = null;
          stackIn_50_2 = null;
          stackIn_50_3 = 10;
          if (var2_intLifetime1 == 0) {
            stackIn_51_0 = this;
            stackIn_50_0Lifetime1 = stackIn_51_0;
            if (var4Lifetime1 == 0) {
              stackIn_52_1 = null;
              stackIn_52_2 = null;
              stackIn_52_4 = 75;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_52_1Lifetime1 = null;
            stackIn_52_2Lifetime1 = null;
            stackIn_52_4 = 58;
          }
          this.field_S = new usb(stackIn_50_3, stackIn_52_4, 410, 105, (wwa) null, var3Lifetime1, 1);
          this.field_S.field_w = 83;
          this.field_S.c(-6, 5, 5);
          this.b(-18756, this.field_S);
          this.field_O = this.a(lib.field_q, (byte) 111, (sba) (this), fja.field_q);
          if (var2_intLifetime1 != 0) {
            this.field_R = this.a(bmb.field_b, (byte) 106, (sba) (this), cw.field_p);
          }
          this.field_L = this.a(gk.field_o, (byte) 110, (sba) (this), tw.field_f);
          if (var2_intLifetime1 == 0) {
            stackIn_57_1 = 2;
          } else {
            stackIn_57_1 = 3;
          }
          this.field_T = new htb[stackIn_57_1];
          this.field_T[1] = this.field_L;
          if (var2_intLifetime1 != 0) {
            this.field_T[2] = this.field_R;
          }
          this.field_T[0] = this.field_O;
          if (this.field_K &&
            var2_intLifetime1 != 0) {
            var5_ref_String__ = new String[this.field_N.length];
            var6_int = var5_ref_String__.length - 1;
            for (var7_int = 0; this.field_N.length > var7_int; var7_int++) {
              var8 = this.field_N[var7_int];
              if (psb.field_b != null &&
                var8.field_c == efb.field_b.field_q &&
                var8.field_a == efb.field_b.field_e) {
                var6_int = var7_int;
              }
              var5_ref_String__[var7_int] = var8.field_c + "<times>" + var8.field_a;
            }
            this.field_P = new nva(var5_ref_String__, var6_int, 150);
            this.field_P.a(this.field_L.field_g + this.field_S.field_g, 126, 18, 1, -19 + (this.field_L.field_f + this.field_S.field_r + this.field_L.field_r));
            this.field_t.a(this.field_P, (byte) -55);
          }
          this.field_Q = this.a(wv.field_l, (sba) (this), -14);
          var5Lifetime1 = this.field_Q.field_h / 2 + this.field_Q.field_g;
          this.field_Q.field_h = 150;
          this.field_Q.field_g = -this.field_Q.field_h + (var5Lifetime1 - 20);
          this.field_W = this.a(jdb.field_a, (sba) (this), -14);
          this.field_W.field_h = this.field_Q.field_h;
          this.field_W.field_x = false;
          this.field_W.field_g = var5Lifetime1 + 20;
          if (var2_intLifetime1 != 0 ||
            var4Lifetime1 != 0) {
            if (var2_intLifetime1 != 0) {
              stackIn_74_0 = bkb.field_a;
            } else {
              stackIn_74_0 = fv.field_q;
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
          }
          this.field_M = false;
          var6_ref = this.m((byte) 80);
          if (var6_ref != null) {
            var6_ref.field_u = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_80_0 = var2;
          stackIn_80_1 = new StringBuilder().append("hnb.<init>(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
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
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new htb(param0, param2);
          var5.field_q = (wwa) ((Object) new kab(param3));
          if (param1 < 105) {
            this.field_T = (htb[]) null;
          }
          var6 = this.field_S;
          var7 = var5;
          var6.a((shb) (var7), (byte) -58, var6.field_w);
          this.field_S.a(false);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("hnb.R(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
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
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        sba var8 = null;
        var7 = VoidHunters.field_G;
        try {
          if (param0 != 11) {
            var8 = (sba) null;
            discarded$0 = this.a((String) null, (sba) null, 51);
          }
          if (param3 == this.field_Q) {
            this.l((byte) -31);
          } else {
            if (param3 == this.field_W) {
              this.h(param0 ^ -44);
            } else {
              if (param3 == this.field_O) {
                this.a(true, param3);
              } else {
                if (param3 == this.field_R) {
                  this.a(true, param3);
                } else {
                  if (null != this.field_P) {
                    stackIn_13_0 = (this.field_P.field_e) ? 1 : 0;
                  } else {
                    stackIn_13_0 = 0;
                  }
                  var6_int = stackIn_13_0;
                  if (var6_int == 0 &&
                    this.field_L == param3) {
                    if (!this.field_K) {
                      this.field_v.a(false, new mr(this.field_v, qua.field_a));
                      return;
                    }
                    if (hcb.field_o <= 0) {
                      this.field_v.a(false, new qh(this.field_v));
                      return;
                    }
                    this.a(true, param3);
                    return;
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("hnb.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        boolean stackIn_76_0 = false;
        Object stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        try {
          var5 = null;
          if (param0 != -15834) {
            this.field_T = (htb[]) null;
          }
          if (!this.field_O.e((byte) -120)) {
            if (null != this.field_R &&
              this.field_R.e((byte) -120)) {
              var5 = this.field_R;
            } else {
              if (!this.field_L.e((byte) -120)) {
                if (this.field_Q.e((byte) -120)) {
                  var5 = this.field_Q;
                } else {
                  if (this.field_W.e((byte) -120)) {
                    var5 = this.field_W;
                  } else {
                    if (!this.field_O.field_u) {
                      if (null != this.field_R &&
                        this.field_R.field_u) {
                        var5 = this.field_R;
                      } else {
                        if (this.field_L.field_u) {
                          var5 = this.field_L;
                        }
                      }
                    } else {
                      var5 = this.field_O;
                    }
                  }
                }
              } else {
                var5 = this.field_L;
              }
            }
          } else {
            var5 = this.field_O;
          }
          var6 = param1;
          switch (var6) {
            case 97:
              if (this.field_O == var5) {
                if (null != this.field_R) {
                  this.field_R.a(param0 ^ -15834, (shb) (this));
                } else {
                  this.field_L.a(0, (shb) (this));
                }
                return true;
              }
              if (var5 == this.field_R) {
                this.field_L.a(0, (shb) (this));
                return true;
              }
              if (var5 == this.field_Q &&
                this.field_W.field_x) {
                this.field_W.a(0, (shb) (this));
                return true;
              }
              break;
            case 99:
              if (var5 != this.field_O &&
                this.field_R != var5) {
                if (this.field_L != var5) {
                  break;
                }
                if (this.field_W.field_x) {
                  this.field_W.a(param0 + 15834, (shb) (this));
                } else {
                  this.field_Q.a(param0 ^ -15834, (shb) (this));
                }
                return true;
              }
              this.field_Q.a(0, (shb) (this));
              return true;
            case 98:
              if (this.field_Q == var5) {
                this.field_O.a(0, (shb) (this));
                return true;
              }
              if (this.field_W == var5) {
                this.field_L.a(0, (shb) (this));
                return true;
              }
              break;
            case 96:
              if (var5 == this.field_L) {
                if (this.field_R != null) {
                  this.field_R.a(0, (shb) (this));
                  return true;
                }
                this.field_O.a(0, (shb) (this));
                return true;
              }
              if (this.field_R == var5) {
                this.field_O.a(0, (shb) (this));
                return true;
              }
              if (var5 == this.field_W) {
                this.field_Q.a(0, (shb) (this));
                return true;
              }
              break;
            default:
              break;
          }
          stackIn_76_0 = super.a(-15834, param1, param2, param3);
          return stackIn_76_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("hnb.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw rta.a((Throwable) (stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param3).append(')').toString());
        }
    }

    private final htb a(String param0, sba param1, int param2) {
        htb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        htb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new htb(param0, param1);
          var4.field_q = (wwa) ((Object) new vva());
          var5 = this.field_f - 46;
          var4.a(15, -16 + (param2 + this.field_h), 30, 1, var5);
          this.b(param2 ^ 18766, var4);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("hnb.W(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    private final htb m(byte param0) {
        if (psb.field_b != null) {
          return this.field_L;
        }
        if (param0 <= 45) {
          String var3 = (String) null;
          hnb.a((byte) -60, (String) null);
        }
        if (efb.field_b != null && efb.field_b.field_b &&
          null != this.field_R) {
          return this.field_R;
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
        var3 = VoidHunters.field_G;
        if (this.field_V != this.field_O) {
          if (this.field_R == this.field_V) {
            spb.a((byte) -95);
            uga.d(-10128);
          } else {
            if (this.field_L == this.field_V) {
              if (null != this.field_P) {
                var2 = this.field_P.a(0);
                if (var2 >= 0) {
                  efb.field_b.a(this.field_N[var2].field_a, 480, this.field_N[var2].field_c);
                }
                ah.a(2, true);
                this.field_v.a(false, new tda(this.field_v));
              } else {
                ah.a(2, true);
                this.field_v.a(false, new tda(this.field_v));
              }
            }
          }
        } else {
          spb.a((byte) -95);
          cf.d(0);
        }
        if (param0 >= -18) {
          return;
        }
        this.field_W.field_x = false;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -72) {
            return true;
          }
          if (jd.field_p != null) {
            stackIn_9_0 = !(param1.toLowerCase().indexOf(jd.field_p.toLowerCase()) < 0);
            return stackIn_9_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("hnb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
    }
}
