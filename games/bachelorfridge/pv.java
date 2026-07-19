/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pv extends bw {
    jfa field_f;
    static String field_h;
    static int field_i;
    int field_g;

    public static void a(int param0) {
        field_h = null;
        if (param0 != -15565) {
            pv.a(47);
        }
    }

    boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return false;
    }

    final static void a(int param0, long param1) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  Thread.sleep(param1);
                  if (param0 == 20182) {
                    break L1;
                  } else {
                    pv.a(24, -57L);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        sna var7_ref_sna = null;
        int var7 = 0;
        int var8_int = 0;
        sna var8 = null;
        int var9 = 0;
        gna var9_ref_gna = null;
        int var10_int = 0;
        gna var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        sna var14 = null;
        int var15 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        sna stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        sna stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        sna stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_52_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        sna stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        sna stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        sna stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_i = -56;
                break L1;
              }
            }
            L2: {
              kq.field_i = dg.field_c;
              kg.field_b = dg.field_i;
              if (param0) {
                stackOut_5_0 = ld.field_p;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = dja.field_m;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              stackOut_6_0 = stackIn_6_0;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (param1) {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            L4: {
              dna.c(stackIn_9_0, stackIn_9_1 != 0);
              pf.field_n.a(0, ela.field_i.field_p - 42, 0, ela.field_i.field_sb, (byte) 99);
              mja.field_t.a(rg.field_h, 31407, nu.field_f.field_sb, 0, 0);
              stackOut_9_0 = oga.field_t;
              stackOut_9_1 = 18;
              stackOut_9_2 = 31407;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              if (!eaa.field_c) {
                stackOut_11_0 = (sna) ((Object) stackIn_11_0);
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                break L4;
              } else {
                stackOut_10_0 = (sna) ((Object) stackIn_10_0);
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = stackIn_10_2;
                stackOut_10_3 = 4 + rj.field_j - -40;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_12_3 = stackOut_10_3;
                break L4;
              }
            }
            L5: {
              ((sna) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2, -stackIn_12_3 + nu.field_f.field_sb, 0, rg.field_h - -2);
              ut.field_q.a(18, 31407, 42 - -rj.field_j, -40 + (nu.field_f.field_sb - rj.field_j - 2), rg.field_h - -2);
              ak.field_q.a((byte) -58, -2 + (nu.field_f.field_p - (rg.field_h - -20)), 0, 22 + rg.field_h, nu.field_f.field_sb, rj.field_j, 2);
              jj.field_wb.a(40, 31407, ela.field_i.field_sb, 0, -40 + ela.field_i.field_p);
              vaa.field_a.a(30, 31407, ho.field_g.field_sb, 0, 0);
              vm.field_i.a(-40 + (ho.field_g.field_p + -32), 31407, ho.field_g.field_sb, 0, 30);
              var2_int = 3 + ld.field_q;
              if ((qha.field_c.length ^ -1) <= -3) {
                break L5;
              } else {
                var2_int--;
                break L5;
              }
            }
            L6: {
              if (!param0) {
                break L6;
              } else {
                var2_int--;
                break L6;
              }
            }
            L7: {
              var3 = (-10 + (vm.field_i.field_p - 5) + (-5 - (-2 + -((1 + var2_int) / 2)))) / (1 + var2_int) - 2;
              if (var3 <= 30) {
                break L7;
              } else {
                var3 = 30;
                break L7;
              }
            }
            L8: {
              var4 = -5 + vm.field_i.field_p - 5 + -((var3 + 2) * var2_int);
              if (var4 <= 40) {
                break L8;
              } else {
                var4 = 40;
                break L8;
              }
            }
            mh.field_j.a(var4, 31407, -5 + (vm.field_i.field_sb + -5), 5, 5);
            var5 = var4 + 5 + 2;
            var6 = 0;
            L9: while (true) {
              if (4 + ld.field_q <= var6) {
                qw.field_b.a(-124 + (dg.field_c - 10 + -10), 31407, 360, dg.field_i + -360 >> 1026381953, 10);
                saa.field_f.a(24, 31407, qw.field_b.field_sb, 0, 0);
                rf.field_q.a(-24 + qw.field_b.field_p, 31407, qw.field_b.field_sb, 0, 24);
                rf.field_q.field_eb = mu.a(11579568, 3, rf.field_q.field_p, 8421504, 1, (byte) 17);
                tv.field_o.a(-26 + (-10 + rf.field_q.field_p), 31407, rf.field_q.field_sb - 10, 5, 5);
                vca.field_h.a(24, 31407, 80, (rf.field_q.field_sb - 80) / 2, -24 + rf.field_q.field_p - 5);
                pg.e(0);
                break L0;
              } else {
                L10: {
                  L11: {
                    if (1 != var6) {
                      break L11;
                    } else {
                      if (qha.field_c.length >= 2) {
                        break L11;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (-4 != (var6 ^ -1)) {
                      break L12;
                    } else {
                      if (-2 > (bma.field_u ^ -1)) {
                        break L12;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L13: {
                    if (param0) {
                      break L13;
                    } else {
                      if (3 != var6) {
                        break L13;
                      } else {
                        var14 = pka.field_b[var6];
                        var7_ref_sna = var14;
                        pka.field_b[var6].field_p = 0;
                        var14.field_sb = 0;
                        var8_int = 0;
                        L14: while (true) {
                          if (gd.field_n[var6].length <= var8_int) {
                            break L10;
                          } else {
                            if (null != gd.field_n[var6][var8_int]) {
                              var9_ref_gna = gd.field_n[var6][var8_int];
                              gd.field_n[var6][var8_int].field_p = 0;
                              var9_ref_gna.field_sb = 0;
                              var8_int++;
                              continue L14;
                            } else {
                              var8_int++;
                              continue L14;
                            }
                          }
                        }
                      }
                    }
                  }
                  L15: {
                    if (!param0) {
                      break L15;
                    } else {
                      if (var6 != 0) {
                        break L15;
                      } else {
                        var7_ref_sna = pka.field_b[var6];
                        pka.field_b[var6].field_p = 0;
                        var7_ref_sna.field_sb = 0;
                        var8_int = 0;
                        L16: while (true) {
                          if (var8_int >= gd.field_n[var6].length) {
                            break L10;
                          } else {
                            if (null != gd.field_n[var6][var8_int]) {
                              var9_ref_gna = gd.field_n[var6][var8_int];
                              gd.field_n[var6][var8_int].field_p = 0;
                              var9_ref_gna.field_sb = 0;
                              var8_int++;
                              continue L16;
                            } else {
                              var8_int++;
                              continue L16;
                            }
                          }
                        }
                      }
                    }
                  }
                  L17: {
                    if (param0) {
                      if (-5 >= (var6 ^ -1)) {
                        if (null != vl.field_e) {
                          if (vl.field_e[var6 - 4]) {
                            stackOut_50_0 = 1;
                            stackIn_52_0 = stackOut_50_0;
                            break L17;
                          } else {
                            stackOut_49_0 = 0;
                            stackIn_52_0 = stackOut_49_0;
                            break L17;
                          }
                        } else {
                          stackOut_47_0 = 0;
                          stackIn_52_0 = stackOut_47_0;
                          break L17;
                        }
                      } else {
                        stackOut_45_0 = 0;
                        stackIn_52_0 = stackOut_45_0;
                        break L17;
                      }
                    } else {
                      stackOut_43_0 = 0;
                      stackIn_52_0 = stackOut_43_0;
                      break L17;
                    }
                  }
                  var7 = stackIn_52_0;
                  if (var7 != 0) {
                    var8 = pka.field_b[var6];
                    pka.field_b[var6].field_p = 0;
                    var8.field_sb = 0;
                    var15 = 0;
                    var9 = var15;
                    L18: while (true) {
                      if (gd.field_n[var6].length <= var15) {
                        break L10;
                      } else {
                        if (null != gd.field_n[var6][var15]) {
                          var10 = gd.field_n[var6][var15];
                          gd.field_n[var6][var15].field_p = 0;
                          var10.field_sb = 0;
                          var15++;
                          continue L18;
                        } else {
                          var15++;
                          continue L18;
                        }
                      }
                    }
                  } else {
                    L19: {
                      pka.field_b[var6].a(var3, 31407, 103, 5, var5);
                      var8_int = 110;
                      if (!param0) {
                        if (null != gd.field_n[var6][0]) {
                          var9_ref_gna = gd.field_n[var6][0];
                          gd.field_n[var6][0].field_p = 0;
                          var9_ref_gna.field_sb = 0;
                          break L19;
                        } else {
                          break L19;
                        }
                      } else {
                        gd.field_n[var6][0].a(38, 2, var3, var8_int, lm.field_d, (byte) -113, var5);
                        var8_int += 40;
                        break L19;
                      }
                    }
                    var9 = ho.field_g.field_sb + (-5 + -var8_int - -2);
                    var10_int = -1 + gd.field_n[var6].length;
                    var11 = 0;
                    L20: while (true) {
                      if (var10_int <= var11) {
                        var5 = var5 + (2 + var3);
                        break L10;
                      } else {
                        var12 = var11 * var9 / var10_int;
                        gd.field_n[var6][var11 + 1].a(-var12 + (var9 * (1 + var11) / var10_int - 2), 2, var3, var12 + var8_int, lm.field_d, (byte) -9, var5);
                        var11++;
                        continue L20;
                      }
                    }
                  }
                }
                var6++;
                continue L9;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "pv.B(" + param0 + ',' + param1 + ')');
        }
    }

    pv() {
    }

    static {
        field_i = 50;
        field_h = "Similar rating";
    }
}
