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
        nb dupTemp$3 = null;
        kf discarded$4 = null;
        le discarded$5 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var8 = Pool.field_O;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              if (this.field_hb == null) {
                break L1;
              } else {
                if (!this.field_hb.i()) {
                  break L1;
                } else {
                  this.field_hb = null;
                  break L1;
                }
              }
            }
            L2: {
              if (null == this.field_ab) {
                break L2;
              } else {
                if (!this.field_ab.i()) {
                  break L2;
                } else {
                  if (this.field_hb != null) {
                    break L2;
                  } else {
                    dupTemp$3 = nb.a(this.field_db, 100, this.field_ab.l(), this.field_ab.n());
                    this.field_hb = dupTemp$3;
                    discarded$4 = mn.a(-24296, dupTemp$3);
                    this.field_ab = null;
                    break L2;
                  }
                }
              }
            }
            L3: {
              ei.field_u = ei.field_u + 1;
              if ((ne.field_s ^ -1) != -2) {
                break L3;
              } else {
                if (mp.field_V > 0) {
                  L4: {
                    var3_int = 0;
                    var4 = 128 + param1.field_eb.b(-128);
                    if ((var4 ^ -1) >= -1) {
                      break L4;
                    } else {
                      var5 = -this.field_B.field_A + var4 - -111;
                      if (ua.field_o <= var5) {
                        break L4;
                      } else {
                        if (68 + var5 > ua.field_o) {
                          L5: {
                            var6 = (int)(-param1.field_eb.a(true) * (double)this.field_B.field_z / 2.0 / 3.141592653589793);
                            var7 = -this.field_B.field_z + var6 + 1289;
                            if (var7 >= lq.field_W) {
                              break L5;
                            } else {
                              if (54 + var7 <= lq.field_W) {
                                break L5;
                              } else {
                                var3_int = 1;
                                break L4;
                              }
                            }
                          }
                          if (-qh.field_l + this.field_B.field_z <= var6) {
                            break L4;
                          } else {
                            var7 = 1289 + var6;
                            if (lq.field_W <= var7) {
                              break L4;
                            } else {
                              if (54 + var7 <= lq.field_W) {
                                break L4;
                              } else {
                                var3_int = 1;
                                break L4;
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (var3_int == 0) {
                    break L3;
                  } else {
                    e.field_c[la.field_b % e.field_c.length] = ei.field_u;
                    la.field_b = la.field_b + 1;
                    if (la.field_b >= 5) {
                      var5 = e.field_c[0];
                      var6 = e.field_c[0];
                      var7 = 1;
                      L6: while (true) {
                        if (var7 >= e.field_c.length) {
                          var7 = -var5 + var6;
                          if (0 >= var7) {
                            break L3;
                          } else {
                            if ((var7 ^ -1) <= -51) {
                              break L3;
                            } else {
                              L7: {
                                stackOut_35_0 = -3405;
                                stackOut_35_1 = 22;
                                stackIn_37_0 = stackOut_35_0;
                                stackIn_37_1 = stackOut_35_1;
                                stackIn_36_0 = stackOut_35_0;
                                stackIn_36_1 = stackOut_35_1;
                                if (mg.a(true)) {
                                  stackOut_37_0 = stackIn_37_0;
                                  stackOut_37_1 = stackIn_37_1;
                                  stackOut_37_2 = 21;
                                  stackIn_38_0 = stackOut_37_0;
                                  stackIn_38_1 = stackOut_37_1;
                                  stackIn_38_2 = stackOut_37_2;
                                  break L7;
                                } else {
                                  stackOut_36_0 = stackIn_36_0;
                                  stackOut_36_1 = stackIn_36_1;
                                  stackOut_36_2 = 0;
                                  stackIn_38_0 = stackOut_36_0;
                                  stackIn_38_1 = stackOut_36_1;
                                  stackIn_38_2 = stackOut_36_2;
                                  break L7;
                                }
                              }
                              fq.a(stackIn_38_0, stackIn_38_1, stackIn_38_2, false);
                              discarded$5 = lg.field_s.a(true, (byte) 106, (java.awt.Component) ((Object) vj.a((byte) -113)));
                              break L3;
                            }
                          }
                        } else {
                          L8: {
                            if (e.field_c[var7] > var6) {
                              var6 = e.field_c[var7];
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          if (e.field_c[var7] < var5) {
                            var5 = e.field_c[var7];
                            var7++;
                            continue L6;
                          } else {
                            var7++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var3);
            stackOut_40_1 = new StringBuilder().append("ni.T(").append(param0).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L9;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L9;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
    }

    final void a(byte param0, uf param1) {
        RuntimeException var3 = null;
        pq[] var3_array = null;
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
        di var15 = null;
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
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        boolean[] var59 = null;
        int[] var60 = null;
        boolean[] var61 = null;
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
        boolean[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        boolean[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_134_0 = null;
        int[] stackIn_134_1 = null;
        int stackIn_134_2 = 0;
        int stackIn_134_3 = 0;
        pq[] stackIn_134_4 = null;
        Object stackIn_135_0 = null;
        int[] stackIn_135_1 = null;
        int stackIn_135_2 = 0;
        int stackIn_135_3 = 0;
        pq[] stackIn_135_4 = null;
        Object stackIn_136_0 = null;
        int[] stackIn_136_1 = null;
        int stackIn_136_2 = 0;
        int stackIn_136_3 = 0;
        pq[] stackIn_136_4 = null;
        int stackIn_136_5 = 0;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        RuntimeException stackIn_147_0 = null;
        StringBuilder stackIn_147_1 = null;
        String stackIn_147_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_133_0 = null;
        int[] stackOut_133_1 = null;
        int stackOut_133_2 = 0;
        int stackOut_133_3 = 0;
        pq[] stackOut_133_4 = null;
        Object stackOut_135_0 = null;
        int[] stackOut_135_1 = null;
        int stackOut_135_2 = 0;
        int stackOut_135_3 = 0;
        pq[] stackOut_135_4 = null;
        int stackOut_135_5 = 0;
        Object stackOut_134_0 = null;
        int[] stackOut_134_1 = null;
        int stackOut_134_2 = 0;
        int stackOut_134_3 = 0;
        pq[] stackOut_134_4 = null;
        int stackOut_134_5 = 0;
        boolean[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        boolean[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        boolean[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        boolean[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        boolean[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        boolean[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        boolean[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        boolean[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        boolean[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        boolean[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        boolean[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        RuntimeException stackOut_144_0 = null;
        StringBuilder stackOut_144_1 = null;
        RuntimeException stackOut_146_0 = null;
        StringBuilder stackOut_146_1 = null;
        String stackOut_146_2 = null;
        RuntimeException stackOut_145_0 = null;
        StringBuilder stackOut_145_1 = null;
        String stackOut_145_2 = null;
        var14 = Pool.field_O;
        try {
          L0: {
            L1: {
              var20 = param1.field_I.field_l;
              var3_array = var20;
              var36 = f.a((byte) -56, param1.field_ab);
              var19 = var36;
              var4 = var19;
              var35 = var4;
              var18 = var35;
              var16 = var18;
              var5_ref_int__ = var16;
              oh.field_d[0] = var35[0] + -sb.a(288.0f, true) >> -1840238238;
              oh.field_d[1] = var35[1] + -sb.a(144.0f, true) >> 576321314;
              oh.field_d[2] = var35[2] >> -1004862910;
              if (var5_ref_int__ == oh.field_d) {
                break L1;
              } else {
                oh.field_d[11] = var35[11];
                oh.field_d[9] = var35[9];
                oh.field_d[5] = var35[5];
                oh.field_d[6] = var35[6];
                oh.field_d[8] = var35[8];
                oh.field_d[4] = var35[4];
                oh.field_d[3] = var35[3];
                oh.field_d[7] = var35[7];
                oh.field_d[10] = var35[10];
                break L1;
              }
            }
            var4[1] = rb.b(var36[1], -4);
            var4[2] = rb.b(var36[2], -4);
            var4[0] = rb.b(var36[0], -4);
            this.e(true);
            this.a(false, var36, var20);
            kf.a(ag.field_c, (byte) -104, pa.field_L, ph.field_g, lk.field_m);
            kf.a(ol.field_a, (byte) -104, pa.field_L, ph.field_g, w.field_h);
            kf.a(bf.field_k, (byte) -104, pa.field_L, ph.field_g, hb.field_l);
            var21 = this.field_bb;
            var54 = oh.field_d;
            var21.b((byte) -123, 0, var21.field_j.length, var54);
            var5 = 0;
            L2: while (true) {
              if (var5 >= this.field_kb.length) {
                var24 = this.field_R;
                var55 = oh.field_d;
                var24.b((byte) -113, 0, var24.field_j.length, var55);
                en.b(param0 + 55);
                this.a(false, param1);
                var56 = new int[3];
                hr.a(th.field_l[vf.field_lb].field_l[0], var56, oh.field_d, th.field_l[vf.field_lb].field_l[1], th.field_l[vf.field_lb].field_l[2], (byte) 9);
                var9 = var56[1];
                var8 = var56[1];
                var7 = var56[0];
                var6 = var56[0];
                var5 = ma.field_g + -1;
                L3: while (true) {
                  if (var5 < vf.field_lb) {
                    L4: {
                      if (qh.field_b <= var6) {
                        break L4;
                      } else {
                        var6 = qh.field_b;
                        break L4;
                      }
                    }
                    L5: {
                      if (qh.field_c > var8) {
                        var8 = qh.field_c;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (qh.field_g < var9) {
                        var9 = qh.field_g;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (qh.field_j >= var7) {
                        break L7;
                      } else {
                        var7 = qh.field_j;
                        break L7;
                      }
                    }
                    var5 = -1 + eo.field_Qb;
                    L8: while (true) {
                      if (sb.field_d > var5) {
                        var11 = lk.field_m;
                        var12 = ag.field_c;
                        var13 = var12 - 1;
                        L9: while (true) {
                          if (var11 > var13) {
                            L10: {
                              var27 = this.field_R;
                              if (param0 == -55) {
                                break L10;
                              } else {
                                var15 = (di) null;
                                this.c(92, (di) null);
                                break L10;
                              }
                            }
                            var57 = oh.field_d;
                            var27.a((byte) -112, 0, var27.field_j.length, var57);
                            var11 = w.field_h;
                            var12 = ol.field_a;
                            var13 = -1 + var12;
                            L11: while (true) {
                              if (var11 > var13) {
                                L12: {
                                  if (-1L == (1073741824L & pd.field_i ^ -1L)) {
                                    this.a(var36, (byte) 65, false, var20, false);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                var11 = hb.field_l;
                                var12 = bf.field_k;
                                var13 = var12 + -1;
                                L13: while (true) {
                                  if (var13 < var11) {
                                    L14: {
                                      if ((1073741824L & pd.field_i) != 0L) {
                                        break L14;
                                      } else {
                                        param1.z((byte) 1);
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      if (-1L != (1073741824L & pd.field_i ^ -1L)) {
                                        break L15;
                                      } else {
                                        var11 = 0;
                                        L16: while (true) {
                                          if (var20.length <= var11) {
                                            break L15;
                                          } else {
                                            L17: {
                                              if (var20[var11].field_s) {
                                                this.a(var36, var20[var11]);
                                                break L17;
                                              } else {
                                                break L17;
                                              }
                                            }
                                            var11++;
                                            continue L16;
                                          }
                                        }
                                      }
                                    }
                                    L18: {
                                      var29 = this.field_bb;
                                      var58 = oh.field_d;
                                      var59 = this.field_kb;
                                      var29.a(false, 0, var29.field_j.length, (byte) -65, var58, var59);
                                      if (-1L == (1073741824L & pd.field_i ^ -1L)) {
                                        L19: {
                                          stackOut_133_0 = this;
                                          stackOut_133_1 = (int[]) (var4);
                                          stackOut_133_2 = 115;
                                          stackOut_133_3 = 1;
                                          stackOut_133_4 = (pq[]) (var3_array);
                                          stackIn_135_0 = stackOut_133_0;
                                          stackIn_135_1 = stackOut_133_1;
                                          stackIn_135_2 = stackOut_133_2;
                                          stackIn_135_3 = stackOut_133_3;
                                          stackIn_135_4 = stackOut_133_4;
                                          stackIn_134_0 = stackOut_133_0;
                                          stackIn_134_1 = stackOut_133_1;
                                          stackIn_134_2 = stackOut_133_2;
                                          stackIn_134_3 = stackOut_133_3;
                                          stackIn_134_4 = stackOut_133_4;
                                          if (param1.field_I.j(param0 ^ -45).field_q != 0) {
                                            stackOut_135_0 = this;
                                            stackOut_135_1 = (int[]) ((Object) stackIn_135_1);
                                            stackOut_135_2 = stackIn_135_2;
                                            stackOut_135_3 = stackIn_135_3;
                                            stackOut_135_4 = (pq[]) ((Object) stackIn_135_4);
                                            stackOut_135_5 = 0;
                                            stackIn_136_0 = stackOut_135_0;
                                            stackIn_136_1 = stackOut_135_1;
                                            stackIn_136_2 = stackOut_135_2;
                                            stackIn_136_3 = stackOut_135_3;
                                            stackIn_136_4 = stackOut_135_4;
                                            stackIn_136_5 = stackOut_135_5;
                                            break L19;
                                          } else {
                                            stackOut_134_0 = this;
                                            stackOut_134_1 = (int[]) ((Object) stackIn_134_1);
                                            stackOut_134_2 = stackIn_134_2;
                                            stackOut_134_3 = stackIn_134_3;
                                            stackOut_134_4 = (pq[]) ((Object) stackIn_134_4);
                                            stackOut_134_5 = 1;
                                            stackIn_136_0 = stackOut_134_0;
                                            stackIn_136_1 = stackOut_134_1;
                                            stackIn_136_2 = stackOut_134_2;
                                            stackIn_136_3 = stackOut_134_3;
                                            stackIn_136_4 = stackOut_134_4;
                                            stackIn_136_5 = stackOut_134_5;
                                            break L19;
                                          }
                                        }
                                        this.a(stackIn_136_1, (byte) stackIn_136_2, stackIn_136_3 != 0, stackIn_136_4, stackIn_136_5 != 0);
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    }
                                    L20: {
                                      var32 = this.field_bb;
                                      var60 = oh.field_d;
                                      var61 = this.field_kb;
                                      var32.a(true, 0, var32.field_j.length, (byte) 111, var60, var61);
                                      if ((pd.field_i & 1073741824L ^ -1L) == -1L) {
                                        param1.q(-1);
                                        param1.D(-126);
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if ((pd.field_i & 256L ^ -1L) != -1L) {
                                        this.field_R.a(oh.field_d, 0);
                                        this.field_bb.a(oh.field_d, 0);
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                    break L0;
                                  } else {
                                    th.field_l[ph.field_g[var13]].c(param0 ^ -6710865, oh.field_d);
                                    var13--;
                                    continue L13;
                                  }
                                }
                              } else {
                                th.field_l[ph.field_g[var13]].c(param0 + 6710941, oh.field_d);
                                var13--;
                                continue L11;
                              }
                            }
                          } else {
                            th.field_l[ph.field_g[var13]].c(6710886, oh.field_d);
                            var13--;
                            continue L9;
                          }
                        }
                      } else {
                        th.field_l[var5].c(6710886, oh.field_d);
                        var5--;
                        continue L8;
                      }
                    }
                  } else {
                    L22: {
                      th.field_l[var5].c(6710886, oh.field_d);
                      hr.a((int) th.field_l[var5].field_h, var56, oh.field_d, (int) th.field_l[var5].field_a, (int) th.field_l[var5].field_o, (byte) 9);
                      if (var6 <= var56[0]) {
                        if (var7 < var56[0]) {
                          var7 = var56[0];
                          break L22;
                        } else {
                          break L22;
                        }
                      } else {
                        var6 = var56[0];
                        break L22;
                      }
                    }
                    L23: {
                      if (var8 <= var56[1]) {
                        if (var9 < var56[1]) {
                          var9 = var56[1];
                          break L23;
                        } else {
                          break L23;
                        }
                      } else {
                        var8 = var56[1];
                        break L23;
                      }
                    }
                    L24: {
                      hr.a((int) th.field_l[var5].field_p, var56, oh.field_d, (int) th.field_l[var5].field_a, (int) th.field_l[var5].field_o, (byte) 9);
                      if (var56[0] >= var6) {
                        if (var7 >= var56[0]) {
                          break L24;
                        } else {
                          var7 = var56[0];
                          break L24;
                        }
                      } else {
                        var6 = var56[0];
                        break L24;
                      }
                    }
                    L25: {
                      if (var56[1] >= var8) {
                        if (var9 < var56[1]) {
                          var9 = var56[1];
                          break L25;
                        } else {
                          break L25;
                        }
                      } else {
                        var8 = var56[1];
                        break L25;
                      }
                    }
                    L26: {
                      hr.a((int) th.field_l[var5].field_h, var56, oh.field_d, (int) th.field_l[var5].field_m, (int) th.field_l[var5].field_o, (byte) 9);
                      if (var6 > var56[0]) {
                        var6 = var56[0];
                        break L26;
                      } else {
                        if (var56[0] <= var7) {
                          break L26;
                        } else {
                          var7 = var56[0];
                          break L26;
                        }
                      }
                    }
                    L27: {
                      if (var56[1] < var8) {
                        var8 = var56[1];
                        break L27;
                      } else {
                        if (var9 < var56[1]) {
                          var9 = var56[1];
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                    }
                    L28: {
                      hr.a((int) th.field_l[var5].field_p, var56, oh.field_d, (int) th.field_l[var5].field_m, (int) th.field_l[var5].field_o, (byte) 9);
                      if (var8 <= var56[1]) {
                        if (var9 < var56[1]) {
                          var9 = var56[1];
                          break L28;
                        } else {
                          break L28;
                        }
                      } else {
                        var8 = var56[1];
                        break L28;
                      }
                    }
                    L29: {
                      if (var56[0] < var6) {
                        var6 = var56[0];
                        break L29;
                      } else {
                        if (var56[0] <= var7) {
                          break L29;
                        } else {
                          var7 = var56[0];
                          break L29;
                        }
                      }
                    }
                    L30: {
                      hr.a((int) th.field_l[var5].field_h, var56, oh.field_d, (int) th.field_l[var5].field_a, (int) th.field_l[var5].field_f, (byte) 9);
                      if (var8 <= var56[1]) {
                        if (var9 < var56[1]) {
                          var9 = var56[1];
                          break L30;
                        } else {
                          break L30;
                        }
                      } else {
                        var8 = var56[1];
                        break L30;
                      }
                    }
                    L31: {
                      if (var56[0] < var6) {
                        var6 = var56[0];
                        break L31;
                      } else {
                        if (var56[0] <= var7) {
                          break L31;
                        } else {
                          var7 = var56[0];
                          break L31;
                        }
                      }
                    }
                    L32: {
                      hr.a((int) th.field_l[var5].field_p, var56, oh.field_d, (int) th.field_l[var5].field_a, (int) th.field_l[var5].field_f, (byte) 9);
                      if (var6 > var56[0]) {
                        var6 = var56[0];
                        break L32;
                      } else {
                        if (var56[0] > var7) {
                          var7 = var56[0];
                          break L32;
                        } else {
                          break L32;
                        }
                      }
                    }
                    L33: {
                      if (var8 > var56[1]) {
                        var8 = var56[1];
                        break L33;
                      } else {
                        if (var56[1] <= var9) {
                          break L33;
                        } else {
                          var9 = var56[1];
                          break L33;
                        }
                      }
                    }
                    L34: {
                      hr.a((int) th.field_l[var5].field_h, var56, oh.field_d, (int) th.field_l[var5].field_m, (int) th.field_l[var5].field_f, (byte) 9);
                      if (var6 <= var56[0]) {
                        if (var56[0] > var7) {
                          var7 = var56[0];
                          break L34;
                        } else {
                          break L34;
                        }
                      } else {
                        var6 = var56[0];
                        break L34;
                      }
                    }
                    L35: {
                      if (var8 <= var56[1]) {
                        if (var9 >= var56[1]) {
                          break L35;
                        } else {
                          var9 = var56[1];
                          break L35;
                        }
                      } else {
                        var8 = var56[1];
                        break L35;
                      }
                    }
                    L36: {
                      hr.a((int) th.field_l[var5].field_p, var56, oh.field_d, (int) th.field_l[var5].field_m, (int) th.field_l[var5].field_f, (byte) 9);
                      if (var56[1] >= var8) {
                        if (var9 >= var56[1]) {
                          break L36;
                        } else {
                          var9 = var56[1];
                          break L36;
                        }
                      } else {
                        var8 = var56[1];
                        break L36;
                      }
                    }
                    L37: {
                      if (var6 > var56[0]) {
                        var6 = var56[0];
                        break L37;
                      } else {
                        if (var56[0] > var7) {
                          var7 = var56[0];
                          break L37;
                        } else {
                          var5--;
                          continue L3;
                        }
                      }
                    }
                    var5--;
                    continue L3;
                  }
                }
              } else {
                L38: {
                  var38 = this.field_bb.field_c[var5];
                  var23 = var38;
                  var17 = var23;
                  var6_ref_int__ = var17;
                  var7 = 576;
                  var8 = 288;
                  stackOut_5_0 = this.field_kb;
                  stackOut_5_1 = var5;
                  stackOut_5_2 = var38[1] + -oh.field_d[1];
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  if (var38[1] >= -var8) {
                    stackOut_7_0 = (boolean[]) ((Object) stackIn_7_0);
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = stackIn_7_2;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    if (var8 < var38[1]) {
                      stackOut_9_0 = (boolean[]) ((Object) stackIn_9_0);
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = stackIn_9_2;
                      stackOut_9_3 = -1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      stackIn_10_3 = stackOut_9_3;
                      break L38;
                    } else {
                      stackOut_8_0 = (boolean[]) ((Object) stackIn_8_0);
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = stackIn_8_2;
                      stackOut_8_3 = 0;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      stackIn_10_3 = stackOut_8_3;
                      break L38;
                    }
                  } else {
                    stackOut_6_0 = (boolean[]) ((Object) stackIn_6_0);
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = stackIn_6_2;
                    stackOut_6_3 = 1;
                    stackIn_10_0 = stackOut_6_0;
                    stackIn_10_1 = stackOut_6_1;
                    stackIn_10_2 = stackOut_6_2;
                    stackIn_10_3 = stackOut_6_3;
                    break L38;
                  }
                }
                L39: {
                  stackOut_10_0 = (boolean[]) ((Object) stackIn_10_0);
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = stackIn_10_2 * stackIn_10_3;
                  stackOut_10_3 = var38[0] - oh.field_d[0];
                  stackIn_14_0 = stackOut_10_0;
                  stackIn_14_1 = stackOut_10_1;
                  stackIn_14_2 = stackOut_10_2;
                  stackIn_14_3 = stackOut_10_3;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  if (var38[0] < -var7) {
                    stackOut_14_0 = (boolean[]) ((Object) stackIn_14_0);
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = stackIn_14_2;
                    stackOut_14_3 = stackIn_14_3;
                    stackOut_14_4 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    stackIn_15_3 = stackOut_14_3;
                    stackIn_15_4 = stackOut_14_4;
                    break L39;
                  } else {
                    stackOut_11_0 = (boolean[]) ((Object) stackIn_11_0);
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = stackIn_11_2;
                    stackOut_11_3 = stackIn_11_3;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    if (var7 < var38[0]) {
                      stackOut_13_0 = (boolean[]) ((Object) stackIn_13_0);
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = stackIn_13_2;
                      stackOut_13_3 = stackIn_13_3;
                      stackOut_13_4 = -1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_15_3 = stackOut_13_3;
                      stackIn_15_4 = stackOut_13_4;
                      break L39;
                    } else {
                      stackOut_12_0 = (boolean[]) ((Object) stackIn_12_0);
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = stackIn_12_2;
                      stackOut_12_3 = stackIn_12_3;
                      stackOut_12_4 = 0;
                      stackIn_15_0 = stackOut_12_0;
                      stackIn_15_1 = stackOut_12_1;
                      stackIn_15_2 = stackOut_12_2;
                      stackIn_15_3 = stackOut_12_3;
                      stackIn_15_4 = stackOut_12_4;
                      break L39;
                    }
                  }
                }
                L40: {
                  stackOut_15_0 = (boolean[]) ((Object) stackIn_15_0);
                  stackOut_15_1 = stackIn_15_1;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  if (stackIn_15_2 + stackIn_15_3 * stackIn_15_4 <= 0) {
                    stackOut_17_0 = (boolean[]) ((Object) stackIn_17_0);
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    break L40;
                  } else {
                    stackOut_16_0 = (boolean[]) ((Object) stackIn_16_0);
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    break L40;
                  }
                }
                stackIn_18_0[stackIn_18_1] = stackIn_18_2 != 0;
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var3 = decompiledCaughtException;
            stackOut_144_0 = (RuntimeException) (var3);
            stackOut_144_1 = new StringBuilder().append("ni.W(").append(param0).append(',');
            stackIn_146_0 = stackOut_144_0;
            stackIn_146_1 = stackOut_144_1;
            stackIn_145_0 = stackOut_144_0;
            stackIn_145_1 = stackOut_144_1;
            if (param1 == null) {
              stackOut_146_0 = (RuntimeException) ((Object) stackIn_146_0);
              stackOut_146_1 = (StringBuilder) ((Object) stackIn_146_1);
              stackOut_146_2 = "null";
              stackIn_147_0 = stackOut_146_0;
              stackIn_147_1 = stackOut_146_1;
              stackIn_147_2 = stackOut_146_2;
              break L41;
            } else {
              stackOut_145_0 = (RuntimeException) ((Object) stackIn_145_0);
              stackOut_145_1 = (StringBuilder) ((Object) stackIn_145_1);
              stackOut_145_2 = "{...}";
              stackIn_147_0 = stackOut_145_0;
              stackIn_147_1 = stackOut_145_1;
              stackIn_147_2 = stackOut_145_2;
              break L41;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_147_0), stackIn_147_2 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        kf discarded$8 = null;
        kf discarded$9 = null;
        nb dupTemp$10 = null;
        kf discarded$11 = null;
        kf discarded$12 = null;
        kf discarded$13 = null;
        kf discarded$14 = null;
        kf discarded$15 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pool.field_O;
          var5 = -40 % ((param2 - -44) / 56);
          var6 = param0;
          if (var6 != 5) {
            if (2 == var6) {
              discarded$8 = kp.a(100, this.field_X, param3, param1);
              break L0;
            } else {
              if (var6 != 3) {
                if (0 == var6) {
                  discarded$9 = kp.a(100, this.field_fb, param3, param1);
                  break L0;
                } else {
                  if (-2 != (var6 ^ -1)) {
                    if (-5 == (var6 ^ -1)) {
                      dupTemp$10 = nb.a(this.field_Y, 100, param1, param3);
                      this.field_ab = dupTemp$10;
                      discarded$11 = mn.a(-24296, dupTemp$10);
                      break L0;
                    } else {
                      if ((var6 ^ -1) != -7) {
                        super.a(param0, param1, (byte) -104, param3);
                        break L0;
                      } else {
                        discarded$12 = kp.a(100, this.field_cb, param3, param1);
                        break L0;
                      }
                    }
                  } else {
                    discarded$13 = kp.a(100, this.field_W, param3, param1);
                    break L0;
                  }
                }
              } else {
                discarded$14 = kp.a(100, this.field_Q, param3, param1);
                break L0;
              }
            }
          } else {
            discarded$15 = kp.a(100, this.field_V, param3, param1);
            break L0;
          }
        }
    }

    final void c(boolean param0) {
        so dupTemp$9 = null;
        so dupTemp$10 = null;
        so dupTemp$11 = null;
        so dupTemp$12 = null;
        so dupTemp$13 = null;
        eg dupTemp$14 = null;
        eg dupTemp$15 = null;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
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
        eg var15_ref_eg = null;
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
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
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
        var38 = new int[var3][][];
        var21 = var38;
        var5 = var21;
        var6 = this.a(kj.field_b, var4, var38, -57, eh.field_t);
        var7 = -tj.field_fb + nd.field_m;
        var8 = new eg[var7][];
        var39 = new int[var7][][];
        var22 = var39;
        var9 = var22;
        var10 = this.a(tj.field_fb, var8, var39, -58, nd.field_m);
        var11 = 0;
        L0: while (true) {
          if (var11 >= var4.length) {
            var11 = 0;
            L1: while (true) {
              if (var8.length <= var11) {
                th.field_l = new p[-1 * (-ch.field_G + af.field_e) + -1 * (pf.field_k + -fc.field_c) + (oo.field_I + -uk.field_l) * 3 + (dp.field_l - qr.field_d) * 3 + (-var3 + (var6 + this.field_O.length - -var10 + (-var7 + -1 * (-rb.field_a + rg.field_u))))];
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
                                  dupTemp$9 = new so(4 * (af.field_e - ch.field_G));
                                  this.field_jb = dupTemp$9;
                                  dupTemp$10 = new so(new so[]{dupTemp$9});
                                  this.field_bb = dupTemp$10;
                                  dupTemp$11 = new so(4 * (af.field_e + -ch.field_G));
                                  this.field_U = dupTemp$11;
                                  dupTemp$12 = new so(4 * (-fc.field_c + pf.field_k) + (rg.field_u - rb.field_a) * 2);
                                  this.field_gb = dupTemp$12;
                                  dupTemp$13 = new so(new so[]{dupTemp$11, dupTemp$12});
                                  this.field_R = dupTemp$13;
                                  var12 = new so(new so[]{dupTemp$10, dupTemp$13});
                                  var13 = new so(new so[]{this.field_jb, this.field_U});
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
                                                        stackOut_51_0 = (so) (var13);
                                                        stackIn_53_0 = stackOut_51_0;
                                                        stackIn_52_0 = stackOut_51_0;
                                                        if (param0) {
                                                          stackOut_53_0 = (so) ((Object) stackIn_53_0);
                                                          stackOut_53_1 = 0;
                                                          stackIn_54_0 = stackOut_53_0;
                                                          stackIn_54_1 = stackOut_53_1;
                                                          break L11;
                                                        } else {
                                                          stackOut_52_0 = (so) ((Object) stackIn_52_0);
                                                          stackOut_52_1 = 1;
                                                          stackIn_54_0 = stackOut_52_0;
                                                          stackIn_54_1 = stackOut_52_1;
                                                          break L11;
                                                        }
                                                      }
                                                      ((so) (Object) stackIn_54_0).a(stackIn_54_1 != 0);
                                                      var12.a(this.field_q, this.field_e, this.field_F, (byte) -122, this.field_u, this.field_C);
                                                      this.field_bb.d(104);
                                                      this.field_kb = new boolean[this.field_bb.field_j.length];
                                                      this.field_R.d(116);
                                                      w.field_h = var11;
                                                      ol.field_a = var11;
                                                      return;
                                                    } else {
                                                      var16 = var2;
                                                      var37 = this.field_gb.field_b;
                                                      var18 = var15;
                                                      be.a(var18, this.field_M[var16][1], this.field_M[var16][2], 1, var37, this.field_M[var16][0], this.field_O[var16]);
                                                      var15 += 2;
                                                      var2++;
                                                      continue L10;
                                                    }
                                                  }
                                                } else {
                                                  var16 = var2;
                                                  var35 = this.field_gb.field_b;
                                                  var18 = var15;
                                                  var48 = this.field_M[var16];
                                                  bh.a(var35, false, var48[1], var48[2], this.field_O[var16], var48[0], var18);
                                                  var15 += 4;
                                                  var2++;
                                                  continue L9;
                                                }
                                              }
                                            } else {
                                              var34 = var14[var2 + -ch.field_G][0];
                                              var47 = this.field_M[var2];
                                              var32 = this.field_jb.field_b;
                                              var19 = var15;
                                              bh.a(var32, false, 0 + var47[1], var47[2] - 0, var34, 0 + var47[0], var19);
                                              var15 += 4;
                                              var2++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          var31 = var14[var2 + -ch.field_G][1];
                                          var46 = this.field_M[var2];
                                          var29 = this.field_U.field_b;
                                          var19 = var15;
                                          bh.a(var29, false, var46[1] - 0, var46[2] + 0, var31, 0 + var46[0], var19);
                                          var15 += 4;
                                          var2++;
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      dupTemp$14 = hq.b((byte) 125);
                                      var14[var2 - ch.field_G][0] = dupTemp$14;
                                      var15_ref_eg = dupTemp$14;
                                      dupTemp$15 = hq.b((byte) 127);
                                      var14[-ch.field_G + var2][1] = dupTemp$15;
                                      var28 = dupTemp$15;
                                      ej.a(0, var15_ref_eg, 0, false, -this.field_M[var2][2], 0, 0, 1, var28, this.field_O[var2]);
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
                                    stackOut_32_1 = (p[]) (var13_array);
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
                                      stackOut_34_1 = (p[]) ((Object) stackIn_34_1);
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
                                      stackOut_33_1 = (p[]) ((Object) stackIn_33_1);
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
                                  this.a(stackIn_35_1, stackIn_35_2, stackIn_35_3, stackIn_35_4 != 0, this.field_O[var12_int], var14_int, this.field_M[var12_int], 0);
                                  var11 += 4;
                                  var2++;
                                  continue L5;
                                }
                              }
                            } else {
                              var12_int = var2;
                              var27 = th.field_l;
                              var14_int = var11;
                              this.a(var27, 0, 0, false, this.field_O[var12_int], var14_int, this.field_M[var12_int], 0);
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
                            incrementValue$16 = var12_int;
                            var12_int++;
                            th.field_l[incrementValue$16] = new p((nc) ((Object) this.a(0, var25[var15])), new int[]{var26[var15][0], var26[var15][1], var26[var15][2]});
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
                        incrementValue$17 = var12_int;
                        var12_int++;
                        th.field_l[incrementValue$17] = new p((nc) ((Object) this.a(108, var23[var15])), new int[]{var24[var15][0], var24[var15][1], var24[var15][2]});
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
        this.field_v = 5609813;
    }

    final void c(int param0, di param1) {
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
              if (param0 == -23569) {
                break L1;
              } else {
                this.field_U = (so) null;
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
            stackOut_3_1 = new StringBuilder().append("ni.OA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void e(byte param0) {
        field_Z = null;
        field_S = null;
        if (param0 != 71) {
            field_S = (String) null;
        }
        field_eb = null;
    }

    final void a(int param0, di param1) {
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
              this.field_b = cg.a(param1, "", "pool_modern");
              this.field_n = cg.a(param1, "", "lose_jingle");
              this.field_i = cg.a(param1, "", "win_jingle");
              if (param0 == 1) {
                break L1;
              } else {
                this.a(108, 33, (byte) 117, 21);
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
            stackOut_3_1 = new StringBuilder().append("ni.Q(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void b(int param0, di param1) {
        RuntimeException runtimeException = null;
        uf var4 = null;
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
              this.field_B = new dd(param1.a(false, "modern-sky.jpg", ""), (java.awt.Component) ((Object) pa.field_K));
              if (param0 == 5) {
                break L1;
              } else {
                var4 = (uf) null;
                this.a(false, (uf) null);
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
            stackOut_3_1 = new StringBuilder().append("ni.JA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void a(boolean param0, uf param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        mm stackIn_5_0 = null;
        mm stackIn_6_0 = null;
        mm stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        mm stackOut_4_0 = null;
        mm stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        mm stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 128 + param1.field_eb.b(-127);
              if (!param0) {
                break L1;
              } else {
                this.c(true);
                break L1;
              }
            }
            L2: {
              if (var3_int > 0) {
                L3: {
                  stackOut_4_0 = param1.field_eb;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (param0) {
                    stackOut_6_0 = (mm) ((Object) stackIn_6_0);
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L3;
                  } else {
                    stackOut_5_0 = (mm) ((Object) stackIn_5_0);
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L3;
                  }
                }
                var4 = (int)(-((mm) (Object) stackIn_7_0).a(stackIn_7_1 != 0) * (double)this.field_B.field_z / 2.0 / 3.141592653589793);
                var5 = -this.field_B.field_A + var3_int;
                this.field_B.a(-this.field_B.field_z + var4, var5);
                if (var4 >= this.field_B.field_z + -640) {
                  break L2;
                } else {
                  this.field_B.a(var4, var5);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("ni.L(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void a(di param0, int param1) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int[] discarded$27 = null;
        int[] discarded$28 = null;
        int[] discarded$29 = null;
        int[] discarded$30 = null;
        eg discarded$31 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
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
        int[] var53 = null;
        int[] var54 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var22 = Pool.field_O;
        try {
          L0: {
            this.field_O = new eg[11];
            var3_int = 0;
            kj.field_b = var3_int;
            incrementValue$16 = var3_int;
            var3_int++;
            this.field_O[incrementValue$16] = eg.a(param0, "", "new_classic_table/floor_texture");
            eh.field_t = var3_int;
            tj.field_fb = var3_int;
            incrementValue$17 = var3_int;
            var3_int++;
            this.field_O[incrementValue$17] = eg.a(param0, "", "new_classic_table/floor_shadow");
            nd.field_m = var3_int;
            qr.field_d = var3_int;
            incrementValue$18 = var3_int;
            var3_int++;
            this.field_O[incrementValue$18] = eg.a(param0, "", "new_classic_table/class_leg");
            fc.field_c = var3_int;
            dp.field_l = var3_int;
            incrementValue$19 = var3_int;
            var3_int++;
            this.field_O[incrementValue$19] = eg.a(param0, "", "new_classic_table/class_hole_a");
            pf.field_k = var3_int;
            rb.field_a = var3_int;
            incrementValue$20 = var3_int;
            var3_int++;
            this.field_O[incrementValue$20] = eg.a(param0, "", "new_classic_table/class_hole_b");
            ch.field_G = var3_int;
            rg.field_u = var3_int;
            incrementValue$21 = var3_int;
            var3_int++;
            this.field_O[incrementValue$21] = eg.a(param0, "", "new_classic_table/class_corner");
            incrementValue$22 = var3_int;
            var3_int++;
            this.field_O[incrementValue$22] = eg.a(param0, "", "new_classic_table/class_side_a");
            incrementValue$23 = var3_int;
            var3_int++;
            this.field_O[incrementValue$23] = eg.a(param0, "", "new_classic_table/class_side_b");
            if (param1 < -43) {
              incrementValue$24 = var3_int;
              var3_int++;
              this.field_O[incrementValue$24] = eg.a(param0, "", "new_classic_table/class_side_c");
              af.field_e = var3_int;
              uk.field_l = var3_int;
              incrementValue$25 = var3_int;
              var3_int++;
              this.field_O[incrementValue$25] = eg.a(param0, "", "new_classic_table/classic_top_a");
              incrementValue$26 = var3_int;
              var3_int++;
              this.field_O[incrementValue$26] = eg.a(param0, "", "new_classic_table/classic_top_b");
              oo.field_I = var3_int;
              this.field_A = new jk();
              this.field_A.a(eg.a(param0, "", "cues/classic_cue"), (byte) -121);
              var4 = 0;
              L1: while (true) {
                if (var4 >= this.field_O.length) {
                  var5 = 2147483647;
                  var6 = -2147483648;
                  var7 = 2147483647;
                  var8 = -2147483648;
                  var9 = 2147483647;
                  var10 = -2147483648;
                  var4 = uk.field_l;
                  L2: while (true) {
                    if (var4 >= oo.field_I) {
                      var7 = -var8 + var7 * 2;
                      var5 = -var6 + var5 * 2;
                      var11 = (var6 + var5) / 2;
                      var12 = (var8 + var7) / 2;
                      var13 = var10;
                      var4 = 0;
                      L3: while (true) {
                        if (this.field_O.length <= var4) {
                          this.field_M = new int[this.field_O.length][3];
                          var4 = 0;
                          L4: while (true) {
                            if (this.field_O.length <= var4) {
                              var4 = kj.field_b;
                              L5: while (true) {
                                if (var4 >= eh.field_t) {
                                  var4 = tj.field_fb;
                                  L6: while (true) {
                                    if (nd.field_m <= var4) {
                                      decompiledRegionSelector0 = 1;
                                      break L0;
                                    } else {
                                      var40 = new eg[4];
                                      var14 = var40;
                                      var15 = var4;
                                      var16 = var14;
                                      var32 = this.field_O[var15];
                                      var54 = this.field_M[var15];
                                      var34 = var16;
                                      var19 = var34;
                                      var36 = a.a(true, new eg(var32, false, false, false, false));
                                      var47 = mj.a(-31121);
                                      var35 = var47;
                                      var20 = var35;
                                      var20[1] = 0 + var54[1];
                                      var20[0] = 0 + var54[0];
                                      var20[2] = var54[2] + 0;
                                      var19[0] = new eg(var32, false, false, false, false);
                                      var34[0].a(var47);
                                      var48 = mj.a(-31121);
                                      var37 = var48;
                                      var20 = var37;
                                      var20[1] = -(var54[1] - 0);
                                      var20[2] = 0 + var54[2];
                                      var20[0] = 0 + var54[0];
                                      var19[1] = new eg(var36, false, false, false, false);
                                      var34[1].a(var48);
                                      var49 = mj.a(-31121);
                                      var38 = var49;
                                      var20 = var38;
                                      var20[2] = 0 + var54[2];
                                      var20[1] = 0 + var54[1];
                                      var20[0] = var54[0] + 0;
                                      discarded$27 = dq.a((byte) -123, var49);
                                      var19[2] = new eg(var32, false, false, false, false);
                                      var34[2].a(var49);
                                      var50 = mj.a(-31121);
                                      var39 = var50;
                                      var20 = var39;
                                      var20[0] = var54[0] - 0;
                                      var20[1] = -(var54[1] + 0);
                                      var20[2] = 0 + var54[2];
                                      discarded$28 = dq.a((byte) -122, var50);
                                      var19[3] = new eg(var36, false, false, false, false);
                                      var34[3].a(var50);
                                      this.field_O[var4] = new eg(var40, 4);
                                      var4++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  var31 = new eg[4];
                                  var14 = var31;
                                  var15 = var4;
                                  var16 = var14;
                                  var23 = this.field_O[var15];
                                  var53 = this.field_M[var15];
                                  var25 = var16;
                                  var19 = var25;
                                  var27 = a.a(true, new eg(var23, false, false, false, false));
                                  var42 = mj.a(-31121);
                                  var26 = var42;
                                  var20 = var26;
                                  var20[1] = var53[1] + 0;
                                  var20[2] = var53[2] - 0;
                                  var20[0] = var53[0] + 0;
                                  var19[0] = new eg(var23, false, false, false, false);
                                  var25[0].a(var42);
                                  var43 = mj.a(-31121);
                                  var28 = var43;
                                  var20 = var28;
                                  var20[1] = -(0 + var53[1]);
                                  var20[0] = 0 + var53[0];
                                  var20[2] = var53[2] + 0;
                                  var19[1] = new eg(var27, false, false, false, false);
                                  var25[1].a(var43);
                                  var44 = mj.a(-31121);
                                  var29 = var44;
                                  var20 = var29;
                                  var20[1] = 0 + var53[1];
                                  var20[0] = var53[0] - 0;
                                  var20[2] = var53[2] - 0;
                                  discarded$29 = dq.a((byte) 45, var44);
                                  var19[2] = new eg(var23, false, false, false, false);
                                  var25[2].a(var44);
                                  var45 = mj.a(-31121);
                                  var30 = var45;
                                  var20 = var30;
                                  var20[2] = 0 + var53[2];
                                  var20[1] = -(var53[1] + 0);
                                  var20[0] = var53[0] + 0;
                                  discarded$30 = dq.a((byte) 75, var45);
                                  var19[3] = new eg(var27, false, false, false, false);
                                  var25[3].a(var45);
                                  this.field_O[var4] = new eg(var31, 4);
                                  var4++;
                                  continue L5;
                                }
                              }
                            } else {
                              ln.a(this.field_M[var4], 0, this.field_O[var4]);
                              var4++;
                              continue L4;
                            }
                          }
                        } else {
                          discarded$31 = cq.a(var11, 59, var13, this.field_O[var4], var12);
                          var4++;
                          continue L3;
                        }
                      }
                    } else {
                      L7: {
                        d.a(this.field_O[var4], -23109);
                        if (var5 <= this.field_O[var4].field_D) {
                          break L7;
                        } else {
                          var5 = this.field_O[var4].field_D;
                          break L7;
                        }
                      }
                      L8: {
                        if (this.field_O[var4].field_w <= var6) {
                          break L8;
                        } else {
                          var6 = this.field_O[var4].field_w;
                          break L8;
                        }
                      }
                      L9: {
                        if (this.field_O[var4].field_y < var7) {
                          var7 = this.field_O[var4].field_y;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (this.field_O[var4].field_x <= var10) {
                          break L10;
                        } else {
                          var10 = this.field_O[var4].field_x;
                          break L10;
                        }
                      }
                      L11: {
                        if (this.field_O[var4].field_S > var8) {
                          var8 = this.field_O[var4].field_S;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      if (this.field_O[var4].field_V < var9) {
                        var9 = this.field_O[var4].field_V;
                        var4++;
                        continue L2;
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  db.a(0, this.field_O[var4]);
                  var4++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var3);
            stackOut_36_1 = new StringBuilder().append("ni.KA(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L12;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L12;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(cf param0, int param1) {
        try {
            this.field_X = param0.a("ball_hard", true, "");
            this.field_Q = param0.a("ball_soft", true, "");
            this.field_fb = param0.a("cue_hard", true, "");
            int var3_int = 84 / ((param1 - 39) / 38);
            this.field_W = param0.a("cue_soft", true, "");
            this.field_Y = param0.a("pot_ball_pocket", true, "");
            this.field_db = param0.a("pot_ball_mechanism", true, "");
            this.field_cb = param0.a("respot_the_white", true, "");
            this.field_V = param0.a("cushion", true, "");
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ni.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void f(byte param0) {
        int var2 = Pool.field_O;
        if (param0 != -119) {
            field_eb = (he) null;
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
        this.field_E = 1508.0;
        this.field_p = 1.5707963705062866;
        this.field_d = 64;
        this.field_x = 85;
        this.field_C = 64;
        this.field_j = 1.7627825736999512;
        this.field_m = 85;
        this.b(126);
    }

    static {
        field_eb = new he();
        field_ib = null;
        field_S = "No highscores";
    }
}
