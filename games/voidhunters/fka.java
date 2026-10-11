/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fka extends ksa {
    int field_e;
    ml field_d;
    ml field_f;

    final static void a(String param0, byte param1) {
        try {
          if (param1 > -51) {
            fka.a(96, (byte) 89, false, true, true);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "fka.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1, boolean param2, boolean param3, boolean param4) {
        llb stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        int stackIn_38_0 = 0;
        llb stackIn_165_0 = null;
        boolean stackIn_166_1 = false;
        llb stackIn_170_0 = null;
        boolean stackIn_171_1 = false;
        llb stackIn_175_0 = null;
        boolean stackIn_176_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        llb var6 = null;
        llb var7 = null;
        llb var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        ij var17 = null;
        Object var18 = null;
        jk var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        llb var21 = null;
        int[] var22 = null;
        String var23 = null;
        int[] var24 = null;
        llb var25 = null;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17_intLifetime1;
        int var18_intLifetime1;
        int var11Lifetime2;
        int var16Lifetime1Lifetime1;
        var18 = null;
        var19 = VoidHunters.field_G;
        try {
          lkb.a(tba.field_p, (byte) -128);
          if (lqa.field_o != null) {
            boolean decompiledFrameRemainder0 = true;
            nt.field_q.field_y = true;
            vw.field_a.field_G = 0;
            var21 = vw.field_a;
            var25 = var21;
            var25.field_hb = 0;
            var6 = qsa.field_b;
            qsa.field_b.field_G = 0;
            var6.field_hb = 0;
            qi.field_p.field_G = 0;
            var7 = qi.field_p;
            var7.field_hb = 0;
            if (nmb.b(119)) {
              rob.field_q.field_R = fmb.field_p.toUpperCase();
              var9 = (2 + vva.field_r.field_hb) / 2;
              vw.field_a.a(0, 116, -2 + var9, vva.field_r.field_G - 40, 40);
              if (lqa.field_o.field_Fb <= lqa.field_o.field_zb) {
                vw.field_a.field_R = ukb.field_q.toUpperCase();
                vw.field_a.field_y = false;
              } else {
                vw.field_a.field_R = ko.field_d.toUpperCase();
                vw.field_a.field_y = true;
              }
              vw.field_a.field_gb = qcb.field_p.field_gb;
              if (0 < qea.field_p) {
                if (qea.field_p != 1) {
                  var10_ref_String = isa.a(nha.field_p, new String[]{Integer.toString(qea.field_p)}, 99);
                } else {
                  var10_ref_String = rja.field_o;
                }
                if ((16 & ls.field_o) == 0 &&
                  !wo.field_o) {
                  vw.field_a.field_gb = qcb.field_p.field_mb;
                }
                vw.field_a.field_R = vw.field_a.field_R + "<br>" + var10_ref_String;
              }
              qsa.field_b.a(var9, 119, vva.field_r.field_hb - var9, vva.field_r.field_G - 40, 40);
              qsa.field_b.field_R = pga.field_o.toUpperCase();
              stackIn_20_0 = qsa.field_b;
              stackIn_21_1 = (param2) && (qga.field_a == 0L);
              stackIn_20_0.field_y = stackIn_21_1;
              var8 = qsa.field_b;
              var10 = 2;
              if (ncb.field_a != null) {
                if (null == tib.field_i) {
                  tib.field_i = new byte[ocb.field_l];
                  mia.field_a = new boolean[ocb.field_l];
                }
                for (var11 = 0; var11 < ocb.field_l; var11++) {
                  mia.field_a[var11] = false;
                }
                var10 = 0;
                L11: while (true) {
                  if (var10 < 2) {
                    var11Lifetime2 = 0;
                    var12 = 0;
                    while (true) {
                      if (var12 >= ncb.field_a.length) {
                        if (var11Lifetime2 != 0) {
                          break L11;
                        }
                        var10++;
                        continue L11;
                      }
                      var24 = ncb.field_a[var12];
                      var22 = var24;
                      var13_ref_int__ = var22;
                      var14 = 0;
                      L15: while (true) {
                        if (var24.length <= var14) {
                          var11Lifetime2 = 1;
                          var14 = -1;
                          for (var15 = 0; var15 < var24.length; var15 += 2) {
                            var16 = var24[var15];
                            if (var16 > var14) {
                              var14 = var16;
                            }
                          }
                          mia.field_a[var14] = true;
                        } else {
                          var15 = var24[var14];
                          var16 = var13_ref_int__[var14 + 1];
                          if (-1 != var15) {
                            if ((255 & lqa.field_o.field_Pb[var15]) != var16) {
                              break L15;
                            }
                          } else {
                            if (var10 == 0) {
                              stackIn_38_0 = lqa.field_o.field_Fb;
                            } else {
                              stackIn_38_0 = lqa.field_o.field_zb;
                            }
                            var17_int = stackIn_38_0;
                            if (var17_int != var16) {
                              break L15;
                            }
                          }
                          var14 += 2;
                          continue;
                        }
                        break;
                      }
                      var12++;
                    }
                  }
                  break;
                }
                if (!(go.field_p < 2) &&
                  si.field_o[12]) {
                  var10 = 2;
                }
              }
              if (var10 >= 2) {
                if ((null != qcb.field_o ||
                  null != crb.field_w ||
                  null != tab.field_p ||
                  null != hia.field_o)) {
                  var11Lifetime1 = 0;
                  var12Lifetime1 = 0;
                  var13 = 0;
                  var14Lifetime1 = 0;
                  var15Lifetime1 = 0;
                  for (var16Lifetime1 = 0; ocb.field_l > var16Lifetime1; var16Lifetime1++) {
                    var17_intLifetime1 = 255 & lqa.field_o.field_Pb[var16Lifetime1];
                    if (null != qcb.field_o &&
                      null != qcb.field_o[var16Lifetime1] &&
                      qcb.field_o[var16Lifetime1][var17_intLifetime1]) {
                      var11Lifetime1 = 1;
                    }
                    if (crb.field_w != null &&
                      crb.field_w[var16Lifetime1] != null) {
                      var18_int = crb.field_w[var16Lifetime1][var17_intLifetime1];
                      if (var18_int > var13) {
                        var13 = var18_int;
                      }
                      if (var18_int != 0 &&
                        !ufa.field_o) {
                        var11Lifetime1 = 1;
                      }
                    }
                    L30: {
                      if (tab.field_p != null) {
                        if (tab.field_p[var16Lifetime1] == null) {
                          if (((null != hia.field_o)) &&
                            ((hia.field_o[var16Lifetime1] != null))) {
                            var15Lifetime1 = var15Lifetime1 | hia.field_o[var16Lifetime1][var17_intLifetime1];
                          }
                          break L30;
                        }
                        var18_intLifetime1 = tab.field_p[var16Lifetime1][var17_intLifetime1];
                        if (var14Lifetime1 < var18_intLifetime1) {
                          var14Lifetime1 = var18_intLifetime1;
                        }
                        if (var18_intLifetime1 != 0 &&
                          !ufa.field_o) {
                          var11Lifetime1 = 1;
                        }
                      }
                      if (null != hia.field_o &&
                        hia.field_o[var16Lifetime1] != null) {
                        var15Lifetime1 = var15Lifetime1 | hia.field_o[var16Lifetime1][var17_intLifetime1];
                      }
                    }
                  }
                  var16Lifetime1Lifetime1 = 0;
                  var17 = rga.field_f.field_wb.field_lb;
                  var18_ref = (jk) (var17.d(0));
                  L23: while (true) {
                    if (var18_ref != null) {
                      if (!var18_ref.i(56)) {
                        if (var11Lifetime1 != 0 &&
                          !var18_ref.field_Lb) {
                          var16Lifetime1Lifetime1 = 1;
                          break L23;
                        }
                        if (var18_ref.field_Gb < var13) {
                          var16Lifetime1Lifetime1 = 1;
                          break L23;
                        }
                        if (var18_ref.field_Bb < var14Lifetime1) {
                          var16Lifetime1Lifetime1 = 1;
                          break L23;
                        }
                        if ((var15Lifetime1 & ~var18_ref.field_Ab) > 0) {
                          var16Lifetime1Lifetime1 = 1;
                          break L23;
                        }
                        if (var12Lifetime1 != 0) {
                          var16Lifetime1Lifetime1 = 1;
                          break L23;
                        }
                      }
                      var18_ref = (jk) (var17.a((byte) 98));
                      continue;
                    }
                    break;
                  }
                  if (go.field_p >= 2 &&
                    si.field_o[12]) {
                    var16Lifetime1Lifetime1 = 0;
                  }
                  if ((var16Lifetime1Lifetime1 != 0)) {
                    qsa.field_b.field_y = false;
                    if (!(!qsa.field_b.field_Q)) {
                      if (0 == hra.field_o.field_a.field_Ab) {
                        lob.field_a = kob.field_e;
                      } else {
                        lob.field_a = isa.a(hja.field_p, new String[]{bd.field_a}, 121);
                      }
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                qsa.field_b.field_y = false;
                if (qsa.field_b.field_Q) {
                  var11_ref = null;
                  var12Lifetime2 = 0;
                  for (var13Lifetime1 = 0; ocb.field_l > var13Lifetime1; var13Lifetime1++) {
                    if (mia.field_a[var13Lifetime1]) {
                      var23 = "<col=A00000>" + hva.field_c[var13Lifetime1] + "</col>";
                      if (var11_ref == null) {
                        var11_ref = var23;
                      } else {
                        var11_ref = (String) (var11_ref) + ", " + var23;
                        var12Lifetime2 = 1;
                      }
                    }
                  }
                  if (var10 != 0) {
                    var13_ref_String = ef.field_A;
                    if (var12Lifetime2 == 0) {
                      var14_ref_String = isa.a(jra.field_b, new String[]{(String) (var11_ref)}, 92);
                    } else {
                      var14_ref_String = alb.field_a + (String) (var11_ref);
                    }
                  } else {
                    var13_ref_String = dhb.field_o;
                    if (var12Lifetime2 != 0) {
                      var14_ref_String = nd.field_o + (String) (var11_ref);
                    } else {
                      var14_ref_String = isa.a(cp.field_g, new String[]{(String) (var11_ref)}, 126);
                    }
                  }
                  lob.field_a = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                }
              }
            } else {
              var9_ref_String = lqa.field_o.field_Vb;
              rob.field_q.field_R = isa.a(wt.field_b, new String[]{var9_ref_String}, 118).toUpperCase();
              qi.field_p.a(0, -127, vva.field_r.field_hb, -40 + vva.field_r.field_G, 40);
              qi.field_p.field_R = isa.a(ub.field_h, new String[]{var9_ref_String}, 79);
              var8 = qi.field_p;
            }
            if (qga.field_a != 0L) {
              var9 = (int)(-wt.a(false) + qga.field_a);
              var9 = (999 + var9) / 1000;
              if (1 > var9) {
                var9 = 1;
              }
              var8.field_R = isa.a(cu.field_o, new String[]{Integer.toString(var9)}, 79);
            }
            ukb.field_o.field_R = isa.a(tma.field_o, new String[]{Integer.toString(lqa.field_o.field_zb), Integer.toString(lqa.field_o.field_Fb)}, 124);
          }
          if (param1 < 8) {
            fka.a(-44, (byte) 40, true, false, true);
          }
          stackIn_165_0 = rga.field_g;
          stackIn_166_1 = (param3) && (!param4) && (!wo.field_o);
          ((llb) (Object) stackIn_165_0).a(stackIn_166_1, 1332);
          stackIn_170_0 = vva.field_r;
          stackIn_171_1 = (param3) && (!param4) && (!wo.field_o);
          ((llb) (Object) stackIn_170_0).a(stackIn_171_1, 1332);
          stackIn_175_0 = jfb.field_o;
          stackIn_176_1 = (param3) && (!param4) && (wo.field_o);
          ((llb) (Object) stackIn_175_0).a(stackIn_176_1, 1332);
          hra.field_o.field_a.i(10000);
          if (null != lqa.field_o) {
            if (nt.field_q.field_o != 0) {
              sh.a(lqa.field_o.f((byte) -13), -1, param0);
            }
            if (vw.field_a.field_o != 0) {
              wo.field_o = true;
            }
            if (qsa.field_b.field_o != 0) {
              qu.field_o = true;
            }
            if (rlb.field_a.field_o != 0) {
              wo.field_o = false;
            }
            asb.a(param0, lqa.field_o, false, (byte) -67);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var5), "fka.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    fka(ml param0, int param1, ml param2, int param3, int param4) {
        try {
          this.field_d = param0;
          this.field_f = param2;
          this.field_e = param4;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "fka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
