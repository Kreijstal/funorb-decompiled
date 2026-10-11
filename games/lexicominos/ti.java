/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends nb implements nf, jk {
    private kf field_E;
    static long field_M;
    private String field_F;
    private rl field_G;
    static db[] field_I;
    private rl field_B;
    private kf field_H;
    private boolean field_K;
    private boolean field_J;
    static eg field_L;
    private boolean field_D;
    private kf field_N;
    static String field_C;

    private final void g(int param0) {
        CharSequence var3;
        if (param0 != 0) {
          var3 = (CharSequence) null;
          ti.a(-118, (CharSequence) null, -52, true);
        }
        if (sg.a(false) ||
          !(0 >= this.field_G.field_u.length()) &&
          !(0 >= this.field_B.field_u.length())) {
          ha.a(this.field_G.field_u, this.field_B.field_u, param0 ^ -111);
        }
    }

    public final void a(byte param0, rl param1) {
        try {
          if (param0 != 10) {
            field_M = 116L;
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ti.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, (byte) 107)) {
            return true;
          }
          var5_int = -37 % ((-13 - param3) / 55);
          if (param1 == 98) {
            stackIn_6_0 = this.a(0, param2);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.c((byte) 119, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ti.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, String param1) {
        rl var3 = null;
        String var4 = null;
        try {
          if (param0 != 3) {
            this.field_G = (rl) null;
          }
          var3 = this.field_G;
          var4 = param1;
          var3.a(var4, param0 - 4, false);
          this.field_B.j(0);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ti.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(rl param0, boolean param1) {
        if (this.field_G == param0) {
          this.field_B.a((byte) 44, (w) (this));
        }
        if (!param1) {
          return;
        }
        try {
          if (this.field_B == param0) {
            this.g(0);
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ti.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(int param0, CharSequence param1, int param2, boolean param3) {
        int var9 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 >= 2 &&
            param0 <= 36) {
            var4_int = 30 % ((-72 - param2) / 54);
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            for (var9 = 0; var9 < var8; var9++) {
              boolean decompiledFrameRemainder0 = true;
              var10 = param1.charAt(var9);
              if ((var9 == 0) &&
                (var10 == 45)) {
                var5 = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var9 != 0 || (var10 != 43 ||
                !param3))) {
                if (var10 >= 48 &&
                  var10 <= 57) {
                  var10 -= 48;
                } else if (var10 >= 65 &&
                  var10 <= 90) {
                  var10 -= 55;
                } else if (var10 >= 97 &&
                  var10 <= 122) {
                  var10 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var10 >= param0) {
                  throw new NumberFormatException();
                }
                if (var5 != 0) {
                  var10 = -var10;
                }
                var11 = var10 + param0 * var7;
                if (var11 / param0 != var7) {
                  throw new NumberFormatException();
                }
                var6 = 1;
                var7 = var11;
              }
            }
            if (var6 == 0) {
              throw new NumberFormatException();
            }
            stackIn_39_0 = var7;
            return stackIn_39_0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("ti.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static jb[] a(byte param0) {
        int var2 = 0;
        int var3 = Lexicominos.field_L ? 1 : 0;
        jb[] var1 = new jb[th.field_t];
        for (var2 = 0; th.field_t > var2; var2++) {
          var1[var2] = new jb(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], be.field_f[var2], ci.field_b);
        }
        if (param0 <= 103) {
          field_M = -84L;
        }
        gk.a(12428);
        return var1;
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param4 == this.field_N) {
            this.g(0);
          } else {
            if (param4 == this.field_H) {
              bg.a(false);
            } else {
              if (this.field_E == param4) {
                if (!this.field_J) {
                  if (this.field_D) {
                    ga.b(0);
                  } else {
                    ld.i(param2 ^ -215531225);
                  }
                } else {
                  vi.a((byte) 115);
                }
              }
            }
          }
          if (param2 != 215535458) {
            field_L = (eg) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("ti.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final String e(byte param0) {
        int var2 = -19 % ((-3 - param0) / 60);
        if (this.field_G.field_u == null) {
          return "";
        }
        return this.field_G.field_u;
    }

    ti(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (rd) null);
        jf dupTemp$0 = null;
        jf dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        kf stackIn_17_1 = null;
        kf stackIn_17_2 = null;
        kf stackIn_18_1 = null;
        kf stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        v var6 = null;
        RuntimeException var6_ref = null;
        le var7 = null;
        String var8 = null;
        m var9 = null;
        jf var12 = null;
        jf var13 = null;
        try {
          this.field_F = param1;
          stackIn_4_1 = (param4);
          this.field_D = stackIn_4_1;
          stackIn_7_1 = (param3);
          this.field_K = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_J = stackIn_10_1;
          if (this.field_J && (this.field_K ||
            this.field_D)) {
            throw new IllegalStateException();
          }
          this.field_G = (rl) ((Object) new cl(param0, (vd) (this), 100));
          this.field_B = (rl) ((Object) new cl("", (vd) (this), 20));
          if (this.field_J) {
            this.field_N = new kf(og.field_j, (vd) null);
            this.field_E = new kf(jd.field_d, (vd) null);
            this.field_G.field_D = false;
          } else {
            this.field_N = new kf(be.field_i, (vd) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (this.field_D) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = a.field_f;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = a.field_e;
            }
            this.field_E = new kf(stackIn_18_3, (vd) null);
            if (this.field_K) {
              this.field_H = new kf(ri.field_d, (vd) (this));
            }
          }
          this.field_G.field_i = (rd) ((Object) new id(10000536));
          this.field_B.field_i = (rd) ((Object) new di(10000536));
          var6 = new v();
          this.field_N.field_i = (rd) ((Object) var6);
          if (this.field_E != null) {
            this.field_E.field_i = (rd) ((Object) var6);
          }
          this.field_G.field_q = ib.field_i;
          if (this.field_H != null) {
            this.field_H.field_i = (rd) ((Object) var6);
          }
          if (null != this.field_H) {
            this.field_H.field_q = hi.field_a;
          }
          if (!this.field_J) {
            if (!this.field_D) {
              this.field_E.field_i = (rd) ((Object) new uj());
            } else {
              this.field_E.field_q = il.field_a;
              this.field_E.field_i = (rd) ((Object) new uj());
            }
          } else {
            this.field_E.field_q = ig.field_d;
          }
          this.field_o = 15;
          var7 = ql.field_Q;
          if (null != this.field_F) {
            this.field_o = this.field_o + (5 + var7.a(this.field_F, this.field_j - 40, var7.field_E));
          }
          var8 = nb.field_y;
          var9 = kb.a((byte) -31, kk.c(-14047));
          if (var9 == bb.field_J) {
            var8 = fg.field_d;
          } else {
            if (var9 == mh.field_B) {
              var8 = ah.field_a;
            }
          }
          dupTemp$0 = new jf(10, this.field_o, this.field_j - 20, 25, this.field_G, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b((byte) 125, dupTemp$0);
          this.field_o = this.field_o + (5 + ((w) ((Object) var12)).field_v);
          dupTemp$1 = new jf(10, this.field_o, -20 + this.field_j, 25, this.field_B, false, 80, 3, var7, 16777215, p.field_b);
          var13 = dupTemp$1;
          this.b((byte) -100, dupTemp$1);
          this.field_N.field_r = (vd) (this);
          this.field_o = this.field_o + (((w) ((Object) var13)).field_v + 5);
          if (null != this.field_H) {
            this.field_H.field_r = (vd) (this);
          }
          if (null != this.field_E) {
            this.field_E.field_r = (vd) (this);
          }
          if (this.field_H == null) {
            this.field_N.a(30, -6 + this.field_j - 10, true, this.field_o, 8);
            this.field_o = this.field_o + 35;
          } else {
            this.field_N.a(30, -95 + this.field_j, true, this.field_o, 85);
            this.field_o = this.field_o + 60;
          }
          if (null != this.field_H) {
            this.field_H.a(30, -10 + (-6 + this.field_j), true, this.field_o, 8);
            this.field_o = this.field_o + 35;
          }
          if (this.field_E != null) {
            if (!this.field_J &&
              !this.field_D) {
              this.field_E.a(20, 40, true, this.field_o, 8);
              this.field_o = this.field_o + 25;
            } else {
              this.field_E.a(30, -16 + this.field_j, true, this.field_o, 8);
              this.field_o = this.field_o + 35;
            }
          }
          this.a(3 + this.field_o, this.field_j, true, 0, 0);
          this.b((byte) 67, this.field_N);
          if (this.field_H != null) {
            this.b((byte) -77, this.field_H);
          }
          if (this.field_E != null) {
            this.b((byte) -112, this.field_E);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ti.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void d(byte param0) {
        this.field_G.j(0);
        this.field_B.j(0);
        if (param0 > -59) {
          CharSequence var3 = (CharSequence) null;
          ti.a(-96, (CharSequence) null, 81, true);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (null != this.field_F) {
          ql.field_Q.a(this.field_F, 20 + (this.field_t + param2), 15 + (param1 + this.field_o), this.field_j - 40, this.field_v, 16777215, -1, 1, 0, ql.field_Q.field_E);
        }
        if (this.field_H != null) {
          lf.a(param2 + 10, param1 + 134, this.field_j - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public static void e(boolean param0) {
        field_I = null;
        field_C = null;
        field_L = null;
        if (param0) {
          field_L = (eg) null;
        }
    }

    static {
        field_C = "Confirm Email:";
    }
}
