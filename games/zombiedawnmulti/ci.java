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
        int fieldTemp$0 = 0;
        try {
            var3 = new gi(param1);
            if (param0 <= 71) {
                field_h = (String) null;
            }
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            var3.field_k = fieldTemp$0;
            if (!(var3.field_j == 2)) {
                if (-5 != (var3.field_j ^ -1)) {
                }
            }
            this.field_b.a(var3, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ci.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 1475) {
            return;
        }
        field_d = null;
        field_c = null;
        field_h = null;
        field_f = null;
        field_g = null;
    }

    final static String a(int param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        String var6 = "(" + k.field_k + " " + jp.field_e + " " + ij.field_d + ") " + op.field_i;
        String var1 = var6;
        if (param0 >= hd.field_q) {
        } else {
            var1 = var6 + ":";
            for (var2 = 0; var2 < hd.field_q; var2++) {
                var7 = var1 + ' ';
                var3 = 255 & s.field_e.field_m[var2];
                var4 = var3 >> 2094073860;
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
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
            }
        }
        return var1;
    }

    final byte[] a(byte param0, int param1) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        th var3 = this.field_b;
        Object var4 = null;
        if (param0 != -85) {
            return (byte[]) null;
        }
        gi var4_ref = (gi) ((Object) var3.c(113));
        while (var4_ref != null) {
            if (var4_ref.field_k == param1) {
                break;
            }
            var4_ref = (gi) ((Object) var3.b(6));
        }
        if (var4_ref == null) {
            return null;
        }
        return var4_ref.field_o;
    }

    final static void a(boolean param0, int param1) {
        int stackIn_4_0 = 0;
        cj stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        cj stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        Object stackIn_35_0 = null;
        mo stackIn_35_1 = null;
        int stackIn_48_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        cj var8_ref_cj = null;
        mo var9 = null;
        int var9_int = 0;
        int var10 = 0;
        mo var10_ref_mo = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        cj var14 = null;
        cj var15 = null;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              dm.field_Qb = oo.field_l;
              kp.field_l = oo.field_b;
              if (param0) {
                stackIn_4_0 = sq.field_Q;
                break L1;
              } else {
                stackIn_4_0 = da.field_a;
                break L1;
              }
            }
            L2: {
              mf.a(stackIn_4_0, false);
              em.field_U.a(0, mh.field_i.field_zb, 0, (byte) -74, -2 + (-40 + mh.field_i.field_z));
              fn.field_h.a(jk.field_f, 0, ga.field_r.field_zb, 0, -3344);
              stackIn_6_0 = ie.field_jb;

              stackIn_6_1 = 18;

              stackIn_6_2 = 2 + jk.field_f;

              if (tb.field_u) {
                stackIn_7_0 = (cj) ((Object) stackIn_6_0);
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = stackIn_6_2;
                stackIn_7_3 = 2 + (40 + qa.field_o) + 2;
                break L2;
              } else {
                stackIn_7_0 = (cj) ((Object) stackIn_6_0);
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = stackIn_6_2;
                stackIn_7_3 = 0;
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
              if ((var3 ^ -1) < -31) {
                var3 = 30;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var4 = -(var2_int * (var3 + 2)) + -5 + (dl.field_a.field_z - 5);
              if ((var4 ^ -1) < -41) {
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
                qf.field_b.a(-10 + (-4 + oo.field_l - 130), 10, 360, oo.field_b - 360 >> 246161921, -3344);
                mq.field_l.a(24, 0, qf.field_b.field_zb, 0, -3344);
                vb.field_c.a(-24 + qf.field_b.field_z, 24, qf.field_b.field_zb, 0, -3344);
                vb.field_c.field_ab = tg.a(1, vb.field_c.field_z, 8421504, 3, 11579568, 35);
                pd.field_b.a(-26 + (-10 + vb.field_c.field_z), 5, -10 + vb.field_c.field_zb, 5, -3344);
                pg.field_a.a(24, -24 + vb.field_c.field_z + -5, 80, (-80 + vb.field_c.field_zb) / 2, -3344);
                if (param1 <= -6) {
                  up.a(false);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L8: {
                  L9: {
                    if (-2 != (var6 ^ -1)) {
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
                      if (-2 > (r.field_f ^ -1)) {
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
                      if (-4 == (var6 ^ -1)) {
                        var15 = mi.field_Ib[var6];
                        mi.field_Ib[var6].field_z = 0;
                        var15.field_zb = 0;
                        var8 = 0;
                        L12: while (true) {
                          if (ma.field_b[var6].length <= var8) {
                            break L8;
                          } else {
                            if (null != ma.field_b[var6][var8]) {
                              var9 = ma.field_b[var6][var8];
                              ma.field_b[var6][var8].field_z = 0;
                              var9.field_zb = 0;
                              var8++;
                              continue L12;
                            } else {
                              var8++;
                              continue L12;
                            }
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    if (!param0) {
                      break L13;
                    } else {
                      if (-1 != (var6 ^ -1)) {
                        break L13;
                      } else {
                        var14 = mi.field_Ib[var6];
                        mi.field_Ib[var6].field_z = 0;
                        var14.field_zb = 0;
                        var8 = 0;
                        L14: while (true) {
                          if (ma.field_b[var6].length <= var8) {
                            break L8;
                          } else {
                            stackIn_35_0 = null;
                            stackIn_35_1 = ma.field_b[var6][var8];
                            if (stackIn_35_0 != stackIn_35_1) {
                              var9 = ma.field_b[var6][var8];
                              ma.field_b[var6][var8].field_z = 0;
                              var9.field_zb = 0;
                              var8++;
                              continue L14;
                            } else {
                              var8++;
                              continue L14;
                            }
                          }
                        }
                      }
                    }
                  }
                  L15: {
                    if (param0) {
                      if (var6 >= 4) {
                        if (null != km.field_ab) {
                          if (km.field_ab[var6 + -4]) {
                            stackIn_48_0 = 1;
                            break L15;
                          } else {
                            stackIn_48_0 = 0;
                            break L15;
                          }
                        } else {
                          stackIn_48_0 = 0;
                          break L15;
                        }
                      } else {
                        stackIn_48_0 = 0;
                        break L15;
                      }
                    } else {
                      stackIn_48_0 = 0;
                      break L15;
                    }
                  }
                  var7 = stackIn_48_0;
                  if (var7 == 0) {
                    L16: {
                      mi.field_Ib[var6].a(var3, var5, 103, 5, -3344);
                      var8 = 110;
                      if (!param0) {
                        if (ma.field_b[var6][0] == null) {
                          break L16;
                        } else {
                          var9 = ma.field_b[var6][0];
                          ma.field_b[var6][0].field_z = 0;
                          var9.field_zb = 0;
                          break L16;
                        }
                      } else {
                        ma.field_b[var6][0].a(ed.field_c, 2, var3, 38, var8, var5, 2);
                        var8 += 40;
                        break L16;
                      }
                    }
                    var9_int = 2 + (-var8 + (-5 + fc.field_a.field_zb));
                    var10 = ma.field_b[var6].length - 1;
                    var11 = 0;
                    L17: while (true) {
                      if (var10 <= var11) {
                        var5 = var5 + (2 + var3);
                        break L8;
                      } else {
                        var12 = var11 * var9_int / var10;
                        ma.field_b[var6][var11 + 1].a(ed.field_c, 2, var3, -var12 + var9_int * (var11 + 1) / var10 - 2, var8 + var12, var5, 2);
                        var11++;
                        continue L17;
                      }
                    }
                  } else {
                    var8_ref_cj = mi.field_Ib[var6];
                    mi.field_Ib[var6].field_z = 0;
                    var8_ref_cj.field_zb = 0;
                    var9_int = 0;
                    L18: while (true) {
                      if (var9_int >= ma.field_b[var6].length) {
                        break L8;
                      } else {
                        L19: {
                          if (ma.field_b[var6][var9_int] != null) {
                            var10_ref_mo = ma.field_b[var6][var9_int];
                            ma.field_b[var6][var9_int].field_z = 0;
                            var10_ref_mo.field_zb = 0;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        var9_int++;
                        continue L18;
                      }
                    }
                  }
                }
                var6++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ci.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ci() {
        this.field_e = 0;
        this.field_b = new th();
    }

    static {
        field_a = 0;
        field_h = "Next";
        field_g = "Retry";
        field_c = new String[]{null, null, null, null, "You can tell the zombie where to go by <col=ff0000>right-clicking on the map</col>. Zombies are slow to react, but they'll get there eventually.", null, "Deselect your zombies by left-clicking a vacant spot on the map. Try that now."};
    }
}
