/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends vc {
    private jg field_W;
    private so field_bb;
    private nb field_ab;
    private jg field_Q;
    static he field_eb;
    private jg field_fb;
    private jg field_Y;
    private so field_gb;
    private so field_jb;
    private so field_R;
    private boolean[] field_kb;
    static an field_Z;
    private jg field_cb;
    static kq field_ib;
    private jg field_X;
    private nb field_hb;
    static String field_S;
    private so field_U;
    private jg field_db;
    private jg field_V;

    final void a(int param0, uf param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        L0: {
          var8 = Pool.field_O;
          super.a(param0, param1);
          if (((ni) this).field_hb != null) {
            if (null != ((ni) this).field_ab) {
              if (((ni) this).field_ab.i()) {
                if (((ni) this).field_hb != null) {
                  break L0;
                } else {
                  ((ni) this).field_hb = nb.a(((ni) this).field_db, 100, ((ni) this).field_ab.l(), ((ni) this).field_ab.n());
                  kf discarded$5 = mn.a(-24296, nb.a(((ni) this).field_db, 100, ((ni) this).field_ab.l(), ((ni) this).field_ab.n()));
                  ((ni) this).field_ab = null;
                  break L0;
                }
              } else {
                if (null == ((ni) this).field_ab) {
                  break L0;
                } else {
                  if (!((ni) this).field_ab.i()) {
                    break L0;
                  } else {
                    if (((ni) this).field_hb != null) {
                      break L0;
                    } else {
                      ((ni) this).field_hb = nb.a(((ni) this).field_db, 100, ((ni) this).field_ab.l(), ((ni) this).field_ab.n());
                      kf discarded$6 = mn.a(-24296, nb.a(((ni) this).field_db, 100, ((ni) this).field_ab.l(), ((ni) this).field_ab.n()));
                      ((ni) this).field_ab = null;
                      break L0;
                    }
                  }
                }
              }
            } else {
              if (null == ((ni) this).field_ab) {
                break L0;
              } else {
                if (!((ni) this).field_ab.i()) {
                  break L0;
                } else {
                  if (((ni) this).field_hb != null) {
                    break L0;
                  } else {
                    ((ni) this).field_hb = nb.a(((ni) this).field_db, 100, ((ni) this).field_ab.l(), ((ni) this).field_ab.n());
                    kf discarded$7 = mn.a(-24296, nb.a(((ni) this).field_db, 100, ((ni) this).field_ab.l(), ((ni) this).field_ab.n()));
                    ((ni) this).field_ab = null;
                    break L0;
                  }
                }
              }
            }
          } else {
            if (null == ((ni) this).field_ab) {
              break L0;
            } else {
              if (!((ni) this).field_ab.i()) {
                break L0;
              } else {
                if (((ni) this).field_hb != null) {
                  break L0;
                } else {
                  ((ni) this).field_hb = nb.a(((ni) this).field_db, 100, ((ni) this).field_ab.l(), ((ni) this).field_ab.n());
                  kf discarded$8 = mn.a(-24296, nb.a(((ni) this).field_db, 100, ((ni) this).field_ab.l(), ((ni) this).field_ab.n()));
                  ((ni) this).field_ab = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          ei.field_u = ei.field_u + 1;
          if ((ne.field_s ^ -1) != -2) {
            break L1;
          } else {
            if (mp.field_V > 0) {
              L2: {
                var3 = 0;
                var4 = 128 + param1.field_eb.b(-128);
                if ((var4 ^ -1) >= -1) {
                  break L2;
                } else {
                  var5 = -((ni) this).field_B.field_A + var4 - -111;
                  if (ua.field_o <= var5) {
                    break L2;
                  } else {
                    if (68 + var5 > ua.field_o) {
                      L3: {
                        var6 = (int)(-param1.field_eb.a(true) * (double)((ni) this).field_B.field_z / 2.0 / 3.141592653589793);
                        var7 = -((ni) this).field_B.field_z + var6 + 1289;
                        if (var7 >= lq.field_W) {
                          break L3;
                        } else {
                          if (54 + var7 <= lq.field_W) {
                            break L3;
                          } else {
                            var3 = 1;
                            break L2;
                          }
                        }
                      }
                      if (-qh.field_l + ((ni) this).field_B.field_z <= var6) {
                        break L2;
                      } else {
                        var7 = 1289 + var6;
                        if (lq.field_W <= var7) {
                          break L2;
                        } else {
                          if (54 + var7 <= lq.field_W) {
                            break L2;
                          } else {
                            var3 = 1;
                            break L2;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (var3 == 0) {
                break L1;
              } else {
                e.field_c[la.field_b % e.field_c.length] = ei.field_u;
                la.field_b = la.field_b + 1;
                if (la.field_b >= 5) {
                  var5 = e.field_c[0];
                  var6 = e.field_c[0];
                  var7 = 1;
                  L4: while (true) {
                    if (var7 >= e.field_c.length) {
                      var7 = -var5 + var6;
                      if (0 >= var7) {
                        break L1;
                      } else {
                        if ((var7 ^ -1) <= -51) {
                          break L1;
                        } else {
                          L5: {
                            stackOut_45_0 = -3405;
                            stackOut_45_1 = 22;
                            stackIn_47_0 = stackOut_45_0;
                            stackIn_47_1 = stackOut_45_1;
                            stackIn_46_0 = stackOut_45_0;
                            stackIn_46_1 = stackOut_45_1;
                            if (mg.a(true)) {
                              stackOut_47_0 = stackIn_47_0;
                              stackOut_47_1 = stackIn_47_1;
                              stackOut_47_2 = 21;
                              stackIn_48_0 = stackOut_47_0;
                              stackIn_48_1 = stackOut_47_1;
                              stackIn_48_2 = stackOut_47_2;
                              break L5;
                            } else {
                              stackOut_46_0 = stackIn_46_0;
                              stackOut_46_1 = stackIn_46_1;
                              stackOut_46_2 = 0;
                              stackIn_48_0 = stackOut_46_0;
                              stackIn_48_1 = stackOut_46_1;
                              stackIn_48_2 = stackOut_46_2;
                              break L5;
                            }
                          }
                          fq.a(stackIn_48_0, stackIn_48_1, stackIn_48_2, false);
                          le discarded$9 = lg.field_s.a(true, (byte) 106, (java.awt.Component) (Object) vj.a((byte) -113));
                          break L1;
                        }
                      }
                    } else {
                      L6: {
                        if (e.field_c[var7] > var6) {
                          var6 = e.field_c[var7];
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (e.field_c[var7] < var5) {
                        var5 = e.field_c[var7];
                        var7++;
                        continue L4;
                      } else {
                        var7++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
        }
    }

    final void a(byte param0, uf param1) {
        pq[] var3 = null;
        int[] var4 = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        pq[] var20 = null;
        so var21 = null;
        int[] var23 = null;
        so var24 = null;
        so var27 = null;
        so var29 = null;
        so var32 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var38 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var49 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        boolean[] var65 = null;
        int[] var66 = null;
        boolean[] var67 = null;
        boolean[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        boolean[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        boolean[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        boolean[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        boolean[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        boolean[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        boolean[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_131_0 = null;
        int[] stackIn_131_1 = null;
        int stackIn_131_2 = 0;
        int stackIn_131_3 = 0;
        pq[] stackIn_131_4 = null;
        Object stackIn_132_0 = null;
        int[] stackIn_132_1 = null;
        int stackIn_132_2 = 0;
        int stackIn_132_3 = 0;
        pq[] stackIn_132_4 = null;
        Object stackIn_133_0 = null;
        int[] stackIn_133_1 = null;
        int stackIn_133_2 = 0;
        int stackIn_133_3 = 0;
        pq[] stackIn_133_4 = null;
        int stackIn_133_5 = 0;
        Object stackOut_130_0 = null;
        int[] stackOut_130_1 = null;
        int stackOut_130_2 = 0;
        int stackOut_130_3 = 0;
        pq[] stackOut_130_4 = null;
        Object stackOut_132_0 = null;
        int[] stackOut_132_1 = null;
        int stackOut_132_2 = 0;
        int stackOut_132_3 = 0;
        pq[] stackOut_132_4 = null;
        int stackOut_132_5 = 0;
        Object stackOut_131_0 = null;
        int[] stackOut_131_1 = null;
        int stackOut_131_2 = 0;
        int stackOut_131_3 = 0;
        pq[] stackOut_131_4 = null;
        int stackOut_131_5 = 0;
        boolean[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        boolean[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        boolean[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        boolean[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        boolean[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        boolean[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        boolean[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        boolean[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        boolean[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        boolean[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        boolean[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        L0: {
          var14 = Pool.field_O;
          var20 = param1.field_I.field_l;
          var3 = var20;
          var58 = f.a((byte) -56, param1.field_ab);
          var47 = var58;
          var36 = var47;
          var19 = var36;
          var4 = var19;
          var57 = var4;
          var46 = var57;
          var35 = var46;
          var18 = var35;
          var16 = var18;
          var5_ref_int__ = var16;
          oh.field_d[0] = var57[0] + -sb.a(288.0f, true) >> -1840238238;
          oh.field_d[1] = var57[1] + -sb.a(144.0f, true) >> 576321314;
          oh.field_d[2] = var57[2] >> -1004862910;
          if (var5_ref_int__ == oh.field_d) {
            break L0;
          } else {
            oh.field_d[11] = var57[11];
            oh.field_d[9] = var57[9];
            oh.field_d[5] = var57[5];
            oh.field_d[6] = var57[6];
            oh.field_d[8] = var57[8];
            oh.field_d[4] = var57[4];
            oh.field_d[3] = var57[3];
            oh.field_d[7] = var57[7];
            oh.field_d[10] = var57[10];
            break L0;
          }
        }
        var4[1] = rb.b(var58[1], -4);
        var4[2] = rb.b(var58[2], -4);
        var4[0] = rb.b(var58[0], -4);
        ((ni) this).e(true);
        ((ni) this).a(false, var58, var20);
        kf.a(ag.field_c, (byte) -104, pa.field_L, ph.field_g, lk.field_m);
        kf.a(ol.field_a, (byte) -104, pa.field_L, ph.field_g, w.field_h);
        kf.a(bf.field_k, (byte) -104, pa.field_L, ph.field_g, hb.field_l);
        var21 = ((ni) this).field_bb;
        var59 = oh.field_d;
        var21.b((byte) -123, 0, var21.field_j.length, var59);
        var5 = 0;
        L1: while (true) {
          if (var5 >= ((ni) this).field_kb.length) {
            var24 = ((ni) this).field_R;
            var61 = oh.field_d;
            var24.b((byte) -113, 0, var24.field_j.length, var61);
            en.b(param0 + 55);
            this.a(false, param1);
            var62 = new int[3];
            hr.a(th.field_l[vf.field_lb].field_l[0], var62, oh.field_d, th.field_l[vf.field_lb].field_l[1], th.field_l[vf.field_lb].field_l[2], (byte) 9);
            var9 = var62[1];
            var8 = var62[1];
            var7 = var62[0];
            var6 = var62[0];
            var5 = ma.field_g + -1;
            L2: while (true) {
              if (var5 < vf.field_lb) {
                L3: {
                  if (qh.field_b <= var6) {
                    break L3;
                  } else {
                    var6 = qh.field_b;
                    break L3;
                  }
                }
                L4: {
                  if (qh.field_c > var8) {
                    var8 = qh.field_c;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (qh.field_g < var9) {
                    var9 = qh.field_g;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (qh.field_j >= var7) {
                    break L6;
                  } else {
                    var7 = qh.field_j;
                    break L6;
                  }
                }
                var5 = -1 + eo.field_Qb;
                L7: while (true) {
                  if (sb.field_d > var5) {
                    var11 = lk.field_m;
                    var12 = ag.field_c;
                    var13 = var12 - 1;
                    L8: while (true) {
                      if (var11 > var13) {
                        L9: {
                          var27 = ((ni) this).field_R;
                          if (param0 == -55) {
                            break L9;
                          } else {
                            var15 = null;
                            ((ni) this).c(92, (di) null);
                            break L9;
                          }
                        }
                        var63 = oh.field_d;
                        var27.a((byte) -112, 0, var27.field_j.length, var63);
                        var11 = w.field_h;
                        var12 = ol.field_a;
                        var13 = -1 + var12;
                        L10: while (true) {
                          if (var11 > var13) {
                            L11: {
                              if (-1L == (1073741824L & pd.field_i ^ -1L)) {
                                ((ni) this).a(var58, (byte) 65, false, var20, false);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            var11 = hb.field_l;
                            var12 = bf.field_k;
                            var13 = var12 + -1;
                            L12: while (true) {
                              if (var13 < var11) {
                                L13: {
                                  if ((1073741824L & pd.field_i) != 0L) {
                                    break L13;
                                  } else {
                                    param1.z((byte) 1);
                                    break L13;
                                  }
                                }
                                L14: {
                                  if (-1L != (1073741824L & pd.field_i ^ -1L)) {
                                    break L14;
                                  } else {
                                    var11 = 0;
                                    L15: while (true) {
                                      if (var20.length <= var11) {
                                        break L14;
                                      } else {
                                        if (var20[var11].field_s) {
                                          ((ni) this).a(var58, var20[var11]);
                                          var11++;
                                          continue L15;
                                        } else {
                                          var11++;
                                          continue L15;
                                        }
                                      }
                                    }
                                  }
                                }
                                L16: {
                                  var29 = ((ni) this).field_bb;
                                  var64 = oh.field_d;
                                  var65 = ((ni) this).field_kb;
                                  var29.a(false, 0, var29.field_j.length, (byte) -65, var64, var65);
                                  if (-1L == (1073741824L & pd.field_i ^ -1L)) {
                                    L17: {
                                      stackOut_130_0 = this;
                                      stackOut_130_1 = (int[]) var4;
                                      stackOut_130_2 = 115;
                                      stackOut_130_3 = 1;
                                      stackOut_130_4 = (pq[]) var3;
                                      stackIn_132_0 = stackOut_130_0;
                                      stackIn_132_1 = stackOut_130_1;
                                      stackIn_132_2 = stackOut_130_2;
                                      stackIn_132_3 = stackOut_130_3;
                                      stackIn_132_4 = stackOut_130_4;
                                      stackIn_131_0 = stackOut_130_0;
                                      stackIn_131_1 = stackOut_130_1;
                                      stackIn_131_2 = stackOut_130_2;
                                      stackIn_131_3 = stackOut_130_3;
                                      stackIn_131_4 = stackOut_130_4;
                                      if (param1.field_I.j(param0 ^ -45).field_q != 0) {
                                        stackOut_132_0 = this;
                                        stackOut_132_1 = (int[]) (Object) stackIn_132_1;
                                        stackOut_132_2 = stackIn_132_2;
                                        stackOut_132_3 = stackIn_132_3;
                                        stackOut_132_4 = (pq[]) (Object) stackIn_132_4;
                                        stackOut_132_5 = 0;
                                        stackIn_133_0 = stackOut_132_0;
                                        stackIn_133_1 = stackOut_132_1;
                                        stackIn_133_2 = stackOut_132_2;
                                        stackIn_133_3 = stackOut_132_3;
                                        stackIn_133_4 = stackOut_132_4;
                                        stackIn_133_5 = stackOut_132_5;
                                        break L17;
                                      } else {
                                        stackOut_131_0 = this;
                                        stackOut_131_1 = (int[]) (Object) stackIn_131_1;
                                        stackOut_131_2 = stackIn_131_2;
                                        stackOut_131_3 = stackIn_131_3;
                                        stackOut_131_4 = (pq[]) (Object) stackIn_131_4;
                                        stackOut_131_5 = 1;
                                        stackIn_133_0 = stackOut_131_0;
                                        stackIn_133_1 = stackOut_131_1;
                                        stackIn_133_2 = stackOut_131_2;
                                        stackIn_133_3 = stackOut_131_3;
                                        stackIn_133_4 = stackOut_131_4;
                                        stackIn_133_5 = stackOut_131_5;
                                        break L17;
                                      }
                                    }
                                    ((ni) this).a(stackIn_133_1, (byte) stackIn_133_2, stackIn_133_3 != 0, stackIn_133_4, stackIn_133_5 != 0);
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                L18: {
                                  var32 = ((ni) this).field_bb;
                                  var66 = oh.field_d;
                                  var67 = ((ni) this).field_kb;
                                  var32.a(true, 0, var32.field_j.length, (byte) 111, var66, var67);
                                  if ((pd.field_i & 1073741824L ^ -1L) == -1L) {
                                    param1.q(-1);
                                    param1.D(-126);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                L19: {
                                  if ((pd.field_i & 256L ^ -1L) != -1L) {
                                    ((ni) this).field_R.a(oh.field_d, 0);
                                    ((ni) this).field_bb.a(oh.field_d, 0);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                return;
                              } else {
                                th.field_l[ph.field_g[var13]].c(param0 ^ -6710865, oh.field_d);
                                var13--;
                                continue L12;
                              }
                            }
                          } else {
                            th.field_l[ph.field_g[var13]].c(param0 + 6710941, oh.field_d);
                            var13--;
                            continue L10;
                          }
                        }
                      } else {
                        th.field_l[ph.field_g[var13]].c(6710886, oh.field_d);
                        var13--;
                        continue L8;
                      }
                    }
                  } else {
                    th.field_l[var5].c(6710886, oh.field_d);
                    var5--;
                    continue L7;
                  }
                }
              } else {
                L20: {
                  th.field_l[var5].c(6710886, oh.field_d);
                  hr.a((int) th.field_l[var5].field_h, var62, oh.field_d, (int) th.field_l[var5].field_a, (int) th.field_l[var5].field_o, (byte) 9);
                  if (var6 <= var62[0]) {
                    if (var7 < var62[0]) {
                      var7 = var62[0];
                      break L20;
                    } else {
                      break L20;
                    }
                  } else {
                    var6 = var62[0];
                    break L20;
                  }
                }
                L21: {
                  if (var8 <= var62[1]) {
                    if (var9 < var62[1]) {
                      var9 = var62[1];
                      break L21;
                    } else {
                      break L21;
                    }
                  } else {
                    var8 = var62[1];
                    break L21;
                  }
                }
                L22: {
                  hr.a((int) th.field_l[var5].field_p, var62, oh.field_d, (int) th.field_l[var5].field_a, (int) th.field_l[var5].field_o, (byte) 9);
                  if (var62[0] >= var6) {
                    if (var7 >= var62[0]) {
                      break L22;
                    } else {
                      var7 = var62[0];
                      break L22;
                    }
                  } else {
                    var6 = var62[0];
                    break L22;
                  }
                }
                L23: {
                  if (var62[1] >= var8) {
                    if (var9 < var62[1]) {
                      var9 = var62[1];
                      break L23;
                    } else {
                      break L23;
                    }
                  } else {
                    var8 = var62[1];
                    break L23;
                  }
                }
                L24: {
                  hr.a((int) th.field_l[var5].field_h, var62, oh.field_d, (int) th.field_l[var5].field_m, (int) th.field_l[var5].field_o, (byte) 9);
                  if (var6 > var62[0]) {
                    var6 = var62[0];
                    break L24;
                  } else {
                    if (var62[0] <= var7) {
                      break L24;
                    } else {
                      var7 = var62[0];
                      break L24;
                    }
                  }
                }
                L25: {
                  if (var62[1] < var8) {
                    var8 = var62[1];
                    break L25;
                  } else {
                    if (var9 < var62[1]) {
                      var9 = var62[1];
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                }
                L26: {
                  hr.a((int) th.field_l[var5].field_p, var62, oh.field_d, (int) th.field_l[var5].field_m, (int) th.field_l[var5].field_o, (byte) 9);
                  if (var8 <= var62[1]) {
                    if (var9 < var62[1]) {
                      var9 = var62[1];
                      break L26;
                    } else {
                      break L26;
                    }
                  } else {
                    var8 = var62[1];
                    break L26;
                  }
                }
                L27: {
                  if (var62[0] < var6) {
                    var6 = var62[0];
                    break L27;
                  } else {
                    if (var62[0] <= var7) {
                      break L27;
                    } else {
                      var7 = var62[0];
                      break L27;
                    }
                  }
                }
                L28: {
                  hr.a((int) th.field_l[var5].field_h, var62, oh.field_d, (int) th.field_l[var5].field_a, (int) th.field_l[var5].field_f, (byte) 9);
                  if (var8 <= var62[1]) {
                    if (var9 < var62[1]) {
                      var9 = var62[1];
                      break L28;
                    } else {
                      break L28;
                    }
                  } else {
                    var8 = var62[1];
                    break L28;
                  }
                }
                L29: {
                  if (var62[0] < var6) {
                    var6 = var62[0];
                    break L29;
                  } else {
                    if (var62[0] <= var7) {
                      break L29;
                    } else {
                      var7 = var62[0];
                      break L29;
                    }
                  }
                }
                L30: {
                  hr.a((int) th.field_l[var5].field_p, var62, oh.field_d, (int) th.field_l[var5].field_a, (int) th.field_l[var5].field_f, (byte) 9);
                  if (var6 > var62[0]) {
                    var6 = var62[0];
                    break L30;
                  } else {
                    if (var62[0] > var7) {
                      var7 = var62[0];
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                }
                L31: {
                  if (var8 > var62[1]) {
                    var8 = var62[1];
                    break L31;
                  } else {
                    if (var62[1] <= var9) {
                      break L31;
                    } else {
                      var9 = var62[1];
                      break L31;
                    }
                  }
                }
                L32: {
                  hr.a((int) th.field_l[var5].field_h, var62, oh.field_d, (int) th.field_l[var5].field_m, (int) th.field_l[var5].field_f, (byte) 9);
                  if (var6 <= var62[0]) {
                    if (var62[0] > var7) {
                      var7 = var62[0];
                      break L32;
                    } else {
                      break L32;
                    }
                  } else {
                    var6 = var62[0];
                    break L32;
                  }
                }
                L33: {
                  if (var8 <= var62[1]) {
                    if (var9 >= var62[1]) {
                      break L33;
                    } else {
                      var9 = var62[1];
                      break L33;
                    }
                  } else {
                    var8 = var62[1];
                    break L33;
                  }
                }
                L34: {
                  hr.a((int) th.field_l[var5].field_p, var62, oh.field_d, (int) th.field_l[var5].field_m, (int) th.field_l[var5].field_f, (byte) 9);
                  if (var62[1] >= var8) {
                    if (var9 >= var62[1]) {
                      break L34;
                    } else {
                      var9 = var62[1];
                      break L34;
                    }
                  } else {
                    var8 = var62[1];
                    break L34;
                  }
                }
                if (var6 > var62[0]) {
                  var6 = var62[0];
                  var5--;
                  continue L2;
                } else {
                  if (var62[0] > var7) {
                    var7 = var62[0];
                    var5--;
                    continue L2;
                  } else {
                    var5--;
                    continue L2;
                  }
                }
              }
            }
          } else {
            L35: {
              var60 = ((ni) this).field_bb.field_c[var5];
              var49 = var60;
              var38 = var49;
              var23 = var38;
              var17 = var23;
              var6_ref_int__ = var17;
              var7 = 576;
              var8 = 288;
              stackOut_4_0 = ((ni) this).field_kb;
              stackOut_4_1 = var5;
              stackOut_4_2 = var60[1] + -oh.field_d[1];
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              if (var60[1] >= -var8) {
                stackOut_6_0 = (boolean[]) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                if (var8 < var60[1]) {
                  stackOut_8_0 = (boolean[]) (Object) stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = stackIn_8_2;
                  stackOut_8_3 = -1;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  break L35;
                } else {
                  stackOut_7_0 = (boolean[]) (Object) stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_9_3 = stackOut_7_3;
                  break L35;
                }
              } else {
                stackOut_5_0 = (boolean[]) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = 1;
                stackIn_9_0 = stackOut_5_0;
                stackIn_9_1 = stackOut_5_1;
                stackIn_9_2 = stackOut_5_2;
                stackIn_9_3 = stackOut_5_3;
                break L35;
              }
            }
            L36: {
              stackOut_9_0 = (boolean[]) (Object) stackIn_9_0;
              stackOut_9_1 = stackIn_9_1;
              stackOut_9_2 = stackIn_9_2 * stackIn_9_3;
              stackOut_9_3 = var60[0] - oh.field_d[0];
              stackIn_13_0 = stackOut_9_0;
              stackIn_13_1 = stackOut_9_1;
              stackIn_13_2 = stackOut_9_2;
              stackIn_13_3 = stackOut_9_3;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              stackIn_10_3 = stackOut_9_3;
              if (var60[0] < -var7) {
                stackOut_13_0 = (boolean[]) (Object) stackIn_13_0;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = stackIn_13_2;
                stackOut_13_3 = stackIn_13_3;
                stackOut_13_4 = 1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                stackIn_14_3 = stackOut_13_3;
                stackIn_14_4 = stackOut_13_4;
                break L36;
              } else {
                stackOut_10_0 = (boolean[]) (Object) stackIn_10_0;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = stackIn_10_2;
                stackOut_10_3 = stackIn_10_3;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_12_3 = stackOut_10_3;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                stackIn_11_3 = stackOut_10_3;
                if (var7 < var60[0]) {
                  stackOut_12_0 = (boolean[]) (Object) stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = stackIn_12_3;
                  stackOut_12_4 = -1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  stackIn_14_3 = stackOut_12_3;
                  stackIn_14_4 = stackOut_12_4;
                  break L36;
                } else {
                  stackOut_11_0 = (boolean[]) (Object) stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = stackIn_11_2;
                  stackOut_11_3 = stackIn_11_3;
                  stackOut_11_4 = 0;
                  stackIn_14_0 = stackOut_11_0;
                  stackIn_14_1 = stackOut_11_1;
                  stackIn_14_2 = stackOut_11_2;
                  stackIn_14_3 = stackOut_11_3;
                  stackIn_14_4 = stackOut_11_4;
                  break L36;
                }
              }
            }
            L37: {
              stackOut_14_0 = (boolean[]) (Object) stackIn_14_0;
              stackOut_14_1 = stackIn_14_1;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              if (stackIn_14_2 + stackIn_14_3 * stackIn_14_4 <= 0) {
                stackOut_16_0 = (boolean[]) (Object) stackIn_16_0;
                stackOut_16_1 = stackIn_16_1;
                stackOut_16_2 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                break L37;
              } else {
                stackOut_15_0 = (boolean[]) (Object) stackIn_15_0;
                stackOut_15_1 = stackIn_15_1;
                stackOut_15_2 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                break L37;
              }
            }
            stackIn_17_0[stackIn_17_1] = stackIn_17_2 != 0;
            var5++;
            continue L1;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pool.field_O;
          var5 = -40 % ((param2 - -44) / 56);
          var6 = param0;
          if (var6 != 5) {
            if (2 == var6) {
              kf discarded$7 = kp.a(100, ((ni) this).field_X, param3, param1);
              break L0;
            } else {
              if (var6 != 3) {
                if (0 == var6) {
                  kf discarded$8 = kp.a(100, ((ni) this).field_fb, param3, param1);
                  break L0;
                } else {
                  if (-2 != var6) {
                    if (-5 == var6) {
                      ((ni) this).field_ab = nb.a(((ni) this).field_Y, 100, param1, param3);
                      kf discarded$9 = mn.a(-24296, nb.a(((ni) this).field_Y, 100, param1, param3));
                      break L0;
                    } else {
                      if ((var6 ^ -1) != -7) {
                        super.a(param0, param1, (byte) -104, param3);
                        break L0;
                      } else {
                        kf discarded$10 = kp.a(100, ((ni) this).field_cb, param3, param1);
                        break L0;
                      }
                    }
                  } else {
                    kf discarded$11 = kp.a(100, ((ni) this).field_W, param3, param1);
                    break L0;
                  }
                }
              } else {
                kf discarded$12 = kp.a(100, ((ni) this).field_Q, param3, param1);
                break L0;
              }
            }
          } else {
            kf discarded$13 = kp.a(100, ((ni) this).field_V, param3, param1);
            break L0;
          }
        }
    }

    final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        eg[][] var4 = null;
        int[][][] var5 = null;
        int var6 = 0;
        int var7 = 0;
        eg[][] var8 = null;
        int[][][] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        so var12 = null;
        so var13 = null;
        p[] var13_array = null;
        int var14_int = 0;
        eg[][] var14 = null;
        int var15 = 0;
        eg var15_ref = null;
        int var16 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int[][][] var21 = null;
        int[][][] var22 = null;
        eg[] var23 = null;
        int[][] var24 = null;
        eg[] var25 = null;
        int[][] var26 = null;
        p[] var27 = null;
        eg var28 = null;
        so[] var29 = null;
        eg var31 = null;
        so[] var32 = null;
        eg var34 = null;
        so[] var35 = null;
        so[] var37 = null;
        int[][][] var38 = null;
        int[][][] var39 = null;
        int[][][] var43 = null;
        int[][][] var44 = null;
        int[][][] var48 = null;
        int[][][] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        Object stackIn_33_0 = null;
        p[] stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        Object stackIn_34_0 = null;
        p[] stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        Object stackIn_35_0 = null;
        p[] stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        so stackIn_52_0 = null;
        so stackIn_53_0 = null;
        so stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        so stackOut_51_0 = null;
        so stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        so stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_32_0 = null;
        p[] stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        Object stackOut_34_0 = null;
        p[] stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        Object stackOut_33_0 = null;
        p[] stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        var20 = Pool.field_O;
        var3 = -kj.field_b + eh.field_t;
        var4 = new eg[var3][];
        var48 = new int[var3][][];
        var43 = var48;
        var38 = var43;
        var21 = var38;
        var5 = var21;
        var6 = ((ni) this).a(kj.field_b, var4, var48, -57, eh.field_t);
        var7 = -tj.field_fb + nd.field_m;
        var8 = new eg[var7][];
        var49 = new int[var7][][];
        var44 = var49;
        var39 = var44;
        var22 = var39;
        var9 = var22;
        var10 = ((ni) this).a(tj.field_fb, var8, var49, -58, nd.field_m);
        var11 = 0;
        L0: while (true) {
          if (var11 >= var4.length) {
            var11 = 0;
            L1: while (true) {
              if (var8.length <= var11) {
                th.field_l = new p[-1 * (-ch.field_G + af.field_e) + -1 * (pf.field_k + -fc.field_c) + (oo.field_I + -uk.field_l) * 3 + (dp.field_l - qr.field_d) * 3 + (-var3 + (var6 + ((ni) this).field_O.length - -var10 + (-var7 + -1 * (-rb.field_a + rg.field_u))))];
                var11 = 0;
                vf.field_lb = var11;
                var2 = kj.field_b;
                L2: while (true) {
                  if (var2 >= eh.field_t) {
                    sb.field_d = var11;
                    ma.field_g = var11;
                    var2 = tj.field_fb;
                    L3: while (true) {
                      if (nd.field_m <= var2) {
                        if (param0) {
                          eo.field_Qb = var11;
                          lk.field_m = var11;
                          var2 = qr.field_d;
                          L4: while (true) {
                            if (dp.field_l <= var2) {
                              ag.field_c = var11;
                              hb.field_l = var11;
                              var2 = uk.field_l;
                              L5: while (true) {
                                if (oo.field_I <= var2) {
                                  bf.field_k = var11;
                                  ((ni) this).field_jb = new so(4 * (af.field_e - ch.field_G));
                                  ((ni) this).field_bb = new so(new so[1]);
                                  ((ni) this).field_U = new so(4 * (af.field_e + -ch.field_G));
                                  ((ni) this).field_gb = new so(4 * (-fc.field_c + pf.field_k) + (rg.field_u - rb.field_a) * 2);
                                  ((ni) this).field_R = new so(new so[2]);
                                  var12 = new so(new so[2]);
                                  var13 = new so(new so[2]);
                                  var14 = new eg[af.field_e + -ch.field_G][2];
                                  var2 = ch.field_G;
                                  L6: while (true) {
                                    if (var2 >= af.field_e) {
                                      var15 = 0;
                                      var2 = ch.field_G;
                                      L7: while (true) {
                                        if (af.field_e <= var2) {
                                          var15 = 0;
                                          var2 = ch.field_G;
                                          L8: while (true) {
                                            if (var2 >= af.field_e) {
                                              var15 = 0;
                                              var2 = fc.field_c;
                                              L9: while (true) {
                                                if (var2 >= pf.field_k) {
                                                  var2 = rb.field_a;
                                                  L10: while (true) {
                                                    if (rg.field_u <= var2) {
                                                      L11: {
                                                        var12.a(0);
                                                        stackOut_51_0 = (so) var13;
                                                        stackIn_53_0 = stackOut_51_0;
                                                        stackIn_52_0 = stackOut_51_0;
                                                        if (param0) {
                                                          stackOut_53_0 = (so) (Object) stackIn_53_0;
                                                          stackOut_53_1 = 0;
                                                          stackIn_54_0 = stackOut_53_0;
                                                          stackIn_54_1 = stackOut_53_1;
                                                          break L11;
                                                        } else {
                                                          stackOut_52_0 = (so) (Object) stackIn_52_0;
                                                          stackOut_52_1 = 1;
                                                          stackIn_54_0 = stackOut_52_0;
                                                          stackIn_54_1 = stackOut_52_1;
                                                          break L11;
                                                        }
                                                      }
                                                      ((so) (Object) stackIn_54_0).a(stackIn_54_1 != 0);
                                                      var12.a(((ni) this).field_q, ((ni) this).field_e, ((ni) this).field_F, (byte) -122, ((ni) this).field_u, ((ni) this).field_C);
                                                      ((ni) this).field_bb.d(104);
                                                      ((ni) this).field_kb = new boolean[((ni) this).field_bb.field_j.length];
                                                      ((ni) this).field_R.d(116);
                                                      w.field_h = var11;
                                                      ol.field_a = var11;
                                                      return;
                                                    } else {
                                                      var16 = var2;
                                                      var37 = ((ni) this).field_gb.field_b;
                                                      var18 = var15;
                                                      be.a(var18, ((ni) this).field_M[var16][1], ((ni) this).field_M[var16][2], 1, var37, ((ni) this).field_M[var16][0], ((ni) this).field_O[var16]);
                                                      var15 += 2;
                                                      var2++;
                                                      continue L10;
                                                    }
                                                  }
                                                } else {
                                                  var16 = var2;
                                                  var35 = ((ni) this).field_gb.field_b;
                                                  var18 = var15;
                                                  var52 = ((ni) this).field_M[var16];
                                                  bh.a(var35, false, var52[1], var52[2], ((ni) this).field_O[var16], var52[0], var18);
                                                  var15 += 4;
                                                  var2++;
                                                  continue L9;
                                                }
                                              }
                                            } else {
                                              var34 = var14[var2 + -ch.field_G][0];
                                              var51 = ((ni) this).field_M[var2];
                                              var32 = ((ni) this).field_jb.field_b;
                                              var19 = var15;
                                              bh.a(var32, false, 0 + var51[1], var51[2] - 0, var34, 0 + var51[0], var19);
                                              var15 += 4;
                                              var2++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          var31 = var14[var2 + -ch.field_G][1];
                                          var50 = ((ni) this).field_M[var2];
                                          var29 = ((ni) this).field_U.field_b;
                                          var19 = var15;
                                          bh.a(var29, false, var50[1] - 0, var50[2] + 0, var31, 0 + var50[0], var19);
                                          var15 += 4;
                                          var2++;
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      var14[var2 - ch.field_G][0] = hq.b((byte) 125);
                                      var15_ref = hq.b((byte) 125);
                                      var14[-ch.field_G + var2][1] = hq.b((byte) 127);
                                      var28 = hq.b((byte) 127);
                                      ej.a(0, var15_ref, 0, false, -((ni) this).field_M[var2][2], 0, 0, 1, var28, ((ni) this).field_O[var2]);
                                      var2++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  L12: {
                                    var12_int = var2;
                                    var13_array = th.field_l;
                                    var14_int = var11;
                                    stackOut_32_0 = this;
                                    stackOut_32_1 = (p[]) var13_array;
                                    stackOut_32_2 = 0;
                                    stackOut_32_3 = 0;
                                    stackIn_34_0 = stackOut_32_0;
                                    stackIn_34_1 = stackOut_32_1;
                                    stackIn_34_2 = stackOut_32_2;
                                    stackIn_34_3 = stackOut_32_3;
                                    stackIn_33_0 = stackOut_32_0;
                                    stackIn_33_1 = stackOut_32_1;
                                    stackIn_33_2 = stackOut_32_2;
                                    stackIn_33_3 = stackOut_32_3;
                                    if (param0) {
                                      stackOut_34_0 = this;
                                      stackOut_34_1 = (p[]) (Object) stackIn_34_1;
                                      stackOut_34_2 = stackIn_34_2;
                                      stackOut_34_3 = stackIn_34_3;
                                      stackOut_34_4 = 0;
                                      stackIn_35_0 = stackOut_34_0;
                                      stackIn_35_1 = stackOut_34_1;
                                      stackIn_35_2 = stackOut_34_2;
                                      stackIn_35_3 = stackOut_34_3;
                                      stackIn_35_4 = stackOut_34_4;
                                      break L12;
                                    } else {
                                      stackOut_33_0 = this;
                                      stackOut_33_1 = (p[]) (Object) stackIn_33_1;
                                      stackOut_33_2 = stackIn_33_2;
                                      stackOut_33_3 = stackIn_33_3;
                                      stackOut_33_4 = 1;
                                      stackIn_35_0 = stackOut_33_0;
                                      stackIn_35_1 = stackOut_33_1;
                                      stackIn_35_2 = stackOut_33_2;
                                      stackIn_35_3 = stackOut_33_3;
                                      stackIn_35_4 = stackOut_33_4;
                                      break L12;
                                    }
                                  }
                                  ((ni) this).a(stackIn_35_1, stackIn_35_2, stackIn_35_3, stackIn_35_4 != 0, ((ni) this).field_O[var12_int], var14_int, ((ni) this).field_M[var12_int], 0);
                                  var11 += 4;
                                  var2++;
                                  continue L5;
                                }
                              }
                            } else {
                              var12_int = var2;
                              var27 = th.field_l;
                              var14_int = var11;
                              ((ni) this).a(var27, 0, 0, false, ((ni) this).field_O[var12_int], var14_int, ((ni) this).field_M[var12_int], 0);
                              var11 += 4;
                              var2++;
                              continue L4;
                            }
                          }
                        } else {
                          return;
                        }
                      } else {
                        var12_int = var11;
                        var25 = var8[var2 + -tj.field_fb];
                        var26 = var9[-tj.field_fb + var2];
                        var15 = 0;
                        L13: while (true) {
                          if (var15 >= var25.length) {
                            var11 = var11 + var8[-tj.field_fb + var2].length;
                            var2++;
                            continue L3;
                          } else {
                            var12_int++;
                            th.field_l[var12_int] = new p((nc) (Object) ((ni) this).a(0, var25[var15]), new int[3]);
                            var15++;
                            continue L13;
                          }
                        }
                      }
                    }
                  } else {
                    var12_int = var11;
                    var23 = var4[var2 - kj.field_b];
                    var24 = var5[var2 + -kj.field_b];
                    var15 = 0;
                    L14: while (true) {
                      if (var15 >= var23.length) {
                        var11 = var11 + var4[-kj.field_b + var2].length;
                        var2++;
                        continue L2;
                      } else {
                        var12_int++;
                        th.field_l[var12_int] = new p((nc) (Object) ((ni) this).a(108, var23[var15]), new int[3]);
                        var15++;
                        continue L14;
                      }
                    }
                  }
                }
              } else {
                var12_int = 0;
                L15: while (true) {
                  if (var12_int >= var8[var11].length) {
                    var11++;
                    continue L1;
                  } else {
                    nd.a(var8[var11][var12_int], (byte) -37);
                    var12_int++;
                    continue L15;
                  }
                }
              }
            }
          } else {
            var12_int = 0;
            L16: while (true) {
              if (var12_int < var4[var11].length) {
                nd.a(var4[var11][var12_int], (byte) -37);
                var12_int++;
                continue L16;
              } else {
                var11++;
                continue L0;
              }
            }
          }
        }
    }

    final void i(int param0) {
        super.i(param0);
        ((ni) this).field_v = 5609813;
    }

    final void c(int param0, di param1) {
        if (param0 != -23569) {
            ((ni) this).field_U = null;
        }
    }

    public static void e(byte param0) {
        field_Z = null;
        field_S = null;
        if (param0 != 71) {
            field_S = null;
        }
        field_eb = null;
    }

    final void a(int param0, di param1) {
        ((ni) this).field_b = cg.a(param1, "", "pool_modern");
        ((ni) this).field_n = cg.a(param1, "", "lose_jingle");
        ((ni) this).field_i = cg.a(param1, "", "win_jingle");
        if (param0 != 1) {
            ((ni) this).a(108, 33, (byte) 117, 21);
        }
    }

    final void b(int param0, di param1) {
        ((ni) this).field_B = new dd(param1.a(false, "modern-sky.jpg", ""), (java.awt.Component) (Object) pa.field_K);
        if (param0 != 5) {
            Object var4 = null;
            this.a(false, (uf) null);
        }
    }

    private final void a(boolean param0, uf param1) {
        int var4 = 0;
        int var5 = 0;
        int var3 = 128 + param1.field_eb.b(-127);
        if (param0) {
            ((ni) this).c(true);
        }
        if (!(var3 <= 0)) {
            var4 = (int)(-param1.field_eb.a(!param0 ? true : false) * (double)((ni) this).field_B.field_z / 2.0 / 3.141592653589793);
            var5 = -((ni) this).field_B.field_A + var3;
            ((ni) this).field_B.a(-((ni) this).field_B.field_z + var4, var5);
            if (var4 < ((ni) this).field_B.field_z + -640) {
                ((ni) this).field_B.a(var4, var5);
            }
        }
    }

    final void a(di param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        eg[] var14 = null;
        int var15 = 0;
        eg[] var16 = null;
        eg[] var19 = null;
        int[] var20 = null;
        int var22 = 0;
        eg var23 = null;
        eg[] var25 = null;
        int[] var26 = null;
        eg var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        eg[] var31 = null;
        eg var32 = null;
        eg[] var34 = null;
        int[] var35 = null;
        eg var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        eg[] var40 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int[] var68 = null;
        int[] var69 = null;
        int[] var70 = null;
        var22 = Pool.field_O;
        ((ni) this).field_O = new eg[11];
        var3 = 0;
        kj.field_b = var3;
        var3++;
        ((ni) this).field_O[var3] = eg.a(param0, "", "new_classic_table/floor_texture");
        eh.field_t = var3;
        tj.field_fb = var3;
        var3++;
        ((ni) this).field_O[var3] = eg.a(param0, "", "new_classic_table/floor_shadow");
        nd.field_m = var3;
        qr.field_d = var3;
        var3++;
        ((ni) this).field_O[var3] = eg.a(param0, "", "new_classic_table/class_leg");
        fc.field_c = var3;
        dp.field_l = var3;
        var3++;
        ((ni) this).field_O[var3] = eg.a(param0, "", "new_classic_table/class_hole_a");
        pf.field_k = var3;
        rb.field_a = var3;
        var3++;
        ((ni) this).field_O[var3] = eg.a(param0, "", "new_classic_table/class_hole_b");
        ch.field_G = var3;
        rg.field_u = var3;
        var3++;
        ((ni) this).field_O[var3] = eg.a(param0, "", "new_classic_table/class_corner");
        var3++;
        ((ni) this).field_O[var3] = eg.a(param0, "", "new_classic_table/class_side_a");
        var3++;
        ((ni) this).field_O[var3] = eg.a(param0, "", "new_classic_table/class_side_b");
        if (param1 < -43) {
          var3++;
          ((ni) this).field_O[var3] = eg.a(param0, "", "new_classic_table/class_side_c");
          af.field_e = var3;
          uk.field_l = var3;
          var3++;
          ((ni) this).field_O[var3] = eg.a(param0, "", "new_classic_table/classic_top_a");
          var3++;
          ((ni) this).field_O[var3] = eg.a(param0, "", "new_classic_table/classic_top_b");
          oo.field_I = var3;
          ((ni) this).field_A = new jk();
          ((ni) this).field_A.a(eg.a(param0, "", "cues/classic_cue"), (byte) -121);
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((ni) this).field_O.length) {
              var5 = 2147483647;
              var6 = -2147483648;
              var7 = 2147483647;
              var8 = -2147483648;
              var9 = 2147483647;
              var10 = -2147483648;
              var4 = uk.field_l;
              L1: while (true) {
                if (var4 >= oo.field_I) {
                  var7 = -var8 + var7 * 2;
                  var5 = -var6 + var5 * 2;
                  var11 = (var6 + var5) / 2;
                  var12 = (var8 + var7) / 2;
                  var13 = var10;
                  var4 = 0;
                  L2: while (true) {
                    if (((ni) this).field_O.length <= var4) {
                      ((ni) this).field_M = new int[((ni) this).field_O.length][3];
                      var4 = 0;
                      L3: while (true) {
                        if (((ni) this).field_O.length <= var4) {
                          var4 = kj.field_b;
                          L4: while (true) {
                            if (var4 >= eh.field_t) {
                              var4 = tj.field_fb;
                              L5: while (true) {
                                if (nd.field_m <= var4) {
                                  return;
                                } else {
                                  var40 = new eg[4];
                                  var14 = var40;
                                  var15 = var4;
                                  var16 = var14;
                                  var32 = ((ni) this).field_O[var15];
                                  var66 = ((ni) this).field_M[var15];
                                  var34 = var16;
                                  var19 = var34;
                                  var36 = a.a(true, new eg(var32, false, false, false, false));
                                  var67 = mj.a(-31121);
                                  var57 = var67;
                                  var47 = var57;
                                  var35 = var47;
                                  var20 = var35;
                                  var20[1] = 0 + var66[1];
                                  var20[0] = 0 + var66[0];
                                  var20[2] = var66[2] + 0;
                                  var19[0] = new eg(var32, false, false, false, false);
                                  var34[0].a(var67);
                                  var68 = mj.a(-31121);
                                  var58 = var68;
                                  var48 = var58;
                                  var37 = var48;
                                  var20 = var37;
                                  var20[1] = -(var66[1] - 0);
                                  var20[2] = 0 + var66[2];
                                  var20[0] = 0 + var66[0];
                                  var19[1] = new eg(var36, false, false, false, false);
                                  var34[1].a(var68);
                                  var69 = mj.a(-31121);
                                  var59 = var69;
                                  var49 = var59;
                                  var38 = var49;
                                  var20 = var38;
                                  var20[2] = 0 + var66[2];
                                  var20[1] = 0 + var66[1];
                                  var20[0] = var66[0] + 0;
                                  int[] discarded$5 = dq.a((byte) -123, var69);
                                  var19[2] = new eg(var32, false, false, false, false);
                                  var34[2].a(var69);
                                  var70 = mj.a(-31121);
                                  var60 = var70;
                                  var50 = var60;
                                  var39 = var50;
                                  var20 = var39;
                                  var20[0] = var66[0] - 0;
                                  var20[1] = -(var66[1] + 0);
                                  var20[2] = 0 + var66[2];
                                  int[] discarded$6 = dq.a((byte) -122, var70);
                                  var19[3] = new eg(var36, false, false, false, false);
                                  var34[3].a(var70);
                                  ((ni) this).field_O[var4] = new eg(var40, 4);
                                  var4++;
                                  continue L5;
                                }
                              }
                            } else {
                              var31 = new eg[4];
                              var14 = var31;
                              var15 = var4;
                              var16 = var14;
                              var23 = ((ni) this).field_O[var15];
                              var61 = ((ni) this).field_M[var15];
                              var25 = var16;
                              var19 = var25;
                              var27 = a.a(true, new eg(var23, false, false, false, false));
                              var62 = mj.a(-31121);
                              var52 = var62;
                              var42 = var52;
                              var26 = var42;
                              var20 = var26;
                              var20[1] = var61[1] + 0;
                              var20[2] = var61[2] - 0;
                              var20[0] = var61[0] + 0;
                              var19[0] = new eg(var23, false, false, false, false);
                              var25[0].a(var62);
                              var63 = mj.a(-31121);
                              var53 = var63;
                              var43 = var53;
                              var28 = var43;
                              var20 = var28;
                              var20[1] = -(0 + var61[1]);
                              var20[0] = 0 + var61[0];
                              var20[2] = var61[2] + 0;
                              var19[1] = new eg(var27, false, false, false, false);
                              var25[1].a(var63);
                              var64 = mj.a(-31121);
                              var54 = var64;
                              var44 = var54;
                              var29 = var44;
                              var20 = var29;
                              var20[1] = 0 + var61[1];
                              var20[0] = var61[0] - 0;
                              var20[2] = var61[2] - 0;
                              int[] discarded$7 = dq.a((byte) 45, var64);
                              var19[2] = new eg(var23, false, false, false, false);
                              var25[2].a(var64);
                              var65 = mj.a(-31121);
                              var55 = var65;
                              var45 = var55;
                              var30 = var45;
                              var20 = var30;
                              var20[2] = 0 + var61[2];
                              var20[1] = -(var61[1] + 0);
                              var20[0] = var61[0] + 0;
                              int[] discarded$8 = dq.a((byte) 75, var65);
                              var19[3] = new eg(var27, false, false, false, false);
                              var25[3].a(var65);
                              ((ni) this).field_O[var4] = new eg(var31, 4);
                              var4++;
                              continue L4;
                            }
                          }
                        } else {
                          ln.a(((ni) this).field_M[var4], 0, ((ni) this).field_O[var4]);
                          var4++;
                          continue L3;
                        }
                      }
                    } else {
                      eg discarded$9 = cq.a(var11, 59, var13, ((ni) this).field_O[var4], var12);
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  L6: {
                    d.a(((ni) this).field_O[var4], -23109);
                    if (var5 <= ((ni) this).field_O[var4].field_D) {
                      break L6;
                    } else {
                      var5 = ((ni) this).field_O[var4].field_D;
                      break L6;
                    }
                  }
                  L7: {
                    if (((ni) this).field_O[var4].field_w <= var6) {
                      break L7;
                    } else {
                      var6 = ((ni) this).field_O[var4].field_w;
                      break L7;
                    }
                  }
                  L8: {
                    if (((ni) this).field_O[var4].field_y < var7) {
                      var7 = ((ni) this).field_O[var4].field_y;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (((ni) this).field_O[var4].field_x <= var10) {
                      break L9;
                    } else {
                      var10 = ((ni) this).field_O[var4].field_x;
                      break L9;
                    }
                  }
                  L10: {
                    if (((ni) this).field_O[var4].field_S > var8) {
                      var8 = ((ni) this).field_O[var4].field_S;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (((ni) this).field_O[var4].field_V < var9) {
                    var9 = ((ni) this).field_O[var4].field_V;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              db.a(0, ((ni) this).field_O[var4]);
              var4++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final void a(cf param0, int param1) {
        ((ni) this).field_X = param0.a("ball_hard", true, "");
        ((ni) this).field_Q = param0.a("ball_soft", true, "");
        ((ni) this).field_fb = param0.a("cue_hard", true, "");
        int var3 = 84 / ((param1 - 39) / 38);
        ((ni) this).field_W = param0.a("cue_soft", true, "");
        ((ni) this).field_Y = param0.a("pot_ball_pocket", true, "");
        ((ni) this).field_db = param0.a("pot_ball_mechanism", true, "");
        ((ni) this).field_cb = param0.a("respot_the_white", true, "");
        ((ni) this).field_V = param0.a("cushion", true, "");
    }

    final static void f(byte param0) {
        int var2 = Pool.field_O;
        if (param0 != -119) {
            field_eb = null;
        }
        if ((ba.field_ub.field_I.field_b & 1 << ba.field_ub.field_db) != 0) {
            nk.field_f[12] = ba.field_ub.field_r ? w.field_l : df.field_m;
        } else {
            if (ba.field_ub.field_I.field_b != 0) {
                nk.field_f[12] = ba.field_ub.field_r ? hb.field_n : er.field_N;
            } else {
                if (-1 + (1 << ba.field_ub.field_I.field_n) == (ba.field_ub.field_cb | 1 << ba.field_ub.field_db)) {
                    nk.field_f[12] = ba.field_ub.field_r ? e.field_b : fq.field_Bb;
                } else {
                    nk.field_f[12] = !ba.field_ub.field_r ? ia.field_j : og.field_H;
                }
            }
        }
        if ((ne.field_w ^ -1) <= -1) {
            s.field_c[ne.field_w].c((byte) -126);
        }
    }

    ni() {
        ((ni) this).field_E = 1508.0;
        ((ni) this).field_p = 1.5707963705062866;
        ((ni) this).field_d = 64;
        ((ni) this).field_x = 85;
        ((ni) this).field_C = 64;
        ((ni) this).field_j = 1.7627825736999512;
        ((ni) this).field_m = 85;
        ((ni) this).b(126);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = new he();
        field_ib = null;
        field_S = "No highscores";
    }
}
