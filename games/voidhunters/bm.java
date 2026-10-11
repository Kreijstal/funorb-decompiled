/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends rqa {
    static eab field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        soa var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(85, 62, param0[0].a(90));
          if (param1 >= -119) {
            var4 = (soa) null;
            bm.a(13, (byte) -15, (soa) null, true, 117);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bm.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    bm(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, byte param1, soa param2, boolean param3, int param4) {
        int var27_int = 0;
        soa stackIn_43_0;
        int stackIn_43_1;
        int stackIn_43_2;
        int stackIn_43_3;
        boolean stackIn_44_4 = false;
        int stackIn_47_0 = 0;
        int stackIn_59_0 = 0;
        llb stackIn_95_0;
        int stackIn_95_1;
        int stackIn_95_2;
        int stackIn_95_3;
        int stackIn_96_4 = 0;
        RuntimeException stackIn_216_0 = null;
        StringBuilder stackIn_216_1 = null;
        String stackIn_217_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        ij var10 = null;
        int var11_int = 0;
        Object var11 = null;
        jk var12 = null;
        int var13 = 0;
        llb var14 = null;
        llb var15 = null;
        llb var16 = null;
        llb var17 = null;
        llb var18 = null;
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
        Object var24Lifetime1;
        Object var24Lifetime2;
        Object var30Lifetime1;
        String var30_refLifetime1;
        String var30_refLifetime2;
        Object var30Lifetime1Lifetime1;
        int var9Lifetime1;
        int var11_intLifetime1;
        int var24_intLifetime1;
        int var26Lifetime1;
        int var30_intLifetime1;
        int var26Lifetime2;
        var31 = VoidHunters.field_G;
        try {
          var5_int = 0;
          var6 = 0;
          if (param1 != 1) {
            field_o = (eab) null;
          }
          var7 = 0;
          var8 = 0;
          if (null != lqa.field_o && (qcb.field_o != null ||
            null != crb.field_w ||
            null != tab.field_p ||
            hia.field_o != null)) {
            for (var9 = 0; var9 < ocb.field_l; var9++) {
              var10_int = lqa.field_o.field_Pb[var9] & 255;
              if (qcb.field_o != null &&
                qcb.field_o[var9] != null &&
                qcb.field_o[var9][var10_int]) {
                var5_int = 1;
              }
              if (crb.field_w != null &&
                null != crb.field_w[var9]) {
                var11_int = crb.field_w[var9][var10_int];
                if (var11_int != 0 &&
                  !ufa.field_o) {
                  var5_int = 1;
                }
                if (var11_int > var6) {
                  var6 = var11_int;
                }
              }
              if (tab.field_p != null &&
                null != tab.field_p[var9]) {
                var11_intLifetime1 = tab.field_p[var9][var10_int];
                if (var11_intLifetime1 != 0 &&
                  !ufa.field_o) {
                  var5_int = 1;
                }
                if (var7 < var11_intLifetime1) {
                  var7 = var11_intLifetime1;
                }
              }
              if (hia.field_o != null &&
                hia.field_o[var9] != null) {
                var8 = var8 | hia.field_o[var9][var10_int];
              }
            }
          }
          stackIn_43_0 = (soa) (param2);
          stackIn_43_1 = 38;
          stackIn_43_2 = 2;
          stackIn_43_3 = (8 + nna.field_w * 4) * param0;
          stackIn_44_4 = (param2 == qg.field_a);
          stackIn_47_0 = (!((soa) (Object) stackIn_43_0).a((byte) stackIn_43_1, stackIn_43_2, stackIn_43_3, stackIn_44_4, param3, 2 * (2 + nna.field_w))) ? 0 : 1;
          var9Lifetime1 = stackIn_47_0;
          var10 = param2.field_wb.field_lb;
          var11 = null;
          var12 = (jk) (var10.d(0));
          while (var12 != null) {
            var13 = 0;
            if (null == var12.field_lb) {
              var12.field_Ib = new llb(0L, bsa.field_q);
              var12.b(param1 ^ -562, var12.field_Ib);
              var12.field_Jb = new llb(0L, geb.field_o);
              if (ll.field_o) {
                var12.b(-561, var12.field_Jb);
              }
              var12.field_Jb.field_F = 2;
              var12.field_Mb = new llb(0L, qc.field_q);
              var12.b(-561, var12.field_Mb);
              var12.g(121);
              var12.field_wb = new llb(0L, jba.field_h);
              var12.b(-561, var12.field_wb);
              var12.field_Nb = new llb(0L, nfb.field_a);
              var13 = 1;
              var12.b(-561, var12.field_Nb);
            }
            var12.field_Ib.field_R = null;
            var14 = var12.field_Ib;
            var12.field_Ib.field_G = 0;
            var14.field_hb = 0;
            var12.field_Jb.field_R = null;
            var12.field_Jb.field_G = 0;
            var15 = var12.field_Jb;
            var12.field_wb.field_R = null;
            var15.field_hb = 0;
            var16 = var12.field_wb;
            var12.field_wb.field_G = 0;
            var12.field_Nb.field_R = null;
            var16.field_hb = 0;
            var12.field_Nb.field_G = 0;
            var17 = var12.field_Nb;
            var12.field_Mb.field_R = null;
            var17.field_hb = 0;
            var12.field_Mb.field_G = 0;
            var18 = var12.field_Mb;
            var18.field_hb = 0;
            var12.field_hb = param2.field_wb.field_hb;
            var19 = 0;
            var32 = var12.field_xb;
            var21 = 72;
            if (tja.field_a == param2) {
              var21 += 42;
            }
            var33 = no.a(var12.field_Ib.field_eb, var32, var21);
            var20 = var33;
            stackIn_59_0 = (var33.equals(var12.field_xb)) ? 0 : 1;
            var22 = stackIn_59_0;
            if (var12.field_vb >= 4) {
              var20 = "<img=" + (mha.field_a + var12.field_vb - 4) + ">" + var33;
            } else {
              if (var12.field_vb > 0) {
                var20 = "<img=" + (-1 + var12.field_vb) + ">" + var33;
              }
            }
            var12.field_Ib.field_R = var20;
            if (!var12.i(-120)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_Lb ||
                (!(var12.field_Gb >= var6) ||
                !(var12.field_Bb >= var7) ||
                !((var8 & ~var12.field_Ab) <= 0))) {
                var24_int = 8421504;
                var23_int = 8414771;
              }
              var12.field_wb.field_Y = var23_int;
              var12.field_Jb.field_Y = var23_int;
              var12.field_Ib.field_Y = var23_int;
              var12.field_Ib.field_U = var24_int;
              var12.field_Ib.field_ib = var24_int;
              var12.field_Ib.field_qb = var24_int;
              var12.field_Jb.field_U = var24_int;
              var12.field_Jb.field_ib = var24_int;
              var12.field_Jb.field_qb = var24_int;
              var12.field_wb.field_U = var24_int;
              var12.field_wb.field_ib = var24_int;
              var12.field_wb.field_qb = var24_int;
              if (rga.field_f == param2) {
                if (!lqa.field_o.field_fc) {
                  var12.field_Nb.field_R = ee.field_r;
                }
              } else {
                if (var12.field_Eb) {
                  var12.field_Ib.field_R = isa.a(gob.field_b, new String[]{var20}, 74);
                  var12.field_Nb.field_R = fqb.field_p;
                } else {
                  if (var12.field_Fb) {
                    var12.field_Ib.field_R = isa.a(uk.field_a, new String[]{var20}, 100);
                    var12.field_wb.field_R = knb.field_q;
                    var12.field_Nb.field_R = na.field_o;
                  } else {
                    var12.field_wb.field_R = vnb.field_o;
                  }
                }
              }
              var25_int = 0;
              if (null != lqa.field_o &&
                nmb.b(-91) &&
                wqa.field_a != var12.field_zb) {
                if (null != var12.field_wb.field_R) {
                  var26 = var12.field_wb.e(param1 + 93) + 2 * qs.field_c;
                  var12.field_wb.a(var25_int, 124, var26, var19, nna.field_w);
                  var25_int = var25_int + var26;
                }
                if (var12.field_Nb.field_R != null) {
                  if (rga.field_f != param2) {
                    var26Lifetime2 = var12.field_Nb.e(101) + qs.field_c * 2;
                  } else {
                    var26Lifetime2 = 40;
                  }
                  var12.field_Nb.a(var25_int, 127, var26Lifetime2, var19, nna.field_w);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_95_0 = var12.field_Ib;
              stackIn_95_1 = var25_int;
              stackIn_95_2 = 116;
              stackIn_95_3 = -var25_int;
              if (!ll.field_o) {
                stackIn_96_4 = 0;
              } else {
                stackIn_96_4 = 42;
              }
              ((llb) (Object) stackIn_95_0).a(stackIn_95_1, stackIn_95_2, stackIn_95_3 + (-stackIn_96_4 + var12.field_hb), var19, nna.field_w);
              var12.field_Jb.field_R = Integer.toString(var12.field_Gb);
              var12.field_Jb.a(-40 + var12.field_hb, param1 + 123, 40, var19, nna.field_w);
              if (var12.field_Ib.field_O &&
                var22 != 0) {
                lob.field_a = var12.field_xb;
                if (gp.field_q != null &&
                  gp.field_q[var12.field_vb] != null) {
                  lob.field_a = lob.field_a + " - " + gp.field_q[var12.field_vb];
                }
              } else {
                if (var12.field_Ib.field_O &&
                  null != gp.field_q &&
                  null != gp.field_q[var12.field_vb]) {
                  lob.field_a = gp.field_q[var12.field_vb];
                }
              }
              var19 = var19 + nna.field_w;
            }
            var23 = heb.a(var12.field_Db, var20, param1 ^ -3224);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_Mb.field_eb.c(var23, -qs.field_c + var12.field_hb - qs.field_c);
              var12.field_Mb.field_I = 256 * var12.field_yb / ktb.field_p;
              var12.field_Mb.field_R = var23;
              var12.field_Mb.a(qs.field_c, -102, var12.field_hb - qs.field_c * 2, var19, nna.field_w * var24_intLifetime1);
              var19 = var19 + nna.field_w * var24_intLifetime1;
            }
            if (var9Lifetime1 == 0) {
              var12.field_E = var19 - var12.field_G;
            }
            if (var13 != 0) {
              param2.field_wb.a((llb) (var11), 2, var12, 101);
            }
            if (var12.field_o != 0 &&
              !var12.i(61)) {
              if (var12.field_wb.field_o == 0) {
                if (0 != var12.field_Nb.field_o) {
                  pe.a(param4, var12.field_zb, -125);
                } else {
                  sn.a(qs.field_a, 0, var12, (byte) 71, oq.field_H, param2, 0);
                }
              } else {
                ut.a(6, var12.field_zb, param4);
              }
            }
            if (var12.field_Q &&
              !var12.i(121)) {
              var24Lifetime2 = null;
              if (~var12.field_zb != ~wqa.field_a) {
                if (var5_int != 0 &&
                  !var12.field_Lb) {
                  var24Lifetime2 = isa.a(jla.field_B, new String[]{var20}, 120);
                  var30Lifetime1 = var24Lifetime2;
                  var25 = var30Lifetime1;
                  var24Lifetime2 = var25;
                  var30Lifetime1Lifetime1 = var24Lifetime2;
                  var25 = var30Lifetime1Lifetime1;
                } else {
                  if (var7 > var12.field_Bb) {
                    var25_int = -var12.field_Bb + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = isa.a(dfb.field_p, new String[]{var20}, 124);
                    }
                    var24Lifetime2 = isa.a(iwa.field_c, new String[]{var20, Integer.toString(var25_int)}, 124);
                  } else {
                    if (var6 <= var12.field_Gb) {
                      if ((var8 & ~var12.field_Ab) != 0) {
                        var25_int = wsb.a(var8 & ~var12.field_Ab, 1302374146);
                        var24Lifetime2 = isa.a(pha.field_q, new String[]{var20}, param1 ^ 124);
                        if (var25_int > 0 &&
                          null != mta.field_a &&
                          mta.field_a.length >= var25_int &&
                          null != mta.field_a[-1 + var25_int]) {
                          var24Lifetime2 = isa.a(mta.field_a[var25_int - 1][2], new String[]{var20}, 82);
                        }
                      }
                    } else {
                      var24Lifetime2 = isa.a(cp.field_j, new String[]{var20, Integer.toString(var6)}, param1 + 92);
                    }
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_Lb) {
                  var24Lifetime2 = aw.field_Db;
                } else {
                  if (var12.field_Bb >= var7) {
                    if (var6 > var12.field_Gb) {
                      var24Lifetime2 = isa.a(vl.field_q, new String[]{null, Integer.toString(var6)}, 92);
                    } else {
                      if ((var8 & ~var12.field_Ab) != 0) {
                        var25_int = wsb.a(~var12.field_Ab & var8, 1302374146);
                        var24Lifetime2 = ooa.field_zb;
                        if (0 < var25_int &&
                          mta.field_a != null &&
                          var25_int <= mta.field_a.length &&
                          mta.field_a[-1 + var25_int] != null) {
                          var24Lifetime2 = mta.field_a[var25_int - 1][1];
                        }
                      }
                    }
                  } else {
                    var25_int = var7 - var12.field_Bb;
                    if (var25_int == 1) {
                      var24Lifetime2 = cqb.field_f;
                    }
                    var24Lifetime2 = isa.a(otb.field_o, new String[]{null, Integer.toString(var25_int)}, 124);
                  }
                }
              }
              if (var24Lifetime2 != null) {
                var34 = "<col=A00000>" + (String) (var24Lifetime2);
                var30_ref = var34;
                var25 = var30_ref;
                var24Lifetime2 = var25;
                var30_refLifetime1 = var34;
                var25 = var30_refLifetime1;
                var25 = null;
                var26Lifetime1 = 0;
                for (var27_int = 0; var27_int < ocb.field_l; var27_int++) {
                  var28 = lqa.field_o.field_Pb[var27_int] & 255;
                  var29 = 0;
                  if (qcb.field_o != null &&
                    qcb.field_o[var27_int] != null &&
                    qcb.field_o[var27_int][var28] &&
                    !var12.field_Lb) {
                    var29 = 1;
                  }
                  if (crb.field_w != null &&
                    null != crb.field_w[var27_int]) {
                    var30_int = crb.field_w[var27_int][var28];
                    if (var30_int != 0 &&
                      !ufa.field_o &&
                      !var12.field_Lb) {
                      var29 = 1;
                    }
                    if (var30_int > var12.field_Gb) {
                      var29 = 1;
                    }
                  }
                  if (tab.field_p != null &&
                    null != tab.field_p[var27_int]) {
                    var30_intLifetime1 = tab.field_p[var27_int][var28];
                    if (0 != var30_intLifetime1 &&
                      !ufa.field_o &&
                      !var12.field_Lb) {
                      var29 = 1;
                    }
                    if (var12.field_Bb < var30_intLifetime1) {
                      var29 = 1;
                    }
                  }
                  if (null != hia.field_o &&
                    hia.field_o[var27_int] != null &&
                    (~var12.field_Ab & hia.field_o[var27_int][var28]) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + hva.field_c[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 != null) {
                      var26Lifetime1 = 1;
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                    } else {
                      var25 = var30_refLifetime2;
                    }
                  }
                }
                if (rga.field_f == param2 &&
                  nmb.b(param1 - 106)) {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var34 + "<br>" + acb.field_r + (String) (var25);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + isa.a(web.field_p, new String[]{(String) (var25)}, 89);
                  }
                } else {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var34 + "<br>" + eka.field_a + (String) (var25);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + isa.a(pua.field_o, new String[]{(String) (var25)}, 122);
                  }
                }
                if (param2 == rga.field_f &&
                  !nmb.b(90)) {
                  var27 = lqa.field_o.field_Vb;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + isa.a(rnb.field_o, new String[]{var27}, 125);
                }
                lob.field_a = (String) (var24Lifetime2);
              }
            }
            var11 = var12;
            var12 = (jk) (var10.a((byte) 23));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_216_0 = var5;
          stackIn_216_1 = new StringBuilder().append("bm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_217_2 = "null";
          } else {
            stackIn_217_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_216_0), ((StringBuilder) (Object) stackIn_216_1).append(stackIn_217_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -28228) {
          return;
        }
        field_o = null;
    }

    static {
    }
}
