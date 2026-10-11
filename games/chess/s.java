/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends ma implements wl, mj {
    static ci field_M;
    static String field_R;
    private bg field_L;
    static int field_K;
    private fb field_N;
    t field_Q;
    static int field_O;
    private fb field_P;
    static fe field_S;

    public final void a(int param0) {
        if (param0 != 120) {
          field_R = (String) null;
        }
        ((uh) (this.field_L.a(-82))).h(-85);
    }

    private final boolean i(int param0) {
        if (param0 != 0) {
          s.g((byte) -98);
        }
        if (this.a((byte) 84, (ee) (this.field_L))) {
          return true;
        }
        return false;
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void g(byte param0) {
        field_S = null;
        if (param0 >= -79) {
          field_K = 79;
        }
        field_M = null;
        field_R = null;
    }

    private final boolean a(byte param0, ee param1) {
        vb var3 = null;
        RuntimeException var3_ref = null;
        mk var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(-81);
          if (var3 == null) {
            return true;
          }
          if (param0 <= 42) {
            field_O = 81;
          }
          var4 = var3.a(21314);
          stackIn_8_0 = (oa.field_a == var4);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("s.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.a(param3, param2 ^ -27965);
            return stackIn_7_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_11_0 = this.a(param3, (byte) -73);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("s.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final int a(String param0, String param1, mf param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        ea var9 = null;
        kg var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new kg(20, param3, 120 + param4, 25, param2, false, 120, param6, rb.field_b, 16777215, param1);
          this.b(var10, 95);
          var9 = new ea(((ee) ((Object) param2)).a(param6 ^ -124), param0, 126, var10.field_C + param3, param4 + 25, param5);
          var9.field_p = (rg) (this);
          this.b(var9, 95);
          stackIn_1_0 = var9.field_C + var10.field_C;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("s.M(");
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
          throw fk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, mf param2, int param3) {
        try {
          if (param1 > -6) {
            this.field_L = (bg) null;
          }
          super.a(param0, -14, param2, param3);
          this.field_N.field_H = this.i(0);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "s.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void b(int param0, int param1, int param2, int param3) {
        mn.field_h.field_l = 0;
        mn.field_h.c(12, (byte) 65);
        mn.field_h.d(ph.field_d.nextInt(), (byte) -81);
        mn.field_h.d(ph.field_d.nextInt(), (byte) -81);
        mn.field_h.c(param0, (byte) 71);
        mn.field_h.c(param1, (byte) -91);
        mn.field_h.b(param3, 115);
        mn.field_h.a(dk.field_k, se.field_M, (byte) 86);
        qn.field_U.f(18, -116);
        int fieldTemp$0 = qn.field_U.field_l + 1;
        qn.field_U.field_l = qn.field_U.field_l + 1;
        int var4 = fieldTemp$0;
        qn.field_U.a(mn.field_h.field_o, (byte) -45, param2, mn.field_h.field_l);
        qn.field_U.a(qn.field_U.field_l - var4, -1);
    }

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        boolean discarded$0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        ee var7 = null;
        try {
          if (this.field_P == param0) {
            mf.e(115);
          } else {
            if (param0 == this.field_N) {
              this.h(param4 + 24099);
            }
          }
          if (param4 != -24221) {
            var7 = (ee) null;
            discarded$0 = this.a((byte) -85, (ee) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("s.DA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, nb param1, boolean param2, int param3, int param4) {
        int var27_int = 0;
        nb stackIn_40_0 = null;
        boolean stackIn_41_1 = false;
        int stackIn_44_0 = 0;
        int stackIn_58_0 = 0;
        ci stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_94_3 = 0;
        RuntimeException stackIn_212_0 = null;
        StringBuilder stackIn_212_1 = null;
        String stackIn_213_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        jc var10 = null;
        int var11_int = 0;
        Object var11 = null;
        r var12 = null;
        int var13 = 0;
        ci var14 = null;
        ci var15 = null;
        ci var16 = null;
        ci var17 = null;
        ci var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        Object var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        Object var30 = null;
        String var30_ref = null;
        int var30_int = 0;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        Object var30Lifetime1;
        String var30_refLifetime1;
        String var30_refLifetime2;
        int var9Lifetime1;
        int var11_intLifetime1;
        int var24_intLifetime1;
        int var26Lifetime1;
        int var30_intLifetime1;
        int var26Lifetime2;
        var31 = Chess.field_G;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (null != pd.field_Rb && (null != t.field_L ||
            uj.field_k != null ||
            null != il.field_b ||
            null != nk.field_r)) {
            for (var9 = 0; var9 < qa.field_e; var9++) {
              var10_int = pd.field_Rb.field_sc[var9] & 255;
              if (null != t.field_L &&
                t.field_L[var9] != null &&
                t.field_L[var9][var10_int]) {
                var5_int = 1;
              }
              if (uj.field_k != null &&
                null != uj.field_k[var9]) {
                var11_int = uj.field_k[var9][var10_int];
                if (var11_int != 0 &&
                  !lf.field_U) {
                  var5_int = 1;
                }
                if (var6 < var11_int) {
                  var6 = var11_int;
                }
              }
              if (nk.field_r != null &&
                null != nk.field_r[var9]) {
                var8 = var8 | nk.field_r[var9][var10_int];
              }
              if (null != il.field_b &&
                il.field_b[var9] != null) {
                var11_intLifetime1 = il.field_b[var9][var10_int];
                if (var7 < var11_intLifetime1) {
                  var7 = var11_intLifetime1;
                }
                if (var11_intLifetime1 != 0 &&
                  !lf.field_U) {
                  var5_int = 1;
                }
              }
            }
          }
          stackIn_40_0 = (nb) (param1);
          stackIn_41_1 = (ud.field_d == param1);
          stackIn_44_0 = (!((nb) (Object) stackIn_40_0).a(stackIn_41_1, param2, 2, (4 * fe.field_g + 8) * param4, (2 + fe.field_g) * 2, 0)) ? 0 : 1;
          var9Lifetime1 = stackIn_44_0;
          var10 = param1.field_Kb.field_I;
          var11 = null;
          var12 = (r) (var10.g(-18110));
          if (param0 != 21487) {
            field_M = (ci) null;
          }
          while (var12 != null) {
            var13 = 0;
            if (var12.field_I == null) {
              var12.field_Ob = new ci(0L, hg.field_f);
              var12.a((byte) 127, var12.field_Ob);
              var12.field_Kb = new ci(0L, sk.field_v);
              if (bo.field_c) {
                var12.a((byte) 123, var12.field_Kb);
              }
              var12.field_Kb.field_fb = 2;
              var12.field_Xb = new ci(0L, qn.field_P);
              var12.a((byte) 123, var12.field_Xb);
              var12.h(0);
              var12.field_Gb = new ci(0L, jd.field_b);
              var12.a((byte) 125, var12.field_Gb);
              var12.field_Ub = new ci(0L, bo.field_b);
              var13 = 1;
              var12.a((byte) 124, var12.field_Ub);
            }
            var12.field_Ob.field_db = null;
            var14 = var12.field_Ob;
            var12.field_Ob.field_pb = 0;
            var14.field_M = 0;
            var12.field_Kb.field_db = null;
            var15 = var12.field_Kb;
            var12.field_Kb.field_pb = 0;
            var12.field_Gb.field_db = null;
            var15.field_M = 0;
            var12.field_Gb.field_pb = 0;
            var16 = var12.field_Gb;
            var12.field_Ub.field_db = null;
            var16.field_M = 0;
            var12.field_Ub.field_pb = 0;
            var17 = var12.field_Ub;
            var17.field_M = 0;
            var12.field_Xb.field_db = null;
            var12.field_Xb.field_pb = 0;
            var18 = var12.field_Xb;
            var18.field_M = 0;
            var12.field_M = param1.field_Kb.field_M;
            var19 = 0;
            var32 = var12.field_Lb;
            var20 = var32;
            var20 = var32;
            var21 = 72;
            if (param1 == ib.field_c) {
              var21 += 42;
            }
            var33 = lh.a(var12.field_Ob.field_xb, var32, var21);
            var20 = var33;
            var20 = var33;
            var20 = var33;
            stackIn_58_0 = (var33.equals(var12.field_Lb)) ? 0 : 1;
            var22 = stackIn_58_0;
            if (var12.field_Vb < 4) {
              if (0 < var12.field_Vb) {
                var20 = "<img=" + (-1 + var12.field_Vb) + ">" + var33;
              }
            } else {
              var20 = "<img=" + (-4 + (var12.field_Vb + af.field_g)) + ">" + var33;
            }
            boolean decompiledFrameRemainder0 = true;
            var12.field_Ob.field_db = var20;
            if (!var12.l(1)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_Hb ||
                (!(var6 <= var12.field_Pb) ||
                !(var7 <= var12.field_Jb) ||
                !(0 >= (~var12.field_Wb & var8)))) {
                var23_int = 8414771;
                var24_int = 8421504;
              }
              var12.field_Ob.field_T = var24_int;
              var12.field_Ob.field_P = var24_int;
              var12.field_Ob.field_O = var24_int;
              var12.field_Gb.field_ib = var23_int;
              var12.field_Kb.field_ib = var23_int;
              var12.field_Ob.field_ib = var23_int;
              var12.field_Kb.field_T = var24_int;
              var12.field_Kb.field_P = var24_int;
              var12.field_Kb.field_O = var24_int;
              var12.field_Gb.field_T = var24_int;
              var12.field_Gb.field_P = var24_int;
              var12.field_Gb.field_O = var24_int;
              if (se.field_S != param1) {
                if (var12.field_ac) {
                  var12.field_Ob.field_db = oc.a(se.field_U, new String[]{var20}, (byte) -68);
                  var12.field_Ub.field_db = ue.field_b;
                } else {
                  if (!var12.field_Qb) {
                    var12.field_Gb.field_db = ok.field_Eb;
                  } else {
                    var12.field_Ob.field_db = oc.a(ak.field_x, new String[]{var20}, (byte) -110);
                    var12.field_Gb.field_db = sk.field_s;
                    var12.field_Ub.field_db = qm.field_e;
                  }
                }
              } else {
                if (!pd.field_Rb.field_Vb) {
                  var12.field_Ub.field_db = ag.field_c;
                }
              }
              var25_int = 0;
              if (pd.field_Rb != null &&
                ci.f(-92) &&
                ~var12.field_Yb != ~gb.field_t) {
                if (null != var12.field_Gb.field_db) {
                  var26 = var12.field_Gb.e((byte) 113) + 2 * ri.field_g;
                  var12.field_Gb.a(var25_int, var26, param0 ^ -2147462161, fe.field_g, var19);
                  var25_int = var25_int + var26;
                }
                if (var12.field_Ub.field_db != null) {
                  if (se.field_S == param1) {
                    var26Lifetime2 = 40;
                  } else {
                    var26Lifetime2 = var12.field_Ub.e((byte) 39) + ri.field_g * 2;
                  }
                  var12.field_Ub.a(var25_int, var26Lifetime2, -2147483648, fe.field_g, var19);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_93_0 = var12.field_Ob;
              stackIn_93_1 = var25_int;
              stackIn_93_2 = var12.field_M;
              if (!bo.field_c) {
                stackIn_94_3 = 0;
              } else {
                stackIn_94_3 = 42;
              }
              ((ci) (Object) stackIn_93_0).a(stackIn_93_1, stackIn_93_2 - stackIn_94_3 - var25_int, -2147483648, fe.field_g, var19);
              var12.field_Kb.field_db = Integer.toString(var12.field_Pb);
              var12.field_Kb.a(-40 + var12.field_M, 40, -2147483648, fe.field_g, var19);
              var19 = var19 + fe.field_g;
              if (var12.field_Ob.field_F &&
                var22 != 0) {
                pc.field_Mb = var12.field_Lb;
                if (((p.field_m != null)) &&
                  ((null != p.field_m[var12.field_Vb]))) {
                  pc.field_Mb = pc.field_Mb + " - " + p.field_m[var12.field_Vb];
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (var12.field_Ob.field_F &&
                  p.field_m != null &&
                  p.field_m[var12.field_Vb] != null) {
                  pc.field_Mb = p.field_m[var12.field_Vb];
                }
              }
            }
            var23 = of.a(var12.field_Mb, -26564, var20);
            if (var23 != null) {
              var24_intLifetime1 = var12.field_Xb.field_xb.b(var23, var12.field_M - ri.field_g - ri.field_g);
              var12.field_Xb.field_eb = var12.field_Sb * 256 / ig.field_g;
              var12.field_Xb.field_db = var23;
              var12.field_Xb.a(ri.field_g, -(ri.field_g * 2) + var12.field_M, param0 + 2147462161, fe.field_g * var24_intLifetime1, var19);
              var19 = var19 + fe.field_g * var24_intLifetime1;
            }
            if (var9Lifetime1 == 0) {
              var12.field_N = var19 - var12.field_pb;
            }
            if (var13 != 0) {
              param1.field_Kb.a(true, (ci) (var11), 2, var12);
            }
            if (var12.field_L != 0 &&
              !var12.l(param0 ^ 21486)) {
              if (var12.field_Gb.field_L == 0) {
                if (0 == var12.field_Ub.field_L) {
                  da.a(var12, ag.field_f, 0, 0, re.field_m, param1, false);
                } else {
                  fd.a(param3, -109, var12.field_Yb);
                }
              } else {
                ue.a(var12.field_Yb, 16581, param3);
              }
            }
            if (var12.field_Db) {
              if (var12.l(param0 ^ 21486)) {
                var11 = var12;
                var12 = (r) (var10.a((byte) -126));
                continue;
              }
              var24 = null;
              if (~var12.field_Yb != ~gb.field_t) {
                if (var5_int != 0 &&
                  !var12.field_Hb) {
                  var24 = oc.a(ib.field_b, new String[]{var20}, (byte) -78);
                  var30 = var24;
                  var25 = var30;
                  var24 = var25;
                  var30Lifetime1 = var24;
                  var25 = var30Lifetime1;
                } else {
                  if (var12.field_Jb < var7) {
                    var25_int = -var12.field_Jb + var7;
                    if (1 == var25_int) {
                      var24 = oc.a(ln.field_bc, new String[]{var20}, (byte) -93);
                    }
                    var24 = oc.a(tl.field_Eb, new String[]{var20, Integer.toString(var25_int)}, (byte) -61);
                  } else {
                    if (var6 <= var12.field_Pb) {
                      if (0 != (var8 & ~var12.field_Wb)) {
                        var25_int = ie.a(var8 & ~var12.field_Wb, (byte) -59);
                        var24 = oc.a(jc.field_b, new String[]{var20}, (byte) -94);
                        if (var25_int > 0 &&
                          la.field_b != null &&
                          var25_int <= la.field_b.length &&
                          la.field_b[-1 + var25_int] != null) {
                          var24 = oc.a(la.field_b[var25_int - 1][2], new String[]{var20}, (byte) -71);
                        }
                      }
                    } else {
                      var24 = oc.a(wk.field_h, new String[]{var20, Integer.toString(var6)}, (byte) -73);
                    }
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_Hb) {
                  var24 = ja.field_e;
                } else {
                  if (var12.field_Jb >= var7) {
                    if (var12.field_Pb < var6) {
                      var24 = oc.a(of.field_b, new String[]{null, Integer.toString(var6)}, (byte) -124);
                    } else {
                      if ((~var12.field_Wb & var8) != 0) {
                        var25_int = ie.a(var8 & ~var12.field_Wb, (byte) -59);
                        var24 = ob.field_x;
                        if (0 < var25_int &&
                          null != la.field_b &&
                          la.field_b.length >= var25_int &&
                          la.field_b[-1 + var25_int] != null) {
                          var24 = la.field_b[var25_int - 1][1];
                        }
                      }
                    }
                  } else {
                    var25_int = -var12.field_Jb + var7;
                    if (var25_int == 1) {
                      var24 = qd.field_l;
                    }
                    var24 = oc.a(hj.field_j, new String[]{null, Integer.toString(var25_int)}, (byte) -43);
                  }
                }
              }
              if (var24 != null) {
                var34 = "<col=A00000>" + (String) (var24);
                var30_ref = var34;
                var25 = var30_ref;
                var24 = var25;
                var30_refLifetime1 = var34;
                var25 = var30_refLifetime1;
                var25 = null;
                var26Lifetime1 = 0;
                for (var27_int = 0; qa.field_e > var27_int; var27_int++) {
                  var28 = pd.field_Rb.field_sc[var27_int] & 255;
                  var29 = 0;
                  if (null != t.field_L &&
                    null != t.field_L[var27_int] &&
                    t.field_L[var27_int][var28] &&
                    !var12.field_Hb) {
                    var29 = 1;
                  }
                  if (uj.field_k != null &&
                    null != uj.field_k[var27_int]) {
                    var30_int = uj.field_k[var27_int][var28];
                    if (0 != var30_int &&
                      !lf.field_U &&
                      !var12.field_Hb) {
                      var29 = 1;
                    }
                    if (var30_int > var12.field_Pb) {
                      var29 = 1;
                    }
                  }
                  if (null != il.field_b &&
                    il.field_b[var27_int] != null) {
                    var30_intLifetime1 = il.field_b[var27_int][var28];
                    if (var30_intLifetime1 != 0 &&
                      !lf.field_U &&
                      !var12.field_Hb) {
                      var29 = 1;
                    }
                    if (var12.field_Jb < var30_intLifetime1) {
                      var29 = 1;
                    }
                  }
                  if (null != nk.field_r &&
                    null != nk.field_r[var27_int] &&
                    (nk.field_r[var27_int][var28] & ~var12.field_Wb) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + td.field_n[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 == null) {
                      var25 = var30_refLifetime2;
                      var24 = var25;
                      var24 = var25;
                    } else {
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                      var26Lifetime1 = 1;
                    }
                  }
                }
                if (param1 == se.field_S &&
                  ci.f(-38)) {
                  if (var26Lifetime1 != 0) {
                    var24 = var34 + "<br>" + ca.field_f + (String) (var25);
                  } else {
                    var24 = var34 + "<br>" + oc.a(uh.field_o, new String[]{(String) (var25)}, (byte) -107);
                  }
                } else {
                  if (var26Lifetime1 == 0) {
                    var24 = var34 + "<br>" + oc.a(ij.field_b, new String[]{(String) (var25)}, (byte) -83);
                  } else {
                    var24 = var34 + "<br>" + gg.field_l + (String) (var25);
                  }
                }
                if (se.field_S == param1 &&
                  !ci.f(-125)) {
                  var27 = pd.field_Rb.field_Gb;
                  var24 = (String) (var24) + "<br>" + oc.a(fc.field_b, new String[]{var27}, (byte) -53);
                }
                pc.field_Mb = (String) (var24);
              }
            }
            var11 = var12;
            var12 = (r) (var10.a((byte) -126));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_212_0 = var5;
          stackIn_212_1 = new StringBuilder().append("s.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_213_2 = "null";
          } else {
            stackIn_213_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_212_0), ((StringBuilder) (Object) stackIn_212_1).append(stackIn_213_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void h(int param0) {
        int var2 = 7 % ((param0 + 8) / 57);
        if (!this.i(0)) {
          return;
        }
        sf.a(-122, this.field_L.field_v);
    }

    final static boolean a(char param0, int param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Chess.field_G;
        try {
          if ((param1 >= param0 ||
            param0 >= 128) &&
            (param0 < 160 ||
            param0 > 255)) {
            if (param0 != 0) {
              var6 = jn.field_M;
              var2 = var6;
              for (var3 = 0; var6.length > var3; var3++) {
                var4 = var6[var3];
                if (param0 == var4) {
                  return true;
                }
              }
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2_ref), "s.N(" + param0 + ',' + param1 + ')');
        }
    }

    public s() {
        super(0, 0, 496, 0, (jm) null);
        this.field_L = new bg("", (rg) null, 12);
        hl var1 = new hl(rc.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, rb.field_b.field_C, -1, 2147483647, true);
        mf var2 = new mf(ce.field_c, var1, (rg) null);
        this.field_N = new fb(hg.field_a, (rg) null);
        this.field_P = new fb(ue.field_b, (rg) null);
        this.field_L.field_j = vc.field_a;
        this.field_L.a(-107, new uh(this.field_L));
        this.field_N.field_H = false;
        this.field_N.field_n = (jm) ((Object) new sf());
        this.field_P.field_n = (jm) ((Object) new wj());
        this.field_L.field_n = (jm) ((Object) new wc(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.a(var3, 34, 50, 270, 20);
        int var5 = 200;
        var3 += 50;
        this.b(var2, 95);
        var3 = var3 + (this.a(170, this.field_L, (byte) -98, var3, ng.field_d, tk.field_c) + 5);
        this.field_N.a(var3, 34, 40, var5, 496 - var5 >> 1);
        this.field_P.a(15 + var3, 34, 40, 60, 3 + var4);
        this.field_P.field_p = (rg) (this);
        this.field_N.field_p = (rg) (this);
        this.b(this.field_N, 95);
        this.b(this.field_P, 95);
        this.field_Q = new t((wl) (this));
        this.field_Q.a(20, 34, 150, -60 + (-this.field_L.field_y - this.field_L.field_u) + this.field_y, this.field_L.field_y + (this.field_L.field_u + 60));
        this.b(this.field_Q, 95);
        this.a(0, 34, var3 + (55 + var4), 496, 0);
    }

    public final void a(String param0, byte param1) {
        bg var3 = null;
        String var4 = null;
        String var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_L;
          var4 = param0;
          ((qn) ((Object) var3)).a(0, false, var4);
          if (param1 > -119) {
            var5 = (String) null;
            this.a((String) null, (byte) 121);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("s.A(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, mf param1, byte param2, int param3, String param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -98) {
            field_O = -62;
          }
          stackIn_3_0 = this.a(param4, param5, param1, param3, param0, 35, 3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("s.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_R = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
