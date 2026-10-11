/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nc {
    static cj field_e;
    int[] field_j;
    hh field_g;
    int field_i;
    private int field_b;
    private boolean field_f;
    static String field_c;
    static int field_h;
    int field_a;
    int field_d;
    int field_k;

    final void c(int param0) {
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_d == 2) {
          this.field_b = this.field_b - ah.field_e.field_C / 2;
          this.field_j = new int[]{1, 12, 13, 34, 47, 4, 50, 3, 7};
          this.field_g = new hh(this.field_j.length);
        } else {
          if (3 == this.field_d) {
            this.field_j = new int[]{48, 5};
            this.field_g = new hh(this.field_j.length);
          } else {
            if (this.field_d == 5) {
              this.field_j = new int[]{5};
              this.field_g = new hh(this.field_j.length);
            }
          }
        }
        if (param0 != 1) {
          nc.a((byte) -25);
        }
    }

    private final void a(boolean param0, int param1) {
        int var4 = 0;
        int var3 = 0;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var3Lifetime1;
        if (cp.field_K) {
          bi.field_e = true;
          kk.a(-97, 0, 11);
        } else {
          if (df.field_I) {
            var3 = pp.field_n ? 1 : 0;
            wb.l((byte) 124);
            if (var3 == 0) {
              var4 = param0 ? 1 : 0;
              bm.a(var4 != 0, 15, 127, sp.field_g);
            } else {
              var4 = param0 ? 1 : 0;
              bm.a(var4 != 0, 1, 125, sp.field_g);
            }
          }
        }
        if (param1 != 200) {
          this.field_b = 82;
        }
        var3Lifetime1 = param0 ? 1 : 0;
        bm.a(var3Lifetime1 != 0, -5, 126, sp.field_g);
    }

    public static void b(boolean param0) {
        field_c = null;
        if (param0) {
          return;
        }
        field_e = null;
    }

    boolean c(int param0, int param1) {
        if (this.field_j[param0] == 39) {
          return false;
        }
        if (this.field_j[param0] == 21 &&
          fb.field_e.g(param1 - 16777149) == 0) {
          return false;
        }
        if (param1 != 16777215) {
          this.field_a = -71;
          return true;
        }
        return true;
    }

    final static boolean a(byte param0) {
        int var1;
        boolean stackIn_5_0 = false;
        var1 = 91 % ((param0 - 33) / 35);
        stackIn_5_0 = (ki.field_e != null) || (ee.field_b);
        return stackIn_5_0;
    }

    int a(byte param0, int param1) {
        if (param0 != -118) {
          this.b((byte) -12);
        }
        if (!this.field_f) {
          return this.field_i + this.field_k * param1;
        }
        return this.field_i;
    }

    final void b(int param0) {
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 0) {
          this.field_d = -56;
        }
        L1: {
          if (this.field_d != 1) {
            if (this.field_d != 2 &&
              13 != this.field_d) {
              if (this.field_d != 3 &&
                this.field_d != 5 &&
                6 != this.field_d &&
                this.field_d != 7 &&
                14 != this.field_d &&
                8 != this.field_d) {
                if (this.field_d == 15) {
                  oo.e(0, 0, 640, 480, 16777215);
                  oo.h(0, 0, 640, 5);
                  dd.field_g.d(0, 0);
                  oo.h(0, 5, 640, 480);
                  dd.field_g.d(0, -32);
                  v.field_e.d(0, 448 - (pi.field_f.field_b + v.field_e.field_b));
                  oo.h(4, 330, 636, 335);
                  dd.field_g.d(0, 330);
                  oo.h(0, 335, 640, 419);
                  v.field_e.d(0, 300);
                  oo.c();
                  pi.field_f.d(0, 480 - pi.field_f.field_b);
                  break L1;
                }
                if (4 == this.field_d) {
                  dd.field_g.d(0, 0);
                  v.field_e.d(0, -v.field_e.field_b + (480 - pi.field_f.field_b));
                  pi.field_f.d(0, -pi.field_f.field_b + 480);
                } else {
                  if (this.field_d == 10) {
                    dd.field_g.d(0, 0);
                    v.field_e.d(0, -v.field_e.field_b + (-pi.field_f.field_b + 480));
                    pi.field_f.d(0, -pi.field_f.field_b + 480);
                  } else {
                    if (9 == this.field_d) {
                      of.field_e[4].c(0, 0);
                    } else {
                      if (this.field_d == 11) {
                        oo.e(0, 0, 640, 480, 65793);
                      } else {
                        if ((this.field_d == 12)) {
                          oo.e(0, 0, 640, 480, 65793);
                        }
                      }
                    }
                  }
                }
              } else {
                dd.field_g.d(0, 0);
                v.field_e.d(0, -v.field_e.field_b - pi.field_f.field_b + 480);
                pi.field_f.d(0, 480 - pi.field_f.field_b);
              }
              break L1;
            }
            of.field_e[0].c(0, 0);
          } else {
            of.field_e[0].c(0, 0);
          }
        }
    }

    final void d(int param0) {
        if (null != ao.field_b[this.field_d]) {
          ao.field_b[this.field_d].g(0, this.field_d == 15 ? 6 : 13);
        }
        if (param0 != 4) {
          this.field_f = false;
        }
    }

    void b(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int[] var14;
        int[] var15;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = this.field_j[param2];
        var6 = var4;
        if (var6 == 40) {
          if (this.field_g.c(-85)) {
            df.field_I = false;
            if (!wc.j(127)) {
              var6 = param1 ? 1 : 0;
              bm.a(var6 != 0, -4, 126, sp.field_g);
            } else {
              rj.a(-4, (byte) -37, af.field_a);
            }
          }
        } else {
          if (41 != var6) {
            if (var6 != 46) {
              if (var6 == 45) {
                if (this.field_g.c(-85)) {
                  this.b((byte) 69);
                  tg.a((byte) 25, false);
                  var6 = param1 ? 1 : 0;
                  bm.a(var6 != 0, -7, 125, sp.field_g);
                  vd.field_d = this.field_d;
                }
              } else {
                if (var6 != 1) {
                  if (5 == var6) {
                    if (this.field_g.c(-85)) {
                      var6 = param1 ? 1 : 0;
                      bm.a(var6 != 0, 1, 126, sp.field_g);
                    }
                  } else {
                    if (var6 != 16) {
                      if (var6 == 14) {
                        if (this.field_g.c(-85)) {
                          var6 = param1 ? 1 : 0;
                          bm.a(var6 != 0, 5, 127, sp.field_g);
                          vd.field_d = this.field_d;
                        }
                      } else {
                        if (var6 != 44) {
                          if (3 == var6) {
                            if (this.field_g.c(-85)) {
                              ((ol) (mj.field_Hb[4])).e(113);
                              var6 = param1 ? 1 : 0;
                              bm.a(var6 != 0, 4, 125, sp.field_g);
                              vd.field_d = this.field_d;
                            }
                          } else {
                            if (6 == var6) {
                              if (this.field_g.c(-85)) {
                                var6 = vd.field_d;
                                var7 = param1 ? 1 : 0;
                                bm.a(var7 != 0, var6, 126, sp.field_g);
                              }
                            } else {
                              if (2 == var6) {
                                if (this.field_g.c(-85)) {
                                  var6 = param1 ? 1 : 0;
                                  bm.a(var6 != 0, 3, 126, sp.field_g);
                                }
                              } else {
                                if (12 == var6) {
                                  var5 = db.field_c;
                                  if (this.field_g.g(8)) {
                                    tj.a(3273, 0);
                                  }
                                  if (this.field_g.f(-23954)) {
                                    tj.a(3273, 224);
                                  }
                                  if (this.field_g.b(false)) {
                                    var6 = ok.field_l + 137;
                                    var7 = 8 + (-var6 + this.a((byte) -118, param2) + this.d(-110, param2) >> 1) + ok.field_l;
                                    var8 = -var7 + bd.field_g << 1;
                                    var8 = var8 * 224 >> 8;
                                    if (0 >= var8) {
                                      tj.a(3273, 0);
                                    } else {
                                      if (var8 >= 224) {
                                        tj.a(3273, 224);
                                      } else {
                                        tj.a(3273, var8);
                                      }
                                    }
                                  }
                                  if (this.field_g.e(96)) {
                                    if (db.field_c > 28) {
                                      var6 = db.field_c % 28;
                                      if (var6 == 0) {
                                        var6 = 28;
                                      }
                                      tj.a(3273, -var6 + db.field_c);
                                    } else {
                                      tj.a(3273, 0);
                                    }
                                  }
                                  if (this.field_g.a(97)) {
                                    if (db.field_c < 196) {
                                      var6 = db.field_c % 28;
                                      tj.a(3273, -var6 + (db.field_c + 28));
                                    } else {
                                      tj.a(3273, 224);
                                    }
                                  }
                                  if (var5 != db.field_c && (jq.field_d == null ||
                                    jq.field_d.k())) {
                                    jq.field_d = nm.b(-128, 47);
                                  }
                                } else {
                                  if (var6 == 13) {
                                    if (this.field_g.g(127)) {
                                      ff.a(0, -127);
                                    }
                                    if (this.field_g.f(-23954)) {
                                      ff.a(200, 92);
                                    }
                                    if (this.field_g.b(false)) {
                                      var6 = 137 + ok.field_l;
                                      var7 = 8 + (this.a((byte) -118, param2) + this.d(-93, param2) - var6 >> 1) + ok.field_l;
                                      var8 = bd.field_g - var7 << 1;
                                      var8 = var8 * 200 >> 8;
                                      if (var8 <= 0) {
                                        ff.a(0, 61);
                                      } else {
                                        if (200 <= var8) {
                                          ff.a(200, 24);
                                        } else {
                                          ff.a(var8, 81);
                                        }
                                      }
                                    }
                                    if (this.field_g.e(96)) {
                                      var6 = uk.field_S;
                                      if (var6 <= 25) {
                                        ff.a(0, -88);
                                      } else {
                                        var7 = var6 % 25;
                                        if (var7 == 0) {
                                          var7 = 25;
                                        }
                                        ff.a(var6 - var7, -103);
                                      }
                                    }
                                    if (this.field_g.a(97)) {
                                      var6 = uk.field_S;
                                      if (var6 >= 175) {
                                        ff.a(200, -118);
                                      } else {
                                        var7 = var6 % 25;
                                        ff.a(-var7 + var6 + 25, -89);
                                      }
                                    }
                                  } else {
                                    if (var6 == 4) {
                                      if (this.field_g.c(-85)) {
                                        if (rn.field_f != null) {
                                          rn.a(-69);
                                        } else {
                                          var6 = param1 ? 1 : 0;
                                          bd.field_f = false;
                                          lp.a((byte) -60, var6 != 0);
                                        }
                                      }
                                    } else {
                                      switch (var6) {
                                        case 49:
                                          if (this.field_g.c(-85)) {
                                            mj.field_Hb[pl.field_I].field_j[param2] = 48;
                                            sd.field_F = 1;
                                          }
                                          break;
                                        case 18:
                                          if (this.field_g.c(-85) &&
                                            this.c(param2, 16777215)) {
                                            ((ol) (mj.field_Hb[4])).b(1, param1);
                                          }
                                          break;
                                        case 11:
                                          if (this.field_g.c(-85)) {
                                            if (rn.field_f != null) {
                                              rn.a(-128);
                                            }
                                            cq.a(jl.b(0), false);
                                          }
                                          break;
                                        case 50:
                                          if (this.field_g.a((byte) -106)) {
                                            ll.field_k.field_k = ll.field_k.field_k - 1;
                                          }
                                          if (this.field_g.b((byte) -66)) {
                                            ll.field_k.field_k = ll.field_k.field_k + 1;
                                          }
                                          if (0 > ll.field_k.field_k) {
                                            ll.field_k.field_k = 2;
                                          }
                                          if (2 < ll.field_k.field_k) {
                                            ll.field_k.field_k = 0;
                                          }
                                          break;
                                        case 34:
                                          if (this.field_g.c(-85)) {
                                            oq.c((byte) 127);
                                            we.field_g[34] = df.a(-128);
                                            ll.field_k.field_i = ll.field_k.field_i ^ 2;
                                            th.b((byte) -61);
                                          }
                                          break;
                                        case 47:
                                          if (this.field_g.c(-85)) {
                                            ll.field_k.e(-110);
                                            th.b((byte) -61);
                                          }
                                          break;
                                        default:
                                          if (35 != var6 &&
                                            var6 != 36 &&
                                            var6 != 38) {
                                            break;
                                          }
                                          if (this.field_g.c(-85)) {
                                            this.b((byte) 69);
                                            this.a(param1, 200);
                                          }
                                          break;
                                        case 17:
                                          if (this.field_g.c(-85) &&
                                            this.c(param2, 16777215)) {
                                            ((ol) (mj.field_Hb[4])).a(param1, (byte) -119);
                                          }
                                          break;
                                        case 15:
                                          if (this.field_g.c(-85)) {
                                            if (this.field_d != 5 &&
                                              this.field_d != 3) {
                                              if (this.field_d != 7) {
                                                break;
                                              }
                                              rj.a(6, (byte) 125, af.field_a);
                                              break;
                                            }
                                            rj.a(this.field_d, (byte) 101, af.field_a);
                                          }
                                          break;
                                        case 48:
                                          if (this.field_g.c(-85)) {
                                            mj.field_Hb[pl.field_I].field_j[param2] = 49;
                                            sd.field_F = 0;
                                          }
                                          break;
                                        case 7:
                                          if (this.field_g.c(-85)) {
                                            if (2 == this.field_d) {
                                            }
                                            this.a(param1, 200);
                                          }
                                          break;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (this.field_g.c(-85)) {
                            mj.field_Hb[15].a(0, param1, 0);
                            var6 = param1 ? 1 : 0;
                            bm.a(var6 != 0, 15, 126, sp.field_g);
                            vd.field_d = this.field_d;
                          }
                        }
                      }
                    } else {
                      if (this.field_g.c(-85)) {
                        var6 = 1;
                        var7 = var6;
                        var8 = param1 ? 1 : 0;
                        bm.a(var8 != 0, var7, 126, sp.field_g);
                        var14 = k.field_n;
                        for (var8 = 0; var8 < 8; var8++) {
                          var14[var8] = 0;
                        }
                        var15 = fc.field_m;
                        for (var8 = 0; var8 < 8; var8++) {
                          var15[var8] = 0;
                        }
                      }
                    }
                  }
                } else {
                  if (this.field_g.c(-85)) {
                    var6 = param1 ? 1 : 0;
                    bm.a(var6 != 0, -7, 127, sp.field_g);
                    vd.field_d = 1;
                  }
                }
              }
            } else {
              if (this.field_g.c(-85)) {
                tg.a((byte) 27, true);
                var6 = param1 ? 1 : 0;
                bm.a(var6 != 0, -7, 127, sp.field_g);
                vd.field_d = this.field_d;
              }
            }
          } else {
            if (this.field_g.c(-85)) {
              var6 = param1 ? 1 : 0;
              bm.a(var6 != 0, 14, 127, sp.field_g);
              vd.field_d = this.field_d;
            }
          }
        }
        if (param0 >= -64) {
          this.a(-94);
        }
    }

    private final void b(int param0, int param1) {
        if (param0 != 12) {
          this.field_a = 104;
        }
        if (param1 < 0) {
          return;
        }
        if (this.field_j.length <= param1) {
          return;
        }
        param1 = this.field_j[param1];
        if (param1 >= 0 &&
          12 != param1 &&
          param1 != 13 && this.field_g.c(-85)) {
          ib.a((byte) 112, ei.field_a[68]);
        }
    }

    int d(int param0, int param1) {
        if (param0 > -65) {
          ug var4 = (ug) null;
          nc.a(true, -108, -32, (ug) null);
        }
        if (!this.field_f) {
          return this.a((byte) -118, param1) + this.field_k;
        }
        return this.field_a;
    }

    final static void a(int param0, boolean param1) {
        tm.a(param1, false);
        br.a(param1, 2);
        int var2 = 31 % ((param0 + 57) / 56);
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        for (var4 = 0; var4 < this.field_j.length; var4++) {
          var5 = this.a(var4, 23697);
          if (this.c(var4, 16777215) &&
            this.a((byte) -118, var4) <= param2 &&
            this.d(param0 ^ 5912, var4) > param2 &&
            var5 <= param1 &&
            param1 < var5 + this.b((byte) 68, var4)) {
            return var4;
          }
        }
        if (param0 != -6003) {
          this.a(13);
        }
        return -1;
    }

    private final int b(byte param0, int param1) {
        if (~param1 == ~param1) {
        }
        if (param0 != 68) {
          this.a(-84, -17, true);
        }
        return 38;
    }

    void a(boolean param0) {
        int stackIn_23_1 = 0;
        boolean stackIn_24_2 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_d == -7) {
          wp.field_h.b(true, 1);
          return;
        }
        if (this.field_d == 11) {
          return;
        }
        if (this.field_d != 7) {
          if (this.field_d == 8) {
            ok.a(true);
            return;
          }
          if (2 == this.field_d) {
            wp.field_h.b(true, 1);
            oo.f(0, 0, 640, 480);
            nn.a(!param0);
          }
        } else {
          nn.a(false);
          var2 = 100 + ah.field_e.field_C;
          var3 = 4 + ah.field_e.field_r + ah.field_e.field_J;
          var4 = 16777215;
          pb.field_e.b(af.field_a, 320, var2, var4, -1);
          pb.field_e.b(jm.a(vh.field_Mb, false, 118, gg.field_k), 320, var3 + var2, var4, -1);
          pb.field_e.b(on.a(true, gg.field_k, vh.field_Mb, false), 320, var2 + (3 * var3 + 38), var4, -1);
          pb.field_e.b(op.a(vh.field_Mb, gg.field_k, 4, false), 320, 76 + (var2 + var3 * 4), var4, -1);
        }
        if (!param0) {
          this.a(-45);
        }
        var6 = 0;
        var2Lifetime1 = var6;
        while (var6 < this.field_g.field_c) {
          if (this.c(var6, 16777215) ||
            this.field_j[var6] == 21) {
            stackIn_23_1 = var6;
            stackIn_24_2 = (var6 == this.field_g.field_d);
            this.a(stackIn_23_1, stackIn_24_2, (byte) -81);
          }
          var6++;
        }
        return;
    }

    void c(boolean param0) {
        if (param0) {
          this.field_d = 39;
        }
        if (this.field_f) {
          this.field_g.d(99);
        } else {
          this.field_g.a(0, false);
        }
        if (!(0 <= this.field_g.field_d)) {
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int var6 = 0;
        int var4 = 2 * param1;
        int var5 = param1 < 128 ? 0 : -256 + 2 * param1;
        int var6Lifetime1;
        if (param2) {
          var6 = var4;
          var4 = var5;
          var5 = var6;
        }
        var6Lifetime1 = this.field_d;
        if (param0 > -104) {
          this.b(81);
        }
        if (var6Lifetime1 == 2) {
          var6Lifetime1 = -7;
        }
        if (-2 == var6Lifetime1) {
          var6Lifetime1 = 2;
        }
        fn.field_e.a();
        if (11 == var6Lifetime1) {
          var6Lifetime1 = 1;
        }
        if (var6Lifetime1 != -7) {
          mj.field_Hb[var6Lifetime1].b(0);
        } else {
          wp.field_h.b(true, 1);
          oo.f(0, 0, 640, 480);
          fn.field_e.h();
        }
        dl.field_h.b((byte) 99);
        fn.field_e.a(0, 0, var4, var5);
    }

    void b(byte param0) {
        if (param0 != 69) {
          this.field_k = 57;
        }
    }

    int a(int param0, int param1) {
        if (param1 != 23697) {
          ug var4 = (ug) null;
          nc.a(true, 65, 23, (ug) null);
        }
        if (this.field_f) {
          return this.field_b + param0 * this.field_k;
        }
        return this.field_b;
    }

    void a(int param0, boolean param1, int param2) {
        if (~this.field_g.field_d != param0) {
          param2 = this.field_g.field_d;
        }
        this.field_g.a(param2, param1, -31458, this.a(param0 - 6003, bo.field_d, bd.field_g));
        if (this.field_d == 8) {
          fc.a((byte) 124, param1);
        }
    }

    final static void a(boolean param0, int param1, int param2, ug param3) {
        int var4_int = 0;
        Object var5 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (ra.field_m != null) {
            fq.a(param0, 1048576, param3, 124, param1);
          }
          var4_int = -64 % ((param2 - 42) / 38);
          if (wd.field_L != null) {
            var5 = rm.field_b;
            synchronized (var5) {
              wd.field_L.a(param1, -1, false);
              if (param3 == bb.field_g) {
                return;
              }
              wd.field_L.g(2);
              rm.field_b.e();
              bb.field_g = param3;
              if (bb.field_g != null) {
                wd.field_L.a(bb.field_g, param0, 8361407);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("nc.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    void a(int param0) {
        boolean stackIn_8_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        qd stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        boolean stackIn_25_2 = false;
        int stackIn_65_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = this.field_g.field_d;
        if (this.field_d == 11) {
          return;
        }
        if (this.field_d != -7 &&
          2 != this.field_d) {
          if (this.field_d == 8) {
            stackIn_8_0 = !(cq.a(15000));
            var3 = ai.a(stackIn_8_0, (byte) 110);
            if (var3 == 3) {
              if (rn.field_f != null) {
                rn.a(-36);
              }
              uq.a(param0 + 3, jl.b(0));
            }
            if (var3 == 1) {
              stackIn_16_0 = (ec.field_c) ? 15 : 1;
              var4 = stackIn_16_0;
              bm.a(false, var4, param0 ^ 127, sp.field_g);
            }
            if (var3 != 2) {
              return;
            }
            stackIn_21_0 = (!ec.field_c) ? 1 : 15;
            var4Lifetime1 = stackIn_21_0;
            bm.a(true, var4Lifetime1, 126, sp.field_g);
            return;
          }
        } else {
          stackIn_24_0 = wp.field_h;
          stackIn_24_1 = 122;
          stackIn_25_2 = (this.field_d != 2);
          ((qd) (Object) stackIn_24_0).a((byte) stackIn_24_1, stackIn_25_2);
          if (-7 == this.field_d) {
            return;
          }
        }
        while (ba.c(-1)) {
          if (am.a(param0 ^ -118)) {
            if (iq.field_f) {
              if (re.field_b &&
                hh.field_b) {
                if (va.a((byte) -59, 13, 15, 12)) {
                  continue;
                }
              } else {
                if (w.a(13, 15, 12, 18663)) {
                  continue;
                }
              }
              if (13 != sj.field_p &&
                sj.field_p != 80) {
                continue;
              }
              iq.field_f = false;
              continue;
            }
            if (sj.field_p == 80) {
              iq.field_f = true;
              continue;
            }
          }
          if (sj.field_p != 13) {
            this.c(false);
            if (-1 == this.field_g.field_d) {
              continue;
            }
            this.b(param0 + 12, this.field_g.field_d);
            this.b(-96, false, this.field_g.field_d);
            continue;
          }
          if (this.field_d == 2) {
            bm.a(false, -7, param0 ^ 126, sp.field_g);
            vd.field_d = 1;
            continue;
          }
          if (this.field_d == 10) {
            continue;
          }
          if (this.field_d == 7) {
            continue;
          }
          if (this.field_d == 1) {
            continue;
          }
          if (this.field_d == 15) {
            bm.a(false, 1, param0 ^ 125, sp.field_g);
            continue;
          }
          var3Lifetime1 = vd.field_d;
          bm.a(false, var3Lifetime1, param0 + 125, sp.field_g);
        }
        var3Lifetime2 = 1;
        if (am.a(param0 ^ -112) &&
          fb.field_e != null &&
          !df.field_I) {
          stackIn_65_0 = (fb.field_e.a(true, 15978)) ? 0 : 1;
          var3Lifetime2 = stackIn_65_0;
          if (re.field_b) {
            w.a(320, 180, true, 81);
          }
        }
        if (param0 != ~this.a(-6003, bo.field_d, bd.field_g)) {
          en.a(-1, 1);
        } else {
          en.a(-1, 4);
        }
        if (var3Lifetime2 != 0) {
          this.field_g.a(this.a(-6003, bo.field_d, bd.field_g), 42, this.a(-6003, ka.field_t, vb.field_f));
          if (this.field_g.field_d != -1) {
            this.b(12, this.field_g.field_d);
            this.b(-74, true, this.field_g.field_d);
          }
          if (this.field_g.field_d != var2 &&
            this.field_g.field_d != -1) {
            nm.b(-128, 69);
          }
        }
    }

    private final void a(int param0, boolean param1, byte param2) {
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        int var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String var12_ref_String;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        String var18;
        String var7Lifetime1;
        String var7Lifetime2;
        String var12_ref_StringLifetime1;
        String var12_ref_StringLifetime2;
        String var12_ref_StringLifetime1Lifetime1;
        var17 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = this.a(param0, 23697);
        var5 = this.a((byte) -118, param0);
        var6 = this.field_j[param0];
        if (var6 == 22) {
          return;
        }
        if (var6 != 23 &&
          var6 != 24 &&
          var6 != 25 &&
          var6 != 27 &&
          var6 != 28 &&
          var6 != 29 &&
          var6 != 30 &&
          var6 != 31 &&
          32 != var6 &&
          var6 != 33 &&
          var6 != 26) {
          var18 = we.field_g[var6];
          var7 = var18;
          var12_ref_String = var7;
          var7Lifetime1 = var18;
          var7Lifetime2 = var18;
          var8 = -var5 + this.d(-69, param0);
          var9 = this.b((byte) 68, param0);
          stackIn_17_0 = (param1) ? 1 : 10;
          var10 = stackIn_17_0;
          if (4 == var6 &&
            rn.field_f == null && (!(0 < vl.field_h) ||
            !pn.a(-9, pl.field_J))) {
            stackIn_25_0 = (param1) ? 7 : 6;
            var10 = stackIn_25_0;
          }
          if (var6 == 40 &&
            wc.j(127)) {
            stackIn_31_0 = (!param1) ? 6 : 7;
            var10 = stackIn_31_0;
          }
          if (null != fb.field_e) {
            stackIn_35_0 = fb.field_e.g(-127);
          } else {
            stackIn_35_0 = 0;
          }
          var11 = stackIn_35_0;
          if (var7Lifetime2 != null) {
            if (var6 == 20) {
              var7Lifetime2 = vl.a(var18, new String[]{Integer.toString(var11)}, 2);
              var12_ref_StringLifetime1 = var7Lifetime2;
              var12_ref_StringLifetime1Lifetime1 = var7Lifetime2;
            } else {
              if (var6 == 21) {
                var7Lifetime2 = vl.a(var18, new String[]{Integer.toString(var11)}, 2);
                if (var11 == 0) {
                  var10 = 6;
                }
              }
            }
          } else {
            var7Lifetime2 = "ERROR: missing text";
          }
          if (var6 == 50) {
            if (ll.field_k.field_k != 1) {
              if (ll.field_k.field_k == 0) {
                var12_ref_StringLifetime2 = jm.field_l;
              } else {
                var12_ref_StringLifetime2 = jp.field_a;
              }
            } else {
              var12_ref_StringLifetime2 = da.field_f;
            }
            var7Lifetime2 = var7Lifetime2 + var12_ref_StringLifetime2;
          }
          if (param2 > -32) {
            this.field_f = false;
          }
          var12 = -ah.field_e.field_r + (-ZombieDawnMulti.field_I[0].field_u + var9) + (-ZombieDawnMulti.field_I[6].field_u - ah.field_e.field_C);
          if (var6 != 12 &&
            13 != var6) {
            ah.field_e.b(var7Lifetime2, var5 + (var8 >> 1), ZombieDawnMulti.field_I[0].field_u + var4 + ah.field_e.field_C + (var12 >> 1), var10, 0);
            return;
          }
          stackIn_59_0 = (var6 != 12) ? 200 : 224;
          var13 = stackIn_59_0;
          var14 = 137 + ok.field_l;
          var15 = var5 + (-var14 + var8 >> 1);
          ah.field_e.c(var7Lifetime2, var15, (var12 >> 1) + ah.field_e.field_C + var4 + ZombieDawnMulti.field_I[0].field_u, var10, 0);
          var15 = var15 + (8 + ok.field_l);
          oo.a(var15, var9 / 2 + var4 - 1, 129, 2, var10);
          if (12 != var6) {
            stackIn_62_0 = uk.field_S;
          } else {
            stackIn_62_0 = db.field_c;
          }
          var16 = stackIn_62_0;
          var16 = (var16 << 8) / var13;
          lm.field_eb.g((var16 >> 1) + (var15 - 1), var4);
          return;
        }
    }

    nc(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
          this.field_k = param5;
          this.field_d = param0;
          this.field_a = param3;
          this.field_j = param6;
          this.field_f = param1 ? true : false;
          this.field_b = param4;
          this.field_i = param2;
          this.field_g = new hh(this.field_j.length);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "nc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Send private message";
    }
}
