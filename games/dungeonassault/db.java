/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends qe {
    private rh field_r;
    static String field_u;
    private ae field_w;
    private tf[] field_s;
    private rh field_t;
    static gp field_v;

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var8_int = 0;
        String var9 = null;
        int var10 = 0;
        Object var11 = null;
        String var12 = null;
        L0: {
          var10 = DungeonAssault.field_K;
          var2 = 241;
          field_v.c(fd.field_a, 213, var2, 16777215, -1);
          var3 = gm.field_d.field_w;
          if (null != fo.field_d.field_l) {
            var3 = ((Integer) fo.field_d.field_l.field_u).intValue();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var11 = null;
          if (!o.a(gj.field_c, (int[]) null, var3, gm.field_d, true)) {
            L2: {
              var4 = ib.a((byte) -15, 16760960, pj.a((byte) 66, var3, tc.field_u));
              var5 = jk.a(new String[1], dk.field_e, 30496);
              var6 = 127 & var3;
              if (wh.field_a > var6) {
                if (var6 >= cp.field_R) {
                  var7 = -cp.field_R + var6;
                  if (~var7 <= ~id.field_j.length) {
                    break L2;
                  } else {
                    var8 = ib.a((byte) 115, 16760960, ab.field_d[var7]);
                    var9 = ib.a((byte) 115, 16760960, ka.field_b[var7]);
                    var5 = jk.a(new String[3], uk.field_b, 30496);
                    break L2;
                  }
                } else {
                  if (~ok.field_z < ~var6) {
                    if (gn.field_d <= var6) {
                      var7 = var6 + -gn.field_d;
                      if (var7 < ci.field_s.length) {
                        var8_int = ci.field_s[var7];
                        var9 = ib.a((byte) 91, 16760960, Integer.toString(var8_int));
                        var5 = jk.a(new String[2], ac.field_f, 30496);
                        break L2;
                      } else {
                        int discarded$3 = la.field_b.a(var5, 75, 338, 260, 180, 8421504, -1, 1, 0, la.field_b.field_E + la.field_b.field_H);
                        break L1;
                      }
                    } else {
                      if (~uf.field_a < ~var6) {
                        if (~wm.field_a < ~var6) {
                          break L2;
                        } else {
                          var7 = -wm.field_a + var6;
                          if (~var7 > ~dc.field_p.length) {
                            var8_int = dc.field_p[var7];
                            var9 = ib.a((byte) -125, 16760960, Integer.toString(var8_int));
                            if (var8_int != 1) {
                              var5 = jk.a(new String[2], vj.field_i, 30496);
                              break L2;
                            } else {
                              var5 = jk.a(new String[2], be.field_m, 30496);
                              break L2;
                            }
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        L3: {
                          var7 = -uf.field_a + var6;
                          if (~var7 <= ~hb.field_m.length) {
                            break L3;
                          } else {
                            var8_int = hb.field_m[var7];
                            var9 = ib.a((byte) -128, 16760960, Integer.toString(var8_int));
                            if (1 == var8_int) {
                              var5 = jk.a(new String[2], tl.field_c, 30496);
                              break L3;
                            } else {
                              var5 = jk.a(new String[2], wf.field_y, 30496);
                              break L2;
                            }
                          }
                        }
                        break L2;
                      }
                    }
                  } else {
                    L4: {
                      var7 = -ok.field_z + var6;
                      if (~bl.field_n.length >= ~var7) {
                        break L4;
                      } else {
                        var8_int = bl.field_n[var7];
                        var9 = ib.a((byte) 6, 16760960, ce.field_o[var8_int]);
                        var5 = jk.a(new String[2], l.field_c, 30496);
                        break L4;
                      }
                    }
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            int discarded$4 = la.field_b.a(var5, 75, 338, 260, 180, 8421504, -1, 1, 0, la.field_b.field_E + la.field_b.field_H);
            break L1;
          } else {
            var12 = jk.a(new String[1], DungeonAssault.field_G, 30496);
            int discarded$5 = la.field_b.a(var12, 70, 338, 270, 180, 16760960, -1, 1, 0, la.field_b.field_H + la.field_b.field_E);
            break L1;
          }
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = tg.field_f[3][param0];
        String var4 = this.a(var3, 0);
        int var5 = ne.field_c.b(var4);
        int var6 = ne.field_c.field_E + ne.field_c.field_H;
        cn var7 = new cn(var5, var6);
        jh.a(var7);
        ne.field_c.b(var4, 0, ne.field_c.field_H, 16760960, -1);
        jh.b();
        ga.field_r = rb.a(8, var7, 16760960, (byte) 109);
        co.field_F = rb.a(16, var7, 6307840, (byte) -111);
        nf.field_y = param0;
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        L0: {
          var4 = tg.field_f[3][param1];
          var5 = this.a(var4, 0);
          var6 = ne.field_c.b(var5);
          var7 = bh.b(param1, 3, false);
          var8 = qd.a(param1, 380, 3);
          var9 = o.a(3, (byte) 101, param1);
          var10 = -var6 + (var7 + var8) >> 1;
          if (!ke.a(97, var4)) {
            var9 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var11 = rp.a(15204376, var4) ? 1 : 0;
          if (!param0) {
            if (var11 != 0) {
              var12 = ag.field_c;
              break L1;
            } else {
              var12 = tf.field_k;
              break L1;
            }
          } else {
            if (var11 == 0) {
              var12 = ug.field_E;
              break L1;
            } else {
              var12 = ml.field_b;
              break L1;
            }
          }
        }
        L2: {
          if (var11 == 0) {
            L3: {
              if (of.field_k) {
                if (var4 != 22) {
                  break L2;
                } else {
                  break L3;
                }
              } else {
                if (23 != var4) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            var12 = fo.field_c;
            break L2;
          } else {
            break L2;
          }
        }
        L4: {
          L5: {
            if (null == ((db) this).field_s[param1]) {
              break L5;
            } else {
              if (((db) this).field_s[param1].field_f != var5) {
                break L5;
              } else {
                if (((db) this).field_s[param1].field_h != var12) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
          }
          ((db) this).field_s[param1] = new tf((se) (Object) ne.field_c, var5, var12);
          break L4;
        }
        L6: {
          ((db) this).field_s[param1].b(var9, 32, var10);
          if (var4 != 22) {
            break L6;
          } else {
            if (~ak.field_o[0] < ~gm.field_d.field_m) {
              hj.field_T.h(-20 + var10, ne.field_c.field_H + var9 - 15);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          if (param0) {
            L8: {
              if (~param1 == ~nf.field_y) {
                break L8;
              } else {
                this.a(param1, (byte) -121);
                break L8;
              }
            }
            L9: {
              ga.field_r.b(var10, var9, 64);
              var13 = (int)((1.0 + te.a(mo.field_a)) * 128.0);
              if (var13 >= 0) {
                break L9;
              } else {
                var13 = 0;
                break L9;
              }
            }
            L10: {
              if (var13 <= 256) {
                break L10;
              } else {
                var13 = 256;
                break L10;
              }
            }
            co.field_F.b(var10, var9, var13);
            break L7;
          } else {
            break L7;
          }
        }
    }

    final void c() {
        super.c();
        ((db) this).field_s = null;
    }

    final void c(boolean param0) {
        bf[] var2 = null;
        int var2_int = 0;
        pp var2_ref = null;
        int var3 = 0;
        bf var4_ref_bf = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        bf[] var8 = null;
        pk var9 = null;
        int stackIn_26_0 = 0;
        pp stackIn_27_0 = null;
        pp stackIn_28_0 = null;
        pp stackIn_29_0 = null;
        pp stackIn_30_0 = null;
        pp stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_25_0 = 0;
        pp stackOut_26_0 = null;
        pp stackOut_27_0 = null;
        pp stackOut_28_0 = null;
        pp stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        pp stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        var6 = DungeonAssault.field_K;
        super.c(param0);
        var8 = wd.field_l;
        var2 = var8;
        var3 = 0;
        L0: while (true) {
          if (~var8.length >= ~var3) {
            L1: {
              L2: {
                if (!kh.field_s) {
                  break L2;
                } else {
                  if (param0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                this.b((byte) -50);
                if (hh.field_s == null) {
                  break L3;
                } else {
                  if (hh.field_s.field_u instanceof Integer) {
                    var2_int = ((Integer) hh.field_s.field_u).intValue();
                    var7 = null;
                    if (!o.a(gj.field_c, (int[]) null, var2_int, gm.field_d, true)) {
                      break L3;
                    } else {
                      gm.field_d.field_w = var2_int;
                      ac.field_B.d((byte) -106, 59);
                      ac.field_B.a(6, var2_int);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L4: while (true) {
                if (!ha.b((byte) 47)) {
                  break L1;
                } else {
                  ((db) this).f();
                  continue L4;
                }
              }
            }
            L5: {
              if (((db) this).field_b == null) {
                break L5;
              } else {
                if (!((db) this).field_b.field_d) {
                  break L5;
                } else {
                  L6: {
                    if (((db) this).field_b instanceof pk) {
                      var9 = (pk) (Object) ((db) this).field_b;
                      if (!var9.field_r) {
                        break L6;
                      } else {
                        this.a((byte) 111, var9.field_u);
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  ((db) this).field_b.c(-123);
                  ((db) this).field_b = null;
                  break L5;
                }
              }
            }
            L7: {
              if (null == mk.field_j.field_l) {
                hf.field_mb.field_w = false;
                var2_ref = hf.field_mb;
                var2_ref.field_D = false;
                break L7;
              } else {
                L8: {
                  L9: {
                    var2_int = ((lk) (Object) mk.field_j.field_l).field_O;
                    var3 = gm.field_d.field_J[var2_int] - -gm.field_d.field_F[var2_int];
                    var4 = (var3 + 10) * fj.field_g[var2_int] / 10;
                    if (!ve.a(false)) {
                      break L9;
                    } else {
                      if (var3 < 5) {
                        break L9;
                      } else {
                        if (!hm.field_m[var2_int]) {
                          break L9;
                        } else {
                          stackOut_24_0 = 1;
                          stackIn_26_0 = stackOut_24_0;
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  break L8;
                }
                L10: {
                  L11: {
                    var5 = stackIn_26_0;
                    hf.field_mb.field_D = og.field_e.field_N;
                    stackOut_26_0 = hf.field_mb;
                    stackIn_30_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (!hf.field_mb.field_D) {
                      break L11;
                    } else {
                      stackOut_27_0 = (pp) (Object) stackIn_27_0;
                      stackIn_30_0 = stackOut_27_0;
                      stackIn_28_0 = stackOut_27_0;
                      if (var5 != 0) {
                        break L11;
                      } else {
                        stackOut_28_0 = (pp) (Object) stackIn_28_0;
                        stackIn_30_0 = stackOut_28_0;
                        stackIn_29_0 = stackOut_28_0;
                        if (~var4 < ~gm.field_d.field_s) {
                          break L11;
                        } else {
                          stackOut_29_0 = (pp) (Object) stackIn_29_0;
                          stackOut_29_1 = 1;
                          stackIn_31_0 = stackOut_29_0;
                          stackIn_31_1 = stackOut_29_1;
                          break L10;
                        }
                      }
                    }
                  }
                  stackOut_30_0 = (pp) (Object) stackIn_30_0;
                  stackOut_30_1 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  break L10;
                }
                stackIn_31_0.field_w = stackIn_31_1 != 0;
                break L7;
              }
            }
            return;
          } else {
            var4_ref_bf = var8[var3];
            var4_ref_bf.a(-87);
            var3++;
            continue L0;
          }
        }
    }

    private final String a(int param0, int param1) {
        String var3 = null;
        L0: {
          var3 = ll.field_m[param0];
          if (param0 != 10) {
            break L0;
          } else {
            L1: {
              if (ec.field_p == 0) {
                break L1;
              } else {
                if (dc.field_z == 0) {
                  break L1;
                } else {
                  if (12 == ec.field_p) {
                    break L1;
                  } else {
                    if (dc.field_z == 12) {
                      break L1;
                    } else {
                      if (ec.field_p == 1) {
                        break L1;
                      } else {
                        if (dc.field_z == 1) {
                          break L1;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
            var3 = ll.field_m[9];
            break L0;
          }
        }
        return var3;
    }

    private final void b(int param0, int param1) {
        int var3 = tg.field_f[3][param1];
        int var4 = bh.b(param1, 3, false);
        int var5 = qd.a(param1, 380, 3);
        if (param0 < 60) {
            this.b((byte) -57);
        }
        int var6 = o.a(3, (byte) 110, param1);
        int var7 = kf.a(param1, 3, -114);
        if (ke.a(76, var3)) {
            gf.e(-4 + var4, -6 + var6, 8 + var5 + -var4, var7 + 8, 0);
            db.b(var4, var6 - 2, var5 + -var4, var7, 8421504, 128, 128);
            rp.a(4, var5 + -var4, (byte) 108, var4, var7, kc.field_S, var6 - 2);
            db.a(var4, -2 + var6, var5 + -var4, var7, 224, 64, 3, 128);
        } else {
            of.field_j.h(-of.field_j.field_y + (var4 + var5) >> 1, var6);
            var6 += 4;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var5_int = 0;
        ed var5 = null;
        int var6_int = 0;
        pp var6 = null;
        int var7 = 0;
        int var8 = 0;
        lk var9 = null;
        int var10 = 0;
        Object var11 = null;
        Object var12 = null;
        Object var13 = null;
        Object var14 = null;
        Object var15 = null;
        gd var16 = null;
        gd var17 = null;
        gd var18 = null;
        gd var19 = null;
        gd var20 = null;
        gd var21 = null;
        gd var22 = null;
        gd var23 = null;
        gd var24 = null;
        gd var25 = null;
        gd var26 = null;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_43_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var10 = DungeonAssault.field_K;
        var2 = 241;
        ((db) this).b();
        var3 = 0;
        fo.field_d = new nn(true);
        eh.field_o = new ed(90, var2 - -7, 250, -var2 + 328);
        ((db) this).field_p.a((ne) (Object) eh.field_o, false);
        var16 = this.a(var3, -1, -111, true);
        var3 = var3 + (var16.field_x + 3);
        var5_int = 0;
        L0: while (true) {
          if (bl.field_n.length <= var5_int) {
            var5_int = 0;
            L1: while (true) {
              L2: {
                if (~dc.field_p.length >= ~var5_int) {
                  break L2;
                } else {
                  L3: {
                    var6_int = var5_int + wm.field_a;
                    var12 = null;
                    if (!o.a(gj.field_c, (int[]) null, var6_int, gm.field_d, true)) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L3;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      break L3;
                    }
                  }
                  L4: {
                    var7 = stackIn_14_0;
                    var19 = this.a(var3, var6_int, 2, var7 != 0);
                    var3 = var3 + (var19.field_x - -3);
                    if (!bh.a(117, var6_int).equals((Object) (Object) bh.a(122, rj.field_l + var6_int))) {
                      var20 = this.a(var3, var6_int + rj.field_l, 99, var7 != 0);
                      var3 = var3 + (3 + var20.field_x);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var7 == 0) {
                    break L2;
                  } else {
                    var5_int++;
                    continue L1;
                  }
                }
              }
              var5_int = 0;
              L5: while (true) {
                L6: {
                  if (~hb.field_m.length >= ~var5_int) {
                    break L6;
                  } else {
                    L7: {
                      var6_int = uf.field_a + var5_int;
                      var13 = null;
                      if (!o.a(gj.field_c, (int[]) null, var6_int, gm.field_d, true)) {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        break L7;
                      } else {
                        stackOut_22_0 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        break L7;
                      }
                    }
                    L8: {
                      var7 = stackIn_24_0;
                      var21 = this.a(var3, var6_int, -117, var7 != 0);
                      var3 = var3 + (var21.field_x + 3);
                      if (bh.a(120, var6_int).equals((Object) (Object) bh.a(120, var6_int - -rj.field_l))) {
                        break L8;
                      } else {
                        var22 = this.a(var3, rj.field_l + var6_int, 47, var7 != 0);
                        var3 = var3 + (var22.field_x - -3);
                        break L8;
                      }
                    }
                    if (var7 == 0) {
                      break L6;
                    } else {
                      var5_int++;
                      continue L5;
                    }
                  }
                }
                var5_int = 0;
                L9: while (true) {
                  L10: {
                    if (~var5_int <= ~ci.field_s.length) {
                      break L10;
                    } else {
                      L11: {
                        var6_int = var5_int + gn.field_d;
                        var14 = null;
                        if (!o.a(gj.field_c, (int[]) null, var6_int, gm.field_d, true)) {
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          break L11;
                        } else {
                          stackOut_31_0 = 1;
                          stackIn_33_0 = stackOut_31_0;
                          break L11;
                        }
                      }
                      L12: {
                        var7 = stackIn_33_0;
                        var23 = this.a(var3, var6_int, -112, var7 != 0);
                        var3 = var3 + (var23.field_x - -3);
                        if (!bh.a(120, var6_int).equals((Object) (Object) bh.a(119, rj.field_l + var6_int))) {
                          var24 = this.a(var3, var6_int - -rj.field_l, 18, var7 != 0);
                          var3 = var3 + (var24.field_x - -3);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      if (var7 == 0) {
                        break L10;
                      } else {
                        var5_int++;
                        continue L9;
                      }
                    }
                  }
                  var5_int = 0;
                  L13: while (true) {
                    if (id.field_j.length <= var5_int) {
                      mk.field_j = new nn(true);
                      og.field_e = new ed(90, 7 + var2, 250, -var2 + 328);
                      var5 = og.field_e;
                      og.field_e.field_N = false;
                      var5.field_w = false;
                      ((db) this).field_p.a((ne) (Object) og.field_e, false);
                      hf.field_mb = tn.a(-(kg.field_a.field_y / 2) + (363 + (200 - ao.field_n.field_E >> 1)) - -(ao.field_n.field_E / 2), 337, (se) (Object) field_v, kg.field_a, -81, bg.field_x.toUpperCase());
                      var6 = hf.field_mb;
                      hf.field_mb.field_D = false;
                      var6.field_w = false;
                      var3 = 0;
                      ((db) this).field_p.a((ne) (Object) hf.field_mb, false);
                      var7 = 1;
                      var8 = 0;
                      L14: while (true) {
                        if (var8 >= 6) {
                          og.field_e.e(49);
                          og.field_e.c(107, 8);
                          return;
                        } else {
                          L15: {
                            if (gm.field_d.field_m < ak.field_o[var8]) {
                              break L15;
                            } else {
                              if (cf.field_b[var8]) {
                                var9 = new lk(0, var3, 200, 40, var8);
                                og.field_e.a((rj) (Object) var9, (byte) -101);
                                var3 += 40;
                                mk.field_j.a((gd) (Object) var9, (byte) -20);
                                if (var7 != 0) {
                                  var7 = 0;
                                  mk.field_j.a((gd) (Object) var9, -256);
                                  break L15;
                                } else {
                                  break L15;
                                }
                              } else {
                                break L15;
                              }
                            }
                          }
                          var8++;
                          continue L14;
                        }
                      }
                    } else {
                      L16: {
                        var6_int = cp.field_R - -var5_int;
                        var15 = null;
                        if (!o.a(gj.field_c, (int[]) null, var6_int, gm.field_d, true)) {
                          stackOut_42_0 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          break L16;
                        } else {
                          stackOut_41_0 = 1;
                          stackIn_43_0 = stackOut_41_0;
                          break L16;
                        }
                      }
                      L17: {
                        var7 = stackIn_43_0;
                        var25 = this.a(var3, var6_int, -121, var7 != 0);
                        var3 = var3 + (3 + var25.field_x);
                        if (!bh.a(122, var6_int).equals((Object) (Object) bh.a(121, rj.field_l + var6_int))) {
                          var26 = this.a(var3, rj.field_l + var6_int, -111, var7 != 0);
                          var3 = var3 + (3 + var26.field_x);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      var5_int++;
                      continue L13;
                    }
                  }
                }
              }
            }
          } else {
            L18: {
              var6_int = ok.field_z - -var5_int;
              var11 = null;
              if (!o.a(gj.field_c, (int[]) null, var6_int, gm.field_d, true)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L18;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L18;
              }
            }
            L19: {
              var7 = stackIn_5_0;
              var17 = this.a(var3, var6_int, 32, var7 != 0);
              var3 = var3 + (3 + var17.field_x);
              if (bh.a(126, var6_int).equals((Object) (Object) bh.a(123, var6_int - -rj.field_l))) {
                break L19;
              } else {
                var18 = this.a(var3, rj.field_l + var6_int, -7, var7 != 0);
                var3 = var3 + (3 + var18.field_x);
                break L19;
              }
            }
            var5_int++;
            continue L0;
          }
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        if (super.d()) {
            return;
        }
        ((db) this).field_w.a(-7734, this.a(hm.field_k, lc.field_c, (byte) -117), this.a(eh.field_h, hj.field_S, (byte) -117));
        if (param0 != -50) {
            ((db) this).field_w = null;
        }
        if (!(((db) this).field_w.field_b == -1)) {
            this.a(((db) this).field_w.field_b, -1, true);
        }
        if ((Object) (Object) hh.field_s == (Object) (Object) hf.field_mb) {
            var2 = ((lk) (Object) mk.field_j.field_l).field_O;
            if (0 == gm.field_d.field_e) {
                ((db) this).field_b = (kl) (Object) new pk(ag.field_b, oj.field_c, var2);
            } else {
                this.a((byte) 88, var2);
            }
        }
    }

    private final void a(byte param0, int param1) {
        gm.field_d.field_F[param1] = gm.field_d.field_F[param1] + 1;
        gm.field_d.field_e = gm.field_d.field_e + 1;
        int var3 = gm.field_d.field_F[param1] + gm.field_d.field_J[param1];
        if (param0 <= 29) {
            return;
        }
        int var4 = fj.field_g[param1] * (var3 + 10) / 10;
        gm.field_d.field_s = gm.field_d.field_s - var4;
        if (gm.field_d.field_A != -1) {
            gm.field_d.field_A = fm.field_i + (int)(-16912800L + kd.c(-2456) / 60000L);
        }
        ac.field_B.d((byte) -79, 73);
        ac.field_B.a(6, param1);
        hi.b(1);
    }

    private final void a(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        long var15 = 0L;
        String var17 = null;
        int var18 = 0;
        lb var19 = null;
        int var20 = 0;
        lb var21 = null;
        L0: {
          var18 = DungeonAssault.field_K;
          var19 = gm.field_d;
          var21 = var19;
          var3 = 370;
          var4 = 130;
          var5 = kk.field_l.field_E + kk.field_l.field_H;
          var6 = 40;
          gf.b(var3 - 3, var4 + -16, 186, 70, 16777215, var6);
          field_v.b(jk.a(new String[1], kk.field_s, 30496), var3, var4, 0, -1);
          var4 += 16;
          field_v.b(jk.a(new String[1], mm.field_j, 30496), var3, var4, 0, -1);
          var4 += 16;
          field_v.b(jk.a(new String[1], bp.field_h, 30496), var3, var4, 0, -1);
          var4 += 16;
          var7 = 60 * (int)(0.5 + Math.pow(2.0, (double)(-var21.field_N) / 10000.0) * 250.0) / 60;
          var7 = var7 + 10 * gm.field_d.field_J[2];
          kk.field_l.b(jk.a(new String[1], la.field_j, 30496), var3, var4, 0, -1);
          var8 = 9;
          var4 = var4 + (var8 + 16);
          if (var21.field_B > 0) {
            var9 = jk.a(new String[3], ip.field_k, 30496);
            var10 = var9;
            var10 = var9;
            break L0;
          } else {
            var9 = wa.field_f;
            break L0;
          }
        }
        L1: {
          if (var21.field_y > 0) {
            var10 = jk.a(new String[3], ip.field_k, 30496);
            break L1;
          } else {
            var10 = jk.a(new String[3], uh.field_V, 30496);
            break L1;
          }
        }
        L2: {
          var11 = -55 + bl.field_s.field_y;
          var12 = 2 + kk.field_l.c(var9, var11) - -kk.field_l.c(var10, var11);
          gf.b(-3 + var3, -16 + var4, 186, 6 + var12 * 16, 16777215, var6);
          field_v.b(p.field_r, var3, var4, 0, -1);
          var4 += 16;
          var12 = kk.field_l.a(var9, 10 + var3, -var5 + var4, var11, 100, 0, -1, 0, 0, var5);
          var4 = var4 + 16 * var12;
          field_v.b(rb.field_M, var3, var4, 0, -1);
          var4 += 16;
          var12 = kk.field_l.a(var10, var3 - -10, -var5 + var4, var11, 100, 0, -1, 0, 0, var5);
          var4 = var4 + (16 * var12 + var8);
          if (var19.field_t[0] != -1L) {
            var12 = 0;
            var13 = var4;
            var14 = 0;
            L3: while (true) {
              L4: {
                if (10 <= var14) {
                  break L4;
                } else {
                  var15 = var21.field_t[var14];
                  if (-1L == var15) {
                    break L4;
                  } else {
                    var12++;
                    var4 = var4 + kk.field_l.field_H;
                    if (var4 <= 350) {
                      var14++;
                      continue L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var4 = var13;
              gf.b(var3 - 3, var4 - 16, 186, 20 + kk.field_l.field_H * 6, 16777215, var6);
              field_v.b(oh.field_o, var3, var4, 0, -1);
              var4 += 16;
              var20 = 0;
              var14 = var20;
              L5: while (true) {
                if (var20 >= 10) {
                  break L2;
                } else {
                  var15 = var21.field_t[var20];
                  if (var15 != -1L) {
                    var17 = uj.a(var15, -1);
                    kk.field_l.b(var17, var3 + 10, var4, 14352640, -1);
                    var4 = var4 + kk.field_l.field_H;
                    if (var4 <= 350) {
                      var20++;
                      continue L5;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
          } else {
            break L2;
          }
        }
        this.b(-121);
    }

    final void b(boolean param0) {
        int var3 = 0;
        int var4 = DungeonAssault.field_K;
        super.b(param0);
        tg.field_f[3] = nb.field_e;
        ((db) this).field_w = new ae(tg.field_f[3].length);
        fk.a((byte) 121, lf.field_w);
        jh.a(((db) this).field_e);
        bf.a(false, -128);
        int[] var7 = new int[4];
        int[] var6 = var7;
        int[] var5 = var6;
        int[] var2 = var5;
        gf.a(var7);
        gf.e(41, 48, 599, 416);
        am.field_a.h(-(am.field_a.field_E / 2) + 320, 48);
        gf.b(var7);
        jh.b();
        ((db) this).field_s = new tf[((db) this).field_w.field_i];
        this.a((byte) -127);
        wd.field_l = new bf[6];
        for (var3 = 0; var3 < 6; var3++) {
            wd.field_l[var3] = new bf(sf.field_b[var3]);
        }
        ((db) this).field_r = new rh(58, 394, 80, 160, 255, 197376, 240);
        ((db) this).field_t = new rh(580, 394, 80, 160, 255, 197376, 240);
        mh.b(-1);
    }

    private final gd a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        int var14 = 0;
        cn var15 = null;
        cn var16 = null;
        gd var17 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param3) {
            stackOut_2_0 = 16777215;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 8421504;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param3) {
            stackOut_5_0 = 8421616;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 4210816;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (!param3) {
            stackOut_8_0 = 65793;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 12690143;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          var8 = u.a((se) (Object) field_v, (byte) 68, tc.field_u, param1, var5, eh.field_o.field_q - 25);
          var9 = field_v.b(var8);
          var10 = field_v.field_H + la.field_b.field_E;
          var11 = new cn(var9, var10);
          var12 = new cn(var9, var10);
          var13 = new cn(var9, var10);
          jh.c();
          var11.e();
          field_v.b(var8, 0, la.field_b.field_H, var6, -1);
          var12.e();
          gf.a();
          var11.e(0, 0, 16744448);
          var13.e();
          gf.a();
          var11.e(0, 0, var7);
          var14 = -55 % ((-49 - param2) / 36);
          jh.b();
          var15 = rb.a(16, var12, 255, (byte) 81);
          var16 = rb.a(16, var12, 16711680, (byte) -44);
          var17 = new gd(var11, var13, var15, var12, var16, 0, param0);
          var17.field_u = (Object) (Object) new Integer(param1);
          eh.field_o.a((rj) (Object) var17, (byte) -49);
          fo.field_d.a(var17, (byte) -20);
          if (gm.field_d.field_w != param1) {
            break L3;
          } else {
            fo.field_d.a(var17, -256);
            break L3;
          }
        }
        return var17;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        rj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        var7 = DungeonAssault.field_K;
        ((db) this).field_e.b(0, 0);
        var2 = 0;
        L0: while (true) {
          if (~((db) this).field_w.field_i >= ~var2) {
            var9 = new int[4];
            gf.a(var9);
            gf.e(41, 48, 599, 416);
            var3 = 10;
            var4 = 88;
            le.field_f.h(40 + var3, var4 - 28);
            dh.a(32, 360, 220, 120);
            gf.b(var9);
            gf.b(80, 250, 256, 85, 1118481, 128);
            gf.e(80, 250, 256, 85, 5592405, 128);
            var5 = (rj) (Object) ((db) this).field_p.e(-24172);
            L1: while (true) {
              if (var5 == null) {
                L2: {
                  if (null != ((db) this).field_b) {
                    ((db) this).field_b.a((byte) -118);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                oe.field_m.h(24, 383);
                oe.field_m.j(560, 383);
                db.e();
                ((db) this).field_r.d();
                ((db) this).field_t.d();
                var6 = 0;
                L3: while (true) {
                  if (((db) this).field_w.field_i <= var6) {
                    L4: {
                      if (!of.field_k) {
                        this.a(197376);
                        break L4;
                      } else {
                        this.d(true);
                        break L4;
                      }
                    }
                    var5 = (rj) (Object) ((db) this).field_p.e(-24172);
                    L5: while (true) {
                      if (var5 == null) {
                        L6: {
                          if (null == ((db) this).field_b) {
                            break L6;
                          } else {
                            ((db) this).field_b.b(117);
                            break L6;
                          }
                        }
                        bf.field_m.a(320, 25, 1699);
                        return;
                      } else {
                        var5.d(0);
                        var5 = (rj) (Object) ((db) this).field_p.a(4);
                        continue L5;
                      }
                    }
                  } else {
                    L7: {
                      if (sg.a(3, 3, var6)) {
                        L8: {
                          stackOut_16_0 = this;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          if (((db) this).field_w.field_b != var6) {
                            stackOut_18_0 = this;
                            stackOut_18_1 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            stackIn_19_1 = stackOut_18_1;
                            break L8;
                          } else {
                            stackOut_17_0 = this;
                            stackOut_17_1 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            stackIn_19_1 = stackOut_17_1;
                            break L8;
                          }
                        }
                        this.a(stackIn_19_1 != 0, var6, 123);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var6++;
                    continue L3;
                  }
                }
              } else {
                var5.a(102);
                var5 = (rj) (Object) ((db) this).field_p.a(4);
                continue L1;
              }
            }
          } else {
            L9: {
              if (sg.a(3, 3, var2)) {
                this.b(83, var2);
                break L9;
              } else {
                break L9;
              }
            }
            var2++;
            continue L0;
          }
        }
    }

    private final void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var9 = DungeonAssault.field_K;
          var2 = 461;
          if (param0) {
            break L0;
          } else {
            ((db) this).field_t = null;
            break L0;
          }
        }
        L1: {
          var3 = 170;
          if (null == mk.field_j.field_l) {
            break L1;
          } else {
            L2: {
              L3: {
                gf.b(370, 110, 182, 124, 0, 208);
                var4_int = ((lk) (Object) mk.field_j.field_l).field_O;
                wd.field_l[var4_int].a(var3, var2, true, 100);
                field_v.c(li.field_b[var4_int], var2, var3 - -90, 0, -1);
                var5 = gm.field_d.field_J[var4_int] + gm.field_d.field_F[var4_int];
                if (!ve.a(false)) {
                  break L3;
                } else {
                  if (!hm.field_m[var4_int]) {
                    break L3;
                  } else {
                    if (var5 < 5) {
                      break L3;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L2;
            }
            var6_int = stackIn_8_0;
            if (var6_int != 0) {
              int discarded$4 = la.field_b.a(bl.field_b, -80 + var2, var3 + 120, 160, 100, 0, -1, 1, 0, la.field_b.field_H);
              break L1;
            } else {
              L4: {
                var7 = (10 + var5) * fj.field_g[var4_int] / 10;
                if (var7 <= gm.field_d.field_s) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L4;
                } else {
                  stackOut_10_0 = 16711680;
                  stackIn_12_0 = stackOut_10_0;
                  break L4;
                }
              }
              var8 = stackIn_12_0;
              field_v.c(jk.a(new String[1], ho.field_c, 30496), var2, 105 + var3, var8, -1);
              int discarded$5 = la.field_b.a(un.field_a[var4_int], -80 + var2, var3 - -120, 160, 100, 0, -1, 1, 0, la.field_b.field_H);
              break L1;
            }
          }
        }
        L5: {
          var4 = ng.field_L;
          var5 = 16777215;
          if (0 < gm.field_d.field_e) {
            L6: {
              if (1 < gm.field_d.field_e) {
                var4 = jk.a(new String[1], dg.field_G, 30496);
                break L6;
              } else {
                var4 = oc.field_v;
                break L6;
              }
            }
            var5 = 16711680;
            var6 = jk.a(new String[1], fl.field_n, 30496);
            int discarded$6 = la.field_b.a(var6, 80, 338, 250, 180, var5, -1, 1, 0, field_v.field_H);
            break L5;
          } else {
            break L5;
          }
        }
        int discarded$7 = la.field_b.a(var4, 80, -la.field_b.field_H + 211, 250, 45, var5, -1, 1, 2, field_v.field_H);
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        L0: {
          var4 = tg.field_f[3][param0];
          if (param1 == -1) {
            break L0;
          } else {
            field_u = null;
            break L0;
          }
        }
        L1: {
          if (!((db) this).field_w.c(97)) {
            break L1;
          } else {
            L2: {
              if (!sg.a(3, 3, param0)) {
                break L2;
              } else {
                if (rp.a(param1 ^ -15204377, var4)) {
                  hm.a(var4, param0, param2, -64);
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            break L1;
          }
        }
    }

    final void f() {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (mm.field_t == 13) {
          gd.a(ec.field_p, 0, ec.field_p, false);
          return;
        } else {
          L0: {
            if (!ll.field_k) {
              break L0;
            } else {
              if (mm.field_t != 1) {
                break L0;
              } else {
                L1: {
                  if (ld.field_b) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                ld.field_b = stackIn_8_0 != 0;
                break L0;
              }
            }
          }
          if (null != ((db) this).field_b) {
            ((db) this).field_b.b(false);
            return;
          } else {
            L2: {
              ((db) this).field_w.d(0);
              if (((db) this).field_w.field_b == -1) {
                break L2;
              } else {
                this.a(((db) this).field_w.field_b, -1, false);
                break L2;
              }
            }
            return;
          }
        }
    }

    private final int a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        for (var4 = 0; ~tg.field_f[3].length < ~var4; var4++) {
            var5 = o.a(3, (byte) 95, var4);
            if (sg.a(3, 3, var4)) {
                if (param1 >= bh.b(var4, 3, false)) {
                    if (~qd.a(var4, 380, 3) < ~param1) {
                        if (param0 >= var5) {
                            if (~param0 > ~(var5 - -kf.a(var4, 3, -100))) {
                                return var4;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static void c(byte param0) {
        field_v = null;
        if (param0 < 87) {
            field_u = null;
        }
        field_u = null;
    }

    db() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Quit to website";
    }
}
