/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends ji {
    static cr field_z;
    static int field_y;

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var31 = null;
        int[][] var50 = null;
        int[][] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var56Lifetime1;
        var19 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -3780) {
          field_y = 109;
        }
        var31 = this.field_v.a(param1, param0 ^ 3778);
        var21 = var31;
        var20 = var21;
        var3 = var20;
        if (this.field_v.field_c) {
          var52 = this.a(2, -1, param1);
          var50 = this.c(0, 3, param1);
          var51 = this.c(1, 3, param1);
          var7 = var31[0];
          var8 = var31[1];
          var9 = var31[2];
          var53 = var50[0];
          var54 = var50[1];
          var55 = var50[2];
          var56 = var51[0];
          var57 = var51[1];
          var58 = var51[2];
          var16 = 0;
          while (!(var16 >= we.field_M)) {
            var17 = var52[var16];
            if (var17 == 4096) {
              var7[var16] = var53[var16];
              var8[var16] = var54[var16];
              var9[var16] = var55[var16];
            }
            if (var17 != 4096 ||
              var19 != 0) {
              var56Lifetime1 = var51[0];
              if (var17 != 0) {
                var18 = -var17 + 4096;
                var7[var16] = var56Lifetime1[var16] * var18 + var17 * var53[var16] >> 12;
                var8[var16] = var57[var16] * var18 + var17 * var54[var16] >> 12;
                var9[var16] = var58[var16] * var18 + var17 * var55[var16] >> 12;
                if (var19 != 0) {
                  var56Lifetime1 = var51[0];
                  var7[var16] = var56Lifetime1[var16];
                  var8[var16] = var57[var16];
                  var9[var16] = var58[var16];
                }
              } else {
                var56Lifetime1 = var51[0];
                var7[var16] = var56Lifetime1[var16];
                var8[var16] = var57[var16];
                var9[var16] = var58[var16];
              }
            }
            var16++;
            if (var19 == 0) {
              continue;
            }
            break;
          }
        }
        return var20;
    }

    public gj() {
        super(3, false);
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        boolean decompiledFrameCompleted0 = true;
        var9 = Vertigo2.field_L ? 1 : 0;
        var10 = this.field_x.a(param0, (byte) -59);
        var3 = var10;
        if (this.field_x.field_i) {
          var21 = this.a(0, -1, param0);
          var22 = this.a(1, -1, param0);
          var20 = this.a(2, -1, param0);
          var7 = 0;
          while (!(we.field_M <= var7)) {
            var8 = var20[var7];
            stackIn_14_0 = -4097;
            stackIn_14_1 = ~var8;
            if (var9 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_14_0 != stackIn_14_1) {
              if (var8 != 0) {
                var10[var7] = var21[var7] * var8 + (-var8 + 4096) * var22[var7] >> 12;
              } else {
                var10 = var3;
                var10[var7] = var22[var7];
              }
            } else {
              var10 = var3;
              var10[var7] = var21[var7];
            }
            var7++;
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_14_0 = param1;
          stackIn_14_1 = 91;
        }
        if (stackIn_14_0 < stackIn_14_1) {
          this.c(-97, -12);
        }
        return var10;
    }

    final static void a(byte param0, boolean param1, int param2, int param3) {
        int var4;
        int var4Lifetime1;
        am.field_n = param3;
        vl.field_c = 0;
        ue.field_O = param2;
        if (al.a(am.field_n, (byte) -94)) {
          var4 = 0;
          if (am.field_n == 13 ||
            am.field_n == 19) {
            var4 = 1;
          }
          if (am.field_n != 0 &&
            am.field_n != 21 &&
            am.field_n != 1 &&
            2 != am.field_n &&
            am.field_n != 22 &&
            3 != am.field_n &&
            am.field_n != 4) {
            var4 = vp.a((byte) 76, am.field_n) - 1;
          }
          if (am.field_n == 7) {
            var4 = 1;
          }
          fh.field_y[am.field_n].a(-121, param1, var4);
        }
        var4Lifetime1 = 72 % ((-10 - param0) / 41);
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, boolean param4) {
        cr stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_69_0 = 0;
        boolean stackIn_108_0 = false;
        int stackIn_126_0 = 0;
        boolean stackIn_136_0 = false;
        boolean stackIn_153_0 = false;
        int stackIn_160_0 = 0;
        cr stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        boolean stackIn_179_2 = false;
        cr stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        boolean stackIn_184_2 = false;
        cr stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        boolean stackIn_189_2 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_107_0;
        boolean stackOut_135_0;
        boolean stackOut_152_0;
        RuntimeException var5 = null;
        cr var6 = null;
        cr var7 = null;
        cr var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
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
        nj var17 = null;
        Object var18 = null;
        int var18_int = 0;
        bs var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        cr var22 = null;
        int[] var23 = null;
        String var24 = null;
        String var25 = null;
        int[] var26 = null;
        cr var27 = null;
        int stackIn_55_0Lifetime1;
        int stackIn_55_1Lifetime1;
        int stackIn_63_0Lifetime1;
        int var13_intLifetime1;
        int var18_intLifetime1;
        int var13_intLifetime2;
        var18 = null;
        var19 = Vertigo2.field_L ? 1 : 0;
        try {
          hq.b(mp.field_b, -127);
          if (null != gd.field_j) {
            boolean decompiledFrameRemainder3 = true;
            ne.field_G.field_lb = true;
            var22 = fo.field_f;
            var27 = var22;
            fo.field_f.field_db = 0;
            var27.field_Fb = 0;
            hd.field_g.field_db = 0;
            var6 = hd.field_g;
            var6.field_Fb = 0;
            kk.field_f.field_db = 0;
            var7 = kk.field_f;
            var7.field_Fb = 0;
            if (!cn.b(false)) {
              var9_ref_String = gd.field_j.field_Nb;
              ud.field_x.field_S = Vertigo2.a(new String[]{var9_ref_String}, ie.field_Rb, 20).toUpperCase();
              kk.field_f.a(88, lb.field_c.field_Fb, 40, -40 + lb.field_c.field_db, 0);
              kk.field_f.field_S = Vertigo2.a(new String[]{var9_ref_String}, od.field_Ob, 78);
              var8 = kk.field_f;
              decompiledFrameRemainder3 = (var19 != 0);
            }
            if (decompiledFrameRemainder3) {
              ud.field_x.field_S = fq.field_a.toUpperCase();
              var9 = (2 + lb.field_c.field_Fb) / 2;
              fo.field_f.a(93, var9 - 2, 40, lb.field_c.field_db - 40, 0);
              if (gd.field_j.field_uc > gd.field_j.field_Qb) {
                fo.field_f.field_S = eh.field_g.toUpperCase();
                fo.field_f.field_lb = true;
                if (var19 != 0) {
                  fo.field_f.field_S = fg.field_db.toUpperCase();
                  fo.field_f.field_lb = false;
                }
              } else {
                fo.field_f.field_S = fg.field_db.toUpperCase();
                fo.field_f.field_lb = false;
              }
              fo.field_f.field_Bb = fb.field_u.field_Bb;
              if (kk.field_j > 0) {
                boolean decompiledSharedTail1 = (1 != kk.field_j);
                if (!decompiledSharedTail1) {
                  var10_ref_String = e.field_l;
                  decompiledSharedTail1 = (var19 != 0);
                }
                if (decompiledSharedTail1) {
                  var10_ref_String = Vertigo2.a(new String[]{Integer.toString(kk.field_j)}, uo.field_c, 111);
                }
                if (0 == (lo.field_d & 16) &&
                  !im.field_g) {
                  fo.field_f.field_Bb = fb.field_u.field_Q;
                }
                fo.field_f.field_S = fo.field_f.field_S + "<br>" + var10_ref_String;
              }
              hd.field_g.a(82, -var9 + lb.field_c.field_Fb, 40, lb.field_c.field_db - 40, var9);
              hd.field_g.field_S = gm.field_a.toUpperCase();
              stackIn_21_0 = hd.field_g;
              stackIn_22_1 = (param0) && (r.field_h == 0L);
              stackIn_21_0.field_lb = stackIn_22_1;
              var8 = hd.field_g;
              var10 = 2;
              if (gr.field_W != null) {
                if (null == e.field_c) {
                  e.field_c = new byte[ol.field_A];
                  mn.field_t = new boolean[ol.field_A];
                }
                var11_int = 0;
                do {
                  if (!(ol.field_A > var11_int)) {
                    var10 = 0;
                    break;
                  }
                  mn.field_t[var11_int] = false;
                  var11_int++;
                } while (var19 == 0);
                L17: while (true) {
                  if (2 > var10) {
                    var11_int = 0;
                    stackIn_69_0 = 0;
                    if (var19 != 0) {
                      break L17;
                    }
                    var12 = stackIn_69_0;
                    while (true) {
                      stackIn_37_0 = gr.field_W.length;
                      stackIn_37_1 = var12;
                      if (stackIn_37_0 > stackIn_37_1) {
                        var26 = gr.field_W[var12];
                        var23 = var26;
                        var20 = var23;
                        var13 = var20;
                        stackIn_63_0 = 0;
                        var14_int = stackIn_63_0;
                        L24: while (true) {
                          if (var26.length > var14_int) {
                            var15 = var26[var14_int];
                            var16 = var20[var14_int + 1];
                            stackIn_55_0 = var15;
                            stackIn_55_1 = -1;
                            if (stackIn_55_0 == stackIn_55_1) {
                              if (var10 == 0) {
                                stackIn_48_0 = gd.field_j.field_uc;
                              } else {
                                stackIn_48_0 = gd.field_j.field_Qb;
                              }
                              var17_int = stackIn_48_0;
                              if (var16 != var17_int &&
                                var19 == 0) {
                                break L24;
                              }
                            } else {
                              if ((255 & gd.field_j.field_fc[var15]) != var16) {
                                break L24;
                              }
                            }
                            var14_int += 2;
                            continue;
                          }
                          var11_int = 1;
                          var14_int = -1;
                          var15 = 0;
                          while (true) {
                            stackIn_55_0Lifetime1 = var15;
                            stackIn_55_1Lifetime1 = var26.length;
                            if (stackIn_55_0Lifetime1 >= stackIn_55_1Lifetime1) {
                              break;
                            }
                            var16 = var26[var15];
                            stackIn_37_0 = var16;
                            stackIn_37_1 = var14_int;
                            if (stackIn_37_0 > stackIn_37_1) {
                              var14_int = var16;
                            }
                            var15 += 2;
                          }
                          mn.field_t[var14_int] = true;
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
                  stackIn_69_0 = 2;
                  break;
                }
                if (!(stackIn_69_0 > fn.field_z) &&
                  cr.field_eb[12]) {
                  var10 = 2;
                }
              }
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameCompleted0 = true;
              boolean decompiledFrameRemainder2 = true;
              if ((var10 >= 2) &&
                (decompiledFrameRemainder3 = (sf.field_f != null ||
                te.field_D != null ||
                qh.field_e != null ||
                null != il.field_b))) {
                var11_int = 0;
                var12 = 0;
                var13_int = 0;
                var14_int = 0;
                var15 = 0;
                var16 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(var16 < ol.field_A)))) {
                  var17_int = 255 & gd.field_j.field_fc[var16];
                  if (var19 == 0) {
                    if (sf.field_f != null &&
                      sf.field_f[var16] != null &&
                      sf.field_f[var16][var17_int]) {
                      var11_int = 1;
                    }
                    if (null != te.field_D &&
                      te.field_D[var16] != null) {
                      var18_int = te.field_D[var16][var17_int];
                      if (var13_int < var18_int) {
                        var13_int = var18_int;
                      }
                      if (var18_int != 0 &&
                        !vb.field_g) {
                        var11_int = 1;
                      }
                    }
                    if (il.field_b != null &&
                      null != il.field_b[var16]) {
                      var15 = var15 | il.field_b[var16][var17_int];
                    }
                    if (null != qh.field_e &&
                      null != qh.field_e[var16]) {
                      var18_intLifetime1 = qh.field_e[var16][var17_int];
                      if (var18_intLifetime1 != 0 &&
                        !vb.field_g) {
                        var11_int = 1;
                      }
                      if (var14_int < var18_intLifetime1) {
                        var14_int = var18_intLifetime1;
                      }
                    }
                    var16++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  var16 = 0;
                }
                var17 = vd.field_d.field_Nb.field_M;
                var18_ref = (bs) (var17.a((byte) 100));
                L48: while (true) {
                  boolean decompiledFrameRemainder0 = true;
                  if (var18_ref != null) {
                    stackOut_107_0 = var18_ref.k(param3 + 15);
                    stackIn_126_0 = stackOut_107_0 ? 1 : 0;
                    stackIn_108_0 = stackOut_107_0;
                    if (var19 != 0) {
                      break L48;
                    }
                    if (!stackIn_108_0 ||
                      var19 != 0) {
                      if (var11_int != 0 &&
                        !var18_ref.field_Zb) {
                        var16 = 1;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var18_ref.field_Rb < var13_int) {
                          var16 = 1;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (var18_ref.field_Mb < var14_int) {
                            var16 = 1;
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            if ((var15 & ~var18_ref.field_Kb) > 0) {
                              var16 = 1;
                              decompiledFrameRemainder0 = false;
                            }
                            else {
                              if (var12 != 0) {
                                var16 = 1;
                                decompiledFrameRemainder0 = false;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var18_ref = (bs) (var17.b(35));
                      continue;
                    }
                  }
                  stackIn_126_0 = fn.field_z;
                  break;
                }
                if (stackIn_126_0 >= 2 &&
                  cr.field_eb[12]) {
                  var16 = 0;
                }
                if ((var16 == 0) &&
                  (decompiledFrameRemainder3 = (var19 != 0))) {
                  hd.field_g.field_lb = false;
                  decompiledFrameRemainder3 = !(!hd.field_g.field_G);
                  if (decompiledFrameRemainder3) {
                    var11 = null;
                    var12 = 0;
                    var13_intLifetime2 = 0;
                    decompiledFrameRemainder2 = !(var13_intLifetime2 >= ol.field_A);
                    if (decompiledFrameRemainder2) {
                      stackOut_135_0 = mn.field_t[var13_intLifetime2];
                      stackIn_160_0 = stackOut_135_0 ? 1 : 0;
                      stackIn_136_0 = stackOut_135_0;
                      decompiledFrameRemainder1 = false;
                    }
                  }
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1)) {
                  hd.field_g.field_lb = false;
                  if (hd.field_g.field_G) {
                    if (el.field_e.field_b.field_Kb != 0) {
                      ko.field_S = Vertigo2.a(new String[]{or.field_k}, pb.field_e, param3 ^ -117);
                      if (var19 != 0) {
                        ko.field_S = di.field_y;
                      }
                    } else {
                      ko.field_S = di.field_y;
                    }
                  }
                  decompiledFrameRemainder3 = (var19 != 0);
                }
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                hd.field_g.field_lb = false;
                decompiledFrameRemainder3 = !(!hd.field_g.field_G);
                if (decompiledFrameRemainder3) {
                  var11 = null;
                  var12 = 0;
                  var13_intLifetime1 = 0;
                  while (!(var13_intLifetime1 >= ol.field_A)) {
                    stackOut_152_0 = mn.field_t[var13_intLifetime1];
                    stackIn_160_0 = stackOut_152_0 ? 1 : 0;
                    stackIn_153_0 = stackOut_152_0;
                    if (var19 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_153_0) {
                      var25 = "<col=A00000>" + md.field_C[var13_intLifetime1] + "</col>";
                      if (var11 != null) {
                        var12 = 1;
                        var11 = (String) (var11) + ", " + var25;
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
                (decompiledFrameCompleted0)) {
                stackIn_160_0 = -1;
              }
              if (decompiledFrameRemainder3) {
                if (stackIn_160_0 != ~var10) {
                  var13_ref = lo.field_a;
                  boolean decompiledSharedTail0 = (var12 == 0);
                  if (!decompiledSharedTail0) {
                    var14 = ni.field_e + (String) (var11);
                    decompiledSharedTail0 = (var19 != 0);
                  }
                  if (decompiledSharedTail0) {
                    var14 = Vertigo2.a(new String[]{(String) (var11)}, eg.field_q, -123);
                  }
                } else {
                  var13_ref = rn.field_y;
                  if (var12 == 0) {
                    var14 = Vertigo2.a(new String[]{(String) (var11)}, fa.field_t, 14);
                    if (var19 != 0) {
                      var14 = ia.field_H + (String) (var11);
                    }
                  } else {
                    var14 = ia.field_H + (String) (var11);
                  }
                }
                ko.field_S = "<col=A00000>" + var13_ref + "<br>" + var14;
              }
            }
            if (r.field_h != 0L) {
              var9 = (int)(r.field_h - gk.a(param3 + 108));
              var9 = (var9 + 999) / 1000;
              if (var9 < 1) {
                var9 = 1;
              }
              var8.field_S = Vertigo2.a(new String[]{Integer.toString(var9)}, me.field_a, param3 ^ 89);
            }
            nb.field_D.field_S = Vertigo2.a(new String[]{Integer.toString(gd.field_j.field_Qb), Integer.toString(gd.field_j.field_uc)}, nq.field_I, 9);
          }
          stackIn_178_0 = hk.field_o;
          stackIn_178_1 = 0;
          stackIn_179_2 = (param4) && (!param2) && (!im.field_g);
          ((cr) (Object) stackIn_178_0).a(stackIn_178_1, stackIn_179_2);
          stackIn_183_0 = lb.field_c;
          stackIn_183_1 = 0;
          stackIn_184_2 = (param4) && (!param2) && (!im.field_g);
          ((cr) (Object) stackIn_183_0).a(stackIn_183_1, stackIn_184_2);
          stackIn_188_0 = wc.field_m;
          stackIn_188_1 = param3;
          stackIn_189_2 = (param4) && (!param2) && (im.field_g);
          ((cr) (Object) stackIn_188_0).a(stackIn_188_1, stackIn_189_2);
          el.field_e.field_b.k(0);
          if (gd.field_j != null) {
            if (ne.field_G.field_tb != 0) {
              qk.d(gd.field_j.a((byte) -38), param1, 18964);
            }
            if (hd.field_g.field_tb != 0) {
              na.field_p = true;
            }
            if (fo.field_f.field_tb != 0) {
              im.field_g = true;
            }
            if (Vertigo2.field_M.field_tb != 0) {
              im.field_g = false;
            }
            mg.a(false, param1, false, gd.field_j);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var5), "gj.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, ed param2) {
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 == 0) {
            stackIn_4_1 = (1 == param2.h(-11));
            this.field_o = stackIn_4_1;
          }
          if (param0 != 110) {
            this.c(-57, -56);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("gj.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 >= -68) {
          gj.b((byte) -14);
        }
        field_z = null;
    }

    static {
    }
}
