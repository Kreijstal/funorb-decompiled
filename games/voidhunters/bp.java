/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp extends rqa {
    bp(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
        int var23 = 0;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int stackIn_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        var23 = VoidHunters.field_G;
        dda.a(param1, 98);
        if (param3 < -6) {
          L0: {
            var7 = 0;
            var8 = -param6 + param1;
            if (var8 < 0) {
              var8 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var9 = param1;
            var10 = -param1;
            var11 = var8;
            var12 = -var8;
            var13 = -1;
            if (param2 < lua.field_c) {
              break L1;
            } else {
              if (hab.field_i < param2) {
                break L1;
              } else {
                var39 = rba.field_b[param2];
                var16 = ksa.a(31123, ob.field_j, mt.field_o, param0 + -param1);
                var17 = ksa.a(31123, ob.field_j, mt.field_o, param1 + param0);
                var18 = ksa.a(31123, ob.field_j, mt.field_o, -var8 + param0);
                var19 = ksa.a(31123, ob.field_j, mt.field_o, param0 + var8);
                ww.a(param4, var18, var39, (byte) 75, var16);
                ww.a(param5, var19, var39, (byte) 75, var18);
                ww.a(param4, var17, var39, (byte) 75, var19);
                break L1;
              }
            }
          }
          var14 = -1;
          L2: while (true) {
            if (var7 >= var9) {
              return;
            } else {
              L3: {
                var13 += 2;
                var14 += 2;
                var10 = var10 + var13;
                var12 = var12 + var14;
                if (-1 < (var12 ^ -1)) {
                  break L3;
                } else {
                  if (var11 >= 1) {
                    var11--;
                    dw.field_a[var11] = var7;
                    var12 = var12 - (var11 << 704154945);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var7++;
                if (-1 < (var10 ^ -1)) {
                  break L4;
                } else {
                  var9--;
                  var10 = var10 - (var9 << -1088584127);
                  var15 = -var9 + param2;
                  var16 = var9 + param2;
                  if (lua.field_c > var16) {
                    break L4;
                  } else {
                    if (var15 > hab.field_i) {
                      break L4;
                    } else {
                      if (var9 < var8) {
                        L5: {
                          var17 = dw.field_a[var9];
                          var18 = ksa.a(31123, ob.field_j, mt.field_o, param0 + var7);
                          var19 = ksa.a(31123, ob.field_j, mt.field_o, param0 + -var7);
                          var20 = ksa.a(31123, ob.field_j, mt.field_o, var17 + param0);
                          var21 = ksa.a(31123, ob.field_j, mt.field_o, -var17 + param0);
                          if (var16 > hab.field_i) {
                            break L5;
                          } else {
                            var40 = rba.field_b[var16];
                            ww.a(param4, var21, var40, (byte) 75, var19);
                            ww.a(param5, var20, var40, (byte) 75, var21);
                            ww.a(param4, var18, var40, (byte) 75, var20);
                            break L5;
                          }
                        }
                        if (lua.field_c <= var15) {
                          var41 = rba.field_b[var15];
                          ww.a(param4, var21, var41, (byte) 75, var19);
                          ww.a(param5, var20, var41, (byte) 75, var21);
                          ww.a(param4, var18, var41, (byte) 75, var20);
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        L6: {
                          var17 = ksa.a(31123, ob.field_j, mt.field_o, param0 + var7);
                          var18 = ksa.a(31123, ob.field_j, mt.field_o, param0 + -var7);
                          if (hab.field_i >= var16) {
                            ww.a(param4, var17, rba.field_b[var16], (byte) 75, var18);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (var15 < lua.field_c) {
                          break L4;
                        } else {
                          ww.a(param4, var17, rba.field_b[var15], (byte) 75, var18);
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
              var15 = param2 + -var7;
              var16 = var7 + param2;
              if (var16 < lua.field_c) {
                continue L2;
              } else {
                if (hab.field_i < var15) {
                  continue L2;
                } else {
                  var17 = var9 + param0;
                  var18 = -var9 + param0;
                  if (ob.field_j > var17) {
                    continue L2;
                  } else {
                    if (var18 > mt.field_o) {
                      continue L2;
                    } else {
                      var17 = ksa.a(31123, ob.field_j, mt.field_o, var17);
                      var18 = ksa.a(31123, ob.field_j, mt.field_o, var18);
                      if (var8 > var7) {
                        L7: {
                          if (var11 >= var7) {
                            stackOut_40_0 = var11;
                            stackIn_41_0 = stackOut_40_0;
                            break L7;
                          } else {
                            stackOut_39_0 = dw.field_a[var7];
                            stackIn_41_0 = stackOut_39_0;
                            break L7;
                          }
                        }
                        L8: {
                          var19 = stackIn_41_0;
                          var20 = ksa.a(31123, ob.field_j, mt.field_o, var19 + param0);
                          var21 = ksa.a(31123, ob.field_j, mt.field_o, -var19 + param0);
                          if (var16 > hab.field_i) {
                            break L8;
                          } else {
                            var42 = rba.field_b[var16];
                            ww.a(param4, var21, var42, (byte) 75, var18);
                            ww.a(param5, var20, var42, (byte) 75, var21);
                            ww.a(param4, var17, var42, (byte) 75, var20);
                            break L8;
                          }
                        }
                        if (var15 < lua.field_c) {
                          continue L2;
                        } else {
                          var43 = rba.field_b[var15];
                          ww.a(param4, var21, var43, (byte) 75, var18);
                          ww.a(param5, var20, var43, (byte) 75, var21);
                          ww.a(param4, var17, var43, (byte) 75, var20);
                          continue L2;
                        }
                      } else {
                        L9: {
                          if (var16 > hab.field_i) {
                            break L9;
                          } else {
                            ww.a(param4, var17, rba.field_b[var16], (byte) 75, var18);
                            break L9;
                          }
                        }
                        if (var15 >= lua.field_c) {
                          ww.a(param4, var17, rba.field_b[var15], (byte) 75, var18);
                          continue L2;
                        } else {
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          si.a(198, 62, param0[0].a(125));
          return new nc((Object) (Object) "void");
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        llb stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        llb stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        llb stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        llb stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        llb stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        llb stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_9_0 = 0;
        llb stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        llb stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        llb stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        llb stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        int stackOut_3_5 = 0;
        llb stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        llb stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          wjb.field_p = dma.field_j;
          gp.field_p = dma.field_g;
          moa.a(true);
          lc.field_b.a(0, -83, -40 + (tb.field_a.field_G + -2), 0, tb.field_a.field_hb);
          nna.field_v.a(0, -17, lw.field_i.field_hb, 0, nna.field_w);
          var1 = nna.field_w - -2;
          stackOut_0_0 = fh.field_f;
          stackOut_0_1 = 0;
          stackOut_0_2 = -26;
          stackOut_0_3 = lw.field_i.field_hb;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (!ll.field_o) {
            stackOut_2_0 = (llb) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (llb) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = var1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = (llb) (Object) stackIn_3_0;
          stackOut_3_1 = stackIn_3_1;
          stackOut_3_2 = stackIn_3_2;
          stackOut_3_3 = stackIn_3_3;
          stackOut_3_4 = stackIn_3_4;
          stackOut_3_5 = lw.field_i.field_G;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_5_2 = stackOut_3_2;
          stackIn_5_3 = stackOut_3_3;
          stackIn_5_4 = stackOut_3_4;
          stackIn_5_5 = stackOut_3_5;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
          stackIn_4_5 = stackOut_3_5;
          if (!ll.field_o) {
            stackOut_5_0 = (llb) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = stackIn_5_2;
            stackOut_5_3 = stackIn_5_3;
            stackOut_5_4 = stackIn_5_4;
            stackOut_5_5 = stackIn_5_5;
            stackOut_5_6 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            stackIn_6_3 = stackOut_5_3;
            stackIn_6_4 = stackOut_5_4;
            stackIn_6_5 = stackOut_5_5;
            stackIn_6_6 = stackOut_5_6;
            break L1;
          } else {
            stackOut_4_0 = (llb) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = stackIn_4_4;
            stackOut_4_5 = stackIn_4_5;
            stackOut_4_6 = var1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            stackIn_6_5 = stackOut_4_5;
            stackIn_6_6 = stackOut_4_6;
            break L1;
          }
        }
        L2: {
          ((llb) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4, stackIn_6_5 + -stackIn_6_6);
          irb.a(0);
          gmb.field_c.a(0, 124, tb.field_a.field_hb, -40 + tb.field_a.field_G, 40);
          qpb.field_w.a(0, -65, bqa.field_d.field_hb, 0, 30);
          sra.field_a.a(0, 124, bqa.field_d.field_hb, 30, -32 + bqa.field_d.field_G + -40);
          fwa.field_a.a(5, param0 ^ 120, 68, 5, 30);
          wrb.field_q.a(75, 18, 78, 5, 30);
          gs.field_b.a(155, 124, 48, 5, 30);
          mqb.field_C.a(205, param0 ^ 113, 48, 5, 30);
          if (!ll.field_o) {
            stackOut_8_0 = 200;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 250;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var2 = stackIn_9_0;
          jna.field_o.a(var2 + 5, 123, -var2 + 363, 5, 30);
          uga.field_h.a(370, 116, -365 + (bqa.field_d.field_hb + -10), 5, 30);
          rgb.field_f.a(-5 + (sra.field_a.field_hb - 5), 2, -1, -5 + (-37 + sra.field_a.field_G), 37, param0, rba.field_a);
          var3 = (bqa.field_d.field_hb + 2) / 2;
          gha.field_p.a(0, -116, -2 + var3, -40 + bqa.field_d.field_G, 40);
          if (ll.field_o) {
            break L3;
          } else {
            var3 = 0;
            break L3;
          }
        }
        oib.field_a.a(var3, 119, bqa.field_d.field_hb + -var3, bqa.field_d.field_G + -40, 40);
    }

    static {
    }
}
