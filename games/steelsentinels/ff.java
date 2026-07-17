/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ff extends ma {
    private tl field_mb;
    private wk field_pb;
    static int[] field_ub;
    static int[] field_ob;
    static int field_nb;
    static String field_gb;
    private int field_jb;
    static wk field_tb;
    static int[] field_ib;
    static boolean field_fb;
    static fh field_lb;
    private String field_hb;
    static int[] field_kb;
    static String field_sb;
    static ul field_qb;
    static wk[] field_rb;

    final boolean a(int param0, lh param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ff.E(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final static void a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var8 = SteelSentinels.field_G;
        if (vn.field_h < 0) {
          return;
        } else {
          L0: {
            if (param0 > 1) {
              break L0;
            } else {
              var9 = null;
              byte[] discarded$1 = ff.a((byte) 92, (byte[]) null);
              break L0;
            }
          }
          L1: {
            var3 = 185;
            var4 = param1 + -35;
            var5 = 256;
            if (vn.field_h >= 75) {
              break L1;
            } else {
              var5 = (vn.field_h << 8) / 75;
              break L1;
            }
          }
          L2: {
            if (vn.field_h <= 200) {
              break L2;
            } else {
              var5 = (250 + -vn.field_h << 8) / 50;
              break L2;
            }
          }
          L3: {
            q.a(ai.field_o, (byte) -106);
            lf.a();
            pb.b();
            pm.a(true);
            if (var5 >= 256) {
              break L3;
            } else {
              pb.c(0, 0, pb.field_c, pb.field_j, 0, 256 - var5);
              break L3;
            }
          }
          L4: {
            tk.f((byte) 103);
            if (150 > vn.field_h) {
              ai.field_o.b(var3, var4);
              break L4;
            } else {
              dj.field_c.b(var3 + 15, 10 + var4, var5);
              break L4;
            }
          }
          L5: {
            var6 = -125 + vn.field_h;
            if (0 >= var6) {
              break L5;
            } else {
              if (50 <= var6) {
                break L5;
              } else {
                if (var6 >= 20) {
                  if (var6 < 30) {
                    gb.field_d.a(var3, var4, 256);
                    break L5;
                  } else {
                    var7 = 256 * (-var6 + 50) / 20;
                    gb.field_d.a(var3, var4, var7);
                    break L5;
                  }
                } else {
                  var7 = 256 * var6 / 20;
                  gb.field_d.a(var3, var4, var7);
                  break L5;
                }
              }
            }
          }
          L6: {
            var6 = -140 + vn.field_h;
            if (var6 > 0) {
              L7: {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              hd.field_k.b(var3 - -15, 10 + var4, var5 * var7 >> 8);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    final static void g(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        gh[] var3_ref_gh__ = null;
        int var4 = 0;
        int var5 = 0;
        gh var5_ref_gh = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        Object var8 = null;
        fh var8_ref = null;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        String var11_ref_String = null;
        int var12 = 0;
        int var13_int = 0;
        Object var13 = null;
        int var14 = 0;
        Object var14_ref = null;
        int var15_int = 0;
        Object var15 = null;
        int var16 = 0;
        Object var16_ref = null;
        wk var16_ref_wk = null;
        int var17 = 0;
        String var17_ref_String = null;
        int var18 = 0;
        int[] var18_ref_int__ = null;
        int var19 = 0;
        int[] var19_ref_int__ = null;
        int var20 = 0;
        wk var20_ref_wk = null;
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
        qd var33 = null;
        qd var34 = null;
        qd var35 = null;
        qd var36 = null;
        String[] var37 = null;
        String var38 = null;
        String var39 = null;
        gh var40 = null;
        gh var41 = null;
        gh var42 = null;
        String var43 = null;
        StringBuilder var46 = null;
        int[] var47 = null;
        int[] var49 = null;
        String var51 = null;
        qd var52 = null;
        nk var53 = null;
        gh var54 = null;
        String var55 = null;
        String var56 = null;
        String var57 = null;
        String var58 = null;
        int[] var59 = null;
        String var60 = null;
        nk var61 = null;
        int[] var64 = null;
        int[] var66 = null;
        int[] var68 = null;
        int[] var71 = null;
        int[] var73 = null;
        int[] var75 = null;
        int[] var76 = null;
        int[] var77 = null;
        int[] var78 = null;
        int[] var79 = null;
        int[] var80 = null;
        int[] var81 = null;
        int[] var82 = null;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_336_0 = 0;
        int stackIn_355_0 = 0;
        int stackIn_404_0 = 0;
        int stackIn_412_0 = 0;
        int stackIn_471_0 = 0;
        int stackIn_502_0 = 0;
        int stackIn_502_1 = 0;
        int stackIn_503_0 = 0;
        int stackIn_503_1 = 0;
        int stackIn_504_0 = 0;
        int stackIn_504_1 = 0;
        int stackIn_504_2 = 0;
        int stackIn_507_0 = 0;
        String stackIn_683_0 = null;
        int stackIn_683_1 = 0;
        String[] stackIn_683_2 = null;
        String[] stackIn_683_3 = null;
        int stackIn_683_4 = 0;
        String stackIn_684_0 = null;
        int stackIn_684_1 = 0;
        String[] stackIn_684_2 = null;
        String[] stackIn_684_3 = null;
        int stackIn_684_4 = 0;
        String stackIn_685_0 = null;
        int stackIn_685_1 = 0;
        String[] stackIn_685_2 = null;
        String[] stackIn_685_3 = null;
        int stackIn_685_4 = 0;
        int stackIn_685_5 = 0;
        String stackIn_689_0 = null;
        int stackIn_689_1 = 0;
        String[] stackIn_689_2 = null;
        String[] stackIn_689_3 = null;
        int stackIn_689_4 = 0;
        String stackIn_690_0 = null;
        int stackIn_690_1 = 0;
        String[] stackIn_690_2 = null;
        String[] stackIn_690_3 = null;
        int stackIn_690_4 = 0;
        String stackIn_691_0 = null;
        int stackIn_691_1 = 0;
        String[] stackIn_691_2 = null;
        String[] stackIn_691_3 = null;
        int stackIn_691_4 = 0;
        int stackIn_691_5 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_335_0 = 0;
        int stackOut_334_0 = 0;
        int stackOut_354_0 = 0;
        int stackOut_353_0 = 0;
        int stackOut_402_0 = 0;
        int stackOut_403_0 = 0;
        int stackOut_410_0 = 0;
        int stackOut_411_0 = 0;
        int stackOut_469_0 = 0;
        int stackOut_470_0 = 0;
        int stackOut_501_0 = 0;
        int stackOut_501_1 = 0;
        int stackOut_503_0 = 0;
        int stackOut_503_1 = 0;
        int stackOut_503_2 = 0;
        int stackOut_502_0 = 0;
        int stackOut_502_1 = 0;
        int stackOut_502_2 = 0;
        int stackOut_505_0 = 0;
        int stackOut_506_0 = 0;
        String stackOut_688_0 = null;
        int stackOut_688_1 = 0;
        String[] stackOut_688_2 = null;
        String[] stackOut_688_3 = null;
        int stackOut_688_4 = 0;
        String stackOut_690_0 = null;
        int stackOut_690_1 = 0;
        String[] stackOut_690_2 = null;
        String[] stackOut_690_3 = null;
        int stackOut_690_4 = 0;
        int stackOut_690_5 = 0;
        String stackOut_689_0 = null;
        int stackOut_689_1 = 0;
        String[] stackOut_689_2 = null;
        String[] stackOut_689_3 = null;
        int stackOut_689_4 = 0;
        int stackOut_689_5 = 0;
        String stackOut_682_0 = null;
        int stackOut_682_1 = 0;
        String[] stackOut_682_2 = null;
        String[] stackOut_682_3 = null;
        int stackOut_682_4 = 0;
        String stackOut_684_0 = null;
        int stackOut_684_1 = 0;
        String[] stackOut_684_2 = null;
        String[] stackOut_684_3 = null;
        int stackOut_684_4 = 0;
        int stackOut_684_5 = 0;
        String stackOut_683_0 = null;
        int stackOut_683_1 = 0;
        String[] stackOut_683_2 = null;
        String[] stackOut_683_3 = null;
        int stackOut_683_4 = 0;
        int stackOut_683_5 = 0;
        L0: {
          L1: {
            var32 = SteelSentinels.field_G;
            pa.field_e = -1;
            lj.field_h = null;
            if (dc.field_g == 1) {
              break L1;
            } else {
              if (dc.field_g != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        L2: {
          L3: {
            var1_int = stackIn_5_0;
            if (kk.field_a == null) {
              break L3;
            } else {
              if (~oh.field_f > ~kk.field_a.field_Rb) {
                break L3;
              } else {
                if (oh.field_f >= kk.field_a.field_Rb - -kk.field_a.field_zb) {
                  break L3;
                } else {
                  if (~kk.field_a.field_cb < ~pi.field_c) {
                    break L3;
                  } else {
                    if (~(kk.field_a.field_Lb + kk.field_a.field_cb) >= ~pi.field_c) {
                      break L3;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L2;
                    }
                  }
                }
              }
            }
          }
          stackOut_11_0 = 0;
          stackIn_12_0 = stackOut_11_0;
          break L2;
        }
        L4: {
          var2 = stackIn_12_0;
          if (null != gd.field_jb) {
            L5: {
              L6: {
                if (null != km.field_a) {
                  break L6;
                } else {
                  if (ji.field_a == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              lg.field_l = true;
              kf.field_s = true;
              break L5;
            }
            L7: {
              if (kf.field_s) {
                break L7;
              } else {
                if (~oh.field_f > ~bl.field_c.field_Rb) {
                  break L7;
                } else {
                  if (bl.field_c.field_Rb + bl.field_c.field_zb <= oh.field_f) {
                    break L7;
                  } else {
                    if (~pi.field_c > ~bl.field_c.field_cb) {
                      break L7;
                    } else {
                      if (~pi.field_c <= ~(bl.field_c.field_cb + bl.field_c.field_Lb)) {
                        break L7;
                      } else {
                        kf.field_s = true;
                        break L7;
                      }
                    }
                  }
                }
              }
            }
            L8: {
              L9: {
                if (var2 != 0) {
                  break L9;
                } else {
                  if (fl.field_a >= 0) {
                    break L9;
                  } else {
                    if (nm.field_w < 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              lg.field_l = true;
              nl.field_X = true;
              break L8;
            }
            L10: {
              if (ad.field_h) {
                L11: {
                  kf.field_s = true;
                  sn.field_l = true;
                  nl.field_X = true;
                  if (ti.field_B != null) {
                    break L11;
                  } else {
                    if (ij.field_Y >= 0) {
                      break L11;
                    } else {
                      if (null != hm.field_a) {
                        if (fg.field_Ob != 0) {
                          if ((fg.field_Ob & 16) != 0) {
                            int discarded$44 = ak.a(hm.field_a, 83);
                            break L11;
                          } else {
                            if ((2 & fg.field_Ob) == 0) {
                              break L11;
                            } else {
                              int discarded$45 = oc.a(4, hm.field_a);
                              break L11;
                            }
                          }
                        } else {
                          vb.a(hm.field_a, (byte) 19);
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                ad.field_h = false;
                break L10;
              } else {
                break L10;
              }
            }
            L12: {
              L13: {
                if (!kf.field_s) {
                  break L13;
                } else {
                  if (lg.field_l) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              if (0 == pm.field_U) {
                var3_ref_gh__ = wc.field_h;
                var4 = 0;
                L14: while (true) {
                  if (~var3_ref_gh__.length >= ~var4) {
                    L15: {
                      if (kf.field_s) {
                        pb.a(bl.field_c.field_Rb, bl.field_c.field_cb, bl.field_c.field_zb, bl.field_c.field_Lb, 0);
                        bl.field_c.a(true, (byte) 127);
                        kf.field_s = false;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    if (!lg.field_l) {
                      break L4;
                    } else {
                      pb.a(kk.field_a.field_Rb, kk.field_a.field_cb, kk.field_a.field_zb, kk.field_a.field_Lb, 0);
                      kk.field_a.a(true, (byte) 126);
                      lg.field_l = false;
                      break L4;
                    }
                  } else {
                    var5_ref_gh = var3_ref_gh__[var4];
                    var5_ref_gh.a(true, (byte) 126);
                    var4++;
                    continue L14;
                  }
                }
              } else {
                break L12;
              }
            }
            gd.field_jb.a(true, (byte) 127);
            kf.field_s = false;
            lg.field_l = false;
            break L4;
          } else {
            break L4;
          }
        }
        L16: {
          var3 = 68;
          if (hl.field_v == null) {
            L17: {
              if (uc.field_b == null) {
                uc.field_b = ua.field_x;
                break L17;
              } else {
                break L17;
              }
            }
            hl.field_v = ji.a(uc.field_b, (byte) 109, di.field_c);
            hl.field_v.b(6993661, 83);
            break L16;
          } else {
            break L16;
          }
        }
        L18: {
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
                  break L18;
                } else {
                  if (var7 != 65) {
                    if (69 == var7) {
                      var5 += 280;
                      break L18;
                    } else {
                      if (var7 == 72) {
                        var6 -= 800;
                        var5 += 260;
                        break L18;
                      } else {
                        if (var7 == 75) {
                          var6 -= 200;
                          var4 -= 8;
                          var5 += 290;
                          break L18;
                        } else {
                          if (var7 == 79) {
                            var5 += 290;
                            break L18;
                          } else {
                            if (var7 == 84) {
                              var4 += 12;
                              var5 += 290;
                              break L18;
                            } else {
                              if (var7 != 88) {
                                if (var7 != 92) {
                                  break L18;
                                } else {
                                  var5 += 290;
                                  var6 -= 1300;
                                  break L18;
                                }
                              } else {
                                var6 -= 400;
                                var4 += 25;
                                var5 += 290;
                                break L18;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var5 += 290;
                    break L18;
                  }
                }
              } else {
                var5 += 280;
                break L18;
              }
            } else {
              var5 += 280;
              break L18;
            }
          } else {
            var5 += 280;
            break L18;
          }
        }
        L19: {
          hj.field_w = var6;
          var7 = 0;
          var8_int = 66 - -(qa.field_M * 26 / 57);
          var9 = 114 * qa.field_M / 57 + 510;
          pb.g(226, var8_int, 26, 3355443);
          pb.d(226, var8_int, 26, 3355443);
          pb.g(var9 + -26, var8_int, 26, 3355443);
          pb.d(var9, var8_int, 26, 3355443);
          pb.g(226, 360, 26, 3355443);
          pb.d(226, 334, 26, 3355443);
          pb.g(var9 - 26, 360, 26, 3355443);
          pb.d(var9, 334, 26, 3355443);
          if (null == hl.field_v) {
            break L19;
          } else {
            if (null == gd.field_jb) {
              break L19;
            } else {
              L20: {
                vh.field_a = var5;
                b.field_c = var4 + qa.field_M;
                ti.field_y = vh.field_a;
                en.field_d = b.field_c;
                lh.field_t = vh.field_a;
                nj.field_V = b.field_c;
                pb.a(221, 60, 629, 432);
                if (var1_int != 0) {
                  break L20;
                } else {
                  L21: {
                    var8 = null;
                    if (hl.field_v.field_N == 69) {
                      var33 = hl.field_v.a(0, 2);
                      if (var33 == null) {
                        break L21;
                      } else {
                        if (null != var33.field_d) {
                          vk.field_r.a(var4 - -qa.field_M - -40, var5 - 135);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (hl.field_v.field_N != 75) {
                      break L22;
                    } else {
                      var34 = hl.field_v.a(0, 2);
                      if (var34 == null) {
                        break L22;
                      } else {
                        if (null == var34.field_d) {
                          break L22;
                        } else {
                          vk.field_r.a(4 + qa.field_M + var4, -178 + var5);
                          if (var34.field_d.field_N != 95) {
                            break L22;
                          } else {
                            vk.field_r.a(var4 + qa.field_M + 10, -175 + var5);
                            break L22;
                          }
                        }
                      }
                    }
                  }
                  L23: {
                    if (hl.field_v.field_N != 57) {
                      break L23;
                    } else {
                      var35 = hl.field_v.a(0, 2);
                      if (var35 == null) {
                        break L23;
                      } else {
                        if (null == var35.field_d) {
                          break L23;
                        } else {
                          vk.field_r.a(-3 + qa.field_M + var4, var5 - 156);
                          break L23;
                        }
                      }
                    }
                  }
                  L24: {
                    if (55 == hl.field_v.field_N) {
                      var36 = hl.field_v.a(0, 2);
                      if (var36 == null) {
                        break L24;
                      } else {
                        if (var36.field_d == null) {
                          break L24;
                        } else {
                          if (var36.field_d.field_N != 95) {
                            break L24;
                          } else {
                            vk.field_r.e(35 + qa.field_M + var4, var5 - 130);
                            break L24;
                          }
                        }
                      }
                    } else {
                      break L24;
                    }
                  }
                  hl.field_v.a(0, true, b.field_c, vh.field_a, (byte) 49, 0);
                  break L20;
                }
              }
              L25: {
                pb.c();
                if (qa.field_M != 57) {
                  break L25;
                } else {
                  if (var1_int == 0) {
                    L26: {
                      var8_int = lh.field_t;
                      if (hl.field_v.field_N == 84) {
                        var8_int -= 50;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    pb.d(308, ti.field_y, var8_int - ti.field_y, 3355443);
                    pb.g(308, ti.field_y, 8, 3355443);
                    pb.g(308, var8_int, 8, 3355443);
                    var9 = (var8_int + -ti.field_y) * 2000 / hj.field_w;
                    fk.field_d.c(db.a(de.field_e, -123, new String[2]), 307, (ti.field_y - -var8_int) / 2, 4473924, -1);
                    break L25;
                  } else {
                    break L25;
                  }
                }
              }
              L27: {
                var8_int = -qa.field_M + 657;
                if (var8_int >= 640) {
                  break L27;
                } else {
                  if (var1_int != 0) {
                    break L27;
                  } else {
                    var9 = Math.min(365, lh.field_t);
                    var10 = 18 * hj.field_w / 2000;
                    vk.field_q.c(var8_int, -8 + var9 - var10, 7 * hj.field_w / 2000, var10);
                    if (qa.field_M != 57) {
                      break L27;
                    } else {
                      pb.d(-10 + var8_int, -8 + (var9 - var10), var10, 3355443);
                      pb.g(var8_int + -10, -var10 + var9 - 8, 8, 3355443);
                      pb.g(var8_int - 10, -8 + var9, 8, 3355443);
                      var11_ref_String = db.a(de.field_e, -60, new String[2]);
                      fk.field_d.c(var11_ref_String, var8_int - 12, -8 + var9 - var10 / 2 - -3, 4473924, -1);
                      break L27;
                    }
                  }
                }
              }
              L28: {
                hj.field_w = var6;
                if (li.field_v <= 0) {
                  break L28;
                } else {
                  var9 = 154;
                  var10 = 16;
                  var11 = 640 - var9 - 16;
                  var12 = 378;
                  var13_int = 1000;
                  var14 = li.field_v;
                  var15_int = var14 * var9 / var13_int;
                  pb.a(var11, var12, var15_int, -1 + var10, 2061990);
                  var16 = 100;
                  L29: while (true) {
                    if (var13_int <= var16) {
                      pb.h(-2 + var11, -2 + var12, 4 + var9, 4 + var10, 4408131);
                      fk.field_d.c(jb.field_E + var14, var11 - -var9, -4 + var12, 16777215, -1);
                      break L28;
                    } else {
                      var17 = var11 + var16 * var9 / var13_int;
                      pb.d(var17, var12, var10, 0);
                      var16 += 100;
                      continue L29;
                    }
                  }
                }
              }
              L30: {
                var9 = 0;
                var10 = 0;
                var7 = hl.field_v.e((byte) -85);
                var11 = 0;
                var12 = (int)((double)hl.field_v.h(-31496) / Math.sqrt((double)hl.field_v.g(8192)));
                var13_int = (int)((double)hl.field_v.j(0) / Math.sqrt((double)hl.field_v.g(8192)));
                if (var12 < 0) {
                  var12 = 0;
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                if (var13_int < 0) {
                  var13_int = 0;
                  break L31;
                } else {
                  break L31;
                }
              }
              var14 = 0;
              var15_int = 0;
              var16 = 0;
              var17 = 0;
              L32: while (true) {
                if (~var17 <= ~hl.field_v.i(-117)) {
                  L33: {
                    if (var14 == 0) {
                      break L33;
                    } else {
                      var12 = 17 * var12 / 10;
                      break L33;
                    }
                  }
                  L34: {
                    if (var16 == 0) {
                      break L34;
                    } else {
                      var10 += 15;
                      var9 += 3800;
                      var11 += 25;
                      var7 = 6100;
                      break L34;
                    }
                  }
                  L35: {
                    if (var15_int != 0) {
                      var13_int = 17 * var13_int / 10;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    var12 -= 5;
                    if (null == hl.field_v.a(59, (byte) -103)) {
                      break L36;
                    } else {
                      var12 += 5;
                      break L36;
                    }
                  }
                  L37: {
                    if (var12 >= 0) {
                      break L37;
                    } else {
                      var12 = 0;
                      break L37;
                    }
                  }
                  L38: {
                    var10 += 2;
                    var11++;
                    if (var12 > 20) {
                      var12 = 20;
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                  L39: {
                    ei.field_t = var10;
                    if (var1_int == 0) {
                      L40: {
                        var37 = new String[]{"<img=0>", "<img=5>", "<img=4>", "<img=7>", "<img=2>", "<img=3>"};
                        var18_ref_int__ = new int[]{0, 0, 0, 0, 0, 0};
                        var19_ref_int__ = new int[]{1000, 1000, 10, 11, 10, 20};
                        var18_ref_int__[0] = hl.field_v.g(8192);
                        var18_ref_int__[4] = var12;
                        var18_ref_int__[3] = var11;
                        if (var16 == 0) {
                          break L40;
                        } else {
                          var18_ref_int__[0] = var18_ref_int__[0] * 2;
                          break L40;
                        }
                      }
                      var18_ref_int__[2] = var10;
                      var18_ref_int__[1] = var9;
                      var18_ref_int__[5] = var13_int;
                      var20 = 220;
                      var21 = 394;
                      var22 = 100;
                      var23 = 0;
                      L41: while (true) {
                        if (var23 >= 6) {
                          break L39;
                        } else {
                          L42: {
                            L43: {
                              fk.field_d.b(var37[var23], var20, var21, 0, -1);
                              if (~oh.field_f > ~var20) {
                                break L43;
                              } else {
                                if (~oh.field_f <= ~(18 + var20 - -var22)) {
                                  break L43;
                                } else {
                                  if (~pi.field_c > ~(var21 + -10)) {
                                    break L43;
                                  } else {
                                    if (~(1 + var21) >= ~pi.field_c) {
                                      break L43;
                                    } else {
                                      stackOut_216_0 = 1;
                                      stackIn_218_0 = stackOut_216_0;
                                      break L42;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_217_0 = 0;
                            stackIn_218_0 = stackOut_217_0;
                            break L42;
                          }
                          L44: {
                            var24_int = stackIn_218_0;
                            pb.h(var20 + 18, var21 - 10, var22, 11, 1400960);
                            if (~var18_ref_int__[var23] >= ~(var19_ref_int__[var23] * 2)) {
                              if (~var18_ref_int__[var23] < ~var19_ref_int__[var23]) {
                                pb.a(18 + var20 + 2, 2 + (var21 + -10), -4 + var22, 7, 8421504);
                                pb.a(2 + (var20 + 18), var21 - 8, (var18_ref_int__[var23] + -var19_ref_int__[var23]) * (-4 + var22) / var19_ref_int__[var23], 7, 16777215);
                                break L44;
                              } else {
                                if (var18_ref_int__[var23] > 0) {
                                  pb.a(var20 + 20, -10 + (var21 - -2), var18_ref_int__[var23] * (-4 + var22) / var19_ref_int__[var23], 7, 8421504);
                                  break L44;
                                } else {
                                  pb.h(var20 + 18, var21 - 10, var22, 11, 8400933);
                                  break L44;
                                }
                              }
                            } else {
                              pb.a(2 + var20 - -18, 2 + var21 - 10, var22 - 4, 7, 16777215);
                              break L44;
                            }
                          }
                          L45: {
                            if (var23 <= 1) {
                              var25 = 100;
                              L46: while (true) {
                                if (~var19_ref_int__[var23] >= ~var25) {
                                  break L45;
                                } else {
                                  pb.f(var25 * (-4 + var22) / var19_ref_int__[var23] + var20 + 20, 2 + var21 + -10, 7, 4473924, 192);
                                  var25 += 100;
                                  continue L46;
                                }
                              }
                            } else {
                              if (var23 == 2) {
                                var25 = 1;
                                L47: while (true) {
                                  if (var19_ref_int__[var23] <= var25) {
                                    break L45;
                                  } else {
                                    pb.f(20 + var20 + (var22 + -4) * var25 / var19_ref_int__[var23], var21 - 8, 7, 4473924, 192);
                                    var25++;
                                    continue L47;
                                  }
                                }
                              } else {
                                break L45;
                              }
                            }
                          }
                          L48: {
                            if (var24_int != 0) {
                              L49: {
                                var25 = 18 + var20 + var22 / 2;
                                var26 = 12;
                                var27 = -var26 + 382;
                                var28_ref = null;
                                var29_ref = null;
                                var30 = var18_ref_int__[var23];
                                var31 = var23;
                                if (var31 == 3) {
                                  var30 = var30 * 50 / 3;
                                  break L49;
                                } else {
                                  if (var31 == 4) {
                                    var30 = var30 * 100 / 10;
                                    break L49;
                                  } else {
                                    if (5 != var31) {
                                      break L49;
                                    } else {
                                      var30 = 100 * var30 / 20;
                                      break L49;
                                    }
                                  }
                                }
                              }
                              L50: {
                                var38 = jj.field_h[var23 * 2];
                                var29_ref_String = db.a(jj.field_h[2 * var23 + 1], -124, new String[1]);
                                if (var18_ref_int__[var23] == 0) {
                                  var29_ref_String = ej.field_E;
                                  break L50;
                                } else {
                                  break L50;
                                }
                              }
                              var39 = var38 + ": " + var29_ref_String;
                              var31 = fk.field_d.c(var39) - -8;
                              var25 = var25 - var31 / 2;
                              pb.c(var25, var27, var31, var26, 0, 192);
                              pb.h(var25, var27, var31, var26, 1400960, 192);
                              fk.field_d.b(var39, 4 + var25, var27 - -10, 41727, -1);
                              break L48;
                            } else {
                              break L48;
                            }
                          }
                          L51: {
                            if (0 == var23 % 2) {
                              var20 += 120;
                              break L51;
                            } else {
                              var20 -= 120;
                              var21 += 15;
                              break L51;
                            }
                          }
                          var23++;
                          continue L41;
                        }
                      }
                    } else {
                      break L39;
                    }
                  }
                  if (fg.field_Ob == 1) {
                    break L19;
                  } else {
                    if (0 < (fg.field_Ob & 2)) {
                      var42 = hm.field_a;
                      if (var42 == null) {
                        break L19;
                      } else {
                        L52: {
                          if (lg.field_l) {
                            break L52;
                          } else {
                            if (var2 != 0) {
                              break L52;
                            } else {
                              if (!nl.field_X) {
                                break L19;
                              } else {
                                break L52;
                              }
                            }
                          }
                        }
                        int discarded$46 = oc.a(4, var42);
                        lg.field_l = true;
                        break L19;
                      }
                    } else {
                      if ((fg.field_Ob & 16) > 0) {
                        L53: {
                          var41 = hm.field_a;
                          if (var41 == null) {
                            break L53;
                          } else {
                            L54: {
                              if (lg.field_l) {
                                break L54;
                              } else {
                                if (var2 != 0) {
                                  break L54;
                                } else {
                                  if (nl.field_X) {
                                    break L54;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            int discarded$47 = ak.a(var41, 87);
                            lg.field_l = true;
                            break L53;
                          }
                        }
                        break L19;
                      } else {
                        if (fg.field_Ob == 0) {
                          L55: {
                            var40 = kk.field_a;
                            if (var40 == null) {
                              break L55;
                            } else {
                              L56: {
                                if (lg.field_l) {
                                  break L56;
                                } else {
                                  if (var2 != 0) {
                                    break L56;
                                  } else {
                                    if (nl.field_X) {
                                      break L56;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              vb.a(var40, (byte) 19);
                              lg.field_l = true;
                              break L55;
                            }
                          }
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                } else {
                  L57: {
                    var18 = di.field_c[var17];
                    if (var18 != 0) {
                      if (var18 != 1) {
                        if (var18 == 2) {
                          var11 += 3;
                          break L57;
                        } else {
                          if (var18 == 3) {
                            var11 += 4;
                            break L57;
                          } else {
                            if (var18 == 4) {
                              var11 += 5;
                              break L57;
                            } else {
                              if (var18 != 20) {
                                if (var18 != 5) {
                                  if (var18 == 6) {
                                    var10 += 2;
                                    break L57;
                                  } else {
                                    if (var18 == 7) {
                                      var10 += 3;
                                      break L57;
                                    } else {
                                      if (var18 == 8) {
                                        var10 += 4;
                                        break L57;
                                      } else {
                                        if (var18 != 9) {
                                          if (var18 == 10) {
                                            var9 += 100;
                                            break L57;
                                          } else {
                                            if (var18 != 11) {
                                              if (var18 != 12) {
                                                if (var18 == 13) {
                                                  var9 += 1000;
                                                  break L57;
                                                } else {
                                                  if (14 != var18) {
                                                    if (var18 != 28) {
                                                      if (29 == var18) {
                                                        var15_int = 1;
                                                        break L57;
                                                      } else {
                                                        if (var18 == 34) {
                                                          var16 = 1;
                                                          var14 = 1;
                                                          var15_int = 1;
                                                          break L57;
                                                        } else {
                                                          break L57;
                                                        }
                                                      }
                                                    } else {
                                                      var14 = 1;
                                                      break L57;
                                                    }
                                                  } else {
                                                    var9 += 2000;
                                                    break L57;
                                                  }
                                                }
                                              } else {
                                                var9 += 500;
                                                break L57;
                                              }
                                            } else {
                                              var9 += 200;
                                              break L57;
                                            }
                                          }
                                        } else {
                                          var10 += 5;
                                          break L57;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var10++;
                                  break L57;
                                }
                              } else {
                                var11 += 10;
                                break L57;
                              }
                            }
                          }
                        }
                      } else {
                        var11 += 2;
                        break L57;
                      }
                    } else {
                      var11++;
                      break L57;
                    }
                  }
                  L58: {
                    if (di.field_c[var17] == -1) {
                      break L58;
                    } else {
                      var7 = var7 + dn.field_Sb[di.field_c[var17]];
                      break L58;
                    }
                  }
                  var17++;
                  continue L32;
                }
              }
            }
          }
        }
        L59: {
          if (1 == dc.field_g) {
            break L59;
          } else {
            if (dc.field_g == 0) {
              break L59;
            } else {
              m.a(12, 140, 7786, 484, var7, 412);
              break L59;
            }
          }
        }
        L60: {
          if (ti.field_B == null) {
            break L60;
          } else {
            if (oh.field_f >= 0) {
              L61: {
                if (f.field_A != null) {
                  f.field_A.a(0, false, oh.field_f, pi.field_c, (byte) 49, 8192);
                  break L61;
                } else {
                  break L61;
                }
              }
              ti.field_B.a(0, false, oh.field_f, pi.field_c, (byte) 49, 16384);
              break L60;
            } else {
              break L60;
            }
          }
        }
        L62: {
          if (ij.field_Y == -1) {
            break L62;
          } else {
            if (oh.field_f >= 0) {
              ie.field_d[ij.field_Y].a(oh.field_f - 20, pi.field_c + -20);
              break L62;
            } else {
              break L62;
            }
          }
        }
        L63: {
          if (0 == (fg.field_Ob & 1)) {
            re.field_eb = -1;
            break L63;
          } else {
            L64: {
              var8_int = 224;
              var9 = 62;
              var10 = 401;
              var11 = 20;
              var12 = 60;
              var13_int = ul.a((byte) -42, uc.field_b[0]);
              if (~re.field_eb != ~var13_int) {
                L65: {
                  L66: {
                    re.field_eb = var13_int;
                    s.field_a = a.field_c;
                    var14 = 20;
                    jj.field_e.d();
                    pb.a(0, 0, jj.field_e.field_z, jj.field_e.field_B, 0);
                    pb.a(0, 0, var14, var14);
                    if (0 > var13_int) {
                      break L66;
                    } else {
                      if (var13_int >= si.field_E.length) {
                        break L66;
                      } else {
                        break L65;
                      }
                    }
                  }
                  var13_int = 0;
                  break L65;
                }
                si.field_E[var13_int].c(0, 0, 4 * var14, 4 * var14);
                pb.c();
                sb.field_bb.b((byte) 122);
                break L64;
              } else {
                break L64;
              }
            }
            L67: {
              if (0 > var13_int) {
                break L67;
              } else {
                if (~ig.field_g.length >= ~var13_int) {
                  break L67;
                } else {
                  if (var1_int != 0) {
                    break L67;
                  } else {
                    L68: {
                      pb.c(var8_int, var9, var10, var11, 0, 150);
                      pb.h(var8_int, var9, var10, var11, 1397105);
                      var43 = ig.field_g[var13_int];
                      pb.a(var8_int - -1, 1 + var9, var10 + (var8_int + -1), var9 - (-var11 - -1));
                      var15_int = fk.field_d.c(var43);
                      var16 = a.field_c - s.field_a;
                      if (~var16 >= ~(var10 + (var15_int + var12))) {
                        break L68;
                      } else {
                        var16 = var10 + (-var10 + var16) % (var15_int - -var12);
                        break L68;
                      }
                    }
                    var17 = (var12 + 14) / 2 + -var16 + (var10 + var8_int);
                    L69: while (true) {
                      if (~(var17 - var12 + -14) <= ~(var8_int - -var10)) {
                        pb.c();
                        break L67;
                      } else {
                        fk.field_d.b(var43, var17, -6 + (var11 + var9), 11119017, -1);
                        var17 = var17 + (var15_int - -var12);
                        continue L69;
                      }
                    }
                  }
                }
              }
            }
            break L63;
          }
        }
        L70: {
          var8_ref = fk.field_d;
          if (dc.field_g == 15) {
            pa.field_d[dc.field_g].b(-40);
            break L70;
          } else {
            break L70;
          }
        }
        L71: {
          if (fg.field_Ob != 1) {
            break L71;
          } else {
            if (0 > t.field_h) {
              break L71;
            } else {
              if (!df.field_K) {
                break L71;
              } else {
                L72: {
                  if (dc.field_g < 0) {
                    break L72;
                  } else {
                    if (pa.field_d[dc.field_g].a(t.field_h, -118)) {
                      break L72;
                    } else {
                      break L71;
                    }
                  }
                }
                var78 = ne.a(t.field_h, (byte) 28);
                var71 = var78;
                var64 = var71;
                var47 = var64;
                var9_ref_int__ = var47;
                var80 = ki.b(t.field_h, (byte) -81);
                var73 = var80;
                var66 = var73;
                var49 = var66;
                var10_ref_int__ = var49;
                var11 = 0;
                var12 = 0;
                var76 = var9_ref_int__;
                var14 = 0;
                L73: while (true) {
                  if (var14 >= var76.length) {
                    var77 = var10_ref_int__;
                    var14 = 0;
                    L74: while (true) {
                      if (var77.length <= var14) {
                        L75: {
                          var46 = new StringBuilder("<col=ffffff>");
                          StringBuilder discarded$48 = var46.append(t.field_e[t.field_h]);
                          StringBuilder discarded$49 = var46.append("</col> <col=0080ff>");
                          var14 = var11 + -var12;
                          var12 = var12 * 100 / var11;
                          StringBuilder discarded$50 = var46.append(Integer.toString(var12));
                          StringBuilder discarded$51 = var46.append(mm.field_c);
                          StringBuilder discarded$52 = var46.append("</col>");
                          StringBuilder discarded$53 = var46.append(qm.field_e);
                          if (var78.length > 0) {
                            StringBuilder discarded$54 = var46.append(v.field_c);
                            var79 = var9_ref_int__;
                            var16 = 0;
                            L76: while (true) {
                              if (var16 >= var79.length) {
                                if (0 < var80.length) {
                                  StringBuilder discarded$55 = var46.append(re.field_X);
                                  break L75;
                                } else {
                                  break L75;
                                }
                              } else {
                                L77: {
                                  var17 = var79[var16];
                                  StringBuilder discarded$56 = var46.append("<br>  ");
                                  if (!t.a(rn.field_D, var17, -20370)) {
                                    stackOut_335_0 = 0;
                                    stackIn_336_0 = stackOut_335_0;
                                    break L77;
                                  } else {
                                    stackOut_334_0 = 1;
                                    stackIn_336_0 = stackOut_334_0;
                                    break L77;
                                  }
                                }
                                L78: {
                                  var18 = stackIn_336_0;
                                  if (var18 == 0) {
                                    StringBuilder discarded$57 = var46.append("<col=808080>");
                                    break L78;
                                  } else {
                                    StringBuilder discarded$58 = var46.append("<col=0080ff>");
                                    break L78;
                                  }
                                }
                                L79: {
                                  StringBuilder discarded$59 = var46.append(t.field_e[var17]);
                                  StringBuilder discarded$60 = var46.append("</col>");
                                  if (var18 == 0) {
                                    StringBuilder discarded$61 = var46.append(" (<img=24>");
                                    StringBuilder discarded$62 = var46.append(sj.field_v[var17]);
                                    StringBuilder discarded$63 = var46.append(")");
                                    break L79;
                                  } else {
                                    break L79;
                                  }
                                }
                                var16++;
                                continue L76;
                              }
                            }
                          } else {
                            break L75;
                          }
                        }
                        L80: {
                          if (var80.length <= 0) {
                            break L80;
                          } else {
                            L81: {
                              if (var80.length != 1) {
                                StringBuilder discarded$64 = var46.append(dk.field_i);
                                break L81;
                              } else {
                                StringBuilder discarded$65 = var46.append(ed.field_g);
                                break L81;
                              }
                            }
                            var81 = var10_ref_int__;
                            var16 = 0;
                            L82: while (true) {
                              if (~var16 <= ~var81.length) {
                                break L80;
                              } else {
                                L83: {
                                  var17 = var81[var16];
                                  StringBuilder discarded$66 = var46.append("<br>  ");
                                  if (!t.a(fe.field_D, var17, -20370)) {
                                    stackOut_354_0 = 0;
                                    stackIn_355_0 = stackOut_354_0;
                                    break L83;
                                  } else {
                                    stackOut_353_0 = 1;
                                    stackIn_355_0 = stackOut_353_0;
                                    break L83;
                                  }
                                }
                                L84: {
                                  var18 = stackIn_355_0;
                                  if (var18 == 0) {
                                    StringBuilder discarded$67 = var46.append("<col=808080>");
                                    break L84;
                                  } else {
                                    StringBuilder discarded$68 = var46.append("<col=0080ff>");
                                    break L84;
                                  }
                                }
                                L85: {
                                  if (34 == var17) {
                                    StringBuilder discarded$69 = var46.append("GODULE");
                                    break L85;
                                  } else {
                                    StringBuilder discarded$70 = var46.append(rj.field_m[var17]);
                                    break L85;
                                  }
                                }
                                L86: {
                                  StringBuilder discarded$71 = var46.append("</col>");
                                  if (var18 != 0) {
                                    break L86;
                                  } else {
                                    StringBuilder discarded$72 = var46.append(" (<img=24>");
                                    StringBuilder discarded$73 = var46.append(qf.field_h[var17]);
                                    StringBuilder discarded$74 = var46.append(")");
                                    break L86;
                                  }
                                }
                                var16++;
                                continue L82;
                              }
                            }
                          }
                        }
                        L87: {
                          if (~li.field_v > ~var14) {
                            StringBuilder discarded$75 = var46.append("<br><br><col=ff2020>");
                            StringBuilder discarded$76 = var46.append(mm.field_f);
                            StringBuilder discarded$77 = var46.append("<img=22>");
                            break L87;
                          } else {
                            StringBuilder discarded$78 = var46.append("<br><br><col=00ff00>");
                            StringBuilder discarded$79 = var46.append(mm.field_f);
                            StringBuilder discarded$80 = var46.append("<img=21>");
                            break L87;
                          }
                        }
                        StringBuilder discarded$81 = var46.append(var14);
                        StringBuilder discarded$82 = var46.append("</col>");
                        var51 = var46.toString();
                        var16 = 250;
                        var17 = ((mi) (Object) var8_ref).field_G - -((mi) (Object) var8_ref).field_F;
                        var18 = 5 + (5 + ((mi) (Object) var8_ref).a(var51, -20 + var16, var17));
                        var19 = 228;
                        var20 = 16777215;
                        var21 = -var18 + 378;
                        pb.c(var19, var21, var16, var18, 0, 200);
                        pb.h(var19, var21, var16, var18, var20);
                        int discarded$83 = ((mi) (Object) var8_ref).a(var51, 10 + var19, 5 + var21, -20 + var16, var18, 8421504, 0, 0, 0, var17);
                        break L71;
                      } else {
                        L88: {
                          var15_int = var77[var14];
                          var16 = qf.field_h[var15_int];
                          var11 = var11 + var16;
                          if (!t.a(fe.field_D, var15_int, -20370)) {
                            break L88;
                          } else {
                            var12 = var12 + var16;
                            break L88;
                          }
                        }
                        var14++;
                        continue L74;
                      }
                    }
                  } else {
                    L89: {
                      var15_int = var76[var14];
                      var16 = sj.field_v[var15_int];
                      if (t.a(rn.field_D, var15_int, -20370)) {
                        var12 = var12 + var16;
                        break L89;
                      } else {
                        break L89;
                      }
                    }
                    var11 = var11 + var16;
                    var14++;
                    continue L73;
                  }
                }
              }
            }
          }
        }
        L90: {
          L91: {
            var9 = -1;
            var10 = -1;
            var11 = -1;
            if (0 == fg.field_Ob) {
              break L91;
            } else {
              if ((18 & fg.field_Ob) != 0) {
                break L91;
              } else {
                break L90;
              }
            }
          }
          L92: {
            if (0 <= pa.field_e) {
              var9 = di.field_c[pa.field_e];
              break L92;
            } else {
              break L92;
            }
          }
          L93: {
            if (t.field_h >= 0) {
              var9 = t.field_h;
              break L93;
            } else {
              break L93;
            }
          }
          if (pa.field_e < 0) {
            break L90;
          } else {
            if (var9 < 0) {
              var10 = pa.field_e;
              break L90;
            } else {
              break L90;
            }
          }
        }
        L94: {
          var12 = -1;
          if ((fg.field_Ob & 18) == 0) {
            break L94;
          } else {
            if (var9 >= 0) {
              break L94;
            } else {
              if (null == lj.field_h) {
                break L94;
              } else {
                L95: {
                  if (lj.field_h.field_d != null) {
                    var9 = lj.field_h.field_d.field_N;
                    var53 = lj.field_h.field_d;
                    var11 = var53.field_K;
                    var12 = var53.field_W;
                    break L95;
                  } else {
                    var10 = lj.field_h.field_q;
                    var52 = lj.field_h;
                    var12 = var52.field_j;
                    var11 = var52.field_m;
                    break L95;
                  }
                }
                L96: {
                  if ((fg.field_Ob & 16) == 0) {
                    break L96;
                  } else {
                    if (83 == var9) {
                      break L96;
                    } else {
                      L97: {
                        if (var10 < 0) {
                          break L97;
                        } else {
                          var11 -= 1024;
                          var12 += 1024;
                          break L97;
                        }
                      }
                      var11 += 1365;
                      var11 = var11 - var11 % 2730;
                      var12 += 1365;
                      var12 = var12 - var12 % 2731;
                      var11 -= 16384;
                      var12 -= 16384;
                      break L94;
                    }
                  }
                }
                var11 = -1;
                var12 = -1;
                break L94;
              }
            }
          }
        }
        L98: {
          if ((fg.field_Ob & 1) != 0) {
            var13_int = oe.field_i;
            oe.field_i = -1;
            var14 = 0;
            L99: while (true) {
              if (var14 >= 12) {
                sb.field_bb.b((byte) 124);
                break L98;
              } else {
                L100: {
                  var54 = jg.field_h[var14];
                  if (var54 == null) {
                    break L100;
                  } else {
                    L101: {
                      L102: {
                        L103: {
                          if (ni.b(63)) {
                            break L103;
                          } else {
                            if (rd.field_b > 0) {
                              break L102;
                            } else {
                              break L103;
                            }
                          }
                        }
                        if (!oc.a(n.field_z[var14], -120, false)) {
                          break L102;
                        } else {
                          stackOut_402_0 = 1;
                          stackIn_404_0 = stackOut_402_0;
                          break L101;
                        }
                      }
                      stackOut_403_0 = 0;
                      stackIn_404_0 = stackOut_403_0;
                      break L101;
                    }
                    var16 = stackIn_404_0;
                    if (var16 != 0) {
                      break L100;
                    } else {
                      if (!t.a(rn.field_D, n.field_z[var14], -20370)) {
                        break L100;
                      } else {
                        L104: {
                          L105: {
                            if (~oh.field_f > ~var54.field_Rb) {
                              break L105;
                            } else {
                              if (oh.field_f >= 190) {
                                break L105;
                              } else {
                                if (var54.field_cb > pi.field_c) {
                                  break L105;
                                } else {
                                  if (pi.field_c >= var54.field_cb + var54.field_Lb) {
                                    break L105;
                                  } else {
                                    stackOut_410_0 = 1;
                                    stackIn_412_0 = stackOut_410_0;
                                    break L104;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_411_0 = 0;
                          stackIn_412_0 = stackOut_411_0;
                          break L104;
                        }
                        L106: {
                          var17 = stackIn_412_0;
                          var18 = 0;
                          if (var17 == 0) {
                            break L106;
                          } else {
                            L107: {
                              oe.field_i = var14;
                              if (var13_int == oe.field_i) {
                                break L107;
                              } else {
                                nc.field_f = a.field_c;
                                ee.c(-2483, 97);
                                break L107;
                              }
                            }
                            var18 = (-nc.field_f + a.field_c) / 6 % 15;
                            break L106;
                          }
                        }
                        var19 = 64;
                        var54.field_Pb.d();
                        pb.a(0, 0, var19, var19, 0);
                        pb.a(0, 0, var19, var19);
                        var20_ref_wk = si.field_E[var14];
                        var16_ref_wk = var20_ref_wk;
                        var16_ref_wk = var20_ref_wk;
                        var21 = (var18 & 3) * var19;
                        var22 = (var18 >> 2) * var19;
                        var20_ref_wk.a(-var21, -var22);
                        break L100;
                      }
                    }
                  }
                }
                var14++;
                continue L99;
              }
            }
          } else {
            oe.field_i = -1;
            break L98;
          }
        }
        L108: {
          if (0 <= dc.field_g) {
            L109: {
              var13_int = -1;
              if (var9 >= 0) {
                var13_int = var9;
                break L109;
              } else {
                if (0 > var10) {
                  break L109;
                } else {
                  var13_int = var10;
                  break L109;
                }
              }
            }
            if (0 > var13_int) {
              break L108;
            } else {
              if (pa.field_d[dc.field_g].a(var13_int, -111)) {
                break L108;
              } else {
                var10 = -1;
                var9 = -1;
                break L108;
              }
            }
          } else {
            break L108;
          }
        }
        L110: {
          L111: {
            if (var10 < 0) {
              break L111;
            } else {
              if (fg.field_Ob == 0) {
                L112: {
                  if (nm.field_w == var10) {
                    break L112;
                  } else {
                    ee.c(-2483, 97);
                    nm.field_w = var10;
                    lg.field_l = true;
                    break L112;
                  }
                }
                var10 = -1;
                break L110;
              } else {
                break L111;
              }
            }
          }
          L113: {
            if (-2 != pa.field_e) {
              break L113;
            } else {
              if (fg.field_Ob == 0) {
                if (nm.field_w != -2) {
                  lg.field_l = true;
                  nm.field_w = -2;
                  ee.c(-2483, 97);
                  break L110;
                } else {
                  break L110;
                }
              } else {
                break L113;
              }
            }
          }
          L114: {
            if (0 <= var9) {
              break L114;
            } else {
              if (var10 < 0) {
                if (nm.field_w != -1) {
                  nm.field_w = -1;
                  lg.field_l = true;
                  break L110;
                } else {
                  break L110;
                }
              } else {
                break L114;
              }
            }
          }
          L115: {
            var13 = null;
            var14_ref = null;
            var15 = null;
            var16_ref_wk = null;
            if (0 > var10) {
              if (0 != fg.field_Ob) {
                if ((18 & fg.field_Ob) == 0) {
                  break L115;
                } else {
                  L116: {
                    if (~nm.field_w == ~var9) {
                      break L116;
                    } else {
                      ee.c(-2483, 97);
                      nm.field_w = var9;
                      lg.field_l = true;
                      break L116;
                    }
                  }
                  L117: {
                    L118: {
                      var13 = (Object) (Object) t.field_e[var9];
                      var14_ref = var13;
                      var14_ref = var13;
                      if (var9 < 17) {
                        break L118;
                      } else {
                        if (~var9 <= ~(17 + uh.field_i.length)) {
                          break L118;
                        } else {
                          L119: {
                            var56 = db.field_g[-17 + var9];
                            var14_ref = (Object) (Object) var56;
                            var17 = ja.a(var9, false);
                            if (var17 < 0) {
                              break L119;
                            } else {
                              if (var17 >= li.field_B.length) {
                                break L119;
                              } else {
                                var15 = (Object) (Object) db.a(im.field_c, -117, new String[1]);
                                var14_ref = var15;
                                var14_ref = var15;
                                var16_ref_wk = hb.field_j[var17];
                                break L119;
                              }
                            }
                          }
                          L120: {
                            if (!bi.b(-90, var9)) {
                              break L120;
                            } else {
                              L121: {
                                L122: {
                                  if (var14_ref == null) {
                                    break L122;
                                  } else {
                                    if (var56.length() <= 0) {
                                      break L122;
                                    } else {
                                      var14_ref = (Object) (Object) (var56 + "<br>");
                                      break L121;
                                    }
                                  }
                                }
                                var14_ref = (Object) (Object) "";
                                break L121;
                              }
                              var14_ref = (Object) (Object) (var14_ref + al.field_h);
                              break L120;
                            }
                          }
                          break L117;
                        }
                      }
                    }
                    var57 = km.a(var9, 112);
                    var14_ref = (Object) (Object) var57;
                    var21_ref = var14_ref;
                    var14_ref = var21_ref;
                    var14_ref = (Object) (Object) var57;
                    var58 = kk.a(ul.a(var9, (byte) 67), -4097);
                    var14_ref = (Object) (Object) var58;
                    var21_ref = var14_ref;
                    var14_ref = var21_ref;
                    var14_ref = (Object) (Object) var58;
                    if (var57 != null) {
                      if (var58 != null) {
                        var14_ref = (Object) (Object) (var57 + "<br><br>" + var58);
                        break L117;
                      } else {
                        break L117;
                      }
                    } else {
                      var14_ref = (Object) (Object) var58;
                      break L117;
                    }
                  }
                  var17_ref_String = pl.a(109, var9);
                  var14_ref = (Object) (Object) var17_ref_String;
                  var21_ref = var14_ref;
                  var14_ref = var21_ref;
                  var14_ref = (Object) (Object) var17_ref_String;
                  if (var17_ref_String != null) {
                    var14_ref = (Object) (Object) (var14_ref + db.a(oa.field_H, -64, new String[1]));
                    break L115;
                  } else {
                    break L115;
                  }
                }
              } else {
                L123: {
                  if (~nm.field_w == ~var9) {
                    break L123;
                  } else {
                    ee.c(-2483, 97);
                    lg.field_l = true;
                    nm.field_w = var9;
                    break L123;
                  }
                }
                L124: {
                  if (var9 != 34) {
                    var14_ref = (Object) (Object) se.field_a[var9];
                    break L124;
                  } else {
                    var14_ref = (Object) (Object) "MOD ONLY MODULE: gives you ludicrous amounts of everything";
                    break L124;
                  }
                }
                L125: {
                  if (var9 != 34) {
                    var13 = (Object) (Object) rj.field_m[var9];
                    break L125;
                  } else {
                    var13 = (Object) (Object) "GODULE";
                    break L125;
                  }
                }
                L126: {
                  L127: {
                    L128: {
                      if (ni.b(51)) {
                        break L128;
                      } else {
                        if (rd.field_b > 0) {
                          break L127;
                        } else {
                          break L128;
                        }
                      }
                    }
                    if (!oc.a(var9, -81, true)) {
                      break L127;
                    } else {
                      stackOut_469_0 = 1;
                      stackIn_471_0 = stackOut_469_0;
                      break L126;
                    }
                  }
                  stackOut_470_0 = 0;
                  stackIn_471_0 = stackOut_470_0;
                  break L126;
                }
                L129: {
                  var17 = stackIn_471_0;
                  if (var17 == 0) {
                    break L129;
                  } else {
                    var14_ref = (Object) (Object) of.field_b;
                    break L129;
                  }
                }
                break L115;
              }
            } else {
              L130: {
                if (~nm.field_w == ~var10) {
                  break L130;
                } else {
                  ee.c(-2483, 97);
                  nm.field_w = var10;
                  lg.field_l = true;
                  break L130;
                }
              }
              L131: {
                var17 = -2049 & var10;
                if (var17 != 2) {
                  if (4 != var17) {
                    if (8 == var17) {
                      var13 = (Object) (Object) ti.field_o;
                      break L131;
                    } else {
                      var13 = (Object) (Object) bc.field_nb;
                      var55 = dc.a(var10, 32);
                      if (var55.length() <= 0) {
                        var14_ref = null;
                        break L131;
                      } else {
                        var14_ref = (Object) (Object) db.a(wh.field_h, -68, new String[1]);
                        break L131;
                      }
                    }
                  } else {
                    var13 = (Object) (Object) tc.field_r;
                    break L131;
                  }
                } else {
                  var13 = (Object) (Object) im.field_e;
                  break L131;
                }
              }
              if (kh.field_v.a((byte) 2, lj.field_h) == -1) {
                break L115;
              } else {
                if (var14_ref != null) {
                  var14_ref = (Object) (Object) (var14_ref + "<br><br>" + dg.field_c);
                  break L115;
                } else {
                  var14_ref = (Object) (Object) dg.field_c;
                  break L115;
                }
              }
            }
          }
          L132: {
            L133: {
              if (var10 >= 0) {
                break L133;
              } else {
                L134: {
                  if (ni.b(57)) {
                    break L134;
                  } else {
                    if (0 < rd.field_b) {
                      break L133;
                    } else {
                      break L134;
                    }
                  }
                }
                L135: {
                  stackOut_501_0 = var9;
                  stackOut_501_1 = -86;
                  stackIn_503_0 = stackOut_501_0;
                  stackIn_503_1 = stackOut_501_1;
                  stackIn_502_0 = stackOut_501_0;
                  stackIn_502_1 = stackOut_501_1;
                  if (fg.field_Ob != 0) {
                    stackOut_503_0 = stackIn_503_0;
                    stackOut_503_1 = stackIn_503_1;
                    stackOut_503_2 = 0;
                    stackIn_504_0 = stackOut_503_0;
                    stackIn_504_1 = stackOut_503_1;
                    stackIn_504_2 = stackOut_503_2;
                    break L135;
                  } else {
                    stackOut_502_0 = stackIn_502_0;
                    stackOut_502_1 = stackIn_502_1;
                    stackOut_502_2 = 1;
                    stackIn_504_0 = stackOut_502_0;
                    stackIn_504_1 = stackOut_502_1;
                    stackIn_504_2 = stackOut_502_2;
                    break L135;
                  }
                }
                if (oc.a(stackIn_504_0, stackIn_504_1, stackIn_504_2 == 0)) {
                  break L133;
                } else {
                  stackOut_505_0 = 1;
                  stackIn_507_0 = stackOut_505_0;
                  break L132;
                }
              }
            }
            stackOut_506_0 = 0;
            stackIn_507_0 = stackOut_506_0;
            break L132;
          }
          L136: {
            var17 = stackIn_507_0;
            if (var17 == 0) {
              if (!he.a((byte) 122)) {
                break L136;
              } else {
                if (0 > var9) {
                  break L136;
                } else {
                  if ((fg.field_Ob & 1) != 0) {
                    break L136;
                  } else {
                    L137: {
                      var18 = 1;
                      var19 = 0;
                      var20 = 0;
                      if (0 != fg.field_Ob) {
                        var20 = sj.field_v[var9];
                        if (t.a(rn.field_D, var9, -20370)) {
                          var18 = 0;
                          break L137;
                        } else {
                          if (!aj.a(ge.field_m, (byte) 123, rn.field_D, var9, nk.f((byte) -74))) {
                            var18 = 2;
                            var19 = 1;
                            break L137;
                          } else {
                            if (var20 <= li.field_v) {
                              break L137;
                            } else {
                              var18 = 2;
                              break L137;
                            }
                          }
                        }
                      } else {
                        var20 = qf.field_h[var9];
                        if (t.a(fe.field_D, var9, -20370)) {
                          var18 = 0;
                          break L137;
                        } else {
                          if (ad.a(var9, nk.f((byte) -61), fe.field_D, (byte) 84, ge.field_m, rn.field_D)) {
                            if (~var20 >= ~li.field_v) {
                              break L137;
                            } else {
                              var18 = 2;
                              break L137;
                            }
                          } else {
                            var19 = 1;
                            var18 = 2;
                            break L137;
                          }
                        }
                      }
                    }
                    L138: {
                      var21_ref = null;
                      var22 = var18;
                      if (var22 != 0) {
                        if (var22 != 1) {
                          if (2 != var22) {
                            break L138;
                          } else {
                            if (var19 != 0) {
                              var21_ref = (Object) (Object) a.field_d[3];
                              break L138;
                            } else {
                              var21_ref = (Object) (Object) a.field_d[2];
                              break L138;
                            }
                          }
                        } else {
                          var21_ref = (Object) (Object) a.field_d[1];
                          break L138;
                        }
                      } else {
                        var21_ref = (Object) (Object) a.field_d[0];
                        break L138;
                      }
                    }
                    L139: {
                      if (var21_ref != null) {
                        var21_ref = (Object) (Object) db.a((String) var21_ref, -64, new String[1]);
                        var14_ref = var21_ref;
                        var14_ref = var21_ref;
                        break L139;
                      } else {
                        break L139;
                      }
                    }
                    L140: {
                      if (var14_ref == null) {
                        break L140;
                      } else {
                        if (((String) var14_ref).length() != 0) {
                          if (var21_ref == null) {
                            break L136;
                          } else {
                            var14_ref = (Object) (Object) (var14_ref + "<br><br>" + var21_ref);
                            break L136;
                          }
                        } else {
                          break L140;
                        }
                      }
                    }
                    var14_ref = var21_ref;
                    break L136;
                  }
                }
              }
            } else {
              var14_ref = (Object) (Object) of.field_b;
              var21_ref = var14_ref;
              var14_ref = var21_ref;
              var21_ref = var14_ref;
              var14_ref = var21_ref;
              break L136;
            }
          }
          L141: {
            var18 = 110;
            var19 = 270;
            var20 = ((mi) (Object) var8_ref).field_G - -((mi) (Object) var8_ref).field_F;
            var21 = 5 + (5 + var20);
            var22 = 228;
            var23 = 16777215;
            if (var9 < 0) {
              var23 = 4210752;
              break L141;
            } else {
              break L141;
            }
          }
          L142: {
            var24 = new String[4];
            var25 = 0;
            var26 = 0;
            if (var13 != null) {
              var25 = ((mi) (Object) var8_ref).a((String) var13, new int[1], var24);
              var21 = var21 + (5 - -(var20 * var25));
              break L142;
            } else {
              break L142;
            }
          }
          L143: {
            if (0 != (fg.field_Ob & 16)) {
              var26 = d.a(0, 0, 17, true, var9);
              if (var10 >= 0) {
                var21 += 25;
                break L143;
              } else {
                if (var16_ref_wk == null) {
                  break L143;
                } else {
                  L144: {
                    var27 = 7 + var20 + (-20 + var16_ref_wk.field_F);
                    if (var26 >= var27) {
                      break L144;
                    } else {
                      var26 = var27;
                      break L144;
                    }
                  }
                  break L143;
                }
              }
            } else {
              break L143;
            }
          }
          L145: {
            var21 = var21 + var26;
            if (var14_ref == null) {
              break L145;
            } else {
              var21 = var21 + (((mi) (Object) var8_ref).a((String) var14_ref, var19 - 20, var20) + 5);
              break L145;
            }
          }
          L146: {
            var18 = 378 - var21;
            pb.c(var22, var18, var19, var21, 0, 200);
            pb.h(var22, var18, var19, var21, var23);
            var21 = var18 - (-5 - var20);
            if (var25 <= 0) {
              break L146;
            } else {
              var27 = 0;
              L147: while (true) {
                if (var27 >= var25) {
                  var21 = var21 + (var20 * var25 - -5);
                  break L146;
                } else {
                  ((mi) (Object) var8_ref).b(var24[var27], 10 + var22, var21 + var27 * var20, 1021128, 0);
                  var27++;
                  continue L147;
                }
              }
            }
          }
          L148: {
            if (var16_ref_wk == null) {
              break L148;
            } else {
              var16_ref_wk.f(var22 + 138, var21 + -18);
              int discarded$84 = ((mi) (Object) var8_ref).a((String) var15, 138 + var22, var21 + -20 + var16_ref_wk.field_F, -140 + (var19 - 2), 100, 1021128, 0, 0, 0, 10);
              break L148;
            }
          }
          L149: {
            L150: {
              if (var11 != -1) {
                break L150;
              } else {
                if (var12 != -1) {
                  break L150;
                } else {
                  break L149;
                }
              }
            }
            L151: {
              var27 = var22 + var19 - 40;
              var28 = -10 + var21;
              var29 = 10;
              if (var10 >= 0) {
                var27 = var19 / 2 + var22;
                break L151;
              } else {
                break L151;
              }
            }
            pb.c(var27, var28 - -1, var29, 477796);
            pb.c(var27, var28, var29, 1021128);
            var12 = 8192 * var12 / 65536;
            ((mi) (Object) var8_ref).a(tk.field_s, var27, 14 + var28 + var29, 1044724, 0);
            var11 = 8192 * var11 / 65536;
            var30 = var11;
            L152: while (true) {
              if (var30 >= var12) {
                L153: {
                  pb.d(var27, var28, kg.a(var12, (byte) -82) * var29 / 65536 + var27, var28 - -(var29 * jh.a(var12, 4096) / 65536), 1044724);
                  if (var10 >= 0) {
                    var21 = var21 + (18 + var29);
                    break L153;
                  } else {
                    break L153;
                  }
                }
                pb.d(var27, 1 + var28, kg.a(var12, (byte) -77) * var29 / 65536 + var27, 1 + var28 - -(var29 * jh.a(var12, 4096) / 65536), 1044724);
                break L149;
              } else {
                pb.d(var27, var28, var29 * kg.a(var30, (byte) -76) / 65536 + var27, var28 + var29 * jh.a(var30, 4096) / 65536, 1044724);
                pb.d(var27, var28 - -1, var27 + kg.a(var30, (byte) -82) * var29 / 65536, var29 * jh.a(var30, 4096) / 65536 + 1 + var28, 1044724);
                var30 += 100;
                continue L152;
              }
            }
          }
          L154: {
            if ((fg.field_Ob & 16) == 0) {
              break L154;
            } else {
              int discarded$85 = d.a(var21 + -10, var22 + 10, 17, false, var9);
              break L154;
            }
          }
          var21 = var21 + var26;
          if (var14_ref != null) {
            int discarded$86 = ((mi) (Object) var8_ref).a((String) var14_ref, var22 - -10, var21, -20 + var19, 300, 1021128, 0, 0, 0, var20);
            var21 = var21 + ((mi) (Object) var8_ref).a((String) var14_ref, -20 + var19, var20);
            break L110;
          } else {
            break L110;
          }
        }
        L155: {
          var13 = null;
          if (!qh.field_Wb) {
            var13 = (Object) (Object) ji.field_b[0];
            var15 = var13;
            var15 = var13;
            break L155;
          } else {
            var82 = new int[35];
            var75 = var82;
            var68 = var75;
            var59 = var68;
            var14_ref = (Object) (Object) var59;
            var15_int = hl.field_v.i(-115);
            var16 = 0;
            L156: while (true) {
              if (var15_int <= var16) {
                var16 = -1;
                var17 = 0;
                var18 = 0;
                L157: while (true) {
                  if (~var18 <= ~var82.length) {
                    L158: {
                      if (var16 == 34) {
                        var13 = (Object) (Object) "Don't equip multiple GODULEs. They are too awesome.";
                        break L158;
                      } else {
                        if (var16 == -1) {
                          L159: {
                            if (var82[26] <= 0) {
                              break L159;
                            } else {
                              if (var17 != 0) {
                                break L159;
                              } else {
                                var13 = (Object) (Object) ji.field_b[2];
                                break L155;
                              }
                            }
                          }
                          L160: {
                            if (0 >= var82[28]) {
                              break L160;
                            } else {
                              if (hl.field_v.h(-31496) <= 0) {
                                var13 = (Object) (Object) ji.field_b[3];
                                break L155;
                              } else {
                                break L160;
                              }
                            }
                          }
                          L161: {
                            if (var82[29] <= 0) {
                              break L161;
                            } else {
                              if (hl.field_v.j(0) > 0) {
                                break L161;
                              } else {
                                var13 = (Object) (Object) ji.field_b[4];
                                break L155;
                              }
                            }
                          }
                          L162: {
                            if (0 >= var82[17]) {
                              break L162;
                            } else {
                              if (!wl.field_lb) {
                                var13 = (Object) (Object) ji.field_b[5];
                                break L155;
                              } else {
                                break L162;
                              }
                            }
                          }
                          L163: {
                            if (var82[16] <= 0) {
                              break L163;
                            } else {
                              if (vc.field_d) {
                                break L163;
                              } else {
                                var13 = (Object) (Object) ji.field_b[6];
                                break L155;
                              }
                            }
                          }
                          L164: {
                            if (0 >= var82[22]) {
                              break L164;
                            } else {
                              if (nb.field_I) {
                                break L164;
                              } else {
                                if (bf.field_Gb) {
                                  break L164;
                                } else {
                                  var13 = (Object) (Object) ji.field_b[7];
                                  break L155;
                                }
                              }
                            }
                          }
                          L165: {
                            if (var82[23] <= 0) {
                              break L165;
                            } else {
                              if (qf.field_b) {
                                break L165;
                              } else {
                                var13 = (Object) (Object) ji.field_b[8];
                                break L155;
                              }
                            }
                          }
                          L166: {
                            if (0 >= var82[25]) {
                              break L166;
                            } else {
                              if (!bm.field_Q) {
                                var13 = (Object) (Object) ji.field_b[9];
                                break L155;
                              } else {
                                break L166;
                              }
                            }
                          }
                          L167: {
                            if (0 >= var82[24]) {
                              break L167;
                            } else {
                              if (ei.field_t < 5) {
                                var13 = (Object) (Object) ji.field_b[10];
                                break L155;
                              } else {
                                break L167;
                              }
                            }
                          }
                          if (!lc.field_f) {
                            break L158;
                          } else {
                            if (10 <= ei.field_t) {
                              break L158;
                            } else {
                              var13 = (Object) (Object) ji.field_b[11];
                              break L155;
                            }
                          }
                        } else {
                          var13 = (Object) (Object) db.a(ji.field_b[1], -25, new String[1]);
                          break L155;
                        }
                      }
                    }
                    break L155;
                  } else {
                    L168: {
                      var19 = pe.field_O[var18];
                      if (var19 == 0) {
                        break L168;
                      } else {
                        if (var19 == 1) {
                          break L168;
                        } else {
                          if (var19 == 2) {
                            break L168;
                          } else {
                            if (var82[var18] > 1) {
                              var16 = var18;
                              break L168;
                            } else {
                              break L168;
                            }
                          }
                        }
                      }
                    }
                    L169: {
                      if (var19 != 2) {
                        break L169;
                      } else {
                        if (var82[var18] <= 0) {
                          break L169;
                        } else {
                          var17 = 1;
                          break L169;
                        }
                      }
                    }
                    var18++;
                    continue L157;
                  }
                }
              } else {
                L170: {
                  if (di.field_c[var16] >= 0) {
                    ((int[]) var14_ref)[di.field_c[var16]] = ((int[]) var14_ref)[di.field_c[var16]] + 1;
                    break L170;
                  } else {
                    break L170;
                  }
                }
                var16++;
                continue L156;
              }
            }
          }
        }
        L171: {
          if (var13 == null) {
            break L171;
          } else {
            if (!ef.field_b) {
              break L171;
            } else {
              var60 = jn.field_e + var13;
              var15 = (Object) (Object) var60;
              var15 = (Object) (Object) var60;
              var14 = 283;
              var15_int = 230;
              var16 = 87;
              var17 = 10 + pl.field_U.a(var60, var14);
              var18 = 10 + pl.field_U.a(var60, var14, 12);
              pb.c((-var17 + var14) / 2 + var15_int, -5 + var16, var17, var18, 0, 150);
              int discarded$87 = pl.field_U.a(var60, var15_int, var16, var14, 100, 16711680, 0, 1, 0, 12);
              break L171;
            }
          }
        }
        L172: {
          if (f.field_y != null) {
            L173: {
              var14 = 0;
              var15 = null;
              if (fg.field_Ob == 0) {
                var16 = (int)f.field_y.field_j;
                var14 = Integer.parseInt(f.field_y.field_S.substring(5, 6));
                var17 = var14;
                if (var17 == 1) {
                  var15 = (Object) (Object) db.a(sl.field_j[0], -71, new String[1]);
                  break L173;
                } else {
                  if (2 != var17) {
                    if (var17 == 3) {
                      var15 = (Object) (Object) sl.field_j[2];
                      break L173;
                    } else {
                      if (var17 != 4) {
                        if (5 != var17) {
                          if (var17 != 7) {
                            break L173;
                          } else {
                            if (var16 != 20) {
                              var15 = (Object) (Object) db.a(sl.field_j[5], -76, new String[1]);
                              break L173;
                            } else {
                              var15 = (Object) (Object) sl.field_j[6];
                              break L173;
                            }
                          }
                        } else {
                          var15 = (Object) (Object) db.a(sl.field_j[4], -86, new String[1]);
                          break L173;
                        }
                      } else {
                        var15 = (Object) (Object) db.a(sl.field_j[3], -94, new String[1]);
                        break L173;
                      }
                    }
                  } else {
                    var15 = (Object) (Object) sl.field_j[1];
                    break L173;
                  }
                }
              } else {
                L174: {
                  var61 = ul.a((int)f.field_y.field_j, (byte) 67);
                  var14 = Integer.parseInt(f.field_y.field_S.substring(5, 6));
                  if (0 != (fg.field_Ob & 1)) {
                    break L174;
                  } else {
                    L175: {
                      if (var14 == 2) {
                        break L175;
                      } else {
                        if (var14 != 3) {
                          break L174;
                        } else {
                          break L175;
                        }
                      }
                    }
                    if (~oh.field_f > ~(-30 + f.field_y.field_Rb + f.field_y.field_zb)) {
                      if (var61.i(-118) <= 0) {
                        var14 = -1;
                        break L174;
                      } else {
                        var14 = 6;
                        break L174;
                      }
                    } else {
                      break L174;
                    }
                  }
                }
                L176: {
                  var17 = var14;
                  if (var17 == 0) {
                    var15 = (Object) (Object) db.a(sl.field_j[7], -111, new String[1]);
                    break L176;
                  } else {
                    if (var17 != 1) {
                      if (var17 != 2) {
                        if (var17 == 3) {
                          if ((1 & fg.field_Ob) != 0) {
                            L177: {
                              var17 = ul.a((byte) -97, var61.field_N);
                              stackOut_688_0 = sl.field_j[10];
                              stackOut_688_1 = -93;
                              stackOut_688_2 = new String[1];
                              stackOut_688_3 = new String[1];
                              stackOut_688_4 = 0;
                              stackIn_690_0 = stackOut_688_0;
                              stackIn_690_1 = stackOut_688_1;
                              stackIn_690_2 = stackOut_688_2;
                              stackIn_690_3 = stackOut_688_3;
                              stackIn_690_4 = stackOut_688_4;
                              stackIn_689_0 = stackOut_688_0;
                              stackIn_689_1 = stackOut_688_1;
                              stackIn_689_2 = stackOut_688_2;
                              stackIn_689_3 = stackOut_688_3;
                              stackIn_689_4 = stackOut_688_4;
                              if (var17 >= 0) {
                                stackOut_690_0 = (String) (Object) stackIn_690_0;
                                stackOut_690_1 = stackIn_690_1;
                                stackOut_690_2 = (String[]) (Object) stackIn_690_2;
                                stackOut_690_3 = (String[]) (Object) stackIn_690_3;
                                stackOut_690_4 = stackIn_690_4;
                                stackOut_690_5 = qc.field_S[var17];
                                stackIn_691_0 = stackOut_690_0;
                                stackIn_691_1 = stackOut_690_1;
                                stackIn_691_2 = stackOut_690_2;
                                stackIn_691_3 = stackOut_690_3;
                                stackIn_691_4 = stackOut_690_4;
                                stackIn_691_5 = stackOut_690_5;
                                break L177;
                              } else {
                                stackOut_689_0 = (String) (Object) stackIn_689_0;
                                stackOut_689_1 = stackIn_689_1;
                                stackOut_689_2 = (String[]) (Object) stackIn_689_2;
                                stackOut_689_3 = (String[]) (Object) stackIn_689_3;
                                stackOut_689_4 = stackIn_689_4;
                                stackOut_689_5 = 0;
                                stackIn_691_0 = stackOut_689_0;
                                stackIn_691_1 = stackOut_689_1;
                                stackIn_691_2 = stackOut_689_2;
                                stackIn_691_3 = stackOut_689_3;
                                stackIn_691_4 = stackOut_689_4;
                                stackIn_691_5 = stackOut_689_5;
                                break L177;
                              }
                            }
                            stackIn_691_3[stackIn_691_4] = Integer.toString(stackIn_691_5);
                            var15 = (Object) (Object) db.a(stackIn_691_0, stackIn_691_1, stackIn_691_2);
                            break L176;
                          } else {
                            var15 = (Object) (Object) sl.field_j[2];
                            break L176;
                          }
                        } else {
                          if (var17 != 6) {
                            break L176;
                          } else {
                            var15 = (Object) (Object) db.a(al.field_e, -46, new String[1]);
                            break L176;
                          }
                        }
                      } else {
                        if ((fg.field_Ob & 1) != 0) {
                          L178: {
                            var17 = ul.a((byte) 77, var61.field_N);
                            stackOut_682_0 = sl.field_j[9];
                            stackOut_682_1 = -107;
                            stackOut_682_2 = new String[1];
                            stackOut_682_3 = new String[1];
                            stackOut_682_4 = 0;
                            stackIn_684_0 = stackOut_682_0;
                            stackIn_684_1 = stackOut_682_1;
                            stackIn_684_2 = stackOut_682_2;
                            stackIn_684_3 = stackOut_682_3;
                            stackIn_684_4 = stackOut_682_4;
                            stackIn_683_0 = stackOut_682_0;
                            stackIn_683_1 = stackOut_682_1;
                            stackIn_683_2 = stackOut_682_2;
                            stackIn_683_3 = stackOut_682_3;
                            stackIn_683_4 = stackOut_682_4;
                            if (var17 >= 0) {
                              stackOut_684_0 = (String) (Object) stackIn_684_0;
                              stackOut_684_1 = stackIn_684_1;
                              stackOut_684_2 = (String[]) (Object) stackIn_684_2;
                              stackOut_684_3 = (String[]) (Object) stackIn_684_3;
                              stackOut_684_4 = stackIn_684_4;
                              stackOut_684_5 = qc.field_S[var17];
                              stackIn_685_0 = stackOut_684_0;
                              stackIn_685_1 = stackOut_684_1;
                              stackIn_685_2 = stackOut_684_2;
                              stackIn_685_3 = stackOut_684_3;
                              stackIn_685_4 = stackOut_684_4;
                              stackIn_685_5 = stackOut_684_5;
                              break L178;
                            } else {
                              stackOut_683_0 = (String) (Object) stackIn_683_0;
                              stackOut_683_1 = stackIn_683_1;
                              stackOut_683_2 = (String[]) (Object) stackIn_683_2;
                              stackOut_683_3 = (String[]) (Object) stackIn_683_3;
                              stackOut_683_4 = stackIn_683_4;
                              stackOut_683_5 = 0;
                              stackIn_685_0 = stackOut_683_0;
                              stackIn_685_1 = stackOut_683_1;
                              stackIn_685_2 = stackOut_683_2;
                              stackIn_685_3 = stackOut_683_3;
                              stackIn_685_4 = stackOut_683_4;
                              stackIn_685_5 = stackOut_683_5;
                              break L178;
                            }
                          }
                          stackIn_685_3[stackIn_685_4] = Integer.toString(stackIn_685_5);
                          var15 = (Object) (Object) db.a(stackIn_685_0, stackIn_685_1, stackIn_685_2);
                          break L176;
                        } else {
                          var15 = (Object) (Object) sl.field_j[1];
                          break L176;
                        }
                      }
                    } else {
                      var15 = (Object) (Object) db.a(sl.field_j[8], -40, new String[1]);
                      break L176;
                    }
                  }
                }
                L179: {
                  if (var14 == 6) {
                    break L179;
                  } else {
                    if (0 > f.field_y.field_S.indexOf("<img=2>")) {
                      break L179;
                    } else {
                      if (f.field_y.field_S.indexOf("<img=3>") >= 0) {
                        var15 = (Object) (Object) sl.field_j[11];
                        var14 = 2;
                        break L179;
                      } else {
                        break L173;
                      }
                    }
                  }
                }
                break L173;
              }
            }
            if (var15 == null) {
              break L172;
            } else {
              L180: {
                var16 = 13;
                var17 = f.field_y.field_Rb - -20;
                var18 = f.field_y.field_cb - (var16 + -2);
                if (var14 != 6) {
                  break L180;
                } else {
                  var17 -= 20;
                  break L180;
                }
              }
              L181: {
                L182: {
                  var19 = fk.field_d.c((String) var15) - -8;
                  if (var14 == 2) {
                    break L182;
                  } else {
                    if (var14 != 3) {
                      break L181;
                    } else {
                      break L182;
                    }
                  }
                }
                if (0 != (fg.field_Ob & 1)) {
                  break L181;
                } else {
                  var17 = -var19 + -4 + (f.field_y.field_zb + f.field_y.field_Rb);
                  break L181;
                }
              }
              pb.c(var17, var18, var19, var16, 0, 192);
              pb.h(var17, var18, var19, var16, 1400960, 192);
              fk.field_d.b((String) var15, 4 + var17, 10 + var18, 16777215, -1);
              break L172;
            }
          } else {
            break L172;
          }
        }
        L183: {
          L184: {
            if (dc.field_g < 0) {
              break L184;
            } else {
              if (dc.field_g == 15) {
                break L184;
              } else {
                pa.field_d[dc.field_g].b(-40);
                break L183;
              }
            }
          }
          break L183;
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var2_int = param1.length;
            if (param0 == 89) {
              var3 = new byte[var2_int];
              ii.a(param1, 0, var3, 0, var2_int);
              stackOut_3_0 = (byte[]) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ff.WA(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final static gh a(boolean param0, int param1, int[] param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        gh var7 = null;
        gh var8 = null;
        gh var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        gh var12 = null;
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
        wk var30 = null;
        gh var32 = null;
        int[] var34 = null;
        gh var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        gh stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        gh stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        gh stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        gh stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        gh stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        gh stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        gh stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        gh stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        gh stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        gh stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        gh stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        gh stackOut_39_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var22 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var3_int = qa.field_O;
              var4 = param1 + 100;
              var5 = 78;
              var6 = 66;
              var7 = new gh((long)var4, sb.field_Y);
              cj.field_a[var4] = var7;
              var7.field_I = tk.field_t;
              var7.field_Ab = be.field_f;
              var8 = new gh((long)var4, (gh) null);
              var8.a(0, 2, var5 - 4, 2, -4 + var6);
              var8.field_I = co.field_d;
              if (null != ue.field_g[-1 + param1]) {
                break L1;
              } else {
                ad.a(param1 + -1, (nk) null, 84);
                break L1;
              }
            }
            var8.field_Pb = ue.field_g[param1 + -1];
            var7.a(var8, 119);
            var9 = new gh((long)var4, kh.field_s);
            var49 = new int[param2.length + -8];
            var43 = var49;
            var37 = var43;
            var28 = var37;
            var10 = var28;
            ii.a(param2, 0, var10, 0, param2.length - 8);
            var48 = new int[8];
            var42 = var48;
            var36 = var42;
            var27 = var36;
            var11 = var27;
            ii.a(param2, param2.length - 8, var48, 0, 8);
            var9.field_S = kc.a(var49, var48, 2);
            var9.field_nb = 1021128;
            var9.a(0, 2, -4 + var5 + -15, -2 + var6, -var6 + var3_int);
            var9.field_Ib = 10;
            var7.a(var9, 125);
            var12 = new gh("bin", (gh) null);
            var13 = lj.field_e[0].field_z + 3;
            var14 = 3 + lj.field_e[0].field_B;
            var12.a(0, -3 + var5 + -var14, var14, -var13 + 174, var13);
            var12.field_db = lj.field_e[1];
            var12.field_sb = 2;
            var12.field_Ab = null;
            var12.field_qb = 2;
            var12.field_Pb = lj.field_e[0];
            var12.field_I = null;
            var7.a(var12, 124);
            var15 = 0;
            var50 = var11;
            var44 = var50;
            var38 = var44;
            var29 = var38;
            var24 = var29;
            var16_ref_int__ = var24;
            var17 = 0;
            L2: while (true) {
              if (var50.length <= var17) {
                L3: {
                  if (var15 <= 0) {
                    break L3;
                  } else {
                    var30 = new wk(20 * Math.min(var15, 4), 20 * (1 + var15 / 4));
                    var15 = 0;
                    var30.d();
                    var17 = 0;
                    var18_int = 0;
                    var51 = var11;
                    var20 = 0;
                    L4: while (true) {
                      if (var20 >= var51.length) {
                        sb.field_bb.b((byte) 125);
                        var32 = new gh((long)var4, (gh) null);
                        var32.field_Pb = var30;
                        var32.a(0, 20, var30.field_B, var6, var30.field_z);
                        var7.a(var32, 120);
                        break L3;
                      } else {
                        L5: {
                          var21 = var51[var20];
                          if (var21 >= 0) {
                            var15++;
                            ie.field_d[var21].c(var17, var18_int);
                            if (var15 == 4) {
                              var17 = 0;
                              var18_int += 20;
                              break L5;
                            } else {
                              var17 += 20;
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        var20++;
                        continue L4;
                      }
                    }
                  }
                }
                var16 = 0;
                var52 = var10;
                var18_int = 0;
                L6: while (true) {
                  if (var52.length <= var18_int) {
                    var17 = param0 ? 1 : 0;
                    var53 = var11;
                    var47 = var53;
                    var41 = var47;
                    var34 = var41;
                    var25 = var34;
                    var18 = var25;
                    var26 = 0;
                    var19 = var26;
                    L7: while (true) {
                      L8: {
                        if (var26 >= var53.length) {
                          break L8;
                        } else {
                          var20 = var53[var26];
                          if (var20 == 34) {
                            var16 = 6100;
                            var17 = 1;
                            break L8;
                          } else {
                            L9: {
                              if (0 <= var20) {
                                var16 = var16 + dn.field_Sb[var20];
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var26++;
                            continue L7;
                          }
                        }
                      }
                      L10: {
                        var35 = new gh((long)var4, kh.field_s);
                        var35.a(0, 60, -4 + (var5 + -15), var6 + -6, 6 + -var6 + var12.field_Y);
                        var35.field_nb = 749462;
                        var35.field_Ib = 10;
                        stackOut_34_0 = (gh) var35;
                        stackOut_34_1 = new StringBuilder().append("<img=1>");
                        stackIn_38_0 = stackOut_34_0;
                        stackIn_38_1 = stackOut_34_1;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        if (var17 != 0) {
                          stackOut_38_0 = (gh) (Object) stackIn_38_0;
                          stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                          stackOut_38_2 = "MIGHTY";
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          break L10;
                        } else {
                          stackOut_35_0 = (gh) (Object) stackIn_35_0;
                          stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          if (var16 <= 6100) {
                            stackOut_37_0 = (gh) (Object) stackIn_37_0;
                            stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                            stackOut_37_2 = ej.field_C;
                            stackIn_39_0 = stackOut_37_0;
                            stackIn_39_1 = stackOut_37_1;
                            stackIn_39_2 = stackOut_37_2;
                            break L10;
                          } else {
                            stackOut_36_0 = (gh) (Object) stackIn_36_0;
                            stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                            stackOut_36_2 = fi.field_z;
                            stackIn_39_0 = stackOut_36_0;
                            stackIn_39_1 = stackOut_36_1;
                            stackIn_39_2 = stackOut_36_2;
                            break L10;
                          }
                        }
                      }
                      stackIn_39_0.field_S = stackIn_39_2;
                      var7.a(var35, 123);
                      stackOut_39_0 = (gh) var7;
                      stackIn_40_0 = stackOut_39_0;
                      break L0;
                    }
                  } else {
                    L11: {
                      var19 = var52[var18_int];
                      if (var19 >= 0) {
                        var16 = var16 + tc.field_B[var19];
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    var18_int++;
                    continue L6;
                  }
                }
              } else {
                L12: {
                  var18_int = var50[var17];
                  if (0 <= var18_int) {
                    var15++;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var17++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var3;
            stackOut_41_1 = new StringBuilder().append("ff.AB(").append(param0).append(44).append(param1).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L13;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L13;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 41);
        }
        return stackIn_40_0;
    }

    final void a(int param0, int param1, lh param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ff) this).field_jb = ((ff) this).field_jb + 1;
              super.a(param0, 92, param2, param3);
              if (param1 >= 56) {
                break L1;
              } else {
                field_rb = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ff.H(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param3 + 41);
        }
    }

    final String e(int param0) {
        if (param0 == 0) {
            return null;
        }
        field_ob = null;
        return null;
    }

    ff(tl param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (qk) (Object) eh.b(false));
        try {
            ((ff) this).field_mb = param0;
            ((ff) this).field_hb = param1;
            ((ff) this).a(param2, (byte) -117, param3, param4, param5);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ff.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
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
            Object var4 = null;
            byte[] discarded$0 = ff.a((byte) 37, (byte[]) null);
        }
        param1 = 1085102592571150095L & param1 - -(param1 >>> 4);
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        param1 = param1 + (param1 >>> 32);
        return (int)(param1 & 255L);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        String var5 = null;
        vd var6 = null;
        eg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wk var14 = null;
        wk var15 = null;
        wk var16 = null;
        L0: {
          L1: {
            L2: {
              var13 = SteelSentinels.field_G;
              var6 = ((ff) this).field_mb.a((byte) 21);
              if (var6 == nh.field_J) {
                break L2;
              } else {
                if (var6 == ma.field_Y) {
                  break L2;
                } else {
                  var5 = ((ff) this).field_mb.a(true);
                  if (var5 == null) {
                    var5 = ((ff) this).field_hb;
                    break L1;
                  } else {
                    if (var5.equals((Object) (Object) ((ff) this).field_y)) {
                      break L0;
                    } else {
                      ((ff) this).field_y = var5;
                      ((ff) this).f((byte) -104);
                      break L0;
                    }
                  }
                }
              }
            }
            var5 = me.field_c;
            break L1;
          }
          if (var5.equals((Object) (Object) ((ff) this).field_y)) {
            break L0;
          } else {
            ((ff) this).field_y = var5;
            ((ff) this).f((byte) -104);
            break L0;
          }
        }
        L3: {
          super.a(param0, (byte) -122, param2, param3);
          var6 = ((ff) this).field_mb.a((byte) 21);
          var8 = (eg) (Object) ((ff) this).field_p;
          var9 = ((ff) this).field_o + param2;
          if (param1 <= -99) {
            break L3;
          } else {
            ((ff) this).field_jb = 127;
            break L3;
          }
        }
        L4: {
          L5: {
            var10 = var8.a((byte) -115, (lh) this, param0) - -(var8.b(-1, (lh) this).a((byte) 24) >> 1);
            if (nh.field_J == var6) {
              break L5;
            } else {
              if (var6 != ma.field_Y) {
                if (fa.field_d != var6) {
                  if (vf.field_b == var6) {
                    var16 = t.field_i[1];
                    var16.a(var9, -(var16.field_F >> 1) + var10, 256);
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  var15 = t.field_i[2];
                  var15.a(var9, var10 - (var15.field_F >> 1), 256);
                  break L4;
                }
              } else {
                break L5;
              }
            }
          }
          L6: {
            L7: {
              var14 = t.field_i[0];
              var11 = var14.field_z << 1;
              var12 = var14.field_B << 1;
              if (null == ((ff) this).field_pb) {
                break L7;
              } else {
                if (var11 > ((ff) this).field_pb.field_A) {
                  break L7;
                } else {
                  if (var12 > ((ff) this).field_pb.field_F) {
                    break L7;
                  } else {
                    q.a(((ff) this).field_pb, (byte) -88);
                    pb.b();
                    break L6;
                  }
                }
              }
            }
            ((ff) this).field_pb = new wk(var11, var12);
            q.a(((ff) this).field_pb, (byte) -111);
            break L6;
          }
          var14.a(112, 144, var14.field_z << 4, var14.field_B << 4, -((ff) this).field_jb << 10, 4096);
          tk.f((byte) 111);
          ((ff) this).field_pb.a(var9 + -(var14.field_z >> 1), -var14.field_B + var10, 256);
          break L4;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        double var1 = 0.0;
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
        for (var0 = 0; var0 < 65536; var0++) {
            var1 = Math.sqrt((double)var0);
            field_ib[var0] = (int)Math.floor(-(var1 * 9.0) + 768.5 + 0.0234375 * (double)var0);
        }
        field_qb = new ul();
    }
}
