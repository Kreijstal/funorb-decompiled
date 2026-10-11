/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class ArcanistsMulti extends ud {
    static String field_H;
    static String field_F;
    public static boolean field_G;

    final static boolean i(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -45) {
            field_H = (String) null;
          }
          stackIn_10_0 = (lc.a((byte) 112)) || !(ah.field_c > 0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "ArcanistsMulti.PA(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 115 / ((param0 + 83) / 41);
          sb.a(8000);
          if (null != ka.field_m) {
            u.b(6);
          }
          hg.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "ArcanistsMulti.G(" + param0 + ')');
        }
    }

    private final void e(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != va.field_c) {
            rg.a(va.field_c, (byte) 22);
            va.field_c = null;
            bk.a(2);
          }
          hb.field_Fb = sd.a(6, (byte) 62);
          ue.field_d = sd.a(1, (byte) 23);
          so.field_k = sd.a(7, (byte) 11);
          vg.field_l = sd.a(2, (byte) 55);
          mg.field_E = sd.a(3, (byte) 36);
          if (!param0) {
            this.m(-126);
          }
          ki.field_s = sd.a(4, (byte) 123);
          tc.field_x = sd.a(5, (byte) 121);
          ck.field_b = sd.a(10, (byte) 6);
          wh.field_l = sd.a(12, (byte) 49);
          ua.field_K = sd.a(13, (byte) 27);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ArcanistsMulti.LA(" + param0 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param0.getParameter("username");
          if (null != var2 &&
            be.a((CharSequence) ((Object) var2), false) != 0L) {
            if (param1 != -1) {
              field_F = (String) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("ArcanistsMulti.VA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void f(byte param0) {
        boolean discarded$0 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_11_2 = false;
        boolean stackIn_59_0 = false;
        boolean stackIn_99_0 = false;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_173_0 = 0;
        int stackIn_177_0 = 0;
        int[] stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        int stackIn_183_2 = 0;
        int stackIn_183_3 = 0;
        int stackIn_192_2 = 0;
        boolean[] stackIn_196_0 = null;
        int stackIn_196_1 = 0;
        boolean stackIn_197_2 = false;
        int stackIn_209_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_233_0 = 0;
        int stackIn_263_0 = 0;
        int stackIn_263_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        Object var2 = null;
        int[] var3_ref_int__ = null;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        int var8 = 0;
        int[][] var9 = null;
        int[][] var10 = null;
        int[] var11 = null;
        boolean[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        le var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] stackIn_183_0Lifetime1;
        int stackIn_183_1Lifetime1;
        int stackIn_183_2Lifetime1;
        int stackIn_183_3Lifetime1;
        int stackIn_209_0Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var4Lifetime2;
        var27 = field_G ? 1 : 0;
        try {
          be.a(1497225488);
          hk.field_o = ao.a(true);
          mo.e(200);
          if (null != ka.field_m &&
            ka.field_m.field_e) {
            u.b(6);
          }
          stackIn_10_1 = true;
          stackIn_11_2 = (null != ka.field_m);
          this.a(stackIn_10_1, stackIn_11_2);
          an.field_j = ce.field_m.field_m;
          an.field_f = ce.field_m.field_e;
          bi.field_I = (an.field_f - 640) / 2;
          uc.field_a = (-480 + an.field_j) / 2;
          if (ja.field_y) {
            this.e(true);
            ja.field_y = false;
          }
          jb.field_v = jb.field_v + 1;
          if (oc.a(-15576)) {
            this.d(-107);
            if (oc.a(-15576)) {
              if (ue.a(123)) {
                discarded$0 = this.a(123, false);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (ue.field_e) {
            if (hn.a((byte) -52)) {
              if (!rc.b(-1)) {
                if (um.a((byte) -5)) {
                  if (~ii.field_c == ~ii.field_a) {
                    var2_int = we.b(-3);
                    if (1 == var2_int) {
                      if (si.field_g == 0) {
                        pi.field_c = true;
                      }
                      ul.a(ud.field_o, (byte) -98, 0);
                    }
                    this.a((byte) -89, true);
                    decompiledFrameRemainder0 = (var27 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    this.a((byte) -89, false);
                    decompiledFrameRemainder0 = (var27 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  this.a((byte) -89, false);
                  decompiledFrameRemainder0 = (var27 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_59_0 = (ka.field_m != null);
                var2_intLifetime2 = ka.a(stackIn_59_0, (byte) 22, (ud) (this));
                if (2364824 != var2_intLifetime2) {
                  if (1 == var2_intLifetime2 ||
                    2 == var2_intLifetime2) {
                    if (ka.field_m != null) {
                      u.b(6);
                    }
                    if (2 == var2_intLifetime2) {
                      im.a((byte) 75, cd.e(123));
                      if (var27 != 0) {
                        ao.a(5623);
                      }
                    }
                  }
                } else {
                  ao.a(5623);
                }
                this.a((byte) -89, true);
                if (var27 != 0) {
                  rn.m(0);
                  if (var27 != 0) {
                    ia.a(-14296, wn.field_y);
                    if (this.a(-109, true)) {
                      ue.field_e = true;
                    }
                  }
                }
              }
            } else {
              rn.m(0);
              if (var27 != 0) {
                ia.a(-14296, wn.field_y);
                if (this.a(-109, true)) {
                  ue.field_e = true;
                }
              }
            }
          } else {
            ia.a(-14296, wn.field_y);
            if (this.a(-109, true)) {
              ue.field_e = true;
            }
          }
          if (!lc.a((byte) 112)) {
            do {
              var2 = (cm) (wh.field_h.c(true));
              if (null == var2) {
                if (var27 == 0) {
                  break;
                }
              } else {
                ld.a((cm) (var2), 118, 4);
              }
            } while (var27 == 0);
          }
          while (true) {
            stackIn_99_0 = am.a((byte) 26, di.field_n);
            if (stackIn_99_0) {
              stackIn_263_0 = ~on.field_g;
              stackIn_263_1 = -78;
              if (var27 == 0) {
                if (stackIn_263_0 == stackIn_263_1) {
                  dg.field_s = true;
                  continue;
                }
                if (79 == on.field_g) {
                  bc.field_b = df.field_z.e((byte) 100);
                  mf.field_a = df.field_z.e((byte) 50);
                  continue;
                }
                if (on.field_g == 9) {
                  lf.a((byte) 80);
                  kh.field_b = false;
                  mn.field_r = 9;
                  jm.field_b = df.field_z.l(-1);
                  continue;
                }
                if (on.field_g == 14) {
                  lf.a((byte) 80);
                  jn.a(150, dn.f((byte) -112), -13173, ql.a(1), li.field_E, wk.f((byte) -125), 1024, wh.a(1000, 678231216), wh.a(6, 678231216), jk.field_a.length);
                  ra.a(v.b((byte) 115), 64, pa.c((byte) -122));
                  mn.field_r = -2;
                  wa.field_Ob = true;
                  kh.field_b = false;
                  continue;
                }
                if (15 == on.field_g) {
                  if (wa.field_Ob) {
                    lf.a((byte) 80);
                    ho.a(0);
                    cn.c(true);
                    hi.field_a = false;
                    wa.field_Ob = false;
                    mj.field_w = false;
                    fi.field_h = true;
                    wa.field_Kb = true;
                    io.field_A = false;
                    mn.field_r = 0;
                    bc.a((byte) -50);
                  }
                  kh.field_b = false;
                  oc.field_g = false;
                  continue;
                }
                if (on.field_g == 10 &&
                  wa.field_Ob) {
                  u.a((byte) -108);
                  continue;
                }
                if (73 == on.field_g) {
                  var2_intLifetime1 = df.field_z.e((byte) -122);
                  var3_ref_int__ = new int[var2_intLifetime1];
                  var4 = 0;
                  L34: while (true) {
                    stackIn_137_0 = var2_intLifetime1;
                    stackIn_137_1 = var4;
                    if (stackIn_137_0 > stackIn_137_1) {
                      var3_ref_int__[var4] = df.field_z.d(-10674);
                      var3_ref_int__[var4] = dg.a(var3_ref_int__[var4], ~ad.field_f[var4]);
                      stackIn_99_0 = pe.field_Jb;
                      if (stackIn_99_0) {
                        var5 = 0;
                        while (var5 < 32) {
                          var6 = 1 << var5;
                          stackIn_137_0 = -96;
                          stackIn_137_1 = ~(var5 + 32 * var4);
                          if (stackIn_137_0 < stackIn_137_1 &&
                            (var6 & var3_ref_int__[var4]) != 0) {
                            b.field_a.b(new qa(32 * var4 + var5), -1);
                          }
                          var5++;
                        }
                      }
                      ad.field_f[var4] = fj.b(ad.field_f[var4], var3_ref_int__[var4]);
                      var4++;
                      continue L34;
                    }
                    break;
                  }
                  continue;
                }
                if (on.field_g == 74) {
                  if (!td.e(true)) {
                    jf.field_j = df.field_z.n(-98);
                    cb.field_e = df.field_z.c(-943038560);
                    ad.field_d = df.field_z.e((byte) -100);
                  } else {
                    var2_intLifetime1 = df.field_z.n(-98);
                    var3_long = df.field_z.c(-943038560);
                    ad.field_d = df.field_z.e((byte) 62);
                    if (var2_intLifetime1 > jf.field_j) {
                      jf.field_j = var2_intLifetime1;
                    }
                    cb.field_e = cb.field_e | var3_long;
                  }
                  ua.field_P = md.a(false, cb.field_e);
                  nm.field_h = -1;
                  la.field_a = true;
                  continue;
                }
                if (on.field_g == 57 ||
                  on.field_g == 58) {
                  lf.a((byte) 80);
                  var2_intLifetime1 = df.field_z.e((byte) -124);
                  var3 = df.field_z.e((byte) -101);
                  stackIn_173_0 = (0 == df.field_z.e((byte) 106)) ? 0 : 1;
                  var4Lifetime2 = stackIn_173_0;
                  stackIn_177_0 = (df.field_z.e((byte) 111) == 0) ? 0 : 1;
                  var5Lifetime1 = stackIn_177_0;
                  var6Lifetime1 = df.field_z.n(-98);
                  var7 = new String[df.field_z.e((byte) 115)];
                  var8 = -2;
                  var8Lifetime1 = df.field_z.o(6);
                  var9 = new int[var7.length][18];
                  var10 = new int[var7.length][16];
                  var11 = new int[var7.length];
                  var12 = new boolean[var7.length];
                  var13 = 0;
                  var14 = 0;
                  while (var7.length > var14) {
                    var7[var14] = df.field_z.e(-32461);
                    stackIn_209_0 = 0;
                    var15 = stackIn_209_0;
                    L51: while (true) {
                      if (var15 >= 18) {
                        while (true) {
                          var15 = 0;
                          while (var15 < 16) {
                            var16 = df.field_z.e((byte) 109) & 255;
                            stackIn_183_0 = var10[var14];
                            stackIn_183_1 = var15;
                            stackIn_183_2 = -256;
                            stackIn_183_3 = ~var16;
                            if (stackIn_183_2 == stackIn_183_3) {
                              stackIn_192_2 = -1;
                            } else {
                              stackIn_192_2 = var16;
                            }
                            stackIn_183_0[stackIn_183_1] = stackIn_192_2;
                            var15++;
                          }
                          break L51;
                        }
                      }
                      stackIn_183_0Lifetime1 = var9[var14];
                      stackIn_183_1Lifetime1 = var15;
                      stackIn_183_2Lifetime1 = df.field_z.e((byte) -88);
                      stackIn_183_3Lifetime1 = 255;
                      while (true) {
                        stackIn_183_0Lifetime1[stackIn_183_1Lifetime1] = dg.a(stackIn_183_2Lifetime1, stackIn_183_3Lifetime1);
                        var15++;
                        continue L51;
                      }

                    }
                    var11[var14] = df.field_z.e((byte) 76);
                    stackIn_196_0 = var12;
                    stackIn_196_1 = var14;
                    stackIn_197_2 = (df.field_z.e((byte) 123) == 1);
                    stackIn_196_0[stackIn_196_1] = stackIn_197_2;
                    if (var12[var14] &&
                      0 == var10[var14][0] &&
                      var10[var14][11] == 11) {
                      var9[var14][12] = 28;
                      var9[var14][13] = 0;
                      var9[var14][14] = 29;
                      var9[var14][15] = 33;
                      var9[var14][16] = 47;
                      var9[var14][17] = 50;
                      var9[var14][0] = 204;
                      var9[var14][1] = 170;
                      var9[var14][2] = 238;
                      var9[var14][3] = 255;
                      var9[var14][4] = 192;
                      var9[var14][5] = 255;
                      var9[var14][6] = 32;
                      var9[var14][7] = 32;
                      var9[var14][8] = 32;
                      var9[var14][9] = 128;
                      var9[var14][10] = 64;
                      var9[var14][11] = 128;
                      var13 = 1;
                    }
                    var14++;
                  }
                  var14Lifetime1 = df.field_z.d(-10674);
                  stackIn_209_0Lifetime1 = df.field_z.e((byte) -118);
                  var15Lifetime1 = stackIn_209_0Lifetime1;
                  stackIn_213_0 = ((var15Lifetime1 & 128) == 0) ? 0 : 1;
                  var16Lifetime1 = stackIn_213_0;
                  r.field_b = null;
                  var15Lifetime1 = var15Lifetime1 & 127;
                  jb.field_z = null;
                  System.gc();
                  var17 = new le(true, var2_intLifetime1, var3, var4Lifetime2 != 0, var7, var8Lifetime1, var9, var10, var11, var14Lifetime1, var15Lifetime1, var5Lifetime1 != 0, var6Lifetime1, var12);
                  mi.a(jh.field_c[var17.field_V.a(-31497) + 1], 3);
                  var17.m(413355681);
                  if (var13 != 0) {
                    var18 = ij.field_Tb.field_A.length;
                    var19 = 0;
                    while (var19 < var18) {
                      var20 = ij.field_Tb.field_A[var19];
                      var21 = (var20 & 16711680) >> 16;
                      var22 = var20 >> 8 & 255;
                      var23 = 255 & var20;
                      var24 = (var21 + var22) / 2;
                      var25 = (var23 + var21) / 2;
                      var26 = (var22 + var23) / 2;
                      ij.field_Tb.field_A[var19] = (var25 << 8) + ((var24 << 16) + var26);
                      var19++;
                    }
                  }
                  if (on.field_g != 57) {
                    r.field_b = var17;
                    mj.field_w = true;
                  } else {
                    jb.field_z = var17;
                    hi.field_a = true;
                    jg.a(-3);
                    jk.a((byte) 121);
                    sc.i((byte) -53);
                  }
                  stackIn_233_0 = (var16Lifetime1 == 0) ? 5 : -1;
                  mn.field_r = stackIn_233_0;
                  io.field_A = true;
                  oc.field_g = false;
                  continue;
                }
                if (on.field_g == 59) {
                  if (hi.field_a ||
                    mj.field_w) {
                    lf.a((byte) 80);
                    if (hi.field_a &&
                      jb.field_z != null) {
                      jb.field_z.a(-112, false);
                    }
                    fi.field_h = true;
                    hi.field_a = false;
                    mj.field_w = false;
                    io.field_A = false;
                    mn.field_r = -2;
                    ao.field_d = true;
                    vh.field_t = 0;
                    bc.a((byte) -50);
                  }
                  oc.field_g = false;
                  continue;
                }
                var2 = null;
                if (!hi.field_a) {
                  if (mj.field_w) {
                    var2 = r.field_b;
                  }
                } else {
                  var2 = jb.field_z;
                }
                if (null != var2 &&
                  ((le) (var2)).e((byte) -78)) {
                  continue;
                }
                this.g(-24);
                continue;
              }
            } else {
              stackIn_263_0 = -27;
              stackIn_263_1 = (0 - param0) / 36;
            }
            var2_intLifetime1 = stackIn_263_0 % stackIn_263_1;
            we.a(0, (byte) 121);
            if (-2 == si.field_g) {
              ao.field_d = true;
            }
            if (ao.field_d) {
              vh.field_t = 0;
            }
            if (ka.c((byte) -44)) {
              var3Lifetime1 = this.e(118);
              if (var3Lifetime1 == 0 ||
                var3Lifetime1 == 1) {
                ub.a((byte) 127, 4);
                jn.a((byte) -64, 6);
                of.b(7, 16);
                ta.field_b = false;
                if (nm.field_h != -1) {
                  bg.a(2, nm.field_h);
                }
                pi.a(true);
                if (var3Lifetime1 == 1) {
                  kh.field_b = true;
                  oc.field_g = true;
                }
                if (var3Lifetime1 != 1 ||
                  var27 != 0) {
                  if (wa.field_Ob) {
                    io.field_A = false;
                    fi.field_h = true;
                    wa.field_Kb = true;
                    if (hi.field_a) {
                      jm.field_b = we.field_e;
                      gj.a(false, true, 9, mn.field_r);
                      if (var27 != 0) {
                        gj.a(false, true, 0, mn.field_r);
                      }
                    } else {
                      gj.a(false, true, 0, mn.field_r);
                    }
                    lf.a((byte) 80);
                    tl.field_f[si.field_g].a(false, 0, (byte) -123);
                    mj.field_w = false;
                    wa.field_Ob = false;
                    hi.field_a = false;
                    bc.a((byte) -50);
                  }
                  oc.field_g = false;
                  kh.field_b = false;
                }}
              var4Lifetime1 = 0;
              if (var3Lifetime1 == 2) {
                var4Lifetime1 = 1;
              }
              if (wa.field_Ob ||
                kh.field_b ||
                oc.field_g) {
                var4Lifetime1 = 1;
              }
              if (!ka.c((byte) -44)) {
                var4Lifetime1 = 0;
              }
              if (var4Lifetime1 != 0 &&
                null != tj.field_t) {
                ah.a(ve.field_t, tj.field_t.field_o, 8, 8, wd.field_h, tj.field_t, an.field_f / 2, an.field_j / 2, 2, tj.field_t.field_m + tj.field_t.field_o, -97);
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (var2), "ArcanistsMulti.A(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, wf param2, int[] param3, boolean param4, wf[] param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param4) {
            field_H = (String) null;
          }
          param5[param1] = param2;
          param3[param1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("ArcanistsMulti.NA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final boolean a(int param0, boolean param1) {
        int stackIn_188_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        ll[] var4 = null;
        qb[][] var5 = null;
        qb[][] var6 = null;
        qb var7 = null;
        ll[] var8 = null;
        int var9 = 0;
        qb var7Lifetime1;
        int var3_intLifetime1;
        var9 = field_G ? 1 : 0;
        try {
          if (ec.field_c == null) {
            mb.field_bb = (int)(Math.random() * 8.0);
            var3_int = mb.field_bb;
            if (var3_int == 0) {
              ec.field_c = "flame";
            }
            if (var3_int == 1) {
              ec.field_c = "frost";
            }
            if (var3_int == 2) {
              ec.field_c = "rock";
            }
            if (var3_int == 3) {
              ec.field_c = "overlight";
            }
            if (var3_int == 4) {
              ec.field_c = "storm";
            }
            if (var3_int == 5) {
              ec.field_c = "underdark";
            }
            if (var3_int == 6) {
              ec.field_c = "nature";
            }
            if (7 == var3_int) {
              ec.field_c = "water";
            }
            if (var3_int == 8) {
              ec.field_c = "clockwork";
            }
          }
          ti.a((byte) -90);
          if (null != vg.field_l) {
            if (rc.field_a.c(-10923) &&
              rc.field_a.a("basic", -24417)) {
              if (rc.field_a.c(-10923) &&
                rc.field_a.a("roman20", -24417)) {
                if (ud.field_D.c(-10923) &&
                  ud.field_D.a("roman20", -24417)) {
                  if (rc.field_a.c(-10923) &&
                    rc.field_a.a("lobby", -24417)) {
                    if (ud.field_D.c(-10923) &&
                      ud.field_D.a("lobby", -24417)) {
                      if (vg.field_l.c(-10923) &&
                        vg.field_l.a(106)) {
                        if (mg.field_E.c(-10923) &&
                          mg.field_E.a(-15)) {
                          if (ki.field_s.c(-10923) &&
                            ki.field_s.a(125)) {
                            if (tc.field_x.c(-10923) &&
                              tc.field_x.a(true, "arcanists_titlescreen", "") &&
                              tc.field_x.a(true, "arcanists_grassland", "")) {
                              if (ue.field_d.c(-10923) &&
                                ue.field_d.a("", -24417)) {
                                if (!ue.field_d.a(ec.field_c, -24417)) {
                                  rb.a(nm.a(17153, gd.field_nb, ue.field_d, sc.field_Z, ec.field_c), false, 40.0f);
                                  return false;
                                }
                                if (so.field_k.c(-10923) &&
                                  so.field_k.a(109)) {
                                  if (hb.field_Fb.c(-10923) &&
                                    hb.field_Fb.a(-33)) {
                                    if (ua.field_K.c(-10923) &&
                                      ua.field_K.a(-121)) {
                                      wm.g(0);
                                      rb.a(sn.field_N, false, 60.0f);
                                      this.c((byte) -89);
                                      if (!param1) {
                                        return false;
                                      }
                                      lo.field_w = new gi(vg.field_l, mg.field_E);
                                      vg.field_l = null;
                                      mg.field_E = null;
                                      bk.a(2);
                                      return false;
                                    }
                                    rb.a(qe.a(mm.field_t, 74, ua.field_K, di.field_c), false, 55.0f);
                                    return false;
                                  }
                                  rb.a(qe.a(mm.field_t, 115, hb.field_Fb, di.field_c), false, 50.0f);
                                  return false;
                                }
                                rb.a(qe.a(gd.field_nb, 113, so.field_k, sc.field_Z), false, 45.0f);
                                return false;
                              }
                              rb.a(nm.a(17153, gd.field_nb, ue.field_d, sc.field_Z, ""), false, 35.0f);
                              return false;
                            }
                            rb.a(qe.a(ii.field_e, 96, tc.field_x, kh.field_e), false, 32.0f);
                            return false;
                          }
                          rb.a(qe.a(ii.field_e, 76, ki.field_s, kh.field_e), false, 29.0f);
                          return false;
                        }
                        rb.a(qe.a(mj.field_v, 76, mg.field_E, fn.field_a), false, 23.0f);
                        return false;
                      }
                      rb.a(qe.a(mj.field_v, 122, vg.field_l, fn.field_a), false, 20.0f);
                      return false;
                    }
                    rb.a(nm.a(17153, ra.field_d, ud.field_D, wh.field_a, "lobby"), false, 17.0f);
                    return false;
                  }
                  rb.a(nm.a(17153, gd.field_nb, rc.field_a, sc.field_Z, "lobby"), false, 14.0f);
                  return false;
                }
                rb.a(nm.a(17153, ra.field_d, ud.field_D, wh.field_a, "roman20"), false, 11.0f);
                return false;
              }
              rb.a(nm.a(17153, gd.field_nb, rc.field_a, sc.field_Z, "roman20"), false, 8.0f);
              return false;
            }
            rb.a(nm.a(17153, gd.field_nb, rc.field_a, sc.field_Z, "basic"), false, 5.0f);
            return false;
          }
          if (tc.field_x != null &&
            jh.field_c == null) {
            rb.a(vi.field_J, false, 85.0f);
            this.c((byte) -89);
            jh.field_c = new ha[10];
            bk.a(2);
            return false;
          }
          var3_intLifetime1 = -84 / ((14 - param0) / 56);
          if (null != so.field_k) {
            if (hf.field_o == null) {
              rb.a(hi.field_c, false, 90.0f);
              this.c((byte) -89);
              hf.field_o = fj.a("", -22612, ue.field_d, "funorblogo");
              vn.field_b = fj.a("", -22612, ue.field_d, "newlogo");
              g.field_a = fj.a("", -22612, ue.field_d, "newlogostars");
              sm.field_d = fj.a("", -22612, ue.field_d, "newlogostars2");
              vi.field_I = fj.a("", -22612, ue.field_d, "arrowbuttonsmall");
              to.field_q = fj.a("", -22612, ue.field_d, "arrowbutton");
              km.field_e = fj.a("", -22612, ue.field_d, "border_corner");
              wk.field_l = fj.a("", -22612, ue.field_d, "border_bar_h");
              hk.field_k = fj.a("", -22612, ue.field_d, "border_bar_v");
              mc.field_a = qe.a(ue.field_d, "charactericons", "", 55);
              rb.field_o = qe.a(ue.field_d, "bonushats", "", 63);
              bk.a(2);
              return false;
            }
            if (e.field_M == null) {
              rb.a(hi.field_c, false, 91.0f);
              this.c((byte) -89);
              wm.field_H = qe.a(ue.field_d, "menu_overlays", "", 41);
              e.field_M = new ll[9];
              oo.field_t = fj.a("", -22612, ue.field_d, "logo_arcanists");
              wm.field_H[13].a();
              vn.field_b.field_x = -(vn.field_b.field_n / 2) + 320;
              vn.field_b.field_o = 16;
              rk.g(491697968);
              kf.field_b = qe.a(ue.field_d, "frame2", "", 83);
              uj.field_f = fj.a("", -22612, ue.field_d, "gamespell");
              fe.field_g = fj.a("", -22612, ue.field_d, "gamebars");
              pm.field_a = fj.a("", -22612, ue.field_d, "cldgame");
              rg.field_a = fj.a("", -22612, ue.field_d, "cldtr");
              o.field_F = fj.a("", -22612, ue.field_d, "cldbl");
              pe.field_Ib = fj.a("", -22612, ue.field_d, "cldtl");
              j.field_a = fj.a("", -22612, ue.field_d, "cldbr");
              gd.field_mb = fj.a("", -22612, ue.field_d, "cldflat");
              fe.field_o = fj.a("", -22612, ue.field_d, "spell_book");
              bk.a(2);
              return false;
            }
            if (null == ea.field_E) {
              rb.a(hi.field_c, false, 92.0f);
              this.c((byte) -89);
              ea.field_E = new qb[15];
              var4_int = 0;
              do {
                if (var4_int >= 15) {
                  var4_int = 0;
                  break;
                }
                ea.field_E[var4_int] = wm.field_H[var4_int].g();
                var4_int++;
              } while (var9 == 0);
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (15 <= var4_int))) {
                lj.a(true, var4_int);
                stackIn_188_0 = 0;
                if (var9 == 0) {
                  if (stackIn_188_0 < var4_int &&
                    var4_int < 13) {
                    wm.field_H[var4_int] = null;
                  }
                  var4_int++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                ea.field_E[0] = null;
                vn.field_b = null;
                ce.field_m.a(true);
                dh.a(ue.field_d, (byte) -66);
                tj.field_t = rc.a(so.field_k, -24755, "", "font", ue.field_d);
                mi.field_B = rc.a(so.field_k, -24755, "", "smallfont", ue.field_d);
                bk.a(2);
                stackIn_188_0 = 0;
              }
              return stackIn_188_0 != 0;
            }
            if (mb.field_ab == null) {
              rb.a(hi.field_c, false, 93.0f);
              this.c((byte) -89);
              mb.field_ab = pk.a("", 0, "spellclasses", ue.field_d);
              vd.field_b = fj.a("basic", -22612, rc.field_a, "unachieved");
              ii.field_d = fj.a("basic", -22612, rc.field_a, "locked");
              di.field_d = fj.a("basic", -22612, rc.field_a, "orbcoin");
              kc.field_kb = qe.a(ue.field_d, "heads", "", 95);
              jd.field_j = qe.a(ue.field_d, "bodies", "", 67);
              ea.field_u = qe.a(ue.field_d, "phands", "", 58);
              qe.field_i = qe.a(ue.field_d, "mhands", "", 57);
              hn.field_d = qe.a(ue.field_d, "beards", "", 106);
              tj.field_A = qe.a(ue.field_d, "hats", "", 124);
              bo.field_a = qe.a(ue.field_d, "mouths", "", 42);
              h.field_I = qe.a(ue.field_d, "pfeet", "", 58);
              fn.field_b = qe.a(ue.field_d, "mfeet", "", 113);
              bk.a(2);
              return false;
            }
            if (null == ij.field_Pb) {
              rb.a(hi.field_c, false, 94.0f);
              this.c((byte) -89);
              ij.field_Pb = qe.a(ue.field_d, "conductororb", "", 60);
              fc.field_e = qe.a(ue.field_d, "phylactery", "", 92);
              tf.field_j = qe.a(ue.field_d, "stonemonster", "", 64);
              fo.field_g = qe.a(ue.field_d, "frostsprite", "", 56);
              rc.field_k = qe.a(ue.field_d, "fungus", "", 102);
              lf.field_c = qe.a(ue.field_d, "flamesprite", "", 69);
              eo.field_a = qe.a(ue.field_d, "watersprite", "", 58);
              ji.field_h = qe.a(ue.field_d, "gaurdianangel", "", 69);
              ae.field_a = qe.a(ue.field_d, "clockwork", "", 93);
              wg.field_J = qe.a(ue.field_d, "aura", "", 124);
              kl.field_E = qe.a(ue.field_d, "clockworkaura", "", 75);
              jg.field_c = pk.a("", 0, "runes", ue.field_d);
              rm.field_o = qe.a(ue.field_d, "spellbooks", "", 93);
              bk.a(2);
              return false;
            }
            if (null == nm.field_i) {
              rb.a(hi.field_c, false, 95.0f);
              this.c((byte) -89);
              bb.field_g = qe.a(ue.field_d, "spellicons", "", 75);
              nm.field_i = qe.a(ue.field_d, "frame", "", 51);
              nm.field_i[1].field_n = nm.field_i[1].field_q;
              nm.field_i[4] = null;
              nm.field_i[3].field_w = nm.field_i[3].field_y;
              nm.field_i[7].field_n = nm.field_i[7].field_q;
              nm.field_i[5].field_w = nm.field_i[5].field_y;
              wd.field_h = qe.a(ue.field_d, "button_frame", "", 69);
              bk.a(2);
              return false;
            }
            if (null == ve.field_t) {
              rb.a(hi.field_c, false, 96.0f);
              this.c((byte) -89);
              ve.field_t = qe.a(ue.field_d, "button_frame_r", "", 94);
              qe.a(ue.field_d, "button_frame_d", "", 44);
              mo.field_a = qe.a(ue.field_d, "achievements_large", "", 98);
              var4_int = 95;
              do {
                if (!(var4_int < mo.field_a.length)) {
                  ih.field_e = new qb(32, 32);
                  ih.field_e.a();
                  di.field_d.d(0, 0, 32, 32);
                  ce.field_m.a(true);
                  bk.a(2);
                  break;
                }
                mo.field_a[var4_int] = null;
                var4_int++;
              } while (var9 == 0);
              return false;
            }
            if (so.field_k != null) {
              rb.a(hi.field_c, false, 97.0f);
              this.c((byte) -89);
              rc.field_a.field_f = 0;
              ud.field_D.field_f = 0;
              wn.a((byte) 111, rc.a(ud.field_D, -24755, "lobby", "chatfont", rc.field_a));
              rc.field_a.field_f = 1;
              ud.field_D.field_f = 1;
              var4 = pk.a("", 0, "minibonushats", ue.field_d);
              var5 = new qb[3][];
              var6 = new qb[3][];
              var5[0] = qe.a(ue.field_d, "turntime_icons", "", 76);
              var5[1] = qe.a(ue.field_d, "levelstyle_iconssmall", "", 56);
              var5[2] = qe.a(ue.field_d, "team_iconssmall", "", 76);
              var6[0] = null;
              var6[1] = qe.a(ue.field_d, "levelstyle_icons", "", 121);
              var6[2] = null;
              var7 = var5[1][3];
              var5[1][3] = var5[1][2];
              var5[1][2] = var5[1][1];
              var5[1][1] = var5[1][0];
              var5[1][0] = var7;
              var7Lifetime1 = var6[1][3];
              var6[1][3] = var6[1][2];
              var6[1][2] = var6[1][1];
              var6[1][1] = var6[1][0];
              var6[1][0] = var7Lifetime1;
              rb.a(li.field_E, ua.field_K, var4, var5, true, jh.field_d, rm.field_l, 6, ud.field_D, (int[]) null, var6, cn.field_O, (byte) -67, jk.field_a, 3, aj.field_a, rc.field_a);
              fn.a(200, (byte) -106);
              um.field_a = qf.field_c;
              gm.field_c = false;
              dh.field_Hb = co.field_a;
              qn.a(-24539, rc.field_a, ud.field_D);
              ud.field_D = null;
              so.field_k = null;
              if (lc.a((byte) 112) ||
                !(0 < ah.field_c)) {
                var8 = pk.a("", 0, "expansion_screens", ue.field_d);
                to.field_s = new hf((java.applet.Applet) (this), be.field_i, var8, dh.field_Kb);
              }
              bk.a(2);
              return false;
            }
          }
          if (hb.field_Fb == null) {
            wk.d((byte) -98);
            return true;
          }
          gh.a(-92, new u(hb.field_Fb.a("huffman", "", -1)));
          hb.field_Fb = null;
          bk.a(2);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "ArcanistsMulti.TA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void j(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = field_G ? 1 : 0;
        try {
          u.field_k = false;
          if (param0 != 48) {
            ArcanistsMulti.h((byte) -33);
          }
          fg.field_o = null;
          if (!hk.field_s) {
            var1_int = dd.field_j;
            if (var1_int > 0) {
              if (var1_int == 1) {
                fg.field_o = re.field_k;
              }
              if (var1_int != 1 ||
                var2 != 0) {
                fg.field_o = tj.a(param0 ^ -80, new String[]{Integer.toString(var1_int)}, sk.field_g);
              }
              fg.field_o = ua.a(new CharSequence[]{(CharSequence) ((Object) fg.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) nl.field_Hb)}, -93);
            }
            vf.field_k.h(77);
            ba.c(0);
            if (var2 == 0) {
              return;
            }
          }
          vf.field_k.g(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "ArcanistsMulti.UA(" + param0 + ')');
        }
    }

    final static void a(int param0, int[] param1, dn param2, String param3, long param4, int param5, int param6, String param7, kc param8) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          dd.field_h = param2;
          eo.field_c = new ne(param8, param4, param3, param7, param6, param5, param1);
          if (param0 != -26335) {
            ArcanistsMulti.i((byte) 116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ArcanistsMulti.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param8 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ArcanistsMulti.h((byte) -91);
          fn.a((byte) -60);
          qa.a((byte) 92);
          vn.e(true);
          cb.a((byte) 44);
          ik.a(0);
          c.a(30);
          to.c(false);
          kc.d(-21224);
          ji.a(-733);
          bh.a(-97);
          bc.a(1);
          ci.a(0);
          uf.a((byte) -81);
          ud.d(true);
          p.a((byte) -46);
          dc.a(false);
          hn.a(66);
          je.a(-10338);
          hh.b(1);
          de.c();
          eg.a(false);
          dj.a();
          rg.a(35);
          wk.b(true);
          qj.c(-13019);
          ra.b(64);
          oj.a(1);
          uc.a((byte) -58);
          ck.b((byte) 85);
          hm.a(124);
          ub.a(-70);
          um.a(0);
          ad.a(96);
          jg.c(-25776);
          mf.a(-1);
          md.a((byte) 115);
          hg.b((byte) -105);
          dk.b(false);
          rc.a(-1);
          uk.a(115);
          v.b(-18033);
          gi.a((byte) 59);
          lc.c(true);
          le.f((byte) 95);
          pm.a(0);
          kf.a((byte) -121);
          hf.a(false);
          lk.d(11959);
          pa.a(32336);
          gk.a((byte) -90);
          sd.b(-1);
          k.c(11138);
          nf.r(0);
          pg.c((byte) -115);
          pn.b((byte) 122);
          cc.a((byte) 107);
          so.a(param0);
          gh.d((byte) 115);
          di.b(13);
          o.c(true);
          en.b();
          hk.b(!param0);
          lb.c();
          io.c(118);
          fo.a(0);
          ec.b(0);
          kj.a(true);
          lf.a(-15);
          jk.a(0);
          nb.a(-79);
          tl.a((byte) -51);
          ml.h(false);
          qc.a(54);
          tf.a(49);
          mi.g(2);
          oc.b(false);
          hi.a((byte) 60);
          jd.d((byte) -109);
          ai.b();
          ni.a();
          jj.a();
          ah.a(false);
          r.a(8);
          oi.a(103);
          vi.h((byte) 62);
          h.h(1);
          ie.m((byte) 25);
          gd.g(103);
          no.l((byte) -11);
          ed.i(-29222);
          ln.g(10);
          td.a((byte) 115);
          e.a(-1);
          sn.g((byte) 127);
          hc.a((byte) -60);
          vh.b(-60);
          fb.a(!param0);
          pc.a(false);
          dd.a(-5451);
          ue.a((byte) 62);
          g.a(30586);
          tm.b(-79);
          cf.a((byte) 83);
          nl.e(-10765);
          dn.e(1);
          af.e(93);
          in.g((byte) -120);
          pe.g(0);
          hb.e(0);
          ne.c(-14);
          w.g((byte) 126);
          cg.e(param0);
          i.a((byte) 6);
          na.g((byte) 120);
          jb.c(122);
          we.c(120);
          wj.a(0);
          mo.c(0);
          tg.c(-92);
          mc.a(73);
          ao.b(0);
          sb.c(-1);
          s.a((byte) -109);
          bm.a(false);
          fc.a((byte) -71);
          nm.a(-1);
          ph.a((byte) -42);
          fi.a((byte) 5);
          gj.a(false);
          ch.a(false);
          bd.b(0);
          ab.q(21657);
          da.a(-121);
          u.a(1);
          vm.a((byte) -75);
          ug.a(109);
          ic.a(0);
          ge.a(-117);
          cn.g((byte) 112);
          qn.h(1);
          cj.a(param0);
          sa.e(26820);
          jn.a((byte) -99);
          rj.a((byte) -94);
          oh.a(-791);
          kb.d(255);
          ff.a((byte) 46);
          si.b((byte) 36);
          mj.a((byte) -95);
          of.a(-56);
          lh.a(2);
          jm.c(63);
          qm.f((byte) -17);
          wn.e(23123);
          kh.a(6481);
          kn.h(3);
          uj.a(true);
          qo.a(6);
          ob.f(false);
          ti.k(0);
          ag.e(-125);
          ua.f(-1);
          df.c(true);
          kl.a((byte) -90);
          ae.a((byte) -125);
          qf.a((byte) 92);
          ef.g(-1);
          vk.f((byte) 20);
          be.a((byte) -60);
          ea.f((byte) 78);
          tj.b(107);
          jo.a(0);
          ve.d(2039583);
          b.a(67);
          id.c();
          gl.a((byte) 15);
          vg.a(40);
          bo.a(120);
          he.a(-31399);
          oa.a((byte) 98);
          wd.a(0);
          rd.a(0);
          lm.a(-888);
          pi.a((byte) -68);
          jh.a((byte) 87);
          eo.a(-14449);
          n.a(8577);
          bg.a((byte) -79);
          bf.a();
          ul.a(4);
          bb.a((byte) -127);
          fl.a(true);
          wh.a((byte) -118);
          sk.b(121);
          la.a((byte) 49);
          hd.a((byte) 107);
          ij.g(12);
          kg.a(0);
          gn.a((byte) -122);
          oo.e(31908);
          tk.c(-1016755547);
          ig.a(0);
          go.a(false);
          hj.a((byte) 111);
          lj.c(-80);
          ga.a((byte) -109);
          vf.a(27494);
          ia.a(!param0);
          rb.a(37);
          oe.a(120);
          rm.a(-6566);
          fg.b(param0);
          ba.a((byte) 94);
          jc.a();
          ke.f(2);
          bi.o(0);
          rn.n(1);
          qk.g(0);
          om.a((byte) -127);
          li.a(1313);
          ej.f(20445);
          mk.g((byte) -125);
          sc.g(15428);
          bk.f(0);
          rl.c((byte) -114);
          gg.b(28);
          ng.a(40);
          rk.h(-116);
          wg.d(param0);
          tn.f((byte) -97);
          dh.f((byte) 77);
          fd.a(-1);
          bl.c((byte) -79);
          wl.k(0);
          nj.a((byte) -72);
          mg.i(42);
          sl.g(123);
          jl.c(-125);
          re.b(0);
          se.f(-114);
          q.f(-1764031359);
          bj.l((byte) -46);
          gf.k((byte) -108);
          wm.f(-5903);
          ma.g((byte) 54);
          wi.a(92);
          pk.a(-14987);
          gb.b((byte) 33);
          nn.c(63);
          aj.a(20028);
          nh.h((byte) -102);
          ka.a(-1);
          sm.a(false);
          jf.a((byte) -120);
          fh.a((byte) 88);
          fk.a(-1333592895);
          nk.a(30025);
          ce.b(false);
          mm.d(2188450);
          gm.a(-9922);
          ib.a(true);
          tc.b((byte) 25);
          ii.b((byte) 106);
          dm.c(true);
          cd.a((byte) 99);
          rf.a(85);
          fj.a(90);
          on.a(3);
          wa.f((byte) -121);
          ta.a(5);
          ol.b(-23971);
          hl.a(-1513388336);
          fe.a(32369);
          cm.a(49);
          pb.a((byte) 126);
          f.a(-1);
          qg.b(83);
          co.b(-62);
          ho.b(0);
          km.b(400);
          am.a(false);
          qe.c(-100);
          me.a((byte) 115);
          uh.a(-69);
          fm.a(0);
          th.a((byte) -113);
          ql.a((byte) -107);
          im.a((byte) -14);
          ld.b((byte) 13);
          an.a((byte) -104);
          ih.a((byte) 48);
          vc.b(202);
          vd.a(0);
          va.a(121);
          eb.a((byte) 49);
          j.a((byte) -122);
          mh.h((byte) 114);
          mb.a(122);
          aa.b(false);
          ko.a(32);
          dg.d(-1);
          ui.d(70);
          ki.d((byte) 90);
          ja.d(0);
          lo.d(15672);
          mn.d((byte) -119);
          db.a(255);
          vl.a((byte) -76);
          eh.a((byte) 121);
          ee.c(true);
          ri.a((byte) 76);
          this.field_q = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ArcanistsMulti.N(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        int fieldTemp$0 = 0;
        boolean[] array$1 = null;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        boolean stackIn_152_0 = false;
        boolean[] stackIn_179_0 = null;
        boolean[] stackIn_179_1 = null;
        int stackIn_179_2 = 0;
        boolean stackIn_180_3;
        int stackIn_195_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_235_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        le var5 = null;
        int var5_int = 0;
        int[][] var5_array = null;
        int var6_int = 0;
        int[][] var6 = null;
        int var7_int = 0;
        int[] var7 = null;
        boolean[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_195_0Lifetime1;
        int var5_intLifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        var13 = field_G ? 1 : 0;
        try {
          if (bj.g(false)) {
            param1 = true;
          }
          if (b.field_a.b(12623) != null) {
            fieldTemp$0 = wi.field_h + 1;
            wi.field_h = wi.field_h + 1;
            if (fieldTemp$0 == 335) {
              wi.field_h = 0;
              b.field_a.c(true);
            }
          }
          boolean decompiledFrameRemainder2 = true;
          if (~ii.field_c != ~ii.field_a) {
            if (ie.field_Vb != ii.field_a) {
              if (ii.field_a != sl.field_I) {
                u.field_i = u.field_i - 1;
                decompiledFrameRemainder2 = (u.field_i == 0);
                if (decompiledFrameRemainder2) {
                  ii.field_a = ii.field_c;
                  decompiledFrameRemainder2 = (var13 != 0);
                }
              }
              if (decompiledFrameRemainder2) {
                if (!lc.a((byte) 112)) {
                  mn.field_r = cj.field_b;
                  vk.c(false);
                  if (w.field_Cb) {
                    w.field_Cb = false;
                    km.a(1, 10, 240, 16, mi.field_B, 320, (byte) 40, mi.field_B.field_o, false, wd.field_h, mi.field_B.field_m + mi.field_B.field_o, ve.field_t);
                  }
                  if (pi.field_c) {
                    pi.field_c = false;
                    gj.a(false, true, -4, mn.field_r);
                  }
                  if (ij.b(mn.field_r, 10)) {
                    lf.a((byte) 80);
                  }
                }
                ii.field_a = ub.field_h;
                decompiledFrameRemainder2 = (var13 != 0);
              }
            }
            if (decompiledFrameRemainder2) {
              u.field_i = u.field_i + 1;
              decompiledFrameRemainder2 = (u.field_i == 16);
              if (decompiledFrameRemainder2) {
                if (!w.field_Cb) {
                  vn.a((byte) 4);
                  if (var13 != 0) {
                    am.a(3020);
                  }
                } else {
                  am.a(3020);
                }
                ii.field_a = sl.field_I;
                decompiledFrameRemainder2 = (var13 != 0);
              }
            }
          }
          if (decompiledFrameRemainder2) {
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder1 = true;
            var3_int = 0;
            var4 = 0;
            if (!param1) {
              if (~si.field_g != ~mn.field_r) {
                km.field_c = km.field_c + 1;
                decompiledFrameRemainder1 = (km.field_c == 32);
                if (decompiledFrameRemainder1) {
                  lf.a((byte) 80);
                  decompiledFrameRemainder1 = (var13 != 0);
                }
              }
              if (decompiledFrameRemainder1) {
                var5 = jb.field_z;
                if (null == var5) {
                  var5 = r.field_b;
                }
                if (-1 != si.field_g) {
                  if (14 != si.field_g &&
                    si.field_g != 2 &&
                    si.field_g != 4) {
                    if ((si.field_g != -2) &&
                      (decompiledFrameRemainder1 = !(!ij.b(si.field_g, param0 ^ -83)))) {
                      tl.field_f[si.field_g].b(91);
                      decompiledFrameRemainder1 = (var13 != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      var3_int = 1;
                      decompiledFrameRemainder1 = (var13 != 0);
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    if (!var5.field_ab) {
                      var5.a(true, false);
                    }
                    tl.field_f[si.field_g].b(param0 ^ -2);
                    decompiledFrameRemainder1 = (var13 != 0);
                  }
                }
                if (decompiledFrameRemainder1) {
                  if (wa.field_Ob) {
                    var4 = 1;
                    var3_int = 1;
                    decompiledFrameRemainder1 = (var13 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    if (!var5.field_ab) {
                      var5.a(true, true);
                    }
                    while (ib.b(false)) {
                      var5.k(1);
                      if (var13 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                    }
                  }
                }
              }
            }
            if ((decompiledFrameCompleted0) && (wa.field_Ob &&
              !kh.field_b &&
              !oc.field_g)) {
              var5_int = var4;
              if (hi.field_a &&
                ef.field_r) {
                var3_int = 0;
                var4 = 0;
              }
              ae.a(var3_int != 0, 13);
              if (mj.field_w) {
                r.field_b.a(true, var4 != 0);
              }
              if (hi.field_a &&
                null != jb.field_z) {
                nh.a((byte) -66, 320, 180, var5_int != 0);
                jb.field_z.a(true, var4 != 0);
              }
              while (true) {
                if (ib.b(false)) {
                  stackIn_152_0 = ao.field_d;
                  if (var13 == 0) {
                    boolean decompiledFrameRemainder0 = true;
                    if (stackIn_152_0) {
                      if ((hi.field_a) &&
                        (decompiledFrameRemainder0 = !(!tg.a(12, 27, 15, 13)))) {
                        jb.field_z.field_O = true;
                        continue;
                      }
                      if (decompiledFrameRemainder0) {
                        pe.a(15, 12, (byte) 32, 13);
                      }
                    }
                    if (mj.field_w) {
                      r.field_b.k(1);
                    }
                    if (!hi.field_a) {
                      continue;
                    }
                    jb.field_z.k(param0 ^ -90);
                    continue;
                  }
                } else {
                  stackIn_152_0 = ao.field_d;
                }
                if (stackIn_152_0) {
                  break;
                }
                ef.field_r = false;
                break;
              }
            }
            if (!wa.field_Ob) {
              lf.b(-4);
            }
            if (!ao.field_d) {
              if (!(rd.field_b <= 0)) {
                rd.field_b = rd.field_b - 1;
                if ((var13 != 0) &&
                  (rd.field_b < ea.field_F)) {
                  rd.field_b = rd.field_b + 1;
                }
              }
            } else {
              if (rd.field_b < ea.field_F) {
                rd.field_b = rd.field_b + 1;
              }
            }
            var5_intLifetime1 = ea.field_F * ea.field_F;
            var6_int = -(rd.field_b * rd.field_b) + var5_intLifetime1;
            var7_int = an.field_j - 120 + 120 * var6_int / var5_intLifetime1;
            rc.a(var7_int, -30218);
          }
          if (mn.field_r == -3) {
            var3 = ah.field_b;
            if (var3 == null) {
              var3 = k.field_p;
            }
            var4_ref_String__ = new String[]{var3, ga.field_n, rf.field_l, rg.field_c};
            var5_array = new int[6][18];
            var6 = new int[6][16];
            var7 = new int[]{ad.field_d, 0, 0, 0, 0, 0};
            array$1 = new boolean[6];
            stackIn_179_0 = array$1;
            stackIn_179_1 = array$1;
            stackIn_179_2 = 0;
            stackIn_180_3 = !(qf.field_d < 2);
            stackIn_179_1[stackIn_179_2] = stackIn_180_3;
            stackIn_179_0[1] = false;
            stackIn_179_0[2] = false;
            stackIn_179_0[3] = false;
            stackIn_179_0[4] = false;
            stackIn_179_0[5] = false;
            var8 = stackIn_179_0;
            var9 = 0;
            L38: while (true) {
              if (var9 < 6) {
                var10 = 0;
                stackIn_212_0 = 0;
                if (var13 != 0) {
                  break L38;
                }
                var11 = stackIn_212_0;
                while (var11 < 4) {
                  stackIn_195_0 = 0;
                  var12 = stackIn_195_0;
                  while (var12 < 3) {
                    incrementValue$2 = var10;
                    var10++;
                    var5_array[var9][incrementValue$2] = kg.field_d[var11][var12];
                    var12++;
                  }
                  var11++;
                }
                stackIn_195_0Lifetime1 = 0;
                var11Lifetime1 = stackIn_195_0Lifetime1;
                while (var11Lifetime1 < 6) {
                  incrementValue$3 = var10;
                  var10++;
                  var5_array[var9][incrementValue$3] = so.field_c[var11Lifetime1];
                  var11Lifetime1++;
                }
                var11Lifetime2 = 0;
                while (var11Lifetime2 < 16) {
                  var6[var9][var11Lifetime2] = b.field_f[var11Lifetime2];
                  var11Lifetime2++;
                }
                var9++;
                continue;
              }
              jb.field_z = new le(false, 0, 3, false, var4_ref_String__, 0, var5_array, var6, var7, 0, 0, false, 0, var8);
              gj.a(ta.field_d, true, 14, -1);
              stackIn_212_0 = 1;
              break;
            }
            io.field_A = stackIn_212_0 != 0;
          }
          if (param0 != -89) {
            ArcanistsMulti.h((byte) 78);
          }
          if (-4 == mn.field_r) {
            if (jh.field_c[0] == f.field_g) {
              mi.a(jh.field_c[0], param0 + 92);
            }
            he.field_e.b((byte) -59, 64);
            var3_int = 0;
            L56: while (true) {
              if (var3_int < 4) {
                stackIn_235_0 = 0;
                if (var13 != 0) {
                  break L56;
                }
                var4 = stackIn_235_0;
                while (var4 < 3) {
                  he.field_e.f(kg.field_d[var3_int][var4], (byte) -60);
                  var4++;
                }
                var3_int++;
                continue;
              }
              stackIn_235_0 = 0;
              break;
            }
            var3_int = stackIn_235_0;
            do {
              if (var3_int >= 6) {
                var3_int = 0;
                break;
              }
              he.field_e.f(so.field_c[var3_int], (byte) -81);
              var3_int++;
            } while (var13 == 0);
            do {
              if (var3_int >= 16) {
                he.field_e.b((byte) -127, 9);
                mn.field_r = si.field_g;
                break;
              }
              he.field_e.f(b.field_f[var3_int], (byte) -47);
              var3_int++;
            } while (var13 == 0);
            kh.field_b = true;
          }
          if (mn.field_r == -5) {
            qc.a(false, wi.field_f.h((byte) 72), 11);
            oc.field_g = true;
            mn.field_r = si.field_g;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3_ref), "ArcanistsMulti.RA(" + param0 + ',' + param1 + ')');
        }
    }

    final void e(byte param0) {
        RuntimeException runtimeException = null;
        gh var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = field_G ? 1 : 0;
        try {
          this.a(true, 14, 19, 0, 5000, 9, 11, 8);
          ri.field_f = false;
          gb.a((byte) -9);
          la.field_a = false;
          nm.field_h = -1;
          jf.field_j = 0;
          ua.field_P = 0;
          kg.field_a = false;
          cb.field_e = 0L;
          ta.field_b = false;
          var2 = new gh();
          var2.b(128, 68, 9);
          im.a(22050, var2, fi.field_d, (java.awt.Component) ((Object) on.field_c), -22836, true);
          pn.field_d = 16728128;
          wm.field_I = 16777215;
          ql.field_a = 0;
          this.a(false, true, false, true, true, (byte) -128, false);
          di.field_n[69] = 1;
          di.field_n[63] = 16;
          di.field_n[60] = 1;
          di.field_n[61] = 0;
          kg.field_d[0] = ld.field_n[0];
          di.field_n[62] = 2;
          di.field_n[57] = -2;
          di.field_n[70] = 1;
          di.field_n[79] = 2;
          di.field_n[66] = 4;
          di.field_n[77] = 0;
          di.field_n[64] = 0;
          di.field_n[65] = 1;
          di.field_n[68] = 1;
          di.field_n[71] = 1;
          di.field_n[73] = -1;
          di.field_n[78] = 4;
          di.field_n[67] = 2;
          di.field_n[74] = 11;
          di.field_n[58] = -2;
          he.field_a = new int[256];
          cj.field_g = new int[256];
          kg.field_d[3] = hi.field_b[0];
          kg.field_d[2] = ug.field_d[0];
          var3 = -120 % ((-68 - param0) / 33);
          kg.field_d[1] = ud.field_z[0];
          var4 = 0;
          while (256 > var4) {
            he.field_a[var4] = (var4 << 16) + var4;
            cj.field_g[var4] = (var4 << 16) - (-(var4 / 2 << 8) - var4 / 4);
            var4++;
            if (var5 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "ArcanistsMulti.E(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a(an.field_f, "arcanistsmulti", an.field_j, (byte) -92, 15);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ArcanistsMulti.init()");
        }
    }

    final void c(byte param0) {
        Object stackIn_5_0 = null;
        int stackIn_67_0 = 0;
        boolean stackIn_125_0 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        qa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        qb var15 = null;
        kc var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var12Lifetime1;
        int var4Lifetime3;
        int var5Lifetime2;
        var20 = field_G ? 1 : 0;
        try {
          if (null == ka.field_m) {
            stackIn_5_0 = on.field_c;
          } else {
            stackIn_5_0 = ka.field_m;
          }
          var2 = stackIn_5_0;
          ce.field_m.a(true);
          if (param0 != -89) {
            ArcanistsMulti.a(66, (int[]) null, (dn) null, (String) null, 78L, -15, 110, (String) null, (kc) null);
          }
          if (oc.a(-15576)) {
            kh.a((byte) 14, (java.awt.Canvas) (var2), hk.c(0));
            return;
          }
          if (!ue.field_e) {
            eg.a((java.awt.Canvas) (var2), (byte) -29);
            return;
          }
          if (!hn.a((byte) 87)) {
            rb.a(mm.field_t, false, 100.0f);
            eg.a((java.awt.Canvas) (var2), (byte) -62);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          this.m(param0 + 15522);
          if (mn.field_r != si.field_g) {
            if (-2 != si.field_g &&
              mn.field_r != -2) {
              if (16 > km.field_c) {
                ji.a(-2, false, si.field_g, cb.field_b);
                tn.field_Fb = 256 * km.field_c / 16;
                de.e(0, 0, an.field_f, an.field_j, 0, tn.field_Fb / 2);
                gn.a(256, (byte) 108, tn.field_Fb / 2, 0, pm.field_c);
                gn.a(256, (byte) 97, tn.field_Fb / 2, an.field_f, an.field_j - pm.field_c);
                decompiledFrameRemainder0 = (var20 != 0);
              }
              if (decompiledFrameRemainder0) {
                ji.a(-2, false, mn.field_r, io.field_A);
                tn.field_Fb = (-(km.field_c * 256) + 8192) / 16;
                gn.a(256, (byte) 86, tn.field_Fb, 0, pm.field_c);
                gn.a(256, (byte) 78, tn.field_Fb, an.field_f, an.field_j - pm.field_c);
                gn.a(256, (byte) 97, tn.field_Fb, an.field_f / 2, an.field_j / 2);
                decompiledFrameRemainder0 = (var20 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (16 <= km.field_c) {
                ji.a(-2, false, mn.field_r, io.field_A);
                tn.field_Fb = (8192 - 256 * km.field_c) / 16;
                de.e(0, 0, an.field_f, an.field_j, 0, tn.field_Fb);
                if (var20 != 0) {
                  ji.a(-2, false, si.field_g, cb.field_b);
                  tn.field_Fb = km.field_c * 256 / 16;
                  de.e(0, 0, an.field_f, an.field_j, 0, tn.field_Fb);
                  ji.a(-2, true, si.field_g, cb.field_b);
                }
              } else {
                ji.a(-2, false, si.field_g, cb.field_b);
                tn.field_Fb = km.field_c * 256 / 16;
                de.e(0, 0, an.field_f, an.field_j, 0, tn.field_Fb);
                if (var20 != 0) {
                  ji.a(-2, true, si.field_g, cb.field_b);
                }
              }
            }
          } else {
            ji.a(-2, true, si.field_g, cb.field_b);
          }
          if (-2 != si.field_g &&
            -2 != mn.field_r) {
            li.a((byte) 99);
          }
          if (!cb.field_b ||
            !io.field_A) {
            var3_int = ea.field_F * ea.field_F;
            var4 = -(rd.field_b * rd.field_b) + var3_int;
            var5 = -120 + (an.field_j + 120 * var4 / var3_int);
            rc.a(var5, -30218);
            to.a(gj.a(29372), (byte) 119);
            if (si.field_g == -2) {
              var3_intLifetime1 = (int)(Math.sin((double)jb.field_v * 0.2) * 8.0);
              var4Lifetime3 = -(int)(Math.cos((double)jb.field_v * 0.2) * 5.0);
              if (var4Lifetime3 > 0) {
                var4Lifetime3 = 0;
              }
              var5Lifetime2 = -var3_intLifetime1;
              var6 = (int)(Math.cos(0.2 * (double)jb.field_v) * 5.0);
              if (var6 > 0) {
                var6 = 0;
              }
              var7 = (int)(Math.sin((double)jb.field_v * 0.1) * 8.0) + 16;
              var8 = 0;
              var9 = -(int)(8.0 * Math.sin(-0.1 + (double)jb.field_v * 0.1)) - 16;
              var10 = 0;
              var11 = (jb.field_v >> 9) % 24;
              var12 = 32;
              var13 = 160;
              stackIn_67_0 = (so.field_c[5] + so.field_c[2] + (so.field_c[0] + so.field_c[1]) - (-so.field_c[3] - so.field_c[4]) != 0) ? 0 : 1;
              boolean decompiledFrameRemainder1 = true;
              var14 = stackIn_67_0;
              if (((jb.field_v & 1024) > 0) &&
                (decompiledFrameRemainder1 = !((1023 & -jb.field_v + 1024) < 512)) &&
                (decompiledFrameRemainder1 = (var14 != 0))) {
                var10 = 0;
                var6 = 0;
                var11 = (jb.field_v >> 3) % 2;
                var3_intLifetime1 = 0;
                var5Lifetime2 = 0;
                var8 = 0;
                var9 = -16;
                var4Lifetime3 = 0;
                var7 = 16;
                decompiledFrameRemainder1 = (var20 != 0);
              }
              if ((decompiledFrameRemainder1) && ((1023 & jb.field_v) >= 512 &&
                var14 != 0)) {
                var3_intLifetime1 = 0;
                var10 = 0;
                var9 = -16;
                var5Lifetime2 = 0;
                var11 = (jb.field_v >> 3) % 2;
                var4Lifetime3 = 0;
                var7 = 16;
                var6 = 0;
                var8 = 0;
              }
              var15 = new qb(128, 256);
              var15.a();
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var8 + var13, kg.field_d[3], kg.field_d[0], 116, kg.field_d[1], qe.field_i[so.field_c[3]], var12 + var7);
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var13 + var4Lifetime3, kg.field_d[3], kg.field_d[0], -87, kg.field_d[1], fn.field_b[0], var3_intLifetime1 + var12);
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], 80, kg.field_d[1], jd.field_j[so.field_c[0]], var12);
              var13 -= 8;
              var13 -= 16;
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], -87, kg.field_d[1], kc.field_kb[so.field_c[1]], var12);
              var13 += 16;
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], -90, kg.field_d[1], hn.field_d[so.field_c[5]], var12);
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], -117, kg.field_d[1], bo.field_a[var11], var12);
              var13 -= 16;
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], -127, kg.field_d[1], tj.field_A[so.field_c[4]], var12);
              var13 += 8;
              var13 += 16;
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var6 + var13, kg.field_d[3], kg.field_d[0], -113, kg.field_d[1], h.field_I[0], var12 + var5Lifetime2);
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var10 + var13, kg.field_d[3], kg.field_d[0], 122, kg.field_d[1], ea.field_u[so.field_c[2]], var9 + var12);
              ce.field_m.a(true);
              var16 = db.a(false);
              if (null != var16) {
                var17 = var16.field_V - 202;
                de.h(4 + var16.field_V, var16.field_nb + 4, -4 + (var16.field_x + var16.field_V), var16.field_nb + (var16.field_I - 4));
                var18 = -480 + an.field_j;
                if (qf.field_d < 2) {
                  var19 = var18 + 87;
                  if (0 >= (1024 & jb.field_v)) {
                    var12Lifetime1 = 1023 & jb.field_v;
                    if (512 > var12Lifetime1 ||
                      var14 == 0) {
                      var15.c(var12Lifetime1 + var17, var19);
                    }
                    if (!(512 > var12Lifetime1) &&
                      var14 != 0 || var20 != 0) {
                      var12Lifetime1 = 512;
                      de.e(-4 + (-300 + var12Lifetime1) + var17, 78 + var13 + var18, 308, 64, 0, 192);
                      mi.field_B.a(io.field_x, var17 + (-300 + var12Lifetime1), var13 + (80 + var18), 300, 64, 16777215, -1, 1, 1, mi.field_B.field_C);
                      var15.e(var12Lifetime1 + var17, var19);
                      if (var20 != 0) {
                        var12Lifetime1 = -(1023 & jb.field_v) + 1024;
                        if (var12Lifetime1 >= 512 &&
                          var14 != 0) {
                          var12Lifetime1 = 512;
                          de.e(var17 + var12Lifetime1 - 300 - 4, var18 + 78 + var13, 308, 64, 0, 192);
                          mi.field_B.a(io.field_x, var17 + var12Lifetime1 - 300, var18 + (var13 + 80), 300, 64, 16777215, -1, 1, 1, mi.field_B.field_C);
                        }
                        var15.e(var17 + var12Lifetime1, var19);
                      }
                    }} else {
                    var12Lifetime1 = -(1023 & jb.field_v) + 1024;
                    if (var12Lifetime1 >= 512 &&
                      var14 != 0) {
                      var12Lifetime1 = 512;
                      de.e(var17 + var12Lifetime1 - 300 - 4, var18 + 78 + var13, 308, 64, 0, 192);
                      mi.field_B.a(io.field_x, var17 + var12Lifetime1 - 300, var18 + (var13 + 80), 300, 64, 16777215, -1, 1, 1, mi.field_B.field_C);
                    }
                    var15.e(var17 + var12Lifetime1, var19);
                  }
                  if (var20 != 0) {
                    var12Lifetime1 = 512;
                    de.e(var12Lifetime1 - (300 - var17), 78 + var13 + 20 + var18, 424, 64, 0, 128);
                    var19 = 16737792;
                    if ((jb.field_v & 64) > 0) {
                      var19 = 16777215;
                    }
                    mi.field_B.a("If you are playing with super mod powers, remember that the 'Mark of Fame' achievement is meant to be a CHALLENGE. Do not create games of over 3 players if you are not competent at the game. Never play with more than 4 players as you CANNOT win! Kill Seas and Nature players at ALL costs. Most of all, good luck!", -300 + var12Lifetime1 + var17, 91 + var13 + var18, 424, 64, var19, -1, 1, 1, -2 + mi.field_B.field_C);
                  }
                } else {
                  var12Lifetime1 = 512;
                  de.e(var12Lifetime1 - (300 - var17), 78 + var13 + 20 + var18, 424, 64, 0, 128);
                  var19 = 16737792;
                  if ((jb.field_v & 64) > 0) {
                    var19 = 16777215;
                  }
                  mi.field_B.a("If you are playing with super mod powers, remember that the 'Mark of Fame' achievement is meant to be a CHALLENGE. Do not create games of over 3 players if you are not competent at the game. Never play with more than 4 players as you CANNOT win! Kill Seas and Nature players at ALL costs. Most of all, good luck!", -300 + var12Lifetime1 + var17, 91 + var13 + var18, 424, 64, var19, -1, 1, 1, -2 + mi.field_B.field_C);
                }
              }
              de.a();
            }
            uh.a(gj.a(29372), 115);
            le.c(1, gj.a(29372));
          }
          var3 = (qa) (b.field_a.b(12623));
          if (var3 != null) {
            var5Lifetime1 = wi.field_h;
            if (80 <= var5Lifetime1) {
              if (230 <= var5Lifetime1) {
                var4Lifetime1 = -(var5Lifetime1 / 2) + 123;
                if (var20 != 0) {
                  var4Lifetime1 = 8;
                  var4Lifetime1 = -32 + var5Lifetime1 / 2;
                }
              } else {
                var4Lifetime1 = 8;
                if (var20 != 0) {
                  var4Lifetime1 = -32 + var5Lifetime1 / 2;
                }
              }
            } else {
              var4Lifetime1 = -32 + var5Lifetime1 / 2;
            }
            de.a(4, -4 + var4Lifetime1, tj.field_t.b(rb.field_n[var3.field_n]) + 56, 40, 0);
            de.a(5, var4Lifetime1 - 3, 54 + tj.field_t.b(rb.field_n[var3.field_n]), 38, 16741888);
            de.a(6, var4Lifetime1 - 2, tj.field_t.b(rb.field_n[var3.field_n]) + 52, 36, 0);
            mo.field_a[var3.field_n].c(8, var4Lifetime1, 32, 32);
            tj.field_t.a(rb.field_n[var3.field_n], 47, tj.field_t.field_C + var4Lifetime1, 0, 0);
            tj.field_t.a(rb.field_n[var3.field_n], 48, -1 + (var4Lifetime1 + tj.field_t.field_C), 0, 0);
            tj.field_t.a(rb.field_n[var3.field_n], 48, tj.field_t.field_C + var4Lifetime1, 16746496, -1);
          }
          boolean decompiledSharedTail0 = !(rc.b(param0 ^ 88));
          if (!decompiledSharedTail0) {
            if (null != ka.field_m) {
              stackIn_125_0 = true;
            } else {
              stackIn_125_0 = ie.field_Pb;
            }
            ke.a(stackIn_125_0, 4474111);
            decompiledSharedTail0 = (var20 != 0);
          }
          if ((decompiledSharedTail0) &&
            (um.a((byte) -5))) {
            de.b(0, 0, de.field_e, de.field_j);
            eb.a(kf.field_b, kf.field_b[0].field_y, -117, kf.field_b[0].field_q);
          }
          if (ii.field_c != ii.field_a) {
            var4Lifetime2 = u.field_i * 256 / 16;
            if (var4Lifetime2 > 0) {
              de.e(0, 0, de.field_e, de.field_j, 0, var4Lifetime2);
            }
          }
          ma.i(91);
          kn.a((java.awt.Canvas) (var2), (byte) -126, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "ArcanistsMulti.L(" + param0 + ')');
        }
    }

    final static void a(eg param0, byte param1) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ab var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int[] var6 = null;
        int var7 = 0;
        var7 = field_G ? 1 : 0;
        try {
          var2 = new ab(param0.a("", "logo.fo3d", -1));
          var3 = var2.e((byte) -121);
          var2.p(param1 + 166);
          ph.field_e = ma.a((byte) -101, var2);
          gn.field_g = new int[var3][];
          oo.field_u = new vg[var3];
          var4 = 0;
          do {
            if (var3 <= var4) {
              var2.r(param1 + 80);
              break;
            }
            oo.field_u[var4] = rn.a(true, var2);
            var4++;
          } while (var7 == 0);
          var4 = 0;
          while (var3 > var4) {
            var5 = oo.field_u[var4];
            var5.a(6, 0, 1, 6, 6);
            var5.b((byte) 62);
            var6 = new int[]{var5.field_k + var5.field_i >> 1, var5.field_v + var5.field_R >> 1, var5.field_N + var5.field_P >> 1};
            gn.field_g[var4] = var6;
            var5.a(-var6[1], (byte) -124, -var6[2], -var6[0]);
            var4++;
            if (var7 != 0) {
              return;
            }
          }
          if (param1 != -80) {
            field_H = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("ArcanistsMulti.WA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public ArcanistsMulti() {
    }

    final static void a(int param0, byte param1) {
        try {
          int var2_int = 84 % ((param1 - 57) / 54);
          gl.a(28 + sc.field_U[param0] * wl.field_L[param0].length, -8 + lm.field_e[param0], -27327, 14 - (-eo.field_b[param0] + lm.field_e[param0]), kf.field_b, tg.field_f[param0] - 16);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ArcanistsMulti.OA(" + param0 + ',' + param1 + ')');
        }
    }

    public static void h(byte param0) {
        try {
          field_H = null;
          field_F = null;
          if (param0 != -91) {
            ArcanistsMulti.j((byte) 24);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ArcanistsMulti.MA(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_G ? 1 : 0;
        try {
          if (param0 != 15433) {
            field_F = (String) null;
          }
          if (0 == jo.field_c) {
            pi.field_e = ee.field_a;
            if (null == jh.field_c[0] &&
              tc.field_x.a(true, "arcanists_titlescreen", "")) {
              jh.field_c[0] = ha.a(tc.field_x, "", "arcanists_titlescreen");
              jo.field_c = 1;
              jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[0], -123);
              mi.a(jh.field_c[0], 3);
            }
            return;
          }
          if (wn.field_C < 52) {
            if (wn.field_C != 0 ||
              !ue.field_d.a(true, "imp", "streamed")) {
              if (wn.field_C == 1 &&
                ue.field_d.a(true, "arcaneexplosion", "streamed")) {
                cn.field_N = pk.a("streamed", param0 ^ 15433, "arcaneexplosion", ue.field_d);
                wn.field_C = wn.field_C + 1;
                if (var3 == 0) {
                  return;
                }
              }
              if (wn.field_C == 2 &&
                ue.field_d.a(true, "flameexplosion", "streamed")) {
                sn.field_E = pk.a("streamed", 0, "flameexplosion", ue.field_d);
                wn.field_C = wn.field_C + 1;
                if (var3 == 0) {
                  return;
                }
              }
              if (wn.field_C != 3 ||
                !ue.field_d.a(true, "smokeexplosion", "streamed")) {
                if (wn.field_C == 4 &&
                  ue.field_d.a(true, "flamepuff", "streamed")) {
                  ee.field_b = pk.a("streamed", param0 - 15433, "flamepuff", ue.field_d);
                  wn.field_C = wn.field_C + 1;
                  if (var3 == 0) {
                    return;
                  }
                }
                if (wn.field_C == 5 &&
                  ue.field_d.a(true, "smokepuff", "streamed")) {
                  vi.field_M = pk.a("streamed", 0, "smokepuff", ue.field_d);
                  wn.field_C = wn.field_C + 1;
                  if (var3 == 0) {
                    return;
                  }
                }
                if (wn.field_C != 6 ||
                  !ue.field_d.a(true, "stormpuff", "streamed")) {
                  if (wn.field_C == 7 &&
                    ue.field_d.a(true, "stormexplosion", "streamed")) {
                    u.field_j = pk.a("streamed", param0 - 15433, "stormexplosion", ue.field_d);
                    wn.field_C = wn.field_C + 1;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  if (wn.field_C == 8 &&
                    ue.field_d.a(true, "cyclopstest", "streamed")) {
                    gb.field_c = pk.a("streamed", 0, "cyclopstest", ue.field_d);
                    wn.field_C = wn.field_C + 1;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  if (wn.field_C != 9 ||
                    !ue.field_d.a(true, "sylph", "streamed")) {
                    if (wn.field_C == 10 &&
                      ue.field_d.a(true, "frostgiant", "streamed")) {
                      ea.field_v = pk.a("streamed", 0, "frostgiant", ue.field_d);
                      wn.field_C = wn.field_C + 1;
                      pi.field_e = vm.field_f;
                      if (var3 == 0) {
                        return;
                      }
                    }
                    if (wn.field_C != 11 ||
                      !ue.field_d.a(true, "dwarf", "streamed")) {
                      if (12 != wn.field_C ||
                        !ue.field_d.a(true, "clockworkrecallsoldier", "streamed")) {
                        if (wn.field_C != 13 ||
                          !ue.field_d.a(true, "golem", "streamed")) {
                          if (wn.field_C != 14 ||
                            !ue.field_d.a(true, "flamedragon", "streamed")) {
                            if (15 != wn.field_C ||
                              !ue.field_d.a(true, "frostdragon", "streamed")) {
                              if (wn.field_C == 16 &&
                                ue.field_d.a(true, "stormdragon", "streamed")) {
                                jk.field_m = pk.a("streamed", 0, "stormdragon", ue.field_d);
                                wn.field_C = wn.field_C + 1;
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              if (wn.field_C != 17 ||
                                !ue.field_d.a(true, "zombiedragon", "streamed")) {
                                if (wn.field_C == 18 &&
                                  ue.field_d.a(true, "clockworkdragon", "streamed")) {
                                  ub.field_e = pk.a("streamed", 0, "clockworkdragon", ue.field_d);
                                  wn.field_C = wn.field_C + 1;
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                if (wn.field_C != 19 ||
                                  !ue.field_d.a(true, "brinegoblin", "streamed")) {
                                  if (20 != wn.field_C ||
                                    !ue.field_d.a(true, "ent", "streamed")) {
                                    if (wn.field_C != 21 ||
                                      !ue.field_d.a(true, "elf", "streamed")) {
                                      if (wn.field_C != 22 ||
                                        !ue.field_d.a(true, "monkey", "streamed")) {
                                        if (wn.field_C != 23 ||
                                          !ue.field_d.a(true, "darkknight", "streamed")) {
                                          if (wn.field_C == 24 &&
                                            ue.field_d.a(true, "wraith", "streamed")) {
                                            pm.field_d = pk.a("streamed", 0, "wraith", ue.field_d);
                                            wn.field_C = wn.field_C + 1;
                                            if (var3 == 0) {
                                              return;
                                            }
                                          }
                                          if (wn.field_C != 25 ||
                                            !ue.field_d.a(true, "swarm", "streamed")) {
                                            if (26 != wn.field_C ||
                                              !ue.field_d.a(true, "pixies", "streamed")) {
                                              if (27 == wn.field_C &&
                                                ue.field_d.a(true, "paladin", "streamed")) {
                                                qj.field_d = pk.a("streamed", 0, "paladin", ue.field_d);
                                                wn.field_C = wn.field_C + 1;
                                                if (var3 == 0) {
                                                  return;
                                                }
                                              }
                                              if (wn.field_C != 28 ||
                                                !ue.field_d.a(true, "pegasus", "streamed")) {
                                                if (29 == wn.field_C &&
                                                  ue.field_d.a(true, "phoenix", "streamed")) {
                                                  gi.field_m = pk.a("streamed", param0 - 15433, "phoenix", ue.field_d);
                                                  wn.field_C = wn.field_C + 1;
                                                  if (var3 == 0) {
                                                    return;
                                                  }
                                                }
                                                if (wn.field_C != 30 ||
                                                  !ue.field_d.a(true, "watertroll", "streamed")) {
                                                  if (wn.field_C == 31 &&
                                                    ue.field_d.a(true, "freshwatertroll", "streamed")) {
                                                    c.field_a = pk.a("streamed", 0, "freshwatertroll", ue.field_d);
                                                    wn.field_C = wn.field_C + 1;
                                                    if (var3 == 0) {
                                                      return;
                                                    }
                                                  }
                                                  if (wn.field_C == 32 &&
                                                    ue.field_d.a(true, "hardwatertroll", "streamed")) {
                                                    vm.field_g = pk.a("streamed", 0, "hardwatertroll", ue.field_d);
                                                    wn.field_C = wn.field_C + 1;
                                                    if (var3 == 0) {
                                                      return;
                                                    }
                                                  }
                                                  if (wn.field_C != 33 ||
                                                    !ue.field_d.a(true, "waterlord", "streamed")) {
                                                    if (wn.field_C != 34 ||
                                                      !ue.field_d.a(true, "flameshield", "streamed")) {
                                                      if (wn.field_C != 35 ||
                                                        !ue.field_d.a(true, "clockworkexplosion", "streamed")) {
                                                        if (wn.field_C == 36 &&
                                                          ue.field_d.a(true, "clockworkpuff", "streamed")) {
                                                          wh.field_k = pk.a("streamed", param0 ^ 15433, "clockworkpuff", ue.field_d);
                                                          wn.field_C = wn.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (wn.field_C == 37 &&
                                                          ue.field_d.a(true, "windshield", "streamed")) {
                                                          pk.field_a = pk.a("streamed", 0, "windshield", ue.field_d);
                                                          wn.field_C = wn.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (wn.field_C == 38 &&
                                                          ue.field_d.a(true, "stormshield", "streamed")) {
                                                          i.field_a = pk.a("streamed", 0, "stormshield", ue.field_d);
                                                          wn.field_C = wn.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (wn.field_C == 39 &&
                                                          ue.field_d.a(true, "flamewall", "streamed")) {
                                                          cj.field_f = pk.a("streamed", param0 - 15433, "flamewall", ue.field_d);
                                                          wn.field_C = wn.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (40 == wn.field_C &&
                                                          ue.field_d.a(true, "stonepuff", "streamed")) {
                                                          nm.field_c = pk.a("streamed", 0, "stonepuff", ue.field_d);
                                                          wn.field_C = wn.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (41 != wn.field_C ||
                                                          !ue.field_d.a(true, "frostpuff", "streamed")) {
                                                          if (wn.field_C != 42 ||
                                                            !ue.field_d.a(true, "underexplosion", "streamed")) {
                                                            if (43 == wn.field_C &&
                                                              ue.field_d.a(true, "skullexplosion", "streamed")) {
                                                              o.field_E = pk.a("streamed", 0, "skullexplosion", ue.field_d);
                                                              wn.field_C = wn.field_C + 1;
                                                              if (var3 == 0) {
                                                                return;
                                                              }
                                                            }
                                                            if (wn.field_C == 44 &&
                                                              ue.field_d.a(true, "thornexplosion", "streamed")) {
                                                              si.field_p = pk.a("streamed", 0, "thornexplosion", ue.field_d);
                                                              wn.field_C = wn.field_C + 1;
                                                              if (var3 == 0) {
                                                                return;
                                                              }
                                                            }
                                                            if (wn.field_C != 45 ||
                                                              !ue.field_d.a(true, "vineexplosion", "streamed")) {
                                                              if (wn.field_C == 46 &&
                                                                ue.field_d.a(true, "vinepuff", "streamed")) {
                                                                vl.field_i = pk.a("streamed", param0 ^ 15433, "vinepuff", ue.field_d);
                                                                wn.field_C = wn.field_C + 1;
                                                                if (var3 == 0) {
                                                                  return;
                                                                }
                                                              }
                                                              if (47 != wn.field_C ||
                                                                !ue.field_d.a(true, "waterexplosion", "streamed")) {
                                                                if (48 == wn.field_C &&
                                                                  ue.field_d.a(true, "brineexplosion", "streamed")) {
                                                                  ea.field_H = pk.a("streamed", 0, "brineexplosion", ue.field_d);
                                                                  wn.field_C = wn.field_C + 1;
                                                                  if (var3 == 0) {
                                                                    return;
                                                                  }
                                                                }
                                                                if (49 == wn.field_C &&
                                                                  ue.field_d.a(true, "stoneexplosion", "streamed")) {
                                                                  ie.field_Tb = pk.a("streamed", 0, "stoneexplosion", ue.field_d);
                                                                  wn.field_C = wn.field_C + 1;
                                                                  if (var3 == 0) {
                                                                    return;
                                                                  }
                                                                }
                                                                if (wn.field_C != 50 ||
                                                                  !ue.field_d.a(true, "frostexplosion", "streamed")) {
                                                                  if (wn.field_C != 51) {
                                                                    return;
                                                                  }
                                                                  if (!ue.field_d.a(true, "watersplash", "streamed")) {
                                                                    return;
                                                                  }
                                                                  ob.field_db = pk.a("streamed", 0, "watersplash", ue.field_d);
                                                                  pi.field_e = vi.field_Q;
                                                                  wn.field_C = wn.field_C + 1;
                                                                  if (var3 == 0) {
                                                                    return;
                                                                  }
                                                                }
                                                                lf.field_e = pk.a("streamed", 0, "frostexplosion", ue.field_d);
                                                                wn.field_C = wn.field_C + 1;
                                                                if (var3 == 0) {
                                                                  return;
                                                                }
                                                              }
                                                              mb.field_cb = pk.a("streamed", param0 - 15433, "waterexplosion", ue.field_d);
                                                              wn.field_C = wn.field_C + 1;
                                                              if (var3 == 0) {
                                                                return;
                                                              }
                                                            }
                                                            rf.field_j = pk.a("streamed", param0 - 15433, "vineexplosion", ue.field_d);
                                                            wn.field_C = wn.field_C + 1;
                                                            if (var3 == 0) {
                                                              return;
                                                            }
                                                          }
                                                          jg.field_l = pk.a("streamed", 0, "underexplosion", ue.field_d);
                                                          wn.field_C = wn.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        kl.field_G = pk.a("streamed", 0, "frostpuff", ue.field_d);
                                                        wn.field_C = wn.field_C + 1;
                                                        if (var3 == 0) {
                                                          return;
                                                        }
                                                      }
                                                      je.field_a = pk.a("streamed", 0, "clockworkexplosion", ue.field_d);
                                                      wn.field_C = wn.field_C + 1;
                                                      if (var3 == 0) {
                                                        return;
                                                      }
                                                    }
                                                    cn.field_S = pk.a("streamed", param0 ^ 15433, "flameshield", ue.field_d);
                                                    wn.field_C = wn.field_C + 1;
                                                    if (var3 == 0) {
                                                      return;
                                                    }
                                                  }
                                                  nj.field_k = pk.a("streamed", param0 - 15433, "waterlord", ue.field_d);
                                                  wn.field_C = wn.field_C + 1;
                                                  if (var3 == 0) {
                                                    return;
                                                  }
                                                }
                                                g.field_f = pk.a("streamed", param0 ^ 15433, "watertroll", ue.field_d);
                                                wn.field_C = wn.field_C + 1;
                                                if (var3 == 0) {
                                                  return;
                                                }
                                              }
                                              ra.field_c = pk.a("streamed", 0, "pegasus", ue.field_d);
                                              wn.field_C = wn.field_C + 1;
                                              if (var3 == 0) {
                                                return;
                                              }
                                            }
                                            oe.field_d = pk.a("streamed", 0, "pixies", ue.field_d);
                                            wn.field_C = wn.field_C + 1;
                                            if (var3 == 0) {
                                              return;
                                            }
                                          }
                                          wl.field_U = pk.a("streamed", 0, "swarm", ue.field_d);
                                          wn.field_C = wn.field_C + 1;
                                          if (var3 == 0) {
                                            return;
                                          }
                                        }
                                        ra.field_j = pk.a("streamed", param0 - 15433, "darkknight", ue.field_d);
                                        wn.field_C = wn.field_C + 1;
                                        if (var3 == 0) {
                                          return;
                                        }
                                      }
                                      e.field_I = pk.a("streamed", 0, "monkey", ue.field_d);
                                      wn.field_C = wn.field_C + 1;
                                      if (var3 == 0) {
                                        return;
                                      }
                                    }
                                    jk.field_n = pk.a("streamed", 0, "elf", ue.field_d);
                                    wn.field_C = wn.field_C + 1;
                                    if (var3 == 0) {
                                      return;
                                    }
                                  }
                                  vk.field_w = pk.a("streamed", 0, "ent", ue.field_d);
                                  wn.field_C = wn.field_C + 1;
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                ml.field_v = pk.a("streamed", 0, "brinegoblin", ue.field_d);
                                wn.field_C = wn.field_C + 1;
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              ff.field_b = pk.a("streamed", 0, "zombiedragon", ue.field_d);
                              wn.field_C = wn.field_C + 1;
                              if (var3 == 0) {
                                return;
                              }
                            }
                            bk.field_L = pk.a("streamed", param0 ^ 15433, "frostdragon", ue.field_d);
                            wn.field_C = wn.field_C + 1;
                            if (var3 == 0) {
                              return;
                            }
                          }
                          rc.field_d = pk.a("streamed", 0, "flamedragon", ue.field_d);
                          wn.field_C = wn.field_C + 1;
                          if (var3 == 0) {
                            return;
                          }
                        }
                        i.field_g = pk.a("streamed", param0 ^ 15433, "golem", ue.field_d);
                        wn.field_C = wn.field_C + 1;
                        if (var3 == 0) {
                          return;
                        }
                      }
                      fe.field_h = pk.a("streamed", 0, "clockworkrecallsoldier", ue.field_d);
                      wn.field_C = wn.field_C + 1;
                      if (var3 == 0) {
                        return;
                      }
                    }
                    dh.field_Jb = pk.a("streamed", 0, "dwarf", ue.field_d);
                    wn.field_C = wn.field_C + 1;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  bj.field_ob = pk.a("streamed", 0, "sylph", ue.field_d);
                  wn.field_C = wn.field_C + 1;
                  if (var3 == 0) {
                    return;
                  }
                }
                fd.field_j = pk.a("streamed", 0, "stormpuff", ue.field_d);
                wn.field_C = wn.field_C + 1;
                if (var3 == 0) {
                  return;
                }
              }
              pa.field_a = pk.a("streamed", 0, "smokeexplosion", ue.field_d);
              wn.field_C = wn.field_C + 1;
              if (var3 == 0) {
                return;
              }
            }
            fb.field_a = pk.a("streamed", 0, "imp", ue.field_d);
            wn.field_C = wn.field_C + 1;
            return;
          }
          if (be.field_f >= 56) {
            if (jo.field_c >= 19) {
              return;
            }
            if (jh.field_c[4] == null &&
              tc.field_x.a(true, "arcanists_grassland", "")) {
              jh.field_c[4] = ha.a(tc.field_x, "", "arcanists_grassland");
              jo.field_c = 2;
              if (var3 == 0) {
                return;
              }
            }
            if (jo.field_c == 2) {
              jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[4], -105);
              jo.field_c = 3;
              if (var3 == 0) {
                return;
              }
            }
            if (null == jh.field_c[1] &&
              tc.field_x.a(true, "arcanists_giant_mountains", "")) {
              jh.field_c[1] = ha.a(tc.field_x, "", "arcanists_giant_mountains");
              jo.field_c = 4;
              if (var3 == 0) {
                return;
              }
            }
            if (jo.field_c != 4) {
              if (null == jh.field_c[2] &&
                tc.field_x.a(true, "arcanists_elven", "")) {
                jh.field_c[2] = ha.a(tc.field_x, "", "arcanists_elven");
                jo.field_c = 6;
                if (var3 == 0) {
                  return;
                }
              }
              if (jo.field_c != 6) {
                if (jh.field_c[3] != null ||
                  !tc.field_x.a(true, "arcanists_goblin_caves", "")) {
                  if (jo.field_c != 8) {
                    if (null != jh.field_c[5] ||
                      !tc.field_x.a(true, "arcanists_swamp", "")) {
                      if (jo.field_c != 10) {
                        if (null != jh.field_c[6] ||
                          !tc.field_x.a(true, "arcanists_graveyard", "")) {
                          if (jo.field_c == 12) {
                            jo.field_c = 13;
                            jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[6], param0 ^ -15414);
                            if (var3 == 0) {
                              return;
                            }
                          }
                          if (jh.field_c[7] != null ||
                            !tc.field_x.a(true, "arcanists_skycastles", "")) {
                            if (jo.field_c != 14) {
                              if (null != jh.field_c[8] ||
                                !tc.field_x.a(true, "arcanists_beach_cove", "")) {
                                if (jo.field_c == 16) {
                                  jo.field_c = 17;
                                  jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[8], 50);
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                if (null != jh.field_c[9] ||
                                  !tc.field_x.a(true, "arcanists_arcane_crystal_cavern", "")) {
                                  if (jo.field_c != 18) {
                                    return;
                                  }
                                  jo.field_c = 19;
                                  jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[9], param0 - 15554);
                                  jl.field_h.c(125);
                                  ki.field_s = null;
                                  tc.field_x = null;
                                  lo.field_w = null;
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                jh.field_c[9] = ha.a(tc.field_x, "", "arcanists_arcane_crystal_cavern");
                                jo.field_c = 18;
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              jh.field_c[8] = ha.a(tc.field_x, "", "arcanists_beach_cove");
                              jo.field_c = 16;
                              if (var3 == 0) {
                                return;
                              }
                            }
                            jo.field_c = 15;
                            jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[7], -116);
                            if (var3 == 0) {
                              return;
                            }
                          }
                          jh.field_c[7] = ha.a(tc.field_x, "", "arcanists_skycastles");
                          jo.field_c = 14;
                          if (var3 == 0) {
                            return;
                          }
                        }
                        jh.field_c[6] = ha.a(tc.field_x, "", "arcanists_graveyard");
                        jo.field_c = 12;
                        if (var3 == 0) {
                          return;
                        }
                      }
                      jo.field_c = 11;
                      jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[5], -109);
                      if (var3 == 0) {
                        return;
                      }
                    }
                    jh.field_c[5] = ha.a(tc.field_x, "", "arcanists_swamp");
                    jo.field_c = 10;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  jo.field_c = 9;
                  jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[3], 52);
                  if (var3 == 0) {
                    return;
                  }
                }
                jh.field_c[3] = ha.a(tc.field_x, "", "arcanists_goblin_caves");
                jo.field_c = 8;
                if (var3 == 0) {
                  return;
                }
              }
              jo.field_c = 7;
              jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[2], -115);
              if (var3 == 0) {
                return;
              }
            }
            jo.field_c = 5;
            jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[1], param0 - 15553);
            return;
          }
          if (!ck.field_b.c(-10923)) {
            return;
          }
          if (!wh.field_l.c(-10923)) {
            return;
          }
          if (null != ck.field_b) {
            if (be.field_f < 18) {
              if (be.field_f == 0 && (!ck.field_b.a("spell_select", -24417) ||
                !wh.field_l.a("spell_select", -24417))) {
                return;
              }
              pi.field_e = vi.field_Q;
              if (0 != be.field_f) {
                if (1 != be.field_f) {
                  if (be.field_f != 2) {
                    if (be.field_f != 3) {
                      if (be.field_f == 4) {
                        be.field_f = 5;
                        this.a(92, th.field_g[5], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_overlight").c(), to.field_r, false, cf.field_h);
                        if (var3 == 0) {
                          return;
                        }
                      }
                      if (be.field_f != 5) {
                        if (be.field_f == 6) {
                          be.field_f = 7;
                          this.a(255, th.field_g[7], pl.a(wh.field_l, "spell_select", "arcanists_select_spell_sea").a(), to.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (be.field_f == 7) {
                          be.field_f = 8;
                          this.a(255, th.field_g[6], pl.a(wh.field_l, "spell_select", "arcanists_select_spell_nature").a(), to.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (be.field_f != 8) {
                          if (9 != be.field_f) {
                            if (be.field_f != 10) {
                              if (11 == be.field_f) {
                                be.field_f = 12;
                                this.a(89, qo.field_a[2], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_storm").c(), to.field_r, false, cf.field_h);
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              if (be.field_f != 12) {
                                if (be.field_f != 13) {
                                  if (be.field_f == 14) {
                                    be.field_f = 15;
                                    this.a(59, qo.field_a[4], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_underdark").c(), to.field_r, false, cf.field_h);
                                    if (var3 == 0) {
                                      return;
                                    }
                                  }
                                  if (be.field_f != 15) {
                                    if (be.field_f == 16) {
                                      be.field_f = 17;
                                      this.a(255, qo.field_a[6], pl.a(wh.field_l, "spell_select", "arcanists_select_spellbook_nature").a(), to.field_r, false, cf.field_h);
                                      if (var3 == 0) {
                                        return;
                                      }
                                    }
                                    if (be.field_f != 17) {
                                      return;
                                    }
                                    be.field_f = 18;
                                    this.a(255, qo.field_a[8], pl.a(wh.field_l, "spell_select", "arcanists_select_spellbook_cog").a(), to.field_r, false, cf.field_h);
                                    if (var3 == 0) {
                                      return;
                                    }
                                  }
                                  be.field_f = 16;
                                  this.a(255, qo.field_a[7], pl.a(wh.field_l, "spell_select", "arcanists_select_spellbook_sea").a(), to.field_r, false, cf.field_h);
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                be.field_f = 14;
                                this.a(95, qo.field_a[5], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_overlight").c(), to.field_r, false, cf.field_h);
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              be.field_f = 13;
                              this.a(103, qo.field_a[1], pl.a(wh.field_l, "spell_select", "arcanists_select_spellbook_rock").a(), to.field_r, false, cf.field_h);
                              if (var3 == 0) {
                                return;
                              }
                            }
                            be.field_f = 11;
                            this.a(98, qo.field_a[3], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_frost").c(), to.field_r, false, cf.field_h);
                            if (var3 == 0) {
                              return;
                            }
                          }
                          be.field_f = 10;
                          this.a(87, qo.field_a[0], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_flame").c(), to.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        be.field_f = 9;
                        this.a(255, th.field_g[8], pl.a(wh.field_l, "spell_select", "arcanists_select_spell_cog").a(), to.field_r, false, cf.field_h);
                        if (var3 == 0) {
                          return;
                        }
                      }
                      be.field_f = 6;
                      this.a(75, th.field_g[4], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_underdark").c(), to.field_r, false, cf.field_h);
                      if (var3 == 0) {
                        return;
                      }
                    }
                    be.field_f = 4;
                    this.a(105, th.field_g[1], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_rock").c(), to.field_r, false, cf.field_h);
                    if (var3 == 0) {
                      return;
                    }
                  }
                  be.field_f = 3;
                  this.a(125, th.field_g[2], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_storm").c(), to.field_r, false, cf.field_h);
                  if (var3 == 0) {
                    return;
                  }
                }
                be.field_f = 2;
                this.a(182, th.field_g[3], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_frost").c(), to.field_r, false, cf.field_h);
                if (var3 == 0) {
                  return;
                }
              }
              be.field_f = 1;
              this.a(54, th.field_g[0], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_flame").c(), to.field_r, false, cf.field_h);
              return;
            }
            if (be.field_f < 44) {
              if (18 == be.field_f && (!ck.field_b.a("spell_impact", -24417) ||
                !wh.field_l.a("spell_impact", param0 - 39850))) {
                return;
              }
              pi.field_e = ee.field_a;
              if (be.field_f != 18) {
                if (be.field_f == 19) {
                  be.field_f = 20;
                  this.a(148, nn.field_n[0][1], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_flame_impact_2").a(), to.field_r, false, cf.field_h);
                  if (var3 == 0) {
                    return;
                  }
                }
                if (be.field_f == 20) {
                  be.field_f = 21;
                  this.a(55, nn.field_n[0][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_flame_impact_3").a(), to.field_r, false, cf.field_h);
                  if (var3 == 0) {
                    return;
                  }
                }
                if (be.field_f != 21) {
                  if (be.field_f != 22) {
                    if (be.field_f == 23) {
                      be.field_f = 24;
                      this.a(232, nn.field_n[3][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_frost_impact_3").a(), to.field_r, false, cf.field_h);
                      if (var3 == 0) {
                        return;
                      }
                    }
                    if (be.field_f != 24) {
                      if (be.field_f != 25) {
                        if (be.field_f == 26) {
                          be.field_f = 27;
                          this.a(166, nn.field_n[2][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_storm_impact_3").a(), to.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (be.field_f == 27) {
                          be.field_f = 28;
                          this.a(67, nn.field_n[1][0], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_rock_impact_1").a(), to.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (be.field_f == 28) {
                          be.field_f = 29;
                          this.a(83, nn.field_n[1][1], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_rock_impact_2").a(), to.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (29 == be.field_f) {
                          be.field_f = 30;
                          this.a(85, nn.field_n[1][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_rock_impact_3").a(), to.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (30 != be.field_f) {
                          if (be.field_f != 31) {
                            if (be.field_f == 32) {
                              be.field_f = 33;
                              this.a(136, nn.field_n[5][2], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_3").c(), to.field_r, false, cf.field_h);
                              if (var3 == 0) {
                                return;
                              }
                            }
                            if (be.field_f == 33) {
                              be.field_f = 34;
                              this.a(59, nn.field_n[4][0], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_1").c(), to.field_r, false, cf.field_h);
                              if (var3 == 0) {
                                return;
                              }
                            }
                            if (be.field_f != 34) {
                              if (be.field_f != 35) {
                                if (be.field_f == 36) {
                                  be.field_f = 37;
                                  this.a(255, nn.field_n[7][2], pl.a(wh.field_l, "spell_impact", "arcanists_clam_impact_individual").a(), to.field_r, false, cf.field_h);
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                if (be.field_f != 37) {
                                  if (be.field_f != 38) {
                                    if (be.field_f != 39) {
                                      if (40 == be.field_f) {
                                        be.field_f = 41;
                                        this.a(255, nn.field_n[6][1], pl.a(wh.field_l, "spell_impact", "arcanists_impact_nature_vinebomb").a(), to.field_r, false, cf.field_h);
                                        if (var3 == 0) {
                                          return;
                                        }
                                      }
                                      if (be.field_f == 41) {
                                        be.field_f = 42;
                                        this.a(255, nn.field_n[6][0], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_nature_impact_flurry_of_arrows").a(), to.field_r, false, cf.field_h);
                                        if (var3 == 0) {
                                          return;
                                        }
                                      }
                                      if (be.field_f != 42) {
                                        if (be.field_f != 43) {
                                          return;
                                        }
                                        be.field_f = 44;
                                        this.a(255, nn.field_n[8][0], pl.a(wh.field_l, "spell_impact", "arcanists_cog_calling_bell_hit").a(), to.field_r, false, cf.field_h);
                                        if (var3 == 0) {
                                          return;
                                        }
                                      }
                                      be.field_f = 43;
                                      this.a(255, nn.field_n[8][2], pl.a(wh.field_l, "spell_impact", "arcanists_cog_calling_bell_does_nothing").a(), to.field_r, false, cf.field_h);
                                      if (var3 == 0) {
                                        return;
                                      }
                                    }
                                    be.field_f = 40;
                                    this.a(255, nn.field_n[6][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_nature_impact_thornball").a(), to.field_r, false, cf.field_h);
                                    if (var3 == 0) {
                                      return;
                                    }
                                  }
                                  be.field_f = 39;
                                  this.a(255, nn.field_n[7][0], pl.a(wh.field_l, "spell_impact", "arcanists_brine_bomb_explode").a(), to.field_r, false, cf.field_h);
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                be.field_f = 38;
                                this.a(255, nn.field_n[7][1], pl.a(wh.field_l, "spell_impact", "arcanists_waterball_pop").a(), to.field_r, false, cf.field_h);
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              be.field_f = 36;
                              this.a(104, nn.field_n[4][2], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_3").c(), to.field_r, false, cf.field_h);
                              if (var3 == 0) {
                                return;
                              }
                            }
                            be.field_f = 35;
                            this.a(136, nn.field_n[4][1], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_2").c(), to.field_r, false, cf.field_h);
                            if (var3 == 0) {
                              return;
                            }
                          }
                          be.field_f = 32;
                          this.a(65, nn.field_n[5][1], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_2").c(), to.field_r, false, cf.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        be.field_f = 31;
                        this.a(80, nn.field_n[5][0], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_1").c(), to.field_r, false, cf.field_h);
                        if (var3 == 0) {
                          return;
                        }
                      }
                      be.field_f = 26;
                      this.a(90, nn.field_n[2][1], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_storm_impact_2").a(), to.field_r, false, cf.field_h);
                      if (var3 == 0) {
                        return;
                      }
                    }
                    be.field_f = 25;
                    this.a(107, nn.field_n[2][0], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_storm_impact_1").a(), to.field_r, false, cf.field_h);
                    if (var3 == 0) {
                      return;
                    }
                  }
                  be.field_f = 23;
                  this.a(130, nn.field_n[3][1], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_frost_impact_2").c(), to.field_r, false, cf.field_h);
                  if (var3 == 0) {
                    return;
                  }
                }
                be.field_f = 22;
                this.a(76, nn.field_n[3][0], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_frost_impact_1").a(), to.field_r, false, cf.field_h);
                if (var3 == 0) {
                  return;
                }
              }
              be.field_f = 19;
              this.a(61, nn.field_n[0][0], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_flame_impact_1").c(), to.field_r, false, cf.field_h);
              return;
            }
            if (44 == be.field_f &&
              ck.field_b.a("spell_charge", -24417) &&
              wh.field_l.a("spell_charge", param0 ^ -25386)) {
              be.field_f = 45;
              pi.field_e = vm.field_f;
              this.a(98, wh.field_i[0], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_flame").c(), to.field_r, false, cf.field_h);
              this.a(148, ah.field_f[0], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_flame").c(), to.field_r, false, cf.field_h);
              this.a(115, wh.field_i[3], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_frost").c(), to.field_r, false, cf.field_h);
              this.a(172, ah.field_f[3], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_frost").c(), to.field_r, false, cf.field_h);
              this.a(111, wh.field_i[2], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_storm").c(), to.field_r, false, cf.field_h);
              this.a(128, ah.field_f[2], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_storm").c(), to.field_r, false, cf.field_h);
              this.a(73, wh.field_i[1], pl.a(wh.field_l, "spell_charge", "arcanists_chargeup_rock").a(), to.field_r, false, cf.field_h);
              this.a(131, ah.field_f[1], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_rock").c(), to.field_r, false, cf.field_h);
              this.a(101, wh.field_i[5], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_overlight").c(), to.field_r, false, cf.field_h);
              this.a(161, ah.field_f[5], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_overlight").c(), to.field_r, false, cf.field_h);
              this.a(118, wh.field_i[4], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_underdark").c(), to.field_r, false, cf.field_h);
              this.a(118, ah.field_f[4], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_underdark").c(), to.field_r, false, cf.field_h);
              this.a(255, wh.field_i[7], pl.a(wh.field_l, "spell_charge", "arcanists_chargeup_sea").a(), to.field_r, false, cf.field_h);
              this.a(255, ah.field_f[7], pl.a(wh.field_l, "spell_charge", "arcanists_discharge_sea").a(), to.field_r, false, cf.field_h);
              this.a(255, wh.field_i[8], pl.a(wh.field_l, "spell_charge", "arcanists_chargeup_cog").a(), to.field_r, false, cf.field_h);
              this.a(255, ah.field_f[8], pl.a(wh.field_l, "spell_charge", "arcanists_discharge_cog").a(), to.field_r, false, cf.field_h);
              cf.field_h[wh.field_i[6]] = cf.field_h[qo.field_a[6]];
              to.field_r[wh.field_i[6]] = to.field_r[qo.field_a[6]];
              cf.field_h[ah.field_f[6]] = cf.field_h[qo.field_a[6]];
              to.field_r[ah.field_f[6]] = to.field_r[qo.field_a[6]];
              return;
            }
            if (be.field_f == 45 &&
              ck.field_b.a("spell_cast_universal", -24417) &&
              wh.field_l.a("spell_cast_universal", -24417)) {
              pi.field_e = go.field_h;
              be.field_f = 46;
              this.a(120, 64, ai.a(ck.field_b, "spell_cast_universal", "arcanists_cast_01_arcane_arrow").c(), to.field_r, false, cf.field_h);
              this.a(110, 72, ai.a(ck.field_b, "spell_cast_universal", "arcanists_cast_06_arcane_glyph").c(), to.field_r, false, cf.field_h);
              this.a(119, 66, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_02_arcane_tower").a(), to.field_r, false, cf.field_h);
              this.a(141, 68, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_03_arcane_gate").a(), to.field_r, false, cf.field_h);
              this.a(111, 74, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_05_arcane_flash").a(), to.field_r, false, cf.field_h);
              this.a(111, 69, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_bomb").a(), to.field_r, false, cf.field_h);
              this.a(111, 65, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_portal").a(), to.field_r, false, cf.field_h);
              this.a(111, 71, ai.a(ck.field_b, "spell_cast_universal", "arcanists_imp_destruction").c(), to.field_r, false, cf.field_h);
              this.a(111, 67, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_armour").a(), to.field_r, false, cf.field_h);
              this.a(111, 73, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_sigil").a(), to.field_r, false, cf.field_h);
              return;
            }
            if (46 == be.field_f &&
              ck.field_b.a("spell_cast_flame", -24417) &&
              wh.field_l.a("spell_cast_flame", -24417)) {
              pi.field_e = ba.field_b;
              be.field_f = 47;
              this.a(73, 76, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_07_fire_ball").c(), to.field_r, false, cf.field_h);
              this.a(118, 77, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_08_fire_arrow").c(), to.field_r, false, cf.field_h);
              this.a(129, 78, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_09_lava_bomb").c(), to.field_r, false, cf.field_h);
              this.a(113, 79, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_10_magma_bomb").c(), to.field_r, false, cf.field_h);
              this.a(104, 80, pl.a(wh.field_l, "spell_cast_flame", "arcanists_cast_11_flame_shield").a(), to.field_r, false, cf.field_h);
              this.a(120, 81, pl.a(wh.field_l, "spell_cast_flame", "arcanists_cast_12_flame_wall").a(), to.field_r, false, cf.field_h);
              this.a(107, 82, pl.a(wh.field_l, "spell_cast_flame", "arcanists_cast_13_napalm").a(), to.field_r, false, cf.field_h);
              this.a(96, 83, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_14_napalm_bomb").c(), to.field_r, false, cf.field_h);
              this.a(75, 84, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_15_rain_of_fire").c(), to.field_r, false, cf.field_h);
              this.a(117, 85, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_16_fire_of_arrows").c(), to.field_r, false, cf.field_h);
              this.a(122, 86, pl.a(wh.field_l, "spell_cast_flame", "arcanists_cast_17_volcano").a(), to.field_r, false, cf.field_h);
              this.a(117, 87, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_18_flame_dragon").c(), to.field_r, false, cf.field_h);
              return;
            }
            if (be.field_f == 47 &&
              ck.field_b.a("spell_cast_frost", -24417)) {
              pi.field_e = wh.field_j;
              be.field_f = 48;
              this.a(63, 112, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_43_ice_ball").c(), to.field_r, false, cf.field_h);
              this.a(94, 113, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_44_ice_bomb").c(), to.field_r, false, cf.field_h);
              this.a(102, 114, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_45_shards").c(), to.field_r, false, cf.field_h);
              this.a(111, 115, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_46_frost_arrow").c(), to.field_r, false, cf.field_h);
              this.a(117, 116, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_47_snow_ball").c(), to.field_r, false, cf.field_h);
              this.a(95, 117, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_48_blizzard").c(), to.field_r, false, cf.field_h);
              this.a(128, 118, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_49_ice_shield").c(), to.field_r, false, cf.field_h);
              this.a(100, 119, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_50_ice_castle").c(), to.field_r, false, cf.field_h);
              this.a(89, 120, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_51_sylph").c(), to.field_r, false, cf.field_h);
              this.a(108, 121, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_52_frost_giant").c(), to.field_r, false, cf.field_h);
              this.a(177, 122, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_53_comet").c(), to.field_r, false, cf.field_h);
              this.a(184, 123, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_54_frost_dragon").c(), to.field_r, false, cf.field_h);
              return;
            }
            if (be.field_f == 48 &&
              ck.field_b.a("spell_cast_rock", -24417) &&
              wh.field_l.a("spell_cast_rock", -24417)) {
              pi.field_e = fe.field_m;
              be.field_f = 49;
              this.a(134, 88, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_19_pebble_shot").a(), to.field_r, false, cf.field_h);
              this.a(58, 89, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_20_scatter_rock").a(), to.field_r, false, cf.field_h);
              this.a(110, 90, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_21_quake").a(), to.field_r, false, cf.field_h);
              this.a(196, 91, ai.a(ck.field_b, "spell_cast_rock", "arcanists_cast_22_disruption").c(), to.field_r, false, cf.field_h);
              this.a(151, 92, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_23_mud_bomb").a(), to.field_r, false, cf.field_h);
              this.a(110, 93, ai.a(ck.field_b, "spell_cast_rock", "arcanists_cast_24_mega_boulder").c(), to.field_r, false, cf.field_h);
              this.a(85, 94, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_25_rock_slab").a(), to.field_r, false, cf.field_h);
              this.a(116, 95, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_26_fortress").a(), to.field_r, false, cf.field_h);
              this.a(120, 96, ai.a(ck.field_b, "spell_cast_rock", "arcanists_cast_27_dwarves").c(), to.field_r, false, cf.field_h);
              this.a(125, 97, ai.a(ck.field_b, "spell_cast_rock", "arcanists_cast_28_rock_golem").c(), to.field_r, false, cf.field_h);
              this.a(104, 98, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_29_meteor").a(), to.field_r, false, cf.field_h);
              this.a(65, 99, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_30_fissure").a(), to.field_r, false, cf.field_h);
              return;
            }
            if (49 == be.field_f &&
              ck.field_b.a("spell_cast_storm", -24417) &&
              wh.field_l.a("spell_cast_storm", -24417)) {
              pi.field_e = ld.field_j;
              be.field_f = 50;
              this.a(107, 100, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_31_thunder_shock").c(), to.field_r, false, cf.field_h);
              this.a(136, 101, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_32_chain_lightning").c(), to.field_r, false, cf.field_h);
              this.a(256, 102, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_33_wind_shield").c(), to.field_r, false, cf.field_h);
              this.a(129, 103, pl.a(wh.field_l, "spell_cast_storm", "arcanists_cast_34_hurricane").a(), to.field_r, false, cf.field_h);
              this.a(103, 104, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_35_shock_bomb").c(), to.field_r, false, cf.field_h);
              this.a(161, 105, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_36_storm_shield").c(), to.field_r, false, cf.field_h);
              this.a(127, 106, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_37_cyclops").c(), to.field_r, false, cf.field_h);
              this.a(123, 107, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_38_conductor_rod").c(), to.field_r, false, cf.field_h);
              this.a(92, 108, pl.a(wh.field_l, "spell_cast_storm", "arcanists_cast_39_thrust").a(), to.field_r, false, cf.field_h);
              this.a(108, 109, pl.a(wh.field_l, "spell_cast_storm", "arcanists_cast_40_flight").a(), to.field_r, false, cf.field_h);
              this.a(139, 110, pl.a(wh.field_l, "spell_cast_storm", "arcanists_cast_41_storm").a(), to.field_r, false, cf.field_h);
              this.a(184, 111, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_42_storm_dragon").c(), to.field_r, false, cf.field_h);
              return;
            }
            if (be.field_f == 50 &&
              ck.field_b.a("spell_cast_overlight", param0 - 39850) &&
              wh.field_l.a("spell_cast_overlight", -24417)) {
              be.field_f = 51;
              pi.field_e = fl.field_c;
              this.a(123, 145, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_67_castle_of_light").c(), to.field_r, false, cf.field_h);
              this.a(110, 137, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_68_sky_ray").c(), to.field_r, false, cf.field_h);
              this.a(139, 138, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_69_shining_bolt").c(), to.field_r, false, cf.field_h);
              this.a(107, 139, pl.a(wh.field_l, "spell_cast_overlight", "arcanists_cast_70_rising_star").a(), to.field_r, false, cf.field_h);
              this.a(109, 140, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_71_pegasus").c(), to.field_r, false, cf.field_h);
              this.a(131, 141, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_72_paladin").c(), to.field_r, false, cf.field_h);
              this.a(140, 142, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_73_forest_seed").c(), to.field_r, false, cf.field_h);
              this.a(113, 143, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_74_pixies").c(), to.field_r, false, cf.field_h);
              this.a(125, 144, pl.a(wh.field_l, "spell_cast_overlight", "arcanists_cast_75_sphere_of_healing").a(), to.field_r, false, cf.field_h);
              this.a(87, 136, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_76_protection_shield").c(), to.field_r, false, cf.field_h);
              this.a(123, 146, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_77_invulnerability_shield").c(), to.field_r, false, cf.field_h);
              this.a(128, 147, pl.a(wh.field_l, "spell_cast_overlight", "arcanists_cast_78_shining_power").a(), to.field_r, false, cf.field_h);
              return;
            }
            if (be.field_f == 51 &&
              ck.field_b.a("spell_cast_underdark", -24417)) {
              pi.field_e = mn.field_v;
              be.field_f = 52;
              this.a(156, 124, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_55_den_of_darkness").c(), to.field_r, false, cf.field_h);
              this.a(154, 125, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_56_rain_of_chaos").c(), to.field_r, false, cf.field_h);
              this.a(256, 126, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_57_drain_bolt").c(), to.field_r, false, cf.field_h);
              this.a(177, 127, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_58_death_bomb").c(), to.field_r, false, cf.field_h);
              this.a(145, 128, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_59_swarm").c(), to.field_r, false, cf.field_h);
              this.a(136, 129, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_60_dark_knight").c(), to.field_r, false, cf.field_h);
              this.a(142, 130, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_61_raise_dead").c(), to.field_r, false, cf.field_h);
              this.a(135, 131, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_62_wraith_minion").c(), to.field_r, false, cf.field_h);
              this.a(104, 132, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_63_aura_of_decay").c(), to.field_r, false, cf.field_h);
              this.a(122, 133, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_64_dark_defences").c(), to.field_r, false, cf.field_h);
              this.a(160, 134, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_65_swallowing_pit").c(), to.field_r, false, cf.field_h);
              this.a(159, 135, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_66_lichdom").c(), to.field_r, false, cf.field_h);
              return;
            }
            if (52 == be.field_f &&
              wh.field_l.a("spell_cast_ocean", -24417)) {
              be.field_f = 53;
              pi.field_e = lo.field_s;
              this.a(255, 160, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_waterball").a(), to.field_r, false, cf.field_h);
              this.a(255, 161, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_maelstrom").a(), to.field_r, false, cf.field_h);
              this.a(256, 162, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_summon_minions").a(), to.field_r, false, cf.field_h);
              this.a(255, 164, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_deluge").a(), to.field_r, false, cf.field_h);
              this.a(255, 165, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_english_summer").a(), to.field_r, false, cf.field_h);
              this.a(255, 166, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_brine_bolt_individual").a(), to.field_r, false, cf.field_h);
              this.a(255, 167, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_brine_bomb").a(), to.field_r, false, cf.field_h);
              this.a(255, 169, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_rain_of_clams").a(), to.field_r, false, cf.field_h);
              this.a(255, 170, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_tsunami").a(), to.field_r, false, cf.field_h);
              return;
            }
            if (be.field_f == 53 &&
              wh.field_l.a("spell_cast_nature", -24417)) {
              pi.field_e = tl.field_g;
              be.field_f = 54;
              this.a(255, 148, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_79_thornball").a(), to.field_r, false, cf.field_h);
              this.a(255, 149, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_80_thornbomb").a(), to.field_r, false, cf.field_h);
              this.a(255, 150, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_whip").a(), to.field_r, false, cf.field_h);
              this.a(255, 151, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_vinebridge2").a(), to.field_r, false, cf.field_h);
              this.a(255, 152, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_vinebomb").a(), to.field_r, false, cf.field_h);
              this.a(255, 153, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_entangle").a(), to.field_r, false, cf.field_h);
              this.a(255, 155, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_86_sanctuary").a(), to.field_r, false, cf.field_h);
              this.a(255, 157, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_88_flurry_of_arrows").a(), to.field_r, false, cf.field_h);
              this.a(255, 158, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_natureswrath").a(), to.field_r, false, cf.field_h);
              this.a(255, 159, pl.a(wh.field_l, "spell_cast_nature", "arcanists_impact_nature_vinebloom_build").a(), to.field_r, false, cf.field_h);
              return;
            }
            if (54 == be.field_f &&
              ck.field_b.a("spell_cast_cogs", -24417) &&
              wh.field_l.a("spell_cast_cogs", -24417)) {
              be.field_f = 55;
              pi.field_e = ma.field_I;
              this.a(255, 172, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_static_ball_shield_cast").c(), to.field_r, false, cf.field_h);
              this.a(255, 173, cf.field_h[172], to.field_r, false, cf.field_h);
              this.a(255, 174, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_mech_arrow_cast").c(), to.field_r, false, cf.field_h);
              this.a(255, 175, pl.a(wh.field_l, "spell_cast_cogs", "arcanists_cog_fall_cast").a(), to.field_r, false, cf.field_h);
              this.a(255, 176, pl.a(wh.field_l, "spell_cast_cogs", "arcanists_cog_recall_device_cast").a(), to.field_r, false, cf.field_h);
              this.a(255, 177, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_calling_bell_cast").c(), to.field_r, false, cf.field_h);
              this.a(255, 178, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_clock_tower_cast").c(), to.field_r, false, cf.field_h);
              this.a(255, 179, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_cuckoo_clock_cast").c(), to.field_r, false, cf.field_h);
              this.a(255, 180, pl.a(wh.field_l, "spell_cast_cogs", "arcanists_cog_blast_from_past_cast").a(), to.field_r, false, cf.field_h);
              this.a(255, 181, pl.a(wh.field_l, "spell_cast_cogs", "arcanists_cog_clockwork_bomb_loop_cast").a(), to.field_r, false, cf.field_h);
              this.a(255, 182, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_steam_dragon_cast").c(), to.field_r, false, cf.field_h);
              this.a(255, 183, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_redo_cast").c(), to.field_r, false, cf.field_h);
              cf.field_h[218] = cf.field_h[nn.field_n[8][0]];
              to.field_r[218] = to.field_r[nn.field_n[8][0]];
              return;
            }
            if (be.field_f == 55) {
              pi.field_e = md.field_d;
              if (ck.field_b.a(117) &&
                wh.field_l.a(113)) {
                be.field_f = 56;
                this.a(255, 154, ai.a(ck.field_b, "plant_minion", "arcanists_plant_minion_summon").c(), to.field_r, false, cf.field_h);
                this.a(255, 156, ai.a(ck.field_b, "elves", "arcanists_elf_summon").c(), to.field_r, false, cf.field_h);
                this.a(125, 70, ai.a(ck.field_b, "footmen", "arcanists_imp_for_the_arcanist").c(), to.field_r, false, cf.field_h);
                this.a(159, 171, ai.a(ck.field_b, "default", "arcanists_water_lord_summon").c(), to.field_r, false, cf.field_h);
                this.a(104, 168, ai.a(ck.field_b, "default", "arcanists_brine_goblin_summon").c(), to.field_r, false, cf.field_h);
                this.a(255, 163, pl.a(wh.field_l, "spell_impact", "arcanists_hydration_impact").a(), to.field_r, false, cf.field_h);
                this.a(255, 220, ai.a(ck.field_b, "trajectile", "natural_trajectile_loop").c(), to.field_r, false, cf.field_h);
                this.a(255, 226, ai.a(ck.field_b, "trajectile", "unnatural_trajectile_loop").c(), to.field_r, false, cf.field_h);
                this.a(64, 227, ai.a(ck.field_b, "trajectile", "bounce").c(), to.field_r, false, cf.field_h);
                this.a(198, 221, pl.a(wh.field_l, "other_buttons", "arcanists_menu_transition").a(), to.field_r, false, cf.field_h);
                this.a(256, 222, pl.a(wh.field_l, "other_buttons", "arcanists_units_click_on_map").a(), to.field_r, false, cf.field_h);
                this.a(256, 223, ai.a(ck.field_b, "other_buttons", "arcanists_units_drag_unit").c(), to.field_r, false, cf.field_h);
                this.a(256, 224, pl.a(wh.field_l, "other_buttons", "arcanists_units_select_next_unit").a(), to.field_r, false, cf.field_h);
                this.a(256, 225, ai.a(ck.field_b, "other_buttons", "arcanists_units_zoom_in").c(), to.field_r, false, cf.field_h);
                this.a(256, 48, pl.a(wh.field_l, "player", "arcanists_pl_01_footsteps").a(), tm.field_a, false, uk.field_g);
                this.a(171, 49, pl.a(wh.field_l, "player", "arcanists_pl_02_jump_fowards").a(), tm.field_a, false, uk.field_g);
                this.a(173, 50, pl.a(wh.field_l, "player", "arcanists_pl_03_jump_upwards").a(), tm.field_a, false, uk.field_g);
                this.a(255, 51, pl.a(wh.field_l, "player", "arcanists_pl_04_landing").a(), tm.field_a, false, uk.field_g);
                this.a(158, 52, ai.a(ck.field_b, "player", "arcanists_pl_05_damage").c(), tm.field_a, false, uk.field_g);
                this.a(153, 53, ai.a(ck.field_b, "player", "arcanists_pl_06_death").c(), tm.field_a, false, uk.field_g);
                this.a(155, 54, pl.a(wh.field_l, "player", "arcanists_pl_07_splash").a(), tm.field_a, false, uk.field_g);
                this.a(190, dm.field_G[0], ai.a(ck.field_b, "cyclops", "arcanists_cyclops_select").c(), tm.field_a, false, uk.field_g);
                this.a(191, dm.field_G[2], ai.a(ck.field_b, "cyclops", "arcanists_cyclops_hit").c(), tm.field_a, false, uk.field_g);
                this.a(178, dm.field_G[1], ai.a(ck.field_b, "cyclops", "arcanists_cyclops_death").c(), tm.field_a, false, uk.field_g);
                this.a(165, hi.field_f[0], ai.a(ck.field_b, "dark_knight", "arcanists_dark_knight_select").c(), tm.field_a, false, uk.field_g);
                this.a(203, hi.field_f[2], ai.a(ck.field_b, "dark_knight", "arcanists_dark_knight_hit").c(), tm.field_a, false, uk.field_g);
                this.a(152, hi.field_f[1], ai.a(ck.field_b, "dark_knight", "arcanists_dark_knight_death").c(), tm.field_a, false, uk.field_g);
                this.a(149, 194, pl.a(wh.field_l, "dark_knight", "arcanists_dark_knight_charge_attack").a(), to.field_r, false, cf.field_h);
                this.a(151, fb.field_b[0], ai.a(ck.field_b, "dwarf", "arcanists_dwarf_select").c(), tm.field_a, false, uk.field_g);
                this.a(142, fb.field_b[2], ai.a(ck.field_b, "dwarf", "arcanists_dwarf_hit").c(), tm.field_a, false, uk.field_g);
                this.a(153, fb.field_b[1], ai.a(ck.field_b, "dwarf", "arcanists_dwarf_death").c(), tm.field_a, false, uk.field_g);
                this.a(173, 188, pl.a(wh.field_l, "dwarf", "arcanists_dwarf_mining").a(), to.field_r, false, cf.field_h);
                this.a(103, 189, ai.a(ck.field_b, "dwarf", "arcanists_dwarf_self_destruct").c(), to.field_r, false, cf.field_h);
                this.a(118, ed.field_Ib[0], ai.a(ck.field_b, "paladin", "arcanists_paladin_select").c(), tm.field_a, false, uk.field_g);
                this.a(79, ed.field_Ib[2], ai.a(ck.field_b, "paladin", "arcanists_paladin_hit").c(), tm.field_a, false, uk.field_g);
                this.a(84, ed.field_Ib[1], ai.a(ck.field_b, "paladin", "arcanists_paladin_death").c(), tm.field_a, false, uk.field_g);
                this.a(91, 202, pl.a(wh.field_l, "paladin", "arcanists_paladin_smash").a(), to.field_r, false, cf.field_h);
                this.a(147, tc.field_B[0], ai.a(ck.field_b, "rock_golem", "arcanists_rock_golem_select").c(), tm.field_a, false, uk.field_g);
                this.a(128, tc.field_B[2], ai.a(ck.field_b, "rock_golem", "arcanists_rock_golem_hit").c(), tm.field_a, false, uk.field_g);
                this.a(148, tc.field_B[1], ai.a(ck.field_b, "rock_golem", "arcanists_rock_golem_death").c(), tm.field_a, false, uk.field_g);
                this.a(125, in.field_Fb[0], ai.a(ck.field_b, "slyph", "arcanists_slyph_select").c(), tm.field_a, false, uk.field_g);
                this.a(159, in.field_Fb[2], ai.a(ck.field_b, "slyph", "arcanists_slyph_hit").c(), tm.field_a, false, uk.field_g);
                this.a(181, in.field_Fb[1], ai.a(ck.field_b, "slyph", "arcanists_slyph_death").c(), tm.field_a, false, uk.field_g);
                this.a(161, 185, ai.a(ck.field_b, "slyph", "arcanists_slyph_arrow_attack").c(), to.field_r, false, cf.field_h);
                this.a(138, s.field_i[0], ai.a(ck.field_b, "wraith", "arcanists_wraith_select").c(), tm.field_a, false, uk.field_g);
                this.a(178, s.field_i[2], ai.a(ck.field_b, "wraith", "arcanists_wraith_hit").c(), tm.field_a, false, uk.field_g);
                this.a(166, s.field_i[1], ai.a(ck.field_b, "wraith", "arcanists_wraith_death").c(), tm.field_a, false, uk.field_g);
                this.a(255, 219, ai.a(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_attack").c(), to.field_r, false, cf.field_h);
                this.a(79, lj.field_g[0], ai.a(ck.field_b, "footmen", "arcanists_imp_yes_master").c(), tm.field_a, false, uk.field_g);
                uk.field_g[lj.field_g[2]] = null;
                this.a(115, 184, ai.a(ck.field_b, "footmen", "arcanists_imp_im_gonna_go_boom").c(), to.field_r, false, cf.field_h);
                this.a(167, mb.field_U[0], ai.a(ck.field_b, "frost_giant", "arcanists_frost_giant_select").c(), tm.field_a, false, uk.field_g);
                this.a(149, mb.field_U[2], ai.a(ck.field_b, "frost_giant", "arcanists_frost_giant_hit").c(), tm.field_a, false, uk.field_g);
                this.a(167, mb.field_U[1], ai.a(ck.field_b, "frost_giant", "arcanists_frost_giant_death").c(), tm.field_a, false, uk.field_g);
                this.a(109, 187, pl.a(wh.field_l, "frost_giant", "arcanists_frost_giant_smash_attack").a(), to.field_r, false, cf.field_h);
                cf.field_h[197] = cf.field_h[102];
                to.field_r[198] = to.field_r[105];
                to.field_r[197] = to.field_r[102];
                cf.field_h[198] = cf.field_h[105];
                to.field_r[103] = to.field_r[103];
                to.field_r[199] = to.field_r[136];
                cf.field_h[199] = cf.field_h[136];
                to.field_r[201] = to.field_r[187];
                cf.field_h[201] = cf.field_h[187];
                cf.field_h[103] = cf.field_h[103];
                this.a(176, lj.field_n[0], ai.a(ck.field_b, "storm_dragon", "arcanists_storm_dragon_select").c(), tm.field_a, false, uk.field_g);
                this.a(182, lj.field_n[2], ai.a(ck.field_b, "storm_dragon", "arcanists_storm_dragon_hit").c(), tm.field_a, false, uk.field_g);
                this.a(202, lj.field_n[1], ai.a(ck.field_b, "storm_dragon", "arcanists_storm_dragon_death").c(), tm.field_a, false, uk.field_g);
                this.a(154, 193, ai.a(ck.field_b, "storm_dragon", "arcanists_storm_dragon_breath").c(), to.field_r, false, cf.field_h);
                this.a(190, gd.field_pb[0], ai.a(ck.field_b, "frost_dragon", "arcanists_frost_dragon_select").c(), tm.field_a, false, uk.field_g);
                this.a(256, gd.field_pb[2], ai.a(ck.field_b, "frost_dragon", "arcanists_frost_dragon_hit").c(), tm.field_a, false, uk.field_g);
                this.a(148, gd.field_pb[1], ai.a(ck.field_b, "frost_dragon", "arcanists_frost_dragon_death").c(), tm.field_a, false, uk.field_g);
                this.a(167, 192, ai.a(ck.field_b, "frost_dragon", "arcanists_frost_dragon_breath").c(), to.field_r, false, cf.field_h);
                this.a(181, fi.field_c[0], ai.a(ck.field_b, "flame_dragon", "arcanists_flame_dragon_select").c(), tm.field_a, false, uk.field_g);
                this.a(108, fi.field_c[2], ai.a(ck.field_b, "flame_dragon", "arcanists_flame_dragon_hit").c(), tm.field_a, false, uk.field_g);
                this.a(172, fi.field_c[1], ai.a(ck.field_b, "flame_dragon", "arcanists_flame_dragon_death").c(), tm.field_a, false, uk.field_g);
                this.a(167, 191, ai.a(ck.field_b, "flame_dragon", "arcanists_flame_dragon_breath").c(), to.field_r, false, cf.field_h);
                this.a(158, cj.field_a[0], ai.a(ck.field_b, "pegasus", "arcanists_pegasus_select").c(), tm.field_a, false, uk.field_g);
                this.a(229, cj.field_a[2], ai.a(ck.field_b, "pegasus", "arcanists_pegasus_hit").c(), tm.field_a, false, uk.field_g);
                this.a(183, cj.field_a[1], ai.a(ck.field_b, "pegasus", "arcanists_pegasus_death").c(), tm.field_a, false, uk.field_g);
                this.a(256, vg.field_c[0], ai.a(ck.field_b, "swarm", "arcanists_swarm_select").c(), tm.field_a, false, uk.field_g);
                this.a(256, vg.field_c[2], ai.a(ck.field_b, "swarm", "arcanists_swarm_hit").c(), tm.field_a, false, uk.field_g);
                this.a(256, vg.field_c[1], ai.a(ck.field_b, "swarm", "arcanists_swarm_death").c(), tm.field_a, false, uk.field_g);
                this.a(256, uj.field_c[0], ai.a(ck.field_b, "cyclops", "arcanists_storm_spirit_select").c(), tm.field_a, false, uk.field_g);
                this.a(85, gg.field_j[0], ai.a(ck.field_b, "pixie", "arcanists_pixie_select").c(), tm.field_a, false, uk.field_g);
                this.a(83, gg.field_j[2], ai.a(ck.field_b, "pixie", "arcanists_pixie_hit").c(), tm.field_a, false, uk.field_g);
                this.a(85, gg.field_j[1], ai.a(ck.field_b, "pixie", "arcanists_pixie_death").c(), tm.field_a, false, uk.field_g);
                this.a(235, 196, ai.a(ck.field_b, "pixie", "arcanists_pixie_fairyring").c(), to.field_r, false, cf.field_h);
                this.a(85, cf.field_a[0], ai.a(ck.field_b, "default", "arcanists_brine_goblin_select").c(), tm.field_a, false, uk.field_g);
                this.a(83, cf.field_a[2], pl.a(wh.field_l, "default", "arcanists_brine_goblin_hit").a(), tm.field_a, false, uk.field_g);
                this.a(85, cf.field_a[1], pl.a(wh.field_l, "default", "arcanists_brine_goblin_death").a(), tm.field_a, false, uk.field_g);
                this.a(85, fk.field_h[0], ai.a(ck.field_b, "elves", "arcanists_elf_select").c(), tm.field_a, false, uk.field_g);
                this.a(83, fk.field_h[2], ai.a(ck.field_b, "elves", "arcanists_elf_hit").c(), tm.field_a, false, uk.field_g);
                this.a(85, fk.field_h[1], ai.a(ck.field_b, "elves", "arcanists_elf_death").c(), tm.field_a, false, uk.field_g);
                this.a(85, jn.field_a[0], ai.a(ck.field_b, "plant_minion", "arcanists_plant_minion_select").c(), tm.field_a, false, uk.field_g);
                this.a(83, jn.field_a[2], ai.a(ck.field_b, "plant_minion", "arcanists_plant_minion_hit").c(), tm.field_a, false, uk.field_g);
                this.a(85, jn.field_a[1], ai.a(ck.field_b, "plant_minion", "arcanists_plant_minion_death").c(), tm.field_a, false, uk.field_g);
                this.a(85, cd.field_p[0], ai.a(ck.field_b, "default", "arcanists_water_troll_select").c(), tm.field_a, false, uk.field_g);
                this.a(83, cd.field_p[2], pl.a(wh.field_l, "default", "arcanists_sea_watertroll_hit").a(), tm.field_a, false, uk.field_g);
                this.a(85, cd.field_p[1], pl.a(wh.field_l, "default", "arcanists_sea_watertroll_death").a(), tm.field_a, false, uk.field_g);
                this.a(85, fd.field_h[0], pl.a(wh.field_l, "spell_cast_ocean", "arcanists_summon_sea_minion").a(), tm.field_a, false, uk.field_g);
                this.a(83, fd.field_h[2], pl.a(wh.field_l, "default", "arcanists_water_lord_hit").a(), tm.field_a, false, uk.field_g);
                this.a(85, fd.field_h[1], pl.a(wh.field_l, "default", "arcanists_water_lord_death").a(), tm.field_a, false, uk.field_g);
                this.a(255, om.field_B[0], cf.field_h[176], tm.field_a, false, uk.field_g);
                this.a(255, om.field_B[2], cf.field_h[176], tm.field_a, false, uk.field_g);
                this.a(255, om.field_B[1], cf.field_h[176], tm.field_a, false, uk.field_g);
                this.a(255, u.field_h[0], ai.a(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_select").c(), tm.field_a, false, uk.field_g);
                this.a(255, u.field_h[2], ai.a(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_hit").c(), tm.field_a, false, uk.field_g);
                this.a(255, u.field_h[1], ai.a(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_death").c(), tm.field_a, false, uk.field_g);
                ck.field_b = null;
                wh.field_l = null;
                return;
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ArcanistsMulti.QA(" + param0 + ')');
        }
    }

    static {
        field_H = "Log in / Create account";
        field_F = "Add <%0> to friend list";
    }
}
