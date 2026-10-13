/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static mh field_a;
    static String field_d;
    static int field_b;
    static rg field_c;

    final static void a(int param0, int param1, int param2, int param3, RgbSprite[] param4, int param5) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param4 == null) {
            return;
          }
          if (param0 > 0 &&
            param1 > 0) {
            if (param4[3] != null) {
              stackIn_10_0 = param4[3].canvasWidth;
            } else {
              stackIn_10_0 = 0;
            }
            var6_int = stackIn_10_0;
            if (param4[5] == null) {
              stackIn_13_0 = 0;
            } else {
              stackIn_13_0 = param4[5].canvasWidth;
            }
            var7 = stackIn_13_0;
            if (param2 != -40) {
              return;
            }
            if (null == param4[1]) {
              stackIn_18_0 = 0;
            } else {
              stackIn_18_0 = param4[1].canvasHeight;
            }
            var8 = stackIn_18_0;
            if (param4[7] != null) {
              stackIn_21_0 = param4[7].canvasHeight;
            } else {
              stackIn_21_0 = 0;
            }
            var9 = stackIn_21_0;
            var10 = param0 + param3;
            var11 = param5 + param1;
            var12 = var6_int + param3;
            var13 = -var7 + var10;
            var14 = var8 + param5;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = param0 * var6_int / (var7 + var6_int) + param3;
              var16 = param0 * var6_int / (var7 + var6_int) + param3;
            }
            var18 = var14;
            var19 = var15;
            if (var19 < var18) {
              var19 = param1 * var8 / (var8 + var9) + param5;
              var18 = param1 * var8 / (var8 + var9) + param5;
            }
            Rasterizer2D.saveClip(rg.field_g);
            if (null != param4[0]) {
              Rasterizer2D.intersectClip(param3, param5, var16, var18);
              param4[0].drawTransparent(param3, param5);
              Rasterizer2D.restoreClip(rg.field_g);
            }
            if (null != param4[2]) {
              Rasterizer2D.intersectClip(var17, param5, var10, var18);
              param4[2].drawTransparent(var13, param5);
              Rasterizer2D.restoreClip(rg.field_g);
            }
            if (null != param4[6]) {
              Rasterizer2D.intersectClip(param3, var19, var16, var11);
              param4[6].drawTransparent(param3, var15);
              Rasterizer2D.restoreClip(rg.field_g);
            }
            if (param4[8] != null) {
              Rasterizer2D.intersectClip(var17, var19, var10, var11);
              param4[8].drawTransparent(var13, var15);
              Rasterizer2D.restoreClip(rg.field_g);
            }
            boolean decompiledFrameCompleted3 = true;
            if (param4[1] != null &&
              0 != param4[1].canvasWidth) {
              Rasterizer2D.intersectClip(var16, param5, var17, var18);
              var20 = var12;
              while (var13 > var20) {
                param4[1].drawTransparent(var20, param5);
                var20 = var20 + param4[1].canvasWidth;
                if (var22 != 0) {
                  decompiledFrameCompleted3 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted3) {
                Rasterizer2D.restoreClip(rg.field_g);
              }
            }
            boolean decompiledFrameCompleted2 = true;
            if (param4[7] != null &&
              param4[7].canvasWidth != 0) {
              Rasterizer2D.intersectClip(var16, var19, var17, var11);
              var20Lifetime1 = var12;
              while (var13 > var20Lifetime1) {
                param4[7].drawTransparent(var20Lifetime1, var15);
                var20Lifetime1 = var20Lifetime1 + param4[7].canvasWidth;
                if (var22 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted2) {
                Rasterizer2D.restoreClip(rg.field_g);
              }
            }
            boolean decompiledFrameCompleted1 = true;
            if (param4[3] != null &&
              param4[3].canvasHeight != 0) {
              Rasterizer2D.intersectClip(param3, var18, var16, var19);
              var20Lifetime2 = var14;
              while (var20Lifetime2 < var15) {
                param4[3].drawTransparent(param3, var20Lifetime2);
                var20Lifetime2 = var20Lifetime2 + param4[3].canvasHeight;
                if (var22 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                Rasterizer2D.restoreClip(rg.field_g);
              }
            }
            boolean decompiledFrameCompleted0 = true;
            if (null != param4[5] &&
              param4[5].canvasHeight != 0) {
              Rasterizer2D.intersectClip(var17, var18, var10, var19);
              var20Lifetime3 = var14;
              while (var15 > var20Lifetime3) {
                param4[5].drawTransparent(var13, var20Lifetime3);
                var20Lifetime3 = var20Lifetime3 + param4[5].canvasHeight;
                if (var22 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                Rasterizer2D.restoreClip(rg.field_g);
              }
            }
            if (null != param4[4] &&
              param4[4].canvasWidth != 0 &&
              param4[4].canvasHeight != 0) {
              Rasterizer2D.intersectClip(var16, var18, var17, var19);
              var20Lifetime4 = var14;
              while (var20Lifetime4 < var15) {
                if (var22 != 0) {
                  return;
                }
                var21 = var12;
                while (var21 < var13) {
                  param4[4].drawTransparent(var21, var20Lifetime4);
                  var21 = var21 + param4[4].canvasWidth;
                }
                var20Lifetime4 = var20Lifetime4 + param4[4].canvasHeight;
              }
              Rasterizer2D.restoreClip(rg.field_g);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_88_0 = var6;
          stackIn_88_1 = new StringBuilder().append("nh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_88_0), ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(RgbSprite[] param0, int param1, int param2, int param3, int param4, dh param5, int param6, int param7, int param8, RgbSprite[] param9, int param10, RgbSprite[] param11, int param12, byte param13, int param14) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        RgbSprite[] var17 = null;
        try {
          var15_int = param5.field_B + param5.field_P;
          var16 = param5.field_B;
          if (param13 != -110) {
            var17 = (RgbSprite[]) null;
            nh.a((RgbSprite[]) null, -71, 62, -50, 61, (dh) null, 97, 90, 79, (RgbSprite[]) null, 117, (RgbSprite[]) null, 81, (byte) 46, -119);
          }
          oa.a(param3, var15_int, param10, param2, var15_int, param12, param1, param7, param4, param0, param5, param11, param8, param6, var16, false, param14, param9, param5, var16);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_6_0 = var15;
          stackIn_6_1 = new StringBuilder().append("nh.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, boolean param4) {
        int stackIn_3_0 = 0;
        boolean stackIn_4_1 = false;
        mh stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_73_0 = 0;
        boolean stackIn_81_0 = false;
        int stackIn_87_0 = 0;
        boolean stackIn_133_0 = false;
        int stackIn_153_0 = 0;
        mh stackIn_174_0 = null;
        boolean stackIn_175_1 = false;
        mh stackIn_179_0 = null;
        boolean stackIn_180_1 = false;
        mh stackIn_184_0 = null;
        boolean stackIn_185_1 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_80_0;
        boolean stackOut_132_0;
        RuntimeException var5 = null;
        mh var6 = null;
        mh var7 = null;
        mh var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
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
        NodeDeque var17 = null;
        Object var18 = null;
        int var18_int = 0;
        id var18_ref = null;
        int var19 = 0;
        RgbSprite[] var20 = null;
        int[] var21 = null;
        mh var23 = null;
        int[] var24 = null;
        String var25 = null;
        int[] var26 = null;
        mh var27 = null;
        int stackIn_58_0Lifetime1;
        int stackIn_58_1Lifetime1;
        int stackIn_67_0Lifetime1;
        int var13Lifetime1;
        int var18_intLifetime1;
        var18 = null;
        var19 = BrickABrac.field_J ? 1 : 0;
        try {
          stackIn_3_0 = eg.field_m;
          stackIn_4_1 = !(param0);
          co.a(stackIn_3_0, stackIn_4_1);
          if (o.field_e != null) {
            boolean decompiledFrameRemainder1 = true;
            ij.field_e.field_eb = true;
            var23 = pf.field_h;
            var27 = var23;
            pf.field_h.field_cb = 0;
            var27.field_Ib = 0;
            dn.field_K.field_cb = 0;
            var6 = dn.field_K;
            var6.field_Ib = 0;
            var7 = ke.field_e;
            ke.field_e.field_cb = 0;
            var7.field_Ib = 0;
            if (!hn.b((byte) 7)) {
              var9_ref_String = o.field_e.field_Fc;
              ba.field_v.field_Mb = rd.a(fm.field_a, new String[]{var9_ref_String}, (byte) 103).toUpperCase();
              ke.field_e.a(40, MultiplayerMatch.field_d.field_cb - 40, 0, MultiplayerMatch.field_d.field_Ib, (byte) 64);
              ke.field_e.field_Mb = rd.a(IntrusiveNode.field_a, new String[]{var9_ref_String}, (byte) 103);
              var8 = ke.field_e;
              decompiledFrameRemainder1 = (var19 != 0);
            }
            if (decompiledFrameRemainder1) {
              ba.field_v.field_Mb = ba.field_x.toUpperCase();
              var9 = (MultiplayerMatch.field_d.field_Ib + 2) / 2;
              pf.field_h.a(40, MultiplayerMatch.field_d.field_cb - 40, 0, -2 + var9, (byte) 64);
              if (o.field_e.field_jc <= o.field_e.field_cc) {
                pf.field_h.field_Mb = GameCanvas.field_d.toUpperCase();
                pf.field_h.field_eb = false;
                if (var19 != 0) {
                  pf.field_h.field_Mb = lq.field_a.toUpperCase();
                  pf.field_h.field_eb = true;
                }
              } else {
                pf.field_h.field_Mb = lq.field_a.toUpperCase();
                pf.field_h.field_eb = true;
              }
              pf.field_h.field_Jb = fm.field_b.field_Jb;
              if (uf.field_c > 0) {
                boolean decompiledSharedTail1 = (uf.field_c != 1);
                if (!decompiledSharedTail1) {
                  var10_ref_String = ei.field_g;
                  decompiledSharedTail1 = (var19 != 0);
                }
                if (decompiledSharedTail1) {
                  var10_ref_String = rd.a(LevelPackLoader.field_h, new String[]{Integer.toString(uf.field_c)}, (byte) 103);
                }
                pf.field_h.field_Mb = pf.field_h.field_Mb + "<br>" + var10_ref_String;
                if ((an.field_h & 16) == 0 &&
                  !hc.field_c) {
                  pf.field_h.field_Jb = fm.field_b.field_Gb;
                }
              }
              dn.field_K.a(40, MultiplayerMatch.field_d.field_cb - 40, var9, MultiplayerMatch.field_d.field_Ib - var9, (byte) 64);
              dn.field_K.field_Mb = sn.field_r.toUpperCase();
              var8 = dn.field_K;
              stackIn_23_0 = dn.field_K;
              stackIn_24_1 = (param4) && (ic.field_b == 0L);
              stackIn_23_0.field_eb = stackIn_24_1;
              var10 = 2;
              if (null != br.field_bc) {
                if (qo.field_J == null) {
                  h.field_D = new boolean[cq.field_p];
                  qo.field_J = new byte[cq.field_p];
                }
                var11 = 0;
                do {
                  if (!(cq.field_p > var11)) {
                    var10 = 0;
                    break;
                  }
                  h.field_D[var11] = false;
                  var11++;
                } while (var19 == 0);
                scanLoop1: while (true) {
                  if (var10 < 2) {
                    var11 = 0;
                    stackIn_73_0 = 0;
                    if (var19 != 0) {
                      break scanLoop1;
                    }
                    var12 = stackIn_73_0;
                    while (true) {
                      stackIn_39_0 = br.field_bc.length;
                      stackIn_39_1 = var12;
                      if (stackIn_39_0 > stackIn_39_1) {
                        var26 = br.field_bc[var12];
                        var24 = var26;
                        var21 = var24;
                        var13_ref_int__ = var21;
                        stackIn_67_0 = 0;
                        var14 = stackIn_67_0;
                        scanLoop2: while (true) {
                          if (var26.length > var14) {
                            var15 = var26[var14];
                            var16 = var21[var14 + 1];
                            stackIn_58_0 = var15;
                            stackIn_58_1 = -1;
                            if (stackIn_58_0 != stackIn_58_1) {
                              if (~(o.field_e.field_Tb[var15] & 255) != ~var16) {
                                break scanLoop2;
                              }
                            } else {
                              if (var10 != 0) {
                                stackIn_51_0 = o.field_e.field_cc;
                              } else {
                                stackIn_51_0 = o.field_e.field_jc;
                              }
                              var17_int = stackIn_51_0;
                              if (var17_int != var16 &&
                                var19 == 0) {
                                break scanLoop2;
                              }
                            }
                            var14 += 2;
                            continue;
                          }
                          var11 = 1;
                          var14 = -1;
                          var15 = 0;
                          while (true) {
                            stackIn_58_0Lifetime1 = var15;
                            stackIn_58_1Lifetime1 = var26.length;
                            if (stackIn_58_0Lifetime1 >= stackIn_58_1Lifetime1) {
                              break;
                            }
                            var16 = var26[var15];
                            stackIn_39_0 = ~var16;
                            stackIn_39_1 = ~var14;
                            if (stackIn_39_0 < stackIn_39_1) {
                              var14 = var16;
                            }
                            var15 += 2;
                          }
                          h.field_D[var14] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_67_0Lifetime1 = var11;
                    if (stackIn_67_0Lifetime1 == 0 ||
                      var19 != 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_73_0 = 2;
                  break;
                }
                if (!(stackIn_73_0 > kb.field_Yb) &&
                  pe.heldKeys[12]) {
                  var10 = 2;
                }
              }
              if (var10 < 2) {
                dn.field_K.field_eb = false;
                decompiledFrameRemainder1 = !(!dn.field_K.field_G);
                if (decompiledFrameRemainder1) {
                  var11_ref = null;
                  var12 = 0;
                  var13 = 0;
                  while (true) {
                    if (cq.field_p > var13) {
                      stackOut_80_0 = h.field_D[var13];
                      stackIn_87_0 = stackOut_80_0 ? 1 : 0;
                      stackIn_81_0 = stackOut_80_0;
                      if (var19 == 0) {
                        if (stackIn_81_0) {
                          var25 = "<col=A00000>" + rg.field_b[var13] + "</col>";
                          if (var11_ref != null) {
                            var11_ref = (String) (var11_ref) + ", " + var25;
                            var12 = 1;
                          } else {
                            var11_ref = var25;
                          }
                        }
                        var13++;
                        continue;
                      }
                    } else {
                      stackIn_87_0 = -1;
                    }
                    break;
                  }
                  if (stackIn_87_0 != ~var10) {
                    var13_ref_String = bh.field_rb;
                    if (var12 == 0) {
                      var14_ref_String = rd.a(br.field_ac, new String[]{(String) (var11_ref)}, (byte) 103);
                      if (var19 != 0) {
                        var14_ref_String = ff.field_e + (String) (var11_ref);
                      }
                    } else {
                      var14_ref_String = ff.field_e + (String) (var11_ref);
                    }
                  } else {
                    var13_ref_String = eq.field_b;
                    boolean decompiledSharedTail0 = (var12 == 0);
                    if (!decompiledSharedTail0) {
                      var14_ref_String = ki.field_g + (String) (var11_ref);
                      decompiledSharedTail0 = (var19 != 0);
                    }
                    if (decompiledSharedTail0) {
                      var14_ref_String = rd.a(MouseWheelSource.field_b, new String[]{(String) (var11_ref)}, (byte) 103);
                    }
                  }
                  ep.field_e = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                }
              }
              if ((decompiledFrameRemainder1) && (!(var10 < 2) || var19 != 0) && (null != NodeDeque.field_a ||
                bl.field_F != null ||
                ld.field_v != null ||
                null != me.field_e)) {
                var11 = 0;
                var12 = 0;
                var13Lifetime1 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(cq.field_p > var16)))) {
                  var17_int = 255 & o.field_e.field_Tb[var16];
                  if (var19 == 0) {
                    if (NodeDeque.field_a != null &&
                      NodeDeque.field_a[var16] != null &&
                      NodeDeque.field_a[var16][var17_int]) {
                      var11 = 1;
                    }
                    if (bl.field_F != null &&
                      null != bl.field_F[var16]) {
                      var18_int = bl.field_F[var16][var17_int];
                      if (var18_int != 0 &&
                        !ea.field_g) {
                        var11 = 1;
                      }
                      if (var18_int > var13Lifetime1) {
                        var13Lifetime1 = var18_int;
                      }
                    }
                    if (ld.field_v != null &&
                      ld.field_v[var16] != null) {
                      var18_intLifetime1 = ld.field_v[var16][var17_int];
                      if (var18_intLifetime1 != 0 &&
                        !ea.field_g) {
                        var11 = 1;
                      }
                      if (var14 < var18_intLifetime1) {
                        var14 = var18_intLifetime1;
                      }
                    }
                    if (null != me.field_e &&
                      me.field_e[var16] != null) {
                      var15 = var15 | me.field_e[var16][var17_int];
                    }
                    var16++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  var16 = 0;
                }
                var17 = TimedSplashScreen.field_u.field_Rb.field_bb;
                var18_ref = (id) (var17.first(-97));
                scanLoop3: while (true) {
                  boolean decompiledFrameRemainder0 = true;
                  if (var18_ref != null) {
                    stackOut_132_0 = var18_ref.i(0);
                    stackIn_153_0 = stackOut_132_0 ? 1 : 0;
                    stackIn_133_0 = stackOut_132_0;
                    if (var19 != 0) {
                      break scanLoop3;
                    }
                    if (!stackIn_133_0 ||
                      var19 != 0) {
                      if (var11 != 0 &&
                        !var18_ref.field_ec) {
                        var16 = 1;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var13Lifetime1 > var18_ref.field_Wb) {
                          var16 = 1;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (var18_ref.field_ac < var14) {
                            var16 = 1;
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            if ((var15 & ~var18_ref.field_Ub) > 0) {
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
                      var18_ref = (id) (var17.next((byte) 116));
                      continue;
                    }
                  }
                  stackIn_153_0 = 2;
                  break;
                }
                if (stackIn_153_0 <= kb.field_Yb &&
                  pe.heldKeys[12]) {
                  var16 = 0;
                }
                if (var16 != 0) {
                  dn.field_K.field_eb = false;
                  if (dn.field_K.field_G) {
                    if (sb.field_c.field_d.field_Vb != 0) {
                      ep.field_e = rd.a(ta.field_d, new String[]{mh.field_Z}, (byte) 103);
                      if (var19 != 0) {
                        ep.field_e = ei.field_a;
                      }
                    } else {
                      ep.field_e = ei.field_a;
                    }
                  }
                }
              }
            }
            if (0L != ic.field_b) {
              var9 = (int)(ic.field_b - ue.a(false));
              var9 = (var9 + 999) / 1000;
              if (1 > var9) {
                var9 = 1;
              }
              var8.field_Mb = rd.a(SpriteGeometry.field_w, new String[]{Integer.toString(var9)}, (byte) 103);
            }
            um.field_b.field_Mb = rd.a(rl.field_d, new String[]{Integer.toString(o.field_e.field_cc), Integer.toString(o.field_e.field_jc)}, (byte) 103);
          }
          stackIn_174_0 = qa.field_w;
          stackIn_175_1 = (param2) && (!param1) && (!hc.field_c);
          ((mh) (Object) stackIn_174_0).a(stackIn_175_1, -15211);
          stackIn_179_0 = MultiplayerMatch.field_d;
          stackIn_180_1 = (param2) && (!param1) && (!hc.field_c);
          ((mh) (Object) stackIn_179_0).a(stackIn_180_1, -15211);
          stackIn_184_0 = wi.field_j;
          stackIn_185_1 = (param2) && (!param1) && (hc.field_c);
          ((mh) (Object) stackIn_184_0).a(stackIn_185_1, -15211);
          if (!param0) {
            var20 = (RgbSprite[]) null;
            nh.a(-9, -55, 119, -100, (RgbSprite[]) null, -102);
          }
          sb.field_c.field_d.i(0);
          if (null != o.field_e) {
            if (ij.field_e.field_L != 0) {
              vg.a(o.field_e.e((byte) 123), false, param3);
            }
            if (pf.field_h.field_L != 0) {
              hc.field_c = true;
            }
            if (dn.field_K.field_L != 0) {
              sl.field_w = true;
            }
            if (0 != nd.field_a.field_L) {
              hc.field_c = false;
            }
            ip.a(param3, o.field_e, false, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var5), "nh.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0) {
        om stackIn_15_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        RuntimeException decompiledCaughtException = null;
        om stackOut_14_0;
        id var1 = null;
        om var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        id var1Lifetime1;
        int stackIn_29_0Lifetime1;
        int stackIn_29_1Lifetime1;
        var2 = BrickABrac.field_J ? 1 : 0;
        try {
          var1 = (id) (ua.field_c.first(-50));
          while (var1 != null) {
            stackIn_29_0 = -1;
            stackIn_29_1 = ~var1.field_ic;
            if (var2 != 0) {
              while (true) {
                if (stackIn_29_0 == stackIn_29_1) {
                  var1.field_kc = 0;
                  if (var1.i(param0 + 0)) {
                    var1.unlink((byte) 111);
                  }
                }
                while (true) {
                  var1 = (id) (mp.field_Tb.next((byte) 116));
                  return;
                }
              }
            }
            if (stackIn_29_0 > stackIn_29_1) {
              var1.field_ic = var1.field_ic - 1;
              if (var1.field_ic == 0) {
                var1.field_kc = 0;
                if (var1.i(0)) {
                  var1.unlink((byte) 111);
                }
              }
            }
            var1 = (id) (ua.field_c.next((byte) 116));
            if (var2 == 0) {
              continue;
            }
            break;
          }
          var1_ref = (om) (rq.field_a.first(-14));
          if (param0 != 0) {
            field_b = -23;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var1_ref == null))) {
            stackOut_14_0 = var1_ref;
            stackIn_23_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (var2 == 0) {
              if (stackIn_15_0.field_Wb > 0) {
                var1_ref.field_Wb = var1_ref.field_Wb - 1;
                if (var1_ref.field_Wb == 0) {
                  var1_ref.field_Zb = 0;
                  if (var1_ref.h(param0 ^ -15)) {
                    var1_ref.unlink((byte) 111);
                  }
                }
              }
              var1_ref = (om) (rq.field_a.next((byte) 116));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_23_0 = mp.field_Tb.first(-21);
          }
          var1Lifetime1 = (id) (stackIn_23_0);
          while (true) {
            if (var1Lifetime1 == null) {
              return;
            }
            if (var2 != 0) {
              return;
            }
            if (var1Lifetime1.field_ic > 0) {
              var1Lifetime1.field_ic = var1Lifetime1.field_ic - 1;
              stackIn_29_0Lifetime1 = -1;
              stackIn_29_1Lifetime1 = ~var1Lifetime1.field_ic;
              if (stackIn_29_0Lifetime1 == stackIn_29_1Lifetime1) {
                var1Lifetime1.field_kc = 0;
                if (var1Lifetime1.i(param0 + 0)) {
                  var1Lifetime1.unlink((byte) 111);
                }
              }
            }
            var1Lifetime1 = (id) (mp.field_Tb.next((byte) 116));
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1_ref2), "nh.B(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        int var1 = 17 / ((param0 + 45) / 59);
        field_d = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_d = "Security";
    }
}
