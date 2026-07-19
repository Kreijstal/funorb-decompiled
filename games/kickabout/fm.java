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
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            field_A = (String) null;
            if (2 > tk.field_Ib) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (2 > tk.field_Ib) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, boolean param1) {
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int discarded$12 = 0;
        int discarded$13 = 0;
        hd var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        uo var18 = null;
        int[] var21 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        boolean stackOut_10_0 = false;
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
                stackOut_8_0 = ob.field_C;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_7_0 = pt.field_e;
                stackIn_9_0 = stackOut_7_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_9_0;
              if (var5 == -1) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              } else {
                stackOut_10_0 = c.a(var5, 0, var21);
                stackIn_12_0 = stackOut_10_0 ? 1 : 0;
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
                discarded$7 = pb.field_C.a(rt.field_K, var7, 250, var9, 200, 16777215, -1, 1, 1, 0);
                return;
              } else {
                discarded$8 = pb.field_C.a(sh.field_b, var7, 250, var9, 200, 16777215, -1, 1, 1, 0);
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
                              discarded$9 = var18.a(var12, var7, var11, var9, 200, 16777215, -1, 0, 0, var14);
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
                          discarded$10 = var18.a(var12, var7, var11, var9, 200, 16777215, -1, 0, 0, var14);
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
                          discarded$11 = var18.a(var12, var7, var11, var9, 200, 16777215, -1, 0, 0, var14);
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
                    discarded$12 = var18.a(var12, var7, var11, var9, 200, 16777215, -1, 0, 0, var14);
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
                    discarded$13 = var18.a(var12, var7, var11, var9, 200, 16777215, -1, 0, 0, var14);
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
        boolean discarded$2 = false;
        int var2 = 0;
        hd var3 = null;
        int var4 = 0;
        hd stackIn_5_0 = null;
        hd stackOut_4_0 = null;
        hd stackOut_3_0 = null;
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
              discarded$2 = fm.a(true);
              sj.field_g = true;
              return;
            } else {
              sj.field_g = true;
              return;
            }
          } else {
            L1: {
              if (-1 != (var2 ^ -1)) {
                stackOut_4_0 = ub.field_D;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = bq.field_d;
                stackIn_5_0 = stackOut_3_0;
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
        wh discarded$7 = null;
        wh discarded$8 = null;
        wh discarded$9 = null;
        wh discarded$10 = null;
        wh discarded$11 = null;
        wh discarded$12 = null;
        wh discarded$13 = null;
        int var3 = 0;
        int var4 = 0;
        hd var5 = null;
        int var6 = 0;
        var6 = Kickabout.field_G;
        super.a((byte) 101, param1);
        bq.field_d.a(true, 32, 310 + this.field_j, 144, 32);
        var3 = 41 % ((param0 - 38) / 60);
        ub.field_D.a(true, 32, this.field_j - -310, 176, 32);
        vu.field_Ib.a(true, 300, 45 + this.field_j, 70, 200);
        if (0 >= this.field_B) {
          var4 = vu.field_Ib.field_Db.field_J;
          vu.field_Ib.b(0, param1);
          bq.field_d.b(0, param1);
          ub.field_D.b(0, param1);
          ob.field_C = -1;
          var5 = (hd) ((Object) vu.field_Ib.field_Db.field_jb.g(24009));
          L0: while (true) {
            if (var5 == null) {
              L1: {
                this.e(-1);
                if (vu.field_Ib.field_Db.field_J <= var4) {
                  break L1;
                } else {
                  if (-1 != (this.field_B ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      discarded$7 = sp.c(59, 66);
                      this.field_B = 8;
                      if (var4 <= vu.field_Ib.field_Db.field_J) {
                        break L2;
                      } else {
                        if (-1 == (this.field_B ^ -1)) {
                          discarded$8 = sp.c(60, -100);
                          this.field_B = 8;
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              L3: {
                if (var4 <= vu.field_Ib.field_Db.field_J) {
                  break L3;
                } else {
                  if (-1 == (this.field_B ^ -1)) {
                    discarded$9 = sp.c(60, -100);
                    this.field_B = 8;
                    break L3;
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              L4: {
                if (!(var5 instanceof ej)) {
                  break L4;
                } else {
                  ((ej) ((Object) var5)).a(param1, -60);
                  break L4;
                }
              }
              var5 = (hd) ((Object) vu.field_Ib.field_Db.field_jb.c(33));
              continue L0;
            }
          }
        } else {
          this.field_B = this.field_B - 1;
          var4 = vu.field_Ib.field_Db.field_J;
          vu.field_Ib.b(0, param1);
          bq.field_d.b(0, param1);
          ub.field_D.b(0, param1);
          ob.field_C = -1;
          var5 = (hd) ((Object) vu.field_Ib.field_Db.field_jb.g(24009));
          L5: while (true) {
            if (var5 == null) {
              this.e(-1);
              if (vu.field_Ib.field_Db.field_J > var4) {
                if (-1 == (this.field_B ^ -1)) {
                  L6: {
                    discarded$10 = sp.c(59, 66);
                    this.field_B = 8;
                    if (var4 <= vu.field_Ib.field_Db.field_J) {
                      break L6;
                    } else {
                      if (-1 == (this.field_B ^ -1)) {
                        discarded$11 = sp.c(60, -100);
                        this.field_B = 8;
                        break L6;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  L7: {
                    if (var4 <= vu.field_Ib.field_Db.field_J) {
                      break L7;
                    } else {
                      if (-1 == (this.field_B ^ -1)) {
                        discarded$12 = sp.c(60, -100);
                        this.field_B = 8;
                        break L7;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                if (var4 > vu.field_Ib.field_Db.field_J) {
                  if (-1 != (this.field_B ^ -1)) {
                    return;
                  } else {
                    discarded$13 = sp.c(60, -100);
                    this.field_B = 8;
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L8: {
                if (!(var5 instanceof ej)) {
                  break L8;
                } else {
                  ((ej) ((Object) var5)).a(param1, -60);
                  break L8;
                }
              }
              var5 = (hd) ((Object) vu.field_Ib.field_Db.field_jb.c(33));
              continue L5;
            }
          }
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        boolean discarded$2 = false;
        if (param0 != -27) {
          discarded$2 = fm.a(true);
          return 88080384 - -(100 * param1 + 500 << -148246288);
        } else {
          return 88080384 - -(100 * param1 + 500 << -148246288);
        }
    }

    final static gg a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        gg var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        gg stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        gg stackOut_17_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
                    stackOut_17_0 = (gg) (var3);
                    stackIn_18_0 = stackOut_17_0;
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
            stackOut_21_0 = (RuntimeException) (var2_ref);
            stackOut_21_1 = new StringBuilder().append("fm.I(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
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
              super.a(param0, param1, -70, param3);
              bq.field_d.a(true, 32, 310 + this.field_j, 144, 32);
              ub.field_D.a(true, 32, 310 + this.field_j, 176, 32);
              vu.field_Ib.a(true, 300, this.field_j - -45, 70, 200);
              bq.field_d.b(0, false);
              ub.field_D.b(0, false);
              vu.field_Ib.b(0, false);
              if (param2 < -28) {
                break L1;
              } else {
                field_C = (hd) null;
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
            stackOut_3_1 = new StringBuilder().append("fm.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
