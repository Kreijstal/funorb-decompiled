/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static String[] field_c;
    static String field_f;
    static fm field_d;
    static int field_a;
    private int field_e;
    static String field_h;
    private th field_b;
    static String field_g;

    final void a(byte param0, byte[] param1) {
        gi var3 = null;
        try {
            var3 = new gi(param1);
            if (param0 <= 71) {
                field_h = null;
            }
            int fieldTemp$0 = ((ci) this).field_e;
            ((ci) this).field_e = ((ci) this).field_e + 1;
            var3.field_k = fieldTemp$0;
            if (!(var3.field_j == 2)) {
                if (var3.field_j != 4) {
                }
            }
            ((ci) this).field_b.a((br) (Object) var3, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ci.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b() {
        field_d = null;
        field_c = null;
        field_h = null;
        field_f = null;
        field_g = null;
    }

    final static String a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        String var1 = "(" + k.field_k + " " + jp.field_e + " " + ij.field_d + ") " + op.field_i;
        if (param0 >= hd.field_q) {
        } else {
            var1 = var1 + ":";
            for (var2 = 0; var2 < hd.field_q; var2++) {
                var1 = var1 + ' ';
                var3 = 255 & s.field_e.field_m[var2];
                var4 = var3 >> 4;
                var3 = var3 & 15;
                if (10 > var4) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                if (10 > var3) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var1 + (char)var4;
                var1 = var1 + (char)var3;
            }
        }
        return var1;
    }

    final byte[] a(byte param0, int param1) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        th var3 = ((ci) this).field_b;
        Object var4 = null;
        if (param0 != -85) {
            return null;
        }
        gi var4_ref = (gi) (Object) var3.c(113);
        while (var4_ref != null) {
            if (var4_ref.field_k == param1) {
                break;
            }
            var4_ref = (gi) (Object) var3.b(6);
        }
        if (var4_ref == null) {
            return null;
        }
        return var4_ref.field_o;
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        cj var8_ref_cj = null;
        int var9_int = 0;
        mo var9 = null;
        int var10 = 0;
        mo var10_ref_mo = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        cj var14 = null;
        cj var15 = null;
        int stackIn_4_0 = 0;
        cj stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        cj stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        cj stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_43_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        cj stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        cj stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        cj stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_41_0 = 0;
        int stackOut_42_0 = 0;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              dm.field_Qb = oo.field_l;
              kp.field_l = oo.field_b;
              if (param0) {
                stackOut_3_0 = sq.field_Q;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = da.field_a;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              mf.a(stackIn_4_0, false);
              em.field_U.a(0, mh.field_i.field_zb, 0, (byte) -74, -2 + (-40 + mh.field_i.field_z));
              fn.field_h.a(jk.field_f, 0, ga.field_r.field_zb, 0, -3344);
              stackOut_4_0 = ie.field_jb;
              stackOut_4_1 = 18;
              stackOut_4_2 = 2 + jk.field_f;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              if (tb.field_u) {
                stackOut_6_0 = (cj) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = 2 + (40 + qa.field_o) + 2;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                break L2;
              } else {
                stackOut_5_0 = (cj) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = 0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                break L2;
              }
            }
            L3: {
              ((cj) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, -stackIn_7_3 + ga.field_r.field_zb, 0, -3344);
              bf.field_h.a(18, 2 + jk.field_f, 42 - -qa.field_o, -42 + -qa.field_o + ga.field_r.field_zb, -3344);
              bf.field_n.a(qa.field_o, 2, ga.field_r.field_zb, 0, -2 + -jk.field_f + (ga.field_r.field_z + -20), -31465, 20 + (2 + jk.field_f));
              jp.field_b.a(40, mh.field_i.field_z + -40, mh.field_i.field_zb, 0, -3344);
              gg.field_m.a(30, 0, fc.field_a.field_zb, 0, -3344);
              dl.field_a.a(-2 + fc.field_a.field_z - 70, 30, fc.field_a.field_zb, 0, -3344);
              var2_int = 3 + kj.field_h;
              if (2 > qo.field_r.length) {
                var2_int--;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0) {
                var2_int--;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var3 = -2 + (-10 + dl.field_a.field_z - (8 + -((var2_int - -1) / 2))) / (var2_int + 1);
              if (var3 > 30) {
                var3 = 30;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var4 = -(var2_int * (var3 + 2)) + -5 + (dl.field_a.field_z - 5);
              if (var4 > 40) {
                var4 = 40;
                break L6;
              } else {
                break L6;
              }
            }
            ik.field_d.a(var4, 5, -5 + (dl.field_a.field_zb - 5), 5, -3344);
            var5 = var4 + 7;
            var6 = 0;
            L7: while (true) {
              if (4 + kj.field_h <= var6) {
                qf.field_b.a(-10 + (-4 + oo.field_l - 130), 10, 360, oo.field_b - 360 >> 1, -3344);
                mq.field_l.a(24, 0, qf.field_b.field_zb, 0, -3344);
                vb.field_c.a(-24 + qf.field_b.field_z, 24, qf.field_b.field_zb, 0, -3344);
                vb.field_c.field_ab = tg.a(1, vb.field_c.field_z, 8421504, 3, 11579568, 35);
                pd.field_b.a(-26 + (-10 + vb.field_c.field_z), 5, -10 + vb.field_c.field_zb, 5, -3344);
                pg.field_a.a(24, -24 + vb.field_c.field_z + -5, 80, (-80 + vb.field_c.field_zb) / 2, -3344);
                if (param1 <= -6) {
                  up.a(false);
                  break L0;
                } else {
                  return;
                }
              } else {
                L8: {
                  L9: {
                    if (var6 != 1) {
                      break L9;
                    } else {
                      if (2 > qo.field_r.length) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (3 != var6) {
                      break L10;
                    } else {
                      if (r.field_f > 1) {
                        break L10;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L11: {
                    if (param0) {
                      break L11;
                    } else {
                      if (var6 == 3) {
                        var15 = mi.field_Ib[var6];
                        mi.field_Ib[var6].field_z = 0;
                        var15.field_zb = 0;
                        var8 = 0;
                        L12: while (true) {
                          if (ma.field_b[var6].length <= var8) {
                            break L8;
                          } else {
                            L13: {
                              if (null == ma.field_b[var6][var8]) {
                                break L13;
                              } else {
                                var9 = ma.field_b[var6][var8];
                                ma.field_b[var6][var8].field_z = 0;
                                var9.field_zb = 0;
                                break L13;
                              }
                            }
                            var8++;
                            continue L12;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  L14: {
                    if (!param0) {
                      break L14;
                    } else {
                      if (var6 != 0) {
                        break L14;
                      } else {
                        var14 = mi.field_Ib[var6];
                        mi.field_Ib[var6].field_z = 0;
                        var14.field_zb = 0;
                        var8 = 0;
                        L15: while (true) {
                          if (~ma.field_b[var6].length >= ~var8) {
                            break L8;
                          } else {
                            L16: {
                              if (null == ma.field_b[var6][var8]) {
                                break L16;
                              } else {
                                var9 = ma.field_b[var6][var8];
                                ma.field_b[var6][var8].field_z = 0;
                                var9.field_zb = 0;
                                break L16;
                              }
                            }
                            var8++;
                            continue L15;
                          }
                        }
                      }
                    }
                  }
                  L17: {
                    L18: {
                      if (!param0) {
                        break L18;
                      } else {
                        if (var6 < 4) {
                          break L18;
                        } else {
                          if (null == km.field_ab) {
                            break L18;
                          } else {
                            if (!km.field_ab[var6 + -4]) {
                              break L18;
                            } else {
                              stackOut_41_0 = 1;
                              stackIn_43_0 = stackOut_41_0;
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    stackOut_42_0 = 0;
                    stackIn_43_0 = stackOut_42_0;
                    break L17;
                  }
                  L19: {
                    var7 = stackIn_43_0;
                    if (var7 == 0) {
                      L20: {
                        mi.field_Ib[var6].a(var3, var5, 103, 5, -3344);
                        var8 = 110;
                        if (!param0) {
                          if (ma.field_b[var6][0] == null) {
                            break L20;
                          } else {
                            var9 = ma.field_b[var6][0];
                            ma.field_b[var6][0].field_z = 0;
                            var9.field_zb = 0;
                            break L20;
                          }
                        } else {
                          ma.field_b[var6][0].a(ed.field_c, 2, var3, 38, var8, var5, 2);
                          var8 += 40;
                          break L20;
                        }
                      }
                      var9_int = 2 + (-var8 + (-5 + fc.field_a.field_zb));
                      var10 = ma.field_b[var6].length - 1;
                      var11 = 0;
                      L21: while (true) {
                        if (var10 <= var11) {
                          var5 = var5 + (2 + var3);
                          break L19;
                        } else {
                          var12 = var11 * var9_int / var10;
                          ma.field_b[var6][var11 + 1].a(ed.field_c, 2, var3, -var12 + var9_int * (var11 + 1) / var10 - 2, var8 + var12, var5, 2);
                          var11++;
                          continue L21;
                        }
                      }
                    } else {
                      var8_ref_cj = mi.field_Ib[var6];
                      mi.field_Ib[var6].field_z = 0;
                      var8_ref_cj.field_zb = 0;
                      var9_int = 0;
                      L22: while (true) {
                        if (var9_int >= ma.field_b[var6].length) {
                          break L19;
                        } else {
                          L23: {
                            if (ma.field_b[var6][var9_int] != null) {
                              var10_ref_mo = ma.field_b[var6][var9_int];
                              ma.field_b[var6][var9_int].field_z = 0;
                              var10_ref_mo.field_zb = 0;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          var9_int++;
                          continue L22;
                        }
                      }
                    }
                  }
                  break L8;
                }
                var6++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ci.C(" + param0 + ',' + param1 + ')');
        }
    }

    ci() {
        ((ci) this).field_e = 0;
        ((ci) this).field_b = new th();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_h = "Next";
        field_g = "Retry";
        field_c = new String[]{null, null, null, null, "You can tell the zombie where to go by <col=ff0000>right-clicking on the map</col>. Zombies are slow to react, but they'll get there eventually.", null, "Deselect your zombies by left-clicking a vacant spot on the map. Try that now."};
    }
}
