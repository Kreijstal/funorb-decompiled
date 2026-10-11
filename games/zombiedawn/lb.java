/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends pn implements hh {
    static vn[] field_eb;
    private nh field_hb;
    private an[] field_U;
    private an field_W;
    private re[] field_fb;
    static int field_Y;
    private an field_V;
    private an field_gb;
    private boolean field_cb;
    private an field_bb;
    private boolean field_ab;
    private r field_T;
    static int[] field_db;
    private an field_ib;
    private boolean field_Z;
    private an field_X;

    private final an o(int param0) {
        if (cn.field_b != null) {
          return this.field_V;
        }
        if (param0 != 16) {
          this.field_cb = true;
        }
        if (null != rn.field_b && rn.field_b.field_c &&
          null != this.field_W) {
          return this.field_W;
        }
        return this.field_bb;
    }

    private final an a(byte param0, String param1, sk param2) {
        an var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        an stackIn_2_0 = null;
        an stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new an(param1, param2);
          var4.field_h = (io) ((Object) new vm());
          var5 = this.field_n - 46;
          if (param0 >= -38) {
            stackIn_2_0 = (an) null;
            return stackIn_2_0;
          }
          var4.a(-71, var5, 15, this.field_i - 30, 30);
          this.a((ga) (var4), 10);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("lb.JA(").append(param0).append(',');
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
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void h(byte param0) {
        if (param0 > -63) {
          lb.m(9);
        }
        field_db = null;
        field_eb = null;
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int stackIn_15_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          if (param1 != -6) {
            this.field_fb = (re[]) null;
          }
          if (this.field_X == param2) {
            this.i((byte) -92);
          } else {
            if (param2 == this.field_gb) {
              this.g((byte) -67);
            } else {
              if (param2 != this.field_bb) {
                if (param2 != this.field_W) {
                  if (null != this.field_hb) {
                    stackIn_15_0 = (this.field_hb.field_l) ? 1 : 0;
                  } else {
                    stackIn_15_0 = 0;
                  }
                  var6_int = stackIn_15_0;
                  if (var6_int == 0 &&
                    param2 == this.field_V) {
                    if (!this.field_cb) {
                      this.field_F.a(new i(this.field_F, kb.field_f), true);
                      return;
                    }
                    if (be.field_j > 0) {
                      this.a(param2, -115);
                      return;
                    }
                    this.field_F.a(new kf(this.field_F), true);
                    return;
                  }
                } else {
                  this.a(param2, -104);
                }
              } else {
                this.a(param2, param1 ^ -91);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("lb.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void g(byte param0) {
        int var2;
        int var3;
        an var4;
        var3 = ZombieDawn.field_J;
        if (this.field_bb == this.field_ib) {
          re.a((byte) -71);
          we.w(-55);
        } else {
          if (this.field_ib != this.field_W) {
            if (this.field_ib == this.field_V) {
              if (this.field_hb != null) {
                var2 = this.field_hb.h(0);
                if (0 <= var2) {
                  rn.field_b.a(this.field_fb[var2].field_d, this.field_fb[var2].field_a, 124);
                }
              }
              cn.a(true, false);
              this.field_F.a(new nj(this.field_F), true);
            }
          } else {
            re.a((byte) -71);
            sj.a((byte) 114);
          }
        }
        this.field_gb.field_C = false;
        if (param0 > -46) {
          var4 = (an) null;
          this.a((an) null, -96);
        }
    }

    private final void a(an param0, int param1) {
        an var3 = null;
        int var4 = 0;
        int var5 = 0;
        re var6 = null;
        an stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.field_ib = param0;
          var4 = -49 / ((param1 + 40) / 47);
          param0.a((byte) 68, (ga) (this));
          var3 = this.o(16);
          stackIn_2_0 = this.field_gb;
          stackIn_3_1 = (var3 != param0);
          stackIn_2_0.field_C = stackIn_3_1;
          if (this.field_V == param0) {
            if (var3 == param0) {
              if (null != this.field_hb) {
                var5 = this.field_hb.h(0);
                var6 = this.field_fb[var5];
                if (var6.field_a == rn.field_b.field_t &&
                  rn.field_b.field_i == var6.field_d) {
                  this.n(-18681);
                  return;
                }
                this.field_gb.field_C = true;
                this.n(-18681);
              } else {
                this.n(-18681);
              }
            } else {
              this.n(-18681);
            }
          } else {
            this.n(-18681);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("lb.L(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        int var6 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        an[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        an var7 = null;
        int var8 = 0;
        an[] var9 = null;
        var8 = ZombieDawn.field_J;
        try {
          super.a(param0, (byte) 88, param2, param3);
          if (ll.field_a) {
            param0.c((byte) 57);
            var9 = this.field_U;
            var5 = var9;
            for (var6 = 0; var6 < var9.length; var6++) {
              var7 = var9[var6];
              if (var7.field_l) {
                var7.a((byte) 126, (ga) (this));
              }
            }
          }
          if (!this.field_ab &&
            !po.w(13296)) {
            this.i((byte) -117);
            this.field_F.a(new lb(this.field_F), true);
          }
          if (null != this.field_hb) {
            stackIn_15_0 = (this.field_hb.e((byte) -43)) ? 0 : 1;
            if (stackIn_15_0 == (this.field_Z ? 1 : 0)) {
              this.a(this.field_V, 115);
              this.field_Z = this.field_hb.e((byte) -24);
            }
          }
          var5_int = -47 % ((param1 - 46) / 42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("lb.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        boolean stackIn_73_0 = false;
        Object stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          var5 = null;
          if (this.field_bb.e(-17741)) {
            var5 = this.field_bb;
          } else {
            if (this.field_W != null &&
              this.field_W.e(-17741)) {
              var5 = this.field_W;
            } else {
              if (this.field_V.e(-17741)) {
                var5 = this.field_V;
              } else {
                if (this.field_X.e(-17741)) {
                  var5 = this.field_X;
                } else {
                  if (this.field_gb.e(-17741)) {
                    var5 = this.field_gb;
                  } else {
                    if (!this.field_bb.field_x) {
                      if (null != this.field_W &&
                        this.field_W.field_x) {
                        var5 = this.field_W;
                      } else {
                        if (this.field_V.field_x) {
                          var5 = this.field_V;
                        }
                      }
                    } else {
                      var5 = this.field_bb;
                    }
                  }
                }
              }
            }
          }
          var6 = param1;
          switch (var6) {
            case 97:
              if (var5 == this.field_bb) {
                if (null != this.field_W) {
                  this.field_W.a((byte) 110, (ga) (this));
                } else {
                  this.field_V.a((byte) 111, (ga) (this));
                }
                return true;
              }
              if (var5 == this.field_W) {
                this.field_V.a((byte) 85, (ga) (this));
                return true;
              }
              if (var5 == this.field_X &&
                this.field_gb.field_C) {
                this.field_gb.a((byte) 74, (ga) (this));
                return true;
              }
              break;
            case 99:
              if (var5 != this.field_bb &&
                var5 != this.field_W) {
                if (var5 != this.field_V) {
                  break;
                }
                if (!this.field_gb.field_C) {
                  this.field_X.a((byte) 68, (ga) (this));
                } else {
                  this.field_gb.a((byte) 92, (ga) (this));
                }
                return true;
              }
              this.field_X.a((byte) 116, (ga) (this));
              return true;
            case 98:
              if (var5 == this.field_X) {
                this.field_bb.a((byte) 89, (ga) (this));
                return true;
              }
              if (this.field_gb == var5) {
                this.field_V.a((byte) 102, (ga) (this));
                return true;
              }
              break;
            case 96:
              if (var5 == this.field_V) {
                if (null != this.field_W) {
                  this.field_W.a((byte) 125, (ga) (this));
                  return true;
                }
                this.field_bb.a((byte) 84, (ga) (this));
                return true;
              }
              if (var5 == this.field_W) {
                this.field_bb.a((byte) 125, (ga) (this));
                return true;
              }
              if (var5 == this.field_gb) {
                this.field_X.a((byte) 74, (ga) (this));
                return true;
              }
              break;
            default:
              break;
          }
          var6 = -79 / ((param0 + 83) / 32);
          stackIn_73_0 = super.a(-118, param1, param2, param3);
          return stackIn_73_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_76_0 = var5;
          stackIn_76_1 = new StringBuilder().append("lb.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw sh.a((Throwable) (stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void n(int param0) {
        int var3 = 0;
        an var4 = null;
        int var5 = ZombieDawn.field_J;
        if (param0 != -18681) {
          return;
        }
        an[] var6 = this.field_U;
        an[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.field_x = var4 == this.field_ib ? true : false;
        }
    }

    final static boolean m(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -77) {
          lb.h((byte) 52);
        }
        stackIn_6_0 = (sn.field_c != null) && (ic.field_T.b(-44));
        return stackIn_6_0;
    }

    private final an a(String param0, v[] param1, byte param2, sk param3) {
        an var5 = null;
        RuntimeException var5_ref = null;
        r var6 = null;
        an var7 = null;
        an stackIn_2_0 = null;
        an stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new an(param0, param3);
          var5.field_h = (io) ((Object) new k(param1));
          if (param2 != 32) {
            stackIn_2_0 = (an) null;
            return stackIn_2_0;
          }
          var6 = this.field_T;
          var7 = var5;
          var6.a(0, var7, var6.field_M);
          this.field_T.a(true);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("lb.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    lb(dn param0) {
        super(param0, 430, 254);
        int incrementValue$0 = 0;
        int var7_int = 0;
        boolean stackIn_31_1 = false;
        int stackIn_34_0 = 0;
        boolean stackIn_37_1 = false;
        int stackIn_40_0 = 0;
        int stackIn_48_0 = 0;
        Object stackIn_50_0;
        r stackIn_50_1;
        r stackIn_50_2;
        int stackIn_50_3;
        Object stackIn_51_0;
        r stackIn_52_1 = null;
        r stackIn_52_2 = null;
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
        re[] var3_ref_re__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        String var6 = null;
        an var6_ref = null;
        ga var7 = null;
        re var8 = null;
        String var10 = null;
        Object stackIn_50_0Lifetime1;
        r stackIn_52_1Lifetime1;
        r stackIn_52_2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime2;
        try {
          this.field_fb = ud.a(0, vh.field_a);
          if (this.field_fb.length > 0) {
            for (var2_int = 0; var2_int < this.field_fb.length; var2_int++) {
              if (this.field_fb[var2_int] != null) {
                for (var3 = 1 + var2_int; this.field_fb.length > var3; var3++) {
                  if (null != this.field_fb[var3] &&
                    this.field_fb[var2_int].field_a == this.field_fb[var3].field_a &&
                    this.field_fb[var3].field_d == this.field_fb[var2_int].field_d) {
                    this.field_fb[var3] = null;
                  }
                }
                if (null != rn.field_b &&
                  this.field_fb[var2_int] != null &&
                  !rn.field_b.c(this.field_fb[var2_int].field_d, this.field_fb[var2_int].field_a, 79)) {
                  this.field_fb[var2_int] = null;
                }
              }
            }
            var2_int = 0;
            for (var3Lifetime2 = 0; this.field_fb.length > var3Lifetime2; var3Lifetime2++) {
              if (this.field_fb[var3Lifetime2] != null) {
                var2_int++;
              }
            }
            var3_ref_re__ = this.field_fb;
            this.field_fb = new re[var2_int];
            var4 = 0;
            for (var5 = 0; var3_ref_re__.length > var5; var5++) {
              if (var3_ref_re__[var5] != null) {
                incrementValue$0 = var4;
                var4++;
                this.field_fb[incrementValue$0] = var3_ref_re__[var5];
              }
            }
            wc.a(this.field_fb, 0);
          }
          stackIn_31_1 = !(0 >= this.field_fb.length);
          this.field_cb = stackIn_31_1;
          stackIn_34_0 = (!lm.f((byte) 126)) ? 0 : 1;
          var2_intLifetime1 = stackIn_34_0;
          stackIn_37_1 = !(po.w(13296));
          this.field_ab = stackIn_37_1;
          stackIn_40_0 = (var2_intLifetime1 == 0) ? 2 : 3;
          var3Lifetime1 = stackIn_40_0;
          if (var2_intLifetime1 == 0) {
            if (null != rn.field_b) {
              stackIn_48_0 = (rn.field_b.b(0)) ? 1 : 0;
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
          this.field_T = new r(stackIn_50_3, stackIn_52_4, 410, 105, (io) null, var3Lifetime1, 1);
          this.field_T.field_M = 83;
          this.field_T.a((byte) 106, 5, 5);
          this.a(this.field_T, 10);
          this.field_bb = this.a(vd.field_a, ti.field_e, (byte) 32, (sk) (this));
          if (var2_intLifetime1 != 0) {
            this.field_W = this.a(ma.field_n, li.field_h, (byte) 32, (sk) (this));
          }
          this.field_V = this.a(j.field_j, af.field_c, (byte) 32, (sk) (this));
          if (var2_intLifetime1 != 0) {
            stackIn_57_1 = 3;
          } else {
            stackIn_57_1 = 2;
          }
          this.field_U = new an[stackIn_57_1];
          this.field_U[1] = this.field_V;
          this.field_U[0] = this.field_bb;
          if (var2_intLifetime1 != 0) {
            this.field_U[2] = this.field_W;
          }
          if (this.field_cb &&
            var2_intLifetime1 != 0) {
            var5_ref_String__ = new String[this.field_fb.length];
            var6_int = -1 + var5_ref_String__.length;
            for (var7_int = 0; var7_int < this.field_fb.length; var7_int++) {
              var8 = this.field_fb[var7_int];
              if (cn.field_b != null &&
                rn.field_b.field_t == var8.field_a &&
                rn.field_b.field_i == var8.field_d) {
                var6_int = var7_int;
              }
              var5_ref_String__[var7_int] = var8.field_a + "<times>" + var8.field_d;
            }
            this.field_hb = new nh(var5_ref_String__, var6_int, 150);
            this.field_hb.a(-87, -19 + (this.field_V.field_j + (this.field_T.field_j + this.field_V.field_n)), this.field_V.field_k + this.field_T.field_k, 126, 18);
            this.field_x.a(this.field_hb, -123);
          }
          this.field_X = this.a((byte) -101, lk.field_j, (sk) (this));
          var5Lifetime1 = this.field_X.field_i / 2 + this.field_X.field_k;
          this.field_X.field_i = 150;
          this.field_X.field_k = -20 + (var5Lifetime1 - this.field_X.field_i);
          this.field_gb = this.a((byte) -80, bd.field_h, (sk) (this));
          this.field_gb.field_k = var5Lifetime1 + 20;
          this.field_gb.field_i = this.field_X.field_i;
          this.field_gb.field_C = false;
          if (var2_intLifetime1 != 0 ||
            var4Lifetime1 != 0) {
            if (var2_intLifetime1 != 0) {
              stackIn_74_0 = el.field_h;
            } else {
              stackIn_74_0 = qp.field_a;
            }
            var10 = stackIn_74_0;
            var6 = var10;
            var7 = new ga(var10, (sk) null);
            var7.field_i = this.field_i;
            var7.field_j = 163;
            var7.field_k = 0;
            var7.field_n = 80;
            var7.field_h = (io) ((Object) new vf(ia.field_e, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true));
            this.a(var7, 10);
          }
          this.field_Z = false;
          var6_ref = this.o(16);
          if (var6_ref != null) {
            var6_ref.field_x = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_80_0 = var2;
          stackIn_80_1 = new StringBuilder().append("lb.<init>(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    private final void i(byte param0) {
        if (!this.field_H) {
          return;
        }
        this.field_H = false;
        if (param0 > -87) {
          this.field_ib = (an) null;
        }
    }

    static {
        field_db = new int[8192];
    }
}
