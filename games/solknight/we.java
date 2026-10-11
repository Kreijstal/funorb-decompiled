/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we implements j {
    private int field_j;
    private int field_i;
    private int field_g;
    private int field_a;
    private int field_d;
    static int field_h;
    private int field_f;
    static int field_c;
    private mg field_k;
    private int field_b;
    static int field_e;

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 != 2) {
          return 'N';
        }
        var2 = param1;
        if (var2 == 32) {
          return '_';
        }
        if (var2 == 160) {
          return '_';
        }
        if (var2 == 95) {
          return '_';
        }
        if (var2 == 45) {
          return '_';
        }
        if (var2 == 91) {
          return param1;
        }
        if (var2 != 93 &&
          35 != var2) {
          if (var2 != 224 &&
            225 != var2) {
            if (226 == var2) {
              return 'a';
            }
            if (var2 != 228 &&
              var2 != 227) {
              if (var2 == 192) {
                return 'a';
              }
              if (var2 != 193 &&
                var2 != 194) {
                if (var2 == 196) {
                  return 'a';
                }
                if (var2 != 195) {
                  if (232 != var2 &&
                    var2 != 233 &&
                    var2 != 234) {
                    if (var2 == 235) {
                      return 'e';
                    }
                    if (var2 != 200) {
                      if (201 == var2) {
                        return 'e';
                      }
                      if (var2 != 202 &&
                        var2 != 203) {
                        if (237 != var2 &&
                          var2 != 238 &&
                          239 != var2 &&
                          205 != var2 &&
                          var2 != 206 &&
                          var2 != 207) {
                          if (var2 != 242) {
                            if (var2 == 243) {
                              return 'o';
                            }
                            if (var2 != 244) {
                              if (246 == var2) {
                                return 'o';
                              }
                              if (var2 != 245 &&
                                var2 != 210 &&
                                var2 != 211) {
                                if (212 == var2) {
                                  return 'o';
                                }
                                if (214 == var2) {
                                  return 'o';
                                }
                                if (var2 != 213) {
                                  if (var2 != 249 &&
                                    var2 != 250 &&
                                    251 != var2) {
                                    if (var2 == 252) {
                                      return 'u';
                                    }
                                    if (217 != var2) {
                                      if (var2 == 218) {
                                        return 'u';
                                      }
                                      if (var2 == 219) {
                                        return 'u';
                                      }
                                      if (220 != var2) {
                                        if (var2 != 231 &&
                                          var2 != 199) {
                                          if (var2 == 255) {
                                            return 'y';
                                          }
                                          if (376 == var2) {
                                            return 'y';
                                          }
                                          if (var2 == 241) {
                                            return 'n';
                                          }
                                          if (var2 == 209) {
                                            return 'n';
                                          }
                                          if (var2 == 223) {
                                            return 'b';
                                          }
                                          return Character.toLowerCase(param1);
                                        }
                                        return 'c';
                                      }
                                    }
                                  }
                                  return 'u';
                                }
                              }
                            }
                          }
                          return 'o';
                        }
                        return 'i';
                      }
                    }
                  }
                  return 'e';
                }
              }
            }
          }
          return 'a';
        }
        return param1;
    }

    final static void a(boolean param0) {
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        boolean stackIn_56_2 = false;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        boolean stackIn_65_2 = false;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        boolean stackIn_73_2 = false;
        RuntimeException decompiledCaughtException = null;
        o var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        o var9 = null;
        int var10 = 0;
        o var11 = null;
        o var12 = null;
        String var14 = null;
        o var16 = null;
        String var17 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime3;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          if (kc.field_Q != null &&
            kc.field_Q.c((byte) -121) &&
            kc.field_Q.a(2, "benefits") &&
            eb.field_b != null &&
            eb.field_b.c((byte) -121) &&
            eb.field_b.a(2, "benefits")) {
            of.field_f = rb.a("headline", "benefits", kc.field_Q, (byte) -120);
            pf.field_b = rb.a("blurbpane", "benefits", kc.field_Q, (byte) -126);
            r.field_d = rb.a("button", "benefits", kc.field_Q, (byte) -117);
            a.field_e = rb.a("signup_text", "benefits", kc.field_Q, (byte) -119);
            jh.field_b = rb.a("menu_text", "benefits", kc.field_Q, (byte) -114);
            dh.field_j = rb.a("button_frame", "benefits", kc.field_Q, (byte) -121);
            kj.field_S = rb.a("arrow", "benefits", kc.field_Q, (byte) -111);
            kg.field_a = (mg) ((Object) lc.a(kc.field_Q, 1, "large_font", "benefits", eb.field_b));
            sk.field_n = (mg) ((Object) lc.a(kc.field_Q, 1, "small_font", "benefits", eb.field_b));
            var28 = mi.field_f;
            var2 = mi.field_a;
            var3 = mi.field_d;
            mi.b(lj.field_D);
            var11 = new o(kj.field_S.field_p + 4, 4 + kj.field_S.field_t);
            var11.a();
            kj.field_S.e(2, 2, ea.field_o);
            rc.a(var11.field_p, 0, var11.field_t, 2, var11, 0, 1, (byte) 21);
            kj.field_S = var11;
            fh.field_f = kj.field_S.b();
            var12 = new o(195, 221);
            var6 = var12.field_p / 2;
            var12.a();
            kg.field_a.a(bb.a(og.field_e, new String[]{n.field_c}, -63), var6, 40, 16777215, -1);
            sk.field_n.a(bb.a(b.field_a, new String[]{n.field_c}, -63), var6, 60, 16777215, -1);
            kg.field_a.a(bb.a(l.field_d, new String[]{sf.field_b}, -63), var6, 110, 16777215, -1);
            sk.field_n.a(bb.a(hb.field_l, new String[]{sf.field_b}, -63), var6, 130, 16777215, -1);
            kg.field_a.a(le.field_b, var6, 180, 16777215, -1);
            sk.field_n.a(ki.field_A, var6, 200, 16777215, -1);
            rc.a(var12.field_p, 0, var12.field_t, 3, var12, 0, 1, (byte) 21);
            pf.field_b.a();
            var12.d(18 - pf.field_b.field_s, 241 - pf.field_b.field_n);
            for (var7 = 0; ba.field_s.length > var7; var7++) {
              qd.field_e[var7].a();
              sk.field_n.a(ba.field_s[var7], 3, 3, qd.field_e[var7].field_p - 6, -6 + qd.field_e[var7].field_t, ea.field_o, -1, 1, 1, sk.field_n.field_F + sk.field_n.field_s);
              rc.a(qd.field_e[var7].field_p, 0, qd.field_e[var7].field_t, 3, qd.field_e[var7], 0, 1, (byte) 21);
            }
            ba.field_s = null;
            ke.field_K = a.field_e.c();
            ke.field_K.a();
            ii.a(mi.field_d * 2 / 3, 0, 0, 64, mi.field_a, true);
            mi.a(var28, var2, var3);
            mi.a(lj.field_D);
            sa.field_m = 231 + (-dh.field_j.field_p + r.field_d.field_p) / 2;
            kc.field_Q = null;
            lk.field_c = (r.field_d.field_t - dh.field_j.field_t) / 2 + 390;
            da.field_f = 390 + (-dh.field_j.field_t + r.field_d.field_t) / 2;
            ke.field_I = 434 + (r.field_d.field_p - dh.field_j.field_p) / 2;
          }
          if (!param0) {
            field_e = 49;
          }
          if (va.field_g == null) {
            return;
          }
          if (ja.field_a != null &&
            kg.field_a != null) {
            var29 = mi.field_f;
            var2Lifetime1 = mi.field_a;
            var3Lifetime1 = mi.field_d;
            mi.b(lj.field_D);
            var14 = bb.a(tk.field_q, new String[]{eb.field_d[uf.field_q]}, -63);
            var5 = kg.field_a.c(var14, jj.field_db);
            var6Lifetime1 = kg.field_a.b(var14, jj.field_db, kg.field_a.field_F + kg.field_a.field_s);
            var7Lifetime1 = ji.field_a + (-var5 + jj.field_db) / 2;
            var8 = cl.field_o + (ii.field_h - var6Lifetime1) / 2;
            var5 += 6;
            var7Lifetime1 -= 3;
            if (var7Lifetime1 < 0) {
              var9_int = -var7Lifetime1;
              ja.field_a.field_q = ja.field_a.field_q + 2 * var9_int;
              gf.field_T = gf.field_T - var9_int;
              var7Lifetime1 = var7Lifetime1 + var9_int;
              ji.field_a = ji.field_a + var9_int;
              var5 = var5 + var9_int * 2;
              ja.field_a.field_s = ja.field_a.field_s + var9_int;
            }
            var6Lifetime1 += 6;
            var8 -= 3;
            if (ja.field_a.field_q < var5 + var7Lifetime1) {
              var9_intLifetime1 = -ja.field_a.field_q + (var5 + var7Lifetime1);
              ji.field_a = ji.field_a + var9_intLifetime1;
              var5 = var5 + 2 * var9_intLifetime1;
              gf.field_T = gf.field_T - var9_intLifetime1;
              ja.field_a.field_s = ja.field_a.field_s + var9_intLifetime1;
              ja.field_a.field_q = ja.field_a.field_q + var9_intLifetime1 * 2;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
            }
            if (var8 < 0) {
              var9_intLifetime2 = -var8;
              ja.field_a.field_n = ja.field_a.field_n + var9_intLifetime2;
              cl.field_o = cl.field_o + var9_intLifetime2;
              ja.field_a.field_r = ja.field_a.field_r + var9_intLifetime2 * 2;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime2 * 2;
              var8 = var8 + var9_intLifetime2;
              ke.field_N = ke.field_N - var9_intLifetime2;
            }
            if (ja.field_a.field_r < var6Lifetime1 + var8) {
              var9_intLifetime3 = var6Lifetime1 + var8 - ja.field_a.field_r;
              ke.field_N = ke.field_N - var9_intLifetime3;
              cl.field_o = cl.field_o + var9_intLifetime3;
              ja.field_a.field_n = ja.field_a.field_n + var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
              ja.field_a.field_r = ja.field_a.field_r + 2 * var9_intLifetime3;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime3 * 2;
            }
            ja.field_a.d();
            var9 = new o(ja.field_a.field_q, ja.field_a.field_r);
            var9.a();
            kg.field_a.a(var14, ji.field_a, cl.field_o, jj.field_db, ii.field_h, 16777215, -1, 1, 1, kg.field_a.field_F + kg.field_a.field_s);
            rc.a(var9.field_q, 0, var9.field_r, 3, var9, 0, 1, (byte) 21);
            ja.field_a.a();
            var9.d(0, 0);
            rh.field_g = new o(640, 480);
            rh.field_g.a();
            ja.field_a.b((ja.field_a.field_q >> 1) + gf.field_T, ke.field_N + (ja.field_a.field_r >> 1), aj.field_p, 4096);
            ja.field_a = null;
            rh.field_g.f();
            mi.a(var29, var2Lifetime1, var3Lifetime1);
            mi.a(lj.field_D);
          }
          if (null != qk.field_n &&
            null != sk.field_n) {
            var30 = mi.field_f;
            var2Lifetime2 = mi.field_a;
            var3Lifetime2 = mi.field_d;
            mi.b(lj.field_D);
            var16 = new o(412, 43);
            var17 = bb.a(wb.field_d, new String[]{qk.field_n}, -63);
            qk.field_n = null;
            var16.a();
            sk.field_n.a(var17, 3, 3, var16.field_p - 6, -6 + var16.field_t, 16777215, -1, 0, 1, sk.field_n.field_F + sk.field_n.field_s);
            rc.a(var16.field_p, 0, var16.field_t, 3, var16, 0, 1, (byte) 21);
            va.field_g.a();
            var16.d(199 - va.field_g.field_s, -va.field_g.field_n + 83);
            mi.a(var30, var2Lifetime2, var3Lifetime2);
            mi.a(lj.field_D);
          }
          if (dc.field_j != null &&
            null != sk.field_n) {
            var31 = mi.field_f;
            var2Lifetime3 = mi.field_a;
            var3Lifetime3 = mi.field_d;
            mi.b(lj.field_D);
            var4 = sk.field_n.c(dc.field_p, 640) + 6;
            var5Lifetime1 = dc.field_j.field_q + var4 + 20;
            var6Lifetime2 = -(var5Lifetime1 / 2) + 427;
            var7Lifetime2 = 20 + (dc.field_j.field_q + var6Lifetime2);
            va.field_g.a();
            sk.field_n.c(dc.field_p, -va.field_g.field_s + var7Lifetime2, sk.field_n.field_s + (sk.field_n.field_F + (-va.field_g.field_n + 155)), 16777215, -1);
            rc.a(var4, var7Lifetime2 - va.field_g.field_s - 4, 50, 3, va.field_g, 155 - va.field_g.field_n, 1, (byte) 21);
            var8Lifetime1 = -va.field_g.field_n + 155 - (-sk.field_n.field_F - 3 + dc.field_j.field_r - sk.field_n.field_s) / 2;
            dc.field_j.d(var6Lifetime2 - va.field_g.field_s, var8Lifetime1);
            mi.a(var31, var2Lifetime3, var3Lifetime3);
            mi.a(lj.field_D);
            dc.field_j = null;
          }
          mi.b(lj.field_D);
          mi.a(16, 16, 608, 112, 15, rb.field_f, id.field_a);
          mi.a(231, 144, 393, 232, 15, rb.field_f, id.field_a);
          if (of.field_f != null) {
            of.field_f.d(0, 0);
          }
          if (pf.field_b != null) {
            pf.field_b.d(0, 0);
          }
          va.field_g.d(0, 0);
          if (rh.field_g != null) {
            rh.field_g.d(0, 0);
          }
          if (null != r.field_d &&
            null != dh.field_j) {
            r.field_d.d(231, 390);
            var1 = a.field_e;
            if (qh.field_b.field_f == 0) {
              var1 = ke.field_K;
            }
            var1.d(0, 0);
            stackIn_50_0 = 40;
            stackIn_50_1 = wd.field_a;
            if (0 != qh.field_b.field_f) {
              stackIn_51_2 = 3;
            } else {
              stackIn_51_2 = 4;
            }
            var2Lifetime4 = (stackIn_50_0 * kb.a(stackIn_50_1 << stackIn_51_2, false) >> 16) + 40;
            if (var2Lifetime4 > 0) {
              r.field_d.a(230, 389, var2Lifetime4);
              r.field_d.a(232, 389, var2Lifetime4);
              r.field_d.a(232, 391, var2Lifetime4);
              r.field_d.a(230, 391, var2Lifetime4);
              var1.a(1, 1, var2Lifetime4);
              var1.a(-1, 1, var2Lifetime4);
              var1.a(1, -1, var2Lifetime4);
              var1.a(-1, -1, var2Lifetime4);
            }
            stackIn_55_0 = -50;
            stackIn_55_1 = sa.field_m;
            stackIn_56_2 = (qh.field_b.field_f == 0);
            kb.a(stackIn_55_0, stackIn_55_1, stackIn_56_2, da.field_f);
          }
          if (null != r.field_d &&
            dh.field_j != null) {
            r.field_d.d(434, 390);
            jh.field_b.d(0, 0);
            if (qh.field_b.field_f == 1) {
              ii.a(7 * r.field_d.field_t / 12, 436, 392, 64, r.field_d.field_p - 4, true);
            }
            stackIn_64_0 = -36;
            stackIn_64_1 = ke.field_I;
            stackIn_65_2 = (qh.field_b.field_f == 1);
            kb.a(stackIn_64_0, stackIn_64_1, stackIn_65_2, lk.field_c);
          }
          if (kj.field_S != null) {
            var1_int = -(kj.field_S.field_r / 2) + 357;
            kj.field_S.d(269 - kj.field_S.field_q, var1_int);
            fh.field_f.d(586, var1_int);
            if (var1_int < ad.field_m &&
              var1_int + kj.field_S.field_t > ad.field_m) {
              stackIn_72_0 = 40;
              stackIn_72_1 = wd.field_a << 4;
              stackIn_73_2 = !(param0);
              var2Lifetime5 = stackIn_72_0 + (kb.a(stackIn_72_1, stackIn_73_2) * 40 >> 16);
              if (var2Lifetime5 <= 0) {
                ac.a((byte) -125);
                qd.field_e[field_h].d(269, 340);
                return;
              }
              if (gb.field_j > 269 - kj.field_S.field_p &&
                gb.field_j < 269) {
                kj.field_S.a(269 - kj.field_S.field_q - 1, -1 + var1_int, var2Lifetime5);
                kj.field_S.a(1 + (-kj.field_S.field_q + 269), -1 + var1_int, var2Lifetime5);
                kj.field_S.a(-1 + (-kj.field_S.field_q + 269), 1 + var1_int, var2Lifetime5);
                kj.field_S.a(-kj.field_S.field_q + 269 + 1, 1 + var1_int, var2Lifetime5);
              } else {
                if (586 < gb.field_j &&
                  gb.field_j < kj.field_S.field_p + 586) {
                  fh.field_f.a(585, -1 + var1_int, var2Lifetime5);
                  fh.field_f.a(587, var1_int - 1, var2Lifetime5);
                  fh.field_f.a(585, 1 + var1_int, var2Lifetime5);
                  fh.field_f.a(587, var1_int + 1, var2Lifetime5);
                }
              }
            }
          }
          ac.a((byte) -125);
          qd.field_e[field_h].d(269, 340);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1_ref), "we.D(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          var5 = fb.field_b;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          if (param0 <= 5) {
            field_c = -27;
          }
          while (var2 < var3) {
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1_ref), "we.B(" + param0 + ')');
        }
    }

    final static void a(String param0, int param1) {
        if (param1 != -1) {
          we.a(-78);
        }
        System.out.println("Error: " + hl.a(param0, "\n", "%0a", true));
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        be var14 = null;
        rc stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          if (param4 instanceof be) {
            stackIn_3_0 = (rc) (param4);
          } else {
            stackIn_3_0 = null;
          }
          var14 = (be) (stackIn_3_0);
          mi.b(param4.field_m + param3, param1 + param4.field_j, param4.field_t, param4.field_x, this.field_f);
          if (param0 <= 113) {
            we.a(-104, 'P');
          }
          if (var14 == null) {
          }
          var7 = var14.field_N + param3 + param4.field_m;
          var8 = var14.field_P + param1 + param4.field_j;
          mi.e(var7, var8, var14.field_O, this.field_a);
          if (var14.field_M != -1) {
            var9 = 2.0 * ((double)var14.field_M * 3.141592653589793) / (double)var14.field_L;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_O);
            var12 = (int)(Math.cos(var9) * (double)var14.field_O);
            mi.e(var11 + var7, var8 + var12, 1, this.field_g);
          }
          mi.e(var7, var8, 2, 1);
          var9Lifetime1 = 3.141592653589793 * (double)var14.field_Q * 2.0 / (double)var14.field_L;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_O);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_O);
          mi.e(var7, var8, var11Lifetime1 + var7, var12Lifetime1 + var8, 1);
          if (this.field_k != null) {
            var13 = var14.field_O + var14.field_N + this.field_j;
            this.field_k.a(param4.field_i, var13 + (param4.field_m + param3), this.field_d + (param4.field_j + param1), -var13 - (this.field_j - param4.field_t), -(this.field_j << 1) + param4.field_x, this.field_i, this.field_b, 1, 1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("we.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    we(mg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_g = param6;
          this.field_k = param0;
          this.field_j = param1;
          this.field_b = param4;
          this.field_i = param3;
          this.field_a = param5;
          this.field_d = param2;
          this.field_f = param7;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
    }
}
