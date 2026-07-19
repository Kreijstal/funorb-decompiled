/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends wj implements qu, vh, ur {
    private mr field_E;
    static ut[][][] field_C;
    static ut field_H;
    private wi field_Q;
    private wi field_F;
    private mr field_K;
    static vl field_I;
    static String field_P;
    static int field_G;
    static String field_M;
    private lb field_R;
    private mr field_N;
    static tv field_D;
    private mr field_S;
    private mr field_T;
    private mr field_J;
    private qk field_O;
    fr field_L;

    final void a(byte param0, fd param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_Q.field_y = this.k(-123);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ae.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static ut a(boolean param0, byte param1, int param2, int param3, int param4) {
        ut var5 = null;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int[] var8_ref_int__ = null;
        int var9 = 0;
        ut var9_ref_ut = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ut var13 = null;
        ut var14 = null;
        ut var15 = null;
        ut var16 = null;
        ut var17 = null;
        ut var18 = null;
        ut var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        ut stackIn_6_2 = null;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        ut stackIn_9_2 = null;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        ut stackIn_12_2 = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        ut stackOut_5_2 = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        ut stackOut_4_2 = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        ut stackOut_8_2 = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        ut stackOut_7_2 = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        ut stackOut_11_2 = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        ut stackOut_10_2 = null;
        L0: {
          var11 = Kickabout.field_G;
          var6 = 0;
          if ((param3 ^ -1) == 0) {
            var17 = nm.a(param4, -74, ll.field_m);
            var5 = var17;
            iw.a(param1 + 13, var17);
            break L0;
          } else {
            if (1 != (param3 ^ -1)) {
              L1: {
                stackOut_3_0 = param4;
                stackOut_3_1 = param1 + -62;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                if (param0) {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = gu.field_zb;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  break L1;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = uv.field_m;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  break L1;
                }
              }
              L2: {
                var14 = nm.a(stackIn_6_0, stackIn_6_1, stackIn_6_2);
                stackOut_6_0 = param4;
                stackOut_6_1 = -95;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = (ut) (field_H);
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = uj.field_B;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              L3: {
                var16 = nm.a(stackIn_9_0, stackIn_9_1, stackIn_9_2);
                stackOut_9_0 = param4;
                stackOut_9_1 = -113;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (!param0) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = mf.field_Cb;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = fv.field_b;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              var9_ref_ut = nm.a(stackIn_12_0, stackIn_12_1, stackIn_12_2);
              var15 = new ut(param3, var14.field_v);
              var5 = var15;
              iw.a(-116, var15);
              var9_ref_ut.d(var15.field_o - var9_ref_ut.field_o, 0);
              var10 = var14.field_o;
              L4: while (true) {
                if (var10 >= var15.field_o - var9_ref_ut.field_o) {
                  var6 = 1;
                  var14.d(0, 0);
                  break L0;
                } else {
                  var16.d(var10, 0);
                  var10 = var10 + var16.field_o;
                  continue L4;
                }
              }
            } else {
              var13 = nm.a(param4, -85, lb.field_L);
              var5 = var13;
              iw.a(98, var13);
              break L0;
            }
          }
        }
        L5: {
          L6: {
            pt.a(-3 + on.field_g, -22914, 3, on.field_f - 3, 3);
            if (-1 != (param2 ^ -1)) {
              break L6;
            } else {
              if (var6 == 0) {
                var25 = new int[64];
                var22 = var25;
                var7_ref_int__ = var22;
                var12 = 0;
                var8 = var12;
                L7: while (true) {
                  if (var12 >= var25.length) {
                    nh.a(10, 6, on.field_g + -10, 6, 6, 8, var25);
                    nh.a(10, 8, on.field_g + -10, 8, 6, 8, var25);
                    break L5;
                  } else {
                    var7_ref_int__[var12] = 263172 * var12;
                    var12++;
                    continue L7;
                  }
                }
              } else {
                break L6;
              }
            }
          }
          if (1 == param2) {
            iw.a(109, var5);
            var5.c(0, 0, 60);
            ta.e(param1 + 174);
            var24 = new int[64];
            var21 = var24;
            var7_ref_int__ = var21;
            var8 = 0;
            L8: while (true) {
              if (var24.length <= var8) {
                nh.a(4, 6, on.field_g - 4, 6, 8, -40 + var24.length, var24);
                break L5;
              } else {
                var7_ref_int__[var8] = 197379 * var8;
                var8++;
                continue L8;
              }
            }
          } else {
            if (2 != param2) {
              if (3 == param2) {
                nh.a(var5, 0.0, 0.0, 0.7);
                break L5;
              } else {
                break L5;
              }
            } else {
              ta.e(param1 ^ -69);
              ta.e(123);
              var19 = var5;
              var18 = new ut(var5.field_o, var5.field_v);
              var5 = var18;
              iw.a(-45, var18);
              eo.a(var19, 0, 0, 230);
              pt.a(-3 + on.field_g, -22914, 3, on.field_f + -3, 3);
              var23 = new int[64];
              var20 = var23;
              var8_ref_int__ = var20;
              var9 = 0;
              L9: while (true) {
                if (var9 >= var23.length) {
                  nh.a(4, 6, on.field_g, 6, 8, -40 + var23.length, var23);
                  break L5;
                } else {
                  var8_ref_int__[var9] = 197379 * var9;
                  var9++;
                  continue L9;
                }
              }
            }
          }
        }
        L10: {
          ta.e(117);
          if (param3 != -1) {
            if (1 == (param3 ^ -1)) {
              ap.field_l.c(0, 0, 16);
              break L10;
            } else {
              if (!param0) {
                tt.field_e.c(0, 0, 16);
                pt.a(on.field_g + -cg.field_K.field_o, -22914, 0, on.field_f, 0);
                var7 = tt.field_e.field_o;
                L11: while (true) {
                  if (on.field_g + -cg.field_K.field_o <= var7) {
                    ta.e(124);
                    cg.field_K.c(var5.field_o + -cg.field_K.field_o, 0, 16);
                    break L10;
                  } else {
                    ah.field_l.c(var7, 0, 16);
                    var7 = var7 + ah.field_l.field_o;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            }
          } else {
            kh.field_r.c(0, 0, 16);
            break L10;
          }
        }
        L12: {
          if (param1 == -52) {
            break L12;
          } else {
            field_D = (tv) null;
            break L12;
          }
        }
        ta.e(117);
        return var5;
    }

    private final int a(int param0, String param1, int param2, int param3, fd param4) {
        cg var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_3_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
        try {
          L0: {
            L1: {
              if (param2 == 21621) {
                break L1;
              } else {
                this.field_Q = (wi) null;
                break L1;
              }
            }
            var6 = new cg(20, param3, param0 + 120, 25, param4, false, 120, 3, gf.field_a, 16777215, param1);
            this.a(-54, var6);
            stackOut_2_0 = var6.field_i;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var6_ref);
            stackOut_4_1 = new StringBuilder().append("ae.CB(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public ae() {
        super(0, 0, 496, 0, (gj) null);
        this.field_E = new mr("", (jv) null, 12);
        this.field_S = new mr("", (jv) null, 100);
        this.field_K = new mr("", (jv) null, 100);
        this.field_T = new mr("", (jv) null, 20);
        this.field_N = new mr("", (jv) null, 20);
        this.field_J = new mr("", (jv) null, 3);
        int var1 = 1;
        this.field_O = new qk("", (jv) null, var1 != 0);
        this.field_Q = new wi(ph.field_c, (jv) null);
        this.field_F = new wi(vb.field_e, (jv) null);
        this.field_E.field_u = sr.field_b;
        this.field_S.field_u = gi.field_Bb;
        this.field_K.field_u = aw.field_G;
        this.field_T.field_u = od.field_o;
        this.field_N.field_u = hd.field_Z;
        this.field_J.field_u = lu.field_r;
        this.field_O.field_u = le.field_b;
        this.field_E.a(6, new bv(this.field_E));
        this.field_S.a(6, new qo(this.field_S));
        this.field_K.a(6, new mh(this.field_K, this.field_S));
        this.field_T.a(6, new lo(this.field_T, this.field_E, this.field_S));
        this.field_N.a(6, new ge(this.field_N, this.field_T));
        this.field_J.a(6, new fo(this.field_J));
        this.field_Q.field_y = false;
        this.field_Q.field_r = (gj) ((Object) new op());
        this.field_F.field_r = (gj) ((Object) new cr());
        this.field_E.field_r = (gj) ((Object) new ri(10000536));
        ri dupTemp$0 = new ri(10000536);
        this.field_K.field_r = (gj) ((Object) dupTemp$0);
        this.field_S.field_r = (gj) ((Object) dupTemp$0);
        this.field_J.field_r = (gj) ((Object) new ri(10000536));
        this.field_O.field_r = (gj) ((Object) new mn());
        rp dupTemp$1 = new rp(10000536);
        this.field_N.field_r = (gj) ((Object) dupTemp$1);
        this.field_T.field_r = (gj) ((Object) dupTemp$1);
        String var2 = vo.a((byte) -18, mf.field_Ab, new String[]{this.b(true), this.l(6)});
        int var3 = 20;
        var3 = var3 + this.a(170, si.field_i, 21621, var3, this.field_S);
        var3 = var3 + (5 + this.a(20, true, ah.field_n, this.field_K, 170, "", var3));
        var3 = var3 + this.a(170, at.field_Ib, 21621, var3, this.field_T);
        var3 = var3 + (this.a(this.field_N, fa.field_h, 35, 170, var3, ev.field_A) + 5);
        var3 = var3 + (this.a(this.field_E, ua.field_f, 35, 170, var3, jk.field_i) - -5);
        var3 = var3 + this.a(var3, pl.field_a, 170, this.field_J, (byte) 117);
        cg var4 = new cg(46, var3, -90 + this.field_n, 25, this.field_O, true, this.field_n + -120, 5, qo.field_k, 11579568, pn.field_v);
        this.a(-35, var4);
        var3 = var3 + var4.field_i;
        qv var5 = new qv(gf.field_a, 0, 0, 0, 0, 16777215, -1, 0, 0, gf.field_a.field_G, -1, 2147483647, true);
        this.field_R = new lb(var2, var5);
        this.field_R.field_u = "";
        this.field_R.a(fa.field_e, 0, 12082);
        this.field_R.a(fa.field_e, 1, 12082);
        this.field_R.field_k = (jv) (this);
        this.field_R.c(-1, this.field_n - 90, 46, var3);
        var3 = var3 + (15 + this.field_R.field_i);
        this.a(-45, this.field_R);
        int var6 = 4;
        int var7 = 200;
        this.field_Q.a(40, 1, -var7 + 496 >> -588580671, var7, var3);
        this.field_F.a(40, 1, 3 + var6, 60, var3 - -15);
        this.field_F.field_k = (jv) (this);
        this.field_Q.field_k = (jv) (this);
        this.a(-106, this.field_Q);
        this.a(-29, this.field_F);
        this.field_L = new fr((ur) (this));
        this.field_L.a(150, 1, 60 + this.field_E.field_n + this.field_E.field_t, this.field_n + -this.field_E.field_t + (-this.field_E.field_n - 60), this.field_E.field_g + 20);
        this.a(-56, this.field_L);
        this.a(var6 + (55 + var3), 1, 0, 496, 0);
    }

    private final int a(int param0, boolean param1, String param2, fd param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        ju var9 = null;
        cg var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var10 = new cg(20, param6, 120 - -param4, 25, param3, false, 120, 3, gf.field_a, 16777215, param2);
            if (param1) {
              this.a(-84, var10);
              var9 = new ju(((cw) ((Object) param3)).a((byte) -128), param5, 126, var10.field_i + param6, 50 + param4, param0);
              var9.field_k = (jv) (this);
              this.a(-42, var9);
              stackOut_3_0 = var10.field_i - -var9.field_i;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -97;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var8);
            stackOut_5_1 = new StringBuilder().append("ae.F(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param4).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param5 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(int param0) {
        if (param0 != -1) {
            return;
        }
        ((bv) ((Object) this.field_E.a((byte) -110))).c((byte) 92);
    }

    public final void a(lb param0, int param1, int param2, int param3) {
        boolean discarded$2 = false;
        RuntimeException var5 = null;
        int var6 = 0;
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
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param2 != 0) {
                if (1 != param2) {
                  if (2 != param2) {
                    break L1;
                  } else {
                    rb.a((byte) -51, "conduct.ws");
                    break L1;
                  }
                } else {
                  rb.a((byte) -51, "privacy.ws");
                  break L1;
                }
              } else {
                rb.a((byte) -51, "terms.ws");
                break L1;
              }
            }
            L2: {
              if (param3 >= 7) {
                break L2;
              } else {
                discarded$2 = this.k(-42);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("ae.VA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        field_M = null;
        field_I = null;
        field_C = (ut[][][]) null;
        field_D = null;
        field_P = null;
        field_H = null;
        int var1 = 0 / ((param0 - -32) / 50);
    }

    private final boolean k(int param0) {
        L0: {
          if (!this.a((cw) (this.field_E), 120)) {
            break L0;
          } else {
            if (!this.a((cw) (this.field_S), 120)) {
              break L0;
            } else {
              if (!this.a((cw) (this.field_K), 120)) {
                break L0;
              } else {
                if (!this.a((cw) (this.field_T), 120)) {
                  break L0;
                } else {
                  if (!this.a((cw) (this.field_N), 120)) {
                    break L0;
                  } else {
                    if (!this.a((cw) (this.field_J), 120)) {
                      break L0;
                    } else {
                      L1: {
                        if (param0 < -108) {
                          break L1;
                        } else {
                          ae.a((byte) 127);
                          break L1;
                        }
                      }
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    final static void m(int param0) {
        int var2 = Kickabout.field_G;
        if (0 < ns.field_a) {
            ns.field_a = ns.field_a - 1;
        } else {
            if (fj.field_a > 0) {
                fj.field_a = fj.field_a - 1;
            } else {
                if (0 < ee.field_b) {
                    ee.field_b = ee.field_b - 1;
                }
            }
        }
        if (param0 != -19417) {
            field_I = (vl) null;
        }
        if (!(-1 <= (ns.field_a ^ -1))) {
            pa.b((byte) 82);
        }
        if ((fj.field_a ^ -1) < -1) {
            dw.a(param0 + 19335, fj.field_a);
        }
        if (!(-1 <= (ee.field_b ^ -1))) {
            dw.a(125, ee.field_b);
        }
    }

    private final boolean h(byte param0) {
        int discarded$0 = 0;
        if (param0 >= -82) {
            String var4 = (String) null;
            discarded$0 = this.a(-122, true, (String) null, (fd) null, 3, (String) null, -84);
        }
        if (!this.k(-112)) {
            return false;
        }
        int var2 = -1;
        try {
            var2 = Integer.parseInt(this.field_J.field_q);
        } catch (NumberFormatException numberFormatException) {
        }
        return gp.a((byte) 117, this.field_S.field_q, this.field_O.field_A, this.field_E.field_q, (ae) (this), var2, this.field_T.field_q);
    }

    private final int a(fd param0, String param1, int param2, int param3, int param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
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
        int stackOut_2_0 = 0;
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
              if (param2 == 35) {
                break L1;
              } else {
                ae.m(-40);
                break L1;
              }
            }
            stackOut_2_0 = this.a(35, true, param1, param0, param3, param5, param4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("ae.BB(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        boolean discarded$2 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param3 >= 64) {
                break L1;
              } else {
                ae.a((byte) -10);
                break L1;
              }
            }
            L2: {
              if (this.field_F != param1) {
                if (param1 != this.field_Q) {
                  break L2;
                } else {
                  discarded$2 = this.h((byte) -104);
                  break L2;
                }
              } else {
                jk.a((byte) -125);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6);
            stackOut_7_1 = new StringBuilder().append("ae.C(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final String l(int param0) {
        if (param0 != 6) {
            this.field_J = (mr) null;
        }
        return "</col></u>";
    }

    private final String b(boolean param0) {
        if (!param0) {
            field_M = (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(int param0, String param1, int param2, fd param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        cg var7 = null;
        gb var8 = null;
        int stackIn_1_0 = 0;
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
        int stackOut_0_0 = 0;
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
            var6_int = 94 / ((10 - param4) / 49);
            var7 = new cg(20, param0, param2 + 120, 25, param3, false, 120, 3, gf.field_a, 16777215, param1);
            this.a(-111, var7);
            var8 = new gb(((cw) ((Object) param3)).a((byte) -117));
            this.a(-48, var8);
            var8.a(15, 1, 3 + (var7.field_n + var7.field_t), 15, var7.field_g - -(var7.field_i - 15 >> -131033951));
            stackOut_0_0 = var7.field_i;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var6);
            stackOut_2_1 = new StringBuilder().append("ae.L(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_12_0 = false;
        boolean stackOut_8_0 = false;
        int stackOut_5_0 = 0;
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
            if (super.a(param0, (byte) -126, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 < -60) {
                if (param3 != 98) {
                  if (-100 == (param3 ^ -1)) {
                    stackOut_12_0 = this.b(param2, (byte) 123);
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_8_0 = this.a(param2, (byte) -100);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("ae.E(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    private final boolean a(cw param0, int param1) {
        l var3 = null;
        RuntimeException var3_ref = null;
        rv var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var3 = param0.a((byte) -126);
              if (param1 == 120) {
                break L1;
              } else {
                field_P = (String) null;
                break L1;
              }
            }
            if (var3 != null) {
              var4 = var3.c(param1 ^ -24367);
              if (var4 != jt.field_Bb) {
                if (mn.field_c != var4) {
                  if (var4 != os.field_l) {
                    stackOut_14_0 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("ae.I(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                return stackIn_15_0 != 0;
              }
            }
          }
        }
    }

    public final void a(String param0, int param1) {
        int discarded$2 = 0;
        mr var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              var3 = this.field_E;
              var4 = param0;
              ((ga) ((Object) var3)).a(var4, (byte) -17, false);
              if (param1 == 15) {
                break L1;
              } else {
                var5 = (String) null;
                discarded$2 = this.a(24, false, (String) null, (fd) null, 103, (String) null, 84);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3_ref);
            stackOut_3_1 = new StringBuilder().append("ae.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        field_P = "<%0> (og)";
        field_M = "This player's stats are maxed out.<br>He no longer earns experience";
        field_I = new vl("usename");
    }
}
