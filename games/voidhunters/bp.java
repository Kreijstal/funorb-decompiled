/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp extends rqa {
    bp(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_42_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        var23 = VoidHunters.field_G;
        try {
          L0: {
            dda.a(param1, 98);
            if (param3 < -6) {
              L1: {
                var7_int = 0;
                var8 = -param6 + param1;
                if (var8 < 0) {
                  var8 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var9 = param1;
                var10 = -param1;
                var11 = var8;
                var12 = -var8;
                var13 = -1;
                if (param2 < lua.field_c) {
                  break L2;
                } else {
                  if (hab.field_i < param2) {
                    break L2;
                  } else {
                    var39 = rba.field_b[param2];
                    var16 = ksa.a(31123, ob.field_j, mt.field_o, param0 + -param1);
                    var17 = ksa.a(31123, ob.field_j, mt.field_o, param1 + param0);
                    var18 = ksa.a(31123, ob.field_j, mt.field_o, -var8 + param0);
                    var19 = ksa.a(31123, ob.field_j, mt.field_o, param0 + var8);
                    ww.a(param4, var18, var39, (byte) 75, var16);
                    ww.a(param5, var19, var39, (byte) 75, var18);
                    ww.a(param4, var17, var39, (byte) 75, var19);
                    break L2;
                  }
                }
              }
              var14 = -1;
              L3: while (true) {
                if (var7_int >= var9) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var13 += 2;
                    var14 += 2;
                    var10 = var10 + var13;
                    var12 = var12 + var14;
                    if (-1 < (var12 ^ -1)) {
                      break L4;
                    } else {
                      if (var11 >= 1) {
                        var11--;
                        dw.field_a[var11] = var7_int;
                        var12 = var12 - (var11 << 704154945);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var7_int++;
                    if (-1 < (var10 ^ -1)) {
                      break L5;
                    } else {
                      var9--;
                      var10 = var10 - (var9 << -1088584127);
                      var15 = -var9 + param2;
                      var16 = var9 + param2;
                      if (lua.field_c > var16) {
                        break L5;
                      } else {
                        if (var15 > hab.field_i) {
                          break L5;
                        } else {
                          if (var9 < var8) {
                            L6: {
                              var17 = dw.field_a[var9];
                              var18 = ksa.a(31123, ob.field_j, mt.field_o, param0 + var7_int);
                              var19 = ksa.a(31123, ob.field_j, mt.field_o, param0 + -var7_int);
                              var20 = ksa.a(31123, ob.field_j, mt.field_o, var17 + param0);
                              var21 = ksa.a(31123, ob.field_j, mt.field_o, -var17 + param0);
                              if (var16 > hab.field_i) {
                                break L6;
                              } else {
                                var40 = rba.field_b[var16];
                                ww.a(param4, var21, var40, (byte) 75, var19);
                                ww.a(param5, var20, var40, (byte) 75, var21);
                                ww.a(param4, var18, var40, (byte) 75, var20);
                                break L6;
                              }
                            }
                            if (lua.field_c <= var15) {
                              var41 = rba.field_b[var15];
                              ww.a(param4, var21, var41, (byte) 75, var19);
                              ww.a(param5, var20, var41, (byte) 75, var21);
                              ww.a(param4, var18, var41, (byte) 75, var20);
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            L7: {
                              var17 = ksa.a(31123, ob.field_j, mt.field_o, param0 + var7_int);
                              var18 = ksa.a(31123, ob.field_j, mt.field_o, param0 + -var7_int);
                              if (hab.field_i >= var16) {
                                ww.a(param4, var17, rba.field_b[var16], (byte) 75, var18);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            if (var15 < lua.field_c) {
                              break L5;
                            } else {
                              ww.a(param4, var17, rba.field_b[var15], (byte) 75, var18);
                              break L5;
                            }
                          }
                        }
                      }
                    }
                  }
                  var15 = param2 + -var7_int;
                  var16 = var7_int + param2;
                  if (var16 < lua.field_c) {
                    continue L3;
                  } else {
                    if (hab.field_i < var15) {
                      continue L3;
                    } else {
                      var17 = var9 + param0;
                      var18 = -var9 + param0;
                      if (ob.field_j > var17) {
                        continue L3;
                      } else {
                        if (var18 > mt.field_o) {
                          continue L3;
                        } else {
                          var17 = ksa.a(31123, ob.field_j, mt.field_o, var17);
                          var18 = ksa.a(31123, ob.field_j, mt.field_o, var18);
                          if (var8 > var7_int) {
                            L8: {
                              if (var11 >= var7_int) {
                                stackIn_42_0 = var11;
                                break L8;
                              } else {
                                stackIn_42_0 = dw.field_a[var7_int];
                                break L8;
                              }
                            }
                            L9: {
                              var19 = stackIn_42_0;
                              var20 = ksa.a(31123, ob.field_j, mt.field_o, var19 + param0);
                              var21 = ksa.a(31123, ob.field_j, mt.field_o, -var19 + param0);
                              if (var16 > hab.field_i) {
                                break L9;
                              } else {
                                var42 = rba.field_b[var16];
                                ww.a(param4, var21, var42, (byte) 75, var18);
                                ww.a(param5, var20, var42, (byte) 75, var21);
                                ww.a(param4, var17, var42, (byte) 75, var20);
                                break L9;
                              }
                            }
                            if (var15 < lua.field_c) {
                              continue L3;
                            } else {
                              var43 = rba.field_b[var15];
                              ww.a(param4, var21, var43, (byte) 75, var18);
                              ww.a(param5, var20, var43, (byte) 75, var21);
                              ww.a(param4, var17, var43, (byte) 75, var20);
                              continue L3;
                            }
                          } else {
                            L10: {
                              if (var16 > hab.field_i) {
                                break L10;
                              } else {
                                ww.a(param4, var17, rba.field_b[var16], (byte) 75, var18);
                                break L10;
                              }
                            }
                            if (var15 >= lua.field_c) {
                              ww.a(param4, var17, rba.field_b[var15], (byte) 75, var18);
                              continue L3;
                            } else {
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var7), "bp.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -119) {
              si.a(198, 62, param0[0].a(125));
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("bp.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0) {
        wjb.field_p = dma.field_j;
        gp.field_p = dma.field_g;
        moa.a(true);
        lc.field_b.a(0, -83, -40 + (tb.field_a.field_G + -2), 0, tb.field_a.field_hb);
        nna.field_v.a(0, -17, lw.field_i.field_hb, 0, nna.field_w);
        int var1 = nna.field_w - -2;
        fh.field_f.a(0, -26, lw.field_i.field_hb, ll.field_o ? var1 : 0, lw.field_i.field_G + -(ll.field_o ? var1 : 0));
        irb.a(0);
        gmb.field_c.a(0, 124, tb.field_a.field_hb, -40 + tb.field_a.field_G, 40);
        qpb.field_w.a(0, -65, bqa.field_d.field_hb, 0, 30);
        sra.field_a.a(0, 124, bqa.field_d.field_hb, 30, -32 + bqa.field_d.field_G + -40);
        fwa.field_a.a(5, param0 ^ 120, 68, 5, 30);
        wrb.field_q.a(75, 18, 78, 5, 30);
        gs.field_b.a(155, 124, 48, 5, 30);
        mqb.field_C.a(205, param0 ^ 113, 48, 5, 30);
        int var2 = ll.field_o ? 250 : 200;
        jna.field_o.a(var2 + 5, 123, -var2 + 363, 5, 30);
        uga.field_h.a(370, 116, -365 + (bqa.field_d.field_hb + -10), 5, 30);
        rgb.field_f.a(-5 + (sra.field_a.field_hb - 5), 2, -1, -5 + (-37 + sra.field_a.field_G), 37, param0, rba.field_a);
        int var3 = (bqa.field_d.field_hb + 2) / 2;
        gha.field_p.a(0, -116, -2 + var3, -40 + bqa.field_d.field_G, 40);
        if (!ll.field_o) {
            var3 = 0;
        }
        oib.field_a.a(var3, 119, bqa.field_d.field_hb + -var3, bqa.field_d.field_G + -40, 40);
    }

    static {
    }
}
