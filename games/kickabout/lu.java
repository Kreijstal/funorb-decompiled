/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lu extends am {
    int field_n;
    int field_v;
    static ut[] field_p;
    static String[] field_x;
    int field_o;
    static String field_t;
    static String field_r;
    int field_s;
    int field_q;
    static String field_u;
    int field_w;

    final static void a(int param0, int param1) {
        ml var2 = or.field_d;
        var2.b(param1, (byte) 108);
        var2.field_n = var2.field_n + 1;
        int var3 = var2.field_n;
        if (param0 != 6773) {
          return;
        }
        var2.a(param0 - 6660, 5);
        var2.a(123, uv.field_i.field_bc);
        int var4 = (uv.field_i.field_Mb << 6) + uv.field_i.field_Wb;
        var2.a(106, var4);
        var2.a(0, uv.field_i.field_Eb.length, param0 ^ 1991213509, uv.field_i.field_Eb);
        var2.c(62, var2.field_n - var3);
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        hd stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        int stackIn_37_0 = 0;
        hd stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        boolean stackIn_157_2 = false;
        hd stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        boolean stackIn_162_2 = false;
        hd stackIn_166_0 = null;
        int stackIn_166_1 = 0;
        boolean stackIn_167_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        hd var6 = null;
        hd var7 = null;
        hd var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        String var13_ref = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        tf var17 = null;
        Object var18 = null;
        he var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        hd var21 = null;
        int[] var22 = null;
        String var24 = null;
        int[] var25 = null;
        hd var26 = null;
        int var11_intLifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13_intLifetime1;
        int var14_intLifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17_intLifetime1;
        int var18_intLifetime1;
        int var11_intLifetime2;
        int var16Lifetime1Lifetime1;
        var18 = null;
        var19 = Kickabout.field_G;
        try {
          dw.a(7, ee.field_b);
          if (uv.field_i != null) {
            boolean decompiledFrameRemainder0 = true;
            ac.field_b.field_lb = true;
            em.field_d.field_mb = 0;
            var21 = em.field_d;
            var26 = var21;
            var26.field_q = 0;
            ua.field_k.field_mb = 0;
            var6 = ua.field_k;
            var6.field_q = 0;
            nv.field_F.field_mb = 0;
            var7 = nv.field_F;
            var7.field_q = 0;
            if (!np.a(113)) {
              var9_ref_String = uv.field_i.field_ec;
              ci.field_h.field_E = vo.$cfr$intArgs$a$53ce4ab4c593(-18, bv.field_m, new String[]{var9_ref_String}).toUpperCase();
              nv.field_F.a(true, fp.field_p.field_q, 0, fp.field_p.field_mb - 40, 40);
              nv.field_F.field_E = vo.$cfr$intArgs$a$53ce4ab4c593(-18, wa.field_c, new String[]{var9_ref_String});
              var8 = nv.field_F;
            } else {
              ci.field_h.field_E = kf.field_zb.toUpperCase();
              var9 = (fp.field_p.field_q + 2) / 2;
              em.field_d.a(true, var9 - 2, 0, -40 + fp.field_p.field_mb, 40);
              if (uv.field_i.field_bc <= uv.field_i.field_gc) {
                em.field_d.field_E = no.field_I.toUpperCase();
                em.field_d.field_lb = false;
              } else {
                em.field_d.field_E = po.field_b.toUpperCase();
                em.field_d.field_lb = true;
              }
              em.field_d.field_R = vg.field_Qb.field_R;
              if (fh.field_b > 0) {
                if (fh.field_b == 1) {
                  var10_ref_String = kp.field_i;
                } else {
                  var10_ref_String = vo.$cfr$intArgs$a$53ce4ab4c593(-18, jb.field_f, new String[]{Integer.toString(fh.field_b)});
                }
                em.field_d.field_E = em.field_d.field_E + "<br>" + var10_ref_String;
                if ((16 & de.field_c) == 0 &&
                  !td.field_b) {
                  em.field_d.field_R = vg.field_Qb.field_S;
                }
              }
              ua.field_k.a(true, fp.field_p.field_q - var9, var9, -40 + fp.field_p.field_mb, 40);
              ua.field_k.field_E = hj.field_g.toUpperCase();
              stackIn_18_0 = ua.field_k;
              stackIn_19_1 = (param3) && (0L == vg.field_Ib);
              stackIn_18_0.field_lb = stackIn_19_1;
              var8 = ua.field_k;
              var10 = 2;
              if (la.field_k != null) {
                if (hm.field_G == null) {
                  m.field_f = new boolean[ss.field_j];
                  hm.field_G = new byte[ss.field_j];
                }
                for (var11_int = 0; ss.field_j > var11_int; var11_int++) {
                  m.field_f[var11_int] = false;
                }
                var10 = 0;
                L10: while (true) {
                  if (var10 < 2) {
                    var11_intLifetime2 = 0;
                    var12 = 0;
                    while (true) {
                      if (var12 >= la.field_k.length) {
                        if (var11_intLifetime2 != 0) {
                          break L10;
                        }
                        var10++;
                        continue L10;
                      }
                      var25 = la.field_k[var12];
                      var22 = var25;
                      var13 = var22;
                      var14_int = 0;
                      L14: while (true) {
                        if (var14_int >= var25.length) {
                          var11_intLifetime2 = 1;
                          var14_int = -1;
                          for (var15 = 0; var25.length > var15; var15 += 2) {
                            var16 = var25[var15];
                            if (var14_int < var16) {
                              var14_int = var16;
                            }
                          }
                          m.field_f[var14_int] = true;
                        } else {
                          var15 = var25[var14_int];
                          var16 = var13[var14_int + 1];
                          if (var15 != -1) {
                            if ((uv.field_i.field_Eb[var15] & 255) != var16) {
                              break L14;
                            }
                          } else {
                            if (0 == var10) {
                              stackIn_37_0 = uv.field_i.field_bc;
                            } else {
                              stackIn_37_0 = uv.field_i.field_gc;
                            }
                            var17_int = stackIn_37_0;
                            if (var17_int != var16) {
                              break L14;
                            }
                          }
                          var14_int += 2;
                          continue;
                        }
                        break;
                      }
                      var12++;
                    }
                  }
                  break;
                }
                if (!(2 > tk.field_Ib) &&
                  ne.field_G[12]) {
                  var10 = 2;
                }
              }
              if (var10 >= 2) {
                if ((null != ds.field_h ||
                  null != lh.field_E ||
                  null != so.field_f ||
                  null != hm.field_D)) {
                  var11_intLifetime1 = 0;
                  var12Lifetime1 = 0;
                  var13_int = 0;
                  var14_intLifetime1 = 0;
                  var15Lifetime1 = 0;
                  for (var16Lifetime1 = 0; var16Lifetime1 < ss.field_j; var16Lifetime1++) {
                    var17_intLifetime1 = 255 & uv.field_i.field_Eb[var16Lifetime1];
                    if (null != ds.field_h &&
                      ds.field_h[var16Lifetime1] != null &&
                      ds.field_h[var16Lifetime1][var17_intLifetime1]) {
                      var11_intLifetime1 = 1;
                    }
                    if (lh.field_E != null &&
                      lh.field_E[var16Lifetime1] != null) {
                      var18_int = lh.field_E[var16Lifetime1][var17_intLifetime1];
                      if (var18_int != 0 &&
                        !fv.field_d) {
                        var11_intLifetime1 = 1;
                      }
                      if (var18_int > var13_int) {
                        var13_int = var18_int;
                      }
                    }
                    L32: {
                      if (null != so.field_f) {
                        if (so.field_f[var16Lifetime1] == null) {
                          if (((null != hm.field_D)) &&
                            ((null != hm.field_D[var16Lifetime1]))) {
                            var15Lifetime1 = var15Lifetime1 | hm.field_D[var16Lifetime1][var17_intLifetime1];
                          }
                          break L32;
                        }
                        var18_intLifetime1 = so.field_f[var16Lifetime1][var17_intLifetime1];
                        if (var18_intLifetime1 > var14_intLifetime1) {
                          var14_intLifetime1 = var18_intLifetime1;
                        }
                        if (var18_intLifetime1 != 0 &&
                          !fv.field_d) {
                          var11_intLifetime1 = 1;
                        }
                      }
                      if (null != hm.field_D &&
                        null != hm.field_D[var16Lifetime1]) {
                        var15Lifetime1 = var15Lifetime1 | hm.field_D[var16Lifetime1][var17_intLifetime1];
                      }
                    }
                  }
                  var16Lifetime1Lifetime1 = 0;
                  var17 = bs.field_c.field_Ab.field_jb;
                  var18_ref = (he) (var17.g(24009));
                  L25: while (true) {
                    if (var18_ref != null) {
                      if (!var18_ref.h(-13356)) {
                        if (var11_intLifetime1 != 0 &&
                          !var18_ref.field_Cb) {
                          var16Lifetime1Lifetime1 = 1;
                          break L25;
                        }
                        if (var18_ref.field_Qb < var13_int) {
                          var16Lifetime1Lifetime1 = 1;
                          break L25;
                        }
                        if (var14_intLifetime1 > var18_ref.field_Db) {
                          var16Lifetime1Lifetime1 = 1;
                          break L25;
                        }
                        if ((var15Lifetime1 & ~var18_ref.field_Pb) > 0) {
                          var16Lifetime1Lifetime1 = 1;
                          break L25;
                        }
                        if (var12Lifetime1 != 0) {
                          var16Lifetime1Lifetime1 = 1;
                          break L25;
                        }
                      }
                      var18_ref = (he) (var17.c(param2 ^ -33));
                      continue;
                    }
                    break;
                  }
                  if (tk.field_Ib >= 2 &&
                    ne.field_G[12]) {
                    var16Lifetime1Lifetime1 = 0;
                  }
                  if ((var16Lifetime1Lifetime1 != 0)) {
                    ua.field_k.field_lb = false;
                    if (!(!ua.field_k.field_Q)) {
                      if (ni.field_l.field_b.field_Db != 0) {
                        sn.field_e = vo.$cfr$intArgs$a$53ce4ab4c593(-18, pu.field_Fb, new String[]{c.field_d});
                      } else {
                        sn.field_e = pp.field_m;
                      }
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                ua.field_k.field_lb = false;
                if (ua.field_k.field_Q) {
                  var11 = null;
                  var12Lifetime2 = 0;
                  for (var13_intLifetime1 = 0; ss.field_j > var13_intLifetime1; var13_intLifetime1++) {
                    if (m.field_f[var13_intLifetime1]) {
                      var24 = "<col=A00000>" + ok.field_b[var13_intLifetime1] + "</col>";
                      if (var11 == null) {
                        var11 = var24;
                      } else {
                        var12Lifetime2 = 1;
                        var11 = (String) (var11) + ", " + var24;
                      }
                    }
                  }
                  if (var10 != 0) {
                    var13_ref = os.field_w;
                    if (var12Lifetime2 == 0) {
                      var14 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, bp.field_yb, new String[]{(String) (var11)});
                    } else {
                      var14 = oi.field_k + (String) (var11);
                    }
                  } else {
                    var13_ref = sb.field_g;
                    if (var12Lifetime2 != 0) {
                      var14 = gm.field_S + (String) (var11);
                    } else {
                      var14 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, kb.field_D, new String[]{(String) (var11)});
                    }
                  }
                  sn.field_e = "<col=A00000>" + var13_ref + "<br>" + var14;
                }
              }
            }
            if (vg.field_Ib != 0L) {
              var9 = (int)(-nj.a(22) + vg.field_Ib);
              var9 = (var9 + 999) / 1000;
              if (var9 < 1) {
                var9 = 1;
              }
              var8.field_E = vo.$cfr$intArgs$a$53ce4ab4c593(-18, gf.field_h, new String[]{Integer.toString(var9)});
            }
            ka.field_c.field_E = vo.$cfr$intArgs$a$53ce4ab4c593(-18, ib.field_F, new String[]{Integer.toString(uv.field_i.field_gc), Integer.toString(uv.field_i.field_bc)});
          }
          stackIn_156_0 = dn.field_Cb;
          stackIn_156_1 = param2 ^ param2;
          stackIn_157_2 = (param0) && (!param4) && (!td.field_b);
          ((hd) (Object) stackIn_156_0).b(stackIn_156_1, stackIn_157_2);
          stackIn_161_0 = fp.field_p;
          stackIn_161_1 = 0;
          stackIn_162_2 = (param0) && (!param4) && (!td.field_b);
          ((hd) (Object) stackIn_161_0).b(stackIn_161_1, stackIn_162_2);
          stackIn_166_0 = tn.field_f;
          stackIn_166_1 = 0;
          stackIn_167_2 = (param0) && (!param4) && (td.field_b);
          ((hd) (Object) stackIn_166_0).b(stackIn_166_1, stackIn_167_2);
          ni.field_l.field_b.h((byte) 71);
          if (null != uv.field_i) {
            if (ac.field_b.field_sb != 0) {
              gu.a(uv.field_i.h((byte) 73), (byte) -108, param1);
            }
            if (ua.field_k.field_sb != 0) {
              gs.field_e = true;
            }
            if (em.field_d.field_sb != 0) {
              td.field_b = true;
            }
            if (kt.field_i.field_sb != 0) {
              td.field_b = false;
            }
            ma.a(param1, (byte) -57, uv.field_i, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var5), "lu.DB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_o << 3;
        param3 = (15 & var6) + (param3 << 4);
        int var7 = this.field_v << 3;
        param0 = (param0 << 4) + (var7 & 15);
        this.a(var6, var7, param3, param0, param2, param4);
        if (param1 != 24407) {
          lu.a(false, 46, 70, true, false);
        }
    }

    final static int a(hu param0, String param1, int param2, String[] param3, int param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = Kickabout.field_G;
        try {
          var5_int = param0.a(param1);
          if (param4 >= var5_int &&
            param1.indexOf("<br>") == -1) {
            param3[0] = param1;
            stackIn_4_0 = 1;
            return stackIn_4_0;
          }
          var6 = (param4 + var5_int - 1) / param4;
          param4 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param1.length();
          if (param2 != -46) {
            stackIn_7_0 = 59;
            return stackIn_7_0;
          }
          for (var9 = 0; var8 > var9; var9++) {
            var10 = param1.charAt(var9);
            if (var10 == 32 ||
              var10 == 45) {
              var11 = param1.substring(var7, 1 + var9).trim();
              var12 = param0.a(var11);
              if (var12 >= param4) {
                var7 = 1 + var9;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param3[incrementValue$1] = var11;
              }
            }
            if (var10 == 62 &&
              param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param3[incrementValue$2] = param1.substring(var7, -3 + var9).trim();
              var7 = 1 + var9;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param3[incrementValue$0] = param1.substring(var7, var8).trim();
          }
          stackIn_26_0 = var6Lifetime1;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("lu.FB(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void g(byte param0) {
        if (param0 != -28) {
          lu.a(47, -58);
        }
        field_p = null;
        field_t = null;
        field_r = null;
        field_u = null;
        field_x = null;
    }

    lu() {
    }

    static {
        field_x = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_r = "Type your age in years";
        field_u = "Only show private chat from my friends and opponents";
    }
}
