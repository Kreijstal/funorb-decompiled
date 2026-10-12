/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends ma {
    private tl field_mb;
    private RgbSprite field_pb;
    static int[] field_ub;
    static int[] field_ob;
    static int field_nb;
    static String field_gb;
    private int field_jb;
    static RgbSprite field_tb;
    static int[] field_ib;
    static boolean field_fb;
    static fh field_lb;
    private String field_hb;
    static int[] field_kb;
    static String field_sb;
    static NodeDeque field_qb;
    static RgbSprite[] field_rb;

    final boolean a(int param0, lh param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ff.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        byte[] var9;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = SteelSentinels.obfuscationControl;
        if (vn.field_h < 0) {
          return;
        }
        if (param0 <= 1) {
          var9 = (byte[]) null;
          ff.a((byte) 92, (byte[]) null);
        }
        var3 = -135 + param2;
        var4 = param1 - 35;
        var5 = 256;
        if (vn.field_h < 75) {
          var5 = (vn.field_h << 8) / 75;
        }
        if (vn.field_h > 200) {
          var5 = (250 - vn.field_h << 8) / 50;
        }
        q.a(ai.field_o, (byte) -106);
        lf.a();
        SoftwareRaster.b();
        pm.a(true);
        if (var5 < 256) {
          SoftwareRaster.c(0, 0, SoftwareRaster.field_c, SoftwareRaster.field_j, 0, 256 - var5);
        }
        tk.$cfr$intArgs$f$20d51497949f(103);
        if (150 > vn.field_h) {
          ai.field_o.b(var3, var4);
        } else {
          dj.field_c.b(var3 + 15, 10 + var4, var5);
        }
        var6 = -125 + vn.field_h;
        if (0 < var6 &&
          50 > var6) {
          if (var6 >= 20) {
            if (var6 < 30) {
              gb.field_d.a(var3, var4, 256);
            } else {
              var7 = 256 * (-var6 + 50) / 20;
              gb.field_d.a(var3, var4, var7);
            }
          } else {
            var7 = 256 * var6 / 20;
            gb.field_d.a(var3, var4, var7);
          }
        }
        var6Lifetime1 = -140 + vn.field_h;
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
          }
          BattleTerrain.field_k.b(var3 + 15, 10 + var4, var5 * var7Lifetime1 >> 8);
        }
        return;
    }

    final static void g(byte param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$20 = null;
        StringBuilder discarded$21 = null;
        StringBuilder discarded$22 = null;
        StringBuilder discarded$23 = null;
        StringBuilder discarded$24 = null;
        StringBuilder discarded$25 = null;
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        StringBuilder discarded$30 = null;
        StringBuilder discarded$31 = null;
        StringBuilder discarded$32 = null;
        StringBuilder discarded$33 = null;
        StringBuilder discarded$34 = null;
        int dupTemp$35 = 0;
        String[] array$36 = null;
        String[] array$37 = null;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_231_0 = 0;
        int stackIn_348_0 = 0;
        int stackIn_367_0 = 0;
        int stackIn_418_0 = 0;
        int stackIn_430_0 = 0;
        int stackIn_489_0 = 0;
        int stackIn_519_0 = 0;
        int stackIn_519_1 = 0;
        boolean stackIn_520_2 = false;
        int stackIn_523_0 = 0;
        String stackIn_702_0;
        int stackIn_702_1;
        String[] stackIn_702_2;
        String[] stackIn_702_3;
        int stackIn_702_4;
        int stackIn_703_5;
        String stackIn_708_0;
        int stackIn_708_1;
        String[] stackIn_708_2;
        String[] stackIn_708_3;
        int stackIn_708_4;
        int stackIn_709_5;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        SceneWidget[] var3_ref_gh__ = null;
        int var3 = 0;
        int var4 = 0;
        SceneWidget var5_ref_gh = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        Object var8 = null;
        fh var8_ref = null;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        Object var13 = null;
        int var14 = 0;
        Object var14_ref = null;
        int var15_int = 0;
        Object var15 = null;
        int var16 = 0;
        Object var16_ref = null;
        int var17 = 0;
        String var17_ref_String = null;
        int[] var18_ref_int__ = null;
        int var18 = 0;
        int[] var19_ref_int__ = null;
        int var19 = 0;
        int var20 = 0;
        RgbSprite var20_ref_wk = null;
        int var21 = 0;
        Object var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24_int = 0;
        String[] var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        Object var28_ref = null;
        int var28 = 0;
        Object var29_ref = null;
        String var29_ref_String = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        PartInstruction var33 = null;
        PartInstruction var34 = null;
        PartInstruction var35 = null;
        PartInstruction var36 = null;
        String[] var37 = null;
        String var38 = null;
        String var39 = null;
        SceneWidget var40 = null;
        SceneWidget var41 = null;
        SceneWidget var42 = null;
        String var43 = null;
        int[] var44 = null;
        StringBuilder var45 = null;
        int[] var46 = null;
        int[] var48 = null;
        String var50 = null;
        PartInstruction var51 = null;
        ArticulatedPart var52 = null;
        SceneWidget var53 = null;
        String var54 = null;
        String var55 = null;
        String var56 = null;
        String var57 = null;
        int[] var58 = null;
        String var59 = null;
        ArticulatedPart var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var64 = null;
        int[] var66 = null;
        int[] var69 = null;
        int[] var70 = null;
        var32 = SteelSentinels.obfuscationControl;
        try {
          pa.field_e = -1;
          lj.field_h = null;
          if (dc.field_g != 1) {
            stackIn_7_0 = (dc.field_g == 0) ? 1 : 0;
          } else {
            stackIn_7_0 = 1;
          }
          var1_int = stackIn_7_0;
          if (kk.field_a == null) {
            stackIn_19_0 = 0;
          } else {
            if (oh.field_f >= kk.field_a.field_Rb) {
              if (oh.field_f < kk.field_a.field_Rb + kk.field_a.field_zb) {
                if (kk.field_a.field_cb <= pi.field_c) {
                  stackIn_19_0 = (kk.field_a.field_Lb + kk.field_a.field_cb <= pi.field_c) ? 0 : 1;
                } else {
                  stackIn_19_0 = 0;
                }
              } else {
                stackIn_19_0 = 0;
              }
            } else {
              stackIn_19_0 = 0;
            }
          }
          boolean decompiledFrameRemainder3 = true;
          var2 = stackIn_19_0;
          if (null != gd.field_jb) {
            if (null != km.field_a ||
              SentinelDesigner.field_a != 0) {
              GameApplet.field_l = true;
              kf.field_s = true;
            }
            if (!kf.field_s &&
              oh.field_f >= bl.field_c.field_Rb &&
              bl.field_c.field_Rb + bl.field_c.field_zb > oh.field_f &&
              pi.field_c >= bl.field_c.field_cb &&
              pi.field_c < bl.field_c.field_cb + bl.field_c.field_Lb) {
              kf.field_s = true;
            }
            if (var2 != 0 ||
              !(fl.field_a < 0) ||
              !(nm.field_w < 0)) {
              GameApplet.field_l = true;
              nl.field_X = true;
            }
            if (ad.field_h) {
              kf.field_s = true;
              sn.field_l = true;
              nl.field_X = true;
              if (ti.field_B == null &&
                ij.field_Y < 0 &&
                null != hm.field_a) {
                if (fg.field_Ob != 0) {
                  if ((fg.field_Ob & 16) != 0) {
                    ak.a(hm.field_a, 83);
                  } else {
                    if ((2 & fg.field_Ob) != 0) {
                      oc.a(4, hm.field_a);
                    }
                  }
                } else {
                  vb.a(hm.field_a, (byte) 19);
                }
              }
              ad.field_h = false;
            }
            if ((!kf.field_s ||
              !GameApplet.field_l) &&
              0 == pm.field_U) {
              var3_ref_gh__ = wc.field_h;
              for (var4 = 0; var3_ref_gh__.length > var4; var4++) {
                var5_ref_gh = var3_ref_gh__[var4];
                var5_ref_gh.a(true, (byte) 126);
              }
              if (kf.field_s) {
                SoftwareRaster.a(bl.field_c.field_Rb, bl.field_c.field_cb, bl.field_c.field_zb, bl.field_c.field_Lb, 0);
                bl.field_c.a(true, (byte) 127);
                kf.field_s = false;
              }
              if (!(!GameApplet.field_l)) {
                SoftwareRaster.a(kk.field_a.field_Rb, kk.field_a.field_cb, kk.field_a.field_zb, kk.field_a.field_Lb, 0);
                kk.field_a.a(true, (byte) 126);
                GameApplet.field_l = false;
              }
              decompiledFrameRemainder3 = false;
            }
            else {
              gd.field_jb.a(true, (byte) 127);
              kf.field_s = false;
              GameApplet.field_l = false;
            }
          }
          var3 = -68 / ((param0 - 80) / 33);
          if (hl.field_v == null) {
            if (uc.field_b == null) {
              uc.field_b = ua.field_x;
            }
            hl.field_v = SentinelDesigner.a(uc.field_b, (byte) 109, di.field_c);
            hl.field_v.b(6993661, 83);
          }
          var4 = 364;
          var5 = 59;
          var6 = 4096;
          var7 = uc.field_b[0];
          if (0 != var7) {
            if (var7 != 55) {
              if (var7 != 57) {
                if (62 == var7) {
                  var5 += 270;
                  var4 += 10;
                } else {
                  if (var7 != 65) {
                    if (69 == var7) {
                      var5 += 280;
                    } else {
                      if (var7 == 72) {
                        var6 -= 800;
                        var5 += 260;
                      } else {
                        if (var7 == 75) {
                          var6 -= 200;
                          var4 -= 8;
                          var5 += 290;
                        } else {
                          if (var7 == 79) {
                            var5 += 290;
                          } else {
                            if (var7 == 84) {
                              var4 += 12;
                              var5 += 290;
                            } else {
                              if (var7 != 88) {
                                if (var7 == 92) {
                                  var5 += 290;
                                  var6 -= 1300;
                                }
                              } else {
                                var6 -= 400;
                                var4 += 25;
                                var5 += 290;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var5 += 290;
                  }
                }
              } else {
                var5 += 280;
              }
            } else {
              var5 += 280;
            }
          } else {
            var5 += 280;
          }
          boolean decompiledFrameRemainder2 = true;
          hj.field_w = var6;
          var7 = 0;
          var8_int = 66 + qa.field_M * 26 / 57;
          var9 = 114 * qa.field_M / 57 + 510;
          SoftwareRaster.g(226, var8_int, 26, 3355443);
          SoftwareRaster.d(226, var8_int, 26, 3355443);
          SoftwareRaster.g(var9 - 26, var8_int, 26, 3355443);
          SoftwareRaster.d(var9, var8_int, 26, 3355443);
          SoftwareRaster.g(226, 360, 26, 3355443);
          SoftwareRaster.d(226, 334, 26, 3355443);
          SoftwareRaster.g(var9 - 26, 360, 26, 3355443);
          SoftwareRaster.d(var9, 334, 26, 3355443);
          if (null != hl.field_v &&
            null != gd.field_jb) {
            vh.field_a = var5;
            b.field_c = var4 + qa.field_M;
            ti.field_y = vh.field_a;
            en.field_d = b.field_c;
            lh.field_t = vh.field_a;
            nj.field_V = b.field_c;
            SoftwareRaster.a(221, 60, 629, 432);
            if (var1_int == 0) {
              var8 = null;
              if (hl.field_v.componentId == 69) {
                var33 = hl.field_v.a(0, 2);
                if (var33 != null &&
                  null != var33.attachedPart) {
                  vk.field_r.a(var4 + qa.field_M + 40, var5 - 135);
                }
              }
              if (hl.field_v.componentId == 75) {
                var34 = hl.field_v.a(0, 2);
                if (var34 != null &&
                  null != var34.attachedPart) {
                  vk.field_r.a(4 + qa.field_M + var4, -178 + var5);
                  if (var34.attachedPart.componentId == 95) {
                    vk.field_r.a(var4 + qa.field_M + 10, -175 + var5);
                  }
                }
              }
              if (hl.field_v.componentId == 57) {
                var35 = hl.field_v.a(0, 2);
                if (var35 != null &&
                  null != var35.attachedPart) {
                  vk.field_r.a(-3 + qa.field_M + var4, var5 - 156);
                }
              }
              if (55 == hl.field_v.componentId) {
                var36 = hl.field_v.a(0, 2);
                if (var36 != null &&
                  var36.attachedPart != null &&
                  var36.attachedPart.componentId == 95) {
                  vk.field_r.e(35 + qa.field_M + var4, var5 - 130);
                }
              }
              hl.field_v.a(0, true, b.field_c, vh.field_a, (byte) 49, 0);
            }
            SoftwareRaster.c();
            if (qa.field_M == 57 &&
              var1_int == 0) {
              var8_int = lh.field_t;
              if (hl.field_v.componentId == 84) {
                var8_int -= 50;
              }
              SoftwareRaster.d(308, ti.field_y, var8_int - ti.field_y, 3355443);
              SoftwareRaster.g(308, ti.field_y, 8, 3355443);
              SoftwareRaster.g(308, var8_int, 8, 3355443);
              var9 = (var8_int - ti.field_y) * 2000 / hj.field_w;
              fk.field_d.c(db.a(de.field_e, -123, new String[]{Integer.toString(var9 / 10), Integer.toString(var9 % 10)}), 307, (ti.field_y + var8_int) / 2, 4473924, -1);
            }
            var8_int = -qa.field_M + 657;
            if (var8_int < 640 &&
              var1_int == 0) {
              var9 = Math.min(365, lh.field_t);
              var10 = 18 * hj.field_w / 2000;
              vk.field_q.c(var8_int, -8 + var9 - var10, 7 * hj.field_w / 2000, var10);
              if (qa.field_M == 57) {
                SoftwareRaster.d(-10 + var8_int, -8 + (var9 - var10), var10, 3355443);
                SoftwareRaster.g(var8_int - 10, -var10 + var9 - 8, 8, 3355443);
                SoftwareRaster.g(var8_int - 10, -8 + var9, 8, 3355443);
                var11_ref_String = db.a(de.field_e, -60, new String[]{Integer.toString(1), Integer.toString(8)});
                fk.field_d.c(var11_ref_String, var8_int - 12, -8 + var9 - var10 / 2 + 3, 4473924, -1);
              }
            }
            hj.field_w = var6;
            if (li.field_v > 0) {
              var9 = 154;
              var10 = 16;
              var11 = 640 - var9 - 16;
              var12 = 378;
              var13_int = 1000;
              var14 = li.field_v;
              var15_int = var14 * var9 / var13_int;
              SoftwareRaster.a(var11, var12, var15_int, -1 + var10, 2061990);
              for (var16 = 100; var13_int > var16; var16 += 100) {
                var17 = var11 + var16 * var9 / var13_int;
                SoftwareRaster.d(var17, var12, var10, 0);
              }
              SoftwareRaster.h(-2 + var11, -2 + var12, 4 + var9, 4 + var10, 4408131);
              fk.field_d.c(Explosion.field_E + var14, var11 + var9, -4 + var12, 16777215, -1);
            }
            var9 = 0;
            var10 = 0;
            var7 = hl.field_v.e((byte) -85);
            var11 = 0;
            var12 = (int)((double)hl.field_v.h(-31496) / Math.sqrt((double)hl.field_v.getTotalArmour(8192)));
            var13_int = (int)((double)hl.field_v.j(0) / Math.sqrt((double)hl.field_v.getTotalArmour(8192)));
            if (var12 < 0) {
              var12 = 0;
            }
            if (var13_int < 0) {
              var13_int = 0;
            }
            var14 = 0;
            var15_int = 0;
            var16 = 0;
            for (var17 = 0; var17 < hl.field_v.i(-117); var17++) {
              var18 = di.field_c[var17];
              if (var18 != 0) {
                switch (var18) {
                  case 2:
                    var11 += 3;
                    break;
                  case 3:
                    var11 += 4;
                    break;
                  default:
                    switch (var18) {
                      case 4:
                        var11 += 5;
                        break;
                      case 6:
                        var10 += 2;
                        break;
                      case 7:
                        var10 += 3;
                        break;
                      case 8:
                        var10 += 4;
                        break;
                      case 10:
                        var9 += 100;
                        break;
                      case 13:
                        var9 += 1000;
                        break;
                      case 29:
                        var15_int = 1;
                        break;
                      case 34:
                        var16 = 1;
                        var14 = 1;
                        var15_int = 1;
                        break;
                      case 28:
                        var14 = 1;
                        break;
                      case 14:
                        var9 += 2000;
                        break;
                      case 12:
                        var9 += 500;
                        break;
                      case 11:
                        var9 += 200;
                        break;
                      case 9:
                        var10 += 5;
                        break;
                      case 5:
                        var10++;
                        break;
                      case 20:
                        var11 += 10;
                        break;
                      default:
                        break;
                    }
                    break;
                  case 1:
                    var11 += 2;
                    break;
                }
              } else {
                var11++;
              }
              if (di.field_c[var17] != -1) {
                var7 = var7 + dn.field_Sb[di.field_c[var17]];
              }
            }
            if (var14 != 0) {
              var12 = 17 * var12 / 10;
            }
            if (var16 != 0) {
              var10 += 15;
              var9 += 3800;
              var11 += 25;
              var7 = 6100;
            }
            if (var15_int != 0) {
              var13_int = 17 * var13_int / 10;
            }
            var12 -= 5;
            if (null != hl.field_v.a(59, (byte) -103)) {
              var12 += 5;
            }
            if (var12 < 0) {
              var12 = 0;
            }
            var10 += 2;
            var11++;
            if (var12 > 20) {
              var12 = 20;
            }
            ei.field_t = var10;
            if (var1_int == 0) {
              var37 = new String[]{"<img=0>", "<img=5>", "<img=4>", "<img=7>", "<img=2>", "<img=3>"};
              var18_ref_int__ = new int[]{0, 0, 0, 0, 0, 0};
              var19_ref_int__ = new int[]{1000, 1000, 10, 11, 10, 20};
              var18_ref_int__[0] = hl.field_v.getTotalArmour(8192);
              var18_ref_int__[4] = var12;
              var18_ref_int__[3] = var11;
              if (var16 != 0) {
                var18_ref_int__[0] = var18_ref_int__[0] * 2;
              }
              var18_ref_int__[2] = var10;
              var18_ref_int__[1] = var9;
              var18_ref_int__[5] = var13_int;
              var20 = 220;
              var21 = 394;
              var22 = 100;
              for (var23 = 0; var23 < 6; var23++) {
                fk.field_d.b(var37[var23], var20, var21, 0, -1);
                if (oh.field_f >= var20) {
                  if (oh.field_f < 18 + var20 + var22) {
                    if (pi.field_c >= var21 - 10) {
                      stackIn_231_0 = (1 + var21 > pi.field_c) ? 1 : 0;
                    } else {
                      stackIn_231_0 = 0;
                    }
                  } else {
                    stackIn_231_0 = 0;
                  }
                } else {
                  stackIn_231_0 = 0;
                }
                var24_int = stackIn_231_0;
                SoftwareRaster.h(var20 + 18, var21 - 10, var22, 11, 1400960);
                if (var18_ref_int__[var23] <= var19_ref_int__[var23] * 2) {
                  if (var18_ref_int__[var23] > var19_ref_int__[var23]) {
                    SoftwareRaster.a(18 + var20 + 2, 2 + (var21 - 10), -4 + var22, 7, 8421504);
                    SoftwareRaster.a(2 + (var20 + 18), var21 - 10 + 2, (var18_ref_int__[var23] - var19_ref_int__[var23]) * (-4 + var22) / var19_ref_int__[var23], 7, 16777215);
                  } else {
                    if (var18_ref_int__[var23] > 0) {
                      SoftwareRaster.a(var20 + 18 + 2, -10 + (var21 + 2), var18_ref_int__[var23] * (-4 + var22) / var19_ref_int__[var23], 7, 8421504);
                    } else {
                      SoftwareRaster.h(var20 + 18, var21 - 10, var22, 11, 8400933);
                    }
                  }
                } else {
                  SoftwareRaster.a(2 + var20 + 18, 2 + var21 - 10, var22 - 4, 7, 16777215);
                }
                if (var23 <= 1) {
                  for (var25 = 100; var19_ref_int__[var23] > var25; var25 += 100) {
                    SoftwareRaster.f(var25 * (-4 + var22) / var19_ref_int__[var23] + var20 + 18 + 2, 2 + var21 - 10, 7, 4473924, 192);
                  }
                } else {
                  if (var23 == 2) {
                    for (var25 = 1; var19_ref_int__[var23] > var25; var25++) {
                      SoftwareRaster.f(20 + var20 + (var22 - 4) * var25 / var19_ref_int__[var23], var21 - 10 + 2, 7, 4473924, 192);
                    }
                  }
                }
                if (var24_int != 0) {
                  var25 = 18 + var20 + var22 / 2;
                  var26 = 12;
                  var27 = -var26 + 382;
                  var28_ref = null;
                  var29_ref = null;
                  var30 = var18_ref_int__[var23];
                  var31 = var23;
                  if (var31 == 3) {
                    var30 = var30 * 50 / 3;
                  } else {
                    if (var31 == 4) {
                      var30 = var30 * 100 / 10;
                    } else {
                      if (5 == var31) {
                        var30 = 100 * var30 / 20;
                      }
                    }
                  }
                  var38 = jj.field_h[var23 * 2];
                  var29_ref_String = db.a(jj.field_h[2 * var23 + 1], -124, new String[]{Integer.toString(var30)});
                  if (var18_ref_int__[var23] == 0) {
                    var29_ref_String = ej.field_E;
                  }
                  var39 = var38 + ": " + var29_ref_String;
                  var31 = fk.field_d.c(var39) + 8;
                  var25 = var25 - var31 / 2;
                  SoftwareRaster.c(var25, var27, var31, var26, 0, 192);
                  SoftwareRaster.h(var25, var27, var31, var26, 1400960, 192);
                  fk.field_d.b(var39, 4 + var25, var27 + 10, 41727, -1);
                }
                if (0 == var23 % 2) {
                  var20 += 120;
                } else {
                  var20 -= 120;
                  var21 += 15;
                }
              }
            }
            if (fg.field_Ob != 1) {
              if (0 < (fg.field_Ob & 2)) {
                var42 = hm.field_a;
                if (((var42 != null)) && ((GameApplet.field_l ||
                  var2 != 0 ||
                  nl.field_X))) {
                  oc.a(4, var42);
                  GameApplet.field_l = true;
                }
                decompiledFrameRemainder2 = false;
              }
              else {
                if ((fg.field_Ob & 16) > 0) {
                  var41 = hm.field_a;
                  if (((var41 != null)) && ((GameApplet.field_l ||
                    var2 != 0 ||
                    nl.field_X))) {
                    ak.a(var41, 87);
                    GameApplet.field_l = true;
                  }
                  decompiledFrameRemainder2 = false;
                }
                else {
                  if (fg.field_Ob == 0) {
                    var40 = kk.field_a;
                    if (var40 != null && (GameApplet.field_l ||
                      var2 != 0 ||
                      nl.field_X)) {
                      vb.a(var40, (byte) 19);
                      GameApplet.field_l = true;
                    }
                  }
                }
              }
            }
          }
          if (1 != dc.field_g &&
            dc.field_g != 0) {
            m.a(12, 140, 7786, 484, var7, 412);
          }
          if (ti.field_B != null &&
            oh.field_f >= 0) {
            if (f.field_A != null) {
              f.field_A.a(0, false, oh.field_f, pi.field_c, (byte) 49, 8192);
            }
            ti.field_B.a(0, false, oh.field_f, pi.field_c, (byte) 49, 16384);
          }
          if (ij.field_Y != -1 &&
            oh.field_f >= 0) {
            IsaacRandom.field_d[ij.field_Y].a(oh.field_f - 20, pi.field_c - 20);
          }
          if (0 == (fg.field_Ob & 1)) {
            re.field_eb = -1;
          } else {
            var8_int = 224;
            var9 = 62;
            var10 = 401;
            var11 = 20;
            var12 = 60;
            var13_int = NodeDeque.a((byte) -42, uc.field_b[0]);
            if (re.field_eb != var13_int) {
              re.field_eb = var13_int;
              s.field_a = a.field_c;
              var14 = 20;
              jj.field_e.d();
              SoftwareRaster.a(0, 0, jj.field_e.field_z, jj.field_e.field_B, 0);
              SoftwareRaster.a(0, 0, var14, var14);
              if (0 > var13_int ||
                !(var13_int < si.field_E.length)) {
                var13_int = 0;
              }
              si.field_E[var13_int].c(0, 0, 4 * var14, 4 * var14);
              SoftwareRaster.c();
              sb.field_bb.b((byte) 122);
            }
            if (0 <= var13_int &&
              ig.field_g.length > var13_int &&
              var1_int == 0) {
              SoftwareRaster.c(var8_int, var9, var10, var11, 0, 150);
              SoftwareRaster.h(var8_int, var9, var10, var11, 1397105);
              var43 = ig.field_g[var13_int];
              SoftwareRaster.a(var8_int + 1, 1 + var9, var10 + (var8_int - 1), var9 - (-var11 + 1));
              var15_int = fk.field_d.c(var43);
              var16 = a.field_c - s.field_a;
              if (var16 > var10 + (var15_int + var12)) {
                var16 = var10 + (-var10 + var16) % (var15_int + var12);
              }
              for (var17 = (var12 + 14) / 2 - var16 + (var10 + var8_int); var17 - var12 - 14 < var8_int + var10; var17 = var17 + (var15_int + var12)) {
                fk.field_d.b(var43, var17, -6 + (var11 + var9), 11119017, -1);
              }
              SoftwareRaster.c();
            }
          }
          var8_ref = fk.field_d;
          if (dc.field_g == 15) {
            pa.field_d[dc.field_g].b(-40);
          }
          if (fg.field_Ob == 1 &&
            0 <= t.field_h &&
            df.field_K && (!(dc.field_g >= 0) ||
            pa.field_d[dc.field_g].a(t.field_h, -118))) {
            var62 = ne.a(t.field_h, (byte) 28);
            var46 = var62;
            var9_ref_int__ = var46;
            var64 = ki.b(t.field_h, (byte) -81);
            var48 = var64;
            var10_ref_int__ = var48;
            var11 = 0;
            var12 = 0;
            var61 = var9_ref_int__;
            var44 = var61;
            var13 = var44;
            for (var14 = 0; var14 < var61.length; var14++) {
              var15_int = var61[var14];
              var16 = sj.field_v[var15_int];
              if (t.a(rn.field_D, var15_int, -20370)) {
                var12 = var12 + var16;
              }
              var11 = var11 + var16;
            }
            var13 = var10_ref_int__;
            for (var14 = 0; java.lang.reflect.Array.getLength(var13) > var14; var14++) {
              var15_int = ((int[]) (var13))[var14];
              var16 = qf.field_h[var15_int];
              var11 = var11 + var16;
              if (t.a(fe.field_D, var15_int, -20370)) {
                var12 = var12 + var16;
              }
            }
            var45 = new StringBuilder("<col=ffffff>");
            discarded$0 = var45.append(t.field_e[t.field_h]);
            discarded$1 = var45.append("</col> <col=0080ff>");
            var14 = var11 - var12;
            var12 = var12 * 100 / var11;
            discarded$2 = var45.append(Integer.toString(var12));
            discarded$3 = var45.append(mm.field_c);
            discarded$4 = var45.append("</col>");
            discarded$5 = var45.append(qm.field_e);
            if (var62.length > 0) {
              discarded$6 = var45.append(v.field_c);
              var69 = var9_ref_int__;
              for (var16 = 0; var16 < var69.length; var16++) {
                var17 = var69[var16];
                discarded$8 = var45.append("<br>  ");
                stackIn_348_0 = (!t.a(rn.field_D, var17, -20370)) ? 0 : 1;
                var18 = stackIn_348_0;
                if (var18 == 0) {
                  discarded$9 = var45.append("<col=808080>");
                } else {
                  discarded$10 = var45.append("<col=0080ff>");
                }
                discarded$11 = var45.append(t.field_e[var17]);
                discarded$12 = var45.append("</col>");
                if (var18 == 0) {
                  discarded$13 = var45.append(" (<img=24>");
                  discarded$14 = var45.append(sj.field_v[var17]);
                  discarded$15 = var45.append(")");
                }
              }
              if (0 < var64.length) {
                discarded$7 = var45.append(re.field_X);
              }
            }
            if (var64.length > 0) {
              if (var64.length != 1) {
                discarded$16 = var45.append(dk.field_i);
              } else {
                discarded$17 = var45.append(ed.field_g);
              }
              var70 = var10_ref_int__;
              for (var16 = 0; var16 < var70.length; var16++) {
                var17 = var70[var16];
                discarded$18 = var45.append("<br>  ");
                stackIn_367_0 = (!t.a(fe.field_D, var17, -20370)) ? 0 : 1;
                var18 = stackIn_367_0;
                if (var18 == 0) {
                  discarded$19 = var45.append("<col=808080>");
                } else {
                  discarded$20 = var45.append("<col=0080ff>");
                }
                if (34 == var17) {
                  discarded$21 = var45.append("GODULE");
                } else {
                  discarded$22 = var45.append(rj.field_m[var17]);
                }
                discarded$23 = var45.append("</col>");
                if (var18 == 0) {
                  discarded$24 = var45.append(" (<img=24>");
                  discarded$25 = var45.append(qf.field_h[var17]);
                  discarded$26 = var45.append(")");
                }
              }
            }
            if (li.field_v < var14) {
              discarded$27 = var45.append("<br><br><col=ff2020>");
              discarded$28 = var45.append(mm.field_f);
              discarded$29 = var45.append("<img=22>");
            } else {
              discarded$30 = var45.append("<br><br><col=00ff00>");
              discarded$31 = var45.append(mm.field_f);
              discarded$32 = var45.append("<img=21>");
            }
            discarded$33 = var45.append(var14);
            discarded$34 = var45.append("</col>");
            var50 = var45.toString();
            var16 = 250;
            var17 = ((BitmapFont) ((Object) var8_ref)).field_G + ((BitmapFont) ((Object) var8_ref)).field_F;
            var18 = 5 + (5 + ((BitmapFont) ((Object) var8_ref)).a(var50, -20 + var16, var17));
            var19 = 228;
            var20 = 16777215;
            var21 = -var18 + 378;
            SoftwareRaster.c(var19, var21, var16, var18, 0, 200);
            SoftwareRaster.h(var19, var21, var16, var18, var20);
            ((BitmapFont) ((Object) var8_ref)).a(var50, 10 + var19, 5 + var21, -20 + var16, var18, 8421504, 0, 0, 0, var17);
          }
          var9 = -1;
          var10 = -1;
          var11 = -1;
          if (0 == fg.field_Ob ||
            (18 & fg.field_Ob) != 0) {
            if (0 <= pa.field_e) {
              var9 = di.field_c[pa.field_e];
            }
            if (t.field_h >= 0) {
              var9 = t.field_h;
            }
            if (pa.field_e >= 0 &&
              var9 < 0) {
              var10 = pa.field_e;
            }
          }
          var12 = -1;
          if ((fg.field_Ob & 18) != 0 &&
            var9 < 0 &&
            null != lj.field_h) {
            if (lj.field_h.attachedPart != null) {
              var9 = lj.field_h.attachedPart.componentId;
              var52 = lj.field_h.attachedPart;
              var11 = var52.field_K;
              var12 = var52.field_W;
            } else {
              var10 = lj.field_h.field_q;
              var51 = lj.field_h;
              var12 = var51.field_j;
              var11 = var51.field_m;
            }
            if ((fg.field_Ob & 16) != 0 &&
              83 != var9) {
              if (var10 >= 0) {
                var11 -= 1024;
                var12 += 1024;
              }
              var11 += 1365;
              var11 = var11 - var11 % 2730;
              var12 += 1365;
              var12 = var12 - var12 % 2731;
              var11 -= 16384;
              var12 -= 16384;
            } else {
              var11 = -1;
              var12 = -1;
            }
          }
          if ((fg.field_Ob & 1) != 0) {
            var13_int = oe.field_i;
            oe.field_i = -1;
            for (var14 = 0; var14 < 12; var14++) {
              var53 = jg.field_h[var14];
              if (var53 != null) {
                if ((ni.b(63) ||
                  !(rd.field_b > 0)) &&
                  oc.a(FunOrbClient.field_z[var14], -120, false)) {
                  stackIn_418_0 = 1;
                } else {
                  stackIn_418_0 = 0;
                }
                var16 = stackIn_418_0;
                if (var16 == 0 &&
                  t.a(rn.field_D, FunOrbClient.field_z[var14], -20370)) {
                  if (oh.field_f >= var53.field_Rb &&
                    oh.field_f < 190 &&
                    var53.field_cb <= pi.field_c &&
                    pi.field_c < var53.field_cb + var53.field_Lb) {
                    stackIn_430_0 = 1;
                  } else {
                    stackIn_430_0 = 0;
                  }
                  var17 = stackIn_430_0;
                  var18 = 0;
                  if (var17 != 0) {
                    oe.field_i = var14;
                    if (var13_int != oe.field_i) {
                      nc.field_f = a.field_c;
                      CombatWorld.c(-2483, 97);
                    }
                    var18 = (-nc.field_f + a.field_c) / 6 % 15;
                  }
                  var19 = 64;
                  var53.field_Pb.d();
                  SoftwareRaster.a(0, 0, var19, var19, 0);
                  SoftwareRaster.a(0, 0, var19, var19);
                  var20_ref_wk = si.field_E[var14];
                  var16_ref = var20_ref_wk;
                  var16_ref = var20_ref_wk;
                  var21 = (var18 & 3) * var19;
                  var22 = (var18 >> 2) * var19;
                  var20_ref_wk.a(-var21, -var22);
                }
              }
            }
            sb.field_bb.b((byte) 124);
          } else {
            oe.field_i = -1;
          }
          if (0 <= dc.field_g) {
            var13_int = -1;
            if (var9 >= 0) {
              var13_int = var9;
            } else {
              if (0 <= var10) {
                var13_int = var10;
              }
            }
            if (0 <= var13_int &&
              !pa.field_d[dc.field_g].a(var13_int, -111)) {
              var10 = -1;
              var9 = -1;
            }
          }
          if (var10 >= 0 &&
            fg.field_Ob == 0) {
            if (nm.field_w != var10) {
              CombatWorld.c(-2483, 97);
              nm.field_w = var10;
              GameApplet.field_l = true;
            }
            var10 = -1;
          } else if (-2 == pa.field_e &&
            fg.field_Ob == 0) {
            if (nm.field_w != -2) {
              GameApplet.field_l = true;
              nm.field_w = -2;
              CombatWorld.c(-2483, 97);
            }
          } else if (0 > var9 &&
            var10 < 0) {
            if (nm.field_w != -1) {
              nm.field_w = -1;
              GameApplet.field_l = true;
            }
          } else {
            var13 = null;
            var14_ref = null;
            var15 = null;
            var16_ref = null;
            if (0 > var10) {
              if (0 != fg.field_Ob) {
                if ((18 & fg.field_Ob) != 0) {
                  if (nm.field_w != var9) {
                    CombatWorld.c(-2483, 97);
                    nm.field_w = var9;
                    GameApplet.field_l = true;
                  }
                  var13 = t.field_e[var9];
                  var14_ref = var13;
                  var14_ref = var13;
                  if (var9 >= 17 &&
                    var9 < 17 + NodeHashTable.field_i.length) {
                    var55 = db.field_g[-17 + var9];
                    var14_ref = var55;
                    var17 = ja.a(var9, false);
                    if (var17 >= 0 &&
                      var17 < li.field_B.length) {
                      var15 = db.a(im.field_c, -117, new String[]{li.field_B[var17]});
                      var14_ref = var15;
                      var14_ref = var15;
                      var16_ref = hb.field_j[var17];
                    }
                    if (bi.b(-90, var9)) {
                      if (var14_ref != null &&
                        var55.length() > 0) {
                        var14_ref = var55 + "<br>";
                      } else {
                        var14_ref = "";
                      }
                      var14_ref = (String) (var14_ref) + al.field_h;
                    }
                  } else {
                    var56 = km.a(var9, 112);
                    var14_ref = var56;
                    var21_ref = var14_ref;
                    var14_ref = var21_ref;
                    var14_ref = var56;
                    var14_ref = var56;
                    var57 = kk.a(NodeDeque.a(var9, (byte) 67), -4097);
                    var14_ref = var57;
                    var21_ref = var14_ref;
                    var14_ref = var21_ref;
                    var14_ref = var57;
                    if (var56 != null) {
                      if (var57 != null) {
                        var14_ref = var56 + "<br><br>" + var57;
                      }
                    } else {
                      var14_ref = var57;
                    }
                  }
                  var17_ref_String = pl.a(109, var9);
                  var14_ref = var17_ref_String;
                  var21_ref = var14_ref;
                  var14_ref = var21_ref;
                  var14_ref = var17_ref_String;
                  if (var17_ref_String != null) {
                    var14_ref = (String) (var14_ref) + db.a(oa.field_H, -64, new String[]{var17_ref_String});
                  }
                }
              } else {
                if (nm.field_w != var9) {
                  CombatWorld.c(-2483, 97);
                  GameApplet.field_l = true;
                  nm.field_w = var9;
                }
                if (var9 != 34) {
                  var14_ref = se.field_a[var9];
                } else {
                  var14_ref = "MOD ONLY MODULE: gives you ludicrous amounts of everything";
                }
                if (var9 != 34) {
                  var13 = rj.field_m[var9];
                } else {
                  var13 = "GODULE";
                }
                if ((ni.b(51) ||
                  !(rd.field_b > 0)) &&
                  oc.a(var9, -81, true)) {
                  stackIn_489_0 = 1;
                } else {
                  stackIn_489_0 = 0;
                }
                var17 = stackIn_489_0;
                if (var17 != 0) {
                  var14_ref = of.field_b;
                }
              }
            } else {
              if (nm.field_w != var10) {
                CombatWorld.c(-2483, 97);
                nm.field_w = var10;
                GameApplet.field_l = true;
              }
              var17 = -2049 & var10;
              if (var17 != 2) {
                if (4 != var17) {
                  if (8 == var17) {
                    var13 = ti.field_o;
                  } else {
                    var13 = bc.field_nb;
                    var54 = dc.a(var10, 32);
                    if (var54.length() <= 0) {
                      var14_ref = null;
                    } else {
                      var14_ref = db.a(wh.field_h, -68, new String[]{dc.a(var10, 32)});
                    }
                  }
                } else {
                  var13 = tc.field_r;
                }
              } else {
                var13 = im.field_e;
              }
              if (kh.field_v.a((byte) 2, lj.field_h) != -1) {
                if (var14_ref != null) {
                  var14_ref = (String) (var14_ref) + "<br><br>" + dg.field_c;
                } else {
                  var14_ref = dg.field_c;
                }
              }
            }
            boolean decompiledFrameRemainder0 = true;
            if (var10 < 0 && (ni.b(57) ||
              !(0 < rd.field_b))) {
              stackIn_519_0 = var9;
              stackIn_519_1 = -86;
              stackIn_520_2 = (fg.field_Ob == 0);
              if (oc.a(stackIn_519_0, stackIn_519_1, stackIn_520_2)) {
                stackIn_523_0 = 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_523_0 = 0;
            }
            boolean decompiledFrameRemainder1 = true;
            var17 = stackIn_523_0;
            if (var17 == 0) {
              if (he.a((byte) 122) &&
                0 <= var9 &&
                (fg.field_Ob & 1) == 0) {
                var18 = 1;
                var19 = 0;
                var20 = 0;
                if (0 != fg.field_Ob) {
                  var20 = sj.field_v[var9];
                  if (t.a(rn.field_D, var9, -20370)) {
                    var18 = 0;
                  } else {
                    if (!aj.a(ge.field_m, (byte) 123, rn.field_D, var9, ArticulatedPart.f((byte) -74))) {
                      var18 = 2;
                      var19 = 1;
                    } else {
                      if (var20 > li.field_v) {
                        var18 = 2;
                      }
                    }
                  }
                } else {
                  var20 = qf.field_h[var9];
                  if (t.a(fe.field_D, var9, -20370)) {
                    var18 = 0;
                  } else {
                    if (ad.a(var9, ArticulatedPart.f((byte) -61), fe.field_D, (byte) 84, ge.field_m, rn.field_D)) {
                      if (var20 > li.field_v) {
                        var18 = 2;
                      }
                    } else {
                      var19 = 1;
                      var18 = 2;
                    }
                  }
                }
                var21_ref = null;
                var22 = var18;
                if (var22 != 0) {
                  if (var22 != 1) {
                    if (2 == var22) {
                      if (var19 != 0) {
                        var21_ref = a.field_d[3];
                      } else {
                        var21_ref = a.field_d[2];
                      }
                    }
                  } else {
                    var21_ref = a.field_d[1];
                  }
                } else {
                  var21_ref = a.field_d[0];
                }
                if (var21_ref != null) {
                  var21_ref = db.a((String) (var21_ref), -64, new String[]{Integer.toString(var20)});
                  var14_ref = var21_ref;
                  var14_ref = var21_ref;
                }
                if (var14_ref != null &&
                  ((String) (var14_ref)).length() != 0) {
                  if ((var21_ref != null)) {
                    var14_ref = (String) (var14_ref) + "<br><br>" + (String) (var21_ref);
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var14_ref = var21_ref;
                }
              }
            } else {
              var14_ref = of.field_b;
              var21_ref = var14_ref;
              var14_ref = var21_ref;
              var21_ref = var14_ref;
              var14_ref = var21_ref;
            }
            var18 = 110;
            var19 = 270;
            var20 = ((BitmapFont) ((Object) var8_ref)).field_G + ((BitmapFont) ((Object) var8_ref)).field_F;
            var21 = 5 + (5 + var20);
            var22 = 228;
            var23 = 16777215;
            if (var9 < 0) {
              var23 = 4210752;
            }
            var24 = new String[4];
            var25 = 0;
            var26 = 0;
            if (var13 != null) {
              var25 = ((BitmapFont) ((Object) var8_ref)).a((String) (var13), new int[]{-20 + var19}, var24);
              var21 = var21 + (5 + var20 * var25);
            }
            if (0 != (fg.field_Ob & 16)) {
              var26 = d.a(0, 0, 17, true, var9);
              if (var10 >= 0) {
                var21 += 25;
              } else {
                if (var16_ref != null) {
                  var27 = 7 + var20 + (-20 + ((RgbSprite) (var16_ref)).field_F);
                  if (var26 < var27) {
                    var26 = var27;
                  }
                }
              }
            }
            var21 = var21 + var26;
            if (var14_ref != null) {
              var21 = var21 + (((BitmapFont) ((Object) var8_ref)).a((String) (var14_ref), var19 - 20, var20) + 5);
            }
            var18 = 378 - var21;
            SoftwareRaster.c(var22, var18, var19, var21, 0, 200);
            SoftwareRaster.h(var22, var18, var19, var21, var23);
            var21 = var18 - (-5 - var20);
            if (var25 > 0) {
              for (var27 = 0; var27 < var25; var27++) {
                ((BitmapFont) ((Object) var8_ref)).b(var24[var27], 10 + var22, var21 + var27 * var20, 1021128, 0);
              }
              var21 = var21 + (var20 * var25 + 5);
            }
            if (var16_ref != null) {
              ((RgbSprite) (var16_ref)).f(var22 + 138, var21 - 18);
              ((BitmapFont) ((Object) var8_ref)).a((String) (var15), 138 + var22, var21 - 20 + ((RgbSprite) (var16_ref)).field_F, -140 + (var19 - 2), 100, 1021128, 0, 0, 0, 10);
            }
            if (var11 != -1 ||
              var12 != -1) {
              var27 = var22 + var19 - 40;
              var28 = -10 + var21;
              var29 = 10;
              if (var10 >= 0) {
                var27 = var19 / 2 + var22;
              }
              SoftwareRaster.c(var27, var28 + 1, var29, 477796);
              SoftwareRaster.c(var27, var28, var29, 1021128);
              var12 = 8192 * var12 / 65536;
              ((BitmapFont) ((Object) var8_ref)).a(tk.field_s, var27, 14 + var28 + var29, 1044724, 0);
              var11 = 8192 * var11 / 65536;
              for (var30 = var11; var30 < var12; var30 += 100) {
                SoftwareRaster.d(var27, var28, var29 * kg.a(var30, (byte) -76) / 65536 + var27, var28 + var29 * jh.a(var30, 4096) / 65536, 1044724);
                SoftwareRaster.d(var27, var28 + 1, var27 + kg.a(var30, (byte) -82) * var29 / 65536, var29 * jh.a(var30, 4096) / 65536 + 1 + var28, 1044724);
              }
              SoftwareRaster.d(var27, var28, kg.a(var12, (byte) -82) * var29 / 65536 + var27, var28 + var29 * jh.a(var12, 4096) / 65536, 1044724);
              if (var10 >= 0) {
                var21 = var21 + (18 + var29);
              }
              SoftwareRaster.d(var27, 1 + var28, kg.a(var12, (byte) -77) * var29 / 65536 + var27, 1 + var28 + var29 * jh.a(var12, 4096) / 65536, 1044724);
            }
            if ((fg.field_Ob & 16) != 0) {
              d.a(var21 - 10, var22 + 10, 17, false, var9);
            }
            var21 = var21 + var26;
            if (var14_ref != null) {
              ((BitmapFont) ((Object) var8_ref)).a((String) (var14_ref), var22 + 10, var21, -20 + var19, 300, 1021128, 0, 0, 0, var20);
              var21 = var21 + ((BitmapFont) ((Object) var8_ref)).a((String) (var14_ref), -20 + var19, var20);
            }
          }
          var13 = null;
          if (qh.field_Wb) {
            var66 = new int[35];
            var58 = var66;
            var14_ref = var58;
            var15_int = hl.field_v.i(-115);
            for (var16 = 0; var15_int > var16; var16++) {
              if (di.field_c[var16] >= 0) {
                dupTemp$35 = di.field_c[var16];
                ((int[]) (var14_ref))[dupTemp$35] = ((int[]) (var14_ref))[dupTemp$35] + 1;
              }
            }
            var16 = -1;
            var17 = 0;
            for (var18 = 0; var18 < var66.length; var18++) {
              var19 = pe.field_O[var18];
              if (var19 != 0 &&
                var19 != 1 &&
                var19 != 2 &&
                var66[var18] > 1) {
                var16 = var18;
              }
              if (var19 == 2 &&
                var66[var18] > 0) {
                var17 = 1;
              }
            }
            if (var16 == 34) {
              var13 = "Don't equip multiple GODULEs. They are too awesome.";
            } else if (var16 != -1) {
              var13 = db.a(SentinelDesigner.field_b[1], -25, new String[]{rj.field_m[var16]});
            } else if (var66[26] > 0 &&
              var17 == 0) {
              var13 = SentinelDesigner.field_b[2];
            } else if (0 < var66[28] &&
              hl.field_v.h(-31496) <= 0) {
              var13 = SentinelDesigner.field_b[3];
            } else if (var66[29] > 0 &&
              hl.field_v.j(0) <= 0) {
              var13 = SentinelDesigner.field_b[4];
            } else if (0 < var66[17] &&
              !Projectile.field_lb) {
              var13 = SentinelDesigner.field_b[5];
            } else if (var66[16] > 0 &&
              !vc.field_d) {
              var13 = SentinelDesigner.field_b[6];
            } else if (0 < var66[22] &&
              !GameplayController.field_I &&
              !bf.field_Gb) {
              var13 = SentinelDesigner.field_b[7];
            } else if (var66[23] > 0 &&
              !qf.field_b) {
              var13 = SentinelDesigner.field_b[8];
            } else if (0 < var66[25] &&
              !bm.field_Q) {
              var13 = SentinelDesigner.field_b[9];
            } else if (0 < var66[24] &&
              ei.field_t < 5) {
              var13 = SentinelDesigner.field_b[10];
            } else if (lc.field_f &&
              !(10 <= ei.field_t)) {
              var13 = SentinelDesigner.field_b[11];
            }
          } else {
            var13 = SentinelDesigner.field_b[0];
            var15 = var13;
            var15 = var13;
          }
          if (var13 != null &&
            ef.field_b) {
            var59 = jn.field_e + (String) (var13);
            var15 = var59;
            var15 = var59;
            var14 = 283;
            var15_int = 230;
            var16 = 87;
            var17 = 10 + pl.field_U.a(var59, var14);
            var18 = 10 + pl.field_U.a(var59, var14, 12);
            SoftwareRaster.c((-var17 + var14) / 2 + var15_int, -5 + var16, var17, var18, 0, 150);
            pl.field_U.a(var59, var15_int, var16, var14, 100, 16711680, 0, 1, 0, 12);
          }
          if (f.field_y != null) {
            var14 = 0;
            var15 = null;
            if (fg.field_Ob == 0) {
              var16 = (int)f.field_y.key;
              var14 = Integer.parseInt(f.field_y.field_S.substring(5, 6));
              var17 = var14;
              if (var17 == 1) {
                var15 = db.a(sl.field_j[0], -71, new String[]{Integer.toString(dn.field_Sb[var16])});
              } else {
                if (2 != var17) {
                  if (var17 == 3) {
                    var15 = sl.field_j[2];
                  } else {
                    if (var17 != 4) {
                      if (5 != var17) {
                        if (var17 == 7) {
                          if (var16 != 20) {
                            var15 = db.a(sl.field_j[5], -76, new String[]{Integer.toString(s.a(var16, false) * 50 / 3)});
                          } else {
                            var15 = sl.field_j[6];
                          }
                        }
                      } else {
                        var15 = db.a(sl.field_j[4], -86, new String[]{Integer.toString(s.a(var16, false) * 100)});
                      }
                    } else {
                      var15 = db.a(sl.field_j[3], -94, new String[]{Integer.toString(s.a(var16, false))});
                    }
                  }
                } else {
                  var15 = sl.field_j[1];
                }
              }
            } else {
              var60 = NodeDeque.a((int)f.field_y.key, (byte) 67);
              var14 = Integer.parseInt(f.field_y.field_S.substring(5, 6));
              if (0 == (fg.field_Ob & 1) && (var14 == 2 ||
                var14 == 3) && oh.field_f < -30 + f.field_y.field_Rb + f.field_y.field_zb) {
                var14 = (var60.i(-118) <= 0) ? -1 : 6;
              }
              var17 = var14;
              if (var17 == 0) {
                var15 = db.a(sl.field_j[7], -111, new String[]{Integer.toString(var60.getTotalArmour(8192))});
              } else {
                if (var17 != 1) {
                  if (var17 != 2) {
                    if (var17 == 3) {
                      if ((1 & fg.field_Ob) != 0) {
                        var17 = NodeDeque.a((byte) -97, var60.componentId);
                        array$36 = new String[1];
                        stackIn_708_0 = sl.field_j[10];
                        stackIn_708_1 = -93;
                        stackIn_708_2 = array$36;
                        stackIn_708_3 = array$36;
                        stackIn_708_4 = 0;
                        if (var17 >= 0) {
                          stackIn_709_5 = qc.field_S[var17];
                        } else {
                          stackIn_709_5 = 0;
                        }
                        stackIn_708_3[stackIn_708_4] = Integer.toString(stackIn_709_5);
                        var15 = db.a(stackIn_708_0, stackIn_708_1, stackIn_708_2);
                      } else {
                        var15 = sl.field_j[2];
                      }
                    } else {
                      if (var17 == 6) {
                        var15 = db.a(al.field_e, -46, new String[]{Integer.toString(var60.i(-128))});
                      }
                    }
                  } else {
                    if ((fg.field_Ob & 1) != 0) {
                      var17 = NodeDeque.a((byte) 77, var60.componentId);
                      array$37 = new String[1];
                      stackIn_702_0 = sl.field_j[9];
                      stackIn_702_1 = -107;
                      stackIn_702_2 = array$37;
                      stackIn_702_3 = array$37;
                      stackIn_702_4 = 0;
                      if (var17 >= 0) {
                        stackIn_703_5 = qc.field_S[var17];
                      } else {
                        stackIn_703_5 = 0;
                      }
                      stackIn_702_3[stackIn_702_4] = Integer.toString(stackIn_703_5);
                      var15 = db.a(stackIn_702_0, stackIn_702_1, stackIn_702_2);
                    } else {
                      var15 = sl.field_j[1];
                    }
                  }
                } else {
                  var15 = db.a(sl.field_j[8], -40, new String[]{Integer.toString(tc.field_B[var60.componentId])});
                }
              }
              if (var14 != 6 &&
                0 <= f.field_y.field_S.indexOf("<img=2>") &&
                f.field_y.field_S.indexOf("<img=3>") >= 0) {
                var15 = sl.field_j[11];
                var14 = 2;
              }
            }
            if (var15 != null) {
              var16 = 13;
              var17 = f.field_y.field_Rb + 20;
              var18 = f.field_y.field_cb - (var16 - 2);
              if (var14 == 6) {
                var17 -= 20;
              }
              var19 = fk.field_d.c((String) (var15)) + 8;
              if ((var14 == 2 ||
                var14 == 3) && 0 == (fg.field_Ob & 1)) {
                var17 = -var19 - 4 + (f.field_y.field_zb + f.field_y.field_Rb);
              }
              SoftwareRaster.c(var17, var18, var19, var16, 0, 192);
              SoftwareRaster.h(var17, var18, var19, var16, 1400960, 192);
              fk.field_d.b((String) (var15), 4 + var17, 10 + var18, 16777215, -1);
            }
          }
          if (dc.field_g >= 0 &&
            dc.field_g != 15) {
            pa.field_d[dc.field_g].b(-40);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "ff.VA(" + param0 + ')');
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          if (param0 != 89) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var3 = new byte[var2_int];
          ii.a(param1, 0, var3, 0, var2_int);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ff.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static SceneWidget a(boolean param0, int param1, int[] param2) {
        SceneWidget stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        SceneWidget stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        SceneWidget var7 = null;
        SceneWidget var8 = null;
        SceneWidget var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        SceneWidget var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16_ref_int__ = null;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int var26 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        RgbSprite var30 = null;
        SceneWidget var32 = null;
        int[] var34 = null;
        SceneWidget var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var41 = null;
        int[] var44 = null;
        int[] var45 = null;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18_intLifetime1;
        int var18_intLifetime2;
        int var19Lifetime1;
        int var20Lifetime1;
        var22 = SteelSentinels.obfuscationControl;
        try {
          var3_int = qa.field_O;
          var4 = param1 + 100;
          var5 = 78;
          var6 = 66;
          var7 = new SceneWidget((long)var4, sb.field_Y);
          cj.field_a[var4] = var7;
          var7.field_I = tk.field_t;
          var7.field_Ab = be.field_f;
          var8 = new SceneWidget((long)var4, (SceneWidget) null);
          var8.a(0, 2, var5 - 4, 2, -4 + var6);
          var8.field_I = co.field_d;
          if (null == ue.field_g[-1 + param1]) {
            ad.a(param1 - 1, (ArticulatedPart) null, 84);
          }
          var8.field_Pb = ue.field_g[param1 - 1];
          var7.a(var8, 119);
          var9 = new SceneWidget((long)var4, kh.field_s);
          var37 = new int[param2.length - 8];
          var28 = var37;
          var10 = var28;
          ii.a(param2, 0, var10, 0, param2.length - 8);
          var36 = new int[8];
          var27 = var36;
          var11 = var27;
          ii.a(param2, param2.length - 8, var36, 0, 8);
          var9.field_S = kc.a(var37, var36, 2);
          var9.field_nb = 1021128;
          var9.a(0, 2, -4 + var5 - 15, -2 + var6, -var6 + var3_int);
          var9.field_Ib = 10;
          var7.a(var9, 125);
          var12 = new SceneWidget("bin", (SceneWidget) null);
          var13 = lj.field_e[0].field_z + 3;
          var14 = 3 + lj.field_e[0].field_B;
          var12.a(0, -3 + var5 - var14, var14, -var13 + 174, var13);
          var12.field_db = lj.field_e[1];
          var12.field_sb = 2;
          var12.field_Ab = null;
          var12.field_qb = 2;
          var12.field_Pb = lj.field_e[0];
          var12.field_I = null;
          var7.a(var12, 124);
          var15 = 0;
          var38 = var11;
          var29 = var38;
          var24 = var29;
          var16_ref_int__ = var24;
          for (var17 = 0; var38.length > var17; var17++) {
            var18_int = var38[var17];
            if (0 <= var18_int) {
              var15++;
            }
          }
          if (var15 > 0) {
            var30 = new RgbSprite(20 * Math.min(var15, 4), 20 * (1 + var15 / 4));
            var15 = 0;
            var30.d();
            var17Lifetime1 = 0;
            var18_intLifetime1 = 0;
            var44 = var11;
            for (var20 = 0; var20 < var44.length; var20++) {
              var21 = var44[var20];
              if (var21 >= 0) {
                var15++;
                IsaacRandom.field_d[var21].c(var17Lifetime1, var18_intLifetime1);
                if (var15 == 4) {
                  var17Lifetime1 = 0;
                  var18_intLifetime1 += 20;
                } else {
                  var17Lifetime1 += 20;
                }
              }
            }
            sb.field_bb.b((byte) 125);
            var32 = new SceneWidget((long)var4, (SceneWidget) null);
            var32.field_Pb = var30;
            var32.a(0, 20, var30.field_B, var6, var30.field_z);
            var7.a(var32, 120);
          }
          var16 = 0;
          var45 = var10;
          for (var18_intLifetime2 = 0; var45.length > var18_intLifetime2; var18_intLifetime2++) {
            var19 = var45[var18_intLifetime2];
            if (var19 >= 0) {
              var16 = var16 + tc.field_B[var19];
            }
          }
          var17Lifetime2 = param0 ? 1 : 0;
          var41 = var11;
          var34 = var41;
          var25 = var34;
          var18 = var25;
          var26 = 0;
          var19Lifetime1 = var26;
          while (var26 < var41.length) {
            var20Lifetime1 = var41[var26];
            if (var20Lifetime1 != 34) {
              if (0 <= var20Lifetime1) {
                var16 = var16 + dn.field_Sb[var20Lifetime1];
              }
              var26++;
              continue;
            }
            var16 = 6100;
            var17Lifetime2 = 1;
            break;
          }
          var35 = new SceneWidget((long)var4, kh.field_s);
          var35.a(0, 60, -4 + (var5 - 15), var6 - 6, 6 - var6 + var12.field_Y);
          var35.field_nb = 749462;
          var35.field_Ib = 10;
          stackIn_38_0 = var35;
          stackIn_38_1 = new StringBuilder().append("<img=1>");
          if (var17Lifetime2 != 0) {
            stackIn_39_2 = "MIGHTY";
          } else {
            if (var16 <= 6100) {
              stackIn_39_2 = ej.field_C;
            } else {
              stackIn_39_2 = CachedArchiveProvider.field_z;
            }
          }
          stackIn_38_0.field_S = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).toString();
          var7.a(var35, 123);
          stackIn_40_0 = var7;
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_43_0 = var3;
          stackIn_43_1 = new StringBuilder().append("ff.AB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, lh param2, int param3) {
        try {
          this.field_jb = this.field_jb + 1;
          super.a(param0, 92, param2, param3);
          if (param1 < 56) {
            field_rb = (RgbSprite[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ff.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final String e(int param0) {
        if (param0 == 0) {
          return null;
        }
        field_ob = (int[]) null;
        return null;
    }

    ff(tl param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, eh.b(false));
        try {
          this.field_mb = param0;
          this.field_hb = param1;
          this.a(param2, (byte) -117, param3, param4, param5);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ff.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void h(int param0) {
        field_ob = null;
        field_qb = null;
        field_sb = null;
        if (param0 != -3413) {
          ff.h(119);
        }
        field_tb = null;
        field_ub = null;
        field_ib = null;
        field_gb = null;
        field_kb = null;
        field_rb = null;
        field_lb = null;
    }

    final static int a(boolean param0, long param1) {
        param1 = (6148914691236517205L & param1 >>> 1) + (param1 & 6148914691236517205L);
        param1 = (3689348814741910323L & param1 >>> 2) + (3689348814741910323L & param1);
        if (param0) {
          byte[] var4 = (byte[]) null;
          ff.a((byte) 37, (byte[]) null);
        }
        param1 = 1085102592571150095L & param1 + (param1 >>> 4);
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        param1 = param1 + (param1 >>> 32);
        return (int)(param1 & 255L);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        String var5;
        vd var6;
        eg var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        RgbSprite var14;
        RgbSprite var15;
        RgbSprite var16;
        vd var6Lifetime1;
        regionExit1: {
          regionExit2: {
            var13 = SteelSentinels.obfuscationControl;
            var6 = this.field_mb.a((byte) 21);
            if (var6 != nh.field_J &&
              var6 != ma.field_Y) {
              var5 = this.field_mb.a(true);
              if (var5 == null) {
                var5 = this.field_hb;
                break regionExit2;
              }
              if (!(var5.equals(this.field_y))) {
                this.field_y = var5;
                this.f((byte) -104);
              }
              break regionExit1;
            }
            var5 = me.field_c;
          }
          if (!var5.equals(this.field_y)) {
            this.field_y = var5;
            this.f((byte) -104);
          }
        }
        super.a(param0, (byte) -122, param2, param3);
        var6Lifetime1 = this.field_mb.a((byte) 21);
        var8 = (eg) ((Object) this.field_p);
        var9 = this.field_o + param2;
        if (param1 > -99) {
          this.field_jb = 127;
        }
        var10 = var8.a((byte) -115, (lh) (this), param0) + (var8.b(-1, (lh) (this)).a((byte) 24) >> 1);
        if (nh.field_J != var6Lifetime1 &&
          var6Lifetime1 != ma.field_Y) {
          if (ArchiveProvider.field_d == var6Lifetime1) {
            var15 = t.field_i[2];
            var15.a(var9, var10 - (var15.field_F >> 1), 256);
          } else if (vf.field_b == var6Lifetime1) {
            var16 = t.field_i[1];
            var16.a(var9, -(var16.field_F >> 1) + var10, 256);
          }
        } else {
          var14 = t.field_i[0];
          var11 = var14.field_z << 1;
          var12 = var14.field_B << 1;
          if (null != this.field_pb &&
            var11 <= this.field_pb.field_A &&
            var12 <= this.field_pb.field_F) {
            q.a(this.field_pb, (byte) -88);
            SoftwareRaster.b();
          } else {
            this.field_pb = new RgbSprite(var11, var12);
            q.a(this.field_pb, (byte) -111);
          }
          var14.a(112, 144, var14.field_z << 4, var14.field_B << 4, -this.field_jb << 10, 4096);
          tk.$cfr$intArgs$f$20d51497949f(111);
          this.field_pb.a(var9 - (var14.field_z >> 1), -var14.field_B + var10, 256);
        }
    }

    static {
        int var0 = 0;
        double var1 = 0.0;
        int var0Lifetime1;
        double var1Lifetime1;
        field_nb = 1;
        field_fb = true;
        field_gb = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_ob = new int[]{108, -1, -1, 28, -1, -1, -1, -1, -1, -1, -1};
        field_ib = new int[65536];
        field_sb = "Loading <%0>%";
        field_kb = new int[65536];
        for (var0 = 0; 65536 > var0; var0++) {
          var1 = -Math.sqrt((double)var0) + 256.0;
          field_kb[var0] = (int)(0.5 + var1 * var1);
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 65536; var0Lifetime1++) {
          var1Lifetime1 = Math.sqrt((double)var0Lifetime1);
          field_ib[var0Lifetime1] = (int)Math.floor(-(var1Lifetime1 * 9.0) + 768.5 + 0.0234375 * (double)var0Lifetime1);
        }
        field_qb = new NodeDeque();
    }
}
