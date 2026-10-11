/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String[] field_d;
    static int field_b;
    private wb field_c;
    private wb field_a;

    final wb d(int param0) {
        if (param0 != -1) {
          this.field_a = (wb) null;
        }
        wb var2 = this.field_c.field_h;
        if (this.field_c == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_h;
        return var2;
    }

    final static void a(boolean param0, int param1, byte param2, boolean param3, boolean param4) {
        km stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_69_0 = 0;
        boolean stackIn_110_0 = false;
        int stackIn_125_0 = 0;
        boolean stackIn_136_0 = false;
        boolean stackIn_152_0 = false;
        int stackIn_158_0 = 0;
        km stackIn_178_0 = null;
        boolean stackIn_179_1 = false;
        km stackIn_185_0 = null;
        boolean stackIn_186_1 = false;
        km stackIn_190_0 = null;
        boolean stackIn_191_1 = false;
        Object stackIn_192_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_109_0;
        boolean stackOut_135_0;
        boolean stackOut_151_0;
        RuntimeException var5 = null;
        km var6 = null;
        km var7 = null;
        km var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
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
        p var17 = null;
        Object var18 = null;
        int var18_int = 0;
        lk var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        km var22 = null;
        int[] var23 = null;
        String var24 = null;
        String var25 = null;
        int[] var26 = null;
        km var27 = null;
        int stackIn_54_0Lifetime1;
        int stackIn_54_1Lifetime1;
        int stackIn_63_0Lifetime1;
        int var13_intLifetime1;
        int var18_intLifetime1;
        var18 = null;
        var19 = Virogrid.field_F ? 1 : 0;
        try {
          boolean decompiledFrameCompleted1 = true;
          rf.a(th.field_z, -4);
          if (wl.field_d != null) {
            fb.field_o.field_Y = true;
            var22 = ed.field_c;
            var27 = var22;
            ed.field_c.field_ub = 0;
            var27.field_K = 0;
            var6 = ii.field_d;
            ii.field_d.field_ub = 0;
            var6.field_K = 0;
            jk.field_b.field_ub = 0;
            var7 = jk.field_b;
            var7.field_K = 0;
            if (k.b(1000)) {
              qi.field_e.field_V = ri.field_e.toUpperCase();
              var9 = (2 + dm.field_r.field_K) / 2;
              ed.field_c.a(0, 40, var9 - 2, (byte) -68, dm.field_r.field_ub - 40);
              if (wl.field_d.field_ic >= wl.field_d.field_vc) {
                ed.field_c.field_V = oc.field_h.toUpperCase();
                ed.field_c.field_Y = false;
                if (var19 != 0) {
                  ed.field_c.field_V = lc.field_h.toUpperCase();
                  ed.field_c.field_Y = true;
                }
              } else {
                ed.field_c.field_V = lc.field_h.toUpperCase();
                ed.field_c.field_Y = true;
              }
              ed.field_c.field_vb = bd.field_b.field_vb;
              if (0 < ea.field_a) {
                if (1 != ea.field_a) {
                  var10_ref_String = oi.a(new String[]{Integer.toString(ea.field_a)}, l.field_e, 2);
                  if (var19 != 0) {
                    var10_ref_String = w.field_M;
                  }
                } else {
                  var10_ref_String = w.field_M;
                }
                if ((rl.field_y & 16) == 0 &&
                  !ad.field_h) {
                  ed.field_c.field_vb = bd.field_b.field_x;
                }
                ed.field_c.field_V = ed.field_c.field_V + "<br>" + var10_ref_String;
              }
              ii.field_d.a(var9, 40, dm.field_r.field_K - var9, (byte) -97, dm.field_r.field_ub - 40);
              ii.field_d.field_V = te.field_c.toUpperCase();
              stackIn_18_0 = ii.field_d;
              stackIn_19_1 = (param4) && (d.field_Eb == 0L);
              stackIn_18_0.field_Y = stackIn_19_1;
              var8 = ii.field_d;
              var10 = 2;
              if (null != nb.field_q) {
                if (ub.field_D == null) {
                  hk.field_Lb = new boolean[vb.field_h];
                  ub.field_D = new byte[vb.field_h];
                }
                var11_int = 0;
                do {
                  if (!(var11_int < vb.field_h)) {
                    var10 = 0;
                    break;
                  }
                  hk.field_Lb[var11_int] = false;
                  var11_int++;
                } while (var19 == 0);
                L18: while (true) {
                  if (var10 < 2) {
                    var11_int = 0;
                    stackIn_69_0 = 0;
                    if (var19 != 0) {
                      break L18;
                    }
                    var12 = stackIn_69_0;
                    while (true) {
                      stackIn_35_0 = nb.field_q.length;
                      stackIn_35_1 = var12;
                      if (stackIn_35_0 > stackIn_35_1) {
                        var26 = nb.field_q[var12];
                        var23 = var26;
                        var20 = var23;
                        var13 = var20;
                        stackIn_63_0 = 0;
                        var14_int = stackIn_63_0;
                        L25: while (true) {
                          if (var14_int < var26.length) {
                            var15 = var26[var14_int];
                            var16 = var20[var14_int + 1];
                            stackIn_54_0 = 0;
                            stackIn_54_1 = ~var15;
                            if (stackIn_54_0 != stackIn_54_1) {
                              if (~(255 & wl.field_d.field_Pb[var15]) != ~var16) {
                                break L25;
                              }
                            } else {
                              if (0 != var10) {
                                stackIn_47_0 = wl.field_d.field_ic;
                              } else {
                                stackIn_47_0 = wl.field_d.field_vc;
                              }
                              var17_int = stackIn_47_0;
                              if (~var17_int != ~var16 &&
                                var19 == 0) {
                                break L25;
                              }
                            }
                            var14_int += 2;
                            continue;
                          }
                          var11_int = 1;
                          var14_int = -1;
                          var15 = 0;
                          while (true) {
                            stackIn_54_0Lifetime1 = ~var26.length;
                            stackIn_54_1Lifetime1 = ~var15;
                            if (stackIn_54_0Lifetime1 >= stackIn_54_1Lifetime1) {
                              break;
                            }
                            var16 = var26[var15];
                            stackIn_35_0 = var14_int;
                            stackIn_35_1 = var16;
                            if (stackIn_35_0 < stackIn_35_1) {
                              var14_int = var16;
                            }
                            var15 += 2;
                          }
                          hk.field_Lb[var14_int] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_63_0Lifetime1 = var11_int;
                    if (stackIn_63_0Lifetime1 == 0 ||
                      var19 != 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_69_0 = ~hd.field_d;
                  break;
                }
                if (stackIn_69_0 <= -3 &&
                  dc.field_Y[12]) {
                  var10 = 2;
                }
              }
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameCompleted0 = true;
              boolean decompiledFrameRemainder0 = true;
              if ((2 <= var10) &&
                (decompiledFrameRemainder1 = (rf.field_i != null ||
                null != gg.field_E ||
                null != wm.field_B ||
                null != mb.field_db))) {
                var11_int = 0;
                var12 = 0;
                var13_int = 0;
                var14_int = 0;
                var15 = 0;
                var16 = 0;
                while (vb.field_h > var16) {
                  var17_int = wl.field_d.field_Pb[var16] & 255;
                  stackIn_192_0 = null;
                  if (var19 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_192_0 != rf.field_i &&
                    rf.field_i[var16] != null &&
                    rf.field_i[var16][var17_int]) {
                    var11_int = 1;
                  }
                  if (gg.field_E != null &&
                    gg.field_E[var16] != null) {
                    var18_int = gg.field_E[var16][var17_int];
                    if (var13_int < var18_int) {
                      var13_int = var18_int;
                    }
                    if (var18_int != 0 &&
                      !gi.field_a) {
                      var11_int = 1;
                    }
                  }
                  if (mb.field_db != null &&
                    mb.field_db[var16] != null) {
                    var15 = var15 | mb.field_db[var16][var17_int];
                  }
                  if (wm.field_B != null &&
                    null != wm.field_B[var16]) {
                    var18_intLifetime1 = wm.field_B[var16][var17_int];
                    if (var18_intLifetime1 != 0 &&
                      !gi.field_a) {
                      var11_int = 1;
                    }
                    if (var18_intLifetime1 > var14_int) {
                      var14_int = var18_intLifetime1;
                    }
                  }
                  var16++;
                }
                if (decompiledFrameCompleted1) {
                  var16 = 0;
                  var17 = wm.field_r.field_Jb.field_W;
                  var18_ref = (lk) (var17.a((byte) -72));
                  L50: while (true) {
                    boolean decompiledFrameRemainder2 = true;
                    if (var18_ref != null) {
                      stackOut_109_0 = var18_ref.g(0);
                      stackIn_125_0 = stackOut_109_0 ? 1 : 0;
                      stackIn_110_0 = stackOut_109_0;
                      if (var19 != 0) {
                        break L50;
                      }
                      if (!stackIn_110_0) {
                        if (var11_int != 0 &&
                          !var18_ref.field_Jb) {
                          var16 = 1;
                          decompiledFrameRemainder2 = false;
                        }
                        else {
                          if (var13_int > var18_ref.field_Vb) {
                            var16 = 1;
                            decompiledFrameRemainder2 = false;
                          }
                          else {
                            if (var18_ref.field_Rb < var14_int) {
                              var16 = 1;
                              decompiledFrameRemainder2 = false;
                            }
                            else {
                              if (0 < (~var18_ref.field_Fb & var15)) {
                                var16 = 1;
                                decompiledFrameRemainder2 = false;
                              }
                              else {
                                if (var12 != 0) {
                                  var16 = 1;
                                  decompiledFrameRemainder2 = false;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (decompiledFrameRemainder2) {
                        var18_ref = (lk) (var17.a(16213));
                        continue;
                      }
                    }
                    stackIn_125_0 = -3;
                    break;
                  }
                  if (stackIn_125_0 >= ~hd.field_d &&
                    dc.field_Y[12]) {
                    var16 = 0;
                  }
                  if ((var16 == 0) &&
                    (decompiledFrameRemainder1 = (var19 != 0))) {
                    ii.field_d.field_Y = false;
                    decompiledFrameRemainder1 = !(!ii.field_d.field_G);
                    if (decompiledFrameRemainder1) {
                      var11 = null;
                      var12 = 0;
                      var13_int = 0;
                      decompiledFrameRemainder0 = !(vb.field_h <= var13_int);
                      if (decompiledFrameRemainder0) {
                        stackOut_135_0 = hk.field_Lb[var13_int];
                        stackIn_158_0 = stackOut_135_0 ? 1 : 0;
                        stackIn_136_0 = stackOut_135_0;
                        decompiledFrameRemainder3 = false;
                      }
                    }
                  }
                  if ((decompiledFrameRemainder3) &&
                    (decompiledFrameRemainder1) &&
                    (decompiledFrameRemainder0)) {
                    ii.field_d.field_Y = false;
                    if (ii.field_d.field_G) {
                      if (0 != he.field_pc.field_c.field_Hb) {
                        wc.field_g = oi.a(new String[]{mj.field_A}, oe.field_a, 2);
                        if (var19 != 0) {
                          wc.field_g = am.field_a;
                        }
                      } else {
                        wc.field_g = am.field_a;
                      }
                    }
                    decompiledFrameRemainder1 = (var19 != 0);
                  }
                }
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0) &&
                (decompiledFrameCompleted1)) {
                ii.field_d.field_Y = false;
                decompiledFrameRemainder1 = !(!ii.field_d.field_G);
                if (decompiledFrameRemainder1) {
                  var11 = null;
                  var12 = 0;
                  var13_intLifetime1 = 0;
                  while (!(vb.field_h <= var13_intLifetime1)) {
                    stackOut_151_0 = hk.field_Lb[var13_intLifetime1];
                    stackIn_158_0 = stackOut_151_0 ? 1 : 0;
                    stackIn_152_0 = stackOut_151_0;
                    if (var19 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_152_0) {
                      var25 = "<col=A00000>" + bd.field_a[var13_intLifetime1] + "</col>";
                      if (var11 != null) {
                        var11 = (String) (var11) + ", " + var25;
                        var12 = 1;
                      } else {
                        var11 = var25;
                      }
                    }
                    var13_intLifetime1++;
                  }
                }
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder1) &&
                (decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                stackIn_158_0 = 0;
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameCompleted1)) {
                if (stackIn_158_0 != var10) {
                  var13_ref = qa.field_a;
                  boolean decompiledSharedTail0 = (var12 == 0);
                  if (!decompiledSharedTail0) {
                    var14 = s.field_c + (String) (var11);
                    decompiledSharedTail0 = (var19 != 0);
                  }
                  if (decompiledSharedTail0) {
                    var14 = oi.a(new String[]{(String) (var11)}, pm.field_i, 2);
                  }
                } else {
                  var13_ref = lj.field_k;
                  if (var12 == 0) {
                    var14 = oi.a(new String[]{(String) (var11)}, dk.field_r, 2);
                    if (var19 != 0) {
                      var14 = hd.field_c + (String) (var11);
                    }
                  } else {
                    var14 = hd.field_c + (String) (var11);
                  }
                }
                wc.field_g = "<col=A00000>" + var13_ref + "<br>" + var14;
              }
              if ((decompiledFrameCompleted1) &&
                (var19 != 0)) {
                var9_ref_String = wl.field_d.field_Qb;
                qi.field_e.field_V = oi.a(new String[]{var9_ref_String}, ra.field_c, 2).toUpperCase();
                jk.field_b.a(0, 40, dm.field_r.field_K, (byte) -97, dm.field_r.field_ub - 40);
                jk.field_b.field_V = oi.a(new String[]{var9_ref_String}, fm.field_c, 2);
                var8 = jk.field_b;
              }
            } else {
              var9_ref_String = wl.field_d.field_Qb;
              qi.field_e.field_V = oi.a(new String[]{var9_ref_String}, ra.field_c, 2).toUpperCase();
              jk.field_b.a(0, 40, dm.field_r.field_K, (byte) -97, dm.field_r.field_ub - 40);
              jk.field_b.field_V = oi.a(new String[]{var9_ref_String}, fm.field_c, 2);
              var8 = jk.field_b;
            }
            if (decompiledFrameCompleted1) {
              if (d.field_Eb != 0L) {
                var9 = (int)(-hc.a(-9986) + d.field_Eb);
                var9 = (999 + var9) / 1000;
                if (var9 < 1) {
                  var9 = 1;
                }
                var8.field_V = oi.a(new String[]{Integer.toString(var9)}, va.field_a, 2);
              }
              qh.field_R.field_V = oi.a(new String[]{Integer.toString(wl.field_d.field_ic), Integer.toString(wl.field_d.field_vc)}, gb.field_M, 2);
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_178_0 = ao.field_Eb;
            stackIn_179_1 = (param3) && (!param0) && (!ad.field_h);
            ((km) (Object) stackIn_178_0).a(stackIn_179_1, (byte) 94);
            if (param2 < 1) {
              return;
            }
            stackIn_185_0 = dm.field_r;
            stackIn_186_1 = (param3) && (!param0) && (!ad.field_h);
            ((km) (Object) stackIn_185_0).a(stackIn_186_1, (byte) 123);
            stackIn_190_0 = pm.field_n;
            stackIn_191_1 = (param3) && (!param0) && (ad.field_h);
            ((km) (Object) stackIn_190_0).a(stackIn_191_1, (byte) 122);
            he.field_pc.field_c.g(0);
            stackIn_192_0 = null;
          }
          if (stackIn_192_0 != wl.field_d) {
            if (fb.field_o.field_nb != 0) {
              nn.a(wl.field_d.e((byte) -124), param1, (byte) -128);
            }
            if (ii.field_d.field_nb != 0) {
              ah.field_c = true;
            }
            if (ed.field_c.field_nb != 0) {
              ad.field_h = true;
            }
            if (0 != na.field_Ib.field_nb) {
              ad.field_h = false;
            }
            co.a(param1, false, -2137400888, wl.field_d);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var5), "qk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(wb param0, byte param1) {
        try {
          if (null != param0.field_k) {
            param0.c(78);
          }
          param0.field_k = this.field_c.field_k;
          if (param1 < 87) {
            wb var4 = (wb) null;
            this.a((wb) null, (byte) 78);
          }
          param0.field_h = this.field_c;
          param0.field_k.field_h = param0;
          param0.field_h.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "qk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != 2) {
          field_b = -102;
        }
        field_d = null;
    }

    final static void b(byte param0) {
        String var2 = null;
        if (param0 != 59) {
          return;
        }
        if (null != cf.field_b) {
          var2 = cf.field_b;
          String var1 = var2;
          on.a((byte) 106, oi.a(new String[]{var2}, sa.field_o, 2));
          cf.field_b = null;
        }
    }

    final int b(int param0) {
        int var2;
        wb var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        var2 = param0;
        var3 = this.field_c.field_h;
        while (this.field_c != var3) {
          var3 = var3.field_h;
          var2++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return var2;
    }

    final static void a(boolean param0) {
        RuntimeException runtimeException = null;
        mg var1 = null;
        mg var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          var1 = new mg(540, 140);
          kb.a(var1, 16865);
          if (param0) {
            qk.a(true);
          }
          fk.a();
          df.c();
          kf.field_e = 0;
          cm.a(11);
          var2 = var1.d();
          var3 = 0;
          while (var3 < 15) {
            var2.d(-2, -2, 16777215);
            df.d(4, 4, 0, 0, 540, 140);
            var3++;
            if (var4 != 0) {
              return;
            }
          }
          cc.field_u.b();
          var1.e(0, 0);
          ai.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) runtimeException), "qk.D(" + param0 + ')');
        }
    }

    final wb a(byte param0) {
        wb var2 = this.field_c.field_h;
        if (param0 != -103) {
          java.applet.Applet var3 = (java.applet.Applet) null;
          qk.a((String) null, (java.applet.Applet) null, -78);
        }
        if (this.field_c == var2) {
          return null;
        }
        var2.c(26);
        return var2;
    }

    final wb a(int param0) {
        wb var2 = this.field_a;
        if (this.field_c == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_h;
        if (param0 != 26605) {
          this.field_a = (wb) null;
        }
        return var2;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          try {
            jj.field_g = param0;
            try {
              var3 = param1.getParameter("cookieprefix");
              var4 = param1.getParameter("cookiehost");
              var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
              if (~param0.length() == param2) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              q.a("document.cookie=\"" + var5 + "\"", -17107, param1);
            } catch (Throwable throwable) {
            }
            wf.a(param1, 49);
          } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "qk.H(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public qk() {
        this.field_c = new wb();
        this.field_c.field_h = this.field_c;
        this.field_c.field_k = this.field_c;
    }

    static {
        field_b = 64;
        field_d = new String[]{"The Easy One", "Perfect Jump", "Virogrid Expert", "Total domination", "Winning streak", "You lose", "Entrapment", "Bunny Hopping", "Virogrid Addict", "Ghost Spotter"};
    }
}
