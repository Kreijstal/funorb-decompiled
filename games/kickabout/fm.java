/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm extends qt {
    private int field_B;
    static String field_A;
    static hd field_C;

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0) {
          L0: {
            field_A = (String) null;
            if (2 > tk.field_Ib) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (2 > tk.field_Ib) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, boolean param1) {
        hd var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var16;
        uo var18;
        int[] var21;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var10;
        int var11;
        String var12;
        int var13;
        int var14;
        int var15;
        var16 = Kickabout.field_G;
        super.a(param0, param1);
        on.a(vu.field_Ib.field_F, vu.field_Ib.field_T, vu.field_Ib.field_q, vu.field_Ib.field_mb, 8, 0, 96);
        on.a(-4 + bq.field_d.field_F, -4 + bq.field_d.field_T, 2 + bq.field_d.field_q, 4 + (bq.field_d.field_mb << -661942687), 8, 0, 128);
        bq.field_d.a(46, false);
        ub.field_D.a(97, false);
        vu.field_Ib.a(param0 + 84, false);
        pt.a(vu.field_Ib.field_F - -vu.field_Ib.field_q, param0 + -22909, vu.field_Ib.field_F, vu.field_Ib.field_mb + vu.field_Ib.field_T, vu.field_Ib.field_T);
        var3 = (hd) ((Object) vu.field_Ib.field_Db.field_jb.g(24009));
        L0: while (true) {
          if (var3 == null) {
            L1: {
              ta.e(117);
              var18 = pb.field_C;
              var21 = bh.field_f;
              if (0 == (pt.field_e ^ -1)) {
                stackIn_9_0 = ob.field_C;
                break L1;
              } else {
                stackIn_9_0 = pt.field_e;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_9_0;
              if (var5 == -1) {
                stackIn_12_0 = 0;
                break L2;
              } else {
                stackIn_12_0 = c.a(var5, 0, var21) ? 1 : 0;
                break L2;
              }
            }
            var6 = stackIn_12_0;
            var7 = 142 + this.field_j;
            var8 = 289;
            on.a(this.field_j + 8, 280, 120, 145, 8, 0, 148);
            var9 = 230;
            on.a(this.field_j + 135, 280, 244, 145, 8, 0, 148);
            if (-1 == var5) {
              if (!la.a(100)) {
                pb.field_C.a(rt.field_K, var7, 250, var9, 200, 16777215, -1, 1, 1, 0);
                return;
              } else {
                pb.field_C.a(sh.field_b, var7, 250, var9, 200, 16777215, -1, 1, 1, 0);
                return;
              }
            } else {
              L3: {
                if (var6 != 0) {
                  break L3;
                } else {
                  if (!pc.field_e) {
                    L4: {
                      if ((var5 ^ -1) != -33) {
                        break L4;
                      } else {
                        if (!jd.f(-1)) {
                          break L4;
                        } else {
                          L5: {
                            ra.field_L.c(5 - -this.field_j, 290);
                            var10 = var18.a('"' + kw.field_c[var5] + '"', var7, var8, var9, 80, 16776960, -1, 1, 0, 16);
                            var11 = var8 - -(var10 * 16) - -5;
                            if (var6 != 0) {
                              break L5;
                            } else {
                              q.field_d.d(bo.field_Db.toLowerCase(), (var9 >> 2023254369) + var7, var11 + 6, 16711680, -1);
                              var11 += 10;
                              break L5;
                            }
                          }
                          L6: {
                            var12 = lw.field_a[var5];
                            if (!th.field_a[var5]) {
                              break L6;
                            } else {
                              if (var6 != 0) {
                                break L6;
                              } else {
                                var12 = field_A;
                                break L6;
                              }
                            }
                          }
                          var11 += 16;
                          var13 = Math.max(var18.a(dh.field_l), var18.a(po.field_d)) - -30;
                          var18.c(dh.field_l, var7 - -var13, var11, 16777215, -1);
                          var18.a(Integer.toString(wc.field_g[var5]), 5 + var13 + var7, var11, 16777215, -1);
                          var11 += 18;
                          var18.c(po.field_d, var7 - -var13, var11, 16777215, -1);
                          var14 = wc.field_g[var5] / 100;
                          L7: while (true) {
                            if (-1 <= (var14 ^ -1)) {
                              L8: {
                                var11 += 9;
                                var14 = 16;
                                if (3 >= var18.b(var12, var9)) {
                                  break L8;
                                } else {
                                  var11 -= 4;
                                  var14 = 15;
                                  break L8;
                                }
                              }
                              var18.a(var12, var7, var11, var9, 200, 16777215, -1, 0, 0, var14);
                              return;
                            } else {
                              var15 = 5 * var14 + (var13 + (var7 - 2));
                              qs.field_R.f(var15, -14 + var11);
                              var14--;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                    pn.field_w.c(5 - -this.field_j, 290);
                    var10 = var18.a('"' + kw.field_c[var5] + '"', var7, var8, var9, 80, 16776960, -1, 1, 0, 16);
                    var11 = var8 - -(var10 * 16) - -5;
                    if (var6 != 0) {
                      L9: {
                        var12 = lw.field_a[var5];
                        if (!th.field_a[var5]) {
                          break L9;
                        } else {
                          if (var6 != 0) {
                            break L9;
                          } else {
                            var12 = field_A;
                            break L9;
                          }
                        }
                      }
                      var11 += 16;
                      var13 = Math.max(var18.a(dh.field_l), var18.a(po.field_d)) - -30;
                      var18.c(dh.field_l, var7 - -var13, var11, 16777215, -1);
                      var18.a(Integer.toString(wc.field_g[var5]), 5 + var13 + var7, var11, 16777215, -1);
                      var11 += 18;
                      var18.c(po.field_d, var7 - -var13, var11, 16777215, -1);
                      var14 = wc.field_g[var5] / 100;
                      L10: while (true) {
                        if (-1 <= (var14 ^ -1)) {
                          L11: {
                            var11 += 9;
                            var14 = 16;
                            if (3 >= var18.b(var12, var9)) {
                              break L11;
                            } else {
                              var11 -= 4;
                              var14 = 15;
                              break L11;
                            }
                          }
                          var18.a(var12, var7, var11, var9, 200, 16777215, -1, 0, 0, var14);
                          return;
                        } else {
                          var15 = 5 * var14 + (var13 + (var7 - 2));
                          qs.field_R.f(var15, -14 + var11);
                          var14--;
                          continue L10;
                        }
                      }
                    } else {
                      L12: {
                        q.field_d.d(bo.field_Db.toLowerCase(), (var9 >> 2023254369) + var7, var11 + 6, 16711680, -1);
                        var11 += 10;
                        var12 = lw.field_a[var5];
                        if (!th.field_a[var5]) {
                          break L12;
                        } else {
                          var12 = field_A;
                          break L12;
                        }
                      }
                      var11 += 16;
                      var13 = Math.max(var18.a(dh.field_l), var18.a(po.field_d)) - -30;
                      var18.c(dh.field_l, var7 - -var13, var11, 16777215, -1);
                      var18.a(Integer.toString(wc.field_g[var5]), 5 + var13 + var7, var11, 16777215, -1);
                      var11 += 18;
                      var18.c(po.field_d, var7 - -var13, var11, 16777215, -1);
                      var14 = wc.field_g[var5] / 100;
                      L13: while (true) {
                        if (-1 <= (var14 ^ -1)) {
                          L14: {
                            var11 += 9;
                            var14 = 16;
                            if (3 >= var18.b(var12, var9)) {
                              break L14;
                            } else {
                              var11 -= 4;
                              var14 = 15;
                              break L14;
                            }
                          }
                          var18.a(var12, var7, var11, var9, 200, 16777215, -1, 0, 0, var14);
                          return;
                        } else {
                          var15 = 5 * var14 + (var13 + (var7 - 2));
                          qs.field_R.f(var15, -14 + var11);
                          var14--;
                          continue L13;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
              }
              qe.field_i[iw.field_e[var5]].c(5 - -this.field_j, 290);
              var10 = var18.a('"' + kw.field_c[var5] + '"', var7, var8, var9, 80, 16776960, -1, 1, 0, 16);
              var11 = var8 - -(var10 * 16) - -5;
              if (var6 == 0) {
                L15: {
                  q.field_d.d(bo.field_Db.toLowerCase(), (var9 >> 2023254369) + var7, var11 + 6, 16711680, -1);
                  var11 += 10;
                  var12 = lw.field_a[var5];
                  if (!th.field_a[var5]) {
                    break L15;
                  } else {
                    var12 = field_A;
                    break L15;
                  }
                }
                var11 += 16;
                var13 = Math.max(var18.a(dh.field_l), var18.a(po.field_d)) - -30;
                var18.c(dh.field_l, var7 - -var13, var11, 16777215, -1);
                var18.a(Integer.toString(wc.field_g[var5]), 5 + var13 + var7, var11, 16777215, -1);
                var11 += 18;
                var18.c(po.field_d, var7 - -var13, var11, 16777215, -1);
                var14 = wc.field_g[var5] / 100;
                L16: while (true) {
                  if (-1 <= (var14 ^ -1)) {
                    L17: {
                      var11 += 9;
                      var14 = 16;
                      if (3 >= var18.b(var12, var9)) {
                        break L17;
                      } else {
                        var11 -= 4;
                        var14 = 15;
                        break L17;
                      }
                    }
                    var18.a(var12, var7, var11, var9, 200, 16777215, -1, 0, 0, var14);
                    return;
                  } else {
                    var15 = 5 * var14 + (var13 + (var7 - 2));
                    qs.field_R.f(var15, -14 + var11);
                    var14--;
                    continue L16;
                  }
                }
              } else {
                L18: {
                  var12 = lw.field_a[var5];
                  if (!th.field_a[var5]) {
                    break L18;
                  } else {
                    if (var6 != 0) {
                      break L18;
                    } else {
                      var12 = field_A;
                      break L18;
                    }
                  }
                }
                var11 += 16;
                var13 = Math.max(var18.a(dh.field_l), var18.a(po.field_d)) - -30;
                var18.c(dh.field_l, var7 - -var13, var11, 16777215, -1);
                var18.a(Integer.toString(wc.field_g[var5]), 5 + var13 + var7, var11, 16777215, -1);
                var11 += 18;
                var18.c(po.field_d, var7 - -var13, var11, 16777215, -1);
                var14 = wc.field_g[var5] / 100;
                L19: while (true) {
                  if (-1 <= (var14 ^ -1)) {
                    L20: {
                      var11 += 9;
                      var14 = 16;
                      if (3 >= var18.b(var12, var9)) {
                        break L20;
                      } else {
                        var11 -= 4;
                        var14 = 15;
                        break L20;
                      }
                    }
                    var18.a(var12, var7, var11, var9, 200, 16777215, -1, 0, 0, var14);
                    return;
                  } else {
                    var15 = 5 * var14 + (var13 + (var7 - 2));
                    qs.field_R.f(var15, -14 + var11);
                    var14--;
                    continue L19;
                  }
                }
              }
            }
          } else {
            L21: {
              if (var3 instanceof ej) {
                ((ej) ((Object) var3)).c(true);
                break L21;
              } else {
                break L21;
              }
            }
            var3 = (hd) ((Object) vu.field_Ib.field_Db.field_jb.c(33));
            continue L0;
          }
        }
    }

    final void b(int param0) {
        int var2;
        hd var3;
        int var4;
        hd stackIn_5_0 = null;
        var4 = Kickabout.field_G;
        bq.field_d = eo.a(false);
        ub.field_D = eo.a(true);
        var2 = 0;
        L0: while (true) {
          if (2 <= var2) {
            bq.field_d.field_lb = false;
            vu.field_Ib = new tk("Cabinet", ne.j((byte) 15), be.field_q, it.field_m);
            vu.field_Ib.a(16, 100, 4, (byte) -114, 200, 300, 70);
            if (param0 != -38) {
              fm.a(true);
              sj.field_g = true;
              return;
            } else {
              sj.field_g = true;
              return;
            }
          } else {
            L1: {
              if (-1 != (var2 ^ -1)) {
                stackIn_5_0 = ub.field_D;
                break L1;
              } else {
                stackIn_5_0 = bq.field_d;
                break L1;
              }
            }
            var3 = stackIn_5_0;
            var3.field_N.d();
            var3.field_vb.d();
            var3.field_r.d();
            var3.field_t.d();
            var2++;
            continue L0;
          }
        }
    }

    public static void g(byte param0) {
        int var1 = 3 % ((param0 - -3) / 32);
        field_A = null;
        field_C = null;
    }

    final void a(byte param0, boolean param1) {
        int var4 = 0;
        hd var5 = null;
        int var6 = Kickabout.field_G;
        super.a((byte) 101, param1);
        bq.field_d.a(true, 32, 310 + this.field_j, 144, 32);
        int var3 = 41 % ((param0 - 38) / 60);
        ub.field_D.a(true, 32, this.field_j - -310, 176, 32);
        vu.field_Ib.a(true, 300, 45 + this.field_j, 70, 200);
        if (0 < this.field_B) {
            this.field_B = this.field_B - 1;
            var4 = vu.field_Ib.field_Db.field_J;
            vu.field_Ib.b(0, param1);
            bq.field_d.b(0, param1);
            ub.field_D.b(0, param1);
            ob.field_C = -1;
            var5 = (hd) ((Object) vu.field_Ib.field_Db.field_jb.g(24009));
            while (var5 != null) {
                if (var5 instanceof ej) {
                    ((ej) ((Object) var5)).a(param1, -60);
                }
                var5 = (hd) ((Object) vu.field_Ib.field_Db.field_jb.c(33));
            }
            this.e(-1);
            if (vu.field_Ib.field_Db.field_J <= var4) {
                if (var4 <= vu.field_Ib.field_Db.field_J) {
                    return;
                }
                if (-1 == (this.field_B ^ -1)) {
                    sp.c(60, -100);
                    this.field_B = 8;
                    return;
                }
                return;
            }
            if (-1 != (this.field_B ^ -1)) {
                if (var4 > vu.field_Ib.field_Db.field_J) {
                    if (-1 != (this.field_B ^ -1)) {
                        return;
                    }
                    sp.c(60, -100);
                    this.field_B = 8;
                }
                return;
            }
            sp.c(59, 66);
            this.field_B = 8;
            if (var4 > vu.field_Ib.field_Db.field_J) {
                if (-1 != (this.field_B ^ -1)) {
                    return;
                }
                sp.c(60, -100);
                this.field_B = 8;
            }
            return;
        }
        var4 = vu.field_Ib.field_Db.field_J;
        vu.field_Ib.b(0, param1);
        bq.field_d.b(0, param1);
        ub.field_D.b(0, param1);
        ob.field_C = -1;
        var5 = (hd) ((Object) vu.field_Ib.field_Db.field_jb.g(24009));
        while (var5 != null) {
            if (var5 instanceof ej) {
                ((ej) ((Object) var5)).a(param1, -60);
            }
            var5 = (hd) ((Object) vu.field_Ib.field_Db.field_jb.c(33));
        }
        this.e(-1);
        if (vu.field_Ib.field_Db.field_J > var4 && -1 == (this.field_B ^ -1)) {
            sp.c(59, 66);
            this.field_B = 8;
            if (var4 > vu.field_Ib.field_Db.field_J) {
                if (-1 != (this.field_B ^ -1)) {
                    return;
                }
                sp.c(60, -100);
                this.field_B = 8;
            }
            return;
        }
        if (var4 > vu.field_Ib.field_Db.field_J) {
            if (-1 != (this.field_B ^ -1)) {
                return;
            }
            sp.c(60, -100);
            this.field_B = 8;
        }
    }

    private final void e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var8 = Kickabout.field_G;
          var2 = 0;
          var3 = 0;
          if (bq.field_d.field_qb == 1) {
            L1: {
              if (0 == ha.field_I % 2) {
                var2 = 1;
                vu.field_Ib.field_Db.field_v = vu.field_Ib.field_Db.field_v + 16;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = 1;
            ha.field_I = ha.field_I + 1;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (-2 == (ub.field_D.field_qb ^ -1)) {
            L3: {
              var3 = 1;
              if (-1 != (ha.field_I % 2 ^ -1)) {
                break L3;
              } else {
                vu.field_Ib.field_Db.field_v = vu.field_Ib.field_Db.field_v - 16;
                var2 = 1;
                break L3;
              }
            }
            ha.field_I = ha.field_I + 1;
            break L2;
          } else {
            break L2;
          }
        }
        L4: {
          var4 = id.field_v;
          if ((var4 ^ -1) == param0) {
            break L4;
          } else {
            if (vu.field_Ib.field_gb) {
              vu.field_Ib.field_Db.field_v = vu.field_Ib.field_Db.field_v - 16 * var4;
              var2 = 1;
              break L4;
            } else {
              L5: {
                if (var3 == 0) {
                  ha.field_I = 0;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (var2 != 0) {
                L6: {
                  var5 = vu.field_Ib.field_Db.field_J;
                  var6 = vu.field_Ib.field_Db.field_v;
                  if ((-(var5 + var6) ^ -1) <= -1) {
                    bq.field_d.field_lb = true;
                    break L6;
                  } else {
                    bq.field_d.field_lb = false;
                    vu.field_Ib.field_Db.field_v = -var5;
                    break L6;
                  }
                }
                var7 = vu.field_Ib.field_Db.field_mb;
                if (-(var6 + var5) <= vu.field_Ib.field_Db.field_L + (var7 - vu.field_Ib.field_Gb.field_mb)) {
                  ub.field_D.field_lb = true;
                  return;
                } else {
                  vu.field_Ib.field_Db.field_v = -var5 + -(-vu.field_Ib.field_Gb.field_mb + (vu.field_Ib.field_Db.field_L + var7));
                  ub.field_D.field_lb = false;
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        L7: {
          if (var3 == 0) {
            ha.field_I = 0;
            break L7;
          } else {
            break L7;
          }
        }
        if (var2 != 0) {
          var5 = vu.field_Ib.field_Db.field_J;
          var6 = vu.field_Ib.field_Db.field_v;
          if ((-(var5 + var6) ^ -1) <= -1) {
            bq.field_d.field_lb = true;
            var7 = vu.field_Ib.field_Db.field_mb;
            if (-(var6 + var5) <= vu.field_Ib.field_Db.field_L + (var7 - vu.field_Ib.field_Gb.field_mb)) {
              ub.field_D.field_lb = true;
              return;
            } else {
              vu.field_Ib.field_Db.field_v = -var5 + -(-vu.field_Ib.field_Gb.field_mb + (vu.field_Ib.field_Db.field_L + var7));
              ub.field_D.field_lb = false;
              return;
            }
          } else {
            bq.field_d.field_lb = false;
            vu.field_Ib.field_Db.field_v = -var5;
            var7 = vu.field_Ib.field_Db.field_mb;
            if (-(var6 + var5) <= vu.field_Ib.field_Db.field_L + (var7 - vu.field_Ib.field_Gb.field_mb)) {
              ub.field_D.field_lb = true;
              return;
            } else {
              vu.field_Ib.field_Db.field_v = -var5 + -(-vu.field_Ib.field_Gb.field_mb + (vu.field_Ib.field_Db.field_L + var7));
              ub.field_D.field_lb = false;
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        pt.field_e = -1;
        ob.field_C = -1;
    }

    final static int a(byte param0, int param1) {
        if (param0 != -27) {
          fm.a(true);
          return 88080384 - -(100 * param1 + 500 << -148246288);
        } else {
          return 88080384 - -(100 * param1 + 500 << -148246288);
        }
    }

    final static gg a(String param0, int param1) {
        String var2 = null;
        gg var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        gg stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (ni.field_m != null) {
              L1: {
                var6 = (CharSequence) ((Object) param0);
                var2 = mo.a(0, var6);
                if (param1 == 145) {
                  break L1;
                } else {
                  field_C = (hd) null;
                  break L1;
                }
              }
              L2: {
                if (var2 == null) {
                  var2 = param0;
                  break L2;
                } else {
                  break L2;
                }
              }
              var3 = (gg) ((Object) ni.field_m.a(-3611, (long)var2.hashCode()));
              L3: while (true) {
                if (var3 != null) {
                  L4: {
                    var7 = (CharSequence) ((Object) var3.field_Gb);
                    var4 = mo.a(0, var7);
                    if (var4 == null) {
                      var4 = var3.field_Gb;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var4.equals(var2)) {
                    stackIn_18_0 = (gg) (var3);
                    break L0;
                  } else {
                    var3 = (gg) ((Object) ni.field_m.a((byte) 117));
                    continue L3;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2_ref);

            stackIn_23_1 = new StringBuilder().append("fm.I(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    final int a(int param0, int param1) {
        int var3 = 14 / ((param0 - -49) / 52);
        return super.a(-116, param1);
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        try {
            super.a(param0, param1, -70, param3);
            bq.field_d.a(true, 32, 310 + this.field_j, 144, 32);
            ub.field_D.a(true, 32, 310 + this.field_j, 176, 32);
            vu.field_Ib.a(true, 300, this.field_j - -45, 70, 200);
            bq.field_d.b(0, false);
            ub.field_D.b(0, false);
            vu.field_Ib.b(0, false);
            if (param2 >= -28) {
                field_C = (hd) null;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "fm.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(int param0, int param1) {
        if (la.a(100)) {
          if (param0 != 0) {
            if ((param0 ^ -1) != -2) {
              if (param1 != -22667) {
                this.a((byte) 31, false);
                return super.b(param0, -22667);
              } else {
                return super.b(param0, -22667);
              }
            } else {
              return 340 + -(this.field_i[1].field_d >> 1450914817);
            }
          } else {
            return (this.field_i[0].field_d >> -1693998303) + 25;
          }
        } else {
          if (param1 != -22667) {
            this.a((byte) 31, false);
            return super.b(param0, -22667);
          } else {
            return super.b(param0, -22667);
          }
        }
    }

    fm() {
        this.field_B = 0;
    }

    static {
        field_A = "This is a secret achievement.";
    }
}
