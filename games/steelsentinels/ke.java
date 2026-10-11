/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static String[] field_b;
    private int field_f;
    static cm field_k;
    private int field_j;
    private int field_c;
    private int field_d;
    static String field_i;
    RgbSprite[] field_h;
    private int field_g;
    RgbSprite field_a;
    private boolean field_e;

    public static void b(byte param0) {
        if (param0 != 12) {
          String var2 = (String) null;
          ke.a(-105, (String) null);
        }
        field_i = null;
        field_k = null;
        field_b = null;
    }

    final static void a(boolean param0, int param1, kg param2, int param3, int param4) {
        int var27_int = 0;
        kg stackIn_41_0;
        int stackIn_41_1;
        int stackIn_41_2;
        int stackIn_41_3;
        boolean stackIn_42_4 = false;
        int stackIn_45_0 = 0;
        int stackIn_58_0 = 0;
        SceneWidget stackIn_93_0;
        int stackIn_93_1;
        int stackIn_93_2;
        int stackIn_93_3;
        int stackIn_93_4;
        int stackIn_93_5;
        int stackIn_94_6 = 0;
        RuntimeException stackIn_217_0 = null;
        StringBuilder stackIn_217_1 = null;
        String stackIn_218_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        NodeDeque var10 = null;
        int var11_int = 0;
        Object var11 = null;
        cc var12 = null;
        int var13 = 0;
        SceneWidget var14 = null;
        SceneWidget var15 = null;
        SceneWidget var16 = null;
        SceneWidget var17 = null;
        SceneWidget var18 = null;
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
        var31 = SteelSentinels.obfuscationControl;
        try {
          var5_int = 0;
          var6 = param4;
          var7 = 0;
          var8 = 0;
          if (null != nf.field_b && (null != ad.field_d ||
            null != ja.field_b ||
            ol.field_cc != null ||
            fc.field_b != null)) {
            for (var9 = 0; be.field_a > var9; var9++) {
              var10_int = 255 & nf.field_b.field_Sb[var9];
              if (ad.field_d != null &&
                null != ad.field_d[var9] &&
                ad.field_d[var9][var10_int]) {
                var5_int = 1;
              }
              if (ja.field_b != null &&
                ja.field_b[var9] != null) {
                var11_int = ja.field_b[var9][var10_int];
                if (var6 < var11_int) {
                  var6 = var11_int;
                }
                if (0 != var11_int &&
                  !vg.field_a) {
                  var5_int = 1;
                }
              }
              if (null != ol.field_cc &&
                ol.field_cc[var9] != null) {
                var11_intLifetime1 = ol.field_cc[var9][var10_int];
                if (var11_intLifetime1 > var7) {
                  var7 = var11_intLifetime1;
                }
                if (var11_intLifetime1 != 0 &&
                  !vg.field_a) {
                  var5_int = 1;
                }
              }
              if (null != fc.field_b &&
                fc.field_b[var9] != null) {
                var8 = var8 | fc.field_b[var9][var10_int];
              }
            }
          }
          stackIn_41_0 = (kg) (param2);
          stackIn_41_1 = 2;
          stackIn_41_2 = 2 * (2 + db.field_b);
          stackIn_41_3 = (8 + 4 * db.field_b) * param3;
          stackIn_42_4 = (la.field_c == param2);
          stackIn_45_0 = (!((kg) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_42_4, param0, (byte) -41)) ? 0 : 1;
          var9Lifetime1 = stackIn_45_0;
          var10 = param2.field_Ub.field_M;
          var11 = null;
          var12 = (cc) (var10.first(13058));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_M == null) {
              var12.field_Sb = new SceneWidget(0L, bb.field_W);
              var12.a(var12.field_Sb, param4 ^ 118);
              var12.field_oc = new SceneWidget(0L, SteelSentinels.field_J);
              if (rm.field_p) {
                var12.a(var12.field_oc, 126);
              }
              var12.field_oc.field_Kb = 2;
              var12.field_cc = new SceneWidget(0L, bd.field_f);
              var12.a(var12.field_cc, param4 + 121);
              var12.h(-123);
              var12.field_hc = new SceneWidget(0L, fa.field_f);
              var12.a(var12.field_hc, 127);
              var12.field_Yb = new SceneWidget(0L, co.field_c);
              var13 = 1;
              var12.a(var12.field_Yb, 118);
            }
            var12.field_Sb.field_S = null;
            var12.field_Sb.field_Lb = 0;
            var14 = var12.field_Sb;
            var14.field_zb = 0;
            var12.field_oc.field_S = null;
            var15 = var12.field_oc;
            var12.field_oc.field_Lb = 0;
            var15.field_zb = 0;
            var12.field_hc.field_S = null;
            var16 = var12.field_hc;
            var12.field_hc.field_Lb = 0;
            var12.field_Yb.field_S = null;
            var16.field_zb = 0;
            var17 = var12.field_Yb;
            var12.field_Yb.field_Lb = 0;
            var17.field_zb = 0;
            var12.field_cc.field_S = null;
            var12.field_cc.field_Lb = 0;
            var18 = var12.field_cc;
            var18.field_zb = 0;
            var12.field_zb = param2.field_Ub.field_zb;
            var19 = 0;
            var32 = var12.field_Vb;
            var20 = var32;
            var20 = var32;
            var21 = 72;
            if (mj.field_Sb == param2) {
              var21 += 42;
            }
            var33 = BitmapFont.a(var12.field_Sb.field_L, var32, var21);
            var20 = var33;
            var20 = var33;
            var20 = var33;
            stackIn_58_0 = (var33.equals(var12.field_Vb)) ? 0 : 1;
            var22 = stackIn_58_0;
            if (var12.field_jc < 4) {
              if (var12.field_jc > 0) {
                var20 = "<img=" + (-1 + var12.field_jc) + ">" + var33;
              }
            } else {
              var20 = "<img=" + (-4 + var12.field_jc + uc.field_l) + ">" + var33;
            }
            var12.field_Sb.field_S = var20;
            if (!var12.d((byte) -36)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_nc ||
                (!(var6 <= var12.field_ac) ||
                !(var12.field_dc >= var7) ||
                !(0 >= (~var12.field_qc & var8)))) {
                var23_int = 8414771;
                var24_int = 8421504;
              }
              var12.field_hc.field_nb = var23_int;
              var12.field_oc.field_nb = var23_int;
              var12.field_Sb.field_nb = var23_int;
              var12.field_Sb.field_Mb = var24_int;
              var12.field_Sb.field_xb = var24_int;
              var12.field_Sb.field_rb = var24_int;
              var12.field_oc.field_Mb = var24_int;
              var12.field_oc.field_xb = var24_int;
              var12.field_oc.field_rb = var24_int;
              var12.field_hc.field_Mb = var24_int;
              var12.field_hc.field_xb = var24_int;
              var12.field_hc.field_rb = var24_int;
              if (gl.field_t == param2) {
                if (!nf.field_b.field_rc) {
                  var12.field_Yb.field_S = ej.field_w;
                }
              } else {
                if (var12.field_Zb) {
                  var12.field_Sb.field_S = db.a(tk.field_q, -51, new String[]{var20});
                  var12.field_Yb.field_S = tj.field_b;
                } else {
                  if (var12.field_kc) {
                    var12.field_Sb.field_S = db.a(bi.field_g, -121, new String[]{var20});
                    var12.field_hc.field_S = cb.field_g;
                    var12.field_Yb.field_S = ai.field_p;
                  } else {
                    var12.field_hc.field_S = ok.field_h;
                  }
                }
              }
              var25_int = 0;
              if (nf.field_b != null &&
                kk.a(-28548) &&
                ~var12.field_ec != ~GameplayController.field_G) {
                if (null != var12.field_hc.field_S) {
                  var26 = var12.field_hc.g(-2147483648) + da.field_g * 2;
                  var12.field_hc.a(0, var19, db.field_b, var25_int, var26);
                  var25_int = var25_int + var26;
                }
                if (null != var12.field_Yb.field_S) {
                  if (gl.field_t == param2) {
                    var26Lifetime2 = 40;
                  } else {
                    var26Lifetime2 = var12.field_Yb.g(-2147483648) + 2 * da.field_g;
                  }
                  var12.field_Yb.a(0, var19, db.field_b, var25_int, var26Lifetime2);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_93_0 = var12.field_Sb;
              stackIn_93_1 = 0;
              stackIn_93_2 = var19;
              stackIn_93_3 = db.field_b;
              stackIn_93_4 = var25_int;
              stackIn_93_5 = var12.field_zb;
              if (rm.field_p) {
                stackIn_94_6 = 42;
              } else {
                stackIn_94_6 = 0;
              }
              ((SceneWidget) (Object) stackIn_93_0).a(stackIn_93_1, stackIn_93_2, stackIn_93_3, stackIn_93_4, stackIn_93_5 - (stackIn_94_6 + var25_int));
              var12.field_oc.field_S = Integer.toString(var12.field_ac);
              var12.field_oc.a(param4 ^ 0, var19, db.field_b, var12.field_zb - 40, 40);
              if (var12.field_Sb.field_kb &&
                var22 != 0) {
                ll.field_i = var12.field_Vb;
                if (kf.field_A != null &&
                  null != kf.field_A[var12.field_jc]) {
                  ll.field_i = ll.field_i + " - " + kf.field_A[var12.field_jc];
                }
              } else {
                if (var12.field_Sb.field_kb &&
                  null != kf.field_A &&
                  kf.field_A[var12.field_jc] != null) {
                  ll.field_i = kf.field_A[var12.field_jc];
                }
              }
              var19 = var19 + db.field_b;
            }
            var23 = sa.a(var12.field_Wb, var20, (byte) -126);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_cc.field_L.b(var23, -da.field_g + (-da.field_g + var12.field_zb));
              var12.field_cc.field_S = var23;
              var12.field_cc.field_V = var12.field_Ub * 256 / ta.field_l;
              var12.field_cc.a(0, var19, var24_intLifetime1 * db.field_b, da.field_g, -(da.field_g * 2) + var12.field_zb);
              var19 = var19 + db.field_b * var24_intLifetime1;
            }
            if (var9Lifetime1 == 0) {
              var12.field_lb = -var12.field_Lb + var19;
            }
            if (var13 != 0) {
              param2.field_Ub.a(2, (byte) 104, (SceneWidget) (var11), var12);
            }
            if (var12.field_Eb != 0 &&
              !var12.d((byte) -36)) {
              if (0 != var12.field_hc.field_Eb) {
                ik.a(var12.field_ec, param1, false);
              } else {
                if (0 != var12.field_Yb.field_Eb) {
                  ec.a(param1, false, var12.field_ec);
                } else {
                  bf.a(0, oa.field_S, param4 + 4, var12, param2, 0, rj.field_j);
                }
              }
            }
            var11 = var12;
            if (var12.field_K &&
              !var12.d((byte) -36)) {
              var24Lifetime2 = null;
              if (~var12.field_ec != ~GameplayController.field_G) {
                if (var5_int != 0 &&
                  !var12.field_nc) {
                  var24Lifetime2 = db.a(ia.field_i, -76, new String[]{var20});
                  var30Lifetime1 = var24Lifetime2;
                  var25 = var30Lifetime1;
                  var24Lifetime2 = var25;
                  var30Lifetime1Lifetime1 = var24Lifetime2;
                  var25 = var30Lifetime1Lifetime1;
                } else {
                  if (var12.field_dc >= var7) {
                    if (var6 > var12.field_ac) {
                      var24Lifetime2 = db.a(ub.field_h, -55, new String[]{var20, Integer.toString(var6)});
                    } else {
                      if ((~var12.field_qc & var8) != 0) {
                        var25_int = ok.a(var8 & ~var12.field_qc, (byte) 67);
                        var24Lifetime2 = db.a(qm.field_a, -124, new String[]{var20});
                        if (0 < var25_int &&
                          in.field_b != null &&
                          in.field_b.length >= var25_int &&
                          null != in.field_b[var25_int - 1]) {
                          var24Lifetime2 = db.a(in.field_b[var25_int - 1][2], -58, new String[]{var20});
                        }
                      }
                    }
                  } else {
                    var25_int = -var12.field_dc + var7;
                    if (1 == var25_int) {
                      var24Lifetime2 = db.a(si.field_C, param4 - 126, new String[]{var20});
                    }
                    var24Lifetime2 = db.a(k.field_zb, -36, new String[]{var20, Integer.toString(var25_int)});
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_nc) {
                  var24Lifetime2 = ub.field_b;
                } else {
                  if (var7 > var12.field_dc) {
                    var25_int = var7 - var12.field_dc;
                    if (var25_int == 1) {
                      var24Lifetime2 = ih.field_u;
                    }
                    var24Lifetime2 = db.a(ch.field_K, param4 ^ -63, new String[]{null, Integer.toString(var25_int)});
                  } else {
                    if (var12.field_ac < var6) {
                      var24Lifetime2 = db.a(bl.field_j, -66, new String[]{null, Integer.toString(var6)});
                    } else {
                      if ((~var12.field_qc & var8) != 0) {
                        var25_int = ok.a(var8 & ~var12.field_qc, (byte) 94);
                        var24Lifetime2 = ca.field_w;
                        if (var25_int > 0 &&
                          in.field_b != null &&
                          in.field_b.length >= var25_int &&
                          null != in.field_b[-1 + var25_int]) {
                          var24Lifetime2 = in.field_b[var25_int - 1][1];
                        }
                      }
                    }
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
                for (var27_int = 0; be.field_a > var27_int; var27_int++) {
                  var28 = nf.field_b.field_Sb[var27_int] & 255;
                  var29 = 0;
                  if (null != ad.field_d &&
                    null != ad.field_d[var27_int] &&
                    ad.field_d[var27_int][var28] &&
                    !var12.field_nc) {
                    var29 = 1;
                  }
                  if (ja.field_b != null &&
                    ja.field_b[var27_int] != null) {
                    var30_int = ja.field_b[var27_int][var28];
                    if (var30_int != 0 &&
                      !vg.field_a &&
                      !var12.field_nc) {
                      var29 = 1;
                    }
                    if (var12.field_ac < var30_int) {
                      var29 = 1;
                    }
                  }
                  if (null != ol.field_cc &&
                    null != ol.field_cc[var27_int]) {
                    var30_intLifetime1 = ol.field_cc[var27_int][var28];
                    if (var30_intLifetime1 != 0 &&
                      !vg.field_a &&
                      !var12.field_nc) {
                      var29 = 1;
                    }
                    if (var12.field_dc < var30_intLifetime1) {
                      var29 = 1;
                    }
                  }
                  if (fc.field_b != null &&
                    null != fc.field_b[var27_int] &&
                    (~var12.field_qc & fc.field_b[var27_int][var28]) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + al.field_a[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 != null) {
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                      var26Lifetime1 = 1;
                    } else {
                      var25 = var30_refLifetime2;
                    }
                  }
                }
                if (gl.field_t == param2 &&
                  kk.a(param4 - 28548)) {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var34 + "<br>" + hc.field_S + (String) (var25);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + db.a(ph.field_f, -35, new String[]{(String) (var25)});
                  }
                } else {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var34 + "<br>" + db.a(o.field_e, -65, new String[]{(String) (var25)});
                  } else {
                    var24Lifetime2 = var34 + "<br>" + vg.field_b + (String) (var25);
                  }
                }
                if (param2 == gl.field_t &&
                  !kk.a(-28548)) {
                  var27 = nf.field_b.field_Xb;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + db.a(tk.field_r, -79, new String[]{var27});
                }
                ll.field_i = (String) (var24Lifetime2);
              }
            }
            var12 = (cc) (var10.next((byte) -64));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_217_0 = var5;
          stackIn_217_1 = new StringBuilder().append("ke.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_218_2 = "null";
          } else {
            stackIn_218_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_217_0), ((StringBuilder) (Object) stackIn_217_1).append(stackIn_218_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final ke a(boolean param0, byte param1) {
        this.field_e = param0 ? true : false;
        if (param1 <= 123) {
          ke.a(-101);
        }
        return this;
    }

    final void a(byte param0) {
        this.field_a = null;
        this.field_g = 0;
        if (param0 != -107) {
          ke.b((byte) -14);
        }
        this.field_h = null;
        this.field_f = 0;
        this.field_d = 0;
        this.field_c = 256;
        this.field_j = -1;
    }

    final void a(int param0, lh param1, int param2, wa param3, boolean param4) {
        BitmapFont stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_22_4;
        int stackIn_23_5 = 0;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_25_5;
        int stackIn_25_6;
        int stackIn_25_7;
        int stackIn_26_8;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        String var8 = null;
        try {
          hb.a((byte) -47, this.field_h, param1.field_x, param2 + param1.field_z, param0 + param1.field_o, param1.field_E);
          if (null != this.field_a) {
            var6_int = param0 + param1.field_o + this.field_g;
            if (param3.field_a == 1) {
              var6_int = var6_int + (-this.field_a.field_z + param1.field_x) / 2;
            }
            var7 = param2 - (-param1.field_z - this.field_f);
            if (param3.field_j == 1) {
              var7 = var7 + (param1.field_E - this.field_a.field_B) / 2;
            }
            if (param3.field_a == 2) {
              var6_int = var6_int + (param1.field_x - this.field_a.field_z);
            }
            if (2 == param3.field_j) {
              var7 = var7 + (param1.field_E - this.field_a.field_B);
            }
            this.field_a.a(var6_int, var7);
          }
          var6 = param3.c(-1, param1);
          if (var6 != null &&
            null != param3.field_f &&
            this.field_d >= 0) {
            stackIn_19_0 = param3.field_f;
            stackIn_19_1 = var6;
            if (this.field_g == -2147483648) {
              stackIn_20_2 = 0;
            } else {
              stackIn_20_2 = this.field_g;
            }
            stackIn_22_2 = stackIn_20_2 + (param3.field_b + param1.field_o) + param0;
            stackIn_22_3 = param3.field_h;
            stackIn_22_4 = param1.field_z + param2;
            if (-2147483648 == this.field_f) {
              stackIn_23_5 = 0;
            } else {
              stackIn_23_5 = this.field_f;
            }
            stackIn_25_3 = stackIn_22_3 + (stackIn_22_4 + stackIn_23_5);
            stackIn_25_4 = -param3.field_n + (param1.field_x - param3.field_b);
            stackIn_25_5 = param1.field_E - (param3.field_h + param3.field_d);
            stackIn_25_6 = this.field_d;
            stackIn_25_7 = this.field_j;
            if (this.field_c != -2147483648) {
              stackIn_26_8 = this.field_c;
            } else {
              stackIn_26_8 = 256;
            }
            ((BitmapFont) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_22_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_26_8, param3.field_a, param3.field_j, param3.field_m);
          }
          if (param4) {
            var8 = (String) null;
            ke.a(-126, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_32_0 = var6_ref;
          stackIn_32_1 = new StringBuilder().append("ke.B(").append(param0).append(',');
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
          throw ci.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param4).append(')').toString());
        }
    }

    final static long a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        long stackIn_3_0 = 0L;
        long stackIn_7_0 = 0L;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          var2_int = param0.length();
          var3 = 0L;
          var5 = 0;
          if (param1 != -48) {
            stackIn_3_0 = -86L;
            return stackIn_3_0;
          }
          while (var5 < var2_int) {
            var3 = (long)param0.charAt(var5) - var3 + (var3 << 5);
            var5++;
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ke.H(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final ke a(int param0, int param1) {
        this.field_f = param0;
        if (param1 <= 13) {
          this.b(52, -27);
        }
        return this;
    }

    final static String a(int param0, String param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        String stackIn_8_0 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          if (param0 != 42) {
            field_i = (String) null;
          }
          if (param1 == null) {
            stackIn_6_0 = 0;
          } else {
            stackIn_6_0 = param1.length();
          }
          var2_int = stackIn_6_0;
          if (var2_int == 0) {
            stackIn_8_0 = (String) (param1);
            return stackIn_8_0;
          }
          var3 = new char[var2_int];
          var4 = 0;
          for (var5 = 0; var2_int > var5; var5++) {
            var3[var5] = param1.charAt(var5);
            if (60 != var3[var5]) {
              if (var3[var5] == 62 &&
                0 < var4) {
                var4--;
              } else {
                if (var4 == 0) {
                  var3[var5] = Character.toUpperCase(var3[var5]);
                }
              }
            } else {
              var4++;
            }
          }
          stackIn_20_0 = new String(var3);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("ke.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final ke a(int param0, RgbSprite[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            this.a(true, -7);
          }
          this.field_h = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ke.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 2) {
          field_b = (String[]) null;
        }
        vb.field_e = false;
        if (null != jk.field_i) {
          jk.field_i.l(param0 ^ -125);
        }
        if (ib.field_b != 0) {
          pg.d(86);
        }
        ed.field_i = 0;
    }

    final ke a(byte param0, int param1) {
        this.field_d = param1;
        if (param0 > -24) {
          CharSequence var4 = (CharSequence) null;
          ke.a((CharSequence) null, (byte) -102);
        }
        return this;
    }

    final void a(ke param0, wa param1, byte param2, int param3, lh param4, int param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_e) {
            param0.a(param5, param4, param3, param1, false);
            param0.a((byte) -107);
          }
          if (-2147483648 != this.field_c) {
            param0.field_c = this.field_c;
          }
          if (this.field_f != -2147483648) {
            param0.field_f = this.field_f;
          }
          if (this.field_d >= -1) {
            param0.field_d = this.field_d;
          }
          if (this.field_g != -2147483648) {
            param0.field_g = this.field_g;
          }
          if (null != this.field_h) {
            param0.field_h = this.field_h;
          }
          if (param2 > -85) {
            return;
          }
          if (null != this.field_a) {
            param0.field_a = this.field_a;
          }
          if (-1 <= this.field_j) {
            param0.field_j = this.field_j;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("ke.C(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param5).append(')').toString());
        }
    }

    final ke b(int param0, int param1) {
        if (param0 != 1) {
          return (ke) null;
        }
        this.field_j = param1;
        return this;
    }

    final ke a(boolean param0, int param1) {
        this.field_g = param1;
        if (!param0) {
          return (ke) null;
        }
        return this;
    }

    final void a(byte param0, ke param1) {
        param1.field_e = this.field_e;
        param1.field_f = this.field_f;
        param1.field_c = this.field_c;
        param1.field_a = this.field_a;
        param1.field_g = this.field_g;
        if (param0 >= -113) {
          return;
        }
        try {
          param1.field_j = this.field_j;
          param1.field_d = this.field_d;
          param1.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ke.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ke() {
        this.field_d = -2;
        this.field_f = -2147483648;
        this.field_g = -2147483648;
        this.field_a = null;
        this.field_c = -2147483648;
        this.field_h = null;
        this.field_j = -2;
        this.field_e = false;
    }

    static {
        field_i = "Please try changing the following settings:  ";
    }
}
