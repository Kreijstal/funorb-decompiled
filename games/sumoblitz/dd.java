/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends hf implements ai {
    private cd[] field_Z;
    private boolean field_S;
    private wp field_O;
    private wp field_Y;
    private wp field_Q;
    private ld field_ab;
    private boolean field_R;
    private wp[] field_V;
    private wp field_X;
    private wp field_T;
    private boolean field_W;
    private nd field_U;
    private wp field_P;

    private final wp g(byte param0) {
        if (null != gk.field_o) {
          return this.field_T;
        }
        if (vv.field_b != null && vv.field_b.field_g &&
          null != this.field_Y) {
          return this.field_Y;
        }
        if (param0 != -2) {
          return (wp) null;
        }
        return this.field_X;
    }

    private final void k(int param0) {
        if (param0 < 3) {
          return;
        }
        if (!this.field_D) {
          return;
        }
        this.field_D = false;
    }

    dd(dg param0) {
        super(param0, 430, 254);
        int incrementValue$0 = 0;
        int var7_int = 0;
        boolean stackIn_31_1 = false;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        boolean stackIn_40_1 = false;
        int stackIn_48_0 = 0;
        Object stackIn_50_0;
        nd stackIn_50_1;
        nd stackIn_50_2;
        int stackIn_50_3;
        Object stackIn_51_0;
        nd stackIn_52_1 = null;
        nd stackIn_52_2 = null;
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
        cd[] var3_ref_cd__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        String var6 = null;
        wp var6_ref = null;
        pk var7 = null;
        cd var8 = null;
        String var10 = null;
        Object stackIn_50_0Lifetime1;
        nd stackIn_52_1Lifetime1;
        nd stackIn_52_2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime2;
        try {
          this.field_Z = ul.a((byte) -110, lt.field_m);
          if (this.field_Z.length > 0) {
            for (var2_int = 0; this.field_Z.length > var2_int; var2_int++) {
              if (this.field_Z[var2_int] != null) {
                for (var3 = var2_int + 1; this.field_Z.length > var3; var3++) {
                  if (this.field_Z[var3] != null &&
                    this.field_Z[var2_int].field_a == this.field_Z[var3].field_a &&
                    this.field_Z[var2_int].field_g == this.field_Z[var3].field_g) {
                    this.field_Z[var3] = null;
                  }
                }
                if (null != vv.field_b &&
                  this.field_Z[var2_int] != null &&
                  !vv.field_b.a(this.field_Z[var2_int].field_g, (byte) -54, this.field_Z[var2_int].field_a)) {
                  this.field_Z[var2_int] = null;
                }
              }
            }
            var2_int = 0;
            for (var3Lifetime2 = 0; var3Lifetime2 < this.field_Z.length; var3Lifetime2++) {
              if (null != this.field_Z[var3Lifetime2]) {
                var2_int++;
              }
            }
            var3_ref_cd__ = this.field_Z;
            this.field_Z = new cd[var2_int];
            var4 = 0;
            for (var5 = 0; var5 < var3_ref_cd__.length; var5++) {
              if (null != var3_ref_cd__[var5]) {
                incrementValue$0 = var4;
                var4++;
                this.field_Z[incrementValue$0] = var3_ref_cd__[var5];
              }
            }
            cb.a(this.field_Z, true);
          }
          stackIn_31_1 = !(this.field_Z.length <= 0);
          this.field_R = stackIn_31_1;
          stackIn_34_0 = (!jt.a((byte) -90)) ? 0 : 1;
          var2_intLifetime1 = stackIn_34_0;
          stackIn_37_0 = (var2_intLifetime1 == 0) ? 2 : 3;
          var3Lifetime1 = stackIn_37_0;
          stackIn_40_1 = !(vs.b((byte) 9));
          this.field_W = stackIn_40_1;
          if (var2_intLifetime1 == 0) {
            if (vv.field_b != null) {
              stackIn_48_0 = (vv.field_b.f(-1)) ? 1 : 0;
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
          this.field_U = new nd(stackIn_50_3, stackIn_52_4, 410, 105, (mh) null, var3Lifetime1, 1);
          this.field_U.field_K = 83;
          this.field_U.c(-1, 5, 5);
          this.a(this.field_U, 93);
          this.field_X = this.a(sb.field_d, (qm) (this), kp.field_b, (byte) -105);
          if (var2_intLifetime1 != 0) {
            this.field_Y = this.a(kn.field_f, (qm) (this), hq.field_c, (byte) 122);
          }
          this.field_T = this.a(sm.field_c, (qm) (this), dj.field_o, (byte) 110);
          if (var2_intLifetime1 != 0) {
            stackIn_57_1 = 3;
          } else {
            stackIn_57_1 = 2;
          }
          this.field_V = new wp[stackIn_57_1];
          this.field_V[0] = this.field_X;
          if (var2_intLifetime1 != 0) {
            this.field_V[2] = this.field_Y;
          }
          this.field_V[1] = this.field_T;
          if (this.field_R &&
            var2_intLifetime1 != 0) {
            var5_ref_String__ = new String[this.field_Z.length];
            var6_int = var5_ref_String__.length - 1;
            for (var7_int = 0; var7_int < this.field_Z.length; var7_int++) {
              var8 = this.field_Z[var7_int];
              if (null != gk.field_o &&
                var8.field_a == vv.field_b.field_s &&
                var8.field_g == vv.field_b.field_c) {
                var6_int = var7_int;
              }
              var5_ref_String__[var7_int] = var8.field_a + "<times>" + var8.field_g;
            }
            this.field_ab = new ld(var5_ref_String__, var6_int, 150);
            this.field_ab.a(-103, this.field_T.field_r + this.field_U.field_r, -19 + (this.field_T.field_p + this.field_U.field_v + this.field_T.field_v), 18, 126);
            this.field_y.a(this.field_ab, -10295);
          }
          this.field_P = this.a(-73, (qm) (this), jh.field_A);
          var5Lifetime1 = this.field_P.field_r + this.field_P.field_q / 2;
          this.field_P.field_q = 150;
          this.field_P.field_r = -20 + var5Lifetime1 - this.field_P.field_q;
          this.field_Q = this.a(-128, (qm) (this), dn.field_a);
          this.field_Q.field_x = false;
          this.field_Q.field_q = this.field_P.field_q;
          this.field_Q.field_r = var5Lifetime1 + 20;
          if (var2_intLifetime1 != 0 ||
            var4Lifetime1 != 0) {
            if (var2_intLifetime1 == 0) {
              stackIn_74_0 = lw.field_c;
            } else {
              stackIn_74_0 = sl.field_e;
            }
            var10 = stackIn_74_0;
            var6 = var10;
            var7 = new pk(var10, (qm) null);
            var7.field_r = 0;
            var7.field_q = this.field_q;
            var7.field_p = 80;
            var7.field_v = 163;
            var7.field_w = (mh) ((Object) new gm(kw.field_b, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true));
            this.a(var7, 125);
          }
          this.field_S = false;
          var6_ref = this.g((byte) -2);
          if (var6_ref != null) {
            var6_ref.field_C = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_80_0 = var2;
          stackIn_80_1 = new StringBuilder().append("dd.<init>(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int stackIn_15_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1 != 710) {
            return;
          }
          if (param2 != this.field_P) {
            if (this.field_Q != param2) {
              if (param2 == this.field_X) {
                this.a(param2, 0);
              } else {
                if (param2 == this.field_Y) {
                  this.a(param2, 0);
                } else {
                  if (this.field_ab != null) {
                    stackIn_15_0 = (this.field_ab.field_k) ? 1 : 0;
                  } else {
                    stackIn_15_0 = 0;
                  }
                  var6_int = stackIn_15_0;
                  if (var6_int == 0 &&
                    param2 == this.field_T) {
                    if (!this.field_R) {
                      this.field_E.a((byte) 98, new u(this.field_E, ku.field_I));
                      return;
                    }
                    if (ct.field_x > 0) {
                      this.a(param2, param1 - 710);
                      return;
                    }
                    this.field_E.a((byte) 115, new kq(this.field_E));
                    return;
                  }
                }
              }
            } else {
              this.h((byte) 103);
            }
          } else {
            this.k(124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("dd.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        lt var4 = null;
        qv var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4 = (lt) (em.field_d.b(-75));
          while (var4 != null) {
            cl.a((byte) -97, var4, param1);
            var4 = (lt) (em.field_d.d((byte) 18));
          }
          var5 = (qv) (ak.field_b.b(109));
          while (var5 != null) {
            ss.a(param1, 1000, var5);
            var5 = (qv) (ak.field_b.d((byte) 18));
          }
          if (param0 != 28778) {
            dd.a(-77, -57);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "dd.W(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        wp discarded$0 = null;
        boolean stackIn_76_0 = false;
        Object stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5 = null;
          if (param2 < 9) {
            var8 = (String) null;
            discarded$0 = this.a((ne[]) null, (qm) null, (String) null, (byte) 16);
          }
          if (!this.field_X.d(-1)) {
            if (null != this.field_Y &&
              this.field_Y.d(-1)) {
              var5 = this.field_Y;
            } else {
              if (!this.field_T.d(-1)) {
                if (this.field_P.d(-1)) {
                  var5 = this.field_P;
                } else {
                  if (!this.field_Q.d(-1)) {
                    if (!this.field_X.field_C) {
                      if (null != this.field_Y &&
                        this.field_Y.field_C) {
                        var5 = this.field_Y;
                      } else {
                        if (this.field_T.field_C) {
                          var5 = this.field_T;
                        }
                      }
                    } else {
                      var5 = this.field_X;
                    }
                  } else {
                    var5 = this.field_Q;
                  }
                }
              } else {
                var5 = this.field_T;
              }
            }
          } else {
            var5 = this.field_X;
          }
          var6 = param3;
          switch (var6) {
            case 96:
              if (this.field_T == var5) {
                if (null == this.field_Y) {
                  this.field_X.a((pk) (this), (byte) 61);
                  return true;
                }
                this.field_Y.a((pk) (this), (byte) 61);
                return true;
              }
              if (var5 == this.field_Y) {
                this.field_X.a((pk) (this), (byte) 61);
                return true;
              }
              if (this.field_Q == var5) {
                this.field_P.a((pk) (this), (byte) 61);
                return true;
              }
              break;
            case 97:
              if (this.field_X == var5) {
                if (this.field_Y != null) {
                  this.field_Y.a((pk) (this), (byte) 61);
                } else {
                  this.field_T.a((pk) (this), (byte) 61);
                }
                return true;
              }
              if (var5 == this.field_Y) {
                this.field_T.a((pk) (this), (byte) 61);
                return true;
              }
              if (var5 == this.field_P &&
                this.field_Q.field_x) {
                this.field_Q.a((pk) (this), (byte) 61);
                return true;
              }
              break;
            case 98:
              if (var5 == this.field_P) {
                this.field_X.a((pk) (this), (byte) 61);
                return true;
              }
              if (this.field_Q == var5) {
                this.field_T.a((pk) (this), (byte) 61);
                return true;
              }
              break;
            case 99:
              if (var5 != this.field_X &&
                var5 != this.field_Y) {
                if (var5 != this.field_T) {
                  break;
                }
                if (!this.field_Q.field_x) {
                  this.field_P.a((pk) (this), (byte) 61);
                } else {
                  this.field_Q.a((pk) (this), (byte) 61);
                }
                return true;
              }
              this.field_P.a((pk) (this), (byte) 61);
              return true;
            default:
              break;
          }
          stackIn_76_0 = super.a(param0, param1, (byte) 98, param3);
          return stackIn_76_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("dd.KA(");
          if (param0 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw qo.a((Throwable) (stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final wp a(ne[] param0, qm param1, String param2, byte param3) {
        wp var5 = null;
        RuntimeException var5_ref = null;
        nd var6 = null;
        wp var7 = null;
        int var8 = 0;
        wp stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new wp(param2, param1);
          var5.field_w = (mh) ((Object) new uv(param0));
          var6 = this.field_U;
          var7 = var5;
          var8 = -20 % ((56 - param3) / 42);
          var6.a(var6.field_K, 0, var7);
          this.field_U.c(false);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("dd.D(");
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
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void e(boolean param0) {
        int var3 = 0;
        wp var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        wp[] var6 = this.field_V;
        wp[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.field_C = var4 == this.field_O ? true : false;
        }
        if (!param0) {
          this.field_Y = (wp) null;
        }
    }

    private final void a(wp param0, int param1) {
        wp var3 = null;
        int var4 = 0;
        cd var5 = null;
        wp stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 != 0) {
            this.h((byte) 113);
          }
          this.field_O = param0;
          param0.a((pk) (this), (byte) 61);
          var3 = this.g((byte) -2);
          stackIn_4_0 = this.field_Q;
          stackIn_5_1 = (param0 != var3);
          stackIn_4_0.field_x = stackIn_5_1;
          if (param0 == this.field_T) {
            if (var3 == param0) {
              if (null != this.field_ab) {
                var4 = this.field_ab.g(param1 - 126);
                var5 = this.field_Z[var4];
                if (var5.field_a == vv.field_b.field_s &&
                  vv.field_b.field_c == var5.field_g) {
                  this.e(true);
                  return;
                }
                this.field_Q.field_x = true;
                this.e(true);
              } else {
                this.e(true);
              }
            } else {
              this.e(true);
            }
          } else {
            this.e(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("dd.O(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void h(byte param0) {
        int var3;
        int var2;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_O == this.field_X) {
          ib.d(1);
          um.b(0);
        } else {
          if (this.field_Y != this.field_O) {
            if (this.field_O == this.field_T &&
              null != this.field_ab) {
              var2 = this.field_ab.g(96);
              if (0 <= var2) {
                vv.field_b.b(this.field_Z[var2].field_g, this.field_Z[var2].field_a, 67);
              }
              rj.a(true, false);
              this.field_E.a((byte) 108, new qk(this.field_E));
            }
          } else {
            ib.d(1);
            ua.f(-5812);
          }
        }
        if (param0 < 65) {
          return;
        }
        this.field_Q.field_x = false;
    }

    private final wp a(int param0, qm param1, String param2) {
        wp var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        wp stackIn_2_0 = null;
        wp stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new wp(param2, param1);
          if (param0 >= -10) {
            stackIn_2_0 = (wp) null;
            return stackIn_2_0;
          }
          var4.field_w = (mh) ((Object) new ue());
          var5 = -46 + this.field_p;
          var4.a(127, 15, var5, 30, this.field_q - 30);
          this.a((pk) (var4), 80);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("dd.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, pk param2, int param3) {
        int var6 = 0;
        wp[] var5 = null;
        int var5_int = 0;
        wp var7 = null;
        int var8 = 0;
        wp[] var9 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          super.a(param0, 124, param2, param3);
          if (sl.field_d) {
            param2.c((byte) 120);
            var9 = this.field_V;
            var5 = var9;
            for (var6 = 0; var9.length > var6; var6++) {
              var7 = var9[var6];
              if (var7.field_k) {
                var7.a((pk) (this), (byte) 61);
              }
            }
          }
          var5_int = 69 % ((-25 - param1) / 45);
          if (!this.field_W &&
            !vs.b((byte) 9)) {
            this.k(84);
            this.field_E.a((byte) 124, new dd(this.field_E));
          }
          if (this.field_ab != null &&
            this.field_ab.i(20) != this.field_S) {
            this.a(this.field_T, 0);
            this.field_S = this.field_ab.i(20);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_18_0 = var5_ref;
          stackIn_18_1 = new StringBuilder().append("dd.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
