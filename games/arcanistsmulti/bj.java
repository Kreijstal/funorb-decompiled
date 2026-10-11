/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends ob implements vb {
    static String field_jb;
    private long field_V;
    static String field_sb;
    static String field_pb;
    private ag field_lb;
    private qm field_rb;
    static boolean field_mb;
    private ag field_nb;
    static int field_tb;
    static String field_kb;
    static ll[] field_ob;
    static String field_qb;
    static boolean field_ub;

    final boolean a(qm param0, byte param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3;
          if (var5_int == 99 &&
            !ArcanistsMulti.field_G) {
            this.field_lb.a(0, (qm) (this));
            return true;
          }
          if (var5_int == 98) {
            this.field_nb.a(0, (qm) (this));
            return true;
          }
          if (param1 > -120) {
            bj.a(-60, 57, 53, -57, -90, -4, -1);
          }
          stackIn_17_0 = super.a(param0, (byte) -125, param2, param3);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("bj.N(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    bj(h param0) {
        super(param0, 200, 200);
        RuntimeException runtimeException = null;
        qm var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_V = qj.b(-26572);
          var2 = new qm(qj.field_i, (wc) null);
          var2.field_k = 100;
          var2.field_v = this.field_v;
          var2.field_n = 0;
          var2.field_j = 50;
          var2.field_r = (pf) ((Object) new jm(vc.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.c(-67, var2);
          this.field_rb = new qm(qj.field_i, (wc) null);
          this.field_rb.field_j = 20 + var2.field_k + var2.field_j;
          this.field_rb.field_v = this.field_v;
          this.field_rb.field_n = 0;
          this.field_rb.field_k = 80;
          this.field_rb.field_r = (pf) ((Object) new jm(go.field_k, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.c(-108, this.field_rb);
          this.field_nb = this.a((wc) (this), ln.field_R, true);
          this.field_lb = this.a((wc) (this), ki.field_t, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("bj.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void l(byte param0) {
        try {
          field_jb = null;
          field_kb = null;
          field_qb = null;
          field_ob = null;
          field_pb = null;
          field_sb = null;
          if (param0 != -46) {
            field_mb = false;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "bj.G(" + param0 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0 >>> 1;
          var2_int = var2_int | var2_int >>> 1;
          var2_int = var2_int | var2_int >>> 2;
          var2_int = var2_int | var2_int >>> 4;
          var2_int = var2_int | var2_int >>> 8;
          if (param1 < 87) {
            field_kb = (String) null;
          }
          var2_int = var2_int | var2_int >>> 16;
          stackIn_4_0 = param0 & ~var2_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "bj.K(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 24) {
            field_sb = (String) null;
          }
          stackIn_16_0 = (param6 <= param5) && (param5 < param3 + param6) && (param2 <= param0) && (param0 < param2 + param4);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var7), "bj.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var5_long = 0L;
        RuntimeException var5 = null;
        int var7 = 0;
        try {
          super.a(param0, param1, param2, param3);
          if (tl.field_d) {
            param0.d((byte) 29);
          }
          var5_long = qj.b(-26572) - this.field_V;
          var7 = (int)((-var5_long + 10999L) / 1000L);
          if (var7 <= 0) {
            u.b(6);
            this.k((byte) 119);
            this.field_H.b(new qn(this.field_H, bh.field_c), param2 ^ 15807);
          }
          if (var7 > 0 ||
            ArcanistsMulti.field_G) {
            this.field_rb.field_g = "" + var7;
          }
          if (this.field_G &&
            ka.field_m == null) {
            this.k((byte) 116);
            this.field_H.b(new qn(this.field_H, vi.field_C), 15637);
          }
          if (ka.field_m != null &&
            ka.field_m.field_e) {
            this.k((byte) 122);
            this.field_H.b(new qn(this.field_H, vi.field_C), 15637);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("bj.E(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static wa a(boolean param0, int param1, int param2) {
        dn stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        kc stackIn_32_0 = null;
        String stackIn_33_1 = null;
        kc stackIn_36_0 = null;
        String stackIn_37_1 = null;
        int stackIn_41_0 = 0;
        Object stackIn_98_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        vn var4 = null;
        Object var5 = null;
        Object var6 = null;
        wa var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        ne var17 = null;
        String var18 = null;
        int var19 = 0;
        ne var17Lifetime1;
        String var18Lifetime1;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          stackIn_4_0 = nl.field_Gb.field_Db;
          stackIn_5_1 = (dd.field_h == nl.field_Gb.field_Db);
          boolean decompiledFrameRemainder0 = true;
          var3_int = ((dn) (Object) stackIn_4_0).a(stackIn_5_1, (byte) 98, ga.field_r + 2, 2, (3 * ga.field_r + 6) * param2, param0) ? 1 : 0;
          var4 = nl.field_Gb.field_Eb.field_G;
          var5 = null;
          if (param1 == ~jb.field_t) {
            ec.field_d.field_ub = true;
            lj.field_j.field_rb = tj.a(param1 - 94, new String[]{ie.field_Nb}, e.field_C);
            nl.field_Gb.field_Db.field_Hb.field_rb = null;
            var6 = null;
            var7 = (wa) (var4.b(param1 ^ -12622));
            L5: while (true) {
              if (var7 != null) {
                var8 = 0;
                if (var19 == 0) {
                  if (null == var7.field_G) {
                    var7.field_Jb = new kc(0L, qa.field_j);
                    var7.a(var7.field_Jb, 117);
                    var7.field_Fb = new kc(0L, le.field_E);
                    var7.a(var7.field_Fb, 26);
                    var7.field_Mb = new kc(0L, qa.field_j);
                    var7.a(var7.field_Mb, 71);
                    var7.field_Fb.field_X = 2;
                    var8 = 1;
                    var7.e((byte) 20);
                  }
                  var7.field_x = nl.field_Gb.field_Eb.field_x;
                  var9 = 0;
                  if (null == var7.field_Lb) {
                    var10 = 13369344;
                    var11 = 16737894;
                  } else if (ie.field_Nb != var7.field_Lb) {
                    var10 = 13421568;
                    var11 = 16777062;
                  } else {
                    var10 = 52224;
                    var11 = 6750054;
                  }
                  var12 = 0;
                  if (var7.field_Gb != null &&
                    !var7.field_Gb.equals("")) {
                    var7.field_Mb.field_eb = var11;
                    var7.field_Mb.field_W = eb.field_d;
                    var7.field_Mb.a(eb.field_d.field_n + 3, 0, var9, ga.field_r, (byte) -120);
                    var12 = 1;
                  }
                  var7.field_Fb.field_eb = var11;
                  var7.field_Jb.field_eb = var11;
                  var7.field_Fb.field_ob = var10;
                  var7.field_Jb.field_ob = var10;
                  var7.field_Fb.field_J = var11;
                  var7.field_Jb.field_J = var11;
                  var7.field_Fb.field_zb = var11;
                  var7.field_Jb.field_zb = var11;
                  var13 = 0;
                  var14 = -82 + var7.field_x;
                  if (var12 != 0) {
                    var13 = eb.field_d.field_n + 3;
                    var14 = var14 - var13;
                  }
                  stackIn_32_0 = var7.field_Jb;
                  if (var14 <= 0) {
                    stackIn_33_1 = var7.field_Cb;
                  } else {
                    stackIn_33_1 = dj.a(var7.field_Jb.field_Z, var7.field_Cb, var14);
                  }
                  stackIn_32_0.field_rb = stackIn_33_1;
                  var7.field_Jb.a(var14, var13, var9, ga.field_r, (byte) -120);
                  stackIn_36_0 = var7.field_Fb;
                  if (var7.field_Lb == null) {
                    stackIn_37_1 = nk.field_o;
                  } else {
                    stackIn_37_1 = var7.field_Lb;
                  }
                  stackIn_36_0.field_rb = stackIn_37_1;
                  var7.field_Fb.a(80, -80 + var7.field_x, var9, ga.field_r, (byte) -120);
                  stackIn_41_0 = (var7.field_Jb.field_rb.equals(var7.field_Cb)) ? 0 : 1;
                  var15 = stackIn_41_0;
                  var9 = var9 + ga.field_r;
                  if (var3_int == 0) {
                    var7.field_B = var9 - var7.field_I;
                  }
                  if (var8 != 0) {
                    nl.field_Gb.field_Eb.a((byte) 123, (kc) (var6), var7, 2);
                  }
                  var6 = var7;
                  if (var7.field_Mb == null ||
                    !var7.field_Mb.field_C) {
                    if (var7.field_U == 0) {
                      if (var7.field_Jb.field_C &&
                        var15 != 0) {
                        kh.field_c = var7.field_Cb;
                      }
                    } else {
                      var16 = var7.field_Cb;
                      ArcanistsMulti.a(-26335, (int[]) null, nl.field_Gb.field_Db, var16, 0L, -1, -1, (String) null, var7);
                      if (var7.field_Lb != null &&
                        !tc.a(eo.field_c.field_h, -31046) &&
                        !wh.field_g) {
                        if (!ld.field_p) {
                          var17 = eo.field_c;
                          var18 = tj.a(param1 ^ -125, new String[]{var16}, mb.field_S);
                          var17.field_l.a(8, var18, (byte) -26);
                        }
                        var17Lifetime1 = eo.field_c;
                        var18Lifetime1 = tj.a(-73, new String[]{var16}, bh.field_b);
                        var17Lifetime1.field_l.a(18, var18Lifetime1, (byte) -26);
                      }
                      var5 = var7;
                    }
                  } else {
                    kh.field_c = var7.field_Gb;
                  }
                  var7 = (wa) (var4.a(0));
                  continue;
                }
              } else {
                if (0 == nl.field_Gb.field_Jb.field_U) {
                  break L5;
                }
                tc.field_A = new dh(nl.field_Gb.field_Jb.field_V, nl.field_Gb.field_Jb.field_nb, nl.field_Gb.field_Jb.field_x, nl.field_Gb.field_Jb.field_I, dg.field_v, ck.field_a, pg.field_c, pg.field_c);
              }
              vd.field_h = 0;
              break;
            }
            if (nl.field_Gb.field_Lb.field_U != 0) {
              tc.field_A = new dh(nl.field_Gb.field_Lb.field_V, nl.field_Gb.field_Lb.field_nb, nl.field_Gb.field_Lb.field_x, nl.field_Gb.field_Lb.field_I, af.field_Gb, ck.field_a, pg.field_c, pg.field_c);
              vd.field_h = 1;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            lj.field_j.field_rb = ba.field_f;
            ec.field_d.field_ub = false;
            if (jb.field_t == 1) {
              nl.field_Gb.field_Db.field_Hb.field_rb = le.field_db;
              if (var19 != 0) {
                nl.field_Gb.field_Db.field_Hb.field_rb = hn.field_l;
              }
            } else {
              nl.field_Gb.field_Db.field_Hb.field_rb = hn.field_l;
            }
            fc.a((byte) -77, nl.field_Gb.field_Eb);
          }
          stackIn_98_0 = var5;
          return (wa) (stackIn_98_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "bj.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_nb != param4) {
            if (this.field_lb == param4) {
              u.b(6);
              this.k((byte) 104);
              if (ArcanistsMulti.field_G) {
                this.k((byte) 86);
              }
            }
          } else {
            this.k((byte) 86);
          }
          if (!param0) {
            this.a((qm) null, (byte) 73, 'ﾻ', -7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("bj.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static boolean g(boolean param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            bj.a(121, (byte) -115);
          }
          stackIn_10_0 = (pm.field_e != null) && (pm.field_e.g(7213) != null);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "bj.H(" + param0 + ')');
        }
    }

    final static void a(int[] param0, int param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = param1;
          var3 = -7 + param0.length;
          do {
            if (var3 <= var2_int) {
              var3 += 7;
              break;
            }
            param0[var2_int++] = 0;
            param0[var2_int++] = 0;
            param0[var2_int++] = 0;
            param0[var2_int++] = 0;
            param0[var2_int++] = 0;
            param0[var2_int++] = 0;
            param0[var2_int++] = 0;
            param0[var2_int++] = 0;
          } while (var4 == 0);
          while (var2_int < var3) {
            param0[var2_int++] = 0;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("bj.R(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    private final ag a(wc param0, String param1, boolean param2) {
        ag var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ag stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ag(param1, param0);
          var4.field_r = (pf) ((Object) new mm());
          if (!param2) {
            field_mb = true;
          }
          var5 = -6 + this.field_k;
          this.field_k = this.field_k + 38;
          var4.a(30, var5, this.field_v - 30, 15, -76);
          this.c(-96, var4);
          this.e((byte) 84);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("bj.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(char param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -71) {
            field_ub = false;
          }
          if (!qo.a(param0, param2 + 71)) {
            return false;
          }
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int >= 12) {
            return false;
          }
          if (rk.a((byte) -51, param0) &&
            var3_int == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("bj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void k(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!this.field_G) {
            return;
          }
          if (param0 < 85) {
            field_ob = (ll[]) null;
          }
          this.field_G = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "bj.M(" + param0 + ')');
        }
    }

    static {
        field_pb = "Lesson 6 of 7<br><br>Use of basic minions in a safe and secure environment.<br><br>Use your imps to destroy all three targets.<br><br><br>* Summoning minions *<br>* Minion selection *<br>* Selection of a minion's spells *";
        field_jb = "This spell can only be cast from within the water.";
        field_qb = "Logging in...";
        field_sb = "You cannot use this spell as an angel";
        field_kb = "Player names can be up to 12 letters, numbers and underscores";
    }
}
