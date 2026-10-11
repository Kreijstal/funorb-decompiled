/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends ma implements mj {
    private wl field_N;
    static int[] field_P;
    static ci[] field_K;
    static boolean field_Q;
    static boolean[][] field_L;
    static int[] field_M;
    private String[] field_O;
    private fb[] field_R;

    final static void a(ln param0, boolean param1, int param2, boolean param3) {
        tl dupTemp$0 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        tl stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        tl stackIn_29_0 = null;
        boolean stackIn_30_1 = false;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        tl stackIn_76_0 = null;
        boolean stackIn_76_1 = false;
        boolean stackIn_77_2 = false;
        tl stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        int stackIn_79_3 = 0;
        boolean stackIn_82_1 = false;
        tl stackIn_85_0 = null;
        boolean stackIn_86_1 = false;
        tl stackIn_90_0 = null;
        boolean stackIn_91_1 = false;
        int stackIn_95_0 = 0;
        tl stackIn_109_0 = null;
        boolean stackIn_110_1 = false;
        tl stackIn_114_0 = null;
        boolean stackIn_115_1 = false;
        tl stackIn_118_0 = null;
        boolean stackIn_119_1 = false;
        tl stackIn_122_0 = null;
        boolean stackIn_123_1 = false;
        String stackIn_141_0 = null;
        tl stackIn_145_0 = null;
        boolean stackIn_146_1 = false;
        tl stackIn_148_0 = null;
        boolean stackIn_149_1 = false;
        int stackIn_155_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_215_0 = 0;
        tl stackIn_318_0 = null;
        boolean stackIn_318_1 = false;
        boolean stackIn_319_2 = false;
        tl stackIn_321_0 = null;
        int stackIn_321_1 = 0;
        byte stackIn_321_2 = 0;
        int stackIn_321_3 = 0;
        boolean stackIn_324_1 = false;
        tl stackIn_328_0 = null;
        boolean stackIn_329_1 = false;
        tl stackIn_333_0 = null;
        boolean stackIn_334_1 = false;
        RuntimeException stackIn_343_0 = null;
        StringBuilder stackIn_343_1 = null;
        String stackIn_344_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        tl[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        tl var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        int var23 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        tl var28 = null;
        tl var29 = null;
        tl[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        Object var25Lifetime1;
        Object var25Lifetime1Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = Chess.field_G;
        try {
          if (!param1) {
            if (ci.f(-48)) {
              stackIn_12_0 = (!param0.field_Vb) ? 1 : 0;
            } else {
              stackIn_12_0 = 0;
            }
            var4_int = stackIn_12_0;
          } else {
            stackIn_5_0 = (ud.field_b) ? 0 : 1;
            var4_int = stackIn_5_0;
          }
          var5 = 0;
          if (!param1) {
            for (var6 = 0; 5 > var6; var6++) {
              if (var4_int != 0 &&
                ba.field_P[0][1 + var6].field_L != 0 &&
                param0.field_ic != var6) {
                var5 = 1;
                param0.field_ic = var6;
              }
              stackIn_23_0 = ba.field_P[0][var6 + 1];
              stackIn_24_1 = (var4_int != 0);
              stackIn_23_0.field_tb = stackIn_24_1;
              if (!bo.field_c &&
                var6 == 3) {
                ba.field_P[0][var6 + 1].field_tb = false;
              }
              stackIn_29_0 = ba.field_P[0][1 + var6];
              stackIn_30_1 = (var6 == param0.field_ic);
              stackIn_29_0.field_gb = stackIn_30_1;
            }
            if (ba.field_P[0][2].field_Db) {
              if (ci.f(-48)) {
                pc.field_Mb = th.field_f;
              } else {
                pc.field_Mb = oc.a(jd.field_e, new String[]{pd.field_Rb.field_Gb}, (byte) -54);
              }
            }
          }
          if (wn.field_d.length >= 2) {
            if (param1) {
              stackIn_43_0 = (dl.field_n != -1) ? 1 : 0;
            } else {
              stackIn_43_0 = 0;
            }
            var6Lifetime1 = stackIn_43_0;
            if (var6Lifetime1 != 0) {
              var7 = dl.field_n;
              for (var8_int = 0; g.field_f.length > var8_int; var8_int++) {
                g.field_f[var8_int] = (byte) 0;
              }
              g.field_f[var7 / 8] = (byte)s.a((int) g.field_f[var7 / 8], 1 << var7 % 8);
            }
            stackIn_51_0 = (!param1) ? 0 : -1;
            for (var7 = stackIn_51_0; wn.field_d.length > var7; var7++) {
              if (var6Lifetime1 != 0) {
                stackIn_59_0 = (dl.field_n != var7) ? 1 : 0;
              } else {
                stackIn_59_0 = 0;
              }
              var8_intLifetime1 = stackIn_59_0;
              if (var4_int != 0 &&
                0 != ba.field_P[1][1 + var7].field_L) {
                if (param1) {
                  if (var6Lifetime1 == 0) {
                    if (var7 == -1) {
                      for (var9 = 0; g.field_f.length > var9; var9++) {
                        g.field_f[var9] = (byte) 0;
                      }
                    } else {
                      g.field_f[var7 / 8] = (byte)dm.a((int) g.field_f[var7 / 8], 1 << ce.a(var7, 7));
                    }
                  }
                } else {
                  var9 = wn.field_d[var7];
                  if (param0.field_hc != var9) {
                    param0.field_hc = var9;
                    var5 = 1;
                  }
                }
              }
              if (!param1) {
                var9 = wn.field_d[var7];
                stackIn_85_0 = ba.field_P[1][var7 + 1];
                stackIn_86_1 = (param0.field_hc == var9);
                stackIn_85_0.field_gb = stackIn_86_1;
              } else {
                if (var7 == -1) {
                  ba.field_P[1][var7 + 1].field_gb = true;
                  for (var9 = 0; var9 < wn.field_d.length; var9++) {
                    dupTemp$0 = ba.field_P[1][var7 + 1];
                    stackIn_76_0 = dupTemp$0;
                    stackIn_76_1 = dupTemp$0.field_gb;
                    stackIn_77_2 = ((g.field_f[var9 / 8] & 1 << (7 & var9)) == 0);
                    stackIn_76_0.field_gb = stackIn_76_1 & stackIn_77_2;
                  }
                } else {
                  stackIn_79_0 = ba.field_P[1][var7 + 1];
                  stackIn_79_1 = -1;
                  stackIn_79_2 = g.field_f[var7 / 8] & 1 << (7 & var7);
                  stackIn_79_3 = -1;
                  stackIn_82_1 = (stackIn_79_1 != (stackIn_79_2 ^ stackIn_79_3));
                  stackIn_79_0.field_gb = stackIn_82_1;
                }
              }
              stackIn_90_0 = ba.field_P[1][1 + var7];
              stackIn_91_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_90_0.field_tb = stackIn_91_1;
            }
          }
          stackIn_95_0 = (!param1) ? 1 : 0;
          for (var6Lifetime2 = stackIn_95_0; var6Lifetime2 < 3; var6Lifetime2++) {
            var28 = ba.field_P[2][var6Lifetime2];
            if (var4_int != 0 &&
              var28.field_L != 0) {
              if (param1) {
                if (var6Lifetime2 == 0) {
                  p.field_n = 0;
                } else {
                  p.field_n = p.field_n ^ var6Lifetime2;
                }
              } else {
                if (param0.field_Mb != var6Lifetime2) {
                  param0.field_Mb = var6Lifetime2;
                  var5 = 1;
                }
              }
            }
            if (param1) {
              if (var6Lifetime2 != 0) {
                stackIn_118_0 = var28;
                stackIn_119_1 = ((var6Lifetime2 & p.field_n) != 0);
                stackIn_118_0.field_gb = stackIn_119_1;
              } else {
                stackIn_114_0 = var28;
                stackIn_115_1 = (p.field_n == 0);
                stackIn_114_0.field_gb = stackIn_115_1;
              }
            } else {
              stackIn_109_0 = var28;
              stackIn_110_1 = (0 != (param0.field_Mb & var6Lifetime2));
              stackIn_109_0.field_gb = stackIn_110_1;
            }
            stackIn_122_0 = var28;
            stackIn_123_1 = (var4_int != 0);
            stackIn_122_0.field_tb = stackIn_123_1;
          }
          if (!param3) {
            t.a(107);
          }
          if (param1 &&
            1 < un.field_q) {
            for (var6Lifetime3 = 0; 1 + un.field_q > var6Lifetime3; var6Lifetime3++) {
              var29 = ba.field_P[3][var6Lifetime3];
              if (var4_int != 0 &&
                var29.field_L != 0) {
                qd.field_u = var6Lifetime3;
              }
              if (var29.field_Db &&
                var6Lifetime3 > 0) {
                if (db.field_m == null) {
                  stackIn_141_0 = null;
                } else {
                  stackIn_141_0 = db.field_m[var6Lifetime3 - 1];
                }
                var8 = stackIn_141_0;
                if (var8 != null) {
                  pc.field_Mb = var8;
                }
              }
              stackIn_145_0 = var29;
              stackIn_146_1 = (qd.field_u == var6Lifetime3);
              stackIn_145_0.field_gb = stackIn_146_1;
              stackIn_148_0 = var29;
              stackIn_149_1 = (var4_int != 0);
              stackIn_148_0.field_tb = stackIn_149_1;
            }
          }
          var6Lifetime4 = 0;
          for (var7 = 0; var7 < qa.field_e; var7++) {
            var30 = ba.field_P[var7 + 4];
            var8_array = var30;
            stackIn_155_0 = (!param1) ? 0 : -1;
            for (var9 = stackIn_155_0; var9 < var30.length - 1; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                var9 >= 0) {
                if (null != nk.field_r &&
                  null != nk.field_r[var7] &&
                  (nk.field_r[var7][var9] & ~cb.field_c) > 0) {
                  var15 = ie.a(nk.field_r[var7][var9] & ~cb.field_c, (byte) -59);
                  var14 = 1;
                }
                if (field_L != null &&
                  field_L[var7] != null &&
                  0 >= cl.field_d &&
                  field_L[var7][var9]) {
                  var10 = 1;
                }
                if (null != uj.field_k &&
                  uj.field_k[var7] != null) {
                  var16 = uj.field_k[var7][var9];
                  if (var16 > 0 &&
                    var16 > fm.field_W) {
                    var12 = 1;
                  }
                  if (var16 != 0 &&
                    !lf.field_U &&
                    0 >= cl.field_d) {
                    var10 = 1;
                  }
                }
                if (param1) {
                  if (jc.field_g != null) {
                    if (jc.field_g[var7] != null) {
                      stackIn_192_0 = (!jc.field_g[var7][var9]) ? 0 : 1;
                    } else {
                      stackIn_192_0 = 0;
                    }
                  } else {
                    stackIn_192_0 = 0;
                  }
                } else {
                  stackIn_192_0 = 0;
                }
                var13 = stackIn_192_0;
                if (null != il.field_b &&
                  null != il.field_b[var7]) {
                  var16Lifetime2 = il.field_b[var7][var9];
                  if (var16Lifetime2 > 0 &&
                    var16Lifetime2 > jf.field_b) {
                    var11 = 1;
                  }
                  if (var16Lifetime2 != 0 &&
                    !lf.field_U &&
                    0 >= cl.field_d) {
                    var10 = 1;
                  }
                }
              }
              if (sk.field_t >= 2 &&
                ok.field_Jb[12]) {
                var11 = 0;
                var13 = 0;
                var10 = 0;
                var14 = 0;
                var12 = 0;
              }
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0) {
                if (var14 == 0) {
                  stackIn_215_0 = 0;
                } else {
                  stackIn_215_0 = 1;
                }
              } else {
                stackIn_215_0 = 1;
              }
              var16Lifetime1 = stackIn_215_0;
              pk.field_g = true;
              if (var16Lifetime1 == 0 &&
                var9 >= 0 &&
                hd.field_n != null && (!param1 ||
                !ud.field_b)) {
                d.field_Gb = false;
                if (null == d.field_Jb) {
                  bi.field_d = new boolean[qa.field_e];
                  d.field_Jb = new byte[qa.field_e];
                }
                pk.field_g = false;
                for (var17_int = 0; var7 > var17_int; var17_int++) {
                  bi.field_d[var17_int] = false;
                }
                b.a(var9, -78, 0, -1, var7, -1, param0, param1);
                if (sk.field_t >= 2 &&
                  ok.field_Jb[12]) {
                  pk.field_g = true;
                }
                if (!pk.field_g) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[1 + var9];
              if (var4_int != 0 &&
                var17.field_L != 0) {
                if (!param1) {
                  if (var16Lifetime1 == 0 &&
                    param0.field_sc[var7] != (byte)var9) {
                    param0.field_sc[var7] = (byte)var9;
                    var5 = 1;
                  }
                } else {
                  if (var9 == -1) {
                    for (var18 = var6Lifetime4; var18 < var30.length + var6Lifetime4 - 1; var18++) {
                      fe.field_d[var18 / 8] = (byte)ce.a((int) fe.field_d[var18 / 8], ~(1 << ce.a(var18, 7)));
                    }
                  } else {
                    fe.field_d[(var9 + var6Lifetime4) / 8] = (byte)dm.a((int) fe.field_d[(var9 + var6Lifetime4) / 8], 1 << ce.a(var9 + var6Lifetime4, 7));
                  }
                }
              }
              if (param1 &&
                var16Lifetime1 != 0) {
                fe.field_d[(var9 + var6Lifetime4) / 8] = (byte)ce.a((int) fe.field_d[(var9 + var6Lifetime4) / 8], ~(1 << ce.a(var6Lifetime4 + var9, 7)));
              }
              if (var9 >= 0 &&
                var17.field_Db) {
                if (null == ln.field_qc) {
                  var18_ref = null;
                } else {
                  if (null == ln.field_qc[var7]) {
                    var18_ref = null;
                  } else {
                    var18_ref = ln.field_qc[var7][var9];
                  }
                }
                if (null == in.field_f) {
                  var19 = null;
                } else {
                  if (null != in.field_f[var7]) {
                    var19 = in.field_f[var7][var9];
                  } else {
                    var19 = null;
                  }
                }
                var20 = null;
                if (var19 != null &&
                  !((String) (var19)).equals(var18_ref)) {
                  var20 = var19;
                }
                var21 = null;
                if (var13 != 0) {
                  var21 = pe.field_a;
                  var22 = var21;
                  var25 = var22;
                  var22 = var25;
                  var21 = var22;
                  var22 = var21;
                } else {
                  if (var10 == 0) {
                    if (var11 != 0) {
                      var22_int = il.field_b[var7][var9] - jf.field_b;
                      if (var22_int == 1) {
                        var21 = hm.field_a;
                      } else {
                        var21 = oc.a(ej.field_b, new String[]{Integer.toString(var22_int)}, (byte) -119);
                      }
                    }
                    if (var12 != 0) {
                      var31 = oc.a(da.field_B, new String[]{Integer.toString(fm.field_W), Integer.toString(uj.field_k[var7][var9])}, (byte) -74);
                      var22 = var31;
                      var25 = var22;
                      var22 = var25;
                      var21 = var22;
                      var22 = var31;
                      if (var21 != null) {
                        var21 = (String) (var21) + "<br>" + var31;
                      } else {
                        var21 = var31;
                      }
                    }
                    if (var14 != 0) {
                      var22 = vn.field_Eb;
                      if (var15 > 0 &&
                        null != la.field_b &&
                        var15 <= la.field_b.length &&
                        la.field_b[var15 - 1] != null) {
                        var22 = la.field_b[-1 + var15][0];
                      }
                      if (var21 != null) {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                      } else {
                        var21 = var22;
                      }
                    }
                  } else {
                    var21 = lf.field_Q;
                  }
                }
                if (var4_int != 0 &&
                  !pk.field_g) {
                  var22 = null;
                  if (d.field_Gb) {
                    var22 = "</col>" + tm.field_h + "<col=A00000>";
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var25Lifetime1Lifetime1 = var22;
                    var22 = var25Lifetime1Lifetime1;
                    var21 = var22;
                  }
                  var23 = 0;
                  for (var24 = 0; var24 < var7; var24++) {
                    if (bi.field_d[var24]) {
                      var25_ref = "</col>" + td.field_n[var24] + "<col=A00000>";
                      var22 = var25_ref;
                      var21 = var22;
                      var22 = var25_ref;
                      if (var22 == null) {
                        var22 = var25_ref;
                        var21 = var22;
                        var21 = var22;
                      } else {
                        var23 = 1;
                        var22 = (String) (var22) + ", " + var25_ref;
                      }
                    }
                  }
                  if (var23 != 0) {
                    var21 = eb.field_G + (String) (var22);
                  } else {
                    var21 = oc.a(fj.field_b, new String[]{(String) (var22)}, (byte) -100);
                  }
                }
                if (var21 != null) {
                  var32 = "<col=A00000>" + (String) (var21);
                  var33 = ia.a("<br>", "<br><col=A00000>", var32, (byte) 107);
                  if (var20 != null) {
                    var20 = (String) (var20) + "<br>" + var33;
                  } else {
                    var20 = var33;
                  }
                }
                if (var20 != null) {
                  pc.field_Mb = (String) (var20);
                }
              }
              if (!param1) {
                stackIn_328_0 = var17;
                stackIn_329_1 = (pk.field_g) && (param0.field_sc[var7] == (byte)var9);
                stackIn_328_0.field_gb = stackIn_329_1;
              } else {
                if (-1 == var9) {
                  var17.field_gb = true;
                  var27 = var6Lifetime4;
                  var18Lifetime1 = var27;
                  while (var27 < var30.length + (var6Lifetime4 - 1)) {
                    stackIn_318_0 = var17;
                    stackIn_318_1 = var17.field_gb;
                    stackIn_319_2 = ((fe.field_d[var27 / 8] & 1 << (7 & var27)) == 0);
                    stackIn_318_0.field_gb = stackIn_318_1 & stackIn_319_2;
                    var27++;
                  }
                } else {
                  stackIn_321_0 = var17;
                  stackIn_321_1 = 0;
                  stackIn_321_2 = fe.field_d[(var6Lifetime4 + var9) / 8];
                  stackIn_321_3 = 1 << (var6Lifetime4 + var9 & 7);
                  stackIn_324_1 = (stackIn_321_1 != (stackIn_321_2 & stackIn_321_3));
                  stackIn_321_0.field_gb = stackIn_324_1;
                }
              }
              stackIn_333_0 = var17;
              stackIn_334_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_333_0.field_tb = stackIn_334_1;
            }
            var6Lifetime4 = var6Lifetime4 + (255 & wk.field_e[var7]);
          }
          if (var5 != 0) {
            if (param1) {
              return;
            }
            si.a(126, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_343_0 = var4;
          stackIn_343_1 = new StringBuilder().append("t.C(");
          if (param0 == null) {
            stackIn_344_2 = "null";
          } else {
            stackIn_344_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_343_0), ((StringBuilder) (Object) stackIn_343_1).append(stackIn_344_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, -89, param3);
        if (0 != param1) {
          return;
        }
        if (param2 > -80) {
          mf var6 = (mf) null;
          this.a('￩', -83, 68, (mf) null);
        }
        lh var5 = rb.field_b;
        if (null != this.field_O) {
          var5.a(ic.field_f, this.field_u + param3, param0 + this.field_r, this.field_y, 20, 16777215, -1, 0, 0, var5.field_t + var5.field_C);
        }
    }

    t(wl param0) {
        super(0, 0, 0, 0, (jm) null);
        try {
          this.field_N = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "t.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String[] param0, int param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        wj var4 = null;
        int var6 = 0;
        var6 = Chess.field_G;
        try {
          this.field_I.e(-31023);
          if (param0 != null &&
            0 != param0.length) {
            var3_int = param0.length;
            this.field_O = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_O[var4_int] = rl.a((CharSequence) ((Object) param0[var4_int]), (byte) -70).replace(' ', ' ');
            }
            if (param1 != -1) {
              field_P = (int[]) null;
            }
            var4 = new wj(rb.field_b, 0, 1);
            this.field_R = new fb[1 + var3_int];
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_R[var5] = new fb(this.field_O[var5], (rg) (this));
              this.field_R[var5].field_n = (jm) ((Object) var4);
              this.field_R[var5].field_j = ih.field_Y;
              this.field_R[var5].a(var5 * 16 + 20, 34, 15, 80, 0);
              this.b(this.field_R[var5], 95);
            }
            this.field_R[var3_int] = new fb(cn.field_d, (rg) (this));
            this.field_R[var3_int].field_n = (jm) ((Object) var4);
            this.field_R[var3_int].a((var3_int + 1) * 16 + 20, 34, 15, 100, 0);
            this.b(this.field_R[var3_int], 95);
            return;
          }
          this.field_O = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("t.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Chess.field_G;
        try {
          if (param4 != -24221) {
            this.a(59, -126, 113, 15);
          }
          for (var6_int = 0; this.field_O.length > var6_int; var6_int++) {
            if (param0 == this.field_R[var6_int]) {
              this.field_N.a(this.field_O[var6_int], (byte) -121);
            }
          }
          if (this.field_R[this.field_O.length] == param0) {
            this.field_N.a(120);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("t.DA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 8) {
          return;
        }
        field_P = null;
        field_K = null;
        field_M = null;
        field_L = (boolean[][]) null;
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.a(param3, 27964);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.a(param3, (byte) -73);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("t.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_P = new int[]{64, 48};
        field_Q = true;
        field_M = new int[8192];
    }
}
