/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static String field_d;
    static kd field_g;
    static String field_m;
    private int field_i;
    private int field_f;
    private int field_b;
    private boolean field_a;
    static float field_j;
    oh[] field_k;
    private int field_c;
    static int field_e;
    static String field_l;
    private int field_h;
    oh field_n;

    final static boolean c(int param0) {
        int var1 = -62 % ((param0 + 11) / 57);
        return ma.field_g;
    }

    public static void b(int param0) {
        if (param0 != -5549) {
          return;
        }
        field_g = null;
        field_l = null;
        field_d = null;
        field_m = null;
    }

    final dg a(oh[] param0, boolean param1) {
        RuntimeException var3 = null;
        oh[] var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_k = param0;
          if (!param1) {
            var4 = (oh[]) null;
            this.a((oh[]) null, true);
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("dg.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, qn param3, na param4) {
        jb stackIn_17_0;
        String stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        int stackIn_18_4 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_23_5;
        int stackIn_23_6;
        int stackIn_23_7;
        int stackIn_24_8;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        na var8 = null;
        try {
          qj.a(param4.field_F, (byte) -36, this.field_k, param2 + param4.field_t, param4.field_u, param1 + param4.field_w);
          if (this.field_n != null) {
            var6_int = param4.field_t + param2 + this.field_b;
            if (param3.field_k == 1) {
              var6_int = var6_int + (param4.field_F - this.field_n.field_t) / 2;
            }
            var7 = param4.field_w + (param1 + this.field_f);
            if (1 == param3.field_d) {
              var7 = var7 + (-this.field_n.field_F + param4.field_u) / 2;
            }
            if (param3.field_k == 2) {
              var6_int = var6_int + (param4.field_F - this.field_n.field_t);
            }
            if (2 == param3.field_d) {
              var7 = var7 + (-this.field_n.field_F + param4.field_u);
            }
            this.field_n.c(var6_int, var7);
          }
          var6 = param3.c(param4, 4373);
          if (param0 != 46) {
            var8 = (na) null;
            this.a(-111, 99, -82, (qn) null, (na) null);
          }
          if (var6 != null &&
            null != param3.field_b &&
            this.field_i >= 0) {
            stackIn_17_0 = param3.field_b;
            stackIn_17_1 = var6;
            stackIn_17_2 = param3.field_f + param2;
            stackIn_17_3 = -param4.field_t;
            if (this.field_b == -2147483648) {
              stackIn_18_4 = 0;
            } else {
              stackIn_18_4 = this.field_b;
            }
            stackIn_20_2 = stackIn_17_2 - (stackIn_17_3 - stackIn_18_4);
            if (this.field_f != -2147483648) {
              stackIn_21_3 = this.field_f;
            } else {
              stackIn_21_3 = 0;
            }
            stackIn_23_3 = stackIn_21_3 + (param1 + param4.field_w + param3.field_j);
            stackIn_23_4 = -param3.field_g + param4.field_F - param3.field_f;
            stackIn_23_5 = -param3.field_h + (-param3.field_j + param4.field_u);
            stackIn_23_6 = this.field_i;
            stackIn_23_7 = this.field_c;
            if (this.field_h == -2147483648) {
              stackIn_24_8 = 256;
            } else {
              stackIn_24_8 = this.field_h;
            }
            ((jb) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_20_2, stackIn_23_3, stackIn_23_4, stackIn_23_5, stackIn_23_6, stackIn_23_7, stackIn_24_8, param3.field_k, param3.field_d, param3.field_c);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_28_0 = var6_ref;
          stackIn_28_1 = new StringBuilder().append("dg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param4 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final dg b(int param0, int param1) {
        if (param1 != 2) {
          this.a((byte) 106, false);
        }
        this.field_c = param0;
        return this;
    }

    final dg a(int param0, int param1) {
        if (param0 != 2) {
          field_l = (String) null;
        }
        this.field_i = param1;
        return this;
    }

    final static void d(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        bc var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        eh var11 = null;
        bc var12 = null;
        int[] var13 = null;
        cf var14 = null;
        cf var15 = null;
        int[] var16 = null;
        var8 = TetraLink.field_J;
        try {
          var12 = kb.field_q;
          var2 = var12.d((byte) -99);
          if (param0 == ~var2) {
            var10 = lh.h(-7990);
            var16 = var10;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((bh) ((Object) var5)).d((byte) -99);
            for (var7 = 0; var7 < var6; var7++) {
              var9[var7] = ((bh) ((Object) var5)).f(122);
            }
            var14 = (cf) (sf.field_a.c(false));
            if (var14 == null) {
              mk.a(false);
              return;
            }
            var14.field_u = var3;
            var14.field_s = true;
            var14.field_t = var16[0];
            var14.b(false);
            return;
          }
          if (var2 != 1) {
            if (2 != var2) {
              fk.a(-93, (Throwable) null, "A1: " + hc.a(false));
              mk.a(false);
            } else {
              var15 = (cf) (sf.field_a.c(false));
              if (var15 == null) {
                mk.a(false);
                return;
              }
              var15.field_u = lh.h(param0 - 7989);
              var15.field_t = var15.field_u[0];
              var15.field_s = true;
              var15.b(false);
            }
          } else {
            var11 = (eh) (qn.field_t.c(false));
            if (var11 == null) {
              mk.a(false);
              return;
            }
            var11.b(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "dg.E(" + param0 + ')');
        }
    }

    final dg a(byte param0, int param1) {
        this.field_b = param1;
        if (param0 != -128) {
          return (dg) null;
        }
        return this;
    }

    final void a(int param0, na param1, dg param2, boolean param3, int param4, qn param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        wf var8 = null;
        try {
          if (this.field_a) {
            param2.a(46, param0, param4, param5, param1);
            param2.a(30033);
          }
          if (this.field_c >= -1) {
            param2.field_c = this.field_c;
          }
          if (this.field_f != -2147483648) {
            param2.field_f = this.field_f;
          }
          if (null != this.field_k) {
            param2.field_k = this.field_k;
          }
          if (-1 <= this.field_i) {
            param2.field_i = this.field_i;
          }
          if (-2147483648 != this.field_h) {
            param2.field_h = this.field_h;
          }
          if (null != this.field_n) {
            param2.field_n = this.field_n;
          }
          if (!param3) {
            var8 = (wf) null;
            dg.a(-102, (byte) 68, (wf) null);
          }
          if (this.field_b != -2147483648) {
            param2.field_b = this.field_b;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("dg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void a(int param0) {
        this.field_h = 256;
        if (param0 != 30033) {
          this.b(6, -45);
        }
        this.field_b = 0;
        this.field_n = null;
        this.field_i = 0;
        this.field_k = null;
        this.field_f = 0;
        this.field_c = -1;
    }

    final static void a(boolean param0, byte param1) {
        if (ak.a(3058)) {
          param0 = false;
        }
        vd.b(param0, 0);
        if (wl.field_d) {
          ra.e(we.field_e.field_g.field_M, we.field_e.field_g.field_yb, we.field_e.field_g.field_Hb, we.field_e.field_g.field_R);
          we.field_e.field_g.a(param0, param1 + 344);
        }
        if (param1 != -88) {
          dg.c(-86);
        }
        h.a((byte) -89, param0);
    }

    final dg a(byte param0, boolean param1) {
        if (param0 != -77) {
          oh[] var4 = (oh[]) null;
          this.a((oh[]) null, true);
        }
        this.field_a = param1 ? true : false;
        return this;
    }

    final void a(dg param0, int param1) {
        try {
          param0.field_c = this.field_c;
          param0.field_a = this.field_a;
          param0.field_f = this.field_f;
          param0.field_b = this.field_b;
          param0.field_i = this.field_i;
          param0.field_n = this.field_n;
          param0.field_k = this.field_k;
          int var3_int = -14 / ((param1 - 6) / 54);
          param0.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "dg.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3) {
        int stackIn_11_0 = 0;
        hl stackIn_24_0 = null;
        String stackIn_25_1 = null;
        hl stackIn_27_0 = null;
        String[] stackIn_27_1 = null;
        String stackIn_28_2 = null;
        String stackIn_57_0 = null;
        hl stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        boolean stackIn_72_2 = false;
        hl stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        boolean stackIn_77_2 = false;
        hl stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        boolean stackIn_82_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        hl var5 = null;
        hl var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        hl var15 = null;
        String var16 = null;
        hl var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = TetraLink.field_J;
        try {
          nb.a(ng.field_t, (byte) 89);
          if (null != qe.field_a) {
            var15 = nm.field_n;
            var17 = var15;
            nm.field_n.field_R = 0;
            var17.field_Hb = 0;
            var5 = rn.field_c;
            rn.field_c.field_R = 0;
            var5.field_Hb = 0;
            tn.field_a.field_R = 0;
            var6 = tn.field_a;
            var6.field_Hb = 0;
            ua.field_d.field_jb = lh.field_u.toUpperCase();
            var7 = (2 + fk.field_V.field_Hb) / 2;
            tn.field_a.a((byte) -99, var7 - 2, fk.field_V.field_R - 40, 40, 0);
            rn.field_c.a((byte) -124, fk.field_V.field_Hb - var7, -40 + fk.field_V.field_R, 40, var7);
            if (cl.field_f.length == 1 &&
              2 == cl.field_f[0]) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (cl.field_f.length > var10) {
                  stackIn_11_0 = ((km.field_o[var10 / 8] & 1 << (var10 & 7)) == 0) ? 0 : 1;
                  var11_int = stackIn_11_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    cl.field_f[var10] != 2) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (var9_int != 0) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            rn.field_c.field_S = true;
            if (kl.field_a) {
              eh.field_q.field_jb = kk.field_R;
              qi.field_n.field_S = false;
              if (var8 != 0) {
                stackIn_57_0 = md.field_I;
              } else {
                stackIn_57_0 = ni.field_i;
              }
              var16 = stackIn_57_0;
              var9 = var16;
              var9 = var16;
              var9 = var16;
              var10Lifetime1 = tn.field_a.field_Ib.b(var16) + 3 * tn.field_a.field_Ib.a('.');
              tn.field_a.field_V = (tn.field_a.field_Hb - var10Lifetime1) / 2;
              if ((cb.field_u & 48) == 16) {
                var9 = var16 + ".";
              }
              tn.field_a.field_xb = 0;
              if (32 == (48 & cb.field_u)) {
                var9 = (String) (var9) + "..";
              }
              if ((48 & cb.field_u) == 48) {
                var9 = (String) (var9) + "...";
              }
              tn.field_a.field_jb = (String) (var9);
              rn.field_c.field_jb = rj.field_c.toUpperCase();
            } else {
              stackIn_24_0 = rn.field_c;
              if (var8 == 0) {
                stackIn_25_1 = el.field_Ob;
              } else {
                stackIn_25_1 = cb.field_q;
              }
              stackIn_24_0.field_jb = ((String) (Object) stackIn_25_1).toUpperCase();
              stackIn_27_0 = eh.field_q;
              stackIn_27_1 = new String[]{rn.field_c.field_jb};
              if (var8 == 0) {
                stackIn_28_2 = ib.field_c;
              } else {
                stackIn_28_2 = ml.field_cb;
              }
              stackIn_27_0.field_jb = sk.a(stackIn_27_1, stackIn_28_2, 122);
              nn.field_R = true;
              tn.field_a.field_jb = ei.field_o;
              qi.field_n.field_S = true;
              if (null != uj.field_s) {
                if (eg.field_K == null) {
                  rh.field_G = new boolean[hg.field_k];
                  eg.field_K = new byte[hg.field_k];
                }
                nn.field_R = false;
                n.field_P = false;
                var13 = 0;
                var9_intLifetime1 = var13;
                while (hg.field_k > var13) {
                  rh.field_G[var13] = false;
                  var13++;
                }
                lk.a(true, (byte) -119, -1, qe.field_a, 0, -1, hg.field_k, -1);
                if (!(dd.field_c < 2) &&
                  sn.field_a[12]) {
                  nn.field_R = true;
                }
              }
              if (!nn.field_R) {
                rn.field_c.field_S = false;
                if (rn.field_c.field_rb) {
                  var9 = null;
                  if (n.field_P) {
                    var9 = "<col=A00000>" + fi.field_zb + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; hg.field_k > var10Lifetime1; var10Lifetime1++) {
                    if (rh.field_G[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + ll.field_y[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 != null) {
                        var9 = (String) (var9) + ", " + var11_ref;
                      } else {
                        var9 = var11_ref;
                      }
                    }
                  }
                  re.field_P = "<col=A00000>" + vg.field_Nb + "<br>" + da.field_a + (String) (var9);
                }
              }
            }
          }
          if (param1) {
            field_e = -1;
          }
          stackIn_71_0 = tl.field_P;
          stackIn_71_1 = 0;
          stackIn_72_2 = (param0) && (!param2) && (!lg.field_S);
          ((hl) (Object) stackIn_71_0).a(stackIn_71_1, stackIn_72_2);
          stackIn_76_0 = fk.field_V;
          stackIn_76_1 = 0;
          stackIn_77_2 = (param0) && (!param2) && (!lg.field_S);
          ((hl) (Object) stackIn_76_0).a(stackIn_76_1, stackIn_77_2);
          stackIn_81_0 = fj.field_b;
          stackIn_81_1 = 0;
          stackIn_82_2 = (param0) && (!param2) && (lg.field_S);
          ((hl) (Object) stackIn_81_0).a(stackIn_81_1, stackIn_82_2);
          we.field_e.field_g.c(true);
          if (qe.field_a != null) {
            if (qi.field_n.field_F != 0) {
              tb.a(param3, -15289);
            }
            if (rn.field_c.field_F != 0) {
              if (!kl.field_a) {
                l.a(0, param3);
              } else {
                oi.a((byte) 126, param3);
              }
            }
            hg.a(param3, qe.field_a, 30544, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var4), "dg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    dg() {
        this.field_b = -2147483648;
        this.field_f = -2147483648;
        this.field_a = false;
        this.field_i = -2;
        this.field_k = null;
        this.field_h = -2147483648;
        this.field_n = null;
        this.field_c = -2;
    }

    final static bf a(int param0, byte param1, wf param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        bf stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -58 / ((param1 - 71) / 52);
          stackIn_1_0 = we.a(-11040, ee.a(param2, 100, param0));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("dg.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final dg a(int param0, byte param1) {
        this.field_f = param0;
        if (param1 != 12) {
          field_m = (String) null;
        }
        return this;
    }

    static {
        field_m = "Please wait...";
        field_d = "<%0> has resigned and is offering a rematch.";
        field_l = "Chat is currently disabled.";
    }
}
