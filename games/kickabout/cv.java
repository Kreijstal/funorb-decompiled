/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cv {
    static int field_d;
    static boolean field_e;
    static ut[][] field_b;
    static int[] field_a;
    static String field_c;
    static String field_g;
    static hu field_f;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        ut var3_ref_ut = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (rm.field_C != 0) {
                if (rm.field_C == 1) {
                  oi.field_e = new oh[26];
                  var1_int = 0;
                  var2 = 0;
                  L2: while (true) {
                    if (var2 >= 14) {
                      var2 = -40;
                      var3 = 0;
                      L3: while (true) {
                        if (var3 >= 6) {
                          var2 = -40;
                          var3 = 0;
                          L4: while (true) {
                            if (var3 >= 6) {
                              break L1;
                            } else {
                              L5: {
                                int incrementValue$27 = var1_int;
                                var1_int++;
                                oi.field_e[incrementValue$27] = new oh(ku.field_g[p.a((byte) -24, 2)], var2, -90);
                                stackOut_21_0 = var2;
                                stackIn_23_0 = stackOut_21_0;
                                stackIn_22_0 = stackOut_21_0;
                                if ((1 & var3) != 0) {
                                  stackOut_23_0 = stackIn_23_0;
                                  stackOut_23_1 = 265;
                                  stackIn_24_0 = stackOut_23_0;
                                  stackIn_24_1 = stackOut_23_1;
                                  break L5;
                                } else {
                                  stackOut_22_0 = stackIn_22_0;
                                  stackOut_22_1 = 95;
                                  stackIn_24_0 = stackOut_22_0;
                                  stackIn_24_1 = stackOut_22_1;
                                  break L5;
                                }
                              }
                              var2 = stackIn_24_0 + stackIn_24_1;
                              var3++;
                              continue L4;
                            }
                          }
                        } else {
                          L6: {
                            int incrementValue$28 = var1_int;
                            var1_int++;
                            oi.field_e[incrementValue$28] = new oh(ku.field_g[p.a((byte) -24, 2)], var2, 1394);
                            stackOut_15_0 = var2;
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            if (0 == (var3 & 1)) {
                              stackOut_17_0 = stackIn_17_0;
                              stackOut_17_1 = 95;
                              stackIn_18_0 = stackOut_17_0;
                              stackIn_18_1 = stackOut_17_1;
                              break L6;
                            } else {
                              stackOut_16_0 = stackIn_16_0;
                              stackOut_16_1 = 265;
                              stackIn_18_0 = stackOut_16_0;
                              stackIn_18_1 = stackOut_16_1;
                              break L6;
                            }
                          }
                          var2 = stackIn_18_0 + stackIn_18_1;
                          var3++;
                          continue L3;
                        }
                      }
                    } else {
                      L7: {
                        var3_ref_ut = oo.field_b[p.a((byte) -24, 3)];
                        var4 = -280;
                        var5 = -200 - -(var2 * 130);
                        if (p.a((byte) -24, 2) != 0) {
                          break L7;
                        } else {
                          var4 = -110 + (-var4 + 896);
                          break L7;
                        }
                      }
                      int incrementValue$29 = var1_int;
                      var1_int++;
                      oi.field_e[incrementValue$29] = new oh(var3_ref_ut, var4, var5);
                      var2++;
                      continue L2;
                    }
                  }
                } else {
                  if (rm.field_C == 2) {
                    oi.field_e = new oh[5];
                    var1_int = 0;
                    int incrementValue$30 = var1_int;
                    var1_int++;
                    oi.field_e[incrementValue$30] = new oh(oo.field_b[1], 1002, -229);
                    int incrementValue$31 = var1_int;
                    var1_int++;
                    oi.field_e[incrementValue$31] = new oh(oo.field_b[2], 1126, -206);
                    int incrementValue$32 = var1_int;
                    var1_int++;
                    oi.field_e[incrementValue$32] = new oh(oo.field_b[0], -332, 200);
                    int incrementValue$33 = var1_int;
                    var1_int++;
                    oi.field_e[incrementValue$33] = new oh(oo.field_b[0], -170, 1428);
                    int incrementValue$34 = var1_int;
                    var1_int++;
                    oi.field_e[incrementValue$34] = new oh(oo.field_b[1], -296, 1415);
                    break L1;
                  } else {
                    if (rm.field_C != 3) {
                      break L1;
                    } else {
                      oi.field_e = new oh[]{};
                      break L1;
                    }
                  }
                }
              } else {
                oi.field_e = new oh[19];
                var1_int = 0;
                int incrementValue$35 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$35] = new oh(oo.field_b[0], -156, -31);
                int incrementValue$36 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$36] = new oh(oo.field_b[2], 933, 763);
                int incrementValue$37 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$37] = new oh(oo.field_b[0], 943, -36);
                int incrementValue$38 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$38] = new oh(oo.field_b[0], -141, 1275);
                int incrementValue$39 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$39] = new oh(ku.field_g[0], -390, 629);
                int incrementValue$40 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$40] = new oh(ku.field_g[1], -264, 584);
                int incrementValue$41 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$41] = new oh(ku.field_g[1], -357, 447);
                int incrementValue$42 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$42] = new oh(ku.field_g[0], -259, 379);
                int incrementValue$43 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$43] = new oh(oo.field_b[0], 180, 1371);
                int incrementValue$44 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$44] = new oh(oo.field_b[1], 566, 1422);
                int incrementValue$45 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$45] = new oh(oo.field_b[0], 750, 1353);
                int incrementValue$46 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$46] = new oh(oo.field_b[2], 51, 1415);
                int incrementValue$47 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$47] = new oh(oo.field_b[1], 1014, 211);
                int incrementValue$48 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$48] = new oh(oo.field_b[2], 775, -174);
                int incrementValue$49 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$49] = new oh(oo.field_b[1], 570, -220);
                int incrementValue$50 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$50] = new oh(oo.field_b[0], 211, -199);
                int incrementValue$51 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$51] = new oh(oo.field_b[2], -31, -163);
                int incrementValue$52 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$52] = new oh(oo.field_b[1], -288, 1213);
                int incrementValue$53 = var1_int;
                var1_int++;
                oi.field_e[incrementValue$53] = new oh(oo.field_b[2], -200, 1041);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "cv.J(" + 11383 + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int[] var1_array = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            if (null == ra.field_G) {
              return;
            } else {
              L1: {
                if (cq.field_h instanceof rm) {
                  ug.field_e = null;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                ra.field_G.a(256, true, -91, cq.field_h);
                cq.field_h = ra.field_G;
                ra.field_G = null;
                ce.field_I = 0;
                wr.field_f = po.a(cq.field_h, -4);
                if (wi.field_B) {
                  sr.field_l = null;
                  wi.field_B = false;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (!al.field_Db) {
                  break L3;
                } else {
                  um.field_e = null;
                  al.field_Db = false;
                  oa.b(-23217);
                  mv.a((byte) 119);
                  el.g(0);
                  break L3;
                }
              }
              L4: {
                if (!mc.field_j) {
                  break L4;
                } else {
                  vs.field_g = null;
                  ve.field_R = new tf();
                  var13 = bh.field_f;
                  var11 = var13;
                  var9 = var11;
                  var7 = var9;
                  var4 = var7;
                  var1_array = var4;
                  var2 = 0;
                  L5: while (true) {
                    if (var2 >= 8) {
                      var14 = ha.field_F;
                      var12 = var14;
                      var10 = var12;
                      var8 = var10;
                      var5 = var8;
                      var1_array = var5;
                      var6 = 0;
                      var2 = var6;
                      L6: while (true) {
                        if (var6 >= 8) {
                          mc.field_j = false;
                          break L4;
                        } else {
                          var14[var6] = 0;
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      var13[var2] = 0;
                      var2++;
                      continue L5;
                    }
                  }
                }
              }
              L7: {
                if (!k.field_k) {
                  break L7;
                } else {
                  vc.f((byte) 119);
                  vr.a(-2);
                  qg.a(0);
                  k.field_k = false;
                  break L7;
                }
              }
              L8: {
                if (param0 >= 42) {
                  break L8;
                } else {
                  field_a = null;
                  break L8;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "cv.I(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_f = null;
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = true;
        field_b = new ut[3][4];
        field_a = new int[6];
        field_a[0] = 1549;
        field_a[4] = -1;
        field_a[5] = -1;
        field_a[2] = 1049;
        field_a[3] = 3049;
        field_a[1] = 799;
        field_g = "The invitation has been withdrawn.";
    }
}
