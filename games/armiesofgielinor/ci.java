/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static int[] field_e;
    private dl field_d;
    static String field_b;
    private int field_a;
    static int[] field_c;
    static String[] field_f;

    private final void b(boolean param0, int param1, int param2) {
        int stackIn_34_0 = 0;
        int var4;
        String var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (-50 != (param1 ^ -1)) {
          L0: {
            L1: {
              var4 = kr.field_y[this.field_a][param1];
              if (var4 == 32) {
                break L1;
              } else {
                if ((var4 ^ -1) != -32) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (hi.field_j >= 2) {
              break L0;
            } else {
              return;
            }
          }
          L2: {
            L3: {
              var5 = this.e(var4, 29);
              var6 = nr.field_e.a(var5) / 2;
              var7 = this.a(true, param1);
              var8 = this.a(param1, -3858);
              var9 = this.a(param1, true);
              if (-18 == (var4 ^ -1)) {
                break L3;
              } else {
                if ((var4 ^ -1) != -19) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            var6 = kt.field_o[0].field_y + wd.field_b;
            break L2;
          }
          L4: {
            L5: {
              var10 = -var6 + var7 + var8 >> -1504903071;
              var11 = var10;
              if (var4 != 18) {
                break L5;
              } else {
                if (-4 == (og.field_m ^ -1)) {
                  var11 = var10 + -27;
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            if (18 != var4) {
              break L4;
            } else {
              if (og.field_m != 2) {
                break L4;
              } else {
                var11 = var10 - 30;
                break L4;
              }
            }
          }
          L6: {
            if (var4 != 17) {
              break L6;
            } else {
              if ((og.field_m ^ -1) != -3) {
                break L6;
              } else {
                var11 = 10 + var10;
                break L6;
              }
            }
          }
          L7: {
            if (param2 == 28115) {
              break L7;
            } else {
              this.f(93);
              break L7;
            }
          }
          L8: {
            if (param0) {
              fe.a(var5, var11, var9 + 25, field_e, true);
              break L8;
            } else {
              fe.a(var5, var11, 25 + var9, nd.field_b, true);
              break L8;
            }
          }
          L9: {
            var12 = this.b((byte) 84, param1);
            if (var12 <= -1) {
              break L9;
            } else {
              aw.field_m.f(var12, -2 + var9);
              break L9;
            }
          }
          L10: {
            L11: {
              if (var4 == 17) {
                break L11;
              } else {
                if (var4 != 18) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            L12: {
              var10 = var10 + wd.field_b;
              kt.field_o[0].g(var10, var9 + 5);
              if (17 == var4) {
                stackIn_34_0 = 100 * bp.field_e / 256;
                break L12;
              } else {
                stackIn_34_0 = te.field_n * 100 / 256;
                break L12;
              }
            }
            var13 = stackIn_34_0;
            qn.f(var10, 5 + var9, var10 + var13, var9 + 19);
            kt.field_o[1].g(var10, 5 + var9);
            qn.a();
            break L10;
          }
          return;
        } else {
          return;
        }
    }

    private final void g(int param0) {
        int var2 = io.a(i.field_Nb, (byte) 127) ? 1 : 0;
        int var3 = pq.field_f != null ? 1 : 0;
        if (var3 == 0) {
            if (!(var2 != 0)) {
                jt.field_a = 0;
                return;
            }
        }
        String var4 = pk.field_V;
        var4 = var4 + " " + ia.a(fo.a(param0 ^ 4800, ar.a(var2 != 0, false, (byte) -115, var3 != 0), new String[]{dv.field_r}), '#', param0 ^ 3, "<br><br>");
        fe.b(40, 180, 560, 150, io.field_m, nd.field_b, param0, 128);
        rs.field_n.a(var4, 80, 200, 480, 300, 16777215, -1, 1, 0, 30);
    }

    private final int d(int param0, int param1) {
        if (param0 != 12) {
            field_f = (String[]) null;
        }
        if ((this.field_a ^ -1) == -17) {
            return 20;
        }
        if ((this.field_a ^ -1) == -8 && null != kr.field_G) {
            return kr.field_G.a(param1, false);
        }
        if ((this.field_a ^ -1) == -8) {
            return 1;
        }
        if (-6 == (this.field_a ^ -1) && null != kr.field_E) {
            return kr.field_E.a(false, param1);
        }
        if (5 == this.field_a) {
            return 1;
        }
        return 30;
    }

    private final void c(boolean param0) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (1 == tr.field_A) {
            L1: {
              if (!wg.a(-33, db.a(true, 44), db.a(true, 159), u.a(384, (byte) 94), u.a(416, (byte) 94))) {
                break L1;
              } else {
                L2: {
                  tg.field_k = 1;
                  if (ih.field_p == null) {
                    break L2;
                  } else {
                    if (-1 == (tg.field_k ^ -1)) {
                      rl.field_A = 0;
                      ts.field_j = ih.field_p;
                      wj.field_q = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                ub.a((byte) 123, im.field_v[2]);
                break L1;
              }
            }
            if (!wg.a(-33, db.a(true, 171), db.a(true, 286), u.a(384, (byte) 94), u.a(416, (byte) 94))) {
              break L0;
            } else {
              tg.field_k = 0;
              ub.a((byte) 121, im.field_v[2]);
              break L0;
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (-1 == (rl.field_A ^ -1)) {
            var2 = 0;
            L4: while (true) {
              L5: {
                if (var2 >= 5) {
                  if (-3 == (tr.field_A ^ -1)) {
                    return;
                  } else {
                    var2 = (nr.field_e.a(ig.field_m) >> -1428691423) - -40;
                    if (!wg.a(-33, db.a(true, 620 - var2), db.a(true, 620), u.a(19, (byte) 94), u.a(e.field_b[0].field_v + 19, (byte) 94))) {
                      L6: {
                        if (-1 != (tg.field_k ^ -1)) {
                          if (tg.field_k == 1) {
                            L7: {
                              var3 = 0;
                              if (hh.field_c > 312) {
                                var3 = (hh.field_c - 312) * ou.field_c / 291;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              if (!wg.a(-33, db.a(param0, 34), db.a(param0, 292), u.a(64, (byte) 94), u.a(380, (byte) 94))) {
                                break L8;
                              } else {
                                discarded$0 = this.a(bm.field_D, true, var3, 0, 0, 97);
                                break L8;
                              }
                            }
                            L9: {
                              if (fa.field_j == 2) {
                                break L9;
                              } else {
                                if (wg.a(-33, db.a(true, 279), db.a(true, 293), u.a(68 - -ou.field_c, (byte) 94), u.a(60 - (-ou.field_c + -24), (byte) 94))) {
                                  fa.field_j = 2;
                                  qg.field_u = -ou.field_c + (-68 + ko.field_b);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            if (!wg.a(-33, db.a(true, 469), db.a(param0, 606), u.a(384, (byte) 94), u.a(416, (byte) 94))) {
                              if (wg.a(-33, db.a(param0, 469), db.a(param0, 606), u.a(334, (byte) 94), u.a(366, (byte) 94))) {
                                var4 = 0;
                                L10: while (true) {
                                  if (-6 >= (var4 ^ -1)) {
                                    return;
                                  } else {
                                    if (pg.field_d.field_d[var4] == -1) {
                                      pg.field_d.field_d[var4] = ev.field_d;
                                      ns.b(false);
                                      return;
                                    } else {
                                      var4++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            } else {
                              var4 = 4;
                              L11: while (true) {
                                if (-1 < (var4 ^ -1)) {
                                  break L6;
                                } else {
                                  if (pg.field_d.field_d[var4] == ev.field_d) {
                                    pg.field_d.field_d[var4] = -1;
                                    ns.b(false);
                                    return;
                                  } else {
                                    var4--;
                                    continue L11;
                                  }
                                }
                              }
                            }
                          } else {
                            break L3;
                          }
                        } else {
                          if (!wg.a(-33, db.a(true, 469), db.a(true, 606), u.a(384, (byte) 94), u.a(416, (byte) 94))) {
                            if (!ml.a(u.a(212, (byte) 94), db.a(true, 165), 20, false)) {
                              L12: {
                                if (ts.field_j.field_a == null) {
                                  if (ts.field_j.field_i == null) {
                                    break L12;
                                  } else {
                                    var3 = ts.field_j.field_i.length;
                                    var4 = 0;
                                    L13: while (true) {
                                      if (var4 >= var3) {
                                        break L12;
                                      } else {
                                        var5 = (int)(Math.sin(6.283185307179586 * (double)var4 / (double)var3) * 90.0) + 165;
                                        var6 = 212 - (int)(90.0 * Math.cos(6.283185307179586 * (double)var4 / (double)var3));
                                        if (!ml.a(u.a(var6, (byte) 94), db.a(true, var5), 20, false)) {
                                          var4++;
                                          continue L13;
                                        } else {
                                          ab.field_a = ev.field_d;
                                          ev.field_d = ts.field_j.field_i[var4];
                                          wj.field_q = 248;
                                          q.field_D = true;
                                          this.a((byte) 90, ev.field_d, (rg) null);
                                          ub.a((byte) 113, am.field_v[45]);
                                          ub.a((byte) 124, im.field_v[12]);
                                          return;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var3 = ts.field_j.field_a.length;
                                  var4 = 0;
                                  L14: while (true) {
                                    if (var3 <= var4) {
                                      break L12;
                                    } else {
                                      var5 = 165 - -(int)(Math.sin(6.283185307179586 * (double)var4 / (double)var3) * 90.0);
                                      var6 = 212 + -(int)(Math.cos(6.283185307179586 * (double)var4 / (double)var3) * 90.0);
                                      if (!ml.a(u.a(var6, (byte) 94), db.a(param0, var5), 20, false)) {
                                        var4++;
                                        continue L14;
                                      } else {
                                        vu.field_O = ts.field_j;
                                        ts.field_j = ts.field_j.field_a[var4];
                                        wj.field_q = 248;
                                        rl.field_A = 248;
                                        this.a((byte) 92, -1, ts.field_j);
                                        ub.a((byte) 79, am.field_v[42]);
                                        ab.field_a = ev.field_d;
                                        ev.field_d = -1;
                                        return;
                                      }
                                    }
                                  }
                                }
                              }
                              discarded$1 = this.a(ts.field_j, (byte) 83);
                              break L3;
                            } else {
                              if (null == ts.field_j.field_j) {
                                break L6;
                              } else {
                                vu.field_O = ts.field_j;
                                wj.field_q = 248;
                                rl.field_A = -248;
                                ts.field_j = ts.field_j.field_j;
                                this.a((byte) 51, -1, ts.field_j);
                                ub.a((byte) 118, am.field_v[43]);
                                ab.field_a = ev.field_d;
                                ev.field_d = -1;
                                return;
                              }
                            }
                          } else {
                            if (0 <= (ev.field_d ^ -1)) {
                              break L5;
                            } else {
                              L15: {
                                if (ev.field_d >= 135) {
                                  break L15;
                                } else {
                                  if (-251 >= (pg.field_d.field_a[ev.field_d] ^ -1)) {
                                    break L15;
                                  } else {
                                    if (!pg.field_d.a(uc.field_d[ev.field_d][0], (byte) 103)) {
                                      break L15;
                                    } else {
                                      vl.field_n.h(32161, 70);
                                      vl.field_n.b(true, ev.field_d + 2000);
                                      pg.field_d.field_a[ev.field_d] = pg.field_d.field_a[ev.field_d] + 1;
                                      this.a((byte) 48, ev.field_d, (rg) null);
                                      ub.a((byte) 58, im.field_v[2]);
                                      break L15;
                                    }
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      bv.a(true, -9, 1, 0);
                      ub.a((byte) 91, im.field_v[2]);
                      return;
                    }
                  }
                } else {
                  L16: {
                    stackIn_16_0 = u.a(98, (byte) 94);

                    stackIn_16_1 = db.a(true, 55 * var2 + 310 + 40);

                    stackIn_16_2 = 22;

                    if (param0) {
                      stackIn_17_0 = stackIn_16_0;
                      stackIn_17_1 = stackIn_16_1;
                      stackIn_17_2 = stackIn_16_2;
                      stackIn_17_3 = 0;
                      break L16;
                    } else {
                      stackIn_17_0 = stackIn_16_0;
                      stackIn_17_1 = stackIn_16_1;
                      stackIn_17_2 = stackIn_16_2;
                      stackIn_17_3 = 1;
                      break L16;
                    }
                  }
                  if (ml.a(stackIn_17_0, stackIn_17_1, stackIn_17_2, stackIn_17_3 != 0)) {
                    L17: {
                      if ((tr.field_A ^ -1) != -3) {
                        break L17;
                      } else {
                        if ((pg.field_d.field_d[var2] ^ -1) < 0) {
                          pg.field_d.field_d[var2] = -1;
                          ns.b(false);
                          ub.a((byte) 101, am.field_v[45]);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    }
                    if ((pg.field_d.field_d[var2] ^ -1) >= 0) {
                      break L5;
                    } else {
                      L18: {
                        if (hi.field_j < 2) {
                          break L18;
                        } else {
                          if (br.field_f[82]) {
                            hs.b(119, pg.field_d.field_d[var2]);
                            return;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L19: {
                        if (-1 == (tg.field_k ^ -1)) {
                          wj.field_q = 248;
                          ab.field_a = ev.field_d;
                          ev.field_d = pg.field_d.field_d[var2];
                          ih.field_p = ct.field_o[ev.field_d];
                          this.a((byte) 88, ev.field_d, (rg) null);
                          if (ts.field_j == ih.field_p) {
                            ub.a((byte) 31, am.field_v[42]);
                            break L19;
                          } else {
                            ub.a((byte) 127, am.field_v[44]);
                            break L19;
                          }
                        } else {
                          ab.field_a = ev.field_d;
                          ev.field_d = pg.field_d.field_d[var2];
                          ts.field_j = ct.field_o[ev.field_d];
                          this.a((byte) 96, ev.field_d, (rg) null);
                          break L19;
                        }
                      }
                      return;
                    }
                  } else {
                    var2++;
                    continue L4;
                  }
                }
              }
              return;
            }
          } else {
            break L3;
          }
        }
        L20: {
          if (1 == fa.field_j) {
            break L20;
          } else {
            if (wg.a(-33, db.a(true, 589), db.a(param0, 603), u.a(ep.field_o + 158, (byte) 94), u.a(150 - (-ep.field_o - 24), (byte) 94))) {
              qg.field_u = ko.field_b - (158 - -ep.field_o);
              fa.field_j = 1;
              break L20;
            } else {
              break L20;
            }
          }
        }
        L21: {
          if (param0) {
            break L21;
          } else {
            this.c(94);
            break L21;
          }
        }
    }

    private final void l(int param0) {
        wk stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        wk stackIn_13_0;
        int stackIn_13_1;
        int stackIn_13_2;
        int stackIn_13_3;
        int stackIn_18_0;
        int stackIn_18_1;
        int[] stackIn_18_2;
        int[] stackIn_18_3;
        String stackIn_18_4;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int[] stackIn_19_2 = null;
        int[] stackIn_19_3 = null;
        String stackIn_19_4 = null;
        int stackIn_19_5 = 0;
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          na.field_F = -1;
          if (null != ud.field_X) {
            break L0;
          } else {
            ud.field_X = new wk[pc.field_k.length];
            var2 = 0;
            L1: while (true) {
              if (pc.field_k.length <= var2) {
                break L0;
              } else {
                ud.field_X[var2] = hp.a(ah.field_a.field_b, pc.field_k[var2], mv.field_d, kf.b(param0, -6583));
                var2++;
                continue L1;
              }
            }
          }
        }
        fe.b(db.a(true, 30), u.a(50, (byte) 94), 580, 90, tb.field_j, jh.field_k, 0, 256);
        qn.f(db.a(true, 34), u.a(54, (byte) 94), db.a(true, 606), u.a(136, (byte) 94));
        var2 = 0;
        L2: while (true) {
          if (pc.field_k.length <= var2) {
            L3: {
              qn.a();
              fe.b(db.a(true, 30), u.a(150, (byte) 94), 270, 270, tb.field_j, jh.field_k, 0, 256);
              qn.f(db.a(true, 34), u.a(154, (byte) 94), db.a(true, 296), u.a(416, (byte) 94));
              if (pg.field_d.a(0) > ah.field_b) {
                break L3;
              } else {
                a.field_m[0].d(db.a(true, 10), u.a(130, (byte) 94), 310, 310, 256);
                break L3;
              }
            }
            L4: {
              stackIn_18_0 = u.a(165, (byte) 94);

              stackIn_18_1 = 1;

              stackIn_18_2 = pc.field_k[ah.field_b];

              stackIn_18_3 = ah.field_a.field_b;

              stackIn_18_4 = mv.field_d;

              if (pg.field_d.a(0) > ah.field_b) {
                stackIn_19_0 = stackIn_18_0;
                stackIn_19_1 = stackIn_18_1;
                stackIn_19_2 = (int[]) ((Object) stackIn_18_2);
                stackIn_19_3 = (int[]) ((Object) stackIn_18_3);
                stackIn_19_4 = (String) ((Object) stackIn_18_4);
                stackIn_19_5 = 0;
                break L4;
              } else {
                stackIn_19_0 = stackIn_18_0;
                stackIn_19_1 = stackIn_18_1;
                stackIn_19_2 = (int[]) ((Object) stackIn_18_2);
                stackIn_19_3 = (int[]) ((Object) stackIn_18_3);
                stackIn_19_4 = (String) ((Object) stackIn_18_4);
                stackIn_19_5 = 1;
                break L4;
              }
            }
            L5: {
              uh.a(stackIn_19_0, stackIn_19_1 != 0, stackIn_19_2, stackIn_19_3, stackIn_19_4, stackIn_19_5 != 0, db.a(true, 50));
              qn.a();
              fe.b(db.a(true, 310), u.a(150, (byte) 94), 300, 170, tb.field_j, jh.field_k, 0, 128);
              fe.b(db.a(true, 310), u.a(330, (byte) 94), 145, 90, tb.field_j, nd.field_b, 0, 128);
              fe.b(db.a(true, 320), u.a(370, (byte) 94), 125, 42, tb.field_j, jh.field_k, 0, 0);
              fe.c(ov.field_f, db.a(true, 382), u.a(366, (byte) 94), nd.field_b, true);
              fe.c(dd.a(pg.field_d.a((byte) 45), param0 ^ -23666), db.a(true, 382), u.a(406, (byte) 94), nd.field_b, true);
              if ((hi.field_j ^ -1) <= -3) {
                rs.field_n.c(pg.field_d.a((byte) 127) + "", db.a(true, 382), u.a(369, (byte) 94), 16777215, 0);
                break L5;
              } else {
                break L5;
              }
            }
            fe.b(db.a(true, 465), u.a(330, (byte) 94), 145, 40, tb.field_j, jh.field_k, 0, 128);
            fe.b(db.a(true, 465), u.a(380, (byte) 94), 145, 40, tb.field_j, jh.field_k, 0, 128);
            var2 = 0;
            var3 = 0;
            L6: while (true) {
              if (var3 > ah.field_b) {
                L7: {
                  var3 = -pg.field_d.field_j + -pg.field_d.field_c + var2;
                  fe.c(fo.a(4800, hf.field_e, new String[]{Integer.toString(1 + ah.field_b)}), db.a(true, 460), u.a(190, (byte) 94), nd.field_b, true);
                  if (pg.field_d.a(0) > ah.field_b) {
                    rs.field_n.a(fo.a(4800, gt.field_g, new String[]{this.c(-38, var2)}), db.a(true, 320), u.a(200, (byte) 94), 280, 170, 16777215, 0, 1, 0, 0);
                    break L7;
                  } else {
                    rs.field_n.a(fo.a(4800, hw.field_w, new String[]{this.c(param0 ^ 23558, var2), this.c(-38, var3)}), db.a(true, 320), u.a(200, (byte) 94), 280, 170, 16777215, 0, 1, 0, 0);
                    break L7;
                  }
                }
                L8: {
                  if (pg.field_d.a(param0 ^ param0) < at.field_c.length) {
                    fe.c(this.c(-38, at.field_c[ah.field_b]), db.a(true, 537), u.a(366, (byte) 94), nd.field_b, true);
                    if (pg.field_d.a(0) != ah.field_b) {
                      break L8;
                    } else {
                      if (pg.field_d.a((byte) 123) < at.field_c[pg.field_d.a(0)]) {
                        break L8;
                      } else {
                        if (!wg.a(-33, db.a(true, 469), db.a(true, 606), u.a(384, (byte) 94), u.a(416, (byte) 94))) {
                          fe.a(db.a(true, 469), u.a(384, (byte) 94), 137, 32, il.field_s, nd.field_b, 0, 0);
                          fe.c(wv.field_e, db.a(true, 537), u.a(416, (byte) 94), 0, true);
                          break L8;
                        } else {
                          fe.a(db.a(true, 469), u.a(384, (byte) 94), 137, 32, il.field_s, field_e, 0, 0);
                          na.field_F = 52;
                          fe.c(wv.field_e, db.a(true, 537), u.a(416, (byte) 94), 0, true);
                          break L8;
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                return;
              } else {
                var2 = var2 + at.field_c[var3];
                var3++;
                continue L6;
              }
            }
          } else {
            L9: {
              if (var2 != ah.field_b) {
                break L9;
              } else {
                go.field_e.f(db.a(true, 26 + 57 * var2), u.a(60, (byte) 94), 256);
                break L9;
              }
            }
            L10: {
              if (pg.field_d.a(0) > var2) {
                break L10;
              } else {
                go.field_e.f(db.a(true, var2 * 57 + 26), u.a(60, (byte) 94), 64);
                break L10;
              }
            }
            L11: {
              stackIn_12_0 = ud.field_X[var2];

              stackIn_12_1 = db.a(true, 34 + var2 * 57);

              stackIn_12_2 = u.a(64, (byte) 94);

              if (var2 >= pg.field_d.a(0)) {
                stackIn_13_0 = (wk) ((Object) stackIn_12_0);
                stackIn_13_1 = stackIn_12_1;
                stackIn_13_2 = stackIn_12_2;
                stackIn_13_3 = 0;
                break L11;
              } else {
                stackIn_13_0 = (wk) ((Object) stackIn_12_0);
                stackIn_13_1 = stackIn_12_1;
                stackIn_13_2 = stackIn_12_2;
                stackIn_13_3 = 256;
                break L11;
              }
            }
            ((wk) (Object) stackIn_13_0).g(stackIn_13_1, stackIn_13_2, stackIn_13_3);
            var2++;
            continue L2;
          }
        }
    }

    private final void f(int param0) {
        if (param0 >= -117) {
            return;
        }
        if (!(null == kr.field_G)) {
            kr.field_G.d((byte) -102);
        }
    }

    private final void b(boolean param0) {
        int var2;
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        if (eo.field_a != null) {
          L0: {
            if (158 < eo.field_a.field_v) {
              var2 = ep.field_o * (-155 + eo.field_a.field_v) / 137;
              qn.f(db.a(true, 589), u.a(157, (byte) 94), 14, 156, 2302755);
              mp.field_Jb.g(db.a(true, 590), u.a(158 + ep.field_o, (byte) 94));
              break L0;
            } else {
              qn.f(db.a(param0, 589), u.a(157, (byte) 94), 14, 156, 1250067);
              mp.field_Jb.g(db.a(param0, 590), u.a(158, (byte) 94), 128);
              break L0;
            }
          }
          L1: {
            if (param0) {
              break L1;
            } else {
              field_b = (String) null;
              break L1;
            }
          }
          L2: {
            if (eo.field_a == null) {
              break L2;
            } else {
              qn.f(db.a(true, 314), u.a(158, (byte) 94), db.a(param0, 606), u.a(311, (byte) 94));
              eo.field_a.g(db.a(true, 326), u.a(-var2 + 154, (byte) 94));
              break L2;
            }
          }
          L3: {
            if (1 != fa.field_j) {
              break L3;
            } else {
              if (ro.field_ub != 1) {
                fa.field_j = -1;
                break L3;
              } else {
                var3 = -158 - qg.field_u + ko.field_b;
                if (0 <= var3) {
                  if (var3 <= 137) {
                    ep.field_o = var3;
                    break L3;
                  } else {
                    ep.field_o = 137;
                    break L3;
                  }
                } else {
                  ep.field_o = 0;
                  break L3;
                }
              }
            }
          }
          qn.a();
          return;
        } else {
          return;
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int stackIn_17_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String var11_ref_String;
        int var12;
        String var13;
        int var14;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == 0) {
            break L0;
          } else {
            if ((param1 ^ -1) != -2) {
              return -1;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var4 = kr.field_D.b(this.field_a, 29);
          var5 = kr.field_D.a((byte) 119, this.field_a);
          var6 = -var4 + var5;
          var7 = kr.field_y[this.field_a].length;
          if (0 == var7) {
            break L1;
          } else {
            if (param2 < 0) {
              break L1;
            } else {
              if (param2 >= var7) {
                break L1;
              } else {
                L2: {
                  if (param0 < -48) {
                    break L2;
                  } else {
                    field_f = (String[]) null;
                    break L2;
                  }
                }
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (var9 >= var7) {
                    L4: {
                      var9 = (-var8 + var6) / var7;
                      if (0 != param1) {
                        stackIn_17_0 = param2 + 1;
                        break L4;
                      } else {
                        stackIn_17_0 = param2;
                        break L4;
                      }
                    }
                    var10 = stackIn_17_0;
                    var8 = 0;
                    var11 = 0;
                    L5: while (true) {
                      if (var10 <= var11) {
                        var11 = var8 + var9 * var10;
                        return var4 + var11;
                      } else {
                        var12 = kr.field_y[this.field_a][var11];
                        var13 = il.field_t[var12];
                        var8 = var8 + (nr.field_e.a(var13) >> -1665495775);
                        var11++;
                        continue L5;
                      }
                    }
                  } else {
                    var10 = kr.field_y[this.field_a][var9];
                    var11_ref_String = il.field_t[var10];
                    var8 = var8 + (nr.field_e.a(var11_ref_String) >> 105958881);
                    var9++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    private final void e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (kr.field_G != null) {
          L0: {
            if (kr.field_y == null) {
              break L0;
            } else {
              if (this.field_a < kr.field_y.length) {
                if (kr.field_y[this.field_a] == null) {
                  break L0;
                } else {
                  if (kr.field_y[this.field_a].length < this.field_d.field_k) {
                    return;
                  } else {
                    var2 = 0;
                    var4 = 103 / ((60 - param0) / 59);
                    var3 = 0;
                    var5 = 0;
                    L1: while (true) {
                      if (this.field_d.field_k <= var5) {
                        kr.field_G.a(this.f(true), var2 != 0, 100, this.field_d.field_h, var3 != 0, ij.field_y);
                        return;
                      } else {
                        if (kr.field_y[this.field_a][var5] == 22) {
                          L2: {
                            if (!this.a((byte) 107, var5)) {
                              stackIn_21_0 = 0;
                              break L2;
                            } else {
                              stackIn_21_0 = 1;
                              break L2;
                            }
                          }
                          var2 = stackIn_21_0;
                          var5++;
                          continue L1;
                        } else {
                          if (23 == kr.field_y[this.field_a][var5]) {
                            L3: {
                              if (!this.a((byte) 45, var5)) {
                                stackIn_17_0 = 0;
                                break L3;
                              } else {
                                stackIn_17_0 = 1;
                                break L3;
                              }
                            }
                            var3 = stackIn_17_0;
                            var5++;
                            continue L1;
                          } else {
                            var5++;
                            continue L1;
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
          }
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0) {
        int var2;
        int var4;
        int[] var5;
        int var6;
        Object var7;
        String[] var8;
        int[] var9;
        int var10;
        int var11;
        String var12;
        int var13;
        int[] var21;
        int[] var22;
        L0: {
          L1: {
            var13 = ArmiesOfGielinor.field_M ? 1 : 0;
            var2 = og.field_m;
            if (-1 < (og.field_m ^ -1)) {
              break L1;
            } else {
              if (og.field_m < jr.field_h.length) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = 0;
          break L0;
        }
        var21 = jr.field_h[var2];
        if (nw.g(126)) {
          this.b(320);
          return;
        } else {
          L2: {
            if (null == wp.field_z) {
              wp.field_z = km.a(0, 120, 10, 7);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var4 = 89;
            var5 = field_e;
            fe.c(sl.field_i, db.a(true, var21[0]), u.a(var4, (byte) 94), field_e, true);
            fe.c(ou.field_f, db.a(true, var21[1]), u.a(var4, (byte) 94), field_e, true);
            fe.c(ts.field_g, db.a(true, var21[2]), u.a(var4, (byte) 94), field_e, true);
            fe.c(vi.field_c, db.a(true, var21[3]), u.a(var4, (byte) 94), field_e, true);
            fe.c(hq.field_c, db.a(true, var21[4]), u.a(var4, (byte) 94), field_e, true);
            var4 = var4 + (8 + rs.field_n.field_H);
            var6 = -100 / ((15 - param0) / 42);
            if (wp.field_z.field_l) {
              if (wp.field_z.field_t == null) {
                var7 = ae.field_s;
                break L3;
              } else {
                var7 = wd.field_l;
                var8 = wp.field_z.field_t[nf.field_Mb];
                var9 = wp.field_z.field_n[nf.field_Mb];
                var10 = 0;
                var11 = 0;
                L4: while (true) {
                  if (10 <= var11) {
                    if (var10 == 0) {
                      var22 = nd.field_b;
                      this.a(var22, wp.field_z.field_k, -1, var4, wp.field_z.field_s, wp.field_z.field_m, 310, wp.field_z.field_r, mv.field_d);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    if (null != var8[var11]) {
                      L5: {
                        var5 = field_e;
                        var12 = var8[var11];
                        if (!gt.a(var12, (byte) 94)) {
                          break L5;
                        } else {
                          var5 = nd.field_b;
                          var10 = 1;
                          break L5;
                        }
                      }
                      var7 = null;
                      this.a(var5, var9[4 * var11 - -1], var11, var4, var9[4 * var11], var9[var11 * 4 - -3], 310, var9[4 * var11 + 2], var12);
                      var4 += 25;
                      var11++;
                      continue L4;
                    } else {
                      var4 += 25;
                      var11++;
                      continue L4;
                    }
                  }
                }
              }
            } else {
              var7 = fm.field_c;
              break L3;
            }
          }
          L6: {
            var4 = 275 + (rs.field_n.field_H + 110);
            if (var7 != null) {
              fe.c((String) (var7), qn.field_l / 2, qn.field_g / 2, field_e, true);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    private final int a(rg param0, boolean param1, int param2, int param3, int param4, int param5) {
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 > 34) {
                break L1;
              } else {
                field_f = (String[]) null;
                break L1;
              }
            }
            L2: {
              if (null == param0.field_a) {
                break L2;
              } else {
                var7_int = 0;
                L3: while (true) {
                  if (param0.field_a.length <= var7_int) {
                    break L2;
                  } else {
                    if (0 <= (param4 ^ -1)) {
                      break L2;
                    } else {
                      L4: {
                        if (param1) {
                          L5: {
                            if (0 == (param4 & 3)) {
                              break L5;
                            } else {
                              param4 = param4 + (-(3 & param4) + 4);
                              break L5;
                            }
                          }
                          param3 += 40;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      param4 = this.a(param0.field_a[var7_int], false, param2, param3, param4, 53);
                      var7_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
            L6: {
              if (null != param0.field_i) {
                var7_int = 0;
                L7: while (true) {
                  if (var7_int >= param0.field_i.length) {
                    break L6;
                  } else {
                    L8: {
                      if ((pg.field_d.field_a[param0.field_i[var7_int]] ^ -1) < -1) {
                        L9: {
                          var8 = 7 + param3 + ((param4 >> 1922603938) * 70 + -param2);
                          if (39 <= (var8 ^ -1)) {
                            break L9;
                          } else {
                            if ((var8 ^ -1) > -325) {
                              if (!ml.a(u.a(var8 + 60 + 23, (byte) 94), db.a(true, (param4 & 3) * 58 + 70), 22, false)) {
                                break L9;
                              } else {
                                ab.field_a = ev.field_d;
                                ev.field_d = param0.field_i[var7_int];
                                q.field_D = true;
                                ts.field_j = param0;
                                this.a((byte) 62, ev.field_d, (rg) null);
                                ub.a((byte) 59, am.field_v[45]);
                                ub.a((byte) 38, im.field_v[12]);
                                stackIn_24_0 = -1;
                                decompiledRegionSelector0 = 0;
                                break L0;
                              }
                            } else {
                              break L9;
                            }
                          }
                        }
                        param4++;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var7_int++;
                    continue L7;
                  }
                }
              } else {
                break L6;
              }
            }
            stackIn_28_0 = param4;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var7);

            stackIn_31_1 = new StringBuilder().append("ci.FA(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_24_0;
        } else {
          return stackIn_28_0;
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_174_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_308_0 = 0;
        int stackIn_309_0 = 0;
        int stackIn_309_1 = 0;
        int stackIn_336_0 = 0;
        int stackIn_337_0 = 0;
        int stackIn_337_1 = 0;
        int stackIn_345_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = kr.field_y[this.field_a][param2];
          if (this.field_d.d((byte) 124)) {
            ub.a((byte) 64, im.field_v[2]);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1 == 0) {
            break L1;
          } else {
            this.b(false);
            break L1;
          }
        }
        L2: {
          var6 = var4;
          if (0 == var6) {
            if (this.field_d.d((byte) 103)) {
              tc.field_h = false;
              var6 = param0 ? 1 : 0;
              bv.a(var6 != 0, 5, 1, 0);
              break L2;
            } else {
              break L2;
            }
          } else {
            if ((var6 ^ -1) != -48) {
              L3: {
                if ((var6 ^ -1) == -2) {
                  if (!this.field_d.d((byte) 48)) {
                    break L3;
                  } else {
                    if (!nw.g(116)) {
                      var6 = param0 ? 1 : 0;
                      bv.a(var6 != 0, -4, 1, jt.field_a);
                      break L2;
                    } else {
                      ld.a(0, rg.field_l, param0, (byte) 90, true);
                      break L2;
                    }
                  }
                } else {
                  if (43 != var6) {
                    if ((var6 ^ -1) != -3) {
                      if (-8 == (var6 ^ -1)) {
                        if (!this.field_d.d((byte) 55)) {
                          break L3;
                        } else {
                          L4: {
                            if (-14 == (jt.field_a ^ -1)) {
                              ah.b((byte) 90);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            if (jt.field_a != 12) {
                              break L5;
                            } else {
                              b.field_n = null;
                              eo.field_a = null;
                              break L5;
                            }
                          }
                          hh.a(-16147, 50, mp.field_Ob, true);
                          var6 = param0 ? 1 : 0;
                          bv.a(var6 != 0, 0, 1, jt.field_a);
                          break L2;
                        }
                      } else {
                        if (var6 != 21) {
                          if (19 == var6) {
                            if (!this.field_d.d((byte) 105)) {
                              break L3;
                            } else {
                              var6 = param0 ? 1 : 0;
                              bv.a(var6 != 0, 8, param1 ^ 1, jt.field_a);
                              break L2;
                            }
                          } else {
                            if (-53 != (var6 ^ -1)) {
                              if (var6 != 51) {
                                if (45 == var6) {
                                  if (this.field_d.d((byte) 126)) {
                                    var6 = param0 ? 1 : 0;
                                    bv.a(var6 != 0, 2, 1, jt.field_a);
                                    break L2;
                                  } else {
                                    break L2;
                                  }
                                } else {
                                  if ((var6 ^ -1) == -43) {
                                    if (!this.field_d.d((byte) 81)) {
                                      break L3;
                                    } else {
                                      vs.field_j = true;
                                      du.field_h = false;
                                      rd.field_j.r(-128);
                                      var6 = param0 ? 1 : 0;
                                      bv.a(var6 != 0, -5, 1, jt.field_a);
                                      break L2;
                                    }
                                  } else {
                                    if (var6 == 5) {
                                      if (!this.field_d.d((byte) 103)) {
                                        break L3;
                                      } else {
                                        L6: {
                                          L7: {
                                            if (fj.field_c) {
                                              break L7;
                                            } else {
                                              if (gk.field_H) {
                                                break L7;
                                              } else {
                                                break L6;
                                              }
                                            }
                                          }
                                          ma.field_Z = false;
                                          break L6;
                                        }
                                        ij.field_y = 0;
                                        var6 = param0 ? 1 : 0;
                                        bv.a(var6 != 0, 7, 1, jt.field_a);
                                        break L2;
                                      }
                                    } else {
                                      if ((var6 ^ -1) == -25) {
                                        if (!this.field_d.d((byte) 111)) {
                                          break L3;
                                        } else {
                                          if (-13 != (this.field_a ^ -1)) {
                                            jq.field_F = -1;
                                            li.field_q = -1;
                                            this.a((String) null, -1, wf.field_q[0], (String) null, (byte) -64, al.field_l[0]);
                                            var6 = param0 ? 1 : 0;
                                            bv.a(var6 != 0, 12, 1, 0);
                                            break L2;
                                          } else {
                                            break L2;
                                          }
                                        }
                                      } else {
                                        if (-41 == (var6 ^ -1)) {
                                          if (!this.field_d.d((byte) 79)) {
                                            break L3;
                                          } else {
                                            if (!rf.a(27875)) {
                                              li.field_q = -1;
                                              jq.field_F = -1;
                                              this.a((String) null, -1, wf.field_q[0], (String) null, (byte) -99, al.field_l[0]);
                                              var6 = param0 ? 1 : 0;
                                              bv.a(var6 != 0, 12, 1, 0);
                                              break L2;
                                            } else {
                                              var6 = param0 ? 1 : 0;
                                              bv.a(var6 != 0, 15, 1, jt.field_a);
                                              break L2;
                                            }
                                          }
                                        } else {
                                          if (30 == var6) {
                                            if (this.field_d.d((byte) 124)) {
                                              if (nw.g(param1 + 89)) {
                                                ld.a(0, r.field_G, param0, (byte) 90, true);
                                                break L2;
                                              } else {
                                                var6 = param0 ? 1 : 0;
                                                bv.a(var6 != 0, 13, 1, jt.field_a);
                                                break L2;
                                              }
                                            } else {
                                              break L2;
                                            }
                                          } else {
                                            if (var6 != 41) {
                                              if (34 != var6) {
                                                if (var6 == 8) {
                                                  if (!this.field_d.d((byte) 100)) {
                                                    break L3;
                                                  } else {
                                                    L8: {
                                                      if (18 == jt.field_a) {
                                                        ns.b(false);
                                                        break L8;
                                                      } else {
                                                        break L8;
                                                      }
                                                    }
                                                    L9: {
                                                      if (jt.field_a == 13) {
                                                        ah.b((byte) 90);
                                                        break L9;
                                                      } else {
                                                        break L9;
                                                      }
                                                    }
                                                    L10: {
                                                      if (jt.field_a != 12) {
                                                        break L10;
                                                      } else {
                                                        eo.field_a = null;
                                                        b.field_n = null;
                                                        break L10;
                                                      }
                                                    }
                                                    var6 = ui.field_c;
                                                    var7 = param0 ? 1 : 0;
                                                    bv.a(var7 != 0, var6, 1, jt.field_a);
                                                    break L2;
                                                  }
                                                } else {
                                                  if (var6 == 4) {
                                                    if (this.field_d.d((byte) 83)) {
                                                      var6 = param0 ? 1 : 0;
                                                      bv.a(var6 != 0, 6, 1, jt.field_a);
                                                      break L2;
                                                    } else {
                                                      break L2;
                                                    }
                                                  } else {
                                                    if ((var6 ^ -1) == -36) {
                                                      if (this.field_d.d((byte) 121)) {
                                                        var6 = param0 ? 1 : 0;
                                                        bv.a(var6 != 0, 14, 1, jt.field_a);
                                                        break L2;
                                                      } else {
                                                        break L2;
                                                      }
                                                    } else {
                                                      if ((var6 ^ -1) != -37) {
                                                        if ((var6 ^ -1) != -38) {
                                                          if (-39 == (var6 ^ -1)) {
                                                            if (this.field_d.d((byte) 59)) {
                                                              L11: {
                                                                ek.field_d = ek.field_d + 1;
                                                                ps.field_v = true;
                                                                if (ek.field_d == 3) {
                                                                  ek.field_d = 0;
                                                                  break L11;
                                                                } else {
                                                                  break L11;
                                                                }
                                                              }
                                                              rj.a(1);
                                                              break L2;
                                                            } else {
                                                              break L2;
                                                            }
                                                          } else {
                                                            if (var6 == 39) {
                                                              if (!this.field_d.d((byte) 55)) {
                                                                break L3;
                                                              } else {
                                                                var6 = param0 ? 1 : 0;
                                                                bv.a(var6 != 0, 0, param1 ^ 1, jt.field_a);
                                                                break L2;
                                                              }
                                                            } else {
                                                              if (-18 != (var6 ^ -1)) {
                                                                if (-19 == (var6 ^ -1)) {
                                                                  L12: {
                                                                    if (!this.field_d.e(-100)) {
                                                                      break L12;
                                                                    } else {
                                                                      jf.b(0, 123);
                                                                      break L12;
                                                                    }
                                                                  }
                                                                  L13: {
                                                                    if (this.field_d.b(param1 + 96)) {
                                                                      jf.b(256, param1 + 89);
                                                                      break L13;
                                                                    } else {
                                                                      break L13;
                                                                    }
                                                                  }
                                                                  L14: {
                                                                    if (this.field_d.a(false)) {
                                                                      var6 = -100 + (this.a(true, param2) + this.a(param2, -3858) - -wd.field_b) >> -47943455;
                                                                      var7 = -var6 + sm.field_d;
                                                                      var8 = 256 * var7 / 100;
                                                                      if (-1 > (var8 ^ -1)) {
                                                                        if (var8 < 256) {
                                                                          jf.b(var8, 107);
                                                                          break L14;
                                                                        } else {
                                                                          jf.b(256, 105);
                                                                          break L14;
                                                                        }
                                                                      } else {
                                                                        jf.b(0, 94);
                                                                        break L14;
                                                                      }
                                                                    } else {
                                                                      break L14;
                                                                    }
                                                                  }
                                                                  L15: {
                                                                    if (!this.field_d.a((byte) -62)) {
                                                                      break L15;
                                                                    } else {
                                                                      wn.a(true);
                                                                      break L15;
                                                                    }
                                                                  }
                                                                  if (this.field_d.a(param1 ^ -98)) {
                                                                    vv.a(-30647);
                                                                    break L2;
                                                                  } else {
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  if (-7 == (var6 ^ -1)) {
                                                                    if (this.field_d.d((byte) 76)) {
                                                                      mi.f(param1 + -28093);
                                                                      break L2;
                                                                    } else {
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    if ((var6 ^ -1) == -10) {
                                                                      if (this.field_d.d((byte) 111)) {
                                                                        rd.field_j.d(122, param0);
                                                                        vs.field_j = true;
                                                                        du.field_h = false;
                                                                        break L2;
                                                                      } else {
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      if (10 != var6) {
                                                                        if ((var6 ^ -1) == -12) {
                                                                          if (!this.field_d.d((byte) 96)) {
                                                                            break L3;
                                                                          } else {
                                                                            rd.field_j.r(122);
                                                                            var6 = param0 ? 1 : 0;
                                                                            bv.a(var6 != 0, -1, param1 ^ 1, 0);
                                                                            break L2;
                                                                          }
                                                                        } else {
                                                                          if (var6 != 12) {
                                                                            if (var6 != 13) {
                                                                              if ((var6 ^ -1) != -51) {
                                                                                if (-15 != (var6 ^ -1)) {
                                                                                  if (-16 != (var6 ^ -1)) {
                                                                                    if (var6 == 20) {
                                                                                      if (this.field_d.d((byte) 124)) {
                                                                                        if (this.field_a == 10) {
                                                                                          vf.a(0, 9);
                                                                                          break L2;
                                                                                        } else {
                                                                                          L16: {
                                                                                            if ((this.field_a ^ -1) == -9) {
                                                                                              break L16;
                                                                                            } else {
                                                                                              if ((this.field_a ^ -1) == -7) {
                                                                                                break L16;
                                                                                              } else {
                                                                                                if (26 == this.field_a) {
                                                                                                  break L16;
                                                                                                } else {
                                                                                                  if (27 == this.field_a) {
                                                                                                    break L16;
                                                                                                  } else {
                                                                                                    if (this.field_a != 28) {
                                                                                                      break L3;
                                                                                                    } else {
                                                                                                      break L16;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          vf.a(0, this.field_a);
                                                                                          break L2;
                                                                                        }
                                                                                      } else {
                                                                                        break L2;
                                                                                      }
                                                                                    } else {
                                                                                      if (22 != var6) {
                                                                                        if (var6 != 23) {
                                                                                          if (48 == var6) {
                                                                                            if (this.field_d.d((byte) 112)) {
                                                                                              var6 = param0 ? 1 : 0;
                                                                                              bv.a(var6 != 0, 23, 1, jt.field_a);
                                                                                              break L2;
                                                                                            } else {
                                                                                              break L2;
                                                                                            }
                                                                                          } else {
                                                                                            if (var6 == 3) {
                                                                                              if (this.field_d.d((byte) 46)) {
                                                                                                var6 = param0 ? 1 : 0;
                                                                                                bv.a(var6 != 0, 26, 1, jt.field_a);
                                                                                                break L2;
                                                                                              } else {
                                                                                                break L2;
                                                                                              }
                                                                                            } else {
                                                                                              if ((var6 ^ -1) != -54) {
                                                                                                if (-55 == (var6 ^ -1)) {
                                                                                                  if (!this.field_d.d((byte) 95)) {
                                                                                                    break L3;
                                                                                                  } else {
                                                                                                    var6 = param0 ? 1 : 0;
                                                                                                    bv.a(var6 != 0, 28, 1, jt.field_a);
                                                                                                    break L2;
                                                                                                  }
                                                                                                } else {
                                                                                                  if (var6 == 16) {
                                                                                                    if (!this.field_d.d((byte) 67)) {
                                                                                                      break L3;
                                                                                                    } else {
                                                                                                      ho.a(ag.d((byte) -128), (byte) -3);
                                                                                                      break L2;
                                                                                                    }
                                                                                                  } else {
                                                                                                    if (25 != var6) {
                                                                                                      if (26 == var6) {
                                                                                                        if (!this.field_d.d((byte) 41)) {
                                                                                                          break L3;
                                                                                                        } else {
                                                                                                          tc.field_h = true;
                                                                                                          var6 = param0 ? 1 : 0;
                                                                                                          bv.a(var6 != 0, -3, 1, 0);
                                                                                                          break L2;
                                                                                                        }
                                                                                                      } else {
                                                                                                        if (27 == var6) {
                                                                                                          if (!this.field_d.d((byte) 47)) {
                                                                                                            break L3;
                                                                                                          } else {
                                                                                                            var6 = param0 ? 1 : 0;
                                                                                                            bv.a(var6 != 0, -3, 1, 0);
                                                                                                            break L2;
                                                                                                          }
                                                                                                        } else {
                                                                                                          if (var6 != 28) {
                                                                                                            if ((var6 ^ -1) != -47) {
                                                                                                              if (var6 != 33) {
                                                                                                                if (-30 == (var6 ^ -1)) {
                                                                                                                  if (!this.field_d.d((byte) 61)) {
                                                                                                                    break L3;
                                                                                                                  } else {
                                                                                                                    L17: {
                                                                                                                      t.field_e = t.field_e + 1;
                                                                                                                      if (4 != t.field_e) {
                                                                                                                        break L17;
                                                                                                                      } else {
                                                                                                                        t.field_e = 0;
                                                                                                                        break L17;
                                                                                                                      }
                                                                                                                    }
                                                                                                                    L18: {
                                                                                                                      L19: {
                                                                                                                        if (0 == t.field_e) {
                                                                                                                          if ((r.field_B ^ -1) < -3) {
                                                                                                                            r.field_B = 2;
                                                                                                                            if (-2 == (t.field_e ^ -1)) {
                                                                                                                              if (4 < r.field_B) {
                                                                                                                                r.field_B = 4;
                                                                                                                                break L19;
                                                                                                                              } else {
                                                                                                                                if (t.field_e != 2) {
                                                                                                                                  break L18;
                                                                                                                                } else {
                                                                                                                                  if ((r.field_B ^ -1) >= -7) {
                                                                                                                                    break L18;
                                                                                                                                  } else {
                                                                                                                                    r.field_B = 6;
                                                                                                                                    break L18;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              if (t.field_e != 2) {
                                                                                                                                break L18;
                                                                                                                              } else {
                                                                                                                                if ((r.field_B ^ -1) >= -7) {
                                                                                                                                  break L18;
                                                                                                                                } else {
                                                                                                                                  r.field_B = 6;
                                                                                                                                  break L18;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            if (-2 == (t.field_e ^ -1)) {
                                                                                                                              if (4 < r.field_B) {
                                                                                                                                r.field_B = 4;
                                                                                                                                break L19;
                                                                                                                              } else {
                                                                                                                                if (t.field_e != 2) {
                                                                                                                                  break L18;
                                                                                                                                } else {
                                                                                                                                  if ((r.field_B ^ -1) >= -7) {
                                                                                                                                    break L18;
                                                                                                                                  } else {
                                                                                                                                    r.field_B = 6;
                                                                                                                                    break L18;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              if (t.field_e != 2) {
                                                                                                                                break L18;
                                                                                                                              } else {
                                                                                                                                if ((r.field_B ^ -1) >= -7) {
                                                                                                                                  break L18;
                                                                                                                                } else {
                                                                                                                                  r.field_B = 6;
                                                                                                                                  break L18;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          if (-2 == (t.field_e ^ -1)) {
                                                                                                                            if (4 < r.field_B) {
                                                                                                                              r.field_B = 4;
                                                                                                                              break L19;
                                                                                                                            } else {
                                                                                                                              if (t.field_e != 2) {
                                                                                                                                break L18;
                                                                                                                              } else {
                                                                                                                                if ((r.field_B ^ -1) >= -7) {
                                                                                                                                  break L18;
                                                                                                                                } else {
                                                                                                                                  r.field_B = 6;
                                                                                                                                  break L18;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            if (t.field_e != 2) {
                                                                                                                              break L18;
                                                                                                                            } else {
                                                                                                                              if ((r.field_B ^ -1) >= -7) {
                                                                                                                                break L18;
                                                                                                                              } else {
                                                                                                                                r.field_B = 6;
                                                                                                                                break L18;
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                      if (t.field_e != 2) {
                                                                                                                        break L18;
                                                                                                                      } else {
                                                                                                                        if ((r.field_B ^ -1) >= -7) {
                                                                                                                          break L18;
                                                                                                                        } else {
                                                                                                                          r.field_B = 6;
                                                                                                                          break L18;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                    if (3 != t.field_e) {
                                                                                                                      break L3;
                                                                                                                    } else {
                                                                                                                      if (4 > r.field_B) {
                                                                                                                        r.field_B = 4;
                                                                                                                        break L2;
                                                                                                                      } else {
                                                                                                                        break L2;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  if (31 == var6) {
                                                                                                                    if (!this.field_d.d((byte) 102)) {
                                                                                                                      break L3;
                                                                                                                    } else {
                                                                                                                      i.n(14737632);
                                                                                                                      var6 = param0 ? 1 : 0;
                                                                                                                      bv.a(var6 != 0, -6, 1, jt.field_a);
                                                                                                                      break L2;
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    if (-33 == (var6 ^ -1)) {
                                                                                                                      if (!this.field_d.d((byte) 89)) {
                                                                                                                        break L3;
                                                                                                                      } else {
                                                                                                                        kv.a(-28541);
                                                                                                                        var6 = param0 ? 1 : 0;
                                                                                                                        bv.a(var6 != 0, -7, 1, jt.field_a);
                                                                                                                        break L2;
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      if (var6 != 44) {
                                                                                                                        if ((var6 ^ -1) == -50) {
                                                                                                                          break L2;
                                                                                                                        } else {
                                                                                                                          if (-56 < (var4 ^ -1)) {
                                                                                                                            break L3;
                                                                                                                          } else {
                                                                                                                            if (param2 < 59) {
                                                                                                                              if (!this.field_d.d((byte) 121)) {
                                                                                                                                break L3;
                                                                                                                              } else {
                                                                                                                                L20: {
                                                                                                                                  var6 = -55 + var4;
                                                                                                                                  if (var6 <= 1) {
                                                                                                                                    break L20;
                                                                                                                                  } else {
                                                                                                                                    if (!rf.a(param1 + 27875)) {
                                                                                                                                      break L20;
                                                                                                                                    } else {
                                                                                                                                      break L2;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                wf.field_D = var6;
                                                                                                                                break L2;
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              break L2;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        if (this.field_d.d((byte) 88)) {
                                                                                                                          this.a((byte) 93, ev.field_d, ts.field_j);
                                                                                                                          var6 = param0 ? 1 : 0;
                                                                                                                          bv.a(var6 != 0, 18, 1, 0);
                                                                                                                          break L2;
                                                                                                                        } else {
                                                                                                                          break L2;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              } else {
                                                                                                                if (!this.field_d.d((byte) 91)) {
                                                                                                                  break L3;
                                                                                                                } else {
                                                                                                                  L21: {
                                                                                                                    if (vg.field_m) {
                                                                                                                      stackIn_345_0 = 0;
                                                                                                                      break L21;
                                                                                                                    } else {
                                                                                                                      stackIn_345_0 = 1;
                                                                                                                      break L21;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  vg.field_m = stackIn_345_0 != 0;
                                                                                                                  break L2;
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              if (this.field_d.d((byte) 124)) {
                                                                                                                L22: {
                                                                                                                  stackIn_336_0 = mg.field_g;

                                                                                                                  if (1 == tr.field_A) {
                                                                                                                    stackIn_337_0 = stackIn_336_0;
                                                                                                                    stackIn_337_1 = 1;
                                                                                                                    break L22;
                                                                                                                  } else {
                                                                                                                    stackIn_337_0 = stackIn_336_0;
                                                                                                                    stackIn_337_1 = -1;
                                                                                                                    break L22;
                                                                                                                  }
                                                                                                                }
                                                                                                                L23: {
                                                                                                                  mg.field_g = stackIn_337_0 + stackIn_337_1;
                                                                                                                  if (mg.field_g >= 0) {
                                                                                                                    break L23;
                                                                                                                  } else {
                                                                                                                    mg.field_g = r.field_B;
                                                                                                                    break L23;
                                                                                                                  }
                                                                                                                }
                                                                                                                if (r.field_B >= mg.field_g) {
                                                                                                                  break L3;
                                                                                                                } else {
                                                                                                                  mg.field_g = 0;
                                                                                                                  break L2;
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L2;
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            if (this.field_d.d((byte) 111)) {
                                                                                                              L24: {
                                                                                                                stackIn_308_0 = r.field_B;

                                                                                                                if (tr.field_A == 1) {
                                                                                                                  stackIn_309_0 = stackIn_308_0;
                                                                                                                  stackIn_309_1 = 1;
                                                                                                                  break L24;
                                                                                                                } else {
                                                                                                                  stackIn_309_0 = stackIn_308_0;
                                                                                                                  stackIn_309_1 = -1;
                                                                                                                  break L24;
                                                                                                                }
                                                                                                              }
                                                                                                              L25: {
                                                                                                                r.field_B = stackIn_309_0 + stackIn_309_1;
                                                                                                                if ((r.field_B ^ -1) <= -3) {
                                                                                                                  break L25;
                                                                                                                } else {
                                                                                                                  r.field_B = 8;
                                                                                                                  break L25;
                                                                                                                }
                                                                                                              }
                                                                                                              L26: {
                                                                                                                if ((r.field_B ^ -1) < -9) {
                                                                                                                  r.field_B = 2;
                                                                                                                  break L26;
                                                                                                                } else {
                                                                                                                  break L26;
                                                                                                                }
                                                                                                              }
                                                                                                              L27: {
                                                                                                                if (mg.field_g <= r.field_B) {
                                                                                                                  break L27;
                                                                                                                } else {
                                                                                                                  mg.field_g = r.field_B;
                                                                                                                  break L27;
                                                                                                                }
                                                                                                              }
                                                                                                              L28: {
                                                                                                                if (0 != t.field_e) {
                                                                                                                  break L28;
                                                                                                                } else {
                                                                                                                  if (-3 > (r.field_B ^ -1)) {
                                                                                                                    t.field_e = 1;
                                                                                                                    break L28;
                                                                                                                  } else {
                                                                                                                    break L28;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                              L29: {
                                                                                                                if (-2 != (t.field_e ^ -1)) {
                                                                                                                  break L29;
                                                                                                                } else {
                                                                                                                  if (r.field_B > 4) {
                                                                                                                    t.field_e = 2;
                                                                                                                    break L29;
                                                                                                                  } else {
                                                                                                                    break L29;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                              L30: {
                                                                                                                if (t.field_e != 2) {
                                                                                                                  break L30;
                                                                                                                } else {
                                                                                                                  if (-7 > (r.field_B ^ -1)) {
                                                                                                                    t.field_e = 3;
                                                                                                                    break L30;
                                                                                                                  } else {
                                                                                                                    break L30;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                              if (-4 != (t.field_e ^ -1)) {
                                                                                                                break L3;
                                                                                                              } else {
                                                                                                                if (4 > r.field_B) {
                                                                                                                  t.field_e = 2;
                                                                                                                  break L2;
                                                                                                                } else {
                                                                                                                  break L2;
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L2;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      if (this.field_d.d((byte) 58)) {
                                                                                                        var6 = param0 ? 1 : 0;
                                                                                                        bv.a(var6 != 0, -8, 1, 0);
                                                                                                        break L2;
                                                                                                      } else {
                                                                                                        break L2;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                if (this.field_d.d((byte) 127)) {
                                                                                                  var6 = param0 ? 1 : 0;
                                                                                                  bv.a(var6 != 0, 27, 1, jt.field_a);
                                                                                                  break L2;
                                                                                                } else {
                                                                                                  break L2;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          if (!this.field_d.d((byte) 71)) {
                                                                                            break L3;
                                                                                          } else {
                                                                                            if (this.a((byte) 70, param2)) {
                                                                                              fieldTemp$0 = ij.field_y + 1;
                                                                                              ij.field_y = ij.field_y + 1;
                                                                                              if (fieldTemp$0 != -1 + up.field_c.length) {
                                                                                                break L3;
                                                                                              } else {
                                                                                                if ((this.field_d.field_h ^ -1) == -3) {
                                                                                                  this.field_d.field_h = 0;
                                                                                                  break L2;
                                                                                                } else {
                                                                                                  break L2;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              break L2;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        if (!this.field_d.d((byte) 100)) {
                                                                                          break L3;
                                                                                        } else {
                                                                                          if (!this.a((byte) -95, param2)) {
                                                                                            break L3;
                                                                                          } else {
                                                                                            fieldTemp$1 = ij.field_y - 1;
                                                                                            ij.field_y = ij.field_y - 1;
                                                                                            if (fieldTemp$1 != 0) {
                                                                                              break L3;
                                                                                            } else {
                                                                                              if (this.field_d.field_h != 0) {
                                                                                                break L3;
                                                                                              } else {
                                                                                                this.field_d.field_h = 2;
                                                                                                break L2;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    if (!this.field_d.d((byte) 74)) {
                                                                                      break L3;
                                                                                    } else {
                                                                                      nf.field_Mb = 1;
                                                                                      break L2;
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  if (!this.field_d.d((byte) 38)) {
                                                                                    break L3;
                                                                                  } else {
                                                                                    nf.field_Mb = 0;
                                                                                    break L2;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                if (this.field_d.d((byte) 45)) {
                                                                                  var6 = param0 ? 1 : 0;
                                                                                  bv.a(var6 != 0, 25, 1, jt.field_a);
                                                                                  break L2;
                                                                                } else {
                                                                                  break L2;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              if (this.field_d.d((byte) 73)) {
                                                                                L31: {
                                                                                  if (!fj.field_c) {
                                                                                    break L31;
                                                                                  } else {
                                                                                    if (rd.field_j.field_xb.field_X) {
                                                                                      var6 = param0 ? 1 : 0;
                                                                                      bv.a(var6 != 0, -5, param1 ^ 1, jt.field_a);
                                                                                      break L31;
                                                                                    } else {
                                                                                      var6 = param0 ? 1 : 0;
                                                                                      bv.a(var6 != 0, 19, param1 ^ 1, jt.field_a);
                                                                                      break L31;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (!gk.field_H) {
                                                                                  break L3;
                                                                                } else {
                                                                                  ov.a(11, 3, 0);
                                                                                  hh.a(-16147, 50, mp.field_Ob, true);
                                                                                  break L2;
                                                                                }
                                                                              } else {
                                                                                break L2;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if (!this.field_d.d((byte) 72)) {
                                                                              break L3;
                                                                            } else {
                                                                              rd.field_j.l((byte) 108);
                                                                              var6 = param0 ? 1 : 0;
                                                                              bv.a(var6 != 0, -1, 1, 0);
                                                                              break L2;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        if (!this.field_d.d((byte) 117)) {
                                                                          break L3;
                                                                        } else {
                                                                          rd.field_j.h((byte) 69);
                                                                          var6 = param0 ? 1 : 0;
                                                                          bv.a(var6 != 0, -1, param1 ^ 1, 0);
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                L32: {
                                                                  var5 = 0;
                                                                  if (!this.field_d.e(94)) {
                                                                    break L32;
                                                                  } else {
                                                                    if (0 < bp.field_e) {
                                                                      var5 = 1;
                                                                      mh.a(0, (byte) -35);
                                                                      break L32;
                                                                    } else {
                                                                      break L32;
                                                                    }
                                                                  }
                                                                }
                                                                L33: {
                                                                  if (!this.field_d.b(96)) {
                                                                    break L33;
                                                                  } else {
                                                                    if (256 > bp.field_e) {
                                                                      var5 = 1;
                                                                      mh.a(256, (byte) -96);
                                                                      break L33;
                                                                    } else {
                                                                      break L33;
                                                                    }
                                                                  }
                                                                }
                                                                L34: {
                                                                  if (this.field_d.a(false)) {
                                                                    L35: {
                                                                      var6 = -100 + this.a(true, param2) - (-this.a(param2, param1 + -3858) - wd.field_b) >> -55860383;
                                                                      var7 = sm.field_d - var6;
                                                                      var8 = 256 * var7 / 100;
                                                                      if (var8 > 0) {
                                                                        if (var8 < 256) {
                                                                          mh.a(var8, (byte) -86);
                                                                          break L35;
                                                                        } else {
                                                                          mh.a(256, (byte) -98);
                                                                          break L35;
                                                                        }
                                                                      } else {
                                                                        mh.a(0, (byte) -118);
                                                                        break L35;
                                                                      }
                                                                    }
                                                                    var5 = 1;
                                                                    break L34;
                                                                  } else {
                                                                    break L34;
                                                                  }
                                                                }
                                                                L36: {
                                                                  if (!this.field_d.a((byte) -67)) {
                                                                    break L36;
                                                                  } else {
                                                                    if ((bp.field_e ^ -1) >= -1) {
                                                                      break L36;
                                                                    } else {
                                                                      hi.b(false);
                                                                      var5 = 1;
                                                                      break L36;
                                                                    }
                                                                  }
                                                                }
                                                                L37: {
                                                                  if (!this.field_d.a(-98)) {
                                                                    break L37;
                                                                  } else {
                                                                    if (-257 < (bp.field_e ^ -1)) {
                                                                      hs.a(30);
                                                                      var5 = 1;
                                                                      break L37;
                                                                    } else {
                                                                      break L37;
                                                                    }
                                                                  }
                                                                }
                                                                if (var5 == 0) {
                                                                  break L3;
                                                                } else {
                                                                  L38: {
                                                                    if (!this.field_d.a(false)) {
                                                                      break L38;
                                                                    } else {
                                                                      if (uk.field_n > pn.field_h) {
                                                                        break L38;
                                                                      } else {
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  }
                                                                  ub.a((byte) 33, im.field_v[0]);
                                                                  pn.field_h = 20 + uk.field_n;
                                                                  break L2;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          if (this.field_d.d((byte) 98)) {
                                                            L39: {
                                                              if (uc.field_a) {
                                                                stackIn_180_0 = 0;
                                                                break L39;
                                                              } else {
                                                                stackIn_180_0 = 1;
                                                                break L39;
                                                              }
                                                            }
                                                            uc.field_a = stackIn_180_0 != 0;
                                                            ps.field_v = true;
                                                            rj.a(1);
                                                            break L2;
                                                          } else {
                                                            break L2;
                                                          }
                                                        }
                                                      } else {
                                                        if (this.field_d.d((byte) 85)) {
                                                          L40: {
                                                            ps.field_v = true;
                                                            if (cu.field_a) {
                                                              stackIn_174_0 = 0;
                                                              break L40;
                                                            } else {
                                                              stackIn_174_0 = 1;
                                                              break L40;
                                                            }
                                                          }
                                                          cu.field_a = stackIn_174_0 != 0;
                                                          rj.a(param1 ^ 1);
                                                          break L2;
                                                        } else {
                                                          break L2;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (!this.field_d.d((byte) 49)) {
                                                  break L3;
                                                } else {
                                                  if (this.field_a != 13) {
                                                    L41: {
                                                      if ((jt.field_a ^ -1) != -13) {
                                                        break L41;
                                                      } else {
                                                        b.field_n = null;
                                                        eo.field_a = null;
                                                        break L41;
                                                      }
                                                    }
                                                    var6 = param0 ? 1 : 0;
                                                    bv.a(var6 != 0, 13, param1 + 1, jt.field_a);
                                                    break L2;
                                                  } else {
                                                    break L2;
                                                  }
                                                }
                                              }
                                            } else {
                                              if (!this.field_d.d((byte) 89)) {
                                                break L3;
                                              } else {
                                                var6 = param0 ? 1 : 0;
                                                bv.a(var6 != 0, 20, 1, 0);
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (!this.field_d.d((byte) 81)) {
                                  break L3;
                                } else {
                                  var6 = param0 ? 1 : 0;
                                  bv.a(var6 != 0, -10, 1, 0);
                                  break L2;
                                }
                              }
                            } else {
                              if (this.field_d.d((byte) 80)) {
                                var6 = param0 ? 1 : 0;
                                bv.a(var6 != 0, 24, 1, jt.field_a);
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          }
                        } else {
                          if (!this.field_d.d((byte) 54)) {
                            break L3;
                          } else {
                            var6 = param0 ? 1 : 0;
                            bv.a(var6 != 0, 0, param1 + 1, jt.field_a);
                            pv.field_c = true;
                            break L2;
                          }
                        }
                      }
                    } else {
                      if (this.field_d.d((byte) 107)) {
                        var6 = param0 ? 1 : 0;
                        bv.a(var6 != 0, -1, 1, 0);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    if (!this.field_d.d((byte) 127)) {
                      break L3;
                    } else {
                      if ((this.field_a ^ -1) == -3) {
                        var6 = param0 ? 1 : 0;
                        bv.a(var6 != 0, 17, 1, jt.field_a);
                        break L2;
                      } else {
                        var6 = param0 ? 1 : 0;
                        bv.a(var6 != 0, 2, 1, jt.field_a);
                        break L2;
                      }
                    }
                  }
                }
              }
              break L2;
            } else {
              if (this.field_d.d((byte) 49)) {
                if (!nw.g(123)) {
                  kr.field_C.a(false);
                  this.field_d.field_h = -1;
                  var6 = param0 ? 1 : 0;
                  bv.a(var6 != 0, 21, 1, jt.field_a);
                  break L2;
                } else {
                  ld.a(0, bi.field_e, param0, (byte) 90, true);
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
        }
    }

    private final void b(int param0) {
        fe.a(eq.field_n, db.a(true, param0), u.a(220, (byte) 94), 400, 16777215, true);
    }

    private final String c(int param0, int param1) {
        if (param0 != -38) {
            return (String) null;
        }
        return fo.a(4800, 1 != param1 ? lm.field_f : bt.field_b, new String[]{Integer.toString(param1)});
    }

    private final void a(byte param0, int param1, rg param2) {
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        tu stackIn_18_0;
        String stackIn_18_1;
        int stackIn_18_2;
        int stackIn_18_3;
        int stackIn_18_4;
        tu stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        int stackIn_19_5 = 0;
        wk[] stackIn_24_0 = null;
        wk[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        int var6 = 0;
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
        try {
          L0: {
            L1: {
              L2: {
                var6 = 0;
                var7 = 0;
                if (param2 == null) {
                  break L2;
                } else {
                  if (0 > param1) {
                    var5 = param2.field_g;
                    var6 = param2.field_f;
                    var7 = 1;
                    var4 = param2.field_k;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-1 >= param1) {
                eo.field_a = null;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var4 = fq.field_f[param1];
                var6 = uc.field_d[param1][2];
                var5 = mn.field_l[param1];
                break L1;
              }
            }
            if (param0 > 41) {
              L3: {
                var8 = 250;
                var9 = 12;
                var10 = en.field_E.a(var5, -20 + var8, var9);
                var11 = nr.field_e.a(var4, var8 + -45 << 212189121, 0) >> -1367421407;
                stackIn_12_0 = var11 + 40 + var10;

                stackIn_12_1 = -12;

                stackIn_12_2 = var9;

                if (var7 == 0) {
                  stackIn_13_0 = stackIn_12_0;
                  stackIn_13_1 = stackIn_12_1;
                  stackIn_13_2 = stackIn_12_2;
                  stackIn_13_3 = var9 + 30;
                  break L3;
                } else {
                  stackIn_13_0 = stackIn_12_0;
                  stackIn_13_1 = stackIn_12_1;
                  stackIn_13_2 = stackIn_12_2;
                  stackIn_13_3 = 0;
                  break L3;
                }
              }
              L4: {
                var12 = stackIn_13_0 - (stackIn_13_1 - (stackIn_13_2 - -stackIn_13_3));
                eo.field_a = new wk(var8, var12);
                eo.field_a.b();
                var13 = 200;
                var14 = 16777215;
                var15 = -1;
                var16 = 1;
                var17 = 0;
                if (var7 == 0) {
                  fe.a(fo.a(4800, me.field_a, new String[]{Integer.toString(pg.field_d.field_a[param1])}), var8 >> -2146416415, 82 + var11, var8 - 45, nd.field_b, true);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                stackIn_18_0 = en.field_E;

                stackIn_18_1 = (String) (var5);

                stackIn_18_2 = 10;

                stackIn_18_3 = 52;

                stackIn_18_4 = -var11;

                if (var7 != 0) {
                  stackIn_19_0 = (tu) ((Object) stackIn_18_0);
                  stackIn_19_1 = (String) ((Object) stackIn_18_1);
                  stackIn_19_2 = stackIn_18_2;
                  stackIn_19_3 = stackIn_18_3;
                  stackIn_19_4 = stackIn_18_4;
                  stackIn_19_5 = 8;
                  break L5;
                } else {
                  stackIn_19_0 = (tu) ((Object) stackIn_18_0);
                  stackIn_19_1 = (String) ((Object) stackIn_18_1);
                  stackIn_19_2 = stackIn_18_2;
                  stackIn_19_3 = stackIn_18_3;
                  stackIn_19_4 = stackIn_18_4;
                  stackIn_19_5 = 30;
                  break L5;
                }
              }
              L6: {
                ((tu) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_19_2, stackIn_19_3 - (stackIn_19_4 + -stackIn_19_5), -20 + var8, var13, var14, var15, var16, var17, var9);
                if (var7 == 0) {
                  en.field_E.a(fo.a(4800, ae.field_w, new String[]{Integer.toString(1 + uc.field_d[param1][1])}), 10, var11 + (52 - (-30 + -var10)), var8 - 20, var13, var14, var15, var16, var17, var9);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                fe.a(var4, var8 >> 335323649, 35, -45 + var8, nd.field_b, true);
                lf.field_h[var6].g(-20 + (var8 >> -239973087), 12 + var11);
                stackIn_24_0 = km.field_h;

                if (var7 == 0) {
                  stackIn_25_0 = (wk[]) ((Object) stackIn_24_0);
                  stackIn_25_1 = 0;
                  break L7;
                } else {
                  stackIn_25_0 = (wk[]) ((Object) stackIn_24_0);
                  stackIn_25_1 = 1;
                  break L7;
                }
              }
              ((wk) (Object) stackIn_25_0[stackIn_25_1]).g((var8 >> -182192095) - 23, -3 + (12 + var11));
              so.field_b.a(5605);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var4_ref);

            stackIn_29_1 = new StringBuilder().append("ci.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void d(int param0) {
        String discarded$0 = null;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (-1 >= wh.field_a) {
            break L0;
          } else {
            if (sm.field_d <= db.a(true, 40)) {
              break L0;
            } else {
              if (sm.field_d >= db.a(true, 376)) {
                break L0;
              } else {
                if (ko.field_b <= u.a(330, (byte) 94)) {
                  break L0;
                } else {
                  if (ko.field_b >= u.a(414, (byte) 94)) {
                    break L0;
                  } else {
                    ah.field_a.a(wh.field_a, (sm.field_d + -db.a(true, 40)) / 21 - -(16 * ((ko.field_b + -u.a(330, (byte) 94)) / 42)), (byte) -110);
                    ub.a((byte) 62, im.field_v[10]);
                    return;
                  }
                }
              }
            }
          }
        }
        L1: {
          var2 = fs.a(ko.field_b, 24340, db.a(true, 380), u.a(60, (byte) 94), sm.field_d, 224, 352);
          if (param0 == 330) {
            break L1;
          } else {
            discarded$0 = this.f(-6, -35);
            break L1;
          }
        }
        if (var2 <= -2) {
          if (-3 == var2) {
            return;
          } else {
            L2: {
              var3 = 44;
              if (sm.field_d <= db.a(true, 308)) {
                break L2;
              } else {
                if (sm.field_d >= db.a(true, 376)) {
                  break L2;
                } else {
                  var4 = 0;
                  L3: while (true) {
                    if ((var4 ^ -1) <= -7) {
                      break L2;
                    } else {
                      if ((ko.field_b ^ -1) < (u.a(var4 * var3 - -60, (byte) 94) ^ -1)) {
                        if (ko.field_b < u.a(-4 + (60 + var3 * (var4 - -1)), (byte) 94)) {
                          L4: {
                            wh.field_a = var4;
                            if (wh.field_a == kd.field_X) {
                              break L4;
                            } else {
                              dd.field_e = 0;
                              kb.field_n = 0;
                              kd.field_X = wh.field_a;
                              dg.b((byte) -61);
                              break L4;
                            }
                          }
                          ub.a((byte) 33, im.field_v[2]);
                          return;
                        } else {
                          var4++;
                          continue L3;
                        }
                      } else {
                        var4++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            L5: {
              var2 = ah.field_a.a(ko.field_b, param0 ^ 21728, db.a(true, 55), u.a(70, (byte) 94), sm.field_d);
              if ((var2 ^ -1) < 1) {
                L6: {
                  wh.field_a = var2;
                  if (kd.field_X != wh.field_a) {
                    kb.field_n = 0;
                    kd.field_X = wh.field_a;
                    dd.field_e = 0;
                    dg.b((byte) -61);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ub.a((byte) 68, im.field_v[2]);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        } else {
          L7: {
            stackIn_11_0 = wh.field_a;

            stackIn_11_1 = pg.field_d.a(0);

            if (hi.field_j < 2) {
              stackIn_12_0 = stackIn_11_0;
              stackIn_12_1 = stackIn_11_1;
              stackIn_12_2 = 0;
              break L7;
            } else {
              stackIn_12_0 = stackIn_11_0;
              stackIn_12_1 = stackIn_11_1;
              stackIn_12_2 = 1;
              break L7;
            }
          }
          if (!ue.a(stackIn_12_0, stackIn_12_1, stackIn_12_2 != 0, var2, -1208926000, ei.field_e[0])) {
            ub.a((byte) 62, im.field_v[5]);
            return;
          } else {
            ah.field_a.a(73, var2, wh.field_a);
            ub.a((byte) 121, im.field_v[9]);
            return;
          }
        }
    }

    private final void n(int param0) {
        int stackIn_8_0 = 0;
        int[] stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_19_3 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int[] var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int[] var13;
        int[] var14;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 56;
        var3 = 0;
        L0: while (true) {
          if (var3 >= oh.field_G.length) {
            L1: {
              if (-1 != (var2 % 2 ^ -1)) {
                stackIn_8_0 = 0;
                break L1;
              } else {
                stackIn_8_0 = 1;
                break L1;
              }
            }
            L2: {
              var3 = stackIn_8_0;
              var4 = 0;
              var4 = (int)Math.ceil((double)((float)(var2 + -(var4 / 2)) / 12.0f));
              tt.field_c = 85;
              var5 = tt.field_c;
              if (var3 != 0) {
                var5 -= 20;
                break L2;
              } else {
                break L2;
              }
            }
            var6 = 59;
            var14 = new int[1 + var4];
            var13 = var14;
            var7 = var13;
            var8 = 0;
            var9 = 0;
            L3: while (true) {
              if (var9 >= var14.length + -1) {
                L4: {
                  if ((var14.length ^ -1) <= -5) {
                    if (var14[4] <= 6) {
                      var7[3] = var7[3] - (-var14[4] + 6);
                      var14[4] = 6;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param0 == 21666) {
                    break L5;
                  } else {
                    this.d(86);
                    break L5;
                  }
                }
                var9 = 0;
                var10 = 0;
                var11 = 0;
                L6: while (true) {
                  if (56 <= var11) {
                    return;
                  } else {
                    if (this.c((byte) -2, var11)) {
                      qf.field_d[var11] = var5;
                      oj.field_q[var11] = var6;
                      var5 += 40;
                      var9++;
                      if (var9 == var14[var10]) {
                        var6 += 28;
                        var10++;
                        var9 = 0;
                        var5 = (480 - 40 * var14[var10]) / 2 + tt.field_c;
                        if ((1 & var14[var10]) == (var7[var10 - 1] & 1)) {
                          var5 += 20;
                          var11++;
                          continue L6;
                        } else {
                          var11++;
                          continue L6;
                        }
                      } else {
                        var11++;
                        continue L6;
                      }
                    } else {
                      var11++;
                      continue L6;
                    }
                  }
                }
              } else {
                L7: {
                  stackIn_15_0 = (int[]) (var7);

                  stackIn_15_1 = var9;

                  stackIn_15_2 = 12;

                  stackIn_15_3 = var3;

                  if (-2 != (var9 % 2 ^ -1)) {
                    stackIn_16_0 = (int[]) ((Object) stackIn_15_0);
                    stackIn_16_1 = stackIn_15_1;
                    stackIn_16_2 = stackIn_15_2;
                    stackIn_16_3 = stackIn_15_3;
                    stackIn_16_4 = 0;
                    break L7;
                  } else {
                    stackIn_16_0 = (int[]) ((Object) stackIn_15_0);
                    stackIn_16_1 = stackIn_15_1;
                    stackIn_16_2 = stackIn_15_2;
                    stackIn_16_3 = stackIn_15_3;
                    stackIn_16_4 = 1;
                    break L7;
                  }
                }
                L8: {






                  if (!bv.a(stackIn_16_3 != 0, stackIn_16_4 != 0)) {
                    stackIn_16_0 = (int[]) ((Object) stackIn_16_0);


                    stackIn_19_3 = 0;
                    break L8;
                  } else {
                    stackIn_16_0 = (int[]) ((Object) stackIn_16_0);


                    stackIn_19_3 = -1;
                    break L8;
                  }
                }
                stackIn_16_0[stackIn_16_1] = stackIn_16_2 + -stackIn_19_3;
                var8 = var8 + var14[var9];
                if (var2 < var8) {
                  var7[var9] = var7[var9] - (-var2 + var8);
                  var9++;
                  continue L3;
                } else {
                  var9++;
                  continue L3;
                }
              }
            }
          } else {
            if (!this.c((byte) 102, var3)) {
              var2--;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final void g(byte param0) {
        if (!(kr.field_E != null)) {
            return;
        }
        kr.field_E.a(this.field_d.field_h, (byte) -28, t.field_e, wf.field_D, vg.field_m, mg.field_g, r.field_B, this.f(true));
        int var2 = -9 % ((61 - param0) / 60);
    }

    final static void h(byte param0) {
        ee.field_v.j(-128);
        ee.field_v.a(new ut(ee.field_v), 0);
        if (param0 < 44) {
            ci.h((byte) -22);
        }
    }

    private final int a(rg param0, boolean param1, int param2, int param3) {
        Object stackIn_5_0 = null;
        rg stackIn_5_1 = null;
        Object stackIn_6_0 = null;
        rg stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param0.field_j != null) {
                L2: {
                  stackIn_5_0 = this;

                  stackIn_5_1 = param0.field_j;

                  if (256 == param3) {
                    stackIn_6_0 = this;
                    stackIn_6_1 = (rg) ((Object) stackIn_5_1);
                    stackIn_6_2 = 0;
                    break L2;
                  } else {
                    stackIn_6_0 = this;
                    stackIn_6_1 = (rg) ((Object) stackIn_5_1);
                    stackIn_6_2 = param1 ? 1 : 0;
                    break L2;
                  }
                }
                var5_int = this.a(stackIn_6_1, stackIn_6_2 != 0, -124, 256);
                kr.field_z.e(db.a(true, 30 - -(var5_int * 50) + 4), u.a(354, (byte) 94), param3);
                break L1;
              } else {
                qn.f(db.a(true, 38), u.a(340, (byte) 94), 254, 36, 2500134);
                break L1;
              }
            }
            if (param2 <= -82) {
              L3: {
                param0.field_c.h(db.a(true, var5_int * 50 + 50), u.a(348, (byte) 94));
                km.field_h[1].h(db.a(true, 50 * var5_int + 30 + 19), u.a(347, (byte) 94));
                qn.a(db.a(true, 30 - -(var5_int * 50) - -30), u.a(358, (byte) 94), 12, 2500134, -param3 + 256);
                if (!ml.a(u.a(359, (byte) 94), db.a(true, 30 + (50 * var5_int + 30)), 10, false)) {
                  break L3;
                } else {
                  na.field_F = param0.field_f + 400;
                  if (param1) {
                    vi.field_f = param0.field_k;
                    break L3;
                  } else {
                    vi.field_f = fo.a(4800, rr.field_a, new String[]{param0.field_k});
                    break L3;
                  }
                }
              }
              stackIn_15_0 = var5_int - -1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_9_0 = 49;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("ci.VA(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_15_0;
        }
    }

    private final void a(boolean param0, byte param1) {
        int discarded$0 = 0;
        int[] stackIn_5_0 = null;
        wk stackIn_23_0 = null;
        int stackIn_29_0 = 0;
        int var3;
        int var4;
        int[] var5;
        int var6;
        int var7;
        wk var7_ref_wk;
        int var8;
        int var9;
        int var10;
        String[] var11;
        String var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int[] var18;
        int[] var19;
        L0: {
          var17 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = db.a(true, 55);
          var4 = u.a(53, (byte) 94);
          if (param1 == -4) {
            break L0;
          } else {
            discarded$0 = this.a(-41, 32);
            break L0;
          }
        }
        L1: {
          if (param0) {
            stackIn_5_0 = i.field_Nb;
            break L1;
          } else {
            stackIn_5_0 = ei.field_e;
            break L1;
          }
        }
        var19 = stackIn_5_0;
        var18 = var19;
        var5 = var18;
        var6 = 0;
        L2: while (true) {
          if (var6 >= so.field_a.length) {
            L3: {
              if (vs.field_a != -1) {
                stackIn_29_0 = vs.field_a;
                break L3;
              } else {
                stackIn_29_0 = lm.field_c;
                break L3;
              }
            }
            L4: {
              var6 = stackIn_29_0;
              if (0 != (var6 ^ -1)) {
                L5: {
                  var7 = rs.field_n.field_z + rs.field_n.field_L;
                  fe.a(so.field_a[var6], db.a(true, 272), u.a(260 - (rs.field_n.field_L + -rs.field_n.field_v), (byte) 94), nd.field_b, true);
                  var8 = rb.a(var6, var19, 1) ? 1 : 0;
                  var9 = u.a(288, (byte) 94);
                  if (var8 == 0) {
                    rs.field_n.b(bl.field_g, db.a(true, 272), var9, 16711680, -1);
                    break L5;
                  } else {
                    rs.field_n.b(wd.field_f, db.a(true, 272), var9, 65280, -1);
                    break L5;
                  }
                }
                L6: {
                  var10 = u.a(260 - -var7, (byte) 94);
                  if (var8 == 0) {
                    L7: {
                      if (!pn.field_n[var6]) {
                        break L7;
                      } else {
                        if (df.field_M <= 0) {
                          hp.field_A.g(db.a(true, 82), -14 + var10);
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    am.field_A.g(db.a(true, 82), -14 + var10);
                    break L6;
                  } else {
                    qu.field_k[var6].a(db.a(true, 82), -14 + var10);
                    break L6;
                  }
                }
                L8: {
                  L9: {
                    var10 = var10 + rs.field_n.field_H;
                    var10 = var10 + rs.field_n.field_H;
                    var11 = new String[16];
                    var12 = eu.field_d;
                    if (!cg.field_m[var6]) {
                      break L9;
                    } else {
                      if (var8 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var12 = oi.field_a[var6];
                  break L8;
                }
                var13 = rs.field_n.a(var12, new int[]{288}, var11);
                var7 += 3;
                var10 = u.a(314, (byte) 94);
                var14 = 0;
                L10: while (true) {
                  if (var14 >= var13) {
                    var10 = u.a(385, (byte) 94);
                    rs.field_n.b(rd.field_h + ps.field_D[var6], db.a(true, 272), var10, 16777215, -1);
                    rs.field_n.b(vo.field_e, db.a(true, 392), var10, 16777215, -1);
                    var14 = db.a(true, rs.field_n.a(vo.field_e) + 392);
                    var15 = var10 - (rs.field_n.field_H + dk.field_v.field_v) / 2;
                    var16 = 0;
                    L11: while (true) {
                      if (var16 >= na.field_J[var6]) {
                        break L4;
                      } else {
                        dk.field_v.g(var14, var15);
                        var14 = var14 + dk.field_v.field_y / 3;
                        var16++;
                        continue L11;
                      }
                    }
                  } else {
                    rs.field_n.b(var11[var14], db.a(true, 272), var10, 16777215, -1);
                    var10 = var10 + var7;
                    var14++;
                    continue L10;
                  }
                }
              } else {
                rs.field_n.c(ck.field_a, db.a(true, 279) - -154, u.a(200, (byte) 94) - -112, 16777215, -1);
                if (nw.g(95)) {
                  fe.a(eq.field_n, db.a(true, 420), u.a(386, (byte) 94), 350, 16777215, true);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            return;
          } else {
            if (this.c((byte) 106, var6)) {
              L12: {
                var3 = db.a(true, qf.field_d[var6]);
                var4 = u.a(oj.field_q[var6], (byte) 94);
                if (var6 == vs.field_a) {
                  go.field_e.f(var3 - 20, var4 + -20, 256);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var6 == lm.field_c) {
                  go.field_e.f(var3 + -20, -20 + var4, 128);
                  break L13;
                } else {
                  break L13;
                }
              }
              if (rb.a(var6, var19, 1)) {
                qu.field_k[var6].c(var3, var4);
                var6++;
                continue L2;
              } else {
                if (!param0) {
                  L14: {
                    L15: {
                      if (!pn.field_n[var6]) {
                        break L15;
                      } else {
                        if ((df.field_M ^ -1) >= -1) {
                          stackIn_23_0 = hp.field_A;
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    stackIn_23_0 = am.field_A;
                    break L14;
                  }
                  var7_ref_wk = stackIn_23_0;
                  var7_ref_wk.e(var3, var4);
                  var6++;
                  continue L2;
                } else {
                  var6++;
                  continue L2;
                }
              }
            } else {
              var6++;
              continue L2;
            }
          }
        }
    }

    private final void d(byte param0, int param1) {
        L0: {
          this.b(true);
          if (param0 == -35) {
            break L0;
          } else {
            this.a(true);
            break L0;
          }
        }
        L1: {
          if (0 != pg.field_d.field_b[param1]) {
            break L1;
          } else {
            fe.c(this.c(-38, 50), db.a(true, 537), u.a(366, (byte) 94), nd.field_b, true);
            if (pg.field_d.a((byte) 120) < 50) {
              break L1;
            } else {
              if (!wg.a(-33, db.a(true, 469), db.a(true, 606), u.a(384, (byte) 94), u.a(416, (byte) 94))) {
                fe.a(db.a(true, 469), u.a(384, (byte) 94), 137, 32, il.field_s, nd.field_b, 0, 0);
                fe.c(wv.field_e, db.a(true, 537), u.a(416, (byte) 94), 0, true);
                break L1;
              } else {
                fe.a(db.a(true, 469), u.a(384, (byte) 94), 137, 32, il.field_s, field_e, 0, 0);
                na.field_F = 53;
                fe.c(wv.field_e, db.a(true, 537), u.a(416, (byte) 94), 0, true);
                break L1;
              }
            }
          }
        }
    }

    public static void h(int param0) {
        field_b = null;
        if (param0 != -1) {
            field_b = (String) null;
        }
        field_e = null;
        field_f = null;
        field_c = null;
    }

    private final int b(int param0, int param1, int param2) {
        int discarded$1 = 0;
        int var4;
        int var5;
        int var7;
        int var6;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = 0;
          if (param2 == 31) {
            break L0;
          } else {
            discarded$1 = this.a(false, -54);
            break L0;
          }
        }
        L1: while (true) {
          if (kr.field_y[this.field_a].length <= var4) {
            return -1;
          } else {
            var5 = -5 + this.a(var4, true);
            if (this.a((byte) -110, var4)) {
              if (this.a(true, var4) <= param1) {
                if (this.a(var4, -3858) > param1) {
                  if (param0 >= var5) {
                    if (param0 < this.d(12, var4) + var5) {
                      L2: {
                        L3: {
                          var6 = kr.field_y[this.field_a][var4];
                          if (var6 == 32) {
                            break L3;
                          } else {
                            if (var6 != 31) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (hi.field_j < 2) {
                          return -1;
                        } else {
                          break L2;
                        }
                      }
                      return var4;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    private final void a(String param0, int param1, String param2, String param3, byte param4, String param5) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        try {
          L0: {
            L1: {
              var7_int = 250;
              if (param0 == null) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 12;
                break L1;
              }
            }
            L2: {
              var8 = stackIn_3_0;
              if (param1 != -1) {
                stackIn_6_0 = 22;
                break L2;
              } else {
                stackIn_6_0 = 0;
                break L2;
              }
            }
            L3: {
              var9 = stackIn_6_0;
              var10 = 17 % ((44 - param4) / 54);
              var11 = "<br>" + param3;
              var12 = "<br>" + param0;
              var13 = en.field_E.a(param5, var7_int, var8);
              if (param3 != null) {
                stackIn_9_0 = en.field_E.a(var11, var7_int, var8);
                break L3;
              } else {
                stackIn_9_0 = 0;
                break L3;
              }
            }
            L4: {
              var14 = stackIn_9_0;
              if (param0 == null) {
                stackIn_12_0 = 0;
                break L4;
              } else {
                stackIn_12_0 = en.field_E.a(var12, var7_int, var8);
                break L4;
              }
            }
            L5: {
              var15 = stackIn_12_0;
              var16 = var9 + var14 + (var13 - -var15 + 30);
              eo.field_a = new wk(var7_int, var16);
              eo.field_a.b();
              var17 = 200;
              var18 = 16777215;
              var19 = -1;
              var20 = 0;
              var21 = 0;
              var22 = 12;
              en.field_E.a(param3, 0, 30, var7_int, var17, var18, var19, var20, var21, var22);
              if (-1 < param1) {
                ro.field_rb[param1].a(0, var14 + 25);
                en.field_E.b(hi.field_m[param1], 23, 30 + var14 - -8, var18, var19);
                break L5;
              } else {
                break L5;
              }
            }
            en.field_E.a(param0, 0, var14 + (30 + var9), var7_int, var17, var18, var19, var20, var21, var22);
            en.field_E.a(param5, 0, var15 + (var14 + 30) + var9, var7_int, var17, var18, var19, var20, var21, var22);
            fe.c(param2, var7_int >> 994953761, 30, nd.field_b, true);
            so.field_b.a(5605);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var7);

            stackIn_19_1 = new StringBuilder().append("ci.TA(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_29_2 + ')');
        }
    }

    private final String f(boolean param0) {
        Object var2;
        L0: {
          L1: {
            var2 = null;
            if (0 == ui.field_c) {
              break L1;
            } else {
              if (0 == jt.field_a) {
                break L1;
              } else {
                if ((ui.field_c ^ -1) == -16) {
                  break L1;
                } else {
                  if (15 == jt.field_a) {
                    break L1;
                  } else {
                    L2: {
                      if (ui.field_c == 1) {
                        break L2;
                      } else {
                        if ((jt.field_a ^ -1) == -2) {
                          break L2;
                        } else {
                          if ((ui.field_c ^ -1) == -25) {
                            break L2;
                          } else {
                            if ((jt.field_a ^ -1) != -25) {
                              L3: {
                                if ((ui.field_c ^ -1) == -3) {
                                  break L3;
                                } else {
                                  if (2 == jt.field_a) {
                                    break L3;
                                  } else {
                                    if (ui.field_c == 3) {
                                      break L3;
                                    } else {
                                      if (3 == jt.field_a) {
                                        break L3;
                                      } else {
                                        if (4 == ui.field_c) {
                                          break L3;
                                        } else {
                                          if ((jt.field_a ^ -1) == -5) {
                                            break L3;
                                          } else {
                                            L4: {
                                              if (-22 == (ui.field_c ^ -1)) {
                                                break L4;
                                              } else {
                                                if ((ui.field_c ^ -1) == -24) {
                                                  break L4;
                                                } else {
                                                  break L0;
                                                }
                                              }
                                            }
                                            var2 = lb.field_c;
                                            break L0;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var2 = hf.field_i;
                              break L0;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    var2 = ai.field_U;
                    break L0;
                  }
                }
              }
            }
          }
          var2 = il.field_t[7];
          break L0;
        }
        L5: {
          if (param0) {
            break L5;
          } else {
            this.f(73);
            break L5;
          }
        }
        return (String) (var2);
    }

    private final int d(int param0, int param1, int param2) {
        int discarded$1 = 0;
        int var6;
        int var7;
        int var4;
        int var5;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == -1) {
            break L0;
          } else {
            discarded$1 = this.d(-119, 51, -109);
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (so.field_a.length <= var6) {
            return -1;
          } else {
            if (this.c((byte) -103, var6)) {
              var4 = db.a(true, qf.field_d[var6]);
              var5 = u.a(oj.field_q[var6], (byte) 94);
              if (param0 >= var4) {
                if (param0 <= 32 + var4) {
                  if (param2 >= var5) {
                    if (32 + var5 >= param2) {
                      return var6;
                    } else {
                      var6++;
                      continue L1;
                    }
                  } else {
                    var6++;
                    continue L1;
                  }
                } else {
                  var6++;
                  continue L1;
                }
              } else {
                var6++;
                continue L1;
              }
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0) {
        boolean discarded$1 = false;
        int var3;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 >= 30) {
            break L0;
          } else {
            discarded$1 = this.a((byte) 126, 58);
            break L0;
          }
        }
        L1: {
          if (96 != rs.field_q) {
            break L1;
          } else {
            if ((this.field_d.field_h ^ -1) < -1) {
              if (-3 != (this.field_d.field_h ^ -1)) {
                this.field_d.a(0, false);
                break L1;
              } else {
                break L1;
              }
            } else {
              this.field_d.a(1, false);
              break L1;
            }
          }
        }
        L2: {
          if (rs.field_q == 97) {
            if ((this.field_d.field_h ^ -1) == -2) {
              this.field_d.a(0, false);
              break L2;
            } else {
              if (-3 != (this.field_d.field_h ^ -1)) {
                this.field_d.a(1, false);
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L3: {
          if (99 != rs.field_q) {
            break L3;
          } else {
            L4: {
              if ((this.field_d.field_h ^ -1) > -1) {
                break L4;
              } else {
                if (this.field_d.field_h <= 1) {
                  this.field_d.a(2, false);
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            this.field_d.a(nf.field_Mb, false);
            break L3;
          }
        }
        L5: {
          if (-99 == (rs.field_q ^ -1)) {
            if (2 == this.field_d.field_h) {
              this.field_d.a(nf.field_Mb, false);
              break L5;
            } else {
              this.field_d.a(2, false);
              break L5;
            }
          } else {
            break L5;
          }
        }
        this.field_d.c(0);
    }

    final void d(boolean param0) {
        L0: {
          this.field_d.field_h = -1;
          if (param0) {
            break L0;
          } else {
            this.k(-81);
            break L0;
          }
        }
        L1: {
          L2: {
            b.field_n = null;
            if (-27 == (this.field_a ^ -1)) {
              break L2;
            } else {
              if ((this.field_a ^ -1) == -28) {
                break L2;
              } else {
                if ((this.field_a ^ -1) == -29) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
          }
          sj.field_a = null;
          break L1;
        }
        L3: {
          if (this.field_a != 6) {
            break L3;
          } else {
            wp.field_z = null;
            break L3;
          }
        }
    }

    private final int a(int param0, boolean param1) {
        int var3;
        L0: {
          var3 = kr.field_D.a(this.field_a, (byte) -118);
          if (-4 != (this.field_a ^ -1)) {
            break L0;
          } else {
            if (!ma.field_Z) {
              break L0;
            } else {
              var3 -= 32;
              break L0;
            }
          }
        }
        if ((param0 ^ -1) != 0) {
          L1: {
            L2: {
              if (!nw.g(97)) {
                break L2;
              } else {
                if (this.field_a == 8) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (9 != this.field_a) {
              L3: {
                if (6 != this.field_a) {
                  break L3;
                } else {
                  if (nw.g(78)) {
                    break L3;
                  } else {
                    if ((param0 ^ -1) > -3) {
                      return var3;
                    } else {
                      return kr.field_D.b(this.field_a, (byte) 116) + var3;
                    }
                  }
                }
              }
              if (this.field_a != 11) {
                L4: {
                  if (this.field_a == 13) {
                    break L4;
                  } else {
                    if (-13 == (this.field_a ^ -1)) {
                      break L4;
                    } else {
                      if (18 == this.field_a) {
                        break L4;
                      } else {
                        if (this.field_a != 20) {
                          L5: {
                            if (-8 != (this.field_a ^ -1)) {
                              break L5;
                            } else {
                              if (kr.field_G == null) {
                                break L5;
                              } else {
                                return kr.field_G.g(-95, param0);
                              }
                            }
                          }
                          if ((this.field_a ^ -1) == -8) {
                            return 1;
                          } else {
                            L6: {
                              if (param1) {
                                break L6;
                              } else {
                                this.field_d = (dl) null;
                                break L6;
                              }
                            }
                            L7: {
                              if (-6 != (this.field_a ^ -1)) {
                                break L7;
                              } else {
                                if (kr.field_E == null) {
                                  break L7;
                                } else {
                                  return kr.field_E.a(param0, 1084326849);
                                }
                              }
                            }
                            if (5 == this.field_a) {
                              return 1;
                            } else {
                              L8: {
                                if ((this.field_a ^ -1) != -26) {
                                  break L8;
                                } else {
                                  if (0 <= (param0 ^ -1)) {
                                    break L8;
                                  } else {
                                    var3 = var3 + (nr.field_e.a(vd.field_a, 500, 0) >> -1584328831);
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (19 != this.field_a) {
                                  break L9;
                                } else {
                                  if (-1 >= param0) {
                                    break L9;
                                  } else {
                                    var3 = var3 + (nr.field_e.a(mu.field_e, 500, 0) >> 827908449);
                                    break L9;
                                  }
                                }
                              }
                              if (this.field_a != 0) {
                                return var3 - -(param0 * kr.field_D.b(this.field_a, (byte) -29));
                              } else {
                                return kr.field_D.b(this.field_a, (byte) -59) * param0 + (var3 + 5);
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                return var3;
              } else {
                return kr.field_D.a(-6, this.field_a) - kr.field_D.b(this.field_a, (byte) -102);
              }
            } else {
              break L1;
            }
          }
          return var3;
        } else {
          return var3 - kr.field_D.b(this.field_a, (byte) 106);
        }
    }

    private final void b(byte param0) {
        int var2;
        int var4;
        int var5;
        int[] var6;
        Object var7;
        String[] var8_ref_String__;
        int var8;
        int var10;
        int var11;
        String var12;
        int var13;
        int[] var24;
        int[] var25;
        int[] var26;
        L0: {
          L1: {
            var13 = ArmiesOfGielinor.field_M ? 1 : 0;
            var2 = og.field_m;
            if (0 > og.field_m) {
              break L1;
            } else {
              if (og.field_m < jr.field_h.length) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = 0;
          break L0;
        }
        var24 = jr.field_h[var2];
        if (!nw.g(123)) {
          L2: {
            var4 = -1;
            if (26 == this.field_a) {
              var4 = 0;
              break L2;
            } else {
              if ((this.field_a ^ -1) != -28) {
                if ((this.field_a ^ -1) != -29) {
                  break L2;
                } else {
                  var4 = 2;
                  break L2;
                }
              } else {
                var4 = 1;
                break L2;
              }
            }
          }
          L3: {
            if (null != sj.field_a) {
              break L3;
            } else {
              L4: {
                var5 = -1;
                if (-27 != (this.field_a ^ -1)) {
                  if ((this.field_a ^ -1) == -28) {
                    var5 = 1;
                    break L4;
                  } else {
                    if ((this.field_a ^ -1) != -29) {
                      break L4;
                    } else {
                      var5 = 2;
                      break L4;
                    }
                  }
                } else {
                  var5 = 0;
                  break L4;
                }
              }
              sj.field_a = pl.a(34, var5, 3, 10, 1);
              break L3;
            }
          }
          L5: {
            var5 = 89;
            var6 = field_e;
            fe.c(bj.field_o, db.a(true, var24[4]), u.a(var5, (byte) 94), field_e, true);
            var5 = var5 + (8 + rs.field_n.field_H);
            if (sj.field_a.field_o) {
              if (sj.field_a.field_s == null) {
                var7 = ae.field_s;
                break L5;
              } else {
                var7 = ed.field_b;
                var8_ref_String__ = sj.field_a.field_s[2];
                var25 = sj.field_a.field_m[2];
                var10 = 0;
                var11 = 0;
                L6: while (true) {
                  if (var11 >= 10) {
                    if (var10 != 0) {
                      break L5;
                    } else {
                      if (null == pg.field_d) {
                        break L5;
                      } else {
                        var26 = nd.field_b;
                        this.a((byte) 63, -1, pg.field_d.field_g.a(false, var4) / tc.a(108, var4), var5, var26, mv.field_d);
                        break L5;
                      }
                    }
                  } else {
                    if (var8_ref_String__[var11] != null) {
                      L7: {
                        var6 = field_e;
                        var12 = var8_ref_String__[var11];
                        if (gt.a(var12, (byte) 111)) {
                          var10 = 1;
                          var6 = nd.field_b;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      this.a((byte) 63, var11, var25[var11] / tc.a(-49, var4), var5, var6, var12);
                      var7 = null;
                      var5 += 25;
                      var11++;
                      continue L6;
                    } else {
                      var5 += 25;
                      var11++;
                      continue L6;
                    }
                  }
                }
              }
            } else {
              var7 = fm.field_c;
              break L5;
            }
          }
          L8: {
            if (var7 != null) {
              fe.c((String) (var7), qn.field_l / 2, qn.field_g / 2, field_e, true);
              break L8;
            } else {
              break L8;
            }
          }
          var8 = 30 / ((param0 - -12) / 41);
          var5 = 385 - -rs.field_n.field_H;
          return;
        } else {
          this.b(320);
          return;
        }
    }

    private final void m(int param0) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        int discarded$2 = 0;
        int discarded$3 = 0;
        rg stackIn_33_0;
        int stackIn_33_1;
        int stackIn_33_2;
        int stackIn_33_3;
        int stackIn_33_4;
        Object stackIn_33_5;
        int stackIn_33_6;
        rg stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        Object stackIn_34_5 = null;
        int stackIn_34_6 = 0;
        int stackIn_34_7 = 0;
        wk stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        wk stackIn_60_0;
        int stackIn_60_1;
        int stackIn_60_2;
        int stackIn_60_3;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          vi.field_f = null;
          na.field_F = -1;
          var2 = rl.field_A;
          var3 = wj.field_q;
          if (null == ih.field_p) {
            var3 = (int)((Math.cos((double)wj.field_q * 3.141592653589793 / 256.0) + 1.0) * 128.0);
            var2 = (int)(128.0 * (Math.cos((double)rl.field_A * 3.141592653589793 / 256.0) - 1.0));
            if ((rl.field_A ^ -1) < -1) {
              var2 = -var2;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (null != pg.field_d) {
          L1: {
            fe.b(db.a(true, 40), u.a(380, (byte) 94), 123, 40, tb.field_j, jh.field_k, 0, 128);
            fe.b(db.a(true, 167), u.a(380, (byte) 94), 123, 40, tb.field_j, jh.field_k, 0, 128);
            qn.b(db.a(true, 167), u.a(380, (byte) 94), 123, 40, 0, 192);
            qn.b(db.a(true, 40), u.a(380, (byte) 94), 123, 40, 0, 192);
            if (tg.field_k != 0) {
              break L1;
            } else {
              fe.b(db.a(true, 167), u.a(380, (byte) 94), 123, 40, tb.field_j, jh.field_k, 0, 128);
              qn.b(db.a(true, 167), u.a(380, (byte) 94), 123, 40, 0, 128);
              break L1;
            }
          }
          L2: {
            if (1 == tg.field_k) {
              fe.b(db.a(true, 40), u.a(380, (byte) 94), 123, 40, tb.field_j, jh.field_k, 0, 128);
              qn.b(db.a(true, 40), u.a(380, (byte) 94), 123, 40, 0, 128);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (wg.a(-33, db.a(true, 171), db.a(true, 286), u.a(384, (byte) 94), u.a(416, (byte) 94))) {
              fe.a(db.a(true, 171), u.a(384, (byte) 94), 115, 32, il.field_s, field_e, 0, 0);
              na.field_F = 8;
              break L3;
            } else {
              fe.a(db.a(true, 171), u.a(384, (byte) 94), 115, 32, il.field_s, nd.field_b, 0, 0);
              break L3;
            }
          }
          L4: {
            fe.c(nu.field_w, db.a(true, 228), u.a(416, (byte) 94), 0, true);
            if (!wg.a(-33, db.a(true, 44), db.a(true, 159), u.a(384, (byte) 94), u.a(416, (byte) 94))) {
              fe.a(db.a(true, 44), u.a(384, (byte) 94), 115, 32, il.field_s, nd.field_b, 0, 0);
              break L4;
            } else {
              fe.a(db.a(true, 44), u.a(384, (byte) 94), 115, 32, il.field_s, field_e, 0, 0);
              na.field_F = 9;
              break L4;
            }
          }
          L5: {
            fe.c(fu.field_b, db.a(true, 101), u.a(416, (byte) 94), 0, true);
            if (param0 == 100) {
              break L5;
            } else {
              discarded$0 = this.d(78, 100, 70);
              break L5;
            }
          }
          L6: {
            if (-2 != (tg.field_k ^ -1)) {
              break L6;
            } else {
              qn.b(db.a(true, 167), u.a(380, (byte) 94), 123, 40, 0, 128);
              break L6;
            }
          }
          L7: {
            if (-1 != (tg.field_k ^ -1)) {
              break L7;
            } else {
              qn.b(db.a(true, 40), u.a(380, (byte) 94), 123, 40, 0, 128);
              break L7;
            }
          }
          L8: {
            fe.b(db.a(true, 30), u.a(60, (byte) 94), 270, 324, tb.field_j, jh.field_k, 0, 256);
            if (tg.field_k != 0) {
              L9: {
                qn.f(db.a(true, 34), u.a(64, (byte) 94), db.a(true, 296), u.a(380, (byte) 94));
                var4 = 0;
                if (-313 <= (hh.field_c ^ -1)) {
                  qn.f(db.a(true, 279), u.a(67, (byte) 94), 14, 310, 1250067);
                  mp.field_Jb.g(db.a(true, 280), u.a(68, (byte) 94), 128);
                  break L9;
                } else {
                  var4 = ou.field_c * (-312 + hh.field_c) / 291;
                  qn.f(db.a(true, 279), u.a(67, (byte) 94), 14, 310, 2302755);
                  mp.field_Jb.g(db.a(true, 280), u.a(68 + ou.field_c, (byte) 94));
                  break L9;
                }
              }
              discarded$1 = this.a(0, bm.field_D, true, 0, var4, (byte) 116);
              this.c(0);
              qn.a();
              fe.b(ou.field_j, db.a(true, 165), u.a(76, (byte) 94), 230, true);
              fe.a(ou.field_j, db.a(true, 165), u.a(76, (byte) 94), 230, nd.field_b, true);
              break L8;
            } else {
              L10: {
                L11: {
                  qn.f(db.a(true, 34), u.a(64, (byte) 94), db.a(true, 296), u.a(380, (byte) 94));
                  if (vu.field_O == null) {
                    break L11;
                  } else {
                    if (ts.field_j == vu.field_O.field_j) {
                      break L11;
                    } else {
                      if (vu.field_O != ts.field_j.field_j) {
                        L12: {
                          if (0 >= var2) {
                            break L12;
                          } else {
                            na.field_F = vu.field_O.a(0, var3, var2 + -256, 40, (ci) (this), na.field_F, -1);
                            break L12;
                          }
                        }
                        ts.field_j.a(0, var3, var2, param0 ^ 76, (ci) (this), na.field_F, -1);
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                L13: {
                  if (0 >= var2) {
                    break L13;
                  } else {
                    na.field_F = vu.field_O.a(-256 + var2, var3, 0, 40, (ci) (this), na.field_F, ts.field_j.field_e);
                    break L13;
                  }
                }
                L14: {
                  stackIn_33_0 = ts.field_j;

                  stackIn_33_1 = var2;

                  stackIn_33_2 = var3;

                  stackIn_33_3 = 0;

                  stackIn_33_4 = 40;

                  stackIn_33_5 = this;

                  stackIn_33_6 = na.field_F;

                  if (vu.field_O != null) {
                    stackIn_34_0 = (rg) ((Object) stackIn_33_0);
                    stackIn_34_1 = stackIn_33_1;
                    stackIn_34_2 = stackIn_33_2;
                    stackIn_34_3 = stackIn_33_3;
                    stackIn_34_4 = stackIn_33_4;
                    stackIn_34_5 = this;
                    stackIn_34_6 = stackIn_33_6;
                    stackIn_34_7 = vu.field_O.field_e;
                    break L14;
                  } else {
                    stackIn_34_0 = (rg) ((Object) stackIn_33_0);
                    stackIn_34_1 = stackIn_33_1;
                    stackIn_34_2 = stackIn_33_2;
                    stackIn_34_3 = stackIn_33_3;
                    stackIn_34_4 = stackIn_33_4;
                    stackIn_34_5 = this;
                    stackIn_34_6 = stackIn_33_6;
                    stackIn_34_7 = -1;
                    break L14;
                  }
                }
                na.field_F = ((rg) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2, stackIn_34_3, stackIn_34_4, (ci) (this), stackIn_34_6, stackIn_34_7);
                if (var2 >= 0) {
                  break L10;
                } else {
                  na.field_F = vu.field_O.a(256 - -var2, var3, 0, 40, (ci) (this), na.field_F, vu.field_O.field_e);
                  break L10;
                }
              }
              L15: {
                qn.a();
                fe.b(l.field_e, db.a(true, 165), u.a(76, (byte) 94), 230, true);
                fe.a(l.field_e, db.a(true, 165), u.a(76, (byte) 94), 230, nd.field_b, true);
                if (-1 < (var2 ^ -1)) {
                  discarded$2 = this.a(vu.field_O, true, -127, -var2);
                  break L15;
                } else {
                  discarded$3 = this.a(ts.field_j, true, -125, -var2 + 256);
                  break L15;
                }
              }
              if (vi.field_f != null) {
                fe.b(vi.field_f, db.a(true, 165), u.a(100, (byte) 94), 230, true);
                fe.a(vi.field_f, db.a(true, 165), u.a(100, (byte) 94), 230, field_e, true);
                break L8;
              } else {
                fe.b(ts.field_j.field_k, db.a(true, 165), u.a(100, (byte) 94), 230, true);
                fe.a(ts.field_j.field_k, db.a(true, 165), u.a(100, (byte) 94), 230, field_e, true);
                break L8;
              }
            }
          }
          qn.a();
          fe.b(db.a(true, 310), u.a(60, (byte) 94), 300, 80, tb.field_j, jh.field_k, 0, 256);
          var4 = 1;
          var5 = 0;
          L16: while (true) {
            if (5 <= var5) {
              L17: {
                L18: {
                  if (var4 != 0) {
                    break L18;
                  } else {
                    if (!br.field_f[82]) {
                      break L17;
                    } else {
                      if (2 <= hi.field_j) {
                        break L18;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                if (tg.field_k == 0) {
                  L19: {
                    if (null != ts.field_j.field_j) {
                      break L19;
                    } else {
                      rs.field_n.a(ae.field_x, db.a(true, 40), u.a(284, (byte) 94), 250, 55, 16777215, -1, var2 + 256, 1, 1, 0);
                      break L19;
                    }
                  }
                  if (null == vu.field_O) {
                    break L17;
                  } else {
                    if (vu.field_O.field_j == null) {
                      rs.field_n.a(ae.field_x, db.a(true, 40), u.a(284, (byte) 94), 250, 55, 16777215, -1, var2, 1, 1, 0);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                } else {
                  break L17;
                }
              }
              L20: {
                fe.b(cp.field_c, db.a(true, 460), u.a(76, (byte) 94), true);
                fe.c(cp.field_c, db.a(true, 460), u.a(76, (byte) 94), nd.field_b, true);
                fe.b(db.a(true, 310), u.a(150, (byte) 94), 300, 170, tb.field_j, jh.field_k, 0, 256);
                fe.b(db.a(true, 310), u.a(330, (byte) 94), 145, 90, tb.field_j, nd.field_b, 0, 128);
                fe.b(db.a(true, 320), u.a(370, (byte) 94), 125, 42, tb.field_j, jh.field_k, 0, 0);
                fe.c(ov.field_f, db.a(true, 382), u.a(366, (byte) 94), nd.field_b, true);
                fe.c(dd.a(pg.field_d.a((byte) 48), 82), db.a(true, 382), u.a(406, (byte) 94), nd.field_b, true);
                if (2 > hi.field_j) {
                  break L20;
                } else {
                  if (!ln.field_e) {
                    break L20;
                  } else {
                    rs.field_n.c(pg.field_d.a((byte) 114) + "", db.a(true, 382), u.a(369, (byte) 94), 16777215, 0);
                    break L20;
                  }
                }
              }
              L21: {
                fe.b(db.a(true, 465), u.a(330, (byte) 94), 145, 40, tb.field_j, jh.field_k, 0, 128);
                fe.b(db.a(true, 465), u.a(380, (byte) 94), 145, 40, tb.field_j, jh.field_k, 0, 128);
                this.g(ev.field_d, -118);
                var5 = 40 + (nr.field_e.a(ig.field_m) >> 493490913);
                fm.a(e.field_b, var5, db.a(true, 620 + -var5), u.a(19, (byte) 94), -104);
                fe.a(ig.field_m, db.a(true, 640 + -var5), u.a(49, (byte) 94), 16777215, true);
                if (wg.a(-33, db.a(true, 620 - var5), db.a(true, 620), u.a(19, (byte) 94), u.a(e.field_b[0].field_v + 19, (byte) 94))) {
                  na.field_F = 45;
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if (q.field_D) {
                  lf.field_h[uc.field_d[ev.field_d][2]].h(12 + sm.field_d, ko.field_b + 12);
                  km.field_h[0].h(sm.field_d - -10, 10 + ko.field_b);
                  break L22;
                } else {
                  break L22;
                }
              }
              return;
            } else {
              L23: {
                if ((pg.field_d.field_d[var5] ^ -1) >= 0) {
                  break L23;
                } else {
                  var6 = pg.field_d.field_a[pg.field_d.field_d[var5]];
                  var7 = 0;
                  L24: while (true) {
                    if (var5 <= var7) {
                      L25: {
                        var4 = 0;
                        stackIn_59_0 = lf.field_h[uc.field_d[pg.field_d.field_d[var5]][2]];

                        stackIn_59_1 = db.a(true, 310 + var5 * 55 - -20);

                        stackIn_59_2 = u.a(78, (byte) 94);

                        if (-1 > (var6 ^ -1)) {
                          stackIn_60_0 = (wk) ((Object) stackIn_59_0);
                          stackIn_60_1 = stackIn_59_1;
                          stackIn_60_2 = stackIn_59_2;
                          stackIn_60_3 = 255;
                          break L25;
                        } else {
                          stackIn_60_0 = (wk) ((Object) stackIn_59_0);
                          stackIn_60_1 = stackIn_59_1;
                          stackIn_60_2 = stackIn_59_2;
                          stackIn_60_3 = 128;
                          break L25;
                        }
                      }
                      ((wk) (Object) stackIn_60_0).g(stackIn_60_1, stackIn_60_2, stackIn_60_3);
                      break L23;
                    } else {
                      if (pg.field_d.field_d[var7] == pg.field_d.field_d[var5]) {
                        var6--;
                        var7++;
                        continue L24;
                      } else {
                        var7++;
                        continue L24;
                      }
                    }
                  }
                }
              }
              km.field_h[0].g(db.a(true, var5 * 55 + 327), u.a(75, (byte) 94));
              if (ml.a(u.a(98, (byte) 94), db.a(true, 310 + (var5 * 55 - -40)), 22, false)) {
                na.field_F = var5;
                var5++;
                continue L16;
              } else {
                var5++;
                continue L16;
              }
            }
          }
        } else {
          return;
        }
    }

    private final String e(int param0, int param1) {
        StringBuilder stackIn_16_0 = null;
        StringBuilder stackIn_17_0 = null;
        String stackIn_17_1 = null;
        StringBuilder stackIn_22_0 = null;
        StringBuilder stackIn_23_0 = null;
        String stackIn_23_1 = null;
        String var3;
        int var4;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = il.field_t[param0];
          if (-9 == (param0 ^ -1)) {
            var3 = this.f(true);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((param0 ^ -1) == -29) {
            var3 = il.field_t[28] + r.field_B;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((param0 ^ -1) == -47) {
            var3 = il.field_t[28] + mg.field_g;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if ((param0 ^ -1) != -34) {
            break L3;
          } else {
            if (!vg.field_m) {
              var3 = il.field_t[33] + qd.field_J;
              break L3;
            } else {
              var3 = il.field_t[33] + dn.field_Mb;
              break L3;
            }
          }
        }
        L4: {
          if (36 != param0) {
            break L4;
          } else {
            L5: {
              stackIn_16_0 = new StringBuilder().append(il.field_t[36]);

              if (!cu.field_a) {
                stackIn_17_0 = (StringBuilder) ((Object) stackIn_16_0);
                stackIn_17_1 = uk.field_k;
                break L5;
              } else {
                stackIn_17_0 = (StringBuilder) ((Object) stackIn_16_0);
                stackIn_17_1 = dc.field_s;
                break L5;
              }
            }
            var3 = stackIn_17_1;
            break L4;
          }
        }
        L6: {
          if ((param0 ^ -1) == -38) {
            L7: {
              stackIn_22_0 = new StringBuilder().append(il.field_t[37]);

              if (!uc.field_a) {
                stackIn_23_0 = (StringBuilder) ((Object) stackIn_22_0);
                stackIn_23_1 = fk.field_a;
                break L7;
              } else {
                stackIn_23_0 = (StringBuilder) ((Object) stackIn_22_0);
                stackIn_23_1 = sk.field_N;
                break L7;
              }
            }
            var3 = stackIn_23_1;
            break L6;
          } else {
            break L6;
          }
        }
        L8: {
          if ((param0 ^ -1) == -39) {
            var3 = il.field_t[38] + cf.field_m[ek.field_d];
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (-30 != (param0 ^ -1)) {
            break L9;
          } else {
            var3 = il.field_t[29] + h.field_e[t.field_e];
            break L9;
          }
        }
        L10: {
          if (param1 == 29) {
            break L10;
          } else {
            this.g((byte) 101);
            break L10;
          }
        }
        L11: {
          if ((param0 ^ -1) != -10) {
            break L11;
          } else {
            if (rd.field_j == null) {
              break L11;
            } else {
              if (!rd.field_j.field_z) {
                if (rd.field_j.field_xb.field_K != null) {
                  var3 = jn.field_a;
                  break L11;
                } else {
                  break L11;
                }
              } else {
                var3 = ac.field_u;
                break L11;
              }
            }
          }
        }
        L12: {
          if (47 != param0) {
            break L12;
          } else {
            if (this.field_a == 22) {
              var3 = lb.field_c;
              break L12;
            } else {
              break L12;
            }
          }
        }
        return var3;
    }

    final static String c(int param0, int param1, int param2) {
        if (param1 != 0) {
            ci.h(-12);
        }
        return "(" + param0 + ", " + param2 + ")";
    }

    private final void i(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        int var8;
        String var9;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 589) {
            break L0;
          } else {
            this.field_a = -35;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if ((var2 ^ -1) <= -8) {
            L2: {
              if (wg.a(-33, db.a(true, 30), db.a(true, 300), u.a(150, (byte) 94), u.a(420, (byte) 94))) {
                var4 = 0;
                L3: while (true) {
                  if (wp.field_H[li.field_q + 1].length <= var4) {
                    break L2;
                  } else {
                    var2 = 135 + (int)(100.0 * Math.sin(2.0 * (3.141592653589793 * (double)var4) / (double)wp.field_H[1 + li.field_q].length)) + 30;
                    var3 = (int)(-(Math.cos(3.141592653589793 * (double)var4 * 2.0 / (double)wp.field_H[li.field_q - -1].length) * 100.0)) + 150 + 135;
                    if (!ml.a(u.a(var3, (byte) 94), db.a(true, var2), 25, false)) {
                      var4++;
                      continue L3;
                    } else {
                      L4: {
                        ep.field_o = 0;
                        if (var4 == jq.field_F) {
                          vf.field_f = jq.field_F;
                          ld.field_s = li.field_q;
                          ri.field_d = al.field_h;
                          kq.field_L = 0;
                          jq.field_F = -1;
                          b.field_n = null;
                          al.field_h = 256;
                          break L4;
                        } else {
                          ld.field_s = li.field_q;
                          vf.field_f = jq.field_F;
                          jq.field_F = var4;
                          b.field_n = new la(wp.field_H[li.field_q + 1][jq.field_F]);
                          ri.field_d = al.field_h;
                          al.field_h = 256;
                          break L4;
                        }
                      }
                      L5: {
                        if ((jq.field_F ^ -1) >= 0) {
                          this.a((String) null, -1, ve.a((byte) 13, wf.field_q[li.field_q - -1]), (String) null, (byte) -55, al.field_l[li.field_q - -1]);
                          break L5;
                        } else {
                          var5 = wp.field_H[1 + li.field_q][jq.field_F];
                          var6 = "";
                          var9 = ut.field_cb[var5];
                          var7 = bh.field_M[var5];
                          this.a(var7, bw.field_m[var5][0], ve.a((byte) 13, dn.field_Pb[var5]), this.f(var5, 8), (byte) 116, var9);
                          break L5;
                        }
                      }
                      ub.a((byte) 100, im.field_v[12]);
                      return;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            L6: {
              if (wg.a(param0 + -622, db.a(true, 469), db.a(true, 606), u.a(384, (byte) 94), u.a(416, (byte) 94))) {
                if (jq.field_F > -1) {
                  if (jq.field_F <= -1) {
                    break L6;
                  } else {
                    if (0 >= pg.field_d.field_b[li.field_q - -1]) {
                      break L6;
                    } else {
                      if (0 != (pg.field_d.field_b[1 + li.field_q] & 1 << jq.field_F)) {
                        break L6;
                      } else {
                        if (pg.field_d.a((byte) 91) >= bw.field_m[jq.field_F][11]) {
                          vl.field_n.h(32161, 70);
                          vl.field_n.b(true, wp.field_H[1 + li.field_q][jq.field_F]);
                          ub.a((byte) 62, im.field_v[14]);
                          pg.field_d.field_b[1 + li.field_q] = oe.c(pg.field_d.field_b[1 + li.field_q], 1 << jq.field_F);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                } else {
                  if (li.field_q > -1) {
                    if (-1 != jq.field_F) {
                      break L6;
                    } else {
                      if (-1 >= li.field_q) {
                        break L6;
                      } else {
                        if (-1 != (pg.field_d.field_b[1 + li.field_q] ^ -1)) {
                          break L6;
                        } else {
                          if (pg.field_d.a(50, (byte) 103)) {
                            vl.field_n.h(32161, 70);
                            vl.field_n.b(true, wp.field_H[li.field_q - -1][0]);
                            var2 = 0;
                            L7: while (true) {
                              if (var2 >= wp.field_H[li.field_q + 1].length) {
                                ub.a((byte) 124, im.field_v[14]);
                                break L6;
                              } else {
                                if (bw.field_m[wp.field_H[li.field_q + 1][var2]][11] == 0) {
                                  pg.field_d.field_b[li.field_q] = oe.c(pg.field_d.field_b[li.field_q], 1 << var2);
                                  var2++;
                                  continue L7;
                                } else {
                                  var2++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  } else {
                    break L6;
                  }
                }
              } else {
                break L6;
              }
            }
            L8: {
              if (fa.field_j == 1) {
                break L8;
              } else {
                if (wg.a(-33, db.a(true, 589), db.a(true, 603), u.a(158 - -ep.field_o, (byte) 94), u.a(150 + (ep.field_o + 24), (byte) 94))) {
                  fa.field_j = 1;
                  qg.field_u = -ep.field_o - (158 - ko.field_b);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            return;
          } else {
            var3 = 50 + 80 * var2 + 30;
            var4 = 95;
            if (!ml.a(u.a(var4, (byte) 94), db.a(true, var3), 25, false)) {
              var2++;
              continue L1;
            } else {
              ep.field_o = 0;
              if (li.field_q != -1 + var2) {
                ld.field_s = li.field_q;
                vs.field_f = tf.field_k;
                li.field_q = -1 + var2;
                tf.field_k = 256;
                ub.a((byte) 91, im.field_v[11]);
                vf.field_f = jq.field_F;
                kq.field_L = 0;
                jq.field_F = -1;
                ri.field_d = al.field_h;
                b.field_n = null;
                al.field_h = 256;
                this.a((String) null, -1, ve.a((byte) 13, wf.field_q[li.field_q + 1]), (String) null, (byte) -99, al.field_l[1 + li.field_q]);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    private final void e(byte param0) {
        int discarded$0 = 0;
        int var2;
        int var3;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (pc.field_k.length <= var2) {
            L1: {
              if (param0 == -92) {
                break L1;
              } else {
                discarded$0 = this.a(124, 23);
                break L1;
              }
            }
            return;
          } else {
            if (wg.a(param0 + 59, db.a(true, 57 * var2 + 35), db.a(true, 56 + 57 * var2 + 35), u.a(65, (byte) 94), u.a(121, (byte) 94))) {
              ah.field_b = var2;
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        String discarded$0 = null;
        if (!(this.field_d.field_h == -1)) {
            param2 = this.field_d.field_h;
        }
        this.field_d.a(param2, param1, this.b(ko.field_b, sm.field_d, 31), 0);
        vs.field_a = -1;
        lm.field_c = -1;
        ac.field_p = param2;
        pn.field_m = param2;
        pn.field_h = uk.field_n;
        if (this.field_a == 22 || 21 == this.field_a) {
            rd.field_j = null;
            System.gc();
            kr.field_C.c((byte) -120);
            kr.field_C.b(92);
        }
        if (param0 < 50) {
            discarded$0 = this.e(-53, 92);
        }
        if ((this.field_a ^ -1) == -9) {
            this.n(21666);
        }
    }

    private final void k(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int stackIn_15_0 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        na.field_F = -1;
        fe.b(db.a(true, 30), u.a(50, (byte) 94), 580, 90, tb.field_j, jh.field_k, 0, 256);
        var2 = (int)(-(128.0 * Math.cos((double)al.field_h * 3.141592653589793 / 256.0)) + 128.0);
        var3 = (int)(128.0 - Math.cos((double)ri.field_d * 3.141592653589793 / 256.0) * 128.0);
        var4 = (int)(128.0 - 128.0 * Math.cos((double)tf.field_k * 3.141592653589793 / 256.0));
        var5 = (int)(-(128.0 * Math.cos((double)vs.field_f * 3.141592653589793 / 256.0)) + 128.0);
        var6 = -54 / ((-52 - param0) / 42);
        qn.f(db.a(true, 34), u.a(54, (byte) 94), db.a(true, 606), u.a(136, (byte) 94));
        var7 = 0;
        L0: while (true) {
          if (7 <= var7) {
            L1: {
              qn.a();
              fe.b(db.a(true, 30), u.a(150, (byte) 94), 270, 270, tb.field_j, jh.field_k, 0, 256);
              qn.f(db.a(true, 34), u.a(154, (byte) 94), db.a(true, 296), u.a(416, (byte) 94));
              ce.field_F[li.field_q - -1].f(db.a(true, 36), u.a(156, (byte) 94), 256 - var4);
              ce.field_F[1 + ld.field_s].f(db.a(true, 36), u.a(156, (byte) 94), 256 - var5);
              if (null != b.field_n) {
                L2: {
                  tm.a(db.a(true, 34), u.a(154, (byte) 94), db.a(true, 296), u.a(416, (byte) 94));
                  tm.c();
                  if ((pg.field_d.field_b[1 + li.field_q] & 1 << jq.field_F) != 0) {
                    stackIn_15_0 = 0;
                    break L2;
                  } else {
                    stackIn_15_0 = 1;
                    break L2;
                  }
                }
                var7 = stackIn_15_0;
                fieldTemp$1 = kq.field_L;
                kq.field_L = kq.field_L + 1;
                b.field_n.b(2 * hk.field_Jb[b.field_n.field_f] / 3, u.a(145, (byte) 94), db.a(true, 165), fieldTemp$1, 98, var7 != 0);
                break L1;
              } else {
                break L1;
              }
            }
            var7 = 0;
            L3: while (true) {
              if (var7 >= wp.field_H[1 + ld.field_s].length) {
                var7 = 0;
                L4: while (true) {
                  if (wp.field_H[1 + li.field_q].length <= var7) {
                    L5: {
                      qn.a();
                      fe.b(db.a(true, 310), u.a(150, (byte) 94), 300, 170, tb.field_j, jh.field_k, 0, 128);
                      fe.b(db.a(true, 310), u.a(330, (byte) 94), 145, 90, tb.field_j, nd.field_b, 0, 128);
                      fe.b(db.a(true, 320), u.a(370, (byte) 94), 125, 42, tb.field_j, jh.field_k, 0, 0);
                      fe.c(ov.field_f, db.a(true, 382), u.a(366, (byte) 94), nd.field_b, true);
                      fe.c(dd.a(pg.field_d.a((byte) 55), 82), db.a(true, 382), u.a(406, (byte) 94), nd.field_b, true);
                      if (hi.field_j < 2) {
                        break L5;
                      } else {
                        if (ln.field_e) {
                          rs.field_n.c(pg.field_d.a((byte) 96) + "", db.a(true, 382), u.a(369, (byte) 94), 16777215, 0);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      fe.b(db.a(true, 465), u.a(330, (byte) 94), 145, 40, tb.field_j, jh.field_k, 0, 128);
                      fe.b(db.a(true, 465), u.a(380, (byte) 94), 145, 40, tb.field_j, jh.field_k, 0, 128);
                      if (0 > (jq.field_F ^ -1)) {
                        this.a(li.field_q - -1, jq.field_F, -104);
                        break L6;
                      } else {
                        this.d((byte) -35, 1 + li.field_q);
                        break L6;
                      }
                    }
                    return;
                  } else {
                    L7: {
                      var8 = 135 + (30 + (int)((double)(100 - -(var4 * 150 / 256)) * Math.sin(2.0 * (3.141592653589793 * (double)var7) / (double)wp.field_H[li.field_q - -1].length)));
                      var9 = 135 + (150 + (int)(-(Math.cos((double)var7 * 3.141592653589793 * 2.0 / (double)wp.field_H[1 + li.field_q].length) * (double)(var4 * 150 / 256 + 100))));
                      if (!ml.a(u.a(var9, (byte) 94), db.a(true, var8), 25, false)) {
                        break L7;
                      } else {
                        if (var4 != 0) {
                          break L7;
                        } else {
                          go.field_e.f(db.a(true, -35 + var8), u.a(var9 - 35, (byte) 94), 128);
                          na.field_F = 20 + var7;
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (jq.field_F != var7) {
                        break L8;
                      } else {
                        go.field_e.f(db.a(true, var8 - 35), u.a(var9 + -35, (byte) 94), var3);
                        break L8;
                      }
                    }
                    L9: {
                      if (vf.field_f != var7) {
                        break L9;
                      } else {
                        if (ld.field_s == li.field_q) {
                          go.field_e.f(db.a(true, var8 + -35), u.a(var9 + -35, (byte) 94), var2);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    lw.field_ob.d(db.a(true, var8 - 20), u.a(var9 - 20, (byte) 94), bo.field_g[1 + li.field_q]);
                    if ((1 << var7 & pg.field_d.field_b[li.field_q + 1] ^ -1) < -1) {
                      pl.field_x[wp.field_H[li.field_q - -1][var7]].g(db.a(true, var8 - 19), u.a(var9 - 19, (byte) 94));
                      km.field_h[0].g(db.a(true, -23 + var8), u.a(var9 + -23, (byte) 94));
                      var7++;
                      continue L4;
                    } else {
                      pl.field_x[wp.field_H[li.field_q + 1][var7]].g(db.a(true, var8 - 19), u.a(var9 - 19, (byte) 94), 0);
                      km.field_h[0].g(db.a(true, var8 + -23), u.a(var9 + -23, (byte) 94), 10);
                      var7++;
                      continue L4;
                    }
                  }
                }
              } else {
                L10: {
                  var8 = 135 + ((int)(Math.sin(3.141592653589793 * (double)var7 * 2.0 / (double)wp.field_H[1 + ld.field_s].length) * (double)(100 - -(var5 * 150 / 256))) + 30);
                  var9 = 285 + (int)(-(Math.cos(3.141592653589793 * (double)var7 * 2.0 / (double)wp.field_H[ld.field_s - -1].length) * (double)(100 + var5 * 150 / 256)));
                  if (vf.field_f != var7) {
                    break L10;
                  } else {
                    go.field_e.f(db.a(true, var8 - 35), u.a(-35 + var9, (byte) 94), var2);
                    break L10;
                  }
                }
                lw.field_ob.d(db.a(true, var8 - 20), u.a(-20 + var9, (byte) 94), bo.field_g[ld.field_s - -1]);
                km.field_h[0].g(db.a(true, var8 - 23), u.a(-23 + var9, (byte) 94));
                if ((1 << var7 & pg.field_d.field_b[1 + ld.field_s] ^ -1) >= -1) {
                  pl.field_x[wp.field_H[ld.field_s + 1][var7]].g(db.a(true, var8 + -19), u.a(var9 - 19, (byte) 94), 0);
                  km.field_h[0].g(db.a(true, -23 + var8), u.a(-23 + var9, (byte) 94), 10);
                  var7++;
                  continue L3;
                } else {
                  pl.field_x[wp.field_H[ld.field_s - -1][var7]].g(db.a(true, -19 + var8), u.a(-19 + var9, (byte) 94));
                  km.field_h[0].g(db.a(true, var8 - 23), u.a(-23 + var9, (byte) 94));
                  var7++;
                  continue L3;
                }
              }
            }
          } else {
            L11: {
              var8 = 24 + (30 + var7 * 80);
              var9 = 69;
              if (!ml.a(u.a(26 + var9, (byte) 94), db.a(true, 25 + var8), 25, false)) {
                break L11;
              } else {
                ue.field_k[var7].f(db.a(true, var8 - 19), u.a(-22 + var9, (byte) 94), 128);
                na.field_F = 2 + var7;
                break L11;
              }
            }
            L12: {
              if (li.field_q == var7 + -1) {
                ue.field_k[var7].f(db.a(true, var8 + -19), u.a(var9 + -22, (byte) 94), 256 + -var4);
                ue.field_k[var7].f(db.a(true, -19 + var8), u.a(-22 + var9, (byte) 94), 256 - var4);
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (var7 + -1 != ld.field_s) {
                break L13;
              } else {
                ue.field_k[var7].f(db.a(true, -19 + var8), u.a(var9 - 22, (byte) 94), 256 + -var5);
                ue.field_k[var7].f(db.a(true, -19 + var8), u.a(var9 - 22, (byte) 94), 256 + -var5);
                break L13;
              }
            }
            hr.field_d[var7].g(db.a(true, var8), u.a(var9, (byte) 94));
            gt.field_c[var7].g(db.a(true, -12 + var8), u.a(-17 + var9, (byte) 94));
            var7++;
            continue L0;
          }
        }
    }

    private final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, String param8) {
        String stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        String var13 = null;
        int[] var17 = null;
        try {
          L0: {
            L1: {
              var10_int = og.field_m;
              if (param6 == 310) {
                break L1;
              } else {
                this.b(true, 56, 5);
                break L1;
              }
            }
            L2: {
              L3: {
                if (og.field_m < 0) {
                  break L3;
                } else {
                  if (og.field_m >= jr.field_h.length) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              var10_int = 0;
              break L2;
            }
            L4: {
              var17 = jr.field_h[var10_int];
              var12 = param1 - -param5 + param7;
              if (param2 == -1) {
                break L4;
              } else {
                fe.b(param2 - -1 + ". ", db.a(true, 80), u.a(param3, (byte) 94), param0, true);
                break L4;
              }
            }
            L5: {
              if (var12 == 0) {
                break L5;
              } else {
                param5 = (200 * param5 + var12) / (2 * var12);
                param1 = (var12 + param1 * 200) / (2 * var12);
                param7 = (var12 + 200 * param7) / (var12 * 2);
                break L5;
              }
            }
            L6: {
              var13 = param8;
              fe.a(var13, db.a(true, 80), u.a(param3, (byte) 94), param0, true);
              var13 = Integer.toString(param4);
              fe.c(var13, db.a(true, var17[0]), u.a(param3, (byte) 94), param0, true);
              if (50 > var12) {
                stackIn_13_0 = Integer.toString(var12);
                break L6;
              } else {
                stackIn_13_0 = "50+";
                break L6;
              }
            }
            var13 = stackIn_13_0;
            fe.c(var13, db.a(true, var17[1]), u.a(param3, (byte) 94), param0, true);
            var13 = param1 + "%";
            fe.c(var13, db.a(true, var17[2]), u.a(param3, (byte) 94), param0, true);
            var13 = param5 + "%";
            fe.c(var13, db.a(true, var17[3]), u.a(param3, (byte) 94), param0, true);
            var13 = param7 + "%";
            fe.c(var13, db.a(true, var17[4]), u.a(param3, (byte) 94), param0, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var10 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var10);

            stackIn_17_1 = new StringBuilder().append("ci.U(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L8;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    ci(int param0) {
        int var2;
        int var3;
        int[] var4_ref_int__;
        int var4;
        int var5;
        int var6;
        String var7;
        int var8;
        L0: {
          this.field_a = param0;
          this.field_d = new dl(kr.field_y[this.field_a].length);
          if (0 != this.field_a) {
            break L0;
          } else {
            this.field_d.field_h = 2;
            break L0;
          }
        }
        L1: {
          if ((this.field_a ^ -1) != -8) {
            break L1;
          } else {
            this.field_d.field_h = 1;
            break L1;
          }
        }
        L2: {
          if ((this.field_a ^ -1) != -9) {
            break L2;
          } else {
            this.n(21666);
            break L2;
          }
        }
        var2 = kr.field_D.a((byte) -55, this.field_a) - kr.field_D.b(this.field_a, 29);
        var3 = var2;
        var4_ref_int__ = kr.field_y[this.field_a];
        var5 = 0;
        L3: while (true) {
          if (var4_ref_int__.length <= var5) {
            var4 = -var3 + var2;
            kr.field_D.a(-1, kr.field_D.b(this.field_a, 29) + -(var4 / 2), this.field_a);
            kr.field_D.b(-128, kr.field_D.a((byte) -106, this.field_a) - -(var4 / 2), this.field_a);
            return;
          } else {
            var6 = var4_ref_int__[var5];
            var7 = this.e(var6, 29);
            var8 = nr.field_e.a(var7) / 2 - -20;
            if (var2 < var8) {
              var2 = var8;
              var5++;
              continue L3;
            } else {
              var5++;
              continue L3;
            }
          }
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (fa.field_j == 2) {
            if (ro.field_ub != 1) {
                fa.field_j = -1;
            } else {
                var2 = ko.field_b + (-qg.field_u + -68);
                if (var2 < 0) {
                    ou.field_c = 0;
                } else {
                    if (291 >= var2) {
                        ou.field_c = var2;
                    } else {
                        ou.field_c = 291;
                    }
                }
            }
        }
        if (param0 != 0) {
            this.d((byte) -26, 52);
        }
    }

    private final boolean a(byte param0, int param1) {
        if (7 == this.field_a) {
            if (-1 == (param1 ^ -1) && -1 == (ij.field_y ^ -1)) {
                return false;
            }
            if (param1 == 2) {
                if (!(-1 + up.field_c.length != ij.field_y)) {
                    return false;
                }
            }
        }
        int var3 = 6 % ((-40 - param0) / 49);
        return true;
    }

    final void d(byte param0) {
        oo stackIn_6_0 = null;
        oo stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        int stackIn_157_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        rg stackIn_170_0 = null;
        rg stackIn_170_1 = null;
        int var2;
        int[] var3_ref_int__;
        int var3;
        rg var3_ref_rg;
        int var4;
        int[] var5;
        int[] var6;
        int[] var7;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (cd.c(9501)) {
          return;
        } else {
          if (this.field_a != 15) {
            L0: {
              var2 = 69 / ((param0 - -36) / 37);
              if (ua.field_t) {
                break L0;
              } else {
                if (dn.field_Qb) {
                  break L0;
                } else {
                  if (null == mu.field_a) {
                    L1: while (true) {
                      if (!jd.i((byte) 102)) {
                        L2: {
                          ac.field_p = this.b(ko.field_b, sm.field_d, 31);
                          this.field_d.a(0, this.b(ur.field_z, iu.field_t, 31), ac.field_p);
                          if (pn.field_m == ac.field_p) {
                            break L2;
                          } else {
                            ub.a((byte) 90, im.field_v[1]);
                            pn.field_m = ac.field_p;
                            break L2;
                          }
                        }
                        L3: {
                          if (0 != (this.field_d.field_h ^ -1)) {
                            this.a(true, 0, this.field_d.field_h);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if ((tr.field_A ^ -1) != -2) {
                            break L4;
                          } else {
                            if (this.field_a == 12) {
                              this.i(589);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if ((tr.field_A ^ -1) == -2) {
                              break L6;
                            } else {
                              if ((tr.field_A ^ -1) == -3) {
                                break L6;
                              } else {
                                if (-2 == (tr.field_A ^ -1)) {
                                  if (this.field_a == 20) {
                                    this.e((byte) -92);
                                    break L5;
                                  } else {
                                    if (tr.field_A != 1) {
                                      break L0;
                                    } else {
                                      if ((this.field_a ^ -1) != -14) {
                                        break L0;
                                      } else {
                                        this.d(330);
                                        break L0;
                                      }
                                    }
                                  }
                                } else {
                                  if (tr.field_A != 1) {
                                    break L0;
                                  } else {
                                    if ((this.field_a ^ -1) != -14) {
                                      break L0;
                                    } else {
                                      this.d(330);
                                      break L0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L7: {
                            if (this.field_a == 18) {
                              this.c(true);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          if (-2 == (tr.field_A ^ -1)) {
                            if (this.field_a == 20) {
                              this.e((byte) -92);
                              break L5;
                            } else {
                              if (tr.field_A != 1) {
                                break L0;
                              } else {
                                if ((this.field_a ^ -1) != -14) {
                                  break L0;
                                } else {
                                  this.d(330);
                                  break L0;
                                }
                              }
                            }
                          } else {
                            if (tr.field_A != 1) {
                              break L0;
                            } else {
                              if ((this.field_a ^ -1) != -14) {
                                break L0;
                              } else {
                                this.d(330);
                                break L0;
                              }
                            }
                          }
                        }
                        if (tr.field_A != 1) {
                          break L0;
                        } else {
                          if ((this.field_a ^ -1) != -14) {
                            break L0;
                          } else {
                            this.d(330);
                            break L0;
                          }
                        }
                      } else {
                        if (!gu.a(121)) {
                          L8: {
                            if (2 > hi.field_j) {
                              break L8;
                            } else {
                              if (-2 != (rs.field_q ^ -1)) {
                                break L8;
                              } else {
                                if (!br.field_f[82]) {
                                  break L8;
                                } else {
                                  rt.d((byte) 122);
                                  var7 = ei.field_e;
                                  var6 = var7;
                                  var5 = var6;
                                  var3_ref_int__ = var5;
                                  var5[0] = oe.c(var7[0], 2);
                                  ai.field_P.a((byte) -119, (tc) (new jg(0)));
                                  fi.field_u.a((byte) -119, (tc) (new iw(0, 255, 0, 0, 0, 0)));
                                  break L8;
                                }
                              }
                            }
                          }
                          L9: {
                            if ((rs.field_q ^ -1) == -14) {
                              L10: {
                                if (1 == this.field_a) {
                                  break L10;
                                } else {
                                  if (-3 == (this.field_a ^ -1)) {
                                    break L10;
                                  } else {
                                    if (-25 == (this.field_a ^ -1)) {
                                      break L10;
                                    } else {
                                      if (-4 == (this.field_a ^ -1)) {
                                        break L10;
                                      } else {
                                        if (-5 != (this.field_a ^ -1)) {
                                          if (jt.field_a == 10) {
                                            break L9;
                                          } else {
                                            if (22 == jt.field_a) {
                                              break L9;
                                            } else {
                                              bv.a(false, ui.field_c, 1, ui.field_c);
                                              break L9;
                                            }
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              bv.a(false, -1, 1, 0);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L11: {
                            if (rs.field_q != 11) {
                              break L11;
                            } else {
                              if (2 > hi.field_j) {
                                break L11;
                              } else {
                                L12: {
                                  if (jv.field_a) {
                                    stackIn_47_0 = 0;
                                    break L12;
                                  } else {
                                    stackIn_47_0 = 1;
                                    break L12;
                                  }
                                }
                                jv.field_a = stackIn_47_0 != 0;
                                return;
                              }
                            }
                          }
                          L13: {
                            if (rs.field_q != 12) {
                              break L13;
                            } else {
                              L14: {
                                if (ln.field_e) {
                                  stackIn_52_0 = 0;
                                  break L14;
                                } else {
                                  stackIn_52_0 = 1;
                                  break L14;
                                }
                              }
                              ln.field_e = stackIn_52_0 != 0;
                              break L13;
                            }
                          }
                          L15: {
                            if (11 != rs.field_q) {
                              break L15;
                            } else {
                              if (2 > hi.field_j) {
                                break L15;
                              } else {
                                L16: {
                                  if (jv.field_a) {
                                    stackIn_58_0 = 0;
                                    break L16;
                                  } else {
                                    stackIn_58_0 = 1;
                                    break L16;
                                  }
                                }
                                jv.field_a = stackIn_58_0 != 0;
                                return;
                              }
                            }
                          }
                          L17: {
                            if (12 != rs.field_q) {
                              break L17;
                            } else {
                              if ((hi.field_j ^ -1) > -3) {
                                break L17;
                              } else {
                                L18: {
                                  if (ln.field_e) {
                                    stackIn_64_0 = 0;
                                    break L18;
                                  } else {
                                    stackIn_64_0 = 1;
                                    break L18;
                                  }
                                }
                                ln.field_e = stackIn_64_0 != 0;
                                break L17;
                              }
                            }
                          }
                          L19: {
                            if (-12 != (rs.field_q ^ -1)) {
                              break L19;
                            } else {
                              if (hi.field_j >= 2) {
                                L20: {
                                  if (jv.field_a) {
                                    stackIn_71_0 = 0;
                                    break L20;
                                  } else {
                                    stackIn_71_0 = 1;
                                    break L20;
                                  }
                                }
                                jv.field_a = stackIn_71_0 != 0;
                                return;
                              } else {
                                break L19;
                              }
                            }
                          }
                          L21: {
                            if (12 != rs.field_q) {
                              break L21;
                            } else {
                              if (hi.field_j < 2) {
                                break L21;
                              } else {
                                L22: {
                                  if (ln.field_e) {
                                    stackIn_77_0 = 0;
                                    break L22;
                                  } else {
                                    stackIn_77_0 = 1;
                                    break L22;
                                  }
                                }
                                ln.field_e = stackIn_77_0 != 0;
                                break L21;
                              }
                            }
                          }
                          L23: {
                            if ((rs.field_q ^ -1) != -12) {
                              break L23;
                            } else {
                              if (hi.field_j >= 2) {
                                L24: {
                                  if (jv.field_a) {
                                    stackIn_84_0 = 0;
                                    break L24;
                                  } else {
                                    stackIn_84_0 = 1;
                                    break L24;
                                  }
                                }
                                jv.field_a = stackIn_84_0 != 0;
                                return;
                              } else {
                                break L23;
                              }
                            }
                          }
                          L25: {
                            if (-81 != (rs.field_q ^ -1)) {
                              break L25;
                            } else {
                              if (this.field_a != 12) {
                                break L25;
                              } else {
                                if (tf.field_k != 0) {
                                  break L25;
                                } else {
                                  L26: {
                                    ld.field_s = li.field_q;
                                    vf.field_f = jq.field_F;
                                    ri.field_d = al.field_h;
                                    jq.field_F = -1;
                                    li.field_q = li.field_q + 1;
                                    al.field_h = 256;
                                    li.field_q = li.field_q % 7;
                                    kq.field_L = 0;
                                    tf.field_k = 256;
                                    b.field_n = null;
                                    vs.field_f = 0;
                                    if (li.field_q == 6) {
                                      li.field_q = -1;
                                      break L26;
                                    } else {
                                      break L26;
                                    }
                                  }
                                  ub.a((byte) 126, im.field_v[11]);
                                  continue L1;
                                }
                              }
                            }
                          }
                          this.j(108);
                          if (0 == (this.field_d.field_h ^ -1)) {
                            continue L1;
                          } else {
                            this.a(false, 0, this.field_d.field_h);
                            continue L1;
                          }
                        } else {
                          continue L1;
                        }
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
            L27: {
              if (this.field_a == 16) {
                if (hi.field_i != null) {
                  hi.field_i.a(false);
                  break L27;
                } else {
                  break L27;
                }
              } else {
                if (-9 != (this.field_a ^ -1)) {
                  if ((this.field_a ^ -1) != -10) {
                    if (jt.field_a == 10) {
                      this.c((byte) -120);
                      break L27;
                    } else {
                      if (7 != this.field_a) {
                        if (22 != this.field_a) {
                          if ((this.field_a ^ -1) == -22) {
                            kr.field_C.f((byte) 124);
                            break L27;
                          } else {
                            if (this.field_a != 18) {
                              if (12 == this.field_a) {
                                L28: {
                                  if (b.field_n == null) {
                                    break L28;
                                  } else {
                                    b.field_n.a((byte) 118);
                                    break L28;
                                  }
                                }
                                L29: {
                                  var3 = 8;
                                  if (tf.field_k > 0) {
                                    tf.field_k = tf.field_k - var3;
                                    break L29;
                                  } else {
                                    break L29;
                                  }
                                }
                                L30: {
                                  if (256 <= vs.field_f) {
                                    break L30;
                                  } else {
                                    vs.field_f = vs.field_f + var3;
                                    break L30;
                                  }
                                }
                                L31: {
                                  if ((ri.field_d ^ -1) > -257) {
                                    ri.field_d = ri.field_d + var3;
                                    break L31;
                                  } else {
                                    break L31;
                                  }
                                }
                                L32: {
                                  if (al.field_h <= 0) {
                                    break L32;
                                  } else {
                                    al.field_h = al.field_h - var3;
                                    break L32;
                                  }
                                }
                                if (ic.field_J == na.field_F) {
                                  break L27;
                                } else {
                                  ub.a((byte) 116, im.field_v[1]);
                                  ic.field_J = na.field_F;
                                  break L27;
                                }
                              } else {
                                if (5 != this.field_a) {
                                  if ((this.field_a ^ -1) != -14) {
                                    break L27;
                                  } else {
                                    L33: {
                                      if (na.field_F == ic.field_J) {
                                        break L33;
                                      } else {
                                        ub.a((byte) 65, im.field_v[1]);
                                        ic.field_J = na.field_F;
                                        break L33;
                                      }
                                    }
                                    ul.a((byte) -102, 224, db.a(true, 380), ro.field_ub, ko.field_b, 352, sm.field_d, u.a(60, (byte) 94));
                                    break L27;
                                  }
                                } else {
                                  this.g((byte) 123);
                                  break L27;
                                }
                              }
                            } else {
                              L34: {
                                if (ic.field_J != na.field_F) {
                                  ub.a((byte) 37, im.field_v[1]);
                                  ic.field_J = na.field_F;
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                              L35: {
                                if (rl.field_A > 0) {
                                  L36: {
                                    stackIn_149_0 = rl.field_A;

                                    if (ih.field_p == null) {
                                      stackIn_150_0 = stackIn_149_0;
                                      stackIn_150_1 = 8;
                                      break L36;
                                    } else {
                                      stackIn_150_0 = stackIn_149_0;
                                      stackIn_150_1 = 16;
                                      break L36;
                                    }
                                  }
                                  rl.field_A = stackIn_150_0 - stackIn_150_1;
                                  if ((rl.field_A ^ -1) <= -1) {
                                    break L35;
                                  } else {
                                    rl.field_A = 0;
                                    break L35;
                                  }
                                } else {
                                  break L35;
                                }
                              }
                              L37: {
                                if (0 >= wj.field_q) {
                                  break L37;
                                } else {
                                  wj.field_q = wj.field_q - 16;
                                  break L37;
                                }
                              }
                              L38: {
                                if (0 <= rl.field_A) {
                                  break L38;
                                } else {
                                  L39: {
                                    stackIn_157_0 = rl.field_A;

                                    if (null != ih.field_p) {
                                      stackIn_158_0 = stackIn_157_0;
                                      stackIn_158_1 = 16;
                                      break L39;
                                    } else {
                                      stackIn_158_0 = stackIn_157_0;
                                      stackIn_158_1 = 8;
                                      break L39;
                                    }
                                  }
                                  rl.field_A = stackIn_158_0 + stackIn_158_1;
                                  if (-1 <= (rl.field_A ^ -1)) {
                                    break L38;
                                  } else {
                                    rl.field_A = 0;
                                    break L38;
                                  }
                                }
                              }
                              L40: {
                                if (0 != rl.field_A) {
                                  break L40;
                                } else {
                                  vu.field_O = null;
                                  if (ih.field_p == null) {
                                    break L40;
                                  } else {
                                    if (ts.field_j != ih.field_p) {
                                      var3_ref_rg = ih.field_p;
                                      L41: while (true) {
                                        L42: {
                                          if (var3_ref_rg == null) {
                                            break L42;
                                          } else {
                                            if (var3_ref_rg.field_j == ts.field_j) {
                                              break L42;
                                            } else {
                                              var3_ref_rg = var3_ref_rg.field_j;
                                              continue L41;
                                            }
                                          }
                                        }
                                        if (var3_ref_rg == null) {
                                          vu.field_O = ts.field_j;
                                          ts.field_j = ts.field_j.field_j;
                                          rl.field_A = -240;
                                          ub.a((byte) 41, am.field_v[45]);
                                          break L40;
                                        } else {
                                          vu.field_O = ts.field_j;
                                          ts.field_j = var3_ref_rg;
                                          rl.field_A = 240;
                                          stackIn_170_0 = ts.field_j;
                                          stackIn_170_1 = ih.field_p;
                                          if (stackIn_170_0 == stackIn_170_1) {
                                            ih.field_p = null;
                                            ub.a((byte) 83, am.field_v[42]);
                                            break L40;
                                          } else {
                                            ub.a((byte) 98, am.field_v[44]);
                                            break L40;
                                          }
                                        }
                                      }
                                    } else {
                                      ih.field_p = null;
                                      break L40;
                                    }
                                  }
                                }
                              }
                              if (!q.field_D) {
                                break L27;
                              } else {
                                if (-2 != (ro.field_ub ^ -1)) {
                                  this.a(false);
                                  break L27;
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                        } else {
                          kr.field_C.f((byte) 124);
                          break L27;
                        }
                      } else {
                        this.e(-48);
                        break L27;
                      }
                    }
                  } else {
                    this.c((byte) -120);
                    break L27;
                  }
                } else {
                  this.c((byte) -120);
                  break L27;
                }
              }
            }
            L43: {
              if (2 == this.field_a) {
                if (null == rd.field_j) {
                  break L43;
                } else {
                  L44: {
                    if (!rd.field_j.field_lb) {
                      break L44;
                    } else {
                      if (0 > rd.field_j.field_q) {
                        break L44;
                      } else {
                        if (rd.field_j.field_xb == null) {
                          break L44;
                        } else {
                          if (rd.field_j.field_xb.field_X) {
                            bv.a(false, 3, 1, 0);
                            break L44;
                          } else {
                            break L43;
                          }
                        }
                      }
                    }
                  }
                  break L43;
                }
              } else {
                break L43;
              }
            }
            return;
          } else {
            L45: {
              stackIn_6_0 = br.field_a;

              if (al.a(false)) {
                stackIn_7_0 = (oo) ((Object) stackIn_6_0);
                stackIn_7_1 = 0;
                break L45;
              } else {
                stackIn_7_0 = (oo) ((Object) stackIn_6_0);
                stackIn_7_1 = 1;
                break L45;
              }
            }
            L46: {
              var2 = ((oo) (Object) stackIn_7_0).a(stackIn_7_1 != 0, -121);
              if (-4 == (var2 ^ -1)) {
                L47: {
                  if (null != wq.field_a) {
                    ck.b(-99);
                    break L47;
                  } else {
                    break L47;
                  }
                }
                rf.a(32767, ag.d((byte) 65));
                break L46;
              } else {
                break L46;
              }
            }
            L48: {
              if ((var2 ^ -1) != -2) {
                break L48;
              } else {
                bv.a(false, 0, 1, jt.field_a);
                break L48;
              }
            }
            L49: {
              if (var2 == 2) {
                bv.a(true, 0, 1, jt.field_a);
                break L49;
              } else {
                break L49;
              }
            }
            return;
          }
        }
    }

    private final boolean c(byte param0, int param1) {
        int var3;
        int stackIn_5_0 = 0;
        L0: {
          L1: {
            var3 = 83 % ((44 - param0) / 33);
            if (this.b(-82, param1)) {
              break L1;
            } else {
              if (!oh.field_G[param1]) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackIn_5_0 = 1;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    private final int a(int param0, rg param1, boolean param2, int param3, int param4, byte param5) {
        int stackIn_22_0;
        int stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1.field_a != null) {
                var7_int = 0;
                L2: while (true) {
                  if (var7_int >= param1.field_a.length) {
                    break L1;
                  } else {
                    L3: {
                      if (!param2) {
                        break L3;
                      } else {
                        L4: {
                          param0 += 40;
                          if (0 != (3 & param3)) {
                            param3 = param3 + (4 + -(param3 & 3));
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var8 = -param4 + param0 - (-7 - 70 * (param3 >> 384229570));
                        if (0 >= var8) {
                          break L3;
                        } else {
                          if ((var8 ^ -1) <= -355) {
                            break L3;
                          } else {
                            fe.c(param1.field_a[var7_int].field_k, db.a(true, 152), u.a(var8 + 55, (byte) 94), field_e, true);
                            var9 = -30 + (270 + (-(nr.field_e.a(param1.field_a[var7_int].field_k) >> 702527041) - 25) >> 726980513);
                            fm.a(wc.field_Q, var9, db.a(true, 50), u.a(38 + var8, (byte) 94), -66);
                            fm.a(wc.field_Q, var9, db.a(true, 255 + -var9), u.a(var8 + 38, (byte) 94), -126);
                            break L3;
                          }
                        }
                      }
                    }
                    param3 = this.a(param0, param1.field_a[var7_int], false, param3, param4, (byte) 126);
                    var7_int++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L5: {
              var7_int = -15 % ((param5 - 67) / 48);
              if (param1.field_i == null) {
                break L5;
              } else {
                var11 = 0;
                var8 = var11;
                L6: while (true) {
                  if (var11 >= param1.field_i.length) {
                    break L5;
                  } else {
                    L7: {
                      if (pg.field_d.field_a[param1.field_i[var11]] > 0) {
                        L8: {
                          var9 = -param4 + (param3 >> 235554402) * 70 + 7 + param0;
                          if (69 <= (var9 ^ -1)) {
                            break L8;
                          } else {
                            if (var9 >= 324) {
                              break L8;
                            } else {
                              L9: {
                                stackIn_22_0 = db.a(true, 58 * (3 & param3) + 44);

                                stackIn_22_1 = u.a(-3 + (var9 + 60), (byte) 94);

                                stackIn_22_2 = 51;

                                stackIn_22_3 = 63;

                                if (param1.field_i[var11] != ev.field_d) {
                                  stackIn_23_0 = stackIn_22_0;
                                  stackIn_23_1 = stackIn_22_1;
                                  stackIn_23_2 = stackIn_22_2;
                                  stackIn_23_3 = stackIn_22_3;
                                  stackIn_23_4 = 2236962;
                                  break L9;
                                } else {
                                  stackIn_23_0 = stackIn_22_0;
                                  stackIn_23_1 = stackIn_22_1;
                                  stackIn_23_2 = stackIn_22_2;
                                  stackIn_23_3 = stackIn_22_3;
                                  stackIn_23_4 = 5592405;
                                  break L9;
                                }
                              }
                              qn.f(stackIn_23_0, stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4);
                              lf.field_h[uc.field_d[param1.field_i[var11]][2]].g(db.a(true, 50 + (param3 & 3) * 58), u.a(63 + var9, (byte) 94));
                              km.field_h[0].g(db.a(true, (3 & param3) * 58 + 47), u.a(60 - -var9, (byte) 94));
                              en.field_E.c(Integer.toString(pg.field_d.field_a[param1.field_i[var11]]), db.a(true, 70 + (3 & param3) * 58), u.a(var9 + 60 + 55, (byte) 94), 16777215, 0);
                              if (ml.a(u.a(60 - -var9 - -23, (byte) 94), db.a(true, 70 - -((3 & param3) * 58)), 22, false)) {
                                na.field_F = 200 + param1.field_i[var11];
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        param3++;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var11++;
                    continue L6;
                  }
                }
              }
            }
            L10: {
              if (param2) {
                L11: {
                  if (param3 == 0) {
                    rs.field_n.a(ar.field_x, db.a(true, 50), u.a(70 - -param0, (byte) 94), 220, 324 - (param0 + 20), 16777215, -1, 1, 1, 0);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if ((3 & param3) != 0) {
                    stackIn_36_0 = 70;
                    break L12;
                  } else {
                    stackIn_36_0 = 0;
                    break L12;
                  }
                }
                hh.field_c = stackIn_36_0 + (param0 + 70 * (param3 >> -212882974));
                break L10;
              } else {
                break L10;
              }
            }
            stackIn_38_0 = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var7 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var7);

            stackIn_41_1 = new StringBuilder().append("ci.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L13;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L13;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_38_0;
    }

    private final void j(int param0) {
        int var2;
        int var3;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = 17 % ((26 - param0) / 35);
          if ((rs.field_q ^ -1) != -85) {
            break L0;
          } else {
            if (!br.field_f[86]) {
              break L0;
            } else {
              if (null == wq.field_a) {
                ke.field_a = false;
                sm.a(false, 8028);
                return;
              } else {
                ck.b(-83);
                return;
              }
            }
          }
        }
        L1: {
          if (jt.field_a == 7) {
            this.f((byte) 100);
            break L1;
          } else {
            L2: {
              if ((jt.field_a ^ -1) == -23) {
                break L2;
              } else {
                if ((this.field_a ^ -1) != -22) {
                  L3: {
                    if ((jt.field_a ^ -1) != -7) {
                      break L3;
                    } else {
                      if (nw.g(79)) {
                        break L3;
                      } else {
                        this.a(98);
                        break L1;
                      }
                    }
                  }
                  L4: {
                    if ((jt.field_a ^ -1) == -13) {
                      break L4;
                    } else {
                      if ((jt.field_a ^ -1) == -21) {
                        break L4;
                      } else {
                        if (jt.field_a == 18) {
                          break L4;
                        } else {
                          L5: {
                            if (8 == this.field_a) {
                              break L5;
                            } else {
                              if (this.field_a == 9) {
                                break L5;
                              } else {
                                this.field_d.b((byte) -120);
                                break L1;
                              }
                            }
                          }
                          this.field_d.a(0, (byte) -7);
                          break L1;
                        }
                      }
                    }
                  }
                  this.field_d.a(1, (byte) 127);
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            kr.field_C.a(rs.field_q, (int) ui.field_i, 2);
            break L1;
          }
        }
        if (0 <= this.field_d.field_h) {
          L6: {
            L7: {
              var2 = kr.field_y[this.field_a][this.field_d.field_h];
              if (32 == var2) {
                break L7;
              } else {
                if ((var2 ^ -1) != -32) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            if (2 > hi.field_j) {
              L8: {
                if ((rs.field_q ^ -1) == -99) {
                  this.field_d.field_h = -1 + this.field_d.field_k;
                  break L8;
                } else {
                  break L8;
                }
              }
              if (-100 == (rs.field_q ^ -1)) {
                this.field_d.field_h = 2;
                break L6;
              } else {
                break L6;
              }
            } else {
              break L6;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = wp.field_H[param0][param1];
          var5 = 69 % ((14 - param2) / 40);
          this.b(true);
          if (bw.field_m[var4][11] > 0) {
            if (0 != (pg.field_d.field_b[param0] & 1 << param1)) {
              fe.c(iq.field_b, db.a(true, 537), u.a(366, (byte) 94), nd.field_b, true);
              break L0;
            } else {
              fe.c(this.c(-38, bw.field_m[var4][11]), db.a(true, 537), u.a(366, (byte) 94), nd.field_b, true);
              if (pg.field_d.field_b[param0] != 0) {
                if (pg.field_d.a((byte) 78) < bw.field_m[var4][11]) {
                  break L0;
                } else {
                  if (!wg.a(-33, db.a(true, 469), db.a(true, 606), u.a(384, (byte) 94), u.a(416, (byte) 94))) {
                    fe.a(db.a(true, 469), u.a(384, (byte) 94), 137, 32, il.field_s, nd.field_b, 0, 0);
                    fe.c(wv.field_e, db.a(true, 537), u.a(416, (byte) 94), 0, true);
                    break L0;
                  } else {
                    fe.a(db.a(true, 469), u.a(384, (byte) 94), 137, 32, il.field_s, field_e, 0, 0);
                    na.field_F = 52;
                    fe.c(wv.field_e, db.a(true, 537), u.a(416, (byte) 94), 0, true);
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          } else {
            if ((pg.field_d.field_b[param0] & 1 << param1) == 0) {
              fe.c(tc.field_d, db.a(true, 537), u.a(366, (byte) 94), nd.field_b, true);
              break L0;
            } else {
              fe.c(iq.field_b, db.a(true, 537), u.a(366, (byte) 94), nd.field_b, true);
              break L0;
            }
          }
        }
    }

    private final void g(int param0, int param1) {
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.b(true);
        if (ev.field_d < 0) {
          return;
        } else {
          L0: {
            var3 = 44 % ((-32 - param1) / 61);
            if (-1 != (tg.field_k ^ -1)) {
              break L0;
            } else {
              var4 = uc.field_d[param0][0];
              fe.c(this.c(-38, var4), db.a(true, 537), u.a(366, (byte) 94), nd.field_b, true);
              if (pg.field_d.a((byte) 125) < var4) {
                break L0;
              } else {
                if (param0 >= pg.field_d.field_a.length) {
                  break L0;
                } else {
                  if (-251 < (pg.field_d.field_a[param0] ^ -1)) {
                    L1: {
                      if (wg.a(-33, db.a(true, 469), db.a(true, 606), u.a(384, (byte) 94), u.a(416, (byte) 94))) {
                        fe.a(db.a(true, 469), u.a(384, (byte) 94), 137, 32, il.field_s, field_e, 0, 0);
                        na.field_F = 8;
                        break L1;
                      } else {
                        fe.a(db.a(true, 469), u.a(384, (byte) 94), 137, 32, il.field_s, nd.field_b, 0, 0);
                        break L1;
                      }
                    }
                    fe.c(wv.field_e, db.a(true, 537), u.a(416, (byte) 94), 0, true);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          L2: {
            if (tg.field_k == 1) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              L3: while (true) {
                if (-6 >= (var6 ^ -1)) {
                  L4: {
                    if (var5 == 0) {
                      break L4;
                    } else {
                      L5: {
                        if (!wg.a(-33, db.a(true, 469), db.a(true, 606), u.a(334, (byte) 94), u.a(366, (byte) 94))) {
                          fe.a(db.a(true, 469), u.a(334, (byte) 94), 137, 32, il.field_s, nd.field_b, 0, 0);
                          break L5;
                        } else {
                          fe.a(db.a(true, 469), u.a(334, (byte) 94), 137, 32, il.field_s, field_e, 0, 0);
                          na.field_F = 8;
                          break L5;
                        }
                      }
                      fe.c(wi.field_h, db.a(true, 537), u.a(366, (byte) 94), 0, true);
                      break L4;
                    }
                  }
                  if (var4 == 0) {
                    break L2;
                  } else {
                    stackIn_28_0 = -33;
                    stackIn_28_1 = db.a(true, 469);
                    if (!wg.a(stackIn_28_0, stackIn_28_1, db.a(true, 606), u.a(384, (byte) 94), u.a(416, (byte) 94))) {
                      fe.a(db.a(true, 469), u.a(384, (byte) 94), 137, 32, il.field_s, nd.field_b, 0, 0);
                      fe.c(ni.field_c, db.a(true, 537), u.a(416, (byte) 94), 0, true);
                      break L2;
                    } else {
                      fe.a(db.a(true, 469), u.a(384, (byte) 94), 137, 32, il.field_s, field_e, 0, 0);
                      na.field_F = 8;
                      fe.c(ni.field_c, db.a(true, 537), u.a(416, (byte) 94), 0, true);
                      break L2;
                    }
                  }
                } else {
                  L6: {
                    if (-1 != pg.field_d.field_d[var6]) {
                      break L6;
                    } else {
                      var5 = 1;
                      break L6;
                    }
                  }
                  if (pg.field_d.field_d[var6] == ev.field_d) {
                    var4 = 1;
                    var6++;
                    continue L3;
                  } else {
                    var6++;
                    continue L3;
                  }
                }
              }
            } else {
              break L2;
            }
          }
          return;
        }
    }

    private final int a(boolean param0, int param1) {
        int discarded$1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        L0: {
          L1: {
            if ((this.field_a ^ -1) != -7) {
              break L1;
            } else {
              if (!nw.g(121)) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (!nw.g(108)) {
              break L2;
            } else {
              if (8 == this.field_a) {
                break L0;
              } else {
                if (9 != this.field_a) {
                  break L2;
                } else {
                  break L0;
                }
              }
            }
          }
          L3: {
            if (param0) {
              break L3;
            } else {
              discarded$1 = this.a(false, -88);
              break L3;
            }
          }
          L4: {
            if ((this.field_a ^ -1) == -14) {
              break L4;
            } else {
              if (-13 == (this.field_a ^ -1)) {
                break L4;
              } else {
                if (-19 == (this.field_a ^ -1)) {
                  break L4;
                } else {
                  if (20 != this.field_a) {
                    L5: {
                      if (7 != this.field_a) {
                        break L5;
                      } else {
                        if (null != kr.field_G) {
                          return kr.field_G.a(param1, (byte) 4);
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (7 == this.field_a) {
                      return 1;
                    } else {
                      L6: {
                        if (-6 != (this.field_a ^ -1)) {
                          break L6;
                        } else {
                          if (kr.field_E != null) {
                            return kr.field_E.a(param1, true);
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (5 != this.field_a) {
                        return kr.field_D.b(this.field_a, 29);
                      } else {
                        return 1;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
              }
            }
          }
          return this.a((byte) -50, 0, param1);
        }
        L7: {
          stackIn_9_0 = 1;

          if ((param1 ^ -1) > -3) {
            stackIn_10_0 = stackIn_9_0;
            stackIn_10_1 = 100 - -(param1 * 240);
            break L7;
          } else {
            stackIn_10_0 = stackIn_9_0;
            stackIn_10_1 = 260;
            break L7;
          }
        }
        return db.a(stackIn_10_0 != 0, stackIn_10_1);
    }

    private final void c(byte param0) {
        int var2 = 0;
        lm.field_c = this.d(sm.field_d, -1, ko.field_b);
        if (1 != tr.field_A) {
        } else {
            ub.a((byte) 94, im.field_v[2]);
            var2 = this.d(iu.field_t, -1, ur.field_z);
            if (vs.field_a == var2) {
                vs.field_a = -1;
            } else {
                if (-1 != var2) {
                    vs.field_a = var2;
                }
            }
        }
        if (param0 > -83) {
            this.c(false);
        }
    }

    private final boolean b(int param0, int param1) {
        if (param0 > -72) {
            this.field_d = (dl) null;
        }
        int[] var4 = (this.field_a ^ -1) == -10 ? i.field_Nb : ei.field_e;
        int[] var3 = var4;
        return rb.a(param1, var4, 1);
    }

    private final int b(byte param0, int param1) {
        int var3 = -104 / ((-21 - param0) / 33);
        if ((this.field_a ^ -1) == -14 || this.field_a == 12 || (this.field_a ^ -1) == -19 || this.field_a == 20) {
            if (param1 < kr.field_y[this.field_a].length + -1) {
                return this.a(true, param1 - -1) - -this.a(param1, -3858) >> 657419681;
            }
        }
        return -1;
    }

    private final void a(byte param0, int param1, int param2, int param3, int[] param4, String param5) {
        String dupTemp$1 = null;
        RuntimeException runtimeException = null;
        int var7_int = 0;
        String var9 = null;
        String var10 = null;
        int[] var14 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var7_int = og.field_m;
                if (0 > og.field_m) {
                  break L2;
                } else {
                  if (jr.field_h.length <= og.field_m) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              var7_int = 0;
              break L1;
            }
            L3: {
              var14 = jr.field_h[var7_int];
              if (param0 == 63) {
                break L3;
              } else {
                field_c = (int[]) null;
                break L3;
              }
            }
            L4: {
              if (param1 != -1) {
                fe.b(1 + param1 + ". ", db.a(true, 80), u.a(param3, (byte) 94), param4, true);
                break L4;
              } else {
                break L4;
              }
            }
            var9 = param5;
            fe.a(var9, db.a(true, 80), u.a(param3, (byte) 94), param4, true);
            dupTemp$1 = ir.a(param0 + 10539, param2);
            var10 = dupTemp$1;
            var9 = dupTemp$1;
            fe.c(var10, db.a(true, var14[4]), u.a(param3, (byte) 94), param4, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("ci.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param5 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
    }

    final void e(boolean param0) {
        int stackIn_15_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_34_0 = 0;
        String stackIn_61_0 = null;
        Object stackIn_61_1 = null;
        String stackIn_62_0 = null;
        Object stackIn_62_1 = null;
        int stackIn_62_2 = 0;
        int stackIn_66_0 = 0;
        String stackIn_74_0 = null;
        String stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_79_0 = 0;
        String stackIn_82_0;
        int stackIn_82_1;
        Object stackIn_82_2;
        int stackIn_82_3;
        String stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        Object stackIn_83_2 = null;
        int stackIn_83_3 = 0;
        int stackIn_83_4 = 0;
        String stackIn_85_0 = null;
        Object stackIn_85_1 = null;
        String stackIn_86_0 = null;
        Object stackIn_86_1 = null;
        int stackIn_86_2 = 0;
        String stackIn_89_0 = null;
        Object stackIn_89_1 = null;
        String stackIn_90_0 = null;
        Object stackIn_90_1 = null;
        int stackIn_90_2 = 0;
        String stackIn_92_0;
        int stackIn_92_1;
        Object stackIn_92_2;
        int stackIn_92_3;
        String stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        Object stackIn_93_2 = null;
        int stackIn_93_3 = 0;
        int stackIn_93_4 = 0;
        String stackIn_95_0 = null;
        Object stackIn_95_1 = null;
        String stackIn_96_0 = null;
        Object stackIn_96_1 = null;
        int stackIn_96_2 = 0;
        Object stackIn_104_0 = null;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if ((this.field_a ^ -1) == -16) {
          br.field_a.a(120);
          return;
        } else {
          L0: {
            if (-2 == (this.field_a ^ -1)) {
              break L0;
            } else {
              if (24 == this.field_a) {
                break L0;
              } else {
                if (2 == this.field_a) {
                  break L0;
                } else {
                  if (-18 == (this.field_a ^ -1)) {
                    break L0;
                  } else {
                    if (-4 == (this.field_a ^ -1)) {
                      break L0;
                    } else {
                      if (this.field_a == 25) {
                        break L0;
                      } else {
                        if (19 == this.field_a) {
                          break L0;
                        } else {
                          if (4 == this.field_a) {
                            break L0;
                          } else {
                            if (this.field_a == 16) {
                              break L0;
                            } else {
                              L1: {
                                if (param0) {
                                  stackIn_15_0 = 0;
                                  break L1;
                                } else {
                                  stackIn_15_0 = 1;
                                  break L1;
                                }
                              }
                              fe.b(db.a(stackIn_15_0 != 0, 0), u.a(0, (byte) 94), rs.field_k, se.field_a, dq.field_i, nd.field_b, 0, 0);
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L2: {
            if (19 == this.field_a) {
              L3: {
                var2 = kr.field_D.a(this.field_a, (byte) -124);
                var3 = kr.field_D.a(-6, this.field_a) + -kr.field_D.a(this.field_a, (byte) -103) - (-kr.field_D.b(this.field_a, (byte) 122) + -(nr.field_e.a(mu.field_e, 500, 0) >> 1863786753));
                fe.b(kr.field_D.b(this.field_a, 29), -kr.field_D.b(this.field_a, (byte) 123) + var2, kr.field_D.a((byte) -61, this.field_a) - kr.field_D.b(this.field_a, 29), var3, io.field_m, nd.field_b, 0, 128);
                stackIn_89_0 = mu.field_e;

                stackIn_89_1 = this;

                if (param0) {
                  stackIn_90_0 = (String) ((Object) stackIn_89_0);
                  stackIn_90_1 = this;
                  stackIn_90_2 = 0;
                  break L3;
                } else {
                  stackIn_90_0 = (String) ((Object) stackIn_89_0);
                  stackIn_90_1 = this;
                  stackIn_90_2 = 1;
                  break L3;
                }
              }
              L4: {
                fe.a(stackIn_90_0, this.a(stackIn_90_2 != 0, 0) - -this.a(-1 + this.field_d.field_k, -3858) >> 1545414369, 20 + var2, 250, 16777215, true);
                stackIn_92_0 = wb.field_b[this.field_a];

                stackIn_92_1 = this.a(true, 0) + this.a(-1 + this.field_d.field_k, -3858) >> 1568773505;

                stackIn_92_2 = this;

                stackIn_92_3 = -1;

                if (param0) {
                  stackIn_93_0 = (String) ((Object) stackIn_92_0);
                  stackIn_93_1 = stackIn_92_1;
                  stackIn_93_2 = this;
                  stackIn_93_3 = stackIn_92_3;
                  stackIn_93_4 = 0;
                  break L4;
                } else {
                  stackIn_93_0 = (String) ((Object) stackIn_92_0);
                  stackIn_93_1 = stackIn_92_1;
                  stackIn_93_2 = this;
                  stackIn_93_3 = stackIn_92_3;
                  stackIn_93_4 = 1;
                  break L4;
                }
              }
              L5: {
                fe.b(stackIn_93_0, stackIn_93_1, this.a(stackIn_93_3, stackIn_93_4 != 0));
                stackIn_95_0 = wb.field_b[this.field_a];

                stackIn_95_1 = this;

                if (param0) {
                  stackIn_96_0 = (String) ((Object) stackIn_95_0);
                  stackIn_96_1 = this;
                  stackIn_96_2 = 0;
                  break L5;
                } else {
                  stackIn_96_0 = (String) ((Object) stackIn_95_0);
                  stackIn_96_1 = this;
                  stackIn_96_2 = 1;
                  break L5;
                }
              }
              fe.c(stackIn_96_0, this.a(stackIn_96_2 != 0, 0) - -this.a(-1 + this.field_d.field_k, -3858) >> -914775807, this.a(-1, true), nd.field_b, false);
              break L2;
            } else {
              if (25 == this.field_a) {
                L6: {
                  var2 = kr.field_D.a(this.field_a, (byte) -117);
                  var3 = kr.field_D.a(-6, this.field_a) + -kr.field_D.a(this.field_a, (byte) -119) - (-kr.field_D.b(this.field_a, (byte) -66) + -(nr.field_e.a(vd.field_a, 500, 0) >> -768223679));
                  fe.b(kr.field_D.b(this.field_a, 29), var2 - kr.field_D.b(this.field_a, (byte) 112), kr.field_D.a((byte) 94, this.field_a) + -kr.field_D.b(this.field_a, 29), var3, io.field_m, nd.field_b, 0, 128);
                  fe.a(vd.field_a, this.a(true, 0) + this.a(-1 + this.field_d.field_k, -3858) >> 1255588289, var2 + 20, 250, 16777215, true);
                  stackIn_82_0 = wb.field_b[this.field_a];

                  stackIn_82_1 = this.a(true, 0) + this.a(-1 + this.field_d.field_k, -3858) >> 76040257;

                  stackIn_82_2 = this;

                  stackIn_82_3 = -1;

                  if (param0) {
                    stackIn_83_0 = (String) ((Object) stackIn_82_0);
                    stackIn_83_1 = stackIn_82_1;
                    stackIn_83_2 = this;
                    stackIn_83_3 = stackIn_82_3;
                    stackIn_83_4 = 0;
                    break L6;
                  } else {
                    stackIn_83_0 = (String) ((Object) stackIn_82_0);
                    stackIn_83_1 = stackIn_82_1;
                    stackIn_83_2 = this;
                    stackIn_83_3 = stackIn_82_3;
                    stackIn_83_4 = 1;
                    break L6;
                  }
                }
                L7: {
                  fe.b(stackIn_83_0, stackIn_83_1, this.a(stackIn_83_3, stackIn_83_4 != 0));
                  stackIn_85_0 = wb.field_b[this.field_a];

                  stackIn_85_1 = this;

                  if (param0) {
                    stackIn_86_0 = (String) ((Object) stackIn_85_0);
                    stackIn_86_1 = this;
                    stackIn_86_2 = 0;
                    break L7;
                  } else {
                    stackIn_86_0 = (String) ((Object) stackIn_85_0);
                    stackIn_86_1 = this;
                    stackIn_86_2 = 1;
                    break L7;
                  }
                }
                fe.c(stackIn_86_0, this.a(stackIn_86_2 != 0, 0) - -this.a(this.field_d.field_k - 1, -3858) >> -452718495, this.a(-1, true), nd.field_b, false);
                break L2;
              } else {
                if (6 == this.field_a) {
                  L8: {
                    if (param0) {
                      stackIn_79_0 = 0;
                      break L8;
                    } else {
                      stackIn_79_0 = 1;
                      break L8;
                    }
                  }
                  fe.b(db.a(stackIn_79_0 != 0, 20), u.a(40, (byte) 94), 600, 420, io.field_m, nd.field_b, 0, 180);
                  fe.b(wb.field_b[this.field_a], db.a(true, 320), u.a(40, (byte) 94));
                  fe.c(wb.field_b[this.field_a], db.a(true, 320), u.a(40, (byte) 94), nd.field_b, false);
                  break L2;
                } else {
                  L9: {
                    if (-27 == (this.field_a ^ -1)) {
                      break L9;
                    } else {
                      if (this.field_a == 27) {
                        break L9;
                      } else {
                        if (28 == this.field_a) {
                          break L9;
                        } else {
                          if (18 != this.field_a) {
                            if ((this.field_a ^ -1) != -13) {
                              if (20 == this.field_a) {
                                fe.b(db.a(true, 15), u.a(30, (byte) 94), 610, 420, io.field_m, nd.field_b, 0, 180);
                                fe.b(kr.field_D.b(this.field_a, 29), kr.field_D.a(this.field_a, (byte) -108) - 10, kr.field_D.a((byte) -85, this.field_a) + -kr.field_D.b(this.field_a, 29), 10 + (kr.field_D.a(-6, this.field_a) - kr.field_D.a(this.field_a, (byte) -105)), io.field_m, nd.field_b, 0, 256);
                                this.l(-23588);
                                fe.b(wb.field_b[this.field_a], db.a(true, 320), u.a(30, (byte) 94));
                                fe.c(wb.field_b[this.field_a], db.a(true, 320), u.a(30, (byte) 94), nd.field_b, false);
                                break L2;
                              } else {
                                if (-14 != (this.field_a ^ -1)) {
                                  if (-1 != (this.field_a ^ -1)) {
                                    if (-8 != (this.field_a ^ -1)) {
                                      if (-6 == (this.field_a ^ -1)) {
                                        if (null == kr.field_E) {
                                          return;
                                        } else {
                                          kr.field_E.d((byte) -73);
                                          return;
                                        }
                                      } else {
                                        L10: {
                                          if ((this.field_a ^ -1) == -23) {
                                            break L10;
                                          } else {
                                            if (21 != this.field_a) {
                                              if ((this.field_a ^ -1) != -17) {
                                                L11: {
                                                  if (this.field_a == 8) {
                                                    break L11;
                                                  } else {
                                                    if (this.field_a == 9) {
                                                      break L11;
                                                    } else {
                                                      L12: {
                                                        if (1 == this.field_a) {
                                                          break L12;
                                                        } else {
                                                          if (-3 == (this.field_a ^ -1)) {
                                                            break L12;
                                                          } else {
                                                            if ((this.field_a ^ -1) == -18) {
                                                              break L12;
                                                            } else {
                                                              if (this.field_a == 24) {
                                                                break L12;
                                                              } else {
                                                                L13: {
                                                                  var2 = kr.field_D.a(this.field_a, (byte) -118);
                                                                  if (3 != this.field_a) {
                                                                    break L13;
                                                                  } else {
                                                                    if (ma.field_Z) {
                                                                      var2 -= 32;
                                                                      break L13;
                                                                    } else {
                                                                      break L13;
                                                                    }
                                                                  }
                                                                }
                                                                fe.b(kr.field_D.b(this.field_a, 29), var2 - kr.field_D.b(this.field_a, (byte) -64), kr.field_D.a((byte) 92, this.field_a) - kr.field_D.b(this.field_a, 29), kr.field_D.a(-6, this.field_a) + (-kr.field_D.a(this.field_a, (byte) -115) + kr.field_D.b(this.field_a, (byte) 112)), io.field_m, nd.field_b, 0, 128);
                                                                if (wb.field_b[this.field_a] == null) {
                                                                  break L2;
                                                                } else {
                                                                  fe.b(wb.field_b[this.field_a], this.a(true, 0) - -this.a(this.field_d.field_k + -1, -3858) >> -797717823, this.a(-1, true));
                                                                  fe.c(wb.field_b[this.field_a], this.a(true, 0) + this.a(this.field_d.field_k + -1, -3858) >> -2125764031, this.a(-1, true), nd.field_b, false);
                                                                  break L2;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var2 = kr.field_D.a(this.field_a, (byte) -102);
                                                      fe.b(kr.field_D.b(this.field_a, 29), var2 - kr.field_D.b(this.field_a, (byte) -34), kr.field_D.a((byte) 97, this.field_a) - kr.field_D.b(this.field_a, 29), (1 + kr.field_y[this.field_a].length) * kr.field_D.b(this.field_a, (byte) -121) + (kr.field_D.b(this.field_a, (byte) 117) >> 867281922), io.field_m, nd.field_b, 0, 128);
                                                      if (null == wb.field_b[this.field_a]) {
                                                        break L2;
                                                      } else {
                                                        L14: {
                                                          fe.b(wb.field_b[this.field_a], this.a(true, 0) + this.a(this.field_d.field_k - 1, -3858) >> 1422505793, this.a(-1, true));
                                                          stackIn_61_0 = wb.field_b[this.field_a];

                                                          stackIn_61_1 = this;

                                                          if (param0) {
                                                            stackIn_62_0 = (String) ((Object) stackIn_61_0);
                                                            stackIn_62_1 = this;
                                                            stackIn_62_2 = 0;
                                                            break L14;
                                                          } else {
                                                            stackIn_62_0 = (String) ((Object) stackIn_61_0);
                                                            stackIn_62_1 = this;
                                                            stackIn_62_2 = 1;
                                                            break L14;
                                                          }
                                                        }
                                                        fe.c(stackIn_62_0, this.a(stackIn_62_2 != 0, 0) - -this.a(-1 + this.field_d.field_k, -3858) >> 1836212193, this.a(-1, true), nd.field_b, false);
                                                        break L2;
                                                      }
                                                    }
                                                  }
                                                }
                                                L15: {
                                                  fe.b(db.a(true, 25), u.a(33, (byte) 94), 590, 414, io.field_m, nd.field_b, 0, 180);
                                                  fe.b(db.a(true, 42), u.a(48, (byte) 94), 556, 158, io.field_m, jh.field_k, 0, 256);
                                                  fe.b(db.a(true, 42), u.a(215, (byte) 94), 556, 205, io.field_m, jh.field_k, 0, 128);
                                                  fe.b(db.a(true, 52), u.a(228, (byte) 94), 191, 180, io.field_m, jh.field_k, 0, 128);
                                                  fe.b(db.a(true, 251), u.a(228, (byte) 94), 337, 180, io.field_m, jh.field_k, 0, 128);
                                                  if (param0) {
                                                    stackIn_66_0 = 0;
                                                    break L15;
                                                  } else {
                                                    stackIn_66_0 = 1;
                                                    break L15;
                                                  }
                                                }
                                                fe.b(db.a(stackIn_66_0 != 0, 30), u.a(431, (byte) 94), 581, 32, io.field_m, nd.field_b, 0, 256);
                                                if (null != wb.field_b[this.field_a]) {
                                                  var2 = u.a(33, (byte) 94);
                                                  fe.b(wb.field_b[this.field_a], kr.field_D.b(this.field_a, 29) - -kr.field_D.a((byte) -63, this.field_a) >> -1551840575, var2);
                                                  fe.c(wb.field_b[this.field_a], kr.field_D.b(this.field_a, 29) + kr.field_D.a((byte) -77, this.field_a) >> 1923194145, var2, nd.field_b, false);
                                                  break L2;
                                                } else {
                                                  break L2;
                                                }
                                              } else {
                                                hi.field_i.a(256);
                                                fe.b(-3 + kr.field_D.b(16, 29), kr.field_D.a(16, (byte) -118) - 3, 6 + (kr.field_D.a((byte) -83, 16) + -kr.field_D.b(16, 29)), 6 + this.d(12, 0), io.field_m, nd.field_b, 0, 128);
                                                break L2;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        fe.b(db.a(true, 15), u.a(30, (byte) 94), 610, 420, io.field_m, nd.field_b, 0, 180);
                                        kr.field_C.e((byte) 17);
                                        fe.b(kr.field_D.b(this.field_a, 29), kr.field_D.a(this.field_a, (byte) -119) - 10, kr.field_D.a((byte) 103, this.field_a) + -kr.field_D.b(this.field_a, 29), kr.field_D.a(-6, this.field_a) - (kr.field_D.a(this.field_a, (byte) -119) + -10), io.field_m, nd.field_b, 0, 256);
                                        break L2;
                                      }
                                    } else {
                                      this.f(-120);
                                      return;
                                    }
                                  } else {
                                    fe.b(kr.field_D.b(this.field_a, 29), kr.field_D.a(this.field_a, (byte) -106) - (-kr.field_D.b(this.field_a, (byte) -33) - 10), kr.field_D.a((byte) -125, this.field_a) - kr.field_D.b(this.field_a, 29), -10 + (kr.field_D.a(-6, this.field_a) + -kr.field_D.a(this.field_a, (byte) -125) + -kr.field_D.b(this.field_a, (byte) 113)), io.field_m, nd.field_b, 0, 128);
                                    fe.b(10 + kr.field_D.b(this.field_a, 29), 10 + kr.field_D.a(this.field_a, (byte) -104) + (kr.field_D.b(this.field_a, (byte) -22) + 10), -20 + kr.field_D.a((byte) 115, this.field_a) - kr.field_D.b(this.field_a, 29), kr.field_D.a(-6, this.field_a) + (-kr.field_D.a(this.field_a, (byte) -120) + -kr.field_D.b(this.field_a, (byte) -125) - 10) - 20, io.field_m, field_e, 0, 128);
                                    var2 = so.field_b.field_a;
                                    ol.field_y.g(var2 / 2 - ol.field_y.field_A / 2, 50 + kr.field_D.a(this.field_a, (byte) -111) - ol.field_y.field_x);
                                    break L2;
                                  }
                                } else {
                                  L16: {
                                    if (param0) {
                                      stackIn_34_0 = 0;
                                      break L16;
                                    } else {
                                      stackIn_34_0 = 1;
                                      break L16;
                                    }
                                  }
                                  fe.b(db.a(stackIn_34_0 != 0, 15), u.a(30, (byte) 94), 610, 420, io.field_m, nd.field_b, 0, 180);
                                  fe.b(kr.field_D.b(this.field_a, 29), kr.field_D.a(this.field_a, (byte) -127) - 10, kr.field_D.a((byte) 115, this.field_a) + -kr.field_D.b(this.field_a, 29), kr.field_D.a(-6, this.field_a) - (kr.field_D.a(this.field_a, (byte) -114) + -10), io.field_m, nd.field_b, 0, 256);
                                  this.i((byte) 41);
                                  fe.b(wb.field_b[this.field_a], db.a(true, 320), u.a(30, (byte) 94));
                                  fe.c(wb.field_b[this.field_a], db.a(true, 320), u.a(30, (byte) 94), nd.field_b, false);
                                  break L2;
                                }
                              }
                            } else {
                              L17: {
                                fe.b(db.a(true, 15), u.a(30, (byte) 94), 610, 420, io.field_m, nd.field_b, 0, 180);
                                fe.b(kr.field_D.b(this.field_a, 29), -10 + kr.field_D.a(this.field_a, (byte) -118), kr.field_D.a((byte) -101, this.field_a) - kr.field_D.b(this.field_a, 29), kr.field_D.a(-6, this.field_a) + -kr.field_D.a(this.field_a, (byte) -109) + 10, io.field_m, nd.field_b, 0, 256);
                                this.k(-128);
                                stackIn_27_0 = wb.field_b[this.field_a];

                                if (param0) {
                                  stackIn_28_0 = (String) ((Object) stackIn_27_0);
                                  stackIn_28_1 = 0;
                                  break L17;
                                } else {
                                  stackIn_28_0 = (String) ((Object) stackIn_27_0);
                                  stackIn_28_1 = 1;
                                  break L17;
                                }
                              }
                              fe.b(stackIn_28_0, db.a(stackIn_28_1 != 0, 320), u.a(30, (byte) 94));
                              fe.c(wb.field_b[this.field_a], db.a(true, 320), u.a(30, (byte) 94), nd.field_b, false);
                              break L2;
                            }
                          } else {
                            fe.b(db.a(true, 15), u.a(30, (byte) 94), 610, 420, io.field_m, nd.field_b, 0, 180);
                            fe.b(kr.field_D.b(this.field_a, 29), kr.field_D.a(this.field_a, (byte) -117) - 10, kr.field_D.a((byte) -73, this.field_a) - kr.field_D.b(this.field_a, 29), kr.field_D.a(-6, this.field_a) + (-kr.field_D.a(this.field_a, (byte) -125) + 10), io.field_m, nd.field_b, 0, 256);
                            this.m(100);
                            fe.b(wb.field_b[this.field_a], db.a(true, 320), u.a(30, (byte) 94));
                            fe.c(wb.field_b[this.field_a], db.a(true, 320), u.a(30, (byte) 94), nd.field_b, false);
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  L18: {
                    fe.b(db.a(true, 20), u.a(40, (byte) 94), 600, 420, io.field_m, nd.field_b, 0, 180);
                    fe.b(wb.field_b[this.field_a], db.a(true, 320), u.a(40, (byte) 94));
                    stackIn_74_0 = wb.field_b[this.field_a];

                    if (param0) {
                      stackIn_75_0 = (String) ((Object) stackIn_74_0);
                      stackIn_75_1 = 0;
                      break L18;
                    } else {
                      stackIn_75_0 = (String) ((Object) stackIn_74_0);
                      stackIn_75_1 = 1;
                      break L18;
                    }
                  }
                  fe.c(stackIn_75_0, db.a(stackIn_75_1 != 0, 320), u.a(40, (byte) 94), nd.field_b, false);
                  break L2;
                }
              }
            }
          }
          var2 = 0;
          if (!param0) {
            L19: while (true) {
              if (var2 >= this.field_d.field_k) {
                L20: {
                  if (this.field_a != 6) {
                    if (8 != this.field_a) {
                      if (9 == this.field_a) {
                        this.a(true, (byte) -4);
                        break L20;
                      } else {
                        if (this.field_a == 10) {
                          this.g(0);
                          break L20;
                        } else {
                          if ((this.field_a ^ -1) != -27) {
                            if ((this.field_a ^ -1) != -28) {
                              if (-29 != (this.field_a ^ -1)) {
                                if ((this.field_a ^ -1) != -12) {
                                  break L20;
                                } else {
                                  hh.field_i.a(pr.field_i, kr.field_D.b(11, 29) + 20, 20 + kr.field_D.a(11, (byte) -105), -40 + kr.field_D.a((byte) 105, 11) + -kr.field_D.b(11, 29), 1000, 16777215, -1, 0, 0, hh.field_i.field_H);
                                  break L20;
                                }
                              } else {
                                this.b((byte) 117);
                                break L20;
                              }
                            } else {
                              this.b((byte) 117);
                              break L20;
                            }
                          } else {
                            this.b((byte) 117);
                            break L20;
                          }
                        }
                      }
                    } else {
                      this.a(false, (byte) -4);
                      break L20;
                    }
                  } else {
                    this.a((byte) -121);
                    break L20;
                  }
                }
                return;
              } else {
                if (this.a((byte) 82, var2)) {
                  L21: {
                    stackIn_104_0 = this;

                    if (var2 != this.field_d.field_h) {
                      stackIn_105_0 = this;
                      stackIn_105_1 = 0;
                      break L21;
                    } else {
                      stackIn_105_0 = this;
                      stackIn_105_1 = 1;
                      break L21;
                    }
                  }
                  this.b(stackIn_105_1 != 0, var2, 28115);
                  var2++;
                  continue L19;
                } else {
                  var2++;
                  continue L19;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private final void f(byte param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 100) {
          L0: {
            if (!this.a((byte) 40, 0)) {
              stackIn_5_0 = 1;
              break L0;
            } else {
              stackIn_5_0 = 0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_5_0;
            if (!this.a((byte) -102, 2)) {
              stackIn_8_0 = 1;
              break L1;
            } else {
              stackIn_8_0 = 2;
              break L1;
            }
          }
          L2: {
            var3 = stackIn_8_0;
            if (!this.field_d.a(false)) {
              L3: {
                if ((rs.field_q ^ -1) != -97) {
                  break L3;
                } else {
                  if (this.field_d.field_h > var2) {
                    this.field_d.a(-1 + this.field_d.field_h, false);
                    break L3;
                  } else {
                    this.field_d.a(var3, false);
                    break L3;
                  }
                }
              }
              if ((rs.field_q ^ -1) != -98) {
                this.field_d.c(0);
                break L2;
              } else {
                L4: {
                  if (0 > this.field_d.field_h) {
                    break L4;
                  } else {
                    if (this.field_d.field_h >= var3) {
                      break L4;
                    } else {
                      this.field_d.a(this.field_d.field_h + 1, false);
                      this.field_d.c(0);
                      break L2;
                    }
                  }
                }
                this.field_d.a(var2, false);
                this.field_d.c(0);
                break L2;
              }
            } else {
              this.field_d.c(0);
              break L2;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final String f(int param0, int param1) {
        int[] var14 = bw.field_m[param0];
        int[] var13 = var14;
        int[] var12 = var13;
        int[] var3 = var12;
        int var4 = var14[2];
        int var5 = var14[3];
        int var6 = var14[4];
        int var7 = var14[5];
        int var8 = var14[6];
        int var9 = var14[7];
        int var10 = var14[param1];
        if (-35 != (param0 ^ -1)) {
            if (var8 == var9) {
                return fo.a(4800, jd.field_y, new String[]{Integer.toString(var4), Integer.toString(var5), Integer.toString(var6), Integer.toString(var7), Integer.toString(var8), Integer.toString(var10)});
            }
            return fo.a(4800, g.field_e, new String[]{Integer.toString(var4), Integer.toString(var5), Integer.toString(var6), Integer.toString(var7), Integer.toString(var8), Integer.toString(var9), Integer.toString(var10)});
        }
        int var11 = var8;
        var8 = bw.field_m[75][6];
        var9 = bw.field_m[75][7];
        return fo.a(param1 ^ 4808, vl.field_l, new String[]{Integer.toString(var4), Integer.toString(var5), Integer.toString(var6), Integer.toString(var7), Integer.toString(var11), Integer.toString(var8), Integer.toString(var9), Integer.toString(var10)});
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        q.field_D = param0 ? true : false;
        for (var2 = 0; -6 < (var2 ^ -1); var2++) {
            if (!(!ml.a(u.a(98, (byte) 94), db.a(true, 350 + 55 * var2), 22, false))) {
                pg.field_d.field_d[var2] = ev.field_d;
                ub.a((byte) 51, am.field_v[44]);
                ns.b(false);
                return;
            }
        }
    }

    private final int a(rg param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = -24 / ((-4 - param1) / 55);
              if (param0.field_j == null) {
                break L1;
              } else {
                var3_int = this.a(param0.field_j, (byte) -88);
                break L1;
              }
            }
            L2: {
              if (!ml.a(u.a(359, (byte) 94), db.a(true, 30 + var3_int * 50 + 30), 10, false)) {
                break L2;
              } else {
                L3: {
                  ih.field_p = param0;
                  this.a((byte) 116, -1, param0);
                  if (-1 != ev.field_d) {
                    wj.field_q = 248;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ab.field_a = ev.field_d;
                break L2;
              }
            }
            stackIn_8_0 = 1 + var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ci.N(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    private final int a(int param0, int param1) {
        int stackIn_12_0 = 0;
        L0: {
          if (param1 == -3858) {
            break L0;
          } else {
            field_f = (String[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_a ^ -1) != -7) {
              break L2;
            } else {
              if (!nw.g(param1 + 3964)) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (!nw.g(77)) {
              break L3;
            } else {
              if ((this.field_a ^ -1) == -9) {
                break L1;
              } else {
                if (-10 != (this.field_a ^ -1)) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
          }
          L4: {
            if (13 == this.field_a) {
              break L4;
            } else {
              if (-13 == (this.field_a ^ -1)) {
                break L4;
              } else {
                if (this.field_a == 18) {
                  break L4;
                } else {
                  if (20 == this.field_a) {
                    break L4;
                  } else {
                    L5: {
                      if (this.field_a != 7) {
                        break L5;
                      } else {
                        if (kr.field_G == null) {
                          break L5;
                        } else {
                          return kr.field_G.a(false, param0);
                        }
                      }
                    }
                    if (-8 == (this.field_a ^ -1)) {
                      return 1;
                    } else {
                      L6: {
                        if (this.field_a != 5) {
                          break L6;
                        } else {
                          if (null == kr.field_E) {
                            break L6;
                          } else {
                            return kr.field_E.b(true, param0);
                          }
                        }
                      }
                      if (5 == this.field_a) {
                        return 1;
                      } else {
                        return kr.field_D.a((byte) -71, this.field_a);
                      }
                    }
                  }
                }
              }
            }
          }
          return this.a((byte) -88, 1, param0);
        }
        L7: {
          if ((param0 ^ -1) <= -3) {
            stackIn_12_0 = 380;
            break L7;
          } else {
            stackIn_12_0 = 300 - -(240 * param0);
            break L7;
          }
        }
        return u.a(stackIn_12_0, (byte) 94);
    }

    private final void i(byte param0) {
        String discarded$0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        fe.a(db.a(true, 40), u.a(60, (byte) 94), 264, 260, tb.field_j, jh.field_k, 0, 128, false);
        na.field_F = ah.field_a.a(db.a(true, 55), 0, sm.field_d, wh.field_a, mv.field_d, u.a(70, (byte) 94), ko.field_b);
        var2 = 44;
        var3 = 0;
        L0: while (true) {
          if (-7 >= (var3 ^ -1)) {
            L1: {
              if (-1 < na.field_F) {
                na.field_F = na.field_F + 100;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3 = -1;
              if (sm.field_d <= db.a(true, 40)) {
                break L2;
              } else {
                if (sm.field_d >= db.a(true, 376)) {
                  break L2;
                } else {
                  if (ko.field_b <= u.a(330, (byte) 94)) {
                    break L2;
                  } else {
                    if (ko.field_b >= u.a(414, (byte) 94)) {
                      break L2;
                    } else {
                      var3 = (sm.field_d + -db.a(true, 40)) / 21 - -((ko.field_b - u.a(330, (byte) 94)) / 42 * 16);
                      break L2;
                    }
                  }
                }
              }
            }
            L3: {
              if ((na.field_F ^ -1) < 0) {
                na.field_F = na.field_F + 100;
                break L3;
              } else {
                na.field_F = var3;
                break L3;
              }
            }
            L4: {
              var4 = 0;
              if (param0 == 41) {
                break L4;
              } else {
                discarded$0 = this.e(13, -56);
                break L4;
              }
            }
            L5: while (true) {
              if (2 <= var4) {
                L6: {
                  var4 = -1;
                  if (0 <= (kd.field_X ^ -1)) {
                    L7: {
                      if ((ro.field_ub ^ -1) >= -1) {
                        stackIn_49_0 = 0;
                        break L7;
                      } else {
                        stackIn_49_0 = 1;
                        break L7;
                      }
                    }
                    var4 = ib.a(stackIn_49_0 != 0, 352, db.a(true, 380), ko.field_b, sm.field_d, 224, -1, -40, u.a(60, (byte) 94));
                    break L6;
                  } else {
                    L8: {
                      if ((ro.field_ub ^ -1) >= -1) {
                        stackIn_45_0 = 0;
                        break L8;
                      } else {
                        stackIn_45_0 = 1;
                        break L8;
                      }
                    }
                    var4 = ib.a(stackIn_45_0 != 0, 352, db.a(true, 380), ko.field_b, sm.field_d, 224, ah.field_a.field_a[kd.field_X], -40, u.a(60, (byte) 94));
                    break L6;
                  }
                }
                L9: {
                  if (0 <= (na.field_F ^ -1)) {
                    na.field_F = var4;
                    if (1 <= (na.field_F ^ -1)) {
                      break L9;
                    } else {
                      na.field_F = na.field_F + 300;
                      break L9;
                    }
                  } else {
                    na.field_F = na.field_F + 200;
                    break L9;
                  }
                }
                return;
              } else {
                var5 = 0;
                L10: while (true) {
                  if ((var5 ^ -1) <= -17) {
                    var4++;
                    continue L5;
                  } else {
                    L11: {
                      L12: {
                        var6 = db.a(true, 40 + 21 * var5);
                        var7 = u.a(42 * var4 + 330, (byte) 94);
                        if (kd.field_X <= -1) {
                          break L12;
                        } else {
                          if (var5 + var4 * 16 != ah.field_a.field_b[kd.field_X]) {
                            break L12;
                          } else {
                            fe.a(var6, var7, 20, 40, tb.field_j, nd.field_b, 0, 128, false);
                            break L11;
                          }
                        }
                      }
                      L13: {
                        if ((kd.field_X ^ -1) >= 0) {
                          break L13;
                        } else {
                          if (var5 - -(var4 * 16) != var3) {
                            break L13;
                          } else {
                            fe.a(var6, var7, 20, 40, tb.field_j, field_e, 0, 128, false);
                            break L11;
                          }
                        }
                      }
                      fe.a(var6, var7, 20, 40, tb.field_j, jh.field_k, 0, 128, false);
                      break L11;
                    }
                    if (-1 < kd.field_X) {
                      qn.f(db.a(true, var5 * 21 + 44), u.a(334 + var4 * 42, (byte) 94), 12, 32, bd.field_q[var5 - -(var4 * 16)]);
                      var5++;
                      continue L10;
                    } else {
                      var5++;
                      continue L10;
                    }
                  }
                }
              }
            }
          } else {
            L14: {
              L15: {
                var4 = db.a(true, 308);
                var5 = u.a(60 + var2 * var3, (byte) 94);
                if ((var4 ^ -1) <= (sm.field_d ^ -1)) {
                  break L15;
                } else {
                  if (var4 - -68 <= sm.field_d) {
                    break L15;
                  } else {
                    if (var5 >= ko.field_b) {
                      break L15;
                    } else {
                      if (60 + (var2 * (1 + var3) - 4) <= ko.field_b) {
                        break L15;
                      } else {
                        L16: {
                          if (var3 == wh.field_a) {
                            fe.a(var4, var5, 68, var2 - 4, tb.field_j, nd.field_b, 0, 128, false);
                            break L16;
                          } else {
                            fe.a(var4, var5, 68, -4 + var2, tb.field_j, field_e, 0, 128, false);
                            break L16;
                          }
                        }
                        na.field_F = var3;
                        break L14;
                      }
                    }
                  }
                }
              }
              if (wh.field_a == var3) {
                fe.a(var4, var5, 68, -4 + var2, tb.field_j, nd.field_b, 0, 128, false);
                break L14;
              } else {
                fe.a(var4, var5, 68, var2 + -4, tb.field_j, jh.field_k, 0, 128, false);
                break L14;
              }
            }
            wv.field_h[var3].g(db.a(true, 323), u.a(var2 * var3 - -66, (byte) 94));
            var3++;
            continue L0;
          }
        }
    }

    static {
        field_b = "Leather";
        field_f = new String[]{"Welcome to", "This is the main game screen. You can look around using the arrow keys, or by moving the mouse while holding down the right mouse button. Try this now.", "This is a barbarian chieftain. Barbarians are very important, as they are the only unit that can capture structures.</br>", "To select a unit, click on its base. Try this now.", "You will see that a status bar has appeared at the top of the screen. Holding the cursor over an icon will bring up an explanation of what that icon means.", "To move a selected unit, hover over the map tile where you wish it to move to. This will show the fastest route the unit can take to this tile. The highlighted green area shows where the unit can reach this turn. Click on a tile to move the unit towards it. Try this now", "Portals and villages are important resources to capture. Try moving your barbarian onto a portal or village.", "Well done - your barbarian unit is going to start capturing this village. Captured villages can be used to heal your units, and adds to your Mana each turn. You will see a small bar underneath the village; once this bar is full, you have captured the village. Once captured, a small flag in your army's colours will appear above the village.", "Well done - your barbarian has reached a portal. Capturing portals allows you to teleport additional units into your army. Control of portals is critical to victory. Once captured, the portal will glow with your army's colours.", "Excellent. Each of your units can only make one move per turn. End your turn now by clicking on the flashing \"End turn\" button.", "Each of your units can only make one move per turn. End your turn now by clicking on the flashing \"End turn\" button.", "Each turn lasts a fixed amount of time, as indicated by the clock in the top-left-hand corner of the screen. In a normal game, this will slowly count down the seconds remaining in your turn, but for the purposes of this tutorial it has been disabled.", "Now capture the empty portal by moving your barbarian unit on top of it.", "Now capture a village by moving your barbarian unit on top of it.", "Now click on the \"End turn\" button to continue.", "The village of Eastbridge has been captured by the enemy. You will need to teleport in more units before you can liberate it.", "Move your barbarian chieftain towards the bridge to Eastbridge. You will see an enemy unit there. To attack the enemy unit, simply click its base to see the route to it, then click again to attack. Your attack range for this turn is shown by the red map tiles. You can see which units can be attacked as they'll have red battle icons over their heads.", "Now you need to use your captured portal to teleport in more units. Click on the portal to select it.", "You can now see four orbs around the portal. Each coloured orb represents the forces of the gods of Gielinor, while the grey orb represents neutral forces. To begin, click on any orb.", "The units you can bring in are now displayed around the orb (darkened-out units are not available yet). Clicking on different orbs will present you with different selections of units. Moving your cursor over a unit gives you its statistics; clicking on the unit teleports it to the battlefield. Now, choose a unit to teleport into battle.", "Excellent. The more units you choose from a particular god, the more of that god's units will become available to you, as well as more neutral units. Your status with each god is represented by the small orbs at the bottom of the screen.", "Now feel free to bring in more units and fight the enemy in whatever way you wish. To win, you must defeat all enemy units and capture the enemy-controlled tower. Remember that only barbarians can capture structures. Good luck!", "Reminder: Defeat your enemies and capture the tower.", "Well done, brave hero! Eastbridge has been saved. Please take a look at the instructions for more information about the game, and for details of how to unlock new units.", "This screen shows combat close-up. Skipping it has no effect on the outcome of the battle. In multiplayer games, the clock will stop during your battles if you choose to watch them.", "Capturing a village normally takes two turns with a healthy barbarian; injured barbarians will take longer. A barbarian chieftain with full health can do it in one.", "The Game Status box shows you and your enemies' progress in the game. It shows you how many structures you have captured and how many there are in total. You can mouse over it for a more complete explanation.", "The bar at the bottom shows your Victory Points. It is disabled in the tutorial, but in live games, the first person in the game to fill this bar wins! The more structures you control, the faster it fills."};
    }
}
