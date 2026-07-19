/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ff.E(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static void a(byte param0, int param1, int param2) {
        byte[] discarded$1 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        var8 = SteelSentinels.field_G;
        if (vn.field_h < 0) {
          return;
        } else {
          L0: {
            if (param0 > 1) {
              break L0;
            } else {
              var9 = (byte[]) null;
              discarded$1 = ff.a((byte) 92, (byte[]) null);
              break L0;
            }
          }
          L1: {
            var3 = -135 + param2;
            var4 = param1 + -35;
            var5 = 256;
            if (vn.field_h >= 75) {
              break L1;
            } else {
              var5 = (vn.field_h << 1025793384) / 75;
              break L1;
            }
          }
          L2: {
            if (-201 <= (vn.field_h ^ -1)) {
              break L2;
            } else {
              var5 = (250 + -vn.field_h << 1293936392) / 50;
              break L2;
            }
          }
          L3: {
            q.a(ai.field_o, (byte) -106);
            lf.a();
            pb.b();
            pm.a(true);
            if ((var5 ^ -1) <= -257) {
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
                if (-21 >= (var6 ^ -1)) {
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
            if ((var6 ^ -1) < -1) {
              L7: {
                var7 = 256;
                if ((var6 ^ -1) > -21) {
                  var7 = var6 * 256 / 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              hd.field_k.b(var3 - -15, 10 + var4, var5 * var7 >> -559869528);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    final static void g(byte param0) {
        int discarded$44 = 0;
        int discarded$45 = 0;
        int discarded$46 = 0;
        int discarded$47 = 0;
        StringBuilder discarded$48 = null;
        StringBuilder discarded$49 = null;
        StringBuilder discarded$50 = null;
        StringBuilder discarded$51 = null;
        StringBuilder discarded$52 = null;
        StringBuilder discarded$53 = null;
        StringBuilder discarded$54 = null;
        StringBuilder discarded$55 = null;
        StringBuilder discarded$56 = null;
        StringBuilder discarded$57 = null;
        StringBuilder discarded$58 = null;
        StringBuilder discarded$59 = null;
        StringBuilder discarded$60 = null;
        StringBuilder discarded$61 = null;
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        StringBuilder discarded$66 = null;
        StringBuilder discarded$67 = null;
        StringBuilder discarded$68 = null;
        StringBuilder discarded$69 = null;
        StringBuilder discarded$70 = null;
        StringBuilder discarded$71 = null;
        StringBuilder discarded$72 = null;
        StringBuilder discarded$73 = null;
        StringBuilder discarded$74 = null;
        StringBuilder discarded$75 = null;
        StringBuilder discarded$76 = null;
        StringBuilder discarded$77 = null;
        StringBuilder discarded$78 = null;
        StringBuilder discarded$79 = null;
        StringBuilder discarded$80 = null;
        StringBuilder discarded$81 = null;
        StringBuilder discarded$82 = null;
        int discarded$83 = 0;
        int discarded$84 = 0;
        int discarded$85 = 0;
        int discarded$86 = 0;
        int discarded$87 = 0;
        RuntimeException var1 = null;
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
        int[] var73 = null;
        int[] var74 = null;
        int[] var75 = null;
        int[] var76 = null;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_344_0 = 0;
        int stackIn_363_0 = 0;
        int stackIn_413_0 = 0;
        int stackIn_423_0 = 0;
        int stackIn_481_0 = 0;
        int stackIn_510_0 = 0;
        int stackIn_510_1 = 0;
        int stackIn_511_0 = 0;
        int stackIn_511_1 = 0;
        int stackIn_512_0 = 0;
        int stackIn_512_1 = 0;
        int stackIn_512_2 = 0;
        int stackIn_515_0 = 0;
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
        String stackIn_692_0 = null;
        int stackIn_692_1 = 0;
        String[] stackIn_692_2 = null;
        String[] stackIn_692_3 = null;
        int stackIn_692_4 = 0;
        int stackIn_692_5 = 0;
        String stackIn_696_0 = null;
        int stackIn_696_1 = 0;
        String[] stackIn_696_2 = null;
        String[] stackIn_696_3 = null;
        int stackIn_696_4 = 0;
        String stackIn_697_0 = null;
        int stackIn_697_1 = 0;
        String[] stackIn_697_2 = null;
        String[] stackIn_697_3 = null;
        int stackIn_697_4 = 0;
        String stackIn_698_0 = null;
        int stackIn_698_1 = 0;
        String[] stackIn_698_2 = null;
        String[] stackIn_698_3 = null;
        int stackIn_698_4 = 0;
        int stackIn_698_5 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_226_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_343_0 = 0;
        int stackOut_342_0 = 0;
        int stackOut_362_0 = 0;
        int stackOut_361_0 = 0;
        int stackOut_411_0 = 0;
        int stackOut_412_0 = 0;
        int stackOut_421_0 = 0;
        int stackOut_422_0 = 0;
        int stackOut_479_0 = 0;
        int stackOut_480_0 = 0;
        int stackOut_509_0 = 0;
        int stackOut_509_1 = 0;
        int stackOut_511_0 = 0;
        int stackOut_511_1 = 0;
        int stackOut_511_2 = 0;
        int stackOut_510_0 = 0;
        int stackOut_510_1 = 0;
        int stackOut_510_2 = 0;
        int stackOut_513_0 = 0;
        int stackOut_514_0 = 0;
        String stackOut_695_0 = null;
        int stackOut_695_1 = 0;
        String[] stackOut_695_2 = null;
        String[] stackOut_695_3 = null;
        int stackOut_695_4 = 0;
        String stackOut_697_0 = null;
        int stackOut_697_1 = 0;
        String[] stackOut_697_2 = null;
        String[] stackOut_697_3 = null;
        int stackOut_697_4 = 0;
        int stackOut_697_5 = 0;
        String stackOut_696_0 = null;
        int stackOut_696_1 = 0;
        String[] stackOut_696_2 = null;
        String[] stackOut_696_3 = null;
        int stackOut_696_4 = 0;
        int stackOut_696_5 = 0;
        String stackOut_689_0 = null;
        int stackOut_689_1 = 0;
        String[] stackOut_689_2 = null;
        String[] stackOut_689_3 = null;
        int stackOut_689_4 = 0;
        String stackOut_691_0 = null;
        int stackOut_691_1 = 0;
        String[] stackOut_691_2 = null;
        String[] stackOut_691_3 = null;
        int stackOut_691_4 = 0;
        int stackOut_691_5 = 0;
        String stackOut_690_0 = null;
        int stackOut_690_1 = 0;
        String[] stackOut_690_2 = null;
        String[] stackOut_690_3 = null;
        int stackOut_690_4 = 0;
        int stackOut_690_5 = 0;
        var32 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              pa.field_e = -1;
              lj.field_h = null;
              if ((dc.field_g ^ -1) != -2) {
                if (-1 == (dc.field_g ^ -1)) {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              } else {
                stackOut_2_0 = 1;
                stackIn_7_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var1_int = stackIn_7_0;
              if (kk.field_a == null) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L2;
              } else {
                if (oh.field_f >= kk.field_a.field_Rb) {
                  if (oh.field_f < kk.field_a.field_Rb - -kk.field_a.field_zb) {
                    if (kk.field_a.field_cb <= pi.field_c) {
                      if (kk.field_a.field_Lb + kk.field_a.field_cb <= pi.field_c) {
                        stackOut_16_0 = 0;
                        stackIn_19_0 = stackOut_16_0;
                        break L2;
                      } else {
                        stackOut_15_0 = 1;
                        stackIn_19_0 = stackOut_15_0;
                        break L2;
                      }
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_19_0 = stackOut_13_0;
                      break L2;
                    }
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_19_0 = stackOut_11_0;
                    break L2;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_19_0 = stackOut_9_0;
                  break L2;
                }
              }
            }
            L3: {
              var2 = stackIn_19_0;
              if (null != gd.field_jb) {
                L4: {
                  L5: {
                    if (null != km.field_a) {
                      break L5;
                    } else {
                      if (ji.field_a == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  lg.field_l = true;
                  kf.field_s = true;
                  break L4;
                }
                L6: {
                  if (kf.field_s) {
                    break L6;
                  } else {
                    if (oh.field_f < bl.field_c.field_Rb) {
                      break L6;
                    } else {
                      if (bl.field_c.field_Rb + bl.field_c.field_zb <= oh.field_f) {
                        break L6;
                      } else {
                        if (pi.field_c < bl.field_c.field_cb) {
                          break L6;
                        } else {
                          if (pi.field_c >= bl.field_c.field_cb + bl.field_c.field_Lb) {
                            break L6;
                          } else {
                            kf.field_s = true;
                            break L6;
                          }
                        }
                      }
                    }
                  }
                }
                L7: {
                  L8: {
                    if (var2 != 0) {
                      break L8;
                    } else {
                      if (-1 >= (fl.field_a ^ -1)) {
                        break L8;
                      } else {
                        if (nm.field_w < 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  lg.field_l = true;
                  nl.field_X = true;
                  break L7;
                }
                L9: {
                  if (ad.field_h) {
                    L10: {
                      kf.field_s = true;
                      sn.field_l = true;
                      nl.field_X = true;
                      if (ti.field_B != null) {
                        break L10;
                      } else {
                        if ((ij.field_Y ^ -1) <= -1) {
                          break L10;
                        } else {
                          if (null != hm.field_a) {
                            if (fg.field_Ob != 0) {
                              if ((fg.field_Ob & 16) != 0) {
                                discarded$44 = ak.a(hm.field_a, 83);
                                break L10;
                              } else {
                                if ((2 & fg.field_Ob) == 0) {
                                  break L10;
                                } else {
                                  discarded$45 = oc.a(4, hm.field_a);
                                  break L10;
                                }
                              }
                            } else {
                              vb.a(hm.field_a, (byte) 19);
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    ad.field_h = false;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L11: {
                  L12: {
                    if (!kf.field_s) {
                      break L12;
                    } else {
                      if (lg.field_l) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  if (0 == pm.field_U) {
                    var3_ref_gh__ = wc.field_h;
                    var4 = 0;
                    L13: while (true) {
                      if (var3_ref_gh__.length <= var4) {
                        L14: {
                          if (kf.field_s) {
                            pb.a(bl.field_c.field_Rb, bl.field_c.field_cb, bl.field_c.field_zb, bl.field_c.field_Lb, 0);
                            bl.field_c.a(true, (byte) 127);
                            kf.field_s = false;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        if (!lg.field_l) {
                          break L3;
                        } else {
                          pb.a(kk.field_a.field_Rb, kk.field_a.field_cb, kk.field_a.field_zb, kk.field_a.field_Lb, 0);
                          kk.field_a.a(true, (byte) 126);
                          lg.field_l = false;
                          break L3;
                        }
                      } else {
                        var5_ref_gh = var3_ref_gh__[var4];
                        var5_ref_gh.a(true, (byte) 126);
                        var4++;
                        continue L13;
                      }
                    }
                  } else {
                    break L11;
                  }
                }
                gd.field_jb.a(true, (byte) 127);
                kf.field_s = false;
                lg.field_l = false;
                break L3;
              } else {
                break L3;
              }
            }
            L15: {
              var3 = -68 / ((param0 - 80) / 33);
              if (hl.field_v == null) {
                L16: {
                  if (uc.field_b == null) {
                    uc.field_b = ua.field_x;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                hl.field_v = ji.a(uc.field_b, (byte) 109, di.field_c);
                hl.field_v.b(6993661, 83);
                break L15;
              } else {
                break L15;
              }
            }
            L17: {
              var4 = 364;
              var5 = 59;
              var6 = 4096;
              var7 = uc.field_b[0];
              if (0 != var7) {
                if ((var7 ^ -1) != -56) {
                  if (-58 != (var7 ^ -1)) {
                    if (62 == var7) {
                      var5 += 270;
                      var4 += 10;
                      break L17;
                    } else {
                      if ((var7 ^ -1) != -66) {
                        if (69 == var7) {
                          var5 += 280;
                          break L17;
                        } else {
                          if ((var7 ^ -1) == -73) {
                            var6 -= 800;
                            var5 += 260;
                            break L17;
                          } else {
                            if (var7 == 75) {
                              var6 -= 200;
                              var4 -= 8;
                              var5 += 290;
                              break L17;
                            } else {
                              if (var7 == 79) {
                                var5 += 290;
                                break L17;
                              } else {
                                if (-85 == (var7 ^ -1)) {
                                  var4 += 12;
                                  var5 += 290;
                                  break L17;
                                } else {
                                  if (var7 != 88) {
                                    if (-93 != (var7 ^ -1)) {
                                      break L17;
                                    } else {
                                      var5 += 290;
                                      var6 -= 1300;
                                      break L17;
                                    }
                                  } else {
                                    var6 -= 400;
                                    var4 += 25;
                                    var5 += 290;
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var5 += 290;
                        break L17;
                      }
                    }
                  } else {
                    var5 += 280;
                    break L17;
                  }
                } else {
                  var5 += 280;
                  break L17;
                }
              } else {
                var5 += 280;
                break L17;
              }
            }
            L18: {
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
                break L18;
              } else {
                if (null == gd.field_jb) {
                  break L18;
                } else {
                  L19: {
                    vh.field_a = var5;
                    b.field_c = var4 + qa.field_M;
                    ti.field_y = vh.field_a;
                    en.field_d = b.field_c;
                    lh.field_t = vh.field_a;
                    nj.field_V = b.field_c;
                    pb.a(221, 60, 629, 432);
                    if (var1_int != 0) {
                      break L19;
                    } else {
                      L20: {
                        var8 = null;
                        if ((hl.field_v.field_N ^ -1) == -70) {
                          var33 = hl.field_v.a(0, 2);
                          if (var33 == null) {
                            break L20;
                          } else {
                            if (null != var33.field_d) {
                              vk.field_r.a(var4 - -qa.field_M - -40, var5 - 135);
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                        } else {
                          break L20;
                        }
                      }
                      L21: {
                        if ((hl.field_v.field_N ^ -1) != -76) {
                          break L21;
                        } else {
                          var34 = hl.field_v.a(0, 2);
                          if (var34 == null) {
                            break L21;
                          } else {
                            if (null == var34.field_d) {
                              break L21;
                            } else {
                              vk.field_r.a(4 + qa.field_M + var4, -178 + var5);
                              if (-96 != (var34.field_d.field_N ^ -1)) {
                                break L21;
                              } else {
                                vk.field_r.a(var4 + qa.field_M + 10, -175 + var5);
                                break L21;
                              }
                            }
                          }
                        }
                      }
                      L22: {
                        if ((hl.field_v.field_N ^ -1) != -58) {
                          break L22;
                        } else {
                          var35 = hl.field_v.a(0, 2);
                          if (var35 == null) {
                            break L22;
                          } else {
                            if (null == var35.field_d) {
                              break L22;
                            } else {
                              vk.field_r.a(-3 + qa.field_M + var4, var5 - 156);
                              break L22;
                            }
                          }
                        }
                      }
                      L23: {
                        if (55 == hl.field_v.field_N) {
                          var36 = hl.field_v.a(0, 2);
                          if (var36 == null) {
                            break L23;
                          } else {
                            if (var36.field_d == null) {
                              break L23;
                            } else {
                              if (var36.field_d.field_N != 95) {
                                break L23;
                              } else {
                                vk.field_r.e(35 + qa.field_M + var4, var5 - 130);
                                break L23;
                              }
                            }
                          }
                        } else {
                          break L23;
                        }
                      }
                      hl.field_v.a(0, true, b.field_c, vh.field_a, (byte) 49, 0);
                      break L19;
                    }
                  }
                  L24: {
                    pb.c();
                    if (-58 != (qa.field_M ^ -1)) {
                      break L24;
                    } else {
                      if (var1_int == 0) {
                        L25: {
                          var8_int = lh.field_t;
                          if (hl.field_v.field_N == 84) {
                            var8_int -= 50;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        pb.d(308, ti.field_y, var8_int - ti.field_y, 3355443);
                        pb.g(308, ti.field_y, 8, 3355443);
                        pb.g(308, var8_int, 8, 3355443);
                        var9 = (var8_int + -ti.field_y) * 2000 / hj.field_w;
                        fk.field_d.c(db.a(de.field_e, -123, new String[]{Integer.toString(var9 / 10), Integer.toString(var9 % 10)}), 307, (ti.field_y - -var8_int) / 2, 4473924, -1);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L26: {
                    var8_int = -qa.field_M + 657;
                    if ((var8_int ^ -1) <= -641) {
                      break L26;
                    } else {
                      if (var1_int != 0) {
                        break L26;
                      } else {
                        var9 = Math.min(365, lh.field_t);
                        var10 = 18 * hj.field_w / 2000;
                        vk.field_q.c(var8_int, -8 + var9 - var10, 7 * hj.field_w / 2000, var10);
                        if (qa.field_M != 57) {
                          break L26;
                        } else {
                          pb.d(-10 + var8_int, -8 + (var9 - var10), var10, 3355443);
                          pb.g(var8_int + -10, -var10 + var9 - 8, 8, 3355443);
                          pb.g(var8_int - 10, -8 + var9, 8, 3355443);
                          var11_ref_String = db.a(de.field_e, -60, new String[]{Integer.toString(1), Integer.toString(8)});
                          fk.field_d.c(var11_ref_String, var8_int - 12, -8 + var9 - var10 / 2 - -3, 4473924, -1);
                          break L26;
                        }
                      }
                    }
                  }
                  L27: {
                    hj.field_w = var6;
                    if (li.field_v <= 0) {
                      break L27;
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
                      L28: while (true) {
                        if (var13_int <= var16) {
                          pb.h(-2 + var11, -2 + var12, 4 + var9, 4 + var10, 4408131);
                          fk.field_d.c(jb.field_E + var14, var11 - -var9, -4 + var12, 16777215, -1);
                          break L27;
                        } else {
                          var17 = var11 + var16 * var9 / var13_int;
                          pb.d(var17, var12, var10, 0);
                          var16 += 100;
                          continue L28;
                        }
                      }
                    }
                  }
                  L29: {
                    var9 = 0;
                    var10 = 0;
                    var7 = hl.field_v.e((byte) -85);
                    var11 = 0;
                    var12 = (int)((double)hl.field_v.h(-31496) / Math.sqrt((double)hl.field_v.g(8192)));
                    var13_int = (int)((double)hl.field_v.j(0) / Math.sqrt((double)hl.field_v.g(8192)));
                    if (-1 < (var12 ^ -1)) {
                      var12 = 0;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (var13_int < 0) {
                      var13_int = 0;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  var14 = 0;
                  var15_int = 0;
                  var16 = 0;
                  var17 = 0;
                  L31: while (true) {
                    if (var17 >= hl.field_v.i(-117)) {
                      L32: {
                        if (var14 == 0) {
                          break L32;
                        } else {
                          var12 = 17 * var12 / 10;
                          break L32;
                        }
                      }
                      L33: {
                        if (var16 == 0) {
                          break L33;
                        } else {
                          var10 += 15;
                          var9 += 3800;
                          var11 += 25;
                          var7 = 6100;
                          break L33;
                        }
                      }
                      L34: {
                        if (var15_int != 0) {
                          var13_int = 17 * var13_int / 10;
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                      L35: {
                        var12 -= 5;
                        if (null == hl.field_v.a(59, (byte) -103)) {
                          break L35;
                        } else {
                          var12 += 5;
                          break L35;
                        }
                      }
                      L36: {
                        if (-1 >= (var12 ^ -1)) {
                          break L36;
                        } else {
                          var12 = 0;
                          break L36;
                        }
                      }
                      L37: {
                        var10 += 2;
                        var11++;
                        if (-21 > (var12 ^ -1)) {
                          var12 = 20;
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                      L38: {
                        ei.field_t = var10;
                        if (var1_int == 0) {
                          L39: {
                            var37 = new String[]{"<img=0>", "<img=5>", "<img=4>", "<img=7>", "<img=2>", "<img=3>"};
                            var18_ref_int__ = new int[]{0, 0, 0, 0, 0, 0};
                            var19_ref_int__ = new int[]{1000, 1000, 10, 11, 10, 20};
                            var18_ref_int__[0] = hl.field_v.g(8192);
                            var18_ref_int__[4] = var12;
                            var18_ref_int__[3] = var11;
                            if (var16 == 0) {
                              break L39;
                            } else {
                              var18_ref_int__[0] = var18_ref_int__[0] * 2;
                              break L39;
                            }
                          }
                          var18_ref_int__[2] = var10;
                          var18_ref_int__[1] = var9;
                          var18_ref_int__[5] = var13_int;
                          var20 = 220;
                          var21 = 394;
                          var22 = 100;
                          var23 = 0;
                          L40: while (true) {
                            if (-7 >= (var23 ^ -1)) {
                              break L38;
                            } else {
                              L41: {
                                fk.field_d.b(var37[var23], var20, var21, 0, -1);
                                if (oh.field_f >= var20) {
                                  if (oh.field_f < 18 + var20 - -var22) {
                                    if (pi.field_c >= var21 + -10) {
                                      if (1 + var21 > pi.field_c) {
                                        stackOut_227_0 = 1;
                                        stackIn_229_0 = stackOut_227_0;
                                        break L41;
                                      } else {
                                        stackOut_226_0 = 0;
                                        stackIn_229_0 = stackOut_226_0;
                                        break L41;
                                      }
                                    } else {
                                      stackOut_224_0 = 0;
                                      stackIn_229_0 = stackOut_224_0;
                                      break L41;
                                    }
                                  } else {
                                    stackOut_222_0 = 0;
                                    stackIn_229_0 = stackOut_222_0;
                                    break L41;
                                  }
                                } else {
                                  stackOut_220_0 = 0;
                                  stackIn_229_0 = stackOut_220_0;
                                  break L41;
                                }
                              }
                              L42: {
                                var24_int = stackIn_229_0;
                                pb.h(var20 + 18, var21 - 10, var22, 11, 1400960);
                                if (var18_ref_int__[var23] <= var19_ref_int__[var23] * 2) {
                                  if (var18_ref_int__[var23] > var19_ref_int__[var23]) {
                                    pb.a(18 + var20 + 2, 2 + (var21 + -10), -4 + var22, 7, 8421504);
                                    pb.a(2 + (var20 + 18), var21 - 10 - -2, (var18_ref_int__[var23] + -var19_ref_int__[var23]) * (-4 + var22) / var19_ref_int__[var23], 7, 16777215);
                                    break L42;
                                  } else {
                                    if (var18_ref_int__[var23] > 0) {
                                      pb.a(var20 + 18 - -2, -10 + (var21 - -2), var18_ref_int__[var23] * (-4 + var22) / var19_ref_int__[var23], 7, 8421504);
                                      break L42;
                                    } else {
                                      pb.h(var20 + 18, var21 - 10, var22, 11, 8400933);
                                      break L42;
                                    }
                                  }
                                } else {
                                  pb.a(2 + var20 - -18, 2 + var21 - 10, var22 - 4, 7, 16777215);
                                  break L42;
                                }
                              }
                              L43: {
                                if (var23 <= 1) {
                                  var25 = 100;
                                  L44: while (true) {
                                    if (var19_ref_int__[var23] <= var25) {
                                      break L43;
                                    } else {
                                      pb.f(var25 * (-4 + var22) / var19_ref_int__[var23] + var20 + 18 + 2, 2 + var21 + -10, 7, 4473924, 192);
                                      var25 += 100;
                                      continue L44;
                                    }
                                  }
                                } else {
                                  if (var23 == 2) {
                                    var25 = 1;
                                    L45: while (true) {
                                      if (var19_ref_int__[var23] <= var25) {
                                        break L43;
                                      } else {
                                        pb.f(20 + var20 + (var22 + -4) * var25 / var19_ref_int__[var23], var21 + -10 - -2, 7, 4473924, 192);
                                        var25++;
                                        continue L45;
                                      }
                                    }
                                  } else {
                                    break L43;
                                  }
                                }
                              }
                              L46: {
                                if (var24_int != 0) {
                                  L47: {
                                    var25 = 18 + var20 + var22 / 2;
                                    var26 = 12;
                                    var27 = -var26 + 382;
                                    var28_ref = null;
                                    var29_ref = null;
                                    var30 = var18_ref_int__[var23];
                                    var31 = var23;
                                    if (var31 == 3) {
                                      var30 = var30 * 50 / 3;
                                      break L47;
                                    } else {
                                      if (-5 == (var31 ^ -1)) {
                                        var30 = var30 * 100 / 10;
                                        break L47;
                                      } else {
                                        if (5 != var31) {
                                          break L47;
                                        } else {
                                          var30 = 100 * var30 / 20;
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                  L48: {
                                    var38 = jj.field_h[var23 * 2];
                                    var29_ref_String = db.a(jj.field_h[2 * var23 + 1], -124, new String[]{Integer.toString(var30)});
                                    if (var18_ref_int__[var23] == 0) {
                                      var29_ref_String = ej.field_E;
                                      break L48;
                                    } else {
                                      break L48;
                                    }
                                  }
                                  var39 = var38 + ": " + var29_ref_String;
                                  var31 = fk.field_d.c(var39) - -8;
                                  var25 = var25 - var31 / 2;
                                  pb.c(var25, var27, var31, var26, 0, 192);
                                  pb.h(var25, var27, var31, var26, 1400960, 192);
                                  fk.field_d.b(var39, 4 + var25, var27 - -10, 41727, -1);
                                  break L46;
                                } else {
                                  break L46;
                                }
                              }
                              L49: {
                                if (0 == var23 % 2) {
                                  var20 += 120;
                                  break L49;
                                } else {
                                  var20 -= 120;
                                  var21 += 15;
                                  break L49;
                                }
                              }
                              var23++;
                              continue L40;
                            }
                          }
                        } else {
                          break L38;
                        }
                      }
                      if (fg.field_Ob == 1) {
                        break L18;
                      } else {
                        if (0 < (fg.field_Ob & 2)) {
                          var42 = hm.field_a;
                          if (var42 == null) {
                            break L18;
                          } else {
                            L50: {
                              if (lg.field_l) {
                                break L50;
                              } else {
                                if (var2 != 0) {
                                  break L50;
                                } else {
                                  if (!nl.field_X) {
                                    break L18;
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                            }
                            discarded$46 = oc.a(4, var42);
                            lg.field_l = true;
                            break L18;
                          }
                        } else {
                          if (-1 > (fg.field_Ob & 16 ^ -1)) {
                            var41 = hm.field_a;
                            if (var41 == null) {
                              break L18;
                            } else {
                              L51: {
                                if (lg.field_l) {
                                  break L51;
                                } else {
                                  if (var2 != 0) {
                                    break L51;
                                  } else {
                                    if (nl.field_X) {
                                      break L51;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                              discarded$47 = ak.a(var41, 87);
                              lg.field_l = true;
                              break L18;
                            }
                          } else {
                            if (fg.field_Ob == 0) {
                              var40 = kk.field_a;
                              if (var40 == null) {
                                break L18;
                              } else {
                                L52: {
                                  if (lg.field_l) {
                                    break L52;
                                  } else {
                                    if (var2 != 0) {
                                      break L52;
                                    } else {
                                      if (nl.field_X) {
                                        break L52;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                                vb.a(var40, (byte) 19);
                                lg.field_l = true;
                                break L18;
                              }
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                    } else {
                      L53: {
                        var18 = di.field_c[var17];
                        if (-1 != (var18 ^ -1)) {
                          if (var18 != 1) {
                            if ((var18 ^ -1) == -3) {
                              var11 += 3;
                              break L53;
                            } else {
                              if ((var18 ^ -1) == -4) {
                                var11 += 4;
                                break L53;
                              } else {
                                if (-5 == (var18 ^ -1)) {
                                  var11 += 5;
                                  break L53;
                                } else {
                                  if (-21 != (var18 ^ -1)) {
                                    if (-6 != (var18 ^ -1)) {
                                      if ((var18 ^ -1) == -7) {
                                        var10 += 2;
                                        break L53;
                                      } else {
                                        if (-8 == (var18 ^ -1)) {
                                          var10 += 3;
                                          break L53;
                                        } else {
                                          if ((var18 ^ -1) == -9) {
                                            var10 += 4;
                                            break L53;
                                          } else {
                                            if (var18 != 9) {
                                              if (var18 == 10) {
                                                var9 += 100;
                                                break L53;
                                              } else {
                                                if (var18 != 11) {
                                                  if (-13 != (var18 ^ -1)) {
                                                    if ((var18 ^ -1) == -14) {
                                                      var9 += 1000;
                                                      break L53;
                                                    } else {
                                                      if (14 != var18) {
                                                        if (-29 != (var18 ^ -1)) {
                                                          if (29 == var18) {
                                                            var15_int = 1;
                                                            break L53;
                                                          } else {
                                                            if ((var18 ^ -1) == -35) {
                                                              var16 = 1;
                                                              var14 = 1;
                                                              var15_int = 1;
                                                              break L53;
                                                            } else {
                                                              break L53;
                                                            }
                                                          }
                                                        } else {
                                                          var14 = 1;
                                                          break L53;
                                                        }
                                                      } else {
                                                        var9 += 2000;
                                                        break L53;
                                                      }
                                                    }
                                                  } else {
                                                    var9 += 500;
                                                    break L53;
                                                  }
                                                } else {
                                                  var9 += 200;
                                                  break L53;
                                                }
                                              }
                                            } else {
                                              var10 += 5;
                                              break L53;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var10++;
                                      break L53;
                                    }
                                  } else {
                                    var11 += 10;
                                    break L53;
                                  }
                                }
                              }
                            }
                          } else {
                            var11 += 2;
                            break L53;
                          }
                        } else {
                          var11++;
                          break L53;
                        }
                      }
                      if (0 != (di.field_c[var17] ^ -1)) {
                        var7 = var7 + dn.field_Sb[di.field_c[var17]];
                        var17++;
                        continue L31;
                      } else {
                        var17++;
                        continue L31;
                      }
                    }
                  }
                }
              }
            }
            L54: {
              if (1 == dc.field_g) {
                break L54;
              } else {
                if (dc.field_g == 0) {
                  break L54;
                } else {
                  m.a(12, 140, 7786, 484, var7, 412);
                  break L54;
                }
              }
            }
            L55: {
              if (ti.field_B == null) {
                break L55;
              } else {
                if ((oh.field_f ^ -1) <= -1) {
                  L56: {
                    if (f.field_A != null) {
                      f.field_A.a(0, false, oh.field_f, pi.field_c, (byte) 49, 8192);
                      break L56;
                    } else {
                      break L56;
                    }
                  }
                  ti.field_B.a(0, false, oh.field_f, pi.field_c, (byte) 49, 16384);
                  break L55;
                } else {
                  break L55;
                }
              }
            }
            L57: {
              if ((ij.field_Y ^ -1) == 0) {
                break L57;
              } else {
                if (-1 >= (oh.field_f ^ -1)) {
                  ie.field_d[ij.field_Y].a(oh.field_f - 20, pi.field_c + -20);
                  break L57;
                } else {
                  break L57;
                }
              }
            }
            L58: {
              if (0 == (fg.field_Ob & 1)) {
                re.field_eb = -1;
                break L58;
              } else {
                L59: {
                  var8_int = 224;
                  var9 = 62;
                  var10 = 401;
                  var11 = 20;
                  var12 = 60;
                  var13_int = ul.a((byte) -42, uc.field_b[0]);
                  if (re.field_eb != var13_int) {
                    L60: {
                      L61: {
                        re.field_eb = var13_int;
                        s.field_a = a.field_c;
                        var14 = 20;
                        jj.field_e.d();
                        pb.a(0, 0, jj.field_e.field_z, jj.field_e.field_B, 0);
                        pb.a(0, 0, var14, var14);
                        if (0 > var13_int) {
                          break L61;
                        } else {
                          if (var13_int >= si.field_E.length) {
                            break L61;
                          } else {
                            break L60;
                          }
                        }
                      }
                      var13_int = 0;
                      break L60;
                    }
                    si.field_E[var13_int].c(0, 0, 4 * var14, 4 * var14);
                    pb.c();
                    sb.field_bb.b((byte) 122);
                    break L59;
                  } else {
                    break L59;
                  }
                }
                if (0 > var13_int) {
                  break L58;
                } else {
                  if (ig.field_g.length <= var13_int) {
                    break L58;
                  } else {
                    if (var1_int != 0) {
                      break L58;
                    } else {
                      L62: {
                        pb.c(var8_int, var9, var10, var11, 0, 150);
                        pb.h(var8_int, var9, var10, var11, 1397105);
                        var43 = ig.field_g[var13_int];
                        pb.a(var8_int - -1, 1 + var9, var10 + (var8_int + -1), var9 - (-var11 - -1));
                        var15_int = fk.field_d.c(var43);
                        var16 = a.field_c - s.field_a;
                        if (var16 <= var10 + (var15_int + var12)) {
                          break L62;
                        } else {
                          var16 = var10 + (-var10 + var16) % (var15_int - -var12);
                          break L62;
                        }
                      }
                      var17 = (var12 + 14) / 2 + -var16 + (var10 + var8_int);
                      L63: while (true) {
                        if (var17 - var12 + -14 >= var8_int - -var10) {
                          pb.c();
                          break L58;
                        } else {
                          fk.field_d.b(var43, var17, -6 + (var11 + var9), 11119017, -1);
                          var17 = var17 + (var15_int - -var12);
                          continue L63;
                        }
                      }
                    }
                  }
                }
              }
            }
            L64: {
              var8_ref = fk.field_d;
              if ((dc.field_g ^ -1) == -16) {
                pa.field_d[dc.field_g].b(-40);
                break L64;
              } else {
                break L64;
              }
            }
            L65: {
              if ((fg.field_Ob ^ -1) != -2) {
                break L65;
              } else {
                if (0 > t.field_h) {
                  break L65;
                } else {
                  if (!df.field_K) {
                    break L65;
                  } else {
                    L66: {
                      if (dc.field_g < 0) {
                        break L66;
                      } else {
                        if (pa.field_d[dc.field_g].a(t.field_h, -118)) {
                          break L66;
                        } else {
                          break L65;
                        }
                      }
                    }
                    var64 = ne.a(t.field_h, (byte) 28);
                    var47 = var64;
                    var9_ref_int__ = var47;
                    var66 = ki.b(t.field_h, (byte) -81);
                    var49 = var66;
                    var10_ref_int__ = var49;
                    var11 = 0;
                    var12 = 0;
                    var73 = var9_ref_int__;
                    var14 = 0;
                    L67: while (true) {
                      if (var14 >= var73.length) {
                        var74 = var10_ref_int__;
                        var14 = 0;
                        L68: while (true) {
                          if (var74.length <= var14) {
                            L69: {
                              var46 = new StringBuilder("<col=ffffff>");
                              discarded$48 = var46.append(t.field_e[t.field_h]);
                              discarded$49 = var46.append("</col> <col=0080ff>");
                              var14 = var11 + -var12;
                              var12 = var12 * 100 / var11;
                              discarded$50 = var46.append(Integer.toString(var12));
                              discarded$51 = var46.append(mm.field_c);
                              discarded$52 = var46.append("</col>");
                              discarded$53 = var46.append(qm.field_e);
                              if ((var64.length ^ -1) < -1) {
                                discarded$54 = var46.append(v.field_c);
                                var75 = var9_ref_int__;
                                var16 = 0;
                                L70: while (true) {
                                  if (var16 >= var75.length) {
                                    if (0 < var66.length) {
                                      discarded$55 = var46.append(re.field_X);
                                      break L69;
                                    } else {
                                      break L69;
                                    }
                                  } else {
                                    L71: {
                                      var17 = var75[var16];
                                      discarded$56 = var46.append("<br>  ");
                                      if (!t.a(rn.field_D, var17, -20370)) {
                                        stackOut_343_0 = 0;
                                        stackIn_344_0 = stackOut_343_0;
                                        break L71;
                                      } else {
                                        stackOut_342_0 = 1;
                                        stackIn_344_0 = stackOut_342_0;
                                        break L71;
                                      }
                                    }
                                    L72: {
                                      var18 = stackIn_344_0;
                                      if (var18 == 0) {
                                        discarded$57 = var46.append("<col=808080>");
                                        break L72;
                                      } else {
                                        discarded$58 = var46.append("<col=0080ff>");
                                        break L72;
                                      }
                                    }
                                    L73: {
                                      discarded$59 = var46.append(t.field_e[var17]);
                                      discarded$60 = var46.append("</col>");
                                      if (var18 == 0) {
                                        discarded$61 = var46.append(" (<img=24>");
                                        discarded$62 = var46.append(sj.field_v[var17]);
                                        discarded$63 = var46.append(")");
                                        break L73;
                                      } else {
                                        break L73;
                                      }
                                    }
                                    var16++;
                                    continue L70;
                                  }
                                }
                              } else {
                                break L69;
                              }
                            }
                            L74: {
                              if ((var66.length ^ -1) >= -1) {
                                break L74;
                              } else {
                                L75: {
                                  if (-2 != (var66.length ^ -1)) {
                                    discarded$64 = var46.append(dk.field_i);
                                    break L75;
                                  } else {
                                    discarded$65 = var46.append(ed.field_g);
                                    break L75;
                                  }
                                }
                                var76 = var10_ref_int__;
                                var16 = 0;
                                L76: while (true) {
                                  if (var16 >= var76.length) {
                                    break L74;
                                  } else {
                                    L77: {
                                      var17 = var76[var16];
                                      discarded$66 = var46.append("<br>  ");
                                      if (!t.a(fe.field_D, var17, -20370)) {
                                        stackOut_362_0 = 0;
                                        stackIn_363_0 = stackOut_362_0;
                                        break L77;
                                      } else {
                                        stackOut_361_0 = 1;
                                        stackIn_363_0 = stackOut_361_0;
                                        break L77;
                                      }
                                    }
                                    L78: {
                                      var18 = stackIn_363_0;
                                      if (var18 == 0) {
                                        discarded$67 = var46.append("<col=808080>");
                                        break L78;
                                      } else {
                                        discarded$68 = var46.append("<col=0080ff>");
                                        break L78;
                                      }
                                    }
                                    L79: {
                                      if (34 == var17) {
                                        discarded$69 = var46.append("GODULE");
                                        break L79;
                                      } else {
                                        discarded$70 = var46.append(rj.field_m[var17]);
                                        break L79;
                                      }
                                    }
                                    L80: {
                                      discarded$71 = var46.append("</col>");
                                      if (var18 != 0) {
                                        break L80;
                                      } else {
                                        discarded$72 = var46.append(" (<img=24>");
                                        discarded$73 = var46.append(qf.field_h[var17]);
                                        discarded$74 = var46.append(")");
                                        break L80;
                                      }
                                    }
                                    var16++;
                                    continue L76;
                                  }
                                }
                              }
                            }
                            L81: {
                              if (li.field_v < var14) {
                                discarded$75 = var46.append("<br><br><col=ff2020>");
                                discarded$76 = var46.append(mm.field_f);
                                discarded$77 = var46.append("<img=22>");
                                break L81;
                              } else {
                                discarded$78 = var46.append("<br><br><col=00ff00>");
                                discarded$79 = var46.append(mm.field_f);
                                discarded$80 = var46.append("<img=21>");
                                break L81;
                              }
                            }
                            discarded$81 = var46.append(var14);
                            discarded$82 = var46.append("</col>");
                            var51 = var46.toString();
                            var16 = 250;
                            var17 = ((mi) ((Object) var8_ref)).field_G - -((mi) ((Object) var8_ref)).field_F;
                            var18 = 5 + (5 + ((mi) ((Object) var8_ref)).a(var51, -20 + var16, var17));
                            var19 = 228;
                            var20 = 16777215;
                            var21 = -var18 + 378;
                            pb.c(var19, var21, var16, var18, 0, 200);
                            pb.h(var19, var21, var16, var18, var20);
                            discarded$83 = ((mi) ((Object) var8_ref)).a(var51, 10 + var19, 5 + var21, -20 + var16, var18, 8421504, 0, 0, 0, var17);
                            break L65;
                          } else {
                            var15_int = var74[var14];
                            var16 = qf.field_h[var15_int];
                            var11 = var11 + var16;
                            if (t.a(fe.field_D, var15_int, -20370)) {
                              var12 = var12 + var16;
                              var14++;
                              continue L68;
                            } else {
                              var14++;
                              continue L68;
                            }
                          }
                        }
                      } else {
                        L82: {
                          var15_int = var73[var14];
                          var16 = sj.field_v[var15_int];
                          if (t.a(rn.field_D, var15_int, -20370)) {
                            var12 = var12 + var16;
                            break L82;
                          } else {
                            break L82;
                          }
                        }
                        var11 = var11 + var16;
                        var14++;
                        continue L67;
                      }
                    }
                  }
                }
              }
            }
            L83: {
              L84: {
                var9 = -1;
                var10 = -1;
                var11 = -1;
                if (0 == fg.field_Ob) {
                  break L84;
                } else {
                  if ((18 & fg.field_Ob) != 0) {
                    break L84;
                  } else {
                    break L83;
                  }
                }
              }
              L85: {
                if (0 <= pa.field_e) {
                  var9 = di.field_c[pa.field_e];
                  break L85;
                } else {
                  break L85;
                }
              }
              L86: {
                if ((t.field_h ^ -1) <= -1) {
                  var9 = t.field_h;
                  break L86;
                } else {
                  break L86;
                }
              }
              if (pa.field_e < 0) {
                break L83;
              } else {
                if ((var9 ^ -1) > -1) {
                  var10 = pa.field_e;
                  break L83;
                } else {
                  break L83;
                }
              }
            }
            L87: {
              var12 = -1;
              if (-1 == (fg.field_Ob & 18 ^ -1)) {
                break L87;
              } else {
                if (var9 >= 0) {
                  break L87;
                } else {
                  if (null == lj.field_h) {
                    break L87;
                  } else {
                    L88: {
                      if (lj.field_h.field_d != null) {
                        var9 = lj.field_h.field_d.field_N;
                        var53 = lj.field_h.field_d;
                        var11 = var53.field_K;
                        var12 = var53.field_W;
                        break L88;
                      } else {
                        var10 = lj.field_h.field_q;
                        var52 = lj.field_h;
                        var12 = var52.field_j;
                        var11 = var52.field_m;
                        break L88;
                      }
                    }
                    L89: {
                      if ((fg.field_Ob & 16) == 0) {
                        break L89;
                      } else {
                        if (83 == var9) {
                          break L89;
                        } else {
                          L90: {
                            if (var10 < 0) {
                              break L90;
                            } else {
                              var11 -= 1024;
                              var12 += 1024;
                              break L90;
                            }
                          }
                          var11 += 1365;
                          var11 = var11 - var11 % 2730;
                          var12 += 1365;
                          var12 = var12 - var12 % 2731;
                          var11 -= 16384;
                          var12 -= 16384;
                          break L87;
                        }
                      }
                    }
                    var11 = -1;
                    var12 = -1;
                    break L87;
                  }
                }
              }
            }
            L91: {
              if (-1 != (fg.field_Ob & 1 ^ -1)) {
                var13_int = oe.field_i;
                oe.field_i = -1;
                var14 = 0;
                L92: while (true) {
                  if (var14 >= 12) {
                    sb.field_bb.b((byte) 124);
                    break L91;
                  } else {
                    var54 = jg.field_h[var14];
                    if (var54 != null) {
                      L93: {
                        L94: {
                          L95: {
                            if (ni.b(63)) {
                              break L95;
                            } else {
                              if ((rd.field_b ^ -1) < -1) {
                                break L94;
                              } else {
                                break L95;
                              }
                            }
                          }
                          if (!oc.a(n.field_z[var14], -120, false)) {
                            break L94;
                          } else {
                            stackOut_411_0 = 1;
                            stackIn_413_0 = stackOut_411_0;
                            break L93;
                          }
                        }
                        stackOut_412_0 = 0;
                        stackIn_413_0 = stackOut_412_0;
                        break L93;
                      }
                      var16 = stackIn_413_0;
                      if (var16 == 0) {
                        if (t.a(rn.field_D, n.field_z[var14], -20370)) {
                          L96: {
                            L97: {
                              if (oh.field_f < var54.field_Rb) {
                                break L97;
                              } else {
                                if (-191 >= (oh.field_f ^ -1)) {
                                  break L97;
                                } else {
                                  if (var54.field_cb > pi.field_c) {
                                    break L97;
                                  } else {
                                    if (pi.field_c >= var54.field_cb + var54.field_Lb) {
                                      break L97;
                                    } else {
                                      stackOut_421_0 = 1;
                                      stackIn_423_0 = stackOut_421_0;
                                      break L96;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_422_0 = 0;
                            stackIn_423_0 = stackOut_422_0;
                            break L96;
                          }
                          L98: {
                            var17 = stackIn_423_0;
                            var18 = 0;
                            if (var17 == 0) {
                              break L98;
                            } else {
                              L99: {
                                oe.field_i = var14;
                                if (var13_int == oe.field_i) {
                                  break L99;
                                } else {
                                  nc.field_f = a.field_c;
                                  ee.c(-2483, 97);
                                  break L99;
                                }
                              }
                              var18 = (-nc.field_f + a.field_c) / 6 % 15;
                              break L98;
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
                          var22 = (var18 >> 555289954) * var19;
                          var20_ref_wk.a(-var21, -var22);
                          var14++;
                          continue L92;
                        } else {
                          var14++;
                          continue L92;
                        }
                      } else {
                        var14++;
                        continue L92;
                      }
                    } else {
                      var14++;
                      continue L92;
                    }
                  }
                }
              } else {
                oe.field_i = -1;
                break L91;
              }
            }
            L100: {
              if (0 <= dc.field_g) {
                L101: {
                  var13_int = -1;
                  if (var9 >= 0) {
                    var13_int = var9;
                    break L101;
                  } else {
                    if (0 > var10) {
                      break L101;
                    } else {
                      var13_int = var10;
                      break L101;
                    }
                  }
                }
                if (0 > var13_int) {
                  break L100;
                } else {
                  if (pa.field_d[dc.field_g].a(var13_int, -111)) {
                    break L100;
                  } else {
                    var10 = -1;
                    var9 = -1;
                    break L100;
                  }
                }
              } else {
                break L100;
              }
            }
            L102: {
              L103: {
                if ((var10 ^ -1) > -1) {
                  break L103;
                } else {
                  if (fg.field_Ob == 0) {
                    L104: {
                      if (nm.field_w == var10) {
                        break L104;
                      } else {
                        ee.c(-2483, 97);
                        nm.field_w = var10;
                        lg.field_l = true;
                        break L104;
                      }
                    }
                    var10 = -1;
                    break L102;
                  } else {
                    break L103;
                  }
                }
              }
              L105: {
                if (-2 != pa.field_e) {
                  break L105;
                } else {
                  if (fg.field_Ob == 0) {
                    if ((nm.field_w ^ -1) != 1) {
                      lg.field_l = true;
                      nm.field_w = -2;
                      ee.c(-2483, 97);
                      break L102;
                    } else {
                      break L102;
                    }
                  } else {
                    break L105;
                  }
                }
              }
              L106: {
                if (0 <= var9) {
                  break L106;
                } else {
                  if (-1 < (var10 ^ -1)) {
                    if (0 != (nm.field_w ^ -1)) {
                      nm.field_w = -1;
                      lg.field_l = true;
                      break L102;
                    } else {
                      break L102;
                    }
                  } else {
                    break L106;
                  }
                }
              }
              L107: {
                var13 = null;
                var14_ref = null;
                var15 = null;
                var16_ref_wk = null;
                if (0 > var10) {
                  if (0 != fg.field_Ob) {
                    if ((18 & fg.field_Ob) == 0) {
                      break L107;
                    } else {
                      L108: {
                        if (nm.field_w == var9) {
                          break L108;
                        } else {
                          ee.c(-2483, 97);
                          nm.field_w = var9;
                          lg.field_l = true;
                          break L108;
                        }
                      }
                      L109: {
                        L110: {
                          var13 = t.field_e[var9];
                          var14_ref = var13;
                          var14_ref = var13;
                          if ((var9 ^ -1) > -18) {
                            break L110;
                          } else {
                            if (var9 >= 17 + uh.field_i.length) {
                              break L110;
                            } else {
                              L111: {
                                var56 = db.field_g[-17 + var9];
                                var14_ref = var56;
                                var17 = ja.a(var9, false);
                                if (-1 < (var17 ^ -1)) {
                                  break L111;
                                } else {
                                  if (var17 >= li.field_B.length) {
                                    break L111;
                                  } else {
                                    var15 = db.a(im.field_c, -117, new String[]{li.field_B[var17]});
                                    var14_ref = var15;
                                    var14_ref = var15;
                                    var16_ref_wk = hb.field_j[var17];
                                    break L111;
                                  }
                                }
                              }
                              if (!bi.b(-90, var9)) {
                                break L109;
                              } else {
                                L112: {
                                  L113: {
                                    if (var14_ref == null) {
                                      break L113;
                                    } else {
                                      if ((var56.length() ^ -1) >= -1) {
                                        break L113;
                                      } else {
                                        var14_ref = var56 + "<br>";
                                        break L112;
                                      }
                                    }
                                  }
                                  var14_ref = "";
                                  break L112;
                                }
                                var14_ref = (String) (var14_ref) + al.field_h;
                                break L109;
                              }
                            }
                          }
                        }
                        var57 = km.a(var9, 112);
                        var14_ref = var57;
                        var21_ref = var14_ref;
                        var14_ref = var21_ref;
                        var14_ref = var57;
                        var14_ref = var57;
                        var58 = kk.a(ul.a(var9, (byte) 67), -4097);
                        var14_ref = var58;
                        var21_ref = var14_ref;
                        var14_ref = var21_ref;
                        var14_ref = var58;
                        if (var57 != null) {
                          if (var58 != null) {
                            var14_ref = var57 + "<br><br>" + var58;
                            break L109;
                          } else {
                            break L109;
                          }
                        } else {
                          var14_ref = var58;
                          break L109;
                        }
                      }
                      var17_ref_String = pl.a(109, var9);
                      var14_ref = var17_ref_String;
                      var21_ref = var14_ref;
                      var14_ref = var21_ref;
                      var14_ref = var17_ref_String;
                      if (var17_ref_String != null) {
                        var14_ref = (String) (var14_ref) + db.a(oa.field_H, -64, new String[]{var17_ref_String});
                        break L107;
                      } else {
                        break L107;
                      }
                    }
                  } else {
                    L114: {
                      if (nm.field_w == var9) {
                        break L114;
                      } else {
                        ee.c(-2483, 97);
                        lg.field_l = true;
                        nm.field_w = var9;
                        break L114;
                      }
                    }
                    L115: {
                      if ((var9 ^ -1) != -35) {
                        var14_ref = se.field_a[var9];
                        break L115;
                      } else {
                        var14_ref = "MOD ONLY MODULE: gives you ludicrous amounts of everything";
                        break L115;
                      }
                    }
                    L116: {
                      if (var9 != 34) {
                        var13 = rj.field_m[var9];
                        break L116;
                      } else {
                        var13 = "GODULE";
                        break L116;
                      }
                    }
                    L117: {
                      L118: {
                        L119: {
                          if (ni.b(51)) {
                            break L119;
                          } else {
                            if (-1 > (rd.field_b ^ -1)) {
                              break L118;
                            } else {
                              break L119;
                            }
                          }
                        }
                        if (!oc.a(var9, -81, true)) {
                          break L118;
                        } else {
                          stackOut_479_0 = 1;
                          stackIn_481_0 = stackOut_479_0;
                          break L117;
                        }
                      }
                      stackOut_480_0 = 0;
                      stackIn_481_0 = stackOut_480_0;
                      break L117;
                    }
                    var17 = stackIn_481_0;
                    if (var17 == 0) {
                      break L107;
                    } else {
                      var14_ref = of.field_b;
                      break L107;
                    }
                  }
                } else {
                  L120: {
                    if (nm.field_w == var10) {
                      break L120;
                    } else {
                      ee.c(-2483, 97);
                      nm.field_w = var10;
                      lg.field_l = true;
                      break L120;
                    }
                  }
                  L121: {
                    var17 = -2049 & var10;
                    if ((var17 ^ -1) != -3) {
                      if (4 != var17) {
                        if (8 == var17) {
                          var13 = ti.field_o;
                          break L121;
                        } else {
                          var13 = bc.field_nb;
                          var55 = dc.a(var10, 32);
                          if (-1 <= (var55.length() ^ -1)) {
                            var14_ref = null;
                            break L121;
                          } else {
                            var14_ref = db.a(wh.field_h, -68, new String[]{dc.a(var10, 32)});
                            break L121;
                          }
                        }
                      } else {
                        var13 = tc.field_r;
                        break L121;
                      }
                    } else {
                      var13 = im.field_e;
                      break L121;
                    }
                  }
                  if (0 == (kh.field_v.a((byte) 2, lj.field_h) ^ -1)) {
                    break L107;
                  } else {
                    if (var14_ref != null) {
                      var14_ref = (String) (var14_ref) + "<br><br>" + dg.field_c;
                      break L107;
                    } else {
                      var14_ref = dg.field_c;
                      break L107;
                    }
                  }
                }
              }
              L122: {
                L123: {
                  if (var10 >= 0) {
                    break L123;
                  } else {
                    L124: {
                      if (ni.b(57)) {
                        break L124;
                      } else {
                        if (0 < rd.field_b) {
                          break L123;
                        } else {
                          break L124;
                        }
                      }
                    }
                    L125: {
                      stackOut_509_0 = var9;
                      stackOut_509_1 = -86;
                      stackIn_511_0 = stackOut_509_0;
                      stackIn_511_1 = stackOut_509_1;
                      stackIn_510_0 = stackOut_509_0;
                      stackIn_510_1 = stackOut_509_1;
                      if (fg.field_Ob != 0) {
                        stackOut_511_0 = stackIn_511_0;
                        stackOut_511_1 = stackIn_511_1;
                        stackOut_511_2 = 0;
                        stackIn_512_0 = stackOut_511_0;
                        stackIn_512_1 = stackOut_511_1;
                        stackIn_512_2 = stackOut_511_2;
                        break L125;
                      } else {
                        stackOut_510_0 = stackIn_510_0;
                        stackOut_510_1 = stackIn_510_1;
                        stackOut_510_2 = 1;
                        stackIn_512_0 = stackOut_510_0;
                        stackIn_512_1 = stackOut_510_1;
                        stackIn_512_2 = stackOut_510_2;
                        break L125;
                      }
                    }
                    if (oc.a(stackIn_512_0, stackIn_512_1, stackIn_512_2 == 0)) {
                      break L123;
                    } else {
                      stackOut_513_0 = 1;
                      stackIn_515_0 = stackOut_513_0;
                      break L122;
                    }
                  }
                }
                stackOut_514_0 = 0;
                stackIn_515_0 = stackOut_514_0;
                break L122;
              }
              L126: {
                var17 = stackIn_515_0;
                if (var17 == 0) {
                  if (!he.a((byte) 122)) {
                    break L126;
                  } else {
                    if (0 > var9) {
                      break L126;
                    } else {
                      if ((fg.field_Ob & 1) != 0) {
                        break L126;
                      } else {
                        L127: {
                          var18 = 1;
                          var19 = 0;
                          var20 = 0;
                          if (0 != fg.field_Ob) {
                            var20 = sj.field_v[var9];
                            if (t.a(rn.field_D, var9, -20370)) {
                              var18 = 0;
                              break L127;
                            } else {
                              if (!aj.a(ge.field_m, (byte) 123, rn.field_D, var9, nk.f((byte) -74))) {
                                var18 = 2;
                                var19 = 1;
                                break L127;
                              } else {
                                if (var20 <= li.field_v) {
                                  break L127;
                                } else {
                                  var18 = 2;
                                  break L127;
                                }
                              }
                            }
                          } else {
                            var20 = qf.field_h[var9];
                            if (t.a(fe.field_D, var9, -20370)) {
                              var18 = 0;
                              break L127;
                            } else {
                              if (ad.a(var9, nk.f((byte) -61), fe.field_D, (byte) 84, ge.field_m, rn.field_D)) {
                                if (var20 <= li.field_v) {
                                  break L127;
                                } else {
                                  var18 = 2;
                                  break L127;
                                }
                              } else {
                                var19 = 1;
                                var18 = 2;
                                break L127;
                              }
                            }
                          }
                        }
                        L128: {
                          var21_ref = null;
                          var22 = var18;
                          if (var22 != 0) {
                            if (-2 != (var22 ^ -1)) {
                              if (2 != var22) {
                                break L128;
                              } else {
                                if (var19 != 0) {
                                  var21_ref = a.field_d[3];
                                  break L128;
                                } else {
                                  var21_ref = a.field_d[2];
                                  break L128;
                                }
                              }
                            } else {
                              var21_ref = a.field_d[1];
                              break L128;
                            }
                          } else {
                            var21_ref = a.field_d[0];
                            break L128;
                          }
                        }
                        L129: {
                          if (var21_ref != null) {
                            var21_ref = db.a((String) (var21_ref), -64, new String[]{Integer.toString(var20)});
                            var14_ref = var21_ref;
                            var14_ref = var21_ref;
                            break L129;
                          } else {
                            break L129;
                          }
                        }
                        L130: {
                          if (var14_ref == null) {
                            break L130;
                          } else {
                            if (((String) (var14_ref)).length() != 0) {
                              if (var21_ref == null) {
                                break L126;
                              } else {
                                var14_ref = (String) (var14_ref) + "<br><br>" + (String) (var21_ref);
                                break L126;
                              }
                            } else {
                              break L130;
                            }
                          }
                        }
                        var14_ref = var21_ref;
                        break L126;
                      }
                    }
                  }
                } else {
                  var14_ref = of.field_b;
                  var21_ref = var14_ref;
                  var14_ref = var21_ref;
                  var21_ref = var14_ref;
                  var14_ref = var21_ref;
                  break L126;
                }
              }
              L131: {
                var18 = 110;
                var19 = 270;
                var20 = ((mi) ((Object) var8_ref)).field_G - -((mi) ((Object) var8_ref)).field_F;
                var21 = 5 + (5 + var20);
                var22 = 228;
                var23 = 16777215;
                if (-1 < (var9 ^ -1)) {
                  var23 = 4210752;
                  break L131;
                } else {
                  break L131;
                }
              }
              L132: {
                var24 = new String[4];
                var25 = 0;
                var26 = 0;
                if (var13 != null) {
                  var25 = ((mi) ((Object) var8_ref)).a((String) (var13), new int[]{-20 + var19}, var24);
                  var21 = var21 + (5 - -(var20 * var25));
                  break L132;
                } else {
                  break L132;
                }
              }
              L133: {
                if (0 != (fg.field_Ob & 16)) {
                  var26 = d.a(0, 0, 17, true, var9);
                  if (var10 >= 0) {
                    var21 += 25;
                    break L133;
                  } else {
                    if (var16_ref_wk == null) {
                      break L133;
                    } else {
                      var27 = 7 + var20 + (-20 + var16_ref_wk.field_F);
                      if (var26 >= var27) {
                        break L133;
                      } else {
                        var26 = var27;
                        break L133;
                      }
                    }
                  }
                } else {
                  break L133;
                }
              }
              L134: {
                var21 = var21 + var26;
                if (var14_ref == null) {
                  break L134;
                } else {
                  var21 = var21 + (((mi) ((Object) var8_ref)).a((String) (var14_ref), var19 - 20, var20) + 5);
                  break L134;
                }
              }
              L135: {
                var18 = 378 - var21;
                pb.c(var22, var18, var19, var21, 0, 200);
                pb.h(var22, var18, var19, var21, var23);
                var21 = var18 - (-5 - var20);
                if (var25 <= 0) {
                  break L135;
                } else {
                  var27 = 0;
                  L136: while (true) {
                    if (var27 >= var25) {
                      var21 = var21 + (var20 * var25 - -5);
                      break L135;
                    } else {
                      ((mi) ((Object) var8_ref)).b(var24[var27], 10 + var22, var21 + var27 * var20, 1021128, 0);
                      var27++;
                      continue L136;
                    }
                  }
                }
              }
              L137: {
                if (var16_ref_wk == null) {
                  break L137;
                } else {
                  var16_ref_wk.f(var22 + 138, var21 + -18);
                  discarded$84 = ((mi) ((Object) var8_ref)).a((String) (var15), 138 + var22, var21 + -20 + var16_ref_wk.field_F, -140 + (var19 - 2), 100, 1021128, 0, 0, 0, 10);
                  break L137;
                }
              }
              L138: {
                L139: {
                  if ((var11 ^ -1) != 0) {
                    break L139;
                  } else {
                    if (0 != (var12 ^ -1)) {
                      break L139;
                    } else {
                      break L138;
                    }
                  }
                }
                L140: {
                  var27 = var22 + var19 - 40;
                  var28 = -10 + var21;
                  var29 = 10;
                  if ((var10 ^ -1) <= -1) {
                    var27 = var19 / 2 + var22;
                    break L140;
                  } else {
                    break L140;
                  }
                }
                pb.c(var27, var28 - -1, var29, 477796);
                pb.c(var27, var28, var29, 1021128);
                var12 = 8192 * var12 / 65536;
                ((mi) ((Object) var8_ref)).a(tk.field_s, var27, 14 + var28 + var29, 1044724, 0);
                var11 = 8192 * var11 / 65536;
                var30 = var11;
                L141: while (true) {
                  if (var30 >= var12) {
                    L142: {
                      pb.d(var27, var28, kg.a(var12, (byte) -82) * var29 / 65536 + var27, var28 - -(var29 * jh.a(var12, 4096) / 65536), 1044724);
                      if (var10 >= 0) {
                        var21 = var21 + (18 + var29);
                        break L142;
                      } else {
                        break L142;
                      }
                    }
                    pb.d(var27, 1 + var28, kg.a(var12, (byte) -77) * var29 / 65536 + var27, 1 + var28 - -(var29 * jh.a(var12, 4096) / 65536), 1044724);
                    break L138;
                  } else {
                    pb.d(var27, var28, var29 * kg.a(var30, (byte) -76) / 65536 + var27, var28 + var29 * jh.a(var30, 4096) / 65536, 1044724);
                    pb.d(var27, var28 - -1, var27 + kg.a(var30, (byte) -82) * var29 / 65536, var29 * jh.a(var30, 4096) / 65536 + 1 + var28, 1044724);
                    var30 += 100;
                    continue L141;
                  }
                }
              }
              L143: {
                if ((fg.field_Ob & 16) == 0) {
                  break L143;
                } else {
                  discarded$85 = d.a(var21 + -10, var22 + 10, 17, false, var9);
                  break L143;
                }
              }
              var21 = var21 + var26;
              if (var14_ref != null) {
                discarded$86 = ((mi) ((Object) var8_ref)).a((String) (var14_ref), var22 - -10, var21, -20 + var19, 300, 1021128, 0, 0, 0, var20);
                var21 = var21 + ((mi) ((Object) var8_ref)).a((String) (var14_ref), -20 + var19, var20);
                break L102;
              } else {
                break L102;
              }
            }
            L144: {
              var13 = null;
              if (!qh.field_Wb) {
                var13 = ji.field_b[0];
                var15 = var13;
                var15 = var13;
                break L144;
              } else {
                var68 = new int[35];
                var59 = var68;
                var14_ref = var59;
                var15_int = hl.field_v.i(-115);
                var16 = 0;
                L145: while (true) {
                  if (var15_int <= var16) {
                    var16 = -1;
                    var17 = 0;
                    var18 = 0;
                    L146: while (true) {
                      if (var18 >= var68.length) {
                        if ((var16 ^ -1) == -35) {
                          var13 = "Don't equip multiple GODULEs. They are too awesome.";
                          break L144;
                        } else {
                          if ((var16 ^ -1) == 0) {
                            L147: {
                              if (-1 <= (var68[26] ^ -1)) {
                                break L147;
                              } else {
                                if (var17 != 0) {
                                  break L147;
                                } else {
                                  var13 = ji.field_b[2];
                                  break L144;
                                }
                              }
                            }
                            L148: {
                              if (0 >= var68[28]) {
                                break L148;
                              } else {
                                if (hl.field_v.h(-31496) <= 0) {
                                  var13 = ji.field_b[3];
                                  break L144;
                                } else {
                                  break L148;
                                }
                              }
                            }
                            L149: {
                              if ((var68[29] ^ -1) >= -1) {
                                break L149;
                              } else {
                                if (-1 > (hl.field_v.j(0) ^ -1)) {
                                  break L149;
                                } else {
                                  var13 = ji.field_b[4];
                                  break L144;
                                }
                              }
                            }
                            L150: {
                              if (0 >= var68[17]) {
                                break L150;
                              } else {
                                if (!wl.field_lb) {
                                  var13 = ji.field_b[5];
                                  break L144;
                                } else {
                                  break L150;
                                }
                              }
                            }
                            L151: {
                              if ((var68[16] ^ -1) >= -1) {
                                break L151;
                              } else {
                                if (vc.field_d) {
                                  break L151;
                                } else {
                                  var13 = ji.field_b[6];
                                  break L144;
                                }
                              }
                            }
                            L152: {
                              if (0 >= var68[22]) {
                                break L152;
                              } else {
                                if (nb.field_I) {
                                  break L152;
                                } else {
                                  if (bf.field_Gb) {
                                    break L152;
                                  } else {
                                    var13 = ji.field_b[7];
                                    break L144;
                                  }
                                }
                              }
                            }
                            L153: {
                              if ((var68[23] ^ -1) >= -1) {
                                break L153;
                              } else {
                                if (qf.field_b) {
                                  break L153;
                                } else {
                                  var13 = ji.field_b[8];
                                  break L144;
                                }
                              }
                            }
                            L154: {
                              if (0 >= var68[25]) {
                                break L154;
                              } else {
                                if (!bm.field_Q) {
                                  var13 = ji.field_b[9];
                                  break L144;
                                } else {
                                  break L154;
                                }
                              }
                            }
                            L155: {
                              if (0 >= var68[24]) {
                                break L155;
                              } else {
                                if (ei.field_t < 5) {
                                  var13 = ji.field_b[10];
                                  break L144;
                                } else {
                                  break L155;
                                }
                              }
                            }
                            if (!lc.field_f) {
                              break L144;
                            } else {
                              if (10 <= ei.field_t) {
                                break L144;
                              } else {
                                var13 = ji.field_b[11];
                                break L144;
                              }
                            }
                          } else {
                            var13 = db.a(ji.field_b[1], -25, new String[]{rj.field_m[var16]});
                            break L144;
                          }
                        }
                      } else {
                        L156: {
                          var19 = pe.field_O[var18];
                          if (-1 == (var19 ^ -1)) {
                            break L156;
                          } else {
                            if ((var19 ^ -1) == -2) {
                              break L156;
                            } else {
                              if ((var19 ^ -1) == -3) {
                                break L156;
                              } else {
                                if (var68[var18] > 1) {
                                  var16 = var18;
                                  break L156;
                                } else {
                                  break L156;
                                }
                              }
                            }
                          }
                        }
                        if ((var19 ^ -1) == -3) {
                          if (var68[var18] > 0) {
                            var17 = 1;
                            var18++;
                            continue L146;
                          } else {
                            var18++;
                            continue L146;
                          }
                        } else {
                          var18++;
                          continue L146;
                        }
                      }
                    }
                  } else {
                    L157: {
                      if ((di.field_c[var16] ^ -1) <= -1) {
                        ((int[]) (var14_ref))[di.field_c[var16]] = ((int[]) (var14_ref))[di.field_c[var16]] + 1;
                        break L157;
                      } else {
                        break L157;
                      }
                    }
                    var16++;
                    continue L145;
                  }
                }
              }
            }
            L158: {
              if (var13 == null) {
                break L158;
              } else {
                if (!ef.field_b) {
                  break L158;
                } else {
                  var60 = jn.field_e + (String) (var13);
                  var15 = var60;
                  var15 = var60;
                  var14 = 283;
                  var15_int = 230;
                  var16 = 87;
                  var17 = 10 + pl.field_U.a(var60, var14);
                  var18 = 10 + pl.field_U.a(var60, var14, 12);
                  pb.c((-var17 + var14) / 2 + var15_int, -5 + var16, var17, var18, 0, 150);
                  discarded$87 = pl.field_U.a(var60, var15_int, var16, var14, 100, 16711680, 0, 1, 0, 12);
                  break L158;
                }
              }
            }
            L159: {
              if (f.field_y != null) {
                L160: {
                  var14 = 0;
                  var15 = null;
                  if (fg.field_Ob == 0) {
                    var16 = (int)f.field_y.field_j;
                    var14 = Integer.parseInt(f.field_y.field_S.substring(5, 6));
                    var17 = var14;
                    if ((var17 ^ -1) == -2) {
                      var15 = db.a(sl.field_j[0], -71, new String[]{Integer.toString(dn.field_Sb[var16])});
                      break L160;
                    } else {
                      if (2 != var17) {
                        if (var17 == 3) {
                          var15 = sl.field_j[2];
                          break L160;
                        } else {
                          if (-5 != (var17 ^ -1)) {
                            if (5 != var17) {
                              if ((var17 ^ -1) != -8) {
                                break L160;
                              } else {
                                if ((var16 ^ -1) != -21) {
                                  var15 = db.a(sl.field_j[5], -76, new String[]{Integer.toString(s.a(var16, false) * 50 / 3)});
                                  break L160;
                                } else {
                                  var15 = sl.field_j[6];
                                  break L160;
                                }
                              }
                            } else {
                              var15 = db.a(sl.field_j[4], -86, new String[]{Integer.toString(s.a(var16, false) * 100)});
                              break L160;
                            }
                          } else {
                            var15 = db.a(sl.field_j[3], -94, new String[]{Integer.toString(s.a(var16, false))});
                            break L160;
                          }
                        }
                      } else {
                        var15 = sl.field_j[1];
                        break L160;
                      }
                    }
                  } else {
                    L161: {
                      var61 = ul.a((int)f.field_y.field_j, (byte) 67);
                      var14 = Integer.parseInt(f.field_y.field_S.substring(5, 6));
                      if (0 != (fg.field_Ob & 1)) {
                        break L161;
                      } else {
                        L162: {
                          if (var14 == 2) {
                            break L162;
                          } else {
                            if ((var14 ^ -1) != -4) {
                              break L161;
                            } else {
                              break L162;
                            }
                          }
                        }
                        if (oh.field_f < -30 + f.field_y.field_Rb + f.field_y.field_zb) {
                          if (-1 <= (var61.i(-118) ^ -1)) {
                            var14 = -1;
                            break L161;
                          } else {
                            var14 = 6;
                            break L161;
                          }
                        } else {
                          break L161;
                        }
                      }
                    }
                    L163: {
                      var17 = var14;
                      if (var17 == 0) {
                        var15 = db.a(sl.field_j[7], -111, new String[]{Integer.toString(var61.g(8192))});
                        break L163;
                      } else {
                        if ((var17 ^ -1) != -2) {
                          if ((var17 ^ -1) != -3) {
                            if (var17 == 3) {
                              if ((1 & fg.field_Ob) != 0) {
                                L164: {
                                  var17 = ul.a((byte) -97, var61.field_N);
                                  stackOut_695_0 = sl.field_j[10];
                                  stackOut_695_1 = -93;
                                  stackOut_695_2 = new String[1];
                                  stackOut_695_3 = new String[1];
                                  stackOut_695_4 = 0;
                                  stackIn_697_0 = stackOut_695_0;
                                  stackIn_697_1 = stackOut_695_1;
                                  stackIn_697_2 = stackOut_695_2;
                                  stackIn_697_3 = stackOut_695_3;
                                  stackIn_697_4 = stackOut_695_4;
                                  stackIn_696_0 = stackOut_695_0;
                                  stackIn_696_1 = stackOut_695_1;
                                  stackIn_696_2 = stackOut_695_2;
                                  stackIn_696_3 = stackOut_695_3;
                                  stackIn_696_4 = stackOut_695_4;
                                  if (var17 >= 0) {
                                    stackOut_697_0 = (String) ((Object) stackIn_697_0);
                                    stackOut_697_1 = stackIn_697_1;
                                    stackOut_697_2 = (String[]) ((Object) stackIn_697_2);
                                    stackOut_697_3 = (String[]) ((Object) stackIn_697_3);
                                    stackOut_697_4 = stackIn_697_4;
                                    stackOut_697_5 = qc.field_S[var17];
                                    stackIn_698_0 = stackOut_697_0;
                                    stackIn_698_1 = stackOut_697_1;
                                    stackIn_698_2 = stackOut_697_2;
                                    stackIn_698_3 = stackOut_697_3;
                                    stackIn_698_4 = stackOut_697_4;
                                    stackIn_698_5 = stackOut_697_5;
                                    break L164;
                                  } else {
                                    stackOut_696_0 = (String) ((Object) stackIn_696_0);
                                    stackOut_696_1 = stackIn_696_1;
                                    stackOut_696_2 = (String[]) ((Object) stackIn_696_2);
                                    stackOut_696_3 = (String[]) ((Object) stackIn_696_3);
                                    stackOut_696_4 = stackIn_696_4;
                                    stackOut_696_5 = 0;
                                    stackIn_698_0 = stackOut_696_0;
                                    stackIn_698_1 = stackOut_696_1;
                                    stackIn_698_2 = stackOut_696_2;
                                    stackIn_698_3 = stackOut_696_3;
                                    stackIn_698_4 = stackOut_696_4;
                                    stackIn_698_5 = stackOut_696_5;
                                    break L164;
                                  }
                                }
                                stackIn_698_3[stackIn_698_4] = Integer.toString(stackIn_698_5);
                                var15 = db.a(stackIn_698_0, stackIn_698_1, stackIn_698_2);
                                break L163;
                              } else {
                                var15 = sl.field_j[2];
                                break L163;
                              }
                            } else {
                              if ((var17 ^ -1) != -7) {
                                break L163;
                              } else {
                                var15 = db.a(al.field_e, -46, new String[]{Integer.toString(var61.i(-128))});
                                break L163;
                              }
                            }
                          } else {
                            if ((fg.field_Ob & 1) != 0) {
                              L165: {
                                var17 = ul.a((byte) 77, var61.field_N);
                                stackOut_689_0 = sl.field_j[9];
                                stackOut_689_1 = -107;
                                stackOut_689_2 = new String[1];
                                stackOut_689_3 = new String[1];
                                stackOut_689_4 = 0;
                                stackIn_691_0 = stackOut_689_0;
                                stackIn_691_1 = stackOut_689_1;
                                stackIn_691_2 = stackOut_689_2;
                                stackIn_691_3 = stackOut_689_3;
                                stackIn_691_4 = stackOut_689_4;
                                stackIn_690_0 = stackOut_689_0;
                                stackIn_690_1 = stackOut_689_1;
                                stackIn_690_2 = stackOut_689_2;
                                stackIn_690_3 = stackOut_689_3;
                                stackIn_690_4 = stackOut_689_4;
                                if ((var17 ^ -1) <= -1) {
                                  stackOut_691_0 = (String) ((Object) stackIn_691_0);
                                  stackOut_691_1 = stackIn_691_1;
                                  stackOut_691_2 = (String[]) ((Object) stackIn_691_2);
                                  stackOut_691_3 = (String[]) ((Object) stackIn_691_3);
                                  stackOut_691_4 = stackIn_691_4;
                                  stackOut_691_5 = qc.field_S[var17];
                                  stackIn_692_0 = stackOut_691_0;
                                  stackIn_692_1 = stackOut_691_1;
                                  stackIn_692_2 = stackOut_691_2;
                                  stackIn_692_3 = stackOut_691_3;
                                  stackIn_692_4 = stackOut_691_4;
                                  stackIn_692_5 = stackOut_691_5;
                                  break L165;
                                } else {
                                  stackOut_690_0 = (String) ((Object) stackIn_690_0);
                                  stackOut_690_1 = stackIn_690_1;
                                  stackOut_690_2 = (String[]) ((Object) stackIn_690_2);
                                  stackOut_690_3 = (String[]) ((Object) stackIn_690_3);
                                  stackOut_690_4 = stackIn_690_4;
                                  stackOut_690_5 = 0;
                                  stackIn_692_0 = stackOut_690_0;
                                  stackIn_692_1 = stackOut_690_1;
                                  stackIn_692_2 = stackOut_690_2;
                                  stackIn_692_3 = stackOut_690_3;
                                  stackIn_692_4 = stackOut_690_4;
                                  stackIn_692_5 = stackOut_690_5;
                                  break L165;
                                }
                              }
                              stackIn_692_3[stackIn_692_4] = Integer.toString(stackIn_692_5);
                              var15 = db.a(stackIn_692_0, stackIn_692_1, stackIn_692_2);
                              break L163;
                            } else {
                              var15 = sl.field_j[1];
                              break L163;
                            }
                          }
                        } else {
                          var15 = db.a(sl.field_j[8], -40, new String[]{Integer.toString(tc.field_B[var61.field_N])});
                          break L163;
                        }
                      }
                    }
                    if (-7 == (var14 ^ -1)) {
                      break L160;
                    } else {
                      if (0 > f.field_y.field_S.indexOf("<img=2>")) {
                        break L160;
                      } else {
                        if (f.field_y.field_S.indexOf("<img=3>") >= 0) {
                          var15 = sl.field_j[11];
                          var14 = 2;
                          break L160;
                        } else {
                          break L160;
                        }
                      }
                    }
                  }
                }
                if (var15 == null) {
                  break L159;
                } else {
                  L166: {
                    var16 = 13;
                    var17 = f.field_y.field_Rb - -20;
                    var18 = f.field_y.field_cb - (var16 + -2);
                    if (var14 != 6) {
                      break L166;
                    } else {
                      var17 -= 20;
                      break L166;
                    }
                  }
                  L167: {
                    L168: {
                      var19 = fk.field_d.c((String) (var15)) - -8;
                      if ((var14 ^ -1) == -3) {
                        break L168;
                      } else {
                        if ((var14 ^ -1) != -4) {
                          break L167;
                        } else {
                          break L168;
                        }
                      }
                    }
                    if (0 != (fg.field_Ob & 1)) {
                      break L167;
                    } else {
                      var17 = -var19 + -4 + (f.field_y.field_zb + f.field_y.field_Rb);
                      break L167;
                    }
                  }
                  pb.c(var17, var18, var19, var16, 0, 192);
                  pb.h(var17, var18, var19, var16, 1400960, 192);
                  fk.field_d.b((String) (var15), 4 + var17, 10 + var18, 16777215, -1);
                  break L159;
                }
              } else {
                break L159;
              }
            }
            L169: {
              if (-1 < (dc.field_g ^ -1)) {
                break L169;
              } else {
                if (dc.field_g == 15) {
                  break L169;
                } else {
                  pa.field_d[dc.field_g].b(-40);
                  break L169;
                }
              }
            }
            break L0;
          }
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        byte[] stackOut_1_0 = null;
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
              stackOut_3_0 = (byte[]) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("ff.WA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
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
        int[] var44 = null;
        int[] var45 = null;
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
            var37 = new int[param2.length + -8];
            var28 = var37;
            var10 = var28;
            ii.a(param2, 0, var10, 0, param2.length - 8);
            var36 = new int[8];
            var27 = var36;
            var11 = var27;
            ii.a(param2, param2.length - 8, var36, 0, 8);
            var9.field_S = kc.a(var37, var36, 2);
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
            var38 = var11;
            var29 = var38;
            var24 = var29;
            var16_ref_int__ = var24;
            var17 = 0;
            L2: while (true) {
              if (var38.length <= var17) {
                L3: {
                  if (var15 <= 0) {
                    break L3;
                  } else {
                    var30 = new wk(20 * Math.min(var15, 4), 20 * (1 + var15 / 4));
                    var15 = 0;
                    var30.d();
                    var17 = 0;
                    var18_int = 0;
                    var44 = var11;
                    var20 = 0;
                    L4: while (true) {
                      if (var20 >= var44.length) {
                        sb.field_bb.b((byte) 125);
                        var32 = new gh((long)var4, (gh) null);
                        var32.field_Pb = var30;
                        var32.a(0, 20, var30.field_B, var6, var30.field_z);
                        var7.a(var32, 120);
                        break L3;
                      } else {
                        L5: {
                          var21 = var44[var20];
                          if (-1 >= (var21 ^ -1)) {
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
                var45 = var10;
                var18_int = 0;
                L6: while (true) {
                  if (var45.length <= var18_int) {
                    var17 = param0 ? 1 : 0;
                    var41 = var11;
                    var34 = var41;
                    var25 = var34;
                    var18 = var25;
                    var26 = 0;
                    var19 = var26;
                    L7: while (true) {
                      L8: {
                        if (var26 >= var41.length) {
                          break L8;
                        } else {
                          var20 = var41[var26];
                          if (-35 == (var20 ^ -1)) {
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
                        stackOut_34_0 = (gh) (var35);
                        stackOut_34_1 = new StringBuilder().append("<img=1>");
                        stackIn_38_0 = stackOut_34_0;
                        stackIn_38_1 = stackOut_34_1;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        if (var17 != 0) {
                          stackOut_38_0 = (gh) ((Object) stackIn_38_0);
                          stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
                          stackOut_38_2 = "MIGHTY";
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          break L10;
                        } else {
                          stackOut_35_0 = (gh) ((Object) stackIn_35_0);
                          stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          if (var16 <= 6100) {
                            stackOut_37_0 = (gh) ((Object) stackIn_37_0);
                            stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
                            stackOut_37_2 = ej.field_C;
                            stackIn_39_0 = stackOut_37_0;
                            stackIn_39_1 = stackOut_37_1;
                            stackIn_39_2 = stackOut_37_2;
                            break L10;
                          } else {
                            stackOut_36_0 = (gh) ((Object) stackIn_36_0);
                            stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
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
                      stackOut_39_0 = (gh) (var7);
                      stackIn_40_0 = stackOut_39_0;
                      break L0;
                    }
                  } else {
                    L11: {
                      var19 = var45[var18_int];
                      if ((var19 ^ -1) <= -1) {
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
                  var18_int = var38[var17];
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
            stackOut_41_0 = (RuntimeException) (var3);
            stackOut_41_1 = new StringBuilder().append("ff.AB(").append(param0).append(',').append(param1).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L13;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L13;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
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
              this.field_jb = this.field_jb + 1;
              super.a(param0, 92, param2, param3);
              if (param1 >= 56) {
                break L1;
              } else {
                field_rb = (wk[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ff.H(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
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
        byte[] discarded$0 = null;
        param1 = (6148914691236517205L & param1 >>> -1730102527) + (param1 & 6148914691236517205L);
        param1 = (3689348814741910323L & param1 >>> -831441342) + (3689348814741910323L & param1);
        if (param0) {
            byte[] var4 = (byte[]) null;
            discarded$0 = ff.a((byte) 37, (byte[]) null);
        }
        param1 = 1085102592571150095L & param1 - -(param1 >>> 251572932);
        param1 = param1 + (param1 >>> -842420664);
        param1 = param1 + (param1 >>> -1544817008);
        param1 = param1 + (param1 >>> -1335930912);
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
              var6 = this.field_mb.a((byte) 21);
              if (var6 == nh.field_J) {
                break L2;
              } else {
                if (var6 == ma.field_Y) {
                  break L2;
                } else {
                  var5 = this.field_mb.a(true);
                  if (var5 == null) {
                    var5 = this.field_hb;
                    break L1;
                  } else {
                    if (var5.equals(this.field_y)) {
                      break L0;
                    } else {
                      this.field_y = var5;
                      this.f((byte) -104);
                      break L0;
                    }
                  }
                }
              }
            }
            var5 = me.field_c;
            break L1;
          }
          if (var5.equals(this.field_y)) {
            break L0;
          } else {
            this.field_y = var5;
            this.f((byte) -104);
            break L0;
          }
        }
        L3: {
          super.a(param0, (byte) -122, param2, param3);
          var6 = this.field_mb.a((byte) 21);
          var8 = (eg) ((Object) this.field_p);
          var9 = this.field_o + param2;
          if (param1 <= -99) {
            break L3;
          } else {
            this.field_jb = 127;
            break L3;
          }
        }
        L4: {
          L5: {
            var10 = var8.a((byte) -115, (lh) (this), param0) - -(var8.b(-1, (lh) (this)).a((byte) 24) >> -368190335);
            if (nh.field_J == var6) {
              break L5;
            } else {
              if (var6 != ma.field_Y) {
                if (fa.field_d != var6) {
                  if (vf.field_b == var6) {
                    var16 = t.field_i[1];
                    var16.a(var9, -(var16.field_F >> 1293811489) + var10, 256);
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  var15 = t.field_i[2];
                  var15.a(var9, var10 - (var15.field_F >> -233568831), 256);
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
              var11 = var14.field_z << -1350407647;
              var12 = var14.field_B << -1285736927;
              if (null == this.field_pb) {
                break L7;
              } else {
                if (var11 > this.field_pb.field_A) {
                  break L7;
                } else {
                  if (var12 > this.field_pb.field_F) {
                    break L7;
                  } else {
                    q.a(this.field_pb, (byte) -88);
                    pb.b();
                    break L6;
                  }
                }
              }
            }
            this.field_pb = new wk(var11, var12);
            q.a(this.field_pb, (byte) -111);
            break L6;
          }
          var14.a(112, 144, var14.field_z << 794336516, var14.field_B << -1406168700, -this.field_jb << -1728884694, 4096);
          tk.f((byte) 111);
          this.field_pb.a(var9 + -(var14.field_z >> -372251423), -var14.field_B + var10, 256);
          break L4;
        }
    }

    static {
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
