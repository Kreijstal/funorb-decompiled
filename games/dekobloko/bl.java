/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bl extends kf {
    static int field_T;
    boolean field_S;
    private ka field_ab;
    static String field_W;
    static fd field_U;
    static w field_Y;
    private int field_V;
    static char[] field_Z;
    static String field_X;

    private final int a(int param0) {
        return !this.field_S ? 0 : this.field_ab.g((byte) -83) == this ? 256 : 0;
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param0 <= 92) {
            discarded$0 = this.h((byte) -10);
        }
        this.b(param2, param1, cf.field_f + -param1 >> 1, -param2 + vd.field_n >> 1, -16555);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_V == 0) {
          return;
        } else {
          if (256 <= this.field_V) {
            if (param2 != 0) {
              return;
            } else {
              this.b(-128, param3 - -this.field_D, param0 - -this.field_u);
              super.a(param0, -122, param2, param3);
              return;
            }
          } else {
            L0: {
              L1: {
                if (null == si.field_n) {
                  break L1;
                } else {
                  if (this.field_t > si.field_n.field_I) {
                    break L1;
                  } else {
                    if (this.field_y > si.field_n.field_H) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              si.field_n = new ck(this.field_t, this.field_y);
              break L0;
            }
            L2: {
              tb.a(true, si.field_n);
              hk.b();
              this.b(-128, 0, 0);
              super.a(-this.field_u + -param0, -116, param2, -param3 + -this.field_D);
              mk.a((byte) -5);
              si.field_n.c(this.field_u + param0, this.field_D + param3, this.field_V);
              if (param1 < -103) {
                break L2;
              } else {
                this.field_V = -41;
                break L2;
              }
            }
            return;
          }
        }
    }

    bl(ka param0, int param1, int param2) {
        super(-param1 + cf.field_f >> 1, vd.field_n - param2 >> 1, param1, param2, (gl) null);
        try {
            this.field_S = false;
            this.field_V = 0;
            this.field_ab = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ce e(byte param0) {
        ce var2 = super.e(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (ce) (this);
    }

    final static void a(int param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        String[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        String[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        String[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        String stackIn_32_2 = null;
        String[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        String[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String stackIn_38_2 = null;
        int stackIn_87_0 = 0;
        String stackIn_87_1 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_89_0 = 0;
        String stackIn_89_1 = null;
        int stackIn_89_2 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        String[] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        String[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String stackOut_37_2 = null;
        String[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        String stackOut_36_2 = null;
        String[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        String[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        String stackOut_31_2 = null;
        String[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        String stackOut_30_2 = null;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_86_0 = 0;
        String stackOut_86_1 = null;
        int stackOut_88_0 = 0;
        String stackOut_88_1 = null;
        int stackOut_88_2 = 0;
        int stackOut_87_0 = 0;
        String stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              fj.field_e = true;
              bc.field_B = param1;
              if (bc.field_B == 0) {
                var3_int = te.a(df.field_X, 124, om.field_a, vg.field_I, rk.field_R);
                var4 = 3 + var3_int;
                rk.field_P = new String[var4];
                k.field_g = new int[var4];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4) {
                    qf.field_i = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var3_int <= var5) {
                        rk.field_P[var4 - 3] = "";
                        rk.field_P[-2 + var4] = me.field_C;
                        k.field_g[var4 + -2] = 0;
                        qf.field_i[0] = 4;
                        rk.field_P[-1 + var4] = og.field_gb;
                        k.field_g[-1 + var4] = 1;
                        qf.field_i[1] = 5;
                        break L1;
                      } else {
                        rk.field_P[var5] = vg.field_I[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    k.field_g[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (bc.field_B == 1) {
                  var3_int = te.a(df.field_X, 96, om.field_a, vg.field_I, rk.field_R);
                  var4 = var3_int + 2;
                  k.field_g = new int[var4];
                  rk.field_P = new String[var4];
                  var5 = 0;
                  L4: while (true) {
                    if (var4 <= var5) {
                      qf.field_i = new int[1];
                      var5 = 0;
                      L5: while (true) {
                        if (var5 >= var3_int) {
                          rk.field_P[-2 + var4] = "";
                          rk.field_P[-1 + var4] = og.field_gb;
                          k.field_g[-1 + var4] = 0;
                          qf.field_i[0] = 5;
                          break L1;
                        } else {
                          rk.field_P[var5] = vg.field_I[var5];
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      k.field_g[var5] = -1;
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  if (bc.field_B != 2) {
                    if (bc.field_B == 3) {
                      L6: {
                        if (!lf.field_e.field_a) {
                          var3_int = te.a(si.field_c, 81, om.field_a, vg.field_I, rk.field_R);
                          break L6;
                        } else {
                          var3_int = te.a(rb.field_a, 99, om.field_a, vg.field_I, rk.field_R);
                          break L6;
                        }
                      }
                      var4 = 2 - -var3_int;
                      rk.field_P = new String[var4];
                      k.field_g = new int[var4];
                      var5 = 0;
                      L7: while (true) {
                        if (var5 >= var4) {
                          qf.field_i = new int[1];
                          var5 = 0;
                          L8: while (true) {
                            if (var5 >= var3_int) {
                              rk.field_P[var4 - 2] = "";
                              rk.field_P[var4 + -1] = og.field_gb;
                              k.field_g[-1 + var4] = 0;
                              qf.field_i[0] = 5;
                              break L1;
                            } else {
                              rk.field_P[var5] = vg.field_I[var5];
                              var5++;
                              continue L8;
                            }
                          }
                        } else {
                          k.field_g[var5] = -1;
                          var5++;
                          continue L7;
                        }
                      }
                    } else {
                      if (bc.field_B == 4) {
                        var3_int = te.a(dc.field_g, 117, om.field_a, vg.field_I, rk.field_R);
                        var4 = 2 + var3_int;
                        k.field_g = new int[var4];
                        rk.field_P = new String[var4];
                        var5 = 0;
                        L9: while (true) {
                          if (var4 <= var5) {
                            qf.field_i = new int[1];
                            var5 = 0;
                            L10: while (true) {
                              if (var3_int <= var5) {
                                rk.field_P[-2 + var4] = "";
                                rk.field_P[var4 + -1] = og.field_gb;
                                k.field_g[-1 + var4] = 0;
                                qf.field_i[0] = 5;
                                break L1;
                              } else {
                                rk.field_P[var5] = vg.field_I[var5];
                                var5++;
                                continue L10;
                              }
                            }
                          } else {
                            k.field_g[var5] = -1;
                            var5++;
                            continue L9;
                          }
                        }
                      } else {
                        if (bc.field_B == 5) {
                          var3_int = te.a(gd.field_i, 76, om.field_a, vg.field_I, rk.field_R);
                          var4 = 3 + var3_int;
                          rk.field_P = new String[var4];
                          k.field_g = new int[var4];
                          var5 = 0;
                          L11: while (true) {
                            if (var5 >= var4) {
                              qf.field_i = new int[2];
                              var5 = 0;
                              L12: while (true) {
                                if (var3_int <= var5) {
                                  rk.field_P[-3 + var4] = "";
                                  rk.field_P[var4 + -2] = fj.field_c;
                                  k.field_g[-2 + var4] = 0;
                                  qf.field_i[0] = 3;
                                  rk.field_P[var4 + -1] = og.field_gb;
                                  k.field_g[-1 + var4] = 1;
                                  qf.field_i[1] = 5;
                                  break L1;
                                } else {
                                  rk.field_P[var5] = vg.field_I[var5];
                                  var5++;
                                  continue L12;
                                }
                              }
                            } else {
                              k.field_g[var5] = -1;
                              var5++;
                              continue L11;
                            }
                          }
                        } else {
                          throw new IllegalArgumentException();
                        }
                      }
                    }
                  } else {
                    var3_int = te.a(cm.a((byte) 91, de.field_ab, new String[]{"<br><%0><br>"}), 86, om.field_a, vg.field_I, rk.field_R);
                    var4 = -1;
                    var5 = 0;
                    L13: while (true) {
                      L14: {
                        if (var5 >= var3_int) {
                          break L14;
                        } else {
                          if (!"<%0>".equals(vg.field_I[var5])) {
                            var5++;
                            continue L13;
                          } else {
                            var4 = var5;
                            break L14;
                          }
                        }
                      }
                      if (var4 != -1) {
                        tg.field_g = new String[var4];
                        an.a(vg.field_I, 0, tg.field_g, 0, var4);
                        dh.field_b = new String[-1 + (var3_int + -var4)];
                        an.a(vg.field_I, 1 + var4, dh.field_b, 0, -var4 + var3_int + -1);
                        var4 = -1;
                        var3_int = te.a(cm.a((byte) 86, ga.field_d, new String[]{"<br><%0><br>"}), 112, om.field_a, vg.field_I, rk.field_R);
                        var5 = 0;
                        L15: while (true) {
                          L16: {
                            if (var5 >= var3_int) {
                              break L16;
                            } else {
                              if (!"<%0>".equals(vg.field_I[var5])) {
                                var5++;
                                continue L15;
                              } else {
                                var4 = var5;
                                break L16;
                              }
                            }
                          }
                          if (-1 != var4) {
                            L17: {
                              vb.field_U = new String[var4];
                              an.a(vg.field_I, 0, vb.field_U, 0, var4);
                              wb.field_Qb = new String[var3_int - (var4 + 1)];
                              an.a(vg.field_I, var4 - -1, wb.field_Qb, 0, -1 + (-var4 + var3_int));
                              if (tg.field_g.length >= vb.field_U.length) {
                                stackOut_20_0 = tg.field_g.length;
                                stackIn_21_0 = stackOut_20_0;
                                break L17;
                              } else {
                                stackOut_19_0 = vb.field_U.length;
                                stackIn_21_0 = stackOut_19_0;
                                break L17;
                              }
                            }
                            L18: {
                              var5 = stackIn_21_0;
                              if (dh.field_b.length < wb.field_Qb.length) {
                                stackOut_23_0 = wb.field_Qb.length;
                                stackIn_24_0 = stackOut_23_0;
                                break L18;
                              } else {
                                stackOut_22_0 = dh.field_b.length;
                                stackIn_24_0 = stackOut_22_0;
                                break L18;
                              }
                            }
                            var6 = stackIn_24_0;
                            var7 = var5 + (7 - -var6);
                            rk.field_P = new String[var7];
                            k.field_g = new int[var7];
                            var8 = 0;
                            L19: while (true) {
                              if (var7 <= var8) {
                                qf.field_i = new int[2];
                                rk.field_P[1] = i.field_g;
                                k.field_g[1] = 0;
                                rk.field_P[0] = tf.field_Z;
                                qf.field_i[0] = 5;
                                rk.field_P[2] = wi.field_a;
                                k.field_g[3] = 1;
                                rk.field_P[3] = sc.field_p;
                                rk.field_P[4] = uj.field_c;
                                qf.field_i[1] = 2;
                                rk.field_P[5] = "";
                                var8 = 0;
                                L20: while (true) {
                                  if (var8 >= var5) {
                                    rk.field_P[var5 + 6] = null;
                                    k.field_g[var5 + 6] = -2;
                                    var8 = 0;
                                    L21: while (true) {
                                      if (var8 >= var6) {
                                        di.field_F = ik.a(4);
                                        break L1;
                                      } else {
                                        L22: {
                                          stackOut_35_0 = rk.field_P;
                                          stackOut_35_1 = 7 - (-var5 - var8);
                                          stackIn_37_0 = stackOut_35_0;
                                          stackIn_37_1 = stackOut_35_1;
                                          stackIn_36_0 = stackOut_35_0;
                                          stackIn_36_1 = stackOut_35_1;
                                          if (wb.field_Qb.length <= var8) {
                                            stackOut_37_0 = (String[]) ((Object) stackIn_37_0);
                                            stackOut_37_1 = stackIn_37_1;
                                            stackOut_37_2 = "";
                                            stackIn_38_0 = stackOut_37_0;
                                            stackIn_38_1 = stackOut_37_1;
                                            stackIn_38_2 = stackOut_37_2;
                                            break L22;
                                          } else {
                                            stackOut_36_0 = (String[]) ((Object) stackIn_36_0);
                                            stackOut_36_1 = stackIn_36_1;
                                            stackOut_36_2 = wb.field_Qb[var8];
                                            stackIn_38_0 = stackOut_36_0;
                                            stackIn_38_1 = stackOut_36_1;
                                            stackIn_38_2 = stackOut_36_2;
                                            break L22;
                                          }
                                        }
                                        stackIn_38_0[stackIn_38_1] = stackIn_38_2;
                                        var8++;
                                        continue L21;
                                      }
                                    }
                                  } else {
                                    L23: {
                                      stackOut_29_0 = rk.field_P;
                                      stackOut_29_1 = var8 + 6;
                                      stackIn_31_0 = stackOut_29_0;
                                      stackIn_31_1 = stackOut_29_1;
                                      stackIn_30_0 = stackOut_29_0;
                                      stackIn_30_1 = stackOut_29_1;
                                      if (-var5 + (var8 - -vb.field_U.length) >= 0) {
                                        stackOut_31_0 = (String[]) ((Object) stackIn_31_0);
                                        stackOut_31_1 = stackIn_31_1;
                                        stackOut_31_2 = vb.field_U[-var5 + (vb.field_U.length + var8)];
                                        stackIn_32_0 = stackOut_31_0;
                                        stackIn_32_1 = stackOut_31_1;
                                        stackIn_32_2 = stackOut_31_2;
                                        break L23;
                                      } else {
                                        stackOut_30_0 = (String[]) ((Object) stackIn_30_0);
                                        stackOut_30_1 = stackIn_30_1;
                                        stackOut_30_2 = "";
                                        stackIn_32_0 = stackOut_30_0;
                                        stackIn_32_1 = stackOut_30_1;
                                        stackIn_32_2 = stackOut_30_2;
                                        break L23;
                                      }
                                    }
                                    stackIn_32_0[stackIn_32_1] = stackIn_32_2;
                                    var8++;
                                    continue L20;
                                  }
                                }
                              } else {
                                k.field_g[var8] = -1;
                                var8++;
                                continue L19;
                              }
                            }
                          } else {
                            throw new IllegalStateException();
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  }
                }
              }
            }
            L24: {
              if (param0 <= -8) {
                break L24;
              } else {
                field_U = (fd) null;
                break L24;
              }
            }
            k.field_f.field_l = qf.field_i.length;
            var3_int = 0;
            var4 = 0;
            L25: while (true) {
              if (var4 >= rk.field_P.length) {
                L26: {
                  if (bc.field_B != 2) {
                    break L26;
                  } else {
                    var10 = tg.field_g;
                    var5 = 0;
                    L27: while (true) {
                      if (var10.length <= var5) {
                        var11 = dh.field_b;
                        var5 = 0;
                        L28: while (true) {
                          if (var5 >= var11.length) {
                            break L26;
                          } else {
                            var13 = var11[var5];
                            var7 = si.a(false, var13, false);
                            if (var3_int < var7) {
                              var3_int = var7;
                              var5++;
                              continue L28;
                            } else {
                              var5++;
                              continue L28;
                            }
                          }
                        }
                      } else {
                        L29: {
                          var12 = var10[var5];
                          var7 = si.a(false, var12, false);
                          if (var7 > var3_int) {
                            var3_int = var7;
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        var5++;
                        continue L27;
                      }
                    }
                  }
                }
                ig.field_dc = (qk.field_m + pa.field_Y << 1) * k.field_f.field_l;
                ri.field_i = -(var3_int >> 1) + (var3_int + qk.field_d);
                ge.field_e = qk.field_d + -(var3_int >> 1);
                var4 = 0;
                L30: while (true) {
                  if (rk.field_P.length <= var4) {
                    fc.field_a = ul.field_d + -(ig.field_dc >> 1);
                    tj.field_jc = new int[rk.field_P.length][];
                    var4 = 0;
                    var5 = fc.field_a;
                    L31: while (true) {
                      if (rk.field_P.length <= var4) {
                        L32: {
                          if (bc.field_B != 2) {
                            k.field_f.a(0, 0, ub.a(bh.field_g, (byte) -81, pm.field_f), param2);
                            break L32;
                          } else {
                            k.field_f.a(-1, 0, -1, param2);
                            break L32;
                          }
                        }
                        break L0;
                      } else {
                        L33: {
                          var6 = k.field_g[var4];
                          if (var6 >= 0) {
                            var7 = si.a(false, rk.field_P[var4], true);
                            var5 = var5 + qk.field_m;
                            var8 = qk.field_d - (var7 >> 1);
                            tj.field_jc[var4] = new int[4];
                            tj.field_jc[var4][0] = var8 - mb.field_c;
                            tj.field_jc[var4][1] = var5;
                            tj.field_jc[var4][2] = var7 - -(mb.field_c << 1);
                            var5 = var5 + ((pa.field_Y << 1) + qk.field_m + cc.field_a);
                            tj.field_jc[var4][3] = cc.field_a + (pa.field_Y << 1);
                            break L33;
                          } else {
                            var5 = var5 + ke.field_d;
                            break L33;
                          }
                        }
                        var4++;
                        continue L31;
                      }
                    }
                  } else {
                    L34: {
                      stackOut_107_0 = ig.field_dc;
                      stackIn_109_0 = stackOut_107_0;
                      stackIn_108_0 = stackOut_107_0;
                      if (k.field_g[var4] < 0) {
                        stackOut_109_0 = stackIn_109_0;
                        stackOut_109_1 = ke.field_d;
                        stackIn_110_0 = stackOut_109_0;
                        stackIn_110_1 = stackOut_109_1;
                        break L34;
                      } else {
                        stackOut_108_0 = stackIn_108_0;
                        stackOut_108_1 = cc.field_a;
                        stackIn_110_0 = stackOut_108_0;
                        stackIn_110_1 = stackOut_108_1;
                        break L34;
                      }
                    }
                    ig.field_dc = stackIn_110_0 + stackIn_110_1;
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L35: {
                  stackOut_86_0 = 0;
                  stackOut_86_1 = rk.field_P[var4];
                  stackIn_88_0 = stackOut_86_0;
                  stackIn_88_1 = stackOut_86_1;
                  stackIn_87_0 = stackOut_86_0;
                  stackIn_87_1 = stackOut_86_1;
                  if (k.field_g[var4] < 0) {
                    stackOut_88_0 = stackIn_88_0;
                    stackOut_88_1 = (String) ((Object) stackIn_88_1);
                    stackOut_88_2 = 0;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    stackIn_89_2 = stackOut_88_2;
                    break L35;
                  } else {
                    stackOut_87_0 = stackIn_87_0;
                    stackOut_87_1 = (String) ((Object) stackIn_87_1);
                    stackOut_87_2 = 1;
                    stackIn_89_0 = stackOut_87_0;
                    stackIn_89_1 = stackOut_87_1;
                    stackIn_89_2 = stackOut_87_2;
                    break L35;
                  }
                }
                L36: {
                  var5 = si.a(stackIn_89_0 != 0, stackIn_89_1, stackIn_89_2 != 0);
                  if (var5 > var3_int) {
                    var3_int = var5;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                var4++;
                continue L25;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "bl.IC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        L0: {
          fl.a(130, 256, 16694016, mb.field_e, 80 + param0, w.field_kb);
          var2 = 145;
          kd.field_t.c(param0 + 82, var2, 18, 18);
          var2 = var2 + (16 + ga.a(188, 0, var2, nk.field_c, 16, 64, 16777215, se.field_S, (byte) -127, 0, param0 + 110) * 16);
          tg.a(true, 2).c(82 + param0, var2, 18, 18);
          stackOut_0_0 = var2;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (kd.field_p != 0) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 16;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        var2 = stackIn_3_0 + (stackIn_3_1 - -(ga.a(188, 0, var2, kb.field_e, 16, 64, 16777215, se.field_S, (byte) -127, 0, param0 + 110) * 16));
        vk.a(nf.field_e, param0 + 190, 3, gi.field_c, kk.field_n, var2, -22981);
        hk.g(309 - -param0, 117, 242, 263172);
        hk.g(310 - -param0, 117, 242, 6316128);
        fl.a(130, 256, 16694016, hg.field_d, 320 + param0, w.field_kb);
        var2 = 145;
        tg.a(true, 0).c(320 - -param0, var2, 18, 18);
        var2 = var2 + (16 * ga.a(212, 0, var2, dk.field_f, 16, 64, 16777215, se.field_S, (byte) -128, 0, 348 - -param0) + 16);
        fl.a(var2 - -14, 256, 16694016, kc.field_q, param0 + 320, w.field_kb);
        var2 += 29;
        tg.a(true, 3).c(param0 + 320, var2, 18, 18);
        var2 = var2 + (16 - -(ga.a(212, 0, var2, ki.field_u, 16, 64, 16777215, se.field_S, (byte) -128, 0, 348 - -param0) * 16));
    }

    boolean f(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          this.field_V = this.a(-10604);
          if (param0 >= 77) {
            break L0;
          } else {
            this.field_S = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != this.field_V) {
              break L2;
            } else {
              if (this.field_S) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    boolean h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var2 = this.a(-10604);
          var3 = var2 - this.field_V;
          if (param0 > 15) {
            break L0;
          } else {
            this.a(-126, -71, 58, -27);
            break L0;
          }
        }
        L1: {
          if (0 < var3) {
            this.field_V = this.field_V + (-1 + var3 - -8) / 8;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var3 < 0) {
            this.field_V = this.field_V + (1 + (-16 + var3)) / 16;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            if (this.field_V != 0) {
              break L4;
            } else {
              if (var2 != 0) {
                break L4;
              } else {
                if (this.field_S) {
                  break L4;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
            }
          }
          stackOut_12_0 = 0;
          stackIn_13_0 = stackOut_12_0;
          break L3;
        }
        return stackIn_13_0 != 0;
    }

    abstract void b(int param0, int param1, int param2);

    final static void g(byte param0) {
        bf.field_x = bg.a(true);
        ah.field_c = new ka();
        dd.a(true, true, (byte) 66);
    }

    public static void i(int param0) {
        field_Y = null;
        field_U = null;
        field_W = null;
        field_X = null;
        field_Z = null;
    }

    static {
        field_W = "Chat view has been scrolled up. Scroll down to chat.";
        field_Z = new char[128];
        field_X = "Back";
    }
}
